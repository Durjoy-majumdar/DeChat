package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.C18508z2;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.h2 */
public class C18286h2 extends C18332p3 {

    /* renamed from: o */
    public View f50555o;

    /* renamed from: p */
    public TextView f50556p;

    /* renamed from: q */
    public View f50557q;

    /* renamed from: r */
    public View f50558r;

    /* renamed from: s */
    public View f50559s;

    /* renamed from: t */
    public TextView f50560t;

    /* renamed from: u */
    public MMNeat7extView f50561u;

    /* renamed from: v */
    public View f50562v;

    /* renamed from: w */
    public TextView f50563w;

    /* renamed from: x */
    public MMNeat7extView f50564x;

    public C18286h2(Context context, C18508z2 z2Var) {
        this.f50824c = context;
        this.f50825d = z2Var;
    }

    /* renamed from: d */
    public void mo22876d() {
        View view = this.f50826e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/brandservice/ui/timeline/item/BizTLRecCardOld", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
