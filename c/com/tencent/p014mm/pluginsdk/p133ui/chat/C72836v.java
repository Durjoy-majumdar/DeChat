package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.KeyEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.v */
public class C72836v implements MMEditText.C74951e {

    /* renamed from: a */
    public long f212258a = 0;

    /* renamed from: b */
    public final /* synthetic */ ChatFooter f212259b;

    public C72836v(ChatFooter chatFooter) {
        this.f212259b = chatFooter;
    }

    /* renamed from: a */
    public boolean mo100676a(int i, KeyEvent keyEvent) {
        if (i != 66 || C31543z5.m39453c() - this.f212258a <= 1000 || !C85875k4.m106197n0() || !C85875k4.m106208w() || keyEvent.isAltPressed() || keyEvent.isCtrlPressed()) {
            return false;
        }
        Log.m105924i("MicroMsg.ChatFooter", "KeyCode Enter");
        this.f212258a = C31543z5.m39453c();
        this.f212259b.f211905n.performClick();
        return true;
    }
}
