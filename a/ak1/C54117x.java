package ak1;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import zk1.C66880s0;

/* renamed from: ak1.x */
public final class C54117x {
    /* renamed from: a */
    public static final C66880s0 m60830a() {
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        Context context = bVar != null ? bVar.getContext() : null;
        if (context instanceof AppCompatActivity) {
            return (C66880s0) C39818r.f106831a.mo62444c((AppCompatActivity) context).mo75002a(C66880s0.class);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m60831b(te3.C64247az0 r6) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r6, r0)
            te3.e05 r0 = r6.f182195y
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.f182913d
            if (r0 == 0) goto L_0x001c
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0017
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 != r1) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r3 = 0
            if (r0 != 0) goto L_0x0021
            return r3
        L_0x0021:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            te3.yr1 r4 = r6.f182184n
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = r4.f186584e
            goto L_0x002e
        L_0x002d:
            r4 = r3
        L_0x002e:
            java.lang.String r5 = "teamid"
            r0.put(r5, r4)
            te3.e05 r4 = r6.f182195y
            if (r4 == 0) goto L_0x003b
            java.lang.String r4 = r4.f182913d
            goto L_0x003c
        L_0x003b:
            r4 = r3
        L_0x003c:
            java.lang.String r5 = "appid"
            r0.put(r5, r4)
            te3.e05 r4 = r6.f182195y
            if (r4 == 0) goto L_0x004b
            int r3 = r4.f182915f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x004b:
            java.lang.String r4 = "version_type"
            r0.put(r4, r3)
            java.lang.String r3 = "gametype"
            r0.put(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r6.f182178e
            r1.append(r3)
            r3 = 47
            r1.append(r3)
            java.lang.String r4 = r6.f182179f
            r1.append(r4)
            r1.append(r3)
            java.lang.String r6 = r6.f182180g
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.String r1 = "custom"
            r0.put(r1, r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "result.toString()"
            gy3.C87412m.m108593f(r6, r0)
            java.lang.String r0 = ","
            java.lang.String r1 = ";"
            java.lang.String r6 = z04.C112551y.m153814n(r6, r0, r1, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ak1.C54117x.m60831b(te3.az0):java.lang.String");
    }
}
