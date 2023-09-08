package gn1;

import android.content.DialogInterface;
import cc2.C67350b;
import com.tencent.p014mm.plugin.finder.nearby.person.NearbyPersonV1UIC;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C89137b0;

/* renamed from: gn1.h */
public final class C75998h implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ NearbyPersonV1UIC f222853d;

    public C75998h(NearbyPersonV1UIC nearbyPersonV1UIC) {
        this.f222853d = nearbyPersonV1UIC;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C89137b0 d = C86709a0.m107524d();
        C67350b bVar = this.f222853d.f222831e;
        C87412m.m108592e(bVar, "null cannot be cast to non-null type com.tencent.mm.modelbase.NetSceneBase");
        d.mo123458d((C117747y) bVar);
    }
}
