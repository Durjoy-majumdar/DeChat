package p490dl;

import ob0.C89132b;
import te3.bn4;

/* renamed from: dl.g */
public final class C97486g extends C89132b<bn4> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.ByteArrayInputStream} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a A[SYNTHETIC, Splitter:B:29:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7 A[SYNTHETIC, Splitter:B:34:0x00b7] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a A[SYNTHETIC, Splitter:B:44:0x010a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0127 A[SYNTHETIC, Splitter:B:49:0x0127] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97486g(com.tencent.p014mm.storage.emotion.EmojiInfo r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "emojiInfo"
            gy3.C87412m.m108594g(r11, r0)
            r10.<init>()
            te3.an4 r0 = new te3.an4
            r0.<init>()
            te3.bn4 r1 = new te3.bn4
            r1.<init>()
            java.lang.String r2 = r11.field_md5
            r0.f182101d = r2
            r2 = 1
            r0.f182102e = r2
            r0.f182103f = r12
            java.lang.String r12 = "getAttachedEmojiMD5 ois close failure, msg: "
            java.lang.String r2 = "getAttachedEmojiMD5 bis close failure, msg: "
            java.lang.String r3 = "MicroMsg.emoji.EmojiInfo"
            r4 = 0
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x007c, all -> 0x0078 }
            byte[] r6 = r11.field_attachedEmojiMD5     // Catch:{ Exception -> 0x007c, all -> 0x0078 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x007c, all -> 0x0078 }
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0074, all -> 0x006f }
            java.lang.Object r7 = r6.readObject()     // Catch:{ Exception -> 0x006d }
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch:{ Exception -> 0x006d }
            r5.close()     // Catch:{ Exception -> 0x0038 }
            goto L_0x004f
        L_0x0038:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = r4.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x004f:
            r6.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x006a
        L_0x0053:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r12 = r2.getMessage()
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x006a:
            r4 = r7
            goto L_0x00d2
        L_0x006d:
            r7 = move-exception
            goto L_0x0080
        L_0x006f:
            r11 = move-exception
            r6 = r4
        L_0x0071:
            r4 = r5
            goto L_0x0108
        L_0x0074:
            r6 = move-exception
            r7 = r6
            r6 = r4
            goto L_0x0080
        L_0x0078:
            r11 = move-exception
            r6 = r4
            goto L_0x0108
        L_0x007c:
            r5 = move-exception
            r7 = r5
            r5 = r4
            r6 = r5
        L_0x0080:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0105 }
            r8.<init>()     // Catch:{ all -> 0x0105 }
            java.lang.String r9 = "getAttachedEmojiMD5 failure, msg: "
            r8.append(r9)     // Catch:{ all -> 0x0105 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0105 }
            r8.append(r7)     // Catch:{ all -> 0x0105 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0105 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r7)     // Catch:{ all -> 0x0105 }
            if (r5 == 0) goto L_0x00b5
            r5.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00b5
        L_0x009e:
            r5 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r2 = r5.getMessage()
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
        L_0x00b5:
            if (r6 == 0) goto L_0x00d2
            r6.close()     // Catch:{ Exception -> 0x00bb }
            goto L_0x00d2
        L_0x00bb:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            java.lang.String r12 = r2.getMessage()
            r5.append(r12)
            java.lang.String r12 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x00d2:
            if (r4 == 0) goto L_0x00d9
            java.util.LinkedList<java.lang.String> r12 = r0.f182104g
            r12.addAll(r4)
        L_0x00d9:
            java.lang.String r12 = r11.field_attachedText
            r0.f182105h = r12
            java.lang.String r12 = r11.field_attachTextColor
            r0.f182108n = r12
            java.lang.String r12 = r11.field_imitateMd5
            r0.f182106i = r12
            java.lang.String r11 = r11.field_lensId
            r0.f182107j = r11
            r11 = 0
            r0.f182109o = r11
            ob0.c$b r11 = new ob0.c$b
            r11.<init>()
            r11.f127066a = r0
            r11.f127067b = r1
            java.lang.String r12 = "/cgi-bin/micromsg-bin/mmuploademojiprepare"
            r11.f127068c = r12
            r12 = 3886(0xf2e, float:5.445E-42)
            r11.f127069d = r12
            ob0.c r11 = r11.mo72403a()
            r10.mo123453j(r11)
            return
        L_0x0105:
            r11 = move-exception
            goto L_0x0071
        L_0x0108:
            if (r4 == 0) goto L_0x0125
            r4.close()     // Catch:{ Exception -> 0x010e }
            goto L_0x0125
        L_0x010e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0125:
            if (r6 == 0) goto L_0x0142
            r6.close()     // Catch:{ Exception -> 0x012b }
            goto L_0x0142
        L_0x012b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r12 = r0.getMessage()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r12)
        L_0x0142:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p490dl.C97486g.<init>(com.tencent.mm.storage.emotion.EmojiInfo, boolean):void");
    }
}
