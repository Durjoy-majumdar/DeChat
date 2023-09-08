package qv0;

import android.content.SharedPreferences;
import android.database.Cursor;
import av0.C16686a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import g62.C75875l;
import gy3.C87412m;
import hv0.C98544e;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;
import yu0.C102910f;
import yu0.C102912i;
import yu0.C102913k;
import zu0.C103085d;
import zu0.C103086e;
import zu0.C103087f;
import zu0.d$$d;

/* renamed from: qv0.e */
public final class C101304e implements d$$d {

    /* renamed from: d */
    public C103085d f296793d = new C103085d();

    /* renamed from: e */
    public d$$d f296794e;

    /* renamed from: f */
    public MTimerHandler f296795f;

    /* renamed from: g */
    public C36098a f296796g = C36098a.PHONE;

    /* renamed from: h */
    public boolean f296797h;

    /* renamed from: i */
    public LinkedList<C102912i> f296798i;

    /* renamed from: j */
    public final Object f296799j = new Object();

    /* renamed from: n */
    public long f296800n;

    /* renamed from: o */
    public long f296801o = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: p */
    public int f296802p;

    /* renamed from: q */
    public LinkedList<C102912i> f296803q = new LinkedList<>();

    /* renamed from: r */
    public LinkedList<C102912i> f296804r;

    /* renamed from: s */
    public boolean f296805s;

    /* renamed from: t */
    public boolean f296806t;

    /* renamed from: qv0.e$a */
    public static final class C101305a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101304e f296807d;

        public C101305a(C101304e eVar) {
            this.f296807d = eVar;
        }

