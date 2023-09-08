package com.tencent.p014mm.plugin.fts.logic;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.Looper;
import android.util.Pair;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.autogen.events.ShouldRescanMessagesEvent;
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
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C30757l4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import h81.C32735h;
import ie3.C98668e;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kv1.C61172m;
import kv1.C76636p;
import kv1.C99248b;
import kv1.C99249c;
import kv1.C99251g;
import kv1.C99260q;
import lv1.C10656l;
import lv1.C76728k;
import lv1.C99664b;
import lv1.C99672i;
import lv1.C99678j;
import lv1.C99681n;
import lv1.C99682o;
import rv1.C101472f;
import u90.C78140c;

/* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic */
public class FTS5SearchServiceNotifyLogic extends C99248b implements C75875l.C75877b {

    /* renamed from: e */
    public C76636p f270981e;

    /* renamed from: f */
    public C61172m f270982f;

    /* renamed from: g */
    public C101472f f270983g;

    /* renamed from: h */
    public boolean f270984h = false;

    /* renamed from: i */
    public IListener f270985i;

    /* renamed from: j */
    public IListener f270986j;

    /* renamed from: n */
    public MTimerHandler f270987n;

    /* renamed from: o */
    public C99672i.C99674b f270988o;

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$a */
    public class C93898a implements MTimerHandler.CallBack {
        public C93898a() {
        }

        public boolean onTimerExpired() {
            FTS5SearchServiceNotifyLogic fTS5SearchServiceNotifyLogic = FTS5SearchServiceNotifyLogic.this;
            if (!fTS5SearchServiceNotifyLogic.f270984h) {
                fTS5SearchServiceNotifyLogic.f270984h = true;
                C76636p pVar = fTS5SearchServiceNotifyLogic.f270981e;
                if (pVar != null) {
                    ((C93836i) pVar).mo128803c(131112, new C93900c((C938971) null));
                }
            }
            FTS5SearchServiceNotifyLogic.this.f270986j.dead();
            return false;
        }

