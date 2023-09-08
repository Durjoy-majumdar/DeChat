package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import i21.C98591h;
import i61.C98602h;
import ke3.C88144b;
import ky2.C10432i;
import uj3.C78208e;
import z51.C39315g;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b6 */
public class C73935b6 extends C73684f2 {
    public C73935b6(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        mo103014b((C74243t8) view.getTag());
    }

    /* renamed from: b */
    public final void mo103014b(C74243t8 t8Var) {
        Class cls = C10432i.class;
        if (C97625j3.m125812b().mo105883I()) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(t8Var.f212238a.mo108768t());
            if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
                Log.m105924i("MicroMsg.EmojiClickListener", "exit in teen mode");
                ((C10432i) C86312j.m106911c(cls)).mo10755m4(this.f216339d.mo91565f());
                return;
            }
            EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo137999G(t8Var.f212238a.mo108765s2());
            if (G != null && !G.mo62678k()) {
                Intent intent = new Intent();
                intent.putExtra("custom_smiley_preview_md5", t8Var.f212238a.mo108765s2());
                intent.putExtra("custom_to_talker_name", t8Var.f212238a.mo108768t());
                int i = G.field_catalog;
                if (!(i == 81 || i == 18 || i == 17)) {
                    intent.putExtra("custom_smiley_preview_productid", G.field_groupId);
                }
                intent.putExtra("msg_id", t8Var.f212238a.mo108774y2());
                intent.putExtra("msg_content", t8Var.f212238a.getContent());
                String t = t8Var.f212238a.mo108768t();
                if (C72996z1.m85820U5(t)) {
                    t = C75604z3.m90847s(t8Var.f212238a.getContent());
                    intent.putExtra("room_id", this.f216339d.mo91577r());
                }
                intent.putExtra("msg_sender", t);
                intent.putExtra("talker_username", this.f216339d.mo91577r());
                C88144b.m109795m(this.f216339d.mo91565f(), "emoji", ".ui.CustomSmileyPreviewUI", intent, 1111);
                C115669n.INSTANCE.mo160131h(11592, 0);
            }
        }
    }

    public C73935b6(C67391b bVar, int i, C72963f4 f4Var) {
        super(bVar);
        if (i == 1) {
            mo103014b(new C74243t8(f4Var, bVar.mo91583x(), C78208e.C78209a.f229159a, this.f216339d.mo91573n(), false));
        }
    }
}
