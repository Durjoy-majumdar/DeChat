package ul1;

import ak1.C54067f0;
import ak1.C54108o;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import il1.C8968f2;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import qo3.C101218e0;
import rl1.C13073q0;
import rx3.C13598b0;
import te3.C48779ay0;
import te3.C50189kx0;
import ul1.C14205c;
import ul1.C14210f;
import z04.C112550d0;

/* renamed from: ul1.k */
public final class C14221k implements C14210f {

    /* renamed from: A */
    public View f39716A;

    /* renamed from: B */
    public EditText f39717B;

    /* renamed from: C */
    public TextView f39718C;

    /* renamed from: D */
    public View f39719D;

    /* renamed from: E */
    public CheckBox f39720E;

    /* renamed from: F */
    public C101218e0 f39721F;

    /* renamed from: G */
    public C101218e0 f39722G;

    /* renamed from: H */
    public C8968f2 f39723H;

    /* renamed from: I */
    public ObjectAnimator f39724I;

    /* renamed from: J */
    public ObjectAnimator f39725J;

    /* renamed from: d */
    public final View f39726d;

    /* renamed from: e */
    public final MMActivity f39727e;

    /* renamed from: f */
    public final C14209e f39728f;

    /* renamed from: g */
    public TextView f39729g;

    /* renamed from: h */
    public View f39730h;

    /* renamed from: i */
    public EditText f39731i;

    /* renamed from: j */
    public View f39732j;

    /* renamed from: n */
    public View f39733n;

    /* renamed from: o */
    public MMSwitchBtn f39734o;

    /* renamed from: p */
    public View f39735p;

    /* renamed from: q */
    public View f39736q;

    /* renamed from: r */
    public TextView f39737r;

    /* renamed from: s */
    public View f39738s;

    /* renamed from: t */
    public EditText f39739t;

    /* renamed from: u */
    public View f39740u;

    /* renamed from: v */
    public TextView f39741v;

    /* renamed from: w */
    public RelativeLayout f39742w;

    /* renamed from: x */
    public EditText f39743x;

    /* renamed from: y */
    public RelativeLayout f39744y;

    /* renamed from: z */
    public EditText f39745z;

    /* renamed from: ul1.k$a */
    public static final class C14222a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C14221k f39746a;

