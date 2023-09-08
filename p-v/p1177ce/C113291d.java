package p1177ce;

import android.content.ComponentName;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.matrix.batterycanary.monitor.feature.C114436a;
import com.tencent.matrix.batterycanary.monitor.feature.C114444c;
import com.tencent.matrix.batterycanary.monitor.feature.C114451e;
import com.tencent.matrix.batterycanary.monitor.feature.C114462g0;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.C114519q0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.C80364g;
import com.tencent.matrix.batterycanary.monitor.feature.C80368h0;
import com.tencent.matrix.batterycanary.monitor.feature.C80373t0;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.matrix.batterycanary.stats.C114572i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p1177ce.C113314g;
import p1190de.C116609b;
import p723vf.C118672d;
import p981ie.C117173p;
import p981ie.C87705i;

/* renamed from: ce.d */
public interface C113291d extends C113314g.C113318d, C114462g0.C114464b, C114519q0.C114522b, JiffiesMonitorFeature.JiffiesListener, C116609b.C116613d, C114451e.C114457g {

    /* renamed from: ce.d$a */
    public static class C113292a implements C113291d {

        /* renamed from: d */
        public C113314g f338985d;

        /* renamed from: e */
        public C114467i f338986e;

        /* renamed from: f */
        public long f338987f;

        /* renamed from: ce.d$a$a */
        public class C113293a implements C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> {

            /* renamed from: a */
            public final /* synthetic */ C114467i f338988a;

            public C113293a(C114467i iVar) {
                this.f338988a = iVar;
            }

            public void accept(Object obj) {
                this.f338988a.mo173664h(new C113290c(this, (C114490k0.C114491a.C114492a) obj));
            }
        }

        /* renamed from: ce.d$a$b */
        public class C113294b implements C87705i<C114572i> {

            /* renamed from: a */
            public final /* synthetic */ C114467i f338990a;

