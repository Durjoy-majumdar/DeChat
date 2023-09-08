package yu0;

import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: yu0.f */
public abstract class C102910f extends C102908a {

    /* renamed from: g */
    public static int f303738g;

    /* renamed from: h */
    public static byte[] f303739h = "key".getBytes();

    /* renamed from: i */
    public static SharedPreferences f303740i;

    /* renamed from: j */
    public static boolean f303741j = false;

    /* renamed from: b */
    public String f303742b = "id";

    /* renamed from: c */
    public String f303743c = "hello";

    /* renamed from: d */
    public String f303744d = "ok";

    /* renamed from: e */
    public C102911g f303745e;

    /* renamed from: f */
    public byte[] f303746f;

    /* renamed from: d */
    public static SharedPreferences m136016d() {
        if (f303740i == null) {
            f303740i = MMApplicationContext.getContext().getSharedPreferences("BACKUP_CONFIG", 4);
        }
        return f303740i;
    }

    /* renamed from: c */
    public abstract void mo17657c(Object... objArr);

    /* renamed from: e */
    public C102911g mo142622e() {
        if (this.f303745e == null) {
            this.f303745e = new C102911g();
        }
        return this.f303745e;
    }

    /* renamed from: f */
    public abstract void mo17658f();

    /* renamed from: g */
    public abstract void mo17659g();
}
