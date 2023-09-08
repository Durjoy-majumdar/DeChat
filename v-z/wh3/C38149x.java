package wh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import java.util.ArrayList;
import java.util.Iterator;
import zh3.C91753f;

/* renamed from: wh3.x */
public class C38149x extends MAutoStorage<SmileyInfo> {

    /* renamed from: e */
    public static final String[] f100800e = {MAutoStorage.getCreateSQLs(SmileyInfo.f82660F, "SmileyInfo")};

    /* renamed from: f */
    public static final String[] f100801f = {"key", "cnValue", "qqValue", "enValue", "twValue", "thValue", "eggIndex", DownloadInfo.FILENAME};

    /* renamed from: d */
    public ISQLiteDatabase f100802d;

    public C38149x(ISQLiteDatabase iSQLiteDatabase, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(iSQLiteDatabase, mAutoDBInfo, str, strArr);
        this.f100802d = iSQLiteDatabase;
    }

    /* renamed from: jo */
    public boolean mo61549jo(ArrayList<SmileyInfo> arrayList) {
        C91753f fVar;
        if (arrayList == null || arrayList.size() <= 0) {
            Log.m105924i("MicroMsg.emoji.NewSmileyInfoStorage", "insertSmileyInfoList failed. list is null.");
            return false;
        }
        long j = -1;
        ISQLiteDatabase iSQLiteDatabase = this.f100802d;
        if (iSQLiteDatabase instanceof C91753f) {
            fVar = (C91753f) iSQLiteDatabase;
            j = fVar.beginTransaction(Thread.currentThread().getId());
        } else {
            fVar = null;
        }
        this.f100802d.delete("SmileyInfo", (String) null, (String[]) null);
        Iterator<SmileyInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            insert(it.next());
        }
        int i = -1;
        if (fVar != null) {
            i = fVar.endTransaction(j);
        }
        return i >= 0;
    }
}
