package com.tencent.p014mm.modelstat;

import android.os.Looper;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SendMsgSuccessEvent;
import com.tencent.p014mm.autogen.events.SendOutMsgEvent;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.plugin.report.kvdata.IMBehavior;
import com.tencent.p014mm.plugin.report.kvdata.IMBehaviorChattingOP;
import com.tencent.p014mm.plugin.report.kvdata.IMBehaviorMsgOP;
import com.tencent.p014mm.plugin.report.kvdata.log_13835;
import com.tencent.p014mm.plugin.report.kvdata.log_13913;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C96980c;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import zt3.C119157j;

/* renamed from: com.tencent.mm.modelstat.ChattingOperationUitl */
public class ChattingOperationUitl {

    /* renamed from: f */
    public static ChattingOperationUitl f48963f = new ChattingOperationUitl();

    /* renamed from: a */
    public log_13835 f48964a;

    /* renamed from: b */
    public Object f48965b = new Object();

    /* renamed from: c */
    public int f48966c;

    /* renamed from: d */
    public int f48967d;

    /* renamed from: e */
    public boolean f48968e;

    /* renamed from: com.tencent.mm.modelstat.ChattingOperationUitl$b */
    public class C17795b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f48969d;

        /* renamed from: e */
        public final /* synthetic */ int f48970e;

        public C17795b(C72963f4 f4Var, int i) {
            this.f48969d = f4Var;
            this.f48970e = i;
        }

