package com.tencent.p014mm.plugin.finder.nearby.video;

import bh3.C113177k;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"", "kotlin.jvm.PlatformType", "it", "Lrx3/b0;", "onOp", "(Ljava/lang/Boolean;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$checkAndShowBusinessPermissionDialog$1 */
public final class NearbyVideoPresenter$checkAndShowBusinessPermissionDialog$1 implements C113177k.C113181e {
    public final /* synthetic */ NearbyVideoPresenter this$0;

    public NearbyVideoPresenter$checkAndShowBusinessPermissionDialog$1(NearbyVideoPresenter nearbyVideoPresenter) {
        this.this$0 = nearbyVideoPresenter;
    }

    public final void onOp(Boolean bool) {
        C87412m.m108593f(bool, LocaleUtil.ITALIAN);
        if (bool.booleanValue()) {
            BaseFeedLoader.requestInit$default(this.this$0.getFeedLoader(), false, 1, (Object) null);
            return;
        }
        NearbyVideoPresenter nearbyVideoPresenter = this.this$0;
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24947b = -2;
        nearbyVideoPresenter.checkEmptyHeader(cVar);
    }
}
