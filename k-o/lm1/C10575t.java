package lm1;

import ak1.C54067f0;
import ak1.C54108o;
import al1.C0081n;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import c30.C104289g;
import cj1.C0576n4;
import cj1.C54781k2;
import cm1.C0740i2;
import cm1.C0797z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePreviewView;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C7450q;
import er1.C58684b;
import er1.C58708d1;
import er1.C58739j4;
import f50.C58924d;
import fy3.C32224a;
import gr1.C59668o0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hm1.C32946a;
import ht1.C60200t1;
import ht1.C8809w2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kf1.C10072zb;
import kf1.C9833k9;
import ks3.C10412u;
import ln1.C61313a;
import ls3.C10649f;
import lt1.C61401a;
import o40.C61926c;
import p182kk.C61104a;
import p565ir.C60606n;
import pe3.C89349b;
import ph1.C11937b;
import ph1.C11940k;
import ph1.C62289d;
import ph1.C62292g;
import ph1.C62293i;
import ph1.C62297m;
import pm1.C62381d;
import qt1.C12932c;
import rm1.C13087a;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C48817b71;
import te3.C49098d51;
import te3.C49461fr0;
import te3.C49712hj1;
import te3.C50217l51;
import te3.C50355m51;
import te3.C51942x91;
import te3.C52294zq0;
import te3.C64265bq2;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64293cq2;
import te3.C64347eq2;
import te3.C64686ro2;
import te3.C64848y91;
import te3.C64890zp2;
import tf0.C13883o1;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: lm1.t */
public final class C10575t {

    /* renamed from: a */
    public final C49712hj1 f31890a;

    /* renamed from: b */
    public final MMActivity f31891b;

    /* renamed from: c */
    public final AbsNearByFragment f31892c;

    /* renamed from: d */
    public final int f31893d;

    /* renamed from: e */
    public final C10544b<C0740i2> f31894e;

    /* renamed from: f */
    public int f31895f = -1;

    /* renamed from: g */
    public ArrayList<C0740i2> f31896g;

    /* renamed from: lm1.t$a */
    public static final class C10576a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10575t f31897d;

        /* renamed from: e */
        public final /* synthetic */ int f31898e;

        /* renamed from: f */
        public final /* synthetic */ C0740i2 f31899f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<C0740i2> f31900g;

        /* renamed from: h */
        public final /* synthetic */ View f31901h;

        /* renamed from: i */
        public final /* synthetic */ String f31902i;

        /* renamed from: j */
        public final /* synthetic */ String f31903j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10576a(C10575t tVar, int i, C0740i2 i2Var, ArrayList<C0740i2> arrayList, View view, String str, String str2) {
            super(0);
            this.f31897d = tVar;
            this.f31898e = i;
            this.f31899f = i2Var;
            this.f31900g = arrayList;
            this.f31901h = view;
            this.f31902i = str;
            this.f31903j = str2;
        }

