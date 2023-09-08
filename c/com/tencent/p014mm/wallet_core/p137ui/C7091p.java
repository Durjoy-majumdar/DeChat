package com.tencent.p014mm.wallet_core.p137ui;

import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.wallet_core.ui.p */
public class C7091p implements InputFilter {
    public C7091p(int i) {
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        Log.m105919d("MicroMsg.TextByteLengthInputFilter", "byte filter: %s, %s, %s, %s, %s, %s", charSequence, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4));
        if (charSequence == null || charSequence.length() == 0) {
            Log.m105924i("MicroMsg.TextByteLengthInputFilter", "skip delete case");
            return null;
        }
        int i6 = i4 - i3;
        if (spanned == null || spanned.toString().getBytes().length < 75 || i6 != 0) {
            int length = charSequence.toString().getBytes().length;
            int length2 = spanned != null ? spanned.toString().getBytes().length : 0;
            Log.m105925i("MicroMsg.TextByteLengthInputFilter", "source length: %s, dest length: %s", Integer.valueOf(length), Integer.valueOf(length2));
            if (i6 == 0) {
                i5 = length + length2;
            } else {
                int length3 = spanned.subSequence(i3, i4).toString().getBytes().length;
                i5 = (length + length2) - length3;
                Log.m105925i("MicroMsg.TextByteLengthInputFilter", "replace byte length: %s", Integer.valueOf(length3));
            }
            Log.m105919d("MicroMsg.TextByteLengthInputFilter", "final byte length: %s", Integer.valueOf(i5));
            if (i5 <= 75) {
                return null;
            }
            Log.m105925i("MicroMsg.TextByteLengthInputFilter", "exceed max byte length: %s %s", Integer.valueOf(i5), 75);
            return "";
        }
        Log.m105925i("MicroMsg.TextByteLengthInputFilter", "ignore exceed case: %s", Integer.valueOf(spanned.toString().getBytes().length));
        return "";
    }
}
