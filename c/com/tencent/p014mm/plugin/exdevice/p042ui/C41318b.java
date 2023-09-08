package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceAddDataSourceUI;
import f40.C86709a0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.b */
public class C41318b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f111292d;

    /* renamed from: e */
    public final /* synthetic */ ExdeviceAddDataSourceUI f111293e;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.b$a */
    public class C41319a implements DialogInterface.OnCancelListener {
        public C41319a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107529k().f251779b.mo123458d(C41318b.this.f111293e.f110990q);
            C41318b bVar = C41318b.this;
            ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = bVar.f111293e;
            exdeviceAddDataSourceUI.f110990q = null;
            ExdeviceAddDataSourceUI.C41230k a = exdeviceAddDataSourceUI.f110981e.mo64289a(bVar.f111292d);
            if (a != null) {
                a.f111015e = ExdeviceAddDataSourceUI.C41231l.NORMAL;
            }
        }
    }

    public C41318b(ExdeviceAddDataSourceUI exdeviceAddDataSourceUI, String str) {
        this.f111293e = exdeviceAddDataSourceUI;
        this.f111292d = str;
    }

    public void run() {
        ExdeviceAddDataSourceUI exdeviceAddDataSourceUI = this.f111293e;
        exdeviceAddDataSourceUI.f110989p = C76879j.m92723Q(exdeviceAddDataSourceUI.getContext(), "", this.f111293e.getString(C0966R.string.a4d), true, true, new C41319a());
    }
}
