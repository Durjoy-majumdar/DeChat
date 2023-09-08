package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.view.View;
import bb3.C92238l;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import va3.C102166c;
import xa3.C102602r;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.p */
public class C96739p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96740q f283382d;

    public C96739p(C96740q qVar) {
        this.f283382d = qVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("WNNoteBanner", "click WNNoteBanner");
        C102602r a = C92238l.m115958b().mo126233a();
        if (a == null) {
            Log.m105924i("WNNoteBanner", "keepTopItem is null");
            this.f283382d.mo7975g(8);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C102166c.m134610E0(a);
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
