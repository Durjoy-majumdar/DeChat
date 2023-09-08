package l91;

import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import e91.C20554d;
import gy3.C87412m;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n91.C117614e;
import n91.C21614d;
import te3.xr4;

/* renamed from: l91.e */
public final class C21403e {

    /* renamed from: a */
    public C20554d f60550a;

    /* renamed from: b */
    public Class<?> f60551b;

    /* renamed from: c */
    public C21400b f60552c;

    /* renamed from: d */
    public int f60553d;

    /* renamed from: e */
    public C21153d f60554e;

    /* renamed from: f */
    public WeakReference<MMFragmentActivity> f60555f;

    /* renamed from: g */
    public final HashMap<String, Map<String, List<Pair<String, String>>>> f60556g = new HashMap<>();

    /* renamed from: h */
    public boolean f60557h;

    /* renamed from: l91.e$a */
    public final class C21404a implements C21153d {
        public C21404a() {
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            MMFragmentActivity mMFragmentActivity;
            C20554d dVar;
            C20554d dVar2;
            if (objArr != null) {
                if (!(!(objArr.length == 0))) {
                    return;
                }
                if (C87412m.m108589b(str2, "onPageSelected")) {
                    C21403e eVar = C21403e.this;
                    Integer num = objArr[0];
                    C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = num.intValue();
                    WeakReference<MMFragmentActivity> weakReference = eVar.f60555f;
                    if (weakReference != null && (mMFragmentActivity = weakReference.get()) != null) {
                        int i = eVar.f60553d;
                        FragmentManager supportFragmentManager = mMFragmentActivity.getSupportFragmentManager();
                        List<Fragment> fragments = supportFragmentManager == null ? null : supportFragmentManager.getFragments();
                        Fragment a = (fragments == null || fragments.isEmpty() || i < 0 || i >= fragments.size()) ? null : C117467h.m165686a(i, fragments, mMFragmentActivity);
                        FragmentManager supportFragmentManager2 = mMFragmentActivity.getSupportFragmentManager();
                        List<Fragment> fragments2 = supportFragmentManager2 == null ? null : supportFragmentManager2.getFragments();
                        Fragment a2 = (fragments2 == null || fragments2.isEmpty() || intValue < 0 || intValue >= fragments2.size()) ? null : C117467h.m165686a(intValue, fragments2, mMFragmentActivity);
                        StringBuilder sb = new StringBuilder();
                        sb.append("fragment, onPageSelected: runOnEnter: lastPos=");
                        sb.append(eVar.f60553d);
                        sb.append(", curPos=");
                        sb.append(intValue);
                        sb.append(", activity=");
                        sb.append(mMFragmentActivity.getClass().getCanonicalName());
                        sb.append(", lastFrag=");
                        sb.append(a != null ? a.getClass().getCanonicalName() : null);
                        sb.append(", curFrag=");
                        sb.append(a2 != null ? a2.getClass().getCanonicalName() : null);
                        Log.m105924i("HABBYGE-MALI.FragmentLauncherUIMonitor", sb.toString());
                        if (eVar.f60557h) {
                            int i2 = eVar.f60553d;
                            String str4 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? "-1" : "ff000004" : "ff000003" : "ff000002" : "ff000001";
                            xr4 xr4 = new xr4();
                            xr4.f354547d = str4;
                            xr4.f354555o = System.currentTimeMillis();
                            xr4.f354548e = str4;
                            xr4.f354550g = a == null ? "null" : C116711b.m164583h(a.getClass().getName());
                            xr4.f354554n = a != null ? a.hashCode() : -1;
                            String str5 = xr4.f354550g;
                            xr4.f354549f = str5;
                            xr4.f354551h = str5;
                            C21614d dVar3 = C21614d.GLIDE;
                            xr4.f354552i = 10;
                            xr4.f354561u = 0;
                            Log.m105924i("HABBYGE-MALI.FragmentLauncherUIMonitor", "FragmentMonitor, onSwipEvent: pos=" + eVar.f60553d + "\n, page.name=" + xr4.f354550g + "\n, page.hashCode=" + xr4.f354554n + "\n, EventId=" + dVar3 + "\n, resId=" + str4);
                            Map<String, WeakReference<View>> map = C117614e.f351842a;
                            C117614e.f351846e.mo33861a((View) null, xr4);
                            eVar.f60557h = false;
                        }
                        eVar.f60553d = intValue;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(a == null || (dVar2 = eVar.f60550a) == null)) {
                            ((C21406g) dVar2).mo33534e(mMFragmentActivity, a.getClass().getCanonicalName(), a.hashCode(), currentTimeMillis, true);
                        }
                        if (a2 != null && (dVar = eVar.f60550a) != null) {
                            ((C21406g) dVar).mo33535f(mMFragmentActivity, a2, a2.getClass().getCanonicalName(), a2.hashCode(), currentTimeMillis, true);
                        }
                    }
                } else if (C87412m.m108589b(str2, "onPageScrollStateChanged")) {
                    C21403e eVar2 = C21403e.this;
                    Integer num2 = objArr[0];
                    C87412m.m108592e(num2, "null cannot be cast to non-null type kotlin.Int");
                    if (num2.intValue() == 1) {
                        eVar2.f60557h = true;
                    } else {
                        eVar2.getClass();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x001a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21403e(e91.C20554d r4) {
        /*
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f60556g = r0
            r3.f60550a = r4
            l91.e$a r4 = new l91.e$a
            r4.<init>()
            r3.f60554e = r4
            java.lang.String r4 = "com.tencent.mm.ui.LauncherUI"
            r0 = 0
            java.lang.Class r0 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException -> 0x001a }
        L_0x001a:
            r3.f60551b = r0     // Catch:{ Exception -> 0x0026 }
            l91.b r4 = new l91.b     // Catch:{ Exception -> 0x0026 }
            e91.d r0 = r3.f60550a     // Catch:{ Exception -> 0x0026 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0026 }
            r3.f60552c = r4     // Catch:{ Exception -> 0x0026 }
            goto L_0x0031
        L_0x0026:
            r4 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HABBYGE-MALI.FragmentLauncherUIMonitor"
            java.lang.String r2 = "FragmentLauncherUIMonitor"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r2, r0)
        L_0x0031:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = "onPageSelected"
            java.lang.String r1 = "(I)V"
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            r4.add(r0)
            java.lang.String r0 = "onPageScrollStateChanged"
            android.util.Pair r0 = android.util.Pair.create(r0, r1)
            r4.add(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "androidx/viewpager/widget/ViewPager$OnPageChangeListener"
            r0.put(r1, r4)
            java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>> r4 = r3.f60556g
            java.lang.String r1 = "com/tencent/mm/ui/MainTabUI$TabsAdapter"
            r4.put(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l91.C21403e.<init>(e91.d):void");
    }
}
