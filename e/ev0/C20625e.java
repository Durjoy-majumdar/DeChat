package ev0;

import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.jniinterface.AesEcb;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30754l;
import com.tencent.p014mm.storage.C30760n;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import f40.C86709a0;
import gv0.C20842c;
import gv0.C20856m;
import iv0.C21140c;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import pe3.C89349b;
import pv0.C100963a0;
import pv0.C100964b0;
import pv0.C118128c0;
import pv0.C118129d0;
import pv0.C22015q;
import pv0.C22016r;
import pv0.C47526f;
import pv0.C47527g;
import pv0.C62559e;
import pv0.C62561i;
import pv0.C62564k0;
import pv0.C62565l;
import pv0.C62566l0;
import pv0.C62567m;
import yu0.C102909e;
import yu0.C102911g;
import yu0.C102913k;
import yu0.C23364b;
import yu0.C23366d;
import zt3.C119157j;
import zu0.C103090n;
import zu0.C23574b;
import zu0.C23575c;

/* renamed from: ev0.e */
public class C20625e implements C102909e {

    /* renamed from: w */
    public static boolean f58056w;

    /* renamed from: x */
    public static boolean f58057x;

    /* renamed from: d */
    public C103090n f58058d;

    /* renamed from: e */
    public long f58059e = 0;

    /* renamed from: f */
    public long f58060f = 0;

    /* renamed from: g */
    public Object f58061g = new Object();

    /* renamed from: h */
    public boolean f58062h = false;

    /* renamed from: i */
    public LinkedList<String> f58063i = new LinkedList<>();

    /* renamed from: j */
    public LinkedList<Long> f58064j;

    /* renamed from: n */
    public Set<C23366d> f58065n = new HashSet();

    /* renamed from: o */
    public C23364b f58066o;

    /* renamed from: p */
    public HashSet<String> f58067p = new HashSet<>();

    /* renamed from: q */
    public long f58068q = 0;

    /* renamed from: r */
    public long f58069r = 0;

    /* renamed from: s */
    public long f58070s = 0;

    /* renamed from: t */
    public boolean f58071t = false;

    /* renamed from: u */
    public boolean f58072u = false;

    /* renamed from: v */
    public final C20842c.C20846e f58073v = new C20627b();

    /* renamed from: ev0.e$a */
    public class C20626a implements Runnable {
        public C20626a() {
        }

        public void run() {
            C20625e.this.mo32293c();
        }
    }

    /* renamed from: ev0.e$b */
    public class C20627b implements C20842c.C20846e {

        /* renamed from: ev0.e$b$a */
        public class C20628a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f58076d;

            /* renamed from: e */
            public final /* synthetic */ byte[] f58077e;

            /* renamed from: f */
            public final /* synthetic */ int f58078f;

            public C20628a(int i, byte[] bArr, int i2) {
                this.f58076d = i;
                this.f58077e = bArr;
                this.f58078f = i2;
            }

