package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import av2.C92126r;
import av2.C92154z;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import fy3.C32224a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$i */
public class SnsOnlineVideoActivity$$i implements View.OnLongClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f278431d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$$i$a */
    public class C95595a implements C32224a<C13598b0> {
        public C95595a() {
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9$1");
            SnsOnlineVideoActivity snsOnlineVideoActivity = SnsOnlineVideoActivity$$i.this.f278431d;
            int i = SnsOnlineVideoActivity.f278370y0;
            SnsMethodCalculate.markStartTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            snsOnlineVideoActivity.f278411u = null;
            SnsMethodCalculate.markEndTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9$1");
            return null;
        }
    }

    public SnsOnlineVideoActivity$$i(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f278431d = snsOnlineVideoActivity;
    }

    public boolean onLongClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9");
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f278431d;
        C92126r rVar = new C92126r(this.f278431d, 4);
        SnsMethodCalculate.markStartTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.f278411u = rVar;
        SnsMethodCalculate.markEndTimeMs("access$2102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        C92126r I7 = SnsOnlineVideoActivity.m122194I7(this.f278431d);
        SnsInfo J7 = SnsOnlineVideoActivity.m122195J7(this.f278431d);
        SnsOnlineVideoActivity snsOnlineVideoActivity2 = this.f278431d;
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        C101804kv2 kv22 = snsOnlineVideoActivity2.f278404o;
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        I7.mo126099b(J7, kv22);
        C92126r I72 = SnsOnlineVideoActivity.m122194I7(this.f278431d);
        SnsOnlineVideoActivity snsOnlineVideoActivity3 = this.f278431d;
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        List<Integer> T7 = snsOnlineVideoActivity3.mo132872T7();
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsOnlineVideoActivity snsOnlineVideoActivity4 = this.f278431d;
        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        List<Integer> U7 = snsOnlineVideoActivity4.mo132873U7();
        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        I72.mo126110m(T7, U7, (C32224a<C13598b0>) null);
        SnsOnlineVideoActivity.m122194I7(this.f278431d).mo126108k(this.f278431d.f278415x0);
        SnsOnlineVideoActivity.m122194I7(this.f278431d).mo126107j(new C95595a());
        SnsOnlineVideoActivity.m122194I7(this.f278431d).mo126109l();
        C92154z.m115828a(this.f278431d);
        SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$9");
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$9", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
