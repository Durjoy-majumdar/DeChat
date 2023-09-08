package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p585kl.C33934b;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.c0 */
public class C72772c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212118d;

    public C72772c0(ChatFooter chatFooter) {
        this.f212118d = chatFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C33934b.f91643c = true;
        C72825s0 s0Var = this.f212118d.f211780L;
        if (s0Var != null) {
            s0Var.mo100663y(view);
        }
        ChatFooter chatFooter = this.f212118d;
        if (chatFooter.f211884i1 == 2) {
            chatFooter.mo100377T0();
        } else {
            if (chatFooter.f211804R) {
                chatFooter.mo100398f0();
            }
            this.f212118d.mo100373R0();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_OUTER_EMOJI_BUTTON_RED_DOT_BOOLEAN;
            if (!i.mo119686g(aVar, false)) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                View findViewById = this.f212118d.f211863e.findViewById(C0966R.C0970id.b8r);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$31", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$31", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$31", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
