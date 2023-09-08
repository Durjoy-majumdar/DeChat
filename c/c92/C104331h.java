package c92;

import as3.C103860b1;
import bp3.C104160f;
import bp3.C79758p;
import c30.C104289g;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105683r;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wecall.talkroom.model.TalkRoom;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.Iterator;
import nw3.C109774c;

/* renamed from: c92.h */
public final class C104331h {

    /* renamed from: a */
    public static final C104331h f308841a = new C104331h();

    /* renamed from: a */
    public static final boolean m139310a() {
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("mmkv_screen_project_info");
        C87412m.m108593f(mmkv, "getMMKV(KV_NAME)");
        return mmkv.getBoolean("screen_project_has_been_educated", false);
    }

    /* renamed from: c */
    public static final int m139311c(String str) {
        if (Util.isNullOrNil(str) || C105851w0.zx0().f314506t == null) {
            return -1;
        }
        String str2 = C105851w0.zx0().f314506t.f320042d;
        if (C105851w0.zx0().mo150681w(str2)) {
            C105683r b = C105724z.INSTANCE.f314388f.mo150550b(str);
            if (b != null) {
                return b.f314237a;
            }
            return -1;
        }
        TalkRoom h = C109774c.m149103b().mo161020h(str2);
        if (h == null) {
            return -1;
        }
        Iterator it = ((ArrayList) h.mo157174c()).iterator();
        while (it.hasNext()) {
            C103860b1 b1Var = (C103860b1) it.next();
            if (C87412m.m108589b(b1Var.f306906s, str)) {
                return b1Var.f306893f;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static final String m139312d() {
        String b = f308841a.mo146034b();
        if (Util.isNullOrNil(b)) {
            return null;
        }
        try {
            return new C104289g(b).optString("talking");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MultitalkUtils", e, "getMulitalkMemberListSizeWording error", new Object[0]);
            return null;
        }
    }

    /* renamed from: e */
    public static final int m139313e() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_max_limited_number, 15);
    }

    /* renamed from: g */
    public static final boolean m139314g() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_MultiTalk_GlRender_Int;
        boolean z = (pVar.mo109882e(fVar, -1) == -1 ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_use_new_render, 0) : pVar.mo109882e(fVar, -1)) == 1;
        boolean h = m139315h();
        Log.m105924i("MicroMsg.MultitalkUtils", "useNewRender: " + z + ", useNewView: " + h);
        return z || h;
    }

    /* renamed from: h */
    public static final boolean m139315h() {
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_MultiTalk_NewView_Int;
        boolean z = true;
        if ((pVar.mo109882e(fVar, -1) == -1 ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_multitalk_use_new_view, 1) : pVar.mo109882e(fVar, -1)) != 1) {
            z = false;
        }
        Log.m105924i("MicroMsg.MultitalkUtils", "useNewView: " + z);
        return z;
    }

    /* renamed from: b */
    public final String mo146034b() {
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_multitalk_navpop_wording, "");
        if (Util.isNullOrNil(Y60)) {
            return null;
        }
        try {
            C104289g gVar = new C104289g(Y60);
            String applicationLanguage = LocaleUtil.getApplicationLanguage();
            Log.m105925i("MicroMsg.MultitalkUtils", "getMultitalkNavpopWording, langCode:%s", applicationLanguage);
            return gVar.optString(applicationLanguage);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MultitalkUtils", e, "getMultitalkNavpopWording error", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo146035f(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "nickName"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = r9.mo146034b()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r2 = 0
            if (r1 != 0) goto L_0x002b
            c30.g r1 = new c30.g     // Catch:{ Exception -> 0x0021 }
            r1.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0021 }
            java.lang.String r0 = "screen_cast_title"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ Exception -> 0x0021 }
            goto L_0x002c
        L_0x0021:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.MultitalkUtils"
            java.lang.String r4 = "getMultitalkWaitingAcceptWording error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r4, r1)
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 != 0) goto L_0x003a
            r0 = 2131835328(0x7f1139c0, float:1.9303791E38)
            java.lang.String r0 = r10.getString(r0)
            java.lang.String r1 = "context.getString(R.stri…reen_cast_title_template)"
            gy3.C87412m.m108593f(r0, r1)
        L_0x003a:
            int r1 = r0.length()
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            r4 = 3
            if (r1 < r4) goto L_0x004b
            java.lang.String r1 = r0.substring(r2, r4)
            gy3.C87412m.m108593f(r1, r3)
            goto L_0x004c
        L_0x004b:
            r1 = r0
        L_0x004c:
            com.tencent.mm.ui.i3$a r4 = com.tencent.p014mm.p136ui.C74783i3.m89537a(r10)
            int r4 = r4.f24704a
            r5 = 112(0x70, float:1.57E-43)
            int r5 = kg3.C76577a.m92151b(r10, r5)
            android.content.res.Resources r6 = r10.getResources()
            r7 = 2131166984(0x7f070708, float:1.7948229E38)
            float r6 = r6.getDimension(r7)
            int r10 = kg3.C76577a.m92150a(r10, r6)
            float r10 = (float) r10
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r7.setTextSize(r10)
            int r8 = r1.length()
            r7.getTextBounds(r1, r2, r8, r6)
            int r1 = r6.width()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r7.setTextSize(r10)
            int r10 = r11.length()
            r7.getTextBounds(r11, r2, r10, r6)
            int r10 = r6.width()
            int r6 = r1 + r10
            int r6 = r6 + r5
            java.lang.String r7 = "format(this, *args)"
            r8 = 1
            if (r6 <= r4) goto L_0x00ee
            if (r10 != 0) goto L_0x00a3
            goto L_0x00ee
        L_0x00a3:
            int r4 = r4 - r5
            int r4 = r4 - r1
            float r1 = (float) r4
            float r10 = (float) r10
            float r1 = r1 / r10
            int r10 = r11.length()
            float r10 = (float) r10
            float r1 = r1 * r10
            float r10 = (float) r8
            float r1 = r1 - r10
            int r10 = (int) r1
            if (r10 > 0) goto L_0x00c6
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r11 = ""
            r10[r2] = r11
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            gy3.C87412m.m108593f(r10, r7)
            return r10
        L_0x00c6:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = r11.substring(r2, r10)
            gy3.C87412m.m108593f(r10, r3)
            r4.append(r10)
            java.lang.String r10 = "..."
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            r1[r2] = r10
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r1, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            gy3.C87412m.m108593f(r10, r7)
            return r10
        L_0x00ee:
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r2] = r11
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r8)
            java.lang.String r10 = java.lang.String.format(r0, r10)
            gy3.C87412m.m108593f(r10, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c92.C104331h.mo146035f(android.content.Context, java.lang.String):java.lang.String");
    }
}
