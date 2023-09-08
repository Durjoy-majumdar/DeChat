package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.account.p024ui.MMFBFriendUI;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.conversation.banner.n */
public class C6956n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C6957o f24663d;

    public C6956n(C6957o oVar) {
        this.f24663d = oVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/conversation/banner/FackbookTipsBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C97625j3.m125812b().mo105906u().mo119676J(65833, 0);
        Context context = this.f24663d.f230570g.get();
        Intent intent = new Intent(this.f24663d.f230570g.get(), MMFBFriendUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/FackbookTipsBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/ui/conversation/banner/FackbookTipsBanner$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        View view2 = this.f24663d.f230569f;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/banner/FackbookTipsBanner$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/conversation/banner/FackbookTipsBanner$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/FackbookTipsBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