            public void run() {
                C89349b bVar;
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_BACKUP_PC_RECOVERING_BOOLEAN;
                int i = this.f58076d;
                if (i == 3) {
                    C20625e eVar = C20625e.this;
                    byte[] bArr = this.f58077e;
                    int i2 = this.f58078f;
                    eVar.getClass();
                    C22015q qVar = (C22015q) C102913k.m136031C(new C22015q(), bArr);
                    long j = qVar.f62297i * 1024 * 1024;
                    eVar.f58059e = j;
                    C20842c.f58882p.mo32561b(j);
                    if (!C20612a.m22480i().f303742b.equals(qVar.f62292d)) {
                        Log.m105921e("MicroMsg.BackupPcRecoverServer", "startRequestNotify BackupStartRequest parseBuf:%d failed or wrong id[%s,%s]", Integer.valueOf(Util.getLength(bArr)), qVar.f62292d, C20612a.m22480i().f303742b);
                        eVar.mo32296f(1, i2, 0);
                        eVar.mo32292b(false, false, -5);
                        C115669n.INSTANCE.idkeyStat(400, 121, 1, false);
                        return;
                    }
                    C20612a.m22480i().mo142622e().f303755i = qVar.f62293e;
                    if (qVar.f62298j == 3) {
                        eVar.f58071t = true;
                        C115669n.INSTANCE.idkeyStat(400, 36, 1, false);
                        Log.m105924i("MicroMsg.BackupPcRecoverServer", "isQuickBackup!!!");
                    }
                    long j2 = qVar.f62297i;
                    PLong pLong = new PLong();
                    PLong pLong2 = new PLong();
                    C102913k.m136040e(0, pLong, pLong2, C97625j3.m125812b().mo105891f());
                    long j3 = pLong2.value;
                    double d = ((double) j2) * 0.1d;
                    if (d > 5.24288E8d) {
                        d = 5.24288E8d;
                    }
                    long j4 = j3 - ((long) d);
                    long nowMilliSecond = Util.nowMilliSecond();
                    eVar.f58068q = nowMilliSecond;
                    Log.m105925i("MicroMsg.BackupPcRecoverServer", "startRequestNotify time:%d SessionCount:%d, MsgCount:%d, DataSize:%d validSize:%d", Long.valueOf(nowMilliSecond), Long.valueOf(qVar.f62294f), Long.valueOf(qVar.f62295g), Long.valueOf(j2), Long.valueOf(j4));
                    if (j4 >= j2) {
                        eVar.mo32296f(0, i2, j4);
                        C20842c.m22889z1();
                        return;
                    }
                    Log.m105921e("MicroMsg.BackupPcRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d", Long.valueOf(j4), Long.valueOf(j2));
                    eVar.mo32296f(2, i2, j4);
                    C23575c h = C20612a.m22480i().mo32273h();
                    MMHandler mMHandler = h.f67582g;
                    if (mMHandler == null) {
                        h.mo37036e();
                    } else {
                        mMHandler.postDelayed(new C23574b(h), (long) 10);
                    }
                    C20612a.m22480i().mo142622e().mo142628f(-13);
                    eVar.mo17667K(-13);
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(400, 6, 1, false);
                    nVar.mo160131h(13736, 5, null, null, 2, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
                } else if (i == 11) {
                    C20625e eVar2 = C20625e.this;
                    byte[] bArr2 = this.f58077e;
                    int i3 = this.f58078f;
                    eVar2.getClass();
                    C62565l lVar = (C62565l) C102913k.m136031C(new C62565l(), bArr2);
                    if (lVar == null) {
                        Log.m105921e("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify parseBuf failed:%d", Integer.valueOf(Util.getLength(bArr2)));
                        C20612a.m22480i().mo142622e().mo142628f(-21);
                        eVar2.mo17667K(-21);
                        return;
                    }
                    eVar2.f58063i = lVar.f177709d;
                    LinkedList<Long> linkedList = lVar.f177710e;
                    eVar2.f58064j = linkedList;
                    if (linkedList.size() != eVar2.f58063i.size() * 2) {
                        eVar2.mo32292b(false, false, -21);
                        C115669n.INSTANCE.idkeyStat(400, 119, 1, false);
                        return;
                    }
                    C20612a.m22480i().mo142622e().mo142626d(23, 1, eVar2.f58063i.size());
                    eVar2.mo17667K(23);
                    LinkedList<String> linkedList2 = new LinkedList<>();
                    LinkedList<Long> linkedList3 = new LinkedList<>();
                    C97625j3.m125812b().mo105896k().mo57673jo(eVar2.f58063i, eVar2.f58064j, linkedList2, linkedList3);
                    C62567m mVar = new C62567m();
                    mVar.f177715d = linkedList2;
                    mVar.f177716e = linkedList3;
                    C20842c.m22873A1();
                    try {
                        Log.m105925i("MicroMsg.BackupPcRecoverServer", "requestSessionListNotify send requestsession resp, SessionName size:%d, TimeInterval size:%d", Integer.valueOf(eVar2.f58063i.size()), Integer.valueOf(linkedList3.size()));
                        C20842c.m22886w1(mVar.toByteArray(), 12, i3);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e, "BackupRequestSessionResponse to buf err.", new Object[0]);
                    }
                } else if (i == 6) {
                    C20625e eVar3 = C20625e.this;
                    byte[] bArr3 = this.f58077e;
                    int i4 = this.f58078f;
                    eVar3.getClass();
                    C100963a0 a0Var = (C100963a0) C102913k.m136031C(new C100963a0(), bArr3);
                    if (a0Var == null) {
                        Log.m105921e("MicroMsg.BackupPcRecoverServer", "dataPushNotify parseBuf failed:%d", Integer.valueOf(Util.getLength(bArr3)));
                        eVar3.mo32297g("", 0, 0, 0, 1, i4);
                        return;
                    }
                    Log.m105925i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive recoverData id:%s, type:%d, start:%d, end:%d, isCancel:%b", a0Var.f295636d, Integer.valueOf(a0Var.f295637e), Integer.valueOf(a0Var.f295639g), Integer.valueOf(a0Var.f295640h), Boolean.valueOf(eVar3.f58062h));
                    if (!eVar3.f58062h) {
                        if (!(C20612a.m22480i().f303746f == null || (bVar = a0Var.f295642j) == null)) {
                            a0Var.f295642j = new C89349b(AesEcb.aesCryptEcb(bVar.f257327a, C20612a.m22480i().f303746f, false, a0Var.f295640h == a0Var.f295638f));
                        }
                        if (a0Var.f295637e == 1 && a0Var.f295642j != null) {
                            String n = C102913k.m136049n(a0Var.f295636d);
                            Log.m105925i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush text dataid:%s, dir:%s", a0Var.f295636d, n);
                            C102913k.m136038c(n, a0Var);
                            eVar3.f58060f += (long) a0Var.f295642j.f257327a.length;
                        }
                        if (a0Var.f295637e == 2) {
                            String o = C102913k.m136050o(a0Var.f295636d);
                            Log.m105925i("MicroMsg.BackupPcRecoverServer", "dataPushNotify receive datapush media dataid:%s, dir:%s", a0Var.f295636d, o);
                            C102913k.m136035G(o, a0Var);
                            eVar3.f58060f += (long) a0Var.f295642j.f257327a.length;
                        }
                        Log.m105925i("MicroMsg.BackupPcRecoverServer", "dataPushNotify recvSize/convDataSize: %d, %d", Long.valueOf(eVar3.f58060f), Long.valueOf(eVar3.f58059e));
                        long j5 = eVar3.f58059e;
                        long j6 = eVar3.f58060f;
                        if (j5 < j6) {
                            eVar3.f58059e = j6;
                            C20842c.f58882p.mo32561b(j6);
                        }
                        eVar3.mo32297g(a0Var.f295636d, a0Var.f295637e, a0Var.f295639g, a0Var.f295640h, 0, i4);
                    }
                } else if (i == 13) {
                    C20625e eVar4 = C20625e.this;
                    byte[] bArr4 = this.f58077e;
                    int i5 = this.f58078f;
                    eVar4.getClass();
                    C62564k0 k0Var = (C62564k0) C102913k.m136031C(new C62564k0(), bArr4);
                    if (k0Var == null) {
                        Log.m105921e("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify PacketSvrIDRequest parse failed :%d", Integer.valueOf(Util.getLength(bArr4)));
                        return;
                    }
                    C62566l0 l0Var = new C62566l0();
                    l0Var.f177711d = k0Var.f177705d;
                    l0Var.f177713f = k0Var.f177707f;
                    l0Var.f177712e = k0Var.f177706e;
                    l0Var.f177714g = k0Var.f177708g;
                    try {
                        Log.m105924i("MicroMsg.BackupPcRecoverServer", "requestBigFileSvrIdNotify send SvrID resp");
                        C20842c.m22886w1(l0Var.toByteArray(), 14, i5);
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e2, "PacketSvrIDResponse to buf err.", new Object[0]);
                    }
                } else if (i == 15) {
                    C20625e eVar5 = C20625e.this;
                    byte[] bArr5 = this.f58077e;
                    int i6 = this.f58078f;
                    eVar5.getClass();
                    C118128c0 c0Var = (C118128c0) C102913k.m136031C(new C118128c0(), bArr5);
                    if (c0Var == null) {
                        Log.m105921e("MicroMsg.BackupPcRecoverServer", "SendTagNotify PacketBackupDataTag parse failed:%d", Integer.valueOf(Util.getLength(bArr5)));
                        return;
                    }
                    Log.m105925i("MicroMsg.BackupPcRecoverServer", "SendTagNotify receive tagReq, MsgDataID:%s, BakChatName:%s, StartTime:%d, EndTime:%d,  NickName:%s, isCancel:%b", c0Var.f353135g, c0Var.f353132d, Long.valueOf(c0Var.f353133e), Long.valueOf(c0Var.f353134f), c0Var.f353136h, Boolean.valueOf(eVar5.f58062h));
                    eVar5.f58067p.add(c0Var.f353132d);
                    if (!eVar5.f58062h) {
                        C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.TRUE);
                        C102911g e3 = C20612a.m22480i().mo142622e();
                        C20612a.m22480i().mo142622e().mo142626d(e3.mo142623a(), eVar5.f58067p.size() < eVar5.f58063i.size() ? eVar5.f58067p.size() : eVar5.f58063i.size(), eVar5.f58063i.size());
                        eVar5.mo17667K(e3.mo142623a());
                        if (C97625j3.m125812b().mo105895j().mo57666Lo(c0Var.f353135g) != null) {
                            Log.m105925i("MicroMsg.BackupPcRecoverServer", "SendTagNotify the same tag has received, ignore. MsgDataID:%s", c0Var.f353135g);
                        } else {
                            C30754l lVar2 = new C30754l();
                            lVar2.field_msgListDataId = c0Var.f353135g;
                            lVar2.field_sessionName = c0Var.f353132d;
                            Log.m105925i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupRecoverMsgListDataIdStorage ret[%b], systemRowid[%d]", Boolean.valueOf(C97625j3.m125812b().mo105895j().insert(lVar2)), Long.valueOf(lVar2.systemRowid));
                            C30760n nVar2 = new C30760n();
                            nVar2.field_sessionName = c0Var.f353132d;
                            nVar2.field_startTime = c0Var.f353133e;
                            nVar2.field_endTime = c0Var.f353134f;
                            Log.m105925i("MicroMsg.BackupPcRecoverServer", "SendTagNotify insert BackupTempMoveTimeStorage ret[%b], systemRowid[%d]", Boolean.valueOf(C97625j3.m125812b().mo105896k().insert(nVar2)), Long.valueOf(nVar2.systemRowid));
                        }
                        C118129d0 d0Var = new C118129d0();
                        d0Var.f353138d = c0Var.f353132d;
                        d0Var.f353139e = c0Var.f353133e;
                        d0Var.f353140f = c0Var.f353134f;
                        d0Var.f353141g = c0Var.f353135g;
                        try {
                            Log.m105924i("MicroMsg.BackupPcRecoverServer", "tagReqNotify send tag resp");
                            C20842c.m22886w1(d0Var.toByteArray(), 16, i6);
                        } catch (Exception e4) {
                            Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e4, "tagReqNotify buf to PacketBackupDataTagResponse err.", new Object[0]);
                        }
                    }
                } else if (i == 8) {
                    C20625e eVar6 = C20625e.this;
                    byte[] bArr6 = this.f58077e;
                    eVar6.getClass();
                    Log.m105925i("MicroMsg.BackupPcRecoverServer", "finishReqNotify receive finishReq. hasReceiveFinishReq[%b]", Boolean.valueOf(C20625e.f58057x));
                    if (C20625e.f58057x) {
                        Log.m105920e("MicroMsg.BackupPcRecoverServer", "finishReqNotify has receive finishReq, return.");
                        return;
                    }
                    C20625e.f58057x = true;
                    C47527g gVar = new C47527g();
                    if (C102913k.m136031C(gVar, bArr6) == null) {
                        Log.m105921e("MicroMsg.BackupPcRecoverServer", "finishReqNotify buf to BackupFinishRequest error, buflen[%d]", Integer.valueOf(Util.getLength(bArr6)));
                    }
                    C102913k.m136032D(gVar.f127515r);
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
                    C20842c.m22876D1();
                    C20842c.m22877E1();
                    C20625e.f58056w = true;
                    C20612a.m22480i().mo142622e().mo142626d(24, eVar6.f58067p.size(), eVar6.f58063i.size());
                    eVar6.mo17667K(24);
                    C115669n nVar3 = C115669n.INSTANCE;
                    nVar3.idkeyStat(400, 19, 1, false);
                    long nowMilliSecond2 = Util.nowMilliSecond();
                    eVar6.f58070s = nowMilliSecond2;
                    String str = "MicroMsg.BackupPcRecoverServer";
                    long j7 = (nowMilliSecond2 - eVar6.f58068q) / 1000;
                    nVar3.idkeyStat(400, 20, j7, false);
                    nVar3.idkeyStat(400, 21, eVar6.f58059e / 1024, false);
                    eVar6.mo32291a(13737, 0);
                    if (!eVar6.f58072u) {
                        eVar6.mo32291a(13737, 21);
                    }
                    Log.m105925i(str, "finishReqNotify recover success. hasEnterReconnect[%b], recoverCostTime[%d s], recoverStartTime[%d], recoverEndTime[%d], recoverTotalSize[%d kb]", Boolean.valueOf(eVar6.f58072u), Long.valueOf(j7), Long.valueOf(eVar6.f58068q), Long.valueOf(eVar6.f58070s), Long.valueOf(eVar6.f58059e / 1024));
                }
            }
        }

        public C20627b() {
        }

        /* renamed from: a */
        public void mo17669a(boolean z, int i, byte[] bArr, int i2) {
            int i3 = i;
            byte[] bArr2 = bArr;
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = Integer.valueOf(bArr2 == null ? 0 : bArr2.length);
            Log.m105925i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify isLocal[%b], type[%d], seq[%d], buflen[%d]", objArr);
            if (z && 10011 == i3) {
                C20625e eVar = C20625e.this;
                eVar.getClass();
                int a = C20612a.m22480i().mo142622e().mo142623a();
                Log.m105925i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify local disconnect, backupPcState[%d], isRecoverFinish[%b]", Integer.valueOf(a), Boolean.valueOf(C20625e.f58056w));
                if (!(a == -21 || a == -13)) {
                    if (a != 1) {
                        if (a != 4) {
                            if (a == 27) {
                                C20612a.m22480i().mo32273h().mo37036e();
                                if (!C20612a.m22480i().mo32274j().mo32285i()) {
                                    C20612a.m22480i().mo142622e().mo142628f(-100);
                                    eVar.mo17667K(-100);
                                    return;
                                }
                                return;
                            } else if (a != -5) {
                                if (a != -4) {
                                    switch (a) {
                                        case 21:
                                            break;
                                        case 22:
                                        case 23:
                                            break;
                                        default:
                                            return;
                                    }
                                } else {
                                    eVar.mo32292b(true, false, 0);
                                    return;
                                }
                            }
                        }
                        if (!C20612a.m22480i().mo32274j().f58036m || C20625e.f58056w) {
                            Log.m105924i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify not support reconnect, disconnect");
                            eVar.mo32292b(true, false, -4);
                            C20612a.m22480i().mo32273h().mo37036e();
                            C115669n.INSTANCE.idkeyStat(400, 17, 1, false);
                            eVar.mo32291a(13737, 3);
                            return;
                        }
                        C20856m mVar = C20842c.f58884r;
                        int i4 = mVar == null ? 0 : mVar.f58934b;
                        if (i4 != 0) {
                            if (i4 == 1) {
                                Log.m105925i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify already start reconnect, state[%d]", Integer.valueOf(i4));
                                return;
                            } else if (i4 != 2) {
                                return;
                            }
                        }
                        Log.m105925i("MicroMsg.BackupPcRecoverServer", "networkDisconnectNotify startBackupReconnectHandler, reconnectState[%d]", Integer.valueOf(i4));
                        eVar.mo32291a(13737, 19);
                        eVar.f58072u = true;
                        C20842c.m22888y1(C20612a.m22480i().mo32274j().f58044u);
                        return;
                    }
                    C20612a.m22480i().mo32273h().mo37036e();
                    C20612a.m22480i().mo142622e().mo142628f(-100);
                    eVar.mo17667K(-100);
                    return;
                }
                C20612a.m22480i().mo32273h().mo37036e();
            } else if (i3 == 5) {
                Log.m105924i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive cancelReq.");
                C20625e.this.mo32292b(true, false, -100);
                C115669n.INSTANCE.idkeyStat(400, 52, 1, false);
                C20625e.this.mo32291a(13737, 5);
            } else {
                int i5 = C20612a.m22480i().mo32274j().f58024a;
                if (2 != i5 && 4 != i5) {
                    Log.m105921e("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify cmdmode error[%d]", Integer.valueOf(C20612a.m22480i().mo32274j().f58024a));
                } else if (i3 == 10) {
                    C62561i iVar = (C62561i) C102913k.m136031C(new C62561i(), bArr2);
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Long.valueOf(iVar != null ? iVar.f177692d : -1);
                    Log.m105925i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive heartbeatResp, ack[%d]", objArr2);
                } else if (i3 == 18) {
                    C47526f fVar = new C47526f();
                    try {
                        fVar.parseFrom(bArr2);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e, "onBackupPcRecoverServerNotify buf to BackupCommandResponse error.", new Object[0]);
                    }
                    Log.m105925i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive commandResp, cmd[%d]", Integer.valueOf(fVar.f127502d));
                    if (fVar.f127502d == 9) {
                        C20856m mVar2 = C20842c.f58884r;
                        int i6 = mVar2 == null ? 0 : mVar2.f58934b;
                        if (i6 == 1) {
                            if (mVar2 != null) {
                                mVar2.f58934b = 2;
                            }
                            Log.m105924i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify reconnect success");
                            C20625e.this.mo32291a(13737, 20);
                            C20842c.m22875C1();
                            C20612a.m22480i().mo142622e().mo142628f(23);
                            C20625e.this.mo17667K(23);
                            C20856m mVar3 = C20842c.f58884r;
                            if (mVar3 != null) {
                                mVar3.f58934b = 0;
                                return;
                            }
                            return;
                        }
                        Log.m105925i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify reconnect is started, ignore. state[%d]", Integer.valueOf(i6));
                    }
                } else if (i3 == 17) {
                    C62559e eVar2 = new C62559e();
                    try {
                        eVar2.parseFrom(bArr2);
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e2, "onBackupPcRecoverServerNotify buf to BackupCommandRequest error.", new Object[0]);
                    }
                    Log.m105925i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify receive commandReq, cmd[%d]", Integer.valueOf(eVar2.f177684d));
                    if (eVar2.f177684d == 10) {
                        int a2 = C20612a.m22480i().mo142622e().mo142623a();
                        Log.m105925i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify pc request disconnect, backupPcState[%d]", Integer.valueOf(a2));
                        if (a2 == 22 || a2 == 23) {
                            C20625e.this.mo32292b(true, false, -4);
                            C20612a.m22480i().mo32273h().mo37036e();
                            C115669n nVar = C115669n.INSTANCE;
                            nVar.idkeyStat(400, 52, 1, false);
                            C20625e.this.mo32291a(13737, 5);
                            long j = C20625e.this.f58068q;
                            long j2 = 0;
                            if (j != 0) {
                                j2 = Util.milliSecondsToNow(j);
                            }
                            nVar.mo160131h(13737, 3, Long.valueOf(C20625e.this.f58059e), Long.valueOf(j2), 2);
                            Log.m105925i("MicroMsg.BackupPcRecoverServer", "onBackupPcRecoverServerNotify recover transfer disconnect, recoverDataSize:%d, recoverCostTime:%d", Long.valueOf(C20625e.this.f58059e), Long.valueOf(j2));
                        }
                    }
                } else {
                    C86709a0.m107525e().postToWorker(new C20628a(i3, bArr2, i2));
                }
            }
        }
    }

    /* renamed from: ev0.e$c */
    public class C20629c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Set f58080d;

        /* renamed from: e */
        public final /* synthetic */ int f58081e;

        public C20629c(C20625e eVar, Set set, int i) {
            this.f58080d = set;
            this.f58081e = i;
        }

        public void run() {
            for (C23366d K : this.f58080d) {
                K.mo17667K(this.f58081e);
            }
        }
    }

    /* renamed from: ev0.e$d */
    public class C20630d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f58082d;

        public C20630d(int i) {
            this.f58082d = i;
        }

        public void run() {
            C23364b bVar = C20625e.this.f58066o;
            if (bVar != null) {
                ((C21140c.C21141a) bVar).mo33100a(this.f58082d);
            }
        }
    }

    /* renamed from: ev0.e$e */
    public class C20631e implements Runnable {
        public C20631e() {
        }

        public void run() {
            C20625e.this.mo32293c();
        }
    }

    /* renamed from: K */
    public void mo17667K(int i) {
        MMHandlerThread.postToMainThread(new C20629c(this, new HashSet(this.f58065n), i));
        if (this.f58066o != null) {
            MMHandlerThread.postToMainThread(new C20630d(i));
        }
    }

    /* renamed from: P */
    public void mo17668P() {
        ((C119157j) C119157j.f356862d).mo183875f(new C20631e());
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(400, 27, 1, false);
        nVar.idkeyStat(400, 28, Util.milliSecondsToNow(this.f58069r) / 1000, false);
        C20842c.m22874B1(12);
        C20842c.m22876D1();
        C20842c.m22877E1();
    }

    /* renamed from: a */
    public void mo32291a(int i, int i2) {
        long j = this.f58068q;
        long j2 = 0;
        if (j != 0) {
            j2 = Util.milliSecondsToNow(j);
        }
        long j3 = j2 / 1000;
        C115669n.INSTANCE.mo160131h(i, Integer.valueOf(i2), Long.valueOf(this.f58059e / 1024), Long.valueOf(j3), 2, Integer.valueOf(C20612a.m22480i().mo32274j().f58038o));
        Log.m105925i("MicroMsg.BackupPcRecoverServer", "backupPcServerKvStat kvNum[%d], errcode[%d], backupDataSize[%d kb], recoverCostTime[%d s]", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(this.f58059e / 1024), Long.valueOf(j3));
    }

    /* renamed from: b */
    public void mo32292b(boolean z, boolean z2, int i) {
        boolean z3 = false;
        Log.m105925i("MicroMsg.BackupPcRecoverServer", "cancel isSelf[%b], needClearContinueRecoverData[%b], caller:%s", Boolean.valueOf(z), Boolean.valueOf(z2), MMStack.getCaller());
        f58056w = true;
        if (!z) {
            C20612a.m22480i().mo32274j().mo32280d();
        }
        synchronized (this.f58061g) {
            this.f58062h = true;
            C103090n nVar = this.f58058d;
            if (nVar == null || !nVar.f304169b) {
                z3 = true;
            } else {
                nVar.mo142822v(z2, i);
            }
            this.f58058d = null;
        }
        if (z3 && i != 0) {
            C20612a.m22480i().mo142622e().mo142628f(i);
            mo17667K(i);
        }
        if (z2) {
            ((C119157j) C119157j.f356862d).mo183875f(new C20626a());
        }
        C20842c.m22876D1();
        C20842c.m22877E1();
        C20842c.m22875C1();
        C20612a.m22480i().mo17659g();
    }

    /* renamed from: c */
    public void mo32293c() {
        Log.m105924i("MicroMsg.BackupPcRecoverServer", "clearContinueRecoverData");
        this.f58067p.clear();
        if (!C102913k.f303764a) {
            C102913k.m136047l(C102913k.m136051p());
        }
    }

    /* renamed from: d */
    public void mo32294d() {
        Log.m105924i("MicroMsg.BackupPcRecoverServer", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        this.f58072u = false;
        f58056w = false;
        f58057x = false;
        C20842c.f58878i = this.f58073v;
        this.f58059e = 0;
        this.f58060f = 0;
        this.f58062h = false;
        this.f58071t = false;
        this.f58067p.clear();
    }

    /* renamed from: e */
    public boolean mo32295e() {
        return C97625j3.m125812b().mo105895j().mo57669qq();
    }

    /* renamed from: f */
    public final void mo32296f(int i, int i2, long j) {
        C22016r rVar = new C22016r();
        rVar.f62300d = C20612a.m22480i().f303742b;
        rVar.f62303g = i;
        rVar.f62306j = C102913k.m136054s(j);
        try {
            Log.m105925i("MicroMsg.BackupPcRecoverServer", "send start resp, status[%d]", Integer.valueOf(i));
            C20842c.m22886w1(rVar.toByteArray(), 4, i2);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e, "buf to BackupStartRequest err.", new Object[0]);
        }
    }

    /* renamed from: g */
    public final void mo32297g(String str, int i, int i2, int i3, int i4, int i5) {
        C100964b0 b0Var = new C100964b0();
        b0Var.f295644d = str;
        b0Var.f295645e = i;
        b0Var.f295646f = i2;
        b0Var.f295647g = i3;
        b0Var.f295648h = i4;
        try {
            C20842c.m22886w1(b0Var.toByteArray(), 7, i5);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupPcRecoverServer", e, "sendResp", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32298h() {
        /*
            r20 = this;
            r9 = r20
            java.lang.Object r10 = r9.f58061g
            monitor-enter(r10)
            zu0.n r0 = r9.f58058d     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0017
            boolean r1 = r0.f304169b     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0017
            java.lang.String r0 = "MicroMsg.BackupPcRecoverServer"
            java.lang.String r1 = "startMerge hasStartMerge, return."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0093 }
            monitor-exit(r10)     // Catch:{ all -> 0x0093 }
            return
        L_0x0017:
            r11 = 0
            if (r0 == 0) goto L_0x001d
            r0.mo142822v(r11, r11)     // Catch:{ all -> 0x0093 }
        L_0x001d:
            java.util.HashSet<java.lang.String> r0 = r9.f58067p     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x002f
            int r0 = r0.size()     // Catch:{ all -> 0x0093 }
            if (r0 > 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            java.util.HashSet<java.lang.String> r0 = r9.f58067p     // Catch:{ all -> 0x0093 }
            int r0 = r0.size()     // Catch:{ all -> 0x0093 }
            goto L_0x003b
        L_0x002f:
            eb0.c r0 = eb0.C97625j3.m125812b()     // Catch:{ all -> 0x0093 }
            com.tencent.mm.storage.m r0 = r0.mo105895j()     // Catch:{ all -> 0x0093 }
            int r0 = r0.mo57668jo()     // Catch:{ all -> 0x0093 }
        L_0x003b:
            r5 = r0
            ev0.a r0 = ev0.C20612a.m22480i()     // Catch:{ all -> 0x0093 }
            yu0.g r0 = r0.mo142622e()     // Catch:{ all -> 0x0093 }
            r1 = 1
            r2 = 26
            r0.mo142626d(r2, r1, r5)     // Catch:{ all -> 0x0093 }
            r9.mo17667K(r2)     // Catch:{ all -> 0x0093 }
            java.util.LinkedList<java.lang.Long> r0 = r9.f58064j     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0058
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            r9.f58064j = r0     // Catch:{ all -> 0x0093 }
        L_0x0058:
            hv0.e r0 = hv0.C98544e.m128035f()     // Catch:{ all -> 0x0093 }
            r0.mo137899c()     // Catch:{ all -> 0x0093 }
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x0093 }
            r9.f58069r = r0     // Catch:{ all -> 0x0093 }
            hv0.e r0 = hv0.C98544e.m128035f()     // Catch:{ all -> 0x0093 }
            r0.mo137899c()     // Catch:{ all -> 0x0093 }
            zu0.n r0 = new zu0.n     // Catch:{ all -> 0x0093 }
            ev0.a r2 = ev0.C20612a.m22480i()     // Catch:{ all -> 0x0093 }
            r3 = 1
            boolean r6 = r9.f58071t     // Catch:{ all -> 0x0093 }
            java.util.LinkedList<java.lang.String> r7 = r9.f58063i     // Catch:{ all -> 0x0093 }
            java.util.LinkedList<java.lang.Long> r8 = r9.f58064j     // Catch:{ all -> 0x0093 }
            r1 = r0
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0093 }
            r9.f58058d = r0     // Catch:{ all -> 0x0093 }
            r0.mo142826z(r11)     // Catch:{ all -> 0x0093 }
            com.tencent.mm.plugin.report.service.n r12 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0093 }
            r13 = 400(0x190, double:1.976E-321)
            r15 = 24
            r17 = 1
            r19 = 0
            r12.idkeyStat(r13, r15, r17, r19)     // Catch:{ all -> 0x0093 }
            monitor-exit(r10)     // Catch:{ all -> 0x0093 }
            return
        L_0x0093:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0093 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ev0.C20625e.mo32298h():void");
    }
}
