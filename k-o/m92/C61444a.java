package m92;

import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import gy3.C87412m;

/* renamed from: m92.a */
public final class C61444a extends MvvmStorage<MultiTaskInfo> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61444a(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        cy3.C58003b.m67160a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        throw r1;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo mo86416c3(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "id"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r0 = r4.getDbProvider()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.getDB()
            r1 = 0
            if (r0 == 0) goto L_0x003d
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r5
            java.lang.String r5 = "SELECT * FROM MultiTaskInfo WHERE id = ?;"
            android.database.Cursor r5 = r0.rawQuery(r5, r2)
            if (r5 == 0) goto L_0x003d
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0030
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r0 = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo     // Catch:{ all -> 0x0036 }
            r0.<init>()     // Catch:{ all -> 0x0036 }
            r0.convertFrom(r5)     // Catch:{ all -> 0x0036 }
            cy3.C58003b.m67160a(r5, r1)
            return r0
        L_0x0030:
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0036 }
            cy3.C58003b.m67160a(r5, r1)
            goto L_0x003d
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m92.C61444a.mo86416c3(java.lang.String):com.tencent.mm.plugin.multitask.model.MultiTaskInfo");
    }

    public StorageObserverOwner<MultiTaskInfo> createObserverOwner() {
        return new StorageObserverOwner<>();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        cy3.C58003b.m67160a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        throw r2;
     */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo> mo86418d3() {
        /*
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tencent.mm.sdk.storage.mvvm.IMvvmDBProvider r1 = r4.getDbProvider()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.getDB()
            if (r1 == 0) goto L_0x0037
            java.lang.String r2 = "SELECT * FROM MultiTaskInfo ORDER BY createTime DESC;"
            r3 = 0
            android.database.Cursor r1 = r1.rawQuery(r2, r3)
            if (r1 == 0) goto L_0x0037
        L_0x0018:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002a
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r2 = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo     // Catch:{ all -> 0x0030 }
            r2.<init>()     // Catch:{ all -> 0x0030 }
            r2.convertFrom(r1)     // Catch:{ all -> 0x0030 }
            r0.add(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0018
        L_0x002a:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0030 }
            cy3.C58003b.m67160a(r1, r3)
            goto L_0x0037
        L_0x0030:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r2 = move-exception
            cy3.C58003b.m67160a(r1, r0)
            throw r2
        L_0x0037:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m92.C61444a.mo86418d3():java.util.List");
    }
}
