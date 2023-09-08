package p182kk;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.DeviceSupportStruct;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashMap;
import p151er.C20610v;
import p156gj.C107842p;
import p156gj.C87203t;
import w80.C111744e;
import z04.C112551y;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: kk.d */
public final class C21339d extends C86301e {

    /* renamed from: d */
    public final MultiProcessMMKV f60330d = MultiProcessMMKV.getDefault();

    /* renamed from: kk.d$b */
    public static final class C21340b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21339d f60331d;

        public C21340b(C21339d dVar) {
            this.f60331d = dVar;
        }

        public final void run() {
            DeviceSupportStruct deviceSupportStruct = new DeviceSupportStruct();
            this.f60331d.getClass();
            Object systemService = MMApplicationContext.getContext().getSystemService("window");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            deviceSupportStruct.f48273r = (int) ((WindowManager) systemService).getDefaultDisplay().getRefreshRate();
            Log.m105924i("MicroMsg.DeviceSupportTask", "checkScreenFPS:" + deviceSupportStruct.f48273r);
            this.f60331d.getClass();
            deviceSupportStruct.f48268m = C111744e.f334654d.mo163483f();
            Object systemService2 = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
            long j = (long) 1024;
            deviceSupportStruct.f48269n = (int) ((memoryInfo.totalMem / j) / j);
            String str = (String) ((HashMap) C87203t.m108268d()).get("hardware");
            deviceSupportStruct.f48270o = deviceSupportStruct.mo86045b("CPUName", str != null ? C112551y.m153814n(str, ",", ";", false) : "", true);
            int a = C107842p.m146108a();
            deviceSupportStruct.f48271p = (a >> 12) & 15;
            deviceSupportStruct.f48272q = a & 255;
            Log.m105924i("MicroMsg.DeviceSupportTask", "checkCPUSupport name:" + deviceSupportStruct.f48270o + " freq:" + deviceSupportStruct.f48272q + " core:" + deviceSupportStruct.f48271p + " memB:" + deviceSupportStruct.f48269n + " gpuScore:" + deviceSupportStruct.f48268m);
            C21339d.vx0(this.f60331d, deviceSupportStruct);
            this.f60331d.getClass();
            C20610v vVar = (C20610v) C86312j.m106911c(C20610v.class);
            int i = 2;
            deviceSupportStruct.f48263h = vVar.mo32269bc() ? 1 : 2;
            deviceSupportStruct.f48264i = vVar.mo32271yC() ? 1 : 2;
            deviceSupportStruct.f48265j = vVar.Xb0() ? 1 : 2;
            if (vVar.mo32270wb()) {
                i = 1;
            }
            deviceSupportStruct.f48266k = i;
            Log.m105924i("MicroMsg.DeviceSupportTask", "checkHdrPlaySupport Dolby:" + deviceSupportStruct.f48263h + " HDR10:" + deviceSupportStruct.f48264i + " HDR10Plus:" + deviceSupportStruct.f48265j + " HDRHLG:" + deviceSupportStruct.f48266k);
            this.f60331d.getClass();
            Object systemService3 = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService3, "null cannot be cast to non-null type android.app.ActivityManager");
            deviceSupportStruct.f48267l = deviceSupportStruct.mo86045b("OpenGLVersion", ((ActivityManager) systemService3).getDeviceConfigurationInfo().getGlEsVersion(), true);
            StringBuilder sb = new StringBuilder();
            sb.append("checkOpenGLVersion:");
            sb.append(deviceSupportStruct.f48267l);
            Log.m105924i("MicroMsg.DeviceSupportTask", sb.toString());
            deviceSupportStruct.mo86054n();
        }
    }

    public static final void vx0(C21339d dVar, DeviceSupportStruct deviceSupportStruct) {
        dVar.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            Log.m105920e("MicroMsg.DeviceSupportTask", "checkDeviceHdrScreenSupport failed");
            return;
        }
        Object systemService = MMApplicationContext.getContext().getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display.HdrCapabilities hdrCapabilities = ((WindowManager) systemService).getDefaultDisplay().getHdrCapabilities();
        int[] supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
        C87412m.m108593f(supportedHdrTypes, "hdrCapabilities.supportedHdrTypes");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        int i = 0;
        for (int i2 : supportedHdrTypes) {
            i++;
            if (i > 1) {
                sb.append("|");
            }
            sb.append(String.valueOf(i2));
        }
        sb.append("");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "joinTo(StringBuilder(), …ed, transform).toString()");
        deviceSupportStruct.f48259d = deviceSupportStruct.mo86045b("ScreenSupportedHdrType", sb4, true);
        float f = (float) 100;
        deviceSupportStruct.f48260e = (int) (hdrCapabilities.getDesiredMinLuminance() * f);
        deviceSupportStruct.f48261f = (int) (hdrCapabilities.getDesiredMaxLuminance() * f);
        deviceSupportStruct.f48262g = (int) (hdrCapabilities.getDesiredMaxAverageLuminance() * f);
        Log.m105924i("MicroMsg.DeviceSupportTask", "screen hdr type:" + deviceSupportStruct.f48259d + " minLuminance:" + hdrCapabilities.getDesiredMinLuminance() + " maxLuminance:" + hdrCapabilities.getDesiredMaxLuminance() + " maxAverageLuminance:" + hdrCapabilities.getDesiredMaxAverageLuminance());
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_android_device_support, true)) {
            long decodeLong = this.f60330d.decodeLong("MicroMsg.DeviceSupportTask", 0);
            if (!WeChatEnvironment.isCoolassistEnv() && !BuildInfo.IS_FLAVOR_PURPLE && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG) {
                z = false;
            }
            if (z || System.currentTimeMillis() - decodeLong > 86400000) {
                this.f60330d.encode("MicroMsg.DeviceSupportTask", System.currentTimeMillis());
                ((C119157j) C119157j.f356862d).mo183875f(new C21340b(this));
            }
        }
    }
}
