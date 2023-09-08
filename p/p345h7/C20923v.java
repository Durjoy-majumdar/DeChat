package p345h7;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p294b7.C16743g;
import p333e8.C20541m;
import p333e8.C20549u;

/* renamed from: h7.v */
public interface C20923v {

    /* renamed from: h7.v$a */
    public static final class C20924a {

        /* renamed from: a */
        public final String f59272a;

        /* renamed from: b */
        public final byte[] f59273b;

        public C20924a(String str, int i, byte[] bArr) {
            this.f59272a = str;
            this.f59273b = bArr;
        }
    }

    /* renamed from: h7.v$b */
    public static final class C20925b {

        /* renamed from: a */
        public final String f59274a;

        /* renamed from: b */
        public final List<C20924a> f59275b;

        /* renamed from: c */
        public final byte[] f59276c;

        public C20925b(int i, String str, List<C20924a> list, byte[] bArr) {
            this.f59274a = str;
            this.f59275b = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f59276c = bArr;
        }
    }

    /* renamed from: h7.v$c */
    public interface C20926c {
        /* renamed from: a */
        C20923v mo32615a(int i, C20925b bVar);

        /* renamed from: b */
        SparseArray<C20923v> mo32616b();
    }

    /* renamed from: h7.v$d */
    public static final class C20927d {

        /* renamed from: a */
        public final String f59277a;

        /* renamed from: b */
        public final int f59278b;

        /* renamed from: c */
        public final int f59279c;

        /* renamed from: d */
        public int f59280d;

        /* renamed from: e */
        public String f59281e;

        public C20927d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: a */
        public void mo32634a() {
            int i = this.f59280d;
            this.f59280d = i == Integer.MIN_VALUE ? this.f59278b : i + this.f59279c;
            this.f59281e = this.f59277a + this.f59280d;
        }

        /* renamed from: b */
        public final void mo32635b() {
            if (this.f59280d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public C20927d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f59277a = str;
            this.f59278b = i2;
            this.f59279c = i3;
            this.f59280d = Integer.MIN_VALUE;
        }
    }

    /* renamed from: a */
    void mo32626a(C20541m mVar, boolean z);

    /* renamed from: b */
    void mo32627b();

    /* renamed from: c */
    void mo32628c(C20549u uVar, C16743g gVar, C20927d dVar);
}
