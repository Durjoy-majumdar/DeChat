package mm1;

import ak1.C54067f0;
import ak1.C54108o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bl3.C39818r;
import c30.C104289g;
import cj1.C0576n4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C59774i;
import hn1.C8614b;
import ht1.C8777j5;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import je1.C46547x1;
import l31.C61212e;
import ls3.C10649f;
import nj3.C76912y0;
import nr3.C89059e;
import ns3.C61893e;
import o40.C61926c;
import o40.C61937h;
import ob0.C89132b;
import org.json.JSONObject;
import p147ea.C7606d;
import p182kk.C61104a;
import p185kq.C10383h;
import p749xh.C66261f3;
import pe1.C35464c;
import pe3.C89349b;
import rm1.C13087a;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import sx3.C90364q0;
import te3.C49712hj1;
import te3.C49946j51;
import te3.C50008jm0;
import te3.C50168kr0;
import te3.C50851pn0;
import te3.C64238ap2;
import te3.C64273c21;
import te3.C64279c90;
import te3.C64586nn1;
import te3.C64686ro2;
import te3.C64858yi1;
import up1.C65426w0;
import vc1.C37715b;
import vm1.C65763a;
import vp1.C65834e;
import z04.C112551y;

/* renamed from: mm1.b */
public final class C10935b implements C61893e {

    /* renamed from: a */
    public static final C10935b f32585a = new C10935b();

    /* renamed from: b */
    public static boolean f32586b;

    /* renamed from: c */
    public static final ConcurrentHashMap<String, FinderObject> f32587c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static long f32588d = System.currentTimeMillis();

    /* renamed from: e */
    public static final C13601g f32589e = C36568h.m40985a(C10937b.f32593d);

    /* renamed from: mm1.b$a */
    public static final class C10936a implements C10649f.C10650a {

        /* renamed from: a */
        public final /* synthetic */ String f32590a;

        /* renamed from: b */
        public final /* synthetic */ long f32591b;

        /* renamed from: c */
        public final /* synthetic */ String f32592c;

        public C10936a(String str, long j, String str2) {
            this.f32590a = str;
            this.f32591b = j;
            this.f32592c = str2;
        }

        /* renamed from: a */
        public void mo5052a() {
            C65763a.f189172a.mo89802a(this.f32590a, 0, String.valueOf(this.f32591b), C10935b.m10929b(C10935b.f32585a, this.f32591b, this.f32592c));
        }

        /* renamed from: b */
        public void mo5053b(FinderObject finderObject) {
            C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        }

        /* renamed from: c */
        public void mo5054c(Object obj) {
            C87412m.m108594g(obj, "bundle");
        }

        /* renamed from: d */
        public void mo5055d(C89132b.C89134c<C50008jm0> cVar) {
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        }

        /* renamed from: e */
        public void mo5056e(C89132b.C89134c<C50851pn0> cVar) {
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
        }

        public void onFailed(int i) {
            C65763a.f189172a.mo89802a(this.f32590a, i, String.valueOf(this.f32591b), C10935b.m10929b(C10935b.f32585a, this.f32591b, this.f32592c));
        }
    }

    /* renamed from: mm1.b$b */
    public static final class C10937b extends C87413o implements C32224a<HashMap<Long, LinkedList<WeakReference<C32226l<? super FinderObject, ? extends C13598b0>>>>> {

        /* renamed from: d */
        public static final C10937b f32593d = new C10937b();

        public C10937b() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: b */
    public static final String m10929b(C10935b bVar, long j, String str) {
        FinderObject finderObject = f32587c.get(bVar.mo11138f(j, str));
        if (finderObject == null) {
            return "";
        }
        Log.m105924i("NearbyEnterTargetLiveRoomChecker", "getTargetLiveId return for hit cache.");
        C64273c21 c212 = finderObject.liveInfo;
        return String.valueOf(c212 != null ? Long.valueOf(c212.f182392d) : null);
    }

