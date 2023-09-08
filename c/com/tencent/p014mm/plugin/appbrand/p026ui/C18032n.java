package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.msgsubscription.presenter.SubscribeMsgSettingData;
import java.util.List;
import te3.v75;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.n */
public class C18032n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List f49833d;

    /* renamed from: e */
    public final /* synthetic */ SubscribeMsgSettingData f49834e;

    /* renamed from: f */
    public final /* synthetic */ v75 f49835f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandAuthorizeUI f49836g;

    public C18032n(AppBrandAuthorizeUI appBrandAuthorizeUI, List list, SubscribeMsgSettingData subscribeMsgSettingData, v75 v75) {
        this.f49836g = appBrandAuthorizeUI;
        this.f49833d = list;
        this.f49834e = subscribeMsgSettingData;
        this.f49835f = v75;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.tencent.mm.ui.base.preference.Preference} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r0 = r17
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r1 = r0.f49836g
            java.util.List r2 = r0.f49833d
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData r3 = r0.f49834e
            te3.v75 r4 = r0.f49835f
            java.lang.String[] r5 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.f49731X
            r1.getClass()
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r7 = r2.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "MicroMsg.AppBrandAuthorizeUI"
            java.lang.String r9 = "updatePreferencesInternal, authItems size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r6)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            if (r3 == 0) goto L_0x0065
            boolean r9 = r3.f49050d
            if (r9 == 0) goto L_0x0065
            com.tencent.mm.ui.base.preference.Preference r9 = new com.tencent.mm.ui.base.preference.Preference
            r9.<init>(r1)
            r9.f121290w = r8
            java.lang.String r10 = "preference_key_subscribe_msg"
            r9.mo26273A(r10)
            androidx.appcompat.app.AppCompatActivity r10 = r1.getContext()
            r11 = 2131821964(0x7f11058c, float:1.9276686E38)
            java.lang.String r10 = r10.getString(r11)
            r9.mo69924H(r10)
            boolean r3 = r3.f49051e
            if (r3 == 0) goto L_0x0052
            java.lang.String r3 = ""
            goto L_0x005d
        L_0x0052:
            androidx.appcompat.app.AppCompatActivity r3 = r1.getContext()
            r10 = 2131821965(0x7f11058d, float:1.9276688E38)
            java.lang.String r3 = r3.getString(r10)
        L_0x005d:
            r9.mo7741E(r3)
            java.lang.String r3 = r9.f121285r
            r6.put(r3, r9)
        L_0x0065:
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r3 = r2.hasNext()
            java.lang.String r9 = "scope.devicePanel"
            r10 = 2
            if (r3 == 0) goto L_0x023a
            java.lang.Object r3 = r2.next()
            te3.w7 r3 = (te3.C51793w7) r3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = r3.f143896d
            r10[r8] = r11
            int r11 = r3.f143898f
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r5] = r11
            java.lang.String r11 = "updatePreferencesInternal, find scope:%s, state:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r10)
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x00a3
            java.lang.String r10 = r3.f143896d
            java.lang.String r11 = "scope.userLocationBackground"
            boolean r10 = r10.equalsIgnoreCase(r11)
            if (r10 == 0) goto L_0x00a3
            r1.f49767s = r3
            goto L_0x0069
        L_0x00a3:
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x00dc
            java.lang.String r10 = r3.f143896d
            java.lang.String r11 = "scope.userLocation"
            boolean r10 = r10.equalsIgnoreCase(r11)
            if (r10 == 0) goto L_0x00dc
            r1.f49766r = r3
            com.tencent.mm.ui.base.preference.Preference r9 = new com.tencent.mm.ui.base.preference.Preference
            r9.<init>(r1)
            r1.f49762n = r9
            r9.f121290w = r8
            java.lang.String r10 = r3.f143896d
            r9.mo26273A(r10)
            com.tencent.mm.ui.base.preference.Preference r9 = r1.f49762n
            java.lang.String r10 = r3.f143900h
            r9.mo7741E(r10)
            com.tencent.mm.ui.base.preference.Preference r9 = r1.f49762n
            java.lang.String r3 = r3.f143897e
            r9.mo69924H(r3)
            com.tencent.mm.ui.base.preference.Preference r3 = r1.f49762n
            java.lang.String r9 = r3.f121285r
            r6.put(r9, r3)
            goto L_0x0069
        L_0x00dc:
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0116
            java.lang.String r10 = r3.f143896d
            java.lang.String r11 = "scope.userFuzzyLocation"
            boolean r10 = r10.equalsIgnoreCase(r11)
            if (r10 == 0) goto L_0x0116
            r1.f49768t = r3
            com.tencent.mm.ui.base.preference.Preference r9 = new com.tencent.mm.ui.base.preference.Preference
            r9.<init>(r1)
            r1.f49763o = r9
            r9.f121290w = r8
            java.lang.String r10 = r3.f143896d
            r9.mo26273A(r10)
            com.tencent.mm.ui.base.preference.Preference r9 = r1.f49763o
            java.lang.String r10 = r3.f143900h
            r9.mo7741E(r10)
            com.tencent.mm.ui.base.preference.Preference r9 = r1.f49763o
            java.lang.String r3 = r3.f143897e
            r9.mo69924H(r3)
            com.tencent.mm.ui.base.preference.Preference r3 = r1.f49763o
            java.lang.String r9 = r3.f121285r
            r6.put(r9, r3)
            goto L_0x0069
        L_0x0116:
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x012d
            java.lang.String r10 = r3.f143896d
            java.lang.String r11 = "scope.bluetoothBackground"
            boolean r10 = r10.equalsIgnoreCase(r11)
            if (r10 == 0) goto L_0x012d
            r1.f49740H = r3
            goto L_0x0069
        L_0x012d:
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0167
            java.lang.String r10 = r3.f143896d
            java.lang.String r11 = "scope.bluetooth"
            boolean r10 = r10.equalsIgnoreCase(r11)
            if (r10 == 0) goto L_0x0167
            r1.f49739G = r3
            com.tencent.mm.ui.base.preference.Preference r9 = new com.tencent.mm.ui.base.preference.Preference
            r9.<init>(r1)
            r1.f49738F = r9
            r9.f121290w = r8
            java.lang.String r10 = r3.f143896d
            r9.mo26273A(r10)
            com.tencent.mm.ui.base.preference.Preference r9 = r1.f49738F
            java.lang.String r10 = r3.f143900h
            r9.mo7741E(r10)
            com.tencent.mm.ui.base.preference.Preference r9 = r1.f49738F
            java.lang.String r3 = r3.f143897e
            r9.mo69924H(r3)
            com.tencent.mm.ui.base.preference.Preference r3 = r1.f49738F
            java.lang.String r9 = r3.f121285r
            r6.put(r9, r3)
            goto L_0x0069
        L_0x0167:
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r11 = "scope userinfo's UserAvatarInfo is null, can not be add into Preference"
            if (r10 != 0) goto L_0x01a1
            java.lang.String r10 = r3.f143896d
            java.lang.String r12 = "scope.userInfo"
            boolean r10 = r10.equalsIgnoreCase(r12)
            if (r10 == 0) goto L_0x01a1
            com.tencent.mm.ui.base.preference.IconPreference r9 = r1.f49764p
            if (r9 != 0) goto L_0x0188
            com.tencent.mm.ui.base.preference.IconPreference r9 = new com.tencent.mm.ui.base.preference.IconPreference
            r9.<init>(r1)
            r1.f49764p = r9
        L_0x0188:
            te3.mo4 r9 = r3.f143899g
            if (r9 != 0) goto L_0x0191
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            goto L_0x0069
        L_0x0191:
            com.tencent.mm.ui.base.preference.IconPreference r9 = r1.f49764p
            r9.f121290w = r8
            r1.mo22482d8(r9, r3)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r1.f49764p
            java.lang.String r9 = r3.f121285r
            r6.put(r9, r3)
            goto L_0x0069
        L_0x01a1:
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x01d2
            java.lang.String r10 = r3.f143896d
            java.lang.String r12 = "scope.userProfileChange"
            boolean r10 = r10.equalsIgnoreCase(r12)
            if (r10 == 0) goto L_0x01d2
            com.tencent.mm.ui.base.preference.IconPreference r9 = new com.tencent.mm.ui.base.preference.IconPreference
            r9.<init>(r1)
            r1.f49765q = r9
            te3.mo4 r10 = r3.f143899g
            if (r10 != 0) goto L_0x01c4
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            goto L_0x0069
        L_0x01c4:
            r9.f121290w = r8
            r1.mo22483e8(r9, r3)
            com.tencent.mm.ui.base.preference.IconPreference r3 = r1.f49765q
            java.lang.String r9 = r3.f121285r
            r6.put(r9, r3)
            goto L_0x0069
        L_0x01d2:
            java.lang.String r10 = r3.f143896d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0214
            java.lang.String r10 = r3.f143896d
            boolean r9 = r10.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x0214
            com.tencent.mm.ui.base.preference.RightBelowPreference r9 = new com.tencent.mm.ui.base.preference.RightBelowPreference
            r9.<init>(r1)
            r9.f121290w = r8
            java.lang.String r10 = r3.f143896d
            r9.mo26273A(r10)
            java.lang.String r10 = r3.f143897e
            r9.mo69924H(r10)
            java.lang.String r10 = r3.f143900h
            r9.mo7741E(r10)
            int r3 = r3.f143898f
            if (r3 != r5) goto L_0x0204
            r3 = 2131821008(0x7f1101d0, float:1.9274747E38)
            java.lang.String r3 = r1.getString(r3)
            goto L_0x020b
        L_0x0204:
            r3 = 2131821002(0x7f1101ca, float:1.9274735E38)
            java.lang.String r3 = r1.getString(r3)
        L_0x020b:
            r9.f24287K = r3
            java.lang.String r3 = r9.f121285r
            r6.put(r3, r9)
            goto L_0x0069
        L_0x0214:
            com.tencent.mm.ui.base.preference.CheckBoxPreference r9 = new com.tencent.mm.ui.base.preference.CheckBoxPreference
            r9.<init>(r1)
            r9.f121290w = r8
            java.lang.String r10 = r3.f143896d
            r9.mo26273A(r10)
            java.lang.String r10 = r3.f143897e
            r9.mo69924H(r10)
            java.lang.String r10 = r3.f143900h
            r9.mo7741E(r10)
            int r3 = r3.f143898f
            if (r3 != r5) goto L_0x0230
            r3 = 1
            goto L_0x0231
        L_0x0230:
            r3 = 0
        L_0x0231:
            r9.f24210J = r3
            java.lang.String r3 = r9.f121285r
            r6.put(r3, r9)
            goto L_0x0069
        L_0x023a:
            com.tencent.mm.ui.base.preference.Preference r2 = new com.tencent.mm.ui.base.preference.Preference
            r2.<init>(r1)
            r2.f121290w = r8
            java.lang.String r3 = "preference_key_voip_device_list"
            r2.mo26273A(r3)
            androidx.appcompat.app.AppCompatActivity r7 = r1.getContext()
            r11 = 2131821978(0x7f11059a, float:1.9276714E38)
            java.lang.String r7 = r7.getString(r11)
            r2.mo69924H(r7)
            java.lang.String r7 = r2.f121285r
            r6.put(r7, r2)
            boolean r2 = r1.mo22478Z7()
            if (r2 == 0) goto L_0x0284
            com.tencent.mm.ui.base.preference.CheckBoxPreference r2 = new com.tencent.mm.ui.base.preference.CheckBoxPreference
            r2.<init>(r1)
            r2.f121290w = r8
            java.lang.String r7 = "preference_key_notify_msg"
            r2.mo26273A(r7)
            boolean r7 = r1.f49750S
            r2.f24210J = r7
            androidx.appcompat.app.AppCompatActivity r7 = r1.getContext()
            r11 = 2131821882(0x7f11053a, float:1.927652E38)
            java.lang.String r7 = r7.getString(r11)
            r2.mo69924H(r7)
            java.lang.String r7 = r2.f121285r
            r6.put(r7, r2)
        L_0x0284:
            cs0.a0 r2 = cs0.C45152a0.f122426a
            boolean r2 = r2.mo70660e(r4)
            java.lang.String r4 = "preference_key_user_info"
            if (r2 == 0) goto L_0x02ac
            com.tencent.mm.ui.base.preference.Preference r2 = new com.tencent.mm.ui.base.preference.Preference
            r2.<init>(r1)
            r2.f121290w = r8
            r2.mo26273A(r4)
            androidx.appcompat.app.AppCompatActivity r7 = r1.getContext()
            r11 = 2131821760(0x7f1104c0, float:1.9276272E38)
            java.lang.String r7 = r7.getString(r11)
            r2.mo69924H(r7)
            java.lang.String r7 = r2.f121285r
            r6.put(r7, r2)
        L_0x02ac:
            com.tencent.mm.ui.base.preference.Preference r2 = new com.tencent.mm.ui.base.preference.Preference
            r2.<init>(r1)
            r2.f121290w = r8
            java.lang.String r7 = "preference_key_privacy_use_record"
            r2.mo26273A(r7)
            androidx.appcompat.app.AppCompatActivity r11 = r1.getContext()
            r12 = 2131821930(0x7f11056a, float:1.9276617E38)
            java.lang.String r11 = r11.getString(r12)
            r2.mo69924H(r11)
            java.lang.String r11 = r2.f121285r
            r6.put(r11, r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
            r8 = 0
            r14 = 0
            r15 = 0
        L_0x02e6:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x0342
            java.lang.Object r16 = r6.next()
            r5 = r16
            com.tencent.mm.ui.base.preference.Preference r5 = (com.tencent.p014mm.p136ui.base.preference.Preference) r5
            java.lang.String[] r16 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.f49732Y
            java.util.List r10 = java.util.Arrays.asList(r16)
            java.lang.String r13 = r5.f121285r
            boolean r10 = r10.contains(r13)
            if (r10 == 0) goto L_0x0308
            java.lang.String r10 = r5.f121285r
            r12.put(r10, r5)
            goto L_0x033f
        L_0x0308:
            java.lang.String[] r10 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.f49731X
            java.util.List r10 = java.util.Arrays.asList(r10)
            java.lang.String r13 = r5.f121285r
            boolean r10 = r10.contains(r13)
            if (r10 == 0) goto L_0x031c
            java.lang.String r10 = r5.f121285r
            r2.put(r10, r5)
            goto L_0x033f
        L_0x031c:
            java.lang.String r10 = r5.f121285r
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0326
            r14 = r5
            goto L_0x033f
        L_0x0326:
            java.lang.String r10 = r5.f121285r
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x0330
            r15 = r5
            goto L_0x033f
        L_0x0330:
            java.lang.String r10 = r5.f121285r
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x033a
            r8 = r5
            goto L_0x033f
        L_0x033a:
            java.lang.String r10 = r5.f121285r
            r11.put(r10, r5)
        L_0x033f:
            r5 = 1
            r10 = 2
            goto L_0x02e6
        L_0x0342:
            java.lang.String[] r4 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.f49731X
            r5 = 6
            r6 = 0
        L_0x0346:
            if (r6 >= r5) goto L_0x035a
            r7 = r4[r6]
            java.lang.Object r7 = r2.get(r7)
            com.tencent.mm.ui.base.preference.Preference r7 = (com.tencent.p014mm.p136ui.base.preference.Preference) r7
            if (r7 == 0) goto L_0x0357
            pj3.g r9 = r1.f49761j
            r9.mo72527k(r7)
        L_0x0357:
            int r6 = r6 + 1
            goto L_0x0346
        L_0x035a:
            java.util.Collection r2 = r11.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0362:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0374
            java.lang.Object r4 = r2.next()
            com.tencent.mm.ui.base.preference.Preference r4 = (com.tencent.p014mm.p136ui.base.preference.Preference) r4
            pj3.g r5 = r1.f49761j
            r5.mo72527k(r4)
            goto L_0x0362
        L_0x0374:
            int r2 = r12.size()
            if (r2 <= 0) goto L_0x0389
            pj3.g r2 = r1.f49761j
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r4 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            androidx.appcompat.app.AppCompatActivity r5 = r1.getContext()
            r6 = 0
            r4.<init>(r5, r6)
            r2.mo72527k(r4)
        L_0x0389:
            java.lang.String[] r2 = com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandAuthorizeUI.f49732Y
            r4 = 0
            r5 = 2
        L_0x038d:
            if (r4 >= r5) goto L_0x03a1
            r6 = r2[r4]
            java.lang.Object r6 = r12.get(r6)
            com.tencent.mm.ui.base.preference.Preference r6 = (com.tencent.p014mm.p136ui.base.preference.Preference) r6
            if (r6 == 0) goto L_0x039e
            pj3.g r7 = r1.f49761j
            r7.mo72527k(r6)
        L_0x039e:
            int r4 = r4 + 1
            goto L_0x038d
        L_0x03a1:
            if (r14 == 0) goto L_0x03b8
            pj3.g r2 = r1.f49761j
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r4 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            androidx.appcompat.app.AppCompatActivity r5 = r1.getContext()
            r6 = 0
            r4.<init>(r5, r6)
            r2.mo72527k(r4)
            pj3.g r2 = r1.f49761j
            r2.mo72527k(r14)
            goto L_0x03b9
        L_0x03b8:
            r6 = 0
        L_0x03b9:
            if (r15 == 0) goto L_0x03ce
            pj3.g r2 = r1.f49761j
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r4 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            androidx.appcompat.app.AppCompatActivity r5 = r1.getContext()
            r4.<init>(r5, r6)
            r2.mo72527k(r4)
            pj3.g r2 = r1.f49761j
            r2.mo72527k(r15)
        L_0x03ce:
            if (r8 == 0) goto L_0x03e3
            pj3.g r2 = r1.f49761j
            com.tencent.mm.ui.base.preference.PreferenceSmallCategory r4 = new com.tencent.mm.ui.base.preference.PreferenceSmallCategory
            androidx.appcompat.app.AppCompatActivity r5 = r1.getContext()
            r4.<init>(r5, r6)
            r2.mo72527k(r4)
            pj3.g r2 = r1.f49761j
            r2.mo72527k(r8)
        L_0x03e3:
            r1.mo22481c8()
            r1.mo22479a8()
            com.tencent.mm.ui.base.preference.Preference r2 = r1.f49763o
            if (r2 != 0) goto L_0x03ee
            goto L_0x0402
        L_0x03ee:
            te3.w7 r4 = r1.f49768t
            int r4 = r4.f143898f
            r5 = 1
            if (r4 == r5) goto L_0x03fc
            r4 = 2131821012(0x7f1101d4, float:1.9274755E38)
            r2.mo7740D(r4)
            goto L_0x0402
        L_0x03fc:
            r4 = 2131821011(0x7f1101d3, float:1.9274753E38)
            r2.mo7740D(r4)
        L_0x0402:
            pj3.g r2 = r1.f49761j
            r2.notifyDataSetChanged()
            java.util.LinkedList<te3.q40> r2 = r1.f49753V
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0415
            pj3.g r1 = r1.f49761j
            r2 = 1
            r1.mo72529n(r3, r2)
        L_0x0415:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C18032n.run():void");
    }
}
