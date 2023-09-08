package com.tencent.p014mm.storage;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import nr3.C89060f;
import o90.C100308d;
import p227rn.C48055y;
import p823sg.C101611g;
import q90.C101062d;
import zh3.C91753f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.p0 */
public class C19625p0 extends MAutoStorage<C19623o0> implements C48055y {

    /* renamed from: n */
    public static final String[] f55546n = {MAutoStorage.getCreateSQLs(C19623o0.f55516y1, "BizTimeLineInfo")};

    /* renamed from: o */
    public static final String[] f55547o = {"CREATE  INDEX IF NOT EXISTS msg_id_index ON BizTimeLineInfo ( msgId ) ", "CREATE  INDEX IF NOT EXISTS  has_show_talker_index ON BizTimeLineInfo ( hasShow,talker ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_place_top_index ON BizTimeLineInfo ( orderFlag,placeTop ) ", "CREATE  INDEX IF NOT EXISTS  talker_id_order_flag_index ON BizTimeLineInfo ( talkerId,orderFlag ) "};

    /* renamed from: p */
    public static final String[] f55548p = {"CREATE  INDEX IF NOT EXISTS  biz_status_talker_index ON BizTimeLineInfo ( status,talker ) ", "CREATE  INDEX IF NOT EXISTS  biz_msg_svr_id_index ON BizTimeLineInfo ( msgSvrId ) ", "CREATE  INDEX IF NOT EXISTS  biz_talker_index ON BizTimeLineInfo ( talker ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_status_index ON BizTimeLineInfo ( orderFlag,status ) ", "CREATE  INDEX IF NOT EXISTS  order_flag_has_show_index ON BizTimeLineInfo ( orderFlag,hasShow ) ", "CREATE  INDEX IF NOT EXISTS  is_read_order_flag_index ON BizTimeLineInfo ( isRead,orderFlag ) ", "CREATE  INDEX IF NOT EXISTS  is_valid_exposed_order_flag_index ON BizTimeLineInfo ( isValidExposed,orderFlag ) ", "CREATE  INDEX IF NOT EXISTS  is_read_msg_id_index ON BizTimeLineInfo ( isRead,msgId ) ", "CREATE  INDEX IF NOT EXISTS  biz_type_order_flag_isread_index ON BizTimeLineInfo ( type,orderFlag,isRead ) ", "CREATE  INDEX IF NOT EXISTS  biz_type_is_read_index ON BizTimeLineInfo ( type,isRead ) ", "CREATE  INDEX IF NOT EXISTS  biz_create_time_index ON BizTimeLineInfo ( createTime ) ", "CREATE  INDEX IF NOT EXISTS  recommend_card_id_index ON BizTimeLineInfo ( recommendCardId ) ", "CREATE  INDEX IF NOT EXISTS  biz_recycle_rec_card_type ON BizTimeLineInfo ( recycleCardType ) "};

    /* renamed from: q */
    public static final C101611g<Long, Boolean> f55549q = new C100308d(30);

    /* renamed from: d */
    public final C91753f f55550d;

    /* renamed from: e */
    public final MStorageEvent<p0$$h, p0$$f> f55551e = new p0$$c(this);

    /* renamed from: f */
    public int f55552f = 100;

    /* renamed from: g */
    public boolean f55553g = true;

    /* renamed from: h */
    public AtomicLong f55554h = new AtomicLong(10);

    /* renamed from: i */
    public long f55555i = 10;

    /* renamed from: j */
    public AtomicLong f55556j = new AtomicLong(-5000000);

    public C19625p0(C91753f fVar) {
        super(fVar, C19623o0.f55516y1, "BizTimeLineInfo", f55547o);
        this.f55550d = fVar;
        b00();
    }

