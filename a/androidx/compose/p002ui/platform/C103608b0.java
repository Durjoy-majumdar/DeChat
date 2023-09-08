package androidx.compose.p002ui.platform;

import android.os.Build;
import android.view.ActionMode;
import android.view.View;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import p1151s1.C110695a;
import p1151s1.C110696b;
import p1151s1.C110697c;
import p1166z0.C112541g;
import rx3.C13598b0;

/* renamed from: androidx.compose.ui.platform.b0 */
public final class C103608b0 implements C103709y1 {

    /* renamed from: a */
    public final View f306055a;

    /* renamed from: b */
    public ActionMode f306056b;

    /* renamed from: c */
    public final C110697c f306057c = new C110697c((C112541g) null, (C32224a) null, (C32224a) null, (C32224a) null, (C32224a) null, 31, (C8480h) null);

    /* renamed from: d */
    public C27934a2 f306058d = C27934a2.Hidden;

    public C103608b0(View view) {
        C87412m.m108594g(view, "view");
        this.f306055a = view;
    }

    /* renamed from: a */
    public void mo144712a(C112541g gVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32224a<C13598b0> aVar3, C32224a<C13598b0> aVar4) {
        C87412m.m108594g(gVar, "rect");
        C110697c cVar = this.f306057c;
        cVar.getClass();
        cVar.f331117a = gVar;
        C110697c cVar2 = this.f306057c;
        cVar2.f331118b = aVar;
        cVar2.f331120d = aVar3;
        cVar2.f331119c = aVar2;
        cVar2.f331121e = aVar4;
        ActionMode actionMode = this.f306056b;
        if (actionMode == null) {
            this.f306058d = C27934a2.Shown;
            this.f306056b = Build.VERSION.SDK_INT >= 23 ? C103711z1.f306299a.mo144870b(this.f306055a, new C110695a(this.f306057c), 1) : this.f306055a.startActionMode(new C110696b(cVar2));
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    public C27934a2 getStatus() {
        return this.f306058d;
    }

    public void hide() {
        this.f306058d = C27934a2.Hidden;
        ActionMode actionMode = this.f306056b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f306056b = null;
    }
}
