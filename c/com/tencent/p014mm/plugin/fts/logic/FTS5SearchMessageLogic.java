package com.tencent.p014mm.plugin.fts.logic;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Looper;
import android.util.Pair;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.autogen.events.ShouldRescanMessagesEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.fts.C68985g;
import com.tencent.p014mm.plugin.fts.C93824b;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import ht1.C60166f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kv1.C61172m;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99252h;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99678j;
import lv1.C99681n;
import lv1.C99682o;
import p749xh.C38604l2;
import qe3.C89625d;
import rv1.C101467b;
import rv1.C101470d;

/* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic */
public class FTS5SearchMessageLogic extends C99248b implements C75875l.C75877b {

    /* renamed from: e */
    public C76636p f270935e;

    /* renamed from: f */
    public C61172m f270936f;

    /* renamed from: g */
    public C101470d f270937g;

    /* renamed from: h */
    public boolean f270938h = false;

    /* renamed from: i */
    public IListener f270939i;

    /* renamed from: j */
    public IListener f270940j;

    /* renamed from: n */
    public IListener f270941n;

    /* renamed from: o */
    public IListener f270942o;

    /* renamed from: p */
    public MTimerHandler f270943p;

    /* renamed from: q */
    public C99672i.C99674b f270944q;

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$a */
    public class C93884a implements MTimerHandler.CallBack {
        public C93884a() {
        }

        public boolean onTimerExpired() {
            FTS5SearchMessageLogic.this.mo128828d(0);
            FTS5SearchMessageLogic.this.f270942o.dead();
            return false;
        }

