package ly1;

import android.database.Cursor;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.LinkedList;
import java.util.List;
import ji3.C9457a;
import p749xh.C66261f3;
import uy1.C52642c;

/* renamed from: ly1.h */
public class C99734h extends MAutoStorage<C99729g> {

    /* renamed from: d */
    public static final String[] f292305d = {MAutoStorage.getCreateSQLs(C99729g.f292289S, "GameHaowanMedia")};

    /* renamed from: ly1.h$a */
    public class C99735a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f292306d;

        public C99735a(C99734h hVar, List list) {
            this.f292306d = list;
        }

        public void run() {
            for (C99729g gVar : this.f292306d) {
                if (gVar != null) {
                    C41872f.m45396f(gVar.field_filePath);
                    C41872f.m45396f(gVar.field_thumbPath);
                    C41872f.m45396f(gVar.field_compressPath);
                }
            }
        }
    }

    public C99734h(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C99729g.f292289S, "GameHaowanMedia", (String[]) null);
    }

    /* renamed from: Lo */
    public C99729g mo139089Lo(String str) {
        String format = String.format("select * from %s where %s=\"%s\"", new Object[]{"GameHaowanMedia", C66261f3.COL_LOCALID, str});
        Log.m105924i("MicroMsg.Haowan.GameHaowanPublishStorage", "get, sql: " + format);
        Cursor rawQuery = rawQuery(format, new String[0]);
        C99729g gVar = null;
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToNext()) {
            gVar = new C99729g();
            gVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return gVar;
    }

    /* renamed from: jo */
    public void mo139090jo(LinkedList<String> linkedList) {
        LinkedList linkedList2;
        String format = String.format("select * from %s where %s in %s", new Object[]{"GameHaowanMedia", C66261f3.COL_LOCALID, C52642c.m58987e(linkedList)});
        Log.m105924i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchGet, sql: " + format);
        Cursor rawQuery = rawQuery(format, new String[0]);
        if (rawQuery == null) {
            linkedList2 = null;
        } else {
            LinkedList linkedList3 = new LinkedList();
            while (rawQuery.moveToNext()) {
                C99729g gVar = new C99729g();
                gVar.convertFrom(rawQuery);
                linkedList3.add(gVar);
            }
            rawQuery.close();
            linkedList2 = linkedList3;
        }
        if (!Util.isNullOrNil((List) linkedList2)) {
            C9457a.m9137a(new C99735a(this, linkedList2));
        }
        String format2 = String.format("delete from %s where %s in %s", new Object[]{"GameHaowanMedia", C66261f3.COL_LOCALID, C52642c.m58987e(linkedList)});
        Log.m105924i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchDelete, sql: " + format2);
        execSQL("GameHaowanMedia", format2);
    }
}
