package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.t */
public class C83646t {

    /* renamed from: a */
    public static C83648b f244273a = new C83647a();

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.t$a */
    public static class C83647a implements C83648b {
        /* renamed from: a */
        public void mo115954a(ArrayList<IDKey> arrayList, boolean z) {
            Log.m105927v("Luggage.RecordStat", "lstIdKeyDataInfos:%s, isImportant:%b", arrayList, Boolean.valueOf(z));
        }

        public void idkeyStat(long j, long j2, long j3, boolean z) {
            Log.m105927v("Luggage.RecordStat", "ID:%d, key:%d, val:%d, isImportant:%b", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Boolean.valueOf(z));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.media.record.t$b */
    public interface C83648b {
        /* renamed from: a */
        void mo115954a(ArrayList<IDKey> arrayList, boolean z);

        void idkeyStat(long j, long j2, long j3, boolean z);
    }

    /* renamed from: a */
    public static void m102682a(int i) {
        f244273a.idkeyStat(689, (long) C29600s.m38829a(i), 1, true);
    }
}
