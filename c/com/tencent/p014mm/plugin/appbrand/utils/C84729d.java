package com.tencent.p014mm.plugin.appbrand.utils;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.observer.MvvmObserverOwner;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.d */
public final class C84729d implements C84796y0 {

    /* renamed from: d */
    public static final C84729d f247128d = new C84729d();

    /* renamed from: e */
    public static final C13601g f247129e = C36568h.m40985a(C40566a.f108962d);

    /* renamed from: f */
    public static final C13601g f247130f = C36568h.m40985a(C84730b.f247131d);

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.d$a */
    public static final class C40566a extends C87413o implements C32224a<AccessibilityManager> {

        /* renamed from: d */
        public static final C40566a f108962d = new C40566a();

        public C40566a() {
            super(0);
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            Object systemService = context != null ? context.getSystemService("accessibility") : null;
            if (systemService instanceof AccessibilityManager) {
                return (AccessibilityManager) systemService;
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.d$b */
    public static final class C84730b extends C87413o implements C32224a<C84733e> {

        /* renamed from: d */
        public static final C84730b f247131d = new C84730b();

        public C84730b() {
            super(0);
        }

        public Object invoke() {
            C84733e eVar = new C84733e();
            C84729d dVar = C84729d.f247128d;
            AccessibilityManager accessibilityManager = (AccessibilityManager) ((C36570n) C84729d.f247129e).getValue();
            if (accessibilityManager != null) {
                accessibilityManager.addTouchExplorationStateChangeListener(new C84736f(eVar));
            }
            return eVar;
        }
    }

    /* renamed from: Q9 */
    public MvvmObserverOwner<IMvvmObserver<Boolean>, Boolean> mo117450Q9() {
        return (MvvmObserverOwner) ((C36570n) f247130f).getValue();
    }

    public boolean isEnable() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) ((C36570n) f247129e).getValue();
        if (accessibilityManager != null) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        return false;
    }
}
