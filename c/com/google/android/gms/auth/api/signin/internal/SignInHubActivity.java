package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0125s;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import java.lang.reflect.Modifier;
import p1202o3.C117643a;
import p1202o3.C117645b;
import p860p3.C117911b;

public class SignInHubActivity extends FragmentActivity {
    private static boolean zzfg;
    private boolean zzfh = false;
    private SignInConfiguration zzfi;
    private boolean zzfj;
    /* access modifiers changed from: private */
    public int zzfk;
    /* access modifiers changed from: private */
    public Intent zzfl;

    public class zzd implements C117643a.C117644a<Void> {
        private zzd() {
        }

        public final C117911b<Void> onCreateLoader(int i, Bundle bundle) {
            return new zzf(SignInHubActivity.this, GoogleApiClient.getAllClients());
        }

        public final /* synthetic */ void onLoadFinished(C117911b bVar, Object obj) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.zzfk, SignInHubActivity.this.zzfl);
            SignInHubActivity.this.finish();
        }

        public final void onLoaderReset(C117911b<Void> bVar) {
        }
    }

    private final void zzd(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        zzfg = false;
    }

    /* JADX INFO: finally extract failed */
    private final void zzu() {
        C117643a supportLoaderManager = getSupportLoaderManager();
        zzd zzd2 = new zzd();
        C117645b bVar = (C117645b) supportLoaderManager;
        if (bVar.f351900b.f351912e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C117645b.C117646a e = bVar.f351900b.f351911d.mo162805e(0, null);
            if (e == null) {
                try {
                    bVar.f351900b.f351912e = true;
                    C117911b onCreateLoader = zzd2.onCreateLoader(0, (Bundle) null);
                    if (onCreateLoader != null) {
                        if (onCreateLoader.getClass().isMemberClass()) {
                            if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                            }
                        }
                        C117645b.C117646a aVar = new C117645b.C117646a(0, (Bundle) null, onCreateLoader, (C117911b) null);
                        bVar.f351900b.f351911d.mo162807g(0, aVar);
                        bVar.f351900b.f351912e = false;
                        C0125s sVar = bVar.f351899a;
                        C117645b.C117647b<D> bVar2 = new C117645b.C117647b<>(aVar.f351903f, zzd2);
                        aVar.observe(sVar, bVar2);
                        C117645b.C117647b<D> bVar3 = aVar.f351905h;
                        if (bVar3 != null) {
                            aVar.removeObserver(bVar3);
                        }
                        aVar.f351904g = sVar;
                        aVar.f351905h = bVar2;
                    } else {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    }
                } catch (Throwable th) {
                    bVar.f351900b.f351912e = false;
                    throw th;
                }
            } else {
                C0125s sVar2 = bVar.f351899a;
                C117645b.C117647b<D> bVar4 = new C117645b.C117647b<>(e.f351903f, zzd2);
                e.observe(sVar2, bVar4);
                C117645b.C117647b<D> bVar5 = e.f351905h;
                if (bVar5 != null) {
                    e.removeObserver(bVar5);
                }
                e.f351904g = sVar2;
                e.f351905h = bVar4;
            }
            zzfg = false;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.zzfh) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                    if (signInAccount != null && signInAccount.getGoogleSignInAccount() != null) {
                        GoogleSignInAccount googleSignInAccount = signInAccount.getGoogleSignInAccount();
                        zzq.zze(this).zzd(this.zzfi.zzt(), googleSignInAccount);
                        intent.removeExtra(GoogleSignInApi.EXTRA_SIGN_IN_ACCOUNT);
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.zzfj = true;
                        this.zzfk = i2;
                        this.zzfl = intent;
                        zzu();
                        return;
                    } else if (intent.hasExtra(OpenSDKTool4Assistant.EXTRA_ERROR_CODE)) {
                        zzd(intent.getIntExtra(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 8));
                        return;
                    }
                }
                zzd(8);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            zzd((int) GoogleSignInStatusCodes.SIGN_IN_FAILED);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) intent.getBundleExtra("config").getParcelable("config");
            this.zzfi = signInConfiguration;
            if (signInConfiguration == null) {
                setResult(0);
                finish();
                return;
            }
            if (!(bundle == null)) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.zzfj = z;
                if (z) {
                    this.zzfk = bundle.getInt("signInResultCode");
                    this.zzfl = (Intent) bundle.getParcelable("signInResultData");
                    zzu();
                }
            } else if (zzfg) {
                setResult(0);
                zzd((int) GoogleSignInStatusCodes.SIGN_IN_CURRENTLY_IN_PROGRESS);
            } else {
                zzfg = true;
                Intent intent2 = new Intent(action);
                intent2.setPackage(action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") ? "com.google.android.gms" : getPackageName());
                intent2.putExtra("config", this.zzfi);
                try {
                    startActivityForResult(intent2, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.zzfh = true;
                    zzd(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            if (valueOf.length() != 0) {
                "Unknown action: ".concat(valueOf);
            }
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zzfj);
        if (this.zzfj) {
            bundle.putInt("signInResultCode", this.zzfk);
            bundle.putParcelable("signInResultData", this.zzfl);
        }
    }
}
