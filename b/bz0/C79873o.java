package bz0;

import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import u24.C90599h;

/* renamed from: bz0.o */
public interface C79873o {

    /* renamed from: a */
    public static final C79888c f234030a = C79888c.f234059a;

    /* renamed from: bz0.o$a */
    public interface C79874a {
        /* renamed from: a */
        int mo110048a();

        /* renamed from: b */
        CharSequence mo110049b();

        /* renamed from: c */
        CharSequence[] mo110050c();
    }

    /* renamed from: bz0.o$b */
    public enum C79875b implements C79874a {
        ;
        

        /* renamed from: d */
        public static final C79876a f234031d = null;

        /* renamed from: bz0.o$b$a */
        public static final class C79876a {
            public C79876a(C8480h hVar) {
            }

            /* renamed from: a */
            public final C79875b mo110051a(int i) {
                boolean z = true;
                if (!(i >= 0 && i < 8)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (i == 0) {
                    return C79875b.f234032e;
                } else {
                    if (i == 1) {
                        return C79875b.f234033f;
                    }
                    if (2 <= i && i < 5) {
                        return C79875b.f234034g;
                    }
                    if (i == 5) {
                        return C79875b.f234035h;
                    }
                    if (6 > i || i >= 8) {
                        z = false;
                    }
                    if (z) {
                        return C79875b.f234036i;
                    }
                    throw new IllegalStateException("Invalid index".toString());
                }
            }
        }

        /* renamed from: bz0.o$b$b */
        public static final class C79877b extends C79875b {

            /* renamed from: n */
            public final C13601g f234038n;

            /* renamed from: o */
            public final CharSequence[] f234039o;

            /* renamed from: p */
            public final int f234040p;

            /* renamed from: bz0.o$b$b$a */
            public static final class C79878a extends C87413o implements C32224a<String> {

                /* renamed from: d */
                public static final C79878a f234041d = null;

                static {
                    f234041d = new C79878a();
                }

                public C79878a() {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return "ABCDEFGHJKLMNPQRSTUVWXYZ1234567890";
                }
            }

            public C79877b(String str, int i) {
                super(str, i, (C8480h) null);
                this.f234038n = C36568h.m40985a(C79878a.f234041d);
                C79888c cVar = C79873o.f234030a;
                cVar.getClass();
                this.f234039o = C79888c.f234060b;
                cVar.getClass();
                this.f234040p = C79888c.f234061c;
            }

            /* renamed from: a */
            public int mo110048a() {
                return this.f234040p;
            }

            /* renamed from: b */
            public CharSequence mo110049b() {
                return (CharSequence) ((C36570n) this.f234038n).getValue();
            }

            /* renamed from: c */
            public CharSequence[] mo110050c() {
                return this.f234039o;
            }
        }

        /* renamed from: bz0.o$b$c */
        public static final class C79879c extends C79875b {

            /* renamed from: n */
            public final CharSequence f234042n;

            /* renamed from: o */
            public final CharSequence[] f234043o;

            /* renamed from: p */
            public final int f234044p;

            public C79879c(String str, int i) {
                super(str, i, (C8480h) null);
                this.f234042n = C79875b.f234034g.mo110049b();
                C79888c cVar = C79873o.f234030a;
                cVar.getClass();
                this.f234043o = C79888c.f234060b;
                cVar.getClass();
                this.f234044p = C79888c.f234061c;
            }

            /* renamed from: a */
            public int mo110048a() {
                return this.f234044p;
            }

            /* renamed from: b */
            public CharSequence mo110049b() {
                return this.f234042n;
            }

            /* renamed from: c */
            public CharSequence[] mo110050c() {
                return this.f234043o;
            }
        }

        /* renamed from: bz0.o$b$d */
        public static final class C79880d extends C79875b {

            /* renamed from: n */
            public final C13601g f234045n;

            /* renamed from: o */
            public final CharSequence[] f234046o;

            /* renamed from: p */
            public final int f234047p;

            /* renamed from: bz0.o$b$d$a */
            public static final class C79881a extends C87413o implements C32224a<String> {

                /* renamed from: d */
                public static final C79881a f234048d = null;

                static {
                    f234048d = new C79881a();
                }

                public C79881a() {
                    super(0);
                }

                public Object invoke() {
                    C79873o.f234030a.getClass();
                    return C90599h.m113515h(C79888c.f234060b, "");
                }
            }

            public C79880d(String str, int i) {
                super(str, i, (C8480h) null);
                this.f234045n = C36568h.m40985a(C79881a.f234048d);
                C79888c cVar = C79873o.f234030a;
                cVar.getClass();
                this.f234046o = C79888c.f234060b;
                cVar.getClass();
                this.f234047p = C79888c.f234061c;
            }

            /* renamed from: a */
            public int mo110048a() {
                return this.f234047p;
            }

