package com.tencent.kinda.framework.module.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.tencent.kinda.framework.widget.tools.KindaContext;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.KThirdPayService;
import com.tencent.kinda.gen.VoidITransmitKvDataCallback;
import com.tencent.p014mm.framework.app.UIPageFragmentActivity;
import com.tencent.p014mm.framework.app.modal.DCEPHandler$startDCEPPay$observer$1;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.unionpay.C75273a;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import k20.C9556a;
import kotlin.Metadata;
import q10.C77297a;
import q10.C77298b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J0\u0010\r\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016R\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaThirdPayService;", "Lcom/tencent/kinda/gen/KThirdPayService;", "", "tn", "Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;", "resultCallback", "Lrx3/b0;", "startYunShanFuPayImpl", "", "isYunShanFuAppInstalled", "requestUrl", "Lcom/tencent/kinda/gen/ITransmitKvData;", "extra", "startDcepPayImpl", "isDcepAppInstalled", "hasCallbacked", "Z", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
public final class KindaThirdPayService implements KThirdPayService {
    public static final Companion Companion = new Companion((C8480h) null);
    private static final int REQUEST_YUNSHANFU = 10;
    private static final String TAG = "MicroMsg.KindaThirdPayService";
    /* access modifiers changed from: private */
    public boolean hasCallbacked;

