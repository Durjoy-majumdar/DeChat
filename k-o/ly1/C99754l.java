package ly1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import sw1.C48484q;
import uy1.C52642c;

/* renamed from: ly1.l */
public class C99754l extends MAutoStorage<C99743i> {

    /* renamed from: d */
    public static final String[] f292361d = {MAutoStorage.getCreateSQLs(C99743i.f292335L, "GameHaowanPublishEdition")};

    public C99754l(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C99743i.f292335L, "GameHaowanPublishEdition", (String[]) null);
    }

    /* renamed from: Lo */
    public LinkedList<C99743i> mo139111Lo(LinkedList<String> linkedList) {
        String format = String.format("select * from %s where %s in %s", new Object[]{"GameHaowanPublishEdition", "taskId", C52642c.m58987e(linkedList)});
        Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchQuery, sql : %s", format);
        Cursor rawQuery = rawQuery(format, new String[0]);
        if (rawQuery == null) {
            return null;
        }
        LinkedList<C99743i> linkedList2 = new LinkedList<>();
        while (rawQuery.moveToNext()) {
            C99743i iVar = new C99743i();
            iVar.convertFrom(rawQuery);
            linkedList2.add(iVar);
        }
        rawQuery.close();
        return linkedList2;
    }

    /* renamed from: Ow */
    public boolean mo139112Ow(String str, int i) {
        String format = String.format("update %s set %s=%d where %s=\"%s\"", new Object[]{"GameHaowanPublishEdition", "uploadState", Integer.valueOf(i), "taskId", str});
        Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMediaUploadState, sql : %s", format);
        return execSQL("GameHaowanPublishEdition", format);
    }

    /* renamed from: Yt */
    public LinkedList<C99743i> mo139113Yt(int i) {
        String format = String.format("select * from %s where %s=%d", new Object[]{"GameHaowanPublishEdition", "publishState", Integer.valueOf(i)});
        Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryAllPublish: %s", format);
        Cursor rawQuery = rawQuery(format, new String[0]);
        if (rawQuery == null) {
            return null;
        }
        LinkedList<C99743i> linkedList = new LinkedList<>();
        while (rawQuery.moveToNext()) {
            C99743i iVar = new C99743i();
            iVar.convertFrom(rawQuery);
            linkedList.add(iVar);
        }
        rawQuery.close();
        return linkedList;
    }

    /* renamed from: bD */
    public boolean mo139114bD(String str, int i) {
        String format = String.format("update %s set %s=%d where %s=\"%s\"", new Object[]{"GameHaowanPublishEdition", "mixState", Integer.valueOf(i), "taskId", str});
        Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMixState, sql : %s", format);
        return execSQL("GameHaowanPublishEdition", format);
    }

    /* renamed from: jo */
    public void mo139115jo(LinkedList<String> linkedList) {
        LinkedList<C99743i> Lo = mo139111Lo(linkedList);
        if (Lo != null) {
            Iterator<C99743i> it = Lo.iterator();
            while (it.hasNext()) {
                ((C48484q) C86312j.m106911c(C48484q.class)).og0().mo139090jo(C52642c.m58981B(it.next().field_localIdList));
            }
            String format = String.format("delete from %s where %s in %s", new Object[]{"GameHaowanPublishEdition", "taskId", C52642c.m58987e(linkedList)});
            Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "batchDelete, sql : %s", format);
            execSQL("GameHaowanPublishEdition", format);
        }
    }

    /* renamed from: kD */
    public boolean mo139116kD(String str, int i) {
        String format = String.format("update %s set %s=%d where %s=\"%s\"", new Object[]{"GameHaowanPublishEdition", "publishState", Integer.valueOf(i), "taskId", str});
        Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "updatePublishState, sql : %s", format);
        return execSQL("GameHaowanPublishEdition", format);
    }

    /* renamed from: qq */
    public C99743i mo139117qq(String str) {
        String format = String.format("select * from %s where %s=\"%s\"", new Object[]{"GameHaowanPublishEdition", "taskId", str});
        Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "query, sql : %s", format);
        Cursor rawQuery = rawQuery(format, new String[0]);
        C99743i iVar = null;
        if (rawQuery == null) {
            return null;
        }
        if (rawQuery.moveToNext()) {
            iVar = new C99743i();
            iVar.convertFrom(rawQuery);
        }
        rawQuery.close();
        return iVar;
    }
}
