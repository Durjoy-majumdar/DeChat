package p425ze;

import java.io.File;
import java.io.Serializable;
import p296bf.C79695b;

/* renamed from: ze.f */
public class C91671f implements Serializable {

    /* renamed from: d */
    public final File f262651d;

    /* renamed from: e */
    public final String f262652e;

    /* renamed from: f */
    public final String f262653f;

    public C91671f(File file, String str, String str2) {
        C79695b.m96813a(file, "hprofFile");
        File file2 = file;
        this.f262651d = file;
        C79695b.m96813a(str, "refKey");
        this.f262652e = str;
        C79695b.m96813a(str2, "activityName");
        this.f262653f = str2;
    }
}
