package androidx.fragment.app;

import android.view.View;
import androidx.transition.C103830b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import p1042u.C111055b;
import p1042u.C118556h;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.fragment.app.j0 */
public class C112935j0 {

    /* renamed from: a */
    public static final int[] f338101a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    public static final C112941l0 f338102b = new C16573k0();

    /* renamed from: c */
    public static final C112941l0 f338103c;

    /* renamed from: androidx.fragment.app.j0$a */
    public interface C112936a {
    }

    /* renamed from: androidx.fragment.app.j0$b */
    public static class C112937b {

        /* renamed from: a */
        public Fragment f338104a;

        /* renamed from: b */
        public boolean f338105b;

        /* renamed from: c */
        public C112910a f338106c;

        /* renamed from: d */
        public Fragment f338107d;

        /* renamed from: e */
        public boolean f338108e;

        /* renamed from: f */
        public C112910a f338109f;
    }

    static {
        C112941l0 l0Var;
        try {
            l0Var = C103830b.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            l0Var = null;
        }
        f338103c = l0Var;
    }

    /* renamed from: a */
    public static void m154506a(ArrayList<View> arrayList, C111055b<String, View> bVar, Collection<String> collection) {
        for (int i = bVar.f332583f - 1; i >= 0; i--) {
            View l = bVar.mo162791l(i);
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (collection.contains(C107207u.C107213g.m145226k(l))) {
                arrayList.add(l);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r0.mAdded != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0076, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0087, code lost:
        if (r0.mHidden == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0089, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m154507b(androidx.fragment.app.C112910a r8, androidx.fragment.app.C112919c0.C112920a r9, android.util.SparseArray<androidx.fragment.app.C112935j0.C112937b> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f338043b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f338101a
            int r9 = r9.f338042a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f338042a
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L_0x007c
            r4 = 3
            if (r9 == r4) goto L_0x0056
            r4 = 4
            if (r9 == r4) goto L_0x003e
            r4 = 5
            if (r9 == r4) goto L_0x002c
            r4 = 6
            if (r9 == r4) goto L_0x0056
            r4 = 7
            if (r9 == r4) goto L_0x007c
            r9 = 0
            r2 = 0
            goto L_0x008c
        L_0x002c:
            if (r12 == 0) goto L_0x003b
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x008b
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008b
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x008b
            goto L_0x0089
        L_0x003b:
            boolean r9 = r0.mHidden
            goto L_0x008c
        L_0x003e:
            if (r12 == 0) goto L_0x004d
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0078
            goto L_0x0076
        L_0x004d:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0056:
            if (r12 == 0) goto L_0x006e
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0078
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0078
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0078
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0078
            goto L_0x0076
        L_0x006e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0078
        L_0x0076:
            r9 = 1
            goto L_0x0079
        L_0x0078:
            r9 = 0
        L_0x0079:
            r4 = r9
            r9 = 0
            goto L_0x0090
        L_0x007c:
            if (r12 == 0) goto L_0x0081
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x008c
        L_0x0081:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x008b
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008b
        L_0x0089:
            r9 = 1
            goto L_0x008c
        L_0x008b:
            r9 = 0
        L_0x008c:
            r3 = r9
            r9 = r2
            r2 = 0
            r4 = 0
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.j0$b r5 = (androidx.fragment.app.C112935j0.C112937b) r5
            if (r3 == 0) goto L_0x00a9
            if (r5 != 0) goto L_0x00a3
            androidx.fragment.app.j0$b r3 = new androidx.fragment.app.j0$b
            r3.<init>()
            r10.put(r1, r3)
            r5 = r3
        L_0x00a3:
            r5.f338104a = r0
            r5.f338105b = r11
            r5.f338106c = r8
        L_0x00a9:
            r3 = 0
            if (r12 != 0) goto L_0x00ca
            if (r9 == 0) goto L_0x00ca
            if (r5 == 0) goto L_0x00b6
            androidx.fragment.app.Fragment r9 = r5.f338107d
            if (r9 != r0) goto L_0x00b6
            r5.f338107d = r3
        L_0x00b6:
            boolean r9 = r8.f338041p
            if (r9 != 0) goto L_0x00ca
            androidx.fragment.app.FragmentManager r9 = r8.f338004q
            androidx.fragment.app.z r6 = r9.createOrGetFragmentStateManager(r0)
            androidx.fragment.app.b0 r7 = r9.getFragmentStore()
            r7.mo165195g(r6)
            r9.moveToState(r0)
        L_0x00ca:
            if (r4 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r9 = r5.f338107d
            if (r9 != 0) goto L_0x00e3
        L_0x00d2:
            if (r5 != 0) goto L_0x00dd
            androidx.fragment.app.j0$b r9 = new androidx.fragment.app.j0$b
            r9.<init>()
            r10.put(r1, r9)
            r5 = r9
        L_0x00dd:
            r5.f338107d = r0
            r5.f338108e = r11
            r5.f338109f = r8
        L_0x00e3:
            if (r12 != 0) goto L_0x00ef
            if (r2 == 0) goto L_0x00ef
            if (r5 == 0) goto L_0x00ef
            androidx.fragment.app.Fragment r8 = r5.f338104a
            if (r8 != r0) goto L_0x00ef
            r5.f338104a = r3
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C112935j0.m154507b(androidx.fragment.app.a, androidx.fragment.app.c0$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m154508c(Fragment fragment, Fragment fragment2, boolean z, C111055b<String, View> bVar, boolean z2) {
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    /* renamed from: d */
    public static C111055b<String, View> m154509d(C112941l0 l0Var, C111055b<String, String> bVar, Object obj, C112937b bVar2) {
        ArrayList<String> arrayList;
        Fragment fragment = bVar2.f338104a;
        View view = fragment.getView();
        if (bVar.isEmpty() || obj == null || view == null) {
            bVar.clear();
            return null;
        }
        C111055b<String, View> bVar3 = new C111055b<>();
        l0Var.mo165221h(bVar3, view);
        C112910a aVar = bVar2.f338106c;
        if (bVar2.f338105b) {
            fragment.getExitTransitionCallback();
            arrayList = aVar.f338039n;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = aVar.f338040o;
        }
        if (arrayList != null) {
            C118556h.m167218k(bVar3, arrayList);
            C118556h.m167218k(bVar3, bVar.values());
        }
        int i = bVar.f332583f;
        while (true) {
            i--;
            if (i < 0) {
                return bVar3;
            }
            if (!bVar3.containsKey(bVar.mo162791l(i))) {
                bVar.mo162790k(i);
            }
        }
    }

    /* renamed from: e */
    public static C111055b<String, View> m154510e(C112941l0 l0Var, C111055b<String, String> bVar, Object obj, C112937b bVar2) {
        ArrayList<String> arrayList;
        if (bVar.isEmpty() || obj == null) {
            bVar.clear();
            return null;
        }
        Fragment fragment = bVar2.f338107d;
        C111055b<String, View> bVar3 = new C111055b<>();
        l0Var.mo165221h(bVar3, fragment.requireView());
        C112910a aVar = bVar2.f338109f;
        if (bVar2.f338108e) {
            fragment.getEnterTransitionCallback();
            arrayList = aVar.f338040o;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = aVar.f338039n;
        }
        if (arrayList != null) {
            C118556h.m167218k(bVar3, arrayList);
        }
        C118556h.m167218k(bVar, bVar3.keySet());
        return bVar3;
    }

    /* renamed from: f */
    public static C112941l0 m154511f(Fragment fragment, Fragment fragment2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C112941l0 l0Var = f338102b;
        boolean z2 = true;
        if (l0Var != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = true;
                    break;
                } else if (!l0Var.mo16814e(arrayList.get(i))) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return l0Var;
            }
        }
        C112941l0 l0Var2 = f338103c;
        if (l0Var2 != null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                } else if (!l0Var2.mo16814e(arrayList.get(i2))) {
                    z2 = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return l0Var2;
            }
        }
        if (l0Var == null && l0Var2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: g */
    public static ArrayList<View> m154512g(C112941l0 l0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            l0Var.mo165220f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        l0Var.mo16812b(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: h */
    public static View m154513h(C111055b<String, View> bVar, C112937b bVar2, Object obj, boolean z) {
        ArrayList<String> arrayList;
        C112910a aVar = bVar2.f338106c;
        if (obj == null || bVar == null || (arrayList = aVar.f338039n) == null || arrayList.isEmpty()) {
            return null;
        }
        return bVar.getOrDefault(z ? aVar.f338039n.get(0) : aVar.f338040o.get(0), null);
    }

    /* renamed from: i */
    public static Object m154514i(C112941l0 l0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        return (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? l0Var.mo16817l(obj2, obj, obj3) : l0Var.mo16816k(obj2, obj, obj3);
    }

    /* renamed from: j */
    public static void m154515j(C112941l0 l0Var, Object obj, Object obj2, C111055b<String, View> bVar, boolean z, C112910a aVar) {
        ArrayList<String> arrayList = aVar.f338039n;
        if (arrayList != null && !arrayList.isEmpty()) {
            View orDefault = bVar.getOrDefault(z ? aVar.f338040o.get(0) : aVar.f338039n.get(0), null);
            l0Var.mo16823s(obj, orDefault);
            if (obj2 != null) {
                l0Var.mo16823s(obj2, orDefault);
            }
        }
    }

    /* renamed from: k */
    public static void m154516k(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                View view = arrayList.get(size);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(view, aVar.mo10232b(), "androidx/fragment/app/FragmentTransition", "setViewVisibility", "(Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "androidx/fragment/app/FragmentTransition", "setViewVisibility", "(Ljava/util/ArrayList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04c6 A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m154517l(android.content.Context r40, androidx.fragment.app.C112946o r41, java.util.ArrayList<androidx.fragment.app.C112910a> r42, java.util.ArrayList<java.lang.Boolean> r43, int r44, int r45, boolean r46, androidx.fragment.app.C112935j0.C112936a r47) {
        /*
            r0 = r42
            r1 = r43
            r2 = r45
            r3 = r46
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r5 = r44
        L_0x000f:
            r6 = 0
            r7 = 1
            if (r5 >= r2) goto L_0x0063
            java.lang.Object r8 = r0.get(r5)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C112910a) r8
            java.lang.Object r9 = r1.get(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0049
            androidx.fragment.app.FragmentManager r6 = r8.f338004q
            androidx.fragment.app.o r6 = r6.getContainer()
            boolean r6 = r6.mo164814c()
            if (r6 != 0) goto L_0x0032
            goto L_0x0060
        L_0x0032:
            java.util.ArrayList<androidx.fragment.app.c0$a> r6 = r8.f338026a
            int r6 = r6.size()
            int r6 = r6 - r7
        L_0x0039:
            if (r6 < 0) goto L_0x0060
            java.util.ArrayList<androidx.fragment.app.c0$a> r9 = r8.f338026a
            java.lang.Object r9 = r9.get(r6)
            androidx.fragment.app.c0$a r9 = (androidx.fragment.app.C112919c0.C112920a) r9
            m154507b(r8, r9, r4, r7, r3)
            int r6 = r6 + -1
            goto L_0x0039
        L_0x0049:
            java.util.ArrayList<androidx.fragment.app.c0$a> r7 = r8.f338026a
            int r7 = r7.size()
            r9 = 0
        L_0x0050:
            if (r9 >= r7) goto L_0x0060
            java.util.ArrayList<androidx.fragment.app.c0$a> r10 = r8.f338026a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.c0$a r10 = (androidx.fragment.app.C112919c0.C112920a) r10
            m154507b(r8, r10, r4, r6, r3)
            int r9 = r9 + 1
            goto L_0x0050
        L_0x0060:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0063:
            int r5 = r4.size()
            if (r5 == 0) goto L_0x04d8
            android.view.View r5 = new android.view.View
            r8 = r40
            r5.<init>(r8)
            int r15 = r4.size()
            r14 = 0
        L_0x0075:
            if (r14 >= r15) goto L_0x04d8
            int r8 = r4.keyAt(r14)
            u.b r13 = new u.b
            r13.<init>()
            int r9 = r2 + -1
            r12 = r44
        L_0x0084:
            if (r9 < r12) goto L_0x00ec
            java.lang.Object r10 = r0.get(r9)
            androidx.fragment.app.a r10 = (androidx.fragment.app.C112910a) r10
            boolean r11 = r10.mo165178u(r8)
            if (r11 != 0) goto L_0x0093
            goto L_0x00e1
        L_0x0093:
            java.lang.Object r11 = r1.get(r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.util.ArrayList<java.lang.String> r7 = r10.f338039n
            if (r7 == 0) goto L_0x00e1
            int r7 = r7.size()
            if (r11 == 0) goto L_0x00ac
            java.util.ArrayList<java.lang.String> r11 = r10.f338039n
            java.util.ArrayList<java.lang.String> r10 = r10.f338040o
            goto L_0x00b5
        L_0x00ac:
            java.util.ArrayList<java.lang.String> r11 = r10.f338039n
            java.util.ArrayList<java.lang.String> r10 = r10.f338040o
            r39 = r11
            r11 = r10
            r10 = r39
        L_0x00b5:
            if (r6 >= r7) goto L_0x00e1
            java.lang.Object r16 = r10.get(r6)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r16 = r11.get(r6)
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r16 = r13.remove(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d5
            r13.put(r0, r2)
            goto L_0x00d8
        L_0x00d5:
            r13.put(r0, r1)
        L_0x00d8:
            int r6 = r6 + 1
            r0 = r42
            r1 = r43
            r2 = r45
            goto L_0x00b5
        L_0x00e1:
            int r9 = r9 + -1
            r0 = r42
            r1 = r43
            r2 = r45
            r6 = 0
            r7 = 1
            goto L_0x0084
        L_0x00ec:
            java.lang.Object r0 = r4.valueAt(r14)
            androidx.fragment.app.j0$b r0 = (androidx.fragment.app.C112935j0.C112937b) r0
            boolean r1 = r41.mo164814c()
            if (r1 == 0) goto L_0x04c0
            r1 = r41
            android.view.View r2 = r1.mo164813b(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0104
            goto L_0x04c0
        L_0x0104:
            if (r3 == 0) goto L_0x0302
            androidx.fragment.app.Fragment r7 = r0.f338104a
            androidx.fragment.app.Fragment r8 = r0.f338107d
            androidx.fragment.app.l0 r9 = m154511f(r8, r7)
            if (r9 != 0) goto L_0x0119
            r30 = r4
            r31 = r14
            r32 = r15
        L_0x0116:
            r3 = 0
            goto L_0x0315
        L_0x0119:
            boolean r10 = r0.f338105b
            boolean r11 = r0.f338108e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r7 != 0) goto L_0x012b
            r3 = 0
            goto L_0x013c
        L_0x012b:
            if (r10 == 0) goto L_0x0132
            java.lang.Object r16 = r7.getReenterTransition()
            goto L_0x0136
        L_0x0132:
            java.lang.Object r16 = r7.getEnterTransition()
        L_0x0136:
            r3 = r16
            java.lang.Object r3 = r9.mo16815g(r3)
        L_0x013c:
            if (r8 != 0) goto L_0x0140
            r11 = 0
            goto L_0x014f
        L_0x0140:
            if (r11 == 0) goto L_0x0147
            java.lang.Object r11 = r8.getReturnTransition()
            goto L_0x014b
        L_0x0147:
            java.lang.Object r11 = r8.getExitTransition()
        L_0x014b:
            java.lang.Object r11 = r9.mo16815g(r11)
        L_0x014f:
            r30 = r4
            androidx.fragment.app.Fragment r4 = r0.f338104a
            androidx.fragment.app.Fragment r12 = r0.f338107d
            if (r4 == 0) goto L_0x01a4
            r31 = r14
            android.view.View r14 = r4.requireView()
            r32 = r15
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r33 = r10
            r16 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)
            r15.mo10233c(r10)
            java.lang.Object[] r23 = r15.mo10232b()
            java.lang.String r24 = "androidx/fragment/app/FragmentTransition"
            java.lang.String r25 = "configureSharedElementsReordered"
            java.lang.String r26 = "(Landroidx/fragment/app/FragmentTransitionImpl;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/collection/ArrayMap;Landroidx/fragment/app/FragmentTransition$FragmentContainerTransition;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r14
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r10 = 0
            java.lang.Object r15 = r15.mo10231a(r10)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r10 = r15.intValue()
            r14.setVisibility(r10)
            java.lang.String r23 = "androidx/fragment/app/FragmentTransition"
            java.lang.String r24 = "configureSharedElementsReordered"
            java.lang.String r25 = "(Landroidx/fragment/app/FragmentTransitionImpl;Landroid/view/ViewGroup;Landroid/view/View;Landroidx/collection/ArrayMap;Landroidx/fragment/app/FragmentTransition$FragmentContainerTransition;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x01aa
        L_0x01a4:
            r33 = r10
            r31 = r14
            r32 = r15
        L_0x01aa:
            if (r4 == 0) goto L_0x0258
            if (r12 != 0) goto L_0x01b0
            goto L_0x0258
        L_0x01b0:
            boolean r10 = r0.f338105b
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x01ba
            r14 = 0
            goto L_0x01cd
        L_0x01ba:
            if (r10 == 0) goto L_0x01c1
            java.lang.Object r14 = r12.getSharedElementReturnTransition()
            goto L_0x01c5
        L_0x01c1:
            java.lang.Object r14 = r4.getSharedElementEnterTransition()
        L_0x01c5:
            java.lang.Object r14 = r9.mo16815g(r14)
            java.lang.Object r14 = r9.mo16827x(r14)
        L_0x01cd:
            u.b r15 = m154510e(r9, r13, r14, r0)
            r34 = r7
            u.b r7 = m154509d(r9, r13, r14, r0)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x01e9
            if (r15 == 0) goto L_0x01e2
            r15.clear()
        L_0x01e2:
            if (r7 == 0) goto L_0x01e7
            r7.clear()
        L_0x01e7:
            r14 = 0
            goto L_0x01fb
        L_0x01e9:
            r16 = r14
            java.util.Set r14 = r13.keySet()
            m154506a(r1, r15, r14)
            java.util.Collection r14 = r13.values()
            m154506a(r6, r7, r14)
            r14 = r16
        L_0x01fb:
            if (r3 != 0) goto L_0x0206
            if (r11 != 0) goto L_0x0206
            if (r14 != 0) goto L_0x0206
            r36 = r6
        L_0x0203:
            r35 = r13
            goto L_0x025d
        L_0x0206:
            r35 = r13
            r13 = 1
            m154508c(r4, r12, r10, r15, r13)
            if (r14 == 0) goto L_0x023c
            r6.add(r5)
            r9.mo16825v(r14, r5, r1)
            boolean r13 = r0.f338108e
            r36 = r6
            androidx.fragment.app.a r6 = r0.f338109f
            r16 = r9
            r17 = r14
            r18 = r11
            r19 = r15
            r20 = r13
            r21 = r6
            m154515j(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.view.View r0 = m154513h(r7, r0, r3, r10)
            if (r0 == 0) goto L_0x0237
            r9.mo16822r(r3, r6)
        L_0x0237:
            r27 = r0
            r29 = r6
            goto L_0x0242
        L_0x023c:
            r36 = r6
            r27 = 0
            r29 = 0
        L_0x0242:
            androidx.fragment.app.h0 r0 = new androidx.fragment.app.h0
            r22 = r0
            r23 = r4
            r24 = r12
            r25 = r10
            r26 = r7
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            p849e3.C58525r.m67941a(r2, r0)
            r6 = r14
            goto L_0x025e
        L_0x0258:
            r36 = r6
            r34 = r7
            goto L_0x0203
        L_0x025d:
            r6 = 0
        L_0x025e:
            if (r3 != 0) goto L_0x0266
            if (r6 != 0) goto L_0x0266
            if (r11 != 0) goto L_0x0266
            goto L_0x0116
        L_0x0266:
            java.util.ArrayList r0 = m154512g(r9, r11, r8, r1, r5)
            r4 = r34
            r7 = r36
            java.util.ArrayList r10 = m154512g(r9, r3, r4, r7, r5)
            r12 = 4
            m154516k(r10, r12)
            r16 = r9
            r17 = r3
            r18 = r11
            r19 = r6
            r20 = r4
            r21 = r33
            java.lang.Object r4 = m154514i(r16, r17, r18, r19, r20, r21)
            if (r8 == 0) goto L_0x02ac
            if (r0 == 0) goto L_0x02ac
            int r12 = r0.size()
            if (r12 > 0) goto L_0x0296
            int r12 = r1.size()
            if (r12 <= 0) goto L_0x02ac
        L_0x0296:
            a3.b r12 = new a3.b
            r12.<init>()
            r13 = r47
            androidx.fragment.app.FragmentManager$d r13 = (androidx.fragment.app.FragmentManager.C112894d) r13
            androidx.fragment.app.FragmentManager r14 = androidx.fragment.app.FragmentManager.this
            r14.addCancellationSignal(r8, r12)
            androidx.fragment.app.d0 r14 = new androidx.fragment.app.d0
            r14.<init>(r13, r8, r12)
            r9.mo16824t(r8, r4, r12, r14)
        L_0x02ac:
            if (r4 == 0) goto L_0x0116
            if (r8 == 0) goto L_0x02d3
            if (r11 == 0) goto L_0x02d3
            boolean r12 = r8.mAdded
            if (r12 == 0) goto L_0x02d3
            boolean r12 = r8.mHidden
            if (r12 == 0) goto L_0x02d3
            boolean r12 = r8.mHiddenChanged
            if (r12 == 0) goto L_0x02d3
            r12 = 1
            r8.setHideReplaced(r12)
            android.view.View r12 = r8.getView()
            r9.mo16820p(r11, r12, r0)
            android.view.ViewGroup r8 = r8.mContainer
            androidx.fragment.app.e0 r12 = new androidx.fragment.app.e0
            r12.<init>(r0)
            p849e3.C58525r.m67941a(r8, r12)
        L_0x02d3:
            java.util.ArrayList r20 = r9.mo165223m(r7)
            r22 = r9
            r23 = r4
            r24 = r3
            r25 = r10
            r26 = r11
            r27 = r0
            r28 = r6
            r29 = r7
            r22.mo16821q(r23, r24, r25, r26, r27, r28, r29)
            r9.mo16813c(r2, r4)
            r16 = r9
            r17 = r2
            r18 = r1
            r19 = r7
            r21 = r35
            r16.mo165224u(r17, r18, r19, r20, r21)
            r3 = 0
            m154516k(r10, r3)
            r9.mo16826w(r6, r1, r7)
            goto L_0x0315
        L_0x0302:
            r30 = r4
            r35 = r13
            r31 = r14
            r32 = r15
            r3 = 0
            androidx.fragment.app.Fragment r1 = r0.f338104a
            androidx.fragment.app.Fragment r4 = r0.f338107d
            androidx.fragment.app.l0 r15 = m154511f(r4, r1)
            if (r15 != 0) goto L_0x031b
        L_0x0315:
            r25 = r31
            r27 = r32
            goto L_0x04c6
        L_0x031b:
            boolean r6 = r0.f338105b
            boolean r7 = r0.f338108e
            if (r1 != 0) goto L_0x0323
            r14 = 0
            goto L_0x0333
        L_0x0323:
            if (r6 == 0) goto L_0x032a
            java.lang.Object r6 = r1.getReenterTransition()
            goto L_0x032e
        L_0x032a:
            java.lang.Object r6 = r1.getEnterTransition()
        L_0x032e:
            java.lang.Object r6 = r15.mo16815g(r6)
            r14 = r6
        L_0x0333:
            if (r4 != 0) goto L_0x0337
            r13 = 0
            goto L_0x0347
        L_0x0337:
            if (r7 == 0) goto L_0x033e
            java.lang.Object r6 = r4.getReturnTransition()
            goto L_0x0342
        L_0x033e:
            java.lang.Object r6 = r4.getExitTransition()
        L_0x0342:
            java.lang.Object r6 = r15.mo16815g(r6)
            r13 = r6
        L_0x0347:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            androidx.fragment.app.Fragment r10 = r0.f338104a
            androidx.fragment.app.Fragment r9 = r0.f338107d
            if (r10 == 0) goto L_0x0419
            if (r9 != 0) goto L_0x035b
            goto L_0x0419
        L_0x035b:
            boolean r8 = r0.f338105b
            boolean r6 = r35.isEmpty()
            if (r6 == 0) goto L_0x0367
            r7 = r35
            r6 = 0
            goto L_0x037c
        L_0x0367:
            if (r8 == 0) goto L_0x036e
            java.lang.Object r6 = r9.getSharedElementReturnTransition()
            goto L_0x0372
        L_0x036e:
            java.lang.Object r6 = r10.getSharedElementEnterTransition()
        L_0x0372:
            java.lang.Object r6 = r15.mo16815g(r6)
            java.lang.Object r6 = r15.mo16827x(r6)
            r7 = r35
        L_0x037c:
            u.b r3 = m154510e(r15, r7, r6, r0)
            boolean r16 = r7.isEmpty()
            if (r16 == 0) goto L_0x0388
            r6 = 0
            goto L_0x0393
        L_0x0388:
            r16 = r6
            java.util.Collection r6 = r3.values()
            r12.addAll(r6)
            r6 = r16
        L_0x0393:
            if (r14 != 0) goto L_0x03ad
            if (r13 != 0) goto L_0x03ad
            if (r6 != 0) goto L_0x03ad
            r24 = r0
            r21 = r1
            r37 = r7
            r23 = r11
            r7 = r12
            r0 = r13
            r26 = r14
            r38 = r15
            r25 = r31
            r27 = r32
            goto L_0x042b
        L_0x03ad:
            r21 = r1
            r1 = 1
            m154508c(r10, r9, r8, r3, r1)
            if (r6 == 0) goto L_0x03df
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r15.mo16825v(r6, r5, r12)
            r16 = r10
            boolean r10 = r0.f338108e
            r17 = r11
            androidx.fragment.app.a r11 = r0.f338109f
            r22 = r6
            r6 = r15
            r18 = r7
            r7 = r22
            r19 = r8
            r8 = r13
            r20 = r9
            r9 = r3
            r3 = r16
            r23 = r17
            m154515j(r6, r7, r8, r9, r10, r11)
            if (r14 == 0) goto L_0x03eb
            r15.mo16822r(r14, r1)
            goto L_0x03eb
        L_0x03df:
            r22 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r3 = r10
            r23 = r11
            r1 = 0
        L_0x03eb:
            androidx.fragment.app.i0 r6 = new androidx.fragment.app.i0
            r8 = r6
            r9 = r15
            r10 = r18
            r11 = r22
            r7 = r12
            r12 = r0
            r24 = r0
            r0 = r13
            r37 = r18
            r13 = r23
            r26 = r14
            r25 = r31
            r14 = r5
            r38 = r15
            r27 = r32
            r15 = r3
            r16 = r20
            r17 = r19
            r18 = r7
            r19 = r26
            r20 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p849e3.C58525r.m67941a(r2, r6)
            r1 = r26
            goto L_0x042f
        L_0x0419:
            r24 = r0
            r21 = r1
            r23 = r11
            r7 = r12
            r0 = r13
            r26 = r14
            r38 = r15
            r25 = r31
            r27 = r32
            r37 = r35
        L_0x042b:
            r1 = r26
            r22 = 0
        L_0x042f:
            if (r1 != 0) goto L_0x0437
            if (r22 != 0) goto L_0x0437
            if (r0 != 0) goto L_0x0437
            goto L_0x04c6
        L_0x0437:
            r3 = r38
            java.util.ArrayList r17 = m154512g(r3, r0, r4, r7, r5)
            if (r17 == 0) goto L_0x0445
            boolean r6 = r17.isEmpty()
            if (r6 == 0) goto L_0x0446
        L_0x0445:
            r0 = 0
        L_0x0446:
            r3.mo16811a(r1, r5)
            r6 = r24
            boolean r6 = r6.f338105b
            r11 = r3
            r12 = r1
            r13 = r0
            r14 = r22
            r15 = r21
            r16 = r6
            java.lang.Object r15 = m154514i(r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0480
            if (r17 == 0) goto L_0x0480
            int r6 = r17.size()
            if (r6 > 0) goto L_0x046a
            int r6 = r7.size()
            if (r6 <= 0) goto L_0x0480
        L_0x046a:
            a3.b r6 = new a3.b
            r6.<init>()
            r7 = r47
            androidx.fragment.app.FragmentManager$d r7 = (androidx.fragment.app.FragmentManager.C112894d) r7
            androidx.fragment.app.FragmentManager r8 = androidx.fragment.app.FragmentManager.this
            r8.addCancellationSignal(r4, r6)
            androidx.fragment.app.f0 r8 = new androidx.fragment.app.f0
            r8.<init>(r7, r4, r6)
            r3.mo16824t(r4, r15, r6, r8)
        L_0x0480:
            if (r15 == 0) goto L_0x04c6
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r6 = r3
            r7 = r15
            r8 = r1
            r9 = r14
            r10 = r0
            r11 = r17
            r12 = r22
            r13 = r23
            r6.mo16821q(r7, r8, r9, r10, r11, r12, r13)
            androidx.fragment.app.g0 r4 = new androidx.fragment.app.g0
            r8 = r4
            r9 = r1
            r10 = r3
            r11 = r5
            r12 = r21
            r1 = r15
            r15 = r17
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            p849e3.C58525r.m67941a(r2, r4)
            androidx.fragment.app.m0 r0 = new androidx.fragment.app.m0
            r6 = r23
            r4 = r37
            r0.<init>(r3, r6, r4)
            p849e3.C58525r.m67941a(r2, r0)
            r3.mo16813c(r2, r1)
            androidx.fragment.app.n0 r0 = new androidx.fragment.app.n0
            r0.<init>(r3, r6, r4)
            p849e3.C58525r.m67941a(r2, r0)
            goto L_0x04c6
        L_0x04c0:
            r30 = r4
            r25 = r14
            r27 = r15
        L_0x04c6:
            int r14 = r25 + 1
            r0 = r42
            r1 = r43
            r2 = r45
            r3 = r46
            r15 = r27
            r4 = r30
            r6 = 0
            r7 = 1
            goto L_0x0075
        L_0x04d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C112935j0.m154517l(android.content.Context, androidx.fragment.app.o, java.util.ArrayList, java.util.ArrayList, int, int, boolean, androidx.fragment.app.j0$a):void");
    }
}
