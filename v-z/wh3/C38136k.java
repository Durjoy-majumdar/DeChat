package wh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import java.util.ArrayList;
import java.util.Iterator;
import zh3.C91753f;

/* renamed from: wh3.k */
public class C38136k extends MAutoStorage<C38135j> {

    /* renamed from: e */
    public static final String[] f100779e = {MAutoStorage.getCreateSQLs(C38135j.f100778p, "EmojiSuggestDescInfo")};

    /* renamed from: d */
    public ISQLiteDatabase f100780d;

    public C38136k(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f100780d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public boolean mo61535jo(ArrayList<ArrayList<String>> arrayList) {
        C91753f fVar;
        if (arrayList == null || arrayList.isEmpty()) {
            Log.m105924i("MicroMsg.emoji.EmojiDescMapStorage", "group list is null.");
            return false;
        }
        long j = -1;
        ISQLiteDatabase iSQLiteDatabase = this.f100780d;
        if (iSQLiteDatabase instanceof C91753f) {
            fVar = (C91753f) iSQLiteDatabase;
            j = fVar.beginTransaction(Thread.currentThread().getId());
        } else {
            fVar = null;
        }
        this.f100780d.delete("EmojiSuggestDescInfo", "", (String[]) null);
        Iterator<ArrayList<String>> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            ArrayList next = it.next();
            if (next != null && !next.isEmpty()) {
                Iterator it4 = next.iterator();
                while (it4.hasNext()) {
                    String str = (String) it4.next();
                    if (!Util.isNullOrNil(str)) {
                        Log.m105919d("MicroMsg.emoji.EmojiDescMapStorage", "insert groupID%s, word:%s", i + "", str);
                        insert(new C38135j(i + "", str));
                    }
                }
                i++;
            }
        }
        if (fVar != null) {
            fVar.endTransaction(j);
        }
        return false;
    }
}