        public C14222a(C14221k kVar) {
            this.f39746a = kVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C14221k kVar = this.f39746a;
            C14209e eVar = kVar.f39728f;
            kVar.mo13603j0(eVar != null ? eVar.mo13590S() : false, 2);
        }
    }

    /* renamed from: ul1.k$b */
    public static final class C14223b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39747d;

        public C14223b(C14221k kVar) {
            this.f39747d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14221k kVar = this.f39747d;
            kVar.f39721F = new C101218e0(kVar.f39727e, 0, 2);
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            View inflate = View.inflate(kVar.f39727e, C0966R.C0971layout.f359734ai1, (ViewGroup) null);
            C85875k4.m106189j0(((TextView) inflate.findViewById(C0966R.C0970id.g7d)).getPaint(), 0.8f);
            View findViewById = inflate.findViewById(C0966R.C0970id.g7a);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C14239l(kVar));
            }
            C101218e0 e0Var = kVar.f39721F;
            if (e0Var != null) {
                e0Var.mo140672r(inflate);
            }
            RecyclerView recyclerView = new RecyclerView(kVar.f39727e, (AttributeSet) null);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(kVar.f39727e, 1, false));
            C14202a aVar = new C14202a();
            C14209e eVar = kVar.f39728f;
            aVar.f39653d = eVar != null ? eVar.mo13597l0() : null;
            aVar.f39654e = new C14240m(kVar);
            recyclerView.setAdapter(aVar);
            C101218e0 e0Var2 = kVar.f39721F;
            if (e0Var2 != null) {
                e0Var2.mo140663j(recyclerView);
            }
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = C75044y4.m89991c(MMApplicationContext.getContext());
                }
            }
            C101218e0 e0Var3 = kVar.f39721F;
            if (e0Var3 != null) {
                e0Var3.mo140655A();
            }
            ((C54108o) C86312j.m106911c(C54108o.class)).Mx0(C54067f0.C0051c.CLICK_JOIN_CONDITION, "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ul1.k$c */
    public static final class C14224c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39748d;

        public C14224c(C14221k kVar) {
            this.f39748d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14221k kVar = this.f39748d;
            C14221k.m13573p(kVar, kVar.f39743x);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ul1.k$d */
    public static final class C14225d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39749d;

        public C14225d(C14221k kVar) {
            this.f39749d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14221k kVar = this.f39749d;
            C14221k.m13573p(kVar, kVar.f39745z);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ul1.k$e */
    public static final class C14226e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39750d;

        public C14226e(C14221k kVar) {
            this.f39750d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14221k kVar = this.f39750d;
            C14221k.m13573p(kVar, kVar.f39717B);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ul1.k$f */
    public static final class C14227f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39751d;

        public C14227f(C14221k kVar) {
            this.f39751d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14221k kVar = this.f39751d;
            C14221k.m13573p(kVar, kVar.f39731i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ul1.k$g */
    public static final class C14228g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39752d;

        public C14228g(C14221k kVar) {
            this.f39752d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
            r8 = r8.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$16"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                er1.j4 r8 = er1.C58739j4.f168176a
                boolean r8 = r8.mo83683L()
                java.lang.String r0 = "(Landroid/view/View;)V"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$16"
                if (r8 == 0) goto L_0x002f
                j20.C117292a.m165361g(r7, r3, r2, r1, r0)
                return
            L_0x002f:
                ul1.k r8 = r7.f39752d
                android.widget.EditText r8 = r8.f39717B
                if (r8 == 0) goto L_0x0040
                android.text.Editable r8 = r8.getText()
                if (r8 == 0) goto L_0x0040
                java.lang.String r8 = r8.toString()
                goto L_0x0041
            L_0x0040:
                r8 = 0
            L_0x0041:
                r4 = 0
                if (r8 == 0) goto L_0x004d
                int r8 = r8.length()
                if (r8 != 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r8 = 0
                goto L_0x004e
            L_0x004d:
                r8 = 1
            L_0x004e:
                if (r8 == 0) goto L_0x0066
                ul1.k r8 = r7.f39752d
                com.tencent.mm.ui.MMActivity r8 = r8.f39727e
                r5 = 2131827892(0x7f111cb4, float:1.928871E38)
                java.lang.String r5 = r8.getString(r5)
                android.widget.Toast r8 = nj3.C76912y0.makeText((android.content.Context) r8, (java.lang.CharSequence) r5, (int) r4)
                r8.show()
                j20.C117292a.m165361g(r7, r3, r2, r1, r0)
                return
            L_0x0066:
                ul1.k r8 = r7.f39752d
                ul1.e r8 = r8.f39728f
                if (r8 == 0) goto L_0x006f
                r8.mo13598y()
            L_0x006f:
                j20.C117292a.m165361g(r7, r3, r2, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ul1.C14221k.C14228g.onClick(android.view.View):void");
        }
    }

    /* renamed from: ul1.k$h */
    public static final class C14229h implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C14221k f39753a;

        public C14229h(C14221k kVar) {
            this.f39753a = kVar;
        }

        public final void onStatusChange(boolean z) {
            C14209e eVar = this.f39753a.f39728f;
            if (eVar != null) {
                eVar.mo13587O0(z);
            }
        }
    }

    /* renamed from: ul1.k$i */
    public static final class C14230i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39754d;

        public C14230i(C14221k kVar) {
            this.f39754d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C58739j4.f168176a.mo83683L()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C14221k kVar = this.f39754d;
            kVar.f39722G = new C101218e0(kVar.f39727e, 0, 2);
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            View inflate = View.inflate(kVar.f39727e, C0966R.C0971layout.f359734ai1, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.g7d);
            textView.setText(textView.getContext().getResources().getString(C0966R.string.mnv));
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            View findViewById = inflate.findViewById(C0966R.C0970id.g7a);
            if (findViewById != null) {
                findViewById.setOnClickListener(new C14242o(kVar));
            }
            C101218e0 e0Var = kVar.f39722G;
            if (e0Var != null) {
                e0Var.mo140672r(inflate);
            }
            RecyclerView recyclerView = new RecyclerView(kVar.f39727e, (AttributeSet) null);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(kVar.f39727e, 1, false));
            C14202a aVar = new C14202a();
            C14209e eVar = kVar.f39728f;
            aVar.f39653d = eVar != null ? eVar.mo13595j1() : null;
            aVar.f39654e = new C14243p(kVar);
            recyclerView.setAdapter(aVar);
            C101218e0 e0Var2 = kVar.f39722G;
            if (e0Var2 != null) {
                e0Var2.mo140663j(recyclerView);
            }
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                }
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = C75044y4.m89991c(MMApplicationContext.getContext());
                }
            }
            C101218e0 e0Var3 = kVar.f39722G;
            if (e0Var3 != null) {
                e0Var3.mo140655A();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ul1.k$j */
    public static final class C14231j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14231j(C14221k kVar) {
            super(0);
            this.f39755d = kVar;
        }

        public Object invoke() {
            String str;
            Editable text;
            EditText editText = this.f39755d.f39739t;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            C14209e eVar = this.f39755d.f39728f;
            if (eVar != null) {
                eVar.mo13594i1(C58739j4.f168176a.mo83716k(str));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ul1.k$k */
    public static final class C14232k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39756d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14232k(C14221k kVar) {
            super(0);
            this.f39756d = kVar;
        }

        public Object invoke() {
            String str;
            Editable text;
            EditText editText = this.f39756d.f39731i;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            C14209e eVar = this.f39756d.f39728f;
            if (eVar != null) {
                eVar.mo13585C0(C58739j4.f168176a.mo83716k(str));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ul1.k$l */
    public static final class C14233l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39757d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14233l(C14221k kVar) {
            super(0);
            this.f39757d = kVar;
        }

        public Object invoke() {
            Editable text;
            CharSequence hint;
            Editable text2;
            EditText editText = this.f39757d.f39743x;
            boolean z = false;
            if (!(editText == null || (text2 = editText.getText()) == null)) {
                if (text2.length() == 0) {
                    z = true;
                }
            }
            String str = null;
            if (z) {
                C14221k kVar = this.f39757d;
                C14209e eVar = kVar.f39728f;
                if (eVar != null) {
                    EditText editText2 = kVar.f39743x;
                    if (!(editText2 == null || (hint = editText2.getHint()) == null)) {
                        str = hint.toString();
                    }
                    eVar.mo13592d0(Util.safeParseInt(str));
                }
            } else {
                C14221k kVar2 = this.f39757d;
                C14209e eVar2 = kVar2.f39728f;
                if (eVar2 != null) {
                    EditText editText3 = kVar2.f39743x;
                    if (!(editText3 == null || (text = editText3.getText()) == null)) {
                        str = text.toString();
                    }
                    eVar2.mo13592d0(Util.safeParseInt(str));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ul1.k$m */
    public static final class C14234m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39758d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14234m(C14221k kVar) {
            super(0);
            this.f39758d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            r0 = r0.getText();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r2 = this;
                ul1.k r0 = r2.f39758d
                ul1.e r1 = r0.f39728f
                if (r1 == 0) goto L_0x001d
                android.widget.EditText r0 = r0.f39745z
                if (r0 == 0) goto L_0x0015
                android.text.Editable r0 = r0.getText()
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = r0.toString()
                goto L_0x0016
            L_0x0015:
                r0 = 0
            L_0x0016:
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                r1.mo13599y0(r0)
            L_0x001d:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ul1.C14221k.C14234m.invoke():java.lang.Object");
        }
    }

    /* renamed from: ul1.k$n */
    public static final class C14235n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39759d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14235n(C14221k kVar) {
            super(0);
            this.f39759d = kVar;
        }

        public Object invoke() {
            String str;
            Editable text;
            C14221k kVar = this.f39759d;
            C14209e eVar = kVar.f39728f;
            if (eVar != null) {
                EditText editText = kVar.f39717B;
                if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                    str = "";
                }
                eVar.mo13589Q0(str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ul1.k$o */
    public static final class C14236o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39760d;

        public C14236o(C14221k kVar) {
            this.f39760d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckBox checkBox = this.f39760d.f39720E;
            if (checkBox != null) {
                checkBox.performClick();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ul1.k$p */
    public static final class C14237p extends C87413o implements C32226l<C48779ay0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39761d;

        /* renamed from: e */
        public final /* synthetic */ int f39762e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14237p(C14221k kVar, int i) {
            super(1);
            this.f39761d = kVar;
            this.f39762e = i;
        }

        public Object invoke(Object obj) {
            C48779ay0 ay02 = (C48779ay0) obj;
            C87412m.m108594g(ay02, "innerErrPage");
            C14221k kVar = this.f39761d;
            if (kVar.f39723H == null) {
                View findViewById = kVar.f39726d.findViewById(C0966R.C0970id.dqu);
                C87412m.m108593f(findViewById, "rootView.findViewById(R.…r_live_lottery_exception)");
                kVar.f39723H = new C8968f2(findViewById, (String) null, (String) null, 6, (C8480h) null);
            }
            C14221k kVar2 = this.f39761d;
            C8968f2 f2Var = kVar2.f39723H;
            if (f2Var != null) {
                f2Var.mo9779c(7, ay02, this.f39762e, new C14241n(kVar2));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ul1.k$q */
    public static final class C14238q implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C14221k f39763d;

        public C14238q(C14221k kVar) {
            this.f39763d = kVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView = this.f39763d.f39729g;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C14221k(View view, MMActivity mMActivity, C14209e eVar) {
        C87412m.m108594g(view, "rootView");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f39726d = view;
        this.f39727e = mMActivity;
        this.f39728f = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r2.getContext();
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13573p(ul1.C14221k r1, android.widget.EditText r2) {
        /*
            r1.getClass()
            if (r2 == 0) goto L_0x0008
            r2.requestFocus()
        L_0x0008:
            if (r2 == 0) goto L_0x0017
            android.content.Context r1 = r2.getContext()
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L_0x0020
            r0 = 0
            r1.showSoftInput(r2, r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ul1.C14221k.m13573p(ul1.k, android.widget.EditText):void");
    }

    /* renamed from: I */
    public void mo13600I(boolean z) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z2 = true;
        if (z) {
            TextView textView = this.f39729g;
            if (textView != null && textView.getVisibility() != 8) {
                if (this.f39725J == null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "translationY", new float[]{0.0f, -((float) textView.getLayoutParams().height)});
                    this.f39725J = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.addListener(new C14238q(this));
                    }
                }
                ObjectAnimator objectAnimator3 = this.f39725J;
                if (objectAnimator3 == null || !objectAnimator3.isRunning()) {
                    z2 = false;
                }
                if (!z2 && (objectAnimator2 = this.f39725J) != null) {
                    objectAnimator2.start();
                    return;
                }
                return;
            }
            return;
        }
        TextView textView2 = this.f39729g;
        if (textView2 != null && textView2.getVisibility() != 0) {
            textView2.setVisibility(0);
            if (this.f39724I == null) {
                this.f39724I = ObjectAnimator.ofFloat(textView2, "translationY", new float[]{-((float) textView2.getLayoutParams().height), 0.0f});
            }
            ObjectAnimator objectAnimator4 = this.f39724I;
            if (objectAnimator4 == null || !objectAnimator4.isRunning()) {
                z2 = false;
            }
            if (!z2 && (objectAnimator = this.f39724I) != null) {
                objectAnimator.start();
            }
        }
    }

    /* renamed from: U */
    public void mo13601U(int i, String str) {
        CheckBox checkBox;
        String str2 = str;
        C87412m.m108594g(str2, "claimMethodWording");
        TextView textView = (TextView) this.f39726d.findViewById(C0966R.C0970id.ks5);
        this.f39729g = textView;
        if (textView != null) {
            String string = this.f39727e.getResources().getString(C0966R.string.dte);
            C87412m.m108593f(string, "activity.resources.getSt…ve_lottery_duration_tips)");
            int i2 = C14212g.f39679z;
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(C14212g.f39679z)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            textView.setText(format);
        }
        this.f39732j = this.f39726d.findViewById(C0966R.C0970id.n6u);
        View findViewById = this.f39726d.findViewById(C0966R.C0970id.g7q);
        this.f39733n = findViewById;
        MMSwitchBtn mMSwitchBtn = findViewById != null ? (MMSwitchBtn) findViewById.findViewById(C0966R.C0970id.ioz) : null;
        this.f39734o = mMSwitchBtn;
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setSwitchListener(new C14229h(this));
        }
        this.f39735p = this.f39726d.findViewById(C0966R.C0970id.n6w);
        this.f39736q = this.f39726d.findViewById(C0966R.C0970id.n6t);
        TextView textView2 = (TextView) this.f39726d.findViewById(C0966R.C0970id.n6y);
        this.f39737r = textView2;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        View view = this.f39736q;
        if (view != null) {
            view.setOnClickListener(new C14230i(this));
        }
        View findViewById2 = this.f39726d.findViewById(C0966R.C0970id.n78);
        this.f39738s = findViewById2;
        EditText editText = findViewById2 != null ? (EditText) findViewById2.findViewById(C0966R.C0970id.n79) : null;
        this.f39739t = editText;
        C62042e eVar = C62042e.f176370a;
        C62042e.m72802O1(eVar, editText, (TextView) null, 20, 10, false, new C14231j(this), 16, (Object) null);
        this.f39740u = this.f39726d.findViewById(C0966R.C0970id.f6188zr);
        this.f39741v = (TextView) this.f39726d.findViewById(C0966R.C0970id.f6191zv);
        View findViewById3 = this.f39726d.findViewById(C0966R.C0970id.bjd);
        this.f39730h = findViewById3;
        EditText editText2 = findViewById3 != null ? (EditText) findViewById3.findViewById(C0966R.C0970id.bk_) : null;
        this.f39731i = editText2;
        C62042e eVar2 = eVar;
        C62042e.m72802O1(eVar2, editText2, (TextView) null, 20, 10, false, new C14232k(this), 16, (Object) null);
        this.f39742w = (RelativeLayout) this.f39726d.findViewById(C0966R.C0970id.ca8);
        EditText editText3 = (EditText) this.f39726d.findViewById(C0966R.C0970id.cab);
        this.f39743x = editText3;
        C62042e.m72802O1(eVar2, editText3, (TextView) null, 8, 4, false, new C14233l(this), 16, (Object) null);
        this.f39744y = (RelativeLayout) this.f39726d.findViewById(C0966R.C0970id.lqg);
        EditText editText4 = (EditText) this.f39726d.findViewById(C0966R.C0970id.lqk);
        this.f39745z = editText4;
        C62042e.m72802O1(eVar2, editText4, (TextView) null, 8, 4, false, new C14234m(this), 16, (Object) null);
        this.f39716A = this.f39726d.findViewById(C0966R.C0970id.f357845c22);
        EditText editText5 = (EditText) this.f39726d.findViewById(C0966R.C0970id.c2k);
        this.f39717B = editText5;
        C62042e.m72802O1(eVar2, editText5, (TextView) null, 20, 10, false, new C14235n(this), 16, (Object) null);
        this.f39719D = this.f39726d.findViewById(C0966R.C0970id.f357757bl3);
        TextView textView3 = (TextView) this.f39726d.findViewById(C0966R.C0970id.f357756bl2);
        this.f39718C = textView3;
        if (i == 1 && textView3 != null) {
            textView3.setText(this.f39727e.getContext().getResources().getString(C0966R.string.mnu));
        }
        TextView textView4 = this.f39718C;
        C85875k4.m106189j0(textView4 != null ? textView4.getPaint() : null, 0.8f);
        C14210f.C14211a.m13552a(this, false, 0, 2, (Object) null);
        this.f39726d.findViewById(C0966R.C0970id.nan).setOnClickListener(new C14236o(this));
        this.f39720E = (CheckBox) this.f39726d.findViewById(C0966R.C0970id.nam);
        TextView textView5 = (TextView) this.f39726d.findViewById(C0966R.C0970id.nao);
        C87412m.m108593f(textView5, "this");
        String string2 = textView5.getContext().getResources().getString(C0966R.string.mnq);
        C87412m.m108593f(string2, "tv.context.resources.get…ive_lottery_license_desc)");
        String string3 = textView5.getContext().getResources().getString(C0966R.string.mnp);
        C87412m.m108593f(string3, "tv.context.resources.get…der_live_lottery_license)");
        String format2 = String.format(string3, Arrays.copyOf(new Object[]{string2}, 1));
        C87412m.m108593f(format2, "format(format, *args)");
        int E = C112550d0.m153769E(format2, string2, 0, false, 6, (Object) null);
        SpannableString spannableString = new SpannableString(format2);
        spannableString.setSpan(new C14244q(new WeakReference(this.f39727e)), E, string2.length() + E, 33);
        textView5.setHighlightColor(textView5.getContext().getResources().getColor(17170445));
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        textView5.setText(spannableString);
        CheckBox checkBox2 = this.f39720E;
        if (checkBox2 != null) {
            checkBox2.setOnCheckedChangeListener(new C14222a(this));
        }
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_LOTTERY_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) f).booleanValue() && (checkBox = this.f39720E) != null) {
            checkBox.setChecked(true);
        }
        View view2 = this.f39740u;
        if (view2 != null) {
            view2.setOnClickListener(new C14223b(this));
        }
        RelativeLayout relativeLayout = this.f39742w;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C14224c(this));
        }
        RelativeLayout relativeLayout2 = this.f39744y;
        if (relativeLayout2 != null) {
            relativeLayout2.setOnClickListener(new C14225d(this));
        }
        View view3 = this.f39716A;
        if (view3 != null) {
            view3.setOnClickListener(new C14226e(this));
        }
        View view4 = this.f39730h;
        if (view4 != null) {
            view4.setOnClickListener(new C14227f(this));
        }
        TextView textView6 = this.f39718C;
        if (textView6 != null) {
            textView6.setOnClickListener(new C14228g(this));
        }
        C14209e eVar3 = this.f39728f;
        if (eVar3 != null) {
            C14205c.C14206a Q = eVar3.mo13588Q();
            if (Q != null) {
                mo13612x(Q);
            }
            EditText editText6 = this.f39743x;
            if (editText6 != null) {
                editText6.setHint(String.valueOf(eVar3.mo13593h0()));
            }
            MMSwitchBtn mMSwitchBtn2 = this.f39734o;
            if (mMSwitchBtn2 != null) {
                mMSwitchBtn2.setCheck(eVar3.mo13586H());
            }
        }
        View view5 = this.f39735p;
        if (view5 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethod", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethod", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo13611v(str2);
    }

    public void destroy() {
        C101218e0 e0Var = this.f39721F;
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        C101218e0 e0Var2 = this.f39722G;
        if (e0Var2 != null) {
            e0Var2.mo140680z();
        }
        C62042e.f176370a.mo87021L0(this.f39727e);
    }

    public MMFragmentActivity getActivity() {
        return this.f39727e;
    }

    /* renamed from: j0 */
    public void mo13603j0(boolean z, int i) {
        EditText editText = this.f39717B;
        boolean z2 = false;
        boolean z3 = (!(String.valueOf(editText != null ? editText.getText() : null).length() == 0)) & z;
        CheckBox checkBox = this.f39720E;
        if (checkBox != null && checkBox.isChecked()) {
            z2 = true;
        }
        boolean z4 = z3 & z2;
        Log.m105924i("FinderLiveLotteryCreateViewCallback", "updateConfirmBtn canConfirm:" + z + " canConfirmResult:" + z4 + ",source:" + i);
        TextView textView = this.f39718C;
        if (textView != null) {
            textView.setEnabled(z4);
        }
        TextView textView2 = this.f39718C;
        if (z4) {
            if (C85875k4.m106211z()) {
                if (textView2 != null) {
                    textView2.setTextColor(this.f39726d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
                }
            } else if (textView2 != null) {
                textView2.setTextColor(this.f39726d.getContext().getResources().getColor(C0966R.color.f2975b6));
            }
        } else if (C85875k4.m106211z()) {
            if (textView2 != null) {
                textView2.setTextColor(this.f39726d.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_2));
            }
        } else if (textView2 != null) {
            textView2.setTextColor(this.f39726d.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2));
        }
    }

    /* renamed from: t0 */
    public void mo13604t0(int i, int i2, String str, C50189kx0 kx02) {
        C48779ay0 ay02;
        StringBuilder sb = new StringBuilder();
        sb.append("showErrMsg errorPage is empty:");
        C48779ay0 ay03 = null;
        sb.append((kx02 != null ? kx02.f137078e : null) == null);
        sb.append(",type:");
        sb.append((kx02 == null || (ay02 = kx02.f137078e) == null) ? null : Integer.valueOf(ay02.f130840d));
        sb.append(",errMsg:");
        sb.append(str);
        Log.m105924i("FinderLiveLotteryCreateViewCallback", sb.toString());
        if (kx02 != null) {
            ay03 = kx02.f137078e;
        }
        if (ay03 == null) {
            MMActivity mMActivity = this.f39727e;
            if (str == null) {
                str = this.f39726d.getResources().getString(C0966R.string.dk8);
                C87412m.m108593f(str, "rootView.resources.getSt…live_create_lottery_fail)");
            }
            C76912y0.m92773l(mMActivity, str);
            return;
        }
        C48779ay0 ay04 = kx02.f137078e;
        if (ay04 != null) {
            String string = this.f39726d.getResources().getString(C0966R.string.dk8);
            C87412m.m108593f(string, "rootView.resources.getSt…live_create_lottery_fail)");
            C61926c.m72668M(new C13073q0(ay04, string, new C14237p(this, i2)));
        }
    }

    /* renamed from: v */
    public final void mo13611v(String str) {
        View view = this.f39735p;
        if (view != null && view.getVisibility() == 0) {
            if (C87412m.m108589b(str, this.f39727e.getContext().getResources().getString(C0966R.string.mnf))) {
                View view2 = this.f39738s;
                if (view2 != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
        }
        View view4 = this.f39738s;
        if (view4 != null) {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkClaimMethodContentVisible", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: x */
    public final void mo13612x(C14205c.C14206a aVar) {
        C14205c.C14206a aVar2 = aVar;
        TextView textView = this.f39741v;
        if (textView != null) {
            textView.setText(aVar2.f39672a);
        }
        if (C87412m.m108589b(aVar2.f39672a, MMApplicationContext.getResources().getString(C0966R.string.dt4))) {
            View view = this.f39730h;
            if (view != null) {
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        View view3 = this.f39730h;
        if (view3 != null) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback", "checkCommentContentGroupVisibility", "(Lcom/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateConfig$LotteryClaimPrizeItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
