package qe3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Arrays;
import java.util.Locale;
import p823sg.C90193h;
import qe3.C89631w;

/* renamed from: qe3.y0 */
public class C89637y0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public byte[] f257858a = new byte[0];

    /* renamed from: b */
    public int f257859b;

    /* renamed from: c */
    public int f257860c;

    /* renamed from: d */
    public int f257861d = 0;

    /* renamed from: e */
    public byte[] f257862e;

    /* renamed from: f */
    public byte[] f257863f;

    /* renamed from: g */
    public int f257864g;

    /* renamed from: h */
    public byte[] f257865h;

    public int getCmdId() {
        return 205;
    }

    public int getFuncId() {
        return 0;
    }

    public boolean getShortSupport() {
        return false;
    }

    public boolean isRawData() {
        return true;
    }

    public void setUin(int i) {
        this.f257861d = i;
    }

    public byte[] toProtoBuf() {
        int i;
        byte[] bArr;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(this.f257861d);
        byte[] bArr2 = this.f257858a;
        objArr[1] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
        objArr[2] = Util.getStack();
        Log.m105919d("MicroMsg.MMSyncCheck", "toProtoBuf dksynccheck uin:%d keybuf:%d, stack[%s]", objArr);
        if (this.f257861d == 0 || Util.isNullOrNil(this.f257858a)) {
            return new byte[0];
        }
        int i2 = this.f257861d;
        byte[] bArr3 = this.f257858a;
        int length = (((i2 >> 13) & 524287) | (bArr3.length << 19)) ^ 1442968193;
        int length2 = ((524287 & (bArr3.length >> 13)) | (i2 << 19)) ^ 1442968193;
        byte[] bArr4 = new byte[(bArr3.length + 32)];
        byte[] bArr5 = this.f257863f;
        if (bArr5 == null || bArr5.length != 32) {
            i = 0;
        } else {
            int i3 = this.f257864g;
            i = i3 + 36;
            bArr4 = new byte[(bArr3.length + 32 + 32 + 4 + i3)];
        }
        Log.m105919d("MicroMsg.MMSyncCheck", "dksynccheck uin=[%d/%d], keyBufLen=[%d/%d] outBuf=[%d]", Integer.valueOf(i2), Integer.valueOf(length), Integer.valueOf(this.f257858a.length), Integer.valueOf(length2), Integer.valueOf(bArr4.length));
        bArr4[0] = (byte) ((length >> 24) & 255);
        bArr4[1] = (byte) ((length >> 16) & 255);
        bArr4[2] = (byte) ((length >> 8) & 255);
        bArr4[3] = (byte) (length & 255);
        bArr4[4] = (byte) ((length2 >> 24) & 255);
        bArr4[5] = (byte) ((length2 >> 16) & 255);
        bArr4[6] = (byte) ((length2 >> 8) & 255);
        bArr4[7] = (byte) (length2 & 255);
        byte[] bArr6 = this.f257858a;
        System.arraycopy(bArr6, 0, bArr4, 8, bArr6.length);
        int i4 = C89625d.f257841g;
        bArr4[(bArr4.length - 24) - i] = (byte) ((i4 >> 24) & 255);
        bArr4[(bArr4.length - 23) - i] = (byte) ((i4 >> 16) & 255);
        bArr4[(bArr4.length - 22) - i] = (byte) ((i4 >> 8) & 255);
        bArr4[(bArr4.length - 21) - i] = (byte) (i4 & 255);
        String locale = Locale.getDefault().toString();
        if (locale.length() > 8) {
            locale = locale.substring(0, 8);
        }
        byte[] bytes = locale.getBytes();
        System.arraycopy(bytes, 0, bArr4, (bArr4.length - 20) - i, bytes.length);
        Log.m105918d("MicroMsg.MMSyncCheck", "language:%x" + Arrays.toString(bytes));
        bArr4[(bArr4.length + -12) - i] = 0;
        bArr4[(bArr4.length + -11) - i] = 0;
        bArr4[(bArr4.length + -10) - i] = 0;
        bArr4[(bArr4.length - 9) - i] = 2;
        int i5 = this.f257859b;
        bArr4[(bArr4.length - 8) - i] = (byte) ((i5 >> 24) & 255);
        bArr4[(bArr4.length - 7) - i] = (byte) ((i5 >> 16) & 255);
        bArr4[(bArr4.length - 6) - i] = (byte) ((i5 >> 8) & 255);
        bArr4[(bArr4.length - 5) - i] = (byte) (i5 & 255);
        int i6 = this.f257860c;
        bArr4[(bArr4.length - 4) - i] = (byte) ((i6 >> 24) & 255);
        bArr4[(bArr4.length - 3) - i] = (byte) ((i6 >> 16) & 255);
        bArr4[(bArr4.length - 2) - i] = (byte) ((i6 >> 8) & 255);
        bArr4[(bArr4.length - 1) - i] = (byte) (i6 & 255);
        byte[] bArr7 = this.f257863f;
        if (bArr7 != null && bArr7.length == 32) {
            Log.m105924i("MicroMsg.MMSyncCheck", "copy networkid " + this.f257863f.length + " " + this.f257864g);
            byte[] bArr8 = this.f257863f;
            System.arraycopy(bArr8, 0, bArr4, this.f257858a.length + 32, bArr8.length);
            int length3 = bArr4.length;
            int i7 = this.f257864g;
            bArr4[(length3 - i7) - 4] = (byte) ((i7 >> 24) & 255);
            bArr4[(bArr4.length - i7) - 3] = (byte) ((i7 >> 16) & 255);
            bArr4[(bArr4.length - i7) - 2] = (byte) ((i7 >> 8) & 255);
            bArr4[(bArr4.length - i7) - 1] = (byte) (i7 & 255);
            if (i7 > 0 && (bArr = this.f257865h) != null && bArr.length == i7) {
                System.arraycopy(bArr, 0, bArr4, this.f257858a.length + 32 + this.f257863f.length + 4, bArr.length);
            }
        }
        Log.m105918d("MicroMsg.MMSyncCheck", "outbuf:%x" + Arrays.toString(bArr4) + " " + bArr4.length);
        this.f257862e = C90193h.m112879g(bArr4);
        return bArr4;
    }
}
