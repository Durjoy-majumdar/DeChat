package cj1;

import a14.C53973z1;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C87412m;
import java.lang.ref.WeakReference;

/* renamed from: cj1.m4 */
public final class C54792m4 {

    /* renamed from: a */
    public WeakReference<MMFinderUI> f153609a;

    /* renamed from: b */
    public final String f153610b = "Finder.LiveRotationHelper";

    /* renamed from: c */
    public boolean f153611c;

    /* renamed from: d */
    public C53973z1 f153612d;

    public C54792m4(WeakReference<MMFinderUI> weakReference) {
        C87412m.m108594g(weakReference, "rContext");
        this.f153609a = weakReference;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m61659a(cj1.C54792m4 r20, com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI r21, wx3.C15601d r22) {
        /*
            r0 = r20
            r1 = r22
            r20.getClass()
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            boolean r3 = r1 instanceof cj1.C54788l4
            if (r3 == 0) goto L_0x001c
            r3 = r1
            cj1.l4 r3 = (cj1.C54788l4) r3
            int r4 = r3.f153582h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x001c
            int r4 = r4 - r5
            r3.f153582h = r4
            goto L_0x0021
        L_0x001c:
            cj1.l4 r3 = new cj1.l4
            r3.<init>(r0, r1)
        L_0x0021:
            r14 = r3
            java.lang.Object r1 = r14.f153580f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r14.f153582h
            r15 = 0
            r13 = 0
            r11 = 1
            if (r4 == 0) goto L_0x0049
            if (r4 != r11) goto L_0x0041
            int r0 = r14.f153579e
            java.lang.Object r3 = r14.f153578d
            cj1.m4 r3 = (cj1.C54792m4) r3
            kotlin.ResultKt.throwOnFailure(r1)
            r4 = r1
            r16 = 0
            r19 = 1
            r1 = r0
            r0 = r3
            goto L_0x00ac
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r1)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r1.getClass()
            fj1.b r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r1 == 0) goto L_0x005e
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154350p0
            goto L_0x005f
        L_0x005e:
            r1 = 1
        L_0x005f:
            fj1.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r4 == 0) goto L_0x006a
            androidx.lifecycle.i0 r4 = r4.mo71262a(r2)
            cl1.o r4 = (cl1.C54991o) r4
            goto L_0x006b
        L_0x006a:
            r4 = r15
        L_0x006b:
            if (r4 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r4.f154350p0 = r13
        L_0x0070:
            er1.z r4 = er1.C58794z.f168327a
            r6 = 21
            r5 = 2131832150(0x7f112d56, float:1.9297346E38)
            r7 = r21
            java.lang.String r8 = r7.getString(r5)
            java.lang.String r5 = "context.getString(com.te…live_room_mini_view_fail)"
            gy3.C87412m.m108593f(r8, r5)
            r9 = 0
            r10 = 1
            java.lang.String r12 = vc3.C78382a.m94650b()
            java.lang.String r5 = "getMessageChannelIdUse()"
            gy3.C87412m.m108593f(r12, r5)
            r16 = 20000(0x4e20, double:9.8813E-320)
            r14.f153578d = r0
            r14.f153579e = r1
            r14.f153582h = r11
            java.lang.String r18 = "FinderLiveRotationHelper"
            r5 = r21
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r12
            r19 = 1
            r11 = r16
            r16 = 0
            r13 = r18
            java.lang.Object r4 = r4.mo83987b(r5, r6, r7, r8, r9, r10, r11, r13, r14)
            if (r4 != r3) goto L_0x00ac
            goto L_0x00e1
        L_0x00ac:
            er1.o r4 = (er1.C58752o) r4
            boolean r3 = r4 instanceof er1.C58752o.C58755c
            if (r3 == 0) goto L_0x00bb
            java.lang.String r0 = r0.f153610b
            java.lang.String r3 = "ShowWarningAlert true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r13 = 1
            goto L_0x00c3
        L_0x00bb:
            java.lang.String r0 = r0.f153610b
            java.lang.String r3 = "ShowWarningAlert false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            r13 = 0
        L_0x00c3:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            fj1.b r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r0 == 0) goto L_0x00d3
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            r15 = r0
            cl1.o r15 = (cl1.C54991o) r15
        L_0x00d3:
            if (r15 != 0) goto L_0x00d6
            goto L_0x00dd
        L_0x00d6:
            if (r1 == 0) goto L_0x00da
            r0 = 1
            goto L_0x00db
        L_0x00da:
            r0 = 0
        L_0x00db:
            r15.f154350p0 = r0
        L_0x00dd:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
        L_0x00e1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54792m4.m61659a(cj1.m4, com.tencent.mm.plugin.finder.ui.MMFinderUI, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = (r0 = r0.getResources()).getConfiguration();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo75696b() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r0 = r7.f153609a
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r0
            r1 = 0
            if (r0 == 0) goto L_0x001e
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x001e
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x001e
            int r0 = r0.orientation
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r2 = 2
            r3 = 0
            if (r0 != 0) goto L_0x0024
            goto L_0x007f
        L_0x0024:
            int r4 = r0.intValue()
            if (r4 != r2) goto L_0x007f
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r2 = r7.f153609a
            java.lang.Object r2 = r2.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r2 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            r2.mo79124M7(r4)
            r2.setRequestedOrientation(r4)
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            java.lang.String r2 = r7.f153610b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "changeScreenToPortrait curOrientation:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r0 = ",requestOrientation:"
            r5.append(r0)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r0 = r7.f153609a
            java.lang.Object r0 = r0.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r0 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r0
            if (r0 == 0) goto L_0x0063
            int r0 = r0.getRequestedOrientation()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0063:
            r5.append(r1)
            java.lang.String r0 = ",change:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = r7.f153610b
            java.lang.String r1 = "disableAutoRotation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r7.f153611c = r3
            r3 = r4
        L_0x007f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54792m4.mo75696b():boolean");
    }
}
