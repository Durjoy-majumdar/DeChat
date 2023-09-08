package com.tencent.p014mm.p136ui.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import en3.C97675c;
import en3.C97680h;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import p849e3.C107168a0;
import p849e3.C107207u;
import p849e3.C97601w;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C110823p;
import ux3.C65486b;
import y04.C112354s;
import y04.C15927t;

/* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension */
public final class DynamicViewCacheExtension extends RecyclerView.C16629x {

    /* renamed from: h */
    public static final HashMap<Integer, String> f56355h = new HashMap<>();

    /* renamed from: a */
    public final RecyclerView f56356a;

    /* renamed from: b */
    public final String f56357b = ("DynamicViewCacheEx@" + hashCode());

    /* renamed from: c */
    public boolean f56358c = BuildInfo.DEBUG;

    /* renamed from: d */
    public final int[] f56359d;

    /* renamed from: e */
    public final C19815e f56360e;

    /* renamed from: f */
    public final C97680h f56361f;

    /* renamed from: g */
    public final C19814d f56362g;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$RecycledViewPoolViewModel;", "Landroidx/lifecycle/i0;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$RecycledViewPoolViewModel */
    public static final class RecycledViewPoolViewModel extends C39622i0 {

        /* renamed from: d */
        public final C97680h f24719d = new C97680h();
    }

    /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$a */
    public static final class C19804a implements RecyclerView.C16626s {

        /* renamed from: a */
        public final /* synthetic */ DynamicViewCacheExtension f56363a;

        public C19804a(DynamicViewCacheExtension dynamicViewCacheExtension) {
            this.f56363a = dynamicViewCacheExtension;
        }

        /* renamed from: a */
        public final void mo17351a(RecyclerView.C16631z zVar) {
            C87412m.m108594g(zVar, "recycled");
            RecyclerView.C16631z zVar2 = (RecyclerView.C16631z) this.f56363a.f56360e.get(Integer.valueOf(zVar.mo17363j()));
            if (C87412m.m108589b(zVar2, zVar) || (zVar2 instanceof C19814d)) {
                this.f56363a.f56360e.remove(Integer.valueOf(zVar.mo17363j()));
            }
            DynamicViewCacheExtension dynamicViewCacheExtension = this.f56363a;
            View view = zVar.f44854d;
            C87412m.m108593f(view, "recycled.itemView");
            DynamicViewCacheExtension.m21510b(dynamicViewCacheExtension, view);
            DynamicViewCacheExtension dynamicViewCacheExtension2 = this.f56363a;
            View view2 = zVar.f44854d;
            C87412m.m108593f(view2, "recycled.itemView");
            dynamicViewCacheExtension2.mo26298d(view2, true);
            DynamicViewCacheExtension dynamicViewCacheExtension3 = this.f56363a;
            View view3 = zVar.f44854d;
            C87412m.m108593f(view3, "recycled.itemView");
            dynamicViewCacheExtension3.mo26299e(view3, true);
        }
    }

    /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$b */
    public static final class C19805b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ DynamicViewCacheExtension f56364d;

        /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$b$a */
        public static final class C19806a implements View.OnAttachStateChangeListener {

            /* renamed from: d */
            public final /* synthetic */ View f56365d;

            /* renamed from: e */
            public final /* synthetic */ DynamicViewCacheExtension f56366e;

            public C19806a(View view, DynamicViewCacheExtension dynamicViewCacheExtension) {
                this.f56365d = view;
                this.f56366e = dynamicViewCacheExtension;
            }

            public void onViewAttachedToWindow(View view) {
                C87412m.m108594g(view, "view");
                this.f56365d.removeOnAttachStateChangeListener(this);
                String str = this.f56366e.f56357b;
                Log.m105924i(str, "[doOnAttach] " + this.f56366e.f56356a.getContext());
                DynamicViewCacheExtension dynamicViewCacheExtension = this.f56366e;
                dynamicViewCacheExtension.f56356a.setRecycledViewPool(dynamicViewCacheExtension.f56361f);
                RecyclerView.LayoutManager layoutManager = this.f56366e.f56356a.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.setItemPrefetchEnabled(false);
                }
            }