        public Object invoke() {
            this.f31897d.mo10829a(this.f31898e, this.f31899f, this.f31900g, this.f31901h, this.f31902i, this.f31903j, true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: lm1.t$b */
    public static final class C10577b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C10575t f31904d;

        /* renamed from: e */
        public final /* synthetic */ int f31905e;

        /* renamed from: f */
        public final /* synthetic */ C0740i2 f31906f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<C0740i2> f31907g;

        /* renamed from: h */
        public final /* synthetic */ View f31908h;

        /* renamed from: i */
        public final /* synthetic */ String f31909i;

        /* renamed from: j */
        public final /* synthetic */ String f31910j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10577b(C10575t tVar, int i, C0740i2 i2Var, ArrayList<C0740i2> arrayList, View view, String str, String str2) {
            super(0);
            this.f31904d = tVar;
            this.f31905e = i;
            this.f31906f = i2Var;
            this.f31907g = arrayList;
            this.f31908h = view;
            this.f31909i = str;
            this.f31910j = str2;
        }

        public Object invoke() {
            this.f31904d.mo10829a(this.f31905e, this.f31906f, this.f31907g, this.f31908h, this.f31909i, this.f31910j, true);
            return C13598b0.f38549a;
        }
    }

    public C10575t(C49712hj1 hj12, MMActivity mMActivity, AbsNearByFragment absNearByFragment, int i, C10544b<C0740i2> bVar) {
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(mMActivity, "baseContext");
        this.f31890a = hj12;
        this.f31891b = mMActivity;
        this.f31892c = absNearByFragment;
        this.f31893d = i;
        this.f31894e = bVar;
    }

    /* renamed from: a */
    public final void mo10829a(int i, C0740i2 i2Var, ArrayList<C0740i2> arrayList, View view, String str, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        boolean z2;
        String str6;
        String str7;
        String str8;
        String str9;
        FinderItem o;
        C64273c21 liveInfo;
        C51942x91 x912;
        C51942x91 x913;
        String str10;
        FinderItem o2;
        String str11;
        String str12;
        long j;
        String str13;
        String str14;
        String str15;
        FinderItem o3;
        FinderItem o4;
        C51942x91 x914;
        C51942x91 x915;
        FinderItem o5;
        FinderItem o6;
        FinderItem o7;
        FinderItem o8;
        int i2 = i;
        C0740i2 i2Var2 = i2Var;
        String str16 = str;
        String str17 = str2;
        boolean z3 = z;
        Class cls = C10649f.class;
        Intent intent = new Intent();
        Log.m105924i("NearbyLiveViewCallback", "enterLiveRoom pos: " + i2 + " launchWithAnim: " + z3);
        if (i2Var2 instanceof C10072zb) {
            C49461fr0 fr02 = new C49461fr0();
            C10072zb zbVar = (C10072zb) i2Var2;
            fr02.f133643d = new LinkedList<>(zbVar.f30836d);
            C48817b71 b712 = zbVar.f30837e;
            fr02.f133644e = b712 != null ? b712.f130990d : null;
            intent.putExtra("FINDER_JUMP_INFO_WITH_OUTSIDE", fr02.toByteArray());
        }
        if (((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83769P5()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(i2Var2);
            intent.putExtra("key_chnl_extra", mo10830b(i2, view, "onItemClick"));
            AbsNearByFragment absNearByFragment = this.f31892c;
            if (absNearByFragment == null || (str11 = absNearByFragment.mo3551S()) == null) {
                str11 = "";
            }
            intent.putExtra("key_click_sub_tab_context_id", str11);
            boolean z4 = i2Var2 instanceof BaseFinderFeed;
            BaseFinderFeed baseFinderFeed = z4 ? (BaseFinderFeed) i2Var2 : null;
            long j2 = 0;
            if (baseFinderFeed == null || (o8 = baseFinderFeed.mo3513o()) == null) {
                str12 = "card_index";
                j = 0;
            } else {
                str12 = "card_index";
                j = o8.getId();
            }
            intent.putExtra("CURRENT_FEED_ID", j);
            intent.putExtra("LAUNCH_WITH_ANIM", z3);
            int i3 = C10412u.f31640a;
            intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 1);
            C50355m51 m512 = new C50355m51();
            C50217l51 l512 = new C50217l51();
            C52294zq0 zq02 = new C52294zq0();
            C8809w2 w2Var = (C8809w2) C39818r.f106831a.mo62444c(this.f31891b).mo62447c(C8809w2.class);
            BaseFinderFeed baseFinderFeed2 = z4 ? (BaseFinderFeed) i2Var2 : null;
            if (!(baseFinderFeed2 == null || (o7 = baseFinderFeed2.mo3513o()) == null)) {
                j2 = o7.getId();
            }
            C52294zq0 z0 = w2Var.mo9638z0(j2);
            zq02.f146179d = z0 != null ? z0.f146179d : null;
            l512.f137181d = zq02;
            m512.f137842d = l512;
            BaseFinderFeed baseFinderFeed3 = z4 ? (BaseFinderFeed) i2Var2 : null;
            m512.f137843e = (baseFinderFeed3 == null || (o6 = baseFinderFeed3.mo3513o()) == null) ? null : o6.getDescription();
            BaseFinderFeed baseFinderFeed4 = z4 ? (BaseFinderFeed) i2Var2 : null;
            m512.f137844f = (baseFinderFeed4 == null || (o5 = baseFinderFeed4.mo3513o()) == null) ? null : o5.getLocation();
            intent.putExtra("PRE_JOIN_LIVE_INFO", m512.toByteArray());
            intent.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            Bundle bundle = new Bundle();
            AbsNearByFragment absNearByFragment2 = this.f31892c;
            NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = absNearByFragment2 instanceof NearbyLiveSquareTabFragment ? (NearbyLiveSquareTabFragment) absNearByFragment2 : null;
            if (nearbyLiveSquareTabFragment == null || (x915 = nearbyLiveSquareTabFragment.f15690r) == null || (str13 = Integer.valueOf(x915.f144531d).toString()) == null) {
                str13 = "";
            }
            bundle.putString("tab_id", str13);
            AbsNearByFragment absNearByFragment3 = this.f31892c;
            NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment2 = absNearByFragment3 instanceof NearbyLiveSquareTabFragment ? (NearbyLiveSquareTabFragment) absNearByFragment3 : null;
            if (nearbyLiveSquareTabFragment2 == null || (x914 = nearbyLiveSquareTabFragment2.f15691s) == null || (str14 = Integer.valueOf(x914.f144531d).toString()) == null) {
                str14 = "";
            }
            bundle.putString("sub_tab_id", str14);
            str5 = str12;
            bundle.putString(str5, String.valueOf(i));
            C13598b0 b0Var = C13598b0.f38549a;
            intent.putExtra("KEY_PARAMS_ENTRANCE_REPORT_INFO", bundle);
            C13604l<List<FinderObject>, Integer> c = C58708d1.f168058a.mo83619c(arrayList2, i2Var2);
            List list = (List) c.f38555d;
            int intValue = ((Number) c.f38556e).intValue();
            C64279c90 c902 = new C64279c90();
            c902.f182444d = str;
            c902.f182445e = str2;
            c902.f182446f = false;
            c902.f182447g = -1;
            c902.f182448h = -1;
            C64347eq2 eq22 = new C64347eq2();
            eq22.f183024o = true;
            c902.f182451n = eq22;
            c902.f182449i = 1;
            C64686ro2 ro22 = new C64686ro2();
            ro22.f185214e = this.f31890a.f134675i;
            boolean z5 = i2Var2 instanceof BaseFinderFeed;
            BaseFinderFeed baseFinderFeed5 = z5 ? (BaseFinderFeed) i2Var2 : null;
            if (baseFinderFeed5 == null || (o4 = baseFinderFeed5.mo3513o()) == null || (str15 = o4.getNickName()) == null) {
                str15 = "";
            }
            ro22.f185215f = str15;
            BaseFinderFeed baseFinderFeed6 = z5 ? (BaseFinderFeed) i2Var2 : null;
            ro22.f185218i = (baseFinderFeed6 == null || (o3 = baseFinderFeed6.mo3513o()) == null) ? null : o3.getFeedObject();
            c902.f182450j = ro22;
            C0576n4.f1379b.mo600c(intent);
            str4 = "";
            List list2 = list;
            z2 = false;
            str3 = "tab_id";
            C64279c90 c903 = c902;
            str6 = "sub_tab_id";
            ((C10649f) C86312j.m106911c(cls)).mo10913cP(this.f31891b, intent, list2, intValue, c903, (C10649f.C10650a) null);
        } else {
            String str18 = str16;
            String str19 = str17;
            str4 = "";
            str6 = "sub_tab_id";
            str5 = "card_index";
            z2 = false;
            str3 = "tab_id";
            C13604l<List<FinderObject>, Integer> c2 = C58708d1.f168058a.mo83619c(arrayList, i2Var2);
            List list3 = (List) c2.f38555d;
            int intValue2 = ((Number) c2.f38556e).intValue();
            C64279c90 c904 = new C64279c90();
            c904.f182444d = str18;
            c904.f182445e = str19;
            c904.f182446f = false;
            c904.f182447g = 1001;
            c904.f182448h = -1;
            c904.f182449i = -1;
            C64347eq2 eq23 = new C64347eq2();
            eq23.f183024o = true;
            c904.f182451n = eq23;
            C64686ro2 ro23 = new C64686ro2();
            ro23.f185214e = this.f31890a.f134675i;
            BaseFinderFeed baseFinderFeed7 = i2Var2 instanceof BaseFinderFeed ? (BaseFinderFeed) i2Var2 : null;
            if (baseFinderFeed7 == null || (o2 = baseFinderFeed7.mo3513o()) == null || (str10 = o2.getNickName()) == null) {
                str10 = str4;
            }
            ro23.f185215f = str10;
            c904.f182450j = ro23;
            C0576n4.f1379b.mo600c(intent);
            ((C10649f) C86312j.m106911c(cls)).mo10913cP(this.f31891b, intent, list3, intValue2, c904, (C10649f.C10650a) null);
        }
        C87412m.m108594g(i2Var2, "feed");
        C104289g gVar = new C104289g();
        AbsNearByFragment absNearByFragment4 = this.f31892c;
        NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment3 = absNearByFragment4 instanceof NearbyLiveSquareTabFragment ? (NearbyLiveSquareTabFragment) absNearByFragment4 : null;
        if (nearbyLiveSquareTabFragment3 == null || (x913 = nearbyLiveSquareTabFragment3.f15690r) == null || (str7 = Integer.valueOf(x913.f144531d).toString()) == null) {
            str7 = str4;
        }
        gVar.mo145967r(str3, str7);
        AbsNearByFragment absNearByFragment5 = this.f31892c;
        NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment4 = absNearByFragment5 instanceof NearbyLiveSquareTabFragment ? (NearbyLiveSquareTabFragment) absNearByFragment5 : null;
        if (nearbyLiveSquareTabFragment4 == null || (x912 = nearbyLiveSquareTabFragment4.f15691s) == null || (str8 = Integer.valueOf(x912.f144531d).toString()) == null) {
            str8 = str4;
        }
        gVar.mo145967r(str6, str8);
        gVar.mo145967r("card_type", 1);
        gVar.mo145967r(str5, Integer.valueOf(i));
        C0797z zVar = i2Var2 instanceof C0797z ? (C0797z) i2Var2 : null;
        if (zVar == null || (o = zVar.mo3513o()) == null || (liveInfo = o.getLiveInfo()) == null || (str9 = Long.valueOf(liveInfo.f182392d).toString()) == null) {
            str9 = str4;
        }
        gVar.mo145967r("liveid", str9);
        FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
        finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
        finderBroadcastEidClickStruct.mo1017x(str4);
        finderBroadcastEidClickStruct.mo1012s(str4);
        finderBroadcastEidClickStruct.mo1011E(str4);
        finderBroadcastEidClickStruct.mo1008B(str4);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = str4;
        }
        finderBroadcastEidClickStruct.mo1019z(Wb);
        String str20 = this.f31890a.f134671e;
        if (str20 == null) {
            str20 = str4;
        }
        finderBroadcastEidClickStruct.mo1014u(str20);
        finderBroadcastEidClickStruct.mo1013t(mo10831c());
        finderBroadcastEidClickStruct.mo1010D(str4);
        finderBroadcastEidClickStruct.mo1007A(str4);
        finderBroadcastEidClickStruct.mo1018y(str4);
        finderBroadcastEidClickStruct.mo1015v("more_page_card");
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "eldUdfKv.toString()");
        finderBroadcastEidClickStruct.mo1016w(C112551y.m153814n(gVar2, ",", ";", z2));
        finderBroadcastEidClickStruct.mo1009C(((C60606n) C86312j.m106911c(C60606n.class)).tx0());
        finderBroadcastEidClickStruct.mo86054n();
        C12932c cVar = C11940k.f34875a;
        C11940k.f34875a.mo12481a("startActivity");
    }

