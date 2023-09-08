package com.tencent.p014mm.p136ui.chatting;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import hd0.C98408n0;
import hd0.C98410o0;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import ub1.C78142a;

/* renamed from: com.tencent.mm.ui.chatting.o3 */
public class C73770o3 implements C101489t.C77595a {

    /* renamed from: d */
    public final /* synthetic */ C78142a f216536d;

    /* renamed from: e */
    public final /* synthetic */ Object f216537e;

    /* renamed from: f */
    public final /* synthetic */ C73764n3 f216538f;

    /* renamed from: com.tencent.mm.ui.chatting.o3$a */
    public class C73771a implements Runnable {
        public C73771a() {
        }

        public void run() {
            C73770o3 o3Var = C73770o3.this;
            o3Var.f216538f.mo102816d(o3Var.f216537e, o3Var.f216536d);
        }
    }

    public C73770o3(C73764n3 n3Var, C78142a aVar, Object obj) {
        this.f216538f = n3Var;
        this.f216536d = aVar;
        this.f216537e = obj;
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        if (this.f216536d.f228992d.mo108765s2().equals(aVar.f226215a)) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a);
            if (Zd == null || !Zd.mo137710n()) {
                Log.m105925i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav fialed msgID:%d, fileName:%s", Long.valueOf(this.f216536d.f228992d.getMsgId()), aVar.f226215a);
                return;
            }
            Log.m105925i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav suc msgID:%d, fileName:%s", Long.valueOf(this.f216536d.f228992d.getMsgId()), aVar.f226215a);
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
            new MMHandler(Looper.getMainLooper()).post(new C73771a());
        }
    }
}
