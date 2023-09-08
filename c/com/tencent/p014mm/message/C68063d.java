package com.tencent.p014mm.message;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import java.util.Map;
import p1081gi.C98121d;
import p287zz.C79445i;
import p441aq.C92054g;

/* renamed from: com.tencent.mm.message.d */
public class C68063d extends C68066g {

    /* renamed from: b */
    public EmojiInfo f195410b;

    /* renamed from: c */
    public int f195411c = 0;

    /* renamed from: a */
    public C68066g mo7615a() {
        return new C68063d();
    }

    /* renamed from: c */
    public void mo7616c(StringBuilder sb, C68070l.C68072b bVar, String str, C98121d dVar, int i, int i2) {
        if (bVar.f195582i == 2001) {
            C79445i iVar = (C79445i) C86312j.m106911c(C79445i.class);
            EmojiInfo emojiInfo = this.f195410b;
            if (emojiInfo == null) {
                emojiInfo = new EmojiInfo();
            }
            iVar.mo109194oB(sb, emojiInfo, this.f195411c);
        }
    }

    /* renamed from: d */
    public void mo7617d(Map<String, String> map, C68070l.C68072b bVar) {
        Class cls = C92054g.class;
        if (bVar.f195582i == 2001) {
            EmojiInfo emojiInfo = new EmojiInfo();
            emojiInfo.field_md5 = Util.nullAsNil(map.get(".msg.appmsg.emoji.md5"));
            emojiInfo.field_type = Util.getInt(map.get(".msg.appmsg.emoji.type"), 0);
            emojiInfo.field_width = Util.getInt(map.get(".msg.appmsg.emoji.width"), 0);
            emojiInfo.field_height = Util.getInt(map.get(".msg.appmsg.emoji.height"), 0);
            emojiInfo.field_size = Util.getInt(map.get(".msg.appmsg.emoji.len"), 0);
            emojiInfo.field_aeskey = Util.nullAsNil(map.get(".msg.appmsg.emoji.aeskey"));
            emojiInfo.field_cdnUrl = Util.nullAsNil(map.get(".msg.appmsg.emoji.cdnurl"));
            emojiInfo.field_encrypturl = Util.nullAsNil(map.get(".msg.appmsg.emoji.encrypturl"));
            emojiInfo.field_externUrl = Util.nullAsNil(map.get(".msg.appmsg.emoji.externurl"));
            emojiInfo.field_externMd5 = Util.nullAsNil(map.get(".msg.appmsg.emoji.externmd5"));
            emojiInfo.field_groupId = Util.nullAsNil(map.get(".msg.appmsg.emoji.productid"));
            emojiInfo.field_designerID = Util.nullAsNil(map.get(".msg.appmsg.emoji.designerid"));
            emojiInfo.field_attachedText = Util.nullAsNil(map.get(".msg.appmsg.emoji.attachedtext"));
            emojiInfo.field_temp = 1;
            emojiInfo.field_catalog = 65;
            emojiInfo.field_state = 8;
            this.f195410b = emojiInfo;
            this.f195411c = Util.getInt(map.get(".msg.appmsg.emoji.localreceivestatus"), 0);
            if (map.get(".msg.appmsg.emoji.localreceivestatus") == null && map.get(".msg.appmsg.wcpayinfo.receivestatus") != null) {
                this.f195411c = Util.getInt(map.get(".msg.appmsg.wcpayinfo.receivestatus"), 0);
            }
            ((C92054g) C86312j.m106911c(cls)).getClass();
            if (C30790w2.m39221h().mo57717d().mo142044TO(emojiInfo.field_md5) == null) {
                ((C92054g) C86312j.m106911c(cls)).getClass();
                C30790w2.m39221h().mo57717d().mo142040Ow(this.f195410b);
            }
        }
    }
}
