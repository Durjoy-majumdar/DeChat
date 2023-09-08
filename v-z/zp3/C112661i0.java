package zp3;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.C106853e;
import com.tencent.p014mm.view.PhotoEditText;
import com.tencent.p014mm.view.TextModeSelectView;
import com.tencent.p014mm.view.footer.SelectColorBar;
import cq3.C106952a;
import cq3.C106961g;
import eq3.C107283a;
import eq3.C107288d;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104101k;
import p248ug.C111167t;
import p248ug.C111168v;
import p248ug.C78160t0;
import rx3.C13604l;
import sx3.C64197v;
import sx3.C90364q0;

/* renamed from: zp3.i0 */
public final class C112661i0 extends C106853e {

    /* renamed from: x */
    public float f337358x;

    /* renamed from: zp3.i0$e */
    public static final class C66956e implements View.OnClickListener {

        /* renamed from: d */
        public static final C66956e f192358d = new C66956e();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zp3.i0$a */
    public static final class C112662a implements TextModeSelectView.C97327a {

        /* renamed from: a */
        public final /* synthetic */ SelectColorBar f337359a;

        /* renamed from: b */
        public final /* synthetic */ C112661i0 f337360b;

        public C112662a(SelectColorBar selectColorBar, C112661i0 i0Var) {
            this.f337359a = selectColorBar;
            this.f337360b = i0Var;
        }

        /* renamed from: a */
        public void mo136442a(int i) {
            boolean z = false;
            if (i == 3) {
                SelectColorBar selectColorBar = this.f337359a;
                Object tag = this.f337360b.f319944u.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
                selectColorBar.setSelectColor(((Integer) tag).intValue());
                C112661i0 i0Var = this.f337360b;
                PhotoEditText photoEditText = i0Var.f319943t;
                Object tag2 = i0Var.f319944u.getTag();
                C87412m.m108592e(tag2, "null cannot be cast to non-null type kotlin.Int");
                photoEditText.setTextBackground(((Integer) tag2).intValue());
            } else {
                this.f337360b.f319944u.setTag(Integer.valueOf(this.f337359a.getCurColor()));
                this.f337360b.f319943t.setTextBackground(0);
            }
            PhotoEditText photoEditText2 = this.f337360b.f319943t;
            if (i == 2) {
                z = true;
            }
            photoEditText2.setEnableStoke(z);
        }
    }

    /* renamed from: zp3.i0$b */
    public static final class C112663b implements SelectColorBar.C106865a {

        /* renamed from: a */
        public final /* synthetic */ C112661i0 f337361a;

        public C112663b(C112661i0 i0Var) {
            this.f337361a = i0Var;
        }

        /* renamed from: b */
        public final void mo154869b(int i) {
            if (this.f337361a.f319944u.getCurMode() == 3) {
                this.f337361a.f319944u.setTag(Integer.valueOf(i));
                this.f337361a.f319943t.setTextBackground(i);
                return;
            }
            this.f337361a.f319943t.setTextColor(i);
        }
    }

    /* renamed from: zp3.i0$c */
    public static final class C112664c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112661i0 f337362d;

