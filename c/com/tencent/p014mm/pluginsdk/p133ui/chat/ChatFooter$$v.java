package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.p136ui.C85865h1;
import com.tencent.p014mm.plugin.transvoice.model.C71562c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96980c;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import pd0.C35456c;
import pd0.C35457d;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$v */
public class ChatFooter$$v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatFooter f212064d;

    public ChatFooter$$v(ChatFooter chatFooter) {
        this.f212064d = chatFooter;
    }

    public void onClick(View view) {
        ChatFooter chatFooter;
        InputMethodManager inputMethodManager;
        EditText editText;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$55", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f212064d.f211899l3.getVisibility() == 0 && 8 == this.f212064d.f211895k3.getVisibility()) {
            String obj = this.f212064d.f211797P2.getText().toString();
            if (this.f212064d.f211780L != null && !Util.isNullOrNil(obj)) {
                ChatFooter chatFooter2 = this.f212064d;
                chatFooter2.f211944u3 = false;
                C71562c cVar = chatFooter2.f211750D2;
                cVar.f207378m = chatFooter2.f211738A4;
                cVar.f207382q = obj.length();
                C71562c cVar2 = this.f212064d.f211750D2;
                if (1 == cVar2.f207385t) {
                    cVar2.mo98691b(8);
                } else {
                    cVar2.mo98691b(5);
                }
                this.f212064d.f211780L.mo100658t(obj);
                this.f212064d.f211780L.mo100662x();
                ChatFooter chatFooter3 = this.f212064d;
                if (!Util.isNullOrNil((List) chatFooter3.f211945u4)) {
                    Log.m105925i("MicroMsg.ChatFooter", "cgiReport size = %s", Integer.valueOf(((ArrayList) chatFooter3.f211945u4).size()));
                    C96980c Lo = SubCoreNewABTest.wx0().mo57622Lo("100235");
                    int i = Lo.isValid() ? Util.getInt(Lo.mo135598l2().get("MMVoipVadOn"), 0) : 0;
                    Log.m105925i("MicroMsg.ChatFooter", "cgiReport: abTestFlag = [%s]", Integer.valueOf(i));
                    C35457d dVar = chatFooter3.f211940t4;
                    List<String> list = chatFooter3.f211945u4;
                    String valueOf = String.valueOf(i);
                    dVar.getClass();
                    C86709a0.m107525e().postToWorker(new C35456c(dVar, new ArrayList(list), obj, valueOf, 10));
                    ((ArrayList) chatFooter3.f211945u4).clear();
                }
                if (!(!C85865h1.m106133c(this.f212064d.getContext()) || (inputMethodManager = (chatFooter = this.f212064d).f211834X0) == null || (editText = chatFooter.f211797P2) == null)) {
                    inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$55", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