            public C113294b(C113292a aVar, C114467i iVar) {
                this.f338990a = iVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void accept(java.lang.Object r15) {
                /*
                    r14 = this;
                    com.tencent.matrix.batterycanary.stats.i r15 = (com.tencent.matrix.batterycanary.stats.C114572i) r15
                    com.tencent.matrix.batterycanary.monitor.feature.i r0 = r14.f338990a
                    com.tencent.matrix.batterycanary.stats.a r1 = r15.f343366d
                    if (r1 != 0) goto L_0x000a
                    goto L_0x0148
                L_0x000a:
                    ce.a r1 = r0.f343163l
                    if (r1 != 0) goto L_0x0010
                    goto L_0x0148
                L_0x0010:
                    com.tencent.matrix.batterycanary.stats.h r1 = r15.f343367e
                    if (r1 == 0) goto L_0x0148
                    com.tencent.matrix.batterycanary.stats.h$a r1 = (com.tencent.matrix.batterycanary.stats.C114570h.C114571a) r1
                    java.lang.Class<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot> r2 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.class
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord r3 = new com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord
                    r3.<init>()
                    ce.a r4 = r0.f343163l
                    if (r4 != 0) goto L_0x0023
                    goto L_0x0145
                L_0x0023:
                    boolean r5 = r4.mo165844h()
                    long r6 = r4.f338976n
                    r4.mo165841e()
                    java.lang.String r8 = r0.f343167p
                    r3.f343333i = r8
                    r3.f343334j = r6
                    java.util.HashMap r6 = new java.util.HashMap
                    r6.<init>()
                    r3.f343330h = r6
                    boolean r6 = r4.mo165844h()
                    if (r6 == 0) goto L_0x0048
                    java.util.Map<java.lang.String, java.lang.Object> r6 = r3.f343330h
                    java.lang.Boolean r7 = java.lang.Boolean.TRUE
                    java.lang.String r8 = "app_fg"
                    r6.put(r8, r7)
                L_0x0048:
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r6 = r0.mo173667k(r2)
                    if (r6 == 0) goto L_0x0117
                    RECORD r7 = r6.f343207c
                    com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r7 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r7
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r7 = r7.f343062g
                    DIGIT r7 = r7.f343211a
                    java.lang.Long r7 = (java.lang.Long) r7
                    long r7 = r7.longValue()
                    java.util.Map<java.lang.String, java.lang.Object> r9 = r3.f343330h
                    java.lang.Long r7 = java.lang.Long.valueOf(r7)
                    java.lang.String r8 = "jiffy_total"
                    r9.put(r8, r7)
                    r7 = 0
                    if (r5 != 0) goto L_0x00a2
                    ce.a r5 = r0.f343163l
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$a r2 = r0.mo173667k(r2)
                    if (r5 == 0) goto L_0x0096
                    if (r2 != 0) goto L_0x0075
                    goto L_0x0096
                L_0x0075:
                    long r8 = r5.mo165841e()
                    RECORD r2 = r2.f343207c
                    com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r2
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b<java.lang.Long> r2 = r2.f343062g
                    DIGIT r2 = r2.f343211a
                    java.lang.Long r2 = (java.lang.Long) r2
                    long r10 = r2.longValue()
                    long r10 = r10 / r8
                    r12 = 5
                    int r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                    if (r2 < 0) goto L_0x0096
                    r8 = 1000(0x3e8, double:4.94E-321)
                    int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                    if (r2 < 0) goto L_0x0096
                    r2 = 1
                    goto L_0x0097
                L_0x0096:
                    r2 = 0
                L_0x0097:
                    if (r2 == 0) goto L_0x00a2
                    java.util.Map<java.lang.String, java.lang.Object> r2 = r3.f343330h
                    java.lang.Boolean r5 = java.lang.Boolean.TRUE
                    java.lang.String r8 = "jiffy_overheat"
                    r2.put(r8, r5)
                L_0x00a2:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    r3.f343335n = r2
                    RECORD r2 = r6.f343207c
                    com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot r2 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot) r2
                    com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c<com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesSnapshot> r2 = r2.f343063h
                    java.util.List<ITEM> r2 = r2.f343212a
                    int r5 = r2.size()
                    r8 = 5
                    int r5 = java.lang.Math.min(r5, r8)
                    java.util.List r2 = r2.subList(r7, r5)
                    java.util.Iterator r2 = r2.iterator()
                L_0x00c2:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L_0x0117
                    java.lang.Object r5 = r2.next()
                    com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r5 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r5
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo r7 = new com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo
                    r7.<init>()
                    java.lang.String r8 = r5.f343069e
                    r7.f343342f = r8
                    int r8 = r5.f343066b
                    r7.f343340d = r8
                    java.lang.String r8 = r5.f343067c
                    r7.f343341e = r8
                    DIGIT r8 = r5.f343211a
                    java.lang.Long r8 = (java.lang.Long) r8
                    long r8 = r8.longValue()
                    r7.f343343g = r8
                    java.lang.String r8 = r5.f343070f
                    boolean r8 = android.text.TextUtils.isEmpty(r8)
                    if (r8 != 0) goto L_0x0111
                    java.util.Map<java.lang.String, java.lang.String> r8 = r7.f343344h
                    java.lang.String r9 = "extra_stack_top"
                    boolean r8 = r8.containsKey(r9)
                    if (r8 != 0) goto L_0x0111
                    java.util.Map<java.lang.String, java.lang.String> r8 = r7.f343344h
                    boolean r8 = r8.isEmpty()
                    if (r8 == 0) goto L_0x010a
                    java.util.HashMap r8 = new java.util.HashMap
                    r8.<init>()
                    r7.f343344h = r8
                L_0x010a:
                    java.util.Map<java.lang.String, java.lang.String> r8 = r7.f343344h
                    java.lang.String r5 = r5.f343070f
                    r8.put(r9, r5)
                L_0x0111:
                    java.util.List<com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$ThreadInfo> r5 = r3.f343335n
                    r5.add(r7)
                    goto L_0x00c2
                L_0x0117:
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    r3.f343336o = r2
                    com.tencent.matrix.batterycanary.stats.e r2 = new com.tencent.matrix.batterycanary.stats.e
                    r2.<init>(r1, r0, r6, r3)
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo r5 = new com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo
                    r5.<init>()
                    r2.accept(r5)
                    com.tencent.matrix.batterycanary.stats.f r2 = new com.tencent.matrix.batterycanary.stats.f
                    r2.<init>(r1, r4, r3)
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo r4 = new com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo
                    r4.<init>()
                    r2.accept(r4)
                    com.tencent.matrix.batterycanary.stats.g r2 = new com.tencent.matrix.batterycanary.stats.g
                    r2.<init>(r1, r0, r3)
                    com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo r0 = new com.tencent.matrix.batterycanary.stats.BatteryRecord$ReportRecord$EntryInfo
                    r0.<init>()
                    r2.accept(r0)
                L_0x0145:
                    r15.mo173742j(r3)
                L_0x0148:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p1177ce.C113291d.C113292a.C113294b.accept(java.lang.Object):void");
            }
        }

        /* renamed from: ce.d$a$c */
        public static class C113295c {

            /* renamed from: ce.d$a$c$a */
            public class C113296a implements C87705i<C114490k0.C114491a.C114503c.C114505b> {

                /* renamed from: a */
                public final /* synthetic */ C113308d f338991a;

                public C113296a(C113295c cVar, C113308d dVar) {
                    this.f338991a = dVar;
                }

                public void accept(Object obj) {
                    C114490k0.C114491a.C114503c.C114505b bVar = (C114490k0.C114491a.C114503c.C114505b) obj;
                    this.f338991a.mo165864c("cpufreq_sampling");
                    C113308d dVar = this.f338991a;
                    dVar.mo165868g(bVar.f343231c + "(mls)\t" + bVar.f343229a + "(itv)");
                    this.f338991a.mo165869h("max", String.valueOf(bVar.f343234f));
                    this.f338991a.mo165869h("min", String.valueOf(bVar.f343235g));
                    this.f338991a.mo165869h("avg", String.valueOf(bVar.f343236h));
                    this.f338991a.mo165869h("cnt", String.valueOf(bVar.f343230b));
                }
            }

            /* renamed from: ce.d$a$c$b */
            public class C113297b implements C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> {

                /* renamed from: a */
                public final /* synthetic */ C114490k0.C114491a.C114492a f338992a;

                /* renamed from: b */
                public final /* synthetic */ C117173p f338993b;

                /* renamed from: c */
                public final /* synthetic */ C113308d f338994c;

                /* renamed from: d */
                public final /* synthetic */ long f338995d;

                public C113297b(C113295c cVar, C114490k0.C114491a.C114492a aVar, C117173p pVar, C113308d dVar, long j) {
                    this.f338992a = aVar;
                    this.f338993b = pVar;
                    this.f338994c = dVar;
                    this.f338995d = j;
                }

                public void accept(Object obj) {
                    C114490k0.C114491a.C114492a aVar = (C114490k0.C114491a.C114492a) obj;
                    double c = ((CpuStatFeature.C114427b) this.f338992a.f343205a).mo173608c(this.f338993b, ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343205a).f343062g.f343211a).longValue());
                    double c2 = ((CpuStatFeature.C114427b) this.f338992a.f343206b).mo173608c(this.f338993b, ((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343206b).f343062g.f343211a).longValue());
                    C113308d dVar = this.f338994c;
                    Locale locale = Locale.US;
                    dVar.mo165869h("inc_prc_sip", String.format(locale, "%.2f(mAh)/min", new Object[]{Double.valueOf((c2 - c) / ((double) this.f338995d))}));
                    this.f338994c.mo165869h("cur_prc_sip", String.format(locale, "%.2f(mAh)", new Object[]{Double.valueOf(c2)}));
                }
            }

            /* renamed from: ce.d$a$c$c */
            public class C113298c implements C87705i<C114490k0.C114491a.C114503c.C114505b> {

                /* renamed from: a */
                public final /* synthetic */ C113308d f338996a;

                public C113298c(C113295c cVar, C113308d dVar) {
                    this.f338996a = dVar;
                }

                public void accept(Object obj) {
                    C114490k0.C114491a.C114503c.C114505b bVar = (C114490k0.C114491a.C114503c.C114505b) obj;
                    this.f338996a.mo165864c("batt_temp_sampling");
                    C113308d dVar = this.f338996a;
                    dVar.mo165868g(bVar.f343231c + "(mls)\t" + bVar.f343229a + "(itv)");
                    this.f338996a.mo165869h("max", String.valueOf(bVar.f343234f));
                    this.f338996a.mo165869h("min", String.valueOf(bVar.f343235g));
                    this.f338996a.mo165869h("avg", String.valueOf(bVar.f343236h));
                    this.f338996a.mo165869h("cnt", String.valueOf(bVar.f343230b));
                }
            }

            /* renamed from: ce.d$a$c$d */
            public class C113299d implements C87705i<C114490k0.C114491a.C114492a<JiffiesMonitorFeature.JiffiesSnapshot>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f338997a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f338998b;

                public C113299d(C114467i iVar, C113308d dVar) {
                    this.f338997a = iVar;
                    this.f338998b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f338997a, this.f338998b);
                }
            }

