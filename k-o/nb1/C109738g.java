package nb1;

import android.view.View;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nb1.g */
public class C109738g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FaceActionUI f328456d;

    public C109738g(FaceActionUI faceActionUI) {
        this.f328456d = faceActionUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.FaceActionUI", "click mUploadFailedConfig");
        FaceActionUI faceActionUI = this.f328456d;
        faceActionUI.f312690w = true;
        faceActionUI.mo149630H7("fail", faceActionUI.f312666B, "", faceActionUI.f312672H);
        C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
