package lv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import i61.C98602h;
import java.util.LinkedList;
import pv0.C100968x;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C77926f9;
import te3.C77996sv3;
import z51.C39315g;

/* renamed from: lv0.l */
public class C99661l {
    /* renamed from: a */
    public static int m130077a(C99662a aVar) {
        byte[] bArr;
        if (aVar == null || aVar.f292070b == null) {
            Object[] objArr = new Object[1];
            objArr[0] = aVar == null ? "backupItemInfo" : "backupItemInfo.backupitem";
            Log.m105921e("MicroMsg.BakOldPackUtil", "packBackupItem %s is null!", objArr);
            return 0;
        }
        int l = (int) C86013q1.m106451l(aVar.f292069a);
        if (l <= 0) {
            Log.m105920e("MicroMsg.BakOldPackUtil", "packBackupItem filePath error:" + aVar.f292069a);
            return 0;
        } else if (aVar.f292073e) {
            return l;
        } else {
            if (l < 8192 && aVar.f292070b.f227345s.f140572d == 0) {
                if (aVar.f292072d != 5) {
                    bArr = C86013q1.m106433O(aVar.f292069a, 0, -1);
                } else if (aVar.f292077i == null) {
                    Log.m105920e("MicroMsg.BakOldPackUtil", "packBackupItem BACKUPITEM_EMOJI type but emojiInfo is null!");
                    bArr = null;
                } else {
                    bArr = ((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138036u(aVar.f292077i);
                }
                C51018qv3 qv32 = new C51018qv3();
                qv32.mo73350k(bArr);
                C77926f9 f9Var = aVar.f292070b;
                f9Var.f227346t = l;
                f9Var.f227347u = aVar.f292072d;
                f9Var.f227345s = qv32;
                return l;
            } else if (aVar.f292071c == null) {
                Log.m105920e("MicroMsg.BakOldPackUtil", "packBackupItem error mediaInfoList null");
                return 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.f292070b.f227335f.f141175d);
                sb.append("_");
                sb.append(aVar.f292070b.f227336g.f141175d);
                sb.append("_");
                sb.append(aVar.f292070b.f227348v);
                sb.append("_backup_");
                String str = aVar.f292074f;
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                String sb4 = sb.toString();
                LinkedList<C51163rv3> linkedList = aVar.f292070b.f227343q;
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = sb4;
                rv32.f141176e = true;
                linkedList.add(rv32);
                LinkedList<C77996sv3> linkedList2 = aVar.f292070b.f227344r;
                C77996sv3 sv32 = new C77996sv3();
                sv32.f228225d = aVar.f292072d;
                sv32.f228226e = true;
                linkedList2.add(sv32);
                C77926f9 f9Var2 = aVar.f292070b;
                f9Var2.f227342p = f9Var2.f227343q.size();
                if (aVar.f292076h == null) {
                    aVar.f292076h = new C100968x();
                }
                C100968x xVar = aVar.f292076h;
                xVar.f295679j = aVar.f292070b.f227348v;
                xVar.f295675f = sb4;
                xVar.f295676g = aVar.f292069a;
                xVar.f295677h = aVar.f292072d;
                if (!aVar.f292075g) {
                    aVar.f292071c.add(xVar);
                }
                return 0;
            }
        }
    }

    /* renamed from: lv0.l$a */
    public static class C99662a {

        /* renamed from: a */
        public String f292069a;

        /* renamed from: b */
        public C77926f9 f292070b;

        /* renamed from: c */
        public LinkedList<C100968x> f292071c;

        /* renamed from: d */
        public int f292072d;

        /* renamed from: e */
        public boolean f292073e;

        /* renamed from: f */
        public String f292074f;

        /* renamed from: g */
        public boolean f292075g;

        /* renamed from: h */
        public C100968x f292076h;

        /* renamed from: i */
        public EmojiInfo f292077i;

        public C99662a(String str, C77926f9 f9Var, LinkedList<C100968x> linkedList, int i, boolean z, boolean z2, C100968x xVar) {
            this.f292069a = str;
            this.f292070b = f9Var;
            this.f292071c = linkedList;
            this.f292072d = i;
            this.f292073e = z;
            this.f292075g = z2;
            this.f292076h = xVar;
        }

        public C99662a(String str, C77926f9 f9Var, LinkedList<C100968x> linkedList, int i, boolean z, String str2, boolean z2, C100968x xVar) {
            this.f292069a = str;
            this.f292070b = f9Var;
            this.f292071c = linkedList;
            this.f292072d = i;
            this.f292073e = z;
            this.f292074f = str2;
            this.f292075g = z2;
            this.f292076h = xVar;
        }

        public C99662a(String str, C77926f9 f9Var, LinkedList<C100968x> linkedList, int i, boolean z, boolean z2, C100968x xVar, EmojiInfo emojiInfo) {
            this.f292069a = str;
            this.f292070b = f9Var;
            this.f292071c = linkedList;
            this.f292072d = i;
            this.f292073e = z;
            this.f292075g = z2;
            this.f292076h = xVar;
            this.f292077i = emojiInfo;
        }
    }
}
