package d31;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import c31.C79924b;
import com.tencent.p014mm.plugin.crashfix.jni.BinderProxyTransactNativeHook;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;
import java.lang.reflect.Method;

/* renamed from: d31.a */
public class C86169a implements C79924b {

    /* renamed from: d31.a$a */
    public class C86170a implements ServiceConnection {
        public C86170a(C86169a aVar) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m105924i("MicroMsg.BadBinderMonitor", "onServiceConnected");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.m105924i("MicroMsg.BadBinderMonitor", "onServiceDisconnected");
        }
    }

    /* renamed from: a */
    public boolean mo58760a(int i) {
        Log.m105924i("MicroMsg.BadBinderMonitor", "api level " + i);
        if (i > 28) {
            return false;
        }
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_bad_binder_monitor, 0);
        Log.m105924i("MicroMsg.BadBinderMonitor", "Expt : " + Qe);
        return Qe == 1;
    }

    /* renamed from: b */
    public void mo58761b() {
        MultiProcessMMKV.getSingleMMKV("bad_binder_monitor_fix").putBoolean("BAD_BINDER_MONITOR_MMKV_END_BOOLEAN", true).commit();
    }

    /* renamed from: c */
    public boolean mo58762c() {
        boolean z = MultiProcessMMKV.getSingleMMKV("bad_binder_monitor_fix").getBoolean("BAD_BINDER_MONITOR_MMKV_START_BOOLEAN", false);
        boolean z2 = MultiProcessMMKV.getSingleMMKV("bad_binder_monitor_fix").getBoolean("BAD_BINDER_MONITOR_MMKV_END_BOOLEAN", false);
        Log.m105924i("MicroMsg.BadBinderMonitor", "start " + z);
        Log.m105924i("MicroMsg.BadBinderMonitor", "end " + z2);
        return z != z2;
    }

    /* renamed from: d */
    public boolean mo58763d() {
        BinderProxyTransactNativeHook.init();
        BinderProxyTransactNativeHook.calculateOffset();
        Log.m105924i("MicroMsg.BadBinderMonitor", "init finish");
        try {
            Method method = BinderProxyTransactNativeHook.class.getMethod("calculateOffset", new Class[0]);
            Class<?> cls = Class.forName("android.os.BinderProxy");
            Class cls2 = Integer.TYPE;
            BinderProxyTransactNativeHook.hook(cls.getMethod("transactNative", new Class[]{cls2, Parcel.class, Parcel.class, cls2}), method);
            Log.m105924i("MicroMsg.BadBinderMonitor", "test client hook !");
            Log.m105924i("MicroMsg.BadBinderMonitor", "test server hook !");
            Intent intent = new Intent();
            intent.setClassName(MMApplicationContext.getPackageName(), "com.tencent.mm.gpu.service.GpuHookServiceImpl");
            MMApplicationContext.getContext().bindService(intent, new C86170a(this), 1);
            Log.m105924i("MicroMsg.BadBinderMonitor", "hook succ ?");
            return true;
        } catch (Exception e) {
            Log.m105920e("MicroMsg.BadBinderMonitor", "hook error:" + e.getCause());
            return false;
        }
    }

    /* renamed from: e */
    public long mo58764e() {
        return 0;
    }

    public void start() {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("bad_binder_monitor_fix");
        singleMMKV.putBoolean("BAD_BINDER_MONITOR_MMKV_END_BOOLEAN", false);
        singleMMKV.putBoolean("BAD_BINDER_MONITOR_MMKV_START_BOOLEAN", true);
        singleMMKV.commit();
    }
}
