package c13;

import com.tencent.p014mm.plugin.trafficmonitor.TrafficClickFlowReceiver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1081gi.C98120c;

public final /* synthetic */ class h$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98120c f45494d;

    /* renamed from: e */
    public final /* synthetic */ String f45495e;

    public /* synthetic */ h$$a(C98120c cVar, String str) {
        this.f45494d = cVar;
        this.f45495e = str;
    }

    public final void run() {
        C98120c cVar = this.f45494d;
        String str = this.f45495e;
        if (cVar != null) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C113234h.f338832a;
            C28475f fVar = (C28475f) concurrentHashMap.get(str);
            long decodeLong = MultiProcessMMKV.getDefault().decodeLong("FileTransportStats_accumulateSize");
            if (fVar == null) {
                MultiProcessMMKV.getDefault().encode("FileTransportStats_accumulateSize", decodeLong + cVar.field_finishedLength);
                concurrentHashMap.put(str, new C28475f(str, cVar.field_toltalLength, cVar.field_finishedLength, cVar.field_isUploadTask));
                Map<String, TrafficClickFlowReceiver.C19400b> map = TrafficClickFlowReceiver.f54763a;
                if (!(System.currentTimeMillis() - TrafficClickFlowReceiver.f54765c <= 10000)) {
                    for (C16844r rVar : ((ConcurrentHashMap) C16846x.m16494b().f45512a).values()) {
                        rVar.f45491e = true;
                    }
                    Log.m105929w("FileTransportStats", "abnormal file transport: mediaId=%s, info=[%s]", str, cVar.toString());
                    return;
                }
                return;
            }
            long j = cVar.field_finishedLength;
            long j2 = fVar.f78273c;
            if (j >= j2) {
                MultiProcessMMKV.getDefault().encode("FileTransportStats_accumulateSize", decodeLong + (j - j2));
                fVar.f78273c = cVar.field_finishedLength;
                return;
            }
            Log.m105925i("FileTransportStats", "error: current finished len(%d) < last finished len(%d)", Long.valueOf(j), Long.valueOf(fVar.f78273c));
            return;
        }
        C28475f fVar2 = (C28475f) ((ConcurrentHashMap) C113234h.f338832a).remove(str);
        long decodeLong2 = MultiProcessMMKV.getDefault().decodeLong("FileTransportStats_accumulateSize");
        if (fVar2 != null) {
            long j3 = fVar2.f78272b;
            long j4 = fVar2.f78273c;
            if (j3 >= j4) {
                decodeLong2 += j3 - j4;
                MultiProcessMMKV.getDefault().encode("FileTransportStats_accumulateSize", decodeLong2);
                Log.m105924i("FileTransportStats", fVar2.toString());
            } else {
                Log.m105925i("FileTransportStats", "error: total len < finished len, fileInfo=%s", fVar2.toString());
            }
        }
        Log.m105925i("FileTransportStats", "accumulate size = %d", Long.valueOf(decodeLong2));
    }
}
