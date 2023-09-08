package com.tencent.p014mm.plugin.setting.p102ui.setting;

import a70.C112760b;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f12.C7970a;
import f40.C86709a0;
import nj3.C76879j;
import p140cw.C7138g;
import p216op.C47389f;
import p216op.C47392i;
import p447aw.C103918d;
import p910lj.C76701a;
import pj3.C47511g;
import tm2.C14049d;
import uc0.C52515a;
import uc0.C52516b;
import uc0.C52524x;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI */
public class SettingsChattingBackgroundUI extends MMPreference {

    /* renamed from: g */
    public static final /* synthetic */ int f116284g = 0;

    /* renamed from: d */
    public C47511g f116285d;

    /* renamed from: e */
    public boolean f116286e;

    /* renamed from: f */
    public String f116287f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI$a */
    public class C42945a implements MenuItem.OnMenuItemClickListener {
        public C42945a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsChattingBackgroundUI.this.hideVKB();
            SettingsChattingBackgroundUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI$b */
    public class C42946b implements DialogInterface.OnClickListener {
        public C42946b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(SettingsChattingBackgroundUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI$c */
    public class C42947c implements DialogInterface.OnClickListener {
        public C42947c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(SettingsChattingBackgroundUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsChattingBackgroundUI$d */
    public class C42948d implements DialogInterface.OnClickListener {
        public C42948d(SettingsChattingBackgroundUI settingsChattingBackgroundUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: H7 */
    public final String mo67143H7(boolean z) {
        C47392i SU = ((C47389f) C86312j.m106911c(C47389f.class)).mo72331SU();
        if (this.f116286e) {
            return ((C52524x) SU).mo73469qq("default", z);
        }
        return ((C52524x) SU).mo73469qq(this.f116287f, z);
    }

    /* renamed from: I7 */
    public final boolean mo67144I7() {
        boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(getContext(), "android.permission.CAMERA", 16, "", "");
        Log.m105925i("MicroMsg.SettingsChattingBackgroundUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), getContext());
        if (!z1) {
            return false;
        }
        mo67145J7();
        return true;
    }

    /* renamed from: J7 */
    public final void mo67145J7() {
        String K = C112760b.m154203K();
        if (!((C7138g) C86312j.m106911c(C7138g.class)).Gl0(this, K, "microMsg." + System.currentTimeMillis() + ".jpg", 2)) {
            C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.ik5), 1).show();
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8946c2;
    }

    public void initView() {
        Preference a;
        setMMTitle((int) C0966R.string.ir6);
        this.f116285d = getPreferenceScreen();
        boolean booleanExtra = getIntent().getBooleanExtra("isApplyToAll", true);
        this.f116286e = booleanExtra;
        if (!booleanExtra && (a = this.f116285d.mo72519a("settings_chatting_bg_apply_to_all")) != null) {
            this.f116285d.mo72526j(a);
        }
        this.f116287f = getIntent().getStringExtra("username");
        setBackBtn(new C42945a());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && i2 == -1) {
                        Class cls = C47389f.class;
                        C86709a0.m107535s().mo121142i().mo119676J(66820, -1);
                        C115669n.INSTANCE.mo160131h(10198, -1);
                        Log.m105925i("MicroMsg.SettingsChattingBackgroundUI", "set chating bg id:%d", -1);
                        if (this.f116286e) {
                            C86709a0.m107535s().mo121142i().mo119676J(12311, -1);
                            ((C52524x) ((C47389f) C86312j.m106911c(cls)).mo72331SU()).mo73467jo(1);
                        } else {
                            C52516b bVar = (C52516b) ((C47389f) C86312j.m106911c(cls)).Bk0();
                            C52515a jo = bVar.mo73451jo(this.f116287f);
                            if (jo == null) {
                                C52515a aVar = new C52515a();
                                aVar.f146671a = this.f116287f;
                                aVar.f146672b = -1;
                                bVar.mo73450Lo(aVar);
                            } else {
                                jo.f146672b = -1;
                                bVar.mo73452qq(jo);
                            }
                        }
                    }
                } else if (i2 != -1) {
                    return;
                }
                if (!this.f116286e) {
                    setResult(-1);
                    finish();
                    return;
                }
                return;
            }
            String g6 = ((C7138g) C86312j.m106911c(C7138g.class)).mo8319g6(getApplicationContext(), intent, C7970a.m8127a());
            if (g6 != null) {
                Intent intent2 = new Intent();
                intent2.putExtra("CropImageMode", 2);
                intent2.putExtra("CropImage_ImgPath", g6);
                intent2.putExtra("CropImage_bg_vertical", mo67143H7(true));
                intent2.putExtra("CropImage_bg_horizontal", mo67143H7(false));
                ((C67654r1) C14049d.m13403b()).mo93178k(this, intent2, 4);
            }
        } else if (intent != null) {
            Intent intent3 = new Intent();
            intent3.putExtra("CropImageMode", 2);
            intent3.putExtra("CropImage_bg_vertical", mo67143H7(true));
            intent3.putExtra("CropImage_bg_horizontal", mo67143H7(false));
            ((C67654r1) C14049d.m13403b()).mo93179l(this, intent, intent3, C7970a.m8127a(), 4, (C7013o.C7017c) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsChattingBackgroundUI", str + " item has been clicked!");
        if (str.equals("settings_chatting_bg_select_bg")) {
            Intent intent = new Intent();
            intent.setClass(this, SettingsSelectBgUI.class);
            intent.putExtra("isApplyToAll", this.f116286e);
            intent.putExtra("username", this.f116287f);
            startActivityForResult(intent, 3);
            return true;
        } else if (str.equals("settings_chatting_bg_select_from_album")) {
            ((C7138g) C86312j.m106911c(C7138g.class)).mo8329zT(this, 1, (Intent) null);
            return true;
        } else if (str.equals("settings_chatting_bg_take_photo")) {
            return mo67144I7();
        } else {
            if (!str.equals("settings_chatting_bg_apply_to_all")) {
                return false;
            }
            C76879j.m92750u(getContext(), getString(C0966R.string.ir7), "", new C43000z1(this), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.SettingsChattingBackgroundUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 16) {
            if (i == 145) {
                if (iArr[0] == 0) {
                    mo67144I7();
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.hhw), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.atx), false, new C42947c(), new C42948d(this));
            }
        } else if (iArr[0] == 0) {
            mo67145J7();
        } else {
            C76879j.m92709C(this, getString(C0966R.string.hhq), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C42946b(), (DialogInterface.OnClickListener) null);
        }
    }
}
