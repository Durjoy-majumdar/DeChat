package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.widget.C84943i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.finder.live.view.o1 */
public final class C3222o1 implements C84943i {

    /* renamed from: a */
    public View f15343a;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/o1$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.finder.live.view.o1$a */
    public static final class C3223a implements C80883e<IPCString, IPCVoid> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: te3.fp1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: te3.fp1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: te3.fp1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: te3.fp1} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r17, com.tencent.p014mm.ipcinvoker.C1256g r18) {
            /*
                r16 = this;
                r0 = r18
                r1 = r17
                com.tencent.mm.ipcinvoker.type.IPCString r1 = (com.tencent.p014mm.ipcinvoker.type.IPCString) r1
                java.lang.String r2 = "jumpId"
                java.lang.String r3 = "session"
                if (r1 == 0) goto L_0x0103
                java.lang.String r4 = r1.f10315d
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 == 0) goto L_0x0017
                goto L_0x0103
            L_0x0017:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r4.getClass()
                com.tencent.mm.plugin.finder.live.view.b r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
                if (r5 == 0) goto L_0x0026
                android.content.Context r5 = r5.getContext()
                r8 = r5
                goto L_0x0027
            L_0x0026:
                r8 = 0
            L_0x0027:
                ok1.e r5 = ok1.C62042e.f176370a
                boolean r5 = r5.mo87027N0()
                r7 = 0
                if (r5 == 0) goto L_0x0046
                if (r8 == 0) goto L_0x0103
                android.content.res.Resources r0 = r8.getResources()
                r1 = 2131827263(0x7f111a3f, float:1.9287434E38)
                java.lang.String r0 = r0.getString(r1)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r8, (java.lang.CharSequence) r0, (int) r7)
                r0.show()
                goto L_0x0103
            L_0x0046:
                java.lang.String r5 = "FinderLiveProductRecordPlayWidget"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00db }
                r9.<init>()     // Catch:{ all -> 0x00db }
                java.lang.String r10 = "createWidget data:"
                r9.append(r10)     // Catch:{ all -> 0x00db }
                java.lang.String r10 = r1.f10315d     // Catch:{ all -> 0x00db }
                r9.append(r10)     // Catch:{ all -> 0x00db }
                java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00db }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)     // Catch:{ all -> 0x00db }
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00db }
                java.lang.String r1 = r1.f10315d     // Catch:{ all -> 0x00db }
                r5.<init>(r1)     // Catch:{ all -> 0x00db }
                java.lang.String r1 = "productId"
                long r9 = r5.getLong(r1)     // Catch:{ all -> 0x00db }
                java.lang.String r1 = "replayId"
                long r11 = r5.getLong(r1)     // Catch:{ all -> 0x00db }
                java.lang.String r14 = r5.getString(r3)     // Catch:{ all -> 0x00db }
                java.lang.String r15 = r5.getString(r2)     // Catch:{ all -> 0x00db }
                java.lang.Class<cl1.h1> r1 = cl1.C54979h1.class
                androidx.lifecycle.i0 r1 = r4.mo77630e(r1)     // Catch:{ all -> 0x00db }
                cl1.h1 r1 = (cl1.C54979h1) r1     // Catch:{ all -> 0x00db }
                if (r1 == 0) goto L_0x00dd
                p40.a<cm1.i2> r1 = r1.f154140o     // Catch:{ all -> 0x00db }
                if (r1 == 0) goto L_0x00dd
                com.tencent.mm.plugin.finder.live.view.n1 r4 = com.tencent.p014mm.plugin.finder.live.view.C3221n1.f15342d     // Catch:{ all -> 0x00db }
                java.util.List r1 = r1.mo87251b(r4)     // Catch:{ all -> 0x00db }
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00db }
                r5 = 10
                int r5 = sx3.C36907w.m41090l(r1, r5)     // Catch:{ all -> 0x00db }
                r4.<init>(r5)     // Catch:{ all -> 0x00db }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x00db }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00db }
            L_0x009e:
                boolean r5 = r1.hasNext()     // Catch:{ all -> 0x00db }
                if (r5 == 0) goto L_0x00b7
                java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x00db }
                cm1.i2 r5 = (cm1.C0740i2) r5     // Catch:{ all -> 0x00db }
                java.lang.String r13 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem"
                gy3.C87412m.m108592e(r5, r13)     // Catch:{ all -> 0x00db }
                sk1.x r5 = (sk1.C63965x) r5     // Catch:{ all -> 0x00db }
                te3.fp1 r5 = r5.f181346s     // Catch:{ all -> 0x00db }
                r4.add(r5)     // Catch:{ all -> 0x00db }
                goto L_0x009e
            L_0x00b7:
                java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x00db }
            L_0x00bb:
                boolean r4 = r1.hasNext()     // Catch:{ all -> 0x00db }
                if (r4 == 0) goto L_0x00d7
                java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x00db }
                r5 = r4
                te3.fp1 r5 = (te3.C64370fp1) r5     // Catch:{ all -> 0x00db }
                long r6 = r5.f183176d     // Catch:{ all -> 0x00db }
                int r5 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                if (r5 != 0) goto L_0x00d0
                r5 = 1
                goto L_0x00d1
            L_0x00d0:
                r5 = 0
            L_0x00d1:
                if (r5 == 0) goto L_0x00d5
                r6 = r4
                goto L_0x00d8
            L_0x00d5:
                r7 = 0
                goto L_0x00bb
            L_0x00d7:
                r6 = 0
            L_0x00d8:
                te3.fp1 r6 = (te3.C64370fp1) r6     // Catch:{ all -> 0x00db }
                goto L_0x00de
            L_0x00db:
                goto L_0x00f9
            L_0x00dd:
                r6 = 0
            L_0x00de:
                if (r6 == 0) goto L_0x00f9
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ all -> 0x00db }
                r1.getClass()     // Catch:{ all -> 0x00db }
                fj1.b r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A     // Catch:{ all -> 0x00db }
                if (r9 == 0) goto L_0x00f9
                if (r8 == 0) goto L_0x00f9
                ok1.e r7 = ok1.C62042e.f176370a     // Catch:{ all -> 0x00db }
                r13 = 2
                gy3.C87412m.m108593f(r14, r3)     // Catch:{ all -> 0x00db }
                gy3.C87412m.m108593f(r15, r2)     // Catch:{ all -> 0x00db }
                r10 = r11
                r12 = r6
                r7.mo87003F0(r8, r9, r10, r12, r13, r14, r15)     // Catch:{ all -> 0x00db }
            L_0x00f9:
                if (r0 == 0) goto L_0x0103
                com.tencent.mm.ipcinvoker.type.IPCVoid r1 = new com.tencent.mm.ipcinvoker.type.IPCVoid
                r1.<init>()
                r0.mo894a(r1)
            L_0x0103:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C3222o1.C3223a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.o1$b */
    public static final class C3224b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f15344d;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.o1$b$a */
        public static final class C3225a<T> implements C1256g {

            /* renamed from: d */
            public static final C3225a<T> f15345d = new C3225a<>();

            /* renamed from: a */
            public void mo894a(Object obj) {
                IPCVoid iPCVoid = (IPCVoid) obj;
                Log.m105924i("FinderLiveProductRecordPlayWidget", "click onCallback");
            }
        }

        public C3224b(String str) {
            this.f15344d = str;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordPlayWidget$createWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C80907o.m98782e(MMApplicationContext.getMainProcessName(), new IPCString(this.f15344d), C3223a.class, C3225a.f15345d, (String) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordPlayWidget$createWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public View mo3391a(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "data");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f7183y8, (ViewGroup) null);
        this.f15343a = inflate;
        inflate.setOnClickListener(new C3224b(str));
        return inflate;
    }

    /* renamed from: b */
    public int mo3392b() {
        return C0966R.C0971layout.aj8;
    }

    /* renamed from: c */
    public RelativeLayout.LayoutParams mo3393c() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        View view = this.f15343a;
        if (view == null || (context = view.getContext()) == null) {
            context = MMApplicationContext.getContext();
        }
        int b = C76577a.m92151b(context, 90);
        View view2 = this.f15343a;
        if (view2 == null || (context2 = view2.getContext()) == null) {
            context2 = MMApplicationContext.getContext();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, C76577a.m92151b(context2, 32));
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        View view3 = this.f15343a;
        if (view3 == null || (context3 = view3.getContext()) == null) {
            context3 = MMApplicationContext.getContext();
        }
        layoutParams.topMargin = C76577a.m92151b(context3, 12);
        View view4 = this.f15343a;
        if (view4 == null || (context4 = view4.getContext()) == null) {
            context4 = MMApplicationContext.getContext();
        }
        layoutParams.rightMargin = C76577a.m92151b(context4, 12);
        return layoutParams;
    }
}
