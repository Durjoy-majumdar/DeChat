package rn3;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.transmit.SelectConversationUI;
import ke3.C88144b;
import qo3.C77398g;

/* renamed from: rn3.d0 */
public class C77544d0 implements C77398g.C77402i.C77404b {

    /* renamed from: a */
    public final /* synthetic */ String f226074a;

    /* renamed from: b */
    public final /* synthetic */ SelectConversationUI f226075b;

    public C77544d0(SelectConversationUI selectConversationUI, String str) {
        this.f226075b = selectConversationUI;
        this.f226074a = str;
    }

    /* renamed from: a */
    public void mo25a() {
        if (this.f226075b.f220182b1 != 4) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f226074a);
            intent.putExtra("showShare", false);
            C88144b.m109791i(this.f226075b.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }
}
