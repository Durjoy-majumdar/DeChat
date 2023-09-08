package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import org.json.JSONObject;
import p278yh.C102863s;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.l */
public final class C94455l extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RepairerSerializeClassDemoUI f273110d;

    /* renamed from: e */
    public final /* synthetic */ JSONObject f273111e;

    /* renamed from: f */
    public final /* synthetic */ String f273112f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94455l(RepairerSerializeClassDemoUI repairerSerializeClassDemoUI, JSONObject jSONObject, String str) {
        super(0);
        this.f273110d = repairerSerializeClassDemoUI;
        this.f273111e = jSONObject;
        this.f273112f = str;
    }

    public Object invoke() {
        C102863s sVar = (C102863s) ((C36570n) this.f273110d.f273094d).getValue();
        if (sVar.f303624b == null) {
            sVar.f303624b = (TextView) sVar.f303623a.findViewById(C0966R.C0970id.nws);
        }
        TextView textView = sVar.f303624b;
        textView.setText("jsonTrim: \n" + this.f273111e);
        C102863s sVar2 = (C102863s) ((C36570n) this.f273110d.f273094d).getValue();
        if (sVar2.f303625c == null) {
            sVar2.f303625c = (TextView) sVar2.f303623a.findViewById(C0966R.C0970id.o0b);
        }
        TextView textView2 = sVar2.f303625c;
        textView2.setText("xmlTrim: \n" + this.f273112f);
        return C13598b0.f38549a;
    }
}
