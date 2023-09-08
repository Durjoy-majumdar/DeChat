package k23;

import ai2.C92007a;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.vlog.model.C96556t0;
import com.tencent.p014mm.plugin.vlog.model.C96557v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import k23.C99090a;
import pe3.C89349b;
import rx3.C13598b0;
import sf0.C48374j0;
import te3.C101773e70;
import te3.C101781gb0;
import te3.C64339ea;
import te3.mp4;

/* renamed from: k23.c */
public final class C99094c extends C87413o implements C32229r<String, String, Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99090a f290562d;

    /* renamed from: e */
    public final /* synthetic */ int f290563e;

    /* renamed from: f */
    public final /* synthetic */ int f290564f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99094c(C99090a aVar, int i, int i2) {
        super(4);
        this.f290562d = aVar;
        this.f290563e = i;
        this.f290564f = i2;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ((Number) obj4).intValue();
        C87412m.m108594g((String) obj, "<anonymous parameter 0>");
        C87412m.m108594g(str, "thumbPath");
        Log.m105924i("MicroMsg.VLogGenerateManager", "getThumbBitmap ret:" + booleanValue + "  thumbPath:" + str);
        C101781gb0 gb02 = new C101781gb0();
        C99090a aVar = this.f290562d;
        gb02.f298299o = aVar.f290551f.f282602c;
        gb02.f298300p = str;
        gb02.f298302r = 1;
        gb02.f298303s = aVar.f290548c.f272905F;
        VideoMixer.MixConfig mixConfig = new VideoMixer.MixConfig();
        C96556t0 t0Var = this.f290562d.f290551f;
        mixConfig.f272879g = t0Var.f282606g;
        mixConfig.f272876d = t0Var.f282603d;
        mixConfig.f272877e = t0Var.f282604e;
        mixConfig.f272878f = t0Var.f282605f;
        mixConfig.f272880h = t0Var.f282609j;
        mixConfig.f272881i = t0Var.f282610k;
        mixConfig.f272882j = t0Var.f282607h;
        mixConfig.f272883n = 0;
        C101773e70 e702 = new C101773e70();
        e702.f298159e = 0;
        C99090a aVar2 = this.f290562d;
        C96556t0 t0Var2 = aVar2.f290551f;
        e702.f298160f = (long) t0Var2.f282600a;
        e702.f298162h = t0Var2.f282601b;
        e702.f298163i = str;
        C96557v0 v0Var = aVar2.f290547b;
        e702.f298166o = v0Var.f282613c;
        e702.f298167p = false;
        float[] fArr = v0Var.f282617g;
        e702.f298169r = (int) fArr[0];
        e702.f298171t = (int) fArr[1];
        e702.f298170s = (int) fArr[2];
        e702.f298172u = (int) fArr[3];
        for (C92007a aVar3 : v0Var.f282616f) {
            C64339ea eaVar = new C64339ea();
            eaVar.f182947d = aVar3.f263402a.f263445d;
            eaVar.f182948e = C48374j0.m53712a(aVar3.toProtoBuf().toByteArray());
            e702.f298173v.add(eaVar);
        }
        e702.f298176y = false;
        e702.f298161g = "";
        e702.f298158d = "";
        mp4 mp4 = new mp4();
        mp4.f138148e = this.f290563e;
        mp4.f138149f = this.f290564f;
        C96557v0 v0Var2 = this.f290562d.f290547b;
        mp4.f138147d = v0Var2.f282614d;
        if (TextUtils.isEmpty(v0Var2.f282613c)) {
            e702.f298153E = C89349b.m111674a(mp4.toByteArray());
            C99090a.m129047a(this.f290562d, e702, mixConfig, gb02);
            ((C99090a.C99092b) this.f290562d.f290553h).mo162I("", "", Boolean.FALSE, 4);
        } else {
            C99090a aVar4 = this.f290562d;
            aVar4.f290549d.mo85939a(aVar4.f290547b.f282613c, new C99093b(aVar4, mp4, e702, mixConfig, gb02));
        }
        return C13598b0.f38549a;
    }
}
