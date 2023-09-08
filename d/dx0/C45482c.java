package dx0;

import android.content.Context;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: dx0.c */
public final class C45482c extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f123106d;

    /* renamed from: e */
    public final /* synthetic */ String f123107e;

    /* renamed from: f */
    public final /* synthetic */ String f123108f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45482c(String str, String str2, String str3) {
        super(0);
        this.f123106d = str;
        this.f123107e = str2;
        this.f123108f = str3;
    }

    public Object invoke() {
        BizTLRecCardJsEngine a = BizTLRecCardJsEngine.f247961Y.mo118094a();
        String str = this.f123106d;
        String str2 = this.f123107e;
        String str3 = this.f123108f;
        Context context = MMApplicationContext.getContext();
        C87412m.m108593f(context, "getContext()");
        a.mo123863O1(str, str2, str3, context);
        return C13598b0.f38549a;
    }
}
