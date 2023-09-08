package com.tencent.p014mm.pluginsdk.model.app;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import o90.C100308d;
import p749xh.C53334e0;
import p763ym.C53541m;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: com.tencent.mm.pluginsdk.model.app.p */
public class C44579p extends MAutoStorage<C44561j> implements C53541m {

    /* renamed from: e */
    public static final String[] f120881e = {MAutoStorage.getCreateSQLs(C44561j.f120844x1, "AppInfo")};

    /* renamed from: d */
    public final C101611g<String, C44561j> f120882d = new C100308d(50);

    public C44579p(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C44561j.f120844x1, "AppInfo", C53334e0.f149203T0);
        C44561j jVar = new C44561j();
        jVar.field_appId = "wx4310bbd51be7d979";
        if (!super.get(jVar, new String[0])) {
            C44561j jVar2 = new C44561j();
            jVar2.field_appId = "wx4310bbd51be7d979";
            jVar2.field_appName = "weixinfile";
            jVar2.field_packageName = "com.tencent.mm.openapi";
            jVar2.field_status = -1;
            super.insert(jVar2);
        }
    }

    /* renamed from: Lo */
    public C44561j mo69371Lo(String str) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppInfoStorage", "appId is null");
            return null;
        }
        C44561j jVar = (C44561j) ((C101062d) this.f120882d).mo139556b(str);
        if (jVar == null) {
            jVar = null;
        }
        if (jVar != null && !Util.isNullOrNil(jVar.field_appId)) {
            return jVar;
        }
        C44561j jVar2 = new C44561j();
        jVar2.field_appId = str;
        if (!super.get(jVar2, new String[0])) {
            return null;
        }
        String str2 = jVar2.field_appId;
        if (str2 != null) {
            ((C101062d) this.f120882d).mo139557c(str2, jVar2);
        }
        return jVar2;
    }

    /* renamed from: Ow */
    public boolean update(C44561j jVar, String... strArr) {
        if (jVar == null || Util.isNullOrNil(jVar.field_appId)) {
            return false;
        }
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C44561j.f120844x1;
        if ("wxce6f23b478a3a2a2".equals(jVar.field_appId) || "wx6fa7e3bab7e15415".equals(jVar.field_appId)) {
            Log.m105925i("MicroMsg.AppInfoStorage", "update appinfo: %s, %s, %s, %s, %s", jVar.field_appId, jVar.field_appName, Integer.valueOf(jVar.field_serviceShowFlag), Integer.valueOf(jVar.field_appInfoFlag), Util.getStack());
        }
        String str = jVar.field_appId;
        if (!Util.isNullOrNil(str)) {
            ((C101062d) this.f120882d).remove(str);
        }
        boolean updateNotify = super.updateNotify(jVar, false, strArr);
        if (updateNotify) {
            doNotify(jVar.field_appId + "", 3, jVar.field_appId);
        }
        return updateNotify;
    }

    /* renamed from: Yt */
    public boolean insert(C44561j jVar) {
        if (jVar != null && !Util.isNullOrNil(jVar.field_appId)) {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C44561j.f120844x1;
            if ("wxce6f23b478a3a2a2".equals(jVar.field_appId) || "wx6fa7e3bab7e15415".equals(jVar.field_appId)) {
                Log.m105925i("MicroMsg.AppInfoStorage", "insert appinfo: %s, %s, %s, %s, %s", jVar.field_appId, jVar.field_appName, Integer.valueOf(jVar.field_serviceShowFlag), Integer.valueOf(jVar.field_appInfoFlag), Util.getStack());
            }
            if (super.insertNotify(jVar, false)) {
                String str = jVar.field_appId;
                doNotify(str, 2, str);
                String str2 = jVar.field_appId;
                if (str2 != null) {
                    ((C101062d) this.f120882d).mo139557c(str2, jVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: ir */
    public Cursor mo69374ir(int i, int i2) {
        StringBuilder sb = new StringBuilder(256);
        sb.append("select * from ");
        sb.append("AppInfo");
        sb.append(" where ");
        if (i != 0) {
            sb.append(" ( ");
            sb.append("serviceAppInfoFlag");
            sb.append(" & ");
            sb.append(i);
            sb.append(" ) != 0 and ");
        }
        sb.append(" ( ");
        sb.append("serviceShowFlag");
        sb.append(" & ");
        sb.append(i2);
        sb.append(" ) != 0");
        Cursor rawQuery = rawQuery(sb.toString(), new String[0]);
        if (rawQuery != null) {
            return rawQuery;
        }
        Log.m105920e("MicroMsg.AppInfoStorage", "getServiceByAppInfoFlagAndShowFlag : cursor is null");
        return null;
    }

    /* renamed from: jo */
    public boolean delete(C44561j jVar, String... strArr) {
        if (jVar == null || Util.isNullOrNil(jVar.field_appId)) {
            return false;
        }
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = C44561j.f120844x1;
        if ("wxce6f23b478a3a2a2".equals(jVar.field_appId) || "wx6fa7e3bab7e15415".equals(jVar.field_appId)) {
            Log.m105925i("MicroMsg.AppInfoStorage", "delete appinfo: %s, %s, %s, %s, %s", jVar.field_appId, jVar.field_appName, Integer.valueOf(jVar.field_serviceShowFlag), Integer.valueOf(jVar.field_appInfoFlag), Util.getStack());
        }
        String str = jVar.field_appId;
        if (!Util.isNullOrNil(str)) {
            ((C101062d) this.f120882d).remove(str);
        }
        boolean delete = super.delete(jVar, false, strArr);
        if (delete) {
            doNotify(jVar.field_appId + "", 5, jVar.field_appId);
        }
        return delete;
    }

    /* renamed from: qq */
    public String mo69376qq(C44561j jVar, String str, int i) {
        if (jVar == null) {
            Log.m105921e("MicroMsg.AppInfoStorage", "getIconUrl, appInfo does not exist, appId: %s", str);
            return null;
        } else if (!jVar.field_appId.equals(str)) {
            Log.m105921e("MicroMsg.AppInfoStorage", "getIconUrl, appInfo.appId: %s not equal appId %s", jVar.field_appId, str);
            return null;
        } else if (i == 1) {
            return jVar.field_appIconUrl;
        } else {
            if (i == 2) {
                return jVar.field_appWatermarkUrl;
            }
            if (i == 3) {
                return jVar.f149248Q;
            }
            if (i == 4) {
                return jVar.f149279x0;
            }
            if (i == 5) {
                return jVar.f149281y0;
            }
            Log.m105921e("MicroMsg.AppInfoStorage", "hasIconUrl, unknown iconType: %s", Integer.valueOf(i));
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007a  */
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo69377t2(java.lang.String r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.AppInfoStorage"
            if (r12 == 0) goto L_0x014e
            int r2 = r12.length()
            if (r2 != 0) goto L_0x000d
            goto L_0x014e
        L_0x000d:
            java.lang.String r2 = md2.C34549c.m40385a()
            com.tencent.mm.vfs.m1 r3 = new com.tencent.mm.vfs.m1
            r3.<init>((java.lang.String) r2)
            boolean r4 = r3.mo119967g()
            r5 = 1
            if (r4 != 0) goto L_0x0076
            com.tencent.mm.vfs.m1 r4 = r3.mo119974l()
            boolean r4 = r4.mo119967g()
            r6 = 0
            if (r4 != 0) goto L_0x0060
            com.tencent.mm.vfs.m1 r4 = r3.mo119974l()
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r4.mo119971i()
            r8.append(r9)
            long r9 = java.lang.System.currentTimeMillis()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>((java.lang.String) r8)
            boolean r8 = r7.mo119987x()
            if (r8 == 0) goto L_0x0052
            r7.mo119988y(r4)
            goto L_0x0060
        L_0x0052:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r3 = r4.mo119971i()
            r2[r6] = r3
            java.lang.String r3 = "mkdir error, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r3, r2)
            goto L_0x0077
        L_0x0060:
            boolean r4 = r3.mo119987x()
            if (r4 == 0) goto L_0x006c
            boolean r3 = r3.mo119977o()
            if (r3 != 0) goto L_0x0076
        L_0x006c:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r6] = r2
            java.lang.String r2 = "mkdir error. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r3)
            goto L_0x0077
        L_0x0076:
            r6 = 1
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            return r0
        L_0x007a:
            java.lang.String r2 = ".png"
            if (r13 == r5) goto L_0x012f
            r3 = 2
            if (r13 == r3) goto L_0x010b
            r3 = 3
            if (r13 == r3) goto L_0x00e7
            r3 = 4
            if (r13 == r3) goto L_0x00c3
            r3 = 5
            if (r13 == r3) goto L_0x009f
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r2 = "getIconPath, unknown iconType = "
            r12.append(r2)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return r0
        L_0x009f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = md2.C34549c.m40385a()
            r13.append(r0)
            byte[] r12 = r12.getBytes()
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
            r13.append(r12)
            java.lang.String r12 = "_sl"
            r13.append(r12)
            r13.append(r2)
            java.lang.String r12 = r13.toString()
            return r12
        L_0x00c3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = md2.C34549c.m40385a()
            r13.append(r0)
            byte[] r12 = r12.getBytes()
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
            r13.append(r12)
            java.lang.String r12 = "_sp"
            r13.append(r12)
            r13.append(r2)
            java.lang.String r12 = r13.toString()
            return r12
        L_0x00e7:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = md2.C34549c.m40385a()
            r13.append(r0)
            byte[] r12 = r12.getBytes()
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
            r13.append(r12)
            java.lang.String r12 = "_sg"
            r13.append(r12)
            r13.append(r2)
            java.lang.String r12 = r13.toString()
            return r12
        L_0x010b:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = md2.C34549c.m40385a()
            r13.append(r0)
            byte[] r12 = r12.getBytes()
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
            r13.append(r12)
            java.lang.String r12 = "_wm"
            r13.append(r12)
            r13.append(r2)
            java.lang.String r12 = r13.toString()
            return r12
        L_0x012f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = md2.C34549c.m40385a()
            r13.append(r0)
            byte[] r12 = r12.getBytes()
            java.lang.String r12 = p823sg.C90193h.m112878f(r12)
            r13.append(r12)
            r13.append(r2)
            java.lang.String r12 = r13.toString()
            return r12
        L_0x014e:
            java.lang.String r12 = "getIconPath : invalid argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C44579p.mo69377t2(java.lang.String, int):java.lang.String");
    }
}
