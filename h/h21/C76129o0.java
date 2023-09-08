package h21;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.collect.p038ui.WalletCollectQrCodeSettingUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: h21.o0 */
public class C76129o0 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ View.OnClickListener f223043d;

    /* renamed from: e */
    public final /* synthetic */ WalletCollectQrCodeSettingUI f223044e;

    public C76129o0(WalletCollectQrCodeSettingUI walletCollectQrCodeSettingUI, View.OnClickListener onClickListener) {
        this.f223044e = walletCollectQrCodeSettingUI;
        this.f223043d = onClickListener;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f223044e.f197823h.isShown()) {
            Log.m105924i("MicroMsg.WalletCollectQrCodeSettingUI", "click enter");
            this.f223043d.onClick((View) null);
        }
        return true;
    }
}
