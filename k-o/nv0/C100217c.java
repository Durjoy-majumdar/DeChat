package nv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gv0.C20842c;
import java.io.IOException;
import java.util.LinkedList;
import ob0.C47355o;
import pe3.C47465a;
import pv0.C100963a0;
import pv0.C100964b0;
import te3.C101780g9;
import te3.C77926f9;

/* renamed from: nv0.c */
public class C100217c extends C20842c {

    /* renamed from: A */
    public String f293634A;

    /* renamed from: B */
    public int f293635B = 0;

    /* renamed from: C */
    public int f293636C;

    /* renamed from: D */
    public byte[] f293637D;

    /* renamed from: u */
    public C100963a0 f293638u = new C100963a0();

    /* renamed from: v */
    public C100964b0 f293639v = new C100964b0();

    /* renamed from: w */
    public C47355o f293640w = null;

    /* renamed from: x */
    public byte[] f293641x;

    /* renamed from: y */
    public int f293642y = 0;

    /* renamed from: z */
    public int f293643z = 0;

    public C100217c(String str, int i, LinkedList<C77926f9> linkedList, String str2, C47355o oVar, byte[] bArr) {
        C100963a0 a0Var = this.f293638u;
        a0Var.f295636d = str;
        a0Var.f295637e = i;
        this.f293636C = i;
        if (i == 1) {
            C101780g9 g9Var = new C101780g9();
            g9Var.f298276e = linkedList;
            g9Var.f298275d = linkedList.size();
            try {
                byte[] byteArray = g9Var.toByteArray();
                this.f293641x = byteArray;
                this.f293635B = byteArray.length;
            } catch (IOException e) {
                Log.m105920e("MicroMsg.BakSceneDataPush", "backList to buffer error");
                Log.printErrStackTrace("MicroMsg.BakSceneDataPush", e, "", new Object[0]);
            }
        } else {
            this.f293634A = str2;
            this.f293635B = (int) C86013q1.m106451l(str2);
        }
        int i2 = this.f293635B;
        C100963a0 a0Var2 = this.f293638u;
        a0Var2.f295638f = i2 + (16 - (i2 % 16));
        Log.m105925i("MicroMsg.BakSceneDataPush", "BakSceneDataPush init:%s  type:%d, localTotalLen:%d, reqDataSize:%d", a0Var2.f295636d, Integer.valueOf(a0Var2.f295637e), Integer.valueOf(this.f293635B), Integer.valueOf(this.f293638u.f295638f));
        this.f293640w = oVar;
        this.f293637D = bArr;
    }

