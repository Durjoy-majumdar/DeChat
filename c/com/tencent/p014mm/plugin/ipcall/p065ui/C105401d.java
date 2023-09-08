package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.text.Editable;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.d */
public class C105401d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105394b f313368d;

    public C105401d(C105394b bVar) {
        this.f313368d = bVar;
    }

    public void onClick(View view) {
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/DialPadController$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String obj = this.f313368d.f313339d.getText().toString();
        if (Util.isNullOrNil(obj)) {
            String charSequence = this.f313368d.f313338c.getText().toString();
            if (!Util.isNullOrNil(charSequence)) {
                String substring = charSequence.substring(0, charSequence.length() - 1);
                if (Util.isNullOrNil(substring) || substring.equals("+")) {
                    this.f313368d.f313338c.setText("+");
                    C105394b bVar = this.f313368d;
                    bVar.f313349n = "+";
                    bVar.f313355t = true;
                } else {
                    this.f313368d.f313338c.setText(substring);
                    this.f313368d.f313349n = substring;
                }
            }
        } else {
            int selectionStart = this.f313368d.f313339d.getSelectionStart();
            C105394b bVar2 = this.f313368d;
            if (!bVar2.f313358w || selectionStart - 1 < 0) {
                str = obj.substring(0, obj.length() - 1);
            } else {
                Editable text = bVar2.f313339d.getText();
                text.delete(i, selectionStart);
                str = text.toString();
            }
            if (!Util.isNullOrNil(str)) {
                String replace = this.f313368d.f313338c.getText().toString().replace("+", "");
                C105394b bVar3 = this.f313368d;
                if (bVar3.f313358w) {
                    bVar3.f313350o = bVar3.mo150124a(replace, str);
                    int length = this.f313368d.f313350o.length() - str.length();
                    C105394b bVar4 = this.f313368d;
                    bVar4.mo150128e(bVar4.f313350o, (selectionStart - 1) + length);
                } else {
                    bVar3.f313350o = bVar3.mo150124a(replace, str);
                    C105394b bVar5 = this.f313368d;
                    bVar5.mo150128e(bVar5.f313350o, -1);
                }
                this.f313368d.mo150125b();
            } else {
                C105394b bVar6 = this.f313368d;
                bVar6.f313350o = "";
                bVar6.mo150128e("", -1);
            }
            C105394b bVar7 = this.f313368d;
            bVar7.f313351p = "";
            bVar7.f313342g.setText("");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
