package zn3;

import android.view.View;

/* renamed from: zn3.a */
public final class C53800a implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ View f150969d;

    /* renamed from: e */
    public final /* synthetic */ View f150970e;

    public C53800a(View view, View view2) {
        this.f150969d = view;
        this.f150970e = view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r3 = (android.view.ViewGroup.MarginLayoutParams) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            r0 = this;
            android.view.View r1 = r0.f150969d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x0026
            android.view.View r2 = r0.f150970e
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x0026
            r3 = r2
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r4 = r3.bottomMargin
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.bottomMargin
            if (r4 == r1) goto L_0x0026
            r3.bottomMargin = r1
            android.view.View r1 = r0.f150970e
            r1.setLayoutParams(r2)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn3.C53800a.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
