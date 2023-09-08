package com.tencent.p014mm.plugin.p316ai.data.business.trigger;

import android.database.Cursor;
import c30.C104289g;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EnterMainUIEvent;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.autogen.events.KvReportEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.AiWeixinConversionStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PFloat;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import ih0.C108461a;
import ih0.C117197j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jh0.C33573a;
import kr0.C34016t0;
import lh0.C34262g;
import p922vj.C78420a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.LiveNotifyMsgTrigger */
public class LiveNotifyMsgTrigger implements C29082e {

    /* renamed from: a */
    public long f345319a = 0;

    /* renamed from: b */
    public long f345320b = 300000;

    /* renamed from: c */
    public HashSet<String> f345321c = null;

    /* renamed from: d */
    public IListener<KvReportEvent> f345322d;

    /* renamed from: e */
    public IListener<EnterMainUIEvent> f345323e;

    /* renamed from: f */
    public IListener<ExptChangeEvent> f345324f;

    public LiveNotifyMsgTrigger() {
        C40008f fVar = C40008f.f107254d;
        this.f345322d = new IListener<KvReportEvent>(fVar) {
            {
                this.__eventId = -624982229;
            }

            public boolean callback(IEvent iEvent) {
                if (((KvReportEvent) iEvent).f78853d.f78854a == 9999) {
                    Log.m105925i("MicroMsg.LiveNotifyMsgTrigger", "cash debug here. [%s]", LiveNotifyMsgTrigger.m161987c(LiveNotifyMsgTrigger.this, "1", 0));
                }
                return false;
            }
        };
        this.f345323e = new IListener<EnterMainUIEvent>(fVar) {
            {
                this.__eventId = 772715717;
            }

            public boolean callback(IEvent iEvent) {
                try {
                    LiveNotifyMsgTrigger.m161988d(LiveNotifyMsgTrigger.this, (EnterMainUIEvent) iEvent);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        this.f345324f = new IListener<ExptChangeEvent>(fVar) {
            {
                this.__eventId = -31521245;
            }

            public boolean callback(IEvent iEvent) {
                ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
                LiveNotifyMsgTrigger.this.mo174995f();
                return false;
            }
        };
        mo174995f();
    }

    /* renamed from: c */
    public static String m161987c(LiveNotifyMsgTrigger liveNotifyMsgTrigger, String str, long j) {
        liveNotifyMsgTrigger.getClass();
        long currentTicks = Util.currentTicks();
        try {
            C104289g gVar = new C104289g();
            gVar.put("lastSid", str);
            gVar.mo145954o("lastSidStayMs", j);
            gVar.put("sessions", liveNotifyMsgTrigger.mo174994e());
            gVar.mo145953n("headset", C108461a.m146963b());
            gVar.mo145953n(DownloadInfo.NETTYPE, NetStatusUtil.getIOSOldNetType(MMApplicationContext.getContext()));
            gVar.mo145953n("dueToNotification", C117197j.wx0().f351082e ? 1 : 0);
            C117197j.wx0().getClass();
            List<Integer> v7 = ((C34016t0) C86312j.m106911c(C34016t0.class)).mo56399v7();
            gVar.mo145953n("onlineDevice", (v7 == null || v7.size() <= 0) ? 0 : v7.get(0).intValue());
            PFloat pFloat = new PFloat();
            boolean a = C108461a.m146962a(pFloat);
            gVar.put("battery", String.format("%.2f", new Object[]{Float.valueOf(pFloat.value)}));
            gVar.mo145953n("isCharge", a ? 1 : 0);
            int d = C33573a.m40128d(Util.nowMilliSecond());
            C34262g vx02 = C34262g.vx0();
            vx02.requireAccountInitialized();
            gVar.mo145954o("weekHourStayMs", vx02.f92368f.mo59535kD(7, d));
            long ticksToNow = Util.ticksToNow(currentTicks);
            gVar.mo145954o("cost", ticksToNow);
            String gVar2 = gVar.toString();
            Log.m105925i("MicroMsg.LiveNotifyMsgTrigger", "checkDataToNotify cost[%d]", Long.valueOf(ticksToNow));
            return gVar2;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LiveNotifyMsgTrigger", e, "checkDataToNotify error", new Object[0]);
            return "";
        }
    }

    /* renamed from: d */
    public static void m161988d(LiveNotifyMsgTrigger liveNotifyMsgTrigger, EnterMainUIEvent enterMainUIEvent) {
        int i;
        HashSet<String> hashSet = liveNotifyMsgTrigger.f345321c;
        if (hashSet != null && hashSet.size() > 0 && liveNotifyMsgTrigger.f345321c.contains(enterMainUIEvent.f343547d.f343548a) && (i = Util.getInt(enterMainUIEvent.f343547d.f343548a, -1)) > -1 && i < 255) {
            if (Util.milliSecondsToNow(liveNotifyMsgTrigger.f345319a) <= liveNotifyMsgTrigger.f345320b) {
                C115669n.INSTANCE.idkeyStat(1559, 221, 1, false);
                return;
            }
            liveNotifyMsgTrigger.f345319a = Util.nowMilliSecond();
            ((C119157j) C119157j.f356862d).mo183876g(new C115239f(liveNotifyMsgTrigger, enterMainUIEvent), "Ai_thread");
        }
    }

    /* renamed from: a */
    public void mo22060a() {
        this.f345323e.alive();
        this.f345324f.alive();
        this.f345322d.alive();
    }

    /* renamed from: b */
    public void mo22061b() {
        this.f345323e.dead();
        this.f345324f.dead();
        this.f345322d.dead();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.String, android.database.Cursor] */
    /* renamed from: e */
    public final ArrayList<String> mo174994e() {
        char c;
        int i;
        ArrayList<String> arrayList = new ArrayList<>();
        C117197j.wx0().getClass();
        long currentTicks = Util.currentTicks();
        ArrayList arrayList2 = new ArrayList();
        ? r6 = 0;
        int i2 = 2;
        int i3 = 3;
        boolean z = true;
        int i4 = 0;
        try {
            C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
            String str = C45628s0.f123398d;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C78420a.f229768m1;
            Cursor G = ((C44660i2) Ku).mo69736G(str, r6, 18);
            if (G != null) {
                int i5 = 0;
                while (G.moveToNext()) {
                    AiWeixinConversionStruct aiWeixinConversionStruct = new AiWeixinConversionStruct();
                    int i6 = i5 + 1;
                    aiWeixinConversionStruct.f343642d = (long) i5;
                    aiWeixinConversionStruct.f343647i = (long) G.getInt(i4);
                    aiWeixinConversionStruct.f343645g = G.getLong(z ? 1 : 0);
                    String string = G.getString(i2);
                    String vx02 = C117197j.vx0(string);
                    if (!"plugin".equals(vx02)) {
                        string = vx02;
                    }
                    aiWeixinConversionStruct.f343643e = aiWeixinConversionStruct.mo86045b("usrType", string, z);
                    aiWeixinConversionStruct.f343644f = ((((G.getLong(i3) & -72057594037927936L) | (Util.nowMilliSecond() & 72057594037927935L)) & 4611686018427387904L) > 0 ? 1 : ((((G.getLong(i3) & -72057594037927936L) | (Util.nowMilliSecond() & 72057594037927935L)) & 4611686018427387904L) == 0 ? 0 : -1)) != 0 ? 1 : 0;
                    if (!"groupMute".equals(string)) {
                        if (!"singleMute".equals(string)) {
                            aiWeixinConversionStruct.f343646h = 0;
                            arrayList2.add(aiWeixinConversionStruct);
                            i5 = i6;
                            i2 = 2;
                            i3 = 3;
                            z = true;
                            i4 = 0;
                        }
                    }
                    aiWeixinConversionStruct.f343646h = 1;
                    arrayList2.add(aiWeixinConversionStruct);
                    i5 = i6;
                    i2 = 2;
                    i3 = 3;
                    z = true;
                    i4 = 0;
                }
            }
            if (G != null) {
                G.close();
            }
            i = 3;
            c = 0;
        } catch (Exception e) {
            c = 0;
            Log.printErrStackTrace("MicroMsg.AiWeixinData", e, "checkSesssionInfo", new Object[0]);
            if (r6 != 0) {
                r6.close();
            }
            i = 3;
        } catch (Throwable th) {
            if (r6 != 0) {
                r6.close();
            }
            throw th;
        }
        Object[] objArr = new Object[i];
        objArr[c] = 18;
        objArr[1] = Integer.valueOf(arrayList2.size());
        objArr[2] = Long.valueOf(Util.ticksToNow(currentTicks));
        Log.m105925i("MicroMsg.AiWeixinData", "checkToGetConversion limit[%d] size[%d] cost[%d]", objArr);
        if (arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AiWeixinConversionStruct aiWeixinConversionStruct2 = (AiWeixinConversionStruct) it.next();
                arrayList.add(String.format("{\"index\":%d,\"type\":%s,\"isTop\":%d,\"lastTime\":%d,\"sil\":%d,\"unread\":%d}", new Object[]{Long.valueOf(aiWeixinConversionStruct2.f343642d), aiWeixinConversionStruct2.f343643e, Long.valueOf(aiWeixinConversionStruct2.f343644f), Long.valueOf(aiWeixinConversionStruct2.f343645g), Long.valueOf(aiWeixinConversionStruct2.f343646h), Long.valueOf(aiWeixinConversionStruct2.f343647i)}));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final void mo174995f() {
        String[] split;
        Class cls = C32735h.class;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_live_notify_msg_scene, "");
        HashSet<String> hashSet = new HashSet<>();
        if (!Util.isNullOrNil(Y60) && (split = Y60.split(",")) != null && split.length > 0) {
            for (String add : split) {
                hashSet.add(add);
            }
        }
        this.f345321c = hashSet;
        long He = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32737c.clicfg_live_notify_msg_freq, 300000);
        this.f345320b = He;
        Log.m105925i("MicroMsg.LiveNotifyMsgTrigger", "reset control enterControlMap[%s] reqFreqControl[%d]", this.f345321c, Long.valueOf(He));
    }
}
