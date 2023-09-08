package com.tencent.p014mm.p136ui;

import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import oa1.C117731d;

/* renamed from: com.tencent.mm.ui.b */
public class C44706b {
    /* renamed from: a */
    public static boolean m49450a() {
        int e = C117731d.m166007c().mo182443e("clicfg_actionbar_title_text_size_default_switch", 1, true, true);
        Log.m105919d("MicroMsg.ActionBarCenterHelper", "isSupportHotWordPrioritySwt() swt:%s", Integer.valueOf(e));
        return e == 1;
    }

    /* renamed from: b */
    public static void m49451b(TextView textView, int i) {
        if (m49450a() && textView != null) {
            textView.setTextSize(0, (float) C76577a.m92155f(textView.getContext(), i));
        }
    }
}
