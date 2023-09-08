package p290a8;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.Objects;
import p383t7.C22439a;

/* renamed from: a8.e */
public final class C16442e extends C22439a {

    /* renamed from: g */
    public final long f43881g;

    /* renamed from: h */
    public final long f43882h;

    /* renamed from: a8.e$b */
    public static final class C16443b {

        /* renamed from: a */
        public long f43883a;

        /* renamed from: b */
        public long f43884b;

        /* renamed from: c */
        public SpannableStringBuilder f43885c;

        /* renamed from: d */
        public Layout.Alignment f43886d;

        /* renamed from: e */
        public float f43887e;

        /* renamed from: f */
        public int f43888f;

        /* renamed from: g */
        public int f43889g;

        /* renamed from: h */
        public float f43890h;

        /* renamed from: i */
        public int f43891i;

        /* renamed from: j */
        public float f43892j;

        public C16443b() {
            mo14901b();
        }

        /* renamed from: a */
        public C16442e mo14900a() {
            if (this.f43890h != Float.MIN_VALUE && this.f43891i == Integer.MIN_VALUE) {
                Layout.Alignment alignment = this.f43886d;
                if (alignment == null) {
                    this.f43891i = Integer.MIN_VALUE;
                } else {
                    int i = C16444a.f43893a[alignment.ordinal()];
                    if (i == 1) {
                        this.f43891i = 0;
                    } else if (i == 2) {
                        this.f43891i = 1;
                    } else if (i != 3) {
                        Objects.toString(this.f43886d);
                        this.f43891i = 0;
                    } else {
                        this.f43891i = 2;
                    }
                }
            }
            return new C16442e(this.f43883a, this.f43884b, this.f43885c, this.f43886d, this.f43887e, this.f43888f, this.f43889g, this.f43890h, this.f43891i, this.f43892j);
        }

        /* renamed from: b */
        public void mo14901b() {
            this.f43883a = 0;
            this.f43884b = 0;
            this.f43885c = null;
            this.f43886d = null;
            this.f43887e = Float.MIN_VALUE;
            this.f43888f = Integer.MIN_VALUE;
            this.f43889g = Integer.MIN_VALUE;
            this.f43890h = Float.MIN_VALUE;
            this.f43891i = Integer.MIN_VALUE;
            this.f43892j = Float.MIN_VALUE;
        }
    }

    /* renamed from: a8.e$a */
    public static /* synthetic */ class C16444a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43893a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43893a = r0
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43893a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43893a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p290a8.C16442e.C16444a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16442e(long j, long j2, CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.f43881g = j;
        this.f43882h = j2;
    }
}
