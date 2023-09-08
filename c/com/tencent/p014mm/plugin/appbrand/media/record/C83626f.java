package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener;
import com.tencent.p014mm.plugin.appbrand.media.record.C83631l;
import com.tencent.p014mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.f */
public class C83626f {

    /* renamed from: a */
    public static Map<String, IListener> f244216a = new HashMap();

    /* renamed from: b */
    public static ArrayList<String> f244217b = new ArrayList<>();

    /* renamed from: c */
    public static boolean f244218c = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.f$a */
    public static final class C83627a implements C80916r<IPCVoid, IPCString> {
        private C83627a() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                Log.m105924i("MicroMsg.Record.AppBrandRecordClientService", "ipc updateDeviceInfo");
                return new IPCString(C86709a0.m107535s().mo121144k().mo119656Lo(77825));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.Record.AppBrandRecordClientService", e, "ipc updateDeviceInfo task", new Object[0]);
                return new IPCString("");
            }
        }
    }

    /* renamed from: a */
    public static void m102664a() {
        C83629j jVar;
        Log.m105924i("MicroMsg.Record.AppBrandRecordClientService", "onDestroy");
        Iterator<String> it = f244217b.iterator();
        while (it.hasNext()) {
            IListener iListener = (IListener) ((HashMap) f244216a).remove(it.next());
            if (iListener != null) {
                iListener.dead();
            }
        }
        ((HashMap) f244216a).clear();
        f244217b.clear();
        C83631l g = C83631l.m102667g();
        g.getClass();
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "destroy");
        C83631l.C83639h hVar = g.f244226e;
        if (hVar == C83631l.C83639h.START || hVar == C83631l.C83639h.RESUME || hVar == C83631l.C83639h.ERROR) {
            g.mo115950n();
        }
        if (g.f244237p) {
            RecordParam recordParam = g.f244225d;
            if (!(recordParam == null || (jVar = recordParam.f244272r) == null)) {
                AudioRecordVoIPInterruptListener audioRecordVoIPInterruptListener = (AudioRecordVoIPInterruptListener) jVar;
                audioRecordVoIPInterruptListener.f244199a = null;
                if (!audioRecordVoIPInterruptListener.f244203e) {
                    Log.m105920e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "not start listen");
                } else {
                    audioRecordVoIPInterruptListener.f244203e = false;
                    if (audioRecordVoIPInterruptListener.f244202d == null) {
                        audioRecordVoIPInterruptListener.f244202d = new AudioRecordVoIPInterruptListener.StopInterruptEventListenTask();
                    }
                    audioRecordVoIPInterruptListener.f244202d.mo114396f();
                }
            }
            g.f244237p = false;
        }
    }
}
