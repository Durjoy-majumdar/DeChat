package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.View;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.f1 */
public final class C72785f1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C72852z0 f212147d;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.f1$a */
    public static final class C72786a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72852z0 f212148d;

        public C72786a(C72852z0 z0Var) {
            this.f212148d = z0Var;
        }

        public final void run() {
            C72852z0 z0Var = this.f212148d;
            int i = C72852z0.f212316u;
            z0Var.mo100704q();
        }
    }

    public C72785f1(C72852z0 z0Var) {
        this.f212147d = z0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C72852z0 z0Var = this.f212147d;
        int i = C72852z0.f212316u;
        z0Var.mo100690c().mo91562c(C0966R.C0970id.b8q).performClick();
        this.f212147d.mo100703p();
        view.postDelayed(new C72786a(this.f212147d), 20);
        C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$btnSmileyOrKeyboard$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
