package gq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107885g0;
import gy3.C87412m;
import iq0.C98783b;
import java.util.List;
import qo3.C77407n;

/* renamed from: gq0.k0 */
public final class C107893k0 extends C107894n {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107893k0(C98783b bVar, Context context, C77407n nVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, C107879e0 e0Var, C45944i0 i0Var) {
        super(bVar, context, nVar, appBrandOpenMaterialCollection, e0Var, i0Var);
        C87412m.m108594g(bVar, "openMaterialScene");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        C87412m.m108594g(i0Var, "launchAppBrandExecutor");
    }

    /* renamed from: o */
    public void mo158311o(C107885g0.C45943b bVar) {
        C87412m.m108594g(bVar, "type");
        Log.m105918d("MicroMsg.AppBrand.ListBottomSheetEnhanceLogic", "enhance, type: " + bVar);
        List<AppBrandOpenMaterialDetailModel> list = this.f323057f.f311217f;
        C87412m.m108593f(list, "openMaterialCollection.a…dOpenMaterialDetailModels");
        if (!list.isEmpty()) {
            C77407n nVar = this.f323056e;
            View inflate = LayoutInflater.from(this.f323055d).inflate(C0966R.C0971layout.f6389di, (ViewGroup) null);
            int color = this.f323055d.getResources().getColor(C0966R.color.a7f);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.gzu);
            if (imageView != null) {
                imageView.setImageDrawable(C74933u4.m89768e(this.f323055d, C0966R.raw.icons_filled_mini_program, color));
            }
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gzv);
            if (textView != null) {
                textView.setTextColor(color);
            }
            inflate.setOnClickListener(new C107891j0(this));
            nVar.mo107567l(inflate);
            this.f323060i.mo158307e();
            if (this.f323056e.mo107563h()) {
                C98168o.m126816b(this.f323056e, this.f323055d);
            }
        }
    }
}
