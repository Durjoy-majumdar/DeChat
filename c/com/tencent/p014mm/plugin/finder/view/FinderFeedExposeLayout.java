package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.protocal.protobuf.FinderCommentInfo;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102B%\b\u0016\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00103\u001a\u00020'¢\u0006\u0004\b1\u00104R\"\u0010\b\u001a\u00020\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R8\u0010\"\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R8\u0010&\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001a\u0010,\u001a\u00020'8\u0006XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00065"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedExposeLayout;", "Landroid/widget/LinearLayout;", "d", "Landroid/widget/LinearLayout;", "getCommentsLayout", "()Landroid/widget/LinearLayout;", "setCommentsLayout", "(Landroid/widget/LinearLayout;)V", "commentsLayout", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "getSeeAllCommentsTv", "()Landroid/widget/TextView;", "setSeeAllCommentsTv", "(Landroid/widget/TextView;)V", "seeAllCommentsTv", "Landroid/view/View;", "g", "Landroid/view/View;", "getCommentIconContainer", "()Landroid/view/View;", "setCommentIconContainer", "(Landroid/view/View;)V", "commentIconContainer", "Lkotlin/Function2;", "Lcom/tencent/mm/protocal/protobuf/FinderCommentInfo;", "Lrx3/b0;", "h", "Lfy3/p;", "getOnCommentClickListener", "()Lfy3/p;", "setOnCommentClickListener", "(Lfy3/p;)V", "onCommentClickListener", "i", "getOnCommentLongClickListener", "setOnCommentLongClickListener", "onCommentLongClickListener", "", "j", "I", "getMAX_COMMENT_COUNT", "()I", "MAX_COMMENT_COUNT", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedExposeLayout */
public final class FinderFeedExposeLayout extends LinearLayout {

    /* renamed from: d */
    public LinearLayout f17733d;

    /* renamed from: e */
    public View f17734e;

    /* renamed from: f */
    public TextView f17735f;

    /* renamed from: g */
    public View f17736g;

    /* renamed from: h */
    public C32227p<? super View, ? super FinderCommentInfo, C13598b0> f17737h;

    /* renamed from: i */
    public C32227p<? super View, ? super FinderCommentInfo, C13598b0> f17738i;

    /* renamed from: j */
    public final int f17739j = 3;

    public FinderFeedExposeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.aa5, (ViewGroup) null);
        addView(inflate, new LinearLayout.LayoutParams(-1, -2));
        View findViewById = inflate.findViewById(C0966R.C0970id.cyi);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.feed_expose_comment)");
        this.f17733d = (LinearLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.cyk);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.feed_expose_like_layout)");
        this.f17734e = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.cyj);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.feed_expose_like)");
        C85875k4.m106189j0(((TextView) findViewById3).getPaint(), 0.8f);
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C37521f.f99239N2.mo60266n().intValue();
        C37521f.f99279S0.mo60266n().intValue();
        fVar.mo61150D();
        fVar.mo61182h();
        new ArrayList();
    }

    public final View getCommentIconContainer() {
        View view = this.f17736g;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("commentIconContainer");
        throw null;
    }

    public final LinearLayout getCommentsLayout() {
        return this.f17733d;
    }

    public final int getMAX_COMMENT_COUNT() {
        return this.f17739j;
    }

    public final C32227p<View, FinderCommentInfo, C13598b0> getOnCommentClickListener() {
        return this.f17737h;
    }

    public final C32227p<View, FinderCommentInfo, C13598b0> getOnCommentLongClickListener() {
        return this.f17738i;
    }

    public final TextView getSeeAllCommentsTv() {
        TextView textView = this.f17735f;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("seeAllCommentsTv");
        throw null;
    }

    public final void setCommentIconContainer(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f17736g = view;
    }

    public final void setCommentsLayout(LinearLayout linearLayout) {
        C87412m.m108594g(linearLayout, "<set-?>");
        this.f17733d = linearLayout;
    }

    public final void setOnCommentClickListener(C32227p<? super View, ? super FinderCommentInfo, C13598b0> pVar) {
        this.f17737h = pVar;
    }

    public final void setOnCommentLongClickListener(C32227p<? super View, ? super FinderCommentInfo, C13598b0> pVar) {
        this.f17738i = pVar;
    }

    public final void setSeeAllCommentsTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f17735f = textView;
    }

    public FinderFeedExposeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.aa5, (ViewGroup) null);
        addView(inflate, new LinearLayout.LayoutParams(-1, -2));
        View findViewById = inflate.findViewById(C0966R.C0970id.cyi);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.feed_expose_comment)");
        this.f17733d = (LinearLayout) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.cyk);
        C87412m.m108593f(findViewById2, "view.findViewById(R.id.feed_expose_like_layout)");
        this.f17734e = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.cyj);
        C87412m.m108593f(findViewById3, "view.findViewById(R.id.feed_expose_like)");
        C85875k4.m106189j0(((TextView) findViewById3).getPaint(), 0.8f);
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        C37521f.f99239N2.mo60266n().intValue();
        C37521f.f99279S0.mo60266n().intValue();
        fVar.mo61150D();
        fVar.mo61182h();
        new ArrayList();
    }
}