        public void run() {
            ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.this;
            C72963f4 f4Var = this.f48969d;
            int i = this.f48970e;
            chattingOperationUitl.getClass();
            SendOutMsgEvent sendOutMsgEvent = new SendOutMsgEvent();
            sendOutMsgEvent.f236286d.f236287a = f4Var;
            sendOutMsgEvent.publish();
            if (chattingOperationUitl.mo21919b()) {
                chattingOperationUitl.mo21920c(f4Var, C17797d.send, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelstat.ChattingOperationUitl$c */
    public class C17796c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C72963f4 f48972d;

        public C17796c(C72963f4 f4Var) {
            this.f48972d = f4Var;
        }

        public void run() {
            ChattingOperationUitl chattingOperationUitl = ChattingOperationUitl.this;
            C72963f4 f4Var = this.f48972d;
            chattingOperationUitl.getClass();
            SendOutMsgEvent sendOutMsgEvent = new SendOutMsgEvent();
            sendOutMsgEvent.f236286d.f236287a = f4Var;
            sendOutMsgEvent.publish();
            if (chattingOperationUitl.mo21919b()) {
                chattingOperationUitl.mo21920c(f4Var, C17797d.send, 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelstat.ChattingOperationUitl$d */
    public enum C17797d {
        click(2),
        send(3),
        fav(4),
        revoke(5),
        delete(6),
        voiceToText(7),
        translate(8),
        translateHidden(9),
        imageSaveToLocal(11),
        playMusic(12),
        stopMusic(13);
        

        /* renamed from: d */
        public int f48986d;

        /* access modifiers changed from: public */
        C17797d(int i) {
            this.f48986d = i;
        }
    }

    /* renamed from: com.tencent.mm.modelstat.ChattingOperationUitl$a */
    public class C17798a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f48987d;

        public C17798a(ChattingOperationUitl chattingOperationUitl, String str) {
            this.f48987d = str;
        }

        public void run() {
            Log.m105921e("MicroMsg.ChattingOperationUitl", "check error:%s", this.f48987d);
            log_13913 log_13913 = new log_13913();
            log_13913.scene_ = 1;
            log_13913.error_ = this.f48987d;
            C115669n.INSTANCE.mo175916z(13913, log_13913, false, false);
        }
    }

    public ChattingOperationUitl() {
        C177991 r0 = new IListener<SendMsgSuccessEvent>(C40008f.f107254d) {
            {
                this.__eventId = -1168836192;
            }

            public boolean callback(IEvent iEvent) {
                SendMsgSuccessEvent sendMsgSuccessEvent = (SendMsgSuccessEvent) iEvent;
                if (!(sendMsgSuccessEvent instanceof SendMsgSuccessEvent)) {
                    return false;
                }
                ChattingOperationUitl.this.mo21923f(sendMsgSuccessEvent.f193930d.f193931a);
                return false;
            }
        };
        this.f48966c = 1;
        this.f48967d = 1;
        this.f48968e = false;
        r0.alive();
    }

    /* renamed from: a */
    public final boolean mo21918a(String str) {
        String str2;
        if (Util.isNullOrNil(str)) {
            String mMStack = Util.getStack().toString();
            ((C119157j) C119157j.f356862d).mo183876g(new C17798a(this, mMStack), "ChattingOperationUtil.check");
            return false;
        }
        log_13835 log_13835 = this.f48964a;
        if (!(log_13835 == null || (str2 = log_13835.currChatName_) == null || str2.equals(str))) {
            mo21921d();
        }
        if (this.f48964a != null) {
            return true;
        }
        log_13835 log_138352 = new log_13835();
        this.f48964a = log_138352;
        log_138352.currChatName_ = str;
        return true;
    }

    /* renamed from: b */
    public boolean mo21919b() {
        if (!this.f48968e) {
            this.f48968e = true;
            if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.ChattingOperationUitl", "account has not ready");
            } else {
                C96980c Lo = SubCoreNewABTest.wx0().mo57622Lo("100148");
                if (Lo.isValid()) {
                    this.f48966c = Util.getInt(Lo.mo135598l2().get("needUploadData"), 1);
                }
                C96980c Lo2 = SubCoreNewABTest.wx0().mo57622Lo("100149");
                if (Lo2.isValid()) {
                    this.f48967d = Util.getInt(Lo2.mo135598l2().get("needUploadData"), 1);
                }
            }
        }
        return (this.f48966c == 0 && this.f48967d == 0) ? false : true;
    }

    /* renamed from: c */
    public final void mo21920c(C72963f4 f4Var, C17797d dVar, int i) {
        if (f4Var != null && mo21918a(f4Var.mo108768t())) {
            IMBehavior iMBehavior = new IMBehavior();
            iMBehavior.opType = 2;
            IMBehaviorMsgOP iMBehaviorMsgOP = new IMBehaviorMsgOP();
            iMBehavior.msgOp = iMBehaviorMsgOP;
            iMBehaviorMsgOP.msgType = f4Var.getType() & 65535;
            if (f4Var.mo101020w3()) {
                iMBehavior.msgOp.appMsgInnerType = i;
            }
            IMBehaviorMsgOP iMBehaviorMsgOP2 = iMBehavior.msgOp;
            iMBehaviorMsgOP2.msgOpType = dVar.f48986d;
            iMBehaviorMsgOP2.count = 1;
            synchronized (this.f48965b) {
                if (iMBehavior.opType == 1) {
                    this.f48964a.oplist_.add(iMBehavior);
                    return;
                }
                Iterator<IMBehavior> it = this.f48964a.oplist_.iterator();
                while (it.hasNext()) {
                    IMBehavior next = it.next();
                    if (next.opType == 2) {
                        IMBehaviorMsgOP iMBehaviorMsgOP3 = next.msgOp;
                        IMBehaviorMsgOP iMBehaviorMsgOP4 = iMBehavior.msgOp;
                        if (iMBehaviorMsgOP3.msgOpType == iMBehaviorMsgOP4.msgOpType && iMBehaviorMsgOP3.msgType == iMBehaviorMsgOP4.msgType && iMBehaviorMsgOP3.appMsgInnerType == iMBehaviorMsgOP4.appMsgInnerType) {
                            iMBehaviorMsgOP3.count++;
                            return;
                        }
                    }
                }
                this.f48964a.oplist_.add(iMBehavior);
            }
        }
    }

    /* renamed from: d */
    public void mo21921d() {
        boolean z;
        String str;
        if (mo21919b()) {
            synchronized (this.f48965b) {
                log_13835 log_13835 = this.f48964a;
                z = log_13835 != null && !log_13835.oplist_.isEmpty();
            }
            if (z) {
                if (this.f48967d != 0) {
                    Log.m105924i("MicroMsg.ChattingOperationUitl", "report imOperation(13835)");
                    C115669n.INSTANCE.mo175916z(13835, this.f48964a, false, false);
                }
                if (this.f48966c != 0) {
                    if (this.f48964a == null) {
                        str = "";
                    } else {
                        String str2 = ",";
                        LinkedList linkedList = new LinkedList();
                        synchronized (this.f48965b) {
                            linkedList.addAll(this.f48964a.oplist_);
                        }
                        Iterator it = linkedList.iterator();
                        boolean z2 = true;
                        while (it.hasNext()) {
                            IMBehavior iMBehavior = (IMBehavior) it.next();
                            if (!z2) {
                                str2 = str2 + "|";
                            }
                            String str3 = str2 + iMBehavior.opType + "#";
                            if (iMBehavior.opType == 1) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                IMBehaviorChattingOP iMBehaviorChattingOP = iMBehavior.chattingOp;
                                String str4 = "";
                                if (iMBehaviorChattingOP.changeUnread != 0) {
                                    str4 = str4 + "changeUnread=" + iMBehaviorChattingOP.changeUnread;
                                }
                                if (iMBehaviorChattingOP.changeTop != 0) {
                                    str4 = str4 + "changeTop=" + iMBehaviorChattingOP.changeTop;
                                }
                                if (iMBehaviorChattingOP.changeNotifyStatus != 0) {
                                    str4 = str4 + "changeNotifyStatus=" + iMBehaviorChattingOP.changeNotifyStatus;
                                }
                                if (iMBehaviorChattingOP.changeSaveAddress != 0) {
                                    str4 = str4 + "changeSaveAddress=" + iMBehaviorChattingOP.changeSaveAddress;
                                }
                                if (iMBehaviorChattingOP.expose != 0) {
                                    str4 = str4 + "expose=" + iMBehaviorChattingOP.expose;
                                }
                                sb.append(str4);
                                str2 = sb.toString();
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(str3);
                                IMBehaviorMsgOP iMBehaviorMsgOP = iMBehavior.msgOp;
                                int i = iMBehaviorMsgOP.msgType;
                                sb4.append(i == 49 ? String.format(Locale.US, "msgType=%d&msgOpType=%d&appMsgInnerType=%d&count=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(iMBehaviorMsgOP.msgOpType), Integer.valueOf(iMBehaviorMsgOP.appMsgInnerType), Integer.valueOf(iMBehaviorMsgOP.count)}) : String.format(Locale.US, "msgType=%d&msgOpType=%d&count=%d", new Object[]{Integer.valueOf(i), Integer.valueOf(iMBehaviorMsgOP.msgOpType), Integer.valueOf(iMBehaviorMsgOP.count)}));
                                str2 = sb4.toString();
                            }
                            z2 = false;
                        }
                        str = str2 + "," + this.f48964a.currChatName_;
                    }
                    Log.m105925i("MicroMsg.ChattingOperationUitl", "report imOperation(13748) reportStr:%s", str);
                    C115669n.INSTANCE.kvStat(13748, str);
                }
            }
            this.f48964a = null;
        }
    }

    /* renamed from: e */
    public void mo21922e(C72963f4 f4Var, int i) {
        new MMHandler(Looper.getMainLooper()).post(new C17795b(f4Var, i));
    }

    /* renamed from: f */
    public void mo21923f(C72963f4 f4Var) {
        new MMHandler(Looper.getMainLooper()).post(new C17796c(f4Var));
    }

    /* renamed from: g */
    public void mo21924g(boolean z, String str, boolean z2) {
        if (mo21919b()) {
            IMBehavior iMBehavior = new IMBehavior();
            int i = 1;
            iMBehavior.opType = 1;
            IMBehaviorChattingOP iMBehaviorChattingOP = new IMBehaviorChattingOP();
            iMBehavior.chattingOp = iMBehaviorChattingOP;
            if (!z2) {
                i = 2;
            }
            iMBehaviorChattingOP.changeUnread = i;
            if (z) {
                mo21921d();
            }
            if (mo21918a(str)) {
                synchronized (this.f48965b) {
                    this.f48964a.oplist_.add(iMBehavior);
                }
                if (z) {
                    mo21921d();
                }
            }
        }
    }
}
