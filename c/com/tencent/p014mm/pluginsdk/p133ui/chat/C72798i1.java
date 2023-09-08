package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.view.MotionEvent;
import android.view.View;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.i1 */
public final class C72798i1 implements View.OnTouchListener {

    /* renamed from: d */
    public float f212189d;

    /* renamed from: e */
    public final /* synthetic */ View f212190e;

    /* renamed from: f */
    public final /* synthetic */ C72852z0 f212191f;

    public C72798i1(View view, C72852z0 z0Var) {
        this.f212190e = view;
        this.f212191f = z0Var;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f212189d = motionEvent.getRawY();
        } else {
            float f = 0.0f;
            if (valueOf != null && valueOf.intValue() == 2) {
                float rawY = motionEvent.getRawY() - this.f212189d;
                int height = this.f212190e.getHeight() / 2;
                this.f212191f.f212318b.getSelectHelper().mo148755a();
                View view2 = this.f212190e;
                if (rawY > 0.0f) {
                    f = (float) height;
                    if (rawY < f) {
                        f = rawY;
                    }
                }
                view2.setTranslationY(f);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                float translationY = this.f212190e.getTranslationY();
                if (translationY > ((float) (this.f212190e.getHeight() / 8))) {
                    this.f212191f.mo100688a();
                } else {
                    if (translationY < ((float) ((Number) ((C36570n) this.f212191f.f212325i).getValue()).intValue()) && view != null) {
                        view.performClick();
                    }
                    this.f212190e.animate().translationY(0.0f).start();
                }
            }
        }
        C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/chat/FullScreenEditHelper$fullScreenEdtLayout$2$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
