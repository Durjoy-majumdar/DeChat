package nb1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import mb1.C109603j;
import ob1.C110011a;

/* renamed from: nb1.f */
public class C109734f implements C109603j.C109604a {

    /* renamed from: a */
    public final /* synthetic */ FaceActionUI f328448a;

    /* renamed from: nb1.f$a */
    public class C109735a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f328449d;

        /* renamed from: e */
        public final /* synthetic */ int f328450e;

        /* renamed from: f */
        public final /* synthetic */ int f328451f;

        /* renamed from: g */
        public final /* synthetic */ String f328452g;

        /* renamed from: nb1.f$a$a */
        public class C109736a implements View.OnClickListener {
            public C109736a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.FaceActionUI", "click retry");
                FaceActionUI faceActionUI = C109734f.this.f328448a;
                int i = FaceActionUI.f312664J;
                faceActionUI.getClass();
                C109603j.f328125A.mo160811b(false);
                C110011a aVar = faceActionUI.f312693z;
                if (aVar != null) {
                    aVar.mo161348c();
                }
                faceActionUI.f312675e.setVisibility(8);
                faceActionUI.f312677g.setVisibility(8);
                faceActionUI.f312674d.setVisibility(0);
                faceActionUI.mo149632J7();
                C109603j.f328125A.mo160812c(faceActionUI);
                C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: nb1.f$a$b */
        public class C109737b implements View.OnClickListener {
            public C109737b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.FaceActionUI", "click finish");
                C109735a aVar = C109735a.this;
                C109734f.this.f328448a.mo149630H7("fail", aVar.f328451f, "", aVar.f328452g);
                C117292a.m165361g(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C109735a(String str, int i, int i2, String str2) {
            this.f328449d = str;
            this.f328450e = i;
            this.f328451f = i2;
            this.f328452g = str2;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f328449d)) {
                C109734f.this.f328448a.f312689v.setText(this.f328449d);
                C109734f.this.f328448a.f312671G = 2;
            } else {
                C109734f.this.f328448a.f312689v.setText(C0966R.string.cht);
            }
            if (this.f328450e == 1) {
                C109734f.this.f328448a.f312687t.setText(C0966R.string.ckm);
                C109734f.this.f328448a.f312687t.setOnClickListener(new C109736a());
            } else {
                C109734f.this.f328448a.f312687t.setText(C0966R.string.ckl);
                C109734f.this.f328448a.f312687t.setOnClickListener(new C109737b());
            }
            C109734f.this.f328448a.f312685r.clearAnimation();
            FaceActionUI faceActionUI = C109734f.this.f328448a;
            faceActionUI.f312674d.setVisibility(8);
            faceActionUI.f312677g.setVisibility(0);
            faceActionUI.f312685r.clearAnimation();
            faceActionUI.f312681n.setVisibility(0);
            faceActionUI.f312675e.setVisibility(8);
            C109603j.f328125A.f328144y = 3;
            C109734f.this.f328448a.f312673I = 3;
        }
    }

    public C109734f(FaceActionUI faceActionUI) {
        this.f328448a = faceActionUI;
    }

    /* renamed from: a */
    public void mo160960a(int i, int i2, String str, String str2, int i3) {
        Log.m105925i("MicroMsg.FaceActionUI", "onError, err: %s, cgiErrCode: %s, cgiErrMsg: %s,retry: %s", Integer.valueOf(i), Integer.valueOf(i2), str, Integer.valueOf(i3));
        FaceActionUI faceActionUI = this.f328448a;
        int i4 = FaceActionUI.f312664J;
        faceActionUI.getClass();
        FaceActionUI faceActionUI2 = this.f328448a;
        faceActionUI2.f312666B = i2;
        faceActionUI2.getClass();
        this.f328448a.f312672H = str2;
        MMHandlerThread.postToMainThread(new C109735a(str, i3, i2, str2));
    }
}
