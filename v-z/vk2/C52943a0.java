package vk2;

import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import java.util.HashMap;
import kg3.C76577a;

/* renamed from: vk2.a0 */
public final class C52943a0 {

    /* renamed from: a */
    public static final C52943a0 f147787a = new C52943a0();

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0259  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final vk2.C52958x m59244b(android.content.Context r18, android.os.Bundle r19, vk2.C52949l r20) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "data"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.String r2 = "scan_session"
            java.lang.String r3 = r1.getString(r2)
            if (r3 != 0) goto L_0x001f
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L_0x001f:
            java.lang.String r4 = "data.getString(KEY_SCAN_…ntTimeMillis().toString()"
            gy3.C87412m.m108593f(r3, r4)
            vk2.z r4 = new vk2.z
            r5 = r20
            r4.<init>(r3, r5)
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = r4.f147825a
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = "MicroMsg.ScanBoxDialogViewListenerImpl"
            java.lang.String r8 = "alvinluo onShowStart %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r8, r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.f147827c = r5
            vk2.z$a r5 = new vk2.z$a
            r5.<init>(r4)
            r4.f147830f = r5
            vk2.a0 r5 = f147787a
            java.lang.String r6 = "template_type"
            int r8 = r1.getInt(r6, r7)
            int r6 = r1.getInt(r6, r7)
            te3.zi r9 = new te3.zi
            r9.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r11 = "req_key"
            java.lang.String r12 = r1.getString(r11)
            java.lang.String r13 = ""
            if (r12 != 0) goto L_0x006a
            r12 = r13
        L_0x006a:
            r10.put(r11, r12)
            java.lang.String r12 = "session_id"
            java.lang.String r14 = "MicroMsg.ScanBoxManager"
            r15 = 2
            if (r6 == r3) goto L_0x009a
            r16 = r4
            if (r6 == r15) goto L_0x007a
            goto L_0x0095
        L_0x007a:
            r3 = 0
            long r2 = r1.getLong(r12, r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r10.put(r12, r2)
            java.lang.String r2 = "scene"
            int r3 = r1.getInt(r2, r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r10.put(r2, r3)
        L_0x0095:
            r17 = r13
            r3 = 3
            goto L_0x0110
        L_0x009a:
            r16 = r4
            java.lang.String r3 = "enter_session"
            java.lang.String r4 = r1.getString(r3)
            if (r4 != 0) goto L_0x00a5
            r4 = r13
        L_0x00a5:
            r10.put(r3, r4)
            java.lang.String r4 = "tab_session"
            java.lang.String r17 = r1.getString(r4)
            if (r17 != 0) goto L_0x00b3
            r15 = r13
            goto L_0x00b5
        L_0x00b3:
            r15 = r17
        L_0x00b5:
            r10.put(r4, r15)
            java.lang.String r15 = r1.getString(r2)
            if (r15 != 0) goto L_0x00bf
            r15 = r13
        L_0x00bf:
            r10.put(r2, r15)
            java.lang.String r15 = "scanTabMerge"
            java.lang.String r17 = r1.getString(r15)
            if (r17 != 0) goto L_0x00cd
            java.lang.String r17 = "0"
        L_0x00cd:
            r7 = r17
            r10.put(r15, r7)
            java.lang.String r7 = "detect_session"
            java.lang.String r15 = r1.getString(r7)
            if (r15 == 0) goto L_0x00ea
            int r17 = r15.length()
            if (r17 <= 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            if (r17 == 0) goto L_0x00ea
            r10.put(r7, r15)
        L_0x00ea:
            r17 = r13
            r15 = 4
            java.lang.Object[] r13 = new java.lang.Object[r15]
            java.lang.Object r3 = r10.get(r3)
            r15 = 0
            r13[r15] = r3
            java.lang.Object r3 = r10.get(r4)
            r4 = 1
            r13[r4] = r3
            java.lang.Object r2 = r10.get(r2)
            r3 = 2
            r13[r3] = r2
            java.lang.Object r2 = r10.get(r7)
            r3 = 3
            r13[r3] = r2
            java.lang.String r2 = "alvinluo showBoxDialog from scan goods, enterSession: %s, tabSession: %s, scanSession: %s, detectSession: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r2, r13)
        L_0x0110:
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r4 = 0
            r2[r4] = r3
            java.lang.Object r3 = r10.get(r11)
            r4 = 1
            r2[r4] = r3
            java.lang.Object r3 = r10.get(r12)
            r7 = 2
            r2[r7] = r3
            java.lang.String r3 = "alvinluo showBoxDialog templateType: %s, reqKey: %s, session_id: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r2)
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r9.f145967e = r2
            java.lang.String r2 = "MicroMsg.ScanBoxTemplateManager"
            if (r6 == r4) goto L_0x0157
            if (r6 == r7) goto L_0x013f
            r13 = r17
            goto L_0x016d
        L_0x013f:
            r3 = 8
            e83.b r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46983g(r3)
            java.lang.String r13 = r6.mo71073i()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r7 = 0
            r6[r7] = r13
            java.lang.String r11 = "alvinluo getImageOcrTemplateHtmlFile templateHtmlPath: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r11, r6)
            r5.mo73689a(r10, r3)
            goto L_0x016d
        L_0x0157:
            r3 = 4
            r7 = 0
            e83.b r6 = com.tencent.p014mm.plugin.websearch.C43471q.m46983g(r3)
            java.lang.String r13 = r6.mo71073i()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r7] = r13
            java.lang.String r4 = "alvinluo getScanGoodsTemplateHtmlFile: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r2, r4, r6)
            r5.mo73689a(r10, r3)
        L_0x016d:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "file://"
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = "?"
            r2.append(r3)
            java.lang.String r3 = com.tencent.p014mm.plugin.websearch.C43471q.m46987k(r10)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r9.f145968f = r2
            java.lang.String r2 = "fixed_dialog_height"
            r3 = 0
            int r2 = r1.getInt(r2, r3)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r5 = "fixed_dialog_height_rate"
            float r4 = r1.getFloat(r5, r4)
            java.lang.String r5 = "enable_dialog_scroll"
            r6 = 1
            boolean r5 = r1.getBoolean(r5, r6)
            java.lang.String r7 = "enable_cancel_outside"
            boolean r7 = r1.getBoolean(r7, r6)
            java.lang.String r10 = "show_after_webview_ready"
            boolean r10 = r1.getBoolean(r10, r3)
            java.lang.String r11 = "enable_full_screen"
            boolean r11 = r1.getBoolean(r11, r6)
            java.lang.String r12 = "enable_scroll_right_close"
            boolean r12 = r1.getBoolean(r12, r3)
            r13 = 3
            java.lang.Object[] r13 = new java.lang.Object[r13]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r2)
            r13[r3] = r15
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            r13[r6] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r15 = 2
            r13[r15] = r3
            java.lang.String r3 = "alvinluo showBoxDialog fixedDialogHeight: %d, fixedDialogHeightRate: %s, enableDialogScroll: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r3, r13)
            r3 = 0
            if (r8 == r6) goto L_0x01f0
            if (r8 == r15) goto L_0x01ea
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r8 = 0
            r13[r8] = r6
            java.lang.String r6 = "alvinluo createDialogView templateType : %s not support"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r6, r13)
            goto L_0x01f6
        L_0x01ea:
            com.tencent.mm.plugin.scanner.box.ScanImageOCRDialogView r6 = new com.tencent.mm.plugin.scanner.box.ScanImageOCRDialogView
            r6.<init>(r0, r3)
            goto L_0x01f5
        L_0x01f0:
            com.tencent.mm.plugin.scanner.box.ScanGoodsDialogView r6 = new com.tencent.mm.plugin.scanner.box.ScanGoodsDialogView
            r6.<init>(r0, r3)
        L_0x01f5:
            r3 = r6
        L_0x01f6:
            vk2.x r6 = new vk2.x
            r8 = r16
            r6.<init>(r0, r9, r3, r8)
            if (r2 <= 0) goto L_0x0213
            r0 = 1
            r6.f147821w = r0
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r3 = r6.f147817s
            if (r3 == 0) goto L_0x0209
            r3.setIsFixDialogHeight(r0)
        L_0x0209:
            r6.f147822x = r2
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r6.f147817s
            if (r0 == 0) goto L_0x022b
            r0.setFixDialogHeight(r2)
            goto L_0x022b
        L_0x0213:
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x022b
            r0 = 1
            r6.f147821w = r0
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r2 = r6.f147817s
            if (r2 == 0) goto L_0x0222
            r2.setIsFixDialogHeight(r0)
        L_0x0222:
            r6.f147823y = r4
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r6.f147817s
            if (r0 == 0) goto L_0x022b
            r0.setFixDialogHeightRate(r4)
        L_0x022b:
            r6.f147801A = r5
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r6.f147817s
            if (r0 == 0) goto L_0x0234
            r0.setEnableDialogScroll(r5)
        L_0x0234:
            r6.f147802B = r7
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r6.f147817s
            if (r0 == 0) goto L_0x023d
            r0.setCanceledOnTouchOutside(r7)
        L_0x023d:
            r6.f147804D = r10
            r6.f147820v = r11
            r6.f147803C = r12
            com.tencent.mm.plugin.scanner.box.BaseBoxDialogView r0 = r6.f147817s
            if (r0 == 0) goto L_0x024a
            r0.setEnableScrollRightClose(r12)
        L_0x024a:
            r6.show()
            vk2.f0 r0 = r6.f147815q
            if (r0 == 0) goto L_0x0253
            vk2.C14883d0.f40913e = r1
        L_0x0253:
            android.view.Window r0 = r6.getWindow()
            if (r0 == 0) goto L_0x025d
            r1 = -1
            r0.setLayout(r1, r1)
        L_0x025d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vk2.C52943a0.m59244b(android.content.Context, android.os.Bundle, vk2.l):vk2.x");
    }

    /* renamed from: a */
    public final void mo73689a(HashMap<String, String> hashMap, int i) {
        hashMap.put(IXWebPreferences.XWEB_LANGUAGE, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
        hashMap.put("platform", Platform.ANDROID);
        hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46977a(i)));
        hashMap.put(DownloadInfo.NETTYPE, C43471q.m46979c());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", BuildInfo.CLIENT_VERSION);
        float p = C76577a.m92165p(MMApplicationContext.getContext());
        boolean z = false;
        if (!(p == 1.0f)) {
            if (!(p == 0.8f)) {
                if (!(p == 1.1f)) {
                    if (!(p == 1.12f)) {
                        if (!(p == 1.125f)) {
                            if (!(p == 1.4f)) {
                                if (!(p == 1.55f)) {
                                    if (p == 1.65f) {
                                        z = true;
                                    }
                                    if (!z) {
                                        p = 1.0f;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hashMap.put("fontRatio", String.valueOf(p));
    }
}
