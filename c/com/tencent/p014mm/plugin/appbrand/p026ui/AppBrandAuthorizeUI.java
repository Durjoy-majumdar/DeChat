package com.tencent.p014mm.plugin.appbrand.p026ui;

import a14.C53895h;
import a14.C53934p0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C54218t;
import as0.C39634b;
import as0.C39635c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.backgroundrunning.C29452i;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.plugin.appbrand.config.WxaProfileAttributes;
import com.tencent.p014mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.AppBrandPrivacyPageContainerUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record.AppBrandPrivacyUseRecordPage;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.soter.core.biometric.FaceManager;
import com.tencent.xweb.IXWebBroadcastListener;
import cs0.C45152a0;
import cs0.C45154b;
import d62.C75339i;
import di0.C86299o;
import di3.C86312j;
import eb0.C45628s0;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C76630x0;
import lb0.C88394b;
import nj3.C76912y0;
import ob0.C47350c;
import ob0.C89144l0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;
import p399xu.C23114b;
import pj3.C47511g;
import qo3.C89779i0;
import te3.C49654h34;
import te3.C49689hd2;
import te3.C49795i34;
import te3.C49831id2;
import te3.C50911q40;
import te3.C51793w7;
import te3.f65;
import te3.g65;
import te3.mo4;
import te3.no4;
import te3.r45;
import te3.s45;
import te3.s65;
import te3.v75;
import vr0.C78471a;
import wi0.C53173v;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI */
public class AppBrandAuthorizeUI extends MMPreference {

    /* renamed from: X */
    public static final String[] f49731X = {"preference_key_subscribe_msg", "scope.userInfo", "scope.userProfileChange", "scope.userLocation", "scope.userFuzzyLocation", "scope.bluetooth"};

    /* renamed from: Y */
    public static final String[] f49732Y = {"scope.receiptQrCode", "scope.personalC2CPay"};

    /* renamed from: A */
    public boolean f49733A = false;

    /* renamed from: B */
    public boolean f49734B = false;

    /* renamed from: C */
    public boolean f49735C = false;

    /* renamed from: D */
    public boolean f49736D = false;

    /* renamed from: E */
    public C89779i0 f49737E;

    /* renamed from: F */
    public Preference f49738F;

    /* renamed from: G */
    public C51793w7 f49739G;

    /* renamed from: H */
    public C51793w7 f49740H;

    /* renamed from: I */
    public boolean f49741I = false;

    /* renamed from: J */
    public boolean f49742J = false;

    /* renamed from: K */
    public boolean f49743K = false;

    /* renamed from: L */
    public boolean f49744L = false;

    /* renamed from: M */
    public SubscribeMsgSettingData f49745M;

    /* renamed from: N */
    public MMUserAvatarInfo f49746N;

    /* renamed from: P */
    public MMUserAvatarInfo f49747P;

    /* renamed from: Q */
    public AppBrandAuthorizeUI$$q f49748Q;

    /* renamed from: R */
    public boolean f49749R;

    /* renamed from: S */
    public boolean f49750S;

    /* renamed from: T */
    public boolean f49751T = false;

    /* renamed from: U */
    public boolean f49752U = true;

    /* renamed from: V */
    public LinkedList<C50911q40> f49753V = new LinkedList<>();

