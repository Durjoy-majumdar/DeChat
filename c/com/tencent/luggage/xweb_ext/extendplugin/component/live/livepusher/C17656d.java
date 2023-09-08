package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.live2.jsplugin.V2TXJSAdapterError;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import ml0.C21510b0;
import ml0.C21511u;
import p301cd.C79999m;

/* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.d */
public class C17656d extends C21510b0 implements C79999m {

    /* renamed from: d */
    public ITXLivePushListener f48039d;

    /* renamed from: e */
    public final C17657e f48040e = new C17657e(this.f60902a);

    public C17656d(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo21071a() {
        if (this.f48039d != null) {
            Log.m105924i("TXLivePusherJSAdapterV2SameLayerSupport", "sendWeChatStop, send event 5001");
            this.f48039d.onPushEvent(5001, new Bundle());
        }
    }

    /* renamed from: c */
    public void mo21072c() {
        if (this.f48039d != null) {
            Log.m105924i("TXLivePusherJSAdapterV2SameLayerSupport", "sendHandupStop, send event 5000");
            this.f48039d.onPushEvent(5000, new Bundle());
        }
    }

    /* renamed from: e */
    public C21511u mo21073e(Bundle bundle) {
        C21511u e = super.mo21073e(bundle);
        C17657e eVar = this.f48040e;
        if (bundle == null) {
            eVar.getClass();
        } else if (eVar.f48043b) {
            eVar.mo21087c(bundle, false);
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        if (r0 == false) goto L_0x0096;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03df  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03e5  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04ca  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x057a  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ee A[Catch:{ Exception -> 0x0232 }, PHI: r1 
      PHI: (r1v22 com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType) = (r1v21 com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType), (r1v31 com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType) binds: [B:84:0x01ce, B:86:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ml0.C21511u mo21074f(java.lang.String r42, org.json.JSONObject r43) {
        /*
            r41 = this;
            r0 = r42
            r1 = r43
            ml0.u r2 = super.mo21074f(r42, r43)
            int r3 = r2.f60905a
            r4 = -4
            if (r4 != r3) goto L_0x05b9
            r3 = r41
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.e r2 = r3.f48040e
            r2.getClass()
            java.lang.String r5 = "applyFilter"
            boolean r5 = r0.equalsIgnoreCase(r5)
            java.lang.String r6 = "alpha"
            java.lang.String r7 = "path"
            java.lang.String r8 = "Success"
            java.lang.String r9 = "Failed"
            java.lang.String r10 = "TXLivePusherWeEffectJSAdapter"
            r11 = 0
            r12 = 0
            r13 = 1
            r4 = 0
            if (r5 == 0) goto L_0x00a6
            if (r1 == 0) goto L_0x0096
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "applyFilter, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0047
        L_0x0038:
            java.lang.String r0 = r1.optString(r7, r12)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x0049
            java.lang.String r0 = "applyFilter, resourcePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0047:
            r0 = 0
            goto L_0x0093
        L_0x0049:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r1.optDouble(r6, r14)
            float r1 = (float) r6
            int r6 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0062
            java.lang.Object[] r6 = new java.lang.Object[r13]
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6[r4] = r1
            java.lang.String r1 = "applyFaceBeautyIfNeed, alpha(%f) is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r6)
            goto L_0x0063
        L_0x0062:
            r11 = r1
        L_0x0063:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0079
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.Float r6 = java.lang.Float.valueOf(r11)
            r1[r4] = r6
            java.lang.String r6 = "applyFaceBeautyIfNeed, alpha(%f)  is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r6, r1)
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x007a
        L_0x0079:
            r14 = r11
        L_0x007a:
            r2.mo21086b()
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r0
            java.lang.Float r5 = java.lang.Float.valueOf(r14)
            r1[r13] = r5
            java.lang.String r5 = "applyFilter, resourcePath: %s, alpha: %f"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r5, r1)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r1 = r2.f48044c
            r1.mo21061m(r0, r14)
            r0 = 1
        L_0x0093:
            if (r0 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r13 = 0
        L_0x0097:
            ml0.u r0 = new ml0.u
            if (r13 == 0) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r4 = -2
        L_0x009d:
            if (r13 == 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r8 = r9
        L_0x00a1:
            r0.<init>(r4, r8)
            goto L_0x05b8
        L_0x00a6:
            java.lang.String r14 = "clearFilters"
            boolean r15 = r0.equalsIgnoreCase(r14)
            if (r15 == 0) goto L_0x00d5
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "clearFilters, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            r13 = 0
            goto L_0x00c6
        L_0x00bb:
            r2.mo21086b()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r14)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            r0.clearFilters()
        L_0x00c6:
            ml0.u r0 = new ml0.u
            if (r13 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r4 = -2
        L_0x00cc:
            if (r13 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x00cf:
            r8 = r9
        L_0x00d0:
            r0.<init>(r4, r8)
            goto L_0x05b8
        L_0x00d5:
            java.lang.String r14 = "applySticker"
            boolean r14 = r0.equalsIgnoreCase(r14)
            java.lang.String r15 = ""
            if (r14 == 0) goto L_0x029b
            if (r1 == 0) goto L_0x028a
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "applySticker, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x00ec:
            r0 = 0
            goto L_0x0286
        L_0x00ef:
            java.lang.String r0 = r1.optString(r7, r12)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x0262
            java.lang.String r0 = "applySticker, resourcePath is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "applyStickerWorkaround, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x00ec
        L_0x010a:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r0 = r2.mo21089e(r1)
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "applyStickerWorkaround, stickerType is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x00ec
        L_0x0116:
            java.lang.String r6 = "templateTransSet"
            org.json.JSONObject r6 = r1.optJSONObject(r6)
            if (r6 != 0) goto L_0x0125
            java.lang.String r6 = "parseTemplateTransSet, templateTransSetJsonObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r6)
            r6 = r12
        L_0x0125:
            java.lang.String r14 = "stickers"
            org.json.JSONArray r1 = r1.optJSONArray(r14)
            if (r1 == 0) goto L_0x025b
            int r14 = r1.length()
            if (r14 != 0) goto L_0x0136
            goto L_0x025b
        L_0x0136:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r14)
            r11 = 0
        L_0x013c:
            if (r11 >= r14) goto L_0x0247
            org.json.JSONObject r5 = r1.optJSONObject(r11)
            if (r5 != 0) goto L_0x0152
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r4] = r1
            java.lang.String r1 = "applyStickerWorkaround, stickerJsonObj(%d) is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r1, r0)
            goto L_0x00ec
        L_0x0152:
            java.lang.String r4 = "title"
            java.lang.String r25 = r5.getString(r4)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r4 = "len"
            int r26 = r5.getInt(r4)     // Catch:{ Exception -> 0x0232 }
            java.lang.String r28 = r5.getString(r7)     // Catch:{ Exception -> 0x0232 }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)     // Catch:{ Exception -> 0x0232 }
            if (r4 == 0) goto L_0x0179
            java.lang.String r0 = "applyStickerWorkaround, i: %d, resDirPath is empty"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x0232 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0232 }
            r4 = 0
            r1[r4] = r2     // Catch:{ Exception -> 0x0232 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r0, r1)     // Catch:{ Exception -> 0x0232 }
            goto L_0x00ec
        L_0x0179:
            java.lang.String r4 = "md5"
            java.lang.String r29 = r5.optString(r4, r15)     // Catch:{ Exception -> 0x0232 }
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r4 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17646d.STICKER_2D     // Catch:{ Exception -> 0x0232 }
            if (r4 == r0) goto L_0x018d
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r4 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17646d.STICKER_FRONT     // Catch:{ Exception -> 0x0232 }
            if (r4 != r0) goto L_0x0188
            goto L_0x018d
        L_0x0188:
            r42 = r1
            r30 = 0
            goto L_0x01ca
        L_0x018d:
            java.lang.String r4 = "pos"
            org.json.JSONArray r4 = r5.getJSONArray(r4)     // Catch:{ Exception -> 0x0232 }
            int r13 = r4.length()     // Catch:{ Exception -> 0x0232 }
            r42 = r1
            r1 = 4
            if (r1 == r13) goto L_0x01ad
            java.lang.String r0 = "applyStickerWorkaround, i: %d, length of posJsonArr is not 4"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0232 }
            r4 = 0
            r2[r4] = r1     // Catch:{ Exception -> 0x0232 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r0, r2)     // Catch:{ Exception -> 0x0232 }
            goto L_0x00ec
        L_0x01ad:
            r1 = 0
            double r33 = r4.getDouble(r1)     // Catch:{ Exception -> 0x0232 }
            r1 = 1
            double r35 = r4.getDouble(r1)     // Catch:{ Exception -> 0x0232 }
            r1 = 2
            double r37 = r4.getDouble(r1)     // Catch:{ Exception -> 0x0232 }
            r1 = 3
            double r39 = r4.getDouble(r1)     // Catch:{ Exception -> 0x0232 }
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$a r1 = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$a     // Catch:{ Exception -> 0x0232 }
            r32 = r1
            r32.<init>(r33, r35, r37, r39)     // Catch:{ Exception -> 0x0232 }
            r30 = r1
        L_0x01ca:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType r1 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo.StickerBackType.BACKGROUND     // Catch:{ Exception -> 0x0232 }
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r4 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17646d.STICKER_BACK     // Catch:{ Exception -> 0x0232 }
            if (r4 != r0) goto L_0x01ee
            java.lang.String r1 = "segtype"
            int r1 = r5.getInt(r1)     // Catch:{ Exception -> 0x0232 }
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$StickerBackType r1 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo.StickerBackType.from(r1)     // Catch:{ Exception -> 0x0232 }
            if (r1 != 0) goto L_0x01ee
            java.lang.String r0 = "applyStickerWorkaround, i: %d, type is null"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0232 }
            r4 = 0
            r2[r4] = r1     // Catch:{ Exception -> 0x0232 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r0, r2)     // Catch:{ Exception -> 0x0232 }
            goto L_0x00ec
        L_0x01ee:
            r31 = r1
            java.lang.String r1 = "active"
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction r4 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo.TriggerAction.DEFAULT_ACTION_LOOP     // Catch:{ Exception -> 0x0232 }
            int r4 = r4.getJsonVal()     // Catch:{ Exception -> 0x0232 }
            int r1 = r5.optInt(r1, r4)     // Catch:{ Exception -> 0x0232 }
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo$TriggerAction r27 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo.TriggerAction.from(r1)     // Catch:{ Exception -> 0x0232 }
            if (r27 != 0) goto L_0x021a
            java.lang.String r0 = "applyStickerWorkaround, i: %d, actionInt: %d, action is null"
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0232 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0232 }
            r5 = 0
            r4[r5] = r2     // Catch:{ Exception -> 0x0232 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0232 }
            r2 = 1
            r4[r2] = r1     // Catch:{ Exception -> 0x0232 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r0, r4)     // Catch:{ Exception -> 0x0232 }
            goto L_0x00ec
        L_0x021a:
            java.lang.String r1 = "id"
            int r24 = r5.optInt(r1, r11)     // Catch:{ Exception -> 0x0232 }
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo r1 = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.StickerItemInfo     // Catch:{ Exception -> 0x0232 }
            r23 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x0232 }
            r12.add(r1)     // Catch:{ Exception -> 0x0232 }
            int r11 = r11 + 1
            r1 = r42
            r4 = 0
            r13 = 1
            goto L_0x013c
        L_0x0232:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r4 = 0
            r1[r4] = r2
            r5 = 1
            r1[r5] = r0
            java.lang.String r0 = "applyStickerWorkaround, i: %d, convert fail since %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r10, r0, r1)
            goto L_0x00ec
        L_0x0247:
            r5 = 1
            r2.mo21086b()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            java.lang.String r4 = "applyStickerWorkaround, stickerType: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r4, r1)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r1 = r2.f48044c
            boolean r0 = r1.mo18020g(r0, r12, r6)
            goto L_0x0286
        L_0x025b:
            java.lang.String r0 = "applyStickerWorkaround, stickersJsonArr is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x00ec
        L_0x0262:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d r1 = r2.mo21089e(r1)
            if (r1 != 0) goto L_0x026f
            java.lang.String r0 = "applySticker, stickerType is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x00ec
        L_0x026f:
            r2.mo21086b()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r5 = 1
            r4[r5] = r0
            java.lang.String r5 = "applySticker, stickerType: %s, resourcePath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r5, r4)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r2 = r2.f48044c
            r2.mo21055a(r1, r0)
            r0 = 1
        L_0x0286:
            if (r0 == 0) goto L_0x028a
            r13 = 1
            goto L_0x028b
        L_0x028a:
            r13 = 0
        L_0x028b:
            ml0.u r0 = new ml0.u
            if (r13 == 0) goto L_0x0291
            r1 = 0
            goto L_0x0292
        L_0x0291:
            r1 = -2
        L_0x0292:
            if (r13 == 0) goto L_0x0295
            goto L_0x0296
        L_0x0295:
            r8 = r9
        L_0x0296:
            r0.<init>(r1, r8)
            goto L_0x05b8
        L_0x029b:
            java.lang.String r4 = "clearStickers"
            boolean r5 = r0.equalsIgnoreCase(r4)
            if (r5 == 0) goto L_0x02cc
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x02b0
            java.lang.String r0 = "clearStickers, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            r13 = 0
            goto L_0x02bc
        L_0x02b0:
            r2.mo21086b()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r4)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            r0.mo21062n()
            r13 = 1
        L_0x02bc:
            ml0.u r0 = new ml0.u
            if (r13 == 0) goto L_0x02c2
            r1 = 0
            goto L_0x02c3
        L_0x02c2:
            r1 = -2
        L_0x02c3:
            if (r13 == 0) goto L_0x02c6
            goto L_0x02c7
        L_0x02c6:
            r8 = r9
        L_0x02c7:
            r0.<init>(r1, r8)
            goto L_0x05b8
        L_0x02cc:
            java.lang.String r4 = "applyMakeup"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x057f
            if (r1 == 0) goto L_0x056f
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x02e6
            java.lang.String r0 = "applyMakeup, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            r4 = 0
            r5 = 1
        L_0x02e3:
            r6 = 0
            goto L_0x056b
        L_0x02e6:
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x02f3
            java.lang.String r0 = "applyMakeupWorkaround, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0367
        L_0x02f3:
            java.lang.String r0 = "makeupType"
            r4 = 0
            java.lang.String r0 = r1.optString(r0, r4)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r5 == 0) goto L_0x0306
            java.lang.String r0 = "parseMakeupType, makeupTypeStr is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0351
        L_0x0306:
            java.lang.String r5 = "lipStick"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0311
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_LIP_STICK
            goto L_0x0352
        L_0x0311:
            java.lang.String r5 = "eyeShadow"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x031c
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_EYE_SHADOW
            goto L_0x0352
        L_0x031c:
            java.lang.String r5 = "blusherStick"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0327
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_BLUSHER_STICK
            goto L_0x0352
        L_0x0327:
            java.lang.String r5 = "faceContour"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0332
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_FACE_CONTOUR
            goto L_0x0352
        L_0x0332:
            java.lang.String r5 = "eyeBrow"
            boolean r5 = r0.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x033d
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c r0 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a.C17645c.MAKEUP_EYE_BROW
            goto L_0x0352
        L_0x033d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "parseMakeupType, makeupTypeStr: "
            r5.append(r11)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0351:
            r0 = r4
        L_0x0352:
            if (r0 != 0) goto L_0x035a
            java.lang.String r0 = "applyMakeupWorkaround, makeupType is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0367
        L_0x035a:
            java.lang.String r5 = "makeup"
            org.json.JSONObject r1 = r1.optJSONObject(r5)
            if (r1 != 0) goto L_0x036b
            java.lang.String r0 = "applyMakeupWorkaround, makeupJsonObj is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0367:
            r5 = 1
        L_0x0368:
            r6 = 0
            goto L_0x0562
        L_0x036b:
            r2.mo21086b()
            r5 = 1
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r12 = 0
            r11[r12] = r0
            java.lang.String r12 = "applyMakeupWorkaround, makeupType: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r12, r11)
            int r0 = r0.ordinal()
            java.lang.String r11 = "faceModel"
            if (r0 == 0) goto L_0x04da
            java.lang.String r12 = "blendMode"
            java.lang.String r13 = "pathMd5"
            if (r0 == r5) goto L_0x047b
            r14 = 2
            if (r0 == r14) goto L_0x042b
            r14 = 3
            if (r0 == r14) goto L_0x03ed
            r14 = 4
            if (r0 == r14) goto L_0x0396
            java.lang.String r0 = "applyMakeupWorkaround, should not reach"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0368
        L_0x0396:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r24 = r2.mo21088d(r1, r6, r0)
            r6 = 0
            int r25 = r1.optInt(r11, r6)
            if (r25 == 0) goto L_0x03a9
            java.lang.String r0 = "parseEyeBrowInfo, faceModel is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x03c8
        L_0x03a9:
            int r0 = r1.optInt(r12, r6)
            cd.a r26 = p301cd.C113282a.m155088a(r0)
            if (r26 != 0) goto L_0x03b9
            java.lang.String r0 = "parseEyeBrowInfo, blendMode is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x03c8
        L_0x03b9:
            java.lang.String r27 = r1.optString(r7, r15)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r27)
            if (r0 == 0) goto L_0x03ca
            java.lang.String r0 = "parseEyeBrowInfo, path is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x03c8:
            r12 = r4
            goto L_0x03dd
        L_0x03ca:
            java.lang.String r28 = r1.optString(r13, r15)
            java.lang.String r0 = "shrinkRate"
            r4 = 0
            float r29 = r2.mo21088d(r1, r0, r4)
            cd.c r12 = new cd.c
            r23 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29)
        L_0x03dd:
            if (r12 != 0) goto L_0x03e5
            java.lang.String r0 = "applyMakeupWorkaround, eyeBrowInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0368
        L_0x03e5:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            boolean r0 = r0.mo18017i(r12)
            goto L_0x04d7
        L_0x03ed:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.mo21088d(r1, r6, r0)
            java.lang.String r6 = r1.optString(r7, r15)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r7 == 0) goto L_0x0403
            java.lang.String r0 = "parseFaceContourInfo, path is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0413
        L_0x0403:
            java.lang.String r7 = r1.optString(r13, r15)
            r12 = 0
            int r1 = r1.optInt(r11, r12)
            if (r1 == 0) goto L_0x0415
            java.lang.String r0 = "parseFaceContourInfo, faceModel is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0413:
            r12 = r4
            goto L_0x041a
        L_0x0415:
            cd.e r12 = new cd.e
            r12.<init>(r1, r0, r6, r7)
        L_0x041a:
            if (r12 != 0) goto L_0x0423
            java.lang.String r0 = "applyMakeupWorkaround, faceContourInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0368
        L_0x0423:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            boolean r0 = r0.mo18019l(r12)
            goto L_0x04d7
        L_0x042b:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r17 = r2.mo21088d(r1, r6, r0)
            r6 = 0
            int r0 = r1.optInt(r12, r6)
            cd.a r19 = p301cd.C113282a.m155088a(r0)
            if (r19 != 0) goto L_0x0442
            java.lang.String r0 = "parseBlusherStickInfo, blendMode is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0462
        L_0x0442:
            java.lang.String r20 = r1.optString(r7, r15)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r20)
            if (r0 == 0) goto L_0x0452
            java.lang.String r0 = "parseBlusherStickInfo, path is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0462
        L_0x0452:
            java.lang.String r21 = r1.optString(r13, r15)
            r6 = 0
            int r18 = r1.optInt(r11, r6)
            if (r18 == 0) goto L_0x0464
            java.lang.String r0 = "parseBlusherStickInfo, faceModel is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0462:
            r12 = r4
            goto L_0x046b
        L_0x0464:
            cd.b r12 = new cd.b
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x046b:
            if (r12 != 0) goto L_0x0474
            java.lang.String r0 = "applyMakeupWorkaround, blusherStickInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0368
        L_0x0474:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            boolean r0 = r0.mo18015c(r12)
            goto L_0x04d7
        L_0x047b:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r17 = r2.mo21088d(r1, r6, r0)
            r6 = 0
            int r0 = r1.optInt(r12, r6)
            cd.a r18 = p301cd.C113282a.m155088a(r0)
            if (r18 != 0) goto L_0x0492
            java.lang.String r0 = "parseEyeShadowInfoV2, blendMode is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x04b8
        L_0x0492:
            java.lang.String r19 = r1.optString(r7, r15)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 == 0) goto L_0x04a2
            java.lang.String r0 = "parseEyeShadowInfoV2, path is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x04b8
        L_0x04a2:
            java.lang.String r20 = r1.optString(r13, r15)
            java.lang.String r0 = "shimmerPosition"
            java.lang.String r21 = r1.optString(r0, r15)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r0 == 0) goto L_0x04ba
            java.lang.String r0 = "parseEyeShadowInfoV2, shimmerPosPath is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x04b8:
            r12 = r4
            goto L_0x04c8
        L_0x04ba:
            java.lang.String r0 = "shimmerPositionMD5"
            java.lang.String r22 = r1.optString(r0, r15)
            cd.d r12 = new cd.d
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x04c8:
            if (r12 != 0) goto L_0x04d1
            java.lang.String r0 = "applyMakeupWorkaround, eyeShadowInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0368
        L_0x04d1:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            boolean r0 = r0.mo18016d(r12)
        L_0x04d7:
            r4 = r0
            goto L_0x02e3
        L_0x04da:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r17 = r2.mo21088d(r1, r6, r0)
            java.lang.String r0 = "color"
            java.lang.String r0 = r1.optString(r0)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 == 0) goto L_0x04f2
            java.lang.String r0 = "parseColor, colorStr is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x050f
        L_0x04f2:
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x050a }
            int r6 = android.graphics.Color.red(r0)
            int r7 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$a r12 = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$a
            r12.<init>(r6, r7, r0)
            r18 = r12
            goto L_0x0511
        L_0x050a:
            java.lang.String r0 = "parseColor, colorStr is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x050f:
            r18 = r4
        L_0x0511:
            if (r18 != 0) goto L_0x0519
            java.lang.String r0 = "parseLipStickInfo, color is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            goto L_0x0542
        L_0x0519:
            java.lang.String r0 = "lipstickType"
            r6 = 0
            int r0 = r1.optInt(r0, r6)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$b[] r6 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17652c.C17654b.values()
            int r7 = r6.length
            r12 = 0
        L_0x0526:
            if (r12 >= r7) goto L_0x0539
            r13 = r6[r12]
            int r14 = r13.f48035d
            if (r0 != r14) goto L_0x0530
            r14 = 1
            goto L_0x0531
        L_0x0530:
            r14 = 0
        L_0x0531:
            if (r14 == 0) goto L_0x0536
            r19 = r13
            goto L_0x053b
        L_0x0536:
            int r12 = r12 + 1
            goto L_0x0526
        L_0x0539:
            r19 = r4
        L_0x053b:
            if (r19 != 0) goto L_0x0544
            java.lang.String r0 = "parseLipStickInfo, type is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0542:
            r6 = 0
            goto L_0x0550
        L_0x0544:
            r6 = 0
            int r20 = r1.optInt(r11, r6)
            if (r20 == 0) goto L_0x0552
            java.lang.String r0 = "parseLipStickInfo, faceModel is illegal"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0550:
            r12 = r4
            goto L_0x055b
        L_0x0552:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c$c r21 = com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17652c.C17655c.STANDARD
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c r12 = new com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.c
            r16 = r12
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x055b:
            if (r12 != 0) goto L_0x0564
            java.lang.String r0 = "applyMakeupWorkaround, lipStickInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
        L_0x0562:
            r4 = 0
            goto L_0x056b
        L_0x0564:
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            boolean r0 = r0.mo18018k(r12)
            r4 = r0
        L_0x056b:
            if (r4 == 0) goto L_0x0570
            r13 = 1
            goto L_0x0571
        L_0x056f:
            r6 = 0
        L_0x0570:
            r13 = 0
        L_0x0571:
            ml0.u r0 = new ml0.u
            if (r13 == 0) goto L_0x0576
            goto L_0x0577
        L_0x0576:
            r6 = -2
        L_0x0577:
            if (r13 == 0) goto L_0x057a
            goto L_0x057b
        L_0x057a:
            r8 = r9
        L_0x057b:
            r0.<init>(r6, r8)
            goto L_0x05b8
        L_0x057f:
            r5 = 1
            r6 = 0
            java.lang.String r1 = "clearMakeups"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x05b0
            boolean r0 = r2.mo21090f()
            if (r0 != 0) goto L_0x0596
            java.lang.String r0 = "clearMakeups, useCustomEffect is false"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
            r13 = 0
            goto L_0x05a2
        L_0x0596:
            r2.mo21086b()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
            com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b r0 = r2.f48044c
            r0.mo21058f()
            r13 = 1
        L_0x05a2:
            ml0.u r0 = new ml0.u
            if (r13 == 0) goto L_0x05a7
            goto L_0x05a8
        L_0x05a7:
            r6 = -2
        L_0x05a8:
            if (r13 == 0) goto L_0x05ab
            goto L_0x05ac
        L_0x05ab:
            r8 = r9
        L_0x05ac:
            r0.<init>(r6, r8)
            goto L_0x05b8
        L_0x05b0:
            ml0.u r0 = new ml0.u
            java.lang.String r1 = "invalid operate command"
            r2 = -4
            r0.<init>(r2, r1)
        L_0x05b8:
            return r0
        L_0x05b9:
            r3 = r41
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17656d.mo21074f(java.lang.String, org.json.JSONObject):ml0.u");
    }

    public int getMaxZoom() {
        return this.f60902a.getMaxZoom();
    }

    /* renamed from: h */
    public C21511u mo21076h() {
        C21511u h = super.mo21076h();
        this.f48040e.f48043b = false;
        return h;
    }

    public boolean isPushing() {
        return this.f60902a.isPushing();
    }

    /* renamed from: l */
    public C21511u mo21078l(Bundle bundle) {
        V2TXJSAdapterError initLivePusher = this.f60902a.initLivePusher(bundle);
        C17657e eVar = this.f48040e;
        if (bundle == null) {
            eVar.getClass();
        } else {
            eVar.mo21087c(bundle, true);
            eVar.f48043b = true;
        }
        return new C21511u(initLivePusher);
    }

    /* renamed from: n */
    public C21511u mo21079n(TXCloudVideoView tXCloudVideoView, Bundle bundle) {
        C21511u n = super.mo21079n(tXCloudVideoView, bundle);
        C17657e eVar = this.f48040e;
        eVar.getClass();
        if (!(tXCloudVideoView == null || bundle == null)) {
            eVar.mo21087c(bundle, true);
            eVar.f48043b = true;
        }
        return n;
    }

    public C21511u setFocusPosition(float f, float f2) {
        return new C21511u(this.f60902a.setFocusPosition(f, f2));
    }

    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        super.setPushListener(iTXLivePushListener);
        this.f48039d = iTXLivePushListener;
    }

    public C21511u setSurface(Surface surface) {
        return new C21511u(this.f60902a.setSurface(surface));
    }

    public C21511u setSurfaceSize(int i, int i2) {
        return new C21511u(this.f60902a.setSurfaceSize(i, i2));
    }

    public C21511u setZoom(int i) {
        return new C21511u(this.f60902a.setZoom(i));
    }
}
