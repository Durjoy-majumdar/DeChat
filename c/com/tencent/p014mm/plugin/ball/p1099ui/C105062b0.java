package com.tencent.p014mm.plugin.ball.p1099ui;

import android.app.Activity;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import aw0.C103926n;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.ball.view.FloatIndicatorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import kg3.C76577a;
import uv0.C111237j;
import yv0.C112508e;

/* renamed from: com.tencent.mm.plugin.ball.ui.b0 */
public class C105062b0 {

    /* renamed from: a */
    public C111237j f311831a;

    /* renamed from: b */
    public FloatIndicatorView f311832b;

    /* renamed from: c */
    public int f311833c;

    /* renamed from: d */
    public int f311834d;

    /* renamed from: e */
    public FrameLayout.LayoutParams f311835e;

    /* renamed from: f */
    public boolean f311836f;

    /* renamed from: com.tencent.mm.plugin.ball.ui.b0$a */
    public class C105063a implements C111237j.C52621a {
        public C105063a(C105062b0 b0Var) {
        }
    }

    public C105062b0(C111237j jVar, C112508e eVar) {
        this.f311831a = jVar;
        FloatIndicatorView floatIndicatorView = new FloatIndicatorView(this.f311831a.getActivity(), (AttributeSet) null);
        this.f311832b = floatIndicatorView;
        floatIndicatorView.setOnOrientationChangedListener(new C105060a0(this));
        mo149214b(C76577a.m92145A(MMApplicationContext.getContext()) > C76577a.m92159j(MMApplicationContext.getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.f311835e = layoutParams;
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = this.f311834d;
        layoutParams.rightMargin = this.f311833c;
        this.f311832b.setLayoutParams(layoutParams);
        Log.m105925i("MicroMsg.FloatIndicatorController", "createFloatIndicator layoutParams, right:%s, bottom:%s", Integer.valueOf(this.f311835e.rightMargin), Integer.valueOf(this.f311835e.bottomMargin));
    }

    /* renamed from: a */
    public void mo149213a() {
        Log.m105924i("MicroMsg.FloatIndicatorController", "start FloatIndicatorController");
        if (this.f311831a.mo23516g()) {
            this.f311831a.mo23514e(new C105063a(this));
            FloatIndicatorView floatIndicatorView = this.f311832b;
            if (floatIndicatorView != null) {
                floatIndicatorView.setVisibility(8);
                ViewGroup b = this.f311831a.mo23512b();
                try {
                    if (this.f311832b.getParent() == null) {
                        int childCount = b.getChildCount();
                        int i = 0;
                        while (true) {
                            if (i >= b.getChildCount()) {
                                break;
                            } else if (b.getChildAt(i) instanceof SwipeBackLayout) {
                                childCount = i + 1;
                                break;
                            } else {
                                i++;
                            }
                        }
                        b.addView(this.f311832b, childCount);
                        return;
                    }
                    Log.m105928w("MicroMsg.FloatIndicatorController", "attachFloatIndicatorView, already attached");
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.FloatIndicatorController", e, "attachFloatIndicatorView exception:%s", e);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo149214b(boolean z) {
        int i = 0;
        Log.m105925i("MicroMsg.FloatIndicatorController", "updateOrientation, isLandscape:%b", Boolean.valueOf(z));
        this.f311836f = z;
        Activity activity = this.f311831a.getActivity();
        int i2 = C103926n.f307291a;
        try {
            i = C75044y4.m89991c(activity);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.FloatBallViewConstants", "getNavigationBarHeight exception:%s", e);
        }
        C103926n.f307300j = i;
        if (this.f311836f) {
            int i3 = C103926n.f307296f;
            this.f311834d = -i3;
            this.f311833c = (this.f311831a.mo35652a() >= 0 ? this.f311831a.mo35652a() : C103926n.f307300j) - i3;
            return;
        }
        int i4 = C103926n.f307296f;
        this.f311833c = -i4;
        this.f311834d = (this.f311831a.mo35652a() >= 0 ? this.f311831a.mo35652a() : C103926n.f307300j) - i4;
    }
}
