package h21;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: h21.m0 */
public class C76123m0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223037d;

    public C76123m0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI) {
        this.f223037d = walletCollectQrCodeSettingUI;
    }

    public void afterTextChanged(Editable editable) {
        double d = Util.getDouble(editable.toString(), 0.0d);
        if (!this.f223037d.f197819d.mo105094l() || d < 0.01d) {
            this.f223037d.f197823h.mo104738c(false);
        } else {
            this.f223037d.f197823h.mo104738c(true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
