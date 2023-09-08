package com.tencent.p014mm.app.plugin.exdevice;

import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExDeviceChattingUIStateEvent;
import com.tencent.p014mm.autogen.events.ExDeviceOpInChattingUIEvent;
import com.tencent.p014mm.autogen.events.MMSwitchViewPushEvent;
import com.tencent.p014mm.autogen.events.OpFromExDeviceEvent;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import p248ug.C52558c;
import rb0.C47984k;
import tv2.C78112d;

/* renamed from: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic */
public class ChattingUIExDeviceLogic {

    /* renamed from: a */
    public C67391b f107332a;

    /* renamed from: b */
    public OpFromExDeviceEventListener f107333b;

    /* renamed from: c */
    public ExDeviceChattingUIStateEventListener f107334c;

    /* renamed from: d */
    public String f107335d;

    /* renamed from: e */
    public Map<String, Boolean> f107336e;

    /* renamed from: f */
    public boolean f107337f = true;

    /* renamed from: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$ExDeviceChattingUIStateEventListener */
    public class ExDeviceChattingUIStateEventListener extends IListener<ExDeviceChattingUIStateEvent> {
        public ExDeviceChattingUIStateEventListener() {
            super(C40008f.f107254d);
            this.__eventId = -1946755012;
        }

        public boolean callback(IEvent iEvent) {
            ((ExDeviceChattingUIStateEvent) iEvent).f107431d.f107432a = ChattingUIExDeviceLogic.this.f107337f;
            return true;
        }
    }

    /* renamed from: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$OpFromExDeviceEventListener */
    public class OpFromExDeviceEventListener extends IListener<OpFromExDeviceEvent> {
        public OpFromExDeviceEventListener() {
            super(C40008f.f107254d);
            this.__eventId = 1739921302;
        }

