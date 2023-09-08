package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import j20.C117292a;
import java.util.ArrayList;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.f2 */
public abstract class C73684f2 implements View.OnClickListener {

    /* renamed from: e */
    public static ThreadLocal<C72963f4> f216338e = new ThreadLocal<>();

    /* renamed from: d */
    public C67391b f216339d;

    public C73684f2(C67391b bVar) {
        this.f216339d = bVar;
    }

    /* renamed from: a */
    public abstract void mo57756a(View view, C67391b bVar, C72963f4 f4Var);

    public final void onClick(View view) {
        C72963f4 f4Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C67391b bVar = this.f216339d;
        C74243t8 t8Var = (C74243t8) view.getTag();
        try {
            f4Var = ((C79368l) bVar.f193278b.mo102812a(C79368l.class)).getItem(t8Var.f217970d.getAdapterPosition());
        } catch (Throwable th) {
            Log.printErrStackTrace("ItemDataTag", th, "getCurrentMsg err", new Object[0]);
            f4Var = t8Var.f212238a;
        }
        if (f4Var == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        f216338e.set(f4Var);
        mo57756a(view, this.f216339d, f4Var);
        f216338e.set((Object) null);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
