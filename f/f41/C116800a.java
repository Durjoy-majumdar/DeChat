package f41;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ao3.C113066a;
import com.tencent.p014mm.autogen.events.FixVasLogicEvent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.p136ui.vas.VASCommonFragment;
import com.tencent.p014mm.p136ui.vas.launcher.VASLauncher;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i20.C117129d;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import n31.C117601c;
import sx3.C64186f0;
import vn3.C111562e;

/* renamed from: f41.a */
public final class C116800a implements C113066a {

    /* renamed from: d */
    public static final C116800a f350124d = new C116800a();

    /* renamed from: e */
    public static CopyOnWriteArrayList<C117601c> f350125e = new CopyOnWriteArrayList<>();

    /* renamed from: f */
    public static final List<Integer> f350126f = new ArrayList();

    /* renamed from: g */
    public static final ConcurrentHashMap<Integer, C116802b> f350127g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final ConcurrentHashMap<Integer, Integer> f350128h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public static final CopyOnWriteArrayList<Integer> f350129i = new CopyOnWriteArrayList<>();

    /* renamed from: j */
    public static final Map<String, List<Pair<String, String>>> f350130j;

    /* renamed from: n */
    public static final String f350131n = "doResume";

    /* renamed from: o */
    public static final String f350132o = "doPause";

    /* renamed from: p */
    public static boolean f350133p;

    /* renamed from: q */
    public static boolean f350134q = true;

    /* renamed from: r */
    public static final C116804d f350135r = new C116804d();

    /* renamed from: s */
    public static final C116803c f350136s = new C116803c();

    /* renamed from: f41.a$a */
    public enum C116801a {
        ON_RESUME,
        ON_PAUSE,
        ON_DESTROY_VIEW,
        ON_DESTROY
    }

    /* renamed from: f41.a$b */
    public static final class C116802b {

        /* renamed from: a */
        public WeakReference<Fragment> f350142a;

        /* renamed from: b */
        public boolean f350143b;

        /* renamed from: c */
        public boolean f350144c;

        /* renamed from: d */
        public boolean f350145d;

        /* renamed from: e */
        public boolean f350146e;

        /* renamed from: f */
        public boolean f350147f;

        /* renamed from: g */
        public boolean f350148g;

        /* renamed from: h */
        public boolean f350149h = true;

        /* renamed from: i */
        public boolean f350150i;

        /* renamed from: j */
        public final List<Integer> f350151j = new ArrayList();

        /* renamed from: k */
        public Integer f350152k;

        /* renamed from: l */
        public boolean f350153l = true;

        public C116802b(WeakReference<Fragment> weakReference, boolean z) {
            C87412m.m108594g(weakReference, "curFragment");
            this.f350142a = weakReference;
            this.f350143b = z;
        }
    }

