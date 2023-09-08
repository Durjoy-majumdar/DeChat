package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.widget.pref.FinderLocationPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import os1.C62153d;
import pj3.C47511g;
import te3.C64742ty1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSelectDistrictUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI */
public class FinderSelectDistrictUI extends MMPreference {

    /* renamed from: d */
    public final String f17027d = "Finder.FinderSelectDistrictUI";

    /* renamed from: e */
    public String f17028e = "";

    /* renamed from: f */
    public String f17029f = "";

    /* renamed from: g */
    public String f17030g = "";

    /* renamed from: h */
    public FinderLocationPreference f17031h;

    /* renamed from: i */
    public FinderLocationPreference f17032i;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI$a */
    public static final class C3710a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectDistrictUI f17033d;

        public C3710a(FinderSelectDistrictUI finderSelectDistrictUI) {
            this.f17033d = finderSelectDistrictUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderSelectDistrictUI finderSelectDistrictUI = this.f17033d;
            String str = finderSelectDistrictUI.f17027d;
            Log.m105924i(str, "complete location " + finderSelectDistrictUI.f17028e + ' ' + finderSelectDistrictUI.f17029f + ' ' + finderSelectDistrictUI.f17030g);
            Intent intent = new Intent();
            intent.putExtra("Country", finderSelectDistrictUI.f17028e);
            intent.putExtra("Contact_Province", finderSelectDistrictUI.f17029f);
            intent.putExtra("Contact_City", finderSelectDistrictUI.f17030g);
            finderSelectDistrictUI.setResult(-1, intent);
            finderSelectDistrictUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI$b */
    public static final class C3711b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSelectDistrictUI f17034d;

        public C3711b(FinderSelectDistrictUI finderSelectDistrictUI) {
            this.f17034d = finderSelectDistrictUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f17034d.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8896ar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.enn);
        String stringExtra = getIntent().getStringExtra("SelectedCountryCode");
        C87412m.m108591d(stringExtra);
        this.f17028e = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("SelectedProvinceCode");
        C87412m.m108591d(stringExtra2);
        this.f17029f = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("SelectedCityCode");
        C87412m.m108591d(stringExtra3);
        this.f17030g = stringExtra3;
        Preference a = getPreferenceScreen().mo72519a("select_current_district");
        C87412m.m108592e(a, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference");
        FinderLocationPreference finderLocationPreference = (FinderLocationPreference) a;
        this.f17031h = finderLocationPreference;
        finderLocationPreference.f18832L = false;
        finderLocationPreference.f18831K = true;
        String str = this.f17028e;
        C87412m.m108594g(str, "<set-?>");
        finderLocationPreference.f18833M = str;
        FinderLocationPreference finderLocationPreference2 = this.f17031h;
        if (finderLocationPreference2 != null) {
            String str2 = this.f17029f;
            C87412m.m108594g(str2, "<set-?>");
            finderLocationPreference2.f18834N = str2;
            FinderLocationPreference finderLocationPreference3 = this.f17031h;
            if (finderLocationPreference3 != null) {
                String str3 = this.f17030g;
                C87412m.m108594g(str3, "<set-?>");
                finderLocationPreference3.f18835P = str3;
                FinderLocationPreference finderLocationPreference4 = this.f17031h;
                if (finderLocationPreference4 != null) {
                    finderLocationPreference4.mo5205I();
                    Preference a2 = getPreferenceScreen().mo72519a("select_current_location");
                    C87412m.m108592e(a2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.widget.pref.FinderLocationPreference");
                    this.f17032i = (FinderLocationPreference) a2;
                    C64742ty1 ty12 = ((C62153d) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class)).f176721e;
                    if (ty12 != null) {
                        FinderLocationPreference finderLocationPreference5 = this.f17032i;
                        if (finderLocationPreference5 != null) {
                            finderLocationPreference5.f18832L = true;
                            String str4 = ty12.f185694d;
                            C87412m.m108593f(str4, "it.Country");
                            finderLocationPreference5.f18833M = str4;
                            FinderLocationPreference finderLocationPreference6 = this.f17032i;
                            if (finderLocationPreference6 != null) {
                                String str5 = ty12.f185695e;
                                C87412m.m108593f(str5, "it.Province");
                                finderLocationPreference6.f18834N = str5;
                                FinderLocationPreference finderLocationPreference7 = this.f17032i;
                                if (finderLocationPreference7 != null) {
                                    String str6 = ty12.f185696f;
                                    C87412m.m108593f(str6, "it.City");
                                    finderLocationPreference7.f18835P = str6;
                                    FinderLocationPreference finderLocationPreference8 = this.f17032i;
                                    if (finderLocationPreference8 != null) {
                                        finderLocationPreference8.mo5205I();
                                    } else {
                                        C87412m.m108603p("currentLocationPref");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("currentLocationPref");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("currentLocationPref");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("currentLocationPref");
                            throw null;
                        }
                    } else {
                        getPreferenceScreen().mo72529n("select_current_location_title", true);
                        getPreferenceScreen().mo72529n("select_current_location", true);
                    }
                    getPreferenceScreen().notifyDataSetChanged();
                    addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C3710a(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
                    setBackBtn(new C3711b(this));
                    String str7 = this.f17027d;
                    Log.m105924i(str7, "init location " + this.f17028e + ' ' + this.f17029f + ' ' + this.f17030g);
                    return;
                }
                C87412m.m108603p("currentDistrictPref");
                throw null;
            }
            C87412m.m108603p("currentDistrictPref");
            throw null;
        }
        C87412m.m108603p("currentDistrictPref");
        throw null;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference != null) {
            String str = preference.f121285r;
            if (C87412m.m108589b(str, "select_current_district")) {
                FinderLocationPreference finderLocationPreference = this.f17031h;
                if (finderLocationPreference != null) {
                    finderLocationPreference.f18831K = true;
                    FinderLocationPreference finderLocationPreference2 = this.f17032i;
                    if (finderLocationPreference2 != null) {
                        finderLocationPreference2.f18831K = false;
                        if (finderLocationPreference != null) {
                            this.f17028e = finderLocationPreference.f18833M;
                            if (finderLocationPreference != null) {
                                this.f17029f = finderLocationPreference.f18834N;
                                if (finderLocationPreference != null) {
                                    this.f17030g = finderLocationPreference.f18835P;
                                } else {
                                    C87412m.m108603p("currentDistrictPref");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("currentDistrictPref");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("currentDistrictPref");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("currentLocationPref");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("currentDistrictPref");
                    throw null;
                }
            } else if (C87412m.m108589b(str, "select_current_location")) {
                FinderLocationPreference finderLocationPreference3 = this.f17031h;
                if (finderLocationPreference3 != null) {
                    finderLocationPreference3.f18831K = false;
                    FinderLocationPreference finderLocationPreference4 = this.f17032i;
                    if (finderLocationPreference4 != null) {
                        finderLocationPreference4.f18831K = true;
                        if (finderLocationPreference4 != null) {
                            this.f17028e = finderLocationPreference4.f18833M;
                            if (finderLocationPreference4 != null) {
                                this.f17029f = finderLocationPreference4.f18834N;
                                if (finderLocationPreference4 != null) {
                                    this.f17030g = finderLocationPreference4.f18835P;
                                } else {
                                    C87412m.m108603p("currentLocationPref");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("currentLocationPref");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("currentLocationPref");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("currentLocationPref");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("currentDistrictPref");
                    throw null;
                }
            }
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
        }
        return true;
    }
}
