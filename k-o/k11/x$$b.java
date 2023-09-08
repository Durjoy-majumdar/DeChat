package k11;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;

public final /* synthetic */ class x$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CleanNewUI f290536d;

    /* renamed from: e */
    public final /* synthetic */ int f290537e;

    /* renamed from: f */
    public final /* synthetic */ int f290538f;

    public /* synthetic */ x$$b(CleanNewUI cleanNewUI, int i, int i2) {
        this.f290536d = cleanNewUI;
        this.f290537e = i;
        this.f290538f = i2;
    }

    public final void run() {
        CleanNewUI cleanNewUI = this.f290536d;
        int i = this.f290537e;
        int i2 = this.f290538f;
        TextView textView = cleanNewUI.f267949t;
        if (textView != null) {
            textView.setText(cleanNewUI.getString(C0966R.string.bdv, new Object[]{Integer.valueOf((i * 100) / i2)}));
        }
    }
}
