package w82;

import android.view.View;
import com.tencent.p014mm.plugin.multitalk.model.C105783b0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105883g;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w82.c */
public final class C111758c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111751a f334674d;

    public C111758c(C111751a aVar) {
        this.f334674d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105883g b = this.f334674d.getViewModel();
        b.getClass();
        Log.m105924i("MicroMsg.MT.MultiTalkUIViewModel", "onVirtualBackgroundClick: cut state: " + b.f314947t.getValue());
        Boolean value = b.f314947t.getValue();
        if (value == null) {
            value = Boolean.FALSE;
        }
        boolean booleanValue = value.booleanValue();
        C105783b0 n = C105851w0.zx0().mo150671n();
        if (n != null) {
            n.mo150727i(!booleanValue);
        }
        boolean z = !booleanValue;
        b.f314946s.postValue(Boolean.valueOf(z));
        if (C105851w0.vx0().mo150810e()) {
            b.f314944q = z;
            Map<String, Object> map = C105851w0.zx0().f314482U;
            C87412m.m108593f(map, "getMultiTalkManager().miniInfoHolder");
            ((HashMap) map).put("front_cam_vb", Boolean.valueOf(z));
        } else {
            b.f314945r = z;
            Map<String, Object> map2 = C105851w0.zx0().f314482U;
            C87412m.m108593f(map2, "getMultiTalkManager().miniInfoHolder");
            ((HashMap) map2).put("back_cam_vb", Boolean.valueOf(z));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
