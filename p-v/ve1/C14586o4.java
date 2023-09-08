package ve1;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: ve1.o4 */
public final class C14586o4 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f40408d;

    /* renamed from: e */
    public final /* synthetic */ C14602p4 f40409e;

    /* renamed from: f */
    public final /* synthetic */ TextView f40410f;

    public C14586o4(TextView textView, C14602p4 p4Var, TextView textView2) {
        this.f40408d = textView;
        this.f40409e = p4Var;
        this.f40410f = textView2;
    }

    public boolean onPreDraw() {
        this.f40408d.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        this.f40408d.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.f40410f.getLocationInWindow(iArr2);
        this.f40408d.setMaxWidth(iArr2[0] - iArr[0]);
        String str = this.f40409e.f40437e;
        Log.m105924i(str, "adjustNickNameWidth maxWidth:" + this.f40408d.getMaxWidth() + ",nicknamePos:" + iArr[0] + '-' + iArr[1] + ", tipsPos:" + iArr2[0] + '-' + iArr2[1]);
        if (this.f40408d.getMaxWidth() <= 0) {
            this.f40408d.setMaxWidth(MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3753d4));
        }
        return true;
    }
}
