package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import c30.C104289g;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import p287zz.C16418h;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.r5 */
public class C74195r5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104289g f217807d;

    /* renamed from: e */
    public final /* synthetic */ Map f217808e;

    /* renamed from: f */
    public final /* synthetic */ String f217809f;

    /* renamed from: g */
    public final /* synthetic */ String f217810g;

    /* renamed from: h */
    public final /* synthetic */ int f217811h;

    /* renamed from: i */
    public final /* synthetic */ C72963f4 f217812i;

    /* renamed from: j */
    public final /* synthetic */ int f217813j;

    /* renamed from: n */
    public final /* synthetic */ ChattingItemDyeingTemplate f217814n;

    public C74195r5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, C104289g gVar, Map map, String str, String str2, int i, C72963f4 f4Var, int i2) {
        this.f217814n = chattingItemDyeingTemplate;
        this.f217807d = gVar;
        this.f217808e = map;
        this.f217809f = str;
        this.f217810g = str2;
        this.f217811h = i;
        this.f217812i = f4Var;
        this.f217813j = i2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C104289g gVar = this.f217807d;
        if (gVar != null) {
            String optString = gVar.optString("feedID");
            String str = optString;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83794l6(this.f217814n.f216867v.mo91565f(), str, this.f217807d.optString("nonceID"), false, 16, C16418h.m15245a(2));
            this.f217814n.mo102967U0(5, this.f217808e, this.f217809f, optString, this.f217810g);
            if (this.f217811h == 1) {
                ChattingItemDyeingTemplate.m87579r0(this.f217814n, this.f217812i, this.f217813j);
            }
            ChattingItemDyeingTemplate.m87587z0(this.f217814n, (C74243t8) view.getTag(), this.f217808e);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
