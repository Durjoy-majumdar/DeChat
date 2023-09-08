package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82739n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import p225rc.C89916g;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.s */
public final class C82761s<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C82777y f242089a;

    public C82761s(C82777y yVar) {
        this.f242089a = yVar;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        C46888b c = C88643g.m110545c();
        C82777y yVar = this.f242089a;
        int i = yVar.f242127d;
        int i2 = 2;
        if (i != 2) {
            i2 = i == 1 ? 1 : 3;
        }
        int i3 = yVar.f242128e ? 8 : 7;
        Intent intent = new Intent();
        C82777y yVar2 = this.f242089a;
        intent.setClassName(yVar2.f242124a.getContext(), "com.tencent.mm.plugin.gallery.ui.GalleryEntryUI");
        intent.putExtra("gallery_report_tag", 16);
        intent.putExtra("key_send_raw_image", yVar2.f242128e);
        intent.putExtra("max_select_count", yVar2.f242130g);
        intent.putExtra("query_source_type", i3);
        intent.putExtra("query_media_type", i2);
        intent.putExtra("show_header_view", false);
        intent.putExtra("album_video_max_duration", 86400);
        intent.putExtra("album_business_tag", "album_business_bubble_media_by_jsapi_choosevideo");
        Activity castActivityOrNull = AndroidContextUtil.castActivityOrNull(this.f242089a.f242124a.getContext());
        if (castActivityOrNull == null) {
            Log.m105920e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goAlbumUI context !is activity");
            C82739n.C82741b bVar = new C82739n.C82741b("fail:internal error invalid android context");
            c.mo72093c(bVar);
            return bVar;
        }
        C89916g.m112446a(castActivityOrNull).mo124236j(intent, new C82757r(c));
        return C82739n.C82740a.f242060a;
    }
}
