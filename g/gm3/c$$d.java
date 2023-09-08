package gm3;

import android.view.View;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import p965fe.C86853a;

public final /* synthetic */ class c$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MatrixSettingUI f252999d;

    /* renamed from: e */
    public final /* synthetic */ int f253000e;

    public /* synthetic */ c$$d(MatrixSettingUI matrixSettingUI, int i) {
        this.f252999d = matrixSettingUI;
        this.f253000e = i;
    }

    public final void run() {
        MatrixSettingUI matrixSettingUI = this.f252999d;
        int i = this.f253000e;
        boolean z = MatrixSettingUI.f250268g;
        matrixSettingUI.getClass();
        Log.m105924i("Matrix.SettingUI", "[onConfirm] interval=" + i);
        MultiProcessMMKV.getDefault().putInt("matrix_top_thread_interval", i);
        C86853a aVar = C86853a.f252120l;
        View view = aVar.f252125e;
        boolean z2 = false;
        if (view != null) {
            aVar.f252123c.put(view.hashCode(), false);
        }
        if (aVar.f252125e != null) {
            z2 = true;
        }
        if (z2) {
            aVar.mo121317c();
            MatrixSettingUI.m106234K7(matrixSettingUI, i);
        }
    }
}
