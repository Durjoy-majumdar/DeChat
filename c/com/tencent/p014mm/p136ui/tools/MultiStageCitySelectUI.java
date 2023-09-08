package com.tencent.p014mm.p136ui.tools;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MenuItem;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceCategory;
import com.tencent.p014mm.p136ui.base.preference.PreferenceTitleCategory;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.ZoneSelectOtherCountryPreference;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.storage.RegionCodeDecoder;
import di3.C86312j;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p447aw.C103918d;
import p702ts.C78085c;
import pj3.C47511g;
import t22.C64201k;

/* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI */
public class MultiStageCitySelectUI extends MMPreference implements C11385n {

    /* renamed from: F */
    public static List<RegionCodeDecoder.Region> f348544F;

    /* renamed from: A */
    public MMHandler f348545A = new MMHandler(Looper.getMainLooper());

    /* renamed from: B */
    public String f348546B;

    /* renamed from: C */
    public ArrayList<String> f348547C;

    /* renamed from: D */
    public C92411b.C92412a f348548D = new C116132a();

    /* renamed from: E */
    public Runnable f348549E = new C116136d();

    /* renamed from: d */
    public C47511g f348550d;

    /* renamed from: e */
    public String f348551e = null;

    /* renamed from: f */
    public String f348552f = null;

    /* renamed from: g */
    public String f348553g = null;

    /* renamed from: h */
    public String f348554h = null;

    /* renamed from: i */
    public String f348555i = null;

    /* renamed from: j */
    public String f348556j = null;

    /* renamed from: n */
    public boolean f348557n = false;

    /* renamed from: o */
    public int f348558o = 0;

    /* renamed from: p */
    public RegionCodeDecoder.Region[] f348559p;

    /* renamed from: q */
    public boolean f348560q = false;

    /* renamed from: r */
    public boolean f348561r = true;

    /* renamed from: s */
    public boolean f348562s = true;

    /* renamed from: t */
    public boolean f348563t = false;

    /* renamed from: u */
    public boolean f348564u = false;

    /* renamed from: v */
    public boolean f348565v;

    /* renamed from: w */
    public boolean f348566w = true;

    /* renamed from: x */
    public ZoneRecommandPreference f348567x;

    /* renamed from: y */
    public C92411b f348568y;

    /* renamed from: z */
    public C106742j1 f348569z = new C106742j1(true, true);

    /* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI$a */
    public class C116132a implements C92411b.C92412a {

        /* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI$a$a */
        public class C116133a implements DialogInterface.OnClickListener {
            public C116133a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                LocationUtil.jumpToOpenGps(MultiStageCitySelectUI.this);
            }
        }

        public C116132a() {
        }

