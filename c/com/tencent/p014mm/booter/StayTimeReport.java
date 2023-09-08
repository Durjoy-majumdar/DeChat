package com.tencent.p014mm.booter;

import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ReceiveMsgEvent;
import com.tencent.p014mm.autogen.events.SendOutMsgEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85798u1;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: com.tencent.mm.booter.StayTimeReport */
public class StayTimeReport {

    /* renamed from: q */
    public static StayTimeReport f237543q = new StayTimeReport();

    /* renamed from: a */
    public C85798u1 f237544a;

    /* renamed from: b */
    public IListener f237545b;

    /* renamed from: c */
    public IListener f237546c;

    /* renamed from: d */
    public C114668z.C104589a f237547d = new C80807a(this);

    /* renamed from: e */
    public C80808b f237548e;

    /* renamed from: f */
    public int f237549f = 0;

    /* renamed from: g */
    public HashSet<Long> f237550g = new HashSet<>();

    /* renamed from: h */
    public HashSet<Long> f237551h = new HashSet<>();

    /* renamed from: i */
    public long f237552i;

    /* renamed from: j */
    public long f237553j;

    /* renamed from: k */
    public String f237554k;

    /* renamed from: l */
    public long f237555l = -1;

    /* renamed from: m */
    public int f237556m = 20;

    /* renamed from: n */
    public int f237557n = 24;

    /* renamed from: o */
    public int f237558o = 30;

    /* renamed from: p */
    public int f237559p = 10800;

    /* renamed from: com.tencent.mm.booter.StayTimeReport$a */
    public class C80807a extends C114668z.C104589a {
        public C80807a(StayTimeReport stayTimeReport) {
        }

        public void onAppBackground(String str) {
        }

        public void onAppForeground(String str) {
        }
    }

    /* renamed from: com.tencent.mm.booter.StayTimeReport$b */
    public class C80808b {

        /* renamed from: a */
        public String f237561a;

        /* renamed from: b */
        public int f237562b;

        /* renamed from: c */
        public long f237563c;

        /* renamed from: d */
        public int f237564d;

        /* renamed from: e */
        public int f237565e;

        /* renamed from: f */
        public int f237566f;

        /* renamed from: g */
        public long f237567g;

        /* renamed from: h */
        public int f237568h;

        /* renamed from: i */
        public int f237569i = 0;

        /* renamed from: j */
        public int f237570j = 0;

        /* renamed from: k */
        public int f237571k = 0;

        public C80808b(StayTimeReport stayTimeReport) {
        }

        public String toString() {
            return String.format(Locale.US, "%d#%d#%d#%d#%d#%d#%d#%s#%d#%d#%d|", new Object[]{Integer.valueOf(this.f237562b), Long.valueOf(this.f237563c), Integer.valueOf(this.f237564d), Integer.valueOf(this.f237565e), Integer.valueOf(this.f237566f), Long.valueOf(this.f237567g), Integer.valueOf(this.f237568h), this.f237561a, Integer.valueOf(this.f237569i), Integer.valueOf(this.f237570j), Integer.valueOf(this.f237571k)});
        }
    }

