package gk3;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import lu3.C34379c;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: gk3.g */
public final class C98140g {

    /* renamed from: a */
    public HashSet<Integer> f287752a = new HashSet<>();

    /* renamed from: b */
    public HashMap<Integer, C98141a> f287753b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<Integer, Integer> f287754c = new HashMap<>();

    /* renamed from: d */
    public HashMap<Integer, C34379c<?>> f287755d = new HashMap<>();

    /* renamed from: e */
    public int f287756e;

    /* renamed from: gk3.g$a */
    public interface C98141a {
        /* renamed from: a */
        boolean mo137430a();

        /* renamed from: b */
        long mo137431b();

        /* renamed from: c */
        boolean mo137432c();

        int getType();

        int priority();

        void setEnable(boolean z);

        boolean show();
    }

    /* renamed from: gk3.g$b */
    public static abstract class C98142b implements C98141a {

        /* renamed from: a */
        public C98140g f287757a;

        /* renamed from: b */
        public boolean f287758b = true;

        public C98142b(C98140g gVar) {
            C87412m.m108594g(gVar, "controller");
            this.f287757a = gVar;
        }

        /* renamed from: a */
        public boolean mo137430a() {
            return this.f287758b;
        }

        /* renamed from: b */
        public long mo137431b() {
            return 1000;
        }

        /* renamed from: c */
        public boolean mo137432c() {
            Integer e = this.f287757a.mo137425e(getType());
            boolean z = e != null;
            for (Number intValue : this.f287757a.f287752a) {
                int intValue2 = intValue.intValue();
                C98141a aVar = this.f287757a.f287753b.get(Integer.valueOf(intValue2));
                if (aVar != null && priority() < aVar.priority()) {
                    Integer e2 = this.f287757a.mo137425e(intValue2);
                    z = z && e2 != null;
                    Log.m105927v("MicroMsg.ImageScanButtonStatusManager", "Action.valid() actionType: %s, status: %s", Integer.valueOf(intValue2), e2);
                }
            }
            Log.m105927v("MicroMsg.ImageScanButtonStatusManager", "Action.valid() currentType: %d, currentStatus: %s, valid: %b", Integer.valueOf(getType()), e, Boolean.valueOf(z));
            return z;
        }

        public abstract int getType();

        public void setEnable(boolean z) {
            this.f287758b = z;
        }

        public boolean show() {
            boolean z = this.f287757a.mo137424d(getType(), 2) == 1;
            Log.m105927v("MicroMsg.ImageScanButtonStatusManager", "Action.show() status: %s, canShow: %s, getType: %d", this.f287757a.mo137425e(getType()), Boolean.valueOf(z), Integer.valueOf(getType()));
            if (!z) {
                return false;
            }
            for (Number intValue : this.f287757a.f287752a) {
                int intValue2 = intValue.intValue();
                C98141a aVar = this.f287757a.f287753b.get(Integer.valueOf(intValue2));
                if (aVar != null && priority() < aVar.priority()) {
                    boolean z2 = this.f287757a.mo137424d(intValue2, 2) == 1;
                    Log.m105927v("MicroMsg.ImageScanButtonStatusManager", "Action.show() actionType: %d, actionCanShow: %b", Integer.valueOf(intValue2), Boolean.valueOf(z2));
                    z = z && !z2;
                    if (!z) {
                        return false;
                    }
                }
            }
            return z;
        }
    }

    /* renamed from: gk3.g$c */
    public static final class C98143c extends C98142b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98143c(C98140g gVar) {
            super(gVar);
            C87412m.m108594g(gVar, "controller");
        }

        /* renamed from: b */
        public long mo137431b() {
            return 0;
        }

        public int getType() {
            return 6;
        }

