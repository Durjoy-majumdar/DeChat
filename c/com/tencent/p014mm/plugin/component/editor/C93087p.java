package com.tencent.p014mm.plugin.component.editor;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;
import u21.C101941c;
import u21.C101943d;

/* renamed from: com.tencent.mm.plugin.component.editor.p */
public class C93087p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f268177d;

    /* renamed from: e */
    public final /* synthetic */ EditorUI f268178e;

    public C93087p(EditorUI editorUI, Context context) {
        this.f268178e = editorUI;
        this.f268177d = context;
    }

    public void run() {
        int B = C101941c.m134173q().mo141443B();
        int childCount = this.f268178e.f268042d.getChildCount();
        if (B == childCount) {
            float f = 0.0f;
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = this.f268178e.f268042d.getChildAt(i);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                float translationY = childAt.getTranslationY();
                if (f <= ((float) childAt.getBottom()) + translationY) {
                    f = ((float) childAt.getBottom()) + translationY;
                }
            }
            if (f < ((float) KeyBoardUtil.getScreenWH(this.f268177d)[1]) && f > 0.0f) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f268178e.f268046h.getLayoutParams();
                layoutParams.height = (int) f;
                this.f268178e.f268046h.setLayoutParams(layoutParams);
            }
        }
        this.f268178e.f268046h.setVisibility(0);
        C101943d dVar = this.f268178e.f268047i;
        if (dVar != null) {
            dVar.getClass();
            int[] iArr = {0, 0};
            dVar.f300125b.getLocationOnScreen(iArr);
            dVar.f300124a.showAtLocation(dVar.f300125b, 49, 0, iArr[1] + 50);
        }
    }
}
