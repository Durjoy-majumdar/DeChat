package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import com.tencent.p014mm.storage.C19623o0;
import s90.C77630j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.b4 */
public class C18217b4 extends C18349r3 {

    /* renamed from: B */
    public View f50357B;

    /* renamed from: C */
    public View f50358C;

    /* renamed from: D */
    public View[] f50359D = new View[4];

    /* renamed from: c */
    public void mo22830c(C19623o0 o0Var, C77630j jVar, View view, TextView textView, int i) {
        super.mo22830c(o0Var, jVar, view, textView, i);
        textView.setTextColor(this.f50824c.getResources().getColor(C0966R.color.al_));
        String string = this.f50824c.getResources().getString(C0966R.string.f360196aq3);
        this.f50827f.setContentDescription(String.format(string, new Object[]{this.f50814v.mo154968a(), textView.getText(), jVar.f226311C + ""}));
    }

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        ViewStub viewStub;
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9m)) != null) {
            viewStub.inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.adr);
            this.f50827f = view.findViewById(C0966R.C0970id.b5s);
            this.f50359D[0] = this.f50826e.findViewById(C0966R.C0970id.hwa);
            this.f50359D[1] = this.f50826e.findViewById(C0966R.C0970id.hwc);
            this.f50359D[2] = this.f50826e.findViewById(C0966R.C0970id.hwb);
            this.f50359D[3] = this.f50826e.findViewById(C0966R.C0970id.hw_);
            mo22915h();
            TextView textView = (TextView) this.f50826e.findViewById(C0966R.C0970id.hwd);
            ImageView imageView = (ImageView) this.f50826e.findViewById(C0966R.C0970id.hw9);
            this.f50806n = (ImageView) this.f50826e.findViewById(C0966R.C0970id.i1x);
            this.f50357B = this.f50826e.findViewById(C0966R.C0970id.b8b);
            this.f50358C = this.f50826e.findViewById(C0966R.C0970id.aec);
            this.f50812t = (LinearLayout) this.f50826e.findViewById(C0966R.C0970id.jml);
            this.f50814v = (MMNeat7extView) this.f50826e.findViewById(C0966R.C0970id.jmf);
        }
    }
}
