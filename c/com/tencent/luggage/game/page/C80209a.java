package com.tencent.luggage.game.page;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.p014mm.plugin.appbrand.page.C1943c3;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;
import com.tencent.p014mm.plugin.appbrand.page.C83827i3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.luggage.game.page.a */
public class C80209a extends FrameLayout implements C83827i3 {

    /* renamed from: d */
    public C80210c f234767d = null;

    /* renamed from: com.tencent.luggage.game.page.a$b */
    public static final class C40000b implements View.OnTouchListener {
        public C40000b(C39999a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/luggage/game/page/GameNativeWidgetContainer$ConsumeAllTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/luggage/game/page/GameNativeWidgetContainer$ConsumeAllTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.luggage.game.page.a$c */
    public interface C80210c {
        /* renamed from: E */
        void mo111237E(View view);
    }

    public C80209a(Context context) {
        super(context);
    }

    /* renamed from: d */
    public void mo111230d(C1943c3 c3Var) {
    }

    /* renamed from: e */
    public void mo111231e(int i) {
    }

    /* renamed from: g */
    public void mo63351g(boolean z, int i, int i2, int i3, int i4) {
    }

    public ViewGroup getContainer() {
        return this;
    }

    /* renamed from: i */
    public void mo111233i(C83797e3 e3Var) {
    }

    public void onScrollChanged(int i, int i2, int i3, int i4, View view) {
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if ((view instanceof CoverViewContainer) && !view.hasOnClickListeners()) {
            view.setOnTouchListener(new C40000b((C39999a) null));
        }
        C80210c cVar = this.f234767d;
        if (cVar != null) {
            cVar.mo111237E(view);
        }
    }

    public void setNativeWidgetAddedCallback(C80210c cVar) {
        this.f234767d = cVar;
    }

    public void setupWebViewTouchInterceptor(C83797e3 e3Var) {
    }
}
