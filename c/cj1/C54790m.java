package cj1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import dj1.C45403z0;
import gy3.C87412m;
import o40.C61926c;
import te3.C49675h91;

/* renamed from: cj1.m */
public final class C54790m implements C45403z0.C45404a {

    /* renamed from: a */
    public final /* synthetic */ boolean f153596a;

    /* renamed from: b */
    public final /* synthetic */ C54769i f153597b;

    public C54790m(boolean z, C54769i iVar) {
        this.f153596a = z;
        this.f153597b = iVar;
    }

    /* renamed from: a */
    public void mo70904a(int i, int i2, String str, C49675h91 h912) {
        C87412m.m108594g(h912, "resp");
        if (!this.f153596a) {
            this.f153597b.mo75675d(false);
        } else if (i == 0 && i2 == 0) {
            C54769i iVar = this.f153597b;
            if (iVar.f153505c == 4) {
                C56032b bVar = iVar.f153504b;
                Context context = bVar != null ? bVar.getContext() : null;
                if (context != null) {
                    C61926c.m72668M(new C54797o(context, iVar));
                    return;
                }
                return;
            }
            C61926c.m72668M(new C54793n(iVar));
        }
    }
}
