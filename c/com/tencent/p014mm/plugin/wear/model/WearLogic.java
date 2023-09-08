package com.tencent.p014mm.plugin.wear.model;

import android.app.KeyguardManager;
import android.os.Looper;
import android.os.PowerManager;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppActiveEvent;
import com.tencent.p014mm.autogen.events.NewNotificationEvent;
import com.tencent.p014mm.autogen.events.NotifyNewFriendRequestEvent;
import com.tencent.p014mm.autogen.events.OpenChattingUIEvent;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.autogen.events.WearActionEvent;
import com.tencent.p014mm.autogen.events.WearVoipControllerEvent;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import eb0.C97625j3;
import f40.C86709a0;
import g62.C75875l;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import lc3.C10485b;
import o73.C47333a;
import o73.C47335c;
import o73.C47337e;
import o73.C47338f;
import o73.C47339g;
import o73.C47340h;
import o73.C47341i;
import o73.C47342j;
import o73.C47343k;
import o73.C47344l;
import p787ai.C79547b;
import te3.yu4;

/* renamed from: com.tencent.mm.plugin.wear.model.WearLogic */
public class WearLogic {

    /* renamed from: a */
    public PowerManager f117436a;

    /* renamed from: b */
    public KeyguardManager f117437b;

    /* renamed from: c */
    public IListener f117438c;

    /* renamed from: d */
    public IListener f117439d;

    /* renamed from: e */
    public IListener f117440e;

    /* renamed from: f */
    public IListener f117441f;

