package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85878m2;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.finder.ui.f1 */
public final class C3791f1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedUI f17266d;

    /* renamed from: com.tencent.mm.plugin.finder.ui.f1$a */
    public static final class C3792a implements C85861e4.C85862a {

        /* renamed from: a */
        public final /* synthetic */ FinderLikedFeedUI f17267a;

        public C3792a(FinderLikedFeedUI finderLikedFeedUI) {
            this.f17267a = finderLikedFeedUI;
        }

        /* renamed from: a */
        public void mo4165a() {
            FinderLikedFeedUI finderLikedFeedUI = this.f17267a;
            int i = FinderLikedFeedUI.f16904z;
            finderLikedFeedUI.mo4061N7().f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
        }

        /* renamed from: b */
        public void mo4166b() {
            FinderLikedFeedUI finderLikedFeedUI = this.f17267a;
            int i = FinderLikedFeedUI.f16904z;
            finderLikedFeedUI.mo4061N7().f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.f1$b */
    public static final class C3793b implements C85878m2.C85879a {

        /* renamed from: a */
        public final /* synthetic */ FinderLikedFeedUI f17268a;

        public C3793b(FinderLikedFeedUI finderLikedFeedUI) {
            this.f17268a = finderLikedFeedUI;
        }

        /* renamed from: a */
        public void mo4167a() {
            FinderLikedFeedUI finderLikedFeedUI = this.f17268a;
            int i = FinderLikedFeedUI.f16904z;
            finderLikedFeedUI.mo4061N7().f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
        }

        /* renamed from: b */
        public void mo4168b() {
            FinderLikedFeedUI finderLikedFeedUI = this.f17268a;
            int i = FinderLikedFeedUI.f16904z;
            finderLikedFeedUI.mo4061N7().f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
        }
    }

    public C3791f1(FinderLikedFeedUI finderLikedFeedUI) {
        this.f17266d = finderLikedFeedUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (C85875k4.m106199o0()) {
            FinderLikedFeedUI finderLikedFeedUI = this.f17266d;
            FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = finderLikedFeedUI.f16910t;
            if (likedTimelinePresenter != null) {
                BaseFinderFeedLoader baseFinderFeedLoader = likedTimelinePresenter.f15978g;
                Intent intent = finderLikedFeedUI.getIntent();
                FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = this.f17266d.f16910t;
                if (likedTimelinePresenter2 != null) {
                    BaseFeedLoader.saveCache$default(baseFinderFeedLoader, intent, likedTimelinePresenter2.f15978g.getInitPos(), (C2780c) null, 4, (Object) null);
                    FinderLikedFeedUI finderLikedFeedUI2 = this.f17266d;
                    C85861e4.m106119f(finderLikedFeedUI2, true, true, new C3792a(finderLikedFeedUI2));
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C85878m2.m106216e(this.f17266d.getTaskId(), new C3793b(this.f17266d));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$fixActionBarStatus$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
