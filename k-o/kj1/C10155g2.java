package kj1;

import al1.C54130j;
import cl1.C54963d0;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import d50.C7170j;
import gy3.C87412m;
import il1.C9065m6;
import java.util.Iterator;
import java.util.List;
import kj1.C10125e1;
import lj1.C10538e;
import nj3.C76874e0;

/* renamed from: kj1.g2 */
public final class C10155g2 extends C10538e {

    /* renamed from: h */
    public final int f31088h;

    /* renamed from: i */
    public final String f31089i = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10155g2(C10125e1 e1Var, int i) {
        super(e1Var, i);
        C87412m.m108594g(e1Var, "helper");
        this.f31088h = e1Var.f31003v;
    }

    /* renamed from: g */
    public String mo10518g() {
        return this.f31089i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ba A[SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10519k() {
        /*
            r8 = this;
            gg1.a r0 = gg1.C32444a.f86121a
            pe1.c<java.lang.Integer> r0 = gg1.C32444a.f86074K1
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x00e2
            kj1.e1 r0 = r8.f31809a
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            androidx.lifecycle.i0 r0 = r0.mo10534b(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            java.lang.String r3 = "helper.business(LiveLink…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r0, r3)
            monitor-enter(r0)
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00df }
        L_0x0028:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00df }
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00df }
            r5 = r4
            al1.j r5 = (al1.C54130j) r5     // Catch:{ all -> 0x00df }
            java.lang.String r5 = r5.f151997a     // Catch:{ all -> 0x00df }
            kj1.e1 r6 = r8.f31809a     // Catch:{ all -> 0x00df }
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r6 = r6.mo10534b(r7)     // Catch:{ all -> 0x00df }
            cl1.o r6 = (cl1.C54991o) r6     // Catch:{ all -> 0x00df }
            java.lang.String r6 = r6.mo76015n4()     // Catch:{ all -> 0x00df }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x00df }
            if (r5 == 0) goto L_0x0028
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            monitor-exit(r0)
            if (r4 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            il1.m6$a r3 = il1.C9065m6.f28605f
            d50.j r0 = r3.mo9892a(r0)
            if (r0 == 0) goto L_0x006c
            java.lang.String r3 = r0.f25144c
            if (r3 == 0) goto L_0x006c
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0067
            r3 = 1
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            if (r3 != r1) goto L_0x006c
            r3 = 1
            goto L_0x006d
        L_0x006c:
            r3 = 0
        L_0x006d:
            if (r3 != 0) goto L_0x00c0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            p50.e r3 = r3.mo77631e0()
            if (r3 == 0) goto L_0x00bc
            b50.g r3 = r3.f176822Y0
            if (r3 == 0) goto L_0x00bc
            d50.g r3 = r3.f152628b
            if (r3 == 0) goto L_0x00bc
            java.util.HashMap<java.lang.Integer, d50.j> r3 = r3.f166241k
            java.util.Collection r3 = r3.values()
            java.lang.String r4 = "liveInfo.cdnUrlMap.values"
            gy3.C87412m.m108593f(r3, r4)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0091
            goto L_0x00bc
        L_0x0091:
            java.util.Iterator r3 = r3.iterator()
        L_0x0095:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r3.next()
            d50.j r4 = (d50.C7170j) r4
            int r5 = r4.f25143b
            if (r5 == 0) goto L_0x00b7
            java.lang.String r4 = r4.f25144c
            if (r4 == 0) goto L_0x00b2
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r4 = 0
            goto L_0x00b3
        L_0x00b2:
            r4 = 1
        L_0x00b3:
            if (r4 != 0) goto L_0x00b7
            r4 = 1
            goto L_0x00b8
        L_0x00b7:
            r4 = 0
        L_0x00b8:
            if (r4 == 0) goto L_0x0095
            r3 = 1
            goto L_0x00bd
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            if (r3 == 0) goto L_0x00c0
            goto L_0x00e3
        L_0x00c0:
            kj1.e1 r1 = r8.f31809a
            java.lang.String r1 = r1.f30980a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "showLevel:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", and not contain video level!"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x00e2
        L_0x00df:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10155g2.mo10519k():boolean");
    }

    /* renamed from: o */
    public void mo10523o(C10125e1 e1Var, C76874e0 e0Var) {
        C9065m6 m6Var;
        T t;
        String str;
        C87412m.m108594g(e1Var, "<this>");
        C87412m.m108594g(e0Var, "menu");
        List<C54130j> list = ((C54963d0) e1Var.mo10534b(C54963d0.class)).f154074q;
        C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
        synchronized (list) {
            Iterator<T> it = list.iterator();
            while (true) {
                m6Var = null;
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) e1Var.mo10534b(C54991o.class)).mo76015n4())) {
                    break;
                }
            }
        }
        C7170j a = C9065m6.f28605f.mo9892a(t != null);
        if (a == null || (str = a.f25144c) == null) {
            str = "";
        }
        String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.dx7, new Object[]{str});
        C87412m.m108593f(string, "getContext().resources.g…ideo_level, showLevelStr)");
        e0Var.mo107144g(this.f31088h, e1Var.mo10533a(string, str), C0966R.raw.finder_icons_video_definition);
        C10125e1.C10127b bVar = e1Var.f30988g;
        if (bVar != null) {
            bVar.f31020m = new C9065m6(e1Var.f30985d, e1Var.f30982b);
        }
        C10125e1.C10127b bVar2 = e1Var.f30988g;
        if (bVar2 != null) {
            m6Var = bVar2.f31020m;
        }
        if (m6Var != null) {
            m6Var.f28609d = a;
        }
    }

    /* renamed from: q */
    public int mo10524q() {
        return this.f31088h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011b A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10525t(kj1.C10125e1 r21) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.String r4 = "<this>"
            gy3.C87412m.m108594g(r0, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "element"
            r6 = 1
            r4.put(r5, r6)
            java.lang.String r5 = "type"
            r7 = 2
            r4.put(r5, r7)
            java.lang.Class<ak1.w> r5 = ak1.C54116w.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            java.lang.String r7 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r5, r7)
            r8 = r5
            ak1.w r8 = (ak1.C54116w) r8
            ak1.f0$o0 r9 = ak1.C54067f0.C54076o0.MENU_OPTION
            java.lang.String r10 = r4.toString()
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 252(0xfc, float:3.53E-43)
            r19 = 0
            ak1.C54116w.Ex0(r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            androidx.lifecycle.i0 r4 = r0.mo10534b(r3)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154074q
            java.lang.String r5 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r4, r5)
            monitor-enter(r4)
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x02a5 }
        L_0x0055:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x02a5 }
            r8 = 0
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x02a5 }
            r9 = r7
            al1.j r9 = (al1.C54130j) r9     // Catch:{ all -> 0x02a5 }
            java.lang.String r9 = r9.f151997a     // Catch:{ all -> 0x02a5 }
            androidx.lifecycle.i0 r10 = r0.mo10534b(r2)     // Catch:{ all -> 0x02a5 }
            cl1.o r10 = (cl1.C54991o) r10     // Catch:{ all -> 0x02a5 }
            java.lang.String r10 = r10.mo76015n4()     // Catch:{ all -> 0x02a5 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r10)     // Catch:{ all -> 0x02a5 }
            if (r9 == 0) goto L_0x0055
            goto L_0x0077
        L_0x0076:
            r7 = r8
        L_0x0077:
            monitor-exit(r4)
            r4 = 0
            if (r7 == 0) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            androidx.lifecycle.i0 r3 = r0.mo10534b(r3)
            cl1.d0 r3 = (cl1.C54963d0) r3
            boolean r3 = r3.mo75913U3()
            java.lang.String r7 = r0.f30980a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "showCustomerVideoLevel linking:"
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = ",linkWait:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            if (r5 != 0) goto L_0x028e
            if (r3 == 0) goto L_0x00ad
            goto L_0x028e
        L_0x00ad:
            androidx.lifecycle.i0 r2 = r0.mo10534b(r2)
            cl1.o r2 = (cl1.C54991o) r2
            int r2 = r2.f154289Z2
            if (r2 == 0) goto L_0x00b9
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r3)
            if (r2 != 0) goto L_0x0254
            if (r3 != 0) goto L_0x00c8
            goto L_0x0254
        L_0x00c8:
            kj1.e1$b r2 = r0.f30988g
            if (r2 == 0) goto L_0x0253
            il1.m6 r2 = r2.f31020m
            if (r2 == 0) goto L_0x0253
            boolean r0 = r0.f30987f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getDefinitionList cur:"
            r3.append(r5)
            d50.j r5 = r2.f28609d
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "FinderLiveVideoDefinitionWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            d50.j r7 = r2.f28609d
            if (r7 == 0) goto L_0x00f6
            int r7 = r7.f25143b
            goto L_0x00f7
        L_0x00f6:
            r7 = 0
        L_0x00f7:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            p50.e r9 = r9.mo77631e0()
            if (r9 == 0) goto L_0x01a6
            b50.g r9 = r9.f176822Y0
            if (r9 == 0) goto L_0x01a6
            d50.g r9 = r9.f152628b
            if (r9 == 0) goto L_0x01a6
            java.util.HashMap<java.lang.Integer, d50.j> r9 = r9.f166241k
            java.util.Collection r9 = r9.values()
            java.lang.String r10 = "liveInfo.cdnUrlMap.values"
            gy3.C87412m.m108593f(r9, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x011b:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0145
            java.lang.Object r11 = r9.next()
            r12 = r11
            d50.j r12 = (d50.C7170j) r12
            int r13 = r12.f25143b
            if (r13 == 0) goto L_0x013e
            java.lang.String r12 = r12.f25144c
            if (r12 == 0) goto L_0x0139
            int r12 = r12.length()
            if (r12 != 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r12 = 0
            goto L_0x013a
        L_0x0139:
            r12 = 1
        L_0x013a:
            if (r12 != 0) goto L_0x013e
            r12 = 1
            goto L_0x013f
        L_0x013e:
            r12 = 0
        L_0x013f:
            if (r12 == 0) goto L_0x011b
            r10.add(r11)
            goto L_0x011b
        L_0x0145:
            java.util.Iterator r9 = r10.iterator()
        L_0x0149:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01a6
            java.lang.Object r10 = r9.next()
            d50.j r10 = (d50.C7170j) r10
            java.util.Iterator r11 = r3.iterator()
        L_0x0159:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0174
            java.lang.Object r12 = r11.next()
            r13 = r12
            qk1.p0$a r13 = (qk1.C12825p0.C12826a) r13
            d50.j r13 = r13.f36712a
            int r13 = r13.f25143b
            int r14 = r10.f25143b
            if (r13 != r14) goto L_0x0170
            r13 = 1
            goto L_0x0171
        L_0x0170:
            r13 = 0
        L_0x0171:
            if (r13 == 0) goto L_0x0159
            goto L_0x0175
        L_0x0174:
            r12 = r8
        L_0x0175:
            if (r12 != 0) goto L_0x018c
            qk1.p0$a r11 = new qk1.p0$a
            java.lang.String r12 = "info"
            gy3.C87412m.m108593f(r10, r12)
            int r12 = r10.f25143b
            if (r7 != r12) goto L_0x0184
            r12 = 1
            goto L_0x0185
        L_0x0184:
            r12 = 0
        L_0x0185:
            r11.<init>(r10, r12)
            r3.add(r11)
            goto L_0x0149
        L_0x018c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "getDefinitionList "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " repeat!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r10)
            goto L_0x0149
        L_0x01a6:
            int r4 = r3.size()
            if (r4 <= r6) goto L_0x01b4
            il1.n6 r4 = new il1.n6
            r4.<init>()
            sx3.C77813z.m93909o(r3, r4)
        L_0x01b4:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01d3
            ok1.e r0 = ok1.C62042e.f176370a
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = "getContext()"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = "可选分辨率为空"
            r0.mo87041S1(r2, r3)
            java.lang.String r0 = "showCustomerVideoLevel definitionList is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x0253
        L_0x01d3:
            qo3.w r4 = new qo3.w
            android.content.Context r5 = r2.f28606a
            r4.<init>(r5)
            r5 = 2131495244(0x7f0c094c, float:1.861402E38)
            r4.mo12470j(r5)
            android.view.View r5 = r4.f36927f
            r6 = 2131300749(0x7f09118d, float:1.8219536E38)
            android.view.View r5 = r5.findViewById(r6)
            il1.o6 r6 = new il1.o6
            r6.<init>(r4)
            r5.setOnClickListener(r6)
            android.view.View r5 = r4.f36927f
            r6 = 2131300751(0x7f09118f, float:1.821954E38)
            android.view.View r5 = r5.findViewById(r6)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            androidx.recyclerview.widget.LinearLayoutManager r6 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r7 = r5.getContext()
            r6.<init>(r7)
            r5.setLayoutManager(r6)
            qk1.p0 r6 = new qk1.p0
            r6.<init>()
            r6.f36710d = r3
            il1.q6 r3 = new il1.q6
            r3.<init>(r2, r4, r5)
            r6.f36711e = r3
            r5.setAdapter(r6)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r2, r3)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            if (r0 == 0) goto L_0x0236
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131165337(0x7f070099, float:1.7944888E38)
            int r0 = r0.getDimensionPixelOffset(r3)
            goto L_0x024e
        L_0x0236:
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2131165359(0x7f0700af, float:1.7944933E38)
            int r0 = r0.getDimensionPixelOffset(r3)
            android.content.Context r3 = r5.getContext()
            int r3 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r3)
            int r0 = r0 + r3
        L_0x024e:
            r2.bottomMargin = r0
            r4.mo5086o()
        L_0x0253:
            return
        L_0x0254:
            java.lang.String r0 = r0.f30980a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "anchor pause live:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ",networkEnable:"
            r4.append(r2)
            r4.append(r3)
            r2 = 33
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            kj1.e1 r0 = r1.f31809a
            com.tencent.mm.ui.MMActivity r0 = r0.f30985d
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828931(0x7f1120c3, float:1.9290817E38)
            java.lang.String r2 = r2.getString(r3)
            nj3.C76912y0.m92763b(r0, r2)
            return
        L_0x028e:
            kj1.e1 r0 = r1.f31809a
            com.tencent.mm.ui.MMActivity r0 = r0.f30985d
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131828932(0x7f1120c4, float:1.9290819E38)
            java.lang.String r2 = r2.getString(r3)
            nj3.C76912y0.m92763b(r0, r2)
            return
        L_0x02a5:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kj1.C10155g2.mo10525t(kj1.e1):void");
    }
}
