package k11;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanCacheUI;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanNewUI;
import i11.C98579b;
import j20.C117292a;
import java.util.ArrayList;

public final /* synthetic */ class x$$d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanNewUI f290539d;

    public /* synthetic */ x$$d(CleanNewUI cleanNewUI) {
        this.f290539d = cleanNewUI;
    }

    public final void onClick(View view) {
        CleanNewUI cleanNewUI = this.f290539d;
        String str = CleanNewUI.f267927I;
        cleanNewUI.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", cleanNewUI, array);
        Intent intent = new Intent(cleanNewUI, CleanCacheUI.class);
        C98579b bVar = cleanNewUI.f267931D;
        if (bVar != null) {
            intent.putExtra("tagsResult", cleanNewUI.f267936d ? bVar.f289045g : bVar.f289044f);
        }
        intent.putExtra("aggressive", cleanNewUI.f267936d);
        intent.putExtra("vacuum", cleanNewUI.f267931D.f289046h);
        cleanNewUI.startActivityForResult(intent, 1);
        C117292a.m165361g(cleanNewUI, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
