package com.tencent.p014mm.plugin.nearlife.p084ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelgeo.Addr;
import com.tencent.p014mm.plugin.nearlife.p084ui.C115616c;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fc2.C116858d;
import i21.C60242i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k21.C60960c;
import p702ts.C118505d;
import p702ts.C78083b;
import p702ts.C78085c;
import te3.C64234an2;
import te3.C64885zm2;

/* renamed from: com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI */
public class CheckInLifeUI extends BaseLifeUI {

    /* renamed from: Q0 */
    public boolean f346766Q0 = false;

    /* renamed from: R0 */
    public boolean f346767R0 = true;

    /* renamed from: S0 */
    public View.OnClickListener f346768S0 = new C69936a();

    /* renamed from: T0 */
    public View.OnClickListener f346769T0 = new C69937b();

    /* renamed from: U */
    public C115616c f346770U;

    /* renamed from: U0 */
    public C78083b.C78084a f346771U0 = new C115607c();

    /* renamed from: V */
    public C115616c f346772V;

    /* renamed from: W */
    public ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> f346773W;

    /* renamed from: X */
    public C78083b f346774X = null;

    /* renamed from: Y */
    public String f346775Y = "";

    /* renamed from: Z */
    public String f346776Z = "";

    /* renamed from: p0 */
    public C64885zm2 f346777p0;

    /* renamed from: x0 */
    public String f346778x0;

