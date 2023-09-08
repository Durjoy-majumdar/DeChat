package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.graphics.Bitmap;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$j */
public class u$g$$j implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ C74244u.C74255e f250023a;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.u$g$$j$a */
    public class C85837a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f250024d;

        public C85837a(Bitmap bitmap) {
            this.f250024d = bitmap;
        }

        public void run() {
            if (!this.f250024d.isRecycled()) {
                u$g$$j.this.f250023a.f218043W.setImageBitmap(this.f250024d);
            }
        }
    }

    public u$g$$j(C74244u.C74261g gVar, C74244u.C74255e eVar) {
        this.f250023a = eVar;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        MMHandlerThread.postToMainThread(new C85837a(bitmap));
    }
}
