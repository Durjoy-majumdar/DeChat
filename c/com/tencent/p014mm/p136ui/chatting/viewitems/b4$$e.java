package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import s90.C63724h;
import s90.C77629i;
import sj3.C63941p;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.b4$$e */
public class b4$$e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C63724h f56207d;

    /* renamed from: e */
    public final /* synthetic */ C77629i f56208e;

    /* renamed from: f */
    public final /* synthetic */ C67391b f56209f;

    public b4$$e(C19762b4 b4Var, C63724h hVar, C77629i iVar, C67391b bVar) {
        this.f56207d = hVar;
        this.f56208e = iVar;
        this.f56209f = bVar;
    }

    public void onClick(View view) {
        Class cls = C45696d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C63941p pVar = C63941p.f181254a;
        C63724h hVar = this.f56207d;
        FinderObject c = pVar.mo88705c(hVar.f180629g, hVar.f180628f);
        C63724h hVar2 = this.f56207d;
        pVar.mo88708f(13, hVar2.f180629g, c, hVar2.f180627e, this.f56208e.f226292f);
        ((C45696d) C86709a0.m107533q(cls)).mo70995gj(this.f56209f.mo91565f(), this.f56208e.f226292f, this.f56207d.f180629g, 13, ((C45696d) C86709a0.m107533q(cls)).gg0(this.f56208e.f226292f));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