    public StayTimeReport() {
        C40008f fVar = C40008f.f107254d;
        this.f237545b = new IListener<SendOutMsgEvent>(fVar) {
            {
                this.__eventId = 1245546543;
            }

            public boolean callback(IEvent iEvent) {
                SendOutMsgEvent sendOutMsgEvent = (SendOutMsgEvent) iEvent;
                if (sendOutMsgEvent instanceof SendOutMsgEvent) {
                    C72963f4 f4Var = sendOutMsgEvent.f236286d.f236287a;
                    StayTimeReport stayTimeReport = StayTimeReport.this;
                    if (stayTimeReport.f237548e != null && !stayTimeReport.f237550g.contains(Long.valueOf(f4Var.getMsgId())) && stayTimeReport.f237548e.f237561a.equals(f4Var.mo108768t())) {
                        stayTimeReport.f237550g.add(Long.valueOf(f4Var.getMsgId()));
                        stayTimeReport.f237548e.f237571k++;
                        Log.m105925i("MicroMsg.StayTimeReport", "sendMsg msgType:%d, SendCnt:%d", Integer.valueOf(f4Var.getType()), Integer.valueOf(stayTimeReport.f237548e.f237571k));
                    }
                }
                return false;
            }
        };
        this.f237546c = new IListener<ReceiveMsgEvent>(fVar) {
            {
                this.__eventId = 468947820;
            }

            public boolean callback(IEvent iEvent) {
                String str;
                ReceiveMsgEvent receiveMsgEvent = (ReceiveMsgEvent) iEvent;
                if (receiveMsgEvent instanceof ReceiveMsgEvent) {
                    C72963f4 f4Var = receiveMsgEvent.f78913d.f78914a;
                    StayTimeReport stayTimeReport = StayTimeReport.this;
                    if (stayTimeReport.f237548e != null && !stayTimeReport.f237551h.contains(Long.valueOf(f4Var.mo108774y2())) && (str = stayTimeReport.f237548e.f237561a) != null && str.equals(f4Var.mo108768t())) {
                        stayTimeReport.f237551h.add(Long.valueOf(f4Var.mo108774y2()));
                        stayTimeReport.f237548e.f237570j++;
                        Log.m105925i("MicroMsg.StayTimeReport", "receiveMsg msgType:%d, recvCnt:%d", Integer.valueOf(f4Var.getType()), Integer.valueOf(stayTimeReport.f237548e.f237570j));
                    }
                }
                return false;
            }
        };
        try {
            this.f237544a = new C85798u1(C72994y1.f212832a + "staytime.cfg");
        } catch (OutOfMemoryError e) {
            Log.printErrStackTrace("MicroMsg.StayTimeReport", e, "", new Object[0]);
            C86013q1.m106447h(C72994y1.f212832a + "staytime.cfg");
            this.f237544a = new C85798u1(C72994y1.f212832a + "staytime.cfg");
        }
    }

    /* renamed from: a */
    public void mo112561a(String str) {
        C80808b bVar;
        this.f237545b.dead();
        this.f237546c.dead();
        this.f237547d.dead();
        this.f237551h.clear();
        this.f237550g.clear();
        boolean z = false;
        if (str == null || (bVar = this.f237548e) == null) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (this.f237548e == null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.StayTimeReport", "exitChattingUI chatUser or reprotingItem is null, chatUser:%s, reportingItem is null:%b", objArr);
        } else if (!str.equals(bVar.f237561a)) {
            Log.m105925i("MicroMsg.StayTimeReport", "exitChattingUI no startedUI: %s, start:", str, this.f237548e.f237561a);
        } else {
            this.f237548e.f237563c += Util.ticksToNow(this.f237552i) / 1000;
            this.f237544a.mo119664f(5, ((String) this.f237544a.mo119661b(5, "")) + this.f237548e.toString());
            if (this.f237548e != null) {
                long d = this.f237544a.mo118846d(4, 0);
                int c = this.f237544a.mo119662c(6, 0) + 1;
                this.f237544a.mo119666g(6, c);
                C80808b bVar2 = this.f237548e;
                Log.m105925i("MicroMsg.StayTimeReport", "exitChattingUI, chatUser:%s, type:%d, stayTime:%d, stayWebTime:%d, chattingReportCnt:%d", bVar2.f237561a, Integer.valueOf(bVar2.f237562b), Long.valueOf(this.f237548e.f237563c), Integer.valueOf(this.f237548e.f237568h), Integer.valueOf(c));
                Log.m105925i("MicroMsg.StayTimeReport", "exitChattingUI goBackHistoryStatus:%d, recnCnt:%d, sendCnt:%d", Integer.valueOf(this.f237548e.f237569i), Integer.valueOf(this.f237548e.f237570j), Integer.valueOf(this.f237548e.f237571k));
                if (Util.secondsToNow(d) > ((long) this.f237559p) || c > this.f237558o) {
                    String str2 = ((String) this.f237544a.mo119661b(5, "")) + "," + d + "," + Util.nowSecond();
                    Log.m105925i("MicroMsg.StayTimeReport", "report （13062） %d: %s", 13062, str2);
                    C115669n.INSTANCE.kvStat(13062, str2);
                    this.f237544a.mo119666g(6, 0);
                    this.f237544a.mo119664f(5, "");
                }
            }
        }
    }
}
