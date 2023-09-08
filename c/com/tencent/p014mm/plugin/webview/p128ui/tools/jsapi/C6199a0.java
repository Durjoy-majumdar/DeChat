package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import java.util.Map;
import ke3.C88144b;
import lg3.C76697h;
import nj3.C76879j;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.a0 */
public class C6199a0 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C44561j f22885a;

    /* renamed from: b */
    public final /* synthetic */ String f22886b;

    /* renamed from: c */
    public final /* synthetic */ String f22887c;

    /* renamed from: d */
    public final /* synthetic */ String f22888d;

    /* renamed from: e */
    public final /* synthetic */ String f22889e;

    /* renamed from: f */
    public final /* synthetic */ String f22890f;

    /* renamed from: g */
    public final /* synthetic */ String f22891g;

    /* renamed from: h */
    public final /* synthetic */ boolean f22892h;

    /* renamed from: i */
    public final /* synthetic */ String f22893i;

    /* renamed from: j */
    public final /* synthetic */ String f22894j;

    /* renamed from: k */
    public final /* synthetic */ MsgHandler f22895k;

    public C6199a0(MsgHandler msgHandler, C44561j jVar, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8) {
        this.f22895k = msgHandler;
        this.f22885a = jVar;
        this.f22886b = str;
        this.f22887c = str2;
        this.f22888d = str3;
        this.f22889e = str4;
        this.f22890f = str5;
        this.f22891g = str6;
        this.f22892h = z;
        this.f22893i = str7;
        this.f22894j = str8;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            this.f22895k.mo7178T5(this.f22885a, this.f22886b, this.f22887c, this.f22888d, this.f22889e, this.f22890f, str, this.f22891g);
            if (this.f22892h) {
                C88144b.m109801s(this.f22895k.f22697d, ".ui.chatting.ChattingUI", new Intent().putExtra("Chat_User", this.f22887c), (Bundle) null);
            } else {
                Context context = this.f22895k.f22697d;
                if (context != null) {
                    C76879j.m92726T(context, C76697h.m92348a(context).getString(C0966R.string.f360099a34));
                }
            }
            this.f22895k.mo7201e7(1, 1);
            MsgHandler msgHandler = this.f22895k;
            msgHandler.mo7210k5(msgHandler.f22698e, this.f22893i, (Map<String, Object>) null);
            return;
        }
        this.f22895k.mo7201e7(1, 3);
        MsgHandler msgHandler2 = this.f22895k;
        msgHandler2.mo7210k5(msgHandler2.f22698e, this.f22894j, (Map<String, Object>) null);
    }
}
