package rg0;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.LinkedList;
import java.util.List;
import zh3.C91753f;

/* renamed from: rg0.f */
public class C13001f extends MAutoStorage<C13000e> {

    /* renamed from: e */
    public static final String[] f37064e = {MAutoStorage.getCreateSQLs(C13000e.f37063v, "SafeDeviceInfo")};

    /* renamed from: d */
    public C91753f f37065d;

    public C13001f(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C13000e.f37063v, "SafeDeviceInfo", (String[]) null);
        if (iSQLiteDatabase instanceof C91753f) {
            this.f37065d = (C91753f) iSQLiteDatabase;
        }
    }

    public boolean insert(IAutoDBItem iAutoDBItem) {
        return super.insert((C13000e) iAutoDBItem);
    }

    /* renamed from: jo */
    public List<C13000e> mo12524jo() {
        LinkedList linkedList = new LinkedList();
        if (getCount() > 0) {
            Cursor all = super.getAll();
            while (all.moveToNext()) {
                C13000e eVar = new C13000e();
                eVar.convertFrom(all);
                linkedList.add(eVar);
            }
            all.close();
        }
        return linkedList;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        return super.replace((C13000e) iAutoDBItem);
    }
}
