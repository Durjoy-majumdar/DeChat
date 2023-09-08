package vp2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import vp2.C52974a;

/* renamed from: vp2.b */
public class C52979b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52974a.C52975b f147869d;

    public C52979b(C52974a.C52975b bVar) {
        this.f147869d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1");
        try {
            if (C52974a.C52975b.m59287a(this.f147869d) != null && C52974a.C52975b.m59287a(this.f147869d).mo107563h()) {
                C52974a.C52975b.m59287a(this.f147869d).mo107572p();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
