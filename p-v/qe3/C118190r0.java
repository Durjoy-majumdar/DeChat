package qe3;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C89631w;

/* renamed from: qe3.r0 */
public class C118190r0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public byte[] f353312a = null;

    /* renamed from: b */
    public long f353313b = -1;

    public int getCmdId() {
        return 1000000190;
    }

    public int getFuncId() {
        return 268369922;
    }

    public boolean getShortSupport() {
        return false;
    }

    public byte[] toProtoBuf() {
        byte[] bArr = new byte[(this.f353312a.length + 8)];
        int nowMilliSecond = (int) (Util.nowMilliSecond() - this.f353313b);
        bArr[0] = (byte) ((nowMilliSecond >> 24) & 255);
        bArr[1] = (byte) ((nowMilliSecond >> 16) & 255);
        bArr[2] = (byte) ((nowMilliSecond >> 8) & 255);
        bArr[3] = (byte) (nowMilliSecond & 255);
        byte[] bArr2 = this.f353312a;
        bArr[4] = (byte) ((bArr2.length >> 24) & 255);
        bArr[5] = (byte) ((bArr2.length >> 16) & 255);
        bArr[6] = (byte) ((bArr2.length >> 8) & 255);
        bArr[7] = (byte) (bArr2.length & 255);
        System.arraycopy(bArr2, 0, bArr, 8, bArr2.length);
        Util.dumpHex(bArr);
        return bArr;
    }
}
