package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import fy3.C32226l;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;", "Lcm1/i2;", "it", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$2 */
final class C3392xa3330be6 extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikedFeedContract.LikedTimelinePresenter f15998d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3392xa3330be6(FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter) {
        super(1);
        this.f15998d = likedTimelinePresenter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r11 = r11.mo3741p().getLoadMoreFooter();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r11 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r11
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r11, r0)
            boolean r11 = r11.getHasMore()
            if (r11 != 0) goto L_0x00d4
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r11 = r10.f15998d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r11 = r11.f15984p
            r0 = 2131308010(0x7f092dea, float:1.8234263E38)
            if (r11 == 0) goto L_0x002e
            com.tencent.mm.view.RefreshLoadMoreLayout r11 = r11.mo3741p()
            android.view.View r11 = r11.getLoadMoreFooter()
            if (r11 == 0) goto L_0x002e
            android.view.View r11 = r11.findViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x002e
            r1 = 2131829092(0x7f112164, float:1.9291143E38)
            r11.setText(r1)
        L_0x002e:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r11 = r10.f15998d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r11 = r11.f15984p
            if (r11 == 0) goto L_0x0058
            com.tencent.mm.view.RefreshLoadMoreLayout r11 = r11.mo3741p()
            android.view.View r11 = r11.getLoadMoreFooter()
            if (r11 == 0) goto L_0x0058
            android.view.View r11 = r11.findViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            if (r11 == 0) goto L_0x0058
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099806(0x7f06009e, float:1.7811976E38)
            int r1 = r1.getColor(r2)
            r11.setTextColor(r1)
        L_0x0058:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r11 = r10.f15998d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r11 = r11.f15984p
            r1 = 0
            if (r11 == 0) goto L_0x0070
            com.tencent.mm.view.RefreshLoadMoreLayout r11 = r11.mo3741p()
            android.view.View r11 = r11.getLoadMoreFooter()
            if (r11 == 0) goto L_0x0070
            android.view.View r11 = r11.findViewById(r0)
            android.widget.TextView r11 = (android.widget.TextView) r11
            goto L_0x0071
        L_0x0070:
            r11 = r1
        L_0x0071:
            if (r11 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r0 = 8
            r11.setVisibility(r0)
        L_0x0079:
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelinePresenter r11 = r10.f15998d
            com.tencent.mm.plugin.finder.presenter.contract.FinderLikedFeedContract$LikedTimelineViewCallback r11 = r11.f15984p
            if (r11 == 0) goto L_0x0090
            com.tencent.mm.view.RefreshLoadMoreLayout r11 = r11.mo3741p()
            android.view.View r11 = r11.getLoadMoreFooter()
            if (r11 == 0) goto L_0x0090
            r0 = 2131308008(0x7f092de8, float:1.823426E38)
            android.view.View r1 = r11.findViewById(r0)
        L_0x0090:
            if (r1 != 0) goto L_0x0093
            goto L_0x00d4
        L_0x0093:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r11.mo10233c(r2)
            java.lang.Object[] r3 = r11.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$2"
            java.lang.String r5 = "invoke"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r11 = r11.mo10231a(r0)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r1.setVisibility(r11)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/presenter/contract/FinderLikedFeedContract$LikedTimelinePresenter$createFeedLoader$2$2"
            java.lang.String r4 = "invoke"
            java.lang.String r5 = "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x00d4:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.presenter.contract.C3392xa3330be6.invoke(java.lang.Object):java.lang.Object");
    }
}
