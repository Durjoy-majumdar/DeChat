package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.j1 */
public final class C72800j1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72852z0 f212193d;

    public C72800j1(C72852z0 z0Var) {
        this.f212193d = z0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f212193d.f212318b.mo104256m();
        InputMethodManager inputMethodManager = (InputMethodManager) ((C36570n) this.f212193d.f212326j).getValue();
        Boolean valueOf = inputMethodManager != null ? Boolean.valueOf(inputMethodManager.showSoftInput(this.f212193d.f212318b.view(), 0)) : null;
        Log.m105924i("ChatFooterKt", "fulledt container click called " + valueOf);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
