package i13;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: i13.x */
public final class C76280x implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223468d;

    public C76280x(C76259g gVar) {
        this.f223468d = gVar;
    }

    public final boolean onTimerExpired() {
        C76259g gVar = this.f223468d;
        int i = gVar.f223402G;
        int i2 = i % 3;
        gVar.f223402G = i + 1;
        if (i2 == 0) {
            gVar.f223401F = "·";
        } else if (i2 == 1) {
            gVar.f223401F = "··";
        } else if (i2 == 2) {
            gVar.f223401F = "···";
        }
        String str = gVar.f223438x0;
        int length = str.length() > 3 ? str.length() - 3 : 0;
        String str2 = str + gVar.f223401F;
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(gVar.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3)), length, str2.length(), 18);
        MMEditText mMEditText = gVar.f223426n;
        if (mMEditText != null) {
            mMEditText.setText(spannableString);
        }
        return true;
    }
}
