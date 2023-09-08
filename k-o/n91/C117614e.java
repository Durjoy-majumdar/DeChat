package n91;

import android.view.View;
import fy3.C32224a;
import g91.C20813c;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import rx3.C13601g;
import rx3.C36568h;
import te3.xr4;

/* renamed from: n91.e */
public final class C117614e {

    /* renamed from: a */
    public static final Map<String, WeakReference<View>> f351842a = new LinkedHashMap();

    /* renamed from: b */
    public static final C13601g f351843b = C36568h.m40985a(C21618d.f61209d);

    /* renamed from: c */
    public static final C13601g f351844c = C36568h.m40985a(C21615a.f61207d);

    /* renamed from: d */
    public static final C13601g f351845d = C36568h.m40985a(C21616b.f61208d);

    /* renamed from: e */
    public static final C21617c f351846e = new C21617c();

    /* renamed from: n91.e$a */
    public static final class C21615a extends C87413o implements C32224a<C21608a> {

        /* renamed from: d */
        public static final C21615a f61207d = new C21615a();

        public C21615a() {
            super(0);
        }

        public Object invoke() {
            return new C21608a();
        }
    }

    /* renamed from: n91.e$b */
    public static final class C21616b extends C87413o implements C32224a<C21611b> {

        /* renamed from: d */
        public static final C21616b f61208d = new C21616b();

        public C21616b() {
            super(0);
        }

        public Object invoke() {
            return new C21611b();
        }
    }

    /* renamed from: n91.e$c */
    public static final class C21617c implements C21613c {
        /* renamed from: a */
        public void mo33861a(View view, xr4 xr4) {
            if (xr4 != null) {
                if (view != null) {
                    C117614e.f351842a.put(xr4.f354547d + '|' + xr4.f354553j + '|' + xr4.f354555o, new WeakReference(view));
                }
                xr4.f354556p = System.currentTimeMillis() - xr4.f354555o;
                C20813c.m22810a().mo32508c(800, xr4);
            }
        }
    }

    /* renamed from: n91.e$d */
    public static final class C21618d extends C87413o implements C32224a<C21619f> {

        /* renamed from: d */
        public static final C21618d f61209d = new C21618d();

        public C21618d() {
            super(0);
        }

