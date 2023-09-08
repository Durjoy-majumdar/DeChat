package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import bd2.C79690d;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.BackupCoreResetEvent;
import com.tencent.p014mm.autogen.events.BackupProcessMgrExitEvent;
import com.tencent.p014mm.autogen.events.ExDeviceSettingShowEvent;
import com.tencent.p014mm.autogen.events.FcmUnRegisterEvent;
import com.tencent.p014mm.autogen.events.LogoutEvent;
import com.tencent.p014mm.booter.notification.C67845k;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C1295s;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMAppMgr;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.preference.ButtonPreference;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SwitchKeyValuePreference;
import com.tencent.p014mm.p136ui.tools.C7013o;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.newtips.NormalIconNewTipPreference;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.plugin.report.service.C5146v;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.pluginsdk.platformtools.C85623c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMEntryLock;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di0.C86299o;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75576f4;
import eb0.C75592q0;
import eb0.C75593t5;
import eb0.C7624i3;
import f12.C7970a;
import f40.C75678h;
import f40.C75681p0;
import f40.C86709a0;
import f40.C86718e;
import f40.C86723g;
import f40.C86737h0;
import gc2.C116945b;
import gy3.C87412m;
import h81.C32735h;
import h81.C8496k;
import hg0.C76186t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import jc2.C117343c;
import k20.C9556a;
import ke3.C88144b;
import kr0.C76630x0;
import ky2.C10432i;
import l20.C21388a;
import l31.C61212e;
import lc3.C10485b;
import lg3.C76695c;
import m13.C88689b;
import mj2.C10898d;
import na3.C76846i;
import nc0.C76850a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONException;
import org.json.JSONObject;
import p140cw.C7138g;
import p154fy.C45844i;
import p154fy.C87121j;
import p156gj.C87203t;
import p196ln.C117475p;
import p196ln.C76705f;
import p196ln.C76706g;
import p196ln.C76708i;
import p220pr.C77288i;
import p244tt.C14088e;
import p286zl.C79396l;
import p327ct.C20362d;
import p327ct.C30914c;
import p626nv.C109759g;
import p680ru.C77570i;
import pj3.C47511g;
import qe3.C89625d;
import qo3.C77398g;
import qo3.C77407n;
import te3.ro4;
import te3.tg4;
import tm2.C14049d;

@C86737h0
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI */
public class SettingsUI extends MMPreference implements MStorageEx.IOnStorageChange {

    /* renamed from: v */
    public static final /* synthetic */ int f205816v = 0;

    /* renamed from: d */
    public C47511g f205817d;

    /* renamed from: e */
    public ProgressDialog f205818e = null;

    /* renamed from: f */
    public C77407n f205819f;

    /* renamed from: g */
    public C11385n f205820g = null;

    /* renamed from: h */
    public C11385n f205821h = null;

    /* renamed from: i */
    public MTimerHandler f205822i;

    /* renamed from: j */
    public MTimerHandler f205823j;

    /* renamed from: n */
    public C11385n f205824n = null;

    /* renamed from: o */
    public boolean f205825o = false;

    /* renamed from: p */
    public C20362d.C20363a f205826p = new C71094e();

    /* renamed from: q */
    public C77398g f205827q;

    /* renamed from: r */
    public View f205828r;

    /* renamed from: s */
    public CheckBox f205829s;

    /* renamed from: t */
    public MTimerHandler f205830t = null;

    /* renamed from: u */
    public C11385n f205831u = null;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$a */
    public class C71090a implements C14088e.C14090b {
        public C71090a(SettingsUI settingsUI) {
        }

        /* renamed from: a */
        public void mo1717a() {
            Log.m105924i("MicroMsg.SettingsUI", "OpenLiteApp success");
        }

