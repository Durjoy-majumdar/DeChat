package cz1;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import p205ms.C11083d;
import p749xh.C53338i4;
import wy1.C53224d;

/* renamed from: cz1.i */
public final class C45230i extends MAutoStorage<C7143c> implements C11083d {

    /* renamed from: e */
    public static final String[] f122569e = {MAutoStorage.getCreateSQLs(C7143c.f25114I, "GameLifeConversation")};

    /* renamed from: d */
    public final ISQLiteDatabase f122570d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45230i(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C7143c.f25114I, "GameLifeConversation", C53338i4.f149438r);
        C87412m.m108594g(iSQLiteDatabase, "db");
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C7143c.f25114I;
        this.f122570d = iSQLiteDatabase;
        add(((C53224d) C86312j.m106911c(C53224d.class)).f148484p);
    }

    /* renamed from: K */
    public final boolean mo70733K(String str) {
        boolean z;
        C87412m.m108594g(str, "sessionId");
        if (C72996z1.m85832c5(str)) {
            z = true;
        } else {
            Log.m105924i("GameLife.PluginGameLife", "check sessionId failed");
            z = false;
        }
        if (!z) {
            return false;
        }
        C7143c jo = mo70735jo(str);
        int i = jo.field_unReadCount;
        jo.field_unReadCount = 0;
        jo.field_digestFlag = 0;
        jo.field_digestPrefix = null;
        boolean update = update(jo.systemRowid, jo, false);
        doNotify(MStorageEventData.EventType.SINGLE, 4, jo);
        Log.m105924i("GameLife.ConversationStorage", "[clearUnreadCount] ret=" + update + ' ' + i + " => " + jo.field_unReadCount + " sessionId=" + str);
        return update;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
        cy3.C58003b.m67160a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        throw r6;
     */
    /* renamed from: Xs */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<cz1.C7143c> mo70734Xs(int r5, int r6) {
        /*
            r4 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "select *, rowid from GameLifeConversation ORDER BY updateTime DESC limit "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " offset "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r4.f122570d
            r3 = 0
            android.database.Cursor r1 = r2.rawQuery(r1, r3)
            boolean r2 = r1.moveToFirst()     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x0040
        L_0x002b:
            boolean r2 = r1.isAfterLast()     // Catch:{ all -> 0x0070 }
            if (r2 != 0) goto L_0x0040
            cz1.c r2 = new cz1.c     // Catch:{ all -> 0x0070 }
            r2.<init>()     // Catch:{ all -> 0x0070 }
            r2.convertFrom(r1)     // Catch:{ all -> 0x0070 }
            r0.add(r2)     // Catch:{ all -> 0x0070 }
            r1.moveToNext()     // Catch:{ all -> 0x0070 }
            goto L_0x002b
        L_0x0040:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0070 }
            cy3.C58003b.m67160a(r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[query] offset="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " pageCount="
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = " list size="
            r1.append(r5)
            int r5 = r0.size()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r6 = "GameLife.ConversationStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            return r0
        L_0x0070:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r6 = move-exception
            cy3.C58003b.m67160a(r1, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: cz1.C45230i.mo70734Xs(int, int):java.util.List");
    }

    /* renamed from: jo */
    public final C7143c mo70735jo(String str) {
        C87412m.m108594g(str, "sessionId");
        Cursor rawQuery = this.f122570d.rawQuery("select *, rowid from GameLifeConversation where sessionId = '" + str + "' ", (String[]) null);
        C7143c cVar = new C7143c();
        cVar.field_sessionId = str;
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                cVar.convertFrom(rawQuery);
            }
            rawQuery.close();
        }
        return cVar;
    }

    public boolean replace(IAutoDBItem iAutoDBItem) {
        C7143c cVar = (C7143c) iAutoDBItem;
        StringBuilder sb = new StringBuilder();
        sb.append("[replace] ");
        sb.append(cVar != null ? C45231j.m50035a(cVar) : null);
        Log.m105924i("GameLife.ConversationStorage", sb.toString());
        return super.replace(cVar);
    }
}