    /* renamed from: y0 */
    public boolean f346779y0 = false;

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI$a */
    public class C69936a implements View.OnClickListener {
        public C69936a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/CheckInLifeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckInLifeUI.m162531S7(CheckInLifeUI.this, view, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/CheckInLifeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI$b */
    public class C69937b implements View.OnClickListener {
        public C69937b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/nearlife/ui/CheckInLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            CheckInLifeUI.m162531S7(CheckInLifeUI.this, view, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/nearlife/ui/CheckInLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI$c */
    public class C115607c implements C78083b.C78084a {
        public C115607c() {
        }

        public void onLocationAddr(Addr addr) {
            Log.m105925i("MicroMsg.CheckInLifeUI", "get info %s", addr.toString());
            if (Util.isNullOrNil(CheckInLifeUI.this.f346775Y)) {
                CheckInLifeUI checkInLifeUI = CheckInLifeUI.this;
                String str = addr.f343959g;
                checkInLifeUI.f346775Y = str;
                if (!Util.isNullOrNil(str)) {
                    CheckInLifeUI checkInLifeUI2 = CheckInLifeUI.this;
                    if (checkInLifeUI2.f346767R0) {
                        checkInLifeUI2.f346770U.mo175751k(checkInLifeUI2.f346775Y, addr.f343968s);
                    }
                }
            }
        }
    }

    /* renamed from: S7 */
    public static void m162531S7(CheckInLifeUI checkInLifeUI, View view, boolean z) {
        int i;
        checkInLifeUI.getClass();
        Log.m105918d("MicroMsg.CheckInLifeUI", "click tag");
        if (view.getTag() instanceof C115616c.C115617a) {
            C115616c.C115617a aVar = (C115616c.C115617a) view.getTag();
            C116858d dVar = aVar.f346836b;
            Intent intent = new Intent();
            try {
                intent.putExtra("get_poi_item_buf", dVar.f350251i.toByteArray());
                intent.putExtra("location_ctx", dVar.f350248f.f140574f.f257327a);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.CheckInLifeUI", e, "", new Object[0]);
            }
            BackwardSupportUtil.ExifHelper.LatLongData latLongData = null;
            if (z) {
                C115616c cVar = checkInLifeUI.f346772V;
                String str = aVar.f346842h;
                if (((HashMap) cVar.f346821o).containsKey(str)) {
                    latLongData = (BackwardSupportUtil.ExifHelper.LatLongData) ((HashMap) cVar.f346821o).get(str);
                }
                i = checkInLifeUI.f346772V.mo175747h(aVar.f346842h);
                checkInLifeUI.mo175725N7(i, true, aVar.f346842h, checkInLifeUI.f346779y0);
            } else {
                C115616c cVar2 = checkInLifeUI.f346770U;
                String str2 = aVar.f346842h;
                if (((HashMap) cVar2.f346821o).containsKey(str2)) {
                    latLongData = (BackwardSupportUtil.ExifHelper.LatLongData) ((HashMap) cVar2.f346821o).get(str2);
                }
                i = checkInLifeUI.f346770U.mo175747h(aVar.f346842h);
                checkInLifeUI.mo175725N7(i, false, aVar.f346842h, checkInLifeUI.f346779y0);
            }
            intent.putExtra("report_index", i);
            intent.putExtra("first_start_time", checkInLifeUI.f346759z);
            intent.putExtra("lastSuccStamp", checkInLifeUI.f346723B);
            intent.putExtra("firstSuccStamp", checkInLifeUI.f346722A);
            intent.putExtra("reqLoadCnt", checkInLifeUI.f346724C);
            intent.putExtra("entry_time", checkInLifeUI.f346735N);
            intent.putExtra("search_id", dVar.f350243a);
            intent.putExtra("request_id", dVar.f350250h);
            if (latLongData == null) {
                if (checkInLifeUI.f346753t == null) {
                    latLongData = new BackwardSupportUtil.ExifHelper.LatLongData(-85.0f, -1000.0f);
                } else {
                    C64234an2 an22 = checkInLifeUI.f346753t;
                    latLongData = new BackwardSupportUtil.ExifHelper.LatLongData(an22.f182095e, an22.f182094d);
                }
            }
            Log.m105925i("MicroMsg.CheckInLifeUI", "lbs.Type %d", Integer.valueOf(dVar.f350247e));
            int i2 = aVar.f346835a;
            if (i2 == 0) {
                intent.putExtra("get_poi_data_type", 2);
                intent.putExtra("get_lat", latLongData.latitude);
                intent.putExtra("get_lng", latLongData.longtitude);
                if (!Util.isNullOrNil(checkInLifeUI.f346775Y)) {
                    intent.putExtra("get_city", checkInLifeUI.f346775Y);
                }
                intent.putExtra("get_poi_classify_type", dVar.f350247e);
                intent.putExtra("get_poi_address", C115614a.m162538f(dVar.f350246d));
                intent.putExtra("get_poi_classify_id", dVar.f350244b);
                intent.putExtra("get_poi_name", dVar.f350245c);
                intent.putExtra("get_poi_showflag", dVar.f350249g);
            } else if (i2 == 1) {
                intent.putExtra("get_poi_data_type", 1);
                intent.putExtra("get_lat", latLongData.latitude);
                intent.putExtra("get_lng", latLongData.longtitude);
                intent.putExtra("get_city", dVar.f350245c);
            } else if (i2 == 2) {
                intent.putExtra("get_poi_data_type", 0);
            }
            intent.putExtra("get_cur_lat", checkInLifeUI.f346754u);
            intent.putExtra("get_cur_lng", checkInLifeUI.f346755v);
            intent.putExtra("get_accuracy", checkInLifeUI.f346757x);
            intent.putExtra("get_loctype", checkInLifeUI.f346756w);
            intent.putExtra("get_is_mars", checkInLifeUI.f346758y);
            intent.putExtra("get_poi_is_search", z);
            checkInLifeUI.setResult(-1, intent);
            checkInLifeUI.finish();
        }
        checkInLifeUI.hideVKB();
    }

    /* renamed from: J7 */
    public boolean mo175721J7() {
        return getIntent().getBooleanExtra("can_show_create_poi_tips", true);
    }

    /* renamed from: L7 */
    public C115614a mo175723L7() {
        if (this.f346773W == null) {
            this.f346773W = mo175733T7(getIntent().getStringArrayListExtra("lat_long_list"));
        }
        if (getIntent().getStringExtra("select_radio_icon_color") != null) {
            this.f346778x0 = getIntent().getStringExtra("select_radio_icon_color");
        }
        if (getIntent().getStringExtra("select_radio_icon_color") != null && getIntent().getStringExtra("get_poi_from_scene").equals("story")) {
            this.f346779y0 = true;
            this.f346731J = true;
        }
        C115616c cVar = this.f346770U;
        if (cVar != null) {
            return cVar;
        }
        this.f346770U = new C115616c(this, this.f346768S0, "viewlist", this.f346736P, false, this.f346778x0, this.f346766Q0);
        ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> arrayList = this.f346773W;
        if (!(arrayList == null || arrayList.size() == 0)) {
            ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> arrayList2 = new ArrayList<>();
            ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> arrayList3 = this.f346773W;
            arrayList2.add(arrayList3.get(arrayList3.size() - 1));
            C115616c cVar2 = this.f346770U;
            cVar2.f346818i = arrayList2;
            cVar2.f346823q = false;
        }
        return this.f346770U;
    }

    /* renamed from: M7 */
    public C115614a mo175724M7() {
        if (this.f346773W == null) {
            this.f346773W = mo175733T7(getIntent().getStringArrayListExtra("lat_long_list"));
        }
        C115616c cVar = this.f346772V;
        if (cVar != null) {
            return cVar;
        }
        C115616c cVar2 = new C115616c(this, this.f346769T0, "searchlist", this.f346736P, true, this.f346778x0, this.f346766Q0);
        this.f346772V = cVar2;
        ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> arrayList = this.f346773W;
        if (arrayList != null) {
            cVar2.f346818i = arrayList;
        }
        C115616c cVar3 = this.f346772V;
        cVar3.f346823q = true;
        return cVar3;
    }

    /* renamed from: O7 */
    public void mo175726O7(double d, double d2) {
        Log.m105925i("MicroMsg.CheckInLifeUI", "checkinLife got address %f %f", Double.valueOf(d), Double.valueOf(d2));
        if (this.f346774X != null && Util.isNullOrNil(this.f346775Y)) {
            this.f346774X.mo108054a(new C118505d(d, d2), this.f346771U0);
        }
    }

    /* renamed from: P7 */
    public void mo175727P7() {
        super.mo175727P7();
    }

    /* renamed from: T7 */
    public final ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> mo175733T7(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList<BackwardSupportUtil.ExifHelper.LatLongData> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String[] split = it.next().split("\n");
            if (2 == split.length) {
                try {
                    arrayList2.add(new BackwardSupportUtil.ExifHelper.LatLongData(Float.valueOf(split[0]).floatValue(), Float.valueOf(split[1]).floatValue()));
                } catch (NumberFormatException unused) {
                }
            }
        }
        Log.m105924i("MicroMsg.CheckInLifeUI", "parse list end, size: " + arrayList2.size());
        return arrayList2;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bjv;
    }

    public void onCreate(Bundle bundle) {
        this.f346766Q0 = getIntent().getBooleanExtra("is_force_dark_mode", false);
        this.f346767R0 = getIntent().getBooleanExtra("show_city", true);
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.h55);
        this.f346774X = ((C78085c) C86312j.m106911c(C78085c.class)).oe0();
        this.f346777p0 = new C64885zm2();
        this.f346776Z = getIntent().getStringExtra("get_poi_classify_id");
        try {
            C64885zm2 zm22 = (C64885zm2) this.f346777p0.parseFrom(getIntent().getByteArrayExtra("get_poi_item_buf"));
            this.f346777p0 = zm22;
            if (zm22 != null) {
                this.f346776Z = zm22.f186729d;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CheckInLifeUI", e, "", new Object[0]);
            this.f346777p0 = null;
        }
        if (Util.isNullOrNil(this.f346776Z)) {
            this.f346775Y = getIntent().getStringExtra("get_city");
        }
        if (!Util.isNullOrNil(this.f346775Y) && this.f346767R0) {
            this.f346776Z = this.f346770U.mo175751k(this.f346775Y, "").f350244b;
        }
        this.f346770U.f346831w = this.f346776Z;
        C64885zm2 zm23 = this.f346777p0;
        if (zm23 != null && !Util.isNullOrNil(zm23.f186729d)) {
            C115616c cVar = this.f346770U;
            C116858d dVar = new C116858d("", this.f346777p0);
            if (cVar.f346829u == null) {
                cVar.mo175740a(dVar, 1);
            } else {
                cVar.mo175740a(dVar, 2);
            }
        }
        if (this.f346766Q0) {
            setActionbarColor(getContext().getResources().getColor(C0966R.color.f3275lu));
            setBackBtnColorFilter(C0966R.color.f2975b6);
            setMMTitleColor(C0966R.color.f2975b6);
            this.f346740d.setBackgroundColor(getContext().getResources().getColor(C0966R.color.f2947a4));
            setBackGroundColorResource(C0966R.color.f2947a4);
            setIsDarkActionbarBg(true);
            this.f346729H.f319125m = true;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C78083b bVar = this.f346774X;
        if (bVar != null) {
            bVar.mo108055b(this.f346771U0);
        }
        C60960c.f173618a.mo85927k("SnsPublishProcess", "poiPageStaytime_", Long.valueOf(getActivityBrowseTimeMs()), C60242i.APPEND);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
