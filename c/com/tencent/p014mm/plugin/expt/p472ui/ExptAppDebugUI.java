package com.tencent.p014mm.plugin.expt.p472ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import java.util.HashMap;
import ma1.C117543a;
import oa1.C61982a;
import oa1.C61983b;

/* renamed from: com.tencent.mm.plugin.expt.ui.ExptAppDebugUI */
public class ExptAppDebugUI extends MMActivity {

    /* renamed from: d */
    public TextView f158355d;

    /* renamed from: e */
    public TextView f158356e;

    /* renamed from: f */
    public TextView f158357f;

    /* renamed from: g */
    public TextView f158358g;

    /* renamed from: h */
    public TextView f158359h;

    /* renamed from: i */
    public TextView f158360i;

    /* renamed from: j */
    public int f158361j = 0;

    /* renamed from: com.tencent.mm.plugin.expt.ui.ExptAppDebugUI$a */
    public class C55639a implements MenuItem.OnMenuItemClickListener {
        public C55639a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExptAppDebugUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m63246H7(ExptAppDebugUI exptAppDebugUI, int i) {
        exptAppDebugUI.f158361j = i;
        C117543a Cx0 = C117543a.Cx0();
        int i2 = exptAppDebugUI.f158361j;
        Cx0.getClass();
        C61982a f = C61983b.m72724e().mo86870f(i2);
        if (f == null) {
            exptAppDebugUI.f158356e.setText("");
            exptAppDebugUI.f158357f.setText("");
            exptAppDebugUI.f158358g.setText("");
            exptAppDebugUI.f158359h.setText("");
            exptAppDebugUI.f158360i.setText("");
            return;
        }
        TextView textView = exptAppDebugUI.f158356e;
        textView.setText(f.f176193a + "");
        TextView textView2 = exptAppDebugUI.f158357f;
        textView2.setText(f.f176194b + "");
        TextView textView3 = exptAppDebugUI.f158358g;
        textView3.setText(f.f176195c + "");
        TextView textView4 = exptAppDebugUI.f158359h;
        textView4.setText(" start: " + f.f176197e + " end: " + f.f176198f);
        HashMap<String, String> c = f.mo86864c();
        if (c != null) {
            TextView textView5 = exptAppDebugUI.f158360i;
            textView5.setText(" args : " + c.toString());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6318bn;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("Expt App debug ui");
        setBackBtn(new C55639a());
        this.f158355d = (TextView) mo176895$(C0966R.C0970id.f7l);
        ((Button) mo176895$(C0966R.C0970id.f357756bl2)).setOnClickListener(new C55641a(this));
        ((EditText) mo176895$(C0966R.C0970id.cni)).setVisibility(8);
        ((Button) mo176895$(C0966R.C0970id.cnj)).setVisibility(8);
        ((Button) mo176895$(C0966R.C0970id.cnf)).setOnClickListener(new C55642b(this));
        ((Button) mo176895$(C0966R.C0970id.ipn)).setOnClickListener(new C29903c(this));
        ((Button) mo176895$(C0966R.C0970id.ipw)).setOnClickListener(new C29904d(this));
        ((Button) mo176895$(C0966R.C0970id.cnb)).setOnClickListener(new C29905e(this));
        ((Button) mo176895$(C0966R.C0970id.cnc)).setVisibility(8);
        this.f158356e = (TextView) mo176895$(C0966R.C0970id.cnd);
        this.f158357f = (TextView) mo176895$(C0966R.C0970id.ere);
        this.f158358g = (TextView) mo176895$(C0966R.C0970id.cng);
        this.f158359h = (TextView) mo176895$(C0966R.C0970id.cnh);
        this.f158360i = (TextView) mo176895$(C0966R.C0970id.cna);
    }
}
