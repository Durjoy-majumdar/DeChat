package t72;

import java.util.ArrayList;

/* renamed from: t72.c */
public interface C118387c {

    /* renamed from: t72.c$a */
    public static class C118388a {

        /* renamed from: a */
        public final String f353801a;

        /* renamed from: b */
        public long f353802b;

        /* renamed from: c */
        public long f353803c;

        /* renamed from: d */
        public long f353804d;

        /* renamed from: e */
        public long f353805e;

        /* renamed from: f */
        public long f353806f;

        /* renamed from: g */
        public int f353807g;

        /* renamed from: h */
        public ArrayList<C118389b> f353808h = new ArrayList<>(20);

        /* renamed from: i */
        public ArrayList<C118390c> f353809i = new ArrayList<>(20);

        /* renamed from: j */
        public boolean f353810j = false;

        public C118388a(String str) {
            this.f353801a = str;
        }

        public String toString() {
            return String.format("FileResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d], subDirResult[%d], tempAccDirResult[%d], totalTime[%d], depth[%d]", new Object[]{Integer.valueOf(hashCode()), this.f353801a, Boolean.valueOf(this.f353810j), Long.valueOf(this.f353802b), Long.valueOf(this.f353803c), Long.valueOf(this.f353804d), Long.valueOf(this.f353805e), Integer.valueOf(this.f353808h.size()), Integer.valueOf(this.f353809i.size()), Long.valueOf(this.f353806f), Integer.valueOf(this.f353807g)});
        }
    }

    /* renamed from: t72.c$b */
    public static class C118389b {

        /* renamed from: a */
        public String f353811a;

        /* renamed from: b */
        public final int f353812b;

        /* renamed from: c */
        public long f353813c;

        /* renamed from: d */
        public long f353814d;

        /* renamed from: e */
        public long f353815e;

        /* renamed from: f */
        public long f353816f;

        public C118389b(String str, int i) {
            this.f353811a = str;
            this.f353812b = i;
        }

        public String toString() {
            return String.format("SubDirResult hash(%d) root[%d][%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d]", new Object[]{Integer.valueOf(hashCode()), Integer.valueOf(this.f353812b), this.f353811a, Boolean.FALSE, Long.valueOf(this.f353813c), Long.valueOf(this.f353814d), Long.valueOf(this.f353815e), Long.valueOf(this.f353816f)});
        }
    }

    /* renamed from: t72.c$c */
    public static class C118390c {

        /* renamed from: a */
        public final String f353817a;

        /* renamed from: b */
        public long f353818b;

        /* renamed from: c */
        public long f353819c;

        /* renamed from: d */
        public long f353820d;

        /* renamed from: e */
        public long f353821e;

        public C118390c(String str) {
            this.f353817a = str;
        }

        public String toString() {
            return String.format("TempAccDirResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvaildCount[%d]", new Object[]{Integer.valueOf(hashCode()), this.f353817a, Boolean.FALSE, Long.valueOf(this.f353818b), Long.valueOf(this.f353819c), Long.valueOf(this.f353820d), Long.valueOf(this.f353821e)});
        }
    }
}
