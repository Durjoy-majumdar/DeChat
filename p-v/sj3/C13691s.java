package sj3;

import android.content.Intent;
import com.tencent.p014mm.p136ui.bizchat.BizChatSelectConversationUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import wd3.C65953v0;

/* renamed from: sj3.s */
public class C13691s implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f38742a;

    /* renamed from: b */
    public final /* synthetic */ long f38743b;

    /* renamed from: c */
    public final /* synthetic */ BizChatSelectConversationUI f38744c;

    public C13691s(BizChatSelectConversationUI bizChatSelectConversationUI, String str, long j) {
        this.f38744c = bizChatSelectConversationUI;
        this.f38742a = str;
        this.f38743b = j;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("enterprise_biz_name", this.f38742a);
            intent.putExtra("key_biz_chat_id", this.f38743b);
            intent.putExtra("key_is_biz_chat", true);
            if (!Util.isNullOrNil(str)) {
                intent.putExtra("enterprise_share_append_text", str);
            }
            this.f38744c.setResult(-1, intent);
            this.f38744c.finish();
        }
    }
}
