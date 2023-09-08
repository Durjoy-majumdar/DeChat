package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.i0 */
public class C72797i0 implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212188d;

    public C72797i0(ChatFooter chatFooter) {
        this.f212188d = chatFooter;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$36", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1 && (i == 23 || i == 66)) {
                this.f212188d.f211915p.setBackgroundResource(C0966R.C0969drawable.a_z);
                this.f212188d.f211915p.setText(C0966R.string.b5r);
                C72825s0 s0Var = this.f212188d.f211780L;
                if (s0Var != null) {
                    s0Var.mo100648C();
                }
                this.f212188d.f211850b1 = false;
            }
        } else if (i == 23 || i == 66) {
            ChatFooter chatFooter = this.f212188d;
            if (!chatFooter.f211850b1 && !chatFooter.f211846a1) {
                chatFooter.f211850b1 = true;
                chatFooter.f211915p.setBackgroundResource(C0966R.C0969drawable.aob);
                this.f212188d.f211915p.setText(C0966R.string.b5s);
                C72825s0 s0Var2 = this.f212188d.f211780L;
                if (s0Var2 != null) {
                    s0Var2.mo100661w();
                }
                ChatFooter chatFooter2 = this.f212188d;
                chatFooter2.f211915p.setContentDescription(chatFooter2.getContext().getString(C0966R.string.b3n));
            }
        }
        C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$36", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
