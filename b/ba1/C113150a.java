package ba1;

import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import java.io.IOException;
import te3.C50921q7;

/* renamed from: ba1.a */
public final class C113150a {
    /* renamed from: a */
    public static String m154814a() {
        int i = C116711b.m164584i();
        if (i == 0) {
            return "-1";
        }
        String c = C116850b.m164833c("mmkv_async_biz_dao" + i);
        if (c == null || c.isEmpty()) {
            return null;
        }
        return c;
    }

    /* renamed from: b */
    public static void m154815b(String str) {
        int i = C116711b.m164584i();
        if (i != 0) {
            if (str == null) {
                str = "";
            }
            try {
                C116850b.m164835e("mmkv_async_biz_dao" + i, str);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e, "AsyncBizDao._write crash: %s", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static void m154816c(C50921q7 q7Var) {
        int i = C116711b.m164584i();
        if (i != 0) {
            try {
                byte[] byteArray = q7Var.toByteArray();
                if (byteArray == null) {
                    try {
                        byteArray = new byte[0];
                    } catch (Exception e) {
                        Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e, "AsyncBizDao._writeBizId crash: %s", e.getMessage());
                        return;
                    }
                }
                C116850b.m164834d("mmkv_async_bizid_sid" + i, byteArray);
            } catch (IOException e2) {
                Log.printErrStackTrace("HABBYGE-MALI.AsyncBizDao", e2, "AsyncBizDao, putBizIdOfCloudConfig, crash: %s", e2.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> m154817d() {
        /*
            int r0 = e91.C116711b.m164584i()
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r2 = r1
            goto L_0x0040
        L_0x0009:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mmkv_async_bizid_sid"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            byte[] r0 = f91.C116850b.m164831a(r0)
            if (r0 == 0) goto L_0x0007
            int r2 = r0.length
            if (r2 > 0) goto L_0x0024
            goto L_0x0007
        L_0x0024:
            te3.q7 r2 = new te3.q7
            r2.<init>()
            r2.parseFrom(r0)     // Catch:{ IOException -> 0x002d }
            goto L_0x0040
        L_0x002d:
            r0 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.String r4 = r0.getMessage()
            r2[r3] = r4
            java.lang.String r3 = "HABBYGE-MALI.AsyncBizDao"
            java.lang.String r4 = "AsyncBizDao, _readBizId, crash: %s"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r2)
            goto L_0x0007
        L_0x0040:
            if (r2 != 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            java.util.LinkedList<java.lang.String> r1 = r2.f140167d
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ba1.C113150a.m154817d():java.util.List");
    }
}
