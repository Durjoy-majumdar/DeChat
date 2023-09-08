package cn1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Set;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9499g;
import xm1.C15826d;

/* renamed from: cn1.z */
public final class C0891z extends C9499g<C9493c> {

    /* renamed from: a */
    public final /* synthetic */ C60905o f2105a;

    public C0891z(C60905o oVar) {
        this.f2105a = oVar;
    }

    /* renamed from: b */
    public void mo752b(Set<C9494d<C9493c>> set) {
        C87412m.m108594g(set, "recordsSet");
        Log.m105924i("Finder.LiveTabJumpersListConvert", "onExposeTimeRecorded: size = " + set.size());
        C15826d dVar = C15826d.f42633a;
        Context context = this.f2105a.f44854d.getContext();
        C87412m.m108593f(context, "holder.itemView.context");
        dVar.mo14505a(context, set);
    }

    /* renamed from: c */
    public void mo753c(C9494d<C9493c> dVar) {
        C87412m.m108594g(dVar, "item");
    }
}
