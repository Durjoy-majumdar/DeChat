package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import kr0.C76629w0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.k5 */
public class C74084k5 implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ ChattingItemDyeingTemplate f217408a;

    public C74084k5(ChattingItemDyeingTemplate chattingItemDyeingTemplate) {
        this.f217408a = chattingItemDyeingTemplate;
    }

    /* renamed from: a */
    public void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            Log.m105927v("MicroMsg.ChattingItemDyeingTemplate", "alvinluo onGetWeAppInfo appId: %s", this.f217408a.f216850J);
            this.f217408a.f216850J = wxaAttributes.field_appId;
        }
    }
}
