package p547hb;

import android.graphics.Bitmap;
import com.tencent.luggage.game.page.C80211b;
import fy3.C32226l;
import p169ib.C87685a;

/* renamed from: hb.g$$b */
public final /* synthetic */ class g$$b implements C32226l {

    /* renamed from: d */
    public final /* synthetic */ C80211b f253453d;

    /* renamed from: e */
    public final /* synthetic */ C87685a f253454e;

    /* renamed from: f */
    public final /* synthetic */ boolean f253455f;

    /* renamed from: g */
    public final /* synthetic */ boolean f253456g;

    public /* synthetic */ g$$b(C80211b bVar, C87685a aVar, boolean z, boolean z2) {
        this.f253453d = bVar;
        this.f253454e = aVar;
        this.f253455f = z;
        this.f253456g = z2;
    }

    public final Object invoke(Object obj) {
        C80211b bVar = this.f253453d;
        C87685a aVar = this.f253454e;
        boolean z = this.f253455f;
        boolean z2 = this.f253456g;
        Bitmap bitmap = (Bitmap) obj;
        bVar.f234774o = bitmap;
        if (bitmap != null || aVar == null) {
            bVar.mo111259h0(z, z2);
            return null;
        }
        aVar.mo9700a(bVar.mo116498d0(), new g$$e(bVar, z, z2));
        return null;
    }
}
