package p707tz;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C57465w;
import com.tencent.p014mm.plugin.vlog.model.C57467x;
import com.tencent.p014mm.plugin.vlog.model.C57468y;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d03.C58010a;
import di3.C7335d;
import ei2.C31606c;
import fy3.C32226l;
import java.util.List;
import org.json.JSONObject;
import r80.C63378g;
import rx3.C13598b0;
import sp3.C110807k;
import sp3.C36777d;
import te3.C64346ep3;
import te3.C64689rq2;
import te3.C64899zy;
import u23.C65003a;
import u23.C65005i;

/* renamed from: tz.f */
public interface C65000f extends C7335d {

    /* renamed from: tz.f$a */
    public static final class C65001a {
        /* renamed from: a */
        public static /* synthetic */ C57468y m76631a(C65000f fVar, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                return fVar.mo89171MF(str, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createVlogCompositionTrack");
        }
    }

    Bitmap D40(String str);

    /* renamed from: Fk */
    boolean mo89170Fk();

    /* renamed from: MF */
    C57468y mo89171MF(String str, boolean z);

    /* renamed from: Oj */
    RecordConfigProvider mo89172Oj();

    /* renamed from: Ol */
    RecordConfigProvider mo89173Ol(boolean z);

    void Oo0(String str);

    /* renamed from: Ov */
    JSONObject mo89175Ov(String str);

    /* renamed from: SM */
    int mo89176SM();

    /* renamed from: TB */
    boolean mo89177TB(String str, String str2);

    /* renamed from: Tj */
    int mo89178Tj();

    /* renamed from: Ue */
    C58010a mo89179Ue(C65003a aVar);

    /* renamed from: Wk */
    boolean mo89180Wk(C65003a aVar);

    /* renamed from: XD */
    void mo89181XD(ABAPrams aBAPrams);

    int Ye0();

    /* renamed from: Yp */
    C94554a mo89183Yp(String str);

    C110807k bo0(C64899zy zyVar, EffectManager effectManager, C31606c cVar, Rect rect, int i);

    /* renamed from: bt */
    C65003a mo89185bt(C57468y yVar);

    /* renamed from: bx */
    int mo89186bx();

    C63378g c20(String str, String str2, int i, String str3, Rect rect, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, long j2, boolean z, boolean z2, int i9, int i15, boolean z3, int i16, C32226l<? super Float, C13598b0> lVar, C32226l<? super String, C13598b0> lVar2, int i17, int i18);

    String ca0();

    /* renamed from: ec */
    void mo89189ec(Context context, String str, boolean z);

    /* renamed from: f3 */
    int mo89190f3(int i);

    /* renamed from: gp */
    C31606c mo89191gp(C64899zy zyVar);

    void hn0(String str);

    /* renamed from: i3 */
    String mo89193i3(String str);

    /* renamed from: iu */
    boolean mo89194iu(String str);

    C65003a jt0(C57468y yVar);

    /* renamed from: la */
    C57467x mo89196la(List<? extends C57468y> list);

    /* renamed from: mk */
    C65005i mo89197mk();

    /* renamed from: mn */
    C57463v mo89198mn();

    C36777d mv0(C64689rq2 rq22, int i, int i2, Object obj);

    /* renamed from: py */
    void mo89200py(String str);

    /* renamed from: rK */
    C65005i mo89201rK();

    void su0(String str);

    C94554a tg0(String str);

    /* renamed from: uV */
    C65003a mo89204uV(C58010a aVar);

    void uw0(String str);

    boolean vm0(boolean z, long j);

    /* renamed from: wN */
    C57465w mo89207wN(C57467x xVar);

    /* renamed from: wj */
    boolean mo89208wj(String str);

    /* renamed from: x8 */
    void mo89209x8(C64346ep3 ep32, Rect rect);
}
