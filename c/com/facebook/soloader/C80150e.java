package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import com.facebook.soloader.C80169p;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.soloader.e */
public class C80150e extends C80172q {

    /* renamed from: a */
    public final File f234655a;

    /* renamed from: b */
    public final int f234656b;

    public C80150e(File file, int i) {
        this.f234655a = file;
        this.f234656b = i;
    }

    /* renamed from: a */
    public int mo110960a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return mo110965d(str, i, this.f234655a, threadPolicy);
    }

    /* renamed from: c */
    public final void mo110964c(String str, C80151f fVar, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z = C80169p.f234682a;
        if (z) {
            C80145a.m97445a("SoLoader.getElfDependencies[", str, "]");
        }
        try {
            String[] a = C80165m.m97472a(fVar);
            if (z) {
                Trace.endSection();
            }
            Arrays.toString(a);
            for (String str2 : a) {
                if (!str2.startsWith("/")) {
                    C80169p.m97484h(str2, (String) null, (String) null, i | 1, threadPolicy);
                }
            }
        } catch (Throwable th) {
            if (C80169p.f234682a) {
                Trace.endSection();
            }
            throw th;
        }
    }

    /* renamed from: d */
    public int mo110965d(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        if (C80169p.f234683b != null) {
            File file2 = new File(this.f234655a, str);
            C80152g gVar = null;
            if (!file2.exists()) {
                file2 = null;
            }
            boolean z = false;
            if (file2 == null) {
                file.getCanonicalPath();
                return 0;
            }
            file.getCanonicalPath();
            if ((i & 1) != 0 && (this.f234656b & 2) != 0) {
                return 2;
            }
            if ((this.f234656b & 1) != 0) {
                z = true;
            }
            boolean equals = file2.getName().equals(str);
            if (z || !equals) {
                try {
                    gVar = new C80152g(file2);
                } catch (UnsatisfiedLinkError e) {
                    if (e.getMessage().contains("bad ELF magic")) {
                        if (gVar != null) {
                            gVar.close();
                        }
                        return 3;
                    }
                    throw e;
                } catch (Throwable th) {
                    if (gVar != null) {
                        gVar.close();
                    }
                    throw th;
                }
            }
            if (z) {
                mo110964c(str, gVar, i, threadPolicy);
            }
            if (equals) {
                ((C80169p.C80170a) C80169p.f234683b).mo110985b(file2.getAbsolutePath(), i);
                if (gVar != null) {
                    gVar.close();
                }
                return 1;
            }
            C80168o oVar = C80169p.f234683b;
            file2.getAbsolutePath();
            ((C80169p.C80170a) oVar).getClass();
            throw new UnsupportedOperationException();
        }
        throw new IllegalStateException("SoLoader.init() not yet called");
    }

    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f234655a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f234655a.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.f234656b + ']';
    }
}