        public C112664c(C112661i0 i0Var) {
            this.f337362d = i0Var;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Animation animation = this.f337362d.getTextEditView().getAnimation();
            if (animation == null || !animation.hasStarted() || this.f337362d.getTextEditView().getAnimation().hasEnded()) {
                this.f337362d.getTextEditView().clearFocus();
                if (this.f337362d.getTextEditView().getVisibility() == 0) {
                    Editable text = this.f337362d.f319943t.getText();
                    String obj = text != null ? text.toString() : null;
                    C109623f presenter = this.f337362d.getPresenter();
                    int currentTextColor = this.f337362d.f319943t.getCurrentTextColor();
                    boolean z = false;
                    if (this.f337362d.f319944u.getCurMode() == 3) {
                        Object tag = this.f337362d.f319944u.getTag();
                        C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.Int");
                        i = ((Integer) tag).intValue();
                    } else {
                        i = 0;
                    }
                    boolean z2 = this.f337362d.f319944u.getCurMode() == 2;
                    C112661i0 i0Var = this.f337362d;
                    ((C109612c) presenter).mo160831o(obj, currentTextColor, i, "", z2, i0Var.f337358x, false, false, ((C109612c) i0Var.getPresenter()).f328159b.f332928e.width());
                    if (this.f337362d.getContext() instanceof MMActivity) {
                        if (obj == null || obj.length() == 0) {
                            z = true;
                        }
                        if (!z) {
                            Context context = this.f337362d.getContext();
                            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                            ((MMActivity) context).hideVKB();
                        }
                    }
                } else {
                    C111168v vVar = ((C109612c) this.f337362d.getPresenter()).f328162e;
                    if (vVar != null) {
                        vVar.onFinish();
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C117292a.m165361g(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zp3.i0$d */
    public static final class C112665d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C112661i0 f337363d;

        public C112665d(C112661i0 i0Var) {
            this.f337363d = i0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f337363d.getTextEditView().clearFocus();
            if (this.f337363d.getTextEditView().getVisibility() == 0) {
                C109612c cVar = (C109612c) this.f337363d.getPresenter();
                cVar.f328158a.setFooterVisible(true);
                cVar.mo160834r(false);
                if (this.f337363d.getContext() instanceof MMActivity) {
                    Context context = this.f337363d.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((MMActivity) context).hideVKB();
                }
            } else {
                C111168v vVar = ((C109612c) this.f337363d.getPresenter()).f328162e;
                if (vVar != null) {
                    vVar.mo79182o0();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/view/VideoCoverDrawingView$getTextEditView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C112661i0(Context context) {
        super(context);
    }

    /* renamed from: a */
    public C106952a mo154838a() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C109623f presenter = getPresenter();
        C87412m.m108593f(presenter, "presenter");
        return new C106961g(context, presenter);
    }

    /* renamed from: b */
    public C107283a mo154839b() {
        return new C107288d(getContext(), getPresenter());
    }

    /* renamed from: d */
    public void mo154841d() {
        ((C109612c) getPresenter()).mo160826j(getConfig());
        removeAllViews();
        getTextEditView();
        this.f337358x = MMApplicationContext.getResources().getDimension(C0966R.dimen.f3749d0);
        ViewGroup.LayoutParams layoutParams = getRubbishView().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(C0966R.dimen.f3766df);
        View rubbishView = getRubbishView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(rubbishView, aVar.mo10232b(), "com/tencent/mm/view/VideoCoverDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rubbishView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(rubbishView, "com/tencent/mm/view/VideoCoverDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(getRubbishView(), layoutParams2);
        addView(getBaseBoardView(), new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, (int) getResources().getDimension(C0966R.dimen.a5p));
        layoutParams3.gravity = 80;
        addView(getFooterBg(), layoutParams3);
        addView(getBaseFooterView(), layoutParams3);
        addView(getTextEditView(), new FrameLayout.LayoutParams(-1, -1));
        View textEditView = getTextEditView();
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view = textEditView;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/view/VideoCoverDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textEditView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/view/VideoCoverDrawingView", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, C78160t0.m94370a(getContext()));
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin += C75044y4.m89991c(getContext());
        getBaseFooterView().setVisibility(8);
        C109623f presenter = getPresenter();
        if (presenter != null) {
            C104101k kVar = (C104101k) ((C109612c) presenter).mo160818b(C111167t.TEXT);
            if (kVar != null) {
                kVar.f307960A = true;
                kVar.f307963D = true;
            }
        }
    }

    public C111167t[] getFeatures() {
        if (this.f319933g == null) {
            this.f319933g = new C111167t[]{C111167t.TEXT};
        }
        C111167t[] tVarArr = this.f319933g;
        C87412m.m108593f(tVarArr, "mFeaturesTypes");
        return tVarArr;
    }

    public View getRubbishView() {
        if (this.f319937n == null) {
            this.f319938o = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d3i, this, false);
        }
        View view = this.f319938o;
        C87412m.m108593f(view, "mRubbishView");
        return view;
    }

    public View getTextEditView() {
        if (this.f319937n == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d3h, (ViewGroup) null);
            this.f319937n = inflate;
            View findViewById = inflate.findViewById(C0966R.C0970id.ki7);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.PhotoEditText");
            this.f319943t = (PhotoEditText) findViewById;
            View findViewById2 = this.f319937n.findViewById(C0966R.C0970id.cbc);
            C87412m.m108592e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
            this.f319941r = (Button) findViewById2;
            View findViewById3 = this.f319937n.findViewById(C0966R.C0970id.cb9);
            C87412m.m108592e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
            this.f319942s = (Button) findViewById3;
            View findViewById4 = this.f319937n.findViewById(C0966R.C0970id.j9j);
            C87412m.m108592e(findViewById4, "null cannot be cast to non-null type com.tencent.mm.view.footer.SelectColorBar");
            SelectColorBar selectColorBar = (SelectColorBar) findViewById4;
            this.f319943t.setTextColor(-1);
            View findViewById5 = this.f319937n.findViewById(C0966R.C0970id.a8q);
            C87412m.m108592e(findViewById5, "null cannot be cast to non-null type com.tencent.mm.view.TextModeSelectView");
            TextModeSelectView textModeSelectView = (TextModeSelectView) findViewById5;
            this.f319944u = textModeSelectView;
            textModeSelectView.setTag(-707825);
            this.f319944u.setMode((List<Integer>) C64197v.m75537f(1, 2, 3));
            this.f319944u.setModeResourceMap(C90364q0.m113147f(new C13604l(1, Integer.valueOf(C0966R.raw.icons_filled_text_style1)), new C13604l(2, Integer.valueOf(C0966R.raw.icons_filled_text_style2)), new C13604l(3, Integer.valueOf(C0966R.raw.icons_filled_text_style3))));
            this.f319944u.setColorFilter(-1);
            this.f319944u.setModeChangeListener(new C112662a(selectColorBar, this));
            selectColorBar.setSelectColor(-1);
            selectColorBar.setSelectColorListener(new C112663b(this));
            this.f319941r.setOnClickListener(new C112664c(this));
            this.f319942s.setOnClickListener(new C112665d(this));
            this.f319937n.setOnClickListener(C66956e.f192358d);
        }
        View view = this.f319937n;
        C87412m.m108593f(view, "mTextEditView");
        return view;
    }
}
