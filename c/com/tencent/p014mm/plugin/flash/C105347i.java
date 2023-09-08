package com.tencent.p014mm.plugin.flash;

import android.hardware.Camera;
import com.tencent.p014mm.plugin.facedetect.C85185b;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.YtLogger;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import com.tencent.youtu.ytcommon.tools.YTCameraSetting;
import com.tencent.ytcommon.auth.Auth;
import di3.C86312j;
import h81.C32735h;
import p564iq.C87790d;

/* renamed from: com.tencent.mm.plugin.flash.i */
public class C105347i {

    /* renamed from: a */
    public static final String f313123a = (C85191v.m105070i() + XVFSFile.SEPARATOR_CHAR + "fdv_");

    /* renamed from: com.tencent.mm.plugin.flash.i$a */
    public class C105348a implements YtLogger.IYtLoggerListener {
        public C105348a(C105347i iVar) {
        }

        public void log(String str, String str2) {
            Log.m105925i("MicroMsg.YTLog", "%s:%s", str, str2);
        }
    }

    static {
        Class cls = C87790d.class;
        if (C85185b.vx0()) {
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("FacePro");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTCommon");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTFaceTrackPro2");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTAGReflectLiveCheck");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTPoseDetect");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("opencv_world");
            ((C87790d) C86312j.m106911c(cls)).mo122034R0("YTLipReader");
        }
        YTCommonExInterface.setIsEnabledLog(true);
        YTCommonExInterface.setIsEnabledNativeLog(true);
    }

    public C105347i() {
        int i = 2;
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_face_sdk_log_level, 2);
        if (Qe >= 0 && Qe <= 5) {
            i = Qe;
        }
        YtLogger.setLogLevel(i);
        Log.m105925i("MicroMsg.FaceFlashManager", "choose sdk log level:%s", Integer.valueOf(i));
        YtLogger.setLoggerListener(new C105348a(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo149951a(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode r18, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.IYtSDKKitFrameworkEventListener r19) {
        /*
            r17 = this;
            java.lang.String r0 = xt1.C15900c.f42778a
            java.lang.String r1 = "YtSDKKitConfigHelper getSDKConfig:%s"
            java.lang.String r2 = "video_path"
            java.lang.String r3 = ".mp4"
            java.lang.String r4 = "/"
            java.lang.String r5 = "resource_download_path"
            java.lang.String r6 = "par config error. config:%s"
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            java.lang.String r7 = "MicroMsg.FaceFlashManagerConfig"
            java.lang.String r8 = ""
            r9 = 1
            r10 = 0
            int[] r11 = xt1.C15900c.C15901a.f42779a     // Catch:{ Exception -> 0x00a7 }
            int r12 = r18.ordinal()     // Catch:{ Exception -> 0x00a7 }
            r11 = r11[r12]     // Catch:{ Exception -> 0x00a7 }
            if (r11 == r9) goto L_0x0051
            r12 = 2
            if (r11 == r12) goto L_0x0044
            r12 = 3
            if (r11 == r12) goto L_0x0037
            r12 = 4
            if (r11 == r12) goto L_0x002a
            goto L_0x005d
        L_0x002a:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00a7 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x00a7 }
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_face_flash_config_lipread     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = r0.Y60(r11, r8)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x005d
        L_0x0037:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00a7 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x00a7 }
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_face_flash_config_actref     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = r0.Y60(r11, r8)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x005d
        L_0x0044:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00a7 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x00a7 }
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_face_flash_config_reflect     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = r0.Y60(r11, r8)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x005d
        L_0x0051:
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x00a7 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x00a7 }
            h81.h$c r11 = h81.C32735h.C32737c.clicfg_face_flash_config_action     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = r0.Y60(r11, r8)     // Catch:{ Exception -> 0x00a7 }
        L_0x005d:
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x00a7 }
            if (r0 != 0) goto L_0x00af
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00a7 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00a7 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r11.<init>()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r12 = com.tencent.p014mm.plugin.facedetect.model.C85191v.m105070i()     // Catch:{ Exception -> 0x00a7 }
            r11.append(r12)     // Catch:{ Exception -> 0x00a7 }
            r11.append(r4)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00a7 }
            r0.put(r5, r11)     // Catch:{ Exception -> 0x00a7 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a7 }
            r11.<init>()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r12 = xt1.C15900c.f42778a     // Catch:{ Exception -> 0x00a7 }
            r11.append(r12)     // Catch:{ Exception -> 0x00a7 }
            long r12 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ Exception -> 0x00a7 }
            r11.append(r12)     // Catch:{ Exception -> 0x00a7 }
            r11.append(r3)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00a7 }
            r0.put(r2, r11)     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r12 = r0.toString()     // Catch:{ Exception -> 0x00a7 }
            r11[r10] = r12     // Catch:{ Exception -> 0x00a7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r11)     // Catch:{ Exception -> 0x00a7 }
            r14 = r18
            goto L_0x0118
        L_0x00a7:
            r0 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r11)
        L_0x00af:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r8 = "face_detect/configs/YtSDKSettings.json"
            java.lang.StringBuilder r0 = com.tencent.youtu.sdkkitframework.common.FileUtils.readAssetFile(r0, r8)
            java.lang.String r8 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010d }
            r0.<init>(r8)     // Catch:{ JSONException -> 0x010d }
            java.lang.String r11 = "sdk_settings"
            org.json.JSONObject r0 = r0.getJSONObject(r11)     // Catch:{ JSONException -> 0x010d }
            r14 = r18
            org.json.JSONObject r0 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.getSDKConfig(r14, r0)     // Catch:{ JSONException -> 0x010b }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x010b }
            r11.<init>()     // Catch:{ JSONException -> 0x010b }
            java.lang.String r12 = com.tencent.p014mm.plugin.facedetect.model.C85191v.m105070i()     // Catch:{ JSONException -> 0x010b }
            r11.append(r12)     // Catch:{ JSONException -> 0x010b }
            r11.append(r4)     // Catch:{ JSONException -> 0x010b }
            java.lang.String r4 = r11.toString()     // Catch:{ JSONException -> 0x010b }
            r0.put(r5, r4)     // Catch:{ JSONException -> 0x010b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x010b }
            r4.<init>()     // Catch:{ JSONException -> 0x010b }
            java.lang.String r5 = xt1.C15900c.f42778a     // Catch:{ JSONException -> 0x010b }
            r4.append(r5)     // Catch:{ JSONException -> 0x010b }
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ JSONException -> 0x010b }
            r4.append(r11)     // Catch:{ JSONException -> 0x010b }
            r4.append(r3)     // Catch:{ JSONException -> 0x010b }
            java.lang.String r3 = r4.toString()     // Catch:{ JSONException -> 0x010b }
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x010b }
            java.lang.Object[] r2 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x010b }
            java.lang.String r3 = r0.toString()     // Catch:{ JSONException -> 0x010b }
            r2[r10] = r3     // Catch:{ JSONException -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r2)     // Catch:{ JSONException -> 0x010b }
            goto L_0x0118
        L_0x010b:
            r0 = move-exception
            goto L_0x0110
        L_0x010d:
            r0 = move-exception
            r14 = r18
        L_0x0110:
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r6, r1)
            r0 = 0
        L_0x0118:
            r13 = r0
            if (r13 != 0) goto L_0x011c
            return r10
        L_0x011c:
            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework r11 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance()
            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework r0 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.getInstance()
            com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKPlatformContext r12 = r0.getPlatformContext()
            java.util.ArrayList r15 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitConfigHelper.getPipleStateNames(r18)
            r14 = r18
            r16 = r19
            int r0 = r11.init(r12, r13, r14, r15, r16)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r10] = r2
            java.lang.String r2 = "MicroMsg.FaceFlashManager"
            java.lang.String r3 = "YtSDKKitFramework init ret:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            if (r0 == 0) goto L_0x0155
            java.lang.Object[] r1 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r10] = r0
            java.lang.String r0 = "MicroMsg.FaceFlashManagerError"
            java.lang.String r2 = "YtSDKKitFramework init error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            return r10
        L_0x0155:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flash.C105347i.mo149951a(com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode, com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$IYtSDKKitFrameworkEventListener):boolean");
    }

    /* renamed from: b */
    public boolean mo149952b(Camera camera, int i) {
        int initCamera = YTCameraSetting.initCamera(MMApplicationContext.getContext(), camera, i);
        Log.m105925i("MicroMsg.FaceFlashManager", "YTCameraSetting  initCamera result:%s", Integer.valueOf(initCamera));
        if (initCamera != 0) {
            Log.m105921e("MicroMsg.FaceFlashManagerError", "YTCommonInterface  initAuth error:%s", Integer.valueOf(initCamera));
            return false;
        }
        YtSDKKitFramework.YtSDKPlatformContext platformContext = YtSDKKitFramework.getInstance().getPlatformContext();
        platformContext.currentCamera = camera;
        platformContext.currentCameraId = i;
        platformContext.currentRotateState = YTCameraSetting.getRotate(MMApplicationContext.getContext(), i, 1);
        platformContext.currentAppContext = MMApplicationContext.getContext();
        return true;
    }

    /* renamed from: c */
    public boolean mo149953c() {
        int b = Auth.m144677b(MMApplicationContext.getContext(), "rel_wechat_2055-12-06.lic1.2", "", 0);
        if (b == 0) {
            Auth.m144676a();
            Auth.getFailedReason(b);
        } else {
            Auth.m144676a();
            Auth.getFailedReason(b);
        }
        Log.m105925i("MicroMsg.FaceFlashManager", "YTCommonInterface  initAuth result:%s", Integer.valueOf(b));
        if (b == 0) {
            return true;
        }
        Log.m105921e("MicroMsg.FaceFlashManagerError", "YTCommonInterface  initAuth error:%s", Integer.valueOf(b));
        return false;
    }
}
