package lh0;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import sf0.C90189z;
import zt3.C119157j;

/* renamed from: lh0.a */
public abstract class C34256a<T extends IAutoDBItem> extends MAutoStorage {

    /* renamed from: d */
    public C90189z.C90190a f92355d;

    /* renamed from: lh0.a$a */
    public class C34257a implements Runnable {
        public C34257a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: android.database.Cursor} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: android.database.Cursor} */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d8, code lost:
            r13 = 0;
         */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                lh0.a r2 = lh0.C34256a.this
                int r3 = r2.mo59517Lo()
                if (r3 > 0) goto L_0x000c
                goto L_0x00fb
            L_0x000c:
                long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r8 = 0
                r9 = 0
                r11 = r8
                r10 = 0
            L_0x0018:
                java.lang.String r12 = "MicroMsg.AbsAutoCleanStorage"
                r0 = 1
                if (r10 >= r3) goto L_0x00d8
                int r13 = r3 + r10
                long r13 = (long) r13
                r15 = 86400000(0x5265c00, double:4.2687272E-316)
                long r13 = r13 * r15
                long r13 = r6 - r13
                int r13 = jh0.C33573a.m40127c(r13)     // Catch:{ Exception -> 0x00bd }
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bd }
                r14.<init>()     // Catch:{ Exception -> 0x00bd }
                java.lang.String r15 = "SELECT count(*) from "
                r14.append(r15)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r15 = r2.mo59519qq()     // Catch:{ Exception -> 0x00bd }
                r14.append(r15)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r15 = " WHERE "
                r14.append(r15)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r15 = r2.mo59518jo()     // Catch:{ Exception -> 0x00bd }
                r14.append(r15)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r15 = " < "
                r14.append(r15)     // Catch:{ Exception -> 0x00bd }
                r14.append(r13)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x00bd }
                sf0.z$a r15 = r2.f92355d     // Catch:{ Exception -> 0x00bd }
                android.database.Cursor r11 = r15.rawQuery(r14, r8, r9)     // Catch:{ Exception -> 0x00bd }
                if (r11 == 0) goto L_0x0067
                boolean r14 = r11.moveToFirst()     // Catch:{ Exception -> 0x00bd }
                if (r14 == 0) goto L_0x0067
                int r14 = r11.getInt(r9)     // Catch:{ Exception -> 0x00bd }
                goto L_0x0068
            L_0x0067:
                r14 = 0
            L_0x0068:
                if (r11 == 0) goto L_0x006e
                r11.close()     // Catch:{ Exception -> 0x00bd }
                r11 = r8
            L_0x006e:
                if (r14 > 0) goto L_0x0076
                if (r11 == 0) goto L_0x00d8
                r11.close()
                goto L_0x00d8
            L_0x0076:
                if (r14 <= 0) goto L_0x00b8
                r15 = 5000(0x1388, float:7.006E-42)
                if (r14 > r15) goto L_0x00b8
                sf0.z$a r14 = r2.f92355d     // Catch:{ Exception -> 0x00bd }
                java.lang.String r15 = r2.getTableName()     // Catch:{ Exception -> 0x00bd }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bd }
                r8.<init>()     // Catch:{ Exception -> 0x00bd }
                java.lang.String r9 = r2.mo59518jo()     // Catch:{ Exception -> 0x00bd }
                r8.append(r9)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r9 = " < ?"
                r8.append(r9)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00bd }
                java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00bd }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bd }
                r0.<init>()     // Catch:{ Exception -> 0x00bd }
                r0.append(r13)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r13 = ""
                r0.append(r13)     // Catch:{ Exception -> 0x00bd }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00bd }
                r13 = 0
                r9[r13] = r0     // Catch:{ Exception -> 0x00bd }
                int r0 = r14.delete(r15, r8, r9)     // Catch:{ Exception -> 0x00bd }
                if (r11 == 0) goto L_0x00b6
                r11.close()
            L_0x00b6:
                r13 = r0
                goto L_0x00d9
            L_0x00b8:
                if (r11 == 0) goto L_0x00cc
                goto L_0x00c9
            L_0x00bb:
                r0 = move-exception
                goto L_0x00d2
            L_0x00bd:
                r0 = move-exception
                java.lang.String r8 = "try to delete history error"
                r9 = 0
                java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ all -> 0x00bb }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r8, r13)     // Catch:{ all -> 0x00bb }
                if (r11 == 0) goto L_0x00cc
            L_0x00c9:
                r11.close()
            L_0x00cc:
                int r10 = r10 + 1
                r8 = 0
                r9 = 0
                goto L_0x0018
            L_0x00d2:
                if (r11 == 0) goto L_0x00d7
                r11.close()
            L_0x00d7:
                throw r0
            L_0x00d8:
                r13 = 0
            L_0x00d9:
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                r3 = 0
                r0[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
                r3 = 1
                r0[r3] = r2
                r2 = 2
                long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0[r2] = r3
                java.lang.String r2 = "try to delete history deleteCount [%d] cycle time[%d] cost[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r0)
            L_0x00fb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lh0.C34256a.C34257a.run():void");
        }
    }

    public C34256a(C90189z.C90190a aVar, IAutoDBItem.MAutoDBInfo mAutoDBInfo, String str, String[] strArr) {
        super(aVar, mAutoDBInfo, str, strArr);
        this.f92355d = aVar;
        ((C119157j) C119157j.f356862d).mo183876g(new C34257a(), "CLEAN_DB");
    }

    /* renamed from: Lo */
    public abstract int mo59517Lo();

    /* renamed from: jo */
    public abstract String mo59518jo();

    /* renamed from: qq */
    public abstract String mo59519qq();
}
