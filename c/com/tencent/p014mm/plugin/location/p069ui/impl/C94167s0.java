package com.tencent.p014mm.plugin.location.p069ui.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import bp3.C104160f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskForNative;
import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tencentmap.mapsdk.map.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import ht1.C98522w3;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import lg3.C76695c;
import ob0.C117747y;
import p702ts.C78085c;
import qo3.C77407n;
import t22.C101715i;
import t22.C48535o;
import t22.C77832s;
import te3.ep4;
import te3.m74;
import x22.C118812s;
import x22.C53284e;
import y22.C118913e;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0 */
public class C94167s0 extends C94163b1 {

    /* renamed from: T0 */
    public static final String f272010T0 = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fle) + "/tencentMapTouch/app/download/apkForWXAndroidConf.json");

    /* renamed from: Q0 */
    public View f272011Q0;

    /* renamed from: R */
    public C118812s f272012R;

    /* renamed from: R0 */
    public boolean f272013R0 = false;

    /* renamed from: S */
    public LocationCrossHairView f272014S;

    /* renamed from: S0 */
    public HashMap<String, Integer> f272015S0 = new HashMap<>();

    /* renamed from: T */
    public C53284e f272016T;

    /* renamed from: U */
    public View f272017U;

    /* renamed from: V */
    public C77407n f272018V;

    /* renamed from: W */
    public Map<String, String> f272019W;

    /* renamed from: X */
    public int f272020X;

    /* renamed from: Y */
    public C48535o f272021Y;

    /* renamed from: Z */
    public C98522w3.C98523c f272022Z;

    /* renamed from: p0 */
    public String f272023p0 = "";

    /* renamed from: x0 */
    public String f272024x0 = "";

    /* renamed from: y0 */
    public boolean f272025y0 = false;

    public C94167s0(Activity activity) {
        super(activity);
        if (!mo129395J()) {
            C86709a0.m107524d().mo123455a(1913, this);
            this.f272021Y = new C48535o();
            C86709a0.m107524d().mo123460f(this.f272021Y);
        }
    }

    /* renamed from: C */
    public void mo129370C() {
    }

    /* renamed from: E */
    public void mo129372E() {
        Log.m105924i("MicroMsg.TrackMapUI", "onDown");
    }

    /* renamed from: F */
    public void mo129373F() {
    }

    /* renamed from: G */
    public void mo129374G(double d, double d2, int i, double d3) {
    }

    /* renamed from: H */
    public void mo129375H() {
        ArrayList arrayList;
        if (!mo129395J()) {
            C30154d1 d1Var = C30154d1.f81518b;
            d1Var.getClass();
            arrayList = new ArrayList(8);
            arrayList.addAll(d1Var.f81519a);
        } else {
            arrayList = null;
        }
        C77407n nVar = new C77407n((Context) this.f271948d, 1, false);
        this.f272018V = nVar;
        nVar.f225771i = new s0$$k(this, arrayList);
        nVar.f225782p = new s0$$g(this);
        nVar.mo107573q();
    }

    /* renamed from: I */
    public final int mo129394I() {
        int intExtra = mo129361n().getIntExtra("type_tag", 0);
        if (intExtra != 0) {
            return C94166g.m119051a(intExtra);
        }
        int i = this.f271950f;
        if (i == 10) {
            return 4;
        }
        if (i == 12) {
            return 5;
        }
        if (i == 7) {
            return 6;
        }
        if (i == 2) {
            return 7;
        }
        if (i == 11) {
            return 8;
        }
        return i == 13 ? 9 : 0;
    }

    /* renamed from: J */
    public boolean mo129395J() {
        if (((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_show_btn_for_take_car_in_map_and, C104160f.RepairerConfig_Global_ShowTakeCarBtn_Int, 1) == 1 && this.f271951g != null) {
            Activity activity = this.f271948d;
            LocationInfo locationInfo = this.f271951g;
            if (TencentMapPro.isLocal(activity, new LatLng(locationInfo.f271930e, locationInfo.f271931f))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo129355a(KeyEvent keyEvent) {
        C98522w3.C98523c cVar;
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 0 || (cVar = this.f272022Z) == null || !cVar.mo12765b()) {
            return super.mo129355a(keyEvent);
        }
        return true;
    }

    /* renamed from: e */
    public void mo129378e(Bundle bundle) {
        Class cls = C98522w3.class;
        super.mo129378e(bundle);
        this.f272025y0 = mo129361n().getBooleanExtra("key_drawer_expend", false);
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_TENCENT_MAP_COUNT_INT, 0)).intValue();
        this.f272020X = intValue;
        Log.m105925i("MicroMsg.TrackMapUI", "count: %s", Integer.valueOf(intValue));
        this.f271951g.f271938p = mo129361n().getStringExtra("kPoiid");
        HashMap hashMap = new HashMap();
        int I = mo129394I();
        hashMap.put("poiid", this.f271951g.f271938p);
        hashMap.put("poi_biz_source", Integer.valueOf(I));
        String str = this.f271951g.f271938p;
        hashMap.put("is_official_poi", Integer.valueOf((str == null || !str.startsWith("UgcPoiEx_")) ? 1 : 0));
        hashMap.put("qqmap_installed", Integer.valueOf(C101715i.m133626c(this.f271948d, "com.tencent.map") != null ? 1 : 2));
        ((C98522w3) C86312j.m106911c(cls)).mo3992QP(this.f271948d, hashMap);
        if (mo129364q()) {
            m74 m74 = new m74();
            String str2 = this.f271951g.f271938p;
            if (str2 != null && str2.startsWith("nearby")) {
                str2 = str2.replace("nearby", "qqmap");
            }
            m74.f184224i = str2;
            LocationInfo locationInfo = this.f271951g;
            m74.f184222g = locationInfo.f271935j;
            m74.f184223h = locationInfo.f271933h;
            m74.f184219d = (float) locationInfo.f271931f;
            m74.f184220e = (float) locationInfo.f271930e;
            m74.f184235w = mo129361n().getBooleanExtra("KIsFromPoiList", false);
            m74.f184236x = mo129361n().getStringExtra("KPoiCategoryTips");
            m74.f184237y = mo129361n().getStringExtra("kPoiBusinessHour");
            m74.f184238z = mo129361n().getStringExtra("KPoiPhone");
            m74.f184218A = mo129361n().getFloatExtra("KPoiPriceTips", 0.0f);
            boolean booleanExtra = mo129361n().getBooleanExtra("key_drawer_allow_no_poiid", false);
            boolean booleanExtra2 = mo129361n().getBooleanExtra("key_drawer_expend", false);
            View view = this.f272016T.f148877d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initFinderPoiDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initFinderPoiDrawer", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C98522w3 w3Var = (C98522w3) C86312j.m106911c(cls);
            FragmentActivity fragmentActivity = (FragmentActivity) this.f271948d;
            boolean J = mo129395J();
            Serializable serializable = this.f271982E;
            if (serializable == null) {
                serializable = C98522w3.C8810a.FINDER_POI_FROM_TYPE_MAP;
            }
            C98522w3.C98523c YH = w3Var.mo3993YH(fragmentActivity, 16908290, m74, booleanExtra, J, serializable, booleanExtra2, mo129394I());
            this.f272022Z = YH;
            YH.mo12764a(new s0$$b(this));
            this.f272022Z.mo12766c(new s0$$c(this));
            this.f272022Z.mo12768e(new s0$$d(this));
            this.f272022Z.mo12767d(new s0$$e(this));
            this.f272022Z.mo12769f(new s0$$f(this));
            View view3 = this.f272016T.f148877d;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo129366s(MMApplicationContext.getResources().getColor(C0966R.color.ahf));
        this.f271953i.f271973g.setVisibility(8);
        this.f271953i.f271968b.setImageDrawable(C74933u4.m89768e(this.f271948d, C0966R.raw.icons_filled_back2, -1));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f271953i.f271968b.getLayoutParams();
        marginLayoutParams.leftMargin = (int) this.f271948d.getResources().getDimension(C0966R.dimen.f3723cd);
        marginLayoutParams.width = (int) this.f271948d.getResources().getDimension(C0966R.dimen.f3745cw);
        marginLayoutParams.height = (int) this.f271948d.getResources().getDimension(C0966R.dimen.f3745cw);
        this.f271953i.f271968b.setPadding(0, 0, 0, 0);
        this.f271953i.f271968b.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f271953i.f271969c.getLayoutParams();
        marginLayoutParams2.rightMargin = (int) this.f271948d.getResources().getDimension(C0966R.dimen.f3723cd);
        marginLayoutParams2.width = (int) this.f271948d.getResources().getDimension(C0966R.dimen.f3745cw);
        marginLayoutParams2.height = (int) this.f271948d.getResources().getDimension(C0966R.dimen.f3745cw);
        this.f271953i.f271969c.setPadding(0, 0, 0, 0);
        this.f271953i.f271969c.setLayoutParams(marginLayoutParams2);
        this.f271953i.f271969c.setBackground((Drawable) null);
        ((C98522w3) C86312j.m106911c(cls)).mo3990Ai(this.f271953i.f271969c, true, false, "click_menu_in_poi_page", (Map<String, Object>) null);
        int f = C75044y4.m89994f(this.f271948d);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f271953i.f271974h.getLayoutParams();
        marginLayoutParams3.topMargin += f;
        this.f271953i.f271974h.setLayoutParams(marginLayoutParams3);
        View m = mo129360m(C0966R.C0970id.o0w);
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(0);
        View view5 = m;
        C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view5, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (mo129395J()) {
            ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113299AC(C88273g1.LOCATION_TAKECAR);
            ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113581Re("gh_ad64296dc8bd@app", "wx65cc950f42e8fff1", "modules/aggretakecar/pages/tripdetail/tripdetail.html?from=locationnew", 0);
            Log.m105924i("MicroMsg.TrackMapUI", "onCreate: AppBrand preLoad");
        }
        this.f271951g.f271944v = mo129361n().getStringExtra("kBuildingID");
        this.f271951g.f271945w = mo129361n().getStringExtra("kFloorName");
        CustomIndoorPicker customIndoorPicker = (CustomIndoorPicker) mo129360m(C0966R.C0970id.f357821o63);
        TencentMap tencentMap = this.f271961t.getViewManager().getTencentMap();
        if (tencentMap != null) {
            LocationInfo locationInfo2 = this.f271951g;
            tencentMap.setIndoorFloor(locationInfo2.f271944v, locationInfo2.f271945w);
            this.f271961t.enableIndoorLevelPick(false);
            tencentMap.setIndoorEnabled(false);
            if (mo129361n().getIntExtra("map_indoor_support", 0) == 1) {
                tencentMap.setIndoorEnabled(true);
                LocationInfo locationInfo3 = this.f271951g;
                customIndoorPicker.mo175535y1(locationInfo3.f271944v, locationInfo3.f271945w);
                customIndoorPicker.mo175534x1(tencentMap, new s0$$h(this, customIndoorPicker));
            }
        }
    }

    /* renamed from: f */
    public void mo129379f() {
        super.mo129379f();
        C118812s sVar = this.f272012R;
        if (sVar != null) {
            synchronized (C118812s.f355460x) {
                List<ep4> list = sVar.f355462b;
                if (list != null) {
                    ((ArrayList) list).clear();
                }
                sVar.f355472l.clean();
            }
        }
        if (this.f272021Y != null) {
            C86709a0.m107524d().mo123458d(this.f272021Y);
        }
        C86709a0.m107524d().mo123470p(1913, this);
        C86709a0.m107524d().mo123470p(JsApiAddDownloadTaskForNative.CTRL_INDEX, this);
    }

    /* renamed from: h */
    public void mo129381h() {
        super.mo129381h();
        C118812s sVar = this.f272012R;
        if (sVar != null) {
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(sVar.f355482v);
            C77832s.xx0().mo183154d(sVar.f355483w);
        }
    }

    /* renamed from: i */
    public void mo129382i() {
        super.mo129382i();
        C118812s sVar = this.f272012R;
        if (sVar != null) {
            sVar.mo183519b();
        }
        int i = this.f271950f;
        if (i == 2 || i == 12 || i == 13) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            favoriteOperationEvent.f264833d.f264839e = mo129361n().getLongExtra("kFavInfoLocalId", -1);
            favoriteOperationEvent.f264833d.f264835a = 4;
            favoriteOperationEvent.publish();
            if (favoriteOperationEvent.f264834e.f264856b != null) {
                ArrayList<String> arrayList = this.f271958q;
                if (arrayList == null) {
                    this.f271958q = new ArrayList<>();
                } else {
                    arrayList.clear();
                }
                this.f271958q.addAll(favoriteOperationEvent.f264834e.f264856b);
                mo129365r();
            }
        }
    }

    /* renamed from: o */
    public int mo129362o() {
        return C0966R.C0971layout.aye;
    }

    public void onBusinessPermissionDenied(String str) {
    }

    public void onBusinessPermissionGranted(String str) {
        this.f271948d.recreate();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.TrackMapUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s.", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (i != 0 || i2 != 0) {
            return;
        }
        if (1913 == yVar.getType()) {
            C30154d1 d1Var = C30154d1.f81518b;
            ArrayList arrayList = new ArrayList(8);
            arrayList.addAll(((C48535o) yVar).f129808f);
            d1Var.getClass();
            ArrayList arrayList2 = new ArrayList(8);
            arrayList2.addAll(arrayList);
            d1Var.f81519a = arrayList2;
            return;
        }
        yVar.getType();
    }

    /* renamed from: z */
    public void mo129388z() {
        super.mo129388z();
        TextView textView = (TextView) mo129360m(C0966R.C0970id.gub);
        textView.setText(C0966R.string.f360966gb3);
        C85875k4.m106191k0(textView.getPaint());
        View m = mo129360m(C0966R.C0970id.kpc);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(m, aVar.mo10232b(), "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(m, "com/tencent/mm/plugin/location/ui/impl/TrackMapUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ViewStub viewStub = (ViewStub) mo129360m(C0966R.C0970id.g4b);
        viewStub.setOnInflateListener(new s0$$i(this));
        this.f272017U = viewStub.inflate();
        this.f271948d.getWindow().getDecorView().post(new s0$$j(this));
        C118812s sVar = new C118812s(this.f271948d, this.f271953i.f271972f, false);
        this.f272012R = sVar;
        sVar.f355474n = false;
        boolean z = true;
        sVar.f355470j = true;
        TrackPoint trackPoint = sVar.f355464d;
        if (trackPoint != null) {
            trackPoint.setOnAvatarOnClickListener((View.OnClickListener) null);
            sVar.f355464d.setOnLocationOnClickListener((View.OnClickListener) null);
            sVar.f355464d.mo175553a();
        }
        this.f272012R.f355467g = false;
        this.f271948d.getResources();
        this.f271953i.f271968b.setOnClickListener(new C94173t0(this));
        this.f272014S = (LocationCrossHairView) mo129360m(C0966R.C0970id.g44);
        C118812s sVar2 = this.f272012R;
        C94174u0 u0Var = new C94174u0(this);
        C118913e eVar = sVar2.f355472l;
        if (eVar != null) {
            eVar.setMapViewOnTouchListener(u0Var);
        }
        this.f272014S.setOnClickListener(new C115579v0(this));
        String stringExtra = mo129361n().getStringExtra("kPoi_url");
        TextView textView2 = (TextView) mo129360m(C0966R.C0970id.gzm);
        if (Util.isNullOrNil(stringExtra)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setOnClickListener(new C4823w0(this, stringExtra));
        }
        this.f271979B.f301957i.setImageResource(C76695c.m92341b() ? C0966R.C0969drawable.c56 : C0966R.C0969drawable.c55);
        this.f272016T = new C53284e(this.f271953i.f271972f, this.f271948d);
        LocationInfo locationInfo = this.f271951g;
        if (Util.isNullOrNil(locationInfo.f271933h) && Util.isNullOrNil(locationInfo.f271935j)) {
            z = false;
        }
        if (z) {
            String str = this.f271957p;
            if (str != null && !str.equals("")) {
                this.f272016T.f148878e = this.f271957p;
            }
            String str2 = TextUtils.isEmpty(this.f271951g.f271933h) ? "" : this.f271951g.f271933h;
            C53284e eVar2 = this.f272016T;
            StringBuilder sb = new StringBuilder();
            this.f271979B.getClass();
            sb.append("");
            sb.append(str2);
            eVar2.setText(sb.toString());
        }
        C53284e eVar3 = this.f272016T;
        s0$$a s0__a = new s0$$a(this);
        eVar3.f148881h.setOnClickListener(s0__a);
        eVar3.f148881h.setVisibility(0);
        eVar3.f148882i.setVisibility(0);
        eVar3.f148882i.setOnClickListener(s0__a);
        this.f272011Q0 = mo129360m(C0966R.C0970id.c_2);
    }
}
