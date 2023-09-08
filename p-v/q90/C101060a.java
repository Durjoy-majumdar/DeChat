package q90;

import android.app.ActivityManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tinker.loader.hotplug.EnvConsts;

/* renamed from: q90.a */
public class C101060a {

    /* renamed from: c */
    public static C101060a f295868c = new C101060a();

    /* renamed from: a */
    public int f295869a = 10485760;

    /* renamed from: b */
    public String f295870b = "default";

    public C101060a() {
        int largeMemoryClass = ((ActivityManager) MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        Log.m105925i("MicroMsg.CacheInvoke", "BitmapPool %dMB", Integer.valueOf(largeMemoryClass));
        if (largeMemoryClass >= 512) {
            this.f295869a = 62914560;
        } else if (largeMemoryClass >= 256) {
            this.f295869a = 31457280;
        } else {
            this.f295869a = 15728640;
        }
    }

    public boolean equals(Object obj) {
        return obj instanceof C101060a ? this.f295870b.equals(((C101060a) obj).f295870b) : super.equals(obj);
    }
}
