package up1;

import android.content.ContentValues;
import com.tencent.p014mm.autogen.events.FinderCommentChangeEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import p749xh.C66279z2;
import sx3.C110823p;

/* renamed from: up1.c */
public final class C65412c extends MAutoStorage<C65425v0> {

    /* renamed from: f */
    public static final String[] f188250f = {MAutoStorage.getCreateSQLs(C65425v0.f188276L, "FinderAction")};

    /* renamed from: g */
    public static final String[] f188251g;

    /* renamed from: d */
    public final ISQLiteDatabase f188252d;

    /* renamed from: e */
    public final String f188253e = "SELECT * FROM FinderAction";

    /* renamed from: up1.c$a */
    public static final class C37520a {

        /* renamed from: a */
        public final long f99118a;

        /* renamed from: b */
        public final String f99119b;

        public C37520a(long j, String str) {
            C87412m.m108594g(str, "objectNonceId");
            this.f99118a = j;
            this.f99119b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37520a)) {
                return false;
            }
            C37520a aVar = (C37520a) obj;
            return this.f99118a == aVar.f99118a && C87412m.m108589b(this.f99119b, aVar.f99119b);
        }

        public int hashCode() {
            long j = this.f99118a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f99119b.hashCode();
        }

        public String toString() {
            return "FeedAndNonceId(feedId=" + this.f99118a + ", objectNonceId=" + this.f99119b + ')';
        }
    }

    static {
        String[] strArr = C66279z2.f190798u;
        C87412m.m108593f(strArr, "INDEX_CREATE");
        List c0 = C110823p.m151003c0(strArr);
        ArrayList arrayList = (ArrayList) c0;
        arrayList.add("CREATE INDEX IF NOT EXISTS " + C65425v0.f188277M + " ON FinderAction ( actionType,state,postTime )");
        arrayList.add("CREATE INDEX IF NOT EXISTS " + C65425v0.f188278N + " ON FinderAction (actionType,feedId, postTime)");
        Object[] array = arrayList.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        f188251g = (String[]) array;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65412c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C65425v0.f188276L, "FinderAction", f188251g);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C65425v0.f188276L;
        this.f188252d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final void mo89493Lo(long j, long j2, long j3, int i, C65426w0 w0Var) {
        FinderCommentChangeEvent finderCommentChangeEvent = new FinderCommentChangeEvent();
        FinderCommentChangeEvent.C55120a aVar = finderCommentChangeEvent.f154754d;
        aVar.f154755a = j;
        aVar.f154756b = j2;
        aVar.f154757c = j3;
        aVar.f154758d = i;
        aVar.f154759e = w0Var;
        Log.m105924i("Finder.FinderActionStorage", "postEvent, feedId:" + j + ", commentId:" + j2 + ", localId:" + j3 + ", opType:" + i);
        finderCommentChangeEvent.publish();
    }

    /* renamed from: Yt */
    public final boolean mo89494Yt(long j, C65426w0 w0Var, boolean z) {
        C87412m.m108594g(w0Var, FFmpegMetadataRetriever.METADATA_KEY_COMMENT);
        ContentValues convertTo = w0Var.convertTo();
        convertTo.remove("rowid");
        ISQLiteDatabase iSQLiteDatabase = this.f188252d;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(j);
        boolean z2 = iSQLiteDatabase.update("FinderAction", convertTo, "localCommentId=?", new String[]{sb.toString()}) > 0;
        if (z) {
            mo89493Lo(w0Var.field_feedId, w0Var.mo89531n2(), w0Var.field_localCommentId, 3, w0Var);
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        cy3.C58003b.m67160a(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        throw r7;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<up1.C65426w0> mo89495jo(long r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.f188253e
            r0.append(r1)
            java.lang.String r1 = " WHERE actionType = 1 and feedId = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = " ORDER BY postTime DESC"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r5.f188252d
            r2 = 0
            r3 = 2
            android.database.Cursor r1 = r1.rawQuery(r0, r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getAllUnsentCommentsByFeedId "
            r3.append(r4)
            r3.append(r6)
            r6 = 32
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            java.lang.String r7 = "Finder.FinderActionStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            boolean r7 = r1.moveToFirst()     // Catch:{ all -> 0x0063 }
            if (r7 == 0) goto L_0x005d
        L_0x004c:
            up1.w0 r7 = new up1.w0     // Catch:{ all -> 0x0063 }
            r7.<init>()     // Catch:{ all -> 0x0063 }
            r7.convertFrom(r1)     // Catch:{ all -> 0x0063 }
            r6.add(r7)     // Catch:{ all -> 0x0063 }
            boolean r7 = r1.moveToNext()     // Catch:{ all -> 0x0063 }
            if (r7 != 0) goto L_0x004c
        L_0x005d:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0063 }
            cy3.C58003b.m67160a(r1, r2)
            return r6
        L_0x0063:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r7 = move-exception
            cy3.C58003b.m67160a(r1, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C65412c.mo89495jo(long):java.util.List");
    }

    /* renamed from: qq */
    public final boolean mo89496qq(long j) {
        ISQLiteDatabase iSQLiteDatabase = this.f188252d;
        boolean z = true;
        if (iSQLiteDatabase.delete("FinderAction", "localCommentId=?", new String[]{"" + j}) <= 0) {
            z = false;
        }
        Log.m105924i("Finder.FinderActionStorage", "removeUnsentComment " + j + " ret:" + z);
        return z;
    }
}
