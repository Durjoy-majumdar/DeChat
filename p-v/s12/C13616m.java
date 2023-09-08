package s12;

import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: s12.m */
public class C13616m {
    /* renamed from: a */
    public static C13614k m12922a(C13614k kVar) {
        if (kVar == null) {
            return null;
        }
        Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "recordCancelCall, localId: %d", Long.valueOf(kVar.systemRowid));
        if (kVar.systemRowid != -1) {
            kVar.field_status = 7;
            C105385g.Cx0().mo13011Lo(kVar);
        }
        return kVar;
    }

    /* renamed from: b */
    public static C13614k m12923b(C13614k kVar, long j) {
        if (kVar == null) {
            return null;
        }
        Log.m105919d("MicroMsg.IPCallRecordStorageLogic", "recordSelfShutdownCall, localId: %d, talkTime: %d", Long.valueOf(kVar.systemRowid), Long.valueOf(j));
        if (kVar.systemRowid != -1) {
            kVar.field_status = 4;
            kVar.field_duration = j;
            C105385g.Cx0().mo13011Lo(kVar);
        }
        return kVar;
    }
}
