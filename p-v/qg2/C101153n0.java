package qg2;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92822e;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31478i2;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98408n0;
import hd0.C98410o0;
import i40.C98597b;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ng2.C100113c;
import ob0.C11385n;
import ob0.C117747y;
import og2.C100336e;
import og2.C100342l;
import og2.C100344n;
import og2.C100346q;
import og2.C77006j;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p158gt.C76051j;
import p158gt.C76053l;
import p158gt.C98201k;
import p663qo.C101213l;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p749xh.C66261f3;
import p753xp.C102704b;
import p763ym.C53543s;
import p823sg.C90193h;
import p867wp.C102479b;
import pb1.C100734q;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C77915dp3;

/* renamed from: qg2.n0 */
public class C101153n0 implements C11385n, C100342l {

    /* renamed from: d */
    public boolean f296071d = false;

    /* renamed from: e */
    public int f296072e = -1;

    /* renamed from: f */
    public SparseArray<C101162f> f296073f = new SparseArray<>();

    /* renamed from: g */
    public LinkedList<C100346q> f296074g = new LinkedList<>();

    /* renamed from: h */
    public int f296075h = 7;

    /* renamed from: qg2.n0$a */
    public class C101154a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100346q f296076d;

        /* renamed from: e */
        public final /* synthetic */ boolean f296077e;

