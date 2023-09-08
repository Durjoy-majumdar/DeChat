package im0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import im0.C87754e;
import p225rc.C89917h;

public class e$b$$e implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C84967l0 f254074d;

    /* renamed from: e */
    public final /* synthetic */ C87754e.C87757c f254075e;

    /* renamed from: f */
    public final /* synthetic */ C87754e.C87756b f254076f;

    public e$b$$e(C87754e.C87756b bVar, C84967l0 l0Var, C87754e.C87757c cVar) {
        this.f254076f = bVar;
        this.f254074d = l0Var;
        this.f254075e = cVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C89917h.m112458a(this.f254076f.f254052e.getContext());
        C84967l0 l0Var = this.f254074d;
        if (l0Var != null) {
            l0Var.mo117847e(this.f254075e);
        }
    }
}
