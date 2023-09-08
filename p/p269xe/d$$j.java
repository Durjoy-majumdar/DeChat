package p269xe;

import android.util.SparseArray;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114444c;
import com.tencent.matrix.batterycanary.monitor.feature.C114462g0;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.C80364g;
import com.tencent.matrix.batterycanary.monitor.feature.C80368h0;
import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p1195ge.C116947b;
import p212oe.C117750b;
import p212oe.C117754c0;
import p212oe.C117775r;
import p212oe.C117776s;
import p212oe.C117778u;
import p212oe.b$$f;
import p212oe.b$$g;
import p269xe.C91179e;
import p981ie.C117159b;

/* renamed from: xe.d$$j */
public class d$$j {

    /* renamed from: a */
    public final String f355663a;

    public d$$j(String str) {
        this.f355663a = str;
    }

    /* renamed from: a */
    public void mo183582a(C114467i iVar) {
        if ("biz".equals(iVar.f343167p) && (iVar instanceof C117776s)) {
            String y = ((C117776s) iVar).mo182526y();
            if ("ExplicitBg".equals(y) || "ExplicitBgPoll".equals(y) || "ExplicitFg".equals(y) || "ExcessiveCpu".equals(y)) {
                iVar.mo173664h(new d$$j$$g(this, iVar));
                return;
            }
        }
        C114490k0.C114491a.C114492a<C114444c.C114446c> k = iVar.mo173667k(C114444c.C114446c.class);
        if (k != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$m(k));
        }
        C114490k0.C114491a.C114492a<C80364g.C80367b> k2 = iVar.mo173667k(C80364g.C80367b.class);
        if (k2 != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$k(k2));
        }
        C114490k0.C114491a.C114492a<C114536x.C114543g> k3 = iVar.mo173667k(C114536x.C114543g.class);
        C114490k0.C114491a.C114492a<CpuStatFeature.C114427b> k4 = iVar.mo173667k(CpuStatFeature.C114427b.class);
        C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot> k5 = iVar.mo173667k(JiffiesMonitorFeature.JiffiesSnapshot.class);
        if (k5 != null) {
            iVar.mo173664h(new d$$j$$d(this, k5, iVar));
        }
        C114490k0.C114491a.C114492a<C114536x.C114541e> k6 = iVar.mo173667k(C114536x.C114541e.class);
        if (k6 != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$j(this, k6, iVar));
        }
        C114490k0.C114491a.C114492a<C114519q0.C114523c> k7 = iVar.mo173667k(C114519q0.C114523c.class);
        if (k7 != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$c(k7));
        }
        C114490k0.C114491a.C114492a<C80373t0.C80376b> k8 = iVar.mo173667k(C80373t0.C80376b.class);
        if (k8 != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$l(k8));
        }
        C114490k0.C114491a.C114492a<C80368h0.C80371b> k9 = iVar.mo173667k(C80368h0.C80371b.class);
        if (k9 != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$i(k9));
        }
        C114490k0.C114491a.C114492a<b$$g> k15 = iVar.mo173667k(b$$g.class);
        if (k15 != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$f(k15));
        }
        C114490k0.C114491a.C114492a<C114513o0.C114515b> k16 = iVar.mo173667k(C114513o0.C114515b.class);
        if (k16 != null && this.f355663a.equals("canary")) {
            iVar.mo173664h(new d$$j$$a(k16));
        }
        if (iVar.mo173667k(C116947b.C116948a.class) != null) {
            iVar.mo173664h(new d$$j$$h(iVar));
        }
        C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) ((HashMap) iVar.f343154c).get(C114462g0.C114465c.class);
        if (aVar != null && this.f355663a.equals("internal")) {
            iVar.mo173664h(new d$$j$$n(aVar, iVar));
        }
        if (iVar instanceof C117776s) {
            C117776s sVar = (C117776s) iVar;
            List list = (List) ((HashMap) sVar.f343158g).get(C117754c0.class);
            if (list != null) {
                mo183583b("threadPool", iVar, list);
            }
            List list2 = (List) ((HashMap) sVar.f343158g).get(C117778u.class);
            if (list2 != null) {
                mo183583b("handler", iVar, list2);
            }
            List list3 = (List) ((HashMap) sVar.f343158g).get(C117775r.class);
            if (list3 != null) {
                mo183583b("ipc", iVar, list3);
            }
        }
    }

    /* renamed from: b */
    public void mo183583b(String str, C114467i iVar, List<C114490k0.C114491a.C114492a<C114436a.C114440d>> list) {
        String str2;
        String str3 = str;
        if (this.f355663a.equals("canary") || this.f355663a.equals("overheat")) {
            Collections.sort(list, new d$$j$$b());
            for (C114490k0.C114491a.C114492a next : list) {
                long longValue = ((Long) ((C114436a.C114440d) next.f343207c).f343110g.f343211a).longValue();
                long j = next.f343208d;
                long max = j < 60000 ? (longValue / Math.max(1, (j * 100) / 60000)) * 100 : longValue / Math.max(1, j / 60000);
                int i = (max > 100 ? 1 : (max == 100 ? 0 : -1));
                if (i > 0) {
                    if (next.f343208d >= C117750b.m166046d() && next.mo173690b()) {
                        if (C117750b.f352135n) {
                            C114436a.C114440d dVar = (C114436a.C114440d) next.f343207c;
                            if (dVar.f343112i == 1) {
                                if (dVar.f343116m > 50) {
                                }
                            }
                            if (dVar.f343111h == 1 && dVar.f343115l <= ((long) Math.max(C117750b.f352122a, 0))) {
                            }
                        }
                        if (!(((C114436a.C114440d) next.f343207c).f343111h == 1)) {
                            if (max >= Math.max(C117750b.f352127f, 1000)) {
                                Log.m105928w("Matrix.battery.listener", "#onReportTaskJiffies report as exception! name = " + ((C114436a.C114440d) next.f343207c).f343108e);
                                C91179e.C91181b.C91182a.m114442c(false, str3, next);
                                if (str3.equals("threadPool")) {
                                    C91179e.C91180a.m114436c(true);
                                }
                            } else if (next.f343208d >= 1800000 && i > 0) {
                                Log.m105928w("Matrix.battery.listener", "#onReportTaskJiffies report as long time exception! name = " + ((C114436a.C114440d) next.f343207c).f343108e);
                                C91179e.C91181b.C91182a.m114442c(true, str3, next);
                                if (str3.equals("threadPool")) {
                                    C91179e.C91180a.m114436c(true);
                                }
                            }
                        }
                        C91179e.C91180a.m114436c(false);
                        if (b$$f.m166058c() && ((Long) ((C114436a.C114440d) next.f343207c).f343110g.f343211a).longValue() >= 100 && next.f343208d >= 60000) {
                            String f = C118872b.m167609f();
                            StringBuilder sb = new StringBuilder();
                            C114436a.C114440d dVar2 = (C114436a.C114440d) next.f343207c;
                            int i2 = dVar2.f343111h;
                            int i3 = dVar2.f343112i;
                            String a = C91179e.m114432a();
                            long max2 = Math.max(1, next.f343208d / 60000);
                            long longValue2 = ((Long) ((C114436a.C114440d) next.f343207c).f343110g.f343211a).longValue() / max2;
                            Log.m105924i("Matrix.battery.BatteryReporter", "#statTaskJiffies, feat = " + str3);
                            sb.append("finish=");
                            sb.append(((C114436a.C114440d) next.f343207c).f343114k);
                            int h = C117159b.m165207h(MMApplicationContext.getContext());
                            sb.append("|");
                            sb.append("batTemp=");
                            sb.append(h);
                            int[] l = C117159b.m165211l();
                            if (l.length > 0) {
                                sb.append("|");
                                sb.append("cupFreq=");
                                sb.append(Arrays.toString(l));
                            }
                            if (str3.equals("threadPool")) {
                                str2 = "statTaskJiffies";
                            } else {
                                str2 = "stat" + C118872b.m167604a(str) + "TaskJiffies";
                            }
                            String str4 = str2;
                            SparseArray<Integer> sparseArray = C91179e.C91181b.f261436a;
                            C91179e.C91181b.m114437a(0, 5, f, sb.toString(), i2, i3, str4, longValue2, ((C114436a.C114440d) next.f343207c).f343108e, ((Long) ((C114436a.C114440d) next.f343206b).f343110g.f343211a).longValue(), "duringMin", max2, a, "", 0, 0, 0, "");
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
