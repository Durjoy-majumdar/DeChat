package hg0;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import zh3.C91753f;

/* renamed from: hg0.y */
public class C46070y extends MStorage {

    /* renamed from: e */
    public static final String[] f124218e = {"CREATE TABLE IF NOT EXISTS invitefriendopen ( username text  PRIMARY KEY , friendtype int  , updatetime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) "};

    /* renamed from: d */
    public C91753f f124219d;

    public C46070y(C91753f fVar) {
        this.f124219d = fVar;
    }

    public boolean Ft0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("select invitefriendopen.username,invitefriendopen.friendtype,invitefriendopen.updatetime,invitefriendopen.reserved1,invitefriendopen.reserved2,invitefriendopen.reserved3,invitefriendopen.reserved4 from invitefriendopen   where invitefriendopen.username = \"");
        sb.append(Util.escapeSqlValue("" + str));
        sb.append(FastJsonResponse.QUOTE);
        Cursor rawQuery = this.f124219d.rawQuery(sb.toString(), (String[]) null, 2);
        boolean moveToFirst = rawQuery.moveToFirst();
        rawQuery.close();
        return moveToFirst;
    }

    /* renamed from: jo */
    public boolean mo71489jo(C46069x xVar) {
        String str = xVar.f124212a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (Ft0(str)) {
            xVar.f124217f = -1;
            ContentValues a = xVar.mo71487a();
            C91753f fVar = this.f124219d;
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            String str3 = xVar.f124212a;
            if (str3 != null) {
                str2 = str3;
            }
            sb.append(str2);
            strArr[0] = sb.toString();
            return fVar.update("invitefriendopen", a, "username=?", strArr) > 0;
        }
        xVar.f124217f = -1;
        return ((int) this.f124219d.mo125627q("invitefriendopen", "username", xVar.mo71487a(), false)) != -1;
    }
}
