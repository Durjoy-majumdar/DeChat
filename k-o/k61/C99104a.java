package k61;

import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import eb0.C86497v5;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C35136m;
import te3.C101800k70;
import u61.C101964h;

/* renamed from: k61.a */
public class C99104a implements C86497v5.C31521b {
    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0271  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9066Y(ob0.C35136m.C35137a r17) {
        /*
            r16 = this;
            r1 = r16
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_EMOJI_BACKUP_OVERSIZE_BOOLEAN
            java.lang.Class<aq.g> r2 = p441aq.C92054g.class
            r3 = r17
            te3.j3 r3 = r3.f94242a
            int r4 = r3.f227630g
            r5 = 0
            r6 = 1
            java.lang.String r7 = "MicroMsg.emoji.EmojiBackupSysCmdMsgListener"
            r8 = 10002(0x2712, float:1.4016E-41)
            if (r4 != r8) goto L_0x0371
            te3.rv3 r3 = r3.f227631h
            java.lang.String r3 = sf0.C48374j0.m53718g(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x0027
            java.lang.String r0 = "msg content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x0027:
            java.lang.String r4 = "sysmsg"
            r8 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r4, r8)
            if (r4 == 0) goto L_0x037f
            int r9 = r4.size()
            if (r9 <= 0) goto L_0x037f
            java.lang.String r9 = ".sysmsg.$type"
            java.lang.Object r9 = r4.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 == 0) goto L_0x004b
            java.lang.String r0 = "empty type"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x004b:
            java.lang.String r10 = "EmojiBackup"
            boolean r11 = r9.equalsIgnoreCase(r10)
            r12 = 3
            java.lang.String r13 = "xml syn list is null."
            java.lang.String r14 = "same devices operate ignore."
            r15 = 2
            if (r11 == 0) goto L_0x0111
            java.lang.String r9 = ".sysmsg.EmojiBackup.OpCode"
            java.lang.Object r9 = r4.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r9)
            java.lang.String r11 = ".sysmsg.EmojiBackup.DeviceID"
            java.lang.Object r4 = r4.get(r11)
            java.lang.String r4 = (java.lang.String) r4
            ft3.g r11 = ft3.C8206g.f27135a
            java.lang.String r8 = p156gj.C87203t.m108273i()
            boolean r4 = r11.mo9260a(r4, r8, r10, r5)
            if (r4 == 0) goto L_0x007f
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            return
        L_0x007f:
            java.util.ArrayList r3 = k61.C99105c.m129076a(r3)
            if (r9 != r6) goto L_0x00a9
            if (r3 == 0) goto L_0x00a5
            int r0 = r3.size()
            if (r0 > 0) goto L_0x008e
            goto L_0x00a5
        L_0x008e:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r2 = r3.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "try to sync emoji from newxml. buckupList:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            r1.mo138484d(r5, r3)
            goto L_0x037f
        L_0x00a5:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            return
        L_0x00a9:
            if (r9 != r15) goto L_0x00fe
            if (r3 == 0) goto L_0x00fa
            int r4 = r3.size()
            if (r4 > 0) goto L_0x00b4
            goto L_0x00fa
        L_0x00b4:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.size()
            if (r5 <= 0) goto L_0x00d7
            java.util.Iterator r3 = r3.iterator()
        L_0x00c3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00d7
            java.lang.Object r5 = r3.next()
            te3.k70 r5 = (te3.C101800k70) r5
            if (r5 == 0) goto L_0x00c3
            java.lang.String r5 = r5.f298586d
            r4.add(r5)
            goto L_0x00c3
        L_0x00d7:
            di3.d r2 = di3.C86312j.m106911c(r2)
            aq.g r2 = (p441aq.C92054g) r2
            r2.getClass()
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r2 = r2.mo57717d()
            r2.mo142060mI(r4)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.mo119677K(r0, r3)
            goto L_0x037f
        L_0x00fa:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            return
        L_0x00fe:
            if (r9 != r12) goto L_0x037f
            java.lang.String r0 = "set batch emoji download time to 0. "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            ll.l r0 = new ll.l
            r2 = 0
            r0.<init>(r5, r2)
            r0.mo138911a()
            goto L_0x037f
        L_0x0111:
            java.lang.String r8 = "EmotionBackup"
            boolean r10 = r9.equalsIgnoreCase(r8)
            if (r10 == 0) goto L_0x0275
            java.lang.String r0 = ".sysmsg.EmotionBackup.OpCode"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r5)
            java.lang.String r0 = ".sysmsg.EmotionBackup.DeviceID"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            ft3.g r4 = ft3.C8206g.f27135a
            java.lang.String r10 = p156gj.C87203t.m108273i()
            boolean r0 = r4.mo9260a(r0, r10, r8, r5)
            if (r0 == 0) goto L_0x013d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            return
        L_0x013d:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.String r4 = "MicroMsg.emoji.EmojiBackupXMLParser"
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = "[backup emotion parser] parse xml faild. xml is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
            goto L_0x01a2
        L_0x014b:
            javax.xml.parsers.DocumentBuilderFactory r0 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            javax.xml.parsers.DocumentBuilder r0 = r0.newDocumentBuilder()     // Catch:{ Exception -> 0x0194 }
            org.xml.sax.InputSource r8 = new org.xml.sax.InputSource     // Catch:{ Exception -> 0x0194 }
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0194 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x0194 }
            r10.<init>(r3)     // Catch:{ Exception -> 0x0194 }
            r8.<init>(r10)     // Catch:{ Exception -> 0x0194 }
            org.w3c.dom.Document r0 = r0.parse(r8)     // Catch:{ Exception -> 0x0194 }
            r0.normalize()     // Catch:{ Exception -> 0x0194 }
            org.w3c.dom.Element r0 = r0.getDocumentElement()     // Catch:{ Exception -> 0x0194 }
            java.lang.String r3 = "ProductID"
            org.w3c.dom.NodeList r0 = r0.getElementsByTagName(r3)     // Catch:{ Exception -> 0x0194 }
            if (r0 == 0) goto L_0x01a2
            int r3 = r0.getLength()     // Catch:{ Exception -> 0x0194 }
            if (r3 <= 0) goto L_0x01a2
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0194 }
            r3.<init>()     // Catch:{ Exception -> 0x0194 }
            int r8 = r0.getLength()     // Catch:{ Exception -> 0x0194 }
            r10 = 0
        L_0x0184:
            if (r10 >= r8) goto L_0x01a3
            org.w3c.dom.Node r11 = r0.item(r10)     // Catch:{ Exception -> 0x0194 }
            java.lang.String r11 = r11.getTextContent()     // Catch:{ Exception -> 0x0194 }
            r3.add(r11)     // Catch:{ Exception -> 0x0194 }
            int r10 = r10 + 1
            goto L_0x0184
        L_0x0194:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r0 = r0.toString()
            r3[r5] = r0
            java.lang.String r0 = "[parser] parseXML exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r3)
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            if (r3 == 0) goto L_0x0271
            int r0 = r3.size()
            if (r0 > 0) goto L_0x01ad
            goto L_0x0271
        L_0x01ad:
            if (r9 != r6) goto L_0x01fd
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r5] = r4
            java.lang.String r4 = "try to sync emoji from newxml. add buckupList:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r4 = r3.size()
        L_0x01ca:
            if (r5 >= r4) goto L_0x01dd
            l61.a r6 = new l61.a
            java.lang.Object r7 = r3.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            r6.<init>(r7)
            r0.add(r6)
            int r5 = r5 + 1
            goto L_0x01ca
        L_0x01dd:
            di3.d r3 = di3.C86312j.m106911c(r2)
            aq.g r3 = (p441aq.C92054g) r3
            com.tencent.mm.plugin.emoji.sync.b r3 = r3.wx0()
            com.tencent.mm.plugin.emoji.sync.BKGLoaderManager r3 = r3.f268269a
            r3.mo64093b(r0)
            di3.d r0 = di3.C86312j.m106911c(r2)
            aq.g r0 = (p441aq.C92054g) r0
            com.tencent.mm.plugin.emoji.sync.b r0 = r0.wx0()
            com.tencent.mm.plugin.emoji.sync.BKGLoaderManager r0 = r0.f268269a
            r0.mo64097f()
            goto L_0x037f
        L_0x01fd:
            if (r9 != r15) goto L_0x037f
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r5] = r4
            java.lang.String r4 = "try to sync emoji from newxml. delete buckupList:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r0)
            di3.d r0 = di3.C86312j.m106911c(r2)
            aq.g r0 = (p441aq.C92054g) r0
            r0.getClass()
            com.tencent.mm.storage.w2 r0 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.c r0 = r0.mo57715b()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r0.f301702d
            boolean r4 = r2 instanceof zh3.C91753f
            java.lang.String r7 = "MicroMsg.emoji.EmojiGroupInfoStorage"
            if (r4 == 0) goto L_0x0248
            r8 = r2
            zh3.f r8 = (zh3.C91753f) r8
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r9 = r2.getId()
            long r9 = r8.beginTransaction(r9)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            r2[r5] = r4
            java.lang.String r4 = "surround deleteByGroupIdList in a transaction, ticket = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r2)
            goto L_0x024b
        L_0x0248:
            r9 = -1
            r8 = 0
        L_0x024b:
            int r2 = r3.size()
            if (r2 <= 0) goto L_0x0265
            java.util.Iterator r2 = r3.iterator()
        L_0x0255:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0265
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r0.mo142021Ow(r3)
            goto L_0x0255
        L_0x0265:
            if (r8 == 0) goto L_0x037f
            r8.endTransaction(r9)
            java.lang.String r0 = "end deleteByGroupIdList transaction"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            goto L_0x037f
        L_0x0271:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r13)
            return
        L_0x0275:
            java.lang.String r8 = "SelfieEmojiBackup"
            boolean r10 = r9.equalsIgnoreCase(r8)
            if (r10 == 0) goto L_0x035b
            java.lang.String r9 = ".sysmsg.SelfieEmojiBackup.DeviceID"
            java.lang.Object r9 = r4.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            ft3.g r10 = ft3.C8206g.f27135a
            java.lang.String r11 = p156gj.C87203t.m108273i()
            boolean r8 = r10.mo9260a(r9, r11, r8, r5)
            if (r8 == 0) goto L_0x0295
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r14)
            return
        L_0x0295:
            java.lang.String r8 = ".sysmsg.SelfieEmojiBackup.OpCode"
            java.lang.Object r4 = r4.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            java.util.ArrayList r3 = k61.C99105c.m129076a(r3)
            if (r3 == 0) goto L_0x034d
            int r8 = r3.size()
            if (r8 > 0) goto L_0x02af
            goto L_0x034d
        L_0x02af:
            java.lang.Object[] r8 = new java.lang.Object[r15]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r8[r5] = r9
            int r9 = r3.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r6] = r9
            java.lang.String r9 = "back up capture: opCode %s, size %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r8)
            if (r4 != r6) goto L_0x02de
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r2 = r3.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "back up capture: add capture %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            r1.mo138484d(r6, r3)
            goto L_0x037f
        L_0x02de:
            if (r4 != r15) goto L_0x0330
            java.lang.Object[] r4 = new java.lang.Object[r6]
            int r6 = r3.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            java.lang.String r5 = "back up capture: delete capture %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x02fa:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x030e
            java.lang.Object r5 = r3.next()
            te3.k70 r5 = (te3.C101800k70) r5
            if (r5 == 0) goto L_0x02fa
            java.lang.String r5 = r5.f298586d
            r4.add(r5)
            goto L_0x02fa
        L_0x030e:
            di3.d r2 = di3.C86312j.m106911c(r2)
            aq.g r2 = (p441aq.C92054g) r2
            r2.getClass()
            com.tencent.mm.storage.w2 r2 = com.tencent.p014mm.storage.C30790w2.m39221h()
            wh3.g r2 = r2.mo57717d()
            r2.mo142051bF(r4)
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.mo119677K(r0, r3)
            goto L_0x037f
        L_0x0330:
            if (r4 != r12) goto L_0x037f
            java.lang.Object[] r0 = new java.lang.Object[r6]
            int r2 = r3.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r5] = r2
            java.lang.String r2 = "back up capture: move to top %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            ll.l r0 = new ll.l
            r2 = 0
            r0.<init>(r6, r2)
            r0.mo138911a()
            goto L_0x037f
        L_0x034d:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r5] = r2
            java.lang.String r2 = "back up capture: empty list opCode %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
            return
        L_0x035b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "not emoji message type :"
            r0.append(r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x037f
        L_0x0371:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0[r5] = r2
            java.lang.String r2 = "not new xml type:%d "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r2, r0)
        L_0x037f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k61.C99104a.mo9066Y(ob0.m$a):void");
    }

    /* renamed from: d */
    public final void mo138484d(int i, ArrayList<C101800k70> arrayList) {
        Iterator<C101800k70> it = arrayList.iterator();
        while (it.hasNext()) {
            C101800k70 next = it.next();
            EmojiInfo TO = C30790w2.m39221h().mo57717d().mo142044TO(next.f298586d);
            if (TO == null) {
                EmojiInfo emojiInfo = new EmojiInfo();
                C101964h.m134219a(next, emojiInfo);
                if (i == 1) {
                    emojiInfo.field_groupId = "capture";
                } else {
                    emojiInfo.field_catalog = 81;
                }
                C30790w2.m39221h().mo57717d().insert(emojiInfo);
            } else {
                if (i == 1) {
                    TO.field_groupId = "capture";
                } else {
                    IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
                    TO.field_catalog = 81;
                }
                C30790w2.m39221h().mo57717d().r50(TO);
            }
        }
    }
}
