package iv0;

import com.tencent.p014mm.autogen.mmdata.rpt.BackupReportErrorStruct;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: iv0.a */
public class C98803a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MultiProcessMMKV f289654d;

    /* renamed from: e */
    public final /* synthetic */ int f289655e;

    public C98803a(C21140c cVar, MultiProcessMMKV multiProcessMMKV, int i) {
        this.f289654d = multiProcessMMKV;
        this.f289655e = i;
    }

    public void run() {
        String string = this.f289654d.getString("MMKV_BACKUP_ERROR_CACHE", "");
        if (Util.isNullOrNil(string)) {
            BackupReportErrorStruct backupReportErrorStruct = new BackupReportErrorStruct();
            backupReportErrorStruct.f265339f = this.f289655e;
            backupReportErrorStruct.mo86054n();
        } else {
            new BackupReportErrorStruct(string).mo86054n();
            this.f289654d.encode("MMKV_BACKUP_ERROR_CACHE", "");
        }
        this.f289654d.encode("MMKV_BACKUP_NEED_REPORT", false);
    }
}
