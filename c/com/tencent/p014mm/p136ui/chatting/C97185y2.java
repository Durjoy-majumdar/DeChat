package com.tencent.p014mm.p136ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.exdevice.model.C93366l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import te3.C64454it2;
import te3.C64478jt2;

/* renamed from: com.tencent.mm.ui.chatting.y2 */
public final class C97185y2 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C93366l1 f285175d;

    /* renamed from: e */
    public final /* synthetic */ ChattingSendDataToDeviceUI f285176e;

    public C97185y2(C93366l1 l1Var, ChattingSendDataToDeviceUI chattingSendDataToDeviceUI) {
        this.f285175d = l1Var;
        this.f285176e = chattingSendDataToDeviceUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C93366l1 l1Var = this.f285175d;
        if (!l1Var.f269431n || !C87412m.m108589b(l1Var.f269424d, this.f285176e.f284267Y0)) {
            ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f285176e;
            C93366l1 l1Var2 = this.f285175d;
            chattingSendDataToDeviceUI.getClass();
            C87412m.m108594g(l1Var2, "item");
            String str = chattingSendDataToDeviceUI.f284273d;
            StringBuilder sb = new StringBuilder();
            sb.append("onDeviceClick ");
            sb.append(chattingSendDataToDeviceUI.f284264X != null);
            Log.m105924i(str, sb.toString());
            chattingSendDataToDeviceUI.f284262W = true;
            if (chattingSendDataToDeviceUI.f284264X == null) {
                chattingSendDataToDeviceUI.f284264X = l1Var2;
                ChattingSendDataToDeviceUI.m124692O7(chattingSendDataToDeviceUI, chattingSendDataToDeviceUI.f284294y0, (C64454it2) null, (C64478jt2) null, (String) null, 8, (Object) null);
            }
        } else {
            ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f285176e;
            ViewGroup viewGroup = chattingSendDataToDeviceUI2.f284274e;
            if (viewGroup != null) {
                ChattingSendDataToDeviceUI.m124693P7(chattingSendDataToDeviceUI2, viewGroup, 8, 0, 2, (Object) null);
                ViewGroup viewGroup2 = chattingSendDataToDeviceUI2.f284279j;
                if (viewGroup2 != null) {
                    ChattingSendDataToDeviceUI.m124693P7(chattingSendDataToDeviceUI2, viewGroup2, 0, 0, 2, (Object) null);
                } else {
                    C87412m.m108603p("otherDeviceLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("deviceMainLayout");
                throw null;
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/ChattingSendDataToDeviceUI$DeviceConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
