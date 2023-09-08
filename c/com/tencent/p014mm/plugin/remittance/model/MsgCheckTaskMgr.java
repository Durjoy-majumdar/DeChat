package com.tencent.p014mm.plugin.remittance.model;

import android.os.Looper;
import android.util.Base64;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ReceiveTransferAppMsgEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import oi2.C77010f;
import te3.C50764p03;
import te3.C51185s03;
import ub3.C78144b;

/* renamed from: com.tencent.mm.plugin.remittance.model.MsgCheckTaskMgr */
public class MsgCheckTaskMgr {

    /* renamed from: b */
    public static MsgCheckTaskMgr f115996b = new MsgCheckTaskMgr();

    /* renamed from: a */
    public C51185s03 f115997a = new C51185s03();

    /* renamed from: com.tencent.mm.plugin.remittance.model.MsgCheckTaskMgr$MsgCheckTask */
    public static class MsgCheckTask implements MTimerHandler.CallBack, C11385n {

        /* renamed from: d */
        public long f115998d;

        /* renamed from: e */
        public boolean f115999e;

        /* renamed from: f */
        public C50764p03 f116000f = null;

        /* renamed from: g */
        public MTimerHandler f116001g = null;

        /* renamed from: h */
        public int f116002h;

        /* renamed from: i */
        public IListener<ReceiveTransferAppMsgEvent> f116003i = new IListener<ReceiveTransferAppMsgEvent>(C40008f.f107254d) {
            {
                this.__eventId = -85283268;
            }

            public boolean callback(IEvent iEvent) {
                ReceiveTransferAppMsgEvent receiveTransferAppMsgEvent = (ReceiveTransferAppMsgEvent) iEvent;
                ReceiveTransferAppMsgEvent.C40157a aVar = receiveTransferAppMsgEvent.f107727d;
                if (aVar.f107730c != null && MsgCheckTask.this.f116000f.f139484e.equals(aVar.f107728a)) {
                    if (((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(receiveTransferAppMsgEvent.f107727d.f107729b).getType() == 419430449) {
                        ReceiveTransferAppMsgEvent.C40157a aVar2 = receiveTransferAppMsgEvent.f107727d;
                        int i = aVar2.f107730c.f195489G0;
                        Log.m105925i("MicroMsg.MsgCheckTaskMgr", "MsgCheck msgID:%s transeferID:%s paySubType:%s", Long.valueOf(aVar2.f107729b), receiveTransferAppMsgEvent.f107727d.f107728a, Integer.valueOf(i));
                        if (i == 3 || i == 23 || i == 4 || i == 24 || i == 5 || i == 25 || i == 6 || i == 26) {
                            MsgCheckTask msgCheckTask = MsgCheckTask.this;
                            if (!msgCheckTask.f115999e) {
                                msgCheckTask.mo67017b();
                            }
                        }
                    }
                }
                return false;
            }
        };

        public MsgCheckTask(long j, C50764p03 p032) {
            this.f115998d = j;
            this.f115999e = false;
            this.f116000f = p032;
        }

        /* renamed from: a */
        public void mo67016a() {
            C86709a0.m107524d().mo123455a(6230, this);
            C86709a0.m107524d().mo123455a(4895, this);
            this.f116003i.alive();
            Log.m105925i("MicroMsg.MsgCheckTaskMgr", "start MsgCheckTask %s after %s", this.f116000f.f139484e, Long.valueOf(this.f115998d));
            this.f116002h = 1;
            if (this.f116001g == null) {
                this.f116001g = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) this, false);
            }
            this.f116001g.startTimer(this.f115998d * 1000);
        }

