package vz0;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53246b;
import wz0.C53248d;

/* renamed from: vz0.r */
public class C53054r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C22498fy f148098d;

    /* renamed from: e */
    public final /* synthetic */ C20483c f148099e;

    /* renamed from: f */
    public final /* synthetic */ C53051q f148100f;

    public C53054r(C53051q qVar, C22498fy fyVar, C20483c cVar) {
        this.f148100f = qVar;
        this.f148098d = fyVar;
        this.f148099e = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String str = "";
        if (!Util.isNullOrNil(this.f148098d.f63894q) && !Util.isNullOrNil(this.f148098d.f63893p)) {
            C53246b.m59673e(this.f148099e.getCardId(), this.f148098d, this.f148100f.f148088b.getIntent() != null ? this.f148100f.f148088b.getIntent().getIntExtra("key_from_scene", 3) : 3, this.f148100f.f148088b.getIntent() != null ? this.f148100f.f148088b.getIntent().getIntExtra("key_from_appbrand_type", 0) : 0);
            C115669n.INSTANCE.mo160131h(11941, 20, this.f148099e.getCardId(), this.f148099e.mo23270R0(), str, this.f148098d.f63884d);
        } else if (!Util.isNullOrNil(this.f148098d.f63887g)) {
            C22498fy fyVar = this.f148098d;
            C53246b.m59678j(this.f148100f.f148088b, C22945n.m27011k(fyVar.f63887g, fyVar.f63888h), 1);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[5];
            objArr[0] = 9;
            objArr[1] = this.f148099e.getCardId();
            objArr[2] = this.f148099e.mo23270R0();
            objArr[3] = str;
            String str2 = this.f148098d.f63884d;
            if (str2 != null) {
                str = str2;
            }
            objArr[4] = str;
            nVar.mo160131h(11941, objArr);
        } else {
            MMActivity mMActivity = this.f148100f.f148088b;
            C53248d.m59685e(mMActivity, mMActivity.getString(C0966R.string.b2c), true);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
