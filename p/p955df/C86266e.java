package p955df;

import android.app.Application;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p723vf.C118672d;
import p723vf.C90779e;
import p761yd.C91441c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110821n;
import sx3.C110823p;
import z04.C112550d0;

/* renamed from: df.e */
public final class C86266e {

    /* renamed from: a */
    public static final long f250868a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: b */
    public static final C13601g f250869b = C36568h.m40985a(C86268b.f250874d);

    /* renamed from: c */
    public static final C13601g f250870c = C36568h.m40985a(C86267a.f250873d);

    /* renamed from: d */
    public static final C13601g f250871d = C36568h.m40985a(C86269c.f250875d);

    /* renamed from: e */
    public static final C86266e f250872e = new C86266e();

    /* renamed from: df.e$a */
    public static final class C86267a extends C87413o implements C32224a<SimpleDateFormat> {

        /* renamed from: d */
        public static final C86267a f250873d = new C86267a();

        public C86267a() {
            super(0);
        }

        public Object invoke() {
            return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US);
        }
    }

    /* renamed from: df.e$b */
    public static final class C86268b extends C87413o implements C32224a<File> {

        /* renamed from: d */
        public static final C86268b f250874d = new C86268b();

        public C86268b() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            C91441c d = C91441c.m114730d();
            C87412m.m108593f(d, "Matrix.with()");
            Application application = d.f262168b;
            C87412m.m108593f(application, "Matrix.with().application");
            File cacheDir = application.getCacheDir();
            C87412m.m108593f(cacheDir, "Matrix.with().application.cacheDir");
            sb.append(cacheDir.getAbsolutePath());
            sb.append("/hprofs");
            return new File(sb.toString());
        }
    }

    /* renamed from: df.e$c */
    public static final class C86269c extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C86269c f250875d = new C86269c();

        public C86269c() {
            super(0);
        }

        public Object invoke() {
            C91441c d = C91441c.m114730d();
            C87412m.m108593f(d, "Matrix.with()");
            if (C90779e.m113847b(d.f262168b)) {
                return "Main";
            }
            C91441c d2 = C91441c.m114730d();
            C87412m.m108593f(d2, "Matrix.with()");
            String a = C90779e.m113846a(d2.f262168b);
            C87412m.m108593f(a, "MatrixUtil.getProcessNam…atrix.with().application)");
            Object[] array = C112550d0.m153785U(a, new String[]{XVFSFile.PATH_SEPARATOR}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                return strArr.length > 1 ? strArr[1] : "unknown";
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: a */
    public final File mo120673a() {
        return (File) ((C36570n) f250869b).getValue();
    }

    /* renamed from: b */
    public final File mo120674b(String str, boolean z) {
        File[] listFiles;
        File[] listFiles2;
        C87412m.m108594g(str, "prefix");
        File a = mo120673a();
        if (a.exists() || (a.mkdirs() && a.canWrite())) {
            if (a.isDirectory()) {
                if (a.isDirectory() && (listFiles2 = a.listFiles()) != null) {
                    if (listFiles2.length > 1) {
                        C110821n.m150973t(listFiles2, new C86270f());
                    }
                    for (File file : listFiles2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("==> list sorted: ");
                        C87412m.m108593f(file, LocaleUtil.ITALIAN);
                        sb.append(file.getAbsolutePath());
                        sb.append(", last mod = ");
                        sb.append(file.lastModified());
                        C118672d.m167351a("Matrix.HprofFileManager", sb.toString(), new Object[0]);
                    }
                    if (listFiles2.length >= 10) {
                        for (File delete : C110823p.m150996V(listFiles2, (listFiles2.length - 10) + 1)) {
                            delete.delete();
                        }
                    }
                }
                long j = 12884901888L;
                if (a.getFreeSpace() < 12884901888L && (listFiles = a.listFiles()) != null) {
                    for (File delete2 : listFiles) {
                        delete2.delete();
                    }
                }
                long freeSpace = a.getFreeSpace();
                if (z) {
                    j = 1073741824;
                }
                if (freeSpace < j) {
                    throw new FileNotFoundException("free space(" + a.getFreeSpace() + ") less than 12884901888, skip dump hprof");
                }
            }
            File a2 = mo120673a();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append('-');
            sb4.append((String) ((C36570n) f250871d).getValue());
            sb4.append('-');
            sb4.append(Process.myPid());
            sb4.append('-');
            Calendar instance = Calendar.getInstance();
            C87412m.m108593f(instance, "Calendar.getInstance()");
            sb4.append(((SimpleDateFormat) ((C36570n) f250870c).getValue()).format(instance.getTime()));
            sb4.append(".hprof");
            return new File(a2, sb4.toString());
        }
        String str2 = "fialed to create new hprof file since path: " + a.getAbsolutePath() + " is not writable";
        C118672d.m167352b("Matrix.HprofFileManager", str2, new Object[0]);
        throw new FileNotFoundException(str2);
    }
}
