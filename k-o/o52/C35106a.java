package o52;

import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import gy3.C87412m;

/* renamed from: o52.a */
public final class C35106a {

    /* renamed from: a */
    public final MagicBrushSclDemoView f94182a;

    public C35106a(MagicBrushSclDemoView magicBrushSclDemoView) {
        C87412m.m108594g(magicBrushSclDemoView, "frameSetView");
        this.f94182a = magicBrushSclDemoView;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35106a) && C87412m.m108589b(this.f94182a, ((C35106a) obj).f94182a);
    }

    public int hashCode() {
        return this.f94182a.hashCode();
    }

    public String toString() {
        return "BindEvent(frameSetView=" + this.f94182a + ')';
    }
}
