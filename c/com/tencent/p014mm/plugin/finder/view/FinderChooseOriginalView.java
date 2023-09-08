package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B%\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\u0002¢\u0006\u0004\b!\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderChooseOriginalView;", "Landroid/widget/LinearLayout;", "", "original", "Lrx3/b0;", "setOriginalFlag", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTipTv", "()Landroid/widget/TextView;", "setTipTv", "(Landroid/widget/TextView;)V", "tipTv", "e", "I", "getFlag", "()I", "setFlag", "(I)V", "flag", "Lkotlin/Function1;", "f", "Lfy3/l;", "getOnFlagChangedListener", "()Lfy3/l;", "setOnFlagChangedListener", "(Lfy3/l;)V", "onFlagChangedListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderChooseOriginalView */
public final class FinderChooseOriginalView extends LinearLayout {

    /* renamed from: d */
    public TextView f17638d;

    /* renamed from: e */
    public int f17639e = 1;

    /* renamed from: f */
    public C32226l<? super Integer, C13598b0> f17640f;

    public FinderChooseOriginalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a9l, this, true);
        View findViewById = findViewById(C0966R.C0970id.hpf);
        C87412m.m108593f(findViewById, "findViewById(R.id.original_tip_tv)");
        this.f17638d = (TextView) findViewById;
        setOnClickListener(new C4231z0(this));
    }

    public final int getFlag() {
        return this.f17639e;
    }

    public final C32226l<Integer, C13598b0> getOnFlagChangedListener() {
        return this.f17640f;
    }

    public final TextView getTipTv() {
        return this.f17638d;
    }

    public final void setFlag(int i) {
        this.f17639e = i;
    }

    public final void setOnFlagChangedListener(C32226l<? super Integer, C13598b0> lVar) {
        this.f17640f = lVar;
    }

    public final void setOriginalFlag(int i) {
        this.f17639e = i;
        if (i == 1) {
            this.f17638d.setText(C0966R.string.egc);
        } else if (i == 2) {
            this.f17638d.setText(C0966R.string.f360723ef1);
        } else {
            this.f17638d.setText("");
        }
        C32226l<? super Integer, C13598b0> lVar = this.f17640f;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
    }

    public final void setTipTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f17638d = textView;
    }

    public FinderChooseOriginalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a9l, this, true);
        View findViewById = findViewById(C0966R.C0970id.hpf);
        C87412m.m108593f(findViewById, "findViewById(R.id.original_tip_tv)");
        this.f17638d = (TextView) findViewById;
        setOnClickListener(new C4231z0(this));
    }
}
