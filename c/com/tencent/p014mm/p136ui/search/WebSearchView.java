package com.tencent.p014mm.p136ui.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import gn3.C45938a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*B%\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b)\u0010,J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010$\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017¨\u0006-"}, mo182094d2 = {"Lcom/tencent/mm/ui/search/WebSearchView;", "Landroid/widget/LinearLayout;", "", "visibile", "Lrx3/b0;", "setCancelBtnVisible", "Lgn3/a;", "searchViewListener", "setSearchViewListener", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "d", "Lcom/tencent/mm/ui/search/FTSEditTextView;", "getFtsEditText", "()Lcom/tencent/mm/ui/search/FTSEditTextView;", "setFtsEditText", "(Lcom/tencent/mm/ui/search/FTSEditTextView;)V", "ftsEditText", "Landroid/view/View;", "e", "Landroid/view/View;", "getBackBtn", "()Landroid/view/View;", "setBackBtn", "(Landroid/view/View;)V", "backBtn", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getCancelBtn", "()Landroid/widget/TextView;", "setCancelBtn", "(Landroid/widget/TextView;)V", "cancelBtn", "g", "getWebActionbarSearchviewContainer", "setWebActionbarSearchviewContainer", "webActionbarSearchviewContainer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.search.WebSearchView */
public final class WebSearchView extends LinearLayout {

    /* renamed from: d */
    public FTSEditTextView f122188d;

    /* renamed from: e */
    public View f122189e;

    /* renamed from: f */
    public TextView f122190f;

    /* renamed from: g */
    public View f122191g;

    /* renamed from: h */
    public C45938a f122192h;

    /* renamed from: com.tencent.mm.ui.search.WebSearchView$a */
    public static final class C45053a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchView f122193d;

        public C45053a(WebSearchView webSearchView) {
            this.f122193d = webSearchView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/WebSearchView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C45938a aVar = this.f122193d.f122192h;
            if (aVar != null) {
                C87412m.m108593f(view, "v");
                aVar.onClickBackBtn(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/search/WebSearchView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.search.WebSearchView$b */
    public static final class C45054b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WebSearchView f122194d;

        public C45054b(WebSearchView webSearchView) {
            this.f122194d = webSearchView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/WebSearchView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C45938a aVar = this.f122194d.f122192h;
            if (aVar != null) {
                C87412m.m108593f(view, "v");
                aVar.onClickCancelBtn(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/search/WebSearchView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public WebSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo70391a();
    }

    /* renamed from: a */
    public final void mo70391a() {
        Object systemService = getContext().getSystemService("layout_inflater");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((LayoutInflater) systemService).inflate(C0966R.C0971layout.chm, this, true);
        View findViewById = findViewById(C0966R.C0970id.f5289b1);
        C87412m.m108593f(findViewById, "findViewById(R.id.ab_back_btn)");
        setBackBtn(findViewById);
        Util.expandViewTouchArea(getBackBtn(), 200, 200, 200, 200);
        getBackBtn().setOnClickListener(new C45053a(this));
        View findViewById2 = findViewById(C0966R.C0970id.apy);
        C87412m.m108593f(findViewById2, "findViewById(R.id.cancel_btn)");
        setCancelBtn((TextView) findViewById2);
        getCancelBtn().setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3635t)) * C76577a.m92161l(getContext()));
        getCancelBtn().setOnClickListener(new C45054b(this));
        View findViewById3 = findViewById(C0966R.C0970id.f359573ma3);
        C87412m.m108593f(findViewById3, "findViewById(R.id.web_ac…bar_searchview_container)");
        setWebActionbarSearchviewContainer(findViewById3);
        View findViewById4 = findViewById(C0966R.C0970id.eg6);
        C87412m.m108593f(findViewById4, "findViewById(R.id.fts_edittext)");
        setFtsEditText((FTSEditTextView) findViewById4);
        getFtsEditText().mo70338f();
    }

    public final View getBackBtn() {
        View view = this.f122189e;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("backBtn");
        throw null;
    }

    public final TextView getCancelBtn() {
        TextView textView = this.f122190f;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("cancelBtn");
        throw null;
    }

    public final FTSEditTextView getFtsEditText() {
        FTSEditTextView fTSEditTextView = this.f122188d;
        if (fTSEditTextView != null) {
            return fTSEditTextView;
        }
        C87412m.m108603p("ftsEditText");
        throw null;
    }

    public final View getWebActionbarSearchviewContainer() {
        View view = this.f122191g;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("webActionbarSearchviewContainer");
        throw null;
    }

    public final void setBackBtn(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f122189e = view;
    }

    public final void setCancelBtn(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f122190f = textView;
    }

    public final void setCancelBtnVisible(int i) {
        if (getCancelBtn() != null) {
            getCancelBtn().setVisibility(i);
        }
    }

    public final void setFtsEditText(FTSEditTextView fTSEditTextView) {
        C87412m.m108594g(fTSEditTextView, "<set-?>");
        this.f122188d = fTSEditTextView;
    }

    public final void setSearchViewListener(C45938a aVar) {
        C87412m.m108594g(aVar, "searchViewListener");
        this.f122192h = aVar;
    }

    public final void setWebActionbarSearchviewContainer(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f122191g = view;
    }

    public WebSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo70391a();
    }
}