    public void Ab0(String str) {
        if (!Util.isNullOrNil(str)) {
            boolean x3 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).mo62940x3();
            this.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set placeTop = " + (x3 ? 1 : 0) + " where " + "status" + " > " + 4 + " and " + "talker" + " = '" + str + "'");
            this.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set placeTop = " + x3 + " where " + "status" + " < " + 4 + " and " + "talker" + " = '" + str + "'");
            C19623o0 mL = mo25809mL();
            if (mL != null && str.equals(mL.field_talker)) {
                mL.field_placeTop = x3;
                super.updateNotify(mL, false, "msgSvrId");
            }
            p0$$f p0__f = new p0$$f();
            p0__f.f55562a = p0$$g.UPDATE;
            mo25805jo(p0__f);
        }
    }

    /* renamed from: CP */
    public C19623o0 mo25781CP(String str) {
        C19623o0 o0Var = null;
        if (str == null) {
            return null;
        }
        Cursor rawQuery = this.f55550d.rawQuery("SELECT * FROM BizTimeLineInfo where type=620757041 and recommendCardId='" + str + "'", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            o0Var = new C19623o0();
            o0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return o0Var;
    }

    /* renamed from: CZ */
    public synchronized long mo25782CZ() {
        if (this.f55556j.longValue() == -5000000) {
            C19623o0 o0Var = null;
            Cursor rawQuery = this.f55550d.rawQuery("SELECT * FROM BizTimeLineInfo where type=620757041 or type=637534257 order by msgId DESC limit 1", (String[]) null, 2);
            if (rawQuery.moveToFirst()) {
                o0Var = new C19623o0();
                o0Var.convertFrom(rawQuery);
            }
            rawQuery.close();
            if (o0Var != null) {
                this.f55556j.set(o0Var.field_msgId);
            }
        }
        return this.f55556j.incrementAndGet();
    }

    /* renamed from: DN */
    public C19623o0 mo25783DN(int i) {
        C19623o0 o0Var = null;
        Cursor rawQuery = this.f55550d.rawQuery(String.format("SELECT * FROM %s WHERE %s = %d order by %s  DESC limit 1", new Object[]{"BizTimeLineInfo", "type", Integer.valueOf(i), "orderFlag"}), (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            o0Var = new C19623o0();
            o0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return o0Var;
    }

    /* renamed from: LL */
    public C19623o0 mo25784LL(long j) {
        C19623o0 o0Var = null;
        Cursor rawQuery = this.f55550d.rawQuery("SELECT * FROM BizTimeLineInfo where talkerId = " + j + "  order by " + "orderFlag" + " DESC limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            o0Var = new C19623o0();
            o0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return o0Var;
    }

    /* renamed from: Lo */
    public void mo25785Lo(long j) {
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteById: %d", Long.valueOf(j));
        C19623o0 o0Var = new C19623o0();
        o0Var.field_msgId = j;
        super.delete(o0Var, false, "msgId");
        p0$$f p0__f = new p0$$f();
        p0__f.f55562a = p0$$g.DELETE;
        mo25805jo(p0__f);
        Wa0();
    }

    /* renamed from: NQ */
    public int mo25786NQ() {
        Cursor rawQuery = this.f55550d.rawQuery("SELECT count(*) FROM BizTimeLineInfo", (String[]) null);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: Ow */
    public void mo25787Ow(int i, int i2) {
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteMsgByTypeAndExposeStatus type:%d ret:%b", Integer.valueOf(i), Boolean.valueOf(this.f55550d.execSQL("BizTimeLineInfo", String.format("DELETE FROM %s WHERE %s = %d and isRead = %d", new Object[]{"BizTimeLineInfo", "type", Integer.valueOf(i), Integer.valueOf(i2)}))));
        p0$$f p0__f = new p0$$f();
        p0__f.f55562a = p0$$g.DELETE;
        mo25805jo(p0__f);
    }

    public boolean P50(C19623o0 o0Var, boolean z) {
        boolean updateNotify = super.updateNotify(o0Var, false, "msgId");
        if (z) {
            p0$$f p0__f = new p0$$f();
            p0__f.f55564c = o0Var.field_talker;
            p0__f.f55563b = o0Var;
            p0__f.f55562a = p0$$g.UPDATE;
            mo25805jo(p0__f);
        }
        return updateNotify;
    }

    /* renamed from: SE */
    public C19623o0 mo25789SE(long j, String str) {
        C19623o0 o0Var = new C19623o0();
        Cursor query = this.f55550d.query("BizTimeLineInfo", (String[]) null, str + "=?", new String[]{"" + j}, (String) null, (String) null, (String) null, 2);
        if (query.moveToFirst()) {
            o0Var.convertFrom(query);
            query.close();
            return o0Var;
        }
        query.close();
        return null;
    }

    /* renamed from: TE */
    public synchronized long mo25790TE() {
        return this.f55554h.longValue();
    }

    /* renamed from: TO */
    public synchronized long mo25791TO() {
        return this.f55555i;
    }

    /* renamed from: TY */
    public int mo25792TY(long j) {
        C101611g<Long, Boolean> gVar = f55549q;
        Boolean bool = (Boolean) ((C101062d) gVar).get(Long.valueOf(j));
        if (bool != null && bool.booleanValue()) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = this.f55550d.rawQuery("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + j + " and " + "status" + " > " + 4, (String[]) null);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        Cursor rawQuery2 = this.f55550d.rawQuery("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + j + " and " + "status" + " < " + 4, (String[]) null);
        if (rawQuery2.moveToFirst()) {
            i += rawQuery2.getInt(0);
        }
        rawQuery2.close();
        if (i == 0) {
            ((C101062d) gVar).mo139557c(Long.valueOf(j), Boolean.TRUE);
        }
        Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "getUnread cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        return i;
    }

    public synchronized void Wa0() {
        C19623o0 mL = mo25809mL();
        if (mL != null) {
            this.f55555i = Math.min(mL.mo25767q2(), this.f55555i);
        }
    }

    public boolean X90(C19623o0 o0Var) {
        boolean updateNotify = super.updateNotify(o0Var, false, "msgSvrId");
        p0$$f p0__f = new p0$$f();
        p0__f.f55564c = o0Var.field_talker;
        p0__f.f55563b = o0Var;
        p0__f.f55562a = p0$$g.UPDATE;
        mo25805jo(p0__f);
        return updateNotify;
    }

    /* renamed from: Yt */
    public boolean mo25795Yt(String str) {
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteByTalker: %s", str);
        C19623o0 o0Var = new C19623o0();
        o0Var.field_talker = str;
        boolean delete = super.delete(o0Var, false, "talker");
        p0$$f p0__f = new p0$$f();
        p0__f.f55564c = o0Var.field_talker;
        p0__f.f55563b = o0Var;
        p0__f.f55562a = p0$$g.DELETE;
        mo25805jo(p0__f);
        Wa0();
        return delete;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void b00() {
        /*
            r10 = this;
            monitor-enter(r10)
            monitor-enter(r10)     // Catch:{ all -> 0x0085 }
            zh3.f r0 = r10.f55550d     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = "select max(orderFlag) from BizTimeLineInfo"
            r2 = 0
            r3 = 2
            android.database.Cursor r0 = r0.rawQuery(r1, r2, r3)     // Catch:{ all -> 0x0087 }
            r1 = 0
            boolean r4 = r0.moveToFirst()     // Catch:{ all -> 0x0087 }
            r5 = 0
            if (r4 == 0) goto L_0x001d
            long r1 = r0.getLong(r5)     // Catch:{ all -> 0x0087 }
            r0.close()     // Catch:{ all -> 0x0087 }
        L_0x001d:
            monitor-exit(r10)     // Catch:{ all -> 0x0085 }
            r0 = 32
            long r0 = r1 >> r0
            r10.f55555i = r0     // Catch:{ all -> 0x0085 }
            r6 = 10
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x002c
            r10.f55555i = r6     // Catch:{ all -> 0x0085 }
        L_0x002c:
            com.tencent.mm.storage.o0 r0 = r10.mo25809mL()     // Catch:{ all -> 0x0085 }
            r1 = 1
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "MicroMsg.BizTimeLineInfoStorage"
            java.lang.String r2 = "initGroupId is null, id %d"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0085 }
            long r3 = r10.f55555i     // Catch:{ all -> 0x0085 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0085 }
            r1[r5] = r3     // Catch:{ all -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r1)     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)
            return
        L_0x0046:
            int r2 = r0.field_status     // Catch:{ all -> 0x0085 }
            r4 = 4
            if (r2 != r4) goto L_0x0056
            java.util.concurrent.atomic.AtomicLong r2 = r10.f55554h     // Catch:{ all -> 0x0085 }
            long r6 = r10.f55555i     // Catch:{ all -> 0x0085 }
            r8 = 1
            long r6 = r6 + r8
            r2.set(r6)     // Catch:{ all -> 0x0085 }
            goto L_0x005d
        L_0x0056:
            java.util.concurrent.atomic.AtomicLong r2 = r10.f55554h     // Catch:{ all -> 0x0085 }
            long r6 = r10.f55555i     // Catch:{ all -> 0x0085 }
            r2.set(r6)     // Catch:{ all -> 0x0085 }
        L_0x005d:
            java.lang.String r2 = "MicroMsg.BizTimeLineInfoStorage"
            java.lang.String r4 = "initGroupId id %d/%d, status %d"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0085 }
            java.util.concurrent.atomic.AtomicLong r7 = r10.f55554h     // Catch:{ all -> 0x0085 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0085 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0085 }
            r6[r5] = r7     // Catch:{ all -> 0x0085 }
            long r7 = r10.f55555i     // Catch:{ all -> 0x0085 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0085 }
            r6[r1] = r5     // Catch:{ all -> 0x0085 }
            int r0 = r0.field_status     // Catch:{ all -> 0x0085 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0085 }
            r6[r3] = r0     // Catch:{ all -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r6)     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)
            return
        L_0x0085:
            r0 = move-exception
            goto L_0x008a
        L_0x0087:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0085 }
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x008a:
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C19625p0.b00():void");
    }

    /* renamed from: bD */
    public final List<C19623o0> mo25797bD(Cursor cursor) {
        LinkedList linkedList = new LinkedList();
        while (cursor.moveToNext()) {
            C19623o0 o0Var = new C19623o0();
            o0Var.convertFrom(cursor);
            linkedList.add(o0Var);
        }
        cursor.close();
        return linkedList;
    }

    /* renamed from: bF */
    public List<C19623o0> mo25798bF(int i) {
        C91753f fVar = this.f55550d;
        return mo25797bD(fVar.query("BizTimeLineInfo", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "orderFlag DESC limit " + i));
    }

    /* renamed from: bO */
    public List<C19623o0> mo25799bO(int i, int i2) {
        C91753f fVar = this.f55550d;
        String[] strArr = {"" + i};
        return mo25797bD(fVar.query("BizTimeLineInfo", (String[]) null, "type=?", strArr, (String) null, (String) null, "orderFlag DESC limit " + i2));
    }

    public void c40(long j) {
        C89060f.m111322a().mo123064p(new p0$$e(this, j)).mo123062e(new p0$$d(this));
    }

    /* renamed from: fY */
    public List<C19623o0> mo25801fY(int i, long j, long j2, int i2, boolean z) {
        String str;
        long j3;
        String str2;
        int i3 = i;
        long j4 = j2;
        LinkedList linkedList = new LinkedList();
        int min = Math.min(20, i3);
        long TO = mo25791TO() << 32;
        long currentTimeMillis = System.currentTimeMillis();
        if (C19641z0.f55645a.mo25863f(i2)) {
            TO = -4294967296L & j4;
            str = " and orderFlag < " + j4 + " ";
        } else {
            str = "";
        }
        String str3 = z ? " isValidExposed = false " : " isRead = 0 ";
        boolean z2 = false;
        int i4 = 0;
        while (!z2 && (min = Math.min(min, i3 - linkedList.size())) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT * FROM BizTimeLineInfo where ");
            sb.append(str3);
            sb.append(" and orderFlag >= ");
            sb.append(TO);
            sb.append(str);
            sb.append(" and createTime >= ");
            long j5 = TO;
            sb.append(j);
            sb.append(" and bitFlag&");
            sb.append(1073741824);
            sb.append(" = 0 order by orderFlag ASC limit ");
            sb.append(min);
            sb.append(" offset ");
            sb.append(i4);
            String sb4 = sb.toString();
            List<C19623o0> bD = mo25797bD(this.f55550d.rawQuery(sb4, (String[]) null));
            linkedList.addAll(bD);
            int size = ((LinkedList) bD).size();
            boolean z3 = size < min;
            i4 += min;
            Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "getUnReadListNew sql = %s, localLimit=%d, tmpListSize=%d", sb4, Integer.valueOf(min), Integer.valueOf(size));
            z2 = z3;
            TO = j5;
        }
        int min2 = Math.min(20, i3 - linkedList.size());
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            int size2 = linkedList.size();
            min2 = Math.min(min2, i3 - size2);
            if (min2 <= 0) {
                break;
            }
            if (size2 > 0) {
                String str4 = "and msgId not in (";
                int i6 = 0;
                while (i6 < size2) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str4);
                    sb5.append(i6 > 0 ? "," : "");
                    sb5.append(((C19623o0) linkedList.get(i6)).field_msgId);
                    str4 = sb5.toString();
                    i6++;
                    int i7 = i;
                    currentTimeMillis = currentTimeMillis;
                }
                j3 = currentTimeMillis;
                str2 = str4 + ")";
            } else {
                j3 = currentTimeMillis;
                str2 = "";
            }
            String str5 = "SELECT * FROM BizTimeLineInfo where " + str3 + str + str2 + " order by orderFlag DESC limit " + min2 + " offset " + i5;
            List<C19623o0> bD2 = mo25797bD(this.f55550d.rawQuery(str5, (String[]) null));
            int size3 = ((LinkedList) bD2).size();
            boolean z5 = size3 < min2;
            linkedList.addAll(bD2);
            i5 += min2;
            Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "getUnReadListNew sql2 = %s, localLimit=%d, tmpListSize=%d", str5, Integer.valueOf(min2), Integer.valueOf(size3));
            i3 = i;
            z4 = z5;
            currentTimeMillis = j3;
        }
        Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "getUnReadListNew cost %d, size = %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(linkedList.size()));
        return linkedList;
    }

    public boolean fq0(C19623o0 o0Var) {
        if (!o0Var.field_isValidExposed) {
            if (o0Var.f55529n1 == 0) {
                o0Var.field_isValidExposed = true;
                ((C119157j) C119157j.f356862d).mo183876g(new p0$$a(this, o0Var), "updateUnReadStatus");
                return true;
            }
        }
        return false;
    }

    /* renamed from: gY */
    public int mo25803gY(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        Cursor rawQuery = this.f55550d.rawQuery("SELECT count(*) FROM BizTimeLineInfo where orderFlag >= " + (j & -4294967296L) + " and " + "hasShow" + " < 1 ", (String[]) null);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "getUnShowCount count = %d,cost = %d", Integer.valueOf(i), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        rawQuery.close();
        return i;
    }

    public void h30() {
        C19623o0 mL = mo25809mL();
        if (mL != null) {
            c40(mL.field_orderFlag);
        }
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        return v10((C19623o0) iAutoDBItem, true);
    }

    /* renamed from: jo */
    public void mo25805jo(p0$$f p0__f) {
        if (this.f55551e.event(p0__f)) {
            this.f55551e.doNotify();
        }
    }

    /* renamed from: kD */
    public C19623o0 mo25806kD(long j) {
        return mo25789SE(j, "msgId");
    }

    public boolean ko0(C19623o0 o0Var) {
        if (o0Var.field_isRead != 1) {
            if (o0Var.f55529n1 == 0) {
                o0Var.field_isRead = 1;
                ((C119157j) C119157j.f356862d).mo183876g(new p0$$b(this, o0Var), "updateUnReadStatus");
                return true;
            }
        }
        return false;
    }

    /* renamed from: mI */
    public List<C19623o0> mo25808mI(long j) {
        C91753f fVar = this.f55550d;
        return mo25797bD(fVar.query("BizTimeLineInfo", (String[]) null, "orderFlag>=?", new String[]{"" + j}, (String) null, (String) null, "orderFlag DESC"));
    }

    /* renamed from: mL */
    public C19623o0 mo25809mL() {
        C19623o0 o0Var = null;
        Cursor rawQuery = this.f55550d.rawQuery("SELECT * FROM BizTimeLineInfo order by orderFlag DESC limit 1", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            o0Var = new C19623o0();
            o0Var.convertFrom(rawQuery);
        }
        rawQuery.close();
        return o0Var;
    }

    /* renamed from: nP */
    public int mo25810nP(long j) {
        long j2 = -4294967296L & j;
        Cursor rawQuery = this.f55550d.rawQuery("SELECT count(*) FROM BizTimeLineInfo where isRead != 1 and orderFlag >= " + j2 + " and orderFlag < " + j, (String[]) null);
        int i = rawQuery.moveToFirst() ? rawQuery.getInt(0) : 0;
        rawQuery.close();
        int i2 = -1;
        if (i <= 0) {
            Log.m105924i("MicroMsg.BizTimeLineInfoStorage", "getMaxWeightByOrderFlag unReadCount < 0");
            return -1;
        }
        Cursor rawQuery2 = this.f55550d.rawQuery(String.format("SELECT orderFlag FROM %s WHERE isRead = 0 and orderFlag <= %d and orderFlag >= %d order by orderFlag Desc limit 1", new Object[]{"BizTimeLineInfo", Long.valueOf(j), Long.valueOf(j2)}), (String[]) null);
        if (rawQuery2.moveToFirst()) {
            i2 = ((int) ((rawQuery2.getLong(0) & 4278190080L) >> 24)) - 1;
        }
        rawQuery2.close();
        if (i2 < 0) {
            Log.m105924i("MicroMsg.BizTimeLineInfoStorage", "getMaxWeightByOrderFlag weight < 0");
        }
        return i2;
    }

    /* renamed from: qq */
    public boolean mo25811qq(int i) {
        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "deleteByRecRecycleCardType: %s", Integer.valueOf(i));
        C19623o0 o0Var = new C19623o0();
        o0Var.field_recycleCardType = i;
        boolean delete = super.delete(o0Var, false, "recycleCardType");
        p0$$f p0__f = new p0$$f();
        p0__f.f55562a = p0$$g.DELETE;
        mo25805jo(p0__f);
        Wa0();
        return delete;
    }

    public void r50(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = j & -4294967296L;
        this.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set status = 4 where orderFlag >= " + j2 + " and " + "status" + " > " + 4);
        this.f55550d.execSQL("BizTimeLineInfo", "update BizTimeLineInfo set status = 4 where orderFlag >= " + j2 + " and " + "status" + " < " + 4);
        Log.m105919d("MicroMsg.BizTimeLineInfoStorage", "resetUnread cost %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        ((C101062d) f55549q).mo139557c(Long.valueOf(j2), Boolean.TRUE);
    }

    /* renamed from: uP */
    public List<C19623o0> mo25813uP(int i, long j) {
        C91753f fVar = this.f55550d;
        String[] strArr = {"" + j};
        return mo25797bD(fVar.query("BizTimeLineInfo", (String[]) null, "orderFlag<?", strArr, (String) null, (String) null, "orderFlag DESC limit " + i));
    }

    public boolean v10(C19623o0 o0Var, boolean z) {
        boolean insertNotify = super.insertNotify(o0Var, false);
        if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) && MultiProcessMMKV.getSingleMMKV("brandService").decodeInt("insertMainDBAlso", 0) == 1) {
            o0Var.insertToDB(C86709a0.m107535s().f251811i, false);
        }
        if (z) {
            long q2 = o0Var.mo25767q2();
            synchronized (this) {
                this.f55555i = Math.max(q2, this.f55555i);
            }
        }
        p0$$f p0__f = new p0$$f();
        p0__f.f55564c = o0Var.field_talker;
        p0__f.f55563b = o0Var;
        p0__f.f55562a = p0$$g.INSERT;
        mo25805jo(p0__f);
        return insertNotify;
    }

    /* renamed from: vP */
    public List<C19623o0> mo25815vP(int i, long j) {
        C91753f fVar = this.f55550d;
        String[] strArr = {"" + j};
        return mo25797bD(fVar.query("BizTimeLineInfo", (String[]) null, "orderFlag>?", strArr, (String) null, (String) null, "orderFlag DESC limit " + i));
    }
}
