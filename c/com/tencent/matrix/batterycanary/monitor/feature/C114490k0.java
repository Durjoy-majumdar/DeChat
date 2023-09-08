package com.tencent.matrix.batterycanary.monitor.feature;

import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p1177ce.C113314g;
import p723vf.C118672d;
import p981ie.C117164j;

/* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0 */
public interface C114490k0 {
    /* renamed from: a */
    void mo173597a(boolean z);

    /* renamed from: b */
    void mo111817b();

    /* renamed from: c */
    void mo173651c(long j);

    /* renamed from: d */
    int mo111818d();

    /* renamed from: e */
    void mo173631e(C113314g gVar);

    /* renamed from: f */
    void mo111819f();

    /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a */
    public static abstract class C114491a<RECORD extends C114491a> {

        /* renamed from: a */
        public final long f343202a = SystemClock.uptimeMillis();

        /* renamed from: b */
        public boolean f343203b = false;

        /* renamed from: c */
        public boolean f343204c = true;

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b */
        public static abstract class C114494b<ENTRY> {

            /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$a */
            public static class C114495a<BEAN> extends C114494b<C114495a> {

                /* renamed from: b */
                public static final C114495a<?> f343209b = new C114496a((Void) null);

                /* renamed from: a */
                public BEAN f343210a;

                /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$a$a */
                public class C114496a extends C114495a<Void> {
                    public C114496a(Void voidR) {
                        super(voidR);
                    }
                }

                public C114495a(BEAN bean) {
                    this.f343210a = bean;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return String.valueOf(this.f343210a).equals(String.valueOf(((C114495a) obj).f343210a));
                }

                public int hashCode() {
                    return Objects.hash(new Object[]{this.f343210a});
                }

                public String toString() {
                    return String.valueOf(this.f343210a);
                }
            }

            /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b */
            public static abstract class C114497b<DIGIT extends Number> extends C114494b<C114497b> {

                /* renamed from: a */
                public DIGIT f343211a;

                /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b$a */
                public static class C114498a extends C114497b<Double> {
                    public C114498a(Double d) {
                        super(d);
                    }

                    /* renamed from: a */
                    public Number mo173614a(Number number) {
                        return Double.valueOf(((Double) this.f343211a).doubleValue() - ((Double) number).doubleValue());
                    }
                }

                /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b$b */
                public static class C114499b extends C114497b<Float> {
                    public C114499b(Float f) {
                        super(f);
                    }

                    /* renamed from: a */
                    public Number mo173614a(Number number) {
                        return Float.valueOf(((Float) this.f343211a).floatValue() - ((Float) number).floatValue());
                    }
                }

                /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b$c */
                public static class C114500c extends C114497b<Integer> {
                    public C114500c(Integer num) {
                        super(num);
                    }

                    /* renamed from: a */
                    public Number mo173614a(Number number) {
                        return Integer.valueOf(((Integer) this.f343211a).intValue() - ((Integer) number).intValue());
                    }
                }

                /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$b$d */
                public static class C114501d extends C114497b<Long> {
                    public C114501d(Long l) {
                        super(l);
                    }

                    /* renamed from: a */
                    public Number mo173614a(Number number) {
                        return Long.valueOf(((Long) this.f343211a).longValue() - ((Long) number).longValue());
                    }
                }

                public C114497b(DIGIT digit) {
                    this.f343211a = digit;
                }

                /* renamed from: b */
                public static <DIGIT extends Number> C114497b<DIGIT> m161112b(DIGIT digit) {
                    if (digit instanceof Integer) {
                        return new C114500c((Integer) digit);
                    }
                    if (digit instanceof Long) {
                        return new C114501d((Long) digit);
                    }
                    if (digit instanceof Float) {
                        return new C114499b((Float) digit);
                    }
                    if (digit instanceof Double) {
                        return new C114498a((Double) digit);
                    }
                    throw new RuntimeException("unsupported digit: " + digit.getClass());
                }

                /* renamed from: a */
                public abstract DIGIT mo173614a(DIGIT digit);

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return this.f343211a.equals(((C114497b) obj).f343211a);
                }

                public int hashCode() {
                    return Objects.hash(new Object[]{this.f343211a});
                }

                public String toString() {
                    return String.valueOf(this.f343211a);
                }
            }

            /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$b$c */
            public static class C114502c<ITEM extends C114494b> extends C114494b<C114502c> {

                /* renamed from: a */
                public List<ITEM> f343212a;

                /* renamed from: a */
                public static C114502c<C114497b<Long>> m161118a(long[] jArr) {
                    ArrayList arrayList = new ArrayList();
                    for (long valueOf : jArr) {
                        arrayList.add(C114497b.m161112b(Long.valueOf(valueOf)));
                    }
                    C114502c<C114497b<Long>> cVar = new C114502c<>();
                    cVar.f343212a = arrayList;
                    return cVar;
                }

                /* renamed from: b */
                public static <ITEM extends C114494b> C114502c<ITEM> m161119b() {
                    C114502c<ITEM> cVar = new C114502c<>();
                    cVar.f343212a = new ArrayList();
                    return cVar;
                }
            }
        }

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$c */
        public static class C114503c {

            /* renamed from: o */
            public static final Integer f343213o = Integer.MIN_VALUE;

            /* renamed from: a */
            public final String f343214a;

