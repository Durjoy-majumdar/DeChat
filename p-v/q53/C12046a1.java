package q53;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: q53.a1 */
public final class C12046a1 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ View.OnClickListener f35090d;

    public C12046a1(View.OnClickListener onClickListener) {
        this.f35090d = onClickListener;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            Log.m105924i("MicroMsg.WeCoinEncashView", "click enter");
            this.f35090d.onClick((View) null);
        }
        return true;
    }
}
