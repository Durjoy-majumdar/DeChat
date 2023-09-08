package p212oe;

import android.text.TextUtils;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import java.util.HashMap;
import p1177ce.C113287a;
import p981ie.C87705i;

/* renamed from: oe.s$$i */
public final /* synthetic */ class s$$i implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C117776s f352282a;

    /* renamed from: b */
    public final /* synthetic */ C113287a f352283b;

    public /* synthetic */ s$$i(C117776s sVar, C113287a aVar) {
        this.f352282a = sVar;
        this.f352283b = aVar;
    }

    public final void accept(Object obj) {
        C117776s sVar = this.f352282a;
        C113287a aVar = this.f352283b;
        C114490k0.C114491a.C114492a aVar2 = (C114490k0.C114491a.C114492a) obj;
        sVar.getClass();
        if (aVar.mo165839c() == 2) {
            int i = 0;
            while (i < ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.size()) {
                if (i < 1 || WeChatEnvironment.hasDebugger() || WeChatEnvironment.isCoolassistEnv()) {
                    JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry threadJiffiesEntry = (JiffiesMonitorFeature.JiffiesSnapshot.ThreadJiffiesEntry) ((JiffiesMonitorFeature.JiffiesSnapshot) aVar2.f343207c).f343063h.f343212a.get(i);
                    if (!((HashMap) sVar.f343161j).containsKey(String.valueOf(threadJiffiesEntry.f343066b))) {
                        long max = Math.max(1, aVar2.f343208d / 60000);
                        if (max >= 5 && ((Long) threadJiffiesEntry.f343211a).longValue() / max >= 3000) {
                            String a = sVar.f343162k.f339057d.f339026A.mo122129a(threadJiffiesEntry.f343066b);
                            if (!TextUtils.isEmpty(a)) {
                                threadJiffiesEntry.f343070f = a;
                                ((HashMap) sVar.f343161j).put(String.valueOf(threadJiffiesEntry.f343066b), a);
                            }
                        } else {
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
