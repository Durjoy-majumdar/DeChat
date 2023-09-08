package com.tencent.p014mm.plugin.appbrand.keylogger;

import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import uo0.C78250j;
import vo0.C78458a;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.g */
public class C83220g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ KeyStepAnalyserDetailActivity f243067d;

    public C83220g(KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity) {
        this.f243067d = keyStepAnalyserDetailActivity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity = this.f243067d;
        if (keyStepAnalyserDetailActivity.f243029e.getVisibility() == 0) {
            View view2 = keyStepAnalyserDetailActivity.f243029e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = keyStepAnalyserDetailActivity.f243030f;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            if (!keyStepAnalyserDetailActivity.f243041t) {
                keyStepAnalyserDetailActivity.f243031g = (LinearLayout) keyStepAnalyserDetailActivity.findViewById(C0966R.C0970id.c5q);
                keyStepAnalyserDetailActivity.f243032h = new ScaleGestureDetector(keyStepAnalyserDetailActivity, keyStepAnalyserDetailActivity.f243044w);
                HashMap hashMap = new HashMap();
                C78458a aVar3 = new C78458a(keyStepAnalyserDetailActivity, false);
                aVar3.getViewTreeObserver().addOnGlobalLayoutListener(new C83222i(keyStepAnalyserDetailActivity, aVar3, keyStepAnalyserDetailActivity));
                Class cls = keyStepAnalyserDetailActivity.f243039r;
                C78250j.m94539e(C83229q.m102138c(cls, keyStepAnalyserDetailActivity.f243040s), new C68623j(keyStepAnalyserDetailActivity, hashMap, aVar3, keyStepAnalyserDetailActivity));
                keyStepAnalyserDetailActivity.f243031g.addView(aVar3);
                keyStepAnalyserDetailActivity.f243041t = true;
            }
            View view6 = keyStepAnalyserDetailActivity.f243029e;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view8 = keyStepAnalyserDetailActivity.f243030f;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view9 = view8;
            C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view9, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity", "toggleDiagram", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/keylogger/KeyStepAnalyserDetailActivity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
