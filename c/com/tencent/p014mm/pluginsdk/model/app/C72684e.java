package com.tencent.p014mm.pluginsdk.model.app;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.vfs.VFSStrategy;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import p763ym.C53537i;

/* renamed from: com.tencent.mm.pluginsdk.model.app.e */
public class C72684e extends MAutoStorage<C72683d> implements C53537i {

    /* renamed from: e */
    public static final String[] f211493e = {MAutoStorage.getCreateSQLs(C72683d.f211492p0, "appattach")};

    /* renamed from: f */
    public static final String[] f211494f = {"DROP INDEX IF EXISTS statusIndex", "CREATE INDEX IF NOT EXISTS msgInfoIdIndex ON appattach ( msgInfoId )", "CREATE INDEX IF NOT EXISTS appattach_statusIndex ON appattach ( status )"};

    /* renamed from: d */
    public ISQLiteDatabase f211495d;

    public C72684e(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C72683d.f211492p0, "appattach", f211494f);
        this.f211495d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public /* bridge */ /* synthetic */ boolean mo100147Lo(long j, C72683d dVar) {
        return super.get(j, dVar);
    }

    /* renamed from: Ow */
    public List<C72683d> mo100148Ow() {
        Cursor rawQuery = rawQuery("select *  , rowid  from appattach where status = 101", new String[0]);
        if (rawQuery == null) {
            return null;
        }
        int count = rawQuery.getCount();
        Log.m105918d("MicroMsg.AppAttachInfoStorage", "getUnfinishInfo resCount:" + count);
        if (count == 0) {
            rawQuery.close();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            rawQuery.moveToPosition(i);
            C72683d dVar = new C72683d();
            dVar.convertFrom(rawQuery);
            arrayList.add(dVar);
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: SE */
    public void mo100149SE(long j, long j2) {
        this.f211495d.execSQL("appattach", " update appattach set status = " + j2 + " , lastModifyTime = " + Util.nowSecond() + " where rowid = " + j);
        doNotify();
    }

    /* renamed from: Yt */
    public C72683d mo100150Yt(long j) {
        C72683d dVar = new C72683d();
        dVar.field_msgInfoId = j;
        if (!get(dVar, "msgInfoId")) {
            return null;
        }
        String str = dVar.field_fileFullPath;
        if (str != null) {
            if (str.startsWith(C86709a0.m107535s().f251806d + "attachment/")) {
                VFSStrategy.m163779g(dVar.field_fileFullPath, -1, 4, false);
            }
        }
        return dVar;
    }

    /* renamed from: bD */
    public /* bridge */ /* synthetic */ boolean mo100151bD(C72683d dVar) {
        return super.insert(dVar);
    }

    /* renamed from: jo */
    public /* bridge */ /* synthetic */ boolean mo100152jo(C72683d dVar, String[] strArr) {
        return super.delete(dVar, strArr);
    }

    /* renamed from: kD */
    public boolean update(C72683d dVar, String... strArr) {
        boolean update = super.update(dVar, strArr);
        Log.m105919d("MicroMsg.AppAttachInfoStorage", "update AppAttachInfo field_mediaId %s field_mediaSvrId %s ret %s %s", dVar.field_mediaId, dVar.field_mediaSvrId, Boolean.valueOf(update), "");
        return update;
    }

    /* renamed from: qq */
    public C72683d mo100154qq(String str) {
        C72683d dVar = new C72683d();
        dVar.field_mediaSvrId = str;
        if (!get(dVar, "mediaSvrId") && !get(dVar, "mediaId")) {
            return null;
        }
        String str2 = dVar.field_fileFullPath;
        if (str2 != null) {
            if (str2.startsWith(C86709a0.m107535s().f251806d + "attachment/")) {
                VFSStrategy.m163779g(dVar.field_fileFullPath, -1, 4, false);
            }
        }
        return dVar;
    }
}
