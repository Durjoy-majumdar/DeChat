package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.events.VoicePlayStopEvent;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.p136ui.chatting.component.VoiceComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.SensorController;
import com.tencent.p014mm.sdk.platformtools.ShakeManager;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import eb0.C97628l2;
import h81.C32735h;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import kd0.C76538e;
import kd0.C76549w;
import kd0.C76552z;
import nj3.C76912y0;
import ob0.C76996p;
import p371ph.C21967a;
import p492dn.C75415t;
import p910lj.C76701a;
import pu0.C110248b;
import uw2.C78296j;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.AutoPlay */
public class AutoPlay implements C76996p.C77000a, C76996p.C77001b, C76996p.C76997c, C76996p.C76999e, C76538e, SensorController.SensorEventCallBack, C97628l2 {

    /* renamed from: A */
    public long f215184A = 0;

    /* renamed from: B */
    public boolean f215185B = false;

    /* renamed from: C */
    public boolean f215186C = false;

    /* renamed from: D */
    public C76996p.C76998d f215187D = new C73255a();

    /* renamed from: E */
    public IListener f215188E = new IListener<RevokeMsgEvent>(C40008f.f107254d) {
        {
            this.__eventId = 675629679;
        }

        public boolean callback(IEvent iEvent) {
            RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
            long j = revokeMsgEvent.f78943d.f78944a;
            Log.m105919d("MicroMsg.AutoPlay", "playingVoiceId: %s", AutoPlay.this.f215195h + "");
            Log.m105919d("MicroMsg.AutoPlay", "msg id is: %s", revokeMsgEvent.f78943d.f78944a + "");
            if (AutoPlay.this.f215195h == j) {
                MMHandlerThread.postToMainThread(new C73682f0(this));
            }
            return false;
        }
    };

    /* renamed from: F */
    public MMHandler f215189F = new C73256b(Looper.getMainLooper());

    /* renamed from: G */
    public boolean f215190G = false;

    /* renamed from: d */
    public final MultiProcessMMKV f215191d = MultiProcessMMKV.getSingleMMKV("voice_continue_play_info");

    /* renamed from: e */
    public List<C72963f4> f215192e;

    /* renamed from: f */
    public boolean f215193f = false;

    /* renamed from: g */
    public C76996p f215194g;

    /* renamed from: h */
    public long f215195h = -1;

    /* renamed from: i */
    public C67391b f215196i;

    /* renamed from: j */
    public Context f215197j;

    /* renamed from: n */
    public VoiceComponent f215198n;

    /* renamed from: o */
    public SensorController f215199o;

    /* renamed from: p */
    public boolean f215200p;

    /* renamed from: q */
    public boolean f215201q = true;

    /* renamed from: r */
    public ShakeManager f215202r;

    /* renamed from: s */
    public long f215203s = -1;

    /* renamed from: t */
    public long f215204t = -1;

    /* renamed from: u */
    public boolean f215205u;

    /* renamed from: v */
    public int f215206v;

    /* renamed from: w */
    public String f215207w = "";

    /* renamed from: x */
    public boolean f215208x = true;

    /* renamed from: y */
    public boolean f215209y = false;

    /* renamed from: z */
    public long f215210z = 0;

    /* renamed from: com.tencent.mm.ui.chatting.AutoPlay$a */
    public class C73255a implements C76996p.C76998d {
        public C73255a() {
        }

