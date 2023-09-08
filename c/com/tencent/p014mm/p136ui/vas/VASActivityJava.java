package com.tencent.p014mm.p136ui.vas;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.ui.vas.VASActivityJava */
public abstract class VASActivityJava extends MMActivity {
    public <T extends View> T findViewById(int i) {
        return isCallFindViewSuper() ? super.findViewById(i) : findViewByIdInner(i);
    }

    public <T extends View> T findViewByIdInner(int i) {
        return null;
    }

    public boolean isCallFindViewSuper() {
        return true;
    }
}
