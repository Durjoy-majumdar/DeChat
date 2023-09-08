package eb0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Map;

public class z3$$d implements Runnable {

    /* renamed from: d */
    public int f84306d = 100;

    /* renamed from: e */
    public final /* synthetic */ Map f84307e;

    public z3$$d(Map map) {
        this.f84307e = map;
    }

    public void run() {
        long j;
        Class cls = C75700k0.class;
        char c = 1;
        C75604z3.f222093b = true;
        Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask run currentThread[%s, %d] talkers size:%s", Thread.currentThread().getName(), Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(this.f84307e.size()));
        long j2 = 0;
        if (this.f84307e.containsKey("")) {
            C75604z3.m90830b(((Long) this.f84307e.get("")).longValue(), 2);
            this.f84307e.remove("");
            ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow("", 0);
        }
        for (Map.Entry entry : this.f84307e.entrySet()) {
            String str = (String) entry.getKey();
            long longValue = ((Long) entry.getValue()).longValue();
            if (longValue > j2) {
                long nowMilliSecond = Util.nowMilliSecond();
                long j3 = j2;
                int i = 0;
                while (true) {
                    int i2 = this.f84306d;
                    if (i2 < 200 && i2 > 30) {
                        this.f84306d = j3 > 500 ? i2 - 5 : i2 + 5;
                    }
                    long nowMilliSecond2 = Util.nowMilliSecond();
                    Cursor xs02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xs0(str, this.f84306d, longValue);
                    long j4 = j2;
                    while (xs02.moveToNext()) {
                        C72963f4 f4Var = new C72963f4();
                        f4Var.convertFrom(xs02);
                        if (j2 < f4Var.getCreateTime()) {
                            j2 = f4Var.getCreateTime();
                        }
                        j4++;
                        C75604z3.m90833e(f4Var, false);
                    }
                    xs02.close();
                    long nowMilliSecond3 = Util.nowMilliSecond();
                    if (j2 > 0 && j4 > 0) {
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101129mI(str, j2);
                        ((C31505r2) C86312j.m106911c(C31505r2.class)).mo58206XN(str, j2);
                    }
                    i = (int) (((long) i) + j4);
                    long nowMilliSecond4 = Util.nowMilliSecond();
                    j3 = nowMilliSecond4 - nowMilliSecond2;
                    Object[] objArr = new Object[9];
                    objArr[0] = Util.secPrint(str);
                    objArr[c] = Integer.valueOf(i);
                    objArr[2] = Long.valueOf(j4);
                    objArr[3] = Long.valueOf(longValue - j2);
                    objArr[4] = Long.valueOf(longValue);
                    objArr[5] = Long.valueOf(nowMilliSecond4 - nowMilliSecond3);
                    objArr[6] = Long.valueOf(j3);
                    objArr[7] = Long.valueOf(nowMilliSecond4 - nowMilliSecond);
                    objArr[8] = Integer.valueOf(this.f84306d);
                    Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask:%s delCnt:%d curCnt:%d msgTimeDiff:%d(%d) run:[%d,%d,%d](%d)", objArr);
                    j = 0;
                    if (j4 <= 0) {
                        break;
                    }
                    j2 = 0;
                    c = 1;
                }
                ((C72986n2) ((C75700k0) C86709a0.m107533q(cls)).mo96093DX()).mo101181Ow(str, 0);
            } else {
                j = j2;
            }
            j2 = j;
            c = 1;
        }
        Log.m105924i("MicroMsg.MsgInfoStorageLogic", "Done checkUnfinishedDeleteMsgTask");
        C75604z3.f222093b = false;
    }
}