        public boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            MultiStageCitySelectUI multiStageCitySelectUI = MultiStageCitySelectUI.this;
            if (multiStageCitySelectUI.f348568y == null) {
                return false;
            }
            if (z) {
                Log.m105925i("MicroMsg.MultiStageCitySelectUI", "lat:%f lng:%f accuracy:%f", Float.valueOf(f2), Float.valueOf(f), Double.valueOf(d2));
                C97625j3.m125815e().mo123460f(new C64201k((double) f2, (double) f));
            } else {
                ZoneRecommandPreference zoneRecommandPreference = multiStageCitySelectUI.f348567x;
                if (zoneRecommandPreference != null) {
                    zoneRecommandPreference.f348592M = 2;
                    zoneRecommandPreference.mo177483I();
                }
                if (!MultiStageCitySelectUI.this.f348565v && !LocationUtil.isGpsEnable()) {
                    MultiStageCitySelectUI multiStageCitySelectUI2 = MultiStageCitySelectUI.this;
                    multiStageCitySelectUI2.f348565v = true;
                    C76879j.m92709C(multiStageCitySelectUI2, multiStageCitySelectUI2.getString(C0966R.string.fez), MultiStageCitySelectUI.this.getString(C0966R.string.a3h), MultiStageCitySelectUI.this.getString(C0966R.string.fyd), MultiStageCitySelectUI.this.getString(C0966R.string.f7926wf), false, new C116133a(), (DialogInterface.OnClickListener) null);
                }
            }
            MultiStageCitySelectUI multiStageCitySelectUI3 = MultiStageCitySelectUI.this;
            C92411b bVar = multiStageCitySelectUI3.f348568y;
            if (bVar != null) {
                bVar.mo126408b(multiStageCitySelectUI3.f348548D);
                MultiStageCitySelectUI.this.f348568y = null;
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI$b */
    public class C116134b implements ZoneSelectOtherCountryPreference.C116145b {
        public C116134b() {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI$c */
    public class C116135c implements C106742j1.C106756o {
        public C116135c() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            MultiStageCitySelectUI.this.hideVKB();
            MultiStageCitySelectUI multiStageCitySelectUI = MultiStageCitySelectUI.this;
            if (multiStageCitySelectUI.f348557n) {
                multiStageCitySelectUI.f348558o = 3;
            } else if (multiStageCitySelectUI.f348551e == null) {
                multiStageCitySelectUI.f348558o = 0;
            } else if (multiStageCitySelectUI.f348552f == null) {
                multiStageCitySelectUI.f348558o = 1;
            } else {
                multiStageCitySelectUI.f348558o = 2;
            }
            multiStageCitySelectUI.mo177472H7();
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            if (Util.isNullOrNil(str)) {
                return false;
            }
            MultiStageCitySelectUI multiStageCitySelectUI = MultiStageCitySelectUI.this;
            multiStageCitySelectUI.f348546B = str;
            multiStageCitySelectUI.f348550d.removeAll();
            MultiStageCitySelectUI multiStageCitySelectUI2 = MultiStageCitySelectUI.this;
            multiStageCitySelectUI2.f348545A.removeCallbacks(multiStageCitySelectUI2.f348549E);
            MultiStageCitySelectUI multiStageCitySelectUI3 = MultiStageCitySelectUI.this;
            multiStageCitySelectUI3.f348545A.postDelayed(multiStageCitySelectUI3.f348549E, 50);
            return true;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            if (!Util.isNullOrNil(str)) {
                MultiStageCitySelectUI multiStageCitySelectUI = MultiStageCitySelectUI.this;
                multiStageCitySelectUI.f348546B = str;
                multiStageCitySelectUI.f348550d.removeAll();
                MultiStageCitySelectUI multiStageCitySelectUI2 = MultiStageCitySelectUI.this;
                multiStageCitySelectUI2.f348545A.removeCallbacks(multiStageCitySelectUI2.f348549E);
                MultiStageCitySelectUI multiStageCitySelectUI3 = MultiStageCitySelectUI.this;
                multiStageCitySelectUI3.f348545A.postDelayed(multiStageCitySelectUI3.f348549E, 50);
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
            MultiStageCitySelectUI multiStageCitySelectUI = MultiStageCitySelectUI.this;
            if (multiStageCitySelectUI.f348557n) {
                multiStageCitySelectUI.f348558o = 3;
            } else if (multiStageCitySelectUI.f348551e == null) {
                multiStageCitySelectUI.f348558o = 0;
            } else if (multiStageCitySelectUI.f348552f == null) {
                multiStageCitySelectUI.f348558o = 1;
            } else {
                multiStageCitySelectUI.f348558o = 2;
            }
            multiStageCitySelectUI.mo177472H7();
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI$d */
    public class C116136d implements Runnable {
        public C116136d() {
        }

        public void run() {
            MultiStageCitySelectUI multiStageCitySelectUI = MultiStageCitySelectUI.this;
            if (!Util.isNullOrNil(multiStageCitySelectUI.f348546B)) {
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (RegionCodeDecoder.Region next : MultiStageCitySelectUI.f348544F) {
                    if (next.getName() != null && next.getName().contains(multiStageCitySelectUI.f348546B)) {
                        if (("CN".equalsIgnoreCase(next.getCountryCode()) || "HK".equalsIgnoreCase(next.getCountryCode()) || "MO".equalsIgnoreCase(next.getCountryCode()) || "TW".equalsIgnoreCase(next.getCountryCode()) || ((next.getParent() == null || !next.hasChildren()) && (next.getParent() == null || next.hasChildren()))) && !multiStageCitySelectUI.f348547C.contains(next.getCountryCode())) {
                            if (next.getParent() == null || (!"HK".equalsIgnoreCase(next.getParent().getCode()) && !"MO".equalsIgnoreCase(next.getParent().getCode()) && !"TW".equalsIgnoreCase(next.getParent().getCode()))) {
                                if (next.getParent() == null || (!"CN".equalsIgnoreCase(next.getCountryCode()) && !"HK".equalsIgnoreCase(next.getCountryCode()) && !"MO".equalsIgnoreCase(next.getCountryCode()) && !"TW".equalsIgnoreCase(next.getCountryCode()))) {
                                    if (next.getParent() != null || (!"HK".equalsIgnoreCase(next.getCountryCode()) && !"MO".equalsIgnoreCase(next.getCountryCode()) && !"TW".equalsIgnoreCase(next.getCountryCode()))) {
                                        arrayList.add(next);
                                    } else {
                                        arrayList.add(next);
                                    }
                                } else if (next.hasChildren() && next.getParent() != null) {
                                    arrayList2.add(next);
                                } else if (!next.hasChildren() && next.getParent() != null) {
                                    arrayList3.add(next);
                                }
                            }
                        }
                    }
                }
                if (arrayList3.size() > 0) {
                    PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(multiStageCitySelectUI, (AttributeSet) null);
                    preferenceTitleCategory.mo69923G(C0966R.string.ipc);
                    multiStageCitySelectUI.f348550d.mo72527k(preferenceTitleCategory);
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        RegionCodeDecoder.Region region = (RegionCodeDecoder.Region) it.next();
                        ZonePreference zonePreference = new ZonePreference(multiStageCitySelectUI, (AttributeSet) null);
                        region.setHasChildren(false);
                        zonePreference.mo177482J(region);
                        multiStageCitySelectUI.f348550d.mo72525i(zonePreference, false);
                    }
                }
                if (arrayList2.size() > 0) {
                    PreferenceTitleCategory preferenceTitleCategory2 = new PreferenceTitleCategory(multiStageCitySelectUI, (AttributeSet) null);
                    preferenceTitleCategory2.mo69923G(C0966R.string.ipe);
                    multiStageCitySelectUI.f348550d.mo72527k(preferenceTitleCategory2);
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        ZonePreference zonePreference2 = new ZonePreference(multiStageCitySelectUI, (AttributeSet) null);
                        zonePreference2.mo177482J((RegionCodeDecoder.Region) it4.next());
                        multiStageCitySelectUI.f348550d.mo72525i(zonePreference2, false);
                    }
                }
                if (arrayList.size() > 0) {
                    PreferenceTitleCategory preferenceTitleCategory3 = new PreferenceTitleCategory(multiStageCitySelectUI, (AttributeSet) null);
                    preferenceTitleCategory3.mo69923G(C0966R.string.ipd);
                    multiStageCitySelectUI.f348550d.mo72527k(preferenceTitleCategory3);
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        ZonePreference zonePreference3 = new ZonePreference(multiStageCitySelectUI, (AttributeSet) null);
                        zonePreference3.mo177482J((RegionCodeDecoder.Region) it5.next());
                        multiStageCitySelectUI.f348550d.mo72525i(zonePreference3, false);
                    }
                }
                multiStageCitySelectUI.f348550d.notifyDataSetChanged();
                multiStageCitySelectUI.f348558o = 4;
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MultiStageCitySelectUI$e */
    public class C116137e implements MenuItem.OnMenuItemClickListener {
        public C116137e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MultiStageCitySelectUI multiStageCitySelectUI = MultiStageCitySelectUI.this;
            List<RegionCodeDecoder.Region> list = MultiStageCitySelectUI.f348544F;
            int i = multiStageCitySelectUI.f348558o;
            if (i == 0) {
                multiStageCitySelectUI.f348551e = null;
            } else if (i == 1) {
                multiStageCitySelectUI.f348552f = null;
            } else if (i == 2) {
                multiStageCitySelectUI.f348553g = null;
            }
            multiStageCitySelectUI.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public void mo177472H7() {
        RegionCodeDecoder.Region[] regionArr;
        String str;
        String str2;
        String str3;
        if (this.f348558o == 3) {
            ArrayList arrayList = new ArrayList();
            RegionCodeDecoder.Region[] g = RegionCodeDecoder.m124563k().mo135572g();
            if (g != null) {
                for (RegionCodeDecoder.Region region : g) {
                    if ("HK".equalsIgnoreCase(region.getCode()) || "TW".equalsIgnoreCase(region.getCode()) || "MO".equalsIgnoreCase(region.getCode())) {
                        arrayList.add(region);
                    }
                }
            }
            RegionCodeDecoder.Region[] n = RegionCodeDecoder.m124563k().mo135578n("CN");
            int length = n.length;
            regionArr = (RegionCodeDecoder.Region[]) Arrays.copyOf(n, arrayList.size() + length);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                regionArr[length + i] = (RegionCodeDecoder.Region) it.next();
                i++;
            }
        } else if (Util.isNullOrNil(this.f348551e)) {
            RegionCodeDecoder.Region[] g2 = RegionCodeDecoder.m124563k().mo135572g();
            if (this.f348563t) {
                ArrayList arrayList2 = new ArrayList();
                if (g2 != null) {
                    for (RegionCodeDecoder.Region region2 : g2) {
                        if (!this.f348547C.contains(region2.getCode()) && !"CN".equalsIgnoreCase(region2.getCode()) && !"HK".equalsIgnoreCase(region2.getCode()) && !"TW".equalsIgnoreCase(region2.getCode()) && !"MO".equalsIgnoreCase(region2.getCode())) {
                            arrayList2.add(region2);
                        }
                    }
                }
                regionArr = new RegionCodeDecoder.Region[arrayList2.size()];
                arrayList2.toArray(regionArr);
            } else {
                if (g2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (RegionCodeDecoder.Region region3 : g2) {
                        if (!this.f348547C.contains(region3.getCode())) {
                            arrayList3.add(region3);
                        }
                    }
                    g2 = new RegionCodeDecoder.Region[arrayList3.size()];
                    arrayList3.toArray(g2);
                }
                regionArr = g2;
            }
        } else {
            regionArr = Util.isNullOrNil(this.f348552f) ? RegionCodeDecoder.m124563k().mo135578n(this.f348551e) : RegionCodeDecoder.m124563k().mo135570e(this.f348551e, this.f348552f);
        }
        this.f348559p = regionArr;
        if (regionArr == null || regionArr.length <= 0) {
            Log.m105920e("MicroMsg.MultiStageCitySelectUI", "initZoneItems error ,check zone lists!");
            return;
        }
        this.f348550d.removeAll();
        if (getIntent().getBooleanExtra("SetSelectLocation", false)) {
            str3 = getIntent().getStringExtra("SelectedCountryCode");
            str2 = getIntent().getStringExtra("SelectedProvinceCode");
            str = getIntent().getStringExtra("SelectedCityCode");
        } else {
            str3 = (String) C97625j3.m125812b().mo105906u().mo119684e(12324, (Object) null);
            str2 = (String) C97625j3.m125812b().mo105906u().mo119684e(12325, (Object) null);
            str = (String) C97625j3.m125812b().mo105906u().mo119684e(12326, (Object) null);
        }
        this.f348562s = getIntent().getBooleanExtra("ShowSelectedLocation", true);
        if (getIntent().getBooleanExtra("NeedUnshowItem", false)) {
            ZonePreference zonePreference = new ZonePreference(this, (AttributeSet) null);
            RegionCodeDecoder.Region region4 = new RegionCodeDecoder.Region();
            region4.setName(getString(C0966R.string.eov));
            region4.setHasChildren(false);
            region4.setCountry(false);
            region4.setCode("unshow");
            zonePreference.mo177482J(region4);
            this.f348550d.mo72527k(zonePreference);
            if ("unshow".equals(str3)) {
                zonePreference.mo7740D(C0966R.string.ipf);
            }
        }
        int i2 = 0;
        while (true) {
            RegionCodeDecoder.Region[] regionArr2 = this.f348559p;
            if (i2 >= regionArr2.length) {
                break;
            }
            RegionCodeDecoder.Region region5 = regionArr2[i2];
            if (region5 != null && !Util.isNullOrNil(region5.getCode()) && !Util.isNullOrNil(this.f348559p[i2].getName())) {
                ZonePreference zonePreference2 = new ZonePreference(this, (AttributeSet) null);
                zonePreference2.mo177482J(this.f348559p[i2]);
                if (!this.f348562s) {
                    this.f348550d.mo72527k(zonePreference2);
                } else if (this.f348558o == 0 && this.f348559p[i2].getCode().equalsIgnoreCase(str3)) {
                    this.f348550d.mo72524h(zonePreference2, 0);
                    zonePreference2.mo7740D(C0966R.string.ipg);
                } else if (this.f348558o == 1 && this.f348559p[i2].getCode().equalsIgnoreCase(str2)) {
                    this.f348550d.mo72524h(zonePreference2, 0);
                    zonePreference2.mo7740D(C0966R.string.ipg);
                } else if (this.f348558o != 2 || !this.f348559p[i2].getCode().equalsIgnoreCase(str)) {
                    this.f348550d.mo72527k(zonePreference2);
                } else {
                    this.f348550d.mo72524h(zonePreference2, 0);
                    zonePreference2.mo7740D(C0966R.string.ipg);
                }
            }
            i2++;
        }
        if (this.f348558o == 3) {
            ZoneSelectOtherCountryPreference zoneSelectOtherCountryPreference = new ZoneSelectOtherCountryPreference(this, (AttributeSet) null);
            zoneSelectOtherCountryPreference.f348596J = getString(C0966R.string.ipb);
            zoneSelectOtherCountryPreference.f348597K = new C116134b();
            this.f348550d.mo72527k(zoneSelectOtherCountryPreference);
        }
        this.f348550d.mo72527k(new PreferenceCategory(getContext(), (AttributeSet) null));
        int i3 = this.f348558o;
        if (i3 == 0 || i3 == 3) {
            if (this.f348561r) {
                PreferenceTitleCategory preferenceTitleCategory = new PreferenceTitleCategory(this, (AttributeSet) null);
                preferenceTitleCategory.mo69923G(C0966R.string.ip_);
                this.f348550d.mo72524h(preferenceTitleCategory, 0);
                ZoneRecommandPreference zoneRecommandPreference = new ZoneRecommandPreference(this, (AttributeSet) null);
                this.f348567x = zoneRecommandPreference;
                zoneRecommandPreference.mo26273A("current_location");
                this.f348550d.mo72524h(this.f348567x, 1);
            }
            PreferenceTitleCategory preferenceTitleCategory2 = new PreferenceTitleCategory(this, (AttributeSet) null);
            preferenceTitleCategory2.mo69923G(C0966R.string.ip9);
            if (this.f348561r) {
                this.f348550d.mo72524h(preferenceTitleCategory2, 2);
            } else {
                this.f348550d.mo72524h(preferenceTitleCategory2, 0);
            }
        }
    }

    public int getResourceId() {
        return C0966R.C0971layout.cjn;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.h5c);
        setBackBtn(new C116137e());
        this.f348560q = getIntent().getBooleanExtra("GetAddress", false);
        this.f348551e = getIntent().getStringExtra("Country");
        this.f348552f = getIntent().getStringExtra("Provice");
        this.f348554h = getIntent().getStringExtra("CountryName");
        this.f348555i = getIntent().getStringExtra("ProviceName");
        this.f348561r = getIntent().getBooleanExtra("IsAutoPosition", !Util.isOverseasUser(this));
        this.f348557n = getIntent().getBooleanExtra("IsRealNameVerifyScene", false);
        this.f348563t = getIntent().getBooleanExtra("IsSelectNonChinaCountry", false);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("BlockedCountries");
        this.f348547C = stringArrayListExtra;
        if (stringArrayListExtra == null) {
            this.f348547C = new ArrayList<>();
        }
        this.f348564u = getIntent().getBooleanExtra("IsNeedShowSearchBar", false);
        Log.m105924i("MicroMsg.MultiStageCitySelectUI", " country = " + this.f348551e + " province =" + this.f348552f + " city = " + this.f348553g + " " + this.f348554h + " " + this.f348555i + " " + this.f348557n + " " + this.f348563t);
        if (this.f348557n) {
            this.f348558o = 3;
        } else if (this.f348551e == null) {
            this.f348558o = 0;
            this.f348552f = null;
            this.f348553g = null;
        } else if (this.f348552f == null) {
            this.f348558o = 1;
            this.f348553g = null;
        } else {
            this.f348558o = 2;
        }
        mo177472H7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onBackPressed() {
        int i = this.f348558o;
        if (i == 0) {
            this.f348551e = null;
        } else if (i == 1) {
            this.f348552f = null;
        } else if (i == 2) {
            this.f348553g = null;
        }
        super.onBackPressed();
    }

    public void onBusinessPermissionDenied(String str) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.tencent.mm.storage.RegionCodeDecoder$Region} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.util.List<com.tencent.mm.storage.RegionCodeDecoder$Region>] */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:25|26|27|(3:28|29|(3:31|(2:33|(2:35|118)(4:36|(1:38)(2:39|(3:41|(1:45)|46)(2:47|(2:49|(2:51|(1:53)))))|54|116))(1:117)|55)(1:115))|(2:57|58)|59|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:20|21|22|23|24|(7:25|26|27|(3:28|29|(3:31|(2:33|(2:35|118)(4:36|(1:38)(2:39|(3:41|(1:45)|46)(2:47|(2:49|(2:51|(1:53)))))|54|116))(1:117)|55)(1:115))|(2:57|58)|59|60)|91|92|94) */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0181, code lost:
        if (r12 != null) goto L_0x0183;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0143 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x0183 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b3 A[SYNTHETIC, Splitter:B:102:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ba A[SYNTHETIC, Splitter:B:106:0x01ba] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c1 A[SYNTHETIC, Splitter:B:110:0x01c1] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0175 A[SYNTHETIC, Splitter:B:83:0x0175] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017c A[SYNTHETIC, Splitter:B:87:0x017c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r1 = r17
            super.onCreate(r18)
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            r2 = 665(0x299, float:9.32E-43)
            r0.mo123455a(r2, r1)
            pj3.g r0 = r17.getPreferenceScreen()
            r1.f348550d = r0
            r17.initView()
            boolean r0 = r1.f348564u
            if (r0 == 0) goto L_0x01d3
            java.util.List<com.tencent.mm.storage.RegionCodeDecoder$Region> r0 = f348544F
            r2 = 1
            if (r0 == 0) goto L_0x0026
            int r0 = r0.size()
            if (r0 > 0) goto L_0x01c5
        L_0x0026:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.mm.storage.RegionCodeDecoder r0 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            com.tencent.mm.storage.RegionCodeDecoder$Region[] r0 = r0.mo135572g()
            if (r0 == 0) goto L_0x01c5
            int r0 = r0.length
            if (r0 > 0) goto L_0x0039
            goto L_0x01c5
        L_0x0039:
            java.util.List<com.tencent.mm.storage.RegionCodeDecoder$Region> r0 = f348544F
            if (r0 == 0) goto L_0x0043
            int r0 = r0.size()
            if (r0 > 0) goto L_0x01c5
        L_0x0043:
            com.tencent.mm.storage.RegionCodeDecoder r0 = com.tencent.p014mm.storage.RegionCodeDecoder.m124563k()
            r0.getClass()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r0.f284118a = r5
            java.lang.String r5 = r0.mo135580p()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r7 = 0
            if (r6 == 0) goto L_0x0075
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "buildMap error, no codeFile found, curLang: "
            r5.append(r6)
            java.lang.String r0 = r0.f284118a
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "MicroMsg.RegionCodeDecoder"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r0 = r7
            goto L_0x0086
        L_0x0075:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = com.tencent.p014mm.storage.RegionCodeDecoder.f284117d
            r0.append(r6)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x0086:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r6 = 2
            java.lang.String r8 = "MicroMsg.MultiStageCitySelectUI"
            r9 = 0
            if (r5 == 0) goto L_0x0092
            goto L_0x0189
        L_0x0092:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x0163, all -> 0x015f }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x015a, all -> 0x0154 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x015a, all -> 0x0154 }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0150, all -> 0x014d }
            r12.<init>(r11)     // Catch:{ Exception -> 0x0150, all -> 0x014d }
            r0 = r7
        L_0x00a6:
            java.lang.String r13 = r12.readLine()     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r13 == 0) goto L_0x013e
            java.lang.String r14 = "\\|"
            java.lang.String[] r13 = r13.split(r14)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            com.tencent.mm.storage.RegionCodeDecoder$Region r14 = new com.tencent.mm.storage.RegionCodeDecoder$Region     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.<init>()     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            int r15 = r13.length     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r15 != r6) goto L_0x013b
            r15 = r13[r2]     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setName(r15)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r13 = r13[r9]     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            java.lang.String r15 = "_"
            java.lang.String[] r13 = r13.split(r15)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r15 = r13[r9]     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCountryCode(r15)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r16 == 0) goto L_0x00d3
            goto L_0x013b
        L_0x00d3:
            int r6 = r13.length     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r6 != r2) goto L_0x00e4
            r14.setCode(r15)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setProvince(r9)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCity(r9)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCountry(r2)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r7 = r14
            goto L_0x0138
        L_0x00e4:
            int r6 = r13.length     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r15 = 2
            if (r6 != r15) goto L_0x010e
            r0 = r13[r2]     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCode(r0)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setProvince(r2)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCountry(r9)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCity(r9)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r7 == 0) goto L_0x010c
            java.lang.String r0 = r7.getCountryCode()     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            java.lang.String r6 = r14.getCountryCode()     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r0 == 0) goto L_0x010c
            r7.setHasChildren(r2)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setParent(r7)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
        L_0x010c:
            r0 = r14
            goto L_0x0138
        L_0x010e:
            int r6 = r13.length     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r15 = 3
            if (r6 != r15) goto L_0x0138
            r6 = 2
            r15 = r13[r6]     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCode(r15)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCity(r2)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setCountry(r9)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setProvince(r9)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r14.setHasChildren(r9)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r0 == 0) goto L_0x0138
            java.lang.String r6 = r0.getCode()     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r13 = r13[r2]     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            boolean r6 = r6.equals(r13)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            if (r6 == 0) goto L_0x0138
            r14.setParent(r0)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
            r0.setHasChildren(r2)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
        L_0x0138:
            r5.add(r14)     // Catch:{ Exception -> 0x014b, all -> 0x0147 }
        L_0x013b:
            r6 = 2
            goto L_0x00a6
        L_0x013e:
            if (r10 == 0) goto L_0x0143
            r10.close()     // Catch:{ IOException -> 0x0143 }
        L_0x0143:
            r11.close()     // Catch:{ IOException -> 0x0183 }
            goto L_0x0183
        L_0x0147:
            r0 = move-exception
            r7 = r11
            goto L_0x01af
        L_0x014b:
            r0 = move-exception
            goto L_0x0152
        L_0x014d:
            r0 = move-exception
            r12 = r7
            goto L_0x0157
        L_0x0150:
            r0 = move-exception
            r12 = r7
        L_0x0152:
            r7 = r11
            goto L_0x015c
        L_0x0154:
            r0 = move-exception
            r11 = r7
            r12 = r11
        L_0x0157:
            r7 = r10
            goto L_0x01b1
        L_0x015a:
            r0 = move-exception
            r12 = r7
        L_0x015c:
            r6 = r7
            r7 = r10
            goto L_0x0166
        L_0x015f:
            r0 = move-exception
            r11 = r7
            r12 = r11
            goto L_0x01b1
        L_0x0163:
            r0 = move-exception
            r6 = r7
            r12 = r6
        L_0x0166:
            java.lang.String r10 = "buildSearchRegionMap error: %s"
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x01ac }
            java.lang.String r13 = r0.getMessage()     // Catch:{ all -> 0x01ac }
            r11[r9] = r13     // Catch:{ all -> 0x01ac }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r10, r11)     // Catch:{ all -> 0x01ac }
            if (r7 == 0) goto L_0x017a
            r7.close()     // Catch:{ IOException -> 0x0179 }
            goto L_0x017a
        L_0x0179:
        L_0x017a:
            if (r6 == 0) goto L_0x0181
            r6.close()     // Catch:{ IOException -> 0x0180 }
            goto L_0x0181
        L_0x0180:
        L_0x0181:
            if (r12 == 0) goto L_0x0188
        L_0x0183:
            r12.close()     // Catch:{ IOException -> 0x0187 }
            goto L_0x0188
        L_0x0187:
        L_0x0188:
            r7 = r5
        L_0x0189:
            f348544F = r7
            if (r7 == 0) goto L_0x01c5
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r9] = r3
            java.util.List<com.tencent.mm.storage.RegionCodeDecoder$Region> r3 = f348544F
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            java.lang.String r3 = "buildAllSearchRegion used %sms, size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r0)
            goto L_0x01c5
        L_0x01ac:
            r0 = move-exception
            r10 = r7
            r7 = r6
        L_0x01af:
            r11 = r7
            goto L_0x0157
        L_0x01b1:
            if (r7 == 0) goto L_0x01b8
            r7.close()     // Catch:{ IOException -> 0x01b7 }
            goto L_0x01b8
        L_0x01b7:
        L_0x01b8:
            if (r11 == 0) goto L_0x01bf
            r11.close()     // Catch:{ IOException -> 0x01be }
            goto L_0x01bf
        L_0x01be:
        L_0x01bf:
            if (r12 == 0) goto L_0x01c4
            r12.close()     // Catch:{ IOException -> 0x01c4 }
        L_0x01c4:
            throw r0
        L_0x01c5:
            com.tencent.mm.ui.tools.j1 r0 = r1.f348569z
            r1.addSearchMenu(r2, r0)
            com.tencent.mm.ui.tools.j1 r0 = r1.f348569z
            com.tencent.mm.ui.tools.MultiStageCitySelectUI$c r2 = new com.tencent.mm.ui.tools.MultiStageCitySelectUI$c
            r2.<init>()
            r0.f319122j = r2
        L_0x01d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.MultiStageCitySelectUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C97625j3.m125815e().mo123470p(665, this);
        C92411b bVar = this.f348568y;
        if (bVar != null) {
            bVar.mo126408b(this.f348548D);
        }
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Preference preference2 = preference;
        if (preference2 instanceof ZonePreference) {
            RegionCodeDecoder.Region region = ((ZonePreference) preference2).f348586J;
            if (region == null || Util.isNullOrNil(region.getCode())) {
                StringBuilder sb = new StringBuilder();
                sb.append("onPreferenceTreeClick error item, code:");
                sb.append(region == null ? -1 : region.getCode());
                sb.append(" ,name:");
                sb.append(region == null ? "null" : region.getName());
                Log.m105920e("MicroMsg.MultiStageCitySelectUI", sb.toString());
                return false;
            }
            if (this.f348558o == 3) {
                this.f348551e = "CN";
                this.f348552f = region.getCode();
                this.f348555i = region.getName();
            }
            int i = this.f348558o;
            if (i == 0) {
                this.f348551e = region.getCode();
                this.f348554h = region.getName();
            } else if (i == 1) {
                this.f348552f = region.getCode();
                this.f348555i = region.getName();
            } else if (i == 2) {
                this.f348553g = region.getCode();
                this.f348556j = region.getName();
                if ("CN".equalsIgnoreCase(this.f348551e) || "HK".equalsIgnoreCase(this.f348551e) || "MO".equalsIgnoreCase(this.f348551e) || "TW".equalsIgnoreCase(this.f348551e)) {
                    this.f348554h = null;
                } else {
                    this.f348555i = null;
                }
            } else if (i == 4) {
                if (region.getParent() != null && !region.hasChildren()) {
                    this.f348553g = region.getCode();
                    this.f348556j = region.getName();
                    this.f348552f = region.getParent().getCode();
                    this.f348555i = region.getParent().getName();
                    this.f348551e = region.getCountryCode();
                    this.f348554h = null;
                } else if (!region.hasChildren() || region.getParent() == null) {
                    this.f348551e = region.getCode();
                    this.f348554h = region.getName();
                    this.f348552f = null;
                    this.f348555i = null;
                    this.f348553g = null;
                    this.f348556j = null;
                } else {
                    this.f348552f = region.getCode();
                    this.f348555i = region.getName();
                    this.f348551e = region.getCountryCode();
                    this.f348554h = null;
                }
            }
            if (!region.hasChildren()) {
                if (!this.f348560q) {
                    C97625j3.m125812b().mo105906u().mo119676J(12324, this.f348551e);
                    C97625j3.m125812b().mo105906u().mo119676J(12325, this.f348552f);
                    C97625j3.m125812b().mo105906u().mo119676J(12326, this.f348553g);
                    C5139t.m5183e(4, 5);
                }
                Intent intent = new Intent();
                intent.putExtra("CountryName", this.f348554h);
                intent.putExtra("ProviceName", this.f348555i);
                intent.putExtra("CityName", this.f348556j);
                intent.putExtra("Country", this.f348551e);
                intent.putExtra("Contact_Province", this.f348552f);
                intent.putExtra("Contact_City", this.f348553g);
                hideVKB();
                setResult(-1, intent);
                finish();
            } else {
                Intent intent2 = new Intent(this, MultiStageCitySelectUI.class);
                Bundle bundle = new Bundle();
                bundle.putString("Country", this.f348551e);
                bundle.putString("Provice", this.f348552f);
                bundle.putString("CountryName", this.f348554h);
                bundle.putString("ProviceName", this.f348555i);
                bundle.putBoolean("GetAddress", this.f348560q);
                bundle.putBoolean("ShowSelectedLocation", this.f348562s);
                bundle.putString("SelectedCountryCode", getIntent().getStringExtra("SelectedCountryCode"));
                bundle.putString("SelectedProvinceCode", getIntent().getStringExtra("SelectedProvinceCode"));
                bundle.putString("SelectedCityCode", getIntent().getStringExtra("SelectedCityCode"));
                bundle.putBoolean("IsAutoPosition", false);
                if (this.f348557n) {
                    String countryCode = region.getCountryCode();
                    if (Util.isNullOrNil(countryCode)) {
                        countryCode = this.f348551e;
                    }
                    if ("CN".equalsIgnoreCase(countryCode) || "HK".equalsIgnoreCase(countryCode) || "MO".equalsIgnoreCase(countryCode) || "TW".equalsIgnoreCase(countryCode)) {
                        bundle.putBoolean("IsNeedShowSearchBar", true);
                    }
                    String code = region.getCode();
                    if ("HK".equalsIgnoreCase(code) || "MO".equalsIgnoreCase(code) || "TW".equalsIgnoreCase(code)) {
                        bundle.putString("Country", code);
                        bundle.putString("CountryName", region.getName());
                        bundle.remove("Provice");
                    }
                }
                intent2.putExtras(bundle);
                hideVKB();
                startActivityForResult(intent2, 1);
            }
            return true;
        } else if (!preference2.f121285r.equals("current_location")) {
            return false;
        } else {
            ZoneRecommandPreference zoneRecommandPreference = this.f348567x;
            if (!(zoneRecommandPreference.f348592M == 1)) {
                return false;
            }
            RegionCodeDecoder.Region[] regionArr = {zoneRecommandPreference.f348589J, zoneRecommandPreference.f348590K, zoneRecommandPreference.f348591L};
            if (!this.f348560q) {
                C85801v1 u = C97625j3.m125812b().mo105906u();
                RegionCodeDecoder.Region region2 = regionArr[0];
                u.mo119676J(12324, region2 == null ? null : region2.getCode());
                C85801v1 u2 = C97625j3.m125812b().mo105906u();
                RegionCodeDecoder.Region region3 = regionArr[1];
                u2.mo119676J(12325, region3 == null ? null : region3.getCode());
                C85801v1 u3 = C97625j3.m125812b().mo105906u();
                RegionCodeDecoder.Region region4 = regionArr[2];
                u3.mo119676J(12326, region4 == null ? null : region4.getCode());
                C5139t.m5183e(4, 5);
            }
            RegionCodeDecoder.Region region5 = regionArr[0];
            String code2 = region5 == null ? null : region5.getCode();
            RegionCodeDecoder.Region region6 = regionArr[0];
            String name = region6 == null ? null : region6.getName();
            RegionCodeDecoder.Region region7 = regionArr[1];
            String code3 = region7 == null ? null : region7.getCode();
            RegionCodeDecoder.Region region8 = regionArr[1];
            String name2 = region8 == null ? null : region8.getName();
            if ("CN".equalsIgnoreCase(code2) || "HK".equalsIgnoreCase(code2) || "MO".equalsIgnoreCase(code2) || "TW".equalsIgnoreCase(code2)) {
                name = null;
            } else {
                name2 = null;
            }
            Intent intent3 = new Intent();
            intent3.putExtra("CountryName", name);
            intent3.putExtra("ProviceName", name2);
            RegionCodeDecoder.Region region9 = regionArr[2];
            intent3.putExtra("CityName", region9 == null ? null : region9.getName());
            intent3.putExtra("Country", code2);
            intent3.putExtra("Contact_Province", code3);
            RegionCodeDecoder.Region region10 = regionArr[2];
            intent3.putExtra("Contact_City", region10 == null ? null : region10.getCode());
            hideVKB();
            setResult(-1, intent3);
            finish();
            return false;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.MultiStageCitySelectUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (iArr.length != 0 && i == 64 && iArr[0] != 0) {
            ZoneRecommandPreference zoneRecommandPreference = this.f348567x;
            if (zoneRecommandPreference != null) {
                zoneRecommandPreference.f348592M = 2;
                zoneRecommandPreference.mo177483I();
            }
            this.f348566w = false;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f348566w && this.f348561r) {
            boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 64, (String) null, (String) null);
            Log.m105925i("MicroMsg.MultiStageCitySelectUI", "settings district,checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
            if (Uu0) {
                if (this.f348568y == null) {
                    this.f348568y = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
                }
                if (this.f348561r && !((C113177k) C86312j.m106911c(C113177k.class)).mo165704UG(C113177k.C113179b.LOCAION, new C116148a1(this))) {
                    this.f348568y.mo126409c(this.f348548D, true, false);
                }
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        RegionCodeDecoder.Region region;
        RegionCodeDecoder.Region region2;
        if (i != 0 || i2 != 0) {
            ZoneRecommandPreference zoneRecommandPreference = this.f348567x;
            if (zoneRecommandPreference != null) {
                zoneRecommandPreference.f348592M = 2;
                zoneRecommandPreference.mo177483I();
            }
        } else if (yVar.getType() == 665) {
            C64201k kVar = (C64201k) yVar;
            String str2 = kVar.f181924f;
            String str3 = kVar.f181925g;
            String str4 = kVar.f181926h;
            int i3 = 0;
            Log.m105925i("MicroMsg.MultiStageCitySelectUI", "current location country %s, province %s, city %s", str2, str3, str4);
            RegionCodeDecoder.Region[] g = RegionCodeDecoder.m124563k().mo135572g();
            RegionCodeDecoder.Region region3 = null;
            if (g != null) {
                int length = g.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    RegionCodeDecoder.Region region4 = g[i4];
                    if (region4.getCode().equalsIgnoreCase(str2)) {
                        RegionCodeDecoder.Region[] n = RegionCodeDecoder.m124563k().mo135578n(region4.getCode());
                        int length2 = n.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length2) {
                                region2 = null;
                                break;
                            }
                            region2 = n[i5];
                            if (region2.getCode().equalsIgnoreCase(str3)) {
                                RegionCodeDecoder.Region[] e = RegionCodeDecoder.m124563k().mo135570e(region4.getCode(), region2.getCode());
                                int length3 = e.length;
                                while (true) {
                                    if (i3 >= length3) {
                                        break;
                                    }
                                    RegionCodeDecoder.Region region5 = e[i3];
                                    if (region5.getCode().equalsIgnoreCase(str4)) {
                                        region3 = region5;
                                        break;
                                    }
                                    i3++;
                                }
                            } else {
                                i5++;
                            }
                        }
                        region = region3;
                        region3 = region4;
                    } else {
                        i4++;
                    }
                }
            }
            region = null;
            region2 = null;
            if (region3 == null && region2 == null && region == null) {
                ZoneRecommandPreference zoneRecommandPreference2 = this.f348567x;
                if (zoneRecommandPreference2 != null) {
                    zoneRecommandPreference2.f348592M = 2;
                    zoneRecommandPreference2.mo177483I();
                    return;
                }
                return;
            }
            ZoneRecommandPreference zoneRecommandPreference3 = this.f348567x;
            if (zoneRecommandPreference3 != null) {
                zoneRecommandPreference3.f348592M = 1;
                zoneRecommandPreference3.f348589J = region3;
                zoneRecommandPreference3.f348590K = region2;
                zoneRecommandPreference3.f348591L = region;
                zoneRecommandPreference3.mo177483I();
            }
        }
    }
}