            public void onViewDetachedFromWindow(View view) {
                C87412m.m108594g(view, "view");
            }
        }

        /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$b$b */
        public static final class C19807b implements View.OnAttachStateChangeListener {

            /* renamed from: d */
            public final /* synthetic */ View f56367d;

            /* renamed from: e */
            public final /* synthetic */ DynamicViewCacheExtension f56368e;

            public C19807b(View view, DynamicViewCacheExtension dynamicViewCacheExtension) {
                this.f56367d = view;
                this.f56368e = dynamicViewCacheExtension;
            }

            public void onViewAttachedToWindow(View view) {
                C87412m.m108594g(view, "view");
            }

            public void onViewDetachedFromWindow(View view) {
                int i;
                C87412m.m108594g(view, "view");
                this.f56367d.removeOnAttachStateChangeListener(this);
                Iterator<T> it = C97675c.m125884b(this.f56368e.f56356a).iterator();
                while (true) {
                    i = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    RecyclerView.C16631z zVar = (RecyclerView.C16631z) it.next();
                    DynamicViewCacheExtension dynamicViewCacheExtension = this.f56368e;
                    View view2 = zVar.f44854d;
                    C87412m.m108593f(view2, "it.itemView");
                    DynamicViewCacheExtension.m21510b(dynamicViewCacheExtension, view2);
                    DynamicViewCacheExtension dynamicViewCacheExtension2 = this.f56368e;
                    View view3 = zVar.f44854d;
                    C87412m.m108593f(view3, "it.itemView");
                    dynamicViewCacheExtension2.mo26298d(view3, true);
                }
                this.f56368e.f56360e.clear();
                int[] c = this.f56368e.mo26297c();
                int i2 = 0;
                int i3 = c[0];
                float f = ((float) i3) * 100.0f;
                int i4 = i3 + c[1];
                if (1 < i4) {
                    i = i4;
                }
                int b = C60641c.m70921b(f / ((float) i));
                String str = this.f56368e.f56357b;
                Log.m105924i(str, "[doOnDetach] " + C110823p.m150999Y(c) + " hitRate=" + b + '%');
                HashMap<Integer, String> hashMap = DynamicViewCacheExtension.f56355h;
                HashMap<Integer, String> hashMap2 = DynamicViewCacheExtension.f56355h;
                RecyclerView.C16613e adapter = this.f56368e.f56356a.getAdapter();
                if (adapter != null) {
                    i2 = adapter.hashCode();
                }
                hashMap2.remove(Integer.valueOf(i2));
            }
        }

        public C19805b(DynamicViewCacheExtension dynamicViewCacheExtension) {
            this.f56364d = dynamicViewCacheExtension;
        }

        public final void run() {
            int i;
            DynamicViewCacheExtension dynamicViewCacheExtension = this.f56364d;
            RecyclerView recyclerView = dynamicViewCacheExtension.f56356a;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            int i2 = 0;
            if (C107207u.C107211e.m145207b(recyclerView)) {
                String str = dynamicViewCacheExtension.f56357b;
                Log.m105924i(str, "[doOnAttach] " + dynamicViewCacheExtension.f56356a.getContext());
                dynamicViewCacheExtension.f56356a.setRecycledViewPool(dynamicViewCacheExtension.f56361f);
                RecyclerView.LayoutManager layoutManager = dynamicViewCacheExtension.f56356a.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.setItemPrefetchEnabled(false);
                }
            } else {
                recyclerView.addOnAttachStateChangeListener(new C19806a(recyclerView, dynamicViewCacheExtension));
            }
            DynamicViewCacheExtension dynamicViewCacheExtension2 = this.f56364d;
            RecyclerView recyclerView2 = dynamicViewCacheExtension2.f56356a;
            if (!C107207u.C107211e.m145207b(recyclerView2)) {
                Iterator<RecyclerView.C16631z> it = C97675c.m125884b(dynamicViewCacheExtension2.f56356a).iterator();
                while (true) {
                    i = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    RecyclerView.C16631z next = it.next();
                    View view = next.f44854d;
                    C87412m.m108593f(view, "it.itemView");
                    DynamicViewCacheExtension.m21510b(dynamicViewCacheExtension2, view);
                    View view2 = next.f44854d;
                    C87412m.m108593f(view2, "it.itemView");
                    dynamicViewCacheExtension2.mo26298d(view2, true);
                }
                dynamicViewCacheExtension2.f56360e.clear();
                int[] c = dynamicViewCacheExtension2.mo26297c();
                int i3 = c[0];
                float f = ((float) i3) * 100.0f;
                int i4 = i3 + c[1];
                if (1 < i4) {
                    i = i4;
                }
                int b = C60641c.m70921b(f / ((float) i));
                String str2 = dynamicViewCacheExtension2.f56357b;
                Log.m105924i(str2, "[doOnDetach] " + C110823p.m150999Y(c) + " hitRate=" + b + '%');
                HashMap<Integer, String> hashMap = DynamicViewCacheExtension.f56355h;
                RecyclerView.C16613e adapter = dynamicViewCacheExtension2.f56356a.getAdapter();
                if (adapter != null) {
                    i2 = adapter.hashCode();
                }
                hashMap.remove(Integer.valueOf(i2));
                return;
            }
            recyclerView2.addOnAttachStateChangeListener(new C19807b(recyclerView2, dynamicViewCacheExtension2));
        }
    }

    /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c */
    public static final class C19808c {

        /* renamed from: a */
        public final String f56369a;

        /* renamed from: b */
        public final int f56370b;

        /* renamed from: c */
        public final int f56371c;

        /* renamed from: d */
        public final C19815e f56372d;

        /* renamed from: e */
        public final boolean f56373e;

        /* renamed from: f */
        public final MMHandler f56374f;

        /* renamed from: g */
        public final int[] f56375g;

        /* renamed from: h */
        public RecyclerView f56376h;

        /* renamed from: i */
        public final C13601g f56377i = C36568h.m40985a(new C19811c(this));

        /* renamed from: j */
        public final C19810b f56378j = new C19810b(this);

        /* renamed from: k */
        public final C19812d f56379k = new C19812d(this);

        /* renamed from: l */
        public C19809a f56380l;

        /* renamed from: m */
        public final AtomicLong f56381m = new AtomicLong(0);

        /* renamed from: n */
        public final AtomicLong f56382n = new AtomicLong(0);

        /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c$a */
        public final class C19809a implements Runnable {

            /* renamed from: d */
            public final RecyclerView.C16625r f56383d;

            /* renamed from: e */
            public final ArrayList<Integer> f56384e;

            /* renamed from: f */
            public final int f56385f;

            /* renamed from: g */
            public final boolean f56386g;

            /* renamed from: h */
            public final String f56387h;

            /* renamed from: i */
            public final long f56388i;

            /* renamed from: j */
            public final AtomicLong f56389j;

            /* renamed from: n */
            public final AtomicBoolean f56390n;

            /* renamed from: o */
            public final /* synthetic */ C19808c f56391o;

            public C19809a(C19808c cVar, RecyclerView.C16625r rVar, ArrayList arrayList, int i, boolean z, String str, long j, AtomicLong atomicLong, AtomicBoolean atomicBoolean, int i2, C8480h hVar) {
                atomicBoolean = (i2 & 128) != 0 ? new AtomicBoolean() : atomicBoolean;
                C87412m.m108594g(rVar, "recycler");
                C87412m.m108594g(arrayList, "window");
                C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
                C87412m.m108594g(atomicLong, "validToken");
                C87412m.m108594g(atomicBoolean, "cancelTag");
                this.f56391o = cVar;
                this.f56383d = rVar;
                this.f56384e = arrayList;
                this.f56385f = i;
                this.f56386g = z;
                this.f56387h = str;
                this.f56388i = j;
                this.f56389j = atomicLong;
                this.f56390n = atomicBoolean;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
                r0 = r2.f56369a;
                r10 = new java.lang.StringBuilder();
                r10.append("[asyncBind] expired! position=");
                r10.append(r5);
                r10.append(" token=");
                r10.append(r7);
                r10.append(" validToken=");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x0085, code lost:
                r20 = r12;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
                r10.append(r9.get());
                r10.append(" source=");
                r10.append(r6);
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10.toString());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x019d, code lost:
                r0 = th;
             */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x01ba  */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x01ee  */
            /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r26 = this;
                    r1 = r26
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c r2 = r1.f56391o
                    androidx.recyclerview.widget.RecyclerView$r r0 = r1.f56383d
                    java.util.ArrayList<java.lang.Integer> r3 = r1.f56384e
                    int r4 = r1.f56385f
                    boolean r5 = r1.f56386g
                    java.lang.String r6 = r1.f56387h
                    long r7 = r1.f56388i
                    java.util.concurrent.atomic.AtomicLong r9 = r1.f56389j
                    java.util.concurrent.atomic.AtomicBoolean r10 = r1.f56390n
                    r2.getClass()
                    java.lang.String r11 = " token="
                    long r12 = java.lang.System.currentTimeMillis()
                    java.lang.String r14 = r2.f56369a
                    java.lang.StringBuilder r15 = new java.lang.StringBuilder
                    r15.<init>()
                    java.lang.String r1 = "[asyncBind] begin... token="
                    r15.append(r1)
                    r15.append(r7)
                    java.lang.String r1 = " validToken="
                    r15.append(r1)
                    r16 = r4
                    r17 = r5
                    long r4 = r9.get()
                    r15.append(r4)
                    java.lang.String r4 = " source="
                    r15.append(r4)
                    r15.append(r6)
                    java.lang.String r5 = r15.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
                    r5 = -1
                    r15 = 0
                    kotlin.Result$Companion r18 = kotlin.Result.Companion     // Catch:{ all -> 0x01a3 }
                    java.util.Iterator r18 = r3.iterator()     // Catch:{ all -> 0x01a3 }
                    r19 = 0
                L_0x0055:
                    boolean r20 = r18.hasNext()     // Catch:{ all -> 0x019f }
                    if (r20 == 0) goto L_0x0194
                    java.lang.Object r20 = r18.next()     // Catch:{ all -> 0x019f }
                    java.lang.Number r20 = (java.lang.Number) r20     // Catch:{ all -> 0x019f }
                    int r5 = r20.intValue()     // Catch:{ all -> 0x019f }
                    long r20 = r9.get()     // Catch:{ all -> 0x019f }
                    java.lang.String r14 = "[asyncBind] expired! position="
                    int r22 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
                    if (r22 == 0) goto L_0x009d
                    java.lang.String r0 = r2.f56369a     // Catch:{ all -> 0x019f }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
                    r10.<init>()     // Catch:{ all -> 0x019f }
                    r10.append(r14)     // Catch:{ all -> 0x019f }
                    r10.append(r5)     // Catch:{ all -> 0x019f }
                    r10.append(r11)     // Catch:{ all -> 0x019f }
                    r10.append(r7)     // Catch:{ all -> 0x019f }
                    r10.append(r1)     // Catch:{ all -> 0x019f }
                    r20 = r12
                    long r12 = r9.get()     // Catch:{ all -> 0x019d }
                    r10.append(r12)     // Catch:{ all -> 0x019d }
                    r10.append(r4)     // Catch:{ all -> 0x019d }
                    r10.append(r6)     // Catch:{ all -> 0x019d }
                    java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x019d }
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10)     // Catch:{ all -> 0x019d }
                    goto L_0x0196
                L_0x009d:
                    r20 = r12
                    boolean r12 = r10.get()     // Catch:{ all -> 0x019d }
                    if (r12 == 0) goto L_0x00d3
                    java.lang.String r0 = r2.f56369a     // Catch:{ all -> 0x019d }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x019d }
                    r10.<init>()     // Catch:{ all -> 0x019d }
                    java.lang.String r12 = "[asyncBind] cancel! position="
                    r10.append(r12)     // Catch:{ all -> 0x019d }
                    r10.append(r5)     // Catch:{ all -> 0x019d }
                    r10.append(r11)     // Catch:{ all -> 0x019d }
                    r10.append(r7)     // Catch:{ all -> 0x019d }
                    r10.append(r1)     // Catch:{ all -> 0x019d }
                    long r12 = r9.get()     // Catch:{ all -> 0x019d }
                    r10.append(r12)     // Catch:{ all -> 0x019d }
                    r10.append(r4)     // Catch:{ all -> 0x019d }
                    r10.append(r6)     // Catch:{ all -> 0x019d }
                    java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x019d }
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10)     // Catch:{ all -> 0x019d }
                    goto L_0x0196
                L_0x00d3:
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r12 = r2.f56372d     // Catch:{ all -> 0x019d }
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019d }
                    java.lang.Object r12 = r12.get(r13)     // Catch:{ all -> 0x019d }
                    if (r12 != 0) goto L_0x0188
                    androidx.recyclerview.widget.RecyclerView$z r12 = r2.mo26306d(r0, r5)     // Catch:{ all -> 0x019d }
                    if (r12 != 0) goto L_0x00e9
                    r12 = r20
                    goto L_0x0055
                L_0x00e9:
                    rx3.g r13 = en3.C97675c.f286485a     // Catch:{ all -> 0x019d }
                    java.lang.Class<androidx.recyclerview.widget.RecyclerView$z> r13 = androidx.recyclerview.widget.RecyclerView.C16631z.class
                    r22 = r0
                    java.lang.String r0 = "o"
                    r23 = r10
                    java.lang.Class[] r10 = new java.lang.Class[r15]     // Catch:{ all -> 0x019d }
                    java.lang.reflect.Method r0 = r13.getDeclaredMethod(r0, r10)     // Catch:{ all -> 0x019d }
                    r10 = 1
                    r0.setAccessible(r10)     // Catch:{ all -> 0x019d }
                    java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch:{ all -> 0x019d }
                    java.lang.Object r0 = r0.invoke(r12, r10)     // Catch:{ all -> 0x019d }
                    java.lang.String r10 = "null cannot be cast to non-null type kotlin.Boolean"
                    gy3.C87412m.m108592e(r0, r10)     // Catch:{ all -> 0x019d }
                    java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x019d }
                    boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x019d }
                    if (r0 != 0) goto L_0x0119
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r0 = r2.f56372d     // Catch:{ all -> 0x019d }
                    java.lang.String r10 = "unBound"
                    r0.mo26309a(r12, r10)     // Catch:{ all -> 0x019d }
                    goto L_0x016f
                L_0x0119:
                    long r24 = r9.get()     // Catch:{ all -> 0x019d }
                    int r0 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
                    if (r0 != 0) goto L_0x0145
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r0 = r2.f56372d     // Catch:{ all -> 0x019d }
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019d }
                    java.lang.Object r0 = r0.put(r10, r12)     // Catch:{ all -> 0x019d }
                    androidx.recyclerview.widget.RecyclerView$z r0 = (androidx.recyclerview.widget.RecyclerView.C16631z) r0     // Catch:{ all -> 0x019d }
                    boolean r0 = r0 instanceof com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.C19814d     // Catch:{ all -> 0x019d }
                    if (r0 == 0) goto L_0x0142
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r0 = r2.f56372d     // Catch:{ all -> 0x019d }
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019d }
                    r0.remove(r10)     // Catch:{ all -> 0x019d }
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r0 = r2.f56372d     // Catch:{ all -> 0x019d }
                    java.lang.String r10 = "MarkRecycleAsyncResult"
                    r0.mo26309a(r12, r10)     // Catch:{ all -> 0x019d }
                    goto L_0x016f
                L_0x0142:
                    int r19 = r19 + 1
                    goto L_0x016f
                L_0x0145:
                    java.lang.String r0 = r2.f56369a     // Catch:{ all -> 0x019d }
                    java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x019d }
                    r10.<init>()     // Catch:{ all -> 0x019d }
                    r10.append(r14)     // Catch:{ all -> 0x019d }
                    r10.append(r5)     // Catch:{ all -> 0x019d }
                    r10.append(r11)     // Catch:{ all -> 0x019d }
                    r10.append(r7)     // Catch:{ all -> 0x019d }
                    r10.append(r1)     // Catch:{ all -> 0x019d }
                    long r13 = r9.get()     // Catch:{ all -> 0x019d }
                    r10.append(r13)     // Catch:{ all -> 0x019d }
                    r10.append(r4)     // Catch:{ all -> 0x019d }
                    r10.append(r6)     // Catch:{ all -> 0x019d }
                    java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x019d }
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r10)     // Catch:{ all -> 0x019d }
                L_0x016f:
                    long r13 = r9.get()     // Catch:{ all -> 0x019d }
                    int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                    if (r0 == 0) goto L_0x018c
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r0 = r2.f56372d     // Catch:{ all -> 0x019d }
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x019d }
                    r0.remove(r10)     // Catch:{ all -> 0x019d }
                    com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r0 = r2.f56372d     // Catch:{ all -> 0x019d }
                    java.lang.String r10 = "expired fallback."
                    r0.mo26309a(r12, r10)     // Catch:{ all -> 0x019d }
                    goto L_0x018c
                L_0x0188:
                    r22 = r0
                    r23 = r10
                L_0x018c:
                    r12 = r20
                    r0 = r22
                    r10 = r23
                    goto L_0x0055
                L_0x0194:
                    r20 = r12
                L_0x0196:
                    rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x019d }
                    java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x019d }
                    goto L_0x01b2
                L_0x019d:
                    r0 = move-exception
                    goto L_0x01a8
                L_0x019f:
                    r0 = move-exception
                    r20 = r12
                    goto L_0x01a8
                L_0x01a3:
                    r0 = move-exception
                    r20 = r12
                    r19 = 0
                L_0x01a8:
                    kotlin.Result$Companion r10 = kotlin.Result.Companion
                    java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                    java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
                L_0x01b2:
                    r10 = r19
                    java.lang.Throwable r12 = kotlin.Result.m168117exceptionOrNullimpl(r0)
                    if (r12 == 0) goto L_0x01e8
                    java.lang.String r13 = r2.f56369a
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r15 = "curPosition="
                    r14.append(r15)
                    r14.append(r5)
                    r14.append(r11)
                    r14.append(r7)
                    r14.append(r4)
                    r14.append(r6)
                    java.lang.String r5 = r14.toString()
                    r11 = 0
                    java.lang.Object[] r11 = new java.lang.Object[r11]
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r12, r5, r11)
                    int[] r5 = r2.f56375g
                    r11 = 2
                    r12 = r5[r11]
                    r13 = 1
                    int r12 = r12 + r13
                    r5[r11] = r12
                L_0x01e8:
                    boolean r5 = kotlin.Result.m168121isSuccessimpl(r0)
                    if (r5 == 0) goto L_0x0251
                    rx3.b0 r0 = (rx3.C13598b0) r0
                    long r11 = java.lang.System.currentTimeMillis()
                    long r11 = r11 - r20
                    java.lang.String r0 = r2.f56369a
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "[asyncBind] Cost="
                    r2.append(r5)
                    r2.append(r11)
                    java.lang.String r5 = "ms token="
                    r2.append(r5)
                    r2.append(r7)
                    r2.append(r1)
                    long r7 = r9.get()
                    r2.append(r7)
                    java.lang.String r1 = " window=("
                    r2.append(r1)
                    if (r17 == 0) goto L_0x0222
                    java.lang.String r1 = "↓"
                    goto L_0x0225
                L_0x0222:
                    java.lang.String r1 = "↑"
                L_0x0225:
                    r2.append(r1)
                    java.lang.String r1 = "|+"
                    r2.append(r1)
                    r2.append(r10)
                    java.lang.String r1 = "|-"
                    r2.append(r1)
                    r1 = r16
                    r2.append(r1)
                    r1 = 41
                    r2.append(r1)
                    r2.append(r3)
                    r2.append(r4)
                    r2.append(r6)
                    java.lang.String r1 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                L_0x0251:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.C19808c.C19809a.run():void");
            }
        }

        /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c$b */
        public static final class C19810b extends RecyclerView.C16615g {

            /* renamed from: a */
            public final /* synthetic */ C19808c f56392a;

            public C19810b(C19808c cVar) {
                this.f56392a = cVar;
            }

            /* renamed from: b */
            public void mo2556b() {
                C19808c.m21516a(this.f56392a);
                Collection<RecyclerView.C16631z> values = this.f56392a.f56372d.values();
                C87412m.m108593f(values, "boundCaches.values");
                C19808c cVar = this.f56392a;
                for (RecyclerView.C16631z a : values) {
                    cVar.f56372d.mo26309a(a, "onChanged");
                }
                this.f56392a.f56372d.clear();
                C19808c.m21517b(this.f56392a, true, "onChanged", 0, 4, (Object) null);
            }

            /* renamed from: c */
            public void mo2557c(int i, int i2) {
                C19808c.m21516a(this.f56392a);
                int i3 = i + i2;
                for (int i4 = i; i4 < i3; i4++) {
                    C19815e eVar = this.f56392a.f56372d;
                    eVar.mo26309a((RecyclerView.C16631z) this.f56392a.f56372d.remove(Integer.valueOf(i4)), "onItemRangeChanged(" + i + '-' + i2 + ')');
                }
                C19808c cVar = this.f56392a;
                C19808c.m21517b(cVar, true, "onItemRangeChanged(" + i + '-' + i2 + ')', 0, 4, (Object) null);
            }

            /* renamed from: e */
            public void mo2559e(int i, int i2) {
                C19808c.m21516a(this.f56392a);
                Collection<RecyclerView.C16631z> values = this.f56392a.f56372d.values();
                C87412m.m108593f(values, "boundCaches.values");
                C19808c cVar = this.f56392a;
                for (RecyclerView.C16631z a : values) {
                    cVar.f56372d.mo26309a(a, "onItemRangeInserted");
                }
                this.f56392a.f56372d.clear();
                C19808c cVar2 = this.f56392a;
                C19808c.m21517b(cVar2, true, "onItemRangeInserted(" + i + '-' + i2 + ')', 0, 4, (Object) null);
            }

            /* renamed from: f */
            public void mo17312f(int i, int i2, int i3) {
                C19808c.m21516a(this.f56392a);
                Collection<RecyclerView.C16631z> values = this.f56392a.f56372d.values();
                C87412m.m108593f(values, "boundCaches.values");
                C19808c cVar = this.f56392a;
                for (RecyclerView.C16631z a : values) {
                    cVar.f56372d.mo26309a(a, "onItemRangeMoved");
                }
                this.f56392a.f56372d.clear();
                C19808c cVar2 = this.f56392a;
                C19808c.m21517b(cVar2, true, "onItemRangeMoved(" + i + '-' + i2 + '-' + i3 + ')', 0, 4, (Object) null);
            }

            /* renamed from: g */
            public void mo2560g(int i, int i2) {
                C19808c.m21516a(this.f56392a);
                Collection<RecyclerView.C16631z> values = this.f56392a.f56372d.values();
                C87412m.m108593f(values, "boundCaches.values");
                C19808c cVar = this.f56392a;
                for (RecyclerView.C16631z a : values) {
                    cVar.f56372d.mo26309a(a, "onItemRangeRemoved");
                }
                this.f56392a.f56372d.clear();
                C19808c cVar2 = this.f56392a;
                C19808c.m21517b(cVar2, true, "onItemRangeRemoved(" + i + '-' + i2 + ')', 0, 4, (Object) null);
            }
        }

        /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c$c */
        public static final class C19811c extends C87413o implements C32224a<RecyclerView.C16625r> {

            /* renamed from: d */
            public final /* synthetic */ C19808c f56393d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19811c(C19808c cVar) {
                super(0);
                this.f56393d = cVar;
            }

            public Object invoke() {
                RecyclerView recyclerView = this.f56393d.f56376h;
                if (recyclerView != null) {
                    return C97675c.m125883a(recyclerView);
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c$d */
        public static final class C19812d extends RecyclerView.C0130p {

            /* renamed from: d */
            public int f56394d;

            /* renamed from: e */
            public int f56395e;

            /* renamed from: f */
            public final /* synthetic */ C19808c f56396f;

            /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c$d$a */
            public static final class C19813a<T> implements Comparator {
                public final int compare(T t, T t2) {
                    return C65486b.m77169a(Integer.valueOf(((View) t).getHeight()), Integer.valueOf(((View) t2).getHeight()));
                }
            }

            public C19812d(C19808c cVar) {
                this.f56396f = cVar;
            }

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(recyclerView);
                arrayList.add(Integer.valueOf(i));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
                super.onScrollStateChanged(recyclerView, i);
                C117292a.m165361g(this, "com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(recyclerView);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(i2));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
                C87412m.m108594g(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i2);
                this.f56394d += i2;
                if (this.f56395e == 0) {
                    int i3 = 20;
                    View view = (View) C112354s.m153288k(new C15927t(new C97601w(recyclerView), new C19813a()));
                    int height = view != null ? view.getHeight() : 0;
                    if (20 < height) {
                        i3 = height;
                    }
                    this.f56395e = i3;
                }
                if (Math.abs(this.f56394d) >= this.f56395e) {
                    C19808c.m21517b(this.f56396f, i2 > 0, "onScrolled", 0, 4, (Object) null);
                    this.f56394d = 0;
                }
                C117292a.m165361g(this, "com/tencent/mm/ui/recyclerview/DynamicViewCacheExtension$AsyncBindWorker$scrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            }
        }

        public C19808c(String str, int i, int i2, C19815e eVar, boolean z, MMHandler mMHandler, int[] iArr) {
            C87412m.m108594g(str, "TAG");
            C87412m.m108594g(eVar, "boundCaches");
            C87412m.m108594g(mMHandler, "handler");
            C87412m.m108594g(iArr, "records");
            this.f56369a = str;
            this.f56370b = i;
            this.f56371c = i2;
            this.f56372d = eVar;
            this.f56373e = z;
            this.f56374f = mMHandler;
            this.f56375g = iArr;
        }

        /* renamed from: a */
        public static final void m21516a(C19808c cVar) {
            cVar.f56381m.set(cVar.f56382n.incrementAndGet());
        }

        /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00dc  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m21517b(com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.C19808c r17, boolean r18, java.lang.String r19, long r20, int r22, java.lang.Object r23) {
            /*
                r13 = r17
                r6 = r19
                r0 = r22 & 4
                if (r0 == 0) goto L_0x0010
                java.util.concurrent.atomic.AtomicLong r0 = r13.f56381m
                long r0 = r0.get()
                r7 = r0
                goto L_0x0012
            L_0x0010:
                r7 = r20
            L_0x0012:
                java.lang.String r0 = r13.f56369a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[calculateAsyncBind] update valid token="
                r1.append(r2)
                r1.append(r7)
                java.lang.String r2 = " source="
                r1.append(r2)
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                androidx.recyclerview.widget.RecyclerView r0 = r13.f56376h
                java.lang.String r1 = "recyclerView"
                r14 = 0
                if (r0 == 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
                if (r0 == 0) goto L_0x0042
                int r0 = r0.getItemCount()
                goto L_0x0043
            L_0x0042:
                r0 = 0
            L_0x0043:
                if (r0 > 0) goto L_0x0047
                goto L_0x0216
            L_0x0047:
                androidx.recyclerview.widget.RecyclerView r3 = r13.f56376h
                if (r3 == 0) goto L_0x0217
                java.util.ArrayList r3 = en3.C97675c.m125884b(r3)
                int r1 = r13.f56371c
                java.lang.String r4 = "setAdapter"
                boolean r4 = gy3.C87412m.m108589b(r6, r4)
                if (r4 == 0) goto L_0x005c
                int r1 = r13.f56370b
            L_0x005c:
                r4 = r1
                java.util.Iterator r5 = r3.iterator()
                boolean r1 = r5.hasNext()
                if (r1 != 0) goto L_0x0069
                r1 = r14
                goto L_0x0090
            L_0x0069:
                java.lang.Object r1 = r5.next()
                boolean r9 = r5.hasNext()
                if (r9 != 0) goto L_0x0074
                goto L_0x0090
            L_0x0074:
                r9 = r1
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C16631z) r9
                int r9 = r9.mo17363j()
            L_0x007b:
                java.lang.Object r10 = r5.next()
                r11 = r10
                androidx.recyclerview.widget.RecyclerView$z r11 = (androidx.recyclerview.widget.RecyclerView.C16631z) r11
                int r11 = r11.mo17363j()
                if (r9 <= r11) goto L_0x008a
                r1 = r10
                r9 = r11
            L_0x008a:
                boolean r10 = r5.hasNext()
                if (r10 != 0) goto L_0x007b
            L_0x0090:
                androidx.recyclerview.widget.RecyclerView$z r1 = (androidx.recyclerview.widget.RecyclerView.C16631z) r1
                if (r1 == 0) goto L_0x0099
                int r1 = r1.mo17363j()
                goto L_0x009f
            L_0x0099:
                int r1 = r0 + -1
                if (r1 <= r4) goto L_0x009f
                r10 = r4
                goto L_0x00a0
            L_0x009f:
                r10 = r1
            L_0x00a0:
                java.util.Iterator r11 = r3.iterator()
                boolean r1 = r11.hasNext()
                if (r1 != 0) goto L_0x00ac
                r1 = r14
                goto L_0x00d3
            L_0x00ac:
                java.lang.Object r1 = r11.next()
                boolean r3 = r11.hasNext()
                if (r3 != 0) goto L_0x00b7
                goto L_0x00d3
            L_0x00b7:
                r3 = r1
                androidx.recyclerview.widget.RecyclerView$z r3 = (androidx.recyclerview.widget.RecyclerView.C16631z) r3
                int r3 = r3.mo17363j()
            L_0x00be:
                java.lang.Object r5 = r11.next()
                r9 = r5
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.C16631z) r9
                int r9 = r9.mo17363j()
                if (r3 >= r9) goto L_0x00cd
                r1 = r5
                r3 = r9
            L_0x00cd:
                boolean r5 = r11.hasNext()
                if (r5 != 0) goto L_0x00be
            L_0x00d3:
                androidx.recyclerview.widget.RecyclerView$z r1 = (androidx.recyclerview.widget.RecyclerView.C16631z) r1
                if (r1 == 0) goto L_0x00dc
                int r1 = r1.mo17363j()
                goto L_0x00e1
            L_0x00dc:
                int r1 = r0 + -1
                if (r1 <= r4) goto L_0x00e1
                r1 = r4
            L_0x00e1:
                if (r4 <= 0) goto L_0x0216
                if (r18 == 0) goto L_0x00e8
                int r3 = r4 * 3
                goto L_0x00ea
            L_0x00e8:
                int r3 = r4 * 1
            L_0x00ea:
                int r3 = r3 / 4
                if (r18 == 0) goto L_0x00f1
                int r5 = r4 * 1
                goto L_0x00f3
            L_0x00f1:
                int r5 = r4 * 3
            L_0x00f3:
                int r5 = r5 / 4
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>(r4)
                if (r18 == 0) goto L_0x011b
                int r11 = r1 + 1
                int r12 = r0 + -1
                if (r11 <= r12) goto L_0x0103
                r11 = r12
            L_0x0103:
                int r15 = r1 + r3
                if (r15 <= r12) goto L_0x0108
                goto L_0x0109
            L_0x0108:
                r12 = r15
            L_0x0109:
                int r12 = java.lang.Math.max(r11, r12)
                android.util.Range r15 = new android.util.Range
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r15.<init>(r11, r12)
                goto L_0x0138
            L_0x011b:
                int r11 = r10 - r5
                if (r11 <= 0) goto L_0x0120
                goto L_0x0121
            L_0x0120:
                r11 = 0
            L_0x0121:
                int r12 = r10 + -1
                if (r12 <= 0) goto L_0x0126
                goto L_0x0127
            L_0x0126:
                r12 = 0
            L_0x0127:
                int r12 = java.lang.Math.max(r11, r12)
                android.util.Range r15 = new android.util.Range
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r15.<init>(r11, r12)
            L_0x0138:
                r11 = -1
                r12 = 1
                if (r18 == 0) goto L_0x013e
                r2 = 1
                goto L_0x013f
            L_0x013e:
                r2 = -1
            L_0x013f:
                r13.mo26305c(r15, r2, r9)
                if (r4 <= r12) goto L_0x0188
                if (r18 == 0) goto L_0x0164
                int r0 = r10 - r5
                if (r0 <= 0) goto L_0x014b
                goto L_0x014c
            L_0x014b:
                r0 = 0
            L_0x014c:
                int r10 = r10 - r12
                if (r10 <= 0) goto L_0x0151
                r2 = r10
                goto L_0x0152
            L_0x0151:
                r2 = 0
            L_0x0152:
                int r1 = java.lang.Math.max(r0, r2)
                android.util.Range r2 = new android.util.Range
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2.<init>(r0, r1)
                goto L_0x0181
            L_0x0164:
                int r2 = r1 + 1
                int r0 = r0 - r12
                if (r2 <= r0) goto L_0x016a
                r2 = r0
            L_0x016a:
                int r1 = r1 + r3
                if (r1 <= r0) goto L_0x016e
                goto L_0x016f
            L_0x016e:
                r0 = r1
            L_0x016f:
                int r0 = java.lang.Math.max(r2, r0)
                android.util.Range r1 = new android.util.Range
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r1.<init>(r2, r0)
                r2 = r1
            L_0x0181:
                if (r18 == 0) goto L_0x0184
                goto L_0x0185
            L_0x0184:
                r11 = 1
            L_0x0185:
                r13.mo26305c(r2, r11, r9)
            L_0x0188:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r1 = r13.f56372d
                java.util.Collection r1 = r1.values()
                int r1 = r1.size()
                com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r2 = r13.f56372d
                java.util.Collection r2 = r2.values()
                java.lang.String r3 = "boundCaches.values"
                gy3.C87412m.m108593f(r2, r3)
                java.util.Iterator r2 = r2.iterator()
            L_0x01a6:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x01d0
                java.lang.Object r3 = r2.next()
                androidx.recyclerview.widget.RecyclerView$z r3 = (androidx.recyclerview.widget.RecyclerView.C16631z) r3
                int r4 = r3.mo17363j()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                boolean r5 = r9.contains(r5)
                if (r5 == 0) goto L_0x01c8
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0.put(r4, r3)
                goto L_0x01a6
            L_0x01c8:
                com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r4 = r13.f56372d
                java.lang.String r5 = "clearCacheOutWindow"
                r4.mo26309a(r3, r5)
                goto L_0x01a6
            L_0x01d0:
                com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r2 = r13.f56372d
                r2.clear()
                com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r2 = r13.f56372d
                r2.putAll(r0)
                com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r0 = r13.f56372d
                java.util.Collection r0 = r0.values()
                int r0 = r0.size()
                int r4 = r1 - r0
                com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c$a r15 = new com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c$a
                rx3.g r0 = r13.f56377i
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                r2 = r0
                androidx.recyclerview.widget.RecyclerView$r r2 = (androidx.recyclerview.widget.RecyclerView.C16625r) r2
                java.util.concurrent.atomic.AtomicLong r10 = r13.f56381m
                r11 = 0
                r12 = 128(0x80, float:1.794E-43)
                r16 = 0
                r0 = r15
                r1 = r17
                r3 = r9
                r5 = r18
                r6 = r19
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r13.f56374f
                r0.removeCallbacksAndMessages(r14)
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r13.f56374f
                r0.postAtFrontOfQueue(r15)
                r13.f56380l = r15
            L_0x0216:
                return
            L_0x0217:
                gy3.C87412m.m108603p(r1)
                throw r14
            L_0x021b:
                gy3.C87412m.m108603p(r1)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.C19808c.m21517b(com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$c, boolean, java.lang.String, long, int, java.lang.Object):void");
        }

        /* JADX WARNING: type inference failed for: r3v0, types: [android.util.Range<java.lang.Integer>, android.util.Range] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo26305c(android.util.Range<java.lang.Integer> r3, int r4, java.util.ArrayList<java.lang.Integer> r5) {
            /*
                r2 = this;
                if (r4 <= 0) goto L_0x0007
                java.lang.Comparable r0 = r3.getLower()
                goto L_0x000b
            L_0x0007:
                java.lang.Comparable r0 = r3.getUpper()
            L_0x000b:
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r4 <= 0) goto L_0x0014
                java.lang.Comparable r3 = r3.getUpper()
                goto L_0x0018
            L_0x0014:
                java.lang.Comparable r3 = r3.getLower()
            L_0x0018:
                java.lang.Integer r3 = (java.lang.Integer) r3
                java.lang.String r1 = "begin"
                gy3.C87412m.m108593f(r0, r1)
                int r0 = r0.intValue()
                java.lang.String r1 = "end"
                gy3.C87412m.m108593f(r3, r1)
                int r3 = r3.intValue()
                if (r4 == 0) goto L_0x0052
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r4 == r1) goto L_0x004a
                int r3 = zx3.C66986c.m79137a(r0, r3, r4)
                if (r4 <= 0) goto L_0x003a
                if (r0 <= r3) goto L_0x003e
            L_0x003a:
                if (r4 >= 0) goto L_0x0049
                if (r3 > r0) goto L_0x0049
            L_0x003e:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                r5.add(r1)
                if (r0 == r3) goto L_0x0049
                int r0 = r0 + r4
                goto L_0x003e
            L_0x0049:
                return
            L_0x004a:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
                r3.<init>(r4)
                throw r3
            L_0x0052:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Step must be non-zero."
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.C19808c.mo26305c(android.util.Range, int, java.util.ArrayList):void");
        }

        /* renamed from: d */
        public final RecyclerView.C16631z mo26306d(RecyclerView.C16625r rVar, int i) {
            RecyclerView.LayoutParams layoutParams;
            RecyclerView recyclerView = this.f56376h;
            if (recyclerView != null) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                if (adapter == null || i < 0 || this.f56372d.values().size() >= this.f56371c) {
                    return null;
                }
                int itemViewType = adapter.getItemViewType(i);
                RecyclerView recyclerView2 = this.f56376h;
                if (recyclerView2 != null) {
                    RecyclerView.C16631z b = recyclerView2.getRecycledViewPool().mo10383b(itemViewType);
                    if (b == null) {
                        RecyclerView recyclerView3 = this.f56376h;
                        if (recyclerView3 != null) {
                            b = adapter.createViewHolder(recyclerView3, itemViewType);
                        } else {
                            C87412m.m108603p("recyclerView");
                            throw null;
                        }
                    }
                    C87412m.m108593f(b, "recyclerView.recycledVie…r(recyclerView, viewType)");
                    ViewGroup.LayoutParams layoutParams2 = b.f44854d.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams2 = new RecyclerView.LayoutParams(-2, -2);
                    }
                    b.f44854d.setLayoutParams(layoutParams2);
                    C13601g gVar = C97675c.f286485a;
                    Field declaredField = RecyclerView.LayoutParams.class.getDeclaredField("d");
                    boolean z = true;
                    declaredField.setAccessible(true);
                    declaredField.set((RecyclerView.LayoutParams) layoutParams2, b);
                    View view = b.f44854d;
                    rVar.getClass();
                    RecyclerView.C16631z Q0 = RecyclerView.m15803Q0(view);
                    if (Q0 != null) {
                        int f = RecyclerView.this.f44761g.mo17469f(i, 0);
                        if (f < 0 || f >= RecyclerView.this.f44781r.getItemCount()) {
                            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + f + ")." + "state:" + RecyclerView.this.f44752a1.mo17354b() + RecyclerView.this.mo17017B0());
                        }
                        rVar.mo17347k(Q0, f, i, MAlarmHandler.NEXT_FIRE_INTERVAL);
                        ViewGroup.LayoutParams layoutParams3 = Q0.f44854d.getLayoutParams();
                        if (layoutParams3 == null) {
                            layoutParams = (RecyclerView.LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                            Q0.f44854d.setLayoutParams(layoutParams);
                        } else if (!RecyclerView.this.checkLayoutParams(layoutParams3)) {
                            layoutParams = (RecyclerView.LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams3);
                            Q0.f44854d.setLayoutParams(layoutParams);
                        } else {
                            layoutParams = (RecyclerView.LayoutParams) layoutParams3;
                        }
                        layoutParams.f44800f = true;
                        layoutParams.f44798d = Q0;
                        if (Q0.f44854d.getParent() != null) {
                            z = false;
                        }
                        layoutParams.f44801g = z;
                        return b;
                    }
                    throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.mo17017B0());
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$d */
    public final class C19814d extends RecyclerView.C16631z {
        public C19814d(DynamicViewCacheExtension dynamicViewCacheExtension) {
            super(new View(dynamicViewCacheExtension.f56356a.getContext()));
        }
    }

    public DynamicViewCacheExtension(RecyclerView recyclerView, int i, int i2, boolean z, C97680h hVar, MMHandler mMHandler) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(hVar, "viewPool");
        C87412m.m108594g(mMHandler, "asyncHandler");
        this.f56356a = recyclerView;
        int[] iArr = new int[3];
        for (int i3 = 0; i3 < 3; i3++) {
            iArr[i3] = 0;
        }
        this.f56359d = iArr;
        C19815e eVar = new C19815e();
        this.f56360e = eVar;
        this.f56361f = hVar;
        C19808c cVar = new C19808c(this.f56357b, i, i2, eVar, z, mMHandler, iArr);
        this.f56362g = new C19814d(this);
        RecyclerView recyclerView2 = this.f56356a;
        C87412m.m108594g(recyclerView2, "recyclerView");
        cVar.f56376h = recyclerView2;
        recyclerView2.mo17043c(cVar.f56379k);
        C97675c.m125885c(recyclerView2, new C19816a(cVar));
        recyclerView2.post(new C19817b(cVar, recyclerView2));
        this.f56356a.setRecyclerListener(new C19804a(this));
        this.f56356a.post(new C19805b(this));
    }

    /* renamed from: b */
    public static final void m21510b(DynamicViewCacheExtension dynamicViewCacheExtension, View view) {
        dynamicViewCacheExtension.getClass();
        if (C87412m.m108589b(view.getTag(C0966R.C0970id.f5311bn), 1)) {
            int[] iArr = dynamicViewCacheExtension.f56359d;
            iArr[0] = iArr[0] + 1;
            return;
        }
        int[] iArr2 = dynamicViewCacheExtension.f56359d;
        iArr2[1] = iArr2[1] + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r9.f56362g;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo17356a(androidx.recyclerview.widget.RecyclerView.C16625r r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "recycler"
            gy3.C87412m.m108594g(r10, r0)
            com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e r10 = r9.f56360e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            java.lang.Object r1 = r10.get(r0)
            if (r1 != 0) goto L_0x001b
            com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$d r1 = r9.f56362g
            java.lang.Object r10 = r10.putIfAbsent(r0, r1)
            if (r10 != 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r1 = r10
        L_0x001b:
            androidx.recyclerview.widget.RecyclerView$z r1 = (androidx.recyclerview.widget.RecyclerView.C16631z) r1
            com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$d r10 = r9.f56362g
            boolean r10 = gy3.C87412m.m108589b(r10, r1)
            r0 = 0
            if (r10 == 0) goto L_0x0027
            return r0
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            android.view.View r10 = r1.f44854d
            goto L_0x002d
        L_0x002c:
            r10 = r0
        L_0x002d:
            if (r10 == 0) goto L_0x00ad
            r2 = 0
            r9.mo26298d(r10, r2)
            r9.mo26299e(r10, r2)
            int r2 = r1.f44859i
            java.lang.String r3 = " but request type is "
            java.lang.String r4 = "async holder["
            if (r2 != r12) goto L_0x0088
            long r5 = r1.f44858h
            r7 = -1
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x00ad
            androidx.recyclerview.widget.RecyclerView r12 = r9.f56356a
            androidx.recyclerview.widget.RecyclerView$e r12 = r12.getAdapter()
            if (r12 == 0) goto L_0x0056
            long r5 = r12.getItemId(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
        L_0x0056:
            long r5 = r1.f44858h
            if (r0 == 0) goto L_0x0063
            long r7 = r0.longValue()
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x0063
            goto L_0x00ad
        L_0x0063:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r4)
            r12.append(r11)
            java.lang.String r11 = "] itemId is "
            r12.append(r11)
            long r1 = r1.f44858h
            r12.append(r1)
            r12.append(r3)
            r12.append(r0)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x0088:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r11)
            java.lang.String r11 = "] viewType is "
            r0.append(r11)
            int r11 = r1.f44859i
            r0.append(r11)
            r0.append(r3)
            r0.append(r12)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
        L_0x00ad:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension.mo17356a(androidx.recyclerview.widget.RecyclerView$r, int, int):android.view.View");
    }

    /* renamed from: c */
    public final int[] mo26297c() {
        return (int[]) this.f56359d.clone();
    }

    /* renamed from: d */
    public final void mo26298d(View view, boolean z) {
        View findViewById;
        if (z) {
            view.setTag(C0966R.C0970id.f5311bn, (Object) null);
            if (this.f56358c && (findViewById = view.findViewById(C0966R.C0970id.f5313bp)) != null) {
                ((ViewGroup) view).removeView(findViewById);
                return;
            }
            return;
        }
        view.setTag(C0966R.C0970id.f5311bn, 1);
        if (this.f56358c) {
            TextView textView = new TextView(view.getContext());
            textView.setText("😄");
            textView.setId(C0966R.C0970id.f5313bp);
            textView.setTextSize(1, 40.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ((ViewGroup) view).addView(textView, layoutParams);
        }
    }

    /* renamed from: e */
    public final void mo26299e(View view, boolean z) {
        C87412m.m108594g(view, "itemView");
        if (z) {
            Field declaredField = View.class.getDeclaredField("mRunQueue");
            declaredField.setAccessible(true);
            declaredField.set(view, (Object) null);
            view.setTag(C0966R.C0970id.f5312bo, (Object) null);
            return;
        }
        view.setTag(C0966R.C0970id.f5312bo, 1);
    }

    /* renamed from: com.tencent.mm.ui.recyclerview.DynamicViewCacheExtension$e */
    public final class C19815e extends ConcurrentHashMap<Integer, RecyclerView.C16631z> {
        public C19815e() {
        }

        /* renamed from: a */
        public final void mo26309a(RecyclerView.C16631z zVar, String str) {
            C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
            if (zVar != null && zVar.f44854d.getParent() == null) {
                DynamicViewCacheExtension dynamicViewCacheExtension = DynamicViewCacheExtension.this;
                View view = zVar.f44854d;
                dynamicViewCacheExtension.getClass();
                if (!(view != null ? C87412m.m108589b(view.getTag(C0966R.C0970id.f5312bo), 1) : false) && !(zVar instanceof C19814d)) {
                    C13601g gVar = C97675c.f286485a;
                    Field declaredField = RecyclerView.C16631z.class.getDeclaredField("p");
                    declaredField.setAccessible(true);
                    declaredField.set(zVar, 6);
                    DynamicViewCacheExtension dynamicViewCacheExtension2 = DynamicViewCacheExtension.this;
                    View view2 = zVar.f44854d;
                    C87412m.m108593f(view2, "holder.itemView");
                    dynamicViewCacheExtension2.mo26299e(view2, true);
                    DynamicViewCacheExtension.this.f56361f.mo10384d(zVar);
                }
            }
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return super.containsKey((Integer) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof RecyclerView.C16631z)) {
                return false;
            }
            return super.containsValue((RecyclerView.C16631z) obj);
        }

        public final /* bridge */ Set<Map.Entry<Integer, RecyclerView.C16631z>> entrySet() {
            return super.entrySet();
        }

        public final /* bridge */ Object get(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return (RecyclerView.C16631z) super.get((Integer) obj);
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Integer) ? obj2 : (RecyclerView.C16631z) super.getOrDefault((Integer) obj, (RecyclerView.C16631z) obj2);
        }

        public final /* bridge */ Set<Integer> keySet() {
            return super.keySet();
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return (RecyclerView.C16631z) super.remove((Integer) obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<RecyclerView.C16631z> values() {
            return super.values();
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Integer) && (obj2 instanceof RecyclerView.C16631z)) {
                return super.remove((Integer) obj, (RecyclerView.C16631z) obj2);
            }
            return false;
        }
    }
}
