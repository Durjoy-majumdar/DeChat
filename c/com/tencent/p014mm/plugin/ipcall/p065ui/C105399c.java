package com.tencent.p014mm.plugin.ipcall.p065ui;

import com.tencent.p014mm.plugin.ipcall.p065ui.DialPad;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.c */
public class C105399c implements DialPad.C105386a {

    /* renamed from: a */
    public final /* synthetic */ C105394b f313366a;

    public C105399c(C105394b bVar) {
        this.f313366a = bVar;
    }

    /* renamed from: a */
    public void mo150109a(String str) {
        C105394b bVar = this.f313366a;
        bVar.f313350o = bVar.f313339d.getText().toString();
        C105394b bVar2 = this.f313366a;
        if (bVar2.f313355t) {
            bVar2.f313349n += str;
            C105394b bVar3 = this.f313366a;
            bVar3.f313338c.setText(bVar3.f313349n);
            if (C13818a.m13117m(this.f313366a.f313349n.replace("+", "")) || this.f313366a.f313349n.replace("+", "").length() >= 4) {
                C115669n.INSTANCE.mo160131h(12061, 0, 0, 0, 0, 1, 0);
                C105394b bVar4 = this.f313366a;
                bVar4.f313355t = false;
                bVar4.f313348m = C13818a.m13111g(bVar4.f313349n.replace("+", ""));
                C105394b bVar5 = this.f313366a;
                bVar5.f313350o = bVar5.mo150124a(bVar5.f313349n.replace("+", ""), this.f313366a.f313350o);
                C105394b bVar6 = this.f313366a;
                bVar6.mo150128e(bVar6.f313350o, -1);
                return;
            }
            return;
        }
        String replace = bVar2.f313338c.getText().toString().replace("+", "");
        C105394b bVar7 = this.f313366a;
        if (bVar7.f313358w) {
            StringBuffer stringBuffer = new StringBuffer(bVar7.f313350o);
            stringBuffer.insert(this.f313366a.f313339d.getSelectionStart(), str);
            this.f313366a.f313350o = stringBuffer.toString();
        } else {
            bVar7.f313350o += str;
        }
        if (this.f313366a.f313350o.equals("00")) {
            this.f313366a.f313338c.setText("+");
            C105394b bVar8 = this.f313366a;
            bVar8.f313355t = true;
            bVar8.f313349n = "+";
            bVar8.f313350o = "";
        }
        if (C13818a.m13117m(this.f313366a.f313349n.replace("+", "") + this.f313366a.f313350o)) {
            this.f313366a.f313338c.setText("+" + this.f313366a.f313349n.replace("+", "") + this.f313366a.f313350o);
            C105394b bVar9 = this.f313366a;
            bVar9.f313348m = C13818a.m13111g(bVar9.f313349n.replace("+", ""));
            C105394b bVar10 = this.f313366a;
            bVar10.f313355t = false;
            bVar10.f313349n = this.f313366a.f313349n.replace("+", "") + this.f313366a.f313350o;
            this.f313366a.f313350o = "";
        }
        C105394b bVar11 = this.f313366a;
        String str2 = bVar11.f313350o;
        bVar11.f313350o = bVar11.mo150124a(replace, str2);
        C105394b bVar12 = this.f313366a;
        if (!bVar12.f313358w) {
            bVar12.mo150128e(bVar12.f313350o, -1);
        } else if (str2.length() < this.f313366a.f313350o.length()) {
            C105394b bVar13 = this.f313366a;
            bVar13.mo150128e(bVar13.f313350o, bVar13.f313339d.getSelectionEnd() + 2);
        } else if (str2.length() == this.f313366a.f313350o.length()) {
            C105394b bVar14 = this.f313366a;
            bVar14.mo150128e(bVar14.f313350o, bVar14.f313339d.getSelectionEnd() + 1);
        } else if (str2.length() > this.f313366a.f313350o.length()) {
            C105394b bVar15 = this.f313366a;
            bVar15.mo150128e(bVar15.f313350o, (bVar15.f313339d.getSelectionEnd() + 1) - (str2.length() - this.f313366a.f313350o.length()));
        }
        this.f313366a.f313354s = System.currentTimeMillis();
        if (this.f313366a.f313350o.length() > 3) {
            if (!Util.isNullOrNil(this.f313366a.f313349n + this.f313366a.f313350o)) {
                this.f313366a.mo150125b();
            }
        }
    }

    /* renamed from: b */
    public void mo150110b(String str) {
        if (str.equals("0")) {
            this.f313366a.f313338c.setText("+");
            C105394b bVar = this.f313366a;
            bVar.f313355t = true;
            bVar.f313349n = "+";
        }
    }
}
