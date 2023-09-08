package u10;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: u10.b */
public class C52416b {

    /* renamed from: a */
    public int f146497a;

    /* renamed from: b */
    public String f146498b;

    public C52416b() {
    }

    public C52416b(int i, String str) {
        this.f146497a = i;
        this.f146498b = str;
    }

    /* renamed from: a */
    public static C52416b m58673a(int i, Object... objArr) {
        C52416b bVar = new C52416b();
        bVar.f146497a = i;
        StringBuilder sb = new StringBuilder();
        int length = objArr.length - 1;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append(String.valueOf(objArr[i2]));
            sb.append(',');
        }
        sb.append(String.valueOf(objArr[length]));
        bVar.f146498b = sb.toString();
        Log.m105919d("MicroMsg.GameReportInfo", "appStat logID=%d, vals.size=%d, val = %s", Integer.valueOf(i), Integer.valueOf(objArr.length), sb.toString());
        return bVar;
    }
}
