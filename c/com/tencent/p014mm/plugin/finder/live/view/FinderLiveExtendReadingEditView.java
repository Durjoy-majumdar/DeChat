package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C7798f1;
import fy3.C32224a;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import i33.C98595b;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;
import te3.C51575uo1;
import z04.C112551y;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cB%\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001eR>\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/ui/tools/t0;", "Lkotlin/Function3;", "", "", "Lte3/uo1;", "Lrx3/b0;", "p", "Lfy3/q;", "getOnSuccData", "()Lfy3/q;", "setOnSuccData", "(Lfy3/q;)V", "onSuccData", "Lkotlin/Function0;", "q", "Lfy3/a;", "getOnDimissListener", "()Lfy3/a;", "setOnDimissListener", "(Lfy3/a;)V", "onDimissListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView */
public final class FinderLiveExtendReadingEditView extends RelativeLayout implements C7020t0 {

    /* renamed from: s */
    public static final /* synthetic */ int f159709s = 0;

    /* renamed from: d */
    public final String f159710d = "Finder.FinderExtendReadingEditView";

    /* renamed from: e */
    public View f159711e;

    /* renamed from: f */
    public TextView f159712f;

    /* renamed from: g */
    public TextView f159713g;

    /* renamed from: h */
    public MMEditText f159714h;

    /* renamed from: i */
    public TextView f159715i;

    /* renamed from: j */
    public View f159716j;

    /* renamed from: n */
    public int f159717n = 1;

    /* renamed from: o */
    public KeyboardHeightProvider f159718o;

    /* renamed from: p */
    public C32228q<? super Integer, ? super String, ? super C51575uo1, C13598b0> f159719p;

    /* renamed from: q */
    public C32224a<C13598b0> f159720q;

    /* renamed from: r */
    public View f159721r;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView$a */
    public static final class C56011a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveExtendReadingEditView f159722d;

        /* renamed from: e */
        public final /* synthetic */ String f159723e;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView$a$a */
        public static final class C56012a extends C87413o implements C32229r<Integer, String, String, C51575uo1, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ String f159724d;

            /* renamed from: e */
            public final /* synthetic */ FinderLiveExtendReadingEditView f159725e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56012a(String str, FinderLiveExtendReadingEditView finderLiveExtendReadingEditView) {
                super(4);
                this.f159724d = str;
                this.f159725e = finderLiveExtendReadingEditView;
            }

