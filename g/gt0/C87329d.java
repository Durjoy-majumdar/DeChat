package gt0;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87340f;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gt0.d */
public class C87329d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ArrayList f253096d;

    /* renamed from: e */
    public final /* synthetic */ C87340f.C87341a f253097e;

    /* renamed from: f */
    public final /* synthetic */ C87325b f253098f;

    public C87329d(C87340f fVar, ArrayList arrayList, C87340f.C87341a aVar, C87325b bVar) {
        this.f253096d = arrayList;
        this.f253097e = aVar;
        this.f253098f = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.f253096d.size(); i++) {
            if (((C87340f.C87345c) this.f253096d.get(i)).f253135b == 2 || ((C87340f.C87345c) this.f253096d.get(i)).f253135b == 3) {
                arrayList2.add(((C87340f.C87345c) this.f253096d.get(i)).f253134a);
            }
        }
        Log.m105924i("MicroMsg.AppBrandAuthorizeDialog", "stev rejectButton click!");
        this.f253097e.mo114547a(2, arrayList2);
        this.f253098f.dismiss();
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
