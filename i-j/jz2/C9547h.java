package jz2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import tz2.C78119f;
import tz2.C78120g;
import zt3.C119157j;

/* renamed from: jz2.h */
public final class C9547h implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76474e f29742d;

    public C9547h(C76474e eVar) {
        this.f29742d = eVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C78120g gVar = C78120g.f228929a;
        Log.m105924i("MicroMsg.TextStatus.UploadManager", "click to reCommit");
        ((C119157j) C119157j.f356862d).mo183875f(C78119f.f228928d);
        View view2 = this.f29742d.f223857I;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic$handleSecurity$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
