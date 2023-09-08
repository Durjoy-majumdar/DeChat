package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.remittance.model.C5058t0;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import qn3.C77382c;
import qo3.C47883u;
import qo3.C77426q;
import te3.C77965lu;

/* renamed from: com.tencent.mm.plugin.remittance.ui.k */
public class C70900k {

    /* renamed from: a */
    public Context f205319a;

    /* renamed from: b */
    public C70904d f205320b;

    /* renamed from: c */
    public C77965lu f205321c;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.k$a */
    public class C70901a implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ C77426q f205322d;

        /* renamed from: e */
        public final /* synthetic */ EditText f205323e;

        public C70901a(C77426q qVar, EditText editText) {
            this.f205322d = qVar;
            this.f205323e = editText;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f205322d.f225839c == null) {
                return;
            }
            if (this.f205323e.length() > 0) {
                this.f205322d.f225839c.mo107543y(C70900k.this.f205319a.getResources().getColor(C0966R.color.Link_100));
                this.f205322d.f225839c.mo107526f(-1).setEnabled(true);
                return;
            }
            this.f205322d.f225839c.mo107543y(-2141754475);
            this.f205322d.f225839c.mo107526f(-1).setEnabled(false);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.k$b */
    public class C70902b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditText f205325d;

        public C70902b(EditText editText) {
            this.f205325d = editText;
        }

        public void run() {
            this.f205325d.requestFocus();
            ((InputMethodManager) C70900k.this.f205319a.getSystemService("input_method")).showSoftInput(this.f205325d, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.k$c */
    public class C70903c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ int f205327a;

        /* renamed from: b */
        public final /* synthetic */ String f205328b;

        /* renamed from: c */
        public final /* synthetic */ EditText f205329c;

        public C70903c(int i, String str, EditText editText) {
            this.f205327a = i;
            this.f205328b = str;
            this.f205329c = editText;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z) {
                WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new WCPayTrasnferCheckRealNameReportStruct();
                wCPayTrasnferCheckRealNameReportStruct.f194689f = (long) this.f205327a;
                wCPayTrasnferCheckRealNameReportStruct.mo93202s(this.f205328b);
                wCPayTrasnferCheckRealNameReportStruct.f194687d = 3;
                wCPayTrasnferCheckRealNameReportStruct.mo86054n();
                C70900k.this.f205320b.mo97226a(this.f205329c.getText().toString());
                return;
            }
            WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct2 = new WCPayTrasnferCheckRealNameReportStruct();
            wCPayTrasnferCheckRealNameReportStruct2.f194689f = (long) this.f205327a;
            wCPayTrasnferCheckRealNameReportStruct2.mo93202s(this.f205328b);
            wCPayTrasnferCheckRealNameReportStruct2.f194687d = 2;
            wCPayTrasnferCheckRealNameReportStruct2.mo86054n();
            C70900k.this.f205320b.onCancel();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.k$d */
    public interface C70904d {
        /* renamed from: a */
        void mo97226a(String str);

        void onCancel();
    }

    public C70900k(Context context) {
        this.f205319a = context;
    }

    /* renamed from: a */
    public void mo97569a(int i, String str, C77965lu luVar, C70904d dVar, String str2) {
        this.f205320b = dVar;
        this.f205321c = luVar;
        View inflate = View.inflate(this.f205319a, C0966R.C0971layout.bpw, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.e_9);
        ((MMNeat7extView) inflate.findViewById(C0966R.C0970id.br8)).mo104279b(this.f205321c.f227823e);
        ((TextView) inflate.findViewById(C0966R.C0970id.fhu)).setText(luVar.f227824f);
        C77426q qVar = new C77426q(this.f205319a);
        qVar.mo107606r(this.f205321c.f227822d);
        qVar.mo107592d(inflate);
        ((C5058t0) C39818r.f106831a.mo62443b(this.f205319a).mo75002a(C5058t0.class)).setValue("real_name_dialog_title_key", this.f205321c.f227822d);
        if (Util.isNullOrNil(str2)) {
            str2 = this.f205319a.getResources().getString(C0966R.string.a18);
        }
        qVar.mo107602n(str2);
        C77382c b = C77382c.m93286b(editText);
        b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
        b.f225611e = 1;
        b.f225610d = 1;
        b.f225607a = false;
        b.mo107499d((C77382c.C77383a) null);
        editText.addTextChangedListener(new C70901a(qVar, editText));
        MMHandlerThread.postToMainThreadDelayed(new C70902b(editText), 200);
        WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new WCPayTrasnferCheckRealNameReportStruct();
        wCPayTrasnferCheckRealNameReportStruct.f194689f = (long) i;
        wCPayTrasnferCheckRealNameReportStruct.mo93202s(str);
        wCPayTrasnferCheckRealNameReportStruct.f194687d = 1;
        wCPayTrasnferCheckRealNameReportStruct.mo86054n();
        qVar.mo107590b(new C70903c(i, str, editText));
        qVar.mo107603o();
        if (qVar.f225839c != null && Util.isNullOrNil((CharSequence) editText.getText())) {
            qVar.f225839c.mo107526f(-1).setEnabled(false);
            qVar.f225839c.mo107543y(-2141754475);
        }
    }
}
