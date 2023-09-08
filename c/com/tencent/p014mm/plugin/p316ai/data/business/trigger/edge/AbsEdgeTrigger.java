package com.tencent.p014mm.plugin.p316ai.data.business.trigger.edge;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.EdgeHandleReportStruct;
import com.tencent.p014mm.plugin.p316ai.data.business.trigger.C29082e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import h81.C32735h;
import h81.C87460f;
import hh0.C20942f;
import java.util.List;
import kh0.C88149b;
import kh0.C88151c;
import lh0.C34262g;
import org.json.JSONObject;
import p1081gi.C98124g;
import p663qo.C101213l;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.ai.data.business.trigger.edge.AbsEdgeTrigger */
public abstract class AbsEdgeTrigger implements C29082e {

    /* renamed from: a */
    public final String f238081a;

    /* renamed from: b */
    public C32735h.C32737c f238082b;

    /* renamed from: c */
    public C32735h.C32737c f238083c;

    /* renamed from: d */
    public C32735h.C32737c f238084d;

    /* renamed from: e */
    public long f238085e = 0;

    /* renamed from: f */
    public C81060c f238086f = new C81060c();

    /* renamed from: g */
    public EdgeHandleReportStruct f238087g = new EdgeHandleReportStruct();

    /* renamed from: h */
    public IListener<ExptChangeEvent> f238088h = new IListener<ExptChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = -31521245;
        }

        public boolean callback(IEvent iEvent) {
            ExptChangeEvent exptChangeEvent = (ExptChangeEvent) iEvent;
            AbsEdgeTrigger.this.mo112993h();
            return false;
        }
    };

    public AbsEdgeTrigger(String str, C32735h.C32737c cVar, C32735h.C32737c cVar2, C32735h.C32737c cVar3) {
        this.f238081a = str;
        this.f238082b = cVar;
        this.f238083c = cVar2;
        this.f238084d = cVar3;
        mo112993h();
    }

    /* renamed from: c */
    public boolean mo112992c() {
        String str;
        C88149b bVar;
        char c;
        String str2;
        long currentTicks = Util.currentTicks();
        if (Util.isNullOrNil(this.f238086f.f238090a) || Util.isNullOrNil(this.f238086f.f238091b)) {
            return false;
        }
        if (Util.isNullOrNil(this.f238086f.f238093d)) {
            C81060c cVar = this.f238086f;
            C20942f yx02 = C20942f.yx0();
            C81060c cVar2 = this.f238086f;
            String str3 = cVar2.f238090a;
            String str4 = cVar2.f238091b;
            yx02.getClass();
            if (Util.isNullOrNil(str3)) {
                str = "";
            } else {
                synchronized (yx02) {
                    if (yx02.f59382q == null) {
                        yx02.f59382q = new C88149b();
                    }
                    bVar = yx02.f59382q;
                }
                PString pString = new PString();
                bVar.getClass();
                pString.value = "";
                String a = bVar.mo122558a(str3);
                if (!C86013q1.m106450k(a)) {
                    c = 65535;
                } else if (!str4.equalsIgnoreCase(C90193h.m112876d(a))) {
                    c = 65534;
                } else {
                    pString.value = a;
                    c = 0;
                }
                if (c == 0) {
                    try {
                        str = C86013q1.m106432N(pString.value);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.AiFinderLogic", e, "read file error", new Object[0]);
                    }
                } else {
                    if (Util.milliSecondsToNow(bVar.f254926a.containsKey(str3) ? bVar.f254926a.get(str3).longValue() : 0) > 1800000) {
                        C115669n.INSTANCE.mo175911u(1559, 0);
                        bVar.f254926a.put(str3, new Long(Util.nowMilliSecond()));
                        String a2 = bVar.mo122558a(str3);
                        C34262g vx02 = C34262g.vx0();
                        vx02.getClass();
                        if (Util.isNullOrNil(str3)) {
                            str2 = "";
                        } else {
                            StringBuilder sb = new StringBuilder();
                            vx02.requireAccountInitialized();
                            sb.append(vx02.f92373n);
                            sb.append(Math.abs(str3.hashCode()) + "");
                            sb.append("/");
                            str2 = sb.toString();
                        }
                        C88151c cVar3 = r9;
                        C88151c cVar4 = new C88151c(str3, a2, str4, bVar.f254927b, false, str2);
                        C98124g gVar = new C98124g();
                        gVar.field_mediaId = cVar3.f254933h;
                        gVar.f287672s = cVar3.f254929d;
                        gVar.field_fullpath = cVar3.f254934i;
                        gVar.field_fileType = 31000;
                        gVar.f287675v = false;
                        gVar.f287662f = cVar3;
                        ((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar);
                        Log.m105925i("MicroMsg.AiDownloadTask", "start to download task [%s] [%s] [%s]", cVar3.f254933h, cVar3.f254934i, cVar3.f254929d);
                        Log.m105925i("MicroMsg.AiDownloadLogic", "%s add to download url[%s] path[%s] md5[%s]", "" + bVar.hashCode(), str3, a2, str4);
                    }
                    str = "";
                }
            }
            cVar.f238093d = str;
        }
        boolean z = !Util.isNullOrNil(this.f238086f.f238093d);
        Log.m105919d(this.f238081a, "check edge runtime is ready? [%b] cost [%d]", Boolean.valueOf(z), Long.valueOf(Util.ticksToNow(currentTicks)));
        return z;
    }

    /* renamed from: d */
    public abstract boolean mo22070d(Object obj);

    /* renamed from: e */
    public abstract String mo22071e(Object obj);

    /* renamed from: f */
    public abstract long mo22072f(String str, Object obj);

    /* renamed from: g */
    public abstract String mo22073g(JSONObject jSONObject);

    /* renamed from: h */
    public final void mo112993h() {
        Class cls = C32735h.class;
        long currentTicks = Util.currentTicks();
        String str = "";
        String Y60 = BuildInfo.IS_ARM64 ? ((C32735h) C86312j.m106911c(cls)).Y60(this.f238082b, str) : ((C32735h) C86312j.m106911c(cls)).Y60(this.f238083c, str);
        if (Util.isNullOrNil(Y60)) {
            Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(this.f238084d, str);
        }
        try {
            JSONObject jSONObject = null;
            if (!Util.isNullOrNil(Y60)) {
                C81060c cVar = this.f238086f;
                cVar.f238093d = str;
                try {
                    JSONObject jSONObject2 = new JSONObject(Y60);
                    cVar.f238090a = jSONObject2.optString("url", str);
                    cVar.f238091b = jSONObject2.optString("md5", str);
                    cVar.f238092c = jSONObject2.optLong("freq", 300000);
                    jSONObject = jSONObject2;
                } catch (Exception unused) {
                }
            }
            if (jSONObject != null) {
                str = mo22073g(jSONObject);
            }
        } catch (Exception unused2) {
        }
        Log.m105925i(this.f238081a, "reset control [%s] parseLog[%s] cost[%d]", this.f238086f, str, Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: i */
    public final void mo112994i(Object obj) {
        String str;
        long currentTicks = Util.currentTicks();
        if (mo112992c() && Util.milliSecondsToNow(this.f238085e) > this.f238086f.f238092c && mo22070d(obj)) {
            this.f238085e = Util.nowMilliSecond();
            String e = mo22071e(obj);
            long ticksToNow = Util.ticksToNow(currentTicks);
            if (!Util.isNullOrNil(e)) {
                long currentTicks2 = Util.currentTicks();
                try {
                    List<String> H30 = ((C87460f) C86312j.m106911c(C87460f.class)).H30(this.f238086f.f238093d, e);
                    if (H30 != null && !H30.isEmpty()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        for (String append : H30) {
                            stringBuffer.append(append);
                            stringBuffer.append(",");
                        }
                        str = stringBuffer.toString();
                        Log.m105919d(this.f238081a, "run edge md5[%s] cost[%d] input[%s] output[%s] ", this.f238086f.f238091b, Long.valueOf(Util.ticksToNow(currentTicks2)), e, str);
                        long ticksToNow2 = Util.ticksToNow(currentTicks);
                        long f = mo22072f(str, obj);
                        long ticksToNow3 = Util.ticksToNow(currentTicks);
                        EdgeHandleReportStruct edgeHandleReportStruct = this.f238087g;
                        edgeHandleReportStruct.f236381d = edgeHandleReportStruct.mo86045b("JsMd5", this.f238086f.f238091b, true);
                        edgeHandleReportStruct.f236382e = ticksToNow;
                        edgeHandleReportStruct.f236383f = ticksToNow2 - ticksToNow;
                        edgeHandleReportStruct.f236384g = ticksToNow3 - ticksToNow2;
                        edgeHandleReportStruct.f236385h = ticksToNow3;
                        edgeHandleReportStruct.f236386i = f;
                        edgeHandleReportStruct.mo86054n();
                        Log.m105925i(this.f238081a, "handle enter event cost[%d] step[%d %d %d]", Long.valueOf(Util.ticksToNow(currentTicks)), Long.valueOf(ticksToNow), Long.valueOf(ticksToNow2), Long.valueOf(ticksToNow3));
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace(this.f238081a, e2, "run edge [%s]", e2.toString());
                }
                str = "";
                Log.m105919d(this.f238081a, "run edge md5[%s] cost[%d] input[%s] output[%s] ", this.f238086f.f238091b, Long.valueOf(Util.ticksToNow(currentTicks2)), e, str);
                long ticksToNow22 = Util.ticksToNow(currentTicks);
                long f2 = mo22072f(str, obj);
                long ticksToNow32 = Util.ticksToNow(currentTicks);
                EdgeHandleReportStruct edgeHandleReportStruct2 = this.f238087g;
                edgeHandleReportStruct2.f236381d = edgeHandleReportStruct2.mo86045b("JsMd5", this.f238086f.f238091b, true);
                edgeHandleReportStruct2.f236382e = ticksToNow;
                edgeHandleReportStruct2.f236383f = ticksToNow22 - ticksToNow;
                edgeHandleReportStruct2.f236384g = ticksToNow32 - ticksToNow22;
                edgeHandleReportStruct2.f236385h = ticksToNow32;
                edgeHandleReportStruct2.f236386i = f2;
                edgeHandleReportStruct2.mo86054n();
                Log.m105925i(this.f238081a, "handle enter event cost[%d] step[%d %d %d]", Long.valueOf(Util.ticksToNow(currentTicks)), Long.valueOf(ticksToNow), Long.valueOf(ticksToNow22), Long.valueOf(ticksToNow32));
            }
        }
    }
}
