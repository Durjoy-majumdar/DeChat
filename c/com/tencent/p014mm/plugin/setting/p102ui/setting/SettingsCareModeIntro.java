package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.CareModeSwitchStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1805j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import g62.C75880o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import lg3.C76694b;
import lg3.C76695c;
import lg3.C88494d;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import tc0.C48623d;
import tc0.C77885p;
import te3.C48684a93;
import te3.C48825b93;
import te3.C64266br1;
import tm2.C78045b;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro */
public class SettingsCareModeIntro extends MMActivity implements C11385n {

    /* renamed from: s */
    public static final /* synthetic */ int f205691s = 0;

    /* renamed from: d */
    public Button f205692d;

    /* renamed from: e */
    public Button f205693e;

    /* renamed from: f */
    public TextView f205694f;

    /* renamed from: g */
    public TextView f205695g;

    /* renamed from: h */
    public long f205696h;

    /* renamed from: i */
    public long f205697i;

    /* renamed from: j */
    public MMSwitchBtn f205698j;

    /* renamed from: n */
    public LinearLayout f205699n;

    /* renamed from: o */
    public TextView f205700o;

    /* renamed from: p */
    public TextView f205701p;

    /* renamed from: q */
    public boolean f205702q;

    /* renamed from: r */
    public C89779i0 f205703r = null;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro$a */
    public class C71062a implements MenuItem.OnMenuItemClickListener {
        public C71062a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsCareModeIntro.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro$b */
    public class C71063b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro$b$a */
        public class C71064a implements C47883u {
            public C71064a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                if (z) {
                    CareModeSwitchStruct careModeSwitchStruct = new CareModeSwitchStruct();
                    careModeSwitchStruct.f154925d = 0;
                    careModeSwitchStruct.mo86054n();
                    SettingsCareModeIntro settingsCareModeIntro = SettingsCareModeIntro.this;
                    settingsCareModeIntro.f205702q = false;
                    SettingsCareModeIntro.m83539H7(settingsCareModeIntro);
                }
            }
        }

        public C71063b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(SettingsCareModeIntro.this.getContext());
            qVar.mo107595g(SettingsCareModeIntro.this.getContext().getResources().getString(C0966R.string.imo));
            qVar.mo107589a(true);
            qVar.mo107590b(new C71064a());
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro$c */
    public class C71065c implements MMSwitchBtn.C7041b {
        public C71065c() {
        }

