package com.tencent.matrix.lifecycle.owners;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.lifecycle.StatefulOwner;
import com.tencent.matrix.lifecycle.owners.C80439a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import p723vf.C118672d;
import p723vf.C90788k;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64186f0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0000H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010 \u001a\u0012\u0012\u0002\b\u0003\u0018\u00010\u001ej\b\u0012\u0002\b\u0003\u0018\u0001`\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R#\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u0010#¨\u00062"}, mo182094d2 = {"Lcom/tencent/matrix/lifecycle/owners/OverlayWindowLifecycleOwner;", "Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Landroid/view/ViewGroup$LayoutParams;", "", "isOverlayType", "inject", "Lrx3/b0;", "prepareWindowGlobal", "enable", "init$matrix_android_lib_release", "(Z)V", "init", "hasVisibleWindow", "hasOverlayWindow", "", "Landroid/view/View;", "getAllViews$matrix_android_lib_release", "()Ljava/util/List;", "getAllViews", "", "TAG", "Ljava/lang/String;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "overlayViews", "Ljava/util/HashSet;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "WindowManagerGlobal_mRoots", "Ljava/util/ArrayList;", "injected", "Z", "Lvf/k;", "Field_ViewRootImpl_mView$delegate", "Lrx3/g;", "getField_ViewRootImpl_mView", "()Lvf/k;", "Field_ViewRootImpl_mView", "Lcom/tencent/matrix/lifecycle/owners/a$a;", "onViewRootChangedListener$delegate", "getOnViewRootChangedListener", "()Lcom/tencent/matrix/lifecycle/owners/a$a;", "onViewRootChangedListener", "fallbacked", "<init>", "()V", "matrix-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 4, 2})
public final class OverlayWindowLifecycleOwner extends StatefulOwner {
    private static final C13601g Field_ViewRootImpl_mView$delegate = C36568h.m40985a(C80426a.f235371d);
    public static final OverlayWindowLifecycleOwner INSTANCE = new OverlayWindowLifecycleOwner();
    private static final String TAG = "Matrix.OverlayWindowLifecycleOwner";
    private static ArrayList<?> WindowManagerGlobal_mRoots;
    private static volatile boolean fallbacked;
    private static volatile boolean injected;
    /* access modifiers changed from: private */
    public static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static final C13601g onViewRootChangedListener$delegate = C36568h.m40985a(C80427b.f235372d);
    /* access modifiers changed from: private */
    public static final HashSet<Object> overlayViews = new HashSet<>();

    /* renamed from: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$a */
    public static final class C80426a extends C87413o implements C32224a<C90788k<View>> {

        /* renamed from: d */
        public static final C80426a f235371d = new C80426a();

        public C80426a() {
            super(0);
        }

        public Object invoke() {
            OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = OverlayWindowLifecycleOwner.INSTANCE;
            try {
                return new C90788k(Class.forName("android.view.ViewRootImpl"), "mView");
            } catch (Throwable th) {
                C118672d.m167354d(OverlayWindowLifecycleOwner.TAG, th, "", new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner$b */
    public static final class C80427b extends C87413o implements C32224a<C80442c> {

        /* renamed from: d */
        public static final C80427b f235372d = new C80427b();

        public C80427b() {
            super(0);
        }

        public Object invoke() {
            return new C80442c();
        }
    }

    private OverlayWindowLifecycleOwner() {
        super(false, 1, (C8480h) null);
    }

    /* access modifiers changed from: private */
    public final C90788k<View> getField_ViewRootImpl_mView() {
        return (C90788k) Field_ViewRootImpl_mView$delegate.getValue();
    }

    private final C80439a.C80440a getOnViewRootChangedListener() {
        return (C80439a.C80440a) onViewRootChangedListener$delegate.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0066, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0067, code lost:
        p723vf.C118672d.m167354d(TAG, r3, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner inject() {
        /*
            r9 = this;
            java.lang.String r0 = "Matrix.OverlayWindowLifecycleOwner"
            java.lang.String r1 = ""
            r2 = 0
            boolean r3 = injected     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = "Matrix.OverlayWindowLifecycleOwner"
            java.lang.String r4 = "already injected"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0066 }
            p723vf.C118672d.m167352b(r3, r4, r5)     // Catch:{ all -> 0x0066 }
            goto L_0x006c
        L_0x0013:
            java.lang.String r3 = "android.view.WindowManagerGlobal"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ all -> 0x0066 }
            java.lang.String r4 = "getInstance"
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0066 }
            vf.l r7 = new vf.l     // Catch:{ all -> 0x0066 }
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0066 }
            r7.<init>(r3, r4, r8)     // Catch:{ all -> 0x0066 }
            monitor-enter(r7)     // Catch:{ all -> 0x0066 }
            java.lang.Object r4 = r7.mo124911a(r5, r2, r6)     // Catch:{ all -> 0x0063 }
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
            java.lang.String r5 = "mLock"
            java.lang.Object r5 = p723vf.C90790m.m113857a(r3, r5, r4)     // Catch:{ all -> 0x0066 }
            java.lang.String r6 = "WindowManagerGlobal_mLock"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ all -> 0x0066 }
            monitor-enter(r5)     // Catch:{ all -> 0x0066 }
            java.lang.String r6 = "mRoots"
            java.lang.Object r6 = p723vf.C90790m.m113857a(r3, r6, r4)     // Catch:{ all -> 0x0060 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0060 }
            com.tencent.matrix.lifecycle.owners.a r7 = new com.tencent.matrix.lifecycle.owners.a     // Catch:{ all -> 0x0060 }
            com.tencent.matrix.lifecycle.owners.a$a r8 = r9.getOnViewRootChangedListener()     // Catch:{ all -> 0x0060 }
            r7.<init>(r6, r8)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "mRoots"
            vf.k r8 = new vf.k     // Catch:{ all -> 0x0060 }
            r8.<init>(r3, r6)     // Catch:{ all -> 0x0060 }
            monitor-enter(r8)     // Catch:{ all -> 0x0060 }
            r8.mo124910d(r4, r7, r2)     // Catch:{ all -> 0x005d }
            monitor-exit(r8)     // Catch:{ all -> 0x0060 }
            WindowManagerGlobal_mRoots = r7     // Catch:{ all -> 0x0060 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0060 }
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            r3 = 1
            injected = r3     // Catch:{ all -> 0x0066 }
            goto L_0x006c
        L_0x005d:
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0060 }
            throw r3     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            throw r3     // Catch:{ all -> 0x0066 }
        L_0x0063:
            r3 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0066 }
            throw r3     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            p723vf.C118672d.m167354d(r0, r3, r1, r2)
        L_0x006c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.inject():com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isOverlayType(android.view.ViewGroup.LayoutParams r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof android.view.WindowManager.LayoutParams
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0025
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 2002(0x7d2, float:2.805E-42)
            if (r0 < r3) goto L_0x0019
            android.view.WindowManager$LayoutParams r6 = (android.view.WindowManager.LayoutParams) r6
            int r6 = r6.type
            r0 = 2038(0x7f6, float:2.856E-42)
            if (r6 == r0) goto L_0x001f
            if (r6 != r4) goto L_0x0021
            goto L_0x001f
        L_0x0019:
            android.view.WindowManager$LayoutParams r6 = (android.view.WindowManager.LayoutParams) r6
            int r6 = r6.type
            if (r6 != r4) goto L_0x0021
        L_0x001f:
            r6 = 1
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r6 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.isOverlayType(android.view.ViewGroup$LayoutParams):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        p723vf.C118672d.m167354d(TAG, r4, "", new java.lang.Object[0]);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void prepareWindowGlobal() {
        /*
            r9 = this;
            java.util.ArrayList<?> r0 = WindowManagerGlobal_mRoots
            java.lang.String r1 = "WindowManagerGlobal_mRoots not found"
            if (r0 != 0) goto L_0x004d
            boolean r0 = fallbacked
            if (r0 != 0) goto L_0x0047
            r0 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "Matrix.OverlayWindowLifecycleOwner"
            java.lang.String r4 = "monitor disabled, fallback init"
            p723vf.C118672d.m167353c(r3, r4, r2)
            r2 = 1
            fallbacked = r2
            r2 = 0
            java.lang.String r4 = "android.view.WindowManagerGlobal"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "getInstance"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x003c }
            vf.l r7 = new vf.l     // Catch:{ all -> 0x003c }
            java.lang.Class[] r8 = new java.lang.Class[r0]     // Catch:{ all -> 0x003c }
            r7.<init>(r4, r5, r8)     // Catch:{ all -> 0x003c }
            monitor-enter(r7)     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r7.mo124911a(r2, r0, r6)     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)     // Catch:{ all -> 0x003c }
            java.lang.String r6 = "mRoots"
            java.lang.Object r4 = p723vf.C90790m.m113857a(r4, r6, r5)     // Catch:{ all -> 0x003c }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x003c }
            r2 = r4
            goto L_0x0044
        L_0x0039:
            r4 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x003c }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r5 = ""
            p723vf.C118672d.m167354d(r3, r4, r5, r0)
        L_0x0044:
            WindowManagerGlobal_mRoots = r2
            goto L_0x004d
        L_0x0047:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r0.<init>(r1)
            throw r0
        L_0x004d:
            java.util.ArrayList<?> r0 = WindowManagerGlobal_mRoots
            if (r0 == 0) goto L_0x0060
            vf.k r0 = r9.getField_ViewRootImpl_mView()
            if (r0 == 0) goto L_0x0058
            return
        L_0x0058:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            java.lang.String r1 = "Field_ViewRootImpl_mView not found"
            r0.<init>(r1)
            throw r0
        L_0x0060:
            java.lang.ClassNotFoundException r0 = new java.lang.ClassNotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.owners.OverlayWindowLifecycleOwner.prepareWindowGlobal():void");
    }

    public final List<View> getAllViews$matrix_android_lib_release() {
        C64186f0 f0Var = C64186f0.f181907d;
        try {
            INSTANCE.prepareWindowGlobal();
            ArrayList<?> arrayList = WindowManagerGlobal_mRoots;
            if (arrayList == null) {
                return f0Var;
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            for (T next : arrayList) {
                C90788k<View> field_ViewRootImpl_mView = INSTANCE.getField_ViewRootImpl_mView();
                C87412m.m108591d(field_ViewRootImpl_mView);
                arrayList2.add(field_ViewRootImpl_mView.mo124907a(next));
            }
            return C110818d0.m150953y0(arrayList2);
        } catch (Throwable th) {
            C118672d.m167354d(TAG, th, "", new Object[0]);
            return f0Var;
        }
    }

    public final boolean hasOverlayWindow() {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        if (injected) {
            return active();
        }
        try {
            INSTANCE.prepareWindowGlobal();
            ArrayList<?> arrayList = WindowManagerGlobal_mRoots;
            C87412m.m108591d(arrayList);
            if (arrayList.isEmpty()) {
                return false;
            }
            for (T next : arrayList) {
                OverlayWindowLifecycleOwner overlayWindowLifecycleOwner = INSTANCE;
                C90788k<View> field_ViewRootImpl_mView = overlayWindowLifecycleOwner.getField_ViewRootImpl_mView();
                C87412m.m108591d(field_ViewRootImpl_mView);
                View a = field_ViewRootImpl_mView.mo124907a(next);
                if (a != null && (layoutParams = a.getLayoutParams()) != null && overlayWindowLifecycleOwner.isOverlayType(layoutParams) && a.getVisibility() == 0 && a.getWindowVisibility() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C118672d.m167354d(TAG, th, "", new Object[0]);
            return false;
        }
    }

    public final boolean hasVisibleWindow() {
        boolean z;
        try {
            INSTANCE.prepareWindowGlobal();
            ArrayList<?> arrayList = WindowManagerGlobal_mRoots;
            C87412m.m108591d(arrayList);
            if (arrayList.isEmpty()) {
                return false;
            }
            for (T next : arrayList) {
                C90788k<View> field_ViewRootImpl_mView = INSTANCE.getField_ViewRootImpl_mView();
                C87412m.m108591d(field_ViewRootImpl_mView);
                View a = field_ViewRootImpl_mView.mo124907a(next);
                if (a != null && a.getVisibility() == 0 && a.getWindowVisibility() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C118672d.m167354d(TAG, th, "", new Object[0]);
            return false;
        }
    }

    public final void init$matrix_android_lib_release(boolean z) {
        if (!z) {
            C118672d.m167353c(TAG, "disabled", new Object[0]);
        } else {
            inject();
        }
    }
}
