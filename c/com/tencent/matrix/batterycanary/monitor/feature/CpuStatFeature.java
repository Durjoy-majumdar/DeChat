package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p723vf.C118672d;
import p981ie.C108456k;
import p981ie.C108457l;
import p981ie.C117159b;
import p981ie.C117173p;

public class CpuStatFeature extends C114436a {

    /* renamed from: k */
    public C117173p f343048k;

    public static final class UidCpuStateSnapshot extends C114490k0.C114491a<UidCpuStateSnapshot> {

        /* renamed from: d */
        public List<C114427b> f343049d = Collections.emptyList();

        /* renamed from: e */
        public List<C114490k0.C114491a.C114492a<C114427b>> f343050e = Collections.emptyList();

        public static class IpcCpuStat {
            /* renamed from: a */
            public static C114427b m160974a(RemoteStat remoteStat) {
                C114427b bVar = new C114427b();
                bVar.f343054e = new ArrayList(remoteStat.f343051d.size());
                for (long[] a : remoteStat.f343051d) {
                    bVar.f343054e.add(C114490k0.C114491a.C114494b.C114502c.m161118a(a));
                }
                return bVar;
            }

            public static class RemoteStat implements Parcelable {
                public static final Parcelable.Creator<RemoteStat> CREATOR = new C114425a();

                /* renamed from: d */
                public List<long[]> f343051d = Collections.emptyList();

                /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat$a */
                public class C114425a implements Parcelable.Creator<RemoteStat> {
                    public Object createFromParcel(Parcel parcel) {
                        return new RemoteStat(parcel);
                    }

                    public Object[] newArray(int i) {
                        return new RemoteStat[i];
                    }
                }

                public RemoteStat() {
                }

                public int describeContents() {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int i) {
                    int size = this.f343051d.size();
                    parcel.writeInt(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        parcel.writeLongArray(this.f343051d.get(i2));
                    }
                }

                public RemoteStat(Parcel parcel) {
                    int readInt = parcel.readInt();
                    this.f343051d = new ArrayList(readInt);
                    for (int i = 0; i < readInt; i++) {
                        this.f343051d.add(parcel.createLongArray());
                    }
                }
            }
        }

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114535w(this, (UidCpuStateSnapshot) aVar, this);
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$a */
    public class C114426a implements Runnable {
        public C114426a() {
        }

        public void run() {
            CpuStatFeature.this.mo173601y();
        }
    }

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$b */
    public static final class C114427b extends C114490k0.C114491a<C114427b> {

        /* renamed from: d */
        public List<C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Long>>> f343053d = Collections.emptyList();

        /* renamed from: e */
        public List<C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Long>>> f343054e = Collections.emptyList();

        /* renamed from: f */
        public int f343055f = Process.myPid();

        /* renamed from: g */
        public String f343056g = C117159b.m165214o();

        /* renamed from: a */
        public C114490k0.C114491a.C114492a mo111825a(C114490k0.C114491a aVar) {
            return new C114534v(this, (C114427b) aVar, this);
        }

        /* renamed from: b */
        public double mo173607b(C117173p pVar) {
            double d = 0.0d;
            if (!pVar.mo181094l()) {
                return 0.0d;
            }
            for (int i = 0; i < this.f343053d.size(); i++) {
                List<ITEM> list = this.f343053d.get(i).f343212a;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    d += pVar.mo181087d(pVar.mo181089f(i), i2) * ((((double) ((Long) ((C114490k0.C114491a.C114494b.C114497b) list.get(i2)).f343211a).longValue()) * 10.0d) / 3600000.0d);
                }
            }
            return d;
        }

