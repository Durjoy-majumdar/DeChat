package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.C16569a;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl3.C39818r;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82970i0;
import com.tencent.p014mm.plugin.appbrand.launching.C83285a;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83428o;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.utils.C2034d2;
import com.tencent.p014mm.plugin.appbrand.utils.C68662e2;
import com.tencent.p014mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.protocal.protobuf.GetProfileInfoResponse;
import com.tencent.p014mm.protocal.protobuf.RelievedBuyInfo;
import com.tencent.p014mm.protocal.protobuf.RelievedBuySubInfo;
import com.tencent.p014mm.protocal.protobuf.WxaEvaluateBasicInfo;
import com.tencent.p014mm.protocal.protobuf.WxaRelateBrandInfo;
import com.tencent.p014mm.protocal.protobuf.WxaRelateBrandList;
import com.tencent.p014mm.protocal.protobuf.WxaRelateWeAppInfo;
import com.tencent.p014mm.protocal.protobuf.WxaRelateWeAppList;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import hp3.C87581a;
import hs0.C87585a;
import in3.C87763b;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76629w0;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import lp3.C88631d;
import mp3.C88819d;
import nr3.C89059e;
import nr3.C89060f;
import ob0.C47350c;
import org.json.JSONObject;
import p819pc.C47454d;
import pe3.C47465a;
import qo3.C77407n;
import te3.C50640o62;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI */
public final class AppBrandProfileUI extends MMActivity implements MStorage.IOnStorageChange {

    /* renamed from: V */
    public static final int f246424V = C76577a.m92151b(MMApplicationContext.getContext(), 24);

    /* renamed from: W */
    public static final int f246425W = C76577a.m92151b(MMApplicationContext.getContext(), 20);

    /* renamed from: X */
    public static final int f246426X = C76577a.m92151b(MMApplicationContext.getContext(), 2);

    /* renamed from: Y */
    public static int f246427Y = -1;

    /* renamed from: A */
    public LinearLayout f246428A;

    /* renamed from: B */
    public TextView f246429B;

    /* renamed from: C */
    public RatingBar f246430C;

    /* renamed from: D */
    public LinearLayout f246431D;

    /* renamed from: E */
    public LinearLayout f246432E;

    /* renamed from: F */
    public TextView f246433F;

    /* renamed from: G */
    public AppBrandNearbyShowcaseView f246434G;

    /* renamed from: H */
    public LinearLayout f246435H;

    /* renamed from: I */
    public LinearLayout f246436I;

    /* renamed from: J */
    public TextView f246437J;

    /* renamed from: K */
    public AppBrandNearbyShowcaseView f246438K;

    /* renamed from: L */
    public TextView f246439L;

    /* renamed from: M */
    public View f246440M;

    /* renamed from: N */
    public TextView f246441N;

    /* renamed from: P */
    public TextView f246442P;

    /* renamed from: Q */
    public boolean f246443Q = false;

    /* renamed from: R */
    public boolean f246444R;

    /* renamed from: S */
    public boolean f246445S;

    /* renamed from: T */
    public final Runnable f246446T = new C84447c();

    /* renamed from: U */
    public C88394b.C88408j f246447U;

    /* renamed from: d */
    public String f246448d;

    /* renamed from: e */
    public WxaExposedParams f246449e;

    /* renamed from: f */
    public int f246450f;

    /* renamed from: g */
    public int f246451g;

    /* renamed from: h */
    public WxaProfileAttributes f246452h;

    /* renamed from: i */
    public String f246453i = "";

    /* renamed from: j */
    public String f246454j = "";

    /* renamed from: n */
    public String f246455n = "";

    /* renamed from: o */
    public int f246456o = 0;

    /* renamed from: p */
    public C77407n f246457p;

    /* renamed from: q */
    public LinearLayout f246458q;

    /* renamed from: r */
    public ConstraintLayout f246459r;

    /* renamed from: s */
    public ImageView f246460s;

    /* renamed from: t */
    public TextView f246461t;

    /* renamed from: u */
    public LinearLayout f246462u;

    /* renamed from: v */
    public Button f246463v;

    /* renamed from: w */
    public TextView f246464w;

    /* renamed from: x */
    public TextView f246465x;

    /* renamed from: y */
    public FrameLayout f246466y;

    /* renamed from: z */
    public TextView f246467z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$e */
    public class C1977e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f11890d;

        public C1977e(AppBrandProfileUI appBrandProfileUI, View view) {
            this.f11890d = view;
        }

