package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.ui.base.MMPageControlView */
public class MMPageControlView extends LinearLayout {

    /* renamed from: d */
    public Context f284230d;

    /* renamed from: e */
    public int f284231e;

    /* renamed from: f */
    public Map<Integer, ImageView> f284232f = new HashMap();

    /* renamed from: g */
    public ImageView f284233g;

    /* renamed from: h */
    public int f284234h = C0966R.C0971layout.bfw;

    public MMPageControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f284230d = context;
    }

    /* renamed from: a */
    public void mo131771a(int i) {
        removeAllViews();
        int i2 = this.f284231e;
        if (i < i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                this.f284233g = null;
                if (i == i3) {
                    if (((HashMap) this.f284232f).size() > i3) {
                        this.f284233g = (ImageView) ((HashMap) this.f284232f).get(Integer.valueOf(i3));
                    }
                    if (this.f284233g == null) {
                        this.f284233g = (ImageView) View.inflate(this.f284230d, this.f284234h, (ViewGroup) null).findViewById(C0966R.C0970id.gvo);
                        ((HashMap) this.f284232f).put(Integer.valueOf(i3), this.f284233g);
                    }
                    this.f284233g.setSelected(true);
                } else {
                    if (((HashMap) this.f284232f).size() > i3) {
                        this.f284233g = (ImageView) ((HashMap) this.f284232f).get(Integer.valueOf(i3));
                    }
                    if (this.f284233g == null) {
                        this.f284233g = (ImageView) View.inflate(this.f284230d, this.f284234h, (ViewGroup) null).findViewById(C0966R.C0970id.gvo);
                        ((HashMap) this.f284232f).put(Integer.valueOf(i3), this.f284233g);
                    }
                    this.f284233g.setSelected(false);
                }
                if (i3 == 0) {
                    this.f284233g.setPadding(0, 0, 0, 0);
                }
                addView(this.f284233g);
            }
        }
    }

    public void setIndicatorLayoutRes(int i) {
        this.f284234h = i;
    }

    public void setPage(int i) {
        mo131771a(i);
    }
}
