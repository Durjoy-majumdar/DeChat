package jq3;

import android.database.Observable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C16631z;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.recyclerview.SynchronizedAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kj2.C117407d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: jq3.l */
public abstract class C60898l<VH extends RecyclerView.C16631z> extends SynchronizedAdapter<VH> {

    /* renamed from: d */
    public boolean f173480d = true;

    /* renamed from: e */
    public RecyclerView f173481e;

    /* renamed from: f */
    public Observable<RecyclerView.C16615g> f173482f;

    /* renamed from: g */
    public final C13601g f173483g = C36568h.m40985a(new C60903g(this));

    /* renamed from: h */
    public final ConcurrentLinkedQueue<RecyclerView.C16615g> f173484h = new ConcurrentLinkedQueue<>();

    /* renamed from: i */
    public final ArrayList<C60899a> f173485i = new ArrayList<>();

    /* renamed from: j */
    public final ArrayList<C60899a> f173486j = new ArrayList<>();

    /* renamed from: n */
    public C9503c<VH> f173487n;

    /* renamed from: o */
    public C9502b<VH> f173488o;

    /* renamed from: p */
    public C60900d<VH> f173489p;

    /* renamed from: q */
    public boolean f173490q;

    /* renamed from: r */
    public boolean f173491r;

    /* renamed from: jq3.l$b */
    public interface C9502b<VH extends RecyclerView.C16631z> {
        /* renamed from: q */
        void mo734q(RecyclerView.C16613e<VH> eVar, View view, int i, VH vh);
    }

    /* renamed from: jq3.l$c */
    public interface C9503c<VH extends RecyclerView.C16631z> {
        /* renamed from: n */
        boolean mo759n(RecyclerView.C16613e<VH> eVar, View view, int i, VH vh);
    }

    /* renamed from: jq3.l$i */
    public static final class C9504i implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60898l<VH> f29674d;

        /* renamed from: e */
        public final /* synthetic */ VH f29675e;

        public C9504i(C60898l<VH> lVar, VH vh) {
            this.f29674d = lVar;
            this.f29675e = vh;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RecyclerView.C16631z F0 = this.f29674d.mo85797d6().mo17021F0(view);
            int j = F0 != null ? F0.mo17363j() : -1;
            C60898l<VH> lVar = this.f29674d;
            C9502b<VH> bVar = lVar.f173488o;
            if (bVar != null) {
                bVar.mo734q(lVar, view, j, this.f29675e);
            }
            C117292a.m165361g(this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jq3.l$j */
    public static final class C9505j implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60898l<VH> f29676d;

        /* renamed from: e */
        public final /* synthetic */ VH f29677e;

        public C9505j(C60898l<VH> lVar, VH vh) {
            this.f29676d = lVar;
            this.f29677e = vh;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            RecyclerView.C16631z F0 = this.f29676d.mo85797d6().mo17021F0(view);
            int j = F0 != null ? F0.mo17363j() : -1;
            C60898l<VH> lVar = this.f29676d;
            C9503c<VH> cVar = lVar.f173487n;
            boolean n = cVar != null ? cVar.mo759n(lVar, view, j, this.f29677e) : false;
            C117292a.m165362h(n, this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$6", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return n;
        }
    }

    /* renamed from: jq3.l$h */
    public static final class C21271h extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C60898l<VH> f60085a;

        /* renamed from: b */
        public final /* synthetic */ RecyclerView f60086b;

        /* renamed from: jq3.l$h$a */
        public static final class C21272a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C60898l<VH> f60087d;

            public C21272a(C60898l<VH> lVar) {
                this.f60087d = lVar;
            }

            public final void run() {
                this.f60087d.notifyDataSetChanged();
            }
        }

        /* renamed from: jq3.l$h$b */
        public static final class C21273b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C21271h f60088d;

            /* renamed from: e */
            public final /* synthetic */ int f60089e;

            /* renamed from: f */
            public final /* synthetic */ C60898l<VH> f60090f;

            /* renamed from: g */
            public final /* synthetic */ int f60091g;

            public C21273b(C21271h hVar, int i, C60898l<VH> lVar, int i2) {
                this.f60088d = hVar;
                this.f60089e = i;
                this.f60090f = lVar;
                this.f60091g = i2;
            }

            public final void run() {
                if (!this.f60088d.mo33251h(this.f60089e)) {
                    Log.m105920e("RecyclerViewAdapterEx", "[onItemRangeChanged] preItemCount=" + this.f60089e + " but now itemCount is " + this.f60090f.getItemCount());
                    return;
                }
                this.f60090f.notifyItemChanged(this.f60091g, Integer.valueOf(this.f60089e));
            }
        }

