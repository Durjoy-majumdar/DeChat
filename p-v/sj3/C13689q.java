package sj3;

import android.content.Intent;
import com.tencent.p014mm.p136ui.bizchat.BizChatSelectConversationUI;
import wd3.C65953v0;

/* renamed from: sj3.q */
public class C13689q implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f38736a;

    /* renamed from: b */
    public final /* synthetic */ long f38737b;

    /* renamed from: c */
    public final /* synthetic */ BizChatSelectConversationUI f38738c;

    public C13689q(BizChatSelectConversationUI bizChatSelectConversationUI, String str, long j) {
        this.f38738c = bizChatSelectConversationUI;
        this.f38736a = str;
        this.f38737b = j;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("enterprise_biz_name", this.f38736a);
            intent.putExtra("key_biz_chat_id", this.f38737b);
            intent.putExtra("key_is_biz_chat", true);
            this.f38738c.setResult(-1, intent);
            this.f38738c.finish();
        }
    }
}
