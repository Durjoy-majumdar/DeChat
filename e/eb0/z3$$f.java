package eb0;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.wcdb.database.SQLiteDatabase;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zt3.C119157j;

public class z3$$f implements Runnable {

    /* renamed from: d */
    public int f84309d = 100;

    /* renamed from: e */
    public final /* synthetic */ List f84310e;

    /* renamed from: f */
    public final /* synthetic */ long f84311f;

    /* renamed from: g */
    public final /* synthetic */ Runnable f84312g;

    /* renamed from: eb0.z3$$f$a */
    public class C31542a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f84313d;

        public C31542a(Map map) {
            this.f84313d = map;
        }

        public void run() {
            long j;
            Class cls = C75700k0.class;
            long nowMilliSecond = Util.nowMilliSecond();
            long j2 = 0;
            int i = 0;
            for (Map.Entry entry : this.f84313d.entrySet()) {
                String str = (String) entry.getKey();
                long longValue = ((Long) entry.getValue()).longValue();
                do {
                    z3$$f z3__f = z3$$f.this;
                    int i2 = z3__f.f84309d;
                    if (i2 < 200 && i2 > 30) {
                        z3__f.f84309d = j2 > 500 ? i2 - 5 : i2 + 5;
                    }
                    long nowMilliSecond2 = Util.nowMilliSecond();
                    Cursor xs02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xs0(str, z3$$f.this.f84309d, longValue);
                    long j3 = 0;
                    j = 0;
                    while (xs02.moveToNext()) {
                        C72963f4 f4Var = new C72963f4();
                        f4Var.convertFrom(xs02);
                        if (j3 < f4Var.getCreateTime()) {
                            j3 = f4Var.getCreateTime();
                        }
                        j++;
                        C75604z3.m90833e(f4Var, true);
                    }
                    xs02.close();
                    long nowMilliSecond3 = Util.nowMilliSecond();
                    if (j3 > 0 && j > 0) {
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101129mI(str, j3);
                        ((C31505r2) C86312j.m106911c(C31505r2.class)).mo58206XN(str, j3);
                    }
                    i = (int) (((long) i) + j);
                    long nowMilliSecond4 = Util.nowMilliSecond();
                    j2 = nowMilliSecond4 - nowMilliSecond2;
                    Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", Util.secPrint(str), Integer.valueOf(i), Long.valueOf(j), Long.valueOf(longValue - j3), Long.valueOf(longValue), Long.valueOf(nowMilliSecond4 - nowMilliSecond3), Long.valueOf(j2), Long.valueOf(nowMilliSecond4 - nowMilliSecond), Integer.valueOf(z3$$f.this.f84309d));
                } while (j > 0);
            }
        }
    }

    public z3$$f(List list, long j, Runnable runnable) {
        this.f84310e = list;
        this.f84311f = j;
        this.f84312g = runnable;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo58220a() {
        Class cls = C75700k0.class;
        SQLiteDatabase f = C86709a0.m107535s().f251811i.mo125615f();
        HashMap hashMap = new HashMap();
        for (String str : this.f84310e) {
            DeleteMsgEvent deleteMsgEvent = new DeleteMsgEvent();
            DeleteMsgEvent.C28727a aVar = deleteMsgEvent.f78765d;
            aVar.f78766a = Long.MIN_VALUE;
            aVar.f78767b = str;
            aVar.f78768c = 0;
            deleteMsgEvent.publish();
        }
        try {
            f.beginTransaction();
            for (String str2 : this.f84310e) {
                C72963f4 Ix0 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ix0(str2, this.f84311f);
                long createTime = Ix0 == null ? 0 : Ix0.getCreateTime();
                hashMap.put(str2, Long.valueOf(createTime));
                ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow(str2, createTime);
                Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker run currentThread[%s, %d] lastMsg[%s] lastMsgCreateTime[%s]", Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId()), Ix0, Long.valueOf(createTime));
            }
            f.setTransactionSuccessful();
            f.endTransaction();
            if (f.inTransaction()) {
                f.endTransaction();
            }
            MMHandlerThread.postToMainThread(this.f84312g);
            ((C119157j) C119157j.f356862d).mo183876g(new C31542a(hashMap), "AsyncDeleteMessageStage2");
        } catch (Throwable th) {
            if (f.inTransaction()) {
                f.endTransaction();
            }
            MMHandlerThread.postToMainThread(this.f84312g);
            throw th;
        }
    }

    public void run() {
        try {
            mo58220a();
        } catch (C86484b e) {
            Log.printErrStackTrace("MicroMsg.MsgInfoStorageLogic", e, "", new Object[0]);
        }
    }
}
