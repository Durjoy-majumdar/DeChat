package hq1;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import dj1.C45388s;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60216z4;
import nj3.C76912y0;
import o40.C61926c;
import org.json.JSONObject;
import qj1.C62660c;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C52092ya1;

/* renamed from: hq1.d */
public final class C60085d extends C62660c {

    /* renamed from: p */
    public final C58124b f171448p;

    /* renamed from: q */
    public final String f171449q = "Finder.FinderLiveAdPlugin";

    /* renamed from: r */
    public C60090e f171450r;

    /* renamed from: s */
    public TextView f171451s;

    /* renamed from: t */
    public TextView f171452t;

    /* renamed from: u */
    public WeImageView f171453u;

    /* renamed from: v */
    public final int f171454v;

    /* renamed from: w */
    public CountDownTimer f171455w;

    /* renamed from: hq1.d$b */
    public static final class C8709b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f27938a;

        public C8709b(C32224a<C13598b0> aVar) {
            this.f27938a = aVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            this.f27938a.invoke();
        }
    }

    /* renamed from: hq1.d$a */
    public static final class C60086a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60085d f171456d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60086a(C60085d dVar) {
            super(0);
            this.f171456d = dVar;
        }

        public Object invoke() {
            Class cls = C54991o.class;
            if (this.f171456d.mo84949a1() > 0) {
                ((C54991o) this.f171456d.mo87684A0().mo71262a(cls)).f154236O3 = false;
                C60085d dVar = this.f171456d;
                TextView textView = dVar.f171451s;
                if (textView != null) {
                    textView.setText(dVar.f166287d.getContext().getResources().getString(C0966R.string.f360524mm2, new Object[]{String.valueOf(this.f171456d.mo84949a1())}));
                }
            } else if (!((C54991o) this.f171456d.mo87684A0().mo71262a(cls)).f154236O3) {
                ((C54991o) this.f171456d.mo87684A0().mo71262a(cls)).f154236O3 = true;
                C60085d dVar2 = this.f171456d;
                TextView textView2 = dVar2.f171451s;
                if (textView2 != null) {
                    textView2.setText(dVar2.f166287d.getContext().getResources().getString(C0966R.string.f360525mm3));
                }
                WeImageView weImageView = this.f171456d.f171453u;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                }
                C76912y0.m92768g(this.f171456d.f166287d.getContext(), this.f171456d.f166287d.getContext().getResources().getString(C0966R.string.f360525mm3));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hq1.d$c */
    public static final class C60087c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ C60085d f171457a;

        public C60087c(C60085d dVar) {
            this.f171457a = dVar;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            CountDownTimer countDownTimer = this.f171457a.f171455w;
            if (countDownTimer != null) {
                countDownTimer.start();
            }
        }
    }

    /* renamed from: hq1.d$d */
    public static final class C60088d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60085d f171458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60088d(C60085d dVar) {
            super(0);
            this.f171458d = dVar;
        }

        public Object invoke() {
            Class cls = C54991o.class;
            ((C54991o) this.f171458d.mo87684A0().mo71262a(cls)).f154245Q3 = 4;
            ((C54991o) this.f171458d.mo87684A0().mo71262a(cls)).f154350p0 = false;
            C58124b.C7172a.m7372a(this.f171458d.f171448p, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hq1.d$e */
    public static final class C60089e extends CountDownTimer {

        /* renamed from: a */
        public final /* synthetic */ C60085d f171459a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60089e(C60085d dVar, long j) {
            super(j, 1000);
            this.f171459a = dVar;
        }

        public void onFinish() {
            this.f171459a.mo84951c1();
        }

        public void onTick(long j) {
            Class cls = C54991o.class;
            ((C54991o) this.f171459a.mo87684A0().mo71262a(cls)).f154233N3++;
            if (this.f171459a.mo84949a1() > 0 && !((C54991o) this.f171459a.mo87684A0().mo71262a(cls)).f154240P3) {
                C60090e eVar = this.f171459a.f171450r;
                if (eVar != null) {
                    eVar.mo84955a();
                    try {
                        String str = eVar.f171461b.f184372i;
                        if (str == null) {
                            str = "";
                        }
                        JSONObject jSONObject = new JSONObject(str);
                        JSONObject optJSONObject = jSONObject.optJSONObject("weapp_extra_data");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        jSONObject.put("report_type", 1);
                        jSONObject.put("report_link", eVar.f171461b.f184370g);
                        jSONObject.put("viewable", true);
                        jSONObject.put("exposure_type", 1);
                        optJSONObject.put("exp_time", eVar.f171465f);
                        optJSONObject.put("clk_time", 0);
                        jSONObject.put("weapp_extra_data", optJSONObject.toString());
                        long j2 = eVar.f171467h;
                        long j3 = eVar.f171466g;
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108593f(jSONObject2, "json.toString()");
                        new C45388s(j2, j3, 1, jSONObject2).mo9225i().mo11397F(eVar.f171460a);
                    } catch (Throwable th) {
                        Log.printErrStackTrace(eVar.f171462c, th, "reportFirstPlay", new Object[0]);
                    }
                }
                ((C54991o) this.f171459a.mo87684A0().mo71262a(cls)).f154240P3 = true;
            }
            this.f171459a.mo84951c1();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60085d(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f171448p = bVar;
        C32444a aVar = C32444a.f86121a;
        this.f171454v = C32444a.f86193s.mo60266n().intValue();
    }

    /* renamed from: Z0 */
    public final void mo84948Z0() {
        String str;
        Class cls = C54991o.class;
        if (mo84950b1()) {
            C52092ya1 ya12 = new C52092ya1();
            ya12.f145209d = ((C54991o) mo87684A0().mo71262a(cls)).f154233N3;
            C60090e eVar = this.f171450r;
            if (eVar != null) {
                str = eVar.f171470k.toString();
                C87412m.m108593f(str, "feedbackJsonArray.toString()");
            } else {
                str = "";
            }
            ya12.f145210e = str;
            ya12.f145211f = ((C54991o) mo87696x0(cls)).f154245Q3;
            String str2 = this.f171449q;
            Log.m105924i(str2, "doCallback " + ya12.f145209d + ", " + ya12.f145210e + ", closeType: " + ya12.f145211f);
            C60216z4.C8821a<Object> aVar = C60091f.f171471a;
            if (aVar != null) {
                aVar.mo6382a(ya12);
            }
            C60091f.f171471a = null;
            C54991o oVar = (C54991o) mo87696x0(cls);
            oVar.f154229M3 = null;
            oVar.f154233N3 = 0;
            oVar.f154240P3 = false;
            oVar.f154236O3 = false;
            oVar.f154245Q3 = 0;
        }
    }

    /* renamed from: a1 */
    public final int mo84949a1() {
        return Math.max(this.f171454v - ((C54991o) mo87684A0().mo71262a(C54991o.class)).f154233N3, 0);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final boolean mo84950b1() {
        if (((C54991o) mo87684A0().mo71262a(C54991o.class)).f154229M3 == null) {
            Context context = this.f166287d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            return ((AppCompatActivity) context).getIntent().hasExtra("KEY_MINI_APP_AD_FLOW_INFO");
        }
    }

    /* renamed from: c1 */
    public final void mo84951c1() {
        C61926c.m72668M(new C60086a(this));
    }

    /* renamed from: d1 */
    public final void mo84952d1(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "callback");
        CountDownTimer countDownTimer = this.f171455w;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C77426q qVar = new C77426q(this.f166287d.getContext());
        qVar.mo107595g(this.f166287d.getContext().getResources().getString(C0966R.string.mmg));
        qVar.mo107602n(this.f166287d.getContext().getResources().getString(C0966R.string.mmf));
        qVar.mo107600l(new C8709b(aVar));
        qVar.mo107598j(this.f166287d.getContext().getResources().getString(C0966R.string.mme));
        qVar.mo107597i(new C60087c(this));
        qVar.mo107603o();
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        ((C54991o) mo87696x0(C54991o.class)).f154245Q3 = 3;
        return false;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0110  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3210u0(d60.C58124b.C58125b r19, android.os.Bundle r20) {
        /*
            r18 = this;
            r1 = r18
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.String r0 = "status"
            r4 = r19
            gy3.C87412m.m108594g(r4, r0)
            int r0 = r19.ordinal()
            r4 = 7
            if (r0 == r4) goto L_0x0046
            r2 = 21
            if (r0 == r2) goto L_0x003d
            r2 = 27
            if (r0 == r2) goto L_0x0023
            r2 = 28
            if (r0 == r2) goto L_0x0023
            goto L_0x0201
        L_0x0023:
            android.os.CountDownTimer r0 = r1.f171455w
            if (r0 == 0) goto L_0x002a
            r0.cancel()
        L_0x002a:
            fj1.b r0 = r18.mo87684A0()
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r2 = r1.f171454v
            r0.f154233N3 = r2
            r18.mo84948Z0()
            goto L_0x0201
        L_0x003d:
            android.os.CountDownTimer r0 = r1.f171455w
            if (r0 == 0) goto L_0x0201
            r0.cancel()
            goto L_0x0201
        L_0x0046:
            android.view.ViewGroup r0 = r1.f166287d
            android.content.Context r0 = r0.getContext()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            gy3.C87412m.m108592e(r0, r4)
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KEY_MINI_APP_AD_FLOW_INFO"
            boolean r0 = r0.hasExtra(r5)
            if (r0 == 0) goto L_0x01fe
            te3.mp1 r0 = new te3.mp1
            r0.<init>()
            android.view.ViewGroup r6 = r1.f166287d
            android.content.Context r6 = r6.getContext()
            gy3.C87412m.m108592e(r6, r4)
            androidx.appcompat.app.AppCompatActivity r6 = (androidx.appcompat.app.AppCompatActivity) r6
            android.content.Intent r6 = r6.getIntent()
            byte[] r6 = r6.getByteArrayExtra(r5)
            r7 = 1
            java.lang.String r8 = ""
            r9 = 0
            r10 = 0
            if (r6 != 0) goto L_0x007f
            goto L_0x008e
        L_0x007f:
            r0.parseFrom(r6)     // Catch:{ Exception -> 0x0083 }
            goto L_0x008f
        L_0x0083:
            r0 = move-exception
            r6 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r10] = r6
            java.lang.String r6 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r8, r0)
        L_0x008e:
            r0 = r9
        L_0x008f:
            android.view.ViewGroup r6 = r1.f166287d
            android.content.Context r6 = r6.getContext()
            gy3.C87412m.m108592e(r6, r4)
            androidx.appcompat.app.AppCompatActivity r6 = (androidx.appcompat.app.AppCompatActivity) r6
            android.content.Intent r4 = r6.getIntent()
            r4.removeExtra(r5)
            fj1.b r4 = r18.mo87684A0()
            androidx.lifecycle.i0 r4 = r4.mo71262a(r3)
            cl1.o r4 = (cl1.C54991o) r4
            r4.f154229M3 = r0
            android.view.ViewGroup r0 = r1.f166287d
            r4 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f171451s = r0
            android.view.ViewGroup r0 = r1.f166287d
            r4 = 2131296618(0x7f09016a, float:1.8211158E38)
            android.view.View r0 = r0.findViewById(r4)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r0
            r1.f171453u = r0
            android.view.ViewGroup r0 = r1.f166287d
            r4 = 2131296650(0x7f09018a, float:1.8211223E38)
            android.view.View r0 = r0.findViewById(r4)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.f171452t = r0
            wc1.b r0 = wc1.C15064b.f41199a
            android.view.ViewGroup r4 = r1.f166287d
            android.content.Context r12 = r4.getContext()
            java.lang.String r4 = "root.context"
            gy3.C87412m.m108593f(r12, r4)
            android.widget.TextView r13 = r1.f171451s
            r14 = 1096810496(0x41600000, float:14.0)
            r15 = 0
            r16 = 8
            r17 = 0
            r11 = r0
            wc1.C15064b.m14230a(r11, r12, r13, r14, r15, r16, r17)
            android.view.ViewGroup r5 = r1.f166287d
            android.content.Context r12 = r5.getContext()
            gy3.C87412m.m108593f(r12, r4)
            android.widget.TextView r13 = r1.f171452t
            wc1.C15064b.m14230a(r11, r12, r13, r14, r15, r16, r17)
            r1.mo10792g(r10)
            r18.mo84951c1()
            fj1.b r0 = r18.mo87684A0()
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            te3.mp1 r5 = r0.f154229M3
            if (r5 == 0) goto L_0x01df
            hq1.e r0 = new hq1.e
            android.view.ViewGroup r6 = r1.f166287d
            android.content.Context r6 = r6.getContext()
            java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r6, r9)
            com.tencent.mm.ui.MMActivity r6 = (com.tencent.p014mm.p136ui.MMActivity) r6
            r0.<init>(r6, r5)
            r1.f171450r = r0
            fj1.b r6 = r18.mo87684A0()
            androidx.lifecycle.i0 r6 = r6.mo71262a(r2)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r11 = r6.f182392d
            r0.f171466g = r11
            hq1.e r0 = r1.f171450r
            if (r0 != 0) goto L_0x0139
            goto L_0x0147
        L_0x0139:
            fj1.b r6 = r18.mo87684A0()
            androidx.lifecycle.i0 r2 = r6.mo71262a(r2)
            cl1.u r2 = (cl1.C55001u) r2
            long r11 = r2.f154416j
            r0.f171467h = r11
        L_0x0147:
            hq1.e r2 = r1.f171450r
            if (r2 == 0) goto L_0x01c3
            java.lang.String r0 = "weapp_extra_data"
            long r11 = eb0.C31543z5.m39453c()
            r2.f171465f = r11
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x01b9 }
            te3.mp1 r9 = r2.f171461b     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r9.f184372i     // Catch:{ all -> 0x01b9 }
            if (r9 != 0) goto L_0x015d
            goto L_0x015e
        L_0x015d:
            r8 = r9
        L_0x015e:
            r6.<init>(r8)     // Catch:{ all -> 0x01b9 }
            org.json.JSONObject r8 = r6.optJSONObject(r0)     // Catch:{ all -> 0x01b9 }
            if (r8 != 0) goto L_0x016c
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x01b9 }
            r8.<init>()     // Catch:{ all -> 0x01b9 }
        L_0x016c:
            java.lang.String r9 = "report_type"
            r6.put(r9, r7)     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "report_link"
            te3.mp1 r9 = r2.f171461b     // Catch:{ all -> 0x01b9 }
            java.lang.String r9 = r9.f184370g     // Catch:{ all -> 0x01b9 }
            r6.put(r7, r9)     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "viewable"
            r6.put(r7, r10)     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "exposure_type"
            r6.put(r7, r10)     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "exp_time"
            long r11 = r2.f171465f     // Catch:{ all -> 0x01b9 }
            r8.put(r7, r11)     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "clk_time"
            r8.put(r7, r10)     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x01b9 }
            r6.put(r0, r7)     // Catch:{ all -> 0x01b9 }
            dj1.s r0 = new dj1.s     // Catch:{ all -> 0x01b9 }
            long r12 = r2.f171467h     // Catch:{ all -> 0x01b9 }
            long r14 = r2.f171466g     // Catch:{ all -> 0x01b9 }
            r16 = 1
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01b9 }
            java.lang.String r7 = "json.toString()"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ all -> 0x01b9 }
            r11 = r0
            r17 = r6
            r11.<init>(r12, r14, r16, r17)     // Catch:{ all -> 0x01b9 }
            nr3.e r0 = r0.mo9225i()     // Catch:{ all -> 0x01b9 }
            com.tencent.mm.ui.MMActivity r6 = r2.f171460a     // Catch:{ all -> 0x01b9 }
            r0.mo11397F(r6)     // Catch:{ all -> 0x01b9 }
            goto L_0x01c3
        L_0x01b9:
            r0 = move-exception
            java.lang.String r2 = r2.f171462c
            java.lang.Object[] r6 = new java.lang.Object[r10]
            java.lang.String r7 = "reportExpose"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r7, r6)
        L_0x01c3:
            hq1.a r0 = new hq1.a
            android.view.ViewGroup r2 = r1.f166287d
            android.content.Context r2 = r2.getContext()
            gy3.C87412m.m108593f(r2, r4)
            android.view.ViewGroup r4 = r1.f166287d
            hq1.e r6 = r1.f171450r
            gy3.C87412m.m108591d(r6)
            r0.<init>(r2, r4, r5, r6)
            hq1.d$d r2 = new hq1.d$d
            r2.<init>(r1)
            r0.f171433l = r2
        L_0x01df:
            int r0 = r1.f171454v
            fj1.b r2 = r18.mo87684A0()
            androidx.lifecycle.i0 r2 = r2.mo71262a(r3)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154233N3
            int r0 = r0 - r2
            long r2 = (long) r0
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r4
            hq1.d$e r0 = new hq1.d$e
            r0.<init>(r1, r2)
            r1.f171455w = r0
            r0.start()
            goto L_0x0201
        L_0x01fe:
            r18.mo84950b1()
        L_0x0201:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hq1.C60085d.mo3210u0(d60.b$b, android.os.Bundle):void");
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo84948Z0();
    }
}
