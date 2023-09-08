package t30;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import d40.C31062a;
import h30.C87421c;
import java.util.Calendar;
import java.util.Date;
import m30.C88691b;
import m30.C88693c;
import p749xh.C78822p8;
import p749xh.C91209n5;

/* renamed from: t30.n */
public class C77848n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f226830d;

    /* renamed from: e */
    public final /* synthetic */ boolean f226831e;

    /* renamed from: f */
    public final /* synthetic */ String f226832f;

    /* renamed from: g */
    public final /* synthetic */ int f226833g;

    /* renamed from: h */
    public final /* synthetic */ String f226834h;

    /* renamed from: i */
    public final /* synthetic */ C77849o f226835i;

    public C77848n(C77849o oVar, String str, boolean z, String str2, int i, String str3) {
        this.f226835i = oVar;
        this.f226830d = str;
        this.f226831e = z;
        this.f226832f = str2;
        this.f226833g = i;
        this.f226834h = str3;
    }

    public void run() {
        String str = this.f226830d;
        boolean z = this.f226831e;
        String str2 = this.f226832f;
        if (str2 == null) {
            str2 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f226835i.f226836a.f226844a.contains(Integer.valueOf(this.f226833g))) {
            boolean z2 = true;
            if (str2.endsWith("市")) {
                str2 = str2.substring(0, str2.length() - 1);
            }
            Calendar instance = Calendar.getInstance();
            instance.setTime(new Date(currentTimeMillis));
            int i = instance.get(11);
            int i2 = instance.get(7);
            C78822p8 p8Var = new C78822p8();
            p8Var.field_snsid = str;
            p8Var.field_owner = this.f226834h;
            p8Var.field_type = this.f226833g;
            p8Var.field_weishang = z ? 1 : 0;
            p8Var.field_city = str2;
            p8Var.field_timestamp = currentTimeMillis;
            p8Var.field_hourOfDay = i;
            p8Var.field_dayOfWeek = i2;
            p8Var.field_action = 11;
            this.f226835i.f226836a.f226845b.mo107792Yt(p8Var);
            if (this.f226833g == 15) {
                this.f226835i.f226836a.getClass();
                if (C88691b.f256042a == null) {
                    C88691b.m110635a();
                }
                C88693c cVar = C88691b.f256042a;
                if (cVar.mo123139jo("MomentVideo", str) == null) {
                    z2 = false;
                }
                if (!z2) {
                    C91209n5 n5Var = new C91209n5();
                    n5Var.field_happen_time = System.currentTimeMillis();
                    n5Var.field_type = "MomentVideo";
                    n5Var.field_id = str;
                    n5Var.field_version = Integer.parseInt(BuildInfo.CLIENT_VERSION.replace("0x", ""), 16);
                    cVar.insert(n5Var);
                    C31062a.m39295b("MomentVideo", 101);
                    C87421c cVar2 = new C87421c("MomentVideo", str);
                    cVar2.f253319c = System.currentTimeMillis();
                    cVar2.mo121839a();
                }
            }
        }
    }
}
