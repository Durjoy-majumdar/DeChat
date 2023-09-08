package qg2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import og2.C100346q;
import te3.C101834rc0;
import te3.C48691ac;
import te3.C52240zb;
import te3.ki4;

/* renamed from: qg2.t */
public class C101168t extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f296113d;

    /* renamed from: e */
    public C11385n f296114e = null;

    /* renamed from: f */
    public String f296115f = "";

    /* renamed from: g */
    public C100346q f296116g = null;

    /* renamed from: h */
    public SparseArray<C101834rc0> f296117h = new SparseArray<>();

    /* renamed from: i */
    public SparseBooleanArray f296118i = new SparseBooleanArray();

    /* renamed from: j */
    public int f296119j = 0;

    /* renamed from: n */
    public int f296120n = 0;

    public C101168t(C100346q qVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52240zb();
        bVar.f127067b = new C48691ac();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchtranscdnitem";
        bVar.f127069d = 632;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f296113d = bVar.mo72403a();
        this.f296116g = qVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0151, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int doScene(com.tencent.p014mm.network.C114770g r17, ob0.C11385n r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r0.f296114e = r1
            ob0.c r1 = r0.f296113d
            ob0.c$c r1 = r1.f127055a
            pe3.a r1 = r1.f127080a
            te3.zb r1 = (te3.C52240zb) r1
            android.util.SparseArray<te3.rc0> r2 = r0.f296117h
            r2.clear()
            android.util.SparseBooleanArray r2 = r0.f296118i
            r2.clear()
            og2.q r2 = r0.f296116g
            te3.kd0 r2 = r2.field_dataProto
            java.util.LinkedList<te3.rc0> r2 = r2.f298618f
            int r2 = r2.size()
            r3 = -100
            java.lang.String r4 = "MicroMsg.NetSceneTransCDN"
            if (r2 != 0) goto L_0x0030
            java.lang.String r1 = "doScene data list null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r0.f296119j = r3
            return r3
        L_0x0030:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r5 = r0.f296120n
        L_0x0037:
            og2.q r6 = r0.f296116g
            te3.kd0 r6 = r6.field_dataProto
            java.util.LinkedList<te3.rc0> r6 = r6.f298618f
            int r6 = r6.size()
            r7 = 3
            r8 = 2
            r9 = 0
            r10 = 1
            if (r5 >= r6) goto L_0x0150
            og2.q r6 = r0.f296116g
            te3.kd0 r6 = r6.field_dataProto
            java.util.LinkedList<te3.rc0> r6 = r6.f298618f
            java.lang.Object r6 = r6.get(r5)
            te3.rc0 r6 = (te3.C101834rc0) r6
            boolean r11 = r6.f299268N
            if (r11 == 0) goto L_0x0063
            java.lang.String r11 = r6.f299325s
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x0063
            r8 = r4
            r4 = 0
            goto L_0x0152
        L_0x0063:
            java.lang.String r11 = r6.f299325s
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            java.lang.String r12 = ""
            r13 = 5
            r14 = 4
            if (r11 != 0) goto L_0x00cb
            te3.ki4 r11 = new te3.ki4
            r11.<init>()
            java.lang.String r15 = r6.f299325s
            r11.f136811e = r15
            java.lang.String r15 = r6.f299329u
            r11.f136812f = r15
            int r15 = r6.f299258I
            r11.f136813g = r15
            r15 = r4
            long r3 = r6.f299276R
            int r4 = (int) r3
            long r3 = (long) r4
            r11.f136814h = r3
            java.lang.String r3 = r6.f299280T
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r12)
            int r3 = r3.hashCode()
            r11.f136810d = r3
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r9] = r3
            java.lang.String r3 = r6.f299280T
            r4[r10] = r3
            int r3 = r11.f136813g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r8] = r3
            java.lang.String r3 = r6.f299325s
            r4[r7] = r3
            long r7 = r6.f299276R
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r4[r14] = r7
            java.lang.String r7 = "add cdnitem, clientID[%d] dataID[%s] datatype[%d] dataurl[%s] size[%d]"
            r8 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r7, r4)
            r2.add(r11)
            android.util.SparseArray<te3.rc0> r4 = r0.f296117h
            int r7 = r11.f136810d
            r4.put(r7, r6)
            android.util.SparseBooleanArray r4 = r0.f296118i
            int r7 = r11.f136810d
            r4.put(r7, r9)
            goto L_0x00cc
        L_0x00cb:
            r8 = r4
        L_0x00cc:
            java.lang.String r4 = r6.f299305h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0140
            te3.ki4 r4 = new te3.ki4
            r4.<init>()
            java.lang.String r7 = r6.f299305h
            r4.f136811e = r7
            java.lang.String r7 = r6.f299309j
            r4.f136812f = r7
            r7 = 2
            r4.f136813g = r7
            long r14 = r6.f299336x0
            int r11 = (int) r14
            long r14 = (long) r11
            r4.f136814h = r14
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r14 = r6.f299280T
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r12)
            r11.append(r12)
            java.lang.String r12 = "@thumb"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            int r11 = r11.hashCode()
            r4.f136810d = r11
            java.lang.Object[] r12 = new java.lang.Object[r13]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12[r9] = r11
            java.lang.String r11 = r6.f299280T
            r12[r10] = r11
            int r11 = r4.f136813g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 2
            r12[r13] = r11
            java.lang.String r11 = r6.f299305h
            r3 = 3
            r12[r3] = r11
            long r13 = r6.f299336x0
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r7 = 4
            r12[r7] = r11
            java.lang.String r7 = "add cdnitem, clientID[%d] thumbID[%s_t] datatype[%d] thumburl[%s] size[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r7, r12)
            r2.add(r4)
            android.util.SparseArray<te3.rc0> r7 = r0.f296117h
            int r11 = r4.f136810d
            r7.put(r11, r6)
            android.util.SparseBooleanArray r6 = r0.f296118i
            int r4 = r4.f136810d
            r6.put(r4, r10)
        L_0x0140:
            int r4 = r2.size()
            r6 = 20
            if (r4 < r6) goto L_0x0149
            goto L_0x0151
        L_0x0149:
            int r5 = r5 + 1
            r4 = r8
            r3 = -100
            goto L_0x0037
        L_0x0150:
            r8 = r4
        L_0x0151:
            r4 = 1
        L_0x0152:
            int r5 = r5 + r10
            r0.f296120n = r5
            int r5 = r2.size()
            r1.f145783d = r5
            java.util.LinkedList<te3.ki4> r5 = r1.f145784e
            r5.clear()
            java.util.LinkedList<te3.ki4> r5 = r1.f145784e
            r5.addAll(r2)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            og2.q r3 = r0.f296116g
            te3.kd0 r3 = r3.field_dataProto
            java.util.LinkedList<te3.rc0> r3 = r3.f298618f
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r9] = r3
            android.util.SparseArray<te3.rc0> r3 = r0.f296117h
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r10] = r3
            int r3 = r0.f296120n
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 2
            r2[r5] = r3
            java.lang.String r3 = "ashutest::data list size %d, need check size %d, nextIndex %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r2)
            int r1 = r1.f145783d
            if (r1 <= 0) goto L_0x01a2
            if (r4 != 0) goto L_0x0199
            goto L_0x01a2
        L_0x0199:
            ob0.c r1 = r0.f296113d
            r2 = r17
            int r1 = r0.dispatch(r2, r1, r0)
            return r1
        L_0x01a2:
            og2.q r1 = r0.f296116g
            java.lang.String r2 = r1.field_title
            java.lang.String r3 = r1.field_desc
            te3.kd0 r4 = r1.field_dataProto
            r6 = 0
            java.lang.String r5 = ""
            java.lang.String r1 = qg2.C101147j0.m132626g(r2, r3, r4, r5, r6)
            r0.f296115f = r1
            java.lang.String r1 = "doScene no more data"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            r1 = -100
            r0.f296119j = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101168t.doScene(com.tencent.mm.network.g, ob0.n):int");
    }

    public int getType() {
        return 632;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        int i6 = 6;
        char c = 0;
        boolean z = true;
        char c2 = 2;
        char c3 = 3;
        char c4 = 4;
        Log.m105925i("MicroMsg.NetSceneTransCDN", "netId %d errType %d errCode %d localErrCode %d begIndex %d errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(this.f296119j), Integer.valueOf(this.f296120n), str2);
        if (i4 == 3 && this.f296119j == -100) {
            C100346q qVar = this.f296116g;
            this.f296115f = C101147j0.m132626g(qVar.field_title, qVar.field_desc, qVar.field_dataProto, "", 0);
            this.f296114e.onSceneEnd(0, 0, str2, this);
        } else if (i4 == 0 && i5 == 0) {
            Iterator<ki4> it = ((C48691ac) ((C47350c) uVar).f127056b.f127083a).f130423e.iterator();
            while (it.hasNext()) {
                ki4 next = it.next();
                C101834rc0 rc02 = this.f296117h.get(next.f136810d);
                if (rc02 != null) {
                    if (this.f296118i.get(next.f136810d)) {
                        Object[] objArr = new Object[i6];
                        objArr[c] = Integer.valueOf(next.f136810d);
                        objArr[1] = rc02.f299280T;
                        objArr[c2] = rc02.f299305h;
                        objArr[c3] = next.f136811e;
                        objArr[c4] = Long.valueOf(rc02.f299336x0);
                        objArr[5] = Long.valueOf(next.f136814h);
                        Log.m105925i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[true], old thumb url[%s], new thumb url[%s], old size[%d], new size[%d]", objArr);
                        rc02.mo141256l(next.f136811e);
                        rc02.mo141255k(next.f136812f);
                        if (!Util.isNullOrNil(next.f136811e) && !Util.isNullOrNil(next.f136812f)) {
                            long j = next.f136814h;
                            if (j > 0) {
                                rc02.mo141243R(j);
                            }
                        }
                        Log.m105928w("MicroMsg.NetSceneTransCDN", "match error server return");
                        i4 = 3;
                    } else {
                        Object[] objArr2 = new Object[6];
                        objArr2[c] = Integer.valueOf(next.f136810d);
                        objArr2[1] = rc02.f299280T;
                        objArr2[2] = rc02.f299325s;
                        objArr2[3] = next.f136811e;
                        objArr2[c4] = Long.valueOf(rc02.f299276R);
                        objArr2[5] = Long.valueOf(next.f136814h);
                        Log.m105925i("MicroMsg.NetSceneTransCDN", "trans end, client id[%d], dataId[%s], isThumb[false], old url[%s], new url[%s], old size[%d], new size[%d]", objArr2);
                        rc02.mo141254j(next.f136811e);
                        rc02.mo141253f(next.f136812f);
                        if (!Util.isNullOrNil(next.f136811e) && !Util.isNullOrNil(next.f136812f)) {
                            long j2 = next.f136814h;
                            if (j2 > 0) {
                                rc02.mo141269y(j2);
                            }
                        }
                        Log.m105928w("MicroMsg.NetSceneTransCDN", "match error server return");
                        i4 = 3;
                    }
                    i6 = 6;
                    c = 0;
                    c2 = 2;
                    c3 = 3;
                    c4 = 4;
                }
            }
            boolean z2 = this.f296120n < this.f296116g.field_dataProto.f298618f.size();
            boolean z3 = false;
            Log.m105925i("MicroMsg.NetSceneTransCDN", "check need continue, indexOK %B", Boolean.valueOf(z2));
            if (z2) {
                if (doScene(dispatcher(), this.f296114e) == -100) {
                    z3 = true;
                }
                z = z3;
            }
            if (z) {
                Log.m105924i("MicroMsg.NetSceneTransCDN", "do callback");
                C100346q qVar2 = this.f296116g;
                this.f296115f = C101147j0.m132626g(qVar2.field_title, qVar2.field_desc, qVar2.field_dataProto, "", 0);
                this.f296114e.onSceneEnd(i4, i5, str2, this);
            }
        } else {
            this.f296114e.onSceneEnd(i4, i5, str2, this);
        }
    }

    public int securityLimitCount() {
        return 10;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
