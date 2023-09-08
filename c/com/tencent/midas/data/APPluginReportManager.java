package com.tencent.midas.data;

import android.text.TextUtils;
import com.pay.http.APBaseHttpAns;
import com.pay.http.APNetworkManager;
import com.pay.http.IAPHttpAnsObserver;
import com.pay.tool.APMidasTools;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.comm.APLog;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class APPluginReportManager {
    public static final String MIDASPLUGIN_ENTER_ABILITY = "sdk.plugin.enter.ability";
    public static final String MIDASPLUGIN_FORMAT_APKLOAD_ERROR = "sdk.loadapk_error";
    public static final String MIDASPLUGIN_FORMAT_APKLOAD_FAIL = "sdk.loadapk_fail";
    public static final String MIDASPLUGIN_FORMAT_TIME = "sdk.plugin.time";
    public static final String MIDASPLUGIN_LAUNCH_PURE_H5_ERROR_REASON = "sdk.plugin.pureH5.error.reason";
    public static final String MIDASPLUGIN_NAME_LAUNCH_ERROR = "sdk.plugin.launch.error";
    public static final String MIDASPLUGIN_TIMENAME_GET_FILELIST_FROM_ASSETS = "sdk.plugin.init.getFileListFromAssets.time";
    public static final String MIDASPLUGIN_TIMENAME_INIT = "timename.init";
    public static final String MIDASPLUGIN_TIMENAME_INIT_KERNEL = "sdk.plugin.init.kernel.totaltime";
    public static final String MIDASPLUGIN_TIMENAME_INIT_TOTALTIME = "sdk.plugin.init.totaltime";
    public static final String MIDASPLUGIN_TIMENAME_INSTALL_FROM_ASSETS = "sdk.plugin.init.installFromAssets.time";
    public static final String MIDASPLUGIN_TIMENAME_INSTALL_FROM_LOCAL = "sdk.plugin.init.installFromLocal.time";
    public static final String MIDASPLUGIN_TIMENAME_IS_NEED_ASSETS_UPDATE = "sdk.plugin.init.isNeedAssetsUpdate.time";
    public static final String MIDASPLUGIN_TIMENAME_IS_NEED_LOCAL_UPDATE = "sdk.plugin.init.isNeedLocalUpdate.time";
    public static final String MIDASPLUGIN_TIMENAME_LAUNCHABILITY = "timename.launchability";
    public static final String MIDASPLUGIN_TIMENAME_LAUNCHINFO = "timename.launchinfo";
    public static final String MIDASPLUGIN_TIMENAME_LAUNCHNET = "timename.launchnet";
    public static final String MIDASPLUGIN_TIMENAME_LAUNCHPAY = "timename.launchpay";
    public static final String MIDASPLUGIN_TIMENAME_LAUNCHPAY_WAIT_INIT = "sdk.plugin.launchPay.wait.init.time";
    public static final String MIDASPLUGIN_TIMENAME_LAUNCHWEB = "timename.launchweb";
    public static final String MIDASPLUGIN_TIMENAME_LOAD_DEX = "sdk.plugin.init.loadDex.time";
    public static final String MIDASPLUGIN_TIMENAME_PLUGIN_VALID = "sdk.plugin.init.pluginvalid.time";
    public static final String MIDASPLUGIN_TIMENAME_READ_FILE_FROM_ASSETS = "sdk.plugin.init.readFileFromAssets.time";
    public static final String MIDASPLUGIN_TIMENAME_UNZIP_SO = "sdk.plugin.init.unzip.so.time";
    public static final String MIDASPLUGIN_TIMENAME_WRITE_FILE_TO_DATA = "sdk.plugin.init.writeFileToData.time";
    public static final String MIDASPLUGIN_WEBPAGE_BACK = "sdk.plugin.webpage.back";
    public static final String MIDASPLUGIN_WEBPAGE_CLOSE = "sdk.plugin.webpage.close";
    public static final String MIDASPLUGIN_WEBPAGE_HEAD_INIT = "sdk.plugin.webpage.head.init";
    public static final String MIDASPLUGIN_WEBPAGE_INIT = "sdk.plugin.webpage.init";
    public static final String MIDASPLUGIN_WEBPAGE_KEYBACK = "sdk.plugin.webpage.keyback";
    public static final String MIDASPLUGIN_WEBPAGE_REFRESH = "sdk.plugin.webpage.refresh";
    public static final String MIDASPLUGIN_WEBPAGE_SYSTEM = "sdk.plugin.webpage.system";
    public static final String MIDASPLUGIN_WEBPAGE_WEBCLOSE = "sdk.plugin.webpage.webclose";
    public static final String MIDASPLUGIN_WEBPAGE_X5 = "sdk.plugin.webpage.x5";
    public static final String MIDASPLUGIN_WEBPAGE_X5_BACK = "sdk.plugin.webpage.x5.back";
    public static final String MIDASPLUGIN_WEBPAGE_X5_CLOSE = "sdk.plugin.webpage.x5.close";
    public static final String MIDASPLUGIN_WEBPAGE_X5_HEAD_INIT = "sdk.plugin.webpage.x5.head.init";
    public static final String MIDASPLUGIN_WEBPAGE_X5_KEYBACK = "sdk.plugin.webpage.x5.keyback";
    public static final String MIDASPLUGIN_WEBPAGE_X5_REFRESH = "sdk.plugin.webpage.x5.refresh";
    public static final String MIDASPLUGIN_X5_INIT = "sdk.plugin.x5.init";
    public static final String MIDASPLUGIN_X5_INIT_FAIL = "sdk.plugin.x5.init.fail";
    public static final String MIDASPLUGIN_X5_INIT_SUCCESS = "sdk.plugin.x5.init.success";
    private static APPluginReportManager gInstance;
    public ArrayList<APClickStreamParams> initDataReport;
    public ArrayList<APClickStreamParams> payDataReport;

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static APPluginReportManager instance = new APPluginReportManager();

        private SingletonHolder() {
        }
    }

    private String constructTimeReport(String str, long j) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("name=");
        stringBuffer.append(str);
        stringBuffer.append("&");
        stringBuffer.append("times=");
        stringBuffer.append(j);
        stringBuffer.append("&");
        return stringBuffer.toString();
    }

    private String getAllReportRecord(ArrayList<APClickStreamParams> arrayList) {
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i++;
            stringBuffer.append("record" + i2 + "=");
            stringBuffer.append(reportParams2Str(arrayList.get(i2)));
            stringBuffer.append("&");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("num=");
        stringBuffer2.append(i);
        stringBuffer2.append("&");
        stringBuffer2.append(stringBuffer.toString());
        stringBuffer.setLength(0);
        return stringBuffer2.toString();
    }

    public static APPluginReportManager getInstance() {
        return SingletonHolder.instance;
    }

    public static void initDataRelease() {
        try {
            if (getInstance() != null) {
                getInstance().initDataReport.clear();
            }
        } catch (Exception unused) {
        }
    }

    private void insertOneRecord(String str, String str2, String str3, String str4) {
        APClickStreamParams aPClickStreamParams = new APClickStreamParams();
        aPClickStreamParams.device = "android_v" + APMidasPayAPI.getMidasPluginVersion();
        aPClickStreamParams.openid = APPluginDataInterface.singleton().getOpenId();
        aPClickStreamParams.format = str2;
        aPClickStreamParams.from = str3;
        aPClickStreamParams.offerid = APPluginDataInterface.singleton().getOfferId();
        aPClickStreamParams.f343436pf = APPluginDataInterface.singleton().getPf();
        aPClickStreamParams.SessionId = APPluginDataInterface.singleton().getSessionId();
        aPClickStreamParams.SessionType = APPluginDataInterface.singleton().getSessionType();
        if (!TextUtils.isEmpty(str4)) {
            aPClickStreamParams.extend = APMidasTools.urlEncode(str4, 3);
        }
        int saveType = APPluginDataInterface.singleton().getSaveType();
        if (saveType == 0) {
            aPClickStreamParams.savetype = "game";
        } else if (saveType == 1) {
            aPClickStreamParams.savetype = "goods";
        } else if (saveType == 2 || saveType == 3) {
            aPClickStreamParams.savetype = "acct";
        } else if (saveType == 4) {
            aPClickStreamParams.savetype = "month";
        } else if (saveType != 5) {
            aPClickStreamParams.savetype = "game";
        } else {
            aPClickStreamParams.savetype = "subscribe";
        }
        aPClickStreamParams.currentTimeMillis = String.valueOf(System.currentTimeMillis());
        if (str.equals(APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
            APInitData.singleton();
            aPClickStreamParams.dataId = APInitData.getInitdataCount();
            aPClickStreamParams.VipFlags = APInitData.singleton().getInitGUID();
            this.initDataReport.add(aPClickStreamParams);
            return;
        }
        aPClickStreamParams.dataId = APDataId.getDataId();
        APMultiProcessData processData = APPluginDataInterface.singleton().getProcessData();
        if (processData != null) {
            aPClickStreamParams.VipFlags = processData.getGuid();
        }
        this.payDataReport.add(aPClickStreamParams);
    }

    private void invokeAPKReportManager(String str, int i, String str2, String str3, String str4, String str5) {
        Method method;
        Object obj;
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("com.pay.data.report.APDataReportManager");
            Method method2 = null;
            try {
                method = cls2.getDeclaredMethod("getInstance", new Class[0]);
            } catch (NoSuchMethodException e) {
                APLog.m161214i("APPluginReportManager", "invokeAPKReportManager error:" + e.toString());
                method = null;
            }
            try {
                obj = method.invoke((Object) null, new Object[0]);
            } catch (Exception e2) {
                APLog.m161214i("APPluginReportManager", "invokeAPKReportManager error:" + e2.toString());
                obj = null;
            }
            try {
                method2 = cls2.getMethod("insertData", new Class[]{cls, Integer.TYPE, cls, cls, cls, cls});
            } catch (NoSuchMethodException e3) {
                APLog.m161214i("APPluginReportManager", "invokeAPKReportManager error:" + e3.toString());
            }
            try {
                method2.invoke(obj, new Object[]{str, Integer.valueOf(i), str2, str3, str4, str5});
            } catch (Exception e4) {
                APLog.m161214i("APPluginReportManager", "invokeAPKReportManager error:" + e4.toString());
            }
        } catch (Exception e5) {
            APLog.m161214i("APPluginReportManager", "invokeAPKReportManager error:" + e5.toString());
        }
    }

    public static void payDataRelease() {
        try {
            if (getInstance() != null) {
                getInstance().payDataReport.clear();
            }
        } catch (Exception unused) {
        }
    }

    private StringBuffer reportParams2Str(APClickStreamParams aPClickStreamParams) {
        StringBuffer stringBuffer = new StringBuffer();
        if (aPClickStreamParams == null) {
            return stringBuffer;
        }
        stringBuffer.append("3=" + aPClickStreamParams.openid);
        stringBuffer.append("|7=0");
        stringBuffer.append("|13=" + aPClickStreamParams.dataId);
        stringBuffer.append("|24=" + aPClickStreamParams.offerid);
        if (!TextUtils.isEmpty(aPClickStreamParams.payid)) {
            stringBuffer.append("|4=" + aPClickStreamParams.payid);
        }
        if (!TextUtils.isEmpty(aPClickStreamParams.isBindQQ)) {
            stringBuffer.append("|55=" + aPClickStreamParams.isBindQQ);
        }
        stringBuffer.append("|21=" + aPClickStreamParams.format);
        stringBuffer.append("|26=" + aPClickStreamParams.f343436pf);
        if (!TextUtils.isEmpty(aPClickStreamParams.token)) {
            stringBuffer.append("|56=" + aPClickStreamParams.token);
        }
        APLog.m161214i("getLogRecord extend pre", aPClickStreamParams.extend);
        if (!TextUtils.isEmpty(aPClickStreamParams.extend)) {
            stringBuffer.append("|8=" + aPClickStreamParams.extend);
        }
        if (!TextUtils.isEmpty(aPClickStreamParams.from)) {
            stringBuffer.append("|20=" + aPClickStreamParams.from);
        }
        if (!TextUtils.isEmpty(aPClickStreamParams.savetype)) {
            stringBuffer.append("|47=" + aPClickStreamParams.savetype);
        }
        stringBuffer.append("|29=" + aPClickStreamParams.guid);
        stringBuffer.append("|31=" + aPClickStreamParams.device);
        stringBuffer.append("|38=" + aPClickStreamParams.currentTimeMillis);
        stringBuffer.append("|34=" + aPClickStreamParams.uinTypeFromSvr);
        stringBuffer.append("|35=" + aPClickStreamParams.uinFromSvr);
        stringBuffer.append("|37=" + aPClickStreamParams.SessionId);
        stringBuffer.append("|43=" + aPClickStreamParams.SessionType);
        if (!TextUtils.isEmpty(aPClickStreamParams.PayLevel)) {
            stringBuffer.append("|54=" + aPClickStreamParams.PayLevel);
        }
        if (!TextUtils.isEmpty(aPClickStreamParams.VipFlags)) {
            stringBuffer.append("|53=" + aPClickStreamParams.VipFlags);
        }
        return stringBuffer;
    }

    public synchronized void dataReport(String str) {
        String allReportRecord = str.equals(APMidasPluginInfo.LAUNCH_INTERFACE_INIT) ? getAllReportRecord(this.initDataReport) : getAllReportRecord(this.payDataReport);
        if (!TextUtils.isEmpty(allReportRecord)) {
            APNetworkManager.getInstance().dataReport(allReportRecord, new IAPHttpAnsObserver() {
                public void onError(APBaseHttpAns aPBaseHttpAns) {
                }

                public void onFinish(APBaseHttpAns aPBaseHttpAns) {
                }

                public void onStop(APBaseHttpAns aPBaseHttpAns) {
                }
            });
        }
    }

    public void initInterfaceInit(String str, APMidasBaseRequest aPMidasBaseRequest) {
        APInitData.init();
        APInitData.singleton().setInitGUID(APMidasTools.getUUID());
        APInitData.singleton().setInitInterfaceTime(System.currentTimeMillis());
        APPluginDataInterface.init();
        APPluginDataInterface.singleton().setLaunchInterface(str);
        APMidasAnalyzeParams.getInstance().AnalyzeParams(aPMidasBaseRequest);
    }

    public void insertData(String str, String str2, String str3, String str4) {
        APLog.m161214i("insertTimeData interfaceName=", str + " format=" + str2 + " action=" + str3 + " extend=" + str4);
        insertOneRecord(str, str2, str3, str4);
    }

    public void insertTimeData(String str, String str2) {
        APLog.m161214i("insertTimeData interfaceName=", str);
        APLog.m161214i("insertTimeData timeName=", str2);
        if (!TextUtils.isEmpty(APPluginDataInterface.singleton().getOfferId())) {
            if (str == APMidasPluginInfo.LAUNCH_INTERFACE_INIT) {
                long currentTimeMillis = System.currentTimeMillis() - APInitData.singleton().getInitInterfaceTime();
                APLog.m161214i("时耗", "insertTimeData timeName=" + str2 + ",initTime:" + currentTimeMillis);
                insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, currentTimeMillis));
                return;
            }
            long j = 0;
            if (APPluginDataInterface.singleton().getProcessData() != null) {
                j = System.currentTimeMillis() - APPluginDataInterface.singleton().getProcessData().getPayInterfaceTime();
            }
            APLog.m161214i("时耗", "insertTimeData timeName=" + str2 + ",payTime:" + j);
            insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, j));
        }
    }

    public void insertTimeDataEx(String str, String str2, long j) {
        long timeInterval = APMidasTools.getTimeInterval(j, System.currentTimeMillis());
        APLog.m161210d("insertTimeDataEx", "timeName:" + str2 + ",time" + timeInterval);
        insertTimeData(str, str2, timeInterval);
    }

    public void payInterfaceInit(APMidasBaseRequest aPMidasBaseRequest, String str) {
        APPluginDataInterface.init();
        APPluginDataInterface.singleton().setLaunchInterface(str);
        APMultiProcessData aPMultiProcessData = new APMultiProcessData();
        aPMultiProcessData.setGuid(APMidasTools.getUUID());
        long currentTimeMillis = System.currentTimeMillis();
        APLog.m161214i("showFirstPageInsertDB=====", "all:" + currentTimeMillis);
        aPMultiProcessData.setPayInterfaceTime(currentTimeMillis);
        if (APInitData.singleton().getInitInterfaceTime() < 1) {
            aPMultiProcessData.setIntervalTime(0);
        } else {
            aPMultiProcessData.setIntervalTime((int) (System.currentTimeMillis() - APInitData.singleton().getInitInterfaceTime()));
        }
        APPluginDataInterface.singleton().setProcessData(aPMultiProcessData);
        APMidasAnalyzeParams.getInstance().setSaveType(aPMidasBaseRequest);
        APMidasAnalyzeParams.getInstance().AnalyzeParams(aPMidasBaseRequest);
    }

    public void reportImmediatelyOneRecord(String str, String str2, String str3) {
        APClickStreamParams aPClickStreamParams = new APClickStreamParams();
        aPClickStreamParams.device = "android_v" + APMidasPayAPI.getMidasPluginVersion();
        aPClickStreamParams.openid = APPluginDataInterface.singleton().getOpenId();
        aPClickStreamParams.format = str2;
        aPClickStreamParams.from = "";
        aPClickStreamParams.offerid = APPluginDataInterface.singleton().getOfferId();
        aPClickStreamParams.f343436pf = APPluginDataInterface.singleton().getPf();
        aPClickStreamParams.SessionId = APPluginDataInterface.singleton().getSessionId();
        aPClickStreamParams.SessionType = APPluginDataInterface.singleton().getSessionType();
        if (!TextUtils.isEmpty(str3)) {
            aPClickStreamParams.extend = APMidasTools.urlEncode(str3, 3);
        }
        int saveType = APPluginDataInterface.singleton().getSaveType();
        if (saveType == 0) {
            aPClickStreamParams.savetype = "game";
        } else if (saveType == 1) {
            aPClickStreamParams.savetype = "goods";
        } else if (saveType == 2 || saveType == 3) {
            aPClickStreamParams.savetype = "acct";
        } else if (saveType == 4) {
            aPClickStreamParams.savetype = "month";
        } else if (saveType != 5) {
            aPClickStreamParams.savetype = "game";
        } else {
            aPClickStreamParams.savetype = "subscribe";
        }
        aPClickStreamParams.currentTimeMillis = String.valueOf(System.currentTimeMillis());
        if (str.equals(APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
            APInitData.singleton();
            aPClickStreamParams.dataId = APInitData.getInitdataCount();
            aPClickStreamParams.VipFlags = APInitData.singleton().getInitGUID();
        } else {
            aPClickStreamParams.dataId = APDataId.getDataId();
            APMultiProcessData processData = APPluginDataInterface.singleton().getProcessData();
            if (processData != null) {
                aPClickStreamParams.VipFlags = processData.getGuid();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(aPClickStreamParams);
        String allReportRecord = getAllReportRecord(arrayList);
        if (!TextUtils.isEmpty(allReportRecord)) {
            APNetworkManager.getInstance().dataReport(allReportRecord, new IAPHttpAnsObserver() {
                public void onError(APBaseHttpAns aPBaseHttpAns) {
                }

                public void onFinish(APBaseHttpAns aPBaseHttpAns) {
                }

                public void onStop(APBaseHttpAns aPBaseHttpAns) {
                }
            });
        }
    }

    private APPluginReportManager() {
        this.initDataReport = null;
        this.payDataReport = null;
        this.initDataReport = new ArrayList<>();
        this.payDataReport = new ArrayList<>();
    }

    public void insertTimeData(String str, String str2, long j) {
        APLog.m161210d("insertTimeData interfaceName=", str + " timeName=" + str2 + " time=" + String.valueOf(j));
        if (!TextUtils.isEmpty(APPluginDataInterface.singleton().getOfferId())) {
            if (str == APMidasPluginInfo.LAUNCH_INTERFACE_INIT) {
                insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, j));
            } else {
                insertOneRecord(str, MIDASPLUGIN_FORMAT_TIME, "", constructTimeReport(str2, j));
            }
        }
    }
}
