package com.tencent.p014mm.p136ui;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.tencent.mm.ui.m4 */
public class C85880m4 implements View.OnApplyWindowInsetsListener {

    /* renamed from: d */
    public final /* synthetic */ int f250184d;

    /* renamed from: e */
    public final /* synthetic */ View f250185e;

    /* renamed from: f */
    public final /* synthetic */ C85924r4 f250186f;

    public C85880m4(int i, View view, C85924r4 r4Var) {
        this.f250184d = i;
        this.f250185e = view;
        this.f250186f = r4Var;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        synchronized (C85875k4.f250159e) {
            C85875k4.f250157c.put(this.f250184d, this.f250185e.getRootWindowInsets());
            if (!(this.f250185e.getRootWindowInsets() == null || (displayCutout = this.f250185e.getRootWindowInsets().getDisplayCutout()) == null || (boundingRects = displayCutout.getBoundingRects()) == null || boundingRects.size() <= 0)) {
                C85875k4.f250156b = true;
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("has_cutout", C85875k4.f250156b);
            }
        }
        C85924r4 r4Var = this.f250186f;
        synchronized (r4Var.f250288b) {
            ((HashSet) r4Var.f250288b).remove(this);
        }
        return windowInsets;
    }
}
