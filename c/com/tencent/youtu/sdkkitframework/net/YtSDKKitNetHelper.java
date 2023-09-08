package com.tencent.youtu.sdkkitframework.net;

import android.os.Process;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

public class YtSDKKitNetHelper {
    /* access modifiers changed from: private */
    public static final String TAG = "YtSDKKitNetHelper";
    private static final int TIME_OUT = 10000;
    private static YtSDKKitNetHelper _instane;
    /* access modifiers changed from: private */
    public HttpsURLConnection conn;
    /* access modifiers changed from: private */
    public Thread networkThread;
    /* access modifiers changed from: private */
    public HashMap<Integer, Thread> runningMap = new HashMap<>();

    private YtSDKKitNetHelper() {
    }

    public static synchronized void clearInstance() {
        synchronized (YtSDKKitNetHelper.class) {
            YtSDKKitNetHelper ytSDKKitNetHelper = _instane;
            if (ytSDKKitNetHelper != null) {
                ytSDKKitNetHelper.stopNetworkRequest();
            }
            _instane = null;
        }
    }

    public static synchronized YtSDKKitNetHelper getInstance() {
        YtSDKKitNetHelper ytSDKKitNetHelper;
        synchronized (YtSDKKitNetHelper.class) {
            if (_instane == null) {
                _instane = new YtSDKKitNetHelper();
            }
            ytSDKKitNetHelper = _instane;
        }
        return ytSDKKitNetHelper;
    }

    public void sendNetworkRequest(String str, String str2, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser) {
        final String str3 = str;
        final HashMap<String, String> hashMap2 = hashMap;
        final String str4 = str2;
        final YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser2 = iYtSDKKitNetResponseParser;
        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    YtSDKKitNetHelper.this.runningMap.put(Integer.valueOf(Process.myTid()), YtSDKKitNetHelper.this.networkThread);
                    HttpsURLConnection unused = YtSDKKitNetHelper.this.conn = (HttpsURLConnection) new URL(str3).openConnection();
                    YtSDKKitNetHelper.this.conn.setRequestMethod("POST");
                    YtSDKKitNetHelper.this.conn.setConnectTimeout(YtSDKKitFramework.getInstance().getNetworkRequestTimeoutMS());
                    HashMap hashMap = hashMap2;
                    if (hashMap != null) {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            YtSDKKitNetHelper.this.conn.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    YtLogger.m106580i(YtSDKKitNetHelper.TAG, "Write buffer");
                    OutputStream outputStream = YtSDKKitNetHelper.this.conn.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                    bufferedWriter.write(str4);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                    YtLogger.m106580i(YtSDKKitNetHelper.TAG, "Wait response");
                    int responseCode = YtSDKKitNetHelper.this.conn.getResponseCode();
                    YtLogger.m106580i(YtSDKKitNetHelper.TAG, "Get response");
                    if (!YtSDKKitNetHelper.this.runningMap.containsKey(Integer.valueOf(Process.myTid()))) {
                        YtLogger.m106580i(YtSDKKitNetHelper.TAG, "Exit network response handling");
                        YtSDKKitNetHelper.this.conn.disconnect();
                        YtLogger.m106580i(YtSDKKitNetHelper.TAG, "Network disconnected");
                        YtSDKKitNetHelper.this.conn.disconnect();
                        return;
                    }
                    if (responseCode == 200) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(YtSDKKitNetHelper.this.conn.getInputStream()));
                        StringBuffer stringBuffer = new StringBuffer("");
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            stringBuffer.append(readLine);
                        }
                        bufferedReader.close();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("response", stringBuffer.toString());
                        iYtSDKKitNetResponseParser2.onNetworkResponseEvent(hashMap2, (Exception) null);
                    } else {
                        String access$300 = YtSDKKitNetHelper.TAG;
                        YtLogger.m106579e(access$300, "Network response failed " + responseCode);
                        YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser = iYtSDKKitNetResponseParser2;
                        iYtSDKKitNetResponseParser.onNetworkResponseEvent((HashMap<String, String>) null, new Exception("Https Response Failed with code:" + responseCode));
                    }
                    YtLogger.m106580i(YtSDKKitNetHelper.TAG, "Network disconnected");
                    YtSDKKitNetHelper.this.conn.disconnect();
                } catch (Exception e) {
                    String access$3002 = YtSDKKitNetHelper.TAG;
                    YtLogger.m106579e(access$3002, "Network response failed " + e.getLocalizedMessage());
                    iYtSDKKitNetResponseParser2.onNetworkResponseEvent((HashMap<String, String>) null, e);
                } catch (Throwable th) {
                    YtLogger.m106580i(YtSDKKitNetHelper.TAG, "Network disconnected");
                    YtSDKKitNetHelper.this.conn.disconnect();
                    throw th;
                }
            }
        });
        this.networkThread = thread;
        thread.setName("YtNetworkRequestThread");
        this.networkThread.start();
    }

    public void stopNetworkRequest() {
        for (Map.Entry next : this.runningMap.entrySet()) {
            if (next.getValue() == this.networkThread) {
                this.runningMap.remove(next.getKey());
                String str = TAG;
                YtLogger.m106580i(str, "network remove " + next.getKey());
                return;
            }
        }
    }
}
