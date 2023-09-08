package w82;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105783b0;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.plugin.multitalk.model.C105853x;
import com.tencent.p014mm.plugin.multitalk.p078ui.C105883g;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.projector.MultiTalkSmallControlIconLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w82.b */
public final class C111757b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C111751a f334673d;

    public C111757b(C111751a aVar) {
        this.f334673d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C105883g b = this.f334673d.getViewModel();
        if (C87412m.m108589b(b.f314939i.getValue(), Boolean.TRUE)) {
            Log.m105924i("MicroMsg.MT.MultiTalkUIViewModel", "onSwitchCameraClick: switchCam");
            C105851w0.vx0().mo150807a();
            boolean z = false;
            if (C105851w0.vx0().mo150810e()) {
                StringBuilder sb = new StringBuilder();
                sb.append("onSwitchCameraClick: backCamVBState ");
                sb.append(b.f314945r);
                sb.append(", ");
                Boolean value = b.f314947t.getValue();
                if (value == null) {
                    value = Boolean.FALSE;
                }
                sb.append(value.booleanValue());
                Log.m105924i("MicroMsg.MT.MultiTalkUIViewModel", sb.toString());
                Boolean value2 = b.f314947t.getValue();
                if (value2 != null) {
                    z = value2.booleanValue();
                }
                b.f314945r = z;
                Map<String, Object> map = C105851w0.zx0().f314482U;
                C87412m.m108593f(map, "getMultiTalkManager().miniInfoHolder");
                ((HashMap) map).put("back_cam_vb", Boolean.valueOf(z));
                b.f314946s.postValue(Boolean.valueOf(b.f314944q));
                C105783b0 n = C105851w0.zx0().mo150671n();
                if (n != null) {
                    n.mo150727i(b.f314944q);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onSwitchCameraClick: frontCamVBState ");
                sb4.append(b.f314944q);
                sb4.append(", ");
                Boolean value3 = b.f314947t.getValue();
                if (value3 == null) {
                    value3 = Boolean.FALSE;
                }
                sb4.append(value3.booleanValue());
                Log.m105924i("MicroMsg.MT.MultiTalkUIViewModel", sb4.toString());
                Boolean value4 = b.f314947t.getValue();
                if (value4 != null) {
                    z = value4.booleanValue();
                }
                b.f314944q = z;
                Map<String, Object> map2 = C105851w0.zx0().f314482U;
                C87412m.m108593f(map2, "getMultiTalkManager().miniInfoHolder");
                ((HashMap) map2).put("front_cam_vb", Boolean.valueOf(z));
                b.f314946s.postValue(Boolean.valueOf(b.f314945r));
                C105783b0 n2 = C105851w0.zx0().mo150671n();
                if (n2 != null) {
                    n2.mo150727i(b.f314945r);
                }
            }
            C105853x.m142230a(7);
        } else {
            Log.m105928w("MicroMsg.MT.MultiTalkUIViewModel", "onSwitchCameraClick: cam not open");
        }
        String str = null;
        if (C105851w0.vx0().mo150810e()) {
            MultiTalkSmallControlIconLayout a = this.f334673d.getCameraSwitcher();
            Context context = this.f334673d.getContext();
            if (context != null) {
                str = context.getString(C0966R.string.gzb);
            }
            a.setContentDescription(str);
        } else {
            MultiTalkSmallControlIconLayout a2 = this.f334673d.getCameraSwitcher();
            Context context2 = this.f334673d.getContext();
            if (context2 != null) {
                str = context2.getString(C0966R.string.gyj);
            }
            a2.setContentDescription(str);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultiTalkAvatarControlLayout$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
