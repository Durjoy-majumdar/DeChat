package p527ft;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.modelimage.C68118i0;
import com.tencent.p014mm.modelimage.C92805a0;
import com.tencent.p014mm.modelimage.C92819d;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelimage.C92845m0;
import com.tencent.p014mm.modelimage.C92848n0;
import com.tencent.p014mm.modelimage.C92850p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import ob0.C47355o;
import p158gt.C76051j;
import p158gt.C76053l;
import p158gt.C76054m;
import p158gt.C76055o;
import p158gt.C76056u;
import p158gt.C76057w;
import p158gt.C8451i;
import p158gt.C98201k;
import p158gt.C98203p;
import zt3.C119157j;

@C86522b
/* renamed from: ft.c */
public class C97977c extends C86301e implements C76057w, C8451i, C98201k, C76053l {
    /* renamed from: AW */
    public C76056u mo137272AW() {
        return C68118i0.m80524a();
    }

    /* renamed from: CF */
    public C98203p mo137273CF(long j, long j2, int i, C47355o oVar) {
        return new C92805a0(j, j2, i, oVar);
    }

    /* renamed from: FL */
    public void mo106264FL(String str, C76057w.C76058a aVar) {
        C92850p0 Cx0 = C92837k0.Cx0();
        Cx0.getClass();
        if (MMHandlerThread.isMainThread()) {
            Cx0.mo127217b(str, aVar);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C92848n0(Cx0, str, aVar));
    }

    /* renamed from: Hm */
    public void mo106265Hm(String str, String str2, C76057w.C76058a aVar) {
        C92850p0 Cx0 = C92837k0.Cx0();
        Cx0.getClass();
        if (MMHandlerThread.isMainThread()) {
            Cx0.mo127218d(str, str2, aVar);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C92845m0(Cx0, str, str2, aVar));
    }

    public C76051j Jp0() {
        return C92837k0.yx0();
    }

    /* renamed from: SO */
    public void mo9372SO(String str) {
        C92819d wx02 = C92837k0.wx0();
        wx02.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.CdnImageService", "stop load fail, url is empty");
        } else {
            wx02.f267307a.remove(str);
        }
    }

    /* renamed from: ZL */
    public C76055o mo137275ZL() {
        return C92837k0.Ax0();
    }

    public void bb0(String str, boolean z, C8451i.C8452a aVar) {
        C92837k0.wx0().mo127093a(str, z, aVar);
    }

    public Bitmap get(String str) {
        return C92837k0.wx0().mo127094b(str);
    }

    public void h60(String str, C76057w.C76058a aVar) {
        C92850p0 Cx0 = C92837k0.Cx0();
        Cx0.getClass();
        if (MMHandlerThread.isMainThread()) {
            Cx0.mo127218d(str, "", aVar);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C92845m0(Cx0, str, "", aVar));
    }

    /* renamed from: jD */
    public C92836k mo106261jD(C92836k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.mo127145p() ? C92837k0.Bx0().mo127173TO(kVar.f267390q) : kVar;
    }

    /* renamed from: mT */
    public void mo9375mT(String str, C8451i.C8452a aVar) {
        C92837k0.wx0().mo127093a(str, true, aVar);
    }

    public void pp0(Bitmap bitmap, ImageView imageView) {
        C92839m.C92841b.m117104a(bitmap, imageView);
    }

    /* renamed from: xi */
    public C76054m mo137277xi() {
        return C92837k0.Bx0();
    }

    /* renamed from: xq */
    public void mo9376xq(String str, Bitmap bitmap) {
        C92837k0.wx0().mo127095c(str, bitmap);
    }

    /* renamed from: y8 */
    public String mo106262y8(C92836k kVar) {
        return kVar == null ? "" : kVar.mo127145p() ? C92837k0.Bx0().mo127173TO(kVar.f267390q).f267378e : kVar.f267378e;
    }
}
