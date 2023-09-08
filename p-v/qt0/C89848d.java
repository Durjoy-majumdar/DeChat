package qt0;

import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: qt0.d */
public class C89848d implements C89847c {

    /* renamed from: d */
    public final int[] f258274d = new int[2];

    /* renamed from: e */
    public int f258275e = -1;

    /* renamed from: f */
    public int f258276f = -1;

    /* renamed from: a */
    public final int[] mo124135a() {
        int[] iArr = this.f258274d;
        Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
        iArr[0] = defaultDisplay.getWidth();
        iArr[1] = defaultDisplay.getHeight();
        return iArr;
    }

    public void setForceHeight(int i) {
        this.f258275e = i;
    }
}
