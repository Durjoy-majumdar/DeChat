package z71;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;

/* renamed from: z71.g */
public class C39324g extends MAutoStorage<C39323f> {

    /* renamed from: e */
    public static final String[] f105718e = {MAutoStorage.getCreateSQLs(C39323f.f105717v, "HardIotDeviceInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f105719d;

    public C39324g(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C39323f.f105717v, "HardIotDeviceInfo", (String[]) null);
        this.f105719d = iSQLiteDatabase;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<z71.C39323f> mo62019jo() {
        /*
            r3 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.database.Cursor r1 = r3.getAll()
            if (r1 == 0) goto L_0x0022
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L_0x0022
        L_0x0011:
            z71.f r2 = new z71.f
            r2.<init>()
            r2.convertFrom(r1)
            r0.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x0011
        L_0x0022:
            if (r1 == 0) goto L_0x0027
            r1.close()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z71.C39324g.mo62019jo():java.util.List");
    }
}
