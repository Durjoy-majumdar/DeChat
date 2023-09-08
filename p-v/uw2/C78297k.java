package uw2;

import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75592q0;
import eb0.C75604z3;
import fy3.C32226l;
import kd0.C99125s;
import ob0.C77002r;
import pu0.C110248b;
import pw2.C77293a;
import pw2.C77294b;
import rx3.C13598b0;

/* renamed from: uw2.k */
public class C78297k implements C77002r {

    /* renamed from: i */
    public static int f229350i = 100;

    /* renamed from: a */
    public C99125s f229351a = null;

    /* renamed from: b */
    public C77002r.C77004b f229352b;

    /* renamed from: c */
    public int f229353c = 0;

    /* renamed from: d */
    public String f229354d = "";

    /* renamed from: e */
    public long f229355e = 0;

    /* renamed from: f */
    public int f229356f = 0;

    /* renamed from: g */
    public C77294b f229357g = new C77294b(new C78298a());

    /* renamed from: h */
    public MTimerHandler f229358h = new MTimerHandler(new C78299b(), true);

    /* renamed from: uw2.k$a */
    public class C78298a implements C32226l<Boolean, C13598b0> {
        public C78298a() {
        }

        public Object invoke(Object obj) {
            Boolean bool = (Boolean) obj;
            C78297k kVar = C78297k.this;
            kVar.f229357g.mo161477T("record");
            kVar.f229351a = new C99125s();
            ThreadPool.post(new C78300c(), "VoiceRemindRecorder_record");
            kVar.f229356f = 1;
            kVar.f229358h.startTimer(3000);
            Log.m105918d("MicroMsg.VoiceRemindRecorder", "start end time:" + Util.ticksToNow(0));
            return null;
        }
    }

    /* renamed from: uw2.k$b */
    public class C78299b implements MTimerHandler.CallBack {
        public C78299b() {
        }

        public boolean onTimerExpired() {
            String str = C78297k.this.f229354d;
            if (str != null) {
                C78295i c = C78296j.m94585c(str);
                if (c == null) {
                    Log.m105918d("MicroMsg.VoiceRemindLogic", "startSend null record : " + str);
                } else if (c.field_status == 1) {
                    c.field_status = 2;
                    c.f229349U = 64;
                    C78296j.m94588f(c);
                }
            }
            C78291e.wx0().mo108316c();
            Log.m105918d("MicroMsg.VoiceRemindRecorder", "Start Send fileName :" + C78297k.this.f229354d);
            return false;
        }
    }

    /* renamed from: uw2.k$c */
    public final class C78300c implements Runnable {

        /* renamed from: d */
        public MMHandler f229361d;

        /* renamed from: uw2.k$c$a */
        public class C78301a extends MMHandler {
            public C78301a(C78297k kVar) {
            }

            public void handleMessage(Message message) {
                if (C78297k.this.f229356f > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("On Part :");
                    sb.append(C78297k.this.f229352b == null);
                    Log.m105918d("MicroMsg.VoiceRemindRecorder", sb.toString());
                    C78297k kVar = C78297k.this;
                    kVar.f229356f = 2;
                    C77002r.C77004b bVar = kVar.f229352b;
                    if (bVar != null) {
                        bVar.mo102901a();
                    }
                }
            }
        }

        public C78300c() {
            this.f229361d = new C78301a(C78297k.this);
        }

