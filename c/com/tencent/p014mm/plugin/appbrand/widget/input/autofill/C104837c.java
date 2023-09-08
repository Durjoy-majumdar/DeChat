package com.tencent.p014mm.plugin.appbrand.widget.input.autofill;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C104863f1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84996v;
import com.tencent.p014mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.c */
public final class C104837c {

    /* renamed from: a */
    public final C104863f1 f311354a;

    /* renamed from: b */
    public final C68706f f311355b;

    /* renamed from: c */
    public final C84996v.C85001d f311356c = new C104838a();

    /* renamed from: d */
    public C83780d1 f311357d;

    /* renamed from: e */
    public int f311358e = Integer.MIN_VALUE;

    /* renamed from: f */
    public boolean f311359f = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.c$a */
    public class C104838a implements C84996v.C85001d {
        public C104838a() {
        }

        /* renamed from: a */
        public void mo117917a() {
            C104837c cVar = C104837c.this;
            cVar.f311358e = Integer.MIN_VALUE;
            cVar.mo148736b(3);
        }

        /* renamed from: b */
        public void mo117918b() {
            C104837c cVar = C104837c.this;
            cVar.f311358e = Integer.MIN_VALUE;
            cVar.mo148736b(3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.autofill.c$b */
    public class C104839b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: d */
        public final /* synthetic */ ListView f311361d;

        public C104839b(ListView listView, int i) {
            this.f311361d = listView;
        }

        public boolean onPreDraw() {
            AutoFillListPopupWindowBase.C68700a aVar;
            View inputPanel;
            this.f311361d.getViewTreeObserver().removeOnPreDrawListener(this);
            C104837c cVar = C104837c.this;
            if (!(!cVar.f311355b.mo94496b() || (aVar = cVar.f311355b.f197359d) == null || aVar.getAdapter() == null || cVar.f311355b.f197359d.getAdapter().getCount() <= 0 || (inputPanel = cVar.f311354a.getInputPanel()) == null)) {
                int b = C76577a.m92151b(cVar.f311354a.getContext(), 8);
                int i = 0;
                int height = cVar.f311355b.f197359d.getChildAt(0).getHeight();
                int count = cVar.f311355b.f197359d.getAdapter().getCount() * height;
                int i2 = b * 2;
                int i3 = count + i2;
                int i4 = (height * 3) + i2;
                if (i3 > i4) {
                    count = i4 - i2;
                    i3 = i4;
                }
                int i5 = count;
                cVar.f311355b.f197360e = i3;
                int[] iArr = new int[2];
                cVar.f311354a.getView().getLocationInWindow(iArr);
                int height2 = iArr[1] + cVar.f311354a.getView().getHeight();
                inputPanel.getLocationInWindow(iArr);
                cVar.mo148735a(height2, iArr[1], height, i5, b);
                cVar.f311355b.mo94497c();
                C68706f fVar = cVar.f311355b;
                if (fVar.f197363h) {
                    i = fVar.f197362g;
                }
                cVar.f311358e = i;
            }
            return true;
        }
    }

    public C104837c(C104863f1 f1Var, C68706f fVar) {
        this.f311354a = f1Var;
        this.f311355b = fVar;
    }

    /* renamed from: a */
    public final void mo148735a(int i, int i2, int i3, int i4, int i5) {
        int i6 = this.f311358e;
        if ((i6 == Integer.MIN_VALUE || i6 >= 0 - i5) && i2 - i >= i4 + i5) {
            this.f311355b.f197368m = this.f311354a.getView();
            C68706f fVar = this.f311355b;
            fVar.f197360e = i4 + (i5 * 2);
            fVar.f197362g = 0 - i5;
            fVar.f197363h = true;
        } else if (i - this.f311354a.getView().getHeight() >= i4) {
            this.f311355b.f197368m = this.f311354a.getView();
            C68706f fVar2 = this.f311355b;
            fVar2.f197360e = (i5 * 2) + i4;
            fVar2.f197362g = (-(i4 + i5)) - this.f311354a.getView().getHeight();
            fVar2.f197363h = true;
        } else if (i4 <= i3) {
            C68706f fVar3 = this.f311355b;
            fVar3.f197360e = i3;
            fVar3.f197368m = this.f311354a.getView();
            int i7 = 0 - i5;
            if (this.f311358e < i7) {
                C68706f fVar4 = this.f311355b;
                fVar4.f197362g = (-(i4 + i5)) - this.f311354a.getView().getHeight();
                fVar4.f197363h = true;
                return;
            }
            C68706f fVar5 = this.f311355b;
            fVar5.f197362g = i7;
            fVar5.f197363h = true;
        } else {
            mo148735a(i, i2, i3, i4 - i3, i5);
        }
    }

    /* renamed from: b */
    public final void mo148736b(int i) {
        C68706f fVar = this.f311355b;
        AutoFillListPopupWindowBase.C68700a aVar = fVar.f197359d;
        if (aVar != null && fVar.mo94496b()) {
            if (1 == i && this.f311359f) {
                this.f311358e = Integer.MIN_VALUE;
                this.f311359f = false;
            }
            aVar.getViewTreeObserver().addOnPreDrawListener(new C104839b(aVar, i));
        }
    }
}