        public String toString() {
            return super.toString() + "|mBackgroundTimer";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$b */
    public class C93885b implements C99672i.C99674b {
        public C93885b(FTS5SearchMessageLogic fTS5SearchMessageLogic) {
        }

        /* renamed from: a */
        public String[] mo128830a(String str, int i) {
            return C99249c.C99250a.f291024f.split(str, i);
        }

        /* renamed from: b */
        public String[] mo128831b(String str) {
            ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e.getClass();
            return C99249c.C99250a.f291024f.split(str);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$c */
    public class C93886c extends C99664b {

        /* renamed from: j */
        public int f270949j = 0;

        /* renamed from: n */
        public int f270950n = 0;

        /* renamed from: o */
        public int f270951o = 0;

        /* renamed from: p */
        public int f270952p = 0;

        public C93886c(C938811 r2) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            String str;
            int i;
            String[] strArr;
            Iterator it;
            Class<C38604l2> cls = C38604l2.class;
            long k = ((C93834f) FTS5SearchMessageLogic.this.f270937g.f290993f).mo128794k(-200, MAlarmHandler.NEXT_FIRE_INTERVAL);
            long jo = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo("");
            if (k > jo) {
                FTS5SearchMessageLogic.this.f270937g.mo138626z(-310, System.currentTimeMillis());
                FTS5SearchMessageLogic.this.f270937g.mo138626z(-311, (long) C89625d.f257841g);
            }
            char c = 2;
            int i2 = 0;
            int i3 = 1;
            String str2 = "MicroMsg.FTS.FTS5SearchMessageLogic";
            Log.m105925i(str2, "Start building message index, last createTime: %s last from createTime: %s", Long.valueOf(k), Long.valueOf(jo));
            if (!Thread.interrupted()) {
                int i4 = Integer.MAX_VALUE;
                String[] strArr2 = new String[3];
                ArrayList arrayList = new ArrayList();
                while (i4 >= 50) {
                    strArr2[i2] = Long.toString(k);
                    strArr2[i3] = Long.toString(jo);
                    strArr2[c] = Integer.toString(this.f270949j);
                    ((C68985g) FTS5SearchMessageLogic.this.f270936f).getClass();
                    C86709a0.m107528h();
                    Cursor rawQuery = C86709a0.m107535s().f251811i.rawQuery("SELECT msgId, talker, createTime, content, type, isSend FROM message WHERE createTime<=? AND createTime>? AND (type = 1 OR (type & 0xFFFF = 49)) ORDER BY createTime DESC, msgId DESC LIMIT 50 OFFSET ?;", strArr2);
                    long j = 0;
                    int i5 = 0;
                    while (rawQuery.moveToNext()) {
                        C93889f fVar = new C93889f(FTS5SearchMessageLogic.this, (C938811) null);
                        long j2 = jo;
                        fVar.f270959a = rawQuery.getLong(i2);
                        fVar.f270960b = rawQuery.getString(i3);
                        fVar.f270961c = rawQuery.getLong(2);
                        fVar.f270962d = rawQuery.getString(3);
                        fVar.f270963e = rawQuery.getInt(4);
                        fVar.f270965g = rawQuery.getInt(5);
                        fVar.f270964f = 41;
                        if (FTS5SearchMessageLogic.m118599c(FTS5SearchMessageLogic.this, fVar)) {
                            fVar.mo128832a();
                            if (Util.isNullOrNil(fVar.f270966h) ^ i3) {
                                arrayList.add(fVar);
                            }
                        }
                        i5++;
                        j = fVar.f270961c;
                        jo = j2;
                    }
                    long j3 = jo;
                    rawQuery.close();
                    if (!Thread.interrupted()) {
                        int size = arrayList.size();
                        if (size == 0) {
                            Object[] objArr = new Object[2];
                            objArr[i2] = Integer.valueOf(size);
                            objArr[i3] = Integer.valueOf(this.f270949j);
                            Log.m105925i(str2, "build msgRecList size %d offset %s", objArr);
                        } else {
                            Object[] objArr2 = new Object[6];
                            objArr2[i2] = Integer.valueOf(size);
                            objArr2[i3] = Long.valueOf(((C93889f) arrayList.get(i2)).f270959a);
                            int i6 = size - 1;
                            objArr2[2] = Long.valueOf(((C93889f) arrayList.get(i6)).f270959a);
                            objArr2[3] = C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, ((C93889f) arrayList.get(i2)).f270961c / 1000);
                            objArr2[4] = C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, ((C93889f) arrayList.get(i6)).f270961c / 1000);
                            objArr2[5] = Integer.valueOf(this.f270949j);
                            Log.m105925i(str2, "build msgRecList size %d Id FROM %d to %d Time FROM %s to %s offset %s", objArr2);
                        }
                        if (size > 0) {
                            long j4 = ((C93889f) arrayList.get(i2)).f270961c;
                            String str3 = str2;
                            long j5 = ((C93889f) arrayList.get(arrayList.size() - i3)).f270961c;
                            C101470d dVar = FTS5SearchMessageLogic.this.f270937g;
                            dVar.getClass();
                            SingleTable singleTable = C38604l2.f102913n;
                            LinkedList linkedList = new LinkedList();
                            LinkedList linkedList2 = new LinkedList();
                            LinkedList linkedList3 = new LinkedList();
                            i = i5;
                            linkedList.add(C38604l2.f102914o);
                            Column column = C38604l2.f102915p;
                            linkedList.add(column);
                            List<C38604l2> multiQuery = C38604l2.f102913n.select((List<? extends ISqlColumn>) linkedList).where(column.smallerEqual((Number) Long.valueOf(j4)).and(column.largerThan((Number) Long.valueOf(j5)))).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3).build().multiQuery(((C93834f) dVar.f290993f).mo128795l(), cls);
                            HashSet hashSet = new HashSet();
                            for (C38604l2 next : multiQuery) {
                                hashSet.add(new Pair(Long.valueOf(next.mo61729l2()), Long.valueOf(next.getTimestamp())));
                            }
                            FTS5SearchMessageLogic.this.f270937g.mo138598a();
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                C93889f fVar2 = (C93889f) it4.next();
                                long j6 = fVar2.f270959a;
                                long j7 = fVar2.f270961c;
                                if (j7 == k) {
                                    this.f270949j++;
                                } else {
                                    this.f270949j = 0;
                                    k = j7;
                                }
                                long j8 = k;
                                if (hashSet.remove(new Pair(Long.valueOf(j6), Long.valueOf(j7)))) {
                                    it = it4;
                                } else {
                                    try {
                                        it = it4;
                                        try {
                                            FTS5SearchMessageLogic.this.f270937g.mo140970A(65536, fVar2.f270964f, j6, fVar2.f270960b, j7, fVar2.f270966h, fVar2.f270967i);
                                            this.f270950n++;
                                        } catch (Exception e) {
                                            e = e;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        it = it4;
                                        Log.printErrStackTrace(str3, e, "Build message index failed with exception. \n%s", fVar2.f270966h);
                                        this.f270952p++;
                                        k = j8;
                                        it4 = it;
                                    }
                                }
                                k = j8;
                                it4 = it;
                            }
                            Iterator it5 = hashSet.iterator();
                            while (it5.hasNext()) {
                                Pair pair = (Pair) it5.next();
                                C101470d dVar2 = FTS5SearchMessageLogic.this.f270937g;
                                int[] iArr = C99249c.f291003a;
                                long longValue = ((Long) pair.first).longValue();
                                long longValue2 = ((Long) pair.second).longValue();
                                dVar2.getClass();
                                ArrayList arrayList2 = new ArrayList(4);
                                StringBuilder sb = new StringBuilder();
                                String str4 = str3;
                                sb.append("SELECT docid FROM %s WHERE type IN ");
                                sb.append(C99251g.m129291l(iArr));
                                sb.append(" AND entity_id=? AND timestamp=?;");
                                String[] strArr3 = strArr2;
                                int i7 = 0;
                                Cursor o = ((C93834f) dVar2.f290993f).mo128798o(String.format(sb.toString(), new Object[]{dVar2.mo138611l()}), new String[]{Long.toString(longValue), Long.toString(longValue2)});
                                while (true) {
                                    CursorWrapper cursorWrapper = (CursorWrapper) o;
                                    if (!cursorWrapper.moveToNext()) {
                                        break;
                                    }
                                    arrayList2.add(Long.valueOf(cursorWrapper.getLong(i7)));
                                    i7 = 0;
                                }
                                ((C93824b) o).close();
                                dVar2.mo138606g(arrayList2);
                                this.f270951o++;
                                it5.remove();
                                strArr2 = strArr3;
                                str3 = str4;
                            }
                            str = str3;
                            strArr = strArr2;
                            FTS5SearchMessageLogic.this.f270937g.mo138600c();
                            FTS5SearchMessageLogic.this.f270937g.mo138626z(-200, k);
                        } else {
                            i = i5;
                            str = str2;
                            strArr = strArr2;
                            this.f270949j = 0;
                            k = j;
                        }
                        arrayList.clear();
                        if (!Thread.interrupted()) {
                            strArr2 = strArr;
                            jo = j3;
                            i4 = i;
                            str2 = str;
                            c = 2;
                            i2 = 0;
                            i3 = 1;
                        } else {
                            throw new InterruptedException();
                        }
                    } else {
                        throw new InterruptedException();
                    }
                }
                C101470d dVar3 = FTS5SearchMessageLogic.this.f270937g;
                dVar3.getClass();
                SingleTable singleTable2 = C38604l2.f102913n;
                LinkedList linkedList4 = new LinkedList();
                LinkedList linkedList5 = new LinkedList();
                LinkedList linkedList6 = new LinkedList();
                linkedList4.add(C38604l2.f102914o);
                List<C38604l2> multiQuery2 = C38604l2.f102913n.select((List<? extends ISqlColumn>) linkedList4).where(C38604l2.f102916q.equal((Number) -1)).orderBy((List<? extends ISqlOrder>) linkedList5).groupBy((List<? extends Column>) linkedList6).build().multiQuery(((C93834f) dVar3.f290993f).mo128795l(), cls);
                ArrayList arrayList3 = new ArrayList();
                for (C38604l2 l2 : multiQuery2) {
                    arrayList3.add(Long.valueOf(l2.mo61729l2()));
                }
                ListIterator listIterator = arrayList3.listIterator(arrayList3.size());
                int i8 = 50;
                while (listIterator.hasPrevious()) {
                    if (!Thread.interrupted()) {
                        if (i8 >= 50) {
                            FTS5SearchMessageLogic.this.f270937g.mo138600c();
                            FTS5SearchMessageLogic.this.f270937g.mo138598a();
                            i8 = 0;
                        }
                        FTS5SearchMessageLogic.this.f270937g.mo138605f(((Long) listIterator.previous()).longValue());
                        i8++;
                        this.f270951o++;
                        listIterator.remove();
                    } else {
                        FTS5SearchMessageLogic.this.f270937g.mo138600c();
                        throw new InterruptedException();
                    }
                }
                FTS5SearchMessageLogic.this.f270937g.mo138626z(-200, k - 1);
                FTS5SearchMessageLogic.this.f270937g.mo138600c();
                FTS5SearchMessageLogic.this.f270938h = false;
                return true;
            }
            throw new InterruptedException();
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{new: %d removed: %d failed: %d}", new Object[]{Integer.valueOf(this.f270950n), Integer.valueOf(this.f270951o), Integer.valueOf(this.f270952p)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 4;
        }

