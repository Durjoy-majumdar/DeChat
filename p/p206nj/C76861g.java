package p206nj;

import android.os.SystemClock;
import com.tencent.xweb.file.XVFSFile;

/* renamed from: nj.g */
public final class C76861g {

    /* renamed from: nj.g$a */
    public static class C47263a {

        /* renamed from: a */
        public long f126886a;

        public C47263a() {
            mo72289b();
        }

        /* renamed from: a */
        public long mo72288a() {
            return SystemClock.elapsedRealtime() - this.f126886a;
        }

        /* renamed from: b */
        public void mo72289b() {
            this.f126886a = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: a */
    public static int m92658a() {
        return new Throwable().getStackTrace()[1].getLineNumber();
    }

    /* renamed from: b */
    public static String m92659b() {
        return new Throwable().getStackTrace()[1].toString();
    }

    /* renamed from: c */
    public static String m92660c() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        int lastIndexOf = stackTraceElement.getMethodName().lastIndexOf(46);
        return stackTraceElement.getMethodName().substring(lastIndexOf + 1) + "(" + stackTraceElement.getFileName() + XVFSFile.PATH_SEPARATOR + stackTraceElement.getLineNumber() + ")";
    }
}