            /* renamed from: b */
            public final Handler f343215b;

            /* renamed from: c */
            public final C117164j<C114503c, ? extends Number> f343216c;

            /* renamed from: d */
            public final Runnable f343217d = new C114504a();

            /* renamed from: e */
            public boolean f343218e = true;

            /* renamed from: f */
            public long f343219f = 60000;

            /* renamed from: g */
            public int f343220g = 0;

            /* renamed from: h */
            public long f343221h = 0;

            /* renamed from: i */
            public long f343222i = 0;

            /* renamed from: j */
            public double f343223j = Double.MIN_VALUE;

            /* renamed from: k */
            public double f343224k = Double.MIN_VALUE;

            /* renamed from: l */
            public double f343225l = Double.MIN_VALUE;

            /* renamed from: m */
            public double f343226m = Double.MIN_VALUE;

            /* renamed from: n */
            public double f343227n = Double.MIN_VALUE;

            /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$a */
            public class C114504a implements Runnable {
                public C114504a() {
                }

                public void run() {
                    C114503c cVar;
                    try {
                        C114503c cVar2 = C114503c.this;
                        Number number = (Number) cVar2.f343216c.apply(cVar2);
                        if (!number.equals(C114503c.f343213o)) {
                            C114503c.this.f343224k = number.doubleValue();
                            C114503c cVar3 = C114503c.this;
                            int i = cVar3.f343220g + 1;
                            cVar3.f343220g = i;
                            double d = cVar3.f343227n * ((double) (i - 1));
                            double d2 = cVar3.f343224k;
                            cVar3.f343227n = (d + d2) / ((double) i);
                            if (cVar3.f343223j == Double.MIN_VALUE) {
                                cVar3.f343223j = d2;
                                cVar3.f343225l = d2;
                                cVar3.f343226m = d2;
                            } else {
                                if (d2 > cVar3.f343225l) {
                                    cVar3.f343225l = d2;
                                }
                                if (d2 < cVar3.f343226m) {
                                    cVar3.f343226m = d2;
                                }
                            }
                        }
                        cVar = C114503c.this;
                        if (cVar.f343218e) {
                            return;
                        }
                    } catch (Exception e) {
                        C118672d.m167354d("Matrix.battery.Sampler", e, "onSamplingFailed: " + e, new Object[0]);
                        cVar = C114503c.this;
                        if (cVar.f343218e) {
                            return;
                        }
                    } catch (Throwable th) {
                        C114503c cVar4 = C114503c.this;
                        if (!cVar4.f343218e) {
                            cVar4.f343215b.postDelayed(this, cVar4.f343219f);
                        }
                        throw th;
                    }
                    cVar.f343215b.postDelayed(this, cVar.f343219f);
                }
            }

            /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$c$b */
            public static final class C114505b {

                /* renamed from: a */
                public long f343229a;

                /* renamed from: b */
                public int f343230b;

                /* renamed from: c */
                public long f343231c;

                /* renamed from: d */
                public double f343232d;

                /* renamed from: e */
                public double f343233e;

                /* renamed from: f */
                public double f343234f;

                /* renamed from: g */
                public double f343235g;

                /* renamed from: h */
                public double f343236h;

                public String toString() {
                    return "Result{interval=" + this.f343229a + ", count=" + this.f343230b + ", duringMillis=" + this.f343231c + ", sampleFst=" + this.f343232d + ", sampleLst=" + this.f343233e + ", sampleMax=" + this.f343234f + ", sampleMin=" + this.f343235g + ", sampleAvg=" + this.f343236h + '}';
                }
            }

            public C114503c(String str, Handler handler, C117164j<C114503c, ? extends Number> jVar) {
                this.f343214a = str;
                this.f343215b = handler;
                this.f343216c = jVar;
            }
        }

        /* renamed from: a */
        public abstract C114492a<RECORD> mo111825a(RECORD record);

        /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$a */
        public static abstract class C114492a<RECORD extends C114491a> {

            /* renamed from: a */
            public final RECORD f343205a;

            /* renamed from: b */
            public final RECORD f343206b;

            /* renamed from: c */
            public final RECORD f343207c;

            /* renamed from: d */
            public final long f343208d;

            /* renamed from: com.tencent.matrix.batterycanary.monitor.feature.k0$a$a$a */
            public static class C114493a<RECORD extends C114491a> extends C114492a<RECORD> {
                public C114493a(RECORD record, RECORD record2, RECORD record3) {
                    super(record, record2, record3);
                }

                /* renamed from: a */
                public RECORD mo173612a() {
                    throw new RuntimeException("stub!");
                }
            }

            public C114492a(RECORD record, RECORD record2) {
                this.f343205a = record;
                this.f343206b = record2;
                this.f343208d = record2.f343202a - record.f343202a;
                RECORD a = mo173612a();
                this.f343207c = a;
                a.f343203b = true;
            }

            /* renamed from: a */
            public abstract RECORD mo173612a();

            /* renamed from: b */
            public boolean mo173690b() {
                return this.f343205a.f343204c && this.f343206b.f343204c;
            }

            public C114492a(RECORD record, RECORD record2, RECORD record3) {
                this.f343205a = record;
                this.f343206b = record2;
                this.f343208d = record2.f343202a - record.f343202a;
                this.f343207c = record3;
                record3.f343203b = true;
            }
        }
    }
}