    /* renamed from: c */
    public static final void m10930c(C10935b bVar, long j, FinderObject finderObject) {
        synchronized (bVar.mo11137e()) {
            LinkedList<WeakReference> remove = f32585a.mo11137e().remove(Long.valueOf(j));
            if (remove != null) {
                Log.m105924i("NearbyEnterTargetLiveRoomChecker", "invokeFinderObjectCallback " + j + " size:" + remove.size());
                for (WeakReference weakReference : remove) {
                    C32226l lVar = (C32226l) weakReference.get();
                    if (lVar != null) {
                        lVar.invoke(finderObject);
                    } else {
                        Log.m105924i("NearbyEnterTargetLiveRoomChecker", "invokeFinderObjectCallback callback is null!");
                    }
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: a */
    public void mo11135a(MMActivity mMActivity, long j, String str, boolean z, int i, C32226l<? super FinderObject, C13598b0> lVar) {
        C13598b0 b0Var;
        FinderItem e;
        MMActivity mMActivity2 = mMActivity;
        long j2 = j;
        String str2 = str;
        boolean z2 = z;
        int i2 = i;
        C32226l<? super FinderObject, C13598b0> lVar2 = lVar;
        if (j2 == -1 || j2 == 0) {
            Log.m105928w("NearbyEnterTargetLiveRoomChecker", "checkEnterTargetLiveRoom return for targetObjectId:" + j2);
            return;
        }
        Log.m105924i("NearbyEnterTargetLiveRoomChecker", "checkEnterTargetLiveRoom activity:" + mMActivity2 + ", checkCache:" + z2 + ", targetObjectId:" + j2 + " targetObjectNonceId:" + str2);
        if (!z2 || (e = C65834e.f189316a.mo89871e(j2)) == null) {
            C49712hj1 hj12 = new C49712hj1();
            hj12.f134677n = i2;
            hj12.f134675i = i2;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            StringBuilder sb = new StringBuilder();
            sb.append("fetchTargetLiveRoomObject activity:");
            sb.append(mMActivity2);
            sb.append(", objectId:");
            sb.append(j2);
            sb.append(" objectNonceId:");
            sb.append(str3);
            sb.append(",onGetFinderObjectCallback is null:");
            sb.append(lVar2 == null);
            Log.m105924i("NearbyEnterTargetLiveRoomChecker", sb.toString());
            f32588d = System.currentTimeMillis();
            FinderObject finderObject = f32587c.get(mo11138f(j2, str3));
            if (finderObject != null) {
                Log.m105924i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject fetch time:" + (System.currentTimeMillis() - f32588d));
                if (lVar2 != null) {
                    lVar2.invoke(finderObject);
                }
                Log.m105924i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject return for hit cache.");
                return;
            }
            if (lVar2 != null) {
                synchronized (mo11137e()) {
                    C10935b bVar = f32585a;
                    LinkedList linkedList = bVar.mo11137e().get(Long.valueOf(j));
                    if (linkedList != null) {
                        linkedList.add(new WeakReference(lVar2));
                        Log.m105924i("NearbyEnterTargetLiveRoomChecker", "setFinderObjectCallback add " + j2 + " onGetFinderObjectCallback size:" + linkedList.size());
                        b0Var = C13598b0.f38549a;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var == null) {
                        HashMap<Long, LinkedList<WeakReference<C32226l<FinderObject, C13598b0>>>> e2 = bVar.mo11137e();
                        Long valueOf = Long.valueOf(j);
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(new WeakReference(lVar2));
                        C13598b0 b0Var2 = C13598b0.f38549a;
                        e2.put(valueOf, linkedList2);
                        Log.m105924i("NearbyEnterTargetLiveRoomChecker", "setFinderObjectCallback put " + j2 + " onGetFinderObjectCallback");
                    }
                    C13598b0 b0Var3 = C13598b0.f38549a;
                }
            }
            if (f32586b) {
                Log.m105924i("NearbyEnterTargetLiveRoomChecker", "fetchTargetLiveRoomObject return for isFetchTargetFeed:" + f32586b + '.');
                return;
            }
            f32586b = true;
            String str4 = str3;
            C89059e i3 = new C46547x1(j, str4, 0, 2, "", true, (C89349b) null, (C65426w0) null, 0, (String) null, false, false, (String) null, hj12, 0, (C49946j51) null, false, 90048, (C8480h) null).mo9225i();
            if (mMActivity2 != null) {
                i3.mo11397F(mMActivity2);
            }
            i3.mo123062e(new C10938c(j, str4));
        } else if (lVar2 != null) {
            lVar2.invoke(e.getFeedObject());
        }
    }

    /* renamed from: d */
    public final void mo11136d(Activity activity, int i, long j, String str, String str2, String str3, String str4) {
        FinderItem o;
        String nickName;
        C55718s0 s0Var;
        C64586nn1 nn12;
        Activity activity2 = activity;
        int i2 = i;
        long j2 = j;
        String str5 = str;
        String str6 = str2;
        Class<C10649f> cls = C10649f.class;
        C87412m.m108594g(activity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str5, "targetObjectNonceId");
        C87412m.m108594g(str6, "targetLiveUserName");
        C87412m.m108594g(str3, "targetLiveNickName");
        C87412m.m108594g(str4, "targetLiveCoverUrl");
        C35464c<Integer> cVar = C32444a.f86079M;
        boolean z = true;
        if (!(cVar.mo60266n().intValue() == 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("checkJumpToTargetLiveRoom return for enableRedDotToTargetLiveRoom:");
            if (cVar.mo60266n().intValue() != 1) {
                z = false;
            }
            sb.append(z);
            Log.m105928w("NearbyEnterTargetLiveRoomChecker", sb.toString());
        } else if (j2 == -1 || j2 == 0) {
            Log.m105928w("NearbyEnterTargetLiveRoomChecker", "checkJumpToTargetLiveRoom return for targetObjectId:" + j2);
        } else if (C61104a.m71660p()) {
            Log.m105928w("NearbyEnterTargetLiveRoomChecker", "checkJumpToTargetLiveRoom return for checkFinderLiveStatePlaying targetObjectId:" + j2);
        } else {
            String str7 = ((C13442s8) C39818r.f106831a.mo62443b(activity2).mo75002a(C13442s8.class)).f38098n;
            String str8 = "";
            String str9 = str7 == null ? str8 : str7;
            C37715b bVar = C37715b.f99914a;
            String str10 = bVar.mo61298a() ? "8001" : null;
            if (str10 == null) {
                str10 = "1001";
            }
            int K80 = ((C7606d) C86312j.m106911c(C7606d.class)).K80(94);
            Log.m105924i("NearbyEnterTargetLiveRoomChecker", "checkJumpToTargetLiveRoom targetObjectId:$" + C61926c.m72691p(j) + " targetObjectNonceId:" + str5 + " contextId:" + str9 + " commentScene:" + K80 + " clickTabContextId:" + str10);
            C54108o oVar = (C54108o) C86312j.m106911c(C54108o.class);
            C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM;
            oVar.getClass();
            Class cls2 = C10383h.class;
            ((C10383h) C86312j.m106911c(cls2)).mo10697OK(str9);
            ((C10383h) C86312j.m106911c(cls2)).rn0(str10);
            Class<C10649f> cls3 = cls;
            int i3 = K80;
            String str11 = "NearbyEnterTargetLiveRoomChecker";
            String str12 = str9;
            C8777j5.C8778a.m8603d(oVar, j, 1, str2, -1, -1, qVar, "temp_18", (String) null, 0, 384, (Object) null);
            String str13 = str10;
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86168ix("view_clk", C90364q0.m113147f(new C13604l("view_id", "finder_live_red_dot"), new C13604l("liveId", str8), new C13604l("feedId", C61926c.m72691p(j)), new C13604l("comment_scene", "temp_18"), new C13604l("finder_username", str6), new C13604l("behaviour_session_id", ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb()), new C13604l("finder_context_id", str12), new C13604l("finder_tab_context_id", str13)), 26236);
            Intent intent = new Intent();
            Class cls4 = FinderCommonFeatureService.class;
            C104289g gVar = new C104289g();
            try {
                if (bVar.mo61298a()) {
                    nn12 = ((FinderCommonFeatureService) C86312j.m106911c(cls4)).Nt0().mo77246R5("FinderLiveEntrance");
                    s0Var = ((FinderCommonFeatureService) C86312j.m106911c(cls4)).Nt0().mo77227G5("FinderLiveEntrance");
                } else {
                    nn12 = ((FinderCommonFeatureService) C86312j.m106911c(cls4)).Nt0().mo77246R5("NearbyEntrance");
                    s0Var = ((FinderCommonFeatureService) C86312j.m106911c(cls4)).Nt0().mo77227G5("NearbyEntrance");
                }
                if (!(s0Var == null || nn12 == null)) {
                    FinderTipsShowEntranceExtInfo p2 = s0Var.mo77309p2();
                    JSONObject h = C61937h.m72709h(p2);
                    gVar.mo145967r("reddotctrltype", Long.valueOf((long) s0Var.field_ctrInfo.f144670e));
                    gVar.mo145967r("reddottipsid", s0Var.field_tipsId);
                    gVar.mo145967r("reddotshowinfopath", nn12.f184507i);
                    gVar.mo145967r("reddotshowinfoext", h.get("report_ext_info"));
                    gVar.mo145967r("feedid", C61926c.m72691p(p2.object_id));
                    gVar.mo145967r("username", s0Var.f158585F.f186560u);
                }
            } catch (Exception e) {
                Log.m105920e(str11, "genChnlExtra fail! ex:" + e.getMessage());
            }
            Log.m105924i(str11, "genChnlExtra:" + gVar);
            String gVar2 = gVar.toString();
            C87412m.m108593f(gVar2, "chnlExtra.toString()");
            String n = C112551y.m153814n(gVar2, ",", ";", false);
            if (!(n.length() == 0)) {
                intent.putExtra("key_chnl_extra", n);
            }
            intent.putExtra("KEY_PARAMS_NOT_KEEP_CUR_LIVE", true);
            String str14 = str;
            C10936a aVar = new C10936a(str12, j2, str14);
            FinderItem e2 = C65834e.f189316a.mo89871e(j2);
            FinderObject feedObject = e2 != null ? e2.getFeedObject() : null;
            String f = mo11138f(j2, str14);
            if (feedObject == null) {
                feedObject = f32587c.get(f);
            }
            if (f32587c.containsKey(f)) {
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                    C76912y0.makeText((Context) activity, (CharSequence) "命中预拉取", 0).show();
                } else {
                    Activity activity3 = activity;
                }
                Log.m105924i(str11, "enterLive hit prefetch:true");
            } else {
                Activity activity4 = activity;
                if (feedObject != null) {
                    if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                        C76912y0.makeText((Context) activity4, (CharSequence) "命中红点下发", 0).show();
                    }
                    Log.m105924i(str11, "enterLive hit FinderCache");
                } else {
                    if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                        C76912y0.makeText((Context) activity4, (CharSequence) "没有命中缓存", 0).show();
                    }
                    Log.m105924i(str11, "enterLive hit prefetch:false");
                }
            }
            if (feedObject != null) {
                C115669n.INSTANCE.mo175913w(1552, 91, 1);
                Log.m105924i(str11, "enterLive hit cache");
                C64279c90 c902 = new C64279c90();
                c902.f182444d = str12;
                c902.f182445e = str13;
                c902.f182446f = false;
                c902.f182447g = -1;
                c902.f182448h = -1;
                c902.f182449i = 1;
                C64686ro2 ro22 = new C64686ro2();
                ro22.f185214e = i3;
                ro22.f185217h = f32585a.mo11139g();
                BaseFinderFeed baseFinderFeed = feedObject instanceof BaseFinderFeed ? (BaseFinderFeed) feedObject : null;
                if (!(baseFinderFeed == null || (o = baseFinderFeed.mo3513o()) == null || (nickName = o.getNickName()) == null)) {
                    str8 = nickName;
                }
                ro22.f185215f = str8;
                ro22.f185218i = feedObject;
                c902.f182450j = ro22;
                C0576n4.f1379b.mo600c(intent);
                ((C10649f) C86312j.m106911c(cls3)).mo10913cP(activity, intent, C26236u.m33719b(feedObject), 0, c902, aVar);
            } else {
                C115669n.INSTANCE.mo175913w(1552, 92, 1);
                Log.m105924i(str11, "enterLive miss cache");
                C64279c90 c903 = new C64279c90();
                c903.f182444d = str12;
                c903.f182445e = str13;
                c903.f182446f = false;
                c903.f182447g = -1;
                c903.f182448h = -1;
                c903.f182449i = 1;
                C64686ro2 ro23 = new C64686ro2();
                ro23.f185214e = i3;
                ro23.f185217h = f32585a.mo11139g();
                ro23.f185215f = str8;
                ro23.f185218i = feedObject;
                c903.f182450j = ro23;
                C0576n4.f1379b.mo600c(intent);
                C64238ap2 ap22 = new C64238ap2();
                ap22.f182124d = j2;
                ap22.f182125e = 0;
                ap22.f182126f = str14;
                ap22.f182127g = str2;
                ap22.f182128h = str8;
                ap22.f182129i = str8;
                ap22.f182130j = null;
                ((C10649f) C86312j.m106911c(cls3)).mo10916tP(activity, intent, ap22, false, c903, aVar);
            }
            Log.m105924i("FinderLiveSquareTabLifeCycleReport", "enterLiveRoom");
            C13087a.f37257d = "page_live_flow";
            if (C32444a.f86187q1.mo60266n().intValue() == 0) {
                C8614b bVar2 = C8614b.f27717a;
                bVar2.getClass();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onClickRedDotEnterLiveRoom contextId:");
                sb4.append(str12);
                sb4.append(" targetTabId:");
                int i4 = i;
                sb4.append(i4);
                Log.m105924i("NearbyPreloadManager", sb4.toString());
                int i5 = i4 == 0 ? 88890 : i4;
                Intent intent2 = new Intent();
                intent2.putExtra("key_context_id", str12);
                bVar2.mo9483h(intent2, i5, 11);
            }
        }
    }

    /* renamed from: e */
    public final HashMap<Long, LinkedList<WeakReference<C32226l<FinderObject, C13598b0>>>> mo11137e() {
        return (HashMap) ((C36570n) f32589e).getValue();
    }

    /* renamed from: f */
    public final String mo11138f(long j, String str) {
        return j + '-' + str;
    }

    /* renamed from: g */
    public final C50168kr0 mo11139g() {
        C64858yi1 s = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77279s("NearbyLiveTab");
        boolean z = true;
        boolean z2 = s != null;
        C50168kr0 kr02 = new C50168kr0();
        if (s != null) {
            kr02.f136997d = s.f186549g;
            kr02.f136998e = s.f186554o;
            kr02.f136999f = s.f186553n;
            if (C37715b.f99914a.mo61298a()) {
                kr02.f137000g = "FinderLiveEntrance";
            } else {
                kr02.f137000g = "NearbyEntrance";
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getRedDotInfo isEnterRequest=");
        sb.append(z2);
        sb.append(" tab_tips_path=");
        sb.append(kr02.f137000g);
        sb.append("  tabTipsByPassInfo=");
        if (kr02.f136999f == null) {
            z = false;
        }
        sb.append(z);
        sb.append(" objectId=");
        sb.append(C61926c.m72691p(kr02.f136997d));
        sb.append(' ');
        Log.m105924i("NearbyEnterTargetLiveRoomChecker", sb.toString());
        return kr02;
    }

    /* renamed from: h */
    public final void mo11140h() {
        f32586b = false;
        f32587c.clear();
        synchronized (mo11137e()) {
            f32585a.mo11137e().clear();
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }
}
