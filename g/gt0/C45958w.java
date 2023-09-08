package gt0;

import android.content.Context;
import android.view.View;
import android.widget.RatingBar;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.C84926a;
import di0.C86299o;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;

/* renamed from: gt0.w */
public class C45958w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f123967d;

    /* renamed from: e */
    public final /* synthetic */ String f123968e;

    /* renamed from: f */
    public final /* synthetic */ String f123969f;

    /* renamed from: g */
    public final /* synthetic */ C84926a f123970g;

    public C45958w(C84926a aVar, Context context, String str, String str2) {
        this.f123970g = aVar;
        this.f123967d = context;
        this.f123968e = str;
        this.f123969f = str2;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f123970g.mo117756c(4, 1);
        RatingBar ratingBar = this.f123970g.f247540k;
        int rating = ratingBar != null ? (int) ratingBar.getRating() : 0;
        C84926a aVar = this.f123970g;
        Context context = this.f123967d;
        String str = this.f123968e;
        String str2 = this.f123969f;
        aVar.getClass();
        Class cls = C76630x0.class;
        if (C86312j.m106911c(cls) != null) {
            C86299o oVar = new C86299o();
            oVar.f250930b = "wxbfac0b7aca45dd68";
            oVar.f250929a = "gh_af145dc05189@app";
            oVar.f250931c = 0;
            oVar.f250939k = 1147;
            oVar.f250934f = String.format("/pages/edit/edit.html?appid=%s&appName=%s&score=%s", new Object[]{str, str2, Integer.valueOf(rating)});
            oVar.f250943o = new C45954o(aVar);
            ((C76630x0) C86312j.m106911c(cls)).mo106898tv(context, oVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandEvaluateDialogHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