            /* renamed from: ce.d$a$c$e */
            public class C113300e implements C87705i<C114490k0.C114491a.C114492a<C114444c.C114446c>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339000a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339001b;

                public C113300e(C114467i iVar, C113308d dVar) {
                    this.f339000a = iVar;
                    this.f339001b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339000a, this.f339001b);
                }
            }

            /* renamed from: ce.d$a$c$f */
            public class C113301f implements C87705i<C114490k0.C114491a.C114492a<C114519q0.C114523c>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339003a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339004b;

                public C113301f(C114467i iVar, C113308d dVar) {
                    this.f339003a = iVar;
                    this.f339004b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339003a, this.f339004b);
                }
            }

            /* renamed from: ce.d$a$c$g */
            public class C113302g implements C87705i<C114490k0.C114491a.C114492a<C80364g.C80367b>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339006a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339007b;

                public C113302g(C114467i iVar, C113308d dVar) {
                    this.f339006a = iVar;
                    this.f339007b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339006a, this.f339007b);
                }
            }

            /* renamed from: ce.d$a$c$h */
            public class C113303h implements C87705i<C114490k0.C114491a.C114492a<C80373t0.C80376b>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339009a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339010b;

                public C113303h(C114467i iVar, C113308d dVar) {
                    this.f339009a = iVar;
                    this.f339010b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339009a, this.f339010b);
                }
            }

            /* renamed from: ce.d$a$c$i */
            public class C113304i implements C87705i<C114490k0.C114491a.C114492a<C80368h0.C80371b>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339012a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339013b;

                public C113304i(C114467i iVar, C113308d dVar) {
                    this.f339012a = iVar;
                    this.f339013b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339012a, this.f339013b);
                }
            }

            /* renamed from: ce.d$a$c$j */
            public class C113305j implements C87705i<C114490k0.C114491a.C114492a<CpuStatFeature.C114427b>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339015a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339016b;

                public C113305j(C114467i iVar, C113308d dVar) {
                    this.f339015a = iVar;
                    this.f339016b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339015a, this.f339016b);
                }
            }

            /* renamed from: ce.d$a$c$k */
            public class C113306k implements C87705i<C114490k0.C114491a.C114492a<C114536x.C114543g>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339018a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339019b;

                public C113306k(C114467i iVar, C113308d dVar) {
                    this.f339018a = iVar;
                    this.f339019b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339018a, this.f339019b);
                }
            }

            /* renamed from: ce.d$a$c$l */
            public class C113307l implements C87705i<C114490k0.C114491a.C114492a<C114536x.C114541e>> {

                /* renamed from: a */
                public final /* synthetic */ C114467i f339021a;

                /* renamed from: b */
                public final /* synthetic */ C113308d f339022b;

                public C113307l(C114467i iVar, C113308d dVar) {
                    this.f339021a = iVar;
                    this.f339022b = dVar;
                }

                public void accept(Object obj) {
                    C113295c.this.mo165860b((C114490k0.C114491a.C114492a) obj, this.f339021a, this.f339022b);
                }
            }

            /* renamed from: a */
            public void mo165859a(C114467i iVar, C113308d dVar) {
                C113287a aVar;
                mo165861c(iVar, dVar);
                if (iVar.f343162k != null && (aVar = iVar.f343163l) != null) {
                    dVar.mo165863b("app_stats");
                    dVar.mo165864c("stat_time");
                    dVar.mo165869h("time", aVar.mo165841e() + "(min)");
                    dVar.mo165869h("fg", String.valueOf(aVar.f338963a));
                    dVar.mo165869h("bg", String.valueOf(aVar.f338964b));
                    dVar.mo165869h("fgSrv", String.valueOf(aVar.f338965c));
                    dVar.mo165869h("float", String.valueOf(aVar.f338966d));
                    dVar.mo165869h("devCharging", String.valueOf(aVar.f338967e));
                    dVar.mo165869h("devScreenOff", String.valueOf(aVar.f338969g));
                    if (!TextUtils.isEmpty(aVar.f338971i)) {
                        dVar.mo165869h("sceneTop1", aVar.f338971i + "/" + aVar.f338972j);
                    }
                    if (!TextUtils.isEmpty(aVar.f338973k)) {
                        dVar.mo165869h("sceneTop2", aVar.f338973k + "/" + aVar.f338974l);
                    }
                    iVar.mo173671o(C114451e.class, new C113309e(this, dVar));
                }
            }

            /* renamed from: b */
            public boolean mo165860b(C114490k0.C114491a.C114492a<?> aVar, C114467i iVar, C113308d dVar) {
                C113287a aVar2;
                long j;
                C114490k0.C114491a.C114492a<?> aVar3 = aVar;
                C114467i iVar2 = iVar;
                C113308d dVar2 = dVar;
                int i = 0;
                if (iVar2.f343162k == null || (aVar2 = iVar2.f343163l) == null) {
                    return false;
                }
                RECORD record = aVar3.f343207c;
                if (record instanceof JiffiesMonitorFeature.JiffiesSnapshot) {
                    long max = Math.max(1, aVar3.f343208d / 60000);
                    long c = iVar2.mo173660c(((Long) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343062g.f343211a).longValue());
                    dVar2.f339024a.append("| ");
                    dVar2.f339024a.append("cpu=");
                    dVar2.f339024a.append(Integer.valueOf(iVar.mo173666j()));
                    dVar2.f339024a.append("/");
                    dVar2.f339024a.append(Integer.valueOf(iVar.mo173672p()));
                    dVar.mo165866e();
                    dVar.mo165866e();
                    dVar2.f339024a.append("fg=");
                    int c2 = aVar2.mo165839c();
                    dVar2.f339024a.append(c2 != 1 ? c2 != 2 ? c2 != 3 ? c2 != 4 ? "unknown" : "float" : "fgSrv" : "bg" : "fg");
                    dVar.mo165866e();
                    dVar.mo165866e();
                    dVar2.f339024a.append("during(min)=");
                    dVar2.f339024a.append(Long.valueOf(max));
                    dVar.mo165866e();
                    dVar.mo165866e();
                    dVar2.f339024a.append("diff(jiffies)=");
                    dVar2.f339024a.append(((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343062g.f343211a);
                    dVar.mo165866e();
                    dVar.mo165866e();
                    dVar2.f339024a.append("avg(jiffies/min)=");
                    dVar2.f339024a.append(Long.valueOf(c));
                    dVar2.f339024a.append("\n");
                    dVar2.mo165863b("jiffies(" + ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.size() + ")");
                    dVar2.mo165869h("desc", "(status)name(tid)\tavg/total");
                    dVar2.mo165869h("inc_thread_num", String.valueOf(((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343064i.f343211a));
                    dVar2.mo165869h("cur_thread_num", String.valueOf(((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343206b).f343064i.f343211a));
                    long j2 = 0;
                    while (true) {
                        j = c;
                        if (i >= ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.size()) {
                            break;
                        }
                        JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry = (JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar3.f343207c).f343063h.f343212a.get(i);
                        long j3 = max;
                        long longValue = ((Long) threadJiffiesEntry.f343211a).longValue();
                        if (i < 8) {
                            dVar2.f339024a.append("|   -> (");
                            dVar2.f339024a.append(threadJiffiesEntry.f343068d ? "+" : "~");
                            dVar2.f339024a.append("/");
                            dVar2.f339024a.append(threadJiffiesEntry.f343069e);
                            dVar2.f339024a.append(")");
                            dVar2.f339024a.append(threadJiffiesEntry.f343067c);
                            dVar2.f339024a.append("(");
                            dVar2.f339024a.append(Integer.valueOf(threadJiffiesEntry.f343066b));
                            dVar2.f339024a.append(")\t");
                            dVar2.f339024a.append(Long.valueOf(iVar2.mo173660c(longValue)));
                            dVar2.f339024a.append("/");
                            dVar2.f339024a.append(Long.valueOf(longValue));
                            dVar2.f339024a.append("\tjiffies");
                            dVar2.mo165862a("\n");
                        } else {
                            j2 += longValue;
                        }
                        i++;
                        aVar3 = aVar;
                        c = j;
                        max = j3;
                    }
                    long j4 = max;
                    dVar2.mo165862a("|\t\t......\n");
                    if (j2 > 0) {
                        dVar2.f339024a.append("|   -> R/R)");
                        dVar2.f339024a.append("REMAINS");
                        dVar2.f339024a.append("(");
                        dVar2.f339024a.append(Integer.valueOf(((JiffiesMonitorFeature.JiffiesSnapshot) aVar.f343207c).f343063h.f343212a.size() - 8));
                        dVar2.f339024a.append(")\t");
                        dVar2.f339024a.append(Long.valueOf(iVar2.mo173660c(j2) / j4));
                        dVar2.f339024a.append("/");
                        dVar2.f339024a.append(Long.valueOf(j2));
                        dVar2.f339024a.append("\tjiffies");
                        dVar2.mo165862a("\n");
                    } else {
                        C114490k0.C114491a.C114492a<?> aVar4 = aVar;
                    }
                    int i2 = (j > 1000 ? 1 : (j == 1000 ? 0 : -1));
                    if (i2 <= 0 && aVar.mo173690b()) {
                        return true;
                    }
                    dVar2.f339024a.append("|  ");
                    String str = "";
                    dVar2.f339024a.append(i2 > 0 ? " #overHeat" : str);
                    if (!aVar.mo173690b()) {
                        str = " #invalid";
                    }
                    dVar2.f339024a.append(str);
                    dVar2.mo165862a("\n");
                    return true;
                }
                if (record instanceof C114444c.C114446c) {
                    dVar2.mo165864c("alarm");
                    dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                    dVar2.mo165869h("inc_alarm_count", String.valueOf(((C114444c.C114446c) aVar3.f343207c).f343122d.f343211a));
                    dVar2.mo165869h("inc_trace_count", String.valueOf(((C114444c.C114446c) aVar3.f343207c).f343123e.f343211a));
                    dVar2.mo165869h("inc_dupli_group", String.valueOf(((C114444c.C114446c) aVar3.f343207c).f343124f.f343211a));
                    dVar2.mo165869h("inc_dupli_count", String.valueOf(((C114444c.C114446c) aVar3.f343207c).f343125g.f343211a));
                } else if (record instanceof C114519q0.C114523c) {
                    dVar2.mo165864c("wake_lock");
                    dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                    dVar2.mo165869h("inc_lock_count", String.valueOf(((C114519q0.C114523c) aVar3.f343207c).f343270e));
                    dVar2.mo165869h("inc_time_total", String.valueOf(((C114519q0.C114523c) aVar3.f343207c).f343269d));
                    List<ITEM> list = ((C114519q0.C114523c) aVar3.f343206b).f343271f.f343212a;
                    if (list.isEmpty()) {
                        return true;
                    }
                    dVar2.mo165864c("locking");
                    for (ITEM item : list) {
                        BEAN bean = item.f343210a;
                        C114519q0.C114524d.C114526b bVar = (C114519q0.C114524d.C114526b) bean;
                        if (!(bVar.f343284f >= bVar.f343283e)) {
                            dVar2.mo165868g(((C114519q0.C114524d.C114526b) bean).toString());
                        }
                    }
                    return true;
                } else if (record instanceof C80364g.C80367b) {
                    dVar2.mo165864c("bluetooh");
                    dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                    dVar2.mo165869h("inc_regs_count", String.valueOf(((C80364g.C80367b) aVar3.f343207c).f235242d.f343211a));
                    dVar2.mo165869h("inc_dics_count", String.valueOf(((C80364g.C80367b) aVar3.f343207c).f235243e.f343211a));
                    dVar2.mo165869h("inc_scan_count", String.valueOf(((C80364g.C80367b) aVar3.f343207c).f235244f.f343211a));
                } else if (record instanceof C80373t0.C80376b) {
                    dVar2.mo165864c("wifi");
                    dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                    dVar2.mo165869h("inc_scan_count", String.valueOf(((C80373t0.C80376b) aVar3.f343207c).f235264d.f343211a));
                    dVar2.mo165869h("inc_qury_count", String.valueOf(((C80373t0.C80376b) aVar3.f343207c).f235265e.f343211a));
                } else if (record instanceof C80368h0.C80371b) {
                    dVar2.mo165864c(FirebaseAnalytics.C113379b.LOCATION);
                    dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                    dVar2.mo165869h("inc_scan_count", String.valueOf(((C80368h0.C80371b) aVar3.f343207c).f235251d.f343211a));
                } else if (record instanceof C114536x.C114543g) {
                    dVar2.mo165864c("cpufreq");
                    dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                    dVar2.mo165869h("inc", Arrays.toString(((C114536x.C114543g) aVar3.f343207c).f343312d.f343212a.toArray()));
                    dVar2.mo165869h("cur", Arrays.toString(((C114536x.C114543g) aVar3.f343206b).f343312d.f343212a.toArray()));
                    C113296a aVar5 = new C113296a(this, dVar2);
                    C114490k0.C114491a.C114503c.C114505b q = iVar2.mo173673q(C114536x.C114543g.class);
                    if (q != null) {
                        aVar5.accept(q);
                    }
                    return true;
                } else {
                    if (record instanceof CpuStatFeature.C114427b) {
                        long max2 = Math.max(1, aVar3.f343208d / 60000);
                        dVar2.mo165864c("dev_cpu_load");
                        dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                        CpuStatFeature cpuStatFeature = (CpuStatFeature) iVar2.mo173670n(CpuStatFeature.class);
                        if (cpuStatFeature != null) {
                            dVar2.mo165869h("usage", iVar.mo173669m() + "%");
                        }
                        for (int i3 = 0; i3 < ((CpuStatFeature.C114427b) aVar3.f343207c).f343053d.size(); i3++) {
                            dVar2.mo165869h("cpu" + i3, Arrays.toString(((CpuStatFeature.C114427b) aVar3.f343207c).f343053d.get(i3).f343212a.toArray()));
                        }
                        if (cpuStatFeature == null || !cpuStatFeature.mo173600x()) {
                            return true;
                        }
                        dVar2.mo165864c("cpu_sip");
                        C117173p pVar = cpuStatFeature.f343048k;
                        Locale locale = Locale.US;
                        dVar2.mo165869h("inc_cpu_sip", String.format(locale, "%.2f(mAh)/min", new Object[]{Double.valueOf(((CpuStatFeature.C114427b) aVar3.f343207c).mo173607b(pVar) / ((double) max2))}));
                        dVar2.mo165869h("cur_cpu_sip", String.format(locale, "%.2f(mAh)", new Object[]{Double.valueOf(((CpuStatFeature.C114427b) aVar3.f343206b).mo173607b(pVar))}));
                        iVar2.mo173668l(JiffiesMonitorFeature.JiffiesSnapshot.class, new C113297b(this, aVar, pVar, dVar, max2));
                        return true;
                    } else if (record instanceof C114536x.C114541e) {
                        dVar2.mo165864c("batt_temp");
                        dVar2.mo165868g(aVar3.f343208d + "(mls)\t" + (aVar3.f343208d / 60000) + "(min)");
                        dVar2.mo165869h("inc", String.valueOf(((C114536x.C114541e) aVar3.f343207c).f343310d.f343211a));
                        dVar2.mo165869h("cur", String.valueOf(((C114536x.C114541e) aVar3.f343206b).f343310d.f343211a));
                        C113298c cVar = new C113298c(this, dVar2);
                        C114490k0.C114491a.C114503c.C114505b q2 = iVar2.mo173673q(C114536x.C114541e.class);
                        if (q2 == null) {
                            return true;
                        }
                        cVar.accept(q2);
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }

            /* renamed from: c */
            public void mo165861c(C114467i iVar, C113308d dVar) {
                Class<C114536x.C114541e> cls = C114536x.C114541e.class;
                Class<C114536x.C114543g> cls2 = C114536x.C114543g.class;
                Class<CpuStatFeature.C114427b> cls3 = CpuStatFeature.C114427b.class;
                Class<C80368h0.C80371b> cls4 = C80368h0.C80371b.class;
                Class<C80373t0.C80376b> cls5 = C80373t0.C80376b.class;
                Class<C80364g.C80367b> cls6 = C80364g.C80367b.class;
                Class<C114519q0.C114523c> cls7 = C114519q0.C114523c.class;
                Class<C114444c.C114446c> cls8 = C114444c.C114446c.class;
                if (iVar.f343162k != null && iVar.f343163l != null) {
                    iVar.mo173668l(JiffiesMonitorFeature.JiffiesSnapshot.class, new C113299d(iVar, dVar));
                    if (!(iVar.mo173667k(cls8) == null && iVar.mo173667k(cls7) == null)) {
                        dVar.mo165863b("awake");
                        iVar.mo173668l(cls8, new C113300e(iVar, dVar));
                        iVar.mo173668l(cls7, new C113301f(iVar, dVar));
                    }
                    if (!(iVar.mo173667k(cls6) == null && iVar.mo173667k(cls5) == null && iVar.mo173667k(cls4) == null)) {
                        dVar.mo165863b("scanning");
                        iVar.mo173668l(cls6, new C113302g(iVar, dVar));
                        iVar.mo173668l(cls5, new C113303h(iVar, dVar));
                        iVar.mo173668l(cls4, new C113304i(iVar, dVar));
                    }
                    if (iVar.mo173670n(C114451e.class) != null || iVar.mo173667k(cls3) != null || iVar.mo173667k(cls2) != null || iVar.mo173667k(cls) != null) {
                        dVar.mo165863b("dev_stats");
                        iVar.mo173668l(cls3, new C113305j(iVar, dVar));
                        iVar.mo173668l(cls2, new C113306k(iVar, dVar));
                        iVar.mo173668l(cls, new C113307l(iVar, dVar));
                    }
                }
            }
        }

        /* renamed from: ce.d$a$d */
        public static class C113308d {

            /* renamed from: a */
            public final StringBuilder f339024a = new StringBuilder();

            /* renamed from: a */
            public C113308d mo165862a(Object obj) {
                this.f339024a.append(obj);
                return this;
            }

            /* renamed from: b */
            public C113308d mo165863b(String str) {
                StringBuilder sb = this.f339024a;
                sb.append("+ --------------------------------------------------------------------------------------------");
                sb.append("\n");
                StringBuilder sb4 = this.f339024a;
                sb4.append("| ");
                sb4.append(str);
                sb4.append(" :");
                sb4.append("\n");
                return this;
            }

            /* renamed from: c */
            public C113308d mo165864c(String str) {
                StringBuilder sb = this.f339024a;
                sb.append("| ");
                sb.append("  <");
                sb.append(str);
                sb.append(">\n");
                return this;
            }

            /* renamed from: d */
            public void mo165865d() {
                try {
                    C118672d.m167353c("Matrix.battery.BatteryPrinter", "%s", "\t\n" + this.f339024a.toString());
                } catch (Throwable th) {
                    C118672d.m167354d("Matrix.battery.BatteryPrinter", th, "log format error", new Object[0]);
                }
            }

            /* renamed from: e */
            public C113308d mo165866e() {
                this.f339024a.append("\t");
                return this;
            }

            /* renamed from: f */
            public C113308d mo165867f() {
                this.f339024a.append("**********************************************************************************************");
                return this;
            }

            /* renamed from: g */
            public C113308d mo165868g(String str) {
                StringBuilder sb = this.f339024a;
                sb.append("| ");
                sb.append("  -> ");
                sb.append(str);
                sb.append("\n");
                return this;
            }

            /* renamed from: h */
            public C113308d mo165869h(String str, String str2) {
                StringBuilder sb = this.f339024a;
                sb.append("| ");
                sb.append("  -> ");
                sb.append(str);
                sb.append("\t= ");
                sb.append(str2);
                sb.append("\n");
                return this;
            }

            /* renamed from: i */
            public C113308d mo165870i() {
                StringBuilder sb = this.f339024a;
                sb.append("****************************************** PowerTest *****************************************");
                sb.append("\n");
                return this;
            }

            public String toString() {
                return this.f339024a.toString();
            }
        }

        /* renamed from: a */
        public void mo165846a() {
            this.f338987f = SystemClock.uptimeMillis();
            this.f338986e.mo173658a();
            this.f338986e.mo173679v();
        }

        /* renamed from: b */
        public void mo165847b(C114519q0.C114524d.C114526b bVar, long j) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0105, code lost:
            continue;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0105 A[EDGE_INSN: B:48:0x0105->B:23:0x0105 ?: BREAK  , SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo165848c(com.tencent.matrix.batterycanary.monitor.feature.C114490k0.C114491a.C114494b.C114502c<? extends com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry> r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                ce.d$a$d r2 = new ce.d$a$d
                r2.<init>()
                r2.mo165870i()
                java.lang.StringBuilder r3 = r2.f339024a
                java.lang.String r4 = "| Thread WatchDog"
                r3.append(r4)
                java.lang.String r3 = "\n"
                r2.mo165862a(r3)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "jiffies("
                r4.append(r5)
                java.util.List<ITEM> r5 = r1.f343212a
                int r5 = r5.size()
                r4.append(r5)
                java.lang.String r5 = ")"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r2.mo165863b(r4)
                java.lang.String r4 = "desc"
                java.lang.String r6 = "(status)name(tid)\ttotal"
                r2.mo165869h(r4, r6)
                java.util.List<ITEM> r4 = r1.f343212a
                java.util.Iterator r4 = r4.iterator()
            L_0x0045:
                boolean r6 = r4.hasNext()
                java.lang.String r7 = "("
                if (r6 == 0) goto L_0x00b7
                java.lang.Object r6 = r4.next()
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r6 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r6
                DIGIT r8 = r6.f343211a
                java.lang.Long r8 = (java.lang.Long) r8
                long r8 = r8.longValue()
                java.lang.StringBuilder r10 = r2.f339024a
                java.lang.String r11 = "|   -> ("
                r10.append(r11)
                boolean r10 = r6.f343068d
                if (r10 == 0) goto L_0x006a
                java.lang.String r10 = "+"
                goto L_0x006d
            L_0x006a:
                java.lang.String r10 = "~"
            L_0x006d:
                java.lang.StringBuilder r11 = r2.f339024a
                r11.append(r10)
                java.lang.StringBuilder r10 = r2.f339024a
                java.lang.String r11 = "/"
                r10.append(r11)
                java.lang.String r10 = r6.f343069e
                java.lang.StringBuilder r11 = r2.f339024a
                r11.append(r10)
                java.lang.StringBuilder r10 = r2.f339024a
                r10.append(r5)
                java.lang.String r10 = r6.f343067c
                java.lang.StringBuilder r11 = r2.f339024a
                r11.append(r10)
                java.lang.StringBuilder r10 = r2.f339024a
                r10.append(r7)
                int r6 = r6.f343066b
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.StringBuilder r7 = r2.f339024a
                r7.append(r6)
                java.lang.StringBuilder r6 = r2.f339024a
                java.lang.String r7 = ")\t"
                r6.append(r7)
                java.lang.Long r6 = java.lang.Long.valueOf(r8)
                java.lang.StringBuilder r7 = r2.f339024a
                r7.append(r6)
                java.lang.StringBuilder r6 = r2.f339024a
                java.lang.String r7 = "\tjiffies"
                r6.append(r7)
                r2.mo165862a(r3)
                goto L_0x0045
            L_0x00b7:
                java.lang.String r4 = "stacks"
                r2.mo165863b(r4)
                ce.g r4 = r0.f338985d
                ce.f r4 = r4.f339057d
                boolean r6 = r4.f339048s
                if (r6 == 0) goto L_0x00cc
                java.util.List<java.lang.String> r4 = r4.f339052w
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L_0x0107
            L_0x00cc:
                java.util.List<ITEM> r4 = r1.f343212a
                java.util.Iterator r4 = r4.iterator()
            L_0x00d2:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x0107
                java.lang.Object r8 = r4.next()
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r8 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r8
                ce.g r9 = r0.f338985d
                ce.f r9 = r9.f339057d
                java.util.List<java.lang.String> r9 = r9.f339052w
                java.util.Iterator r9 = r9.iterator()
            L_0x00e8:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x0105
                java.lang.Object r10 = r9.next()
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r11 = r8.f343067c
                boolean r11 = r10.equalsIgnoreCase(r11)
                if (r11 != 0) goto L_0x0104
                java.lang.String r11 = r8.f343067c
                boolean r10 = r11.contains(r10)
                if (r10 == 0) goto L_0x00e8
            L_0x0104:
                r6 = 1
            L_0x0105:
                if (r6 == 0) goto L_0x00d2
            L_0x0107:
                if (r6 == 0) goto L_0x01cc
                java.util.Map r4 = java.lang.Thread.getAllStackTraces()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "onWatchingThreads dump stacks, get all threads size = "
                r6.append(r8)
                r6.append(r4)
                java.lang.String r6 = r6.toString()
                r8 = 0
                java.lang.Object[] r9 = new java.lang.Object[r8]
                java.lang.String r10 = "Matrix.battery.BatteryPrinter"
                p723vf.C118672d.m167353c(r10, r6, r9)
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x012e:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x01d7
                java.lang.Object r6 = r4.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r9 = r6.getKey()
                java.lang.Thread r9 = (java.lang.Thread) r9
                java.lang.Object r6 = r6.getValue()
                java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
                java.lang.String r10 = r9.getName()
                java.util.List<ITEM> r11 = r1.f343212a
                java.util.Iterator r11 = r11.iterator()
            L_0x0150:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x012e
                java.lang.Object r12 = r11.next()
                com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot$ThreadJiffiesEntry r12 = (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) r12
                java.lang.String r12 = r12.f343067c
                boolean r13 = r12.equalsIgnoreCase(r10)
                if (r13 != 0) goto L_0x016a
                boolean r12 = r10.contains(r12)
                if (r12 == 0) goto L_0x01ca
            L_0x016a:
                java.lang.StringBuilder r12 = r2.f339024a
                java.lang.String r13 = "|   -> "
                r12.append(r13)
                java.lang.StringBuilder r12 = r2.f339024a
                r12.append(r7)
                java.lang.Thread$State r12 = r9.getState()
                java.lang.StringBuilder r13 = r2.f339024a
                r13.append(r12)
                java.lang.StringBuilder r12 = r2.f339024a
                r12.append(r5)
                java.lang.StringBuilder r12 = r2.f339024a
                r12.append(r10)
                java.lang.StringBuilder r12 = r2.f339024a
                r12.append(r7)
                long r12 = r9.getId()
                java.lang.Long r12 = java.lang.Long.valueOf(r12)
                java.lang.StringBuilder r13 = r2.f339024a
                r13.append(r12)
                java.lang.StringBuilder r12 = r2.f339024a
                r12.append(r5)
                r2.mo165862a(r3)
                ce.g r12 = r0.f338985d
                ce.f r12 = r12.f339057d
                ie.h r12 = r12.f339026A
                r12.getClass()
                p981ie.C117159b.m165222w(r6, r8)
                int r12 = r6.length
                r13 = 0
            L_0x01b2:
                if (r13 >= r12) goto L_0x01ca
                r14 = r6[r13]
                java.lang.StringBuilder r15 = r2.f339024a
                java.lang.String r8 = "|      "
                r15.append(r8)
                java.lang.StringBuilder r8 = r2.f339024a
                r8.append(r14)
                r2.mo165862a(r3)
                int r13 = r13 + 1
                r8 = 0
                goto L_0x01b2
            L_0x01ca:
                r8 = 0
                goto L_0x0150
            L_0x01cc:
                java.lang.StringBuilder r1 = r2.f339024a
                java.lang.String r4 = "|   disabled"
                r1.append(r4)
                r2.mo165862a(r3)
            L_0x01d7:
                r2.mo165867f()
                r2.mo165865d()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p1177ce.C113291d.C113292a.mo165848c(com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c):void");
        }

        /* renamed from: d */
        public void mo165849d(int i, C114519q0.C114524d.C114526b bVar) {
        }

        /* renamed from: e */
        public void mo165850e(boolean z) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f338987f;
            long j2 = uptimeMillis - j;
            if (j <= 0 || j2 <= 0) {
                C118672d.m167356f("Matrix.battery.BatteryPrinter", "skip invalid battery tracing, bgn = " + this.f338987f + ", during = " + j2, new Object[0]);
                return;
            }
            this.f338986e.mo173662f();
            C113287a aVar = this.f338986e.f343163l;
            if (aVar != null) {
                aVar.f338977o = new AtomicBoolean(z);
            }
            mo165857l(this.f338986e);
        }

        /* renamed from: f */
        public void mo165851f(C114490k0.C114491a.C114492a<C114436a.C114440d> aVar) {
            C114467i iVar = new C114467i(this.f338985d, "internal");
            iVar.f343163l = C113287a.m155094b(aVar.f343208d);
            ((HashMap) iVar.f343154c).put(C114462g0.C114465c.class, aVar);
            mo165858m(iVar);
        }

        /* renamed from: g */
        public void mo165852g(boolean z, int i, int i2, ComponentName componentName, long j) {
        }

        /* renamed from: h */
        public void mo165853h(C116609b.C116612c cVar) {
        }

        /* renamed from: i */
        public C113292a mo165854i(C113314g gVar) {
            this.f338985d = gVar;
            C114467i iVar = new C114467i(gVar, "canary");
            this.f338986e = iVar;
            iVar.mo173676t();
            return this;
        }

        /* renamed from: j */
        public void mo165855j(C114467i iVar) {
            iVar.mo173668l(JiffiesMonitorFeature.JiffiesSnapshot.class, new C113293a(iVar));
        }

        /* renamed from: k */
        public C113295c mo165856k() {
            return new C113295c();
        }

        /* renamed from: l */
        public void mo165857l(C114467i iVar) {
            C113295c k = mo165856k();
            C113308d dVar = new C113308d();
            dVar.mo165870i();
            k.mo165859a(iVar, dVar);
            dVar.mo165867f();
            dVar.mo165865d();
            mo165855j(iVar);
            mo165858m(iVar);
        }

        /* renamed from: m */
        public void mo165858m(C114467i iVar) {
            iVar.mo173671o(C114572i.class, new C113294b(this, iVar));
        }
    }
}