    /* renamed from: f41.a$c */
    public static final class C116803c implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (obj instanceof Fragment) {
                if (C87412m.m108589b(str2, C116800a.f350131n)) {
                    Fragment fragment = (Fragment) obj;
                    if (fragment.isResumed() && !fragment.isHidden()) {
                        if (C116800a.f350134q) {
                            C116800a.f350134q = false;
                            return;
                        }
                        ConcurrentHashMap<Integer, C116802b> concurrentHashMap = C116800a.f350127g;
                        if (!concurrentHashMap.containsKey(Integer.valueOf(fragment.hashCode()))) {
                            concurrentHashMap.put(Integer.valueOf(fragment.hashCode()), new C116802b(new WeakReference(obj), true));
                        }
                        Log.m105924i("Amoeba.FragmentEventMonitor", "chatting fragment onResume");
                        C116800a.f350124d.mo180783n(fragment);
                    }
                } else if (C87412m.m108589b(str2, C116800a.f350132o)) {
                    Log.m105924i("Amoeba.FragmentEventMonitor", "chatting fragment onPause");
                    C116800a.f350124d.mo180779j((Fragment) obj, false);
                }
            }
        }
    }

    /* renamed from: f41.a$d */
    public static final class C116804d implements C117129d {
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
            if ((r1 != null && r1.f350150i) != false) goto L_0x0045;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo180792a(java.lang.Object r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof androidx.fragment.app.Fragment
                if (r0 == 0) goto L_0x004b
                f41.a r0 = f41.C116800a.f350124d
                androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
                boolean r1 = f41.C116800a.m164754a(r0, r6)
                if (r1 != 0) goto L_0x004b
                boolean r1 = r0.mo180776g(r6)
                if (r1 == 0) goto L_0x004b
                boolean r1 = r6 instanceof com.tencent.p014mm.p136ui.vas.VASCommonFragment
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0045
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r1 = f41.C116800a.f350128h
                int r4 = r6.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                boolean r1 = r1.containsKey(r4)
                if (r1 != 0) goto L_0x0046
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, f41.a$b> r1 = f41.C116800a.f350127g
                int r4 = r6.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                java.lang.Object r1 = r1.get(r4)
                f41.a$b r1 = (f41.C116800a.C116802b) r1
                if (r1 == 0) goto L_0x0042
                boolean r1 = r1.f350150i
                if (r1 != r3) goto L_0x0042
                r1 = 1
                goto L_0x0043
            L_0x0042:
                r1 = 0
            L_0x0043:
                if (r1 == 0) goto L_0x0046
            L_0x0045:
                r2 = 1
            L_0x0046:
                if (r2 == 0) goto L_0x004b
                r0.mo180783n(r6)
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f41.C116800a.C116804d.mo180792a(java.lang.Object):void");
        }

        /* renamed from: b */
        public void mo180793b(Object obj) {
            if (obj instanceof Fragment) {
                C116800a aVar = C116800a.f350124d;
                Fragment fragment = (Fragment) obj;
                if (!C116800a.m164754a(aVar, fragment)) {
                    aVar.mo180779j(fragment, false);
                }
            }
        }

        /* renamed from: c */
        public void mo180794c(Object obj) {
            if (obj instanceof Fragment) {
                String simpleName = obj.getClass().getSimpleName();
                if (obj instanceof VASCommonFragment) {
                    VASActivity vASActivity = ((VASCommonFragment) obj).f348642o;
                    simpleName = String.valueOf(vASActivity != null ? vASActivity.getClass().getSimpleName() : null);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[onFragmentDestroy] ");
                sb.append(simpleName);
                sb.append(' ');
                Fragment fragment = (Fragment) obj;
                sb.append(fragment.hashCode());
                Log.m105924i("Amoeba.FragmentEventMonitor", sb.toString());
                int hashCode = fragment.hashCode();
                C116800a.f350127g.remove(Integer.valueOf(hashCode));
                ((ArrayList) C116800a.f350126f).remove(Integer.valueOf(hashCode));
                Integer remove = C116800a.f350128h.remove(Integer.valueOf(hashCode));
                C116800a.f350124d.mo180778i(fragment, C116801a.ON_DESTROY, true);
            }
        }

        /* renamed from: d */
        public void mo180795d(Object obj, boolean z) {
            if (obj instanceof Fragment) {
                ConcurrentHashMap<Integer, C116802b> concurrentHashMap = C116800a.f350127g;
                Fragment fragment = (Fragment) obj;
                if (concurrentHashMap.containsKey(Integer.valueOf(fragment.hashCode()))) {
                    C116802b bVar = concurrentHashMap.get(Integer.valueOf(fragment.hashCode()));
                    if (bVar != null) {
                        bVar.f350143b = z;
                    }
                } else {
                    concurrentHashMap.put(Integer.valueOf(fragment.hashCode()), new C116802b(new WeakReference(obj), z));
                }
                if (fragment.isResumed()) {
                    C116800a aVar = C116800a.f350124d;
                    if (C116800a.m164754a(aVar, fragment)) {
                        return;
                    }
                    if (z) {
                        aVar.mo180783n(fragment);
                        aVar.mo180772c(fragment);
                        return;
                    }
                    aVar.mo180771b(fragment);
                    aVar.mo180779j(fragment, false);
                }
            }
        }

        /* renamed from: e */
        public void mo180796e(Object obj) {
            if (obj instanceof Fragment) {
                C116800a.f350124d.mo180778i((Fragment) obj, C116801a.ON_DESTROY_VIEW, true);
            }
        }

        /* renamed from: f */
        public void mo180797f(Object obj, boolean z) {
            if (obj instanceof Fragment) {
                C116800a aVar = C116800a.f350124d;
                Fragment fragment = (Fragment) obj;
                if (!C116800a.m164754a(aVar, fragment)) {
                    aVar.mo180784o(fragment, z);
                    if (fragment.isResumed() && !C116800a.m164754a(aVar, fragment)) {
                        if (z) {
                            aVar.mo180771b(fragment);
                            aVar.mo180779j(fragment, false);
                            return;
                        }
                        aVar.mo180783n(fragment);
                        aVar.mo180772c(fragment);
                    }
                }
            }
        }

        /* renamed from: g */
        public void mo180798g(Object obj) {
            VASActivity vASActivity;
            if (obj instanceof Fragment) {
                Fragment fragment = (Fragment) obj;
                if (!C116800a.m164754a(C116800a.f350124d, fragment)) {
                    ConcurrentHashMap<Integer, C116802b> concurrentHashMap = C116800a.f350127g;
                    C116802b bVar = concurrentHashMap.get(Integer.valueOf(fragment.hashCode()));
                    if (bVar == null) {
                        bVar = new C116802b(new WeakReference(obj), true);
                        concurrentHashMap.put(Integer.valueOf(fragment.hashCode()), bVar);
                    }
                    if ((obj instanceof VASCommonFragment) && (vASActivity = ((VASCommonFragment) obj).f348642o) != null) {
                        ConcurrentHashMap<Integer, Integer> concurrentHashMap2 = C116800a.f350128h;
                        if (!concurrentHashMap2.containsKey(Integer.valueOf(vASActivity.hashCode()))) {
                            concurrentHashMap2.put(Integer.valueOf(vASActivity.hashCode()), Integer.valueOf(fragment.hashCode()));
                        }
                        bVar.f350149h = !C111562e.m152091a(vASActivity);
                    }
                }
            }
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f350130j = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("doResume", "()V"));
        arrayList.add(new Pair("doPause", "()V"));
        linkedHashMap.put("com/tencent/mm/ui/chatting/ChattingUIFragment", arrayList);
    }

    /* renamed from: a */
    public static final boolean m164754a(C116800a aVar, Fragment fragment) {
        aVar.getClass();
        return C87412m.m108589b("ChattingUIFragment", fragment.getClass().getSimpleName());
    }

    /* renamed from: b */
    public final void mo180771b(Fragment fragment) {
        for (Fragment fragment2 : mo180774e(fragment)) {
            C116800a aVar = f350124d;
            if (!aVar.mo180776g(fragment2)) {
                aVar.mo180779j(fragment2, false);
            }
        }
    }

    /* renamed from: bF */
    public void mo33186bF(Activity activity) {
        C87412m.m108594g(activity, "caller");
    }

    /* renamed from: c */
    public final void mo180772c(Fragment fragment) {
        for (Fragment fragment2 : mo180774e(fragment)) {
            C116800a aVar = f350124d;
            if (aVar.mo180776g(fragment2)) {
                aVar.mo180783n(fragment2);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo180773d(Fragment fragment) {
        C116802b bVar = f350127g.get(Integer.valueOf(fragment.hashCode()));
        return bVar != null && bVar.f350143b && !bVar.f350144c && bVar.f350153l;
    }

    /* renamed from: e */
    public final List<Fragment> mo180774e(Fragment fragment) {
        try {
            if (!fragment.isAdded()) {
                return C64186f0.f181907d;
            }
            List<Fragment> fragments = fragment.getChildFragmentManager().getFragments();
            C87412m.m108593f(fragments, "fragment.childFragmentManager.fragments");
            return fragments;
        } catch (Exception e) {
            Log.m105920e("Amoeba.FragmentEventMonitor", "getChildFragmentErr " + e);
            return C64186f0.f181907d;
        }
    }

    /* renamed from: f */
    public final boolean mo180775f(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (!((activity != null && (activity instanceof VASLauncher)) ? ((VASLauncher) activity).f348665h : false) || (fragment instanceof VASCommonFragment)) {
            return false;
        }
        Log.m105924i("Amoeba.FragmentEventMonitor", "isFilterFragment fragment {" + fragment + '}');
        return true;
    }

    /* renamed from: g */
    public final boolean mo180776g(Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        return parentFragment != null ? mo180773d(parentFragment) && !parentFragment.isHidden() && parentFragment.isResumed() && mo180773d(fragment) && !fragment.isHidden() && fragment.isResumed() : mo180773d(fragment) && !fragment.isHidden() && fragment.isResumed();
    }

    /* renamed from: h */
    public final void mo180777h(Fragment fragment, boolean z) {
        ConcurrentHashMap<Integer, C116802b> concurrentHashMap;
        C116802b bVar;
        Fragment fragment2;
        Iterator it = ((ArrayList) f350126f).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (!(intValue == fragment.hashCode() || (bVar = concurrentHashMap.get(Integer.valueOf(intValue))) == null || !bVar.f350145d || (fragment2 = bVar.f350142a.get()) == null)) {
                C116800a aVar = f350124d;
                if (aVar.mo180776g(fragment2)) {
                    if (((ArrayList) bVar.f350151j).contains(Integer.valueOf(fragment.hashCode())) && z) {
                        ((ArrayList) bVar.f350151j).remove(Integer.valueOf(fragment.hashCode()));
                        if (((ArrayList) bVar.f350151j).isEmpty()) {
                            C116802b bVar2 = (concurrentHashMap = f350127g).get(Integer.valueOf(fragment.hashCode()));
                            if (bVar2 != null && bVar2.f350148g) {
                                FixVasLogicEvent fixVasLogicEvent = new FixVasLogicEvent();
                                FixVasLogicEvent.C114675a aVar2 = fixVasLogicEvent.f343557d;
                                aVar2.f343558a = fragment;
                                aVar2.f343559b = true;
                                fixVasLogicEvent.publish();
                            }
                            bVar.f350145d = false;
                            arrayList.add(Integer.valueOf(intValue));
                            aVar.mo180781l(fragment2, true);
                        }
                    }
                }
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((ArrayList) f350126f).remove(Integer.valueOf(((Number) it4.next()).intValue()));
        }
    }

    /* renamed from: i */
    public final void mo180778i(Fragment fragment, C116801a aVar, boolean z) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            Iterator<C117601c> it = f350125e.iterator();
            while (it.hasNext()) {
                it.next().mo175190M0(fragment);
            }
        } else if (ordinal == 1) {
            Iterator<C117601c> it4 = f350125e.iterator();
            while (it4.hasNext()) {
                it4.next().mo175187F4(fragment);
            }
        } else if (ordinal == 2) {
            Iterator<C117601c> it5 = f350125e.iterator();
            while (it5.hasNext()) {
                C117601c next = it5.next();
            }
        } else if (ordinal == 3) {
            Iterator<C117601c> it6 = f350125e.iterator();
            while (it6.hasNext()) {
                C117601c next2 = it6.next();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008a A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0104 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105 A[Catch:{ Exception -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo180779j(androidx.fragment.app.Fragment r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "Amoeba.FragmentEventMonitor"
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, f41.a$b> r1 = f350127g     // Catch:{ Exception -> 0x010b }
            int r2 = r12.hashCode()     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x010b }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x010b }
            f41.a$b r2 = (f41.C116800a.C116802b) r2     // Catch:{ Exception -> 0x010b }
            if (r2 == 0) goto L_0x0120
            boolean r3 = r2.f350146e     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x0120
            java.lang.Integer r3 = r2.f350152k     // Catch:{ Exception -> 0x010b }
            r4 = 0
            if (r3 == 0) goto L_0x0040
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Integer> r5 = f350129i     // Catch:{ Exception -> 0x010b }
            boolean r3 = r5.contains(r3)     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x0040
            java.lang.Integer r3 = r2.f350152k     // Catch:{ Exception -> 0x010b }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x010b }
            f41.a$b r3 = (f41.C116800a.C116802b) r3     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x0040
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r3 = r3.f350142a     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x0040
            java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x010b }
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x0040
            f41.a r5 = f350124d     // Catch:{ Exception -> 0x010b }
            r5.mo180779j(r3, r4)     // Catch:{ Exception -> 0x010b }
        L_0x0040:
            java.lang.Class r3 = r12.getClass()     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ Exception -> 0x010b }
            boolean r5 = r12 instanceof com.tencent.p014mm.p136ui.vas.VASCommonFragment     // Catch:{ Exception -> 0x010b }
            r6 = 0
            if (r5 == 0) goto L_0x005e
            r3 = r12
            com.tencent.mm.ui.vas.VASCommonFragment r3 = (com.tencent.p014mm.p136ui.vas.VASCommonFragment) r3     // Catch:{ Exception -> 0x010b }
            com.tencent.mm.ui.vas.VASActivity r3 = r3.f348642o     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x005d
            java.lang.Class r3 = r3.getClass()     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ Exception -> 0x010b }
            goto L_0x005e
        L_0x005d:
            r3 = r6
        L_0x005e:
            boolean r5 = r2.f350148g     // Catch:{ Exception -> 0x010b }
            if (r5 != 0) goto L_0x0064
            r2.f350148g = r13     // Catch:{ Exception -> 0x010b }
        L_0x0064:
            boolean r13 = r2.f350148g     // Catch:{ Exception -> 0x010b }
            f41.a r5 = f350124d     // Catch:{ Exception -> 0x010b }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Integer> r7 = f350129i     // Catch:{ Exception -> 0x010b }
            boolean r8 = r7.isEmpty()     // Catch:{ Exception -> 0x010b }
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x0087
            java.lang.Object r8 = r7.get(r4)     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ Exception -> 0x010b }
            int r10 = r12.hashCode()     // Catch:{ Exception -> 0x010b }
            if (r8 != 0) goto L_0x007f
            goto L_0x0087
        L_0x007f:
            int r8 = r8.intValue()     // Catch:{ Exception -> 0x010b }
            if (r8 != r10) goto L_0x0087
            r8 = 1
            goto L_0x0088
        L_0x0087:
            r8 = 0
        L_0x0088:
            if (r8 == 0) goto L_0x0120
            boolean r8 = r5.mo180775f(r12)     // Catch:{ Exception -> 0x010b }
            if (r8 != 0) goto L_0x00ab
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010b }
            r8.<init>()     // Catch:{ Exception -> 0x010b }
            java.lang.String r10 = "[onPause] "
            r8.append(r10)     // Catch:{ Exception -> 0x010b }
            r8.append(r3)     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ Exception -> 0x010b }
            f41.a$a r3 = f41.C116800a.C116801a.ON_PAUSE     // Catch:{ Exception -> 0x010b }
            r5.mo180778i(r12, r3, r9)     // Catch:{ Exception -> 0x010b }
            r2.f350146e = r4     // Catch:{ Exception -> 0x010b }
        L_0x00ab:
            boolean r3 = r2.f350148g     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x00c3
            boolean r3 = r2.f350149h     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x00c3
            com.tencent.mm.autogen.events.FixVasLogicEvent r3 = new com.tencent.mm.autogen.events.FixVasLogicEvent     // Catch:{ Exception -> 0x010b }
            r3.<init>()     // Catch:{ Exception -> 0x010b }
            com.tencent.mm.autogen.events.FixVasLogicEvent$a r8 = r3.f343557d     // Catch:{ Exception -> 0x010b }
            r8.f343558a = r12     // Catch:{ Exception -> 0x010b }
            r8.f343559b = r9     // Catch:{ Exception -> 0x010b }
            r3.publish()     // Catch:{ Exception -> 0x010b }
            r2.f350148g = r4     // Catch:{ Exception -> 0x010b }
        L_0x00c3:
            boolean r2 = r2.f350147f     // Catch:{ Exception -> 0x010b }
            if (r2 != 0) goto L_0x0120
            int r2 = r12.hashCode()     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x010b }
            r7.remove(r2)     // Catch:{ Exception -> 0x010b }
            int r2 = r12.hashCode()     // Catch:{ Exception -> 0x010b }
            boolean r3 = r7.isEmpty()     // Catch:{ Exception -> 0x010b }
            r3 = r3 ^ r9
            if (r3 == 0) goto L_0x0101
            java.lang.Object r3 = r7.get(r4)     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x0101
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x010b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x010b }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x010b }
            f41.a$b r1 = (f41.C116800a.C116802b) r1     // Catch:{ Exception -> 0x010b }
            if (r1 == 0) goto L_0x0101
            java.lang.Integer r3 = r1.f350152k     // Catch:{ Exception -> 0x010b }
            if (r3 != 0) goto L_0x00fa
            goto L_0x0101
        L_0x00fa:
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x010b }
            if (r3 != r2) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r1 = r6
        L_0x0102:
            if (r1 != 0) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r1.f350152k = r6     // Catch:{ Exception -> 0x010b }
        L_0x0107:
            r5.mo180777h(r12, r13)     // Catch:{ Exception -> 0x010b }
            goto L_0x0120
        L_0x010b:
            r12 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "onFragmentPause err "
            r13.append(r1)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r12)
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f41.C116800a.mo180779j(androidx.fragment.app.Fragment, boolean):void");
    }

    /* renamed from: jo */
    public void mo33187jo(Activity activity) {
        C87412m.m108594g(activity, "caller");
    }

    /* renamed from: k */
    public final void mo180780k(Fragment fragment, boolean z) {
        C87412m.m108594g(fragment, "fragment");
        if (f350133p) {
            ConcurrentHashMap<Integer, C116802b> concurrentHashMap = f350127g;
            C116802b bVar = concurrentHashMap.get(Integer.valueOf(fragment.hashCode()));
            if (bVar == null) {
                bVar = new C116802b(new WeakReference(fragment), true);
                concurrentHashMap.put(Integer.valueOf(fragment.hashCode()), bVar);
            }
            bVar.f350153l = false;
            mo180784o(fragment, true);
            mo180771b(fragment);
            mo180779j(fragment, z);
        }
    }

    /* renamed from: l */
    public final void mo180781l(Fragment fragment, boolean z) {
        Integer num;
        WeakReference<Fragment> weakReference;
        Fragment fragment2;
        C116802b bVar = f350127g.get(Integer.valueOf(fragment.hashCode()));
        if (bVar != null) {
            if (z && bVar.f350149h) {
                C116800a aVar = f350124d;
                if (!f350129i.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                        arrayList.add(parentFragment);
                    }
                    List<Fragment> e = aVar.mo180774e(fragment);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<Integer> it = f350129i.iterator();
                    C87412m.m108593f(it, "mCurResumedFragmentList.iterator()");
                    while (it.hasNext()) {
                        Integer next = it.next();
                        C116802b bVar2 = f350127g.get(next);
                        if (!(bVar2 == null || (weakReference = bVar2.f350142a) == null || (fragment2 = weakReference.get()) == null)) {
                            if (bVar2.f350146e || bVar2.f350147f) {
                                int hashCode = fragment.hashCode();
                                if ((next == null || next.intValue() != hashCode) && !e.contains(fragment2) && f350124d.mo180776g(fragment2)) {
                                    if (!arrayList.contains(fragment2) || ((fragment instanceof VASCommonFragment) && (fragment2 instanceof VASCommonFragment))) {
                                        bVar2.f350145d = true;
                                        if (!((ArrayList) bVar2.f350151j).contains(Integer.valueOf(fragment.hashCode()))) {
                                            ((ArrayList) bVar2.f350151j).add(Integer.valueOf(fragment.hashCode()));
                                        }
                                        ArrayList arrayList3 = (ArrayList) f350126f;
                                        if (!arrayList3.contains(Integer.valueOf(fragment2.hashCode()))) {
                                            arrayList3.add(Integer.valueOf(fragment2.hashCode()));
                                        }
                                        if (!bVar2.f350147f || bVar2.f350146e) {
                                            arrayList2.add(fragment2);
                                        } else {
                                            bVar2.f350147f = false;
                                            it.remove();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        f350124d.mo180779j((Fragment) it4.next(), false);
                    }
                    arrayList2.clear();
                }
            }
            if (bVar.f350145d && ((ArrayList) bVar.f350151j).isEmpty()) {
                bVar.f350145d = false;
                ((ArrayList) f350126f).remove(Integer.valueOf(fragment.hashCode()));
            }
            if (!bVar.f350146e && !bVar.f350145d) {
                String simpleName = fragment.getClass().getSimpleName();
                if (fragment instanceof VASCommonFragment) {
                    VASActivity vASActivity = ((VASCommonFragment) fragment).f348642o;
                    simpleName = vASActivity != null ? vASActivity.getClass().getSimpleName() : null;
                }
                C116800a aVar2 = f350124d;
                if (!aVar2.mo180775f(fragment)) {
                    Log.m105924i("Amoeba.FragmentEventMonitor", "[onResume] " + simpleName);
                    aVar2.mo180778i(fragment, C116801a.ON_RESUME, bVar.f350149h);
                    bVar.f350146e = true;
                    bVar.f350153l = true;
                }
                CopyOnWriteArrayList<Integer> copyOnWriteArrayList = f350129i;
                if (!copyOnWriteArrayList.contains(Integer.valueOf(fragment.hashCode())) && copyOnWriteArrayList.size() >= 0) {
                    if ((!copyOnWriteArrayList.isEmpty()) && (num = copyOnWriteArrayList.get(0)) != null) {
                        C116802b bVar3 = f350127g.get(Integer.valueOf(num.intValue()));
                        if (bVar3 != null) {
                            bVar3.f350152k = Integer.valueOf(fragment.hashCode());
                        }
                    }
                    copyOnWriteArrayList.add(0, Integer.valueOf(fragment.hashCode()));
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo180782m(Activity activity, boolean z) {
        C116802b bVar;
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = f350128h;
        if (concurrentHashMap.containsKey(Integer.valueOf(activity.hashCode())) && (bVar = f350127g.get(concurrentHashMap.get(Integer.valueOf(activity.hashCode())))) != null) {
            bVar.f350150i = true;
            Fragment fragment = bVar.f350142a.get();
            if (fragment != null) {
                C116800a aVar = f350124d;
                if (aVar.mo180776g(fragment)) {
                    aVar.mo180783n(fragment);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo180783n(Fragment fragment) {
        C116802b bVar = f350127g.get(Integer.valueOf(fragment.hashCode()));
        mo180781l(fragment, false);
    }

    /* renamed from: o */
    public final void mo180784o(Fragment fragment, boolean z) {
        C116802b bVar = f350127g.get(Integer.valueOf(fragment.hashCode()));
        if (bVar != null) {
            bVar.f350144c = z;
        }
        for (Fragment hashCode : mo180774e(fragment)) {
            C116802b bVar2 = f350127g.get(Integer.valueOf(hashCode.hashCode()));
            if (bVar2 != null) {
                bVar2.f350144c = z;
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityDestroyed(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityPaused(Activity activity) {
        C116802b bVar;
        C87412m.m108594g(activity, "p0");
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = f350128h;
        if (concurrentHashMap.containsKey(Integer.valueOf(activity.hashCode())) && (bVar = f350127g.get(concurrentHashMap.get(Integer.valueOf(activity.hashCode())))) != null) {
            bVar.f350150i = false;
            Fragment fragment = bVar.f350142a.get();
            if (fragment != null) {
                f350124d.mo180779j(fragment, false);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        C87412m.m108594g(activity, "p0");
        mo180782m(activity, true);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C87412m.m108594g(activity, "p0");
        C87412m.m108594g(bundle, "p1");
    }

    public void onActivityStarted(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void onActivityStopped(Activity activity) {
        C87412m.m108594g(activity, "p0");
    }

    public void r50(Object obj, Intent intent) {
        C87412m.m108594g(obj, "caller");
    }
}
