package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C9515s;
import lb0.C88394b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$f$$i */
public class u$f$$i implements C88394b.C88411m {

    /* renamed from: d */
    public final /* synthetic */ C74244u.C74255e f250001d;

    public u$f$$i(C74244u.C74260f fVar, C74244u.C74255e eVar) {
        this.f250001d = eVar;
    }

    /* renamed from: b */
    public void mo1907b() {
        Log.m105928w("MicroMsg.ChattingItemAppMsgFrom", "hy: decode recorder cover failed receiver!");
        C115669n.INSTANCE.mo175911u(808, 2);
    }

    /* renamed from: d */
    public void mo1908d() {
        this.f250001d.f218042V.setVisibility(4);
    }

    public String key() {
        return "CHAT#" + C9515s.m9209a(this);
    }

    public void onBitmapLoaded(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f250001d.f218042V.setImageBitmap(bitmap);
            this.f250001d.f218042V.setVisibility(0);
        }
    }
}
