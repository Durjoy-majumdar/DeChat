package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Intent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "username", "Lrx3/b0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1 */
final class FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveWeCoinHotConstract.ViewCallback f16106d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveMemebrProfileWidget f16107e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveWeCoinHotConstract$ViewCallback$initView$4$1(FinderLiveWeCoinHotConstract.ViewCallback viewCallback, FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget) {
        super(1);
        this.f16106d = viewCallback;
        this.f16107e = finderLiveMemebrProfileWidget;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        if (!(str == null || str.length() == 0)) {
            FinderLiveWeCoinHotConstract.ViewCallback viewCallback = this.f16106d;
            if (viewCallback.f16090e != null) {
                MMActivity mMActivity = viewCallback.f16089d;
                C87412m.m108594g(mMActivity, "context");
                C87412m.m108594g(str, "finderUsername");
                Intent intent = new Intent();
                intent.putExtra("report_scene", 0);
                intent.putExtra("finder_username", str);
                intent.putExtra("key_enter_profile_type", 11);
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(mMActivity, intent);
            }
        } else {
            String str2 = this.f16107e.f15407i;
            Log.m105920e(str2, "gotoProfileCallback username:" + str);
        }
        return C13598b0.f38549a;
    }
}
