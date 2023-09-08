package cs0;

import android.view.View;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: cs0.w */
public final class C45196w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45181m f122514d;

    public C45196w(C45181m mVar) {
        this.f122514d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/privacy/revoke/UserInfoManageAreaAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C45164f0 K = this.f122514d.f122487d.mo63404K();
        K.getClass();
        C30911z zVar = C30911z.NORMAL;
        Log.m105924i("MicroMsg.AppBrand.UserInfoRevokeViewModel", "onManageBtnClick");
        C30911z value = K.f122462g.getValue();
        if (value == null) {
            value = zVar;
        }
        C54219z<C30911z> zVar2 = K.f122462g;
        if (zVar == value) {
            zVar = C30911z.MANAGE;
        }
        zVar2.setValue(zVar);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/UserInfoManageAreaAdapter$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