        public String toString() {
            return super.toString() + "|mBackgroundTimer";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$b */
    public class C93899b implements C99672i.C99674b {
        public C93899b(FTS5SearchServiceNotifyLogic fTS5SearchServiceNotifyLogic) {
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

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$c */
    public class C93900c extends C99664b {

        /* renamed from: j */
        public HashSet<Pair<Long, Long>> f270991j = null;

        /* renamed from: n */
        public ArrayList<Long> f270992n = null;

        /* renamed from: o */
        public long f270993o = MAlarmHandler.NEXT_FIRE_INTERVAL;

        /* renamed from: p */
        public long f270994p = -1;

        /* renamed from: q */
        public int f270995q = 0;

        /* renamed from: r */
        public int f270996r = 0;

        /* renamed from: s */
        public int f270997s = 0;

        /* renamed from: t */
        public int f270998t = 0;

        public C93900c(C938971 r2) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            int i;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_close_wxpay_search_recreate, false)) {
                Log.m105924i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "BuildServiceNotifyIndexTask is disable by abtest");
                return false;
            }
            this.f270993o = ((C93834f) FTS5SearchServiceNotifyLogic.this.f270983g.f290993f).mo128794k(-201, MAlarmHandler.NEXT_FIRE_INTERVAL);
            this.f270994p = ((C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX()).mo101184jo("");
            int i2 = 1;
            Log.m105925i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Start building service notify index, last createTime: %s last from createTime: %s", Long.valueOf(this.f270993o), Long.valueOf(this.f270994p));
            if (this.f270991j == null) {
                this.f270991j = new HashSet<>();
                this.f270992n = new ArrayList<>();
                Cursor x = FTS5SearchServiceNotifyLogic.this.f270983g.mo138624x(C99249c.f291007e, true, true, false, true, true);
                while (x.moveToNext()) {
                    long j = x.getLong(0);
                    long j2 = x.getLong(1);
                    long j3 = x.getLong(2);
                    if (x.getInt(3) == -1) {
                        this.f270992n.add(Long.valueOf(j));
                    } else if (j3 <= this.f270993o) {
                        this.f270991j.add(new Pair(Long.valueOf(j2), Long.valueOf(j3)));
                    }
                }
                x.close();
            }
            if (!Thread.interrupted()) {
                int i3 = Integer.MAX_VALUE;
                String[] strArr = new String[3];
                ArrayList arrayList = new ArrayList();
                while (true) {
                    int i4 = 4;
                    if (i3 >= 50) {
                        strArr[0] = Long.toString(this.f270993o);
                        strArr[i2] = Long.toString(this.f270994p);
                        strArr[2] = Integer.toString(this.f270995q);
                        ((C68985g) FTS5SearchServiceNotifyLogic.this.f270982f).getClass();
                        C86709a0.m107528h();
                        Cursor rawQuery = C86709a0.m107535s().f251811i.rawQuery("SELECT msgId, createTime, content, type, isSend, talker FROM message WHERE (talker = 'notifymessage' OR talker = 'gh_3dfda90e39d6') AND createTime<=? AND createTime>? ORDER BY createTime DESC, msgId DESC LIMIT 50 OFFSET ?;", strArr);
                        long j4 = 0;
                        int i5 = 0;
                        while (rawQuery.moveToNext()) {
                            C93904g gVar = new C93904g(FTS5SearchServiceNotifyLogic.this, (C938971) null);
                            gVar.f271007a = rawQuery.getLong(0);
                            gVar.f271009c = rawQuery.getLong(i2);
                            gVar.f271010d = rawQuery.getString(2);
                            rawQuery.getInt(3);
                            rawQuery.getInt(4);
                            String string = rawQuery.getString(5);
                            gVar.f271008b = string;
                            if ("gh_3dfda90e39d6".equals(string)) {
                                gVar.f271011e = 57;
                            } else if ("notifymessage".equals(gVar.f271008b)) {
                                gVar.f271011e = 56;
                            }
                            gVar.mo128834a();
                            if (Util.isNullOrNil(gVar.f271012f) ^ i2) {
                                arrayList.add(gVar);
                            }
                            j4 = gVar.f271009c;
                            i5++;
                        }
                        rawQuery.close();
                        if (!Thread.interrupted()) {
                            int size = arrayList.size();
                            if (size == 0) {
                                Object[] objArr = new Object[2];
                                objArr[0] = Integer.valueOf(size);
                                objArr[i2] = Integer.valueOf(this.f270995q);
                                Log.m105925i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "build msgRecList size %d offset %s", objArr);
                                i = i5;
                            } else {
                                Object[] objArr2 = new Object[6];
                                objArr2[0] = Integer.valueOf(size);
                                objArr2[i2] = Long.valueOf(((C93904g) arrayList.get(0)).f271007a);
                                int i6 = size - 1;
                                i = i5;
                                objArr2[2] = Long.valueOf(((C93904g) arrayList.get(i6)).f271007a);
                                objArr2[3] = C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, ((C93904g) arrayList.get(0)).f271009c / 1000);
                                objArr2[4] = C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, ((C93904g) arrayList.get(i6)).f271009c / 1000);
                                objArr2[5] = Integer.valueOf(this.f270995q);
                                Log.m105925i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "build msgRecList size %d Id FROM %d to %d Time FROM %s to %s offset %s", objArr2);
                            }
                            if (size > 0) {
                                FTS5SearchServiceNotifyLogic.this.f270983g.mo138598a();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    C93904g gVar2 = (C93904g) it.next();
                                    long j5 = gVar2.f271007a;
                                    long j6 = gVar2.f271009c;
                                    if (j6 == this.f270993o) {
                                        this.f270995q++;
                                    } else {
                                        this.f270993o = j6;
                                        this.f270995q = 0;
                                    }
                                    if (!this.f270991j.remove(new Pair(Long.valueOf(j5), Long.valueOf(j6)))) {
                                        try {
                                            FTS5SearchServiceNotifyLogic.this.f270983g.mo140973A(524288, gVar2.f271011e, j5, Util.nullAsNil(gVar2.f271008b), j6, Util.nullAsNil(gVar2.f271012f), Util.nullAsNil(gVar2.f271013g));
                                            this.f270996r++;
                                        } catch (Exception e) {
                                            Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", e, "Build message index failed with exception. \n%s", gVar2.f271012f);
                                            this.f270998t++;
                                        }
                                    }
                                }
                                FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
                                FTS5SearchServiceNotifyLogic.this.f270983g.mo138626z(-201, this.f270993o);
                            } else {
                                this.f270993o = j4;
                                this.f270995q = 0;
                            }
                            arrayList.clear();
                            if (!Thread.interrupted()) {
                                i3 = i;
                                i2 = 1;
                            } else {
                                throw new InterruptedException();
                            }
                        } else {
                            throw new InterruptedException();
                        }
                    } else {
                        Iterator<Pair<Long, Long>> it4 = this.f270991j.iterator();
                        int i7 = 50;
                        while (it4.hasNext()) {
                            if (!Thread.interrupted()) {
                                if (i7 >= 50) {
                                    FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
                                    FTS5SearchServiceNotifyLogic.this.f270983g.mo138598a();
                                    i7 = 0;
                                }
                                Pair next = it4.next();
                                C101472f fVar = FTS5SearchServiceNotifyLogic.this.f270983g;
                                int[] iArr = C99249c.f291007e;
                                long longValue = ((Long) next.first).longValue();
                                long longValue2 = ((Long) next.second).longValue();
                                fVar.getClass();
                                ArrayList arrayList2 = new ArrayList(i4);
                                Cursor o = ((C93834f) fVar.f290993f).mo128798o(String.format("SELECT docid FROM %s WHERE type IN " + C99251g.m129291l(iArr) + " AND entity_id=? AND timestamp=?;", new Object[]{fVar.mo138611l()}), new String[]{Long.toString(longValue), Long.toString(longValue2)});
                                while (true) {
                                    CursorWrapper cursorWrapper = (CursorWrapper) o;
                                    if (!cursorWrapper.moveToNext()) {
                                        break;
                                    }
                                    arrayList2.add(Long.valueOf(cursorWrapper.getLong(0)));
                                }
                                ((C93824b) o).close();
                                fVar.mo138606g(arrayList2);
                                i7++;
                                this.f270997s++;
                                it4.remove();
                                i4 = 4;
                            } else {
                                FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
                                throw new InterruptedException();
                            }
                        }
                        FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
                        ArrayList<Long> arrayList3 = this.f270992n;
                        ListIterator<Long> listIterator = arrayList3.listIterator(arrayList3.size());
                        int i8 = 50;
                        while (listIterator.hasPrevious()) {
                            if (!Thread.interrupted()) {
                                if (i8 >= 50) {
                                    FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
                                    FTS5SearchServiceNotifyLogic.this.f270983g.mo138598a();
                                    i8 = 0;
                                }
                                FTS5SearchServiceNotifyLogic.this.f270983g.mo138605f(listIterator.previous().longValue());
                                i8++;
                                this.f270997s++;
                                listIterator.remove();
                            } else {
                                FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
                                throw new InterruptedException();
                            }
                        }
                        FTS5SearchServiceNotifyLogic.this.f270983g.mo138626z(-201, this.f270993o - 1);
                        FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
                        FTS5SearchServiceNotifyLogic.this.f270984h = false;
                        return true;
                    }
                }
            } else {
                throw new InterruptedException();
            }
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{new: %d removed: %d failed: %d}", new Object[]{Integer.valueOf(this.f270996r), Integer.valueOf(this.f270997s), Integer.valueOf(this.f270998t)});
        }

        /* renamed from: e */
        public int mo128768e() {
            return 31;
        }

        public String getName() {
            return "BuildServiceNotifyIndexTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$d */
    public class C93901d extends C99664b {
        public C93901d(C938971 r2) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            FTS5SearchServiceNotifyLogic.this.f270983g.mo138604e(C99249c.f291007e);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{mCount: %d}", new Object[]{0});
        }

        public String getName() {
            return "DeleteAllServiceNotifyMsgTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$e */
    public class C93902e extends C99664b {

        /* renamed from: j */
        public long f271001j;

        public C93902e(long j) {
            this.f271001j = j;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            FTS5SearchServiceNotifyLogic.this.f270983g.mo138607h(C99249c.f291007e, this.f271001j);
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return String.format("{MsgId: %d}", new Object[]{Long.valueOf(this.f271001j)});
        }

        public String getName() {
            return "DeleteServiceNotifyMsgTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$f */
    public class C93903f extends C99664b {

        /* renamed from: j */
        public List<C72963f4> f271003j;

        /* renamed from: n */
        public StringBuffer f271004n = new StringBuffer();

        /* renamed from: o */
        public String f271005o;

        public C93903f(List<C72963f4> list, String str) {
            ArrayList arrayList = new ArrayList();
            this.f271003j = arrayList;
            arrayList.addAll(list);
            this.f271005o = str;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.f271003j).iterator();
            while (it.hasNext()) {
                C72963f4 f4Var = (C72963f4) it.next();
                C93904g gVar = new C93904g(FTS5SearchServiceNotifyLogic.this, (C938971) null);
                String str = this.f271005o;
                gVar.f271007a = f4Var.getMsgId();
                gVar.f271009c = f4Var.getCreateTime();
                gVar.f271010d = f4Var.getContent();
                if (Util.isNullOrNil(str)) {
                    gVar.f271008b = f4Var.mo108768t();
                } else {
                    gVar.f271008b = str;
                }
                gVar.mo128834a();
                if (!Util.isNullOrNil(gVar.f271012f)) {
                    arrayList.add(gVar);
                }
            }
            this.f271004n.append("{MsgId: ");
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C93904g gVar2 = (C93904g) it4.next();
                this.f271004n.append(gVar2.f271007a);
                this.f271004n.append(",");
                this.f271004n.append(gVar2.f271008b);
                this.f271004n.append(",");
                this.f271004n.append(gVar2.f271009c);
                this.f271004n.append(" ");
            }
            this.f271004n.append("count: ");
            this.f271004n.append(arrayList.size());
            this.f271004n.append("}");
            if (arrayList.size() > 0) {
                FTS5SearchServiceNotifyLogic.this.f270983g.mo138598a();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    C93904g gVar3 = (C93904g) it5.next();
                    FTS5SearchServiceNotifyLogic.this.f270983g.mo140973A(524288, gVar3.f271011e, gVar3.f271007a, gVar3.f271008b, gVar3.f271009c, gVar3.f271012f, gVar3.f271013g);
                }
                FTS5SearchServiceNotifyLogic.this.f270983g.mo138600c();
            }
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return this.f271004n.toString();
        }

        public String getName() {
            return "InsertServiceNotifyMsgTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$g */
    public class C93904g {

        /* renamed from: a */
        public long f271007a;

        /* renamed from: b */
        public String f271008b;

        /* renamed from: c */
        public long f271009c;

        /* renamed from: d */
        public String f271010d;

        /* renamed from: e */
        public int f271011e;

        /* renamed from: f */
        public String f271012f;

        /* renamed from: g */
        public String f271013g;

        public C93904g(FTS5SearchServiceNotifyLogic fTS5SearchServiceNotifyLogic, C938971 r2) {
        }

        /* renamed from: a */
        public void mo128834a() {
            if ("gh_3dfda90e39d6".equals(this.f271008b)) {
                this.f271011e = 57;
                String str = this.f271010d;
                this.f271012f = str;
                if (!Util.isNullOrNil(str)) {
                    C98668e a = C98668e.m128295a(this.f271012f);
                    this.f271013g = a.f289286a;
                    StringBuilder sb = new StringBuilder();
                    if (a.f289287b == 0) {
                        sb.append(a.f289290e);
                        sb.append(" ");
                        sb.append(a.f289288c);
                        sb.append(" ");
                    } else {
                        sb.append(a.f289289d);
                        sb.append(" ");
                        if (!a.f289292g) {
                            sb.append(a.f289290e);
                            sb.append(" ");
                            sb.append(a.f289291f);
                            sb.append(" ");
                        }
                        sb.append(a.f289294i);
                        sb.append(" ");
                        sb.append(a.f289295j);
                        sb.append(" ");
                        sb.append(a.f289296k);
                        sb.append(" ");
                        List<C98668e.C98669a> list = a.f289297l;
                        if (list != null) {
                            Iterator it = ((ArrayList) list).iterator();
                            while (it.hasNext()) {
                                C98668e.C98669a aVar = (C98668e.C98669a) it.next();
                                aVar.getClass();
                                sb.append(aVar.f289299b);
                                sb.append(" ");
                            }
                        }
                    }
                    this.f271012f = sb.toString();
                }
            } else {
                this.f271008b = "notifymessage";
                this.f271011e = 56;
                String str2 = this.f271010d;
                this.f271012f = str2;
                this.f271013g = C93908k.m118649a(str2).f271018a;
                if (!Util.isNullOrNil(this.f271012f)) {
                    C93908k a2 = C93908k.m118649a(this.f271012f);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(a2.f271019b);
                    sb4.append(" ");
                    List<C93908k.C93909a> list2 = a2.f271020c;
                    if (list2 != null) {
                        Iterator it4 = ((ArrayList) list2).iterator();
                        while (it4.hasNext()) {
                            sb4.append(((C93908k.C93909a) it4.next()).f271021a);
                            sb4.append(" ");
                        }
                    }
                    this.f271012f = sb4.toString();
                }
            }
            this.f271010d = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$h */
    public class C93905h extends C99678j {

        /* renamed from: p */
        public boolean f271014p;

        public C93905h(C76728k kVar, boolean z) {
            super(kVar);
            this.f271014p = z;
        }

        /* renamed from: e */
        public int mo128768e() {
            return 34;
        }

        public String getName() {
            return "SearchMessageTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            Closeable closeable;
            CursorWrapper cursorWrapper;
            mo139040h(IXWebBroadcastListener.STAGE_START);
            C99672i b = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchServiceNotifyLogic.this.f270988o);
            lVar.f32075d = b;
            if (this.f271014p) {
                C101472f fVar = FTS5SearchServiceNotifyLogic.this.f270983g;
                String str = this.f292133j.f224469d;
                fVar.getClass();
                String d = b.mo139044d();
                String l = fVar.mo138611l();
                String j = fVar.mo138609j();
                closeable = ((C93834f) fVar.f290993f).mo128798o("SELECT " + l + ".docid, type, subtype, entity_id, aux_index, timestamp, talker FROM " + l + " JOIN " + j + " ON (" + l + ".docid = " + j + ".rowid)" + " WHERE " + j + " MATCH '" + d + "' AND aux_index = '" + str + "' AND status >= 0 " + "ORDER BY timestamp desc;", (String[]) null);
            } else {
                closeable = FTS5SearchServiceNotifyLogic.this.f270983g.mo140974B(b, this.f292133j.f224469d);
            }
            Closeable closeable2 = closeable;
            do {
                cursorWrapper = (CursorWrapper) closeable2;
                if (!cursorWrapper.moveToNext()) {
                    break;
                }
                C99682o oVar = new C99682o();
                oVar.mo139051d(cursorWrapper);
                oVar.f292161o = 1;
                lVar.f32076e.add(oVar);
                closeable2 = cursorWrapper;
            } while (lVar.f32076e.size() <= 100);
            cursorWrapper.close();
            Collections.sort(lVar.f32076e, this.f292133j.f224477l);
            mo139040h("findMessage");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$i */
    public class C93906i extends C99678j {
        public C93906i(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 32;
        }

        public String getName() {
            return "SearchSenderAndMessageTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            mo139040h(IXWebBroadcastListener.STAGE_START);
            C99672i b = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchServiceNotifyLogic.this.f270988o);
            lVar.f32075d = b;
            FTS5SearchServiceNotifyLogic.this.f270983g.getClass();
            Cursor qq = ((C30757l4) ((C78140c) C86312j.m106911c(C78140c.class)).ab0()).mo57665qq(b.f292120a);
            if (qq != null) {
                try {
                    qq.moveToFirst();
                    while (!qq.isAfterLast()) {
                        C99681n nVar = new C99681n();
                        nVar.f292154h = qq.getString(0);
                        nVar.f292151e = qq.getString(1);
                        nVar.f292161o = Integer.valueOf(qq.getInt(2));
                        nVar.f292149c = 55;
                        lVar.f32076e.add(nVar);
                        qq.moveToNext();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", e, "", new Object[0]);
                } catch (Throwable th) {
                    qq.close();
                    throw th;
                }
                qq.close();
                Cursor B = FTS5SearchServiceNotifyLogic.this.f270983g.mo140974B(lVar.f32075d, this.f292133j.f224469d);
                ArrayList arrayList = new ArrayList();
                while (((CursorWrapper) B).moveToNext()) {
                    C99682o oVar = new C99682o();
                    oVar.mo139051d(B);
                    oVar.f292161o = 1;
                    arrayList.add(oVar);
                    if (arrayList.size() > 100) {
                        break;
                    }
                }
                ((C93824b) B).close();
                Collections.sort(arrayList, this.f292133j.f224477l);
                lVar.f32076e.addAll(arrayList);
                mo139040h("findSenderAndMessage");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$j */
    public class C93907j extends C99678j {
        public C93907j(C76728k kVar) {
            super(kVar);
        }

        /* renamed from: e */
        public int mo128768e() {
            return 33;
        }

        public String getName() {
            return "SearchSenderTask";
        }

        /* renamed from: i */
        public void mo128820i(C10656l lVar) {
            mo139040h(IXWebBroadcastListener.STAGE_START);
            C99672i b = C99672i.m130095b(this.f292133j.f224468c, false, FTS5SearchServiceNotifyLogic.this.f270988o);
            lVar.f32075d = b;
            FTS5SearchServiceNotifyLogic.this.f270983g.getClass();
            Cursor qq = ((C30757l4) ((C78140c) C86312j.m106911c(C78140c.class)).ab0()).mo57665qq(b.f292120a);
            if (qq != null) {
                try {
                    qq.moveToFirst();
                    while (!qq.isAfterLast()) {
                        C99681n nVar = new C99681n();
                        nVar.f292154h = qq.getString(0);
                        nVar.f292151e = qq.getString(1);
                        nVar.f292161o = Integer.valueOf(qq.getInt(2));
                        nVar.f292149c = 55;
                        lVar.f32076e.add(nVar);
                        qq.moveToNext();
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", e, "", new Object[0]);
                } catch (Throwable th) {
                    qq.close();
                    throw th;
                }
                qq.close();
                Collections.sort(lVar.f32076e, this.f292133j.f224477l);
                mo139040h("findSender");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$k */
    public static final class C93908k {

        /* renamed from: a */
        public String f271018a;

        /* renamed from: b */
        public String f271019b;

        /* renamed from: c */
        public List<C93909a> f271020c = new ArrayList();

        /* renamed from: com.tencent.mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic$k$a */
        public static final class C93909a {

            /* renamed from: a */
            public String f271021a;
        }

        /* renamed from: a */
        public static C93908k m118649a(String str) {
            Map<String, String> parseXml = XmlParser.parseXml(str, "msg", (String) null);
            C93908k kVar = new C93908k();
            if (parseXml == null) {
                Log.m105924i("TemplateMsgContent", "values map is null.");
                return kVar;
            }
            kVar.f271018a = Util.nullAsNil(parseXml.get(".msg.fromusername"));
            kVar.f271019b = parseXml.get(".msg.appmsg.mmreader.category.item.title");
            int i = 0;
            while (true) {
                if (i >= 100) {
                    break;
                }
                String str2 = ".msg.appmsg.mmreader.template_detail.line_content.lines.line";
                if (i != 0) {
                    str2 = str2 + i;
                }
                String str3 = parseXml.get(str2 + ".value.word");
                String str4 = parseXml.get(str2 + ".key.word");
                if (Util.isNullOrNil(str3) && Util.isNullOrNil(str4)) {
                    Log.m105925i("TemplateMsgContent", "visit lines: lines count=%d", Integer.valueOf(i));
                    break;
                }
                C93909a aVar = new C93909a();
                aVar.f271021a = str3;
                Util.nullAsNil(str4);
                Util.getInt(parseXml.get(str2 + ".key.hide"), 0);
                ((ArrayList) kVar.f271020c).add(aVar);
                i++;
            }
            return kVar;
        }
    }

    public FTS5SearchServiceNotifyLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f270985i = new IListener<ShouldRescanMessagesEvent>(fVar) {
            {
                this.__eventId = -224286085;
            }

            public boolean callback(IEvent iEvent) {
                ShouldRescanMessagesEvent shouldRescanMessagesEvent = (ShouldRescanMessagesEvent) iEvent;
                ((C93836i) FTS5SearchServiceNotifyLogic.this.f270981e).mo128803c(65574, new C93923f(this));
                return false;
            }
        };
        this.f270986j = new IListener<ActivateEvent>(fVar) {
            {
                this.__eventId = -1435144905;
            }

            public boolean callback(IEvent iEvent) {
                if (!((ActivateEvent) iEvent).f78706d.f78707a) {
                    FTS5SearchServiceNotifyLogic.this.f270987n.startTimer(30000);
                    return false;
                }
                FTS5SearchServiceNotifyLogic.this.f270987n.stopTimer();
                return false;
            }
        };
        this.f270987n = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C93898a(), false);
        this.f270988o = new C93899b(this);
    }

    /* renamed from: a */
    public boolean mo128809a() {
        Class cls = C99260q.class;
        if (!((C99260q) C86312j.m106911c(cls)).mo128758wd()) {
            Log.m105924i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Create Fail!");
            return false;
        }
        Log.m105924i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "Create Success!");
        this.f270983g = (C101472f) ((C99260q) C86312j.m106911c(cls)).db0(1536);
        this.f270981e = ((C99260q) C86312j.m106911c(cls)).mo128743Jd();
        this.f270982f = ((C99260q) C86312j.m106911c(cls)).mo128761xc();
        this.f270986j.alive();
        this.f270985i.alive();
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this, (Looper) null);
        return true;
    }

    /* renamed from: b */
    public boolean mo128810b() {
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this);
        this.f270986j.dead();
        this.f270985i.dead();
        this.f270983g = null;
        this.f270981e = null;
        this.f270987n.stopTimer();
        return true;
    }

    public String getName() {
        return "FTS5SearchServiceNotifyLogic";
    }

    /* renamed from: l4 */
    public C99664b mo128819l4(C76728k kVar) {
        C99664b bVar;
        switch (kVar.f224467b) {
            case 10:
                bVar = new C93905h(kVar, false);
                break;
            case 11:
                bVar = new C93905h(kVar, true);
                break;
            case 12:
                bVar = new C93907j(kVar);
                break;
            default:
                bVar = new C93906i(kVar);
                break;
        }
        return ((C93836i) this.f270981e).mo128803c(-65536, bVar);
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        if (!CrashReportFactory.isBackupMerge()) {
            if ("notifymessage".equals(eVar.f123844a) || "gh_3dfda90e39d6".equals(eVar.f123844a)) {
                int i = 0;
                if (eVar.f123845b.equals("insert")) {
                    ArrayList arrayList = new ArrayList();
                    while (i < eVar.f123846c.size()) {
                        arrayList.add(eVar.f123846c.get(i));
                        i++;
                    }
                    if (arrayList.size() > 0) {
                        ((C93836i) this.f270981e).mo128803c(65576, new C93903f(arrayList, eVar.f123844a));
                    }
                } else if (eVar.f123845b.equals("delete")) {
                    ArrayList<C72963f4> arrayList2 = eVar.f123846c;
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Vx0(eVar.f123844a) == 0) {
                            Log.m105924i("MicroMsg.FTS.FTS5SearchServiceNotifyLogic", "clear all record");
                            ((C93836i) this.f270981e).mo128803c(65576, new C93901d((C938971) null));
                            return;
                        }
                        return;
                    }
                    while (i < eVar.f123846c.size()) {
                        ((C93836i) this.f270981e).mo128803c(65576, new C93902e(eVar.f123846c.get(i).getMsgId()));
                        i++;
                    }
                }
            }
        }
    }
}
