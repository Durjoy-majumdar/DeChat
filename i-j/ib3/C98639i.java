package ib3;

import android.view.View;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import xa3.C102587c;
import xa3.C102591g;

/* renamed from: ib3.i */
public class C98639i extends C98648o {
    public C98639i(View view, C96679b bVar, C92221d dVar) {
        super(view, bVar, dVar);
        this.f289237E.setVisibility(0);
        this.f289234B.setVisibility(8);
        this.f289242J.setVisibility(8);
        this.f289237E.setTag(this);
        this.f289237E.setOnClickListener(this.f289249R);
    }

    /* renamed from: B */
    public View mo138062B() {
        return this.f289240H;
    }

    /* renamed from: y */
    public int mo138058y() {
        return 3;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        this.f289240H.setImageResource(C0966R.raw.app_attach_file_icon_location);
        C102591g gVar = (C102591g) cVar;
        this.f289238F.setText(gVar.f302118s);
        this.f289239G.setText(gVar.f302122w);
        super.mo138059z(cVar, i, i2);
    }
}
