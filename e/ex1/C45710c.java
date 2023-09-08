package ex1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import eb0.C31543z5;
import gy3.C87412m;
import p749xh.C53332d4;

/* renamed from: ex1.c */
public final class C45710c extends MAutoStorage<C45709b> {

    /* renamed from: e */
    public static final String[] f123539e = {MAutoStorage.getCreateSQLs(C45709b.f123538W, "GameChatRoomContact")};

    /* renamed from: d */
    public final ISQLiteDatabase f123540d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45710c(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C45709b.f123538W, "GameChatRoomContact", C53332d4.f149162z);
        C87412m.m108594g(iSQLiteDatabase, "storage");
        this.f123540d = iSQLiteDatabase;
    }

    /* renamed from: Lo */
    public final boolean mo71198Lo(C45709b bVar) {
        int i;
        C87412m.m108594g(bVar, "contact");
        if (bVar.field_userName == null) {
            return false;
        }
        bVar.field_updateTime = C31543z5.m39453c();
        String str = bVar.field_userName;
        C87412m.m108593f(str, "contact.userName");
        if (mo71199jo(str) == null) {
            i = (int) this.f123540d.insert("GameChatRoomContact", "userName", bVar.convertTo());
            Log.m105924i("GameChatRoom.GameChatRoomContactStorage", "insertContact[" + i + "] " + bVar.mo71197l2());
            if (i > 0) {
                doNotify(MStorageEventData.EventType.SINGLE, 2, bVar.field_userName);
            }
        } else {
            i = this.f123540d.update("GameChatRoomContact", bVar.convertTo(), "userName=?", new String[]{bVar.field_userName});
            Log.m105924i("GameChatRoom.GameChatRoomContactStorage", "updateContact[" + i + "] " + bVar.mo71197l2());
            if (i > 0) {
                doNotify(MStorageEventData.EventType.SINGLE, 3, bVar.field_userName);
            }
        }
        return i > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[Catch:{ all -> 0x002d, all -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b A[Catch:{ all -> 0x002d, all -> 0x0043 }] */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ax1.C39641d mo71199jo(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "userName"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SELECT * FROM GameChatRoomContact WHERE userName = "
            r0.append(r1)
            java.lang.String r5 = zh3.C91753f.m115264e(r5)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r4.f123540d
            r1 = 0
            r2 = 2
            android.database.Cursor r5 = r0.rawQuery(r5, r1, r2)
            r0 = 1
            r2 = 0
            if (r5 == 0) goto L_0x002f
            boolean r3 = r5.moveToFirst()     // Catch:{ all -> 0x002d }
            if (r3 != r0) goto L_0x002f
            goto L_0x0030
        L_0x002d:
            r0 = move-exception
            goto L_0x0042
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x003b
            ex1.b r0 = new ex1.b     // Catch:{ all -> 0x002d }
            r0.<init>()     // Catch:{ all -> 0x002d }
            r0.convertFrom(r5)     // Catch:{ all -> 0x002d }
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002d }
            cy3.C58003b.m67160a(r5, r1)
            return r0
        L_0x0042:
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            cy3.C58003b.m67160a(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex1.C45710c.mo71199jo(java.lang.String):ax1.d");
    }
}
