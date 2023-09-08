package cy3;

import com.tencent.map.geolocation.sapp.TencentLocation;
import com.tencent.xweb.IXWebBroadcastListener;
import gy3.C87412m;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import rx3.C13603j;
import sx3.C110816b;
import sx3.C110817b1;
import y04.C15925h;

/* renamed from: cy3.e */
public final class C24394e implements C15925h<File> {

    /* renamed from: a */
    public final File f69827a;

    /* renamed from: b */
    public final C7142f f69828b;

    /* renamed from: c */
    public final int f69829c = Integer.MAX_VALUE;

    /* renamed from: cy3.e$a */
    public static abstract class C24395a extends C24400c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24395a(File file) {
            super(file);
            C87412m.m108594g(file, "rootDir");
        }
    }

    /* renamed from: cy3.e$b */
    public final class C24396b extends C110816b<File> {

        /* renamed from: f */
        public final ArrayDeque<C24400c> f69830f;

        /* renamed from: cy3.e$b$a */
        public final class C24397a extends C24395a {

            /* renamed from: b */
            public boolean f69832b;

            /* renamed from: c */
            public File[] f69833c;

            /* renamed from: d */
            public int f69834d;

            /* renamed from: e */
            public boolean f69835e;

            /* renamed from: f */
            public final /* synthetic */ C24396b f69836f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24397a(C24396b bVar, File file) {
                super(file);
                C87412m.m108594g(file, "rootDir");
                this.f69836f = bVar;
            }

            /* renamed from: a */
            public File mo51016a() {
                if (!this.f69835e && this.f69833c == null) {
                    C24394e.this.getClass();
                    File[] listFiles = this.f69842a.listFiles();
                    this.f69833c = listFiles;
                    if (listFiles == null) {
                        C24394e.this.getClass();
                        this.f69835e = true;
                    }
                }
                File[] fileArr = this.f69833c;
                if (fileArr != null) {
                    int i = this.f69834d;
                    C87412m.m108591d(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f69833c;
                        C87412m.m108591d(fileArr2);
                        int i2 = this.f69834d;
                        this.f69834d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f69832b) {
                    this.f69832b = true;
                    return this.f69842a;
                }
                C24394e.this.getClass();
                return null;
            }
        }

        /* renamed from: cy3.e$b$b */
        public final class C24398b extends C24400c {

            /* renamed from: b */
            public boolean f69837b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24398b(C24396b bVar, File file) {
                super(file);
                C87412m.m108594g(file, "rootFile");
            }

            /* renamed from: a */
            public File mo51016a() {
                if (this.f69837b) {
                    return null;
                }
                this.f69837b = true;
                return this.f69842a;
            }
        }

        /* renamed from: cy3.e$b$c */
        public final class C24399c extends C24395a {

            /* renamed from: b */
            public boolean f69838b;

            /* renamed from: c */
            public File[] f69839c;

            /* renamed from: d */
            public int f69840d;

            /* renamed from: e */
            public final /* synthetic */ C24396b f69841e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C24399c(C24396b bVar, File file) {
                super(file);
                C87412m.m108594g(file, "rootDir");
                this.f69841e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
                if (r0.length == 0) goto L_0x0046;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File mo51016a() {
                /*
                    r3 = this;
                    boolean r0 = r3.f69838b
                    if (r0 != 0) goto L_0x0011
                    cy3.e$b r0 = r3.f69841e
                    cy3.e r0 = cy3.C24394e.this
                    r0.getClass()
                    r0 = 1
                    r3.f69838b = r0
                    java.io.File r0 = r3.f69842a
                    return r0
                L_0x0011:
                    java.io.File[] r0 = r3.f69839c
                    r1 = 0
                    if (r0 == 0) goto L_0x0027
                    int r2 = r3.f69840d
                    gy3.C87412m.m108591d(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x001f
                    goto L_0x0027
                L_0x001f:
                    cy3.e$b r0 = r3.f69841e
                    cy3.e r0 = cy3.C24394e.this
                    r0.getClass()
                    return r1
                L_0x0027:
                    java.io.File[] r0 = r3.f69839c
                    if (r0 != 0) goto L_0x004e
                    java.io.File r0 = r3.f69842a
                    java.io.File[] r0 = r0.listFiles()
                    r3.f69839c = r0
                    if (r0 != 0) goto L_0x003c
                    cy3.e$b r0 = r3.f69841e
                    cy3.e r0 = cy3.C24394e.this
                    r0.getClass()
                L_0x003c:
                    java.io.File[] r0 = r3.f69839c
                    if (r0 == 0) goto L_0x0046
                    gy3.C87412m.m108591d(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x004e
                L_0x0046:
                    cy3.e$b r0 = r3.f69841e
                    cy3.e r0 = cy3.C24394e.this
                    r0.getClass()
                    return r1
                L_0x004e:
                    java.io.File[] r0 = r3.f69839c
                    gy3.C87412m.m108591d(r0)
                    int r1 = r3.f69840d
                    int r2 = r1 + 1
                    r3.f69840d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: cy3.C24394e.C24396b.C24399c.mo51016a():java.io.File");
            }
        }

        public C24396b() {
            ArrayDeque<C24400c> arrayDeque = new ArrayDeque<>();
            this.f69830f = arrayDeque;
            if (C24394e.this.f69827a.isDirectory()) {
                arrayDeque.push(mo51015c(C24394e.this.f69827a));
            } else if (C24394e.this.f69827a.isFile()) {
                arrayDeque.push(new C24398b(this, C24394e.this.f69827a));
            } else {
                this.f331538d = C110817b1.Done;
            }
        }

        /* renamed from: a */
        public void mo51014a() {
            T t;
            T a;
            while (true) {
                C24400c peek = this.f69830f.peek();
                if (peek == null) {
                    t = null;
                    break;
                }
                a = peek.mo51016a();
                if (a == null) {
                    this.f69830f.pop();
                } else if (C87412m.m108589b(a, peek.f69842a) || !a.isDirectory() || this.f69830f.size() >= C24394e.this.f69829c) {
                    t = a;
                } else {
                    this.f69830f.push(mo51015c(a));
                }
            }
            t = a;
            if (t != null) {
                this.f331539e = t;
                this.f331538d = C110817b1.Ready;
                return;
            }
            this.f331538d = C110817b1.Done;
        }

        /* renamed from: c */
        public final C24395a mo51015c(File file) {
            int ordinal = C24394e.this.f69828b.ordinal();
            if (ordinal == 0) {
                return new C24399c(this, file);
            }
            if (ordinal == 1) {
                return new C24397a(this, file);
            }
            throw new C13603j();
        }
    }

    /* renamed from: cy3.e$c */
    public static abstract class C24400c {

        /* renamed from: a */
        public final File f69842a;

        public C24400c(File file) {
            C87412m.m108594g(file, "root");
            this.f69842a = file;
        }

        /* renamed from: a */
        public abstract File mo51016a();
    }

    public C24394e(File file, C7142f fVar) {
        C87412m.m108594g(file, IXWebBroadcastListener.STAGE_START);
        C87412m.m108594g(fVar, TencentLocation.EXTRA_DIRECTION);
        this.f69827a = file;
        this.f69828b = fVar;
    }

    public Iterator<File> iterator() {
        return new C24396b();
    }
}
