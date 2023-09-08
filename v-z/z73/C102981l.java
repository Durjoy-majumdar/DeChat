package z73;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.io.IOException;
import java.util.Map;
import ke3.C88144b;
import te3.C51043r10;
import u73.C101972d;
import u73.C52469w0;
import w83.C15053a;

/* renamed from: z73.l */
public final class C102981l extends C15053a {

    /* renamed from: d */
    public static final C102981l f303911d = new C102981l();

    /* JADX WARNING: Removed duplicated region for block: B:99:0x0467  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r29, t83.C13851h1 r30) {
        /*
            r28 = this;
            r15 = r28
            r0 = r29
            r1 = r30
            java.lang.String r2 = "env"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "msg"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleMsg params:"
            r2.append(r3)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f38983a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.WebSearch.StartSearchItemDetailPageJSApi"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f38983a
            java.lang.String r2 = "isTeachPage"
            r4 = 0
            boolean r2 = com.tencent.p014mm.plugin.websearch.C43471q.m46980d(r1, r2, r4)
            java.lang.String r5 = "isMoreButton"
            boolean r5 = com.tencent.p014mm.plugin.websearch.C43471q.m46980d(r1, r5, r4)
            java.lang.String r6 = "isFeedBack"
            int r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r6, r4)
            r14 = 1
            if (r6 != r14) goto L_0x0046
            r6 = 1
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            java.lang.String r7 = "srcUserName"
            java.lang.String r9 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r7)
            java.lang.String r8 = "sessionId"
            java.lang.String r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r8)
            java.lang.String r11 = "navBarColor"
            java.lang.String r11 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r11)
            java.lang.String r12 = "subType"
            int r12 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r12, r4)
            java.lang.String r13 = "searchPlaceHolder"
            com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r13)
            java.lang.String r13 = "jumpUrl"
            java.lang.String r14 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r13)
            java.lang.String r4 = "searchClickId"
            r17 = r12
            java.lang.String r12 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r4)
            r18 = -1
            boolean r19 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            r20 = r4
            if (r19 != 0) goto L_0x009f
            java.lang.String r4 = "jumpUrlTmp"
            gy3.C87412m.m108593f(r14, r4)
            java.lang.String r4 = "http://mp.weixin.qq.com/imgretrieval"
            r21 = r12
            r12 = 0
            boolean r4 = z04.C112550d0.m153801u(r14, r4, r12)
            if (r4 != 0) goto L_0x009c
            java.lang.String r4 = "https://mp.weixin.qq.com/imgretrieval"
            boolean r4 = z04.C112550d0.m153801u(r14, r4, r12)
            if (r4 == 0) goto L_0x00a1
        L_0x009c:
            r18 = 3
            goto L_0x00a1
        L_0x009f:
            r21 = r12
        L_0x00a1:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r4 != 0) goto L_0x00cb
            int r4 = android.graphics.Color.parseColor(r11)     // Catch:{ IllegalArgumentException -> 0x00ae }
            r11 = r4
            r14 = 1
            goto L_0x00cd
        L_0x00ae:
            r0 = move-exception
            r1 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "startSearchItemDetailPage: "
            r0.append(r2)
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            r14 = 1
            return r14
        L_0x00cb:
            r14 = 1
            r11 = 0
        L_0x00cd:
            java.lang.String r4 = "statusBarStyle"
            java.lang.String r12 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r4)
            java.lang.String r14 = "url"
            if (r6 == 0) goto L_0x00fe
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r13)
            android.content.Context r1 = r0.f38998a
            android.os.Bundle r4 = r15.mo142717e(r1)
            android.content.Context r2 = r0.f38998a
            gy3.C87412m.m108593f(r3, r14)
            r13 = -1
            r5 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r9 = ""
            java.lang.String r12 = ""
            java.lang.String r14 = ""
            r1 = r28
            r1.mo142720h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x030a
        L_0x00fe:
            java.lang.String r6 = "type"
            r30 = r11
            r11 = 0
            int r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r6, r11)
            r23 = r7
            java.lang.String r7 = "opType"
            int r7 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r7, r11)
            r11 = 2
            r25 = r9
            r9 = 0
            if (r7 <= 0) goto L_0x019a
            if (r7 == r11) goto L_0x018e
            r3 = 3
            if (r7 == r3) goto L_0x0146
            r3 = 4
            if (r7 == r3) goto L_0x0121
            goto L_0x030a
        L_0x0121:
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r13)
            android.content.Context r2 = r0.f38998a
            gy3.C87412m.m108593f(r3, r14)
            android.content.Context r0 = r0.f38998a
            android.os.Bundle r4 = r15.mo142717e(r0)
            r13 = -1
            r5 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            java.lang.String r9 = ""
            java.lang.String r12 = ""
            java.lang.String r14 = ""
            r1 = r28
            r1.mo142720h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x030a
        L_0x0146:
            u73.d r1 = r15.mo142718f(r1)
            java.lang.String r3 = r1.f300226a
            boolean r3 = eb0.C45628s0.m50740E(r3)
            if (r3 != 0) goto L_0x0159
            android.content.Context r0 = r0.f38998a
            r15.mo142719g(r0, r1, r2)
            goto L_0x030a
        L_0x0159:
            android.content.Context r0 = r0.f38998a
            boolean r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r2 == 0) goto L_0x0166
            java.lang.String r2 = r1.f300226a
            u73.C52469w0.m58723a(r2)
        L_0x0166:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r1.f300226a
            java.lang.String r3 = "Chat_User"
            r2.putExtra(r3, r1)
            java.lang.String r1 = "finish_direct"
            r7 = 1
            r2.putExtra(r1, r7)
            java.lang.String r1 = "key_temp_session_show_type"
            r3 = 0
            r2.putExtra(r1, r3)
            r1 = 9
            java.lang.String r3 = "preChatTYPE"
            r2.putExtra(r3, r1)
            java.lang.String r1 = ".ui.chatting.ChattingUI"
            ke3.C88144b.m109801s(r0, r1, r2, r9)
            goto L_0x030a
        L_0x018e:
            r7 = 1
            u73.d r1 = r15.mo142718f(r1)
            android.content.Context r0 = r0.f38998a
            r15.mo142719g(r0, r1, r2)
            goto L_0x030a
        L_0x019a:
            r7 = 1
            java.lang.String r2 = "scene"
            java.lang.String r11 = "query"
            if (r5 == 0) goto L_0x0263
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r11)
            r3 = 0
            int r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r2, r3)
            java.lang.String r3 = "searchId"
            java.lang.String r1 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r3)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            com.tencent.mm.protocal.JsapiPermissionWrapper r12 = com.tencent.p014mm.protocal.JsapiPermissionWrapper.f121047h
            java.lang.String r13 = "hardcode_jspermission"
            r5.putExtra(r13, r12)
            com.tencent.mm.protocal.GeneralControlWrapper r12 = com.tencent.p014mm.protocal.GeneralControlWrapper.f121044e
            java.lang.String r13 = "hardcode_general_ctrl"
            r5.putExtra(r13, r12)
            java.lang.String r12 = "neverGetA8Key"
            r5.putExtra(r12, r7)
            java.lang.String r12 = "key_load_js_without_delay"
            r5.putExtra(r12, r7)
            java.lang.String r12 = "ftsQuery"
            r5.putExtra(r12, r0)
            java.lang.String r12 = "ftsType"
            r5.putExtra(r12, r6)
            r5.putExtra(r8, r10)
            java.lang.String r12 = ""
            r13 = 0
            java.util.Map r6 = u73.C101987v0.m134268b(r4, r13, r6, r12)
            java.lang.String r12 = "UTF-8"
            java.lang.String r12 = p206nj.C117627q.m165909b(r0, r12)     // Catch:{ Exception -> 0x01f3 }
            r13 = r6
            java.util.HashMap r13 = (java.util.HashMap) r13     // Catch:{ Exception -> 0x01f3 }
            r13.put(r11, r12)     // Catch:{ Exception -> 0x01f3 }
            goto L_0x01f9
        L_0x01f3:
            r12 = r6
            java.util.HashMap r12 = (java.util.HashMap) r12
            r12.put(r11, r0)
        L_0x01f9:
            r0 = r6
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r3, r1)
            r0.put(r8, r10)
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            java.lang.String r2 = u73.C101987v0.m134271e(r2)
            java.lang.String r8 = "subSessionId"
            r0.put(r8, r2)
            r5.putExtra(r8, r2)
            r0 = 0
            java.lang.String r0 = u73.C101987v0.m134270d(r6, r0)
            java.lang.String r2 = "rawUrl"
            r5.putExtra(r2, r0)
            java.lang.String r0 = "key_session_id"
            r5.putExtra(r0, r10)
            r5.putExtra(r3, r1)
            r0 = 20
            if (r4 == r0) goto L_0x0246
            r0 = 22
            if (r4 == r0) goto L_0x0246
            r0 = 24
            if (r4 == r0) goto L_0x0246
            r0 = 33
            if (r4 == r0) goto L_0x0246
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            ke3.C88144b.m109806x(r0, r5, r9)
            goto L_0x030a
        L_0x0246:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.util.List<ke3.b$e> r1 = ke3.C88144b.f254911a
            boolean r1 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
            java.lang.String r2 = "webview"
            if (r1 == 0) goto L_0x025c
            java.lang.String r1 = ".ui.tools.fts.MMFTSSOSMoreWebViewUI"
            ke3.C88144b.m109791i(r0, r2, r1, r5, r9)
            goto L_0x030a
        L_0x025c:
            java.lang.String r1 = ".ui.tools.fts.FTSSOSMoreWebViewUI"
            ke3.C88144b.m109791i(r0, r2, r1, r5, r9)
            goto L_0x030a
        L_0x0263:
            r5 = 2
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r10 = 0
            r8[r10] = r5
            r5 = r1
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r5 = r5.get(r14)
            r8[r7] = r5
            java.lang.String r5 = "doStartSearchItemDetailPage: type=%d link=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r8)
            if (r6 == r7) goto L_0x04a2
            java.lang.String r5 = "cookie"
            java.lang.String r8 = "jump url = %s, publishId = %s, payScene = %d"
            java.lang.String r10 = "payScene"
            java.lang.String r14 = "publishId"
            java.lang.String r9 = "h5PayCookie"
            r7 = 2
            if (r6 == r7) goto L_0x042e
            r7 = 4
            if (r6 == r7) goto L_0x042e
            r7 = 8
            r24 = r11
            java.lang.String r11 = "userName"
            if (r6 == r7) goto L_0x03d1
            r7 = 16
            if (r6 == r7) goto L_0x03c7
            r7 = 32
            if (r6 == r7) goto L_0x030e
            java.lang.String r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r13)
            java.lang.String r7 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r14)
            r11 = 0
            int r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r10, r11)
            int r16 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r2, r11)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r11] = r6
            r11 = 1
            r2[r11] = r7
            java.lang.Integer r19 = java.lang.Integer.valueOf(r10)
            r22 = 2
            r2[r22] = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r2)
            java.lang.String r8 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r5)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 != 0) goto L_0x0308
            android.content.Context r2 = r0.f38998a
            gy3.C87412m.m108593f(r6, r13)
            android.content.Context r0 = r0.f38998a
            android.os.Bundle r0 = r15.mo142717e(r0)
            gy3.C87412m.m108593f(r12, r4)
            gy3.C87412m.m108593f(r7, r14)
            r1 = r23
            r13 = r25
            gy3.C87412m.m108593f(r13, r1)
            gy3.C87412m.m108593f(r8, r9)
            r1 = r20
            r14 = r21
            gy3.C87412m.m108593f(r14, r1)
            r1 = r28
            r3 = r6
            r4 = r0
            r5 = r30
            r6 = r12
            r12 = 1
            r0 = r8
            r8 = r10
            r9 = r13
            r10 = r16
            r11 = r17
            r13 = 1
            r12 = r0
            r15 = 1
            r13 = r18
            r1.mo142720h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0308:
            r15 = r28
        L_0x030a:
            r19 = 1
            goto L_0x04ae
        L_0x030e:
            r15 = 1
            java.lang.String r2 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r11)
            java.lang.String r3 = "nickName"
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r3)
            java.lang.String r4 = "alias"
            java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r4)
            java.lang.String r5 = "signature"
            java.lang.String r5 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r5)
            java.lang.String r6 = "sex"
            r7 = 0
            int r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r6, r7)
            java.lang.String r8 = "country"
            java.lang.String r8 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r8)
            java.lang.String r9 = "city"
            java.lang.String r9 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r9)
            java.lang.String r10 = "province"
            java.lang.String r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r10)
            java.lang.String r11 = "snsFlag"
            int r11 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r11, r7)
            r12 = r24
            java.lang.String r12 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r12)
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x037d
            char r7 = r12.charAt(r7)
            boolean r7 = java.lang.Character.isDigit(r7)
            r13 = 15
            if (r7 == 0) goto L_0x0364
            r14 = 15
            goto L_0x0365
        L_0x0364:
            r14 = 3
        L_0x0365:
            if (r14 != r13) goto L_0x037b
            java.lang.String r7 = "matchType"
            java.lang.String r1 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r7)
            java.lang.String r7 = "mobile"
            boolean r1 = gy3.C87412m.m108589b(r7, r1)
            if (r1 == 0) goto L_0x0378
            goto L_0x037f
        L_0x0378:
            r12 = 0
            r14 = 1
            goto L_0x037f
        L_0x037b:
            r12 = 0
            goto L_0x037f
        L_0x037d:
            r12 = 0
            r14 = 3
        L_0x037f:
            android.content.Context r0 = r0.f38998a
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r7 = "Contact_User"
            r1.putExtra(r7, r2)
            java.lang.String r2 = "Contact_Nick"
            r1.putExtra(r2, r3)
            java.lang.String r2 = "Contact_Alias"
            r1.putExtra(r2, r4)
            java.lang.String r2 = "Contact_Sex"
            r1.putExtra(r2, r6)
            java.lang.String r2 = "Contact_Scene"
            r1.putExtra(r2, r14)
            java.lang.String r2 = "Contact_KHideExpose"
            r1.putExtra(r2, r15)
            java.lang.String r2 = com.tencent.p014mm.storage.RegionCodeDecoder.m124564q(r8, r10, r9)
            java.lang.String r3 = "Contact_RegionCode"
            r1.putExtra(r3, r2)
            java.lang.String r2 = "Contact_Signature"
            r1.putExtra(r2, r5)
            java.lang.String r2 = "Contact_KSnsIFlag"
            r1.putExtra(r2, r11)
            java.lang.String r2 = "Contact_full_Mobile_MD5"
            r1.putExtra(r2, r12)
            java.lang.String r2 = "profile"
            java.lang.String r3 = ".ui.ContactInfoUI"
            r4 = 0
            ke3.C88144b.m109791i(r0, r2, r3, r1, r4)
            goto L_0x0308
        L_0x03c7:
            r26 = r21
            r6 = r23
            r7 = r25
            r15 = 1
            r27 = r20
            goto L_0x0437
        L_0x03d1:
            r15 = 1
            java.lang.String r2 = "objectXmlDesc"
            java.lang.String r2 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r2)
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r11)
            java.lang.String r4 = "fromMusicItem"
            r5 = 0
            boolean r1 = com.tencent.p014mm.plugin.websearch.C43471q.m46980d(r1, r4, r5)
            android.content.Context r0 = r0.f38998a
            java.lang.String r4 = "xml"
            gy3.C87412m.m108593f(r2, r4)
            gy3.C87412m.m108593f(r3, r11)
            java.lang.Class<jr2.v> r4 = jr2.C99018v.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            jr2.v r4 = (jr2.C99018v) r4
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r4.It0(r2)
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            java.lang.String r5 = "INTENT_TALKER"
            r4.putExtra(r5, r3)
            java.math.BigInteger r3 = new java.math.BigInteger
            java.lang.String r5 = r2.f283893Id
            r3.<init>(r5)
            long r5 = r3.longValue()
            java.lang.String r3 = "INTENT_SNSID"
            r4.putExtra(r3, r5)
            java.lang.String r3 = "SNS_FROM_MUSIC_ITEM"
            r4.putExtra(r3, r1)
            java.lang.String r1 = "INTENT_SNS_TIMELINEOBJECT"
            byte[] r2 = r2.toByteArray()     // Catch:{ IOException -> 0x0423 }
            r4.putExtra(r1, r2)     // Catch:{ IOException -> 0x0423 }
        L_0x0423:
            java.lang.String r1 = "sns"
            java.lang.String r2 = ".ui.SnsCommentDetailUI"
            r3 = 0
            ke3.C88144b.m109791i(r0, r1, r2, r4, r3)
            goto L_0x0308
        L_0x042e:
            r27 = r20
            r26 = r21
            r6 = r23
            r7 = r25
            r15 = 1
        L_0x0437:
            java.lang.String r11 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r13)
            java.lang.String r15 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r14)
            r20 = r9
            r9 = 0
            int r10 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r10, r9)
            int r16 = com.tencent.p014mm.plugin.websearch.C43471q.m46981e(r1, r2, r9)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r9] = r11
            r9 = 1
            r2[r9] = r15
            java.lang.Integer r19 = java.lang.Integer.valueOf(r10)
            r21 = 2
            r2[r21] = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r2)
            java.lang.String r8 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r1, r5)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r1 != 0) goto L_0x0308
            android.content.Context r2 = r0.f38998a
            gy3.C87412m.m108593f(r11, r13)
            android.content.Context r0 = r0.f38998a
            r19 = 1
            r13 = r28
            android.os.Bundle r0 = r13.mo142717e(r0)
            gy3.C87412m.m108593f(r12, r4)
            gy3.C87412m.m108593f(r15, r14)
            gy3.C87412m.m108593f(r7, r6)
            r1 = r20
            gy3.C87412m.m108593f(r8, r1)
            r14 = r26
            r1 = r27
            gy3.C87412m.m108593f(r14, r1)
            r1 = r28
            r3 = r11
            r4 = r0
            r5 = r30
            r6 = r12
            r0 = r7
            r7 = r15
            r12 = r8
            r8 = r10
            r9 = r0
            r10 = r16
            r11 = r17
            r15 = r13
            r13 = r18
            r1.mo142720h(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x04ae
        L_0x04a2:
            r19 = 1
            u73.d r1 = r15.mo142718f(r1)
            android.content.Context r0 = r0.f38998a
            r2 = 0
            r15.mo142719g(r0, r1, r2)
        L_0x04ae:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: z73.C102981l.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return 10000;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "startSearchItemDetailPageJsApi";
    }

    /* renamed from: e */
    public final Bundle mo142717e(Context context) {
        if (!(context instanceof AppCompatActivity)) {
            return null;
        }
        Bundle bundle = new Bundle();
        AppCompatActivity appCompatActivity = (AppCompatActivity) context;
        bundle.putString("publishIdPrefix", appCompatActivity.getIntent().getStringExtra("publishIdPrefix"));
        bundle.putString("reportSessionId", appCompatActivity.getIntent().getStringExtra("reportSessionId"));
        return bundle;
    }

