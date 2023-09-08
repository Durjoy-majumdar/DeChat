package com.tencent.p014mm.plugin.finder.view.whatnews;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import ns1.C11263b;
import ns1.C76960a;
import ns1.C76962c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Lrx3/b0;", "d", "Lfy3/a;", "getDetachFinish", "()Lfy3/a;", "setDetachFinish", "(Lfy3/a;)V", "detachFinish", "", "e", "Z", "getWithEnterAnim", "()Z", "setWithEnterAnim", "(Z)V", "withEnterAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView */
public final class FinderWhatsNewView extends FrameLayout {

    /* renamed from: d */
    public C32224a<C13598b0> f198158d = C11263b.f33200d;

    /* renamed from: e */
    public boolean f198159e;

    /* renamed from: com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView$a */
    public static final class C68956a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderWhatsNewView f198160d;

        /* renamed from: com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView$a$a */
        public static final class C68957a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ FinderWhatsNewView f198161d;

            /* renamed from: e */
            public final /* synthetic */ View f198162e;

            public C68957a(FinderWhatsNewView finderWhatsNewView, View view) {
                this.f198161d = finderWhatsNewView;
                this.f198162e = view;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                ViewParent parent = this.f198161d.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(this.f198162e);
                this.f198161d.getDetachFinish().invoke();
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        public C68956a(FinderWhatsNewView finderWhatsNewView) {
            this.f198160d = finderWhatsNewView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView$onAttachedToWindow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f198160d.animate().alpha(0.0f).setDuration(300).setListener(new C68957a(this.f198160d, view)).start();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView$onAttachedToWindow$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView$b */
    public static final class C68958b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderWhatsNewView f198163d;

        public C68958b(FinderWhatsNewView finderWhatsNewView) {
            this.f198163d = finderWhatsNewView;
        }

        public final void run() {
            int i = C76960a.f224888a;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WHATS_NEW_SHOWN_BOOLEAN_SYNC, Boolean.TRUE);
            C115669n.INSTANCE.mo175913w(1305, 0, 1);
            FinderWhatsNewView finderWhatsNewView = this.f198163d;
            if (finderWhatsNewView.f198159e) {
                finderWhatsNewView.setTranslationX((float) finderWhatsNewView.getHeight());
                finderWhatsNewView.animate().translationY(0.0f).setDuration(200).setListener(new C76962c(finderWhatsNewView)).start();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderWhatsNewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108591d(context);
        setId(C0966R.C0970id.e8u);
        int i = C76960a.f224888a;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.ar8, this, true);
    }

    public final C32224a<C13598b0> getDetachFinish() {
        return this.f198158d;
    }

    public final boolean getWithEnterAnim() {
        return this.f198159e;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Button button = (Button) findViewById(C0966R.C0970id.ck6);
        int i = C76960a.f224888a;
        button.setText(getContext().getResources().getString(C0966R.string.etu));
        button.setOnClickListener(new C68956a(this));
        post(new C68958b(this));
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        requestLayout();
    }

    public final void setDetachFinish(C32224a<C13598b0> aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f198158d = aVar;
    }

    public final void setWithEnterAnim(boolean z) {
        this.f198159e = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderWhatsNewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108591d(context);
        setId(C0966R.C0970id.e8u);
        int i2 = C76960a.f224888a;
        LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.ar8, this, true);
    }
}
