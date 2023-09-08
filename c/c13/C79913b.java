package c13;

import android.net.TrafficStats;

/* renamed from: c13.b */
public abstract class C79913b implements C16843l {

    /* renamed from: a */
    public long f234111a = TrafficStats.getMobileRxBytes();

    /* renamed from: b */
    public long f234112b;

    /* renamed from: c */
    public final boolean f234113c;

    public C79913b() {
        long mobileTxBytes = TrafficStats.getMobileTxBytes();
        this.f234112b = mobileTxBytes;
        this.f234113c = (this.f234111a == -1 || mobileTxBytes == -1) ? false : true;
    }
}
