package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.l1 */
public class C69631l1 {

    /* renamed from: a */
    public List<C69637m1> f201001a = new LinkedList();

    /* renamed from: b */
    public boolean f201002b = false;

    /* renamed from: c */
    public boolean f201003c = false;

    /* renamed from: d */
    public TextView f201004d;

    /* renamed from: a */
    public boolean mo95866a(int i, boolean z) {
        TextView textView;
        this.f201003c = false;
        this.f201002b = false;
        for (int i2 = 0; i2 < ((LinkedList) this.f201001a).size(); i2++) {
            C69637m1 m1Var = (C69637m1) ((LinkedList) this.f201001a).get(i2);
            int c = m1Var.mo5753c();
            if (c != 0) {
                m1Var.mo5751a();
                mo95870e(m1Var.mo5755e(c));
                this.f201003c = true;
            } else {
                m1Var.mo5752b();
            }
        }
        if (!this.f201003c && (textView = this.f201004d) != null) {
            textView.setVisibility(8);
            this.f201002b = false;
        }
        return this.f201003c;
    }

    /* renamed from: b */
    public boolean mo95867b() {
        for (int i = 0; i < ((LinkedList) this.f201001a).size(); i++) {
            if (((C69637m1) ((LinkedList) this.f201001a).get(i)).mo5753c() != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo95868c(C69637m1 m1Var) {
        if (m1Var != null && !((LinkedList) this.f201001a).contains(m1Var)) {
            ((LinkedList) this.f201001a).add(m1Var);
        }
    }

    /* renamed from: d */
    public void mo95869d(String str) {
        if (this.f201004d == null || Util.isNullOrNil(str)) {
            TextView textView = this.f201004d;
            if (textView != null) {
                textView.setVisibility(8);
                this.f201002b = false;
                return;
            }
            return;
        }
        this.f201004d.setText(str);
        this.f201004d.setVisibility(0);
        this.f201002b = true;
    }

    /* renamed from: e */
    public void mo95870e(String str) {
        if (this.f201004d != null && !Util.isNullOrNil(str)) {
            if (!this.f201002b) {
                this.f201004d.setText(str);
            }
            this.f201004d.setVisibility(0);
            this.f201002b = true;
        }
    }
}
