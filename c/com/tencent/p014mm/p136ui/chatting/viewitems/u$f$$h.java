package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$f$$h */
public class u$f$$h implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ C74244u.C74255e f249998a;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$f$$h$a */
    public class C85835a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f249999d;

        public C85835a(Bitmap bitmap) {
            this.f249999d = bitmap;
        }

        public void run() {
            if (!this.f249999d.isRecycled()) {
                u$f$$h.this.f249998a.f218043W.setImageBitmap(this.f249999d);
            }
        }
    }

    public u$f$$h(C74244u.C74260f fVar, C74244u.C74255e eVar) {
        this.f249998a = eVar;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        MMHandlerThread.postToMainThread(new C85835a(bitmap));
    }
}
