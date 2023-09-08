package hg0;

import com.tencent.p014mm.sdk.storage.MStorage;
import zh3.C91753f;

/* renamed from: hg0.s */
public class C76185s extends MStorage {

    /* renamed from: e */
    public static final String[] f223220e = {"CREATE TABLE IF NOT EXISTS friend_ext ( username text  PRIMARY KEY , sex int  , personalcard int  , province text  , city text  , signature text  , reserved1 text  , reserved2 text  , reserved3 text  , reserved4 text  , reserved5 int  , reserved6 int  , reserved7 int  , reserved8 int  ) "};

    /* renamed from: d */
    public C91753f f223221d;

    public C76185s(C91753f fVar) {
        this.f223221d = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0072, code lost:
        if (((int) r6.f223221d.mo125627q("friend_ext", "username", r7.mo106445a(), false)) != -1) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        if ((r7.size() > 0 ? r6.f223221d.update("friend_ext", r7, "username=?", new java.lang.String[]{"username"}) : 0) > 0) goto L_0x0076;
     */
    /* renamed from: jo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo106452jo(hg0.C76184r r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f223213a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0007
            r0 = r1
        L_0x0007:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "select friend_ext.username,friend_ext.sex,friend_ext.personalcard,friend_ext.province,friend_ext.city,friend_ext.signature from friend_ext   where friend_ext.username = \""
            r2.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.escapeSqlValue(r0)
            r2.append(r0)
            java.lang.String r0 = "\""
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            zh3.f r1 = r6.f223221d
            r2 = 0
            r3 = 2
            android.database.Cursor r0 = r1.rawQuery(r0, r2, r3)
            boolean r1 = r0.moveToFirst()
            r0.close()
            r0 = 1
            java.lang.String r2 = "username"
            java.lang.String r3 = "friend_ext"
            r4 = 0
            if (r1 == 0) goto L_0x0064
            android.content.ContentValues r7 = r7.mo106445a()
            int r1 = r7.size()
            if (r1 <= 0) goto L_0x0060
            zh3.f r1 = r6.f223221d
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.lang.String r5 = "username=?"
            int r7 = r1.update(r3, r7, r5, r2)
            goto L_0x0061
        L_0x0060:
            r7 = 0
        L_0x0061:
            if (r7 <= 0) goto L_0x0075
            goto L_0x0076
        L_0x0064:
            r1 = -1
            r7.f223219g = r1
            android.content.ContentValues r7 = r7.mo106445a()
            zh3.f r5 = r6.f223221d
            long r2 = r5.mo125627q(r3, r2, r7, r4)
            int r7 = (int) r2
            if (r7 == r1) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            r6.doNotify()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.C76185s.mo106452jo(hg0.r):boolean");
    }
}