    public int getType() {
        return 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b7  */
    /* renamed from: o1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32547o1() {
        /*
            r11 = this;
            java.lang.Class<z51.g> r0 = z51.C39315g.class
            int r1 = r11.f293636C
            r2 = 1
            r3 = 3
            r4 = 0
            r5 = 2
            java.lang.String r6 = "MicroMsg.BakSceneDataPush"
            if (r1 != r2) goto L_0x0012
            int r0 = r11.f293635B
            byte[] r1 = r11.f293641x
            goto L_0x00cf
        L_0x0012:
            int r1 = r11.f293635B
            int r7 = r11.f293643z
            int r1 = r1 - r7
            long r7 = (long) r1
            r9 = 524288(0x80000, double:2.590327E-318)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0020
            r7 = r9
        L_0x0020:
            int r1 = (int) r7
            r7 = 0
            r8 = 3
        L_0x0023:
            int r9 = r8 + -1
            if (r8 <= 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
            java.lang.String r7 = r11.f293634A
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x00aa
            java.lang.String r7 = r11.f293634A
            eb0.c r8 = eb0.C97625j3.m125812b()
            r8.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            f40.C86709a0.m107528h()
            f40.o r10 = f40.C86709a0.m107535s()
            java.lang.String r10 = r10.f251806d
            r8.append(r10)
            java.lang.String r10 = "emoji/"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            boolean r7 = r7.startsWith(r8)
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r11.f293634A
            java.lang.String r8 = "/"
            int r8 = r7.lastIndexOf(r8)
            int r8 = r8 + r2
            java.lang.String r7 = r7.substring(r8)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r4] = r7
            java.lang.String r10 = "md5:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r8)
            di3.d r8 = di3.C86312j.m106911c(r0)
            z51.g r8 = (z51.C39315g) r8
            zc3.a r8 = r8.mo58035cm()
            i61.h r8 = (i61.C98602h) r8
            com.tencent.mm.storage.emotion.EmojiInfo r7 = r8.mo137999G(r7)
            if (r7 == 0) goto L_0x00a1
            int r8 = r7.field_reserved4
            r8 = r8 & r2
            if (r8 != r2) goto L_0x00a1
            di3.d r8 = di3.C86312j.m106911c(r0)
            z51.g r8 = (z51.C39315g) r8
            zc3.a r8 = r8.mo58035cm()
            i61.h r8 = (i61.C98602h) r8
            byte[] r7 = r8.mo138036u(r7)
            byte[] r8 = new byte[r1]
            int r10 = r11.f293643z
            java.lang.System.arraycopy(r7, r10, r8, r4, r1)
            r7 = r8
            goto L_0x00b2
        L_0x00a1:
            java.lang.String r7 = r11.f293634A
            int r8 = r11.f293643z
            byte[] r7 = com.tencent.p014mm.vfs.C86013q1.m106433O(r7, r8, r1)
            goto L_0x00b2
        L_0x00aa:
            java.lang.String r7 = r11.f293634A
            int r8 = r11.f293643z
            byte[] r7 = com.tencent.p014mm.vfs.C86013q1.m106433O(r7, r8, r1)
        L_0x00b2:
            r8 = r9
            goto L_0x0023
        L_0x00b5:
            if (r7 != 0) goto L_0x00cd
            java.lang.Object[] r0 = new java.lang.Object[r5]
            int r8 = r11.f293643z
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0[r2] = r8
            java.lang.String r8 = "read file error, offset%d, len:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r0)
        L_0x00cd:
            r0 = r1
            r1 = r7
        L_0x00cf:
            int r7 = r11.f293643z
            r11.f293642y = r7
            int r7 = r7 + r0
            r11.f293643z = r7
            byte[] r0 = r11.f293637D
            if (r0 == 0) goto L_0x00e5
            int r8 = r11.f293635B
            if (r7 != r8) goto L_0x00e0
            r7 = 1
            goto L_0x00e1
        L_0x00e0:
            r7 = 0
        L_0x00e1:
            byte[] r1 = com.tencent.p014mm.jniinterface.AesEcb.aesCryptEcb(r1, r0, r2, r7)
        L_0x00e5:
            pv0.a0 r0 = r11.f293638u
            int r7 = r11.f293642y
            r0.f295639g = r7
            if (r1 != 0) goto L_0x00ef
            r8 = 0
            goto L_0x00f0
        L_0x00ef:
            int r8 = r1.length
        L_0x00f0:
            int r7 = r7 + r8
            r0.f295640h = r7
            pe3.b r7 = new pe3.b
            r7.<init>(r1)
            r0.f295642j = r7
            pv0.a0 r0 = r11.f293638u
            r1 = 0
            r0.f295643n = r1
            r1 = 5
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.f295636d
            r1[r4] = r0
            int r0 = r11.f293635B
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r2] = r0
            int r0 = r11.f293642y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            int r0 = r11.f293643z
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r3] = r0
            r0 = 4
            pv0.a0 r2 = r11.f293638u
            int r2 = r2.f295640h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r0] = r2
            java.lang.String r0 = "doSecne %s---total:%d, start:%d, offset:%d, data.len:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r1)
            boolean r0 = super.mo32547o1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nv0.C100217c.mo32547o1():boolean");
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f293638u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f293639v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        C100964b0 b0Var = this.f293639v;
        Log.m105925i("MicroMsg.BakSceneDataPush", "onSceneEnd id:%s, type:%d, s:%d, e:%d, status:%d", b0Var.f295644d, Integer.valueOf(b0Var.f295645e), Integer.valueOf(this.f293639v.f295646f), Integer.valueOf(this.f293639v.f295647g), Integer.valueOf(this.f293639v.f295648h));
        int i2 = this.f293639v.f295648h;
        if (i2 != 0) {
            Log.m105921e("MicroMsg.BakSceneDataPush", "status:%d", Integer.valueOf(i2));
            mo32546m1(4, this.f293639v.f295648h, "error");
            return;
        }
        C47355o oVar = this.f293640w;
        C100963a0 a0Var = this.f293638u;
        oVar.mo26221m(a0Var.f295640h - a0Var.f295639g, this.f293635B, this);
        int i3 = this.f293643z;
        int i4 = this.f293635B;
        if (i3 == i4) {
            Log.m105925i("MicroMsg.BakSceneDataPush", "back complete: %s,  %d", this.f293638u.f295636d, Integer.valueOf(i4));
            mo32546m1(0, 0, "success");
            return;
        }
        mo32547o1();
    }
}
