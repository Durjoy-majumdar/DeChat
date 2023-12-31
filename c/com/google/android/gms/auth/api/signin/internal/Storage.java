package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.xweb.file.XVFSFile;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

public class Storage {
    private static final Lock zzaf = new ReentrantLock();
    private static Storage zzag;
    private final Lock zzah = new ReentrantLock();
    private final SharedPreferences zzai;

    private Storage(Context context) {
        this.zzai = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static Storage getInstance(Context context) {
        Preconditions.checkNotNull(context);
        Lock lock = zzaf;
        lock.lock();
        try {
            if (zzag == null) {
                zzag = new Storage(context.getApplicationContext());
            }
            Storage storage = zzag;
            lock.unlock();
            return storage;
        } catch (Throwable th) {
            zzaf.unlock();
            throw th;
        }
    }

    public static void setInstance(Storage storage) {
        Lock lock = zzaf;
        lock.lock();
        try {
            zzag = storage;
            lock.unlock();
        } catch (Throwable th) {
            zzaf.unlock();
            throw th;
        }
    }

    private static String zza(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(XVFSFile.PATH_SEPARATOR);
        sb.append(str2);
        return sb.toString();
    }

    private final GoogleSignInAccount zzb(String str) {
        String fromStore;
        if (!TextUtils.isEmpty(str) && (fromStore = getFromStore(zza("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.fromJsonString(fromStore);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final GoogleSignInOptions zzc(String str) {
        String fromStore;
        if (!TextUtils.isEmpty(str) && (fromStore = getFromStore(zza("googleSignInOptions", str))) != null) {
            try {
                return GoogleSignInOptions.fromJsonString(fromStore);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public void clear() {
        this.zzah.lock();
        try {
            this.zzai.edit().clear().apply();
        } finally {
            this.zzah.unlock();
        }
    }

    public String getFromStore(String str) {
        this.zzah.lock();
        try {
            return this.zzai.getString(str, (String) null);
        } finally {
            this.zzah.unlock();
        }
    }

    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        return zzb(getFromStore("defaultGoogleSignInAccount"));
    }

    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        return zzc(getFromStore("defaultGoogleSignInAccount"));
    }

    public String getSavedRefreshToken() {
        return getFromStore("refreshToken");
    }

    public void removeFromStore(String str) {
        this.zzah.lock();
        try {
            this.zzai.edit().remove(str).apply();
        } finally {
            this.zzah.unlock();
        }
    }

    public void removeSavedDefaultGoogleSignInAccount() {
        String fromStore = getFromStore("defaultGoogleSignInAccount");
        removeFromStore("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(fromStore)) {
            removeFromStore(zza("googleSignInAccount", fromStore));
            removeFromStore(zza("googleSignInOptions", fromStore));
        }
    }

    public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        saveToStore("defaultGoogleSignInAccount", googleSignInAccount.getObfuscatedIdentifier());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String obfuscatedIdentifier = googleSignInAccount.getObfuscatedIdentifier();
        saveToStore(zza("googleSignInAccount", obfuscatedIdentifier), googleSignInAccount.toJsonForStorage());
        saveToStore(zza("googleSignInOptions", obfuscatedIdentifier), googleSignInOptions.toJson());
    }

    public void saveRefreshToken(String str) {
        if (!TextUtils.isEmpty(str)) {
            saveToStore("refreshToken", str);
        }
    }

    public void saveToStore(String str, String str2) {
        this.zzah.lock();
        try {
            this.zzai.edit().putString(str, str2).apply();
        } finally {
            this.zzah.unlock();
        }
    }
}