        public String getName() {
            return "BuildMessageIndexTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$d */
    public class C93887d extends C99664b {

        /* renamed from: j */
        public long f270954j;

        public C93887d(long j) {
            this.f270954j = j;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            FTS5SearchMessageLogic.this.f270937g.mo138607h(C99249c.f291003a, this.f270954j);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{MsgId: %d}", new Object[]{Long.valueOf(this.f270954j)});
        }

        public String getName() {
            return "DeleteMessageTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$e */
    public class C93888e extends C99664b {

        /* renamed from: j */
        public List<C72963f4> f270956j;

        /* renamed from: n */
        public StringBuffer f270957n = new StringBuffer();

        public C93888e(List<C72963f4> list) {
            ArrayList arrayList = new ArrayList();
            this.f270956j = arrayList;
            arrayList.addAll(list);
        }

        /* renamed from: b */
        public boolean mo57099b() {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.f270956j).iterator();
            while (it.hasNext()) {
                C72963f4 f4Var = (C72963f4) it.next();
                C93889f fVar = new C93889f(FTS5SearchMessageLogic.this, (C938811) null);
                fVar.f270959a = f4Var.getMsgId();
                fVar.f270960b = f4Var.mo108768t();
                fVar.f270961c = f4Var.getCreateTime();
                fVar.f270962d = f4Var.getContent();
                fVar.f270963e = f4Var.getType();
                fVar.f270965g = f4Var.mo108769t2();
                if (FTS5SearchMessageLogic.m118599c(FTS5SearchMessageLogic.this, fVar)) {
                    fVar.mo128832a();
                    if (!Util.isNullOrNil(fVar.f270966h)) {
                        arrayList.add(fVar);
                    }
                }
            }
            this.f270957n.append("{MsgId: ");
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C93889f fVar2 = (C93889f) it4.next();
                this.f270957n.append(fVar2.f270959a);
                this.f270957n.append(",");
                this.f270957n.append(fVar2.f270960b);
                this.f270957n.append(",");
                this.f270957n.append(fVar2.f270961c);
                this.f270957n.append(" ");
            }
            this.f270957n.append("count: ");
            this.f270957n.append(arrayList.size());
            this.f270957n.append("}");
            if (arrayList.size() > 0) {
                FTS5SearchMessageLogic.this.f270937g.mo138598a();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    C93889f fVar3 = (C93889f) it5.next();
                    FTS5SearchMessageLogic.this.f270937g.mo140970A(65536, fVar3.f270964f, fVar3.f270959a, fVar3.f270960b, fVar3.f270961c, fVar3.f270966h, fVar3.f270967i);
                }
                FTS5SearchMessageLogic.this.f270937g.mo138600c();
            }
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return this.f270957n.toString();
        }

        public String getName() {
            return "InsertMessageTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$f */
    public class C93889f {

        /* renamed from: a */
        public long f270959a;

        /* renamed from: b */
        public String f270960b;

        /* renamed from: c */
        public long f270961c;

        /* renamed from: d */
        public String f270962d;

        /* renamed from: e */
        public int f270963e;

        /* renamed from: f */
        public int f270964f;

        /* renamed from: g */
        public int f270965g;

        /* renamed from: h */
        public String f270966h;

        /* renamed from: i */
        public String f270967i;

        public C93889f(FTS5SearchMessageLogic fTS5SearchMessageLogic, C938811 r2) {
        }

        /* renamed from: a */
        public void mo128832a() {
            int i = this.f270963e;
            boolean z = false;
            if (i == 1 || i == 1107296305) {
                this.f270964f = 41;
                if (!C72996z1.m85820U5(this.f270960b) || this.f270965g != 0) {
                    this.f270966h = this.f270962d;
                } else {
                    this.f270966h = C75604z3.m90849u(this.f270962d);
                }
            } else {
                if ((65535 & i) == 49) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(this.f270962d, (String) null);
                    if (u != null) {
                        int i2 = u.f195582i;
                        if (i2 != 1) {
                            if (!(i2 == 8 || i2 == 10 || i2 == 13)) {
                                if (i2 == 33) {
                                    this.f270966h = Util.nullAs(u.mo93550m(), "");
                                    this.f270964f = 48;
                                } else if (i2 == 51) {
                                    C60166f fVar = (C60166f) u.mo93555w(C60166f.class);
                                    this.f270966h = Util.nullAs(fVar.mo85179g(), "") + "​" + Util.nullAs(fVar.f171710b.f185187h, "");
                                    this.f270964f = 53;
                                } else if (!(i2 == 53 || i2 == 57)) {
                                    if (i2 != 74) {
                                        if (i2 != 2011) {
                                            if (!(i2 == 3 || i2 == 4 || i2 == 5)) {
                                                if (i2 != 6) {
                                                    if (!(i2 == 15 || i2 == 16)) {
                                                        if (i2 == 19) {
                                                            String nullAs = Util.nullAs(u.mo93548k(), "");
                                                            this.f270966h = nullAs;
                                                            if (nullAs != null) {
                                                                this.f270966h = nullAs.replace(XVFSFile.PATH_SEPARATOR, "​");
                                                            }
                                                            this.f270964f = 44;
                                                        } else if (i2 != 20) {
                                                            if (i2 == 24) {
                                                                String nullAs2 = Util.nullAs(u.mo93548k(), "");
                                                                this.f270966h = nullAs2;
                                                                if (nullAs2 != null) {
                                                                    this.f270966h = nullAs2.replace(XVFSFile.PATH_SEPARATOR, "​");
                                                                }
                                                                this.f270964f = 49;
                                                            } else if (i2 != 25) {
                                                                if (i2 != 2000) {
                                                                    if (i2 == 2001) {
                                                                        if ("1001".equals(u.f195604n1)) {
                                                                            this.f270964f = 47;
                                                                            if (this.f270965g == 1) {
                                                                                this.f270966h = Util.nullAs(u.f195596l1, "") + "​" + Util.nullAs(u.f195584i1, "");
                                                                            } else {
                                                                                this.f270966h = Util.nullAs(u.f195596l1, "") + "​" + Util.nullAs(u.f195580h1, "");
                                                                            }
                                                                        } else if ("1002".equals(u.f195604n1) || "1005".equals(u.f195604n1)) {
                                                                            this.f270964f = 46;
                                                                            if (this.f270965g == 1) {
                                                                                this.f270966h = Util.nullAs(u.f195596l1, "") + "​" + Util.nullAs(u.f195584i1, "");
                                                                            } else {
                                                                                this.f270966h = Util.nullAs(u.f195596l1, "") + "​" + Util.nullAs(u.f195580h1, "");
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        this.f270966h = Util.nullAs(u.f195570f, "");
                                        this.f270964f = 45;
                                    }
                                    this.f270966h = Util.nullAs(u.mo93550m(), "");
                                    this.f270964f = 42;
                                }
                            }
                            this.f270966h = Util.nullAs(u.mo93550m(), "");
                            this.f270964f = 43;
                        }
                        this.f270966h = Util.nullAs(u.mo93550m(), "");
                        this.f270964f = 52;
                    }
                } else {
                    if (i == 48) {
                        z = true;
                    }
                    if (z) {
                        this.f270964f = 50;
                        C72963f4.C72968e Tx0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Tx0(C72996z1.m85820U5(this.f270960b) ? C75604z3.m90849u(this.f270962d) : this.f270962d);
                        if (Tx0.mo101029a()) {
                            this.f270966h = Tx0.f212708f + "​" + Tx0.f212707e;
                        } else {
                            this.f270966h = Tx0.f212707e;
                        }
                    }
                }
            }
            if (!Util.isNullOrNil(this.f270966h)) {
                this.f270966h = C99251g.m129280a(this.f270966h);
            }
            if (C72996z1.m85804J4(this.f270960b)) {
                this.f270967i = this.f270960b;
                this.f270960b = "appbrandcustomerservicemsg";
            } else if (this.f270965g == 1) {
                this.f270967i = C75592q0.m90789s();
            } else if (C72996z1.m85820U5(this.f270960b)) {
                this.f270967i = Util.nullAs(C75604z3.m90847s(this.f270962d), this.f270960b);
            } else {
                this.f270967i = this.f270960b;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$g */
    public class C93890g extends C99678j {
        public C93890g(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 29;
        }

        public String getName() {
            return "SearchConvTalkerMessageTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            mo139040h(IXWebBroadcastListener.STAGE_START);
            lVar.f32075d = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchMessageLogic.this.f270944q);
            C99672i a = C99672i.m130094a(this.f292133j.f224470e, true);
            HashMap hashMap = new HashMap();
            Cursor C = ((C101467b) ((C99260q) C86312j.m106911c(C99260q.class)).db0(3)).mo140967C(a, this.f292133j.f224471f, C99249c.f291011i, C99249c.f291013k);
            do {
                CursorWrapper cursorWrapper = (CursorWrapper) C;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                C99682o oVar = new C99682o();
                oVar.f292151e = cursorWrapper.getString(0);
                oVar.f292148b = cursorWrapper.getInt(1);
                oVar.f292149c = cursorWrapper.getInt(2);
                oVar.f292168v = a;
                if (!hashMap.containsKey(oVar.f292151e)) {
                    hashMap.put(oVar.f292151e, oVar);
                }
            } while (hashMap.size() <= 100);
            ((C93824b) C).close();
            mo139040h("findHitContact");
            Cursor B = FTS5SearchMessageLogic.this.f270937g.mo140971B(lVar.f32075d, this.f292133j.f224469d, hashMap.keySet());
            HashMap hashMap2 = new HashMap();
            while (((CursorWrapper) B).moveToNext()) {
                C99682o oVar2 = new C99682o();
                oVar2.mo139051d(B);
                oVar2.f292168v = lVar.f32075d;
                oVar2.f292161o = 1;
                List arrayList = hashMap2.containsKey(oVar2.f292153g) ? (List) hashMap2.get(oVar2.f292153g) : new ArrayList();
                arrayList.add(oVar2);
                hashMap2.put(oVar2.f292153g, arrayList);
            }
            ((C93824b) B).close();
            lVar.f32076e = new ArrayList();
            for (Map.Entry entry : hashMap2.entrySet()) {
                C99681n nVar = (C99681n) hashMap.get(entry.getKey());
                if (nVar != null) {
                    Collections.sort((List) entry.getValue(), this.f292133j.f224477l);
                    nVar.f292161o = entry.getValue();
                    nVar.f292152f = ((C99681n) ((List) entry.getValue()).get(0)).f292152f;
                    lVar.f32076e.add(nVar);
                }
            }
            Collections.sort(lVar.f32076e, this.f292133j.f224477l);
            mo139040h("findHitMessage");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$h */
    public class C93891h extends C99678j {
        public C93891h(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 14;
        }

        public String getName() {
            return "SearchConversationMessageTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            mo139040h(IXWebBroadcastListener.STAGE_START);
            C99672i b = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchMessageLogic.this.f270944q);
            lVar.f32075d = b;
            C101470d dVar = FTS5SearchMessageLogic.this.f270937g;
            String str = this.f292133j.f224469d;
            dVar.getClass();
            String[] strArr = {str};
            Cursor o = ((C93834f) dVar.f290993f).mo128798o(String.format("SELECT %s.docid, type, subtype, entity_id, aux_index, timestamp, talker FROM %s JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index = ? AND status >= 0 ORDER BY timestamp desc;", new Object[]{dVar.mo138611l(), dVar.mo138611l(), dVar.mo138609j(), dVar.mo138611l(), dVar.mo138609j(), dVar.mo138609j(), b.mo139044d()}), strArr);
            lVar.f32076e = new ArrayList();
            while (((CursorWrapper) o).moveToNext()) {
                C99682o oVar = new C99682o();
                oVar.mo139051d(o);
                oVar.f292161o = 1;
                lVar.f32076e.add(oVar);
            }
            ((C93824b) o).close();
            mo139040h("findConversationMessage");
            if (lVar.f32075d.f292123d.length > 1 && !this.f292133j.f224475j.contains("create_talker_message​")) {
                Cursor C = ((C101467b) ((C99260q) C86312j.m106911c(C99260q.class)).db0(3)).mo140967C(C99672i.m130094a(lVar.f32075d.f292123d[0], true), (String) null, C99249c.f291011i, C99249c.f291013k);
                if (((CursorWrapper) C).moveToNext()) {
                    C99681n nVar = new C99681n();
                    nVar.f292151e = "create_talker_message​";
                    lVar.f32076e.add(0, nVar);
                }
                ((C93824b) C).close();
                mo139040h("findTalkerConversation");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$i */
    public class C93892i extends C99678j {

        /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$i$a */
        public class C93893a {

            /* renamed from: a */
            public int f270971a;

            /* renamed from: b */
            public int f270972b;

            /* renamed from: c */
            public long f270973c;

            /* renamed from: d */
            public String f270974d;

            /* renamed from: e */
            public long f270975e;

            public C93893a(C93892i iVar, C938811 r2) {
            }
        }

        public C93892i(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 24;
        }

        public String getName() {
            return "SearchLimitGroupMessage";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            C10656l lVar2 = lVar;
            mo139040h(IXWebBroadcastListener.STAGE_START);
            C99672i b = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchMessageLogic.this.f270944q);
            lVar2.f32075d = b;
            C101470d dVar = FTS5SearchMessageLogic.this.f270937g;
            dVar.getClass();
            int i = 1;
            C938811 r6 = null;
            Cursor o = ((C93834f) dVar.f290993f).mo128798o(String.format("SELECT type, subtype, entity_id, aux_index, timestamp FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0 ORDER BY timestamp desc;", new Object[]{dVar.mo138611l(), dVar.mo138609j(), dVar.mo138611l(), dVar.mo138609j(), dVar.mo138609j(), b.mo139044d()}), (String[]) null);
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                String string = cursorWrapper.getString(3);
                if (hashSet.add(string)) {
                    C93893a aVar = new C93893a(this, r6);
                    aVar.f270971a = cursorWrapper.getInt(0);
                    aVar.f270972b = cursorWrapper.getInt(i);
                    aVar.f270973c = cursorWrapper.getLong(2);
                    aVar.f270974d = cursorWrapper.getString(3);
                    aVar.f270975e = cursorWrapper.getLong(4);
                    arrayList.add(aVar);
                    arrayList2.add(string);
                }
                if (arrayList.size() > this.f292133j.f224474i) {
                    break;
                }
                r6 = null;
                i = 1;
            }
            ((C93824b) o).close();
            lVar2.f32076e = new LinkedList();
            mo139040h("findUsername");
            if (arrayList2.size() > 0) {
                C101470d dVar2 = FTS5SearchMessageLogic.this.f270937g;
                C99672i iVar = lVar2.f32075d;
                dVar2.getClass();
                String d = iVar.mo139044d();
                StringBuffer stringBuffer = new StringBuffer();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    stringBuffer.append("'");
                    stringBuffer.append((String) it.next());
                    stringBuffer.append("',");
                }
                Cursor o2 = ((C93834f) dVar2.f290993f).mo128798o(String.format("SELECT MessageCount(%d, aux_index) FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND aux_index IN (%s) AND status >= 0;", new Object[]{Integer.valueOf(arrayList2.size()), dVar2.mo138611l(), dVar2.mo138609j(), dVar2.mo138611l(), dVar2.mo138609j(), dVar2.mo138609j(), d, stringBuffer.substring(0, stringBuffer.length() - 1)}), (String[]) null);
                HashMap hashMap = new HashMap();
                CursorWrapper cursorWrapper2 = (CursorWrapper) o2;
                if (cursorWrapper2.moveToNext()) {
                    String[] split = cursorWrapper2.getString(0).split(" ");
                    for (int i2 = 0; i2 < split.length; i2 += 2) {
                        hashMap.put(split[i2], Integer.valueOf(Util.getInt(split[i2 + 1], 0)));
                    }
                }
                ((C93824b) o2).close();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C93893a aVar2 = (C93893a) it4.next();
                    C99681n nVar = new C99681n();
                    nVar.f292148b = aVar2.f270971a;
                    nVar.f292149c = aVar2.f270972b;
                    nVar.f292150d = aVar2.f270973c;
                    String str = aVar2.f270974d;
                    nVar.f292151e = str;
                    nVar.f292152f = aVar2.f270975e;
                    int intValue = hashMap.containsKey(str) ? ((Integer) hashMap.get(nVar.f292151e)).intValue() : 1;
                    if (C72996z1.m85808L4(nVar.f292151e)) {
                        intValue = 0;
                    }
                    nVar.f292161o = Integer.valueOf(intValue);
                    lVar2.f32076e.add(nVar);
                }
                mo139040h("findCount");
            }
            if (lVar2.f32075d.f292123d.length > 1 && lVar2.f32076e.size() <= 3) {
                Cursor C = ((C101467b) ((C99260q) C86312j.m106911c(C99260q.class)).db0(3)).mo140967C(C99672i.m130094a(lVar2.f32075d.f292123d[0], true), (String) null, C99249c.f291011i, C99249c.f291013k);
                if (((CursorWrapper) C).moveToNext()) {
                    C99681n nVar2 = new C99681n();
                    nVar2.f292151e = "create_talker_message​";
                    lVar2.f32076e.add(nVar2);
                }
                ((C93824b) C).close();
                mo139040h("findTalkerConversation");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$j */
    public class C93894j extends C99678j {
        public C93894j(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 28;
        }

        public String getName() {
            return "SearchTalkerMessageTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            mo139040h(IXWebBroadcastListener.STAGE_START);
            lVar.f32075d = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchMessageLogic.this.f270944q);
            C99672i a = C99672i.m130094a(this.f292133j.f224470e, true);
            HashMap hashMap = new HashMap();
            Cursor C = ((C101467b) ((C99260q) C86312j.m106911c(C99260q.class)).db0(3)).mo140967C(a, (String) null, C99249c.f291011i, C99249c.f291013k);
            do {
                CursorWrapper cursorWrapper = (CursorWrapper) C;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                C99682o oVar = new C99682o();
                oVar.f292151e = cursorWrapper.getString(0);
                oVar.f292148b = cursorWrapper.getInt(1);
                oVar.f292149c = cursorWrapper.getInt(2);
                oVar.f292168v = a;
                oVar.f292161o = 1;
                if (!hashMap.containsKey(oVar.f292151e)) {
                    hashMap.put(oVar.f292151e, oVar);
                }
            } while (hashMap.size() <= 100);
            ((C93824b) C).close();
            mo139040h("findHitContact");
            Cursor B = FTS5SearchMessageLogic.this.f270937g.mo140971B(lVar.f32075d, (String) null, hashMap.keySet());
            HashMap hashMap2 = new HashMap();
            while (((CursorWrapper) B).moveToNext()) {
                C99682o oVar2 = new C99682o();
                oVar2.mo139051d(B);
                oVar2.f292168v = lVar.f32075d;
                oVar2.f292161o = 1;
                HashMap hashMap3 = hashMap2.containsKey(oVar2.f292153g) ? (HashMap) hashMap2.get(oVar2.f292153g) : new HashMap();
                if (hashMap3.containsKey(oVar2.f292151e)) {
                    C99681n nVar = (C99681n) hashMap3.get(oVar2.f292151e);
                    int intValue = ((Integer) nVar.f292161o).intValue() + 1;
                    if (nVar.f292152f < oVar2.f292152f) {
                        oVar2.f292161o = Integer.valueOf(intValue);
                        hashMap3.put(oVar2.f292151e, oVar2);
                    } else {
                        nVar.f292161o = Integer.valueOf(intValue);
                        hashMap3.put(nVar.f292151e, nVar);
                    }
                } else {
                    hashMap3.put(oVar2.f292151e, oVar2);
                }
                hashMap2.put(oVar2.f292153g, hashMap3);
            }
            ((C93824b) B).close();
            lVar.f32076e = new ArrayList();
            for (C99681n nVar2 : hashMap.values()) {
                if (hashMap2.containsKey(nVar2.f292151e)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(((HashMap) hashMap2.get(nVar2.f292151e)).values());
                    Collections.sort(arrayList, this.f292133j.f224477l);
                    nVar2.f292161o = arrayList;
                    nVar2.f292152f = ((C99681n) arrayList.get(0)).f292152f;
                    lVar.f32076e.add(nVar2);
                }
            }
            Collections.sort(lVar.f32076e, this.f292133j.f224477l);
            mo139040h("findHitMessage");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$k */
    public class C93895k extends C99678j {

        /* renamed from: p */
        public int f270977p = 0;

        /* renamed from: q */
        public int f270978q = 0;

        public C93895k(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{totalMsgCount: %d conversationCount: %d}", new Object[]{Integer.valueOf(this.f270977p), Integer.valueOf(this.f270978q)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 15;
        }

        public String getName() {
            return "SearchTopGroupMessageTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            String str;
            mo139040h(IXWebBroadcastListener.STAGE_START);
            C99672i b = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchMessageLogic.this.f270944q);
            lVar.f32075d = b;
            C101470d dVar = FTS5SearchMessageLogic.this.f270937g;
            int i = this.f292133j.f224474i;
            dVar.getClass();
            String d = b.mo139044d();
            if (i != Integer.MAX_VALUE) {
                str = " LIMIT " + (i + 1);
            } else {
                str = "";
            }
            Cursor o = ((C93834f) dVar.f290993f).mo128798o(String.format("SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0 GROUP BY aux_index ORDER BY timestamp desc" + str + ";", new Object[]{dVar.mo138611l(), dVar.mo138609j(), dVar.mo138611l(), dVar.mo138609j(), dVar.mo138609j(), d}), (String[]) null);
            lVar.f32076e = new LinkedList();
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                C99681n nVar = new C99681n();
                nVar.f292148b = cursorWrapper.getInt(0);
                nVar.f292149c = cursorWrapper.getInt(1);
                nVar.f292150d = cursorWrapper.getLong(2);
                nVar.f292151e = cursorWrapper.getString(3);
                nVar.f292152f = cursorWrapper.getLong(4);
                int i2 = cursorWrapper.getInt(5);
                if (i2 == 1 && C72996z1.m85808L4(nVar.f292151e)) {
                    i2 = 0;
                }
                nVar.f292161o = Integer.valueOf(i2);
                lVar.f32076e.add(nVar);
                this.f270977p += ((Integer) nVar.f292161o).intValue();
                this.f270978q++;
            }
            ((C93824b) o).close();
            mo139040h("groupMessage");
            String[] strArr = lVar.f32075d.f292123d;
            if (strArr.length > 1) {
                Cursor C = ((C101467b) ((C99260q) C86312j.m106911c(C99260q.class)).db0(3)).mo140967C(C99672i.m130094a(strArr[0], true), (String) null, C99249c.f291011i, C99249c.f291013k);
                if (((CursorWrapper) C).moveToNext()) {
                    C99681n nVar2 = new C99681n();
                    nVar2.f292151e = "create_talker_message​";
                    lVar.f32076e.add(0, nVar2);
                }
                ((C93824b) C).close();
                mo139040h("findTalkerConversation");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$l */
    public class C93896l extends C99678j {
        public C93896l(C76728k kVar) {
            super(kVar);
        }

        public String getName() {
            return "SearchTypeMessage";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            String str;
            mo139040h(IXWebBroadcastListener.STAGE_START);
            lVar.f32076e = new LinkedList();
            C101470d dVar = FTS5SearchMessageLogic.this.f270937g;
            C76728k kVar = this.f292133j;
            int[] iArr = kVar.f224473h;
            String str2 = kVar.f224469d;
            dVar.getClass();
            if (Util.isNullOrNil(str2)) {
                str = "";
            } else {
                str = "AND aux_index = " + str2;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int append : iArr) {
                stringBuffer.append(append);
                stringBuffer.append(",");
            }
            Cursor o = ((C93834f) dVar.f290993f).mo128798o(String.format("SELECT type, subtype, entity_id, aux_index, timestamp, talker FROM %s WHERE subtype IN (%s) %s AND status >= 0 ORDER BY timestamp desc;", new Object[]{dVar.mo138611l(), stringBuffer.substring(0, stringBuffer.length() - 1), str}), (String[]) null);
            while (true) {
                CursorWrapper cursorWrapper = (CursorWrapper) o;
                if (cursorWrapper.moveToNext()) {
                    C99681n nVar = new C99681n();
                    nVar.f292148b = cursorWrapper.getInt(0);
                    nVar.f292149c = cursorWrapper.getInt(1);
                    nVar.f292150d = cursorWrapper.getLong(2);
                    nVar.f292151e = cursorWrapper.getString(3);
                    nVar.f292152f = cursorWrapper.getLong(4);
                    nVar.f292153g = cursorWrapper.getString(5);
                    lVar.f32076e.add(nVar);
                } else {
                    ((C93824b) o).close();
                    return;
                }
            }
        }
    }

    public FTS5SearchMessageLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f270939i = new IListener<RevokeNativeMsgEvent>(fVar) {
            {
                this.__eventId = 690552614;
            }

            public boolean callback(IEvent iEvent) {
                RevokeNativeMsgEvent revokeNativeMsgEvent = (RevokeNativeMsgEvent) iEvent;
                if (!(revokeNativeMsgEvent instanceof RevokeNativeMsgEvent)) {
                    return false;
                }
                FTS5SearchMessageLogic fTS5SearchMessageLogic = FTS5SearchMessageLogic.this;
                ((C93836i) fTS5SearchMessageLogic.f270935e).mo128803c(65576, new C93887d(revokeNativeMsgEvent.f78950d.f78951a));
                return false;
            }
        };
        this.f270940j = new IListener<RevokeMsgEvent>(fVar) {
            {
                this.__eventId = 675629679;
            }

            public boolean callback(IEvent iEvent) {
                RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
                if (!(revokeMsgEvent instanceof RevokeMsgEvent)) {
                    return false;
                }
                FTS5SearchMessageLogic fTS5SearchMessageLogic = FTS5SearchMessageLogic.this;
                ((C93836i) fTS5SearchMessageLogic.f270935e).mo128803c(65576, new C93887d(revokeMsgEvent.f78943d.f78944a));
                return false;
            }
        };
        this.f270941n = new IListener<ShouldRescanMessagesEvent>(fVar) {
            {
                this.__eventId = -224286085;
            }

            public boolean callback(IEvent iEvent) {
                ShouldRescanMessagesEvent shouldRescanMessagesEvent = (ShouldRescanMessagesEvent) iEvent;
                ((C93836i) FTS5SearchMessageLogic.this.f270935e).mo128803c(65574, new C93917d(this));
                return false;
            }
        };
        this.f270942o = new IListener<ActivateEvent>(fVar) {
            {
                this.__eventId = -1435144905;
            }

            public boolean callback(IEvent iEvent) {
                ActivateEvent activateEvent = (ActivateEvent) iEvent;
                Log.m105925i("MicroMsg.FTS.FTS5SearchMessageLogic", "backgroundIndexListener %s", Boolean.valueOf(activateEvent.f78706d.f78707a));
                if (!activateEvent.f78706d.f78707a) {
                    FTS5SearchMessageLogic.this.f270943p.startTimer(60000);
                } else {
                    FTS5SearchMessageLogic.this.f270943p.stopTimer();
                }
                return false;
            }
        };
        this.f270943p = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C93884a(), false);
        this.f270944q = new C93885b(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        if ((r1 == 48) == false) goto L_0x005d;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m118599c(com.tencent.p014mm.plugin.fts.logic.FTS5SearchMessageLogic r4, com.tencent.p014mm.plugin.fts.logic.FTS5SearchMessageLogic.C93889f r5) {
        /*
            r4.getClass()
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L_0x005d
            java.lang.String r1 = r5.f270960b
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x005d
            java.lang.String r1 = r5.f270962d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0018
            goto L_0x005d
        L_0x0018:
            java.lang.String r1 = r5.f270960b
            java.lang.String r2 = "@bottle"
            boolean r1 = r1.endsWith(r2)
            if (r1 == 0) goto L_0x0023
            goto L_0x005d
        L_0x0023:
            java.lang.String r1 = r5.f270960b
            boolean r1 = com.tencent.p014mm.storage.C72996z1.m85812O4(r1)
            if (r1 == 0) goto L_0x002c
            goto L_0x005d
        L_0x002c:
            int r1 = r5.f270963e
            if (r1 == r4) goto L_0x0038
            r2 = 1107296305(0x42000031, float:32.000187)
            if (r1 != r2) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = 0
            goto L_0x0039
        L_0x0038:
            r2 = 1
        L_0x0039:
            if (r2 != 0) goto L_0x0052
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 49
            if (r2 != r3) goto L_0x0045
            r2 = 1
            goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            if (r2 != 0) goto L_0x0052
            r2 = 48
            if (r1 != r2) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 != 0) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            java.lang.String r5 = r5.f270960b
            java.lang.String r1 = "msginfo@fakeuser"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x005e
        L_0x005d:
            r4 = 0
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fts.logic.FTS5SearchMessageLogic.m118599c(com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic, com.tencent.mm.plugin.fts.logic.FTS5SearchMessageLogic$f):boolean");
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Success!");
        this.f270937g = (C101470d) ((C99260q) C86312j.m106911c(cls)).db0(4);
        this.f270935e = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        this.f270936f = ((C99260q) C86312j.m106911c(cls)).mo128761xc();
        this.f270942o.alive();
        this.f270941n.alive();
        this.f270940j.alive();
        this.f270939i.alive();
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this, (Looper) null);
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this);
        this.f270942o.dead();
        this.f270941n.dead();
        this.f270940j.dead();
        this.f270939i.dead();
        this.f270937g = null;
        this.f270935e = null;
        this.f270943p.stopTimer();
        return true;
    }

    /* renamed from: d */
    public void mo128828d(int i) {
        Log.m105925i("MicroMsg.FTS.FTS5SearchMessageLogic", "triggerBuildMessageIndex %s %s", Boolean.valueOf(this.f270938h), Integer.valueOf(i));
        if (!this.f270938h) {
            this.f270938h = true;
            C76636p pVar = this.f270935e;
            if (pVar != null) {
                ((C93836i) pVar).mo128803c(131112, new C93886c((C938811) null));
            }
        }
    }

    public String getName() {
        return "FTS5SearchMessageLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        C99664b bVar;
        if (kVar.f224475j == null) {
            kVar.f224475j = new HashSet<>();
        }
        kVar.f224475j.add("msginfo@fakeuser");
        int i = kVar.f224467b;
        if (i != 1) {
            bVar = i != 3 ? i != 256 ? i != 10 ? i != 11 ? new C93895k(kVar) : new C93890g(kVar) : new C93894j(kVar) : new C93896l(kVar) : new C93891h(kVar);
        } else {
            C99252h.C99253a aVar = C99252h.f291029b;
            Log.m105925i("MicroMsg.FTS.FTS5SearchMessageLogic", "total message count %d", Long.valueOf(aVar.f291036d));
            bVar = aVar.f291036d >= TimeUtil.SECOND_TO_US ? new C93892i(kVar) : new C93895k(kVar);
        }
        return ((C93836i) this.f270935e).mo128803c(-65536, bVar);
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        if (!CrashReportFactory.isBackupMerge() && eVar.f123845b.equals("insert")) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < eVar.f123846c.size(); i++) {
                C72963f4 f4Var = eVar.f123846c.get(i);
                boolean z = true;
                if (f4Var == null || Util.isNullOrNil(f4Var.mo108768t()) || Util.isNullOrNil(f4Var.getContent()) || f4Var.mo108768t().contains("@bottle") || C72996z1.m85812O4(f4Var.mo108768t()) || ((f4Var.getType() != 1 && f4Var.getType() != 1107296305 && !f4Var.mo101020w3() && !f4Var.mo100982U3()) || f4Var.mo108768t().equals("msginfo@fakeuser"))) {
                    z = false;
                }
                if (z) {
                    arrayList.add(f4Var);
                }
            }
            if (arrayList.size() > 0) {
                ((C93836i) this.f270935e).mo128803c(65576, new C93888e(arrayList));
            }
        }
    }
}
