package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.a4 */
public class C18210a4 extends C18349r3 {

    /* renamed from: B */
    public View f50337B;

    /* renamed from: g */
    public void mo22825g(View view, C18508z2 z2Var) {
        ViewStub viewStub;
        this.f50824c = view.getContext();
        this.f50825d = z2Var;
        if (this.f50826e == null && (viewStub = (ViewStub) view.findViewById(C0966R.C0970id.l9l)) != null) {
            viewStub.inflate();
            this.f50826e = view.findViewById(C0966R.C0970id.ads);
            this.f50827f = view.findViewById(C0966R.C0970id.b5s);
            mo22915h();
            ImageView imageView = (ImageView) this.f50826e.findViewById(C0966R.C0970id.buo);
            this.f50805m = (ImageView) this.f50826e.findViewById(C0966R.C0970id.bv_);
            ImageView imageView2 = (ImageView) this.f50826e.findViewById(C0966R.C0970id.hw9);
            this.f50337B = this.f50826e.findViewById(C0966R.C0970id.b8b);
            this.f50806n = (ImageView) this.f50826e.findViewById(C0966R.C0970id.i1x);
        }
    }
}
