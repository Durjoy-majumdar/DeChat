package com.tencent.p014mm.plugin.expt.p472ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import la1.C61259e;

/* renamed from: com.tencent.mm.plugin.expt.ui.s */
public class C55654s extends ArrayAdapter {

    /* renamed from: d */
    public final /* synthetic */ KvInfoUI f158388d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55654s(KvInfoUI kvInfoUI, Context context, int i, int i2) {
        super(context, i, i2);
        this.f158388d = kvInfoUI;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        C61259e eVar = (C61259e) this.f158388d.f158371f.getItem(i);
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.fgo);
        if (eVar == null || !eVar.f174357d) {
            textView.setBackgroundResource(C0966R.color.ahf);
        } else {
            textView.setBackgroundResource(C0966R.color.akw);
        }
        return view2;
    }
}
