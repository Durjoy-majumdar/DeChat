package p276y9;

import com.tencent.xweb.file.XVFSFile;

/* renamed from: y9.l */
public class C15938l {

    /* renamed from: a */
    public String f42816a;

    /* renamed from: b */
    public String f42817b;

    /* renamed from: c */
    public String f42818c;

    /* renamed from: d */
    public int f42819d;

    public C15938l(long j, String str, String str2, String str3, int i, int i2) {
        this.f42816a = str;
        this.f42817b = str2;
        this.f42818c = str3;
        this.f42819d = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42816a);
        sb.append(this.f42817b.replace(XVFSFile.SEPARATOR_CHAR, '.'));
        sb.append(" - ");
        sb.append(this.f42818c);
        sb.append(XVFSFile.PATH_SEPARATOR);
        int i = this.f42819d;
        sb.append(i != -3 ? i != -2 ? i != -1 ? i != 0 ? String.valueOf(i) : "No line number" : "Unknown line number" : "Compiled method" : "Native method");
        return sb.toString();
    }
}
