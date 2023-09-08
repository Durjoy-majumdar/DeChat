package mj0;

import android.content.Context;
import com.tencent.magicbrush.C80301a;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84197h;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import gy3.C87412m;
import kr0.C88267e;
import p1017od.C89157e;
import p760ya.C91383b;
import pj0.C89355a;

public final class a$$l extends C91383b {

    /* renamed from: j */
    public final /* synthetic */ C88732a f256122j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a$$l(C88732a aVar, Context context, C83165i iVar, boolean z, boolean z2, int i, boolean z3) {
        super(context, iVar, z, z2, i, z3);
        this.f256122j = aVar;
    }

    /* renamed from: b */
    public void mo123173b(AppBrandRuntime appBrandRuntime) {
        boolean z;
        super.mo123173b(appBrandRuntime);
        C89355a aVar = C89355a.f257342a;
        C80301a aVar2 = this.f262085c;
        C87412m.m108591d(aVar2);
        aVar.mo123710a(aVar2, appBrandRuntime);
        C88732a aVar3 = this.f256122j;
        QualitySessionRuntime c = C84185b.m103770c(((C88267e) aVar3.mo124764Z()).getAppId(), true);
        if (c != null) {
            C84197h hVar = c.f245864y;
            synchronized (hVar) {
                z = hVar.f245937c != null;
            }
            if (z) {
                C89157e eVar = aVar3.mo120910U().f235059h;
                synchronized (eVar.f256898a) {
                    if (eVar.f256898a.f235052a != 0) {
                        MBRuntime mBRuntime = eVar.f256898a;
                        mBRuntime.nativeSetEnableInspectFpsVariance(mBRuntime.f235052a, true);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x027e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo120929c(p1017od.C89166m r11) {
        /*
            r10 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            super.mo120929c(r11)
            di3.d r1 = di3.C86312j.m106911c(r0)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_magicbrush_allow_antialias
            r3 = 0
            boolean r1 = r1.mo58784wf(r2, r3)
            od.n$a r2 = r11.f256980m
            ny3.m<java.lang.Object>[] r4 = p1017od.C89167n.f256956L
            r5 = 6
            r5 = r4[r5]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.mo125228b(r11, r5, r1)
            nj0.f r1 = nj0.C88966f.f256550c
            mj0.a r2 = r10.f256122j
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r2.mo124764Z()
            kr0.e r2 = (kr0.C88267e) r2
            android.content.Context r2 = r2.getContext()
            float r1 = r1.mo123350i(r2)
            od.n$a r2 = r11.f256984q
            r5 = 10
            r5 = r4[r5]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2.mo125228b(r11, r5, r1)
            nj0.y r1 = nj0.C88985y.f256577c
            java.lang.Object r1 = r1.mo123353e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r2 = "WAGameConfigWxbct"
            r5 = 1
            if (r1 != 0) goto L_0x0057
            java.lang.String r0 = "getActuallyConfig self == false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x00d8
        L_0x0057:
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_magicbrush_gcfactor
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L_0x006e
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = r0.Y60(r1, r6)
            goto L_0x00cb
        L_0x006e:
            boolean r7 = r6 instanceof java.lang.Float
            if (r7 == 0) goto L_0x0085
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            float r6 = r6.floatValue()
            float r0 = r0.mo58785xe(r1, r6)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L_0x00cb
        L_0x0085:
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x009c
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            int r6 = r6.intValue()
            int r0 = r0.mo58779Qe(r1, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00cb
        L_0x009c:
            boolean r7 = r6 instanceof java.lang.Long
            if (r7 == 0) goto L_0x00b3
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            long r6 = r6.longValue()
            long r0 = r0.mo58777He(r1, r6)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00cb
        L_0x00b3:
            boolean r7 = r6 instanceof java.lang.Boolean
            if (r7 == 0) goto L_0x02ce
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            boolean r0 = r0.mo58784wf(r1, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00cb:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00da
            java.lang.String r0 = "getActuallyConfig gcfactor == 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00d8:
            r0 = 0
            goto L_0x00f4
        L_0x00da:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "getActuallyConfig gcfactor != 0 ["
            r1.append(r6)
            r1.append(r0)
            java.lang.String r0 = "], enable wxbct"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            r0 = 1
        L_0x00f4:
            od.n$a r1 = r11.f256985r
            r2 = 12
            r2 = r4[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r0)
            nj0.w r0 = nj0.C88983w.f256575c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            mj0.a r1 = r10.f256122j
            boolean r1 = r1.mo123165c1()
            if (r1 == 0) goto L_0x0129
            nj0.x r1 = nj0.C88984x.f256576c
            java.lang.Object r1 = r1.mo123353e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0129
            wd.a$b r0 = p1059wd.C90954a.C90956b.NativeLocker
            r11.mo123517e(r0)
            goto L_0x0144
        L_0x0129:
            if (r0 != 0) goto L_0x0131
            wd.a$b r0 = p1059wd.C90954a.C90956b.EglSurfaceSwapLocker
            r11.mo123517e(r0)
            goto L_0x0144
        L_0x0131:
            mj0.a r0 = r10.f256122j
            boolean r0 = r0.mo123165c1()
            if (r0 == 0) goto L_0x013f
            wd.a$b r0 = p1059wd.C90954a.C90956b.ChoreographerInMainThread
            r11.mo123517e(r0)
            goto L_0x0144
        L_0x013f:
            wd.a$b r0 = p1059wd.C90954a.C90956b.ChoreographerInJsThread
            r11.mo123517e(r0)
        L_0x0144:
            nj0.r r0 = nj0.C88978r.f256570c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x015c
            wj0.b r0 = new wj0.b
            mj0.a r1 = r10.f256122j
            r0.<init>(r1)
            r11.f256978k = r0
            goto L_0x0165
        L_0x015c:
            wj0.c r0 = new wj0.c
            mj0.a r1 = r10.f256122j
            r0.<init>(r1)
            r11.f256978k = r0
        L_0x0165:
            nj0.g r0 = nj0.C88967g.f256557c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            nj0.t r1 = nj0.C88980t.f256572c
            java.lang.Object r1 = r1.mo123353e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            nj0.u r2 = nj0.C88981u.f256573c
            java.lang.Object r2 = r2.mo123353e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "yes"
            java.lang.String r8 = "no"
            if (r0 == 0) goto L_0x0195
            r9 = r7
            goto L_0x0196
        L_0x0195:
            r9 = r8
        L_0x0196:
            r6[r3] = r9
            if (r1 == 0) goto L_0x019c
            r9 = r7
            goto L_0x019d
        L_0x019c:
            r9 = r8
        L_0x019d:
            r6[r5] = r9
            r9 = 2
            if (r2 == 0) goto L_0x01a3
            goto L_0x01a4
        L_0x01a3:
            r7 = r8
        L_0x01a4:
            r6[r9] = r7
            java.lang.String r7 = "MicroMsg.AppBrandGameServiceLogicImpWC"
            java.lang.String r8 = "[hilive] supportHardCodec: %s useHardDecode: %s useHardEncode: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            if (r0 == 0) goto L_0x01b3
            if (r1 == 0) goto L_0x01b3
            r1 = 1
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            od.n$a r6 = r11.f256962F
            r8 = 25
            r8 = r4[r8]
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6.mo125228b(r11, r8, r1)
            if (r0 == 0) goto L_0x01c7
            if (r2 == 0) goto L_0x01c7
            r0 = 1
            goto L_0x01c8
        L_0x01c7:
            r0 = 0
        L_0x01c8:
            od.n$a r1 = r11.f256961E
            r2 = 24
            r2 = r4[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r0)
            nj0.m r0 = nj0.C88974m.f256566c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            od.n$a r1 = r11.f256963G
            r2 = 26
            r2 = r4[r2]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r6)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r3] = r0
            java.lang.String r0 = "dl: supportETC2ASTC[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            wd.a$b r1 = r11.mo123513a()
            java.lang.String r1 = r1.toString()
            r0[r3] = r1
            java.lang.String r1 = "hy: use animation handler: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
            nj0.d r0 = nj0.C88964d.f256548c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            od.n$a r1 = r11.f256992y
            r2 = 17
            r2 = r4[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r0)
            nj0.p r0 = nj0.C88976p.f256568c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r11.mo123522j(r0)
            nj0.c r0 = nj0.C88963c.f256547c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0244
            r0 = 1
            goto L_0x0245
        L_0x0244:
            r0 = 0
        L_0x0245:
            od.n$a r1 = r11.f256959C
            r2 = 22
            r2 = r4[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r0)
            nj0.a r0 = nj0.C88961a.f256545c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0262
            r0 = 1
            goto L_0x0263
        L_0x0262:
            r0 = 0
        L_0x0263:
            od.n$a r1 = r11.f256982o
            r2 = 8
            r2 = r4[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r0)
            nj0.b r0 = nj0.C88962b.f256546c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x027f
            r3 = 1
        L_0x027f:
            od.n$a r0 = r11.f256960D
            r1 = 23
            r1 = r4[r1]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r0.mo125228b(r11, r1, r2)
            nj0.l r0 = nj0.C88973l.f256565c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            od.n$a r1 = r11.f256958B
            r2 = 21
            r2 = r4[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r0)
            nj0.e r0 = nj0.C88965e.f256549c
            java.lang.Object r0 = r0.mo123353e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            od.n$a r1 = r11.f256964H
            r2 = 27
            r2 = r4[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.mo125228b(r11, r2, r0)
            mj0.a r0 = r10.f256122j
            zb.a r0 = r0.mo125522h0()
            com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni r0 = r0.f262484a
            long r0 = r0.getNativeHandle()
            r11.mo123518f(r0)
            return
        L_0x02ce:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Code should not reach"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mj0.a$$l.mo120929c(od.m):void");
    }

    /* renamed from: d */
    public void mo122637d(C80301a aVar, long j) {
        C84185b.f245912a.mo116890i(((C88267e) this.f256122j.mo124764Z()).mo114335b0(), ((C88267e) this.f256122j.mo124764Z()).getAppId(), j);
    }
}
