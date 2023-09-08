package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;
import kr0.C76629w0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m5 */
public class C74119m5 implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ Map f217546a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f217547b;

    /* renamed from: c */
    public final /* synthetic */ C74307x8 f217548c;

    /* renamed from: d */
    public final /* synthetic */ ChattingItemDyeingTemplate f217549d;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m5$a */
    public class C74120a implements Runnable {
        public C74120a() {
        }

        public void run() {
            C74119m5 m5Var = C74119m5.this;
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = m5Var.f217549d;
            chattingItemDyeingTemplate.mo102963P0(m5Var.f217546a, m5Var.f217547b, m5Var.f217548c, true, chattingItemDyeingTemplate.f216848H, false);
        }
    }

    public C74119m5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, Map map, C72963f4 f4Var, C74307x8 x8Var) {
        this.f217549d = chattingItemDyeingTemplate;
        this.f217546a = map;
        this.f217547b = f4Var;
        this.f217548c = x8Var;
    }

    /* renamed from: a */
    public void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f217549d;
            chattingItemDyeingTemplate.f216850J = wxaAttributes.field_appId;
            chattingItemDyeingTemplate.f216848H.f62963a = !((wxaAttributes.field_appOpt & 1) > 0);
            MMHandlerThread.postToMainThread(new C74120a());
        }
    }
}
