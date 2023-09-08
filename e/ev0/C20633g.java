package ev0;

import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import gv0.C20842c;
import gv0.C20848d;
import gv0.C20856m;
import gv0.C20862p;
import gv0.C59705n;
import iv0.C21140c;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import ob0.C11385n;
import ob0.C117747y;
import pv0.C22016r;
import pv0.C47526f;
import pv0.C62559e;
import pv0.C62561i;
import pv0.C62567m;
import yu0.C102910f;
import yu0.C102911g;
import yu0.C102913k;
import yu0.C23364b;
import yu0.C23365c;
import yu0.C23366d;
import yu0.C23367h;
import yu0.C23368l;
import zu0.C23584k;

/* renamed from: ev0.g */
public class C20633g implements C23368l {

    /* renamed from: l */
    public static boolean f58086l;

    /* renamed from: m */
    public static boolean f58087m;

    /* renamed from: n */
    public static boolean f58088n;

    /* renamed from: a */
    public LinkedList<String> f58089a;

    /* renamed from: b */
    public C23364b f58090b;

    /* renamed from: c */
    public C23584k f58091c;

    /* renamed from: d */
    public final Set<C23366d> f58092d = new HashSet();

    /* renamed from: e */
    public boolean f58093e = false;

    /* renamed from: f */
    public long f58094f = 0;

    /* renamed from: g */
    public long f58095g = 0;

    /* renamed from: h */
    public final C11385n f58096h = new C20634a();

    /* renamed from: i */
    public final C11385n f58097i = new C20635b();

    /* renamed from: j */
    public final C20842c.C20846e f58098j = new C20636c();

    /* renamed from: k */
    public final C23365c f58099k = new C20638d();

