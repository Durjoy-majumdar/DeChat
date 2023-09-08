package uc1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostPagePreviewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import i23.C98592b;
import i23.C98593c;
import p707tz.C65002h;

@C86522b
/* renamed from: uc1.z */
public final class C101997z extends C86301e implements C65002h {
    /* renamed from: Gv */
    public int mo89210Gv() {
        return 3;
    }

    /* renamed from: dH */
    public void mo89211dH(VideoCompositionPerformanceStruct videoCompositionPerformanceStruct, String str) {
        C87412m.m108594g(videoCompositionPerformanceStruct, "struct");
        C98593c.f289086a.mo137981d(videoCompositionPerformanceStruct, str);
    }

    /* renamed from: hE */
    public int mo89212hE() {
        return 2;
    }

    /* renamed from: hQ */
    public void mo89213hQ(String str) {
        C87412m.m108594g(str, "key");
        C98593c.f289086a.mo137979b(str);
    }

    public int j50() {
        return 1;
    }

    /* renamed from: pm */
    public void mo89215pm() {
        FinderPostPagePreviewStruct finderPostPagePreviewStruct = C98592b.f289085a;
        C98592b.f289085a = new FinderPostPagePreviewStruct();
    }

    public VideoCompositionPerformanceStruct s30(String str) {
        C87412m.m108594g(str, "key");
        return C98593c.f289086a.mo137980c(str);
    }

    /* renamed from: ug */
    public void mo89217ug(int i, int i2) {
        FinderPostPagePreviewStruct finderPostPagePreviewStruct = C98592b.f289085a;
        FinderPostPagePreviewStruct finderPostPagePreviewStruct2 = C98592b.f289085a;
        finderPostPagePreviewStruct2.f265593i = (long) i;
        finderPostPagePreviewStruct2.f265594j = (long) i2;
        finderPostPagePreviewStruct2.mo86054n();
    }
}