        /* renamed from: b */
        public void mo1718b() {
            Log.m105924i("MicroMsg.SettingsUI", "OpenLiteApp fail");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$b */
    public class C71091b implements DialogInterface.OnClickListener {
        public C71091b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent(SettingsUI.this.getContext(), SettingsModifyAliasUI.class);
            intent.putExtra("WizardRootClass", SettingsAccountInfoUI.class.getCanonicalName());
            MMWizardActivity.m7017L7(SettingsUI.this.getContext(), intent);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$c */
    public class C71092c implements DialogInterface.OnClickListener {
        public C71092c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C77570i) C86312j.m106911c(C77570i.class)).mo107724bH();
            ((C8496k) C86312j.m106911c(C8496k.class)).mo9419s1();
            CheckBox checkBox = SettingsUI.this.f205829s;
            if (checkBox == null || !checkBox.isChecked()) {
                Log.m105924i("MicroMsg.SettingsUI", "normally exit");
                C115669n nVar = C115669n.INSTANCE;
                nVar.idkeyStat(99, 144, 1, false);
                nVar.mo160131h(11545, 7);
                Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithoutNotify");
                if (!(C86709a0.m107524d() == null || C86709a0.m107524d().f256809d == null)) {
                    C86709a0.m107524d().f256809d.mo55479j0(false);
                }
                new FcmUnRegisterEvent().publish();
                SettingsUI settingsUI = SettingsUI.this;
                settingsUI.getClass();
                Log.m105929w("MicroMsg.SettingsUI", "dklogout User EXIT Now uin:%d", Integer.valueOf(C86709a0.m107523b().mo121110g()));
                if (!C86709a0.m107523b().mo121120t() || C75592q0.m90795y()) {
                    settingsUI.mo97788R7();
                    return;
                }
                C89137b0 d = C86709a0.m107524d();
                C71152q3 q3Var = new C71152q3(settingsUI);
                settingsUI.f205831u = q3Var;
                d.mo123455a(281, q3Var);
                C45844i iI = ((C87121j) C86312j.m106911c(C87121j.class)).mo71218iI(2);
                C86709a0.m107524d().mo123460f((C117747y) iI);
                MTimerHandler mTimerHandler = new MTimerHandler(new C71153r3(settingsUI, iI), false);
                settingsUI.f205830t = mTimerHandler;
                mTimerHandler.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                settingsUI.f205818e = C76879j.m92723Q(settingsUI.getContext(), settingsUI.getString(C0966R.string.a3h), settingsUI.getString(C0966R.string.li7), true, true, new C71154s3(settingsUI, iI));
                return;
            }
            Log.m105924i("MicroMsg.SettingsUI", "push notify mode exit");
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.idkeyStat(99, 143, 1, false);
            nVar2.mo160131h(11545, 6);
            Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseConfirmWithNotify");
            C114781l0.m161561h().edit().putBoolean("is_in_notify_mode", true).commit();
            SettingsUI.this.mo97780J7(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$d */
    public class C71093d implements DialogInterface.OnClickListener {
        public C71093d(SettingsUI settingsUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C115669n.INSTANCE.mo160131h(11545, 5);
            Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseCancel");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$e */
    public class C71094e implements C20362d.C20363a {
        public C71094e() {
        }

        /* renamed from: P0 */
        public void mo31843P0(int i, int i2, String str) {
            if (i == 262145 || i == 262157 || i == 262158 || i == 262164) {
                SettingsUI settingsUI = SettingsUI.this;
                int i3 = SettingsUI.f205816v;
                settingsUI.mo97792V7();
            }
        }

        /* renamed from: v0 */
        public void mo31844v0(C72994y1.C72995a aVar, int i, String str) {
            if (aVar != null && aVar == C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC) {
                SettingsUI settingsUI = SettingsUI.this;
                int i2 = SettingsUI.f205816v;
                settingsUI.mo97789S7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$f */
    public class C71095f implements C11385n {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$f$a */
        public class C71096a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C117747y f205836d;

            /* renamed from: e */
            public final /* synthetic */ int f205837e;

            /* renamed from: f */
            public final /* synthetic */ int f205838f;

            public C71096a(C117747y yVar, int i, int i2) {
                this.f205836d = yVar;
                this.f205837e = i;
                this.f205838f = i2;
            }

            public void run() {
                C86709a0.m107524d().mo123470p(255, SettingsUI.this.f205824n);
                SettingsUI settingsUI = SettingsUI.this;
                settingsUI.f205824n = null;
                MTimerHandler mTimerHandler = settingsUI.f205822i;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                    SettingsUI.this.f205822i = null;
                }
                ProgressDialog progressDialog = SettingsUI.this.f205818e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (this.f205836d.getType() != 255 || ((C1302b0) this.f205836d).f10416f != 2) {
                    return;
                }
                if (this.f205837e == -3 && this.f205838f == 4) {
                    Intent intent = new Intent(SettingsUI.this.getContext(), RegByMobileSetPwdUI.class);
                    intent.putExtra("kintent_hint", SettingsUI.this.getString(C0966R.string.hxz));
                    SettingsUI.this.startActivityForResult(intent, 5);
                    return;
                }
                SettingsUI.m83563H7(SettingsUI.this);
            }
        }

        public C71095f() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105918d("MicroMsg.SettingsUI", "onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
            MMHandlerThread.postToMainThread(new C71096a(yVar, i2, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$g */
    public class C71097g implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C1302b0 f205840d;

        public C71097g(C1302b0 b0Var) {
            this.f205840d = b0Var;
        }

        public boolean onTimerExpired() {
            C86709a0.m107524d().mo123458d(this.f205840d);
            C86709a0.m107524d().mo123470p(255, SettingsUI.this.f205824n);
            SettingsUI settingsUI = SettingsUI.this;
            settingsUI.f205824n = null;
            MTimerHandler mTimerHandler = settingsUI.f205822i;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                SettingsUI.this.f205822i = null;
            }
            ProgressDialog progressDialog = SettingsUI.this.f205818e;
            if (progressDialog != null) {
                progressDialog.cancel();
            }
            SettingsUI.m83563H7(SettingsUI.this);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$h */
    public class C71098h implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C1302b0 f205842d;

        public C71098h(C1302b0 b0Var) {
            this.f205842d = b0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f205842d);
            C86709a0.m107524d().mo123470p(255, SettingsUI.this.f205824n);
            SettingsUI settingsUI = SettingsUI.this;
            settingsUI.f205824n = null;
            MTimerHandler mTimerHandler = settingsUI.f205822i;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                SettingsUI.this.f205822i = null;
            }
            ProgressDialog progressDialog = SettingsUI.this.f205818e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$i */
    public class C71099i implements Runnable {
        public C71099i(SettingsUI settingsUI) {
        }

        public void run() {
            ((C88689b) C86312j.m106911c(C88689b.class)).mo122761qt(false, false, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$j */
    public class C71100j implements C11385n {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$j$a */
        public class C71101a implements Runnable {
            public C71101a() {
            }

            public void run() {
                C86709a0.m107524d().mo123470p(282, SettingsUI.this.f205820g);
                SettingsUI.this.f205821h = null;
            }
        }

        public C71100j() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            String s = C75592q0.m90789s();
            if (C75593t5.f222075c.mo105940c(s)) {
                C75593t5.f222075c.mo105946i(s, "last_logout_no_pwd_ticket", "");
            }
            MMHandlerThread.postToMainThread(new C71101a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$k */
    public class C71102k implements C11385n {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$k$a */
        public class C71103a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C117747y f205847d;

            /* renamed from: e */
            public final /* synthetic */ int f205848e;

            /* renamed from: f */
            public final /* synthetic */ int f205849f;

            public C71103a(C117747y yVar, int i, int i2) {
                this.f205847d = yVar;
                this.f205848e = i;
                this.f205849f = i2;
            }

            public void run() {
                C86709a0.m107524d().mo123470p(255, SettingsUI.this.f205824n);
                SettingsUI settingsUI = SettingsUI.this;
                settingsUI.f205824n = null;
                MTimerHandler mTimerHandler = settingsUI.f205822i;
                if (mTimerHandler != null) {
                    mTimerHandler.stopTimer();
                    SettingsUI.this.f205822i = null;
                }
                ProgressDialog progressDialog = SettingsUI.this.f205818e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (this.f205847d.getType() != 255 || ((C1302b0) this.f205847d).f10416f != 1) {
                    return;
                }
                if (this.f205848e == -3 && this.f205849f == 4) {
                    Intent intent = new Intent(SettingsUI.this.getContext(), RegByMobileSetPwdUI.class);
                    intent.putExtra("kintent_hint", SettingsUI.this.getString(C0966R.string.hxz));
                    SettingsUI.this.startActivityForResult(intent, 0);
                    return;
                }
                SettingsUI.this.mo97780J7(true);
            }
        }

        public C71102k() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105918d("MicroMsg.SettingsUI", "onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
            MMHandlerThread.postToMainThread(new C71103a(yVar, i2, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$l */
    public class C71104l implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C1302b0 f205851d;

        public C71104l(C1302b0 b0Var) {
            this.f205851d = b0Var;
        }

        public boolean onTimerExpired() {
            C86709a0.m107524d().mo123458d(this.f205851d);
            C86709a0.m107524d().mo123470p(255, SettingsUI.this.f205824n);
            SettingsUI settingsUI = SettingsUI.this;
            settingsUI.f205824n = null;
            MTimerHandler mTimerHandler = settingsUI.f205822i;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                SettingsUI.this.f205822i = null;
            }
            ProgressDialog progressDialog = SettingsUI.this.f205818e;
            if (progressDialog != null) {
                progressDialog.cancel();
            }
            SettingsUI.this.mo97780J7(true);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$m */
    public class C71105m implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C1302b0 f205853d;

        public C71105m(C1302b0 b0Var) {
            this.f205853d = b0Var;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f205853d);
            C86709a0.m107524d().mo123470p(255, SettingsUI.this.f205824n);
            SettingsUI settingsUI = SettingsUI.this;
            settingsUI.f205824n = null;
            MTimerHandler mTimerHandler = settingsUI.f205822i;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                SettingsUI.this.f205822i = null;
            }
            ProgressDialog progressDialog = SettingsUI.this.f205818e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$n */
    public class C71106n implements Runnable {
        public C71106n(SettingsUI settingsUI) {
        }

        public void run() {
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$o */
    public class C71107o implements MenuItem.OnMenuItemClickListener {
        public C71107o() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$p */
    public class C71108p implements C11182m0 {
        public C71108p(SettingsUI settingsUI) {
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            if (e0Var.mo107176v()) {
                e0Var.mo107135b(1, C0966R.string.f360974ge0, C0966R.raw.menu_logout_single);
                e0Var.mo107135b(2, C0966R.string.gdy, C0966R.raw.menu_close_wechat);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$q */
    public class C71109q implements C77407n.C47880p {
        public C71109q(SettingsUI settingsUI) {
        }

        public void onDismiss() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$r */
    public class C71110r implements C11184p0 {
        public C71110r() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
                if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("EnableModAlias", 0) == 0 || !C75592q0.m90791u() || !Util.isNullOrNil(C75592q0.m90773c()) || !Util.isNullOrNil(str)) {
                    SettingsUI settingsUI = SettingsUI.this;
                    int i2 = SettingsUI.f205816v;
                    settingsUI.mo97783M7();
                    return;
                }
                SettingsUI settingsUI2 = SettingsUI.this;
                int i3 = SettingsUI.f205816v;
                settingsUI2.mo97784N7();
            } else if (itemId == 2) {
                SettingsUI settingsUI3 = SettingsUI.this;
                int i4 = SettingsUI.f205816v;
                settingsUI3.mo97782L7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$s */
    public class C71111s implements View.OnClickListener {
        public C71111s() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsUI.this.onSetToTop();
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsUI$t */
    public class C71112t implements DialogInterface.OnClickListener {
        public C71112t() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SettingsUI settingsUI = SettingsUI.this;
            int i2 = SettingsUI.f205816v;
            settingsUI.mo97785O7();
        }
    }

    /* renamed from: H7 */
    public static void m83563H7(SettingsUI settingsUI) {
        settingsUI.getClass();
        if (!C86709a0.m107523b().mo121120t() || BuildInfo.EX_DEVICE_LOGIN || !C85875k4.m106210y() || C75592q0.m90795y()) {
            settingsUI.mo97779I7();
            MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C71165x3(settingsUI), false);
            settingsUI.f205823j = mTimerHandler;
            mTimerHandler.startTimer(3000);
            settingsUI.f205818e = C76879j.m92723Q(settingsUI, settingsUI.getString(C0966R.string.a3h), settingsUI.getString(C0966R.string.lmx), true, true, new C71168y3(settingsUI));
            return;
        }
        C89137b0 d = C86709a0.m107524d();
        C71159u3 u3Var = new C71159u3(settingsUI);
        settingsUI.f205820g = u3Var;
        d.mo123455a(281, u3Var);
        C45844i iI = ((C87121j) C86312j.m106911c(C87121j.class)).mo71218iI(2);
        C86709a0.m107524d().mo123460f((C117747y) iI);
        settingsUI.mo97779I7();
        MTimerHandler mTimerHandler2 = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C71162v3(settingsUI, iI), false);
        settingsUI.f205822i = mTimerHandler2;
        mTimerHandler2.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        settingsUI.f205818e = C76879j.m92723Q(settingsUI, settingsUI.getString(C0966R.string.a3h), settingsUI.getString(C0966R.string.li7), true, true, new C71164w3(settingsUI, iI));
    }

    /* renamed from: I7 */
    public final void mo97779I7() {
        C89137b0 d = C86709a0.m107524d();
        C71100j jVar = new C71100j();
        this.f205821h = jVar;
        d.mo123455a(282, jVar);
        C86709a0.m107524d().mo123460f((C117747y) ((C87121j) C86312j.m106911c(C87121j.class)).mo71220lB(0));
    }

    /* renamed from: J7 */
    public final void mo97780J7(boolean z) {
        Class cls = C79690d.class;
        MMEntryLock.unlock("welcome_page_show");
        if (z) {
            ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).getClass();
            C67845k.C67847b.f194757a.f194756a.f194754a.getClass();
            C114781l0.m161561h().edit().putString("com.tencent.preference.notification.key.all.notified.msgid", "").apply();
        } else {
            ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).getClass();
            C67845k.C67847b.f194757a.mo93234b(-1, (String) null);
        }
        BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f78724d.f78725a = false;
        backupProcessMgrExitEvent.publish();
        C14049d.m13402a().mo93150TO();
        ((MMNotification) ((C79690d) C86312j.m106911c(cls)).mo109806kA()).mo93209g();
        finish();
        if (C85623c.f249568a != null) {
            MMAppMgr.m85985e(getContext(), z);
        }
    }

    /* renamed from: K7 */
    public final boolean mo97781K7() {
        Intent intent = new Intent(this, SettingsCareModeIntro.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetCareMode", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }

    /* renamed from: L7 */
    public final boolean mo97782L7() {
        C115669n.INSTANCE.mo160131h(11545, 4);
        Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
        if (this.f205828r == null) {
            View inflate = View.inflate(getContext(), C0966R.C0971layout.bx9, (ViewGroup) null);
            this.f205828r = inflate;
            CheckBox checkBox = (CheckBox) inflate.findViewById(C0966R.C0970id.jez);
            this.f205829s = checkBox;
            checkBox.setChecked(true);
        }
        C77398g gVar = this.f205827q;
        if (gVar == null) {
            this.f205827q = C76879j.m92747r(getContext(), (String) null, this.f205828r, getString(C0966R.string.gdy), getString(C0966R.string.f7926wf), new C71092c(), new C71093d(this));
        } else {
            gVar.show();
        }
        return true;
    }

    /* renamed from: M7 */
    public final boolean mo97783M7() {
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(11545, 1);
        Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        nVar.mo160131h(11545, 3);
        Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutConfirm");
        nVar.idkeyStat(99, 145, 1, false);
        if (!(C86709a0.m107524d() == null || C86709a0.m107524d().f256809d == null)) {
            C86709a0.m107524d().f256809d.mo55479j0(false);
        }
        mo97787Q7();
        Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
        return true;
    }

    /* renamed from: N7 */
    public final void mo97784N7() {
        C76879j.m92709C(getContext(), getString(C0966R.string.ge5), (String) null, getString(C0966R.string.bvy), getString(C0966R.string.f7926wf), true, new C71091b(), (DialogInterface.OnClickListener) null);
    }

    /* renamed from: O7 */
    public final void mo97785O7() {
        Intent intent = new Intent(this, SettingsSwitchAccountUI.class);
        intent.putExtra("key_scene", 0);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "jumpToSwitchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "jumpToSwitchAccount", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: P7 */
    public final void mo97786P7() {
        Log.m105924i("MicroMsg.SettingsUI", "oneliang logout mm");
        C14049d.m13402a().fq0();
        C86709a0.m107535s().mo121142i().remove(this);
        LogoutEvent logoutEvent = new LogoutEvent();
        LogoutEvent.C28774a aVar = logoutEvent.f78863d;
        aVar.getClass();
        aVar.f78864a = 0;
        logoutEvent.publish();
        BackupProcessMgrExitEvent backupProcessMgrExitEvent = new BackupProcessMgrExitEvent();
        backupProcessMgrExitEvent.f78724d.f78725a = true;
        backupProcessMgrExitEvent.publish();
        MMEntryLock.unlock("show_whatsnew");
        C75681p0.m90934a(this, true);
        C85405m.m105415e(8);
        C86723g k = C86709a0.m107529k();
        k.f251779b.mo123460f(new C75576f4(new C75678h(k), "reset accinfo"));
        new BackupCoreResetEvent().publish();
        MMApplicationContext.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("Intro_Switch", true);
        ((C67654r1) C14049d.m13403b()).mo93183p(intent, getContext());
        finish();
    }

    /* renamed from: Q7 */
    public final void mo97787Q7() {
        Log.m105929w("MicroMsg.SettingsUI", "dklogout User LOGOUT Now uin:%d , clear cookie", Integer.valueOf(C86709a0.m107523b().mo121110g()));
        new FcmUnRegisterEvent().publish();
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107724bH();
        ((C8496k) C86312j.m106911c(C8496k.class)).mo9419s1();
        C89137b0 d = C86709a0.m107524d();
        C71095f fVar = new C71095f();
        this.f205824n = fVar;
        d.mo123455a(255, fVar);
        C1302b0 b0Var = new C1302b0(2);
        b0Var.f10416f = 2;
        C86709a0.m107524d().mo123460f(b0Var);
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C71097g(b0Var), false);
        this.f205822i = mTimerHandler;
        mTimerHandler.startTimer(12000);
        this.f205818e = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.lmx), true, false, new C71098h(b0Var));
        if (C86709a0.m107522a()) {
            C7624i3.f25910c.mo8754b(((C76708i) C86312j.m106911c(C76708i.class)).mo106845oX(C75592q0.m90789s(), false));
        }
    }

    /* renamed from: R7 */
    public final void mo97788R7() {
        C89137b0 d = C86709a0.m107524d();
        C71102k kVar = new C71102k();
        this.f205824n = kVar;
        d.mo123455a(255, kVar);
        C1302b0 b0Var = new C1302b0(2);
        b0Var.f10416f = 1;
        C86709a0.m107524d().mo123460f(b0Var);
        MTimerHandler mTimerHandler = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C71104l(b0Var), false);
        this.f205822i = mTimerHandler;
        mTimerHandler.startTimer(3000);
        this.f205818e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.lmv), true, false, new C71105m(b0Var));
    }

    /* renamed from: S7 */
    public final void mo97789S7() {
        IconPreference iconPreference = (IconPreference) this.f205817d.mo72519a("settings_account_info");
        if (iconPreference == null) {
            Log.m105920e("MicroMsg.SettingsUI", "safedevicesate preference is null");
            return;
        }
        iconPreference.mo101934R(8);
        if (((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33495c(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257)) {
            iconPreference.mo96250V(0);
        } else {
            iconPreference.mo96250V(8);
        }
        if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VoiceprintEntry"), 0) == 1) {
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, Boolean.FALSE)).booleanValue()) {
                iconPreference.mo101936T(8);
                iconPreference.f215054P = "";
                iconPreference.f215055Q = -1;
            } else if ((C86709a0.m107535s().mo121142i().mo119688i(40, 0) & 131072) == 0) {
                iconPreference.f215054P = getString(C0966R.string.f360088a12);
                iconPreference.f215055Q = C0966R.C0969drawable.ake;
                iconPreference.mo101936T(0);
                Log.m105924i("MicroMsg.SettingsUI", "show voiceprint dot");
            }
            this.f205817d.notifyDataSetChanged();
        }
    }

    /* renamed from: T7 */
    public final void mo97790T7() {
        C79396l lVar = C79396l.SUCC_UNLOAD;
        C79396l b = C76186t.m91534b();
        SwitchKeyValuePreference switchKeyValuePreference = (SwitchKeyValuePreference) this.f205817d.mo72519a("settings_bind_mobile");
        if (switchKeyValuePreference != null) {
            C79396l lVar2 = C79396l.SUCC;
            switchKeyValuePreference.f24296K = b == lVar2 || b == lVar;
            switchKeyValuePreference.mo7747I();
            switchKeyValuePreference.mo7740D((b == lVar2 || b == lVar) ? C0966R.string.iws : C0966R.string.iwr);
        }
    }

    /* renamed from: U7 */
    public final void mo97791U7() {
        Class cls = C32735h.class;
        IconPreference iconPreference = (IconPreference) this.f205817d.mo72519a("settings_about_privacy");
        boolean z = false;
        if (iconPreference != null) {
            if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue() > ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PRIVATY_RED_DOT_DID_SHOW_ID_INT, 0)).intValue()) {
                iconPreference.mo96250V(0);
            } else {
                iconPreference.mo96250V(8);
            }
        }
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_settings_personal_privacy_switcher, 1) == 0) {
            this.f205817d.mo72529n("settings_permission_index", true);
        }
        boolean z2 = C86709a0.m107523b().mo121109d() == C86718e.C7980c.WeChat;
        boolean z3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_settings_personal_privacy_list_entry_switcher, 1) == 0;
        if (z2 || z3) {
            this.f205817d.mo72529n("settings_privacy_personal_list", true);
        }
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_settings_privacy_third_party_list_entry_switcher, 1) == 0) {
            z = true;
        }
        if (z2 || z) {
            this.f205817d.mo72529n("settings_privacy_third_party_list", true);
        }
    }

    /* renamed from: V7 */
    public final void mo97792V7() {
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT;
        Class cls = C30914c.class;
        NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f205817d.mo72519a("settings_about_micromsg");
        boolean nullAs = Util.nullAs(Boolean.valueOf(((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33497e(262145, 266243)), false);
        boolean b = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262157, 266262);
        boolean b2 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262164, 266269);
        if (!nullAs) {
            C116945b.yx0().mo175770k(normalIconNewTipPreference);
        }
        normalIconNewTipPreference.mo96254e0(this.f205817d);
        normalIconNewTipPreference.mo96252c0();
        if (!normalIconNewTipPreference.mo64138m(nullAs || b || b2)) {
            if (nullAs) {
                normalIconNewTipPreference.mo101936T(0);
                normalIconNewTipPreference.f215054P = getString(C0966R.string.f360088a12);
                normalIconNewTipPreference.f215055Q = C0966R.C0969drawable.ake;
                normalIconNewTipPreference.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_NEW, true);
            } else if (b) {
                normalIconNewTipPreference.mo96250V(0);
                normalIconNewTipPreference.mo64136k(nVar, true);
            } else if (((C88689b) C86312j.m106911c(C88689b.class)).mo122736JN()) {
                normalIconNewTipPreference.mo96250V(0);
                normalIconNewTipPreference.mo64136k(nVar, true);
            } else if (b2) {
                normalIconNewTipPreference.mo96250V(0);
                normalIconNewTipPreference.mo64136k(nVar, true);
            } else {
                normalIconNewTipPreference.mo96250V(8);
                normalIconNewTipPreference.f215054P = "";
                normalIconNewTipPreference.f215055Q = -1;
                normalIconNewTipPreference.mo101936T(8);
            }
        }
        NormalIconNewTipPreference normalIconNewTipPreference2 = (NormalIconNewTipPreference) this.f205817d.mo72519a("settings_about_system");
        C116945b.yx0().mo175770k(normalIconNewTipPreference2);
        normalIconNewTipPreference2.mo96254e0(this.f205817d);
        normalIconNewTipPreference2.mo96252c0();
        boolean b3 = ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262158, 266265);
        boolean d = C116945b.wx0().mo175755d(1);
        if (!normalIconNewTipPreference2.mo64138m(b3 || d)) {
            if (b3 || d) {
                normalIconNewTipPreference2.mo96250V(0);
                normalIconNewTipPreference2.mo64136k(nVar, true);
                return;
            }
            normalIconNewTipPreference2.mo96250V(8);
        }
    }

    /* renamed from: W7 */
    public final void mo97793W7() {
        Class cls = C10432i.class;
        IconSwitchKeyValuePreference iconSwitchKeyValuePreference = (IconSwitchKeyValuePreference) this.f205817d.mo72519a("settings_teen_mode");
        if (iconSwitchKeyValuePreference == null) {
            Log.m105920e("MicroMsg.SettingsUI", "updateTeenMode Preference null");
            return;
        }
        boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        if (((C10432i) C86312j.m106911c(cls)).Pj0()) {
            this.f205817d.mo72529n("settings_teen_mode", true);
            Log.m105924i("MicroMsg.SettingsUI", "need hide teen-mode entrance");
            if (e) {
                Log.m105920e("MicroMsg.SettingsUI", "already enable TeenMode, need to close it manually");
                ((C10432i) C86312j.m106911c(cls)).mo10752gg();
                return;
            }
            return;
        }
        this.f205817d.mo72529n("settings_teen_mode", false);
        Log.m105918d("MicroMsg.SettingsUI", "isTeenModeEnable :" + e);
        if (e) {
            iconSwitchKeyValuePreference.mo7741E(getString(C0966R.string.ini));
        } else {
            iconSwitchKeyValuePreference.mo7741E("");
        }
        iconSwitchKeyValuePreference.f121237m1 = -1;
        iconSwitchKeyValuePreference.mo69911b0();
    }

    public int getResourceId() {
        return C0966R.xml.f8950c7;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.j0r);
        this.f205817d = getPreferenceScreen();
        setBackBtn(new C71107o());
        C77407n nVar = new C77407n((Context) this, 1, false);
        this.f205819f = nVar;
        nVar.f225771i = new C71108p(this);
        nVar.f225761d = new C71109q(this);
        nVar.f225782p = new C71110r();
        setToTop(new C71111s());
        mo97790T7();
        mo97792V7();
        mo97791U7();
        ButtonPreference buttonPreference = (ButtonPreference) this.f205817d.mo72519a("settings_switch_account");
        buttonPreference.f215027S = false;
        buttonPreference.mo101917K(getString(C0966R.string.izo), getContext().getResources().getColor(C0966R.color.FG_0));
        ButtonPreference buttonPreference2 = (ButtonPreference) this.f205817d.mo72519a("settings_logout");
        buttonPreference2.f215027S = false;
        buttonPreference2.mo101917K(getString(C0966R.string.it_), getContext().getResources().getColor(C0966R.color.FG_0));
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_dnd_mode_switch_new, 0) == 0) {
            this.f205817d.mo72529n("settings_active_time", true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String g6;
        Class cls = C7138g.class;
        Log.m105926v("MicroMsg.SettingsUI", "settings handle");
        if (i != 2) {
            if (i == 3) {
                String g64 = ((C7138g) C86312j.m106911c(cls)).mo8319g6(getApplicationContext(), intent, C7970a.m8127a());
                if (g64 != null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("CropImageMode", 1);
                    intent2.putExtra("CropImage_OutputPath", g64);
                    intent2.putExtra("CropImage_ImgPath", g64);
                    ((C67654r1) C14049d.m13403b()).mo93178k(getContext(), intent2, 4);
                }
            } else if (i != 4) {
                if (i == 5 && i2 == -1) {
                    mo97786P7();
                }
            } else if (intent != null) {
                String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                if (stringExtra == null) {
                    Log.m105920e("MicroMsg.SettingsUI", "crop picture failed");
                } else {
                    ((C1295s) ((C117475p) C86312j.m106911c(C117475p.class)).mo182091fC(getContext(), stringExtra, false)).mo1220b(1, (Runnable) null, true);
                }
                super.onActivityResult(i, i2, intent);
            }
        } else if (intent != null && (g6 = ((C7138g) C86312j.m106911c(cls)).mo8319g6(getApplicationContext(), intent, C7970a.m8127a())) != null) {
            Intent intent3 = new Intent();
            intent3.putExtra("CropImageMode", 1);
            intent3.putExtra("CropImage_OutputPath", ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93558g(C75592q0.m90789s(), true, false));
            intent3.putExtra("CropImage_ImgPath", g6);
            ((C67654r1) C14049d.m13403b()).mo93179l(this, intent, intent3, C7970a.m8127a(), 4, (C7013o.C7017c) null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C86709a0.m107523b().mo121114l()) {
            finish();
            return;
        }
        if (getIntent().getBooleanExtra("jumptocare", false)) {
            mo97781K7();
        }
        initView();
        C86709a0.m107535s().mo121142i().add(this);
        ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33493a(this.f205826p);
        if (Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VoiceprintEntry"), 0) == 1 && (C86709a0.m107535s().mo121142i().mo119688i(40, 0) & 131072) == 0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN, Boolean.FALSE);
            Log.m105924i("MicroMsg.SettingsUI", "unset more tab dot");
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.SettingsUI).mo86179qs(this, C76986a.Setting);
        ((C77288i) C86312j.m106911c(C77288i.class)).mo107439vw();
    }

    public void onDestroy() {
        if (C86709a0.m107522a()) {
            C86709a0.m107535s().mo121142i().remove(this);
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33504m(this.f205826p);
        }
        if (this.f205820g != null) {
            C86709a0.m107524d().mo123470p(281, this.f205820g);
        }
        if (this.f205824n != null) {
            C86709a0.m107524d().mo123470p(255, this.f205824n);
        }
        if (this.f205831u != null) {
            C86709a0.m107524d().mo123470p(281, this.f205831u);
        }
        super.onDestroy();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        int nullAsInt = Util.nullAsInt(obj, 0);
        Log.m105919d("MicroMsg.SettingsUI", "onNotifyChange event:%d obj:%d stg:%s", Integer.valueOf(i), Integer.valueOf(nullAsInt), mStorageEx);
        if (mStorageEx != C86709a0.m107535s().mo121142i() || nullAsInt <= 0) {
            Log.m105921e("MicroMsg.SettingsUI", "onNotifyChange error obj:%d stg:%s", Integer.valueOf(nullAsInt), mStorageEx);
            return;
        }
        if (4 == nullAsInt) {
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null);
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(4, (Object) null);
        }
        if (6 == nullAsInt) {
            mo97790T7();
        } else if (64 == nullAsInt) {
            mo97789S7();
        }
        if (obj == C72994y1.C72995a.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC) {
            mo97793W7();
        }
    }

    public void onPause() {
        super.onPause();
        if (C86709a0.m107522a()) {
            C86709a0.m107525e().postAtFrontOfQueueToWorker(new C71106n(this));
        }
        ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175775q("plugin");
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class cls = C10485b.class;
        Class cls2 = C30914c.class;
        Class cls3 = C32735h.class;
        Class cls4 = C14088e.class;
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsUI", str + " item has been clicked!");
        if ("settings_welab".equals(str)) {
            C32735h.C32737c cVar = C32735h.C32737c.clicfg_settings_plugin_params;
            if (Util.isNullOrNil(((C32735h) C86312j.m106911c(cls3)).Y60(cVar, "")) || !((C14088e) C86312j.m106911c(cls4)).mo13530uu("wxalitebf3a88de4da873052ba340892dc97559")) {
                Intent intent = new Intent();
                ArrayList arrayList = new ArrayList();
                arrayList.add("labs_browse");
                intent.putStringArrayListExtra("key_exclude_apps", arrayList);
                ((C76846i) C86312j.m106911c(C76846i.class)).Hv0(this, intent);
            } else {
                Log.m105924i("MicroMsg.SettingsUI", "gotoLiteApp");
                Bundle bundle = new Bundle();
                bundle.putString("appId", "wxalitebf3a88de4da873052ba340892dc97559");
                try {
                    JSONObject jSONObject = new JSONObject(((C32735h) C86312j.m106911c(cls3)).Y60(cVar, C89625d.f257846l ? "{\"wetype\":{}}" : "{}"));
                    JSONObject jSONObject2 = new JSONObject(Util.nullAs(((tg4) C116945b.yx0().mo175764c(new C117343c(34)).second).f354448t, "{}"));
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                jSONObject.optJSONObject(next).put(next2, optJSONObject.opt(next2));
                            }
                        }
                    }
                    Log.m105925i("MicroMsg.SettingsUI", "query:%s", jSONObject.toString());
                    bundle.putString(SearchIntents.EXTRA_QUERY, jSONObject.toString());
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.SettingsUI", e, "", new Object[0]);
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.SettingsUI", e2, "", new Object[0]);
                }
                ((C14088e) C86312j.m106911c(cls4)).mo13510OP(getContext(), bundle, true, false, new C71150o3(this));
            }
            C116945b.yx0().mo175762a(34);
            return true;
        } else if ("settings_account_info".equals(str)) {
            if (Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("VoiceprintEntry"), 0) == 1 && (C86709a0.m107535s().mo121142i().mo119688i(40, 0) & 131072) == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, Boolean.FALSE);
                Log.m105924i("MicroMsg.SettingsUI", "unset setting account info dot show");
            }
            ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33500i(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257);
            startActivity(SettingsAccountInfoUI.class);
            return true;
        } else if ("settings_teen_mode".equals(str)) {
            ((C10432i) C86312j.m106911c(C10432i.class)).t60(this);
            return true;
        } else if ("settings_care_mode".equals(str)) {
            mo97781K7();
            return true;
        } else if ("settings_account".equals(str)) {
            AppCompatActivity context = getContext();
            Intent intent2 = new Intent(this, SettingsPersonalInfoUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            AppCompatActivity appCompatActivity = context;
            C117292a.m165358d(appCompatActivity, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetAccount", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(appCompatActivity, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetAccount", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_bind_mobile")) {
            Intent intent3 = new Intent(this, BindMContactIntroUI.class);
            intent3.putExtra("key_upload_scene", 4);
            MMWizardActivity.m7017L7(this, intent3);
            return true;
        } else if (str.equals("settings_about_privacy")) {
            int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PRIVATY_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_PRIVATY_RED_DOT_DID_SHOW_ID_INT;
            if (intValue > ((Integer) i.mo119685f(aVar2, 0)).intValue()) {
                C86709a0.m107535s().mo121142i().mo119677K(aVar2, Integer.valueOf(intValue));
            }
            C115669n.INSTANCE.kvStat(21529, String.format("%s,%s", new Object[]{Long.valueOf(System.currentTimeMillis()), 4}));
            Intent intent4 = new Intent(this, SettingsPrivacyUI.class);
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent4);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetPrivacy", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetPrivacy", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_about_system")) {
            C116945b.yx0().mo175762a(31);
            ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33499h(262158, 266265);
            Intent intent5 = new Intent(this, SettingsAboutSystemUI.class);
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent5);
            C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetSystem", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetSystem", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_about_micromsg")) {
            ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33499h(262145, 266243);
            ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33499h(262157, 266262);
            ((C21388a) ((C30914c) C86312j.m106911c(cls2)).mo17862sM()).mo33499h(262164, 266269);
            C116945b.yx0().mo175762a(38);
            AppCompatActivity context2 = getContext();
            Intent intent6 = new Intent(this, SettingsAboutMicroMsgUI.class);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(intent6);
            C117292a.m165358d(context2, aVar5.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetMicroMsg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetMicroMsg", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((C88689b) C86312j.m106911c(C88689b.class)).mo122762sH();
            new MMHandler().postDelayed(new C71151p3(this), 100);
            return true;
        } else if (str.equals("settings_about_device")) {
            C86299o oVar = new C86299o();
            oVar.f250930b = "wxd930c3b7cf7c92e6";
            oVar.f250934f = "pages/device-list/device-list.html";
            oVar.f250932d = 0;
            oVar.f250931c = 0;
            oVar.f250939k = 1112;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(getContext(), oVar);
            return true;
        } else if (str.equals("settings_logout")) {
            if (C76850a.m92642n()) {
                Log.m105924i("MicroMsg.SettingsUI", "oversea user logout");
                C76879j.m92717K(getContext(), true, getResources().getString(C0966R.string.itd), "", getResources().getString(C0966R.string.it_), getString(C0966R.string.f7926wf), new C71156t3(this), (DialogInterface.OnClickListener) null);
            } else {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(11545, 8);
                Log.m105924i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCloseEntrance");
                if (((HashSet) C75593t5.f222075c.mo105942e()).size() > 1) {
                    nVar.mo160131h(14978, 1, 10, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
                } else {
                    nVar.mo160131h(14978, 0, 10, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
                }
                this.f205819f.mo107573q();
            }
            return true;
        } else if (str.equals("settings_exit")) {
            mo97782L7();
            return true;
        } else if (str.equals("settings_logout_option")) {
            mo97783M7();
            return true;
        } else if (str.equals("settings_notification_preference")) {
            Intent intent7 = new Intent(this, SettingsNotificationUI.class);
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(intent7);
            C117292a.m165358d(this, aVar6.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetNotification", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar6.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "goToSetNotification", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_chatting")) {
            Class cls5 = C77288i.class;
            if (((C77288i) C86312j.m106911c(cls5)).mo107434X7()) {
                ((C77288i) C86312j.m106911c(cls5)).z10(this);
            } else {
                startActivity(SettingsChattingUI.class);
            }
            return true;
        } else if (str.equals("settings_active_time")) {
            C115669n.INSTANCE.mo160131h(11351, 1, 0);
            startActivity(SettingsActiveTimeUI.class);
            return true;
        } else if (str.equals("settings_feedback")) {
            if (!C45628s0.m50756U()) {
                String string = getString(C0966R.string.n6e);
                Log.m105918d("MicroMsg.SettingsUI", "using faq webpage");
                Intent intent8 = new Intent();
                intent8.putExtra("showShare", false);
                intent8.putExtra("rawUrl", string);
                intent8.putExtra("show_feedback", false);
                intent8.putExtra("KShowFixToolsBtn", true);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent8, (Bundle) null);
                return false;
            }
            String string2 = (ChannelUtil.isNokiaAol || (!LocaleUtil.getApplicationLanguage().equals("zh_CN") && !LocaleUtil.getApplicationLanguage().equals("zh_HK") && !LocaleUtil.getApplicationLanguage().equals("zh_TW"))) ? getString(C0966R.string.lin) : getString(C0966R.string.lil);
            Log.m105918d("MicroMsg.SettingsUI", "using faq webpage");
            Intent intent9 = new Intent();
            intent9.putExtra("showShare", false);
            intent9.putExtra("rawUrl", string2);
            intent9.putExtra("show_feedback", false);
            intent9.putExtra("KShowFixToolsBtn", true);
            C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent9, (Bundle) null);
            return false;
        } else if (str.equals("settings_switch_account")) {
            if (((HashSet) C75593t5.f222075c.mo105942e()).size() > 1) {
                C115669n.INSTANCE.mo160131h(14978, 1, 6, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
            } else {
                C115669n.INSTANCE.mo160131h(14978, 0, 6, C75593t5.f222075c.mo105944g(), C75593t5.f222075c.mo105943f(), C87203t.m108273i());
            }
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
            if (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) == 0 || !C75592q0.m90791u() || !Util.isNullOrNil(C75592q0.m90773c()) || !Util.isNullOrNil(str2)) {
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar7 = C72994y1.C72995a.USERINFO_SETTING_SWITCH_ACCOUNT_FIRST_CLICK_BOOLEAN_SYNC;
                if (i2.mo119686g(aVar7, true)) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar7, Boolean.FALSE);
                    C76879j.m92711E(this, getString(C0966R.string.izq), getString(C0966R.string.izr), getString(C0966R.string.f8029zr), false, new C71112t());
                    return false;
                }
                mo97785O7();
                return false;
            }
            mo97784N7();
            return false;
        } else if (str.equals("settings_permission_index")) {
            Intent intent10 = new Intent(this, SettingsPermissionIndexUI.class);
            C9556a aVar8 = new C9556a();
            aVar8.mo10233c(intent10);
            C117292a.m165358d(this, aVar8.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar8.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_privacy_personal_list")) {
            boolean uu = ((C14088e) C86312j.m106911c(cls4)).mo13530uu("wxalite1af500fa066e5b60505c414cd42cacbc");
            if (uu) {
                if (((C14088e) C86312j.m106911c(cls4)).mo13509NR("wxalite1af500fa066e5b60505c414cd42cacbc") == null) {
                    if (((C14088e) C86312j.m106911c(cls4)).mo13512Tg() == null) {
                        ((C14088e) C86312j.m106911c(cls4)).Mk0();
                    }
                    ((C14088e) C86312j.m106911c(cls4)).u50("wxalite1af500fa066e5b60505c414cd42cacbc", (C115477b) null);
                    uu = false;
                } else {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("appId", "wxalite1af500fa066e5b60505c414cd42cacbc");
                    bundle2.putString(SearchIntents.EXTRA_QUERY, "{\"t\":\"datalist/personal\"}");
                    Log.m105924i("MicroMsg.SettingsUI", "open liteapp:wxalite1af500fa066e5b60505c414cd42cacbc,page:");
                    ((C14088e) C86312j.m106911c(cls4)).mo13510OP(getContext(), bundle2, true, false, new C71090a(this));
                }
            }
            if (!uu) {
                String Y60 = ((C32735h) C86312j.m106911c(cls3)).Y60(C32735h.C32737c.clicfg_settings_personal_privacy_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/personal");
                if (!Util.isNullOrNil(Y60)) {
                    LinkedList<ro4> linkedList = C5139t.f20522a.mo6107d().f132225d;
                    C87412m.m108593f(linkedList, "dataList.user_data_list");
                    new C10898d(linkedList).mo9225i().mo123062e(C5146v.f20536a);
                    Intent intent11 = new Intent();
                    intent11.putExtra("showShare", false);
                    intent11.putExtra("rawUrl", Y60);
                    intent11.putExtra("show_feedback", false);
                    intent11.putExtra("show_bottom", false);
                    intent11.putExtra("needRedirect", false);
                    intent11.putExtra("neverGetA8Key", false);
                    C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent11, (Bundle) null);
                }
            }
            return true;
        } else if (!str.equals("settings_privacy_third_party_list")) {
            return false;
        } else {
            String Y602 = ((C32735h) C86312j.m106911c(cls3)).Y60(C32735h.C32737c.clicfg_settings_privacy_third_party_list_url, "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=datalist/shared");
            if (!Util.isNullOrNil(Y602)) {
                Intent intent12 = new Intent();
                intent12.putExtra("showShare", false);
                intent12.putExtra("rawUrl", Y602);
                intent12.putExtra("show_feedback", false);
                intent12.putExtra("show_bottom", false);
                intent12.putExtra("needRedirect", false);
                intent12.putExtra("neverGetA8Key", false);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent12, (Bundle) null);
            }
            return true;
        }
    }

    public void onResume() {
        Class cls = C32735h.class;
        PersonalPreference personalPreference = (PersonalPreference) this.f205817d.mo72519a("settings_account");
        if (personalPreference != null) {
            String s = C75592q0.m90789s();
            personalPreference.f20729K = -1;
            personalPreference.f20730L = s;
            if (personalPreference.f20728J != null) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(personalPreference.f20728J, personalPreference.f20730L);
            }
        }
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_settings_device_entry, 0) != 1) {
            ExDeviceSettingShowEvent exDeviceSettingShowEvent = new ExDeviceSettingShowEvent();
            exDeviceSettingShowEvent.publish();
            if (!exDeviceSettingShowEvent.f107479d.f107480a) {
                this.f205817d.mo72526j(this.f205817d.mo72519a("settings_about_device"));
            }
        }
        mo97789S7();
        mo97793W7();
        mo97790T7();
        mo97792V7();
        mo97791U7();
        C115631n nVar = C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT;
        if (WeChatBrands.Business.Entries.MeSetPlugin.banned() || C45628s0.m50756U()) {
            this.f205817d.mo72529n("settings_welab", true);
        } else {
            if (!Util.isNullOrNil(((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_settings_plugin_params, ""))) {
                ((C14088e) C86312j.m106911c(C14088e.class)).u50("wxalitebf3a88de4da873052ba340892dc97559", (C115477b) null);
            }
            NormalIconNewTipPreference normalIconNewTipPreference = (NormalIconNewTipPreference) this.f205817d.mo72519a("settings_welab");
            C116945b.yx0().mo175770k(normalIconNewTipPreference);
            normalIconNewTipPreference.mo96254e0(this.f205817d);
            normalIconNewTipPreference.mo96252c0();
            C76846i iVar = (C76846i) C86312j.m106911c(C76846i.class);
            boolean iY = iVar.mo59630iY();
            boolean s702 = iVar.s70();
            boolean HQ = iVar.mo59628HQ();
            boolean m = normalIconNewTipPreference.mo64138m(iY || (s702 && HQ));
            Log.m105925i("MicroMsg.SettingsUI", "updateWeLab :%s %s %s %s", Boolean.valueOf(m), Boolean.valueOf(iY), Boolean.valueOf(s702), Boolean.valueOf(HQ));
            if (!m) {
                if (iY) {
                    normalIconNewTipPreference.mo101936T(0);
                    normalIconNewTipPreference.f215054P = getString(C0966R.string.f360088a12);
                    normalIconNewTipPreference.f215055Q = C0966R.C0969drawable.ake;
                    normalIconNewTipPreference.mo64136k(nVar, true);
                } else {
                    normalIconNewTipPreference.mo101936T(8);
                }
                if (!s702) {
                    normalIconNewTipPreference.f215059S = 8;
                    normalIconNewTipPreference.f215081g1 = -1;
                } else if (HQ) {
                    normalIconNewTipPreference.f215059S = 0;
                    normalIconNewTipPreference.f215081g1 = C0966R.C0969drawable.az5;
                    normalIconNewTipPreference.mo64136k(nVar, true);
                } else {
                    normalIconNewTipPreference.f215059S = 0;
                    normalIconNewTipPreference.f215081g1 = C0966R.raw.welab_icon_grey;
                }
            }
        }
        if (C76695c.m92342c()) {
            this.f205817d.mo72529n("settings_care_mode", true);
        } else {
            this.f205817d.mo72529n("settings_care_mode", false);
            Preference a = this.f205817d.mo72519a("settings_care_mode");
            if (C76695c.m92341b()) {
                a.mo7741E(getString(C0966R.string.ini));
            }
        }
        Log.m105926v("MicroMsg.SettingsUI", "on resume");
        super.onResume();
        if (!this.f205825o) {
            this.f205825o = true;
            MMHandlerThread.postToMainThread(new C71099i(this));
        }
    }
}
