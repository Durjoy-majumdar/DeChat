package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C87412m;
import i61.C98602h;
import java.io.File;
import java.util.Set;
import p260wk.C102457e;
import p441aq.C92054g;
import p823sg.C90193h;
import z04.C119027c;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.model.w */
public final class C93120w extends IStaticListener<FTSEmojiDownloadedEvent> {
    public boolean callback(IEvent iEvent) {
        FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent = (FTSEmojiDownloadedEvent) iEvent;
        Class cls = C92054g.class;
        C87412m.m108594g(fTSEmojiDownloadedEvent, "event");
        EmojiInfo emojiInfo = new EmojiInfo();
        FTSEmojiDownloadedEvent.C1032a aVar = fTSEmojiDownloadedEvent.f9141d;
        emojiInfo.field_designerID = aVar.f9144b;
        emojiInfo.field_name = aVar.f9146d;
        emojiInfo.field_aeskey = aVar.f9147e;
        emojiInfo.field_encrypturl = aVar.f9148f;
        emojiInfo.field_thumbUrl = aVar.f9145c;
        emojiInfo.field_md5 = aVar.f9149g;
        emojiInfo.field_groupId = aVar.f9150h;
        ((C92054g) C86312j.m106911c(cls)).getClass();
        EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(emojiInfo.getMd5());
        int i = fTSEmojiDownloadedEvent.f9141d.f9143a;
        if (i == 3) {
            String K1 = emojiInfo.mo62640K1();
            if (TO == null || (TO.field_reserved4 & 1) != 1) {
                fTSEmojiDownloadedEvent.f9142e.f9151a = K1;
            } else {
                File cacheDir = MMApplicationContext.getContext().getCacheDir();
                String str = fTSEmojiDownloadedEvent.f9141d.f9149g;
                C87412m.m108593f(str, "event.data.md5");
                byte[] bytes = str.getBytes(C119027c.f356488a);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                String i2 = new C86009m1(cacheDir, C90193h.m112878f(bytes)).mo119971i();
                C87412m.m108593f(i2, "VFSFile(\n               …           ).absolutePath");
                if (C86013q1.m106450k(K1) && !C86013q1.m106450k(i2)) {
                    C86013q1.m106440a(i2, ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138041z(TO));
                }
                fTSEmojiDownloadedEvent.f9142e.f9151a = i2;
            }
            Log.m105925i("MicroMsg.FTS.FTSEmojiLogic", "gen path: %s", fTSEmojiDownloadedEvent.f9142e.f9151a);
        } else if (i == 1) {
            Log.m105925i("MicroMsg.FTS.FTSEmojiLogic", "emoji download: %s", emojiInfo.getMd5());
            Set<String> set = C93121y.f268266a;
            C87412m.m108591d(set);
            String md5 = emojiInfo.getMd5();
            C87412m.m108593f(md5, "emojiInfo.md5");
            set.add(md5);
            if (TO == null) {
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C30790w2.m39221h().mo57717d().mo142040Ow(emojiInfo);
            }
            C102457e.f301712a.mo142073e(emojiInfo, new C93119v(emojiInfo));
        }
        return false;
    }
}
