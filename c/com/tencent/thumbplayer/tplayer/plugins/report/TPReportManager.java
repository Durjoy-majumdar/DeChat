package com.tencent.thumbplayer.tplayer.plugins.report;

import android.app.UiModeManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.thumbplayer.api.report.ITPBusinessReportManager;
import com.tencent.thumbplayer.api.report.TPDefaultReportInfo;
import com.tencent.thumbplayer.api.report.TPLiveReportInfo;
import com.tencent.thumbplayer.api.report.TPVodReportInfo;
import com.tencent.thumbplayer.common.report.ITPReportProperties;
import com.tencent.thumbplayer.common.report.TPBeaconReportWrapper;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyHelper;
import com.tencent.thumbplayer.tplayer.plugins.ITPPluginBase;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import com.tencent.thumbplayer.utils.TPDiskReadWrite;
import com.tencent.thumbplayer.utils.TPGlobalEventNofication;
import com.tencent.thumbplayer.utils.TPHashMapBuilder;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPProperties;
import com.tencent.thumbplayer.utils.TPThreadPool;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import org.json.JSONObject;

public class TPReportManager implements ITPPluginBase, ITPBusinessReportManager {
    private static final boolean APP_STATE_BACKGROUND = false;
    private static final boolean APP_STATE_FOREGROUND = true;
    private static final int BUFFERING_DURATION_THRESHOLD_MS = 1200;
    private static final int DEVICE_TYPE_AN_PAD = 5;
    private static final int DEVICE_TYPE_AN_PHONE = 2;
    private static final int DEVICE_TYPE_AN_TV = 9;
    private static final String EVENT_KEY_BUFFERING = "second_buffering";
    private static final String EVENT_KEY_FIRST_LOAD = "first_load";
    private static final String EVENT_KEY_FIRST_RENDERING = "first_rendering";
    private static final String EVENT_KEY_GET_CDN_URL = "get_cdn_url";
    private static final String EVENT_KEY_INIT_PLAYER = "init_player";
    private static final String EVENT_KEY_LIVE_FIRST_LOAD = "live_loading";
    private static final String EVENT_KEY_LIVE_PERIOD = "live_period";
    private static final String EVENT_KEY_LIVE_PLAY_ERROR = "live_error";
    private static final String EVENT_KEY_LOAD_SUBTITLE = "load_subtitle";
    private static final String EVENT_KEY_PLAY_DONE = "play_done";
    private static final String EVENT_KEY_REDIRECT = "302_redirect";
    private static final String EVENT_KEY_USER_SEEK = "user_seek";
    private static final String LIVE_HLS_M3U8_TAG_PREFIX = "#EXT-X-PROGRAM-DATE-TIME:";
    private static final int LIVE_REPORT_PERIOD = 60000;
    private static final int MAX_BUFFERING_REPORT_COUNT = 20;
    private static final int MAX_SEEK_REPORT_COUNT = 20;
    private static final String OS_VERSION = String.format("Android %s", new Object[]{TPSystemInfo.getOsVersion()});
    private static final String PROXY_HITDOWNLOADED_KEY = "hitDownloaded";
    private static final String REPORT_DATA_CACHE_NAME = "TPReportCache";
    private static final String TAG = "TPReportManager";
    private static final int VOD_HIT_DOWNLOADED_UNSET = -1;
    private static boolean hasReportLastEvent = false;
    private static TPDiskReadWrite mCache = null;
    private static String sDisplayResolutionReportString = "";
    private boolean mAppState = true;
    private Context mContext;
    private TPReportParams.BufferingOnceParams mCurBufferingParams = null;
    private TPReportParams.UserSeekOnceParams mCurSeekParams = null;
    private int mDownloadType = 0;
    private String mErrorCode = "0";
    /* access modifiers changed from: private */
    public EventHandler mEventHandler;
    private final Object mExitLock = new Object();
    private String mFlowId = "";
    private TPGlobalEventNofication.OnGlobalEventChangeListener mGlobalEventListener = new TPGlobalEventNofication.OnGlobalEventChangeListener() {
        public void onEvent(int i, int i2, int i3, Object obj) {
            int i4;
            TPLogUtil.m21897i(TPReportManager.TAG, "OnGlobalEventChangeListener eventId: " + i);
            switch (i) {
                case 100001:
                    i4 = 2100;
                    break;
                case 100002:
                    i4 = 2101;
                    break;
                default:
                    return;
            }
            TPReportManager.this.mEventHandler.obtainMessage(i4, (Object) null).sendToTarget();
        }
    };
    private boolean mIsBuffering = false;
    private boolean mIsExit = false;
    private boolean mIsLoadingSubtitle = false;
    private boolean mIsPlayDone = true;
    private boolean mIsPrepare = false;
    private boolean mIsSeeking = false;
    private boolean mIsUseP2P = false;
    private int mLastEvent = 0;
    private long mMediaDurationMs = 0;
    private int mMediaRate = 0;
    private String mMediaResolution = "";
    private boolean mNeedReportToBeacon = true;
    private int mNetworkSpeed = 0;
    private final ParamRecord mParamRecord = new ParamRecord();
    private long mPlayDurationMs = 0;
    private int mPlayScene = 1;
    private long mPlayStartTimeMs = 0;
    private int mPlayType = -1;
    private int mPlayerType = 0;
    private String mProto = "";
    private String mProtoVer = "";
    private IReportHandler mReportHandler = new DefaultReportHandler();
    private TPDefaultReportInfo mReportInfoGetter = null;
    /* access modifiers changed from: private */
    public TPReportParams mReportParams = null;
    private HandlerThread mReportThread;
    private double mSamplingRate = 1.0d;
    private int mSeekBufferingCount = 0;
    private int mSeekBufferingDuration = 0;
    private int mSignalStrength = 81;

    public class DefaultReportHandler implements IReportHandler {
        public DefaultReportHandler() {
        }

        public void handleReportEvent(int i, ITPReportProperties iTPReportProperties) {
            TPReportManager.this.updateCommonParam(iTPReportProperties, i, i <= 30);
            TPReportManager.this.onReportEvent(iTPReportProperties);
        }
    }

    public class EventHandler extends Handler {
        private static final int MSG_302_REDIRECT = 2001;
        private static final int MSG_APP_BACKGROUND = 2100;
        private static final int MSG_APP_FOREGROUND = 2101;
        private static final int MSG_BUFFERING_END = 1014;
        private static final int MSG_BUFFERING_START = 1013;
        private static final int MSG_CDN_UPDATE = 1018;
        private static final int MSG_CREATE_DONE = 1000;
        private static final int MSG_CREATE_START = 999;
        private static final int MSG_DOWNLOAD_UPDATE = 1017;
        private static final int MSG_EARLY_ERROR = 2003;
        private static final int MSG_EXIT_THREAD = 100;
        private static final int MSG_FIRSTCLIP_OPEN = 1022;
        private static final int MSG_FIRST_PACKET = 1019;
        private static final int MSG_GET_CDN = 2000;
        private static final int MSG_HLS_PRIVATE_TAG = 1016;
        private static final int MSG_LIVE_PERIOD_REPORT = 3000;
        private static final int MSG_LOAD_SUBTITLE = 2002;
        private static final int MSG_PLAYER_ERROR = 1006;
        private static final int MSG_PLAYER_PAUSE = 1004;
        private static final int MSG_PLAYER_RELEASE = 1010;
        private static final int MSG_PLAYER_RESET = 1011;
        private static final int MSG_PLAYER_STOP = 1005;
        private static final int MSG_PLAY_COMPLETE = 1009;
        private static final int MSG_PREPARE_DONE = 1002;
        private static final int MSG_PROTOCOL_UPDATE = 1023;
        private static final int MSG_RENDERING_START = 1012;
        private static final int MSG_REPORT_LAST_EVENT = 4000;
        private static final int MSG_SEEK_COMPLETE = 1008;
        private static final int MSG_SELECT_TRACK = 2004;
        private static final int MSG_SELECT_TRACK_DONE = 2005;
        private static final int MSG_SET_PLAY_SPEED = 1015;
        private static final int MSG_SIGNAL_STRENGTH_REGISTER = 4001;
        private static final int MSG_SIGNAL_STRENGTH_UNREGISTER = 4002;
        private static final int MSG_START_PLAY = 1003;
        private static final int MSG_START_PREPARE = 1001;
        private static final int MSG_START_SEEK = 1007;
        private static final int MSG_SWITCH_DEF = 1020;
        private static final int MSG_SWITCH_DEF_END = 1021;