        /* renamed from: jq3.l$h$c */
        public static final class C21274c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C21271h f60092d;

            /* renamed from: e */
            public final /* synthetic */ int f60093e;

            /* renamed from: f */
            public final /* synthetic */ C60898l<VH> f60094f;

            /* renamed from: g */
            public final /* synthetic */ int f60095g;

            /* renamed from: h */
            public final /* synthetic */ Object f60096h;

            public C21274c(C21271h hVar, int i, C60898l<VH> lVar, int i2, Object obj) {
                this.f60092d = hVar;
                this.f60093e = i;
                this.f60094f = lVar;
                this.f60095g = i2;
                this.f60096h = obj;
            }

            public final void run() {
                if (!this.f60092d.mo33251h(this.f60093e)) {
                    Log.m105920e("RecyclerViewAdapterEx", "[onItemRangeChanged] preItemCount=" + this.f60093e + " but now itemCount is " + this.f60094f.getItemCount());
                    return;
                }
                this.f60094f.notifyItemRangeChanged(this.f60095g, this.f60093e, this.f60096h);
            }
        }

        /* renamed from: jq3.l$h$d */
        public static final class C21275d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C21271h f60097d;

            /* renamed from: e */
            public final /* synthetic */ int f60098e;

            /* renamed from: f */
            public final /* synthetic */ C60898l<VH> f60099f;

            /* renamed from: g */
            public final /* synthetic */ int f60100g;

            public C21275d(C21271h hVar, int i, C60898l<VH> lVar, int i2) {
                this.f60097d = hVar;
                this.f60098e = i;
                this.f60099f = lVar;
                this.f60100g = i2;
            }

            public final void run() {
                if (!this.f60097d.mo33251h(this.f60098e)) {
                    Log.m105920e("RecyclerViewAdapterEx", "[onItemRangeInserted] preItemCount=" + this.f60098e + " but now itemCount is " + this.f60099f.getItemCount());
                    return;
                }
                this.f60099f.notifyItemRangeInserted(this.f60100g, this.f60098e);
            }
        }

        /* renamed from: jq3.l$h$e */
        public static final class C21276e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C21271h f60101d;

            /* renamed from: e */
            public final /* synthetic */ int f60102e;

            /* renamed from: f */
            public final /* synthetic */ C60898l<VH> f60103f;

            /* renamed from: g */
            public final /* synthetic */ int f60104g;

            /* renamed from: h */
            public final /* synthetic */ int f60105h;

            public C21276e(C21271h hVar, int i, C60898l<VH> lVar, int i2, int i3) {
                this.f60101d = hVar;
                this.f60102e = i;
                this.f60103f = lVar;
                this.f60104g = i2;
                this.f60105h = i3;
            }

            public final void run() {
                if (!this.f60101d.mo33251h(this.f60102e)) {
                    Log.m105920e("RecyclerViewAdapterEx", "[onItemRangeMoved] preItemCount=" + this.f60102e + " but now itemCount is " + this.f60103f.getItemCount());
                    return;
                }
                this.f60103f.notifyItemMoved(this.f60104g, this.f60105h);
            }
        }

        /* renamed from: jq3.l$h$f */
        public static final class C21277f implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C21271h f60106d;

            /* renamed from: e */
            public final /* synthetic */ int f60107e;

            /* renamed from: f */
            public final /* synthetic */ C60898l<VH> f60108f;

            /* renamed from: g */
            public final /* synthetic */ int f60109g;

            public C21277f(C21271h hVar, int i, C60898l<VH> lVar, int i2) {
                this.f60106d = hVar;
                this.f60107e = i;
                this.f60108f = lVar;
                this.f60109g = i2;
            }

            public final void run() {
                if (!this.f60106d.mo33251h(this.f60107e)) {
                    Log.m105920e("RecyclerViewAdapterEx", "[notifyItemRangeRemoved] preItemCount=" + this.f60107e + " but now itemCount is " + this.f60108f.getItemCount());
                    return;
                }
                this.f60108f.notifyItemRangeRemoved(this.f60109g, this.f60107e);
            }
        }

        public C21271h(C60898l<VH> lVar, RecyclerView recyclerView) {
            this.f60085a = lVar;
            this.f60086b = recyclerView;
            new Handler(Looper.getMainLooper());
        }

        /* renamed from: b */
        public void mo2556b() {
            if (!this.f60085a.f173480d || !this.f60086b.mo17036W0()) {
                for (RecyclerView.C16615g b : this.f60085a.f173484h) {
                    b.mo2556b();
                }
                return;
            }
            Log.m105928w("RecyclerViewAdapterEx", "[onChanged] Cannot call this method while RecyclerView is computing a layout or scrolling");
            this.f60086b.post(new C21272a(this.f60085a));
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            if (!this.f60085a.f173480d || !this.f60086b.mo17036W0()) {
                for (RecyclerView.C16615g c : this.f60085a.f173484h) {
                    c.mo2557c(i, i2);
                }
                return;
            }
            Log.m105928w("RecyclerViewAdapterEx", "[onItemRangeChanged] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=" + i + " itemCount=" + i2 + ' ' + Util.getStack());
            this.f60086b.post(new C21273b(this, i2, this.f60085a, i));
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            if (!this.f60085a.f173480d || !this.f60086b.mo17036W0()) {
                for (RecyclerView.C16615g d : this.f60085a.f173484h) {
                    d.mo2558d(i, i2, obj);
                }
                return;
            }
            Log.m105928w("RecyclerViewAdapterEx", "[onItemRangeChanged] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=" + i + " itemCount=" + i2 + " payload=" + obj + ' ' + Util.getStack());
            this.f60086b.post(new C21274c(this, i2, this.f60085a, i, obj));
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            if (!this.f60085a.f173480d || !this.f60086b.mo17036W0()) {
                for (RecyclerView.C16615g e : this.f60085a.f173484h) {
                    e.mo2559e(i, i2);
                }
                return;
            }
            Log.m105928w("RecyclerViewAdapterEx", "[onItemRangeInserted] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=" + i + " itemCount=" + i2 + ' ' + Util.getStack());
            this.f60086b.post(new C21275d(this, i2, this.f60085a, i));
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            if (!this.f60085a.f173480d || !this.f60086b.mo17036W0()) {
                for (RecyclerView.C16615g f : this.f60085a.f173484h) {
                    f.mo17312f(i, i2, i3);
                }
                return;
            }
            Log.m105928w("RecyclerViewAdapterEx", "[onItemRangeMoved] Cannot call this method while RecyclerView is computing a layout or scrolling, fromPosition=" + i + " toPosition=" + i2 + " itemCount=" + i3 + ' ' + Util.getStack());
            this.f60086b.post(new C21276e(this, i3, this.f60085a, i, i2));
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            if (!this.f60085a.f173480d || !this.f60086b.mo17036W0()) {
                for (RecyclerView.C16615g g : this.f60085a.f173484h) {
                    g.mo2560g(i, i2);
                }
                return;
            }
            Log.m105928w("RecyclerViewAdapterEx", "[onItemRangeRemoved] Cannot call this method while RecyclerView is computing a layout or scrolling, positionStart=" + i + " itemCount=" + i2 + ' ' + Util.getStack());
            this.f60086b.post(new C21277f(this, i2, this.f60085a, i));
        }

        /* renamed from: h */
        public final boolean mo33251h(int i) {
            return i == this.f60085a.getItemCount();
        }
    }

    /* renamed from: jq3.l$a */
    public static abstract class C60899a implements C9493c {
        /* renamed from: a */
        public int mo85803a() {
            return 0;
        }

        /* renamed from: b */
        public View mo85804b() {
            return null;
        }

        /* renamed from: d */
        public boolean mo85805d() {
            return this instanceof C60901e;
        }
    }

    /* renamed from: jq3.l$d */
    public interface C60900d<VH extends RecyclerView.C16631z> {
        /* renamed from: a */
        boolean mo85806a(RecyclerView.C16613e<VH> eVar, View view, int i, VH vh, MotionEvent motionEvent);
    }

    /* renamed from: jq3.l$e */
    public static final class C60901e extends C60899a {

        /* renamed from: d */
        public final /* synthetic */ View f173492d;

        /* renamed from: e */
        public final /* synthetic */ int f173493e;

        public C60901e(View view, int i) {
            this.f173492d = view;
            this.f173493e = i;
        }

        /* renamed from: a */
        public int mo85803a() {
            return 0;
        }

        /* renamed from: b */
        public View mo85804b() {
            return this.f173492d;
        }

        /* renamed from: c */
        public int mo75c() {
            return this.f173493e;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C60899a) && getItemId() == ((C60899a) obj).getItemId();
        }

        public long getItemId() {
            return (long) this.f173492d.hashCode();
        }
    }

    /* renamed from: jq3.l$f */
    public static final class C60902f extends C60899a {

        /* renamed from: d */
        public final /* synthetic */ View f173494d;

        /* renamed from: e */
        public final /* synthetic */ int f173495e;

        public C60902f(View view, int i) {
            this.f173494d = view;
            this.f173495e = i;
        }

        /* renamed from: a */
        public int mo85803a() {
            return 0;
        }

        /* renamed from: b */
        public View mo85804b() {
            return this.f173494d;
        }

        /* renamed from: c */
        public int mo75c() {
            return this.f173495e;
        }

        /* renamed from: d */
        public boolean mo85805d() {
            return true;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C60899a) && getItemId() == ((C60899a) obj).getItemId();
        }

        public long getItemId() {
            return (long) this.f173494d.hashCode();
        }
    }

    /* renamed from: jq3.l$g */
    public static final class C60903g extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C60898l<VH> f173496d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60903g(C60898l<VH> lVar) {
            super(0);
            this.f173496d = lVar;
        }

        public Object invoke() {
            C60898l<VH> lVar = this.f173496d;
            lVar.getClass();
            boolean z = false;
            try {
                Field declaredField = RecyclerView.C16613e.class.getDeclaredField("mObservable");
                declaredField.setAccessible(true);
                Constructor<?> declaredConstructor = declaredField.get(lVar).getClass().getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                C87412m.m108592e(newInstance, "null cannot be cast to non-null type android.database.Observable<androidx.recyclerview.widget.RecyclerView.AdapterDataObserver>");
                Observable<RecyclerView.C16615g> observable = (Observable) newInstance;
                lVar.f173482f = observable;
                declaredField.set(lVar, observable);
                if (lVar.f173482f != null) {
                    z = true;
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("RecyclerViewAdapterEx", th, "", new Object[0]);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: jq3.l$k */
    public static final class C60904k implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C60898l<VH> f173497d;

        /* renamed from: e */
        public final /* synthetic */ VH f173498e;

        public C60904k(C60898l<VH> lVar, VH vh) {
            this.f173497d = lVar;
            this.f173498e = vh;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C87412m.m108594g(view, "view");
            C87412m.m108594g(motionEvent, "motionEvent");
            RecyclerView.C16631z F0 = this.f173497d.mo85797d6().mo17021F0(view);
            int j = F0 != null ? F0.mo17363j() : -1;
            C60898l<VH> lVar = this.f173497d;
            C60900d<VH> dVar = lVar.f173489p;
            boolean a = dVar != null ? dVar.mo85806a(lVar, view, j, this.f173498e, motionEvent) : false;
            C117292a.m165362h(a, this, "com/tencent/mm/view/recyclerview/RecyclerViewAdapterEx$onCreateViewHolder$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return a;
        }
    }

    /* renamed from: Q5 */
    public static void m71326Q5(C60898l lVar, C60899a aVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            lVar.getClass();
            C87412m.m108594g(aVar, "info");
            if (!lVar.f173486j.contains(aVar)) {
                lVar.f173486j.add(aVar);
                if (z) {
                    lVar.notifyItemInserted(lVar.getItemCount() - 1);
                } else {
                    lVar.notifyDataSetChanged();
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooter");
        }
    }

    /* renamed from: S5 */
    public static /* synthetic */ C60899a m71327S5(C60898l lVar, View view, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return lVar.mo85792R5(view, i, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFooterView");
    }

    /* renamed from: U5 */
    public static /* synthetic */ void m71328U5(C60898l lVar, C60899a aVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            lVar.mo85793T5(aVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeader");
    }

    /* renamed from: W5 */
    public static /* synthetic */ C60899a m71329W5(C60898l lVar, View view, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z = true;
            }
            return lVar.mo85794V5(view, i, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addHeaderView");
    }

    /* renamed from: b6 */
    public static /* synthetic */ RecyclerView.C16631z m71330b6(C60898l lVar, long j, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return lVar.mo5158a6(j, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findViewHolderByItemId");
    }

    /* renamed from: i6 */
    public static /* synthetic */ void m71331i6(C60898l lVar, long j, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            lVar.mo85801h6(j, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFooter");
    }

    /* renamed from: k6 */
    public static /* synthetic */ void m71332k6(C60898l lVar, long j, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            lVar.mo85802j6(j, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeHeader");
    }

    /* renamed from: F4 */
    public abstract int mo82597F4();

    /* renamed from: G4 */
    public long mo82598G4(int i) {
        return 0;
    }

    /* renamed from: N5 */
    public VH mo82599N5(ViewGroup viewGroup, int i, C60899a aVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(aVar, "info");
        return null;
    }

    /* renamed from: O4 */
    public int mo82600O4(int i) {
        return 0;
    }

    /* renamed from: O5 */
    public VH mo82601O5(ViewGroup viewGroup, int i, C60899a aVar) {
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(aVar, "info");
        return null;
    }

    /* renamed from: P5 */
    public abstract VH mo82602P5(ViewGroup viewGroup, int i);

    /* renamed from: R5 */
    public final C60899a mo85792R5(View view, int i, boolean z) {
        C87412m.m108594g(view, "resource");
        C60901e eVar = new C60901e(view, i);
        if (!this.f173486j.contains(eVar)) {
            this.f173486j.add(eVar);
            if (z) {
                notifyItemInserted(getItemCount() - 1);
            } else {
                Log.m105924i("RecyclerViewAdapterEx", "[addFooterView] notifyDataSetChanged");
                notifyDataSetChanged();
            }
        }
        return eVar;
    }

    /* renamed from: T5 */
    public final void mo85793T5(C60899a aVar, boolean z) {
        C87412m.m108594g(aVar, "info");
        if (!this.f173485i.contains(aVar)) {
            this.f173485i.add(aVar);
            if (z) {
                notifyItemInserted(this.f173485i.size() - 1);
                return;
            }
            Log.m105924i("RecyclerViewAdapterEx", "[addHeader] notifyDataSetChanged");
            notifyDataSetChanged();
        }
    }

    /* renamed from: V5 */
    public final C60899a mo85794V5(View view, int i, boolean z) {
        C87412m.m108594g(view, "resource");
        C60902f fVar = new C60902f(view, i);
        if (!this.f173485i.contains(fVar)) {
            this.f173485i.add(fVar);
            Log.m105924i("Finder.FinderTopicFeedUIContract.TopicFeedViewCallback", "headerInfoList.add : " + fVar.getItemId());
            if (z) {
                notifyItemInserted(this.f173485i.size() - 1);
            } else {
                Log.m105924i("RecyclerViewAdapterEx", "[addHeaderView] notifyDataSetChanged");
                notifyDataSetChanged();
            }
        }
        return fVar;
    }

    /* renamed from: X5 */
    public void mo82603X5(VH vh, boolean z) {
        C87412m.m108594g(vh, "holder");
    }

    /* renamed from: Y5 */
    public final boolean mo85795Y5(C60899a aVar) {
        C87412m.m108594g(aVar, "info");
        return this.f173485i.contains(aVar);
    }

    /* renamed from: Z5 */
    public void mo82604Z5(VH vh) {
        C87412m.m108594g(vh, "holder");
    }

    /* renamed from: a6 */
    public VH mo5158a6(long j, boolean z) {
        StringBuilder sb = new StringBuilder();
        try {
            int childCount = mo85797d6().getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = mo85797d6().getChildAt(i);
                if (childAt == null) {
                    return null;
                }
                VH F0 = mo85797d6().mo17021F0(childAt);
                if (!(F0 == null || F0.mo17363j() == -1)) {
                    long itemId = getItemId(F0.mo17363j());
                    if (z) {
                        sb.append("adapterPosition=" + F0.mo17363j() + " itemId=" + itemId + 10);
                    }
                    if (j == itemId) {
                        return F0;
                    }
                }
            }
            if (z) {
                Log.m105928w("RecyclerViewAdapterEx", "[findViewHolderByItemId] " + sb);
            }
            return null;
        } catch (Throwable th) {
            Log.m105920e("RecyclerViewAdapterEx", "findViewHolderByItemId failed, error=" + th);
            return null;
        }
    }

    /* renamed from: c6 */
    public final int mo85796c6() {
        return this.f173485i.size();
    }

    /* renamed from: d6 */
    public final RecyclerView mo85797d6() {
        RecyclerView recyclerView = this.f173481e;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: e6 */
    public final void mo85798e6(long j) {
        RecyclerView.C16631z b6 = m71330b6(this, j, false, 2, (Object) null);
        if (b6 != null) {
            notifyItemChanged(b6.mo17363j());
        }
    }

    /* renamed from: f6 */
    public final void mo85799f6(long j, Object obj) {
        RecyclerView.C16631z b6 = m71330b6(this, j, false, 2, (Object) null);
        if (b6 != null) {
            notifyItemChanged(b6.mo17363j(), obj);
        }
    }

    /* renamed from: g5 */
    public void mo82605g5(VH vh, int i, C60899a aVar) {
        C87412m.m108594g(vh, "holder");
        C87412m.m108594g(aVar, "info");
    }

    /* renamed from: g6 */
    public final void mo85800g6(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    childAt.animate().cancel();
                    childAt.hasTransientState();
                    mo85800g6(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    public final int getItemCount() {
        return this.f173485i.size() + mo82597F4() + this.f173486j.size();
    }

    public final long getItemId(int i) {
        if (getItemCount() <= i || i < 0) {
            String str = "[getItemId] position=" + i + " itemCount=" + getItemCount() + " headerCount=" + mo85796c6() + " footerCount=" + this.f173486j.size() + ' ' + Util.getStack();
            Log.m105920e("RecyclerViewAdapterEx", str);
            C117407d.INSTANCE.mo160131h(20251, 3, str);
            return 0;
        } else if (i < this.f173485i.size()) {
            return this.f173485i.get(i).getItemId();
        } else {
            if (i < mo82597F4() + this.f173485i.size()) {
                return mo82598G4(i - mo85796c6());
            }
            return this.f173486j.get(i - (this.f173485i.size() + mo82597F4())).getItemId();
        }
    }

    public final int getItemViewType(int i) {
        if (i < this.f173485i.size()) {
            return this.f173485i.get(i).mo75c();
        }
        if (i < mo82597F4() + this.f173485i.size()) {
            return mo82600O4(i - mo85796c6());
        }
        return this.f173486j.get(i - (this.f173485i.size() + mo82597F4())).mo75c();
    }

    /* renamed from: h6 */
    public final void mo85801h6(long j, boolean z) {
        Iterator<C60899a> it = this.f173486j.iterator();
        C87412m.m108593f(it, "footerInfoList.iterator()");
        boolean z2 = false;
        int i = 0;
        while (it.hasNext()) {
            C60899a next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            if (next.getItemId() == j) {
                it.remove();
                if (z) {
                    notifyItemRemoved(mo85796c6() + mo82597F4() + i);
                }
                z2 = true;
            }
            i++;
        }
        if (z2 && !z) {
            Log.m105924i("RecyclerViewAdapterEx", "[removeFooter] notifyDataSetChanged");
            notifyDataSetChanged();
        }
    }

    /* renamed from: j6 */
    public final void mo85802j6(long j, boolean z) {
        Iterator<C60899a> it = this.f173485i.iterator();
        C87412m.m108593f(it, "headerInfoList.iterator()");
        boolean z2 = false;
        int i = 0;
        while (it.hasNext()) {
            C60899a next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            if (next.getItemId() == j) {
                it.remove();
                if (z) {
                    notifyItemRemoved(i);
                }
                z2 = true;
            }
            i++;
        }
        if (z2 && !z) {
            Log.m105924i("RecyclerViewAdapterEx", "[removeHeader] notifyDataSetChanged");
            notifyDataSetChanged();
        }
    }

    /* renamed from: l6 */
    public String mo10423l6(Exception exc, VH vh, int i, List<Object> list) {
        C87412m.m108594g(exc, "e");
        C87412m.m108594g(vh, "holder");
        C87412m.m108594g(list, "payloads");
        return "";
    }

    /* renamed from: m6 */
    public String mo10424m6(Exception exc, int i) {
        C87412m.m108594g(exc, "e");
        return "viewType=" + i;
    }

    /* renamed from: n6 */
    public abstract VH mo82607n6(View view);

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Observable<RecyclerView.C16615g> observable;
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f173481e = recyclerView;
        this.f173491r = true;
        if (((Boolean) ((C36570n) this.f173483g).getValue()).booleanValue() && (observable = this.f173482f) != null) {
            observable.registerObserver(new C21271h(this, recyclerView));
        }
    }

    public final void onBindViewHolder(VH vh, int i) {
        C87412m.m108594g(vh, "holder");
        long uptimeMillis = SystemClock.uptimeMillis();
        if (i < this.f173485i.size()) {
            C60899a aVar = this.f173485i.get(i);
            C87412m.m108593f(aVar, "headerInfoList[position]");
            C60899a aVar2 = aVar;
            if (!aVar2.mo85805d()) {
                mo82612u5(vh, i, aVar2);
            }
        } else if (i >= mo82597F4() + this.f173485i.size()) {
            C60899a aVar3 = this.f173486j.get(i - (this.f173485i.size() + mo82597F4()));
            C87412m.m108593f(aVar3, "footerInfoList[footerIndex]");
            C60899a aVar4 = aVar3;
            if (!aVar4.mo85805d()) {
                mo82605g5(vh, i, aVar4);
            }
        } else {
            mo10426w5(vh, i - this.f173485i.size());
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (uptimeMillis2 > 17) {
            Log.m105924i("RecyclerViewAdapterEx", "[onBindViewHolder] pos:" + i + ", itemId=" + getItemId(i) + " itemType=" + getItemViewType(i) + " cost=" + uptimeMillis2);
        }
    }

    public final VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        VH vh;
        VH N5;
        C87412m.m108594g(viewGroup, "parent");
        try {
            Iterator<C60899a> it = this.f173485i.iterator();
            int i3 = 0;
            while (true) {
                i2 = -1;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (it.next().mo75c() == i) {
                    break;
                }
                i3++;
            }
            Iterator<C60899a> it4 = this.f173486j.iterator();
            int i4 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (it4.next().mo75c() == i) {
                    i2 = i4;
                    break;
                }
                i4++;
            }
            if (i3 >= 0) {
                C60899a aVar = this.f173485i.get(i3);
                C87412m.m108593f(aVar, "headerInfoList[indexH]");
                C60899a aVar2 = aVar;
                if (aVar2.mo85805d()) {
                    View b = aVar2.mo85804b();
                    if (b == null || (vh = mo82607n6(b)) == null) {
                        View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(aVar2.mo85803a(), viewGroup, false);
                        C87412m.m108593f(inflate, "getInflater(parent.conte…ayoutId(), parent, false)");
                        vh = mo82607n6(inflate);
                    }
                } else {
                    vh = mo82601O5(viewGroup, i, aVar2);
                    C87412m.m108591d(vh);
                }
            } else if (i2 >= 0) {
                C60899a aVar3 = this.f173486j.get(i2);
                C87412m.m108593f(aVar3, "footerInfoList[indexF]");
                C60899a aVar4 = aVar3;
                if (aVar4.mo85805d()) {
                    View b2 = aVar4.mo85804b();
                    if (b2 != null) {
                        N5 = mo82607n6(b2);
                        if (N5 == null) {
                        }
                    }
                    View inflate2 = C85868k2.m106137b(viewGroup.getContext()).inflate(aVar4.mo85803a(), viewGroup, false);
                    C87412m.m108593f(inflate2, "getInflater(parent.conte…ayoutId(), parent, false)");
                    N5 = mo82607n6(inflate2);
                } else {
                    C60899a aVar5 = this.f173486j.get(i2);
                    C87412m.m108593f(aVar5, "footerInfoList[indexF]");
                    N5 = mo82599N5(viewGroup, i, aVar5);
                    C87412m.m108591d(N5);
                }
                vh = N5;
            } else {
                vh = mo82602P5(viewGroup, i);
            }
            View view = vh.f44854d;
            C87412m.m108593f(view, "holder.itemView");
            if (!view.hasOnClickListeners() && !this.f173490q) {
                view.setOnClickListener(new C9504i(this, vh));
                view.setOnLongClickListener(new C9505j(this, vh));
                view.setOnTouchListener(new C60904k(this, vh));
            }
            mo82604Z5(vh);
            return vh;
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException(e.getMessage() + 10 + (mo10424m6(e, i) + " crashActivity=" + viewGroup.getContext().getClass().getName()));
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f173491r = false;
    }

    public void onViewDetachedFromWindow(VH vh) {
        C87412m.m108594g(vh, "holder");
        super.onViewDetachedFromWindow(vh);
        View view = vh.f44854d;
        C87412m.m108593f(view, "holder.itemView");
        mo85800g6(view);
    }

    public void registerAdapterDataObserver(RecyclerView.C16615g gVar) {
        C87412m.m108594g(gVar, "observer");
        if (((Boolean) ((C36570n) this.f173483g).getValue()).booleanValue()) {
            this.f173484h.add(gVar);
        } else {
            super.registerAdapterDataObserver(gVar);
        }
    }

    /* renamed from: u5 */
    public void mo82612u5(VH vh, int i, C60899a aVar) {
        C87412m.m108594g(vh, "holder");
        C87412m.m108594g(aVar, "info");
    }

    public void unregisterAdapterDataObserver(RecyclerView.C16615g gVar) {
        C87412m.m108594g(gVar, "observer");
        if (((Boolean) ((C36570n) this.f173483g).getValue()).booleanValue()) {
            this.f173484h.remove(gVar);
        } else {
            super.unregisterAdapterDataObserver(gVar);
        }
    }

    /* renamed from: w5 */
    public abstract void mo10426w5(VH vh, int i);

    /* renamed from: y5 */
    public abstract void mo82615y5(VH vh, int i, List<Object> list);

    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        C87412m.m108594g(vh, "holder");
        C87412m.m108594g(list, "payloads");
        try {
            if (list.isEmpty()) {
                mo82603X5(vh, false);
                super.onBindViewHolder(vh, i, list);
                return;
            }
            mo82603X5(vh, true);
            if (i < this.f173485i.size()) {
                C60899a aVar = this.f173485i.get(i);
                C87412m.m108593f(aVar, "headerInfoList[position]");
                mo82612u5(vh, i, aVar);
            } else if (i >= mo82597F4() + this.f173485i.size()) {
                C60899a aVar2 = this.f173486j.get(i - (this.f173485i.size() + mo82597F4()));
                C87412m.m108593f(aVar2, "footerInfoList[footerIndex]");
                mo82605g5(vh, i, aVar2);
            } else {
                mo82615y5(vh, i - this.f173485i.size(), list);
            }
        } catch (Exception e) {
            RuntimeException runtimeException = new RuntimeException(e.getMessage() + 10 + (mo10423l6(e, vh, i, list) + " crashActivity=" + vh.f44854d.getContext().getClass().getName()));
            runtimeException.setStackTrace(e.getStackTrace());
            throw runtimeException;
        }
    }
}
