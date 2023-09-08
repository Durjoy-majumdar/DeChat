package wb1;

import android.database.Cursor;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import ob0.C11385n;
import ob0.C117747y;
import p206nj.C76861g;
import p749xh.C66261f3;
import pb1.C100695a0;
import pb1.C100718j1;
import pb1.C100726o0;
import pb1.C100727o1;
import pb1.C100734q;
import pb1.C100755z;
import xb1.C102614d;

/* renamed from: wb1.q */
public class C102408q implements C11385n, C100726o0 {

    /* renamed from: n */
    public static Map<Long, C76861g.C47263a> f301628n = new HashMap();

    /* renamed from: d */
    public boolean f301629d = false;

    /* renamed from: e */
    public long f301630e = 0;

    /* renamed from: f */
    public boolean f301631f = false;

    /* renamed from: g */
    public Queue<C100755z> f301632g = new LinkedList();

    /* renamed from: h */
    public boolean f301633h = NetStatusUtil.isWifi(MMApplicationContext.getContext());

    /* renamed from: i */
    public C29060q f301634i = new C102410b();

    /* renamed from: j */
    public MTimerHandler f301635j = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C102412d(), false);

    /* renamed from: wb1.q$a */
    public class C102409a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f301636d;

        /* renamed from: e */
        public final /* synthetic */ int f301637e;

        public C102409a(C117747y yVar, int i) {
            this.f301636d = yVar;
            this.f301637e = i;
        }

        public void run() {
            if (this.f301636d.getType() == 404) {
                C117747y yVar = this.f301636d;
                if (yVar instanceof C100727o1) {
                    C102408q.this.f301631f = false;
                    long j = ((C100727o1) yVar).f295103g.field_localId;
                    C100755z zVar = ((C100727o1) yVar).f295103g;
                    ((HashMap) C102408q.f301628n).remove(Long.valueOf(j));
                    if (this.f301637e != 0) {
                        Log.m105921e("MicroMsg.Fav.FavCheckCdnService", "achieved retry limit, set error, localId:%d", Long.valueOf(j));
                        C115669n.INSTANCE.mo160131h(10659, 0, Integer.valueOf(zVar.field_type), -2, Long.valueOf(C100734q.m131817H(zVar)), Long.valueOf(C100695a0.m131726a(zVar.field_localId)));
                        ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142272mL(3, j);
                    }
                    C102408q.m135132a(C102408q.this);
                }
            }
        }

        public String toString() {
            return super.toString() + "|onSceneEnd";
        }
    }

    /* renamed from: wb1.q$b */
    public class C102410b extends C29060q.C29061a {
        public C102410b() {
        }

        public void onNetworkChange(int i) {
            try {
                boolean isWifi = NetStatusUtil.isWifi(MMApplicationContext.getContext());
                if (i == 4 || i == 6) {
                    Log.m105925i("MicroMsg.Fav.FavCheckCdnService", "onNetworkChange st:%d isWifi:%B, lastIsWifi:%B", Integer.valueOf(i), Boolean.valueOf(isWifi), Boolean.valueOf(C102408q.this.f301633h));
                    C102408q qVar = C102408q.this;
                    if (!qVar.f301633h && isWifi) {
                        C102408q.m135133b(qVar);
                    }
                    C102408q.this.f301633h = isWifi;
                    return;
                }
                C102408q.this.f301633h = isWifi;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Fav.FavCheckCdnService", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: wb1.q$c */
    public class C102411c implements Runnable {
        public C102411c() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C102408q qVar = C102408q.this;
            long j = currentTimeMillis - qVar.f301630e;
            if (qVar.f301629d) {
                if (j >= 60000) {
                    Log.m105920e("MicroMsg.Fav.FavCheckCdnService", "klem ERR: Try Run service runningFlag:" + C102408q.this.f301629d + " timeWait:" + j + ">=MAX_TIME_WAIT sending:" + C102408q.this.f301629d);
                } else {
                    return;
                }
            }
            C102408q qVar2 = C102408q.this;
            qVar2.f301631f = false;
            qVar2.f301629d = true;
            qVar2.f301635j.startTimer(10);
        }

        public String toString() {
            return super.toString() + "|run";
        }
    }

    /* renamed from: wb1.q$d */
    public class C102412d implements MTimerHandler.CallBack {
        public C102412d() {
        }

        public boolean onTimerExpired() {
            try {
                C102408q.m135132a(C102408q.this);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Fav.FavCheckCdnService", e, "", new Object[0]);
            }
            return false;
        }

        public String toString() {
            return super.toString() + "|scenePusher";
        }
    }

    public C102408q() {
        C86709a0.m107529k().mo121126a(this.f301634i);
        C86709a0.m107524d().mo123455a(404, this);
    }

    /* renamed from: a */
    public static void m135132a(C102408q qVar) {
        C100755z zVar;
        LinkedList<C100755z> linkedList;
        qVar.getClass();
        qVar.f301630e = System.currentTimeMillis();
        if (!qVar.f301631f && ((LinkedList) qVar.f301632g).size() == 0) {
            Cursor rawQuery = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).f302175d.rawQuery("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where itemStatus=1", (String[]) null, 2);
            if (rawQuery == null) {
                linkedList = null;
            } else {
                if (rawQuery.moveToFirst()) {
                    linkedList = new LinkedList<>();
                    do {
                        C100755z zVar2 = new C100755z();
                        zVar2.convertFrom(rawQuery);
                        linkedList.add(zVar2);
                    } while (rawQuery.moveToNext());
                } else {
                    linkedList = null;
                }
                rawQuery.close();
            }
            if (!(linkedList == null || linkedList.size() == 0)) {
                for (C100755z zVar3 : linkedList) {
                    if (((HashMap) f301628n).containsKey(Long.valueOf(zVar3.field_localId))) {
                        Log.m105918d("MicroMsg.Fav.FavCheckCdnService", "File is Already running:" + zVar3.field_localId);
                    } else {
                        ((LinkedList) qVar.f301632g).add(zVar3);
                        ((HashMap) f301628n).put(Long.valueOf(zVar3.field_localId), (Object) null);
                    }
                }
                Log.m105924i("MicroMsg.Fav.FavCheckCdnService", "klem GetNeedRun procing:" + ((HashMap) f301628n).size() + ",send:" + ((LinkedList) qVar.f301632g).size() + "]");
                ((LinkedList) qVar.f301632g).size();
            }
        }
        if (!qVar.f301631f && ((LinkedList) qVar.f301632g).size() <= 0) {
            ((LinkedList) qVar.f301632g).clear();
            ((HashMap) f301628n).clear();
            qVar.f301629d = false;
            qVar.f301631f = false;
            Log.m105924i("MicroMsg.Fav.FavCheckCdnService", "klem No Data Any More , Stop Service");
        } else if (!qVar.f301631f && ((LinkedList) qVar.f301632g).size() > 0 && (zVar = (C100755z) ((LinkedList) qVar.f301632g).poll()) != null && zVar.field_localId > 0) {
            qVar.f301631f = true;
            C86709a0.m107524d().mo123460f(new C100727o1(zVar));
        }
    }

    /* renamed from: b */
    public static void m135133b(C102408q qVar) {
        qVar.getClass();
        Class cls = C100718j1.class;
        LinkedList<C100755z> linkedList = null;
        Cursor rawQuery = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).f302175d.rawQuery("select xml,edittime,ext,favProto,flag,fromUser,id,itemStatus,localId,localSeq,realChatName,sourceCreateTime,sourceId,sourceType,toUser,type,updateSeq,updateTime,tagProto,sessionId,datatotalsize,rowid from FavItemInfo where itemStatus=3", (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.getCount() == 0) {
                rawQuery.close();
            } else {
                linkedList = new LinkedList<>();
                while (rawQuery.moveToNext()) {
                    C100755z zVar = new C100755z();
                    zVar.convertFrom(rawQuery);
                    linkedList.add(zVar);
                }
                rawQuery.close();
            }
        }
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105924i("MicroMsg.Fav.FavCheckCdnService", "startAll list.size 0");
            return;
        }
        Log.m105925i("MicroMsg.Fav.FavCheckCdnService", "startAll list.size:%d", Integer.valueOf(linkedList.size()));
        for (C100755z zVar2 : linkedList) {
            if (zVar2.field_itemStatus == 3) {
                zVar2.field_itemStatus = 1;
                ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(zVar2, C66261f3.COL_LOCALID);
            }
        }
        qVar.run();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107525e().postToWorker(new C102409a(yVar, i));
    }

    public void run() {
        if (Log.isDebug()) {
            Log.m105918d("MicroMsg.Fav.FavCheckCdnService", "run() called " + Util.getStack());
        }
        C86709a0.m107525e().postToWorker(new C102411c());
    }
}
