package com.tencent.p014mm.plugin.finder.view.refreshloader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import gy3.C87412m;
import kotlin.Metadata;
import oq3.C110058f;
import oq3.C11723d;
import oq3.C62151e;
import rq3.C22243b;
import rq3.C63509c;
import wq3.C111847h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/refreshloader/FinderLiveSquareRefreshHeader;", "Landroid/widget/RelativeLayout;", "Loq3/d;", "", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "Lrq3/c;", "getSpinnerStyle", "()Lrq3/c;", "spinnerStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.refreshloader.FinderLiveSquareRefreshHeader */
public final class FinderLiveSquareRefreshHeader extends RelativeLayout implements C11723d, C111847h {

    /* renamed from: d */
    public TextView f162379d;

    /* renamed from: e */
    public MMProcessBar f162380e;

    public FinderLiveSquareRefreshHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo35206a(C110058f fVar, C22243b bVar, C22243b bVar2) {
        C87412m.m108594g(fVar, "refreshLayout");
        C87412m.m108594g(bVar, "oldState");
        C87412m.m108594g(bVar2, "newState");
        int ordinal = bVar2.ordinal();
        if (ordinal == 3) {
            MMProcessBar mMProcessBar = this.f162380e;
            if (mMProcessBar != null) {
                mMProcessBar.setVisibility(8);
            } else {
                C87412m.m108603p("loadingIcon");
                throw null;
            }
        } else if (ordinal == 5) {
            MMProcessBar mMProcessBar2 = this.f162380e;
            if (mMProcessBar2 == null) {
                C87412m.m108603p("loadingIcon");
                throw null;
            } else if (mMProcessBar2.getVisibility() != 0) {
                MMProcessBar mMProcessBar3 = this.f162380e;
                if (mMProcessBar3 != null) {
                    mMProcessBar3.setVisibility(0);
                } else {
                    C87412m.m108603p("loadingIcon");
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo34224b(C110058f fVar, boolean z) {
        C87412m.m108594g(fVar, "refreshLayout");
        MMProcessBar mMProcessBar = this.f162380e;
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(8);
            if (z) {
                return 0;
            }
            TextView textView = this.f162379d;
            if (textView != null) {
                textView.setVisibility(0);
                return 500;
            }
            C87412m.m108603p("headerTips");
            throw null;
        }
        C87412m.m108603p("loadingIcon");
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
        TextView textView = this.f162379d;
        if (textView != null) {
            textView.setVisibility(8);
        } else {
            C87412m.m108603p("headerTips");
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
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C0966R.C0970id.iji);
        C87412m.m108593f(findViewById, "findViewById(com.tencent…id.refresh_header_tip_tv)");
        this.f162379d = (TextView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.ive);
        C87412m.m108593f(findViewById2, "findViewById(R.id.rl_loading_icon)");
        MMProcessBar mMProcessBar = (MMProcessBar) findViewById2;
        this.f162380e = mMProcessBar;
        mMProcessBar.setVisibility(8);
    }

    public FinderLiveSquareRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), C0966R.C0971layout.ak8, this);
    }
}
