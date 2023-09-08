package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import junit.framework.Assert;
import lu3.C88656g;
import pv0.C47529h;
import zt3.C119157j;

/* renamed from: gv0.j */
public class C20853j {

    /* renamed from: a */
    public int f58925a = 0;

    /* renamed from: b */
    public long f58926b = 0;

    /* renamed from: c */
    public long f58927c = 0;

    /* renamed from: d */
    public boolean f58928d = false;

    /* renamed from: e */
    public Boolean f58929e = null;

    /* renamed from: gv0.j$a */
    public class C20854a implements C88656g {
        public C20854a() {
        }

        public String getKey() {
            return "BackupSendBackupHeartBeat";
        }

        public void run() {
            while (!C20853j.this.f58929e.booleanValue()) {
                try {
                    Thread.sleep(1000);
                } catch (Exception unused) {
                }
                if (C20853j.this.f58929e.booleanValue()) {
                    Log.m105920e("MicroMsg.BackupHeartBeatHandler", "start BackupSendBackupHeartBeat thread stopped.");
                    return;
                }
                long milliSecondsToNow = Util.milliSecondsToNow(C20853j.this.f58926b);
                C20853j jVar = C20853j.this;
                if (!jVar.f58928d) {
                    if (milliSecondsToNow < ((long) 10000)) {
                        jVar.f58925a = 0;
                    } else {
                        Log.m105921e("MicroMsg.BackupHeartBeatHandler", "start send heartbeat req, heartBeatTimeStamp[%d], timeDiff[%d]", Long.valueOf(jVar.f58926b), Long.valueOf(milliSecondsToNow));
                        C20853j.this.mo32556a();
                        C20853j.this.mo32558c();
                        C20853j.this.f58928d = true;
                    }
                } else if (milliSecondsToNow >= ((long) 5000)) {
                    if (jVar.f58925a != 1) {
                        Log.m105921e("MicroMsg.BackupHeartBeatHandler", "start weak connect Timeout Now! heartBeatTimeStamp[%d], timeDiff[%d]", Long.valueOf(jVar.f58926b), Long.valueOf(milliSecondsToNow));
                        C20853j.this.f58925a = 1;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo32556a() {
        long j = this.f58927c;
        this.f58927c = j == MAlarmHandler.NEXT_FIRE_INTERVAL ? 0 : j + 1;
        C47529h hVar = new C47529h();
        long j2 = this.f58927c;
        hVar.f127518d = j2;
        try {
            Log.m105925i("MicroMsg.BackupHeartBeatHandler", "sendBackupHeartBeatRequest send heartbeat req, ack:%d", Long.valueOf(j2));
            C20842c.m22885v1(hVar.toByteArray(), 9);
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.BackupHeartBeatHandler", e, "buf to BackupHeartBeatRequest err.", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo32557b(boolean z) {
        if (z) {
            Assert.assertTrue("New BackupHeartBeatHandler EveryTime !", this.f58929e == null);
        }
        Log.m105924i("MicroMsg.BackupHeartBeatHandler", "start backup heart beat handler.");
        mo32558c();
        this.f58929e = Boolean.FALSE;
        ((C119157j) C119157j.f356862d).mo183893x(new C20854a());
        mo32556a();
    }

    /* renamed from: c */
    public void mo32558c() {
        this.f58926b = Util.nowMilliSecond();
        this.f58928d = false;
        if (this.f58925a != 0) {
            this.f58925a = 0;
            mo32557b(false);
        }
    }
}
