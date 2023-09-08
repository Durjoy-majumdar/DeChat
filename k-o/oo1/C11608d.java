package oo1;

import android.content.DialogInterface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C58417y0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import p239sv.C13784j;
import p239sv.C77792p;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C64307d73;
import ye1.C15972e0;
import z04.C112551y;
import zp3.C23555k;

/* renamed from: oo1.d */
public final class C11608d {

    /* renamed from: a */
    public final AppCompatActivity f34020a;

    /* renamed from: b */
    public final C49712hj1 f34021b;

    /* renamed from: c */
    public final C13601g f34022c;

    /* renamed from: d */
    public C89779i0 f34023d;

    /* renamed from: e */
    public final C13601g f34024e = C36568h.m40985a(new C11609a(this));

    /* renamed from: f */
    public final C13601g f34025f = C36568h.m40985a(new C11610b(this));

    /* renamed from: g */
    public boolean f34026g;

    /* renamed from: oo1.d$a */
    public static final class C11609a extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C11608d f34027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11609a(C11608d dVar) {
            super(0);
            this.f34027d = dVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34027d.f34022c).getValue()).f42947y;
        }
    }

    /* renamed from: oo1.d$b */
    public static final class C11610b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C11608d f34028d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11610b(C11608d dVar) {
            super(0);
            this.f34028d = dVar;
        }

        public Object invoke() {
            return ((C15972e0) ((C36570n) this.f34028d.f34022c).getValue()).f42948z;
        }
    }

    /* renamed from: oo1.d$c */
    public static final class C11611c extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C11608d f34029a;

        /* renamed from: b */
        public final /* synthetic */ String f34030b;

        /* renamed from: c */
        public final /* synthetic */ C8479f0<String> f34031c;

        public C11611c(C11608d dVar, String str, C8479f0<String> f0Var) {
            this.f34029a = dVar;
            this.f34030b = str;
            this.f34031c = f0Var;
        }

        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                C11608d.m11393a(this.f34029a, 0, this.f34030b, (String) this.f34031c.f27484d);
            }
        }
    }

    /* renamed from: oo1.d$d */
    public static final class C11612d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C11608d f34032d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<String> f34033e;

        /* renamed from: f */
        public final /* synthetic */ String f34034f;

        public C11612d(C11608d dVar, C8479f0<String> f0Var, String str) {
            this.f34032d = dVar;
            this.f34033e = f0Var;
            this.f34034f = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/profile/widget/HeaderEnterpriseAddWidget$handleEnterprise$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C11608d dVar = this.f34032d;
            if (!dVar.f34026g) {
                dVar.f34026g = true;
                C89137b0 d = C86709a0.m107524d();
                C64307d73 d732 = new C64307d73();
                d732.f182645e = this.f34034f;
                d732.f182644d = 1;
                C13598b0 b0Var = C13598b0.f38549a;
                C13784j X20 = ((C77792p) C86312j.m106911c(C77792p.class)).X20((String) this.f34033e.f27484d, true, d732);
                C87412m.m108592e(X20, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
                d.mo123460f((C117747y) X20);
                C11608d dVar2 = this.f34032d;
                dVar2.f34023d = C89779i0.m112248e(dVar2.mo11522b().getContext(), this.f34032d.mo11522b().getContext().getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
                C11608d.m11393a(this.f34032d, 1, this.f34034f, (String) this.f34033e.f27484d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderEnterpriseAddWidget$handleEnterprise$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: oo1.d$e */
    public static final class C11613e extends C87413o implements C32224a<C15972e0> {

        /* renamed from: d */
        public final /* synthetic */ View f34035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11613e(View view) {
            super(0);
            this.f34035d = view;
        }

        public Object invoke() {
            return C15972e0.m14887a(this.f34035d);
        }
    }

    public C11608d(View view, AppCompatActivity appCompatActivity, C49712hj1 hj12) {
        C87412m.m108594g(view, "header");
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        this.f34020a = appCompatActivity;
        this.f34021b = hj12;
        this.f34022c = C36568h.m40985a(new C11613e(view));
    }

    /* renamed from: a */
    public static final void m11393a(C11608d dVar, int i, String str, String str2) {
        dVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finderusername", str);
        jSONObject.put("kfcontactid", str2);
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "kvJson.toString()");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Cx0(i, "finder_add_wecom_fri", C112551y.m153814n(jSONObject2, ",", ";", false), dVar.f34021b);
    }

    /* renamed from: b */
    public final FrameLayout mo11522b() {
        return (FrameLayout) ((C36570n) this.f34024e).getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11523c(java.lang.String r9, fe1.C58969q r10) {
        /*
            r8 = this;
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r9, r0)
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r1 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.f16192h1
            sg.i<java.lang.String, com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b> r1 = com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.f16192h1
            java.lang.Object r2 = r1.get(r9)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r2 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r2
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0021
            te3.ep1 r2 = r2.f16271j
            if (r2 == 0) goto L_0x0021
            java.lang.String r2 = r2.f133048e
            if (r2 != 0) goto L_0x0022
        L_0x0021:
            r2 = r3
        L_0x0022:
            r0.f27484d = r2
            java.lang.Object r1 = r1.get(r9)
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileHeaderUIC$b r1 = (com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC.C3463b) r1
            if (r1 == 0) goto L_0x0032
            te3.ep1 r1 = r1.f16271j
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = r1.f133049f
        L_0x0032:
            T r1 = r0.f27484d
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0040
            r1 = 1
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            r5 = 0
            if (r1 == 0) goto L_0x007d
            if (r10 == 0) goto L_0x0076
            te3.rg0 r10 = r10.field_bindInfoList
            if (r10 == 0) goto L_0x0076
            java.util.LinkedList<te3.qg0> r10 = r10.f140887d
            if (r10 == 0) goto L_0x0076
            java.util.Iterator r10 = r10.iterator()
        L_0x0052:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r10.next()
            r6 = r1
            te3.qg0 r6 = (te3.C50955qg0) r6
            int r6 = r6.f140290d
            r7 = 2
            if (r6 != r7) goto L_0x0066
            r6 = 1
            goto L_0x0067
        L_0x0066:
            r6 = 0
        L_0x0067:
            if (r6 == 0) goto L_0x0052
            goto L_0x006b
        L_0x006a:
            r1 = r5
        L_0x006b:
            te3.qg0 r1 = (te3.C50955qg0) r1
            if (r1 == 0) goto L_0x0076
            te3.ep1 r10 = r1.f140292f
            if (r10 == 0) goto L_0x0076
            java.lang.String r10 = r10.f133048e
            goto L_0x0077
        L_0x0076:
            r10 = r5
        L_0x0077:
            if (r10 != 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = r10
        L_0x007b:
            r0.f27484d = r3
        L_0x007d:
            T r10 = r0.f27484d
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x0089
            r10 = 1
            goto L_0x008a
        L_0x0089:
            r10 = 0
        L_0x008a:
            er1.w3 r1 = er1.C58784w3.f168295a
            int r1 = er1.C58784w3.m68441q(r1, r5, r2, r5)
            r3 = 6
            if (r1 != r3) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            java.lang.Class<ht1.v4> r1 = ht1.C8808v4.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.v4 r1 = (ht1.C8808v4) r1
            boolean r1 = r1.mo9635e()
            android.widget.FrameLayout r3 = r8.mo11522b()
            java.lang.String r5 = "enterpriseBtn"
            gy3.C87412m.m108593f(r3, r5)
            oo1.d$c r5 = new oo1.d$c
            r5.<init>(r8, r9, r0)
            zp3.C23564m.m28138h(r3, r5)
            if (r10 == 0) goto L_0x00ea
            if (r2 != 0) goto L_0x00ea
            if (r1 != 0) goto L_0x00ea
            rx3.g r10 = r8.f34025f
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.text.TextPaint r10 = r10.getPaint()
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r10, r1)
            android.widget.FrameLayout r10 = r8.mo11522b()
            int r10 = r10.getVisibility()
            if (r10 == 0) goto L_0x00dd
            android.widget.FrameLayout r10 = r8.mo11522b()
            r10.setVisibility(r4)
        L_0x00dd:
            android.widget.FrameLayout r10 = r8.mo11522b()
            oo1.d$d r1 = new oo1.d$d
            r1.<init>(r8, r0, r9)
            r10.setOnClickListener(r1)
            goto L_0x00f3
        L_0x00ea:
            android.widget.FrameLayout r9 = r8.mo11522b()
            r10 = 8
            r9.setVisibility(r10)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oo1.C11608d.mo11523c(java.lang.String, fe1.q):void");
    }
}
