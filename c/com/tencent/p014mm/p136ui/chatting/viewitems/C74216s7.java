package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74177q7;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import j20.C117292a;
import java.util.ArrayList;
import zj3.C79347d1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.s7 */
public class C74216s7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C74177q7.C74180c f217877d;

    public C74216s7(C74177q7.C74180c cVar) {
        this.f217877d = cVar;
    }

    public void onClick(View view) {
        Class cls = C79347d1.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) ((ChattingItemTranslate) view).getTag();
        if (((C79347d1) this.f217877d.f217737v.f193278b.mo102812a(cls)).mo102299h5(cVar.f212238a.getMsgId()) == ChattingItemTranslate.C73918e.Transforming) {
            ((C79347d1) this.f217877d.f217737v.f193278b.mo102812a(cls)).mo102287Y4(cVar.f212238a, true, cVar.mo103252b(), 1);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemVoice$ChattingItemVoiceFrom$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
