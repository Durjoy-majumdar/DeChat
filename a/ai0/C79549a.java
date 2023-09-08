package ai0;

import android.view.View;
import bt0.b$$j;
import gy3.C87412m;
import qq0.C89796d;

/* renamed from: ai0.a */
public final class C79549a implements b$$j {

    /* renamed from: d */
    public final /* synthetic */ C79550b f233264d;

    public C79549a(C79550b bVar) {
        this.f233264d = bVar;
    }

    /* renamed from: a */
    public void mo109609a(int i) {
        C89796d dVar = this.f233264d.f233266e;
        if (dVar != null) {
            dVar.setStyleColor(i);
        } else {
            C87412m.m108603p("capsuleBarImplView");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo109610b(View.OnClickListener onClickListener) {
        C89796d dVar = this.f233264d.f233266e;
        if (dVar != null) {
            dVar.setHomeButtonOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("capsuleBarImplView");
            throw null;
        }
    }

    /* renamed from: c */
    public void mo109611c(View.OnClickListener onClickListener) {
        C89796d dVar = this.f233264d.f233266e;
        if (dVar != null) {
            dVar.setOptionButtonOnClickListener(onClickListener);
        } else {
            C87412m.m108603p("capsuleBarImplView");
            throw null;
        }
    }

    /* renamed from: d */
    public void mo109612d(int i) {
        C89796d dVar = this.f233264d.f233266e;
        if (dVar != null) {
            dVar.setVisibility(i);
        } else {
            C87412m.m108603p("capsuleBarImplView");
            throw null;
        }
    }
}
