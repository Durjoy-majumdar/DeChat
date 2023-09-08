package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.view.View;
import di3.C86312j;
import eb0.C31543z5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import o03.C21723h;
import p03.C21912d;
import t03.C22426h;
import te3.rh4;
import u73.C22613h1;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.j */
public class C19350j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TopStoryHomeUIComponentImpl f54570d;

    public C19350j(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl) {
        this.f54570d = topStoryHomeUIComponentImpl;
    }

    public void onClick(View view) {
        String str;
        Class cls = C21912d.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54570d;
        if (topStoryHomeUIComponentImpl.f54495D) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        topStoryHomeUIComponentImpl.f54495D = true;
        C22426h.m26110l(topStoryHomeUIComponentImpl.f54506d, topStoryHomeUIComponentImpl.f54508f);
        C117407d.INSTANCE.mo160131h(15449, 0);
        if (this.f54570d.f54517r.getVisibility() == 0) {
            View view2 = this.f54570d.f54517r;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rh4 rh4 = new rh4();
            rh4.f64533d = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34012w();
            rh4.f64541o = ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo34013x();
            C22613h1.m26484j(rh4, 106, 5, 0, C31543z5.m39453c() / 1000, "");
            ((C21723h) ((C21912d) C86312j.m106911c(cls)).mo34966t4()).mo33984D("", "", 0);
            str = "(Landroid/view/View;)V";
        } else {
            str = "(Landroid/view/View;)V";
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/topstory/ui/home/TopStoryHomeUIComponentImpl$4", "android/view/View$OnClickListener", "onClick", str);
    }
}
