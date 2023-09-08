package com.tencent.p014mm.plugin.finder.live.view;

import ak1.C54067f0;
import ak1.C54095l;
import ak1.C54108o;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import er1.C7878t0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import kotlin.Metadata;
import l31.C61212e;
import ls3.C10649f;
import n60.C100075f;
import o40.C61926c;
import p185kq.C10383h;
import p185kq.C61130g;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pl1.C62345f;
import q31.C118148a;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C52231z81;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64284cg;
import te3.C64686ro2;
import te3.C64689rq2;
import tf0.C13887q1;
import tf0.C64916p1;
import up1.C27696y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/SimpleLivingCardView;", "Landroid/widget/RelativeLayout;", "Ln60/f;", "getImageLoadOption", "Lte3/hj1;", "d", "Lte3/hj1;", "getReportObj", "()Lte3/hj1;", "setReportObj", "(Lte3/hj1;)V", "reportObj", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView */
public final class SimpleLivingCardView extends RelativeLayout {

    /* renamed from: d */
    public C49712hj1 f15310d;

    /* renamed from: e */
    public ViewGroup f15311e;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView$a */
    public static final class C3199a implements C118148a {

        /* renamed from: a */
        public final /* synthetic */ SimpleLivingCardView f15312a;

        /* renamed from: b */
        public final /* synthetic */ FinderItem f15313b;

        public C3199a(SimpleLivingCardView simpleLivingCardView, FinderItem finderItem) {
            this.f15312a = simpleLivingCardView;
            this.f15313b = finderItem;
        }

        /* renamed from: a */
        public /* synthetic */ boolean mo36a(Object obj, String str, int i) {
            return false;
        }

