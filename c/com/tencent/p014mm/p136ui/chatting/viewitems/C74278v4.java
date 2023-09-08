package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.C73326c2;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v4 */
public class C74278v4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f218159d;

    /* renamed from: e */
    public final /* synthetic */ Map f218160e;

    /* renamed from: f */
    public final /* synthetic */ ChattingItemDyeingTemplate f218161f;

    public C74278v4(ChattingItemDyeingTemplate chattingItemDyeingTemplate, String str, Map map) {
        this.f218161f = chattingItemDyeingTemplate;
        this.f218159d = str;
        this.f218160e = map;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChattingItemDyeingTemplate chattingItemDyeingTemplate = this.f218161f;
        C67391b bVar = chattingItemDyeingTemplate.f216867v;
        if (chattingItemDyeingTemplate.f217202i == null) {
            chattingItemDyeingTemplate.f217202i = new C73326c2(bVar);
        }
        C73326c2 c2Var = chattingItemDyeingTemplate.f217202i;
        if (c2Var != null) {
            c2Var.onClick(view);
        }
        ChattingItemDyeingTemplate chattingItemDyeingTemplate2 = this.f218161f;
        chattingItemDyeingTemplate2.mo102969W0(10, chattingItemDyeingTemplate2.f216867v.mo91577r(), this.f218159d);
        ChattingItemDyeingTemplate.m87587z0(this.f218161f, (C74243t8) view.getTag(), this.f218160e);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
