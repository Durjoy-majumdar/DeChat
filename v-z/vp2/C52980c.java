package vp2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import vp2.C52974a;

/* renamed from: vp2.c */
public class C52980c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C52974a.C52975b f147870d;

    public C52980c(C52974a.C52975b bVar) {
        this.f147870d = bVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2");
        try {
            C52974a.C52975b bVar = this.f147870d;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            AdClickActionInfo adClickActionInfo = bVar.f147864p;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            bVar.mo73732c(adClickActionInfo);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
