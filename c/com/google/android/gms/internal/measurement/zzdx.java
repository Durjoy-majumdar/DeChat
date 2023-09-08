package com.google.android.gms.internal.measurement;

final class zzdx implements Runnable {
    private final /* synthetic */ long zzadj;
    private final /* synthetic */ zzdu zzadk;

    public zzdx(zzdu zzdu, long j) {
        this.zzadk = zzdu;
        this.zzadj = j;
    }

    public final void run() {
        this.zzadk.zzl(this.zzadj);
    }
}
