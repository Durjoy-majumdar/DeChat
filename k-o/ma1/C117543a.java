package ma1;

import android.content.Context;
import android.content.Intent;
import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.autogen.events.ConfigUpdatedEvent;
import com.tencent.p014mm.autogen.events.ExptChangeEvent;
import com.tencent.p014mm.autogen.events.NewEdgeScriptDeleteEvent;
import com.tencent.p014mm.autogen.events.NewEdgeScriptUpdateEvent;
import com.tencent.p014mm.autogen.events.NewEdgeSqlDeleteEvent;
import com.tencent.p014mm.autogen.events.NewEdgeSqlUpdateEvent;
import com.tencent.p014mm.autogen.events.SessionConfigChangeEvent;
import com.tencent.p014mm.autogen.events.SessionEdgeScriptChangeEvent;
import com.tencent.p014mm.autogen.events.SessionEdgeSqlChangeEvent;
import com.tencent.p014mm.autogen.events.SessionPageConfigChangeEvent;
import com.tencent.p014mm.autogen.events.SessionUBAConfigChangeEvent;
import com.tencent.p014mm.autogen.events.SessionViewBlackListChangeEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ExptAppReportDeleteStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.ExptAppReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.XExptClientRptStruct;
import com.tencent.p014mm.plugin.expt.p472ui.ExptAppDebugUI;
import com.tencent.p014mm.plugin.expt.p472ui.ExptDebugUI;
import com.tencent.p014mm.plugin.expt.shell.ExptServiceShell;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f81.C116807d;
import g81.C32343a;
import g81.C59377b;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;
import k20.C9556a;
import kf3.C61081c;
import kj2.C117407d;
import o90.C100308d;
import oa1.C117731d;
import oa1.C47346c;
import oa1.C61982a;
import oa1.C61983b;
import oa3.C117732f;
import oa3.C117733g;
import oa3.C35122c;
import org.json.JSONObject;
import p823sg.C101611g;
import p823sg.C77710q;
import p910lj.C76701a;
import pa1.C117998b;
import pa1.C35418c;
import pa1.C47444d;
import q90.C101062d;
import te3.C50782p5;
import zt3.C119157j;

@C86522b(dependencies = {C116807d.class})
/* renamed from: ma1.a */
public class C117543a extends C86301e implements C32735h {

    /* renamed from: d */
    public C47444d f351658d;

    /* renamed from: e */
    public C117998b f351659e;

    /* renamed from: f */
    public int f351660f = 0;

    /* renamed from: g */
    public int f351661g = 0;

    /* renamed from: h */
    public final C101611g<Integer, C47346c> f351662h = new C100308d(500);

    /* renamed from: i */
    public final C101611g<String, Integer> f351663i = new C100308d(1000);

    /* renamed from: j */
    public boolean f351664j = false;

    /* renamed from: ma1.a$a */
    public class C34491a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f92827d;

        public C34491a(C117543a aVar, String str) {
            this.f92827d = str;
        }