        public final void run() {
            int Vx0;
            this.f296807d.mo140765b();
            if (this.f296807d.f296803q.size() == 0) {
                Log.m105920e("MicroMsg.ConvChooseHelper", "backupSessionInfo is null or nill!");
                C101304e eVar = this.f296807d;
                C103085d dVar = eVar.f296793d;
                dVar.getClass();
                Log.m105924i("MicroMsg.BackupCalculator", "calculateChooseConversation start");
                long nowMilliSecond = Util.nowMilliSecond();
                LinkedList linkedList = new LinkedList();
                Cursor I = ((C44660i2) C98544e.m128035f().mo137901e().mo137895c()).mo69738I(1, C102913k.m136055t(), "*", -1);
                if (I.getCount() == 0) {
                    MMHandlerThread.postToMainThread(new C103086e(dVar, eVar, linkedList));
                    Log.m105924i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation!");
                    I.close();
                    return;
                }
                I.moveToFirst();
                Log.m105925i("MicroMsg.BackupCalculator", "calculateChooseConversation count[%d]", Integer.valueOf(I.getCount()));
                while (!dVar.f304151a) {
                    C72976h2 h2Var = new C72976h2();
                    h2Var.convertFrom(I);
                    if (!Util.isNullOrNil(h2Var.getUsername()) && (Vx0 = ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).Vx0(h2Var.getUsername())) > 0) {
                        if (C72996z1.m85810M4(C97625j3.m125812b().mo105907v().get(h2Var.getUsername()).mo73953E2())) {
                            Log.m105925i("MicroMsg.BackupCalculator", "calculateChooseConversation Biz conv:%s, msgCount[%d]", h2Var.getUsername(), Integer.valueOf(Vx0));
                        } else {
                            C102912i iVar = new C102912i();
                            iVar.f303759d = h2Var.getUsername();
                            iVar.f303763h = (long) Vx0;
                            iVar.f303760e = ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).yu0(h2Var.getUsername());
                            ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).Dx0(h2Var.getUsername());
                            linkedList.add(iVar);
                        }
                    }
                    if (!I.moveToNext()) {
                        I.close();
                        if (!dVar.f304151a) {
                            MMHandlerThread.postToMainThread(new C103087f(dVar, eVar, linkedList));
                        }
                        Log.m105925i("MicroMsg.BackupCalculator", "calculateChooseConversation finish,size:%d, use time[%d]", Integer.valueOf(linkedList.size()), Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
                        return;
                    }
                }
                Log.m105920e("MicroMsg.BackupCalculator", "calculateChooseConversation cancel.");
                I.close();
                return;
            }
            C101304e eVar2 = this.f296807d;
            eVar2.f296793d.mo142811a(eVar2.f296803q, eVar2, C16686a.m16193i().mo142622e().f303755i);
        }
    }

    /* renamed from: qv0.e$b */
    public static final class C101306b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C101304e f296808d;

        public C101306b(C101304e eVar) {
            this.f296808d = eVar;
        }

        public final boolean onTimerExpired() {
            Log.m105924i("MicroMsg.ConvChooseHelper", "clearChooseData");
            this.f296808d.f296803q.clear();
            C101304e eVar = this.f296808d;
            eVar.f296804r = null;
            eVar.f296798i = null;
            eVar.f296806t = false;
            eVar.f296805s = false;
            return true;
        }
    }

    /* renamed from: qv0.e$c */
    public static final class C101307c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101304e f296809d;

        public C101307c(C101304e eVar) {
            this.f296809d = eVar;
        }

        public final void run() {
            C101304e eVar = this.f296809d;
            eVar.f296793d.mo142811a(eVar.f296803q, eVar, C16686a.m16193i().mo142622e().f303755i);
        }
    }

    /* renamed from: N1 */
    public void mo22649N1(LinkedList<C102912i> linkedList) {
        C87412m.m108594g(linkedList, "calAllConvNames");
        this.f296805s = true;
        mo140771h(linkedList);
        mo140773j();
        Log.m105925i("MicroMsg.ConvChooseHelper", "onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", Integer.valueOf(this.f296803q.size()), Integer.valueOf(mo140770g().size()));
        d$$d d__d = this.f296794e;
        if (d__d != null) {
            C87412m.m108591d(d__d);
            d__d.mo22649N1(mo140770g());
        }
        ThreadPool.post(new C101307c(this), "BackupMoveChooseServer.calculate");
    }

    /* renamed from: T4 */
    public void mo22650T4(LinkedList<C102912i> linkedList) {
        C87412m.m108594g(linkedList, "backupSessionInfo");
        Log.m105925i("MicroMsg.ConvChooseHelper", "onCalcuSizeFinish size:%d", Integer.valueOf(linkedList.size()));
        this.f296806t = true;
        mo140773j();
        if (this.f296797h) {
            LinkedList<C102912i> f = mo140769f();
            C87412m.m108591d(f);
            f.clear();
            LinkedList<C102912i> linkedList2 = this.f296798i;
            C87412m.m108591d(linkedList2);
            Iterator<C102912i> it = linkedList2.iterator();
            while (it.hasNext()) {
                LinkedList<C102912i> f2 = mo140769f();
                C87412m.m108591d(f2);
                f2.add(it.next());
            }
        }
        if (C16686a.m16193i().mo17662k().f45184e) {
            C16686a.m16193i().mo17662k().mo17703g();
            return;
        }
        d$$d d__d = this.f296794e;
        if (d__d != null) {
            C87412m.m108591d(d__d);
            d__d.mo22650T4(linkedList);
        }
    }

    /* renamed from: a */
    public final void mo140764a(boolean z) {
        this.f296797h = z;
        C98544e.m128035f().mo137899c();
        ThreadPool.post(new C101305a(this), "BakMoveChooseServer.calculateToChoose");
    }

    /* renamed from: b */
    public final void mo140765b() {
        synchronized (this.f296799j) {
            this.f296793d.mo142812b();
            this.f296793d = new C103085d();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: c */
    public final void mo140766c() {
        MTimerHandler mTimerHandler = new MTimerHandler(new C101306b(this), false);
        this.f296795f = mTimerHandler;
        mTimerHandler.startTimer((long) 300000);
    }

    /* renamed from: d */
    public final void mo140767d(int i, int i2, long j, long j2, LinkedList<C102912i> linkedList) {
        long j3;
        long j4;
        C87412m.m108594g(linkedList, "allConvName");
        if (i2 == 0) {
            this.f296798i = new LinkedList<>(linkedList);
            return;
        }
        this.f296800n = j;
        this.f296801o = j2;
        this.f296802p = i;
        this.f296798i = new LinkedList<>();
        Iterator<C102912i> it = linkedList.iterator();
        while (it.hasNext()) {
            C102912i next = it.next();
            C75875l e = C98544e.m128035f().mo137901e().mo137897e();
            String str = next.f303759d;
            C72972g4 g4Var = (C72972g4) e;
            g4Var.getClass();
            if (j2 < j) {
                j3 = j;
                j4 = j2;
            } else {
                j4 = j;
                j3 = j2;
            }
            Cursor rawQuery = g4Var.f212775p.rawQuery("SELECT COUNT(*) FROM " + g4Var.hy0(str) + " WHERE" + g4Var.iy0(str) + "AND " + "createTime" + " > " + j4 + " AND " + "createTime" + " < " + j3, (String[]) null, 2);
            int i3 = 0;
            try {
                if (rawQuery.moveToFirst()) {
                    i3 = rawQuery.getInt(0);
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e2, "", new Object[0]);
            } catch (Throwable th) {
                rawQuery.close();
                throw th;
            }
            rawQuery.close();
            if (i3 > 0) {
                next.f303763h = (long) i3;
                LinkedList<C102912i> linkedList2 = this.f296798i;
                C87412m.m108591d(linkedList2);
                linkedList2.add(next);
            }
        }
    }

    /* renamed from: e */
    public final long mo140768e() {
        long j = 0;
        if (mo140769f() == null) {
            Log.m105928w("MicroMsg.ConvChooseHelper", "getChooseSize conv 0");
            return 0;
        }
        LinkedList<C102912i> f = mo140769f();
        C87412m.m108591d(f);
        Iterator<C102912i> it = f.iterator();
        while (it.hasNext()) {
            j += it.next().f303762g;
        }
        return j;
    }

    /* renamed from: f */
    public final LinkedList<C102912i> mo140769f() {
        if (this.f296804r == null) {
            this.f296804r = new LinkedList<>();
        }
        return this.f296804r;
    }

    /* renamed from: g */
    public final LinkedList<C102912i> mo140770g() {
        LinkedList<C102912i> linkedList = this.f296798i;
        return linkedList == null ? new LinkedList<>() : linkedList;
    }

    /* renamed from: g1 */
    public void mo22651g1(LinkedList<C102912i> linkedList, C102912i iVar, int i) {
        C87412m.m108594g(linkedList, "convInfo");
        C87412m.m108594g(iVar, "updateInfo");
        Log.m105924i("MicroMsg.ConvChooseHelper", "onCalcuSizeProgress.");
        mo140771h(linkedList);
        LinkedList<C102912i> linkedList2 = this.f296798i;
        if (linkedList2 != null) {
            Iterator<C102912i> it = linkedList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C102912i next = it.next();
                if (C87412m.m108589b(next.f303759d, iVar.f303759d)) {
                    next.f303762g = iVar.f303762g;
                    next.f303763h = iVar.f303763h;
                    break;
                }
            }
        }
        if (C16686a.m16193i().mo17662k().f45184e) {
            Log.m105924i("MicroMsg.ConvChooseHelper", "onCalcuChooseSizeFinish startRequestNotify");
            C16686a.m16193i().mo142622e().mo142626d(13, i, linkedList.size());
            C16686a.m16193i().mo17662k().mo17704h(13);
        }
        d$$d d__d = this.f296794e;
        if (d__d != null) {
            C87412m.m108591d(d__d);
            d__d.mo22651g1(mo140770g(), iVar, i);
        }
    }

    /* renamed from: h */
    public final void mo140771h(LinkedList<C102912i> linkedList) {
        C87412m.m108594g(linkedList, "value");
        LinkedList<C102912i> linkedList2 = new LinkedList<>(linkedList);
        this.f296803q = linkedList2;
        if (linkedList2.size() > 0) {
            long j = linkedList2.get(0).f303760e;
            Iterator<C102912i> it = linkedList2.iterator();
            while (it.hasNext()) {
                long j2 = it.next().f303760e;
                if (j > j2) {
                    j = j2;
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo140772i(LinkedList<C102912i> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            this.f296804r = new LinkedList<>();
            return;
        }
        LinkedList<C102912i> linkedList2 = new LinkedList<>(linkedList.subList((linkedList.size() * 3) / 4, linkedList.size()));
        this.f296804r = linkedList2;
        linkedList2.addAll(linkedList.subList(0, (linkedList.size() * 3) / 4));
    }

    /* renamed from: j */
    public final void mo140773j() {
        SharedPreferences d = C102910f.m136016d();
        if (this.f296796g == C36098a.PHONE) {
            mo140767d(this.f296802p, d.getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0), d.getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0), d.getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0), this.f296803q);
            return;
        }
        mo140767d(this.f296802p, d.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0), d.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0), d.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0), this.f296803q);
    }
}