    /* renamed from: g */
    public MTimerHandler f117442g = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C43452b(this), true);

    /* renamed from: h */
    public IListener f117443h;

    /* renamed from: i */
    public IListener f117444i;

    /* renamed from: j */
    public IListener f117445j;

    /* renamed from: k */
    public IListener f117446k;

    /* renamed from: l */
    public C75875l.C75877b f117447l;

    /* renamed from: m */
    public IListener f117448m;

    /* renamed from: com.tencent.mm.plugin.wear.model.WearLogic$a */
    public class C43450a implements C75875l.C75877b {

        /* renamed from: com.tencent.mm.plugin.wear.model.WearLogic$a$a */
        public class C43451a extends C47335c {
            public C43451a(C43450a aVar) {
            }

            /* renamed from: b */
            public String mo67621b() {
                return "SendMsgSyncTask";
            }

            /* renamed from: c */
            public void mo67622c() {
                try {
                    C43457b.zx0().mo72270b(20007, C43457b.xx0().f347578d.f126743a.getBytes("utf8"), false);
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }

        public C43450a(WearLogic wearLogic) {
        }

        /* renamed from: w5 */
        public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
            if (!CrashReportFactory.isBackupMerge() && eVar != null && !Util.isNullOrNil(eVar.f123844a) && eVar.f123848e > 0 && C43457b.xx0() != null && eVar.f123844a.equals(C43457b.xx0().f347578d.f126743a)) {
                C43457b.Ax0().mo67630a(new C43451a(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wear.model.WearLogic$b */
    public class C43452b implements MTimerHandler.CallBack {
        public C43452b(WearLogic wearLogic) {
        }

        public boolean onTimerExpired() {
            C43457b.Ax0().mo67630a(new C47333a());
            return true;
        }
    }

    public WearLogic() {
        C40008f fVar = C40008f.f107254d;
        this.f117438c = new IListener<NewNotificationEvent>(fVar) {
            {
                this.__eventId = -1755589409;
            }

            public boolean callback(IEvent iEvent) {
                NewNotificationEvent newNotificationEvent = (NewNotificationEvent) iEvent;
                if (WearLogic.m46954a(WearLogic.this) && !"gh_3dfda90e39d6".equals(newNotificationEvent.f78873d.f78874a)) {
                    C72963f4 Ex0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Ex0(newNotificationEvent.f78873d.f78874a);
                    WearLogic.this.getClass();
                    if (Ex0 != null && ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WearLuckyBlock", 0) == 0 && (Ex0.mo100969H3() || Ex0.mo100970I3())) {
                        WearLogic.this.getClass();
                        C43457b.Ax0().mo67630a(new C47339g(Ex0));
                        NewNotificationEvent.C28781a aVar = newNotificationEvent.f78873d;
                        int i = aVar.f78875b;
                        if (i > 1) {
                            WearLogic wearLogic = WearLogic.this;
                            String str = aVar.f78874a;
                            wearLogic.getClass();
                            C43457b.Ax0().mo67630a(new C47342j(str, i, false, false));
                        }
                    } else {
                        WearLogic wearLogic2 = WearLogic.this;
                        NewNotificationEvent.C28781a aVar2 = newNotificationEvent.f78873d;
                        String str2 = aVar2.f78874a;
                        int i2 = aVar2.f78875b;
                        wearLogic2.getClass();
                        C43457b.Ax0().mo67630a(new C47342j(str2, i2, false, true));
                    }
                }
                return false;
            }
        };
        this.f117439d = new IListener<AppActiveEvent>(this, fVar) {
            {
                this.__eventId = 2123042947;
            }

            public boolean callback(IEvent iEvent) {
                if (!((AppActiveEvent) iEvent).f78710d.f78711a) {
                    return false;
                }
                C43468k Ax0 = C43457b.Ax0();
                if (Ax0 != null) {
                    Ax0.mo67630a(new C47341i(true));
                    return false;
                }
                Log.m105928w("MicroMsg.Wear.WearLogic", "[!] WearLogic:AppActiveEvent: WearWorker is null.");
                return false;
            }
        };
        this.f117440e = new IListener<OpenChattingUIEvent>(this, fVar) {
            {
                this.__eventId = -129697914;
            }

            public boolean callback(IEvent iEvent) {
                C79547b.f233255g.mo109607a(new C43461f(this, (OpenChattingUIEvent) iEvent));
                return false;
            }
        };
        this.f117441f = new IListener<VoipEvent>(this, fVar) {
            {
                this.__eventId = -797557590;
            }

            public boolean callback(IEvent iEvent) {
                byte[] bArr;
                VoipEvent.C67818a aVar = ((VoipEvent) iEvent).f194019d;
                if (aVar.f194022b == 3 && (bArr = aVar.f194023c) != null && bArr.length >= 10 && bArr[0] == 1) {
                    int length = bArr.length - 1;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 1, bArr2, 0, length);
                    yu4 yu4 = null;
                    try {
                        yu4 = (yu4) new yu4().parseFrom(bArr2);
                    } catch (IOException unused) {
                    }
                    if (yu4 != null) {
                        String str = yu4.f145525i;
                        Log.m105925i("MicroMsg.Wear.WearLogic", "voip invite talker=%s | type=%s", str, Integer.valueOf(yu4.f145526j));
                        C43457b.Ax0().mo67630a(new C47344l(20010, str));
                    }
                }
                return false;
            }
        };
        this.f117443h = new IListener<WearVoipControllerEvent>(this, fVar) {
            {
                this.__eventId = -1744162705;
            }

            public boolean callback(IEvent iEvent) {
                int i = ((WearVoipControllerEvent) iEvent).f107832d.f107833a;
                if (i == 5) {
                    C43457b.Ax0().mo67630a(new C47344l(20011, ""));
                    return false;
                } else if (i != 6 && i != 7) {
                    return false;
                } else {
                    C43457b.Ax0().mo67630a(new C47344l(20012, ""));
                    return false;
                }
            }
        };
        this.f117444i = new IListener<NotifyNewFriendRequestEvent>(fVar) {
            {
                this.__eventId = -645958448;
            }

            public boolean callback(IEvent iEvent) {
                NotifyNewFriendRequestEvent notifyNewFriendRequestEvent = (NotifyNewFriendRequestEvent) iEvent;
                if (!WearLogic.m46954a(WearLogic.this)) {
                    return false;
                }
                C43468k Ax0 = C43457b.Ax0();
                NotifyNewFriendRequestEvent.C40146a aVar = notifyNewFriendRequestEvent.f107665d;
                Ax0.mo67630a(new C47338f(aVar.f107666a, aVar.f107667b, aVar.f107668c));
                return false;
            }
        };
        this.f117445j = new IListener<SendMsgFailEvent>(fVar) {
            {
                this.__eventId = -1434030733;
            }

            public boolean callback(IEvent iEvent) {
                SendMsgFailEvent sendMsgFailEvent = (SendMsgFailEvent) iEvent;
                if (!WearLogic.m46954a(WearLogic.this)) {
                    return false;
                }
                C43457b.Ax0().mo67630a(new C47337e());
                return false;
            }
        };
        this.f117446k = new IListener<RevokeMsgEvent>(fVar) {
            {
                this.__eventId = 675629679;
            }

            public boolean callback(IEvent iEvent) {
                C72976h2 j;
                RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
                if (WearLogic.m46954a(WearLogic.this) && (j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(revokeMsgEvent.f78943d.f78946c.mo108768t())) != null) {
                    int G2 = j.mo108786G2();
                    C43462g a = C43457b.yx0().mo67628a(revokeMsgEvent.f78943d.f78946c.mo108768t());
                    if (G2 - a.f117479d > 0) {
                        WearLogic wearLogic = WearLogic.this;
                        String t = revokeMsgEvent.f78943d.f78946c.mo108768t();
                        wearLogic.getClass();
                        C43457b.Ax0().mo67630a(new C47342j(t, G2, false, false));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(a.f117477b));
                        C43457b.Ax0().mo67630a(new C47341i((ArrayList<Integer>) arrayList));
                    }
                }
                return false;
            }
        };
        this.f117447l = new C43450a(this);
        this.f117448m = new IListener<WearActionEvent>(fVar) {
            {
                this.__eventId = 1141445845;
            }

            public boolean callback(IEvent iEvent) {
                WearActionEvent wearActionEvent = (WearActionEvent) iEvent;
                int i = wearActionEvent.f107808d.f107810a;
                if (i == 2) {
                    WearLogic wearLogic = WearLogic.this;
                    WearActionEvent.C40183b bVar = wearActionEvent.f107809e;
                    long j = bVar.f107815b;
                    long j2 = bVar.f107814a;
                    String str = bVar.f107816c;
                    List list = bVar.f107817d;
                    wearLogic.getClass();
                    C43457b.Ax0().mo67630a(new C47340h(j, j2, str, list));
                } else if (i == 4 && ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WearPayBlock", 0) == 0) {
                    C43468k Ax0 = C43457b.Ax0();
                    WearActionEvent.C40182a aVar = wearActionEvent.f107808d;
                    Ax0.mo67630a(new C47343k(aVar.f107812c, aVar.f107813d));
                }
                return false;
            }
        };
        Log.m105924i("MicroMsg.Wear.WearLogic", "Create!");
        this.f117438c.alive();
        this.f117439d.alive();
        this.f117440e.alive();
        this.f117441f.alive();
        this.f117443h.alive();
        this.f117444i.alive();
        this.f117445j.alive();
        this.f117446k.alive();
        this.f117448m.alive();
        this.f117442g.startTimer(1800000);
        this.f117436a = (PowerManager) MMApplicationContext.getContext().getSystemService("power");
        this.f117437b = (KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard");
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(this.f117447l, (Looper) null);
    }

    /* renamed from: a */
    public static boolean m46954a(WearLogic wearLogic) {
        return wearLogic.f117437b.inKeyguardRestrictedInputMode() || !wearLogic.f117436a.isScreenOn();
    }
}
