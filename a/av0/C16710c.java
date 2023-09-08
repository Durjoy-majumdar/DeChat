package av0;

import android.content.SharedPreferences;
import android.os.Build;
import av0.C54335d;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import f40.C86709a0;
import gv0.C20842c;
import gv0.C20859o;
import hv0.C98544e;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import lc3.C10485b;
import p156gj.C87203t;
import p823sg.C90194m;
import pe3.C89349b;
import pv0.C100966p;
import pv0.C22015q;
import pv0.C22016r;
import pv0.C22017y;
import pv0.C22018z;
import pv0.C47525d;
import pv0.C47529h;
import pv0.C62561i;
import pv0.C62565l;
import pv0.C62567m;
import qe3.C89625d;
import yu0.C102909e;
import yu0.C102910f;
import yu0.C102913k;
import yu0.C23365c;
import yu0.C23367h;
import yu0.C23368l;
import zu0.C23584k;

/* renamed from: av0.c */
public class C16710c implements C23368l {

    /* renamed from: r */
    public static boolean f45178r;

    /* renamed from: s */
    public static boolean f45179s;

    /* renamed from: a */
    public LinkedList<String> f45180a;

    /* renamed from: b */
    public C23584k f45181b;

    /* renamed from: c */
    public long f45182c = 0;

    /* renamed from: d */
    public long f45183d = 0;

    /* renamed from: e */
    public boolean f45184e = false;

    /* renamed from: f */
    public int f45185f = 0;

    /* renamed from: g */
    public int f45186g;

    /* renamed from: h */
    public int f45187h;

    /* renamed from: i */
    public boolean f45188i = false;

    /* renamed from: j */
    public int f45189j = 0;

    /* renamed from: k */
    public Set<C102909e> f45190k = new HashSet();

    /* renamed from: l */
    public final C20842c.C20846e f45191l = new C16711a();

    /* renamed from: m */
    public C23365c f45192m = new C16712b();

    /* renamed from: n */
    public C20842c.C20845d f45193n = new C16714c(this);

    /* renamed from: o */
    public final C20859o.C20861b f45194o = new C16715d();

    /* renamed from: p */
    public byte[] f45195p;

    /* renamed from: q */
    public C54335d f45196q = new C54335d(new C16716e(), C16686a.m16193i().mo142622e());

    /* renamed from: av0.c$a */
    public class C16711a implements C20842c.C20846e {
        public C16711a() {
        }

