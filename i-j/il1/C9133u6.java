package il1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import cj1.C54795n5;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import it1.C60625c;
import j20.C117292a;
import java.util.ArrayList;
import m53.C10757d;
import nj3.C76912y0;
import ob0.C89132b;
import pe3.C89349b;
import qg1.C47832n;
import qj1.C62660c;
import qo3.C12925w;
import qo3.w$$c;
import rx3.C13598b0;
import te3.C48933c01;
import te3.C64247az0;
import te3.C64863yr1;

/* renamed from: il1.u6 */
public final class C9133u6 extends w$$c {

    /* renamed from: b */
    public View f28765b;

    /* renamed from: c */
    public View f28766c;

    /* renamed from: d */
    public TextView f28767d;

    /* renamed from: e */
    public View f28768e;

    /* renamed from: f */
    public ViewGroup f28769f;

    /* renamed from: g */
    public ProgressBar f28770g;

    /* renamed from: h */
    public long f28771h;

    /* renamed from: i */
    public C9134a f28772i;

    /* renamed from: j */
    public boolean f28773j;

    /* renamed from: k */
    public int f28774k;

    /* renamed from: l */
    public C54795n5 f28775l;

    /* renamed from: m */
    public C62660c f28776m;

    /* renamed from: n */
    public long f28777n;

    /* renamed from: il1.u6$a */
    public interface C9134a {
        /* renamed from: a */
        void mo9754a();
    }

    /* renamed from: il1.u6$b */
    public static final class C9135b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9133u6 f28778d;

        public C9135b(C9133u6 u6Var) {
            this.f28778d = u6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f28778d.mo12476d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.u6$c */
    public static final class C9136c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9133u6 f28779d;

        /* renamed from: e */
        public final /* synthetic */ Context f28780e;

        /* renamed from: il1.u6$c$a */
        public static final class C9137a<_Ret, _Var> implements C87581a {

            /* renamed from: a */
            public final /* synthetic */ Context f28781a;

            /* renamed from: b */
            public final /* synthetic */ C9133u6 f28782b;

            public C9137a(Context context, C9133u6 u6Var) {
                this.f28781a = context;
                this.f28782b = u6Var;
            }

            public Object call(Object obj) {
                C64863yr1 yr12;
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                int i = 0;
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C64247az0 az02 = ((C48933c01) cVar.f256796d).f131419d;
                    StringBuilder sb = new StringBuilder();
                    sb.append("click gameTeamInfo status:");
                    Integer num = null;
                    sb.append(az02 != null ? Integer.valueOf(az02.f182177d) : null);
                    sb.append(", in_teaming_up:");
                    sb.append(az02 != null ? Integer.valueOf(az02.f182182i) : null);
                    sb.append(' ');
                    if (!(az02 == null || (yr12 = az02.f182184n) == null)) {
                        num = Integer.valueOf(yr12.f186587h);
                    }
                    sb.append(num);
                    Log.m105924i("MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage", sb.toString());
                    if (az02 != null) {
                        C64863yr1 yr13 = az02.f182184n;
                        if (yr13 != null) {
                            i = yr13.f186587h;
                        }
                        if (i > 0) {
                            Context context = this.f28781a;
                            C76912y0.m92767f(context, context.getString(C0966R.string.dbd));
                        } else {
                            C9133u6.m8821e(this.f28782b);
                        }
                    } else {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
                    }
                } else {
                    Context context2 = this.f28781a;
                    C76912y0.makeText(context2, (CharSequence) context2.getString(C0966R.string.dnr), 0).show();
                }
                return C13598b0.f38549a;
            }
        }

        public C9136c(C9133u6 u6Var, Context context) {
            this.f28779d = u6Var;
            this.f28780e = context;
        }

