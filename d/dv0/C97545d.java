package dv0;

import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C96985s2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import di3.C86312j;
import dv0.C97553m;
import eb0.C86484b;
import hv0.C98542c;
import hv0.C98543d;
import hv0.C98544e;
import i61.C98602h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import te3.C77926f9;
import u61.C101964h;
import yu0.C102913k;
import z51.C39315g;

/* renamed from: dv0.d */
public class C97545d implements C75460n {
    /* renamed from: a */
    public int mo105806a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        C97553m.C97554a aVar;
        C77926f9 f9Var2 = f9Var;
        C72963f4 f4Var2 = f4Var;
        Class cls = C39315g.class;
        f4Var2.mo108732L2(f9Var2.f227337h.f141175d);
        String str2 = f9Var2.f227335f.f141175d;
        String str3 = f9Var2.f227336g.f141175d;
        if (((String) C98544e.m128035f().mo137901e().mo137894b().mo119684e(2, (Object) null)).equals(str2)) {
            str2 = str3;
        }
        String str4 = f9Var2.f227337h.f141175d;
        Map<String, String> parseXml = XmlParser.parseXml(str4, "msg", (String) null);
        C96985s2 I = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo138002I(str4, str2);
        if (I == null) {
            Log.m105928w("MicroMsg.BackupItemEmoji", "EmojiMsgInfo is null");
            return -1;
        }
        EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(I.f284163d);
        if (G == null) {
            G = new EmojiInfo();
            C101964h.m134220b(I, G);
            G.field_catalog = 65;
            C98542c e = C98544e.m128035f().mo137901e();
            if (e.f288980o != 0) {
                e.f288971f.mo142040Ow(G);
            } else {
                throw new C86484b();
            }
        }
        if (parseXml.get(".msg.emoji.$androidmd5") == null) {
            String str5 = I.f284163d;
            if (C97553m.f286263c == null) {
                C97553m.f286263c = new C97553m();
            }
            C97553m mVar = C97553m.f286263c;
            if (mVar.f286264b == null) {
                mVar.mo136818d();
            }
            Iterator it = ((HashMap) mVar.f286264b).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (C97553m.C97554a) it.next();
                String str6 = aVar.f286266b;
                if (str6 != null && str6.equals(str5)) {
                    break;
                }
            }
            String str7 = aVar == null ? null : aVar.f286265a;
            if (!Util.isNullOrNil(str7)) {
                I.f284163d = str7;
                Log.m105919d("MicroMsg.BackupItemEmoji", "convert ip to android md5 %s", str7);
            }
        }
        String str8 = I.f284168i;
        f4Var2.setType(47);
        f4Var2.mo108739S2(I.f284163d);
        f4Var2.mo108732L2(C72989o2.m85759f(I.f284161b, 0, !G.mo62678k() && !G.mo135617o2(), I.f284163d, false, ""));
        if (!G.mo62633C1()) {
            C98542c e2 = C98544e.m128035f().mo137901e();
            if (e2.f288980o != 0) {
                String str9 = e2.f288981p + "emoji/";
                if (TextUtils.isEmpty(str8)) {
                    C102913k.m136033E(f9Var2, 4, str9 + I.f284163d + "_thumb");
                    StringBuilder sb = new StringBuilder();
                    sb.append(str9);
                    sb.append(I.f284163d);
                    C102913k.m136033E(f9Var2, 5, sb.toString());
                } else {
                    Uri n = C116299g2.m163858n(str9 + str8);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0 f0Var = C116281f0.C116289i.f348994a;
                    C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
                    if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                        C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                        if (l2.mo177810a()) {
                            l2.f348991a.mo119937g(l2.f348992b);
                        }
                    }
                    C102913k.m136033E(f9Var2, 4, str9 + str8 + "/" + I.f284163d + "_cover");
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str9);
                    sb4.append(str8);
                    sb4.append("/");
                    sb4.append(I.f284163d);
                    C102913k.m136033E(f9Var2, 5, sb4.toString());
                }
            } else {
                throw new C86484b();
            }
        }
        Log.m105918d("MicroMsg.BackupItemEmoji", "id " + C98543d.m128033d(f4Var));
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0341  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo105807b(te3.C77926f9 r17, boolean r18, com.tencent.p014mm.storage.C72963f4 r19, java.lang.String r20, java.util.LinkedList<pv0.C100968x> r21, boolean r22) {
        /*
            r16 = this;
            r1 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "msg:"
            r0.append(r2)
            java.lang.String r2 = r19.getContent()
            r0.append(r2)
            java.lang.String r2 = ", msgId:"
            r0.append(r2)
            long r2 = r19.getMsgId()
            r0.append(r2)
            java.lang.String r2 = ", svrId:"
            r0.append(r2)
            long r2 = r19.mo108774y2()
            r0.append(r2)
            java.lang.String r2 = ", talker:"
            r0.append(r2)
            java.lang.String r2 = r19.mo108768t()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.BackupItemEmoji"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            java.lang.String r0 = r19.getContent()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r3 = 0
            if (r0 == 0) goto L_0x004e
            r4 = 0
            goto L_0x0058
        L_0x004e:
            java.lang.String r0 = r19.getContent()
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            r4 = r0
        L_0x0058:
            java.lang.String r0 = r19.getContent()
            com.tencent.mm.storage.o2 r5 = new com.tencent.mm.storage.o2
            r5.<init>(r0)
            java.lang.String r0 = r5.f212823f
            java.lang.String r0 = r0.trim()
            boolean r5 = yu0.C102913k.m136042g(r0)
            java.lang.String r6 = ""
            if (r5 != 0) goto L_0x0326
            java.lang.String r0 = r19.getContent()
            java.lang.String r5 = ":"
            java.lang.String r7 = "*#*"
            java.lang.String r0 = r0.replace(r7, r5)
            java.lang.String r7 = "<msg"
            int r7 = r0.indexOf(r7)
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r9[r3] = r10
            java.lang.String r10 = "MicroMsg.emoji.EmojiContent"
            java.lang.String r11 = "getOriginContent: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r9)
            if (r7 >= 0) goto L_0x0095
            r0 = 0
            goto L_0x00cb
        L_0x0095:
            java.lang.String r12 = r0.substring(r3, r7)
            java.lang.String[] r12 = r12.split(r5)
            java.lang.String r7 = r0.substring(r3, r7)
            int r5 = r7.lastIndexOf(r5)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            int r13 = r12.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7[r3] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r7)
            int r7 = r12.length
            r10 = 5
            if (r7 < r10) goto L_0x00cb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r10 = 4
            r10 = r12[r10]
            r7.append(r10)
            java.lang.String r0 = r0.substring(r5)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
        L_0x00cb:
            boolean r5 = yu0.C102913k.m136042g(r0)
            if (r5 != 0) goto L_0x0326
            java.lang.String r0 = "1024"
            java.lang.String r5 = "type"
            java.lang.String r7 = "emoji"
            java.lang.String r10 = "msg"
            java.lang.String r11 = "gameext"
            java.lang.String r12 = "MicroMsg.BackupUtil.EmojiConvert"
            hv0.e r13 = hv0.C98544e.m128035f()
            hv0.c r13 = r13.mo137901e()
            int r14 = r13.f288980o
            if (r14 == 0) goto L_0x0320
            wh3.g r13 = r13.f288971f
            java.lang.String r14 = r19.mo108765s2()
            com.tencent.mm.storage.emotion.EmojiInfo r13 = r13.mo142044TO(r14)
            if (r13 != 0) goto L_0x00fc
            r22 = r2
            r9 = 0
            goto L_0x02f6
        L_0x00fc:
            java.lang.String r14 = r13.getMd5()
            dv0.m$a r14 = dv0.C97553m.m125703c(r14)
            if (r14 != 0) goto L_0x011b
            dv0.m$a r14 = new dv0.m$a
            java.lang.String r15 = r13.getMd5()
            java.lang.String r8 = r13.getMd5()
            java.lang.String r3 = r13.getMd5()
            java.lang.String r9 = r13.getMd5()
            r14.<init>(r15, r8, r3, r9)
        L_0x011b:
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            org.xmlpull.v1.XmlPullParserFactory r8 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            org.xmlpull.v1.XmlSerializer r8 = r8.newSerializer()     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            r8.setOutput(r3)     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            java.lang.String r9 = "UTF-8"
            java.lang.Boolean r15 = java.lang.Boolean.TRUE     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            r8.startDocument(r9, r15)     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            r9 = 0
            r8.startTag(r9, r10)     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            r8.startTag(r9, r7)     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            java.lang.String r9 = "fromusername"
            te3.rv3 r15 = r1.f227335f     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            java.lang.String r15 = r15.f141175d     // Catch:{ XmlPullParserException -> 0x02ec, IllegalArgumentException -> 0x02e2, IllegalStateException -> 0x02d8, IOException -> 0x02ce }
            r22 = r2
            r2 = 0
            r8.attribute(r2, r9, r15)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = "tousername"
            te3.rv3 r9 = r1.f227336g     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r9 = r9.f141175d     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r15 = 0
            r8.attribute(r15, r2, r9)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            int r9 = r13.field_type     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r2.append(r9)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r2.append(r6)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r9 = 0
            r8.attribute(r9, r5, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = "idbuffer"
            java.lang.String r9 = r13.field_svrid     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r9 != 0) goto L_0x016c
            r9 = r6
        L_0x016c:
            r15 = 0
            r8.attribute(r15, r2, r9)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = "md5"
            java.lang.String r9 = r14.f286266b     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r8.attribute(r15, r2, r9)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = "len"
            r8.attribute(r15, r2, r0)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = "androidmd5"
            java.lang.String r9 = r14.f286265a     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r8.attribute(r15, r2, r9)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = "androidlen"
            r8.attribute(r15, r2, r0)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "productid"
            java.lang.String r2 = r13.field_groupId     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r9 = 0
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "cdnurl"
            java.lang.String r2 = r13.field_cdnUrl     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x019a
            r2 = r6
        L_0x019a:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "designerid"
            java.lang.String r2 = r13.field_designerID     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x01a4
            r2 = r6
        L_0x01a4:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "thumburl"
            java.lang.String r2 = r13.field_thumbUrl     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x01af
            r2 = r6
        L_0x01af:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "encrypturl"
            java.lang.String r2 = r13.field_encrypturl     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x01b9
            r2 = r6
        L_0x01b9:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "aeskey"
            java.lang.String r2 = r13.field_aeskey     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x01c3
            r2 = r6
        L_0x01c3:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "externurl"
            java.lang.String r2 = r13.field_externUrl     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x01cd
            r2 = r6
        L_0x01cd:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "externmd5"
            java.lang.String r2 = r13.field_externMd5     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x01d7
            r2 = r6
        L_0x01d7:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "width"
            int r2 = r13.field_width     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "height"
            int r2 = r13.field_height     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "tpurl"
            java.lang.String r2 = r13.field_tpurl     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x01f9
            r2 = r6
        L_0x01f9:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "tpauthkey"
            java.lang.String r2 = r13.field_tpauthkey     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x0204
            r2 = r6
        L_0x0204:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "attachedtext"
            java.lang.String r2 = r13.field_attachedText     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x020e
            r2 = r6
        L_0x020e:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "attachedtextcolor"
            java.lang.String r2 = r13.field_attachTextColor     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x0218
            r2 = r6
        L_0x0218:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "lensid"
            java.lang.String r2 = r13.field_lensId     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x0223
            r2 = r6
        L_0x0223:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = "activityid"
            java.lang.String r2 = r13.field_activityid     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r2 != 0) goto L_0x022d
            r2 = r6
        L_0x022d:
            r8.attribute(r9, r0, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r8.endTag(r9, r7)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            boolean r0 = r13.mo62678k()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r0 == 0) goto L_0x0299
            r8.startTag(r9, r11)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = r13.getContent()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r11, r9)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = ".gameext.$type"
            java.lang.Object r2 = r0.get(r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r6)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r7 = ".gameext.$content"
            java.lang.Object r0 = r0.get(r7)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r6)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            boolean r7 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r7 != 0) goto L_0x0295
            boolean r7 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            if (r7 == 0) goto L_0x0269
            goto L_0x0295
        L_0x0269:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r7.append(r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r7.append(r6)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = r7.toString()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r7 = 0
            r8.attribute(r7, r5, r2)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r2 = "content"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r5.append(r0)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.String r0 = r5.toString()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r5 = 0
            r8.attribute(r5, r2, r0)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r8.endTag(r5, r11)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            goto L_0x0299
        L_0x0295:
            r3.close()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            goto L_0x02f5
        L_0x0299:
            r0 = 0
            r8.endTag(r0, r10)     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r8.endDocument()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r3.flush()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            r3.close()     // Catch:{ XmlPullParserException -> 0x02cb, IllegalArgumentException -> 0x02c8, IllegalStateException -> 0x02c5, IOException -> 0x02c3 }
            java.lang.StringBuffer r0 = r3.getBuffer()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "<msg>"
            int r2 = r0.indexOf(r2)     // Catch:{ Exception -> 0x02c1 }
            java.lang.String r3 = "</msg>"
            int r3 = r0.indexOf(r3)     // Catch:{ Exception -> 0x02c1 }
            int r3 = r3 + 6
            java.lang.String r9 = r0.substring(r2, r3)     // Catch:{ Exception -> 0x02c1 }
            goto L_0x02f6
        L_0x02c1:
            goto L_0x02f5
        L_0x02c3:
            r0 = move-exception
            goto L_0x02d1
        L_0x02c5:
            r0 = move-exception
        L_0x02c6:
            r2 = 0
            goto L_0x02dc
        L_0x02c8:
            r0 = move-exception
        L_0x02c9:
            r2 = 0
            goto L_0x02e6
        L_0x02cb:
            r0 = move-exception
        L_0x02cc:
            r2 = 0
            goto L_0x02f0
        L_0x02ce:
            r0 = move-exception
            r22 = r2
        L_0x02d1:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r6, r2)
            goto L_0x02f5
        L_0x02d8:
            r0 = move-exception
            r22 = r2
            goto L_0x02c6
        L_0x02dc:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r6, r2)
            goto L_0x02f5
        L_0x02e2:
            r0 = move-exception
            r22 = r2
            goto L_0x02c9
        L_0x02e6:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r6, r2)
            goto L_0x02f5
        L_0x02ec:
            r0 = move-exception
            r22 = r2
            goto L_0x02cc
        L_0x02f0:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r6, r2)
        L_0x02f5:
            r9 = r6
        L_0x02f6:
            int r0 = r19.mo108769t2()
            r2 = 1
            if (r0 == r2) goto L_0x0329
            java.lang.String r0 = r19.mo108768t()
            boolean r0 = hv0.C98543d.m128034e(r0)
            if (r0 == 0) goto L_0x0329
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r19.mo108768t()
            r0.append(r2)
            java.lang.String r2 = " :\n "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            goto L_0x0329
        L_0x0320:
            eb0.b r0 = new eb0.b
            r0.<init>()
            throw r0
        L_0x0326:
            r22 = r2
            r9 = r0
        L_0x0329:
            if (r9 == 0) goto L_0x0341
            boolean r0 = yu0.C102913k.m136042g(r9)
            if (r0 != 0) goto L_0x0332
            goto L_0x0341
        L_0x0332:
            te3.rv3 r0 = new te3.rv3
            r0.<init>()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r9, (java.lang.String) r6)
            r0.mo73357f(r2)
            r1.f227337h = r0
            return r4
        L_0x0341:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "emoji error:"
            r0.append(r1)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r9)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dv0.C97545d.mo105807b(te3.f9, boolean, com.tencent.mm.storage.f4, java.lang.String, java.util.LinkedList, boolean):int");
    }
}