        /* renamed from: a */
        public void mo102018a(long j) {
            AutoPlay.this.f215204t = j;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AutoPlay$b */
    public class C73256b extends MMHandler {
        public C73256b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            try {
                Log.m105924i("MicroMsg.AutoPlay", "reset speaker");
                boolean z = true;
                AutoPlay.this.mo102013p(true);
                AutoPlay autoPlay = AutoPlay.this;
                if (autoPlay.f215198n.f215719f) {
                    z = false;
                }
                autoPlay.f215200p = z;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AutoPlay", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AutoPlay$c */
    public class C73257c implements Runnable {
        public C73257c() {
        }

        public void run() {
            AutoPlay.this.f215203s = Util.currentTicks();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.AutoPlay$d */
    public class C73258d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ boolean f215215d;

        public C73258d(boolean z) {
            this.f215215d = z;
        }

        public boolean onTimerExpired() {
            if (!this.f215215d) {
                Log.m105924i("MicroMsg.AutoPlay", "speaker off");
                AutoPlay.this.mo102014q(false);
                AutoPlay autoPlay = AutoPlay.this;
                if (((C21967a) autoPlay.f215194g).mo35058b()) {
                    Log.m105918d("MicroMsg.AutoPlay", "deal sensor event, play next");
                    ((C21967a) autoPlay.f215194g).f62208i = false;
                    autoPlay.mo102010m(false, true);
                }
            } else {
                Log.m105924i("MicroMsg.AutoPlay", "speaker true");
                AutoPlay.this.getClass();
                AutoPlay autoPlay2 = AutoPlay.this;
                Context context = autoPlay2.f215197j;
                if (context != null) {
                    autoPlay2.f215196i.mo91555P(C0966R.raw.icons_outlined_speaker, C0966R.color.f2939n, context.getString(C0966R.string.f07), 2000);
                }
                AutoPlay.this.mo102014q(true);
                AutoPlay.this.mo102017t();
            }
            return false;
        }
    }

    public AutoPlay(C67391b bVar, VoiceComponent voiceComponent, String str) {
        this.f215197j = bVar.mo91565f();
        this.f215196i = bVar;
        this.f215198n = voiceComponent;
        if (this.f215199o == null) {
            this.f215199o = new SensorController(this.f215197j.getApplicationContext());
        }
        if (this.f215202r == null) {
            this.f215202r = new ShakeManager(this.f215197j.getApplicationContext());
        }
        mo102004g(str);
        this.f215188E.alive();
        C92614a aVar = (C92614a) C97625j3.m125813c();
        aVar.getClass();
        Log.m105919d("MicroMsg.BackgroundPlayer", "add callback : %s", toString());
        ((ArrayList) aVar.f266568b).add(this);
    }

    /* renamed from: a */
    public void mo96016a() {
        Log.m105920e("MicroMsg.AutoPlay", "voice play error");
        mo102016s(true);
        mo102009l();
    }

    /* renamed from: b */
    public void mo101999b(C72963f4 f4Var) {
        if ((this.f215208x && this.f215192e.isEmpty()) || f4Var == null || !f4Var.mo100995g4() || f4Var.mo108769t2() == 1 || f4Var.mo108768t() == null || !f4Var.mo108768t().equals(this.f215196i.mo91577r()) || !C97625j3.m125815e().f256815j || !this.f215196i.f193283g) {
            return;
        }
        if (C76552z.m92080r(f4Var)) {
            Log.m105920e("MicroMsg.AutoPlay", "should not in this setData");
            return;
        }
        mo102003f(f4Var);
        if (!this.f215193f && !((C21967a) this.f215194g).mo35058b() && Util.isTopActivity(this.f215197j)) {
            mo102009l();
        }
    }

    /* renamed from: c */
    public void mo102000c() {
        Log.m105924i("MicroMsg.AutoPlay", "phone or record stop, resume and do nothing");
        this.f215186C = false;
    }

    /* renamed from: d */
    public void mo102001d() {
        Log.printInfoStack("MicroMsg.AutoPlay", "phone comming or record start, stop play", new Object[0]);
        this.f215186C = true;
        mo102016s(true);
        mo102005h();
        try {
            SensorController sensorController = this.f215199o;
            if (sensorController != null) {
                sensorController.removeSensorCallBack();
            }
            ShakeManager shakeManager = this.f215202r;
            if (shakeManager != null) {
                shakeManager.stopShake();
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AutoPlay", e, "reset sensor error: %s", e.getMessage());
        }
    }

    /* renamed from: e */
    public void mo102002e(int i) {
        C72963f4 item;
        Class cls = C79368l.class;
        if (this.f215197j == null) {
            Log.m105920e("MicroMsg.AutoPlay", "context is null");
            return;
        }
        C67391b bVar = this.f215196i;
        if (bVar == null) {
            Log.m105920e("MicroMsg.AutoPlay", "add next failed: null mChattingContext");
            return;
        }
        int count = ((C79368l) bVar.f193278b.mo102812a(cls)).getCount();
        Log.m105918d("MicroMsg.AutoPlay", "position : " + i + "adapter getCount = " + count);
        if (i >= 0 && i < count && (item = ((C79368l) this.f215196i.f193278b.mo102812a(cls)).getItem(i)) != null) {
            if (item.mo100995g4() && item.mo108769t2() == 0 && !C76552z.m92079q(item) && !C76552z.m92080r(item)) {
                mo102003f(item);
            }
            mo102002e(i + 1);
        }
    }

    /* renamed from: f */
    public void mo102003f(C72963f4 f4Var) {
        if (f4Var != null) {
            if (C97625j3.m125812b().mo105883I()) {
                int size = ((LinkedList) this.f215192e).size();
                int i = 0;
                while (i < size) {
                    if (((C72963f4) ((LinkedList) this.f215192e).get(i)).getMsgId() != f4Var.getMsgId()) {
                        i++;
                    } else {
                        return;
                    }
                }
                if (this.f215205u || ((LinkedList) this.f215192e).size() == 0) {
                    ((LinkedList) this.f215192e).add(f4Var);
                }
                Log.m105918d("MicroMsg.AutoPlay", "add voice msg :" + ((LinkedList) this.f215192e).size());
            } else if (((LinkedList) this.f215192e).size() > 0) {
                ((LinkedList) this.f215192e).clear();
                C76912y0.m92771j(this.f215197j, this.f215196i.f193286j.getContentView());
            }
        }
    }

    /* renamed from: g */
    public void mo102004g(String str) {
        Log.m105925i("MicroMsg.AutoPlay", "changeTalker, isResumeFromDisableScreen: %b", Boolean.valueOf(this.f215209y));
        if (!this.f215209y && this.f215197j != null) {
            this.f215207w = str;
            if (str == null) {
                this.f215207w = "";
            }
            this.f215192e = new LinkedList();
            this.f215193f = false;
            mo102011n();
            this.f215195h = -1;
            this.f215200p = false;
            this.f215203s = -1;
            this.f215205u = false;
            this.f215206v = 0;
            C76996p pVar = this.f215194g;
            if (pVar != null) {
                ((ArrayList) ((C21967a) pVar).f62209j).remove(this.f215187D);
            }
            if (C72996z1.m85803I5(str)) {
                this.f215206v = 1;
                this.f215194g = new C21967a(this.f215197j, 1);
            } else {
                this.f215206v = 0;
                this.f215194g = new C21967a(this.f215197j, 0);
            }
            C76996p pVar2 = this.f215194g;
            ((ArrayList) ((C21967a) pVar2).f62209j).add(this.f215187D);
        }
    }

    /* renamed from: h */
    public void mo102005h() {
        if (1 == Log.getLogLevel()) {
            Log.m105919d("MicroMsg.AutoPlay", "clear play list, stack: %s", Util.getStack());
        }
        ((LinkedList) this.f215192e).clear();
    }

    /* renamed from: i */
    public void mo102006i(int i, C72963f4 f4Var) {
        if (f4Var != null) {
            mo102005h();
            Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(4115, (Object) null);
            if (bool == null || !bool.booleanValue()) {
                C97625j3.m125812b().mo105906u().mo119676J(4115, Boolean.TRUE);
                this.f215196i.mo91555P(C0966R.raw.icons_filled_ear, C0966R.color.f2933h, this.f215197j.getString(C0966R.string.f360267ba2), 4000);
            }
            if (!((C21967a) this.f215194g).mo35058b() || f4Var.getMsgId() != this.f215195h) {
                mo102003f(f4Var);
                if (f4Var.mo108769t2() == 0 && !C76552z.m92079q(f4Var)) {
                    mo102002e(i + 1);
                }
                mo102009l();
                return;
            }
            mo102016s(true);
        }
    }

    /* renamed from: j */
    public void mo102007j(int i, C72963f4 f4Var) {
        if (f4Var != null) {
            mo102005h();
            Boolean bool = (Boolean) C97625j3.m125812b().mo105906u().mo119684e(4115, (Object) null);
            if (bool == null || !bool.booleanValue()) {
                C97625j3.m125812b().mo105906u().mo119676J(4115, Boolean.TRUE);
                this.f215196i.mo91555P(C0966R.raw.icons_filled_ear, C0966R.color.f2933h, this.f215197j.getString(C0966R.string.f360267ba2), 4000);
            }
            if (!((C21967a) this.f215194g).mo35058b() || f4Var.getMsgId() != this.f215195h) {
                mo102003f(f4Var);
                if (f4Var.mo108769t2() == 0 && !C76552z.m92079q(f4Var)) {
                    mo102002e(i + 1);
                }
                mo102009l();
                return;
            }
            mo102016s(true);
        }
    }

    /* renamed from: k */
    public void mo102008k() {
        int i = 2;
        Log.m105929w("MicroMsg.AutoPlay", "voice play stop. %d, %d, %d, %b, %b, %s", Long.valueOf(this.f215195h), Long.valueOf(this.f215184A), Long.valueOf(Util.milliSecondsToNow(this.f215210z)), Boolean.valueOf(this.f215186C), Boolean.valueOf(this.f215185B), Util.getStack());
        long j = this.f215195h;
        if (j > 0) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[4];
            objArr[0] = Long.valueOf(j);
            objArr[1] = Long.valueOf(this.f215184A);
            objArr[2] = Long.valueOf(Util.milliSecondsToNow(this.f215210z));
            if (this.f215186C) {
                i = 3;
            } else if (this.f215185B) {
                i = 1;
            }
            objArr[3] = Integer.valueOf(i);
            nVar.mo160131h(15160, objArr);
        }
        this.f215186C = false;
        this.f215185B = false;
        this.f215198n.mo102331a6();
        mo102011n();
        mo102012o();
        if (this.f215192e.isEmpty()) {
            this.f215199o.removeSensorCallBack();
            this.f215202r.stopShake();
        }
        MMHandlerThread.postToMainThread(new C73686g0(this));
        this.f215195h = -1;
        this.f215209y = false;
        mo102013p(true);
    }

    /* renamed from: l */
    public void mo102009l() {
        mo102010m(true, false);
    }

    /* renamed from: m */
    public final void mo102010m(boolean z, boolean z2) {
        Log.m105925i("MicroMsg.AutoPlay", "play next: size: %s needAudioFocus: %s", Integer.valueOf(((LinkedList) this.f215192e).size()), Boolean.valueOf(z));
        if (((LinkedList) this.f215192e).size() <= 0) {
            this.f215189F.sendEmptyMessageDelayed(0, 1000);
            return;
        }
        C76996p pVar = this.f215194g;
        if (pVar != null) {
            ((C21967a) pVar).f62208i = z;
            ((C21967a) pVar).f62207h = z;
        }
        boolean z3 = !z2;
        try {
            Log.m105918d("MicroMsg.AutoPlay", "realPlayNext play next: size = " + ((LinkedList) this.f215192e).size());
            if (((LinkedList) this.f215192e).size() <= 0) {
                this.f215189F.sendEmptyMessageDelayed(0, 1000);
                return;
            }
            long createTime = ((C72963f4) ((LinkedList) this.f215192e).get(0)).getCreateTime();
            int size = ((LinkedList) this.f215192e).size();
            int i = 0;
            for (int i2 = 1; i2 < size; i2++) {
                if (createTime > ((C72963f4) ((LinkedList) this.f215192e).get(i2)).getCreateTime()) {
                    createTime = ((C72963f4) ((LinkedList) this.f215192e).get(i2)).getCreateTime();
                    i = i2;
                }
            }
            C72963f4 f4Var = (C72963f4) ((LinkedList) this.f215192e).get(i);
            if (f4Var != null) {
                mo102015r(f4Var, z3);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AutoPlay", e, "", new Object[0]);
        }
    }

    /* renamed from: n */
    public final void mo102011n() {
        if (this.f215195h >= 0 && this.f215204t > 2000) {
            String str = this.f215195h + "";
            String str2 = this.f215204t + "," + System.currentTimeMillis();
            this.f215191d.putString(str, str2);
            this.f215191d.putLong("current_interrupt_msg_id-" + this.f215207w, this.f215195h);
            Log.m105924i("MicroMsg.AutoPlay", "[voice interrupt] record id: " + str + " info: " + str2 + this.f215207w);
        }
    }

    /* renamed from: o */
    public final void mo102012o() {
        int size = ((LinkedList) this.f215192e).size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            if (((C72963f4) ((LinkedList) this.f215192e).get(i2)).getMsgId() == this.f215195h) {
                i = i2;
            }
        }
        if (i != -1) {
            ((LinkedList) this.f215192e).remove(i);
        }
        Log.m105918d("MicroMsg.AutoPlay", "remove voice msg : size = " + ((LinkedList) this.f215192e).size());
        if (((LinkedList) this.f215192e).size() == 0) {
            new VoicePlayStopEvent().asyncPublish(Looper.getMainLooper());
        }
    }

    public void onCompletion() {
        Log.m105925i("MicroMsg.AutoPlay", "voice play completion isSpeakerOn %b, %d, %d", Boolean.valueOf(this.f215200p), Long.valueOf(this.f215195h), Long.valueOf(this.f215184A));
        C115669n.INSTANCE.mo160131h(15160, Long.valueOf(this.f215195h), Long.valueOf(this.f215184A), Long.valueOf(this.f215184A), 0);
        if (this.f215197j != null) {
            Log.m105924i("MicroMsg.AutoPlay", "stop play complete");
            MMEntryLock.unlock("keep_app_silent");
            this.f215198n.mo102331a6();
            mo102012o();
            if (this.f215192e.isEmpty()) {
                this.f215199o.removeSensorCallBack();
                this.f215202r.stopShake();
            }
            MMHandlerThread.postToMainThread(new C73686g0(this));
            this.f215195h = -1;
            this.f215198n.mo102331a6();
            if (this.f215201q) {
                mo102010m(false, false);
            }
        }
    }

    public void onSensorEvent(boolean z) {
        Log.m105924i("MicroMsg.AutoPlay", "onSensorEvent, isON:" + z + "  hasSkip:" + this.f215190G + " tick:" + Util.ticksToNow(this.f215203s) + "  lt:" + this.f215203s);
        if (this.f215190G) {
            this.f215190G = !z;
        } else if (this.f215197j == null) {
            this.f215199o.removeSensorCallBack();
        } else {
            Object[] objArr = new Object[1];
            C67391b bVar = this.f215196i;
            objArr[0] = Boolean.valueOf(bVar != null ? bVar.mo91564e().f348102i : false);
            Log.m105925i("MicroMsg.AutoPlay", "isScreenOn: %s", objArr);
            if (!z) {
                long j = this.f215203s;
                if (j != -1 && Util.ticksToNow(j) > 400) {
                    this.f215190G = true;
                    return;
                }
            }
            this.f215190G = false;
            this.f215194g.getClass();
            if (C110248b.Jh0()) {
                Log.m105918d("MicroMsg.AutoPlay", "onSensorEvent, connecting bluetooth, omit sensor event");
            } else if (this.f215198n.f215719f) {
                mo102014q(false);
                if (this.f215195h != -1) {
                    mo102013p(z);
                    this.f215209y = z;
                } else {
                    mo102013p(true);
                    this.f215209y = true;
                }
                mo102017t();
            } else {
                if (this.f215195h != -1) {
                    C67391b bVar2 = this.f215196i;
                    if ((bVar2 != null ? bVar2.mo91564e().f348102i : false) != z) {
                        mo102013p(z);
                        this.f215209y = z;
                        new MTimerHandler(new C73258d(z), false).startTimer(50);
                    } else {
                        return;
                    }
                }
                Log.m105925i("MicroMsg.AutoPlay", "onSensorEvent, isResumeFromDisableScreen:%b", Boolean.valueOf(this.f215209y));
            }
        }
    }

    /* renamed from: p */
    public final void mo102013p(boolean z) {
        C67391b bVar = this.f215196i;
        if (bVar != null) {
            bVar.mo91564e().mo177104y0(z);
        }
    }

    /* renamed from: q */
    public void mo102014q(boolean z) {
        Log.printInfoStack("MicroMsg.AutoPlay", "speakerOn has been set %s", Boolean.valueOf(z));
        this.f215200p = z;
    }

    /* renamed from: r */
    public final void mo102015r(C72963f4 f4Var, boolean z) {
        boolean z2;
        boolean z3 = true;
        Assert.assertTrue(f4Var != null && (f4Var.mo100995g4() || f4Var.mo101001j4() || f4Var.mo100999i4() || f4Var.mo100998h4()));
        Log.m105925i("MicroMsg.AutoPlay", "start play msg: %d, recordInterrupt: %b", Long.valueOf(f4Var.getMsgId()), Boolean.valueOf(z));
        if (!this.f215199o.hasRegistered()) {
            this.f215199o.setSensorCallBack(this);
            if (this.f215202r.startShake(new C73257c())) {
                this.f215203s = 0;
            } else {
                this.f215203s = -1;
            }
        }
        if (C97625j3.m125812b().mo105883I() || Util.isNullOrNil(f4Var.mo108765s2())) {
            if (C97625j3.m125812b().mo105883I() && this.f215198n.mo102322H5()) {
                boolean zx02 = C110248b.zx0();
                boolean Jh0 = C110248b.Jh0();
                Log.m105925i("MicroMsg.AutoPlay", "alvinluo isHeadsetPlugged: %b, isBluetoothOn: %b", Boolean.valueOf(zx02), Boolean.valueOf(Jh0));
                if (zx02 || !Jh0) {
                    C76912y0.m92769h(this.f215196i.mo91567h().getActivity(), this.f215197j.getString(C0966R.string.b59), C0966R.raw.icons_filled_ear);
                } else {
                    C76912y0.m92769h(this.f215196i.mo91567h().getActivity(), this.f215197j.getString(C0966R.string.b58), C0966R.raw.icons_filled_bluetooth);
                }
            }
            MMEntryLock.lock("keep_app_silent");
            C76552z.m92082t(f4Var);
            if (((C21967a) this.f215194g).mo35058b() && z) {
                mo102011n();
            }
            ((C21967a) this.f215194g).mo35070n(true);
            this.f215204t = -1;
            this.f215198n.mo102329Y5();
            if (C110248b.zx0() || C110248b.Jh0()) {
                Log.m105925i("MicroMsg.AutoPlay", "headset plugged: %b, bluetoothon: %b", Boolean.valueOf(C110248b.zx0()), Boolean.valueOf(C110248b.Jh0()));
                this.f215200p = false;
            }
            String s2 = f4Var.mo108765s2();
            String b = this.f215206v == 1 ? C78296j.m94584b(s2, false) : ((C75415t) C86312j.m106911c(C75415t.class)).mo91610mf(s2);
            Log.m105924i("MicroMsg.AutoPlay", "startplay");
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_voice_enable_checksum, 0) == 1) {
                z2 = C76552z.m92065c(f4Var.mo108765s2());
                if (!z2) {
                    C115669n.INSTANCE.idkeyStat(111, 175, 1, false);
                }
            } else {
                z2 = true;
            }
            if (z2) {
                if (((C21967a) this.f215194g).mo35068l(b, this.f215200p, true, -1)) {
                    new C76549w(f4Var.getContent());
                    C76996p pVar = this.f215194g;
                    if (((LinkedList) this.f215192e).size() <= 1) {
                        z3 = false;
                    }
                    ((C21967a) pVar).mo35061e(z3);
                    ((C21967a) this.f215194g).mo35062f(this);
                    ((C21967a) this.f215194g).mo35063g(this);
                    ((C21967a) this.f215194g).mo35064h(this);
                    ((C21967a) this.f215194g).mo35065i(this);
                    this.f215195h = f4Var.getMsgId();
                    this.f215184A = new C76549w(f4Var.getContent()).mo106793b();
                    this.f215210z = System.currentTimeMillis();
                    MMHandlerThread.postToMainThread(new C73686g0(this));
                    this.f215209y = false;
                    return;
                }
            }
            this.f215195h = -1;
            mo102005h();
            Context context = this.f215197j;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.bam), 0).show();
            MMHandlerThread.postToMainThread(new C73686g0(this));
            this.f215209y = false;
            return;
        }
        ((LinkedList) this.f215192e).clear();
        C76912y0.m92771j(this.f215197j, this.f215196i.mo91567h().getContentView());
    }

    /* renamed from: s */
    public void mo102016s(boolean z) {
        Log.m105924i("MicroMsg.AutoPlay", "stop play");
        MMEntryLock.unlock("keep_app_silent");
        mo102011n();
        C21967a aVar = (C21967a) this.f215194g;
        aVar.f62208i = true;
        aVar.mo35070n(false);
    }

    /* renamed from: t */
    public void mo102017t() {
        C76996p pVar = this.f215194g;
        if (pVar != null && ((C21967a) pVar).mo35058b()) {
            Log.m105925i("MicroMsg.AutoPlay", "switchSpeaker, isSpeakerOn: %b, isPlaying: %b", Boolean.valueOf(this.f215200p), Boolean.valueOf(((C21967a) this.f215194g).mo35058b()));
            ((C21967a) this.f215194g).mo35066j(this.f215200p);
        }
    }
}
