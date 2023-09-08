package mj0;

import com.github.henryye.nativeiv.BaseImageDecodeService;
import com.tencent.magicbrush.C80301a;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.plugin.appbrand.game.util.WAGameSampleUtil;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84108d;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84190d;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84191e;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import js0.C88024r;
import kr0.C88267e;
import p1017od.C89157e;
import p284zb.C91635f;
import p284zb.C91644k;
import p927ab.C79479d;
import p958eb.C86474e;
import p963fc.C86812g;
import te3.a65;
import te3.c65;
import te3.d65;
import uj0.C90665a;
import zp0.C91829i;

public class a$$i implements C84108d.C84109a {

    /* renamed from: a */
    public final /* synthetic */ C88732a f256120a;

    public a$$i(C88732a aVar) {
        this.f256120a = aVar;
    }

    /* renamed from: a */
    public void mo123171a(boolean z, C91829i iVar) {
        C86812g j0 = this.f256120a.mo125523j0();
        if (j0 == null) {
            Log.m105928w("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: can not get runtime!");
        } else if (j0.mo113064k0() || j0.f238117P) {
            Log.m105928w("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: runtime finished. abort");
        } else if (this.f256120a.f251270r.f262085c == null) {
            Log.m105920e("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: magic brush not created or destroyed!");
        } else if (z) {
            String str = j0.f238147j;
            C84108d dVar = this.f256120a.f256105B;
            AppBrandSysConfigWC appBrandSysConfigWC = (AppBrandSysConfigWC) j0.mo113051d0();
            C84191e eVar = C84185b.f245912a;
            C88024r.m109572b(new C84190d(str, dVar));
            C88732a aVar = this.f256120a;
            C79479d dVar2 = new C79479d();
            aVar.f256106C = dVar2;
            C80301a U = aVar.mo120910U();
            C86812g j05 = this.f256120a.mo125523j0();
            String str2 = j05.f238147j;
            dVar2.f233035d = str2;
            Log.m105925i("MicroMsg.MBImageDecodeRegistry", "MBImageDecodeRegistry register appid:%s,game:%b", str2, Boolean.TRUE);
            dVar2.f233036e = new ArrayList<>();
            dVar2.f233040i = 1004;
            dVar2.f233032a = true;
            dVar2.f233033b = new WeakReference<>(j05.mo113047b0() instanceof C91635f ? (C86474e) ((C91635f) j05.mo113047b0()).mo125517G0(C86474e.class) : null);
            BaseImageDecodeService baseImageDecodeService = U.f235055d;
            dVar2.f233034c = baseImageDecodeService;
            baseImageDecodeService.addDecodeEventListener(dVar2);
            C88732a aVar2 = this.f256120a;
            C79479d dVar3 = aVar2.f256106C;
            a65 a65 = aVar2.f256105B.f245573e;
            boolean z2 = a65.f130333d;
            int i = a65.f130334e;
            double d = a65.f130335f;
            dVar3.getClass();
            try {
                Log.m105925i("MicroMsg.MBImageDecodeRegistry", "setConfig shouldDoSample:%b,maxSampleNum:%d,sampleRate:%f", Boolean.valueOf(z2), Integer.valueOf(i), Double.valueOf(d));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MBImageDecodeRegistry", e, "setConfig Exception", new Object[0]);
            }
            dVar3.f233037f = z2;
            dVar3.f233038g = i;
            dVar3.f233039h = d;
            C83928t1 M0 = ((C88267e) this.f256120a.mo124764Z()).mo114341l0();
            if (M0 == null) {
                Log.m105928w("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: no game renderer!");
                return;
            }
            C90665a aVar3 = (C90665a) M0.mo116150E0(C90665a.class);
            if (aVar3 != null) {
                aVar3.mo124808q(this.f256120a.f256105B);
            } else {
                Log.m105928w("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: not game renderer!");
            }
            d65 d65 = this.f256120a.f256105B.f245572d;
            if (d65 != null) {
                Log.m105925i("MicroMsg.AppBrandGameServiceLogicImpWC", "config %b %d", Boolean.valueOf(d65.f182642j), Integer.valueOf(this.f256120a.f256105B.f245572d.f182643n));
                C88732a aVar4 = this.f256120a;
                d65 d652 = aVar4.f256105B.f245572d;
                aVar4.mo125519F0(new C91644k(aVar4, d652.f182642j ? (long) d652.f182643n : -1, WAGameSampleUtil.class));
            }
            C88732a aVar5 = this.f256120a;
            c65 c65 = aVar5.f256105B.f245571c;
            if (c65 != null && c65.f182417d != 0 && c65.f182419f != 0 && c65.f182420g != 0 && c65.f182421h != 0 && c65.f182418e != 0) {
                C89157e eVar2 = aVar5.mo120910U().f235059h;
                int i2 = c65.f182419f;
                int i3 = c65.f182420g;
                float f = (float) c65.f182421h;
                int i4 = c65.f182418e;
                synchronized (eVar2.f256898a) {
                    eVar2.f256903f = i2;
                    eVar2.f256905h = f;
                    eVar2.f256904g = i2 * i3;
                    eVar2.f256910m = i4;
                    eVar2.f256911n = false;
                    eVar2.f256908k = true;
                }
            } else if (DebuggerShell.f239772d) {
                C89157e eVar3 = aVar5.mo120910U().f235059h;
                synchronized (eVar3.f256898a) {
                    eVar3.f256903f = 5;
                    eVar3.f256905h = 10.0f;
                    eVar3.f256904g = 50;
                    eVar3.f256910m = 60;
                    eVar3.f256911n = true;
                    eVar3.f256908k = true;
                }
            }
        } else {
            Log.m105928w("MicroMsg.AppBrandGameServiceLogicImpWC", "hy: get sampling failed!");
        }
    }
}
