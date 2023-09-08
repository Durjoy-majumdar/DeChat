package com.tencent.p014mm.accessibility.core.provider;

import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.ContentDescProvider$getContentDesc$3 */
public final class ContentDescProvider$getContentDesc$3 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ Object $content;
    public final /* synthetic */ C8479f0<String> $contentDesc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentDescProvider$getContentDesc$3(C8479f0<String> f0Var, Object obj) {
        super(1);
        this.$contentDesc = f0Var;
        this.$content = obj;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, LocaleUtil.ITALIAN);
        C8479f0<String> f0Var = this.$contentDesc;
        T t = (String) mMBaseAccessibilityConfig.getParamMap$plugin_autoaccessibility_release().get(this.$content);
        if (t == null) {
            return Boolean.FALSE;
        }
        f0Var.f27484d = t;
        return Boolean.TRUE;
    }
}
