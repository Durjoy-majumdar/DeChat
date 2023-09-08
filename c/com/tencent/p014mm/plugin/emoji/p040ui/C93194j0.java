package com.tencent.p014mm.plugin.emoji.p040ui;

import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import ke3.C88144b;
import p207nl.C100130h;
import u61.C101964h;

/* renamed from: com.tencent.mm.plugin.emoji.ui.j0 */
public class C93194j0 implements C100130h.C100131a {

    /* renamed from: a */
    public final /* synthetic */ EmojiSendDialogUI f268751a;

    public C93194j0(EmojiSendDialogUI emojiSendDialogUI) {
        this.f268751a = emojiSendDialogUI;
    }

    /* renamed from: a */
    public void mo57745a(boolean z) {
        int i;
        if (z) {
            EmojiSendDialogUI emojiSendDialogUI = this.f268751a;
            int i2 = EmojiSendDialogUI.f268534i;
            emojiSendDialogUI.getClass();
            Log.m105924i("MicroMsg.EmojiSendDialogUI", "select contact");
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("select_is_ret", true);
            intent.putExtra("mutil_select_is_ret", true);
            intent.putExtra("Retr_Msg_Type", 5);
            if (emojiSendDialogUI.f268536f) {
                intent.putExtra("Retr_Msg_thumb_path", emojiSendDialogUI.f268535e.field_md5);
            } else {
                intent.putExtra("image_path", emojiSendDialogUI.f268537g);
            }
            intent.putExtra("emoji_activity_id", emojiSendDialogUI.f268535e.field_activityid);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            EmojiInfo emojiInfo = emojiSendDialogUI.f268535e;
            if (emojiInfo == null) {
                ArrayList<String> arrayList = C101964h.f300169a;
                i = -1;
            } else {
                i = (C101964h.m134231m(emojiInfo) || !Util.isNullOrNil(emojiInfo.mo62685o0())) ? 17 : 14;
            }
            intent.putExtra("content_type_forward_to_wework", i);
            C88144b.m109802t(emojiSendDialogUI, ".ui.transmit.SelectConversationUI", intent, 1001);
            emojiSendDialogUI.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2461dn);
            return;
        }
        this.f268751a.setResult(0);
        this.f268751a.finish();
    }
}
