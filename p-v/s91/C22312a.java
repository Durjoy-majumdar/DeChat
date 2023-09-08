package s91;

import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import i20.C21043a;
import j20.C21152b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import jq3.C60898l;
import o91.C100316i;
import t91.C22462f;
import t91.C22466j;
import t91.C36981l;

/* renamed from: s91.a */
public class C22312a implements C22462f {

    /* renamed from: a */
    public List<Pair<String, String>> f63266a;

    /* renamed from: b */
    public C100316i f63267b;

    /* renamed from: c */
    public WeakReference<C60898l> f63268c = null;

    /* renamed from: d */
    public C22354p f63269d;

    /* renamed from: e */
    public final C22315c f63270e = new C22315c((C22313a) null);

    /* renamed from: f */
    public final RecyclerView.C16615g f63271f = new C22313a();

    /* renamed from: g */
    public final C21152b f63272g = new C22314b();

    /* renamed from: s91.a$a */
    public class C22313a extends RecyclerView.C16615g {
        public C22313a() {
        }

        /* renamed from: b */
        public void mo2556b() {
            C22312a.m25910g(C22312a.this);
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            C22312a.m25910g(C22312a.this);
        }

        /* renamed from: d */
        public void mo2558d(int i, int i2, Object obj) {
            mo2557c(i, i2);
            C22312a.m25910g(C22312a.this);
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            C22312a.m25910g(C22312a.this);
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            C22312a.m25910g(C22312a.this);
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            C22312a.m25910g(C22312a.this);
        }
    }

