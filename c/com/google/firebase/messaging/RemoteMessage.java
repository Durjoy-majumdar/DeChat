package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Map;
import p1042u.C111055b;
import p545h9.C117073e;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C117073e();

    /* renamed from: d */
    public Bundle f339241d;

    /* renamed from: e */
    public Map<String, String> f339242e;

    public RemoteMessage(Bundle bundle) {
        this.f339241d = bundle;
    }

    /* renamed from: i */
    public final Map<String, String> mo169437i() {
        if (this.f339242e == null) {
            this.f339242e = new C111055b();
            for (String next : this.f339241d.keySet()) {
                Object obj = this.f339241d.get(next);
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!next.startsWith("google.") && !next.startsWith("gcm.") && !next.equals("from") && !next.equals("message_type") && !next.equals("collapse_key")) {
                        this.f339242e.put(next, str);
                    }
                }
            }
        }
        return this.f339242e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f339241d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
