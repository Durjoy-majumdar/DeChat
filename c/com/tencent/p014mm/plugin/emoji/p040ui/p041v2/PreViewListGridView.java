package com.tencent.p014mm.plugin.emoji.p040ui.p041v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.emoji.PopEmojiView;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.emoji.ui.v2.PreViewListGridView */
public class PreViewListGridView extends ListView {

    /* renamed from: d */
    public WindowManager f110649d;

    /* renamed from: e */
    public int f110650e;

    public PreViewListGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new MMHandler();
        mo64141b(context);
    }

    /* renamed from: b */
    public final void mo64141b(Context context) {
        new PopEmojiView(getContext());
        this.f110650e = context.getResources().getDimensionPixelSize(C0966R.dimen.a4u);
        this.f110649d = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2, 8, 1);
        int i = this.f110650e;
        layoutParams.width = i;
        layoutParams.height = i;
        layoutParams.gravity = 17;
        if (getResources().getConfiguration().orientation == 2) {
            this.f110649d.getDefaultDisplay().getHeight();
            this.f110649d.getDefaultDisplay().getWidth();
            return;
        }
        this.f110649d.getDefaultDisplay().getWidth();
        this.f110649d.getDefaultDisplay().getHeight();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setEnablePreView(boolean z) {
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        C93246d0 d0Var = (C93246d0) listAdapter;
    }

    public PreViewListGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new MMHandler();
        mo64141b(context);
    }
}
