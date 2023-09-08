package com.tencent.p014mm.pluginsdk.model.app;

import android.net.Uri;
import android.util.Pair;
import b63.C67186g0;
import com.tencent.p014mm.autogen.events.VoiceReminderDeleteRecordMessageEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.chatting.AppAttachNewDownloadUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86312j;
import e63.C75562i;
import eb0.C31543z5;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import g62.C75875l;
import h81.C32735h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import mh0.C99877f0;
import ob0.C35136m;
import ob0.C35141t;
import p1081gi.C98124g;
import p158gt.C98201k;
import p287zz.C79442f;
import p663qo.C101213l;
import p749xh.C38557f0;
import p763ym.C53543s;
import p872ah.C67046a;
import qg2.C101147j0;
import qg2.C77334n;
import sf0.C77702q0;
import t90.C77878b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.pluginsdk.model.app.q */
public class C72689q implements C35141t {

    /* renamed from: d */
    public static final Map<String, List<WeakReference<C67046a>>> f211498d = new HashMap();

    /* renamed from: D */
    public static String m85025D(String str, String str2, String str3) {
        int t;
        if (Util.isNullOrNil(str3)) {
            return null;
        }
        if (C72996z1.m85820U5(str) && (t = C75604z3.m90848t(str3)) != -1) {
            str3 = (str3 + " ").substring(t + 2).trim();
        }
        return Util.processXml(str3);
    }

