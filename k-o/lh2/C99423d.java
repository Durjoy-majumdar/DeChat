package lh2;

import android.os.Bundle;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qh2.C101198e;

/* renamed from: lh2.d */
public final class C99423d extends C99417a {

    /* renamed from: f */
    public View f291510f;

    /* renamed from: lh2.d$a */
    public static final class C99424a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C99423d f291511d;

        /* renamed from: e */
        public final /* synthetic */ C101198e.C101199b f291512e;

        public C99424a(C99423d dVar, C101198e.C101199b bVar) {
            this.f291511d = dVar;
            this.f291512e = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C101198e.C62622a.m73576a(this.f291511d.f291492d, this.f291512e, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin$setup$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99423d(C101198e eVar, String str) {
        super(eVar, str);
        C87412m.m108594g(eVar, "status");
    }

    public void setVisibility(int i) {
        View view = this.f291510f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/plugin/ClickRegisterPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: x */
    public final void mo138862x(int i, C101198e.C101199b bVar) {
        C87412m.m108594g(bVar, "event");
        View w = mo138857w(i);
        this.f291510f = w;
        w.setOnClickListener(new C99424a(this, bVar));
    }
}
