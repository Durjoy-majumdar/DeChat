package com.tencent.p014mm.plugin.ringtone.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import gy3.C87412m;
import kotlin.Metadata;
import oq3.C110058f;
import oq3.C11723d;
import oq3.C62151e;
import rq3.C22243b;
import rq3.C63509c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ringtone/widget/RingtoneRefreshHeader;", "Landroid/widget/RelativeLayout;", "Loq3/d;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lrq3/c;", "getSpinnerStyle", "()Lrq3/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.widget.RingtoneRefreshHeader */
public final class RingtoneRefreshHeader extends RelativeLayout implements C11723d {

    /* renamed from: d */
    public MMProcessBar f164161d;

    /* renamed from: e */
    public int f164162e;

    /* renamed from: f */
    public float f164163f;

    public RingtoneRefreshHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo35206a(C110058f fVar, C22243b bVar, C22243b bVar2) {
        C87412m.m108594g(fVar, "refreshLayout");
        C87412m.m108594g(bVar, "oldState");
        C87412m.m108594g(bVar2, "newState");
        int ordinal = bVar2.ordinal();
        if (ordinal == 3) {
            MMProcessBar mMProcessBar = this.f164161d;
            if (mMProcessBar != null) {
                mMProcessBar.setVisibility(8);
            } else {
                C87412m.m108603p("mProgressView");
                throw null;
            }
        } else if (ordinal == 5) {
            MMProcessBar mMProcessBar2 = this.f164161d;
            if (mMProcessBar2 != null) {
                mMProcessBar2.setVisibility(0);
            } else {
                C87412m.m108603p("mProgressView");
                throw null;
            }
        }
    }

    /* renamed from: b */
    public int mo34224b(C110058f fVar, boolean z) {
        C87412m.m108594g(fVar, "refreshLayout");
        MMProcessBar mMProcessBar = this.f164161d;
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(8);
            return 0;
        }
        C87412m.m108603p("mProgressView");
        throw null;
    }

    /* renamed from: c */
    public void mo34225c(C62151e eVar, int i, int i2) {
        C87412m.m108594g(eVar, "kernel");
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
        MMProcessBar mMProcessBar = this.f164161d;
        if (mMProcessBar != null) {
            mMProcessBar.mo82303c();
        } else {
            C87412m.m108603p("mProgressView");
            throw null;
        }
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
        int i4 = this.f164162e;
        if (i4 != 0) {
            MMProcessBar mMProcessBar = this.f164161d;
            if (mMProcessBar != null) {
                mMProcessBar.mo82301a(((float) (i - i4)) / this.f164163f);
            } else {
                C87412m.m108603p("mProgressView");
                throw null;
            }
        }
        this.f164162e = i;
    }

    public RingtoneRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), C0966R.C0971layout.cp4, this);
        View findViewById = findViewById(C0966R.C0970id.g3b);
        C87412m.m108593f(findViewById, "findViewById(R.id.loading_icon)");
        this.f164161d = (MMProcessBar) findViewById;
        this.f164163f = getResources().getDimension(C0966R.dimen.f3753d4);
    }
}
