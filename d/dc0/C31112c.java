package dc0;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.storage.MStorage;
import zh3.C91753f;

/* renamed from: dc0.c */
public class C31112c extends MStorage {

    /* renamed from: e */
    public static final String[] f83413e = {"CREATE TABLE IF NOT EXISTS getcontactinfov2 ( username text  PRIMARY KEY , inserttime long  , type int  , lastgettime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) "};

    /* renamed from: d */
    public C91753f f83414d;

    public C31112c(C91753f fVar) {
        this.f83414d = fVar;
    }

    /* renamed from: Lo */
    public boolean mo57988Lo(C31111b bVar) {
        if (bVar == null) {
            return false;
        }
        bVar.f83412i = -1;
        ContentValues contentValues = new ContentValues();
        String str = "";
        if ((bVar.f83412i & 1) != 0) {
            String str2 = bVar.f83404a;
            if (str2 == null) {
                str2 = str;
            }
            contentValues.put("username", str2);
        }
        if ((bVar.f83412i & 2) != 0) {
            contentValues.put("inserttime", Long.valueOf(bVar.f83405b));
        }
        if ((bVar.f83412i & 4) != 0) {
            contentValues.put("type", Integer.valueOf(bVar.f83406c));
        }
        if ((bVar.f83412i & 8) != 0) {
            contentValues.put("lastgettime", Integer.valueOf(bVar.f83407d));
        }
        if ((bVar.f83412i & 16) != 0) {
            contentValues.put("reserved1", Integer.valueOf(bVar.f83408e));
        }
        if ((bVar.f83412i & 32) != 0) {
            contentValues.put("reserved2", Integer.valueOf(bVar.f83409f));
        }
        if ((bVar.f83412i & 64) != 0) {
            String str3 = bVar.f83410g;
            if (str3 == null) {
                str3 = str;
            }
            contentValues.put("reserved3", str3);
        }
        if ((bVar.f83412i & 128) != 0) {
            String str4 = bVar.f83411h;
            if (str4 == null) {
                str4 = str;
            }
            contentValues.put("reserved4", str4);
        }
        if (((int) this.f83414d.replace("getcontactinfov2", "username", contentValues)) == -1) {
            return false;
        }
        String str5 = bVar.f83404a;
        if (str5 != null) {
            str = str5;
        }
        doNotify(str);
        return true;
    }

    /* renamed from: jo */
    public boolean mo57989jo(String str) {
        C91753f fVar = this.f83414d;
        if (fVar.delete("getcontactinfov2", "username= ?", new String[]{"" + str}) <= 0) {
            return false;
        }
        doNotify(str);
        return true;
    }
}