        /* renamed from: b */
        public void mo67017b() {
            C50764p03 p032;
            C86709a0.m107524d().mo123470p(6230, this);
            C86709a0.m107524d().mo123470p(4895, this);
            this.f116003i.dead();
            MTimerHandler mTimerHandler = this.f116001g;
            if (mTimerHandler != null && !mTimerHandler.stopped()) {
                this.f116001g.stopTimer();
                this.f115999e = false;
            }
            MsgCheckTaskMgr msgCheckTaskMgr = MsgCheckTaskMgr.f115996b;
            String str = this.f116000f.f139484e;
            Iterator<C50764p03> it = msgCheckTaskMgr.f115997a.f141253d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    p032 = null;
                    break;
                }
                p032 = it.next();
                if (str.equals(p032.f139484e)) {
                    break;
                }
            }
            msgCheckTaskMgr.f115997a.f141253d.remove(p032);
            msgCheckTaskMgr.mo67015b();
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            if (yVar instanceof C42838d0) {
                C42838d0 d0Var = (C42838d0) yVar;
                if (d0Var.f116014g.equals(this.f116000f.f139484e)) {
                    if (i == 0 && i2 == 0) {
                        Log.m105925i("MicroMsg.MsgCheckTaskMgr", "MsgCheck retCode:%s retMsg:%s transferID:%s", Integer.valueOf(d0Var.f116012e.f140644d), d0Var.f116012e.f140645e, this.f116000f.f139484e);
                        if (d0Var.f116012e.f140644d == 0) {
                            C115669n.INSTANCE.mo160131h(23016, 1, this.f116000f.f139484e);
                            C77010f.vx0().xx0().mo97263e(this.f116000f.f139487h, d0Var.f116012e.f140646f, 0);
                        }
                    }
                    mo67017b();
                }
            } else if (yVar instanceof C42849o0) {
                C42849o0 o0Var = (C42849o0) yVar;
                if (o0Var.f116042s.equals(this.f116000f.f139484e)) {
                    if (i == 0 && i2 == 0) {
                        Log.m105925i("MicroMsg.MsgCheckTaskMgr", "UnionMsgCheck retCode:%s retMsg:%s transferID:%s", Integer.valueOf(o0Var.f116041r.f136994d), o0Var.f116041r.f136995e, this.f116000f.f139484e);
                        if (o0Var.f116041r.f136994d == 0) {
                            C115669n.INSTANCE.mo160131h(23016, 1, this.f116000f.f139484e);
                            C77010f.vx0().xx0().mo97263e(this.f116000f.f139487h, o0Var.f116041r.f136996f, 0);
                        }
                    }
                    mo67017b();
                }
            }
        }

        public boolean onTimerExpired() {
            int i = this.f116002h;
            if (i == 1) {
                Log.m105925i("MicroMsg.MsgCheckTaskMgr", "onTimerExpired, do MsgCheck scene, transferID:%s", this.f116000f.f139484e);
                this.f115999e = true;
                if (C72996z1.m85843n5(this.f116000f.f139487h) || C45628s0.m50748M(this.f116000f.f139487h)) {
                    C50764p03 p032 = this.f116000f;
                    C86709a0.m107524d().mo123460f(new C42849o0(p032.f139484e, p032.f139485f, p032.f139486g));
                } else {
                    C50764p03 p033 = this.f116000f;
                    C86709a0.m107524d().mo123460f(new C42838d0(p033.f139484e, p033.f139485f, p033.f139486g));
                }
                this.f116002h = 2;
                this.f116001g.startTimer(18000);
            } else if (i == 2) {
                mo67017b();
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo67014a(String str, long j, String str2, String str3, long j2) {
        C50764p03 p032 = new C50764p03();
        p032.f139487h = str;
        p032.f139486g = str2;
        p032.f139484e = str3;
        p032.f139485f = j2;
        p032.f139483d = C75604z3.m90844p() + (1000 * j);
        this.f115997a.f141253d.add(p032);
        mo67015b();
        new MsgCheckTask(j, p032).mo67016a();
    }

    /* renamed from: b */
    public void mo67015b() {
        try {
            ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_WALLET_REMITTANCE_MSGCHECKTASKINFO_STRING_SYNC, Base64.encodeToString(this.f115997a.toByteArray(), 0));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MsgCheckTaskMgr", e, "", new Object[0]);
            this.f115997a.f141253d.clear();
        }
    }
}
