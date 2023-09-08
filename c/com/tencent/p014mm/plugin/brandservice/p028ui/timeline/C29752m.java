package com.tencent.p014mm.plugin.brandservice.p028ui.timeline;

import com.tencent.p014mm.storage.C19627t;
import fy3.C32224a;
import gy3.C87413o;
import java.util.Map;
import nj3.C76879j;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.m */
public final class C29752m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizTestUI f80758d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29752m(BizTestUI bizTestUI) {
        super(0);
        this.f80758d = bizTestUI;
    }

    public Object invoke() {
        C19627t.f55586a.mo25847u((Map<String, String>) null, "\n                <sysmsg type=\"BizAdNotify\">\n                    <BizAdNotify>\n                        <previewMode>0</previewMode>\n                        <adCmd><![CDATA[testCmd]]></adCmd>\n                    </BizAdNotify>\n                </sysmsg>\n                ");
        C76879j.m92726T(this.f80758d, "Exited ad preview mode!");
        return C13598b0.f38549a;
    }
}
