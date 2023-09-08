package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import java.util.ArrayList;
import p441aq.C92054g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.y */
public class C29877y implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f80951d;

    public C29877y(EmojiCustomUI emojiCustomUI, ArrayList arrayList) {
        this.f80951d = arrayList;
    }

    public void run() {
        for (int i = 0; i < this.f80951d.size(); i++) {
            Log.m105925i("MicroMsg.emoji.EmojiCustomUI", "delete md5List md5:%s", this.f80951d.get(i));
            ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO((String) this.f80951d.get(i));
            C115669n.INSTANCE.mo160131h(10613, this.f80951d.get(i), TO.field_groupId, TO.field_designerID, TO.field_activityid);
        }
    }
}
