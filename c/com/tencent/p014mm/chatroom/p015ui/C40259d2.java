package com.tencent.p014mm.chatroom.p015ui;

import android.view.View;
import com.tencent.p014mm.chatroom.p015ui.SelectMemberUI;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.chatroom.ui.d2 */
public class C40259d2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SelectMemberUI.C40250g f108270d;

    public C40259d2(SelectMemberUI.C40250g gVar) {
        this.f108270d = gVar;
    }

    public void run() {
        this.f108270d.notifyDataSetChanged();
        List<SelectMemberUI.C40249f> list = this.f108270d.f108245i;
        if (list == null || list.size() != 0) {
            SelectMemberUI.this.f108215d.setVisibility(0);
            View view = SelectMemberUI.this.f108217f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        SelectMemberUI.this.f108215d.setVisibility(8);
        View view3 = SelectMemberUI.this.f108217f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/chatroom/ui/SelectMemberUI$SelectMemberAdapter$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
