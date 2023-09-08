package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kotlin.Metadata;
import sx3.C110818d0;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider$findDescList$1 */
public final class ContentDescProvider$findDescList$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ View[] $outRootView;
    public final /* synthetic */ C8479f0<Object> $res;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentDescProvider$findDescList$1(View view, View[] viewArr, C8479f0<Object> f0Var) {
        super(1);
        this.$view = view;
        this.$outRootView = viewArr;
        this.$res = f0Var;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, LocaleUtil.ITALIAN);
        Map map = mMBaseAccessibilityConfig.getViewRootDescMap$plugin_autoaccessibility_release().get(Integer.valueOf(this.$view.getId()));
        if (map == null) {
            return Boolean.FALSE;
        }
        View findRoot$plugin_autoaccessibility_release = mMBaseAccessibilityConfig.findRoot$plugin_autoaccessibility_release(this.$view, C110818d0.m150953y0(map.keySet()));
        if (findRoot$plugin_autoaccessibility_release == null) {
            return Boolean.FALSE;
        }
        this.$outRootView[0] = findRoot$plugin_autoaccessibility_release;
        C8479f0<Object> f0Var = this.$res;
        T t = map.get(Integer.valueOf(findRoot$plugin_autoaccessibility_release.getId()));
        if (t == null) {
            t = map.get(ContentDescProvider.INSTANCE.getLayoutId(findRoot$plugin_autoaccessibility_release));
        }
        f0Var.f27484d = t;
        ContentDescProvider contentDescProvider = ContentDescProvider.INSTANCE;
        ContentDescProvider.curConfigName = mMBaseAccessibilityConfig.getClass().getName();
        return Boolean.TRUE;
    }
}