    /* renamed from: f */
    public final C101972d mo142718f(Map<String, ? extends Object> map) {
        C101972d dVar = new C101972d();
        dVar.f300226a = C43471q.m46982f(map, "userName");
        dVar.f300227b = C43471q.m46982f(map, "nickName");
        dVar.f300228c = C43471q.m46982f(map, "headHDImgUrl");
        dVar.f300230e = C43471q.m46981e(map, "verifyFlag", 0);
        dVar.f300229d = C43471q.m46982f(map, "signature");
        dVar.f300231f = C43471q.m46981e(map, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        dVar.f300232g = C43471q.m46981e(map, "sceneActionType", 1);
        C51043r10 r102 = new C51043r10();
        dVar.f300233h = r102;
        r102.f140656d = C43471q.m46981e(map, "brandFlag", 0);
        dVar.f300233h.f140659g = C43471q.m46982f(map, "iconUrl");
        dVar.f300233h.f140658f = C43471q.m46982f(map, "brandInfo");
        dVar.f300233h.f140657e = C43471q.m46982f(map, "externalInfo");
        dVar.f300234i = C43471q.m46982f(map, "searchId");
        dVar.f300235j = C43471q.m46982f(map, "searchClickId");
        dVar.f300236k = C43471q.m46982f(map, SearchIntents.EXTRA_QUERY);
        dVar.f300237l = C43471q.m46981e(map, "position", 0);
        dVar.f300238m = C43471q.m46980d(map, "isCurrentDetailPage", false);
        dVar.f300239n = C43471q.m46982f(map, "extraParams");
        dVar.f300240o = C43471q.m46981e(map, "friendScene", 0);
        if (C43471q.m46981e(map, "bizTabType", 0) == 2) {
            dVar.f300241p = 1;
        } else {
            dVar.f300241p = 0;
        }
        return dVar;
    }

    /* renamed from: g */
    public final void mo142719g(Context context, C101972d dVar, boolean z) {
        int i = dVar.f300240o;
        if (i == 0) {
            if (dVar.f300232g == 2) {
                i = 89;
            } else if (z) {
                i = 85;
            } else {
                int i2 = dVar.f300231f;
                i = (i2 == 3 || i2 == 16) ? dVar.f300238m ? 88 : 87 : 39;
            }
        }
        if (MMApplicationContext.isMainProcess()) {
            C52469w0.m58723a(dVar.f300226a);
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", dVar.f300226a);
        intent.putExtra("Contact_Nick", dVar.f300227b);
        intent.putExtra("Contact_BrandIconURL", dVar.f300228c);
        intent.putExtra("Contact_Signature", dVar.f300229d);
        intent.putExtra("Contact_VUser_Info_Flag", dVar.f300230e);
        intent.putExtra("Contact_Scene", i);
        C51043r10 r102 = dVar.f300233h;
        if (r102 != null) {
            try {
                intent.putExtra("Contact_customInfo", r102.toByteArray());
            } catch (IOException unused) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("Contact_Ext_Args_Search_Id", dVar.f300234i);
        bundle.putString("Contact_Ext_Args_Search_Click_Id", dVar.f300235j);
        bundle.putString("Contact_Ext_Args_Query_String", dVar.f300236k);
        bundle.putInt("Contact_Scene", i);
        bundle.putInt("Contact_Ext_Args_Index", dVar.f300237l);
        bundle.putString("Contact_Ext_Extra_Params", dVar.f300239n);
        intent.putExtra("preChatTYPE", 10);
        intent.putExtra("Contact_Ext_Args", bundle);
        intent.putExtra("biz_profile_tab_type", dVar.f300241p);
        intent.putExtra("force_get_contact", true);
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005c, code lost:
        if (r8 != null) goto L_0x0062;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo142720h(android.content.Context r12, java.lang.String r13, android.os.Bundle r14, int r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, int r20, int r21, java.lang.String r22, int r23, java.lang.String r24) {
        /*
            r11 = this;
            r1 = r13
            r2 = r14
            r3 = r17
            r4 = r18
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r0 = "rawUrl"
            r5.putExtra(r0, r13)
            java.lang.String r0 = "convertActivityFromTranslucent"
            r6 = 0
            r5.putExtra(r0, r6)
            java.lang.String r0 = "customize_status_bar_color"
            r7 = r15
            r5.putExtra(r0, r15)
            java.lang.String r0 = "status_bar_style"
            r7 = r16
            r5.putExtra(r0, r7)
            java.lang.String r0 = "from_scence"
            r7 = r20
            r5.putExtra(r0, r7)
            java.lang.String r0 = "subtype"
            r7 = r21
            r5.putExtra(r0, r7)
            java.lang.String r0 = "key_h5pay_cookie"
            r7 = r22
            r5.putExtra(r0, r7)
            r7 = 1
            java.lang.String r0 = "KPageScene"
            r5.putExtra(r0, r7)     // Catch:{ Exception -> 0x007f }
            boolean r0 = z04.C112551y.m153811k(r24)     // Catch:{ Exception -> 0x007f }
            if (r0 == 0) goto L_0x0060
            java.lang.String r0 = ""
            boolean r8 = z04.C112551y.m153811k(r13)     // Catch:{ Exception -> 0x005e }
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x005e
            android.net.Uri r8 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x005e }
            java.lang.String r9 = "search_click_id"
            java.lang.String r8 = r8.getQueryParameter(r9)     // Catch:{ Exception -> 0x005e }
            if (r8 != 0) goto L_0x0062
        L_0x005e:
            r8 = r0
            goto L_0x0062
        L_0x0060:
            r8 = r24
        L_0x0062:
            java.lang.String r0 = "KPageInfo"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x007f }
            r9.<init>()     // Catch:{ Exception -> 0x007f }
            java.lang.String r10 = "{ \"searchClickId\" : \""
            r9.append(r10)     // Catch:{ Exception -> 0x007f }
            r9.append(r8)     // Catch:{ Exception -> 0x007f }
            java.lang.String r8 = "\"}"
            r9.append(r8)     // Catch:{ Exception -> 0x007f }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x007f }
            r5.putExtra(r0, r8)     // Catch:{ Exception -> 0x007f }
            goto L_0x008a
        L_0x007f:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r8 = "MicroMsg.WebSearch.StartSearchItemDetailPageJSApi"
            java.lang.String r9 = "startSearchItemDetailPageUrl getSearchClickId exception"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r9, r6)
        L_0x008a:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r17)
            java.lang.String r6 = "KPublisherId"
            java.lang.String r8 = "prePublishId"
            if (r0 != 0) goto L_0x009c
            r5.putExtra(r8, r3)
            r5.putExtra(r6, r3)
            goto L_0x00d7
        L_0x009c:
            if (r2 == 0) goto L_0x00d7
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x00d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "publishIdPrefix"
            java.lang.String r9 = "gs"
            java.lang.String r2 = r14.getString(r3, r9)
            r0.append(r2)
            r2 = 95
            r0.append(r2)
            java.nio.charset.Charset r2 = z04.C119027c.f356488a
            byte[] r1 = r13.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r1 = p823sg.C90193h.m112878f(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.putExtra(r8, r0)
            r5.putExtra(r6, r0)
        L_0x00d7:
            if (r4 <= 0) goto L_0x00df
            java.lang.String r0 = "pay_channel"
            r5.putExtra(r0, r4)
        L_0x00df:
            r0 = 65
            java.lang.String r1 = "geta8key_scene"
            r5.putExtra(r1, r0)
            r0 = 10
            java.lang.String r1 = "preChatTYPE"
            r5.putExtra(r1, r0)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = "srcUsername"
            r1 = r19
            r5.putExtra(r0, r1)
        L_0x00fc:
            r0 = 3
            r1 = r23
            if (r1 != r0) goto L_0x0107
            java.lang.String r0 = "show_native_web_view"
            r5.putExtra(r0, r7)
        L_0x0107:
            r1 = r12
            ke3.C88144b.m109808z(r12, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z73.C102981l.mo142720h(android.content.Context, java.lang.String, android.os.Bundle, int, java.lang.String, java.lang.String, int, java.lang.String, int, int, java.lang.String, int, java.lang.String):void");
    }
}
