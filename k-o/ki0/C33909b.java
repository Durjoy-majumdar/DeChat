package ki0;

import android.database.Cursor;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38627o7;

/* renamed from: ki0.b */
public class C33909b extends MAutoStorage<C33908a> {

    /* renamed from: e */
    public static final String[] f91601e = {MAutoStorage.getCreateSQLs(C33908a.f91600z, "PredownloadBlockCgiRequest")};

    /* renamed from: d */
    public final ISQLiteDatabase f91602d;

    public C33909b(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C33908a.f91600z, "PredownloadBlockCgiRequest", C38627o7.f103234o);
        this.f91602d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public final Pair<Boolean, Integer> mo59361jo(String str, String str2, int i, int i2) {
        long nowSecond = Util.nowSecond();
        Cursor rawQuery = this.f91602d.rawQuery("select reportId from PredownloadBlockCgiRequest where " + str + "=? and " + "startTime" + "<" + nowSecond + " and " + nowSecond + "<" + "endTime" + " and " + "cgiList" + " like '%;" + i + ";%' and " + "sceneList" + " like '%;" + i2 + ";%'", new String[]{str2});
        int i3 = -1;
        if (rawQuery == null || rawQuery.isClosed()) {
            return Pair.create(Boolean.FALSE, -1);
        }
        boolean moveToFirst = rawQuery.moveToFirst();
        if (moveToFirst) {
            i3 = rawQuery.getInt(0);
        }
        rawQuery.close();
        return Pair.create(Boolean.valueOf(moveToFirst), Integer.valueOf(i3));
    }
}
