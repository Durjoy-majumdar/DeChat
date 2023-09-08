package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.plugin.appbrand.page.C83810g4;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/headless/k;", "Lcom/tencent/mm/plugin/appbrand/page/t1;", "Lcom/tencent/mm/plugin/appbrand/headless/j;", "page", "<init>", "(Lcom/tencent/mm/plugin/appbrand/headless/j;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.headless.k */
public final class C81915k extends C83928t1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81915k(C81914j jVar) {
        super(C81916l.class);
        C87412m.m108594g(jVar, "page");
        C83810g4 decorWidgetFactory = jVar.getPageContainer().getDecorWidgetFactory();
        this.f244576W = decorWidgetFactory == null ? new C83810g4.C83811a() : decorWidgetFactory;
        this.f244572U = jVar;
    }
}
