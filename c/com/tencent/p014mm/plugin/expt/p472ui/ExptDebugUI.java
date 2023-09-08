package com.tencent.p014mm.plugin.expt.p472ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.XExptClientRptStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pointers.PBool;
import java.util.HashMap;
import ma1.C117543a;
import oa1.C47346c;

/* renamed from: com.tencent.mm.plugin.expt.ui.ExptDebugUI */
public class ExptDebugUI extends MMActivity {

    /* renamed from: d */
    public TextView f111419d;

    /* renamed from: e */
    public TextView f111420e;

    /* renamed from: f */
    public TextView f111421f;

    /* renamed from: g */
    public TextView f111422g;

    /* renamed from: h */
    public TextView f111423h;

    /* renamed from: i */
    public TextView f111424i;

    /* renamed from: j */
    public TextView f111425j;

    /* renamed from: n */
    public TextView f111426n;

    /* renamed from: o */
    public EditText f111427o;

    /* renamed from: p */
    public int f111428p = 0;

    /* renamed from: com.tencent.mm.plugin.expt.ui.ExptDebugUI$a */
    public class C41386a implements MenuItem.OnMenuItemClickListener {
        public C41386a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExptDebugUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m44732H7(ExptDebugUI exptDebugUI, int i) {
        exptDebugUI.f111428p = i;
        C47346c Bx0 = C117543a.Cx0().Bx0(exptDebugUI.f111428p);
        if (Bx0 == null) {
            exptDebugUI.f111420e.setText("");
            exptDebugUI.f111421f.setText("");
            exptDebugUI.f111422g.setText("");
            exptDebugUI.f111423h.setText("");
            exptDebugUI.f111424i.setText("");
            return;
        }
        TextView textView = exptDebugUI.f111420e;
        textView.setText(Bx0.field_exptId + "");
        TextView textView2 = exptDebugUI.f111421f;
        textView2.setText(Bx0.field_groupId + "");
        TextView textView3 = exptDebugUI.f111422g;
        textView3.setText(Bx0.field_exptSeq + "");
        TextView textView4 = exptDebugUI.f111423h;
        textView4.setText(" start: " + Bx0.field_startTime + " end: " + Bx0.field_endTime);
        TextView textView5 = exptDebugUI.f111425j;
        StringBuilder sb = new StringBuilder();
        sb.append(Bx0.field_bucketSrc);
        sb.append("");
        textView5.setText(sb.toString());
        TextView textView6 = exptDebugUI.f111426n;
        textView6.setText(Bx0.field_paramHashVal + "");
        HashMap<String, String> zx02 = C117543a.Cx0().zx0(exptDebugUI.f111428p, false, (XExptClientRptStruct) null, new PBool());
        if (zx02 != null) {
            TextView textView7 = exptDebugUI.f111424i;
            textView7.setText(" args : " + zx02.toString());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6319bo;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("Expt debug ui");
        setBackBtn(new C41386a());
        this.f111419d = (TextView) mo176895$(C0966R.C0970id.f7l);
        ((Button) mo176895$(C0966R.C0970id.f357756bl2)).setOnClickListener(new C41387f(this));
        this.f111427o = (EditText) mo176895$(C0966R.C0970id.cni);
        ((Button) mo176895$(C0966R.C0970id.cnj)).setOnClickListener(new C29906g(this));
        ((Button) mo176895$(C0966R.C0970id.cnf)).setOnClickListener(new C41388h(this));
        ((Button) mo176895$(C0966R.C0970id.ipw)).setOnClickListener(new C29907i(this));
        ((Button) mo176895$(C0966R.C0970id.cnb)).setOnClickListener(new C29908j(this));
        ((Button) mo176895$(C0966R.C0970id.cnc)).setOnClickListener(new C41390k(this));
        this.f111420e = (TextView) mo176895$(C0966R.C0970id.cnd);
        this.f111421f = (TextView) mo176895$(C0966R.C0970id.ere);
        this.f111422g = (TextView) mo176895$(C0966R.C0970id.cng);
        this.f111423h = (TextView) mo176895$(C0966R.C0970id.cnh);
        this.f111424i = (TextView) mo176895$(C0966R.C0970id.cna);
        this.f111425j = (TextView) mo176895$(C0966R.C0970id.mp8);
        this.f111426n = (TextView) mo176895$(C0966R.C0970id.nt6);
    }
}
