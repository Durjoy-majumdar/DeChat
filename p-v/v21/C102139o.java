package v21;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: v21.o */
public class C102139o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102132i f300788d;

    public C102139o(C102132i iVar) {
        this.f300788d = iVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.Editor.EditorSelectManager", "unbold");
        this.f300788d.mo141667p();
        C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
