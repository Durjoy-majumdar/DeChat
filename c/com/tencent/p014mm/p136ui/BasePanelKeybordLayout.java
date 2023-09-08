package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mm.ui.BasePanelKeybordLayout */
public abstract class BasePanelKeybordLayout extends KeyboardLinearLayout {

    /* renamed from: j */
    public int f121111j = -1;

    /* renamed from: com.tencent.mm.ui.BasePanelKeybordLayout$a */
    public interface C44676a {
        /* renamed from: a */
        void mo69830a();
    }

    public BasePanelKeybordLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract List<View> getPanelView();

    public void onMeasure(int i, int i2) {
        List<View> panelView;
        View next;
        ViewGroup.LayoutParams layoutParams;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Log.m105919d("MicroMsg.BasePanelKeybordLayout", "onMeasure, width: %d, height: %d", Integer.valueOf(size), Integer.valueOf(size2));
        if (size2 >= 0) {
            int i3 = this.f121111j;
            if (i3 < 0) {
                this.f121111j = size2;
            } else {
                int i4 = i3 - size2;
                this.f121111j = size2;
                if (!(i4 == 0 || (panelView = getPanelView()) == null)) {
                    Iterator<View> it = panelView.iterator();
                    while (it.hasNext() && (layoutParams = next.getLayoutParams()) != null) {
                        int i5 = layoutParams.height;
                        int i6 = i5 < 0 ? 0 : i5 - i4;
                        if (i6 < 0) {
                            i6 = 0;
                        }
                        int keyBordHeightPx = KeyBoardUtil.getKeyBordHeightPx(MMApplicationContext.getContext(), true);
                        int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
                        int i7 = KeyBoardUtil.CONTENT_HEIGHT;
                        if (i7 > 0 && size2 >= i7) {
                            i6 = validPanelHeight;
                        }
                        if (i6 > 0 && i6 < keyBordHeightPx && next.getVisibility() != 0) {
                            i6 = 0;
                        }
                        if (i6 > validPanelHeight) {
                            i6 = validPanelHeight;
                        }
                        if (i6 > 0 && i6 < validPanelHeight) {
                            i6 = validPanelHeight;
                        }
                        Log.m105919d("MicroMsg.BasePanelKeybordLayout", "oldHeight: %d, offset: %d newHeight: %d, validPanelHeight: %d", Integer.valueOf(layoutParams.height), Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(validPanelHeight));
                        layoutParams.height = i6;
                        (next = it.next()).setLayoutParams(layoutParams);
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void setOnMeasureListener(C44676a aVar) {
    }

    public BasePanelKeybordLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
