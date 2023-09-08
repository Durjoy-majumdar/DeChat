package h21;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: h21.m */
public class C76122m implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ View.OnClickListener f223035d;

    /* renamed from: e */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223036e;

    public C76122m(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI, View.OnClickListener onClickListener) {
        this.f223036e = collectCreateQRCodeNewUI;
        this.f223035d = onClickListener;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f223036e.f197801h.isShown()) {
            Log.m105924i("MicroMsg.CollectCreateQRCodeNewUI", "click enter");
            this.f223035d.onClick((View) null);
        }
        return true;
    }
}
