package com.tencent.p014mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;
import p196ln.C76708i;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/g;", "callback", "Lrx3/b0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.model.w0 */
final class C6064w0<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C6064w0<InputType, ResultType> f22362d = new C6064w0<>();

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = new Bundle();
        bundle2.putString("userName", C75592q0.m90783m());
        Object e = C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
        C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.String");
        bundle2.putString("userIcon", ((C76708i) C86312j.m106911c(C76708i.class)).mo106845oX(Util.nullAs((String) e, ""), false));
        gVar.mo894a(bundle2);
    }
}
