package wb1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C76861g;
import p749xh.C66261f3;
import pb1.C100695a0;
import pb1.C100718j1;
import pb1.C100731p1;
import pb1.C100734q;
import pb1.C100739r1;
import pb1.C100754y0;
import pb1.C100755z;
import te3.C101834rc0;
import te3.C50524nd0;
import te3.C50529ne0;
import xb1.C102612a;
import xb1.C102614d;

/* renamed from: wb1.u */
public class C102417u implements C11385n, C100754y0 {

    /* renamed from: j */
    public static Map<Integer, C76861g.C47263a> f301650j = new HashMap();

    /* renamed from: n */
    public static Map<Integer, Integer> f301651n = new HashMap();

    /* renamed from: d */
    public boolean f301652d = false;

    /* renamed from: e */
    public int f301653e = 0;

    /* renamed from: f */
    public long f301654f = 0;

    /* renamed from: g */
    public boolean f301655g = false;

    /* renamed from: h */
    public Queue<C100755z> f301656h = new LinkedList();

    /* renamed from: i */
    public MTimerHandler f301657i = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C102420c(), false);

    /* renamed from: wb1.u$a */
    public class C102418a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f301658d;

        /* renamed from: e */
        public final /* synthetic */ int f301659e;

        /* renamed from: f */
        public final /* synthetic */ int f301660f;

        public C102418a(C117747y yVar, int i, int i2) {
            this.f301658d = yVar;
            this.f301659e = i;
            this.f301660f = i2;
        }

        public void run() {
            int i;
            Class cls = C100718j1.class;
            C102417u.this.f301655g = false;
            int i2 = ((C100739r1) this.f301658d).f295138f;
            ((HashMap) C102417u.f301650j).remove(Integer.valueOf(i2));
            int i3 = this.f301659e;
            if (!(i3 == 3 && i3 == 0)) {
                C102417u uVar = C102417u.this;
                uVar.f301653e--;
            }
            C100755z qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) i2);
            if (qq != null && (i = qq.field_itemStatus) != 10) {
                if (this.f301660f != 0 || this.f301659e != 0) {
                    Integer valueOf = Integer.valueOf(Util.nullAs((Integer) ((HashMap) C102417u.f301651n).get(Integer.valueOf(i2)), 0));
                    int i4 = this.f301660f;
                    if (!(i4 == 1 || i4 == 0)) {
                        valueOf = Integer.valueOf(valueOf.intValue() - 1);
                    }
                    if (valueOf.intValue() <= 0) {
                        int i5 = this.f301660f;
                        int i6 = this.f301659e;
                        Map<Long, Long> map = C100695a0.f295014a;
                        int i7 = i6 == -401 ? -4 : i5 == 4 ? -2 : -1;
                        C115669n nVar = C115669n.INSTANCE;
                        String str = C66261f3.COL_LOCALID;
                        nVar.mo160131h(10659, 0, Integer.valueOf(qq.field_type), Integer.valueOf(i7), Long.valueOf(C100734q.m131817H(qq)), Long.valueOf(C100695a0.m131726a(qq.field_localId)));
                        ((HashMap) C102417u.f301651n).remove(Integer.valueOf(i2));
                        Log.m105921e("MicroMsg.Fav.FavModService", "achieved retry limit, set error, favId:%d", Integer.valueOf(i2));
                        qq.field_itemStatus = 18;
                        ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(qq, str);
                    }
                } else if (i == 17) {
                    C115669n.INSTANCE.mo160131h(10659, 0, Integer.valueOf(qq.field_type), 0, Long.valueOf(C100734q.m131817H(qq)), Long.valueOf(C100695a0.m131726a(qq.field_localId)));
                    Log.m105925i("MicroMsg.Fav.FavModService", "mod end set status done. favId:%d localId:%s", Integer.valueOf(qq.field_id), Long.valueOf(qq.field_localId));
                    qq.field_itemStatus = 10;
                    C102417u.this.getClass();
                    C50524nd0 nd02 = new C50524nd0();
                    StringBuffer stringBuffer = new StringBuffer();
                    nd02.f138541d = qq.field_id;
                    stringBuffer.append("favid:" + qq.field_id);
                    nd02.f138542e = new LinkedList<>();
                    Iterator<C101834rc0> it = qq.field_favProto.f298618f.iterator();
                    while (it.hasNext()) {
                        C101834rc0 next = it.next();
                        if (next.f299330u1 != 0) {
                            C50529ne0 ne02 = new C50529ne0();
                            int i8 = next.f299330u1;
                            if (i8 > 0) {
                                ne02.f138547d = next.f299280T;
                                ne02.f138548e = 0;
                                ne02.f138549f = i8;
                            } else {
                                ne02.f138547d = next.f299280T;
                                ne02.f138548e = 1;
                                ne02.f138549f = -i8;
                            }
                            stringBuffer.append(" fileId:" + ne02.f138547d + " IsThumb:" + ne02.f138548e + " status:" + ne02.f138549f);
                            nd02.f138542e.add(ne02);
                            next.f299330u1 = 0;
                            next.f299332v1 = true;
                        }
                    }
                    Log.m105925i("MicroMsg.Fav.FavModService", "checkFavItem %s", stringBuffer.toString());
                    if (nd02.f138542e.size() > 0) {
                        ((C100718j1) C86312j.m106911c(cls)).mo128214o9(nd02);
                    }
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(qq, C66261f3.COL_LOCALID);
                    ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142257qq(qq.field_localId);
                }
                C102417u uVar2 = C102417u.this;
                if (uVar2.f301653e <= 0) {
                    Log.m105924i("MicroMsg.Fav.FavModService", "klem stopFlag <= 0 , Stop Service");
                    C102417u.this.mo141992b();
                } else if (!C102417u.m135136a(uVar2)) {
                    C86709a0.m107524d().mo123460f(new C100731p1(3));
                }
            }
        }

        public String toString() {
            return super.toString() + "|onSceneEnd";
        }
    }

    /* renamed from: wb1.u$b */
    public class C102419b implements Runnable {
        public C102419b() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C102417u uVar = C102417u.this;
            long j = currentTimeMillis - uVar.f301654f;
            if (uVar.f301652d) {
                if (j >= 60000) {
                    Log.m105920e("MicroMsg.Fav.FavModService", "klem ERR: Try Run service runningFlag:" + C102417u.this.f301652d + " timeWait:" + j + ">=MAX_TIME_WAIT sending:" + C102417u.this.f301652d);
                } else {
                    return;
                }
            }
            C102417u uVar2 = C102417u.this;
            uVar2.f301655g = false;
            uVar2.f301652d = true;
            uVar2.f301653e = 3;
            uVar2.f301657i.startTimer(10);
        }

        public String toString() {
            return super.toString() + "|run";
        }
    }

    /* renamed from: wb1.u$c */
    public class C102420c implements MTimerHandler.CallBack {
        public C102420c() {
        }

        public boolean onTimerExpired() {
            try {
                C102417u.m135136a(C102417u.this);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Fav.FavModService", e, "", new Object[0]);
            }
            return false;
        }

        public String toString() {
            return super.toString() + "|scenePusher";
        }
    }

    public C102417u() {
        C86709a0.m107524d().mo123455a(v2helper.EMethodSetAgcRxOn, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0281  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m135136a(wb1.C102417u r17) {
        /*
            r0 = r17
            r17.getClass()
            java.lang.Class<pb1.j1> r1 = pb1.C100718j1.class
            long r2 = java.lang.System.currentTimeMillis()
            r0.f301654f = r2
            boolean r2 = r0.f301655g
            r3 = 3
            java.lang.String r4 = "MicroMsg.Fav.FavModService"
            r5 = 0
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 != 0) goto L_0x0141
            java.util.Queue<pb1.z> r2 = r0.f301656h
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0141
            di3.d r2 = di3.C86312j.m106911c(r1)
            pb1.j1 r2 = (pb1.C100718j1) r2
            pb1.w0 r2 = r2.mo128199Jq()
            xb1.d r2 = (xb1.C102614d) r2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f302175d
            java.lang.String r9 = "select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where itemStatus=17"
            android.database.Cursor r2 = r2.rawQuery(r9, r5, r6)
            if (r2 != 0) goto L_0x003b
            r9 = r5
            goto L_0x005c
        L_0x003b:
            boolean r9 = r2.moveToFirst()
            if (r9 == 0) goto L_0x0058
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0046:
            pb1.z r10 = new pb1.z
            r10.<init>()
            r10.convertFrom(r2)
            r9.add(r10)
            boolean r10 = r2.moveToNext()
            if (r10 != 0) goto L_0x0046
            goto L_0x0059
        L_0x0058:
            r9 = r5
        L_0x0059:
            r2.close()
        L_0x005c:
            if (r9 == 0) goto L_0x0141
            int r2 = r9.size()
            if (r2 != 0) goto L_0x0066
            goto L_0x0141
        L_0x0066:
            java.util.Iterator r2 = r9.iterator()
        L_0x006a:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0108
            java.lang.Object r9 = r2.next()
            pb1.z r9 = (pb1.C100755z) r9
            long r10 = r9.field_localId
            java.util.List r10 = ec1.C97641a.m125859a(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x0080:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r10.next()
            pb1.u r11 = (pb1.C100746u) r11
            int r12 = r11.field_type
            if (r12 != 0) goto L_0x0080
            int r12 = r11.field_status
            if (r12 == r3) goto L_0x0080
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r11 = r11.field_dataId
            r10[r7] = r11
            java.lang.String r11 = "cdnInfo is not upload end %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r11, r10)
            r10 = 0
            goto L_0x00a2
        L_0x00a1:
            r10 = 1
        L_0x00a2:
            if (r10 != 0) goto L_0x00aa
            java.lang.String r9 = "cdn info is not upload end"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x006a
        L_0x00aa:
            java.util.Map<java.lang.Integer, nj.g$a> r10 = f301650j
            int r11 = r9.field_id
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r11)
            if (r10 == 0) goto L_0x00d1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "File is Already running:"
            r10.append(r11)
            int r9 = r9.field_id
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            goto L_0x006a
        L_0x00d1:
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = f301651n
            int r11 = r9.field_id
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r11)
            if (r10 != 0) goto L_0x00f2
            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = f301651n
            int r11 = r9.field_id
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r11, r12)
        L_0x00f2:
            java.util.Queue<pb1.z> r10 = r0.f301656h
            java.util.LinkedList r10 = (java.util.LinkedList) r10
            r10.add(r9)
            java.util.Map<java.lang.Integer, nj.g$a> r10 = f301650j
            int r9 = r9.field_id
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r9, r5)
            goto L_0x006a
        L_0x0108:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "klem GetNeedRun procing:"
            r2.append(r9)
            java.util.Map<java.lang.Integer, nj.g$a> r9 = f301650j
            java.util.HashMap r9 = (java.util.HashMap) r9
            int r9 = r9.size()
            r2.append(r9)
            java.lang.String r9 = ",send:"
            r2.append(r9)
            java.util.Queue<pb1.z> r9 = r0.f301656h
            java.util.LinkedList r9 = (java.util.LinkedList) r9
            int r9 = r9.size()
            r2.append(r9)
            java.lang.String r9 = "]"
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.util.Queue<pb1.z> r2 = r0.f301656h
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            r2.size()
        L_0x0141:
            boolean r2 = r0.f301655g
            if (r2 != 0) goto L_0x015a
            java.util.Queue<pb1.z> r2 = r0.f301656h
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            if (r2 > 0) goto L_0x015a
            r17.mo141992b()
            java.lang.String r0 = "klem No Data Any More , Stop Service"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x03e0
        L_0x015a:
            boolean r2 = r0.f301655g
            if (r2 != 0) goto L_0x03e0
            java.util.Queue<pb1.z> r2 = r0.f301656h
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x03e0
            java.util.Queue<pb1.z> r2 = r0.f301656h
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            java.lang.Object r2 = r2.poll()
            pb1.z r2 = (pb1.C100755z) r2
            if (r2 == 0) goto L_0x03e0
            int r9 = r2.field_id
            if (r9 <= 0) goto L_0x03e0
            r0.f301655g = r8
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            te3.kd0 r10 = r2.field_favProto
            java.util.LinkedList<te3.rc0> r10 = r10.f298618f
            java.util.Iterator r10 = r10.iterator()
        L_0x018c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x019e
            java.lang.Object r11 = r10.next()
            te3.rc0 r11 = (te3.C101834rc0) r11
            int r11 = r11.f299330u1
            if (r11 == 0) goto L_0x018c
            r10 = 1
            goto L_0x019f
        L_0x019e:
            r10 = 0
        L_0x019f:
            if (r10 == 0) goto L_0x01c9
            java.lang.Object[] r1 = new java.lang.Object[r8]
            long r5 = r2.field_localId
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1[r7] = r3
            java.lang.String r3 = "Resend Item %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r1)
            pb1.r1 r1 = new pb1.r1
            int r3 = r2.field_id
            java.lang.String r2 = pb1.C100755z.m131907w2(r2)
            r1.<init>(r3, r0, r9, r7)
            r1.f295143n = r2
            r1.f295144o = r8
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r1)
        L_0x01c6:
            r3 = 1
            goto L_0x03df
        L_0x01c9:
            int r10 = r2.field_type
            r11 = 18
            if (r10 == r11) goto L_0x03b9
            long r10 = r2.field_localId
            te3.ry2 r12 = new te3.ry2
            r12.<init>()
            r13 = 4
            r12.f299366d = r13
            r12.f299367e = r7
            r0.add(r12)
            di3.d r12 = di3.C86312j.m106911c(r1)
            pb1.j1 r12 = (pb1.C100718j1) r12
            pb1.n0 r12 = r12.mo128198DE()
            xb1.a r12 = (xb1.C102612a) r12
            r12.getClass()
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = "select * from FavCdnInfo where favLocalId = "
            r15.append(r13)
            r15.append(r10)
            java.lang.String r13 = " and "
            r15.append(r13)
            java.lang.String r8 = "type"
            r15.append(r8)
            java.lang.String r8 = " = "
            r15.append(r8)
            r15.append(r7)
            r15.append(r13)
            java.lang.String r13 = "status"
            r15.append(r13)
            r15.append(r8)
            r15.append(r3)
            java.lang.String r8 = r15.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r12.f302172d
            android.database.Cursor r8 = r12.rawQuery(r8, r5, r6)
            if (r8 == 0) goto L_0x0245
            boolean r12 = r8.moveToFirst()
            if (r12 == 0) goto L_0x0245
        L_0x0234:
            pb1.u r12 = new pb1.u
            r12.<init>()
            r12.convertFrom(r8)
            r14.add(r12)
            boolean r12 = r8.moveToNext()
            if (r12 != 0) goto L_0x0234
        L_0x0245:
            if (r8 == 0) goto L_0x024a
            r8.close()
        L_0x024a:
            r8 = 1
            java.lang.Object[] r12 = new java.lang.Object[r8]
            int r8 = r14.size()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r12[r7] = r8
            java.lang.String r8 = "MicroMsg.FavCdnStorage"
            java.lang.String r13 = "getUploadedInfos size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r8, r13, r12)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            r8[r7] = r12
            int r12 = r14.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13 = 1
            r8[r13] = r12
            java.lang.String r12 = "setModAfterClientUpload %d modcdnlistsize %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r12, r8)
            java.util.Iterator r8 = r14.iterator()
        L_0x027b:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x03a9
            java.lang.Object r12 = r8.next()
            pb1.u r12 = (pb1.C100746u) r12
            java.lang.String r13 = r12.field_dataId
            java.util.HashMap<java.lang.Long, java.util.ArrayList<java.lang.String>> r14 = pb1.C100734q.f295126a
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r14 == 0) goto L_0x0293
            r13 = 0
            goto L_0x0299
        L_0x0293:
            java.lang.String r14 = "_t"
            boolean r13 = r13.endsWith(r14)
        L_0x0299:
            java.lang.String r14 = r12.field_cdnUrl
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r14 != 0) goto L_0x038b
            if (r13 == 0) goto L_0x02a5
            goto L_0x038b
        L_0x02a5:
            te3.uy2 r13 = new te3.uy2
            r13.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "dataitem."
            r14.append(r15)
            java.lang.String r5 = r12.field_dataId
            r14.append(r5)
            java.lang.String r5 = ".cdn_dataurl"
            r14.append(r5)
            java.lang.String r5 = r14.toString()
            r13.f299650d = r5
            java.lang.String r5 = r12.field_cdnUrl
            r13.f299652f = r5
            r9.add(r13)
            te3.uy2 r5 = new te3.uy2
            r5.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            java.lang.String r14 = r12.field_dataId
            r13.append(r14)
            java.lang.String r14 = ".cdn_datakey"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r5.f299650d = r13
            java.lang.String r13 = r12.field_cdnKey
            r5.f299652f = r13
            r9.add(r5)
            te3.uy2 r5 = new te3.uy2
            r5.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r15)
            java.lang.String r14 = r12.field_dataId
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r5.f299650d = r13
            java.lang.String r13 = "datastatus"
            r5.f299651e = r13
            java.lang.String r13 = "0"
            r5.f299652f = r13
            r9.add(r5)
            di3.d r5 = di3.C86312j.m106911c(r1)
            pb1.j1 r5 = (pb1.C100718j1) r5
            pb1.w0 r5 = r5.mo128199Jq()
            long r13 = r12.field_favLocalId
            xb1.d r5 = (xb1.C102614d) r5
            pb1.z r5 = r5.mo142266Yt(r13)
            if (r5 == 0) goto L_0x0389
            int r13 = r5.field_type
            r14 = 4
            if (r13 != r14) goto L_0x032d
            r13 = 1
            goto L_0x032e
        L_0x032d:
            r13 = 0
        L_0x032e:
            if (r13 == 0) goto L_0x0389
            java.lang.String r13 = r12.field_dataId
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r16 != 0) goto L_0x0362
            te3.kd0 r14 = r5.field_favProto
            java.util.LinkedList<te3.rc0> r14 = r14.f298618f
            int r14 = r14.size()
            if (r14 != 0) goto L_0x0343
            goto L_0x0362
        L_0x0343:
            te3.kd0 r5 = r5.field_favProto
            java.util.LinkedList<te3.rc0> r5 = r5.f298618f
            java.util.Iterator r5 = r5.iterator()
        L_0x034b:
            boolean r14 = r5.hasNext()
            if (r14 == 0) goto L_0x0362
            java.lang.Object r14 = r5.next()
            te3.rc0 r14 = (te3.C101834rc0) r14
            java.lang.String r6 = r14.f299280T
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L_0x0360
            goto L_0x0363
        L_0x0360:
            r6 = 2
            goto L_0x034b
        L_0x0362:
            r14 = 0
        L_0x0363:
            if (r14 == 0) goto L_0x0389
            te3.uy2 r5 = new te3.uy2
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r15)
            java.lang.String r12 = r12.field_dataId
            r6.append(r12)
            java.lang.String r12 = ".stream_videoid"
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            r5.f299650d = r6
            java.lang.String r6 = r14.f299279S0
            r5.f299652f = r6
            r9.add(r5)
        L_0x0389:
            r12 = 2
            goto L_0x03a5
        L_0x038b:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r12.field_cdnUrl
            r5[r7] = r6
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r13)
            r12 = 1
            r5[r12] = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r12 = 2
            r5[r12] = r6
            java.lang.String r6 = "setModAfterClientUpload cdnUrl:%s, isThumb:%b,  favLocalId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r6, r5)
        L_0x03a5:
            r5 = 0
            r6 = 2
            goto L_0x027b
        L_0x03a9:
            pb1.r1 r1 = new pb1.r1
            int r2 = r2.field_id
            r1.<init>(r2, r0, r9, r7)
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r1)
            goto L_0x01c6
        L_0x03b9:
            te3.ry2 r1 = new te3.ry2
            r1.<init>()
            r3 = 1
            r1.f299366d = r3
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            int r5 = (int) r4
            r1.f299367e = r5
            r0.add(r1)
            pb1.r1 r1 = new pb1.r1
            int r4 = r2.field_id
            java.lang.String r2 = pb1.C100755z.m131907w2(r2)
            r1.<init>(r4, r0, r9, r7)
            r1.f295143n = r2
            ob0.b0 r0 = f40.C86709a0.m107524d()
            r0.mo123460f(r1)
        L_0x03df:
            r7 = 1
        L_0x03e0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wb1.C102417u.m135136a(wb1.u):boolean");
    }

    /* renamed from: b */
    public final void mo141992b() {
        ((LinkedList) this.f301656h).clear();
        ((HashMap) f301650j).clear();
        this.f301652d = false;
        this.f301655g = false;
        ((HashMap) f301651n).clear();
    }

    /* renamed from: c */
    public void mo141993c() {
        C86709a0.m107525e().postToWorker(new C102419b());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 426 && (yVar instanceof C100739r1)) {
            Log.m105925i("MicroMsg.Fav.FavModService", "onSceneEnd %s %s %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C86709a0.m107525e().postToWorker(new C102418a(yVar, i2, i));
        }
    }
}
