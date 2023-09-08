package cb3;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cb3.p */
public class C92406p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C92400k f264457d;

    public C92406p(C92400k kVar) {
        this.f264457d = kVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("NoteSelectManager", "bold");
        this.f264457d.mo126389p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
