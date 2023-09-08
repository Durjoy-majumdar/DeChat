package ma1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import oa1.C47346c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49356f02;
import te3.C49495g02;
import te3.C49967ja0;

/* renamed from: ma1.e */
public class C46977e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126301d;

    /* renamed from: e */
    public int f126302e;

    public C46977e(int i) {
        this.f126302e = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126301d = nVar;
        try {
            long currentTicks = Util.currentTicks();
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C49356f02();
            bVar.f127067b = new C49495g02();
            bVar.f127068c = "/cgi-bin/mmexptappsvr-bin/getexptconfig";
            bVar.f127069d = 2738;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            C49356f02 f022 = (C49356f02) a.f127055a.f127080a;
            f022.f133217e = this.f126302e;
            f022.f133216d = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0)).intValue();
            C117543a Cx0 = C117543a.Cx0();
            boolean z = Cx0.f351664j;
            Cx0.f351664j = false;
            f022.f133218f = mo72164j1(z);
            long Dx0 = C117543a.Cx0().Dx0();
            C115669n.INSTANCE.idkeyStat(863, 0, 1, false);
            Object[] objArr = new Object[6];
            objArr[0] = Integer.valueOf(f022.f133217e);
            objArr[1] = Integer.valueOf(f022.f133216d);
            LinkedList<C49967ja0> linkedList = f022.f133218f;
            objArr[2] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            objArr[3] = Long.valueOf(Dx0);
            objArr[4] = Boolean.valueOf(z);
            objArr[5] = Long.valueOf(Util.ticksToNow(currentTicks));
            Log.m105925i("MicroMsg.NetSceneGetExpt", "get expt config scene[%d] lastGetSvrSec[%d] localExptList[%d] exptKeyCount[%d] needFixAllExpt[%b] cost[%d]", objArr);
            return dispatch(gVar, a, this);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NetSceneGetExpt", e, "get expt error", new Object[0]);
            return -1;
        }
    }

    public int getType() {
        return 2738;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.util.LinkedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: android.database.Cursor} */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0055, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        if (r15 == false) goto L_0x00ca;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0130  */
    /* renamed from: j1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList mo72164j1(boolean r15) {
        /*
            r14 = this;
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = 4096(0x1000, float:5.74E-42)
            r3.<init>(r0)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            ma1.a r0 = ma1.C117543a.Cx0()
            pa1.d r0 = r0.f351658d
            r0.getClass()
            java.lang.String r5 = "MicroMsg.ExptStorage"
            java.lang.String r6 = "select rowid,exptId,groupId,exptSeq,exptType,exptCheckSum,paramHashVal,subType from ExptItem order by exptId"
            r7 = 1
            r8 = 0
            r9 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f127268d     // Catch:{ Exception -> 0x0066 }
            android.database.Cursor r6 = r0.rawQuery(r6, r9)     // Catch:{ Exception -> 0x0066 }
            if (r6 == 0) goto L_0x005d
            java.util.LinkedList r10 = new java.util.LinkedList     // Catch:{ Exception -> 0x0059, all -> 0x0055 }
            r10.<init>()     // Catch:{ Exception -> 0x0059, all -> 0x0055 }
        L_0x002e:
            boolean r0 = r6.moveToNext()     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            if (r0 == 0) goto L_0x0040
            oa1.c r0 = new oa1.c     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            r0.<init>()     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            r0.convertFrom(r6)     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            r10.add(r0)     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            goto L_0x002e
        L_0x0040:
            java.lang.String r0 = "get all expt without content [%d]"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            int r11 = r10.size()     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            r9[r8] = r11     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r0, r9)     // Catch:{ Exception -> 0x0053, all -> 0x0055 }
            r9 = r10
            goto L_0x005d
        L_0x0053:
            r0 = move-exception
            goto L_0x005b
        L_0x0055:
            r0 = move-exception
            r9 = r6
            goto L_0x012e
        L_0x0059:
            r0 = move-exception
            r10 = r9
        L_0x005b:
            r9 = r6
            goto L_0x0068
        L_0x005d:
            if (r6 == 0) goto L_0x007b
            r6.close()
            goto L_0x007b
        L_0x0063:
            r0 = move-exception
            goto L_0x012e
        L_0x0066:
            r0 = move-exception
            r10 = r9
        L_0x0068:
            java.lang.String r6 = "get all expt without content error [%s]"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0063 }
            r11[r8] = r0     // Catch:{ all -> 0x0063 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r11)     // Catch:{ all -> 0x0063 }
            if (r9 == 0) goto L_0x007a
            r9.close()
        L_0x007a:
            r9 = r10
        L_0x007b:
            java.lang.String r0 = "MicroMsg.NetSceneGetExpt"
            if (r9 == 0) goto L_0x0118
            int r5 = r9.size()
            if (r5 <= 0) goto L_0x0118
            java.util.Iterator r5 = r9.iterator()
            r6 = 0
        L_0x008a:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0118
            java.lang.Object r9 = r5.next()
            oa1.c r9 = (oa1.C47346c) r9
            te3.ja0 r10 = new te3.ja0
            r10.<init>()
            int r11 = r9.field_exptId
            r10.f135957d = r11
            int r11 = r9.field_groupId
            r10.f135958e = r11
            int r11 = r9.field_exptSeq
            r10.f135959f = r11
            java.lang.String r11 = r9.field_exptCheckSum
            r10.f135962i = r11
            java.lang.String r11 = r9.field_paramHashVal
            java.lang.String r12 = ""
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r11, (java.lang.String) r12)
            r10.f135964n = r11
            boolean r11 = r9.mo72387o2()
            if (r11 != 0) goto L_0x00c8
            int r11 = r9.field_exptType
            r13 = 10
            if (r11 != r13) goto L_0x00c3
            r11 = 1
            goto L_0x00c4
        L_0x00c3:
            r11 = 0
        L_0x00c4:
            if (r11 != 0) goto L_0x00c8
            if (r15 == 0) goto L_0x00ca
        L_0x00c8:
            r10.f135962i = r12
        L_0x00ca:
            r4.add(r10)
            r10 = 100
            if (r6 < r10) goto L_0x00df
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r8] = r3
            java.lang.String r10 = "req local exptList [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r6)
            r3.setLength(r8)
            r6 = 0
        L_0x00df:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "{Id: "
            r10.append(r11)
            int r11 = r9.field_exptId
            r10.append(r11)
            java.lang.String r11 = " group: "
            r10.append(r11)
            int r11 = r9.field_groupId
            r10.append(r11)
            java.lang.String r11 = " seq: "
            r10.append(r11)
            int r9 = r9.field_exptSeq
            r10.append(r9)
            java.lang.String r9 = "}"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r3.append(r9)
            java.lang.String r9 = ";"
            r3.append(r9)
            int r6 = r6 + r7
            goto L_0x008a
        L_0x0118:
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r8] = r3
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r5[r7] = r1
            java.lang.String r1 = "req local exptList [%s] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r5)
            return r4
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            r9.close()
        L_0x0133:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.C46977e.mo72164j1(boolean):java.util.LinkedList");
    }

    /* renamed from: k1 */
    public final void mo72165k1(int i) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GET_EXPT_LAST_TIME_SEC_INT;
        int nowSecond = (int) Util.nowSecond();
        if (nowSecond > i) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(nowSecond));
        } else {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i));
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        String str3 = str;
        int i6 = 0;
        String str4 = "MicroMsg.NetSceneGetExpt";
        Log.m105925i(str4, "get expt on gy end. errType[%d] erroCode[%d] errMsg[%s]", Integer.valueOf(i2), Integer.valueOf(i3), str3);
        if (i4 == 0 && i5 == 0) {
            C49495g02 g022 = (C49495g02) ((C47350c) uVar).f127056b.f127083a;
            long currentTicks = Util.currentTicks();
            if (!(g022 == null || g022.getBaseResponse() == null)) {
                if (g022.getBaseResponse().f135955d != 0) {
                    Log.m105929w(str4, "get expt error. resp baseResp [%d] [%s]", Integer.valueOf(g022.getBaseResponse().f135955d), g022.getBaseResponse().f135956e);
                    C115669n.INSTANCE.idkeyStat(863, 2, 1, false);
                } else {
                    LinkedList linkedList = new LinkedList();
                    LinkedList<C49967ja0> linkedList2 = g022.f133762g;
                    if (linkedList2 != null && !linkedList2.isEmpty()) {
                        Iterator<C49967ja0> it = g022.f133762g.iterator();
                        while (it.hasNext()) {
                            C49967ja0 next = it.next();
                            C47346c cVar = new C47346c();
                            cVar.mo72384l2(next.f135960g);
                            cVar.field_exptCheckSum = next.f135962i;
                            String str5 = str4;
                            cVar.field_bucketSrc = next.f135963j;
                            cVar.field_paramHashVal = next.f135964n;
                            int i7 = cVar.field_exptId;
                            int i8 = next.f135957d;
                            if (i7 == i8 && cVar.field_groupId == next.f135958e && cVar.field_exptSeq == next.f135959f) {
                                str2 = str5;
                            } else {
                                Object[] objArr = {Integer.valueOf(i8), Integer.valueOf(next.f135958e), Integer.valueOf(next.f135959f), Integer.valueOf(cVar.field_exptId), Integer.valueOf(cVar.field_groupId), Integer.valueOf(cVar.field_exptSeq)};
                                str2 = str5;
                                Log.m105929w(str2, "expt item proto[%d %d %d] is different expt content[%d %d %d]", objArr);
                                C115669n.INSTANCE.idkeyStat(863, 6, 1, false);
                            }
                            linkedList.add(cVar);
                            str4 = str2;
                        }
                    }
                    String str6 = str4;
                    C117543a.Cx0().Nx0(g022.f133763h, g022.f133761f, linkedList, g022.f133764i);
                    mo72165k1(g022.f133759d);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_GET_EXPT_INTERVAL_SEC_INT, Integer.valueOf(g022.f133760e));
                    C115669n.INSTANCE.idkeyStat(863, 1, 1, false);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = Integer.valueOf(g022.f133759d);
                    objArr2[1] = Integer.valueOf(g022.f133760e);
                    objArr2[2] = Integer.valueOf(g022.f133763h);
                    LinkedList<Integer> linkedList3 = g022.f133761f;
                    if (linkedList3 != null) {
                        i6 = linkedList3.size();
                    }
                    objArr2[3] = Integer.valueOf(i6);
                    objArr2[4] = Integer.valueOf(linkedList.size());
                    objArr2[5] = Long.valueOf(Util.ticksToNow(currentTicks));
                    Log.m105925i(str6, "update expt svrTime:%d interval:%d exptFlag:%d  deleteCount:[svr:%d] replaceCount:[svr:%d] cost[%d]", objArr2);
                }
            }
        } else {
            C115669n.INSTANCE.idkeyStat(863, 2, 1, false);
            Log.m105928w(str4, "get expt error");
            mo72165k1((int) Util.nowSecond());
        }
        this.f126301d.onSceneEnd(i4, i5, str3, this);
    }
}
