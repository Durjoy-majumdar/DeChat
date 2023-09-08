package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eg1.C58591p0;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001f\u0010!J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\""}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator;", "Landroid/widget/RelativeLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "v", "Lrx3/b0;", "onClick", "Lkotlin/Function1;", "", "n", "Lfy3/l;", "getOnTabSelectedListener", "()Lfy3/l;", "setOnTabSelectedListener", "(Lfy3/l;)V", "onTabSelectedListener", "", "value", "getTab1Text", "()Ljava/lang/String;", "setTab1Text", "(Ljava/lang/String;)V", "tab1Text", "getTab2Text", "setTab2Text", "tab2Text", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator */
public final class FinderLiveTextIndicator extends RelativeLayout implements View.OnClickListener {

    /* renamed from: o */
    public static final /* synthetic */ int f159824o = 0;

    /* renamed from: d */
    public final TextView f159825d;

    /* renamed from: e */
    public final TextView f159826e;

    /* renamed from: f */
    public final View f159827f;

    /* renamed from: g */
    public final View f159828g;

    /* renamed from: h */
    public final View f159829h;

    /* renamed from: i */
    public final View f159830i;

    /* renamed from: j */
    public final View f159831j;

    /* renamed from: n */
    public C32226l<? super Integer, C13598b0> f159832n;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveTextIndicator$a */
    public static final class C56026a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveTextIndicator f159833d;

        public C56026a(FinderLiveTextIndicator finderLiveTextIndicator) {
            this.f159833d = finderLiveTextIndicator;
        }

        public final void run() {
            int i = FinderLiveTextIndicator.f159824o;
            Log.m105924i("Finder.FinderLiveTextIndicator", "post tab1Tv.measuredWidth:" + this.f159833d.f159825d.getMeasuredWidth());
            this.f159833d.f159831j.getLayoutParams().width = this.f159833d.f159825d.getMeasuredWidth();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveTextIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View.inflate(context, C0966R.C0971layout.ake, this);
        View findViewById = findViewById(C0966R.C0970id.e0b);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_live_text_indicator_tab1)");
        TextView textView = (TextView) findViewById;
        this.f159825d = textView;
        View findViewById2 = findViewById(C0966R.C0970id.e0e);
        C87412m.m108593f(findViewById2, "findViewById(R.id.finder_live_text_indicator_tab2)");
        TextView textView2 = (TextView) findViewById2;
        this.f159826e = textView2;
        View findViewById3 = findViewById(C0966R.C0970id.e0d);
        C87412m.m108593f(findViewById3, "findViewById(R.id.finder…t_indicator_tab1_red_dot)");
        this.f159827f = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.e0g);
        C87412m.m108593f(findViewById4, "findViewById(R.id.finder…t_indicator_tab2_red_dot)");
        this.f159828g = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.e0c);
        C87412m.m108593f(findViewById5, "findViewById(R.id.finder…ext_indicator_tab1_group)");
        this.f159829h = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.e0f);
        C87412m.m108593f(findViewById6, "findViewById(R.id.finder…ext_indicator_tab2_group)");
        this.f159830i = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.e0a);
        C87412m.m108593f(findViewById7, "findViewById(R.id.finder_live_text_indicator_line)");
        this.f159831j = findViewById7;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C58591p0.f167752d);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr….FinderLiveTextIndicator)");
            textView.setText(obtainStyledAttributes.getString(0));
            textView2.setText(obtainStyledAttributes.getString(1));
            obtainStyledAttributes.recycle();
        }
        textView.setAlpha(0.8f);
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        findViewById7.post(new C56026a(this));
    }

    /* renamed from: a */
    public final void mo77979a(boolean z) {
        View view = this.f159827f;
        int i = z ? 0 : 4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab1RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab1RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: b */
    public final void mo77980b(boolean z) {
        View view = this.f159828g;
        int i = z ? 0 : 4;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab2RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "showTab2RedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final C32226l<Integer, C13598b0> getOnTabSelectedListener() {
        return this.f159832n;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTab1Text() {
        /*
            r1 = this;
            android.widget.TextView r0 = r1.f159825d
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveTextIndicator.getTab1Text():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getTab2Text() {
        /*
            r1 = this;
            android.widget.TextView r0 = r1.f159826e
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            java.lang.String r0 = ""
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveTextIndicator.getTab2Text():java.lang.String");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.m105924i("Finder.FinderLiveTextIndicator", "onAttachedToWindow tab1Tv.measuredWidth:" + this.f159825d.getMeasuredWidth());
    }

    public void onClick(View view) {
        C32226l<? super Integer, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.e0b) {
            C32226l<? super Integer, C13598b0> lVar2 = this.f159832n;
            if (lVar2 != null) {
                lVar2.invoke(0);
            }
        } else if (!(valueOf == null || valueOf.intValue() != C0966R.C0970id.e0e || (lVar = this.f159832n) == null)) {
            lVar.invoke(1);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveTextIndicator", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setOnTabSelectedListener(C32226l<? super Integer, C13598b0> lVar) {
        this.f159832n = lVar;
    }

    public final void setTab1Text(String str) {
        C87412m.m108594g(str, "value");
        this.f159825d.setText(str);
    }

    public final void setTab2Text(String str) {
        C87412m.m108594g(str, "value");
        this.f159826e.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveTextIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
