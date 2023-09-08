package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new GoogleSignInOptionsCreator();
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN = new Builder().requestId().requestProfile().build();
    public static final Scope SCOPE_EMAIL = new Scope(Scopes.EMAIL);
    public static final Scope SCOPE_GAMES = new Scope(Scopes.GAMES);
    public static final Scope SCOPE_GAMES_LITE;
    public static final Scope SCOPE_OPEN_ID = new Scope(Scopes.OPEN_ID);
    public static final Scope SCOPE_PROFILE = new Scope(Scopes.PROFILE);
    private static Comparator<Scope> zzaa = new zzb();
    private final int versionCode;
    /* access modifiers changed from: private */
    public final ArrayList<Scope> zzr;
    /* access modifiers changed from: private */
    public Account zzs;
    /* access modifiers changed from: private */
    public boolean zzt;
    /* access modifiers changed from: private */
    public final boolean zzu;
    /* access modifiers changed from: private */
    public final boolean zzv;
    /* access modifiers changed from: private */
    public String zzw;
    /* access modifiers changed from: private */
    public String zzx;
    /* access modifiers changed from: private */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> zzy;
    private Map<Integer, GoogleSignInOptionsExtensionParcelable> zzz;

    public static final class Builder {
        private Set<Scope> mScopes = new HashSet();
        private Map<Integer, GoogleSignInOptionsExtensionParcelable> zzab = new HashMap();
        private Account zzs;
        private boolean zzt;
        private boolean zzu;
        private boolean zzv;
        private String zzw;
        private String zzx;

        public Builder() {
        }

        public Builder(GoogleSignInOptions googleSignInOptions) {
            Preconditions.checkNotNull(googleSignInOptions);
            this.mScopes = new HashSet(googleSignInOptions.zzr);
            this.zzu = googleSignInOptions.zzu;
            this.zzv = googleSignInOptions.zzv;
            this.zzt = googleSignInOptions.zzt;
            this.zzw = googleSignInOptions.zzw;
            this.zzs = googleSignInOptions.zzs;
            this.zzx = googleSignInOptions.zzx;
            this.zzab = GoogleSignInOptions.zza((List<GoogleSignInOptionsExtensionParcelable>) googleSignInOptions.zzy);
        }

        private final String zza(String str) {
            Preconditions.checkNotEmpty(str);
            String str2 = this.zzw;
            Preconditions.checkArgument(str2 == null || str2.equals(str), "two different server client ids provided");
            return str;
        }

        public final Builder addExtension(GoogleSignInOptionsExtension googleSignInOptionsExtension) {
            if (!this.zzab.containsKey(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()))) {
                if (googleSignInOptionsExtension.getImpliedScopes() != null) {
                    this.mScopes.addAll(googleSignInOptionsExtension.getImpliedScopes());
                }
                this.zzab.put(Integer.valueOf(googleSignInOptionsExtension.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(googleSignInOptionsExtension));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }

        public final GoogleSignInOptions build() {
            if (this.mScopes.contains(GoogleSignInOptions.SCOPE_GAMES)) {
                Set<Scope> set = this.mScopes;
                Scope scope = GoogleSignInOptions.SCOPE_GAMES_LITE;
                if (set.contains(scope)) {
                    this.mScopes.remove(scope);
                }
            }
            if (this.zzt && (this.zzs == null || !this.mScopes.isEmpty())) {
                requestId();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.mScopes), this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzab, (zzb) null);
        }

        public final Builder requestEmail() {
            this.mScopes.add(GoogleSignInOptions.SCOPE_EMAIL);
            return this;
        }

        public final Builder requestId() {
            this.mScopes.add(GoogleSignInOptions.SCOPE_OPEN_ID);
            return this;
        }

        public final Builder requestIdToken(String str) {
            this.zzt = true;
            this.zzw = zza(str);
            return this;
        }

        public final Builder requestPhatIdToken(String str) {
            return requestIdToken(str).requestProfile().requestEmail();
        }

        public final Builder requestProfile() {
            this.mScopes.add(GoogleSignInOptions.SCOPE_PROFILE);
            return this;
        }

        public final Builder requestScopes(Scope scope, Scope... scopeArr) {
            this.mScopes.add(scope);
            this.mScopes.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public final Builder requestServerAuthCode(String str) {
            return requestServerAuthCode(str, false);
        }

        public final Builder requestServerAuthCode(String str, boolean z) {
            this.zzu = true;
            this.zzw = zza(str);
            this.zzv = z;
            return this;
        }

        public final Builder setAccount(Account account) {
            this.zzs = (Account) Preconditions.checkNotNull(account);
            return this;
        }

        public final Builder setAccountName(String str) {
            this.zzs = new Account(Preconditions.checkNotEmpty(str), "com.google");
            return this;
        }

        public final Builder setHostedDomain(String str) {
            this.zzx = Preconditions.checkNotEmpty(str);
            return this;
        }
    }

    static {
        Scope scope = new Scope(Scopes.GAMES_LITE);
        SCOPE_GAMES_LITE = scope;
        DEFAULT_GAMES_SIGN_IN = new Builder().requestScopes(scope, new Scope[0]).build();
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList<GoogleSignInOptionsExtensionParcelable> arrayList2) {
        this(i, arrayList, account, z, z2, z3, str, str2, zza((List<GoogleSignInOptionsExtensionParcelable>) arrayList2));
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map) {
        this.versionCode = i;
        this.zzr = arrayList;
        this.zzs = account;
        this.zzt = z;
        this.zzu = z2;
        this.zzv = z3;
        this.zzw = str;
        this.zzx = str2;
        this.zzy = new ArrayList<>(map.values());
        this.zzz = map;
    }

    public /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, zzb zzb) {
        this(3, (ArrayList<Scope>) arrayList, account, z, z2, z3, str, str2, (Map<Integer, GoogleSignInOptionsExtensionParcelable>) map);
    }

    public static GoogleSignInOptions fromJsonString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_SCOPES);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.optString("accountName", (String) null);
        return new GoogleSignInOptions(3, (ArrayList<Scope>) new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", (String) null), jSONObject.optString("hostedDomain", (String) null), (Map<Integer, GoogleSignInOptionsExtensionParcelable>) new HashMap());
    }

    /* access modifiers changed from: private */
    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> zza(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable next : list) {
            hashMap.put(Integer.valueOf(next.getType()), next);
        }
        return hashMap;
    }

    private final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.zzr, zzaa);
            ArrayList<Scope> arrayList = this.zzr;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.getScopeUri());
            }
            jSONObject.put(Constants.KEY_SCOPES, jSONArray);
            Account account = this.zzs;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.zzt);
            jSONObject.put("forceCodeForRefreshToken", this.zzv);
            jSONObject.put("serverAuthRequested", this.zzu);
            if (!TextUtils.isEmpty(this.zzw)) {
                jSONObject.put("serverClientId", this.zzw);
            }
            if (!TextUtils.isEmpty(this.zzx)) {
                jSONObject.put("hostedDomain", this.zzx);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r1.equals(r4.getAccount()) != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (r3.zzw.equals(r4.getServerClientId()) != false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0082 }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.zzy     // Catch:{ ClassCastException -> 0x0082 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 > 0) goto L_0x0082
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.zzy     // Catch:{ ClassCastException -> 0x0082 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 <= 0) goto L_0x0017
            goto L_0x0082
        L_0x0017:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zzr     // Catch:{ ClassCastException -> 0x0082 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0082 }
            java.util.ArrayList r2 = r4.getScopes()     // Catch:{ ClassCastException -> 0x0082 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 != r2) goto L_0x0082
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.zzr     // Catch:{ ClassCastException -> 0x0082 }
            java.util.ArrayList r2 = r4.getScopes()     // Catch:{ ClassCastException -> 0x0082 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 != 0) goto L_0x0034
            goto L_0x0082
        L_0x0034:
            android.accounts.Account r1 = r3.zzs     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 != 0) goto L_0x003f
            android.accounts.Account r1 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 != 0) goto L_0x0082
            goto L_0x0049
        L_0x003f:
            android.accounts.Account r2 = r4.getAccount()     // Catch:{ ClassCastException -> 0x0082 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 == 0) goto L_0x0082
        L_0x0049:
            java.lang.String r1 = r3.zzw     // Catch:{ ClassCastException -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = r4.getServerClientId()     // Catch:{ ClassCastException -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 == 0) goto L_0x0082
            goto L_0x0068
        L_0x005c:
            java.lang.String r1 = r3.zzw     // Catch:{ ClassCastException -> 0x0082 }
            java.lang.String r2 = r4.getServerClientId()     // Catch:{ ClassCastException -> 0x0082 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 == 0) goto L_0x0082
        L_0x0068:
            boolean r1 = r3.zzv     // Catch:{ ClassCastException -> 0x0082 }
            boolean r2 = r4.isForceCodeForRefreshToken()     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 != r2) goto L_0x0082
            boolean r1 = r3.zzt     // Catch:{ ClassCastException -> 0x0082 }
            boolean r2 = r4.isIdTokenRequested()     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 != r2) goto L_0x0082
            boolean r1 = r3.zzu     // Catch:{ ClassCastException -> 0x0082 }
            boolean r4 = r4.isServerAuthCodeRequested()     // Catch:{ ClassCastException -> 0x0082 }
            if (r1 != r4) goto L_0x0082
            r4 = 1
            return r4
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public Account getAccount() {
        return this.zzs;
    }

    public GoogleSignInOptionsExtensionParcelable getExtension(int i) {
        return this.zzz.get(Integer.valueOf(i));
    }

    public ArrayList<GoogleSignInOptionsExtensionParcelable> getExtensions() {
        return this.zzy;
    }

    public String getHostedDomain() {
        return this.zzx;
    }

    public Scope[] getScopeArray() {
        ArrayList<Scope> arrayList = this.zzr;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    public ArrayList<Scope> getScopes() {
        return new ArrayList<>(this.zzr);
    }

    public String getServerClientId() {
        return this.zzw;
    }

    public boolean hasExtension(int i) {
        return this.zzz.containsKey(Integer.valueOf(i));
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.zzr;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.getScopeUri());
        }
        Collections.sort(arrayList);
        return new HashAccumulator().addObject(arrayList).addObject(this.zzs).addObject(this.zzw).addBoolean(this.zzv).addBoolean(this.zzt).addBoolean(this.zzu).hash();
    }

    public boolean isForceCodeForRefreshToken() {
        return this.zzv;
    }

    public boolean isIdTokenRequested() {
        return this.zzt;
    }

    public boolean isServerAuthCodeRequested() {
        return this.zzu;
    }

    public String toJson() {
        return zza().toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.versionCode);
        SafeParcelWriter.writeTypedList(parcel, 2, getScopes(), false);
        SafeParcelWriter.writeParcelable(parcel, 3, getAccount(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, isIdTokenRequested());
        SafeParcelWriter.writeBoolean(parcel, 5, isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(parcel, 6, isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(parcel, 7, getServerClientId(), false);
        SafeParcelWriter.writeString(parcel, 8, getHostedDomain(), false);
        SafeParcelWriter.writeTypedList(parcel, 9, getExtensions(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
