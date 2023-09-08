package eb0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C19623o0;
import f40.C86709a0;
import i40.C60247c;
import java.util.Set;
import sx3.C22415w0;

/* renamed from: eb0.g4 */
public final class C58540g4 extends C60247c {
    /* renamed from: e3 */
    public boolean mo75299e3() {
        return false;
    }

    public Set<IAutoDBItem> getAutoDBItemSet() {
        return C22415w0.m26092a(new C19623o0());
    }

    public ISQLiteDatabase getDB() {
        ISQLiteDatabase db = super.getDB();
        if (db != null || !C86709a0.m107522a()) {
            return db;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C86709a0.m107535s().f251807e);
        sb.append("UnEncryptNewBiz.db");
        return mo85232c3(sb.toString()) ? super.getDB() : db;
    }
}
