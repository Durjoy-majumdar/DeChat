package com.tencent.p014mm.live.core.core.trtc.widget;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.live.core.core.trtc.widget.BaseTabSettingFragmentDialog */
public abstract class BaseTabSettingFragmentDialog extends BaseSettingFragmentDialog {

    /* renamed from: d */
    public List<Fragment> f157121d;

    /* renamed from: e */
    public List<String> f157122e;

    /* renamed from: K */
    public abstract List<Fragment> mo76391K();

    /* renamed from: L */
    public abstract List<String> mo76392L();

    public int getLayoutId() {
        return 0;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f157121d = mo76391K();
        this.f157122e = mo76392L();
        if (this.f157121d == null) {
            this.f157121d = new ArrayList();
        }
        throw null;
    }
}
