package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;
import p248ug.C52558c;
import rb0.C47961a;
import rb0.C47984k;
import rb0.C48009v0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y4 */
public class C74314y4 implements C87581a<Boolean, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ String f218303a;

    /* renamed from: b */
    public final /* synthetic */ ChattingItemDyeingTemplate f218304b;

    public C74314y4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str) {
        this.f218304b = chattingItemDyeingTemplate;
        this.f218303a = str;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        C46888b c = C88643g.m110545c();
        C52558c b = C47984k.m53328b(this.f218303a);
        if (b == null || Util.isNullOrNil(b.field_appId)) {
            if (b == null) {
                C52558c cVar = new C52558c();
                cVar.field_username = this.f218303a;
                Log.m105925i("MicroMsg.ChattingItemDyeingTemplate", "insert stub bizInfo, username: %s, success: %b", this.f218303a, Boolean.valueOf(C48009v0.Fx0().update(cVar, new String[0])));
            }
            C73938c.m87675a(3);
            C47961a wx02 = C48009v0.wx0();
            String str = this.f218303a;
            if (wx02.mo72736c(str, new y4$$a(this, str, c))) {
                return null;
            }
            Log.m105928w("MicroMsg.ChattingItemDyeingTemplate", "try2UpdateBizAttributes fail");
            c.mo72091a(new C73930b(2, "flush bizInfo fail"));
            return null;
        }
        c.mo72093c(Boolean.TRUE);
        return null;
    }
}
