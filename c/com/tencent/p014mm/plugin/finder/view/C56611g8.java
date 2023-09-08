package com.tencent.p014mm.plugin.finder.view;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.view.g8 */
public final class C56611g8 extends C87413o implements C32224a<TextView> {

    /* renamed from: d */
    public final /* synthetic */ TestPreloadPreview f162304d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56611g8(TestPreloadPreview testPreloadPreview) {
        super(0);
        this.f162304d = testPreloadPreview;
    }

    public Object invoke() {
        return (TextView) this.f162304d.findViewById(C0966R.C0970id.epq);
    }
}
