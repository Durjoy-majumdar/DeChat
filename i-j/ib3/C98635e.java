package ib3;

import android.view.View;
import bb3.C92221d;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import xa3.C102587c;
import xa3.C102588d;

/* renamed from: ib3.e */
public class C98635e extends C98648o {
    public C98635e(View view, C96679b bVar, C92221d dVar) {
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
        return 5;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        C102588d dVar = (C102588d) cVar;
        this.f289240H.setImageResource(C93693r.m118403d(dVar.f302129u));
        this.f289238F.setText(dVar.f302127s);
        this.f289239G.setText(dVar.f302128t);
        super.mo138059z(cVar, i, i2);
    }
}
