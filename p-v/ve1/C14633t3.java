package ve1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58784w3;
import fe1.C58969q;
import fy3.C32227p;
import gr1.C59667n2;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import java.util.List;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11986o0;
import pl1.C11990s0;
import pl1.C62344b0;
import rx3.C13601g;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C64273c21;
import te3.C64689rq2;
import tf0.C13887q1;
import up1.C27696y;

/* renamed from: ve1.t3 */
public class C14633t3 extends C14514f3 {

    /* renamed from: r */
    public final FinderVideoCore f40479r;

    /* renamed from: s */
    public final C13601g f40480s;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14633t3(int r9, dq1.C7461a r10, com.tencent.p014mm.plugin.finder.video.FinderVideoCore r11, fy3.C32229r r12, int r13, gy3.C8480h r14) {
        /*
            r8 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0007
            r9 = -1
            r3 = -1
            goto L_0x0008
        L_0x0007:
            r3 = r9
        L_0x0008:
            r9 = r13 & 2
            if (r9 == 0) goto L_0x0011
            dq1.a r10 = new dq1.a
            r10.<init>()
        L_0x0011:
            r2 = r10
            r9 = r13 & 8
            if (r9 == 0) goto L_0x0017
            r12 = 0
        L_0x0017:
            r4 = r12
            java.lang.String r9 = "itemViewConfig"
            gy3.C87412m.m108594g(r2, r9)
            r1 = 2131494627(0x7f0c06e3, float:1.8612768E38)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f40479r = r11
            ve1.s3 r9 = ve1.C14626s3.f40466d
            rx3.g r9 = rx3.C36568h.m40985a(r9)
            r8.f40480s = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C14633t3.<init>(int, dq1.a, com.tencent.mm.plugin.finder.video.FinderVideoCore, fy3.r, int, gy3.h):void");
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a);
        if (finderVideoLayout != null) {
            finderVideoLayout.mo79539A();
        }
    }

    /* renamed from: l */
    public void mo3149l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
        FinderAuthInfo finderAuthInfo;
        FinderVideoLayout finderVideoLayout;
        C60905o oVar2 = oVar;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C11978e0.C11979a aVar = C11978e0.C11979a.DARK_TOW_FLOW_TIMELINE;
        C11978e0.C11979a aVar2 = C11978e0.C11979a.TOW_FLOW_TIMELINE;
        C27696y yVar = C27696y.RAW_IMAGE;
        Class<C60200t1> cls = C60200t1.class;
        Class cls2 = C11990s0.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed2, "item");
        super.mo44e(oVar, baseFinderFeed, i, i2, z, list);
        C64689rq2 rq22 = (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList());
        FinderVideoLayout finderVideoLayout2 = (FinderVideoLayout) oVar2.mo85812D(C0966R.C0970id.d7a);
        ViewGroup.LayoutParams layoutParams = finderVideoLayout2.getLayoutParams();
        int intValue = (((Number) ((C36570n) this.f40480s).getValue()).intValue() - ((int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3723cd))) / 2;
        int d = C58784w3.f168295a.mo83921d(baseFinderFeed2, rq22, intValue);
        if (d > 0) {
            layoutParams.width = intValue;
            layoutParams.height = d;
            finderVideoLayout2.setLayoutParams(layoutParams);
        }
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.kk8);
        if (baseFinderFeed.mo3513o().isLiveFeed()) {
            ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.kk6);
            String str = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
            if (Util.isNullOrNil(str)) {
                str = rq22.f185267e + Util.nullAsNil(rq22.f185288z);
            }
            FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) oVar2.mo85812D(C0966R.C0970id.dr9);
            View D = oVar2.mo85812D(C0966R.C0970id.dv9);
            TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
            if (baseFinderFeed.mo3513o().isLiveFeed()) {
                C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                boolean z2 = true;
                if (liveInfo == null || liveInfo.f182394f != 1) {
                    z2 = false;
                }
                if (z2) {
                    C39818r rVar = C39818r.f106831a;
                    C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11871f2();
                    C11984n0 n0Var = new C11984n0(str, yVar);
                    C87412m.m108593f(imageView2, "thumbIv");
                    f2.mo85957c(n0Var, imageView2, ((C11990s0) rVar.mo62446e(cls).mo62447c(cls2)).mo11867O2(this.f40239f.f25673e ? C11978e0.C11979a.DARK_COMMON : C11978e0.C11979a.COMMON));
                    finderLiveOnliveWidget.setVisibility(8);
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view = D;
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert2", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert2", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView.setVisibility(8);
                } else {
                    C7335d c = C86312j.m106911c(C13887q1.class);
                    C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
                    C87412m.m108593f(imageView2, "thumbIv");
                    C13887q1.C13888a.m13309e((C13887q1) c, imageView2, str, 0, 4, (Object) null);
                    finderLiveOnliveWidget.setVisibility(0);
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view2 = D;
                    C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert2", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert2", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                finderLiveOnliveWidget.setVisibility(8);
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(8);
                View view3 = D;
                C117292a.m165358d(view3, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert2", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedVideoRoundCornerConvert2", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (Util.isNullOrNil(rq22.f185283w)) {
                C62344b0 b0Var = new C62344b0(rq22, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null);
                C60979d<C100810g0> f25 = ((C11990s0) C39818r.f106831a.mo62446e(cls).mo62447c(cls2)).mo11871f2();
                C87412m.m108593f(imageView, "thumbIv");
                if (!this.f40239f.f25673e) {
                    aVar = aVar2;
                }
                f25.mo85957c(b0Var, imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
                finderVideoLayout = finderVideoLayout2;
            } else {
                ImageView imageView3 = imageView;
                finderVideoLayout = finderVideoLayout2;
                C11986o0 o0Var = new C11986o0(rq22, yVar, (String) null, 4, (C8480h) null);
                C60979d<C100810g0> f26 = ((C11990s0) C39818r.f106831a.mo62446e(cls).mo62447c(cls2)).mo11871f2();
                C87412m.m108593f(imageView3, "thumbIv");
                if (!this.f40239f.f25673e) {
                    aVar = aVar2;
                }
                f26.mo85957c(o0Var, imageView3, ((C11990s0) C39818r.f106831a.mo62446e(cls).mo62447c(cls2)).mo11867O2(aVar));
            }
            FinderVideoCore finderVideoCore = this.f40479r;
            if (finderVideoCore != null) {
                finderVideoLayout.setVideoCore(finderVideoCore);
                FinderVideoLayout.m65083p(finderVideoLayout, 0, FeedData.Companion.mo78884b(baseFinderFeed.mo3513o()), (C59667n2) null, 0, true, (C32227p) null, (C32227p) null, false, false, 108, (Object) null);
            }
        }
        mo13774j(oVar, baseFinderFeed);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.e3v);
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.fnp);
        TextView textView4 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        View D2 = oVar2.mo85812D(C0966R.C0970id.cz_);
        if (D2 != null) {
            CharSequence charSequence = null;
            CharSequence text = textView2 != null ? textView2.getText() : null;
            CharSequence charSequence2 = "";
            if (text == null) {
                text = charSequence2;
            }
            D2.setTag(C0966R.C0970id.d58, text);
            C58969q l = baseFinderFeed.mo3507l();
            D2.setTag(C0966R.C0970id.d3i, Integer.valueOf((l == null || (finderAuthInfo = l.field_authInfo) == null) ? 0 : finderAuthInfo.authIconType));
            Object text2 = textView3 != null ? textView3.getText() : null;
            if (text2 == null) {
                text2 = "0";
            }
            D2.setTag(C0966R.C0970id.f358033d40, text2);
            if (textView4 != null) {
                charSequence = textView4.getText();
            }
            if (charSequence != null) {
                charSequence2 = charSequence;
            }
            D2.setTag(C0966R.C0970id.d3o, charSequence2);
            D2.setTag(C0966R.C0970id.f358039d52, Integer.valueOf(baseFinderFeed.mo3513o().getMediaType()));
        }
        if (this.f40239f.f25673e) {
            int color = oVar2.f173499A.getResources().getColor(C0966R.color.f2953a_);
            int color2 = oVar2.f173499A.getResources().getColor(C0966R.color.f3586yk);
            View D3 = oVar2.mo85812D(C0966R.C0970id.e2z);
            if (D3 != null) {
                D3.setBackgroundColor(color);
            }
            View D4 = oVar2.mo85812D(C0966R.C0970id.i79);
            if (D4 != null) {
                D4.setBackgroundColor(color);
            }
            View D5 = oVar2.mo85812D(C0966R.C0970id.i5a);
            if (D5 != null) {
                D5.setBackgroundColor(color);
            }
            TextView textView5 = (TextView) oVar2.mo85812D(C0966R.C0970id.e3v);
            if (textView5 != null) {
                textView5.setTextColor(color2);
            }
            TextView textView6 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
            if (textView6 != null) {
                textView6.setTextColor(color2);
            }
            TextView textView7 = (TextView) oVar2.mo85812D(C0966R.C0970id.e4f);
            if (textView7 != null) {
                textView7.setTextColor(color2);
            }
            TextView textView8 = (TextView) oVar2.mo85812D(C0966R.C0970id.e46);
            if (textView8 != null) {
                textView8.setTextColor(color2);
            }
            ImageIndicatorView imageIndicatorView = (ImageIndicatorView) oVar2.mo85812D(C0966R.C0970id.f4i);
            if (imageIndicatorView != null) {
                imageIndicatorView.setBackgroundColor(color);
            }
        }
    }
}
