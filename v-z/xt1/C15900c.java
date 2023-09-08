package xt1;

import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import h81.C32735h;

/* renamed from: xt1.c */
public class C15900c {

    /* renamed from: a */
    public static final String f42778a = (C85191v.m105070i() + XVFSFile.SEPARATOR_CHAR + "fdv_");

    /* renamed from: xt1.c$a */
    public static /* synthetic */ class C15901a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42779a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode[] r0 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42779a = r0
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTION_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_REFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_ACTREFLECT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f42779a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework$YtSDKKitFrameworkWorkMode r1 = com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework.YtSDKKitFrameworkWorkMode.YT_FW_LIPREAD_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xt1.C15900c.C15901a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m14813a() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_face_flash_verify_waiting_time, 1500);
        Log.m105925i("MicroMsg.FaceFlashManagerConfig", "getFaceWaitingTimeMs %d", Integer.valueOf(Qe));
        return Qe;
    }
}
