package pc2;

/* renamed from: pc2.b */
public final class C89341b implements C89342c {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.net.Uri} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0141  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11763a(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r8 = r17
            r0 = r18
            java.lang.String r1 = "context"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "intent"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r1 = r0.getParcelableArrayExtra(r1)
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L_0x0023
            int r2 = r1.length
            if (r2 != 0) goto L_0x001d
            r2 = 1
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r2 = 0
            goto L_0x0024
        L_0x0023:
            r2 = 1
        L_0x0024:
            java.lang.String r4 = "MicroMsg.Nfc.DeepLinkNfcProcessor"
            if (r2 == 0) goto L_0x002f
            java.lang.String r1 = "parseMessage1, rawMessages is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x005c
        L_0x002f:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = r1.length
            r2.<init>(r5)
            java.util.Iterator r1 = gy3.C32617c.m39769a(r1)
        L_0x0039:
            r5 = r1
            gy3.b r5 = (gy3.C32616b) r5
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0050
            java.lang.Object r5 = r5.next()
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            boolean r6 = r5 instanceof android.nfc.NdefMessage
            if (r6 == 0) goto L_0x0039
            r2.add(r5)
            goto L_0x0039
        L_0x0050:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = "parseMessage1, messages is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
        L_0x005c:
            r2 = 0
        L_0x005d:
            if (r2 != 0) goto L_0x009d
            java.lang.String r1 = "android.nfc.extra.TAG"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            android.nfc.Tag r0 = (android.nfc.Tag) r0
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "parseMessage2, tag is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0096
        L_0x0070:
            android.nfc.tech.Ndef r1 = android.nfc.tech.Ndef.get(r0)
            if (r1 != 0) goto L_0x007d
            java.lang.String r0 = "parseMessage2, ndef is not in tag's techList"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0096
        L_0x007d:
            android.nfc.tech.Ndef r0 = android.nfc.tech.Ndef.get(r0)
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = "parseMessage2, ndef is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0096
        L_0x008a:
            android.nfc.NdefMessage r0 = r0.getCachedNdefMessage()
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "parseMessage1, message is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0096:
            r2 = 0
            goto L_0x009d
        L_0x0098:
            java.util.List r0 = sx3.C26236u.m33719b(r0)
            r2 = r0
        L_0x009d:
            if (r2 != 0) goto L_0x00a0
            return r10
        L_0x00a0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "process, messages: "
            r0.append(r1)
            android.nfc.NdefMessage[] r1 = new android.nfc.NdefMessage[r10]
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r1, r5)
            java.lang.String r1 = java.util.Arrays.toString(r1)
            java.lang.String r6 = "toString(this)"
            gy3.C87412m.m108593f(r1, r6)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x00d4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01ea
            java.lang.Object r2 = r1.next()
            android.nfc.NdefMessage r2 = (android.nfc.NdefMessage) r2
            android.nfc.NdefRecord[] r7 = r2.getRecords()
            if (r7 == 0) goto L_0x00f1
            int r11 = r7.length
            if (r11 != 0) goto L_0x00eb
            r11 = 1
            goto L_0x00ec
        L_0x00eb:
            r11 = 0
        L_0x00ec:
            if (r11 == 0) goto L_0x00ef
            goto L_0x00f1
        L_0x00ef:
            r11 = 0
            goto L_0x00f2
        L_0x00f1:
            r11 = 1
        L_0x00f2:
            if (r11 == 0) goto L_0x00fc
            java.lang.String r7 = "parseUri1, records is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            r11 = 0
            goto L_0x0120
        L_0x00fc:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r7.length
            r11.<init>(r12)
            int r12 = r7.length
            r13 = 0
        L_0x0104:
            if (r13 >= r12) goto L_0x0114
            r14 = r7[r13]
            android.net.Uri r14 = r14.toUri()
            if (r14 == 0) goto L_0x0111
            r11.add(r14)
        L_0x0111:
            int r13 = r13 + 1
            goto L_0x0104
        L_0x0114:
            boolean r7 = r11.isEmpty()
            if (r7 == 0) goto L_0x0120
            java.lang.String r7 = "parseUri1, uris is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
        L_0x0120:
            if (r11 != 0) goto L_0x01dd
            android.nfc.NdefRecord[] r2 = r2.getRecords()
            if (r2 == 0) goto L_0x0133
            int r7 = r2.length
            if (r7 != 0) goto L_0x012d
            r7 = 1
            goto L_0x012e
        L_0x012d:
            r7 = 0
        L_0x012e:
            if (r7 == 0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            r7 = 0
            goto L_0x0134
        L_0x0133:
            r7 = 1
        L_0x0134:
            if (r7 == 0) goto L_0x0141
            java.lang.String r2 = "parseUris2, records is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            r18 = r1
            r11 = 0
            goto L_0x01df
        L_0x0141:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = r2.length
            r7.<init>(r11)
            int r11 = r2.length
            r12 = 0
        L_0x0149:
            if (r12 >= r11) goto L_0x01cd
            r13 = r2[r12]
            short r14 = r13.getTnf()
            if (r9 != r14) goto L_0x01c3
            byte[] r14 = android.nfc.NdefRecord.RTD_TEXT
            byte[] r15 = r13.getType()
            boolean r14 = java.util.Arrays.equals(r14, r15)
            if (r14 == 0) goto L_0x01c3
            byte[] r13 = r13.getPayload()
            if (r13 == 0) goto L_0x016b
            int r14 = r13.length
            if (r14 != 0) goto L_0x0169
            goto L_0x016b
        L_0x0169:
            r14 = 0
            goto L_0x016c
        L_0x016b:
            r14 = 1
        L_0x016c:
            if (r14 == 0) goto L_0x016f
            goto L_0x01c3
        L_0x016f:
            byte r14 = r13[r10]
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 != 0) goto L_0x0177
            r15 = 1
            goto L_0x0178
        L_0x0177:
            r15 = 0
        L_0x0178:
            r14 = r14 & 63
            int r3 = r13.length
            int r3 = r3 - r9
            int r3 = r3 - r14
            java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r9 = "US_ASCII"
            gy3.C87412m.m108593f(r10, r9)
            java.lang.String r9 = new java.lang.String
            r18 = r1
            r1 = 1
            r9.<init>(r13, r1, r14, r10)
            int r14 = r14 + r1
            if (r15 == 0) goto L_0x0192
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            goto L_0x0194
        L_0x0192:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
        L_0x0194:
            java.lang.String r10 = "if (isUtf8) StandardChar…e StandardCharsets.UTF_16"
            gy3.C87412m.m108593f(r1, r10)
            java.lang.String r10 = new java.lang.String
            r10.<init>(r13, r14, r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "parseUris2, languageCode: "
            r1.append(r3)
            r1.append(r9)
            java.lang.String r3 = ", text: "
            r1.append(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            android.net.Uri r1 = android.net.Uri.parse(r10)
            r7.add(r1)
            goto L_0x01c5
        L_0x01c3:
            r18 = r1
        L_0x01c5:
            int r12 = r12 + 1
            r1 = r18
            r9 = 1
            r10 = 0
            goto L_0x0149
        L_0x01cd:
            r18 = r1
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x01db
            java.lang.String r1 = "parseUris2, uris is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
        L_0x01db:
            r11 = r7
            goto L_0x01df
        L_0x01dd:
            r18 = r1
        L_0x01df:
            if (r11 == 0) goto L_0x01e4
            r0.addAll(r11)
        L_0x01e4:
            r1 = r18
            r9 = 1
            r10 = 0
            goto L_0x00d4
        L_0x01ea:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01f7
            java.lang.String r0 = "parseUris, uris is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 0
        L_0x01f7:
            if (r0 != 0) goto L_0x01fb
            r1 = 0
            return r1
        L_0x01fb:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "process, uris: "
            r2.append(r3)
            android.net.Uri[] r3 = new android.net.Uri[r1]
            java.lang.Object[] r1 = r0.toArray(r3)
            gy3.C87412m.m108592e(r1, r5)
            java.lang.String r1 = java.util.Arrays.toString(r1)
            gy3.C87412m.m108593f(r1, r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0225:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0268
            java.lang.Object r1 = r0.next()
            r2 = r1
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = wc3.C90945m.m114069s(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "isDeepLinkToMe#Uri, url: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            java.lang.String r3 = "url"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.CharSequence r2 = z04.C112550d0.m153799i0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "weixin://"
            r5 = 1
            boolean r2 = z04.C112551y.m153819s(r2, r3, r5)
            if (r2 == 0) goto L_0x0225
            r3 = r1
            goto L_0x0269
        L_0x0268:
            r3 = 0
        L_0x0269:
            android.net.Uri r3 = (android.net.Uri) r3
            if (r3 != 0) goto L_0x0275
            java.lang.String r0 = "process, not deep link uri"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            r0 = 0
            return r0
        L_0x0275:
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r1 = "clicfg_android_nfc_deep_link"
            r2 = 1
            boolean r0 = r0.mo182445g(r1, r2, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "process, isNfcDeepLinkEnable: "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            if (r0 != 0) goto L_0x0298
            return r2
        L_0x0298:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "process, uri: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r3)
            java.lang.Class<com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity> r1 = com.tencent.p014mm.plugin.base.stub.WXCustomSchemeEntryActivity.class
            r0.setClass(r8, r1)
            r1 = 21
            java.lang.String r2 = "translate_link_scene"
            r0.putExtra(r2, r1)
            k20.a r9 = new k20.a
            r9.<init>()
            r9.mo10233c(r0)
            java.lang.Object[] r1 = r9.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/nfc_open/logic/DeepLinkNfcProcessor"
            java.lang.String r3 = "process"
            java.lang.String r4 = "(Landroid/content/Context;Landroid/content/Intent;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            java.lang.Object r0 = r9.mo10231a(r0)
            android.content.Intent r0 = (android.content.Intent) r0
            r8.startActivity(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/nfc_open/logic/DeepLinkNfcProcessor"
            java.lang.String r2 = "process"
            java.lang.String r3 = "(Landroid/content/Context;Landroid/content/Intent;)Z"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r17
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pc2.C89341b.mo11763a(android.content.Context, android.content.Intent):boolean");
    }

    /* renamed from: d */
    public int mo11764d() {
        return 0;
    }

    public String getName() {
        return "DeepLink";
    }
}
