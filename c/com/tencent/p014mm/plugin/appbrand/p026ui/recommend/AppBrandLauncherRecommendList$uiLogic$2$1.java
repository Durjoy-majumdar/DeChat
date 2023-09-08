package com.tencent.p014mm.plugin.appbrand.p026ui.recommend;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandLauncherRecommendList$uiLogic$2$1", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandLauncherRecommendList$uiLogic$2$1 */
public final class AppBrandLauncherRecommendList$uiLogic$2$1 extends AppBrandRecommendUILogic {

    /* renamed from: y */
    public final boolean f246993y = true;

    /* renamed from: z */
    public final /* synthetic */ AppBrandLauncherRecommendList f246994z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandLauncherRecommendList$uiLogic$2$1(AppBrandLauncherRecommendList appBrandLauncherRecommendList, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f246994z = appBrandLauncherRecommendList;
    }

    /* renamed from: c */
    public View mo117371c() {
        return this.f246994z.f246391g;
    }

    /* renamed from: d */
    public String mo117372d() {
        String string = this.f246994z.getString(C0966R.string.f7843th);
        C87412m.m108593f(string, "this@AppBrandLauncherRec…header_text_all_use_hint)");
        return string;
    }

    /* renamed from: f */
    public boolean mo117373f() {
        return this.f246993y;
    }
}
