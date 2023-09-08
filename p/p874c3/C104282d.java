package p874c3;

/* renamed from: c3.d */
public final class C104282d {

    /* renamed from: a */
    public static final C104281c f308635a = new C104286d((C104284b) null, false);

    /* renamed from: b */
    public static final C104281c f308636b = new C104286d((C104284b) null, true);

    /* renamed from: c */
    public static final C104281c f308637c;

    /* renamed from: d */
    public static final C104281c f308638d;

    /* renamed from: c3.d$a */
    public static class C104283a implements C104284b {

        /* renamed from: a */
        public static final C104283a f308639a = new C104283a();

        /* renamed from: a */
        public int mo145944a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                C104281c cVar = C104282d.f308635a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                    }
                    i4 = 0;
                    i++;
                }
                i4 = 1;
                i++;
            }
            return i4;
        }
    }

    /* renamed from: c3.d$b */
    public interface C104284b {
        /* renamed from: a */
        int mo145944a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: c3.d$c */
    public static abstract class C104285c implements C104281c {

        /* renamed from: a */
        public final C104284b f308640a;

        public C104285c(C104284b bVar) {
            this.f308640a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo145945a();

        /* renamed from: b */
        public boolean mo145946b(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            C104284b bVar = this.f308640a;
            if (bVar == null) {
                return mo145945a();
            }
            int a = bVar.mo145944a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo145945a();
            }
            return false;
        }
    }

    /* renamed from: c3.d$d */
    public static class C104286d extends C104285c {

        /* renamed from: b */
        public final boolean f308641b;

        public C104286d(C104284b bVar, boolean z) {
            super(bVar);
            this.f308641b = z;
        }

        /* renamed from: a */
        public boolean mo145945a() {
            return this.f308641b;
        }
    }

    static {
        C104283a aVar = C104283a.f308639a;
        f308637c = new C104286d(aVar, false);
        f308638d = new C104286d(aVar, true);
    }
}
