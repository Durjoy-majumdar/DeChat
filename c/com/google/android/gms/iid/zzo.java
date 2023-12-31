package com.google.android.gms.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import java.security.KeyPair;

final class zzo {
    private final KeyPair zzbw;
    /* access modifiers changed from: private */
    public final long zzbx;

    public zzo(KeyPair keyPair, long j) {
        this.zzbw = keyPair;
        this.zzbx = j;
    }

    /* access modifiers changed from: private */
    public final String zzo() {
        return Base64.encodeToString(this.zzbw.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    public final String zzp() {
        return Base64.encodeToString(this.zzbw.getPrivate().getEncoded(), 11);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzo = (zzo) obj;
        return this.zzbx == zzo.zzbx && this.zzbw.getPublic().equals(zzo.zzbw.getPublic()) && this.zzbw.getPrivate().equals(zzo.zzbw.getPrivate());
    }

    public final long getCreationTime() {
        return this.zzbx;
    }

    public final KeyPair getKeyPair() {
        return this.zzbw;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbw.getPublic(), this.zzbw.getPrivate(), Long.valueOf(this.zzbx));
    }
}
