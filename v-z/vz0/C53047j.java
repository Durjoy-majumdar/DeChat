package vz0;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import dz0.C20483c;
import j20.C117292a;
import java.util.ArrayList;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53246b;

/* renamed from: vz0.j */
public class C53047j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C20483c f148085d;

    /* renamed from: e */
    public final /* synthetic */ C53048k f148086e;

    public C53047j(C53048k kVar, C20483c cVar) {
        this.f148086e = kVar;
        this.f148085d = cVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f148085d.mo23286i2()) {
            C53246b.m59675g(this.f148086e.f148087a.f65605b, 0, (String) null, false, this.f148085d);
        } else {
            C22498fy fyVar = this.f148085d.mo23264L0().f64135Z;
            if (fyVar != null && !Util.isNullOrNil(fyVar.f63894q) && !Util.isNullOrNil(fyVar.f63893p)) {
                C53246b.m59673e(this.f148085d.getCardId(), fyVar, this.f148086e.f148088b.getIntent() != null ? this.f148086e.f148088b.getIntent().getIntExtra("key_from_scene", 3) : 3, this.f148086e.f148088b.getIntent() != null ? this.f148086e.f148088b.getIntent().getIntExtra("key_from_appbrand_type", 0) : 0);
                C115669n.INSTANCE.mo160131h(11941, 20, this.f148085d.getCardId(), this.f148085d.mo23270R0(), "", fyVar.f63884d);
            } else if (fyVar != null && !TextUtils.isEmpty(fyVar.f63887g)) {
                C53246b.m59678j(this.f148086e.f148087a.f65605b, C22945n.m27011k(fyVar.f63887g, fyVar.f63888h), 1);
                C115669n.INSTANCE.mo160131h(11941, 9, this.f148085d.getCardId(), this.f148085d.mo23270R0(), "", fyVar.f63884d);
                if (C22945n.m26990C(fyVar, this.f148085d.getCardId())) {
                    C22945n.m26999L(this.f148085d.getCardId(), fyVar.f63884d);
                    C53246b.m59676h(this.f148086e.f148087a.f65605b, this.f148085d.mo23264L0().f64142j);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/view/CardBaseCodeViewController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
