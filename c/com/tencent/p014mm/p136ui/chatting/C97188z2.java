package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.exdevice.model.C93366l1;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.ui.chatting.z2 */
public final class C97188z2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChattingSendDataToDeviceUI f285187d;

    /* renamed from: e */
    public final /* synthetic */ List<C93366l1> f285188e;

    public C97188z2(ChattingSendDataToDeviceUI chattingSendDataToDeviceUI, List<C93366l1> list) {
        this.f285187d = chattingSendDataToDeviceUI;
        this.f285188e = list;
    }

    public final void run() {
        T t;
        this.f285187d.f284245K.clear();
        this.f285187d.f284245K.addAll(this.f285188e);
        WxRecyclerAdapter<C93366l1> wxRecyclerAdapter = this.f285187d.f284240F;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyDataSetChanged();
        }
        ChattingSendDataToDeviceUI chattingSendDataToDeviceUI = this.f285187d;
        Iterator<T> it = chattingSendDataToDeviceUI.f284243I.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C93366l1) t).f269424d, chattingSendDataToDeviceUI.f284267Y0)) {
                break;
            }
        }
        if (t == null) {
            C93366l1 l1Var = new C93366l1();
            l1Var.f269431n = true;
            ChattingSendDataToDeviceUI chattingSendDataToDeviceUI2 = this.f285187d;
            l1Var.f269424d = chattingSendDataToDeviceUI2.f284267Y0;
            l1Var.f269426f = chattingSendDataToDeviceUI2.getString(C0966R.string.mch);
            this.f285187d.f284243I.add(l1Var);
        }
    }
}
