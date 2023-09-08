package nm1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C58784w3;
import er1.C7878t0;
import fe1.C58960c;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8809w2;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kf1.C10072zb;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64273c21;
import te3.C64689rq2;
import tf0.C13887q1;
import up1.C27696y;
import wc1.C15064b;

/* renamed from: nm1.c */
public final class C11226c extends C60896i<C10072zb> {

    /* renamed from: e */
    public final boolean f33084e;

    /* renamed from: f */
    public final int f33085f;

    /* renamed from: g */
    public final float f33086g;

    /* renamed from: h */
    public final C32227p<Long, String, C13598b0> f33087h;

    /* renamed from: i */
    public final float f33088i;

    /* renamed from: j */
    public ViewGroup f33089j;

    public C11226c(boolean z, int i, float f, C32227p pVar, int i2, C8480h hVar) {
        z = (i2 & 1) != 0 ? false : z;
        f = (i2 & 4) != 0 ? 1.7776f : f;
        C87412m.m108594g(pVar, "jumProfileCallback");
        this.f33084e = z;
        this.f33085f = i;
        this.f33086g = f;
        this.f33087h = pVar;
        this.f33088i = MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3723cd);
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.cn8;
    }

    /* renamed from: e */
    public void mo44e(C60905o oVar, C9493c cVar, int i, int i2, boolean z, List list) {
        C60905o oVar2 = oVar;
        C10072zb zbVar = (C10072zb) cVar;
        C87412m.m108594g(oVar2, "holder");
        C87412m.m108594g(zbVar, "item");
        String str = "";
        oVar2.f44854d.setTag(C0966R.C0970id.hac, str);
        oVar2.f44854d.setTag(C0966R.C0970id.hab, str);
        oVar2.f44854d.setTag(C0966R.C0970id.haa, str);
        this.f33089j = (ViewGroup) oVar2.f44854d.findViewById(C0966R.C0970id.hae);
        C64689rq2 rq22 = zbVar.mo3513o().isLiveFeed() ? (C64689rq2) C110818d0.m150914L(zbVar.mo3513o().getLiveMediaList()) : (C64689rq2) C110818d0.m150914L(zbVar.mo3513o().getMediaList());
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.d78);
        C39818r rVar = C39818r.f106831a;
        C60979d<C100810g0> i25 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
        FinderContact finderContact = zbVar.mo3513o().getFeedObject().contact;
        String str2 = null;
        C62345f fVar = new C62345f(Util.nullAsNil(finderContact != null ? finderContact.headUrl : null), C27696y.SMALL_AVATAR_IMAGE);
        C87412m.m108593f(imageView, "avatar");
        i25.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        imageView.setOnClickListener(new C11224a(zbVar, oVar2, this));
        TextView textView = (TextView) oVar2.mo85812D(C0966R.C0970id.e3v);
        TextView textView2 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        C15064b bVar = C15064b.f41199a;
        Context context = oVar2.f173499A;
        C87412m.m108593f(context, "holder.context");
        C15064b.m14230a(bVar, context, textView, 14.0f, 0.0f, 8, (Object) null);
        textView.setText(zbVar.mo3513o().getNickNameSpan());
        ViewGroup viewGroup = this.f33089j;
        if (viewGroup != null) {
            viewGroup.setTag(C0966R.C0970id.d58, textView.getText());
        }
        C85875k4.m106189j0(textView2.getPaint(), 0.8f);
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        textView.setOnClickListener(new C11225b(zbVar, oVar2, this));
        FinderContact finderContact2 = zbVar.mo3513o().getFeedObject().contact;
        if (finderContact2 != null) {
            FinderAuthInfo finderAuthInfo = finderContact2.authInfo;
            int i3 = finderAuthInfo != null ? finderAuthInfo.authIconType : 0;
            ViewGroup viewGroup2 = this.f33089j;
            if (viewGroup2 != null) {
                viewGroup2.setTag(C0966R.C0970id.d3i, Integer.valueOf(i3));
            }
            C58784w3 w3Var = C58784w3.f168295a;
            View D = oVar2.mo85812D(C0966R.C0970id.a0g);
            C87412m.m108593f(D, "holder.getView(R.id.auth_icon)");
            C58784w3.m68429F1(w3Var, (ImageView) D, finderContact2.authInfo, 0, C58960c.m68829a(finderContact2, false), 4, (Object) null);
        }
        TextView textView3 = (TextView) oVar2.mo85812D(C0966R.C0970id.d86);
        if (!Util.isNullOrNil(zbVar.mo3513o().getDescription())) {
            textView3.setVisibility(0);
            textView3.setText(zbVar.mo3513o().getDescriptionSpan());
        } else {
            textView3.setVisibility(8);
        }
        try {
            mo11308j(oVar2, rq22, zbVar);
        } catch (Throwable unused) {
            Log.m105928w("Finder.Loader", "bindCover throw Throwable.");
        }
        FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) oVar2.mo85812D(C0966R.C0970id.dr9);
        View D2 = oVar2.mo85812D(C0966R.C0970id.dv8);
        boolean z2 = true;
        if (zbVar.mo3513o().isLiveFeed()) {
            C64273c21 liveInfo = zbVar.mo3513o().getLiveInfo();
            if (liveInfo != null && liveInfo.f182394f == 1) {
                finderLiveOnliveWidget.setVisibility(8);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = D2;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                finderLiveOnliveWidget.setVisibility(0);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view2 = D2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            finderLiveOnliveWidget.setVisibility(8);
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view3 = D2;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            D2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/nearby/live/convert/NearbyFinderRelatedLivingConvert", "bindLive", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/LocalFinderMedia;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        Context context2 = oVar2.f44854d.getContext();
        MMFinderUI mMFinderUI = context2 instanceof MMFinderUI ? (MMFinderUI) context2 : null;
        if (mMFinderUI != null && (zbVar.mo3513o().getFeedObject().block_cgi_flag & 1) == 0) {
            C8809w2 w2Var = (C8809w2) C39818r.f106831a.mo62444c(mMFinderUI).mo62447c(C8809w2.class);
            long id = zbVar.mo3513o().getId();
            String objectNonceId = zbVar.mo3513o().getObjectNonceId();
            C64273c21 liveInfo2 = zbVar.mo3513o().getLiveInfo();
            w2Var.mo9637P0(id, objectNonceId, liveInfo2 != null ? liveInfo2.f182392d : 0, mMFinderUI);
        }
        String str3 = zbVar.mo3513o().getFeedObject().recommendReason;
        if (str3 == null) {
            str3 = str;
        }
        TextView textView4 = (TextView) oVar2.mo85812D(C0966R.C0970id.if8);
        if (textView4 != null) {
            String str4 = zbVar.mo3513o().getFeedObject().recommendReason;
            if (str4 != null) {
                str = str4;
            }
            textView4.setText(str);
        }
        if (textView4 != null) {
            textView4.setVisibility(str3.length() == 0 ? 8 : 0);
        }
        TextView textView5 = (TextView) oVar2.mo85812D(C0966R.C0970id.lkm);
        C64273c21 liveInfo3 = zbVar.mo3513o().getLiveInfo();
        int i4 = liveInfo3 != null ? liveInfo3.f182403q : 0;
        C64273c21 liveInfo4 = zbVar.mo3513o().getLiveInfo();
        if (liveInfo4 != null) {
            str2 = liveInfo4.f182411x0;
        }
        if ((str2 == null || str2.length() == 0) && i4 > 0) {
            str2 = C7878t0.m8033b(i4);
        }
        if (!(str2 == null || str2.length() == 0)) {
            z2 = false;
        }
        if (!z2) {
            textView5.setText(str2);
            textView5.setVisibility(0);
            return;
        }
        textView5.setVisibility(8);
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: j */
    public final void mo11308j(C60905o oVar, C64689rq2 rq22, C10072zb zbVar) {
        String str;
        String str2;
        String str3;
        FinderObjectDesc finderObjectDesc;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        FinderObjectDesc finderObjectDesc2;
        LinkedList<FinderMedia> linkedList2;
        FinderMedia finderMedia2;
        FinderObjectDesc finderObjectDesc3;
        LinkedList<FinderMedia> linkedList3;
        FinderMedia finderMedia3;
        C60905o oVar2 = oVar;
        C64689rq2 rq23 = rq22;
        C10072zb zbVar2 = zbVar;
        ImageView imageView = (ImageView) oVar2.mo85812D(C0966R.C0970id.kk6);
        View D = oVar2.mo85812D(C0966R.C0970id.fwx);
        if (imageView == null) {
            Log.m105928w("Finder.Loader", "bindCover return for thumbIv is null.");
            return;
        }
        int i = (this.f33085f - ((int) this.f33088i)) / 2;
        float f = ((float) i) * 0.6666f * this.f33086g;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = (int) f;
        layoutParams.height = i2;
        imageView.setLayoutParams(layoutParams);
        D.getLayoutParams().width = layoutParams.width;
        D.getLayoutParams().height = layoutParams.height;
        ((ViewGroup) oVar2.mo85812D(C0966R.C0970id.m_e)).getLayoutParams().height = i2;
        ViewGroup viewGroup = this.f33089j;
        ViewGroup.LayoutParams layoutParams2 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = i;
        }
        ViewGroup viewGroup2 = this.f33089j;
        ViewGroup.LayoutParams layoutParams3 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (((float) ((this.f33085f - (((int) this.f33088i) * 2)) / 2)) * this.f33086g);
        }
        ImageView imageView2 = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_l);
        imageView2.getLayoutParams().height = layoutParams.height / 3;
        ImageView imageView3 = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_m);
        imageView3.getLayoutParams().height = layoutParams.height / 3;
        ImageView imageView4 = (ImageView) oVar2.mo85812D(C0966R.C0970id.m_n);
        imageView4.getLayoutParams().height = layoutParams.height / 3;
        FinderObject finderObject = (FinderObject) C110818d0.m150917O(zbVar2.f30836d, 0);
        if (finderObject == null || (finderObjectDesc3 = finderObject.objectDesc) == null || (linkedList3 = finderObjectDesc3.media) == null || (finderMedia3 = (FinderMedia) C110818d0.m150916N(linkedList3)) == null) {
            str = null;
        } else {
            str = finderMedia3.thumbUrl + Util.nullAsNil(finderMedia3.thumb_url_token);
        }
        FinderObject finderObject2 = (FinderObject) C110818d0.m150917O(zbVar2.f30836d, 1);
        if (finderObject2 == null || (finderObjectDesc2 = finderObject2.objectDesc) == null || (linkedList2 = finderObjectDesc2.media) == null || (finderMedia2 = (FinderMedia) C110818d0.m150916N(linkedList2)) == null) {
            str2 = null;
        } else {
            str2 = finderMedia2.thumbUrl + Util.nullAsNil(finderMedia2.thumb_url_token);
        }
        FinderObject finderObject3 = (FinderObject) C110818d0.m150917O(zbVar2.f30836d, 2);
        if (finderObject3 == null || (finderObjectDesc = finderObject3.objectDesc) == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) {
            str3 = null;
        } else {
            str3 = finderMedia.thumbUrl + Util.nullAsNil(finderMedia.thumb_url_token);
        }
        C11978e0 e0Var = C11978e0.f34938a;
        C60979d<C100810g0> b = e0Var.mo11850b();
        C62345f fVar = new C62345f(str, (C27696y) null, 2, (C8480h) null);
        C11978e0.C11979a aVar = C11978e0.C11979a.DEFAULT;
        b.mo85957c(fVar, imageView2, e0Var.mo11851c(aVar));
        e0Var.mo11850b().mo85957c(new C62345f(str2, (C27696y) null, 2, (C8480h) null), imageView3, e0Var.mo11851c(aVar));
        e0Var.mo11850b().mo85957c(new C62345f(str3, (C27696y) null, 2, (C8480h) null), imageView4, e0Var.mo11851c(aVar));
        String str4 = Util.nullAsNil(rq23.f185283w) + Util.nullAsNil(rq23.f185234A);
        if (Util.isNullOrNil(str4)) {
            str4 = rq23.f185267e + Util.nullAsNil(rq23.f185288z);
        }
        String str5 = str4;
        C64273c21 liveInfo = zbVar.mo3513o().getLiveInfo();
        if (liveInfo != null && liveInfo.f182394f == 1) {
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            e0Var.mo11850b().mo85957c(new C11984n0(str5, C27696y.RAW_IMAGE), imageView, this.f33084e ? ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.DARK_LIVE_SQUARE) : ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            return;
        }
        C7335d c = C86312j.m106911c(C13887q1.class);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        C13887q1.C13888a.m13309e((C13887q1) c, imageView, str5, 0, 4, (Object) null);
    }
}