    /* renamed from: S */
    public static void m85026S(C72963f4 f4Var, C68070l.C68072b bVar, int i) {
        if (f4Var != null && bVar != null) {
            long y2 = f4Var.mo108774y2();
            C77878b bVar2 = (C77878b) bVar.mo93555w(C77878b.class);
            if (bVar2 != null) {
                long j = bVar2.f226901b;
                if (j != 0) {
                    y2 = j;
                }
            }
            Object[] objArr = new Object[13];
            objArr[0] = bVar.f195500J;
            objArr[1] = Integer.valueOf(bVar.f195626t == 1 ? 7 : 5);
            objArr[2] = Integer.valueOf(bVar.f195594l);
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Long.valueOf((C31543z5.m39453c() - f4Var.getCreateTime()) / 1000);
            objArr[5] = Util.nullAsNil(bVar.f195602n).toLowerCase();
            objArr[6] = f4Var.mo108768t();
            objArr[7] = 1;
            objArr[8] = "";
            objArr[9] = Long.valueOf(y2);
            objArr[10] = Long.valueOf(f4Var.getCreateTime());
            objArr[11] = Long.valueOf(C31543z5.m39451a());
            objArr[12] = 1;
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr);
            Log.m105925i("MicroMsg.AppMessageExtension", "reportKVStat 14665 %s", format);
            C115669n.INSTANCE.kvStat(14665, format);
        }
    }

    /* renamed from: d */
    public static void m85027d(String str) {
        C67046a aVar;
        Map<String, List<WeakReference<C67046a>>> map = f211498d;
        synchronized (map) {
            List list = (List) ((HashMap) map).get(str);
            for (int i = 0; i < list.size(); i++) {
                WeakReference weakReference = (WeakReference) list.get(i);
                if (!(weakReference == null || (aVar = (C67046a) weakReference.get()) == null)) {
                    aVar.mo91031z1();
                }
            }
            ((HashMap) f211498d).remove(str);
        }
    }

    /* renamed from: f0 */
    public static Pair<Boolean, String> m85028f0(C72963f4 f4Var, boolean z) {
        String content = f4Var.getContent();
        if (C72996z1.m85820U5(f4Var.mo108768t()) && f4Var.mo108769t2() == 0) {
            content = C75604z3.m90849u(f4Var.getContent());
        }
        C116281f0.C116288h hVar = null;
        C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
        C72683d Q7 = AppAttachNewDownloadUI.m21357Q7(u.f195582i, f4Var.getMsgId(), u.f195606o, content);
        boolean z2 = true;
        boolean z3 = false;
        if (Q7 == null) {
            C72695v.m85072n(f4Var.getMsgId(), content, (String) null);
            Q7 = AppAttachNewDownloadUI.m21357Q7(u.f195582i, f4Var.getMsgId(), u.f195606o, content);
            if (Q7 != null) {
                Object[] objArr = new Object[8];
                objArr[0] = Long.valueOf(Q7.systemRowid);
                objArr[1] = Long.valueOf(Q7.field_totalLen);
                objArr[2] = Q7.field_fileFullPath;
                objArr[3] = Long.valueOf(Q7.field_type);
                objArr[4] = Q7.field_mediaId;
                objArr[5] = Long.valueOf(Q7.field_msgInfoId);
                objArr[6] = Boolean.valueOf(Q7.field_isUpload);
                String str = Q7.field_signature;
                objArr[7] = Integer.valueOf(str == null ? -1 : str.length());
                Log.m105925i("MicroMsg.AppMessageExtension", "summerapp tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", objArr);
                if (u.f195626t != 0 || u.f195594l > 26214400) {
                    z2 = true ^ C77702q0.m93719b(Q7.field_signature);
                }
            }
        } else {
            Uri n = C116299g2.m163858n(Q7.field_fileFullPath);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            if (Q7.field_status == 199) {
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    Log.m105924i("MicroMsg.AppMessageExtension", "summerapp tryInitAttachInfo info exist but file not!");
                    C72695v.m85072n(f4Var.getMsgId(), content, (String) null);
                }
                hVar = l;
            }
            Object[] objArr2 = new Object[10];
            objArr2[0] = Long.valueOf(Q7.systemRowid);
            objArr2[1] = Long.valueOf(Q7.field_totalLen);
            objArr2[2] = Q7.field_fileFullPath;
            objArr2[3] = Long.valueOf(Q7.field_type);
            objArr2[4] = Q7.field_mediaId;
            objArr2[5] = Long.valueOf(Q7.field_msgInfoId);
            objArr2[6] = Boolean.valueOf(Q7.field_isUpload);
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, hVar);
            objArr2[7] = Boolean.valueOf(!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b));
            objArr2[8] = Long.valueOf(Q7.field_status);
            String str2 = Q7.field_signature;
            objArr2[9] = Integer.valueOf(str2 == null ? -1 : str2.length());
            Log.m105925i("MicroMsg.AppMessageExtension", "summerapp tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", objArr2);
        }
        C72683d dVar = Q7;
        if (z || (u.f195626t == 0 && u.f195594l <= 26214400)) {
            z3 = z2;
        }
        if (!z && !z3) {
            String nullAsNil = Util.nullAsNil(u.f195570f);
            String lowerCase = Util.nullAsNil(u.f195602n).toLowerCase();
            if (Util.isNullOrNil(lowerCase)) {
                lowerCase = C86013q1.m106454o(nullAsNil);
            }
            C97625j3.m125815e().mo123460f(new C77334n(dVar, Util.nullAsNil(u.f195524R), Util.nullAsNil(u.f195622s), nullAsNil, lowerCase, Util.nullAsNil(u.f195488G), true));
        }
        return new Pair<>(Boolean.valueOf(z3), u.f195606o);
    }

    /* renamed from: q */
    public static void m85029q(C75875l lVar, C72963f4 f4Var) {
        Log.m105925i("MicroMsg.AppMessageExtension", "autoDownloadFile1 %s %s", Long.valueOf(f4Var.mo108774y2()), Long.valueOf(f4Var.getMsgId()));
        ((C119157j) C119157j.f356862d).mo183875f(new q$$e(f4Var));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v46, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v95, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v100, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v103, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v104, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v105, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v106, resolved type: com.tencent.mm.pluginsdk.model.app.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v107, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v49, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v109, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v115, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v53, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v117, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v119, resolved type: com.tencent.mm.storage.f4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v54, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r2v7, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r4v34 */
    /* JADX WARNING: type inference failed for: r4v35 */
    /* JADX WARNING: type inference failed for: r4v37 */
    /* JADX WARNING: type inference failed for: r4v45, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v52, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v55 */
    /* JADX WARNING: type inference failed for: r4v56 */
    /* JADX WARNING: type inference failed for: r4v57 */
    /* JADX WARNING: type inference failed for: r2v26 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r4v110 */
    /* JADX WARNING: type inference failed for: r4v111 */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0772, code lost:
        r8.mo108735O2(r8.mo108762o2() | 8);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, "check c2c payer list, myself is payer, add red flag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0785, code lost:
        r4 = r45;
        r7 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        r4.mo100160g0(true, r8.mo108768t());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x087a, code lost:
        r0 = e;
        r7 = r7;
        r4 = r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v3, types: [boolean, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0686  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x069a  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0741 A[SYNTHETIC, Splitter:B:201:0x0741] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x07a3 A[Catch:{ Exception -> 0x087a }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x089e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x08ab  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x08e1  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x08f8  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0912 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0914  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02e6  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ob0.C35136m.C35139b mo100157B(ob0.C35136m.C35137a r46, java.lang.String r47, com.tencent.p014mm.message.C68070l.C68072b r48) {
        /*
            r45 = this;
            r13 = r45
            r14 = r46
            r15 = r47
            r12 = r48
            java.lang.Class<gt.k> r1 = p158gt.C98201k.class
            java.lang.Class<f62.y> r16 = f62.C31955y.class
            java.lang.Class<com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation> r0 = com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation.class
            te3.j3 r11 = r14.f94242a
            eb0.c r2 = eb0.C97625j3.m125812b()
            g62.l r2 = r2.mo105911z()
            eb0.c r3 = eb0.C97625j3.m125812b()
            g62.p r3 = r3.mo105877C()
            java.lang.String r4 = eb0.C75592q0.m90789s()
            te3.rv3 r5 = r11.f227628e
            java.lang.String r10 = sf0.C48374j0.m53718g(r5)
            te3.rv3 r5 = r11.f227629f
            java.lang.String r17 = sf0.C48374j0.m53718g(r5)
            com.tencent.mm.storage.s4 r3 = (com.tencent.p014mm.storage.C44667s4) r3
            boolean r3 = r3.mo69822qq(r10)
            if (r3 != 0) goto L_0x0041
            boolean r3 = r4.equals(r10)
            if (r3 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r7 = 0
            goto L_0x0042
        L_0x0041:
            r7 = 1
        L_0x0042:
            java.lang.String r3 = r11.f227636p
            eb0.z3$$h r6 = eb0.C75604z3.m90851w(r3)
            if (r6 == 0) goto L_0x004e
            java.lang.String r3 = r6.f222094a
            r4 = r3
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85839j5(r4)
            java.lang.String r5 = "notifymessage"
            if (r3 == 0) goto L_0x0059
            r3 = r5
            goto L_0x005f
        L_0x0059:
            if (r7 == 0) goto L_0x005e
            r3 = r17
            goto L_0x005f
        L_0x005e:
            r3 = r10
        L_0x005f:
            long r8 = r11.f227638r
            com.tencent.mm.storage.g4 r2 = (com.tencent.p014mm.storage.C72972g4) r2
            com.tencent.mm.storage.f4 r8 = r2.h30(r3, r8)
            int r9 = r8.f230723F
            r21 = r4
            r4 = 4
            r9 = r9 & r4
            java.lang.String r14 = "MicroMsg.AppMessageExtension"
            r13 = 2
            if (r9 != r4) goto L_0x0091
            java.lang.Object[] r0 = new java.lang.Object[r13]
            long r1 = r11.f227638r
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9 = 0
            r0[r9] = r1
            long r1 = r8.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r20 = 1
            r0[r20] = r1
            java.lang.String r1 = "dkmsgid doInsertMessage already revoke svrid:%d localid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r0)
        L_0x008e:
            r5 = 0
            goto L_0x031f
        L_0x0091:
            r9 = 0
            r20 = 1
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r22 = r14
            long r13 = r11.f227638r
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r4[r9] = r13
            long r13 = r8.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r4[r20] = r9
            java.lang.String r9 = "dkmsgid doInsertMessage svrid:%d localid:%d"
            r13 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r9, r4)
            long r24 = r8.getMsgId()
            r14 = r10
            r9 = 0
            int r4 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x00fc
            long r24 = r8.getCreateTime()
            r26 = 604800000(0x240c8400, double:2.988109026E-315)
            long r24 = r24 + r26
            int r4 = r11.f227635o
            long r9 = (long) r4
            long r9 = eb0.C75604z3.m90841m(r3, r9)
            int r4 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x00fa
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r10 = r5
            long r4 = r11.f227638r
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r9[r5] = r4
            long r4 = r8.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 1
            r9[r5] = r4
            java.lang.String r4 = "dkmsgid doInsertMessage msg Too Old Remove it. svrid:%d localid:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r4, r9)
            long r4 = r8.getMsgId()
            eb0.C75604z3.m90834f(r4)
            r4 = 0
            r8.setMsgId(r4)
            goto L_0x0101
        L_0x00fa:
            r10 = r5
            goto L_0x0101
        L_0x00fc:
            r43 = r9
            r10 = r5
            r4 = r43
        L_0x0101:
            long r4 = r11.f227638r
            long r24 = r8.getMsgId()
            java.lang.String r9 = ""
            r22 = r14
            r14 = 6
            r26 = 0
            int r28 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r28 != 0) goto L_0x02f3
            r24 = r4
            int r4 = r12.f195582i
            java.lang.String r5 = "doInsertMessage fail, %s has exist, overwriteNewMsgId:%s"
            if (r4 != r14) goto L_0x026d
            di3.d r4 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation r4 = (com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation) r4
            xh3.b r4 = r4.vx0()
            long r14 = r11.f227638r
            xh3.a r4 = r4.mo61737jo(r14)
            if (r4 == 0) goto L_0x0146
            r14 = 2
            java.lang.Object[] r0 = new java.lang.Object[r14]
            long r1 = r11.f227638r
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r4.field_overwriteNewMsgId
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r5, r0)
            goto L_0x008e
        L_0x0146:
            java.lang.Class<t90.b> r4 = t90.C77878b.class
            com.tencent.mm.message.g r4 = r12.mo93555w(r4)
            t90.b r4 = (t90.C77878b) r4
            if (r4 == 0) goto L_0x0266
            long r14 = r4.f226901b
            r26 = 0
            int r5 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r5 == 0) goto L_0x0266
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            k40.a r5 = f40.C86709a0.m107533q(r5)
            f62.k0 r5 = (f62.C75700k0) r5
            g62.l r5 = r5.mo96095LE()
            long r14 = r4.f226901b
            com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
            boolean r5 = r5.py0(r14)
            if (r5 == 0) goto L_0x0175
            java.lang.String r0 = "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x008e
        L_0x0175:
            long r14 = r4.f226901b
            com.tencent.mm.storage.f4 r8 = r2.h30(r3, r14)
            xh3.a r5 = new xh3.a
            r5.<init>()
            long r14 = r8.getMsgId()
            r26 = 0
            int r29 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r29 == 0) goto L_0x01f9
            boolean r14 = r8.mo101020w3()
            if (r14 != 0) goto L_0x01b0
            r14 = 2
            java.lang.Object[] r0 = new java.lang.Object[r14]
            long r1 = r8.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r8.getType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "ignore, because msg(%s) type:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r1, r0)
            goto L_0x008e
        L_0x01b0:
            long r14 = r11.f227638r
            r8.mo108745Y2(r14)
            long r14 = r4.f226901b
            r29 = r2
            int r2 = r8.f230742Z
            r30 = r6
            r6 = 1
            if (r2 != r6) goto L_0x01c2
            r2 = 1
            goto L_0x01c3
        L_0x01c2:
            r2 = 0
        L_0x01c3:
            java.lang.String r6 = r8.getContent()
            r24 = r2
            r2 = 0
            com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r2)
            if (r6 == 0) goto L_0x01f3
            java.lang.String r2 = r6.f195645x2
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x01f3
            java.lang.String r2 = r6.f195645x2
            java.lang.String r6 = ";"
            java.lang.String[] r2 = r2.split(r6)
            if (r2 == 0) goto L_0x01f3
            int r6 = r2.length
            r31 = r10
            r10 = 2
            if (r6 != r10) goto L_0x01f5
            r6 = 0
            r10 = r2[r6]
            r5.field_cgi = r10
            r6 = 1
            r2 = r2[r6]
            r5.field_aeskey = r2
            goto L_0x01f5
        L_0x01f3:
            r31 = r10
        L_0x01f5:
            r32 = r14
            r2 = 0
            goto L_0x0204
        L_0x01f9:
            r29 = r2
            r30 = r6
            r31 = r10
            r32 = r24
            r2 = 1
            r24 = 0
        L_0x0204:
            long r14 = r11.f227638r
            r5.field_msgSvrId = r14
            long r14 = r4.f226901b
            r5.field_overwriteNewMsgId = r14
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation r0 = (com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation) r0
            xh3.b r0 = r0.vx0()
            boolean r0 = r0.insert(r5)
            r6 = 8
            java.lang.Object[] r10 = new java.lang.Object[r6]
            java.lang.String r6 = r4.f226902c
            r14 = 0
            r10[r14] = r6
            long r14 = r4.f226901b
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r6 = 1
            r10[r6] = r4
            long r14 = r8.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r14)
            r6 = 2
            r10[r6] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r6 = 3
            r10[r6] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r24)
            r6 = 4
            r10[r6] = r4
            r4 = 5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10[r4] = r0
            java.lang.String r0 = r5.field_cgi
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r9)
            r4 = 6
            r10[r4] = r0
            r0 = 7
            java.lang.String r4 = r5.field_aeskey
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r9)
            r10[r0] = r4
            java.lang.String r0 = "fileuploadtoken:%s overwrite_newmsgid:%s msgId:%s needCreate:%s needAutoDownloadFile:%s insertFileMsgInfo:%s cgi:%s aeskey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r10)
            r4 = r32
            goto L_0x02c3
        L_0x0266:
            r29 = r2
            r30 = r6
            r31 = r10
            goto L_0x02be
        L_0x026d:
            r29 = r2
            r30 = r6
            r31 = r10
            r2 = 74
            if (r4 != r2) goto L_0x02be
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x02a3 }
            com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation r0 = (com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation) r0     // Catch:{ Exception -> 0x02a3 }
            xh3.b r0 = r0.vx0()     // Catch:{ Exception -> 0x02a3 }
            long r14 = r11.f227638r     // Catch:{ Exception -> 0x02a3 }
            xh3.a r0 = r0.mo61736Lo(r14)     // Catch:{ Exception -> 0x02a3 }
            if (r0 == 0) goto L_0x02be
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x02a3 }
            long r14 = r0.field_msgSvrId     // Catch:{ Exception -> 0x02a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x02a3 }
            r6 = 0
            r4[r6] = r2     // Catch:{ Exception -> 0x02a3 }
            long r14 = r0.field_overwriteNewMsgId     // Catch:{ Exception -> 0x02a3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ Exception -> 0x02a3 }
            r2 = 1
            r4[r2] = r0     // Catch:{ Exception -> 0x02a3 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r5, r4)     // Catch:{ Exception -> 0x02a3 }
            r1 = 0
            return r1
        L_0x02a3:
            r0 = move-exception
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r5 = 0
            r4[r5] = r2
            java.lang.String r0 = r0.getMessage()
            r2 = 1
            r4[r2] = r0
            java.lang.String r0 = "doInsertMessage exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r4)
        L_0x02be:
            r4 = r24
            r2 = 1
            r24 = 0
        L_0x02c3:
            if (r2 == 0) goto L_0x02da
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            long r14 = r11.f227638r
            r0.mo108745Y2(r14)
            int r2 = r11.f227635o
            long r14 = (long) r2
            long r14 = eb0.C75604z3.m90841m(r3, r14)
            r0.mo108733M2(r14)
            r8 = r0
        L_0x02da:
            int r0 = r12.f195582i
            r2 = 74
            if (r0 == r2) goto L_0x02e6
            r2 = 6
            if (r0 != r2) goto L_0x02e4
            goto L_0x02e6
        L_0x02e4:
            r0 = 0
            goto L_0x02ec
        L_0x02e6:
            r2 = 1
            r8.f230741Y = r2
            r8.f230755r = r2
            r0 = 1
        L_0x02ec:
            r18 = r0
            r14 = r4
            r10 = r8
            r2 = 1
            r5 = 0
            goto L_0x0329
        L_0x02f3:
            r29 = r2
            r24 = r4
            r30 = r6
            r31 = r10
            int r0 = r12.f195582i
            r2 = 74
            if (r0 != r2) goto L_0x0320
            r2 = 2
            java.lang.Object[] r0 = new java.lang.Object[r2]
            long r1 = r11.f227638r
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            long r1 = r8.getMsgId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "doInsertMessage repeat receive msg(MM_APP_FILE_UPLOADING)(%s, %s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r1, r0)
            goto L_0x008e
        L_0x031f:
            return r5
        L_0x0320:
            r2 = 1
            r5 = 0
            r10 = r8
            r14 = r24
            r18 = 0
            r24 = 0
        L_0x0329:
            com.tencent.mm.message.l$b$a r0 = r12.f195554b
            if (r0 == 0) goto L_0x033d
            java.lang.String r0 = r0.f195654a
            r10.f230733Q = r0
            r10.f230755r = r2
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r2 = 0
            r4[r2] = r0
            java.lang.String r0 = "[chatting_exp] expidstr:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r4)
        L_0x033d:
            int r0 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85070l(r48)
            r10.setType(r0)
            int r0 = r12.f195582i
            r2 = 19
            if (r0 == r2) goto L_0x0361
            r2 = 24
            if (r0 != r2) goto L_0x034f
            goto L_0x0361
        L_0x034f:
            boolean r0 = r10.mo100967F3()
            if (r0 == 0) goto L_0x0358
            java.lang.String r0 = r12.f195598m
            goto L_0x035a
        L_0x0358:
            r0 = r47
        L_0x035a:
            r10.mo108732L2(r0)
            r8 = r47
            r2 = 1
            goto L_0x036b
        L_0x0361:
            r8 = r47
            r2 = 1
            java.lang.String r0 = qg2.C101164q0.m132678d(r2, r3, r7, r8)
            r10.mo108732L2(r0)
        L_0x036b:
            boolean r0 = r10.mo100967F3()
            if (r0 == 0) goto L_0x0377
            java.lang.String r0 = r12.f195642x
            r10.f230722E = r0
            r10.f230755r = r2
        L_0x0377:
            int r0 = r11.f227633j
            java.lang.String r2 = "new thumbnail saved, path "
            java.lang.String r6 = "get cdn image "
            r4 = 2
            if (r0 != r4) goto L_0x0577
            long r32 = r10.getMsgId()
            r25 = 0
            int r0 = (r32 > r25 ? 1 : (r32 == r25 ? 0 : -1))
            if (r0 != 0) goto L_0x0577
            int r0 = r10.getType()
            boolean r0 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85075q(r0)
            if (r0 != 0) goto L_0x0577
            int r0 = r12.f195582i
            if (r0 != r4) goto L_0x039a
            r0 = 1
            goto L_0x039b
        L_0x039a:
            r0 = 0
        L_0x039b:
            te3.qv3 r4 = r11.f227634n
            byte[] r4 = sf0.C48374j0.m53715d(r4)
            boolean r27 = sf0.C90188n0.f258956x
            if (r27 == 0) goto L_0x03ab
            java.lang.String r4 = "Test.useCdnDownThumb  set img buf null !!!!!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r4)
            r4 = r5
        L_0x03ab:
            boolean r27 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r4)
            if (r27 != 0) goto L_0x0445
            int r2 = r12.f195582i
            r6 = 33
            if (r2 == r6) goto L_0x03df
            r6 = 36
            if (r2 == r6) goto L_0x03df
            r6 = 46
            if (r2 == r6) goto L_0x03df
            r6 = 44
            if (r2 == r6) goto L_0x03df
            r6 = 48
            if (r2 != r6) goto L_0x03c8
            goto L_0x03df
        L_0x03c8:
            boolean r2 = r10.mo101022y3()
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            java.lang.String r0 = r1.zx0(r4, r0, r6, r2)
            goto L_0x03f3
        L_0x03df:
            di3.d r0 = di3.C86312j.m106911c(r1)
            gt.k r0 = (p158gt.C98201k) r0
            gt.m r0 = r0.mo137277xi()
            r1 = 100
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            com.tencent.mm.modelimage.m r0 = (com.tencent.p014mm.modelimage.C92839m) r0
            java.lang.String r0 = r0.yx0(r4, r1, r2)
        L_0x03f3:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x040f
            r4 = 1
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r10.getContent()
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r19 = 0
            r1[r19] = r2
            java.lang.String r2 = "thumbData MsgInfo content:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r2, r1)
            goto L_0x0412
        L_0x040f:
            r4 = 1
            r19 = 0
        L_0x0412:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x042f
            r10.mo108739S2(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "new thumbnail saved, path"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
        L_0x042f:
            r25 = r7
            r38 = r9
            r39 = r10
            r40 = r11
            r32 = r14
            r19 = r22
            r34 = r29
            r37 = r30
            r36 = r31
            r29 = r3
            goto L_0x0572
        L_0x0445:
            r19 = 0
            java.lang.String r4 = r12.f195503K
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0495
            java.lang.String r4 = r12.f195527S
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0495
            int r6 = r12.f195582i
            long r32 = r10.mo108774y2()
            java.lang.String r4 = r12.f195527S
            java.lang.String r2 = r12.f195503K
            int r1 = r12.f195506L
            r27 = r1
            r1 = r45
            r35 = r2
            r34 = r29
            r29 = r3
            r2 = r32
            r32 = r14
            r14 = 2001(0x7d1, float:2.804E-42)
            r20 = 1
            r15 = r4
            r4 = r10
            r14 = r5
            r36 = r31
            r5 = r29
            r37 = r30
            r30 = r6
            r6 = r15
            r15 = r7
            r7 = r35
            r14 = 1
            r8 = r27
            r38 = r9
            r9 = r0
            r39 = r10
            r19 = r22
            r10 = r30
            r1.mo100158O(r2, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x056e
        L_0x0495:
            r38 = r9
            r39 = r10
            r32 = r14
            r19 = r22
            r34 = r29
            r37 = r30
            r36 = r31
            r14 = 1
            r29 = r3
            r15 = r7
            java.lang.String r3 = r12.f195646y
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x051c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r3 = r12.f195646y
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            java.lang.String r0 = r12.f195646y
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            di3.d r3 = di3.C86312j.m106911c(r1)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r3 = r3.mo127193mf(r0)
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            java.lang.String r0 = r1.Ab0(r0)
            gc0.a r1 = gc0.C20828a.m22825b()
            java.lang.String r4 = r12.f195646y
            hc0.c$b r5 = new hc0.c$b
            r5.<init>()
            r5.f59350f = r3
            r5.f59346b = r14
            hc0.c r5 = r5.mo32666a()
            r6 = 0
            r1.mo32519h(r4, r6, r5)
            r10 = r39
            r10.mo108739S2(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            goto L_0x056e
        L_0x051c:
            r10 = r39
            java.lang.String r1 = r12.f195464A
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x056c
            int r9 = r12.f195582i
            long r2 = r10.mo108774y2()
            java.lang.String r7 = r12.f195476D
            java.lang.String r8 = r12.f195464A
            int r5 = r12.f195468B
            java.lang.String r4 = r12.f195472C
            r22 = 1
            r1 = r45
            r25 = r4
            r4 = r10
            r26 = r5
            r5 = r29
            r14 = r6
            r6 = r7
            r7 = r8
            r8 = r26
            r26 = r9
            r9 = r0
            r39 = r10
            r10 = r26
            r40 = r11
            r11 = r25
            r25 = r15
            r15 = r12
            r12 = r22
            r1.mo100159Q(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r1 = r15.f195464A
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            goto L_0x0573
        L_0x056c:
            r39 = r10
        L_0x056e:
            r40 = r11
            r25 = r15
        L_0x0572:
            r15 = r12
        L_0x0573:
            r42 = r38
            goto L_0x062f
        L_0x0577:
            r25 = r7
            r38 = r9
            r39 = r10
            r40 = r11
            r32 = r14
            r19 = r22
            r34 = r29
            r37 = r30
            r36 = r31
            r29 = r3
            r14 = r6
            r15 = r12
            java.lang.String r0 = r15.f195646y
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0632
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r3 = r15.f195646y
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            java.lang.String r0 = r15.f195646y
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            int r3 = r15.f195582i
            r4 = 2001(0x7d1, float:2.804E-42)
            if (r3 != r4) goto L_0x05d5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r12 = r38
            r0.append(r12)
            java.lang.String r3 = r15.f195646y
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)
            goto L_0x05d7
        L_0x05d5:
            r12 = r38
        L_0x05d7:
            boolean r3 = r39.mo100967F3()
            if (r3 != 0) goto L_0x062d
            di3.d r3 = di3.C86312j.m106911c(r1)
            gt.k r3 = (p158gt.C98201k) r3
            gt.m r3 = r3.mo137277xi()
            com.tencent.mm.modelimage.m r3 = (com.tencent.p014mm.modelimage.C92839m) r3
            java.lang.String r3 = r3.mo127193mf(r0)
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            java.lang.String r0 = r1.Ab0(r0)
            gc0.a r1 = gc0.C20828a.m22825b()
            java.lang.String r4 = r15.f195646y
            hc0.c$b r5 = new hc0.c$b
            r5.<init>()
            r5.f59350f = r3
            r6 = 1
            r5.f59346b = r6
            hc0.c r5 = r5.mo32666a()
            r6 = 0
            r1.mo32519h(r4, r6, r5)
            r11 = r39
            r11.mo108739S2(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            goto L_0x067e
        L_0x062d:
            r42 = r12
        L_0x062f:
            r41 = r39
            goto L_0x0682
        L_0x0632:
            r12 = r38
            r11 = r39
            java.lang.String r0 = r15.f195464A
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x067e
            int r10 = r15.f195582i
            r9 = 2
            if (r10 != r9) goto L_0x0645
            r0 = 1
            goto L_0x0646
        L_0x0645:
            r0 = 0
        L_0x0646:
            long r2 = r11.mo108774y2()
            java.lang.String r6 = r15.f195476D
            java.lang.String r7 = r15.f195464A
            int r8 = r15.f195468B
            java.lang.String r5 = r15.f195472C
            r22 = 1
            r1 = r45
            r4 = r11
            r23 = r5
            r5 = r29
            r26 = 2
            r9 = r0
            r41 = r11
            r11 = r23
            r42 = r12
            r12 = r22
            r1.mo100159Q(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r1 = r15.f195464A
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r0)
            goto L_0x0684
        L_0x067e:
            r41 = r11
            r42 = r12
        L_0x0682:
            r26 = 2
        L_0x0684:
            if (r25 == 0) goto L_0x069a
            r8 = r41
            r1 = 1
            r8.mo108740T2(r1)
            r5 = r29
            r8.mo108749c3(r5)
            r1 = r40
            int r0 = r1.f227632i
            r8.mo100991d(r0)
            r2 = 0
            goto L_0x06b1
        L_0x069a:
            r5 = r29
            r1 = r40
            r8 = r41
            r2 = 0
            r8.mo108740T2(r2)
            r8.mo108749c3(r5)
            int r6 = r1.f227632i
            r3 = 3
            if (r6 <= r3) goto L_0x06ad
            goto L_0x06ae
        L_0x06ad:
            r6 = 3
        L_0x06ae:
            r8.mo100991d(r6)
        L_0x06b1:
            int r0 = r15.f195582i
            r3 = 2001(0x7d1, float:2.804E-42)
            if (r0 != r3) goto L_0x089e
            int r0 = r15.f195492H
            r3 = 1
            if (r0 != r3) goto L_0x0737
            java.lang.String r0 = r15.f195620r1
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06f1
            java.lang.String r0 = r15.f195624s1
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06f1
            int r0 = r15.f195628t1
            if (r0 <= 0) goto L_0x06f1
            java.lang.String r0 = "ljd:this is new year msg! send predownload image event!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent r0 = new com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent
            r0.<init>()
            com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent$a r3 = new com.tencent.mm.autogen.events.C2CNYPredownloadImgEvent$a
            r3.<init>()
            r0.f193503d = r3
            java.lang.String r4 = r15.f195624s1
            r3.f193505b = r4
            java.lang.String r4 = r15.f195620r1
            r3.f193504a = r4
            int r4 = r15.f195628t1
            r3.f193506c = r4
            r0.publish()
            goto L_0x06f6
        L_0x06f1:
            java.lang.String r0 = "ljd:this is new year msg! don't send predownload image event, because image preload data is illegal!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
        L_0x06f6:
            java.lang.Class<com.tencent.mm.message.e> r0 = com.tencent.p014mm.message.C68064e.class
            com.tencent.mm.message.g r0 = r15.mo93555w(r0)
            com.tencent.mm.message.e r0 = (com.tencent.p014mm.message.C68064e) r0
            java.lang.String r3 = r0.f195413c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0737
            java.lang.String r3 = r0.f195412b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0737
            long r3 = r0.f195414d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0739
            java.lang.String r3 = "ljd:this is new year msg! send predownload voice event!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)
            com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent r3 = new com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent
            r3.<init>()
            com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent$a r4 = new com.tencent.mm.autogen.events.C2CNYPredownloadVoiceEvent$a
            r4.<init>()
            r3.f193507d = r4
            java.lang.String r7 = r0.f195412b
            r4.f193508a = r7
            java.lang.String r7 = r0.f195413c
            r4.f193509b = r7
            long r9 = r0.f195414d
            r4.f193510c = r9
            r3.publish()
            goto L_0x0739
        L_0x0737:
            r5 = 0
        L_0x0739:
            java.util.List<java.lang.String> r0 = r15.f195470B1     // Catch:{ Exception -> 0x087d }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)     // Catch:{ Exception -> 0x087d }
            if (r0 != 0) goto L_0x07a3
            java.util.List<java.lang.String> r0 = r15.f195470B1     // Catch:{ Exception -> 0x079b }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x079b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x079b }
        L_0x0749:
            boolean r3 = r0.hasNext()     // Catch:{ Exception -> 0x079b }
            if (r3 == 0) goto L_0x0796
            java.lang.Object r3 = r0.next()     // Catch:{ Exception -> 0x079b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x079b }
            java.lang.String r4 = ","
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ Exception -> 0x079b }
            if (r3 == 0) goto L_0x078e
            int r4 = r3.length     // Catch:{ Exception -> 0x079b }
            if (r4 <= 0) goto L_0x078e
            r3 = r3[r2]     // Catch:{ Exception -> 0x079b }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ Exception -> 0x079b }
            if (r4 != 0) goto L_0x078e
            java.lang.String r4 = eb0.C75592q0.m90789s()     // Catch:{ Exception -> 0x079b }
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x079b }
            if (r3 == 0) goto L_0x078e
            int r0 = r8.mo108762o2()     // Catch:{ Exception -> 0x079b }
            r3 = 8
            r0 = r0 | r3
            r8.mo108735O2(r0)     // Catch:{ Exception -> 0x079b }
            java.lang.String r0 = "check c2c payer list, myself is payer, add red flag"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ Exception -> 0x079b }
            java.lang.String r0 = r8.mo108768t()     // Catch:{ Exception -> 0x079b }
            r4 = r45
            r3 = 1
            r7 = 2
            r4.mo100160g0(r3, r0)     // Catch:{ Exception -> 0x087a }
            goto L_0x0876
        L_0x078e:
            r3 = 8
            r4 = r45
            r7 = 2
            r26 = 2
            goto L_0x0749
        L_0x0796:
            r4 = r45
            r7 = 2
            goto L_0x0876
        L_0x079b:
            r0 = move-exception
            r4 = r45
            r7 = 2
        L_0x079f:
            r9 = r47
            goto L_0x0883
        L_0x07a3:
            r4 = r45
            r7 = 2
            java.lang.String r0 = "1001"
            java.lang.String r3 = r15.f195604n1     // Catch:{ Exception -> 0x087a }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x087a }
            if (r0 != 0) goto L_0x0876
            com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent r0 = new com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent     // Catch:{ Exception -> 0x087a }
            r0.<init>()     // Catch:{ Exception -> 0x087a }
            com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent$a r3 = r0.f194099d     // Catch:{ Exception -> 0x087a }
            r9 = r47
            r3.f194100a = r9     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r8.mo108768t()     // Catch:{ Exception -> 0x0874 }
            r3.f194101b = r10     // Catch:{ Exception -> 0x0874 }
            com.tencent.mm.autogen.events.WalletReceiveLuckyMoneyAppMsgEvent$a r3 = r0.f194099d     // Catch:{ Exception -> 0x0874 }
            long r10 = r8.mo108774y2()     // Catch:{ Exception -> 0x0874 }
            r3.f194102c = r10     // Catch:{ Exception -> 0x0874 }
            r0.publish()     // Catch:{ Exception -> 0x0874 }
            java.lang.String r0 = r8.mo108768t()     // Catch:{ Exception -> 0x0874 }
            r4.mo100160g0(r2, r0)     // Catch:{ Exception -> 0x0874 }
            java.lang.String r0 = "1002"
            java.lang.String r3 = r15.f195604n1     // Catch:{ Exception -> 0x0874 }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0874 }
            if (r0 == 0) goto L_0x0878
            java.lang.Class<com.tencent.mm.message.c> r0 = com.tencent.p014mm.message.C68062c.class
            com.tencent.mm.message.g r0 = r15.mo93555w(r0)     // Catch:{ Exception -> 0x0874 }
            com.tencent.mm.message.c r0 = (com.tencent.p014mm.message.C68062c) r0     // Catch:{ Exception -> 0x0874 }
            te3.tf2 r3 = new te3.tf2     // Catch:{ Exception -> 0x0874 }
            r3.<init>()     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195394k     // Catch:{ Exception -> 0x0874 }
            r3.f228246g = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195395l     // Catch:{ Exception -> 0x0874 }
            r3.f228249j = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195392i     // Catch:{ Exception -> 0x0874 }
            r3.f228245f = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195393j     // Catch:{ Exception -> 0x0874 }
            r3.f228248i = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195406w     // Catch:{ Exception -> 0x0874 }
            r3.f228259w = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195407x     // Catch:{ Exception -> 0x0874 }
            r3.f228239A = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195409z     // Catch:{ Exception -> 0x0874 }
            r3.f228260x = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195380A     // Catch:{ Exception -> 0x0874 }
            r3.f228240B = r10     // Catch:{ Exception -> 0x0874 }
            int r10 = r0.f195381B     // Catch:{ Exception -> 0x0874 }
            r3.f228242D = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195382C     // Catch:{ Exception -> 0x0874 }
            r3.f228261y = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195383D     // Catch:{ Exception -> 0x0874 }
            r3.f228241C = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195398o     // Catch:{ Exception -> 0x0874 }
            r3.f228251o = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195399p     // Catch:{ Exception -> 0x0874 }
            r3.f228252p = r10     // Catch:{ Exception -> 0x0874 }
            if (r25 == 0) goto L_0x0831
            java.lang.String r10 = r0.f195388e     // Catch:{ Exception -> 0x0874 }
            r3.f228244e = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195389f     // Catch:{ Exception -> 0x0874 }
            r3.f228247h = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195400q     // Catch:{ Exception -> 0x0874 }
            r3.f228253q = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195401r     // Catch:{ Exception -> 0x0874 }
            r3.f228254r = r10     // Catch:{ Exception -> 0x0874 }
            goto L_0x0841
        L_0x0831:
            java.lang.String r10 = r0.f195390g     // Catch:{ Exception -> 0x0874 }
            r3.f228244e = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195391h     // Catch:{ Exception -> 0x0874 }
            r3.f228247h = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195402s     // Catch:{ Exception -> 0x0874 }
            r3.f228253q = r10     // Catch:{ Exception -> 0x0874 }
            java.lang.String r10 = r0.f195403t     // Catch:{ Exception -> 0x0874 }
            r3.f228254r = r10     // Catch:{ Exception -> 0x0874 }
        L_0x0841:
            java.lang.Class<f32.b> r10 = f32.C75672b.class
            di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x0874 }
            f32.b r10 = (f32.C75672b) r10     // Catch:{ Exception -> 0x0874 }
            te3.sf2 r11 = new te3.sf2     // Catch:{ Exception -> 0x0874 }
            r11.<init>()     // Catch:{ Exception -> 0x0874 }
            r11.f228203g = r3     // Catch:{ Exception -> 0x0874 }
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0874 }
            h81.h r3 = (h81.C32735h) r3     // Catch:{ Exception -> 0x0874 }
            h81.h$c r12 = h81.C32735h.C32737c.clicfg_android_close_red_skin_predownload_switch     // Catch:{ Exception -> 0x0874 }
            r14 = 1
            boolean r3 = r3.mo58784wf(r12, r14)     // Catch:{ Exception -> 0x0874 }
            if (r3 == 0) goto L_0x0865
            r10.mo95325nE(r11)     // Catch:{ Exception -> 0x0874 }
            goto L_0x086a
        L_0x0865:
            java.lang.String r3 = "not predownload envelope resource"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r3)     // Catch:{ Exception -> 0x0874 }
        L_0x086a:
            com.tencent.mm.message.h r0 = r0.f195384E     // Catch:{ Exception -> 0x0874 }
            java.lang.String r3 = bi3.C54462d.m61181b(r8)     // Catch:{ Exception -> 0x0874 }
            r10.mo95333yT(r0, r3)     // Catch:{ Exception -> 0x0874 }
            goto L_0x0878
        L_0x0874:
            r0 = move-exception
            goto L_0x0883
        L_0x0876:
            r9 = r47
        L_0x0878:
            r3 = 1
            goto L_0x0891
        L_0x087a:
            r0 = move-exception
            goto L_0x079f
        L_0x087d:
            r0 = move-exception
            r4 = r45
            r9 = r47
            r7 = 2
        L_0x0883:
            r3 = 1
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r10[r2] = r0
            java.lang.String r0 = "check c2c payer list error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r0, r10)
        L_0x0891:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r3 = r15.f195616q1
            r0[r2] = r3
            java.lang.String r3 = "paymsgid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r3, r0)
            goto L_0x08a5
        L_0x089e:
            r4 = r45
            r9 = r47
            r5 = 0
            r7 = 2
        L_0x08a5:
            int r0 = r15.f195582i
            r3 = 87
            if (r0 != r3) goto L_0x08d8
            java.lang.Class<t90.c> r0 = t90.C77879c.class
            com.tencent.mm.message.g r0 = r15.mo93555w(r0)
            t90.c r0 = (t90.C77879c) r0
            java.lang.String r3 = r8.getContent()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = 60
            int r11 = r3.indexOf(r11)
            java.lang.String r11 = r3.substring(r2, r11)
            r10.append(r11)
            java.lang.String r0 = r0.f226903b
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r8.mo108732L2(r0)
            r8.mo108746Z2(r3)
        L_0x08d8:
            java.lang.String r0 = r1.f227636p
            r8.mo101012p4(r0)
            r1 = r37
            if (r1 == 0) goto L_0x08f2
            java.lang.String r0 = r1.f222099f
            r8.mo108731K2(r0)
            int r0 = r1.f222100g
            r8.f230739W = r0
            r3 = 1
            r8.f230755r = r3
            java.lang.String r0 = r1.f222098e
            r8.mo108730J2(r0)
        L_0x08f2:
            boolean r0 = r8.mo100983V3()
            if (r0 == 0) goto L_0x0901
            sg.i<java.lang.String, java.util.ArrayList<hd0.n0>> r0 = hd0.C98410o0.f288586c
            java.lang.String r0 = hd0.C98426q0.m127793a(r17)
            r8.mo108739S2(r0)
        L_0x0901:
            java.util.Map<java.lang.String, java.lang.String> r0 = r15.f195491G2
            di3.d r1 = di3.C86312j.m106911c(r16)
            f62.y r1 = (f62.C31955y) r1
            r3 = r46
            r10 = r13
            boolean r1 = r1.mo57250q0(r3, r8, r0)
            if (r1 != 0) goto L_0x0914
            r1 = 0
            return r1
        L_0x0914:
            eb0.C75604z3.m90842n(r8, r3)
            long r11 = r8.getMsgId()
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x094b
            r1 = r21
            boolean r1 = com.tencent.p014mm.storage.C19615i1.m21066m(r8, r1)
            if (r1 == 0) goto L_0x092c
            r1 = 1
            com.tencent.p014mm.storage.C19636w0.m21159a(r8, r1)
            goto L_0x0933
        L_0x092c:
            long r11 = eb0.C75604z3.m90852x(r8)
            r8.setMsgId(r11)
        L_0x0933:
            com.tencent.mm.autogen.events.AppMsgInsertEvent r1 = new com.tencent.mm.autogen.events.AppMsgInsertEvent
            r1.<init>()
            com.tencent.mm.autogen.events.AppMsgInsertEvent$a r11 = r1.f78718d
            r11.f78719a = r8
            r11.f78720b = r15
            r1.publish()
            ob0.m$b r1 = new ob0.m$b
            r11 = 1
            r1.<init>(r8, r11)
            r11 = r1
            r1 = r34
            goto L_0x0970
        L_0x094b:
            r1 = r21
            r11 = 1
            boolean r1 = com.tencent.p014mm.storage.C19615i1.m21066m(r8, r1)
            if (r1 == 0) goto L_0x095a
            com.tencent.p014mm.storage.C19636w0.m21159a(r8, r11)
            r1 = r34
            goto L_0x0966
        L_0x095a:
            if (r24 == 0) goto L_0x095f
            r8.mo108734N2(r2)
        L_0x095f:
            r11 = r32
            r1 = r34
            r1.yy0(r11, r8)
        L_0x0966:
            if (r24 == 0) goto L_0x096b
            m85029q(r1, r8)
        L_0x096b:
            ob0.m$b r11 = new ob0.m$b
            r11.<init>(r8, r2)
        L_0x0970:
            di3.d r12 = di3.C86312j.m106911c(r16)
            f62.y r12 = (f62.C31955y) r12
            r12.mo57249i4(r3, r8, r0)
            int r3 = r8.getType()
            r12 = 301989937(0x12000031, float:4.0389914E-28)
            if (r3 != r12) goto L_0x0999
            java.lang.String r3 = r8.mo108768t()
            if (r3 == 0) goto L_0x0993
            java.lang.String r12 = "pc_share"
            boolean r3 = r3.equalsIgnoreCase(r12)
            if (r3 == 0) goto L_0x0993
            r3 = 1
            goto L_0x0994
        L_0x0993:
            r3 = 0
        L_0x0994:
            if (r3 == 0) goto L_0x0999
            r8.setMsgId(r5)
        L_0x0999:
            boolean r3 = r8.mo100992d4()
            if (r3 == 0) goto L_0x09d6
            java.lang.String r3 = r8.mo108768t()
            r5 = r36
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x09d6
            if (r0 == 0) goto L_0x09d6
            java.lang.String r3 = ".msg.fromusername"
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85804J4(r0)
            if (r3 == 0) goto L_0x09d6
            java.lang.Class<kr0.w0> r3 = kr0.C76629w0.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kr0.w0 r3 = (kr0.C76629w0) r3
            r5 = 0
            r3.mo106878CE(r0, r5)
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r0
            java.lang.String r0 = "trigger to get app brand WxaInfo(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r0, r5)
        L_0x09d6:
            int r0 = r8.getType()
            r3 = 536870961(0x20000031, float:1.0842085E-19)
            if (r0 != r3) goto L_0x0a29
            java.lang.Class<com.tencent.mm.message.b> r0 = com.tencent.p014mm.message.C68061b.class
            com.tencent.mm.message.g r0 = r15.mo93555w(r0)
            com.tencent.mm.message.b r0 = (com.tencent.p014mm.message.C68061b) r0
            com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent r3 = new com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent
            r3.<init>()
            com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent$a r5 = r3.f78908d
            long r12 = r8.getMsgId()
            r5.f78909a = r12
            com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent$a r5 = r3.f78908d
            java.lang.String r0 = r0.f195367n
            r5.f78910b = r0
            r5.f78911c = r9
            int r0 = r8.mo108769t2()
            r5 = 1
            if (r0 != r5) goto L_0x0a16
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r2] = r19
            r0[r5] = r17
            java.lang.String r5 = "fromuser: %s, touser: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r5, r0)
            com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent$a r0 = r3.f78908d
            java.lang.String r5 = r8.mo108768t()
            r0.f78912d = r5
        L_0x0a16:
            r3.publish()
            com.tencent.mm.autogen.events.ReceiveHoneyPayAppMsgEvent$a r0 = r3.f78908d
            java.lang.String r0 = r0.f78911c
            if (r0 == 0) goto L_0x0a29
            r8.mo108732L2(r0)
            long r5 = r8.getMsgId()
            r1.xy0(r5, r8)
        L_0x0a29:
            java.lang.String r0 = r15.f195640w1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0a4e
            int r0 = r8.getType()
            r1 = 436207665(0x1a000031, float:2.6469934E-23)
            if (r0 != r1) goto L_0x0a4e
            com.tencent.mm.autogen.events.ReceiveAAMsgEvent r0 = new com.tencent.mm.autogen.events.ReceiveAAMsgEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ReceiveAAMsgEvent$a r1 = r0.f78899d
            long r5 = r8.getMsgId()
            r1.f78900a = r5
            com.tencent.mm.autogen.events.ReceiveAAMsgEvent$a r1 = r0.f78899d
            r1.f78901b = r9
            r0.publish()
        L_0x0a4e:
            int r0 = r15.f195582i
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 == r1) goto L_0x0a58
            r1 = 2011(0x7db, float:2.818E-42)
            if (r0 != r1) goto L_0x0a7f
        L_0x0a58:
            java.lang.String r0 = r15.f195501J0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0a7f
            com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent r0 = new com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent
            r0.<init>()
            com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent$a r1 = r0.f107727d
            java.lang.String r3 = r15.f195501J0
            r1.f107728a = r3
            long r5 = r8.getMsgId()
            r1.f107729b = r5
            com.tencent.mm.autogen.events.ReceiveTransferAppMsgEvent$a r1 = r0.f107727d
            r1.f107730c = r15
            r0.publish()
            java.lang.String r0 = r8.mo108768t()
            r4.mo100160g0(r2, r0)
        L_0x0a7f:
            java.util.Map<java.lang.String, java.lang.String> r0 = r15.f195491G2
            java.lang.String r1 = ".msg.appmsg.ext_pay_info.pay_type"
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r3 = r42
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r3)
            java.lang.String r3 = "wx_f2f"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0aa1
            java.lang.String r3 = "wx_md"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0b44
        L_0x0aa1:
            boolean r3 = r11.f94256b
            if (r3 == 0) goto L_0x0b44
            long r5 = r8.getCreateTime()
            long r12 = eb0.C31543z5.m39453c()
            r39 = r8
            long r7 = r12 - r5
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 1
            r3[r6] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r6 = 2
            r3[r6] = r5
            java.lang.String r5 = "pay voice msg: %s, create: %s, current: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r3)
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent r3 = new com.tencent.mm.autogen.events.CollectRcvVoiceEvent
            r3.<init>()
            java.lang.String r5 = ".msg.appmsg.ext_pay_info.pay_fee"
            java.lang.Object r5 = r0.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r5, (int) r2)
            java.lang.String r6 = ".msg.appmsg.ext_pay_info.pay_feetype"
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.String r9 = ".msg.appmsg.ext_pay_info.pay_outtradeno"
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            java.lang.String r10 = ".msg.appmsg.ext_pay_info.voice_content"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            java.lang.String r12 = ".msg.appmsg.ext_pay_info.expire_voice_timestamp"
            java.lang.Object r12 = r0.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r13 = ".msg.appmsg.ext_pay_info.need_failover"
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r13 = 1
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r13)
            if (r5 <= 0) goto L_0x0b46
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r13 != 0) goto L_0x0b46
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r13 != 0) goto L_0x0b46
            com.tencent.mm.autogen.events.CollectRcvVoiceEvent$a r13 = r3.f193526d
            r13.f193527a = r5
            r13.f193528b = r6
            r13.f193529c = r9
            r13.f193530d = r1
            r13.f193531e = r7
            r13.f193532f = r2
            r13.f193533g = r10
            r13.f193534h = r12
            if (r0 != 0) goto L_0x0b3d
            r13.f193535i = r2
            goto L_0x0b40
        L_0x0b3d:
            r1 = 1
            r13.f193535i = r1
        L_0x0b40:
            r3.publish()
            goto L_0x0b46
        L_0x0b44:
            r39 = r8
        L_0x0b46:
            if (r18 == 0) goto L_0x0b60
            int r0 = r15.f195582i
            r1 = 74
            if (r0 != r1) goto L_0x0b56
            r0 = 11
            r8 = r39
            m85026S(r8, r15, r0)
            goto L_0x0b60
        L_0x0b56:
            r8 = r39
            r1 = 6
            if (r0 != r1) goto L_0x0b60
            r0 = 16
            m85026S(r8, r15, r0)
        L_0x0b60:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72689q.mo100157B(ob0.m$a, java.lang.String, com.tencent.mm.message.l$b):ob0.m$b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0210, code lost:
        if (r10 != null) goto L_0x0214;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0328  */
    /* renamed from: Fg */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ob0.C35136m.C35139b mo56403Fg(ob0.C35136m.C35137a r31) {
        /*
            r30 = this;
            r0 = r31
            java.lang.Class<f62.t0> r1 = f62.C75708t0.class
            java.lang.Class<pi.c> r2 = p644pi.C77088c.class
            java.lang.Class<eb0.h2> r3 = eb0.C75582h2.class
            java.lang.Class<f62.i0> r4 = f62.C75698i0.class
            java.lang.Class<f62.k0> r5 = f62.C75700k0.class
            java.lang.String r6 = "MicroMsg.AppMessageExtension"
            java.lang.String r7 = "process add app message"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r7)
            te3.j3 r7 = r0.f94242a
            te3.rv3 r8 = r7.f227628e
            java.lang.String r8 = sf0.C48374j0.m53718g(r8)
            te3.rv3 r9 = r7.f227629f
            java.lang.String r9 = sf0.C48374j0.m53718g(r9)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            r11 = 0
            if (r10 != 0) goto L_0x003b
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 == 0) goto L_0x0030
            goto L_0x003b
        L_0x0030:
            te3.rv3 r10 = r7.f227631h
            java.lang.String r10 = sf0.C48374j0.m53718g(r10)
            java.lang.String r8 = m85025D(r8, r9, r10)
            goto L_0x0041
        L_0x003b:
            java.lang.String r8 = "empty fromuser or touser"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            r8 = r11
        L_0x0041:
            com.tencent.mm.message.l$b r9 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r11)
            if (r9 != 0) goto L_0x004e
            java.lang.String r0 = "parse app message failed, insert failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            return r11
        L_0x004e:
            boolean r10 = r9.f195632u1
            if (r10 == 0) goto L_0x007f
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 352273(0x56011, float:4.9364E-40)
            r0.mo119676J(r1, r8)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 352274(0x56012, float:4.93641E-40)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119676J(r1, r2)
            com.tencent.mm.pluginsdk.model.app.b r0 = new com.tencent.mm.pluginsdk.model.app.b
            r0.<init>(r8)
            r0.mo100142b()
            return r11
        L_0x007f:
            com.tencent.mm.pluginsdk.model.app.p r10 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.yx0()
            java.lang.String r12 = r9.f195562d
            com.tencent.mm.pluginsdk.model.app.j r10 = r10.mo69371Lo(r12)
            r12 = 3
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r13 = r9.f195562d
            r14 = 0
            r12[r14] = r13
            int r13 = r9.f195480E
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r15 = 1
            r12[r15] = r13
            if (r10 != 0) goto L_0x009f
            java.lang.String r13 = "null"
            goto L_0x00a5
        L_0x009f:
            int r13 = r10.field_appVersion
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
        L_0x00a5:
            r15 = 2
            r12[r15] = r13
            java.lang.String r13 = "check version appid:%s, msgVer:%d, appVer:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r13, r12)
            if (r10 == 0) goto L_0x00b5
            int r10 = r10.field_appVersion
            int r12 = r9.f195480E
            if (r10 >= r12) goto L_0x00be
        L_0x00b5:
            com.tencent.mm.pluginsdk.model.app.o r10 = ld2.C46848g.Ax0()
            java.lang.String r12 = r9.f195562d
            r10.mo69369e(r12)
        L_0x00be:
            te3.rv3 r10 = r7.f227631h
            java.lang.String r10 = sf0.C48374j0.m53718g(r10)
            r12 = r30
            ob0.m$b r10 = r12.mo100157B(r0, r10, r9)
            if (r10 == 0) goto L_0x05e4
            com.tencent.mm.storage.f4 r13 = r10.f94255a
            if (r13 != 0) goto L_0x00d2
            goto L_0x05e4
        L_0x00d2:
            boolean r16 = r13.mo100967F3()
            if (r16 == 0) goto L_0x00d9
            return r10
        L_0x00d9:
            int r11 = r13.getType()
            r15 = 301989937(0x12000031, float:4.0389914E-28)
            if (r11 != r15) goto L_0x00e3
            return r10
        L_0x00e3:
            int r11 = r13.getType()
            r15 = -1879048190(0xffffffff90000002, float:-2.5243555E-29)
            if (r11 != r15) goto L_0x00fe
            com.tencent.mm.autogen.events.VoiceReminderRemindEvent r11 = new com.tencent.mm.autogen.events.VoiceReminderRemindEvent
            r11.<init>()
            com.tencent.mm.autogen.events.VoiceReminderRemindEvent$a r15 = r11.f194010d
            r15.f194011a = r8
            java.lang.String r14 = r9.f195574g
            r15.f194012b = r14
            r15.f194013c = r13
            r11.publish()
        L_0x00fe:
            int r11 = r13.getType()
            r14 = 318767153(0x13000031, float:1.6155966E-27)
            if (r11 != r14) goto L_0x0156
            com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent r11 = new com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent
            r11.<init>()
            com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent$a r14 = r11.f154743d
            r14.f154744a = r8
            int r15 = r13.getType()
            r14.f154745b = r15
            com.tencent.mm.autogen.events.DyeingTemplateMsgReceiveEvent$a r14 = r11.f154743d
            java.lang.String r15 = r13.f230724G
            r14.f154746c = r15
            r11.publish()
            pp0.a r11 = pp0.C62421a.f177387a
            java.lang.String r14 = r13.f230724G
            int r15 = r13.getType()
            java.lang.String r12 = "msgXml"
            gy3.C87412m.m108594g(r8, r12)
            java.lang.String r12 = "msgSource"
            gy3.C87412m.m108594g(r14, r12)
            java.lang.String r12 = r11.mo87476d(r8)
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x013d
            r12 = 1
            goto L_0x013e
        L_0x013d:
            r12 = 0
        L_0x013e:
            if (r12 == 0) goto L_0x0141
            goto L_0x0150
        L_0x0141:
            sr.d r12 = r11.mo87474b(r8, r15)
            if (r12 == 0) goto L_0x0148
            goto L_0x014e
        L_0x0148:
            sr.d r11 = r11.mo87475c(r14, r15)
            if (r11 == 0) goto L_0x0150
        L_0x014e:
            r11 = 1
            goto L_0x0151
        L_0x0150:
            r11 = 0
        L_0x0151:
            if (r11 == 0) goto L_0x0156
            r11 = 0
            r10.f94256b = r11
        L_0x0156:
            int r11 = r13.getType()
            r12 = 49
            if (r11 != r12) goto L_0x0174
            java.lang.String r11 = r9.f195475C2
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0174
            com.tencent.mm.autogen.events.AdLandingPagesDownloadEventEvent r11 = new com.tencent.mm.autogen.events.AdLandingPagesDownloadEventEvent
            r11.<init>()
            com.tencent.mm.autogen.events.AdLandingPagesDownloadEventEvent$a r12 = r11.f78708d
            java.lang.String r14 = r9.f195475C2
            r12.f78709a = r14
            r11.publish()
        L_0x0174:
            boolean r11 = r13.mo100983V3()
            java.lang.String r12 = ""
            if (r11 == 0) goto L_0x0256
            f40.o r11 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r11 = r11.mo121142i()
            r14 = 2
            java.lang.Object r11 = r11.mo119684e(r14, r12)
            java.lang.String r11 = (java.lang.String) r11
            te3.rv3 r14 = r7.f227629f
            java.lang.String r14 = sf0.C48374j0.m53718g(r14)
            te3.rv3 r15 = r7.f227628e
            java.lang.String r15 = sf0.C48374j0.m53718g(r15)
            k40.a r17 = f40.C86709a0.m107533q(r5)
            f62.k0 r17 = (f62.C75700k0) r17
            g62.p r17 = r17.V50()
            r18 = r14
            r14 = r17
            com.tencent.mm.storage.s4 r14 = (com.tencent.p014mm.storage.C44667s4) r14
            boolean r14 = r14.mo69822qq(r15)
            if (r14 != 0) goto L_0x01b6
            boolean r11 = r11.equals(r15)
            if (r11 == 0) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r11 = 0
            goto L_0x01b7
        L_0x01b6:
            r11 = 1
        L_0x01b7:
            hd0.n0 r14 = new hd0.n0
            r14.<init>()
            if (r11 == 0) goto L_0x01c1
            r11 = r18
            goto L_0x01c2
        L_0x01c1:
            r11 = r15
        L_0x01c2:
            r14.f288570q = r11
            r14.f288571r = r15
            int r11 = r7.f227635o
            r15 = r10
            long r10 = (long) r11
            r14.f288563j = r10
            long r10 = r7.f227638r
            r14.f288556c = r10
            te3.rv3 r10 = r7.f227631h
            java.lang.String r10 = r10.f141175d
            r14.f288575v = r10
            long r10 = r13.getMsgId()
            int r11 = (int) r10
            long r10 = (long) r11
            r14.f288567n = r10
            boolean r10 = r13.mo100974M3()
            if (r10 == 0) goto L_0x01f0
            s90.n r10 = new s90.n
            r10.<init>()
            te3.fa r11 = r13.f212663B1
            s90.n r10 = r10.mo73007b(r11)
            goto L_0x0214
        L_0x01f0:
            java.lang.String r10 = r13.getContent()
            java.lang.String r11 = r13.mo108775z2()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r11)
            if (r10 != 0) goto L_0x0204
            java.lang.String r10 = "getVideoInfo content is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r10)
            goto L_0x0213
        L_0x0204:
            java.lang.Class<com.tencent.mm.message.f> r11 = com.tencent.p014mm.message.C68065f.class
            com.tencent.mm.message.g r10 = r10.mo93555w(r11)
            com.tencent.mm.message.f r10 = (com.tencent.p014mm.message.C68065f) r10
            if (r10 == 0) goto L_0x0213
            s90.n r10 = r10.f195427l
            if (r10 == 0) goto L_0x0213
            goto L_0x0214
        L_0x0213:
            r10 = 0
        L_0x0214:
            if (r10 == 0) goto L_0x0240
            java.lang.String r11 = r13.mo108765s2()
            r14.f288554a = r11
            java.lang.String r11 = r10.f133367e
            r17 = r15
            int r15 = r10.f133371i
            r18 = r8
            java.lang.String r8 = r10.f133369g
            java.lang.String r10 = r10.f133366d
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            r19 = r14
            r20 = r11
            r21 = r15
            r22 = r8
            r23 = r10
            r19.mo137714r(r20, r21, r22, r23, r24, r25, r26)
            r8 = 111(0x6f, float:1.56E-43)
            r14.f288562i = r8
            goto L_0x0244
        L_0x0240:
            r18 = r8
            r17 = r15
        L_0x0244:
            java.lang.Class<rz.s> r8 = p682rz.C101488s.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            rz.s r8 = (p682rz.C101488s) r8
            rz.t r8 = r8.Kj0()
            hd0.o0 r8 = (hd0.C98410o0) r8
            r8.mo137730s(r14)
            goto L_0x025a
        L_0x0256:
            r18 = r8
            r17 = r10
        L_0x025a:
            int r8 = r9.f195582i
            r10 = 53
            if (r8 != r10) goto L_0x0351
            java.lang.String r8 = "process MM_APP_SOLITAIRE_TEXT"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            java.lang.String r8 = r7.f227637q
            java.lang.String r10 = r9.f195570f
            boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r14 == 0) goto L_0x0272
        L_0x0270:
            r8 = r12
            goto L_0x02e2
        L_0x0272:
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r8)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r15 == 0) goto L_0x027d
            goto L_0x0270
        L_0x027d:
            java.lang.String r15 = "<pushcontent"
            int r15 = r14.indexOf(r15)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            if (r15 <= 0) goto L_0x029b
            java.lang.String r20 = r14.substring(r15)
            r21 = r8
            r8 = 0
            java.lang.String r14 = r14.substring(r8, r15)
            r11.append(r14)
            r14 = r20
            goto L_0x029d
        L_0x029b:
            r21 = r8
        L_0x029d:
            java.lang.String r8 = "pushcontent"
            r15 = 0
            java.util.Map r8 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r14, r8, r15)
            if (r8 != 0) goto L_0x02af
            java.lang.String r8 = "inval xml"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            r8 = r21
            goto L_0x02e2
        L_0x02af:
            java.lang.String r14 = ".pushcontent.$nickname"
            java.lang.Object r8 = r8.get(r14)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r14 = "<pushcontent "
            r11.append(r14)
            java.lang.String r14 = "content=\""
            r11.append(r14)
            r11.append(r8)
            java.lang.String r14 = " : "
            r11.append(r14)
            r11.append(r10)
            java.lang.String r10 = "\""
            r11.append(r10)
            java.lang.String r10 = "nickname=\""
            r11.append(r10)
            r11.append(r8)
            java.lang.String r8 = "\" />\n"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
        L_0x02e2:
            r7.f227637q = r8
            java.lang.String r8 = r13.getContent()
            java.lang.String r8 = eb0.C75604z3.m90847s(r8)
            if (r8 == 0) goto L_0x02f7
            int r10 = r8.length()
            if (r10 <= 0) goto L_0x02f7
            r22 = r8
            goto L_0x02f9
        L_0x02f7:
            r22 = r12
        L_0x02f9:
            boolean r0 = r0.f94243b
            r10 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x0328
            di3.d r0 = di3.C86312j.m106911c(r4)
            r20 = r0
            f62.i0 r20 = (f62.C75698i0) r20
            te3.rv3 r0 = r7.f227628e
            java.lang.String r21 = sf0.C48374j0.m53718g(r0)
            java.lang.String r0 = r9.f195570f
            android.util.Pair<java.lang.String, java.lang.String> r4 = r9.f195637v2
            java.lang.Object r4 = r4.second
            r24 = r4
            java.lang.String r24 = (java.lang.String) r24
            long r25 = r13.getMsgId()
            long r7 = r13.getCreateTime()
            long r27 = r7 / r10
            r23 = r0
            r20.mo106020Nm(r21, r22, r23, r24, r25, r27)
            goto L_0x049a
        L_0x0328:
            di3.d r0 = di3.C86312j.m106911c(r4)
            r20 = r0
            f62.i0 r20 = (f62.C75698i0) r20
            te3.rv3 r0 = r7.f227628e
            java.lang.String r21 = sf0.C48374j0.m53718g(r0)
            java.lang.String r0 = r9.f195570f
            android.util.Pair<java.lang.String, java.lang.String> r4 = r9.f195637v2
            java.lang.Object r4 = r4.second
            r24 = r4
            java.lang.String r24 = (java.lang.String) r24
            long r25 = r13.getMsgId()
            long r7 = r13.getCreateTime()
            long r27 = r7 / r10
            r23 = r0
            r20.mo106019Nc(r21, r22, r23, r24, r25, r27)
            goto L_0x049a
        L_0x0351:
            r0 = 57
            if (r8 != r0) goto L_0x037c
            java.lang.String r0 = "process MM_APP_MSG_QUOTE"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.Class<u72.c> r0 = u72.C78135c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r20 = r0
            u72.c r20 = (u72.C78135c) r20
            long r21 = r13.getMsgId()
            long r23 = r13.mo108774y2()
            java.lang.String r25 = r13.mo108768t()
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r0 = r9.f195641w2
            long r7 = r0.f201544e
            r26 = r7
            r20.mo108114S6(r21, r23, r25, r26)
            goto L_0x049a
        L_0x037c:
            r0 = 60
            if (r8 != r0) goto L_0x040a
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r4 = 2
            java.lang.Object r0 = r0.mo119684e(r4, r12)
            java.lang.String r0 = (java.lang.String) r0
            te3.rv3 r4 = r7.f227629f
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            te3.rv3 r8 = r7.f227628e
            java.lang.String r8 = sf0.C48374j0.m53718g(r8)
            k40.a r10 = f40.C86709a0.m107533q(r5)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.p r10 = r10.V50()
            com.tencent.mm.storage.s4 r10 = (com.tencent.p014mm.storage.C44667s4) r10
            boolean r10 = r10.mo69822qq(r8)
            if (r10 != 0) goto L_0x03b6
            boolean r10 = r0.equals(r8)
            if (r10 == 0) goto L_0x03b4
            goto L_0x03b6
        L_0x03b4:
            r10 = 0
            goto L_0x03b7
        L_0x03b6:
            r10 = 1
        L_0x03b7:
            if (r10 == 0) goto L_0x03ba
            goto L_0x03bc
        L_0x03ba:
            java.lang.String r0 = r9.f195488G
        L_0x03bc:
            r26 = r0
            r0 = 2
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            r12 = 0
            r11[r12] = r0
            r0 = 1
            r11[r0] = r26
            java.lang.String r0 = "process MM_APP_MMLIVE_SHARE, isSender%b, anchor:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r0, r11)
            if (r10 != 0) goto L_0x049a
            java.lang.Class<y50.q0> r0 = y50.C66541q0.class
            com.tencent.mm.message.g r0 = r9.mo93555w(r0)
            y50.q0 r0 = (y50.C66541q0) r0
            java.lang.String r11 = r0.f191394b
            long r22 = java.lang.Long.parseLong(r11)
            java.lang.String r11 = r0.f191395c
            java.lang.String r0 = r0.f191396d
            if (r10 == 0) goto L_0x03ea
            r21 = r4
            goto L_0x03ec
        L_0x03ea:
            r21 = r8
        L_0x03ec:
            java.lang.Class<wt.c> r4 = p744wt.C66190c.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            wt.c r4 = (p744wt.C66190c) r4
            b60.b r20 = r4.o40()
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r10)
            int r4 = r7.f227635o
            long r7 = (long) r4
            r24 = r11
            r25 = r0
            r28 = r7
            r20.mo55888R5(r21, r22, r24, r25, r26, r27, r28)
            goto L_0x049a
        L_0x040a:
            r0 = 63
            if (r8 != r0) goto L_0x048a
            java.lang.String r0 = r13.mo108768t()
            java.lang.Class<ht1.b> r4 = ht1.C60151b.class
            com.tencent.mm.message.g r4 = r9.mo93555w(r4)
            ht1.b r4 = (ht1.C60151b) r4
            boolean r8 = com.tencent.p014mm.storage.C72996z1.m85820U5(r0)
            if (r8 == 0) goto L_0x049a
            te3.p81 r8 = r4.f171698b
            java.lang.String r8 = r8.f184774S
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x049a
            te3.p81 r8 = r4.f171698b
            int r8 = r8.f184775T
            r8 = r8 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x049a
            com.tencent.mm.autogen.events.FinderLiveTipsBarEvent r8 = new com.tencent.mm.autogen.events.FinderLiveTipsBarEvent
            r8.<init>()
            com.tencent.mm.autogen.events.FinderLiveTipsBarEvent$a r10 = r8.f78795d
            r11 = 1
            r10.f78796a = r11
            te3.p81 r4 = r4.f171698b
            r10.f78798c = r4
            r10.f78797b = r0
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r4 = 2
            java.lang.Object r0 = r0.mo119684e(r4, r12)
            java.lang.String r0 = (java.lang.String) r0
            te3.rv3 r4 = r7.f227628e
            java.lang.String r4 = sf0.C48374j0.m53718g(r4)
            k40.a r7 = f40.C86709a0.m107533q(r5)
            f62.k0 r7 = (f62.C75700k0) r7
            g62.p r7 = r7.V50()
            com.tencent.mm.storage.s4 r7 = (com.tencent.p014mm.storage.C44667s4) r7
            boolean r7 = r7.mo69822qq(r4)
            if (r7 != 0) goto L_0x0472
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0470
            goto L_0x0472
        L_0x0470:
            r11 = 0
            goto L_0x0473
        L_0x0472:
            r11 = 1
        L_0x0473:
            if (r11 == 0) goto L_0x047a
            com.tencent.mm.autogen.events.FinderLiveTipsBarEvent$a r4 = r8.f78795d
            r4.f78799d = r0
            goto L_0x0486
        L_0x047a:
            com.tencent.mm.autogen.events.FinderLiveTipsBarEvent$a r0 = r8.f78795d
            java.lang.String r4 = r13.getContent()
            java.lang.String r4 = eb0.C75604z3.m90847s(r4)
            r0.f78799d = r4
        L_0x0486:
            r8.publish()
            goto L_0x049a
        L_0x048a:
            r0 = 98
            if (r8 != r0) goto L_0x049a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            com.tencent.mm.pluginsdk.model.app.q$$a r0 = new com.tencent.mm.pluginsdk.model.app.q$$a
            r0.<init>(r13)
            p261wl.C38166b.m41756c(r3, r4, r0)
        L_0x049a:
            java.lang.String r0 = r13.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x04ad
            di3.d r0 = di3.C86312j.m106911c(r2)
            pi.c r0 = (p644pi.C77088c) r0
            r0.mo107396ot(r13)
        L_0x04ad:
            java.lang.String r0 = r13.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x04c0
            di3.d r0 = di3.C86312j.m106911c(r2)
            pi.c r0 = (p644pi.C77088c) r0
            r0.Ew0(r13)
        L_0x04c0:
            boolean r0 = r13.mo100971J3()
            if (r0 == 0) goto L_0x051d
            java.lang.String r0 = r13.mo108768t()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r0)
            if (r0 == 0) goto L_0x051d
            di3.d r0 = di3.C86312j.m106911c(r1)
            f62.t0 r0 = (f62.C75708t0) r0
            boolean r0 = r0.mo106028s7()
            if (r0 == 0) goto L_0x051d
            f40.C86709a0.m107528h()
            k40.a r0 = f40.C86709a0.m107533q(r5)
            f62.k0 r0 = (f62.C75700k0) r0
            com.tencent.mm.storage.u3 r0 = r0.mo96097Ni()
            java.lang.String r2 = r13.mo108768t()
            com.tencent.mm.storage.z1 r0 = r0.get(r2)
            long r7 = r0.f149538g1
            long r10 = r13.getMsgId()
            r0.mo62859J3(r10)
            f40.C86709a0.m107528h()
            k40.a r2 = f40.C86709a0.m107533q(r5)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            r2.mo69668Q3(r0)
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x051d
            di3.d r0 = di3.C86312j.m106911c(r1)
            f62.t0 r0 = (f62.C75708t0) r0
            java.lang.String r1 = r13.mo108768t()
            r0.Td0(r1, r7)
        L_0x051d:
            com.tencent.mm.message.l r0 = new com.tencent.mm.message.l
            r0.<init>()
            r9.mo93547j(r0)
            long r1 = r13.getMsgId()
            r0.field_msgId = r1
            com.tencent.mm.pluginsdk.model.app.s r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Ax0()
            long r4 = r13.getMsgId()
            com.tencent.mm.message.l r1 = r1.mo135038a0(r4)
            if (r1 == 0) goto L_0x0579
            long r1 = r13.getMsgId()
            com.tencent.mm.sdk.storage.sql.Column r4 = p749xh.C38557f0.f102214o
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.tencent.mm.sdk.storage.sql.SingleCondition r1 = r4.equal((java.lang.Number) r1)
            com.tencent.mm.sdk.storage.sql.SingleTable r2 = p749xh.C38557f0.f102213n
            com.tencent.mm.sdk.storage.sql.DeleteSql$Builder r2 = r2.delete()
            com.tencent.mm.sdk.storage.sql.DeleteSql$Builder r1 = r2.where(r1)
            com.tencent.mm.sdk.storage.sql.DeleteSql r1 = r1.build()
            f40.o r2 = f40.C86709a0.m107535s()
            zh3.f r2 = r2.f251811i
            int r1 = r1.run(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r4 = r13.getMsgId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r2[r5] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r2[r4] = r1
            java.lang.String r1 = "delete app message by msgId %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r2)
        L_0x0579:
            com.tencent.mm.pluginsdk.model.app.s r1 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.Ax0()
            boolean r0 = r1.insert(r0)
            if (r0 == 0) goto L_0x05e2
            int r0 = r9.f195582i
            r1 = 40
            if (r0 != r1) goto L_0x05e1
            com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            long r1 = r13.getMsgId()
            com.tencent.mm.pluginsdk.model.app.d r0 = r0.mo100150Yt(r1)
            com.tencent.mm.message.o r1 = com.tencent.p014mm.message.C68075o.m80440a(r18)
            if (r0 != 0) goto L_0x05b6
            r20 = 0
            long r21 = r13.getMsgId()
            r23 = 0
            r24 = 0
            r25 = 0
            int r0 = r1.f195663a
            int r2 = r9.f195582i
            r28 = 0
            r29 = 0
            r26 = r0
            r27 = r2
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85073o(r20, r21, r23, r24, r25, r26, r27, r28, r29)
        L_0x05b6:
            qg2.p r0 = new qg2.p
            long r5 = r13.getMsgId()
            long r7 = r13.mo108774y2()
            int r9 = r1.f195664b
            r10 = 0
            r11 = 1
            r4 = r0
            r4.<init>(r5, r7, r9, r10, r11)
            ob0.b0 r2 = eb0.C97625j3.m125815e()
            r2.mo123460f(r0)
            int r0 = r1.f195664b
            r1 = 98
            if (r0 != r1) goto L_0x05e1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.tencent.mm.pluginsdk.model.app.q$$b r1 = new com.tencent.mm.pluginsdk.model.app.q$$b
            r1.<init>(r13)
            p261wl.C38166b.m41756c(r3, r0, r1)
        L_0x05e1:
            return r17
        L_0x05e2:
            r0 = 0
            return r0
        L_0x05e4:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72689q.mo56403Fg(ob0.m$a):ob0.m$b");
    }

    /* renamed from: O */
    public boolean mo100158O(long j, C72963f4 f4Var, String str, String str2, String str3, int i, boolean z, int i2) {
        mo100159Q(j, f4Var, str, str2, str3, i, z, i2, "", false);
        return true;
    }

    /* renamed from: Q */
    public boolean mo100159Q(long j, C72963f4 f4Var, String str, String str2, String str3, int i, boolean z, int i2, String str4, boolean z2) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        Log.m105925i("MicroMsg.AppMessageExtension", "getThumbByCdn msgsvrid:%d aes:%s thumblen:%d url:%s talker:%s bigThumb:%b", Long.valueOf(f4Var.mo108774y2()), str6, Integer.valueOf(i), str7, str5, Boolean.valueOf(z));
        Util.nowMilliSecond();
        String str8 = "wcf://temp/appmsgext-cdnthumb-" + new Random().nextLong();
        C98124g gVar = new C98124g();
        gVar.f287660d = "task_AppMessageExtension_1";
        gVar.field_mediaId = C1297x.m1387b("downappthumb", f4Var.getCreateTime(), str5, "" + j);
        gVar.field_fullpath = str8;
        if (z2) {
            gVar.field_fileType = 19;
            gVar.f287672s = str7;
        } else {
            gVar.field_fileId = str7;
            gVar.field_fileType = 3;
        }
        gVar.field_totalLen = i;
        gVar.field_aesKey = str6;
        gVar.field_priority = 3;
        gVar.field_authKey = str4;
        boolean U5 = C72996z1.m85820U5(str);
        gVar.field_chattype = U5 ? 1 : 0;
        Log.m105919d("MicroMsg.AppMessageExtension", "get thumb by cdn [appmsg 1] chatType[%d] talker[%s] ", Integer.valueOf(U5), str5);
        gVar.f287662f = new q$$c(this, j, str3, str8, str, i2, z, i);
        ((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar);
        return true;
    }

    /* renamed from: g0 */
    public final void mo100160g0(boolean z, String str) {
        if (!Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.AppMessageExtension", "updateC2CAAMsgMark, mark: %s, talker: %s", Boolean.valueOf(z), str);
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(str);
            if (j != null) {
                if (z) {
                    j.mo108371j3(TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                } else {
                    j.mo108373l3(TPMediaCodecProfileLevel.HEVCMainTierLevel62);
                }
                ((C44660i2) C97625j3.m125812b().mo105908w()).mo69773k0(j, str);
            }
        }
    }

    /* renamed from: ld */
    public void mo56404ld(C35136m.C35138c cVar) {
        String str;
        int i;
        String content;
        C68070l.C68072b u;
        Class cls = C53543s.class;
        C72963f4 f4Var = cVar.f94250a;
        if (f4Var == null) {
            Log.m105920e("MicroMsg.AppMessageExtension", "[onPreDelMessage] msg == null");
            return;
        }
        Log.m105918d("MicroMsg.AppMessageExtension", "onPreDelMessage " + f4Var.mo108765s2());
        VoiceReminderDeleteRecordMessageEvent voiceReminderDeleteRecordMessageEvent = new VoiceReminderDeleteRecordMessageEvent();
        voiceReminderDeleteRecordMessageEvent.f194008d.f194009a = f4Var.mo108765s2();
        voiceReminderDeleteRecordMessageEvent.publish();
        Class cls2 = C79442f.class;
        if (f4Var.getType() == 436207665 && ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_lucky_money_delete_database_config, true) && (content = f4Var.getContent()) != null && (u = C68070l.C68072b.m80422u(content, f4Var.mo108775z2())) != null) {
            Log.m105925i("MicroMsg.AppMessageExtension", "checkPayMsgLogic content.c2cSceneId:%s", u.f195604n1);
            if (!Util.isNullOrNil(u.f195604n1)) {
                String str2 = u.f195604n1;
                str2.getClass();
                char c = 65535;
                switch (str2.hashCode()) {
                    case 1507425:
                        if (str2.equals("1002")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1507427:
                        if (str2.equals("1004")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1507428:
                        if (str2.equals("1005")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                        C67186g0 jo = ((C75562i) ((C79442f) C86312j.m106911c(cls2)).mo109172tc()).mo105871jo(u.f195608o1);
                        if (jo != null) {
                            Log.m105925i("MicroMsg.AppMessageExtension", "delete lucky money msg result：%s", Integer.valueOf(((C79442f) C86312j.m106911c(cls2)).mo109172tc().delete(jo.getTableName(), "mNativeUrl=?", new String[]{u.f195608o1})));
                            break;
                        }
                        break;
                    default:
                        Log.m105918d("MicroMsg.AppMessageExtension", "unknown type");
                        break;
                }
            }
        }
        C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100150Yt(f4Var.getMsgId());
        if (Yt != null) {
            str = Yt.field_fileFullPath;
            C86013q1.m106447h(str);
            ((C72684e) ((C53543s) C86312j.m106911c(cls)).mo74024KZ()).mo100152jo(Yt, new String[]{"msgInfoId"});
        } else {
            str = null;
        }
        String h302 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).h30(f4Var.mo108765s2());
        if (C86013q1.m106450k(h302)) {
            C86013q1.m106447h(h302);
        }
        if (f4Var.getMsgId() != 0) {
            C101147j0.m132629j(f4Var.getMsgId());
        }
        try {
            SingleTable singleTable = C38557f0.f102213n;
            i = C38557f0.f102213n.delete().where(C38557f0.f102214o.equal((Number) Long.valueOf(f4Var.getMsgId()))).build().run(C86709a0.m107535s().f251811i);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.AppMessageExtension", th, "delete appMsg err", new Object[0]);
            i = -2;
        }
        if (f4Var.mo101016t3()) {
            ((C119157j) C119157j.f356862d).mo183885p(new C99877f0(f4Var), "MicroMsg.MsgExtInfoStorageFSC_deleteFileAndTask");
            Log.m105924i("MicroMsg.MsgExtInfoStorageFSC", "delete extra msg info and all cdn info. msgId: " + Long.valueOf(f4Var.getMsgId()));
        }
        Log.m105929w("MicroMsg.AppMessageExtension", "onPreDelMessage, clean file, thumbPath:%s, attachFullPath:%s deleteAppMsgResult:%s", h302, str, Integer.valueOf(i));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r0 = new p1081gi.C98124g();
        r0.f287660d = "task_AppMessageExtension_2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r21) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        r6 = new java.lang.StringBuilder();
        r6.append("");
        r9 = r14;
        r6.append(r14);
        r4 = com.tencent.p014mm.modelcdntran.C1297x.m1387b("downappthumb", r15, r2, r6.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00aa, code lost:
        r0.field_mediaId = r4;
        r0.field_fullpath = r3;
        r0.field_fileType = r24;
        r0.field_totalLen = r20;
        r0.field_aesKey = r17;
        r0.field_fileId = r1;
        r0.field_priority = 3;
        r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r22);
        r0.field_chattype = r4 ? 1 : 0;
        r0.field_filemd5 = r19;
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.AppMessageExtension", "get img by cdn [appmsg 2] chatType[%d] user[%s] ", java.lang.Integer.valueOf(r4), r2);
        r4 = r12;
        r0.f287662f = new com.tencent.p014mm.pluginsdk.model.app.q$$d(r12, r1, r3);
        ((p663qo.C101213l) di3.C86312j.m106911c(p663qo.C101213l.class)).xf0(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ed, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f2, code lost:
        r0 = th;
     */
    /* renamed from: nA */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo56405nA(p872ah.C67046a r13, java.lang.String r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24) {
        /*
            r12 = this;
            r0 = r13
            r1 = r18
            r2 = r22
            r3 = r23
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r23)
            r5 = 0
            if (r4 == 0) goto L_0x000f
            return r5
        L_0x000f:
            if (r0 == 0) goto L_0x0017
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r13)
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            java.util.Map<java.lang.String, java.util.List<java.lang.ref.WeakReference<ah.a>>> r6 = f211498d
            monitor-enter(r6)
            r0 = r6
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x00ee }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x00ee }
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0057
            r0 = r6
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0057
            r0 = r6
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x00ee }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00ee }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = "MicroMsg.AppMessageExtension"
            java.lang.String r2 = "getImgByCdn() same:%s %s"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00ee }
            r9 = r6
            java.util.HashMap r9 = (java.util.HashMap) r9     // Catch:{ all -> 0x00ee }
            int r9 = r9.size()     // Catch:{ all -> 0x00ee }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00ee }
            r7[r5] = r9     // Catch:{ all -> 0x00ee }
            r7[r8] = r3     // Catch:{ all -> 0x00ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r7)     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0055
            r0.add(r4)     // Catch:{ all -> 0x00ee }
        L_0x0055:
            monitor-exit(r6)     // Catch:{ all -> 0x00ee }
            return r5
        L_0x0057:
            java.lang.String r0 = "MicroMsg.AppMessageExtension"
            java.lang.String r9 = "getImgByCdn() first:%s %s"
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ all -> 0x00ee }
            r11 = r6
            java.util.HashMap r11 = (java.util.HashMap) r11     // Catch:{ all -> 0x00ee }
            int r11 = r11.size()     // Catch:{ all -> 0x00ee }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00ee }
            r10[r5] = r11     // Catch:{ all -> 0x00ee }
            r10[r8] = r3     // Catch:{ all -> 0x00ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r9, r10)     // Catch:{ all -> 0x00ee }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x00ee }
            r0.<init>()     // Catch:{ all -> 0x00ee }
            r0.add(r4)     // Catch:{ all -> 0x00ee }
            r4 = r6
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x00ee }
            r4.put(r3, r0)     // Catch:{ all -> 0x00ee }
            monitor-exit(r6)     // Catch:{ all -> 0x00ee }
            gi.g r0 = new gi.g
            r0.<init>()
            java.lang.String r4 = "task_AppMessageExtension_2"
            r0.f287660d = r4
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r21)
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = "downappthumb"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = ""
            r6.append(r9)
            r9 = r14
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            r9 = r15
            java.lang.String r4 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r4, r9, r2, r6)
            goto L_0x00aa
        L_0x00a8:
            r4 = r21
        L_0x00aa:
            r0.field_mediaId = r4
            r0.field_fullpath = r3
            r4 = r24
            r0.field_fileType = r4
            r4 = r20
            r0.field_totalLen = r4
            r4 = r17
            r0.field_aesKey = r4
            r0.field_fileId = r1
            r4 = 3
            r0.field_priority = r4
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r22)
            r0.field_chattype = r4
            r6 = r19
            r0.field_filemd5 = r6
            java.lang.String r6 = "MicroMsg.AppMessageExtension"
            java.lang.String r9 = "get img by cdn [appmsg 2] chatType[%d] user[%s] "
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7[r5] = r4
            r7[r8] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r9, r7)
            com.tencent.mm.pluginsdk.model.app.q$$d r2 = new com.tencent.mm.pluginsdk.model.app.q$$d
            r4 = r12
            r2.<init>(r12, r1, r3)
            r0.f287662f = r2
            java.lang.Class<qo.l> r1 = p663qo.C101213l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qo.l r1 = (p663qo.C101213l) r1
            r1.xf0(r0)
            return r8
        L_0x00ee:
            r0 = move-exception
            r4 = r12
        L_0x00f0:
            monitor-exit(r6)     // Catch:{ all -> 0x00f2 }
            throw r0
        L_0x00f2:
            r0 = move-exception
            goto L_0x00f0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72689q.mo56405nA(ah.a, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }
}
