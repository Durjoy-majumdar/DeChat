package com.tencent.p014mm.plugin.finder.live.view;

import a14.C53973z1;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import nj3.C76912y0;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C50912q41;

/* renamed from: com.tencent.mm.plugin.finder.live.view.q1 */
public final class C3228q1 extends C87413o implements C32228q<Boolean, String, C50912q41, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C53973z1 f15348d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<C89779i0> f15349e;

    /* renamed from: f */
    public final /* synthetic */ C32227p<Boolean, Long, C13598b0> f15350f;

    /* renamed from: g */
    public final /* synthetic */ long f15351g;

    /* renamed from: h */
    public final /* synthetic */ FinderLiveProductRecordView f15352h;

    /* renamed from: i */
    public final /* synthetic */ int f15353i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3228q1(C53973z1 z1Var, C8479f0<C89779i0> f0Var, C32227p<? super Boolean, ? super Long, C13598b0> pVar, long j, FinderLiveProductRecordView finderLiveProductRecordView, int i) {
        super(3);
        this.f15348d = z1Var;
        this.f15349e = f0Var;
        this.f15350f = pVar;
        this.f15351g = j;
        this.f15352h = finderLiveProductRecordView;
        this.f15353i = i;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        C87412m.m108594g(str, "errMsg");
        C87412m.m108594g((C50912q41) obj3, "<anonymous parameter 2>");
        boolean z = true;
        C53973z1.C53974a.m60623a(this.f15348d, (CancellationException) null, 1, (Object) null);
        C89779i0 i0Var = (C89779i0) this.f15349e.f27484d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f15350f.invoke(Boolean.valueOf(booleanValue), Long.valueOf(this.f15351g));
        if (!booleanValue) {
            if (str.length() <= 0) {
                z = false;
            }
            if (!z) {
                str = null;
            }
            if (str == null) {
                FinderLiveProductRecordView finderLiveProductRecordView = this.f15352h;
                int i = this.f15353i;
                switch (i) {
                    case 105:
                        FinderLiveProductRecordView.m64007e(finderLiveProductRecordView, C0966R.string.e3_);
                        break;
                    case 106:
                        FinderLiveProductRecordView.m64007e(finderLiveProductRecordView, C0966R.string.e3a);
                        break;
                    case 107:
                        FinderLiveProductRecordView.m64007e(finderLiveProductRecordView, C0966R.string.e38);
                        break;
                    default:
                        C76912y0.makeText(finderLiveProductRecordView.getContext(), (CharSequence) "cmdId:" + i + " failed", 0);
                        break;
                }
            } else {
                FinderLiveProductRecordView finderLiveProductRecordView2 = this.f15352h;
                int i2 = FinderLiveProductRecordView.f159795r;
                Toast makeText = C76912y0.makeText(finderLiveProductRecordView2.getContext(), (CharSequence) str, 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
        }
        return C13598b0.f38549a;
    }
}
