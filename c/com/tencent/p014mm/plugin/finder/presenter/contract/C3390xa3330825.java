package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2 */
final class C3390xa3330825 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f15995d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3390xa3330825(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        super(0);
        this.f15995d = likedTimelinePresenter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r0 = r0.mo3741p().getLoadMoreFooter();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r11 = this;
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r0 = r11.f15995d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r0 = r0.f15984p
            r1 = 2131308010(0x7f092dea, float:1.8234263E38)
            if (r0 == 0) goto L_0x0021
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo3741p()
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x0021
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x0021
            r2 = 2131829092(0x7f112164, float:1.9291143E38)
            r0.setText(r2)
        L_0x0021:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r0 = r11.f15995d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r0 = r0.f15984p
            if (r0 == 0) goto L_0x004b
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo3741p()
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x004b
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x004b
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
        L_0x004b:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r0 = r11.f15995d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r0 = r0.f15984p
            r2 = 0
            if (r0 == 0) goto L_0x0063
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo3741p()
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x0063
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0064
        L_0x0063:
            r0 = r2
        L_0x0064:
            if (r0 != 0) goto L_0x0067
            goto L_0x006c
        L_0x0067:
            r1 = 8
            r0.setVisibility(r1)
        L_0x006c:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r0 = r11.f15995d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r0 = r0.f15984p
            if (r0 == 0) goto L_0x0083
            com.tencent.mm.view.RefreshLoadMoreLayout r0 = r0.mo3741p()
            android.view.View r0 = r0.getLoadMoreFooter()
            if (r0 == 0) goto L_0x0083
            r1 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r2 = r0.findViewById(r1)
        L_0x0083:
            if (r2 != 0) goto L_0x0086
            goto L_0x00c7
        L_0x0086:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.mo10233c(r3)
            java.lang.Object[] r4 = r0.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2"
            java.lang.String r6 = "invoke"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r2
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r0.mo10231a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.setVisibility(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$1$2"
            java.lang.String r5 = "invoke"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x00c7:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C3390xa3330825.invoke():java.lang.Object");
    }
}
