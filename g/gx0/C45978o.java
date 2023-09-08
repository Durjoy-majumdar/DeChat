package gx0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.brandservice.p028ui.BizSearchResultItemContainer;
import com.tencent.p014mm.plugin.brandservice.p028ui.SearchOrRecommendBizUI;
import f40.C86709a0;

/* renamed from: gx0.o */
public class C45978o implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SearchOrRecommendBizUI f123996d;

    public C45978o(SearchOrRecommendBizUI searchOrRecommendBizUI) {
        this.f123996d = searchOrRecommendBizUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        BizSearchResultItemContainer bizSearchResultItemContainer = this.f123996d.f109170g;
        bizSearchResultItemContainer.getClass();
        C86709a0.m107524d().mo123458d(bizSearchResultItemContainer.f109056i);
        bizSearchResultItemContainer.f109054g.f109072e = false;
    }
}
