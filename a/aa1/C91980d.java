package aa1;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import e91.C116711b;
import ei3.C86522b;
import f40.C86709a0;
import f81.C116807d;
import g91.C20813c;
import h81.C59774i;
import t91.C64208c;
import te3.C101777fg2;
import z91.C23462b;

@C86522b(dependencies = {C116807d.class})
/* renamed from: aa1.d */
public final class C91980d extends C86301e implements C59774i {
    public static C91980d vx0() {
        return (C91980d) C86312j.m106911c(C91980d.class);
    }

    /* renamed from: E */
    public String mo84747E() {
        return C116711b.m164578c();
    }

    /* renamed from: Ps */
    public int mo84748Ps() {
        try {
            if (!C86709a0.m107522a()) {
                return 1;
            }
            return ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_REPORT_SDK_SPECIAL_SOURCE_INT_SYNC, 1)).intValue();
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: S0 */
    public String mo84749S0() {
        return C116711b.m164579d();
    }

    public String Ts0() {
        return C64208c.f181963m + "_" + C64208c.f181964n;
    }

    /* renamed from: Wb */
    public String mo84751Wb() {
        String c = C112764f.m154260c();
        Log.m105925i("MicroMsg.HellBizService", "HABBYGE-MALI, HellBizService, requestSessionPageId: %s", c);
        return c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r3 == false) goto L_0x0062;
     */
    /* renamed from: eP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.Boolean> mo84752eP() {
        /*
            r5 = this;
            ia1.h r0 = ia1.C98625h.m128225a()
            o91.d r1 = r0.f289181e
            r2 = 0
            if (r1 != 0) goto L_0x000a
            goto L_0x0063
        L_0x000a:
            java.util.Map<java.lang.String, java.lang.Boolean> r1 = r1.f293845e
            if (r1 == 0) goto L_0x0018
            r3 = r1
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0018
            goto L_0x0062
        L_0x0018:
            o91.d r0 = r0.f289181e
            java.util.Map<java.lang.String, o91.f> r0 = r0.f293844d
            if (r0 == 0) goto L_0x0063
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0027
            goto L_0x0063
        L_0x0027:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0034:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 != 0) goto L_0x0043
            goto L_0x0034
        L_0x0043:
            java.lang.Object r4 = r3.getValue()
            o91.f r4 = (o91.C100313f) r4
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            te3.e74 r4 = r4.f293867a
            boolean r4 = r4.f298198z
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1.put(r3, r4)
            goto L_0x0034
        L_0x005b:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r2 = r1
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: aa1.C91980d.mo84752eP():java.util.Map");
    }

    public String hm0() {
        return C23462b.m28021f().mo36920d();
    }

    public void sx0(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            Log.m105925i("MicroMsg.HellBizService", "HABBYGE-MALI, %d putBizData key[%s] data[%s] bizId[%s]", Integer.valueOf(hashCode()), str, str2, str3);
            Log.m105925i("HABBYGE-MALI.AsyncBizCollector", "collectBizData: %s, %s, %s", str, str2, str3);
            C101777fg2 fg22 = new C101777fg2();
            fg22.f298259f = str3;
            fg22.f298257d = str2;
            fg22.f298258e = str;
            C20813c.m22810a().mo32508c(502, fg22);
        }
    }

    /* renamed from: tA */
    public void mo84755tA(String str) {
        C20813c.m22810a().mo32508c(501, str);
    }

    public void ut0(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Log.m105925i("MicroMsg.HellBizService", "HABBYGE-MALI, %d putBizData key[%s] data[%s]", Integer.valueOf(hashCode()), str, str2);
            C101777fg2 fg22 = new C101777fg2();
            fg22.f298259f = str;
            fg22.f298257d = str2;
            C20813c.m22810a().mo32508c(500, fg22);
        }
    }
}
