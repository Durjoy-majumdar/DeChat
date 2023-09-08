package com.tencent.p014mm.plugin.nfc_open.p802ui;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.nfc_open.model.ApduEngineFuncListener;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import java.util.Iterator;
import java.util.List;
import kc2.C46686a;
import ke3.C88144b;
import mc2.C46992a;
import mc2.C46995d;
import nc2.C47222a;
import sc2.C13651a;
import te3.C49581gn;
import te3.C52063y33;

/* renamed from: com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI */
public class NfcWebViewUI extends WebViewUI {

    /* renamed from: L2 */
    public static final String f115239L2 = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/security/readtemplate?t=bus_recharge/index_error");

    /* renamed from: I2 */
    public String f115240I2 = null;

    /* renamed from: J2 */
    public boolean f115241J2 = false;

    /* renamed from: K2 */
    public ApduEngineFuncListener f115242K2 = new ApduEngineFuncListener();

    /* renamed from: com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI$a */
    public class C42591a implements MenuItem.OnMenuItemClickListener {
        public C42591a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NfcWebViewUI nfcWebViewUI = NfcWebViewUI.this;
            if (nfcWebViewUI.f115241J2) {
                nfcWebViewUI.mo66685K9();
                return true;
            }
            nfcWebViewUI.finish();
            return true;
        }
    }

    /* renamed from: I9 */
    public final boolean mo66683I9() {
        try {
            if (!this.f118511a1.mo68110Sl()) {
                return false;
            }
            Log.m105928w("MicroMsg.NfcWebViewUI", "not login");
            Intent intent = new Intent(this, getClass());
            intent.putExtras(getIntent());
            intent.addFlags(67108864);
            this.f118511a1.kk0(intent);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NfcWebViewUI", e, "", new Object[0]);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f9 A[SYNTHETIC, Splitter:B:34:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0123  */
    /* renamed from: J9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo66684J9(boolean r8) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            com.tencent.mm.plugin.webview.stub.l r1 = r7.f118511a1
            java.lang.String r2 = "MicroMsg.NfcWebViewUI"
            if (r1 != 0) goto L_0x000e
            java.lang.String r8 = "[NFC] invoker is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            return
        L_0x000e:
            com.tencent.mm.pluginsdk.ui.AutoLoginActivity$a r1 = com.tencent.p014mm.pluginsdk.p133ui.AutoLoginActivity.C72717a.LOGIN_OK
            android.content.Intent r3 = r7.getIntent()
            r7.mo66691Q9(r1, r3)
            java.lang.String r1 = "nfc-getNfcCpuCardGuideUrl start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 0
            r3 = 0
            com.tencent.mm.plugin.webview.stub.l r4 = r7.f118511a1     // Catch:{ RemoteException -> 0x0053 }
            r5 = 4006(0xfa6, float:5.614E-42)
            android.os.Bundle r4 = r4.mo68114V5(r5, r1)     // Catch:{ RemoteException -> 0x0053 }
            if (r4 != 0) goto L_0x0030
            java.lang.String r4 = "nfc-getNfcCpuCardGuideUrl data is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0079
        L_0x0030:
            java.lang.Class r5 = r7.getClass()     // Catch:{ RemoteException -> 0x0053 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ RemoteException -> 0x0053 }
            r4.setClassLoader(r5)     // Catch:{ RemoteException -> 0x0053 }
            java.lang.String r5 = "debugConfig"
            java.lang.String r5 = r4.getString(r5)     // Catch:{ RemoteException -> 0x0053 }
            java.lang.String r6 = "config"
            java.lang.String r4 = r4.getString(r6)     // Catch:{ RemoteException -> 0x0053 }
            if (r5 == 0) goto L_0x004e
            java.lang.String r1 = r7.mo66688N9(r5)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0060
        L_0x004e:
            java.lang.String r1 = r7.mo66687M9(r4)     // Catch:{ RemoteException -> 0x0053 }
            goto L_0x0060
        L_0x0053:
            r4 = move-exception
            java.lang.String r5 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r4, r0, r5)
        L_0x0060:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "nfc-getNfcCpuCardGuideUrl targetUrl="
            r4.append(r5)
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x0079:
            java.lang.String r4 = "rawUrl"
            if (r8 == 0) goto L_0x0112
            java.lang.String r8 = r7.mo6901n0()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x0112
            java.lang.String r8 = r7.mo6901n0()
            java.lang.String r5 = f115239L2
            boolean r8 = r8.startsWith(r5)
            if (r8 == 0) goto L_0x00b9
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r8 == 0) goto L_0x00a1
            java.lang.String r8 = "[NFC] carGuideUrl not found! not support this card ?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            goto L_0x0119
        L_0x00a1:
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r3] = r1
            java.lang.String r0 = "alvinluo [NFC] cardGuideUrl: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r8)
            android.content.Intent r8 = r7.getIntent()
            r8.putExtra(r4, r1)
            com.tencent.mm.plugin.webview.core.y r8 = r7.f118513b1
            r0 = -1
            r8.mo67706Z0(r1, r3, r0)
            goto L_0x0119
        L_0x00b9:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ RemoteException -> 0x0106 }
            if (r8 != 0) goto L_0x00f6
            android.net.Uri r8 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = r7.mo6901n0()     // Catch:{ Exception -> 0x00f5 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r8 = r8.getHost()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r1 = r1.getHost()     // Catch:{ Exception -> 0x00f5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f5 }
            r4.<init>()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = "targetHost="
            r4.append(r5)     // Catch:{ Exception -> 0x00f5 }
            r4.append(r8)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = ", curHost="
            r4.append(r5)     // Catch:{ Exception -> 0x00f5 }
            r4.append(r1)     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00f5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ Exception -> 0x00f5 }
            boolean r8 = r8.equals(r1)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00f7
        L_0x00f5:
        L_0x00f6:
            r8 = 0
        L_0x00f7:
            if (r8 == 0) goto L_0x010c
            com.tencent.mm.plugin.webview.stub.m r8 = r7.f118492T1     // Catch:{ RemoteException -> 0x0106 }
            r1 = 4007(0xfa7, float:5.615E-42)
            android.os.Bundle r4 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0106 }
            r4.<init>()     // Catch:{ RemoteException -> 0x0106 }
            r8.callback(r1, r4)     // Catch:{ RemoteException -> 0x0106 }
            goto L_0x010c
        L_0x0106:
            r8 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r8, r0, r1)
        L_0x010c:
            java.lang.String r8 = "[NFC]new intent not guide the page"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            return
        L_0x0112:
            android.content.Intent r8 = r7.getIntent()
            r8.putExtra(r4, r1)
        L_0x0119:
            java.lang.String r8 = r7.mo6901n0()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 == 0) goto L_0x0133
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = r7.mo66689O9(r3)
            r8.putExtra(r4, r0)
            java.lang.String r8 = "[NFC] url not found! not support this card ?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
        L_0x0133:
            com.tencent.mm.plugin.webview.core.y r8 = r7.f118513b1
            android.content.Intent r0 = r7.getIntent()
            r8.mo67677I(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.nfc_open.p802ui.NfcWebViewUI.mo66684J9(boolean):void");
    }

    /* renamed from: K9 */
    public final void mo66685K9() {
        Intent intent = new Intent();
        intent.addFlags(67108864);
        C88144b.m109801s(this, "com.tencent.mm.ui.LauncherUI", intent, (Bundle) null);
        finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2461dn);
        Log.m105924i("MicroMsg.NfcWebViewUI", "lo-nfc-setBackBtn:back click after login");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0062 A[RETURN] */
    /* renamed from: L9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo66686L9(kc2.C46686a r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.NfcWebViewUI"
            java.lang.String r1 = "nfc-doCmd start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            mc2.a r1 = mc2.C46992a.m52304c()
            r1.getClass()
            lc2.a r2 = new lc2.a
            r3 = 1
            java.lang.String r4 = "def"
            r2.<init>(r3, r4, r6)
            r1.mo72180b(r2)
            kc2.c r6 = r2.f126007g
            java.lang.String r6 = r6.toString()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            r2 = 0
            if (r1 == 0) goto L_0x0028
            goto L_0x005e
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "nfc-judge mAnwser = "
            r1.append(r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            r1.append(r4)
            java.lang.String r4 = " resp = "
            r1.append(r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            r0 = 2
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7, r0)
            java.util.regex.Matcher r6 = r7.matcher(r6)
            boolean r6 = r6.find()
            if (r6 == 0) goto L_0x005e
            r6 = 1
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            if (r6 == 0) goto L_0x0062
            return r3
        L_0x0062:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.nfc_open.p802ui.NfcWebViewUI.mo66686L9(kc2.a, java.lang.String):boolean");
    }

    /* renamed from: M9 */
    public final String mo66687M9(String str) {
        Log.m105924i("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl start");
        this.f115240I2 = "";
        C52063y33 y332 = new C52063y33();
        if (!Util.isNullOrNil(str)) {
            try {
                y332.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
                if (y332.f145097d != null) {
                    boolean z = false;
                    for (int i = 0; i < y332.f145097d.size(); i++) {
                        C49581gn gnVar = y332.f145097d.get(i);
                        C46995d dVar = C46992a.m52304c().f126350d;
                        if (dVar != null) {
                            dVar.mo72184b();
                        }
                        if (gnVar != null && !Util.isNullOrNil(gnVar.f134129e) && !Util.isNullOrNil((List) gnVar.f134128d)) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= gnVar.f134128d.size()) {
                                    break;
                                }
                                if (!Util.isNullOrNil((List) gnVar.f134128d.get(i2).f142513d)) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= gnVar.f134128d.get(i2).f142513d.size()) {
                                            break;
                                        }
                                        if (gnVar.f134128d.get(i2).f142513d.get(i3) != null && !Util.isNullOrNil(gnVar.f134128d.get(i2).f142513d.get(i3).f138810d) && !Util.isNullOrNil(gnVar.f134128d.get(i2).f142513d.get(i3).f138811e)) {
                                            String str2 = gnVar.f134128d.get(i2).f142513d.get(i3).f138810d;
                                            String str3 = gnVar.f134128d.get(i2).f142513d.get(i3).f138811e;
                                            Log.m105918d("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl cmd = " + str2 + " anwser = " + str3);
                                            if (!mo66686L9(new C46686a(C47222a.m52528b(str2)), str3)) {
                                                z = false;
                                                break;
                                            }
                                            z = true;
                                        }
                                        i3++;
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (z) {
                                String str4 = gnVar.f134129e;
                                Log.m105924i("MicroMsg.NfcWebViewUI", "doCardTypeReport start");
                                ThreadPool.post(new C13651a(this, str4), getClass().getName());
                                return gnVar.f134129e;
                            }
                        }
                    }
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.NfcWebViewUI", e, "", new Object[0]);
                Log.m105920e("MicroMsg.NfcWebViewUI", "[NFC] Common get nfc card type exception!" + e.toString());
                int d = C46992a.m52304c().mo72181d(getContext());
                Log.m105920e("MicroMsg.NfcWebViewUI", "isConnect:" + d);
                String O9 = mo66689O9(1);
                this.f115240I2 = O9;
                return O9;
            }
        }
        return this.f115240I2;
    }

    /* renamed from: N9 */
    public final String mo66688N9(String str) {
        Log.m105924i("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl start");
        this.f115240I2 = "";
        try {
            String[] split = str.split(" ");
            if (split != null && split.length > 1) {
                int i = 0;
                boolean z = false;
                while (true) {
                    if (i >= split.length - 1) {
                        break;
                    }
                    String str2 = split[i];
                    int i2 = i + 1;
                    String str3 = split[i2];
                    Log.m105918d("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl cmd = " + str2 + " anwser = " + str3);
                    z = mo66686L9(new C46686a(C47222a.m52528b(str2)), str3);
                    if (!z) {
                        break;
                    }
                    i = i2 + 1;
                }
                if (z) {
                    this.f115240I2 = split[split.length - 1];
                    Log.m105918d("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl tempurl = " + this.f115240I2);
                    return this.f115240I2;
                }
            }
            return this.f115240I2;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.NfcWebViewUI", e, "", new Object[0]);
            Log.m105920e("MicroMsg.NfcWebViewUI", "[NFC] Debug get nfc card type exception!" + e.toString());
            int d = C46992a.m52304c().mo72181d(getContext());
            Log.m105920e("MicroMsg.NfcWebViewUI", "isConnect:" + d);
            String O9 = mo66689O9(1);
            this.f115240I2 = O9;
            return O9;
        }
    }

    /* renamed from: O9 */
    public final String mo66689O9(int i) {
        StringBuilder sb = new StringBuilder(f115239L2);
        sb.append("&type=");
        sb.append(i);
        String str = "zh_CN";
        if (ChannelUtil.isNokiaAol || !LocaleUtil.getApplicationLanguage().equals(str)) {
            str = LocaleUtil.isTraditionalChineseAppLang() ? "zh_TW" : "en";
        }
        sb.append("&lang=");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: P9 */
    public final boolean mo66690P9(Intent intent) {
        if (intent == null) {
            Log.m105920e("MicroMsg.NfcWebViewUI", "intent is null");
            return true;
        }
        try {
            Iterator<String> it = intent.getExtras().keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next != null && !next.startsWith("android.nfc")) {
                    Log.m105920e("MicroMsg.NfcWebViewUI", "extra wrong key = " + next);
                    it.remove();
                }
            }
            Tag tag = null;
            Parcelable parcelableExtra = IntentUtil.getParcelableExtra(intent, "android.nfc.extra.TAG");
            if (parcelableExtra != null && (parcelableExtra instanceof Tag)) {
                tag = (Tag) parcelableExtra;
            }
            if (tag != null) {
                return false;
            }
            Log.m105920e("MicroMsg.NfcWebViewUI", "tag is null");
            return true;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NfcWebViewUI", "judgeIllegalCall e:%s", e);
            return true;
        }
    }

    /* renamed from: Q9 */
    public void mo66691Q9(AutoLoginActivity.C72717a aVar, Intent intent) {
        if (aVar.ordinal() != 0) {
            finish();
            return;
        }
        Tag tag = null;
        Parcelable parcelableExtra = IntentUtil.getParcelableExtra(intent, "android.nfc.extra.TAG");
        if (parcelableExtra != null && (parcelableExtra instanceof Tag)) {
            tag = (Tag) parcelableExtra;
        }
        if (tag == null) {
            Log.m105920e("MicroMsg.NfcWebViewUI", "[NFC]tag is null");
            return;
        }
        try {
            C46992a.m52304c().mo72182e(tag);
            int a = C46992a.m52304c().mo72179a(getContext());
            Log.m105924i("MicroMsg.NfcWebViewUI", "[NFC] connect status : " + a);
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.NfcWebViewUI", "exp protect");
        }
    }

    /* renamed from: a9 */
    public void mo63385a9() {
        super.mo63385a9();
        if (mo66683I9()) {
            finish();
            Log.m105928w("MicroMsg.NfcWebViewUI", "not login, go to SimpleLogin");
            return;
        }
        mo66691Q9(AutoLoginActivity.C72717a.LOGIN_OK, getIntent());
        mo66684J9(false);
    }

    public void onBackPressed() {
        if (this.f115241J2) {
            mo66685K9();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        if (mo66690P9(intent)) {
            Log.m105920e("MicroMsg.NfcWebViewUI", "onCreate judgeIllegalCall finish");
            try {
                intent.putExtra("key_trust_url", false);
            } catch (Exception unused) {
            }
            super.onCreate(bundle);
            finish();
            return;
        }
        intent.putExtra("key_trust_url", false);
        super.onCreate(bundle);
        this.f115242K2.alive();
        Log.m105924i("MicroMsg.NfcWebViewUI", "onCreate, intent action = " + intent.getAction());
        setBackBtn(new C42591a());
        getIntent().putExtra("showShare", false);
        mo68225B8(false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f115242K2.dead();
    }

    public void onNewIntent(Intent intent) {
        if (mo66690P9(intent)) {
            Log.m105920e("MicroMsg.NfcWebViewUI", "onNewIntent judgeIllegalCall finish");
            return;
        }
        intent.putExtra("key_trust_url", false);
        super.onNewIntent(intent);
        String n0 = mo6901n0();
        setIntent(intent);
        if (!Util.isNullOrNil(n0) && Util.isNullOrNil(mo6901n0())) {
            intent.putExtra("rawUrl", n0);
        }
        int intExtra = IntentUtil.getIntExtra(intent, "wizard_activity_result_code", Integer.MAX_VALUE);
        Log.m105924i("MicroMsg.NfcWebViewUI", "onNewIntent, resultCode = " + intExtra);
        if (intExtra != Integer.MAX_VALUE) {
            this.f115241J2 = true;
        }
        if (intExtra == -1) {
            mo66691Q9(AutoLoginActivity.C72717a.LOGIN_OK, intent);
        } else if (intExtra == 0) {
            mo66683I9();
            return;
        } else if (intExtra == 1) {
            mo66691Q9(AutoLoginActivity.C72717a.LOGIN_CANCEL, intent);
        }
        mo66684J9(true);
        Log.m105924i("Foreground dispatch", "Discovered tag with intent: " + intent);
    }
}
