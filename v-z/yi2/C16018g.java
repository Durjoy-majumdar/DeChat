package yi2;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import gy3.C87412m;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: yi2.g */
public final class C16018g extends C103422m implements C74965a.C74969d {

    /* renamed from: f */
    public Context f43085f;

    /* renamed from: g */
    public final String f43086g;

    /* renamed from: h */
    public final String f43087h;

    /* renamed from: i */
    public final C16013b f43088i;

    /* renamed from: j */
    public EditText f43089j;

    /* renamed from: n */
    public Button f43090n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16018g(Context context, String str, String str2, C16013b bVar) {
        super(context, C0966R.style.f8721sq);
        C87412m.m108594g(context, "dialogContext");
        this.f43085f = context;
        this.f43086g = str;
        this.f43087h = str2;
        this.f43088i = bVar;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        if (z) {
            View findViewById = findViewById(C0966R.C0970id.f7j);
            if (findViewById != null) {
                findViewById.setPadding(0, 0, 0, i);
                return;
            }
            return;
        }
        View findViewById2 = findViewById(C0966R.C0970id.f7j);
        if (findViewById2 != null) {
            findViewById2.setPadding(0, 0, 0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(C0966R.style.f8365fv);
        }
        View inflate = LayoutInflater.from(this.f43085f).inflate(C0966R.C0971layout.f359949bt2, (ViewGroup) null, false);
        setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        ((TextView) inflate.findViewById(C0966R.C0970id.kpm)).setText(this.f43086g);
        this.f43089j = (EditText) inflate.findViewById(C0966R.C0970id.l3f);
        this.f43090n = (Button) inflate.findViewById(C0966R.C0970id.hll);
        EditText editText = this.f43089j;
        if (editText != null) {
            editText.requestFocus();
        }
        String str = this.f43087h;
        if (str != null) {
            EditText editText2 = this.f43089j;
            if (editText2 != null) {
                editText2.setText(str);
            }
            EditText editText3 = this.f43089j;
            if (editText3 != null) {
                editText3.setSelection(str.length());
            }
        }
        inflate.findViewById(C0966R.C0970id.cij).setOnTouchListener(new C16014c(this));
        setCancelable(true);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.f7j);
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.mo104200a(this);
        }
        C119179t tVar = C119157j.f356862d;
        C16015d dVar = new C16015d(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(dVar, 128, false);
        Button button = this.f43090n;
        if (button != null) {
            button.setOnClickListener(new C16016e(this));
        }
        setOnDismissListener(new C16017f(this));
    }
}