    /* renamed from: W */
    public IListener<AppBrandNotifyMessageStatusChangedEvent> f49754W = new IListener<AppBrandNotifyMessageStatusChangedEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1390647424;
        }

        public boolean callback(IEvent iEvent) {
            AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent = (AppBrandNotifyMessageStatusChangedEvent) iEvent;
            C47511g gVar = AppBrandAuthorizeUI.this.f49761j;
            if (gVar == null || gVar.mo72519a("preference_key_notify_msg") == null) {
                return true;
            }
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "change notify preferent status by event");
            ((CheckBoxPreference) AppBrandAuthorizeUI.this.f49761j.mo72519a("preference_key_notify_msg")).mo6805K(appBrandNotifyMessageStatusChangedEvent.f193472d.f193474b);
            return true;
        }
    };

    /* renamed from: d */
    public List<C51793w7> f49755d = new ArrayList();

    /* renamed from: e */
    public v75 f49756e = null;

    /* renamed from: f */
    public String f49757f;

    /* renamed from: g */
    public int f49758g;

    /* renamed from: h */
    public String f49759h;

    /* renamed from: i */
    public WxaProfileAttributes f49760i;

    /* renamed from: j */
    public C47511g f49761j;

    /* renamed from: n */
    public Preference f49762n;

    /* renamed from: o */
    public Preference f49763o;

    /* renamed from: p */
    public IconPreference f49764p;

    /* renamed from: q */
    public IconPreference f49765q;

    /* renamed from: r */
    public C51793w7 f49766r;

    /* renamed from: s */
    public C51793w7 f49767s;

    /* renamed from: t */
    public C51793w7 f49768t;

    /* renamed from: u */
    public C51793w7 f49769u;

    /* renamed from: v */
    public C51793w7 f49770v;

    /* renamed from: w */
    public int f49771w;

    /* renamed from: x */
    public int f49772x;

    /* renamed from: y */
    public boolean f49773y = false;

    /* renamed from: z */
    public boolean f49774z = true;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        if (r0 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        if (r1 == false) goto L_0x0090;
     */
    /* renamed from: H7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m18561H7(com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI r5, java.util.List r6, com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData r7, te3.v75 r8) {
        /*
            boolean r0 = r5.f49743K
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r5.f49744L
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r5.mo22478Z7()
            if (r0 == 0) goto L_0x0012
            boolean r0 = r5.f49751T
            if (r0 == 0) goto L_0x00a6
        L_0x0012:
            java.lang.String r0 = r5.f49757f
            boolean r0 = m18569P7(r0, r6)
            r5.f49735C = r0
            java.lang.String r0 = r5.f49757f
            boolean r0 = m18568O7(r0, r6)
            r5.f49741I = r0
            r5.mo22478Z7()
            boolean r0 = r5.f49735C
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005f
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0059
            java.util.Iterator r0 = r6.iterator()
        L_0x0035:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r0.next()
            te3.w7 r3 = (te3.C51793w7) r3
            java.lang.String r4 = r3.f143896d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0035
            java.lang.String r3 = r3.f143896d
            java.lang.String r4 = "scope.userLocation"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0035
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            if (r0 != 0) goto L_0x005f
        L_0x0059:
            r5.mo22472T7()
            r5.mo22471S7()
        L_0x005f:
            boolean r0 = r5.f49741I
            if (r0 == 0) goto L_0x0096
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0090
            java.util.Iterator r0 = r6.iterator()
        L_0x006d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r0.next()
            te3.w7 r3 = (te3.C51793w7) r3
            java.lang.String r4 = r3.f143896d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x006d
            java.lang.String r3 = r3.f143896d
            java.lang.String r4 = "scope.bluetooth"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x006d
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            if (r1 != 0) goto L_0x0096
        L_0x0090:
            r5.mo22470R7()
            r5.mo22469Q7()
        L_0x0096:
            com.tencent.mm.plugin.appbrand.ui.m r0 = new com.tencent.mm.plugin.appbrand.ui.m
            r0.<init>(r5, r2)
            r5.runOnUiThread(r0)
            com.tencent.mm.plugin.appbrand.ui.n r0 = new com.tencent.mm.plugin.appbrand.ui.n
            r0.<init>(r5, r6, r7, r8)
            r5.runOnUiThread(r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.m18561H7(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI, java.util.List, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData, te3.v75):void");
    }

    /* renamed from: I7 */
    public static void m18562I7(AppBrandAuthorizeUI appBrandAuthorizeUI, boolean z, boolean z2, Preference preference, C47511g gVar, C51793w7 w7Var) {
        appBrandAuthorizeUI.getClass();
        MMHandlerThread.postToMainThread(new C18043u(appBrandAuthorizeUI, z, preference, z2, w7Var, gVar));
    }

    /* renamed from: J7 */
    public static void m18563J7(AppBrandAuthorizeUI appBrandAuthorizeUI) {
        appBrandAuthorizeUI.getClass();
        MMHandlerThread.postToMainThread(new C18031h(appBrandAuthorizeUI));
    }

    /* renamed from: K7 */
    public static void m18564K7(AppBrandAuthorizeUI appBrandAuthorizeUI, int i) {
        appBrandAuthorizeUI.getClass();
        Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "updateLocationAuthState, state:%d", Integer.valueOf(i));
        appBrandAuthorizeUI.mo22472T7();
        appBrandAuthorizeUI.mo22471S7();
        if (i == 2) {
            C51793w7 w7Var = appBrandAuthorizeUI.f49767s;
            if (w7Var != null) {
                w7Var.f143898f = 1;
            }
            C51793w7 w7Var2 = appBrandAuthorizeUI.f49766r;
            if (w7Var2 != null) {
                w7Var2.f143898f = 1;
            }
        } else if (i == 1) {
            C51793w7 w7Var3 = appBrandAuthorizeUI.f49766r;
            if (w7Var3 != null) {
                w7Var3.f143898f = 1;
            }
            C51793w7 w7Var4 = appBrandAuthorizeUI.f49767s;
            if (w7Var4 != null) {
                w7Var4.f143898f = 2;
            }
        } else {
            C51793w7 w7Var5 = appBrandAuthorizeUI.f49766r;
            if (w7Var5 != null) {
                w7Var5.f143898f = 2;
            }
            C51793w7 w7Var6 = appBrandAuthorizeUI.f49767s;
            if (w7Var6 != null) {
                w7Var6.f143898f = 2;
            }
        }
    }

    /* renamed from: L7 */
    public static void m18565L7(AppBrandAuthorizeUI appBrandAuthorizeUI, int i) {
        appBrandAuthorizeUI.getClass();
        Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "updateFyzzyLocationAuthState, state:%d", Integer.valueOf(i));
        if (appBrandAuthorizeUI.f49768t == null) {
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemLocation");
            C51793w7 w7Var = new C51793w7();
            appBrandAuthorizeUI.f49768t = w7Var;
            w7Var.f143898f = 2;
            w7Var.f143896d = "scope.userFuzzyLocation";
            w7Var.f143897e = appBrandAuthorizeUI.getString(C0966R.string.f7617ll);
            appBrandAuthorizeUI.f49755d.add(appBrandAuthorizeUI.f49766r);
        }
        if (i == 2) {
            appBrandAuthorizeUI.f49768t.f143898f = 1;
        } else if (i == 1) {
            appBrandAuthorizeUI.f49768t.f143898f = 1;
        } else {
            appBrandAuthorizeUI.f49768t.f143898f = 2;
        }
    }

    /* renamed from: M7 */
    public static boolean m18566M7(List<C51793w7> list) {
        if (list == null) {
            return false;
        }
        for (C51793w7 next : list) {
            if (!Util.isNullOrNil(next.f143896d) && next.f143896d.equalsIgnoreCase("scope.bluetoothBackground")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: N7 */
    public static boolean m18567N7(List<C51793w7> list) {
        if (list == null) {
            return false;
        }
        for (C51793w7 next : list) {
            if (!Util.isNullOrNil(next.f143896d) && next.f143896d.equalsIgnoreCase("scope.userLocationBackground")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: O7 */
    public static boolean m18568O7(String str, List<C51793w7> list) {
        return (Util.isNullOrNil(str) ? false : MultiProcessMMKV.getMMKV("appbrand_background_config").decodeBool(String.format("%s_bluetooth_background_required", new Object[]{str}), false)) || m18566M7(list);
    }

    /* renamed from: P7 */
    public static boolean m18569P7(String str, List<C51793w7> list) {
        boolean z;
        if (list != null) {
            Iterator<C51793w7> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C51793w7 next = it.next();
                if (!Util.isNullOrNil(next.f143896d) && next.f143896d.equalsIgnoreCase("scope.userFuzzyLocation")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return false;
        }
        return (Util.isNullOrNil(str) ? false : MultiProcessMMKV.getMMKV("appbrand_background_config").decodeBool(String.format("%s_location_background_required", new Object[]{str}), false)) || m18567N7(list);
    }

    /* renamed from: Q7 */
    public final void mo22469Q7() {
        if (this.f49740H == null) {
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemBluetoothBackground");
            C51793w7 w7Var = new C51793w7();
            this.f49740H = w7Var;
            w7Var.f143898f = 2;
            w7Var.f143896d = "scope.bluetoothBackground";
            w7Var.f143897e = getString(C0966R.string.bhq);
            this.f49755d.add(this.f49740H);
        }
    }

    /* renamed from: R7 */
    public final void mo22470R7() {
        if (this.f49739G == null) {
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemBluetooth");
            C51793w7 w7Var = new C51793w7();
            this.f49739G = w7Var;
            w7Var.f143898f = 2;
            w7Var.f143896d = "scope.bluetooth";
            w7Var.f143897e = getString(C0966R.string.bhq);
            this.f49755d.add(this.f49739G);
        }
    }

    /* renamed from: S7 */
    public final void mo22471S7() {
        if (this.f49767s == null) {
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemLocationBackground");
            C51793w7 w7Var = new C51793w7();
            this.f49767s = w7Var;
            w7Var.f143898f = 2;
            w7Var.f143896d = "scope.userLocationBackground";
            w7Var.f143897e = getString(C0966R.string.f7617ll);
            this.f49755d.add(this.f49767s);
        }
    }

    /* renamed from: T7 */
    public final void mo22472T7() {
        if (this.f49766r == null) {
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemLocation");
            C51793w7 w7Var = new C51793w7();
            this.f49766r = w7Var;
            w7Var.f143898f = 2;
            w7Var.f143896d = "scope.userLocation";
            w7Var.f143897e = getString(C0966R.string.f7617ll);
            this.f49755d.add(this.f49766r);
        }
    }

    /* renamed from: U7 */
    public final void mo22473U7() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49689hd2();
        bVar.f127067b = new C49831id2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/getwxamsgconfig";
        bVar.f127069d = 357;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C89144l0.m111430f(bVar.mo72403a(), new AppBrandAuthorizeUI$$c(this), true, this);
    }

    /* renamed from: V7 */
    public final int mo22474V7() {
        C51793w7 w7Var = this.f49739G;
        if (((w7Var == null || w7Var.f143898f != 1) ? (char) 2 : 1) == 2) {
            return 0;
        }
        C51793w7 w7Var2 = this.f49740H;
        return ((w7Var2 == null || w7Var2.f143898f != 1) ? (char) 2 : 1) == 2 ? 1 : 2;
    }

    /* renamed from: W7 */
    public final int mo22475W7() {
        C51793w7 w7Var = this.f49766r;
        if (((w7Var == null || w7Var.f143898f != 1) ? (char) 2 : 1) == 2) {
            return 0;
        }
        C51793w7 w7Var2 = this.f49767s;
        return ((w7Var2 == null || w7Var2.f143898f != 1) ? (char) 2 : 1) == 2 ? 1 : 2;
    }

    /* renamed from: X7 */
    public final void mo22476X7(List<String> list, AppBrandAuthorizeUI$$p appBrandAuthorizeUI$$p) {
        if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            C76912y0.makeText((Context) this, (CharSequence) getString(C0966R.string.f360087a11), 1).show();
            if (appBrandAuthorizeUI$$p != null) {
                appBrandAuthorizeUI$$p.mo22488a(false);
                return;
            }
            return;
        }
        MMHandlerThread.postToMainThread(new AppBrandAuthorizeUI$$b(this, list, appBrandAuthorizeUI$$p));
    }

    /* renamed from: Y7 */
    public final void mo22477Y7() {
        int i;
        if (this.f49733A) {
            JSONArray jSONArray = new JSONArray();
            for (C51793w7 next : this.f49755d) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("scope", next.f143896d);
                    jSONObject.put("state", next.f143898f);
                    jSONObject.put("desc", next.f143897e);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", e, "", new Object[0]);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            SubscribeMsgSettingData subscribeMsgSettingData = this.f49745M;
            if (subscribeMsgSettingData != null) {
                try {
                    jSONObject2.put("mainSwitch", subscribeMsgSettingData.f49051e);
                    JSONArray jSONArray2 = new JSONArray();
                    for (SubscribeMsgTmpItem next2 : this.f49745M.f49052f) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, next2.f49020e);
                        jSONObject3.put("templateId", next2.f49021f);
                        jSONObject3.put("templateType", next2.f49022g);
                        if (next2.f49030r) {
                            i = -1;
                        } else {
                            int i2 = next2.f49025j;
                            if (i2 != 1) {
                                if (i2 == 0) {
                                    i = 0;
                                }
                            }
                            i = 1;
                        }
                        jSONObject3.put("status", i);
                        jSONObject3.put("acceptAudio", next2.f49033u);
                        jSONObject3.put("isAudioTemplate", next2.f49032t);
                        jSONObject3.put("tid", next2.f49031s);
                        jSONArray2.put(jSONObject3);
                    }
                    jSONObject2.put("templatesInfo", jSONArray2);
                } catch (JSONException e2) {
                    Log.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", e2, "", new Object[0]);
                }
            }
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "setResData, authInfo:%s", jSONArray);
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "setResData, subscriptionsSetting:%s", jSONObject2);
            Intent intent = new Intent();
            intent.putExtra("key_app_authorize_state", jSONArray.toString());
            intent.putExtra("key_app_subscriptions_setting", jSONObject2.toString());
            setResult(-1, intent);
        }
    }

    /* renamed from: Z7 */
    public final boolean mo22478Z7() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_appbrand_notify_msg_enable, false);
        Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "showNotifyMsgPreference, isABtestEnable: %b, isStarApp: %b", Boolean.valueOf(wf), Boolean.valueOf(this.f49749R));
        return this.f49749R && wf;
    }

    /* renamed from: a8 */
    public final void mo22479a8() {
        if (this.f49738F != null) {
            int V7 = mo22474V7();
            if (V7 == 1) {
                this.f49738F.mo7740D(C0966R.string.f7620lo);
            } else if (V7 != 2) {
                this.f49738F.mo7740D(C0966R.string.f7621lp);
            } else {
                this.f49738F.mo7740D(C0966R.string.bhr);
            }
        }
    }

    /* renamed from: b8 */
    public final void mo22480b8(int i) {
        Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "updateBluetoothAuthState, state:%d", Integer.valueOf(i));
        mo22470R7();
        mo22469Q7();
        if (i == 2) {
            C51793w7 w7Var = this.f49740H;
            if (w7Var != null) {
                w7Var.f143898f = 1;
            }
            C51793w7 w7Var2 = this.f49739G;
            if (w7Var2 != null) {
                w7Var2.f143898f = 1;
            }
        } else if (i == 1) {
            C51793w7 w7Var3 = this.f49739G;
            if (w7Var3 != null) {
                w7Var3.f143898f = 1;
            }
            C51793w7 w7Var4 = this.f49740H;
            if (w7Var4 != null) {
                w7Var4.f143898f = 2;
            }
        } else {
            C51793w7 w7Var5 = this.f49739G;
            if (w7Var5 != null) {
                w7Var5.f143898f = 2;
            }
            C51793w7 w7Var6 = this.f49740H;
            if (w7Var6 != null) {
                w7Var6.f143898f = 2;
            }
        }
    }

    /* renamed from: c8 */
    public final void mo22481c8() {
        if (this.f49762n != null) {
            int W7 = mo22475W7();
            if (W7 == 1) {
                this.f49762n.mo7740D(C0966R.string.f7620lo);
            } else if (W7 != 2) {
                this.f49762n.mo7740D(C0966R.string.f7621lp);
            } else {
                this.f49762n.mo7740D(C0966R.string.f7619ln);
            }
        }
    }

    /* renamed from: d8 */
    public final void mo22482d8(IconPreference iconPreference, C51793w7 w7Var) {
        this.f49769u = w7Var;
        mo4 mo4 = w7Var.f143899g;
        if (mo4 != null) {
            this.f49771w = mo4.f259695g;
            iconPreference.mo101935S(C76577a.m92151b(getContext(), 40), C76577a.m92151b(getContext(), 40));
            iconPreference.f121290w = false;
            iconPreference.mo26273A(this.f49769u.f143896d);
            iconPreference.mo69924H(this.f49769u.f143897e);
            C51793w7 w7Var2 = this.f49769u;
            this.f49746N = new MMUserAvatarInfo(w7Var2.f143899g, w7Var2.f143904o, w7Var2.f143903n, w7Var2.f143905p);
            if (this.f49769u.f143898f == 2) {
                iconPreference.mo7740D(C0966R.string.f7621lp);
                iconPreference.mo101930L((Bitmap) null);
                iconPreference.mo101932N(8);
                return;
            }
            iconPreference.mo7741E("");
            iconPreference.mo101931M(C0966R.C0969drawable.c8n);
            iconPreference.mo101932N(0);
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo default_avatar_id = " + this.f49769u.f143899g.f259695g);
            Iterator<no4> it = this.f49769u.f143899g.f259692d.iterator();
            while (it.hasNext()) {
                no4 next = it.next();
                Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo list avatar id = " + next.f259706d);
                if (this.f49769u.f143899g.f259695g == next.f259706d) {
                    String str = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122796o(new AppBrandAuthorizeUI$$f(this, iconPreference), next.f259708f, new AppBrandAuthorizeUI$$g(this));
                    return;
                }
            }
        }
    }

    /* renamed from: e8 */
    public final void mo22483e8(IconPreference iconPreference, C51793w7 w7Var) {
        this.f49770v = w7Var;
        mo4 mo4 = w7Var.f143899g;
        if (mo4 != null) {
            this.f49772x = mo4.f259695g;
            iconPreference.f121290w = false;
            iconPreference.mo26273A(w7Var.f143896d);
            iconPreference.mo69924H(this.f49770v.f143897e);
            C51793w7 w7Var2 = this.f49770v;
            this.f49747P = new MMUserAvatarInfo(w7Var2.f143899g, w7Var2.f143904o, w7Var2.f143903n, w7Var2.f143905p);
            if (this.f49770v.f143898f == 2) {
                iconPreference.mo7740D(C0966R.string.f7621lp);
                iconPreference.mo101930L((Bitmap) null);
                iconPreference.mo101932N(8);
                iconPreference.mo101934R(8);
                return;
            }
            iconPreference.mo7741E("");
            iconPreference.mo101931M(C0966R.C0969drawable.c8n);
            iconPreference.mo101932N(0);
            iconPreference.mo101934R(0);
            Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo default_avatar_id = " + this.f49770v.f143899g.f259695g);
            Iterator<no4> it = this.f49770v.f143899g.f259692d.iterator();
            while (it.hasNext()) {
                no4 next = it.next();
                Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo list avatar id = " + next.f259706d);
                if (this.f49770v.f143899g.f259695g == next.f259706d) {
                    iconPreference.mo7741E(next.f259707e);
                    String str = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122796o(new AppBrandAuthorizeUI$$h(this, iconPreference), next.f259708f, new AppBrandAuthorizeUI$$i(this));
                    return;
                }
            }
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8855e;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 100 || intent == null) {
            int i3 = 2;
            if (i == 2 && intent != null) {
                if (intent.getBooleanExtra("key_result_is_open", true)) {
                    i3 = 1;
                }
                int intExtra = intent.getIntExtra("key_result_selected_user_id", 0);
                boolean booleanExtra = intent.getBooleanExtra("key_result_user_info_list_been_modified", false);
                C51793w7 w7Var = this.f49769u;
                if (w7Var == null) {
                    return;
                }
                if (this.f49771w != intExtra || w7Var.f143898f != i3 || booleanExtra) {
                    MMHandlerThread.postToMainThread(new C18029g(this));
                    this.f49773y = true;
                    this.f49771w = intExtra;
                    this.f49769u.f143898f = i3;
                    Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo select id" + this.f49771w);
                    Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo main switch state" + this.f49769u.f143898f);
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add("scope.userInfo");
                    mo22476X7(arrayList, new AppBrandAuthorizeUI$$d(this));
                }
            } else if (i == 3 && intent != null) {
                if (intent.getBooleanExtra("key_result_is_open", true)) {
                    i3 = 1;
                }
                int intExtra2 = intent.getIntExtra("key_result_selected_user_id", 0);
                boolean booleanExtra2 = intent.getBooleanExtra("key_result_user_info_list_been_modified", false);
                C51793w7 w7Var2 = this.f49770v;
                if (w7Var2 == null) {
                    return;
                }
                if (this.f49772x != intExtra2 || w7Var2.f143898f != i3 || booleanExtra2) {
                    MMHandlerThread.postToMainThread(new C18029g(this));
                    this.f49773y = true;
                    this.f49772x = intExtra2;
                    this.f49770v.f143898f = i3;
                    Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo select id" + this.f49772x);
                    Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "userinfo main switch state" + this.f49770v.f143898f);
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add("scope.userProfileChange");
                    mo22476X7(arrayList2, new AppBrandAuthorizeUI$$e(this));
                }
            }
        } else {
            SubscribeMsgSettingData subscribeMsgSettingData = (SubscribeMsgSettingData) intent.getParcelableExtra("key_biz_data");
            if (subscribeMsgSettingData != null) {
                ((C23114b) C86312j.m106911c(C23114b.class)).mo36106r7(this.f49759h, subscribeMsgSettingData, this, new C18033o(this));
                MMHandlerThread.postToMainThread(new C18029g(this));
            }
        }
    }

    public void onBackPressed() {
        mo22477Y7();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        this.f49748Q = new AppBrandAuthorizeUI$$q(this);
        String stringExtra = getIntent().getStringExtra("key_username");
        this.f49759h = stringExtra;
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "username is null");
            finish();
            return;
        }
        WxaProfileAttributes b = C81661j.m100177b(this.f49759h, false);
        this.f49760i = b;
        if (b == null) {
            Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "attrs is null");
            finish();
            return;
        }
        this.f49733A = getIntent().getBooleanExtra("key_app_authorize_jsapi", false);
        this.f49734B = getIntent().getBooleanExtra("key_app_authorize_profile", false);
        setMMTitle((int) C0966R.string.f7618lm);
        setBackBtn(new AppBrandAuthorizeUI$$j(this));
        this.f49761j = getPreferenceScreen();
        WxaProfileAttributes wxaProfileAttributes = this.f49760i;
        this.f49757f = wxaProfileAttributes.f239576e;
        this.f49758g = wxaProfileAttributes.f239582n;
        this.f49749R = C81161g2.Ax0().mo113793bD(this.f49759h, this.f49758g);
        String str = this.f49757f;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new r45();
        bVar.f127067b = new s45();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp_getauthinfo";
        bVar.f127069d = FaceManager.FACE_ACQUIRED_UP;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        r45 r45 = new r45();
        r45.f140693d = str;
        r45.f140694e = C53173v.f148355a.mo73862a(str);
        bVar.f127066a = r45;
        C89144l0.m111430f(bVar.mo72403a(), new C40550f(this), true, this);
        String str2 = this.f49757f;
        C39634b.f106396a.clear();
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new f65();
        bVar2.f127067b = new g65();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/wxaapp_getvoipdevicelist";
        bVar2.f127069d = 4892;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        f65 f65 = new f65();
        f65.f133321d = str2;
        bVar2.f127066a = f65;
        C89144l0.m111430f(bVar2.mo72403a(), new C40554s(this), true, this);
        String str3 = this.f49733A ? "1" : this.f49734B ? "3" : "2";
        Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "report enter authorize page:%s", str3);
        C29452i.m38741a(this.f49757f, this.f49758g, System.currentTimeMillis(), 1, str3, 0);
        ((C23114b) C86312j.m106911c(C23114b.class)).mo36104hO(this.f49759h, this, new C18042t(this));
        if (mo22478Z7()) {
            mo22473U7();
        }
        this.f49754W.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f49754W.dead();
        C45152a0 a0Var = C45152a0.f122426a;
        String str = this.f49757f;
        Log.m105924i("MicroMsg.AppBrand.UserInfoRevokeRepository", "invalidateCachedUsageInfo, appId: " + str);
        if (str != null) {
            ((HashMap) C45152a0.f122427b).remove(str);
        }
    }

    public void onPause() {
        if (this.f49773y) {
            Log.m105918d("MicroMsg.AppBrandAuthorizeUI", "onPause, key changed!");
        }
        super.onPause();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C47511g gVar2 = gVar;
        Preference preference2 = preference;
        Class<AppBrandPrivacyPageContainerUI> cls = AppBrandPrivacyPageContainerUI.class;
        Class<C75339i> cls2 = C75339i.class;
        Class<AppBrandAuthorizeDetailUI> cls3 = AppBrandAuthorizeDetailUI.class;
        Log.m105919d("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, key:%s", preference2.f121285r);
        if (this.f49755d == null) {
            Log.m105928w("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, authItem is null");
            return false;
        }
        String str = preference2.f121285r;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, key is null");
            return false;
        }
        Class<AppBrandPrivacyPageContainerUI> cls4 = cls;
        Class<C75339i> cls5 = cls2;
        if (str.equalsIgnoreCase("scope.userLocation")) {
            if (this.f49766r == null || this.f49760i == null) {
                Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, auth item location or attrs is null");
                return false;
            }
            int W7 = mo22475W7();
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, current location state:%s", Integer.valueOf(W7));
            mmSetOnActivityResultCallback(new C18034p(this, W7));
            Intent intent = new Intent(this, cls3);
            intent.putExtra("key_title", this.f49766r.f143897e);
            intent.putExtra("key_desc", getString(C0966R.string.a0v));
            intent.putExtra("key_desc_oversea", getString(C0966R.string.mzs));
            intent.putExtra("key_desc_oversea_for_location", C45628s0.m50756U());
            intent.putExtra("key_has_prefix", false);
            intent.putExtra("key_state", W7);
            intent.putExtra("key_three_state", this.f49735C);
            C88144b.m109795m(this, XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandAuthorizeDetailUI", intent, 1);
            String str2 = this.f49735C ? "1" : "2";
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "report click location auth item:%s", str2);
            C29452i.m38741a(this.f49757f, this.f49758g, System.currentTimeMillis(), 2, str2, 0);
            return false;
        } else if (str.equalsIgnoreCase("scope.userFuzzyLocation")) {
            C51793w7 w7Var = this.f49768t;
            if (w7Var == null || this.f49760i == null) {
                Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, auth item location or attrs is null");
                return false;
            }
            int i = w7Var.f143898f;
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, current location state:%s", Integer.valueOf(i));
            mmSetOnActivityResultCallback(new C18037q(this, i));
            Intent intent2 = new Intent(this, cls3);
            intent2.putExtra("key_title", this.f49768t.f143897e);
            intent2.putExtra("key_desc", getString(C0966R.string.f7623al));
            intent2.putExtra("key_desc_oversea", getString(C0966R.string.mzr));
            intent2.putExtra("key_desc_oversea_for_location", C45628s0.m50756U());
            intent2.putExtra("key_has_prefix", false);
            intent2.putExtra("key_state", i == 1 ? 1 : 0);
            intent2.putExtra("key_three_state", false);
            C88144b.m109795m(this, XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandAuthorizeDetailUI", intent2, 5);
            return false;
        } else if (str.equalsIgnoreCase("scope.bluetooth")) {
            if (this.f49739G == null || this.f49760i == null) {
                Log.m105924i("MicroMsg.AppBrandAuthorizeUI", "onClickBluetoothPreference, auth item bluetooth or attrs is null");
                return false;
            }
            int V7 = mo22474V7();
            Log.m105925i("MicroMsg.AppBrandAuthorizeUI", "onClickBluetoothPreference, current bluetooth state:%s", Integer.valueOf(V7));
            mmSetOnActivityResultCallback(new AppBrandAuthorizeUI$$a(this, V7));
            Intent intent3 = new Intent(this, cls3);
            intent3.putExtra("key_title", this.f49739G.f143897e);
            intent3.putExtra("key_desc", this.f49739G.f143900h);
            intent3.putExtra("key_state", V7);
            intent3.putExtra("key_three_state", this.f49741I);
            intent3.putExtra("key_override_authorize_usage_desc", this.f49739G.f143900h);
            intent3.putExtra("key_override_authorize_both_desc", getString(C0966R.string.bhr));
            intent3.putExtra("key_override_authorize_option_order", new int[]{1, 2, 0});
            C88144b.m109795m(this, XWalkEnvironment.MODULE_APPBRAND, ".ui.AppBrandAuthorizeDetailUI", intent3, 4);
            return false;
        } else if (str.equalsIgnoreCase("scope.userInfo")) {
            if (this.f49769u == null) {
                return true;
            }
            Intent intent4 = new Intent(this, AppBrandUserInfoAuthorizeUI.class);
            intent4.putExtra("key_app_id", this.f49757f);
            intent4.putExtra("key_nickname", ((C75339i) C86312j.m106911c(cls5)).getDisplayName(this.f49759h));
            intent4.putExtra("key_user_info", this.f49746N);
            intent4.putExtra("key_is_state_open", this.f49769u.f143898f == 1);
            startActivityForResult(intent4, 2);
            return true;
        } else if ("scope.userProfileChange".equals(str)) {
            if (this.f49770v == null) {
                return true;
            }
            Intent intent5 = new Intent(this, AppBrandUserProfileAuthorizeUI.class);
            intent5.putExtra("key_app_id", this.f49757f);
            intent5.putExtra("key_nickname", ((C75339i) C86312j.m106911c(cls5)).getDisplayName(this.f49759h));
            intent5.putExtra("key_user_info", this.f49747P);
            intent5.putExtra("key_is_state_open", this.f49770v.f143898f == 1);
            startActivityForResult(intent5, 3);
            return true;
        } else if ("preference_key_subscribe_msg".equals(str)) {
            Intent intent6 = new Intent();
            intent6.setClassName(this, "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI");
            intent6.putExtra("key_biz_username", this.f49759h);
            intent6.putExtra("key_biz_presenter_class", ((C23114b) C86312j.m106911c(C23114b.class)).mo36107u7());
            intent6.putExtra("key_biz_nickname", ((C75339i) C86312j.m106911c(cls5)).getDisplayName(this.f49759h));
            intent6.putExtra("key_biz_data", this.f49745M);
            startActivityForResult(intent6, 100);
            return true;
        } else if ("preference_key_notify_msg".equals(str)) {
            String str3 = this.f49757f;
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference;
            LinkedList<s65> linkedList = new LinkedList<>();
            s65 s65 = new s65();
            s65.f141352d = str3;
            s65.f141353e = checkBoxPreference.mo6804J() ^ true ? 1 : 0;
            linkedList.add(s65);
            C49654h34 h342 = new C49654h34();
            h342.f134432d = linkedList;
            h342.f134433e = 2;
            MMHandlerThread.postToMainThread(new C18029g(this));
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127067b = new C49795i34();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/setwxamsgconfig";
            bVar.f127069d = 3872;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            bVar.f127066a = h342;
            C89144l0.m111430f(bVar.mo72403a(), new C68650j(this, checkBoxPreference, linkedList, str3), true, this);
            return true;
        } else {
            Preference preference3 = preference;
            String str4 = XWalkEnvironment.MODULE_APPBRAND;
            if ("preference_key_user_info".equals(str)) {
                String str5 = this.f49757f;
                int i2 = AppBrandUserInfoRevokePage.f108928f;
                Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "start, appId: " + str5);
                if (str5 == null) {
                    return true;
                }
                C53895h.m60466d(C54218t.m60906a(this), (C66212f) null, (C53934p0) null, new C45154b(str5, (C15601d<? super C45154b>) null), 3, (Object) null);
                Intent intent7 = new Intent(this, cls4);
                C39635c.m42239c(intent7, AppBrandUserInfoRevokePage.class);
                intent7.putExtra("appId", str5);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent7);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$Companion", IXWebBroadcastListener.STAGE_START, "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$Companion", IXWebBroadcastListener.STAGE_START, "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            Class<AppBrandPrivacyPageContainerUI> cls6 = cls4;
            if ("preference_key_privacy_use_record".equals(str)) {
                String str6 = this.f49759h;
                int i3 = AppBrandPrivacyUseRecordPage.f108932e;
                Log.m105924i("MicroMsg.AppBrandPrivacyUseRecordPage", "start, username: " + str6);
                if (str6 == null) {
                    return true;
                }
                Intent intent8 = new Intent(this, cls6);
                C39635c.m42239c(intent8, AppBrandPrivacyUseRecordPage.class);
                intent8.putExtra("username", str6);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent8);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$Companion", IXWebBroadcastListener.STAGE_START, "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$Companion", IXWebBroadcastListener.STAGE_START, "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            } else if ("preference_key_voip_device_list".equals(str)) {
                Intent intent9 = new Intent(this, AppBrandVoIPDeviceListAuthorizeUI.class);
                intent9.putExtra("key_title", preference.mo69928s());
                intent9.putExtra("appid", this.f49757f);
                C88144b.m109791i(this, str4, ".ui.AppBrandVoIPDeviceListAuthorizeUI", intent9, (Bundle) null);
                return true;
            } else if ("scope.devicePanel".equals(str)) {
                C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
                if (x0Var == null) {
                    Log.m105920e("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, appLauncher is null");
                    return true;
                }
                C86299o oVar = new C86299o();
                oVar.f250930b = "wxb6d22f922f37b35a";
                oVar.f250932d = 0;
                oVar.f250934f = String.format(Locale.US, "/packages/settings/pages/device/device.html?appid=%s", new Object[]{this.f49757f});
                oVar.f250939k = 1247;
                x0Var.mo106898tv(this, oVar);
                return true;
            } else {
                for (C51793w7 next : this.f49755d) {
                    if (str.equals(Util.nullAsNil(next.f143896d))) {
                        this.f49773y = true;
                        if (((CheckBoxPreference) preference3).mo6804J()) {
                            next.f143898f = 1;
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(str);
                            mo22476X7(arrayList, new AppBrandAuthorizeUI$$k(this, preference3, gVar, next));
                        } else {
                            C47511g gVar3 = gVar;
                            if (this.f49774z) {
                                this.f49774z = false;
                                C78471a.f229885a.mo108406a(this, new AppBrandAuthorizeUI$$l(this, next, str, preference, gVar), new AppBrandAuthorizeUI$$m(this, next, preference3, gVar3), new AppBrandAuthorizeUI$$n(this, next, preference3, gVar3));
                            } else {
                                next.f143898f = 2;
                                ArrayList arrayList2 = new ArrayList(1);
                                arrayList2.add(str);
                                mo22476X7(arrayList2, new AppBrandAuthorizeUI$$o(this, preference3, gVar3, next));
                            }
                        }
                    } else {
                        C47511g gVar4 = gVar;
                    }
                }
                return false;
            }
        }
    }

    public void onResume() {
        C47511g gVar;
        C47511g gVar2;
        super.onResume();
        if (this.f49752U) {
            this.f49752U = false;
            return;
        }
        this.f49749R = C81161g2.Ax0().mo113793bD(this.f49759h, this.f49758g);
        if (!mo22478Z7() && (gVar2 = this.f49761j) != null && gVar2.mo72519a("preference_key_notify_msg") != null) {
            this.f49761j.mo72531o("preference_key_notify_msg");
        } else if (mo22478Z7() && (gVar = this.f49761j) != null && gVar.mo72519a("preference_key_notify_msg") == null) {
            mo22473U7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$AuthStateChangedByUserEvent */
    public static final class AuthStateChangedByUserEvent implements Parcelable {
        public static final Parcelable.Creator<AuthStateChangedByUserEvent> CREATOR = new C18022a();

        /* renamed from: d */
        public boolean f49776d;

        /* renamed from: e */
        public boolean f49777e;

        /* renamed from: f */
        public boolean f49778f;

        /* renamed from: g */
        public boolean f49779g;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$AuthStateChangedByUserEvent$a */
        public class C18022a implements Parcelable.Creator<AuthStateChangedByUserEvent> {
            public Object createFromParcel(Parcel parcel) {
                return new AuthStateChangedByUserEvent(parcel);
            }

            public Object[] newArray(int i) {
                return new AuthStateChangedByUserEvent[i];
            }
        }

        public AuthStateChangedByUserEvent() {
            this.f49776d = false;
            this.f49777e = false;
            this.f49778f = false;
            this.f49779g = false;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f49776d ? (byte) 1 : 0);
            parcel.writeByte(this.f49777e ? (byte) 1 : 0);
            parcel.writeByte(this.f49778f ? (byte) 1 : 0);
            parcel.writeByte(this.f49779g ? (byte) 1 : 0);
        }

        public AuthStateChangedByUserEvent(Parcel parcel) {
            boolean z = true;
            this.f49776d = parcel.readByte() != 0;
            this.f49777e = parcel.readByte() != 0;
            this.f49778f = parcel.readByte() != 0;
            this.f49779g = parcel.readByte() == 0 ? false : z;
        }
    }
}
