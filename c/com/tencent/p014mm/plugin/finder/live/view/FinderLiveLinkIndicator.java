package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "Lrx3/b0;", "j", "Lfy3/l;", "getTabOnclickListener", "()Lfy3/l;", "setTabOnclickListener", "(Lfy3/l;)V", "tabOnclickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator */
public final class FinderLiveLinkIndicator extends FrameLayout {

    /* renamed from: d */
    public final View f198077d;

    /* renamed from: e */
    public final TextView f198078e;

    /* renamed from: f */
    public final View f198079f;

    /* renamed from: g */
    public final View f198080g;

    /* renamed from: h */
    public final View f198081h;

    /* renamed from: i */
    public final View f198082i;

    /* renamed from: j */
    public C32226l<? super Integer, C13598b0> f198083j;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator$a */
    public static final class C68938a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLinkIndicator f198084d;

        public C68938a(FinderLiveLinkIndicator finderLiveLinkIndicator) {
            this.f198084d = finderLiveLinkIndicator;
        }

        public final void run() {
            this.f198084d.f198077d.getLayoutParams().width = this.f198084d.f198078e.getMeasuredWidth();
            this.f198084d.f198077d.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator$b */
    public static final class C68939b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLinkIndicator f198085d;

        public C68939b(FinderLiveLinkIndicator finderLiveLinkIndicator) {
            this.f198085d = finderLiveLinkIndicator;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> tabOnclickListener = this.f198085d.getTabOnclickListener();
            if (tabOnclickListener != null) {
                tabOnclickListener.invoke(0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveLinkIndicator$c */
    public static final class C68940c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveLinkIndicator f198086d;

        public C68940c(FinderLiveLinkIndicator finderLiveLinkIndicator) {
            this.f198086d = finderLiveLinkIndicator;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32226l<Integer, C13598b0> tabOnclickListener = this.f198086d.getTabOnclickListener();
            if (tabOnclickListener != null) {
                tabOnclickListener.invoke(1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveLinkIndicator$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveLinkIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.ahk, this);
        View findViewById = findViewById(C0966R.C0970id.dpu);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_live_link_indicator)");
        this.f198077d = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.dqb);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_live_link_tab1_tv)");
        this.f198078e = (TextView) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.dqa);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder_live_link_tab1_red_dot)");
        this.f198079f = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.dqd);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder_live_link_tab2_tv)");
        TextView textView = (TextView) findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.dqc);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder_live_link_tab2_red_dot)");
        this.f198080g = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.dpv);
        C87412m.m108593f(findViewById6, "findViewById(R.id.finder…ink_indicator_tab1_group)");
        this.f198081h = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.dpw);
        C87412m.m108593f(findViewById7, "findViewById(R.id.finder…ink_indicator_tab2_group)");
        this.f198082i = findViewById7;
        findViewById.post(new C68938a(this));
        findViewById6.setOnClickListener(new C68939b(this));
        findViewById7.setOnClickListener(new C68940c(this));
    }

    public final C32226l<Integer, C13598b0> getTabOnclickListener() {
        return this.f198083j;
    }

    public final void setTabOnclickListener(C32226l<? super Integer, C13598b0> lVar) {
        this.f198083j = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveLinkIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
