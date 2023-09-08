package wg1;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54768h6;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.C4239z4;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import il1.C46265l0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ok1.C62042e;
import rx3.C13598b0;

/* renamed from: wg1.w0 */
public final class C66098w0 implements C66082t0, View.OnClickListener {

    /* renamed from: d */
    public final View f190005d;

    /* renamed from: e */
    public final MMActivity f190006e;

    /* renamed from: f */
    public final C66075s0 f190007f;

    /* renamed from: g */
    public View f190008g;

    /* renamed from: h */
    public View f190009h;

    /* renamed from: i */
    public View f190010i;

    /* renamed from: j */
    public EditText f190011j;

    /* renamed from: n */
    public WeImageView f190012n;

    /* renamed from: o */
    public WxRecyclerView f190013o;

    /* renamed from: p */
    public C4239z4 f190014p;

    /* renamed from: wg1.w0$a */
    public static final class C66099a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66098w0 f190015d;

        public C66099a(C66098w0 w0Var) {
            this.f190015d = w0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorSearchMusicViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C66098w0 w0Var = this.f190015d;
            C66098w0.m77895p(w0Var, w0Var.f190011j);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorSearchMusicViewCallback$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: wg1.w0$b */
    public static final class C66100b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66098w0 f190016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66100b(C66098w0 w0Var) {
            super(0);
            this.f190016d = w0Var;
        }

        public Object invoke() {
            String str;
            Editable text;
            EditText editText = this.f190016d.f190011j;
            if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                WeImageView weImageView = this.f190016d.f190012n;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
            } else {
                C66075s0 s0Var = this.f190016d.f190007f;
                if (s0Var != null) {
                    s0Var.mo90114R(str);
                }
                WeImageView weImageView2 = this.f190016d.f190012n;
                if (weImageView2 != null) {
                    weImageView2.setVisibility(0);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.w0$c */
    public static final class C66101c implements TextView.OnEditorActionListener {

        /* renamed from: d */
        public final /* synthetic */ C66098w0 f190017d;

        public C66101c(C66098w0 w0Var) {
            this.f190017d = w0Var;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            C66098w0 w0Var = this.f190017d;
            w0Var.mo90144v(w0Var.f190011j);
            return false;
        }
    }

    /* renamed from: wg1.w0$d */
    public static final class C66102d extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66098w0 f190018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66102d(C66098w0 w0Var) {
            super(1);
            this.f190018d = w0Var;
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            C66075s0 s0Var = this.f190018d.f190007f;
            if (s0Var != null) {
                s0Var.mo90113P();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.w0$e */
    public static final class C66103e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66098w0 f190019d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66103e(C66098w0 w0Var) {
            super(0);
            this.f190019d = w0Var;
        }

        public Object invoke() {
            C66075s0 s0Var = this.f190019d.f190007f;
            if (s0Var != null) {
                s0Var.mo90119w0();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.w0$f */
    public static final class C66104f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66098w0 f190020d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66104f(C66098w0 w0Var) {
            super(0);
            this.f190020d = w0Var;
        }

        public Object invoke() {
            C66075s0 s0Var = this.f190020d.f190007f;
            if (s0Var != null) {
                s0Var.mo90119w0();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.w0$g */
    public static final class C66105g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66098w0 f190021d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66105g(C66098w0 w0Var) {
            super(0);
            this.f190021d = w0Var;
        }

        public Object invoke() {
            RecyclerView.C16613e adapter;
            C66098w0 w0Var = this.f190021d;
            C66098w0.m77895p(w0Var, w0Var.f190011j);
            WxRecyclerView wxRecyclerView = this.f190021d.f190013o;
            if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
                adapter.notifyDataSetChanged();
            }
            return C13598b0.f38549a;
        }
    }

    public C66098w0(View view, MMActivity mMActivity, C66075s0 s0Var) {
        C87412m.m108594g(view, "root");
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f190005d = view;
        this.f190006e = mMActivity;
        this.f190007f = s0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r2.getContext();
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m77895p(wg1.C66098w0 r1, android.widget.EditText r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66098w0.m77895p(wg1.w0, android.widget.EditText):void");
    }

    /* renamed from: X */
    public void mo90129X(List<C54768h6> list) {
        C87412m.m108594g(list, "suggestList");
        WxRecyclerView wxRecyclerView = this.f190013o;
        if (wxRecyclerView != null) {
            wxRecyclerView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo90130a() {
        View findViewById = this.f190005d.findViewById(C0966R.C0970id.dd9);
        this.f190008g = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        View findViewById2 = this.f190005d.findViewById(C0966R.C0970id.dd_);
        this.f190009h = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this);
        }
        View findViewById3 = this.f190005d.findViewById(C0966R.C0970id.j6f);
        this.f190010i = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this);
        }
        View view = this.f190010i;
        if (view != null) {
            C62042e.m72803Q1(C62042e.f176370a, view, 0, 0, 6, (Object) null);
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f190005d.findViewById(C0966R.C0970id.j6i);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C66099a(this));
        }
        EditText editText = (EditText) this.f190005d.findViewById(C0966R.C0970id.j6j);
        this.f190011j = editText;
        C62042e.m72802O1(C62042e.f176370a, editText, (TextView) null, 200, 100, false, new C66100b(this), 16, (Object) null);
        EditText editText2 = this.f190011j;
        if (editText2 != null) {
            editText2.setOnEditorActionListener(new C66101c(this));
        }
        WeImageView weImageView = (WeImageView) this.f190005d.findViewById(C0966R.C0970id.j6g);
        this.f190012n = weImageView;
        if (weImageView != null) {
            weImageView.setVisibility(0);
        }
        WeImageView weImageView2 = this.f190012n;
        if (weImageView2 != null) {
            weImageView2.setOnClickListener(this);
        }
        View findViewById4 = this.f190005d.findViewById(C0966R.C0970id.du5);
        C87412m.m108593f(findViewById4, "root.findViewById<Relati…inder_live_music_rv_root)");
        C46265l0 l0Var = new C46265l0((ViewGroup) findViewById4, this.f190007f, new C66102d(this));
        this.f190013o = l0Var.f124715d;
        this.f190014p = new C4239z4();
        ViewGroup viewGroup = l0Var.f124712a;
        if (viewGroup != null) {
            viewGroup.setPadding(0, 0, 0, C75044y4.m89991c(this.f190005d.getContext()));
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f190006e;
    }

    /* renamed from: j */
    public void mo90131j() {
        C4239z4 z4Var = this.f190014p;
        if (z4Var != null) {
            z4Var.mo5105b(this.f190005d, new C66105g(this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r8)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorSearchMusicViewCallback"
            java.lang.String r2 = "android/view/View$OnClickListener"
            java.lang.String r3 = "onClick"
            java.lang.String r4 = "(Landroid/view/View;)V"
            r5 = r7
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            r0 = 0
            if (r8 == 0) goto L_0x0027
            int r8 = r8.getId()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0028
        L_0x0027:
            r8 = r0
        L_0x0028:
            r1 = 2131303086(0x7f091aae, float:1.8224276E38)
            java.lang.String r2 = ""
            if (r8 != 0) goto L_0x0031
            goto L_0x00d9
        L_0x0031:
            int r3 = r8.intValue()
            if (r3 != r1) goto L_0x00d9
            wg1.s0 r8 = r7.f190007f
            if (r8 == 0) goto L_0x003e
            r8.hide()
        L_0x003e:
            android.widget.EditText r8 = r7.f190011j
            r7.mo90144v(r8)
            android.widget.EditText r8 = r7.f190011j
            if (r8 == 0) goto L_0x004a
            r8.setText(r2)
        L_0x004a:
            com.tencent.mm.plugin.finder.view.z4 r8 = r7.f190014p
            if (r8 == 0) goto L_0x011a
            android.view.View r1 = r7.f190005d
            wg1.w0$e r2 = new wg1.w0$e
            r2.<init>(r7)
            java.lang.String r3 = "view"
            gy3.C87412m.m108594g(r1, r3)
            android.animation.ObjectAnimator r3 = r8.f18560e
            if (r3 == 0) goto L_0x0091
            java.lang.Object r3 = r3.getTarget()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L_0x006a
            r0 = r3
            android.view.View r0 = (android.view.View) r0
        L_0x006a:
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x0091
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "slideToBottomAnim view:"
            r0.append(r3)
            int r3 = r1.hashCode()
            r0.append(r3)
            java.lang.String r3 = " reuseAnim"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FinderLiveSlideAnimHelper"
            r8.mo5104a(r3, r0)
            goto L_0x00c9
        L_0x0091:
            r0 = 2
            float[] r0 = new float[r0]
            r3 = 0
            r4 = 0
            r0[r3] = r4
            r3 = 1
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r4 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r4)
            int r4 = r4.y
            float r4 = (float) r4
            r0[r3] = r4
            java.lang.String r3 = "translationY"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r1, r3, r0)
            r8.f18560e = r0
            com.tencent.mm.plugin.finder.view.o8 r0 = r8.f18561f
            if (r0 != 0) goto L_0x00b8
            com.tencent.mm.plugin.finder.view.o8 r0 = new com.tencent.mm.plugin.finder.view.o8
            r0.<init>()
        L_0x00b8:
            r8.f18561f = r0
            android.animation.ObjectAnimator r3 = r8.f18560e
            if (r3 == 0) goto L_0x00c1
            r3.addListener(r0)
        L_0x00c1:
            android.animation.ObjectAnimator r0 = r8.f18560e
            if (r0 != 0) goto L_0x00c6
            goto L_0x00c9
        L_0x00c6:
            r0.setTarget(r1)
        L_0x00c9:
            com.tencent.mm.plugin.finder.view.o8 r0 = r8.f18561f
            if (r0 == 0) goto L_0x00d1
            r0.f18364d = r1
            r0.f18365e = r2
        L_0x00d1:
            android.animation.ObjectAnimator r8 = r8.f18560e
            if (r8 == 0) goto L_0x011a
            r8.start()
            goto L_0x011a
        L_0x00d9:
            r0 = 2131312944(0x7f094130, float:1.824427E38)
            if (r8 != 0) goto L_0x00df
            goto L_0x0107
        L_0x00df:
            int r1 = r8.intValue()
            if (r1 != r0) goto L_0x0107
            wg1.s0 r8 = r7.f190007f
            if (r8 == 0) goto L_0x00ec
            r8.mo90116Z()
        L_0x00ec:
            android.widget.EditText r8 = r7.f190011j
            r7.mo90144v(r8)
            android.widget.EditText r8 = r7.f190011j
            if (r8 == 0) goto L_0x00f8
            r8.setText(r2)
        L_0x00f8:
            com.tencent.mm.plugin.finder.view.z4 r8 = r7.f190014p
            if (r8 == 0) goto L_0x011a
            android.view.View r0 = r7.f190005d
            wg1.w0$f r1 = new wg1.w0$f
            r1.<init>(r7)
            r8.mo5106c(r0, r1)
            goto L_0x011a
        L_0x0107:
            r0 = 2131312945(0x7f094131, float:1.8244273E38)
            if (r8 != 0) goto L_0x010d
            goto L_0x011a
        L_0x010d:
            int r8 = r8.intValue()
            if (r8 != r0) goto L_0x011a
            android.widget.EditText r8 = r7.f190011j
            if (r8 == 0) goto L_0x011a
            r8.setText(r2)
        L_0x011a:
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/component/FinderLiveAnchorSearchMusicViewCallback"
            java.lang.String r0 = "android/view/View$OnClickListener"
            java.lang.String r1 = "onClick"
            java.lang.String r2 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r7, r8, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66098w0.onClick(android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r4.getContext();
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90144v(android.widget.EditText r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0010
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x0010
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            goto L_0x0011
        L_0x0010:
            r1 = r0
        L_0x0011:
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            if (r1 == 0) goto L_0x001f
            if (r4 == 0) goto L_0x001b
            android.os.IBinder r0 = r4.getWindowToken()
        L_0x001b:
            r4 = 0
            r1.hideSoftInputFromWindow(r0, r4)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg1.C66098w0.mo90144v(android.widget.EditText):void");
    }
}
