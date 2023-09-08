package ce1;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import gy3.C87412m;

/* renamed from: ce1.x */
public final class C0495x implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C0479p f1219d;

    public C0495x(C0479p pVar) {
        this.f1219d = pVar;
    }

    public void afterTextChanged(Editable editable) {
        int i;
        int i2 = 0;
        if (editable != null) {
            C0479p pVar = this.f1219d;
            i = editable.toString().length();
            if (8 <= i && i < 10) {
                TextView textView = pVar.f1196u;
                if (textView != null) {
                    textView.setTextColor(pVar.getResources().getColor(C0966R.color.FG_1));
                }
                TextView textView2 = pVar.f1196u;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(10 - i));
                }
            } else if (i == 10) {
                TextView textView3 = pVar.f1196u;
                if (textView3 != null) {
                    textView3.setTextColor(pVar.getResources().getColor(C0966R.color.FG_1));
                }
                TextView textView4 = pVar.f1196u;
                if (textView4 != null) {
                    textView4.setText("");
                }
            } else if (i > 10) {
                TextView textView5 = pVar.f1196u;
                if (textView5 != null) {
                    textView5.setTextColor(pVar.getResources().getColor(C0966R.color.f2966ao));
                }
                TextView textView6 = pVar.f1196u;
                if (textView6 != null) {
                    textView6.setText(String.valueOf(10 - i));
                }
            } else {
                TextView textView7 = pVar.f1196u;
                if (textView7 != null) {
                    textView7.setText("");
                }
            }
        } else {
            i = 0;
        }
        this.f1219d.mo535i3(false, 0);
        C0479p pVar2 = this.f1219d;
        MMEditText mMEditText = pVar2.f1184f;
        if (mMEditText != null) {
            Editable text = mMEditText.getText();
            if (text != null) {
                i2 = text.length();
            }
            C0479p.m421d3(pVar2, i, i2);
            return;
        }
        C87412m.m108603p("descEdit");
        throw null;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
