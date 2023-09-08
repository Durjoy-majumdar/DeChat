package b42;

import android.database.Cursor;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.List;
import p749xh.C78833z5;
import te3.vb4;

/* renamed from: b42.d */
public final class C67152d extends MAutoStorage<C67151c> {

    /* renamed from: e */
    public static final String[] f192821e = {MAutoStorage.getCreateSQLs(C67151c.f192820B, "LocalStoryDetail")};

    /* renamed from: d */
    public ISQLiteDatabase f192822d;

    public C67152d(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C67151c.f192820B, "LocalStoryDetail", C78833z5.f231642p);
        this.f192822d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public List<vb4> mo91256jo(String str) {
        String format = String.format("SELECT * from %s where %s=?", new Object[]{"LocalStoryDetail", "packet_id"});
        Cursor rawQuery = this.f192822d.rawQuery(format, new String[]{str});
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            C67151c cVar = new C67151c();
            cVar.convertFrom(rawQuery);
            vb4 vb4 = new vb4();
            vb4.f228309g = cVar.field_height;
            vb4.f228310h = cVar.field_width;
            vb4.f228306d = cVar.field_media_type;
            vb4.f228307e = cVar.field_media_url;
            vb4.f228308f = cVar.field_media_md5;
            vb4.f228311i = cVar.field_media_fuzzy_thumbnail_url;
            vb4.f228312j = cVar.field_media_fuzzy_thumbnail_md5;
            arrayList.add(vb4);
        }
        rawQuery.close();
        return arrayList;
    }
}
