package u50;

import android.graphics.Rect;
import android.view.View;
import com.tencent.p014mm.view.ratio.RatioLayout;
import gy3.C87412m;
import iq3.C60600b;
import java.util.ArrayList;
import v50.C65547a;

/* renamed from: u50.c */
public final class C65214c extends C60600b<C65547a> {

    /* renamed from: b */
    public final C65213b f187734b;

    /* renamed from: c */
    public ArrayList<C65547a> f187735c = new ArrayList<>();

    public C65214c(C65213b bVar) {
        C87412m.m108594g(bVar, "adapter");
        this.f187734b = bVar;
        new Rect();
    }

    /* renamed from: a */
    public int mo85553a() {
        return this.f187735c.size();
    }

    /* renamed from: b */
    public Object mo85554b(int i) {
        C65547a aVar = this.f187735c.get(i);
        C87412m.m108593f(aVar, "trtcUserList[pos]");
        return aVar;
    }

    /* renamed from: c */
    public View mo85555c(int i, Object obj) {
        C87412m.m108594g((C65547a) obj, "data");
        return this.f187734b.mo76402b(this.f187735c.get(i).f188591a);
    }

    /* renamed from: e */
    public RatioLayout.C57914a mo85557e(int i) {
        return this.f187735c.get(i).f188592b;
    }
}