        public EventHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Object obj = message.obj;
            Map map = obj instanceof Map ? (Map) obj : null;
            int i = message.what;
            if (i == 100) {
                TPReportManager.this.handleReportThreadExit();
            } else if (i == 3000) {
                TPReportManager.this.onLivePeriodReport();
            } else if (i == 4000) {
                TPReportManager.this.onReportLastEvent();
            } else if (i == MSG_APP_BACKGROUND) {
                TPReportManager.this.onAppBackground();
            } else if (i != 2101) {
                switch (i) {
                    case 999:
                        TPReportManager.this.onPlayerCreateStart(map);
                        return;
                    case 1000:
                        TPReportManager.this.onPlayerCreateDone(map);
                        return;
                    case 1001:
                        TPReportManager.this.onStartPrepare(map);
                        return;
                    case 1002:
                        TPReportManager.this.onPrepareDone(map);
                        return;
                    case 1003:
                        TPReportManager.this.onStartPlayer(map);
                        return;
                    case 1004:
                        TPReportManager.this.onPlayerPause(map);
                        return;
                    case 1005:
                        TPReportManager.this.onPlayerStop(map);
                        return;
                    case 1006:
                        TPReportManager.this.onPlayerError(map);
                        return;
                    case 1007:
                        TPReportManager.this.onStartSeek(map);
                        return;
                    case 1008:
                        TPReportManager.this.onSeekComplete(map);
                        return;
                    case 1009:
                        TPReportManager.this.onPlayComplete(map);
                        return;
                    case 1010:
                        TPReportManager.this.onPlayerRelease(map);
                        return;
                    case 1011:
                        TPReportManager.this.onPlayerReset(map);
                        return;
                    case 1012:
                        TPReportManager.this.onRenderingStart(map);
                        return;
                    case 1013:
                        TPReportManager.this.onBufferingStart(map);
                        return;
                    case 1014:
                        TPReportManager.this.onBufferingEnd(map);
                        return;
                    case 1015:
                        TPReportManager.this.onSetPlaySpeed(map);
                        return;
                    case 1016:
                        if (obj instanceof String) {
                            TPReportManager.this.onHandleHlsTag((String) obj);
                            return;
                        }
                        return;
                    case 1017:
                        TPReportManager.this.onProxyInfoUpdate(map);
                        return;
                    case 1018:
                        TPReportManager.this.onCdnInfoUpdate(map);
                        return;
                    case 1019:
                        TPReportManager.this.onFirstPacketRead(map);
                        return;
                    case 1020:
                        TPReportManager.this.onSwitchDef(map);
                        return;
                    case 1021:
                        TPReportManager.this.onSwitchDefEnd(map);
                        return;
                    case 1022:
                        TPReportManager.this.onFirstClipOpen(map);
                        return;
                    case MSG_PROTOCOL_UPDATE /*1023*/:
                        TPReportManager.this.onReportProtocolUpdate(map);
                        return;
                    default:
                        switch (i) {
                            case 2000:
                                TPReportManager.this.onGetCdn(map);
                                return;
                            case 2001:
                                TPReportManager.this.on302Redirect(map);
                                return;
                            case 2002:
                                TPReportManager.this.onLoadSubtitle(map);
                                return;
                            case 2003:
                                TPReportManager.this.onPlayerEarlyError(map);
                                return;
                            case 2004:
                                TPReportManager.this.onSelectTrack(map);
                                return;
                            case 2005:
                                TPReportManager.this.onSelectTrackDone(map);
                                return;
                            default:
                                return;
                        }
                }
            } else {
                TPReportManager.this.onAppForeground();
            }
        }
    }

    public interface IReportHandler {
        void handleReportEvent(int i, ITPReportProperties iTPReportProperties);
    }

    public class LiveReportHandler implements IReportHandler {
        public LiveReportHandler() {
        }

        public void handleReportEvent(int i, ITPReportProperties iTPReportProperties) {
            TPProperties tPProperties = new TPProperties();
            boolean z = i <= 30 || i == 263;
            if (i == 30) {
                i = 205;
            } else if (i == 50) {
                TPReportManager.this.mEventHandler.removeMessages(3000);
                i = TPReportParams.LIVE_STEP_PLAY;
            } else if (i == 150) {
                TPReportManager.this.mEventHandler.removeMessages(3000);
            } else if (i == 263) {
                TPReportManager.this.mEventHandler.removeMessages(3000);
                TPReportManager.this.mEventHandler.sendEmptyMessageDelayed(3000, 60000);
            } else {
                return;
            }
            TPReportManager.this.updateCommonParam(tPProperties, i, z);
            TPReportManager.this.updateLiveExParam(tPProperties, z);
            if (i != 205) {
                tPProperties.put(TPReportKeys.LiveExKeys.LIVE_EX_LOADING_TIME, 0);
            }
            TPLogUtil.m21897i(TPReportManager.TAG, "liveExParam.prePlayLengthInt: " + TPReportManager.this.mReportParams.getLiveExParam().prePlayLengthInt);
            TPReportManager.this.onReportEvent(tPProperties);
        }
    }

    public class ParamRecord {
        public int bufferingCount;
        public int bufferingDurationMs;
        public String cdnIp;
        public String cdnUip;
        public String cdnUrl;
        public String defId;
        public long endBufferingTimeMs;
        public long endPrepareTimeMs;
        public int getSpeedCnt;
        public int hitDownloaded;
        public boolean isMultiTrack;
        public boolean isSelectedSubtitle;
        public boolean isSwitchingDef;
        public int liveDelayMs;
        public int maxSpeed;
        public int playDurationMs;
        public String spanId;
        public long startBufferingTimeMs;
        public long startPlayTimeMs;
        public long startPrepareTimeMs;
        public ArrayList<SubtitleInfo> subtitleInfos;
        public int totalSpeed;
        public String tuid;

        private ParamRecord() {
            this.startPlayTimeMs = 0;
            this.playDurationMs = 0;
            this.startPrepareTimeMs = 0;
            this.endPrepareTimeMs = 0;
            this.bufferingCount = 0;
            this.bufferingDurationMs = 0;
            this.startBufferingTimeMs = 0;
            this.endBufferingTimeMs = 0;
            this.liveDelayMs = 0;
            this.maxSpeed = 0;
            this.totalSpeed = 0;
            this.getSpeedCnt = 0;
            this.isSelectedSubtitle = false;
            this.isMultiTrack = false;
            this.isSwitchingDef = false;
            this.hitDownloaded = -1;
            this.defId = "";
            this.cdnUrl = "";
            this.cdnIp = "";
            this.cdnUip = "";
            this.spanId = "";
            this.tuid = "";
            this.subtitleInfos = new ArrayList<>();
        }

        public void reset() {
            this.startPlayTimeMs = 0;
            this.playDurationMs = 0;
            this.startPrepareTimeMs = 0;
            this.endPrepareTimeMs = 0;
            this.bufferingCount = 0;
            this.bufferingDurationMs = 0;
            this.startBufferingTimeMs = 0;
            this.endBufferingTimeMs = 0;
            this.liveDelayMs = 0;
            this.maxSpeed = 0;
            this.totalSpeed = 0;
            this.getSpeedCnt = 0;
            this.isSelectedSubtitle = false;
            this.isMultiTrack = false;
            this.isSwitchingDef = false;
            this.hitDownloaded = -1;
            this.defId = "";
            this.cdnUrl = "";
            this.cdnIp = "";
            this.cdnUip = "";
            this.spanId = "";
            this.tuid = "";
            this.subtitleInfos.clear();
        }
    }

    public class SubtitleInfo {
        public String name;
        public long opaque = -1;
        public String url;

        public SubtitleInfo(String str, String str2) {
            this.name = str;
            this.url = str2;
        }
    }

    public class VodReportHandler implements IReportHandler {
        public VodReportHandler() {
        }

        public void handleReportEvent(int i, ITPReportProperties iTPReportProperties) {
            boolean z = i <= 30;
            TPReportManager.this.updateCommonParam(iTPReportProperties, i, z);
            TPReportManager.this.updateVodExParam(iTPReportProperties, z);
            TPReportManager.this.onReportEvent(iTPReportProperties);
        }
    }

    public TPReportManager(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private String getDeviceResolution() {
        if (this.mContext == null) {
            return "0";
        }
        if (!TextUtils.isEmpty(sDisplayResolutionReportString)) {
            return sDisplayResolutionReportString;
        }
        int i = this.mContext.getResources().getDisplayMetrics().widthPixels;
        String str = this.mContext.getResources().getDisplayMetrics().heightPixels + "*" + i;
        sDisplayResolutionReportString = str;
        return str;
    }

    private int getDeviceType() {
        UiModeManager uiModeManager = (UiModeManager) this.mContext.getSystemService("uimode");
        if (uiModeManager == null) {
            return 2;
        }
        if (uiModeManager.getCurrentModeType() == 4) {
            return 9;
        }
        return (this.mContext.getResources().getConfiguration().screenLayout & 15) >= 3 ? 5 : 2;
    }

    private static String getEventId(int i) {
        if (i == 5) {
            return EVENT_KEY_INIT_PLAYER;
        }
        if (i == 15) {
            return EVENT_KEY_GET_CDN_URL;
        }
        if (i == 30) {
            return EVENT_KEY_FIRST_LOAD;
        }
        if (i == 40) {
            return EVENT_KEY_USER_SEEK;
        }
        if (i == 50) {
            return EVENT_KEY_PLAY_DONE;
        }
        if (i == 150) {
            return EVENT_KEY_LIVE_PLAY_ERROR;
        }
        if (i == 205) {
            return EVENT_KEY_LIVE_FIRST_LOAD;
        }
        if (i == 263) {
            return EVENT_KEY_LIVE_PERIOD;
        }
        switch (i) {
            case 32:
                return EVENT_KEY_FIRST_RENDERING;
            case 33:
                return EVENT_KEY_LOAD_SUBTITLE;
            case 34:
                return EVENT_KEY_REDIRECT;
            case 35:
                return EVENT_KEY_BUFFERING;
            default:
                return "";
        }
    }

    private void getHitDownloadedInfo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(PROXY_HITDOWNLOADED_KEY)) {
                ParamRecord paramRecord = this.mParamRecord;
                if (paramRecord.hitDownloaded == -1) {
                    paramRecord.hitDownloaded = jSONObject.getInt(PROXY_HITDOWNLOADED_KEY);
                }
            }
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean getMapValueBool(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2, boolean r3) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r3
        L_0x0003:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x000f
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
        L_0x000f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.getMapValueBool(java.util.Map, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float getMapValueFloat(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2, float r3) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r3
        L_0x0003:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x000f
            java.lang.Float r1 = (java.lang.Float) r1
            float r3 = r1.floatValue()
        L_0x000f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.getMapValueFloat(java.util.Map, java.lang.String, float):float");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getMapValueInteger(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2, int r3) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r3
        L_0x0003:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x000f
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r3 = r1.intValue()
        L_0x000f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.getMapValueInteger(java.util.Map, java.lang.String, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long getMapValueLong(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2, long r3) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r3
        L_0x0003:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x000f
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
        L_0x000f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.getMapValueLong(java.util.Map, java.lang.String, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String getMapValueString(java.util.Map<java.lang.String, java.lang.Object> r1, java.lang.String r2, java.lang.String r3) {
        /*
            r0 = this;
            if (r1 != 0) goto L_0x0003
            return r3
        L_0x0003:
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x000c
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tplayer.plugins.report.TPReportManager.getMapValueString(java.util.Map, java.lang.String, java.lang.String):java.lang.String");
    }

    private int getMobileSubType(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    private int getNetWorkType() {
        NetworkInfo activeNetworkInfo;
        Context context = this.mContext;
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return getMobileSubType(activeNetworkInfo.getSubtype());
            }
            if (type != 1) {
                return type != 9 ? 0 : 10;
            }
            return 1;
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public void handleReportThreadExit() {
        TPLogUtil.m21893d(TAG, "handleReportThreadExit");
        synchronized (this.mExitLock) {
            this.mIsExit = true;
            this.mExitLock.notify();
        }
    }

    private void init() {
        this.mReportThread = TPThreadPool.getInstance().obtainHandleThread("TP-ReportThread");
        this.mEventHandler = new EventHandler(this.mReportThread.getLooper());
        this.mReportParams = new TPReportParams();
        TPGlobalEventNofication.addEventListener(this.mGlobalEventListener);
        synchronized (TPReportManager.class) {
            if (mCache == null) {
                mCache = new TPDiskReadWrite(this.mContext, REPORT_DATA_CACHE_NAME);
            }
            if (!hasReportLastEvent) {
                this.mEventHandler.obtainMessage(4000).sendToTarget();
            }
            hasReportLastEvent = true;
        }
    }

    /* access modifiers changed from: private */
    public void on302Redirect(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "on302Redirect");
        if (map != null) {
            TPProperties tPProperties = new TPProperties();
            TPReportParams.RedirectParams redirectParams = this.mReportParams.getRedirectParams();
            redirectParams.cdnTypeInt = getMapValueInteger(map, TPReportKeys.PlayerStep.PLAYER_CDN_TYPE, 0);
            redirectParams.redirectCountInt = getMapValueInteger(map, TPReportKeys.PlayerStep.PLAYER_T302, 0);
            redirectParams.redirectedUrlString = getMapValueString(map, "url", "");
            redirectParams.starTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, 0);
            redirectParams.endTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, 0);
            redirectParams.errCodeString = getMapValueString(map, "code", "0");
            redirectParams.paramsToProperties(tPProperties);
            this.mReportHandler.handleReportEvent(34, tPProperties);
        }
    }

    /* access modifiers changed from: private */
    public void onAppBackground() {
        TPLogUtil.m21897i(TAG, "onAppBackground");
        if (!this.mIsPlayDone && this.mPlayType != 1 && this.mAppState) {
            this.mAppState = false;
            TPProperties tPProperties = new TPProperties();
            this.mReportParams.getBufferingTotalParams().paramsToProperties(tPProperties);
            this.mReportParams.getUserSeekTotalParams().paramsToProperties(tPProperties);
            TPReportParams.PlayDoneParams playDoneParams = this.mReportParams.getPlayDoneParams();
            playDoneParams.endTimeUnix = System.currentTimeMillis();
            playDoneParams.reasonInt = 2;
            playDoneParams.errCodeString = this.mErrorCode;
            ParamRecord paramRecord = this.mParamRecord;
            if (paramRecord.startPlayTimeMs > 0) {
                int i = paramRecord.playDurationMs;
                long currentTimeMillis = System.currentTimeMillis();
                ParamRecord paramRecord2 = this.mParamRecord;
                paramRecord.playDurationMs = i + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
                paramRecord2.startPlayTimeMs = 0;
            }
            long j = this.mPlayStartTimeMs;
            if (j > 0) {
                this.mPlayDurationMs += playDoneParams.endTimeUnix - j;
                this.mPlayStartTimeMs = 0;
            }
            playDoneParams.playDurationFloat = ((float) this.mPlayDurationMs) / 1000.0f;
            playDoneParams.paramsToProperties(tPProperties);
            TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
            commonParams.stepInt = 50;
            commonParams.paramsToProperties(tPProperties);
            int i2 = this.mPlayType;
            if (i2 == 0) {
                updateVodExParam(tPProperties, false);
            } else if (i2 == 1) {
                updateLiveExParam(tPProperties, false);
            }
            if (mCache != null && !TextUtils.isEmpty(this.mFlowId) && this.mNeedReportToBeacon) {
                TPLogUtil.m21897i(TAG, "Cache report event. mFlowId: " + this.mFlowId);
                mCache.writeFile(this.mFlowId, tPProperties.getProperties());
            }
        }
    }

    /* access modifiers changed from: private */
    public void onAppForeground() {
        TPLogUtil.m21897i(TAG, "onAppForeground");
        if (!this.mAppState) {
            this.mAppState = true;
            removeCacheEvent();
        }
    }

    /* access modifiers changed from: private */
    public void onBufferingEnd(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onBufferingEnd");
        this.mIsBuffering = false;
        ParamRecord paramRecord = this.mParamRecord;
        if (!paramRecord.isSwitchingDef) {
            paramRecord.startPlayTimeMs = System.currentTimeMillis();
        }
        if (map != null) {
            long mapValueLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, System.currentTimeMillis());
            ParamRecord paramRecord2 = this.mParamRecord;
            long j = paramRecord2.startBufferingTimeMs;
            int i = (int) (mapValueLong - j);
            if (i > 1200 && !this.mIsSeeking) {
                paramRecord2.bufferingCount++;
                paramRecord2.endBufferingTimeMs = mapValueLong;
                paramRecord2.bufferingDurationMs += (int) (mapValueLong - j);
                TPReportParams.BufferingOnceParams bufferingOnceParams = this.mCurBufferingParams;
                if (bufferingOnceParams != null) {
                    bufferingOnceParams.endTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, 0);
                    this.mCurBufferingParams.errCodeString = this.mErrorCode;
                    TPReportParams.BufferingTotalParams bufferingTotalParams = this.mReportParams.getBufferingTotalParams();
                    bufferingTotalParams.bufferingCountInt++;
                    bufferingTotalParams.bufferingDurationInt += i;
                    if (bufferingTotalParams.bufferingOnceParamsList.size() < 20) {
                        bufferingTotalParams.bufferingOnceParamsList.add(this.mCurBufferingParams);
                        TPProperties tPProperties = new TPProperties();
                        this.mCurBufferingParams.paramsToProperties(tPProperties);
                        this.mReportHandler.handleReportEvent(35, tPProperties);
                    }
                    this.mCurBufferingParams = null;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void onBufferingStart(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onBufferingStart");
        if (map != null) {
            this.mIsBuffering = true;
            if (!this.mIsSeeking) {
                ParamRecord paramRecord = this.mParamRecord;
                if (paramRecord.startPlayTimeMs > 0) {
                    int i = paramRecord.playDurationMs;
                    long currentTimeMillis = System.currentTimeMillis();
                    ParamRecord paramRecord2 = this.mParamRecord;
                    paramRecord.playDurationMs = i + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
                    paramRecord2.startPlayTimeMs = 0;
                }
                this.mParamRecord.startBufferingTimeMs = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, System.currentTimeMillis());
                TPReportParams.BufferingOnceParams createBufferingOnceParams = this.mReportParams.createBufferingOnceParams();
                this.mCurBufferingParams = createBufferingOnceParams;
                createBufferingOnceParams.starTimeUnix = this.mParamRecord.startBufferingTimeMs;
                createBufferingOnceParams.formatInt = getMapValueInteger(map, TPReportKeys.PlayerStep.PLAYER_FORMAT, 0);
                TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
                TPReportParams.BufferingOnceParams bufferingOnceParams = this.mCurBufferingParams;
                bufferingOnceParams.formatInt = commonParams.mediaFormatInt;
                bufferingOnceParams.reasonInt = getMapValueInteger(map, TPReportKeys.PlayerStep.PLAYER_REASON, 0);
                TPReportParams.BufferingOnceParams bufferingOnceParams2 = this.mCurBufferingParams;
                bufferingOnceParams2.lastEventInt = this.mLastEvent;
                bufferingOnceParams2.sceneInt = this.mPlayScene;
                bufferingOnceParams2.bufferingPresentTimeLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_PRESENT_TIME, 0) / 1000;
                this.mCurBufferingParams.urlString = getMapValueString(map, "url", "");
            }
        }
    }

    /* access modifiers changed from: private */
    public void onCdnInfoUpdate(Map<String, Object> map) {
        if (map != null) {
            this.mParamRecord.cdnUrl = getMapValueString(map, "url", "");
            this.mParamRecord.cdnIp = getMapValueString(map, TPReportKeys.Common.COMMON_CDN_IP, "");
            this.mParamRecord.cdnUip = getMapValueString(map, TPReportKeys.Common.COMMON_CDN_UIP, "");
            if (!TextUtils.isEmpty(this.mParamRecord.cdnUrl) && this.mParamRecord.cdnUrl.contains("sid=")) {
                int indexOf = this.mParamRecord.cdnUrl.indexOf("sid=");
                int indexOf2 = this.mParamRecord.cdnUrl.indexOf("&", indexOf);
                ParamRecord paramRecord = this.mParamRecord;
                paramRecord.tuid = indexOf2 > -1 ? paramRecord.cdnUrl.substring(indexOf + 4, indexOf2) : paramRecord.cdnUrl.substring(indexOf + 4);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onFirstClipOpen(Map<String, Object> map) {
        if (map != null) {
            this.mReportParams.getFirstLoadParams().firstOpenTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: private */
    public void onFirstPacketRead(Map<String, Object> map) {
        if (map != null) {
            TPReportParams.LiveExParam liveExParam = this.mReportParams.getLiveExParam();
            long mapValueLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, System.currentTimeMillis());
            liveExParam.getSyncFrameDurationInt = (int) (mapValueLong - this.mParamRecord.startPrepareTimeMs);
            this.mReportParams.getFirstLoadParams().firstPacketReadTimeUnix = mapValueLong;
        }
    }

    /* access modifiers changed from: private */
    public void onGetCdn(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onGetCdn");
        if (map != null) {
            TPProperties tPProperties = new TPProperties();
            TPReportParams.GetCdnUrlParams getCdnParams = this.mReportParams.getGetCdnParams();
            getCdnParams.proxyIpString = getMapValueString(map, TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP, "");
            getCdnParams.starTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, 0);
            getCdnParams.endTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, 0);
            getCdnParams.errCodeString = getMapValueString(map, "code", "0");
            getCdnParams.paramsToProperties(tPProperties);
            this.mReportHandler.handleReportEvent(15, tPProperties);
            if (!TextUtils.isEmpty(getCdnParams.errCodeString) && !getCdnParams.errCodeString.equals("0") && !getCdnParams.errCodeString.equals("0.0")) {
                this.mErrorCode = getCdnParams.errCodeString;
            }
        }
    }

    /* access modifiers changed from: private */
    public void onHandleHlsTag(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            TPLogUtil.m21897i(TAG, "onHandleHlsTag, tag is null");
        } else if (!str.startsWith(LIVE_HLS_M3U8_TAG_PREFIX)) {
            TPLogUtil.m21897i(TAG, "onHandleHlsTag, tag is not start with #EXT-X-PROGRAM-DATE-TIME:");
        } else {
            try {
                String substring = str.substring(25);
                int indexOf = substring.indexOf(43);
                if (indexOf != -1) {
                    str2 = substring.substring(0, indexOf).replace('T', ' ');
                } else {
                    TPLogUtil.m21897i(TAG, "handleOnPlayerPrivaterHlsM3u8Tag , player_m3u8_tag , tag do not contains time zone");
                    str2 = substring.replace('T', ' ');
                }
            } catch (Exception e) {
                TPLogUtil.m21895e(TAG, (Throwable) e);
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                TPLogUtil.m21897i(TAG, "onHandleHlsTag , player_m3u8_tag , dataTime is null ");
                return;
            }
            long j = 0;
            try {
                Date parse = new SimpleDateFormat(TimeUtil.YYYY2MM2DD_HH1MM1SS).parse(str2);
                if (parse != null) {
                    j = parse.getTime();
                }
            } catch (Exception e2) {
                TPLogUtil.m21895e(TAG, (Throwable) e2);
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append("onHandleHlsTag , player_m3u8_tag , sysCurTime: ");
            sb.append(currentTimeMillis);
            sb.append(", time:");
            sb.append(j);
            sb.append(", delay:");
            long j2 = currentTimeMillis - j;
            sb.append(j2);
            TPLogUtil.m21897i(TAG, sb.toString());
            this.mParamRecord.liveDelayMs = (int) j2;
        }
    }

    /* access modifiers changed from: private */
    public void onLivePeriodReport() {
        TPLogUtil.m21897i(TAG, "onLivePeriodReport");
        this.mReportHandler.handleReportEvent(TPReportParams.LIVE_STEP_PLAY, new TPProperties());
    }

    /* access modifiers changed from: private */
    public void onLoadSubtitle(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onLoadSubtitle");
        if (map != null) {
            this.mParamRecord.subtitleInfos.add(new SubtitleInfo(getMapValueString(map, "name", ""), getMapValueString(map, "url", "")));
        }
    }

    /* access modifiers changed from: private */
    public void onPlayComplete(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayComplete");
        if (map != null) {
            map.put(TPReportKeys.PlayerStep.PLAYER_REASON, 0);
            onPlayEnd(map);
        }
    }

    private void onPlayEnd(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayEnd");
        if (map != null && !this.mIsPlayDone) {
            this.mIsPlayDone = true;
            if (this.mPlayType != 1 && this.mIsPrepare) {
                onPrepareDone(new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).build());
            }
            if (this.mIsBuffering) {
                onBufferingEnd(new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).build());
            }
            if (this.mIsSeeking) {
                onSeekComplete(new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).build());
            }
            ParamRecord paramRecord = this.mParamRecord;
            if (paramRecord.startPlayTimeMs > 0) {
                int i = paramRecord.playDurationMs;
                long currentTimeMillis = System.currentTimeMillis();
                ParamRecord paramRecord2 = this.mParamRecord;
                paramRecord.playDurationMs = i + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
                paramRecord2.startPlayTimeMs = 0;
            }
            this.mIsSeeking = false;
            TPProperties tPProperties = new TPProperties();
            this.mReportParams.getBufferingTotalParams().paramsToProperties(tPProperties);
            this.mReportParams.getBufferingTotalParams().reset();
            this.mReportParams.getUserSeekTotalParams().paramsToProperties(tPProperties);
            this.mReportParams.getUserSeekTotalParams().reset();
            TPReportParams.PlayDoneParams playDoneParams = this.mReportParams.getPlayDoneParams();
            playDoneParams.endTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, System.currentTimeMillis());
            playDoneParams.reasonInt = getMapValueInteger(map, TPReportKeys.PlayerStep.PLAYER_REASON, 0);
            playDoneParams.errCodeString = this.mErrorCode;
            long j = this.mPlayStartTimeMs;
            if (j > 0) {
                this.mPlayDurationMs += playDoneParams.endTimeUnix - j;
                this.mPlayStartTimeMs = 0;
            }
            playDoneParams.playDurationFloat = ((float) this.mPlayDurationMs) / 1000.0f;
            playDoneParams.paramsToProperties(tPProperties);
            this.mReportHandler.handleReportEvent(50, tPProperties);
            this.mErrorCode = "0";
            this.mReportParams.resetAllParam();
            removeCacheEvent();
            resetLocalParam();
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerCreateDone(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayerCreateDone");
        if (map != null) {
            TPProperties tPProperties = new TPProperties();
            TPReportParams.PlayerInitParams initParams = this.mReportParams.getInitParams();
            initParams.playEndTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, System.currentTimeMillis());
            initParams.errCodeString = this.mErrorCode;
            initParams.paramsToProperties(tPProperties);
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerCreateStart(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayerCreateStart");
        if (map != null) {
            this.mReportParams.getInitParams().playStarTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerEarlyError(Map<String, Object> map) {
        if (map != null) {
            this.mFlowId = UUID.randomUUID().toString() + System.nanoTime() + "_" + TPPlayerConfig.getPlatform();
            this.mErrorCode = getMapValueString(map, "code", "0");
            TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
            if (tPDefaultReportInfo != null) {
                this.mPlayType = tPDefaultReportInfo.getPlayType();
            }
            if (this.mPlayType == 1) {
                this.mReportHandler.handleReportEvent(150, new TPProperties());
                return;
            }
            map.put(TPReportKeys.PlayerStep.PLAYER_REASON, 3);
            this.mIsPlayDone = false;
            onPlayEnd(map);
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerError(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayerError");
        if (map != null) {
            ParamRecord paramRecord = this.mParamRecord;
            if (paramRecord.startPlayTimeMs > 0) {
                int i = paramRecord.playDurationMs;
                long currentTimeMillis = System.currentTimeMillis();
                ParamRecord paramRecord2 = this.mParamRecord;
                paramRecord.playDurationMs = i + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
                paramRecord2.startPlayTimeMs = 0;
            }
            this.mErrorCode = getMapValueString(map, "code", "0");
            if (this.mPlayType == 1) {
                this.mReportHandler.handleReportEvent(150, new TPProperties());
                return;
            }
            map.put(TPReportKeys.PlayerStep.PLAYER_REASON, 3);
            onPlayEnd(map);
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerPause(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayerPause");
        if (map != null) {
            if (this.mPlayStartTimeMs > 0) {
                this.mPlayDurationMs += getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, System.currentTimeMillis()) - this.mPlayStartTimeMs;
                this.mPlayStartTimeMs = 0;
            }
            ParamRecord paramRecord = this.mParamRecord;
            if (paramRecord.startPlayTimeMs > 0) {
                int i = paramRecord.playDurationMs;
                long currentTimeMillis = System.currentTimeMillis();
                ParamRecord paramRecord2 = this.mParamRecord;
                paramRecord.playDurationMs = i + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
                paramRecord2.startPlayTimeMs = 0;
            }
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerRelease(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayerRelease");
        if (map != null) {
            map.put(TPReportKeys.PlayerStep.PLAYER_REASON, 1);
            onPlayEnd(map);
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerReset(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayerReset");
        if (map != null) {
            map.put(TPReportKeys.PlayerStep.PLAYER_REASON, 1);
            onPlayEnd(map);
        }
    }

    /* access modifiers changed from: private */
    public void onPlayerStop(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onPlayerStop");
        if (map != null) {
            if (this.mPlayStartTimeMs > 0) {
                this.mPlayDurationMs += getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, System.currentTimeMillis()) - this.mPlayStartTimeMs;
                this.mPlayStartTimeMs = 0;
            }
            ParamRecord paramRecord = this.mParamRecord;
            if (paramRecord.startPlayTimeMs > 0) {
                int i = paramRecord.playDurationMs;
                long currentTimeMillis = System.currentTimeMillis();
                ParamRecord paramRecord2 = this.mParamRecord;
                paramRecord.playDurationMs = i + ((int) (currentTimeMillis - paramRecord2.startPlayTimeMs));
                paramRecord2.startPlayTimeMs = 0;
            }
            map.put(TPReportKeys.PlayerStep.PLAYER_REASON, 1);
            onPlayEnd(map);
        }
    }

    /* access modifiers changed from: private */
    public void onPrepareDone(Map<String, Object> map) {
        if (this.mIsPrepare) {
            this.mIsPrepare = false;
            TPLogUtil.m21897i(TAG, "onPrepareDone");
            if (map != null) {
                this.mParamRecord.endPrepareTimeMs = System.currentTimeMillis();
                this.mParamRecord.isMultiTrack = getMapValueBool(map, TPReportKeys.VodExKeys.VOD_EX_MULTI_TRACK, false);
                TPProperties tPProperties = new TPProperties();
                if (getMapValueInteger(map, TPReportKeys.Common.COMMON_PLAYER_TYPE, 0) == 1) {
                    this.mPlayerType = 0;
                } else {
                    this.mPlayerType = 1;
                }
                this.mMediaResolution = getMapValueString(map, TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, "");
                this.mMediaDurationMs = getMapValueLong(map, "duration", 0);
                this.mMediaRate = (int) getMapValueLong(map, TPReportKeys.Common.COMMON_MEDIA_RATE, 0);
                String mapValueString = getMapValueString(map, TPReportKeys.Common.COMMON_MEDIA_FORMAT, "");
                if (mapValueString == null || !mapValueString.contains("hls")) {
                    this.mDownloadType = 1;
                } else {
                    this.mDownloadType = 3;
                }
                TPReportParams.FirstLoadParams firstLoadParams = this.mReportParams.getFirstLoadParams();
                firstLoadParams.endTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, 0);
                firstLoadParams.errCodeString = this.mErrorCode;
                firstLoadParams.paramsToProperties(tPProperties);
                this.mReportHandler.handleReportEvent(30, tPProperties);
                this.mReportParams.getFirstLoadParams().reset();
            }
        }
    }

    /* access modifiers changed from: private */
    public void onProxyInfoUpdate(Map<String, Object> map) {
        if (map != null) {
            int mapValueInteger = getMapValueInteger(map, TPReportKeys.Common.COMMON_NETWORK_SPEED, 0);
            this.mNetworkSpeed = mapValueInteger;
            ParamRecord paramRecord = this.mParamRecord;
            paramRecord.totalSpeed += mapValueInteger;
            paramRecord.getSpeedCnt++;
            if (mapValueInteger > paramRecord.maxSpeed) {
                paramRecord.maxSpeed = mapValueInteger;
            }
            String mapValueString = getMapValueString(map, TPReportKeys.LiveExKeys.LIVE_FX_SPANID, "");
            if (!TextUtils.isEmpty(mapValueString)) {
                try {
                    JSONObject jSONObject = new JSONObject(mapValueString);
                    if (jSONObject.has(TPReportKeys.LiveExKeys.LIVE_FX_SPANID)) {
                        this.mParamRecord.spanId = jSONObject.getString(TPReportKeys.LiveExKeys.LIVE_FX_SPANID);
                    }
                } catch (Exception e) {
                    TPLogUtil.m21895e(TAG, (Throwable) e);
                }
                getHitDownloadedInfo(mapValueString);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onRenderingStart(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onRenderingStart");
        if (map != null) {
            TPProperties tPProperties = new TPProperties();
            TPReportParams.FirstRenderParams firstRenderParams = this.mReportParams.getFirstRenderParams();
            firstRenderParams.endTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, 0);
            firstRenderParams.errCodeString = this.mErrorCode;
            firstRenderParams.paramsToProperties(tPProperties);
            this.mReportHandler.handleReportEvent(32, tPProperties);
            this.mReportParams.getFirstRenderParams().reset();
        }
    }

    /* access modifiers changed from: private */
    public void onReportEvent(ITPReportProperties iTPReportProperties) {
        String str;
        TPLogUtil.m21897i(TAG, "onReportEvent, needReportToBeacon:" + this.mNeedReportToBeacon + ", params:" + iTPReportProperties.toString());
        if (this.mNeedReportToBeacon) {
            HashMap hashMap = new HashMap();
            iTPReportProperties.propertiesToMap(hashMap);
            if (hashMap.containsKey(TPReportKeys.Common.COMMON_STEP) && (str = (String) hashMap.get(TPReportKeys.Common.COMMON_STEP)) != null) {
                String eventId = getEventId(Integer.parseInt(str));
                if (!TextUtils.isEmpty(eventId)) {
                    TPBeaconReportWrapper.trackCustomKVEvent(eventId, (Map<String, String>) hashMap);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void onReportLastEvent() {
        TPLogUtil.m21897i(TAG, "onReportLastEvent");
        TPDiskReadWrite tPDiskReadWrite = mCache;
        if (tPDiskReadWrite != null) {
            try {
                ArrayList arrayList = (ArrayList) tPDiskReadWrite.readAllFile();
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        try {
                            Properties properties = (Properties) arrayList.get(i);
                            if (properties != null) {
                                onReportEvent(new TPProperties(properties));
                            }
                        } catch (Exception e) {
                            TPLogUtil.m21895e(TAG, (Throwable) e);
                        }
                    }
                }
            } catch (Exception e2) {
                TPLogUtil.m21895e(TAG, (Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onReportProtocolUpdate(Map<String, Object> map) {
        this.mProto = getMapValueString(map, TPReportKeys.Common.COMMON_PROTO, "");
        this.mProtoVer = getMapValueString(map, TPReportKeys.Common.COMMON_PROTOVER, "");
    }

    /* access modifiers changed from: private */
    public void onSeekComplete(Map<String, Object> map) {
        TPReportParams.UserSeekOnceParams userSeekOnceParams;
        TPLogUtil.m21897i(TAG, "onSeekComplete");
        this.mIsSeeking = false;
        if (map != null && (userSeekOnceParams = this.mCurSeekParams) != null) {
            userSeekOnceParams.seekEndTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, System.currentTimeMillis());
            this.mCurSeekParams.endPresentTimeLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, 0) / 1000;
            TPReportParams.UserSeekOnceParams userSeekOnceParams2 = this.mCurSeekParams;
            userSeekOnceParams2.errCodeString = this.mErrorCode;
            long j = userSeekOnceParams2.seekEndTimeUnix - userSeekOnceParams2.seekStartTimeUnix;
            if (j > 1200) {
                this.mSeekBufferingCount++;
                this.mSeekBufferingDuration = (int) (((long) this.mSeekBufferingDuration) + j);
            }
            TPReportParams.UserSeekTotalParams userSeekTotalParams = this.mReportParams.getUserSeekTotalParams();
            userSeekTotalParams.seekTotalCountInt++;
            userSeekTotalParams.seekBufferingDurationInt = this.mSeekBufferingDuration;
            userSeekTotalParams.seekBufferingCountInt = this.mSeekBufferingCount;
            if (userSeekTotalParams.seekOnceParamsList.size() < 20) {
                userSeekTotalParams.seekOnceParamsList.add(this.mCurSeekParams);
                TPProperties tPProperties = new TPProperties();
                this.mCurSeekParams.paramsToProperties(tPProperties);
                this.mReportHandler.handleReportEvent(40, tPProperties);
            }
            this.mCurSeekParams = null;
        }
    }

    /* access modifiers changed from: private */
    public void onSelectTrack(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onSelectTrack");
        if (map != null && this.mParamRecord.subtitleInfos.size() != 0 && getMapValueInteger(map, TPReportKeys.PlayerStep.PLAYER_SELECT_TRACK_TYPE, 0) == 3) {
            this.mIsLoadingSubtitle = true;
            this.mParamRecord.isSelectedSubtitle = true;
            TPReportParams.LoadSubtitleParams loadSubtitleParams = this.mReportParams.getLoadSubtitleParams();
            loadSubtitleParams.starTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, 0);
            TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
            if (tPDefaultReportInfo != null) {
                loadSubtitleParams.cdnTypeInt = tPDefaultReportInfo.subtitleCdnType;
                loadSubtitleParams.cgiUrlIndex = tPDefaultReportInfo.subtitleUrlIndex;
            }
            long mapValueLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, -1);
            String mapValueString = getMapValueString(map, "name", "");
            Iterator<SubtitleInfo> it = this.mParamRecord.subtitleInfos.iterator();
            while (it.hasNext()) {
                SubtitleInfo next = it.next();
                if (!TextUtils.isEmpty(mapValueString) && next.name.equals(mapValueString)) {
                    loadSubtitleParams.subtitleUrlString = next.url;
                    next.opaque = mapValueLong;
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void onSelectTrackDone(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onSelectTrackDone");
        if (this.mIsLoadingSubtitle && map != null && this.mParamRecord.subtitleInfos.size() != 0) {
            long mapValueLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_CALLBACK_OPAQUE, -1);
            if (mapValueLong != -1) {
                Iterator<SubtitleInfo> it = this.mParamRecord.subtitleInfos.iterator();
                while (it.hasNext()) {
                    if (it.next().opaque == mapValueLong) {
                        TPReportParams.LoadSubtitleParams loadSubtitleParams = this.mReportParams.getLoadSubtitleParams();
                        loadSubtitleParams.endTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_END_TIME, 0);
                        loadSubtitleParams.errCodeString = getMapValueString(map, "code", "0");
                        loadSubtitleParams.bufferingDurationInt = (int) (loadSubtitleParams.endTimeUnix - loadSubtitleParams.starTimeUnix);
                        TPProperties tPProperties = new TPProperties();
                        loadSubtitleParams.paramsToProperties(tPProperties);
                        this.mReportHandler.handleReportEvent(33, tPProperties);
                        this.mIsLoadingSubtitle = false;
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void onSetPlaySpeed(Map<String, Object> map) {
        if (map != null) {
            if (getMapValueFloat(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1.0f) != 1.0f) {
                this.mPlayScene = 2;
            } else {
                this.mPlayScene = 1;
            }
        }
    }

    /* access modifiers changed from: private */
    public void onStartPlayer(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onStartPlayer");
        this.mIsPlayDone = false;
        if (map != null) {
            this.mParamRecord.startPlayTimeMs = System.currentTimeMillis();
            long mapValueLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, 0);
            if (this.mPlayStartTimeMs > 0) {
                this.mPlayDurationMs += System.currentTimeMillis() - mapValueLong;
            }
            this.mPlayStartTimeMs = mapValueLong;
            if (this.mPlayType == 1) {
                this.mEventHandler.removeMessages(3000);
                this.mEventHandler.sendEmptyMessageDelayed(3000, 60000);
            }
        }
    }

    /* access modifiers changed from: private */
    public void onStartPrepare(Map<String, Object> map) {
        if (!this.mIsPrepare) {
            TPLogUtil.m21897i(TAG, "onStartPrepare");
            this.mIsPlayDone = false;
            this.mFlowId = getMapValueString(map, TPReportKeys.Common.COMMON_FLOW_ID, "");
            this.mIsUseP2P = getMapValueBool(map, TPReportKeys.Common.COMMON_P2P, false);
            TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
            if (tPDefaultReportInfo != null) {
                this.mPlayType = tPDefaultReportInfo.getPlayType();
            }
            int i = this.mPlayType;
            if (i == 1) {
                this.mReportHandler = new LiveReportHandler();
            } else if (i == 0) {
                this.mReportHandler = new VodReportHandler();
            }
            TPProperties tPProperties = new TPProperties();
            this.mReportParams.getInitParams().paramsToProperties(tPProperties);
            this.mReportHandler.handleReportEvent(5, tPProperties);
            this.mParamRecord.startPrepareTimeMs = System.currentTimeMillis();
            TPReportParams.FirstLoadParams firstLoadParams = this.mReportParams.getFirstLoadParams();
            String str = this.mParamRecord.cdnUrl;
            firstLoadParams.cdnUrlString = str;
            if (TextUtils.isEmpty(str)) {
                firstLoadParams.cdnUrlString = getMapValueString(map, "url", "");
            }
            TPDefaultReportInfo tPDefaultReportInfo2 = this.mReportInfoGetter;
            if (tPDefaultReportInfo2 != null) {
                firstLoadParams.cgiUrlIndex = tPDefaultReportInfo2.cdnUrlIndex;
            }
            firstLoadParams.cgiUrlIndex = getMapValueInteger(map, TPReportKeys.PlayerStep.PLAYER_URL_INDEX, 0);
            firstLoadParams.starTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, 0);
            this.mReportParams.getFirstRenderParams().starTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, 0);
            this.mIsPrepare = true;
        }
    }

    /* access modifiers changed from: private */
    public void onStartSeek(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onStartSeek");
        if (map != null) {
            if (this.mIsBuffering) {
                onBufferingEnd(new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).build());
            }
            if (this.mIsSeeking) {
                onSeekComplete(new TPHashMapBuilder().put(TPReportKeys.PlayerStep.PLAYER_END_TIME, Long.valueOf(System.currentTimeMillis())).put(TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_END_TIME, Long.valueOf(getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, 0) / 1000)).build());
            }
            this.mIsSeeking = true;
            this.mLastEvent = 1;
            TPReportParams.UserSeekOnceParams createUserSeekOnceParams = this.mReportParams.createUserSeekOnceParams();
            this.mCurSeekParams = createUserSeekOnceParams;
            createUserSeekOnceParams.seekStartTimeUnix = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_START_TIME, System.currentTimeMillis());
            TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
            TPReportParams.UserSeekOnceParams userSeekOnceParams = this.mCurSeekParams;
            userSeekOnceParams.formatInt = commonParams.mediaFormatInt;
            userSeekOnceParams.startPresentTimeLong = getMapValueLong(map, TPReportKeys.PlayerStep.PLAYER_SEEK_PRESENT_START_TIME, 0) / 1000;
        }
    }

    /* access modifiers changed from: private */
    public void onSwitchDef(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onSwitchDef");
        if (map != null) {
            this.mParamRecord.defId = getMapValueString(map, TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, "");
            this.mParamRecord.isSwitchingDef = true;
            if (this.mPlayType == 1) {
                this.mEventHandler.removeMessages(3000);
                onLivePeriodReport();
                ParamRecord paramRecord = this.mParamRecord;
                paramRecord.startPrepareTimeMs = 0;
                paramRecord.endPrepareTimeMs = 0;
            }
        }
    }

    /* access modifiers changed from: private */
    public void onSwitchDefEnd(Map<String, Object> map) {
        TPLogUtil.m21897i(TAG, "onSwitchDefEnd");
        if (map != null) {
            this.mParamRecord.defId = getMapValueString(map, TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH, "");
            this.mParamRecord.isSwitchingDef = false;
            if (this.mPlayType == 1) {
                this.mReportHandler.handleReportEvent(30, new TPProperties());
                this.mEventHandler.removeMessages(3000);
                this.mEventHandler.sendEmptyMessageDelayed(3000, 60000);
                this.mParamRecord.startPlayTimeMs = System.currentTimeMillis();
            }
        }
    }

    private void release() {
        TPLogUtil.m21897i(TAG, "release: ");
        TPGlobalEventNofication.removeEventListener(this.mGlobalEventListener);
        HandlerThread handlerThread = this.mReportThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.mReportThread = null;
        }
        TPLogUtil.m21897i(TAG, "release: end!");
    }

    private void removeCacheEvent() {
        TPLogUtil.m21897i(TAG, "removeCacheEvent: mFlowId: " + this.mFlowId);
        if (mCache != null && !TextUtils.isEmpty(this.mFlowId)) {
            mCache.rmFile(this.mFlowId);
        }
    }

    private void resetLocalParam() {
        this.mPlayStartTimeMs = 0;
        this.mPlayDurationMs = 0;
        this.mSeekBufferingCount = 0;
        this.mSeekBufferingDuration = 0;
        this.mIsSeeking = false;
        this.mIsBuffering = false;
        this.mIsPrepare = false;
        this.mIsLoadingSubtitle = false;
        this.mFlowId = "";
        this.mPlayerType = 0;
        this.mDownloadType = 0;
        this.mMediaRate = 0;
        this.mMediaDurationMs = 0;
        this.mNetworkSpeed = 0;
        this.mIsUseP2P = false;
        this.mProto = "";
        this.mProtoVer = "";
        this.mMediaResolution = "";
        this.mPlayType = -1;
        this.mErrorCode = "0";
        this.mParamRecord.reset();
    }

    /* access modifiers changed from: private */
    public void updateCommonParam(ITPReportProperties iTPReportProperties, int i, boolean z) {
        TPReportParams.CommonParams commonParams = this.mReportParams.getCommonParams();
        commonParams.stepInt = i;
        commonParams.seqInt++;
        String str = this.mFlowId;
        commonParams.flowIdString = str;
        commonParams.playNoString = str;
        commonParams.signalStrengthInt = this.mSignalStrength;
        commonParams.networkSpeedInt = this.mNetworkSpeed;
        commonParams.networkTypeInt = getNetWorkType();
        commonParams.deviceNameString = TPSystemInfo.getDeviceName();
        commonParams.deviceResolutionString = getDeviceResolution();
        commonParams.osVersionString = OS_VERSION;
        commonParams.p2pVersionString = TPDownloadProxyHelper.getNativeLibVersion();
        commonParams.playerVersionString = TPPlayerConfig.VERSION;
        commonParams.playerTypeInt = this.mPlayerType;
        commonParams.p2pInt = this.mIsUseP2P ? 1 : 0;
        commonParams.proto = this.mProto;
        commonParams.protover = this.mProtoVer;
        commonParams.playTypeInt = this.mPlayType;
        TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
        if (tPDefaultReportInfo != null && z) {
            commonParams.testIdInt = tPDefaultReportInfo.testId;
            commonParams.cdnIdInt = tPDefaultReportInfo.cdnId;
            commonParams.downloadTypeInt = tPDefaultReportInfo.dlType;
            commonParams.loginTypeInt = tPDefaultReportInfo.loginType;
            commonParams.mediaFormatInt = tPDefaultReportInfo.mediaFormat;
            commonParams.mediaRateInt = tPDefaultReportInfo.mediaRate;
            commonParams.platformLong = tPDefaultReportInfo.platform;
            commonParams.onlineInt = tPDefaultReportInfo.isOnline ? 1 : 0;
            commonParams.mediaDurationFloat = tPDefaultReportInfo.mediaDuration;
            commonParams.uinString = tPDefaultReportInfo.uin;
            commonParams.qqOpenIdString = tPDefaultReportInfo.qqOpenId;
            commonParams.wxOpenIdString = tPDefaultReportInfo.wxOpenId;
            commonParams.guidString = tPDefaultReportInfo.guid;
            commonParams.uipString = tPDefaultReportInfo.uip;
            commonParams.cdnUipString = tPDefaultReportInfo.cdnUip;
            commonParams.cdnIpString = tPDefaultReportInfo.cdnIp;
            commonParams.appVersionString = tPDefaultReportInfo.appVersion;
            commonParams.vidString = tPDefaultReportInfo.vid;
            commonParams.mediaResolutionString = tPDefaultReportInfo.mediaResolution;
            commonParams.scenesId = tPDefaultReportInfo.scenesId;
            Properties properties = tPDefaultReportInfo.reportInfoProperties;
            if (properties != null) {
                for (Map.Entry entry : properties.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value == null) {
                        iTPReportProperties.put(key.toString(), "");
                    } else {
                        iTPReportProperties.put(key.toString(), value.toString());
                    }
                }
            }
            this.mPlayType = this.mReportInfoGetter.getPlayType();
        }
        if (commonParams.platformLong <= 0) {
            commonParams.platformLong = (long) TPPlayerConfig.getPlatform();
        }
        if (TextUtils.isEmpty(commonParams.uinString)) {
            commonParams.uinString = TPPlayerConfig.getUserUin();
        }
        if (TextUtils.isEmpty(commonParams.guidString)) {
            commonParams.guidString = TPPlayerConfig.getGuid();
        }
        if (TextUtils.isEmpty(commonParams.appVersionString)) {
            commonParams.appVersionString = TPPlayerConfig.getAppVersionName(this.mContext);
        }
        if (TextUtils.isEmpty(commonParams.uipString)) {
            commonParams.uipString = this.mParamRecord.cdnUip;
        }
        if (TextUtils.isEmpty(commonParams.cdnUipString)) {
            commonParams.cdnUipString = this.mParamRecord.cdnUip;
        }
        if (TextUtils.isEmpty(commonParams.cdnIpString)) {
            commonParams.cdnIpString = this.mParamRecord.cdnIp;
        }
        if (commonParams.downloadTypeInt <= 0) {
            commonParams.downloadTypeInt = this.mDownloadType;
        }
        if (TextUtils.isEmpty(commonParams.mediaResolutionString)) {
            commonParams.mediaResolutionString = this.mMediaResolution;
        }
        if (commonParams.mediaDurationFloat <= 0.0f) {
            commonParams.mediaDurationFloat = ((float) this.mMediaDurationMs) / 1000.0f;
        }
        if (commonParams.mediaRateInt <= 0) {
            commonParams.mediaRateInt = this.mMediaRate;
        }
        commonParams.paramsToProperties(iTPReportProperties);
    }

    /* access modifiers changed from: private */
    public void updateLiveExParam(ITPReportProperties iTPReportProperties, boolean z) {
        TPReportParams.LiveExParam liveExParam = this.mReportParams.getLiveExParam();
        if (liveExParam != null) {
            TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
            if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPLiveReportInfo) && z) {
                liveExParam.adPlayLengthInt = ((TPLiveReportInfo) tPDefaultReportInfo).adPlayLength;
                liveExParam.liveProgramIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).programId;
                liveExParam.streamIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).streamId;
                liveExParam.contentIdInt = ((TPLiveReportInfo) tPDefaultReportInfo).contentId;
                liveExParam.playTimeInt = ((TPLiveReportInfo) tPDefaultReportInfo).playTime;
                liveExParam.liveTypeInt = ((TPLiveReportInfo) tPDefaultReportInfo).liveType;
                liveExParam.isUserPayInt = ((TPLiveReportInfo) tPDefaultReportInfo).isUserPay ? 1 : 0;
                liveExParam.isLookBackInt = ((TPLiveReportInfo) tPDefaultReportInfo).isLookBack ? 1 : 0;
                liveExParam.cdnServerString = ((TPLiveReportInfo) tPDefaultReportInfo).cdnServer;
                liveExParam.freeTypeInt = tPDefaultReportInfo.freeType;
                liveExParam.userQQString = tPDefaultReportInfo.uin;
                liveExParam.userIpString = tPDefaultReportInfo.uip;
                liveExParam.isStreamP2PInt = tPDefaultReportInfo.enableP2p ? 1 : 0;
            }
            if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPLiveReportInfo)) {
                liveExParam.liveDelayInt = ((TPLiveReportInfo) tPDefaultReportInfo).liveDelay;
            }
            liveExParam.isUseP2PInt = this.mIsUseP2P ? 1 : 0;
            String str = this.mParamRecord.cdnUrl;
            liveExParam.downloadUrl = str;
            if (TextUtils.isEmpty(str)) {
                liveExParam.downloadUrl = this.mReportParams.getFirstLoadParams().cdnUrlString;
            }
            liveExParam.downloadServerIpString = this.mParamRecord.cdnIp;
            liveExParam.reportTimeLong = System.currentTimeMillis();
            ParamRecord paramRecord = this.mParamRecord;
            if (paramRecord.startPlayTimeMs > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                ParamRecord paramRecord2 = this.mParamRecord;
                paramRecord.playDurationMs = (int) (((long) paramRecord.playDurationMs) + (currentTimeMillis - paramRecord2.startPlayTimeMs));
                if (this.mIsPlayDone || this.mIsBuffering || paramRecord2.isSwitchingDef) {
                    paramRecord2.startPlayTimeMs = 0;
                } else {
                    paramRecord2.startPlayTimeMs = System.currentTimeMillis();
                }
            }
            ParamRecord paramRecord3 = this.mParamRecord;
            liveExParam.prePlayLengthInt = paramRecord3.playDurationMs;
            paramRecord3.playDurationMs = 0;
            liveExParam.playerVersionString = TPPlayerConfig.VERSION;
            liveExParam.deviceTypeInt = getDeviceType();
            liveExParam.networkTypeInt = getNetWorkType();
            ParamRecord paramRecord4 = this.mParamRecord;
            liveExParam.maxSpeedInt = paramRecord4.maxSpeed;
            paramRecord4.maxSpeed = 0;
            liveExParam.testSpeedInt = this.mNetworkSpeed;
            int i = paramRecord4.getSpeedCnt;
            if (i > 0) {
                liveExParam.downSpeedInt = paramRecord4.totalSpeed / i;
                paramRecord4.totalSpeed = 0;
                paramRecord4.getSpeedCnt = 0;
            }
            liveExParam.liveTagInt = 0;
            liveExParam.extraInfoString = "";
            liveExParam.reconnectCntInt = 0;
            liveExParam.connectTimeInt = 0;
            liveExParam.getUrlTimeInt = 0;
            liveExParam.defSwitchString = paramRecord4.defId;
            liveExParam.loadingTimeLong = paramRecord4.endPrepareTimeMs - paramRecord4.startPrepareTimeMs;
            liveExParam.blockTimeInt = paramRecord4.bufferingDurationMs;
            liveExParam.blockCountInt = paramRecord4.bufferingCount;
            paramRecord4.bufferingCount = 0;
            paramRecord4.bufferingDurationMs = 0;
            liveExParam.errCodeInt = 0;
            liveExParam.fullErrCodeString = this.mErrorCode;
            liveExParam.spanId = paramRecord4.spanId;
            liveExParam.tuid = paramRecord4.tuid;
            liveExParam.paramsToProperties(iTPReportProperties);
        }
    }

    /* access modifiers changed from: private */
    public void updateVodExParam(ITPReportProperties iTPReportProperties, boolean z) {
        TPReportParams.VodExParam vodExParam = this.mReportParams.getVodExParam();
        if (vodExParam != null) {
            TPDefaultReportInfo tPDefaultReportInfo = this.mReportInfoGetter;
            if (tPDefaultReportInfo != null && (tPDefaultReportInfo instanceof TPVodReportInfo) && z) {
                vodExParam.currentPlayInt = ((TPVodReportInfo) tPDefaultReportInfo).currentPlayState;
                vodExParam.optimizedPlayInt = ((TPVodReportInfo) tPDefaultReportInfo).optimizedPlay;
                vodExParam.hasSubtitleInt = ((TPVodReportInfo) tPDefaultReportInfo).hasSubtitles ? 1 : 0;
                vodExParam.bizIdInt = ((TPVodReportInfo) tPDefaultReportInfo).bizId;
                vodExParam.clipInt = ((TPVodReportInfo) tPDefaultReportInfo).clipCount;
                vodExParam.statusInt = ((TPVodReportInfo) tPDefaultReportInfo).videoStatus;
                vodExParam.freeTypeInt = tPDefaultReportInfo.freeType;
            }
            ParamRecord paramRecord = this.mParamRecord;
            vodExParam.multiTrackInt = paramRecord.isMultiTrack ? 1 : 0;
            vodExParam.isSelectedSubtitleInt = paramRecord.isSelectedSubtitle ? 1 : 0;
            vodExParam.hevcLcInt = 0;
            vodExParam.hitDownloaded = paramRecord.hitDownloaded;
            vodExParam.paramsToProperties(iTPReportProperties);
        }
    }

    public boolean doReportSampling() {
        if (Math.random() < this.mSamplingRate) {
            TPLogUtil.m21897i(TAG, "reports are sampled");
            this.mNeedReportToBeacon = true;
        } else {
            TPLogUtil.m21897i(TAG, "reports are not sampled");
            this.mNeedReportToBeacon = false;
        }
        return this.mNeedReportToBeacon;
    }

    public void onAttach() {
        init();
    }

    public void onDetach() {
        release();
    }

    public void onEvent(int i, int i2, int i3, String str, Object obj) {
        int i4;
        switch (i) {
            case 100:
                i4 = 999;
                break;
            case 101:
                i4 = 1000;
                break;
            case 102:
                i4 = 1001;
                break;
            case 103:
                i4 = 1002;
                break;
            case 104:
                i4 = 1003;
                break;
            case 105:
                i4 = 1012;
                break;
            case 106:
                i4 = 1004;
                break;
            case 107:
                i4 = 1005;
                break;
            case 108:
                i4 = 1006;
                break;
            case 109:
                i4 = 1007;
                break;
            case 110:
                i4 = 1008;
                break;
            case 111:
                i4 = 1009;
                break;
            case 112:
                i4 = 1010;
                break;
            case 113:
                i4 = 1011;
                break;
            case 114:
                i4 = 1013;
                break;
            case 115:
                i4 = 1014;
                break;
            case 116:
                i4 = 1015;
                break;
            case 117:
                i4 = 1016;
                break;
            case 118:
                i4 = 2002;
                break;
            case 119:
                i4 = TXLiveConstants.PUSH_EVT_ROOM_OUT;
                break;
            case 120:
                i4 = 1020;
                break;
            case 121:
                i4 = 1021;
                break;
            case 122:
                i4 = 2004;
                break;
            case 123:
                i4 = 2005;
                break;
            case 124:
                i4 = TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED;
                break;
            default:
                switch (i) {
                    case 200:
                        i4 = 1017;
                        break;
                    case 201:
                        i4 = 1018;
                        break;
                    case 202:
                        i4 = 1023;
                        break;
                    default:
                        return;
                }
        }
        this.mEventHandler.obtainMessage(i4, obj).sendToTarget();
    }

    public void reportEvent(int i, Map<String, Object> map) {
    }

    public void setReportInfoGetter(TPDefaultReportInfo tPDefaultReportInfo) {
        this.mReportInfoGetter = tPDefaultReportInfo;
    }

    public void setReportSamplingRate(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        }
        if (d > 1.0d) {
            d = 1.0d;
        }
        this.mSamplingRate = d;
    }
}
