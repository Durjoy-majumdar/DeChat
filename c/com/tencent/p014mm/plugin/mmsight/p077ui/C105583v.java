package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.v */
public class C105583v implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105562q f314031d;

    public C105583v(C105562q qVar) {
        this.f314031d = qVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105562q qVar = this.f314031d;
        if (!qVar.f313981C) {
            MMHandlerThread.postToMainThread(new C105575s(qVar));
        } else {
            qVar.mo150415c();
            C105562q qVar2 = this.f314031d;
            if (qVar2.f313985d >= 0 && qVar2.f313986e > 0) {
                qVar2.f313999r = true;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/mmsight/ui/MMSightVideoEditor$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
