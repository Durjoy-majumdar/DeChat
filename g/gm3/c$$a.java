package gm3;

import android.content.Intent;
import com.tencent.p014mm.matrix.C80992k;
import com.tencent.p014mm.matrix.strategy.MatrixStrategyNotifyBroadcast;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingAbsSeekBarPreference;
import com.tencent.p014mm.p136ui.matrix.MatrixSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

public final /* synthetic */ class c$$a implements MatrixSettingAbsSeekBarPreference.C19800b {

    /* renamed from: a */
    public final /* synthetic */ MatrixSettingUI f252997a;

    public /* synthetic */ c$$a(MatrixSettingUI matrixSettingUI) {
        this.f252997a = matrixSettingUI;
    }

    /* renamed from: a */
    public final void mo26279a(int i) {
        MatrixSettingUI matrixSettingUI = this.f252997a;
        boolean z = MatrixSettingUI.f250268g;
        matrixSettingUI.getClass();
        int max = Math.max(17, (int) ((((float) i) * 5000.0f) / 100.0f));
        Log.m105924i("Matrix.SettingUI", "[onConfirm] threshold=" + max);
        long j = (long) max;
        Intent intent = new Intent();
        intent.setAction("MODIFY_EVIL_THRESHOLD");
        intent.putExtra("MODIFY_EVIL_THRESHOLD", j);
        C80992k.m98890b(MMApplicationContext.getContext(), intent);
        MMApplicationContext.getContext().sendBroadcast(intent, MatrixStrategyNotifyBroadcast.f237879a);
    }
}
