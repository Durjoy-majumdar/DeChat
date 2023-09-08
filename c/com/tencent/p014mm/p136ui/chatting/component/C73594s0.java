package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import hd0.C98408n0;
import hd0.C98410o0;
import java.util.HashSet;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;

/* renamed from: com.tencent.mm.ui.chatting.component.s0 */
public class C73594s0 implements C101489t.C77595a {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f216106d;

    /* renamed from: e */
    public final /* synthetic */ HashSet f216107e;

    /* renamed from: f */
    public final /* synthetic */ C73588r0 f216108f;

    public C73594s0(C73588r0 r0Var, C72963f4 f4Var, HashSet hashSet) {
        this.f216108f = r0Var;
        this.f216106d = f4Var;
        this.f216107e = hashSet;
    }

    /* renamed from: d5 */
    public void mo102579d5(C101489t.C77595a.C77596a aVar) {
        if (this.f216106d.mo108765s2().equals(aVar.f226215a)) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a);
            if (Zd == null || !Zd.mo137710n()) {
                Log.m105925i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadVideoAndFav fialed msgID:%d, fileName:%s", Long.valueOf(this.f216106d.getMsgId()), aVar.f226215a);
            } else {
                Log.m105925i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadVideoAndFav suc msgID:%d, fileName:%s", Long.valueOf(this.f216106d.getMsgId()), aVar.f226215a);
            }
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
            this.f216107e.remove(Long.valueOf(this.f216106d.getMsgId()));
            this.f216108f.mo102574a(this.f216107e);
        }
    }
}
