package zk1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.List;
import ro3.C110588j;

/* renamed from: zk1.z */
public final class C16291z implements C110588j.C110590c {

    /* renamed from: a */
    public final /* synthetic */ C16229h f43592a;

    public C16291z(C16229h hVar) {
        this.f43592a = hVar;
    }

    /* renamed from: a */
    public void mo14785a(List<C110588j.C110589b> list, int i) {
        C87412m.m108594g(list, "items");
        if (i != 8 && i != 1) {
            String string = this.f43592a.getContext().getString(C0966R.string.ll9);
            C87412m.m108593f(string, "context.getString(R.string.wrap_btn_text)");
            list.add(new C110588j.C110589b(string, 6));
        }
    }

    /* renamed from: b */
    public void mo14786b(View view, C110588j.C110589b bVar, String str) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(bVar, "item");
        C87412m.m108594g(str, "curSelect");
        if (bVar.f330853b == 6) {
            this.f43592a.mo14765g3().append("\n");
        }
    }
}
