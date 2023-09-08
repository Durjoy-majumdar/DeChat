package p1173b9;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* renamed from: b9.a */
public final class C113148a {

    /* renamed from: a */
    public final String f338571a;

    /* renamed from: b */
    public final String f338572b;

    /* renamed from: c */
    public final String f338573c;

    /* renamed from: d */
    public final String f338574d;

    /* renamed from: e */
    public final String f338575e;

    /* renamed from: f */
    public final String f338576f;

    /* renamed from: g */
    public final String f338577g;

    public C113148a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f338572b = str;
        this.f338571a = str2;
        this.f338573c = str3;
        this.f338574d = str4;
        this.f338575e = str5;
        this.f338576f = str6;
        this.f338577g = str7;
    }

    /* renamed from: a */
    public static C113148a m154813a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C113148a(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C113148a)) {
            return false;
        }
        C113148a aVar = (C113148a) obj;
        return Objects.equal(this.f338572b, aVar.f338572b) && Objects.equal(this.f338571a, aVar.f338571a) && Objects.equal(this.f338573c, aVar.f338573c) && Objects.equal(this.f338574d, aVar.f338574d) && Objects.equal(this.f338575e, aVar.f338575e) && Objects.equal(this.f338576f, aVar.f338576f) && Objects.equal(this.f338577g, aVar.f338577g);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f338572b, this.f338571a, this.f338573c, this.f338574d, this.f338575e, this.f338576f, this.f338577g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f338572b).add("apiKey", this.f338571a).add("databaseUrl", this.f338573c).add("gcmSenderId", this.f338575e).add("storageBucket", this.f338576f).add("projectId", this.f338577g).toString();
    }
}