    @Metadata(mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/kinda/framework/module/impl/KindaThirdPayService$Companion;", "", "()V", "REQUEST_YUNSHANFU", "", "TAG", "", "kinda-framework-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    public boolean isDcepAppInstalled() {
        HashMap<String, VoidITransmitKvDataCallback> hashMap = C77298b.f225412a;
        return C72688j0.m85020f(MMApplicationContext.getContext(), "cn.gov.pbc.dcep");
    }

    public boolean isYunShanFuAppInstalled() {
        if (!((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_wechat_query_yunshanfu_installed_switch, false)) {
            return C75273a.m90293e(MMApplicationContext.getContext());
        }
        Log.m105924i(TAG, "wechat check isYunShanFuAppInstalled");
        return C72688j0.m85020f(MMApplicationContext.getContext(), "com.unionpay");
    }

    public void startDcepPayImpl(String str, String str2, ITransmitKvData iTransmitKvData, VoidITransmitKvDataCallback voidITransmitKvDataCallback) {
        HashMap<String, VoidITransmitKvDataCallback> hashMap = C77298b.f225412a;
        Log.m105918d("MicroMsg.DCEPHandler", "startDCEPPay: " + C72688j0.m85020f(MMApplicationContext.getContext(), "cn.gov.pbc.dcep") + "，url: " + str2);
        boolean z = true;
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z && voidITransmitKvDataCallback != null) {
                if (!C72688j0.m85020f(MMApplicationContext.getContext(), "cn.gov.pbc.dcep")) {
                    Log.m105928w("MicroMsg.DCEPHandler", "not installed decp app");
                    return;
                }
                Uri parse = Uri.parse(str2);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                ComponentName resolveActivity = intent.resolveActivity(MMApplicationContext.getContext().getPackageManager());
                if (resolveActivity == null || !C87412m.m108589b(resolveActivity.getPackageName(), "cn.gov.pbc.dcep")) {
                    Log.m105928w("MicroMsg.DCEPHandler", "can't find resolve activity: " + resolveActivity);
                }
                Activity topOrUIPageFragmentActivity = KindaContext.getTopOrUIPageFragmentActivity();
                if (!(topOrUIPageFragmentActivity instanceof UIPageFragmentActivity)) {
                    Log.m105928w("MicroMsg.DCEPHandler", "current activity is not kinda activity: " + topOrUIPageFragmentActivity);
                    return;
                }
                C77298b.f225413b = new WeakReference<>(topOrUIPageFragmentActivity);
                ((MMFragmentActivity) topOrUIPageFragmentActivity).getLifecycle().addObserver(new DCEPHandler$startDCEPPay$observer$1(str, topOrUIPageFragmentActivity));
                ((UIPageFragmentActivity) topOrUIPageFragmentActivity).mmSetOnActivityResultCallback(new C77297a(str));
                if (str != null) {
                    C77298b.f225412a.put(str, voidITransmitKvDataCallback);
                }
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity = topOrUIPageFragmentActivity;
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/framework/app/modal/DCEPHandler", "startDCEPPay", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                topOrUIPageFragmentActivity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/framework/app/modal/DCEPHandler", "startDCEPPay", "(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/kinda/gen/VoidITransmitKvDataCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(1:2)|3|(1:5)(1:6)|7|(1:9)|10|(11:16|17|18|19|22|23|(1:25)(1:26)|27|(1:29)|30|(18:34|37|(3:39|40|(2:44|45)(1:46))|47|48|(7:(2:53|(3:55|(8:57|(1:59)(1:60)|(6:62|63|67|(2:69|(1:(1:138)(3:71|(2:73|(5:77|(3:79|80|(3:82|85|(8:87|88|89|90|91|92|93|97)(1:142)))|83|85|(0)(0)))(1:139)|98)))(0)|100|(1:137))|66|67|(0)(0)|100|(0))(2:102|(1:104)(2:106|(3:108|109|110)(1:136)))|125))|126|127|130|(1:132)|133|(2:135|143)(1:144))|112|114|(4:116|117|118|121)|122|123|124|126|127|130|(0)|133|(0)(0)))|36|37|(0)|47|48|(10:51|53|(0)|126|127|130|(0)|133|(0)(0)|125)|112|114|(0)|122|123|124|126|127|130|(0)|133|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r2 = (java.lang.String) r2.get("url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0331, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x032a */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x031b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0270 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0141 A[SYNTHETIC, Splitter:B:39:0x0141] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0202 A[SYNTHETIC, Splitter:B:87:0x0202] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startYunShanFuPayImpl(java.lang.String r24, com.tencent.kinda.gen.VoidITransmitKvDataCallback r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "start yunshanfu "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.KindaThirdPayService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            android.app.Activity r3 = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity()
            boolean r5 = r3 instanceof com.tencent.p014mm.framework.app.UIPageFragmentActivity
            if (r5 != 0) goto L_0x002a
            java.lang.String r5 = "current activity is not kinda activity"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
        L_0x002a:
            com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1 r4 = new com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$observer$1
            r4.<init>(r3, r0, r2)
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r3, r5)
            r5 = r3
            com.tencent.mm.ui.MMActivity r5 = (com.tencent.p014mm.p136ui.MMActivity) r5
            androidx.lifecycle.j r6 = r5.getLifecycle()
            r6.addObserver(r4)
            com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$1 r6 = new com.tencent.kinda.framework.module.impl.KindaThirdPayService$startYunShanFuPayImpl$1
            r6.<init>(r3, r4, r0, r2)
            r5.mmSetOnActivityResultCallback(r6)
            bp3.p r2 = bp3.C79758p.f233760a
            bp3.f r4 = bp3.C104160f.RepairerConfig_Pay_YSFDebugEnv_Int
            r13 = 0
            int r2 = r2.mo109882e(r4, r13)
            r4 = 1
            if (r2 != r4) goto L_0x0055
            java.lang.String r2 = "01"
            goto L_0x0057
        L_0x0055:
            java.lang.String r2 = "00"
        L_0x0057:
            boolean r14 = r3 instanceof com.tencent.p014mm.framework.app.UIPageFragmentActivity
            if (r14 == 0) goto L_0x0060
            r5 = r3
            com.tencent.mm.framework.app.UIPageFragmentActivity r5 = (com.tencent.p014mm.framework.app.UIPageFragmentActivity) r5
            r5.f195319t = r4
        L_0x0060:
            com.unionpay.C75273a.f221395a = r1
            r1 = 0
            com.unionpay.C75273a.f221396b = r1
            com.unionpay.C75273a.f221397c = r1
            com.unionpay.C75273a.f221398d = r2
            java.lang.String r2 = "sePayConf"
            com.unionpay.C75273a.f221399e = r13
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.String r6 = "entryexpro"
            r5.mo10233c(r6)
            java.lang.Object r6 = new java.lang.Object
            r6.<init>()
            java.lang.Object[] r16 = r5.mo10232b()
            java.lang.String r17 = "com/unionpay/UPPayAssistEx"
            java.lang.String r18 = "a"
            java.lang.String r19 = "(Landroid/content/Context;)I"
            java.lang.String r20 = "java/lang/System_EXEC_"
            java.lang.String r21 = "loadLibrary"
            java.lang.String r22 = "(Ljava/lang/String;)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r5 = r5.mo10231a(r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.System.loadLibrary(r5)
            java.lang.String r16 = "com/unionpay/UPPayAssistEx"
            java.lang.String r17 = "a"
            java.lang.String r18 = "(Landroid/content/Context;)I"
            java.lang.String r19 = "java/lang/System_EXEC_"
            java.lang.String r20 = "loadLibrary"
            java.lang.String r21 = "(Ljava/lang/String;)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r5 = "configs"
            java.lang.String r6 = com.unionpay.utils.UPUtils.m90294a(r3, r5)
            java.lang.String r7 = "mode"
            java.lang.String r7 = com.unionpay.utils.UPUtils.m90294a(r3, r7)
            java.lang.String r8 = "or"
            java.lang.String r8 = com.unionpay.utils.UPUtils.m90294a(r3, r8)
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            java.lang.String r15 = "sign"
            r10 = 2
            java.lang.String r16 = ""
            if (r9 != 0) goto L_0x013c
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x013c
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x013c
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Exception -> 0x013b }
            r9.<init>(r6)     // Catch:{ Exception -> 0x013b }
            java.lang.String r6 = ix3.C76377f.m91807b(r9, r15)     // Catch:{ Exception -> 0x013b }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x00df }
            goto L_0x00e0
        L_0x00df:
            r7 = 0
        L_0x00e0:
            java.lang.String r11 = new java.lang.String     // Catch:{ Exception -> 0x013b }
            java.lang.String r5 = r9.getString(r5)     // Catch:{ Exception -> 0x013b }
            byte[] r5 = android.util.Base64.decode(r5, r10)     // Catch:{ Exception -> 0x013b }
            r11.<init>(r5)     // Catch:{ Exception -> 0x013b }
            boolean r5 = r9.has(r2)     // Catch:{ Exception -> 0x013b }
            if (r5 == 0) goto L_0x0101
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x013b }
            java.lang.String r2 = r9.getString(r2)     // Catch:{ Exception -> 0x013b }
            byte[] r2 = android.util.Base64.decode(r2, r10)     // Catch:{ Exception -> 0x013b }
            r5.<init>(r2)     // Catch:{ Exception -> 0x013b }
            goto L_0x0103
        L_0x0101:
            r5 = r16
        L_0x0103:
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x013b }
            if (r2 == 0) goto L_0x010b
            r5 = r16
        L_0x010b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013b }
            r2.<init>()     // Catch:{ Exception -> 0x013b }
            r2.append(r11)     // Catch:{ Exception -> 0x013b }
            r2.append(r5)     // Catch:{ Exception -> 0x013b }
            r2.append(r8)     // Catch:{ Exception -> 0x013b }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x013b }
            java.lang.String r2 = com.unionpay.utils.UPUtils.m90295b(r2)     // Catch:{ Exception -> 0x013b }
            java.lang.String r2 = ix3.C76375b.m91805g(r2)     // Catch:{ Exception -> 0x013b }
            java.lang.String r5 = com.unionpay.utils.UPUtils.forConfig(r7, r6)     // Catch:{ Exception -> 0x013b }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x013b }
            if (r6 != 0) goto L_0x013c
            boolean r2 = r5.equals(r2)     // Catch:{ Exception -> 0x013b }
            if (r2 == 0) goto L_0x013c
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x013b }
            r2.<init>(r11)     // Catch:{ Exception -> 0x013b }
            goto L_0x013d
        L_0x013b:
        L_0x013c:
            r2 = r1
        L_0x013d:
            java.lang.String r12 = "sort"
            if (r2 != 0) goto L_0x015b
            java.lang.String r2 = com.unionpay.C75273a.f221398d     // Catch:{ Exception -> 0x0148 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0148 }
            goto L_0x014a
        L_0x0148:
            r2 = 0
        L_0x014a:
            if (r2 != r10) goto L_0x0154
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0161 }
            java.lang.String r5 = "[{\"type\":\"app\",\"sort\":100,\"package_info\":[{\"schema\":\"com.unionpay\",\"version\":\".*\",\"sign\":\"236758F99B958C76AFA4634A55F6CDB37FA89A73\",\"sort\":101}],\"md5\":\"D75BB2802E61738A9A03BF014F927D9A\"},{\"sort\": 200,\"type\": \"link\",\"url\": \"https://youhui.95516.com/hybrid_v4/html/help/download.html\"}]"
            r2.<init>(r5)     // Catch:{ Exception -> 0x0161 }
            goto L_0x015b
        L_0x0154:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x0161 }
            java.lang.String r5 = "[{\"package_info\":[{\"schema\":\"com.unionpay\",\"sign\":\"536C79B93ACFBEA950AE365D8CE1AEF91FEA9535\",\"sort\":102,\"version\":\".*\"},{\"schema\":\"com.cmbc.cc.mbank\",\"sign\":\"812F343676D89E552A4820B2B52DB82D72E5119E\",\"sort\":101,\"version\":\"((9|1).*)|(8\\\\.[2-9].*)\"}],\"sort\":100,\"type\":\"app\"},{\"sort\":200,\"type\":\"link\",\"url\":\"https://youhui.95516.com/hybrid_v4/html/help/download.html\"}]"
            r2.<init>(r5)     // Catch:{ Exception -> 0x0161 }
        L_0x015b:
            org.json.JSONArray r2 = com.unionpay.C75273a.m90290b(r2, r12)     // Catch:{ Exception -> 0x0161 }
            com.unionpay.C75273a.f221401g = r2     // Catch:{ Exception -> 0x0161 }
        L_0x0161:
            org.json.JSONArray r2 = com.unionpay.C75273a.f221401g
            int r5 = com.unionpay.C75273a.f221399e
        L_0x0165:
            if (r2 == 0) goto L_0x032a
            int r6 = r2.length()
            if (r5 >= r6) goto L_0x032a
            java.lang.Object r2 = ix3.C76377f.m91806a(r2, r5)
            if (r2 == 0) goto L_0x032a
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r5 = "type"
            java.lang.String r5 = ix3.C76377f.m91807b(r2, r5)
            java.lang.String r6 = "app"
            boolean r6 = r6.equals(r5)
            java.lang.String r8 = "paydata"
            java.lang.String r9 = "SysProvide"
            java.lang.String r10 = "SpId"
            if (r6 == 0) goto L_0x027f
            java.lang.String r5 = "package_info"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto L_0x0194
            r6 = 1
            goto L_0x0195
        L_0x0194:
            r6 = 0
        L_0x0195:
            if (r6 == 0) goto L_0x01a1
            org.json.JSONArray r5 = r2.getJSONArray(r5)     // Catch:{ Exception -> 0x019c }
            goto L_0x01a2
        L_0x019c:
            java.lang.Class<ix3.f> r5 = ix3.C76377f.class
            r5.toString()
        L_0x01a1:
            r5 = r1
        L_0x01a2:
            java.lang.String r6 = "app_server"
            java.lang.String r2 = ix3.C76377f.m91807b(r2, r6)
            org.json.JSONArray r5 = com.unionpay.C75273a.m90290b(r5, r12)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0279
            int r6 = r5.length()
            r11 = 0
        L_0x01b7:
            if (r11 >= r6) goto L_0x0279
            java.lang.Object r17 = ix3.C76377f.m91806a(r5, r11)
            if (r17 == 0) goto L_0x0270
            r4 = r17
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.lang.String r7 = "schema"
            java.lang.String r7 = ix3.C76377f.m91807b(r4, r7)
            java.lang.String r1 = ix3.C76377f.m91807b(r4, r15)
            java.lang.String r13 = "version"
            java.lang.String r4 = ix3.C76377f.m91807b(r4, r13)
            boolean r13 = ix3.C76375b.m91804f(r3, r7)
            if (r13 == 0) goto L_0x0270
            java.lang.String r13 = "SHA1"
            java.lang.String r13 = ix3.C76375b.m91801c(r3, r7, r13)
            boolean r1 = r1.equalsIgnoreCase(r13)
            if (r1 == 0) goto L_0x0270
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x01fa
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ Exception -> 0x01fa }
            r13 = 0
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r7, r13)     // Catch:{ Exception -> 0x01fa }
            if (r1 == 0) goto L_0x01fa
            java.lang.String r1 = r1.versionName     // Catch:{ Exception -> 0x01fa }
            goto L_0x01fc
        L_0x01fa:
            r1 = r16
        L_0x01fc:
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x0270
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x0270 }
            r1.<init>()     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = com.unionpay.C75273a.f221395a     // Catch:{ Exception -> 0x0270 }
            java.lang.String r13 = com.unionpay.C75273a.f221398d     // Catch:{ Exception -> 0x0270 }
            com.unionpay.C75273a.m90291c(r4, r1, r13)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = com.unionpay.C75273a.f221396b     // Catch:{ Exception -> 0x0270 }
            r1.putString(r10, r4)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = com.unionpay.C75273a.f221397c     // Catch:{ Exception -> 0x0270 }
            r1.putString(r9, r4)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = com.unionpay.C75273a.f221395a     // Catch:{ Exception -> 0x0270 }
            r1.putString(r8, r4)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = "dlgstyle"
            r13 = 0
            r1.putBoolean(r4, r13)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = "server"
            r1.putString(r4, r2)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = "SecurityChipType"
            r13 = 0
            r1.putString(r4, r13)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r4 = "reqOriginalId"
            r13 = 0
            r1.putInt(r4, r13)     // Catch:{ Exception -> 0x0270 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0270 }
            r4.<init>()     // Catch:{ Exception -> 0x0270 }
            r4.putExtras(r1)     // Catch:{ Exception -> 0x0270 }
            java.lang.String r1 = "com.unionpay.uppay.PayActivity"
            r4.setClassName(r7, r1)     // Catch:{ Exception -> 0x0270 }
            k20.a r1 = new k20.a     // Catch:{ Exception -> 0x026c }
            r1.<init>()     // Catch:{ Exception -> 0x026c }
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x026c }
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x026c }
            r1.mo10233c(r2)     // Catch:{ Exception -> 0x026c }
            r1.mo10233c(r4)     // Catch:{ Exception -> 0x026c }
            java.lang.Object[] r6 = r1.mo10232b()     // Catch:{ Exception -> 0x026c }
            java.lang.String r7 = "com/unionpay/UPPayAssistEx"
            java.lang.String r8 = "a"
            java.lang.String r9 = "(Landroid/content/Context;Lorg/json/JSONArray;I)V"
            java.lang.String r10 = "android/app/Activity"
            java.lang.String r11 = "startActivityForResult"
            java.lang.String r1 = "(Landroid/content/Intent;I)V"
            r5 = r3
            r4 = r12
            r12 = r1
            j20.C117292a.m165364j(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x026d }
            goto L_0x026e
        L_0x026c:
            r4 = r12
        L_0x026d:
        L_0x026e:
            r13 = 1
            goto L_0x027b
        L_0x0270:
            r4 = r12
            int r11 = r11 + 1
            r12 = r4
            r1 = 0
            r4 = 1
            r13 = 0
            goto L_0x01b7
        L_0x0279:
            r4 = r12
            r13 = 0
        L_0x027b:
            if (r13 != 0) goto L_0x032a
            goto L_0x031b
        L_0x027f:
            r4 = r12
            java.lang.String r1 = "wap"
            boolean r6 = r1.equals(r5)
            java.lang.String r7 = "url"
            java.lang.String r11 = "link"
            if (r6 == 0) goto L_0x0295
            java.lang.Object r2 = r2.get(r7)     // Catch:{ Exception -> 0x02a0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x02a0 }
            goto L_0x02a2
        L_0x0295:
            boolean r1 = r11.equals(r5)
            if (r1 == 0) goto L_0x031b
            java.lang.String r16 = r2.getString(r7)     // Catch:{ Exception -> 0x029f }
        L_0x029f:
            r1 = r11
        L_0x02a0:
            r2 = r16
        L_0x02a2:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto L_0x02d3
            java.lang.String r5 = com.unionpay.C75273a.f221395a
            java.lang.String r6 = com.unionpay.C75273a.f221398d
            com.unionpay.C75273a.m90291c(r5, r4, r6)
            java.lang.String r5 = com.unionpay.C75273a.f221396b
            r4.putString(r10, r5)
            java.lang.String r5 = com.unionpay.C75273a.f221397c
            r4.putString(r9, r5)
            java.lang.String r5 = com.unionpay.C75273a.f221398d     // Catch:{ Exception -> 0x02c5 }
            int r13 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x02c5 }
            goto L_0x02c6
        L_0x02c5:
            r13 = 0
        L_0x02c6:
            java.lang.String r5 = com.unionpay.C75273a.f221395a
            java.lang.String r5 = ix3.C76375b.m91805g(r5)
            java.lang.String r5 = com.unionpay.utils.UPUtils.forWap(r13, r5)
            r4.putString(r8, r5)
        L_0x02d3:
            java.lang.String r5 = "magic_data"
            java.lang.String r6 = "949A1CC"
            r4.putString(r5, r6)
            java.lang.String r5 = "wapurl"
            r4.putString(r5, r2)
            java.lang.String r2 = "actionType"
            r4.putString(r2, r1)
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x032a }
            r1.<init>()     // Catch:{ Exception -> 0x032a }
            r1.putExtras(r4)     // Catch:{ Exception -> 0x032a }
            java.lang.Class<com.unionpay.UPPayWapActivity> r2 = com.unionpay.UPPayWapActivity.class
            r1.setClass(r3, r2)     // Catch:{ Exception -> 0x032a }
            k20.a r2 = new k20.a     // Catch:{ Exception -> 0x032a }
            r2.<init>()     // Catch:{ Exception -> 0x032a }
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a     // Catch:{ Exception -> 0x032a }
            r4 = 10
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x032a }
            r2.mo10233c(r4)     // Catch:{ Exception -> 0x032a }
            r2.mo10233c(r1)     // Catch:{ Exception -> 0x032a }
            java.lang.Object[] r6 = r2.mo10232b()     // Catch:{ Exception -> 0x032a }
            java.lang.String r7 = "com/unionpay/UPPayAssistEx"
            java.lang.String r8 = "a"
            java.lang.String r9 = "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r10 = "android/app/Activity"
            java.lang.String r11 = "startActivityForResult"
            java.lang.String r12 = "(Landroid/content/Intent;I)V"
            r5 = r3
            j20.C117292a.m165364j(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x032a }
            goto L_0x032a
        L_0x031b:
            org.json.JSONArray r2 = com.unionpay.C75273a.f221401g
            int r1 = com.unionpay.C75273a.f221399e
            r5 = 1
            int r1 = r1 + r5
            com.unionpay.C75273a.f221399e = r1
            r5 = r1
            r12 = r4
            r1 = 0
            r4 = 1
            r13 = 0
            goto L_0x0165
        L_0x032a:
            java.lang.String r1 = com.unionpay.C75273a.f221398d     // Catch:{ Exception -> 0x0331 }
            int r13 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0332
        L_0x0331:
            r13 = 0
        L_0x0332:
            java.lang.String r1 = com.unionpay.utils.UPUtils.forUrl(r13)
            hx3.c r2 = new hx3.c
            r2.<init>(r1)
            com.unionpay.C75273a.f221400f = r2
            java.lang.String r6 = com.unionpay.C75273a.f221398d
            java.lang.String r7 = com.unionpay.C75273a.f221395a
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r3
            java.lang.String r1 = com.unionpay.C75273a.m90289a(r5, r6, r7, r8, r9, r10)
            hx3.c r2 = com.unionpay.C75273a.f221400f
            r2.getClass()
            if (r1 == 0) goto L_0x0355
            r1.getBytes()
            r2.f223344b = r1
        L_0x0355:
            android.content.Context r1 = r3.getApplicationContext()
            com.unionpay.c r2 = new com.unionpay.c
            r2.<init>(r1)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r1.execute(r2)
            if (r14 == 0) goto L_0x036c
            com.tencent.mm.framework.app.UIPageFragmentActivity r3 = (com.tencent.p014mm.framework.app.UIPageFragmentActivity) r3
            r1 = 0
            r3.f195319t = r1
        L_0x036c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.module.impl.KindaThirdPayService.startYunShanFuPayImpl(java.lang.String, com.tencent.kinda.gen.VoidITransmitKvDataCallback):void");
    }
}
