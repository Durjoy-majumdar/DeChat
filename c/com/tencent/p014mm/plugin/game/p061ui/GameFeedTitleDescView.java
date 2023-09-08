package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import py1.C47625m0;
import uy1.C52642c;
import uy1.C52645f;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameFeedTitleDescView */
public class GameFeedTitleDescView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public TextView f113921d;

    /* renamed from: e */
    public TextView f113922e;

    /* renamed from: f */
    public LinearLayout f113923f;

    public GameFeedTitleDescView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo66205a(String str, String str2, LinkedList<C47625m0> linkedList) {
        String str3 = str;
        if (!Util.isNullOrNil(str) || !Util.isNullOrNil(str2)) {
            char c = 0;
            setVisibility(0);
            if (!Util.isNullOrNil((List) linkedList)) {
                this.f113923f.setVisibility(0);
                while (this.f113923f.getChildCount() < linkedList.size() + 1) {
                    ImageView imageView = new ImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(C0966R.dimen.f3864h5), getResources().getDimensionPixelSize(C0966R.dimen.f3864h5));
                    layoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(C0966R.dimen.f3858gx), 0);
                    layoutParams.gravity = 16;
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    this.f113923f.addView(imageView, 0, layoutParams);
                }
                int i = 0;
                while (i < linkedList.size()) {
                    ImageView imageView2 = (ImageView) this.f113923f.getChildAt(i);
                    C52645f a = C52645f.m59023a();
                    String str4 = linkedList.get(i).f127863d;
                    a.getClass();
                    C52645f.C52650d.C52651a aVar = new C52645f.C52650d.C52651a();
                    aVar.f147022c = true;
                    a.mo73595e(imageView2, str4, aVar.mo73598a(), (C52645f.C52652e) null);
                    imageView2.setVisibility(0);
                    i++;
                }
                while (i < this.f113923f.getChildCount() - 1) {
                    int i2 = i + 1;
                    View childAt = this.f113923f.getChildAt(i);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view = childAt;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/game/ui/GameFeedTitleDescView", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/game/ui/GameFeedTitleDescView", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i = i2;
                }
                if (!Util.isNullOrNil(str)) {
                    ((TextView) this.f113923f.getChildAt(i)).setText(str3);
                }
                this.f113921d.setVisibility(8);
            } else {
                this.f113923f.setVisibility(8);
                if (!Util.isNullOrNil(str)) {
                    this.f113921d.setText(str3);
                    this.f113921d.setVisibility(0);
                } else {
                    this.f113921d.setVisibility(8);
                }
            }
            if (!Util.isNullOrNil(str2)) {
                this.f113922e.setText(str2);
                this.f113922e.setVisibility(0);
            } else {
                this.f113922e.setVisibility(8);
            }
            TextView textView = this.f113921d;
            int h = (C52642c.m58990h(getContext()) - ((ViewGroup) getParent()).getPaddingLeft()) - ((ViewGroup) getParent()).getPaddingRight();
            if (!Util.isNullOrNil(str)) {
                c = textView.getPaint().measureText(str3) > ((float) h) ? (char) 2 : 1;
            }
            if (c > 1) {
                this.f113922e.setMaxLines(1);
            } else {
                this.f113922e.setMaxLines(2);
            }
        } else {
            setVisibility(8);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.aw9, this, true);
        this.f113923f = (LinearLayout) inflate.findViewById(C0966R.C0970id.l2m);
        this.f113921d = (TextView) inflate.findViewById(C0966R.C0970id.knx);
        this.f113922e = (TextView) inflate.findViewById(C0966R.C0970id.f357845c22);
    }
}
