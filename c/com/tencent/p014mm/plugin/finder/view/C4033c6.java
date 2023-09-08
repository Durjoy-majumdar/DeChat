package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.view.c6 */
public final class C4033c6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f18097d;

    /* renamed from: e */
    public final /* synthetic */ String f18098e;

    public C4033c6(View view, String str) {
        this.f18097d = view;
        this.f18098e = str;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Context context = this.f18097d.getContext();
        C87412m.m108593f(context, "contentView.context");
        String str = this.f18098e;
        C87412m.m108593f(str, "wxUsername");
        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("Chat_User", str);
        intent.putExtra("Chat_Mode", 1);
        intent.setClassName(context, "com.tencent.mm.ui.chatting.ChattingUI");
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterChattingUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterChattingUI", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderWxProfileHelper$Companion$updateWxProfile$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