    /* renamed from: s91.a$b */
    public class C22314b implements C21152b {
        public C22314b() {
        }

        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
            WeakReference<C60898l> weakReference;
            C60898l lVar;
            C60898l lVar2;
            if ((!str.equals("androidx/recyclerview/widget/RecyclerView") && !str.startsWith("com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI")) || C22312a.this.f63269d == null) {
                return;
            }
            if (str4.equals("smoothScrollToPosition") && "(I)V".equals(str5)) {
                WeakReference<C60898l> weakReference2 = C22312a.this.f63268c;
                if (weakReference2 != null && (lVar2 = weakReference2.get()) != null) {
                    C22312a.this.f63270e.f63275d = true;
                    lVar2.mo85797d6().post(C22312a.this.f63270e);
                }
            } else if (str4.equals("scrollToPosition") && "(I)V".equals(str5) && (weakReference = C22312a.this.f63268c) != null && (lVar = weakReference.get()) != null) {
                C22312a.this.f63270e.f63275d = true;
                lVar.mo85797d6().post(C22312a.this.f63270e);
            }
        }
    }

    /* renamed from: s91.a$c */
    public final class C22315c implements Runnable {

        /* renamed from: d */
        public boolean f63275d = false;

        public C22315c(C22313a aVar) {
        }

        public void run() {
            C22354p pVar = C22312a.this.f63269d;
            if (pVar != null) {
                pVar.mo35478a(this.f63275d);
            }
        }
    }

    /* renamed from: g */
    public static void m25910g(C22312a aVar) {
        C60898l lVar;
        WeakReference<C60898l> weakReference = aVar.f63268c;
        if (weakReference != null && (lVar = weakReference.get()) != null) {
            aVar.f63270e.f63275d = false;
            lVar.mo85797d6().post(aVar.f63270e);
        }
    }

    /* renamed from: a */
    public void mo35354a(String str, C36981l.C36982a aVar) {
        C60898l lVar;
        if (aVar != null) {
            List<?> list = aVar.f98071a;
            if (list == null || list.isEmpty()) {
                Log.m105928w("HABBYGE-MALI.FeedFlowCallback", "mRefreshEndListener, onRefreshEnd: incrementList is NULL");
                return;
            }
            Log.m105929w("HABBYGE-MALI.FeedFlowCallback", "mRefreshEndListener, onRefreshEnd: %s, %d", Integer.valueOf(aVar.f98073c), Integer.valueOf(list.size()));
            WeakReference<C60898l> weakReference = this.f63268c;
            if (weakReference != null && (lVar = weakReference.get()) != null) {
                this.f63270e.f63275d = false;
                lVar.mo85797d6().post(this.f63270e);
            }
        }
    }

    /* renamed from: b */
    public void mo35355b(String str, C36981l.C36982a aVar) {
        C60898l lVar;
        WeakReference<C60898l> weakReference = this.f63268c;
        if (weakReference != null && (lVar = weakReference.get()) != null) {
            this.f63270e.f63275d = false;
            lVar.mo85797d6().post(this.f63270e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.recyclerview.widget.RecyclerView$e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35356c(androidx.recyclerview.widget.RecyclerView r4, int r5) {
        /*
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r0 = r2
            goto L_0x000d
        L_0x000b:
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
        L_0x000d:
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            java.lang.ref.WeakReference<jq3.l> r0 = r3.f63268c
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r0.get()
            r2 = r0
            jq3.l r2 = (jq3.C60898l) r2
            if (r2 != 0) goto L_0x002f
        L_0x001d:
            androidx.recyclerview.widget.RecyclerView$e r0 = r4.getAdapter()
            boolean r1 = r0 instanceof jq3.C60898l
            if (r1 == 0) goto L_0x002f
            r2 = r0
            jq3.l r2 = (jq3.C60898l) r2
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.f63268c = r0
        L_0x002f:
            if (r2 == 0) goto L_0x003b
            androidx.recyclerview.widget.RecyclerView$g r0 = r3.f63271f
            r2.unregisterAdapterDataObserver(r0)
            androidx.recyclerview.widget.RecyclerView$g r0 = r3.f63271f
            r2.registerAdapterDataObserver(r0)
        L_0x003b:
            o91.i r0 = r3.f63267b
            if (r0 == 0) goto L_0x0042
            r0.mo35476a(r4, r5)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s91.C22312a.mo35356c(androidx.recyclerview.widget.RecyclerView, int):void");
    }

    /* renamed from: d */
    public void mo35357d() {
    }

    /* renamed from: e */
    public void mo35358e() {
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [androidx.recyclerview.widget.RecyclerView$e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35359f(androidx.recyclerview.widget.RecyclerView r12, int r13, int r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r12.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r2 = 0
            if (r1 != 0) goto L_0x000b
            r0 = r2
            goto L_0x000d
        L_0x000b:
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
        L_0x000d:
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r1 = -1
            int r3 = r0.mo16957C()     // Catch:{ Exception -> 0x001c }
            int r1 = r0.mo16959E()     // Catch:{ Exception -> 0x001a }
            goto L_0x001e
        L_0x001a:
            goto L_0x001e
        L_0x001c:
            r3 = -1
        L_0x001e:
            int r8 = r0.getItemCount()
            int r0 = r12.getChildCount()
            int r4 = r1 - r3
            int r4 = r4 + 1
            int r0 = java.lang.Math.min(r4, r0)
            java.lang.ref.WeakReference<jq3.l> r4 = r11.f63268c
            if (r4 == 0) goto L_0x003a
            java.lang.Object r2 = r4.get()
            jq3.l r2 = (jq3.C60898l) r2
            if (r2 != 0) goto L_0x004c
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView$e r4 = r12.getAdapter()
            boolean r5 = r4 instanceof jq3.C60898l
            if (r5 == 0) goto L_0x004c
            r2 = r4
            jq3.l r2 = (jq3.C60898l) r2
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r2)
            r11.f63268c = r4
        L_0x004c:
            r4 = 0
            if (r2 == 0) goto L_0x006b
            int r5 = r2.mo85796c6()
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r3, r4)
            int r5 = r2.mo85796c6()
            int r1 = r1 - r5
            int r1 = java.lang.Math.max(r1, r4)
            androidx.recyclerview.widget.RecyclerView$g r5 = r11.f63271f
            r2.unregisterAdapterDataObserver(r5)
            androidx.recyclerview.widget.RecyclerView$g r5 = r11.f63271f
            r2.registerAdapterDataObserver(r5)
        L_0x006b:
            r6 = r3
            int r1 = r1 - r6
            int r1 = r1 + 1
            int r0 = java.lang.Math.min(r1, r0)
            int r7 = java.lang.Math.max(r0, r4)
            o91.i r4 = r11.f63267b
            if (r4 == 0) goto L_0x0081
            r5 = r12
            r9 = r13
            r10 = r14
            r4.mo35477b(r5, r6, r7, r8, r9, r10)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s91.C22312a.mo35359f(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: h */
    public void mo35465h(C100316i iVar, C22354p pVar) {
        synchronized (C22466j.f63621a) {
            List<C22462f> list = C22466j.f63624d;
            if (!((ArrayList) list).contains(this)) {
                ((ArrayList) list).add(this);
            }
        }
        ArrayList arrayList = new ArrayList();
        this.f63266a = arrayList;
        arrayList.add(Pair.create("smoothScrollToPosition", "(I)V"));
        ((ArrayList) this.f63266a).add(Pair.create("scrollToPosition", "(I)V"));
        C21043a.m23197h().mo32755i(this.f63266a, this.f63272g);
        this.f63267b = iVar;
        this.f63269d = pVar;
    }

    /* renamed from: i */
    public void mo35466i() {
        C60898l lVar;
        synchronized (C22466j.f63621a) {
            ((ArrayList) C22466j.f63624d).remove(this);
        }
        this.f63267b = null;
        C21043a.m23197h().mo32761o(this.f63266a, this.f63272g);
        this.f63269d = null;
        WeakReference<C60898l> weakReference = this.f63268c;
        if (weakReference != null && (lVar = weakReference.get()) != null) {
            lVar.unregisterAdapterDataObserver(this.f63271f);
            this.f63268c.clear();
            this.f63268c = null;
        }
    }
}
