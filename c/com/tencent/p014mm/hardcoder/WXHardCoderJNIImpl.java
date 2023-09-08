package com.tencent.p014mm.hardcoder;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.HardCoderSystemEvent;
import com.tencent.p014mm.hardcoder.C17774h;
import com.tencent.p014mm.hardcoder.C17776i;
import com.tencent.p014mm.hardcoder.C17778l;
import com.tencent.p014mm.hardcoder.HardCoderJNI;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C82613z;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.plugin.hardcoder.HardCoderReporterImpl;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import eu3.C116782a;
import eu3.C116783b;
import eu3.C58834h;
import f40.C86709a0;
import f40.C86718e;
import h40.C87422a;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import jc3.C87948i;
import kj2.C117407d;
import oa1.C117731d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import p675rj.C36329a;
import p823sg.C101615j;

@C86522b(dependencies = {C87948i.class}, onProcess = {C80625v0.MATCH_NOT_PLAIN_PROCESSES})
/* renamed from: com.tencent.mm.hardcoder.WXHardCoderJNIImpl */
public class WXHardCoderJNIImpl extends C86301e implements WXHardCoderJNI {
    private static String MANUFACTURER_STRING = "OPPO|vivo|Xiaomi|meizu|Meizu|samsung|Meitu|HMD Global|Hisense|asus|Lenovo|HUAWEI|GREE|TOSOT";
    private static String MODEL_STRING = "OPPO A57|OPPO R11t|PRO 7 Plus|M15|15 Lite|15 Plus|MP16|MP17|SM-N9600|SM-N9608|MI 8|Nokia X7|Nokia X6|HLTE311T|HLTE213T";
    private static final String TAG = "MicroMsg.WXHardCoderJNI";
    private static final boolean sHCREPORT = false;
    private final Map<Integer, Integer> APP_SCENE_ID_MAP = new HashMap();
    /* access modifiers changed from: private */
    public final Map<Integer, Integer> SCENE_ID_MAP = new HashMap();
    private final HashMap<Long, String> flagKeyMap = new HashMap<>();
    private C104632e funcRet = new C104632e() {
        public void onFuncRet(int i, long j, int i2, int i3, int i4, byte[] bArr) {
            JSONObject jSONObject;
            JSONException e;
            Log.m105924i(WXHardCoderJNIImpl.TAG, "FuncRetCallback callbackType:" + i + ", requestId:" + j + ", retCode:" + i2 + ", funcId:" + i3 + ", dataType:" + i4);
            if (i == 2) {
                int i5 = 0;
                if (i3 != 1015) {
                    if (i3 == 1019 && WXHardCoderJNIImpl.this.getParametersCallback != null) {
                        try {
                            jSONObject = new JSONObject(new String(bArr));
                            try {
                                i5 = jSONObject.getInt("getparameterstype");
                            } catch (JSONException e2) {
                                e = e2;
                                Log.m105924i(WXHardCoderJNIImpl.TAG, "onData parse get parameters e:" + e.getMessage());
                                Log.m105924i(WXHardCoderJNIImpl.TAG, "onData GET_PARAMETERS: " + jSONObject + ", type:" + i5);
                                WXHardCoderJNIImpl.this.getParametersCallback.onGetParameters(i5, jSONObject);
                            }
                        } catch (JSONException e3) {
                            JSONException jSONException = e3;
                            jSONObject = null;
                            e = jSONException;
                            Log.m105924i(WXHardCoderJNIImpl.TAG, "onData parse get parameters e:" + e.getMessage());
                            Log.m105924i(WXHardCoderJNIImpl.TAG, "onData GET_PARAMETERS: " + jSONObject + ", type:" + i5);
                            WXHardCoderJNIImpl.this.getParametersCallback.onGetParameters(i5, jSONObject);
                        }
                        Log.m105924i(WXHardCoderJNIImpl.TAG, "onData GET_PARAMETERS: " + jSONObject + ", type:" + i5);
                        WXHardCoderJNIImpl.this.getParametersCallback.onGetParameters(i5, jSONObject);
                    }
                } else if (WXHardCoderJNIImpl.this.systemEventCallback != null) {
                    try {
                        int optInt = new JSONObject(new String(bArr)).optInt("system_event_code", 0);
                        Log.m105924i(WXHardCoderJNIImpl.TAG, "onData SYSTEM_EVENT_CODE: " + optInt);
                        WXHardCoderJNIImpl.this.systemEventCallback.onEvent(optInt);
                    } catch (JSONException e4) {
                        Log.m105924i(WXHardCoderJNIImpl.TAG, "onData parse system event e:" + e4.getMessage());
                    }
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public C104630a getParametersCallback;
    private C17778l.C17779a hardCoderReporterInfo = null;
    private long hcAlbumScrollAction = 96;
    private int hcAlbumScrollCPU = 3;
    private int hcAlbumScrollDelay = 0;
    private boolean hcAlbumScrollEnable = true;
    private int hcAlbumScrollIO = 2;
    private boolean hcAlbumScrollThr = false;
    private int hcAlbumScrollTimeout = 1500;
    private int hcBeginTimeHour = 8;
    private int hcBeginTimeMin = 0;
    private boolean hcBgEnable = true;
    private long hcBizAction = 114690;
    private int hcBizCPU = 1;
    private int hcBizDelay = 0;
    private boolean hcBizEnable = true;
    private int hcBizIO = 1;
    private boolean hcBizThr = false;
    private int hcBizTimeout = 5000;
    private long hcBootAction = 4;
    private int hcBootCPU = 1;
    private int hcBootDelay = 0;
    private boolean hcBootEnable = true;
    private int hcBootIO = 0;
    private boolean hcBootThr = false;
    private int hcBootTimeout = 5000;
    private long hcDBActionQuery = 4096;
    private long hcDBActionWrite = 12288;
    private int hcDBCPU = 2;
    private int hcDBDelayQuery = 100;
    private int hcDBDelayWrite = 200;
    private boolean hcDBEnable = false;
    private int hcDBIO = 2;
    private boolean hcDBThr = false;
    private int hcDBTimeout = 500;
    private int hcDBTimeoutBusy = 5000;
    private long hcDecodePicAction = 16448;
    private int hcDecodePicCPU = 2;
    private int hcDecodePicDelay = 100;
    private boolean hcDecodePicEnable = false;
    private int hcDecodePicIO = 2;
    private boolean hcDecodePicThr = false;
    private int hcDecodePicTimeout = 500;
    private long hcEncodeVideoAction = 81984;
    private int hcEncodeVideoCPU = 1;
    private int hcEncodeVideoDelay = 0;
    private boolean hcEncodeVideoEnable = true;
    private int hcEncodeVideoIO = 1;
    private boolean hcEncodeVideoThr = false;
    private int hcEncodeVideoTimeout = 20000;
    private int hcEndTimeHour = 23;
    private int hcEndTimeMin = 0;
    private long hcEnterChattingAction = 12294;
    private int hcEnterChattingCPU = 1;
    private int hcEnterChattingDelay = 0;
    private boolean hcEnterChattingEnable = true;
    private int hcEnterChattingIO = 1;
    private boolean hcEnterChattingThr = false;
    private int hcEnterChattingTimeout = 1000;
    private long hcGifAction = 81984;
    private int hcGifCPU = 3;
    private int hcGifDelay = 0;
    private boolean hcGifEnable = true;
    private long hcGifFrameAction = 65600;
    private int hcGifFrameCPU = 2;
    private int hcGifFrameDelay = 0;
    private boolean hcGifFrameEnable = true;
    private int hcGifFrameIO = 0;
    private boolean hcGifFrameThr = false;
    private int hcGifFrameTimeout = 1000;
    private int hcGifIO = 2;
    private boolean hcGifThr = false;
    private int hcGifTimeout = 500;
    private boolean hcKVFtReport = false;
    private boolean hcKVPerReport = false;
    private long hcMediaGalleryScrollAction = 96;
    private int hcMediaGalleryScrollCPU = 3;
    private int hcMediaGalleryScrollDelay = 0;
    private boolean hcMediaGalleryScrollEnable = true;
    private int hcMediaGalleryScrollIO = 2;
    private boolean hcMediaGalleryScrollThr = false;
    private int hcMediaGalleryScrollTimeout = 1500;
    private long hcMiniProgramLaunchAction = 114688;
    private int hcMiniProgramLaunchCPU = 1;
    private int hcMiniProgramLaunchDelay = 500;
    private boolean hcMiniProgramLaunchEnable = true;
    private int hcMiniProgramLaunchIO = 1;
    private boolean hcMiniProgramLaunchThr = false;
    private int hcMiniProgramLaunchTimeout = 5000;
    private long hcQuitChattingAction = 8194;
    private int hcQuitChattingCPU = 2;
    private int hcQuitChattingDelay = 0;
    private boolean hcQuitChattingEnable = true;
    private int hcQuitChattingIO = 2;
    private boolean hcQuitChattingThr = false;
    private int hcQuitChattingTimeout = 800;
    private long hcReceiveMsgAction = 127040;
    private int hcReceiveMsgCPU = 2;
    private int hcReceiveMsgDelay = 500;
    private boolean hcReceiveMsgEnable = true;
    private int hcReceiveMsgIO = 2;
    private boolean hcReceiveMsgThr = true;
    private int hcReceiveMsgTimeout = 1000;
    private int hcRetryInterval = 30;
    private long hcSNSMsgScrollAction = 96;
    private int hcSNSMsgScrollCPU = 3;
    private int hcSNSMsgScrollDelay = 0;
    private boolean hcSNSMsgScrollEnable = true;
    private int hcSNSMsgScrollIO = 2;
    private boolean hcSNSMsgScrollThr = false;
    private int hcSNSMsgScrollTimeout = 1500;
    private long hcSNSScrollAction = 96;
    private int hcSNSScrollCPU = 2;
    private int hcSNSScrollDelay = 0;
    private boolean hcSNSScrollEnable = true;
    private int hcSNSScrollIO = 2;
    private boolean hcSNSScrollThr = false;
    private int hcSNSScrollTimeout = 1500;
    private long hcSNSUserScrollAction = 96;
    private int hcSNSUserScrollCPU = 3;
    private int hcSNSUserScrollDelay = 0;
    private boolean hcSNSUserScrollEnable = true;
    private int hcSNSUserScrollIO = 2;
    private boolean hcSNSUserScrollThr = false;
    private int hcSNSUserScrollTimeout = 1500;
    private long hcSendMsgAction = 12288;
    private int hcSendMsgCPU = 3;
    private int hcSendMsgDelay = 0;
    private boolean hcSendMsgEnable = true;
    private int hcSendMsgIO = 0;
    private boolean hcSendMsgThr = true;
    private int hcSendMsgTimeout = 1000;
    private long hcSendPicMsgAction = 123072;
    private int hcSendPicMsgCPU = 1;
    private int hcSendPicMsgDelay = 0;
    private boolean hcSendPicMsgEnable = true;
    private int hcSendPicMsgIO = 2;
    private boolean hcSendPicMsgThr = true;
    private int hcSendPicMsgTimeout = 500;
    private boolean hcTimeLimit = false;
    private int hcTimeoutMargin = 0;
    private int hcUinHash = 0;
    private long hcUpdateChatroomAction = 127040;
    private int hcUpdateChatroomCPU = 2;
    private int hcUpdateChatroomDelay = 0;
    private boolean hcUpdateChatroomEnable = true;
    private int hcUpdateChatroomIO = 2;
    private long hcUpdateChatroomMemberCount = 50;
    private boolean hcUpdateChatroomThr = true;
    private int hcUpdateChatroomTimeout = 1000;
    private Method mGetStringPropsMethod = null;
    private volatile Class<?> mSystemPropertiesClazz = null;
    /* access modifiers changed from: private */
    public boolean needMapAPPScene = false;
    private C17773g sceneReportCallback = new C17773g() {
        public void sceneReport(int i, long j) {
            Integer num;
            if (!WXHardCoderJNIImpl.this.needMapAPPScene && (num = (Integer) WXHardCoderJNIImpl.this.SCENE_ID_MAP.get(Integer.valueOf(i))) != null) {
                WXHardCoderJNIImpl.this.reportInfo(new C17781n(num.intValue(), j));
            }
        }
    };
    /* access modifiers changed from: private */
    public C104633j systemEventCallback;
    private C17774h.C17775a wxHardCoderLog = new C17774h.C17775a() {
        /* renamed from: d */
        public void mo21742d(String str, String str2) {
            Log.m105918d(str, str2);
        }

        /* renamed from: e */
        public void mo21743e(String str, String str2) {
            Log.m105920e(str, str2);
        }

        /* renamed from: i */
        public void mo21744i(String str, String str2) {
            Log.m105924i(str, str2);
        }

        public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
            Log.printErrStackTrace(str, th, str2, objArr);
        }
    };

    private boolean booleanChanged(SharedPreferences sharedPreferences, String str, boolean z) {
        return sharedPreferences.getBoolean(str, z) != z;
    }

    private boolean checkHardCoderEnv() {
        String str = Build.MANUFACTURER;
        String k = C87203t.m108275k();
        String readServerAddr = readServerAddr(false);
        Log.m105925i(TAG, "checkHardCoderEnv manufacture[%s], model[%s], remote[%s]", str, k, readServerAddr);
        return true ^ Util.isNullOrNil(readServerAddr);
    }

    private void initSceneAndFlagMap() {
        this.SCENE_ID_MAP.clear();
        this.APP_SCENE_ID_MAP.clear();
        this.SCENE_ID_MAP.put(101, 1);
        this.SCENE_ID_MAP.put(201, 2);
        this.SCENE_ID_MAP.put(202, 3);
        this.SCENE_ID_MAP.put(203, 4);
        this.SCENE_ID_MAP.put(301, 5);
        this.SCENE_ID_MAP.put(302, 6);
        this.SCENE_ID_MAP.put(401, 7);
        this.SCENE_ID_MAP.put(501, 8);
        this.SCENE_ID_MAP.put(601, 9);
        this.SCENE_ID_MAP.put(602, 10);
        this.SCENE_ID_MAP.put(603, 11);
        this.SCENE_ID_MAP.put(701, 12);
        this.SCENE_ID_MAP.put(702, 13);
        this.SCENE_ID_MAP.put(703, 14);
        this.SCENE_ID_MAP.put(704, 15);
        this.SCENE_ID_MAP.put(705, 16);
        this.SCENE_ID_MAP.put(Integer.valueOf(C1862l.CTRL_INDEX), 17);
        this.SCENE_ID_MAP.put(901, 18);
        this.SCENE_ID_MAP.put(Integer.valueOf(C82613z.CTRL_INDEX), 19);
        this.SCENE_ID_MAP.put(903, 20);
        this.SCENE_ID_MAP.put(706, 21);
        this.SCENE_ID_MAP.put(707, 22);
        this.APP_SCENE_ID_MAP.put(101, 1);
        this.APP_SCENE_ID_MAP.put(201, 6);
        this.APP_SCENE_ID_MAP.put(202, 6);
        this.APP_SCENE_ID_MAP.put(203, 5);
        this.APP_SCENE_ID_MAP.put(301, 2);
        this.APP_SCENE_ID_MAP.put(302, 2);
        this.APP_SCENE_ID_MAP.put(401, 6);
        this.APP_SCENE_ID_MAP.put(501, 4);
        this.APP_SCENE_ID_MAP.put(601, 5);
        this.APP_SCENE_ID_MAP.put(602, 5);
        this.APP_SCENE_ID_MAP.put(603, 5);
        this.APP_SCENE_ID_MAP.put(701, 3);
        this.APP_SCENE_ID_MAP.put(702, 3);
        this.APP_SCENE_ID_MAP.put(703, 3);
        this.APP_SCENE_ID_MAP.put(704, 3);
        this.APP_SCENE_ID_MAP.put(705, 3);
        this.APP_SCENE_ID_MAP.put(Integer.valueOf(C1862l.CTRL_INDEX), 1);
        this.APP_SCENE_ID_MAP.put(901, 2);
        this.APP_SCENE_ID_MAP.put(Integer.valueOf(C82613z.CTRL_INDEX), 2);
        this.APP_SCENE_ID_MAP.put(903, 3);
        this.APP_SCENE_ID_MAP.put(706, 2);
        this.APP_SCENE_ID_MAP.put(707, 7);
        this.flagKeyMap.put(2L, "KEY_HC_BOOT_ENABLE");
        this.flagKeyMap.put(4L, "KEY_HC_RECEIVE_MSG_ENABLE");
        this.flagKeyMap.put(8L, "KEY_HC_SEND_MSG_ENABLE");
        this.flagKeyMap.put(16L, "KEY_HC_SEND_PIC_MSG_ENABLE");
        this.flagKeyMap.put(32L, "KEY_HC_ENTER_CHATTING_ENABLE");
        this.flagKeyMap.put(64L, "KEY_HC_QUIT_CHATTING_ENABLE");
        this.flagKeyMap.put(128L, "KEY_HC_UPDATE_CHATROOM_ENABLE");
        this.flagKeyMap.put(256L, "KEY_HC_DB_ENABLE");
        this.flagKeyMap.put(512L, "KEY_HC_DECODE_PIC_ENABLE");
        this.flagKeyMap.put(1024L, "KEY_HC_GIF_ENABLE");
        this.flagKeyMap.put(2048L, "KEY_HC_GIF_FRAME_ENABLE");
        this.flagKeyMap.put(4096L, "KEY_HC_ENCODE_VIDEO_ENABLE");
        this.flagKeyMap.put(8192L, "KEY_HC_SNS_SCROLL_ENABLE");
        this.flagKeyMap.put(16384L, "KEY_HCALBUM_SCROLL_ENABLE");
        this.flagKeyMap.put(32768L, "KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE");
        this.flagKeyMap.put(65536L, "KEY_HC_SNS_USER_SCROLL_ENABLE");
        this.flagKeyMap.put(131072L, "KEY_HC_SNS_MSG_SCROLL_ENABLE");
        this.flagKeyMap.put(262144L, "KEY_HC_MINI_PROGRAM_LAUNCH_ENABLE");
    }

    private boolean intChanged(SharedPreferences sharedPreferences, String str, int i) {
        return sharedPreferences.getInt(str, i) != i;
    }

    private boolean longChanged(SharedPreferences sharedPreferences, String str, long j) {
        return sharedPreferences.getLong(str, j) != j;
    }

    private void reloadHardcoderConfig() {
        int i;
        boolean z;
        SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("hardcoder_setting", 0).edit();
        boolean z2 = Util.getInt(C117731d.m166007c().mo182444f("clicfg_enable", "1", false, true), getEnable() ? 1 : 0) > 0;
        boolean z3 = z2 && !getEnable();
        edit.putBoolean("KEY_HC_ENABLE", z2);
        edit.putBoolean("KEY_HC_BG_ENABLE", Util.getInt(C117731d.m166007c().mo182444f("clicfg_bgenable", "1", false, true), this.hcBgEnable ? 1 : 0) > 0);
        edit.putBoolean("KEY_HC_DEBUG", Util.getInt(C117731d.m166007c().mo182444f("clicfg_debug", "1", false, true), getDebug() ? 1 : 0) > 0);
        edit.putInt("KEY_HC_KV_PER", Util.getInt(C117731d.m166007c().mo182444f("clicfg_kvper", "50", false, true), this.hcUinHash));
        edit.putInt("KEY_HC_KV_FT", Util.getInt(C117731d.m166007c().mo182444f("clicfg_kvft", PayuSecureEncrypt.ENCRYPT_VERSION_HASH, false, true), this.hcUinHash));
        C86709a0.m107528h();
        int b = C101615j.m133462b(C86709a0.m107523b().mo121110g(), 100);
        edit.putInt("KEY_HC_UIN_HASH", b);
        long j = Util.getLong(C117731d.m166007c().mo182444f("clicfg_scene", "523518", false, true), -1);
        for (Map.Entry next : this.flagKeyMap.entrySet()) {
            edit.putBoolean((String) next.getValue(), (((Long) next.getKey()).longValue() & j) != 0);
        }
        int i2 = Util.getInt(C117731d.m166007c().mo182444f("clicfg_margin", PayuSecureEncrypt.ENCRYPT_VERSION_HASH, false, true), this.hcTimeoutMargin);
        edit.putInt("KEY_HC_TIMEOUT_MARGIN", i2);
        int i3 = Util.getInt(C117731d.m166007c().mo182444f("clicfg_retryitv", "300", false, true), this.hcRetryInterval);
        edit.putInt("KEY_HC_RETRY_INTERVAL", i3);
        String nullAs = Util.nullAs(C117731d.m166007c().mo182444f("clicfg_model", MODEL_STRING, false, true), MODEL_STRING);
        String k = C87203t.m108275k();
        String nullAs2 = Util.nullAs(C117731d.m166007c().mo182444f("clicfg_manufacturer", MANUFACTURER_STRING, false, true), MANUFACTURER_STRING);
        String str = Build.MANUFACTURER;
        if (nullAs2.length() > 0 || nullAs.length() > 0) {
            boolean contains = nullAs2.contains(str);
            if (!contains) {
                contains = nullAs.contains(k);
            }
            reportIDKey(true, contains ? 10 : 11, 1, true);
            edit.putBoolean("KEY_HC_ENABLE", contains);
            if (!contains || getEnable()) {
                i = i3;
                z = false;
            } else {
                i = i3;
                z = true;
            }
            Log.m105925i(TAG, "reloadHardcoderConfig check manufacturer[%s] manufacturerlist[%s] model[%s] modellist[%s] enable[%b] init[%b]", str, nullAs2, k, nullAs, Boolean.valueOf(contains), Boolean.valueOf(z));
            z3 = z;
        } else {
            reportIDKey(true, 12, 1, true);
            i = i3;
        }
        edit.apply();
        Log.m105925i(TAG, "reloadHardcoderConfig enable[%b] init[%b] bgEnable[%b] debug[%b] uinHash[%d] kv[%b, %b] sceneFlag[%d] margin[%d] retryInterval[%d] model[%s]", Boolean.valueOf(getEnable()), Boolean.valueOf(z3), Boolean.valueOf(this.hcBgEnable), Boolean.valueOf(getDebug()), Integer.valueOf(b), Boolean.valueOf(this.hcKVPerReport), Boolean.valueOf(this.hcKVFtReport), Long.valueOf(j), Integer.valueOf(i2), Integer.valueOf(i), nullAs);
    }

    private void report() {
        C117407d.INSTANCE.mo160131h(21019, Boolean.FALSE, 0, 11003, "");
    }

    /* access modifiers changed from: private */
    public void reportInfo(C17778l lVar) {
        C17778l lVar2 = lVar;
        C17778l.C17779a aVar = this.hardCoderReporterInfo;
        if (aVar != null) {
            HardCoderReporterImpl hardCoderReporterImpl = (HardCoderReporterImpl) aVar;
            hardCoderReporterImpl.getClass();
            Class cls = WXHardCoderJNI.class;
            if (lVar2 instanceof C17781n) {
                C17781n nVar = (C17781n) lVar2;
                Log.m105925i("MicroMsg.HardCoderReporterImpl", "reportIDKey feature[%b] key[%d], value[%d]", Boolean.valueOf(nVar.f48950a), Integer.valueOf(nVar.f48951b), Integer.valueOf(nVar.f48952c), Boolean.valueOf(nVar.f48953d));
                long j = nVar.f48950a ? 678 : 679;
                long j2 = (long) nVar.f48951b;
                long j3 = (long) nVar.f48952c;
                boolean z = nVar.f48953d;
                if (!MMApplicationContext.isMMProcess()) {
                    C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
                } else if (C86709a0.m107523b().f251765p) {
                    C115669n.INSTANCE.idkeyStat(j, j2, j3, z);
                } else {
                    Log.m105928w("MicroMsg.HardCoderReporterImpl", "idkeyStat accountNotInitialReady!");
                    hardCoderReporterImpl.f81461c.alive();
                    hardCoderReporterImpl.f81460b.add(new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z)});
                }
            } else if (lVar2 instanceof C17780m) {
                C17780m mVar = (C17780m) lVar2;
                if (HardCoderReporterImpl.f81456e == null) {
                    C86709a0.m107528h();
                    HardCoderReporterImpl.f81456e = (Long) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_HEAVY_USER_FLAG_LONG, 0L);
                }
                if (TextUtils.isEmpty(HardCoderReporterImpl.f81455d)) {
                    HardCoderReporterImpl.f81455d = C87203t.m108270f(false);
                }
                String str = HardCoderReporterImpl.f81455d;
                int longValue = (int) HardCoderReporterImpl.f81456e.longValue();
                boolean isHCEnable = ((WXHardCoderJNI) C86312j.m106911c(cls)).isHCEnable();
                int isRunning = ((WXHardCoderJNI) C86312j.m106911c(cls)).isRunning();
                boolean enable = ((WXHardCoderJNI) C86312j.m106911c(cls)).getEnable();
                if (mVar.f48947c == 1) {
                    long j4 = (mVar.f48948d * 100) / mVar.f48949e;
                    hardCoderReporterImpl.mo57165a(15187, str, Integer.valueOf(longValue), Integer.valueOf(isHCEnable ? 1 : 0), Integer.valueOf(isRunning), Integer.valueOf(mVar.f48945a), Long.valueOf(mVar.f48946b), Integer.valueOf(mVar.f48947c), Long.valueOf(mVar.f48948d), Long.valueOf(mVar.f48949e), Long.valueOf(j4), Integer.valueOf(enable ? 1 : 0));
                    Log.m105924i("MicroMsg.HardCoderReporterImpl", String.format("fpsReport imei:%s enable:%s, heavy:%s speedUp:%s, engineStatus:%s, scene:%s, action:%s, type:%s, totalDroppedFrames:%s, interval:%s, average:%s", new Object[]{str, Integer.valueOf(enable), Integer.valueOf(longValue), Integer.valueOf(isHCEnable), Integer.valueOf(isRunning), Integer.valueOf(mVar.f48945a), Long.valueOf(mVar.f48946b), Integer.valueOf(mVar.f48947c), Long.valueOf(mVar.f48948d), Long.valueOf(mVar.f48949e), Long.valueOf(j4)}));
                }
            } else if (lVar2 instanceof C17782o) {
                hardCoderReporterImpl.mo57165a(16509, new Object[0]);
            }
        }
    }

