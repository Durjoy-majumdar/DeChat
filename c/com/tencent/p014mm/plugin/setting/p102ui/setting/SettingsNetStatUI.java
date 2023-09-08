package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.database.Cursor;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelstat.C114747n;
import com.tencent.p014mm.modelstat.C114748r;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import lg3.C76697h;
import nj3.C76879j;
import p680ru.C36490j;
import p680ru.C36491k;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI */
public class SettingsNetStatUI extends MMPreference {

    /* renamed from: f */
    public static final /* synthetic */ int f347173f = 0;

    /* renamed from: d */
    public C47511g f347174d;

    /* renamed from: e */
    public long f347175e;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI$a */
    public class C115731a implements MenuItem.OnMenuItemClickListener {
        public C115731a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsNetStatUI.this.hideVKB();
            SettingsNetStatUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI$b */
    public class C115732b implements MenuItem.OnMenuItemClickListener {
        public C115732b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsNetStatUI settingsNetStatUI = SettingsNetStatUI.this;
            int i = SettingsNetStatUI.f347173f;
            AppCompatActivity context = settingsNetStatUI.getContext();
            C76879j.m92751v(context, C76697h.m92349b(context, C0966R.string.j0y), C76697h.m92349b(context, C0966R.string.j0z), new C115733s2(settingsNetStatUI), new C115734t2(settingsNetStatUI), C0966R.color.f3041d1);
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo176031H7() {
        Class cls = C36490j.class;
        C36491k Ho0 = ((C36490j) C86312j.m106911c(cls)).Ho0();
        int i = (int) (this.f347175e / 86400000);
        C114748r rVar = (C114748r) Ho0;
        rVar.f344054f.appendAll(true);
        C114747n nVar = null;
        Cursor rawQuery = rVar.f344052d.rawQuery("SELECT MAX( id), MAX( peroid), SUM( textCountIn), SUM( textBytesIn), SUM( imageCountIn), SUM( imageBytesIn), SUM( voiceCountIn), SUM( voiceBytesIn), SUM( videoCountIn), SUM( videoBytesIn), SUM( mobileBytesIn), SUM( wifiBytesIn), SUM( sysMobileBytesIn), SUM( sysWifiBytesIn), SUM( textCountOut), SUM( textBytesOut), SUM( imageCountOut), SUM( imageBytesOut), SUM( voiceCountOut), SUM( voiceBytesOut), SUM( videoCountOut), SUM( videoBytesOut), SUM( mobileBytesOut), SUM( wifiBytesOut), SUM( sysMobileBytesOut), SUM( sysWifiBytesOut ), SUM( realMobileBytesIn ), SUM( realWifiBytesIn ), SUM( realMobileBytesOut ), SUM( realWifiBytesOut ) FROM netstat WHERE peroid >= " + i + "", (String[]) null, 2);
        if (rawQuery.moveToFirst()) {
            nVar = new C114747n();
            nVar.mo174382b(rawQuery);
        }
        rawQuery.close();
        if (nVar == null) {
            nVar = new C114747n();
        }
        this.f347175e = ((C114748r) ((C36490j) C86312j.m106911c(cls)).Ho0()).mo174393qq();
        this.f347174d.mo72519a("settings_netstat_info").mo69924H(getString(C0966R.string.j0u, new Object[]{DateFormat.format(getString(C0966R.string.f360810ez1, new Object[]{""}), this.f347175e).toString()}));
        Preference a = this.f347174d.mo72519a("settings_netstat_mobile");
        Log.m105925i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic mobile out:%d in:%d", Long.valueOf(nVar.f344047x), Long.valueOf(nVar.f344035l));
        a.mo7741E(getString(C0966R.string.j0t, new Object[]{Util.getSizeKB(nVar.f344047x + nVar.f344035l)}));
        a.mo69921C(8);
        Preference a2 = this.f347174d.mo72519a("settings_netstat_wifi");
        Log.m105925i("MicroMsg.SettingsNetStatUI", "dknetflow updateFlowStatistic wifi out:%d in:%d", Long.valueOf(nVar.f344048y), Long.valueOf(nVar.f344036m));
        a2.mo7741E(getString(C0966R.string.j0t, new Object[]{Util.getSizeKB(nVar.f344048y + nVar.f344036m)}));
        a2.mo69921C(8);
        ((NetStatPreference) this.f347174d.mo72519a("settings_netstat_mobile_detail")).f347152J = false;
        ((NetStatPreference) this.f347174d.mo72519a("settings_netstat_wifi_detail")).f347152J = true;
        this.f347174d.notifyDataSetChanged();
    }

    public boolean autoRefresh() {
        return false;
    }

    public int getResourceId() {
        return C0966R.xml.f8962cg;
    }

    public void initView() {
        Class cls = C36490j.class;
        setMMTitle((int) C0966R.string.j0w);
        C114748r rVar = (C114748r) ((C36490j) C86312j.m106911c(cls)).Ho0();
        rVar.getClass();
        int currentDayInMills = (int) (Util.currentDayInMills() / 86400000);
        if (rVar.mo174390Lo(currentDayInMills) == null) {
            C114747n nVar = new C114747n();
            nVar.f344026c = currentDayInMills;
            nVar.f344025b = -1;
            rVar.mo174391Yt(nVar);
        }
        this.f347174d = getPreferenceScreen();
        this.f347175e = ((C114748r) ((C36490j) C86312j.m106911c(cls)).Ho0()).mo174393qq();
        Preference a = this.f347174d.mo72519a("settings_netstat_info");
        String format = new SimpleDateFormat(getString(C0966R.string.f360810ez1), Locale.US).format(new Date(this.f347175e));
        a.mo69924H(getString(C0966R.string.j0u, new Object[]{format}));
        Log.m105924i("MicroMsg.SettingsNetStatUI", "title datatime = " + format);
        Log.m105918d("MicroMsg.SettingsNetStatUI", "title datatime = " + format);
        setBackBtn(new C115731a());
        addTextOptionMenu(0, getString(C0966R.string.j0x), new C115732b());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }

    public void onResume() {
        super.onResume();
        mo176031H7();
    }
}
