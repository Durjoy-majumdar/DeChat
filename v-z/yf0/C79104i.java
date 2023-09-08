package yf0;

import a11.C39479c;
import a63.C67008a;
import ag0.C27888a;
import ag0.C27890c;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import ie3.C76324c;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p740wo.C53193b;
import te3.C64820x;
import te3.C77910c0;
import te3.s94;
import vf0.C37726b;
import xz1.C79013a;
import xz1.C79014b;
import yq3.C79144b;
import yq3.C79148e;

/* renamed from: yf0.i */
public class C79104i {
    /* renamed from: a */
    public static String m95656a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        boolean z = !Util.isNullOrNil(str2);
        boolean z2 = !Util.isNullOrNil(str);
        if (z) {
            sb.append(str2);
        }
        if (z && z2) {
            sb.append("\n");
        }
        if (z2) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m95657b(String str) {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_RECENT_LAUNCH_AA_GROUP_STRING_SYNC;
        C86709a0.m107528h();
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119685f(aVar, (Object) null));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(",");
        if (!Util.isNullOrNil(nullAsNil)) {
            String[] split = nullAsNil.split(",");
            int i = 1;
            for (String str2 : split) {
                if (!str2.equals(str) && i < 5) {
                    sb.append(str2);
                    sb.append(",");
                    i++;
                }
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        Log.m105919d("MicroMsg.AAUtil", "recent group: %s", sb.toString());
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(aVar, sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m95658c(java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.Class<yf0.i> r0 = yf0.C79104i.class
            monitor-enter(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ all -> 0x00e8 }
            if (r1 != 0) goto L_0x00e6
            r1 = 0
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r12, r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r2 = "MicroMsg.AAUtil"
            java.lang.String r3 = "checkIfInsertAAMsg, billNo: %s, appMsgContent: %s"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x001a
            java.lang.String r6 = r1.f195640w1     // Catch:{ all -> 0x00e8 }
            goto L_0x001c
        L_0x001a:
            java.lang.String r6 = ""
        L_0x001c:
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = r12.trim()     // Catch:{ all -> 0x00e8 }
            java.lang.String r8 = " "
            java.lang.String r9 = ""
            java.lang.String r6 = r6.replace(r8, r9)     // Catch:{ all -> 0x00e8 }
            r8 = 1
            r5[r8] = r6     // Catch:{ all -> 0x00e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r5)     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00e6
            java.lang.String r2 = r1.f195640w1     // Catch:{ all -> 0x00e8 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x00e8 }
            if (r2 != 0) goto L_0x00e6
            java.lang.String r1 = r1.f195640w1     // Catch:{ all -> 0x00e8 }
            ag0.d r2 = vf0.C37726b.vx0()     // Catch:{ all -> 0x00e8 }
            ag0.c r2 = r2.mo55666Lo(r1)     // Catch:{ all -> 0x00e8 }
            java.lang.String r3 = "MicroMsg.AAUtil"
            java.lang.String r5 = "checkIfInsertAAMsg, record==null: %s, billNo: %s, insertMsg: %s, chatroom: %s, localMsgId: %s"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00e8 }
            if (r2 != 0) goto L_0x0050
            r9 = 1
            goto L_0x0051
        L_0x0050:
            r9 = 0
        L_0x0051:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x00e8 }
            r6[r7] = r9     // Catch:{ all -> 0x00e8 }
            r6[r8] = r1     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x0060
            boolean r9 = r2.field_insertmsg     // Catch:{ all -> 0x00e8 }
            if (r9 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r8 = 0
        L_0x0061:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x00e8 }
            r6[r4] = r8     // Catch:{ all -> 0x00e8 }
            r4 = 3
            r6[r4] = r13     // Catch:{ all -> 0x00e8 }
            r4 = 4
            r8 = 0
            if (r2 == 0) goto L_0x0072
            long r10 = r2.field_localMsgId     // Catch:{ all -> 0x00e8 }
            goto L_0x0073
        L_0x0072:
            r10 = r8
        L_0x0073:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00e8 }
            r6[r4] = r10     // Catch:{ all -> 0x00e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r6)     // Catch:{ all -> 0x00e8 }
            if (r2 != 0) goto L_0x0088
            java.lang.String r3 = "MicroMsg.AAUtil"
            java.lang.String r4 = "checkIfInsertAAMsg, record is null, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)     // Catch:{ all -> 0x00e8 }
            m95668m(r1, r7, r8)     // Catch:{ all -> 0x00e8 }
        L_0x0088:
            if (r2 == 0) goto L_0x00c2
            boolean r1 = r2.field_insertmsg     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00c2
            long r3 = r2.field_localMsgId     // Catch:{ all -> 0x00e8 }
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c2
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)     // Catch:{ all -> 0x00e8 }
            f62.k0 r1 = (f62.C75700k0) r1     // Catch:{ all -> 0x00e8 }
            g62.l r1 = r1.mo96095LE()     // Catch:{ all -> 0x00e8 }
            long r3 = r2.field_localMsgId     // Catch:{ all -> 0x00e8 }
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1     // Catch:{ all -> 0x00e8 }
            com.tencent.mm.storage.f4 r1 = r1.b00(r3)     // Catch:{ all -> 0x00e8 }
            long r3 = r1.getMsgId()     // Catch:{ all -> 0x00e8 }
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x00c2
            java.lang.String r12 = "MicroMsg.AAUtil"
            java.lang.String r13 = "checkIfInsertAAMsg, the oldMsgInfo has deleted, ignore this"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r13)     // Catch:{ all -> 0x00e8 }
            ag0.d r12 = vf0.C37726b.vx0()     // Catch:{ all -> 0x00e8 }
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ all -> 0x00e8 }
            r12.delete(r2, r13)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r0)
            return
        L_0x00c2:
            if (r2 == 0) goto L_0x00dc
            boolean r1 = r2.field_insertmsg     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00dc
            long r3 = r2.field_localMsgId     // Catch:{ all -> 0x00e8 }
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x00cf
            goto L_0x00dc
        L_0x00cf:
            java.lang.String r13 = "MicroMsg.AAUtil"
            java.lang.String r1 = "checkIfInsertAAMsg, update aa msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)     // Catch:{ all -> 0x00e8 }
            long r1 = r2.field_localMsgId     // Catch:{ all -> 0x00e8 }
            m95674s(r1, r12)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x00dc:
            java.lang.String r1 = "MicroMsg.AAUtil"
            java.lang.String r2 = "checkIfInsertAAMsg, insert new aa msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x00e8 }
            m95667l(r12, r13)     // Catch:{ all -> 0x00e8 }
        L_0x00e6:
            monitor-exit(r0)
            return
        L_0x00e8:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.C79104i.m95658c(java.lang.String, java.lang.String):void");
    }

    /* renamed from: d */
    public static double m95659d(String str, String str2, int i, int i2) {
        try {
            return new BigDecimal(Util.getDouble(str.trim(), 0.0d) == 0.0d ? "0" : str.trim()).divide(new BigDecimal(str2.trim()), i, i2).doubleValue();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.AAUtil", e, "", new Object[0]);
            return 0.0d;
        }
    }

    /* renamed from: e */
    public static boolean m95660e(Activity activity, C77910c0 c0Var) {
        int i = c0Var.f227110d;
        if (i == 1) {
            Log.m105924i("MicroMsg.AAUtil", "need realname verify");
            Bundle bundle = new Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.LaunchAAUI");
            bundle.putString("realname_verify_process_jump_plugin", "aa");
            return C67008a.m79172h(activity, c0Var.f227111e, 0, c0Var.f227112f, c0Var.f227113g, bundle, false, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, 0, 2);
        } else if (i == 2) {
            Log.m105924i("MicroMsg.AAUtil", "need upload credit");
            C67008a.m79173i(activity, c0Var.f227111e, c0Var.f227114h, c0Var.f227112f, c0Var.f227113g, false, (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105924i("MicroMsg.AAUtil", "realnameGuideFlag =  " + c0Var.f227110d);
            return false;
        }
    }

    /* renamed from: f */
    public static C64820x m95661f(List<C64820x> list) {
        for (C64820x next : list) {
            if (next.f186245d.equals(C75592q0.m90789s())) {
                return next;
            }
        }
        Log.m105924i("MicroMsg.AAUtil", "not contains self");
        return null;
    }

    /* renamed from: g */
    public static ArrayList<s94> m95662g(C79013a aVar, List<String> list) {
        C79014b bVar;
        ArrayList<s94> arrayList = new ArrayList<>();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (int i = 1; i <= aVar.f232007N.size(); i++) {
            C79014b bVar2 = aVar.f232007N.get(Integer.valueOf(i));
            if (bVar2 != null) {
                if (hashMap2.containsKey(bVar2.f232010a)) {
                    C79014b bVar3 = (C79014b) hashMap2.get(bVar2.f232010a);
                    Integer num = (Integer) hashMap3.get(bVar2.f232010a);
                    if (bVar3 != null) {
                        String str = bVar3.f232014e;
                        C79014b bVar4 = new C79014b();
                        bVar4.f232010a = bVar3.f232010a;
                        bVar4.f232012c = bVar3.f232012c;
                        bVar4.f232013d = bVar3.f232013d;
                        bVar4.f232014e = m95656a(i + bVar2.f232012c + bVar2.f232014e, str);
                        hashMap2.put(bVar4.f232010a, bVar4);
                        hashMap3.put(bVar4.f232010a, num);
                        hashMap.put(num, bVar4);
                    }
                } else {
                    int size = hashMap3.size() + 1;
                    C79014b bVar5 = new C79014b();
                    bVar5.f232010a = bVar2.f232010a;
                    bVar5.f232012c = bVar2.f232012c;
                    bVar5.f232013d = bVar2.f232013d;
                    bVar5.f232014e = i + bVar2.f232012c + bVar2.f232014e;
                    hashMap2.put(bVar5.f232010a, bVar5);
                    hashMap3.put(bVar5.f232010a, Integer.valueOf(size));
                    hashMap.put(Integer.valueOf(size), bVar5);
                }
            }
        }
        for (String next : list) {
            if (hashMap2.containsKey(next) && (bVar = (C79014b) hashMap2.get(next)) != null) {
                s94 s94 = new s94();
                s94.f185389d = bVar.f232010a;
                s94.f185390e = bVar.f232014e;
                arrayList.add(s94);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static HashMap<Integer, C79014b> m95663h(C79013a aVar) {
        HashMap<Integer, C79014b> hashMap = new HashMap<>();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (int i = 1; i <= aVar.f232007N.size(); i++) {
            C79014b bVar = aVar.f232007N.get(Integer.valueOf(i));
            if (bVar != null) {
                if (hashMap2.containsKey(bVar.f232010a)) {
                    C79014b bVar2 = (C79014b) hashMap2.get(bVar.f232010a);
                    Integer num = (Integer) hashMap3.get(bVar.f232010a);
                    if (bVar2 != null) {
                        String str = bVar2.f232014e;
                        C79014b bVar3 = new C79014b();
                        bVar3.f232010a = bVar2.f232010a;
                        bVar3.f232012c = bVar2.f232012c;
                        bVar3.f232013d = bVar2.f232013d;
                        bVar3.f232014e = m95656a(i + bVar.f232012c + bVar.f232014e, str);
                        hashMap2.put(bVar3.f232010a, bVar3);
                        hashMap3.put(bVar3.f232010a, num);
                        hashMap.put(num, bVar3);
                    }
                } else {
                    int size = hashMap3.size() + 1;
                    C79014b bVar4 = new C79014b();
                    bVar4.f232010a = bVar.f232010a;
                    bVar4.f232012c = bVar.f232012c;
                    bVar4.f232013d = bVar.f232013d;
                    bVar4.f232014e = i + bVar.f232012c + bVar.f232014e;
                    hashMap2.put(bVar4.f232010a, bVar4);
                    hashMap3.put(bVar4.f232010a, Integer.valueOf(size));
                    hashMap.put(Integer.valueOf(size), bVar4);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    public static List<String> m95664i(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.AAUtil", "illegal chatroomName");
            return new ArrayList();
        } else if (!C72996z1.m85820U5(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C75592q0.m90789s());
            arrayList.add(str);
            return arrayList;
        } else {
            try {
                List<String> bD = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69804bD(str);
                return bD == null ? new ArrayList() : bD;
            } catch (Exception e) {
                Log.m105921e("MicroMsg.AAUtil", "getChatroomMemberList error! %s", e.getMessage());
                return new ArrayList();
            }
        }
    }

    /* renamed from: j */
    public static String m95665j(int i, String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        int length = (str.length() - str.replaceAll("\n", "").length()) + i;
        int c = C45078p0.m49924c(length, str);
        if (c <= 0 || c >= length || c >= str.length()) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(str.substring(0, c + 1));
        stringBuffer.append("...");
        return stringBuffer.toString();
    }

    /* renamed from: k */
    public static ArrayList<String> m95666k(List<String> list, String str, boolean z, boolean z2) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String next : list) {
            if ((!z || !next.equals(C75592q0.m90789s())) && (!z2 || m95670o(str, next))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0136, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m95667l(java.lang.String r16, java.lang.String r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.Class<gt.k> r2 = p158gt.C98201k.class
            java.lang.Class<yf0.i> r3 = yf0.C79104i.class
            monitor-enter(r3)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r16)     // Catch:{ all -> 0x0137 }
            if (r4 != 0) goto L_0x0135
            r4 = 0
            com.tencent.mm.message.l$b r5 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r4)     // Catch:{ all -> 0x0137 }
            if (r5 == 0) goto L_0x0135
            java.lang.String r6 = r5.f195640w1     // Catch:{ all -> 0x0137 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x0135
            ag0.d r6 = vf0.C37726b.vx0()     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = r5.f195640w1     // Catch:{ all -> 0x0137 }
            ag0.c r6 = r6.mo55666Lo(r7)     // Catch:{ all -> 0x0137 }
            java.lang.String r7 = "MicroMsg.AAUtil"
            java.lang.String r8 = "insertAAMsg, billNo: %s, chatroom: %s, oldRecord: %s, insertMsg: %s, localMsgId: %s"
            r9 = 5
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x0137 }
            java.lang.String r10 = r5.f195640w1     // Catch:{ all -> 0x0137 }
            r11 = 0
            r9[r11] = r10     // Catch:{ all -> 0x0137 }
            r10 = 1
            r9[r10] = r1     // Catch:{ all -> 0x0137 }
            r12 = 2
            r9[r12] = r6     // Catch:{ all -> 0x0137 }
            if (r6 == 0) goto L_0x0041
            boolean r12 = r6.field_insertmsg     // Catch:{ all -> 0x0137 }
            if (r12 == 0) goto L_0x0041
            r11 = 1
        L_0x0041:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x0137 }
            r12 = 3
            r9[r12] = r11     // Catch:{ all -> 0x0137 }
            r11 = 4
            r13 = 0
            if (r6 == 0) goto L_0x0051
            r15 = r5
            long r4 = r6.field_localMsgId     // Catch:{ all -> 0x0137 }
            goto L_0x0053
        L_0x0051:
            r15 = r5
            r4 = r13
        L_0x0053:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0137 }
            r9[r11] = r4     // Catch:{ all -> 0x0137 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r9)     // Catch:{ all -> 0x0137 }
            if (r6 != 0) goto L_0x0067
            java.lang.String r0 = "MicroMsg.AAUtil"
            java.lang.String r1 = "insertAAMsg, record is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0137 }
            monitor-exit(r3)
            return
        L_0x0067:
            boolean r4 = r6.field_insertmsg     // Catch:{ all -> 0x0137 }
            if (r4 == 0) goto L_0x0071
            long r4 = r6.field_localMsgId     // Catch:{ all -> 0x0137 }
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x0135
        L_0x0071:
            com.tencent.mm.storage.f4 r4 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x0137 }
            r4.<init>()     // Catch:{ all -> 0x0137 }
            long r5 = eb0.C75604z3.m90843o(r17)     // Catch:{ all -> 0x0137 }
            r4.mo108733M2(r5)     // Catch:{ all -> 0x0137 }
            r5 = 436207665(0x1a000031, float:2.6469934E-23)
            r4.setType(r5)     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = eb0.C75592q0.m90789s()     // Catch:{ all -> 0x0137 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0137 }
            r6.<init>()     // Catch:{ all -> 0x0137 }
            r6.append(r5)     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = ":\n"
            r6.append(r5)     // Catch:{ all -> 0x0137 }
            r6.append(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0137 }
            r4.mo108732L2(r0)     // Catch:{ all -> 0x0137 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0137 }
            r0.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = ""
            r0.append(r5)     // Catch:{ all -> 0x0137 }
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x0137 }
            r0.append(r5)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0137 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = p823sg.C90193h.m112878f(r0)     // Catch:{ all -> 0x0137 }
            di3.d r5 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0137 }
            gt.k r5 = (p158gt.C98201k) r5     // Catch:{ all -> 0x0137 }
            gt.m r5 = r5.mo137277xi()     // Catch:{ all -> 0x0137 }
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5     // Catch:{ all -> 0x0137 }
            java.lang.String r5 = r5.mo127193mf(r0)     // Catch:{ all -> 0x0137 }
            di3.d r2 = di3.C86312j.m106911c(r2)     // Catch:{ all -> 0x0137 }
            gt.k r2 = (p158gt.C98201k) r2     // Catch:{ all -> 0x0137 }
            gt.m r2 = r2.mo137277xi()     // Catch:{ all -> 0x0137 }
            com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r2.Ab0(r0)     // Catch:{ all -> 0x0137 }
            gc0.a r2 = gc0.C20828a.m22825b()     // Catch:{ all -> 0x0137 }
            r6 = r15
            java.lang.String r7 = r6.f195576g1     // Catch:{ all -> 0x0137 }
            hc0.c$b r8 = new hc0.c$b     // Catch:{ all -> 0x0137 }
            r8.<init>()     // Catch:{ all -> 0x0137 }
            r8.f59350f = r5     // Catch:{ all -> 0x0137 }
            r8.f59346b = r10     // Catch:{ all -> 0x0137 }
            hc0.c r5 = r8.mo32666a()     // Catch:{ all -> 0x0137 }
            r8 = 0
            r2.mo32519h(r7, r8, r5)     // Catch:{ all -> 0x0137 }
            r4.mo108739S2(r0)     // Catch:{ all -> 0x0137 }
            r4.mo108740T2(r10)     // Catch:{ all -> 0x0137 }
            r4.mo108749c3(r1)     // Catch:{ all -> 0x0137 }
            r4.mo100991d(r12)     // Catch:{ all -> 0x0137 }
            long r0 = eb0.C75604z3.m90852x(r4)     // Catch:{ all -> 0x0137 }
            r4.setMsgId(r0)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "MicroMsg.AAUtil"
            java.lang.String r1 = "finish insert aa msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r6.f195640w1     // Catch:{ all -> 0x0137 }
            long r1 = r4.getMsgId()     // Catch:{ all -> 0x0137 }
            m95668m(r0, r10, r1)     // Catch:{ all -> 0x0137 }
            com.tencent.mm.message.l r0 = new com.tencent.mm.message.l     // Catch:{ all -> 0x0137 }
            r0.<init>()     // Catch:{ all -> 0x0137 }
            r6.mo93547j(r0)     // Catch:{ all -> 0x0137 }
            long r1 = r4.getMsgId()     // Catch:{ all -> 0x0137 }
            r0.field_msgId = r1     // Catch:{ all -> 0x0137 }
            java.lang.Class<ym.s> r1 = p763ym.C53543s.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x0137 }
            ym.s r1 = (p763ym.C53543s) r1     // Catch:{ all -> 0x0137 }
            ym.n r1 = r1.mo74023HM()     // Catch:{ all -> 0x0137 }
            com.tencent.mm.pluginsdk.model.app.s r1 = (com.tencent.p014mm.pluginsdk.model.app.C96776s) r1     // Catch:{ all -> 0x0137 }
            r1.mo135039jo(r0)     // Catch:{ all -> 0x0137 }
        L_0x0135:
            monitor-exit(r3)
            return
        L_0x0137:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yf0.C79104i.m95667l(java.lang.String, java.lang.String):void");
    }

    /* renamed from: m */
    public static synchronized void m95668m(String str, boolean z, long j) {
        synchronized (C79104i.class) {
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.AAUtil", "insertOrUpdateAARecord, billNo: %s, insertMsg: %s", str, Boolean.valueOf(z));
                C27890c cVar = new C27890c();
                cVar.field_billNo = str;
                cVar.field_insertmsg = z;
                cVar.field_localMsgId = j;
                C37726b.vx0().replace(cVar);
            }
        }
    }

    /* renamed from: n */
    public static synchronized void m95669n(String str, String str2, C27888a aVar, String str3, boolean z) {
        synchronized (C79104i.class) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108740T2(0);
            f4Var.mo108749c3(str2);
            f4Var.mo100991d(3);
            f4Var.mo108732L2(str);
            f4Var.mo108733M2(C75604z3.m90841m(str2, System.currentTimeMillis() / 1000));
            f4Var.setType(10000);
            if (z) {
                f4Var.mo108735O2(f4Var.mo108762o2() | 8);
            }
            long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
            Log.m105925i("MicroMsg.AAUtil", "insertPaySysMsg, inserted msgId: %s", Long.valueOf(my02));
            if (aVar == null) {
                aVar = new C27888a();
            }
            if (my02 > 0) {
                aVar.field_payMsgId = str3;
                aVar.field_chatroom = str2;
                aVar.field_insertmsg = true;
                aVar.field_msgId = my02;
                C37726b.xx0().replace(aVar);
            }
        }
    }

    /* renamed from: o */
    public static boolean m95670o(String str, String str2) {
        List<String> k5;
        if (!C72996z1.m85820U5(str) || (k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(str)) == null || k5.size() <= 0) {
            return true;
        }
        for (String equals : k5) {
            if (str2.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static synchronized void m95671p(String str, String str2, String str3) {
        synchronized (C79104i.class) {
            C27890c Lo = C37726b.vx0().mo55666Lo(str);
            Log.m105925i("MicroMsg.AAUtil", "setAARecordAfterLaunchAA, billNo: %s, chatroom: %s, msgContent==null:%s, oldRecord: %s", str, str2, Boolean.valueOf(Util.isNullOrNil(str3)), Lo);
            if (Lo == null) {
                m95668m(str, false, 0);
            }
            m95658c(str3, str2);
        }
    }

    /* renamed from: q */
    public static void m95672q(Context context, String str, boolean z, String str2, String str3, String str4, int i) {
        Log.m105919d("MicroMsg.AAUtil", "startAAPay, reqKey: %s, isFromChatting: %s", str, Boolean.valueOf(z));
        PayInfo payInfo = new PayInfo();
        payInfo.f212592j = str;
        payInfo.f212587e = 42;
        if (z) {
            payInfo.f212589g = 14;
        } else {
            payInfo.f212589g = 1;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extinfo_key_1", str3);
        int i2 = (C45628s0.m50748M(str4) ? WCPaySessionInfoRecorder.C72488a.EnterpriseGroup : C72996z1.m85843n5(str4) ? WCPaySessionInfoRecorder.C72488a.EnterpriseSingle : C72996z1.m85807K5(str4) ? WCPaySessionInfoRecorder.C72488a.Group : C72996z1.m85809L5(str4) ? WCPaySessionInfoRecorder.C72488a.Single : WCPaySessionInfoRecorder.C72488a.Unknown).f210873d;
        int i3 = (C72996z1.m85809L5(str3) ? WCPaySessionInfoRecorder.C72491c.Common : C72996z1.m85843n5(str3) ? WCPaySessionInfoRecorder.C72491c.Enterprise : WCPaySessionInfoRecorder.C72491c.Unknown).f210882d;
        bundle.putInt("chat_type", i2);
        bundle.putInt("send_type", i3);
        payInfo.f212600u = bundle;
        C79144b.m95773a().getClass();
        payInfo.f212600u.putString("extinfo_key_2", str2);
        ((C76324c) C86312j.m106911c(C76324c.class)).startSNSPay(context, payInfo);
    }

    /* renamed from: r */
    public static double m95673r(double d) {
        return m95659d("" + d, "100", 2, 4);
    }

    /* renamed from: s */
    public static synchronized void m95674s(long j, String str) {
        long j2 = j;
        String str2 = str;
        Class cls = C75700k0.class;
        synchronized (C79104i.class) {
            if (j2 > 0) {
                if (!Util.isNullOrNil(str)) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(str2, (String) null);
                    if (u == null || Util.isNullOrNil(u.f195640w1)) {
                        Log.m105921e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, parse app msg failed, msgId: %s", Long.valueOf(j));
                    } else {
                        Log.m105925i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgId: %s, billNo: %s", Long.valueOf(j), u.f195640w1);
                        C27890c Lo = C37726b.vx0().mo55666Lo(u.f195640w1);
                        if (Lo != null) {
                            long j3 = Lo.field_localMsgId;
                            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j3);
                            if (b002.getMsgId() > 0) {
                                String s = C75604z3.m90847s(b002.getContent());
                                b002.mo108732L2(s + ":\n" + str2);
                                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(j3, b002);
                                Log.m105925i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, update success, oldMsgId: %s, billNo: %s", Long.valueOf(j3), Lo.field_billNo);
                            } else {
                                Log.m105921e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, cannot find old msg, insert new one, billNo: %s, oldMsgId: %s, newMsgId: %s, needUpdateInfo.msgId: %s", Lo.field_billNo, Long.valueOf(Lo.field_localMsgId), Long.valueOf(j), Long.valueOf(b002.getMsgId()));
                            }
                        } else {
                            C27890c cVar = new C27890c();
                            cVar.field_localMsgId = j2;
                            cVar.field_billNo = u.f195640w1;
                            cVar.field_insertmsg = true;
                            C37726b.vx0().insert(cVar);
                            Log.m105925i("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, insert new aa record, msgId: %s, billNo: %s", Long.valueOf(j), u.f195640w1);
                        }
                    }
                }
            }
            Log.m105921e("MicroMsg.AAUtil", "updateAARecordMsgAfterReceive, msgContent is null or msgId invalid, msgId: %s, %s", Long.valueOf(j), Boolean.valueOf(Util.isNullOrNil(str)));
        }
    }

    /* renamed from: t */
    public static void m95675t(long j, String str) {
        Class cls = C75700k0.class;
        Log.m105925i("MicroMsg.AAUtil", "do update sys msg, %s, %s", Long.valueOf(j), str);
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
        Map<String, String> parseXml = XmlParser.parseXml(str, "sysmsg", (String) null);
        String str2 = "";
        if (parseXml != null) {
            String str3 = parseXml.get(".sysmsg.paymsg.appmsgcontent");
            if (Util.isNullOrNil(str3)) {
                Log.m105920e("MicroMsg.AAUtil", "empty appmsgcontent!");
            } else {
                try {
                    str2 = URLDecoder.decode(str3, "UTF-8");
                    Log.m105919d("MicroMsg.AAUtil", "msgContent: %s", str2);
                } catch (UnsupportedEncodingException e) {
                    Log.m105920e("MicroMsg.AAUtil", e.getMessage());
                }
            }
        }
        if (!Util.isNullOrNil(str2)) {
            b002.mo108732L2(str2);
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(j, b002);
    }
}