        public C101154a(C100346q qVar, boolean z) {
            this.f296076d = qVar;
            this.f296077e = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x026c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                og2.q r0 = r1.f296076d
                r2 = 1
                r3 = 0
                r4 = 2
                java.lang.String r5 = "MicroMsg.RecordMsgSendService"
                if (r0 == 0) goto L_0x0056
                qg2.n0 r6 = qg2.C101153n0.this
                android.util.SparseArray<qg2.n0$f> r6 = r6.f296073f
                int r0 = r0.field_localId
                java.lang.Object r0 = r6.get(r0)
                qg2.n0$f r0 = (qg2.C101153n0.C101162f) r0
                if (r0 != 0) goto L_0x0045
                java.lang.Object[] r0 = new java.lang.Object[r4]
                og2.q r6 = r1.f296076d
                int r6 = r6.field_localId
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0[r3] = r6
                og2.q r6 = r1.f296076d
                long r6 = r6.field_msgId
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r0[r2] = r6
                java.lang.String r6 = "summerrecord do add job, localid %d, msgid %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r6, r0)
                qg2.n0$f r0 = new qg2.n0$f
                r0.<init>()
                qg2.n0 r6 = qg2.C101153n0.this
                android.util.SparseArray<qg2.n0$f> r6 = r6.f296073f
                og2.q r7 = r1.f296076d
                int r7 = r7.field_localId
                r6.put(r7, r0)
            L_0x0045:
                qg2.n0 r0 = qg2.C101153n0.this
                og2.q r6 = r1.f296076d
                java.util.LinkedList<og2.q> r7 = r0.f296074g
                boolean r7 = r7.contains(r6)
                if (r7 != 0) goto L_0x0056
                java.util.LinkedList<og2.q> r0 = r0.f296074g
                r0.add(r6)
            L_0x0056:
                qg2.n0 r6 = qg2.C101153n0.this
                boolean r7 = r1.f296077e
                java.lang.Class<og2.e> r8 = og2.C100336e.class
                boolean r0 = r6.f296071d
                if (r0 == 0) goto L_0x0072
                java.lang.Object[] r0 = new java.lang.Object[r2]
                int r2 = r6.f296072e
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r3] = r2
                java.lang.String r2 = "summerrecord is working, return lastWorkType:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
                goto L_0x0271
            L_0x0072:
                java.util.LinkedList<og2.q> r0 = r6.f296074g
                boolean r0 = r0.isEmpty()
                r9 = 86400000(0x5265c00, double:4.2687272E-316)
                if (r0 == 0) goto L_0x01cf
                java.lang.String r0 = "summerrecord jobs list size is 0"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
                boolean r0 = pb1.C100734q.m131843d0()
                if (r0 == 0) goto L_0x00b9
                di3.d r0 = di3.C86312j.m106911c(r8)
                og2.e r0 = (og2.C100336e) r0
                og2.k r0 = r0.k10()
                qg2.h0 r0 = (qg2.C101143h0) r0
                r0.getClass()
                com.tencent.mm.sdk.storage.sql.SingleTable r12 = p749xh.C102674v7.f303023q
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r12 = r12.selectAll()
                com.tencent.mm.sdk.storage.sql.Column r13 = p749xh.C102674v7.f303025s
                java.lang.Integer r14 = java.lang.Integer.valueOf(r2)
                com.tencent.mm.sdk.storage.sql.SingleCondition r13 = r13.notEqual((java.lang.Number) r14)
                com.tencent.mm.sdk.storage.sql.SelectSql$Builder r12 = r12.where(r13)
                com.tencent.mm.sdk.storage.sql.SelectSql r12 = r12.build()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f296046d
                java.lang.Class<og2.q> r13 = og2.C100346q.class
                java.util.List r0 = r12.multiQuery(r0, r13)
                goto L_0x011e
            L_0x00b9:
                di3.d r0 = di3.C86312j.m106911c(r8)
                og2.e r0 = (og2.C100336e) r0
                og2.k r0 = r0.k10()
                qg2.h0 r0 = (qg2.C101143h0) r0
                r0.getClass()
                java.util.LinkedList r12 = new java.util.LinkedList
                r12.<init>()
                android.database.Cursor r13 = r0.getAll()
                java.lang.String r14 = "MicroMsg.RecordMsgStorage"
                if (r13 == 0) goto L_0x010c
                r13.moveToFirst()
            L_0x00d8:
                boolean r0 = r13.isAfterLast()
                if (r0 != 0) goto L_0x0109
                og2.q r15 = new og2.q
                r15.<init>()
                r15.convertFrom(r13)     // Catch:{ Exception -> 0x00e7 }
                goto L_0x0102
            L_0x00e7:
                r0 = move-exception
                r16 = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r11 = "convert recordInfo Exception: "
                r0.append(r11)
                java.lang.String r11 = r16.getMessage()
                r0.append(r11)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            L_0x0102:
                r12.add(r15)
                r13.moveToNext()
                goto L_0x00d8
            L_0x0109:
                r13.close()
            L_0x010c:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                int r11 = r12.size()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                r0[r3] = r11
                java.lang.String r11 = "get all finish, result count %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r11, r0)
                r0 = r12
            L_0x011e:
                java.util.Iterator r0 = r0.iterator()
            L_0x0122:
                boolean r11 = r0.hasNext()
                if (r11 == 0) goto L_0x01cf
                java.lang.Object r11 = r0.next()
                og2.q r11 = (og2.C100346q) r11
                java.lang.Class<f62.k0> r12 = f62.C75700k0.class
                k40.a r12 = f40.C86709a0.m107533q(r12)
                f62.k0 r12 = (f62.C75700k0) r12
                g62.l r12 = r12.mo96095LE()
                long r13 = r11.field_msgId
                com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
                com.tencent.mm.storage.f4 r12 = r12.b00(r13)
                int r12 = r12.getType()
                r13 = 49
                if (r12 == r13) goto L_0x0174
                java.lang.Object[] r12 = new java.lang.Object[r4]
                int r13 = r11.field_localId
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r12[r3] = r13
                long r13 = r11.field_msgId
                java.lang.Long r13 = java.lang.Long.valueOf(r13)
                r12[r2] = r13
                java.lang.String r13 = "summerrecord record msg not exist, delete record info, localid[%d], msgid[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r13, r12)
                di3.d r12 = di3.C86312j.m106911c(r8)
                og2.e r12 = (og2.C100336e) r12
                og2.k r12 = r12.k10()
                int r11 = r11.field_localId
                qg2.h0 r12 = (qg2.C101143h0) r12
                r12.mo140594jo(r11)
                goto L_0x0122
            L_0x0174:
                android.util.SparseArray<qg2.n0$f> r12 = r6.f296073f
                int r13 = r11.field_localId
                java.lang.Object r12 = r12.get(r13)
                qg2.n0$f r12 = (qg2.C101153n0.C101162f) r12
                if (r12 == 0) goto L_0x0198
                int r13 = r12.f296101b
                if (r13 >= 0) goto L_0x0190
                long r13 = android.os.SystemClock.elapsedRealtime()
                long r2 = r12.f296100a
                long r13 = r13 - r2
                int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r2 >= 0) goto L_0x0190
                goto L_0x01cb
            L_0x0190:
                int r2 = r12.f296101b
                if (r2 >= 0) goto L_0x01a4
                r2 = 3
                r12.f296101b = r2
                goto L_0x01a4
            L_0x0198:
                qg2.n0$f r2 = new qg2.n0$f
                r2.<init>()
                android.util.SparseArray<qg2.n0$f> r3 = r6.f296073f
                int r12 = r11.field_localId
                r3.put(r12, r2)
            L_0x01a4:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                int r3 = r11.field_localId
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r12 = 0
                r2[r12] = r3
                long r12 = r11.field_msgId
                java.lang.Long r3 = java.lang.Long.valueOf(r12)
                r12 = 1
                r2[r12] = r3
                java.lang.String r3 = "summerrecord do add job from db, localid %d, msgid %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r3, r2)
                java.util.LinkedList<og2.q> r2 = r6.f296074g
                boolean r2 = r2.contains(r11)
                if (r2 != 0) goto L_0x01cb
                java.util.LinkedList<og2.q> r2 = r6.f296074g
                r2.add(r11)
            L_0x01cb:
                r2 = 1
                r3 = 0
                goto L_0x0122
            L_0x01cf:
                java.util.LinkedList<og2.q> r0 = r6.f296074g
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x01ec
                java.lang.String r0 = "try to do job, but job list size is empty, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
                java.util.LinkedList<og2.q> r0 = r6.f296074g
                r0.clear()
                android.util.SparseArray<qg2.n0$f> r0 = r6.f296073f
                r0.clear()
                r2 = 0
                r6.f296071d = r2
                goto L_0x0271
            L_0x01ec:
                java.util.LinkedList<og2.q> r0 = r6.f296074g
                java.lang.Object r0 = r0.removeFirst()
                og2.q r0 = (og2.C100346q) r0
                android.util.SparseArray<qg2.n0$f> r2 = r6.f296073f
                int r3 = r0.field_localId
                java.lang.Object r2 = r2.get(r3)
                qg2.n0$f r2 = (qg2.C101153n0.C101162f) r2
                if (r2 != 0) goto L_0x020c
                qg2.n0$f r2 = new qg2.n0$f
                r2.<init>()
                android.util.SparseArray<qg2.n0$f> r3 = r6.f296073f
                int r5 = r0.field_localId
                r3.put(r5, r2)
            L_0x020c:
                int r3 = r2.f296101b
                r5 = 1
                int r3 = r3 - r5
                r2.f296101b = r3
                if (r3 >= 0) goto L_0x0223
                long r11 = android.os.SystemClock.elapsedRealtime()
                long r13 = r2.f296100a
                long r11 = r11 - r13
                int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r3 <= 0) goto L_0x0221
                r2 = 0
                goto L_0x022a
            L_0x0221:
                r2.f296101b = r4
            L_0x0223:
                long r8 = android.os.SystemClock.elapsedRealtime()
                r2.f296100a = r8
                r2 = 1
            L_0x022a:
                if (r2 == 0) goto L_0x026c
                r2 = 1
                r6.f296071d = r2
                int r3 = r0.field_type
                r6.f296072e = r3
                if (r3 == 0) goto L_0x0261
                if (r3 == r2) goto L_0x0256
                if (r3 == r4) goto L_0x024b
                r2 = 3
                if (r3 == r2) goto L_0x0240
                r2 = 0
                r6.f296071d = r2
                goto L_0x0271
            L_0x0240:
                qg2.n0$c r2 = new qg2.n0$c
                r2.<init>(r0)
                java.lang.String r0 = "RecordMsgSendService_chatDataDownLoad"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r0)
                goto L_0x0271
            L_0x024b:
                qg2.n0$b r2 = new qg2.n0$b
                r2.<init>(r0)
                java.lang.String r0 = "RecordMsgSendService_chatDataCopy"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r0)
                goto L_0x0271
            L_0x0256:
                qg2.n0$d r2 = new qg2.n0$d
                r2.<init>(r0)
                java.lang.String r0 = "RecordMsgSendService_favDataCopy"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r0)
                goto L_0x0271
            L_0x0261:
                qg2.n0$e r2 = new qg2.n0$e
                r2.<init>(r0, r7)
                java.lang.String r0 = "RecordMsgSendService_normalDataCopy"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r2, r0)
                goto L_0x0271
            L_0x026c:
                r0 = 0
                r2 = 0
                r6.mo140599f(r0, r2)
            L_0x0271:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg2.C101153n0.C101154a.run():void");
        }

        public String toString() {
            return super.toString() + "|run";
        }
    }

    /* renamed from: qg2.n0$b */
    public class C101155b implements Runnable {

        /* renamed from: d */
        public C100346q f296079d;

        public C101155b(C100346q qVar) {
            this.f296079d = qVar;
        }

        public void run() {
            boolean z;
            boolean z2;
            C101801kd0 kd02;
            LinkedList<C101834rc0> linkedList;
            Class cls = C100336e.class;
            Log.m105925i("MicroMsg.RecordMsgSendService", "dojob ChatDataCopyRunnable, info id:%s", Long.valueOf(this.f296079d.field_msgId));
            C100346q qVar = this.f296079d;
            if (qVar == null || (kd02 = qVar.field_dataProto) == null || (linkedList = kd02.f298618f) == null) {
                z2 = false;
                z = false;
            } else {
                Iterator<C101834rc0> it = linkedList.iterator();
                z2 = false;
                z = false;
                while (it.hasNext()) {
                    C101834rc0 next = it.next();
                    if (!Util.isNullOrNil(next.f299325s) || C86013q1.m106450k(next.f299284V)) {
                        String str = next.f299284V;
                        String q = C101147j0.m132636q(next, this.f296079d.field_msgId, 1);
                        boolean z3 = C86013q1.m106443d(str, q, false) > 0;
                        C101153n0.m132654a(C101153n0.this, q);
                        Log.m105919d("MicroMsg.RecordMsgSendService", "summerrecord CdnDataUrl[%s] copy[%s] to [%s] result[%B]", next.f299325s, str, q, Boolean.valueOf(z3));
                        if (z3) {
                            if (Util.isNullOrNil(next.f299266M)) {
                                Log.m105924i("MicroMsg.RecordMsgSendService", "summerrecord not find full md5, try to calculate");
                                next.mo141268x(C86013q1.m106456q(q));
                                z2 = true;
                            }
                            if (Util.isNullOrNil(next.f299271P)) {
                                Log.m105924i("MicroMsg.RecordMsgSendService", "summerrecord not find head 256 md5, try to calculate");
                                byte[] O = C86013q1.m106433O(q, 0, 256);
                                next.mo141270z(O == null ? null : C90193h.m112878f(O));
                                z2 = true;
                            }
                        }
                        if (C86013q1.m106451l(q) != 0) {
                            next.mo141269y(C86013q1.m106451l(q));
                        }
                        String v = C101147j0.m132641v(next.f299280T, this.f296079d.field_msgId, false);
                        C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(v);
                        if (qq == null) {
                            C100344n nVar = new C100344n();
                            nVar.field_cdnKey = next.f299329u;
                            nVar.field_cdnUrl = next.f299325s;
                            nVar.field_dataId = next.f299280T;
                            nVar.field_mediaId = v;
                            nVar.field_totalLen = (int) next.f299276R;
                            nVar.field_localId = v.hashCode();
                            nVar.field_path = C101147j0.m132636q(next, this.f296079d.field_msgId, 1);
                            nVar.field_type = 2;
                            nVar.field_fileType = C101147j0.m132635p(next.f299258I, (int) next.f299276R);
                            C100346q qVar2 = this.f296079d;
                            nVar.field_recordLocalId = qVar2.field_localId;
                            nVar.field_toUser = qVar2.field_toUser;
                            nVar.field_isThumb = false;
                            Log.m105925i("MicroMsg.RecordMsgSendService", "summerrecord insert localId[%d] result[%B] fileType[%d], mediaId[%s]", Integer.valueOf(nVar.field_localId), Boolean.valueOf(((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).insert(nVar)), Integer.valueOf(nVar.field_fileType), v);
                        } else {
                            int i = qq.field_status;
                            if (!(i == 2 || i == 3 || i == 4 || i == -1)) {
                                Log.m105925i("MicroMsg.RecordMsgSendService", "hasInsertCdn, cdnInfo status:%s", Integer.valueOf(i));
                            }
                        }
                        z = true;
                    }
                    if (!Util.isNullOrNil(next.f299305h) || C86013q1.m106450k(next.f299286W)) {
                        String str2 = next.f299286W;
                        String D = C101147j0.m132611D(next, this.f296079d.field_msgId, 1);
                        boolean z4 = C86013q1.m106443d(str2, D, false) > 0;
                        C101153n0.m132654a(C101153n0.this, D);
                        Log.m105919d("MicroMsg.RecordMsgSendService", "copy thumb[%s] to [%s] result[%B]", str2, D, Boolean.valueOf(z4));
                        next.mo141243R(C86013q1.m106451l(D));
                        if (z4) {
                            if (Util.isNullOrNil(next.f299288X)) {
                                Log.m105924i("MicroMsg.RecordMsgSendService", "not find ThumbMd5 md5, try to calculate");
                                next.mo141245T(C86013q1.m106456q(D));
                                z2 = true;
                            }
                            if (Util.isNullOrNil(next.f299292Z)) {
                                Log.m105924i("MicroMsg.RecordMsgSendService", "not find Thumb Head 256 Md5, try to calculate");
                                next.mo141244S(C90193h.m112877e(D, 0, 256));
                                z2 = true;
                            }
                        }
                        String C = C101147j0.m132610C(next.f299280T);
                        String v2 = C101147j0.m132641v(C, this.f296079d.field_msgId, false);
                        C100344n qq4 = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(v2);
                        if (qq4 == null) {
                            C100344n nVar2 = new C100344n();
                            nVar2.field_cdnKey = next.f299309j;
                            nVar2.field_cdnUrl = next.f299305h;
                            nVar2.field_dataId = C;
                            nVar2.field_mediaId = v2;
                            nVar2.field_totalLen = (int) next.f299336x0;
                            nVar2.field_localId = v2.hashCode();
                            nVar2.field_path = C101147j0.m132611D(next, this.f296079d.field_msgId, 1);
                            nVar2.field_type = 2;
                            nVar2.field_fileType = 1;
                            C100346q qVar3 = this.f296079d;
                            nVar2.field_recordLocalId = qVar3.field_localId;
                            nVar2.field_toUser = qVar3.field_toUser;
                            nVar2.field_isThumb = true;
                            Log.m105925i("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", Integer.valueOf(nVar2.field_localId), Boolean.valueOf(((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).insert(nVar2)));
                        } else {
                            int i2 = qq4.field_status;
                            if (!(i2 == 2 || i2 == 3 || i2 == 4 || i2 == -1)) {
                                Log.m105925i("MicroMsg.RecordMsgSendService", "hasInsertCdn, thumb cdnInfo status:%s", Integer.valueOf(i2));
                            }
                        }
                        z = true;
                    }
                }
            }
            if (z2) {
                Log.m105925i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", Integer.valueOf(this.f296079d.field_localId), Long.valueOf(this.f296079d.field_msgId), Integer.valueOf(this.f296079d.field_type));
                ((C100336e) C86312j.m106911c(cls)).k10().update(this.f296079d, C66261f3.COL_LOCALID);
            }
            if (!z) {
                Log.m105924i("MicroMsg.RecordMsgSendService", "doSendContinue without cdn task");
                C101153n0.this.mo140595b(this.f296079d, false);
                C101153n0 n0Var = C101153n0.this;
                n0Var.f296071d = false;
                n0Var.mo140599f((C100346q) null, false);
            }
            ((C101176x) ((C100336e) C86312j.m106911c(cls)).kl0()).mo140623f();
        }
    }

    /* renamed from: qg2.n0$c */
    public class C101156c implements Runnable, C101489t.C77595a, C11385n {

        /* renamed from: d */
        public C100346q f296081d;

        /* renamed from: e */
        public int f296082e = 0;

        /* renamed from: f */
        public HashMap<Long, Boolean> f296083f = new HashMap<>();

        /* renamed from: g */
        public HashMap<Long, String> f296084g = new HashMap<>();

        /* renamed from: h */
        public boolean f296085h = false;

        /* renamed from: qg2.n0$c$a */
        public class C101157a implements C76051j.C76052a {

            /* renamed from: d */
            public final /* synthetic */ C92836k f296087d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f296088e;

            /* renamed from: f */
            public final /* synthetic */ long f296089f;

            public C101157a(C92836k kVar, C72963f4 f4Var, long j) {
                this.f296087d = kVar;
                this.f296088e = f4Var;
                this.f296089f = j;
            }

            /* renamed from: T2 */
            public void mo102581T2(long j, long j2, int i, int i2, Object obj, int i3, int i4, String str, C117747y yVar) {
                Class cls = C98201k.class;
                Log.m105925i("MicroMsg.RecordMsgSendService", "download image succed: %s, errType: %s, errCode:%s", Boolean.valueOf(i3 == 0 && i4 == 0), Integer.valueOf(i3), Integer.valueOf(i4));
                if (obj instanceof C101834rc0) {
                    C101834rc0 rc02 = (C101834rc0) obj;
                    rc02.f299284V = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(C76053l.class)).mo106262y8(this.f296087d), "", "", true);
                    rc02.f299286W = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).v10(this.f296088e.mo108765s2(), true);
                    Map<String, String> parseXml = XmlParser.parseXml(this.f296087d.f267393t, "msg", (String) null);
                    if (parseXml != null) {
                        rc02.mo141254j(parseXml.get(".msg.img.$cdnbigimgurl"));
                        rc02.mo141269y((long) Util.getInt(parseXml.get(".msg.img.$length"), 0));
                        rc02.mo141253f(parseXml.get(".msg.img.$aeskey"));
                        C101156c cVar = C101156c.this;
                        cVar.f296081d.field_dataProto.f298618f.set(cVar.f296082e, rc02);
                    } else {
                        Log.m105925i("MicroMsg.RecordMsgSendService", "parse cdnInfo failed. [%s]", this.f296087d.f267393t);
                    }
                    C101156c.this.f296083f.put(Long.valueOf(rc02.f299317o1), Boolean.TRUE);
                } else {
                    C101156c.this.f296083f.put(Long.valueOf(this.f296089f), Boolean.TRUE);
                }
                C101156c cVar2 = C101156c.this;
                cVar2.mo140603a(cVar2.f296083f, cVar2.f296085h, cVar2.f296081d);
            }

            /* renamed from: f0 */
            public void mo102582f0(long j, long j2, int i, int i2, Object obj, int i3, int i4, C117747y yVar) {
            }

            /* renamed from: x4 */
            public void mo102583x4(long j, long j2, int i, int i2, Object obj) {
                C101156c.this.f296083f.put(Long.valueOf(this.f296089f), Boolean.TRUE);
                C101156c cVar = C101156c.this;
                cVar.mo140603a(cVar.f296083f, cVar.f296085h, cVar.f296081d);
            }
        }

        public C101156c(C100346q qVar) {
            this.f296081d = qVar;
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137716b(this, Looper.getMainLooper());
            C86709a0.m107529k().f251779b.mo123455a(221, this);
        }

        /* renamed from: a */
        public final boolean mo140603a(HashMap<Long, Boolean> hashMap, boolean z, C100346q qVar) {
            boolean z2;
            Class cls = C100336e.class;
            if (hashMap != null) {
                Iterator<Map.Entry<Long, Boolean>> it = hashMap.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!Boolean.valueOf(((Boolean) it.next().getValue()).booleanValue()).booleanValue()) {
                            z2 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z2 || !z) {
                    return false;
                }
                ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(this);
                qVar.field_type = 2;
                ((C100336e) C86312j.m106911c(cls)).k10().update(qVar, C66261f3.COL_LOCALID);
                ((C101153n0) ((C100336e) C86312j.m106911c(cls)).mo139409NS()).mo140599f(qVar, false);
                return true;
            }
            z2 = true;
            if (z2) {
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0283  */
        /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo140604b(com.tencent.p014mm.storage.C72963f4 r26) {
            /*
                r25 = this;
                r0 = r25
                r1 = r26
                java.lang.String r2 = r26.getContent()
                r3 = 0
                com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
                java.lang.String r4 = "parse msgContent error, %s"
                java.lang.String r5 = "MicroMsg.RecordMsgSendService"
                r6 = 1
                r7 = 0
                if (r2 != 0) goto L_0x0022
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.String r1 = r26.getContent()
                r2[r7] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r2)
                return
            L_0x0022:
                java.lang.String r8 = r2.f195606o
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                java.lang.String r9 = ""
                java.lang.String r10 = "msgContent format error, %s"
                if (r8 == 0) goto L_0x0059
                java.lang.String r8 = r2.f195500J
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 != 0) goto L_0x0059
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.lang.String r11 = r26.getContent()
                r8[r7] = r11
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r10, r8)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r9)
                java.lang.String r8 = r2.f195500J
                int r8 = r8.hashCode()
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                r2.f195606o = r5
            L_0x0059:
                java.lang.String r2 = r2.f195606o
                long r11 = r26.getMsgId()
                com.tencent.mm.pluginsdk.model.app.d r5 = qg2.C77331b.m93197a(r2, r11)
                boolean r5 = qg2.C77331b.m93199c(r1, r5)
                if (r5 != 0) goto L_0x029e
                java.util.HashMap<java.lang.Long, java.lang.Boolean> r5 = r0.f296083f
                long r11 = r26.getMsgId()
                java.lang.Long r8 = java.lang.Long.valueOf(r11)
                java.lang.Boolean r11 = java.lang.Boolean.FALSE
                r5.put(r8, r11)
                java.util.HashMap<java.lang.Long, java.lang.String> r5 = r0.f296084g
                long r11 = r26.getMsgId()
                java.lang.Long r8 = java.lang.Long.valueOf(r11)
                r5.put(r8, r2)
                java.lang.String r2 = r26.getContent()
                com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r3)
                java.lang.String r5 = "MicroMsg.AppMsgLogic"
                if (r2 != 0) goto L_0x009e
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.String r1 = r26.getContent()
                r2[r7] = r1
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r4, r2)
                goto L_0x029e
            L_0x009e:
                java.lang.String r4 = r2.f195606o
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 == 0) goto L_0x00d0
                java.lang.String r4 = r2.f195500J
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x00d0
                java.lang.Object[] r4 = new java.lang.Object[r6]
                java.lang.String r8 = r26.getContent()
                r4[r7] = r8
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r10, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r9)
                java.lang.String r8 = r2.f195500J
                int r8 = r8.hashCode()
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                r2.f195606o = r4
            L_0x00d0:
                java.lang.String r2 = r2.f195606o
                long r8 = r26.getMsgId()
                com.tencent.mm.pluginsdk.model.app.d r4 = qg2.C77331b.m93197a(r2, r8)
                boolean r4 = qg2.C77331b.m93199c(r1, r4)
                if (r4 != 0) goto L_0x029e
                long r8 = r26.getMsgId()
                com.tencent.mm.pluginsdk.model.app.d r4 = qg2.C77331b.m93197a(r2, r8)
                java.lang.String r8 = r26.getContent()
                com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r3)
                if (r8 == 0) goto L_0x011f
                java.lang.String r9 = r8.f195570f
                java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
                java.lang.String r10 = r8.f195602n
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
                java.lang.String r10 = r10.toLowerCase()
                java.lang.String r11 = r8.f195622s
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
                java.lang.String r12 = r8.f195488G
                java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
                java.lang.String r13 = r8.f195524R
                java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r13)
                r18 = r9
                r19 = r10
                r17 = r11
                r20 = r12
                r16 = r13
                goto L_0x0129
            L_0x011f:
                r16 = r3
                r17 = r16
                r18 = r17
                r19 = r18
                r20 = r19
            L_0x0129:
                r9 = 4
                r10 = 3
                r11 = 2
                r15 = 8
                r21 = 5
                if (r4 != 0) goto L_0x01a1
                long r12 = r26.getMsgId()
                java.lang.String r4 = r26.getContent()
                qg2.C77331b.m93198b(r12, r4, r3)
                long r12 = r26.getMsgId()
                com.tencent.mm.pluginsdk.model.app.d r4 = qg2.C77331b.m93197a(r2, r12)
                if (r4 == 0) goto L_0x026f
                java.lang.Object[] r12 = new java.lang.Object[r15]
                long r14 = r4.systemRowid
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                r12[r7] = r14
                long r14 = r4.field_totalLen
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                r12[r6] = r14
                java.lang.String r14 = r4.field_fileFullPath
                r12[r11] = r14
                long r14 = r4.field_type
                java.lang.Long r11 = java.lang.Long.valueOf(r14)
                r12[r10] = r11
                java.lang.String r10 = r4.field_mediaId
                r12[r9] = r10
                long r9 = r4.field_msgInfoId
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r12[r21] = r9
                boolean r9 = r4.field_isUpload
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                r10 = 6
                r12[r10] = r9
                java.lang.String r9 = r4.field_signature
                if (r9 != 0) goto L_0x0180
                r13 = -1
                goto L_0x0184
            L_0x0180:
                int r13 = r9.length()
            L_0x0184:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
                r10 = 7
                r12[r10] = r9
                java.lang.String r9 = "summerbig tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r9, r12)
                if (r8 == 0) goto L_0x026f
                int r5 = r8.f195626t
                if (r5 != 0) goto L_0x019d
                int r5 = r8.f195594l
                r8 = 26214400(0x1900000, float:5.2897246E-38)
                if (r5 <= r8) goto L_0x026f
            L_0x019d:
                r15 = r4
                r6 = 0
                goto L_0x0270
            L_0x01a1:
                java.lang.String r8 = r4.field_fileFullPath
                android.net.Uri r8 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)
                java.lang.String r12 = r8.getPath()
                if (r12 == 0) goto L_0x01c7
                java.lang.String r12 = com.tencent.p014mm.vfs.C116299g2.m163855k(r12, r7, r7)
                java.lang.String r14 = r8.getPath()
                boolean r14 = r14.equals(r12)
                if (r14 != 0) goto L_0x01c7
                android.net.Uri$Builder r8 = r8.buildUpon()
                android.net.Uri$Builder r8 = r8.path(r12)
                android.net.Uri r8 = r8.build()
            L_0x01c7:
                long r13 = r4.field_status
                r22 = 199(0xc7, double:9.83E-322)
                int r24 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
                if (r24 != 0) goto L_0x01f9
                com.tencent.mm.vfs.f0 r13 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r13 = r13.mo177799l(r8, r3)
                boolean r14 = r13.mo177810a()
                if (r14 != 0) goto L_0x01dd
                r12 = 0
                goto L_0x01e5
            L_0x01dd:
                com.tencent.mm.vfs.FileSystem$c r14 = r13.f348991a
                java.lang.String r12 = r13.f348992b
                boolean r12 = r14.mo119948x(r12)
            L_0x01e5:
                if (r12 != 0) goto L_0x01fa
                java.lang.String r12 = "summerbig tryInitAttachInfo info exist but file not!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r12)
                long r9 = r26.getMsgId()
                java.lang.String r12 = r26.getContent()
                qg2.C77331b.m93198b(r9, r12, r3)
                goto L_0x01fa
            L_0x01f9:
                r13 = r3
            L_0x01fa:
                r9 = 10
                java.lang.Object[] r9 = new java.lang.Object[r9]
                long r14 = r4.systemRowid
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                r9[r7] = r14
                long r14 = r4.field_totalLen
                java.lang.Long r14 = java.lang.Long.valueOf(r14)
                r9[r6] = r14
                java.lang.String r14 = r4.field_fileFullPath
                r9[r11] = r14
                long r14 = r4.field_type
                java.lang.Long r11 = java.lang.Long.valueOf(r14)
                r14 = 3
                r9[r14] = r11
                java.lang.String r11 = r4.field_mediaId
                r12 = 4
                r9[r12] = r11
                long r11 = r4.field_msgInfoId
                java.lang.Long r11 = java.lang.Long.valueOf(r11)
                r9[r21] = r11
                boolean r11 = r4.field_isUpload
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                r12 = 6
                r9[r12] = r11
                com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r8 = r11.mo177799l(r8, r13)
                boolean r11 = r8.mo177810a()
                if (r11 != 0) goto L_0x023e
                goto L_0x0246
            L_0x023e:
                com.tencent.mm.vfs.FileSystem$c r7 = r8.f348991a
                java.lang.String r8 = r8.f348992b
                boolean r7 = r7.mo119948x(r8)
            L_0x0246:
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r8 = 7
                r9[r8] = r7
                long r7 = r4.field_status
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r8 = 8
                r9[r8] = r7
                r7 = 9
                java.lang.String r8 = r4.field_signature
                if (r8 != 0) goto L_0x025f
                r13 = -1
                goto L_0x0263
            L_0x025f:
                int r13 = r8.length()
            L_0x0263:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
                r9[r7] = r8
                java.lang.String r7 = "summerbig tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r9)
            L_0x026f:
                r15 = r4
            L_0x0270:
                if (r6 != 0) goto L_0x0281
                f40.g r4 = f40.C86709a0.m107529k()
                ob0.b0 r4 = r4.f251779b
                qg2.n r5 = new qg2.n
                r14 = r5
                r14.<init>(r15, r16, r17, r18, r19, r20)
                r4.mo123460f(r5)
            L_0x0281:
                if (r6 == 0) goto L_0x029e
                qg2.p r4 = new qg2.p
                long r5 = r26.getMsgId()
                qg2.a r1 = new qg2.a
                r1.<init>(r3)
                r4.<init>(r5, r2, r1)
                qg2.C77331b.f225452a = r4
                f40.g r1 = f40.C86709a0.m107529k()
                ob0.b0 r1 = r1.f251779b
                qg2.p r2 = qg2.C77331b.f225452a
                r1.mo123460f(r2)
            L_0x029e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qg2.C101153n0.C101156c.mo140604b(com.tencent.mm.storage.f4):void");
        }

        /* renamed from: d5 */
        public void mo102579d5(C101489t.C77595a.C77596a aVar) {
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(aVar.f226215a);
            if (Zd != null) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Zd.f288567n);
                if (Zd.mo137710n()) {
                    this.f296083f.put(Long.valueOf(b002.getMsgId()), Boolean.TRUE);
                    mo140603a(this.f296083f, this.f296085h, this.f296081d);
                    return;
                }
                return;
            }
            mo140603a((HashMap<Long, Boolean>) null, this.f296085h, this.f296081d);
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C77335p) {
                C86709a0.m107529k().f251779b.mo123470p(221, this);
                HashMap<Long, String> hashMap = this.f296084g;
                if (hashMap != null) {
                    for (Map.Entry next : hashMap.entrySet()) {
                        long longValue = ((Long) next.getKey()).longValue();
                        String str2 = (String) next.getValue();
                        if (longValue > 0 && !this.f296083f.get(Long.valueOf(longValue)).booleanValue()) {
                            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(longValue);
                            C72683d a = C77331b.m93197a(str2, longValue);
                            String str3 = a != null ? a.field_fileFullPath : null;
                            if (str3 != null && str3.length() > 0) {
                                this.f296083f.put(Long.valueOf(longValue), Boolean.TRUE);
                                Iterator<C101834rc0> it = this.f296081d.field_dataProto.f298618f.iterator();
                                while (it.hasNext()) {
                                    C101834rc0 next2 = it.next();
                                    if (next2.f299317o1 == longValue) {
                                        next2.f299284V = a.field_fileFullPath;
                                    }
                                }
                            }
                        }
                    }
                }
                mo140603a(this.f296083f, this.f296085h, this.f296081d);
                return;
            }
            mo140603a((HashMap<Long, Boolean>) null, this.f296085h, this.f296081d);
        }

        public void run() {
            Iterator<C101834rc0> it;
            boolean z;
            Class cls = C98201k.class;
            Class cls2 = C101491u.class;
            this.f296082e = 0;
            this.f296085h = false;
            C100346q qVar = this.f296081d;
            if (qVar.field_dataProto == null) {
                Log.m105929w("MicroMsg.RecordMsgSendService", "ChatDataDownloadRunnable info.field_dataProto null id:%s", Long.valueOf(qVar.field_msgId));
                this.f296085h = true;
                C101153n0.this.f296071d = false;
                mo140603a((HashMap<Long, Boolean>) null, true, this.f296081d);
                return;
            }
            int i = 2;
            Log.m105925i("MicroMsg.RecordMsgSendService", "dojob ChatDataDownloadRunnable, info id:%s dataListSize:%s", Long.valueOf(qVar.field_msgId), this.f296081d.field_dataProto.f298618f);
            Iterator<C101834rc0> it4 = this.f296081d.field_dataProto.f298618f.iterator();
            while (it4.hasNext()) {
                C101834rc0 next = it4.next();
                long j = next.f299317o1;
                if (j > 0) {
                    C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
                    if (System.currentTimeMillis() - b002.getCreateTime() > ((C31478i2) C86312j.m106911c(C31478i2.class)).mo58193Kb(b002) && !C86013q1.m106450k(next.f299284V)) {
                        Object[] objArr = new Object[3];
                        objArr[0] = Long.valueOf(b002.getMsgId());
                        objArr[1] = Integer.valueOf(b002.getType());
                        objArr[i] = next.f299280T;
                        Log.m105925i("MicroMsg.RecordMsgSendService", "dataItem is expired!! msgId: %s msgType:%s dataId:%s", objArr);
                    } else {
                        int i2 = next.f299258I;
                        if (i2 != i) {
                            it = it4;
                            C101834rc0 rc02 = next;
                            if (i2 == 4 || i2 == 15) {
                                C98408n0 Zd = ((C101491u) C86312j.m106911c(cls2)).mo140806Zd(b002.mo108765s2());
                                if (!(Zd == null || Zd.f288562i == 199)) {
                                    this.f296083f.put(Long.valueOf(j), Boolean.FALSE);
                                    Log.m105925i("MicroMsg.RecordMsgSendService", "need download videoInfo MsgId:%s dataId:%s", Long.valueOf(b002.getMsgId()), rc02.f299280T);
                                    if (Zd.mo137711o()) {
                                        Log.m105924i("MicroMsg.RecordMsgSendService", "start complete online video");
                                        ((C101491u) C86312j.m106911c(cls2)).mo140797FT(b002.mo108765s2());
                                    } else {
                                        Log.m105924i("MicroMsg.RecordMsgSendService", "start complete offline video");
                                        ((C101491u) C86312j.m106911c(cls2)).M00(b002.mo108765s2());
                                    }
                                }
                            } else if (i2 == 8 && !Util.isNullOrNil(rc02.f299342z1)) {
                                mo140604b(b002);
                            }
                        } else if (b002.mo100979R3()) {
                            it = it4;
                            C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(b002.mo108768t(), b002.mo108774y2());
                            if (b002.mo108769t2() == 1) {
                                z = NQ.mo127145p();
                            } else {
                                if (NQ.mo127145p()) {
                                    if (C86013q1.m106450k(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(((C76053l) C86312j.m106911c(C76053l.class)).mo106261jD(NQ).f267378e, "", "", true))) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            int i3 = NQ.f267376c;
                            int i4 = NQ.f267377d;
                            if (i3 < i4 || i4 == 0) {
                                this.f296083f.put(Long.valueOf(j), Boolean.FALSE);
                                this.f296082e = this.f296081d.field_dataProto.f298618f.indexOf(next);
                                Log.m105925i("MicroMsg.RecordMsgSendService", "need download imgDataItem MsgId:%s imgLocalId:%s dataId:%s", Long.valueOf(b002.getMsgId()), Long.valueOf(NQ.f267374a), next.f299280T);
                                C76051j Jp0 = ((C98201k) C86312j.m106911c(cls)).Jp0();
                                long j2 = NQ.f267374a;
                                long msgId = b002.getMsgId();
                                C101157a aVar = new C101157a(NQ, b002, j);
                                ((C92822e) Jp0).mo127101c(j2, msgId, z ? 1 : 0, next, C0966R.C0969drawable.by8, aVar);
                            }
                        } else {
                            it = it4;
                            if (b002.mo100961A3()) {
                                mo140604b(b002);
                            }
                        }
                    }
                } else {
                    it = it4;
                }
                it4 = it;
                i = 2;
            }
            this.f296085h = true;
            C101153n0.this.f296071d = false;
            if (!mo140603a(this.f296083f, true, this.f296081d)) {
                Log.m105925i("MicroMsg.RecordMsgSendService", "checkIsReadyForUpload downloadMap:%s finish:%s Id:%s localId:%s", this.f296083f.toString(), Boolean.valueOf(this.f296085h), Long.valueOf(this.f296081d.field_msgId), Integer.valueOf(this.f296081d.field_localId));
                C101153n0.this.mo140599f((C100346q) null, false);
            }
        }
    }

    /* renamed from: qg2.n0$d */
    public class C101158d implements Runnable {

        /* renamed from: d */
        public C100346q f296091d;

        public C101158d(C100346q qVar) {
            this.f296091d = qVar;
        }

        public void run() {
            Log.m105925i("MicroMsg.RecordMsgSendService", "dojob FavDataCopyRunnable, info id:%s", Long.valueOf(this.f296091d.field_msgId));
            Iterator<C101834rc0> it = this.f296091d.field_dataProto.f298618f.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C101834rc0 next = it.next();
                FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                aVar.f264835a = 2;
                aVar.f264840f = next;
                favoriteOperationEvent.publish();
                Log.m105919d("MicroMsg.RecordMsgSendService", "check dataid[%s] type[%d]", next.f299280T, Integer.valueOf(next.f299258I));
                if (!Util.isNullOrNil(favoriteOperationEvent.f264834e.f264857c)) {
                    String q = C101147j0.m132636q(next, this.f296091d.field_msgId, 1);
                    Log.m105919d("MicroMsg.RecordMsgSendService", "check data ok, try copy[%s] to[%s]", favoriteOperationEvent.f264834e.f264857c, q);
                    if (!favoriteOperationEvent.f264834e.f264857c.equals(q)) {
                        C86013q1.m106442c(favoriteOperationEvent.f264834e.f264857c, q);
                        C101153n0.m132654a(C101153n0.this, q);
                    }
                }
                if (!Util.isNullOrNil(favoriteOperationEvent.f264834e.f264858d)) {
                    String D = C101147j0.m132611D(next, this.f296091d.field_msgId, 1);
                    Log.m105919d("MicroMsg.RecordMsgSendService", "check thumb ok, try copy[%s] to[%s]", favoriteOperationEvent.f264834e.f264858d, D);
                    if (!favoriteOperationEvent.f264834e.f264858d.equals(D)) {
                        C86013q1.m106442c(favoriteOperationEvent.f264834e.f264858d, D);
                        C101153n0.m132654a(C101153n0.this, D);
                    }
                }
                if (next.f299258I == 3) {
                    Log.m105928w("MicroMsg.RecordMsgSendService", "match voice type, clear cdn info");
                    next.mo141253f("");
                    next.mo141254j("");
                    next.mo141255k("");
                    next.mo141256l("");
                }
                if (!Util.isNullOrNil(next.f299325s) || !Util.isNullOrNil(next.f299305h)) {
                    z = true;
                }
            }
            if (z) {
                C86709a0.m107529k().f251779b.mo123460f(new C101168t(this.f296091d));
                return;
            }
            C100346q qVar = this.f296091d;
            String g = C101147j0.m132626g(qVar.field_title, qVar.field_desc, qVar.field_dataProto, "", 0);
            C101153n0 n0Var = C101153n0.this;
            C100346q qVar2 = this.f296091d;
            n0Var.mo140596c(qVar2.field_msgId, qVar2.field_localId, g);
            C101153n0 n0Var2 = C101153n0.this;
            n0Var2.f296071d = false;
            n0Var2.mo140599f((C100346q) null, false);
        }
    }

    /* renamed from: qg2.n0$e */
    public class C101159e implements Runnable {

        /* renamed from: d */
        public C100346q f296093d;

        /* renamed from: e */
        public boolean f296094e;

        /* renamed from: qg2.n0$e$a */
        public class C101160a implements C98124g.C98125a {

            /* renamed from: d */
            public final /* synthetic */ C101834rc0 f296096d;

            /* renamed from: e */
            public final /* synthetic */ String f296097e;

            public C101160a(C101159e eVar, C101834rc0 rc02, String str) {
                this.f296096d = rc02;
                this.f296097e = str;
            }

            /* renamed from: g0 */
            public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
                boolean z2;
                Class cls = C100336e.class;
                if (i == 0 && dVar != null && dVar.field_retCode == 0) {
                    Log.m105925i("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl done id:%s, mediaId:%s, path:%s", this.f296096d.f299280T, str, this.f296097e);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(i == 0 && (dVar == null || dVar.field_retCode == 0))) {
                    Object[] objArr = new Object[5];
                    objArr[0] = this.f296096d.f299280T;
                    objArr[1] = str;
                    objArr[2] = this.f296097e;
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = Integer.valueOf(dVar == null ? 0 : dVar.field_retCode);
                    Log.m105921e("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl error id:%s, mediaId:%s, path:%s, err:(%d,%d)", objArr);
                    z2 = true;
                }
                if (z2) {
                    String substring = (str == null || !str.endsWith("_tp")) ? str : str.substring(0, str.length() - 3);
                    C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(substring);
                    if (qq == null) {
                        Object[] objArr2 = new Object[6];
                        objArr2[0] = this.f296096d.f299280T;
                        objArr2[1] = str;
                        objArr2[2] = substring;
                        objArr2[3] = this.f296097e;
                        objArr2[4] = Integer.valueOf(i);
                        objArr2[5] = Integer.valueOf(dVar == null ? 0 : dVar.field_retCode);
                        Log.m105921e("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl error id:%s, mediaId:%s, tempMediaId:%s, path:%s, err:(%d,%d), cdnInfo==null", objArr2);
                        return 0;
                    }
                    qq.field_status = 0;
                    ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).replace(qq);
                    ((C101176x) ((C100336e) C86312j.m106911c(cls)).kl0()).mo140623f();
                }
                return 0;
            }

            /* renamed from: h */
            public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            }

            /* renamed from: j */
            public byte[] mo1775j(String str, byte[] bArr) {
                return new byte[0];
            }
        }

        /* renamed from: qg2.n0$e$b */
        public class C101161b implements C98124g.C98125a {

            /* renamed from: d */
            public final /* synthetic */ C101834rc0 f296098d;

            /* renamed from: e */
            public final /* synthetic */ String f296099e;

            public C101161b(C101159e eVar, C101834rc0 rc02, String str) {
                this.f296098d = rc02;
                this.f296099e = str;
            }

            /* renamed from: g0 */
            public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
                boolean z2;
                Class cls = C100336e.class;
                if (i == 0 && dVar != null && dVar.field_retCode == 0) {
                    Log.m105925i("MicroMsg.RecordMsgSendService", "[record] downloadTpThumbUrl done id:%s, mediaId:%s, thumbPath:%s", this.f296098d.f299280T, str, this.f296099e);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(i == 0 && (dVar == null || dVar.field_retCode == 0))) {
                    Object[] objArr = new Object[5];
                    objArr[0] = this.f296098d.f299280T;
                    objArr[1] = str;
                    objArr[2] = this.f296099e;
                    objArr[3] = Integer.valueOf(i);
                    objArr[4] = Integer.valueOf(dVar == null ? 0 : dVar.field_retCode);
                    Log.m105921e("MicroMsg.RecordMsgSendService", "[record] downloadTpThumbUrl error id:%s, mediaId:%s, thumbPath:%s err:(%d,%d)", objArr);
                    z2 = true;
                }
                if (z2) {
                    String substring = (str == null || !str.endsWith("_tp")) ? str : str.substring(0, str.length() - 3);
                    C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(substring);
                    if (qq == null) {
                        Object[] objArr2 = new Object[6];
                        objArr2[0] = this.f296098d.f299280T;
                        objArr2[1] = str;
                        objArr2[2] = substring;
                        objArr2[3] = this.f296099e;
                        objArr2[4] = Integer.valueOf(i);
                        objArr2[5] = Integer.valueOf(dVar == null ? 0 : dVar.field_retCode);
                        Log.m105921e("MicroMsg.RecordMsgSendService", "[record] downloadTpThumbUrl error id:%s, mediaId:%s, tempMediaId:%s, thumbPath:%s err:(%d,%d)", objArr2);
                        return 0;
                    }
                    qq.field_status = 0;
                    ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).replace(qq);
                    ((C101176x) ((C100336e) C86312j.m106911c(cls)).kl0()).mo140623f();
                }
                return 0;
            }

            /* renamed from: h */
            public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            }

            /* renamed from: j */
            public byte[] mo1775j(String str, byte[] bArr) {
                return new byte[0];
            }
        }

        public C101159e(C100346q qVar, boolean z) {
            this.f296093d = qVar;
            this.f296094e = z;
        }

        /* renamed from: a */
        public final byte mo140607a(C101834rc0 rc02, int i, boolean z) {
            boolean z2;
            String str;
            boolean z3;
            int i2;
            boolean z4;
            boolean z5;
            int i3;
            C101834rc0 rc03 = rc02;
            int i4 = i;
            boolean z6 = z;
            Class cls = C100336e.class;
            int i5 = rc03.f299258I;
            if (!z6 || i5 != 17) {
                if (!Util.isNullOrNil(rc03.f299325s) || !Util.isNullOrNil(rc03.f299342z1)) {
                    String str2 = "[record] insert localId[%d] result[%B], recordLocalId:%d, dataId:%s, mediaId:%s";
                    String q = C101147j0.m132636q(rc03, this.f296093d.field_oriMsgId, i4);
                    String q2 = C101147j0.m132636q(rc03, this.f296093d.field_msgId, i4);
                    boolean z7 = C86013q1.m106443d(q, q2, false) > 0;
                    C101153n0.m132654a(C101153n0.this, q2);
                    Log.m105919d("MicroMsg.RecordMsgSendService", "copy[%s] to [%s] result[%B]", q, q2, Boolean.valueOf(z7));
                    if (z7) {
                        if (Util.isNullOrNil(rc03.f299266M)) {
                            Log.m105924i("MicroMsg.RecordMsgSendService", "not find full md5, try to calculate");
                            rc03.mo141268x(C86013q1.m106456q(q2));
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (Util.isNullOrNil(rc03.f299271P)) {
                            Log.m105924i("MicroMsg.RecordMsgSendService", "not find head 256 md5, try to calculate");
                            rc03.mo141270z(C90193h.m112877e(q2, 0, 256));
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    String t = C101147j0.m132639t(rc03.f299280T, i4);
                    String v = C101147j0.m132641v(t, this.f296093d.field_msgId, false);
                    C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(v);
                    if (qq == null) {
                        C100344n nVar = new C100344n();
                        nVar.field_cdnKey = rc03.f299329u;
                        nVar.field_cdnUrl = rc03.f299325s;
                        nVar.field_dataId = t;
                        nVar.field_mediaId = v;
                        nVar.field_totalLen = (int) rc03.f299276R;
                        nVar.field_localId = v.hashCode();
                        nVar.field_path = C101147j0.m132636q(rc03, this.f296093d.field_msgId, i4);
                        nVar.field_type = 2;
                        nVar.field_fileType = C101147j0.m132635p(rc03.f299258I, (int) rc03.f299276R);
                        C100346q qVar = this.f296093d;
                        nVar.field_recordLocalId = qVar.field_localId;
                        nVar.field_toUser = qVar.field_toUser;
                        nVar.field_isThumb = false;
                        String q3 = C101147j0.m132636q(rc03, qVar.field_msgId, i4);
                        if (!Util.isNullOrNil(rc03.f299342z1) && !C86013q1.m106450k(q3)) {
                            nVar.field_status = -1;
                            mo140609c(rc03, q3, v);
                        }
                        str = str2;
                        Log.m105925i("MicroMsg.RecordMsgSendService", str, Integer.valueOf(nVar.field_localId), Boolean.valueOf(((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).insert(nVar)), Integer.valueOf(nVar.field_recordLocalId), nVar.field_dataId, nVar.field_mediaId);
                        z2 = true;
                    } else {
                        str = str2;
                        if (qq.field_status == -1) {
                            mo140609c(rc03, C101147j0.m132636q(rc03, this.f296093d.field_msgId, i4), v);
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i6 = qq.field_status;
                        if (i6 == 0) {
                            i3 = 1;
                            z5 = true;
                        } else {
                            z5 = z4;
                            i3 = 1;
                        }
                        Object[] objArr = new Object[i3];
                        objArr[0] = Integer.valueOf(i6);
                        Log.m105925i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable cdnInfo.field_status:%s", objArr);
                        z2 = z5;
                    }
                } else {
                    str = "[record] insert localId[%d] result[%B], recordLocalId:%d, dataId:%s, mediaId:%s";
                    z3 = false;
                    z2 = false;
                }
                if (!Util.isNullOrNil(rc03.f299305h) || !Util.isNullOrNil(rc03.f299334w1)) {
                    String D = C101147j0.m132611D(rc03, this.f296093d.field_oriMsgId, i4);
                    String D2 = C101147j0.m132611D(rc03, this.f296093d.field_msgId, i4);
                    Log.m105919d("MicroMsg.RecordMsgSendService", "copy thumb[%s] to [%s] result[%B]", D, D2, Boolean.valueOf(C86013q1.m106443d(D, D2, false) > 0));
                    C101153n0.m132654a(C101153n0.this, D2);
                    String t2 = C101147j0.m132639t(C101147j0.m132610C(rc03.f299280T), i4);
                    String v2 = C101147j0.m132641v(t2, this.f296093d.field_msgId, false);
                    C100344n qq4 = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(v2);
                    String D3 = C101147j0.m132611D(rc03, this.f296093d.field_msgId, i4);
                    if (qq4 == null) {
                        C100344n nVar2 = new C100344n();
                        nVar2.field_cdnKey = rc03.f299309j;
                        nVar2.field_cdnUrl = rc03.f299305h;
                        nVar2.field_dataId = t2;
                        nVar2.field_mediaId = v2;
                        nVar2.field_totalLen = (int) rc03.f299336x0;
                        nVar2.field_localId = v2.hashCode();
                        nVar2.field_path = C101147j0.m132611D(rc03, this.f296093d.field_msgId, i4);
                        nVar2.field_type = 2;
                        nVar2.field_fileType = 1;
                        C100346q qVar2 = this.f296093d;
                        nVar2.field_recordLocalId = qVar2.field_localId;
                        nVar2.field_toUser = qVar2.field_toUser;
                        nVar2.field_isThumb = true;
                        if (!Util.isNullOrNil(rc03.f299334w1) && !C86013q1.m106450k(D3)) {
                            nVar2.field_status = -1;
                            mo140608b(rc03, D3, v2);
                        }
                        Log.m105925i("MicroMsg.RecordMsgSendService", str, Integer.valueOf(nVar2.field_localId), Boolean.valueOf(((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).insert(nVar2)), Integer.valueOf(nVar2.field_recordLocalId), nVar2.field_dataId, nVar2.field_mediaId);
                        i2 = 1;
                        z2 = true;
                    } else {
                        C100344n nVar3 = qq4;
                        if (nVar3.field_status == -1) {
                            mo140608b(rc03, C101147j0.m132611D(rc03, this.f296093d.field_msgId, i4), v2);
                            z2 = true;
                        }
                        int i7 = nVar3.field_status;
                        i2 = 1;
                        if (i7 == 0) {
                            z2 = true;
                        }
                        Log.m105925i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable cdnInfo.field_status:%s", Integer.valueOf(i7));
                    }
                } else {
                    i2 = 1;
                }
                byte b = z3 ? (byte) i2 : 0;
                return z2 ? (byte) (b | 2) : b;
            }
            Log.m105924i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable run() inner record");
            C77915dp3 x = C101147j0.m132643x(rc03.f299326s1);
            if (x == null) {
                return 0;
            }
            Iterator<C101834rc0> it = x.f227155f.iterator();
            byte b2 = 0;
            while (it.hasNext()) {
                byte a = mo140607a(it.next(), i4 + 1, z6);
                b2 = (byte) (b2 | a);
                Log.m105919d("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable circleTraverseFavDataItem() %s result:%s ", Long.toBinaryString((long) a), Long.toBinaryString((long) b2));
            }
            return b2;
        }

        /* renamed from: b */
        public final void mo140608b(C101834rc0 rc02, String str, String str2) {
            Log.m105925i("MicroMsg.RecordMsgSendService", "[record] downloadTpThumbUrl id:%s, mediaId:%s, thumbPath:%s", rc02.f299280T, str2, str);
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_RecordMsgSendService_2";
            gVar.field_fileType = 19;
            gVar.field_authKey = rc02.f299340y1;
            gVar.field_aesKey = rc02.f299243A1;
            gVar.f287672s = rc02.f299334w1;
            gVar.field_fullpath = str;
            if (str2 != null) {
                str2 = str2 + "_tp";
            }
            gVar.field_mediaId = str2;
            gVar.f287662f = new C101161b(this, rc02, str);
            if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar)) {
                Log.m105920e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
            }
        }

        /* renamed from: c */
        public final void mo140609c(C101834rc0 rc02, String str, String str2) {
            Log.m105925i("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl id:%s, mediaId:%s, path:%s", rc02.f299280T, str2, str);
            C98124g gVar = new C98124g();
            gVar.f287660d = "task_RecordMsgSendService_1";
            gVar.field_fileType = 19;
            gVar.field_authKey = rc02.f299340y1;
            gVar.field_aesKey = rc02.f299337x1;
            gVar.f287672s = rc02.f299342z1;
            gVar.field_fullpath = str;
            if (str2 != null) {
                str2 = str2 + "_tp";
            }
            gVar.field_mediaId = str2;
            gVar.f287662f = new C101160a(this, rc02, str);
            if (!((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar)) {
                Log.m105920e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
            }
        }

        public void run() {
            Class cls = C100336e.class;
            C101801kd0 kd02 = this.f296093d.field_dataProto;
            if (kd02 == null) {
                Log.m105928w("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable info.field_dataProto null");
                C101153n0.this.f296071d = false;
                return;
            }
            Iterator<C101834rc0> it = kd02.f298618f.iterator();
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                byte a = mo140607a(it.next(), 1, this.f296094e);
                Log.m105919d("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable run() state: %s ", Long.toBinaryString((long) a));
                if ((a & 1) == 1) {
                    z = true;
                }
                if ((a & 2) == 2) {
                    z2 = true;
                }
            }
            Log.m105925i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable startEmbedded:%s infochanged:%s, needRun:%s", Boolean.valueOf(this.f296094e), Boolean.valueOf(z), Boolean.valueOf(z2));
            if (z) {
                Log.m105925i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", Integer.valueOf(this.f296093d.field_localId), Long.valueOf(this.f296093d.field_msgId), Integer.valueOf(this.f296093d.field_type));
                ((C100336e) C86312j.m106911c(cls)).k10().update(this.f296093d, C66261f3.COL_LOCALID);
            }
            if (!z2) {
                Log.m105924i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable doSendContinue");
                C101153n0.this.mo140595b(this.f296093d, false);
                C101153n0 n0Var = C101153n0.this;
                n0Var.f296071d = false;
                n0Var.mo140599f((C100346q) null, false);
            }
            ((C101176x) ((C100336e) C86312j.m106911c(cls)).kl0()).mo140623f();
        }
    }

    /* renamed from: qg2.n0$f */
    public static final class C101162f {

        /* renamed from: a */
        public long f296100a = SystemClock.elapsedRealtime();

        /* renamed from: b */
        public int f296101b = 3;
    }

    public C101153n0() {
        C86709a0.m107529k().f251779b.mo123455a(632, this);
        try {
            this.f296075h = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_recordmsg_send_waiting_time, 7);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.RecordMsgSendService", e, "RecordMsgSendService init error.", new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m132654a(C101153n0 n0Var, String str) {
        n0Var.getClass();
        C102479b Bg = ((C102704b) C86312j.m106911c(C102704b.class)).mo138748Bg(str, 19, (String) null, (byte[]) null);
        Log.m105919d("MicroMsg.RecordMsgSendService", "recordCheckDup :%s ret:%s hitCache:%s deleteResult:%s copyResult:%s replaceResult:%s", str, Integer.valueOf(Bg.f301760a), Boolean.valueOf(Bg.f301761b), Boolean.FALSE, Boolean.valueOf(Bg.f301762c), Long.valueOf(Bg.f301763d));
    }

    /* renamed from: b */
    public final void mo140595b(C100346q qVar, boolean z) {
        C100346q qVar2 = qVar;
        Class cls = C53543s.class;
        Class cls2 = C75700k0.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(qVar2.field_msgId);
        Log.m105925i("MicroMsg.RecordMsgSendService", "[record] update msg content, msg null ? %B, msgId %d recordInfoId %d, recordInfo.localId:%d, afterCdnUpload %s, toUser:%s", false, Long.valueOf(b002.getMsgId()), Long.valueOf(qVar2.field_msgId), Integer.valueOf(qVar2.field_localId), Boolean.valueOf(z), qVar2.field_toUser);
        long msgId = b002.getMsgId();
        long j = qVar2.field_msgId;
        if (msgId == j) {
            b002.mo108732L2(C101147j0.m132626g(qVar2.field_title, qVar2.field_desc, qVar2.field_dataProto, qVar2.field_favFrom, j));
            b002.mo100991d(1);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(qVar2.field_msgId, b002);
        }
        C68070l a0 = ((C96776s) ((C53543s) C86312j.m106911c(cls)).mo74023HM()).mo135038a0(qVar2.field_msgId);
        if (a0 != null) {
            a0.field_xml = b002.getContent();
            ((C96776s) ((C53543s) C86312j.m106911c(cls)).mo74023HM()).mo135037Lo(a0, new String[]{"msgId"});
        }
        ((C101143h0) ((C100336e) C86312j.m106911c(C100336e.class)).k10()).mo140594jo(qVar2.field_localId);
        this.f296073f.remove(qVar2.field_localId);
        if (b002.getCreateTime() + ((long) (this.f296075h * 24 * 3600 * 1000)) < C31543z5.m39453c()) {
            Log.m105924i("MicroMsg.RecordMsgSendService", "doSendContinue, out of wait time, " + b002.getCreateTime());
            b002.mo100991d(5);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(qVar2.field_msgId, b002);
        } else if (!C101147j0.m132612E(qVar2.field_toUser, qVar2.field_msgId, true, "")) {
            ((C77006j) C86312j.m106911c(C77006j.class)).mo107330Uc(qVar2.field_msgId);
        }
    }

    /* renamed from: c */
    public final void mo140596c(long j, int i, String str) {
        Class cls = C53543s.class;
        Class cls2 = C75700k0.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).b00(j);
        if (b002.getMsgId() == j) {
            b002.mo108732L2(str);
            b002.mo100991d(1);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).xy0(j, b002);
        }
        C68070l a0 = ((C96776s) ((C53543s) C86312j.m106911c(cls)).mo74023HM()).mo135038a0(j);
        if (a0 != null) {
            a0.field_xml = b002.getContent();
            ((C96776s) ((C53543s) C86312j.m106911c(cls)).mo74023HM()).mo135037Lo(a0, new String[]{"msgId"});
        }
        ((C101143h0) ((C100336e) C86312j.m106911c(C100336e.class)).k10()).mo140594jo(i);
        this.f296073f.remove(i);
        ((C77006j) C86312j.m106911c(C77006j.class)).mo107330Uc(j);
        Log.m105925i("MicroMsg.RecordMsgSendService", "batch tran cdn ok, msgId[%d], recordLocalId[%d], begin send appmsg", Long.valueOf(j), Integer.valueOf(i));
    }

    /* renamed from: d */
    public final boolean mo140597d(C100344n nVar, List<C101834rc0> list, int i) {
        while (true) {
            boolean z = false;
            for (C101834rc0 next : list) {
                int i2 = next.f299258I;
                Log.m105919d("MicroMsg.RecordMsgSendService", "replaceOtherCdnInfo() dataItem.getDataId:%s msgType:%s", next.f299280T, Integer.valueOf(i2));
                if (i2 == 17) {
                    C77915dp3 x = C101147j0.m132643x(next.f299326s1);
                    if (x == null) {
                        Log.m105924i("MicroMsg.RecordMsgSendService", "replaceOtherCdnInfoEmbeddedRecord() msgData == null");
                    } else {
                        boolean d = mo140597d(nVar, x.f227155f, i + 1);
                        Log.m105919d("MicroMsg.RecordMsgSendService", "replaceOtherCdnInfoEmbeddedRecord() ifReplace:%s", Boolean.valueOf(d));
                        if (d) {
                            next.mo141234H(C101147j0.m132627h(x, next.f299326s1));
                        }
                        z = d;
                    }
                } else if (nVar.field_dataId.equals(C101147j0.m132639t(next.f299280T, i))) {
                    Log.m105919d("MicroMsg.RecordMsgSendService", "match data, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]", next.f299329u, nVar.field_cdnKey, next.f299325s, nVar.field_cdnUrl, Long.valueOf(next.f299276R), Integer.valueOf(nVar.field_totalLen));
                    next.mo141253f(nVar.field_cdnKey);
                    next.mo141254j(nVar.field_cdnUrl);
                    if (!Util.isEqual(i, 1)) {
                        next.mo141257m(C101147j0.m132633n(next.toString(), next.f299258I));
                    }
                    return true;
                }
            }
            return z;
        }
    }

    /* renamed from: e */
    public final boolean mo140598e(C100344n nVar, List<C101834rc0> list, int i) {
        while (true) {
            boolean z = false;
            for (C101834rc0 next : list) {
                int i2 = next.f299258I;
                Log.m105919d("MicroMsg.RecordMsgSendService", "replaceThumbCdnInfo() dataItem.getDataId:%s msgType:%s", next.f299280T, Integer.valueOf(i2));
                if (i2 == 17) {
                    C77915dp3 x = C101147j0.m132643x(next.f299326s1);
                    if (x == null) {
                        Log.m105924i("MicroMsg.RecordMsgSendService", "replaceThumbCdnInfomEbeddedRecord() msgData == null");
                    } else {
                        boolean e = mo140598e(nVar, x.f227155f, i + 1);
                        Log.m105919d("MicroMsg.RecordMsgSendService", "replaceThumbCdnInfomEbeddedRecord() ifReplace:%s", Boolean.valueOf(e));
                        if (e) {
                            next.mo141234H(C101147j0.m132627h(x, next.f299326s1));
                        }
                        z = e;
                    }
                } else if (nVar.field_dataId.equals(C101147j0.m132639t(C101147j0.m132610C(next.f299280T), i))) {
                    Log.m105919d("MicroMsg.RecordMsgSendService", "match thumb, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]", next.f299309j, nVar.field_cdnKey, next.f299305h, nVar.field_cdnUrl, Long.valueOf(next.f299336x0), Integer.valueOf(nVar.field_totalLen));
                    next.mo141255k(nVar.field_cdnKey);
                    next.mo141256l(nVar.field_cdnUrl);
                    if (!Util.isEqual(i, 1)) {
                        next.mo141257m(C101147j0.m132633n(next.toString(), next.f299258I));
                    }
                    return true;
                }
            }
            return z;
        }
    }

    /* renamed from: f */
    public void mo140599f(C100346q qVar, boolean z) {
        Class cls = C101170w.class;
        Class cls2 = C100113c.class;
        C101154a aVar = new C101154a(qVar, z);
        if (qVar == null) {
            C100113c cVar = (C100113c) C86312j.m106911c(cls2);
            C98597b.C60245a aVar2 = C98597b.f289091e;
            C87412m.m108593f(cVar, "featureService");
            ((C101170w) aVar2.mo85231a(cVar, cls)).mo140617k3();
            C86709a0.m107525e().postToWorker(aVar);
        } else if (!C100734q.m131843d0() || qVar.field_type != 1) {
            C86709a0.m107525e().postToWorker(aVar);
        } else {
            C100113c cVar2 = (C100113c) C86312j.m106911c(cls2);
            C98597b.C60245a aVar3 = C98597b.f289091e;
            C87412m.m108593f(cVar2, "featureService");
            ((C101170w) aVar3.mo85231a(cVar2, cls)).mo140617k3();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r17, int r18, java.lang.String r19, ob0.C117747y r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            java.lang.Class<og2.e> r2 = og2.C100336e.class
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            r7 = 1
            r4[r7] = r5
            r5 = 2
            r4[r5] = r19
            java.lang.String r8 = "MicroMsg.RecordMsgSendService"
            java.lang.String r9 = "on scene end, errType %d errCode %d errMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r4)
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = "on scene end, scene is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r1)
            return
        L_0x002b:
            int r4 = r20.getType()
            r9 = 632(0x278, float:8.86E-43)
            if (r4 == r9) goto L_0x0034
            goto L_0x0092
        L_0x0034:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)
            r4[r6] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
            r4[r7] = r9
            java.lang.String r9 = "batch tran cdn callback, errType %d, errCode %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r4)
            boolean r4 = r1 instanceof qg2.C101168t
            if (r4 != 0) goto L_0x004c
            return
        L_0x004c:
            qg2.t r1 = (qg2.C101168t) r1
            r4 = r17
            if (r4 != r3) goto L_0x0081
            og2.q r9 = r1.f296116g
            te3.kd0 r9 = r9.field_dataProto
            java.util.LinkedList<te3.rc0> r9 = r9.f298618f
            java.util.Iterator r9 = r9.iterator()
        L_0x005c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x007b
            java.lang.Object r10 = r9.next()
            te3.rc0 r10 = (te3.C101834rc0) r10
            java.lang.String r11 = r10.f299325s
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 == 0) goto L_0x0079
            java.lang.String r10 = r10.f299305h
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x0079
            goto L_0x005c
        L_0x0079:
            r9 = 1
            goto L_0x007c
        L_0x007b:
            r9 = 0
        L_0x007c:
            if (r9 != 0) goto L_0x0081
            r4 = 0
            r9 = 0
            goto L_0x0083
        L_0x0081:
            r9 = r18
        L_0x0083:
            if (r4 != 0) goto L_0x0099
            if (r9 != 0) goto L_0x0099
            og2.q r2 = r1.f296116g
            long r3 = r2.field_msgId
            int r2 = r2.field_localId
            java.lang.String r1 = r1.f296115f
            r0.mo140596c(r3, r2, r1)
        L_0x0092:
            r0.f296071d = r6
            r1 = 0
            r0.mo140599f(r1, r6)
            return
        L_0x0099:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            og2.q r9 = r1.f296116g
            long r9 = r9.field_msgId
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r4[r6] = r9
            og2.q r9 = r1.f296116g
            int r9 = r9.field_localId
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r7] = r9
            java.lang.String r9 = "batch tran cdn fail, msgId[%d], recordLocalId[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r9, r4)
            java.lang.Object[] r4 = new java.lang.Object[r7]
            og2.q r9 = r1.f296116g
            te3.kd0 r9 = r9.field_dataProto
            java.util.LinkedList<te3.rc0> r9 = r9.f298618f
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r6] = r9
            java.lang.String r9 = "try upload from local size：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r9, r4)
            og2.q r4 = r1.f296116g
            te3.kd0 r4 = r4.field_dataProto
            java.util.LinkedList<te3.rc0> r4 = r4.f298618f
            java.util.Iterator r4 = r4.iterator()
        L_0x00d6:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0223
            java.lang.Object r9 = r4.next()
            te3.rc0 r9 = (te3.C101834rc0) r9
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = r9.f299280T
            r10[r6] = r11
            int r11 = r9.f299258I
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r7] = r11
            long r11 = r9.f299276R
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r5] = r11
            long r11 = r9.f299336x0
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10[r3] = r11
            java.lang.String r11 = "dataItem id:%s type:%s size:%s thumbSize:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r11, r10)
            long r10 = r9.f299276R
            java.lang.String r12 = "insert localId[%d] result[%B]"
            r13 = 0
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x019d
            java.lang.String r10 = r9.f299280T
            og2.q r11 = r1.f296116g
            r17 = r4
            long r3 = r11.field_msgId
            java.lang.String r3 = qg2.C101147j0.m132641v(r10, r3, r6)
            di3.d r4 = di3.C86312j.m106911c(r2)
            og2.e r4 = (og2.C100336e) r4
            og2.i r4 = r4.mo139410hi()
            qg2.b0 r4 = (qg2.C101136b0) r4
            og2.n r4 = r4.mo140585qq(r3)
            if (r4 != 0) goto L_0x0193
            og2.n r4 = new og2.n
            r4.<init>()
            java.lang.String r10 = r9.f299329u
            r4.field_cdnKey = r10
            java.lang.String r10 = r9.f299325s
            r4.field_cdnUrl = r10
            java.lang.String r10 = r9.f299280T
            r4.field_dataId = r10
            r4.field_mediaId = r3
            long r10 = r9.f299276R
            int r11 = (int) r10
            r4.field_totalLen = r11
            int r3 = r3.hashCode()
            r4.field_localId = r3
            og2.q r3 = r1.f296116g
            long r10 = r3.field_msgId
            java.lang.String r3 = qg2.C101147j0.m132636q(r9, r10, r7)
            r4.field_path = r3
            r4.field_type = r5
            int r3 = r9.f299258I
            long r10 = r9.f299276R
            int r11 = (int) r10
            int r3 = qg2.C101147j0.m132635p(r3, r11)
            r4.field_fileType = r3
            og2.q r3 = r1.f296116g
            int r10 = r3.field_localId
            r4.field_recordLocalId = r10
            java.lang.String r3 = r3.field_toUser
            r4.field_toUser = r3
            r4.field_isThumb = r6
            di3.d r3 = di3.C86312j.m106911c(r2)
            og2.e r3 = (og2.C100336e) r3
            og2.i r3 = r3.mo139410hi()
            qg2.b0 r3 = (qg2.C101136b0) r3
            boolean r3 = r3.insert(r4)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            int r4 = r4.field_localId
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r10[r6] = r4
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r10[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r12, r10)
            goto L_0x019f
        L_0x0193:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r6] = r3
            java.lang.String r3 = "insert err , cdnInfo not null no need insert, mediaId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r8, r3, r4)
            goto L_0x019f
        L_0x019d:
            r17 = r4
        L_0x019f:
            long r3 = r9.f299336x0
            int r10 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r10 <= 0) goto L_0x021e
            java.lang.String r3 = r9.f299280T
            java.lang.String r3 = qg2.C101147j0.m132610C(r3)
            og2.q r4 = r1.f296116g
            long r10 = r4.field_msgId
            java.lang.String r4 = qg2.C101147j0.m132641v(r3, r10, r6)
            di3.d r10 = di3.C86312j.m106911c(r2)
            og2.e r10 = (og2.C100336e) r10
            og2.i r10 = r10.mo139410hi()
            qg2.b0 r10 = (qg2.C101136b0) r10
            og2.n r10 = r10.mo140585qq(r4)
            if (r10 != 0) goto L_0x021e
            og2.n r10 = new og2.n
            r10.<init>()
            java.lang.String r11 = r9.f299309j
            r10.field_cdnKey = r11
            java.lang.String r11 = r9.f299305h
            r10.field_cdnUrl = r11
            r10.field_dataId = r3
            r10.field_mediaId = r4
            long r13 = r9.f299336x0
            int r3 = (int) r13
            r10.field_totalLen = r3
            int r3 = r4.hashCode()
            r10.field_localId = r3
            og2.q r3 = r1.f296116g
            long r3 = r3.field_msgId
            java.lang.String r3 = qg2.C101147j0.m132611D(r9, r3, r7)
            r10.field_path = r3
            r10.field_type = r5
            r10.field_fileType = r7
            og2.q r3 = r1.f296116g
            int r4 = r3.field_localId
            r10.field_recordLocalId = r4
            java.lang.String r3 = r3.field_toUser
            r10.field_toUser = r3
            r10.field_isThumb = r7
            di3.d r3 = di3.C86312j.m106911c(r2)
            og2.e r3 = (og2.C100336e) r3
            og2.i r3 = r3.mo139410hi()
            qg2.b0 r3 = (qg2.C101136b0) r3
            boolean r3 = r3.insert(r10)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            int r9 = r10.field_localId
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4[r6] = r9
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r12, r4)
        L_0x021e:
            r4 = r17
            r3 = 3
            goto L_0x00d6
        L_0x0223:
            di3.d r1 = di3.C86312j.m106911c(r2)
            og2.e r1 = (og2.C100336e) r1
            og2.f r1 = r1.kl0()
            qg2.x r1 = (qg2.C101176x) r1
            r1.mo140623f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101153n0.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
