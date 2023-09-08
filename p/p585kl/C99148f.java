package p585kl;

import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonFastManagementStruct;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: kl.f */
public final class C99148f {

    /* renamed from: a */
    public static final C99148f f290704a = new C99148f();

    /* renamed from: b */
    public static final EmoticonFastManagementStruct f290705b = new EmoticonFastManagementStruct();

    /* renamed from: a */
    public final void mo138516a(int i) {
        EmoticonFastManagementStruct emoticonFastManagementStruct = f290705b;
        emoticonFastManagementStruct.f265458d = i;
        emoticonFastManagementStruct.mo86054n();
    }

    /* renamed from: b */
    public final void mo138517b(int i) {
        EmoticonFastManagementStruct emoticonFastManagementStruct = f290705b;
        int i2 = 4;
        if (i != 0) {
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                if (i == 3) {
                    i2 = 3;
                } else if (i != 4) {
                    Log.m105920e("MicroMsg.EmojiPopupReport", "type scene mismatch");
                } else {
                    i2 = 5;
                }
            }
            emoticonFastManagementStruct.f265459e = i2;
        }
        i2 = 1;
        emoticonFastManagementStruct.f265459e = i2;
    }
}
