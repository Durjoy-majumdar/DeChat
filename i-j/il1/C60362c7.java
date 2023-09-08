package il1;

import ak1.C54116w;
import ak1.C54117x;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c30.C104289g;
import cj1.C0548h5;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandLaunchReferrer;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.pluginsdk.model.app.C44550e0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import di0.C86295k;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import er1.C58782w0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import il1.C9133u6;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import je1.C46509b1;
import je1.C46538u1;
import je1.C46546x0;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kr0.C76630x0;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C89132b;
import ok1.C62042e;
import org.json.JSONException;
import p629ny.C76979h;
import p763ym.C53543s;
import pe3.C89349b;
import qg1.C47832n;
import qj1.C12677tg;
import qj1.C62660c;
import qj1.C62741dg;
import qj1.C63084w6;
import qo3.C12925w;
import qo3.C47883u;
import qo3.C77426q;
import rx3.C13598b0;
import sk1.C63957l;
import te3.C48933c01;
import te3.C51613uy0;
import te3.C64247az0;
import te3.C64269bu0;
import te3.C64582nl0;
import te3.C64789vy0;
import te3.C64863yr1;
import te3.e05;
import te3.ua4;
import wi0.C66117m;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: il1.c7 */
public final class C60362c7 {

    /* renamed from: R */
    public static final C60363a f172094R = new C60363a((C8480h) null);

    /* renamed from: S */
    public static long f172095S = 0;

    /* renamed from: T */
    public static int f172096T = 0;

    /* renamed from: U */
    public static String f172097U = "";

    /* renamed from: V */
    public static C51613uy0 f172098V;

    /* renamed from: A */
    public boolean f172099A;

    /* renamed from: B */
    public boolean f172100B;

    /* renamed from: C */
    public int f172101C = -1;

    /* renamed from: D */
    public final int f172102D = 1;

    /* renamed from: E */
    public final int f172103E = 2;

    /* renamed from: F */
    public C64269bu0 f172104F;

    /* renamed from: G */
    public long f172105G;

    /* renamed from: H */
    public boolean f172106H;

    /* renamed from: I */
    public boolean f172107I;

    /* renamed from: J */
    public boolean f172108J;

    /* renamed from: K */
    public final int f172109K = 1;

    /* renamed from: L */
    public String f172110L;

    /* renamed from: M */
    public String f172111M;

    /* renamed from: N */
    public C86299o f172112N;

    /* renamed from: O */
    public Map<String, Boolean> f172113O = new LinkedHashMap();

    /* renamed from: P */
    public boolean f172114P;

    /* renamed from: Q */
    public long f172115Q;

    /* renamed from: a */
    public final ViewGroup f172116a;

    /* renamed from: b */
    public final C58124b f172117b;

    /* renamed from: c */
    public final C62660c f172118c;

    /* renamed from: d */
    public TextView f172119d;

    /* renamed from: e */
    public TextView f172120e;

    /* renamed from: f */
    public TextView f172121f;

    /* renamed from: g */
    public TextView f172122g;

    /* renamed from: h */
    public TextView f172123h;

    /* renamed from: i */
    public TextView f172124i;

    /* renamed from: j */
    public ImageView f172125j;

    /* renamed from: k */
    public TextView f172126k;

    /* renamed from: l */
    public TextView f172127l;

    /* renamed from: m */
    public View f172128m;

    /* renamed from: n */
    public View f172129n;

    /* renamed from: o */
    public C12925w f172130o;

    /* renamed from: p */
    public FrameLayout f172131p;

    /* renamed from: q */
    public LinearLayout f172132q;

    /* renamed from: r */
    public GradientDrawable f172133r;

    /* renamed from: s */
    public FrameLayout f172134s;

    /* renamed from: t */
    public MMRoundCornerImageView f172135t;

    /* renamed from: u */
    public TextView f172136u;

    /* renamed from: v */
    public WeImageView f172137v;

    /* renamed from: w */
    public final C8943d f172138w = new C8943d();

    /* renamed from: x */
    public long f172139x;

    /* renamed from: y */
    public boolean f172140y;

    /* renamed from: z */
    public boolean f172141z;

    /* renamed from: il1.c7$d */
    public final class C8943d {

        /* renamed from: a */
        public final C9133u6 f28251a = new C9133u6();

        /* renamed from: il1.c7$d$a */
        public static final class C8944a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60362c7 f28253d;

            /* renamed from: e */
            public final /* synthetic */ C64863yr1 f28254e;

            /* renamed from: f */
            public final /* synthetic */ Runnable f28255f;

            /* renamed from: il1.c7$d$a$a */
            public static final class C8945a implements C47883u {

                /* renamed from: a */
                public final /* synthetic */ Runnable f28256a;

                public C8945a(Runnable runnable) {
                    this.f28256a = runnable;
                }

                /* renamed from: a */
                public final void mo353a(boolean z, String str) {
                    this.f28256a.run();
                }
            }

