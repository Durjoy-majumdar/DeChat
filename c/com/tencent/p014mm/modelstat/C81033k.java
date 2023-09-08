package com.tencent.p014mm.modelstat;

import android.content.ComponentName;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.modelstat.k */
public class C81033k {

    /* renamed from: a */
    public int f238019a;

    /* renamed from: b */
    public long f238020b;

    /* renamed from: c */
    public long f238021c;

    /* renamed from: d */
    public long f238022d;

    /* renamed from: e */
    public long f238023e = 0;

    /* renamed from: f */
    public boolean f238024f;

    /* renamed from: g */
    public long f238025g;

    public C81033k(int i, boolean z, long j) {
        this.f238019a = i;
        this.f238024f = z;
        this.f238022d = j;
    }

    /* renamed from: a */
    public void mo112914a(boolean z, long j) {
        if (!z) {
            if (this.f238022d == 0) {
                this.f238022d = j;
            }
            this.f238025g = Util.currentTicks() - this.f238025g;
            this.f238021c = Util.nowMilliSecond();
            Log.m105918d("MicroMsg.MultiSceneStat", "FIN: TIME:" + (this.f238021c - this.f238020b) + " datalen:" + this.f238022d + " Count:" + this.f238023e + " type:" + this.f238019a);
            String str = WatchDogPushReceiver.f237959a;
            Intent intent = new Intent();
            intent.setAction("com.tencent.mm.WatchDogPushReceiver");
            intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), WatchDogPushReceiver.m98922a()));
            intent.putExtra("type", 1);
            intent.putExtra("rtType", this.f238019a);
            intent.putExtra("beginTime", this.f238020b);
            intent.putExtra("endTime", this.f238021c);
            intent.putExtra("rtType", this.f238019a);
            intent.putExtra("dataLen", this.f238022d);
            intent.putExtra("isSend", this.f238024f);
            intent.putExtra("cost", this.f238025g);
            intent.putExtra("doSceneCount", this.f238023e);
            MMApplicationContext.getContext().sendBroadcast(intent);
        }
    }
}
