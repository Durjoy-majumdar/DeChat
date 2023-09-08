package es0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import es0.C86647a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;
import te3.C90419io3;
import z04.C112551y;

/* renamed from: es0.d */
public final class C86663d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C90419io3 f251642d;

    /* renamed from: e */
    public final /* synthetic */ C86647a f251643e;

    /* renamed from: f */
    public final /* synthetic */ C86647a.C86650c f251644f;

    /* renamed from: g */
    public final /* synthetic */ WxaAttributes f251645g;

    /* renamed from: h */
    public final /* synthetic */ int f251646h;

    /* renamed from: i */
    public final /* synthetic */ Context f251647i;

    public C86663d(C90419io3 io32, C86647a aVar, C86647a.C86650c cVar, WxaAttributes wxaAttributes, int i, Context context) {
        this.f251642d = io32;
        this.f251643e = aVar;
        this.f251644f = cVar;
        this.f251645g = wxaAttributes;
        this.f251646h = i;
        this.f251647i = context;
    }

    public final void onClick(View view) {
        WxaAttributes.WxaVersionInfo o2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C90419io3 io32 = this.f251642d;
        if (io32.f259583d == 4) {
            C86647a aVar = this.f251643e;
            Context context = this.f251644f.f44854d.getContext();
            C87412m.m108593f(context, "baseViewHolder.itemView.context");
            aVar.mo121056O4(context, this.f251645g, this.f251642d, this.f251646h, false);
        } else {
            String str = io32.f259586g;
            String str2 = io32.f259587h;
            if (str2 != null) {
                C87412m.m108593f(str2, "itemData.page_param");
                if (!C112551y.m153811k(str2)) {
                    str = str + '?' + this.f251642d.f259587h;
                }
            }
            String str3 = str;
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = 1118;
            appBrandStatObject.f245531d = 14;
            if (!TextUtils.isEmpty(this.f251642d.f259596t)) {
                appBrandStatObject.f245534g = this.f251642d.f259594r + XVFSFile.PATH_SEPARATOR_CHAR + this.f251642d.f259596t;
                appBrandStatObject.f245532e = this.f251642d.f259594r + XVFSFile.PATH_SEPARATOR_CHAR + this.f251642d.f259596t;
            } else {
                String str4 = this.f251642d.f259594r;
                appBrandStatObject.f245534g = str4;
                appBrandStatObject.f245532e = str4;
            }
            appBrandStatObject.f245539o = this.f251643e.mo121054F4(this.f251645g, this.f251642d, this.f251646h);
            WxaAttributes wxaAttributes = this.f251645g;
            if (!(wxaAttributes == null || wxaAttributes == null || (o2 = wxaAttributes.mo113942o2()) == null)) {
                ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(this.f251647i, this.f251642d.f259585f, this.f251645g.field_appId, 0, o2.f239452d, str3, appBrandStatObject);
            }
            this.f251643e.f251614h.invoke(this.f251642d, Integer.valueOf(this.f251646h));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendAdapter$onBindViewHolder$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
