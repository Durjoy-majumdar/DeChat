package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;
import qo3.C77407n;
import rd0.C22222c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l5 */
public class C74099l5 implements C22222c.C22224b {

    /* renamed from: a */
    public final /* synthetic */ String f217484a;

    /* renamed from: b */
    public final /* synthetic */ boolean f217485b;

    /* renamed from: c */
    public final /* synthetic */ Map f217486c;

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f217487d;

    /* renamed from: e */
    public final /* synthetic */ C74307x8 f217488e;

    /* renamed from: f */
    public final /* synthetic */ ChattingItemDyeingTemplate f217489f;

    public C74099l5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str, boolean z, Map map, C72963f4 f4Var, C74307x8 x8Var) {
        this.f217489f = chattingItemDyeingTemplate;
        this.f217484a = str;
        this.f217485b = z;
        this.f217486c = map;
        this.f217487d = f4Var;
        this.f217488e = x8Var;
    }

    /* renamed from: a */
    public void mo35378a() {
        Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "alvinluo getSubscribeStatus onError");
    }

    /* renamed from: b */
    public void mo35379b(String str, C22222c.C22225c cVar) {
        if (str.equals(this.f217489f.f216849I)) {
            Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "try2HandleAppBrandLogic, sync attr username %s, templateId: %s, isSubscribed: %b, switchOpened: %b, isSwitchOpened: %b", this.f217484a, str, Boolean.valueOf(cVar.f62963a), Boolean.valueOf(cVar.f62964b), Boolean.valueOf(cVar.f62966d));
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f217489f;
            C22222c.C22225c cVar2 = new C22222c.C22225c(cVar.f62963a, cVar.f62964b);
            chattingItemDyeingTemplate.f216848H = cVar2;
            cVar2.f62966d = cVar.f62966d;
            cVar2.f62965c = this.f217485b;
            chattingItemDyeingTemplate.mo102963P0(this.f217486c, this.f217487d, this.f217488e, true, cVar2, true);
            C77407n nVar = this.f217489f.f216863X;
            if (nVar != null && nVar.mo107563h()) {
                this.f217489f.f216863X.mo107573q();
            }
        }
    }
}
