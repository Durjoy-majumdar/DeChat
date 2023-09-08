package b24;

import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import oicq.wlogin_sdk.tools.C117790util;

/* renamed from: b24.u */
public class C113115u extends C113107m0 {

    /* renamed from: f */
    public int f338501f = 0;

    public C113115u() {
        this.f338498e = JsApiSetAudioState.CTRL_INDEX;
    }

    /* renamed from: i */
    public byte[] mo165634i(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = bArr;
        byte[] bArr7 = bArr2;
        byte[] bArr8 = bArr3;
        byte[] bArr9 = bArr4;
        byte[] bArr10 = bArr5;
        int i2 = 16;
        int length = bArr6 != null ? bArr6.length > 16 ? 16 : bArr6.length : 0;
        int length2 = bArr7 != null ? bArr7.length > 16 ? 16 : bArr7.length : 0;
        int length3 = bArr8 != null ? bArr8.length > 16 ? 16 : bArr8.length : 0;
        int i3 = 32;
        if (bArr9 == null) {
            i3 = 0;
        } else if (bArr9.length <= 32) {
            i3 = bArr9.length;
        }
        if (bArr10 == null) {
            i2 = 0;
        } else if (bArr10.length <= 16) {
            i2 = bArr10.length;
        }
        int i4 = length + 2;
        int i5 = i4 + 2;
        int i6 = i5 + length2;
        int i7 = i6 + 2;
        int i8 = i7 + 2;
        int i9 = i8 + length3;
        int i15 = i9 + 2;
        int i16 = i9;
        int i17 = i15 + i3;
        int i18 = i15;
        int i19 = i17 + 2;
        int i25 = i17;
        int i26 = i19 + i2;
        this.f338501f = i26;
        byte[] bArr11 = new byte[i26];
        C117790util.m166193o(bArr11, 0, length);
        System.arraycopy(bArr6, 0, bArr11, 2, length);
        C117790util.m166193o(bArr11, i4, length2);
        System.arraycopy(bArr7, 0, bArr11, i5, length2);
        C117790util.m166193o(bArr11, i6, i);
        C117790util.m166193o(bArr11, i7, length3);
        System.arraycopy(bArr8, 0, bArr11, i8, length3);
        C117790util.m166193o(bArr11, i16, i3);
        System.arraycopy(bArr4, 0, bArr11, i18, i3);
        C117790util.m166193o(bArr11, i25, i2);
        System.arraycopy(bArr5, 0, bArr11, i19, i2);
        mo165627b(this.f338498e);
        mo165626a(bArr11, this.f338501f);
        mo165632g();
        return mo165628c();
    }
}
