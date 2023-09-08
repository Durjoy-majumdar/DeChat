package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import ht1.C60205t5;
import ke3.C88144b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.d0 */
public class C57744d0 implements C88144b.C76564c {

    /* renamed from: a */
    public final /* synthetic */ C72963f4 f165278a;

    /* renamed from: b */
    public final /* synthetic */ C74244u.C74261g f165279b;

    public C57744d0(C74244u.C74261g gVar, C72963f4 f4Var) {
        this.f165279b = gVar;
        this.f165278a = f4Var;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 2000 && i2 == -1) {
            String listToString = Util.listToString(intent.getStringArrayListExtra("SendMsgUsernames"), ";");
            C60205t5 t5Var = C60205t5.f171719a;
            C72963f4 f4Var = this.f165278a;
            this.f165279b.getClass();
            t5Var.mo85202a(f4Var, false, false, listToString);
        }
    }
}
