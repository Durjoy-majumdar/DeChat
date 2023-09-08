package k11;

import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: k11.f */
public final class C108816f implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Button f325848d;

    /* renamed from: e */
    public final /* synthetic */ C108809b f325849e;

    /* renamed from: f */
    public final /* synthetic */ CleanCacheUI f325850f;

    public C108816f(Button button, C108809b bVar, CleanCacheUI cleanCacheUI) {
        this.f325848d = button;
        this.f325849e = bVar;
        this.f325850f = cleanCacheUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f325849e.mo159906d(!C87412m.m108589b(this.f325848d.getTag(), Boolean.TRUE));
        this.f325850f.f312129n.invoke();
        C117292a.m165361g(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
