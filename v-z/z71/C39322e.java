package z71;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: z71.e */
public class C39322e extends MAutoStorage<C39321d> {

    /* renamed from: e */
    public static final String[] f105715e = {MAutoStorage.getCreateSQLs(C39321d.f105714D, "HardIotCdnInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f105716d;

    public C39322e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C39321d.f105714D, "HardIotCdnInfo", (String[]) null);
        this.f105716d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public boolean mo62018jo(long j) {
        if (this.f105716d.delete("HardIotCdnInfo", "msgid=?", new String[]{String.valueOf(j)}) <= 0) {
            Log.m105925i("MicroMsg.exdevice.HardIotCdnInfoStorage", "delete HardIotCdnInfo fail, msgId = %d", Long.valueOf(j));
            return false;
        }
        Log.m105925i("MicroMsg.exdevice.HardIotCdnInfoStorage", "delete HardIotCdnInfo ok, msgId = %d", Long.valueOf(j));
        return true;
    }
}
