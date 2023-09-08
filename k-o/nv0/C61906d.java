package nv0;

import com.tencent.p014mm.jniinterface.AesEcb;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import gv0.C20842c;
import jv0.C99055a;
import ob0.C47355o;
import pe3.C47465a;
import pv0.C62562i0;
import pv0.C62563j0;

/* renamed from: nv0.d */
public class C61906d extends C20842c {

    /* renamed from: D */
    public static int f176002D;

    /* renamed from: A */
    public String f176003A;

    /* renamed from: B */
    public int f176004B;

    /* renamed from: C */
    public byte[] f176005C;

    /* renamed from: u */
    public C62562i0 f176006u = new C62562i0();

    /* renamed from: v */
    public C62563j0 f176007v = new C62563j0();

    /* renamed from: w */
    public C47355o f176008w = null;

    /* renamed from: x */
    public String f176009x;

    /* renamed from: y */
    public int f176010y = 0;

    /* renamed from: z */
    public int f176011z = 0;

    public C61906d(String str, String str2, int i, int i2, C47355o oVar, byte[] bArr) {
        if (i == 1) {
            this.f176003A = str + "backupItem/" + C99055a.m129004c(str2);
        } else {
            this.f176003A = str + "backupMeida/" + C99055a.m129004c(str2);
        }
        this.f176009x = str2;
        C62562i0 i0Var = this.f176006u;
        i0Var.f177693d = str2;
        i0Var.f177694e = i;
        this.f176004B = i2;
        Log.m105925i("MicroMsg.BakSceneRestoreData", "BakSceneRestoreData init, %s, type:%d, totalLen:%d", str2, Integer.valueOf(i), Integer.valueOf(this.f176004B));
        this.f176008w = oVar;
        this.f176005C = bArr;
    }

    public int getType() {
        return 7;
    }

    /* renamed from: o1 */
    public boolean mo32547o1() {
        Log.m105924i("MicroMsg.BakSceneRestoreData", "doSecne");
        int i = this.f176004B;
        C62562i0 i0Var = this.f176006u;
        if (i0Var.f177694e == 2) {
            int i2 = this.f176011z;
            long j = 524288;
            if (((long) (i - i2)) <= 524288) {
                j = (long) (i - i2);
            }
            i = (int) j;
        }
        int i3 = this.f176011z;
        this.f176010y = i3;
        int i4 = i + i3;
        this.f176011z = i4;
        i0Var.f177695f = i3;
        i0Var.f177696g = i4;
        i0Var.f177697h = f176002D;
        return super.mo32547o1();
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f176006u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f176007v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        C62563j0 j0Var = this.f176007v;
        Log.m105925i("MicroMsg.BakSceneRestoreData", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", j0Var.f177698d, Integer.valueOf(j0Var.f177699e), Integer.valueOf(this.f176007v.f177700f), Integer.valueOf(this.f176007v.f177701g), Integer.valueOf(this.f176007v.f177702h));
        C62563j0 j0Var2 = this.f176007v;
        int i2 = j0Var2.f177702h;
        if (i2 == 0 || i2 == 10) {
            int i3 = j0Var2.f177700f;
            int i4 = this.f176010y;
            if (i3 == i4 && j0Var2.f177701g == this.f176011z) {
                C47355o oVar = this.f176008w;
                C62562i0 i0Var = this.f176006u;
                oVar.mo26221m(i0Var.f177696g - i0Var.f177695f, this.f176004B, this);
                byte[] bArr = this.f176007v.f177704j.f257327a;
                byte[] bArr2 = this.f176005C;
                if (bArr2 != null) {
                    bArr = AesEcb.aesCryptEcb(bArr, bArr2, false, this.f176011z == this.f176004B);
                }
                String str = this.f176003A;
                String str2 = this.f176009x;
                C86009m1 m1Var = new C86009m1(str + str2);
                long j = 0;
                long r = m1Var.mo119967g() ? m1Var.mo119980r() : 0;
                C86013q1.m106440a(str + str2, bArr);
                C86009m1 m1Var2 = new C86009m1(str + str2);
                if (m1Var2.mo119967g()) {
                    j = m1Var2.mo119980r();
                }
                if (r == j) {
                    Log.m105921e("MicroMsg.BakSceneRestoreData", "append failed and try again:%s", str + str2);
                    C86013q1.m106440a(str + str2, bArr);
                }
                Log.m105925i("MicroMsg.BakSceneRestoreData", "onSceneEnd appendbuf len:%d", Integer.valueOf(bArr.length));
                int i5 = this.f176011z;
                int i6 = this.f176004B;
                if (i5 == i6) {
                    Log.m105925i("MicroMsg.BakSceneRestoreData", "recover cmoplete:%s  %d", this.f176009x, Integer.valueOf(i6));
                    mo32546m1(0, 0, "success");
                    return;
                }
                mo32547o1();
                return;
            }
            Log.m105921e("MicroMsg.BakSceneRestoreData", "err local:%d, %d;   server:%d,%d", Integer.valueOf(i4), Integer.valueOf(this.f176011z), Integer.valueOf(this.f176007v.f177700f), Integer.valueOf(this.f176007v.f177701g));
            mo32546m1(3, -1, "error");
            return;
        }
        mo32546m1(4, i2, "error");
    }
}