        public void run() {
            View view = this.f11890d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$24", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$24", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$h */
    public static class C40535h implements C40324j.C40326a {

        /* renamed from: a */
        public final WeakReference<AppBrandProfileUI> f108888a;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$h$a */
        public class C40536a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ GetProfileInfoResponse f108889d;

            public C40536a(GetProfileInfoResponse getProfileInfoResponse) {
                this.f108889d = getProfileInfoResponse;
            }

            public void run() {
                LinkedList<RelievedBuySubInfo> linkedList;
                WxaRelateWeAppInfo wxaRelateWeAppInfo;
                LinkedList<WxaRelateWeAppInfo> linkedList2;
                LinkedList<WxaRelateBrandInfo> linkedList3;
                if (C40535h.this.f108888a.get() != null) {
                    AppBrandProfileUI appBrandProfileUI = C40535h.this.f108888a.get();
                    GetProfileInfoResponse getProfileInfoResponse = this.f108889d;
                    int i = AppBrandProfileUI.f246424V;
                    appBrandProfileUI.getClass();
                    if (getProfileInfoResponse != null) {
                        WxaEvaluateBasicInfo wxaEvaluateBasicInfo = getProfileInfoResponse.evaluate_basic_info;
                        int i2 = 8;
                        int i3 = 0;
                        if (wxaEvaluateBasicInfo != null) {
                            Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "refreshBasicInfo, score: " + wxaEvaluateBasicInfo.average_score);
                            if (wxaEvaluateBasicInfo.average_score >= 0.0d) {
                                appBrandProfileUI.f246466y.setVisibility(0);
                                if (wxaEvaluateBasicInfo.average_score > 0.0d) {
                                    appBrandProfileUI.f246467z.setVisibility(8);
                                    appBrandProfileUI.f246428A.setVisibility(0);
                                    appBrandProfileUI.f246428A.setContentDescription(appBrandProfileUI.getString(C0966R.string.a8g, new Object[]{Double.valueOf(wxaEvaluateBasicInfo.average_score)}));
                                    appBrandProfileUI.f246429B.setText(appBrandProfileUI.getString(C0966R.string.f7831sy, new Object[]{Double.valueOf(wxaEvaluateBasicInfo.average_score)}));
                                    appBrandProfileUI.f246430C.setRating((float) wxaEvaluateBasicInfo.average_score);
                                } else {
                                    appBrandProfileUI.f246428A.setVisibility(8);
                                    appBrandProfileUI.f246467z.setVisibility(0);
                                }
                            } else {
                                appBrandProfileUI.f246466y.setVisibility(8);
                            }
                        }
                        WxaRelateBrandList wxaRelateBrandList = getProfileInfoResponse.relate_brand_list;
                        if (appBrandProfileUI.f246431D != null) {
                            if (wxaRelateBrandList == null || (linkedList3 = wxaRelateBrandList.brand_info_list) == null || linkedList3.isEmpty()) {
                                appBrandProfileUI.f246431D.setVisibility(8);
                            } else {
                                appBrandProfileUI.f246431D.setVisibility(0);
                                appBrandProfileUI.f246434G.setIconLayerCount(Math.min(wxaRelateBrandList.brand_info_list.size(), 3));
                                if (appBrandProfileUI.f246447U == null) {
                                    appBrandProfileUI.f246447U = new C87585a(AppBrandProfileUI.f246424V, AppBrandProfileUI.f246426X, AppBrandProfileUI.f246427Y);
                                }
                                boolean z = appBrandProfileUI.f246432E.getVisibility() != 0;
                                if (z) {
                                    appBrandProfileUI.f246434G.mo63419a(false);
                                }
                                int i4 = 0;
                                while (i4 < appBrandProfileUI.f246434G.getChildCount()) {
                                    String str = C88394b.f255384g;
                                    C88394b bVar = C88394b.C88418q.f255427a;
                                    AppBrandNearbyShowcaseView appBrandNearbyShowcaseView = appBrandProfileUI.f246434G;
                                    bVar.mo122786b((ImageView) appBrandNearbyShowcaseView.getChildAt((appBrandNearbyShowcaseView.getChildCount() - 1) - i4), wxaRelateBrandList.brand_info_list.size() > i4 ? wxaRelateBrandList.brand_info_list.get(i4).icon_url : null, C88393a.m110230a(), appBrandProfileUI.f246447U);
                                    i4++;
                                }
                                if (wxaRelateBrandList.brand_info_list.size() != 1) {
                                    appBrandProfileUI.f246433F.setVisibility(8);
                                } else if (!Util.isNullOrNil(wxaRelateBrandList.brand_info_list.get(0).title)) {
                                    appBrandProfileUI.f246433F.setVisibility(0);
                                    appBrandProfileUI.f246433F.setText(wxaRelateBrandList.brand_info_list.get(0).title);
                                } else {
                                    appBrandProfileUI.f246433F.setVisibility(8);
                                }
                                appBrandProfileUI.f246431D.setOnClickListener(new C40557w1(appBrandProfileUI, wxaRelateBrandList));
                                appBrandProfileUI.mo117088J7(appBrandProfileUI.f246432E, new C40559x1(appBrandProfileUI, z));
                            }
                        }
                        WxaRelateBrandList wxaRelateBrandList2 = getProfileInfoResponse.relate_brand_list;
                        if (wxaRelateBrandList2 != null && !TextUtils.isEmpty(wxaRelateBrandList2.brand_register_title)) {
                            String str2 = getProfileInfoResponse.relate_brand_list.brand_register_title;
                            C40537i iVar = new C40537i(getProfileInfoResponse.new_relate_weapp_list);
                            if (appBrandProfileUI.f246435H != null) {
                                int a = iVar.mo63384a();
                                if (1 >= a) {
                                    appBrandProfileUI.f246435H.setVisibility(8);
                                } else {
                                    appBrandProfileUI.f246435H.setVisibility(0);
                                    appBrandProfileUI.f246438K.setIconLayerCount(Math.min(a, 3));
                                    if (appBrandProfileUI.f246447U == null) {
                                        appBrandProfileUI.f246447U = new C87585a(AppBrandProfileUI.f246424V, AppBrandProfileUI.f246426X, AppBrandProfileUI.f246427Y);
                                    }
                                    boolean z2 = appBrandProfileUI.f246436I.getVisibility() != 0;
                                    if (z2) {
                                        appBrandProfileUI.f246438K.mo63419a(false);
                                    }
                                    for (int i5 = 0; i5 < appBrandProfileUI.f246438K.getChildCount(); i5++) {
                                        if (i5 < iVar.mo63384a()) {
                                            Iterator<WxaRelateWeAppList> it = iVar.f108891a.iterator();
                                            int i6 = 0;
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                WxaRelateWeAppList next = it.next();
                                                if (!(next == null || (linkedList2 = next.weapp_info_list) == null || linkedList2.isEmpty())) {
                                                    int i7 = i5 - i6;
                                                    int size = next.weapp_info_list.size();
                                                    if (i7 < size) {
                                                        wxaRelateWeAppInfo = next.weapp_info_list.get(i7);
                                                        break;
                                                    }
                                                    i6 += size;
                                                }
                                            }
                                        }
                                        wxaRelateWeAppInfo = null;
                                        String str3 = wxaRelateWeAppInfo != null ? wxaRelateWeAppInfo.icon_url : null;
                                        String str4 = C88394b.f255384g;
                                        C88394b bVar2 = C88394b.C88418q.f255427a;
                                        AppBrandNearbyShowcaseView appBrandNearbyShowcaseView2 = appBrandProfileUI.f246438K;
                                        bVar2.mo122786b((ImageView) appBrandNearbyShowcaseView2.getChildAt((appBrandNearbyShowcaseView2.getChildCount() - 1) - i5), str3, C88393a.m110230a(), appBrandProfileUI.f246447U);
                                    }
                                    appBrandProfileUI.f246437J.setVisibility(8);
                                    appBrandProfileUI.f246435H.setOnClickListener(new C40561y1(appBrandProfileUI, iVar, str2));
                                    appBrandProfileUI.mo117088J7(appBrandProfileUI.f246436I, new C40564z1(appBrandProfileUI, z2));
                                }
                            }
                            appBrandProfileUI.f246465x.setText(appBrandProfileUI.getString(C0966R.string.f7833t0, new Object[]{getProfileInfoResponse.relate_brand_list.brand_register_title}));
                        }
                        if (!TextUtils.isEmpty(getProfileInfoResponse.guarant_url)) {
                            appBrandProfileUI.mo117094P7();
                        }
                        if (!TextUtils.isEmpty(getProfileInfoResponse.officical_url)) {
                            appBrandProfileUI.f246455n = getProfileInfoResponse.officical_url;
                            appBrandProfileUI.mo117094P7();
                        }
                        Button button = appBrandProfileUI.f246463v;
                        if (1 == getProfileInfoResponse.use_kf) {
                            i2 = 0;
                        }
                        button.setVisibility(i2);
                        appBrandProfileUI.mo117094P7();
                        if (appBrandProfileUI.f246452h != null) {
                            C2003l1 l1Var = (C2003l1) C39818r.f106831a.mo62444c(appBrandProfileUI).mo75002a(C2003l1.class);
                            l1Var.f11937d = new C2024v1(appBrandProfileUI);
                            l1Var.mo1921d3(appBrandProfileUI.f246452h.f239584p, getProfileInfoResponse.relieved_buy_info);
                        }
                        RelievedBuyInfo relievedBuyInfo = getProfileInfoResponse.relieved_buy_info;
                        if (!(relievedBuyInfo == null || (linkedList = relievedBuyInfo.sub_info) == null)) {
                            for (RelievedBuySubInfo relievedBuySubInfo : linkedList) {
                                if (relievedBuySubInfo != null) {
                                    i3 |= 1 << relievedBuySubInfo.sub_type;
                                }
                            }
                        }
                        appBrandProfileUI.f246456o = i3;
                    }
                }
            }
        }

        public C40535h(AppBrandProfileUI appBrandProfileUI) {
            this.f108888a = new WeakReference<>(appBrandProfileUI);
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C47465a aVar;
            if (this.f108888a.get() == null) {
                return;
            }
            if (i != 0 || i2 != 0 || cVar == null || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof GetProfileInfoResponse)) {
                Log.m105920e("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "queryProfile, request fail");
                return;
            }
            Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "queryProfile, request success");
            MMHandlerThread.postToMainThread(new C40536a((GetProfileInfoResponse) cVar.f127056b.f127083a));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$i */
    public static class C40537i {

        /* renamed from: a */
        public final List<WxaRelateWeAppList> f108891a;

        public C40537i(List<WxaRelateWeAppList> list) {
            this.f108891a = list;
        }

        /* renamed from: a */
        public int mo63384a() {
            LinkedList<WxaRelateWeAppInfo> linkedList;
            List<WxaRelateWeAppList> list = this.f108891a;
            int i = 0;
            if (list != null && !list.isEmpty()) {
                for (WxaRelateWeAppList next : this.f108891a) {
                    if (!(next == null || (linkedList = next.weapp_info_list) == null || linkedList.isEmpty())) {
                        i += next.weapp_info_list.size();
                    }
                }
            }
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$a */
    public class C84445a implements C88631d.C88632b<WxaProfileAttributes> {

        /* renamed from: a */
        public final /* synthetic */ boolean f246468a;

        public C84445a(boolean z) {
            this.f246468a = z;
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            ImageView imageView;
            WxaProfileAttributes wxaProfileAttributes = (WxaProfileAttributes) obj;
            AppBrandProfileUI appBrandProfileUI = AppBrandProfileUI.this;
            int i = AppBrandProfileUI.f246424V;
            if (!appBrandProfileUI.isFinishing() && !appBrandProfileUI.isDestroyed() && wxaProfileAttributes != null) {
                WxaProfileAttributes wxaProfileAttributes2 = appBrandProfileUI.f246452h;
                if ((wxaProfileAttributes2 == null || !Util.nullAsNil(wxaProfileAttributes2.f239579h).equals(wxaProfileAttributes.f239579h)) && (imageView = appBrandProfileUI.f246460s) != null) {
                    String str = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122786b(imageView, wxaProfileAttributes.f239579h, C88393a.m110230a(), new C88431k());
                    appBrandProfileUI.f246460s.setOnClickListener(new C2019r1(appBrandProfileUI, wxaProfileAttributes));
                }
                WxaProfileAttributes wxaProfileAttributes3 = appBrandProfileUI.f246452h;
                if ((wxaProfileAttributes3 == null || !Util.nullAsNil(wxaProfileAttributes3.f239577f).equals(wxaProfileAttributes.f239577f)) && appBrandProfileUI.f246461t != null) {
                    appBrandProfileUI.f246453i = wxaProfileAttributes.f239577f;
                    appBrandProfileUI.mo117094P7();
                }
                WxaProfileAttributes wxaProfileAttributes4 = appBrandProfileUI.f246452h;
                if ((wxaProfileAttributes4 == null || !Util.nullAsNil(wxaProfileAttributes4.f239578g).equals(wxaProfileAttributes.f239578g)) && appBrandProfileUI.f246464w != null) {
                    if (!Util.isNullOrNil(wxaProfileAttributes.f239578g)) {
                        appBrandProfileUI.f246464w.setText(wxaProfileAttributes.f239578g);
                        appBrandProfileUI.f246464w.setVisibility(0);
                    } else {
                        appBrandProfileUI.f246464w.setText("");
                        appBrandProfileUI.f246464w.setVisibility(8);
                    }
                }
                if (wxaProfileAttributes.f239582n == 4) {
                    if (appBrandProfileUI.f246441N != null) {
                        String string = appBrandProfileUI.getString(C0966R.string.f7821so);
                        appBrandProfileUI.f246441N.setVisibility(0);
                        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string);
                        newSpannable.setSpan(new C2021s1(appBrandProfileUI), 0, string.length(), 33);
                        appBrandProfileUI.f246441N.setText(newSpannable);
                        appBrandProfileUI.f246441N.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    WxaProfileAttributes wxaProfileAttributes5 = appBrandProfileUI.f246452h;
                    if (wxaProfileAttributes5 == null || wxaProfileAttributes5.f239587s != wxaProfileAttributes.f239587s) {
                        if (wxaProfileAttributes.f239587s != 1 || appBrandProfileUI.f246439L == null) {
                            appBrandProfileUI.f246444R = false;
                            appBrandProfileUI.mo117094P7();
                            appBrandProfileUI.f246439L.setVisibility(8);
                            View view = appBrandProfileUI.f246440M;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "attachAppAttrs", "(Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "attachAppAttrs", "(Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            appBrandProfileUI.f246441N.setGravity(1);
                        } else {
                            appBrandProfileUI.f246444R = true;
                            appBrandProfileUI.mo117094P7();
                            appBrandProfileUI.f246439L.setVisibility(0);
                            View view3 = appBrandProfileUI.f246440M;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "attachAppAttrs", "(Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "attachAppAttrs", "(Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            appBrandProfileUI.f246439L.setMovementMethod(LinkMovementMethod.getInstance());
                            if (!Util.isNullOrNil(wxaProfileAttributes.f239588t)) {
                                String str2 = wxaProfileAttributes.f239588t;
                                appBrandProfileUI.f246454j = str2;
                                try {
                                    String a = C83727p2.m102771a(str2, "appid=" + appBrandProfileUI.f246449e.f239539d);
                                    String string2 = appBrandProfileUI.getString(C0966R.string.f7816sh);
                                    Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(string2);
                                    newSpannable2.setSpan(new C2023t1(appBrandProfileUI, a), 0, string2.length(), 33);
                                    appBrandProfileUI.f246439L.setText(newSpannable2);
                                    appBrandProfileUI.f246439L.setMovementMethod(LinkMovementMethod.getInstance());
                                } catch (URISyntaxException e) {
                                    Log.printErrStackTrace("MicroMsg.AppBrand.Profile.AppBrandProfileUI", e, "URISyntaxException with originalRedirectUrl %s", wxaProfileAttributes.f239588t);
                                }
                            }
                        }
                    }
                } else {
                    appBrandProfileUI.f246444R = false;
                    appBrandProfileUI.mo117094P7();
                    appBrandProfileUI.f246439L.setVisibility(8);
                    View view5 = appBrandProfileUI.f246440M;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "attachAppAttrs", "(Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "attachAppAttrs", "(Lcom/tencent/mm/plugin/appbrand/config/WxaProfileAttributes;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    appBrandProfileUI.f246441N.setVisibility(8);
                }
                appBrandProfileUI.f246452h = wxaProfileAttributes;
                WxaExposedParams wxaExposedParams = appBrandProfileUI.f246449e;
                if (wxaExposedParams != null) {
                    wxaExposedParams.f239539d = wxaProfileAttributes.f239576e;
                    wxaExposedParams.f239542g = wxaProfileAttributes.f239575d;
                }
                if (!(wxaProfileAttributes.f239586r != 0) || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_show_official_flag, 0) != 1) {
                    appBrandProfileUI.f246445S = false;
                    appBrandProfileUI.mo117094P7();
                } else {
                    appBrandProfileUI.f246445S = true;
                    appBrandProfileUI.mo117094P7();
                }
            }
            if (this.f246468a && !AppBrandProfileUI.this.isFinishing() && !AppBrandProfileUI.this.isDestroyed()) {
                C81661j.m100182g().add(AppBrandProfileUI.this);
                AppBrandProfileUI.this.mo117090L7(1, 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$b */
    public class C84446b implements C87581a<WxaProfileAttributes, Void> {

        /* renamed from: a */
        public final /* synthetic */ boolean f246470a;

        public C84446b(boolean z) {
            this.f246470a = z;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            WxaProfileAttributes b = C81661j.m100177b(AppBrandProfileUI.this.f246448d, false);
            if (this.f246470a) {
                ((C119157j) C119157j.f356862d).mo183884o(new C84579q1(this));
            }
            return b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$c */
    public class C84447c implements Runnable {

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$c$a */
        public class C84448a implements Runnable {

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$c$a$a */
            public class C84449a extends ClickableSpan {
                public C84449a() {
                }

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$17$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
                    if (TextUtils.isEmpty(AppBrandProfileUI.this.f246455n)) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$17$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    AppBrandProfileUI.this.mo117090L7(25, 1);
                    C88144b.m109791i(AppBrandProfileUI.this, "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", AppBrandProfileUI.this.f246455n).putExtra("forceHideShare", true), (Bundle) null);
                    Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "click official icon");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$17$1$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$c$a$b */
            public class C84450b {

                /* renamed from: a */
                public boolean f246475a;

                public C84450b(C84448a aVar, boolean z) {
                    this.f246475a = z;
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$c$a$c */
            public class C84451c extends ClickableSpan {
                public C84451c() {
                }

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$17$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
                    if (TextUtils.isEmpty(AppBrandProfileUI.this.f246454j)) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$17$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    try {
                        String str = AppBrandProfileUI.this.f246454j;
                        C88144b.m109791i(AppBrandProfileUI.this, "webview", ".ui.tools.WebViewUI", new Intent().putExtra("rawUrl", C83727p2.m102771a(str, "appid=" + AppBrandProfileUI.this.f246449e.f239539d)).putExtra("forceHideShare", true), (Bundle) null);
                        AppBrandProfileUI.this.mo117090L7(21, 1);
                    } catch (URISyntaxException e) {
                        Log.printErrStackTrace("MicroMsg.AppBrand.Profile.AppBrandProfileUI", e, "URISyntaxException with originalRedirectUrl %s", AppBrandProfileUI.this.f246454j);
                    }
                    Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "click original icon");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI$17$1$2", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
                }
            }

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$c$a$d */
            public class C84452d implements TextUtils.EllipsizeCallback {

                /* renamed from: a */
                public final /* synthetic */ C84450b f246477a;

                public C84452d(C84448a aVar, C84450b bVar) {
                    this.f246477a = bVar;
                }

                public void ellipsized(int i, int i2) {
                    Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "ellipsized, start: %d, end: %d", Integer.valueOf(i), Integer.valueOf(i2));
                    if (i != 0 || i2 != 0) {
                        this.f246477a.f246475a = true;
                    }
                }
            }

            public C84448a() {
            }

            public void run() {
                boolean z;
                int i;
                String str;
                ArrayList arrayList = new ArrayList();
                AppBrandProfileUI appBrandProfileUI = AppBrandProfileUI.this;
                if (appBrandProfileUI.f246445S) {
                    Pair<SpannableString, Integer> a = C68662e2.f197218a.mo94370a(appBrandProfileUI.getContext(), C0966R.C0969drawable.buk, 4, 36, 20, new C84449a());
                    arrayList.add((SpannableString) a.first);
                    i = ((Integer) a.second).intValue() + 0;
                    z = true;
                } else {
                    i = 0;
                    z = false;
                }
                AppBrandProfileUI appBrandProfileUI2 = AppBrandProfileUI.this;
                if (appBrandProfileUI2.f246444R) {
                    Pair<SpannableString, Integer> a2 = C68662e2.f197218a.mo94370a(appBrandProfileUI2.getContext(), C0966R.C0969drawable.buf, 4, 36, 20, new C84451c());
                    arrayList.add((SpannableString) a2.first);
                    i += ((Integer) a2.second).intValue();
                    z = true;
                }
                if (z) {
                    AppCompatActivity context = AppBrandProfileUI.this.getContext();
                    C68662e2.C68663a aVar = C68662e2.f197218a;
                    C87412m.m108594g(context, "context");
                    arrayList.add((SpannableString) aVar.mo94370a(context, C0966R.C0969drawable.f4938rt, 1, 0, 0, new C2034d2()).first);
                }
                C84450b bVar = new C84450b(this, false);
                int width = (AppBrandProfileUI.this.f246461t.getWidth() - AppBrandProfileUI.this.f246461t.getPaddingLeft()) - AppBrandProfileUI.this.f246461t.getPaddingRight();
                Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "bufferWidth: %d, availableTextWidth: %d", Integer.valueOf(i), Integer.valueOf(width));
                if (width <= i) {
                    bVar.f246475a = true;
                    str = "MicroMsg.AppBrand.Profile.AppBrandProfileUI";
                } else {
                    TextPaint paint = AppBrandProfileUI.this.f246461t.getPaint();
                    String str2 = AppBrandProfileUI.this.f246453i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C87412m.m108594g(paint, "tp");
                    StaticLayout staticLayout = r9;
                    str = "MicroMsg.AppBrand.Profile.AppBrandProfileUI";
                    StaticLayout staticLayout2 = new StaticLayout(str2, paint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                    int lineCount = staticLayout.getLineCount();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < lineCount; i2++) {
                        StaticLayout staticLayout3 = staticLayout;
                        arrayList2.add(new Point(staticLayout3.getLineStart(i2), staticLayout3.getLineEnd(i2)));
                    }
                    if (arrayList2.size() >= AppBrandProfileUI.this.f246461t.getMaxLines()) {
                        int min = Math.min(AppBrandProfileUI.this.f246461t.getMaxLines() - 1, arrayList2.size() - 1);
                        TextUtils.ellipsize(AppBrandProfileUI.this.f246453i.substring(((Point) arrayList2.get(min)).x), paint, (float) (width - i), TextUtils.TruncateAt.END, false, new C84452d(this, bVar));
                    }
                }
                AppBrandProfileUI appBrandProfileUI3 = AppBrandProfileUI.this;
                appBrandProfileUI3.f246461t.setText(appBrandProfileUI3.f246453i);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AppBrandProfileUI.this.f246461t.append((SpannableString) it.next());
                }
                AppBrandProfileUI.this.f246461t.setFocusable(true);
                if (z) {
                    AppBrandProfileUI.this.f246461t.setMovementMethod(LinkMovementMethod.getInstance());
                }
                if (bVar.f246475a) {
                    AppBrandProfileUI appBrandProfileUI4 = AppBrandProfileUI.this;
                    appBrandProfileUI4.getClass();
                    Log.m105924i(str, "relayout4ShowAppName");
                    C16569a aVar2 = new C16569a();
                    aVar2.mo16716c(appBrandProfileUI4.f246459r);
                    aVar2.mo16717d(C0966R.C0970id.i58, 3, C0966R.C0970id.f358975i63, 3);
                    aVar2.mo16717d(C0966R.C0970id.i58, 4, C0966R.C0970id.f358975i63, 4);
                    aVar2.mo16717d(C0966R.C0970id.i4p, 3, C0966R.C0970id.f358975i63, 4);
                    aVar2.mo16715b(C0966R.C0970id.i4p, 4);
                    aVar2.mo16717d(C0966R.C0970id.f358975i63, 7, 0, 7);
                    aVar2.mo16715b(C0966R.C0970id.f358975i63, 4);
                    ConstraintLayout constraintLayout = appBrandProfileUI4.f246459r;
                    aVar2.mo16714a(constraintLayout);
                    constraintLayout.setConstraintSet((C16569a) null);
                    appBrandProfileUI4.f246461t.setMaxLines(Integer.MAX_VALUE);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appBrandProfileUI4.f246461t.getLayoutParams();
                    marginLayoutParams.rightMargin = 0;
                    appBrandProfileUI4.f246461t.setLayoutParams(marginLayoutParams);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) appBrandProfileUI4.f246462u.getLayoutParams();
                    marginLayoutParams2.topMargin = C74942w4.m89786c(appBrandProfileUI4, C0966R.dimen.f3723cd);
                    appBrandProfileUI4.f246462u.setLayoutParams(marginLayoutParams2);
                    appBrandProfileUI4.f246459r.post(new C84680u1(appBrandProfileUI4));
                }
            }
        }

        public C84447c() {
        }

        public void run() {
            AppBrandProfileUI appBrandProfileUI = AppBrandProfileUI.this;
            appBrandProfileUI.f246461t.setHighlightColor(appBrandProfileUI.getResources().getColor(17170445));
            AppBrandProfileUI.this.f246461t.post(new C84448a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$d */
    public class C84453d implements C87581a<Void, C87763b> {
        public C84453d(AppBrandProfileUI appBrandProfileUI) {
        }

        public Object call(Object obj) {
            ((C87763b) obj).setLayoutFrozen(true);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$f */
    public class C84454f implements C87581a<Void, C87763b> {
        public C84454f(AppBrandProfileUI appBrandProfileUI) {
        }

        public Object call(Object obj) {
            ((C87763b) obj).setLayoutFrozen(false);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI$g */
    public static class C84455g implements C76629w0.C61144a {

        /* renamed from: a */
        public final WeakReference<AppBrandProfileUI> f246478a;

        /* renamed from: b */
        public final WxaProfileAttributes f246479b;

        public C84455g(AppBrandProfileUI appBrandProfileUI, WxaProfileAttributes wxaProfileAttributes) {
            this.f246478a = new WeakReference<>(appBrandProfileUI);
            this.f246479b = wxaProfileAttributes;
        }

        /* renamed from: a */
        public void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes == null) {
                Log.m105928w("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "onGetWeAppInfo, wxaAttrs is null");
            }
            mo117101b();
        }

        /* renamed from: b */
        public final void mo117101b() {
            AppBrandProfileUI appBrandProfileUI = this.f246478a.get();
            if (appBrandProfileUI == null) {
                Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "realDoEnter, ui is null");
            } else if (8 == appBrandProfileUI.f246450f) {
                Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "realDoEnter, from service chatting");
                appBrandProfileUI.finish();
            } else {
                Intent intent = new Intent();
                intent.putExtra("Chat_User", this.f246479b.f239575d);
                intent.putExtra("app_brand_chatting_expose_params", appBrandProfileUI.f246449e);
                boolean z = true;
                intent.putExtra("finish_direct", true);
                if (!BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.IS_FLAVOR_PURPLE && !WeChatEnvironment.hasDebugger()) {
                    z = false;
                }
                C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
                if (hVar != null) {
                    z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video, z);
                }
                Log.m105924i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + z);
                if (!z) {
                    intent.putExtra("key_need_send_video", false);
                }
                intent.putExtra("app_brand_chatting_from_scene_new", 7);
                intent.putExtra("app_brand_chatting_from_app_id", this.f246479b.f239576e);
                C88144b.m109801s(appBrandProfileUI, ".ui.chatting.AppBrandServiceChattingUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: H7 */
    public static void m104015H7(AppBrandProfileUI appBrandProfileUI, int i) {
        if (appBrandProfileUI.f246449e == null) {
            Log.m105920e("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "wxaExposedParams is null");
            return;
        }
        Intent intent = new Intent();
        String b = C83727p2.m102772b(appBrandProfileUI.f246449e);
        Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "feedbackUrl:%s, wxaExposedParams:%s", b, appBrandProfileUI.f246449e.toString());
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, appBrandProfileUI.getContext().getString(C0966R.string.f7820sm));
        intent.putExtra("rawUrl", b);
        intent.putExtra("forceHideShare", true);
        C88144b.m109791i(appBrandProfileUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        appBrandProfileUI.mo117090L7(i, 1);
    }

    /* renamed from: Q7 */
    public static void m104016Q7(Context context, String str, int i, int i2, String str2, boolean z, WxaExposedParams wxaExposedParams, Bundle bundle, ActivityStarterIpcDelegate activityStarterIpcDelegate, int i3) {
        WxaExposedParams wxaExposedParams2 = wxaExposedParams;
        if (!Util.isNullOrNil(str)) {
            Context context2 = context == null ? MMApplicationContext.getContext() : context;
            String str3 = str;
            int i4 = i;
            String str4 = str2;
            boolean z2 = z;
            int i5 = i2;
            Intent putExtra = new Intent(context2, AppBrandProfileUI.class).putExtra("key_username", str).putExtra("key_from_scene", i).putExtra("key_scene_note", str2).putExtra("key_can_swipe_back", z).putExtra("key_scene_exposed_params", wxaExposedParams).putExtra("key_extra_bundle", bundle).putExtra("key_wxapp_scene", i2);
            if (wxaExposedParams2 != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("stat_scene", 6);
                bundle2.putString("stat_app_id", wxaExposedParams2.f239539d);
                bundle2.putString("stat_url", wxaExposedParams2.f239549q);
                putExtra.putExtra("_stat_obj", bundle2);
            }
            putExtra.putExtra("KEY_DELEGATED_ACTIVITY_STARTER", activityStarterIpcDelegate);
            boolean z3 = context2 instanceof Activity;
            if (!z3) {
                putExtra.addFlags(268435456);
            }
            if (!z3 || i3 < 0) {
                C9556a aVar = new C9556a();
                aVar.mo10233c(putExtra);
                Context context3 = context2;
                C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "show", "(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/config/WxaExposedParams;Landroid/os/Bundle;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context3, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "show", "(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/config/WxaExposedParams;Landroid/os/Bundle;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Integer.valueOf(i3));
            aVar2.mo10233c(putExtra);
            C117292a.m165364j((Activity) context2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "show", "(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/config/WxaExposedParams;Landroid/os/Bundle;Lcom/tencent/luggage/sdk/launching/ActivityStarterIpcDelegate;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    /* renamed from: R7 */
    public static void m104017R7(Context context, String str, int i, String str2, boolean z, WxaExposedParams wxaExposedParams, Bundle bundle, ActivityStarterIpcDelegate activityStarterIpcDelegate) {
        m104016Q7(context, str, i, 1236, str2, z, wxaExposedParams, bundle, activityStarterIpcDelegate, -1);
    }

    /* renamed from: I7 */
    public final void mo117087I7(View view) {
        if (view.getVisibility() == 0) {
            view.animate().setDuration(200).alpha(0.0f).withEndAction(new C1977e(this, view)).start();
        }
    }

    /* renamed from: J7 */
    public final void mo117088J7(View view, Runnable runnable) {
        if (view.getVisibility() != 0) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "makeViewVisibleWithAnimation", "(Landroid/view/View;Ljava/lang/Runnable;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "makeViewVisibleWithAnimation", "(Landroid/view/View;Ljava/lang/Runnable;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "makeViewVisibleWithAnimation", "(Landroid/view/View;Ljava/lang/Runnable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandProfileUI", "makeViewVisibleWithAnimation", "(Landroid/view/View;Ljava/lang/Runnable;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view.animate().setDuration(200).alpha(1.0f).withEndAction(runnable).start();
    }

    /* renamed from: K7 */
    public final void mo117089K7(String str) {
        Bundle extras;
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("key_from_scene")) {
                this.f246450f = extras.getInt("key_from_scene");
            }
            this.f246451g = extras.getInt("key_wxapp_scene", 1236);
            Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "%s, fromScene: %d", str, Integer.valueOf(this.f246450f));
        }
    }

    /* renamed from: L7 */
    public final void mo117090L7(int i, int i2) {
        mo117091M7(i, i2, Util.nowSecond(), (C82970i0) null);
    }

    /* renamed from: M7 */
    public final void mo117091M7(int i, int i2, long j, C82970i0 i0Var) {
        C82970i0 i0Var2 = i0Var;
        WxaProfileAttributes wxaProfileAttributes = this.f246452h;
        String str = wxaProfileAttributes == null ? null : wxaProfileAttributes.f239576e;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "profileOperateReport appId null");
            return;
        }
        int intExtra = getIntent().getIntExtra("key_from_scene", 3);
        String nullAsNil = Util.nullAsNil(getIntent().getStringExtra("key_scene_note"));
        WxaAttributes mL = C81161g2.Cx0().mo114011mL(str, "appInfo", "brandIconURL", "nickname");
        int i3 = (mL != null ? mL.mo113940m2().f239488d : 0) + 1000;
        String str2 = "";
        String str3 = i0Var2 == null ? str2 : i0Var2.f242600a;
        int i4 = i0Var2 == null ? 0 : i0Var2.f242601b;
        String nullAsNil2 = Util.nullAsNil(i0Var2 == null ? str2 : i0Var2.f242602c);
        String encode = URLEncoder.encode(Util.nullAsNil(i0Var2 == null ? str2 : i0Var2.f242603d));
        if (i0Var2 != null) {
            str2 = i0Var2.f242604e;
        }
        String encode2 = URLEncoder.encode(Util.nullAsNil(str2));
        int i5 = this.f246456o;
        Log.m105919d("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "stev report(%s), appId %s, scene %s, sceneNote %s, eventId %s, result %s, appType %s,shareActionId:%s, shareActionType:%d, shareTitle:%s, sharePath:%s, shareImgUrl:%s, shopGuaranteeInfo:%d", 13919, str, Integer.valueOf(intExtra), nullAsNil, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str3, Integer.valueOf(i4), nullAsNil2, encode, encode2, Integer.valueOf(i5));
        C115669n.INSTANCE.mo160131h(13919, str, Integer.valueOf(intExtra), nullAsNil, Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i3), str3, Integer.valueOf(i4), nullAsNil2, encode, encode2, Integer.valueOf(i5));
    }

    /* renamed from: N7 */
    public final void mo117092N7(boolean z) {
        C89059e<Void> a = C89060f.m111322a();
        a.mo11397F(this);
        a.mo123064p(new C84446b(z)).mo114039c(C88819d.f256219UI, new C84445a(z));
    }

    /* renamed from: O7 */
    public final void mo117093O7() {
        if (!Util.isNullOrNil(this.f246448d)) {
            Log.m105924i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "queryProfile start");
            C50640o62 o622 = new C50640o62();
            o622.f138980d = this.f246448d;
            o622.f138981e = LocaleUtil.getApplicationLanguage();
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = 2921;
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/getprofileinfo";
            bVar.f127066a = o622;
            bVar.f127067b = new GetProfileInfoResponse();
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C40535h(this));
        }
    }

    /* renamed from: P7 */
    public final void mo117094P7() {
        MMHandlerThread.removeRunnable(this.f246446T);
        MMHandlerThread.postToMainThread(this.f246446T);
    }

    /* renamed from: S7 */
    public final void mo117095S7() {
        C47454d.f127280a.mo72475b("wx27a2b9eea2cf1a62", ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_fake_native_profile_render, 0));
        String str = this.f246448d;
        int i = this.f246450f;
        String stringExtra = getIntent().getStringExtra("key_scene_note");
        int i2 = this.f246451g;
        WxaExposedParams wxaExposedParams = this.f246449e;
        Bundle bundleExtra = getIntent().getBundleExtra("key_extra_bundle");
        ActivityStarterIpcDelegate activityStarterIpcDelegate = (ActivityStarterIpcDelegate) getIntent().getParcelableExtra("KEY_DELEGATED_ACTIVITY_STARTER");
        LaunchParcel launchParcel = new LaunchParcel();
        launchParcel.f243731e = "wx27a2b9eea2cf1a62";
        HashMap hashMap = new HashMap();
        hashMap.put("userName", str);
        hashMap.put("enterScene", Integer.valueOf(i));
        hashMap.put("sceneNote", stringExtra);
        hashMap.put("needShowBottomFeedback", Boolean.valueOf(bundleExtra != null && bundleExtra.getBoolean("key_is_embed_wxa", false)));
        if (wxaExposedParams != null) {
            hashMap.put("hostAppid", wxaExposedParams.f239541f);
            hashMap.put("snapShotLocalId", wxaExposedParams.f239551s);
        }
        launchParcel.f243735i = String.format("pages/index/index.html?enterQuery=%s", new Object[]{URLEncoder.encode(new JSONObject(hashMap).toString()), "utf-8"});
        launchParcel.f243733g = 0;
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = i2;
        launchParcel.f243738o = appBrandStatObject;
        launchParcel.f243745v = activityStarterIpcDelegate;
        Log.m105925i("MicroMsg.AppBrand.Profile.AppBrandProfileUI", "launchFakeNativeProfile, appId=%s, username=%s, enterPath=%s", "wx27a2b9eea2cf1a62", str, launchParcel.f243735i);
        ((C83285a) C83428o.f243800a).mo115582b(this, launchParcel);
    }

    public boolean convertActivityFromTranslucent() {
        return getIntent().getBooleanExtra("key_can_swipe_back", true);
    }

    public void dealContentView(View view) {
        super.dealContentView(view);
        ScrollView scrollView = new ScrollView(this);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setOverScrollMode(2);
        scrollView.setBackgroundResource(C0966R.color.f3284m6);
        scrollView.setFillViewport(true);
        LinearLayout linearLayout = new LinearLayout(this);
        this.f246458q = linearLayout;
        linearLayout.setOrientation(1);
        this.f246458q.setFocusable(true);
        this.f246458q.setFocusableInTouchMode(true);
        scrollView.addView(this.f246458q, new FrameLayout.LayoutParams(-1, -1));
        ((FrameLayout) view).addView(scrollView);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return -1;
    }

    public void initActivityCloseAnimation() {
        if (!this.f246443Q) {
            super.initActivityCloseAnimation();
        }
    }

    public void onBackPressed() {
        super.finishAfterTransition();
        mo117090L7(6, 1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo117094P7();
    }

    public void onCreate(Bundle bundle) {
        mo117089K7("onCreate");
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_username");
        this.f246448d = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            finish();
            return;
        }
        if (getIntent().getExtras() != null && !getIntent().getExtras().containsKey("key_extra_bundle")) {
            getIntent().getExtras().putBundle("key_extra_bundle", Bundle.EMPTY);
        }
        getIntent().setExtrasClassLoader(getClassLoader());
        this.f246449e = (WxaExposedParams) getIntent().getParcelableExtra("key_scene_exposed_params");
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_fake_native_profile, 0) == 1) {
            mo117095S7();
            finish();
            return;
        }
        setBackBtn(new C84480a2(this));
        addIconOptionMenu(0, (int) C0966R.string.a0h, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C84486b2(this));
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.f6445f2, this.f246458q, true);
        inflate.setClickable(false);
        inflate.setLongClickable(false);
        this.f246459r = (ConstraintLayout) inflate.findViewById(C0966R.C0970id.i4o);
        this.f246460s = (ImageView) inflate.findViewById(C0966R.C0970id.i58);
        this.f246461t = (TextView) inflate.findViewById(C0966R.C0970id.f358975i63);
        this.f246462u = (LinearLayout) inflate.findViewById(C0966R.C0970id.i4p);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.f358971i52);
        this.f246463v = button;
        button.setOnClickListener(new C84500c2(this));
        inflate.findViewById(C0966R.C0970id.f358970i51).setOnClickListener(new C84521d2(this));
        this.f246464w = (TextView) inflate.findViewById(C0966R.C0970id.i4t);
        this.f246465x = (TextView) inflate.findViewById(C0966R.C0970id.k9s);
        this.f246466y = (FrameLayout) inflate.findViewById(C0966R.C0970id.f358977i70);
        this.f246467z = (TextView) inflate.findViewById(C0966R.C0970id.f358978i71);
        this.f246428A = (LinearLayout) inflate.findViewById(C0966R.C0970id.i6z);
        this.f246429B = (TextView) inflate.findViewById(C0966R.C0970id.f358979i72);
        this.f246430C = (RatingBar) inflate.findViewById(C0966R.C0970id.i6y);
        ((LinearLayout) inflate.findViewById(C0966R.C0970id.gzo)).setOnClickListener(new C84523e2(this));
        this.f246431D = (LinearLayout) inflate.findViewById(C0966R.C0970id.i4l);
        this.f246432E = (LinearLayout) inflate.findViewById(C0966R.C0970id.i4k);
        this.f246433F = (TextView) inflate.findViewById(C0966R.C0970id.i4m);
        AppBrandNearbyShowcaseView appBrandNearbyShowcaseView = (AppBrandNearbyShowcaseView) inflate.findViewById(C0966R.C0970id.i4n);
        this.f246434G = appBrandNearbyShowcaseView;
        int i = f246425W;
        appBrandNearbyShowcaseView.setIconGap(i);
        AppBrandNearbyShowcaseView appBrandNearbyShowcaseView2 = this.f246434G;
        int i2 = f246424V;
        int i3 = f246426X;
        int i4 = (i3 * 2) + i2;
        appBrandNearbyShowcaseView2.setIconSize(i4);
        mo117087I7(this.f246432E);
        this.f246435H = (LinearLayout) inflate.findViewById(C0966R.C0970id.i7g);
        this.f246436I = (LinearLayout) inflate.findViewById(C0966R.C0970id.i7f);
        this.f246437J = (TextView) inflate.findViewById(C0966R.C0970id.i7h);
        AppBrandNearbyShowcaseView appBrandNearbyShowcaseView3 = (AppBrandNearbyShowcaseView) inflate.findViewById(C0966R.C0970id.i7i);
        this.f246438K = appBrandNearbyShowcaseView3;
        appBrandNearbyShowcaseView3.setIconGap(i);
        this.f246438K.setIconSize(i4);
        mo117087I7(this.f246436I);
        this.f246439L = (TextView) inflate.findViewById(C0966R.C0970id.i48);
        this.f246440M = inflate.findViewById(C0966R.C0970id.i49);
        this.f246441N = (TextView) inflate.findViewById(C0966R.C0970id.i68);
        Bundle bundleExtra = getIntent().getBundleExtra("key_extra_bundle");
        if (bundleExtra != null && bundleExtra.getBoolean("key_is_embed_wxa", false)) {
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f358006lz2);
            this.f246442P = textView;
            textView.setVisibility(0);
            this.f246442P.setOnClickListener(new C1990f2(this));
        }
        int color = getContext().getResources().getColor(C0966R.color.f3597yy);
        f246427Y = color;
        if (this.f246447U == null) {
            this.f246447U = new C87585a(i2, i3, color);
        }
        mo117092N7(true);
        mo117093O7();
    }

    public void onDestroy() {
        super.onDestroy();
        C81661j.m100182g().remove(this);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (!Util.isNullOrNil(this.f246448d)) {
            C81661j.m100182g().remove(this);
        }
        String stringExtra = getIntent().getStringExtra("key_username");
        this.f246448d = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            finish();
            return;
        }
        mo117089K7("onNewIntent");
        boolean z = false;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_appbrand_fake_native_profile, 0) == 1) {
            z = true;
        }
        if (z) {
            mo117095S7();
            finish();
            return;
        }
        mo117092N7(true);
        mo117093O7();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        if (mStorageEventData.eventId == 3 && (mStorageEventData.obj instanceof String) && !Util.isNullOrNil(this.f246448d) && this.f246448d.equals(mStorageEventData.obj)) {
            mo117092N7(false);
        }
    }

    public void onPause() {
        super.onPause();
        C84559k3.m104143a(this, new C84453d(this));
    }

    public void onResume() {
        super.onResume();
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(getIntent().getBooleanExtra("key_can_swipe_back", true));
        }
        C84559k3.m104143a(this, new C84454f(this));
    }

    public boolean onSwipeBackFinish() {
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C1984e1.class);
        hashSet.add(C2003l1.class);
    }
}
