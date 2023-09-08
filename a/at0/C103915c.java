package at0;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.appbrand.C1523c3;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: at0.c */
public final class C103915c extends View.AccessibilityDelegate {

    /* renamed from: l */
    public static final C67105b f307262l = new C67105b((C8480h) null);

    /* renamed from: m */
    public static C54326b f307263m = new C54327a();

    /* renamed from: a */
    public final View f307264a;

    /* renamed from: b */
    public final Class<? extends View> f307265b;

    /* renamed from: c */
    public final String f307266c;

    /* renamed from: d */
    public final boolean f307267d;

    /* renamed from: e */
    public final Boolean f307268e;

    /* renamed from: f */
    public final Boolean f307269f;

    /* renamed from: g */
    public final String f307270g;

    /* renamed from: h */
    public final C32224a<Boolean> f307271h;

    /* renamed from: i */
    public final Rect f307272i;

    /* renamed from: j */
    public final Rect f307273j = new Rect();

    /* renamed from: k */
    public final C13601g f307274k = C36568h.m40986b(C13602i.NONE, new C103917e(this));

    /* renamed from: at0.c$a */
    public static final class C54327a implements C54326b {
        /* renamed from: a */
        public void mo75107a(View view, int i, int i2, int i3, int i4) {
            C87412m.m108594g(view, "view");
            Rect rect = new Rect();
            view.getHitRect(rect);
            rect.left -= i;
            rect.top -= i2;
            rect.right += i3;
            rect.bottom += i4;
            ViewParent parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                view2.setTouchDelegate(new TouchDelegate(rect, view));
            }
        }
    }

    /* renamed from: at0.c$b */
    public static final class C67105b {

        /* renamed from: at0.c$b$a */
        public static final class C67106a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f192694d;

            /* renamed from: e */
            public final /* synthetic */ int f192695e;

            /* renamed from: f */
            public final /* synthetic */ int f192696f;

            /* renamed from: g */
            public final /* synthetic */ int f192697g;

            /* renamed from: h */
            public final /* synthetic */ int f192698h;

            public C67106a(View view, int i, int i2, int i3, int i4) {
                this.f192694d = view;
                this.f192695e = i;
                this.f192696f = i2;
                this.f192697g = i3;
                this.f192698h = i4;
            }

            public final void run() {
                C67105b bVar = C103915c.f307262l;
                Class cls = C1523c3.class;
                if (C86312j.m106916h(cls)) {
                    ((C1523c3) C86312j.m106911c(cls)).waitFor();
                }
                C103915c.f307263m.mo75107a(this.f192694d, this.f192695e, this.f192696f, this.f192697g, this.f192698h);
            }
        }

        public C67105b(C8480h hVar) {
        }

        /* renamed from: b */
        public static /* synthetic */ void m79374b(C67105b bVar, View view, Class cls, Integer num, boolean z, Boolean bool, Boolean bool2, Integer num2, C32224a aVar, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, int i, Object obj) {
            int i2 = i;
            Integer num8 = null;
            Class cls2 = (i2 & 2) != 0 ? null : cls;
            Integer num9 = (i2 & 4) != 0 ? null : num;
            boolean z2 = (i2 & 8) != 0 ? false : z;
            Boolean bool3 = (i2 & 16) != 0 ? null : bool;
            Boolean bool4 = (i2 & 32) != 0 ? null : bool2;
            Integer num10 = (i2 & 64) != 0 ? null : num2;
            C32224a aVar2 = (i2 & 128) != 0 ? null : aVar;
            Integer num11 = (i2 & 256) != 0 ? null : num3;
            Integer num12 = (i2 & 512) != 0 ? null : num4;
            Integer num13 = (i2 & 1024) != 0 ? null : num5;
            Integer num14 = (i2 & 2048) != 0 ? null : num6;
            if ((i2 & 4096) == 0) {
                num8 = num7;
            }
            bVar.mo91205a(view, cls2, num9, z2, bool3, bool4, num10, aVar2, num11, num12, num13, num14, num8);
        }

        /* renamed from: a */
        public final void mo91205a(View view, Class<? extends View> cls, Integer num, boolean z, Boolean bool, Boolean bool2, Integer num2, C32224a<Boolean> aVar, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
            View view2 = view;
            C87412m.m108594g(view, "view");
            Rect rect = null;
            String string = num != null ? view.getContext().getString(num.intValue()) : null;
            String string2 = num2 != null ? view.getContext().getString(num2.intValue()) : null;
            int c = num7 != null ? C74942w4.m89786c(view.getContext(), num7.intValue()) : 0;
            int a = num3 != null ? C74942w4.m89784a(view.getContext(), num3.intValue()) : c;
            int a2 = num4 != null ? C74942w4.m89784a(view.getContext(), num4.intValue()) : c;
            int a3 = num5 != null ? C74942w4.m89784a(view.getContext(), num5.intValue()) : c;
            if (num6 != null) {
                c = C74942w4.m89784a(view.getContext(), num6.intValue());
            }
            int i = c;
            if (!(a == 0 && a2 == 0 && a3 == 0 && i == 0)) {
                view.post(new C67106a(view, a, a3, a2, i));
                rect = new Rect(a, a3, a2, i);
            }
            view.setAccessibilityDelegate(new C103915c(view, cls, string, z, bool, bool2, string2, aVar, rect, (C8480h) null));
        }
    }

    public C103915c(View view, Class cls, String str, boolean z, Boolean bool, Boolean bool2, String str2, C32224a aVar, Rect rect, C8480h hVar) {
        this.f307264a = view;
        this.f307265b = cls;
        this.f307266c = str;
        this.f307267d = z;
        this.f307268e = bool;
        this.f307269f = bool2;
        this.f307270g = str2;
        this.f307271h = aVar;
        this.f307272i = rect;
    }

    /* renamed from: a */
    public static final void m138604a(View view, Class<? extends View> cls, Integer num, boolean z, Boolean bool, Boolean bool2, Integer num2, C32224a<Boolean> aVar, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        f307262l.mo91205a(view, cls, num, z, bool, bool2, num2, aVar, num3, num4, num5, num6, num7);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C103916d dVar = (C103916d) this.f307274k.getValue();
        return dVar != null ? dVar : super.getAccessibilityNodeProvider(view);
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Class<? extends View> cls = this.f307265b;
        if (!(cls == null || accessibilityNodeInfo == null)) {
            accessibilityNodeInfo.setClassName(cls.getName());
        }
        String str = this.f307266c;
        if (!(str == null || accessibilityNodeInfo == null)) {
            accessibilityNodeInfo.setContentDescription(str);
        }
        if (this.f307267d && accessibilityNodeInfo != null) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
        Boolean bool = this.f307268e;
        if (!(bool == null || accessibilityNodeInfo == null)) {
            accessibilityNodeInfo.setFocusable(bool.booleanValue());
        }
        Boolean bool2 = this.f307269f;
        if (!(bool2 == null || accessibilityNodeInfo == null)) {
            accessibilityNodeInfo.setClickable(bool2.booleanValue());
        }
        if (!(this.f307270g == null || accessibilityNodeInfo == null)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, this.f307270g));
        }
        C32224a<Boolean> aVar = this.f307271h;
        if (aVar != null) {
            boolean booleanValue = aVar.invoke().booleanValue();
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setCheckable(true);
            }
            if (accessibilityNodeInfo != null) {
                accessibilityNodeInfo.setChecked(booleanValue);
            }
        }
    }
}