        /* renamed from: a */
        public void mo17669a(boolean z, int i, byte[] bArr, int i2) {
            int i3 = i;
            byte[] bArr2 = bArr;
            int i4 = i2;
            Object[] objArr = new Object[4];
            objArr[0] = Boolean.valueOf(z);
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
            Log.m105925i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify isLocal:%b type:%d seq:%d buf:%d", objArr);
            if (z && bArr2 != null && 10011 == i3) {
                int a = C16686a.m16193i().mo142622e().mo142623a();
                Log.m105925i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify local disconnect, backupMoveState:%d", Integer.valueOf(a));
                if (!(a == -23 || a == -21)) {
                    if (a == 1) {
                        C16686a.m16193i().mo17660h().mo37036e();
                        C16686a.m16193i().mo142622e().mo142628f(-100);
                        C16710c.this.mo17704h(-100);
                    } else if (a == 12 || a == 14) {
                        C16710c.this.mo17701e(true);
                        C16686a.m16193i().mo17660h().mo37036e();
                        C16686a.m16193i().mo142622e().mo142628f(-4);
                        C16710c.this.mo17704h(-4);
                        C115669n.INSTANCE.idkeyStat(485, 24, 1, false);
                        C23584k kVar = C16710c.this.f45181b;
                        if (kVar != null) {
                            long j = kVar.f67623l;
                            if (j != 0) {
                                Log.m105925i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify backup transfer disconnect, backupDataSize:%d kb, backupCostTime:%d s", Long.valueOf(C16710c.this.f45181b.f67622k / 1024), Long.valueOf(Util.milliSecondsToNow(j) / 1000));
                            }
                        }
                    } else if (a != -5) {
                        if (a == -4) {
                            C16710c.this.mo17701e(true);
                        }
                    }
                }
                C16686a.m16193i().mo17660h().mo37036e();
            }
            if (i3 == 1) {
                C16710c.this.f45196q.mo75112d();
                C22017y yVar = (C22017y) C102913k.m136031C(new C22017y(), bArr2);
                if (yVar == null) {
                    Log.m105921e("MicroMsg.BackupMoveServer", "authReq parseBuf failed:%d", Integer.valueOf(Util.getLength(bArr)));
                    C16686a.m16193i().mo142622e().mo142628f(-5);
                    C16710c.this.mo17704h(-5);
                    return;
                }
                if (Util.isNullOrNil(C16686a.m16193i().f303742b)) {
                    C16686a.m16193i().f303742b = yVar.f62309e;
                }
                if (!yVar.f62309e.equals(C16686a.m16193i().f303742b)) {
                    Log.m105921e("MicroMsg.BackupMoveServer", "id not equel:self:%s, authReq.id:%s", C16686a.m16193i().f303742b, yVar.f62309e);
                    C16710c.this.mo17701e(false);
                    C16686a.m16193i().mo142622e().mo142628f(-5);
                    C16710c.this.mo17704h(-5);
                    return;
                }
                Log.m105925i("MicroMsg.BackupMoveServer", "authReq info, id:%s, step:%d", yVar.f62309e, Integer.valueOf(yVar.f62308d));
                int i5 = yVar.f62308d;
                if (i5 == 0) {
                    if (!C16686a.m16193i().f303743c.equals(new String(C90194m.m112881b(yVar.f62310f.f257327a, C102910f.f303739h)))) {
                        C16710c.this.getClass();
                        C22018z zVar = new C22018z();
                        zVar.f62315d = 0;
                        zVar.f62317f = C16686a.m16193i().f303742b;
                        zVar.f62316e = 1;
                        Log.m105920e("MicroMsg.BackupMoveServer", "get authReq step 0, but hello failed");
                        try {
                            Log.m105918d("MicroMsg.BackupMoveServer", "sendFailAuthResponse send authFailResp.");
                            C20842c.m22886w1(zVar.toByteArray(), 2, i4);
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.BackupMoveServer", e, "sendFailAuthResponse buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
                        }
                        C16686a.m16193i().mo142622e().mo142628f(-5);
                        C16710c.this.mo17704h(-5);
                    }
                    int i6 = yVar.f62311g;
                    if (i6 < 3) {
                        Log.m105925i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify old move, version:%d", Integer.valueOf(i6));
                        C115669n.INSTANCE.idkeyStat(485, 103, 1, false);
                        C16686a.m16193i().mo142622e().mo142628f(-12);
                        C16710c.this.mo17704h(-12);
                        return;
                    }
                    Log.m105924i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify start move");
                    C16710c cVar = C16710c.this;
                    cVar.f45187h = i4;
                    if (yVar.f62312h == 1) {
                        cVar.getClass();
                        C16686a.m16193i();
                        Set<String> stringSet = C102910f.m136016d().getStringSet("BACKUP_SELECT_SESSION_LIST", (Set) null);
                        boolean z2 = stringSet != null && stringSet.size() > 0;
                        Log.m105925i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify client resume move! isResumeDataExist:%b", Boolean.valueOf(z2));
                        if (z2) {
                            C16686a.m16193i().mo17662k().f45185f = 1;
                            C16710c.this.mo17698b((LinkedList<String>) null);
                            C16710c.this.mo17702f(false);
                            return;
                        }
                    }
                    C16686a.m16193i().mo17662k().f45185f = 0;
                    boolean z3 = C16710c.f45179s;
                    if (z3 || C16710c.f45178r) {
                        if (z3 && C16710c.f45178r) {
                            int i7 = yVar.f62313i;
                            if ((i7 & 2) == 0 && (i7 & 4) == 0) {
                                C16686a.m16193i().mo142622e().mo142628f(-31);
                                C16710c.this.mo17704h(-31);
                                C16710c.this.f45189j = 1;
                                return;
                            }
                        }
                        if (z3 && (yVar.f62313i & 2) == 0) {
                            C16686a.m16193i().mo142622e().mo142628f(-32);
                            C16710c.this.mo17704h(-32);
                            C16710c.this.f45189j = 2;
                            return;
                        } else if (C16710c.f45178r && (yVar.f62313i & 4) == 0) {
                            C16686a.m16193i().mo142622e().mo142628f(-33);
                            C16710c.this.mo17704h(-33);
                            C16710c.this.f45189j = 3;
                            return;
                        }
                    }
                    C16710c.this.mo17702f(false);
                } else if (i5 == 1) {
                    if (!C16686a.m16193i().f303744d.equals(new String(C90194m.m112881b(yVar.f62310f.f257327a, C102910f.f303739h)))) {
                        Log.m105920e("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok failed");
                        C16686a.m16193i().mo142622e().mo142628f(-5);
                        C16710c.this.mo17704h(-5);
                    }
                    Log.m105924i("MicroMsg.BackupMoveServer", "get authReq step 1 and validate ok success");
                    C16686a.m16193i().mo142622e().mo142628f(2);
                    C16710c.this.mo17704h(2);
                }
            } else if (i3 == 3) {
                C22015q qVar = (C22015q) C102913k.m136031C(new C22015q(), bArr2);
                if (qVar == null) {
                    Log.m105921e("MicroMsg.BackupMoveServer", "startReq parseBuf failed:%d", Integer.valueOf(Util.getLength(bArr)));
                } else {
                    C100966p pVar = qVar.f62296h;
                    if (pVar != null) {
                        String str = pVar.f295656e;
                        Object[] objArr2 = new Object[1];
                        if (str == null) {
                            str = "";
                        }
                        objArr2[0] = str;
                        Log.m105925i("MicroMsg.BackupMoveServer", "startReq new device is %s", objArr2);
                    }
                }
                C16710c.this.f45186g = i4;
                C20842c.f58882p.mo32561b(qVar.f62297i * 1024 * 1024);
                if (C16686a.m16193i().mo17663l().f296806t) {
                    C16710c.this.mo17703g();
                } else {
                    C16710c.this.f45184e = true;
                }
            } else if (i3 == 9) {
                C47529h hVar = (C47529h) C102913k.m136031C(new C47529h(), bArr2);
                if (hVar == null) {
                    Log.m105921e("MicroMsg.BackupMoveServer", "heartBeatRequest parseBuf failed:%d", Integer.valueOf(Util.getLength(bArr)));
                    return;
                }
                Log.m105925i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify receive heartbeatReq,req:%s ack:%d", hVar, Long.valueOf(hVar.f127518d));
                C62561i iVar = (C62561i) C102913k.m136031C(new C62561i(), bArr2);
                iVar.f177692d = hVar.f127518d;
                try {
                    Log.m105924i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify send heartbeatResp");
                    C20842c.m22886w1(iVar.toByteArray(), 10, i4);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.BackupMoveServer", e2, "onBackupMoveServerNotify buf to BackupHeartBeatResponse err.", new Object[0]);
                }
            } else if (i3 == 10) {
                try {
                    new C62561i().parseFrom(bArr2);
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.BackupMoveServer", e3, "onBackupMoveServerNotify heartbeatResp parse from buf error.", new Object[0]);
                }
            } else if (i3 == 5) {
                Log.m105924i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify receive command cancel");
                C16710c.this.mo17701e(true);
                C16686a.m16193i().mo142622e().mo142628f(-100);
                C16710c.this.mo17704h(-100);
            } else if (i3 == 12) {
                C62567m mVar = (C62567m) C102913k.m136031C(new C62567m(), bArr2);
                if (mVar == null) {
                    Log.m105921e("MicroMsg.BackupMoveServer", "requestSessionResp parseBuf failed:%d", Integer.valueOf(Util.getLength(bArr)));
                    C16686a.m16193i().mo142622e().mo142628f(-5);
                    C16710c.this.mo17704h(-5);
                    return;
                }
                LinkedList<C23367h> r = C102913k.m136053r(mVar.f177715d, mVar.f177716e);
                Object[] objArr3 = new Object[1];
                objArr3[0] = Integer.valueOf(r == null ? -1 : r.size());
                Log.m105925i("MicroMsg.BackupMoveServer", "onBackupMoveServerNotify backup receive requestsession response. backupSessionList:%d ", objArr3);
                if (r == null) {
                    Log.m105920e("MicroMsg.BackupMoveServer", "requestSessionResp sessionName or timeInterval null or requestSessionResp number error.");
                    C16710c.this.mo17700d();
                    C16686a.m16193i().mo142622e().mo142628f(-21);
                    C16710c.this.mo17704h(-21);
                    return;
                }
                C20842c.m22889z1();
                C16710c cVar2 = C16710c.this;
                C23584k kVar2 = cVar2.f45181b;
                if (kVar2 == null || kVar2.f67613b) {
                    cVar2.f45181b = new C23584k(C16686a.m16193i(), 2, C16710c.this.f45192m);
                }
                C16710c.this.f45181b.mo37044b(false);
                C16710c.this.f45181b.mo37046d(r, 0, C16710c.f45178r);
            }
        }
    }

