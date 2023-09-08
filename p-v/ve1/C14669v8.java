package ve1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dq1.C7461a;
import er1.C58784w3;
import er1.C7865r3;
import fe1.C58969q;
import fy3.C32224a;
import fy3.C32229r;
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
import sx3.C110818d0;
import te3.C64273c21;
import te3.C64689rq2;
import tf0.C13887q1;
import up1.C27696y;

/* renamed from: ve1.v8 */
public class C14669v8 extends C14514f3 {

    /* renamed from: r */
    public final int f40589r = C7865r3.f26468a.mo8970c();

    public C14669v8() {
        super(C0966R.C0971layout.abb, (C7461a) null, 0, (C32229r) null, (C32224a) null, 30, (C8480h) null);
    }

    /* renamed from: l */
    public void mo3149l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
        int i3;
        C64689rq2 rq22;
        int i4;
        FinderAuthInfo finderAuthInfo;
        C60905o oVar2 = oVar;
        BaseFinderFeed baseFinderFeed2 = baseFinderFeed;
        C27696y yVar = C27696y.RAW_IMAGE;
        C11978e0.C11979a aVar = C11978e0.C11979a.TIMELINE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(baseFinderFeed2, "item");
        super.mo44e(oVar, baseFinderFeed, i, i2, z, list);
        C64689rq2 rq23 = baseFinderFeed.mo3513o().isLiveFeed() ? (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getLiveMediaList()) : (C64689rq2) C110818d0.m150914L(baseFinderFeed.mo3513o().getMediaList());
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.kk6);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (C85875k4.m106157N()) {
            Context context = MMApplicationContext.getContext();
            i3 = C74942w4.m89784a(context, context.getResources().getConfiguration().screenWidthDp);
        } else {
            i3 = this.f40589r;
        }
        int dimension = (i3 - ((int) oVar2.f173499A.getResources().getDimension(C0966R.dimen.f3723cd))) / 2;
        int d = C58784w3.f168295a.mo83921d(baseFinderFeed2, rq23, dimension);
        if (d > 0) {
            layoutParams.width = dimension;
            layoutParams.height = d;
            imageView.setLayoutParams(layoutParams);
        }
        if (Util.isNullOrNil(rq23.f185283w)) {
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C62344b0(rq23, C27696y.THUMB_IMAGE, (String) null, (String) null, 12, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            rq22 = rq23;
            i4 = C0966R.C0970id.kk6;
        } else {
            i4 = C0966R.C0970id.kk6;
            rq22 = rq23;
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11986o0(rq23, yVar, (String) null, 4, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
        }
        ImageView imageView2 = (ImageView) oVar2.mo85812D(i4);
        String str = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
        if (Util.isNullOrNil(str)) {
            str = Util.nullAsNil(rq22.f185267e) + Util.nullAsNil(rq22.f185288z);
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
                C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
                C11984n0 n0Var = new C11984n0(str, yVar);
                C87412m.m108593f(imageView2, "thumbIv");
                f2.mo85957c(n0Var, imageView2, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                finderLiveOnliveWidget.setVisibility(8);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(D, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(8);
            } else {
                C7335d c = C86312j.m106911c(C13887q1.class);
                C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
                C87412m.m108593f(imageView2, "thumbIv");
                C13887q1.C13888a.m13309e((C13887q1) c, imageView2, str, 0, 4, (Object) null);
                finderLiveOnliveWidget.setVisibility(0);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                C117292a.m165358d(D, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            finderLiveOnliveWidget.setVisibility(8);
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(8);
            C117292a.m165358d(D, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(D, "com/tencent/mm/plugin/finder/convert/NearbyVideoFeedConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mediaType:");
        sb.append(baseFinderFeed.mo3513o().getMediaType());
        sb.append(",liveStatus:");
        C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
        CharSequence charSequence = null;
        sb.append(liveInfo2 != null ? Integer.valueOf(liveInfo2.f182394f) : null);
        sb.append(",contact liveStatus:");
        FinderContact refObjectContact = baseFinderFeed.mo3513o().getRefObjectContact();
        sb.append(refObjectContact != null ? Integer.valueOf(refObjectContact.liveStatus) : null);
        Log.m105924i("FinderFeedVideoRoundCornerConvert", sb.toString());
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.e3v);
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.fnp);
        TextView textView4 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        if (textView4 != null) {
            textView4.setMaxLines(2);
        }
        View D2 = oVar2.mo85812D(C0966R.C0970id.cz_);
        if (D2 != null) {
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
    }
}
