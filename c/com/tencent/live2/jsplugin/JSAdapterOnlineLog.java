package com.tencent.live2.jsplugin;

import android.text.TextUtils;
import com.tencent.liteav.base.logger.OnlineLoggerAndroid;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.live2.impl.V2TXLiveUtils;
import java.net.URLDecoder;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JSAdapterOnlineLog {
    private static final String TAG = "JSAdapterOnlineLog";
    private static volatile JSAdapterOnlineLog instance;
    private boolean mIsInitted = false;
    private OnlineLoggerAndroid.C104504a mLoggerLevel = OnlineLoggerAndroid.C104504a.kApi;
    private ConcurrentLinkedQueue<String> mLoggerQueue = new ConcurrentLinkedQueue<>();
    private int mMaxCacheLogNumber = 10;
    private OnlineLoggerAndroid mOnlineLogger;
    private OnlineLoggerAndroid.C104505b mProductType = OnlineLoggerAndroid.C104505b.kLive;
    private String mRoomId = "";
    private int mSDkAppId = 0;
    private String mUserId = "";

    private JSAdapterOnlineLog() {
    }

    private boolean checkNeedInit(OnlineLoggerAndroid.C104505b bVar, int i, String str, String str2) {
        return this.mProductType != bVar || this.mSDkAppId != i || !this.mRoomId.equals(str) || !this.mUserId.equals(str2);
    }

    public static JSAdapterOnlineLog getInstance() {
        if (instance == null) {
            synchronized (JSAdapterOnlineLog.class) {
                if (instance == null) {
                    instance = new JSAdapterOnlineLog();
                }
            }
        }
        return instance;
    }

    private void insertCacheLog(String str) {
        while (this.mLoggerQueue.size() >= this.mMaxCacheLogNumber) {
            this.mLoggerQueue.poll();
        }
        this.mLoggerQueue.add(str);
    }

    private void reportCacheLog() {
        if (!this.mLoggerQueue.isEmpty()) {
            while (!this.mLoggerQueue.isEmpty()) {
                this.mOnlineLogger.log(this.mLoggerLevel, this.mLoggerQueue.poll());
            }
        }
    }

    public synchronized void log(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mIsInitted) {
                this.mOnlineLogger.log(this.mLoggerLevel, str);
            } else {
                insertCacheLog(str);
            }
        }
    }

    public synchronized void updateUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            OnlineLoggerAndroid onlineLoggerAndroid = this.mOnlineLogger;
            if (onlineLoggerAndroid != null) {
                onlineLoggerAndroid.destroy();
            }
            this.mOnlineLogger = null;
            this.mIsInitted = false;
            this.mProductType = OnlineLoggerAndroid.C104505b.kLive;
            this.mSDkAppId = 0;
            this.mRoomId = "";
            this.mUserId = "";
            return;
        }
        try {
            String decode = URLDecoder.decode(str, "UTF-8");
            OnlineLoggerAndroid.C104505b bVar = OnlineLoggerAndroid.C104505b.kLive;
            if (decode.startsWith(V2TXLiveUtils.TRTC_ADDRESS1) || decode.startsWith(V2TXLiveUtils.TRTC_ADDRESS2) || decode.startsWith("trtc://")) {
                bVar = OnlineLoggerAndroid.C104505b.kTRTC;
            }
            String str2 = "0";
            String str3 = "";
            String str4 = "";
            if (decode.startsWith("rtmp")) {
                str3 = LiveURLParser.getStreamId(decode);
                str4 = LiveURLParser.getStreamId(decode);
            } else if (decode.startsWith("trtc://")) {
                str2 = LiveURLParser.getURLParams(decode, "sdkappid");
                str4 = LiveURLParser.getURLParams(decode, "userId");
                str3 = LiveURLParser.getStreamId(decode);
            } else if (decode.startsWith("room://")) {
                str2 = LiveURLParser.getURLParams(decode, "sdkappid");
                str3 = LiveURLParser.getURLParams(decode, "roomid");
                str4 = LiveURLParser.getURLParams(decode, "userid");
            }
            int parseInt = Integer.parseInt(str2);
            if (checkNeedInit(bVar, parseInt, str3, str4)) {
                OnlineLoggerAndroid onlineLoggerAndroid2 = this.mOnlineLogger;
                if (onlineLoggerAndroid2 != null) {
                    onlineLoggerAndroid2.destroy();
                    this.mOnlineLogger = null;
                }
                this.mProductType = bVar;
                this.mSDkAppId = parseInt;
                this.mRoomId = str3;
                this.mUserId = str4;
                this.mOnlineLogger = new OnlineLoggerAndroid(bVar, parseInt, str3, str4);
                this.mIsInitted = true;
                reportCacheLog();
            }
        } catch (Exception unused) {
            LiteavLog.m16898e(TAG, "updateUrl fail, url:".concat(String.valueOf(str)));
        }
    }
}
