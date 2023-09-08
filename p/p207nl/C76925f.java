package p207nl;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import ke3.C88144b;

/* renamed from: nl.f */
public final class C76925f implements C75018a.C75024d {

    /* renamed from: a */
    public final /* synthetic */ C76922c f224796a;

    public C76925f(C76922c cVar) {
        this.f224796a = cVar;
    }

    /* renamed from: a */
    public final void mo7429a() {
        C76922c cVar = this.f224796a;
        cVar.getClass();
        C115669n nVar = C115669n.INSTANCE;
        EmojiInfo emojiInfo = cVar.f224787d;
        nVar.mo160131h(12789, 2, cVar.f224787d.getMd5(), 0, emojiInfo.field_designerID, emojiInfo.field_groupId, "", "", "", "", "", emojiInfo.field_activityid);
        String str = cVar.f224787d.field_groupId;
        if (!Util.isNullOrNil(str)) {
            Intent intent = new Intent();
            intent.putExtra("preceding_scence", 25);
            intent.putExtra("download_entrance_scene", 46);
            intent.putExtra("extra_id", str);
            C88144b.m109791i(cVar.f224784a, "emoji", ".ui.EmojiStoreDetailUI", intent, (Bundle) null);
        }
    }
}