        /* renamed from: c */
        public double mo173608c(C117173p pVar, long j) {
            double d = 0.0d;
            if (!pVar.mo181094l()) {
                return 0.0d;
            }
            long j2 = 0;
            for (C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Long>> cVar : this.f343054e) {
                for (ITEM item : cVar.f343212a) {
                    j2 += ((Long) item.f343211a).longValue();
                }
            }
            for (int i = 0; i < this.f343054e.size(); i++) {
                List<ITEM> list = this.f343054e.get(i).f343212a;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    d += pVar.mo181087d(i, i2) * ((((((double) ((Long) ((C114490k0.C114491a.C114494b.C114497b) list.get(i2)).f343211a).longValue()) / ((double) j2)) * ((double) j)) * 10.0d) / 3600000.0d);
                }
                C117173p pVar2 = pVar;
                long j3 = j;
            }
            return d;
        }

        /* renamed from: d */
        public long mo173609d() {
            long j = 0;
            for (C114490k0.C114491a.C114494b.C114502c<C114490k0.C114491a.C114494b.C114497b<Long>> cVar : this.f343053d) {
                for (ITEM item : cVar.f343212a) {
                    j += ((Long) item.f343211a).longValue();
                }
            }
            return j;
        }
    }

    /* renamed from: a */
    public void mo173597a(boolean z) {
        super.mo173597a(z);
        if (!z && this.f343048k == null) {
            this.f349668a.f339059f.post(new C114426a());
        }
    }

    /* renamed from: b */
    public void mo111817b() {
        super.mo111817b();
        mo173601y();
    }

    /* renamed from: d */
    public int mo111818d() {
        return 0;
    }

    /* renamed from: g */
    public String mo111820g() {
        return "Matrix.battery.CpuStatFeature";
    }

    /* renamed from: v */
    public C114427b mo173598v() {
        return mo173599w(Process.myPid());
    }

    /* renamed from: w */
    public C114427b mo173599w(int i) {
        C114427b bVar = new C114427b();
        try {
            if (mo173600x()) {
                synchronized (this) {
                    if (mo173600x()) {
                        if (i == Process.myPid()) {
                            bVar.f343053d = new ArrayList();
                            for (int i2 = 0; i2 < this.f343048k.mo181090g(); i2++) {
                                C117173p pVar = this.f343048k;
                                bVar.f343053d.add(C114490k0.C114491a.C114494b.C114502c.m161118a(new C108456k(i2, pVar.mo181092i(pVar.mo181089f(i2))).mo158997a()));
                            }
                        }
                        int length = this.f343048k.f351033a.length;
                        int[] iArr = new int[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            iArr[i3] = this.f343048k.mo181092i(i3);
                        }
                        List<long[]> a = new C108457l(i, iArr).mo158999a();
                        bVar.f343054e = new ArrayList();
                        Iterator it = ((ArrayList) a).iterator();
                        while (it.hasNext()) {
                            bVar.f343054e.add(C114490k0.C114491a.C114494b.C114502c.m161118a((long[]) it.next()));
                        }
                    } else {
                        throw new IOException("PowerProfile not supported");
                    }
                }
                return bVar;
            }
            throw new IOException("PowerProfile not supported");
        } catch (Exception e) {
            C118672d.m167356f("Matrix.battery.CpuStatFeature", "Read cpu core state fail: " + e.getMessage(), new Object[0]);
            bVar.f343204c = false;
        }
    }

    /* renamed from: x */
    public boolean mo173600x() {
        return this.f343048k != null;
    }

    /* renamed from: y */
    public final void mo173601y() {
        if (this.f343048k == null) {
            synchronized (this) {
                if (this.f343048k == null) {
                    try {
                        this.f343048k = C117173p.m165234j(this.f349668a.mo165879a());
                        for (int i = 0; i < this.f343048k.mo181090g(); i++) {
                            C117173p pVar = this.f343048k;
                            new C108456k(i, pVar.mo181092i(pVar.mo181089f(i))).mo158998b();
                        }
                        int length = this.f343048k.f351033a.length;
                        int[] iArr = new int[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            iArr[i2] = this.f343048k.mo181092i(i2);
                        }
                        new C108457l(Process.myPid(), iArr).mo159000b();
                    } catch (IOException e) {
                        C118672d.m167356f("Matrix.battery.CpuStatFeature", "Init cpuStat failed: " + e.getMessage(), new Object[0]);
                        this.f343048k = null;
                    }
                }
            }
        }
    }
}
