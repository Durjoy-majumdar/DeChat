package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import fy3.C32227p;
import gy3.C87412m;
import il1.C9124u2;
import il1.C9142v2;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveFansClubTagWidget;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getTagTv", "()Landroid/widget/TextView;", "setTagTv", "(Landroid/widget/TextView;)V", "tagTv", "Lkotlin/Function2;", "Landroid/view/View;", "", "Lrx3/b0;", "e", "Lfy3/p;", "getClickListener", "()Lfy3/p;", "setClickListener", "(Lfy3/p;)V", "clickListener", "f", "Z", "getHasJoinFansClub", "()Z", "setHasJoinFansClub", "(Z)V", "hasJoinFansClub", "isAnchor", "setAnchor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveFansClubTagWidget */
public final class FinderLiveFansClubTagWidget extends FrameLayout {

    /* renamed from: d */
    public TextView f15378d;

    /* renamed from: e */
    public C32227p<? super View, ? super Boolean, C13598b0> f15379e;

    /* renamed from: f */
    public boolean f15380f;

    /* renamed from: g */
    public final Runnable f15381g = new C9124u2(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFansClubTagWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attr");
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f359720ag3, this, true);
        View findViewById = findViewById(C0966R.C0970id.ctk);
        C87412m.m108593f(findViewById, "findViewById(R.id.fans_name)");
        setTagTv((TextView) findViewById);
        getTagTv().setTextSize(1, 12.0f);
        C85875k4.m106189j0(getTagTv().getPaint(), 0.8f);
        setOnClickListener(new C9142v2(this));
    }

    /* renamed from: a */
    public final void mo3415a(boolean z, String str, boolean z2) {
        C87412m.m108594g(str, "tag");
        getTagTv().setText(str);
        this.f15380f = z2;
        if (z) {
            getTagTv().setVisibility(0);
        } else if (!z2) {
            Object tag = getTagTv().getTag();
            Boolean bool = Boolean.TRUE;
            if (!C87412m.m108589b(tag, bool)) {
                getTagTv().setVisibility(0);
                getTagTv().postDelayed(this.f15381g, 3000);
                getTagTv().setTag(bool);
            }
        } else {
            getTagTv().setVisibility(8);
        }
    }

    public final C32227p<View, Boolean, C13598b0> getClickListener() {
        return this.f15379e;
    }

    public final boolean getHasJoinFansClub() {
        return this.f15380f;
    }

    public final TextView getTagTv() {
        TextView textView = this.f15378d;
        if (textView != null) {
            return textView;
        }
        C87412m.m108603p("tagTv");
        throw null;
    }

    public final void setAnchor(boolean z) {
    }

    public final void setClickListener(C32227p<? super View, ? super Boolean, C13598b0> pVar) {
        this.f15379e = pVar;
    }

    public final void setHasJoinFansClub(boolean z) {
        this.f15380f = z;
    }

    public final void setTagTv(TextView textView) {
        C87412m.m108594g(textView, "<set-?>");
        this.f15378d = textView;
    }
}
