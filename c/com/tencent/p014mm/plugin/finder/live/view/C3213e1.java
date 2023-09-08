package com.tencent.p014mm.plugin.finder.live.view;

import android.animation.Animator;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;

/* renamed from: com.tencent.mm.plugin.finder.live.view.e1 */
public final class C3213e1 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveMultiNoticeView f15331d;

    public C3213e1(FinderLiveMultiNoticeView finderLiveMultiNoticeView) {
        this.f15331d = finderLiveMultiNoticeView;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        String str;
        this.f15331d.setVisibility(0);
        WxRefreshLayout b = this.f15331d.getRefreshLayout();
        if (b != null) {
            b.mo26642z(false);
        }
        FinderLiveMultiNoticeView finderLiveMultiNoticeView = this.f15331d;
        FinderContact finderContact = finderLiveMultiNoticeView.f15287g;
        if (finderContact == null || (str = finderContact.username) == null) {
            str = "";
        }
        FinderLiveMultiNoticeView.m3128g(finderLiveMultiNoticeView, true, (String) null, str, 0, 2, (Object) null);
    }
}
