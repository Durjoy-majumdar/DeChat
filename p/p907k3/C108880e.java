package p907k3;

import p907k3.C108867b;

/* renamed from: k3.e */
public final class C108880e {

    /* renamed from: a */
    public double f326029a = Math.sqrt(1500.0d);

    /* renamed from: b */
    public double f326030b = 0.5d;

    /* renamed from: c */
    public boolean f326031c = false;

    /* renamed from: d */
    public double f326032d;

    /* renamed from: e */
    public double f326033e;

    /* renamed from: f */
    public double f326034f;

    /* renamed from: g */
    public double f326035g;

    /* renamed from: h */
    public double f326036h;

    /* renamed from: i */
    public double f326037i;

    /* renamed from: j */
    public final C108867b.C108875h f326038j = new C108867b.C108875h();

    public C108880e(float f) {
        this.f326037i = (double) f;
    }

    /* renamed from: a */
    public C108880e mo159992a(float f) {
        if (f >= 0.0f) {
            this.f326030b = (double) f;
            this.f326031c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: b */
    public C108880e mo159993b(float f) {
        if (f > 0.0f) {
            this.f326029a = Math.sqrt((double) f);
            this.f326031c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: c */
    public C108867b.C108875h mo159994c(double d, double d2, long j) {
        double d3;
        double d4;
        if (!this.f326031c) {
            if (this.f326037i != Double.MAX_VALUE) {
                double d5 = this.f326030b;
                if (d5 > 1.0d) {
                    double d6 = this.f326029a;
                    this.f326034f = ((-d5) * d6) + (d6 * Math.sqrt((d5 * d5) - 1.0d));
                    double d7 = this.f326030b;
                    double d8 = this.f326029a;
                    this.f326035g = ((-d7) * d8) - (d8 * Math.sqrt((d7 * d7) - 1.0d));
                } else if (d5 >= 0.0d && d5 < 1.0d) {
                    this.f326036h = this.f326029a * Math.sqrt(1.0d - (d5 * d5));
                }
                this.f326031c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d9 = ((double) j) / 1000.0d;
        double d15 = d - this.f326037i;
        double d16 = this.f326030b;
        if (d16 > 1.0d) {
            double d17 = this.f326035g;
            double d18 = this.f326034f;
            double d19 = d15 - (((d17 * d15) - d2) / (d17 - d18));
            double d25 = ((d15 * d17) - d2) / (d17 - d18);
            d4 = (Math.pow(2.718281828459045d, d17 * d9) * d19) + (Math.pow(2.718281828459045d, this.f326034f * d9) * d25);
            double d26 = this.f326035g;
            double pow = d19 * d26 * Math.pow(2.718281828459045d, d26 * d9);
            double d27 = this.f326034f;
            d3 = pow + (d25 * d27 * Math.pow(2.718281828459045d, d27 * d9));
        } else if (d16 == 1.0d) {
            double d28 = this.f326029a;
            double d29 = d2 + (d28 * d15);
            double d35 = d15 + (d29 * d9);
            d4 = Math.pow(2.718281828459045d, (-d28) * d9) * d35;
            double pow2 = d35 * Math.pow(2.718281828459045d, (-this.f326029a) * d9);
            double d36 = this.f326029a;
            d3 = (d29 * Math.pow(2.718281828459045d, (-d36) * d9)) + (pow2 * (-d36));
        } else {
            double d37 = 1.0d / this.f326036h;
            double d38 = this.f326029a;
            double d39 = d37 * ((d16 * d38 * d15) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d16) * d38 * d9) * ((Math.cos(this.f326036h * d9) * d15) + (Math.sin(this.f326036h * d9) * d39));
            double d44 = this.f326029a;
            double d45 = this.f326030b;
            double d46 = (-d44) * pow3 * d45;
            double pow4 = Math.pow(2.718281828459045d, (-d45) * d44 * d9);
            double d47 = this.f326036h;
            double d48 = pow3;
            double sin = (-d47) * d15 * Math.sin(d47 * d9);
            double d49 = this.f326036h;
            d3 = d46 + (pow4 * (sin + (d39 * d49 * Math.cos(d49 * d9))));
            d4 = d48;
        }
        C108867b.C108875h hVar = this.f326038j;
        hVar.f326025a = (float) (d4 + this.f326037i);
        hVar.f326026b = (float) d3;
        return hVar;
    }
}
