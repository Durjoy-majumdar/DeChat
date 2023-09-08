package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.page.C83797e3;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.i */
public final class C84959i {

    /* renamed from: b */
    public static final C84959i f247617b = new C84959i();

    /* renamed from: a */
    public final C84961b f247618a = new C84961b((C84960a) null);

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.i$b */
    public static final class C84961b {

        /* renamed from: a */
        public final SparseIntArray f247619a = new SparseIntArray();

        public C84961b(C84960a aVar) {
        }
    }

    /* renamed from: a */
    public void mo117840a(C83797e3 e3Var) {
        if (e3Var != null) {
            this.f247618a.f247619a.delete(e3Var.hashCode());
            try {
                e3Var.getWrapperView().setFocusable(true);
                e3Var.getWrapperView().setFocusableInTouchMode(true);
                e3Var.getContentView().setFocusable(true);
                e3Var.getContentView().setFocusableInTouchMode(true);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo117841b(C83797e3 e3Var) {
        if (e3Var != null) {
            this.f247618a.f247619a.put(e3Var.hashCode(), this.f247618a.f247619a.get(e3Var.hashCode(), 0) + 1);
            try {
                e3Var.getWrapperView().setFocusable(false);
                e3Var.getWrapperView().setFocusableInTouchMode(false);
                e3Var.getContentView().setFocusable(false);
                e3Var.getContentView().setFocusableInTouchMode(false);
                if (e3Var.getWrapperView() instanceof ViewGroup) {
                    ((ViewGroup) e3Var.getWrapperView()).setDescendantFocusability(393216);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo117842c(C83797e3 e3Var) {
        if (e3Var != null) {
            int i = this.f247618a.f247619a.get(e3Var.hashCode(), 0) - 1;
            if (i <= 0) {
                mo117840a(e3Var);
            } else {
                this.f247618a.f247619a.put(e3Var.hashCode(), i);
            }
        }
    }
}
