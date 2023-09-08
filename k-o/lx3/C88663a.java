package lx3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.dynamite.ProviderConstants;
import gy3.C87412m;
import java.security.MessageDigest;
import java.util.HashMap;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: lx3.a */
public final class C88663a implements MethodChannel.MethodCallHandler, FlutterPlugin {

    /* renamed from: d */
    public Context f255980d;

    /* renamed from: e */
    public MethodChannel f255981e;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        if ((r5.length == 0) != false) goto L_0x007d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo123101a(android.content.pm.PackageManager r5) {
        /*
            r4 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            r2 = 28
            if (r1 < r2) goto L_0x0060
            android.content.Context r1 = r4.f255980d     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            gy3.C87412m.m108591d(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            r2 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            android.content.pm.SigningInfo r5 = r5.signingInfo     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            if (r5 != 0) goto L_0x001b
            return r0
        L_0x001b:
            boolean r1 = r5.hasMultipleSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            if (r1 == 0) goto L_0x0040
            android.content.pm.Signature[] r5 = r5.getApkContentsSigners()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r1 = "signingInfo.apkContentsSigners"
            gy3.C87412m.m108593f(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.Object r5 = sx3.C110823p.m150976B(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r1 = "signingInfo.apkContentsS…ers.first().toByteArray()"
            gy3.C87412m.m108593f(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r5 = r4.mo123102b(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            goto L_0x005e
        L_0x0040:
            android.content.pm.Signature[] r5 = r5.getSigningCertificateHistory()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r1 = "signingInfo.signingCertificateHistory"
            gy3.C87412m.m108593f(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.Object r5 = sx3.C110823p.m150976B(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r1 = "signingInfo.signingCerti…ory.first().toByteArray()"
            gy3.C87412m.m108593f(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r5 = r4.mo123102b(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
        L_0x005e:
            r0 = r5
            goto L_0x00a8
        L_0x0060:
            android.content.Context r1 = r4.f255980d     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            gy3.C87412m.m108591d(r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            r2 = 64
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r1, r2)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            android.content.pm.Signature[] r5 = r5.signatures     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x007d
            int r3 = r5.length     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            if (r3 != 0) goto L_0x007a
            r3 = 1
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r3 == 0) goto L_0x007e
        L_0x007d:
            r1 = 1
        L_0x007e:
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = "packageInfo.signatures"
            gy3.C87412m.m108593f(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.Object r1 = sx3.C110823p.m150976B(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            if (r1 != 0) goto L_0x008d
            goto L_0x00a8
        L_0x008d:
            java.lang.String r1 = "signatures"
            gy3.C87412m.m108593f(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.Object r5 = sx3.C110823p.m150976B(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            android.content.pm.Signature r5 = (android.content.pm.Signature) r5     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            byte[] r5 = r5.toByteArray()     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r1 = "signatures.first().toByteArray()"
            gy3.C87412m.m108593f(r5, r1)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            java.lang.String r5 = r4.mo123102b(r5)     // Catch:{ NameNotFoundException | NoSuchAlgorithmException -> 0x00a8 }
            goto L_0x005e
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lx3.C88663a.mo123101a(android.content.pm.PackageManager):java.lang.String");
    }

    /* renamed from: b */
    public final String mo123102b(byte[] bArr) {
        MessageDigest instance = MessageDigest.getInstance(AndroidUtilsLight.DIGEST_ALGORITHM_SHA1);
        instance.update(bArr);
        byte[] digest = instance.digest();
        C87412m.m108593f(digest, "hashText");
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(digest.length * 2)];
        int length = digest.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            byte b = digest[i] & ExifInterface.MARKER;
            int i3 = i * 2;
            cArr2[i3] = cArr[b >>> 4];
            cArr2[i3 + 1] = cArr[b & 15];
            i = i2;
        }
        return new String(cArr2);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f255980d = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/package_info");
        this.f255981e = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f255980d = null;
        MethodChannel methodChannel = this.f255981e;
        C87412m.m108591d(methodChannel);
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f255981e = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        C87412m.m108594g(methodCall, "call");
        C87412m.m108594g(result, "result");
        try {
            if (C87412m.m108589b(methodCall.method, "getAll")) {
                Context context = this.f255980d;
                C87412m.m108591d(context);
                PackageManager packageManager = context.getPackageManager();
                Context context2 = this.f255980d;
                C87412m.m108591d(context2);
                PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                String a = mo123101a(packageManager);
                HashMap hashMap = new HashMap();
                hashMap.put("appName", packageInfo.applicationInfo.loadLabel(packageManager).toString());
                Context context3 = this.f255980d;
                C87412m.m108591d(context3);
                hashMap.put("packageName", context3.getPackageName());
                hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, packageInfo.versionName);
                hashMap.put("buildNumber", String.valueOf(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : (long) packageInfo.versionCode));
                if (a != null) {
                    hashMap.put("buildSignature", a);
                }
                result.success(hashMap);
                return;
            }
            result.notImplemented();
        } catch (PackageManager.NameNotFoundException e) {
            result.error("Name not found", e.getMessage(), (Object) null);
        }
    }
}
