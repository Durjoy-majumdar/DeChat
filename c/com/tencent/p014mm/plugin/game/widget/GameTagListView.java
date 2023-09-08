package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.widget.GameTagListView */
public class GameTagListView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public int f19327d;

    /* renamed from: e */
    public int f19328e;

    public GameTagListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo5432a(LinkedList<String> linkedList, int i) {
        if (Util.isNullOrNil((List) linkedList)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        while (getChildCount() < linkedList.size()) {
            TextView textView = new TextView(getContext());
            textView.setBackgroundResource(C0966R.C0969drawable.a7x);
            textView.setMaxLines(1);
            textView.setTextColor(this.f19327d);
            textView.setTextSize(0, (float) this.f19328e);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(C0966R.dimen.f3858gx), 0);
            textView.setLayoutParams(layoutParams);
            addView(textView);
        }
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            if (i2 >= linkedList.size()) {
                break;
            }
            String str = linkedList.get(i2);
            Log.m105918d("MicroMsg.GameTagListView", str);
            TextView textView2 = (TextView) getChildAt(i2);
            textView2.setVisibility(0);
            textView2.setText(str);
            f = f + textView2.getPaint().measureText(str) + ((float) textView2.getPaddingLeft()) + ((float) textView2.getPaddingRight()) + ((float) getResources().getDimensionPixelSize(C0966R.dimen.f3858gx));
            if (f > ((float) i)) {
                textView2.setVisibility(8);
                break;
            }
            i2++;
        }
        while (i2 < getChildCount()) {
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = childAt;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/widget/GameTagListView", "setData", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/game/widget/GameTagListView", "setData", "(Ljava/util/LinkedList;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i2 = i3;
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f19327d = getResources().getColor(C0966R.color.f3521w5);
        this.f19328e = getResources().getDimensionPixelSize(C0966R.dimen.f3862h2);
    }
}
