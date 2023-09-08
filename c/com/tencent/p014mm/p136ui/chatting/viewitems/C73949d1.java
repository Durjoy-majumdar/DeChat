package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C97625j3;
import i21.C98591h;
import i61.C76299g;
import i61.C98602h;
import ky2.C10432i;
import p260wk.C102457e;
import p441aq.C92054g;
import z51.C39315g;
import zc3.C39343a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d1 */
public class C73949d1 extends C73684f2 {
    public C73949d1(C67391b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        C74243t8 t8Var = (C74243t8) view.getTag();
        Class cls = C10432i.class;
        if (C97625j3.m125812b().mo105883I()) {
            if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
                Log.m105924i("MicroMsg.AppEmojClickListener", "exit in teen mode");
                ((C10432i) C86312j.m106911c(cls)).mo10755m4(this.f216339d.mo91565f());
                return;
            }
            C72963f4 f4Var2 = t8Var.f212238a;
            String r = C72996z1.m85820U5(f4Var2.mo108768t()) ? this.f216339d.mo91577r() : null;
            C39343a cm = ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm();
            Activity f = this.f216339d.mo91565f();
            ((C98602h) cm).getClass();
            Class cls2 = C92054g.class;
            if (f != null) {
                C72989o2 o2Var = new C72989o2(f4Var2.getContent());
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var2.getContent(), (String) null);
                if (u == null) {
                    u = new C68070l.C68072b();
                    u.f195610p = o2Var.f212821d;
                }
                ((C92054g) C86312j.m106911c(cls2)).getClass();
                EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(u.f195610p);
                if (TO == null || !TO.mo62633C1()) {
                    ((C92054g) C86312j.m106911c(cls2)).getClass();
                    EmojiInfo TO2 = C30790w2.m39221h().mo57717d().mo142044TO(u.f195610p);
                    if (TO2 == null) {
                        String str = u.f195610p;
                        if (Util.isNullOrNil(str)) {
                            Log.m105920e("MicroMsg.emoji.EmojiMgrImpl", "md5 is null.");
                        } else {
                            EmojiInfo emojiInfo = new EmojiInfo();
                            emojiInfo.field_md5 = str;
                            emojiInfo.field_app_id = u.f195562d;
                            emojiInfo.field_catalog = 65;
                            emojiInfo.field_size = u.f195594l;
                            emojiInfo.field_temp = 1;
                            emojiInfo.field_state = 8;
                            ((C92054g) C86312j.m106911c(cls2)).getClass();
                            C30790w2.m39221h().mo57717d().insert(emojiInfo);
                            TO2 = emojiInfo;
                        }
                    }
                    C98602h.m128142N(TO2.field_md5, 0, 0);
                    Log.m105919d("MicroMsg.emoji.EmojiMgrImpl", "start change cdn url. md5:%s", TO2.field_md5);
                    C102457e.f301712a.mo142074f(TO2, true, new C76299g(TO2.field_md5));
                } else if (f4Var2.mo108769t2() == 1) {
                    C98602h.m128143R(f, u.f195610p, u.f195562d, u.f195484F, f4Var2.mo108774y2(), f4Var2.mo108768t(), f4Var2.getContent(), r);
                } else {
                    C98602h.m128143R(f, TO.getMd5(), u.f195562d, u.f195484F, f4Var2.mo108774y2(), f4Var2.mo108768t(), f4Var2.getContent(), r);
                }
            } else {
                Log.m105928w("MicroMsg.emoji.EmojiMgrImpl", "context or msg is null");
            }
            C115669n.INSTANCE.mo160131h(11592, 0);
        }
    }
}
