package up1;

import android.content.ContentValues;
import cm1.C55015f1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import p749xh.C66273s3;

/* renamed from: up1.x */
public final class C65427x extends MAutoStorage<C55015f1> {

    /* renamed from: e */
    public static final String[] f188282e = {MAutoStorage.getCreateSQLs(C55015f1.f154478Q0, "FinderMediaCacheInfoV3")};

    /* renamed from: d */
    public final ISQLiteDatabase f188283d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65427x(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C55015f1.f154478Q0, "FinderMediaCacheInfoV3", C66273s3.f190625D);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C55015f1.f154478Q0;
        this.f188283d = iSQLiteDatabase;
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
            java.lang.String r1 = "select *, rowid from FinderMediaCacheInfoV3  where mediaId = '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' "
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r3.f188283d
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
        throw new UnsupportedOperationException("Method not decompiled: up1.C65427x.Ft0(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        cy3.C58003b.m67160a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        throw r1;
     */
    /* renamed from: Lo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedList<cm1.C55015f1> mo89546Lo(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "originMediaId"
            gy3.C87412m.m108594g(r4, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select *, rowid from FinderMediaCacheInfoV3  where originMediaId = '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "' "
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r3.f188283d
            r2 = 0
            android.database.Cursor r4 = r1.rawQuery(r4, r2)
            if (r4 == 0) goto L_0x004e
            r4.moveToFirst()     // Catch:{ all -> 0x0047 }
        L_0x002c:
            boolean r1 = r4.isAfterLast()     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0041
            cm1.f1 r1 = new cm1.f1     // Catch:{ all -> 0x0047 }
            r1.<init>()     // Catch:{ all -> 0x0047 }
            r1.convertFrom(r4)     // Catch:{ all -> 0x0047 }
            r0.add(r1)     // Catch:{ all -> 0x0047 }
            r4.moveToNext()     // Catch:{ all -> 0x0047 }
            goto L_0x002c
        L_0x0041:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0047 }
            cy3.C58003b.m67160a(r4, r2)
            goto L_0x004e
        L_0x0047:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            cy3.C58003b.m67160a(r4, r0)
            throw r1
        L_0x004e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C65427x.mo89546Lo(java.lang.String):java.util.LinkedList");
    }

    /* renamed from: Yt */
    public final boolean mo89547Yt(C55015f1 f1Var) {
        C87412m.m108594g(f1Var, "item");
        ContentValues convertTo = f1Var.convertTo();
        convertTo.remove("rowid");
        boolean z = true;
        if (this.f188283d.update(getTableName(), convertTo, "mediaId = ?", new String[]{Util.nullAsNil(convertTo.getAsString("mediaId"))}) <= 0) {
            z = false;
        }
        if (z) {
            doNotify();
        } else {
            Log.m105920e("Finder.FinderMediaCacheStorage", "[update] failure. " + f1Var.field_mediaId);
        }
        return z;
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
    public final cm1.C55015f1 mo89548jo(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "select *, rowid from FinderMediaCacheInfoV3  where mediaId = '"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "' "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            cm1.f1 r1 = new cm1.f1
            r1.<init>()
            r1.field_mediaId = r5
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r4.f188283d
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
        throw new UnsupportedOperationException("Method not decompiled: up1.C65427x.mo89548jo(java.lang.String):cm1.f1");
    }

    /* renamed from: qq */
    public boolean insert(C55015f1 f1Var) {
        C87412m.m108594g(f1Var, "item");
        return super.insert(f1Var);
    }
}
