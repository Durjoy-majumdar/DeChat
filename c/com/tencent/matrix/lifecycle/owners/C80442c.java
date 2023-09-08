package com.tencent.matrix.lifecycle.owners;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.lifecycle.owners.C80439a;
import gy3.C87412m;
import p723vf.C118672d;
import p723vf.C90788k;

/* renamed from: com.tencent.matrix.lifecycle.owners.c */
public final class C80442c implements C80439a.C80440a {

    /* renamed from: com.tencent.matrix.lifecycle.owners.c$a */
    public static final class C80443a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Object f235404d;

        public C80443a(C80442c cVar, Object obj) {
            this.f235404d = obj;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            View view = null;
            try {
                C90788k access$getField_ViewRootImpl_mView$p = OverlayWindowLifecycleOwner.INSTANCE.getField_ViewRootImpl_mView();
                View view2 = access$getField_ViewRootImpl_mView$p != null ? (View) access$getField_ViewRootImpl_mView$p.mo124907a(this.f235404d) : null;
                if (view2 != null) {
                    view = view2;
                    if (view != null && (layoutParams = view.getLayoutParams()) != null) {
                        OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = OverlayWindowLifecycleOwner.INSTANCE;
                        if (overlayWindowLifecycleOwner.isOverlayType(layoutParams)) {
                            if (OverlayWindowLifecycleOwner.overlayViews.isEmpty()) {
                                overlayWindowLifecycleOwner.turnOn();
                            }
                            OverlayWindowLifecycleOwner.overlayViews.add(this.f235404d);
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            } catch (Throwable th) {
                C118672d.m167354d("Matrix.OverlayWindowLifecycleOwner", th, "", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo111956a(Object obj) {
        C87412m.m108594g(obj, "o");
        OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = OverlayWindowLifecycleOwner.INSTANCE;
        OverlayWindowLifecycleOwner.overlayViews.remove(obj);
        if (OverlayWindowLifecycleOwner.overlayViews.isEmpty()) {
            overlayWindowLifecycleOwner.turnOff();
        }
    }

    /* renamed from: b */
    public void mo111957b(Object obj) {
        C87412m.m108594g(obj, "o");
        OverlayWindowLifecycleOwner.mainHandler.post(new C80443a(this, obj));
    }
}
