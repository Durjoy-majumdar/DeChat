package dv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.LinkedList;
import pv0.C100968x;
import te3.C51163rv3;
import te3.C77926f9;
import te3.C77996sv3;

/* renamed from: dv0.k */
public class C97551k {
    /* renamed from: a */
    public static int m125702a(C97552a aVar) {
        String str;
        if (aVar == null || aVar.f286256b == null) {
            Object[] objArr = new Object[1];
            objArr[0] = aVar == null ? "backupItemInfo" : "backupItemInfo.backupitem";
            Log.m105921e("MicroMsg.BackupPackUtil", "packBackupItem %s is null!", objArr);
            return 0;
        }
        int l = (int) C86013q1.m106451l(aVar.f286255a);
        if (l <= 0) {
            Log.m105920e("MicroMsg.BackupPackUtil", "packBackupItem filePath error:" + aVar.f286255a);
            return 0;
        } else if (aVar.f286259e) {
            return l;
        } else {
            if (aVar.f286257c == null) {
                Log.m105920e("MicroMsg.BackupPackUtil", "packBackupItem error mediaInfoList null");
                return 0;
            }
            StringBuilder sb = new StringBuilder(aVar.f286256b.f227335f.f141175d);
            sb.append("_");
            sb.append(aVar.f286256b.f227336g.f141175d);
            sb.append("_");
            sb.append(aVar.f286256b.f227348v);
            sb.append("_backup");
            if (aVar.f286260f == null) {
                str = "";
            } else {
                str = "_" + aVar.f286260f;
            }
            sb.append(str);
            String sb4 = sb.toString();
            LinkedList<C51163rv3> linkedList = aVar.f286256b.f227343q;
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = sb4;
            rv32.f141176e = true;
            linkedList.add(rv32);
            LinkedList<C77996sv3> linkedList2 = aVar.f286256b.f227344r;
            C77996sv3 sv32 = new C77996sv3();
            sv32.f228225d = aVar.f286258d;
            sv32.f228226e = true;
            linkedList2.add(sv32);
            C77926f9 f9Var = aVar.f286256b;
            f9Var.f227342p = f9Var.f227343q.size();
            if (aVar.f286262h == null) {
                aVar.f286262h = new C100968x();
            }
            C100968x xVar = aVar.f286262h;
            xVar.f295679j = aVar.f286256b.f227348v;
            xVar.f295675f = sb4;
            xVar.f295676g = aVar.f286255a;
            int i = aVar.f286258d;
            xVar.f295677h = i;
            if (!aVar.f286261g) {
                aVar.f286257c.add(xVar);
            } else if (i == 1 || i == 4 || i == 11 || i == 13) {
                Log.m105925i("MicroMsg.BackupPackUtil", "backup mediaSize:%d, mediaType:%d", Integer.valueOf(l), Integer.valueOf(aVar.f286258d));
                aVar.f286257c.add(aVar.f286262h);
            }
            return 0;
        }
    }

    /* renamed from: dv0.k$a */
    public static class C97552a {

        /* renamed from: a */
        public String f286255a;

        /* renamed from: b */
        public C77926f9 f286256b;

        /* renamed from: c */
        public LinkedList<C100968x> f286257c;

        /* renamed from: d */
        public int f286258d;

        /* renamed from: e */
        public boolean f286259e;

        /* renamed from: f */
        public String f286260f;

        /* renamed from: g */
        public boolean f286261g;

        /* renamed from: h */
        public C100968x f286262h;

        public C97552a(String str, C77926f9 f9Var, LinkedList<C100968x> linkedList, int i, boolean z, boolean z2, C100968x xVar) {
            this.f286255a = str;
            this.f286256b = f9Var;
            this.f286257c = linkedList;
            this.f286258d = i;
            this.f286259e = z;
            this.f286261g = z2;
            this.f286262h = xVar;
        }

        public C97552a(String str, C77926f9 f9Var, LinkedList<C100968x> linkedList, int i, boolean z, String str2, boolean z2, C100968x xVar) {
            this.f286255a = str;
            this.f286256b = f9Var;
            this.f286257c = linkedList;
            this.f286258d = i;
            this.f286259e = z;
            this.f286260f = str2;
            this.f286261g = z2;
            this.f286262h = xVar;
        }
    }
}
