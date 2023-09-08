package com.tencent.p014mm.plugin.finder.view;

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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLiveMultiNoticeListFooter;", "Landroid/widget/RelativeLayout;", "Loq3/c;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lrq3/c;", "getSpinnerStyle", "()Lrq3/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderLiveMultiNoticeListFooter */
public final class FinderLiveMultiNoticeListFooter extends RelativeLayout implements C21804c {

    /* renamed from: d */
    public boolean f162111d;

    public FinderLiveMultiNoticeListFooter(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo35206a(C110058f fVar, C22243b bVar, C22243b bVar2) {
        TextView textView;
        C87412m.m108594g(fVar, "refreshLayout");
        C87412m.m108594g(bVar, "oldState");
        C87412m.m108594g(bVar2, "newState");
        if (this.f162111d) {
            return;
        }
        if ((bVar2 == C22243b.Loading || bVar2 == C22243b.LoadReleased) && (textView = (TextView) findViewById(C0966R.C0970id.iv6)) != null) {
            textView.setText(getContext().getString(C0966R.string.m47));
        }
    }

    /* renamed from: b */
    public int mo34224b(C110058f fVar, boolean z) {
        C87412m.m108594g(fVar, "refreshLayout");
        if (this.f162111d) {
            return 0;
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.iv6);
        if (textView == null) {
            return 500;
        }
        textView.setText(z ? getContext().getString(C0966R.string.m46) : getContext().getString(C0966R.string.m45));
        return 500;
    }

    /* renamed from: c */
    public void mo34225c(C62151e eVar, int i, int i2) {
        C87412m.m108594g(eVar, "kernel");
    }

    /* renamed from: d */
    public boolean mo34223d(boolean z) {
        if (this.f162111d == z) {
            return true;
        }
        this.f162111d = z;
        if (z) {
            TextView textView = (TextView) findViewById(C0966R.C0970id.iv6);
            if (textView == null) {
                return true;
            }
            textView.setText(getContext().getString(C0966R.string.m46));
            return true;
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.iv6);
        if (textView2 == null) {
            return true;
        }
        textView2.setText(getContext().getString(C0966R.string.f360603m43));
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

    public FinderLiveMultiNoticeListFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), C0966R.C0971layout.cld, this);
    }
}
