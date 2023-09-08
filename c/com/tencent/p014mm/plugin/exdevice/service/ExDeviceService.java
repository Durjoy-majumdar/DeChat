package com.tencent.p014mm.plugin.exdevice.service;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.Process;
import com.tencent.p014mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.p014mm.plugin.exdevice.service.C41182c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.service.MMService;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import l71.C117461a;

/* renamed from: com.tencent.mm.plugin.exdevice.service.ExDeviceService */
public class ExDeviceService extends MMService {

    /* renamed from: i */
    public C41182c.C41183a f345900i = null;

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.exdevice.ExDeviceService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        Log.m105924i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onBind");
        if (this.f345900i == null) {
            this.f345900i = new C18696o();
        }
        C117461a.m165683c(C117461a.C117463b.INVOKE_ONCE);
        return this.f345900i;
    }

    /* renamed from: d */
    public void mo112546d() {
        Log.m105924i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onCreate");
        super.mo112546d();
    }

    /* renamed from: e */
    public void mo112547e() {
        boolean z;
        Log.m105924i("MicroMsg.exdevice.ExDeviceService", "ExDeviceService onDestroy");
        Java2CExDevice.closeBluetoothAccessoryLib();
        super.mo112547e();
        PackageManager packageManager = MMApplicationContext.getContext().getPackageManager();
        try {
            packageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
            packageManager.getPackageInfo("com.google.android.wearable.app", 1);
            z = true;
        } catch (PackageManager.NameNotFoundException unused) {
            z = false;
        }
        Log.m105925i("MicroMsg.exdevice.ExDeviceService", "isInstallWearApp %b", Boolean.valueOf(z));
        if (!z) {
            Log.m105924i("MicroMsg.exdevice.ExDeviceService", "kill exdevice process now");
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/service/ExDeviceService", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj, "com/tencent/mm/plugin/exdevice/service/ExDeviceService", "killProcess", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        }
    }
}