        public void run() {
            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) this.f92827d, 1).show();
        }
    }

    public static C117543a Cx0() {
        return (C117543a) C86312j.m106911c(C117543a.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r4 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        ((q90.C101062d) r13.f351663i).put(r14, java.lang.Integer.valueOf(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Ax0(java.lang.String r14) {
        /*
            r13 = this;
            sg.g<java.lang.String, java.lang.Integer> r0 = r13.f351663i
            q90.d r0 = (q90.C101062d) r0
            java.lang.Object r0 = r0.get(r14)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0011
            int r14 = r0.intValue()
            return r14
        L_0x0011:
            pa1.b r0 = r13.f351659e
            r0.getClass()
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f352694d     // Catch:{ Exception -> 0x0043 }
            java.lang.String r6 = "ExptKeyMapId"
            java.lang.String r0 = "exptId"
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0043 }
            java.lang.String r8 = "exptKey=?"
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0043 }
            r9[r2] = r14     // Catch:{ Exception -> 0x0043 }
            r10 = 0
            r11 = 0
            r12 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x003e
            boolean r0 = r4.moveToFirst()     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x003e
            int r0 = r4.getInt(r2)     // Catch:{ Exception -> 0x0043 }
            r3 = r0
        L_0x003e:
            if (r4 == 0) goto L_0x005b
            goto L_0x0058
        L_0x0041:
            r14 = move-exception
            goto L_0x0067
        L_0x0043:
            r0 = move-exception
            java.lang.String r5 = "MicroMsg.ExptKeyMapIdStorage"
            java.lang.String r6 = "get expt id [%s] [%s]"
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0041 }
            r7[r2] = r14     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0041 }
            r7[r1] = r0     // Catch:{ all -> 0x0041 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r7)     // Catch:{ all -> 0x0041 }
            if (r4 == 0) goto L_0x005b
        L_0x0058:
            r4.close()
        L_0x005b:
            sg.g<java.lang.String, java.lang.Integer> r0 = r13.f351663i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            q90.d r0 = (q90.C101062d) r0
            r0.put(r14, r1)
            return r3
        L_0x0067:
            if (r4 == 0) goto L_0x006c
            r4.close()
        L_0x006c:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.C117543a.Ax0(java.lang.String):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: oa1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: oa1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: oa1.c} */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public oa1.C47346c Bx0(int r14) {
        /*
            r13 = this;
            sg.g<java.lang.Integer, oa1.c> r0 = r13.f351662h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            q90.d r0 = (q90.C101062d) r0
            java.lang.Object r0 = r0.get(r1)
            oa1.c r0 = (oa1.C47346c) r0
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            pa1.d r0 = r13.f351658d
            r0.getClass()
            r1 = 0
            r2 = 1
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r0.f127268d     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.String r5 = "ExptItem"
            r6 = 0
            java.lang.String r7 = "exptId=?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            r0.<init>()     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            r0.append(r14)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.String r9 = ""
            r0.append(r9)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            r8[r1] = r0     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r0 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x005d, all -> 0x005b }
            if (r0 == 0) goto L_0x0055
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x0050 }
            if (r4 == 0) goto L_0x0055
            oa1.c r4 = new oa1.c     // Catch:{ Exception -> 0x0050 }
            r4.<init>()     // Catch:{ Exception -> 0x0050 }
            r4.convertFrom(r0)     // Catch:{ Exception -> 0x004e }
            r3 = r4
            goto L_0x0055
        L_0x004e:
            r3 = move-exception
            goto L_0x0061
        L_0x0050:
            r4 = move-exception
            r12 = r4
            r4 = r3
            r3 = r12
            goto L_0x0061
        L_0x0055:
            if (r0 == 0) goto L_0x0076
            r0.close()
            goto L_0x0076
        L_0x005b:
            r14 = move-exception
            goto L_0x0086
        L_0x005d:
            r0 = move-exception
            r4 = r3
            r3 = r0
            r0 = r4
        L_0x0061:
            java.lang.String r5 = "MicroMsg.ExptStorage"
            java.lang.String r6 = "get expt error [%s]"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0084 }
            r2[r1] = r3     // Catch:{ all -> 0x0084 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r6, r2)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0075
            r0.close()
        L_0x0075:
            r3 = r4
        L_0x0076:
            if (r3 == 0) goto L_0x0083
            sg.g<java.lang.Integer, oa1.c> r0 = r13.f351662h
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            q90.d r0 = (q90.C101062d) r0
            r0.put(r14, r3)
        L_0x0083:
            return r3
        L_0x0084:
            r14 = move-exception
            r3 = r0
        L_0x0086:
            if (r3 == 0) goto L_0x008b
            r3.close()
        L_0x008b:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.C117543a.Bx0(int):oa1.c");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v3, types: [android.database.Cursor] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r5 == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ExptKeyMapIdStorage", "get key count[%d] cost[%d]", java.lang.Long.valueOf(r7), java.lang.Long.valueOf(com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r5 != 0) goto L_0x0039;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Dx0() {
        /*
            r11 = this;
            pa1.b r0 = r11.f351659e
            r0.getClass()
            java.lang.String r1 = "MicroMsg.ExptKeyMapIdStorage"
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f352694d     // Catch:{ Exception -> 0x0029 }
            java.lang.String r9 = "SELECT count(*) FROM ExptKeyMapId"
            android.database.Cursor r5 = r0.rawQuery(r9, r5)     // Catch:{ Exception -> 0x0029 }
            if (r5 == 0) goto L_0x0024
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0029 }
            if (r0 == 0) goto L_0x0024
            long r7 = r5.getLong(r6)     // Catch:{ Exception -> 0x0029 }
        L_0x0024:
            if (r5 == 0) goto L_0x003c
            goto L_0x0039
        L_0x0027:
            r0 = move-exception
            goto L_0x0055
        L_0x0029:
            r0 = move-exception
            java.lang.String r9 = "get key count error [%s]"
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x0027 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0027 }
            r10[r6] = r0     // Catch:{ all -> 0x0027 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r9, r10)     // Catch:{ all -> 0x0027 }
            if (r5 == 0) goto L_0x003c
        L_0x0039:
            r5.close()
        L_0x003c:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r0[r6] = r5
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0[r4] = r2
            java.lang.String r2 = "get key count[%d] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            return r7
        L_0x0055:
            if (r5 == 0) goto L_0x005a
            r5.close()
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.C117543a.Dx0():long");
    }

    public void Ex0(C47346c cVar, boolean z) {
        if (cVar != null && cVar.mo72387o2()) {
            if (cVar.field_subType == 1) {
                C117543a Cx0 = Cx0();
                String s2 = cVar.mo72391s2();
                boolean q2 = cVar.mo72389q2();
                Cx0.getClass();
                Log.m105925i("MicroMsg.ExptService.Write", "notify session config json[%b] needReport[%b] isDel[%b]", Boolean.valueOf(Util.isNullOrNil(s2)), Boolean.valueOf(q2), Boolean.FALSE);
                SessionConfigChangeEvent sessionConfigChangeEvent = new SessionConfigChangeEvent();
                SessionConfigChangeEvent.C114689a aVar = sessionConfigChangeEvent.f343596d;
                aVar.f343597a = s2;
                aVar.f343599c = Boolean.valueOf(Util.isNullOrNil(s2));
                sessionConfigChangeEvent.f343596d.f343598b = Boolean.valueOf(q2);
                sessionConfigChangeEvent.publish();
            }
            if (cVar.field_subType == 2) {
                C117543a Cx02 = Cx0();
                String s25 = cVar.mo72391s2();
                Cx02.getClass();
                Boolean bool = Boolean.FALSE;
                Log.m105925i("MicroMsg.ExptService.Write", "notify session uba config json[%b] isDel[%b]", Boolean.valueOf(Util.isNullOrNil(s25)), bool);
                SessionUBAConfigChangeEvent sessionUBAConfigChangeEvent = new SessionUBAConfigChangeEvent();
                SessionUBAConfigChangeEvent.C114693a aVar2 = sessionUBAConfigChangeEvent.f343615d;
                aVar2.f343616a = s25;
                aVar2.f343617b = bool;
                sessionUBAConfigChangeEvent.publish();
            }
            if (cVar.field_subType == 3) {
                C117543a Cx03 = Cx0();
                HashMap<String, String> hashMap = cVar.f127044H;
                long j = 0;
                if (hashMap != null && hashMap.size() > 0) {
                    HashMap<String, String> hashMap2 = cVar.f127044H;
                    j = Util.getLong(hashMap2.get("jsoncfg_param_" + cVar.field_exptId + "_" + "sessionpageid"), 0);
                }
                String s26 = cVar.mo72391s2();
                boolean q25 = cVar.mo72389q2();
                Cx03.getClass();
                Boolean bool2 = Boolean.FALSE;
                Log.m105925i("MicroMsg.ExptService.Write", "notify session page config sessionPageId [%d] json[%s] needReport[%b] isDel[%b]", Long.valueOf(j), s26, Boolean.valueOf(q25), bool2);
                SessionPageConfigChangeEvent sessionPageConfigChangeEvent = new SessionPageConfigChangeEvent();
                SessionPageConfigChangeEvent.C114692a aVar3 = sessionPageConfigChangeEvent.f343608d;
                aVar3.f343609a = j;
                aVar3.f343610b = s26;
                aVar3.f343612d = bool2;
                aVar3.f343613e = Boolean.valueOf(q25);
                sessionPageConfigChangeEvent.f343608d.f343611c = new ArrayList();
                sessionPageConfigChangeEvent.f343608d.f343614f = 1;
                sessionPageConfigChangeEvent.publish();
            }
            if (cVar.field_subType == 4) {
                C117543a Cx04 = Cx0();
                long j2 = (long) cVar.field_exptId;
                String s27 = cVar.mo72391s2();
                Cx04.getClass();
                Log.m105925i("MicroMsg.ExptService.Write", "notify session view black list config sessionPageId [%d] json[%s] isDel[%b]", Long.valueOf(j2), s27, Boolean.valueOf(z));
                SessionViewBlackListChangeEvent sessionViewBlackListChangeEvent = new SessionViewBlackListChangeEvent();
                sessionViewBlackListChangeEvent.f343618d.f343621c = Boolean.valueOf(z);
                SessionViewBlackListChangeEvent.C114694a aVar4 = sessionViewBlackListChangeEvent.f343618d;
                aVar4.f343620b = s27;
                aVar4.f343619a = j2;
                sessionViewBlackListChangeEvent.publish();
            }
            if (cVar.field_subType == 5) {
                C117543a Cx05 = Cx0();
                long j3 = (long) cVar.field_exptId;
                String s28 = cVar.mo72391s2();
                Cx05.getClass();
                Log.m105925i("MicroMsg.ExptService.Write", "notify session edge script config sessionPageId [%d] json[%s] isDel[%b]", Long.valueOf(j3), s28, Boolean.valueOf(z));
                SessionEdgeScriptChangeEvent sessionEdgeScriptChangeEvent = new SessionEdgeScriptChangeEvent();
                sessionEdgeScriptChangeEvent.f343600d.f343603c = Boolean.valueOf(z);
                SessionEdgeScriptChangeEvent.C114690a aVar5 = sessionEdgeScriptChangeEvent.f343600d;
                aVar5.f343602b = s28;
                aVar5.f343601a = j3;
                sessionEdgeScriptChangeEvent.publish();
            }
            if (cVar.field_subType == 6) {
                C117543a Cx06 = Cx0();
                long j4 = (long) cVar.field_exptId;
                String s29 = cVar.mo72391s2();
                Cx06.getClass();
                Log.m105925i("MicroMsg.ExptService.Write", "notify session edge sql config sessionPageId [%d] json[%s] isDel[%b]", Long.valueOf(j4), s29, Boolean.valueOf(z));
                SessionEdgeSqlChangeEvent sessionEdgeSqlChangeEvent = new SessionEdgeSqlChangeEvent();
                sessionEdgeSqlChangeEvent.f343604d.f343607c = Boolean.valueOf(z);
                SessionEdgeSqlChangeEvent.C114691a aVar6 = sessionEdgeSqlChangeEvent.f343604d;
                aVar6.f343606b = s29;
                aVar6.f343605a = j4;
                sessionEdgeSqlChangeEvent.publish();
            }
        }
    }

    /* renamed from: F5 */
    public String mo58776F5(String str, String str2) {
        return yx0(str, str2, true);
    }

    public void Fx0(String str) {
        String str2 = str;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.ExptService", "receive expt xml but content is null");
            return;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        C47346c cVar = new C47346c();
        if (cVar.mo72384l2(str2)) {
            if (cVar.field_exptId == 0) {
                C115669n.INSTANCE.idkeyStat(863, 9, 1, false);
                try {
                    Ix0(new JSONObject(str2).optInt("TryGetTime"));
                    this.f351664j = true;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ExptService", e, "on get xml msg reset get expt time error [%s]", e.toString());
                }
                Jx0(false);
                Mx0(4);
                Log.m105924i("MicroMsg.ExptService", "rece xml to get expt app");
                return;
            } else if (cVar.field_exptSeq < 0) {
                C115669n.INSTANCE.idkeyStat(863, 3, 1, false);
                linkedList.add(Integer.valueOf(cVar.field_exptId));
            } else {
                C115669n.INSTANCE.idkeyStat(863, 4, 1, false);
                linkedList2.add(cVar);
            }
        }
        Nx0(0, linkedList, linkedList2, (List<C50782p5>) null);
        Kx0(cVar, (C61982a) null);
        Log.m105925i("MicroMsg.ExptService.Write", "received expt xml [%s] ", str2);
    }

    public void Gx0(HashSet<C47346c> hashSet, HashSet<C61982a> hashSet2) {
        int i;
        int i2;
        HashMap<String, String> c;
        HashMap<String, String> r2;
        long currentTicks = Util.currentTicks();
        if (hashSet != null) {
            Iterator<C47346c> it = hashSet.iterator();
            i = 0;
            while (it.hasNext()) {
                C47346c next = it.next();
                if (!(next == null || (r2 = next.mo72390r2()) == null)) {
                    for (String next2 : r2.keySet()) {
                        Log.m105927v("MicroMsg.ExptService.Write", "notifyExptKeyChange [%s]", next2);
                        ConfigUpdatedEvent configUpdatedEvent = new ConfigUpdatedEvent();
                        configUpdatedEvent.f9044d.f9045a = next2;
                        configUpdatedEvent.publish();
                        i++;
                    }
                }
            }
        } else {
            i = 0;
        }
        if (hashSet2 != null) {
            Iterator<C61982a> it4 = hashSet2.iterator();
            i2 = 0;
            while (it4.hasNext()) {
                C61982a next3 = it4.next();
                if (!(next3 == null || (c = next3.mo86864c()) == null)) {
                    for (String next4 : c.keySet()) {
                        Log.m105927v("MicroMsg.ExptService.Write", "notifyExptKeyChange [%s]", next4);
                        ConfigUpdatedEvent configUpdatedEvent2 = new ConfigUpdatedEvent();
                        configUpdatedEvent2.f9044d.f9045a = next4;
                        configUpdatedEvent2.publish();
                        i2++;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        Log.m105925i("MicroMsg.ExptService.Write", "notifyExptChange cost[%d] notifyExptCount[%d] notifyExptAppCount[%d]", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: He */
    public long mo58777He(C32735h.C32736a aVar, long j) {
        String Y60 = Y60(aVar, "");
        return Util.isNullOrNil(Y60) ? j : Util.getLong(Y60, j);
    }

    public final synchronized void Hx0() {
        ((C101062d) this.f351662h).clear();
        ((C101062d) this.f351663i).clear();
    }

    /* renamed from: Id */
    public void mo58778Id(Context context, Intent intent) {
        intent.setClass(context, ExptAppDebugUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/expt/model/ExptService", "showExptAppUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/expt/model/ExptService", "showExptAppUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void Ix0(int i) {
        if (i <= 0) {
            i = 1;
        }
        C77710q qVar = new C77710q(C86709a0.m107523b().mo121110g());
        int abs = (int) Math.abs(qVar.longValue() % ((long) i));
        int nowSecond = (((int) Util.nowSecond()) + (abs * 60)) - 86400;
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_GET_EXPT_LAST_TIME_SEC_INT;
        int intValue = ((Integer) i2.mo119685f(aVar, 0)).intValue();
        int min = Math.min(intValue, nowSecond);
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(min));
        this.f351661g = 0;
        this.f351660f = 0;
        Log.m105925i("MicroMsg.ExptService.Write", "reset get expt time tryGetTime[%d] uin[%d] hashTime[%d] needUpdateTime[%d] lastTime[%d] fixLastUpdateTime[%d]", Integer.valueOf(i), Long.valueOf(qVar.longValue()), Integer.valueOf(abs), Integer.valueOf(nowSecond), Integer.valueOf(intValue), Integer.valueOf(min));
    }

    public void Jx0(boolean z) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_NEXT_GET_EXPT_APP_IS_INCREMENT_BOOLEAN, Boolean.valueOf(z));
        if (z) {
            C117407d.INSTANCE.idkeyStat(863, 168, 1, false);
        } else {
            C117407d.INSTANCE.idkeyStat(863, 169, 1, false);
        }
        Log.printInfoStack("MicroMsg.ExptService", "set next get exptapp isIncrement [%b]", Boolean.valueOf(z));
    }

    public final void Kx0(C47346c cVar, C61982a aVar) {
        Object obj;
        if (BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
            HashMap r2 = cVar != null ? cVar.mo72390r2() : aVar.mo86864c();
            StringBuilder sb = new StringBuilder();
            sb.append("Receive expt : ");
            if (cVar != null) {
                obj = cVar.field_exptId + "";
            } else {
                obj = Integer.valueOf(aVar.f176193a);
            }
            sb.append(obj);
            sb.append(" ");
            if (r2.size() != 1) {
                r2 = "";
            }
            sb.append(r2);
            ((C119157j) C119157j.f356862d).mo183895z(new C34491a(this, sb.toString()));
        }
    }

    public void Lx0(int i) {
        C86709a0.m107524d().mo123460f(new C46977e(i));
    }

    public void Mx0(int i) {
        if (mo58784wf(C32735h.C32737c.clicfg_new_expt_app, true)) {
            C86709a0.m107524d().mo123460f(new C61450f(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0487, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0489, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x048a, code lost:
        r30 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x048f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0490, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x04b2, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04f2, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0557, code lost:
        if (r4 != null) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0572, code lost:
        if (r4 != null) goto L_0x0574;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0574, code lost:
        r4.endTransaction(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0578, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ExptKeyMapIdStorage", "insert expt keymapid map size[%d] ret[%s]", java.lang.Integer.valueOf(r6.size()), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05e4, code lost:
        if (r4 != null) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0604, code lost:
        if (r4 != null) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0606, code lost:
        r4.endTransaction(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x060a, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ExptKeyMapIdStorage", "update expt keymapid map size[%d] ret[%s]", java.lang.Integer.valueOf(r3.size()), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0216, code lost:
        if (r5 != null) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0219, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0245, code lost:
        if (r5 != null) goto L_0x0247;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0247, code lost:
        r5.endTransaction(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x024b, code lost:
        r6 = 0;
        r7 = 1;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ExptKeyMapIdStorage", "deleteExptKeyMapIdById exptIds size[%d] ret[%d]", java.lang.Integer.valueOf(r47.size()), java.lang.Integer.valueOf(r29));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0481  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x048f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:159:0x0443] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0736 A[LOOP:12: B:307:0x0730->B:309:0x0736, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x07c4  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x07d2  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x080f  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x081f  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0824  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Nx0(int r46, java.util.List<java.lang.Integer> r47, java.util.List<oa1.C47346c> r48, java.util.List<te3.C50782p5> r49) {
        /*
            r45 = this;
            r1 = r45
            r2 = r48
            r3 = r49
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r6 = 0
            r8 = 1
            r9 = 0
            java.lang.String r10 = "ExptKeyMapId"
            java.lang.String r11 = "MicroMsg.ExptKeyMapIdStorage"
            java.lang.String r12 = "MicroMsg.ExptService.Write"
            r13 = r46
            if (r13 != r8) goto L_0x00b0
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 863(0x35f, double:4.264E-321)
            r17 = 7
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
            ma1.a r14 = Cx0()
            java.lang.String r15 = "delete all expt error[%s]"
            pa1.d r0 = r14.f351658d
            r0.getClass()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f127268d     // Catch:{ Exception -> 0x0039 }
            java.lang.String r7 = "ExptItem"
            int r0 = r0.delete(r7, r6, r6)     // Catch:{ Exception -> 0x0039 }
            r7 = r0
            goto L_0x0048
        L_0x0039:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r8]
            java.lang.String r0 = r0.toString()
            r7[r9] = r0
            java.lang.String r0 = "MicroMsg.ExptStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r15, r7)
            r7 = 0
        L_0x0048:
            pa1.b r0 = r14.f351659e
            r0.getClass()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f352694d     // Catch:{ Exception -> 0x0054 }
            int r0 = r0.delete(r10, r6, r6)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0061
        L_0x0054:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r0 = r0.toString()
            r6[r9] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r15, r6)
            r0 = 0
        L_0x0061:
            r6 = 2
            java.lang.Object[] r15 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r15[r9] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r15[r8] = r0
            java.lang.String r0 = "delete all expt count[%d] map count[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r15)
            r14.Hx0()
            pa1.c r0 = pa1.C35418c.m40699b()
            boolean r0 = r0.mo60250a()
            if (r0 != 0) goto L_0x0084
        L_0x0082:
            r6 = 2
            goto L_0x0097
        L_0x0084:
            oa1.d r0 = oa1.C117731d.m166007c()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = r0.mo182442d()
            if (r0 != 0) goto L_0x008f
            goto L_0x0082
        L_0x008f:
            android.content.SharedPreferences$Editor r0 = r0.clear()
            r0.commit()
            goto L_0x0082
        L_0x0097:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r0[r9] = r6
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r4)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r0[r8] = r6
            java.lang.String r6 = "check need del all expt count[%d] cost[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r6, r0)
            r6 = 1
            goto L_0x00b1
        L_0x00b0:
            r6 = 0
        L_0x00b1:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            java.lang.String r9 = "MicroMsg.ExptMMKV"
            java.lang.String r8 = ""
            r20 = -1
            r22 = 5
            r23 = 4
            r24 = 3
            if (r47 == 0) goto L_0x036d
            int r0 = r47.size()
            if (r0 <= 0) goto L_0x036d
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.Object[] r13 = r47.toArray()
            java.lang.String r13 = java.util.Arrays.toString(r13)
            r18 = 0
            r0[r18] = r13
            java.lang.String r13 = "delete expt [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r0)
            java.util.Iterator r0 = r47.iterator()
        L_0x00ec:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x013c
            java.lang.Object r13 = r0.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            r26 = r0
            ma1.a r0 = Cx0()
            r27 = r4
            int r4 = r13.intValue()
            oa1.c r0 = r0.Bx0(r4)
            if (r0 == 0) goto L_0x0135
            int r4 = r0.field_exptType
            r5 = 10
            if (r4 != r5) goto L_0x0112
            r4 = 1
            goto L_0x0113
        L_0x0112:
            r4 = 0
        L_0x0113:
            if (r4 == 0) goto L_0x011e
            int r4 = r0.field_exptId
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.add(r4)
        L_0x011e:
            ma1.a r4 = Cx0()
            r5 = 1
            r4.Ex0(r0, r5)
            r7.add(r0)
            kj2.d r0 = kj2.C117407d.INSTANCE
            r4 = 17582(0x44ae, float:2.4638E-41)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r5 = 0
            r1[r5] = r13
            r0.mo160131h(r4, r1)
        L_0x0135:
            r1 = r45
            r0 = r26
            r4 = r27
            goto L_0x00ec
        L_0x013c:
            r27 = r4
            ma1.a r1 = Cx0()
            pa1.d r0 = r1.f351658d
            r0.getClass()
            int r4 = r47.size()
            if (r4 > 0) goto L_0x0152
            r13 = r6
            r31 = r15
            r4 = 0
            goto L_0x0192
        L_0x0152:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r0.f127268d
            boolean r5 = r4 instanceof zh3.C91753f
            if (r5 == 0) goto L_0x0162
            zh3.f r4 = (zh3.C91753f) r4
            long r29 = r4.mo125613a()
            r13 = r6
            r5 = r29
            goto L_0x0166
        L_0x0162:
            r13 = r6
            r5 = r20
            r4 = 0
        L_0x0166:
            java.util.Iterator r26 = r47.iterator()     // Catch:{ all -> 0x0366 }
            r29 = 0
        L_0x016c:
            boolean r30 = r26.hasNext()     // Catch:{ all -> 0x0366 }
            if (r30 == 0) goto L_0x0189
            java.lang.Object r30 = r26.next()     // Catch:{ all -> 0x0366 }
            java.lang.Integer r30 = (java.lang.Integer) r30     // Catch:{ all -> 0x0366 }
            r31 = r15
            int r15 = r30.intValue()     // Catch:{ all -> 0x0366 }
            boolean r15 = r0.mo72463jo(r15)     // Catch:{ all -> 0x0366 }
            if (r15 == 0) goto L_0x0186
            int r29 = r29 + 1
        L_0x0186:
            r15 = r31
            goto L_0x016c
        L_0x0189:
            r31 = r15
            if (r4 == 0) goto L_0x0190
            r4.endTransaction(r5)
        L_0x0190:
            r4 = r29
        L_0x0192:
            pa1.b r0 = r1.f351659e
            r0.getClass()
            int r5 = r47.size()
            if (r5 > 0) goto L_0x01aa
            r32 = r7
            r33 = r13
            r34 = r14
            r3 = 2
            r6 = 0
            r7 = 1
            r29 = 0
            goto L_0x0264
        L_0x01aa:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r5 = r0.f352694d
            boolean r6 = r5 instanceof zh3.C91753f
            if (r6 == 0) goto L_0x01ba
            zh3.f r5 = (zh3.C91753f) r5
            long r29 = r5.mo125613a()
            r15 = r7
            r6 = r29
            goto L_0x01be
        L_0x01ba:
            r15 = r7
            r6 = r20
            r5 = 0
        L_0x01be:
            java.util.Iterator r26 = r47.iterator()     // Catch:{ Exception -> 0x0226 }
            r29 = 0
        L_0x01c4:
            boolean r30 = r26.hasNext()     // Catch:{ Exception -> 0x021b }
            if (r30 == 0) goto L_0x0210
            java.lang.Object r30 = r26.next()     // Catch:{ Exception -> 0x021b }
            java.lang.Integer r30 = (java.lang.Integer) r30     // Catch:{ Exception -> 0x021b }
            r32 = r15
            int r15 = r30.intValue()     // Catch:{ Exception -> 0x020a }
            com.tencent.mm.sdk.storage.ISQLiteDatabase r3 = r0.f352694d     // Catch:{ Exception -> 0x020a }
            r30 = r0
            java.lang.String r0 = "exptId=?"
            r33 = r13
            r34 = r14
            r13 = 1
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ Exception -> 0x0208 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0208 }
            r13.<init>()     // Catch:{ Exception -> 0x0208 }
            r13.append(r15)     // Catch:{ Exception -> 0x0208 }
            r13.append(r8)     // Catch:{ Exception -> 0x0208 }
            java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0208 }
            r15 = 0
            r14[r15] = r13     // Catch:{ Exception -> 0x0208 }
            int r0 = r3.delete(r10, r0, r14)     // Catch:{ Exception -> 0x0208 }
            if (r0 <= 0) goto L_0x01fd
            int r29 = r29 + 1
        L_0x01fd:
            r3 = r49
            r0 = r30
            r15 = r32
            r13 = r33
            r14 = r34
            goto L_0x01c4
        L_0x0208:
            r0 = move-exception
            goto L_0x022f
        L_0x020a:
            r0 = move-exception
            r33 = r13
            r34 = r14
            goto L_0x022f
        L_0x0210:
            r33 = r13
            r34 = r14
            r32 = r15
            if (r5 == 0) goto L_0x0219
            goto L_0x0247
        L_0x0219:
            r3 = 2
            goto L_0x024b
        L_0x021b:
            r0 = move-exception
            r33 = r13
            r34 = r14
            r32 = r15
            goto L_0x022f
        L_0x0223:
            r0 = move-exception
            goto L_0x0360
        L_0x0226:
            r0 = move-exception
            r33 = r13
            r34 = r14
            r32 = r15
            r29 = 0
        L_0x022f:
            java.lang.String r3 = "delete expt by id id [%s] ret[%d]"
            r10 = 2
            java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x0223 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0223 }
            r10 = 0
            r13[r10] = r0     // Catch:{ all -> 0x0223 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x0223 }
            r10 = 1
            r13[r10] = r0     // Catch:{ all -> 0x0223 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r3, r13)     // Catch:{ all -> 0x0223 }
            if (r5 == 0) goto L_0x0219
        L_0x0247:
            r5.endTransaction(r6)
            goto L_0x0219
        L_0x024b:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r5 = r47.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r29)
            r7 = 1
            r0[r7] = r5
            java.lang.String r5 = "deleteExptKeyMapIdById exptIds size[%d] ret[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r5, r0)
        L_0x0264:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r6] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r29)
            r0[r7] = r3
            java.lang.String r3 = "delete expt ids deleteCount[%d] deleteMapCount[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r0)
            r1.Hx0()
            pa1.c r0 = pa1.C35418c.m40699b()
            boolean r1 = r0.mo60250a()
            if (r1 != 0) goto L_0x0288
        L_0x0284:
            r1 = 10
            goto L_0x0350
        L_0x0288:
            boolean r1 = r47.isEmpty()
            if (r1 == 0) goto L_0x028f
            goto L_0x0284
        L_0x028f:
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            oa1.d r1 = oa1.C117731d.m166007c()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = r1.mo182442d()
            if (r1 != 0) goto L_0x029e
            goto L_0x0284
        L_0x029e:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r7 = r47.iterator()
            r10 = 0
        L_0x02a8:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L_0x02e9
            java.lang.Object r13 = r7.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            boolean r14 = r1.contains(r14)
            if (r14 == 0) goto L_0x02a8
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r8)
            java.lang.String r14 = r14.toString()
            r1.remove(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r3.add(r13)
            int r10 = r10 + 1
            goto L_0x02a8
        L_0x02e9:
            java.util.HashSet<java.lang.String> r7 = pa1.C35418c.f94785b
            java.util.Iterator r7 = r7.iterator()
            r13 = 0
        L_0x02f0:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L_0x0313
            java.lang.Object r14 = r7.next()
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            int r26 = r1.getInt(r14, r15)
            if (r26 <= 0) goto L_0x02f0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r26)
            boolean r15 = r3.contains(r15)
            if (r15 == 0) goto L_0x02f0
            r1.remove(r14)
            int r13 = r13 + 1
            goto L_0x02f0
        L_0x0313:
            boolean r1 = r1.commit()
            r3 = 6
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.String r0 = r0.mo60252d()
            r3 = 0
            r7[r3] = r0
            int r0 = r47.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 1
            r7[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3 = 2
            r7[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r7[r24] = r0
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r5)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r7[r23] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7[r22] = r0
            java.lang.String r0 = "%s delete expt params[%d] delete [%d %d] cost[%d] flag [%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r7)
            goto L_0x0284
        L_0x0350:
            if (r4 < r1) goto L_0x0378
            kj2.d r35 = kj2.C117407d.INSTANCE
            r36 = 863(0x35f, double:4.264E-321)
            r38 = 13
            r40 = 1
            r42 = 0
            r35.idkeyStat(r36, r38, r40, r42)
            goto L_0x0378
        L_0x0360:
            if (r5 == 0) goto L_0x0365
            r5.endTransaction(r6)
        L_0x0365:
            throw r0
        L_0x0366:
            r0 = move-exception
            if (r4 == 0) goto L_0x036c
            r4.endTransaction(r5)
        L_0x036c:
            throw r0
        L_0x036d:
            r27 = r4
            r33 = r6
            r32 = r7
            r34 = r14
            r31 = r15
            r4 = 0
        L_0x0378:
            if (r2 == 0) goto L_0x07a2
            int r0 = r48.size()
            if (r0 <= 0) goto L_0x07a2
            com.tencent.mm.autogen.mmdata.rpt.XExptClientReceConfigStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.XExptClientReceConfigStruct
            r0.<init>()
            java.util.Iterator r1 = r48.iterator()
        L_0x0389:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x03e8
            java.lang.Object r3 = r1.next()
            oa1.c r3 = (oa1.C47346c) r3
            if (r3 == 0) goto L_0x03dd
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r5 = r3.toString()
            r7 = 0
            r6[r7] = r5
            java.lang.String r5 = "get expt item [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r6)
            int r5 = r3.field_exptType
            r6 = 10
            if (r5 != r6) goto L_0x03ae
            r5 = 1
            goto L_0x03af
        L_0x03ae:
            r5 = 0
        L_0x03af:
            if (r5 == 0) goto L_0x03b7
            r5 = r34
            r5.add(r3)
            goto L_0x03b9
        L_0x03b7:
            r5 = r34
        L_0x03b9:
            ma1.a r7 = Cx0()
            r10 = 0
            r7.Ex0(r3, r10)
            r7 = r32
            r7.add(r3)
            int r10 = r3.field_exptId
            long r13 = (long) r10
            r0.f343865d = r13
            int r10 = r3.field_groupId
            long r13 = (long) r10
            r0.f343866e = r13
            int r10 = r3.field_exptSeq
            long r13 = (long) r10
            r0.f343867f = r13
            long r13 = r3.field_bucketSrc
            r0.f343868g = r13
            r0.mo86055o()
            goto L_0x03e3
        L_0x03dd:
            r7 = r32
            r5 = r34
            r6 = 10
        L_0x03e3:
            r34 = r5
            r32 = r7
            goto L_0x0389
        L_0x03e8:
            r7 = r32
            r5 = r34
            ma1.a r1 = Cx0()
            r1.getClass()
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r0 = r48.size()
            if (r0 > 0) goto L_0x0406
            r30 = r4
            r29 = r5
            r32 = r7
            r2 = r12
            goto L_0x07a7
        L_0x0406:
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r10 = r48.iterator()
        L_0x0414:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x050c
            java.lang.Object r0 = r10.next()
            r15 = r0
            oa1.c r15 = (oa1.C47346c) r15
            java.util.HashMap r0 = r15.mo72390r2()
            if (r0 == 0) goto L_0x04f6
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r25 = r0.iterator()
        L_0x042f:
            boolean r0 = r25.hasNext()
            if (r0 == 0) goto L_0x04f6
            java.lang.Object r0 = r25.next()
            r26 = r10
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            pa1.b r0 = r1.f351659e
            r0.getClass()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f352694d     // Catch:{ Exception -> 0x0492, all -> 0x048f }
            java.lang.String r35 = "ExptKeyMapId"
            r29 = r5
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r5 = pa1.C35417a.f94783p     // Catch:{ Exception -> 0x0489, all -> 0x048f }
            java.lang.String[] r5 = r5.columns     // Catch:{ Exception -> 0x0489, all -> 0x048f }
            java.lang.String r37 = "exptKey=?"
            r30 = r4
            r32 = r7
            r7 = 1
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0487, all -> 0x048f }
            r7 = 0
            r4[r7] = r10     // Catch:{ Exception -> 0x0487, all -> 0x048f }
            r39 = 0
            r40 = 0
            r41 = 0
            r34 = r0
            r36 = r5
            r38 = r4
            android.database.Cursor r4 = r34.query(r35, r36, r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0487, all -> 0x048f }
            if (r4 == 0) goto L_0x047e
            boolean r0 = r4.moveToFirst()     // Catch:{ Exception -> 0x047c }
            if (r0 == 0) goto L_0x047e
            pa1.a r5 = new pa1.a     // Catch:{ Exception -> 0x047c }
            r5.<init>()     // Catch:{ Exception -> 0x047c }
            r5.convertFrom(r4)     // Catch:{ Exception -> 0x047a }
            goto L_0x047f
        L_0x047a:
            r0 = move-exception
            goto L_0x049a
        L_0x047c:
            r0 = move-exception
            goto L_0x0499
        L_0x047e:
            r5 = 0
        L_0x047f:
            if (r4 == 0) goto L_0x0484
            r4.close()
        L_0x0484:
            r35 = r12
            goto L_0x04b7
        L_0x0487:
            r0 = move-exception
            goto L_0x0498
        L_0x0489:
            r0 = move-exception
            r30 = r4
        L_0x048c:
            r32 = r7
            goto L_0x0498
        L_0x048f:
            r0 = move-exception
            r6 = 0
            goto L_0x04f0
        L_0x0492:
            r0 = move-exception
            r30 = r4
            r29 = r5
            goto L_0x048c
        L_0x0498:
            r4 = 0
        L_0x0499:
            r5 = 0
        L_0x049a:
            java.lang.String r7 = "get expt id [%s] [%s]"
            r34 = r5
            r35 = r12
            r5 = 2
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ all -> 0x04ee }
            r5 = 0
            r12[r5] = r10     // Catch:{ all -> 0x04ee }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04ee }
            r5 = 1
            r12[r5] = r0     // Catch:{ all -> 0x04ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r7, r12)     // Catch:{ all -> 0x04ee }
            if (r4 == 0) goto L_0x04b5
            r4.close()
        L_0x04b5:
            r5 = r34
        L_0x04b7:
            if (r5 == 0) goto L_0x04c5
            int r0 = r5.field_exptId
            int r4 = r15.field_exptId
            if (r0 == r4) goto L_0x04d3
            r5.field_exptId = r4
            r3.add(r5)
            goto L_0x04d3
        L_0x04c5:
            pa1.a r5 = new pa1.a
            r5.<init>()
            int r0 = r15.field_exptId
            r5.field_exptId = r0
            r5.field_exptKey = r10
            r6.add(r5)
        L_0x04d3:
            sg.g<java.lang.String, java.lang.Integer> r0 = r1.f351663i
            java.lang.String r4 = r5.field_exptKey
            int r5 = r5.field_exptId
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            q90.d r0 = (q90.C101062d) r0
            r0.put(r4, r5)
            r10 = r26
            r5 = r29
            r4 = r30
            r7 = r32
            r12 = r35
            goto L_0x042f
        L_0x04ee:
            r0 = move-exception
            r6 = r4
        L_0x04f0:
            if (r6 == 0) goto L_0x04f5
            r6.close()
        L_0x04f5:
            throw r0
        L_0x04f6:
            r30 = r4
            r29 = r5
            r32 = r7
            r26 = r10
            r35 = r12
            r10 = r26
            r5 = r29
            r4 = r30
            r7 = r32
            r12 = r35
            goto L_0x0414
        L_0x050c:
            r30 = r4
            r29 = r5
            r32 = r7
            r35 = r12
            pa1.b r0 = r1.f351659e
            r0.getClass()
            int r4 = r6.size()
            if (r4 > 0) goto L_0x0524
            r36 = r13
            r7 = 0
            goto L_0x0591
        L_0x0524:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r0.f352694d
            boolean r5 = r4 instanceof zh3.C91753f
            if (r5 == 0) goto L_0x0537
            zh3.f r4 = (zh3.C91753f) r4
            long r36 = r4.mo125613a()
            r43 = r13
            r12 = r36
            r36 = r43
            goto L_0x053c
        L_0x0537:
            r36 = r13
            r12 = r20
            r4 = 0
        L_0x053c:
            java.util.Iterator r5 = r6.iterator()     // Catch:{ Exception -> 0x0561 }
            r7 = 0
        L_0x0541:
            boolean r10 = r5.hasNext()     // Catch:{ Exception -> 0x055c }
            if (r10 == 0) goto L_0x0557
            java.lang.Object r10 = r5.next()     // Catch:{ Exception -> 0x055c }
            pa1.a r10 = (pa1.C35417a) r10     // Catch:{ Exception -> 0x055c }
            r14 = 0
            boolean r10 = r0.insertNotify(r10, r14)     // Catch:{ Exception -> 0x055c }
            if (r10 == 0) goto L_0x0541
            int r7 = r7 + 1
            goto L_0x0541
        L_0x0557:
            if (r4 == 0) goto L_0x055a
            goto L_0x0574
        L_0x055a:
            r4 = 2
            goto L_0x0578
        L_0x055c:
            r0 = move-exception
            goto L_0x0563
        L_0x055e:
            r0 = move-exception
            goto L_0x079c
        L_0x0561:
            r0 = move-exception
            r7 = 0
        L_0x0563:
            java.lang.String r5 = "insert expt key map id [%s]"
            r10 = 1
            java.lang.Object[] r14 = new java.lang.Object[r10]     // Catch:{ all -> 0x055e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x055e }
            r10 = 0
            r14[r10] = r0     // Catch:{ all -> 0x055e }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r5, r14)     // Catch:{ all -> 0x055e }
            if (r4 == 0) goto L_0x055a
        L_0x0574:
            r4.endTransaction(r12)
            goto L_0x055a
        L_0x0578:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r4 = r6.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r0[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "insert expt keymapid map size[%d] ret[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r0)
        L_0x0591:
            pa1.b r0 = r1.f351659e
            r0.getClass()
            int r4 = r3.size()
            if (r4 > 0) goto L_0x05a2
            r15 = r6
            r21 = r7
            r10 = 0
            goto L_0x0624
        L_0x05a2:
            com.tencent.mm.sdk.storage.ISQLiteDatabase r4 = r0.f352694d
            boolean r5 = r4 instanceof zh3.C91753f
            if (r5 == 0) goto L_0x05b1
            zh3.f r4 = (zh3.C91753f) r4
            long r20 = r4.mo125613a()
            r12 = r20
            goto L_0x05b4
        L_0x05b1:
            r12 = r20
            r4 = 0
        L_0x05b4:
            java.util.Iterator r5 = r3.iterator()     // Catch:{ Exception -> 0x05ef }
            r10 = 0
        L_0x05b9:
            boolean r14 = r5.hasNext()     // Catch:{ Exception -> 0x05e9 }
            if (r14 == 0) goto L_0x05e1
            java.lang.Object r14 = r5.next()     // Catch:{ Exception -> 0x05e9 }
            pa1.a r14 = (pa1.C35417a) r14     // Catch:{ Exception -> 0x05e9 }
            r20 = r5
            r15 = r6
            long r5 = r14.systemRowid     // Catch:{ Exception -> 0x05dd }
            r21 = r7
            r7 = 0
            boolean r5 = r0.update(r5, r14, r7)     // Catch:{ Exception -> 0x05db }
            if (r5 == 0) goto L_0x05d5
            int r10 = r10 + 1
        L_0x05d5:
            r6 = r15
            r5 = r20
            r7 = r21
            goto L_0x05b9
        L_0x05db:
            r0 = move-exception
            goto L_0x05f4
        L_0x05dd:
            r0 = move-exception
        L_0x05de:
            r21 = r7
            goto L_0x05f4
        L_0x05e1:
            r15 = r6
            r21 = r7
            if (r4 == 0) goto L_0x05e7
            goto L_0x0606
        L_0x05e7:
            r4 = 2
            goto L_0x060a
        L_0x05e9:
            r0 = move-exception
            r15 = r6
            goto L_0x05de
        L_0x05ec:
            r0 = move-exception
            goto L_0x0796
        L_0x05ef:
            r0 = move-exception
            r15 = r6
            r21 = r7
            r10 = 0
        L_0x05f4:
            java.lang.String r5 = "update expt key map id [%s]"
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x05ec }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05ec }
            r6 = 0
            r7[r6] = r0     // Catch:{ all -> 0x05ec }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r11, r5, r7)     // Catch:{ all -> 0x05ec }
            if (r4 == 0) goto L_0x05e7
        L_0x0606:
            r4.endTransaction(r12)
            goto L_0x05e7
        L_0x060a:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r4 = r3.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r0[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r5 = 1
            r0[r5] = r4
            java.lang.String r4 = "update expt keymapid map size[%d] ret[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r0)
        L_0x0624:
            pa1.d r0 = r1.f351658d
            java.util.List r0 = r0.mo72462Lo(r2)
            if (r0 == 0) goto L_0x074a
            r4 = r0
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            int r5 = r4.size()
            pa1.c r6 = pa1.C35418c.m40699b()
            boolean r7 = r6.mo60250a()
            if (r7 != 0) goto L_0x063e
            goto L_0x0671
        L_0x063e:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x0654
            r7 = 1
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r6 = r6.mo60252d()
            r7 = 0
            r4[r7] = r6
            java.lang.String r6 = "%s replace expt but item is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r6, r4)
            goto L_0x0671
        L_0x0654:
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            oa1.d r7 = oa1.C117731d.m166007c()
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = r7.mo182442d()
            if (r7 != 0) goto L_0x0676
            r13 = 1
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r6 = r6.mo60252d()
            r7 = 0
            r4[r7] = r6
            java.lang.String r6 = "%s replace expt but mmkv is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r9, r6, r4)
        L_0x0671:
            r26 = r5
            r2 = 0
            goto L_0x0721
        L_0x0676:
            java.util.Iterator r13 = r0.iterator()
            r14 = 0
            r20 = 0
        L_0x067d:
            boolean r25 = r13.hasNext()
            if (r25 == 0) goto L_0x06e4
            java.lang.Object r25 = r13.next()
            r26 = r5
            r5 = r25
            oa1.c r5 = (oa1.C47346c) r5
            if (r5 != 0) goto L_0x0690
            goto L_0x06db
        L_0x0690:
            java.util.HashMap r25 = r5.mo72390r2()
            if (r25 == 0) goto L_0x06db
            java.util.Set r25 = r25.keySet()
            java.util.Iterator r25 = r25.iterator()
            r34 = 0
        L_0x06a0:
            boolean r38 = r25.hasNext()
            if (r38 == 0) goto L_0x06be
            java.lang.Object r34 = r25.next()
            r38 = r13
            r13 = r34
            java.lang.String r13 = (java.lang.String) r13
            int r2 = r5.field_exptId
            r7.putInt(r13, r2)
            int r14 = r14 + 1
            r2 = r48
            r13 = r38
            r34 = 1
            goto L_0x06a0
        L_0x06be:
            r38 = r13
            if (r34 == 0) goto L_0x06dd
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r13 = r5.field_exptId
            r2.append(r13)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = r5.field_exptContent
            r7.putString(r2, r5)
            int r20 = r20 + 1
            goto L_0x06dd
        L_0x06db:
            r38 = r13
        L_0x06dd:
            r2 = r48
            r5 = r26
            r13 = r38
            goto L_0x067d
        L_0x06e4:
            r26 = r5
            boolean r2 = r7.commit()
            r5 = 6
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r5 = r6.mo60252d()
            r6 = 0
            r7[r6] = r5
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r7[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)
            r5 = 2
            r7[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r20)
            r7[r24] = r4
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r11)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r7[r23] = r4
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            r7[r22] = r4
            java.lang.String r4 = "%s replace expt param[%d] [%d %d] cost[%d] flag[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r7)
        L_0x0721:
            if (r2 != 0) goto L_0x072c
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 863(0x35f, float:1.21E-42)
            r5 = 14
            r2.mo175911u(r4, r5)
        L_0x072c:
            java.util.Iterator r0 = r0.iterator()
        L_0x0730:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x074c
            java.lang.Object r2 = r0.next()
            oa1.c r2 = (oa1.C47346c) r2
            sg.g<java.lang.Integer, oa1.c> r4 = r1.f351662h
            int r5 = r2.field_exptId
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            q90.d r4 = (q90.C101062d) r4
            r4.put(r5, r2)
            goto L_0x0730
        L_0x074a:
            r26 = 0
        L_0x074c:
            r0 = 7
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r48.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r2 = 1
            r0[r2] = r1
            int r1 = r15.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r0[r24] = r1
            int r1 = r3.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r23] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r22] = r1
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r36)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 6
            r0[r2] = r1
            java.lang.String r1 = "replaceExptIds item [args:%d  db:%d], exptMap insert[list:%d   db:%d], update[list:%d  db:%d] cost[%d]"
            r2 = r35
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            goto L_0x07a9
        L_0x0796:
            if (r4 == 0) goto L_0x079b
            r4.endTransaction(r12)
        L_0x079b:
            throw r0
        L_0x079c:
            if (r4 == 0) goto L_0x07a1
            r4.endTransaction(r12)
        L_0x07a1:
            throw r0
        L_0x07a2:
            r30 = r4
            r2 = r12
            r29 = r34
        L_0x07a7:
            r26 = 0
        L_0x07a9:
            if (r33 != 0) goto L_0x07af
            if (r30 > 0) goto L_0x07af
            if (r26 <= 0) goto L_0x07be
        L_0x07af:
            ma1.a r0 = Cx0()
            r0.getClass()
            com.tencent.mm.autogen.events.ExptChangeEvent r0 = new com.tencent.mm.autogen.events.ExptChangeEvent
            r0.<init>()
            r0.publish()
        L_0x07be:
            boolean r0 = r32.isEmpty()
            if (r0 != 0) goto L_0x07ce
            ma1.a r0 = Cx0()
            r1 = r32
            r3 = 0
            r0.Gx0(r1, r3)
        L_0x07ce:
            r1 = r49
            if (r1 == 0) goto L_0x07dc
            r3 = r45
            r4 = r29
            r5 = r31
            r3.wx0(r4, r1, r5)
            goto L_0x07f2
        L_0x07dc:
            r3 = r45
            r4 = r29
            r5 = r31
            int r0 = r4.size()
            if (r0 > 0) goto L_0x07ee
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x07f2
        L_0x07ee:
            r1 = 0
            r3.wx0(r4, r1, r5)
        L_0x07f2:
            r1 = 6
            java.lang.Object[] r0 = new java.lang.Object[r1]
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r27)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r18 = 0
            r0[r18] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r46)
            r4 = 1
            r0[r4] = r1
            if (r47 == 0) goto L_0x080f
            int r1 = r47.size()
            goto L_0x0810
        L_0x080f:
            r1 = 0
        L_0x0810:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 2
            r0[r4] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)
            r0[r24] = r1
            if (r48 == 0) goto L_0x0824
            int r9 = r48.size()
            goto L_0x0825
        L_0x0824:
            r9 = 0
        L_0x0825:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r23] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r22] = r1
            java.lang.String r1 = "udpate expt cost[%s] flag[%d] deleteExptList[svr:%d local:%d] replaceExptList[svr:%d local:%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.C117543a.Nx0(int, java.util.List, java.util.List, java.util.List):void");
    }

    public void Ox0(int i, List<Integer> list, List<C61982a> list2) {
        int i2;
        int i3;
        HashMap<String, String> c;
        MultiProcessMMKV c2;
        long currentTicks = Util.currentTicks();
        HashSet hashSet = new HashSet();
        if (i == 1) {
            C61983b e = C61983b.m72724e();
            e.getClass();
            try {
                e.mo86868c().clear().commit();
                e.mo86869d().clear().commit();
            } catch (Exception unused) {
            }
        }
        ExptAppReportStruct exptAppReportStruct = new ExptAppReportStruct();
        ExptAppReportDeleteStruct exptAppReportDeleteStruct = new ExptAppReportDeleteStruct();
        int i4 = 7;
        int i5 = 3;
        if (list != null && list.size() > 0) {
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                exptAppReportStruct.f155010d = intValue2;
                exptAppReportStruct.f155011e = 0;
                exptAppReportStruct.f155012f = i5;
                exptAppReportStruct.mo86055o();
                C61982a f = C61983b.m72724e().mo86870f(intValue2);
                hashSet.add(f);
                if (f != null) {
                    if (f.f176202j == i4) {
                        C117543a Cx0 = Cx0();
                        long j = (long) f.f176193a;
                        Cx0.getClass();
                        Log.m105925i("MicroMsg.ExptService.Write", "notifyNewEdgeScriptDelete configID [%d]", Long.valueOf(j));
                        NewEdgeScriptDeleteEvent newEdgeScriptDeleteEvent = new NewEdgeScriptDeleteEvent();
                        newEdgeScriptDeleteEvent.f343578d.f343579a = j;
                        newEdgeScriptDeleteEvent.publish();
                    }
                }
                if (f != null) {
                    if (f.f176202j == 8) {
                        C117543a Cx02 = Cx0();
                        long j2 = (long) f.f176193a;
                        Cx02.getClass();
                        Log.m105925i("MicroMsg.ExptService.Write", "notifyNewEdgeSqlDelete configID [%d]", Long.valueOf(j2));
                        NewEdgeSqlDeleteEvent newEdgeSqlDeleteEvent = new NewEdgeSqlDeleteEvent();
                        newEdgeSqlDeleteEvent.f343583d.f343584a = j2;
                        newEdgeSqlDeleteEvent.publish();
                    }
                }
                if (f != null) {
                    exptAppReportDeleteStruct.f155008d = (long) f.f176193a;
                    exptAppReportDeleteStruct.f155009e = (long) f.f176195c;
                    exptAppReportDeleteStruct.mo86055o();
                }
                i4 = 7;
                i5 = 3;
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (C61982a next : list2) {
                hashSet.add(next);
                exptAppReportStruct.f155010d = next.f176193a;
                exptAppReportStruct.f155011e = next.f176195c;
                exptAppReportStruct.f155012f = 2;
                exptAppReportStruct.mo86055o();
                if (next.f176202j == 7) {
                    C117543a Cx03 = Cx0();
                    long j3 = (long) next.f176193a;
                    Cx03.getClass();
                    Log.m105925i("MicroMsg.ExptService.Write", "notifyNewEdgeScriptUpdate configID [%d]", Long.valueOf(j3));
                    NewEdgeScriptUpdateEvent newEdgeScriptUpdateEvent = new NewEdgeScriptUpdateEvent();
                    NewEdgeScriptUpdateEvent.C114682a aVar = newEdgeScriptUpdateEvent.f343580d;
                    aVar.f343581a = j3;
                    aVar.f343582b = next;
                    newEdgeScriptUpdateEvent.publish();
                }
                if (next.f176202j == 8) {
                    C117543a Cx04 = Cx0();
                    long j4 = (long) next.f176193a;
                    Cx04.getClass();
                    Log.m105925i("MicroMsg.ExptService.Write", "notifyNewEdgeSqlUpdate configID [%d]", Long.valueOf(j4));
                    NewEdgeSqlUpdateEvent newEdgeSqlUpdateEvent = new NewEdgeSqlUpdateEvent();
                    NewEdgeSqlUpdateEvent.C114684a aVar2 = newEdgeSqlUpdateEvent.f343585d;
                    aVar2.f343586a = j4;
                    aVar2.f343587b = next;
                    newEdgeSqlUpdateEvent.publish();
                }
            }
        }
        C61983b e2 = C61983b.m72724e();
        e2.getClass();
        if (list == null || list.size() <= 0 || (c2 = e2.mo86868c()) == null) {
            i2 = 0;
        } else {
            i2 = 0;
            for (Integer intValue3 : list) {
                int intValue4 = intValue3.intValue();
                if (c2.contains(intValue4 + "")) {
                    c2.remove(intValue4 + "");
                    i2++;
                }
            }
        }
        C61983b e3 = C61983b.m72724e();
        e3.getClass();
        if (list2 != null && list2.size() > 0) {
            MultiProcessMMKV c3 = e3.mo86868c();
            MultiProcessMMKV d = e3.mo86869d();
            if (!(c3 == null || d == null)) {
                i3 = 0;
                for (C61982a next2 : list2) {
                    if (next2 != null && !Util.isNullOrNil(next2.f176196d) && (c = next2.mo86864c()) != null && c.size() > 0) {
                        for (String putInt : c.keySet()) {
                            d.putInt(putInt, next2.f176193a);
                        }
                        c3.putString(next2.f176193a + "", next2.f176196d);
                        i3++;
                    }
                }
                new ExptChangeEvent().publish();
                Gx0((HashSet<C47346c>) null, hashSet);
                Log.m105925i("MicroMsg.ExptService.Write", "update Expt app flag = %d, delCount = %d, replaceCount = %d cost = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(Util.ticksToNow(currentTicks)));
            }
        }
        i3 = 0;
        new ExptChangeEvent().publish();
        Gx0((HashSet<C47346c>) null, hashSet);
        Log.m105925i("MicroMsg.ExptService.Write", "update Expt app flag = %d, delCount = %d, replaceCount = %d cost = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: Qe */
    public int mo58779Qe(C32735h.C32736a aVar, int i) {
        String Y60 = Y60(aVar, "");
        return Util.isNullOrNil(Y60) ? i : Util.getInt(Y60, i);
    }

    public void Qm0(Context context, Intent intent) {
        intent.setClass(context, ExptDebugUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/expt/model/ExptService", "showExptUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/expt/model/ExptService", "showExptUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public String Y60(C32735h.C32736a aVar, String str) {
        return yx0(aVar == null ? null : aVar.name(), str, true);
    }

    /* renamed from: dM */
    public int mo58782dM(C61081c cVar) {
        int f = C79758p.f233760a.mo109883f(cVar);
        if (BuildInfo.DEBUG && Util.isNullOrNil(cVar.mo54535i())) {
            Assert.fail("Repairer Need Set ExptKey " + cVar.mo54531a());
        }
        return Util.getInt(yx0(cVar.mo54535i(), (String) null, true), f);
    }

    public int dl0(C32735h.C32736a aVar, C104160f fVar, int i) {
        return mo58779Qe(aVar, ((Integer) C79758p.f233760a.mo109878a(fVar, Integer.valueOf(i))).intValue());
    }

    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.ExptService", "onAccountRelease");
        Hx0();
        ((C119157j) C119157j.f356862d).mo183894y("manual_get_expt");
        HashMap<String, String> hashMap = ExptServiceShell.f81005a;
        Log.m105924i("MicroMsg.ExptServiceShell", "destroy");
        ExptServiceShell.f81006b.dead();
        ExptServiceShell.f81005a.clear();
    }

    public final void vx0(int i) {
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.ExptService", "account is not ready, don't get expt config");
        } else if (!MMApplicationContext.isMMProcess()) {
            Log.m105928w("MicroMsg.ExptService", "it is not mm process, why you call update expt?");
        } else {
            if (this.f351660f <= 0) {
                this.f351660f = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_LAST_TIME_SEC_INT, 0)).intValue();
            }
            if (this.f351661g <= 0) {
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GET_EXPT_INTERVAL_SEC_INT, 86400)).intValue();
                this.f351661g = intValue;
                if (intValue <= 3600) {
                    Log.m105928w("MicroMsg.ExptService", "interval is less than 1 hour, something warn here!!!");
                    this.f351661g = 3600;
                }
            }
            if (Util.secondsToNow((long) this.f351660f) >= ((long) this.f351661g)) {
                Lx0(i);
            }
        }
    }

    /* renamed from: wf */
    public boolean mo58784wf(C32735h.C32736a aVar, boolean z) {
        String Y60 = Y60(aVar, "");
        return Util.isNullOrNil(Y60) ? z : Util.getInt(Y60, z ? 1 : 0) != 0;
    }

    public void wx0(List<C47346c> list, List<C50782p5> list2, List<Integer> list3) {
        LinkedList linkedList = new LinkedList();
        if (list != null) {
            for (C47346c next : list) {
                if (next != null) {
                    if (next.field_exptType == 10) {
                        C117732f fVar = new C117732f();
                        fVar.f352065a = next.field_exptId;
                        fVar.f352067c = next.field_startTime;
                        fVar.f352068d = next.field_endTime;
                        fVar.f352066b = next.field_exptSeq;
                        fVar.f352069e = next.mo72390r2();
                        linkedList.add(fVar);
                    }
                }
            }
        }
        LinkedList linkedList2 = new LinkedList();
        if (list2 != null) {
            for (C50782p5 next2 : list2) {
                C117733g gVar = new C117733g();
                gVar.f352070a = next2.f139582d;
                gVar.f352071b = next2.f139583e;
                linkedList2.add(gVar);
            }
        }
        ((C35122c) C86312j.m106911c(C35122c.class)).hb0(linkedList, linkedList2, list3);
    }

    /* renamed from: xe */
    public float mo58785xe(C32735h.C32736a aVar, float f) {
        String Y60 = Y60(aVar, "");
        return Util.isNullOrNil(Y60) ? f : Util.getFloat(Y60, f);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.util.ArrayList<java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.Integer> xx0() {
        /*
            r8 = this;
            pa1.d r0 = r8.f351658d
            r1 = 0
            if (r0 == 0) goto L_0x0061
            r0.getClass()
            java.lang.String r2 = "select exptId from ExptItem ORDER BY exptId ASC"
            r3 = 0
            com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f127268d     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch:{ Exception -> 0x003c, all -> 0x003a }
            if (r0 == 0) goto L_0x0034
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x002f }
            r2.<init>()     // Catch:{ Exception -> 0x002f }
        L_0x0019:
            boolean r1 = r0.moveToNext()     // Catch:{ Exception -> 0x002d }
            if (r1 == 0) goto L_0x002b
            int r1 = r0.getInt(r3)     // Catch:{ Exception -> 0x002d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x002d }
            r2.add(r1)     // Catch:{ Exception -> 0x002d }
            goto L_0x0019
        L_0x002b:
            r1 = r2
            goto L_0x0034
        L_0x002d:
            r1 = move-exception
            goto L_0x0040
        L_0x002f:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x0040
        L_0x0034:
            if (r0 == 0) goto L_0x0061
            r0.close()
            goto L_0x0061
        L_0x003a:
            r0 = move-exception
            goto L_0x005b
        L_0x003c:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L_0x0040:
            java.lang.String r4 = "MicroMsg.ExptStorage"
            java.lang.String r5 = "get all expt id error[%s]"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0057 }
            r6[r3] = r1     // Catch:{ all -> 0x0057 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r6)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0055
            r0.close()
        L_0x0055:
            r1 = r2
            goto L_0x0061
        L_0x0057:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L_0x005b:
            if (r1 == 0) goto L_0x0060
            r1.close()
        L_0x0060:
            throw r0
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.C117543a.xx0():java.util.ArrayList");
    }

    public final String yx0(String str, String str2, boolean z) {
        String str3 = str;
        String str4 = str2;
        long currentTicks = Util.currentTicks();
        if (str3 == null) {
            return str4;
        }
        PString pString = new PString();
        int b = C61983b.m72724e().mo86867b(str3, str4, pString);
        if (b > 0) {
            C32343a.m39684a().getClass();
            if (b < 0) {
                Log.m105921e("MicroMsg.ExptIdCount", "exptid err  less than  0 :  [%d]", Integer.valueOf(b));
            } else {
                if (C59377b.f169709b == null) {
                    C59377b.f169709b = new C59377b();
                }
                C59377b bVar = C59377b.f169709b;
                bVar.getClass();
                if (b < 0) {
                    Log.m105921e("MicroMsg.ExptIdMMKV", "exptid or exptidcount less than 0 [%d] [%d] ", Integer.valueOf(b), 1);
                } else if (b >= 0) {
                    MultiProcessMMKV a = bVar.mo84478a();
                    if (a == null) {
                        Log.m105920e("MicroMsg.ExptIdMMKV", "get mmkv is null!, err");
                    } else {
                        int decodeInt = a.decodeInt(String.valueOf(b));
                        if (decodeInt == 0) {
                            a.putInt(String.valueOf(b), 1);
                        } else {
                            a.putInt(String.valueOf(b), decodeInt + 1);
                        }
                        Log.m105925i("MicroMsg.ExptIdMMKV", "exptid  count  [%d] [%d]", Integer.valueOf(b), Integer.valueOf(decodeInt + 1));
                    }
                }
                C117407d.INSTANCE.idkeyStat(863, 163, 1, false);
            }
            Log.m105925i("MicroMsg.ExptService", "API check ExptApp from mmkv result[%s, %d] key[%s] def[%s] cost[%d]", pString.value, Integer.valueOf(b), str3, str4, Long.valueOf(Util.ticksToNow(currentTicks)));
            return pString.value;
        }
        if (this.f351658d == null || this.f351659e == null) {
            C35418c.m40699b().getClass();
            String f = C117731d.m166007c().mo182444f(str3, str4, false, true);
            Log.m105925i("MicroMsg.ExptService", "API check Expt from mmkv result[%s] key[%s] def[%s] cost[%d]", f, str3, str4, Long.valueOf(Util.ticksToNow(currentTicks)));
            return f;
        }
        try {
            int Ax0 = Ax0(str);
            XExptClientRptStruct xExptClientRptStruct = new XExptClientRptStruct();
            PBool pBool = new PBool();
            HashMap<String, String> zx02 = zx0(Ax0, true, xExptClientRptStruct, pBool);
            if (zx02 == null) {
                return str4;
            }
            if (zx02.size() <= 0) {
                return str4;
            }
            String str5 = zx02.get(str3);
            if (!Util.isNullOrNil(str5) && pBool.value && z) {
                xExptClientRptStruct.f343874i = xExptClientRptStruct.mo86045b("ExptKey", str3, true);
                xExptClientRptStruct.f343875j = xExptClientRptStruct.mo86045b("ExptVal", str5, false);
                xExptClientRptStruct.mo86049g();
            }
            Log.m105925i("MicroMsg.ExptService", "API Got Expt result[%s] exptId[%d] key[%s] defStr[%s] cost[%d]", str5, Integer.valueOf(Ax0), str3, str4, Long.valueOf(Util.ticksToNow(currentTicks)));
            return !Util.isNullOrNil(str5) ? str5 : str4;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.ExptService", th, "Fail to query value, return default value '%s' instead.", str4);
            return str4;
        }
    }

    public HashMap<String, String> zx0(int i, boolean z, XExptClientRptStruct xExptClientRptStruct, PBool pBool) {
        String str;
        XExptClientRptStruct xExptClientRptStruct2 = xExptClientRptStruct;
        HashMap<String, String> hashMap = null;
        if (this.f351658d == null) {
            Log.m105921e("MicroMsg.ExptService", "Expt service is not init here! exptId[%d]", Integer.valueOf(i));
            return null;
        } else if (i <= 0) {
            return null;
        } else {
            long currentTicks = Util.currentTicks();
            C47346c Bx0 = Bx0(i);
            if (Bx0 == null || Util.isNullOrNil(Bx0.field_exptContent)) {
                Log.m105928w("MicroMsg.ExptService", "expt item is null or expt content is null.");
                str = null;
            } else {
                str = Bx0.field_exptContent;
                if (!z || Bx0.mo72388p2()) {
                    hashMap = Bx0.mo72390r2();
                    int i2 = Bx0.field_exptType;
                    if ((i2 == 4 || i2 == 10 || (i2 != 2 && i2 != 130 && (i2 & 2) == 0)) ? false : true) {
                        pBool.value = true;
                        if (xExptClientRptStruct2 != null) {
                            xExptClientRptStruct2.f343869d = (long) Bx0.field_exptId;
                            xExptClientRptStruct2.f343870e = (long) Bx0.field_groupId;
                            xExptClientRptStruct2.f343871f = (long) Bx0.field_exptSeq;
                            xExptClientRptStruct2.f343872g = Bx0.field_startTime;
                            xExptClientRptStruct2.f343873h = Bx0.field_endTime;
                            xExptClientRptStruct2.f343876k = Bx0.field_bucketSrc;
                        }
                    }
                } else {
                    Log.m105929w("MicroMsg.ExptService", "expt time is invalid time[%d %d] seq[%d]", Long.valueOf(Bx0.field_startTime), Long.valueOf(Bx0.field_endTime), Integer.valueOf(Bx0.field_exptSeq));
                }
            }
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = hashMap != null ? hashMap : 0;
            objArr[2] = str;
            objArr[3] = Long.valueOf(Util.ticksToNow(currentTicks));
            Log.m105927v("MicroMsg.ExptService", "get expt [%d] map[%s] expt[%s] cost[%d]", objArr);
            return hashMap;
        }
    }
}
