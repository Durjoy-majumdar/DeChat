package com.tencent.p014mm.ipcinvoker;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.tencent.p014mm.ipcinvoker.C80898f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p20.C89305a;
import p20.C89308b;
import q20.C89449a;
import t20.C90365a;
import t20.C90366b;
import v20.C90739a;
import v20.C90741c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ipcinvoker.o */
public class C80907o {

    /* renamed from: com.tencent.mm.ipcinvoker.o$a */
    public class C80908a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f237752d;

        /* renamed from: e */
        public final /* synthetic */ Class f237753e;

        /* renamed from: f */
        public final /* synthetic */ Parcelable f237754f;

        /* renamed from: g */
        public final /* synthetic */ C1256g f237755g;

        /* renamed from: h */
        public final /* synthetic */ String f237756h;

        public C80908a(String str, Class cls, Parcelable parcelable, C1256g gVar, String str2) {
            this.f237752d = str;
            this.f237753e = cls;
            this.f237754f = parcelable;
            this.f237755g = gVar;
            this.f237756h = str2;
        }

        public void run() {
            boolean z;
            if (C80906n.m98776c(this.f237752d)) {
                C80883e eVar = (C80883e) C80938z.m98813a(this.f237753e, C80883e.class);
                if (eVar == null) {
                    C90741c.m113808a("IPC.IPCInvoker", "invokeAsync failed, newInstance(%s) return null.", this.f237753e);
                    return;
                }
                eVar.invoke(this.f237754f, this.f237755g);
                return;
            }
            C89305a a = C80898f.m98769b().mo112693a(this.f237752d, false);
            if (a == null) {
                C90741c.m113808a("IPC.IPCInvoker", "invokeAsync failed, get bridge is null by process(%s).", this.f237752d);
                C1256g gVar = this.f237755g;
                if (gVar instanceof C80905h) {
                    ((C80905h) gVar).mo56805b();
                    return;
                }
                return;
            }
            try {
                z = C90739a.m113806a(this.f237753e, C89449a.class);
            } catch (Exception unused) {
                z = false;
            }
            C80909b bVar = null;
            try {
                if (this.f237755g != null) {
                    bVar = new C80909b(this.f237752d, this.f237755g, z);
                }
                Parcelable parcelable = this.f237754f;
                String str = this.f237756h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("__remote_task_data", parcelable);
                if (str != null) {
                    bundle.putString("__command_tag", str);
                }
                a.mo112672CP(bundle, this.f237753e.getName(), bVar);
            } catch (Exception e) {
                C90741c.f260625a.mo997a(3, "IPC.IPCInvoker", "invokeAsync failed, ipc invoke error : %s", e);
                C1256g gVar2 = this.f237755g;
                if (gVar2 instanceof C80905h) {
                    ((C80905h) gVar2).mo56806c(e);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.o$b */
    public static class C80909b extends C89308b.C89309a implements C90366b {

        /* renamed from: h */
        public static final Map<C1256g<?>, WeakReference<C80909b>> f237757h = new WeakHashMap();

        /* renamed from: e */
        public String f237758e;

        /* renamed from: f */
        public C1256g f237759f;

        /* renamed from: g */
        public boolean f237760g;

        public C80909b(String str, C1256g gVar, boolean z) {
            Set set;
            this.f237759f = gVar;
            this.f237758e = str;
            this.f237760g = z;
            Set<Object> set2 = C90365a.f259368a;
            if (!(str == null || str.length() == 0)) {
                Map<String, Set<C90366b>> map = C90365a.f259369b;
                synchronized (map) {
                    set = (Set) ((HashMap) map).get(str);
                    if (set == null) {
                        set = new HashSet();
                        ((HashMap) map).put(str, set);
                    }
                }
                C90741c.m113809b("IPC.ObjectRecycler", "addIntoSet(%s)", str);
                synchronized (set) {
                    set.add(this);
                }
            }
            C90741c.m113809b("IPC.IPCInvokeCallbackWrapper", "keep ref of callback(%s)", Integer.valueOf(gVar.hashCode()));
            Map<C1256g<?>, WeakReference<C80909b>> map2 = f237757h;
            synchronized (map2) {
                ((WeakHashMap) map2).put(gVar, new WeakReference(this));
            }
        }

        public void finalize() {
            recycle();
            C90741c.m113809b("IPC.IPCInvokeCallbackWrapper", "finalize(%s)", Integer.valueOf(hashCode()));
            super.finalize();
        }

        public void onCallback(Bundle bundle) {
            C1256g gVar = this.f237759f;
            if (gVar == null) {
                C90741c.m113810c("IPC.IPCInvokeCallbackWrapper", "callback failed, ref has been release", new Object[0]);
            } else if (bundle == null) {
                gVar.mo894a(null);
            } else {
                bundle.setClassLoader(C80907o.class.getClassLoader());
                if (bundle.getBoolean("__command_release_ref")) {
                    C90741c.m113809b("IPC.IPCInvokeCallbackWrapper", "release ref of callback(%s)", Integer.valueOf(gVar.hashCode()));
                    recycle();
                    return;
                }
                try {
                    gVar.mo894a(bundle.getParcelable("__remote_task_result_data"));
                } finally {
                    if (this.f237760g) {
                        recycle();
                    }
                }
            }
        }

        public void recycle() {
            Set set;
            C1256g gVar = this.f237759f;
            if (gVar != null) {
                Map<C1256g<?>, WeakReference<C80909b>> map = f237757h;
                synchronized (map) {
                    ((WeakHashMap) map).remove(gVar);
                }
            }
            this.f237759f = null;
            String str = this.f237758e;
            Set<Object> set2 = C90365a.f259368a;
            if (str != null && str.length() != 0) {
                Map<String, Set<C90366b>> map2 = C90365a.f259369b;
                synchronized (map2) {
                    set = (Set) ((HashMap) map2).get(str);
                }
                if (set != null) {
                    C90741c.m113809b("IPC.ObjectRecycler", "removeFromSet(%s)", str);
                    synchronized (set) {
                        set.remove(this);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m98778a(String str, C80924w wVar) {
        C80898f b = C80898f.m98769b();
        if (wVar == null) {
            b.getClass();
            return;
        }
        synchronized (b.f237731f) {
            Set set = (Set) ((HashMap) b.f237731f).get(str);
            if (set == null) {
                set = new HashSet();
            }
            set.add(wVar);
            ((HashMap) b.f237731f).put(str, set);
        }
    }

    /* renamed from: b */
    public static void m98779b(String str, C80936x xVar) {
        C80898f b = C80898f.m98769b();
        if (xVar == null) {
            b.getClass();
            return;
        }
        synchronized (b.f237729d) {
            Set set = (Set) ((HashMap) b.f237729d).get(str);
            if (set == null) {
                set = new HashSet();
            }
            set.add(xVar);
            ((HashMap) b.f237729d).put(str, set);
        }
    }

    /* renamed from: c */
    public static void m98780c(String str, C80937y yVar) {
        C80898f b = C80898f.m98769b();
        if (yVar == null) {
            b.getClass();
            return;
        }
        synchronized (b.f237730e) {
            Set set = (Set) ((HashMap) b.f237730e).get(str);
            if (set == null) {
                set = new HashSet();
            }
            set.add(yVar);
            ((HashMap) b.f237730e).put(str, set);
        }
    }

    /* renamed from: d */
    public static <T extends C80883e<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean m98781d(String str, InputType inputtype, Class<? extends T> cls, C1256g<ResultType> gVar) {
        return m98782e(str, inputtype, cls, gVar, (String) null);
    }

    /* renamed from: e */
    public static <T extends C80883e<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> boolean m98782e(String str, InputType inputtype, Class<T> cls, C1256g<ResultType> gVar, String str2) {
        if (str == null || str.length() == 0) {
            C90741c.m113808a("IPC.IPCInvoker", "invokeAsync failed, process is null or nil.", new Object[0]);
            return false;
        } else if (cls == null) {
            C90741c.m113808a("IPC.IPCInvoker", "invokeAsync failed, taskClass is null(process : %s).", str);
            return false;
        } else {
            C80910p.m98790b();
            C80908a aVar = new C80908a(str, cls, inputtype, gVar, str2);
            C80922v vVar = C80922v.f237772b;
            C80882c cVar = C80906n.f237751c;
            if (str2 == null || str2.isEmpty() || cVar == null) {
                C80922v.m98792a(aVar);
                return true;
            }
            ((C119157j) C119157j.f356862d).mo183876g(aVar, str2);
            return true;
        }
    }

    /* renamed from: f */
    public static <T extends C80916r<InputType, ResultType>, InputType extends Parcelable, ResultType extends Parcelable> ResultType m98783f(String str, InputType inputtype, Class<T> cls) {
        if (str == null || str.length() == 0) {
            C90741c.m113808a("IPC.IPCInvoker", "invokeSync failed, process is null or nil.", new Object[0]);
            return null;
        } else if (cls == null) {
            C90741c.m113808a("IPC.IPCInvoker", "invokeSync failed, taskClass is null(process : %s).", str);
            return null;
        } else {
            C80910p.m98790b();
            if (C80906n.m98776c(str)) {
                ResultType invoke = ((C80916r) C80938z.m98813a(cls, C80916r.class)).invoke(inputtype);
                if (invoke == null) {
                    return null;
                }
                return (Parcelable) invoke;
            }
            C89305a a = C80898f.m98769b().mo112693a(str, false);
            if (a == null) {
                C90741c.m113808a("IPC.IPCInvoker", "invokeSync failed, get bridge is null by process(%s).", str);
                return null;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putParcelable("__remote_task_data", inputtype);
                Bundle jg = a.mo112673jg(bundle, cls.getName());
                if (jg == null) {
                    return null;
                }
                jg.setClassLoader(C80907o.class.getClassLoader());
                return jg.getParcelable("__remote_task_result_data");
            } catch (RemoteException e) {
                C90741c.f260625a.mo997a(3, "IPC.IPCInvoker", "invokeSync failed, ipc invoke error : %s", e);
                return null;
            }
        }
    }

    /* renamed from: g */
    public static boolean m98784g(String str) {
        boolean z = true;
        if (C80906n.m98776c(str)) {
            return true;
        }
        C80898f b = C80898f.m98769b();
        b.getClass();
        if (!(!C80906n.m98776c(str) && ((ConcurrentHashMap) b.f237728c).get(str) != null)) {
            return false;
        }
        C80898f.C80904e eVar = (C80898f.C80904e) ((ConcurrentHashMap) b.f237728c).get(str);
        if (eVar == null || eVar.f237747c || eVar.f237746b == null || eVar.f237745a == null) {
            z = false;
        }
        return z;
    }

    /* renamed from: h */
    public static void m98785h(C1256g<?> gVar) {
        C80909b bVar;
        if (gVar != null) {
            Map<C1256g<?>, WeakReference<C80909b>> map = C80909b.f237757h;
            synchronized (map) {
                WeakReference weakReference = (WeakReference) ((WeakHashMap) map).get(gVar);
                bVar = weakReference == null ? null : (C80909b) weakReference.get();
            }
            if (bVar != null) {
                bVar.recycle();
            }
            Set<Object> set = C90365a.f259368a;
            synchronized (set) {
                ((HashSet) set).remove(gVar);
            }
        }
    }

    /* renamed from: i */
    public static boolean m98786i(String str, C80924w wVar) {
        C80898f b = C80898f.m98769b();
        boolean z = false;
        if (wVar == null) {
            b.getClass();
        } else {
            synchronized (b.f237731f) {
                Set set = (Set) ((HashMap) b.f237731f).get(str);
                if (set != null) {
                    z = set.remove(wVar);
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public static void m98787j(String str, C80936x xVar) {
        C80898f b = C80898f.m98769b();
        if (xVar == null) {
            b.getClass();
            return;
        }
        synchronized (b.f237729d) {
            Set set = (Set) ((HashMap) b.f237729d).get(str);
            if (set != null) {
                set.remove(xVar);
            }
        }
    }

    /* renamed from: k */
    public static void m98788k(String str, C80937y yVar) {
        C80898f b = C80898f.m98769b();
        if (yVar == null) {
            b.getClass();
            return;
        }
        synchronized (b.f237730e) {
            Set set = (Set) ((HashMap) b.f237730e).get(str);
            if (set != null) {
                set.remove(yVar);
            }
        }
    }
}