            /* renamed from: b */
            public CharSequence mo110049b() {
                Object value = ((C36570n) this.f234045n).getValue();
                C87412m.m108593f(value, "<get-legalChars>(...)");
                return (CharSequence) value;
            }

            /* renamed from: c */
            public CharSequence[] mo110050c() {
                return this.f234046o;
            }
        }

        /* renamed from: bz0.o$b$e */
        public static final class C79882e extends C79875b {

            /* renamed from: n */
            public final C13601g f234049n;

            /* renamed from: o */
            public final CharSequence[] f234050o;

            /* renamed from: p */
            public final int f234051p;

            /* renamed from: bz0.o$b$e$a */
            public static final class C79883a extends C87413o implements C32224a<String> {

                /* renamed from: d */
                public static final C79883a f234052d = null;

                static {
                    f234052d = new C79883a();
                }

                public C79883a() {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return "ABCDEFGHJKLMNPQRSTUVWXYZ";
                }
            }

            public C79882e(String str, int i) {
                super(str, i, (C8480h) null);
                this.f234049n = C36568h.m40985a(C79883a.f234052d);
                C79888c cVar = C79873o.f234030a;
                cVar.getClass();
                this.f234050o = C79888c.f234060b;
                cVar.getClass();
                this.f234051p = C79888c.f234061c;
            }

            /* renamed from: a */
            public int mo110048a() {
                return this.f234051p;
            }

            /* renamed from: b */
            public CharSequence mo110049b() {
                return (CharSequence) ((C36570n) this.f234049n).getValue();
            }

            /* renamed from: c */
            public CharSequence[] mo110050c() {
                return this.f234050o;
            }
        }

        /* renamed from: bz0.o$b$f */
        public static final class C79884f extends C79875b {

            /* renamed from: n */
            public final C13601g f234053n;

            /* renamed from: o */
            public final C13601g f234054o;

            /* renamed from: p */
            public final C13601g f234055p;

            /* renamed from: bz0.o$b$f$a */
            public static final class C79885a extends C87413o implements C32224a<Integer> {

                /* renamed from: d */
                public final /* synthetic */ C79884f f234056d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C79885a(C79884f fVar) {
                    super(0);
                    this.f234056d = fVar;
                }

                public Object invoke() {
                    return Integer.valueOf(this.f234056d.mo110050c().hashCode());
                }
            }

            /* renamed from: bz0.o$b$f$b */
            public static final class C79886b extends C87413o implements C32224a<CharSequence[]> {

                /* renamed from: d */
                public static final C79886b f234057d = null;

                static {
                    f234057d = new C79886b();
                }

                public C79886b() {
                    super(0);
                }

                public Object invoke() {
                    return new CharSequence[]{"京津沪渝苏浙豫粤川", "陕冀辽吉皖闽鄂湘鲁", "晋黑赣贵甘桂琼", "云青蒙新藏宁"};
                }
            }

            /* renamed from: bz0.o$b$f$c */
            public static final class C79887c extends C87413o implements C32224a<String> {

                /* renamed from: d */
                public static final C79887c f234058d = null;

                static {
                    f234058d = new C79887c();
                }

                public C79887c() {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    return "京津沪渝苏浙豫粤川陕冀辽吉皖闽鄂湘鲁晋黑赣贵甘桂琼云青蒙新藏宁";
                }
            }

            public C79884f(String str, int i) {
                super(str, i, (C8480h) null);
                this.f234053n = C36568h.m40985a(C79887c.f234058d);
                this.f234054o = C36568h.m40985a(C79886b.f234057d);
                this.f234055p = C36568h.m40985a(new C79885a(this));
            }

            /* renamed from: a */
            public int mo110048a() {
                return ((Number) ((C36570n) this.f234055p).getValue()).intValue();
            }

            /* renamed from: b */
            public CharSequence mo110049b() {
                return (CharSequence) ((C36570n) this.f234053n).getValue();
            }

            /* renamed from: c */
            public CharSequence[] mo110050c() {
                return (CharSequence[]) ((C36570n) this.f234054o).getValue();
            }
        }

        /* access modifiers changed from: public */
        static {
            f234031d = new C79876a((C8480h) null);
        }

        /* access modifiers changed from: public */
        C79875b(C8480h hVar) {
        }
    }

    /* renamed from: bz0.o$c */
    public static final class C79888c {

        /* renamed from: a */
        public static final /* synthetic */ C79888c f234059a = new C79888c();

        /* renamed from: b */
        public static final CharSequence[] f234060b;

        /* renamed from: c */
        public static final int f234061c;

        static {
            CharSequence[] charSequenceArr = {"1234567890", "QWERTYUP", "ASDFGHJKL", "ZXCVBNM", "港澳学挂"};
            f234060b = charSequenceArr;
            f234061c = charSequenceArr.hashCode();
        }
    }
}
