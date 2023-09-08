package gv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C90194m;
import pe3.C47465a;
import pe3.C89349b;
import pv0.C22017y;
import pv0.C22018z;

/* renamed from: gv0.a */
public class C20840a extends C20842c {

    /* renamed from: u */
    public C22017y f58865u = new C22017y();

    /* renamed from: v */
    public C22018z f58866v = new C22018z();

    /* renamed from: w */
    public final int f58867w;

    /* renamed from: x */
    public final String f58868x;

    /* renamed from: y */
    public final byte[] f58869y;

    /* renamed from: z */
    public final String f58870z;

    public C20840a(String str, String str2, byte[] bArr, String str3, int i, int i2, boolean z) {
        Log.m105925i("MicroMsg.BackupAuthScene", "BackupAuthScene init, backupType[%d], stack:%s", Integer.valueOf(i2), Util.getStack());
        this.f58865u.f62310f = new C89349b(C90194m.m112882c(str.getBytes(), bArr));
        C22017y yVar = this.f58865u;
        yVar.f62308d = 0;
        yVar.f62309e = str3;
        yVar.f62311g = i;
        yVar.f62312h = z ? 1 : 0;
        this.f58868x = str2;
        this.f58870z = str3;
        this.f58869y = bArr;
        this.f58867w = i2;
    }

    /* renamed from: F1 */
    public void mo32541F1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (z) {
            this.f58865u.f62313i |= 1;
        }
        if (z2) {
            this.f58865u.f62313i |= 2;
        }
        if (z3) {
            this.f58865u.f62313i |= 4;
        }
        if (z4) {
            this.f58865u.f62313i |= 8;
        }
        if (z5) {
            this.f58865u.f62313i |= 16;
        }
    }

    public int getType() {
        return 1;
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f58865u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f58866v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        C22018z zVar = this.f58866v;
        int i2 = zVar.f62316e;
        if (i2 != 0) {
            Log.m105921e("MicroMsg.BackupAuthScene", "onSceneEnd errType[%d]", Integer.valueOf(i2));
            mo32546m1(4, this.f58866v.f62316e, "onSceneEnd status failed");
        } else if (!this.f58870z.equals(zVar.f62317f)) {
            Log.m105920e("MicroMsg.BackupAuthScene", "onSceneEnd not the same id");
            mo32546m1(4, -1, "onSceneEnd not the same id");
        } else {
            String str = new String(C90194m.m112881b(this.f58866v.f62318g.f257327a, this.f58869y));
            boolean equals = str.length() != this.f58868x.length() ? false : str.equals(this.f58868x);
            Log.m105925i("MicroMsg.BackupAuthScene", "onSceneEnd check ok result[%b]", Boolean.valueOf(equals));
            if (!equals) {
                Log.m105920e("MicroMsg.BackupAuthScene", "onSceneEnd check ok failed");
                mo32546m1(4, -3, "onSceneEnd check ok failed");
                return;
            }
            mo32546m1(0, 0, "onSceneEnd auth success");
            if (this.f58867w != 22 || this.f58866v.f62319h >= 3) {
                this.f58865u.f62310f = new C89349b(C90194m.m112882c(this.f58868x.getBytes(), this.f58869y));
                C22017y yVar = this.f58865u;
                yVar.f62308d = 1;
                yVar.f62309e = this.f58870z;
                try {
                    Log.m105924i("MicroMsg.BackupAuthScene", "directSendAuthOk");
                    C20842c.m22886w1(this.f58865u.toByteArray(), 1, i);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BackupAuthScene", e, "directSendAuthOk req to bur err.", new Object[0]);
                }
            }
        }
    }
}