        public void onStatusChange(boolean z) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_LISTEN_BOOLEAN, Boolean.valueOf(z));
            C76695c.m92347h();
            CareModeSwitchStruct careModeSwitchStruct = new CareModeSwitchStruct();
            careModeSwitchStruct.f154925d = z ? 3 : 4;
            careModeSwitchStruct.mo86054n();
            SettingsCareModeIntro settingsCareModeIntro = SettingsCareModeIntro.this;
            int i = SettingsCareModeIntro.f205691s;
            settingsCareModeIntro.getClass();
            boolean d = C76695c.m92343d();
            Log.m105924i("MicroMsg.SettingsCareModeIntro", "updateExtStatus2Values, lastExtStatus2:" + settingsCareModeIntro.f205697i + " isOpen:" + d);
            if (d) {
                settingsCareModeIntro.f205697i |= 16;
            } else {
                settingsCareModeIntro.f205697i &= -17;
            }
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EXT_STATUS2_LONG_SYNC, Long.valueOf(settingsCareModeIntro.f205697i));
            int i2 = d ? 1 : 2;
            C64266br1 br12 = new C64266br1();
            br12.f182324d = 76;
            br12.f182325e = i2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105924i("MicroMsg.SettingsCareModeIntro", "switch ext change : TTS open = " + d + " item value = " + br12.f182325e + " functionId = " + br12.f182324d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro$d */
    public class C71066d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro$d$a */
        public class C71067a implements C47883u {
            public C71067a() {
            }

            /* renamed from: a */
            public void mo353a(boolean z, String str) {
                if (z) {
                    CareModeSwitchStruct careModeSwitchStruct = new CareModeSwitchStruct();
                    careModeSwitchStruct.f154925d = 1;
                    careModeSwitchStruct.mo86054n();
                    float m = C76577a.m92162m(SettingsCareModeIntro.this.getContext());
                    AppCompatActivity context = SettingsCareModeIntro.this.getContext();
                    int b = C76694b.m92336b(m);
                    SharedPreferences.Editor edit = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit();
                    edit.putFloat("before_care_mode_text_size_scale_key", m);
                    Log.m105925i("MicroMsg.FontUtil", "TEXT_SIZE_BEFOR_CARE_MODE_KEY put result:%s, currentFont:%s ", Boolean.valueOf(edit.commit()), Float.valueOf(m));
                    SharedPreferences.Editor edit2 = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit();
                    edit2.putInt("before_care_mode_text_size_index_key", b);
                    Log.m105925i("MicroMsg.FontUtil", "set TEXT_INDEX_BEFOR_CARE_MODE_KEY result:%s, sliderIndex:%s", Boolean.valueOf(edit2.commit()), Integer.valueOf(b));
                    SettingsCareModeIntro settingsCareModeIntro = SettingsCareModeIntro.this;
                    settingsCareModeIntro.f205702q = true;
                    SettingsCareModeIntro.m83539H7(settingsCareModeIntro);
                }
            }
        }

        public C71066d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77426q qVar = new C77426q(SettingsCareModeIntro.this.getContext());
            qVar.mo107595g(SettingsCareModeIntro.this.getContext().getResources().getString(C0966R.string.imo));
            qVar.mo107589a(true);
            qVar.mo107590b(new C71067a());
            qVar.mo107603o();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsCareModeIntro$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m83539H7(SettingsCareModeIntro settingsCareModeIntro) {
        boolean z = settingsCareModeIntro.f205702q;
        if (z) {
            settingsCareModeIntro.f205696h |= 18014398509481984L;
        } else {
            settingsCareModeIntro.f205696h &= -18014398509481985L;
        }
        int i = z ? 1 : 2;
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 72;
        br12.f182325e = i;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(settingsCareModeIntro.f205696h));
        Log.m105924i("MicroMsg.SettingsCareModeIntro", "switch ext change : open = " + settingsCareModeIntro.f205702q + " item value = " + br12.f182325e + " functionId = " + br12.f182324d + "extStatus =" + settingsCareModeIntro.f205696h);
        settingsCareModeIntro.f205703r = C76879j.m92723Q(settingsCareModeIntro, settingsCareModeIntro.getString(C0966R.string.a3h), settingsCareModeIntro.getString(C0966R.string.a3v), true, false, (DialogInterface.OnCancelListener) null);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bx8;
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        TextView textView = (TextView) findViewById(C0966R.C0970id.f8h);
        if (textView != null) {
            C85875k4.m106191k0(textView.getPaint());
        }
        boolean b = C76695c.m92341b();
        this.f205702q = b;
        Log.m105925i("MicroMsg.SettingsCareModeIntro", "is care mode open:%s", Boolean.valueOf(b));
        this.f205694f = (TextView) findViewById(C0966R.C0970id.f8h);
        this.f205695g = (TextView) findViewById(C0966R.C0970id.f8g);
        this.f205692d = (Button) findViewById(C0966R.C0970id.axx);
        this.f205693e = (Button) findViewById(C0966R.C0970id.axw);
        this.f205699n = (LinearLayout) findViewById(C0966R.C0970id.m6j);
        this.f205700o = (TextView) findViewById(C0966R.C0970id.n1x);
        this.f205701p = (TextView) findViewById(C0966R.C0970id.n1w);
        this.f205694f.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3882hr)) * C76577a.m92161l(getContext()));
        this.f205695g.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3635t)) * C76577a.m92161l(getContext()));
        this.f205693e.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3911io)) * C76577a.m92161l(getContext()));
        this.f205700o.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3635t)) * C76577a.m92161l(getContext()));
        this.f205701p.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3684bd)) * C76577a.m92161l(getContext()));
        if (this.f205702q) {
            this.f205699n.setVisibility(0);
            this.f205692d.setVisibility(8);
            this.f205693e.setVisibility(0);
            this.f205694f.setText(getResources().getString(C0966R.string.b2n));
            this.f205695g.setText(getResources().getString(C0966R.string.b2h));
            this.f205693e.setOnClickListener(new C71063b());
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById(C0966R.C0970id.m6k);
            this.f205698j = mMSwitchBtn;
            mMSwitchBtn.setCheck(C76695c.m92343d());
            this.f205698j.setSwitchListener(new C71065c());
            return;
        }
        this.f205699n.setVisibility(8);
        this.f205693e.setVisibility(8);
        this.f205694f.setText(getResources().getString(C0966R.string.b2m));
        this.f205695g.setText(getResources().getString(C0966R.string.lnp));
        this.f205692d.setVisibility(0);
        this.f205692d.setOnClickListener(new C71066d());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("caremode_setting_succeed", false)) {
            C76912y0.m92768g(MMApplicationContext.getContext(), MMApplicationContext.getContext().getResources().getString(C76695c.m92341b() ? C0966R.string.b2o : C0966R.string.b2g));
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("caremode_setting_succeed", false);
        }
        this.f205696h = C75592q0.m90781k();
        this.f205697i = C75592q0.m90780j();
        initView();
        setBackBtn(new C71062a());
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1805j.CTRL_INDEX, this);
    }

    public void onDestroy() {
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123470p(C1805j.CTRL_INDEX, this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var = this.f205703r;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f205703r = null;
            Log.m105924i("MicroMsg.SettingsCareModeIntro", "onSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " " + yVar.getType());
            if (yVar.getType() == 681) {
                C48623d dVar = (C48623d) yVar;
                List<C75880o> list = dVar.f130155f;
                C48684a93 a932 = dVar.f130154e.f130157b.f130159a;
                int i3 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) list;
                    if (i3 < arrayList.size()) {
                        int b = ((C75880o) arrayList.get(i3)).mo58568b();
                        Log.m105925i("MicroMsg.SettingsCareModeIntro", "onSceneEnd oplogsList cmdId:%s", Integer.valueOf(b));
                        if (b == 23) {
                            C48825b93 b932 = a932.f130391e;
                            if (b932 == null || b932.f131020e.get(i3).intValue() != 0) {
                                C76912y0.m92767f(getContext(), getContext().getResources().getString(C0966R.string.m_0));
                            } else {
                                Log.m105925i("MicroMsg.SettingsCareModeIntro", "onSceneEnd update care mode succeed!, isOpenCare:%s", Boolean.valueOf(this.f205702q));
                                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("caremode_setting_succeed", true);
                                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SETTING_CARE_MODE_STATE_BOOLEAN_SYNC, Boolean.valueOf(this.f205702q));
                                C76695c.m92346g(false);
                                int a = C78045b.m94195a(getContext());
                                float m = C76577a.m92162m(getContext());
                                if (!this.f205702q) {
                                    AppCompatActivity context = getContext();
                                    a = context != null ? context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getInt("before_care_mode_text_size_index_key", 1) : 1;
                                    AppCompatActivity context2 = getContext();
                                    m = context2 != null ? context2.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getFloat("before_care_mode_text_size_scale_key", 1.0f) : 1.0f;
                                    C76695c.m92345f(0);
                                } else if (a < 5) {
                                    C76695c.m92345f(5);
                                    m = 1.4f;
                                    a = 5;
                                } else {
                                    C76695c.m92345f(0);
                                }
                                C78045b.m94197c(getContext(), m, a);
                                C88494d.m110355n(C78045b.m94196b(a));
                                C86709a0.m107535s().mo121142i().mo119681a(true);
                                C119179t tVar = C119157j.f356862d;
                                C71167y1 y1Var = new C71167y1(this);
                                C119157j jVar = (C119157j) tVar;
                                jVar.getClass();
                                jVar.mo183892w(y1Var, 200, false);
                            }
                        }
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
