package com.tencent.p014mm.plugin.wenote.p131ui.nativenote;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import bb3.C92232k;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import java.util.WeakHashMap;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.i */
public class C96733i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f283376d;

    /* renamed from: e */
    public final /* synthetic */ NoteEditorUI f283377e;

    public C96733i(NoteEditorUI noteEditorUI, Context context) {
        this.f283377e = noteEditorUI;
        this.f283376d = context;
    }

    public void run() {
        int F = this.f283377e.f283238X0.mo126186F();
        int childCount = this.f283377e.f283257n.getChildCount();
        if (F == childCount) {
            float f = 0.0f;
            for (int i = childCount - 1; i >= 0; i--) {
                View childAt = this.f283377e.f283257n.getChildAt(i);
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                float translationY = childAt.getTranslationY();
                if (f <= ((float) childAt.getBottom()) + translationY) {
                    f = ((float) childAt.getBottom()) + translationY;
                }
            }
            if (f < ((float) KeyBoardUtil.getScreenWH(this.f283376d)[1]) && f > 0.0f) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f283377e.f283264r.getLayoutParams();
                layoutParams.height = (int) f;
                this.f283377e.f283264r.setLayoutParams(layoutParams);
            }
        }
        this.f283377e.f283264r.setVisibility(0);
        C92232k kVar = this.f283377e.f283265s;
        if (kVar != null) {
            kVar.getClass();
            int[] iArr = {0, 0};
            kVar.f263994b.getLocationOnScreen(iArr);
            kVar.f263993a.showAtLocation(kVar.f263994b, 49, 0, iArr[1] + 50);
        }
    }
}