        /* renamed from: b */
        public final Map<String, Object> mo37b(String str) {
            C13604l[] lVarArr = new C13604l[4];
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            C13604l lVar = new C13604l("behaviour_session_id", Wb);
            boolean z = false;
            lVarArr[0] = lVar;
            C49712hj1 reportObj = this.f15312a.getReportObj();
            String str2 = null;
            C13604l lVar2 = new C13604l("finder_context_id", reportObj != null ? reportObj.f134671e : null);
            int i = 1;
            lVarArr[1] = lVar2;
            C49712hj1 reportObj2 = this.f15312a.getReportObj();
            if (reportObj2 != null) {
                str2 = reportObj2.f134672f;
            }
            lVarArr[2] = new C13604l("finder_tab_context_id", str2);
            C64273c21 liveInfo = this.f15313b.getLiveInfo();
            if (liveInfo != null && liveInfo.f182394f == 1) {
                z = true;
            }
            if (!z) {
                i = 2;
            }
            lVarArr[3] = new C13604l("live_enter_status", Integer.valueOf(i));
            return C90364q0.m113147f(lVarArr);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.SimpleLivingCardView$b */
    public static final class C3200b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderItem f15314d;

        /* renamed from: e */
        public final /* synthetic */ SimpleLivingCardView f15315e;

        public C3200b(FinderItem finderItem, SimpleLivingCardView simpleLivingCardView) {
            this.f15314d = finderItem;
            this.f15315e = simpleLivingCardView;
        }

        public final void onClick(View view) {
            String str;
            C54127h b;
            Class cls = C10383h.class;
            Class cls2 = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$renderView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            C64273c21 liveInfo = this.f15314d.getLiveInfo();
            long j = liveInfo != null ? liveInfo.f182392d : 0;
            C49712hj1 reportObj = this.f15315e.getReportObj();
            if (reportObj == null || (str = reportObj.f134671e) == null) {
                str = "";
            }
            wVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("page_id", "1002");
            hashMap.put("liveid", String.valueOf(j));
            ((C54108o) C86312j.m106911c(cls2)).g80(C54067f0.C0064m.END_PAGE_LIVE_CARD, hashMap, str);
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndProfileBtnClicked report23059, page_id = " + ((String) hashMap.get("page_id")) + ", liveid = " + ((String) hashMap.get("liveid")));
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            long refObjectId = this.f15314d.getRefObjectId();
            C64273c21 liveInfo2 = this.f15314d.getLiveInfo();
            long j2 = liveInfo2 != null ? liveInfo2.f182392d : -1;
            String userName = this.f15314d.getUserName();
            C64273c21 liveInfo3 = this.f15314d.getLiveInfo();
            C8777j5.C8778a.m8603d(j5Var, refObjectId, j2, userName, -1, liveInfo3 != null ? (long) liveInfo3.f182393e : -1, C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM, "temp_30", (String) null, 1, 128, (Object) null);
            ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry("temp_30");
            ((C54108o) C86312j.m106911c(cls2)).getClass();
            C54067f0 f0Var = C54108o.f151869h;
            C54067f0.C54083s0 s0Var = C54067f0.C54083s0.CLICK_JSAPI_HEJI_ENTER_LIVE_ROOM;
            f0Var.getClass();
            f0Var.f151432N = s0Var;
            ((C10383h) C86312j.m106911c(cls)).mo10697OK(((C10383h) C86312j.m106911c(cls)).mo10696E());
            Intent intent = new Intent();
            FinderLiveService.f159376d.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            if (!(iVar == null || (b = iVar.mo74924b()) == null)) {
                intent.putExtra("key_enter_live_param_share_username", b.f151977d.f157049G);
                intent.putExtra("key_enter_live_param_from_share_scene_new", b.f151977d.f157051I);
                intent.putExtra("KEY_ENTER_LIVE_PARAM_TO_USERNAME", b.f151977d.f157052J);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(this.f15314d.getFeedObject());
            C64279c90 c902 = new C64279c90();
            FinderItem finderItem = this.f15314d;
            c902.f182444d = "";
            c902.f182445e = "";
            c902.f182446f = false;
            c902.f182447g = -1;
            c902.f182448h = -1;
            c902.f182449i = 1;
            C64686ro2 ro22 = new C64686ro2();
            ro22.f185218i = finderItem.getFeedObject();
            c902.f182450j = ro22;
            Context context = this.f15315e.getContext();
            C87412m.m108593f(context, "context");
            ((C10649f) C86312j.m106911c(C10649f.class)).mo10913cP(context, intent, arrayList2, 0, c902, (C10649f.C10650a) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView$renderView$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleLivingCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View findViewById = View.inflate(context, C0966R.C0971layout.b1j, this).findViewById(C0966R.C0970id.hae);
        C87412m.m108593f(findViewById, "inflateView.findViewById…nearby_live_convert_root)");
        this.f15311e = (ViewGroup) findViewById;
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(this, "live_room_card").mo86175pO(this, 40, 26236);
    }

    /* renamed from: a */
    public static final void m3134a(SimpleLivingCardView simpleLivingCardView, String str) {
        simpleLivingCardView.getClass();
        Intent intent = new Intent();
        intent.putExtra("finder_username", str);
        intent.putExtra("key_enter_profile_type", 11);
        Context context = simpleLivingCardView.getContext();
        C87412m.m108593f(context, "context");
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76819V1(context, intent);
        ((C54116w) C86312j.m106911c(C54116w.class)).qy0(str);
    }

    private final C100075f getImageLoadOption() {
        return ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11867O2(C11978e0.C11979a.TIMELINE);
    }

    /* renamed from: b */
    public final void mo3360b(C64689rq2 rq22, FinderItem finderItem) {
        String str;
        ImageView imageView = (ImageView) this.f15311e.findViewById(C0966R.C0970id.kk6);
        View findViewById = this.f15311e.findViewById(C0966R.C0970id.fwx);
        if (imageView == null) {
            Log.m105928w("Finder.LivingConvert", "bindCover return for thumbIv is null.");
            return;
        }
        int width = getWidth();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = width;
        int i = (int) (1.7776f * ((float) width));
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        findViewById.getLayoutParams().width = layoutParams.width;
        findViewById.getLayoutParams().height = layoutParams.height;
        ViewGroup viewGroup = this.f15311e;
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.LayoutParams layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = width;
        }
        ViewGroup viewGroup2 = this.f15311e;
        if (viewGroup2 != null) {
            layoutParams2 = viewGroup2.getLayoutParams();
        }
        if (layoutParams2 != null) {
            layoutParams2.height = i;
        }
        String str2 = Util.nullAsNil(rq22.f185283w) + Util.nullAsNil(rq22.f185234A);
        if (Util.isNullOrNil(str2)) {
            str = rq22.f185267e + Util.nullAsNil(rq22.f185288z);
        } else {
            str = str2;
        }
        C64273c21 liveInfo = finderItem.getLiveInfo();
        boolean z = true;
        if (liveInfo == null || liveInfo.f182394f != 1) {
            z = false;
        }
        if (z) {
            ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85957c(new C11984n0(str, C27696y.RAW_IMAGE), imageView, getImageLoadOption());
            return;
        }
        C7335d c = C86312j.m106911c(C13887q1.class);
        C87412m.m108593f(c, "getService(IFinderCommonLiveService::class.java)");
        C13887q1.C13888a.m13309e((C13887q1) c, imageView, str, 0, 4, (Object) null);
    }

    /* renamed from: c */
    public final void mo3361c(C52231z81 z812, int i) {
        String str;
        C52231z81 z813 = z812;
        C87412m.m108594g(z813, "card");
        String str2 = null;
        setOnClickListener((View.OnClickListener) null);
        FinderObject finderObject = z813.f145756f;
        if (finderObject != null) {
            FinderItem a = FinderItem.Companion.mo79056a(finderObject, 1);
            C64689rq2 rq22 = a.isLiveFeed() ? (C64689rq2) C110818d0.m150914L(a.getLiveMediaList()) : (C64689rq2) C110818d0.m150914L(a.getMediaList());
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            ImageView imageView = (ImageView) this.f15311e.findViewById(C0966R.C0970id.d78);
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            FinderContact finderContact = a.getFeedObject().contact;
            C62345f fVar = new C62345f(Util.nullAsNil(finderContact != null ? finderContact.headUrl : null), C27696y.SMALL_AVATAR_IMAGE);
            C87412m.m108593f(imageView, "avatar");
            i2.mo85957c(fVar, imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            imageView.setOnClickListener(new C3208c2(this, a));
            TextView textView = (TextView) this.f15311e.findViewById(C0966R.C0970id.e3v);
            textView.setText(a.getNickNameSpan());
            C85875k4.m106189j0(((TextView) this.f15311e.findViewById(C0966R.C0970id.d86)).getPaint(), 0.8f);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            textView.setOnClickListener(new C3210d2(this, a));
            FinderContact finderContact2 = a.getFeedObject().contact;
            if (finderContact2 != null) {
                C7335d c = C86312j.m106911c(C64916p1.class);
                C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
                View findViewById = this.f15311e.findViewById(C0966R.C0970id.a0g);
                C87412m.m108593f(findViewById, "rootLayout.findViewById(R.id.auth_icon)");
                C64916p1.C64917a.m76444k((C64916p1) c, (ImageView) findViewById, finderContact2.authInfo, 0, (C64284cg) null, 8, (Object) null);
            }
            TextView textView2 = (TextView) this.f15311e.findViewById(C0966R.C0970id.d86);
            if (!Util.isNullOrNil(a.getDescription())) {
                textView2.setVisibility(0);
                textView2.setText(a.getDescriptionSpan());
            } else {
                textView2.setVisibility(8);
            }
            try {
                mo3360b(rq22, a);
            } catch (Throwable unused) {
                Log.m105928w("Finder.LivingConvert", "bindCover throw Throwable.");
            }
            FinderLiveOnliveWidget finderLiveOnliveWidget = (FinderLiveOnliveWidget) this.f15311e.findViewById(C0966R.C0970id.dr9);
            View findViewById2 = this.f15311e.findViewById(C0966R.C0970id.dv8);
            if (a.isLiveFeed()) {
                C64273c21 liveInfo = a.getLiveInfo();
                if (liveInfo != null && liveInfo.f182394f == 1) {
                    finderLiveOnliveWidget.setVisibility(8);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view = findViewById2;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView", "bindLive", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView", "bindLive", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    finderLiveOnliveWidget.setVisibility(0);
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView", "bindLive", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView", "bindLive", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                finderLiveOnliveWidget.setVisibility(8);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView", "bindLive", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/view/SimpleLivingCardView", "bindLive", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            String str3 = a.getFeedObject().recommendReason;
            if (str3 == null) {
                str3 = "";
            }
            TextView textView3 = (TextView) this.f15311e.findViewById(C0966R.C0970id.if8);
            if (textView3 != null) {
                String str4 = a.getFeedObject().recommendReason;
                if (str4 == null) {
                    str4 = "";
                }
                textView3.setText(str4);
            }
            if (textView3 != null) {
                textView3.setVisibility(str3.length() == 0 ? 8 : 0);
            }
            TextView textView4 = (TextView) this.f15311e.findViewById(C0966R.C0970id.lkm);
            C64273c21 liveInfo2 = a.getLiveInfo();
            int i3 = liveInfo2 != null ? liveInfo2.f182403q : 0;
            C64273c21 liveInfo3 = a.getLiveInfo();
            String str5 = liveInfo3 != null ? liveInfo3.f182411x0 : null;
            C87412m.m108593f(textView4, "watchCountHistoryTv");
            if ((str5 == null || str5.length() == 0) && i3 > 0) {
                str5 = C7878t0.m8033b(i3);
            }
            if (!(str5 == null || str5.length() == 0)) {
                textView4.setText(str5);
                textView4.setVisibility(0);
            } else {
                textView4.setVisibility(8);
            }
            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
            C13604l[] lVarArr = new C13604l[5];
            lVarArr[0] = new C13604l("feed_id", C61926c.m72691p(a.getRefObjectId()));
            C64273c21 liveInfo4 = a.getLiveInfo();
            if (liveInfo4 != null) {
                str2 = C61926c.m72691p(liveInfo4.f182392d);
            }
            lVarArr[1] = new C13604l("live_id", str2);
            lVarArr[2] = new C13604l("comment_scene", "temp_30");
            String userName = a.getUserName();
            if (userName == null) {
                userName = "";
            }
            lVarArr[3] = new C13604l("finder_username", userName);
            lVarArr[4] = new C13604l("session_buffer", "");
            eVar.mo86149PM(this, C90364q0.m113147f(lVarArr)).E60(this, new C3199a(this, a));
            setOnClickListener(new C3200b(a, this));
            C13887q1 q1Var = (C13887q1) C86312j.m106911c(C13887q1.class);
            String userName2 = a.getUserName();
            String valueOf = String.valueOf(a.getRefObjectId());
            long refObjectId = a.getRefObjectId();
            C64273c21 liveInfo5 = a.getLiveInfo();
            long j = 0;
            long j2 = liveInfo5 != null ? liveInfo5.f182392d : 0;
            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
            C64273c21 liveInfo6 = a.getLiveInfo();
            int i4 = liveInfo6 != null ? liveInfo6.f182393e : -1;
            FinderObject feedObject = a.getFeedObject();
            q1Var.mo13304EM(new C54095l((C0740i2) null, userName2, i, valueOf, refObjectId, j2, qVar, "temp_30", i4, (feedObject == null || (str = feedObject.nickname) == null) ? "" : str, C54095l.C0078b.NOT, false, false, 0, (String) null, (String) null, (String) null, (String) null, 1, (String) null, 0, 0, 0, 8122368, (C8480h) null));
            C54116w wVar = (C54116w) C86312j.m106911c(C54116w.class);
            C64273c21 liveInfo7 = a.getLiveInfo();
            if (liveInfo7 != null) {
                j = liveInfo7.f182392d;
            }
            wVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("page_id", "1002");
            hashMap.put("liveid", String.valueOf(j));
            ((C54108o) C86312j.m106911c(C54108o.class)).mo9602Jz(C54067f0.C0066n.END_PAGE_LIVE_CARD, hashMap);
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "#reportLiveEndRecommendLiveCardExposed report23057, page_id = " + ((String) hashMap.get("page_id")) + ", liveid = " + ((String) hashMap.get("liveid")));
        }
    }

    public final C49712hj1 getReportObj() {
        return this.f15310d;
    }

    public final void setReportObj(C49712hj1 hj12) {
        this.f15310d = hj12;
    }
}
