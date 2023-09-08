package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ud2.C78150h;
import vd2.C78384d;
import vd2.C78386e;

/* renamed from: com.tencent.mm.ui.chatting.d2 */
public class C73672d2 implements C78386e.C78387a {

    /* renamed from: a */
    public C67391b f216318a;

    public C73672d2(C67391b bVar) {
        this.f216318a = bVar;
    }

    /* renamed from: a */
    public boolean mo96620a(View view) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        if (t8Var == null) {
            Log.m105928w("MicroMsg.AvatarDoubleClickListener", "onDoubleClick tag null");
            return true;
        }
        String str = t8Var.f217968b;
        Log.m105925i("MicroMsg.AvatarDoubleClickListener", "onDoubleClick: %s", str);
        return !((C78150h) C86312j.m106911c(C78150h.class)).isPatEnable() || !((C78384d) C86312j.m106911c(C78384d.class)).mo108127cu(1, this.f216318a.mo91577r(), str);
    }
}
