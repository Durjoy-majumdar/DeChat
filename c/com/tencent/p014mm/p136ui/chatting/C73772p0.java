package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.p136ui.chatting.C73850t4;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.chatting.p0 */
public class C73772p0 implements C73850t4.C73851a {

    /* renamed from: a */
    public final /* synthetic */ C73832q0 f216540a;

    public C73772p0(C73832q0 q0Var) {
        this.f216540a = q0Var;
    }

    /* renamed from: a */
    public void mo102818a(boolean z, String str) {
        Log.m105919d("MicroMsg.ChatFooterCustomSubmenu", "OnShowRedDot showTextView：%s，key ：%s", Boolean.valueOf(z), str);
        C73832q0 q0Var = this.f216540a;
        q0Var.f216651f = str;
        q0Var.f216652g = z;
    }
}
