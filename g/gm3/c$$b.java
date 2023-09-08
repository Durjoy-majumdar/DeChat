package gm3;

import com.tencent.p014mm.p136ui.matrix.MatrixSettingAbsSeekBarPreference;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingUI;

public final /* synthetic */ class c$$b implements MatrixSettingAbsSeekBarPreference.C19800b {

    /* renamed from: a */
    public final /* synthetic */ MatrixSettingUI f252998a;

    public /* synthetic */ c$$b(MatrixSettingUI matrixSettingUI) {
        this.f252998a = matrixSettingUI;
    }

    /* renamed from: a */
    public final void mo26279a(int i) {
        MatrixSettingUI matrixSettingUI = this.f252998a;
        Runnable runnable = matrixSettingUI.f250270e;
        if (runnable != null) {
            matrixSettingUI.f250271f.removeCallbacks(runnable);
        }
        c$$d c__d = new c$$d(matrixSettingUI, i);
        matrixSettingUI.f250270e = c__d;
        matrixSettingUI.f250271f.postDelayed(c__d, 1000);
    }
}
