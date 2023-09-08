package gt0;

import android.content.Context;
import android.view.View;
import android.widget.RatingBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;
import te3.C50371m90;
import te3.im4;

/* renamed from: gt0.x */
public class C45959x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f123971d;

    /* renamed from: e */
    public final /* synthetic */ C84926a f123972e;

    public C45959x(C84926a aVar, Context context) {
        this.f123972e = aVar;
        this.f123971d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        RatingBar ratingBar = this.f123972e.f247540k;
        if (ratingBar != null) {
            int rating = (int) ratingBar.getRating();
            C84926a aVar = this.f123972e;
            aVar.getClass();
            im4 im4 = new im4();
            im4.f135506d = aVar.f247530a;
            im4.f135507e = 3;
            C50371m90 m902 = new C50371m90();
            im4.f135508f = m902;
            m902.f137913d = rating;
            aVar.f247532c = rating;
            Log.m105925i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "saveEvaluateScore, userName:%s, score:%d", aVar.f247530a, Integer.valueOf(rating));
            aVar.mo117761h(im4);
            Context context = this.f123971d;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.f7679nr), 0).show();
            C84926a aVar2 = this.f123972e;
            aVar2.f247531b = true;
            aVar2.mo117754a();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
