package k11;

import android.view.View;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

public final /* synthetic */ class v$$k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12925w f29764d;

    public /* synthetic */ v$$k(C12925w wVar) {
        this.f29764d = wVar;
    }

    public final void onClick(View view) {
        C12925w wVar = this.f29764d;
        long[] jArr = CleanChattingUI.f267888D;
        Object obj = new Object();
        ArrayList arrayList = new ArrayList();
        arrayList.add(wVar);
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        wVar.mo5085n();
        C117292a.m165361g(new Object(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