            public C8944a(C60362c7 c7Var, C64863yr1 yr12, Runnable runnable) {
                this.f28253d = c7Var;
                this.f28254e = yr12;
                this.f28255f = runnable;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForNeedPayStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f28253d.mo85341p();
                if (this.f28254e.f186588i > 0) {
                    C77426q qVar = new C77426q(view.getContext());
                    qVar.mo107595g(view.getContext().getResources().getString(C0966R.string.dbf));
                    qVar.mo107602n(view.getContext().getResources().getString(C0966R.string.f7935ws));
                    qVar.mo107598j(view.getContext().getResources().getString(C0966R.string.f7926wf));
                    qVar.mo107600l(new C8945a(this.f28255f));
                    qVar.mo107603o();
                } else {
                    this.f28253d.getClass();
                    Object e = C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null);
                    C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) e;
                    boolean z = false;
                    if (!TextUtils.isEmpty(str) && !C112551y.m153809i("CN", str, true)) {
                        z = true;
                    }
                    if (z) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "is Wechat user");
                        C60362c7 c7Var = this.f28253d;
                        c7Var.getClass();
                        C61926c.m72668M(new C8934a8(c7Var));
                    } else {
                        this.f28255f.run();
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForNeedPayStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: il1.c7$d$b */
        public static final class C8946b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60362c7 f28257d;

            /* renamed from: e */
            public final /* synthetic */ C8943d f28258e;

            /* renamed from: f */
            public final /* synthetic */ C64863yr1 f28259f;

            /* renamed from: g */
            public final /* synthetic */ boolean f28260g;

            /* renamed from: h */
            public final /* synthetic */ Runnable f28261h;

            /* renamed from: il1.c7$d$b$a */
            public static final class C8947a implements C9133u6.C9134a {

                /* renamed from: a */
                public final /* synthetic */ C60362c7 f28262a;

                /* renamed from: b */
                public final /* synthetic */ boolean f28263b;

                /* renamed from: c */
                public final /* synthetic */ Runnable f28264c;

                public C8947a(C60362c7 c7Var, boolean z, Runnable runnable) {
                    this.f28262a = c7Var;
                    this.f28263b = z;
                    this.f28264c = runnable;
                }

                /* renamed from: a */
                public void mo9754a() {
                    Context context;
                    C12925w wVar = this.f28262a.f172130o;
                    if (wVar != null) {
                        wVar.mo5085n();
                    }
                    if (this.f28263b) {
                        TextView textView = this.f28262a.f172122g;
                        String str = null;
                        Context context2 = textView != null ? textView.getContext() : null;
                        TextView textView2 = this.f28262a.f172122g;
                        if (!(textView2 == null || (context = textView2.getContext()) == null)) {
                            str = context.getString(C0966R.string.dbt);
                        }
                        C76912y0.m92768g(context2, str);
                        return;
                    }
                    this.f28264c.run();
                }
            }

            public C8946b(C60362c7 c7Var, C8943d dVar, C64863yr1 yr12, boolean z, Runnable runnable) {
                this.f28257d = c7Var;
                this.f28258e = dVar;
                this.f28259f = yr12;
                this.f28260g = z;
                this.f28261h = runnable;
            }

            public final void run() {
                if (this.f28257d.f172118c.mo14476D0() != null) {
                    C8943d dVar = this.f28258e;
                    C64863yr1 yr12 = this.f28259f;
                    C60362c7 c7Var = this.f28257d;
                    boolean z = this.f28260g;
                    Runnable runnable = this.f28261h;
                    C9133u6 u6Var = dVar.f28251a;
                    int i = yr12.f186594r;
                    C62660c cVar = c7Var.f172118c;
                    C8947a aVar = new C8947a(c7Var, z, runnable);
                    u6Var.getClass();
                    C87412m.m108594g(cVar, "basePlugin");
                    u6Var.f28774k = i;
                    u6Var.f28775l = cVar.mo14476D0();
                    u6Var.f28776m = cVar;
                    u6Var.f28773j = z;
                    u6Var.f28772i = aVar;
                }
                C12925w wVar = this.f28257d.f172130o;
                if (wVar != null) {
                    wVar.mo12468h(this.f28258e.f28251a);
                }
            }
        }

        /* renamed from: il1.c7$d$c */
        public static final class C8948c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60362c7 f28265d;

            /* renamed from: e */
            public final /* synthetic */ Runnable f28266e;

            public C8948c(C60362c7 c7Var, Runnable runnable) {
                this.f28265d = c7Var;
                this.f28266e = runnable;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForPaidAndJoinStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f28265d.mo85341p();
                C12925w wVar = this.f28265d.f172130o;
                if (wVar != null) {
                    wVar.mo5085n();
                }
                this.f28266e.run();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$PayGameTeamLogic$setupForPaidAndJoinStatus$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C8943d() {
        }

        /* renamed from: a */
        public final CharSequence mo9748a(int i, int i2) {
            String string = C60362c7.this.f172116a.getContext().getString(i, new Object[]{Integer.valueOf(i2)});
            C87412m.m108593f(string, "root.context.getString(stringRes, value)");
            int E = C112550d0.m153769E(string, String.valueOf(i2), 0, false, 6, (Object) null);
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = C60362c7.this.f172116a.getContext();
            String substring = string.substring(0, E);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String substring2 = string.substring(E, string.length());
            C87412m.m108593f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            Context context2 = C60362c7.this.f172116a.getContext();
            TextView textView = C60362c7.this.f172119d;
            Drawable e = C74933u4.m89768e(context2, C0966R.raw.coin_icon, textView != null ? textView.getCurrentTextColor() : -1);
            C60362c7 c7Var = C60362c7.this;
            e.setBounds(0, 0, C76577a.m92155f(c7Var.f172116a.getContext(), C0966R.dimen.f3736cp), C76577a.m92155f(c7Var.f172116a.getContext(), C0966R.dimen.f3736cp));
            C13598b0 b0Var = C13598b0.f38549a;
            SpannableStringBuilder iE = hVar.mo107069iE(context, substring, substring2, e, true, false);
            C87412m.m108593f(iE, "getService(ISpannableSer…true, false\n            )");
            return iE;
        }

        /* renamed from: b */
        public final void mo9749b(C64863yr1 yr12, Runnable runnable, boolean z) {
            TextView textView = C60362c7.this.f172122g;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = C60362c7.this.f172123h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            C60362c7 c7Var = C60362c7.this;
            TextView textView3 = c7Var.f172122g;
            if (textView3 != null) {
                textView3.setText(c7Var.f172116a.getContext().getString(C0966R.string.dby));
            }
            TextView textView4 = C60362c7.this.f172119d;
            if (textView4 != null) {
                textView4.setText(mo9748a(z ? C0966R.string.dbz : C0966R.string.f360514dc0, yr12.f186594r));
            }
            C60362c7 c7Var2 = C60362c7.this;
            C8946b bVar = new C8946b(c7Var2, this, yr12, z, runnable);
            TextView textView5 = c7Var2.f172122g;
            if (textView5 != null) {
                textView5.setOnClickListener(new C8944a(c7Var2, yr12, bVar));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            r4 = r3.getContext();
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo9750c(boolean r3, te3.C64863yr1 r4) {
            /*
                r2 = this;
                il1.c7 r0 = il1.C60362c7.this
                android.widget.TextView r0 = r0.f172122g
                if (r0 != 0) goto L_0x0007
                goto L_0x000c
            L_0x0007:
                r1 = 8
                r0.setVisibility(r1)
            L_0x000c:
                il1.c7 r0 = il1.C60362c7.this
                android.widget.TextView r0 = r0.f172123h
                if (r0 != 0) goto L_0x0013
                goto L_0x0017
            L_0x0013:
                r1 = 0
                r0.setVisibility(r1)
            L_0x0017:
                if (r3 != 0) goto L_0x0048
                il1.c7 r3 = il1.C60362c7.this
                android.widget.TextView r3 = r3.f172119d
                if (r3 != 0) goto L_0x0020
                goto L_0x002c
            L_0x0020:
                r0 = 2131826774(0x7f111856, float:1.9286442E38)
                int r4 = r4.f186594r
                java.lang.CharSequence r4 = r2.mo9748a(r0, r4)
                r3.setText(r4)
            L_0x002c:
                il1.c7 r3 = il1.C60362c7.this
                android.widget.TextView r3 = r3.f172123h
                if (r3 != 0) goto L_0x0033
                goto L_0x005b
            L_0x0033:
                if (r3 == 0) goto L_0x0043
                android.content.Context r4 = r3.getContext()
                if (r4 == 0) goto L_0x0043
                r0 = 2131826749(0x7f11183d, float:1.9286391E38)
                java.lang.String r4 = r4.getString(r0)
                goto L_0x0044
            L_0x0043:
                r4 = 0
            L_0x0044:
                r3.setText(r4)
                goto L_0x005b
            L_0x0048:
                il1.c7 r3 = il1.C60362c7.this
                android.widget.TextView r3 = r3.f172119d
                if (r3 != 0) goto L_0x004f
                goto L_0x005b
            L_0x004f:
                r0 = 2131826775(0x7f111857, float:1.9286444E38)
                int r4 = r4.f186594r
                java.lang.CharSequence r4 = r2.mo9748a(r0, r4)
                r3.setText(r4)
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60362c7.C8943d.mo9750c(boolean, te3.yr1):void");
        }

        /* renamed from: d */
        public final void mo9751d(C64863yr1 yr12, Runnable runnable) {
            TextView textView = C60362c7.this.f172122g;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = C60362c7.this.f172123h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            C60362c7 c7Var = C60362c7.this;
            TextView textView3 = c7Var.f172122g;
            if (textView3 != null) {
                textView3.setText(c7Var.f172116a.getContext().getString(C0966R.string.dbu));
            }
            TextView textView4 = C60362c7.this.f172119d;
            if (textView4 != null) {
                textView4.setText(mo9748a(C0966R.string.f360514dc0, yr12.f186594r));
            }
            C60362c7 c7Var2 = C60362c7.this;
            TextView textView5 = c7Var2.f172122g;
            if (textView5 != null) {
                textView5.setOnClickListener(new C8948c(c7Var2, runnable));
            }
        }
    }

    /* renamed from: il1.c7$e */
    public static final class C8949e<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32227p<Boolean, String, C13598b0> f28267a;

        /* renamed from: b */
        public final /* synthetic */ C60362c7 f28268b;

        /* renamed from: c */
        public final /* synthetic */ String f28269c;

        public C8949e(C32227p<? super Boolean, ? super String, C13598b0> pVar, C60362c7 c7Var, String str) {
            this.f28267a = pVar;
            this.f28268b = c7Var;
            this.f28269c = str;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "team up, check minor result: errCode: " + cVar.f256794b + ", errType: " + cVar.f256793a + ", errMsg: " + cVar.f256795c);
            if (cVar.f256794b != -1) {
                String str = cVar.f256795c;
                if (str == null) {
                    str = "";
                }
                if (!(str.length() > 0)) {
                    Map<String, Boolean> map = this.f28268b.f172113O;
                    String str2 = this.f28269c;
                    Boolean bool = Boolean.TRUE;
                    map.put(str2, bool);
                    this.f28267a.invoke(bool, null);
                    return C13598b0.f38549a;
                }
            }
            this.f28267a.invoke(Boolean.FALSE, cVar.f256795c);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.c7$h */
    public static final class C8950h<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public static final C8950h<_Ret, _Var> f28270a = new C8950h<>();

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            if (i == 0 && cVar.f256794b == 0) {
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiFinderLiveRespondGameInvitation success");
            } else {
                Log.m105921e("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiFinderLiveRespondGameInvitation fail errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.c7$n */
    public static final class C8951n implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C60362c7 f28271d;

        public C8951n(C60362c7 c7Var) {
            this.f28271d = c7Var;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2 = view;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view2);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (C87412m.m108589b(view2, this.f28271d.f172131p)) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(0.3f));
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else if (action == 1) {
                    view.performClick();
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(Float.valueOf(1.0f));
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else if (action == 3) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(Float.valueOf(1.0f));
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: il1.c7$a */
    public static final class C60363a {

        /* renamed from: il1.c7$a$a */
        public static final class C60364a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C64247az0 f172142d;

            /* renamed from: e */
            public final /* synthetic */ C62660c f172143e;

            /* renamed from: f */
            public final /* synthetic */ Context f172144f;

            /* renamed from: g */
            public final /* synthetic */ C60372c f172145g;

            public C60364a(C64247az0 az02, C62660c cVar, Context context, C60372c cVar2) {
                this.f172142d = az02;
                this.f172143e = cVar;
                this.f172144f = context;
                this.f172145g = cVar2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Class cls = C55001u.class;
                dialogInterface.dismiss();
                C64247az0 az02 = this.f172142d;
                e05 e05 = az02.f182195y;
                if (e05 != null) {
                    C62660c cVar = this.f172143e;
                    Context context = this.f172144f;
                    C60372c cVar2 = this.f172145g;
                    C7335d c = C86312j.m106911c(C54116w.class);
                    C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                    C54116w.gy0((C54116w) c, 13, 0, (String) null, C54117x.m60831b(az02), 6, (Object) null);
                    new C46546x0(((C55001u) cVar.mo87696x0(cls)).f154416j, ((C55001u) cVar.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) cVar.mo87696x0(cls)).f154417n), ((C55001u) cVar.mo87696x0(cls)).f154423t, 0).mo9225i();
                    C86299o oVar = new C86299o();
                    oVar.f250930b = e05.f182913d;
                    oVar.f250934f = e05.f182914e;
                    oVar.f250931c = e05.f182915f;
                    AppBrandLaunchReferrer appBrandLaunchReferrer = new AppBrandLaunchReferrer();
                    C89349b bVar = e05.f182916g;
                    appBrandLaunchReferrer.f239407r = bVar != null ? bVar.mo123705h() : "";
                    oVar.f250947s = appBrandLaunchReferrer;
                    oVar.f250939k = 1219;
                    oVar.f250940l = String.valueOf(((C55001u) cVar.mo87696x0(cls)).f154420q.f182392d);
                    ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(context, oVar);
                    if (cVar2 != null) {
                        cVar2.mo85355a(true);
                    }
                }
            }
        }

        /* renamed from: il1.c7$a$b */
        public static final class C60365b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60372c f172146d;

            public C60365b(C60372c cVar) {
                this.f172146d = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C60372c cVar = this.f172146d;
                if (cVar != null) {
                    cVar.mo85355a(false);
                }
            }
        }

        /* renamed from: il1.c7$a$c */
        public static final class C60366c implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ boolean f172147d;

            /* renamed from: e */
            public final /* synthetic */ Context f172148e;

            /* renamed from: f */
            public final /* synthetic */ String f172149f;

            /* renamed from: g */
            public final /* synthetic */ C60372c f172150g;

            public C60366c(boolean z, Context context, String str, C60372c cVar) {
                this.f172147d = z;
                this.f172148e = context;
                this.f172149f = str;
                this.f172150g = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "download game dialog ok isInstall:" + this.f172147d);
                C58782w0 w0Var = C58782w0.f168290a;
                Context context = this.f172148e;
                String str = this.f172149f;
                if (str == null) {
                    str = "";
                }
                w0Var.mo83844c(context, str);
                C60372c cVar = this.f172150g;
                if (cVar != null) {
                    cVar.mo85355a(true);
                }
            }
        }

        /* renamed from: il1.c7$a$d */
        public static final class C60367d implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60372c f172151d;

            public C60367d(C60372c cVar) {
                this.f172151d = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "download game dialog cancel");
                dialogInterface.dismiss();
                C60372c cVar = this.f172151d;
                if (cVar != null) {
                    cVar.mo85355a(false);
                }
            }
        }

        /* renamed from: il1.c7$a$e */
        public static final class C60368e implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ CheckBox f172152d;

            public C60368e(CheckBox checkBox) {
                this.f172152d = checkBox;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$Companion$jumpGame$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.gy0((C54116w) c, 28, 0, (String) null, (String) null, 14, (Object) null);
                CheckBox checkBox = this.f172152d;
                checkBox.setChecked(!checkBox.isChecked());
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$Companion$jumpGame$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: il1.c7$a$f */
        public static final class C60369f implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C64247az0 f172153d;

            /* renamed from: e */
            public final /* synthetic */ C60372c f172154e;

            /* renamed from: f */
            public final /* synthetic */ String f172155f;

            /* renamed from: g */
            public final /* synthetic */ boolean f172156g;

            /* renamed from: h */
            public final /* synthetic */ CheckBox f172157h;

            /* renamed from: i */
            public final /* synthetic */ String f172158i;

            /* renamed from: j */
            public final /* synthetic */ String f172159j;

            /* renamed from: n */
            public final /* synthetic */ C62660c f172160n;

            /* renamed from: o */
            public final /* synthetic */ boolean f172161o;

            /* renamed from: p */
            public final /* synthetic */ Context f172162p;

            /* renamed from: il1.c7$a$f$a */
            public static final class C46251a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ String f124674d;

                /* renamed from: e */
                public final /* synthetic */ C8479f0<String> f124675e;

                /* renamed from: f */
                public final /* synthetic */ C62660c f124676f;

                /* renamed from: g */
                public final /* synthetic */ boolean f124677g;

                /* renamed from: h */
                public final /* synthetic */ Context f124678h;

                /* renamed from: i */
                public final /* synthetic */ String f124679i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C46251a(String str, C8479f0<String> f0Var, C62660c cVar, boolean z, Context context, String str2) {
                    super(0);
                    this.f124674d = str;
                    this.f124675e = f0Var;
                    this.f124676f = cVar;
                    this.f124677g = z;
                    this.f124678h = context;
                    this.f124679i = str2;
                }

                public Object invoke() {
                    ((C44550e0) ((C53543s) C86312j.m106911c(C53543s.class)).mo74025px()).mo69342c(this.f124674d);
                    C61926c.m72668M(new C46256f7(this.f124675e, this.f124674d, this.f124676f, this.f124677g, this.f124678h, this.f124679i));
                    return C13598b0.f38549a;
                }
            }

            public C60369f(C64247az0 az02, C60372c cVar, String str, boolean z, CheckBox checkBox, String str2, String str3, C62660c cVar2, boolean z2, Context context) {
                this.f172153d = az02;
                this.f172154e = cVar;
                this.f172155f = str;
                this.f172156g = z;
                this.f172157h = checkBox;
                this.f172158i = str2;
                this.f172159j = str3;
                this.f172160n = cVar2;
                this.f172161o = z2;
                this.f172162p = context;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ua4 ua4;
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c;
                C64247az0 az02 = this.f172153d;
                C54116w.gy0(wVar, 13, 0, (String) null, az02 != null ? C54117x.m60831b(az02) : null, 6, (Object) null);
                C60372c cVar = this.f172154e;
                if (cVar != null) {
                    cVar.mo85355a(true);
                }
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = this.f172155f;
                if (this.f172156g) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_START_LIVE_CHECKED_BOOLEAN_SYNC, Boolean.valueOf(this.f172157h.isChecked()));
                    if (this.f172157h.isChecked()) {
                        C64247az0 az03 = this.f172153d;
                        T t = (az03 == null || (ua4 = az03.f182193w) == null) ? null : ua4.f142710e;
                        if (t == null) {
                            t = "";
                        }
                        f0Var.f27484d = t;
                    }
                }
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "jumpGame " + this.f172158i + ", " + this.f172159j + ", launchParams:" + ((String) f0Var.f27484d));
                C61926c.m72656A((String) null, new C46251a(this.f172159j, f0Var, this.f172160n, this.f172161o, this.f172162p, this.f172158i));
            }
        }

        /* renamed from: il1.c7$a$g */
        public static final class C60370g implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C60372c f172163d;

            public C60370g(C60372c cVar) {
                this.f172163d = cVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "jumpGame dialog cancel");
                dialogInterface.dismiss();
                C60372c cVar = this.f172163d;
                if (cVar != null) {
                    cVar.mo85355a(false);
                }
            }
        }

        public C60363a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo85345a(C64247az0 az02) {
            e05 e05;
            String str;
            if (!(az02 == null || (e05 = az02.f182195y) == null || (str = e05.f182913d) == null)) {
                if (str.length() > 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0218, code lost:
            if (r5 == false) goto L_0x021b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00df  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00fa  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x00fd  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x014b  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0162  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01b7  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo85346b(qj1.C62660c r27, android.content.Context r28, te3.C51613uy0 r29, te3.C64247az0 r30, java.lang.String r31, java.lang.String r32, il1.C60362c7.C60372c r33, boolean r34) {
            /*
                r26 = this;
                r8 = r27
                r11 = r28
                r0 = r29
                r1 = r30
                r2 = r32
                r12 = r33
                java.lang.String r3 = "basePlugin"
                gy3.C87412m.m108594g(r8, r3)
                java.lang.String r3 = "context"
                gy3.C87412m.m108594g(r11, r3)
                java.lang.String r3 = "gameTeamInfo"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.String r3 = "launchParams"
                r4 = r31
                gy3.C87412m.m108594g(r4, r3)
                java.lang.String r3 = "wording"
                gy3.C87412m.m108594g(r2, r3)
                r13 = r26
                boolean r3 = r13.mo85345a(r1)
                java.lang.String r14 = ""
                java.lang.String r15 = "Finder.FinderLiveVisitorGameTeamWidget"
                r10 = 2131821426(0x7f110372, float:1.9275595E38)
                if (r3 == 0) goto L_0x007d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "mini game team, jump weapp "
                r0.append(r3)
                te3.e05 r3 = r1.f182195y
                if (r3 != 0) goto L_0x0046
                r3 = r14
            L_0x0046:
                org.json.JSONObject r3 = o40.C61937h.m72709h(r3)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                r0 = 2131821618(0x7f110432, float:1.9275984E38)
                java.lang.String r3 = r11.getString(r0)
                java.lang.String r4 = r11.getString(r10)
                il1.c7$a$a r5 = new il1.c7$a$a
                r5.<init>(r1, r8, r11, r12)
                il1.c7$a$b r6 = new il1.c7$a$b
                r6.<init>(r12)
                java.lang.String r8 = ""
                r0 = r28
                r1 = r32
                r2 = r8
                nj3.C76879j.m92707A(r0, r1, r2, r3, r4, r5, r6)
            L_0x0073:
                r19 = r14
                r18 = r15
                r16 = 0
                r17 = 0
                goto L_0x02ad
            L_0x007d:
                te3.nl0 r3 = r1.f182176B
                if (r3 == 0) goto L_0x0084
                java.lang.String r3 = r3.f184484g
                goto L_0x0085
            L_0x0084:
                r3 = 0
            L_0x0085:
                if (r3 == 0) goto L_0x0090
                int r3 = r3.length()
                if (r3 != 0) goto L_0x008e
                goto L_0x0090
            L_0x008e:
                r3 = 0
                goto L_0x0091
            L_0x0090:
                r3 = 1
            L_0x0091:
                if (r3 == 0) goto L_0x0098
                if (r0 == 0) goto L_0x00a0
                java.lang.String r3 = r0.f143186j
                goto L_0x009e
            L_0x0098:
                te3.nl0 r3 = r1.f182176B
                if (r3 == 0) goto L_0x00a0
                java.lang.String r3 = r3.f184484g
            L_0x009e:
                r6 = r3
                goto L_0x00a1
            L_0x00a0:
                r6 = 0
            L_0x00a1:
                te3.nl0 r3 = r1.f182176B
                if (r3 == 0) goto L_0x00a8
                java.lang.String r3 = r3.f184482e
                goto L_0x00a9
            L_0x00a8:
                r3 = 0
            L_0x00a9:
                if (r3 == 0) goto L_0x00b4
                int r3 = r3.length()
                if (r3 != 0) goto L_0x00b2
                goto L_0x00b4
            L_0x00b2:
                r3 = 0
                goto L_0x00b5
            L_0x00b4:
                r3 = 1
            L_0x00b5:
                if (r3 == 0) goto L_0x00bc
                if (r0 == 0) goto L_0x00c3
                java.lang.String r3 = r0.f143183g
                goto L_0x00c4
            L_0x00bc:
                te3.nl0 r3 = r1.f182176B
                if (r3 == 0) goto L_0x00c3
                java.lang.String r3 = r3.f184482e
                goto L_0x00c4
            L_0x00c3:
                r3 = 0
            L_0x00c4:
                te3.nl0 r9 = r1.f182176B
                if (r9 == 0) goto L_0x00cb
                java.lang.String r9 = r9.f184481d
                goto L_0x00cc
            L_0x00cb:
                r9 = 0
            L_0x00cc:
                if (r9 == 0) goto L_0x00d7
                int r9 = r9.length()
                if (r9 != 0) goto L_0x00d5
                goto L_0x00d7
            L_0x00d5:
                r9 = 0
                goto L_0x00d8
            L_0x00d7:
                r9 = 1
            L_0x00d8:
                if (r9 == 0) goto L_0x00df
                if (r0 == 0) goto L_0x00e6
                java.lang.String r9 = r0.f143182f
                goto L_0x00e7
            L_0x00df:
                te3.nl0 r9 = r1.f182176B
                if (r9 == 0) goto L_0x00e6
                java.lang.String r9 = r9.f184481d
                goto L_0x00e7
            L_0x00e6:
                r9 = 0
            L_0x00e7:
                te3.nl0 r10 = r1.f182176B
                if (r10 == 0) goto L_0x00ee
                java.lang.String r10 = r10.f184483f
                goto L_0x00ef
            L_0x00ee:
                r10 = 0
            L_0x00ef:
                if (r10 == 0) goto L_0x00fa
                int r10 = r10.length()
                if (r10 != 0) goto L_0x00f8
                goto L_0x00fa
            L_0x00f8:
                r10 = 0
                goto L_0x00fb
            L_0x00fa:
                r10 = 1
            L_0x00fb:
                if (r10 == 0) goto L_0x0102
                if (r0 == 0) goto L_0x0109
                java.lang.String r0 = r0.f143184h
                goto L_0x010a
            L_0x0102:
                te3.nl0 r0 = r1.f182176B
                if (r0 == 0) goto L_0x0109
                java.lang.String r0 = r0.f184483f
                goto L_0x010a
            L_0x0109:
                r0 = 0
            L_0x010a:
                er1.w0 r10 = er1.C58782w0.f168290a
                if (r6 != 0) goto L_0x0110
                r7 = r14
                goto L_0x0111
            L_0x0110:
                r7 = r6
            L_0x0111:
                boolean r7 = r10.mo83843b(r11, r7)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r5 = "game installed: "
                r10.append(r5)
                r10.append(r7)
                java.lang.String r5 = ", packagename:"
                r10.append(r5)
                r10.append(r6)
                java.lang.String r5 = ", gameName:"
                r10.append(r5)
                r10.append(r3)
                java.lang.String r5 = ", gameAppId:"
                r10.append(r5)
                r10.append(r9)
                java.lang.String r5 = ", gameUrl:"
                r10.append(r5)
                r10.append(r0)
                java.lang.String r5 = " gameTeamInfo.appInfo "
                r10.append(r5)
                te3.nl0 r1 = r1.f182176B
                if (r1 != 0) goto L_0x014c
                r1 = r14
            L_0x014c:
                org.json.JSONObject r1 = o40.C61937h.m72709h(r1)
                r10.append(r1)
                java.lang.String r1 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
                r1 = 2131826725(0x7f111825, float:1.9286342E38)
                r10 = 2131887328(0x7f1204e0, float:1.940926E38)
                if (r7 != 0) goto L_0x01b7
                r2 = 2131829811(0x7f112433, float:1.9292602E38)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                r4[r5] = r3
                java.lang.String r2 = r11.getString(r2, r4)
                java.lang.String r1 = r11.getString(r1)
                r5 = 2131821426(0x7f110372, float:1.9275595E38)
                java.lang.String r3 = r11.getString(r5)
                il1.c7$a$c r4 = new il1.c7$a$c
                r4.<init>(r7, r11, r0, r12)
                il1.c7$a$d r0 = new il1.c7$a$d
                r0.<init>(r12)
                boolean r5 = r11 instanceof android.app.Activity
                if (r5 == 0) goto L_0x0193
                r5 = r11
                android.app.Activity r5 = (android.app.Activity) r5
                boolean r5 = r5.isFinishing()
                if (r5 == 0) goto L_0x0193
                goto L_0x0073
            L_0x0193:
                qo3.a r5 = new qo3.a
                r5.<init>()
                r5.f225644a = r14
                r5.f225660q = r2
                r5.f225663t = r1
                r5.f225620C = r4
                r5.f225664u = r3
                r5.f225621D = r0
                r0 = 0
                r5.f225642Y = r0
                qo3.g r0 = new qo3.g
                r0.<init>(r11, r10)
                r0.mo107525e(r5)
                r0.show()
                nj3.C76879j.m92730a(r11, r0)
                goto L_0x0073
            L_0x01b7:
                r5 = 2131821426(0x7f110372, float:1.9275595E38)
                java.lang.Class<cl1.o> r0 = cl1.C54991o.class
                androidx.lifecycle.i0 r0 = r8.mo87696x0(r0)
                cl1.o r0 = (cl1.C54991o) r0
                te3.az0 r3 = r0.f154379w1
                qo3.a r7 = new qo3.a
                r7.<init>()
                r7.f225644a = r14
                r7.f225660q = r2
                r0 = 2131494998(0x7f0c0856, float:1.861352E38)
                r2 = 0
                android.view.View r0 = android.view.View.inflate(r11, r0, r2)
                r2 = 2131299513(0x7f090cb9, float:1.821703E38)
                android.view.View r2 = r0.findViewById(r2)
                android.widget.CheckBox r2 = (android.widget.CheckBox) r2
                f40.o r17 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r5 = r17.mo121142i()
                com.tencent.mm.storage.y1$a r10 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_START_LIVE_CHECKED_BOOLEAN_SYNC
                r1 = 0
                boolean r5 = r5.mo119686g(r10, r1)
                r2.setChecked(r5)
                if (r3 == 0) goto L_0x01fd
                te3.ua4 r5 = r3.f182193w
                if (r5 == 0) goto L_0x01fd
                boolean r5 = r5.f142709d
                r10 = 1
                if (r5 != r10) goto L_0x01fd
                r5 = 1
                goto L_0x01fe
            L_0x01fd:
                r5 = 0
            L_0x01fe:
                if (r5 == 0) goto L_0x021b
                te3.ua4 r5 = r3.f182193w
                if (r5 == 0) goto L_0x0216
                java.lang.String r5 = r5.f142710e
                if (r5 == 0) goto L_0x0216
                int r5 = r5.length()
                if (r5 <= 0) goto L_0x0210
                r5 = 1
                goto L_0x0211
            L_0x0210:
                r5 = 0
            L_0x0211:
                r10 = 1
                if (r5 != r10) goto L_0x0217
                r5 = 1
                goto L_0x0218
            L_0x0216:
                r10 = 1
            L_0x0217:
                r5 = 0
            L_0x0218:
                if (r5 == 0) goto L_0x021b
                goto L_0x021c
            L_0x021b:
                r10 = 0
            L_0x021c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r1 = "start_live_guide "
                r5.append(r1)
                r5.append(r10)
                java.lang.String r1 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
                if (r10 == 0) goto L_0x025b
                il1.c7$a$e r1 = new il1.c7$a$e
                r1.<init>(r2)
                r0.setOnClickListener(r1)
                r7.f225627J = r0
                java.lang.Class<ak1.w> r0 = ak1.C54116w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r0, r1)
                r19 = r0
                ak1.w r19 = (ak1.C54116w) r19
                r20 = 27
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 14
                r25 = 0
                ak1.C54116w.gy0(r19, r20, r21, r22, r23, r24, r25)
            L_0x025b:
                r0 = 2131826725(0x7f111825, float:1.9286342E38)
                java.lang.String r0 = r11.getString(r0)
                r7.f225663t = r0
                il1.c7$a$f r5 = new il1.c7$a$f
                r0 = r5
                r17 = 0
                r1 = r3
                r16 = r2
                r18 = 0
                r2 = r33
                r3 = r31
                r4 = r10
                r10 = r5
                r19 = 2131821426(0x7f110372, float:1.9275595E38)
                r5 = r16
                r13 = r7
                r16 = 0
                r7 = r9
                r8 = r27
                r17 = r18
                r9 = r34
                r19 = r14
                r18 = r15
                r14 = 2131821426(0x7f110372, float:1.9275595E38)
                r15 = r10
                r10 = r28
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r13.f225620C = r15
                java.lang.String r0 = r11.getString(r14)
                r13.f225664u = r0
                il1.c7$a$g r0 = new il1.c7$a$g
                r0.<init>(r12)
                r13.f225621D = r0
                qo3.g r0 = new qo3.g
                r1 = 2131887328(0x7f1204e0, float:1.940926E38)
                r0.<init>(r11, r1)
                r0.mo107525e(r13)
                r0.show()
            L_0x02ad:
                r0 = 0
                il1.C60362c7.f172095S = r0
                il1.C60362c7.f172096T = r16
                il1.C60362c7.f172097U = r19
                il1.C60362c7.f172098V = r17
                java.lang.String r0 = "resetLastGameTeamClick, from:jumpGame"
                r1 = r18
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60362c7.C60363a.mo85346b(qj1.c, android.content.Context, te3.uy0, te3.az0, java.lang.String, java.lang.String, il1.c7$c, boolean):void");
        }
    }

    /* renamed from: il1.c7$b */
    public static final class C60371b implements C86295k {

        /* renamed from: d */
        public String f172164d;

        /* renamed from: a */
        public String mo3693a() {
            try {
                C104289g gVar = new C104289g(this.f172164d);
                gVar.mo145966q("usePushAnimation", true);
                String gVar2 = gVar.toString();
                C87412m.m108593f(gVar2, "{\n                val ob….toString()\n            }");
                return gVar2;
            } catch (JSONException e) {
                Log.printErrStackTrace("Finder.FinderLiveVisitorGameTeamWidget", e, "extraData toJsonString", new Object[0]);
                return "{}";
            }
        }

        public String toString() {
            return mo3693a();
        }
    }

    /* renamed from: il1.c7$c */
    public interface C60372c {
        /* renamed from: a */
        void mo85355a(boolean z);
    }

    /* renamed from: il1.c7$f */
    public static final class C60373f implements C60372c {

        /* renamed from: a */
        public final /* synthetic */ C60362c7 f172165a;

        public C60373f(C60362c7 c7Var) {
            this.f172165a = c7Var;
        }

        /* renamed from: a */
        public void mo85355a(boolean z) {
            C60362c7 c7Var = this.f172165a;
            c7Var.f172108J = false;
            c7Var.mo85343r();
        }
    }

    /* renamed from: il1.c7$g */
    public static final class C60374g<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C60362c7 f172166a;

        public C60374g(C60362c7 c7Var) {
            this.f172166a = c7Var;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C54991o.class;
            C60362c7 c7Var = this.f172166a;
            c7Var.f172114P = false;
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C48933c01 c012 = (C48933c01) cVar.f256796d;
                C64247az0 az02 = c012.f131419d;
                boolean z = c012.f131421f;
                ((C54991o) c7Var.f172118c.mo87696x0(cls)).mo76024u4(az02);
                ((C54991o) this.f172166a.f172118c.mo87696x0(cls)).mo75957E4(z);
                StringBuilder sb = new StringBuilder();
                sb.append("click gameTeamInfo status:");
                Integer num = null;
                sb.append(az02 != null ? Integer.valueOf(az02.f182177d) : null);
                sb.append(", in_teaming_up:");
                if (az02 != null) {
                    num = Integer.valueOf(az02.f182182i);
                }
                sb.append(num);
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
                if (az02 != null) {
                    C60362c7.m70628a(this.f172166a, az02);
                } else {
                    Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
                }
            } else {
                C76912y0.makeText(c7Var.f172116a.getContext(), (CharSequence) this.f172166a.f172116a.getContext().getString(C0966R.string.dnr), 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.c7$i */
    public static final class C60375i<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C60362c7 f172167a;

        /* renamed from: b */
        public final /* synthetic */ int f172168b;

        /* renamed from: c */
        public final /* synthetic */ C51613uy0 f172169c;

        public C60375i(C60362c7 c7Var, int i, C51613uy0 uy02) {
            this.f172167a = c7Var;
            this.f172168b = i;
            this.f172169c = uy02;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            Class cls = C54991o.class;
            C60362c7 c7Var = this.f172167a;
            c7Var.f172140y = false;
            int i = cVar.f256793a;
            if (i == 0 && cVar.f256794b == 0) {
                C64247az0 az02 = ((C48933c01) cVar.f256796d).f131419d;
                ((C54991o) c7Var.f172118c.mo87696x0(cls)).mo76024u4(az02);
                ((C54991o) this.f172167a.f172118c.mo87696x0(cls)).mo75957E4(((C48933c01) cVar.f256796d).f131421f);
                StringBuilder sb = new StringBuilder();
                sb.append("click gameTeamInfo status:");
                Integer num = null;
                sb.append(az02 != null ? Integer.valueOf(az02.f182177d) : null);
                sb.append(", in_teaming_up:");
                if (az02 != null) {
                    num = Integer.valueOf(az02.f182182i);
                }
                sb.append(num);
                Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
                if (az02 != null) {
                    int i2 = this.f172168b;
                    this.f172167a.getClass();
                    if (i2 == 0) {
                        int i3 = az02.f182177d;
                        if (i3 == 1 || i3 == 2) {
                            this.f172167a.mo85344s(this.f172169c, az02);
                        }
                    } else if (this.f172168b == this.f172167a.f172109K) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "update gameTeamInfo from show invite");
                    }
                } else {
                    Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "resp.game_team_info null");
                }
            } else {
                Log.m105921e("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiFinderLiveGetGameTeamInfo fail errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.c7$j */
    public static final class C60376j implements C60372c {

        /* renamed from: a */
        public final /* synthetic */ C60362c7 f172170a;

        public C60376j(C60362c7 c7Var) {
            this.f172170a = c7Var;
        }

        /* renamed from: a */
        public void mo85355a(boolean z) {
            C60362c7 c7Var = this.f172170a;
            c7Var.f172108J = false;
            c7Var.mo85343r();
        }
    }

    /* renamed from: il1.c7$k */
    public static final class C60377k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C64247az0 f172171d;

        /* renamed from: e */
        public final /* synthetic */ C60362c7 f172172e;

        public C60377k(C64247az0 az02, C60362c7 c7Var) {
            this.f172171d = az02;
            this.f172172e = c7Var;
        }

        public final void run() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_IS_ENTERING_COMMENT", true);
            C64247az0 az02 = this.f172171d;
            String str = null;
            if (!TextUtils.isEmpty(az02 != null ? az02.f182183j : null)) {
                C64247az0 az03 = this.f172171d;
                if (az03 != null) {
                    str = az03.f182183j;
                }
                bundle.putString("PARAM_FINDER_LIVE_AUTO_INPUT_MSG", str);
            }
            bundle.putBoolean("PARAM_FINDER_LIVE_NEED_NOTIFY_SEND_MSG_RESULT", true);
            this.f172172e.f172139x = System.currentTimeMillis();
            bundle.putLong("PARAM_FINDER_LIVE_SEND_MSG_SESSION_ID", this.f172172e.f172139x);
            this.f172172e.f172117b.statusChange(C58124b.C58125b.ENTERING_COMMENT, bundle);
        }
    }

    /* renamed from: il1.c7$l */
    public static final class C60378l implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12925w f172173d;

        /* renamed from: e */
        public final /* synthetic */ C60362c7 f172174e;

        public C60378l(C12925w wVar, C60362c7 c7Var) {
            this.f172173d = wVar;
            this.f172174e = c7Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172173d.mo5085n();
            C60362c7 c7Var = this.f172174e;
            c7Var.f172106H = false;
            if (c7Var.f172101C == c7Var.f172103E) {
                c7Var.mo85343r();
            }
            c7Var.f172101C = -1;
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.c7$m */
    public static final class C60379m implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60362c7 f172175d;

        public C60379m(C60362c7 c7Var) {
            this.f172175d = c7Var;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            C89349b bVar;
            ViewGroup viewGroup;
            View view2;
            C89349b bVar2;
            String str3;
            Class cls = C55001u.class;
            Class cls2 = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C60362c7 c7Var = this.f172175d;
            C64247az0 az02 = ((C54991o) c7Var.f172118c.mo87696x0(cls2)).f154379w1;
            String str4 = null;
            if (az02 != null) {
                if (az02.f182187q == 0) {
                    Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "teamup_gift_reddot is 0");
                } else {
                    Log.m105925i("Finder.FinderLiveVisitorGameTeamWidget", "gameTeamInfo?.reddot_id is %s", az02.f182189s);
                    if (!TextUtils.isEmpty(az02.f182189s) && (str3 = c7Var.f172111M) != null && C112551y.m153810j(str3, az02.f182189s, false, 2, (Object) null)) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "reddot_id is removed");
                    } else if (TextUtils.isEmpty(az02.f182189s)) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "reddot_id is empty");
                    } else {
                        c7Var.f172111M = az02.f182189s;
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_GIFT_REDDOT_ID_STRING_SYNC, az02.f182189s);
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "doFinderLiveGetTeamupGiftPrepare");
                        new C46538u1(((C55001u) c7Var.f172118c.mo87696x0(cls)).f154416j, ((C55001u) c7Var.f172118c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) c7Var.f172118c.mo87696x0(cls)).f154417n), ((C55001u) c7Var.f172118c.mo87696x0(cls)).f154423t, az02.f182189s).mo9225i().mo123420E(C9022i7.f28494a);
                    }
                }
            }
            FrameLayout frameLayout = this.f172175d.f172134s;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            C64247az0 az03 = ((C54991o) this.f172175d.f172118c.mo87696x0(cls2)).f154379w1;
            ((C54116w) C86312j.m106911c(C54116w.class)).fy0(this.f172175d.mo85333h(az03 != null ? az03.f182187q : 0, 20));
            C60362c7 c7Var2 = this.f172175d;
            C64247az0 az04 = ((C54991o) c7Var2.f172118c.mo87696x0(cls2)).f154379w1;
            if (az04 != null) {
                if (az04.f182185o == 0) {
                    Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "goMiniApp teamup_gift_status is 0");
                } else if (az04.f182188r == null) {
                    Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "goMiniApp teamup_gift_jump_info is null");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - c7Var2.f172115Q < 200) {
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "don't click again in 200ms");
                    } else {
                        c7Var2.f172115Q = currentTimeMillis;
                        String obj = Util.getUuidRandom().toString();
                        C86299o oVar = new C86299o();
                        e05 e05 = az04.f182188r;
                        String str5 = "";
                        if (e05 == null || (str = e05.f182913d) == null) {
                            str = str5;
                        }
                        oVar.f250930b = str;
                        if (e05 == null || (str2 = e05.f182914e) == null) {
                            str2 = str5;
                        }
                        oVar.f250934f = str2;
                        C60371b bVar3 = new C60371b();
                        if (!(e05 == null || (bVar2 = e05.f182916g) == null)) {
                            str5 = bVar2.mo123705h();
                        }
                        bVar3.f172164d = str5;
                        oVar.f250937i = bVar3;
                        oVar.f250939k = 1177;
                        e05 e052 = az04.f182188r;
                        oVar.f250931c = e052 != null ? e052.f182915f : 0;
                        C62042e eVar = C62042e.f176370a;
                        if (eVar.mo87069c0() != 0) {
                            oVar.f250931c = eVar.mo87069c0();
                        }
                        oVar.f250940l = XVFSFile.PATH_SEPARATOR_CHAR + ((C55001u) c7Var2.f172118c.mo87696x0(cls)).f154420q.f182392d + XVFSFile.PATH_SEPARATOR_CHAR + ((C54991o) c7Var2.f172118c.mo87696x0(cls2)).f154345o + "::" + ((C54991o) c7Var2.f172118c.mo87696x0(cls2)).f154325i1 + XVFSFile.PATH_SEPARATOR_CHAR + obj + XVFSFile.PATH_SEPARATOR_CHAR + ((C54991o) c7Var2.f172118c.mo87696x0(cls2)).f154318g2 + XVFSFile.PATH_SEPARATOR_CHAR + ((C54991o) c7Var2.f172118c.mo87696x0(cls2)).f154203G1;
                        C12925w wVar = c7Var2.f172130o;
                        int height = (wVar == null || (view2 = wVar.f36927f) == null) ? -1 : view2.getHeight();
                        C12925w wVar2 = c7Var2.f172130o;
                        int width = (wVar2 == null || (viewGroup = wVar2.f36921B) == null) ? -1 : viewGroup.getWidth();
                        HalfScreenConfig.C55451a aVar = HalfScreenConfig.C55451a.SLIDE;
                        oVar.f250912A = new HalfScreenConfig(true, height, aVar, true, new HalfScreenConfig.BackgroundShapeConfig((float) C76577a.m92155f(c7Var2.f172116a.getContext(), C0966R.dimen.f3723cd), true, true, false, false, 24, (C8480h) null), false, new HalfScreenConfig.CloseWhenClickEmptyAreaConfig(c7Var2.f172116a.getContext().getClass().getName(), c7Var2.f172118c.mo82893g0() ? aVar : HalfScreenConfig.C55451a.POPUP), HalfScreenConfig.C55453c.HIDE, false, false, (WeAppHalfScreenStatusChangeListener) null, HalfScreenConfig.C55456f.FAKE_NATIVE, false, true, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, height, width, false, false, false, (HalfScreenConfig.C55455e) null, false, (HalfScreenConfig.CustomSubjectInfo) null, 0, false, false, 0, false, false, false, -4996064, 1, (C8480h) null);
                        oVar.f250916E = new C60442j7(c7Var2);
                        StringBuilder sb = new StringBuilder();
                        sb.append("appId:");
                        e05 e053 = az04.f182188r;
                        sb.append(e053 != null ? e053.f182913d : null);
                        sb.append(", path:");
                        e05 e054 = az04.f182188r;
                        sb.append(e054 != null ? e054.f182914e : null);
                        sb.append(", extraData:");
                        e05 e055 = az04.f182188r;
                        sb.append((e055 == null || (bVar = e055.f182916g) == null) ? null : bVar.mo123705h());
                        sb.append(", version:");
                        e05 e056 = az04.f182188r;
                        sb.append(e056 != null ? Integer.valueOf(e056.f182915f) : null);
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
                        Object[] objArr = new Object[1];
                        C86295k kVar = oVar.f250937i;
                        if (kVar != null) {
                            str4 = kVar.toString();
                        }
                        objArr[0] = str4;
                        Log.m105925i("Finder.FinderLiveVisitorGameTeamWidget", "open half openHalfScreenMiniProgram nativeExtraData:%s", objArr);
                        ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(c7Var2.f172116a.getContext(), oVar);
                        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "open half openHalfScreenMiniProgram by launchCommon2");
                        c7Var2.f172112N = oVar;
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$resetBottomSheet$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.c7$o */
    public static final class C60380o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60362c7 f172176d;

        /* renamed from: e */
        public final /* synthetic */ C64247az0 f172177e;

        public C60380o(C60362c7 c7Var, C64247az0 az02) {
            this.f172176d = c7Var;
            this.f172177e = az02;
        }

        public final void onClick(View view) {
            C60491p4 p4Var;
            Class cls = C54991o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showJoinGameGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C63084w6 w6Var = (C63084w6) this.f172176d.f172118c.mo87687E0(C63084w6.class);
            if (!(w6Var == null || (p4Var = w6Var.f179023q) == null)) {
                p4Var.mo85445a();
            }
            this.f172176d.mo85336k();
            ((C54991o) this.f172176d.f172118c.mo87696x0(cls)).f154195E1 = true;
            if (((C54991o) this.f172176d.f172118c.mo87696x0(cls)).f154363s1 != null) {
                C60362c7.m70628a(this.f172176d, this.f172177e);
            }
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            C60362c7 c7Var = this.f172176d;
            C64247az0 az02 = this.f172177e;
            wVar.fy0(c7Var.mo85334i(az02 != null ? az02.f182185o : 0, 18));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showJoinGameGuide$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.c7$p */
    public static final class C60381p implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60362c7 f172178d;

        /* renamed from: e */
        public final /* synthetic */ C64247az0 f172179e;

        public C60381p(C60362c7 c7Var, C64247az0 az02) {
            this.f172178d = c7Var;
            this.f172179e = az02;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showJoinGameGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f172178d.mo85336k();
            ((C54991o) this.f172178d.f172118c.mo87696x0(C54991o.class)).f154195E1 = true;
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            C60362c7 c7Var = this.f172178d;
            C64247az0 az02 = this.f172179e;
            wVar.fy0(c7Var.mo85334i(az02 != null ? az02.f182185o : 0, 18));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget$showJoinGameGuide$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C60362c7(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f172116a = viewGroup;
        this.f172117b = bVar;
        this.f172118c = cVar;
    }

    /* renamed from: a */
    public static final void m70628a(C60362c7 c7Var, C64247az0 az02) {
        c7Var.getClass();
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "showBottomSheet");
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "team up, show bottom sheet after check");
        C12925w wVar = c7Var.f172130o;
        if (wVar != null) {
            C87412m.m108591d(wVar);
            if (wVar.mo12466f()) {
                return;
            }
        }
        Context context = c7Var.f172116a.getContext();
        C87412m.m108593f(context, "root.context");
        c7Var.mo85342q(context);
        c7Var.mo85340o(az02);
        C12925w wVar2 = c7Var.f172130o;
        if (wVar2 != null) {
            wVar2.mo5086o();
        }
        Class cls = C54991o.class;
        Class cls2 = C54116w.class;
        C64247az0 az03 = ((C54991o) c7Var.f172118c.mo87696x0(cls)).f154379w1;
        int i = ((C54991o) c7Var.f172118c.mo87696x0(cls)).f154371u1;
        String str = null;
        switch (i) {
            case 2:
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar3 = (C54116w) c;
                if (az03 != null) {
                    str = C54117x.m60831b(az03);
                }
                C54116w.gy0(wVar3, 9, 0, (String) null, str, 6, (Object) null);
                return;
            case 3:
                C7335d c2 = C86312j.m106911c(cls2);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar4 = (C54116w) c2;
                if (az03 != null) {
                    str = C54117x.m60831b(az03);
                }
                C54116w.gy0(wVar4, 11, 0, (String) null, str, 6, (Object) null);
                return;
            case 4:
                C7335d c3 = C86312j.m106911c(cls2);
                C87412m.m108593f(c3, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar5 = (C54116w) c3;
                if (az03 != null) {
                    str = C54117x.m60831b(az03);
                }
                C54116w.gy0(wVar5, 7, 0, (String) null, str, 6, (Object) null);
                return;
            case 5:
                C7335d c4 = C86312j.m106911c(cls2);
                C87412m.m108593f(c4, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar6 = (C54116w) c4;
                if (az03 != null) {
                    str = C54117x.m60831b(az03);
                }
                C54116w.gy0(wVar6, 5, 0, (String) null, str, 6, (Object) null);
                return;
            case 6:
                C7335d c5 = C86312j.m106911c(cls2);
                C87412m.m108593f(c5, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar7 = (C54116w) c5;
                if (az03 != null) {
                    str = C54117x.m60831b(az03);
                }
                C54116w.gy0(wVar7, 3, 0, (String) null, str, 6, (Object) null);
                return;
            case 7:
                C7335d c6 = C86312j.m106911c(cls2);
                C87412m.m108593f(c6, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar8 = (C54116w) c6;
                if (az03 != null) {
                    str = C54117x.m60831b(az03);
                }
                C54116w.gy0(wVar8, 23, 0, (String) null, str, 6, (Object) null);
                return;
            case 8:
                C7335d c7 = C86312j.m106911c(cls2);
                C87412m.m108593f(c7, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar9 = (C54116w) c7;
                if (az03 != null) {
                    str = C54117x.m60831b(az03);
                }
                C54116w.gy0(wVar9, 29, 0, (String) null, str, 6, (Object) null);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final void mo85327b(C32227p<? super Boolean, ? super String, C13598b0> pVar) {
        Class cls = C55001u.class;
        String O5 = C66785b.f191882e.mo90662O5();
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "team up, cgi check join team, userName = " + O5);
        if (O5 == null || O5.length() == 0) {
            Log.m105920e("Finder.FinderLiveVisitorGameTeamWidget", "team up, userName is null");
            pVar.invoke(Boolean.TRUE, null);
            return;
        }
        Object obj = ((LinkedHashMap) this.f172113O).get(O5);
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        if (((Boolean) obj).booleanValue()) {
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "team up, is adult, not send cgi");
            pVar.invoke(Boolean.TRUE, null);
            return;
        }
        new C46546x0(((C55001u) this.f172118c.mo87696x0(cls)).f154416j, ((C55001u) this.f172118c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) this.f172118c.mo87696x0(cls)).f154417n), ((C55001u) this.f172118c.mo87696x0(cls)).f154423t, 1).mo9225i().mo123420E(new C8949e(pVar, this, O5));
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85328c(int r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            long r3 = f172095S
            r5 = 0
            r7 = 0
            r8 = 1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0024
            qj1.c r5 = r0.f172118c
            java.lang.Class<cl1.u> r6 = cl1.C55001u.class
            androidx.lifecycle.i0 r5 = r5.mo87696x0(r6)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r5 = r5.f182392d
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0024
            r3 = 1
            goto L_0x0025
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r3 == 0) goto L_0x0117
            qj1.c r3 = r0.f172118c
            androidx.lifecycle.i0 r3 = r3.mo87696x0(r2)
            cl1.o r3 = (cl1.C54991o) r3
            te3.az0 r13 = r3.f154379w1
            te3.uy0 r12 = f172098V
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "checkCanJumpGame lastLiveId:"
            r3.append(r4)
            long r4 = f172095S
            r3.append(r4)
            java.lang.String r4 = ", curMode:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = ", lastClickGameTeamMode:"
            r3.append(r4)
            int r4 = f172096T
            r3.append(r4)
            java.lang.String r4 = ", lastClickGameInfo:"
            r3.append(r4)
            r4 = 0
            if (r12 == 0) goto L_0x005f
            java.lang.String r5 = r12.f143183g
            goto L_0x0060
        L_0x005f:
            r5 = r4
        L_0x0060:
            r3.append(r5)
            java.lang.String r5 = ", gameTeamInfo:"
            r3.append(r5)
            java.lang.String r5 = ""
            if (r13 != 0) goto L_0x006e
            r6 = r5
            goto L_0x006f
        L_0x006e:
            r6 = r13
        L_0x006f:
            org.json.JSONObject r6 = o40.C61937h.m72709h(r6)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "Finder.FinderLiveVisitorGameTeamWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            int r3 = f172096T
            if (r1 != r3) goto L_0x0117
            if (r3 == 0) goto L_0x0117
            if (r3 == r8) goto L_0x0117
            if (r13 != 0) goto L_0x008b
            goto L_0x0117
        L_0x008b:
            r0.f172108J = r8
            te3.nl0 r1 = r13.f182176B
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r1.f184482e
            goto L_0x0095
        L_0x0094:
            r1 = r4
        L_0x0095:
            if (r1 == 0) goto L_0x009d
            int r1 = r1.length()
            if (r1 != 0) goto L_0x009e
        L_0x009d:
            r7 = 1
        L_0x009e:
            if (r7 == 0) goto L_0x00a5
            if (r12 == 0) goto L_0x00ab
            java.lang.String r4 = r12.f143183g
            goto L_0x00ab
        L_0x00a5:
            te3.nl0 r1 = r13.f182176B
            if (r1 == 0) goto L_0x00ab
            java.lang.String r4 = r1.f184482e
        L_0x00ab:
            il1.c7$a r9 = f172094R
            qj1.c r10 = r0.f172118c
            android.view.ViewGroup r1 = r0.f172116a
            android.content.Context r11 = r1.getContext()
            java.lang.String r1 = "root.context"
            gy3.C87412m.m108593f(r11, r1)
            java.lang.String r14 = f172097U
            er1.w0 r15 = er1.C58782w0.f168290a
            boolean r16 = r9.mo85345a(r13)
            int r17 = f172096T
            boolean r3 = r9.mo85345a(r13)
            if (r3 == 0) goto L_0x00d6
            te3.e05 r3 = r13.f182195y
            if (r3 == 0) goto L_0x00d8
            java.lang.String r3 = r3.f182917h
            if (r3 != 0) goto L_0x00d3
            goto L_0x00d8
        L_0x00d3:
            r18 = r3
            goto L_0x00dd
        L_0x00d6:
            if (r4 != 0) goto L_0x00db
        L_0x00d8:
            r18 = r5
            goto L_0x00dd
        L_0x00db:
            r18 = r4
        L_0x00dd:
            android.view.ViewGroup r3 = r0.f172116a
            android.content.Context r3 = r3.getContext()
            gy3.C87412m.m108593f(r3, r1)
            qj1.c r1 = r0.f172118c
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r2)
            cl1.o r1 = (cl1.C54991o) r1
            te3.vy0 r1 = r1.f154294a4
            if (r1 == 0) goto L_0x00f7
            int r1 = r1.f186017i
            r20 = r1
            goto L_0x00fa
        L_0x00f7:
            r1 = -1
            r20 = -1
        L_0x00fa:
            r19 = r3
            java.lang.String r15 = r15.mo83847f(r16, r17, r18, r19, r20)
            il1.c7$f r1 = new il1.c7$f
            r1.<init>(r0)
            qj1.c r3 = r0.f172118c
            androidx.lifecycle.i0 r2 = r3.mo87696x0(r2)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154384x1
            r16 = r1
            r17 = r2
            r9.mo85346b(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60362c7.mo85328c(int):void");
    }

    /* renamed from: d */
    public final void mo85329d(String str) {
        C62741dg dgVar;
        C62741dg dgVar2;
        Class cls = C62741dg.class;
        Class cls2 = C54991o.class;
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "checkHighlightBtn, from:" + str);
        C64247az0 az02 = ((C54991o) this.f172118c.mo87696x0(cls2)).f154379w1;
        if (!this.f172106H) {
            boolean z = this.f172107I;
        }
        int i = ((C54991o) this.f172118c.mo87696x0(cls2)).f154371u1;
        boolean z2 = false;
        boolean z3 = (i == 0 || i == 1) ? false : true;
        if (az02 != null && az02.f182182i == 1) {
            z2 = true;
        }
        ViewGroup viewGroup = null;
        if ((!z2 || ((C54991o) this.f172118c.mo87696x0(cls2)).f154393z1 || !z3) && !(((C54979h1) this.f172118c.mo87696x0(C54979h1.class)).f154147v instanceof C63957l)) {
            C62660c cVar = this.f172118c;
            if (!(cVar == null || (dgVar2 = (C62741dg) cVar.mo87687E0(cls)) == null)) {
                viewGroup = dgVar2.f178129x.f172521a;
            }
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(C0966R.C0970id.f358364eo3);
                WeImageView weImageView = (WeImageView) viewGroup.findViewById(C0966R.C0970id.eo4);
                if (weImageView != null) {
                    weImageView.setIconColor(viewGroup.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                }
                if (findViewById != null) {
                    findViewById.setBackground(viewGroup.getContext().getResources().getDrawable(C0966R.C0969drawable.f357183a14));
                    return;
                }
                return;
            }
            return;
        }
        C62660c cVar2 = this.f172118c;
        if (!(cVar2 == null || (dgVar = (C62741dg) cVar2.mo87687E0(cls)) == null)) {
            viewGroup = dgVar.f178129x.f172521a;
        }
        if (viewGroup != null) {
            View findViewById2 = viewGroup.findViewById(C0966R.C0970id.f358364eo3);
            WeImageView weImageView2 = (WeImageView) viewGroup.findViewById(C0966R.C0970id.eo4);
            if (weImageView2 != null) {
                weImageView2.setIconColor(viewGroup.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_9));
            }
            if (findViewById2 != null) {
                findViewById2.setBackground(viewGroup.getContext().getResources().getDrawable(C0966R.C0969drawable.a15));
            }
        }
    }

    /* renamed from: e */
    public final void mo85330e() {
        Class cls = C55001u.class;
        if (!this.f172114P) {
            this.f172114P = true;
            C47832n nVar = new C47832n(((C55001u) this.f172118c.mo87696x0(cls)).f154416j, ((C55001u) this.f172118c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) this.f172118c.mo87696x0(cls)).f154417n), ((C55001u) this.f172118c.mo87696x0(cls)).f154423t, 0, 16, (C8480h) null);
            Context context = this.f172116a.getContext();
            C87412m.m108593f(context, "root.context");
            nVar.mo85582k(context, this.f172116a.getContext().getResources().getString(C0966R.string.ett), 500);
            nVar.mo9225i().mo123420E(new C60374g(this));
        }
    }

    /* renamed from: f */
    public final void mo85331f(int i) {
        Class cls = C55001u.class;
        C64269bu0 bu02 = ((C54991o) this.f172118c.mo87696x0(C54991o.class)).f154183B1;
        if (bu02 != null) {
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "doFinderLiveRespondGameInvitation");
            long j = ((C55001u) this.f172118c.mo87696x0(cls)).f154416j;
            long j2 = ((C55001u) this.f172118c.mo87696x0(cls)).f154420q.f182392d;
            String str = ((C55001u) this.f172118c.mo87696x0(cls)).f154423t;
            String str2 = bu02.f182336g;
            if (str2 == null) {
                str2 = "";
            }
            new C46509b1(j, j2, str, str2, i).mo9225i().mo123420E(C8950h.f28270a);
        }
    }

    /* renamed from: g */
    public final void mo85332g(int i) {
        Class cls = C55001u.class;
        if (this.f172140y) {
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "doing preload CgiFinderLiveGetGameTeamInfo");
        } else if (!this.f172099A || i != 0) {
            this.f172140y = true;
            C51613uy0 uy02 = ((C54991o) this.f172118c.mo87696x0(C54991o.class)).f154363s1;
            if (uy02 != null) {
                new C47832n(((C55001u) this.f172118c.mo87696x0(cls)).f154416j, ((C55001u) this.f172118c.mo87696x0(cls)).f154420q.f182392d, C89349b.m111674a(((C55001u) this.f172118c.mo87696x0(cls)).f154417n), ((C55001u) this.f172118c.mo87696x0(cls)).f154423t, 0, 16, (C8480h) null).mo9225i().mo123420E(new C60375i(this, i, uy02));
            }
        } else {
            Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "is showing join game guide");
        }
    }

    /* renamed from: h */
    public final String mo85333h(int i, int i2) {
        C104289g gVar = new C104289g();
        gVar.mo145967r("reddot", Integer.valueOf(i));
        gVar.mo145967r("type", Integer.valueOf(i2));
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "obj.toString()");
        return gVar2;
    }

    /* renamed from: i */
    public final String mo85334i(int i, int i2) {
        C104289g gVar = new C104289g();
        gVar.mo145967r("gift", Integer.valueOf(i));
        gVar.mo145967r("type", Integer.valueOf(i2));
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "obj.toString()");
        return gVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r1 = r1.f179023q;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85335j(boolean r4) {
        /*
            r3 = this;
            java.lang.Class<qj1.w6> r0 = qj1.C63084w6.class
            qj1.c r1 = r3.f172118c
            qj1.c r1 = r1.mo87687E0(r0)
            qj1.w6 r1 = (qj1.C63084w6) r1
            if (r1 == 0) goto L_0x001b
            il1.p4 r1 = r1.f179023q
            if (r1 == 0) goto L_0x001b
            java.lang.Boolean r1 = r1.mo85447c()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r1 == 0) goto L_0x0041
            qj1.c r1 = r3.f172118c
            qj1.c r0 = r1.mo87687E0(r0)
            qj1.w6 r0 = (qj1.C63084w6) r0
            if (r0 == 0) goto L_0x002f
            il1.p4 r0 = r0.f179023q
            if (r0 == 0) goto L_0x002f
            r0.mo85445a()
        L_0x002f:
            r3.mo85336k()
            if (r4 == 0) goto L_0x0041
            qj1.c r4 = r3.f172118c
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r0)
            cl1.o r4 = (cl1.C54991o) r4
            r0 = 1
            r4.f154195E1 = r0
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60362c7.mo85335j(boolean):void");
    }

    /* renamed from: k */
    public final void mo85336k() {
        this.f172141z = false;
        this.f172099A = false;
        C58124b.C7172a.m7372a(this.f172117b, C58124b.C58125b.FINDER_LIVE_HIDE_GAME_JOIN_GUIDE, (Bundle) null, 2, (Object) null);
    }

    /* renamed from: l */
    public final boolean mo85337l(C64247az0 az02) {
        C64863yr1 yr12 = az02.f182184n;
        if (yr12 != null) {
            if ((yr12 != null ? yr12.f186584e : null) != null) {
                if ((yr12 != null ? yr12.f186594r : -1) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public final void mo85338m(int i, C64247az0 az02, C51613uy0 uy02) {
        C12677tg tgVar;
        e05 e05;
        C64247az0 az03 = az02;
        C51613uy0 uy03 = uy02;
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(az03, "gameTeamInfo");
        int i2 = ((C54991o) this.f172118c.mo87696x0(cls2)).f154371u1;
        boolean z = true;
        if (i2 == 1) {
            C76912y0.m92767f(this.f172116a.getContext(), this.f172116a.getContext().getResources().getString(C0966R.string.dbo));
            return;
        }
        String str = "";
        String str2 = null;
        if (i == 1) {
            this.f172108J = true;
            C64582nl0 nl02 = az03.f182176B;
            String str3 = nl02 != null ? nl02.f184482e : null;
            if (!(str3 == null || str3.length() == 0)) {
                z = false;
            }
            if (!z) {
                C64582nl0 nl03 = az03.f182176B;
                if (nl03 != null) {
                    str2 = nl03.f184482e;
                }
            } else if (uy03 != null) {
                str2 = uy03.f143183g;
            }
            C60363a aVar = f172094R;
            C62660c cVar = this.f172118c;
            Context context = this.f172116a.getContext();
            C87412m.m108593f(context, "root.context");
            String str4 = az03.f182181h;
            String str5 = str4 == null ? str : str4;
            C58782w0 w0Var = C58782w0.f168290a;
            boolean a = aVar.mo85345a(az03);
            String str6 = (!aVar.mo85345a(az03) ? str2 != null : !((e05 = az03.f182195y) == null || (str2 = e05.f182917h) == null)) ? str2 : str;
            Context context2 = this.f172116a.getContext();
            C87412m.m108593f(context2, "root.context");
            C64789vy0 vy02 = ((C54991o) this.f172118c.mo87696x0(cls2)).f154294a4;
            aVar.mo85346b(cVar, context, uy02, az02, str5, w0Var.mo83847f(a, i2, str6, context2, vy02 != null ? vy02.f186017i : -1), new C60376j(this), ((C54991o) this.f172118c.mo87696x0(cls2)).f154384x1);
            return;
        }
        long j = ((C55001u) this.f172118c.mo87696x0(cls)).f154420q.f182392d;
        String str7 = az03.f182181h;
        if (str7 != null) {
            str = str7;
        }
        f172095S = j;
        f172096T = i2;
        f172097U = str;
        f172098V = uy03;
        StringBuilder sb = new StringBuilder();
        sb.append("refreshLastGameTeamClick, liveId:");
        sb.append(j);
        sb.append(", teamMode:");
        sb.append(i2);
        sb.append(", launchParams:");
        sb.append(str);
        sb.append(", gameInfo:");
        sb.append(uy03 != null ? uy03.f143183g : null);
        sb.append(", ");
        sb.append(uy03 != null ? uy03.f143182f : null);
        sb.append(", ");
        sb.append(uy03 != null ? uy03.f143186j : null);
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", sb.toString());
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "gameteam invokeUI " + i2);
        if (i2 != 2) {
            if (i2 == 3) {
                C0548h5.m491b(C0548h5.f1327a, this.f172117b, ((C55001u) this.f172118c.mo87696x0(cls)).f154420q.f182392d, C0548h5.C0550b.GameTeam, false, 8, (Object) null);
            } else if (i2 == 4) {
                this.f172116a.postDelayed(new C60453k7(this), 100);
            } else if (i2 == 5) {
                this.f172116a.postDelayed(new C60457l7(this), 100);
            } else if (i2 == 8 && (tgVar = (C12677tg) this.f172118c.mo87687E0(C12677tg.class)) != null) {
                tgVar.mo12259b1(C12677tg.C12678a.TEAM_UP_FANS);
            }
        } else if (((C54991o) this.f172118c.mo87696x0(cls2)).mo75963I3()) {
            C58124b.C7172a.m7372a(this.f172117b, C58124b.C58125b.LIVE_EVENT_SHOW_GIFT_PANEL, (Bundle) null, 2, (Object) null);
        } else {
            C76912y0.m92769h(this.f172116a.getContext(), this.f172116a.getContext().getString(C0966R.string.doc), C0966R.raw.icons_filled_error);
        }
    }

    /* renamed from: n */
    public final void mo85339n(C64247az0 az02) {
        C87412m.m108594g(az02, "gameTeamInfo");
        if (((C54991o) this.f172118c.mo87696x0(C54991o.class)).f154371u1 == 1) {
            C76912y0.m92767f(this.f172116a.getContext(), this.f172116a.getContext().getResources().getString(C0966R.string.dbo));
        } else {
            this.f172116a.postDelayed(new C60377k(az02, this), 100);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02fa, code lost:
        if (r10 != null) goto L_0x0347;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x05ae  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x05b4  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05c4  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85340o(te3.C64247az0 r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            java.lang.Class<ak1.w> r2 = ak1.C54116w.class
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "refreshBottomSheet "
            r4.append(r5)
            org.json.JSONObject r5 = o40.C61937h.m72709h(r33)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "Finder.FinderLiveVisitorGameTeamWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            qj1.c r4 = r0.f172118c
            androidx.lifecycle.i0 r4 = r4.mo87696x0(r3)
            cl1.o r4 = (cl1.C54991o) r4
            te3.uy0 r4 = r4.f154363s1
            java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "refreshBottomSheetText gameteam bottomSheet: status:"
            r8.append(r9)
            int r9 = r1.f182177d
            r8.append(r9)
            java.lang.String r9 = ", title:"
            r8.append(r9)
            java.lang.String r9 = r1.f182178e
            r8.append(r9)
            java.lang.String r9 = ", rank:"
            r8.append(r9)
            java.lang.String r9 = r1.f182179f
            r8.append(r9)
            java.lang.String r9 = ", member:"
            r8.append(r9)
            java.lang.String r9 = r1.f182180g
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
            android.widget.TextView r8 = r0.f172119d
            java.lang.String r9 = ""
            if (r8 != 0) goto L_0x006b
            goto L_0x0074
        L_0x006b:
            java.lang.String r10 = r1.f182178e
            if (r10 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r10 = r9
        L_0x0071:
            r8.setText(r10)
        L_0x0074:
            android.widget.TextView r8 = r0.f172120e
            if (r8 != 0) goto L_0x0079
            goto L_0x0082
        L_0x0079:
            java.lang.String r10 = r1.f182179f
            if (r10 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r10 = r9
        L_0x007f:
            r8.setText(r10)
        L_0x0082:
            android.widget.TextView r8 = r0.f172121f
            if (r8 != 0) goto L_0x0087
            goto L_0x0090
        L_0x0087:
            java.lang.String r10 = r1.f182180g
            if (r10 == 0) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            r10 = r9
        L_0x008d:
            r8.setText(r10)
        L_0x0090:
            android.widget.TextView r8 = r0.f172120e
            if (r8 == 0) goto L_0x0099
            java.lang.CharSequence r8 = r8.getText()
            goto L_0x009a
        L_0x0099:
            r8 = 0
        L_0x009a:
            r12 = 0
            if (r8 == 0) goto L_0x00a6
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r8 = 0
            goto L_0x00a7
        L_0x00a6:
            r8 = 1
        L_0x00a7:
            r13 = 8
            if (r8 == 0) goto L_0x00b4
            android.widget.TextView r8 = r0.f172120e
            if (r8 != 0) goto L_0x00b0
            goto L_0x00bc
        L_0x00b0:
            r8.setVisibility(r13)
            goto L_0x00bc
        L_0x00b4:
            android.widget.TextView r8 = r0.f172120e
            if (r8 != 0) goto L_0x00b9
            goto L_0x00bc
        L_0x00b9:
            r8.setVisibility(r12)
        L_0x00bc:
            android.widget.TextView r8 = r0.f172121f
            if (r8 == 0) goto L_0x00c5
            java.lang.CharSequence r8 = r8.getText()
            goto L_0x00c6
        L_0x00c5:
            r8 = 0
        L_0x00c6:
            if (r8 == 0) goto L_0x00d1
            int r8 = r8.length()
            if (r8 != 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r8 = 0
            goto L_0x00d2
        L_0x00d1:
            r8 = 1
        L_0x00d2:
            if (r8 == 0) goto L_0x00dd
            android.widget.TextView r8 = r0.f172121f
            if (r8 != 0) goto L_0x00d9
            goto L_0x00e5
        L_0x00d9:
            r8.setVisibility(r13)
            goto L_0x00e5
        L_0x00dd:
            android.widget.TextView r8 = r0.f172121f
            if (r8 != 0) goto L_0x00e2
            goto L_0x00e5
        L_0x00e2:
            r8.setVisibility(r12)
        L_0x00e5:
            te3.yr1 r8 = r1.f182184n
            if (r8 == 0) goto L_0x02fc
            java.lang.String r14 = r8.f186590n
            if (r14 == 0) goto L_0x00f6
            int r14 = r14.length()
            if (r14 != 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r14 = 0
            goto L_0x00f7
        L_0x00f6:
            r14 = 1
        L_0x00f7:
            if (r14 != 0) goto L_0x0224
            java.lang.String r14 = r8.f186591o
            if (r14 == 0) goto L_0x0106
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r14 = 0
            goto L_0x0107
        L_0x0106:
            r14 = 1
        L_0x0107:
            if (r14 != 0) goto L_0x0224
            te3.ds1 r14 = r8.f186593q
            if (r14 == 0) goto L_0x0110
            java.lang.String r14 = r14.f182844d
            goto L_0x0111
        L_0x0110:
            r14 = 0
        L_0x0111:
            if (r14 == 0) goto L_0x011c
            int r14 = r14.length()
            if (r14 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = 0
            goto L_0x011d
        L_0x011c:
            r14 = 1
        L_0x011d:
            if (r14 != 0) goto L_0x0224
            te3.ds1 r14 = r8.f186593q
            if (r14 == 0) goto L_0x0126
            java.lang.String r14 = r14.f182845e
            goto L_0x0127
        L_0x0126:
            r14 = 0
        L_0x0127:
            if (r14 == 0) goto L_0x0132
            int r14 = r14.length()
            if (r14 != 0) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r14 = 0
            goto L_0x0133
        L_0x0132:
            r14 = 1
        L_0x0133:
            if (r14 == 0) goto L_0x0137
            goto L_0x0224
        L_0x0137:
            android.widget.ImageView r14 = r0.f172125j
            if (r14 == 0) goto L_0x0167
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r10 = r15.mo62446e(r7)
            bl3.c r10 = r10.mo62447c(r6)
            pl1.s0 r10 = (pl1.C11990s0) r10
            k60.d r10 = r10.mo11871f2()
            pl1.n0 r13 = new pl1.n0
            java.lang.String r12 = r8.f186590n
            up1.y r11 = up1.C27696y.RAW_IMAGE
            r13.<init>(r12, r11)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.DEFAULT
            bl3.r$a r12 = r15.mo62446e(r7)
            bl3.c r12 = r12.mo62447c(r6)
            pl1.s0 r12 = (pl1.C11990s0) r12
            n60.f r11 = r12.mo11867O2(r11)
            r10.mo85957c(r13, r14, r11)
        L_0x0167:
            android.widget.TextView r10 = r0.f172126k
            if (r10 != 0) goto L_0x016c
            goto L_0x0171
        L_0x016c:
            java.lang.String r11 = r8.f186591o
            r10.setText(r11)
        L_0x0171:
            android.widget.TextView r10 = r0.f172127l
            if (r10 != 0) goto L_0x0176
            goto L_0x019f
        L_0x0176:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.util.LinkedList<java.lang.String> r12 = r8.f186592p
            if (r12 == 0) goto L_0x0198
            java.util.Iterator r12 = r12.iterator()
        L_0x0183:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0198
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r11.append(r13)
            java.lang.String r13 = " "
            r11.append(r13)
            goto L_0x0183
        L_0x0198:
            java.lang.String r11 = r11.toString()
            r10.setText(r11)
        L_0x019f:
            android.widget.TextView r10 = r0.f172127l
            if (r10 != 0) goto L_0x01a4
            goto L_0x01c2
        L_0x01a4:
            java.lang.CharSequence r11 = r10.getText()
            if (r11 == 0) goto L_0x01b8
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x01b2
            r11 = 1
            goto L_0x01b3
        L_0x01b2:
            r11 = 0
        L_0x01b3:
            r12 = 1
            if (r11 != r12) goto L_0x01b8
            r11 = 1
            goto L_0x01b9
        L_0x01b8:
            r11 = 0
        L_0x01b9:
            if (r11 == 0) goto L_0x01bd
            r11 = 0
            goto L_0x01bf
        L_0x01bd:
            r11 = 8
        L_0x01bf:
            r10.setVisibility(r11)
        L_0x01c2:
            android.view.View r10 = r0.f172128m
            if (r10 == 0) goto L_0x01ce
            il1.t7 r11 = new il1.t7
            r11.<init>(r0)
            r10.setOnTouchListener(r11)
        L_0x01ce:
            android.view.View r10 = r0.f172128m
            if (r10 == 0) goto L_0x01da
            il1.u7 r11 = new il1.u7
            r11.<init>(r0, r1)
            r10.setOnClickListener(r11)
        L_0x01da:
            android.view.View r10 = r0.f172129n
            if (r10 != 0) goto L_0x01e0
            goto L_0x026d
        L_0x01e0:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r12 = 0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r11.mo10233c(r13)
            java.lang.Object[] r18 = r11.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r20 = "refreshBottomSheetText"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGameTeamInfo;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r10
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.setVisibility(r11)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r19 = "refreshBottomSheetText"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGameTeamInfo;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x026d
        L_0x0224:
            android.view.View r10 = r0.f172129n
            if (r10 != 0) goto L_0x0229
            goto L_0x026d
        L_0x0229:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r12 = 8
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r11.mo10233c(r13)
            java.lang.Object[] r25 = r11.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r27 = "refreshBottomSheetText"
            java.lang.String r28 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGameTeamInfo;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r10
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r12 = 0
            java.lang.Object r11 = r11.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.setVisibility(r11)
            java.lang.String r25 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r26 = "refreshBottomSheetText"
            java.lang.String r27 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGameTeamInfo;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x026d:
            android.widget.TextView r10 = r0.f172124i
            if (r10 == 0) goto L_0x02f9
            qj1.c r11 = r0.f172118c
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r3)
            cl1.o r11 = (cl1.C54991o) r11
            te3.vy0 r11 = r11.f154294a4
            if (r11 == 0) goto L_0x0284
            int r11 = r11.f186017i
            r12 = 1
            if (r11 != r12) goto L_0x0284
            r11 = 1
            goto L_0x0285
        L_0x0284:
            r11 = 0
        L_0x0285:
            if (r11 == 0) goto L_0x0293
            android.content.Context r11 = r10.getContext()
            r12 = 2131826760(0x7f111848, float:1.9286413E38)
            java.lang.String r11 = r11.getString(r12)
            goto L_0x02b5
        L_0x0293:
            qj1.c r11 = r0.f172118c
            androidx.lifecycle.i0 r11 = r11.mo87696x0(r3)
            cl1.o r11 = (cl1.C54991o) r11
            te3.vy0 r11 = r11.f154294a4
            if (r11 == 0) goto L_0x02a5
            int r11 = r11.f186017i
            if (r11 != 0) goto L_0x02a5
            r11 = 1
            goto L_0x02a6
        L_0x02a5:
            r11 = 0
        L_0x02a6:
            if (r11 == 0) goto L_0x02b4
            android.content.Context r11 = r10.getContext()
            r12 = 2131826759(0x7f111847, float:1.9286411E38)
            java.lang.String r11 = r11.getString(r12)
            goto L_0x02b5
        L_0x02b4:
            r11 = r9
        L_0x02b5:
            java.lang.String r12 = "if (basePlugin.business(…     \"\"\n                }"
            gy3.C87412m.m108593f(r11, r12)
            android.content.Context r12 = r10.getContext()
            r13 = 2131826758(0x7f111846, float:1.928641E38)
            java.lang.String r12 = r12.getString(r13)
            java.lang.String r13 = "context.getString(R.stri…live_team_join_desc_link)"
            gy3.C87412m.m108593f(r12, r13)
            java.lang.Class<ny.h> r13 = p629ny.C76979h.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            r17 = r13
            ny.h r17 = (p629ny.C76979h) r17
            android.content.Context r18 = r10.getContext()
            java.lang.String r8 = r8.f186583d
            java.util.List r19 = sx3.C26236u.m33719b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r11)
            r8.append(r12)
            java.lang.String r20 = r8.toString()
            java.util.List r21 = sx3.C26236u.m33719b(r12)
            java.lang.Boolean r22 = java.lang.Boolean.FALSE
            r23 = r10
            r17.Wf0(r18, r19, r20, r21, r22, r23)
            goto L_0x02fa
        L_0x02f9:
            r10 = 0
        L_0x02fa:
            if (r10 != 0) goto L_0x0347
        L_0x02fc:
            android.view.View r8 = r0.f172129n
            if (r8 != 0) goto L_0x0301
            goto L_0x0345
        L_0x0301:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r11 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.mo10233c(r12)
            java.lang.Object[] r18 = r10.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r20 = "refreshBottomSheetText"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGameTeamInfo;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r8
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r11 = 0
            java.lang.Object r10 = r10.mo10231a(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r8.setVisibility(r10)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTeamWidget"
            java.lang.String r19 = "refreshBottomSheetText"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderLiveGameTeamInfo;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0345:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x0347:
            il1.c7$a r8 = f172094R
            boolean r10 = r8.mo85345a(r1)
            if (r10 == 0) goto L_0x0359
            android.widget.TextView r10 = r0.f172124i
            if (r10 != 0) goto L_0x0354
            goto L_0x0359
        L_0x0354:
            java.lang.String r11 = r1.f182194x
            r10.setText(r11)
        L_0x0359:
            int r10 = r1.f182185o
            r11 = 2
            r12 = 1
            if (r10 != r12) goto L_0x0540
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "show gameteam gift: teamup_gift_desc:"
            r10.append(r12)
            java.lang.String r12 = r1.f182186p
            r10.append(r12)
            java.lang.String r12 = ", teamup_gift_icon:"
            r10.append(r12)
            java.lang.String r12 = r1.f182190t
            r10.append(r12)
            java.lang.String r12 = ", teamup_gift_reddot:"
            r10.append(r12)
            int r12 = r1.f182187q
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            android.widget.FrameLayout r10 = r0.f172131p
            if (r10 == 0) goto L_0x0398
            int r10 = r10.getVisibility()
            r12 = 8
            if (r10 != r12) goto L_0x0398
            r10 = 1
            goto L_0x0399
        L_0x0398:
            r10 = 0
        L_0x0399:
            if (r10 == 0) goto L_0x03ac
            di3.d r10 = di3.C86312j.m106911c(r2)
            ak1.w r10 = (ak1.C54116w) r10
            int r12 = r1.f182187q
            r13 = 19
            java.lang.String r12 = r0.mo85333h(r12, r13)
            r10.fy0(r12)
        L_0x03ac:
            android.widget.FrameLayout r10 = r0.f172131p
            if (r10 != 0) goto L_0x03b1
            goto L_0x03b5
        L_0x03b1:
            r12 = 0
            r10.setVisibility(r12)
        L_0x03b5:
            android.widget.TextView r10 = r0.f172136u
            if (r10 != 0) goto L_0x03ba
            goto L_0x03c3
        L_0x03ba:
            java.lang.String r12 = r1.f182186p
            if (r12 == 0) goto L_0x03bf
            goto L_0x03c0
        L_0x03bf:
            r12 = r9
        L_0x03c0:
            r10.setText(r12)
        L_0x03c3:
            android.widget.TextView r10 = r0.f172136u
            r12 = 2131100628(0x7f0603d4, float:1.7813643E38)
            if (r10 == 0) goto L_0x03e8
            java.lang.String r13 = r1.f182191u
            android.view.ViewGroup r14 = r0.f172116a
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources r14 = r14.getResources()
            int r14 = r14.getColor(r12)
            boolean r15 = android.text.TextUtils.isEmpty(r13)
            if (r15 == 0) goto L_0x03e1
            goto L_0x03e5
        L_0x03e1:
            int r14 = js0.C88020k.m109562m(r13)     // Catch:{ Exception -> 0x03e5 }
        L_0x03e5:
            r10.setTextColor(r14)
        L_0x03e8:
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = r0.f172137v
            if (r10 == 0) goto L_0x040a
            java.lang.String r13 = r1.f182191u
            android.view.ViewGroup r14 = r0.f172116a
            android.content.Context r14 = r14.getContext()
            android.content.res.Resources r14 = r14.getResources()
            int r12 = r14.getColor(r12)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 == 0) goto L_0x0403
            goto L_0x0407
        L_0x0403:
            int r12 = js0.C88020k.m109562m(r13)     // Catch:{ Exception -> 0x0407 }
        L_0x0407:
            r10.setIconColor(r12)
        L_0x040a:
            com.tencent.mm.ui.widget.imageview.WeImageView r10 = r0.f172137v
            if (r10 == 0) goto L_0x0412
            r12 = 1
            r10.setEnableColorFilter(r12)
        L_0x0412:
            java.lang.String r10 = r1.f182192v
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0430
            android.widget.LinearLayout r10 = r0.f172132q
            if (r10 != 0) goto L_0x041f
            goto L_0x0487
        L_0x041f:
            android.view.ViewGroup r12 = r0.f172116a
            android.content.Context r12 = r12.getContext()
            r13 = 2131232634(0x7f08077a, float:1.8081383E38)
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r13)
            r10.setBackground(r12)
            goto L_0x0487
        L_0x0430:
            android.graphics.drawable.GradientDrawable r10 = r0.f172133r
            if (r10 != 0) goto L_0x047d
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r0.f172133r = r10
            r12 = 0
            r10.setShape(r12)
            android.graphics.drawable.GradientDrawable r10 = r0.f172133r
            if (r10 == 0) goto L_0x0458
            android.view.ViewGroup r12 = r0.f172116a
            android.content.Context r12 = r12.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131166496(0x7f070520, float:1.794724E38)
            int r12 = r12.getDimensionPixelOffset(r13)
            float r12 = (float) r12
            r10.setCornerRadius(r12)
        L_0x0458:
            android.graphics.drawable.GradientDrawable r10 = r0.f172133r
            if (r10 == 0) goto L_0x047d
            java.lang.String r12 = r1.f182192v
            android.view.ViewGroup r13 = r0.f172116a
            android.content.Context r13 = r13.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131099907(0x7f060103, float:1.781218E38)
            int r13 = r13.getColor(r14)
            boolean r14 = android.text.TextUtils.isEmpty(r12)
            if (r14 == 0) goto L_0x0476
            goto L_0x047a
        L_0x0476:
            int r13 = js0.C88020k.m109562m(r12)     // Catch:{ Exception -> 0x047a }
        L_0x047a:
            r10.setColor(r13)
        L_0x047d:
            android.widget.LinearLayout r10 = r0.f172132q
            if (r10 != 0) goto L_0x0482
            goto L_0x0487
        L_0x0482:
            android.graphics.drawable.GradientDrawable r12 = r0.f172133r
            r10.setBackground(r12)
        L_0x0487:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "teamup_gift_wording_color:"
            r10.append(r12)
            java.lang.String r12 = r1.f182191u
            r10.append(r12)
            java.lang.String r12 = ", teamup_gift_background_color:"
            r10.append(r12)
            java.lang.String r12 = r1.f182192v
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            java.lang.String r10 = r1.f182190t
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x04e5
            java.lang.String r10 = r1.f182190t
            if (r10 != 0) goto L_0x04b5
            r10 = r9
        L_0x04b5:
            pl1.e0$a r12 = pl1.C11978e0.C11979a.AVATAR
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r14 = r13.mo62446e(r7)
            bl3.c r14 = r14.mo62447c(r6)
            pl1.s0 r14 = (pl1.C11990s0) r14
            n60.f r12 = r14.mo11867O2(r12)
            bl3.r$a r7 = r13.mo62446e(r7)
            bl3.c r6 = r7.mo62447c(r6)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11861A2()
            pl1.f r7 = new pl1.f
            r13 = 0
            r7.<init>(r10, r13, r11, r13)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r10 = r0.f172135t
            java.lang.String r13 = "null cannot be cast to non-null type android.widget.ImageView"
            gy3.C87412m.m108592e(r10, r13)
            r6.mo85957c(r7, r10, r12)
        L_0x04e5:
            int r6 = r1.f182187q
            r7 = 1
            if (r6 != r7) goto L_0x0535
            java.lang.String r6 = r0.f172111M
            if (r6 != 0) goto L_0x0505
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_GAME_TEAM_GIFT_REDDOT_ID_STRING_SYNC
            java.lang.Object r6 = r6.mo119685f(r7, r9)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r6, r7)
            java.lang.String r6 = (java.lang.String) r6
            r0.f172111M = r6
        L_0x0505:
            java.lang.String r6 = r1.f182189s
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x052b
            java.lang.String r6 = r0.f172111M
            if (r6 == 0) goto L_0x052b
            java.lang.String r7 = r1.f182189s
            r9 = 0
            r10 = 0
            boolean r6 = z04.C112551y.m153810j(r6, r7, r10, r11, r9)
            if (r6 == 0) goto L_0x052b
            java.lang.String r6 = "reddotId is removed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            android.widget.FrameLayout r6 = r0.f172134s
            if (r6 != 0) goto L_0x0525
            goto L_0x054f
        L_0x0525:
            r7 = 8
            r6.setVisibility(r7)
            goto L_0x054f
        L_0x052b:
            android.widget.FrameLayout r6 = r0.f172134s
            if (r6 != 0) goto L_0x0530
            goto L_0x054f
        L_0x0530:
            r7 = 0
            r6.setVisibility(r7)
            goto L_0x054f
        L_0x0535:
            android.widget.FrameLayout r6 = r0.f172134s
            if (r6 != 0) goto L_0x053a
            goto L_0x054f
        L_0x053a:
            r7 = 8
            r6.setVisibility(r7)
            goto L_0x054f
        L_0x0540:
            r7 = 8
            java.lang.String r6 = "hide gift container"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            android.widget.FrameLayout r6 = r0.f172131p
            if (r6 != 0) goto L_0x054c
            goto L_0x054f
        L_0x054c:
            r6.setVisibility(r7)
        L_0x054f:
            boolean r6 = r32.mo85337l(r33)
            r7 = 3
            r9 = 4
            if (r6 != 0) goto L_0x07a3
            qj1.c r6 = r0.f172118c
            androidx.lifecycle.i0 r3 = r6.mo87696x0(r3)
            cl1.o r3 = (cl1.C54991o) r3
            int r3 = r3.f154371u1
            int r6 = r1.f182177d
            android.widget.TextView r10 = r0.f172122g
            if (r10 != 0) goto L_0x0568
            goto L_0x057c
        L_0x0568:
            android.view.ViewGroup r12 = r0.f172116a
            android.content.Context r12 = r12.getContext()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131165315(0x7f070083, float:1.7944844E38)
            int r12 = r12.getDimensionPixelOffset(r13)
            r10.setWidth(r12)
        L_0x057c:
            android.widget.TextView r10 = r0.f172122g
            if (r10 != 0) goto L_0x0582
            goto L_0x0636
        L_0x0582:
            er1.w0 r12 = er1.C58782w0.f168290a
            android.view.ViewGroup r12 = r0.f172116a
            android.content.Context r12 = r12.getContext()
            java.lang.String r13 = "root.context"
            gy3.C87412m.m108593f(r12, r13)
            te3.e05 r13 = r1.f182195y
            if (r13 == 0) goto L_0x05a5
            java.lang.String r13 = r13.f182913d
            if (r13 == 0) goto L_0x05a5
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x059f
            r13 = 1
            goto L_0x05a0
        L_0x059f:
            r13 = 0
        L_0x05a0:
            r14 = 1
            if (r13 != r14) goto L_0x05a5
            r13 = 1
            goto L_0x05a6
        L_0x05a5:
            r13 = 0
        L_0x05a6:
            r14 = 2131826732(0x7f11182c, float:1.9286357E38)
            if (r13 == 0) goto L_0x05ae
            java.lang.String r13 = r1.f182175A
            goto L_0x05b2
        L_0x05ae:
            java.lang.String r13 = r12.getString(r14)
        L_0x05b2:
            if (r13 != 0) goto L_0x05b8
            java.lang.String r13 = r12.getString(r14)
        L_0x05b8:
            java.lang.String r14 = "(if (FinderLiveVisitorGa…tion_default_replacement)"
            gy3.C87412m.m108593f(r13, r14)
            int r14 = r1.f182177d
            r15 = 1
            if (r14 != r15) goto L_0x05c4
            goto L_0x0633
        L_0x05c4:
            if (r3 == r11) goto L_0x0621
            if (r3 == r7) goto L_0x060e
            if (r3 == r9) goto L_0x05fb
            r9 = 5
            if (r3 == r9) goto L_0x05e8
            r9 = 8
            if (r3 == r9) goto L_0x05d2
            goto L_0x0633
        L_0x05d2:
            if (r14 != r15) goto L_0x05d5
            goto L_0x0633
        L_0x05d5:
            r9 = 2131826731(0x7f11182b, float:1.9286355E38)
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r16 = 0
            r14[r16] = r13
            java.lang.String r13 = r12.getString(r9, r14)
            java.lang.String r9 = "context.getString(R.stri…ondition8, actionWording)"
            gy3.C87412m.m108593f(r13, r9)
            goto L_0x0633
        L_0x05e8:
            r16 = 0
            r9 = 2131826729(0x7f111829, float:1.928635E38)
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r14[r16] = r13
            java.lang.String r13 = r12.getString(r9, r14)
            java.lang.String r9 = "context.getString(R.stri…ondition5, actionWording)"
            gy3.C87412m.m108593f(r13, r9)
            goto L_0x0633
        L_0x05fb:
            r16 = 0
            r9 = 2131826728(0x7f111828, float:1.9286349E38)
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r14[r16] = r13
            java.lang.String r13 = r12.getString(r9, r14)
            java.lang.String r9 = "context.getString(R.stri…ondition4, actionWording)"
            gy3.C87412m.m108593f(r13, r9)
            goto L_0x0633
        L_0x060e:
            r16 = 0
            r9 = 2131826727(0x7f111827, float:1.9286347E38)
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r14[r16] = r13
            java.lang.String r13 = r12.getString(r9, r14)
            java.lang.String r9 = "context.getString(R.stri…ondition3, actionWording)"
            gy3.C87412m.m108593f(r13, r9)
            goto L_0x0633
        L_0x0621:
            r16 = 0
            r9 = 2131826726(0x7f111826, float:1.9286345E38)
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r14[r16] = r13
            java.lang.String r13 = r12.getString(r9, r14)
            java.lang.String r9 = "context.getString(R.stri…ondition2, actionWording)"
            gy3.C87412m.m108593f(r13, r9)
        L_0x0633:
            r10.setText(r13)
        L_0x0636:
            android.widget.TextView r9 = r0.f172122g
            if (r9 != 0) goto L_0x063b
            goto L_0x0642
        L_0x063b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.setTag(r3)
        L_0x0642:
            r3 = 0
            r0.f172101C = r3
            r3 = 2131232532(0x7f080714, float:1.8081176E38)
            r9 = 2131232540(0x7f08071c, float:1.8081192E38)
            r10 = 1
            if (r6 == r10) goto L_0x06fd
            if (r6 == r11) goto L_0x06fd
            if (r6 == r7) goto L_0x0667
            r4 = 4
            if (r6 == r4) goto L_0x0667
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x065c
            r2.setBackgroundResource(r9)
        L_0x065c:
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x0741
            il1.x7 r4 = il1.C9169x7.f28865d
            r2.setOnClickListener(r4)
            goto L_0x0741
        L_0x0667:
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r4 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            r17 = r2
            ak1.w r17 = (ak1.C54116w) r17
            r18 = 21
            r19 = 0
            r20 = 0
            java.lang.String r21 = ak1.C54117x.m60831b(r33)
            r22 = 6
            r23 = 0
            ak1.C54116w.gy0(r17, r18, r19, r20, r21, r22, r23)
            int r2 = r0.f172102D
            r0.f172101C = r2
            android.widget.TextView r2 = r0.f172122g
            if (r2 != 0) goto L_0x068e
            goto L_0x06a7
        L_0x068e:
            boolean r4 = r8.mo85345a(r1)
            if (r4 == 0) goto L_0x0697
            java.lang.String r4 = r1.f182175A
            goto L_0x06a4
        L_0x0697:
            android.view.ViewGroup r4 = r0.f172116a
            android.content.Context r4 = r4.getContext()
            r6 = 2131826767(0x7f11184f, float:1.9286428E38)
            java.lang.String r4 = r4.getString(r6)
        L_0x06a4:
            r2.setText(r4)
        L_0x06a7:
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x06bf
            android.view.ViewGroup r4 = r0.f172116a
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131100700(0x7f06041c, float:1.7813789E38)
            int r4 = r4.getColor(r6)
            r2.setTextColor(r4)
        L_0x06bf:
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x06c8
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            goto L_0x06c9
        L_0x06c8:
            r13 = 0
        L_0x06c9:
            if (r13 != 0) goto L_0x06cc
            goto L_0x06df
        L_0x06cc:
            android.view.ViewGroup r2 = r0.f172116a
            android.content.Context r2 = r2.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r4 = 2131165331(0x7f070093, float:1.7944876E38)
            int r2 = r2.getDimensionPixelOffset(r4)
            r13.width = r2
        L_0x06df:
            android.widget.TextView r2 = r0.f172122g
            if (r2 != 0) goto L_0x06e4
            goto L_0x06e7
        L_0x06e4:
            r2.setLayoutParams(r13)
        L_0x06e7:
            android.widget.TextView r2 = r0.f172122g
            if (r2 != 0) goto L_0x06ec
            goto L_0x06f0
        L_0x06ec:
            r7 = 0
            r2.setBackground(r7)
        L_0x06f0:
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x0741
            il1.w7 r4 = new il1.w7
            r4.<init>(r0, r1)
            r2.setOnClickListener(r4)
            goto L_0x0741
        L_0x06fd:
            r7 = 0
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x0707
            android.view.ViewGroup$LayoutParams r10 = r2.getLayoutParams()
            goto L_0x0708
        L_0x0707:
            r10 = r7
        L_0x0708:
            if (r10 != 0) goto L_0x070b
            goto L_0x070e
        L_0x070b:
            r2 = -2
            r10.width = r2
        L_0x070e:
            android.widget.TextView r2 = r0.f172122g
            if (r2 != 0) goto L_0x0713
            goto L_0x0716
        L_0x0713:
            r2.setLayoutParams(r10)
        L_0x0716:
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x071d
            r2.setBackgroundResource(r3)
        L_0x071d:
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x0735
            android.view.ViewGroup r7 = r0.f172116a
            android.content.Context r7 = r7.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
            int r7 = r7.getColor(r8)
            r2.setTextColor(r7)
        L_0x0735:
            android.widget.TextView r2 = r0.f172122g
            if (r2 == 0) goto L_0x0741
            il1.v7 r7 = new il1.v7
            r7.<init>(r0, r6, r1, r4)
            r2.setOnClickListener(r7)
        L_0x0741:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "gameteam refreshBtnState "
            r2.append(r4)
            int r4 = r1.f182182i
            r2.append(r4)
            java.lang.String r4 = ", "
            r2.append(r4)
            int r6 = r1.f182177d
            r2.append(r6)
            r2.append(r4)
            boolean r4 = r32.mo85337l(r33)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            boolean r2 = r32.mo85337l(r33)
            if (r2 != 0) goto L_0x0807
            int r2 = r1.f182177d
            r4 = 1
            if (r2 == r4) goto L_0x077a
            if (r2 == r11) goto L_0x077a
            goto L_0x0807
        L_0x077a:
            int r1 = r1.f182182i
            if (r1 != r4) goto L_0x0790
            android.widget.TextView r1 = r0.f172122g
            if (r1 == 0) goto L_0x0785
            r1.setBackgroundResource(r3)
        L_0x0785:
            android.widget.TextView r1 = r0.f172122g
            if (r1 != 0) goto L_0x078b
            goto L_0x0807
        L_0x078b:
            r1.setClickable(r4)
            goto L_0x0807
        L_0x0790:
            android.widget.TextView r1 = r0.f172122g
            if (r1 == 0) goto L_0x0797
            r1.setBackgroundResource(r9)
        L_0x0797:
            android.widget.TextView r1 = r0.f172122g
            if (r1 != 0) goto L_0x079d
            goto L_0x0807
        L_0x079d:
            r2 = 0
            r1.setClickable(r2)
            goto L_0x0807
        L_0x07a3:
            il1.c7$d r2 = r0.f172138w
            r2.getClass()
            te3.yr1 r3 = r1.f182184n
            if (r3 != 0) goto L_0x07ad
            goto L_0x0807
        L_0x07ad:
            il1.c7 r6 = il1.C60362c7.this
            boolean r6 = r6.mo85337l(r1)
            if (r6 != 0) goto L_0x07b6
            goto L_0x0807
        L_0x07b6:
            java.lang.String r6 = "pay game showBottomSheet"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            il1.c7 r5 = il1.C60362c7.this
            android.widget.TextView r5 = r5.f172122g
            if (r5 != 0) goto L_0x07c2
            goto L_0x07ca
        L_0x07c2:
            r6 = 7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.setTag(r6)
        L_0x07ca:
            il1.g7 r5 = new il1.g7
            il1.c7 r6 = il1.C60362c7.this
            r5.<init>(r6, r1, r4, r3)
            int r1 = r1.f182177d
            r4 = 1
            if (r1 == r4) goto L_0x0804
            if (r1 == r11) goto L_0x07ff
            if (r1 == r7) goto L_0x07de
            r4 = 4
            if (r1 == r4) goto L_0x07de
            goto L_0x0807
        L_0x07de:
            int r4 = r3.f186585f
            if (r4 <= 0) goto L_0x07f1
            int r4 = r3.f186586g
            if (r4 <= 0) goto L_0x07ec
            if (r1 != r7) goto L_0x07ec
            r2.mo9751d(r3, r5)
            goto L_0x0807
        L_0x07ec:
            r1 = 1
            r2.mo9750c(r1, r3)
            goto L_0x0807
        L_0x07f1:
            r1 = 1
            int r4 = r3.f186587h
            if (r4 <= 0) goto L_0x07fb
            r4 = 0
            r2.mo9750c(r4, r3)
            goto L_0x0807
        L_0x07fb:
            r2.mo9749b(r3, r5, r1)
            goto L_0x0807
        L_0x07ff:
            r4 = 0
            r2.mo9749b(r3, r5, r4)
            goto L_0x0807
        L_0x0804:
            r2.mo9751d(r3, r5)
        L_0x0807:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60362c7.mo85340o(te3.az0):void");
    }

    /* renamed from: p */
    public final void mo85341p() {
        Class cls = C54991o.class;
        Class cls2 = C54116w.class;
        C64247az0 az02 = ((C54991o) this.f172118c.mo87696x0(cls)).f154379w1;
        String str = null;
        switch (((C54991o) this.f172118c.mo87696x0(cls)).f154371u1) {
            case 2:
                C7335d c = C86312j.m106911c(cls2);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar = (C54116w) c;
                if (az02 != null) {
                    str = C54117x.m60831b(az02);
                }
                C54116w.gy0(wVar, 10, 0, (String) null, str, 6, (Object) null);
                return;
            case 3:
                C7335d c2 = C86312j.m106911c(cls2);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar2 = (C54116w) c2;
                if (az02 != null) {
                    str = C54117x.m60831b(az02);
                }
                C54116w.gy0(wVar2, 12, 0, (String) null, str, 6, (Object) null);
                return;
            case 4:
                C7335d c3 = C86312j.m106911c(cls2);
                C87412m.m108593f(c3, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar3 = (C54116w) c3;
                if (az02 != null) {
                    str = C54117x.m60831b(az02);
                }
                C54116w.gy0(wVar3, 8, 0, (String) null, str, 6, (Object) null);
                return;
            case 5:
                C7335d c4 = C86312j.m106911c(cls2);
                C87412m.m108593f(c4, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar4 = (C54116w) c4;
                if (az02 != null) {
                    str = C54117x.m60831b(az02);
                }
                C54116w.gy0(wVar4, 6, 0, (String) null, str, 6, (Object) null);
                return;
            case 6:
                C7335d c5 = C86312j.m106911c(cls2);
                C87412m.m108593f(c5, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar5 = (C54116w) c5;
                if (az02 != null) {
                    str = C54117x.m60831b(az02);
                }
                C54116w.gy0(wVar5, 4, 0, (String) null, str, 6, (Object) null);
                return;
            case 7:
                C7335d c6 = C86312j.m106911c(cls2);
                C87412m.m108593f(c6, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar6 = (C54116w) c6;
                if (az02 != null) {
                    str = C54117x.m60831b(az02);
                }
                C54116w.gy0(wVar6, 24, 0, (String) null, str, 6, (Object) null);
                return;
            case 8:
                C7335d c7 = C86312j.m106911c(cls2);
                C87412m.m108593f(c7, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w wVar7 = (C54116w) c7;
                if (az02 != null) {
                    str = C54117x.m60831b(az02);
                }
                C54116w.gy0(wVar7, 30, 0, (String) null, str, 6, (Object) null);
                return;
            default:
                return;
        }
    }

    /* renamed from: q */
    public final void mo85342q(Context context) {
        C12925w wVar = new C12925w(context, 0, true, true);
        this.f172130o = wVar;
        wVar.mo12470j(C0966R.C0971layout.cwu);
        wVar.f36927f.findViewById(C0966R.C0970id.dlm).setOnClickListener(new C60378l(wVar, this));
        if (context.getResources().getConfiguration().orientation == 2) {
            ViewGroup.LayoutParams layoutParams = wVar.f36927f.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C75044y4.m89990b(context).y;
                layoutParams.height = -1;
            }
            wVar.f36920A = C75044y4.m89990b(context).y;
            wVar.mo12472l(Boolean.TRUE);
        }
        this.f172119d = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dln);
        this.f172120e = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dlo);
        this.f172121f = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dlp);
        this.f172122g = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dlf);
        Object systemService = context.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        float f = (17.0f * displayMetrics.density) / context.getResources().getDisplayMetrics().density;
        TextView textView = this.f172122g;
        if (textView != null) {
            textView.setTextSize(1, f);
        }
        ViewGroup viewGroup = (ViewGroup) wVar.f36927f.findViewById(C0966R.C0970id.gkq);
        this.f172124i = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.ah5);
        this.f172126k = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dvc);
        this.f172127l = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dve);
        this.f172125j = (ImageView) wVar.f36927f.findViewById(C0966R.C0970id.dvd);
        this.f172123h = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dlq);
        this.f172128m = wVar.f36927f.findViewById(C0966R.C0970id.eof);
        this.f172129n = wVar.f36927f.findViewById(C0966R.C0970id.eoe);
        wVar.f36927f.setBackground((Drawable) null);
        this.f172131p = (FrameLayout) wVar.f36927f.findViewById(C0966R.C0970id.dlj);
        this.f172132q = (LinearLayout) wVar.f36927f.findViewById(C0966R.C0970id.dli);
        this.f172134s = (FrameLayout) wVar.f36927f.findViewById(C0966R.C0970id.dlk);
        this.f172135t = (MMRoundCornerImageView) wVar.f36927f.findViewById(C0966R.C0970id.dlh);
        this.f172136u = (TextView) wVar.f36927f.findViewById(C0966R.C0970id.dll);
        this.f172137v = (WeImageView) wVar.f36927f.findViewById(C0966R.C0970id.dlg);
        FrameLayout frameLayout = this.f172131p;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.f172131p;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new C60379m(this));
        }
        FrameLayout frameLayout3 = this.f172131p;
        if (frameLayout3 != null) {
            frameLayout3.setOnTouchListener(new C8951n(this));
        }
        FrameLayout frameLayout4 = this.f172134s;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(8);
        }
    }

    /* renamed from: r */
    public final void mo85343r() {
        Class cls = C54991o.class;
        long j = ((C54991o) this.f172118c.mo87696x0(cls)).f154187C1;
        this.f172105G = j;
        Log.m105925i("Finder.FinderLiveVisitorGameTeamWidget", "set lastGameInvitationSeq to :%d", Long.valueOf(j));
        ((C54991o) this.f172118c.mo87696x0(cls)).f154191D1 = this.f172105G;
    }

    /* renamed from: s */
    public final void mo85344s(C51613uy0 uy02, C64247az0 az02) {
        C60491p4 p4Var;
        C60491p4 p4Var2;
        C60491p4 p4Var3;
        C60491p4 p4Var4;
        C60491p4 p4Var5;
        Class cls = C54991o.class;
        Class cls2 = C63084w6.class;
        C63084w6 w6Var = (C63084w6) this.f172118c.mo87687E0(cls2);
        C60491p4 p4Var6 = w6Var != null ? w6Var.f179023q : null;
        if (p4Var6 != null) {
            p4Var6.setMListener(new C60380o(this, az02));
        }
        C63084w6 w6Var2 = (C63084w6) this.f172118c.mo87687E0(cls2);
        C60491p4 p4Var7 = w6Var2 != null ? w6Var2.f179023q : null;
        if (p4Var7 != null) {
            p4Var7.setMCloseListener(new C60381p(this, az02));
        }
        C63084w6 w6Var3 = (C63084w6) this.f172118c.mo87687E0(cls2);
        if (!(w6Var3 == null || (p4Var5 = w6Var3.f179023q) == null)) {
            p4Var5.mo85449e(az02.f182178e, false);
        }
        C63084w6 w6Var4 = (C63084w6) this.f172118c.mo87687E0(cls2);
        if (!(w6Var4 == null || (p4Var4 = w6Var4.f179023q) == null)) {
            String str = az02.f182180g;
            String str2 = az02.f182196z;
            C64863yr1 yr12 = az02.f182184n;
            p4Var4.mo85448d(str, str2, yr12 != null ? yr12.f186594r : 0);
        }
        C54991o oVar = (C54991o) this.f172118c.mo87696x0(cls);
        String str3 = ((C54991o) this.f172118c.mo87696x0(cls)).f154367t1;
        int i = az02.f182185o;
        if (i == 1) {
            str3 = az02.f182186p;
        } else {
            i = 0;
        }
        Log.m105924i("Finder.FinderLiveVisitorGameTeamWidget", "show guide, " + az02.f182178e + ' ' + az02.f182180g + " teamup_gift_status:" + i);
        if (i == 1) {
            C63084w6 w6Var5 = (C63084w6) this.f172118c.mo87687E0(cls2);
            if (!(w6Var5 == null || (p4Var3 = w6Var5.f179023q) == null)) {
                p4Var3.setGiftTitle(str3);
            }
        } else {
            C63084w6 w6Var6 = (C63084w6) this.f172118c.mo87687E0(cls2);
            if (!(w6Var6 == null || (p4Var2 = w6Var6.f179023q) == null)) {
                p4Var2.setGiftTitle("");
            }
        }
        ((C54116w) C86312j.m106911c(C54116w.class)).fy0(mo85334i(i, 17));
        this.f172099A = true;
        this.f172141z = false;
        C63084w6 w6Var7 = (C63084w6) this.f172118c.mo87687E0(cls2);
        if (!(w6Var7 == null || (p4Var = w6Var7.f179023q) == null)) {
            p4Var.mo85450f();
        }
        C58124b.C7172a.m7372a(this.f172117b, C58124b.C58125b.FINDER_LIVE_SHOW_GAME_JOIN_GUIDE, (Bundle) null, 2, (Object) null);
    }
}
