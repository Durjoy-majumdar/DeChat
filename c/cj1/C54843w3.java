package cj1;

import ak1.C54116w;
import cl1.C0702z0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import fj1.C45795b;
import gg1.C32444a;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import o40.C61926c;
import ok1.C62042e;
import pe3.C89349b;
import te3.C49765hx0;
import te3.C51828wg0;
import te3.C51887ww2;
import te3.C52013xs0;
import te3.C52294zq0;
import te3.C64348eu0;
import te3.C64674r41;
import vp1.C65834e;

/* renamed from: cj1.w3 */
public final class C54843w3 {

    /* renamed from: a */
    public static final C54843w3 f153747a = new C54843w3();

    /* renamed from: b */
    public static final int[] f153748b = {1, CdnLogic.kMediaTypeFavoriteBigFile, 10008, 100000, 10006, 20001, 20002, 20013, 20014, 100001, 20019, 20020, 20031, 20035, 20031, 20032, 20034, 1000066};

    static {
        C32444a aVar = C32444a.f86121a;
        int intValue = C32444a.f86178o0.mo60266n().intValue();
        Log.m105924i("Finder.FinderLiveMsgManager", "saveMyselfCommentValue:" + intValue);
    }

    /* renamed from: a */
    public final void mo75786a(C45795b bVar, int i, String str) {
        String str2;
        if (bVar != null) {
            if (i == 1) {
                str2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.men, new Object[]{str});
            } else {
                str2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.mep, new Object[]{str});
            }
            C87412m.m108593f(str2, "if (modType == Constants…, nickname)\n            }");
            C64674r41 r412 = new C64674r41();
            r412.f185127g = 100001;
            r412.f185126f = str2;
            C0544h hVar = new C0544h(r412);
            hVar.f1322b = i;
            hVar.f1323c = str;
            ((C0702z0) bVar.mo71262a(C0702z0.class)).f1672f.add(hVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        if (gy3.C87412m.m108589b(r1, java.lang.Boolean.TRUE) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bc, code lost:
        if (gy3.C87412m.m108589b(r1, java.lang.Boolean.TRUE) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75787b(fj1.C45795b r12, te3.C64295cs1 r13) {
        /*
            r11 = this;
            java.lang.Class<cl1.z0> r0 = cl1.C0702z0.class
            java.lang.String r1 = "Finder.FinderLiveMsgManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#appendJumpGameInfo: game_name:"
            r2.append(r3)
            r3 = 0
            if (r13 == 0) goto L_0x0014
            java.lang.String r4 = r13.f182561e
            goto L_0x0015
        L_0x0014:
            r4 = r3
        L_0x0015:
            r2.append(r4)
            java.lang.String r4 = ", game_type:"
            r2.append(r4)
            if (r13 == 0) goto L_0x0026
            int r4 = r13.f182562f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0027
        L_0x0026:
            r4 = r3
        L_0x0027:
            r2.append(r4)
            java.lang.String r4 = ", is_show_entrance:"
            r2.append(r4)
            if (r13 == 0) goto L_0x0038
            boolean r4 = r13.f182565i
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0039
        L_0x0038:
            r4 = r3
        L_0x0039:
            r2.append(r4)
            java.lang.String r4 = ", report_info:"
            r2.append(r4)
            if (r13 == 0) goto L_0x0046
            java.lang.String r4 = r13.f182566j
            goto L_0x0047
        L_0x0046:
            r4 = r3
        L_0x0047:
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            if (r12 == 0) goto L_0x0133
            if (r13 != 0) goto L_0x0057
            goto L_0x0133
        L_0x0057:
            boolean r1 = r13.f182565i
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L_0x00a2
            boolean r1 = r13.f182565i
            if (r1 != 0) goto L_0x0066
            goto L_0x00a2
        L_0x0066:
            int r1 = r13.f182562f
            if (r1 == r4) goto L_0x00a4
            r5 = 2
            if (r1 == r5) goto L_0x0086
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "checkGameInfoValid failed, wrong gameType:"
            r1.append(r5)
            int r5 = r13.f182562f
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "Finder.FinderLiveMsgManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
            goto L_0x00a2
        L_0x0086:
            te3.za1 r1 = r13.f182564h
            if (r1 == 0) goto L_0x0095
            te3.j21 r1 = r1.f186647e
            if (r1 == 0) goto L_0x0095
            boolean r1 = r1.f183764g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0096
        L_0x0095:
            r1 = r3
        L_0x0096:
            if (r1 == 0) goto L_0x00a2
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r5)
            if (r1 == 0) goto L_0x00a2
        L_0x00a0:
            r1 = 1
            goto L_0x00bf
        L_0x00a2:
            r1 = 0
            goto L_0x00bf
        L_0x00a4:
            te3.qy0 r1 = r13.f182563g
            if (r1 == 0) goto L_0x00b3
            te3.j21 r1 = r1.f185094e
            if (r1 == 0) goto L_0x00b3
            boolean r1 = r1.f183764g
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x00b4
        L_0x00b3:
            r1 = r3
        L_0x00b4:
            if (r1 == 0) goto L_0x00a2
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r5)
            if (r1 == 0) goto L_0x00a2
            goto L_0x00a0
        L_0x00bf:
            if (r1 != 0) goto L_0x00c9
            java.lang.String r12 = "Finder.FinderLiveMsgManager"
            java.lang.String r13 = "appendJumpGameInfo terminated, checkGameInfoValid failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r13)
            return
        L_0x00c9:
            te3.r41 r1 = new te3.r41
            r1.<init>()
            r5 = 20040(0x4e48, float:2.8082E-41)
            r1.f185127g = r5
            java.lang.String r6 = r13.f182561e
            r1.f185126f = r6
            cj1.j3 r6 = new cj1.j3
            r6.<init>(r1, r13)
            androidx.lifecycle.i0 r1 = r12.mo71262a(r0)
            cl1.z0 r1 = (cl1.C0702z0) r1
            java.util.List<cj1.o5> r1 = r1.f1672f
            java.lang.String r7 = "roomData.business(LiveMs…lice::class.java).msgList"
            gy3.C87412m.m108593f(r1, r7)
            monitor-enter(r1)
            java.util.Iterator r7 = r1.iterator()     // Catch:{ all -> 0x0130 }
        L_0x00ed:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0130 }
            if (r8 == 0) goto L_0x0114
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0130 }
            r9 = r8
            cj1.o5 r9 = (cj1.C0581o5) r9     // Catch:{ all -> 0x0130 }
            int r10 = r9.getType()     // Catch:{ all -> 0x0130 }
            if (r10 != r5) goto L_0x0110
            java.lang.String r9 = r9.getContent()     // Catch:{ all -> 0x0130 }
            te3.r41 r10 = r6.f1344a     // Catch:{ all -> 0x0130 }
            java.lang.String r10 = r10.f185126f     // Catch:{ all -> 0x0130 }
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r9, (java.lang.String) r10)     // Catch:{ all -> 0x0130 }
            if (r9 == 0) goto L_0x0110
            r9 = 1
            goto L_0x0111
        L_0x0110:
            r9 = 0
        L_0x0111:
            if (r9 == 0) goto L_0x00ed
            r3 = r8
        L_0x0114:
            monitor-exit(r1)
            if (r3 != 0) goto L_0x0122
            androidx.lifecycle.i0 r12 = r12.mo71262a(r0)
            cl1.z0 r12 = (cl1.C0702z0) r12
            java.util.List<cj1.o5> r12 = r12.f1672f
            r12.add(r6)
        L_0x0122:
            java.lang.Class<ak1.w> r12 = ak1.C54116w.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            ak1.w r12 = (ak1.C54116w) r12
            java.lang.String r13 = r13.f182566j
            r12.ky0(r2, r13)
            return
        L_0x0130:
            r12 = move-exception
            monitor-exit(r1)
            throw r12
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54843w3.mo75787b(fj1.b, te3.cs1):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009c A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75788c(fj1.C45795b r14) {
        /*
            r13 = this;
            java.lang.Class<cl1.z0> r0 = cl1.C0702z0.class
            if (r14 == 0) goto L_0x00c9
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r14.mo71262a(r1)
            cl1.o r1 = (cl1.C54991o) r1
            te3.db1 r1 = r1.f154368t2
            if (r1 == 0) goto L_0x00c9
            java.lang.String r2 = r1.f182664g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x001f
            int r2 = r2.length()
            if (r2 != 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r2 = 0
            goto L_0x0020
        L_0x001f:
            r2 = 1
        L_0x0020:
            r2 = r2 ^ r4
            r5 = 0
            if (r2 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r1 = r5
        L_0x0026:
            if (r1 == 0) goto L_0x00c9
            te3.r41 r2 = new te3.r41
            r2.<init>()
            r6 = 10018(0x2722, float:1.4038E-41)
            r2.f185127g = r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r1.f182663f
            r7.append(r8)
            java.lang.String r8 = " • "
            r7.append(r8)
            java.lang.String r8 = r1.f182664g
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.f185126f = r7
            cj1.l3 r7 = new cj1.l3
            r7.<init>(r2, r1)
            androidx.lifecycle.i0 r2 = r14.mo71262a(r0)
            cl1.z0 r2 = (cl1.C0702z0) r2
            java.util.List<cj1.o5> r2 = r2.f1672f
            java.lang.String r8 = "roomData.business(LiveMs…lice::class.java).msgList"
            gy3.C87412m.m108593f(r2, r8)
            monitor-enter(r2)
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x0062:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x009d
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00c6 }
            r10 = r9
            cj1.o5 r10 = (cj1.C0581o5) r10     // Catch:{ all -> 0x00c6 }
            int r11 = r10.getType()     // Catch:{ all -> 0x00c6 }
            if (r11 != r6) goto L_0x0099
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r11.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r12 = r1.f182663f     // Catch:{ all -> 0x00c6 }
            r11.append(r12)     // Catch:{ all -> 0x00c6 }
            java.lang.String r12 = " • "
            r11.append(r12)     // Catch:{ all -> 0x00c6 }
            java.lang.String r12 = r1.f182664g     // Catch:{ all -> 0x00c6 }
            r11.append(r12)     // Catch:{ all -> 0x00c6 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00c6 }
            java.lang.String r10 = r10.getContent()     // Catch:{ all -> 0x00c6 }
            boolean r10 = gy3.C87412m.m108589b(r11, r10)     // Catch:{ all -> 0x00c6 }
            if (r10 == 0) goto L_0x0099
            r10 = 1
            goto L_0x009a
        L_0x0099:
            r10 = 0
        L_0x009a:
            if (r10 == 0) goto L_0x0062
            r5 = r9
        L_0x009d:
            monitor-exit(r2)
            if (r5 != 0) goto L_0x00ab
            androidx.lifecycle.i0 r14 = r14.mo71262a(r0)
            cl1.z0 r14 = (cl1.C0702z0) r14
            java.util.List<cj1.o5> r14 = r14.f1672f
            r14.add(r7)
        L_0x00ab:
            java.lang.String r14 = "Finder.FinderLiveMsgManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "appendLocationTip:"
            r0.append(r1)
            te3.r41 r1 = r7.f1344a
            java.lang.String r1 = r1.f185126f
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            goto L_0x00c9
        L_0x00c6:
            r14 = move-exception
            monitor-exit(r2)
            throw r14
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54843w3.mo75788c(fj1.b):void");
    }

    /* renamed from: d */
    public final void mo75789d(C45795b bVar, int i, boolean z) {
        if (bVar != null) {
            String string = i == 1 ? z ? MMApplicationContext.getContext().getResources().getString(C0966R.string.mel) : MMApplicationContext.getContext().getResources().getString(C0966R.string.mem) : MMApplicationContext.getContext().getResources().getString(C0966R.string.mgg);
            C87412m.m108593f(string, "if (modType == Constants…nager_tips)\n            }");
            C64674r41 r412 = new C64674r41();
            r412.f185127g = 10001;
            r412.f185126f = string;
            ((C0702z0) bVar.mo71262a(C0702z0.class)).f1672f.add(new C0556j5(r412));
        }
    }

    /* renamed from: e */
    public final void mo75790e(C45795b bVar) {
        String str;
        Class cls = C54963d0.class;
        if (bVar != null) {
            C62042e eVar = C62042e.f176370a;
            C51887ww2 ww22 = ((C54963d0) bVar.mo71262a(cls)).f154048B;
            long j = 0;
            long j2 = ww22 != null ? ww22.f144323d : 0;
            eVar.getClass();
            boolean z = true;
            if (C61926c.m72696u((int) j2, 2)) {
                str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dwl);
            } else {
                C51887ww2 ww23 = ((C54963d0) bVar.mo71262a(cls)).f154048B;
                if (C61926c.m72696u((int) (ww23 != null ? ww23.f144323d : 0), 1)) {
                    str = MMApplicationContext.getContext().getResources().getString(C0966R.string.dwm);
                } else {
                    C51887ww2 ww24 = ((C54963d0) bVar.mo71262a(cls)).f154048B;
                    if (ww24 != null) {
                        j = ww24.f144323d;
                    }
                    str = C61926c.m72696u((int) j, 4) ? MMApplicationContext.getContext().getResources().getString(C0966R.string.dwk) : MMApplicationContext.getContext().getResources().getString(C0966R.string.dwj);
                }
            }
            C87412m.m108593f(str, "when {\n                F…          }\n            }");
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                C64674r41 r412 = new C64674r41();
                r412.f185127g = 10001;
                r412.f185126f = str;
                ((C0702z0) bVar.mo71262a(C0702z0.class)).f1672f.add(new C0556j5(r412));
            }
            Log.m105924i("Finder.FinderLiveMsgManager", "appendMicSettingTip:" + str);
        }
    }

    /* renamed from: f */
    public final void mo75791f(C45795b bVar, C51828wg0 wg02) {
        StringBuilder sb = new StringBuilder();
        sb.append("#appendOfficialAccountTips nick=");
        String str = null;
        sb.append(wg02 != null ? wg02.f144032d : null);
        sb.append(" user=");
        if (wg02 != null) {
            str = wg02.f144033e;
        }
        sb.append(str);
        Log.m105924i("Finder.FinderLiveMsgManager", sb.toString());
        if (bVar != null && wg02 != null) {
            C64674r41 r412 = new C64674r41();
            r412.f185127g = 10019;
            r412.f185126f = wg02.f144032d;
            ((C0702z0) bVar.mo71262a(C0702z0.class)).f1672f.add(new C54845x3(r412, wg02));
            ((C54116w) C86312j.m106911c(C54116w.class)).ly0(false, wg02.f144033e, wg02.f144032d);
        }
    }

    /* renamed from: g */
    public final void mo75792g(C45795b bVar) {
        C52294zq0 zq02;
        String str;
        T t;
        boolean z;
        Class cls = C0702z0.class;
        if (bVar != null && (zq02 = ((C54991o) bVar.mo71262a(C54991o.class)).f154328j) != null && (str = zq02.f146179d) != null) {
            C64674r41 r412 = new C64674r41();
            r412.f185127g = 10001;
            r412.f185126f = str;
            C0556j5 j5Var = new C0556j5(r412);
            List<C0581o5> list = ((C0702z0) bVar.mo71262a(cls)).f1672f;
            C87412m.m108593f(list, "roomData.business(LiveMs…lice::class.java).msgList");
            synchronized (list) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    C0581o5 o5Var = (C0581o5) t;
                    if (o5Var.getType() != 10001 || !C87412m.m108589b(str, o5Var.getContent())) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
            }
            if (t == null) {
                ((C0702z0) bVar.mo71262a(cls)).f1672f.add(0, j5Var);
            }
            Log.m105924i("Finder.FinderLiveMsgManager", "appendSysLawTip:" + j5Var.f1344a.f185126f);
            C32444a aVar = C32444a.f86121a;
            if (((Boolean) C32444a.f86196s2.mo60266n()).booleanValue()) {
                C52013xs0 xs02 = new C52013xs0();
                xs02.f144903e = 20031;
                C64348eu0 eu02 = new C64348eu0();
                eu02.f183030d = 1;
                eu02.f183031e = 65;
                eu02.f183032f = 75;
                xs02.f144906h = new C89349b(eu02.toByteArray());
                xs02.f144913r = System.currentTimeMillis();
                ((C0702z0) bVar.mo71262a(cls)).f1672f.add(new C0529d2(xs02));
                C52013xs0 xs03 = new C52013xs0();
                xs03.f144903e = 20031;
                C64348eu0 eu03 = new C64348eu0();
                eu03.f183030d = 1;
                eu03.f183031e = 45;
                eu03.f183032f = 55;
                xs03.f144906h = new C89349b(eu03.toByteArray());
                xs03.f144913r = xs02.f144913r + ((long) 3);
                ((C0702z0) bVar.mo71262a(cls)).f1672f.add(new C0529d2(xs03));
            }
        }
    }

    /* renamed from: h */
    public final void mo75793h(C45795b bVar, String str) {
        int i;
        FinderObject finderObject;
        String str2;
        String str3;
        String str4;
        Class cls = C0702z0.class;
        Class cls2 = C55001u.class;
        Class cls3 = C54991o.class;
        if (bVar != null) {
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                ((C54991o) bVar.mo71262a(cls3)).f154252S0 = str;
            } else {
                String str5 = ((C54991o) bVar.mo71262a(cls3)).f154252S0;
                if (!(str5 == null || str5.length() == 0)) {
                    str = ((C54991o) bVar.mo71262a(cls3)).f154252S0;
                } else {
                    if (((C55001u) bVar.mo71262a(cls2)).f154422s == null) {
                        FinderItem e = C65834e.f189316a.mo89871e(((C55001u) bVar.mo71262a(cls2)).f154416j);
                        if (e != null) {
                            str = e.getDescription();
                        }
                    } else {
                        FinderObjectDesc finderObjectDesc = ((C55001u) bVar.mo71262a(cls2)).f154422s;
                        if (finderObjectDesc != null) {
                            str = finderObjectDesc.description;
                        }
                    }
                    str = null;
                }
            }
            List<C0581o5> list = ((C0702z0) bVar.mo71262a(cls)).f1672f;
            C87412m.m108593f(list, "roomData.business(LiveMs…lice::class.java).msgList");
            synchronized (list) {
                Iterator<C0581o5> it = list.iterator();
                i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it.next().getType() == 100000) {
                        break;
                    }
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[START_LIVE], desc is empty:");
            sb.append(str == null || str.length() == 0);
            sb.append(", containWelcomeMsg:");
            sb.append(i != -1);
            Log.m105924i("Finder.FinderLiveMsgManager", sb.toString());
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z && i == -1 && (finderObject = ((C54991o) bVar.mo71262a(cls3)).f154341n) != null) {
                C64674r41 r412 = new C64674r41();
                C49765hx0 hx02 = new C49765hx0();
                FinderContact finderContact = new FinderContact();
                FinderContact finderContact2 = finderObject.contact;
                if (finderContact2 == null || (str2 = finderContact2.username) == null) {
                    str2 = "";
                }
                finderContact.username = str2;
                if (finderContact2 == null || (str3 = finderContact2.nickname) == null) {
                    str3 = "";
                }
                finderContact.nickname = str3;
                if (finderContact2 == null || (str4 = finderContact2.headUrl) == null) {
                    str4 = "";
                }
                finderContact.headUrl = str4;
                hx02.f134919d = finderContact;
                r412.f185132o = hx02;
                if (str == null) {
                    str = "";
                }
                r412.f185126f = str;
                r412.f185127g = 100000;
                C0556j5 j5Var = new C0556j5(r412);
                ((C0702z0) bVar.mo71262a(cls)).f1672f.add(j5Var);
                Log.m105924i("Finder.FinderLiveMsgManager", "appendWelcomeTip:" + j5Var.f1344a.f185126f);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: te3.wu0} */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<te3.C64895zs2> mo75794i(java.util.LinkedList<te3.C64674r41> r12, java.util.LinkedList<te3.C52013xs0> r13) {
        /*
            r11 = this;
            java.lang.String r0 = "remoteLiveMsg"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "remoteLiveAppMsg"
            gy3.C87412m.m108594g(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0013:
            boolean r1 = r12.hasNext()
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x00c6
            java.lang.Object r1 = r12.next()
            te3.r41 r1 = (te3.C64674r41) r1
            int[] r4 = f153748b
            int r5 = r1.f185127g
            boolean r4 = sx3.C110823p.m151008x(r4, r5)
            if (r4 == 0) goto L_0x0076
            te3.zs2 r4 = new te3.zs2
            r4.<init>()
            er1.w0 r5 = er1.C58782w0.f168290a
            int r6 = r1.f185127g
            int r5 = r5.mo83853l(r6)
            r4.f186858d = r5
            te3.hx0 r5 = r1.f185132o
            if (r5 == 0) goto L_0x0047
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r5.f134919d
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = r6.nickname
            if (r6 != 0) goto L_0x0048
        L_0x0047:
            r6 = r3
        L_0x0048:
            r4.f186859e = r6
            if (r5 == 0) goto L_0x0056
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r5.f134919d
            if (r6 == 0) goto L_0x0056
            java.lang.String r6 = r6.headUrl
            if (r6 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r3 = r6
        L_0x0056:
            r4.f186867p = r3
            java.lang.String r3 = r1.f185126f
            r4.f186860f = r3
            long r6 = r1.f185129i
            r4.f186862h = r6
            java.lang.String r3 = r1.f185130j
            r4.f186863i = r3
            java.lang.String r1 = r1.f185133p
            r4.f186864j = r1
            if (r5 == 0) goto L_0x0070
            te3.aw0 r1 = r5.f134924i
            if (r1 == 0) goto L_0x0070
            int r2 = r1.f130791f
        L_0x0070:
            r4.f186866o = r2
            r0.add(r4)
            goto L_0x0013
        L_0x0076:
            int r2 = r1.f185127g
            r4 = 10005(0x2715, float:1.402E-41)
            if (r2 != r4) goto L_0x0013
            te3.zs2 r2 = new te3.zs2
            r2.<init>()
            er1.w0 r4 = er1.C58782w0.f168290a
            int r5 = r1.f185127g
            int r4 = r4.mo83853l(r5)
            r2.f186858d = r4
            te3.hx0 r4 = r1.f185132o
            if (r4 == 0) goto L_0x0097
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r4.f134919d
            if (r5 == 0) goto L_0x0097
            java.lang.String r5 = r5.nickname
            if (r5 != 0) goto L_0x0098
        L_0x0097:
            r5 = r3
        L_0x0098:
            r2.f186859e = r5
            if (r4 == 0) goto L_0x00a6
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = r4.headUrl
            if (r4 != 0) goto L_0x00a5
            goto L_0x00a6
        L_0x00a5:
            r3 = r4
        L_0x00a6:
            r2.f186867p = r3
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131828205(0x7f111ded, float:1.9289344E38)
            java.lang.String r3 = r3.getString(r4)
            r2.f186860f = r3
            long r3 = r1.f185129i
            r2.f186862h = r3
            java.lang.String r3 = r1.f185130j
            r2.f186863i = r3
            java.lang.String r1 = r1.f185133p
            r2.f186864j = r1
            r0.add(r2)
            goto L_0x0013
        L_0x00c6:
            java.util.Iterator r12 = r13.iterator()
        L_0x00ca:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x02b9
            java.lang.Object r13 = r12.next()
            te3.xs0 r13 = (te3.C52013xs0) r13
            int r1 = r13.f144903e
            r4 = 20002(0x4e22, float:2.8029E-41)
            r5 = 1
            if (r1 == r4) goto L_0x023a
            r4 = 20009(0x4e29, float:2.8039E-41)
            r6 = 0
            if (r1 == r4) goto L_0x01a5
            r4 = 20014(0x4e2e, float:2.8046E-41)
            if (r1 == r4) goto L_0x0115
            r4 = 20036(0x4e44, float:2.8076E-41)
            if (r1 == r4) goto L_0x00eb
            goto L_0x00ca
        L_0x00eb:
            te3.zs2 r1 = new te3.zs2
            r1.<init>()
            er1.w0 r4 = er1.C58782w0.f168290a
            int r5 = r13.f144903e
            int r4 = r4.mo83853l(r5)
            r1.f186858d = r4
            cj1.f2 r4 = new cj1.f2
            r4.<init>(r13)
            java.lang.String r4 = r4.getContent()
            r1.f186860f = r4
            long r4 = r13.f144913r
            r1.f186862h = r4
            java.lang.String r4 = r13.f144904f
            r1.f186863i = r4
            java.lang.String r13 = r13.f144915t
            r1.f186864j = r13
            r0.add(r1)
            goto L_0x00ca
        L_0x0115:
            int r1 = r13.f144903e
            if (r1 != r4) goto L_0x012c
            te3.wu0 r1 = new te3.wu0
            r1.<init>()
            pe3.b r4 = r13.f144906h
            if (r4 == 0) goto L_0x0127
            byte[] r4 = r4.mo123703f()
            goto L_0x0128
        L_0x0127:
            r4 = r6
        L_0x0128:
            r1.parseFrom(r4)
            goto L_0x012d
        L_0x012c:
            r1 = r6
        L_0x012d:
            boolean r4 = r1 instanceof te3.C51877wu0
            if (r4 == 0) goto L_0x00ca
            te3.zs2 r7 = new te3.zs2
            r7.<init>()
            er1.w0 r8 = er1.C58782w0.f168290a
            int r9 = r13.f144903e
            int r8 = r8.mo83853l(r9)
            r7.f186858d = r8
            r7.f186859e = r3
            te3.hx0 r8 = r13.f144914s
            if (r8 == 0) goto L_0x014e
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.f134919d
            if (r8 == 0) goto L_0x014e
            java.lang.String r8 = r8.headUrl
            if (r8 != 0) goto L_0x014f
        L_0x014e:
            r8 = r3
        L_0x014f:
            r7.f186867p = r8
            if (r4 == 0) goto L_0x0154
            r6 = r1
        L_0x0154:
            if (r6 == 0) goto L_0x0159
            int r1 = r6.f144291d
            goto L_0x015a
        L_0x0159:
            r1 = 0
        L_0x015a:
            r7.f186866o = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            te3.hx0 r4 = r13.f144914s
            if (r4 == 0) goto L_0x016d
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x016d
            java.lang.String r4 = r4.nickname
            if (r4 != 0) goto L_0x016e
        L_0x016d:
            r4 = r3
        L_0x016e:
            r1.append(r4)
            r4 = 32
            r1.append(r4)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131828172(0x7f111dcc, float:1.9289277E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            int r8 = r7.f186866o
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5[r2] = r8
            java.lang.String r4 = r4.getString(r6, r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r7.f186860f = r1
            long r4 = r13.f144913r
            r7.f186862h = r4
            java.lang.String r1 = r13.f144904f
            r7.f186863i = r1
            java.lang.String r13 = r13.f144915t
            r7.f186864j = r13
            r0.add(r7)
            goto L_0x00ca
        L_0x01a5:
            te3.ju0 r1 = new te3.ju0
            r1.<init>()
            pe3.b r4 = r13.f144906h
            if (r4 == 0) goto L_0x01b3
            byte[] r4 = r4.mo123703f()
            goto L_0x01b4
        L_0x01b3:
            r4 = r6
        L_0x01b4:
            if (r4 != 0) goto L_0x01b7
            goto L_0x01c5
        L_0x01b7:
            r1.parseFrom(r4)     // Catch:{ Exception -> 0x01bb }
            goto L_0x01c5
        L_0x01bb:
            r4 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r2] = r4
            java.lang.String r4 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r3, r7)
        L_0x01c5:
            te3.zs2 r4 = new te3.zs2
            r4.<init>()
            er1.w0 r7 = er1.C58782w0.f168290a
            int r8 = r13.f144903e
            int r7 = r7.mo83853l(r8)
            r4.f186858d = r7
            te3.hx0 r7 = r13.f144914s
            if (r7 == 0) goto L_0x01e0
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r7.f134919d
            if (r8 == 0) goto L_0x01e0
            java.lang.String r8 = r8.nickname
            if (r8 != 0) goto L_0x01e1
        L_0x01e0:
            r8 = r3
        L_0x01e1:
            r4.f186859e = r8
            if (r7 == 0) goto L_0x01ed
            com.tencent.mm.protocal.protobuf.FinderContact r7 = r7.f134919d
            if (r7 == 0) goto L_0x01ed
            java.lang.String r7 = r7.headUrl
            if (r7 != 0) goto L_0x01ee
        L_0x01ed:
            r7 = r3
        L_0x01ee:
            r4.f186867p = r7
            te3.p11 r7 = r1.f136332g
            if (r7 == 0) goto L_0x01f7
            java.lang.String r7 = r7.f139515o
            goto L_0x01f8
        L_0x01f7:
            r7 = r6
        L_0x01f8:
            r4.f186871t = r7
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131828170(0x7f111dca, float:1.9289273E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r9 = r4.f186871t
            r5[r2] = r9
            java.lang.String r5 = r7.getString(r8, r5)
            r4.f186860f = r5
            long r7 = r13.f144913r
            r4.f186862h = r7
            java.lang.String r5 = r13.f144904f
            r4.f186863i = r5
            java.lang.String r13 = r13.f144915t
            r4.f186864j = r13
            int r13 = r1.f136334i
            r4.f186865n = r13
            java.lang.String r13 = r1.f136329d
            r4.f186868q = r13
            int r13 = r1.f136331f
            r4.f186869r = r13
            te3.p11 r13 = r1.f136332g
            if (r13 == 0) goto L_0x022b
            java.lang.String r6 = r13.f139509f
        L_0x022b:
            r4.f186870s = r6
            java.lang.String r13 = r1.f136335j
            r4.f186872u = r13
            int r13 = r1.f136330e
            r4.f186873v = r13
            r0.add(r4)
            goto L_0x00ca
        L_0x023a:
            te3.zs2 r1 = new te3.zs2
            r1.<init>()
            er1.w0 r4 = er1.C58782w0.f168290a
            int r6 = r13.f144903e
            int r6 = r4.mo83853l(r6)
            r1.f186858d = r6
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131828880(0x7f112090, float:1.9290713E38)
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            te3.hx0 r9 = r13.f144914s
            if (r9 == 0) goto L_0x025f
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r9.f134919d
            if (r9 == 0) goto L_0x025f
            java.lang.String r9 = r9.nickname
            if (r9 != 0) goto L_0x0260
        L_0x025f:
            r9 = r3
        L_0x0260:
            r10 = 6
            java.lang.String r9 = r4.mo83849h(r9, r10)
            r8[r2] = r9
            te3.hx0 r9 = r13.f144902d
            if (r9 == 0) goto L_0x0273
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r9.f134919d
            if (r9 == 0) goto L_0x0273
            java.lang.String r9 = r9.nickname
            if (r9 != 0) goto L_0x0274
        L_0x0273:
            r9 = r3
        L_0x0274:
            java.lang.String r4 = r4.mo83849h(r9, r10)
            r8[r5] = r4
            java.lang.String r4 = r6.getString(r7, r8)
            r1.f186859e = r4
            te3.hx0 r4 = r13.f144914s
            if (r4 == 0) goto L_0x028c
            com.tencent.mm.protocal.protobuf.FinderContact r4 = r4.f134919d
            if (r4 == 0) goto L_0x028c
            java.lang.String r4 = r4.headUrl
            if (r4 != 0) goto L_0x028d
        L_0x028c:
            r4 = r3
        L_0x028d:
            r1.f186867p = r4
            cj1.f2 r4 = new cj1.f2
            r4.<init>(r13)
            java.lang.String r4 = r4.getContent()
            r1.f186860f = r4
            long r4 = r13.f144913r
            r1.f186862h = r4
            java.lang.String r4 = r13.f144904f
            r1.f186863i = r4
            java.lang.String r4 = r13.f144915t
            r1.f186864j = r4
            te3.hx0 r13 = r13.f144914s
            if (r13 == 0) goto L_0x02b1
            te3.aw0 r13 = r13.f134924i
            if (r13 == 0) goto L_0x02b1
            int r13 = r13.f130791f
            goto L_0x02b2
        L_0x02b1:
            r13 = 0
        L_0x02b2:
            r1.f186866o = r13
            r0.add(r1)
            goto L_0x00ca
        L_0x02b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cj1.C54843w3.mo75794i(java.util.LinkedList, java.util.LinkedList):java.util.ArrayList");
    }
}
