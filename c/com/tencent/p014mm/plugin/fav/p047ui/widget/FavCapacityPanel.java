package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import j20.C117292a;
import java.util.ArrayList;
import pb1.C100734q;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel */
public class FavCapacityPanel extends LinearLayout {

    /* renamed from: d */
    public LinearLayout f198046d = this;

    /* renamed from: e */
    public long f198047e;

    /* renamed from: f */
    public TextView f198048f;

    /* renamed from: g */
    public int f198049g = 0;

    /* renamed from: h */
    public long f198050h;

    /* renamed from: i */
    public View.OnClickListener f198051i = new C68927a();

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavCapacityPanel$a */
    public class C68927a implements View.OnClickListener {
        public C68927a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/widget/FavCapacityPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            if (FavCapacityPanel.this.f198049g == 0) {
                intent.putExtra("key_enter_fav_cleanui_from", 1);
            } else {
                intent.putExtra("key_enter_fav_cleanui_from", 2);
            }
            C100734q.m131875t0(FavCapacityPanel.this.getContext(), ".ui.FavCleanUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/widget/FavCapacityPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FavCapacityPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.a7a, (ViewGroup) null);
        inflate.measure(-2, -2);
        View findViewById = inflate.findViewById(C0966R.C0970id.cug);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.cuh);
        this.f198048f = (TextView) inflate.findViewById(C0966R.C0970id.cue);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.width = inflate.getMeasuredWidth();
        findViewById.setLayoutParams(layoutParams);
        findViewById2.setOnClickListener(this.f198051i);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.f198046d.addView(inflate, layoutParams2);
        this.f198047e = C100734q.m131814E() / 1048576;
        this.f198050h = C100734q.m131828S() / 1048576;
        TextView textView = this.f198048f;
        Context context2 = textView.getContext();
        Object[] objArr = new Object[2];
        long j = this.f198050h - this.f198047e;
        objArr[0] = Long.valueOf(j <= 0 ? 0 : j);
        objArr[1] = Long.valueOf(this.f198047e);
        textView.setText(context2.getString(C0966R.string.cm9, objArr));
    }
}