    private void reportModifiedConfig() {
        if (MMApplicationContext.isMainProcess()) {
            boolean z = false;
            SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("hardcoder_setting", 0);
            if ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((intChanged(sharedPreferences, "KEY_HC_BEGIN_TIME_HOUR", 8)) || intChanged(sharedPreferences, "KEY_HC_BEGIN_TIME_MIN", 0)) || intChanged(sharedPreferences, "KEY_HC_END_TIME_HOUR", 23)) || intChanged(sharedPreferences, "KEY_HC_END_TIME_MIN", 0)) || intChanged(sharedPreferences, "KEY_HC_BOOT_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_BOOT_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_BOOT_IO", 0)) || booleanChanged(sharedPreferences, "KEY_HC_BOOT_THR", false)) || intChanged(sharedPreferences, "KEY_HC_BOOT_TIMEOUT", 5000)) || longChanged(sharedPreferences, "KEY_HC_BOOT_ACTION", 4)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_IO", 1)) || booleanChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_THR", false)) || intChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_ENTER_CHATTING_ACTION", 12294)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_THR", false)) || intChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_TIMEOUT", 800)) || longChanged(sharedPreferences, "KEY_HC_QUIT_CHATTING_ACTION", 8194)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_IO", 0)) || booleanChanged(sharedPreferences, "KEY_HC_SEND_MSG_THR", true)) || intChanged(sharedPreferences, "KEY_HC_SEND_MSG_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_SEND_MSG_ACTION", 12288)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_THR", true)) || intChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_TIMEOUT", 500)) || longChanged(sharedPreferences, "KEY_HC_SEND_PIC_MSG_ACTION", 123072)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_DELEY", 500)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_THR", true)) || intChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_RECEIVE_MSG_ACTION", 127040)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_THR", true)) || intChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_ACTION", 127040)) || longChanged(sharedPreferences, "KEY_HC_UPDATE_CHATROOM_MEMBER_COUNT", 50)) || intChanged(sharedPreferences, "KEY_HC_DB_DELEY_QUERY", 100)) || intChanged(sharedPreferences, "KEY_HC_DB_DELEY_WRITE", 200)) || intChanged(sharedPreferences, "KEY_HC_DB_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_DB_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_DB_THR", false)) || intChanged(sharedPreferences, "KEY_HC_DB_TIMEOUT", 500)) || intChanged(sharedPreferences, "KEY_HC_DB_TIMEOUT_BUSY", 5000)) || longChanged(sharedPreferences, "KEY_HC_DB_ACTION_QUERY", 4096)) || longChanged(sharedPreferences, "KEY_HC_DB_ACTION_WRITE", 12288)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_IO", 1)) || booleanChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_THR", false)) || intChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_TIMEOUT", 20000)) || longChanged(sharedPreferences, "KEY_HC_ENCODE_VIDEO_ACTION", 81984)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_DELEY", 100)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_DECODE_PIC_THR", false)) || intChanged(sharedPreferences, "KEY_HC_DECODE_PIC_TIMEOUT", 500)) || longChanged(sharedPreferences, "KEY_HC_DECODE_PIC_ACTION", 16448)) || intChanged(sharedPreferences, "KEY_HC_GIF_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_GIF_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_GIF_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_GIF_THR", false)) || intChanged(sharedPreferences, "KEY_HC_GIF_TIMEOUT", 500)) || longChanged(sharedPreferences, "KEY_HC_GIF_ACTION", 81984)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_IO", 0)) || booleanChanged(sharedPreferences, "KEY_HC_GIF_FRAME_THR", false)) || intChanged(sharedPreferences, "KEY_HC_GIF_FRAME_TIMEOUT", 1000)) || longChanged(sharedPreferences, "KEY_HC_GIF_FRAME_ACTION", 65600)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_CPU", 2)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_SNS_SCROLL_ACTION", 96)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_SNS_USER_SCROLL_ACTION", 96)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_SNS_MSG_SCROLL_ACTION", 96)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_MEDIA_GALLERY_SCROLL_ACTION", 96)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_DELEY", 0)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_CPU", 3)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_IO", 2)) || booleanChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_THR", false)) || intChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_TIMEOUT", 1500)) || longChanged(sharedPreferences, "KEY_HC_ALBUM_SCROLL_ACTION", 96)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_DELEY", 500)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_CPU", 1)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_IO", 1)) || booleanChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_THR", false)) || intChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_TIMEOUT", 5000)) || longChanged(sharedPreferences, "KEY_HC_MINI_PROGRAM_LAUNCH_ACTION", 114688)) {
                z = true;
            }
            if (z) {
                report();
            }
        }
    }

    private void requireAccountInitializedOnDemand() {
        if (C86709a0.m107522a()) {
            C86718e eVar = C86709a0.m107528h().f251728e;
            boolean z = false;
            if (eVar != null) {
                if (eVar.f251764o) {
                    z = true;
                }
            }
            if (z) {
                requireAccountInitialized();
            }
        }
    }

    public boolean getDebug() {
        requireAccountInitializedOnDemand();
        return HardCoderJNI.isHcDebug();
    }

    public boolean getEnable() {
        requireAccountInitializedOnDemand();
        return HardCoderJNI.isHcEnable();
    }

    public boolean getHCKVPerReport() {
        return this.hcKVPerReport;
    }

    public long getHcAlbumScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollAction;
    }

    public int getHcAlbumScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollCPU;
    }

    public int getHcAlbumScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollDelay;
    }

    public boolean getHcAlbumScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollEnable;
    }

    public int getHcAlbumScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollIO;
    }

    public boolean getHcAlbumScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollThr;
    }

    public int getHcAlbumScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcAlbumScrollTimeout;
    }

    public int getHcBeginTimeHour() {
        requireAccountInitializedOnDemand();
        return this.hcBeginTimeHour;
    }

    public int getHcBeginTimeMin() {
        requireAccountInitializedOnDemand();
        return this.hcBeginTimeMin;
    }

    public boolean getHcBgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcBgEnable;
    }

    public long getHcBizAction() {
        requireAccountInitializedOnDemand();
        return this.hcBizAction;
    }

    public int getHcBizCPU() {
        requireAccountInitializedOnDemand();
        return this.hcBizCPU;
    }

    public int getHcBizDelay() {
        requireAccountInitializedOnDemand();
        return this.hcBizDelay;
    }

    public boolean getHcBizEnable() {
        requireAccountInitializedOnDemand();
        return this.hcBizEnable;
    }

    public int getHcBizIO() {
        requireAccountInitializedOnDemand();
        return this.hcBizIO;
    }

    public boolean getHcBizThr() {
        requireAccountInitializedOnDemand();
        return this.hcBizThr;
    }

    public int getHcBizTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcBizTimeout;
    }

    public long getHcBootAction() {
        requireAccountInitializedOnDemand();
        return this.hcBootAction;
    }

    public int getHcBootCPU() {
        requireAccountInitializedOnDemand();
        return this.hcBootCPU;
    }

    public int getHcBootDelay() {
        requireAccountInitializedOnDemand();
        return this.hcBootDelay;
    }

    public boolean getHcBootEnable() {
        requireAccountInitializedOnDemand();
        return this.hcBootEnable;
    }

    public int getHcBootIO() {
        requireAccountInitializedOnDemand();
        return this.hcBootIO;
    }

    public boolean getHcBootThr() {
        requireAccountInitializedOnDemand();
        return this.hcBootThr;
    }

    public int getHcBootTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcBootTimeout;
    }

    public long getHcDBActionQuery() {
        requireAccountInitializedOnDemand();
        return this.hcDBActionQuery;
    }

    public long getHcDBActionWrite() {
        requireAccountInitializedOnDemand();
        return this.hcDBActionWrite;
    }

    public int getHcDBCPU() {
        requireAccountInitializedOnDemand();
        return this.hcDBCPU;
    }

    public int getHcDBDelayQuery() {
        requireAccountInitializedOnDemand();
        return this.hcDBDelayQuery;
    }

    public int getHcDBDelayWrite() {
        requireAccountInitializedOnDemand();
        return this.hcDBDelayWrite;
    }

    public boolean getHcDBEnable() {
        requireAccountInitializedOnDemand();
        return this.hcDBEnable;
    }

    public int getHcDBIO() {
        requireAccountInitializedOnDemand();
        return this.hcDBIO;
    }

    public boolean getHcDBThr() {
        requireAccountInitializedOnDemand();
        return this.hcDBThr;
    }

    public int getHcDBTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcDBTimeout;
    }

    public int getHcDBTimeoutBusy() {
        requireAccountInitializedOnDemand();
        return this.hcDBTimeoutBusy;
    }

    public long getHcDecodePicAction() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicAction;
    }

    public int getHcDecodePicCPU() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicCPU;
    }

    public int getHcDecodePicDelay() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicDelay;
    }

    public boolean getHcDecodePicEnable() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicEnable;
    }

    public int getHcDecodePicIO() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicIO;
    }

    public boolean getHcDecodePicThr() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicThr;
    }

    public int getHcDecodePicTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcDecodePicTimeout;
    }

    public long getHcEncodeVideoAction() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoAction;
    }

    public int getHcEncodeVideoCPU() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoCPU;
    }

    public int getHcEncodeVideoDelay() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoDelay;
    }

    public boolean getHcEncodeVideoEnable() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoEnable;
    }

    public int getHcEncodeVideoIO() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoIO;
    }

    public boolean getHcEncodeVideoThr() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoThr;
    }

    public int getHcEncodeVideoTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcEncodeVideoTimeout;
    }

    public int getHcEndTimeHour() {
        requireAccountInitializedOnDemand();
        return this.hcEndTimeHour;
    }

    public int getHcEndTimeMin() {
        requireAccountInitializedOnDemand();
        return this.hcEndTimeMin;
    }

    public long getHcEnterChattingAction() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingAction;
    }

    public int getHcEnterChattingCPU() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingCPU;
    }

    public int getHcEnterChattingDelay() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingDelay;
    }

    public boolean getHcEnterChattingEnable() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingEnable;
    }

    public int getHcEnterChattingIO() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingIO;
    }

    public boolean getHcEnterChattingThr() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingThr;
    }

    public int getHcEnterChattingTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcEnterChattingTimeout;
    }

    public long getHcGifAction() {
        requireAccountInitializedOnDemand();
        return this.hcGifAction;
    }

    public int getHcGifCPU() {
        requireAccountInitializedOnDemand();
        return this.hcGifCPU;
    }

    public int getHcGifDelay() {
        requireAccountInitializedOnDemand();
        return this.hcGifDelay;
    }

    public boolean getHcGifEnable() {
        requireAccountInitializedOnDemand();
        return this.hcGifEnable;
    }

    public long getHcGifFrameAction() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameAction;
    }

    public int getHcGifFrameCPU() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameCPU;
    }

    public int getHcGifFrameDelay() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameDelay;
    }

    public boolean getHcGifFrameEnable() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameEnable;
    }

    public int getHcGifFrameIO() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameIO;
    }

    public boolean getHcGifFrameThr() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameThr;
    }

    public int getHcGifFrameTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcGifFrameTimeout;
    }

    public int getHcGifIO() {
        requireAccountInitializedOnDemand();
        return this.hcGifIO;
    }

    public boolean getHcGifThr() {
        requireAccountInitializedOnDemand();
        return this.hcGifThr;
    }

    public int getHcGifTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcGifTimeout;
    }

    public boolean getHcKVFtReport() {
        requireAccountInitializedOnDemand();
        return this.hcKVFtReport;
    }

    public boolean getHcKVPerReport() {
        requireAccountInitializedOnDemand();
        return this.hcKVPerReport;
    }

    public long getHcMediaGalleryScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollAction;
    }

    public int getHcMediaGalleryScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollCPU;
    }

    public int getHcMediaGalleryScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollDelay;
    }

    public boolean getHcMediaGalleryScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollEnable;
    }

    public int getHcMediaGalleryScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollIO;
    }

    public boolean getHcMediaGalleryScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollThr;
    }

    public int getHcMediaGalleryScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcMediaGalleryScrollTimeout;
    }

    public long getHcMiniProgramLaunchAction() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchAction;
    }

    public int getHcMiniProgramLaunchCPU() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchCPU;
    }

    public int getHcMiniProgramLaunchDelay() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchDelay;
    }

    public boolean getHcMiniProgramLaunchEnable() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchEnable;
    }

    public int getHcMiniProgramLaunchIO() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchIO;
    }

    public boolean getHcMiniProgramLaunchThr() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchThr;
    }

    public int getHcMiniProgramLaunchTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcMiniProgramLaunchTimeout;
    }

    public long getHcQuitChattingAction() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingAction;
    }

    public int getHcQuitChattingCPU() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingCPU;
    }

    public int getHcQuitChattingDelay() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingDelay;
    }

    public boolean getHcQuitChattingEnable() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingEnable;
    }

    public int getHcQuitChattingIO() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingIO;
    }

    public boolean getHcQuitChattingThr() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingThr;
    }

    public int getHcQuitChattingTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcQuitChattingTimeout;
    }

    public long getHcReceiveMsgAction() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgAction;
    }

    public int getHcReceiveMsgCPU() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgCPU;
    }

    public int getHcReceiveMsgDelay() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgDelay;
    }

    public boolean getHcReceiveMsgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgEnable;
    }

    public int getHcReceiveMsgIO() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgIO;
    }

    public boolean getHcReceiveMsgThr() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgThr;
    }

    public int getHcReceiveMsgTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcReceiveMsgTimeout;
    }

    public int getHcRetryInterval() {
        requireAccountInitializedOnDemand();
        return this.hcRetryInterval;
    }

    public long getHcSNSMsgScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollAction;
    }

    public int getHcSNSMsgScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollCPU;
    }

    public int getHcSNSMsgScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollDelay;
    }

    public boolean getHcSNSMsgScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollEnable;
    }

    public int getHcSNSMsgScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollIO;
    }

    public boolean getHcSNSMsgScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollThr;
    }

    public int getHcSNSMsgScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSNSMsgScrollTimeout;
    }

    public long getHcSNSScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollAction;
    }

    public int getHcSNSScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollCPU;
    }

    public int getHcSNSScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollDelay;
    }

    public boolean getHcSNSScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollEnable;
    }

    public int getHcSNSScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollIO;
    }

    public boolean getHcSNSScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollThr;
    }

    public int getHcSNSScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSNSScrollTimeout;
    }

    public long getHcSNSUserScrollAction() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollAction;
    }

    public int getHcSNSUserScrollCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollCPU;
    }

    public int getHcSNSUserScrollDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollDelay;
    }

    public boolean getHcSNSUserScrollEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollEnable;
    }

    public int getHcSNSUserScrollIO() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollIO;
    }

    public boolean getHcSNSUserScrollThr() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollThr;
    }

    public int getHcSNSUserScrollTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSNSUserScrollTimeout;
    }

    public long getHcSendMsgAction() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgAction;
    }

    public int getHcSendMsgCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgCPU;
    }

    public int getHcSendMsgDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgDelay;
    }

    public boolean getHcSendMsgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgEnable;
    }

    public int getHcSendMsgIO() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgIO;
    }

    public boolean getHcSendMsgThr() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgThr;
    }

    public int getHcSendMsgTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSendMsgTimeout;
    }

    public long getHcSendPicMsgAction() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgAction;
    }

    public int getHcSendPicMsgCPU() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgCPU;
    }

    public int getHcSendPicMsgDelay() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgDelay;
    }

    public boolean getHcSendPicMsgEnable() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgEnable;
    }

    public int getHcSendPicMsgIO() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgIO;
    }

    public boolean getHcSendPicMsgThr() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgThr;
    }

    public int getHcSendPicMsgTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcSendPicMsgTimeout;
    }

    public boolean getHcTimeLimit() {
        requireAccountInitializedOnDemand();
        return this.hcTimeLimit;
    }

    public int getHcTimeoutMargin() {
        requireAccountInitializedOnDemand();
        return this.hcTimeoutMargin;
    }

    public int getHcUinHash() {
        requireAccountInitializedOnDemand();
        return this.hcUinHash;
    }

    public long getHcUpdateChatroomAction() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomAction;
    }

    public int getHcUpdateChatroomCPU() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomCPU;
    }

    public int getHcUpdateChatroomDelay() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomDelay;
    }

    public boolean getHcUpdateChatroomEnable() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomEnable;
    }

    public int getHcUpdateChatroomIO() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomIO;
    }

    public long getHcUpdateChatroomMemberCount() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomMemberCount;
    }

    public boolean getHcUpdateChatroomThr() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomThr;
    }

    public int getHcUpdateChatroomTimeout() {
        requireAccountInitializedOnDemand();
        return this.hcUpdateChatroomTimeout;
    }

    public long getParameters(int i, C104630a aVar, String... strArr) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("getparameterstype", i);
            JSONArray jSONArray = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            jSONObject.put("getparameterskeys", jSONArray);
            return getParameters(i, aVar, jSONObject);
        } catch (JSONException unused) {
            return -1;
        }
    }

    public int initHardCoder(C17776i.C17777a aVar, C17778l.C17779a aVar2, C104631d dVar) {
        HardCoderJNI.setHcEnable(isHCEnable());
        String readServerAddr = readServerAddr(false);
        if (readServerAddr == null || readServerAddr.isEmpty()) {
            Object[] objArr = new Object[1];
            if (readServerAddr == null) {
                readServerAddr = "null";
            }
            objArr[0] = readServerAddr;
            Log.m105929w(TAG, "initHardCoder serverSock is null or empty, skip init and reguard as disabled, serverSock:%s.", objArr);
            HardCoderJNI.setCheckEnv(false);
            return -3;
        }
        if (readServerAddr.contains("|")) {
            this.needMapAPPScene = true;
        }
        if (C17776i.f48944a == null) {
            C17774h.m18166c("Hardcoder.HardCoderReporter", String.format("setReporter[%s]", new Object[]{aVar}));
            C17776i.f48944a = aVar;
        }
        this.hardCoderReporterInfo = aVar2;
        C17774h.f48943a = this.wxHardCoderLog;
        HardCoderJNI.setSceneReportCallback(this.sceneReportCallback);
        Log.m105925i(TAG, "initHardCoder hcDebug[%b] hcEnable[%b] checkEnv[%b] TICK_RATE[%d]", Boolean.valueOf(HardCoderJNI.isHcDebug()), Boolean.valueOf(HardCoderJNI.isHcEnable()), Boolean.valueOf(HardCoderJNI.isCheckEnv()), Integer.valueOf(HardCoderJNI.tickRate));
        return HardCoderJNI.initHardCoder(readServerAddr, 0, MMApplicationContext.getPackageName() + HardCoderJNI.CLIENT_SOCK, new HardCoderJNI.HCPerfManagerThread() {
            public Thread newThread(Runnable runnable, String str, int i) {
                int i2 = C58834h.f168432b;
                C116782a aVar = new C116782a(runnable);
                C116783b bVar = new C116783b(aVar, "[GT]" + str);
                if (i < 1) {
                    i = 1;
                } else if (i > 10) {
                    i = 10;
                }
                bVar.setPriority(i);
                return bVar;
            }
        }, dVar);
    }

    public boolean isCheckEnv() {
        requireAccountInitializedOnDemand();
        return HardCoderJNI.isCheckEnv();
    }

    public boolean isHCEnable() {
        return isCheckEnv() & getEnable();
    }

    public int isRunning() {
        return HardCoderJNI.isRunning();
    }

    public void onAccountInitialized(Context context) {
        reloadHardcoderConfig();
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("hardcoder_setting", 0);
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121110g() != 0) {
            C86709a0.m107528h();
            int b = C101615j.m133462b(C86709a0.m107523b().mo121110g(), 100);
            if (b != sharedPreferences.getInt("KEY_HC_UIN_HASH", 0)) {
                Log.m105925i(TAG, "onAccountInitialized hardcoder uinHash[%d] reloadSPConfig", Integer.valueOf(b));
                sharedPreferences.edit().putInt("KEY_HC_UIN_HASH", b).apply();
                reloadSPConfig(2);
            }
        }
        C30650a.m39147b(new C36329a(), "//fsd");
    }

    public void onAccountReleased(Context context) {
    }

    public void onCreate(Context context) {
        initSceneAndFlagMap();
        reloadSPConfig(0);
        Thread currentThread = Thread.currentThread();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (HardCoderReporterImpl.f81458g == null) {
            HardCoderReporterImpl.f81458g = new HardCoderReporterImpl();
        }
        HardCoderReporterImpl hardCoderReporterImpl = HardCoderReporterImpl.f81458g;
        if (hardCoderReporterImpl == null) {
            HardCoderReporterImpl.f81458g = new HardCoderReporterImpl();
        }
        initHardCoder(hardCoderReporterImpl, HardCoderReporterImpl.f81458g, new C104631d() {
            public void onConnectStatus(boolean z) {
                Log.m105925i(WXHardCoderJNIImpl.TAG, "configure initHardCoder callback, connect:%b", Boolean.valueOf(z));
                if (z && MMApplicationContext.isMMProcess()) {
                    WXHardCoderJNIImpl.this.registerSystemEventCallback(new C104633j() {
                        public void onEvent(int i) {
                            Log.m105925i(WXHardCoderJNIImpl.TAG, "configure SystemEventCallback onEvent eventCode[%d]", Integer.valueOf(i));
                            HardCoderSystemEvent hardCoderSystemEvent = new HardCoderSystemEvent();
                            hardCoderSystemEvent.f264901d.f264902a = i;
                            hardCoderSystemEvent.publish();
                        }
                    });
                    C177632 r8 = new C104630a() {
                        public void onGetParameters(int i, JSONObject jSONObject) {
                            Log.m105925i(WXHardCoderJNIImpl.TAG, "configure GetParametersCallback onGetParameters type[%d]", Integer.valueOf(i));
                            if (i == 1) {
                                try {
                                    String string = jSONObject.getString("HCMinQPKey");
                                    String string2 = jSONObject.getString("HCMaxQPKey");
                                    String string3 = jSONObject.getString("HCQPSceneKey");
                                    Log.m105925i(WXHardCoderJNIImpl.TAG, "onGetParameters, minkey:%s, maxKey:%s, sceneKey:%s", string, string2, string3);
                                    MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("HardcoderQP");
                                    mmkv.encode("HCMinQPKey", string);
                                    mmkv.encode("HCMaxQPKey", string2);
                                    mmkv.encode("HCQPSceneKey", string3);
                                } catch (JSONException unused) {
                                }
                            } else if (i == 4) {
                                String optString = jSONObject.optString("BFrameKey");
                                int optInt = jSONObject.optInt("BFrameKeyOptionOpen", -1);
                                int optInt2 = jSONObject.optInt("BFrameKeyOptionClose", -1);
                                Log.m105925i(WXHardCoderJNIImpl.TAG, "get bFrame parameters, BFrameKey:%s, BFrameKeyOptionOpen:%s, BFrameKeyOptionClose:%s", optString, Integer.valueOf(optInt), Integer.valueOf(optInt2));
                                MultiProcessMMKV mmkv2 = MultiProcessMMKV.getMMKV("HardcoderBFrame");
                                mmkv2.encode("BFrameKey", optString);
                                mmkv2.encode("BFrameKeyOptionOpen", optInt);
                                mmkv2.encode("BFrameKeyOptionClose", optInt2);
                            }
                        }
                    };
                    Log.m105925i(WXHardCoderJNIImpl.TAG, "configure qp registerGetParametersCallback ret:%d", Integer.valueOf(WXHardCoderJNIImpl.this.registerGetParametersCallback(1, r8, "HCMinQPKey", "HCMaxQPKey", "HCQPSceneKey")));
                    Log.m105925i(WXHardCoderJNIImpl.TAG, "configure bFrame registerGetParametersCallback ret:%d", Integer.valueOf(WXHardCoderJNIImpl.this.registerGetParametersCallback(4, r8, new String[0])));
                }
            }
        });
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        Log.m105925i(TAG, "configure initHardCoder[%d %d %d %d] take[%d]ms tid[%s, %s]", Long.valueOf(C87422a.f253331b), Long.valueOf(C87422a.f253332c), Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2), Long.valueOf(elapsedRealtime2 - C87422a.f253331b), currentThread.getName(), Long.valueOf(currentThread.getId()));
    }

    public synchronized String readServerAddr(boolean z) {
        String str;
        Class<String> cls = String.class;
        synchronized (this) {
            try {
                if (this.mSystemPropertiesClazz == null) {
                    this.mSystemPropertiesClazz = Class.forName("android.os.SystemProperties");
                    Method declaredMethod = this.mSystemPropertiesClazz.getDeclaredMethod("get", new Class[]{cls, cls});
                    this.mGetStringPropsMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                str = (String) this.mGetStringPropsMethod.invoke((Object) null, new Object[]{HardCoderJNI.SERVER_PROP_KEY, ""});
                Log.m105925i(TAG, "readServerAddr, serverprop[%s], result[%s], stack[%s]", HardCoderJNI.SERVER_PROP_KEY, str, Util.getStack());
                if (z) {
                    if (Util.isNullOrNil(str)) {
                        reportInfo(new C17781n(true, 1, 1, false));
                    } else {
                        reportInfo(new C17781n(true, 2, 1, false));
                        reportInfo(new C17782o());
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "readServerAddr", new Object[0]);
                if (z) {
                    reportInfo(new C17781n(true, 3, 1, false));
                }
                return "";
            }
        }
        return str;
    }

    public long registerANRCallback(HardCoderJNI.AnrCallback anrCallback) {
        requireAccountInitializedOnDemand();
        if (!HardCoderJNI.isCheckEnv()) {
            return -2;
        }
        return HardCoderJNI.registerANRCallback(anrCallback);
    }

    public int registerGetParametersCallback(int i, C104630a aVar, String... strArr) {
        if (!HardCoderJNI.isCheckEnv()) {
            return -2;
        }
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = aVar == null ? "null" : aVar;
        objArr[2] = Util.getStack();
        Log.m105925i(TAG, "registerGetParametersCallback, type:%d, callback:%s, stack[%s]", objArr);
        getParameters(i, aVar, strArr);
        return 0;
    }

    public long registerSystemEventCallback(C104633j jVar) {
        if (!HardCoderJNI.isCheckEnv()) {
            return -2;
        }
        Log.m105925i(TAG, "registerSystemEventCallback, stack[%s]", Util.getStack());
        this.systemEventCallback = jVar;
        long registerSystemEventCallback = HardCoderJNI.registerSystemEventCallback(Process.myTid(), SystemClock.elapsedRealtime());
        HardCoderJNI.putFuncRetHashMap(registerSystemEventCallback, this.funcRet);
        return registerSystemEventCallback;
    }

    public void reloadSPConfig(int i) {
        boolean checkHardCoderEnv = checkHardCoderEnv();
        HardCoderJNI.setCheckEnv(checkHardCoderEnv);
        if (!checkHardCoderEnv) {
            Log.m105920e(TAG, "reloadSPConfig hcEnv is false.");
            return;
        }
        setDebug(false);
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("hardcoder_setting", 0);
        HardCoderJNI.setHcEnable(sharedPreferences.getBoolean("KEY_HC_ENABLE", true));
        this.hcBgEnable = sharedPreferences.getBoolean("KEY_HC_BG_ENABLE", true);
        this.hcUinHash = sharedPreferences.getInt("KEY_HC_UIN_HASH", 0);
        HardCoderJNI.setHcDebug(sharedPreferences.getBoolean("KEY_HC_DEBUG", false));
        Log.m105925i(TAG, "reloadSPConfig scene:%d, hcDebug:%b, hcEnable:%b, hcUinHash:%d, checkEnv:%b, stack[%s]", Integer.valueOf(i), Boolean.valueOf(HardCoderJNI.isHcDebug()), Boolean.valueOf(HardCoderJNI.isHcEnable()), Integer.valueOf(this.hcUinHash), Boolean.valueOf(HardCoderJNI.isCheckEnv()), Util.getStack());
        this.hcRetryInterval = sharedPreferences.getInt("KEY_HC_RETRY_INTERVAL", 30);
        this.hcKVPerReport = sharedPreferences.getInt("KEY_HC_KV_PER", 0) < this.hcUinHash;
        this.hcKVFtReport = sharedPreferences.getInt("KEY_HC_KV_FT", 0) < this.hcUinHash;
        this.hcTimeoutMargin = sharedPreferences.getInt("KEY_HC_TIMEOUT_MARGIN", 0);
        this.hcTimeLimit = false;
        this.hcBeginTimeHour = 8;
        this.hcBeginTimeMin = 0;
        this.hcEndTimeHour = 23;
        this.hcEndTimeMin = 0;
        this.hcBootEnable = sharedPreferences.getBoolean("KEY_HC_BOOT_ENABLE", true);
        this.hcBootDelay = 0;
        this.hcBootCPU = 1;
        this.hcBootIO = 0;
        this.hcBootThr = false;
        this.hcBootTimeout = 5000;
        this.hcBootAction = 4;
        this.hcEnterChattingEnable = sharedPreferences.getBoolean("KEY_HC_ENTER_CHATTING_ENABLE", true);
        this.hcEnterChattingDelay = 0;
        this.hcEnterChattingCPU = 1;
        this.hcEnterChattingIO = 1;
        this.hcEnterChattingThr = false;
        this.hcEnterChattingTimeout = 1000;
        this.hcEnterChattingAction = 12294;
        this.hcQuitChattingEnable = sharedPreferences.getBoolean("KEY_HC_QUIT_CHATTING_ENABLE", true);
        this.hcQuitChattingDelay = 0;
        this.hcQuitChattingCPU = 2;
        this.hcQuitChattingIO = 2;
        this.hcQuitChattingThr = false;
        this.hcQuitChattingTimeout = 800;
        this.hcQuitChattingAction = 8194;
        this.hcSendMsgEnable = sharedPreferences.getBoolean("KEY_HC_SEND_MSG_ENABLE", true);
        this.hcSendMsgDelay = 0;
        this.hcSendMsgCPU = 3;
        this.hcSendMsgIO = 0;
        this.hcSendMsgThr = true;
        this.hcSendMsgTimeout = 1000;
        this.hcSendMsgAction = 12288;
        this.hcSendPicMsgEnable = sharedPreferences.getBoolean("KEY_HC_SEND_PIC_MSG_ENABLE", true);
        this.hcSendPicMsgDelay = 0;
        this.hcSendPicMsgCPU = 1;
        this.hcSendPicMsgIO = 2;
        this.hcSendPicMsgThr = true;
        this.hcSendPicMsgTimeout = 500;
        this.hcSendPicMsgAction = 123072;
        this.hcReceiveMsgEnable = sharedPreferences.getBoolean("KEY_HC_RECEIVE_MSG_ENABLE", true);
        this.hcReceiveMsgDelay = 500;
        this.hcReceiveMsgCPU = 2;
        this.hcReceiveMsgIO = 2;
        this.hcReceiveMsgThr = true;
        this.hcReceiveMsgTimeout = 1000;
        this.hcReceiveMsgAction = 127040;
        this.hcUpdateChatroomEnable = sharedPreferences.getBoolean("KEY_HC_UPDATE_CHATROOM_ENABLE", true);
        this.hcUpdateChatroomDelay = 0;
        this.hcUpdateChatroomCPU = 2;
        this.hcUpdateChatroomIO = 2;
        this.hcUpdateChatroomThr = true;
        this.hcUpdateChatroomTimeout = 1000;
        this.hcUpdateChatroomAction = 127040;
        this.hcUpdateChatroomMemberCount = 50;
        this.hcDBEnable = sharedPreferences.getBoolean("KEY_HC_DB_ENABLE", false);
        this.hcDBDelayQuery = 100;
        this.hcDBDelayWrite = 200;
        this.hcDBCPU = 2;
        this.hcDBIO = 2;
        this.hcDBThr = false;
        this.hcDBTimeout = 500;
        this.hcDBTimeoutBusy = 5000;
        this.hcDBActionQuery = 4096;
        this.hcDBActionWrite = 12288;
        this.hcEncodeVideoEnable = sharedPreferences.getBoolean("KEY_HC_ENCODE_VIDEO_ENABLE", true);
        this.hcEncodeVideoDelay = 0;
        this.hcEncodeVideoCPU = 1;
        this.hcEncodeVideoIO = 1;
        this.hcEncodeVideoThr = false;
        this.hcEncodeVideoTimeout = 20000;
        this.hcEncodeVideoAction = 81984;
        this.hcDecodePicEnable = sharedPreferences.getBoolean("KEY_HC_DECODE_PIC_ENABLE", false);
        this.hcDecodePicDelay = 100;
        this.hcDecodePicCPU = 2;
        this.hcDecodePicIO = 2;
        this.hcDecodePicThr = false;
        this.hcDecodePicTimeout = 500;
        this.hcDecodePicAction = 16448;
        this.hcGifEnable = sharedPreferences.getBoolean("KEY_HC_GIF_ENABLE", true);
        this.hcGifDelay = 0;
        this.hcGifCPU = 3;
        this.hcGifIO = 2;
        this.hcGifThr = false;
        this.hcGifTimeout = 500;
        this.hcGifAction = 81984;
        this.hcGifFrameEnable = sharedPreferences.getBoolean("KEY_HC_GIF_FRAME_ENABLE", true);
        this.hcGifFrameDelay = 0;
        this.hcGifFrameCPU = 2;
        this.hcGifFrameIO = 0;
        this.hcGifFrameThr = false;
        this.hcGifFrameTimeout = 1000;
        this.hcGifFrameAction = 65600;
        this.hcSNSScrollEnable = sharedPreferences.getBoolean("KEY_HC_SNS_SCROLL_ENABLE", true);
        this.hcSNSScrollDelay = 0;
        this.hcSNSScrollCPU = 2;
        this.hcSNSScrollIO = 2;
        this.hcSNSScrollThr = false;
        this.hcSNSScrollTimeout = 1500;
        this.hcSNSScrollAction = 96;
        this.hcSNSUserScrollEnable = sharedPreferences.getBoolean("KEY_HC_SNS_USER_SCROLL_ENABLE", true);
        this.hcSNSUserScrollDelay = 0;
        this.hcSNSUserScrollCPU = 3;
        this.hcSNSUserScrollIO = 2;
        this.hcSNSUserScrollThr = false;
        this.hcSNSUserScrollTimeout = 1500;
        this.hcSNSUserScrollAction = 96;
        this.hcSNSMsgScrollEnable = sharedPreferences.getBoolean("KEY_HC_SNS_MSG_SCROLL_ENABLE", true);
        this.hcSNSMsgScrollDelay = 0;
        this.hcSNSMsgScrollCPU = 3;
        this.hcSNSMsgScrollIO = 2;
        this.hcSNSMsgScrollThr = false;
        this.hcSNSMsgScrollTimeout = 1500;
        this.hcSNSMsgScrollAction = 96;
        this.hcMediaGalleryScrollEnable = sharedPreferences.getBoolean("KEY_HC_MEDIA_GALLERY_SCROLL_ENABLE", true);
        this.hcMediaGalleryScrollDelay = 0;
        this.hcMediaGalleryScrollCPU = 3;
        this.hcMediaGalleryScrollIO = 2;
        this.hcMediaGalleryScrollThr = false;
        this.hcMediaGalleryScrollTimeout = 1500;
        this.hcMediaGalleryScrollAction = 96;
        this.hcAlbumScrollEnable = sharedPreferences.getBoolean("KEY_HCALBUM_SCROLL_ENABLE", true);
        this.hcAlbumScrollDelay = 0;
        this.hcAlbumScrollCPU = 3;
        this.hcAlbumScrollIO = 2;
        this.hcAlbumScrollThr = false;
        this.hcAlbumScrollTimeout = 1500;
        this.hcAlbumScrollAction = 96;
        this.hcMiniProgramLaunchEnable = sharedPreferences.getBoolean("KEY_HC_MINI_PROGRAM_LAUNCH_ENABLE", true);
        this.hcMiniProgramLaunchDelay = 500;
        this.hcMiniProgramLaunchCPU = 1;
        this.hcMiniProgramLaunchIO = 1;
        this.hcMiniProgramLaunchThr = false;
        this.hcMiniProgramLaunchTimeout = 5000;
        this.hcMiniProgramLaunchAction = 114688;
        Log.m105925i(TAG, "reloadSPConfig Boot[%b] EnterChatting[%b] QuitChatting[%b] SendMsg[%b] SendPicMsg[%b] ReceiveMsg[%b] UpdateChatroom[%b] DB[%b] EncodeVideo[%b] DecodePic[%b] Gif[%b] GifFrame[%b] SNS[%b] MediaGallery[%b] Album[%b] SNSUser[%b] SNSMsg[%b] MiniProgramLaunch[%b]", Boolean.valueOf(this.hcBootEnable), Boolean.valueOf(this.hcEnterChattingEnable), Boolean.valueOf(this.hcQuitChattingEnable), Boolean.valueOf(this.hcSendMsgEnable), Boolean.valueOf(this.hcSendPicMsgEnable), Boolean.valueOf(this.hcReceiveMsgEnable), Boolean.valueOf(this.hcUpdateChatroomEnable), Boolean.valueOf(this.hcDBEnable), Boolean.valueOf(this.hcEncodeVideoEnable), Boolean.valueOf(this.hcDecodePicEnable), Boolean.valueOf(this.hcGifEnable), Boolean.valueOf(this.hcGifFrameEnable), Boolean.valueOf(this.hcSNSScrollEnable), Boolean.valueOf(this.hcMediaGalleryScrollEnable), Boolean.valueOf(this.hcAlbumScrollEnable), Boolean.valueOf(this.hcSNSUserScrollEnable), Boolean.valueOf(this.hcSNSMsgScrollEnable), Boolean.valueOf(this.hcMiniProgramLaunchEnable));
    }

    public void reportFPS(int i, long j, int i2, long j2, long j3) {
        reportInfo(new C17780m(i, j, i2, j2, j3));
    }

    public void reportIDKey(boolean z, int i, int i2, boolean z2) {
        reportInfo(new C17781n(z, i, i2, z2));
    }

    public void setDebug(boolean z) {
        HardCoderJNI.setHcDebug(z);
    }

    public void setHcAlbumScrollAction(long j) {
        this.hcAlbumScrollAction = j;
    }

    public void setHcAlbumScrollCPU(int i) {
        this.hcAlbumScrollCPU = i;
    }

    public void setHcAlbumScrollDelay(int i) {
        this.hcAlbumScrollDelay = i;
    }

    public void setHcAlbumScrollEnable(boolean z) {
        this.hcAlbumScrollEnable = z;
    }

    public void setHcAlbumScrollIO(int i) {
        this.hcAlbumScrollIO = i;
    }

    public void setHcAlbumScrollThr(boolean z) {
        this.hcAlbumScrollThr = z;
    }

    public void setHcAlbumScrollTimeout(int i) {
        this.hcAlbumScrollTimeout = i;
    }

    public void setHcBeginTimeHour(int i) {
        this.hcBeginTimeHour = i;
    }

    public void setHcBeginTimeMin(int i) {
        this.hcBeginTimeMin = i;
    }

    public void setHcBgEnable(boolean z) {
        this.hcBgEnable = z;
    }

    public void setHcBizAction(long j) {
        this.hcBizAction = j;
    }

    public void setHcBizCPU(int i) {
        this.hcBizCPU = i;
    }

    public void setHcBizDelay(int i) {
        this.hcBizDelay = i;
    }

    public void setHcBizEnable(boolean z) {
        this.hcBizEnable = z;
    }

    public void setHcBizIO(int i) {
        this.hcBizIO = i;
    }

    public void setHcBizThr(boolean z) {
        this.hcBizThr = z;
    }

    public void setHcBizTimeout(int i) {
        this.hcBizTimeout = i;
    }

    public void setHcBootAction(long j) {
        this.hcBootAction = j;
    }

    public void setHcBootCPU(int i) {
        this.hcBootCPU = i;
    }

    public void setHcBootDelay(int i) {
        this.hcBootDelay = i;
    }

    public void setHcBootEnable(boolean z) {
        this.hcBootEnable = z;
    }

    public void setHcBootIO(int i) {
        this.hcBootIO = i;
    }

    public void setHcBootThr(boolean z) {
        this.hcBootThr = z;
    }

    public void setHcBootTimeout(int i) {
        this.hcBootTimeout = i;
    }

    public void setHcDBActionQuery(long j) {
        this.hcDBActionQuery = j;
    }

    public void setHcDBActionWrite(long j) {
        this.hcDBActionWrite = j;
    }

    public void setHcDBCPU(int i) {
        this.hcDBCPU = i;
    }

    public void setHcDBDelayQuery(int i) {
        this.hcDBDelayQuery = i;
    }

    public void setHcDBDelayWrite(int i) {
        this.hcDBDelayWrite = i;
    }

    public void setHcDBEnable(boolean z) {
        this.hcDBEnable = z;
    }

    public void setHcDBIO(int i) {
        this.hcDBIO = i;
    }

    public void setHcDBThr(boolean z) {
        this.hcDBThr = z;
    }

    public void setHcDBTimeout(int i) {
        this.hcDBTimeout = i;
    }

    public void setHcDBTimeoutBusy(int i) {
        this.hcDBTimeoutBusy = i;
    }

    public void setHcDecodePicAction(long j) {
        this.hcDecodePicAction = j;
    }

    public void setHcDecodePicCPU(int i) {
        this.hcDecodePicCPU = i;
    }

    public void setHcDecodePicDelay(int i) {
        this.hcDecodePicDelay = i;
    }

    public void setHcDecodePicEnable(boolean z) {
        this.hcDecodePicEnable = z;
    }

    public void setHcDecodePicIO(int i) {
        this.hcDecodePicIO = i;
    }

    public void setHcDecodePicThr(boolean z) {
        this.hcDecodePicThr = z;
    }

    public void setHcDecodePicTimeout(int i) {
        this.hcDecodePicTimeout = i;
    }

    public void setHcEnable(boolean z) {
        HardCoderJNI.setHcEnable(z);
    }

    public void setHcEncodeVideoAction(long j) {
        this.hcEncodeVideoAction = j;
    }

    public void setHcEncodeVideoCPU(int i) {
        this.hcEncodeVideoCPU = i;
    }

    public void setHcEncodeVideoDelay(int i) {
        this.hcEncodeVideoDelay = i;
    }

    public void setHcEncodeVideoEnable(boolean z) {
        this.hcEncodeVideoEnable = z;
    }

    public void setHcEncodeVideoIO(int i) {
        this.hcEncodeVideoIO = i;
    }

    public void setHcEncodeVideoThr(boolean z) {
        this.hcEncodeVideoThr = z;
    }

    public void setHcEncodeVideoTimeout(int i) {
        this.hcEncodeVideoTimeout = i;
    }

    public void setHcEndTimeHour(int i) {
        this.hcEndTimeHour = i;
    }

    public void setHcEndTimeMin(int i) {
        this.hcEndTimeMin = i;
    }

    public void setHcEnterChattingAction(long j) {
        this.hcEnterChattingAction = j;
    }

    public void setHcEnterChattingCPU(int i) {
        this.hcEnterChattingCPU = i;
    }

    public void setHcEnterChattingDelay(int i) {
        this.hcEnterChattingDelay = i;
    }

    public void setHcEnterChattingEnable(boolean z) {
        this.hcEnterChattingEnable = z;
    }

    public void setHcEnterChattingIO(int i) {
        this.hcEnterChattingIO = i;
    }

    public void setHcEnterChattingThr(boolean z) {
        this.hcEnterChattingThr = z;
    }

    public void setHcEnterChattingTimeout(int i) {
        this.hcEnterChattingTimeout = i;
    }

    public void setHcGifAction(long j) {
        this.hcGifAction = j;
    }

    public void setHcGifCPU(int i) {
        this.hcGifCPU = i;
    }

    public void setHcGifDelay(int i) {
        this.hcGifDelay = i;
    }

    public void setHcGifEnable(boolean z) {
        this.hcGifEnable = z;
    }

    public void setHcGifFrameAction(long j) {
        this.hcGifFrameAction = j;
    }

    public void setHcGifFrameCPU(int i) {
        this.hcGifFrameCPU = i;
    }

    public void setHcGifFrameDelay(int i) {
        this.hcGifFrameDelay = i;
    }

    public void setHcGifFrameEnable(boolean z) {
        this.hcGifFrameEnable = z;
    }

    public void setHcGifFrameIO(int i) {
        this.hcGifFrameIO = i;
    }

    public void setHcGifFrameThr(boolean z) {
        this.hcGifFrameThr = z;
    }

    public void setHcGifFrameTimeout(int i) {
        this.hcGifFrameTimeout = i;
    }

    public void setHcGifIO(int i) {
        this.hcGifIO = i;
    }

    public void setHcGifThr(boolean z) {
        this.hcGifThr = z;
    }

    public void setHcGifTimeout(int i) {
        this.hcGifTimeout = i;
    }

    public void setHcKVFtReport(boolean z) {
        this.hcKVFtReport = z;
    }

    public void setHcKVPerReport(boolean z) {
        this.hcKVPerReport = z;
    }

    public void setHcMediaGalleryScrollAction(long j) {
        this.hcMediaGalleryScrollAction = j;
    }

    public void setHcMediaGalleryScrollCPU(int i) {
        this.hcMediaGalleryScrollCPU = i;
    }

    public void setHcMediaGalleryScrollDelay(int i) {
        this.hcMediaGalleryScrollDelay = i;
    }

    public void setHcMediaGalleryScrollEnable(boolean z) {
        this.hcMediaGalleryScrollEnable = z;
    }

    public void setHcMediaGalleryScrollIO(int i) {
        this.hcMediaGalleryScrollIO = i;
    }

    public void setHcMediaGalleryScrollThr(boolean z) {
        this.hcMediaGalleryScrollThr = z;
    }

    public void setHcMediaGalleryScrollTimeout(int i) {
        this.hcMediaGalleryScrollTimeout = i;
    }

    public void setHcMiniProgramLaunchAction(long j) {
        this.hcMiniProgramLaunchAction = j;
    }

    public void setHcMiniProgramLaunchCPU(int i) {
        this.hcMiniProgramLaunchCPU = i;
    }

    public void setHcMiniProgramLaunchDelay(int i) {
        this.hcMiniProgramLaunchDelay = i;
    }

    public void setHcMiniProgramLaunchEnable(boolean z) {
        this.hcMiniProgramLaunchEnable = z;
    }

    public void setHcMiniProgramLaunchIO(int i) {
        this.hcMiniProgramLaunchIO = i;
    }

    public void setHcMiniProgramLaunchThr(boolean z) {
        this.hcMiniProgramLaunchThr = z;
    }

    public void setHcMiniProgramLaunchTimeout(int i) {
        this.hcMiniProgramLaunchTimeout = i;
    }

    public void setHcQuitChattingAction(long j) {
        this.hcQuitChattingAction = j;
    }

    public void setHcQuitChattingCPU(int i) {
        this.hcQuitChattingCPU = i;
    }

    public void setHcQuitChattingDelay(int i) {
        this.hcQuitChattingDelay = i;
    }

    public void setHcQuitChattingEnable(boolean z) {
        this.hcQuitChattingEnable = z;
    }

    public void setHcQuitChattingIO(int i) {
        this.hcQuitChattingIO = i;
    }

    public void setHcQuitChattingThr(boolean z) {
        this.hcQuitChattingThr = z;
    }

    public void setHcQuitChattingTimeout(int i) {
        this.hcQuitChattingTimeout = i;
    }

    public void setHcReceiveMsgAction(long j) {
        this.hcReceiveMsgAction = j;
    }

    public void setHcReceiveMsgCPU(int i) {
        this.hcReceiveMsgCPU = i;
    }

    public void setHcReceiveMsgDelay(int i) {
        this.hcReceiveMsgDelay = i;
    }

    public void setHcReceiveMsgEnable(boolean z) {
        this.hcReceiveMsgEnable = z;
    }

    public void setHcReceiveMsgIO(int i) {
        this.hcReceiveMsgIO = i;
    }

    public void setHcReceiveMsgThr(boolean z) {
        this.hcReceiveMsgThr = z;
    }

    public void setHcReceiveMsgTimeout(int i) {
        this.hcReceiveMsgTimeout = i;
    }

    public void setHcRetryInterval(int i) {
        this.hcRetryInterval = i;
    }

    public void setHcSNSMsgScrollAction(long j) {
        this.hcSNSMsgScrollAction = j;
    }

    public void setHcSNSMsgScrollCPU(int i) {
        this.hcSNSMsgScrollCPU = i;
    }

    public void setHcSNSMsgScrollDelay(int i) {
        this.hcSNSMsgScrollDelay = i;
    }

    public void setHcSNSMsgScrollEnable(boolean z) {
        this.hcSNSMsgScrollEnable = z;
    }

    public void setHcSNSMsgScrollIO(int i) {
        this.hcSNSMsgScrollIO = i;
    }

    public void setHcSNSMsgScrollThr(boolean z) {
        this.hcSNSMsgScrollThr = z;
    }

    public void setHcSNSMsgScrollTimeout(int i) {
        this.hcSNSMsgScrollTimeout = i;
    }

    public void setHcSNSScrollAction(long j) {
        this.hcSNSScrollAction = j;
    }

    public void setHcSNSScrollCPU(int i) {
        this.hcSNSScrollCPU = i;
    }

    public void setHcSNSScrollDelay(int i) {
        this.hcSNSScrollDelay = i;
    }

    public void setHcSNSScrollEnable(boolean z) {
        this.hcSNSScrollEnable = z;
    }

    public void setHcSNSScrollIO(int i) {
        this.hcSNSScrollIO = i;
    }

    public void setHcSNSScrollThr(boolean z) {
        this.hcSNSScrollThr = z;
    }

    public void setHcSNSScrollTimeout(int i) {
        this.hcSNSScrollTimeout = i;
    }

    public void setHcSNSUserScrollAction(long j) {
        this.hcSNSUserScrollAction = j;
    }

    public void setHcSNSUserScrollCPU(int i) {
        this.hcSNSUserScrollCPU = i;
    }

    public void setHcSNSUserScrollDelay(int i) {
        this.hcSNSUserScrollDelay = i;
    }

    public void setHcSNSUserScrollEnable(boolean z) {
        this.hcSNSUserScrollEnable = z;
    }

    public void setHcSNSUserScrollIO(int i) {
        this.hcSNSUserScrollIO = i;
    }

    public void setHcSNSUserScrollThr(boolean z) {
        this.hcSNSUserScrollThr = z;
    }

    public void setHcSNSUserScrollTimeout(int i) {
        this.hcSNSUserScrollTimeout = i;
    }

    public void setHcSendMsgAction(long j) {
        this.hcSendMsgAction = j;
    }

    public void setHcSendMsgCPU(int i) {
        this.hcSendMsgCPU = i;
    }

    public void setHcSendMsgDelay(int i) {
        this.hcSendMsgDelay = i;
    }

    public void setHcSendMsgEnable(boolean z) {
        this.hcSendMsgEnable = z;
    }

    public void setHcSendMsgIO(int i) {
        this.hcSendMsgIO = i;
    }

    public void setHcSendMsgThr(boolean z) {
        this.hcSendMsgThr = z;
    }

    public void setHcSendMsgTimeout(int i) {
        this.hcSendMsgTimeout = i;
    }

    public void setHcSendPicMsgAction(long j) {
        this.hcSendPicMsgAction = j;
    }

    public void setHcSendPicMsgCPU(int i) {
        this.hcSendPicMsgCPU = i;
    }

    public void setHcSendPicMsgDelay(int i) {
        this.hcSendPicMsgDelay = i;
    }

    public void setHcSendPicMsgEnable(boolean z) {
        this.hcSendPicMsgEnable = z;
    }

    public void setHcSendPicMsgIO(int i) {
        this.hcSendPicMsgIO = i;
    }

    public void setHcSendPicMsgThr(boolean z) {
        this.hcSendPicMsgThr = z;
    }

    public void setHcSendPicMsgTimeout(int i) {
        this.hcSendPicMsgTimeout = i;
    }

    public void setHcTimeLimit(boolean z) {
        this.hcTimeLimit = z;
    }

    public void setHcTimeoutMargin(int i) {
        this.hcTimeoutMargin = i;
    }

    public void setHcUinHash(int i) {
        this.hcUinHash = i;
    }

    public void setHcUpdateChatroomAction(long j) {
        this.hcUpdateChatroomAction = j;
    }

    public void setHcUpdateChatroomCPU(int i) {
        this.hcUpdateChatroomCPU = i;
    }

    public void setHcUpdateChatroomDelay(int i) {
        this.hcUpdateChatroomDelay = i;
    }

    public void setHcUpdateChatroomEnable(boolean z) {
        this.hcUpdateChatroomEnable = z;
    }

    public void setHcUpdateChatroomIO(int i) {
        this.hcUpdateChatroomIO = i;
    }

    public void setHcUpdateChatroomMemberCount(long j) {
        this.hcUpdateChatroomMemberCount = j;
    }

    public void setHcUpdateChatroomThr(boolean z) {
        this.hcUpdateChatroomThr = z;
    }

    public void setHcUpdateChatroomTimeout(int i) {
        this.hcUpdateChatroomTimeout = i;
    }

    public void setRetryConnectInterval(int i) {
        HardCoderJNI.setRetryConnectInterval(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        r0 = r1.APP_SCENE_ID_MAP.get(java.lang.Integer.valueOf(r19));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int startPerformance(boolean r13, int r14, int r15, int r16, int r17, int r18, int r19, long r20, java.lang.String r22) {
        /*
            r12 = this;
            r1 = r12
            if (r13 != 0) goto L_0x0005
            r0 = -3
            return r0
        L_0x0005:
            boolean r0 = r1.hcBgEnable
            if (r0 != 0) goto L_0x0017
            boolean[] r2 = h20.C32665c.f86684d
            monitor-enter(r2)
            r0 = 0
            boolean r0 = r2[r0]     // Catch:{ all -> 0x0014 }
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0017
            r0 = -4
            return r0
        L_0x0014:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0014 }
            throw r0
        L_0x0017:
            boolean r0 = r1.needMapAPPScene
            if (r0 == 0) goto L_0x002f
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.APP_SCENE_ID_MAP
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x002f
            int r0 = r0.intValue()
            r7 = r0
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            int r0 = r1.hcTimeoutMargin
            int r6 = r18 + r0
            int r10 = android.os.Process.myTid()
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r8 = r20
            r11 = r22
            int r0 = com.tencent.p014mm.hardcoder.HardCoderJNI.startPerformance(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.hardcoder.WXHardCoderJNIImpl.startPerformance(boolean, int, int, int, int, int, int, long, java.lang.String):int");
    }

    public int stopPerformance(boolean z, int i) {
        if (!z) {
            return -3;
        }
        return HardCoderJNI.stopPerformance(i);
    }

    public long terminateApp(int i, long j) {
        return HardCoderJNI.terminateApp(i, j);
    }

    public long getParameters(int i, C104630a aVar, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        this.getParametersCallback = aVar;
        long parameters = HardCoderJNI.getParameters(jSONObject2.getBytes(), Process.myTid(), SystemClock.elapsedRealtimeNanos());
        HardCoderJNI.putFuncRetHashMap(parameters, this.funcRet);
        Log.m105924i(TAG, "getParameters type:" + i + ", len: " + jSONObject2.length());
        try {
            Thread.sleep(20);
        } catch (InterruptedException unused) {
        }
        return parameters;
    }
}