        public boolean callback(IEvent iEvent) {
            Map<String, Boolean> map;
            OpFromExDeviceEvent opFromExDeviceEvent = (OpFromExDeviceEvent) iEvent;
            C67391b bVar = ChattingUIExDeviceLogic.this.f107332a;
            if (bVar == null) {
                Log.m105920e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context == null");
            } else {
                bVar.mo91558S();
                if (ChattingUIExDeviceLogic.this.f107332a.f193286j.isFinishing()) {
                    Log.m105920e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context isFinishing");
                } else {
                    OpFromExDeviceEvent.C40149a aVar = opFromExDeviceEvent.f107677d;
                    int i = aVar.f107678a;
                    String str = aVar.f107680c;
                    Log.m105925i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "opcode is %d, brand name is %s", Integer.valueOf(i), str);
                    if (!ChattingUIExDeviceLogic.this.f107332a.mo91577r().equals(str)) {
                        Log.m105924i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "not current brandname");
                    } else if (i == 1) {
                        ChattingUIExDeviceLogic chattingUIExDeviceLogic = ChattingUIExDeviceLogic.this;
                        int i2 = opFromExDeviceEvent.f107677d.f107683f;
                        chattingUIExDeviceLogic.getClass();
                        Log.m105925i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "handleConnectFailedReason, reason : %d, brand name : %s", Integer.valueOf(i2), str);
                        C52558c b = C47984k.m53328b(str);
                        if (!ChattingUIExDeviceLogic.m43121a(b)) {
                            Log.m105929w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", str);
                        } else if (b.mo73500r2(false).mo73512e().f146823b == 1) {
                            chattingUIExDeviceLogic.f107332a.f193286j.setMMSubTitle((String) null);
                        }
                    } else if (i == 2) {
                        ChattingUIExDeviceLogic chattingUIExDeviceLogic2 = ChattingUIExDeviceLogic.this;
                        OpFromExDeviceEvent.C40149a aVar2 = opFromExDeviceEvent.f107677d;
                        int i3 = aVar2.f107682e;
                        String str2 = aVar2.f107679b;
                        synchronized (chattingUIExDeviceLogic2) {
                            Log.m105925i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connect state : %d", Integer.valueOf(i3));
                            if (chattingUIExDeviceLogic2.f107332a != null) {
                                if (!Util.isNullOrNil(str)) {
                                    C52558c b2 = C47984k.m53328b(str);
                                    if (!ChattingUIExDeviceLogic.m43121a(b2)) {
                                        Log.m105929w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "It's not a biz, brandName(%s).", str);
                                    } else {
                                        if (chattingUIExDeviceLogic2.f107336e == null) {
                                            chattingUIExDeviceLogic2.f107336e = new HashMap();
                                        }
                                        Map<String, Boolean> map2 = chattingUIExDeviceLogic2.f107336e;
                                        if (!str.equals(chattingUIExDeviceLogic2.f107335d)) {
                                            chattingUIExDeviceLogic2.f107335d = str;
                                            ((HashMap) map2).clear();
                                        }
                                        if (b2.mo73500r2(false).mo73512e().f146823b == 1) {
                                            chattingUIExDeviceLogic2.f107332a.f193286j.setMMSubTitle((String) null);
                                        } else {
                                            Log.m105919d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "connDeviceIds : (%s) , deviceId : (%s)", map2, str2);
                                            if (i3 == -1) {
                                                chattingUIExDeviceLogic2.f107332a.f193286j.setMMSubTitle((String) null);
                                            } else if (i3 != 0) {
                                                if (i3 != 1) {
                                                    if (i3 == 2) {
                                                        HashMap hashMap = (HashMap) map2;
                                                        hashMap.put(str2, Boolean.TRUE);
                                                        BaseChattingUIFragment baseChattingUIFragment = chattingUIExDeviceLogic2.f107332a.f193286j;
                                                        baseChattingUIFragment.setMMSubTitle(baseChattingUIFragment.getString(C0966R.string.cdm, Integer.valueOf(hashMap.size())));
                                                        Log.m105925i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now connected(deviceId : %s), set the tips gone", str2);
                                                    } else if (i3 == 4) {
                                                        HashMap hashMap2 = (HashMap) map2;
                                                        if (hashMap2.remove(str2) != null) {
                                                            Log.m105925i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "disconnected(deviceId : %s) successfully.", str2);
                                                        }
                                                        BaseChattingUIFragment baseChattingUIFragment2 = chattingUIExDeviceLogic2.f107332a.f193286j;
                                                        baseChattingUIFragment2.setMMSubTitle(baseChattingUIFragment2.getString(C0966R.string.cdm, Integer.valueOf(hashMap2.size())));
                                                    }
                                                } else if (((HashMap) map2).size() == 0) {
                                                    chattingUIExDeviceLogic2.f107332a.f193286j.setMMSubTitle((int) C0966R.string.cdn);
                                                }
                                            } else if (((HashMap) map2).size() == 0) {
                                                chattingUIExDeviceLogic2.f107332a.f193286j.setMMSubTitle((int) C0966R.string.cdo);
                                            }
                                        }
                                    }
                                }
                            }
                            Log.m105928w("MicroMsg.exdevice.ChattingUIExDeviceLogic", "context is null or brandName is null or nil.");
                        }
                    } else if (i == 3 && (map = ChattingUIExDeviceLogic.this.f107336e) != null) {
                        ((HashMap) map).clear();
                        Log.m105924i("MicroMsg.exdevice.ChattingUIExDeviceLogic", "clear connected device ids successfully.");
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.app.plugin.exdevice.ChattingUIExDeviceLogic$a */
    public class C40031a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f107340d;

        /* renamed from: e */
        public final /* synthetic */ String f107341e;

        public C40031a(int i, String str) {
            this.f107340d = i;
            this.f107341e = str;
        }

        public void run() {
            if (1 == this.f107340d) {
                ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent = new ExDeviceOpInChattingUIEvent();
                ExDeviceOpInChattingUIEvent.C40076a aVar = exDeviceOpInChattingUIEvent.f107475d;
                aVar.f107476a = 0;
                aVar.f107477b = this.f107341e;
                aVar.f107478c = ChattingUIExDeviceLogic.this.f107332a.mo91565f();
                exDeviceOpInChattingUIEvent.publish();
                if (this.f107341e.equals("gh_43f2581f6fd6")) {
                    ((C78112d) MvvmEventCenter.getEvent(C78112d.class)).publish(1);
                }
            }
            MMSwitchViewPushEvent mMSwitchViewPushEvent = new MMSwitchViewPushEvent();
            MMSwitchViewPushEvent.C40133a aVar2 = mMSwitchViewPushEvent.f107629d;
            aVar2.f107631b = this.f107340d;
            aVar2.f107632c = 1;
            aVar2.f107630a = this.f107341e;
            mMSwitchViewPushEvent.publish();
        }
    }

    public ChattingUIExDeviceLogic(C67391b bVar) {
        Log.m105918d("MicroMsg.exdevice.ChattingUIExDeviceLogic", "now init the event listener");
        this.f107332a = bVar;
        if (this.f107333b == null) {
            this.f107333b = new OpFromExDeviceEventListener();
        }
        this.f107333b.alive();
        if (this.f107334c == null) {
            this.f107334c = new ExDeviceChattingUIStateEventListener();
        }
        this.f107334c.alive();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r2 = r2.mo73500r2(false);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m43121a(p248ug.C52558c r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            ug.c$b r2 = r2.mo73500r2(r0)
            if (r2 == 0) goto L_0x001c
            ug.c$b$b r1 = r2.mo73512e()
            if (r1 == 0) goto L_0x001c
            ug.c$b$b r2 = r2.mo73512e()
            boolean r2 = r2.mo73527a()
            if (r2 == 0) goto L_0x001c
            r2 = 1
            return r2
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.app.plugin.exdevice.ChattingUIExDeviceLogic.m43121a(ug.c):boolean");
    }

    /* renamed from: b */
    public void mo62721b(int i, C52558c cVar) {
        C67391b bVar = this.f107332a;
        if (bVar == null) {
            Log.m105920e("MicroMsg.exdevice.ChattingUIExDeviceLogic", "notifySwitchView, context is null, maybe has been released");
            return;
        }
        String r = bVar.mo91577r();
        if (C45628s0.m50738C(r) && m43121a(cVar)) {
            C86709a0.m107525e().postToWorker(new C40031a(i, r));
        }
    }
}
