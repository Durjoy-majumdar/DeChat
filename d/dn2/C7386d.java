package dn2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p910lj.C76701a;
import pb1.C100714h1;
import rx3.C13598b0;

/* renamed from: dn2.d */
public final class C7386d extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C7373a f25525d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7386d(C7373a aVar) {
        super(1);
        this.f25525d = aVar;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, LocaleUtil.ITALIAN);
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 32, str);
        doFavoriteEvent.f264674d.f264688m = 44;
        doFavoriteEvent.publish();
        Log.m105925i("MicroMsg.ColorfulSelfQRCodeDialogHelper", "[fav] path:%s", str);
        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f25525d.f25505a.getResources().getString(C0966R.string.cmh), 1).show();
        return C13598b0.f38549a;
    }
}
