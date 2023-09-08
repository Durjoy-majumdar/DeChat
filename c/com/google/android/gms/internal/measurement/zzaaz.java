package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzaaz extends zzaay {
    public zzaaz(int i) {
        super(i, (zzaaz) null);
    }

    public final void zzrg() {
        if (!isImmutable()) {
            for (int i = 0; i < zzuj(); i++) {
                Map.Entry zzah = zzah(i);
                if (((zzzo) zzah.getKey()).zztk()) {
                    zzah.setValue(Collections.unmodifiableList((List) zzah.getValue()));
                }
            }
            for (Map.Entry entry : zzuk()) {
                if (((zzzo) entry.getKey()).zztk()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzrg();
    }
}
