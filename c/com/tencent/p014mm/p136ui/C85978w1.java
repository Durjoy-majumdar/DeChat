package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import com.tencent.p014mm.plugin.lite.LiteAppCenter;
import gy3.C87412m;

/* renamed from: com.tencent.mm.ui.w1 */
public final class C85978w1 extends ContextThemeWrapper {

    /* renamed from: a */
    public LayoutInflater f250420a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85978w1(Context context, int i) {
        super(context, i);
        C87412m.m108594g(context, LiteAppCenter.FRAMEWORK_TYPE_BASE);
    }

    public Object getSystemService(String str) {
        C87412m.m108594g(str, "name");
        if (!C87412m.m108589b("layout_inflater", str)) {
            return super.getSystemService(str);
        }
        if (this.f250420a == null) {
            Object systemService = super.getSystemService(str);
            this.f250420a = C85868k2.m106138c(systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null);
        }
        return this.f250420a;
    }
}
