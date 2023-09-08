package com.tencent.p014mm.p136ui.chatting.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.p133ui.tools.ScrollControlListView;
import gy3.C87412m;

/* renamed from: com.tencent.mm.ui.chatting.view.g */
public class C73886g extends ScrollControlListView {

    /* renamed from: j */
    public final /* synthetic */ MMChattingListView f216834j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73886g(MMChattingListView mMChattingListView, Context context) {
        super(context, (AttributeSet) null);
        this.f216834j = mMChattingListView;
        C87412m.m108594g(context, "context");
    }

    /* renamed from: b */
    public int mo100789b(int i) {
        TextView textView;
        if (getChildCount() <= i) {
            return 0;
        }
        View childAt = getChildAt(i);
        if (!(childAt.getTag() instanceof C74023i.C74026c) || (textView = ((C74023i.C74026c) childAt.getTag()).timeTV) == null || textView.getVisibility() != 0) {
            return 0;
        }
        return this.f216834j.f216805Q0;
    }

    public int getExtraScrollDistance() {
        MMChattingListView mMChattingListView = this.f216834j;
        int i = MMChattingListView.f216804U0;
        Context context = mMChattingListView.f214887y;
        if (!(context instanceof Activity)) {
            return 0;
        }
        View findViewById = ((Activity) context).findViewById(C0966R.C0970id.b4a);
        int measuredHeight = findViewById.getMeasuredHeight() - findViewById.getMinimumHeight();
        if (measuredHeight > 0) {
            return (int) (((double) measuredHeight) * 1.3d);
        }
        return 0;
    }

    public void onDraw(Canvas canvas) {
        MMChattingListView.m87563h(this.f216834j, canvas);
        super.onDraw(canvas);
    }
}
