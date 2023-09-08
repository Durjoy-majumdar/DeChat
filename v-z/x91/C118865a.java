package x91;

import android.util.Pair;
import ba1.C16777c;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.C110962fr1;
import te3.C110970q14;
import te3.C110974w14;
import te3.C118429er1;
import te3.C118434gg2;
import te3.C118464s14;
import te3.C22505ka3;
import x91.C23066b;

/* renamed from: x91.a */
public final class C118865a {

    /* renamed from: a */
    public static final C118865a f355584a = new C118865a();

    /* renamed from: b */
    public static boolean f355585b;

    /* renamed from: a */
    public final void mo183573a(String str, String str2, long j, ArrayList<C110974w14> arrayList, ArrayList<Long> arrayList2) {
        Iterator<C110974w14> it = arrayList.iterator();
        while (it.hasNext()) {
            C110974w14 next = it.next();
            if (!arrayList2.contains(Long.valueOf(next.f332315e))) {
                if (next.f332316f.size() == 1) {
                    C118464s14 s142 = next.f332316f.get(0);
                    if (s142 != null && C87412m.m108589b(str, s142.f354328d)) {
                        C110962fr1 fr12 = new C110962fr1();
                        fr12.f331972d = str2;
                        fr12.f331974f = s142;
                        fr12.f331976h = true;
                        fr12.f331977i = next.f332318h;
                        fr12.f331978j = next.f332317g;
                        fr12.f331979n = next.f332315e;
                        C118429er1 er12 = new C118429er1();
                        er12.f353985d = str;
                        er12.f353986e = j;
                        fr12.f331975g.addLast(er12);
                        C23066b.C23067a aVar = C23066b.f66278a;
                        Pair<C110970q14, Integer> c = aVar.mo36465c(str2);
                        ((C110970q14) c.first).f332255e.addLast(fr12);
                        C110970q14 q142 = (C110970q14) c.first;
                        q142.f332254d = str2;
                        Object obj = c.second;
                        C87412m.m108593f(obj, "curSessionPathPair.second");
                        aVar.mo36468f(q142, ((Number) obj).intValue());
                    }
                } else if (next.f332316f.size() == 2) {
                    C118464s14 s143 = next.f332316f.get(0);
                    C118464s14 s144 = next.f332316f.get(1);
                    if (C87412m.m108589b(str, s143.f354328d)) {
                        C110962fr1 fr13 = new C110962fr1();
                        fr13.f331972d = str2;
                        fr13.f331973e.add(s143);
                        fr13.f331974f = s144;
                        fr13.f331976h = true;
                        fr13.f331977i = next.f332318h;
                        fr13.f331978j = next.f332317g;
                        fr13.f331979n = next.f332315e;
                        C118429er1 er13 = new C118429er1();
                        er13.f353985d = str;
                        er13.f353986e = j;
                        fr13.f331975g.addLast(er13);
                        C23066b.C23067a aVar2 = C23066b.f66278a;
                        Pair<C110970q14, Integer> c2 = aVar2.mo36465c(str2);
                        ((C110970q14) c2.first).f332255e.addLast(fr13);
                        C110970q14 q143 = (C110970q14) c2.first;
                        q143.f332254d = str2;
                        Object obj2 = c2.second;
                        C87412m.m108593f(obj2, "curSessionPathPair.second");
                        aVar2.mo36468f(q143, ((Number) obj2).intValue());
                    }
                } else {
                    LinkedList<C118464s14> linkedList = next.f332316f;
                    List<C118464s14> subList = linkedList.subList(0, linkedList.size() - 1);
                    C87412m.m108593f(subList, "pathConfig.pagePathUnits…g.pagePathUnits.size - 1)");
                    C118464s14 last = next.f332316f.getLast();
                    if (C87412m.m108589b(str, subList.get(0).f354328d)) {
                        C110962fr1 fr14 = new C110962fr1();
                        fr14.f331972d = str2;
                        fr14.f331973e.addAll(subList);
                        fr14.f331974f = last;
                        fr14.f331976h = true;
                        fr14.f331977i = next.f332318h;
                        fr14.f331978j = next.f332317g;
                        fr14.f331979n = next.f332315e;
                        C118429er1 er14 = new C118429er1();
                        er14.f353985d = str;
                        er14.f353986e = j;
                        fr14.f331975g.addLast(er14);
                        C23066b.C23067a aVar3 = C23066b.f66278a;
                        Pair<C110970q14, Integer> c3 = aVar3.mo36465c(str2);
                        ((C110970q14) c3.first).f332255e.addLast(fr14);
                        C110970q14 q144 = (C110970q14) c3.first;
                        q144.f332254d = str2;
                        Object obj3 = c3.second;
                        C87412m.m108593f(obj3, "curSessionPathPair.second");
                        aVar3.mo36468f(q144, ((Number) obj3).intValue());
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo183574b(String str, boolean z, long j) {
        if ((z || C116711b.m164588m(str)) && f355585b) {
            f355585b = false;
            return;
        }
        C115411b.C115412a aVar = C115411b.f345922a;
        C118434gg2 h = C16777c.m16416h();
        String str2 = null;
        C22505ka3 last = (h == null || h.f354028f.isEmpty()) ? null : C16777c.m16415g(h) ? h.f354028f.get(h.f354029g) : h.f354028f.getLast();
        if (last != null) {
            str2 = last.f64087d;
        }
        if (str2 == null) {
            Log.m105928w("HABBYGE-MALI.FuzzyMatch", "_matchOnFinish: curSession == null");
            return;
        }
        C110970q14 b = C23066b.f66278a.mo36464b(str2);
        if (b == null) {
            Log.m105928w("HABBYGE-MALI.FuzzyMatch", "_matchOnFinish: sessionMatch == null");
            return;
        }
        Iterator<C110962fr1> it = b.f332255e.iterator();
        while (it.hasNext()) {
            C110962fr1 next = it.next();
            if (!next.f331976h) {
                int size = next.f331975g.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    C118429er1 er12 = next.f331975g.get(size);
                    if (er12 != null) {
                        String h2 = C116711b.m164583h(er12.f353985d);
                        if (C87412m.m108589b(str, er12.f353985d) || C87412m.m108589b(str, h2)) {
                            long j2 = 0;
                            if (er12.f353987f <= 0) {
                                long j3 = j - er12.f353986e;
                                if (j3 >= 0) {
                                    j2 = j3;
                                }
                                er12.f353987f = j2;
                            }
                        }
                    }
                }
            } else {
                String h3 = C116711b.m164583h(next.f331974f.f354328d);
                if (C87412m.m108589b(str, next.f331974f.f354328d) || C87412m.m108589b(str, h3)) {
                    next.f331976h = false;
                    C23068c.f66279a.mo36469a(next, j);
                }
            }
        }
        C23066b.f66278a.mo36467e(b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:250:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01df A[SYNTHETIC, Splitter:B:92:0x01df] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo183575c(java.lang.String r17, long r18, x91.C23072e r20) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r4 = r18
            r1 = r20
            java.lang.String r2 = "state"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "HABBYGE-MALI.FuzzyMatch"
            if (r0 != 0) goto L_0x0027
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "match: page is: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        L_0x0027:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r3 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            boolean r6 = r3.mo175245b()
            if (r6 == 0) goto L_0x0035
            java.lang.String r0 = "match, doNotNeedSessionMonitor: TRUE"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            return
        L_0x0035:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "match: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = ", "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            int r1 = r20.ordinal()
            java.lang.String r6 = "HABBYGE-MALI.FuzzyMatchDao"
            java.lang.String r9 = "com.tencent.mm.ui.LauncherUI"
            r11 = -1
            r12 = 0
            r13 = 1
            switch(r1) {
                case 1: goto L_0x0251;
                case 2: goto L_0x0245;
                case 3: goto L_0x0239;
                case 4: goto L_0x00f1;
                case 5: goto L_0x006b;
                case 6: goto L_0x0066;
                default: goto L_0x005f;
            }
        L_0x005f:
            java.lang.String r0 = "match ~"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x065a
        L_0x0066:
            r8.mo183574b(r0, r13, r4)
            goto L_0x065a
        L_0x006b:
            x91.b$a r0 = x91.C23066b.f66278a
            boolean r1 = e91.C116711b.m164589n()
            if (r1 != 0) goto L_0x0075
            goto L_0x00e1
        L_0x0075:
            java.lang.String r1 = "FuzzyMatchDao, reset..."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            te3.dr1 r1 = r0.mo36463a()
            if (r1 != 0) goto L_0x0081
            goto L_0x00e1
        L_0x0081:
            java.util.LinkedList<te3.q14> r2 = r1.f331954d
            int r2 = r2.size()
            int r2 = r2 + r11
        L_0x0088:
            if (r11 >= r2) goto L_0x00de
            java.util.LinkedList<te3.q14> r3 = r1.f331954d
            java.lang.Object r3 = r3.get(r2)
            te3.q14 r3 = (te3.C110970q14) r3
            if (r3 == 0) goto L_0x00d6
            java.util.LinkedList<te3.fr1> r4 = r3.f332255e
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x009d
            goto L_0x00d6
        L_0x009d:
            java.util.LinkedList<te3.fr1> r4 = r3.f332255e
            int r4 = r4.size()
            int r4 = r4 + r11
        L_0x00a4:
            if (r11 >= r4) goto L_0x00c8
            java.util.LinkedList<te3.fr1> r5 = r3.f332255e
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r6 = "sessionPath.paths[j]"
            gy3.C87412m.m108593f(r5, r6)
            te3.fr1 r5 = (te3.C110962fr1) r5
            java.util.LinkedList<te3.er1> r6 = r5.f331975g
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00c0
            boolean r5 = r5.f331976h
            if (r5 == 0) goto L_0x00c5
        L_0x00c0:
            java.util.LinkedList<te3.fr1> r5 = r3.f332255e
            r5.remove(r4)
        L_0x00c5:
            int r4 = r4 + -1
            goto L_0x00a4
        L_0x00c8:
            java.util.LinkedList<te3.fr1> r3 = r3.f332255e
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00db
            java.util.LinkedList<te3.q14> r3 = r1.f331954d
            r3.remove(r2)
            goto L_0x00db
        L_0x00d6:
            java.util.LinkedList<te3.q14> r3 = r1.f331954d
            r3.remove(r2)
        L_0x00db:
            int r2 = r2 + -1
            goto L_0x0088
        L_0x00de:
            r0.mo36466d(r1)
        L_0x00e1:
            byte[] r0 = new byte[r12]
            java.lang.String r1 = "mmkv_fuzzy_matched_bckup"
            f91.C116850b.m164834d(r1, r0)
            byte[] r0 = new byte[r12]
            java.lang.String r1 = "mmkv_ssionPg_matched_bckup"
            f91.C116850b.m164834d(r1, r0)
            goto L_0x065a
        L_0x00f1:
            f355585b = r13
            x91.c$a r1 = x91.C23068c.f66279a
            java.lang.String r2 = "mmkv_fuzzy_pgs_io"
            byte[] r0 = f91.C116850b.m164831a(r2)
            if (r0 == 0) goto L_0x011e
            int r3 = r0.length
            if (r3 != 0) goto L_0x0102
            r3 = 1
            goto L_0x0103
        L_0x0102:
            r3 = 0
        L_0x0103:
            if (r3 == 0) goto L_0x0106
            goto L_0x011e
        L_0x0106:
            te3.dr1 r3 = new te3.dr1
            r3.<init>()
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x010f }
            goto L_0x011f
        L_0x010f:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r7 = r3.getMessage()
            r0[r12] = r7
            java.lang.String r7 = "FuzzyMatchDao, getFuzzyMatchInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r3, r7, r0)
        L_0x011e:
            r3 = 0
        L_0x011f:
            if (r3 != 0) goto L_0x0123
            goto L_0x065a
        L_0x0123:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            java.util.LinkedList<te3.q14> r0 = r3.f331954d
            int r0 = r0.size()
            int r0 = r0 - r13
        L_0x012f:
            if (r11 >= r0) goto L_0x0173
            java.util.LinkedList<te3.q14> r9 = r3.f331954d
            java.lang.Object r9 = r9.get(r0)
            te3.q14 r9 = (te3.C110970q14) r9
            java.util.LinkedList<te3.fr1> r14 = r9.f332255e
            int r14 = r14.size()
            int r14 = r14 - r13
        L_0x0140:
            if (r11 >= r14) goto L_0x0163
            java.util.LinkedList<te3.fr1> r15 = r9.f332255e
            java.lang.Object r15 = r15.get(r14)
            java.lang.String r10 = "sessionFuzzyPath.paths[j]"
            gy3.C87412m.m108593f(r15, r10)
            te3.fr1 r15 = (te3.C110962fr1) r15
            boolean r10 = r15.f331976h
            if (r10 == 0) goto L_0x0158
            r1.mo36469a(r15, r4)
            goto L_0x0160
        L_0x0158:
            r7.addLast(r15)
            java.util.LinkedList<te3.fr1> r10 = r9.f332255e
            r10.remove(r14)
        L_0x0160:
            int r14 = r14 + -1
            goto L_0x0140
        L_0x0163:
            java.util.LinkedList<te3.fr1> r9 = r9.f332255e
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0170
            java.util.LinkedList<te3.q14> r9 = r3.f331954d
            r9.remove(r0)
        L_0x0170:
            int r0 = r0 + -1
            goto L_0x012f
        L_0x0173:
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x017e }
            if (r0 != 0) goto L_0x017a
            goto L_0x018d
        L_0x017a:
            f91.C116850b.m164834d(r2, r0)
            goto L_0x018d
        L_0x017e:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r2 = r1.getMessage()
            r0[r12] = r2
            java.lang.String r2 = "FuzzyMatchDao, setFuzzyMatchInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r2, r0)
        L_0x018d:
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ r13
            if (r0 == 0) goto L_0x065a
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r0 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            boolean r0 = r0.mo175245b()
            if (r0 == 0) goto L_0x019d
            goto L_0x01f9
        L_0x019d:
            java.lang.String r1 = "mmkv_fuzzy_mc_rpt"
            byte[] r0 = f91.C116850b.m164831a(r1)
            java.lang.String r2 = "HABBYGE-MALI.FuzzyMatchReport"
            if (r0 == 0) goto L_0x01c9
            int r3 = r0.length
            if (r3 != 0) goto L_0x01ac
            r3 = 1
            goto L_0x01ad
        L_0x01ac:
            r3 = 0
        L_0x01ad:
            if (r3 == 0) goto L_0x01b0
            goto L_0x01c9
        L_0x01b0:
            te3.cr1 r3 = new te3.cr1
            r3.<init>()
            r3.parseFrom(r0)     // Catch:{ IOException -> 0x01ba }
            r10 = r3
            goto L_0x01ca
        L_0x01ba:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r4 = r3.getMessage()
            r0[r12] = r4
            java.lang.String r4 = "FuzzyMatchReport, _read: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r3, r4, r0)
        L_0x01c9:
            r10 = 0
        L_0x01ca:
            if (r10 != 0) goto L_0x01d1
            te3.cr1 r10 = new te3.cr1
            r10.<init>()
        L_0x01d1:
            java.util.LinkedList<te3.fr1> r0 = r10.f331912d
            r0.addAll(r7)
            java.util.LinkedList<te3.fr1> r0 = r10.f331912d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01df
            goto L_0x01f9
        L_0x01df:
            byte[] r0 = r10.toByteArray()     // Catch:{ IOException -> 0x01ea }
            if (r0 != 0) goto L_0x01e6
            goto L_0x01f9
        L_0x01e6:
            f91.C116850b.m164834d(r1, r0)
            goto L_0x01f9
        L_0x01ea:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r3 = r1.getMessage()
            r0[r12] = r3
            java.lang.String r3 = "FuzzyMatchReport, _write: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r3, r0)
        L_0x01f9:
            x91.d$a r0 = x91.C23070d.f66280a
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r1 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
            boolean r1 = r1.mo175245b()
            java.lang.String r2 = "HABBYGE-MALI.FuzzyMatchedBackup"
            if (r1 == 0) goto L_0x020c
            java.lang.String r0 = "FuzzyMatchedBackup, report, doNotNeedSessionMonitor FALSE"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
            goto L_0x065a
        L_0x020c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "FuzzyMatchedBackup, report: "
            r1.append(r3)
            int r3 = r7.size()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            te3.cr1 r1 = r0.mo36470a()
            if (r1 != 0) goto L_0x022f
            te3.cr1 r1 = new te3.cr1
            r1.<init>()
        L_0x022f:
            java.util.LinkedList<te3.fr1> r2 = r1.f331912d
            r2.addAll(r7)
            r0.mo36471b(r1)
            goto L_0x065a
        L_0x0239:
            boolean r1 = gy3.C87412m.m108589b(r0, r9)
            r1 = r1 ^ r13
            if (r1 == 0) goto L_0x065a
            r8.mo183574b(r0, r12, r4)
            goto L_0x065a
        L_0x0245:
            boolean r1 = gy3.C87412m.m108589b(r0, r9)
            r1 = r1 ^ r13
            if (r1 == 0) goto L_0x065a
            r8.mo183574b(r0, r12, r4)
            goto L_0x065a
        L_0x0251:
            boolean r1 = gy3.C87412m.m108589b(r0, r9)
            r1 = r1 ^ r13
            if (r1 == 0) goto L_0x065a
            te3.ka3 r1 = ba1.C16777c.m16413e()
            if (r1 != 0) goto L_0x0260
            r1 = 0
            goto L_0x0262
        L_0x0260:
            java.lang.String r1 = r1.f64087d
        L_0x0262:
            if (r1 != 0) goto L_0x0266
            goto L_0x02e4
        L_0x0266:
            java.lang.String r3 = r3.mo175244a(r1)
            if (r3 != 0) goto L_0x026e
            goto L_0x02e4
        L_0x026e:
            com.tencent.mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig r6 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.HellSessionPageCloudConfig.m162212a()
            r6.getClass()
            te3.t14 r6 = ba1.C113153e.m154822a()
            if (r6 != 0) goto L_0x027d
            r9 = 0
            goto L_0x02d6
        L_0x027d:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.LinkedList<te3.w14> r6 = r6.f332264d
            java.util.Iterator r6 = r6.iterator()
        L_0x0288:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x02bc
            java.lang.Object r10 = r6.next()
            te3.w14 r10 = (te3.C110974w14) r10
            if (r10 != 0) goto L_0x0297
            goto L_0x0288
        L_0x0297:
            int r14 = r10.f332319i
            if (r14 == r13) goto L_0x029c
            goto L_0x0288
        L_0x029c:
            java.lang.String r14 = r10.f332314d
            boolean r14 = gy3.C87412m.m108589b(r14, r3)
            if (r14 != 0) goto L_0x02af
            java.lang.String r14 = r10.f332314d
            java.lang.String r15 = "-1"
            boolean r14 = gy3.C87412m.m108589b(r14, r15)
            if (r14 != 0) goto L_0x02af
            goto L_0x0288
        L_0x02af:
            java.util.LinkedList<te3.s14> r14 = r10.f332316f
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x02b8
            goto L_0x0288
        L_0x02b8:
            r9.add(r10)
            goto L_0x0288
        L_0x02bc:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "FuzzyMatchConfig, getConfig: "
            r3.append(r6)
            int r6 = r9.size()
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = "HABBYGE-MALI.FuzzyMatchConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
        L_0x02d6:
            if (r9 != 0) goto L_0x02d9
            goto L_0x02e4
        L_0x02d9:
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L_0x02e6
            java.lang.String r1 = "_getCloudConfig Empty!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
        L_0x02e4:
            r10 = 0
            goto L_0x02ea
        L_0x02e6:
            op3.b r10 = op3.C117882j.m166284c(r1, r9)
        L_0x02ea:
            if (r10 != 0) goto L_0x02ee
            goto L_0x065a
        L_0x02ee:
            java.lang.Object r1 = r10.mo182596a(r12)
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r10.mo182596a(r13)
            r6 = r1
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L_0x0300
            goto L_0x065a
        L_0x0300:
            x91.b$a r1 = x91.C23066b.f66278a
            te3.dr1 r9 = r1.mo36463a()
            java.lang.String r10 = "curSessionId"
            if (r9 == 0) goto L_0x0649
            java.util.LinkedList<te3.q14> r9 = r9.f331954d
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0314
            goto L_0x0649
        L_0x0314:
            gy3.C87412m.m108593f(r3, r10)
            android.util.Pair r1 = r1.mo36465c(r3)
            java.lang.Object r9 = r1.first
            te3.q14 r9 = (te3.C110970q14) r9
            java.util.LinkedList<te3.fr1> r9 = r9.f332255e
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0337
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = r16
            r2 = r17
            r4 = r18
            r1.mo183573a(r2, r3, r4, r6, r7)
            goto L_0x065a
        L_0x0337:
            java.lang.Object r1 = r1.first
            java.lang.String r9 = "sessionPathPair.first"
            gy3.C87412m.m108593f(r1, r9)
            te3.q14 r1 = (te3.C110970q14) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.LinkedList<te3.fr1> r10 = r1.f332255e
            int r10 = r10.size()
            int r10 = r10 - r13
        L_0x034d:
            if (r11 >= r10) goto L_0x0639
            java.util.LinkedList<te3.fr1> r14 = r1.f332255e
            java.lang.Object r14 = r14.get(r10)
            java.lang.String r15 = "sessionPath.paths[i]"
            gy3.C87412m.m108593f(r14, r15)
            te3.fr1 r14 = (te3.C110962fr1) r14
            java.util.LinkedList<te3.er1> r15 = r14.f331975g
            int r15 = r15.size()
            java.lang.String r11 = "_updatePath, =1: "
            if (r15 != r13) goto L_0x0480
            java.util.LinkedList<te3.s14> r15 = r14.f331973e
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L_0x03a4
            te3.er1 r11 = new te3.er1
            r11.<init>()
            r11.f353985d = r0
            r11.f353986e = r4
            java.util.LinkedList<te3.er1> r15 = r14.f331975g
            r15.addLast(r11)
            long r12 = r14.f331979n
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            r9.add(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "_updatePath: "
            r11.append(r12)
            long r12 = r14.f331979n
            r11.append(r12)
            r11.append(r7)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            goto L_0x0631
        L_0x03a4:
            java.util.LinkedList<te3.s14> r12 = r14.f331973e
            int r12 = r12.size()
            r13 = 1
            if (r12 != r13) goto L_0x0420
            te3.s14 r12 = r14.f331974f
            java.lang.String r12 = r12.f354328d
            boolean r12 = gy3.C87412m.m108589b(r12, r0)
            if (r12 == 0) goto L_0x03ea
            te3.er1 r12 = new te3.er1
            r12.<init>()
            r12.f353985d = r0
            r12.f353986e = r4
            java.util.LinkedList<te3.er1> r13 = r14.f331975g
            r13.addLast(r12)
            long r12 = r14.f331979n
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.add(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            long r13 = r14.f331979n
            r12.append(r13)
            r12.append(r7)
            r12.append(r0)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r11)
            goto L_0x0631
        L_0x03ea:
            java.util.LinkedList<te3.s14> r11 = r14.f331973e
            r12 = 0
            java.lang.Object r11 = r11.get(r12)
            te3.s14 r11 = (te3.C118464s14) r11
            java.lang.String r11 = r11.f354328d
            boolean r11 = gy3.C87412m.m108589b(r11, r0)
            if (r11 == 0) goto L_0x0419
            java.util.LinkedList<te3.er1> r11 = r14.f331975g
            r11.clear()
            te3.er1 r11 = new te3.er1
            r11.<init>()
            r11.f353985d = r0
            r11.f353986e = r4
            java.util.LinkedList<te3.er1> r12 = r14.f331975g
            r12.addLast(r11)
            long r11 = r14.f331979n
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r9.add(r11)
            goto L_0x0631
        L_0x0419:
            java.util.LinkedList<te3.fr1> r11 = r1.f332255e
            r11.remove(r10)
            goto L_0x0631
        L_0x0420:
            java.util.LinkedList<te3.s14> r11 = r14.f331973e
            r12 = 1
            java.lang.Object r11 = r11.get(r12)
            te3.s14 r11 = (te3.C118464s14) r11
            java.lang.String r11 = r11.f354328d
            boolean r11 = gy3.C87412m.m108589b(r11, r0)
            if (r11 == 0) goto L_0x044a
            te3.er1 r11 = new te3.er1
            r11.<init>()
            r11.f353985d = r0
            r11.f353986e = r4
            java.util.LinkedList<te3.er1> r12 = r14.f331975g
            r12.addLast(r11)
            long r11 = r14.f331979n
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r9.add(r11)
            goto L_0x0631
        L_0x044a:
            java.util.LinkedList<te3.s14> r11 = r14.f331973e
            r12 = 0
            java.lang.Object r11 = r11.get(r12)
            te3.s14 r11 = (te3.C118464s14) r11
            java.lang.String r11 = r11.f354328d
            boolean r11 = gy3.C87412m.m108589b(r11, r0)
            if (r11 == 0) goto L_0x0479
            java.util.LinkedList<te3.er1> r11 = r14.f331975g
            r11.clear()
            te3.er1 r11 = new te3.er1
            r11.<init>()
            r11.f353985d = r0
            r11.f353986e = r4
            java.util.LinkedList<te3.er1> r12 = r14.f331975g
            r12.addLast(r11)
            long r11 = r14.f331979n
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r9.add(r11)
            goto L_0x0631
        L_0x0479:
            java.util.LinkedList<te3.fr1> r11 = r1.f332255e
            r11.remove(r10)
            goto L_0x0631
        L_0x0480:
            java.util.LinkedList<te3.er1> r12 = r14.f331975g
            int r12 = r12.size()
            r13 = 1
            if (r12 <= r13) goto L_0x0631
            boolean r12 = r14.f331976h
            if (r12 == 0) goto L_0x0631
            java.util.LinkedList<te3.s14> r12 = r14.f331973e
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x04ca
            te3.er1 r12 = new te3.er1
            r12.<init>()
            r12.f353985d = r0
            r12.f353986e = r4
            java.util.LinkedList<te3.er1> r13 = r14.f331975g
            r13.addLast(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r13 = r10
            long r10 = r14.f331979n
            r12.append(r10)
            r12.append(r7)
            r12.append(r0)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            long r10 = r14.f331979n
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.add(r10)
        L_0x04c7:
            r11 = r13
            goto L_0x0632
        L_0x04ca:
            r13 = r10
            java.util.LinkedList<te3.s14> r10 = r14.f331973e
            int r10 = r10.size()
            r11 = 1
            if (r10 != r11) goto L_0x0508
            te3.er1 r10 = new te3.er1
            r10.<init>()
            r10.f353985d = r0
            r10.f353986e = r4
            java.util.LinkedList<te3.er1> r12 = r14.f331975g
            r12.addLast(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "_updatePath, =2: "
            r10.append(r12)
            long r11 = r14.f331979n
            r10.append(r11)
            r10.append(r7)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            long r10 = r14.f331979n
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.add(r10)
            goto L_0x04c7
        L_0x0508:
            java.util.LinkedList<te3.er1> r10 = r14.f331975g
            int r10 = r10.size()
            java.util.LinkedList<te3.s14> r11 = r14.f331973e
            int r11 = r11.size()
            if (r10 <= r11) goto L_0x054b
            te3.er1 r10 = new te3.er1
            r10.<init>()
            r10.f353985d = r0
            r10.f353986e = r4
            java.util.LinkedList<te3.er1> r11 = r14.f331975g
            r11.addLast(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "_updatePath, >2: "
            r10.append(r11)
            long r11 = r14.f331979n
            r10.append(r11)
            r10.append(r7)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            long r10 = r14.f331979n
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.add(r10)
            goto L_0x04c7
        L_0x054b:
            java.util.LinkedList<te3.er1> r10 = r14.f331975g
            int r10 = r10.size()
            java.util.LinkedList<te3.s14> r11 = r14.f331973e
            int r11 = r11.size()
            if (r10 != r11) goto L_0x05ce
            te3.s14 r10 = r14.f331974f
            java.lang.String r10 = r10.f354328d
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x0598
            te3.er1 r10 = new te3.er1
            r10.<init>()
            r10.f353985d = r0
            r10.f353986e = r4
            java.util.LinkedList<te3.er1> r11 = r14.f331975g
            r11.addLast(r10)
            long r10 = r14.f331979n
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.add(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "_updatePath, >=2: "
            r10.append(r11)
            long r11 = r14.f331979n
            r10.append(r11)
            r10.append(r7)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r10)
            goto L_0x04c7
        L_0x0598:
            java.util.LinkedList<te3.s14> r10 = r14.f331973e
            r11 = 0
            java.lang.Object r10 = r10.get(r11)
            te3.s14 r10 = (te3.C118464s14) r10
            java.lang.String r10 = r10.f354328d
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x05c7
            java.util.LinkedList<te3.er1> r10 = r14.f331975g
            r10.clear()
            te3.er1 r10 = new te3.er1
            r10.<init>()
            r10.f353985d = r0
            r10.f353986e = r4
            java.util.LinkedList<te3.er1> r11 = r14.f331975g
            r11.addLast(r10)
            long r10 = r14.f331979n
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9.add(r10)
            goto L_0x04c7
        L_0x05c7:
            java.util.LinkedList<te3.fr1> r10 = r1.f332255e
            r11 = r13
            r10.remove(r11)
            goto L_0x0632
        L_0x05ce:
            r11 = r13
            java.util.LinkedList<te3.s14> r10 = r14.f331973e
            java.util.LinkedList<te3.er1> r12 = r14.f331975g
            int r12 = r12.size()
            java.lang.Object r10 = r10.get(r12)
            te3.s14 r10 = (te3.C118464s14) r10
            java.lang.String r10 = r10.f354328d
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x05fd
            te3.er1 r10 = new te3.er1
            r10.<init>()
            r10.f353985d = r0
            r10.f353986e = r4
            java.util.LinkedList<te3.er1> r12 = r14.f331975g
            r12.addLast(r10)
            long r12 = r14.f331979n
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r9.add(r10)
            goto L_0x0632
        L_0x05fd:
            java.util.LinkedList<te3.s14> r10 = r14.f331973e
            r12 = 0
            java.lang.Object r10 = r10.get(r12)
            te3.s14 r10 = (te3.C118464s14) r10
            java.lang.String r10 = r10.f354328d
            boolean r10 = gy3.C87412m.m108589b(r10, r0)
            if (r10 == 0) goto L_0x062b
            java.util.LinkedList<te3.er1> r10 = r14.f331975g
            r10.clear()
            te3.er1 r10 = new te3.er1
            r10.<init>()
            r10.f353985d = r0
            r10.f353986e = r4
            java.util.LinkedList<te3.er1> r13 = r14.f331975g
            r13.addLast(r10)
            long r13 = r14.f331979n
            java.lang.Long r10 = java.lang.Long.valueOf(r13)
            r9.add(r10)
            goto L_0x0633
        L_0x062b:
            java.util.LinkedList<te3.fr1> r10 = r1.f332255e
            r10.remove(r11)
            goto L_0x0633
        L_0x0631:
            r11 = r10
        L_0x0632:
            r12 = 0
        L_0x0633:
            int r10 = r11 + -1
            r11 = -1
            r13 = 1
            goto L_0x034d
        L_0x0639:
            x91.b$a r2 = x91.C23066b.f66278a
            r2.mo36467e(r1)
            r1 = r16
            r2 = r17
            r4 = r18
            r7 = r9
            r1.mo183573a(r2, r3, r4, r6, r7)
            goto L_0x065a
        L_0x0649:
            gy3.C87412m.m108593f(r3, r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = r16
            r2 = r17
            r4 = r18
            r1.mo183573a(r2, r3, r4, r6, r7)
        L_0x065a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x91.C118865a.mo183575c(java.lang.String, long, x91.e):void");
    }
}
