package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76901s0;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.finder.view.m5 */
public final class C4105m5<T> extends C76901s0 {

    /* renamed from: f */
    public final Context f18259f;

    /* renamed from: g */
    public boolean f18260g;

    /* renamed from: h */
    public final TextView f18261h;

    /* renamed from: i */
    public final View f18262i;

    /* renamed from: j */
    public final View f18263j;

    /* renamed from: n */
    public boolean f18264n;

    /* renamed from: o */
    public int f18265o;

    /* renamed from: p */
    public int f18266p;

    /* renamed from: q */
    public long f18267q = 10000;

    /* renamed from: r */
    public final C32224a<C13598b0> f18268r;

    /* renamed from: com.tencent.mm.plugin.finder.view.m5$a */
    public interface C4106a<E> {
        /* renamed from: a */
        void mo4989a(E e);
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.m5$b */
    public static final class C4107b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f18269d;

        public C4107b(C32224a aVar) {
            this.f18269d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f18269d.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4105m5(Context context, C4106a aVar, int i, C8480h hVar) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f18259f = context;
        this.f18266p = C76577a.m92151b(context, 16);
        setContentView(LayoutInflater.from(context).inflate(C0966R.C0971layout.aqo, (ViewGroup) null));
        setClippingEnabled(false);
        View findViewById = getContentView().findViewById(C0966R.C0970id.kyk);
        C87412m.m108593f(findViewById, "contentView.findViewById(R.id.tv_tips)");
        this.f18261h = (TextView) findViewById;
        View findViewById2 = getContentView().findViewById(C0966R.C0970id.l2s);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.v_arrow)");
        this.f18262i = findViewById2;
        View findViewById3 = getContentView().findViewById(C0966R.C0970id.grv);
        C87412m.m108593f(findViewById3, "contentView.findViewById(R.id.menu_content)");
        this.f18263j = findViewById3;
        setOutsideTouchable(true);
        getContentView().setOnClickListener(new C4097l5(this));
        if (context instanceof MMActivity) {
            ((MMActivity) context).getLifecycle().addObserver(new FinderTipsBubbleWindow$2(this));
        }
        this.f18268r = new C4123n5(this);
    }

    /* renamed from: a */
    public final void mo4985a() {
        View contentView = getContentView();
        if (contentView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public final void mo4986b() {
        View contentView = getContentView();
        if (contentView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public final void mo4987c(View view) {
        C13604l lVar;
        View contentView;
        C87412m.m108594g(view, "anchor");
        if (!this.f18264n) {
            getContentView().measure(0, 0);
            this.f18264n = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        setWidth(measuredWidth);
        setHeight(measuredHeight);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        C74783i3.C6978a a = C74783i3.m89537a(this.f18259f);
        int i = a.f24704a;
        int i2 = a.f24705b;
        if (this.f18260g) {
            int i3 = (iArr[1] - measuredHeight) - this.f18265o;
            int width = (iArr[0] + (view.getWidth() / 2)) - (measuredWidth / 2);
            if (width < 0) {
                width = 0;
            }
            int i4 = i - measuredWidth;
            if (width > i4) {
                width = i4;
            }
            ViewGroup.LayoutParams layoutParams = this.f18262i.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(((iArr[0] + (view.getWidth() / 2)) - width) - (this.f18262i.getMeasuredWidth() / 2));
            if (layoutParams2.getMarginStart() < 0) {
                layoutParams2.getMarginStart();
                dismiss();
                return;
            }
            lVar = new C13604l(Integer.valueOf(width), Integer.valueOf(i3));
        } else {
            int i5 = (iArr[1] - measuredHeight) - this.f18265o;
            int i6 = i - measuredWidth;
            int i7 = i6 - this.f18266p;
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 <= i6) {
                i6 = i7;
            }
            ViewGroup.LayoutParams layoutParams3 = this.f18262i.getLayoutParams();
            C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            layoutParams4.setMarginStart(((iArr[0] + (view.getWidth() / 2)) - i6) - (this.f18262i.getMeasuredWidth() / 2));
            if (layoutParams4.getMarginStart() < 0) {
                layoutParams4.getMarginStart();
                dismiss();
                return;
            }
            lVar = new C13604l(Integer.valueOf(i6), Integer.valueOf(i5));
        }
        int intValue = ((Number) lVar.f38555d).intValue();
        int intValue2 = ((Number) lVar.f38556e).intValue();
        setAnimationStyle(C0966R.style.f8825z7);
        showAtLocation(view, 0, intValue, intValue2);
        if (this.f18267q > 0 && (contentView = getContentView()) != null) {
            contentView.postDelayed(new C4107b(this.f18268r), this.f18267q);
        }
        C87412m.m108593f(String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight)}, 6)), "format(format, *args)");
    }

    public void dismiss() {
        super.dismiss();
        View contentView = getContentView();
        if (contentView != null) {
            contentView.removeCallbacks(new C4107b(this.f18268r));
        }
    }
}
