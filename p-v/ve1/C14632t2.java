package ve1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import fe1.C58969q;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.List;
import jq3.C60905o;
import kf1.C9914ob;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62344b0;
import rx3.C13601g;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C51270sn1;
import te3.C52271zj0;
import te3.C64689rq2;
import up1.C27696y;

/* renamed from: ve1.t2 */
public class C14632t2 extends C14514f3 {

    /* renamed from: r */
    public final C13601g f40478r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14632t2(int r7, dq1.C7461a r8, fy3.C32229r r9, fy3.C32224a r10, int r11, gy3.C8480h r12) {
        /*
            r6 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0007
            r7 = -1
            r3 = -1
            goto L_0x0008
        L_0x0007:
            r3 = r7
        L_0x0008:
            r7 = r11 & 2
            if (r7 == 0) goto L_0x0011
            dq1.a r8 = new dq1.a
            r8.<init>()
        L_0x0011:
            r2 = r8
            r7 = r11 & 4
            r8 = 0
            if (r7 == 0) goto L_0x0019
            r4 = r8
            goto L_0x001a
        L_0x0019:
            r4 = r9
        L_0x001a:
            r7 = r11 & 8
            if (r7 == 0) goto L_0x0020
            r5 = r8
            goto L_0x0021
        L_0x0020:
            r5 = r10
        L_0x0021:
            java.lang.String r7 = "itemViewConfig"
            gy3.C87412m.m108594g(r2, r7)
            r1 = 2131494625(0x7f0c06e1, float:1.8612764E38)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            ve1.s2 r7 = ve1.C14625s2.f40465d
            rx3.g r7 = rx3.C36568h.m40985a(r7)
            r6.f40478r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14632t2.<init>(int, dq1.a, fy3.r, fy3.a, int, gy3.h):void");
    }

    /* renamed from: l */
    public void mo3149l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
        FinderAuthInfo finderAuthInfo;
        C51270sn1 sn12;
        C52271zj0 zj02;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(baseFinderFeed, "item");
        super.mo44e(oVar, baseFinderFeed, i, i2, z, list);
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList());
        ImageView imageView = (ImageView) oVar.mo85812D(C0966R.C0970id.kk6);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int intValue = (((Number) ((C36570n) this.f40478r).getValue()).intValue() - ((int) oVar.f173499A.getResources().getDimension(C0966R.dimen.f3723cd))) / 2;
        int d = C58784w3.f168295a.mo83921d(baseFinderFeed, rq22, intValue);
        if (d > 0) {
            layoutParams.width = intValue;
            layoutParams.height = d;
            imageView.setLayoutParams(layoutParams);
        }
        C39818r rVar = C39818r.f106831a;
        ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(this.f40239f.f25673e ? C11978e0.C11979a.DARK_TOW_FLOW_TIMELINE : C11978e0.C11979a.TOW_FLOW_TIMELINE));
        ImageIndicatorView imageIndicatorView = (ImageIndicatorView) oVar.mo85812D(C0966R.C0970id.f4i);
        if (C85875k4.m106211z()) {
            imageIndicatorView.f21262i = C0966R.color.BW_100_Alpha_0_0_5;
            imageIndicatorView.f21261h = C0966R.color.BW_100_Alpha_0_1_5;
        } else {
            imageIndicatorView.f21262i = C0966R.color.BW_0_Alpha_0_0_5;
            imageIndicatorView.f21261h = C0966R.color.BW_0_Alpha_0_1_5;
        }
        int i3 = 0;
        if (imageIndicatorView != null) {
            imageIndicatorView.setVisibility(0);
        }
        if (imageIndicatorView != null) {
            imageIndicatorView.f21258e = baseFinderFeed.mo3513o().getMediaList().size();
        }
        mo13774j(oVar, baseFinderFeed);
        C9914ob obVar = this.f40246p;
        CharSequence charSequence = null;
        if ((!Util.isNullOrNil((obVar == null || (sn12 = obVar.f30538a) == null || (zj02 = sn12.f141633w) == null) ? null : zj02.f146010i)) && imageIndicatorView != null) {
            imageIndicatorView.setBackgroundColor(oVar.f173499A.getResources().getColor(C0966R.color.f3391r7));
        }
        TextView textView = (TextView) oVar.mo85812D(C0966R.C0970id.e3v);
        TextView textView2 = (TextView) oVar.mo85812D(C0966R.C0970id.fnp);
        TextView textView3 = (TextView) oVar.mo85812D(C0966R.C0970id.d86);
        View D = oVar.mo85812D(C0966R.C0970id.cz_);
        if (D != null) {
            CharSequence text = textView != null ? textView.getText() : null;
            CharSequence charSequence2 = "";
            if (text == null) {
                text = charSequence2;
            }
            D.setTag(C0966R.C0970id.d58, text);
            C58969q l = baseFinderFeed.mo3507l();
            if (!(l == null || (finderAuthInfo = l.field_authInfo) == null)) {
                i3 = finderAuthInfo.authIconType;
            }
            D.setTag(C0966R.C0970id.d3i, Integer.valueOf(i3));
            Object text2 = textView2 != null ? textView2.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            D.setTag(C0966R.C0970id.f358033d40, text2);
            if (textView3 != null) {
                charSequence = textView3.getText();
            }
            if (charSequence != null) {
                charSequence2 = charSequence;
            }
            D.setTag(C0966R.C0970id.d3o, charSequence2);
            D.setTag(C0966R.C0970id.f358039d52, Integer.valueOf(baseFinderFeed.mo3513o().getMediaType()));
        }
        if (this.f40239f.f25673e) {
            int color = oVar.f173499A.getResources().getColor(C0966R.color.f2953a_);
            int color2 = oVar.f173499A.getResources().getColor(C0966R.color.f3586yk);
            View D2 = oVar.mo85812D(C0966R.C0970id.e2z);
            if (D2 != null) {
                D2.setBackgroundColor(color);
            }
            View D3 = oVar.mo85812D(C0966R.C0970id.i79);
            if (D3 != null) {
                D3.setBackgroundColor(color);
            }
            View D4 = oVar.mo85812D(C0966R.C0970id.i5a);
            if (D4 != null) {
                D4.setBackgroundColor(color);
            }
            TextView textView4 = (TextView) oVar.mo85812D(C0966R.C0970id.e3v);
            if (textView4 != null) {
                textView4.setTextColor(color2);
            }
            TextView textView5 = (TextView) oVar.mo85812D(C0966R.C0970id.d86);
            if (textView5 != null) {
                textView5.setTextColor(color2);
            }
            TextView textView6 = (TextView) oVar.mo85812D(C0966R.C0970id.e4f);
            if (textView6 != null) {
                textView6.setTextColor(color2);
            }
            TextView textView7 = (TextView) oVar.mo85812D(C0966R.C0970id.e46);
            if (textView7 != null) {
                textView7.setTextColor(color2);
            }
            ImageIndicatorView imageIndicatorView2 = (ImageIndicatorView) oVar.mo85812D(C0966R.C0970id.f4i);
            if (imageIndicatorView2 != null) {
                imageIndicatorView2.setBackgroundColor(color);
                imageIndicatorView2.f21262i = C0966R.color.BW_100_Alpha_0_0_5;
                imageIndicatorView2.f21261h = C0966R.color.BW_100_Alpha_0_1_5;
            }
        }
    }
}