        public final void onClick(View view) {
            Class cls = C55001u.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9133u6 u6Var = this.f28779d;
            if (u6Var.f28773j) {
                C62660c cVar = u6Var.f28776m;
                if (cVar != null) {
                    Context context = this.f28780e;
                    C47832n nVar = new C47832n(((C55001u) cVar.mo87696x0(cls)).f154416j, ((C55001u) cVar.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) cVar.mo87696x0(cls)).f154417n), ((C55001u) cVar.mo87696x0(cls)).f154423t, 0, 16, (C8480h) null);
                    C60625c.m70894l(nVar, context, (String) null, 0, 6, (Object) null);
                    nVar.mo9225i().mo123420E(new C9137a(context, u6Var));
                }
            } else {
                C9133u6.m8821e(u6Var);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.u6$d */
    public static final class C9138d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9133u6 f28783d;

        public C9138d(C9133u6 u6Var) {
            this.f28783d = u6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9133u6.m8822f(this.f28783d, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamPaymentBottomPage$getView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r7 = r7.f182184n;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m8821e(il1.C9133u6 r24) {
        /*
            r0 = r24
            long r1 = r0.f28777n
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x000c
            goto L_0x00e6
        L_0x000c:
            long r1 = java.lang.System.currentTimeMillis()
            r0.f28777n = r1
            cj1.n5 r5 = r0.f28775l
            if (r5 == 0) goto L_0x00e6
            android.view.View r1 = r0.f28765b
            if (r1 == 0) goto L_0x0020
            android.content.Context r1 = r1.getContext()
            if (r1 != 0) goto L_0x0024
        L_0x0020:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
        L_0x0024:
            r6 = r1
            qj1.c r1 = r0.f28776m
            if (r1 == 0) goto L_0x00e6
            java.lang.Class<cl1.u> r2 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
            cl1.u r1 = (cl1.C55001u) r1
            qj1.c r2 = r0.f28776m
            if (r2 == 0) goto L_0x00e6
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r7)
            cl1.o r2 = (cl1.C54991o) r2
            te3.d61 r15 = new te3.d61
            r15.<init>()
            te3.az0 r7 = r2.f154379w1
            r8 = 0
            if (r7 == 0) goto L_0x004e
            te3.yr1 r7 = r7.f182184n
            if (r7 == 0) goto L_0x004e
            java.lang.String r7 = r7.f186584e
            goto L_0x004f
        L_0x004e:
            r7 = r8
        L_0x004f:
            r15.f132141d = r7
            int r7 = r0.f28774k
            r15.f132142e = r7
            te3.uy0 r7 = r2.f154363s1
            if (r7 == 0) goto L_0x005b
            java.lang.String r8 = r7.f143182f
        L_0x005b:
            r15.f132143f = r8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "doPayment "
            r7.append(r8)
            long r8 = r2.f154258T1
            r7.append(r8)
            r8 = 32
            r7.append(r8)
            int r9 = r0.f28774k
            r7.append(r9)
            r7.append(r8)
            java.lang.String r9 = r15.f132141d
            r7.append(r9)
            r7.append(r8)
            java.lang.String r8 = r15.f132143f
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.FinderLiveVisitorGameTeamPaymentBottomPage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            android.widget.ProgressBar r7 = r0.f28770g
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x009c
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x009c
            r8 = 1
        L_0x009c:
            if (r8 != 0) goto L_0x00b2
            long r7 = r2.f154258T1
            int r2 = r0.f28774k
            long r10 = (long) r2
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b2
            r0.f28777n = r3
            il1.a7 r1 = new il1.a7
            r1.<init>(r0)
            o40.C61926c.m72668M(r1)
            goto L_0x00e6
        L_0x00b2:
            ok1.e r2 = ok1.C62042e.f176370a
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r6, r3)
            r2.mo87047U1(r6, r9)
            te3.c21 r2 = r1.f154420q
            long r7 = r2.f182392d
            long r9 = r1.f154416j
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 2
            byte[] r1 = r15.toByteArray()
            pe3.b r17 = pe3.C89349b.m111674a(r1)
            sx3.f0 r18 = sx3.C64186f0.f181907d
            r19 = 0
            r20 = 0
            il1.v6 r1 = new il1.v6
            r21 = r1
            r1.<init>(r6, r15, r0)
            r22 = 6144(0x1800, float:8.61E-42)
            r23 = 0
            java.lang.String r15 = ""
            cj1.C54795n5.C54796a.m61725c(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9133u6.m8821e(il1.u6):void");
    }

    /* renamed from: f */
    public static final void m8822f(C9133u6 u6Var, boolean z) {
        View view = u6Var.f28765b;
        Context context = view != null ? view.getContext() : null;
        if (context instanceof FragmentActivity) {
            C12925w wVar = u6Var.f36949a;
            if (wVar != null) {
                wVar.f36933o = true;
                wVar.mo5085n();
            }
            C54795n5 n5Var = u6Var.f28775l;
            if (n5Var != null) {
                C10757d C = n5Var.mo75699C((FragmentActivity) context, z ? 12 : 11, new C9168x6(u6Var));
                if (C != null) {
                    C.mo11002a(new C9183y6(u6Var));
                }
            }
        }
    }

    /* renamed from: a */
    public View mo4781a(Context context) {
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cwn, (ViewGroup) null, false);
        inflate.findViewById(C0966R.C0970id.deb).setOnClickListener(new C9135b(this));
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.htl);
        if (textView != null) {
            C58739j4.f168176a.mo83703c0(textView, true);
        }
        View findViewById = inflate.findViewById(C0966R.C0970id.dlf);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C9136c(this, context));
        }
        this.f28766c = inflate.findViewById(C0966R.C0970id.dmv);
        this.f28768e = inflate.findViewById(C0966R.C0970id.dmt);
        this.f28767d = (TextView) inflate.findViewById(C0966R.C0970id.dmx);
        this.f28769f = (ViewGroup) inflate.findViewById(C0966R.C0970id.dmu);
        this.f28770g = (ProgressBar) inflate.findViewById(C0966R.C0970id.dmw);
        inflate.findViewById(C0966R.C0970id.dmu).setOnClickListener(new C9138d(this));
        this.f28765b = inflate;
        return inflate;
    }

    /* renamed from: c */
    public void mo4873c() {
        this.f28777n = 0;
        View view = this.f28765b;
        TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.htl) : null;
        if (textView != null) {
            textView.setText(String.valueOf(this.f28774k));
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f28771h = currentTimeMillis;
        C54795n5 n5Var = this.f28775l;
        if (n5Var != null) {
            n5Var.mo75729d(currentTimeMillis, new C8938b7(this));
        }
    }
}
