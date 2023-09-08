package fg2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.plugin.radar.p091ui.RadarMemberView;
import gy3.C87412m;
import qo3.C77398g;

/* renamed from: fg2.i */
public final class C75757i implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ RadarMemberView f222359d;

    public C75757i(RadarMemberView radarMemberView) {
        this.f222359d = radarMemberView;
    }

    public void afterTextChanged(Editable editable) {
        C87412m.m108594g(editable, "s");
        int length = 50 - editable.length();
        boolean z = false;
        if (length < 0) {
            length = 0;
        }
        TextView textView = this.f222359d.f203298B;
        if (textView != null) {
            textView.setText(String.valueOf(length));
        }
        C77398g gVar = this.f222359d.f203317y;
        Button f = gVar != null ? gVar.mo107526f(-1) : null;
        if (f != null) {
            if (editable.length() > 0) {
                z = true;
            }
            f.setEnabled(z);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C87412m.m108594g(charSequence, "s");
    }
}
