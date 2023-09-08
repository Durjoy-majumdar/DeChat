package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import gy3.C87412m;
import p911ml.C99914f;
import p911ml.C99917g;
import qn3.C101208b;
import te3.C101800k70;

/* renamed from: com.tencent.mm.plugin.emoji.ui.s */
public class C93211s implements C101208b.C101209a {

    /* renamed from: a */
    public final /* synthetic */ C101800k70 f268772a;

    /* renamed from: b */
    public final /* synthetic */ EmojiAddCustomDialogUI f268773b;

    /* renamed from: com.tencent.mm.plugin.emoji.ui.s$a */
    public class C93212a implements C99914f.C99915a {
        public C93212a() {
        }

        /* renamed from: a */
        public void mo91183a(int i, String str) {
            Log.m105925i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload result: errorType=%d, md5=%s", Integer.valueOf(i), str);
            if (i == 0) {
                C93211s sVar = C93211s.this;
                EmojiAddCustomDialogUI.m117580F7(sVar.f268773b, str, sVar.f268772a);
            } else if (i == 2) {
                EmojiAddCustomDialogUI.m117579E7(C93211s.this.f268773b);
            } else if (i == 3) {
                EmojiAddCustomDialogUI emojiAddCustomDialogUI = C93211s.this.f268773b;
                int i2 = EmojiAddCustomDialogUI.f268385t;
                emojiAddCustomDialogUI.mo127691K7();
            } else {
                EmojiAddCustomDialogUI.m117581G7(C93211s.this.f268773b);
            }
        }
    }

    public C93211s(EmojiAddCustomDialogUI emojiAddCustomDialogUI, C101800k70 k702) {
        this.f268773b = emojiAddCustomDialogUI;
        this.f268772a = k702;
    }

    /* renamed from: a */
    public void mo127704a() {
        Log.m105920e("MicroMsg.emoji.EmojiAddCustomDialogUI", "doWhenIllegal");
        this.f268773b.mo127688H7();
        EmojiAddCustomDialogUI.m117579E7(this.f268773b);
        C115669n nVar = C115669n.INSTANCE;
        EmojiInfo emojiInfo = this.f268773b.f268390i;
        EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f268773b;
        nVar.mo160131h(10431, Integer.valueOf(this.f268773b.f268388g), this.f268773b.f268390i.getMd5(), emojiInfo.field_designerID, emojiInfo.field_groupId, 1, 1, Integer.valueOf(this.f268773b.f268390i.field_size), emojiAddCustomDialogUI.f268389h, emojiAddCustomDialogUI.f268390i.field_activityid);
    }

    /* renamed from: b */
    public void mo127705b(C101208b bVar) {
        Log.m105924i("MicroMsg.emoji.EmojiAddCustomDialogUI", "doWhenOK");
        EmojiAddCustomDialogUI emojiAddCustomDialogUI = this.f268773b;
        EmojiInfo emojiInfo = emojiAddCustomDialogUI.f268390i;
        boolean z = emojiAddCustomDialogUI.f268391j;
        C93212a aVar = new C93212a();
        C87412m.m108594g(emojiInfo, "emojiInfo");
        emojiAddCustomDialogUI.f268392n = new C99917g(emojiInfo, z, aVar);
    }
}
