package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import java.util.Locale;
import kg3.C76577a;
import lb0.C88394b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$i */
public class u$g$$i implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C74244u.C74255e f250020d;

    /* renamed from: e */
    public final /* synthetic */ boolean f250021e;

    /* renamed from: f */
    public final /* synthetic */ C67391b f250022f;

    public u$g$$i(C74244u.C74261g gVar, C74244u.C74255e eVar, boolean z, C67391b bVar) {
        this.f250020d = eVar;
        this.f250021e = z;
        this.f250022f = bVar;
    }

    /* renamed from: b */
    public void mo1907b() {
    }

    /* renamed from: d */
    public void mo1908d() {
    }

    public String key() {
        return String.format(Locale.ENGLISH, "CHATTING_ITEM_APPMSG_APPBRAND_COVER[%d %d]", new Object[]{240, 192});
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.f250020d.f218030J.setVisibility(4);
            this.f250020d.f218032L.setVisibility(0);
            this.f250020d.f218031K.setVisibility(8);
            return;
        }
        this.f250020d.f218030J.setImageBitmap(bitmap);
        this.f250020d.f218030J.setVisibility(0);
        this.f250020d.f218032L.setVisibility(4);
        if (this.f250021e) {
            this.f250020d.f218031K.setImageDrawable(C76577a.m92158i(this.f250022f.mo91565f(), C0966R.raw.shortvideo_play_btn));
            this.f250020d.f218031K.setVisibility(0);
            return;
        }
        this.f250020d.f218031K.setVisibility(8);
    }
}
