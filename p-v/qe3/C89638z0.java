package qe3;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2encoder;
import java.nio.charset.Charset;
import qe3.C89631w;

/* renamed from: qe3.z0 */
public class C89638z0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public long f257866a = 7;

    /* renamed from: b */
    public byte[] f257867b;

    /* renamed from: c */
    public String f257868c = null;

    /* renamed from: d */
    public byte[] f257869d = null;

    /* renamed from: e */
    public int f257870e = 0;

    /* renamed from: f */
    public byte[] f257871f;

    /* renamed from: g */
    public byte[] f257872g;

    /* renamed from: a */
    public String mo123971a() {
        byte[] bArr = this.f257869d;
        if (bArr == null) {
            return "";
        }
        if (this.f257868c == null) {
            byte[] aesDecrypt = MMProtocalJni.aesDecrypt(this.f257867b, bArr);
            if (Util.isNullOrNil(aesDecrypt)) {
                return "";
            }
            this.f257868c = new String(aesDecrypt, Charset.forName("UTF-8"));
        }
        return this.f257868c;
    }

    public int fromProtoBuf(byte[] bArr) {
        byte[] bArr2 = bArr;
        if (bArr2 == null || bArr2.length < 12) {
            StringBuilder sb = new StringBuilder();
            sb.append("dksynccheck err resp buf:");
            sb.append(bArr2 == null ? -1 : bArr2.length);
            Log.m105920e("MicroMsg.MMSyncCheck", sb.toString());
            return -1;
        }
        long j = (long) ((bArr2[3] & ExifInterface.MARKER) | ((bArr2[2] & ExifInterface.MARKER) << 8) | ((bArr2[1] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr2[0] & ExifInterface.MARKER) << 24));
        this.f257866a = j;
        byte b = (bArr2[7] & ExifInterface.MARKER) | ((bArr2[6] & ExifInterface.MARKER) << 8) | ((bArr2[5] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr2[4] & ExifInterface.MARKER) << 24);
        int i = ((bArr2[10] & ExifInterface.MARKER) << 8) | (bArr2[11] & ExifInterface.MARKER) | ((bArr2[9] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr2[8] & ExifInterface.MARKER) << 24);
        Log.m105919d("MicroMsg.MMSyncCheck", " fromProtoBuf oreh synccheck resp selector:%d, redCode:%d, keyLen:%d, buf length:%d", Long.valueOf(j), Integer.valueOf(b), Integer.valueOf(i), Integer.valueOf(bArr2.length));
        if (b != -3002) {
            this.f257868c = "";
            int i2 = i + 12;
            if (bArr2.length > i2) {
                this.f257870e = (bArr2[i + 15] & ExifInterface.MARKER) | ((bArr2[i + 14] & ExifInterface.MARKER) << 8) | ((bArr2[i + 13] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr2[i2] & ExifInterface.MARKER) << 24);
                byte[] bArr3 = new byte[32];
                this.f257871f = bArr3;
                System.arraycopy(bArr2, i + 16, bArr3, 0, 32);
                int i3 = (bArr2[i + 51] & ExifInterface.MARKER) | ((bArr2[i + 50] & ExifInterface.MARKER) << 8) | ((bArr2[i + 49] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2) | ((bArr2[i + 48] & ExifInterface.MARKER) << 24);
                this.f257872g = new byte[0];
                if (i3 > 0) {
                    byte[] bArr4 = new byte[i3];
                    this.f257872g = bArr4;
                    System.arraycopy(bArr2, i + 52, bArr4, 0, i3);
                }
            }
            return b;
        } else if (i == bArr2.length - 12 || i == (bArr2.length - 12) - 16) {
            if (i == (bArr2.length - 12) - 16) {
                byte[] bArr5 = new byte[16];
                this.f257869d = bArr5;
                System.arraycopy(bArr2, bArr2.length - 16, bArr5, 0, 16);
            }
            byte[] bArr6 = new byte[i];
            this.f257867b = bArr6;
            System.arraycopy(bArr2, 12, bArr6, 0, i);
            return b;
        } else {
            Log.m105921e("MicroMsg.MMSyncCheck", " the key len is invalid keyLen:%d, bufLen:%d", Integer.valueOf(i), Integer.valueOf(bArr2.length));
            return -1;
        }
    }

    public int getCmdId() {
        return 1000000205;
    }

    public boolean isRawData() {
        return true;
    }
}
