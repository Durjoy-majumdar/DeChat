package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import s90.C77630j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j4 */
public class C19777j4 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C77630j f56238d;

    /* renamed from: e */
    public final /* synthetic */ C19783t3 f56239e;

    public C19777j4(C19762b4 b4Var, C77630j jVar, C19783t3 t3Var) {
        this.f56238d = jVar;
        this.f56239e = t3Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f56238d.f226318J == 1) {
            this.f56239e.f56268j.f56308d.setMaxLines(3);
            this.f56239e.f56268j.f56309e.setText(C0966R.string.ap4);
            this.f56238d.f226318J = 0;
        } else {
            this.f56239e.f56268j.f56308d.setMaxLines(Integer.MAX_VALUE);
            this.f56239e.f56268j.f56309e.setText(C0966R.string.f360192ap3);
            this.f56238d.f226318J = 1;
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
