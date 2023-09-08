package com.tencent.p014mm.plugin.wenote.p131ui.nativenote.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;

/* renamed from: com.tencent.mm.plugin.wenote.ui.nativenote.adapter.NoteLinearLayoutManager */
public class NoteLinearLayoutManager extends WxLinearLayoutManager {

    /* renamed from: w */
    public final int f283330w = KeyBoardUtil.getKeyBordHeightPx(MMApplicationContext.getContext(), true);

    /* renamed from: x */
    public int f283331x = -1;

    /* renamed from: y */
    public boolean f283332y = false;

    public NoteLinearLayoutManager(Context context) {
        super(context);
    }

    /* renamed from: M */
    public int mo16966M(RecyclerView.C16628w wVar) {
        int i = this.f283331x;
        if (i > 0) {
            return i;
        }
        return 900;
    }

    public int scrollVerticallyBy(int i, RecyclerView.C16625r rVar, RecyclerView.C16628w wVar) {
        if (!this.f283332y) {
            return super.scrollVerticallyBy(i, rVar, wVar);
        }
        boolean z = true;
        boolean z2 = i < 0 && TypedValue.applyDimension(1, 49.0f, C96679b.f283184t) <= ((float) Math.abs(i));
        if (i > 0) {
            if (((float) this.f283330w) + TypedValue.applyDimension(1, 49.0f, C96679b.f283184t) >= ((float) i)) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && this.f283332y) {
            return 0;
        }
        try {
            return super.scrollVerticallyBy(i, rVar, wVar);
        } catch (Exception unused) {
            return 0;
        }
    }

    public NoteLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