        public int priority() {
            return 6;
        }
    }

    /* renamed from: gk3.g$d */
    public static final class C98144d extends C98142b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98144d(C98140g gVar) {
            super(gVar);
            C87412m.m108594g(gVar, "controller");
        }

        public int getType() {
            return 2;
        }

        public int priority() {
            return 4;
        }
    }

    /* renamed from: gk3.g$e */
    public static final class C98145e extends C98142b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98145e(C98140g gVar) {
            super(gVar);
            C87412m.m108594g(gVar, "controller");
        }

        /* renamed from: b */
        public long mo137431b() {
            return 2000;
        }

        public int getType() {
            return 1;
        }

        public int priority() {
            return 2;
        }
    }

    /* renamed from: gk3.g$f */
    public static final class C98146f extends C98142b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98146f(C98140g gVar) {
            super(gVar);
            C87412m.m108594g(gVar, "controller");
        }

        /* renamed from: b */
        public long mo137431b() {
            return 2000;
        }

        public int getType() {
            return 5;
        }

        public int priority() {
            return 5;
        }
    }

    /* renamed from: gk3.g$g */
    public static final class C98147g extends C98142b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98147g(C98140g gVar) {
            super(gVar);
            C87412m.m108594g(gVar, "controller");
        }

        public int getType() {
            return 3;
        }

        public int priority() {
            return 3;
        }
    }

    /* renamed from: gk3.g$h */
    public static final class C98148h extends C98142b {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98148h(C98140g gVar) {
            super(gVar);
            C87412m.m108594g(gVar, "controller");
        }

        /* renamed from: b */
        public long mo137431b() {
            return 2000;
        }

        public int getType() {
            return 4;
        }

        public int priority() {
            return 1;
        }
    }

    /* renamed from: gk3.g$i */
    public static final class C98149i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98140g f287759d;

        /* renamed from: e */
        public final /* synthetic */ int f287760e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f287761f;

        public C98149i(C98140g gVar, int i, Runnable runnable) {
            this.f287759d = gVar;
            this.f287760e = i;
            this.f287761f = runnable;
        }

        public final void run() {
            C98140g gVar = this.f287759d;
            int i = this.f287760e;
            gVar.getClass();
            gVar.mo137423c(i, new C98151i(gVar, i));
            this.f287761f.run();
        }
    }

    public C98140g() {
        int i;
        C98141a aVar;
        this.f287752a.add(1);
        this.f287753b.put(1, new C98145e(this));
        this.f287752a.add(5);
        this.f287753b.put(5, new C98146f(this));
        if (C98135d.f287725a) {
            this.f287752a.add(2);
            this.f287753b.put(2, new C98144d(this));
        }
        if (C98135d.f287727c) {
            this.f287752a.add(4);
            this.f287753b.put(4, new C98148h(this));
        }
        if (C98135d.f287728d) {
            this.f287752a.add(3);
            this.f287753b.put(3, new C98147g(this));
        }
        this.f287752a.add(6);
        this.f287753b.put(6, new C98143c(this));
        Integer num = (Integer) C110818d0.m150915M(this.f287752a);
        if (num != null) {
            num.intValue();
            C98141a aVar2 = this.f287753b.get(num);
            if (aVar2 != null) {
                int priority = aVar2.priority();
                i = num.intValue();
                int i2 = 0;
                for (T next : this.f287752a) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        int intValue = ((Number) next).intValue();
                        if (!(i2 == 0 || (aVar = this.f287753b.get(Integer.valueOf(intValue))) == null || aVar.priority() >= priority)) {
                            priority = aVar.priority();
                            i = intValue;
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                this.f287756e = i;
                Log.m105925i("MicroMsg.ImageScanButtonStatusManager", "alvinluo init minPriorityActionType: %d", Integer.valueOf(i));
            }
        }
        i = 0;
        this.f287756e = i;
        Log.m105925i("MicroMsg.ImageScanButtonStatusManager", "alvinluo init minPriorityActionType: %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo137421a(int i) {
        if (i == 5) {
            return mo137424d(5, 2) == 1;
        }
        C98141a aVar = this.f287753b.get(Integer.valueOf(i));
        if (aVar == null) {
            return false;
        }
        boolean show = aVar.show();
        Log.m105925i("MicroMsg.ImageScanButtonStatusManager", "alvinluo canShow type: %d, show: %b", Integer.valueOf(i), Boolean.valueOf(show));
        return show;
    }

    /* renamed from: b */
    public final void mo137422b(int i) {
        C34379c cVar = this.f287755d.get(Integer.valueOf(i));
        if (cVar != null) {
            Log.m105927v("MicroMsg.ImageScanButtonStatusManager", "alvinluo cancelAction type: %d", Integer.valueOf(i));
            cVar.cancel(false);
        }
    }

    /* renamed from: c */
    public final void mo137423c(int i, C32227p<? super C98141a, ? super C98141a, C13598b0> pVar) {
        C98141a aVar = this.f287753b.get(Integer.valueOf(i));
        if (aVar != null) {
            for (Number intValue : this.f287752a) {
                C98141a aVar2 = this.f287753b.get(Integer.valueOf(intValue.intValue()));
                if (aVar2 != null) {
                    pVar.invoke(aVar, aVar2);
                }
            }
        }
    }

    /* renamed from: d */
    public final int mo137424d(int i, int i2) {
        Integer num = this.f287754c.get(Integer.valueOf(i));
        if (num == null) {
            return i2;
        }
        num.intValue();
        return num.intValue();
    }

    /* renamed from: e */
    public final Integer mo137425e(int i) {
        return this.f287754c.get(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final boolean mo137426f(int i) {
        C98141a aVar = this.f287753b.get(Integer.valueOf(i));
        return aVar != null && aVar.mo137430a() && aVar.mo137432c();
    }

    /* renamed from: g */
    public final void mo137427g(int i, Runnable runnable) {
        Integer e;
        C87412m.m108594g(runnable, "action");
        C98141a aVar = this.f287753b.get(Integer.valueOf(i));
        if (aVar != null) {
            if (!aVar.mo137430a() || ((e = mo137425e(i)) != null && e.intValue() == 4)) {
                Log.m105929w("MicroMsg.ImageScanButtonStatusManager", "alvinluo postAction action not enable or overTimeLimit: %d", Integer.valueOf(i));
            } else if (aVar.mo137432c()) {
                Log.m105919d("MicroMsg.ImageScanButtonStatusManager", "alvinluo postAction valid and run action type: %d", Integer.valueOf(i));
                mo137423c(i, new C98150h(this));
                runnable.run();
            } else {
                Log.m105919d("MicroMsg.ImageScanButtonStatusManager", "alvinluo postAction not valid and delay type: %d, action: %s, delay: %d", Integer.valueOf(i), runnable, Long.valueOf(aVar.mo137431b()));
                mo137422b(i);
                HashMap<Integer, C34379c<?>> hashMap = this.f287755d;
                Integer valueOf = Integer.valueOf(i);
                C119179t tVar = C119157j.f356862d;
                C98149i iVar = new C98149i(this, i, runnable);
                long b = aVar.mo137431b();
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                C34379c<?> w = jVar.mo183892w(iVar, b, false);
                C87412m.m108593f(w, "fun postAction(type: Int…ration())\n        }\n    }");
                hashMap.put(valueOf, w);
            }
        }
    }

    /* renamed from: h */
    public final void mo137428h(int i) {
        this.f287754c.remove(Integer.valueOf(i));
    }

    /* renamed from: i */
    public final void mo137429i(int i, int i2) {
        if (this.f287753b.get(Integer.valueOf(i)) != null) {
            Log.m105927v("MicroMsg.ImageScanButtonStatusManager", "alvinluo updateStatus type: %d, status: %s", Integer.valueOf(i), Integer.valueOf(i2));
            Integer e = mo137425e(i);
            if (e != null && e.intValue() == 4) {
                Log.m105929w("MicroMsg.ImageScanButtonStatusManager", "alvinluo updateStatus type: %d over time limit, status: %s", Integer.valueOf(i), Integer.valueOf(i2));
                if (i2 == 1 || i2 == 3) {
                    this.f287754c.put(Integer.valueOf(i), 7);
                    return;
                }
                return;
            }
            this.f287754c.put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
