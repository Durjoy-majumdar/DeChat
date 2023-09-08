package px0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19641z0;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C33631s;
import jq3.C60906r;
import jq3.C60907t;
import jq3.C9493c;
import te3.C22521pi1;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: px0.o */
public final class C22051o implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ C22055p f62397a;

    /* renamed from: px0.o$a */
    public static final class C22052a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ RecyclerView f62398d;

        /* renamed from: e */
        public final /* synthetic */ C60906r f62399e;

        /* renamed from: f */
        public final /* synthetic */ C22055p f62400f;

        /* renamed from: px0.o$a$a */
        public static final class C22053a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ RecyclerView f62401d;

            /* renamed from: e */
            public final /* synthetic */ View f62402e;

            /* renamed from: f */
            public final /* synthetic */ C22055p f62403f;

            /* renamed from: g */
            public final /* synthetic */ C22521pi1 f62404g;

            /* renamed from: h */
            public final /* synthetic */ C33631s f62405h;

            /* renamed from: px0.o$a$a$a */
            public static final class C22054a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C22055p f62406d;

                /* renamed from: e */
                public final /* synthetic */ C22521pi1 f62407e;

                /* renamed from: f */
                public final /* synthetic */ C33631s f62408f;

                public C22054a(C22055p pVar, C22521pi1 pi12, C33631s sVar) {
                    this.f62406d = pVar;
                    this.f62407e = pi12;
                    this.f62408f = sVar;
                }

                public final void run() {
                    C22055p pVar = this.f62406d;
                    pVar.f62414a.f50954d.f51436d.f50249v.mo22983j(pVar.mo35161b(), this.f62407e, this.f62406d.f62420g, this.f62408f.f91022c, 1);
                }
            }

            public C22053a(RecyclerView recyclerView, View view, C22055p pVar, C22521pi1 pi12, C33631s sVar) {
                this.f62401d = recyclerView;
                this.f62402e = view;
                this.f62403f = pVar;
                this.f62404g = pi12;
                this.f62405h = sVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[Catch:{ Exception -> 0x0097 }] */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ Exception -> 0x0097 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    java.lang.String r0 = "MicroMsg.NativeFinderListHelper"
                    my3.j r1 = new my3.j     // Catch:{ Exception -> 0x0097 }
                    androidx.recyclerview.widget.RecyclerView r2 = r7.f62401d     // Catch:{ Exception -> 0x0097 }
                    int r2 = r2.getLeft()     // Catch:{ Exception -> 0x0097 }
                    androidx.recyclerview.widget.RecyclerView r3 = r7.f62401d     // Catch:{ Exception -> 0x0097 }
                    int r3 = r3.getRight()     // Catch:{ Exception -> 0x0097 }
                    r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0097 }
                    int r3 = r1.f175175e     // Catch:{ Exception -> 0x0097 }
                    android.view.View r4 = r7.f62402e     // Catch:{ Exception -> 0x0097 }
                    int r4 = r4.getLeft()     // Catch:{ Exception -> 0x0097 }
                    r5 = 1
                    r6 = 0
                    if (r2 > r4) goto L_0x0023
                    if (r4 > r3) goto L_0x0023
                    r3 = 1
                    goto L_0x0024
                L_0x0023:
                    r3 = 0
                L_0x0024:
                    if (r3 == 0) goto L_0x0039
                    int r1 = r1.f175175e     // Catch:{ Exception -> 0x0097 }
                    android.view.View r3 = r7.f62402e     // Catch:{ Exception -> 0x0097 }
                    int r3 = r3.getRight()     // Catch:{ Exception -> 0x0097 }
                    if (r2 > r3) goto L_0x0034
                    if (r3 > r1) goto L_0x0034
                    r1 = 1
                    goto L_0x0035
                L_0x0034:
                    r1 = 0
                L_0x0035:
                    if (r1 == 0) goto L_0x0039
                    r1 = 1
                    goto L_0x003a
                L_0x0039:
                    r1 = 0
                L_0x003a:
                    px0.p r2 = r7.f62403f     // Catch:{ Exception -> 0x0097 }
                    java.util.HashMap<java.lang.String, java.lang.Long> r2 = r2.f62426m     // Catch:{ Exception -> 0x0097 }
                    te3.pi1 r3 = r7.f62404g     // Catch:{ Exception -> 0x0097 }
                    java.lang.String r3 = r3.f64435r     // Catch:{ Exception -> 0x0097 }
                    java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0097 }
                    if (r2 == 0) goto L_0x0049
                    goto L_0x004a
                L_0x0049:
                    r5 = 0
                L_0x004a:
                    px0.p r2 = r7.f62403f     // Catch:{ Exception -> 0x0097 }
                    java.util.HashMap<java.lang.String, te3.pi1> r2 = r2.f62425l     // Catch:{ Exception -> 0x0097 }
                    te3.pi1 r3 = r7.f62404g     // Catch:{ Exception -> 0x0097 }
                    java.lang.String r3 = r3.f64435r     // Catch:{ Exception -> 0x0097 }
                    boolean r2 = r2.containsKey(r3)     // Catch:{ Exception -> 0x0097 }
                    if (r1 == 0) goto L_0x00b9
                    if (r5 == 0) goto L_0x00b9
                    if (r2 != 0) goto L_0x00b9
                    zt3.t r1 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x0097 }
                    px0.o$a$a$a r2 = new px0.o$a$a$a     // Catch:{ Exception -> 0x0097 }
                    px0.p r3 = r7.f62403f     // Catch:{ Exception -> 0x0097 }
                    te3.pi1 r4 = r7.f62404g     // Catch:{ Exception -> 0x0097 }
                    jq3.s r5 = r7.f62405h     // Catch:{ Exception -> 0x0097 }
                    r2.<init>(r3, r4, r5)     // Catch:{ Exception -> 0x0097 }
                    java.lang.String r3 = "BizTimeLineExpose"
                    zt3.j r1 = (zt3.C119157j) r1     // Catch:{ Exception -> 0x0097 }
                    r1.mo183876g(r2, r3)     // Catch:{ Exception -> 0x0097 }
                    px0.p r1 = r7.f62403f     // Catch:{ Exception -> 0x0097 }
                    java.util.HashMap<java.lang.String, te3.pi1> r1 = r1.f62425l     // Catch:{ Exception -> 0x0097 }
                    te3.pi1 r2 = r7.f62404g     // Catch:{ Exception -> 0x0097 }
                    java.lang.String r3 = r2.f64435r     // Catch:{ Exception -> 0x0097 }
                    r1.put(r3, r2)     // Catch:{ Exception -> 0x0097 }
                    int r1 = px0.C22055p.f62409o     // Catch:{ Exception -> 0x0097 }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0097 }
                    r1.<init>()     // Catch:{ Exception -> 0x0097 }
                    java.lang.String r2 = "report expose: title = "
                    r1.append(r2)     // Catch:{ Exception -> 0x0097 }
                    te3.pi1 r2 = r7.f62404g     // Catch:{ Exception -> 0x0097 }
                    java.lang.String r2 = r2.f64433p     // Catch:{ Exception -> 0x0097 }
                    r1.append(r2)     // Catch:{ Exception -> 0x0097 }
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0097 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x0097 }
                    goto L_0x00b9
                L_0x0097:
                    r1 = move-exception
                    int r2 = px0.C22055p.f62409o
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "500ms expose crash: "
                    r2.append(r3)
                    java.lang.String r1 = r1.getMessage()
                    r2.append(r1)
                    java.lang.String r1 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                    com.tencent.mm.storage.z0 r0 = com.tencent.p014mm.storage.C19641z0.f55645a
                    r1 = 163(0xa3, float:2.28E-43)
                    r0.mo25867j(r1)
                L_0x00b9:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: px0.C22051o.C22052a.C22053a.run():void");
            }
        }

        public C22052a(RecyclerView recyclerView, C60906r rVar, C22055p pVar) {
            this.f62398d = recyclerView;
            this.f62399e = rVar;
            this.f62400f = pVar;
        }

        public final void run() {
            View view;
            RecyclerView.LayoutManager layoutManager = this.f62398d.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxLinearLayoutManager");
            WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) layoutManager;
            LinkedList<C33631s> linkedList = this.f62399e.f173510f;
            C22055p pVar = this.f62400f;
            RecyclerView recyclerView = this.f62398d;
            for (C33631s sVar : linkedList) {
                C9493c cVar = sVar.f91020a;
                C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.nativefinder.list.NativeFinderItemConvertData");
                C22521pi1 pi12 = ((C22039d) cVar).f62373d;
                if (!pVar.f62425l.containsKey(pi12.f64435r)) {
                    try {
                        view = wxLinearLayoutManager.findViewByPosition(sVar.f91022c);
                    } catch (Exception e) {
                        int i = C22055p.f62409o;
                        Log.m105920e("MicroMsg.NativeFinderListHelper", "findViewByPosition crash: " + e.getMessage());
                        C19641z0.f55645a.mo25867j(162);
                        view = null;
                    }
                    View view2 = view;
                    if (view2 != null) {
                        C119179t tVar = C119157j.f356862d;
                        C22053a aVar = new C22053a(recyclerView, view2, pVar, pi12, sVar);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        jVar.mo183892w(aVar, 500, false);
                    }
                }
            }
        }
    }

    public C22051o(C22055p pVar) {
        this.f62397a = pVar;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar, "data");
        LinkedList<C33631s> linkedList = rVar.f173513i;
        C22055p pVar = this.f62397a;
        for (C33631s sVar : linkedList) {
            C9493c cVar = sVar.f91020a;
            C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.nativefinder.list.NativeFinderItemConvertData");
            C22521pi1 pi12 = ((C22039d) cVar).f62373d;
            pVar.f62414a.f50954d.f51453x.mo34948a(pi12, 25);
            pVar.f62426m.put(pi12.f64435r, Long.valueOf(System.currentTimeMillis()));
        }
        LinkedList<C33631s> linkedList2 = rVar.f173512h;
        C22055p pVar2 = this.f62397a;
        for (C33631s sVar2 : linkedList2) {
            C9493c cVar2 = sVar2.f91020a;
            C87412m.m108592e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.item.nativefinder.list.NativeFinderItemConvertData");
            pVar2.f62426m.remove(((C22039d) cVar2).f62373d.f64435r);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C22052a(recyclerView, rVar, this.f62397a));
    }
}
