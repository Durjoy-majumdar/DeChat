package lw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d81.C86218a;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: lw0.k */
public class C88659k extends C88660m {

    /* renamed from: g */
    public static final byte[] f255972g = {76, 0, 2, 21};

    /* renamed from: c */
    public byte[] f255973c = null;

    /* renamed from: d */
    public short f255974d = -1;

    /* renamed from: e */
    public short f255975e = -1;

    /* renamed from: f */
    public int f255976f = 0;

    /* renamed from: b */
    public boolean mo123099b(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.exdevice.IBeaconTLVSectionB", "valueByte is null or nil");
            return false;
        }
        int i = this.f255977a;
        if (26 != i) {
            Log.m105919d("MicroMsg.exdevice.IBeaconTLVSectionB", "IBEACON_TLV_SECTION_B_LENGTH != mLength(%d) ", Integer.valueOf(i));
            return false;
        }
        C86218a aVar = new C86218a(bArr.length);
        aVar.mo120653d(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[4];
        aVar.mo120651b(bArr2, 0, 4);
        if (!Arrays.equals(bArr2, f255972g)) {
            Log.m105918d("MicroMsg.exdevice.IBeaconTLVSectionB", "Cannot find ibeacon cookies!!!");
            return false;
        }
        byte[] bArr3 = new byte[16];
        this.f255973c = bArr3;
        aVar.mo120651b(bArr3, 0, 16);
        try {
            this.f255974d = aVar.mo120652c();
            this.f255975e = aVar.mo120652c();
            byte[] bArr4 = new byte[1];
            aVar.mo120651b(bArr4, 0, 1);
            this.f255976f = bArr4[0];
            return true;
        } catch (IOException e) {
            Log.m105918d("MicroMsg.exdevice.IBeaconTLVSectionB", "Read major/minor from autobuffer failed!!!");
            Log.printErrStackTrace("MicroMsg.exdevice.IBeaconTLVSectionB", e, "", new Object[0]);
            return false;
        }
    }
}
