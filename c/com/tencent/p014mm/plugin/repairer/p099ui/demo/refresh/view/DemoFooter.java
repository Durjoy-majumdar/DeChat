package com.tencent.p014mm.plugin.repairer.p099ui.demo.refresh.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kotlin.Metadata;
import oq3.C110058f;
import oq3.C21804c;
import oq3.C62151e;
import rq3.C22243b;
import rq3.C63509c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/view/DemoFooter;", "Landroid/widget/RelativeLayout;", "Loq3/c;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lrq3/c;", "getSpinnerStyle", "()Lrq3/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.refresh.view.DemoFooter */
public final class DemoFooter extends RelativeLayout implements C21804c {

    /* renamed from: d */
    public TextView f164022d;

    /* renamed from: e */
    public String f164023e;

    /* renamed from: f */
    public String f164024f;

    /* renamed from: g */
    public String f164025g;

    /* renamed from: h */
    public String f164026h;

    /* renamed from: i */
    public String f164027i;

    /* renamed from: j */
    public String f164028j;

    /* renamed from: n */
    public String f164029n;

    /* renamed from: o */
    public boolean f164030o;

    /* renamed from: p */
    public int f164031p = 500;

    public DemoFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(getContext(), C0966R.C0971layout.bse, this);
        View findViewById = findViewById(C0966R.C0970id.iv6);
        C87412m.m108593f(findViewById, "findViewById(R.id.rl_default_title)");
        TextView textView = (TextView) findViewById;
        this.f164022d = textView;
        this.f164023e = "上拉加载更多";
        this.f164024f = "释放立即加载";
        this.f164025g = "正在加载…";
        this.f164026h = "等待头部刷新完成…";
        this.f164027i = "加载完成";
        this.f164028j = "加载失败";
        this.f164029n = "没有更多数据了";
        textView.setText(isInEditMode() ? this.f164025g : this.f164023e);
    }

    /* renamed from: a */
    public void mo35206a(C110058f fVar, C22243b bVar, C22243b bVar2) {
        C87412m.m108594g(fVar, "refreshLayout");
        C87412m.m108594g(bVar, "oldState");
        C87412m.m108594g(bVar2, "newState");
        if (!this.f164030o) {
            int ordinal = bVar2.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                this.f164022d.setText(this.f164025g);
            } else if (ordinal == 3) {
                this.f164022d.setText(this.f164023e);
            } else if (ordinal == 7) {
                this.f164022d.setText(this.f164023e);
            } else if (ordinal == 10) {
                this.f164022d.setText(this.f164026h);
            } else if (ordinal == 11) {
                this.f164022d.setText(this.f164024f);
            }
        }
    }

    /* renamed from: b */
    public int mo34224b(C110058f fVar, boolean z) {
        C87412m.m108594g(fVar, "refreshLayout");
        if (this.f164030o) {
            return 0;
        }
        this.f164022d.setText(z ? this.f164027i : this.f164028j);
        return this.f164031p;
    }

    /* renamed from: c */
    public void mo34225c(C62151e eVar, int i, int i2) {
        C87412m.m108594g(eVar, "kernel");
    }

    /* renamed from: d */
    public boolean mo34223d(boolean z) {
        if (this.f164030o == z) {
            return true;
        }
        this.f164030o = z;
        if (z) {
            this.f164022d.setText(this.f164029n);
            return true;
        }
        this.f164022d.setText(this.f164023e);
        return true;
    }

    /* renamed from: e */
    public void mo34226e(float f, int i, int i2) {
    }

    /* renamed from: f */
    public boolean mo34227f() {
        return false;
    }

    /* renamed from: g */
    public void mo34228g(C110058f fVar, int i, int i2) {
        C87412m.m108594g(fVar, "refreshLayout");
    }

    public C63509c getSpinnerStyle() {
        return C63509c.f180133b;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public void mo34231h(C110058f fVar, int i, int i2) {
        C87412m.m108594g(fVar, "refreshLayout");
    }

    /* renamed from: i */
    public void mo34232i(boolean z, float f, int i, int i2, int i3) {
    }
}
