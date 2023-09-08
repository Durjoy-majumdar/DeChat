package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105408f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import p12.C47423m;
import q12.C35759c;
import te3.nx4;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.h0 */
public class C105416h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C105408f0 f313418d;

    public C105416h0(C105408f0 f0Var) {
        this.f313418d = f0Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105408f0 f0Var = this.f313418d;
        int i = f0Var.f313390e;
        int i2 = f0Var.f313404v;
        LinkedList linkedList = new LinkedList();
        if (i2 != 3) {
            String trim = f0Var.f313377A.getText().toString().trim();
            if (!Util.isNullOrNil(trim)) {
                nx4 nx4 = new nx4();
                nx4.f138822d = 0;
                nx4.f138823e = trim;
                linkedList.add(nx4);
            }
            ArrayList<C105408f0.C105410b> arrayList2 = f0Var.f313382F;
            if (arrayList2 != null) {
                Iterator<C105408f0.C105410b> it = arrayList2.iterator();
                while (it.hasNext()) {
                    C105408f0.C105410b next = it.next();
                    if (next.f313412c) {
                        nx4 nx42 = new nx4();
                        try {
                            nx42.f138822d = Util.getInt(next.f313410a, 0);
                            linkedList.add(nx42);
                        } catch (NumberFormatException unused) {
                            Log.m105920e("MicroMsg.IPCallFeedbackDialog", "getFeedbackList error, id = " + next.f313410a);
                        }
                    }
                }
            }
        }
        C97625j3.m125815e().mo123460f(new C47423m(i, i2, linkedList));
        if (f0Var.f313404v == 3) {
            f0Var.mo150144e(2);
        } else {
            f0Var.hide();
            f0Var.f313383G.postDelayed(new C105427l0(f0Var), 1800);
            C75026b.m89951a(f0Var.f313392g, f0Var.f313393h.getString(C0966R.string.fw5));
            int i3 = f0Var.f313404v;
            C35759c.m40827a(1, -1, i3, f0Var.mo150143d(i3), 0, -1, -1, f0Var.f313390e, f0Var.f313391f);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
