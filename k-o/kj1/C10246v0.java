package kj1;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C0073g0;
import ak1.C54108o;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C8777j5;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66217g;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: kj1.v0 */
public final class C10246v0 extends C10538e {

    /* renamed from: h */
    public final int f31266h;

    /* renamed from: i */
    public final String f31267i = "anchorlive.more.shareqrcode";

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.moreaction.LivingShareQrCodeOption$onItemClicked$1", mo125469f = "LivingShareQrCodeOption.kt", mo125470l = {57}, mo125471m = "invokeSuspend")
    /* renamed from: kj1.v0$a */
    public static final class C10247a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f31268d;

        /* renamed from: e */
        public int f31269e;

        /* renamed from: f */
        public /* synthetic */ Object f31270f;

        /* renamed from: g */
        public final /* synthetic */ MMActivity f31271g;

        /* renamed from: h */
        public final /* synthetic */ C10125e1 f31272h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10247a(MMActivity mMActivity, C10125e1 e1Var, C15601d<? super C10247a> dVar) {
            super(2, dVar);
            this.f31271g = mMActivity;
            this.f31272h = e1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C10247a aVar = new C10247a(this.f31271g, this.f31272h, dVar);
            aVar.f31270f = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10247a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00cc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f31269e
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x001e
                if (r1 != r3) goto L_0x0016
                java.lang.Object r0 = r12.f31268d
                er1.i5 r0 = (er1.C7813i5) r0
                java.lang.Object r1 = r12.f31270f
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x005d
            L_0x0016:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001e:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.f31270f
                a14.n0 r13 = (a14.C0000n0) r13
                er1.i5$a r4 = er1.C7813i5.f26336f
                com.tencent.mm.ui.MMActivity r5 = r12.f31271g
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r1 = r1.getResources()
                r6 = 2131830090(0x7f11254a, float:1.9293168E38)
                java.lang.String r6 = r1.getString(r6)
                r7 = 500(0x1f4, double:2.47E-321)
                r9 = 0
                r10 = 8
                r11 = 0
                er1.i5 r1 = er1.C7813i5.C7814a.m7953a(r4, r5, r6, r7, r9, r10, r11)
                r1.begin()
                kj1.e1 r4 = r12.f31272h
                kj1.e1$b r4 = r4.f30988g
                if (r4 == 0) goto L_0x0061
                a14.u0<? extends te3.e11> r4 = r4.f31021n
                if (r4 == 0) goto L_0x0061
                r12.f31270f = r13
                r12.f31268d = r1
                r12.f31269e = r3
                java.lang.Object r13 = r4.mo74634A(r12)
                if (r13 != r0) goto L_0x005c
                return r0
            L_0x005c:
                r0 = r1
            L_0x005d:
                te3.e11 r13 = (te3.C49214e11) r13
                r1 = r0
                goto L_0x0062
            L_0x0061:
                r13 = r2
            L_0x0062:
                r1.mo8913b()
                if (r13 == 0) goto L_0x00cc
                kj1.e1 r0 = r12.f31272h
                com.tencent.mm.ui.MMActivity r5 = r12.f31271g
                android.content.Intent r6 = new android.content.Intent
                r6.<init>()
                zc1.b r1 = zc1.C66785b.f191882e
                java.lang.String r1 = r1.mo90662O5()
                java.lang.String r4 = "KEY_FINDER_LIVE_NOTICE_QR_CONTACT"
                r6.putExtra(r4, r1)
                java.lang.String r0 = r0.f30980a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "qrCodeUrl: "
                r1.append(r4)
                te3.o81 r4 = r13.f132618d
                if (r4 == 0) goto L_0x008e
                java.lang.String r4 = r4.f139022i
                goto L_0x008f
            L_0x008e:
                r4 = r2
            L_0x008f:
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                te3.o81 r0 = r13.f132618d
                if (r0 == 0) goto L_0x00a1
                byte[] r2 = r0.toByteArray()
            L_0x00a1:
                java.lang.String r0 = "KEY_FINDER_LIVE_LIVING_QR_INFO"
                r6.putExtra(r0, r2)
                java.lang.String r0 = "KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR"
                r1 = 0
                r6.putExtra(r0, r1)
                int r13 = r13.f132619e
                if (r13 != r3) goto L_0x00b1
                goto L_0x00b2
            L_0x00b1:
                r3 = 0
            L_0x00b2:
                java.lang.String r13 = "KEY_FINDER_LIVE_NOTICE_QR_IS_MOD_PIC_DISABLE"
                r6.putExtra(r13, r3)
                java.lang.Class<tf0.o1> r13 = tf0.C13883o1.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                java.lang.String r0 = "getService(IActivityRouter::class.java)"
                gy3.C87412m.m108593f(r13, r0)
                r4 = r13
                tf0.o1 r4 = (tf0.C13883o1) r4
                r7 = 0
                r8 = 4
                r9 = 0
                tf0.C13883o1.C13884a.m13250b(r4, r5, r6, r7, r8, r9)
                goto L_0x00e3
            L_0x00cc:
                com.tencent.mm.ui.MMActivity r13 = r12.f31271g
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r1 = 2131827835(0x7f111c7b, float:1.9288594E38)
                java.lang.String r0 = r0.getString(r1)
                r1 = 2131755990(0x7f1003d6, float:1.9142875E38)
                nj3.C76912y0.m92769h(r13, r0, r1)
            L_0x00e3:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: kj1.C10246v0.C10247a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10246v0(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31266h = e1Var.f30958E;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31267i;
    }

    /* renamed from: k */
    public boolean mo10519k() {
        return C61926c.m72696u(((C54991o) this.f31809a.mo10534b(C54991o.class)).f154388y0, 16384);
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        int i = this.f31266h;
        String string = e1Var.f30985d.getResources().getString(C0966R.string.n2h);
        C87412m.m108593f(string, "context.resources.getStr…tring.finder_live_qrcode)");
        mo10808n(e0Var, i, string, C0966R.raw.icons_filled_qr_code, e1Var.f30985d.getResources().getColor(C0966R.color.f2939n));
        String jSONObject = new JSONObject().put("type", 1).toString();
        C87412m.m108593f(jSONObject, "JSONObject().put(\"type\",…XPOSED.action).toString()");
        C7335d c = C86312j.m106911c(C54108o.class);
        C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
        C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_QRCODE, jSONObject, (String) null, 4, (Object) null);
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31266h;
    }

    /* renamed from: t */
    public void mo10525t(C10125e1 e1Var) {
        MMActivity mMActivity;
        C10125e1.C10126a aVar;
        C87412m.m108594g(e1Var, "<this>");
        C10125e1 e1Var2 = this.f31809a;
        if (e1Var2 != null && (mMActivity = e1Var2.f30985d) != null) {
            String jSONObject = new JSONObject().put("type", 2).toString();
            C87412m.m108593f(jSONObject, "JSONObject().put(\"type\",…LICKED.action).toString()");
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.LIVE_QRCODE, jSONObject, (String) null, 4, (Object) null);
            C10125e1.C10127b bVar = e1Var.f30988g;
            if (bVar != null && (aVar = bVar.f31008a) != null) {
                aVar.mo10542b(C66217g.f190253d, C53934p0.DEFAULT, new C10247a(mMActivity, e1Var, (C15601d<? super C10247a>) null));
            }
        }
    }
}
