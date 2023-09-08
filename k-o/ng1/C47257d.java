package ng1;

import com.tencent.p014mm.p136ui.MMActivity;
import d60.C58124b;
import fj1.C45795b;
import gy3.C87412m;
import java.util.ArrayList;
import kg1.C10075a;
import qj1.C62660c;

/* renamed from: ng1.d */
public final class C47257d {

    /* renamed from: a */
    public final MMActivity f126863a;

    /* renamed from: b */
    public final C45795b f126864b;

    /* renamed from: c */
    public final C58124b f126865c;

    /* renamed from: d */
    public final C62660c f126866d;

    /* renamed from: e */
    public ArrayList<C10075a> f126867e = new ArrayList<>();

    public C47257d(MMActivity mMActivity, C45795b bVar, C58124b bVar2, C62660c cVar) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(bVar2, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f126863a = mMActivity;
        this.f126864b = bVar;
        this.f126865c = bVar2;
        this.f126866d = cVar;
    }

    /* renamed from: a */
    public final void mo72284a() {
        if (this.f126867e.size() > 1) {
            C10075a aVar = this.f126867e.get(0);
            C87412m.m108593f(aVar, "viewPagerDataList[0]");
            this.f126867e.clear();
            this.f126867e.add(aVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0139, code lost:
        if (r11 == null) goto L_0x013d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72285b(android.os.Bundle r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.Class<cl1.j> r2 = cl1.C39975j.class
            r23.mo72284a()
            fj1.b r3 = r0.f126864b
            androidx.lifecycle.i0 r3 = r3.mo71262a(r2)
            cl1.j r3 = (cl1.C39975j) r3
            bl1.k r3 = r3.f107176s
            r4 = 0
            if (r3 == 0) goto L_0x0019
            androidx.lifecycle.z<java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.u>> r3 = r3.f106764c
            goto L_0x001a
        L_0x0019:
            r3 = r4
        L_0x001a:
            if (r3 == 0) goto L_0x0242
            java.lang.Object r3 = r3.getValue()
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 == 0) goto L_0x0242
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0242
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            bl1.u r5 = (bl1.C39807u) r5
            java.lang.String r6 = r5.f106814a
            mg1.a r7 = mg1.C10886a.f32497a
            java.lang.String r8 = "boxId"
            gy3.C87412m.m108594g(r6, r8)
            mg1.C10886a.f32498b = r6
            r8 = 0
            r7.mo11103a(r8)
            qj1.c r7 = r0.f126866d
            java.lang.Class<com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin> r9 = com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin.class
            qj1.c r7 = r7.mo87687E0(r9)
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r7 = (com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin) r7
            if (r7 != 0) goto L_0x0074
            com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin r7 = new com.tencent.mm.plugin.finder.live.plugin.FinderLiveBoxCommentPlugin
            r9 = 2131494861(0x7f0c07cd, float:1.8613242E38)
            com.tencent.mm.ui.MMActivity r10 = r0.f126863a
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            android.view.View r9 = r10.inflate(r9, r4)
            java.lang.String r10 = "from(context).inflate(id, null)"
            gy3.C87412m.m108593f(r9, r10)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            d60.b r10 = r0.f126865c
            r7.<init>(r9, r10)
        L_0x0074:
            r7.mo64546d1()
            r9 = 1
            if (r1 == 0) goto L_0x0084
            java.lang.String r10 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            boolean r10 = r1.getBoolean(r10)
            if (r10 != r9) goto L_0x0084
            r10 = 1
            goto L_0x0085
        L_0x0084:
            r10 = 0
        L_0x0085:
            java.lang.String r11 = r7.f111632q
            boolean r11 = gy3.C87412m.m108589b(r6, r11)
            java.lang.String r12 = "FinderLiveBoxCommentPlugin"
            if (r11 == 0) goto L_0x00a5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "createBoxComment same id:"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            goto L_0x01d8
        L_0x00a5:
            r7.mo64548f1(r6)
            androidx.lifecycle.i0 r11 = r7.mo87696x0(r2)
            cl1.j r11 = (cl1.C39975j) r11
            bl1.k r11 = r11.f107176s
            if (r11 == 0) goto L_0x013c
            int r13 = r6.length()
            if (r13 != 0) goto L_0x00ba
            r13 = 1
            goto L_0x00bb
        L_0x00ba:
            r13 = 0
        L_0x00bb:
            if (r13 == 0) goto L_0x00c6
            java.util.ArrayList r11 = new java.util.ArrayList
            sx3.f0 r13 = sx3.C64186f0.f181907d
            r11.<init>(r13)
            r8 = 1
            goto L_0x0139
        L_0x00c6:
            bl1.u r13 = r11.mo62413d(r6)
            if (r13 == 0) goto L_0x012e
            te3.xi r14 = r13.f106817d
            java.util.LinkedList<te3.dj> r14 = r14.f144667g
            java.util.ArrayList<bl1.b> r13 = r13.f106815b
            bl1.q r15 = bl1.C39803q.f106809d
            o40.C61926c.m72673R(r13, r15)
            java.lang.String r15 = "memDataList"
            gy3.C87412m.m108593f(r14, r15)
            bl1.r r15 = bl1.C39804r.f106810d
            o40.C61926c.m72675T(r14, r15)
            te3.xs0 r15 = new te3.xs0
            r15.<init>()
            r4 = 10001(0x2711, float:1.4014E-41)
            r15.f144903e = r4
            r8 = -1
            r15.f144913r = r8
            te3.mt0 r8 = new te3.mt0
            r8.<init>()
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131827109(0x7f1119a5, float:1.9287121E38)
            java.lang.String r4 = r9.getString(r4)
            r8.f138195d = r4
            byte[] r4 = r8.toByteArray()
            pe3.b r4 = pe3.C89349b.m111674a(r4)
            r15.f144906h = r4
            bl1.y r4 = new bl1.y
            r8 = 1
            r4.<init>(r8, r15)
            bl1.k$b r9 = bl1.C39786k.f106760i
            te3.dj r9 = new te3.dj
            r9.<init>()
            te3.xs0 r15 = r4.f106734e
            r9.f132361d = r15
            boolean r15 = r4.f106733d
            r9.f132362e = r15
            int r15 = r4.f106735f
            r9.f132363f = r15
            boolean r15 = r4.f106736g
            r9.f132364g = r15
            r13.add(r4)
            r14.add(r9)
            goto L_0x012f
        L_0x012e:
            r8 = 1
        L_0x012f:
            bl1.u r4 = r11.mo62413d(r6)
            if (r4 == 0) goto L_0x0138
            java.util.ArrayList<bl1.b> r11 = r4.f106815b
            goto L_0x0139
        L_0x0138:
            r11 = 0
        L_0x0139:
            if (r11 != 0) goto L_0x0144
            goto L_0x013d
        L_0x013c:
            r8 = 1
        L_0x013d:
            java.util.ArrayList r11 = new java.util.ArrayList
            sx3.f0 r4 = sx3.C64186f0.f181907d
            r11.<init>(r4)
        L_0x0144:
            r19 = r11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "createBoxComment "
            r4.append(r9)
            int r9 = r7.hashCode()
            r4.append(r9)
            java.lang.String r9 = " id:"
            r4.append(r9)
            r4.append(r6)
            java.lang.String r9 = ",fromMiniWindow:"
            r4.append(r9)
            r4.append(r10)
            java.lang.String r9 = ", dataSize:"
            r4.append(r9)
            int r9 = r19.size()
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            int r4 = r19.size()
            if (r4 <= 0) goto L_0x0184
            if (r10 != 0) goto L_0x0184
            r9 = 1
            goto L_0x0185
        L_0x0184:
            r9 = 0
        L_0x0185:
            r7.mo64550h1(r9)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter
            jq3.j r18 = com.tencent.p014mm.plugin.finder.live.comment.BoxCommentConfig.f111610c
            r20 = 0
            r21 = 4
            r22 = 0
            r17 = r4
            r17.<init>(r18, r19, r20, r21, r22)
            r7.f111638w = r4
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r7.mo64542Z0()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter<bl1.b> r8 = r7.f111638w
            r4.setAdapter(r8)
            androidx.lifecycle.i0 r4 = r7.mo87696x0(r2)
            cl1.j r4 = (cl1.C39975j) r4
            vg1.g r8 = r7.mo64545c1()
            java.lang.String r9 = "notifier"
            gy3.C87412m.m108594g(r8, r9)
            bl1.k r4 = r4.f107176s
            if (r4 == 0) goto L_0x01d8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "setMsgNotifier,boxId "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = ", notifier:"
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "Finder.BoxDataStore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, bl1.k$a> r4 = r4.f106765d
            r4.put(r6, r8)
        L_0x01d8:
            r4 = 0
            r7.mo10792g(r4)
            android.view.ViewGroup r4 = r7.f166287d
            android.view.ViewParent r4 = r4.getParent()
            boolean r6 = r4 instanceof android.view.ViewGroup
            if (r6 == 0) goto L_0x01e9
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x01ea
        L_0x01e9:
            r4 = 0
        L_0x01ea:
            if (r4 == 0) goto L_0x01f1
            android.view.ViewGroup r6 = r7.f166287d
            r4.removeView(r6)
        L_0x01f1:
            java.util.ArrayList<kg1.a> r4 = r0.f126867e
            com.tencent.mm.ui.MMActivity r6 = r0.f126863a
            java.lang.String r8 = "context"
            gy3.C87412m.m108594g(r6, r8)
            kg1.a r6 = new kg1.a
            java.lang.String r12 = r5.f106814a
            java.lang.String r8 = "groupId"
            gy3.C87412m.m108594g(r12, r8)
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.get(r12)
            if (r8 != 0) goto L_0x0222
            r8 = 2131827459(0x7f111b03, float:1.9287831E38)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r8)
            java.lang.String r9 = "getString(R.string.finde…_gala_bottom_content_box)"
            gy3.C87412m.m108593f(r8, r9)
            goto L_0x0233
        L_0x0222:
            java.lang.Class<d62.i> r9 = d62.C75339i.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            d62.i r9 = (d62.C75339i) r9
            java.lang.String r8 = r9.pv0(r8, r12)
            java.lang.String r9 = "getService(IContactCommD…tDisplayName(ct, groupId)"
            gy3.C87412m.m108593f(r8, r9)
        L_0x0233:
            r13 = r8
            long r14 = r5.f106816c
            r11 = r6
            r16 = r7
            r11.<init>(r12, r13, r14, r16)
            r4.add(r6)
            r4 = 0
            goto L_0x002c
        L_0x0242:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ng1.C47257d.mo72285b(android.os.Bundle):void");
    }
}
