package z71;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.LinkedList;

/* renamed from: z71.c */
public class C53754c extends MAutoStorage<C53753b> {

    /* renamed from: e */
    public static final String[] f150887e = {MAutoStorage.getCreateSQLs(C53753b.f150886S0, "HardDeviceInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f150888d;

    public C53754c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C53753b.f150886S0, "HardDeviceInfo", (String[]) null);
        this.f150888d = iSQLiteDatabase;
        iSQLiteDatabase.execSQL("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceUsernameIndex ON HardDeviceInfo ( brandName )");
        iSQLiteDatabase.execSQL("HardDeviceInfo", "CREATE INDEX IF NOT EXISTS hardDeviceMacIndex ON HardDeviceInfo ( mac )");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<z71.C53753b> mo74329Lo() {
        /*
            r6 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.database.Cursor r1 = r6.getAll()
            if (r1 == 0) goto L_0x006e
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L_0x006e
        L_0x0011:
            z71.b r2 = new z71.b
            r2.<init>()
            r2.convertFrom(r1)
            java.lang.String r3 = r2.f150091H
            if (r3 == 0) goto L_0x0068
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            r5 = 0
            if (r4 == 0) goto L_0x002c
            java.lang.String r3 = "MicroMsg.exdevice.HardDeviceInfoStorage"
            java.lang.String r4 = "Ability is null or nil."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            goto L_0x0063
        L_0x002c:
            java.lang.String r4 = "wxmsg_music"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L_0x0062
            java.lang.String r4 = "wxmsg_poi"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L_0x0062
            java.lang.String r4 = "wxmsg_image"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L_0x0062
            java.lang.String r4 = "wxmsg_file"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L_0x0062
            java.lang.String r4 = "wxmsg_video"
            boolean r4 = r3.contains(r4)
            if (r4 != 0) goto L_0x0062
            java.lang.String r4 = "wxmsg_url"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0063
        L_0x0062:
            r5 = 1
        L_0x0063:
            if (r5 == 0) goto L_0x0068
            r0.add(r2)
        L_0x0068:
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x0011
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.close()
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z71.C53754c.mo74329Lo():java.util.List");
    }

    /* renamed from: Ow */
    public C53753b mo74330Ow(String str, String str2) {
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.exdevice.HardDeviceInfoStorage", "deviceType(%s) or deviceId(%s) is null or nil.", str2, str);
            return null;
        }
        Cursor query = this.f150888d.query("HardDeviceInfo", (String[]) null, "deviceType=? and deviceID=?", new String[]{str2, str}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            return null;
        }
        if (!query.moveToFirst()) {
            Log.m105929w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceType:%s and deviceId:%s", str2, str);
            query.close();
            return null;
        }
        C53753b bVar = new C53753b();
        bVar.convertFrom(query);
        query.close();
        return bVar;
    }

    /* renamed from: SE */
    public C53753b mo74331SE(String str) {
        Cursor query;
        if (Util.isNullOrNil(str) || (query = this.f150888d.query("HardDeviceInfo", (String[]) null, "mac=?", new String[]{str}, (String) null, (String) null, (String) null, 2)) == null) {
            return null;
        }
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + str);
            query.close();
            return null;
        }
        C53753b bVar = new C53753b();
        bVar.convertFrom(query);
        query.close();
        return bVar;
    }

    /* renamed from: TE */
    public C53753b mo74332TE(String str, String str2) {
        String str3 = str;
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            Log.m105921e("MicroMsg.exdevice.HardDeviceInfoStorage", "brandName(%s) or deviceId(%s) is null or nil.", str3, str2);
            return null;
        }
        Cursor query = this.f150888d.query("HardDeviceInfo", (String[]) null, "brandName=? and deviceID=?", new String[]{str3, str2}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            return null;
        }
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with brandName:" + str3);
            query.close();
            return null;
        }
        C53753b bVar = new C53753b();
        bVar.convertFrom(query);
        query.close();
        return bVar;
    }

    /* renamed from: Yt */
    public LinkedList<C53753b> mo74333Yt(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.exdevice.HardDeviceInfoStorage", "The given brandName is null or nil.");
            return null;
        }
        LinkedList<C53753b> linkedList = new LinkedList<>();
        Cursor query = this.f150888d.query("HardDeviceInfo", (String[]) null, "brandName=?", new String[]{str}, (String) null, (String) null, (String) null, 2);
        if (query == null) {
            return linkedList;
        }
        if (query.moveToFirst()) {
            do {
                C53753b bVar = new C53753b();
                bVar.convertFrom(query);
                linkedList.add(bVar);
            } while (query.moveToNext());
        }
        query.close();
        return linkedList;
    }

    /* renamed from: bD */
    public C53753b mo74334bD(String str) {
        Cursor query;
        if (Util.isNullOrNil(str) || (query = this.f150888d.query("HardDeviceInfo", (String[]) null, "deviceID=?", new String[]{str}, (String) null, (String) null, (String) null, 2)) == null) {
            return null;
        }
        if (!query.moveToFirst()) {
            Log.m105928w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with deviceId:" + str);
            query.close();
            return null;
        }
        C53753b bVar = new C53753b();
        bVar.convertFrom(query);
        query.close();
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* renamed from: bF */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<z71.C53753b> mo74335bF() {
        /*
            r8 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            android.database.Cursor r1 = r8.getAll()
            if (r1 == 0) goto L_0x0052
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L_0x0052
        L_0x0011:
            z71.b r2 = new z71.b
            r2.<init>()
            r2.convertFrom(r1)
            java.lang.String r3 = r2.f150086C
            java.lang.String r4 = r2.f150114z
            java.lang.String r5 = r2.f150087D
            java.lang.String r6 = r2.field_brandName
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x004c
            java.lang.String r7 = "1"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L_0x004c
            java.lang.String r7 = "0"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x004c
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r5 != 0) goto L_0x004c
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x004c
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r3 != 0) goto L_0x004c
            r0.add(r2)
        L_0x004c:
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L_0x0011
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z71.C53754c.mo74335bF():java.util.List");
    }

    /* renamed from: jo */
    public boolean mo74336jo(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (this.f150888d.delete("HardDeviceInfo", "deviceID=? and deviceType=? ", new String[]{str, str2}) <= 0) {
            Log.m105925i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo fail, deviceId = %s", str);
            return false;
        }
        Log.m105925i("MicroMsg.exdevice.HardDeviceInfoStorage", "delete hardDeviceInfo ok, deviceId = %s", str);
        return true;
    }

    /* renamed from: kD */
    public C53753b mo74337kD(long j) {
        ISQLiteDatabase iSQLiteDatabase = this.f150888d;
        Cursor query = iSQLiteDatabase.query("HardDeviceInfo", (String[]) null, "mac=?", new String[]{j + ""}, (String) null, (String) null, (String) null);
        C53753b bVar = null;
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            bVar = new C53753b();
            bVar.convertFrom(query);
        } else {
            Log.m105928w("MicroMsg.exdevice.HardDeviceInfoStorage", "get null with mac:" + j);
        }
        query.close();
        return bVar;
    }

    /* renamed from: mI */
    public int mo74338mI(C53753b bVar) {
        int i;
        if (bVar == null) {
            Log.m105924i("MicroMsg.exdevice.HardDeviceInfoStorage", "harddevice is null.");
            return 0;
        }
        ContentValues convertTo = bVar.convertTo();
        if (convertTo.size() > 0) {
            i = this.f150888d.update("HardDeviceInfo", convertTo, "deviceID = ? and deviceType = ? ", new String[]{bVar.field_deviceID, bVar.field_deviceType});
        } else {
            i = 0;
        }
        Log.m105925i("MicroMsg.exdevice.HardDeviceInfoStorage", "update: deviceId = %s, deviceType = %s, ret = %s ", bVar.field_deviceID, bVar.field_deviceType, Integer.valueOf(i));
        return i;
    }

    /* renamed from: qq */
    public LinkedList<C53753b> mo74339qq() {
        LinkedList<C53753b> linkedList = new LinkedList<>();
        Cursor rawQuery = rawQuery("select * from HardDeviceInfo where mac > 0 and connProto like '3'", new String[0]);
        if (rawQuery == null) {
            Log.m105920e("MicroMsg.exdevice.HardDeviceInfoStorage", "get cursor is null");
            return linkedList;
        }
        if (rawQuery.moveToFirst()) {
            do {
                C53753b bVar = new C53753b();
                bVar.convertFrom(rawQuery);
                linkedList.add(bVar);
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        return linkedList;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C53753b bVar = (C53753b) iAutoDBItem;
        if (bVar == null || Util.isNullOrNil(bVar.field_brandName) || Util.isNullOrNil(bVar.field_deviceID)) {
            Log.m105928w("MicroMsg.exdevice.HardDeviceInfoStorage", "wrong argument");
            return false;
        }
        boolean z = this.f150888d.replace("HardDeviceInfo", C53753b.f150886S0.primaryKey, bVar.convertTo()) > 0;
        Log.m105925i("MicroMsg.exdevice.HardDeviceInfoStorage", "replace: brandName=%s, deviceId=%s, ret=%s ", bVar.field_brandName, bVar.field_deviceID, Boolean.valueOf(z));
        return z;
    }
}