    /* renamed from: ev0.g$a */
    public class C20634a implements C11385n {
        public C20634a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C20842c.m22884u1(3, C20633g.this.f58096h);
            if (i == 0 && i2 == 0) {
                C20842c.f58882p.mo32561b(C20612a.m22480i().mo32277m().mo140768e());
                Log.m105925i("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp success, errMsg[%s]", str);
                C22016r rVar = ((C20862p) yVar).f58954v;
                if (!C20612a.m22480i().f303742b.equals(rVar.f62300d)) {
                    Log.m105920e("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp not the same id");
                    C115669n.INSTANCE.idkeyStat(400, 118, 1, false);
                    C20612a.m22480i().mo142622e().mo142628f(-5);
                    C20633g.this.mo32309g(-5);
                    return;
                }
                C102911g e = C20612a.m22480i().mo142622e();
                long j = rVar.f62305i;
                e.f303755i = j;
                Log.m105925i("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp BigDataSize[%d]", Long.valueOf(j));
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, Boolean.FALSE);
                C20842c.m22889z1();
                C20633g gVar = C20633g.this;
                C20842c.m22879k1(11, gVar.f58097i);
                C59705n nVar = new C59705n(gVar.f58089a, gVar.f58094f, gVar.f58095g);
                Log.m105925i("MicroMsg.BackupPcServer", "backupPcSendRequestSession, chooseConvNames size[%d]", Integer.valueOf(gVar.f58089a.size()));
                nVar.mo32547o1();
                return;
            }
            Log.m105921e("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp failed, errType[%d], errCode[%d], errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
            C115669n.INSTANCE.idkeyStat(400, 117, 1, false);
            C20612a.m22480i().mo142622e().mo142628f(-5);
            C20633g.this.mo32309g(-5);
        }
    }

    /* renamed from: ev0.g$b */
    public class C20635b implements C11385n {
        public C20635b() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C20842c.m22884u1(11, C20633g.this.f58097i);
            if (i == 0 && i2 == 0) {
                C62567m mVar = ((C59705n) yVar).f170563v;
                LinkedList<C23367h> r = C102913k.m136053r(mVar.f177715d, mVar.f177716e);
                Log.m105925i("MicroMsg.BackupPcServer", "requestSessionSceneEnd receive requestsessionResp, backupSessionList size[%d]", Integer.valueOf(r.size()));
                C20633g.this.f58091c.mo37046d(r, C20612a.m22480i().mo32274j().f58038o, C20633g.f58086l);
                return;
            }
            Log.m105921e("MicroMsg.BackupPcServer", "requestSessionSceneEnd sessionName or timeInterval null or request session resp number error, errType[%d], errCode[%d], errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), str);
            C115669n.INSTANCE.idkeyStat(400, 119, 1, false);
            C20633g.this.mo32307e(false);
            C20612a.m22480i().mo142622e().mo142628f(-5);
            C20633g.this.mo32309g(-5);
        }
    }

    /* renamed from: ev0.g$c */
    public class C20636c implements C20842c.C20846e {

        /* renamed from: ev0.g$c$a */
        public class C20637a implements C20842c.C20844c {
            public C20637a() {
            }

            /* renamed from: a */
            public void mo32310a(boolean z) {
                if (z) {
                    Log.m105924i("MicroMsg.BackupPcServer", "onBackupPcServerNotify resendSceneMap finish");
                    C20856m mVar = C20842c.f58884r;
                    if (mVar != null) {
                        mVar.f58934b = 0;
                        return;
                    }
                    return;
                }
                C20633g.this.mo32309g(C20612a.m22480i().mo142622e().mo142623a());
            }
        }

        public C20636c() {
        }

        /* renamed from: a */
        public void mo17669a(boolean z, int i, byte[] bArr, int i2) {
            int i3 = i;
            byte[] bArr2 = bArr;
            int i4 = C20612a.m22480i().mo32274j().f58024a;
            Object[] objArr = new Object[6];
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
            objArr[4] = Boolean.valueOf(C20633g.f58088n);
            objArr[5] = Integer.valueOf(i4);
            Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify isLocal[%b], type[%d], seq[%d], buf[%d], isBackupFinish[%b], commandMode:[%d]", objArr);
            if (!z || bArr2 == null) {
                if (1 != i4 && 3 != i4) {
                    return;
                }
                if (i3 == 10) {
                    C62561i iVar = new C62561i();
                    try {
                        iVar.parseFrom(bArr2);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BackupPcServer", e, "onBackupPcServerNotify buf to BackupHeartBeatResponse error.", new Object[0]);
                    }
                    Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive heartbeatResp, ack[%d]", Long.valueOf(iVar.f177692d));
                } else if (i3 == 5) {
                    Log.m105924i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive cancelReq");
                    C20633g.this.mo32307e(true);
                    C20612a.m22480i().mo142622e().mo142628f(-100);
                    C20633g.this.mo32309g(-100);
                    C115669n.INSTANCE.idkeyStat(400, 51, 1, false);
                    C20633g.this.mo32306d(13737, 5);
                } else if (i3 == 18) {
                    C47526f fVar = new C47526f();
                    try {
                        fVar.parseFrom(bArr2);
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.BackupPcServer", e2, "onBackupPcServerNotify buf to BackupCommandResponse error.", new Object[0]);
                    }
                    Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive commandResp, cmd[%d]", Integer.valueOf(fVar.f127502d));
                    if (fVar.f127502d == 9) {
                        C20856m mVar = C20842c.f58884r;
                        int i5 = mVar == null ? 0 : mVar.f58934b;
                        if (i5 == 1) {
                            if (mVar != null) {
                                mVar.f58934b = 2;
                            }
                            Log.m105924i("MicroMsg.BackupPcServer", "onBackupPcServerNotify reconnect success, start resendSceneMap");
                            C20633g.this.mo32306d(13737, 20);
                            C20842c.m22875C1();
                            C20612a.m22480i().mo142622e().mo142628f(14);
                            C20633g.this.mo32309g(14);
                            C20842c.f58877h.postAtFrontOfQueue(new C20848d(new C20637a()));
                            return;
                        }
                        Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify reconnect is started, ignore. state[%d]", Integer.valueOf(i5));
                    }
                } else if (i3 == 17) {
                    C62559e eVar = new C62559e();
                    try {
                        eVar.parseFrom(bArr2);
                    } catch (Exception e3) {
                        Log.printErrStackTrace("MicroMsg.BackupPcServer", e3, "onBackupPcServerNotify buf to BackupCommandRequest error.", new Object[0]);
                    }
                    Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify receive commandReq, cmd[%d]", Integer.valueOf(eVar.f177684d));
                    if (eVar.f177684d == 10) {
                        int a = C20612a.m22480i().mo142622e().mo142623a();
                        Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify pc request disconnect, backupPcState[%d]", Integer.valueOf(a));
                        if (a == 12 || a == 14) {
                            C20633g.this.mo32307e(true);
                            C20612a.m22480i().mo32273h().mo37036e();
                            C20612a.m22480i().mo142622e().mo142628f(-4);
                            C20633g.this.mo32309g(-4);
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.idkeyStat(400, 51, 1, false);
                            C20633g.this.mo32306d(13737, 5);
                            long j = C20633g.this.f58091c.f67623l;
                            long j2 = 0;
                            if (j != 0) {
                                j2 = Util.milliSecondsToNow(j);
                            }
                            long j3 = j2 / 1000;
                            nVar.mo160131h(13737, 3, Long.valueOf(C20633g.this.f58091c.f67622k / 1024), Long.valueOf(j3), 1);
                            Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify transfer disconnect, backupDataSize[%d kb], backupCostTime[%d s]", Long.valueOf(C20633g.this.f58091c.f67622k / 1024), Long.valueOf(j3));
                        }
                    }
                }
            } else if (10011 == i3) {
                C20612a.m22480i().mo32274j().f58031h = false;
                int a2 = C20612a.m22480i().mo142622e().mo142623a();
                Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify local disconnect, backupPcState[%d]", Integer.valueOf(a2));
                if (a2 != -21) {
                    if (a2 != 1) {
                        if (a2 != 4) {
                            if (a2 != -5) {
                                if (a2 == -4) {
                                    C20633g.this.mo32307e(true);
                                    return;
                                } else if (a2 != 11) {
                                    if (!(a2 == 12 || a2 == 14)) {
                                        if (a2 == 15) {
                                            C20612a.m22480i().mo32273h().mo37036e();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                        if (!C20612a.m22480i().mo32274j().f58036m || C20633g.f58088n) {
                            Log.m105924i("MicroMsg.BackupPcServer", "onBackupPcServerNotify not support reconnect, disconnect");
                            C20633g.this.mo32307e(true);
                            C20612a.m22480i().mo32273h().mo37036e();
                            C20612a.m22480i().mo142622e().mo142628f(-4);
                            C20633g.this.mo32309g(-4);
                            C115669n.INSTANCE.idkeyStat(400, 9, 1, false);
                            C20633g.this.mo32306d(13737, 3);
                            return;
                        }
                        C20856m mVar2 = C20842c.f58884r;
                        int i6 = mVar2 == null ? 0 : mVar2.f58934b;
                        if (i6 != 0) {
                            if (i6 == 1) {
                                Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify already start reconnect, state[%d]", Integer.valueOf(i6));
                                return;
                            } else if (i6 != 2) {
                                return;
                            }
                        }
                        Log.m105925i("MicroMsg.BackupPcServer", "onBackupPcServerNotify startBackupReconnectHandler, reconnectState[%d]", Integer.valueOf(i6));
                        C20633g.this.mo32306d(13737, 19);
                        C20633g.this.f58093e = true;
                        C20842c.m22888y1(C20612a.m22480i().mo32274j().f58044u);
                        return;
                    }
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo142622e().mo142628f(-100);
                    C20633g.this.mo32309g(-100);
                    return;
                }
                C20612a.m22480i().mo32273h().mo37036e();
            }
        }
    }

    /* renamed from: ev0.g$d */
    public class C20638d implements C23365c {

        /* renamed from: ev0.g$d$a */
        public class C20639a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Set f58105d;

            /* renamed from: e */
            public final /* synthetic */ int f58106e;

            public C20639a(C20638d dVar, Set set, int i) {
                this.f58105d = set;
                this.f58106e = i;
            }

            public void run() {
                for (C23366d K : this.f58105d) {
                    K.mo17667K(this.f58106e);
                }
            }
        }

        /* renamed from: ev0.g$d$b */
        public class C20640b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f58107d;

            public C20640b(int i) {
                this.f58107d = i;
            }

            public void run() {
                C23364b bVar = C20633g.this.f58090b;
                if (bVar != null) {
                    ((C21140c.C21141a) bVar).mo33100a(this.f58107d);
                }
            }
        }

        public C20638d() {
        }

        /* renamed from: K */
        public void mo17705K(int i) {
            HashSet hashSet = new HashSet(C20633g.this.f58092d);
            Log.m105919d("MicroMsg.BackupPcServer", "onUpdateUIProgress :%s", Util.getStack());
            MMHandlerThread.postToMainThread(new C20639a(this, hashSet, i));
            if (C20633g.this.f58090b != null) {
                MMHandlerThread.postToMainThread(new C20640b(i));
            }
        }

        /* renamed from: L */
        public void mo17706L() {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(400, 11, 1, false);
            C23584k kVar = C20633g.this.f58091c;
            nVar.idkeyStat(400, 12, kVar == null ? 0 : Util.milliSecondsToNow(kVar.f67623l) / 1000, false);
            C23584k kVar2 = C20633g.this.f58091c;
            nVar.idkeyStat(400, 13, kVar2 == null ? 0 : kVar2.f67622k / 1024, false);
            C20633g.this.mo32306d(13737, 0);
            C20842c.m22874B1(11);
            C20633g gVar = C20633g.this;
            if (!gVar.f58093e) {
                gVar.mo32306d(13737, 21);
            }
        }

        /* renamed from: a */
        public void mo17707a(boolean z) {
            Log.m105925i("MicroMsg.BackupPcServer", "onBackupPackAndSendCallback onCancel, isSelf[%b]", Boolean.valueOf(z));
            C20633g.this.mo32307e(z);
            C115669n.INSTANCE.idkeyStat(400, 120, 1, false);
        }
    }

    /* renamed from: a */
    public void mo17697a(int i, long j, long j2, int i2) {
        Log.m105925i("MicroMsg.BackupPcServer", "setBackupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2));
        if (i == 0) {
            j = 0;
            j2 = 0;
        }
        C20612a.m22480i();
        SharedPreferences.Editor edit = C102910f.m136016d().edit();
        edit.putInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", i);
        edit.putInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", i2);
        edit.putLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", j);
        edit.putLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", j2);
        edit.apply();
    }

    /* renamed from: b */
    public void mo17698b(LinkedList<String> linkedList) {
        this.f58089a = linkedList;
        C20612a.m22480i();
        SharedPreferences d = C102910f.m136016d();
        f58087m = d.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0) == 1;
        this.f58094f = d.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0);
        this.f58095g = d.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0);
        f58086l = d.getInt("BACKUP_PC_CHOOSE_SELECT_CONTENT_TYPE", 0) == 1;
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(linkedList == null ? -1 : linkedList.size());
        objArr[1] = Boolean.valueOf(f58087m);
        objArr[2] = Boolean.valueOf(f58086l);
        objArr[3] = Long.valueOf(this.f58094f);
        objArr[4] = Long.valueOf(this.f58095g);
        Log.m105925i("MicroMsg.BackupPcServer", "setBackupChooseData users size[%d], isSelectTime[%b], isQuickBackup[%b], selectStartTime[%d], selectEndTime[%d]", objArr);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_PC_BACKUPING_BOOLEAN, Boolean.TRUE);
    }

    /* renamed from: c */
    public void mo32305c(long j) {
        Log.m105924i("MicroMsg.BackupPcServer", "backupPcSendStartRequest");
        int i = 3;
        C20842c.m22879k1(3, this.f58096h);
        C20862p pVar = new C20862p(C20612a.m22480i().f303742b);
        PLong pLong = new PLong();
        PLong pLong2 = new PLong();
        C102913k.m136040e(0, pLong, pLong2, C97625j3.m125812b().mo105891f());
        if (!f58086l) {
            i = ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, Boolean.FALSE)).booleanValue() ? 0 : 1;
        }
        pVar.mo32563F1(j, C102913k.m136054s(pLong2.value), i, Long.valueOf((C20612a.m22480i().mo32277m().mo140768e() / 1024) / 1024), C20612a.m22482o().f58033j);
        Log.m105925i("MicroMsg.BackupPcServer", "backupPcSendStartRequest sessionCount:%d, transferType:%d", Long.valueOf(j), Integer.valueOf(i));
        pVar.mo32547o1();
    }

    /* renamed from: d */
    public void mo32306d(int i, int i2) {
        long j;
        C23584k kVar = this.f58091c;
        long j2 = 0;
        if (kVar != null) {
            long j3 = kVar.f67623l;
            if (j3 != 0) {
                j2 = Util.milliSecondsToNow(j3);
            }
            long j4 = j2;
            j2 = this.f58091c.f67622k / 1024;
            j = j4;
        } else {
            j = 0;
        }
        long j5 = j / 1000;
        C115669n.INSTANCE.mo160131h(i, Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j5), 1, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
        Log.m105925i("MicroMsg.BackupPcServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], backupCostTime[%d s]", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j5));
    }

    /* renamed from: e */
    public void mo32307e(boolean z) {
        Log.m105925i("MicroMsg.BackupPcServer", "cancel, isSelf[%b], Caller:%s", Boolean.valueOf(z), MMStack.getCaller());
        f58088n = true;
        if (!z) {
            C20612a.m22480i().mo32274j().mo32280d();
        }
        C23584k kVar = this.f58091c;
        if (kVar != null) {
            kVar.mo37043a();
        }
        C20842c.m22876D1();
        C20842c.m22877E1();
        C20842c.m22875C1();
        C20612a.m22480i().mo17659g();
    }

    /* renamed from: f */
    public void mo32308f() {
        Log.m105924i("MicroMsg.BackupPcServer", "BackupPcServer init.");
        f58088n = false;
        this.f58093e = false;
        C20842c.f58878i = this.f58098j;
        C23584k kVar = this.f58091c;
        if (kVar != null) {
            kVar.mo37043a();
        }
        this.f58091c = new C23584k(C20612a.m22480i(), 1, this.f58099k);
    }

    /* renamed from: g */
    public void mo32309g(int i) {
        ((C20638d) this.f58099k).mo17705K(i);
    }
}
