package com.tencent.magicar;

import android.content.Context;
import android.view.WindowManager;
import com.tencent.magicar.C80286a;
import j20.C117292a;
import k20.C9556a;
import kr0.C88261c;
import p1011nd.C88928a;

public class MagicAR implements C80286a.C80288b {
    private byte _hellAccFlag_;
    private Context mContext;
    private C80286a mDislayOrientationHelper;
    private long mInst = nativeCreate();
    private C88928a magicARCallback;

    public MagicAR(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        C80286a aVar = new C80286a(applicationContext);
        this.mDislayOrientationHelper = aVar;
        aVar.f235049d.add(this);
        aVar.f235048c.enable();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c("opencv_world");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar2.mo10232b(), "com/tencent/magicar/MagicAR", "<init>", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar2.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/magicar/MagicAR", "<init>", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c("wechatxlog");
        Object obj2 = new Object();
        C117292a.m165358d(obj2, aVar3.mo10232b(), "com/tencent/magicar/MagicAR", "<init>", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar3.mo10231a(0));
        C117292a.m165359e(obj2, "com/tencent/magicar/MagicAR", "<init>", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c("magicar");
        Object obj3 = new Object();
        C117292a.m165358d(obj3, aVar4.mo10232b(), "com/tencent/magicar/MagicAR", "<init>", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar4.mo10231a(0));
        C117292a.m165359e(obj3, "com/tencent/magicar/MagicAR", "<init>", "(Landroid/content/Context;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        nativeNotifyOrientationChanged(((WindowManager) this.mDislayOrientationHelper.f235046a.getSystemService("window")).getDefaultDisplay().getRotation());
    }

    public void bindTo(long j, long j2, long j3) {
        long j4 = this.mInst;
        if (j4 != 0) {
            nativeBindTo(j4, j, j2, j3);
        }
    }

    public void destroy() {
        long j = this.mInst;
        if (j != 0) {
            nativeDestroy(j);
        } else {
            this.mInst = 0;
        }
        C80286a aVar = this.mDislayOrientationHelper;
        aVar.f235049d.remove(this);
        if (aVar.f235049d.size() == 0) {
            aVar.f235048c.disable();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r4 = (r0 = (kr0.C88267e) ((kr0.C88261c) getMagicARCallback()).f255109a.mo124764Z()).getFileSystem().getAbsoluteFile(r4).mo119971i();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getLocalFilePath(java.lang.String r4) {
        /*
            r3 = this;
            nd.a r0 = r3.magicARCallback
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            return r1
        L_0x0007:
            nd.a r0 = r3.getMagicARCallback()
            kr0.c r0 = (kr0.C88261c) r0
            kr0.b r0 = r0.f255109a
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r0.mo124764Z()
            kr0.e r0 = (kr0.C88267e) r0
            if (r0 == 0) goto L_0x0038
            com.tencent.mm.plugin.appbrand.appstorage.h0 r2 = r0.getFileSystem()
            if (r2 == 0) goto L_0x0038
            com.tencent.mm.plugin.appbrand.appstorage.h0 r2 = r0.getFileSystem()
            com.tencent.mm.vfs.m1 r2 = r2.getAbsoluteFile(r4)
            if (r2 != 0) goto L_0x0028
            goto L_0x0038
        L_0x0028:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r0.getFileSystem()
            com.tencent.mm.vfs.m1 r4 = r0.getAbsoluteFile(r4)
            java.lang.String r4 = r4.mo119971i()
            if (r4 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.magicar.MagicAR.getLocalFilePath(java.lang.String):java.lang.String");
    }

    public C88928a getMagicARCallback() {
        return this.magicARCallback;
    }

    public String getWAAppInfo_appId() {
        C88928a aVar = this.magicARCallback;
        return aVar != null ? ((C88261c) aVar).f255109a.mo125521g0() : "";
    }

    public boolean getWAAppInfo_isGame() {
        C88928a aVar = this.magicARCallback;
        if (aVar == null) {
            return false;
        }
        C88261c cVar = (C88261c) aVar;
        return (cVar.f255109a.mo125523j0() == null || cVar.f255109a.mo125523j0().mo113036W() == null || !cVar.f255109a.mo125523j0().mo113036W().mo111300k()) ? false : true;
    }

    public String getWAAppInfo_path() {
        C88928a aVar = this.magicARCallback;
        if (aVar == null) {
            return "";
        }
        C88261c cVar = (C88261c) aVar;
        return (cVar.f255109a.mo125523j0() == null || cVar.f255109a.mo125523j0().mo113042Z() == null) ? "" : cVar.f255109a.mo125523j0().mo113042Z().getCurrentUrl();
    }

    public native void nativeBindTo(long j, long j2, long j3, long j4);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native void nativeNotifyOrientationChanged(int i);

    public void onDisplayOrientationChanged(int i) {
        nativeNotifyOrientationChanged(i);
    }

    public void setMagicARCallback(C88928a aVar) {
        this.magicARCallback = aVar;
    }
}
