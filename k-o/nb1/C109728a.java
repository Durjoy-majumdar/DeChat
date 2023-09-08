package nb1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: nb1.a */
public class C109728a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FaceActionUI f328440d;

    /* renamed from: nb1.a$a */
    public class C109729a implements View.OnClickListener {
        public C109729a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.FaceActionUI", "click finish");
            C109728a.this.f328440d.mo149630H7("fail", 90016, "", "");
            C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$10$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C109728a(FaceActionUI faceActionUI) {
        this.f328440d = faceActionUI;
    }

    public void run() {
        Log.m105924i("MicroMsg.FaceActionUI", "openCameraPreviewFailedAnimation");
        this.f328440d.f312689v.setText(C0966R.string.ck5);
        this.f328440d.f312687t.setText(C0966R.string.ckl);
        this.f328440d.f312687t.setOnClickListener(new C109729a());
        this.f328440d.f312674d.setVisibility(8);
        this.f328440d.f312677g.setVisibility(0);
        this.f328440d.f312685r.clearAnimation();
        this.f328440d.f312681n.setVisibility(0);
        this.f328440d.f312675e.setVisibility(8);
    }
}