            /* renamed from: I */
            public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
                String str = (String) obj3;
                C87412m.m108594g(str, "link");
                String str2 = this.f159724d;
                FinderLiveExtendReadingEditView finderLiveExtendReadingEditView = this.f159725e;
                C61926c.m72668M(new C56068i0(((Number) obj).intValue(), str2, str, finderLiveExtendReadingEditView, (C51575uo1) obj4, (String) obj2));
                return C13598b0.f38549a;
            }
        }

        public C56011a(FinderLiveExtendReadingEditView finderLiveExtendReadingEditView, String str) {
            this.f159722d = finderLiveExtendReadingEditView;
            this.f159723e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveExtendReadingEditView finderLiveExtendReadingEditView = this.f159722d;
            int i = finderLiveExtendReadingEditView.f159717n;
            int i2 = FinderLiveExtendReadingEditView.f159709s;
            int i3 = 1;
            if (i != 1 && i == 2) {
                i3 = 4;
            }
            String str = this.f159723e;
            C56012a aVar = new C56012a(str, finderLiveExtendReadingEditView);
            C87412m.m108594g(str, "link");
            ((C119157j) C119157j.f356862d).mo183875f(new C7798f1(str, i3, aVar));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$checkEnableAdd$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView$b */
    public static final class C56013b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveExtendReadingEditView f159726d;

        public C56013b(FinderLiveExtendReadingEditView finderLiveExtendReadingEditView) {
            this.f159726d = finderLiveExtendReadingEditView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f159726d.mo77902b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView$c */
    public static final class C56014c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveExtendReadingEditView f159727d;

        public C56014c(FinderLiveExtendReadingEditView finderLiveExtendReadingEditView) {
            this.f159727d = finderLiveExtendReadingEditView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f159727d.mo77902b();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView$d */
    public static final class C56015d implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveExtendReadingEditView f159728d;

        public C56015d(FinderLiveExtendReadingEditView finderLiveExtendReadingEditView) {
            this.f159728d = finderLiveExtendReadingEditView;
        }

        public void afterTextChanged(Editable editable) {
            if (!(String.valueOf(editable).length() == 0)) {
                TextView textView = this.f159728d.f159715i;
                if (textView != null) {
                    textView.setVisibility(4);
                } else {
                    C87412m.m108603p("tipsTv");
                    throw null;
                }
            }
            this.f159728d.mo77901a();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView$e */
    public static final class C56016e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveExtendReadingEditView f159729d;

        /* renamed from: e */
        public final /* synthetic */ String f159730e;

        public C56016e(FinderLiveExtendReadingEditView finderLiveExtendReadingEditView, String str) {
            this.f159729d = finderLiveExtendReadingEditView;
            this.f159730e = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMEditText mMEditText = this.f159729d.f159714h;
            if (mMEditText != null) {
                mMEditText.setText(this.f159730e);
                TextView textView = this.f159729d.f159715i;
                if (textView != null) {
                    textView.setVisibility(4);
                    MMEditText mMEditText2 = this.f159729d.f159714h;
                    if (mMEditText2 == null) {
                        C87412m.m108603p("urlEditText");
                        throw null;
                    } else if (mMEditText2 != null) {
                        mMEditText2.setSelection(mMEditText2.getText().length());
                        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditView$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    } else {
                        C87412m.m108603p("urlEditText");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("tipsTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("urlEditText");
                throw null;
            }
        }
    }

    public FinderLiveExtendReadingEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo77903c();
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        View view = this.f159721r;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            int c = C75044y4.m89991c(getContext()) + i;
            if (i > 0 && layoutParams2.bottomMargin != c) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, c});
                ofInt.setDuration(200);
                ofInt.addUpdateListener(new C56078k0(this, ofInt));
                ofInt.start();
            } else if (i == 0) {
                View view2 = this.f159721r;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                    C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = C75044y4.m89991c(getContext());
                    View view3 = this.f159721r;
                    if (view3 != null) {
                        view3.requestLayout();
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("contentView");
                    throw null;
                }
            }
            setVisibility(0);
            return;
        }
        C87412m.m108603p("contentView");
        throw null;
    }

    /* renamed from: a */
    public final void mo77901a() {
        MMEditText mMEditText = this.f159714h;
        if (mMEditText != null) {
            String obj = mMEditText.getText().toString();
            if (!Util.isNullOrNil(obj)) {
                TextView textView = this.f159712f;
                if (textView != null) {
                    textView.setOnClickListener(new C56011a(this, obj));
                    TextView textView2 = this.f159712f;
                    if (textView2 != null) {
                        textView2.setTextColor(getResources().getColor(C0966R.color.f2975b6));
                        TextView textView3 = this.f159712f;
                        if (textView3 != null) {
                            textView3.setBackgroundResource(C0966R.C0969drawable.a1f);
                        } else {
                            C87412m.m108603p("addBtn");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("addBtn");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("addBtn");
                    throw null;
                }
            } else {
                TextView textView4 = this.f159712f;
                if (textView4 != null) {
                    textView4.setOnClickListener((View.OnClickListener) null);
                    TextView textView5 = this.f159712f;
                    if (textView5 != null) {
                        textView5.setTextColor(getResources().getColor(C0966R.color.BW_100_Alpha_0_2));
                        TextView textView6 = this.f159712f;
                        if (textView6 != null) {
                            textView6.setBackgroundResource(C0966R.C0969drawable.a1k);
                        } else {
                            C87412m.m108603p("addBtn");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("addBtn");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("addBtn");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("urlEditText");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo77902b() {
        KeyboardHeightProvider keyboardHeightProvider = this.f159718o;
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.mo104021d();
            Object systemService = getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            MMEditText mMEditText = this.f159714h;
            if (mMEditText != null) {
                inputMethodManager.hideSoftInputFromWindow(mMEditText.getWindowToken(), 0);
                View view = this.f159721r;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.bottomMargin = 0;
                    View view2 = this.f159721r;
                    if (view2 != null) {
                        view2.setLayoutParams(layoutParams2);
                        setVisibility(8);
                        C32224a<C13598b0> aVar = this.f159720q;
                        if (aVar != null) {
                            aVar.invoke();
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("contentView");
                    throw null;
                }
                C87412m.m108603p("contentView");
                throw null;
            }
            C87412m.m108603p("urlEditText");
            throw null;
        }
        C87412m.m108603p("keyboardHeightProvider");
        throw null;
    }

    /* renamed from: c */
    public final void mo77903c() {
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f359716ag0, this);
        View findViewById = inflate.findViewById(C0966R.C0970id.e6_);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.finder_promote_mp_close)");
        this.f159711e = findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.d8n);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.f…_extend_reading_edit_add)");
        this.f159712f = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.kpm);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.title_tv)");
        this.f159713g = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.idv);
        C87412m.m108593f(findViewById4, "view.findViewById(R.id.reading_layout)");
        this.f159721r = findViewById4;
        C98595b bVar = C98595b.f289089a;
        TextView textView = this.f159713g;
        if (textView != null) {
            bVar.mo137988f(textView);
            TextView textView2 = this.f159712f;
            if (textView2 != null) {
                bVar.mo137988f(textView2);
                View view = this.f159711e;
                if (view != null) {
                    bVar.mo137988f(view);
                    TextView textView3 = this.f159713g;
                    if (textView3 != null) {
                        C85875k4.m106189j0(textView3.getPaint(), 0.8f);
                        View findViewById5 = inflate.findViewById(C0966R.C0970id.d8q);
                        C87412m.m108593f(findViewById5, "view.findViewById(R.id.f…r_extend_reading_edit_et)");
                        this.f159714h = (MMEditText) findViewById5;
                        View findViewById6 = inflate.findViewById(C0966R.C0970id.d8r);
                        C87412m.m108593f(findViewById6, "view.findViewById(R.id.f…extend_reading_edit_tips)");
                        this.f159715i = (TextView) findViewById6;
                        View findViewById7 = inflate.findViewById(C0966R.C0970id.d8o);
                        C87412m.m108593f(findViewById7, "view.findViewById(R.id.f…r_extend_reading_edit_bg)");
                        this.f159716j = findViewById7;
                        View view2 = this.f159711e;
                        if (view2 != null) {
                            view2.setOnClickListener(new C56013b(this));
                            View view3 = this.f159716j;
                            if (view3 != null) {
                                view3.setOnClickListener(new C56014c(this));
                                MMEditText mMEditText = this.f159714h;
                                if (mMEditText != null) {
                                    mMEditText.addTextChangedListener(new C56015d(this));
                                    mo77904d();
                                    mo77901a();
                                    Context context = getContext();
                                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                                    KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider((MMActivity) context);
                                    this.f159718o = keyboardHeightProvider;
                                    keyboardHeightProvider.f220015b = this;
                                    return;
                                }
                                C87412m.m108603p("urlEditText");
                                throw null;
                            }
                            C87412m.m108603p("bgView");
                            throw null;
                        }
                        C87412m.m108603p("closeBtn");
                        throw null;
                    }
                    C87412m.m108603p("titleTv");
                    throw null;
                }
                C87412m.m108603p("closeBtn");
                throw null;
            }
            C87412m.m108603p("addBtn");
            throw null;
        }
        C87412m.m108603p("titleTv");
        throw null;
    }

    /* renamed from: d */
    public final void mo77904d() {
        TextView textView = this.f159715i;
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(C0966R.color.Link_100));
            TextView textView2 = this.f159715i;
            if (textView2 != null) {
                textView2.setOnClickListener((View.OnClickListener) null);
                if (!Util.isNullOrNil("")) {
                    if (!Util.isNullOrNil("") && (C112551y.m153819s("", "http", true) || C112551y.m153819s("", C113600ck.f339986i, true))) {
                        MMEditText mMEditText = this.f159714h;
                        if (mMEditText == null) {
                            C87412m.m108603p("urlEditText");
                            throw null;
                        } else if (C87412m.m108589b(mMEditText.getText().toString(), "")) {
                            TextView textView3 = this.f159715i;
                            if (textView3 != null) {
                                textView3.setVisibility(4);
                                TextView textView4 = this.f159715i;
                                if (textView4 != null) {
                                    textView4.setOnClickListener((View.OnClickListener) null);
                                    return;
                                } else {
                                    C87412m.m108603p("tipsTv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("tipsTv");
                                throw null;
                            }
                        } else {
                            TextView textView5 = this.f159715i;
                            if (textView5 != null) {
                                textView5.setVisibility(0);
                                TextView textView6 = this.f159715i;
                                if (textView6 != null) {
                                    textView6.setText(getContext().getString(C0966R.string.e4u, new Object[]{""}));
                                    TextView textView7 = this.f159715i;
                                    if (textView7 != null) {
                                        textView7.setOnClickListener(new C56016e(this, ""));
                                        return;
                                    } else {
                                        C87412m.m108603p("tipsTv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("tipsTv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("tipsTv");
                                throw null;
                            }
                        }
                    }
                }
                TextView textView8 = this.f159715i;
                if (textView8 != null) {
                    textView8.setVisibility(4);
                    TextView textView9 = this.f159715i;
                    if (textView9 != null) {
                        textView9.setOnClickListener((View.OnClickListener) null);
                    } else {
                        C87412m.m108603p("tipsTv");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("tipsTv");
                    throw null;
                }
            } else {
                C87412m.m108603p("tipsTv");
                throw null;
            }
        } else {
            C87412m.m108603p("tipsTv");
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo77905e(int i) {
        MMEditText mMEditText = this.f159714h;
        if (mMEditText != null) {
            mMEditText.setText("");
            this.f159717n = i;
            setVisibility(0);
            mo77904d();
            KeyboardHeightProvider keyboardHeightProvider = this.f159718o;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104022e();
                if (i == 2) {
                    TextView textView = this.f159713g;
                    if (textView != null) {
                        textView.setText(getContext().getString(C0966R.string.m4b));
                    } else {
                        C87412m.m108603p("titleTv");
                        throw null;
                    }
                } else if (i == 1) {
                    TextView textView2 = this.f159713g;
                    if (textView2 != null) {
                        textView2.setText(getContext().getString(C0966R.string.e4w));
                    } else {
                        C87412m.m108603p("titleTv");
                        throw null;
                    }
                }
                InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
                MMEditText mMEditText2 = this.f159714h;
                if (mMEditText2 != null) {
                    mMEditText2.postDelayed(new C56071j0(this, inputMethodManager), 100);
                } else {
                    C87412m.m108603p("urlEditText");
                    throw null;
                }
            } else {
                C87412m.m108603p("keyboardHeightProvider");
                throw null;
            }
        } else {
            C87412m.m108603p("urlEditText");
            throw null;
        }
    }

    public final C32224a<C13598b0> getOnDimissListener() {
        return this.f159720q;
    }

    public final C32228q<Integer, String, C51575uo1, C13598b0> getOnSuccData() {
        return this.f159719p;
    }

    public final void setOnDimissListener(C32224a<C13598b0> aVar) {
        this.f159720q = aVar;
    }

    public final void setOnSuccData(C32228q<? super Integer, ? super String, ? super C51575uo1, C13598b0> qVar) {
        this.f159719p = qVar;
    }

    public FinderLiveExtendReadingEditView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo77903c();
    }
}
