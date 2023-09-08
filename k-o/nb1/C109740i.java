package nb1;

import android.view.View;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nb1.i */
public class C109740i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceActionUI f328457d;

    public C109740i(FaceActionUI faceActionUI) {
        this.f328457d = faceActionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FaceActionUI", "click finish");
        this.f328457d.mo149630H7("fail", 90010, "", "");
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
