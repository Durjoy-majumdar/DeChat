package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Map;
import p287zz.C16418h;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.o5 */
public class C74151o5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Map f217667d;

    /* renamed from: e */
    public final /* synthetic */ ChattingItemDyeingTemplate f217668e;

    public C74151o5(ChattingItemDyeingTemplate chattingItemDyeingTemplate, Map map) {
        this.f217668e = chattingItemDyeingTemplate;
        this.f217667d = map;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83794l6(this.f217668e.f216867v.mo91565f(), Util.nullAsNil((String) this.f217667d.get(".msg.appmsg.mmreader.template_header.finder_feedid")), Util.nullAsNil((String) this.f217667d.get(".msg.appmsg.mmreader.template_header.finder_nonceid")), false, 16, C16418h.m15245a(2));
        this.f217668e.mo102966T0(3, this.f217667d, "");
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$38", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