        public Object invoke() {
            return new C21619f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d0, code lost:
        if (r3 == null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d6, code lost:
        if (r3 == null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d9, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x045d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03c1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m165883a(te3.xr4 r27) {
        /*
            r1 = r27
            if (r1 != 0) goto L_0x0005
            return
        L_0x0005:
            java.lang.String r0 = r1.f354550g
            r2 = -1
            if (r0 == 0) goto L_0x001f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x001f
            int r0 = r1.f354554n
            if (r0 == r2) goto L_0x001f
            if (r0 != 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            r0 = -1
            r6 = 0
            goto L_0x004b
        L_0x001f:
            android.util.Pair r0 = ca1.C113264b.m155058d()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r6 = r0.first
            te3.eg2 r6 = (te3.C118427eg2) r6
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 != 0) goto L_0x0037
            r0 = -1
            goto L_0x003b
        L_0x0037:
            int r0 = r0.intValue()
        L_0x003b:
            if (r6 == 0) goto L_0x004b
            java.lang.String r7 = r6.f353969d
            java.lang.String r7 = e91.C116711b.m164583h(r7)
            r1.f354550g = r7
            int r7 = r6.f353977o
            r1.f354554n = r7
            r1.f354557q = r0
        L_0x004b:
            if (r6 == 0) goto L_0x004f
            if (r0 >= 0) goto L_0x006b
        L_0x004f:
            android.util.Pair r0 = ca1.C113264b.m155058d()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r6 = r0.first
            te3.eg2 r6 = (te3.C118427eg2) r6
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 != 0) goto L_0x0067
            r0 = -1
            goto L_0x006b
        L_0x0067:
            int r0 = r0.intValue()
        L_0x006b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r1.f354547d
            r7.append(r8)
            r8 = 124(0x7c, float:1.74E-43)
            r7.append(r8)
            int r9 = r1.f354553j
            r7.append(r9)
            r7.append(r8)
            long r8 = r1.f354555o
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r8 = f351842a
            java.util.LinkedHashMap r8 = (java.util.LinkedHashMap) r8
            java.lang.Object r7 = r8.get(r7)
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            if (r7 == 0) goto L_0x009e
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x009f
        L_0x009e:
            r7 = 0
        L_0x009f:
            java.lang.ref.WeakReference<java.lang.Object> r8 = da1.C20455a.f57486b
            if (r8 != 0) goto L_0x00b2
            e91.a r8 = e91.C20552a.m22323a()
            java.lang.ref.WeakReference<java.lang.Object> r8 = r8.f57845c
            if (r8 != 0) goto L_0x00ad
            r8 = 0
            goto L_0x00b6
        L_0x00ad:
            java.lang.Object r8 = r8.get()
            goto L_0x00b6
        L_0x00b2:
            java.lang.Object r8 = r8.get()
        L_0x00b6:
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L_0x00bc
            goto L_0x0327
        L_0x00bc:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig r10 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig.m162212a()
            r10.getClass()
            te3.t14 r10 = ba1.C113153e.m154822a()
            java.lang.String r11 = "HABBYGE-MALI.HellViewParamsCatcher"
            if (r10 != 0) goto L_0x00d2
            java.lang.String r7 = "HellViewParamsCatcher, catchBizParams2ViewNode, config is NULL !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r7)
            goto L_0x0327
        L_0x00d2:
            z91.b r12 = z91.C23462b.m28021f()
            java.lang.String r12 = r12.mo36921e()
            java.util.LinkedList<te3.w14> r10 = r10.f332264d
            java.util.Iterator r10 = r10.iterator()
        L_0x00e0:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x0327
            java.lang.Object r13 = r10.next()
            te3.w14 r13 = (te3.C110974w14) r13
            if (r13 != 0) goto L_0x00ef
            goto L_0x00e0
        L_0x00ef:
            java.lang.String r14 = r13.f332314d
            boolean r14 = gy3.C87412m.m108589b(r14, r12)
            if (r14 != 0) goto L_0x0100
            java.lang.String r14 = r13.f332314d
            boolean r14 = gy3.C87412m.m108589b(r9, r14)
            if (r14 != 0) goto L_0x0100
            goto L_0x00e0
        L_0x0100:
            java.lang.Class r14 = r8.getClass()
            java.lang.String r14 = r14.getName()
            java.lang.String r14 = e91.C116711b.m164583h(r14)
            if (r14 != 0) goto L_0x0110
            r15 = 0
            goto L_0x013d
        L_0x0110:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.LinkedList<te3.s14> r5 = r13.f332316f
            java.util.Iterator r5 = r5.iterator()
        L_0x011b:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x013d
            java.lang.Object r17 = r5.next()
            r2 = r17
            te3.s14 r2 = (te3.C118464s14) r2
            java.lang.String r3 = r2.f354328d
            java.lang.String r3 = e91.C116711b.m164583h(r3)
            if (r3 != 0) goto L_0x0132
            goto L_0x013b
        L_0x0132:
            boolean r3 = gy3.C87412m.m108589b(r14, r3)
            if (r3 == 0) goto L_0x013b
            r15.add(r2)
        L_0x013b:
            r2 = -1
            goto L_0x011b
        L_0x013d:
            if (r15 == 0) goto L_0x031e
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x0147
            goto L_0x031e
        L_0x0147:
            java.lang.String r2 = r1.f354547d
            java.lang.String r3 = "viewNode.id"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = r1.f354548e
            java.util.Iterator r5 = r15.iterator()
        L_0x0155:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x01d6
            java.lang.Object r14 = r5.next()
            te3.s14 r14 = (te3.C118464s14) r14
            java.util.LinkedList<te3.yr4> r14 = r14.f354330f
            java.util.Iterator r14 = r14.iterator()
        L_0x0167:
            boolean r18 = r14.hasNext()
            if (r18 == 0) goto L_0x0155
            java.lang.Object r18 = r14.next()
            r4 = r18
            te3.yr4 r4 = (te3.yr4) r4
            r18 = r5
            java.lang.String r5 = r4.f354607d
            boolean r5 = gy3.C87412m.m108589b(r2, r5)
            if (r5 == 0) goto L_0x01d3
            java.lang.String r5 = r4.f354612i
            if (r5 == 0) goto L_0x0199
            r22 = 130(0x82, double:6.4E-322)
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 932(0x3a4, double:4.605E-321)
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
            java.lang.String r2 = r4.f354612i
            java.lang.String r3 = "viewOp.resName"
            gy3.C87412m.m108593f(r2, r3)
            goto L_0x01da
        L_0x0199:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "geViewResName, viewId="
            r5.append(r14)
            r5.append(r2)
            java.lang.String r14 = ", viewOp.viewId="
            r5.append(r14)
            java.lang.String r14 = r4.f354607d
            r5.append(r14)
            java.lang.String r14 = ", viewOp.resName="
            r5.append(r14)
            java.lang.String r4 = r4.f354612i
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "HABBYGE-MALI.HellCloudData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            r22 = 159(0x9f, double:7.86E-322)
            com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r20 = 932(0x3a4, double:4.605E-321)
            r24 = 1
            r26 = 0
            r19.idkeyStat(r20, r22, r24, r26)
            if (r3 != 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d3:
            r5 = r18
            goto L_0x0167
        L_0x01d6:
            if (r3 != 0) goto L_0x01d9
            goto L_0x01da
        L_0x01d9:
            r2 = r3
        L_0x01da:
            r1.f354548e = r2
            long r2 = r13.f332315e
            java.util.Iterator r4 = r15.iterator()
        L_0x01e2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x031e
            java.lang.Object r5 = r4.next()
            te3.s14 r5 = (te3.C118464s14) r5
            java.util.LinkedList<te3.yr4> r13 = r5.f354330f
            java.lang.String r14 = "it.viewOps"
            gy3.C87412m.m108593f(r13, r14)
            java.util.Iterator r13 = r13.iterator()
        L_0x01f9:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x01e2
            java.lang.Object r14 = r13.next()
            te3.yr4 r14 = (te3.yr4) r14
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r18 = r4
            java.lang.String r4 = "catchParams: page="
            r15.append(r4)
            java.lang.String r4 = r5.f354328d
            r15.append(r4)
            java.lang.String r4 = ", "
            r15.append(r4)
            r19 = r5
            java.lang.String r5 = r1.f354547d
            r15.append(r5)
            java.lang.String r5 = " == "
            r15.append(r5)
            r20 = r7
            java.lang.String r7 = r14.f354607d
            r15.append(r7)
            r15.append(r4)
            java.lang.String r4 = r1.f354548e
            r15.append(r4)
            r15.append(r5)
            java.lang.String r4 = r14.f354612i
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            n91.g$a r4 = n91.C117615g.f351847a
            boolean r4 = r4.mo182338e(r1, r14)
            if (r4 != 0) goto L_0x0250
        L_0x024d:
            r15 = r8
            goto L_0x0315
        L_0x0250:
            int r4 = r14.f354608e
            r5 = 2
            r7 = 1
            if (r4 == r7) goto L_0x025b
            if (r4 == r5) goto L_0x0259
            goto L_0x024d
        L_0x0259:
            r4 = r8
            goto L_0x025d
        L_0x025b:
            r4 = r20
        L_0x025d:
            java.util.LinkedList<te3.ja3> r7 = r14.f354611h
            java.util.Iterator r7 = r7.iterator()
        L_0x0263:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x024d
            java.lang.Object r14 = r7.next()
            te3.ja3 r14 = (te3.C118438ja3) r14
            if (r14 != 0) goto L_0x0272
            goto L_0x0263
        L_0x0272:
            if (r4 == 0) goto L_0x030b
            java.lang.String r15 = r14.f354059d
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x030b
            java.lang.String r15 = r14.f354060e
            boolean r15 = android.text.TextUtils.isEmpty(r15)
            if (r15 != 0) goto L_0x030b
            te3.nl2 r15 = r14.f354063h
            if (r15 != 0) goto L_0x028b
            java.lang.String r15 = r14.f354060e
            goto L_0x028d
        L_0x028b:
            java.lang.String r15 = r15.f138657f
        L_0x028d:
            java.lang.String r5 = r14.f354062g
            r22 = r7
            java.lang.String r7 = r14.f354060e
            te3.fg2 r5 = da1.C116605b.m164446b(r4, r5, r15, r7)
            if (r5 != 0) goto L_0x02af
            r23 = 129(0x81, double:6.37E-322)
            ea1.C58534i.m67953b(r23)
            java.lang.String r5 = r14.f354059d
            java.lang.String r7 = r14.f354060e
            te3.fg2 r5 = da1.C116605b.m164446b(r4, r5, r7, r7)
            if (r5 != 0) goto L_0x02af
            r14 = 133(0x85, double:6.57E-322)
            ea1.C58534i.m67953b(r14)
            r15 = r8
            goto L_0x030e
        L_0x02af:
            r14 = 132(0x84, double:6.5E-322)
            ea1.C58534i.m67953b(r14)
            java.util.LinkedList<te3.wg> r7 = r1.f354558r
            java.util.Iterator r7 = r7.iterator()
        L_0x02ba:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x02da
            java.lang.Object r14 = r7.next()
            te3.wg r14 = (te3.C101862wg) r14
            r23 = r7
            r15 = r8
            long r7 = r14.f299740d
            int r24 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r24 != 0) goto L_0x02d6
            java.util.LinkedList<te3.fg2> r7 = r14.f299741e
            r7.add(r5)
            r7 = 1
            goto L_0x02dc
        L_0x02d6:
            r8 = r15
            r7 = r23
            goto L_0x02ba
        L_0x02da:
            r15 = r8
            r7 = 0
        L_0x02dc:
            if (r7 != 0) goto L_0x030e
            te3.wg r7 = new te3.wg
            r7.<init>()
            r7.f299740d = r2
            java.util.LinkedList<te3.fg2> r8 = r7.f299741e
            r8.add(r5)
            java.util.LinkedList<te3.wg> r8 = r1.f354558r
            r8.add(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            r14 = 0
            r7[r14] = r8
            java.lang.String r8 = r5.f298258e
            r14 = 1
            r7[r14] = r8
            java.lang.String r5 = r5.f298257d
            r8 = 2
            r7[r8] = r5
            java.lang.String r5 = "HABBYGE-MALI.HellSessionParamUtil"
            java.lang.String r14 = "catchParamsWhenViewOp, add pathId=%s, dataPath=%s, value=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r14, r7)
            goto L_0x030f
        L_0x030b:
            r22 = r7
            r15 = r8
        L_0x030e:
            r8 = 2
        L_0x030f:
            r8 = r15
            r7 = r22
            r5 = 2
            goto L_0x0263
        L_0x0315:
            r8 = r15
            r4 = r18
            r5 = r19
            r7 = r20
            goto L_0x01f9
        L_0x031e:
            r20 = r7
            r15 = r8
            r8 = r15
            r7 = r20
            r2 = -1
            goto L_0x00e0
        L_0x0327:
            if (r6 == 0) goto L_0x0334
            if (r0 >= 0) goto L_0x032c
            goto L_0x0334
        L_0x032c:
            java.util.LinkedList<te3.xr4> r2 = r6.f353976n
            r2.addLast(r1)
            ca1.C113264b.m155063i(r6, r0)
        L_0x0334:
            if (r6 == 0) goto L_0x0339
            java.lang.String r0 = r6.f353969d
            goto L_0x033a
        L_0x0339:
            r0 = 0
        L_0x033a:
            if (r0 != 0) goto L_0x033d
            goto L_0x0351
        L_0x033d:
            java.lang.String r2 = "mmkv_key_hellSPMatchSuche_"
            te3.v14 r2 = ba1.C113156i.m154833a(r2)
            r3 = 0
            ba1.C113156i.m154836d(r1, r0, r2, r3)
            java.lang.String r2 = "mmkv_key_hellSPMatchinghe_"
            te3.v14 r2 = ba1.C113156i.m154833a(r2)
            r3 = 1
            ba1.C113156i.m154836d(r1, r0, r2, r3)
        L_0x0351:
            z91.b r0 = z91.C23462b.m28021f()
            java.lang.String r2 = r0.mo36920d()
            java.lang.String r0 = "curSessionid"
            gy3.C87412m.m108593f(r2, r0)
            java.lang.String r0 = "mmkv_fuzzy_pgs_io"
            byte[] r0 = f91.C116850b.m164831a(r0)
            if (r0 == 0) goto L_0x038d
            int r3 = r0.length
            if (r3 != 0) goto L_0x036b
            r3 = 1
            goto L_0x036c
        L_0x036b:
            r3 = 0
        L_0x036c:
            if (r3 == 0) goto L_0x036f
            goto L_0x038d
        L_0x036f:
            te3.dr1 r3 = new te3.dr1
            r3.<init>()
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x0379 }
            r7 = 0
            goto L_0x038f
        L_0x0379:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r4 = r3.getMessage()
            r7 = 0
            r0[r7] = r4
            java.lang.String r4 = "HABBYGE-MALI.FuzzyMatchDao"
            java.lang.String r5 = "FuzzyMatchDao, getFuzzyMatchInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r5, r0)
            goto L_0x038e
        L_0x038d:
            r7 = 0
        L_0x038e:
            r3 = 0
        L_0x038f:
            if (r3 != 0) goto L_0x0396
            te3.dr1 r3 = new te3.dr1
            r3.<init>()
        L_0x0396:
            java.util.LinkedList<te3.q14> r0 = r3.f331954d
            int r0 = r0.size()
            r4 = -1
            int r0 = r0 + r4
        L_0x039e:
            if (r4 >= r0) goto L_0x03c1
            java.util.LinkedList<te3.q14> r5 = r3.f331954d
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r6 = "fuzzyMatchInfo.sessionFuzzyPaths[i]"
            gy3.C87412m.m108593f(r5, r6)
            te3.q14 r5 = (te3.C110970q14) r5
            java.lang.String r6 = r5.f332254d
            boolean r6 = gy3.C87412m.m108589b(r2, r6)
            if (r6 == 0) goto L_0x03be
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r5 = android.util.Pair.create(r5, r0)
            goto L_0x03c2
        L_0x03be:
            int r0 = r0 + -1
            goto L_0x039e
        L_0x03c1:
            r5 = 0
        L_0x03c2:
            if (r5 != 0) goto L_0x03c6
            goto L_0x0448
        L_0x03c6:
            java.lang.Object r0 = r5.first
            te3.q14 r0 = (te3.C110970q14) r0
            java.lang.Object r2 = r5.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.LinkedList<te3.fr1> r3 = r0.f332255e
            java.util.Iterator r3 = r3.iterator()
        L_0x03d4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x043a
            java.lang.Object r4 = r3.next()
            te3.fr1 r4 = (te3.C110962fr1) r4
            if (r4 != 0) goto L_0x03e3
            goto L_0x03d4
        L_0x03e3:
            java.util.LinkedList<te3.er1> r5 = r4.f331975g
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x03ec
            goto L_0x03d4
        L_0x03ec:
            te3.s14 r5 = r4.f331974f
            java.lang.String r5 = r5.f354328d
            java.lang.String r5 = e91.C116711b.m164583h(r5)
            java.util.LinkedList<te3.er1> r6 = r4.f331975g
            java.lang.Object r6 = r6.getLast()
            te3.er1 r6 = (te3.C118429er1) r6
            java.lang.String r8 = r6.f353985d
            java.lang.String r8 = e91.C116711b.m164583h(r8)
            boolean r5 = gy3.C87412m.m108589b(r8, r5)
            if (r5 == 0) goto L_0x040e
            java.util.LinkedList<te3.xr4> r4 = r6.f353989h
            r4.add(r1)
            goto L_0x03d4
        L_0x040e:
            java.util.LinkedList<te3.s14> r4 = r4.f331973e
            java.util.Iterator r4 = r4.iterator()
        L_0x0414:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0431
            java.lang.Object r5 = r4.next()
            te3.s14 r5 = (te3.C118464s14) r5
            if (r5 != 0) goto L_0x0423
            goto L_0x0414
        L_0x0423:
            java.lang.String r5 = r5.f354328d
            java.lang.String r5 = e91.C116711b.m164583h(r5)
            boolean r5 = gy3.C87412m.m108589b(r8, r5)
            if (r5 == 0) goto L_0x0414
            r4 = 1
            goto L_0x0432
        L_0x0431:
            r4 = 0
        L_0x0432:
            if (r4 == 0) goto L_0x03d4
            java.util.LinkedList<te3.xr4> r4 = r6.f353989h
            r4.add(r1)
            goto L_0x03d4
        L_0x043a:
            java.lang.String r3 = "index"
            gy3.C87412m.m108593f(r2, r3)
            int r2 = r2.intValue()
            x91.b$a r3 = x91.C23066b.f66278a
            r3.mo36468f(r0, r2)
        L_0x0448:
            java.lang.String r0 = r1.f354547d
            boolean r0 = gy3.C87412m.m108589b(r0, r9)
            if (r0 == 0) goto L_0x045d
            r5 = 115(0x73, double:5.7E-322)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 932(0x3a4, double:4.605E-321)
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            goto L_0x046a
        L_0x045d:
            r13 = 116(0x74, double:5.73E-322)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 932(0x3a4, double:4.605E-321)
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
        L_0x046a:
            long r2 = r1.f354556p
            r4 = 10
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x047f
            r5 = 117(0x75, double:5.8E-322)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 932(0x3a4, double:4.605E-321)
            r7 = 1
            r9 = 0
            r2.idkeyStat(r3, r5, r7, r9)
            goto L_0x048c
        L_0x047f:
            r13 = 118(0x76, double:5.83E-322)
            com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r11 = 932(0x3a4, double:4.605E-321)
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
        L_0x048c:
            com.tencent.mm.autogen.mmdata.rpt.view_id_identifyStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.view_id_identifyStruct
            r0.<init>()
            java.lang.String r2 = r1.f354550g
            java.lang.String r3 = "PageId"
            r4 = 1
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f48696e = r2
            java.lang.String r2 = r1.f354549f
            java.lang.String r3 = "LayoutId"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f48697f = r2
            java.lang.String r2 = r1.f354547d
            java.lang.String r3 = "ViewId"
            java.lang.String r2 = r0.mo86045b(r3, r2, r4)
            r0.f48695d = r2
            int r2 = r1.f354552i
            r0.f48698g = r2
            long r2 = r1.f354556p
            r0.f48699h = r2
            java.lang.String r1 = r1.f354548e
            java.lang.String r2 = "resName"
            java.lang.String r1 = r0.mo86045b(r2, r1, r4)
            r0.f48700i = r1
            r0.mo86054n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n91.C117614e.m165883a(te3.xr4):void");
    }
}
