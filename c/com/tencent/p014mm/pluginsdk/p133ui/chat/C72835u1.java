package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.KeyEvent;
import android.view.View;
import com.tencent.p014mm.p136ui.widget.cedit.api.C74974a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.u1 */
public final class C72835u1 implements View.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ C72830t1 f212256d;

    /* renamed from: e */
    public final /* synthetic */ C74974a f212257e;

    public C72835u1(C72830t1 t1Var, C74974a aVar) {
        this.f212256d = t1Var;
        this.f212257e = aVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/SeqAutoCompleteHelper$supportAutoComplete$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        boolean z = false;
        try {
            if (!this.f212256d.f212241a.mo100444p0()) {
                C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/chat/SeqAutoCompleteHelper$supportAutoComplete$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return false;
            }
            if (i == 66) {
                z = C72830t1.m85407a(this.f212256d, keyEvent.getAction(), this.f212257e);
            } else if (i == 67) {
                C72830t1 t1Var = this.f212256d;
                int action = keyEvent.getAction();
                C74974a aVar = this.f212257e;
                if (action != 0) {
                    t1Var.getClass();
                } else if (t1Var.mo100670d(aVar)) {
                    z = true;
                }
            }
            C117292a.m165362h(z, this, "com/tencent/mm/pluginsdk/ui/chat/SeqAutoCompleteHelper$supportAutoComplete$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return z;
        } catch (Throwable th) {
            Log.printErrStackTrace("ChatFooterKtHelper", th, "supportAutoComplete err", new Object[0]);
        }
    }
}
