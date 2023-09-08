package p1108f3;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: f3.e */
public class C107457e {

    /* renamed from: a */
    public final Object f321493a;

    /* renamed from: f3.e$a */
    public static class C107458a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C107457e f321494a;

        public C107458a(C107457e eVar) {
            this.f321494a = eVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C107453d a = this.f321494a.mo157869a(i);
            if (a == null) {
                return null;
            }
            return a.f321473a;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f321494a.getClass();
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f321494a.mo157871c(i, i2, bundle);
        }
    }

    /* renamed from: f3.e$b */
    public static class C107459b extends C107458a {
        public C107459b(C107457e eVar) {
            super(eVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C107453d b = this.f321494a.mo157870b(i);
            if (b == null) {
                return null;
            }
            return b.f321473a;
        }
    }

    /* renamed from: f3.e$c */
    public static class C107460c extends C107459b {
        public C107460c(C107457e eVar) {
            super(eVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f321494a.getClass();
        }
    }

    public C107457e() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f321493a = new C107460c(this);
        } else {
            this.f321493a = new C107459b(this);
        }
    }

    /* renamed from: a */
    public C107453d mo157869a(int i) {
        return null;
    }

    /* renamed from: b */
    public C107453d mo157870b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo157871c(int i, int i2, Bundle bundle) {
        return false;
    }

    public C107457e(Object obj) {
        this.f321493a = obj;
    }
}
