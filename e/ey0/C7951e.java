package ey0;

import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import kg3.C76577a;

/* renamed from: ey0.e */
public final class C7951e {

    /* renamed from: a */
    public static final C7951e f26637a = new C7951e();

    /* renamed from: a */
    public final boolean mo9052a(MMNeat7extView mMNeat7extView, String str) {
        mMNeat7extView.mo104279b(str);
        return ((NeatLayout) mMNeat7extView.mo154990i(C76577a.m92151b(mMNeat7extView.getContext(), 232), Integer.MAX_VALUE)).f319992L > 1;
    }

    /* renamed from: b */
    public final String mo9053b(String[] strArr, int i) {
        int length = strArr.length;
        int i2 = 0;
        String str = "";
        int i3 = 0;
        while (i2 < length) {
            String str2 = strArr[i2];
            int i4 = i3 + 1;
            if (i3 <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (i3 != i) {
                    str2 = str2 + 12289;
                }
                sb.append(str2);
                str = sb.toString();
            }
            i2++;
            i3 = i4;
        }
        return str;
    }
}
