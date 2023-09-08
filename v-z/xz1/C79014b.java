package xz1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import oa1.C117731d;

/* renamed from: xz1.b */
public class C79014b {

    /* renamed from: a */
    public String f232010a = "";

    /* renamed from: b */
    public int f232011b = 0;

    /* renamed from: c */
    public String f232012c = " ";

    /* renamed from: d */
    public long f232013d = MAlarmHandler.NEXT_FIRE_INTERVAL;

    /* renamed from: e */
    public String f232014e = "";

    /* renamed from: f */
    public int f232015f = 0;

    /* renamed from: b */
    public static String m95552b() {
        String f = C117731d.m166007c().mo182444f("clicfg_android_solitaire_content_equal_white_list_regex", "(\\.|。|,|，|:|：|;|；|、|-|\\s)", true, true);
        Log.m105919d("MicroMsg.groupsolitaire.GroupSolitatireItem", "equalStrWhiteListRegex:%s", f);
        return f;
    }

    /* renamed from: c */
    public static boolean m95553c(String str, String str2) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return false;
        }
        return Util.isEqual(str.replaceAll(m95552b(), "").replace(" ", "").toLowerCase(), str2.replaceAll(m95552b(), "").replace(" ", "").toLowerCase());
    }

    /* renamed from: a */
    public C79014b clone() {
        C79014b bVar;
        Exception e;
        try {
            bVar = new C79014b();
            try {
                bVar.f232010a = this.f232010a;
                bVar.f232011b = this.f232011b;
                bVar.f232012c = this.f232012c;
                bVar.f232013d = this.f232013d;
                bVar.f232014e = this.f232014e;
                bVar.f232015f = this.f232015f;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            bVar = null;
            e = exc;
            Log.m105925i("MicroMsg.groupsolitaire.GroupSolitatireItem", "clone() Exception:%s %s", e.getClass(), e.getMessage());
            return bVar;
        }
        return bVar;
    }

    public boolean equals(Object obj) {
        C79014b bVar = (C79014b) obj;
        if (Util.isEqual(this.f232010a, bVar.f232010a)) {
            return Util.isEqual(this.f232014e.trim(), bVar.f232014e.trim());
        }
        if (Util.isEqual(this.f232014e.trim(), bVar.f232014e.trim())) {
            return true;
        }
        return m95553c(this.f232014e.trim(), bVar.f232014e.trim());
    }

    public int hashCode() {
        if (Util.isNullOrNil(this.f232014e) || Util.isNullOrNil(this.f232014e.trim())) {
            return 0;
        }
        return this.f232014e.trim().replaceAll(m95552b(), "").replace(" ", "").toLowerCase().hashCode();
    }

    public String toString() {
        return "GroupSolitatireItem{username='" + this.f232010a + '\'' + ", asheader=" + this.f232011b + ", separator='" + this.f232012c + '\'' + ", createtime=" + this.f232013d + ", content='" + this.f232014e + '\'' + ", orderNum='" + this.f232015f + '\'' + '}';
    }
}
