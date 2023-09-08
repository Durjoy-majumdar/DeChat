package ag1;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderPostProgressView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76912y0;

/* renamed from: ag1.b */
public final class C0040b {

    /* renamed from: a */
    public static final C0040b f48a = new C0040b();

    /* renamed from: ag1.b$a */
    public static final class C0041a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f49d;

        public C0041a(View view) {
            this.f49d = view;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76912y0.m92767f(this.f49d.getContext(), this.f49d.getContext().getString(C0966R.string.eb8));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic$refresh$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ag1.b$b */
    public static final class C0042b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPostProgressView f50d;

        public C0042b(FinderPostProgressView finderPostProgressView) {
            this.f50d = finderPostProgressView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            FinderPostProgressView finderPostProgressView = this.f50d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            finderPostProgressView.setProgress(((Integer) animatedValue).intValue());
            this.f50d.invalidate();
        }
    }

    /* renamed from: a */
    public final void mo46a(View view, BaseFinderFeed baseFinderFeed, boolean z, boolean z2) {
        int i;
        FinderPostProgressView finderPostProgressView;
        View view2 = view;
        C87412m.m108594g(view2, "itemView");
        C87412m.m108594g(baseFinderFeed, "item");
        View findViewById = view2.findViewById(C0966R.C0970id.i06);
        View findViewById2 = view2.findViewById(C0966R.C0970id.i0f);
        View findViewById3 = view2.findViewById(C0966R.C0970id.kzc);
        ViewParent parent = findViewById != null ? findViewById.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            i = 0;
        } else {
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = findViewById2;
            i = 0;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById3 != null) {
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view4 = findViewById3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar3.mo10231a(i)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(view.getContext().getResources().getColor(C0966R.color.f3411rx));
        }
        if (baseFinderFeed.mo3513o().isPostFailed()) {
            if (findViewById != null) {
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(findViewById, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(i)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            TextView textView = findViewById != null ? (TextView) findViewById.findViewById(C0966R.C0970id.crt) : null;
            if (textView != null) {
                textView.setTextSize(i, (float) C76577a.m92151b(view.getContext(), 14));
            }
            if (baseFinderFeed.mo3513o().isPostFailedCanRetry()) {
                if (textView != null) {
                    textView.setText(C0966R.string.f360754ej0);
                }
            } else if (textView != null) {
                textView.setText(C0966R.string.dcy);
            }
        } else if (!baseFinderFeed.mo3513o().isPostFinish()) {
            if (findViewById2 != null) {
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(Integer.valueOf(i));
                View view5 = findViewById2;
                C117292a.m165358d(view5, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar5.mo10231a(i)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById2 != null && (finderPostProgressView = (FinderPostProgressView) findViewById2.findViewById(C0966R.C0970id.i87)) != null) {
                int[] iArr = new int[2];
                iArr[i] = finderPostProgressView.getProgress();
                iArr[1] = baseFinderFeed.mo3513o().getPostInfo().f185649h;
                ValueAnimator ofInt = ValueAnimator.ofInt(iArr);
                ofInt.addUpdateListener(new C0042b(finderPostProgressView));
                ValueAnimator duration = ofInt.setDuration(400);
                if (duration != null) {
                    duration.start();
                }
            }
        } else if (!z) {
            if (findViewById3 != null) {
                C9556a aVar6 = new C9556a();
                ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                aVar6.mo10233c(Integer.valueOf(i));
                View view6 = findViewById3;
                C117292a.m165358d(view6, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar6.mo10231a(i)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/gallery/convert/MaskUILogic", "refresh", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (C85875k4.m106211z() || z2) {
                if (viewGroup != null) {
                    viewGroup.setBackgroundColor(view.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_0_5));
                }
            } else if (viewGroup != null) {
                viewGroup.setBackgroundColor(view.getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_1));
            }
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new C0041a(view2));
            }
        } else if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}
