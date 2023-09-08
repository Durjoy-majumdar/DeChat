package com.tencent.soter.core.biometric;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import ot3.C117896h;
import ot3.C21881e;

final class FingerprintManagerProxy {
    public static final String FINGERPRINT_SERVICE = "fingerprint";
    private static final String TAG = "Soter.FingerprintManagerProxy";
    public static boolean sCLOSE_API31;

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(AuthenticationResultInternal authenticationResultInternal) {
        }
    }

    public static final class AuthenticationResultInternal {
        private CryptoObject mCryptoObject;

        public AuthenticationResultInternal(CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public static void authenticate(Context context, CryptoObject cryptoObject, int i, Object obj, AuthenticationCallback authenticationCallback, Handler handler, Bundle bundle) {
        boolean z = bundle.getBoolean("use_biometric_prompt");
        int i2 = Build.VERSION.SDK_INT;
        C21881e.m25084c(TAG, "use_biometric_prompt: %s, sdk_version: %s", Boolean.valueOf(z), Integer.valueOf(i2));
        if (!z || i2 < 28) {
            authenticateLegacy(context, cryptoObject, i, obj, authenticationCallback, handler);
        } else {
            authenticateApi28(context, cryptoObject, i, obj, authenticationCallback, handler, bundle);
        }
    }

    private static void authenticateApi28(Context context, CryptoObject cryptoObject, int i, Object obj, final AuthenticationCallback authenticationCallback, Handler handler, Bundle bundle) {
        if (checkSelfPermission(context, "android.permission.USE_BIOMETRIC") != 0) {
            C21881e.m25083b(TAG, "soter: permission check failed: authenticate", new Object[0]);
            return;
        }
        BiometricPrompt.Builder builder = new BiometricPrompt.Builder(context);
        builder.setDeviceCredentialAllowed(false);
        if (Build.VERSION.SDK_INT >= 30) {
            builder.setAllowedAuthenticators(15);
        }
        builder.setTitle(bundle.getString("prompt_title"));
        builder.setSubtitle(bundle.getString("prompt_subtitle"));
        builder.setDescription(bundle.getString("prompt_description"));
        String string = bundle.getString("prompt_button");
        if (TextUtils.isEmpty(string)) {
            string = context.getString(17039360);
        }
        builder.setNegativeButton(string, context.getMainExecutor(), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                AuthenticationCallback.this.onAuthenticationError(10310, "click negative button");
            }
        });
        builder.build().authenticate((CancellationSignal) obj, context.getMainExecutor(), wrapCallback2(authenticationCallback));
    }

    private static void authenticateLegacy(Context context, CryptoObject cryptoObject, int i, Object obj, AuthenticationCallback authenticationCallback, Handler handler) {
        if (checkSelfPermission(context, "android.permission.USE_FINGERPRINT") != 0) {
            C21881e.m25083b(TAG, "soter: permission check failed: authenticate", new Object[0]);
            return;
        }
        try {
            FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager != null) {
                fingerprintManager.authenticate(wrapCryptoObject(cryptoObject), (CancellationSignal) obj, i, wrapCallback(authenticationCallback), handler);
                return;
            }
            C21881e.m25083b(TAG, "soter: fingerprint manager is null in authenticate! Should never happen", new Object[0]);
        } catch (SecurityException unused) {
            C21881e.m25083b(TAG, "soter: triggered SecurityException in authenticate! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
        }
    }

    private static int checkSelfPermission(Context context, String str) {
        if (context == null) {
            C21881e.m25083b(TAG, "soter: check self permission: context is null", new Object[0]);
            return -1;
        } else if (C117896h.m166297b(str)) {
            C21881e.m25083b(TAG, "soter: requested permission is null or nil", new Object[0]);
            return -1;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return context.checkSelfPermission(str);
        } else {
            C21881e.m25082a(TAG, "soter: below 23. directly return.", new Object[0]);
            return 0;
        }
    }

    private static FingerprintManager getFingerprintManager(Context context) {
        return (FingerprintManager) context.getSystemService(FINGERPRINT_SERVICE);
    }

    public static boolean hasEnrolledFingerprints(Context context) {
        if (checkSelfPermission(context, "android.permission.USE_FINGERPRINT") != 0) {
            C21881e.m25083b(TAG, "soter: permission check failed: hasEnrolledBiometric", new Object[0]);
            return false;
        }
        try {
            FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager != null) {
                return fingerprintManager.hasEnrolledFingerprints();
            }
            C21881e.m25083b(TAG, "soter: fingerprint manager is null in hasEnrolledBiometric! Should never happen", new Object[0]);
            return false;
        } catch (SecurityException unused) {
            C21881e.m25083b(TAG, "soter: triggered SecurityException in hasEnrolledBiometric! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
            return false;
        }
    }

    public static boolean isHardwareDetected(Context context) {
        if (checkSelfPermission(context, "android.permission.USE_FINGERPRINT") != 0) {
            C21881e.m25083b(TAG, "soter: permission check failed: isHardwareDetected", new Object[0]);
            return false;
        }
        try {
            FingerprintManager fingerprintManager = getFingerprintManager(context);
            if (fingerprintManager != null) {
                return fingerprintManager.isHardwareDetected();
            }
            C21881e.m25083b(TAG, "soter: fingerprint manager is null in isHardwareDetected! Should never happen", new Object[0]);
            return false;
        } catch (SecurityException unused) {
            C21881e.m25083b(TAG, "soter: triggered SecurityException in isHardwareDetected! Make sure you declared USE_FINGERPRINT in AndroidManifest.xml", new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static CryptoObject unwrapCryptoObject(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new CryptoObject(cryptoObject.getMac());
        }
        return null;
    }

    private static FingerprintManager.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
        return new FingerprintManager.AuthenticationCallback() {
            public void onAuthenticationError(int i, CharSequence charSequence) {
                C21881e.m25082a(FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationError", new Object[0]);
                AuthenticationCallback.this.onAuthenticationError(i, charSequence);
            }

            public void onAuthenticationFailed() {
                C21881e.m25082a(FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationFailed", new Object[0]);
                AuthenticationCallback.this.onAuthenticationFailed();
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                C21881e.m25082a(FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationHelp", new Object[0]);
                AuthenticationCallback.this.onAuthenticationHelp(i, charSequence);
            }

            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                C21881e.m25082a(FingerprintManagerProxy.TAG, "hy: lowest level return onAuthenticationSucceeded", new Object[0]);
                AuthenticationCallback.this.onAuthenticationSucceeded(new AuthenticationResultInternal(FingerprintManagerProxy.unwrapCryptoObject(authenticationResult.getCryptoObject())));
            }
        };
    }

    private static BiometricPrompt.AuthenticationCallback wrapCallback2(final AuthenticationCallback authenticationCallback) {
        return new BiometricPrompt.AuthenticationCallback() {
            public void onAuthenticationError(int i, CharSequence charSequence) {
                AuthenticationCallback.this.onAuthenticationError(i, charSequence);
            }

            public void onAuthenticationFailed() {
                AuthenticationCallback.this.onAuthenticationFailed();
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                AuthenticationCallback.this.onAuthenticationHelp(i, charSequence);
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                AuthenticationCallback.this.onAuthenticationSucceeded(new AuthenticationResultInternal(FingerprintManagerProxy.unwrapCryptoObject(authenticationResult.getCryptoObject())));
            }
        };
    }

    private static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new FingerprintManager.CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new FingerprintManager.CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new FingerprintManager.CryptoObject(cryptoObject.getMac());
        }
        return null;
    }

    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public Cipher getCipher() {
            return this.mCipher;
        }

        public Mac getMac() {
            return this.mMac;
        }

        public Signature getSignature() {
            return this.mSignature;
        }

        public CryptoObject(Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }
    }

    /* access modifiers changed from: private */
    public static CryptoObject unwrapCryptoObject(BiometricPrompt.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new CryptoObject(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new CryptoObject(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new CryptoObject(cryptoObject.getMac());
        }
        return null;
    }
}
