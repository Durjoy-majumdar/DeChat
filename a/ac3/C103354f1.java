package ac3;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.xeffect.WeEffectRender;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import q00.C110264g;
import q00.C12024e;
import rx3.C13598b0;
import sx3.C36907w;
import u80.C111139a;

/* renamed from: ac3.f1 */
public final class C103354f1 extends C87413o implements C32226l<IntBuffer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C103355g1 f304768d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103354f1(C103355g1 g1Var) {
        super(1);
        this.f304768d = g1Var;
    }

    public Object invoke(Object obj) {
        Object obj2;
        IntBuffer intBuffer = (IntBuffer) obj;
        C87412m.m108594g(intBuffer, LocaleUtil.ITALIAN);
        C103355g1 g1Var = this.f304768d;
        C111139a aVar = g1Var.f304796p;
        int i = aVar.f332768w;
        int i2 = aVar.f332769x;
        long j = g1Var.f304784d;
        if (j != 0) {
            if (j != 0 ? WeEffectRender.nNeedFaceTrack(j) : false) {
                if (!(g1Var.f304799s == i && g1Var.f304800t == i2)) {
                    g1Var.f304799s = i;
                    g1Var.f304800t = i2;
                }
                long currentTicks = Util.currentTicks();
                C103360i1 i1Var = g1Var.f304776E;
                i1Var.getClass();
                i1Var.f304815h = Util.currentTicks();
                LinkedList<C54008d0> linkedList = g1Var.f304779H;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (C54008d0 j2 : linkedList) {
                    arrayList.add(Integer.valueOf(j2.mo74672j()));
                }
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    obj2 = null;
                } else {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = Integer.valueOf(((Number) next).intValue() | ((Number) it.next()).intValue());
                    }
                    obj2 = next;
                }
                Integer num = (Integer) obj2;
                int intValue = (num != null ? num.intValue() : 0) | g1Var.f304787g;
                C110264g.C47730a aVar2 = C110264g.C47730a.APP_LIVEVLOG;
                String yl02 = ((C12024e) C86312j.m106911c(C12024e.class)).yl0(aVar2, "FaceMakeUpLevel");
                boolean z = !(yl02 == null || yl02.length() == 0) && Util.safeParseFloat(yl02) == 1.0f;
                C110264g.C47730a aVar3 = g1Var.f304783c;
                if (!(aVar3 == aVar2 || aVar3 == C110264g.C47730a.APP_LIVEVLOG_HIGHRANK) || !z) {
                    intValue &= -32769;
                }
                int i3 = g1Var.f304778G ? intValue | 64 : intValue & -65;
                int nFaceTrackWithAngle = WeEffectRender.nFaceTrackWithAngle(g1Var.f304784d, intBuffer, i, i2, (long) i3, g1Var.f304797q);
                C103360i1 i1Var2 = g1Var.f304776E;
                i1Var2.f304810c++;
                i1Var2.f304809b += Util.ticksToNow(i1Var2.f304815h);
                Log.m105918d("MicroMsg.XLabEffect", "faceTrack: " + i + ", " + i2 + ' ' + i3 + ", " + nFaceTrackWithAngle + ", cost:" + Util.ticksToNow(currentTicks));
                g1Var.f304801u = nFaceTrackWithAngle == 0;
            } else {
                g1Var.f304801u = true;
                Log.m105918d("MicroMsg.XLabEffect", "faceTrack: no need face track " + g1Var.f304802v);
            }
        }
        return C13598b0.f38549a;
    }
}