        public void run() {
            C78297k kVar = C78297k.this;
            if (kVar.f229351a == null) {
                Log.m105920e("MicroMsg.VoiceRemindRecorder", "Stop Record Failed recorder == null");
                return;
            }
            synchronized (kVar) {
                try {
                    C78297k kVar2 = C78297k.this;
                    if (!kVar2.f229351a.startRecord(C78296j.m94584b(kVar2.f229354d, true))) {
                        C78296j.m94583a(C78297k.this.f229354d);
                        C78297k.this.f229354d = null;
                        Log.m105918d("MicroMsg.VoiceRemindRecorder", "Thread Start Record  Error fileName[" + C78297k.this.f229354d + "]");
                        C78297k.this.f229351a = null;
                    }
                    C78297k.this.f229355e = Util.currentTicks();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Thread Started Record fileName[");
                    sb.append(C78297k.this.f229354d);
                    sb.append("] time:");
                    C78297k.this.getClass();
                    sb.append(Util.ticksToNow(0));
                    Log.m105918d("MicroMsg.VoiceRemindRecorder", sb.toString());
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.f229361d.sendEmptyMessageDelayed(0, 1);
        }
    }

    /* renamed from: a */
    public String mo107315a() {
        return this.f229354d;
    }

    /* renamed from: b */
    public long mo107316b() {
        long j = this.f229355e;
        if (j <= 0) {
            return 0;
        }
        return Util.ticksToNow(j);
    }

    /* renamed from: c */
    public void mo107317c(C77002r.C77003a aVar) {
    }

    public boolean cancel() {
        Log.m105918d("MicroMsg.VoiceRemindRecorder", "cancel Record :" + this.f229354d);
        synchronized (this) {
            Log.m105918d("MicroMsg.VoiceRemindRecorder", "stop synchronized Record :" + this.f229354d);
            C99125s sVar = this.f229351a;
            if (sVar != null) {
                sVar.stopRecord();
            }
        }
        String str = this.f229354d;
        if (str != null) {
            Log.m105918d("MicroMsg.VoiceRemindLogic", "Mark Canceled fileName[" + str + "]");
            C78295i c = C78296j.m94585c(str);
            if (c != null) {
                c.field_status = 8;
                c.field_totallen = C78289d.m94577b(C78296j.m94584b(str, false));
                c.f229349U = 64;
                C78296j.m94588f(c);
            }
        }
        C78291e.wx0().mo108316c();
        this.f229354d = "";
        return true;
    }

    /* renamed from: d */
    public int mo107319d() {
        C99125s sVar = this.f229351a;
        if (sVar == null) {
            return 0;
        }
        int d = sVar.mo107471d();
        if (d > f229350i) {
            f229350i = d;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" map: ");
        sb.append(d);
        sb.append(" max:");
        sb.append(f229350i);
        sb.append(" per:");
        int i = d * 100;
        sb.append(i / f229350i);
        Log.m105918d("getMaxAmplitude", sb.toString());
        return i / f229350i;
    }

    /* renamed from: e */
    public int mo107320e() {
        return 0;
    }

    /* renamed from: f */
    public void mo107321f() {
    }

    /* renamed from: g */
    public boolean mo107322g(String str) {
        String yr02 = C78306m.yr0(C75592q0.m90789s());
        C78295i iVar = new C78295i();
        iVar.field_filename = yr02;
        iVar.field_user = str;
        iVar.field_createtime = System.currentTimeMillis() / 1000;
        iVar.field_clientid = yr02;
        iVar.field_lastmodifytime = System.currentTimeMillis() / 1000;
        iVar.field_status = 1;
        iVar.field_human = C75592q0.m90789s();
        iVar.f229349U = -1;
        C78306m xx02 = C78291e.xx0();
        xx02.getClass();
        Log.m105918d("MicroMsg.VoiceRemindStorage", "VoiceRemindStorage Insert");
        int insert = (int) xx02.f229383d.insert("VoiceRemindInfo", "", iVar.convertTo());
        Log.m105918d("MicroMsg.VoiceRemindStorage", "VoiceRemindStorage Insert result" + insert);
        if (insert == -1) {
            yr02 = null;
        }
        this.f229354d = yr02;
        this.f229357g.mo161477T("record");
        C77294b bVar = this.f229357g;
        int U = bVar.mo161478U("record", 4);
        bVar.f225407m = false;
        if (U != 0) {
            bVar.mo18021R(100);
        } else {
            new C77293a(bVar).sendEmptyMessageDelayed(0, 50);
        }
        return false;
    }

    /* renamed from: h */
    public int mo107323h() {
        return this.f229353c;
    }

    /* renamed from: i */
    public boolean mo107324i() {
        C99125s sVar = this.f229351a;
        return sVar != null && sVar.f290644c == 1;
    }

    /* renamed from: j */
    public void mo107325j(C77002r.C77004b bVar) {
        this.f229352b = bVar;
    }

    public void reset() {
        C99125s sVar = this.f229351a;
        if (sVar != null) {
            sVar.stopRecord();
            Log.m105920e("MicroMsg.VoiceRemindRecorder", "Reset recorder.stopReocrd");
        }
        this.f229354d = "";
        this.f229356f = 0;
        this.f229355e = 0;
    }

    public boolean stop() {
        C110248b.wx0("record").mo161477T("record");
        Log.m105918d("MicroMsg.VoiceRemindRecorder", "stop Record :" + this.f229354d);
        synchronized (this) {
            Log.m105918d("MicroMsg.VoiceRemindRecorder", "stop synchronized Record :" + this.f229354d);
            C99125s sVar = this.f229351a;
            if (sVar != null) {
                sVar.stopRecord();
            }
        }
        boolean z = false;
        if (this.f229356f != 2) {
            C78296j.m94583a(this.f229354d);
            this.f229354d = null;
            Log.m105918d("MicroMsg.VoiceRemindRecorder", "Stop " + this.f229354d + " by not onPart: " + Util.ticksToNow(0));
        } else {
            int b = (int) mo107316b();
            this.f229353c = b;
            if (((long) b) < 800 || ((long) b) < 1000) {
                Log.m105918d("MicroMsg.VoiceRemindRecorder", "Stop " + this.f229354d + " by voiceLen: " + this.f229353c);
                C78296j.m94583a(this.f229354d);
                this.f229354d = "";
            } else {
                String str = this.f229354d;
                if (str != null) {
                    Log.m105918d("MicroMsg.VoiceRemindLogic", "StopRecord fileName[" + str + "]");
                    C78295i c = C78296j.m94585c(str);
                    if (c != null) {
                        int i = c.field_status;
                        if (!(i == 97 || i == 98)) {
                            c.field_status = 3;
                        }
                        int b2 = C78289d.m94577b(C78296j.m94584b(str, false));
                        c.field_totallen = b2;
                        if (b2 <= 0) {
                            C78296j.m94587e(str);
                        } else {
                            c.field_lastmodifytime = System.currentTimeMillis() / 1000;
                            c.field_voicelenght = b;
                            c.f229349U = 3424;
                            C72963f4 f4Var = new C72963f4();
                            f4Var.mo108749c3(c.field_user);
                            f4Var.setType(34);
                            f4Var.mo108740T2(1);
                            f4Var.mo108739S2(str);
                            int i2 = c.field_status;
                            if (i2 == 97) {
                                f4Var.mo100991d(2);
                                f4Var.mo108732L2(C37600h.m41450a(c.field_human, (long) c.field_voicelenght, false));
                            } else if (i2 == 98) {
                                f4Var.mo100991d(5);
                                f4Var.mo108732L2(C37600h.m41450a(c.field_human, -1, true));
                            } else {
                                f4Var.mo100991d(1);
                            }
                            f4Var.mo108733M2(C75604z3.m90843o(c.field_user));
                            c.field_msglocalid = (int) C75604z3.m90852x(f4Var);
                            C78296j.m94588f(c);
                        }
                    }
                }
                C78291e.wx0().mo108316c();
                Log.m105918d("MicroMsg.VoiceRemindRecorder", "Stop file success: " + this.f229354d);
                z = true;
            }
            this.f229354d = "";
        }
        this.f229356f = -1;
        return z;
    }
}