    /* JADX WARNING: type inference failed for: r14v9, types: [com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d1, code lost:
        if ((r11.f31895f <= r12 && r12 < r14) != false) goto L_0x00c6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo10830b(int r12, android.view.View r13, java.lang.String r14) {
        /*
            r11 = this;
            java.lang.Class<fm1.e> r0 = fm1.C8138e.class
            java.lang.String r1 = "invokeSource"
            gy3.C87412m.m108594g(r14, r1)
            c30.g r1 = new c30.g
            r1.<init>()
            te3.hj1 r2 = r11.f31890a
            int r2 = r2.f134675i
            r3 = 9500001(0x90f561, float:1.3312337E-38)
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x0029
            r3 = 9500002(0x90f562, float:1.3312338E-38)
            if (r2 == r3) goto L_0x0029
            r3 = 9500004(0x90f564, float:1.3312341E-38)
            if (r2 == r3) goto L_0x0029
            r3 = 9500003(0x90f563, float:1.331234E-38)
            if (r2 != r3) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r2 = 0
            goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            java.lang.String r3 = "sub_tab_id"
            java.lang.String r6 = "tab_id"
            java.lang.String r7 = ""
            if (r2 != 0) goto L_0x018a
            java.lang.String r2 = "onExpose"
            boolean r2 = gy3.C87412m.m108589b(r14, r2)
            java.lang.String r8 = "{if_enhanced:1}"
            java.lang.String r9 = "card_style"
            if (r2 == 0) goto L_0x005d
            if (r13 == 0) goto L_0x008b
            r14 = 2131310054(0x7f0935e6, float:1.823841E38)
            java.lang.Object r2 = r13.getTag(r14)
            if (r2 == 0) goto L_0x008b
            boolean r10 = r2 instanceof java.lang.String
            if (r10 == 0) goto L_0x008b
            boolean r2 = gy3.C87412m.m108589b(r2, r7)
            if (r2 != 0) goto L_0x008b
            r1.put(r9, r8)
            r13.setTag(r14, r7)
            goto L_0x008b
        L_0x005d:
            java.lang.String r2 = "onItemClick"
            boolean r14 = gy3.C87412m.m108589b(r14, r2)
            if (r14 == 0) goto L_0x008b
            if (r13 == 0) goto L_0x008b
            r14 = 2131310052(0x7f0935e4, float:1.8238405E38)
            java.lang.Object r2 = r13.getTag(r14)
            if (r2 == 0) goto L_0x008b
            boolean r10 = r2 instanceof java.lang.String
            if (r10 == 0) goto L_0x008b
            boolean r10 = gy3.C87412m.m108589b(r2, r7)
            if (r10 != 0) goto L_0x008b
            r1.put(r9, r8)
            java.lang.String r8 = "click_timing"
            r1.put(r8, r2)
            r13.setTag(r14, r7)
            r14 = 2131310053(0x7f0935e5, float:1.8238407E38)
            r13.setTag(r14, r7)
        L_0x008b:
            int r13 = r11.f31895f
            if (r13 > 0) goto L_0x0091
        L_0x008f:
            r13 = 0
            goto L_0x00d4
        L_0x0091:
            if (r12 >= r13) goto L_0x0094
            goto L_0x008f
        L_0x0094:
            java.util.ArrayList<cm1.i2> r13 = r11.f31896g
            r14 = -1
            if (r13 == 0) goto L_0x00c0
            java.util.Iterator r13 = r13.iterator()
            r2 = 0
        L_0x009e:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r8 = r13.next()
            cm1.i2 r8 = (cm1.C0740i2) r8
            boolean r9 = r8 instanceof cm1.C0784u1
            if (r9 == 0) goto L_0x00b8
            cm1.u1 r8 = (cm1.C0784u1) r8
            int r8 = r8.f1835e
            int r9 = r11.f31895f
            if (r8 <= r9) goto L_0x00b8
            r8 = 1
            goto L_0x00b9
        L_0x00b8:
            r8 = 0
        L_0x00b9:
            if (r8 == 0) goto L_0x00bd
            r14 = r2
            goto L_0x00c0
        L_0x00bd:
            int r2 = r2 + 1
            goto L_0x009e
        L_0x00c0:
            if (r14 > 0) goto L_0x00c8
            int r13 = r11.f31895f
            if (r12 < r13) goto L_0x00c8
        L_0x00c6:
            r13 = 1
            goto L_0x00d4
        L_0x00c8:
            int r13 = r11.f31895f
            if (r13 > r12) goto L_0x00d0
            if (r12 >= r14) goto L_0x00d0
            r13 = 1
            goto L_0x00d1
        L_0x00d0:
            r13 = 0
        L_0x00d1:
            if (r13 == 0) goto L_0x008f
            goto L_0x00c6
        L_0x00d4:
            java.lang.String r14 = "my_follow_fold"
            if (r13 == 0) goto L_0x00dc
            r1.mo145953n(r14, r4)
            goto L_0x00df
        L_0x00dc:
            r1.mo145953n(r14, r5)
        L_0x00df:
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r13 = r11.f31892c
            boolean r14 = r13 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
            r2 = 0
            if (r14 == 0) goto L_0x00e9
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r13 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r13
            goto L_0x00ea
        L_0x00e9:
            r13 = r2
        L_0x00ea:
            if (r13 == 0) goto L_0x00fc
            te3.x91 r13 = r13.f15690r
            if (r13 == 0) goto L_0x00fc
            int r13 = r13.f144531d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r13 = r13.toString()
            if (r13 != 0) goto L_0x00fd
        L_0x00fc:
            r13 = r7
        L_0x00fd:
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r14 = r11.f31892c
            boolean r4 = r14 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
            if (r4 == 0) goto L_0x0106
            r2 = r14
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r2 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r2
        L_0x0106:
            if (r2 == 0) goto L_0x0118
            te3.x91 r14 = r2.f15691s
            if (r14 == 0) goto L_0x0118
            int r14 = r14.f144531d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.String r14 = r14.toString()
            if (r14 != 0) goto L_0x0119
        L_0x0118:
            r14 = r7
        L_0x0119:
            r1.put(r6, r13)
            r1.put(r3, r14)
            bl3.r r13 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r14 = r11.f31891b
            bl3.r$a r14 = r13.mo62444c(r14)
            androidx.lifecycle.i0 r14 = r14.mo75002a(r0)
            fm1.e r14 = (fm1.C8138e) r14
            te3.nn1 r14 = r14.f27000g
            com.tencent.mm.ui.MMActivity r2 = r11.f31891b
            bl3.r$a r13 = r13.mo62444c(r2)
            androidx.lifecycle.i0 r13 = r13.mo75002a(r0)
            fm1.e r13 = (fm1.C8138e) r13
            com.tencent.mm.plugin.finder.extension.reddot.s0 r13 = r13.f27001h
            if (r13 == 0) goto L_0x01b1
            if (r14 == 0) goto L_0x01b1
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r0 = r13.mo77309p2()
            org.json.JSONObject r2 = o40.C61937h.m72709h(r0)
            te3.xi1 r3 = r13.field_ctrInfo
            int r3 = r3.f144670e
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "reddotctrltype"
            r1.mo145967r(r4, r3)
            java.lang.String r3 = r13.field_tipsId
            java.lang.String r4 = "reddottipsid"
            r1.mo145967r(r4, r3)
            java.lang.String r14 = r14.f184507i
            java.lang.String r3 = "reddotshowinfopath"
            r1.mo145967r(r3, r14)
            java.lang.String r14 = "report_ext_info"
            java.lang.Object r14 = r2.opt(r14)
            if (r14 != 0) goto L_0x016e
            goto L_0x016f
        L_0x016e:
            r7 = r14
        L_0x016f:
            java.lang.String r14 = "reddotshowinfoext"
            r1.mo145967r(r14, r7)
            long r2 = r0.object_id
            java.lang.String r14 = o40.C61926c.m72691p(r2)
            java.lang.String r0 = "feedid"
            r1.mo145967r(r0, r14)
            te3.yi1 r13 = r13.f158585F
            java.lang.String r13 = r13.f186560u
            java.lang.String r14 = "username"
            r1.mo145967r(r14, r13)
            goto L_0x01b1
        L_0x018a:
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r13 = r11.f31892c
            if (r13 == 0) goto L_0x0194
            java.lang.String r13 = r13.mo3553U()
            if (r13 != 0) goto L_0x0195
        L_0x0194:
            r13 = r7
        L_0x0195:
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r14 = r11.f31892c
            if (r14 == 0) goto L_0x019f
            java.lang.String r14 = r14.mo3552T()
            if (r14 != 0) goto L_0x01a0
        L_0x019f:
            r14 = r7
        L_0x01a0:
            r1.put(r6, r13)
            r1.put(r3, r14)
            java.lang.String r13 = "tag"
            r1.put(r13, r7)
            rm1.a r13 = rm1.C13087a.f37254a
            r13.mo12583d(r1)
        L_0x01b1:
            java.lang.String r13 = r11.mo10831c()
            java.lang.String r14 = "enter_immerse_type"
            r1.put(r14, r13)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r13 = "square_index"
            r1.put(r13, r12)
            java.lang.String r12 = r1.toString()
            java.lang.String r13 = "chnlExtra.toString()"
            gy3.C87412m.m108593f(r12, r13)
            java.lang.String r13 = ","
            java.lang.String r14 = ";"
            java.lang.String r12 = z04.C112551y.m153814n(r12, r13, r14, r5)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lm1.C10575t.mo10830b(int, android.view.View, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public final String mo10831c() {
        return this.f31893d == 15 ? "temp_32" : String.valueOf(this.f31890a.f134675i);
    }

    /* renamed from: d */
    public final void mo10832d(C0740i2 i2Var, int i, int i2, View view, ArrayList<C0740i2> arrayList, String str, String str2, RecyclerView recyclerView) {
        boolean z;
        C62381d L;
        String str3;
        C62289d dVar;
        C64890zp2 zp22;
        C62289d dVar2;
        C64890zp2 zp23;
        C89349b bVar;
        C59668o0 renderView;
        TextureView videoView;
        String S;
        C10575t tVar = this;
        C0740i2 i2Var2 = i2Var;
        int i3 = i;
        int i4 = i2;
        View view2 = view;
        C61401a aVar = C61401a.LIVE_SQUARE;
        Class cls = C60606n.class;
        C87412m.m108594g(i2Var2, "feed");
        C87412m.m108594g(view2, "view");
        C87412m.m108594g(arrayList, "data");
        C87412m.m108594g(str, "contextId");
        C87412m.m108594g(str2, "clickTabContextId");
        C87412m.m108594g(recyclerView, "recyclerView");
        C58739j4 j4Var = C58739j4.f168176a;
        if (j4Var.mo83683L() || tVar.f31891b.isPaused()) {
            Log.m105924i("NearbyLiveViewCallback", "onItemClick pos:" + i3 + " feed:" + i2Var2 + " return for fastClick isPause: " + tVar.f31891b.isPaused());
            return;
        }
        Log.m105924i("NearbyLiveViewCallback", "onItemClick pos:" + i3 + " feed:" + i2Var2);
        if (i2Var2 instanceof BaseFinderFeed) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var2;
            if (j4Var.mo83686O(baseFinderFeed)) {
                C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
                long j = (long) i3;
                C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM;
                String c = mo10831c();
                String str4 = tVar.f31890a.f134672f;
                String str5 = str4 == null ? "" : str4;
                AbsNearByFragment absNearByFragment = tVar.f31892c;
                oVar.mo9607Uk(baseFinderFeed, j, qVar, c, str5, (absNearByFragment == null || (S = absNearByFragment.mo3551S()) == null) ? "" : S, tVar.mo10830b(i4, view2, "onItemClick"));
                C32946a.f89535a.mo58884a(new C61306v(baseFinderFeed.mo3513o(), tVar));
                if (Util.isEqual(baseFinderFeed.mo3513o().getUserName(), C66785b.f191882e.mo90662O5())) {
                    C7335d c2 = C86312j.m106911c(C58684b.class);
                    C87412m.m108593f(c2, "getService(ActivityRouter::class.java)");
                    C13883o1 o1Var = (C13883o1) c2;
                    MMActivity mMActivity = tVar.f31891b;
                    long id = baseFinderFeed.mo3513o().getId();
                    String objectNonceId = baseFinderFeed.mo3513o().getObjectNonceId();
                    C64273c21 liveInfo = baseFinderFeed.mo3513o().getLiveInfo();
                    if (liveInfo == null) {
                        liveInfo = new C64273c21();
                    }
                    C13883o1.C13884a.m13249a(o1Var, mMActivity, id, objectNonceId, liveInfo, (C0081n) null, (C49098d51) null, (String) null, (LinkedList) null, (C64848y91) null, (String) null, baseFinderFeed.mo3526z(), (LinkedList) null, (Intent) null, 7152, (Object) null);
                    z = true;
                } else if (!C11937b.f34871a.mo11812b(i2Var2) || C61104a.m71657m(tVar.f31891b, false, (Bundle) null) || !C54781k2.f153552a.mo75682c()) {
                    z = true;
                    mo10829a(i2, i2Var, arrayList, view, str, str2, false);
                } else {
                    NearbyLivePreviewView nearbyLivePreviewView = (NearbyLivePreviewView) view2.findViewWithTag("nearby-live-preview-view-tag");
                    View findViewById = view2.findViewById(C0966R.C0970id.kk6);
                    C64273c21 c212 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
                    boolean u = C61926c.m72696u(c212 != null ? (int) c212.f182367M : 0, 256);
                    boolean z2 = nearbyLivePreviewView != null && nearbyLivePreviewView.isPlaying();
                    C64273c21 liveInfo2 = baseFinderFeed.mo3513o().getLiveInfo();
                    boolean z3 = liveInfo2 != null && liveInfo2.f182394f == 1;
                    boolean z4 = nearbyLivePreviewView != null && nearbyLivePreviewView.f160237u;
                    boolean z5 = ((nearbyLivePreviewView == null || (renderView = nearbyLivePreviewView.getRenderView()) == null || (videoView = renderView.getVideoView()) == null) ? null : videoView.getSurfaceTexture()) != null;
                    Log.m105924i("NearbyLiveViewCallback", "startSwitchOutFromSquare animation for feed:" + C61926c.m72691p(i2Var.getItemId()) + " liveStatusOpen:" + z3 + " isPlaying:" + z2 + " isAudioMode" + u + " isFirstFrameRendered:" + z4 + " isSurfaceTextureAvailable:" + z5);
                    if (!z2 || !z4 || u || !z3 || !z5) {
                        tVar = this;
                        if (!z3 || findViewById == null) {
                            z = true;
                            Log.m105928w("NearbyLiveViewCallback", "startSwitchOutFromSquare no animation for feed:" + C61926c.m72691p(i2Var.getItemId()) + " liveView:" + nearbyLivePreviewView);
                            mo10829a(i2, i2Var, arrayList, view, str, str2, false);
                        } else {
                            long id4 = baseFinderFeed.mo3513o().getId();
                            C64273c21 c213 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
                            if (c213 != null && c213.f182384X == 1) {
                                str3 = "";
                            } else {
                                C64273c21 c214 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
                                str3 = c214 != null ? c214.f182395g : null;
                            }
                            ViewParent parent = findViewById.getParent();
                            C62289d dVar3 = dVar;
                            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                            ViewGroup viewGroup = (ViewGroup) parent;
                            if (str3 == null) {
                                str3 = "";
                            }
                            boolean z6 = !((C60606n) C86312j.m106911c(cls)).mo85008I1(baseFinderFeed.mo3513o().getFeedObject().liveInfo);
                            C64273c21 c215 = baseFinderFeed.mo3513o().getFeedObject().liveInfo;
                            if (c215 != null) {
                                C64265bq2 bq22 = c215.f182358D;
                                if (bq22 == null || (bVar = bq22.f182318j) == null) {
                                    zp23 = null;
                                } else {
                                    C64293cq2 cq22 = new C64293cq2();
                                    cq22.parseFrom(bVar.mo123703f());
                                    zp23 = cq22.f182556f;
                                }
                                zp22 = zp23;
                                dVar2 = dVar3;
                            } else {
                                dVar2 = dVar3;
                                zp22 = null;
                            }
                            long j2 = id4;
                            String str6 = "NearbyLiveViewCallback";
                            new C62289d(aVar, j2, viewGroup, findViewById, str3, z6, zp22);
                            C62297m h = C62293i.f177081a.mo87363h(tVar.f31891b, dVar2);
                            StringBuilder sb = new StringBuilder();
                            sb.append("startSwitchOutFromSquare image animation for feed:");
                            sb.append(C61926c.m72691p(i2Var.getItemId()));
                            sb.append(" liveView:");
                            sb.append(nearbyLivePreviewView);
                            sb.append("isFirstFrameRendered:");
                            sb.append(nearbyLivePreviewView != null ? Boolean.valueOf(nearbyLivePreviewView.f160237u) : null);
                            Log.m105928w(str6, sb.toString());
                            z = true;
                            h.mo84323h(new C10577b(this, i2, i2Var, arrayList, view, str, str2));
                        }
                    } else {
                        Log.m105928w("NearbyLiveViewCallback", "startSwitchOutFromSquare video animation for feed:" + C61926c.m72691p(i2Var.getItemId()) + " liveView:" + nearbyLivePreviewView);
                        long id5 = baseFinderFeed.mo3513o().getId();
                        int videoWidth = nearbyLivePreviewView.getVideoWidth();
                        int videoHeight = nearbyLivePreviewView.getVideoHeight();
                        float videoRatioWH = nearbyLivePreviewView.getVideoRatioWH();
                        C58924d h2 = nearbyLivePreviewView.mo11322a();
                        TextureView videoView2 = nearbyLivePreviewView.getRenderView().getVideoView();
                        C87412m.m108593f(videoView2, "liveView.renderView.videoView");
                        C62292g gVar = new C62292g(aVar, id5, view, videoWidth, videoHeight, videoRatioWH, h2, (SurfaceTexture) null, videoView2, false, false);
                        gVar.f177080m = view2.findViewById(C0966R.C0970id.fwx);
                        tVar = this;
                        C62293i.f177081a.mo87363h(tVar.f31891b, gVar).mo84323h(new C10576a(this, i2, i2Var, arrayList, view, str, str2));
                        z = true;
                    }
                }
                C10544b<C0740i2> bVar2 = tVar.f31894e;
                if ((bVar2 == null || (L = bVar2.mo3570L()) == null || L.mo87442u(i4) != z) ? false : true) {
                    C61313a.f174432a.mo86280a((C0797z) i2Var2, (long) i4, 2);
                }
                Log.m105924i("FinderLiveSquareTabLifeCycleReport", "enterLiveRoom");
                C13087a.f37257d = "page_live_flow";
                if (!C10542a.f31819v) {
                    C7450q.f25643a.mo8594b(tVar.f31890a, i2Var2, 18);
                    return;
                }
                return;
            }
        }
        if (i2Var2 instanceof C9833k9) {
            C9833k9 k9Var = (C9833k9) i2Var2;
            tVar.f31895f = k9Var.f30391h;
            C10544b<C0740i2> bVar3 = tVar.f31894e;
            if (bVar3 != null) {
                bVar3.mo3591q0(k9Var);
            }
            FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new FinderBroadcastEidClickStruct();
            finderBroadcastEidClickStruct.f9725d = Util.nowMilliSecond();
            finderBroadcastEidClickStruct.mo1017x("");
            finderBroadcastEidClickStruct.mo1012s(tVar.mo10830b(i4, view2, "onItemClick"));
            finderBroadcastEidClickStruct.mo1011E("");
            finderBroadcastEidClickStruct.mo1008B("");
            String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
            if (Wb == null) {
                Wb = "";
            }
            finderBroadcastEidClickStruct.mo1019z(Wb);
            finderBroadcastEidClickStruct.mo1014u(tVar.f31890a.f134671e);
            finderBroadcastEidClickStruct.mo1013t(String.valueOf(tVar.f31890a.f134675i));
            finderBroadcastEidClickStruct.mo1010D(str2);
            finderBroadcastEidClickStruct.mo1007A("");
            finderBroadcastEidClickStruct.mo1018y("");
            finderBroadcastEidClickStruct.mo1015v("all_my_follow");
            finderBroadcastEidClickStruct.mo1016w("");
            finderBroadcastEidClickStruct.mo1009C(((C60606n) C86312j.m106911c(cls)).tx0());
            finderBroadcastEidClickStruct.mo86054n();
        }
    }
}
