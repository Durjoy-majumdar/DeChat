package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.WindowManager;
import androidx.appcompat.app.C103422m;
import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.a */
public class C69554a extends C103422m {

    /* renamed from: f */
    public C69555a f200845f;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.a$a */
    public interface C69555a {
        /* renamed from: a */
        void mo95566a();
    }

    public C69554a(Context context) {
        super(context, C0966R.style.f8426i2);
        mo143460C(1);
    }

    public void onBackPressed() {
        C69555a aVar = this.f200845f;
        if (aVar != null) {
            aVar.mo95566a();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        getWindow().setAttributes(attributes);
    }
}
