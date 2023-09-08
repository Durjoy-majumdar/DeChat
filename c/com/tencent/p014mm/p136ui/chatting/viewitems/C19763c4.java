package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import ex0.C45696d;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import s90.C63724h;
import s90.C77629i;
import sj3.C63941p;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.c4 */
public class C19763c4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ int f56213d;

    /* renamed from: e */
    public final /* synthetic */ C63724h f56214e;

    /* renamed from: f */
    public final /* synthetic */ C77629i f56215f;

    /* renamed from: g */
    public final /* synthetic */ C19762b4 f56216g;

    public C19763c4(C19762b4 b4Var, int i, C63724h hVar, C77629i iVar) {
        this.f56216g = b4Var;
        this.f56213d = i;
        this.f56214e = hVar;
        this.f56215f = iVar;
    }

    public void onClick(View view) {
        Class cls = C45696d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i = this.f56213d == 1 ? 11 : 12;
        C63941p pVar = C63941p.f181254a;
        C63724h hVar = this.f56214e;
        FinderObject c = pVar.mo88705c(hVar.f180629g, hVar.f180628f);
        C63724h hVar2 = this.f56214e;
        pVar.mo88708f(i, hVar2.f180629g, c, hVar2.f180627e, this.f56215f.f226292f);
        ((C45696d) C86709a0.m107533q(cls)).mo70995gj(this.f56216g.f56192v.mo91565f(), this.f56215f.f226292f, this.f56214e.f180629g, i, ((C45696d) C86709a0.m107533q(cls)).gg0(this.f56215f.f226292f));
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
