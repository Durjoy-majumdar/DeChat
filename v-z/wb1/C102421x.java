package wb1;

import android.database.Cursor;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import ec1.C97641a;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C76861g;
import pb1.C100695a0;
import pb1.C100704e1;
import pb1.C100718j1;
import pb1.C100722l1;
import pb1.C100731p1;
import pb1.C100734q;
import pb1.C100746u;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: wb1.x */
public class C102421x implements C11385n, C100704e1 {

    /* renamed from: j */
    public static Map<Long, C76861g.C47263a> f301664j = new HashMap();

    /* renamed from: n */
    public static Map<Long, Integer> f301665n = new HashMap();

    /* renamed from: o */
    public static Set<Long> f301666o = new HashSet();

    /* renamed from: d */
    public boolean f301667d = false;

    /* renamed from: e */
    public int f301668e = 0;

    /* renamed from: f */
    public long f301669f = 0;

    /* renamed from: g */
    public boolean f301670g = false;

    /* renamed from: h */
    public Queue<C100755z> f301671h = new LinkedList();

    /* renamed from: i */
    public MTimerHandler f301672i = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C102424c(), false);

    /* renamed from: wb1.x$a */
    public class C102422a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f301673d;

        /* renamed from: e */
        public final /* synthetic */ int f301674e;

        /* renamed from: f */
        public final /* synthetic */ int f301675f;

        public C102422a(C117747y yVar, int i, int i2) {
            this.f301673d = yVar;
            this.f301674e = i;
            this.f301675f = i2;
        }

        public void run() {
            Class cls = C100718j1.class;
            if (this.f301673d.getType() == 401) {
                C117747y yVar = this.f301673d;
                if (yVar instanceof C100722l1) {
                    C102421x.this.f301670g = false;
                    C100755z zVar = ((C100722l1) yVar).f295090f;
                    long j = zVar.field_localId;
                    ((HashMap) C102421x.f301664j).remove(Long.valueOf(j));
                    if ((this.f301674e == 0 && this.f301675f == 0) || this.f301675f == -400) {
                        ((HashSet) C102421x.f301666o).add(Long.valueOf(j));
                    }
                    int i = -1;
                    if (!(this.f301674e == 0 || this.f301675f == -400)) {
                        C102421x xVar = C102421x.this;
                        xVar.f301668e--;
                    }
                    Integer valueOf = Integer.valueOf(Util.nullAs((Integer) ((HashMap) C102421x.f301665n).get(Long.valueOf(j)), 0));
                    int i2 = this.f301674e;
                    if (!(i2 == 1 || i2 == 0)) {
                        valueOf = Integer.valueOf(valueOf.intValue() - 1);
                        ((HashMap) C102421x.f301665n).put(Long.valueOf(zVar.field_localId), valueOf);
                    }
                    if (valueOf.intValue() <= 0) {
                        int i3 = this.f301674e;
                        int i4 = this.f301675f;
                        Map<Long, Long> map = C100695a0.f295014a;
                        if (i4 == -401) {
                            i = -4;
                        } else if (i3 == 4) {
                            i = -2;
                        }
                        C115669n.INSTANCE.mo160131h(10659, 0, Integer.valueOf(zVar.field_type), Integer.valueOf(i), Long.valueOf(C100734q.m131817H(zVar)), Long.valueOf(C100695a0.m131726a(zVar.field_localId)));
                        ((HashMap) C102421x.f301665n).remove(Long.valueOf(j));
                        Log.m105921e("MicroMsg.Fav.FavSendService", "achieved retry limit, set error, localId:%d", Long.valueOf(j));
                        if (zVar.field_itemStatus == 12) {
                            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(14, zVar.field_localId);
                        }
                        if (zVar.field_itemStatus == 9) {
                            ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142272mL(11, zVar.field_localId);
                        }
                    }
                    C102421x xVar2 = C102421x.this;
                    if (xVar2.f301668e <= 0) {
                        Log.m105924i("MicroMsg.Fav.FavSendService", "klem stopFlag <= 0 , Stop Service");
                        C102421x.this.mo141999b();
                    } else if (!C102421x.m135139a(xVar2)) {
                        C86709a0.m107524d().mo123460f(new C100731p1(2));
                    }
                }
            }
        }

        public String toString() {
            return super.toString() + "|onSceneEnd";
        }
    }

    /* renamed from: wb1.x$b */
    public class C102423b implements Runnable {
        public C102423b() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C102421x xVar = C102421x.this;
            long j = currentTimeMillis - xVar.f301669f;
            if (xVar.f301667d) {
                if (j >= 60000) {
                    Log.m105920e("MicroMsg.Fav.FavSendService", "klem ERR: Try Run service runningFlag:" + C102421x.this.f301667d + " timeWait:" + j + ">=MAX_TIME_WAIT sending:" + C102421x.this.f301667d);
                } else {
                    return;
                }
            }
            C102421x xVar2 = C102421x.this;
            xVar2.f301670g = false;
            xVar2.f301667d = true;
            xVar2.f301668e = 3;
            xVar2.f301672i.startTimer(10);
        }

        public String toString() {
            return super.toString() + "|run";
        }
    }

    /* renamed from: wb1.x$c */
    public class C102424c implements MTimerHandler.CallBack {
        public C102424c() {
        }

        public boolean onTimerExpired() {
            try {
                C102421x.m135139a(C102421x.this);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Fav.FavSendService", e, "", new Object[0]);
            }
            return false;
        }

        public String toString() {
            return super.toString() + "|scenePusher";
        }
    }

    public C102421x() {
        C86709a0.m107524d().mo123455a(401, this);
    }

    /* renamed from: a */
    public static boolean m135139a(C102421x xVar) {
        C100755z zVar;
        ArrayList<C100755z> arrayList;
        boolean z;
        xVar.getClass();
        Log.m105924i("MicroMsg.Fav.FavSendService", "tryStartNetscene");
        xVar.f301669f = System.currentTimeMillis();
        if (!xVar.f301670g && ((LinkedList) xVar.f301671h).size() == 0) {
            Cursor rawQuery = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).f302175d.rawQuery("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where (itemStatus=9 or itemStatus=12)", (String[]) null, 2);
            if (rawQuery == null) {
                arrayList = null;
            } else {
                if (rawQuery.moveToFirst()) {
                    arrayList = new ArrayList<>();
                    do {
                        C100755z zVar2 = new C100755z();
                        zVar2.convertFrom(rawQuery);
                        arrayList.add(zVar2);
                    } while (rawQuery.moveToNext());
                } else {
                    arrayList = null;
                }
                rawQuery.close();
            }
            if (!(arrayList == null || arrayList.size() == 0)) {
                for (C100755z zVar3 : arrayList) {
                    Iterator<C100746u> it = C97641a.m125859a(zVar3.field_localId).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        C100746u next = it.next();
                        if (next.field_type == 0 && next.field_status != 3) {
                            Log.m105925i("MicroMsg.Fav.FavSendService", "cdnInfo is not upload end %s", next.field_dataId);
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        Log.m105924i("MicroMsg.Fav.FavSendService", "cdn info is not upload end");
                    } else {
                        if (((HashSet) f301666o).contains(Long.valueOf(zVar3.field_localId))) {
                            Log.m105925i("MicroMsg.Fav.FavSendService", "info has existed, id %d, localId %d, sourceType %d, sourceId %s", Integer.valueOf(zVar3.field_id), Long.valueOf(zVar3.field_localId), Integer.valueOf(zVar3.field_sourceType), zVar3.field_sourceId);
                        } else {
                            if (((HashMap) f301664j).containsKey(Long.valueOf(zVar3.field_localId))) {
                                Log.m105924i("MicroMsg.Fav.FavSendService", "File is Already running:" + zVar3.field_localId);
                            } else {
                                if (!((HashMap) f301665n).containsKey(Long.valueOf(zVar3.field_localId))) {
                                    ((HashMap) f301665n).put(Long.valueOf(zVar3.field_localId), 3);
                                }
                                ((LinkedList) xVar.f301671h).add(zVar3);
                                ((HashMap) f301664j).put(Long.valueOf(zVar3.field_localId), (Object) null);
                            }
                        }
                    }
                }
                Log.m105924i("MicroMsg.Fav.FavSendService", "klem GetNeedRun procing:" + ((HashMap) f301664j).size() + ",send:" + ((LinkedList) xVar.f301671h).size() + "]");
                ((LinkedList) xVar.f301671h).size();
            }
        }
        if (xVar.f301670g || ((LinkedList) xVar.f301671h).size() > 0) {
            Log.m105925i("MicroMsg.Fav.FavSendService", "Has Data, start service %d", Integer.valueOf(((LinkedList) xVar.f301671h).size()));
            if (!xVar.f301670g && ((LinkedList) xVar.f301671h).size() > 0 && (zVar = (C100755z) ((LinkedList) xVar.f301671h).poll()) != null && zVar.field_localId > 0) {
                xVar.f301670g = true;
                C86709a0.m107524d().mo123460f(new C100722l1(zVar));
                return true;
            }
        } else {
            xVar.mo141999b();
            Log.m105924i("MicroMsg.Fav.FavSendService", "klem No Data Any More , Stop Service");
        }
        return false;
    }

    /* renamed from: b */
    public final void mo141999b() {
        Log.m105924i("MicroMsg.Fav.FavSendService", "on finish");
        ((LinkedList) this.f301671h).clear();
        ((HashMap) f301664j).clear();
        this.f301667d = false;
        this.f301670g = false;
        ((HashMap) f301665n).clear();
    }

    /* renamed from: c */
    public void mo142000c() {
        if (Log.isDebug()) {
            Log.m105918d("MicroMsg.Fav.FavSendService", "run " + Util.getStack());
        }
        C86709a0.m107525e().postToWorker(new C102423b());
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.Fav.FavSendService", "on scene end, errType %d, errCode %d", Integer.valueOf(i), Integer.valueOf(i2));
        C86709a0.m107525e().postToWorker(new C102422a(yVar, i, i2));
    }
}
