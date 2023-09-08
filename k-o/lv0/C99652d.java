package lv0;

import android.graphics.Bitmap;
import com.tencent.p014mm.autogen.events.QueryRecordMsgMediaListEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import eb0.C31543z5;
import eb0.C86484b;
import jv0.C99055a;
import ov0.C100542a;
import ov0.C100544c;
import ov0.C100546d;
import ov0.C100554g;
import ov0.C100556h;
import p206nj.C76861g;
import te3.C77926f9;

/* renamed from: lv0.d */
public class C99652d implements C99663m {
    /* renamed from: a */
    public int mo139033a(String str, C77926f9 f9Var, C72963f4 f4Var) {
        int a;
        C77926f9 f9Var2 = f9Var;
        C72963f4 f4Var2 = f4Var;
        String str2 = f9Var2.f227335f.f141175d;
        String str3 = f9Var2.f227337h.f141175d;
        if (str3 == null) {
            return 0;
        }
        f4Var2.mo108732L2(str3);
        if (!(f4Var.mo108769t2() == 1 || !C100556h.m131584d(str2) || (a = C100556h.m131581a(f9Var2.f227337h.f141175d)) == -1)) {
            str3 = (f9Var2.f227337h.f141175d + " ").substring(a + 2).trim();
        }
        String processXml = Util.processXml(str3);
        C68070l.C68072b u = C68070l.C68072b.m80422u(processXml, (String) null);
        if (u == null) {
            Log.m105920e("MicroMsg.BakOldItemAppMsg", "parse app message failed, insert failed");
            return 0;
        }
        int i = u.f195582i;
        if (i == 2000 || i == 2011) {
            f4Var2.setType(419430449);
            C100556h.m131583c(f4Var);
            return 0;
        } else if (i == 19 || i == 24) {
            f4Var2.setType(C72695v.m85070l(u));
            C100556h.m131583c(f4Var);
            QueryRecordMsgMediaListEvent queryRecordMsgMediaListEvent = new QueryRecordMsgMediaListEvent();
            QueryRecordMsgMediaListEvent.C92546a aVar = queryRecordMsgMediaListEvent.f265003d;
            aVar.f265005a = u.f195571f0;
            aVar.f265006b = f4Var.getMsgId();
            queryRecordMsgMediaListEvent.publish();
            Log.m105925i("MicroMsg.BakOldItemAppMsg", "pathList:%s", queryRecordMsgMediaListEvent.f265004e.f265007a);
            String[] split = queryRecordMsgMediaListEvent.f265004e.f265007a.split(XVFSFile.PATH_SEPARATOR);
            for (int i2 = 0; i2 < split.length; i2++) {
                String d = C99055a.m129005d(f9Var2, 7, "." + i2);
                if (!Util.isNullOrNil(d)) {
                    Log.m105925i("MicroMsg.BakOldItemAppMsg", "record media exit:%s, index:%d", d, Integer.valueOf(i2));
                    C86013q1.m106442c(C99055a.m129007f(d), split[i2]);
                }
            }
            return 0;
        } else {
            C44561j jVar = new C44561j();
            jVar.field_appId = u.f195562d;
            C100554g h = C100546d.m131563g().mo139995h();
            if (h.f294625o != 0) {
                if (h.f294621k.get(jVar, new String[0]) && jVar.field_appVersion < u.f195480E) {
                    C100544c f = C100546d.m131563g().mo139994f();
                    f.f294588b.post(new C100542a(f, 1, u.f195562d));
                }
                f4Var2.setType(C72695v.m85070l(u));
                byte[] g = C99055a.m129008g(f9Var2, 6);
                if (g != null && f4Var.getMsgId() == 0) {
                    String zx02 = C100546d.m131563g().mo139995h().mo140007g().zx0(g, u.f195582i == 2, Bitmap.CompressFormat.PNG, false);
                    Log.m105918d("MicroMsg.BakOldItemAppMsg", C76861g.m92660c() + " thumbData MsgInfo path:" + zx02);
                    if (!Util.isNullOrNil(zx02)) {
                        f4Var2.mo108739S2(zx02);
                        Log.m105918d("MicroMsg.BakOldItemAppMsg", "new thumbnail saved, path:" + zx02);
                    }
                }
                String d2 = C99055a.m129005d(f9Var2, 8, (String) null);
                int e = C99055a.m129006e(f9Var2, 8);
                if (Util.isNullOrNil(d2)) {
                    d2 = C99055a.m129005d(f9Var2, 7, (String) null);
                    e = C99055a.m129006e(f9Var2, 7);
                }
                String f2 = C99055a.m129007f(d2);
                C100556h.m131583c(f4Var);
                C68070l lVar = new C68070l();
                u.mo93547j(lVar);
                lVar.field_msgId = f4Var.getMsgId();
                C100554g h2 = C100546d.m131563g().mo139995h();
                if (h2.f294625o != 0) {
                    h2.f294620j.insert(lVar);
                    if (!Util.isNullOrNil(d2)) {
                        C72963f4 h302 = ((C72972g4) C100546d.m131563g().mo139995h().mo140008h()).h30(str.equals(f9Var2.f227335f.f141175d) ? f9Var2.f227336g.f141175d : f9Var2.f227335f.f141175d, f9Var2.f227348v);
                        C72683d qq = C100546d.m131563g().mo139995h().mo140004d().mo100154qq(u.f195606o);
                        if (qq == null) {
                            Log.m105924i("MicroMsg.BakOldItemAppMsg", "recover AppAttachInfo is null.");
                            long msgId = h302.getMsgId();
                            C68070l.C68072b u2 = C68070l.C68072b.m80422u(processXml, (String) null);
                            if (u2 != null) {
                                String e2 = C72695v.m85063e(C72695v.m85068j(), u2.f195570f, u2.f195602n);
                                int i3 = u2.f195566e;
                                String str4 = u2.f195562d;
                                String str5 = u2.f195606o;
                                int i4 = u2.f195594l;
                                C72683d dVar = new C72683d();
                                dVar.field_fileFullPath = e2;
                                dVar.field_appId = str4;
                                dVar.field_sdkVer = (long) i3;
                                dVar.field_mediaSvrId = str5;
                                dVar.field_totalLen = (long) i4;
                                dVar.field_status = 101;
                                dVar.field_isUpload = false;
                                dVar.field_createTime = C31543z5.m39451a();
                                dVar.field_lastModifyTime = Util.nowSecond();
                                dVar.field_msgInfoId = msgId;
                                dVar.field_netTimes = 0;
                                if (!C100546d.m131563g().mo139995h().mo140004d().insert(dVar)) {
                                    Log.m105921e("MicroMsg.BakOldTempStorageLogic", "initDownloadAttach insert error, msgLocalId[%d]", Long.valueOf(msgId));
                                }
                            }
                            qq = C100546d.m131563g().mo139995h().mo140004d().mo100154qq(u.f195606o);
                            if (qq == null) {
                                Log.m105921e("MicroMsg.BakOldItemAppMsg", "getAppAttachInfoStg().getByMediaId is null! attachid[%s]", u.f195606o);
                                return 0;
                            }
                            int i5 = u.f195594l;
                            if (!(i5 == 0 || e == 0)) {
                                if (e >= i5) {
                                    qq.field_status = 199;
                                } else if (f4Var.mo108769t2() == 1) {
                                    qq.field_status = 105;
                                } else {
                                    qq.field_status = 102;
                                }
                            }
                        }
                        long j = (long) e;
                        qq.field_offset = j;
                        qq.field_totalLen = j;
                        C86013q1.m106441b(f2, qq.field_fileFullPath);
                        C100546d.m131563g().mo139995h().mo140004d().update(qq, new String[0]);
                    }
                    return 0;
                }
                throw new C86484b();
            }
            throw new C86484b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:147:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x06a8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo139034b(te3.C77926f9 r20, boolean r21, com.tencent.p014mm.storage.C72963f4 r22, java.lang.String r23, java.util.LinkedList<pv0.C100968x> r24, java.util.HashMap<java.lang.Long, lv0.C99659k.C99660a> r25, boolean r26, long r27) {
        /*
            r19 = this;
            r9 = r20
            r10 = r25
            int r0 = r22.getType()
            java.lang.String r1 = "msg"
            r2 = 0
            r11 = 1
            r3 = 1048625(0x100031, float:1.469437E-39)
            java.lang.String r13 = "MicroMsg.BakOldItemAppMsg"
            r4 = 0
            java.lang.String r6 = ""
            r7 = -1
            if (r0 == r3) goto L_0x0620
            r3 = 285212721(0x11000031, float:1.0097479E-28)
            if (r0 == r3) goto L_0x0284
            java.lang.String r0 = r22.getContent()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x002a
            r14 = 0
            goto L_0x0034
        L_0x002a:
            java.lang.String r0 = r22.getContent()
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            r14 = r0
        L_0x0034:
            java.lang.String r0 = r22.getContent()
            int r1 = r22.mo108769t2()
            if (r1 == r11) goto L_0x005d
            java.lang.String r1 = r22.mo108768t()
            boolean r1 = ov0.C100556h.m131584d(r1)
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r22.getContent()
            r3 = 58
            int r1 = r1.indexOf(r3)
            if (r1 == r7) goto L_0x005d
            java.lang.String r0 = r22.getContent()
            int r1 = r1 + r11
            java.lang.String r0 = r0.substring(r1)
        L_0x005d:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r0)
            if (r0 == 0) goto L_0x0067
            com.tencent.mm.message.l$b r2 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r2)
        L_0x0067:
            r15 = r2
            if (r15 != 0) goto L_0x006d
            r12 = 0
            goto L_0x0283
        L_0x006d:
            ov0.d r0 = ov0.C100546d.m131563g()
            ov0.g r0 = r0.mo139995h()
            com.tencent.mm.modelimage.m r0 = r0.mo140007g()
            java.lang.String r1 = r22.mo108765s2()
            java.lang.String r1 = r0.v10(r1, r11)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            r8 = 2
            if (r0 == 0) goto L_0x00a5
            lv0.l$a r16 = new lv0.l$a
            r4 = 6
            r17 = 0
            java.lang.String r6 = "_thumb"
            r0 = r16
            r2 = r20
            r3 = r24
            r5 = r21
            r7 = r26
            r12 = 2
            r8 = r17
            r0.<init>((java.lang.String) r1, (te3.C77926f9) r2, (java.util.LinkedList<pv0.C100968x>) r3, (int) r4, (boolean) r5, (java.lang.String) r6, (boolean) r7, (pv0.C100968x) r8)
            int r0 = lv0.C99661l.m130077a(r16)
            int r14 = r14 + r0
            goto L_0x00ad
        L_0x00a5:
            r12 = 2
            int r0 = r15.f195582i
            if (r0 != r12) goto L_0x00ad
            r12 = -1
            goto L_0x0283
        L_0x00ad:
            int r0 = r15.f195582i
            if (r0 == r12) goto L_0x0222
            r1 = 19
            if (r0 == r1) goto L_0x01a6
            r1 = 24
            if (r0 == r1) goto L_0x01a6
            r1 = 6
            if (r0 == r1) goto L_0x0107
            r1 = 7
            if (r0 == r1) goto L_0x00c1
            goto L_0x0282
        L_0x00c1:
            ov0.d r0 = ov0.C100546d.m131563g()
            ov0.g r0 = r0.mo139995h()
            com.tencent.mm.pluginsdk.model.app.e r0 = r0.mo140004d()
            java.lang.String r1 = r15.f195606o
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r1)
            if (r0 == 0) goto L_0x00db
            boolean r1 = r0.mo100146l2()
            if (r1 != 0) goto L_0x00e7
        L_0x00db:
            int r1 = r22.mo108769t2()
            if (r1 != r11) goto L_0x0282
            if (r0 == 0) goto L_0x0282
            boolean r1 = r0.field_isUpload
            if (r1 == 0) goto L_0x0282
        L_0x00e7:
            java.lang.String r1 = r0.field_fileFullPath
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x0282
            lv0.l$a r8 = new lv0.l$a
            java.lang.String r1 = r0.field_fileFullPath
            r4 = 7
            r7 = 0
            r0 = r8
            r2 = r20
            r3 = r24
            r5 = r21
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r0 = lv0.C99661l.m130077a(r8)
            goto L_0x0281
        L_0x0107:
            ov0.d r0 = ov0.C100546d.m131563g()
            ov0.g r0 = r0.mo139995h()
            com.tencent.mm.pluginsdk.model.app.e r0 = r0.mo140004d()
            java.lang.String r1 = r15.f195606o
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r1)
            if (r0 == 0) goto L_0x0121
            boolean r1 = r0.mo100146l2()
            if (r1 != 0) goto L_0x012d
        L_0x0121:
            int r1 = r22.mo108769t2()
            if (r1 != r11) goto L_0x0282
            if (r0 == 0) goto L_0x0282
            boolean r1 = r0.field_isUpload
            if (r1 == 0) goto L_0x0282
        L_0x012d:
            java.lang.String r1 = r0.field_fileFullPath
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r1 == 0) goto L_0x0282
            if (r21 == 0) goto L_0x014f
            lv0.l$a r8 = new lv0.l$a
            java.lang.String r1 = r0.field_fileFullPath
            r4 = 7
            r7 = 0
            r0 = r8
            r2 = r20
            r3 = r24
            r5 = r21
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r0 = lv0.C99661l.m130077a(r8)
            goto L_0x0281
        L_0x014f:
            int r1 = yu0.C102910f.f303738g
            if (r1 != r11) goto L_0x018e
            int r1 = r15.f195594l
            int r1 = r1 / 1024
            long r1 = (long) r1
            int r3 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r3 < 0) goto L_0x018e
            java.lang.String r1 = r15.f195622s
            if (r1 == 0) goto L_0x018e
            pv0.x r7 = new pv0.x
            r7.<init>()
            r6 = 1
            lv0.l$a r8 = new lv0.l$a
            java.lang.String r1 = r0.field_fileFullPath
            r4 = 7
            r0 = r8
            r2 = r20
            r3 = r24
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r0 = lv0.C99661l.m130077a(r8)
            int r14 = r14 + r0
            if (r10 == 0) goto L_0x0282
            lv0.k$a r0 = new lv0.k$a
            r0.<init>()
            long r1 = r22.mo108774y2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r10.put(r1, r0)
            goto L_0x0282
        L_0x018e:
            lv0.l$a r8 = new lv0.l$a
            java.lang.String r1 = r0.field_fileFullPath
            r4 = 7
            r7 = 0
            r0 = r8
            r2 = r20
            r3 = r24
            r5 = r21
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r0 = lv0.C99661l.m130077a(r8)
            goto L_0x0281
        L_0x01a6:
            com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent r0 = new com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent
            r0.<init>()
            com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent$a r1 = r0.f265003d
            java.lang.String r2 = r15.f195571f0
            r1.f265005a = r2
            long r2 = r22.getMsgId()
            r1.f265006b = r2
            r0.publish()
            java.lang.Object[] r1 = new java.lang.Object[r11]
            com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent$b r2 = r0.f265004e
            java.lang.String r2 = r2.f265007a
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "pathList:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r2, r1)
            com.tencent.mm.autogen.events.QueryRecordMsgMediaListEvent$b r0 = r0.f265004e
            java.lang.String r0 = r0.f265007a
            java.lang.String r1 = ":"
            java.lang.String[] r10 = r0.split(r1)
            r15 = r14
            r14 = 0
        L_0x01d5:
            int r0 = r10.length
            if (r14 >= r0) goto L_0x0220
            r0 = r10[r14]
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x01e1
            goto L_0x021d
        L_0x01e1:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r1 = r10[r14]
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r11] = r1
            java.lang.String r1 = "record file exit:%s, index:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r0)
            lv0.l$a r16 = new lv0.l$a
            r1 = r10[r14]
            r4 = 7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "_fav."
            r0.append(r2)
            r0.append(r14)
            java.lang.String r6 = r0.toString()
            r8 = 0
            r0 = r16
            r2 = r20
            r3 = r24
            r5 = r21
            r7 = r26
            r0.<init>((java.lang.String) r1, (te3.C77926f9) r2, (java.util.LinkedList<pv0.C100968x>) r3, (int) r4, (boolean) r5, (java.lang.String) r6, (boolean) r7, (pv0.C100968x) r8)
            int r0 = lv0.C99661l.m130077a(r16)
            int r15 = r15 + r0
        L_0x021d:
            int r14 = r14 + 1
            goto L_0x01d5
        L_0x0220:
            r12 = r15
            goto L_0x0283
        L_0x0222:
            java.lang.String r0 = r15.f195606o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0282
            ov0.d r0 = ov0.C100546d.m131563g()
            ov0.g r0 = r0.mo139995h()
            com.tencent.mm.pluginsdk.model.app.e r0 = r0.mo140004d()
            java.lang.String r1 = r15.f195606o
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100154qq(r1)
            if (r0 == 0) goto L_0x0244
            boolean r1 = r0.mo100146l2()
            if (r1 != 0) goto L_0x0250
        L_0x0244:
            int r1 = r22.mo108769t2()
            if (r1 != r11) goto L_0x0282
            if (r0 == 0) goto L_0x0282
            boolean r1 = r0.field_isUpload
            if (r1 == 0) goto L_0x0282
        L_0x0250:
            java.lang.String r1 = r0.field_fileFullPath
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r0 == 0) goto L_0x0282
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "image "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            lv0.l$a r8 = new lv0.l$a
            r4 = 8
            r7 = 0
            r0 = r8
            r2 = r20
            r3 = r24
            r5 = r21
            r6 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            int r0 = lv0.C99661l.m130077a(r8)
        L_0x0281:
            int r14 = r14 + r0
        L_0x0282:
            r12 = r14
        L_0x0283:
            return r12
        L_0x0284:
            java.lang.String r0 = r22.getContent()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x0290
            r3 = 0
            goto L_0x0299
        L_0x0290:
            java.lang.String r0 = r22.getContent()
            byte[] r0 = r0.getBytes()
            int r3 = r0.length
        L_0x0299:
            if (r21 == 0) goto L_0x029f
            r24 = r3
            goto L_0x061d
        L_0x029f:
            java.lang.String r0 = r22.getContent()
            java.lang.Class<gw0.b> r2 = gw0.C76073b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            gw0.b r2 = (gw0.C76073b) r2
            s90.f r2 = r2.mo94597JZ(r4, r0)
            lv0.b r4 = new lv0.b
            r4.<init>(r0)
            boolean r0 = r4.f292063b
            java.lang.String r5 = "MicroMsg.AppmsgConvert"
            if (r0 != 0) goto L_0x02c4
            java.lang.String r0 = "buffer error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
            r24 = r3
            r0 = r6
            goto L_0x0605
        L_0x02c4:
            lv0.c r0 = new lv0.c
            r0.<init>()
            java.util.LinkedList<s90.j> r7 = r2.f226295i
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0.mo139031c(r1)
            java.util.Map<java.lang.String, java.lang.String> r10 = r4.f292062a
            java.lang.String r11 = ".msg.appmsg.$appid"
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "appid"
            r8.put(r11, r10)
            java.util.Map<java.lang.String, java.lang.String> r10 = r4.f292062a
            java.lang.String r11 = ".msg.appmsg.$sdkver"
            java.lang.Object r10 = r10.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "sdkver"
            r8.put(r11, r10)
            java.lang.String r10 = "appmsg"
            r0.mo139032d(r10, r8)
            if (r7 != 0) goto L_0x02fe
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
        L_0x02fe:
            int r11 = r7.size()
            if (r11 != 0) goto L_0x0309
            r11 = r6
            r13 = r11
            r14 = r13
            r12 = 0
            goto L_0x032a
        L_0x0309:
            r12 = 0
            java.lang.Object r11 = r7.get(r12)
            s90.j r11 = (s90.C77630j) r11
            java.lang.String r11 = r11.f226325d
            java.lang.Object r13 = r7.get(r12)
            s90.j r13 = (s90.C77630j) r13
            java.lang.String r13 = r13.f226326e
            java.lang.Object r14 = r7.get(r12)
            s90.j r14 = (s90.C77630j) r14
            java.lang.String r14 = r14.f226330i
            java.lang.Object r14 = r7.get(r12)
            s90.j r14 = (s90.C77630j) r14
            java.lang.String r14 = r14.f226332n
        L_0x032a:
            java.lang.String r15 = "title"
            r0.mo139029a(r15, r11)
            java.util.Map<java.lang.String, java.lang.String> r11 = r4.f292062a
            java.lang.String r12 = ".msg.appmsg.des"
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "des"
            r0.mo139029a(r12, r11)
            java.util.Map<java.lang.String, java.lang.String> r11 = r4.f292062a
            java.lang.String r12 = ".msg.appmsg.action"
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "action"
            r0.mo139029a(r12, r11)
            java.lang.String r11 = ".msg.appmsg.type"
            int r11 = r4.mo139028a(r11)
            java.lang.String r12 = "type"
            r0.mo139031c(r12)
            r24 = r3
            java.lang.StringBuffer r3 = r0.f292064a
            r3.append(r11)
            r0.mo139030b(r12)
            java.lang.String r3 = ".msg.appmsg.showtype"
            int r3 = r4.mo139028a(r3)
            java.lang.String r11 = "showtype"
            r0.mo139031c(r11)
            java.lang.StringBuffer r9 = r0.f292064a
            r9.append(r3)
            r0.mo139030b(r11)
            java.util.Map<java.lang.String, java.lang.String> r3 = r4.f292062a
            java.lang.String r9 = ".msg.appmsg.content"
            java.lang.Object r3 = r3.get(r9)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r9 = "content"
            r0.mo139029a(r9, r3)
            java.lang.String r3 = "url"
            r0.mo139029a(r3, r13)
            java.util.Map<java.lang.String, java.lang.String> r9 = r4.f292062a
            java.lang.String r11 = ".msg.appmsg.lowurl"
            java.lang.Object r9 = r9.get(r11)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r11 = "lowurl"
            r0.mo139029a(r11, r9)
            java.lang.String r9 = "appattach"
            r0.mo139031c(r9)
            java.lang.String r11 = ".msg.appmsg.appattach.totallen"
            int r11 = r4.mo139028a(r11)
            java.lang.String r13 = "totallen"
            r0.mo139031c(r13)
            r21 = r5
            java.lang.StringBuffer r5 = r0.f292064a
            r5.append(r11)
            r0.mo139030b(r13)
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.f292062a
            java.lang.String r11 = ".msg.appmsg.appattach.attachid"
            java.lang.Object r5 = r5.get(r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r11 = "attachid"
            r0.mo139029a(r11, r5)
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.f292062a
            java.lang.String r11 = ".msg.appmsg.appattach.fileext"
            java.lang.Object r5 = r5.get(r11)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r11 = "fileext"
            r0.mo139029a(r11, r5)
            r0.mo139030b(r9)
            java.lang.String r5 = "mmreader"
            r0.mo139031c(r5)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r11 = r2.f226290d
            r9.append(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            r8.put(r12, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r11 = r7.size()
            r9.append(r11)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            java.lang.String r11 = "convMsgCount"
            r8.put(r11, r9)
            java.lang.String r9 = "category"
            r0.mo139032d(r9, r8)
            java.lang.String r8 = r2.f226293g
            java.lang.String r11 = "name"
            r0.mo139029a(r11, r8)
            java.lang.String r8 = "topnew"
            r0.mo139031c(r8)
            java.util.Map<java.lang.String, java.lang.String> r12 = r4.f292062a
            java.lang.String r13 = ".msg.appmsg.mmreader.category.topnew.cover"
            java.lang.Object r12 = r12.get(r13)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "cover"
            r0.mo139029a(r13, r12)
            java.util.Map<java.lang.String, java.lang.String> r12 = r4.f292062a
            r16 = r1
            java.lang.String r1 = ".msg.appmsg.mmreader.category.topnew.width"
            java.lang.Object r1 = r12.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r12 = "width"
            r0.mo139029a(r12, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.f292062a
            java.lang.String r12 = ".msg.appmsg.mmreader.category.topnew.height"
            java.lang.Object r1 = r1.get(r12)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r12 = "height"
            r0.mo139029a(r12, r1)
            java.lang.String r1 = "digest"
            r0.mo139029a(r1, r14)
            r0.mo139030b(r8)
            r8 = 0
        L_0x0457:
            int r12 = r7.size()
            if (r8 >= r12) goto L_0x0569
            java.lang.String r12 = "item"
            r0.mo139031c(r12)
            java.lang.Object r14 = r7.get(r8)
            if (r14 != 0) goto L_0x0473
            r25 = r5
            r26 = r9
            r22 = r10
            r10 = r11
            r5 = r2
            goto L_0x055d
        L_0x0473:
            java.lang.Object r14 = r7.get(r8)
            s90.j r14 = (s90.C77630j) r14
            java.lang.String r14 = r14.f226325d
            java.lang.Object r17 = r7.get(r8)
            r22 = r10
            r10 = r17
            s90.j r10 = (s90.C77630j) r10
            java.lang.String r10 = r10.f226326e
            java.lang.Object r17 = r7.get(r8)
            r25 = r5
            r5 = r17
            s90.j r5 = (s90.C77630j) r5
            java.lang.String r5 = r5.f226327f
            java.lang.Object r17 = r7.get(r8)
            r26 = r9
            r9 = r17
            s90.j r9 = (s90.C77630j) r9
            java.lang.String r9 = r9.f226328g
            r27 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.Object r17 = r7.get(r8)
            r28 = r11
            r11 = r17
            s90.j r11 = (s90.C77630j) r11
            r18 = r1
            r17 = r2
            long r1 = r11.f226329h
            r12.append(r1)
            r12.append(r6)
            java.lang.String r1 = r12.toString()
            java.lang.Object r2 = r7.get(r8)
            s90.j r2 = (s90.C77630j) r2
            java.lang.String r2 = r2.f226330i
            java.lang.Object r11 = r7.get(r8)
            s90.j r11 = (s90.C77630j) r11
            java.lang.String r11 = r11.f226331j
            java.lang.Object r12 = r7.get(r8)
            s90.j r12 = (s90.C77630j) r12
            java.lang.String r12 = r12.f226332n
            r0.mo139029a(r15, r14)
            r0.mo139029a(r3, r10)
            java.lang.String r10 = "shorturl"
            r0.mo139029a(r10, r5)
            java.lang.String r5 = "longurl"
            r0.mo139029a(r5, r9)
            java.lang.String r5 = "pub_time"
            r0.mo139029a(r5, r1)
            r0.mo139029a(r13, r2)
            java.lang.String r1 = "tweetid"
            r0.mo139029a(r1, r11)
            r1 = r18
            r0.mo139029a(r1, r12)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = ".msg.appmsg.mmreader.category.item"
            r2.append(r5)
            if (r8 != 0) goto L_0x050c
            r5 = r6
            goto L_0x051b
        L_0x050c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
        L_0x051b:
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.f292062a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r2)
            java.lang.String r2 = ".fileid"
            r9.append(r2)
            java.lang.String r2 = r9.toString()
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r5 = "fileid"
            r0.mo139029a(r5, r2)
            java.lang.String r2 = "source"
            r0.mo139031c(r2)
            r0.mo139031c(r2)
            r5 = r17
            java.lang.String r9 = r5.f226293g
            r10 = r28
            r0.mo139029a(r10, r9)
            r0.mo139030b(r2)
            r0.mo139030b(r2)
            r2 = r27
            r0.mo139030b(r2)
        L_0x055d:
            int r8 = r8 + 1
            r9 = r26
            r2 = r5
            r11 = r10
            r10 = r22
            r5 = r25
            goto L_0x0457
        L_0x0569:
            r25 = r5
            r22 = r10
            r5 = r2
            r2 = r9
            r0.mo139030b(r2)
            java.lang.String r1 = "publisher"
            r0.mo139031c(r1)
            java.lang.String r2 = r5.f226292f
            java.lang.String r3 = "convName"
            r0.mo139029a(r3, r2)
            java.lang.String r2 = r5.f226293g
            java.lang.String r3 = "nickname"
            r0.mo139029a(r3, r2)
            r0.mo139030b(r1)
            r1 = r25
            r0.mo139030b(r1)
            r1 = r22
            r0.mo139030b(r1)
            java.lang.String r1 = r5.f226292f
            java.lang.String r2 = "fromusername"
            r0.mo139029a(r2, r1)
            java.lang.String r1 = ".msg.scene"
            int r1 = r4.mo139028a(r1)
            java.lang.String r2 = "scene"
            r0.mo139031c(r2)
            java.lang.StringBuffer r3 = r0.f292064a
            r3.append(r1)
            r0.mo139030b(r2)
            java.lang.String r1 = "appinfo"
            r0.mo139031c(r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.f292062a
            java.lang.String r3 = ".msg.appinfo.appname"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "version"
            r0.mo139029a(r3, r2)
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.f292062a
            java.lang.String r3 = ".msg.appinfo.version"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "appname"
            r0.mo139029a(r3, r2)
            r0.mo139030b(r1)
            java.lang.String r1 = r5.f226294h
            java.lang.String r2 = "commenturl"
            r0.mo139029a(r2, r1)
            r1 = r16
            r0.mo139030b(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "xml "
            r1.append(r2)
            java.lang.StringBuffer r2 = r0.f292064a
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            java.lang.StringBuffer r0 = r0.f292064a
            java.lang.String r0 = r0.toString()
        L_0x0605:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x060d
            r12 = 0
            goto L_0x061f
        L_0x060d:
            te3.rv3 r1 = new te3.rv3
            r1.<init>()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r6)
            r1.mo73357f(r0)
            r9 = r20
            r9.f227337h = r1
        L_0x061d:
            r12 = r24
        L_0x061f:
            return r12
        L_0x0620:
            java.lang.String r0 = r22.getContent()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x062c
            r10 = 0
            goto L_0x0636
        L_0x062c:
            java.lang.String r0 = r22.getContent()
            byte[] r0 = r0.getBytes()
            int r3 = r0.length
            r10 = r3
        L_0x0636:
            java.lang.String r0 = r22.getContent()
            if (r0 != 0) goto L_0x063e
            goto L_0x06f3
        L_0x063e:
            java.lang.String r0 = r22.getContent()
            com.tencent.mm.storage.o2 r3 = new com.tencent.mm.storage.o2
            r3.<init>(r0)
            java.lang.String r0 = r3.f212823f
            java.lang.String r0 = r0.trim()
            r3 = 60
            if (r0 != 0) goto L_0x0652
            goto L_0x0666
        L_0x0652:
            int r8 = r0.indexOf(r3)
            if (r8 <= 0) goto L_0x065d
            java.lang.String r8 = r0.substring(r8)
            goto L_0x065e
        L_0x065d:
            r8 = r0
        L_0x065e:
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r8, r1, r2)
            if (r8 == 0) goto L_0x0666
            r8 = 1
            goto L_0x0667
        L_0x0666:
            r8 = 0
        L_0x0667:
            if (r8 != 0) goto L_0x06a2
            java.lang.String r0 = r22.getContent()
            if (r0 != 0) goto L_0x0670
            goto L_0x0684
        L_0x0670:
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x067b
            java.lang.String r3 = r0.substring(r3)
            goto L_0x067c
        L_0x067b:
            r3 = r0
        L_0x067c:
            java.util.Map r1 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r1, r2)
            if (r1 == 0) goto L_0x0684
            r3 = 1
            goto L_0x0685
        L_0x0684:
            r3 = 0
        L_0x0685:
            if (r3 != 0) goto L_0x06a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get xml error "
            r1.append(r2)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
            r12 = 0
            goto L_0x073b
        L_0x06a2:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x073a
            te3.rv3 r1 = new te3.rv3
            r1.<init>()
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r6)
            r1.mo73357f(r3)
            r9.f227337h = r1
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r2)
            ov0.d r1 = ov0.C100546d.m131563g()
            ov0.g r1 = r1.mo139995h()
            java.lang.String r1 = r1.mo140003c()
            ov0.d r2 = ov0.C100546d.m131563g()
            ov0.g r2 = r2.mo139995h()
            com.tencent.mm.modelimage.m r2 = r2.mo140007g()
            java.lang.String r3 = r22.mo108765s2()
            java.lang.String r2 = r2.v10(r3, r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r0 = r0.f195610p
            r3.append(r0)
            java.lang.String r11 = r3.toString()
            long r0 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x06f5
        L_0x06f3:
            r12 = -1
            goto L_0x073b
        L_0x06f5:
            lv0.l$a r12 = new lv0.l$a
            r4 = 6
            r8 = 0
            java.lang.String r6 = "_thumb"
            r0 = r12
            r1 = r2
            r2 = r20
            r3 = r24
            r5 = r21
            r7 = r26
            r0.<init>((java.lang.String) r1, (te3.C77926f9) r2, (java.util.LinkedList<pv0.C100968x>) r3, (int) r4, (boolean) r5, (java.lang.String) r6, (boolean) r7, (pv0.C100968x) r8)
            int r0 = lv0.C99661l.m130077a(r12)
            int r10 = r10 + r0
            te3.rv3 r0 = r9.f227337h
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            com.tencent.mm.storage.o2 r1 = new com.tencent.mm.storage.o2
            r1.<init>(r0)
            ov0.d r0 = ov0.C100546d.m131563g()
            ov0.g r0 = r0.mo139995h()
            wh3.g r0 = r0.mo140006f()
            java.lang.String r1 = r1.f212821d
            com.tencent.mm.storage.emotion.EmojiInfo r8 = r0.mo142044TO(r1)
            lv0.l$a r12 = new lv0.l$a
            r4 = 5
            r7 = 0
            r0 = r12
            r1 = r11
            r6 = r26
            r0.<init>((java.lang.String) r1, (te3.C77926f9) r2, (java.util.LinkedList<pv0.C100968x>) r3, (int) r4, (boolean) r5, (boolean) r6, (pv0.C100968x) r7, (com.tencent.p014mm.storage.emotion.EmojiInfo) r8)
            int r0 = lv0.C99661l.m130077a(r12)
            int r10 = r10 + r0
        L_0x073a:
            r12 = r10
        L_0x073b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lv0.C99652d.mo139034b(te3.f9, boolean, com.tencent.mm.storage.f4, java.lang.String, java.util.LinkedList, java.util.HashMap, boolean, long):int");
    }
}
