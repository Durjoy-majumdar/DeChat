package androidx.compose.p002ui.platform;

import android.view.ViewGroup;

/* renamed from: androidx.compose.ui.platform.e3 */
public final class C103620e3 {

    /* renamed from: a */
    public static final ViewGroup.LayoutParams f306076a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: androidx.compose.ui.platform.WrappedComposition} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p175j0.C108509q m137799a(androidx.compose.p002ui.platform.AbstractComposeView r11, p175j0.C24721r r12, fy3.C32227p<? super p175j0.C108504h, ? super java.lang.Integer, rx3.C13598b0> r13) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "parent"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "content"
            gy3.C87412m.m108594g(r13, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = androidx.compose.p002ui.platform.C103708y0.f306296a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L_0x0053
            r0 = -1
            r4 = 6
            c14.h r0 = c14.C54629k.m61479a(r0, r3, r3, r4, r3)
            rx3.g<wx3.f> r4 = androidx.compose.p002ui.platform.C54163d0.f152101r
            rx3.g<wx3.f> r4 = androidx.compose.p002ui.platform.C54163d0.f152101r
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            wx3.f r4 = (wx3.C66212f) r4
            a14.n0 r5 = a14.C53930o0.m60554a(r4)
            r6 = 0
            r7 = 0
            androidx.compose.ui.platform.w0 r8 = new androidx.compose.ui.platform.w0
            r8.<init>(r0, r3)
            r9 = 3
            r10 = 0
            a14.C53895h.m60466d(r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.platform.x0 r4 = new androidx.compose.ui.platform.x0
            r4.<init>(r0)
            java.lang.Object r0 = p241t0.C110865n.f331651c
            monitor-enter(r0)
            java.util.List<fy3.l<java.lang.Object, rx3.b0>> r5 = p241t0.C110865n.f331656h     // Catch:{ all -> 0x0050 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0050 }
            r5.add(r4)     // Catch:{ all -> 0x0050 }
            monitor-exit(r0)
            p241t0.C110865n.m151138a()
            goto L_0x0053
        L_0x0050:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        L_0x0053:
            int r0 = r11.getChildCount()
            if (r0 <= 0) goto L_0x0064
            android.view.View r0 = r11.getChildAt(r1)
            boolean r4 = r0 instanceof androidx.compose.p002ui.platform.AndroidComposeView
            if (r4 == 0) goto L_0x0067
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.p002ui.platform.AndroidComposeView) r0
            goto L_0x0068
        L_0x0064:
            r11.removeAllViews()
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r0 != 0) goto L_0x0081
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r4 = r11.getContext()
            java.lang.String r5 = "context"
            gy3.C87412m.m108593f(r4, r5)
            r0.<init>(r4)
            android.view.View r4 = r0.getView()
            android.view.ViewGroup$LayoutParams r5 = f306076a
            r11.addView((android.view.View) r4, (android.view.ViewGroup.LayoutParams) r5)
        L_0x0081:
            int r11 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r11 < r4) goto L_0x0095
            androidx.compose.ui.platform.d3 r11 = androidx.compose.p002ui.platform.C67085d3.f192666a
            java.util.Map r11 = r11.mo91156a(r0)
            boolean r11 = r11.isEmpty()
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x0095
            r1 = 1
        L_0x0095:
            if (r1 == 0) goto L_0x00b8
            r11 = 2131306473(0x7f0927e9, float:1.8231146E38)
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.setTag(r11, r1)
            fy3.l<androidx.compose.ui.platform.e1, rx3.b0> r11 = androidx.compose.p002ui.platform.C103612c1.f306063a
            java.lang.Class<androidx.compose.ui.platform.c1> r11 = androidx.compose.p002ui.platform.C103612c1.class
            java.lang.String r1 = "b"
            java.lang.reflect.Field r11 = r11.getDeclaredField(r1)     // Catch:{ Exception -> 0x00b7 }
            r11.setAccessible(r2)     // Catch:{ Exception -> 0x00b7 }
            r11.setBoolean(r3, r2)     // Catch:{ Exception -> 0x00b7 }
            goto L_0x00b8
        L_0x00b7:
        L_0x00b8:
            q1.l0 r11 = new q1.l0
            q1.j r1 = r0.getRoot()
            r11.<init>(r1)
            j0.q r11 = p175j0.C108512u.m147055a(r11, r12)
            android.view.View r12 = r0.getView()
            r1 = 2131317263(0x7f09520f, float:1.825303E38)
            java.lang.Object r12 = r12.getTag(r1)
            boolean r2 = r12 instanceof androidx.compose.p002ui.platform.WrappedComposition
            if (r2 == 0) goto L_0x00d7
            r3 = r12
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.p002ui.platform.WrappedComposition) r3
        L_0x00d7:
            if (r3 != 0) goto L_0x00e5
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r11)
            android.view.View r11 = r0.getView()
            r11.setTag(r1, r3)
        L_0x00e5:
            r3.mo51662f(r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C103620e3.m137799a(androidx.compose.ui.platform.AbstractComposeView, j0.r, fy3.p):j0.q");
    }
}
