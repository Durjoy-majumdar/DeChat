package j11;

import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import yy0.C102970a;

/* renamed from: j11.d */
public class C98895d {

    /* renamed from: a */
    public long f289894a;

    /* renamed from: b */
    public int f289895b;

    /* renamed from: c */
    public String f289896c;

    /* renamed from: d */
    public String f289897d;

    /* renamed from: e */
    public String f289898e;

    /* renamed from: f */
    public long f289899f;

    /* renamed from: g */
    public long f289900g;

    /* renamed from: h */
    public int f289901h;

    /* renamed from: i */
    public String f289902i;

    /* renamed from: j */
    public String f289903j;

    /* renamed from: k */
    public int f289904k = -1;

    /* renamed from: l */
    public List<C102970a> f289905l = new ArrayList();

    /* renamed from: a */
    public long mo138237a() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f289900g);
        return (long) ((instance.get(1) * 100) + instance.get(2));
    }

    public String toString() {
        int i = this.f289895b;
        if (i == 1) {
            return String.format("%-8s    %-10s  %s\r\n", new Object[]{"IMG", Util.getSizeMB(this.f289894a), this.f289897d});
        } else if (i == 2) {
            return String.format("%-8s    %-10s  %s\r\n", new Object[]{"VOICE", Util.getSizeMB(this.f289894a), this.f289897d});
        } else if (i == 3) {
            return String.format("%-8s    %-10s  %s\r\n", new Object[]{"VIDEO", Util.getSizeMB(this.f289894a), this.f289897d});
        } else if (i != 4) {
            return "";
        } else {
            return String.format("%-8s    %-10s  %s\r\n", new Object[]{"ATTACH", Util.getSizeMB(this.f289894a), this.f289897d});
        }
    }
}
