package ve1;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0791x0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import ok1.C62042e;
import p629ny.C76979h;
import te3.C48770aw0;
import te3.C49765hx0;
import wk1.C15440n;
import wk1.C15483x;
import wk1.C15484y;

/* renamed from: ve1.u4 */
public final class C14649u4 extends C60896i<C0791x0> {

    /* renamed from: e */
    public final String f40526e = "FinderLiveWeCoinHotConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f359768al2;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C0791x0 x0Var;
        C0791x0 x0Var2;
        LinkedList<C48770aw0> linkedList;
        int i3;
        FinderContact finderContact;
        C60905o oVar2 = oVar;
        int i4 = i;
        C0791x0 x0Var3 = (C0791x0) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(x0Var3, "item");
        if (i4 == 0) {
            RelativeLayout relativeLayout = (RelativeLayout) oVar2.mo85812D(C0966R.C0970id.e26);
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.e27);
            if (textView != null) {
                textView.setText(oVar2.f173499A.getResources().getString(C0966R.string.eah, new Object[]{C62042e.f176370a.mo87005G((long) x0Var3.f1847d)}));
            }
            TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.f358249e23);
            if (textView2 != null) {
                textView2.setText(oVar2.f173499A.getResources().getString(C0966R.string.mgl, new Object[]{Long.valueOf(x0Var3.f1848e)}));
            }
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) oVar2.mo85812D(C0966R.C0970id.e26);
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.e2_);
        if (textView3 != null) {
            C49765hx0 hx02 = x0Var3.f1849f.f138455d;
            C48770aw0 aw02 = hx02 != null ? hx02.f134924i : null;
            int i5 = aw02 != null ? aw02.f130789d : 0;
            int i6 = aw02 != null ? aw02.f130791f : 0;
            int i7 = hx02 != null ? hx02.f134922g : 0;
            C62042e eVar = C62042e.f176370a;
            String str = this.f40526e;
            StringBuilder sb = new StringBuilder();
            sb.append("setRankTv contact is empty:");
            sb.append(hx02 == null);
            sb.append(",position:");
            sb.append(i4);
            sb.append(",badgeType:");
            sb.append(i5);
            sb.append(",badgeLevel:");
            sb.append(i6);
            x0Var = x0Var3;
            sb.append(",rewardAmount:");
            sb.append(i7);
            eVar.mo86998D1(str, sb.toString());
            if (i7 > 0) {
                int i8 = i4 + 1;
                textView3.setText(String.valueOf(i8));
                if (i8 == 1) {
                    textView3.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3406rr));
                    textView3.setTextSize(1, 22.0f);
                } else if (i8 == 2) {
                    textView3.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3408rt));
                    textView3.setTextSize(1, 22.0f);
                } else if (i8 != 3) {
                    textView3.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
                    textView3.setTextSize(1, 15.0f);
                } else {
                    textView3.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3407rs));
                    textView3.setTextSize(1, 22.0f);
                }
            } else {
                boolean z2 = true;
                String str2 = this.f40526e;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("setRankTv contact is empty:");
                if (hx02 != null) {
                    z2 = false;
                }
                sb4.append(z2);
                sb4.append(",position:");
                sb4.append(i4);
                sb4.append(",badgeType:");
                sb4.append(i5);
                sb4.append(",badgeLevel:");
                sb4.append(i6);
                sb4.append(",rewardAmount:");
                sb4.append(i7);
                Log.m105920e(str2, sb4.toString());
            }
        } else {
            x0Var = x0Var3;
        }
        TextView textView4 = (TextView) oVar2.mo85812D(C0966R.C0970id.e25);
        if (textView4 != null) {
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Context context = oVar2.f173499A;
            x0Var2 = x0Var;
            C49765hx0 hx03 = x0Var2.f1849f.f138455d;
            textView4.setText(hVar.yp0(context, (hx03 == null || (finderContact = hx03.f134919d) == null) ? null : finderContact.nickname, textView4.getTextSize()));
        } else {
            x0Var2 = x0Var;
        }
        TextView textView5 = (TextView) oVar2.mo85812D(C0966R.C0970id.f358250e24);
        if (textView5 != null) {
            C49765hx0 hx04 = x0Var2.f1849f.f138455d;
            textView5.setText(String.valueOf(hx04 != null ? Integer.valueOf(hx04.f134922g) : null));
        }
        C49765hx0 hx05 = x0Var2.f1849f.f138455d;
        if ((hx05 != null ? hx05.f134926n : 0) == 3) {
            WeImageView weImageView = (WeImageView) oVar2.mo85812D(C0966R.C0970id.d_n);
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
        } else {
            WeImageView weImageView2 = (WeImageView) oVar2.mo85812D(C0966R.C0970id.d_n);
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
        }
        TextView textView6 = (TextView) oVar2.mo85812D(C0966R.C0970id.epp);
        if (textView6 != null) {
            C15440n nVar = C15440n.f41895a;
            View D = oVar2.mo85812D(C0966R.C0970id.epp);
            Context context2 = oVar2.f44854d.getContext();
            C87412m.m108593f(context2, "holder.itemView.context");
            C49765hx0 hx06 = x0Var2.f1849f.f138455d;
            if (hx06 != null) {
                linkedList = hx06.f134930r;
                i3 = 2;
            } else {
                i3 = 2;
                linkedList = null;
            }
            int[] iArr = new int[i3];
            // fill-array-data instruction
            iArr[0] = 2;
            iArr[1] = 4;
            textView6.setText((CharSequence) C15440n.m14440c(nVar, D, context2, " ", linkedList, iArr, (C15483x) null, (C15484y) null, 96, (Object) null).f38555d);
        }
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.e2_);
        C85875k4.m106189j0(textView != null ? textView.getPaint() : null, 0.8f);
    }
}
