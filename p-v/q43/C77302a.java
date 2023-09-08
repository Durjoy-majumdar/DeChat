package q43;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: q43.a */
public class C77302a {

    /* renamed from: a */
    public String f225422a = "";

    /* renamed from: b */
    public int f225423b = 0;

    /* renamed from: c */
    public StringBuffer f225424c = new StringBuffer();

    /* renamed from: c */
    public static C77302a m93123c(String str, int i) {
        C77302a aVar = new C77302a();
        aVar.f225422a = str + "," + i;
        return aVar;
    }

    /* renamed from: d */
    public static C77302a m93124d(Intent intent) {
        int intExtra = intent.getIntExtra("WECHAT_PAY_LOG_REPORT_INDEX", -1);
        if (intExtra == -1) {
            return null;
        }
        C77302a aVar = new C77302a();
        aVar.f225423b = intExtra;
        aVar.f225424c = new StringBuffer(Util.nullAs(intent.getStringExtra("WECHAT_PAY_LOG_REPORT_DATA"), ""));
        aVar.f225422a = Util.nullAs(intent.getStringExtra("WECHAT_PAY_LOG_REPORT_BASEIFO"), "");
        return aVar;
    }

    /* renamed from: e */
    public static boolean m93125e(C77302a aVar, Intent intent) {
        if (aVar == null) {
            return false;
        }
        intent.putExtra("WECHAT_PAY_LOG_REPORT_INDEX", aVar.f225423b);
        intent.putExtra("WECHAT_PAY_LOG_REPORT_DATA", aVar.f225424c.toString());
        intent.putExtra("WECHAT_PAY_LOG_REPORT_BASEIFO", aVar.f225422a);
        return true;
    }

    /* renamed from: a */
    public void mo107446a(int i, String str) {
        String format = String.format("{%d, %s, %d, %s},", new Object[]{Integer.valueOf(this.f225423b), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), str});
        this.f225423b++;
        Log.m105924i("MicroMsg.PayLogReport", "test for log " + format);
        this.f225424c.append(format);
    }

    /* renamed from: b */
    public void mo107447b(int i, Object... objArr) {
        String str;
        if (objArr == null || objArr.length <= 0) {
            Log.m105928w("MicroMsg.PayLogReport", "vals is null, use '' as value");
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            int length = objArr.length - 1;
            for (int i2 = 0; i2 < length; i2++) {
                sb.append(String.valueOf(objArr[i2]));
                sb.append(',');
            }
            sb.append(String.valueOf(objArr[length]));
            str = sb.toString();
        }
        mo107446a(i, str);
    }
}
