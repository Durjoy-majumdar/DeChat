package com.tencent.p014mm.plugin.finder.feed.p052ui;

import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import fe1.C58961d;
import fr1.C8184a;
import fr1.C8185b;
import fr1.C8187c;
import fr1.C8188d;
import fr1.C8190e;
import fr1.C8191f;
import fr1.C8193g;
import fr1.C8194h;
import fr1.C8195i;
import gy3.C87412m;
import java.util.Iterator;
import java.util.Vector;
import kotlin.Metadata;
import pj3.C47511g;
import vf1.C14795m4;
import wx3.C15601d;
import wx3.C66212f;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderPosterCenterUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPosterCenterUI */
public final class FinderPosterCenterUI extends MMPreference {

    /* renamed from: g */
    public static final /* synthetic */ int f14720g = 0;

    /* renamed from: d */
    public final String f14721d = "Finder.FinderPosterCenterUI";

    /* renamed from: e */
    public String f14722e;

    /* renamed from: f */
    public final Vector<C8195i> f14723f = new Vector<>();

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPosterCenterUI$a */
    public static final class C3028a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderPosterCenterUI f14724d;

        public C3028a(FinderPosterCenterUI finderPosterCenterUI) {
            this.f14724d = finderPosterCenterUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14724d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderPosterCenterUI$b */
    public static final class C3029b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderPosterCenterUI f14725d;

        public C3029b(FinderPosterCenterUI finderPosterCenterUI) {
            this.f14725d = finderPosterCenterUI;
        }

        public final void run() {
            FinderPosterCenterUI finderPosterCenterUI = this.f14725d;
            int i = FinderPosterCenterUI.f14720g;
            finderPosterCenterUI.mo3088H7(false);
        }
    }

    /* renamed from: H7 */
    public final void mo3088H7(boolean z) {
        if (C58961d.f168673a.mo84155b(Util.nullAsNil(this.f14722e)) == null) {
            finish();
            return;
        }
        Iterator<C8195i> it = this.f14723f.iterator();
        while (it.hasNext()) {
            it.next().mo9234b(z);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8897as;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14722e = C66785b.f191882e.mo90662O5();
        String str = this.f14721d;
        Log.m105924i(str, "myFinderUser " + this.f14722e);
        setMMTitle((int) C0966R.string.eix);
        setBackBtn(new C3028a(this));
        Vector<C8195i> vector = this.f14723f;
        C47511g preferenceScreen = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen, "preferenceScreen");
        vector.add(new C8184a("settings_auth", preferenceScreen, this));
        Vector<C8195i> vector2 = this.f14723f;
        C47511g preferenceScreen2 = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen2, "preferenceScreen");
        vector2.add(new C8191f("setting_original", preferenceScreen2, this));
        Vector<C8195i> vector3 = this.f14723f;
        C47511g preferenceScreen3 = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen3, "preferenceScreen");
        vector3.add(new C8185b("setting_live_income", preferenceScreen3, this));
        Vector<C8195i> vector4 = this.f14723f;
        C47511g preferenceScreen4 = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen4, "preferenceScreen");
        vector4.add(new C8188d("setting_live_task", preferenceScreen4, this));
        Vector<C8195i> vector5 = this.f14723f;
        C47511g preferenceScreen5 = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen5, "preferenceScreen");
        vector5.add(new C8190e("setting_live_lottery_history", preferenceScreen5, this));
        Vector<C8195i> vector6 = this.f14723f;
        C47511g preferenceScreen6 = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen6, "preferenceScreen");
        vector6.add(new C8194h("setting_live_settle_to_agency", preferenceScreen6, this));
        Vector<C8195i> vector7 = this.f14723f;
        C47511g preferenceScreen7 = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen7, "preferenceScreen");
        vector7.add(new C8187c("settings_shop", preferenceScreen7, this));
        Vector<C8195i> vector8 = this.f14723f;
        C47511g preferenceScreen8 = getPreferenceScreen();
        C87412m.m108593f(preferenceScreen8, "preferenceScreen");
        vector8.add(new C8193g("settings_creater_guide", preferenceScreen8, this));
        Iterator<C8195i> it = this.f14723f.iterator();
        while (it.hasNext()) {
            it.next().onCreate();
        }
        getPreferenceScreen().notifyDataSetChanged();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        T t;
        C87412m.m108591d(preference);
        String str = preference.f121285r;
        String str2 = this.f14721d;
        Log.m105924i(str2, "click " + str);
        Iterator<T> it = this.f14723f.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C8195i) t).mo9235c(), str)) {
                break;
            }
        }
        C8195i iVar = (C8195i) t;
        if (iVar == null) {
            return true;
        }
        iVar.mo9233a();
        return true;
    }

    public void onResume() {
        super.onResume();
        for (C8195i onResume : this.f14723f) {
            onResume.onResume();
        }
        getContentView().post(new C3029b(this));
        C7335d c = C86312j.m106911c(C58417y0.class);
        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
        C58417y0.fy0((C58417y0) c, this, 4, 2, false, 0, 0, (String) null, 120, (Object) null);
        C53895h.m60466d(getLifecycleAsyncScope(), (C66212f) null, (C53934p0) null, new C14795m4(this, (C15601d<? super C14795m4>) null), 3, (Object) null);
    }

    public void onStop() {
        super.onStop();
        for (C8195i onStop : this.f14723f) {
            onStop.onStop();
        }
    }
}
