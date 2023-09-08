package h21;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: h21.k */
public class C76117k implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223031d;

    public C76117k(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f223031d = collectCreateQRCodeNewUI;
    }

    public void afterTextChanged(Editable editable) {
        double d = Util.getDouble(editable.toString(), 0.0d);
        if (!this.f223031d.f197797d.mo105094l() || d < 0.01d) {
            this.f223031d.f197801h.mo104738c(false);
        } else {
            this.f223031d.f197801h.mo104738c(true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
