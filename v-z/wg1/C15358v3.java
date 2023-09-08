package wg1;

import ak1.C0077k0;
import android.content.Context;
import bl3.C39818r;
import c30.C104289g;
import com.tencent.p014mm.plugin.finder.view.notice.BigGreenNoticeStatusView;
import di3.C7335d;
import di3.C86312j;
import er1.C7802g1;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8817y2;
import ht1.C8819z2;
import p172io.flutter.embedding.android.PatchedFlutterActivity;
import p204mr.C61568m;
import p687sr.C64153e;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C49098d51;
import te3.C49712hj1;
import te3.C50523nc3;
import te3.C51559uk1;
import tf0.C13887q1;

/* renamed from: wg1.v3 */
public final class C15358v3 extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C15278g3 f41710d;

    /* renamed from: wg1.v3$a */
    public static final class C15359a extends C87413o implements C32224a<C49098d51> {

        /* renamed from: d */
        public final /* synthetic */ C49098d51 f41711d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15359a(C49098d51 d512) {
            super(0);
            this.f41711d = d512;
        }

        public Object invoke() {
            return this.f41711d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15358v3(C15278g3 g3Var) {
        super(2);
        this.f41710d = g3Var;
    }

    /* renamed from: a */
    public static final void m14339a(C15278g3 g3Var, C49098d51 d512, int i) {
        Class cls = C13887q1.class;
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        C13887q1 q1Var = (C13887q1) c;
        String str = g3Var.f41550E;
        if (str != null) {
            String str2 = d512.f132122h;
            C87412m.m108591d(str2);
            C86709a0.m107524d().mo123460f(C13887q1.C13888a.m13305a(q1Var, str, str2, i, (C49712hj1) null, g3Var.getContext().getIntent().getStringExtra("key_promotion_token"), 0, (Long) null, 64, (Object) null));
            C13887q1 q1Var2 = (C13887q1) C86312j.m106911c(cls);
            String str3 = g3Var.f41550E;
            if (str3 != null) {
                String str4 = d512.f132122h;
                String str5 = "";
                if (str4 == null) {
                    str4 = str5;
                }
                if (q1Var2.mo13343h4(str3, str4) == null) {
                    C13887q1 q1Var3 = (C13887q1) C86312j.m106911c(cls);
                    String str6 = g3Var.f41550E;
                    if (str6 != null) {
                        String str7 = d512.f132122h;
                        if (str7 != null) {
                            str5 = str7;
                        }
                        q1Var3.mo13325QY(str6, str5, d512);
                    } else {
                        C87412m.m108603p("username");
                        throw null;
                    }
                } else {
                    C13887q1 q1Var4 = (C13887q1) C86312j.m106911c(cls);
                    String str8 = g3Var.f41550E;
                    if (str8 != null) {
                        String str9 = d512.f132122h;
                        if (str9 != null) {
                            str5 = str9;
                        }
                        C49098d51 h4 = q1Var4.mo13343h4(str8, str5);
                        if (h4 != null) {
                            h4.f132119e = d512.f132119e;
                        }
                    } else {
                        C87412m.m108603p("username");
                        throw null;
                    }
                }
                C8819z2 v2 = ((C8817y2) C39818r.f106831a.mo62443b(g3Var.getContext()).mo62447c(C8817y2.class)).mo9643v2();
                String str10 = g3Var.f41550E;
                if (str10 != null) {
                    v2.mo9648f0(str10);
                    C49098d51 d513 = g3Var.f41548C;
                    if (d513 != null) {
                        BigGreenNoticeStatusView bigGreenNoticeStatusView = (BigGreenNoticeStatusView) ((C36570n) g3Var.f41567w).getValue();
                        String str11 = g3Var.f41550E;
                        if (str11 != null) {
                            bigGreenNoticeStatusView.mo5009f(str11, new C15359a(d513));
                        } else {
                            C87412m.m108603p("username");
                            throw null;
                        }
                    }
                } else {
                    C87412m.m108603p("username");
                    throw null;
                }
            } else {
                C87412m.m108603p("username");
                throw null;
            }
        } else {
            C87412m.m108603p("username");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if ((r4.length() > 0) == true) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r4 = r4.f132128q;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m14340b(wg1.C15278g3 r24) {
        /*
            r0 = r24
            te3.d51 r1 = r0.f41548C
            r2 = 1
            if (r1 != 0) goto L_0x0008
            goto L_0x000a
        L_0x0008:
            r1.f132119e = r2
        L_0x000a:
            c30.g r1 = new c30.g
            r1.<init>()
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.String r5 = "source_type"
            r1.mo145967r(r5, r4)
            te3.d51 r4 = r0.f41548C
            if (r4 == 0) goto L_0x0028
            te3.nc3 r4 = r4.f132128q
            if (r4 == 0) goto L_0x0028
            boolean r4 = r4.f138532d
            if (r4 != r2) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "pay_type"
            r1.mo145967r(r5, r4)
            te3.d51 r4 = r0.f41548C
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = r4.f132126o
            if (r4 == 0) goto L_0x0046
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 != r2) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r2 = 0
        L_0x0047:
            if (r2 == 0) goto L_0x004c
            java.lang.String r2 = "get_ticket"
            goto L_0x004e
        L_0x004c:
            java.lang.String r2 = ""
        L_0x004e:
            java.lang.String r3 = "page_type"
            r1.mo145967r(r3, r2)
            java.lang.Class<mr.m> r2 = p204mr.C61568m.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r3 = "getService(IHellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r4 = r2
            mr.m r4 = (p204mr.C61568m) r4
            ak1.k0 r5 = ak1.C0077k0.Cancle
            java.lang.String r6 = r0.f41550E
            r2 = 0
            if (r6 == 0) goto L_0x00ac
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r16 = r1.toString()
            te3.d51 r1 = r0.f41548C
            if (r1 == 0) goto L_0x007d
            java.lang.String r1 = r1.f132122h
            r17 = r1
            goto L_0x007f
        L_0x007d:
            r17 = r2
        L_0x007f:
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 29664(0x73e0, float:4.1568E-41)
            r23 = 0
            java.lang.String r10 = "200"
            p204mr.C61568m.C61569a.m72263a(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23)
            te3.d51 r1 = r0.f41548C
            if (r1 == 0) goto L_0x0096
            r2 = 2
            m14339a(r0, r1, r2)
        L_0x0096:
            android.app.Activity r1 = r24.getContext()
            android.app.Activity r0 = r24.getContext()
            r2 = 2131826250(0x7f11164a, float:1.928538E38)
            java.lang.String r0 = r0.getString(r2)
            r2 = 2131756010(0x7f1003ea, float:1.9142915E38)
            nj3.C76912y0.m92769h(r1, r0, r2)
            return
        L_0x00ac:
            java.lang.String r0 = "username"
            gy3.C87412m.m108603p(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C15358v3.m14340b(wg1.g3):void");
    }

    public Object invoke(Object obj, Object obj2) {
        C51559uk1 a;
        String str;
        C50523nc3 nc32;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        String str2 = null;
        if (intValue != -1) {
            C49098d51 d512 = this.f41710d.f41548C;
            boolean z = false;
            if (d512 != null) {
                d512.f132119e = 0;
            }
            if (intValue == 1) {
                ((C64153e) C86312j.m106911c(C64153e.class)).jc0(this.f41710d.getContext(), 2, false, new C15354t3(this.f41710d));
                C104289g gVar = new C104289g();
                gVar.mo145967r("source_type", Integer.valueOf(intValue2 == 1 ? 1 : 0));
                C49098d51 d513 = this.f41710d.f41548C;
                gVar.mo145967r("pay_type", Integer.valueOf((d513 == null || (nc32 = d513.f132128q) == null || !nc32.f138532d) ? 0 : 1));
                C49098d51 d514 = this.f41710d.f41548C;
                if (!(d514 == null || (str = d514.f132126o) == null)) {
                    if (str.length() > 0) {
                        z = true;
                    }
                }
                gVar.mo145967r(PatchedFlutterActivity.EXTRA_PAGE_TYPE, z ? "get_ticket" : "");
                C104289g gVar2 = new C104289g();
                C49098d51 d515 = this.f41710d.f41548C;
                gVar2.put("coupon_id", (d515 == null || (a = C7802g1.m7949a(d515)) == null) ? null : a.f142894e);
                gVar2.mo145953n("ui_position", 1);
                C7335d c = C86312j.m106911c(C61568m.class);
                C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
                C61568m mVar = (C61568m) c;
                C0077k0 k0Var = C0077k0.Book;
                String str3 = this.f41710d.f41550E;
                if (str3 != null) {
                    String gVar3 = gVar.toString();
                    C49098d51 d516 = this.f41710d.f41548C;
                    if (d516 != null) {
                        str2 = d516.f132122h;
                    }
                    C61568m.C61569a.m72263a(mVar, k0Var, str3, 0, 0, "200", (String) null, (Long) null, (String) null, (String) null, (String) null, gVar3, str2, gVar2.toString(), 0, 0, 25568, (Object) null);
                    C15278g3 g3Var = this.f41710d;
                    C49098d51 d517 = g3Var.f41548C;
                    if (d517 != null) {
                        m14339a(g3Var, d517, 1);
                    }
                } else {
                    C87412m.m108603p("username");
                    throw null;
                }
            }
        } else if (intValue2 != 0) {
            m14340b(this.f41710d);
        } else {
            C15278g3 g3Var2 = this.f41710d;
            C49098d51 d518 = g3Var2.f41548C;
            if (d518 != null) {
                if (g3Var2.f41550E != null) {
                    C15356u3 u3Var = new C15356u3(g3Var2);
                    C77407n nVar = new C77407n((Context) g3Var2.getActivity(), 1, true);
                    nVar.f225779n1 = true;
                    nVar.f225771i = new C15259b4(g3Var2);
                    nVar.f225782p = new C15262c4(d518, u3Var);
                    nVar.mo107573q();
                } else {
                    C87412m.m108603p("username");
                    throw null;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
