package da3;

import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.input.C44304e;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;

/* renamed from: da3.g */
public class C45320g extends C45319f {

    /* renamed from: d */
    public static final int f122775d = C76577a.m92151b(MMApplicationContext.getContext(), 48);

    /* renamed from: e */
    public static final int f122776e = C76577a.m92151b(MMApplicationContext.getContext(), 43);

    public C45320g() {
        super(0);
    }

    /* renamed from: a */
    public int mo70876a() {
        C44304e eVar = this.f122773b;
        if (eVar.f120060f) {
            return 7;
        }
        if (eVar.f120059e <= 1) {
            Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
            eVar.f120059e = new int[]{defaultDisplay.getWidth(), defaultDisplay.getHeight()}[0];
        }
        return eVar.f120059e / f122776e;
    }

    /* renamed from: b */
    public int mo70877b() {
        int i = this.f122773b.f120058d / f122775d;
        if (i > 3) {
            i = 3;
        }
        if (i < 1) {
            return 1;
        }
        return i;
    }
}
