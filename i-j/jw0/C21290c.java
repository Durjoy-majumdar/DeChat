package jw0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C19614i0;
import gy3.C87412m;
import java.util.Map;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: jw0.c */
public final class C21290c {

    /* renamed from: a */
    public static final C21290c f60147a = new C21290c();

    /* renamed from: a */
    public final C19614i0 mo33268a(String str) {
        C19614i0 i0Var = new C19614i0();
        if (str == null || C112551y.m153811k(str)) {
            return i0Var;
        }
        int E = C112550d0.m153769E(str, "<sysmsg", 0, false, 6, (Object) null);
        Map<String, String> map = null;
        if (E != -1) {
            String substring = str.substring(E);
            C87412m.m108593f(substring, "this as java.lang.String).substring(startIndex)");
            map = XmlParser.parseXml(substring, "sysmsg", (String) null);
        }
        if (map == null) {
            Log.m105921e("MicroMsg.BizPayAlbumLogic", "XmlParser values is null, msgContent %s", str);
            return i0Var;
        }
        String str2 = map.get(".sysmsg.BizNotification.BizAccount.UserName");
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        i0Var.f55491a = str2;
        String str4 = map.get(".sysmsg.BizNotification.BizAccount.NickName");
        if (str4 == null) {
            str4 = str3;
        }
        i0Var.f55492b = str4;
        String str5 = map.get(".sysmsg.BizNotification.plain");
        if (str5 == null) {
            str5 = str3;
        }
        i0Var.f55493c = str5;
        String str6 = map.get(".sysmsg.BizNotification.BizAccount.HeadImgUrl");
        if (str6 == null) {
            str6 = str3;
        }
        i0Var.f55494d = str6;
        String str7 = map.get(".sysmsg.BizNotification.AppMsg.Title");
        if (str7 == null) {
            str7 = str3;
        }
        i0Var.f55495e = str7;
        String str8 = map.get(".sysmsg.BizNotification.AppMsg.WebUrl");
        if (str8 != null) {
            str3 = str8;
        }
        i0Var.f55496f = str3;
        return i0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bf  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo33269b(java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "onBizPayAlbumNotify data invalid"
            java.lang.String r1 = "MicroMsg.BizPayAlbumLogic"
            if (r10 == 0) goto L_0x011a
            if (r9 != 0) goto L_0x000a
            goto L_0x011a
        L_0x000a:
            boolean r2 = f40.C86709a0.m107522a()
            if (r2 != 0) goto L_0x0016
            java.lang.String r9 = "onBizPayAlbumNotify acc not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            return
        L_0x0016:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onBizPayAlbumNotify msgContent="
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.lang.String r2 = ".sysmsg.BizNotification.BizAccount.UserName"
            java.lang.Object r3 = r9.get(r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003f
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r3 = 0
            goto L_0x0040
        L_0x003f:
            r3 = 1
        L_0x0040:
            if (r3 == 0) goto L_0x0045
        L_0x0042:
            r3 = 0
            goto L_0x00b9
        L_0x0045:
            java.lang.String r3 = ".sysmsg.BizNotification.BizAccount.NickName"
            java.lang.Object r3 = r9.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0058
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r3 = 0
            goto L_0x0059
        L_0x0058:
            r3 = 1
        L_0x0059:
            if (r3 == 0) goto L_0x005c
            goto L_0x0042
        L_0x005c:
            java.lang.String r3 = ".sysmsg.BizNotification.BizAccount.HeadImgUrl"
            java.lang.Object r3 = r9.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x006f
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r3 = 0
            goto L_0x0070
        L_0x006f:
            r3 = 1
        L_0x0070:
            if (r3 == 0) goto L_0x0073
            goto L_0x0042
        L_0x0073:
            java.lang.String r3 = ".sysmsg.BizNotification.plain"
            java.lang.Object r3 = r9.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0086
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r3 = 0
            goto L_0x0087
        L_0x0086:
            r3 = 1
        L_0x0087:
            if (r3 == 0) goto L_0x008a
            goto L_0x0042
        L_0x008a:
            java.lang.String r3 = ".sysmsg.BizNotification.AppMsg.Title"
            java.lang.Object r3 = r9.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x009d
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r3 = 0
            goto L_0x009e
        L_0x009d:
            r3 = 1
        L_0x009e:
            if (r3 == 0) goto L_0x00a1
            goto L_0x0042
        L_0x00a1:
            java.lang.String r3 = ".sysmsg.BizNotification.AppMsg.WebUrl"
            java.lang.Object r3 = r9.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x00b4
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r3 = 0
            goto L_0x00b5
        L_0x00b4:
            r3 = 1
        L_0x00b5:
            if (r3 == 0) goto L_0x00b8
            goto L_0x0042
        L_0x00b8:
            r3 = 1
        L_0x00b9:
            if (r3 != 0) goto L_0x00bf
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return
        L_0x00bf:
            com.tencent.mm.storage.o0 r0 = new com.tencent.mm.storage.o0
            r0.<init>()
            com.tencent.mm.storage.d1 r3 = rb0.C48009v0.Kx0()
            long r6 = r3.mo25738bF()
            r0.field_msgId = r6
            r6 = 0
            r0.field_msgSvrId = r6
            r3 = 10100(0x2774, float:1.4153E-41)
            r0.field_type = r3
            java.lang.Object r9 = r9.get(r2)
            java.lang.String r9 = (java.lang.String) r9
            r0.field_talker = r9
            r0.field_talkerId = r5
            long r2 = eb0.C75604z3.m90844p()
            r0.field_createTime = r2
            r0.mo183585l2(r4)
            r9 = 3
            r0.field_status = r9
            r0.field_content = r10
            com.tencent.mm.storage.d1 r9 = rb0.C48009v0.Kx0()
            boolean r9 = r9.insert(r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "onBizPayAlbumNotify result: %b, username: %s, msgid="
            r10.append(r2)
            long r2 = r0.field_msgId
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r2[r5] = r9
            java.lang.String r9 = r0.field_talker
            r2[r4] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r10, r2)
            return
        L_0x011a:
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jw0.C21290c.mo33269b(java.util.Map, java.lang.String):void");
    }
}
