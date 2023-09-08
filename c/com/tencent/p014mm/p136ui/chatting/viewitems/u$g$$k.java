package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C9515s;
import lb0.C88394b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$k */
public class u$g$$k implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C74244u.C74255e f250026d;

    public u$g$$k(C74244u.C74261g gVar, C74244u.C74255e eVar) {
        this.f250026d = eVar;
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105928w("MicroMsg.ChattingItemAppMsgTo", "hy: decode recorder cover failed sender!");
        C115669n.INSTANCE.mo175911u(808, 3);
    }

    /* renamed from: d */
    public void mo1908d() {
        this.f250026d.f218042V.setVisibility(4);
    }

    public String key() {
        return "CHAT#" + C9515s.m9209a(this);
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f250026d.f218042V.setImageBitmap(bitmap);
            this.f250026d.f218042V.setVisibility(0);
        }
    }
}
