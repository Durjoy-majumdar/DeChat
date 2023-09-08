package com.tencent.p014mm.plugin.webview.luggage;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import di3.C86312j;
import pb1.C100714h1;

/* renamed from: com.tencent.mm.plugin.webview.luggage.i0 */
class C5875i0 implements C80883e<Bundle, Bundle> {
    private C5875i0() {
    }

    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 1, bundle.getString("image_path", ""));
        doFavoriteEvent.publish();
        bundle.putInt("fav_simple_img_result", doFavoriteEvent.f264675e.f9046a);
        gVar.mo894a(bundle);
    }
}
