package o52;

import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import gy3.C87412m;

/* renamed from: o52.c */
public final class C35107c {

    /* renamed from: a */
    public final MagicBrushSclDemoView f94183a;

    public C35107c(MagicBrushSclDemoView magicBrushSclDemoView) {
        C87412m.m108594g(magicBrushSclDemoView, "frameSetView");
        this.f94183a = magicBrushSclDemoView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35107c) && C87412m.m108589b(this.f94183a, ((C35107c) obj).f94183a);
    }

    public int hashCode() {
        return this.f94183a.hashCode();
    }

    public String toString() {
        return "InitEvent(frameSetView=" + this.f94183a + ')';
    }
}
