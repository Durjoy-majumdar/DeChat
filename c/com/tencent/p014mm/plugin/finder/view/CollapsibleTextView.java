package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.FlowTextMixView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import rx3.C13598b0;
import uc1.C14153w;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102B#\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00103\u001a\u00020\u001f¢\u0006\u0004\b1\u00104J\u0006\u0010\u0003\u001a\u00020\u0002R.\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR6\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@FX\u000e¢\u0006\f\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/CollapsibleTextView;", "Lcom/tencent/mm/ui/widget/FlowTextMixView;", "Lcom/tencent/mm/plugin/finder/view/EllipsizedTextView;", "getContentTextView", "", "value", "q", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "text", "Lkotlin/Function2;", "", "Lrx3/b0;", "r", "Lfy3/p;", "getOnExpandStateChangeListener", "()Lfy3/p;", "setOnExpandStateChangeListener", "(Lfy3/p;)V", "onExpandStateChangeListener", "Lkotlin/Function0;", "s", "Lfy3/a;", "getOnExpandBtnClickListener", "()Lfy3/a;", "setOnExpandBtnClickListener", "(Lfy3/a;)V", "onExpandBtnClickListener", "", "t", "I", "getExpandLeftPadding", "()I", "setExpandLeftPadding", "(I)V", "expandLeftPadding", "isExpand", "()Z", "setExpand", "(Z)V", "isBtnVisible", "setBtnVisible", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.CollapsibleTextView */
public final class CollapsibleTextView extends FlowTextMixView {

    /* renamed from: j */
    public int f17599j = Integer.MAX_VALUE;

    /* renamed from: n */
    public EllipsizedTextView f17600n;

    /* renamed from: o */
    public TextView f17601o;

    /* renamed from: p */
    public boolean f17602p;

    /* renamed from: q */
    public CharSequence f17603q;

    /* renamed from: r */
    public C32227p<? super Boolean, ? super Boolean, C13598b0> f17604r;

    /* renamed from: s */
    public C32224a<C13598b0> f17605s;

    /* renamed from: t */
    public int f17606t = C76577a.m92151b(getContext(), 4);

    /* renamed from: com.tencent.mm.plugin.finder.view.CollapsibleTextView$a */
    public static final class C3921a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CollapsibleTextView f17607d;

        public C3921a(CollapsibleTextView collapsibleTextView) {
            this.f17607d = collapsibleTextView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/CollapsibleTextView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> onExpandBtnClickListener = this.f17607d.getOnExpandBtnClickListener();
            if (onExpandBtnClickListener != null) {
                onExpandBtnClickListener.invoke();
            }
            CollapsibleTextView collapsibleTextView = this.f17607d;
            collapsibleTextView.setExpand(!collapsibleTextView.f17602p);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/CollapsibleTextView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollapsibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        m4140c(context, attributeSet);
        this.f17600n = new EllipsizedTextView(context, attributeSet);
        this.f17601o = new TextView(context, attributeSet);
        mo4346d();
    }

    /* renamed from: c */
    private final void m4140c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14153w.f39582a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…able.CollapsibleTextView)");
        try {
            this.f17599j = obtainStyledAttributes.getInt(0, Integer.MAX_VALUE);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: d */
    public final void mo4346d() {
        EllipsizedTextView ellipsizedTextView = this.f17600n;
        this.f17600n.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ellipsizedTextView.setEllipsize(TextUtils.TruncateAt.END);
        ellipsizedTextView.setMaxLines(this.f17599j);
        ellipsizedTextView.setTextColor(ellipsizedTextView.getContext().getResources().getColor(C0966R.color.FG_0));
        ellipsizedTextView.setTextSize(0, ellipsizedTextView.getContext().getResources().getDimension(C0966R.dimen.f3957lf) * C76577a.m92165p(ellipsizedTextView.getContext()));
        addView(this.f17600n);
        TextView textView = this.f17601o;
        this.f17601o.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setTextColor(textView.getContext().getResources().getColor(C0966R.color.FG_1));
        textView.setTextSize(0, textView.getContext().getResources().getDimension(C0966R.dimen.f3957lf) * C76577a.m92165p(textView.getContext()));
        textView.setPadding(this.f17606t, 0, 0, 0);
        this.f17601o.setVisibility(8);
        addView(this.f17601o);
        mo4347e(false, true);
        this.f17601o.setOnClickListener(new C3921a(this));
    }

    /* renamed from: e */
    public final void mo4347e(boolean z, boolean z2) {
        this.f17602p = z;
        if (z) {
            this.f17601o.setText(C0966R.string.bfo);
            this.f17600n.setMaxLines(Integer.MAX_VALUE);
        } else {
            this.f17601o.setText(C0966R.string.d0j);
            this.f17600n.setMaxLines(this.f17599j);
        }
        this.f17600n.post(new C4143p(this, z));
        this.f17600n.post(new C4135o(this, z));
    }

    public final EllipsizedTextView getContentTextView() {
        return this.f17600n;
    }

    public final int getExpandLeftPadding() {
        return this.f17606t;
    }

    public final C32224a<C13598b0> getOnExpandBtnClickListener() {
        return this.f17605s;
    }

    public final C32227p<Boolean, Boolean, C13598b0> getOnExpandStateChangeListener() {
        return this.f17604r;
    }

    public final CharSequence getText() {
        return this.f17600n.getText();
    }

    public final void setBtnVisible(boolean z) {
        this.f17601o.setVisibility(z ? 0 : 8);
    }

    public final void setExpand(boolean z) {
        mo4347e(z, false);
    }

    public final void setExpandLeftPadding(int i) {
        this.f17606t = i;
    }

    public final void setOnExpandBtnClickListener(C32224a<C13598b0> aVar) {
        this.f17605s = aVar;
    }

    public final void setOnExpandStateChangeListener(C32227p<? super Boolean, ? super Boolean, C13598b0> pVar) {
        this.f17604r = pVar;
    }

    public final void setText(CharSequence charSequence) {
        if (!C87412m.m108589b(this.f17603q, charSequence)) {
            this.f17603q = charSequence;
            this.f17600n.setText(charSequence);
            this.f17600n.post(new C4143p(this, this.f17602p));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollapsibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        m4140c(context, attributeSet);
        this.f17600n = new EllipsizedTextView(context, attributeSet, i);
        this.f17601o = new TextView(context, attributeSet, i);
        mo4346d();
    }
}
