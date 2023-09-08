package a61;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.UploadEmojiMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import p441aq.C92054g;

/* renamed from: a61.y0 */
public class C67007y0 extends IStaticListener<UploadEmojiMsgEvent> {
    public boolean callback(IEvent iEvent) {
        Class cls = C92054g.class;
        C72963f4 f4Var = ((UploadEmojiMsgEvent) iEvent).f194000d.f194001a;
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(f4Var.mo108765s2());
        if (TO != null) {
            if (TO.field_type == 1) {
                Cursor cursor = null;
                if (EmojiInfo.m124590n2(TO.field_catalog)) {
                    ((C92054g) C86312j.m106911c(cls)).getClass();
                    cursor = C30790w2.m39221h().mo57717d().mo142054fY(TO.field_catalog);
                } else if (TO.field_catalog == 17 && TO.getContent().length() > 0 && EmojiInfo.m124590n2(Util.getInt(TO.getContent(), 0))) {
                    ((C92054g) C86312j.m106911c(cls)).getClass();
                    cursor = C30790w2.m39221h().mo57717d().mo142054fY(Util.getInt(TO.getContent(), 0));
                }
                if (cursor != null) {
                    int intRandom = Util.getIntRandom(cursor.getCount() - 1, 0);
                    EmojiInfo emojiInfo = new EmojiInfo();
                    cursor.moveToPosition(intRandom);
                    emojiInfo.convertFrom(cursor);
                    cursor.close();
                    TO = emojiInfo;
                }
                f4Var.mo108739S2(TO.getMd5());
                f4Var.mo108743W2(0);
                C72989o2 o2Var = new C72989o2(f4Var.getContent());
                o2Var.f212820c = false;
                f4Var.mo100991d(1);
                f4Var.mo108732L2(o2Var.mo101198e());
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
            }
            ((C92054g) C86312j.m106911c(cls)).xx0().mo138011S(f4Var.mo108768t(), TO, f4Var);
        }
        return false;
    }
}
