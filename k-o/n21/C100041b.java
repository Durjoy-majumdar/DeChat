package n21;

import android.view.View;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import p21.C100616a;
import p21.C100618c;

/* renamed from: n21.b */
public class C100041b extends C100047f {
    public C100041b(View view, C93083b bVar) {
        super(view, bVar);
        this.f293082E.setVisibility(0);
        this.f293079B.setVisibility(8);
        this.f293087J.setVisibility(8);
        this.f293082E.setTag(this);
        this.f293082E.setOnClickListener(this.f293093Q);
    }

    /* renamed from: y */
    public int mo139367y() {
        return 5;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        C100618c cVar = (C100618c) aVar;
        this.f293085H.setImageResource(C93693r.m118403d(cVar.f294822u));
        this.f293083F.setText(cVar.f294820s);
        this.f293084G.setText(cVar.f294821t);
        super.mo139368z(aVar, i, i2);
    }
}