    /* renamed from: av0.c$b */
    public class C16712b implements C23365c {

        /* renamed from: av0.c$b$a */
        public class C16713a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Set f45199d;

            /* renamed from: e */
            public final /* synthetic */ int f45200e;

            public C16713a(C16712b bVar, Set set, int i) {
                this.f45199d = set;
                this.f45200e = i;
            }

            public void run() {
                for (C102909e K : this.f45199d) {
                    K.mo17667K(this.f45200e);
                }
            }
        }

        public C16712b() {
        }

        /* renamed from: K */
        public void mo17705K(int i) {
            MMHandlerThread.postToMainThread(new C16713a(this, new HashSet(C16710c.this.f45190k), i));
        }

        /* renamed from: L */
        public void mo17706L() {
            C16686a.m16193i();
            C102910f.m136016d().edit().putStringSet("BACKUP_SELECT_SESSION_LIST", (Set) null);
            C20842c.m22874B1(21);
        }

        /* renamed from: a */
        public void mo17707a(boolean z) {
            C16710c.this.mo17701e(z);
        }
    }

    /* renamed from: av0.c$c */
    public class C16714c implements C20842c.C20845d {
        public C16714c(C16710c cVar) {
        }

        /* renamed from: a */
        public void mo17681a() {
            Log.m105924i("MicroMsg.BackupMoveServer", "stopCallback ");
            C20842c.m22876D1();
            C16686a.m16193i().mo17659g();
        }
    }

    /* renamed from: av0.c$d */
    public class C16715d implements C20859o.C20861b {
        public C16715d() {
        }

        /* renamed from: a */
        public void mo17682a() {
            C16710c.this.mo17704h(C16686a.m16193i().mo142622e().mo142623a());
        }

        /* renamed from: b */
        public void mo17683b() {
            int a = C16686a.m16193i().mo142622e().mo142623a();
            Log.m105921e("MicroMsg.BackupMoveServer", "speedOverTime callback, backupState[%d]", Integer.valueOf(a));
            if (a == 14 || a == 4) {
                C16710c.this.mo17701e(true);
                C16686a.m16193i().mo17660h().mo37036e();
                C16686a.m16193i().mo142622e().mo142628f(-4);
                C16710c.this.mo17704h(-4);
            }
        }

        /* renamed from: c */
        public void mo17684c(int i) {
            int a = C16686a.m16193i().mo142622e().mo142623a();
            if (i == 1) {
                if (a == 14) {
                    Log.m105924i("MicroMsg.BackupMoveServer", "speedCallback is weak connect now.");
                    C16686a.m16193i().mo142622e().mo142628f(4);
                    C16710c.this.mo17704h(4);
                }
            } else if (i == 0 && a == 4) {
                Log.m105924i("MicroMsg.BackupMoveServer", "speedCallback is normal speed now.");
                C16686a.m16193i().mo142622e().mo142628f(14);
                C16710c.this.mo17704h(14);
            }
        }
    }

    /* renamed from: av0.c$e */
    public class C16716e implements C54335d.C54339d {
        public C16716e() {
        }

        /* renamed from: a */
        public void mo17709a(int i, byte[] bArr) {
            if (bArr != null) {
                C16710c.this.f45195p = bArr;
            }
            C16710c.this.mo17704h(i);
        }
    }

    /* renamed from: a */
    public void mo17697a(int i, long j, long j2, int i2) {
        Log.m105925i("MicroMsg.BackupMoveServer", "setBakupSelectTimeData, timeMode[%d], startTime[%d], endTime[%d], contentType[%d]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2));
        if (i == 0) {
            j = 0;
            j2 = 0;
        }
        C16686a.m16193i();
        SharedPreferences.Editor edit = C102910f.m136016d().edit();
        edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", i);
        edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", j);
        edit.putLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", j2);
        edit.putInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", i2);
        edit.commit();
    }

    /* renamed from: b */
    public void mo17698b(LinkedList<String> linkedList) {
        this.f45180a = new LinkedList<>();
        if (Util.isNullOrNil((List) linkedList)) {
            C16686a.m16193i();
            this.f45180a.addAll(C102910f.m136016d().getStringSet("BACKUP_SELECT_SESSION_LIST", new HashSet()));
        } else {
            C16686a.m16193i();
            SharedPreferences.Editor edit = C102910f.m136016d().edit();
            HashSet hashSet = new HashSet();
            hashSet.addAll(linkedList);
            edit.putStringSet("BACKUP_SELECT_SESSION_LIST", hashSet);
            edit.commit();
            this.f45180a.addAll(hashSet);
        }
        C16686a.m16193i();
        if (C102910f.m136016d().getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0) == 1) {
            f45179s = true;
        } else {
            f45179s = false;
        }
        C16686a.m16193i();
        this.f45182c = C102910f.m136016d().getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0);
        C16686a.m16193i();
        this.f45183d = C102910f.m136016d().getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0);
        C16686a.m16193i();
        if (C102910f.m136016d().getInt("BACKUP_MOVE_CHOOSE_SELECT_CONTENT_TYPE", 0) == 1) {
            f45178r = true;
        } else {
            f45178r = false;
        }
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(linkedList == null ? -1 : linkedList.size());
        objArr[1] = Long.valueOf(this.f45182c);
        objArr[2] = Long.valueOf(this.f45183d);
        objArr[3] = Boolean.valueOf(f45178r);
        Log.m105925i("MicroMsg.BackupMoveServer", "setBakupChooseData users size[%d], selectStartTime[%d], selectEndTime[%d], isQuickBackup[%b]", objArr);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_MOVE_BACKUPING_BOOLEAN, Boolean.TRUE);
    }

    /* renamed from: c */
    public void mo17699c(C102909e eVar) {
        synchronized (this.f45190k) {
            ((HashSet) this.f45190k).add(eVar);
        }
    }

    /* renamed from: d */
    public void mo17700d() {
        C47525d dVar = new C47525d();
        dVar.f127501d = C16686a.m16193i().f303742b;
        try {
            Log.m105924i("MicroMsg.BackupMoveServer", "backupSendCancelRequest.");
            C20842c.m22885v1(dVar.toByteArray(), 5);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupMoveServer", e, "buf to BackupCancelRequest err.", new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo17701e(boolean z) {
        Log.m105921e("MicroMsg.BackupMoveServer", "cancel BackupMoveServer CANCEL, Caller:%s", MMStack.getCaller());
        if (!z) {
            mo17700d();
        }
        C23584k kVar = this.f45181b;
        if (kVar != null) {
            kVar.mo37043a();
        }
        Log.m105924i("MicroMsg.BackupMoveServer", "cancel , notifyall.");
        C20842c.m22876D1();
        C20842c.m22877E1();
        C16686a.m16193i().mo17659g();
    }

    /* renamed from: f */
    public void mo17702f(boolean z) {
        if (z) {
            int i = this.f45189j;
            if (i == 1) {
                f45179s = false;
                f45178r = false;
                this.f45182c = 0;
                this.f45183d = 0;
            } else if (i == 2) {
                f45179s = false;
                this.f45182c = 0;
                this.f45183d = 0;
            } else if (i == 3) {
                f45178r = false;
            }
        }
        C16686a.m16193i().mo17658f();
        C22018z zVar = new C22018z();
        zVar.f62315d = 0;
        zVar.f62317f = C16686a.m16193i().f303742b;
        zVar.f62319h = 3;
        zVar.f62316e = 0;
        zVar.f62320i = this.f45185f;
        zVar.f62318g = new C89349b(C90194m.m112882c(C16686a.m16193i().f303744d.getBytes(), C102910f.f303739h));
        if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ChattingRecordsKvstatDisable"), 0) == 0) {
            zVar.f62321j = 1 | zVar.f62321j;
        }
        zVar.f62321j = zVar.f62321j | 2 | 4;
        try {
            Log.m105924i("MicroMsg.BackupMoveServer", "continueAuth send authSuccessResp.");
            C20842c.m22886w1(zVar.toByteArray(), 2, this.f45187h);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BackupMoveServer", e, "continueAuth buf to PACKET_TYPE_AUTHENTICATE_RESPONSE err.", new Object[0]);
        }
    }

    /* renamed from: g */
    public void mo17703g() {
        Log.m105924i("MicroMsg.BackupMoveServer", "startRequestNotify receive start request.");
        this.f45184e = false;
        C16686a.m16193i().mo142622e().mo142628f(12);
        mo17704h(12);
        C98544e.m128035f().mo137899c();
        LinkedList<String> linkedList = this.f45180a;
        if (linkedList != null) {
            Log.m105925i("MicroMsg.BackupMoveServer", "transfer conversation size:%d", Integer.valueOf(linkedList.size()));
            C22016r rVar = new C22016r();
            rVar.f62300d = C16686a.m16193i().f303742b;
            rVar.f62301e = (long) this.f45180a.size();
            rVar.f62302f = C16686a.m16193i().mo17663l().mo140768e();
            rVar.f62303g = 0;
            rVar.f62304h = this.f45188i ? 1 : 0;
            if (f45178r) {
                rVar.f62307n = 3;
            }
            C100966p pVar = new C100966p();
            pVar.f295655d = C87203t.m108273i();
            pVar.f295656e = Build.MANUFACTURER;
            pVar.f295657f = C87203t.m108275k();
            pVar.f295658g = "Android";
            pVar.f295659h = Build.VERSION.RELEASE;
            int i = C89625d.f257841g;
            pVar.f295660i = i;
            pVar.f295661j = 0;
            Log.m105925i("MicroMsg.BackupMoveServer", "startRequestNotify generalinfo wechatversion:%s", Integer.valueOf(i));
            rVar.f62306j = pVar;
            try {
                C20842c.m22886w1(rVar.toByteArray(), 4, this.f45186g);
                long j = this.f45182c;
                long j2 = this.f45183d;
                Log.m105925i("MicroMsg.BackupMoveServer", "backupSendRequestSession sessionName[%d], startTime[%d], endTime[%d]", Integer.valueOf(this.f45180a.size()), Long.valueOf(j), Long.valueOf(j2));
                C62565l lVar = new C62565l();
                lVar.f177709d = this.f45180a;
                lVar.f177710e = new LinkedList<>();
                Iterator<String> it = this.f45180a.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    lVar.f177710e.add(Long.valueOf(j));
                    lVar.f177710e.add(Long.valueOf(j2));
                }
                try {
                    Log.m105925i("MicroMsg.BackupMoveServer", "backupSendRequestSession, chooseConvNames size:%d", Integer.valueOf(this.f45180a.size()));
                    C20842c.m22885v1(lVar.toByteArray(), 11);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BackupMoveServer", e, "backupSendRequestSession BackupRequestSession parse req failed.", new Object[0]);
                }
            } catch (IOException e2) {
                Log.m105920e("MicroMsg.BackupMoveServer", "startRequestNotify prase startResp error!!");
                Log.printErrStackTrace("MicroMsg.BackupMoveServer", e2, "", new Object[0]);
            }
        }
    }

    /* renamed from: h */
    public void mo17704h(int i) {
        ((C16712b) this.f45192m).mo17705K(i);
    }
}
