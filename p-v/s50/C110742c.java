package s50;

import com.tencent.p014mm.autogen.mmdata.rpt.WeVisionBaseDataStruct;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p80.C110194c;
import q00.C110264g;
import q00.C110268h;

/* renamed from: s50.c */
public final class C110742c {

    /* renamed from: a */
    public int f331208a;

    /* renamed from: b */
    public C110194c f331209b;

    /* renamed from: c */
    public int f331210c;

    /* renamed from: d */
    public int f331211d;

    /* renamed from: e */
    public C110264g f331212e;

    /* renamed from: f */
    public int f331213f = -1;

    /* renamed from: g */
    public boolean f331214g;

    /* renamed from: a */
    public final void mo162263a(int i) {
        if (i == 0) {
            C110264g gVar = this.f331212e;
            C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.feature.xlabeffect.api.IXLabEffectReport");
            WeVisionBaseDataStruct c = ((C110268h) gVar).mo143235c();
            if (c != null) {
                c.f194705d = 3;
            }
        } else if (i == 1) {
            C110264g gVar2 = this.f331212e;
            C87412m.m108592e(gVar2, "null cannot be cast to non-null type com.tencent.mm.feature.xlabeffect.api.IXLabEffectReport");
            WeVisionBaseDataStruct c2 = ((C110268h) gVar2).mo143235c();
            if (c2 != null) {
                c2.f194705d = 0;
            }
        } else {
            C110264g gVar3 = this.f331212e;
            C87412m.m108592e(gVar3, "null cannot be cast to non-null type com.tencent.mm.feature.xlabeffect.api.IXLabEffectReport");
            WeVisionBaseDataStruct c3 = ((C110268h) gVar3).mo143235c();
            if (c3 != null) {
                c3.f194705d = -1;
            }
        }
    }

    /* renamed from: b */
    public final void mo162264b(C36624a aVar) {
        C87412m.m108594g(aVar, "beautyConfig");
        Log.m105924i("MicroMsg.LiveFilterProcessTex", "#updateBeautyConfig beautyConfig=" + aVar);
        C110264g gVar = this.f331212e;
        if (gVar != null) {
            XEffectConfig xEffectConfig = new XEffectConfig();
            Integer num = aVar.f97362a.get(0);
            int i = -1;
            xEffectConfig.f318443g = num == null ? -1 : num.intValue();
            Integer num2 = aVar.f97362a.get(4);
            xEffectConfig.f318444h = num2 == null ? -1 : num2.intValue();
            Integer num3 = aVar.f97362a.get(1);
            xEffectConfig.f318445i = num3 == null ? -1 : num3.intValue();
            Integer num4 = aVar.f97362a.get(2);
            xEffectConfig.f318446j = num4 == null ? -1 : num4.intValue();
            Integer num5 = aVar.f97362a.get(5);
            xEffectConfig.f318447n = num5 == null ? -1 : num5.intValue();
            Integer num6 = aVar.f97362a.get(3);
            xEffectConfig.f318448o = num6 == null ? -1 : num6.intValue();
            Integer num7 = aVar.f97362a.get(6);
            xEffectConfig.f318449p = num7 == null ? -1 : num7.intValue();
            Integer num8 = aVar.f97362a.get(7);
            xEffectConfig.f318450q = num8 == null ? -1 : num8.intValue();
            Integer num9 = aVar.f97362a.get(8);
            xEffectConfig.f318451r = num9 == null ? -1 : num9.intValue();
            Integer num10 = aVar.f97362a.get(9);
            xEffectConfig.f318452s = num10 == null ? -1 : num10.intValue();
            Integer num11 = aVar.f97362a.get(10);
            xEffectConfig.f318453t = num11 == null ? -1 : num11.intValue();
            Integer num12 = aVar.f97362a.get(11);
            xEffectConfig.f318454u = num12 == null ? -1 : num12.intValue();
            Integer num13 = aVar.f97362a.get(12);
            xEffectConfig.f318455v = num13 == null ? -1 : num13.intValue();
            Integer num14 = aVar.f97362a.get(13);
            xEffectConfig.f318456w = num14 == null ? -1 : num14.intValue();
            Integer num15 = aVar.f97362a.get(14);
            xEffectConfig.f318432B = num15 == null ? -1 : num15.intValue();
            Integer num16 = aVar.f97362a.get(15);
            int intValue = num16 == null ? -1 : num16.intValue();
            if (intValue <= 0) {
                xEffectConfig.f318458y = 0;
                xEffectConfig.f318457x = -intValue;
            } else {
                xEffectConfig.f318457x = 0;
                xEffectConfig.f318458y = intValue;
            }
            Integer num17 = aVar.f97362a.get(16);
            xEffectConfig.f318435E = num17 == null ? -1 : num17.intValue();
            Integer num18 = aVar.f97362a.get(17);
            int intValue2 = num18 == null ? -1 : num18.intValue();
            if (intValue2 <= 0) {
                xEffectConfig.f318459z = 0;
                xEffectConfig.f318431A = -intValue2;
            } else {
                xEffectConfig.f318431A = 0;
                xEffectConfig.f318459z = intValue2;
            }
            Integer num19 = aVar.f97362a.get(18);
            xEffectConfig.f318433C = num19 == null ? -1 : num19.intValue();
            Integer num20 = aVar.f97362a.get(19);
            xEffectConfig.f318434D = num20 == null ? -1 : num20.intValue();
            Integer num21 = aVar.f97362a.get(20);
            xEffectConfig.f318436F = num21 == null ? -1 : num21.intValue();
            Integer num22 = aVar.f97362a.get(21);
            if (num22 != null) {
                i = num22.intValue();
            }
            xEffectConfig.f318437G = i;
            gVar.mo143252s(xEffectConfig);
        }
    }
}
