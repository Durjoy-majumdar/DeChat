package yb2;

import android.database.DataSetObserver;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.base.preference.ButtonPreference;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import pj3.C47511g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: yb2.c */
public final class C15947c extends C15946a {

    /* renamed from: d */
    public Rect f42832d = new Rect();

    /* renamed from: e */
    public final C13601g f42833e;

    /* renamed from: f */
    public final C73244a.C6765c f42834f;

    /* renamed from: g */
    public final DataSetObserver f42835g;

    /* renamed from: h */
    public final AbsListView.OnScrollListener f42836h;

    /* renamed from: i */
    public final C13601g f42837i;

    /* renamed from: j */
    public final C13601g f42838j;

    /* renamed from: n */
    public final ArrayList<WeakReference<Preference>> f42839n;

    /* renamed from: o */
    public final WeakHashMap<View, WeakReference<Preference>> f42840o;

    /* renamed from: yb2.c$a */
    public static final class C15948a extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ C15947c f42841a;

        public C15948a(C15947c cVar) {
            this.f42841a = cVar;
        }

        public void onChanged() {
            super.onChanged();
            C15947c cVar = this.f42841a;
            cVar.mo14601g3().post(new C15955e(cVar));
        }
    }

    /* renamed from: yb2.c$b */
    public static final class C15949b extends C87413o implements C32224a {

        /* renamed from: d */
        public final /* synthetic */ C15947c f42842d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f42843e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15949b(C15947c cVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f42842d = cVar;
            this.f42843e = appCompatActivity;
        }

        public Object invoke() {
            C15947c cVar = this.f42842d;
            AppCompatActivity appCompatActivity = this.f42843e;
            for (WeakReference weakReference : (List) ((C36570n) this.f42842d.f42838j).getValue()) {
                Preference preference = (Preference) weakReference.get();
                if (preference != null) {
                    View t = preference.mo2020t((View) null, (ViewGroup) null);
                    t.setTag(preference.f121285r);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(t, aVar.mo10232b(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2", "invoke", "()Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(t, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$makeSureFloatViewExist$2", "invoke", "()Ljava/lang/Void;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    t.setOnClickListener(new C15954d(appCompatActivity, preference));
                    cVar.mo14601g3().addView(t);
                }
            }
            return null;
        }
    }

    /* renamed from: yb2.c$c */
    public static final class C15950c extends C87413o implements C32224a<ArrayList<WeakReference<Preference>>> {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f42844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15950c(AppCompatActivity appCompatActivity) {
            super(0);
            this.f42844d = appCompatActivity;
        }

        public Object invoke() {
            List<Preference> l;
            ArrayList arrayList = new ArrayList();
            AppCompatActivity appCompatActivity = this.f42844d;
            C47511g gVar = null;
            MMPreference mMPreference = appCompatActivity instanceof MMPreference ? (MMPreference) appCompatActivity : null;
            if (mMPreference != null) {
                gVar = mMPreference.getPreferenceScreen();
            }
            if (!(gVar == null || (l = gVar.mo72528l()) == null)) {
                for (Preference preference : l) {
                    if (preference instanceof ButtonPreference) {
                        arrayList.add(new WeakReference(preference));
                    }
                }
            }
            return arrayList;
        }
    }

    /* renamed from: yb2.c$d */
    public static final class C15951d implements C73244a.C6765c {

        /* renamed from: a */
        public final /* synthetic */ C15947c f42845a;

        public C15951d(C15947c cVar) {
            this.f42845a = cVar;
        }

        /* renamed from: a */
        public void mo7749a(View view, Preference preference) {
            String str = null;
            if (view != null && preference != null) {
                this.f42845a.f42840o.put(view, new WeakReference(preference));
                C15947c cVar = this.f42845a;
                Set<Map.Entry<View, WeakReference<Preference>>> entrySet = cVar.f42840o.entrySet();
                C87412m.m108593f(entrySet, "viewToPrefMap.entries");
                Iterator<T> it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    Preference preference2 = (Preference) ((WeakReference) entry.getValue()).get();
                    if (C87412m.m108589b(preference2 != null ? preference2.f121285r : null, preference.f121285r)) {
                        if (!C87412m.m108589b(entry.getKey(), view)) {
                            cVar.f42840o.remove(entry.getKey());
                        }
                    }
                }
            }
            if (preference != null) {
                str = preference.f121285r;
            }
            if (Log.isDebug()) {
                Log.m105918d("FloatPreferenceUIC", "onGetView() called with: convertView = " + view + ", pref = " + str);
            }
        }
    }

    /* renamed from: yb2.c$e */
    public static final class C15952e implements AbsListView.OnScrollListener {

        /* renamed from: d */
        public final /* synthetic */ C15947c f42846d;

        public C15952e(C15947c cVar) {
            this.f42846d = cVar;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            arrayList.add(Integer.valueOf(i3));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$onScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
            this.f42846d.mo14602i3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$onScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(absListView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$onScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC$onScrollListener$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        }
    }

    /* renamed from: yb2.c$f */
    public static final class C15953f extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ C15947c f42847d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f42848e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15953f(C15947c cVar, AppCompatActivity appCompatActivity) {
            super(0);
            this.f42847d = cVar;
            this.f42848e = appCompatActivity;
        }

        public Object invoke() {
            return (LinearLayout) C85868k2.m106137b(this.f42848e).inflate(C0966R.C0971layout.d9g, (ViewGroup) this.f42847d.findViewById(C0966R.C0970id.f358753gv2)).findViewById(C0966R.C0970id.oea);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15947c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f42833e = C36568h.m40985a(new C15953f(this, appCompatActivity));
        this.f42834f = new C15951d(this);
        this.f42835g = new C15948a(this);
        this.f42836h = new C15952e(this);
        this.f42837i = C36568h.m40985a(new C15949b(this, appCompatActivity));
        this.f42838j = C36568h.m40985a(new C15950c(appCompatActivity));
        this.f42839n = new ArrayList<>();
        this.f42840o = new WeakHashMap<>();
    }

    /* renamed from: g3 */
    public final ViewGroup mo14601g3() {
        Object value = ((C36570n) this.f42833e).getValue();
        C87412m.m108593f(value, "<get-topLayer>(...)");
        return (ViewGroup) value;
    }

    /* renamed from: i3 */
    public final void mo14602i3() {
        boolean z;
        int i;
        boolean z2;
        View view;
        C13598b0 b0Var;
        Void voidR = (Void) ((C36570n) this.f42837i).getValue();
        Iterator<WeakReference<Preference>> it = this.f42839n.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Preference preference = (Preference) it.next().get();
            if (preference != null) {
                Set<Map.Entry<View, WeakReference<Preference>>> entrySet = this.f42840o.entrySet();
                C87412m.m108593f(entrySet, "viewToPrefMap.entries");
                Iterator<T> it4 = entrySet.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        view = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it4.next();
                    Preference preference2 = (Preference) ((WeakReference) entry.getValue()).get();
                    if (C87412m.m108589b(preference2 != null ? preference2.f121285r : null, preference.f121285r)) {
                        view = (View) entry.getKey();
                        break;
                    }
                }
                if (view != null) {
                    if (!(view.getGlobalVisibleRect(this.f42832d) && this.f42832d.width() >= view.getMeasuredWidth() && this.f42832d.height() >= view.getMeasuredHeight() && view.isAttachedToWindow())) {
                        break;
                    }
                    b0Var = C13598b0.f38549a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    break;
                }
            }
        }
        z = true;
        int childCount = mo14601g3().getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = mo14601g3().getChildAt(i2);
            if (childAt != null) {
                Object tag = childAt.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.String");
                String str = (String) tag;
                if (z) {
                    Iterator<WeakReference<Preference>> it5 = this.f42839n.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z2 = false;
                            break;
                        }
                        Preference preference3 = (Preference) it5.next().get();
                        if (C87412m.m108589b(preference3 != null ? preference3.f121285r : null, str)) {
                            z2 = true;
                            break;
                        }
                    }
                    if (z2) {
                        i = 0;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i));
                        View view2 = childAt;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                i = 8;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Integer.valueOf(i));
                View view22 = childAt;
                C117292a.m165358d(view22, aVar2.mo10232b(), "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view22, "com/tencent/mm/plugin/mvvmbase/uic/FloatPreferenceUIC", "showFloatView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [pj3.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r2.getActivity()
            boolean r0 = r3 instanceof com.tencent.p014mm.p136ui.base.preference.MMPreference
            r1 = 0
            if (r0 == 0) goto L_0x000f
            com.tencent.mm.ui.base.preference.MMPreference r3 = (com.tencent.p014mm.p136ui.base.preference.MMPreference) r3
            goto L_0x0010
        L_0x000f:
            r3 = r1
        L_0x0010:
            if (r3 == 0) goto L_0x002d
            android.widget.AbsListView$OnScrollListener r0 = r2.f42836h
            r3.addOnScrollListener(r0)
            pj3.g r3 = r3.getPreferenceScreen()
            boolean r0 = r3 instanceof com.tencent.p014mm.p136ui.base.preference.C73244a
            if (r0 == 0) goto L_0x0022
            r1 = r3
            com.tencent.mm.ui.base.preference.a r1 = (com.tencent.p014mm.p136ui.base.preference.C73244a) r1
        L_0x0022:
            if (r1 == 0) goto L_0x002d
            com.tencent.mm.ui.base.preference.a$c r3 = r2.f42834f
            r1.f215129p = r3
            android.database.DataSetObserver r3 = r2.f42835g
            r1.registerDataSetObserver(r3)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb2.C15947c.onCreate(android.os.Bundle):void");
    }

    public void onResume() {
        super.onResume();
        Log.m105918d("FloatPreferenceUIC", "onResume() called");
        mo14601g3().post(new C15955e(this));
    }
}
