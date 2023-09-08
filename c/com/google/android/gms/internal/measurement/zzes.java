package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzes implements Iterator<String> {
    private Iterator<String> zzafz;
    private final /* synthetic */ zzer zzaga;

    public zzes(zzer zzer) {
        this.zzaga = zzer;
        this.zzafz = zzer.zzafy.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.zzafz.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.zzafz.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
