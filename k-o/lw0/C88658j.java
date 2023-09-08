package lw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: lw0.j */
public class C88658j extends C88660m {
    /* renamed from: b */
    public boolean mo123099b(byte[] bArr) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105920e("MicroMsg.exdevice.IBeaconTLVSectionA", "valueByte is null or nil");
            return false;
        }
        int i = this.f255977a;
        if (2 != i) {
            Log.m105919d("MicroMsg.exdevice.IBeaconTLVSectionA", "IBEACON_TLV_SECTION_A_LENGTH != mLength(%d)", Integer.valueOf(i));
            return false;
        }
        byte b = bArr[0];
        return true;
    }
}
