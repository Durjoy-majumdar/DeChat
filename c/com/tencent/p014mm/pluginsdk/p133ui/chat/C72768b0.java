package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import android.widget.ImageButton;
import com.tencent.p014mm.p136ui.chatting.component.C73467e5;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72791h;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import eb0.C75592q0;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.b0 */
public class C72768b0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212113d;

    public C72768b0(ChatFooter chatFooter) {
        this.f212113d = chatFooter;
    }

    public void onClick(View view) {
        ChatFooter$$j1 chatFooter$$j1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ChatFooter chatFooter = this.f212113d;
        ImageButton imageButton = chatFooter.f211946v;
        int i = -1;
        if (chatFooter.getAppPanelUnCertainEnterArrayList() != null && chatFooter.getAppPanelUnCertainEnterArrayList().size() > 0) {
            int i2 = -1;
            for (int i3 = 0; i3 < chatFooter.getAppPanelUnCertainEnterArrayList().size(); i3++) {
                C72791h.C44607a aVar = chatFooter.getAppPanelUnCertainEnterArrayList().get(i3);
                if (aVar.f120962z1 == 1) {
                    if (!MultiProcessMMKV.getMMKV("plus_uncertain_enter").getBoolean(aVar.f120961y1, false)) {
                        MultiProcessMMKV.getMMKV("plus_uncertain_enter").edit().putBoolean(aVar.f120961y1, true);
                        if (i2 == -1) {
                            i2 = i3;
                        }
                    }
                }
            }
            i = i2;
        }
        chatFooter.f211951w.setVisibility(8);
        imageButton.setTag(Integer.valueOf(i));
        this.f212113d.mo100449s(view);
        if (C75592q0.m90762J().booleanValue() && (chatFooter$$j1 = this.f212113d.f211789N1) != null) {
            Boolean bool = Boolean.TRUE;
            ((C73467e5.C73469b) chatFooter$$j1).mo102423a(bool, bool);
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$30", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
