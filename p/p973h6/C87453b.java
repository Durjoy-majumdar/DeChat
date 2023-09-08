package p973h6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.eclipsesource.mmv8.Platform;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: h6.b */
public class C87453b implements MethodChannel.MethodCallHandler, PluginRegistry.ActivityResultListener {

    /* renamed from: d */
    public final Context f253419d;

    /* renamed from: e */
    public Activity f253420e;

    /* renamed from: f */
    public MethodChannel.Result f253421f;

    /* renamed from: h6.b$a */
    public static class C87454a extends Exception {

        /* renamed from: d */
        public final String f253422d;

        /* renamed from: e */
        public final Object f253423e;

        /* renamed from: f */
        public final String f253424f;

        public C87454a(String str, String str2, Object obj) {
            this.f253424f = str;
            this.f253422d = str2;
            this.f253423e = obj;
        }
    }

    public C87453b(Context context, Activity activity) {
        this.f253419d = context;
        this.f253420e = activity;
    }

    /* JADX WARNING: type inference failed for: r1v45, types: [android.text.Spanned] */
    /* JADX WARNING: type inference failed for: r1v46, types: [android.text.Spanned] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent mo121909a(p172io.flutter.plugin.common.MethodCall r12) {
        /*
            r11 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "mailto:"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "android.intent.action.SENDTO"
            r0.<init>(r2, r1)
            java.lang.String r1 = "subject"
            boolean r2 = r12.hasArgument(r1)
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0027
            java.lang.Object r1 = r12.argument(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = r3
        L_0x0022:
            java.lang.String r2 = "android.intent.extra.SUBJECT"
            r0.putExtra(r2, r1)
        L_0x0027:
            java.lang.String r1 = "body"
            boolean r2 = r12.hasArgument(r1)
            r4 = 0
            if (r2 == 0) goto L_0x0062
            java.lang.Object r1 = r12.argument(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0039
            r3 = r1
        L_0x0039:
            java.lang.String r1 = "isHTML"
            boolean r2 = r12.hasArgument(r1)
            if (r2 == 0) goto L_0x005d
            java.lang.Object r1 = r12.argument(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r1 < r2) goto L_0x0058
            android.text.Spanned r1 = android.text.Html.fromHtml(r3, r4)
            goto L_0x005c
        L_0x0058:
            android.text.Spanned r1 = android.text.Html.fromHtml(r3)
        L_0x005c:
            r3 = r1
        L_0x005d:
            java.lang.String r1 = "android.intent.extra.TEXT"
            r0.putExtra(r1, r3)
        L_0x0062:
            java.lang.String r1 = "recipients"
            boolean r2 = r12.hasArgument(r1)
            if (r2 == 0) goto L_0x0082
            java.lang.Object r1 = r12.argument(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0079:
            java.lang.String[] r1 = r11.mo121910b(r1)
            java.lang.String r2 = "android.intent.extra.EMAIL"
            r0.putExtra(r2, r1)
        L_0x0082:
            java.lang.String r1 = "ccRecipients"
            boolean r2 = r12.hasArgument(r1)
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r1 = r12.argument(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x0093
            goto L_0x0098
        L_0x0093:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0098:
            java.lang.String[] r1 = r11.mo121910b(r1)
            java.lang.String r2 = "android.intent.extra.CC"
            r0.putExtra(r2, r1)
        L_0x00a1:
            java.lang.String r1 = "bccRecipients"
            boolean r2 = r12.hasArgument(r1)
            if (r2 == 0) goto L_0x00c0
            java.lang.Object r1 = r12.argument(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x00b7:
            java.lang.String[] r1 = r11.mo121910b(r1)
            java.lang.String r2 = "android.intent.extra.BCC"
            r0.putExtra(r2, r1)
        L_0x00c0:
            java.lang.String r1 = "attachments"
            boolean r2 = r12.hasArgument(r1)
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0135
            java.lang.Object r1 = r12.argument(r1)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto L_0x012b
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0135
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6 = 0
        L_0x00de:
            int r7 = r1.size()
            if (r6 >= r7) goto L_0x0115
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            r0.addFlags(r5)
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            android.content.Context r7 = r11.f253419d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.Context r10 = r11.f253419d
            java.lang.String r10 = r10.getPackageName()
            r9.append(r10)
            java.lang.String r10 = ".adv_provider"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.net.Uri r7 = androidx.core.content.FileProvider.getUriForFile(r7, r9, r8)
            r2.add(r7)
            int r6 = r6 + 1
            goto L_0x00de
        L_0x0115:
            java.lang.String r1 = "android.intent.action.SEND_MULTIPLE"
            android.content.Intent r1 = r0.setAction(r1)
            java.lang.String r6 = "message/rfc822"
            android.content.Intent r1 = r1.setType(r6)
            java.lang.String r6 = "android.intent.extra.STREAM"
            android.content.Intent r1 = r1.putExtra(r6, r2)
            r1.addFlags(r5)
            goto L_0x0135
        L_0x012b:
            h6.b$a r12 = new h6.b$a
            java.lang.String r0 = "Attachments_null"
            java.lang.String r1 = "Attachments cannot be null"
            r12.<init>(r0, r1, r3)
            throw r12
        L_0x0135:
            android.content.Context r1 = r11.f253419d
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryIntentActivities(r0, r4)
            if (r1 == 0) goto L_0x0178
            int r2 = r1.size()
            if (r2 == 0) goto L_0x0178
            int r1 = r1.size()
            if (r1 != r5) goto L_0x014e
            return r0
        L_0x014e:
            java.lang.String r1 = "appSchema"
            boolean r2 = r12.hasArgument(r1)
            if (r2 == 0) goto L_0x0177
            java.lang.Object r2 = r12.argument(r1)
            if (r2 == 0) goto L_0x0177
            java.lang.Object r2 = r12.argument(r1)
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r3 = r11.f253419d     // Catch:{ NameNotFoundException -> 0x016c }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016c }
            r3.getPackageInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x016c }
            r4 = 1
        L_0x016c:
            if (r4 == 0) goto L_0x0177
            java.lang.Object r12 = r12.argument(r1)
            java.lang.String r12 = (java.lang.String) r12
            r0.setPackage(r12)
        L_0x0177:
            return r0
        L_0x0178:
            h6.b$a r12 = new h6.b$a
            java.lang.String r0 = "not_available"
            java.lang.String r1 = "no email Managers available"
            r12.<init>(r0, r1, r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p973h6.C87453b.mo121909a(io.flutter.plugin.common.MethodCall):android.content.Intent");
    }

    /* renamed from: b */
    public final String[] mo121910b(ArrayList<String> arrayList) {
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        return strArr;
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        MethodChannel.Result result;
        if (i == 564 && (result = this.f253421f) != null) {
            result.success(Platform.ANDROID);
        }
        return false;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("send")) {
            this.f253421f = result;
            try {
                Intent a = mo121909a(methodCall);
                Activity activity = this.f253420e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(564);
                aVar.mo10233c(a);
                C117292a.m165364j(activity, aVar.mo10232b(), "com/dataxad/flutter_mailer/MethodCallHandlerImpl", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } catch (C87454a e) {
                result.error(e.f253424f, e.f253422d, e.f253423e);
                this.f253421f = null;
            } catch (Exception e2) {
                e2.getMessage();
                result.error("UNKNOWN", e2.getMessage(), (Object) null);
                this.f253421f = null;
            }
        } else if (methodCall.method.equals("isAppInstalled")) {
            if (methodCall.hasArgument("appSchema") && methodCall.argument("appSchema") != null) {
                boolean z = false;
                try {
                    this.f253419d.getPackageManager().getPackageInfo((String) methodCall.argument("appSchema"), 0);
                    z = true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (z) {
                    result.success(Boolean.TRUE);
                    return;
                }
            }
            result.success(Boolean.FALSE);
        } else {
            result.notImplemented();
        }
    }
}
