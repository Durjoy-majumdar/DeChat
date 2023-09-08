package kt1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C31543z5;
import gy3.C87412m;
import o40.C61937h;
import ob0.C47350c;
import oe1.C35153c;
import p206nj.C76861g;
import pe1.C35464c;
import pe3.C47465a;
import z04.C112550d0;

/* renamed from: kt1.f */
public final class C61169f {

    /* renamed from: a */
    public final C61170g f174141a;

    /* renamed from: b */
    public final String f174142b = "Finder.FinderCgiReport";

    /* renamed from: c */
    public final String f174143c = ("Finder.FinderCgiLogRP" + hashCode());

    /* renamed from: d */
    public final String f174144d = ("Finder.FinderCgiDetail" + hashCode());

    /* renamed from: e */
    public C76861g.C47263a f174145e = new C76861g.C47263a();

    /* renamed from: f */
    public long f174146f;

    /* renamed from: g */
    public long f174147g;

    /* renamed from: h */
    public final int f174148h;

    /* renamed from: i */
    public long f174149i;

    /* renamed from: j */
    public int f174150j;

    public C61169f(C61170g gVar) {
        C87412m.m108594g(gVar, "cigTrack");
        this.f174141a = gVar;
        C35464c<Integer> cVar = C35153c.f94277a;
        this.f174148h = C35153c.f94277a.mo60266n().intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01bc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86104a(int r26, int r27, java.lang.String r28, ob0.C47350c r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            int r5 = r0.f174148h
            java.lang.String r6 = "/"
            r8 = 0
            r9 = 1
            if (r5 != r9) goto L_0x007a
            kt1.a r5 = kt1.C61166a.f174128a
            if (r4 == 0) goto L_0x0019
            java.lang.String r5 = r4.f127057c
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x0032
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r10 == 0) goto L_0x0023
            goto L_0x0032
        L_0x0023:
            java.lang.String r5 = z04.C112550d0.m153794d0(r5, r6, r5)
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r10 = kt1.C61166a.f174129b
            boolean r5 = r10.contains(r5)
            if (r5 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r5 = 0
            goto L_0x0033
        L_0x0032:
            r5 = 1
        L_0x0033:
            if (r5 != 0) goto L_0x007a
            if (r4 == 0) goto L_0x007a
            ob0.c$d r5 = r4.f127056b
            pe3.a r5 = r5.f127083a
            if (r5 == 0) goto L_0x007a
            java.lang.String r10 = r0.f174144d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "##########response uri: ===> "
            r11.append(r12)
            java.lang.String r12 = r4.f127057c
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            java.lang.String r10 = r0.f174144d
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "uri:"
            r11.append(r12)
            java.lang.String r12 = r4.f127057c
            r11.append(r12)
            java.lang.String r12 = " response "
            r11.append(r12)
            org.json.JSONObject r5 = o40.C61937h.m72709h(r5)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            r0.mo86105b(r10, r5)
        L_0x007a:
            if (r2 == 0) goto L_0x007e
            r5 = 1
            goto L_0x007f
        L_0x007e:
            r5 = 0
        L_0x007f:
            kt1.g r10 = r0.f174141a
            kt1.d r10 = r10.mo8509M()
            kt1.d r11 = kt1.C46744d.Enable
            if (r10 != r11) goto L_0x008b
            r12 = 1
            goto L_0x008c
        L_0x008b:
            r12 = 0
        L_0x008c:
            kt1.a r13 = kt1.C61166a.f174128a
            int r14 = kt1.C61166a.f174131d
            r15 = 2
            if (r14 != r15) goto L_0x0095
            r14 = 1
            goto L_0x0096
        L_0x0095:
            r14 = 0
        L_0x0096:
            if (r14 == 0) goto L_0x0099
            r12 = 0
        L_0x0099:
            if (r5 != 0) goto L_0x009d
            if (r12 == 0) goto L_0x029d
        L_0x009d:
            kt1.d r5 = kt1.C46744d.Disable
            if (r10 == r5) goto L_0x029d
            com.tencent.mm.autogen.mmdata.rpt.FinderStreamTrackStruct r5 = new com.tencent.mm.autogen.mmdata.rpt.FinderStreamTrackStruct
            r5.<init>()
            r12 = 8
            r5.f156107d = r12
            if (r10 != r11) goto L_0x00b1
            r10 = 3
            r5.f156108e = r10
            goto L_0x00b5
        L_0x00b1:
            r10 = 2
            r5.f156108e = r10
        L_0x00b5:
            if (r4 == 0) goto L_0x00ba
            java.lang.String r10 = r4.f127057c
            goto L_0x00bb
        L_0x00ba:
            r10 = 0
        L_0x00bb:
            java.lang.String r11 = ""
            if (r10 != 0) goto L_0x00c0
            r10 = r11
        L_0x00c0:
            java.lang.String r12 = "/cgi-bin/micromsg-bin"
            boolean r10 = z04.C112551y.m153819s(r10, r12, r8)
            java.lang.String r12 = "actionName"
            if (r10 == 0) goto L_0x00dd
            if (r4 == 0) goto L_0x00d5
            java.lang.String r10 = r4.f127057c
            if (r10 == 0) goto L_0x00d5
            java.lang.String r10 = z04.C112550d0.m153794d0(r10, r6, r10)
            goto L_0x00d6
        L_0x00d5:
            r10 = r11
        L_0x00d6:
            java.lang.String r10 = r5.mo86045b(r12, r10, r9)
            r5.f156109f = r10
            goto L_0x00e9
        L_0x00dd:
            if (r4 == 0) goto L_0x00e2
            java.lang.String r10 = r4.f127057c
            goto L_0x00e3
        L_0x00e2:
            r10 = 0
        L_0x00e3:
            java.lang.String r10 = r5.mo86045b(r12, r10, r9)
            r5.f156109f = r10
        L_0x00e9:
            kt1.g r10 = r0.f174141a
            org.json.JSONObject r10 = r10.mo8506N()
            java.lang.String r12 = "JSONObject().also { json…             }.toString()"
            java.lang.String r15 = ";"
            java.lang.String r7 = ","
            if (r10 == 0) goto L_0x0113
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r9 = "actionExt"
            r14.put(r9, r10)
            java.lang.String r10 = r14.toString()
            gy3.C87412m.m108593f(r10, r12)
            java.lang.String r10 = z04.C112551y.m153814n(r10, r7, r15, r8)
            r14 = 1
            java.lang.String r9 = r5.mo86045b(r9, r10, r14)
            r5.f156110g = r9
        L_0x0113:
            long r9 = r0.f174149i
            r5.f156116m = r9
            r5.f156111h = r2
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r10 = "errType"
            r9.put(r10, r1)
            java.lang.String r10 = "errCode"
            r9.put(r10, r2)
            if (r3 == 0) goto L_0x012e
            java.lang.String r11 = z04.C112551y.m153814n(r3, r7, r15, r8)
        L_0x012e:
            java.lang.String r10 = "errMsg"
            r9.put(r10, r11)
            long r10 = r0.f174146f
            java.lang.String r14 = "cost"
            r9.put(r14, r10)
            long r10 = r0.f174149i
            java.lang.String r14 = "actionTime"
            r9.put(r14, r10)
            long r10 = r0.f174147g
            r16 = r9
            long r8 = r0.f174146f
            long r10 = r10 - r8
            java.lang.String r8 = "cgiProcessTime"
            r9 = r16
            r9.put(r8, r10)
            long r10 = r0.f174147g
            java.lang.String r8 = "cgiAllTime"
            r9.put(r8, r10)
            kt1.g r8 = r0.f174141a
            org.json.JSONObject r8 = r8.mo8510R0()
            java.lang.String r10 = "resultExt"
            if (r8 == 0) goto L_0x0163
            r9.put(r10, r8)
        L_0x0163:
            java.lang.String r8 = r9.toString()
            gy3.C87412m.m108593f(r8, r12)
            r9 = 0
            java.lang.String r7 = z04.C112551y.m153814n(r8, r7, r15, r9)
            r8 = 1
            java.lang.String r7 = r5.mo86045b(r10, r7, r8)
            r5.f156112i = r7
            int r7 = r0.f174150j
            long r7 = (long) r7
            r5.f156113j = r7
            long r7 = r0.f174146f
            r5.f156115l = r7
            java.lang.Class<er.k> r7 = p151er.C58676k.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            er.k r7 = (p151er.C58676k) r7
            java.lang.String r7 = r7.gp0()
            java.lang.String r8 = "snn"
            r10 = 1
            java.lang.String r7 = r5.mo86045b(r8, r7, r10)
            r5.f156114k = r7
            if (r4 == 0) goto L_0x019a
            java.lang.String r7 = r4.f127057c
            goto L_0x019b
        L_0x019a:
            r7 = 0
        L_0x019b:
            if (r7 == 0) goto L_0x01b9
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 == 0) goto L_0x01a4
            goto L_0x01b9
        L_0x01a4:
            int r8 = kt1.C61166a.f174131d
            r10 = 1
            if (r8 != r10) goto L_0x01aa
            goto L_0x01b9
        L_0x01aa:
            java.lang.String r6 = z04.C112550d0.m153794d0(r7, r6, r7)
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r7 = kt1.C61166a.f174130c
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x01b7
            goto L_0x01b9
        L_0x01b7:
            r14 = 0
            goto L_0x01ba
        L_0x01b9:
            r14 = 1
        L_0x01ba:
            if (r14 != 0) goto L_0x029e
            if (r4 == 0) goto L_0x01c1
            java.lang.String r6 = r4.f127057c
            goto L_0x01c2
        L_0x01c1:
            r6 = 0
        L_0x01c2:
            java.lang.String r7 = "Finder.CgiStrategy"
            if (r2 == 0) goto L_0x021e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kt1.a$b> r8 = kt1.C61166a.f174134g
            kt1.a$a r10 = kt1.C61166a.f174132e
            rx3.l r8 = r13.mo86102a(r8, r10, r6)
            A r10 = r8.f38555d
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0277
            boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r9 == 0) goto L_0x01f8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "isBlock error case "
            r9.append(r10)
            r9.append(r6)
            r10 = 32
            r9.append(r10)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
        L_0x01f8:
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r7 = kt1.C61166a.f174137j
            boolean r9 = r7.contains(r6)
            if (r9 != 0) goto L_0x0275
            ft1.a r16 = ft1.C59319a.f169618b
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            kt1.b r9 = new kt1.b
            r9.<init>(r6, r2, r8)
            r23 = 28
            r24 = 0
            java.lang.String r17 = "cgiReportError"
            r22 = r9
            o40.C11348f.C11349a.m11178b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r7.add(r6)
            goto L_0x0275
        L_0x021e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kt1.a$b> r8 = kt1.C61166a.f174135h
            kt1.a$a r10 = kt1.C61166a.f174133f
            rx3.l r8 = r13.mo86102a(r8, r10, r6)
            A r10 = r8.f38555d
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0277
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r9 = kt1.C61166a.f174136i
            boolean r10 = r9.contains(r6)
            if (r10 != 0) goto L_0x0255
            ft1.a r16 = ft1.C59319a.f169618b
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            kt1.c r10 = new kt1.c
            r10.<init>(r6, r2, r8)
            r23 = 28
            r24 = 0
            java.lang.String r17 = "cgiReportNormal"
            r22 = r10
            o40.C11348f.C11349a.m11178b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r9.add(r6)
        L_0x0255:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r8 == 0) goto L_0x0275
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "isBlock normal case "
            r8.append(r9)
            r8.append(r6)
            r6 = 32
            r8.append(r6)
            r8.append(r2)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
        L_0x0275:
            r8 = 1
            goto L_0x0278
        L_0x0277:
            r8 = 0
        L_0x0278:
            if (r8 != 0) goto L_0x029f
            int r6 = r0.f174148h
            r7 = 1
            if (r6 != r7) goto L_0x0299
            java.lang.String r6 = r0.f174143c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "report value "
            r7.append(r9)
            java.lang.String r9 = r5.mo1006q()
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
        L_0x0299:
            r5.mo86054n()
            goto L_0x029f
        L_0x029d:
            r9 = 0
        L_0x029e:
            r8 = 0
        L_0x029f:
            java.lang.String r5 = r0.f174142b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "onCgiBack "
            r6.append(r7)
            if (r4 == 0) goto L_0x02b6
            ob0.c$c r7 = r4.f127055a
            int r7 = r7.f127082c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x02b7
        L_0x02b6:
            r7 = 0
        L_0x02b7:
            r6.append(r7)
            java.lang.String r7 = " errType "
            r6.append(r7)
            r6.append(r1)
            r1 = 32
            r6.append(r1)
            r6.append(r2)
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = " uri:"
            r6.append(r1)
            if (r4 == 0) goto L_0x02da
            java.lang.String r7 = r4.f127057c
            goto L_0x02db
        L_0x02da:
            r7 = 0
        L_0x02db:
            r6.append(r7)
            java.lang.String r1 = " costTime:("
            r6.append(r1)
            long r1 = r0.f174146f
            r6.append(r1)
            r1 = 44
            r6.append(r1)
            long r2 = r0.f174147g
            long r9 = r0.f174146f
            long r2 = r2 - r9
            r6.append(r2)
            r6.append(r1)
            long r1 = r0.f174147g
            r6.append(r1)
            java.lang.String r1 = ") fromCommentScene:"
            r6.append(r1)
            int r1 = r0.f174150j
            r6.append(r1)
            java.lang.String r1 = " report:"
            r6.append(r1)
            kt1.g r1 = r0.f174141a
            kt1.d r1 = r1.mo8509M()
            r6.append(r1)
            java.lang.String r1 = " limitBlock:"
            r6.append(r1)
            r6.append(r8)
            r1 = 32
            r6.append(r1)
            kt1.g r1 = r0.f174141a
            kt1.d r1 = r1.mo8509M()
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kt1.C61169f.mo86104a(int, int, java.lang.String, ob0.c):void");
    }

    /* renamed from: b */
    public final void mo86105b(String str, String str2) {
        String str3;
        if (str2.length() < 4000) {
            Log.m105924i(str, str2);
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i < str2.length()) {
            int i3 = i + 4000;
            if (str2.length() <= i3) {
                str3 = str2.substring(i);
                C87412m.m108593f(str3, "this as java.lang.String).substring(startIndex)");
            } else {
                str3 = str2.substring(i, i3);
                C87412m.m108593f(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Log.m105924i(str, "=>id:" + i2 + ' ' + str3);
            i2++;
            i = i3;
        }
    }

    /* renamed from: c */
    public final void mo86106c(C47350c cVar) {
        C47465a aVar;
        this.f174145e.mo72289b();
        this.f174149i = C31543z5.m39453c();
        boolean z = true;
        if (this.f174148h == 1) {
            C61166a aVar2 = C61166a.f174128a;
            String str = cVar != null ? cVar.f127057c : null;
            if (str != null && !Util.isNullOrNil(str)) {
                if (!C61166a.f174129b.contains(C112550d0.m153794d0(str, "/", str))) {
                    z = false;
                }
            }
            if (!z && cVar != null && (aVar = cVar.f127055a.f127080a) != null) {
                String str2 = this.f174144d;
                Log.m105924i(str2, "##########request uri: ===> " + cVar.f127057c);
                if (BuildInfo.DEBUG) {
                    String str3 = this.f174144d;
                    Log.m105924i(str3, "uri:" + cVar.f127057c + " request stack: " + Util.getStack() + ' ');
                }
                String str4 = this.f174144d;
                mo86105b(str4, "uri:" + cVar.f127057c + " request buf: " + C61937h.m72709h(aVar));
            }
        }
    }
}
