package p1010nc;

import android.animation.ValueAnimator;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nc.a$$a */
public final /* synthetic */ class a$$a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C88916a f256459d;

    public /* synthetic */ a$$a(C88916a aVar) {
        this.f256459d = aVar;
    }

    public final void onClick(View view) {
        C88916a aVar = this.f256459d;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/luggage/skyline/wxa/inspector/ConsoleViewWrapper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
        if (aVar.f256455e) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new C88919d(aVar));
            ofFloat.start();
            aVar.f256455e = false;
        } else {
            ((C88922g) aVar.f256451a).f256467a.setTranslationY((float) aVar.mo123302a());
            ((C88922g) aVar.f256451a).f256467a.setVisibility(0);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat2.addUpdateListener(new C88920e(aVar));
            ofFloat2.start();
            aVar.f256455e = true;
        }
        C117292a.m165361g(aVar, "com/tencent/luggage/skyline/wxa/inspector/ConsoleViewWrapper", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
