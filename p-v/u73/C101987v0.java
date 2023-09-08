package u73;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import bh3.C113177k;
import com.tencent.p014mm.autogen.events.PreLoadWebSearchDataEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ke3.C88144b;
import ky2.C10432i;
import oa1.C117731d;
import p385u2.C111105a;
import p823sg.C77710q;
import q62.C101048b;
import qe3.C89625d;
import te3.C48884bn2;
import te3.C64816wv;
import te3.uh4;

/* renamed from: u73.v0 */
public class C101987v0 {
    /* renamed from: a */
    public static Map<String, String> m134267a(int i, boolean z, int i2) {
        return m134268b(i, z, i2, "");
    }

    /* renamed from: b */
    public static Map<String, String> m134268b(int i, boolean z, int i2, String str) {
        return m134269c(i, z, i2, str, "", "", "", "", "", "", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0238, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0239, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023a, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.WebSearch.WebSearchInnerLogic", "genFTSParams scene=%d isHomePage=%b type=%d %b %b %b", java.lang.Integer.valueOf(r17), java.lang.Boolean.valueOf(r18), java.lang.Integer.valueOf(r19), java.lang.Boolean.valueOf(r3), java.lang.Boolean.valueOf(r8), java.lang.Boolean.valueOf(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x026c, code lost:
        if (r3 == false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026e, code lost:
        r2.put("isSug", "1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0274, code lost:
        if (r8 == false) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0276, code lost:
        r2.put("isLocalSug", "1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x027c, code lost:
        if (r12 == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x027e, code lost:
        r2.put("isMostSearchBiz", "1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0287, code lost:
        if (r18 == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0289, code lost:
        r2.put("isHomePage", "1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x028d, code lost:
        r2.put("isHomePage", "0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0292, code lost:
        r0 = kg3.C76577a.m92165p(com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x029e, code lost:
        if (r0 == 1.0f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a5, code lost:
        if (r0 == 0.8f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ac, code lost:
        if (r0 == 1.1f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b3, code lost:
        if (r0 == 1.12f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02b9, code lost:
        if (r0 == 1.125f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c0, code lost:
        if (r0 == 1.4f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c7, code lost:
        if (r0 == 1.55f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ce, code lost:
        if (r0 == 1.65f) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02d0, code lost:
        r0 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02d2, code lost:
        r2.put("fontRatio", java.lang.String.valueOf(r0));
        r2.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, com.tencent.p014mm.plugin.websearch.C43471q.m46979c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02e9, code lost:
        if (qc0.C101093a.m132481c() == false) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02eb, code lost:
        r0 = qc0.C101093a.m132480b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ef, code lost:
        if (r0 == null) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f1, code lost:
        r2.put("musicSnsId", r0.f295960e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02f9, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0167, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0176, code lost:
        if (u73.C78137s0.m94340d("emoticonMall").optInt("sugSwitch", 0) == 1) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0183, code lost:
        if (u73.C78137s0.m94340d("bizUnionTopEntry").optInt("sugSwitch") == 1) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0190, code lost:
        if (u73.C78137s0.m94340d("bizEntry").optInt("sugSwitch") == 1) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01f1  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.String> m134269c(int r17, boolean r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
        /*
            r0 = r17
            r1 = r19
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r21)
            if (r3 != 0) goto L_0x0017
            java.lang.String r3 = "searchId"
            r4 = r21
            r2.put(r3, r4)
        L_0x0017:
            boolean r3 = android.text.TextUtils.isEmpty(r22)
            if (r3 != 0) goto L_0x0025
            java.lang.String r3 = "sessionId"
            r4 = r22
            r2.put(r3, r4)
        L_0x0025:
            boolean r3 = android.text.TextUtils.isEmpty(r25)
            if (r3 != 0) goto L_0x0033
            java.lang.String r3 = "subSessionId"
            r4 = r25
            r2.put(r3, r4)
        L_0x0033:
            boolean r3 = android.text.TextUtils.isEmpty(r23)
            if (r3 != 0) goto L_0x0041
            java.lang.String r3 = "query"
            r4 = r23
            r2.put(r3, r4)
        L_0x0041:
            boolean r3 = android.text.TextUtils.isEmpty(r24)
            if (r3 != 0) goto L_0x004f
            java.lang.String r3 = "sceneActionType"
            r4 = r24
            r2.put(r3, r4)
        L_0x004f:
            boolean r3 = android.text.TextUtils.isEmpty(r27)
            if (r3 != 0) goto L_0x005d
            java.lang.String r3 = "pRequestId"
            r4 = r27
            r2.put(r3, r4)
        L_0x005d:
            java.lang.String r3 = java.lang.String.valueOf(r17)
            java.lang.String r4 = "scene"
            r2.put(r4, r3)
            java.lang.String r3 = java.lang.String.valueOf(r19)
            java.lang.String r4 = "type"
            r2.put(r4, r3)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r3)
            java.lang.String r4 = "lang"
            r2.put(r4, r3)
            java.lang.String r3 = "platform"
            java.lang.String r4 = "android"
            r2.put(r3, r4)
            boolean r3 = eb0.C45628s0.m50756U()
            java.lang.String r4 = "1"
            if (r3 == 0) goto L_0x0095
            java.lang.String r3 = "isOverSeaUser"
            r2.put(r3, r4)
        L_0x0095:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r3 != 0) goto L_0x00ac
            java.lang.String r3 = "wechat_reg_country"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r3)
            java.lang.String r5 = "reg_country"
            java.lang.String r6 = "CN"
            java.lang.String r3 = r3.decodeString(r5, r6)
            goto L_0x00be
        L_0x00ac:
            f40.o r3 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()
            r5 = 274436(0x43004, float:3.84567E-40)
            r6 = 0
            java.lang.Object r3 = r3.mo119684e(r5, r6)
            java.lang.String r3 = (java.lang.String) r3
        L_0x00be:
            java.lang.String r5 = "regCountry"
            r2.put(r5, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r26)
            if (r3 != 0) goto L_0x00d2
            java.lang.String r3 = "poiInfo"
            r5 = r26
            r2.put(r3, r5)
        L_0x00d2:
            boolean r3 = android.text.TextUtils.isEmpty(r20)
            if (r3 != 0) goto L_0x00df
            java.lang.String r3 = "extParams"
            r5 = r20
            r2.put(r3, r5)
        L_0x00df:
            r3 = 21
            r5 = 0
            r6 = 1
            if (r0 == r3) goto L_0x00ee
            int r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r5)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x00f6
        L_0x00ee:
            int r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r6)
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L_0x00f6:
            java.lang.String r7 = "version"
            r2.put(r7, r3)
            r3 = 512(0x200, float:7.175E-43)
            r7 = 1024(0x400, float:1.435E-42)
            r8 = 8
            java.lang.String r9 = "mixSugSwitch"
            java.lang.String r10 = "bizSugSwitch"
            java.lang.String r11 = "mixGlobal"
            r12 = 4
            r13 = 2
            r14 = 384(0x180, float:5.38E-43)
            java.lang.String r15 = "sugSwitch"
            switch(r0) {
                case 3: goto L_0x0193;
                case 6: goto L_0x0186;
                case 9: goto L_0x0186;
                case 11: goto L_0x0179;
                case 14: goto L_0x0193;
                case 20: goto L_0x0193;
                case 22: goto L_0x0193;
                case 24: goto L_0x016a;
                case 33: goto L_0x0167;
                case 34: goto L_0x0167;
                case 42: goto L_0x0163;
                case 65: goto L_0x0167;
                case 67: goto L_0x0167;
                case 77: goto L_0x0167;
                case 81: goto L_0x0167;
                case 83: goto L_0x0167;
                case 100: goto L_0x0167;
                case 101: goto L_0x0167;
                case 102: goto L_0x0167;
                case 201: goto L_0x0163;
                case 300: goto L_0x0116;
                default: goto L_0x0114;
            }
        L_0x0114:
            goto L_0x0238
        L_0x0116:
            org.json.JSONObject r11 = u73.C78137s0.m94340d(r11)
            if (r18 == 0) goto L_0x0123
            int r3 = r11.optInt(r9, r5)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0123:
            if (r1 != r6) goto L_0x012c
            int r3 = r11.optInt(r10, r5)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x012c:
            if (r1 != r8) goto L_0x0138
            java.lang.String r3 = "snsSugSwitch"
            int r3 = r11.optInt(r3, r5)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0138:
            if (r1 != r7) goto L_0x0144
            java.lang.String r3 = "novelSugSwitch"
            int r3 = r11.optInt(r3, r5)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0144:
            if (r1 != r3) goto L_0x0150
            java.lang.String r3 = "musicSugSwitch"
            int r3 = r11.optInt(r3, r5)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0150:
            if (r1 == r14) goto L_0x015a
            r3 = 256(0x100, float:3.59E-43)
            if (r1 == r3) goto L_0x015a
            r3 = 128(0x80, float:1.794E-43)
            if (r1 != r3) goto L_0x0238
        L_0x015a:
            java.lang.String r3 = "emotionSugSwitch"
            int r3 = r11.optInt(r3, r5)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0163:
            r3 = 1
            r8 = 1
            goto L_0x023a
        L_0x0167:
            r3 = 1
            goto L_0x0239
        L_0x016a:
            if (r1 != r14) goto L_0x0238
            java.lang.String r3 = "emoticonMall"
            org.json.JSONObject r3 = u73.C78137s0.m94340d(r3)
            int r3 = r3.optInt(r15, r5)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0179:
            java.lang.String r3 = "bizUnionTopEntry"
            org.json.JSONObject r3 = u73.C78137s0.m94340d(r3)
            int r3 = r3.optInt(r15)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0186:
            java.lang.String r3 = "bizEntry"
            org.json.JSONObject r3 = u73.C78137s0.m94340d(r3)
            int r3 = r3.optInt(r15)
            if (r3 != r6) goto L_0x0238
            goto L_0x0167
        L_0x0193:
            java.lang.String r16 = "bizTab"
            if (r1 != r6) goto L_0x01a3
            org.json.JSONObject r14 = u73.C78137s0.m94340d(r16)
            int r10 = r14.optInt(r10, r5)
            if (r10 != r6) goto L_0x01a3
            r10 = 1
            goto L_0x01a4
        L_0x01a3:
            r10 = 0
        L_0x01a4:
            if (r1 != r13) goto L_0x01b3
            java.lang.String r14 = "articleTab"
            org.json.JSONObject r14 = u73.C78137s0.m94340d(r14)
            int r14 = r14.optInt(r15, r5)
            if (r14 != r6) goto L_0x01b3
            r10 = 1
        L_0x01b3:
            if (r1 != r8) goto L_0x01ce
            java.lang.String r8 = "snsTab"
            org.json.JSONObject r8 = u73.C78137s0.m94340d(r8)
            int r14 = r8.optInt(r15, r5)
            if (r14 != r6) goto L_0x01c3
            r10 = 1
        L_0x01c3:
            java.lang.String r14 = "localSugSwitch"
            int r8 = r8.optInt(r14, r5)
            if (r8 != r6) goto L_0x01ce
            r8 = 1
            goto L_0x01cf
        L_0x01ce:
            r8 = 0
        L_0x01cf:
            if (r18 != 0) goto L_0x01e0
            if (r1 != r12) goto L_0x01e0
            org.json.JSONObject r14 = u73.C78137s0.m94340d(r16)
            java.lang.String r12 = "bizServiceSugSwitch"
            int r12 = r14.optInt(r12, r5)
            if (r12 != r6) goto L_0x01e0
            r10 = 1
        L_0x01e0:
            if (r1 != r6) goto L_0x01f1
            org.json.JSONObject r12 = u73.C78137s0.m94340d(r16)
            java.lang.String r14 = "mfsBizSwitch"
            int r12 = r12.optInt(r14, r5)
            if (r12 != r6) goto L_0x01f1
            r12 = 1
            goto L_0x01f2
        L_0x01f1:
            r12 = 0
        L_0x01f2:
            if (r1 != r7) goto L_0x0202
            java.lang.String r7 = "novelTab"
            org.json.JSONObject r7 = u73.C78137s0.m94340d(r7)
            int r7 = r7.optInt(r15, r5)
            if (r7 != r6) goto L_0x0202
            r10 = 1
        L_0x0202:
            if (r1 != r3) goto L_0x0215
            java.lang.String r3 = "musicTab"
            org.json.JSONObject r3 = u73.C78137s0.m94340d(r3)
            int r3 = r3.optInt(r15, r5)
            if (r3 != r6) goto L_0x0215
            r3 = 384(0x180, float:5.38E-43)
            r10 = 1
            goto L_0x0217
        L_0x0215:
            r3 = 384(0x180, float:5.38E-43)
        L_0x0217:
            if (r1 != r3) goto L_0x0227
            java.lang.String r3 = "emotionTab"
            org.json.JSONObject r3 = u73.C78137s0.m94340d(r3)
            int r3 = r3.optInt(r15, r5)
            if (r3 != r6) goto L_0x0227
            r3 = 1
            goto L_0x0228
        L_0x0227:
            r3 = r10
        L_0x0228:
            if (r1 != 0) goto L_0x023b
            if (r18 == 0) goto L_0x023b
            org.json.JSONObject r7 = u73.C78137s0.m94340d(r11)
            int r7 = r7.optInt(r9, r5)
            if (r7 != r6) goto L_0x023b
            r3 = 1
            goto L_0x023b
        L_0x0238:
            r3 = 0
        L_0x0239:
            r8 = 0
        L_0x023a:
            r12 = 0
        L_0x023b:
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r7[r5] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r7[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r7[r13] = r0
            r0 = 3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r7[r0] = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1 = 4
            r7[r1] = r0
            r0 = 5
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            r7[r0] = r1
            java.lang.String r0 = "MicroMsg.WebSearch.WebSearchInnerLogic"
            java.lang.String r1 = "genFTSParams scene=%d isHomePage=%b type=%d %b %b %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r1, r7)
            if (r3 == 0) goto L_0x0274
            java.lang.String r0 = "isSug"
            r2.put(r0, r4)
        L_0x0274:
            if (r8 == 0) goto L_0x027c
            java.lang.String r0 = "isLocalSug"
            r2.put(r0, r4)
        L_0x027c:
            if (r12 == 0) goto L_0x0284
            java.lang.String r0 = "isMostSearchBiz"
            r2.put(r0, r4)
        L_0x0284:
            java.lang.String r0 = "isHomePage"
            if (r18 == 0) goto L_0x028d
            r2.put(r0, r4)
            goto L_0x0292
        L_0x028d:
            java.lang.String r1 = "0"
            r2.put(r0, r1)
        L_0x0292:
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            float r0 = kg3.C76577a.m92165p(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r3 = 1066359849(0x3f8f5c29, float:1.12)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r3 = 1066401792(0x3f900000, float:1.125)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r3 = 1068708659(0x3fb33333, float:1.4)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r3 = 1069966950(0x3fc66666, float:1.55)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r3 = 1070805811(0x3fd33333, float:1.65)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x02d2
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x02d2:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "fontRatio"
            r2.put(r1, r0)
            java.lang.String r0 = com.tencent.p014mm.plugin.websearch.C43471q.m46979c()
            java.lang.String r1 = "netType"
            r2.put(r1, r0)
            boolean r0 = qc0.C101093a.m132481c()
            if (r0 == 0) goto L_0x02f9
            qc0.m r0 = qc0.C101093a.m132480b()
            if (r0 == 0) goto L_0x02f9
            java.lang.String r0 = r0.f295960e
            java.lang.String r1 = "musicSnsId"
            r2.put(r1, r0)
        L_0x02f9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u73.C101987v0.m134269c(int, boolean, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.util.Map");
    }

    /* renamed from: d */
    public static String m134270d(Map<String, String> map, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("file://");
        String o = C43471q.m46983g(i).mo71077o();
        map.put("isOpenPreload", "1");
        stringBuffer.append(o);
        if (map.size() > 0) {
            stringBuffer.append("/");
            stringBuffer.append(C43471q.m46983g(i).mo71058f());
            stringBuffer.append("?");
            for (Map.Entry next : map.entrySet()) {
                stringBuffer.append((String) next.getKey());
                stringBuffer.append("=");
                stringBuffer.append((String) next.getValue());
                stringBuffer.append("&");
            }
            String str = map.get("sessionId");
            if (!map.containsKey("sessionId")) {
                str = m134271e(Util.safeParseInt(map.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
                stringBuffer.append("sessionId");
                stringBuffer.append("=");
                stringBuffer.append(str);
                stringBuffer.append("&");
            }
            if (!map.containsKey("subSessionId")) {
                stringBuffer.append("subSessionId");
                stringBuffer.append("=");
                stringBuffer.append(str);
                stringBuffer.append("&");
            }
            stringBuffer.append("wechatVersion");
            stringBuffer.append("=");
            stringBuffer.append(C89625d.f257841g);
            stringBuffer.append("&");
            return stringBuffer.substring(0, stringBuffer.length() - 1);
        }
        stringBuffer.append("/");
        stringBuffer.append(C43471q.m46983g(i).mo71058f());
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static final String m134271e(int i) {
        if (MMApplicationContext.isMainProcess()) {
            return i + "_" + C77710q.m93738a(C86709a0.m107523b().mo121110g()) + "_" + System.currentTimeMillis();
        }
        return i + "_" + C117731d.m166007c().mo182446h() + "_" + System.currentTimeMillis();
    }

    /* renamed from: f */
    public static C64816wv m134272f() {
        Class cls = C10432i.class;
        C64816wv wvVar = new C64816wv();
        boolean e = ((C10432i) C86312j.m106911c(cls)).mo10750e();
        wvVar.f186215g = e;
        if (e) {
            int fd = ((C10432i) C86312j.m106911c(cls)).mo10751fd();
            int i = 0;
            wvVar.f186212d = fd != 0 ? fd != 1 ? fd != 2 ? 0 : 2 : 1 : 3;
            int Oh0 = ((C10432i) C86312j.m106911c(cls)).Oh0();
            wvVar.f186213e = Oh0 != 0 ? Oh0 != 1 ? Oh0 != 2 ? 0 : 2 : 1 : 3;
            int Mn = ((C10432i) C86312j.m106911c(cls)).mo10740Mn();
            if (Mn == 0) {
                i = 3;
            } else if (Mn == 1) {
                i = 1;
            } else if (Mn == 2) {
                i = 2;
            }
            wvVar.f186214f = i;
        }
        return wvVar;
    }

    /* renamed from: g */
    public static C48884bn2 m134273g() {
        try {
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(67591, (Object) null);
            if (str != null) {
                C48884bn2 bn22 = new C48884bn2();
                String[] split = str.split(",");
                bn22.f131221f = Integer.valueOf(split[0]).intValue();
                bn22.f131224i = Integer.valueOf(split[1]).intValue();
                bn22.f131220e = ((float) Integer.valueOf(split[2]).intValue()) / 1000000.0f;
                bn22.f131219d = ((float) Integer.valueOf(split[3]).intValue()) / 1000000.0f;
                bn22.f131226n = m134274h() ? 0 : 1;
                Log.m105925i("MicroMsg.WebSearch.WebSearchInnerLogic", "lbs location is not null, %f, %f", Float.valueOf(bn22.f131220e), Float.valueOf(bn22.f131219d));
                return bn22;
            }
            Log.m105924i("MicroMsg.WebSearch.WebSearchInnerLogic", "lbs location is null, lbsContent is null!");
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_lbslocationnew_default_null, 0) == 1) {
                return null;
            }
            C48884bn2 bn23 = new C48884bn2();
            bn23.f131221f = 0;
            bn23.f131224i = 0;
            bn23.f131220e = 0.0f;
            bn23.f131219d = 0.0f;
            bn23.f131226n = m134274h() ? 0 : 1;
            return bn23;
        } catch (Exception e) {
            Log.m105925i("MicroMsg.WebSearch.WebSearchInnerLogic", "lbs location is null, reason %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public static boolean m134274h() {
        return (C111105a.m151499a(MMApplicationContext.getContext(), "android.permission.ACCESS_FINE_LOCATION") == 0) && ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.SEARCH);
    }

    /* renamed from: i */
    public static boolean m134275i() {
        int Pe = ((C101048b) C86312j.m106911c(C101048b.class)).mo60591Pe();
        boolean z = Pe == 3 || Pe == 4 || Pe == 5;
        Log.m105925i("MicroMsg.WebSearch.WebSearchInnerLogic", "isFreeSimCard result :%b simType: %d", Boolean.valueOf(z), Integer.valueOf(Pe));
        return z;
    }

    /* renamed from: j */
    public static final boolean m134276j() {
        return ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
    }

    /* renamed from: k */
    public static void m134277k(Context context, String str, Intent intent, String str2, String str3, String str4, String str5, String str6) {
        Context context2 = context;
        String str7 = str;
        Intent intent2 = intent;
        String str8 = str2;
        if (intent2 == null || context2 == null) {
            Log.m105920e("MicroMsg.WebSearch.WebSearchInnerLogic", "openNews intent is null, or context is null");
            return;
        }
        intent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
        intent2.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
        intent2.putExtra("neverGetA8Key", true);
        intent2.putExtra("ftsbizscene", 21);
        intent2.putExtra("ftsQuery", str7);
        if (str8 != null) {
            intent2.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, str8);
        }
        intent2.putExtra("isWebwx", str7);
        intent2.putExtra("ftscaneditable", false);
        intent2.putExtra("key_load_js_without_delay", true);
        String e = TextUtils.isEmpty(str5) ? m134271e(21) : str5;
        Map<String, String> c = m134269c(21, false, 2, str3, str4, e, str, String.valueOf(2), TextUtils.isEmpty(str6) ? m134271e(21) : str6, "", "");
        if (!Util.isNullOrNil("")) {
            ((HashMap) c).put("redPointMsgId", "");
        }
        intent2.putExtra("rawUrl", m134270d(c, 1));
        intent2.putExtra("sessionId", e);
        intent2.putExtra("customize_status_bar_color", Color.parseColor("#F2F2F2"));
        intent2.putExtra("status_bar_style", "black");
        C88144b.m109791i(context, "webview", ".ui.tools.fts.FTSWebViewUI", intent2, (Bundle) null);
    }

    /* renamed from: l */
    public static void m134278l(String str, String str2, String str3, String str4, int i, String str5, int i2, String str6, int i3, String str7, Map<String, String> map) {
        PreLoadWebSearchDataEvent preLoadWebSearchDataEvent = new PreLoadWebSearchDataEvent();
        PreLoadWebSearchDataEvent.C92545a aVar = preLoadWebSearchDataEvent.f264991d;
        aVar.f264994c = str4;
        aVar.f264992a = str2;
        aVar.f264993b = str3;
        aVar.f264995d = i;
        aVar.f264996e = str;
        aVar.f264998g = str5;
        aVar.f264999h = i2;
        aVar.f264997f = str6;
        aVar.f265000i = i3;
        aVar.f265001j = str7;
        aVar.f265002k = map;
        preLoadWebSearchDataEvent.publish();
    }

    /* renamed from: m */
    public static void m134279m(Activity activity, uh4 uh4, int i) {
        Class cls = C10432i.class;
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(activity);
            return;
        }
        Intent intent = new Intent();
        try {
            intent.putExtra("key_context", uh4.toByteArray());
        } catch (IOException unused) {
        }
        if (uh4.f64641h == 100203) {
            C43471q.m46986j(activity, ".ui.video.fs.TopStoryFSVideoUI", intent, i);
        } else {
            C43471q.m46986j(activity, ".ui.video.list.TopStoryListVideoUI", intent, i);
        }
    }

    /* renamed from: n */
    public static void m134280n(Context context, uh4 uh4) {
        Class cls = C10432i.class;
        if (((C10432i) C86312j.m106911c(cls)).mo10750e()) {
            ((C10432i) C86312j.m106911c(cls)).mo10755m4(context);
            return;
        }
        Intent intent = new Intent();
        try {
            intent.putExtra("key_context", uh4.toByteArray());
        } catch (IOException unused) {
        }
        if (uh4.f64641h == 100203) {
            C43471q.m46985i(context, ".ui.video.fs.TopStoryFSVideoUI", intent);
        } else {
            C43471q.m46985i(context, ".ui.video.list.TopStoryListVideoUI", intent);
        }
    }
}
