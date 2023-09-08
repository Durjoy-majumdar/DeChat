package uc0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import junit.framework.Assert;
import p216op.C47388d;
import zh3.C91753f;

/* renamed from: uc0.b */
public class C52516b extends MStorage implements C47388d {

    /* renamed from: e */
    public static final String[] f146679e = {"CREATE TABLE IF NOT EXISTS chattingbginfo ( username text  PRIMARY KEY , bgflag int  , path text  , reserved1 text  , reserved2 text  , reserved3 int  , reserved4 int  ) "};

    /* renamed from: d */
    public C91753f f146680d;

    public C52516b(C91753f fVar) {
        this.f146680d = fVar;
    }

    /* renamed from: Lo */
    public boolean mo73450Lo(C52515a aVar) {
        if (aVar == null) {
            return false;
        }
        aVar.f146678h = -1;
        if (((int) this.f146680d.mo125627q("chattingbginfo", "username", aVar.mo73448a(), false)) == -1) {
            return false;
        }
        doNotify(aVar.mo73449b());
        return true;
    }

    /* renamed from: jo */
    public C52515a mo73451jo(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("select chattingbginfo.username,chattingbginfo.bgflag,chattingbginfo.path,chattingbginfo.reserved1,chattingbginfo.reserved2,chattingbginfo.reserved3,chattingbginfo.reserved4 from chattingbginfo   where chattingbginfo.username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        C52515a aVar = null;
        Cursor rawQuery = this.f146680d.rawQuery(sb.toString(), (String[]) null, 2);
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToFirst()) {
            aVar = new C52515a();
            aVar.f146671a = rawQuery.getString(0);
            aVar.f146672b = rawQuery.getInt(1);
            aVar.f146673c = rawQuery.getString(2);
            aVar.f146674d = rawQuery.getString(3);
            aVar.f146675e = rawQuery.getString(4);
            aVar.f146676f = rawQuery.getInt(5);
            aVar.f146677g = rawQuery.getInt(6);
        }
        rawQuery.close();
        return aVar;
    }

    /* renamed from: qq */
    public boolean mo73452qq(C52515a aVar) {
        Assert.assertTrue(aVar != null);
        ContentValues a = aVar.mo73448a();
        if (a.size() > 0) {
            if (this.f146680d.update("chattingbginfo", a, "username= ?", new String[]{aVar.mo73449b()}) > 0) {
                doNotify(aVar.mo73449b());
                return true;
            }
        }
        return false;
    }
}
