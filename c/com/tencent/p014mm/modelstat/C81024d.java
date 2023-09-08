package com.tencent.p014mm.modelstat;

import android.content.Intent;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.modelstat.C81016b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.modelstat.d */
public class C81024d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Intent f237992d;

    /* renamed from: e */
    public final /* synthetic */ C81016b f237993e;

    public C81024d(C81016b bVar, Intent intent) {
        this.f237993e = bVar;
        this.f237992d = intent;
    }

    public void run() {
        String stringExtra = this.f237992d.getStringExtra("ui");
        int intExtra = this.f237992d.getIntExtra("uiHashCode", 0);
        int intExtra2 = this.f237992d.getIntExtra("opCode", 0);
        long longExtra = this.f237992d.getLongExtra("nowMilliSecond", 0);
        long longExtra2 = this.f237992d.getLongExtra("elapsedRealtime", 0);
        Log.m105919d("MicroMsg.ClickFlowStatReceiver", "onReceive op:%d ui:%s hash:0x%x time:%d, elapsed time:%d", Integer.valueOf(intExtra2), stringExtra, Integer.valueOf(intExtra), Long.valueOf(Util.milliSecondsToNow(longExtra)), Long.valueOf(longExtra2));
        if (2147483632 == intExtra2) {
            C81016b.m98926b(this.f237993e);
            return;
        }
        C81016b bVar = this.f237993e;
        bVar.getClass();
        long nowMilliSecond = Util.nowMilliSecond();
        if (TextUtils.isEmpty(stringExtra) || longExtra > nowMilliSecond) {
            Log.m105921e("MicroMsg.ClickFlowStatReceiver", "writeToList page:%s  start - time = %d", stringExtra, Long.valueOf(nowMilliSecond - longExtra));
            return;
        }
        C81016b.C81021c cVar = new C81016b.C81021c();
        cVar.f237979f = intExtra2;
        cVar.f237977d = stringExtra.contains(".") ? stringExtra.substring(stringExtra.lastIndexOf(".") + 1) : stringExtra;
        if (5 == intExtra2 || 6 == intExtra2) {
            cVar.f237979f = 4;
        } else if (!(3 == intExtra2 || 4 == intExtra2)) {
            Log.m105925i("MicroMsg.ClickFlowStatReceiver", "writeToList error opCode:%d  (%s)", Integer.valueOf(intExtra2), stringExtra);
            return;
        }
        cVar.f237978e = longExtra;
        cVar.f237981h = longExtra2;
        bVar.f237963c.add(cVar);
        Log.m105925i("MicroMsg.ClickFlowStatReceiver", "ActivityState op:%d time:%s 0x%x %s useTime:%d", Integer.valueOf(cVar.f237979f), C81016b.m98928h(cVar.f237978e), Integer.valueOf(intExtra), cVar.f237977d, Long.valueOf(Util.milliSecondsToNow(nowMilliSecond)));
        int i = cVar.f237979f;
        if (i == 3) {
            bVar.f237962b.stopTimer();
        } else if (i == 4) {
            bVar.f237962b.stopTimer();
            bVar.f237962b.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }
}
