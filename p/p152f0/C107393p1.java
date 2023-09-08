package p152f0;

import com.google.android.gms.common.internal.Constants;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C8480h;
import gy3.C87412m;
import iy3.C60641c;
import p146e2.C107159c;
import p146e2.C107160d;
import p451b2.C104014i;
import p560i2.C108321c;
import p560i2.C108322d;
import p560i2.C108329n;
import p735w1.C111705z;
import sx3.C64186f0;
import z04.C112551y;

/* renamed from: f0.p1 */
public final class C107393p1 {

    /* renamed from: a */
    public static final String f321312a = C112551y.m153813m("H", 10);

    /* renamed from: a */
    public static final long m145499a(C111705z zVar, C108322d dVar, C104014i.C104015a aVar, String str, int i) {
        C111705z zVar2 = zVar;
        C87412m.m108594g(zVar2, "style");
        C108322d dVar2 = dVar;
        C87412m.m108594g(dVar2, Constants.PARAM_DENSITY);
        C104014i.C104015a aVar2 = aVar;
        C87412m.m108594g(aVar2, "fontFamilyResolver");
        String str2 = str;
        C87412m.m108594g(str2, MimeTypes.BASE_TYPE_TEXT);
        C64186f0 f0Var = C64186f0.f181907d;
        long b = C108321c.m146705b(0, 0, 0, 0, 15, (Object) null);
        C107160d dVar3 = new C107160d(str2, zVar2, f0Var, f0Var, aVar2, dVar2);
        return C108329n.m146743a(C60641c.m70921b((float) Math.ceil((double) dVar3.mo157587c())), C60641c.m70921b((float) Math.ceil((double) new C107159c(dVar3, i, false, b, (C8480h) null).getHeight())));
    }
}
