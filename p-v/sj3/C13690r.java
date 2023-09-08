package sj3;

import android.content.Intent;
import com.tencent.p014mm.p136ui.bizchat.BizChatSelectConversationUI;
import wd3.C65953v0;

/* renamed from: sj3.r */
public class C13690r implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f38739a;

    /* renamed from: b */
    public final /* synthetic */ long f38740b;

    /* renamed from: c */
    public final /* synthetic */ BizChatSelectConversationUI f38741c;

    public C13690r(BizChatSelectConversationUI bizChatSelectConversationUI, String str, long j) {
        this.f38741c = bizChatSelectConversationUI;
        this.f38739a = str;
        this.f38740b = j;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("enterprise_biz_name", this.f38739a);
            intent.putExtra("key_biz_chat_id", this.f38740b);
            intent.putExtra("key_is_biz_chat", true);
            this.f38741c.setResult(-1, intent);
            this.f38741c.finish();
        }
    }
}
