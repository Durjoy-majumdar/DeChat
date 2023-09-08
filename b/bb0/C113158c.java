package bb0;

import android.content.ContentValues;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C118874c6;

/* renamed from: bb0.c */
public final class C113158c extends MAutoStorage<C113157b> {

    /* renamed from: e */
    public static final String[] f338579e = {MAutoStorage.getCreateSQLs(C113157b.f338578Y, "MMPlayerMediaInfoDbCache")};

    /* renamed from: d */
    public final ISQLiteDatabase f338580d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113158c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C113157b.f338578Y, "MMPlayerMediaInfoDbCache", C118874c6.f355700A);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C113157b.f338578Y;
        this.f338580d = iSQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        cy3.C58003b.m67160a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Ft0(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "select *, rowid from MMPlayerMediaInfoDbCache  where mediaId = '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' "
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r3.f338580d
            r1 = 0
            android.database.Cursor r4 = r0.rawQuery(r4, r1)
            r0 = 0
            if (r4 == 0) goto L_0x0037
            int r2 = r4.getCount()     // Catch:{ all -> 0x0030 }
            if (r2 <= 0) goto L_0x002c
            r0 = 1
        L_0x002c:
            cy3.C58003b.m67160a(r4, r1)
            goto L_0x0037
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r1 = move-exception
            cy3.C58003b.m67160a(r4, r0)
            throw r1
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bb0.C113158c.Ft0(java.lang.String):boolean");
    }

    /* renamed from: Lo */
    public boolean insert(C113157b bVar) {
        C87412m.m108594g(bVar, "item");
        return super.insert(bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        cy3.C58003b.m67160a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        throw r1;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bb0.C113157b mo165662jo(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "select *, rowid from MMPlayerMediaInfoDbCache  where mediaId = '"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "' "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            bb0.b r1 = new bb0.b
            r1.<init>()
            r1.field_mediaId = r5
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r4.f338580d
            r3 = 0
            android.database.Cursor r0 = r2.rawQuery(r0, r3)
            if (r0 == 0) goto L_0x0043
            boolean r2 = r0.moveToFirst()     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x0034
            r1.convertFrom(r0)     // Catch:{ all -> 0x003c }
        L_0x0034:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003c }
            cy3.C58003b.m67160a(r0, r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x0043
        L_0x003c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            cy3.C58003b.m67160a(r0, r5)
            throw r1
        L_0x0043:
            if (r3 != 0) goto L_0x0060
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getByMediaId mediaId:"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = ", cursor is null."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Finder.FinderMediaCacheStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r5)
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bb0.C113158c.mo165662jo(java.lang.String):bb0.b");
    }

    /* renamed from: qq */
    public final boolean mo165663qq(C113157b bVar) {
        C87412m.m108594g(bVar, "item");
        ContentValues convertTo = bVar.convertTo();
        convertTo.remove("rowid");
        boolean z = true;
        if (this.f338580d.update(getTableName(), convertTo, "mediaId = ?", new String[]{Util.nullAsNil(convertTo.getAsString("mediaId"))}) <= 0) {
            z = false;
        }
        if (z) {
            doNotify();
        } else {
            Log.m105920e("Finder.FinderMediaCacheStorage", "[update] failure. " + bVar.field_mediaId);
        }
        return z;
    }
}
