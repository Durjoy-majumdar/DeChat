package com.tencent.toybrick.p901ui;

import com.tencent.p014mm.p136ui.BaseActivity;
import java.util.HashMap;

/* renamed from: com.tencent.toybrick.ui.BaseToyUI */
public abstract class BaseToyUI<T> extends BaseActivity {

    /* renamed from: z */
    public HashMap<String, Object> f221383z = new HashMap<>();

    public void onDestroy() {
        super.onDestroy();
        this.f221383z.clear();
    }
}
