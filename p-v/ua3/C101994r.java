package ua3;

import bb3.C92221d;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelcdntran.C92768f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import og2.C100343m;
import og2.C100344n;
import pb1.C100720k1;
import pb1.C100746u;
import pb1.C100755z;
import qg2.C101147j0;
import wa3.C102364c;
import wa3.C102365e;
import wa3.C102367g;
import wa3.C102368h;
import xa3.C102597m;

/* renamed from: ua3.r */
public class C101994r implements C100720k1, C100343m, C92768f0 {

    /* renamed from: d */
    public static C92221d f300318d;

    /* renamed from: R4 */
    public void mo140154R4(C100746u uVar) {
        C102597m mVar;
        C100755z a = C102368h.m135070a(uVar.field_favLocalId);
        if (a == null) {
            C102365e Rd = C102364c.vx0().mo137946Rd();
            if (Rd != null && (mVar = Rd.f301467d) != null) {
                long j = uVar.field_favLocalId;
                if (j != mVar.f302092c) {
                    Log.m105925i("MicroMsg.Note.WNNoteFavCdnChangedListener", "info null and not match localId:%s, %s", Long.valueOf(j), Long.valueOf(Rd.f301467d.f302092c));
                    return;
                }
            } else {
                return;
            }
        } else if (a.field_type != 18) {
            Log.m105925i("MicroMsg.Note.WNNoteFavCdnChangedListener", "Not Note CDN onCdnStatusChanged %d", Long.valueOf(uVar.field_favLocalId));
            return;
        }
        if (uVar.field_status == 3 && C86013q1.m106450k(uVar.field_path) && uVar.field_path.endsWith("..htm")) {
            C102368h.m135077h(uVar.field_favLocalId, uVar.field_path);
        }
        C102367g gVar = new C102367g();
        gVar.field_favLocalId = uVar.field_favLocalId;
        gVar.field_dataId = uVar.field_dataId;
        gVar.field_status = uVar.field_status;
        gVar.field_offset = uVar.field_offset;
        gVar.field_totalLen = uVar.field_totalLen;
        gVar.field_path = uVar.field_path;
        mo141496d(gVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e1, code lost:
        if (r4 != r7.f302092c) goto L_0x01f1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo141496d(wa3.C102367g r14) {
        /*
            r13 = this;
            i00.b r0 = wa3.C102364c.vx0()
            wa3.e r0 = r0.mo137946Rd()
            java.lang.String r1 = "MicroMsg.Note.WNNoteFavCdnChangedListener"
            if (r0 != 0) goto L_0x0013
            java.lang.String r14 = "not curr note"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            return
        L_0x0013:
            int r2 = r14.field_status
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == r3) goto L_0x0020
            if (r2 != r4) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r2 = 0
            goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            if (r2 == 0) goto L_0x01f8
            java.lang.String r2 = r14.field_path
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 != 0) goto L_0x0037
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r14 = r14.field_path
            r0[r6] = r14
            java.lang.String r14 = "file not found:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r14, r0)
            return
        L_0x0037:
            java.util.HashMap<java.lang.String, java.lang.String> r2 = r0.f301470g
            java.lang.String r7 = r14.field_dataId
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r7 != 0) goto L_0x01f8
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r6] = r2
            java.lang.String r8 = "on cdn status change,editorId[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r8, r7)
            java.lang.String r7 = r14.field_dataId
            java.lang.String r8 = "_t"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x009c
            java.util.Map<java.lang.String, xa3.o> r7 = r0.f301471h
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.lang.Object r7 = r7.get(r2)
            if (r7 == 0) goto L_0x009c
            java.util.Map<java.lang.String, xa3.o> r1 = r0.f301471h
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            xa3.o r1 = (xa3.C102599o) r1
            int r1 = r1.mo142212c()
            if (r1 != r4) goto L_0x0083
            java.util.Map<java.lang.String, xa3.o> r1 = r0.f301471h
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r2)
            xa3.o r1 = (xa3.C102599o) r1
            java.lang.String r3 = r14.field_path
            r1.f302101r = r3
        L_0x0083:
            bb3.d r1 = f300318d
            if (r1 == 0) goto L_0x0094
            java.util.Map<java.lang.String, xa3.o> r3 = r0.f301471h
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Object r3 = r3.get(r2)
            xa3.c r3 = (xa3.C102587c) r3
            r1.mo126182B(r2, r3, r5)
        L_0x0094:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f301470g
            java.lang.String r14 = r14.field_dataId
            r0.remove(r14)
            return
        L_0x009c:
            java.lang.String r7 = "WeNoteHtmlFile"
            boolean r8 = r2.equals(r7)
            r9 = 4
            r10 = -1
            if (r8 != 0) goto L_0x015c
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r0.f301470g
            boolean r3 = r3.containsValue(r7)
            if (r3 == 0) goto L_0x01f1
            xa3.m r3 = r0.f301467d
            long r7 = r3.f302092c
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00c6
            java.util.HashMap<java.lang.String, xa3.w> r7 = r0.f301469f
            long r10 = r3.f302093d
            java.lang.String r3 = java.lang.Long.toString(r10)
            java.lang.Object r3 = r7.get(r3)
            xa3.w r3 = (xa3.C102607w) r3
            goto L_0x00d2
        L_0x00c6:
            java.util.HashMap<java.lang.String, xa3.w> r3 = r0.f301469f
            java.lang.String r7 = java.lang.Long.toString(r7)
            java.lang.Object r3 = r3.get(r7)
            xa3.w r3 = (xa3.C102607w) r3
        L_0x00d2:
            if (r3 == 0) goto L_0x015b
            wa3.l$a r3 = r3.f302137b
            java.util.List<xa3.o> r3 = r3.f301503a
            if (r3 != 0) goto L_0x00dc
            goto L_0x015b
        L_0x00dc:
            java.util.Iterator r3 = r3.iterator()
        L_0x00e0:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01f1
            java.lang.Object r7 = r3.next()
            xa3.o r7 = (xa3.C102599o) r7
            java.lang.String r8 = r7.f302098o
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x00e0
            r7.f302100q = r5
            int r3 = r7.f302099p
            if (r3 != r9) goto L_0x0136
            r3 = r7
            xa3.v r3 = (xa3.C102606v) r3
            java.lang.String r4 = r14.field_dataId
            te3.rc0 r4 = r0.mo141943e(r4)
            if (r4 != 0) goto L_0x010b
            java.lang.String r4 = "favData is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r4)
            goto L_0x010d
        L_0x010b:
            int r6 = r4.f299338y
        L_0x010d:
            long r8 = (long) r6
            float r1 = wa3.C102368h.m135075f(r8)
            int r1 = (int) r1
            r3.f302132u = r1
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r4 = r3.f302132u
            com.tencent.mm.autogen.events.FavoriteOperationEvent r8 = new com.tencent.mm.autogen.events.FavoriteOperationEvent
            r8.<init>()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$a r9 = r8.f264833d
            r10 = 21
            r9.f264835a = r10
            r9.f264842h = r1
            r9.f264848n = r4
            r8.publish()
            com.tencent.mm.autogen.events.FavoriteOperationEvent$b r1 = r8.f264834e
            java.lang.String r1 = r1.f264857c
            r3.f302133v = r1
            r3.f302135x = r6
            goto L_0x0152
        L_0x0136:
            int r1 = r7.mo142212c()
            if (r1 != r4) goto L_0x014e
            java.lang.String r1 = r14.field_path
            java.util.Map<java.lang.String, xa3.o> r3 = r0.f301471h
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3
            java.lang.Object r3 = r3.get(r2)
            xa3.o r3 = (xa3.C102599o) r3
            java.lang.String r3 = r3.f302101r
            gb3.C98096c.m126708c(r1, r3)
            goto L_0x0152
        L_0x014e:
            java.lang.String r1 = r14.field_path
            r7.f302101r = r1
        L_0x0152:
            bb3.d r1 = f300318d
            if (r1 == 0) goto L_0x01f1
            r1.mo126182B(r2, r7, r5)
            goto L_0x01f1
        L_0x015b:
            return
        L_0x015c:
            java.lang.String r2 = "WNNote:webview reload"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            xa3.m r2 = r0.f301467d
            long r7 = r2.f302092c
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0178
            java.util.HashMap<java.lang.String, xa3.w> r7 = r0.f301469f
            long r10 = r2.f302093d
            java.lang.String r2 = java.lang.Long.toString(r10)
            java.lang.Object r2 = r7.get(r2)
            xa3.w r2 = (xa3.C102607w) r2
            goto L_0x0184
        L_0x0178:
            java.util.HashMap<java.lang.String, xa3.w> r2 = r0.f301469f
            java.lang.String r7 = java.lang.Long.toString(r7)
            java.lang.Object r2 = r2.get(r7)
            xa3.w r2 = (xa3.C102607w) r2
        L_0x0184:
            if (r2 != 0) goto L_0x0187
            return
        L_0x0187:
            java.lang.String r7 = r14.field_path     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106432N(r7)     // Catch:{ Exception -> 0x01e9 }
            r2.f302136a = r7     // Catch:{ Exception -> 0x01e9 }
            r2.f302138c = r6     // Catch:{ Exception -> 0x01e9 }
            bb3.d r7 = f300318d     // Catch:{ Exception -> 0x01e9 }
            if (r7 == 0) goto L_0x01f1
            java.lang.String r8 = "updateDataByHtml, scene:%d, id:%d, msgID:%d, favID:%d"
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01e9 }
            long r10 = r7.f263951g     // Catch:{ Exception -> 0x01e9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x01e9 }
            r9[r6] = r7     // Catch:{ Exception -> 0x01e9 }
            bb3.d r7 = f300318d     // Catch:{ Exception -> 0x01e9 }
            long r10 = r7.f263952h     // Catch:{ Exception -> 0x01e9 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x01e9 }
            r9[r5] = r7     // Catch:{ Exception -> 0x01e9 }
            xa3.m r5 = r0.f301467d     // Catch:{ Exception -> 0x01e9 }
            long r10 = r5.f302093d     // Catch:{ Exception -> 0x01e9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x01e9 }
            r9[r4] = r5     // Catch:{ Exception -> 0x01e9 }
            xa3.m r4 = r0.f301467d     // Catch:{ Exception -> 0x01e9 }
            long r4 = r4.f302092c     // Catch:{ Exception -> 0x01e9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x01e9 }
            r9[r3] = r4     // Catch:{ Exception -> 0x01e9 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r8, r9)     // Catch:{ Exception -> 0x01e9 }
            bb3.d r3 = f300318d     // Catch:{ Exception -> 0x01e9 }
            long r4 = r3.f263951g     // Catch:{ Exception -> 0x01e9 }
            r7 = 1
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x01d3
            r7 = 2
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x01e3
        L_0x01d3:
            long r4 = r3.f263952h     // Catch:{ Exception -> 0x01e9 }
            xa3.m r7 = r0.f301467d     // Catch:{ Exception -> 0x01e9 }
            long r8 = r7.f302093d     // Catch:{ Exception -> 0x01e9 }
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x01e3
            long r7 = r7.f302092c     // Catch:{ Exception -> 0x01e9 }
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x01f1
        L_0x01e3:
            java.lang.String r2 = r2.f302136a     // Catch:{ Exception -> 0x01e9 }
            r3.mo126189I(r2)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x01f1
        L_0x01e9:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r4, r3)
        L_0x01f1:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r0.f301470g
            java.lang.String r14 = r14.field_dataId
            r0.remove(r14)
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ua3.C101994r.mo141496d(wa3.g):void");
    }

    /* renamed from: i1 */
    public void mo139619i1(int i, C100344n nVar) {
        mo141496d(C102367g.m135069a(nVar));
    }

    /* renamed from: o2 */
    public void mo127006o2(int i, C55385t tVar) {
        C102367g a = C102367g.m135069a(C101147j0.m132642w(tVar));
        if (i != 4) {
            a.field_status = 2;
            mo141496d(a);
        }
    }
}
