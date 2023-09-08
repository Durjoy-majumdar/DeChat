package com.tencent.p014mm.plugin.webview.modeltools;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e00.C45529v;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p447aw.C103918d;
import qo3.C77407n;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.j */
public class C43754j implements C45529v {

    /* renamed from: a */
    public String[] f118225a = null;

    /* renamed from: b */
    public String f118226b = null;

    /* renamed from: c */
    public ValueCallback<Uri> f118227c = null;

    /* renamed from: d */
    public ValueCallback<Uri[]> f118228d = null;

    /* renamed from: e */
    public Pair<Intent, Integer> f118229e = null;

    /* renamed from: f */
    public C77407n f118230f;

    /* renamed from: a */
    public final void mo68058a(Uri uri) {
        try {
            ValueCallback<Uri> valueCallback = this.f118227c;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uri);
                return;
            }
            ValueCallback<Uri[]> valueCallback2 = this.f118228d;
            if (valueCallback2 == null) {
                return;
            }
            if (uri == null) {
                valueCallback2.onReceiveValue((Object) null);
                return;
            }
            valueCallback2.onReceiveValue(new Uri[]{uri});
        } catch (IllegalStateException e) {
            Log.m105921e("MicroMsg.WebViewUI.FileChooser", "callbackOnReceiveValue get exception %s", e);
        }
    }

    /* renamed from: b */
    public void mo68059b() {
        this.f118225a = null;
        this.f118227c = null;
        this.f118228d = null;
        this.f118226b = null;
        this.f118229e = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0245  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68060c(android.app.Activity r20, d93.C45310h r21, android.webkit.ValueCallback<android.net.Uri> r22, android.webkit.ValueCallback<android.net.Uri[]> r23, java.lang.String[] r24, java.lang.String r25, android.content.Intent r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r21
            r9 = 1
            r7[r9] = r2
            r10 = 2
            r7[r10] = r3
            r11 = 3
            r7[r11] = r4
            r11 = 4
            r7[r11] = r5
            java.lang.String r11 = "MicroMsg.WebViewUI.FileChooser"
            java.lang.String r12 = "openFileChooser with wvPerm(%s), callback(%s), callbackLL(%s), acceptType(%s), capture(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r7)
            r19.mo68059b()
            r7 = 0
            if (r21 != 0) goto L_0x0036
            java.lang.String r1 = "openFileChooser fail, wvPerm is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            r0.mo68058a(r7)
            return
        L_0x0036:
            com.tencent.mm.protocal.JsapiPermissionWrapper r12 = r21.mo70860c()
            r13 = 56
            boolean r12 = r12.mo69447f(r13)
            if (r12 != 0) goto L_0x004b
            java.lang.String r1 = "open file chooser failed, permission fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r1)
            r0.mo68058a(r7)
            return
        L_0x004b:
            r0.f118227c = r2
            r0.f118228d = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r12 = java.lang.System.currentTimeMillis()
            r2.append(r12)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.f118226b = r2
            r0.f118225a = r4
            java.lang.String r2 = "user"
            boolean r2 = r2.equalsIgnoreCase(r5)
            java.lang.String r3 = "true"
            if (r2 != 0) goto L_0x007b
            java.lang.String r2 = "environment"
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x007c
        L_0x007b:
            r5 = r3
        L_0x007c:
            java.lang.String r2 = r0.f118226b
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r12 = com.tencent.p014mm.plugin.webview.model.C43702g2.f118107a
            java.lang.String r12 = "*/*"
            java.lang.String r13 = "android.intent.category.OPENABLE"
            java.lang.String r14 = "android.intent.action.GET_CONTENT"
            java.lang.String r15 = "MicroMsg.WebviewJSSDKUtil"
            if (r6 == 0) goto L_0x00d8
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.String r17 = r26.getType()
            r7[r8] = r17
            java.lang.String r17 = r26.getAction()
            r7[r9] = r17
            java.lang.String r10 = "createOpenFileChooserIntent type: %s, action: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r10, r7)
            java.lang.String r7 = r26.getAction()
            boolean r7 = r14.equalsIgnoreCase(r7)
            if (r7 != 0) goto L_0x00aa
            r6.setAction(r14)
        L_0x00aa:
            java.util.Set r7 = r26.getCategories()
            if (r7 == 0) goto L_0x00ba
            java.util.Set r7 = r26.getCategories()
            boolean r7 = r7.contains(r13)
            if (r7 != 0) goto L_0x00bd
        L_0x00ba:
            r6.addCategory(r13)
        L_0x00bd:
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.ComponentName r7 = r6.resolveActivity(r7)
            if (r7 == 0) goto L_0x00cd
            r7 = 1
            goto L_0x00ce
        L_0x00cd:
            r7 = 0
        L_0x00ce:
            if (r7 != 0) goto L_0x00d8
            java.lang.String r7 = "alvinluo createOpenFileChooserIntent fileIntent resolve failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r7)
            r6.setType(r12)
        L_0x00d8:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r7 != 0) goto L_0x01d5
            java.lang.String r7 = "camera"
            boolean r7 = r7.equalsIgnoreCase(r5)
            if (r7 == 0) goto L_0x00f0
            android.content.Intent[] r3 = new android.content.Intent[r9]
            android.content.Intent r2 = com.tencent.p014mm.plugin.webview.model.C43702g2.m47529b(r2)
            r3[r8] = r2
            goto L_0x01ec
        L_0x00f0:
            java.lang.String r7 = "camcorder"
            boolean r7 = r7.equalsIgnoreCase(r5)
            java.lang.String r10 = "android.media.action.VIDEO_CAPTURE"
            if (r7 == 0) goto L_0x0105
            android.content.Intent[] r3 = new android.content.Intent[r9]
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r10)
            r3[r8] = r2
            goto L_0x01ec
        L_0x0105:
            java.lang.String r7 = "microphone"
            boolean r7 = r7.equalsIgnoreCase(r5)
            java.lang.String r8 = "createChooserIntent no sound recorder"
            java.lang.String r9 = "android.provider.MediaStore.RECORD_SOUND"
            if (r7 == 0) goto L_0x0138
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r9)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            android.content.ComponentName r3 = r2.resolveActivity(r3)
            if (r3 == 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r2 = 0
        L_0x0126:
            if (r2 == 0) goto L_0x0131
            r3 = 1
            android.content.Intent[] r4 = new android.content.Intent[r3]
            r3 = 0
            r4[r3] = r2
            r3 = r4
            goto L_0x01ec
        L_0x0131:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r8)
            r2 = 1
            r7 = 0
            goto L_0x01ee
        L_0x0138:
            java.lang.String r7 = "*"
            boolean r18 = r7.equalsIgnoreCase(r5)
            java.lang.String r1 = "false"
            if (r18 != 0) goto L_0x014e
            boolean r3 = r3.equalsIgnoreCase(r5)
            if (r3 != 0) goto L_0x014e
            boolean r3 = r1.equalsIgnoreCase(r5)
            if (r3 == 0) goto L_0x01f0
        L_0x014e:
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r3 = com.tencent.p014mm.plugin.webview.model.C43702g2.f118107a
            java.lang.String r0 = "image/*"
            boolean r0 = com.tencent.p014mm.plugin.webview.model.C43702g2.m47533f(r4, r3, r0)
            if (r0 == 0) goto L_0x0163
            r0 = 1
            android.content.Intent[] r3 = new android.content.Intent[r0]
            android.content.Intent r0 = com.tencent.p014mm.plugin.webview.model.C43702g2.m47529b(r2)
            r2 = 0
            r3[r2] = r0
            goto L_0x01ba
        L_0x0163:
            if (r4 != 0) goto L_0x0166
            goto L_0x017d
        L_0x0166:
            int r0 = r4.length
            r2 = 0
        L_0x0168:
            if (r2 >= r0) goto L_0x017d
            r3 = r4[r2]
            r18 = r0
            java.lang.String r0 = "audio/*"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0178
            r0 = 1
            goto L_0x017e
        L_0x0178:
            int r2 = r2 + 1
            r0 = r18
            goto L_0x0168
        L_0x017d:
            r0 = 0
        L_0x017e:
            if (r0 == 0) goto L_0x01a3
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r9)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.content.ComponentName r2 = r0.resolveActivity(r2)
            if (r2 == 0) goto L_0x0194
            goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            if (r0 == 0) goto L_0x019e
            r2 = 1
            android.content.Intent[] r3 = new android.content.Intent[r2]
            r4 = 0
            r3[r4] = r0
            goto L_0x01ba
        L_0x019e:
            r2 = 1
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r8)
            goto L_0x01bf
        L_0x01a3:
            r2 = 1
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r0 = com.tencent.p014mm.plugin.webview.model.C43702g2.f118108b
            java.lang.String r3 = "video/*"
            boolean r0 = com.tencent.p014mm.plugin.webview.model.C43702g2.m47533f(r4, r0, r3)
            if (r0 == 0) goto L_0x01be
            android.content.Intent[] r0 = new android.content.Intent[r2]
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r10)
            r3 = 0
            r0[r3] = r2
            r3 = r0
        L_0x01ba:
            r16 = r3
            r2 = 0
            goto L_0x01c1
        L_0x01be:
            r2 = 0
        L_0x01bf:
            r16 = 0
        L_0x01c1:
            boolean r0 = r1.equalsIgnoreCase(r5)
            if (r0 != 0) goto L_0x01d1
            boolean r0 = r7.equalsIgnoreCase(r5)
            if (r0 == 0) goto L_0x01ce
            goto L_0x01d1
        L_0x01ce:
            r7 = r16
            goto L_0x01ee
        L_0x01d1:
            r7 = r16
            r2 = 1
            goto L_0x01ee
        L_0x01d5:
            r0 = 16
            boolean r0 = p206nj.C11171e.m11044a(r0)
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = "android API version is below 16."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            r0 = 1
            android.content.Intent[] r3 = new android.content.Intent[r0]
            android.content.Intent r0 = com.tencent.p014mm.plugin.webview.model.C43702g2.m47529b(r2)
            r1 = 0
            r3[r1] = r0
        L_0x01ec:
            r7 = r3
            r2 = 0
        L_0x01ee:
            r0 = 2
            goto L_0x01f3
        L_0x01f0:
            r0 = 2
            r2 = 0
            r7 = 0
        L_0x01f3:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            if (r7 == 0) goto L_0x01f9
            int r1 = r7.length
            goto L_0x01fa
        L_0x01f9:
            r1 = 0
        L_0x01fa:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r0[r3] = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r4 = 1
            r0[r4] = r1
            java.lang.String r1 = "createChooseIntent intents size: %d, addLocalFile: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r0)
            java.lang.String r0 = "android.intent.extra.INITIAL_INTENTS"
            java.lang.String r1 = "android.intent.action.CHOOSER"
            if (r2 != 0) goto L_0x021a
            if (r7 != 0) goto L_0x0216
            goto L_0x021a
        L_0x0216:
            r2 = r7[r3]
        L_0x0218:
            r3 = 1
            goto L_0x024c
        L_0x021a:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1)
            r2.putExtra(r0, r7)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r4 = 2131840282(0x7f114d1a, float:1.931384E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "android.intent.extra.TITLE"
            r2.putExtra(r4, r3)
            if (r6 != 0) goto L_0x0245
            java.lang.String r3 = "createChooseIntent fileIntent null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r15, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r14)
            r3.addCategory(r13)
            r3.setType(r12)
            goto L_0x0246
        L_0x0245:
            r3 = r6
        L_0x0246:
            java.lang.String r4 = "android.intent.extra.INTENT"
            r2.putExtra(r4, r3)
            goto L_0x0218
        L_0x024c:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r3 = r2.getAction()
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "openFileChooser action: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r4)
            r3 = r19
            boolean r4 = r3.mo68062e(r2)
            if (r4 == 0) goto L_0x0269
            r4 = r20
            r3.mo68065h(r4, r2)
            goto L_0x02e1
        L_0x0269:
            r4 = r20
            java.lang.String r5 = r2.getAction()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x02de
            android.os.Parcelable[] r0 = r2.getParcelableArrayExtra(r0)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            r1 = 1
            java.lang.Object[] r5 = new java.lang.Object[r1]
            if (r0 == 0) goto L_0x0282
            int r1 = r0.length
            goto L_0x0283
        L_0x0282:
            r1 = 0
        L_0x0283:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "openFileChooser originIntentList: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r5)
            if (r0 == 0) goto L_0x02da
            int r1 = r0.length
            if (r1 <= 0) goto L_0x02da
            int r1 = r0.length
            r5 = 0
        L_0x0296:
            if (r5 >= r1) goto L_0x02da
            r6 = r0[r5]
            boolean r7 = r3.mo68062e(r6)
            if (r7 == 0) goto L_0x02d5
            qo3.n r1 = new qo3.n
            r7 = 1
            r8 = 0
            r1.<init>((android.content.Context) r4, (int) r7, (boolean) r8)
            r3.f118230f = r1
            com.tencent.mm.plugin.webview.modeltools.f r5 = new com.tencent.mm.plugin.webview.modeltools.f
            r5.<init>(r3)
            r1.f225771i = r5
            com.tencent.mm.plugin.webview.modeltools.g r5 = new com.tencent.mm.plugin.webview.modeltools.g
            r5.<init>(r3)
            r1.f225761d = r5
            com.tencent.mm.plugin.webview.modeltools.h r5 = new com.tencent.mm.plugin.webview.modeltools.h
            r5.<init>(r3)
            r1.f225802y = r5
            com.tencent.mm.plugin.webview.modeltools.i r5 = new com.tencent.mm.plugin.webview.modeltools.i
            r21 = r5
            r22 = r19
            r23 = r20
            r24 = r6
            r25 = r2
            r26 = r0
            r21.<init>(r22, r23, r24, r25, r26)
            r1.f225782p = r5
            r1.mo107573q()
            return
        L_0x02d5:
            r7 = 1
            r8 = 0
            int r5 = r5 + 1
            goto L_0x0296
        L_0x02da:
            r3.mo68061d(r4, r2)
            goto L_0x02e1
        L_0x02de:
            r3.mo68061d(r4, r2)
        L_0x02e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.modeltools.C43754j.mo68060c(android.app.Activity, d93.h, android.webkit.ValueCallback, android.webkit.ValueCallback, java.lang.String[], java.lang.String, android.content.Intent):void");
    }

    /* renamed from: d */
    public void mo68061d(Activity activity, Intent intent) {
        try {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(201);
            aVar.mo10233c(intent);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/FileChooserHelper", "doOpenFileChooserByIntent", "(Landroid/app/Activity;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.WebViewUI.FileChooser", "openFileChooser e = %s", e);
        }
    }

    /* renamed from: e */
    public final boolean mo68062e(Intent intent) {
        return "android.media.action.IMAGE_CAPTURE".equals(intent.getAction()) || "android.media.action.VIDEO_CAPTURE".equals(intent.getAction());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.nullAsNil(r7[1]).equals(r8[1]) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e9 A[LOOP:0: B:30:0x0082->B:50:0x00e9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e7 A[EDGE_INSN: B:62:0x00e7->B:49:0x00e7 ?: BREAK  , SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68063f(android.app.Activity r12, int r13, int r14, android.content.Intent r15) {
        /*
            r11 = this;
            android.webkit.ValueCallback<android.net.Uri> r13 = r11.f118227c
            java.lang.String r0 = "MicroMsg.WebViewUI.FileChooser"
            if (r13 != 0) goto L_0x0011
            android.webkit.ValueCallback<android.net.Uri[]> r13 = r11.f118228d
            if (r13 != 0) goto L_0x0011
            java.lang.String r12 = "uploadFileCallback is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r12)
            return
        L_0x0011:
            r13 = 0
            r1 = -1
            if (r14 == r1) goto L_0x0017
            goto L_0x0119
        L_0x0017:
            r14 = 0
            r1 = 1
            if (r15 == 0) goto L_0x005f
            android.net.Uri r2 = r15.getData()
            if (r2 != 0) goto L_0x0038
            android.os.Bundle r2 = r15.getExtras()
            if (r2 == 0) goto L_0x0036
            java.lang.String r3 = "android.intent.extra.STREAM"
            android.os.Parcelable r4 = r2.getParcelable(r3)
            if (r4 == 0) goto L_0x0036
            android.os.Parcelable r2 = r2.getParcelable(r3)
            android.net.Uri r2 = (android.net.Uri) r2
            goto L_0x003c
        L_0x0036:
            r2 = r13
            goto L_0x003c
        L_0x0038:
            android.net.Uri r2 = r15.getData()
        L_0x003c:
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_open_file_choose_new
            int r3 = r3.mo58779Qe(r4, r1)
            if (r3 != r1) goto L_0x0051
            if (r2 == 0) goto L_0x0051
            r13 = r2
            goto L_0x0119
        L_0x0051:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.getFilePath(r12, r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r14] = r2
            java.lang.String r4 = "get file path:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
            goto L_0x0060
        L_0x005f:
            r2 = r13
        L_0x0060:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 != 0) goto L_0x0104
            com.tencent.mm.sdk.platformtools.QueueWorkerThread r3 = com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2.f121005a
            java.lang.String r3 = com.tencent.p014mm.sdk.system.MimeTypeUtil.getMimeTypeByFilePath(r2)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r14] = r3
            java.lang.String r5 = "get file mime type [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r5, r4)
            java.lang.String[] r4 = r11.f118225a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r4)
            if (r4 == 0) goto L_0x007e
            goto L_0x00e7
        L_0x007e:
            java.lang.String[] r4 = r11.f118225a
            int r5 = r4.length
            r6 = 0
        L_0x0082:
            if (r6 >= r5) goto L_0x00ec
            r7 = r4[r6]
            java.lang.String r8 = " "
            java.lang.String r9 = ""
            java.lang.String r7 = r7.replace(r8, r9)
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x0095
            goto L_0x00dd
        L_0x0095:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r8 == 0) goto L_0x009c
            goto L_0x00df
        L_0x009c:
            java.lang.String r8 = "/"
            boolean r9 = r7.contains(r8)
            if (r9 == 0) goto L_0x00e1
            boolean r9 = r3.contains(r8)
            if (r9 != 0) goto L_0x00ab
            goto L_0x00e1
        L_0x00ab:
            java.lang.String[] r7 = r7.split(r8)
            java.lang.String[] r8 = r3.split(r8)
            r9 = r7[r14]
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            r10 = r8[r14]
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00df
            r9 = r7[r1]
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            java.lang.String r10 = "*"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00dd
            r7 = r7[r1]
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            r8 = r8[r1]
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00df
        L_0x00dd:
            r7 = 1
            goto L_0x00e5
        L_0x00df:
            r7 = 0
            goto L_0x00e5
        L_0x00e1:
            boolean r7 = r7.equals(r3)
        L_0x00e5:
            if (r7 == 0) goto L_0x00e9
        L_0x00e7:
            r14 = 1
            goto L_0x00ec
        L_0x00e9:
            int r6 = r6 + 1
            goto L_0x0082
        L_0x00ec:
            if (r14 != 0) goto L_0x00ef
            goto L_0x0119
        L_0x00ef:
            android.net.Uri r13 = r15.getData()
            if (r13 != 0) goto L_0x00ff
            com.tencent.mm.vfs.m1 r13 = new com.tencent.mm.vfs.m1
            r13.<init>((java.lang.String) r2)
            android.net.Uri r13 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r12, r13)
            goto L_0x0119
        L_0x00ff:
            android.net.Uri r13 = r15.getData()
            goto L_0x0119
        L_0x0104:
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1
            java.lang.String r15 = r11.f118226b
            java.lang.String r15 = com.tencent.p014mm.plugin.webview.model.C43702g2.m47530c(r15)
            r14.<init>((java.lang.String) r15)
            boolean r15 = r14.mo119967g()
            if (r15 == 0) goto L_0x0119
            android.net.Uri r13 = com.tencent.p014mm.sdk.platformtools.FileProviderHelper.getUriForFile(r12, r14)
        L_0x0119:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "result = "
            r12.append(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            r11.mo68058a(r13)
            r11.mo68059b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.modeltools.C43754j.mo68063f(android.app.Activity, int, int, android.content.Intent):void");
    }

    /* renamed from: g */
    public boolean mo68064g(Activity activity, int i, String[] strArr, int[] iArr) {
        Pair<Intent, Integer> pair = this.f118229e;
        if (pair == null) {
            mo68059b();
            return false;
        } else if (119 != i) {
            return true;
        } else {
            if (iArr[0] == 0) {
                int intValue = ((Integer) pair.second).intValue();
                this.f118229e = null;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(intValue));
                aVar.mo10233c((Intent) pair.first);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/plugin/webview/modeltools/FileChooserHelper", "onRequestPermissionsResult", "(Landroid/app/Activity;I[Ljava/lang/String;[I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                return true;
            }
            this.f118229e = null;
            mo68063f(activity, 201, 0, (Intent) null);
            return true;
        }
    }

    /* renamed from: h */
    public final void mo68065h(Activity activity, Intent intent) {
        Class cls = C103918d.class;
        if (!((C103918d) C86312j.m106911c(cls)).Lb0(activity, "android.permission.CAMERA")) {
            ((C103918d) C86312j.m106911c(cls)).mo125790zt(activity, "android.permission.CAMERA", 119);
            this.f118229e = Pair.create(intent, 201);
            Log.m105920e("MicroMsg.WebViewUI.FileChooser", "openFileChooser takePhotoFromSystemCamera no camera Permission");
            return;
        }
        mo68061d(activity, intent);
    }
}
