package com.tencent.p014mm.plugin.luckymoney.story;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeAppBarLayout;
import com.tencent.p014mm.sdk.platformtools.Util;
import f32.C75672b;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import te3.vb4;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.t */
public class C56853t implements C75672b.C75673a {

    /* renamed from: a */
    public final /* synthetic */ C60905o f162893a;

    /* renamed from: b */
    public final /* synthetic */ vb4 f162894b;

    public C56853t(EnvelopeAppBarLayout.C69302f fVar, C60905o oVar, vb4 vb4) {
        this.f162893a = oVar;
        this.f162894b = vb4;
    }

    public void onComplete(boolean z) {
        if (z) {
            String str = (String) this.f162893a.mo85812D(C0966R.C0970id.gdv).getTag(C0966R.C0970id.gep);
            if (!Util.isNullOrNil(str) && str.equals(this.f162894b.f228307e)) {
                View D = this.f162893a.mo85812D(C0966R.C0970id.gdv);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert$1", "onComplete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert$1", "onComplete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
