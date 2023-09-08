package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31519v2;
import eb0.C75597w2;
import f40.C86709a0;
import f62.C75700k0;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z4 */
public class C74326z4 implements C87581a<Boolean, Void> {

    /* renamed from: a */
    public final /* synthetic */ String f218336a;

    /* renamed from: b */
    public final /* synthetic */ ChattingItemDyeingTemplate f218337b;

    public C74326z4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str) {
        this.f218337b = chattingItemDyeingTemplate;
        this.f218336a = str;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C46888b c = C88643g.m110545c();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f218336a);
        if (z1Var == null || ((int) z1Var.f108320R1) == 0 || !z1Var.mo62916m3()) {
            Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "contact do not exist.(username : %s)", this.f218336a);
            C73938c.m87675a(2);
            C75597w2 a = C31519v2.m39436a();
            String str = this.f218336a;
            a.mo55988e(str, "", new z4$$a(this, str, c));
        } else {
            c.mo72093c(Boolean.TRUE);
        }
        return Boolean.FALSE;
    }
}
