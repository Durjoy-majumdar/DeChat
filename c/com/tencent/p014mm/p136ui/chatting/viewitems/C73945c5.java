package com.tencent.p014mm.p136ui.chatting.viewitems;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import java.util.Map;
import qo3.C77407n;
import rd0.C22222c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.c5 */
public class C73945c5 implements C22222c.C22224b {

    /* renamed from: a */
    public final /* synthetic */ Map f217029a;

    /* renamed from: b */
    public final /* synthetic */ C72963f4 f217030b;

    /* renamed from: c */
    public final /* synthetic */ C74307x8 f217031c;

    /* renamed from: d */
    public final /* synthetic */ ChattingItemDyeingTemplate f217032d;

    public C73945c5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, Map map, C72963f4 f4Var, C74307x8 x8Var) {
        this.f217032d = chattingItemDyeingTemplate;
        this.f217029a = map;
        this.f217030b = f4Var;
        this.f217031c = x8Var;
    }

    /* renamed from: a */
    public void mo35378a() {
        Log.m105920e("MicroMsg.ChattingItemDyeingTemplate", "alvinluo getSubscribeStatus onError");
    }

    /* renamed from: b */
    public void mo35379b(String str, C22222c.C22225c cVar) {
        if (str.equals(this.f217032d.f216849I)) {
            Log.m105919d("MicroMsg.ChattingItemDyeingTemplate", "alvinluo getSubscribeStatus onUpdated templateId: %s, isSubscribed: %b, switchOpen: %b", str, Boolean.valueOf(cVar.f62963a), Boolean.valueOf(cVar.f62964b));
            ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f217032d;
            C22222c.C22225c cVar2 = new C22222c.C22225c(cVar.f62963a, cVar.f62964b);
            chattingItemDyeingTemplate.f216848H = cVar2;
            cVar2.f62966d = cVar.f62966d;
            cVar2.f62965c = cVar.f62965c;
            C72963f4 f4Var = this.f217030b;
            C74307x8 x8Var = this.f217031c;
            chattingItemDyeingTemplate.getClass();
            if (!cVar.f62963a || !cVar.f62964b) {
                chattingItemDyeingTemplate.mo102970X0(x8Var, 0);
                x8Var.f218249M.setText(chattingItemDyeingTemplate.f216867v.mo91572m().getString(C0966R.string.hdi));
            } else {
                chattingItemDyeingTemplate.mo102970X0(x8Var, 8);
                x8Var.f218249M.setText(chattingItemDyeingTemplate.f216867v.mo91572m().getString(C0966R.string.hdh));
            }
            x8Var.f218248L.setTag(C0966R.C0970id.hbt, f4Var);
            C77407n nVar = this.f217032d.f216863X;
            if (nVar != null && nVar.mo107563h()) {
                this.f217032d.f216863X.mo107573q();
            }
        }
    }
}
