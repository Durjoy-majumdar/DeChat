package i13;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: i13.s */
public final class C76276s implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C76259g f223464d;

    public C76276s(C76259g gVar) {
        this.f223464d = gVar;
    }

    public void afterTextChanged(Editable editable) {
        C76259g gVar = this.f223464d;
        if (!gVar.f223423h && gVar.f223410P) {
            gVar.f223423h = true;
            gVar.f223421f.f207385t = 1;
        }
        Button button = gVar.f223435v;
        if (button != null) {
            button.setEnabled(!Util.isNullOrNil((CharSequence) editable));
        }
        ImageView imageView = this.f223464d.f223427o;
        if (imageView != null) {
            imageView.setVisibility(Util.isNullOrNil((CharSequence) editable) ? 4 : 0);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
