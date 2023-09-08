package p488dc;

import android.os.Build;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import p963fc.C86812g;
import rx3.C13598b0;

/* renamed from: dc.b */
public final class C31103b {

    /* renamed from: a */
    public static final C31103b f83392a = new C31103b();

    /* renamed from: b */
    public static final C31105b f83393b = (Build.VERSION.SDK_INT >= 24 ? new C31106c() : new C31107d());

    /* renamed from: c */
    public static final CopyOnWriteArrayList<C86812g> f83394c = new CopyOnWriteArrayList<>();

    /* renamed from: dc.b$a */
    public static final class C31104a {

        /* renamed from: a */
        public final String f83395a;

        /* renamed from: b */
        public final String f83396b;

        public C31104a(String str, String str2) {
            C87412m.m108594g(str, "appId");
            this.f83395a = str;
            this.f83396b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31104a)) {
                return false;
            }
            C31104a aVar = (C31104a) obj;
            return C87412m.m108589b(this.f83395a, aVar.f83395a) && C87412m.m108589b(this.f83396b, aVar.f83396b);
        }

        public int hashCode() {
            int hashCode = this.f83395a.hashCode() * 31;
            String str = this.f83396b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PendingFinishRuntimeMessage(appId=" + this.f83395a + ", instanceId=" + this.f83396b + ')';
        }
    }

    /* renamed from: dc.b$b */
    public interface C31105b {
        /* renamed from: a */
        boolean mo57985a(C31104a aVar);

        /* renamed from: b */
        boolean mo57986b(C32226l<? super C31104a, Boolean> lVar);
    }

    /* renamed from: dc.b$c */
    public static final class C31106c implements C31105b {

        /* renamed from: a */
        public final CopyOnWriteArrayList<C31104a> f83397a = new CopyOnWriteArrayList<>();

        /* renamed from: a */
        public boolean mo57985a(C31104a aVar) {
            C87412m.m108594g(aVar, StateEvent.Name.MESSAGE);
            return this.f83397a.add(aVar);
        }

        /* renamed from: b */
        public boolean mo57986b(C32226l<? super C31104a, Boolean> lVar) {
            C87412m.m108594g(lVar, "predicate");
            try {
                return this.f83397a.removeIf(new C31108e(lVar));
            } catch (UnsupportedOperationException unused) {
                Iterator<C31104a> it = this.f83397a.iterator();
                while (it.hasNext()) {
                    C31104a next = it.next();
                    C87412m.m108593f(next, "element");
                    if (lVar.invoke(next).booleanValue()) {
                        this.f83397a.remove(next);
                        return true;
                    }
                }
                return false;
            }
        }
    }

    /* renamed from: dc.b$d */
    public static final class C31107d implements C31105b {

        /* renamed from: a */
        public final ArrayList<C31104a> f83398a = new ArrayList<>();

        /* renamed from: a */
        public boolean mo57985a(C31104a aVar) {
            boolean add;
            C87412m.m108594g(aVar, StateEvent.Name.MESSAGE);
            synchronized (this.f83398a) {
                add = this.f83398a.add(aVar);
            }
            return add;
        }

        /* renamed from: b */
        public boolean mo57986b(C32226l<? super C31104a, Boolean> lVar) {
            C87412m.m108594g(lVar, "predicate");
            synchronized (this.f83398a) {
                Iterator<C31104a> it = this.f83398a.iterator();
                C87412m.m108593f(it, "queue.iterator()");
                while (it.hasNext()) {
                    C31104a next = it.next();
                    C87412m.m108593f(next, "it.next()");
                    if (lVar.invoke(next).booleanValue()) {
                        it.remove();
                        return true;
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
                return false;
            }
        }
    }

    /* renamed from: dc.b$e */
    public static final class C31108e implements Predicate {

        /* renamed from: a */
        public final /* synthetic */ C32226l f83399a;

        public C31108e(C32226l lVar) {
            this.f83399a = lVar;
        }

        public final /* synthetic */ boolean test(Object obj) {
            return ((Boolean) this.f83399a.invoke(obj)).booleanValue();
        }
    }

    /* renamed from: a */
    public final void mo57981a(LuggageClientProcessMessage<? super C86812g> luggageClientProcessMessage) {
        T t;
        C87412m.m108594g(luggageClientProcessMessage, StateEvent.Name.MESSAGE);
        Iterator<T> it = f83394c.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C86812g) t).f238147j, luggageClientProcessMessage.mo892b())) {
                break;
            }
        }
        C86812g gVar = (C86812g) t;
        if (gVar != null) {
            luggageClientProcessMessage.mo893c(gVar);
            return;
        }
        Log.m105929w("Luggage.LuggageClientProcessMessageDispatcher", "dispatch: dispatch message[%s]appId[%s] fail", luggageClientProcessMessage.getClass().getSimpleName(), luggageClientProcessMessage.mo892b());
        if (luggageClientProcessMessage instanceof C31102a) {
            f83393b.mo57985a(new C31104a(luggageClientProcessMessage.mo892b(), ((C31102a) luggageClientProcessMessage).mo57980a()));
        }
    }
}
