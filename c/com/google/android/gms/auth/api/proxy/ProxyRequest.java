package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Patterns;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new zzd();
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int LAST_CODE = 7;
    public static final int VERSION_CODE = 2;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final String url;
    private final int versionCode;
    private Bundle zzdw;

    public static class Builder {
        private String zzdx;
        private int zzdy = ProxyRequest.HTTP_METHOD_GET;
        private long zzdz = 3000;
        private byte[] zzea = null;
        private Bundle zzeb = new Bundle();

        public Builder(String str) {
            Preconditions.checkNotEmpty(str);
            if (Patterns.WEB_URL.matcher(str).matches()) {
                this.zzdx = str;
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("The supplied url [ ");
            sb.append(str);
            sb.append("] is not match Patterns.WEB_URL!");
            throw new IllegalArgumentException(sb.toString());
        }

        public ProxyRequest build() {
            if (this.zzea == null) {
                this.zzea = new byte[0];
            }
            return new ProxyRequest(2, this.zzdx, this.zzdy, this.zzdz, this.zzea, this.zzeb);
        }

        public Builder putHeader(String str, String str2) {
            Preconditions.checkNotEmpty(str, "Header name cannot be null or empty!");
            Bundle bundle = this.zzeb;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        public Builder setBody(byte[] bArr) {
            this.zzea = bArr;
            return this;
        }

        public Builder setHttpMethod(int i) {
            Preconditions.checkArgument(i >= 0 && i <= ProxyRequest.LAST_CODE, "Unrecognized http method code.");
            this.zzdy = i;
            return this;
        }

        public Builder setTimeoutMillis(long j) {
            Preconditions.checkArgument(j >= 0, "The specified timeout must be non-negative.");
            this.zzdz = j;
            return this;
        }
    }

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.versionCode = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.zzdw = bundle;
    }

    public Map<String, String> getHeaderMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.zzdw.size());
        for (String next : this.zzdw.keySet()) {
            linkedHashMap.put(next, this.zzdw.getString(next));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String str = this.url;
        int i = this.httpMethod;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.url, false);
        SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        SafeParcelWriter.writeBundle(parcel, 5, this.zzdw, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
