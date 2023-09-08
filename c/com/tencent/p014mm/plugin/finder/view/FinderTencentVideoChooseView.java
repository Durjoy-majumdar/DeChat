package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kotlin.Metadata;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderTencentVideoChooseView;", "Landroid/widget/RelativeLayout;", "", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "d", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getIconIv", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "setIconIv", "(Lcom/tencent/mm/ui/widget/imageview/WeImageView;)V", "iconIv", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "getDescTv", "()Landroid/widget/TextView;", "setDescTv", "(Landroid/widget/TextView;)V", "descTv", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderTencentVideoChooseView */
public final class FinderTencentVideoChooseView extends RelativeLayout implements C111847h {

    /* renamed from: d */
    public WeImageView f17966d;

    /* renamed from: e */
    public TextView f17967e;

    public FinderTencentVideoChooseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a9n, this, true);
    }

    public final TextView getDescTv() {
        TextView textView = this.f17967e;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("descTv");
        throw null;
    }

    public final WeImageView getIconIv() {
        WeImageView weImageView = this.f17966d;
        if (weImageView != null) {
            return weImageView;
        }
        C87412m.m108603p("iconIv");
        throw null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.lqy);
        C87412m.m108593f(findViewById, "findViewById(R.id.wiv_choose_tencent_video)");
        setIconIv((WeImageView) findViewById);
        View findViewById2 = findViewById(C0966R.C0970id.kvx);
        C87412m.m108593f(findViewById2, "findViewById(R.id.tv_choose_tencent_video)");
        setDescTv((TextView) findViewById2);
    }

    public final void setDescTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f17967e = textView;
    }

    public final void setIconIv(WeImageView weImageView) {
        C87412m.m108594g(weImageView, "<set-?>");
        this.f17966d = weImageView;
    }

    public FinderTencentVideoChooseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.a9n, this, true);
    }
}
