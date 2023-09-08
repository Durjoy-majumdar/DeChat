package hl1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import qj1.C62979sf;
import vk1.C65762c;

/* renamed from: hl1.f1 */
public final class C59971f1 extends C87413o implements C32224a<C62979sf> {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f171116d;

    /* renamed from: e */
    public final /* synthetic */ C65762c f171117e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59971f1(ViewGroup viewGroup, C65762c cVar) {
        super(0);
        this.f171116d = viewGroup;
        this.f171117e = cVar;
    }

    public Object invoke() {
        ViewGroup viewGroup = this.f171116d;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.l6k);
        C87412m.m108593f(findViewById, "orientationRoot.findView…id.video_orientation_btn)");
        View findViewById2 = this.f171116d.findViewById(C0966R.C0970id.e0z);
        C87412m.m108593f(findViewById2, "orientationRoot.findView…e_video_orientation_root)");
        return new C62979sf(viewGroup, (ImageView) findViewById, (ViewGroup) findViewById2, this.f171117e);
    }
}
