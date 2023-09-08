package tr0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import tr0.C37240b;

/* renamed from: tr0.c */
public abstract class C37242c<_Model extends IAutoDBItem & C37240b> extends MAutoStorage<_Model> {

    /* renamed from: d */
    public final ISQLiteDatabase f98551d;

    public C37242c(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f98551d = iSQLiteDatabase;
    }

    public boolean delete(_Model _model, boolean z, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            strArr = ((C37240b) _model).getKeys();
        }
        return super.delete(_model, z, strArr);
    }

    public boolean get(_Model _model, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            strArr = ((C37240b) _model).getKeys();
        }
        return super.get(_model, strArr);
    }

    public boolean insertNotify(_Model _model, boolean z) {
        super.insertNotify(_model, z);
        return get(_model, new String[0]);
    }

    public boolean updateNotify(_Model _model, boolean z, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            strArr = ((C37240b) _model).getKeys();
        }
        return super.updateNotify(_model, z, strArr);
    }
}
