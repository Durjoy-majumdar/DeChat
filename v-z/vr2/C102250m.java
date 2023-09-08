package vr2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdProxyUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: vr2.m */
public class C102250m implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102251n f301134d;

    public C102250m(C102251n nVar) {
        this.f301134d = nVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$3");
        Log.m105924i("SnsAdQRHelper", "createQRCodeMenuItem, onClick");
        if (C102251n.m134806a(this.f301134d).mo107563h()) {
            C102251n.m134806a(this.f301134d).mo107572p();
        }
        Intent intent = new Intent(C102251n.m134807b(this.f301134d), SnsAdProxyUI.class);
        intent.putExtra("action_type", 1);
        intent.putExtra("qrcodeStr", C102251n.m134808c(this.f301134d));
        intent.putExtra("qrcodeType", C102251n.m134809d(this.f301134d));
        C102251n nVar = this.f301134d;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        int i = nVar.f301139e;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper");
        intent.putExtra("qrcodeVer", i);
        Context b = C102251n.m134807b(this.f301134d);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context = b;
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        b.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (C102251n.m134807b(this.f301134d) instanceof Activity) {
            ((Activity) C102251n.m134807b(this.f301134d)).overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
        C102251n nVar2 = this.f301134d;
        nVar2.mo141821o(C102251n.m134808c(nVar2), true ^ TextUtils.isEmpty(C102251n.m134808c(this.f301134d)));
        this.f301134d.mo141818l();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsAdQRHelper$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/data/SnsAdQRHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
