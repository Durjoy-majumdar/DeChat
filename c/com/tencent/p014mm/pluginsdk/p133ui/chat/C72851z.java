package com.tencent.p014mm.pluginsdk.p133ui.chat;

import c83.C23800b;
import com.tencent.p014mm.storage.C72996z1;
import de3.C75369r;
import java.util.regex.Matcher;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.z */
public class C72851z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f212312d;

    /* renamed from: e */
    public final /* synthetic */ String f212313e;

    /* renamed from: f */
    public final /* synthetic */ long f212314f;

    /* renamed from: g */
    public final /* synthetic */ ChatFooter f212315g;

    public C72851z(ChatFooter chatFooter, String str, String str2, long j) {
        this.f212315g = chatFooter;
        this.f212312d = str;
        this.f212313e = str2;
        this.f212314f = j;
    }

    public void run() {
        Matcher matcher = C75369r.f221604t.matcher(this.f212312d);
        while (matcher.find()) {
            C23800b.m28600a(this.f212315g.f211888j.view(), C72996z1.m85820U5(this.f212315g.f211858d) ? 2 : 1, this.f212315g.f211858d, this.f212313e, 3, matcher.group(), this.f212315g.f211757F1, 1, this.f212314f);
        }
    }
}
