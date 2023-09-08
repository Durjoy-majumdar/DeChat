package com.tencent.midas.download;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.midas.comm.APLog;
import com.tencent.midas.comm.APMidasRSATools;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.xweb.file.XVFSFile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class APMidasPluginDownloadUtils {
    private static final String TAG = "PDUtils";

    public static boolean checkIniFileExist(File file) {
        if (file != null && file.isDirectory()) {
            return new File(file, "MidasSign.ini").exists();
        }
        return false;
    }

    private static JSONArray getPureH5UpdateJsAlertData(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("midassdk://") && str.length() > 11) {
            try {
                JSONObject jSONObject = new JSONObject(str.substring(11, str.length()));
                if (jSONObject.has("action") && "update".equalsIgnoreCase(jSONObject.getString("action")) && jSONObject.has("data") && !TextUtils.isEmpty(jSONObject.getString("data"))) {
                    return jSONObject.getJSONArray("data");
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static boolean handlePureH5UpdateJsAlertLogic(final Context context, String str) {
        if (context == null) {
            APLog.m161210d(TAG, "Cannot handle h5 update logic! Null context!");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            APLog.m161210d(TAG, "Cannot handle h5 update logic! Empty alert message!");
            return false;
        } else {
            boolean isPureH5UpdateJsAlert = isPureH5UpdateJsAlert(str);
            JSONArray pureH5UpdateJsAlertData = getPureH5UpdateJsAlertData(str);
            if (pureH5UpdateJsAlertData == null) {
                APLog.m161210d(TAG, "Cannot handle h5 update logic! Not relevant message!");
                return isPureH5UpdateJsAlert;
            }
            APLog.m161210d(TAG, "Got h5 update alert message!");
            final ArrayList<APMidasPluginDownInfo> parseDownJson = parseDownJson(pureH5UpdateJsAlertData);
            if (parseDownJson == null) {
                APLog.m161210d(TAG, "Got h5 update alert message! Cannot parse json to list!");
                return isPureH5UpdateJsAlert;
            } else if (parseDownJson.size() <= 0) {
                APLog.m161210d(TAG, "Got h5 update alert message! Cannot parse json to list! Size error = " + parseDownJson.size());
                return isPureH5UpdateJsAlert;
            } else {
                APLog.m161210d(TAG, "Got h5 update alert message! Start down lists = " + parseDownJson.toString());
                APMidasPluginDownloadManager.startDownload(context, parseDownJson, new IAPMidasPluginDownListener() {
                    public void onDownloadFail(int i) {
                    }

                    public void onDownloadSuccess() {
                        APLog.m161210d(APMidasPluginDownloadUtils.TAG, "Got h5 update alert message! List download success!");
                        APMidasPluginDownloadUtils.writeMidasSignFile(context, parseDownJson);
                    }
                });
                return isPureH5UpdateJsAlert;
            }
        }
    }

    private static boolean isPureH5UpdateJsAlert(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("midassdk://") && str.length() > 11) {
            try {
                JSONObject jSONObject = new JSONObject(str.substring(11, str.length()));
                if (jSONObject.has("action") && "update".equalsIgnoreCase(jSONObject.getString("action"))) {
                    APLog.m161210d(TAG, "isPureH5UpdateJsAlert msg = " + str);
                    APLog.m161210d(TAG, "isPureH5UpdateJsAlert == true!");
                    return true;
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    private static ArrayList<APMidasPluginDownInfo> parseDownJson(JSONArray jSONArray) {
        if (jSONArray == null) {
            APLog.m161212e(TAG, "Cannot parse down json! jsonArray is null!");
            return null;
        }
        try {
            int length = jSONArray.length();
            if (length == 0) {
                APLog.m161212e(TAG, "Cannot parse down json! jsonArray length is 0!");
                return null;
            }
            ArrayList<APMidasPluginDownInfo> arrayList = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                APMidasPluginDownInfo aPMidasPluginDownInfo = new APMidasPluginDownInfo();
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                String string = jSONObject.getString("file_name");
                aPMidasPluginDownInfo.name = string;
                if (TextUtils.isEmpty(string)) {
                    APLog.m161212e(TAG, "Cannot parse down json! item's name is empty!");
                    return null;
                }
                String string2 = jSONObject.getString("update_md5");
                aPMidasPluginDownInfo.new_md5_encode = string2;
                if (TextUtils.isEmpty(string2)) {
                    APLog.m161212e(TAG, "Cannot parse down json! item's new encode md5 is empty!");
                    return null;
                }
                try {
                    String deCodeKey = new APMidasRSATools().deCodeKey(aPMidasPluginDownInfo.new_md5_encode);
                    aPMidasPluginDownInfo.new_md5_decode = deCodeKey.substring(deCodeKey.length() - 32);
                    APLog.m161210d(TAG, "Parse down json! name = " + aPMidasPluginDownInfo.name + " decode md5 success!");
                } catch (Exception e) {
                    APLog.m161212e(TAG, "Cannot parse down json, decode md5 got exception = " + e);
                }
                if (TextUtils.isEmpty(aPMidasPluginDownInfo.new_md5_decode)) {
                    APLog.m161212e(TAG, "Cannot parse down json! item's new decode md5 is empty!");
                    return null;
                }
                String string3 = jSONObject.getString("full_download_url");
                aPMidasPluginDownInfo.full_url = string3;
                if (TextUtils.isEmpty(string3)) {
                    APLog.m161212e(TAG, "Cannot parse down json! item's full url is empty!");
                    return null;
                }
                arrayList.add(aPMidasPluginDownInfo);
            }
            return arrayList;
        } catch (Exception e2) {
            APLog.m161212e(TAG, "Cannot parse down json! exception = " + e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void writeMidasSignFile(Context context, ArrayList<APMidasPluginDownInfo> arrayList) {
        if (context == null) {
            APLog.m161212e(TAG, "Cannot write MidasSign.ini! null context!");
        } else if (arrayList == null) {
            APLog.m161212e(TAG, "Cannot write MidasSign.ini! null list!");
        } else if (arrayList.size() <= 0) {
            APLog.m161212e(TAG, "Cannot write MidasSign.ini! list size error = " + arrayList.size());
        } else {
            File file = new File(context.getApplicationContext().getDir("midaspluginsTemp", 0), "MidasSign.ini");
            if (!file.exists() || file.delete()) {
                StringBuilder sb = new StringBuilder();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = arrayList.get(i).name;
                    if (TextUtils.isEmpty(str)) {
                        APLog.m161212e(TAG, "Cannot write MidasSign.ini! item name empty!");
                        return;
                    }
                    if (!str.endsWith(".apk")) {
                        str = str + ".apk";
                    }
                    String str2 = arrayList.get(i).new_md5_encode;
                    if (TextUtils.isEmpty(str2)) {
                        APLog.m161212e(TAG, "Cannot write MidasSign.ini! item md5 empty!");
                        return;
                    }
                    sb.append(str + XVFSFile.PATH_SEPARATOR + str2);
                    sb.append(APLogFileUtil.SEPARATOR_LINE);
                }
                String sb4 = sb.toString();
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(sb4);
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (Exception e) {
                    APLog.m161212e(TAG, "Write MidasSign.ini got exception = " + e);
                }
                APLog.m161210d(TAG, "Write MidasSign.ini success!");
                return;
            }
            APLog.m161212e(TAG, "Cannot delete old MidasSign.ini file!");
        }
    }
}
