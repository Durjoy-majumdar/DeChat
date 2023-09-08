package p935cb;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cb.a */
public class C79969a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C79973e f234240d;

    public C79969a(C79973e eVar) {
        this.f234240d = eVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/luggage/game/inspector/ConsoleViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C79973e eVar = this.f234240d;
        if (eVar.f234250d) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new C79971c(eVar));
            ofFloat.start();
            eVar.f234250d = false;
        } else {
            eVar.f234247a.mo110155d((float) eVar.mo110150a());
            eVar.f234247a.setVisibility(0);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat2.addUpdateListener(new C79972d(eVar));
            ofFloat2.start();
            eVar.f234250d = true;
        }
        C117292a.m165361g(this, "com/tencent/luggage/game/inspector/ConsoleViewWrapper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
