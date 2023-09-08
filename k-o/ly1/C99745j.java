package ly1;

import android.content.Context;
import android.database.Cursor;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jy1.C46586d;
import ly1.C99736h0;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p261wl.C38166b;
import p823sg.C90193h;
import qy1.C47890b;
import sw1.C101705t;
import sw1.C101706u;
import sw1.C13794o;
import sw1.C48471j;
import sw1.C48478n;
import sw1.C48484q;
import sw1.j$$a;
import uy1.C52642c;
import vw1.C53033x;
import w10.C15032a;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ly1.j */
public class C99745j extends C86301e implements C13794o {

    /* renamed from: d */
    public HashMap<String, C99736h0> f292337d = new HashMap<>();

    /* renamed from: ly1.j$a */
    public class C99746a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f292338d;

        /* renamed from: e */
        public final /* synthetic */ C99743i f292339e;

        /* renamed from: f */
        public final /* synthetic */ boolean f292340f;

        /* renamed from: g */
        public final /* synthetic */ C13794o.C13795a f292341g;

        /* renamed from: ly1.j$a$a */
        public class C99747a implements C99736h0.C99742e {

            /* renamed from: a */
            public final /* synthetic */ LinkedList f292343a;

            public C99747a(LinkedList linkedList) {
                this.f292343a = linkedList;
            }

            /* renamed from: a */
            public void mo139106a(boolean z) {
                Class cls = C48484q.class;
                C99746a aVar = C99746a.this;
                C99736h0 remove = C99745j.this.f292337d.remove(aVar.f292339e.field_taskId);
                if (remove != null) {
                    remove.mo139094d();
                }
                if (z) {
                    ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139112Ow(C99746a.this.f292339e.field_taskId, 2);
                    C99746a aVar2 = C99746a.this;
                    C99745j jVar = C99745j.this;
                    C99743i iVar = aVar2.f292339e;
                    jVar.zx0(iVar.field_taskId, iVar.field_publishSource, this.f292343a, iVar.field_BusinessData, iVar.field_sourceSceneId, aVar2.f292341g);
                    return;
                }
                ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139112Ow(C99746a.this.f292339e.field_taskId, 1);
                ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139116kD(C99746a.this.f292339e.field_taskId, 1);
                C99746a aVar3 = C99746a.this;
                C99745j.this.wx0(aVar3.f292339e.field_taskId, -1);
            }
        }

        public C99746a(int i, C99743i iVar, boolean z, C13794o.C13795a aVar) {
            this.f292338d = i;
            this.f292339e = iVar;
            this.f292340f = z;
            this.f292341g = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x012b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r19 = this;
                r1 = r19
                java.lang.Class<sw1.q> r0 = sw1.C48484q.class
                ly1.j r2 = ly1.C99745j.this
                int r3 = r1.f292338d
                ly1.i r4 = r1.f292339e
                r2.getClass()
                r5 = 2
                r6 = 5
                r7 = 1
                r8 = 0
                if (r3 == r5) goto L_0x0015
                goto L_0x0177
            L_0x0015:
                java.lang.String r3 = r4.field_localIdList
                java.util.LinkedList r3 = uy1.C52642c.m58981B(r3)
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r3)
                if (r9 == 0) goto L_0x0023
                goto L_0x0177
            L_0x0023:
                java.lang.Object r3 = r3.get(r8)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r3 = r3.trim()
                java.lang.String r9 = "weixin://bgmixid/"
                boolean r10 = r3.startsWith(r9)
                java.lang.String r11 = "MicroMsg.Haowan.GameHaowanPublishImpl"
                if (r10 == 0) goto L_0x015a
                java.lang.String r10 = ""
                java.lang.String r9 = r3.replace(r9, r10)
                java.lang.Object[] r10 = new java.lang.Object[r7]
                r10[r8] = r9
                java.lang.String r12 = "background mix task, bgMixTaskId=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r10)
                di3.d r10 = di3.C86312j.m106911c(r0)
                sw1.q r10 = (sw1.C48484q) r10
                ly1.l r10 = r10.mo66107kc()
                java.lang.String r12 = r4.field_taskId
                r10.getClass()
                java.lang.Object[] r13 = new java.lang.Object[r6]
                java.lang.String r14 = "GameHaowanPublishEdition"
                r13[r8] = r14
                java.lang.String r15 = "bgMixTaskId"
                r13[r7] = r15
                r13[r5] = r9
                java.lang.String r15 = "taskId"
                r6 = 3
                r13[r6] = r15
                r16 = 4
                r13[r16] = r12
                java.lang.String r12 = "update %s set %s=\"%s\" where %s=\"%s\""
                java.lang.String r13 = java.lang.String.format(r12, r13)
                java.lang.Object[] r6 = new java.lang.Object[r7]
                r6[r8] = r13
                java.lang.String r7 = "MicroMsg.Haowan.GameHaowanPublishStorage"
                java.lang.String r8 = "updateBgMixTaskId, sql : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
                r10.execSQL(r14, r13)
                java.lang.Class<rw.o> r6 = p232rw.C101476o.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                rw.o r6 = (p232rw.C101476o) r6
                zg2.e r6 = r6.mo140776Ie(r9)
                if (r6 == 0) goto L_0x014e
                int r8 = r6.getStatus()
                if (r8 != r5) goto L_0x0136
                te3.gb0 r8 = r6.mo74365p0()
                if (r8 == 0) goto L_0x0128
                java.lang.String r9 = r8.f298299o
                java.lang.String r10 = r8.f298300p
                com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem r13 = my1.C100022a.m130689c(r9)
                if (r13 != 0) goto L_0x00a8
                r13 = 0
                goto L_0x00b8
            L_0x00a8:
                java.lang.String r9 = my1.C100022a.m130688b(r10, r9)
                com.tencent.mm.plugin.webview.model.m1 r10 = com.tencent.p014mm.plugin.webview.model.C6048m1.f22342b
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem r9 = r10.mo7010b(r9)
                if (r9 == 0) goto L_0x00b8
                java.lang.String r9 = r9.f283024g
                r13.f283023f = r9
            L_0x00b8:
                if (r13 == 0) goto L_0x0128
                java.lang.String r9 = r4.field_localIdList
                java.lang.String r10 = r13.f283022e
                java.lang.String r3 = r9.replace(r3, r10)
                r4.field_localIdList = r3
                di3.d r3 = di3.C86312j.m106911c(r0)
                sw1.q r3 = (sw1.C48484q) r3
                ly1.l r3 = r3.mo66107kc()
                java.lang.String r9 = r4.field_taskId
                java.lang.String r10 = r4.field_localIdList
                r3.getClass()
                r5 = 5
                java.lang.Object[] r1 = new java.lang.Object[r5]
                r5 = 0
                r1[r5] = r14
                java.lang.String r18 = "localIdList"
                r5 = 1
                r1[r5] = r18
                r17 = 2
                r1[r17] = r10
                r10 = 3
                r1[r10] = r15
                r1[r16] = r9
                java.lang.String r1 = java.lang.String.format(r12, r1)
                java.lang.Object[] r9 = new java.lang.Object[r5]
                r5 = 0
                r9[r5] = r1
                java.lang.String r5 = "updateLocalIds, sql : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r9)
                r3.execSQL(r14, r1)
                com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r1 = r6.getReportInfo()
                android.os.Bundle r3 = r13.f283036v
                int r5 = my1.C100022a.m130691e(r1)
                java.lang.String r6 = "mark_edit_flag"
                r3.putInt(r6, r5)
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                java.lang.String r5 = "KEY_VIDEO_IS_EDITED_BOOLEAN"
                java.lang.Object r1 = r1.mo129811b(r5, r3)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x0121
                java.lang.String r1 = r8.f298299o
                my1.C100022a.m130690d(r1)
            L_0x0121:
                java.lang.String r1 = "background mix task is finished, start publish"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
                r5 = 1
                goto L_0x0129
            L_0x0128:
                r5 = 0
            L_0x0129:
                if (r5 != 0) goto L_0x0167
                java.lang.String r1 = "background mix task is invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
                java.lang.String r1 = r4.field_taskId
                r2.yx0(r1)
                goto L_0x0158
            L_0x0136:
                int r1 = r6.getStatus()
                r3 = 3
                if (r1 != r3) goto L_0x0148
                java.lang.String r1 = "background mix task is fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
                java.lang.String r1 = r4.field_taskId
                r2.yx0(r1)
                goto L_0x0158
            L_0x0148:
                java.lang.String r1 = "background mix task is not finished"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
                goto L_0x0158
            L_0x014e:
                java.lang.String r1 = "background mix task is expired"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
                java.lang.String r1 = r4.field_taskId
                r2.yx0(r1)
            L_0x0158:
                r7 = 0
                goto L_0x0177
            L_0x015a:
                java.lang.String r1 = r4.field_bgMixTaskId
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x0169
                java.lang.String r1 = "foreground mix task"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            L_0x0167:
                r1 = 1
                goto L_0x0176
            L_0x0169:
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = r4.field_bgMixTaskId
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "background mix bgMixTaskId:%s, retry haowan publish"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r2)
            L_0x0176:
                r7 = 1
            L_0x0177:
                if (r7 != 0) goto L_0x017a
                return
            L_0x017a:
                di3.d r0 = di3.C86312j.m106911c(r0)
                sw1.q r0 = (sw1.C48484q) r0
                ly1.l r0 = r0.mo66107kc()
                r1 = r19
                ly1.i r2 = r1.f292339e
                java.lang.String r2 = r2.field_taskId
                r3 = 2
                r0.mo139114bD(r2, r3)
                ly1.i r0 = r1.f292339e
                java.lang.String r0 = r0.field_localIdList
                java.util.LinkedList r0 = uy1.C52642c.m58981B(r0)
                ly1.h0 r2 = new ly1.h0
                ly1.i r3 = r1.f292339e
                java.lang.String r3 = r3.field_taskId
                int r4 = r1.f292338d
                boolean r5 = r1.f292340f
                r2.<init>(r3, r4, r0, r5)
                ly1.j$a$a r3 = new ly1.j$a$a
                r3.<init>(r0)
                r2.f292312d = r3
                monitor-enter(r2)
                java.lang.Class<v10.e> r0 = v10.C52735e.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x01da }
                v10.e r0 = (v10.C52735e) r0     // Catch:{ all -> 0x01da }
                h81.h$c r3 = h81.C32735h.C32737c.clicfg_game_haowan_publish_retry_num_android     // Catch:{ all -> 0x01da }
                r4 = 5
                int r0 = r0.mo61266Ad(r3, r4)     // Catch:{ all -> 0x01da }
                ly1.C99736h0.f292308p = r0     // Catch:{ all -> 0x01da }
                java.util.Set<java.lang.String> r0 = r2.f292313e     // Catch:{ all -> 0x01da }
                java.util.HashSet r0 = (java.util.HashSet) r0     // Catch:{ all -> 0x01da }
                r0.clear()     // Catch:{ all -> 0x01da }
                java.util.Set<java.lang.String> r0 = r2.f292313e     // Catch:{ all -> 0x01da }
                java.util.LinkedList<java.lang.String> r3 = r2.f292310b     // Catch:{ all -> 0x01da }
                r0.addAll(r3)     // Catch:{ all -> 0x01da }
                r2.mo139095e()     // Catch:{ all -> 0x01da }
                monitor-exit(r2)
                ly1.j r0 = ly1.C99745j.this
                java.util.HashMap<java.lang.String, ly1.h0> r0 = r0.f292337d
                ly1.i r3 = r1.f292339e
                java.lang.String r3 = r3.field_taskId
                r0.put(r3, r2)
                return
            L_0x01da:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ly1.C99745j.C99746a.run():void");
        }
    }

    /* renamed from: ly1.j$b */
    public class C99748b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f292345d;

        public C99748b(String str) {
            this.f292345d = str;
        }

        public void run() {
            C99745j.this.wx0(this.f292345d, -2);
        }
    }

    /* renamed from: ly1.j$c */
    public class C99749c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Map f292347d;

        /* renamed from: e */
        public final /* synthetic */ C47350c.C47352b f292348e;

        /* renamed from: f */
        public final /* synthetic */ String f292349f;

        /* renamed from: g */
        public final /* synthetic */ C13794o.C13795a f292350g;

        /* renamed from: h */
        public final /* synthetic */ int f292351h;

        /* renamed from: i */
        public final /* synthetic */ int f292352i;

        /* renamed from: ly1.j$c$a */
        public class C99750a implements C40324j.C40326a {

            /* renamed from: a */
            public final /* synthetic */ long f292354a;

            public C99750a(long j) {
                this.f292354a = j;
            }

            /* renamed from: a */
            public void mo288a(int i, int i2, String str, C47350c cVar) {
                Class cls = C48484q.class;
                Log.m105925i("MicroMsg.Haowan.GameHaowanPublishImpl", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                C99749c.this.f292347d.put("costtime", Long.valueOf(System.currentTimeMillis() - this.f292354a));
                C99749c.this.f292347d.put("topicid", Integer.valueOf(((C53033x) cVar.f127056b.f127083a).f148047g));
                if (i == 0 && i2 == 0) {
                    C99754l kc = ((C48484q) C86312j.m106911c(cls)).mo66107kc();
                    String str2 = C99749c.this.f292349f;
                    kc.getClass();
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(str2);
                    kc.mo139115jo(linkedList);
                    C13794o.C13795a aVar = C99749c.this.f292350g;
                    if (aVar.f38926a) {
                        String str3 = aVar.f38927b;
                        if (aVar.f38928c && !Util.isNullOrNil(str3)) {
                            C99745j.vx0(C99745j.this, true, str3);
                            ((C48478n) C86312j.m106911c(C48478n.class)).mo65679Pf(str3);
                        }
                        C48478n.C48481f fVar = C46586d.f125494a;
                        if (fVar != null) {
                            if (fVar != null) {
                                fVar.onSuccess();
                            }
                            C46586d.f125494a = null;
                        }
                    }
                    C99749c cVar2 = C99749c.this;
                    C99745j.this.wx0(cVar2.f292349f, 0);
                    Context context = MMApplicationContext.getContext();
                    C99749c cVar3 = C99749c.this;
                    C40314g.m43484c(context, 87, 8765, 0, 48, cVar3.f292351h, C15032a.m14200a(cVar3.f292352i, cVar3.f292347d));
                    return;
                }
                ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139116kD(C99749c.this.f292349f, 1);
                if (C99749c.this.f292350g.f38926a) {
                    C48478n.C48481f fVar2 = C46586d.f125494a;
                    if (fVar2 != null) {
                        if (fVar2 != null) {
                            fVar2.mo6931a("publish error");
                        }
                        C46586d.f125494a = null;
                    }
                    C99749c cVar4 = C99749c.this;
                    C99745j.vx0(C99745j.this, false, cVar4.f292350g.f38927b);
                }
                C99749c cVar5 = C99749c.this;
                C99745j.this.wx0(cVar5.f292349f, i2 > 0 ? -i2 : i2);
                C99749c.this.f292347d.put("failid", Integer.valueOf(i2));
                Context context2 = MMApplicationContext.getContext();
                C99749c cVar6 = C99749c.this;
                C40314g.m43484c(context2, 87, 8765, 0, 56, cVar6.f292351h, C15032a.m14200a(cVar6.f292352i, cVar6.f292347d));
            }
        }

        public C99749c(Map map, C47350c.C47352b bVar, String str, C13794o.C13795a aVar, int i, int i2) {
            this.f292347d = map;
            this.f292348e = bVar;
            this.f292349f = str;
            this.f292350g = aVar;
            this.f292351h = i;
            this.f292352i = i2;
        }

        public void run() {
            if (this.f292347d.containsKey("videoid")) {
                Map map = this.f292347d;
                map.put("videoid", C86013q1.m106456q((String) map.get("videoid")));
            }
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(this.f292348e.mo72403a(), new C99750a(System.currentTimeMillis()));
        }
    }

    public static void vx0(C99745j jVar, boolean z, String str) {
        C48478n.C13792e rR;
        jVar.getClass();
        if (Util.isNullOrNil(str) || (rR = ((C48478n) C86312j.m106911c(C48478n.class)).mo65692rR(str)) == null) {
            return;
        }
        if (z) {
            C47890b.m53200a(rR.f38908b, 3, 103, 10, 0, rR.f38916j);
        } else {
            C47890b.m53200a(rR.f38908b, 3, 103, 10, 1, rR.f38916j);
        }
    }

    /* renamed from: DV */
    public JSONArray mo13150DV(JSONArray jSONArray, boolean z) {
        Iterator<C99743i> it;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String substring;
        String str;
        LinkedList linkedList;
        Iterator it4;
        JSONArray jSONArray4;
        String str2;
        JSONArray jSONArray5;
        Class cls = C48484q.class;
        JSONArray jSONArray6 = new JSONArray();
        String str3 = ",";
        if (z) {
            C99754l kc = ((C48484q) C86312j.m106911c(cls)).mo66107kc();
            kc.getClass();
            String format = String.format("select * from %s where %s<>%d", new Object[]{"GameHaowanPublishEdition", "publishState", 2});
            Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryAllNotFinished, sql : %s", format);
            Cursor rawQuery = kc.rawQuery(format, new String[0]);
            if (rawQuery == null) {
                linkedList = null;
            } else {
                linkedList = new LinkedList();
                while (rawQuery.moveToNext()) {
                    C99743i iVar = new C99743i();
                    iVar.convertFrom(rawQuery);
                    linkedList.add(iVar);
                }
                rawQuery.close();
            }
            if (Util.isNullOrNil((List) linkedList)) {
                return null;
            }
            Iterator it5 = linkedList.iterator();
            while (it5.hasNext()) {
                C99743i iVar2 = (C99743i) it5.next();
                String str4 = iVar2.field_taskId;
                int i = iVar2.field_publishState;
                String str5 = iVar2.field_localIdList;
                String str6 = iVar2.field_BusinessData;
                long j = iVar2.field_createTime;
                int i2 = iVar2.field_mixState;
                try {
                    MMHandler mMHandler = C52642c.f146980a;
                    it4 = it5;
                    jSONArray4 = jSONArray6;
                    try {
                        String[] split = str5.substring(1, str5.length() - 1).split(str3);
                        jSONArray5 = new JSONArray();
                        str2 = str3;
                        int i3 = 0;
                        while (i3 < split.length) {
                            try {
                                jSONArray5.put(split[i3].trim());
                                i3++;
                            } catch (Exception unused) {
                                jSONArray5 = null;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("postId", str4);
                                jSONObject.put("state", i);
                                jSONObject.put("localIds", jSONArray5);
                                jSONObject.put("extra", str6);
                                jSONObject.put("createTime", j);
                                jSONObject.put("mixState", i2);
                                jSONArray6 = jSONArray4;
                                jSONArray6.put(jSONObject);
                                it5 = it4;
                                str3 = str2;
                            }
                        }
                    } catch (Exception unused2) {
                        str2 = str3;
                        jSONArray5 = null;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("postId", str4);
                        jSONObject2.put("state", i);
                        jSONObject2.put("localIds", jSONArray5);
                        jSONObject2.put("extra", str6);
                        jSONObject2.put("createTime", j);
                        jSONObject2.put("mixState", i2);
                        jSONArray6 = jSONArray4;
                        jSONArray6.put(jSONObject2);
                        it5 = it4;
                        str3 = str2;
                    }
                } catch (Exception unused3) {
                    it4 = it5;
                    jSONArray4 = jSONArray6;
                    str2 = str3;
                    jSONArray5 = null;
                    JSONObject jSONObject22 = new JSONObject();
                    jSONObject22.put("postId", str4);
                    jSONObject22.put("state", i);
                    jSONObject22.put("localIds", jSONArray5);
                    jSONObject22.put("extra", str6);
                    jSONObject22.put("createTime", j);
                    jSONObject22.put("mixState", i2);
                    jSONArray6 = jSONArray4;
                    jSONArray6.put(jSONObject22);
                    it5 = it4;
                    str3 = str2;
                }
                JSONObject jSONObject222 = new JSONObject();
                try {
                    jSONObject222.put("postId", str4);
                    jSONObject222.put("state", i);
                    jSONObject222.put("localIds", jSONArray5);
                    jSONObject222.put("extra", str6);
                    jSONObject222.put("createTime", j);
                    jSONObject222.put("mixState", i2);
                } catch (JSONException unused4) {
                }
                jSONArray6 = jSONArray4;
                jSONArray6.put(jSONObject222);
                it5 = it4;
                str3 = str2;
            }
            return jSONArray6;
        }
        String str7 = str3;
        LinkedList<String> b = C52642c.m58984b(jSONArray);
        if (Util.isNullOrNil((List) b)) {
            return null;
        }
        LinkedList<C99743i> Lo = ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139111Lo(b);
        if (Util.isNullOrNil((List) Lo)) {
            return null;
        }
        Iterator<C99743i> it6 = Lo.iterator();
        while (it6.hasNext()) {
            C99743i next = it6.next();
            String str8 = next.field_taskId;
            int i4 = next.field_publishState;
            String str9 = next.field_localIdList;
            String str10 = next.field_BusinessData;
            long j2 = next.field_createTime;
            int i5 = next.field_mixState;
            try {
                MMHandler mMHandler2 = C52642c.f146980a;
                it = it6;
                try {
                    substring = str9.substring(1, str9.length() - 1);
                    str = str7;
                } catch (Exception unused5) {
                    jSONArray2 = jSONArray6;
                    jSONArray3 = null;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("postId", str8);
                    jSONObject3.put("state", i4);
                    jSONObject3.put("localIds", jSONArray3);
                    jSONObject3.put("extra", str10);
                    jSONObject3.put("createTime", j2);
                    jSONObject3.put("mixState", i5);
                    jSONArray6 = jSONArray2;
                    jSONArray6.put(jSONObject3);
                    it6 = it;
                }
                try {
                    String[] split2 = substring.split(str);
                    jSONArray3 = new JSONArray();
                    jSONArray2 = jSONArray6;
                    str7 = str;
                    int i6 = 0;
                    while (i6 < split2.length) {
                        try {
                            jSONArray3.put(split2[i6].trim());
                            i6++;
                        } catch (Exception unused6) {
                            jSONArray3 = null;
                            JSONObject jSONObject32 = new JSONObject();
                            jSONObject32.put("postId", str8);
                            jSONObject32.put("state", i4);
                            jSONObject32.put("localIds", jSONArray3);
                            jSONObject32.put("extra", str10);
                            jSONObject32.put("createTime", j2);
                            jSONObject32.put("mixState", i5);
                            jSONArray6 = jSONArray2;
                            jSONArray6.put(jSONObject32);
                            it6 = it;
                        }
                    }
                } catch (Exception unused7) {
                    jSONArray2 = jSONArray6;
                    str7 = str;
                    jSONArray3 = null;
                    JSONObject jSONObject322 = new JSONObject();
                    jSONObject322.put("postId", str8);
                    jSONObject322.put("state", i4);
                    jSONObject322.put("localIds", jSONArray3);
                    jSONObject322.put("extra", str10);
                    jSONObject322.put("createTime", j2);
                    jSONObject322.put("mixState", i5);
                    jSONArray6 = jSONArray2;
                    jSONArray6.put(jSONObject322);
                    it6 = it;
                }
            } catch (Exception unused8) {
                it = it6;
                jSONArray2 = jSONArray6;
                jSONArray3 = null;
                JSONObject jSONObject3222 = new JSONObject();
                jSONObject3222.put("postId", str8);
                jSONObject3222.put("state", i4);
                jSONObject3222.put("localIds", jSONArray3);
                jSONObject3222.put("extra", str10);
                jSONObject3222.put("createTime", j2);
                jSONObject3222.put("mixState", i5);
                jSONArray6 = jSONArray2;
                jSONArray6.put(jSONObject3222);
                it6 = it;
            }
            JSONObject jSONObject32222 = new JSONObject();
            try {
                jSONObject32222.put("postId", str8);
                jSONObject32222.put("state", i4);
                jSONObject32222.put("localIds", jSONArray3);
                jSONObject32222.put("extra", str10);
                jSONObject32222.put("createTime", j2);
                jSONObject32222.put("mixState", i5);
            } catch (JSONException unused9) {
            }
            jSONArray6 = jSONArray2;
            jSONArray6.put(jSONObject32222);
            it6 = it;
        }
        return jSONArray6;
    }

    public void Ia0(JSONArray jSONArray, boolean z) {
        LinkedList linkedList;
        Class cls = C48484q.class;
        if (z) {
            for (String str : this.f292337d.keySet()) {
                this.f292337d.get(str).mo139092b();
            }
            C99754l kc = ((C48484q) C86312j.m106911c(cls)).mo66107kc();
            kc.getClass();
            String format = String.format("select * from %s", new Object[]{"GameHaowanPublishEdition"});
            Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryAll, sql : %s", format);
            Cursor rawQuery = kc.rawQuery(format, new String[0]);
            if (rawQuery == null) {
                linkedList = null;
            } else {
                LinkedList linkedList2 = new LinkedList();
                while (rawQuery.moveToNext()) {
                    C99743i iVar = new C99743i();
                    iVar.convertFrom(rawQuery);
                    linkedList2.add(iVar);
                }
                rawQuery.close();
                linkedList = linkedList2;
            }
            if (Util.isNullOrNil((List) linkedList)) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((C48484q) C86312j.m106911c(cls)).og0().mo139090jo(C52642c.m58981B(((C99743i) it.next()).field_localIdList));
                }
            }
            String format2 = String.format("delete from %s", new Object[]{"GameHaowanPublishEdition"});
            Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "deleteAll, sql : %s", format2);
            kc.execSQL("GameHaowanPublishEdition", format2);
            this.f292337d.clear();
            wx0("", 1);
            return;
        }
        LinkedList<String> b = C52642c.m58984b(jSONArray);
        if (!Util.isNullOrNil((List) b)) {
            Iterator<String> it4 = b.iterator();
            while (it4.hasNext()) {
                String next = it4.next();
                C99736h0 remove = this.f292337d.remove(next);
                if (remove != null) {
                    remove.mo139092b();
                }
                wx0(next, 1);
            }
            ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139115jo(b);
        }
    }

    /* renamed from: TN */
    public String mo13152TN(String str) {
        C99743i iVar;
        C99754l kc = ((C48484q) C86312j.m106911c(C48484q.class)).mo66107kc();
        kc.getClass();
        String format = String.format("select * from %s where %s=\"%s\" and %s<>%d", new Object[]{"GameHaowanPublishEdition", "taskId", str, "publishState", 2});
        Log.m105925i("MicroMsg.Haowan.GameHaowanPublishStorage", "queryWhenPublishNotSuccess, sql : %s", format);
        Cursor rawQuery = kc.rawQuery(format, new String[0]);
        if (rawQuery == null) {
            iVar = null;
        } else {
            if (rawQuery.moveToNext()) {
                iVar = new C99743i();
                iVar.convertFrom(rawQuery);
            } else {
                iVar = null;
            }
            rawQuery.close();
        }
        if (iVar == null) {
            return null;
        }
        return xx0(iVar.field_mediaType, iVar, iVar.field_compressImg, new C13794o.C13795a());
    }

    /* renamed from: wC */
    public String mo13153wC(int i, int i2, JSONArray jSONArray, String str, boolean z, int i3, C13794o.C13795a aVar) {
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        C86709a0.m107528h();
        sb.append(C86709a0.m107523b().mo121110g());
        sb.append("_");
        sb.append(System.currentTimeMillis());
        String f = C90193h.m112878f(sb.toString().getBytes());
        LinkedList<String> b = C52642c.m58984b(jSONArray);
        C99743i iVar = new C99743i();
        iVar.field_taskId = f;
        iVar.field_createTime = System.currentTimeMillis() / 1000;
        iVar.field_publishSource = i;
        iVar.field_mediaType = i2;
        if (!Util.isNullOrNil((List) b)) {
            str2 = b.toString();
        }
        iVar.field_localIdList = str2;
        iVar.field_BusinessData = str;
        iVar.field_compressImg = z;
        iVar.field_sourceSceneId = i3;
        boolean insert = ((C48484q) C86312j.m106911c(C48484q.class)).mo66107kc().insert(iVar);
        Log.m105924i("MicroMsg.Haowan.GameHaowanPublishImpl", "addToDB: " + insert);
        return xx0(i2, iVar, z, aVar);
    }

    public final void wx0(String str, int i) {
        Iterator<C101705t> it = C48471j.f129677a.iterator();
        while (it.hasNext()) {
            C101705t next = it.next();
            if (next != null) {
                next.mo68081k2(str, i);
            }
        }
        C38166b.m41755b(C101706u.class, new j$$a(str, i));
    }

    public final String xx0(int i, C99743i iVar, boolean z, C13794o.C13795a aVar) {
        if (Util.isNullOrNil(iVar.field_localIdList)) {
            zx0(iVar.field_taskId, iVar.field_publishSource, (LinkedList<String>) null, iVar.field_BusinessData, iVar.field_sourceSceneId, aVar);
        } else {
            ((C119157j) C119157j.f356862d).mo183875f(new C99746a(i, iVar, z, aVar));
        }
        return iVar.field_taskId;
    }

    public final void yx0(String str) {
        Class cls = C48484q.class;
        ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139114bD(str, 1);
        ((C48484q) C86312j.m106911c(cls)).mo66107kc().mo139116kD(str, 1);
        MMHandlerThread.postToMainThreadDelayed(new C99748b(str), 2000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zx0(java.lang.String r19, int r20, java.util.LinkedList<java.lang.String> r21, java.lang.String r22, int r23, sw1.C13794o.C13795a r24) {
        /*
            r18 = this;
            r4 = r19
            ob0.c$b r3 = new ob0.c$b
            r3.<init>()
            java.lang.String r0 = "/cgi-bin/mmgame-bin/publishugctogamecenter"
            r3.f127068c = r0
            r0 = 2989(0xbad, float:4.188E-42)
            r3.f127069d = r0
            vw1.w r0 = new vw1.w
            r0.<init>()
            r7 = r20
            r0.f148040d = r7
            r1 = 0
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r21)
            r6 = 0
            r8 = 0
            if (r5 != 0) goto L_0x00f6
            java.lang.Class<sw1.q> r5 = sw1.C48484q.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            sw1.q r5 = (sw1.C48484q) r5
            ly1.h r5 = r5.og0()
            r5.getClass()
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "GameHaowanMedia"
            r9[r8] = r10
            java.lang.String r10 = "localId"
            r11 = 1
            r9[r11] = r10
            java.lang.String r10 = uy1.C52642c.m58987e(r21)
            r12 = 2
            r9[r12] = r10
            java.lang.String r10 = "select * from %s where %s in %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "batchGet, sql: "
            r10.append(r13)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            java.lang.String r13 = "MicroMsg.Haowan.GameHaowanPublishStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r10)
            java.lang.String[] r10 = new java.lang.String[r8]
            android.database.Cursor r5 = r5.rawQuery(r9, r10)
            if (r5 != 0) goto L_0x006c
            r9 = r6
            goto L_0x0088
        L_0x006c:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L_0x0071:
            boolean r10 = r5.moveToNext()
            if (r10 == 0) goto L_0x0085
            ly1.g r10 = new ly1.g
            r10.<init>()
            r10.convertFrom(r5)
            java.lang.String r13 = r10.field_localId
            r9.put(r13, r10)
            goto L_0x0071
        L_0x0085:
            r5.close()
        L_0x0088:
            if (r9 == 0) goto L_0x00f6
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r0.f148041e = r5
            java.util.Iterator r5 = r21.iterator()
            r10 = 0
        L_0x0096:
            boolean r13 = r5.hasNext()
            if (r13 == 0) goto L_0x00f3
            java.lang.Object r13 = r5.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = r9.containsKey(r13)
            if (r14 != 0) goto L_0x00a9
            goto L_0x0096
        L_0x00a9:
            java.lang.Object r13 = r9.get(r13)
            ly1.g r13 = (ly1.C99729g) r13
            vw1.u r14 = new vw1.u
            r14.<init>()
            int r15 = r13.field_mediaType
            if (r15 != r11) goto L_0x00bc
            r14.f148027d = r11
            r8 = 1
            goto L_0x00c8
        L_0x00bc:
            r11 = 4
            if (r15 != r11) goto L_0x00c8
            r14.f148027d = r12
            java.lang.String r6 = r13.field_filePath
            int r10 = r13.field_duration
            long r1 = r13.field_size
            r8 = 2
        L_0x00c8:
            java.lang.String r11 = r13.field_mediaUrl
            r14.f148028e = r11
            java.lang.String r11 = r13.field_thumbPicUrl
            r14.f148029f = r11
            int r11 = r13.field_duration
            r14.f148033j = r11
            int r11 = r13.field_width
            r14.f148030g = r11
            int r11 = r13.field_height
            r14.f148031h = r11
            r16 = r1
            long r1 = r13.field_size
            r14.f148034n = r1
            boolean r1 = r13.field_isGif
            r14.f148032i = r1
            int r1 = r13.field_editFlag
            r14.f148035o = r1
            java.util.LinkedList<vw1.u> r1 = r0.f148041e
            r1.add(r14)
            r1 = r16
            r11 = 1
            goto L_0x0096
        L_0x00f3:
            r5 = r22
            goto L_0x00f9
        L_0x00f6:
            r5 = r22
            r10 = 0
        L_0x00f9:
            r0.f148042f = r5
            r0.f148043g = r4
            r3.f127066a = r0
            vw1.x r0 = new vw1.x
            r0.<init>()
            r3.f127067b = r0
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r0 = "pushid"
            r5.put(r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.String r8 = "type"
            r5.put(r8, r0)
            if (r6 == 0) goto L_0x0178
            java.lang.String r0 = "videoid"
            r5.put(r0, r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.lang.String r8 = "origtime"
            r5.put(r8, r0)
            my1.a r0 = my1.C100022a.C100024b.f293042a
            java.util.HashMap<java.lang.String, my1.a$c> r0 = r0.f293041a
            java.lang.Object r0 = r0.remove(r6)
            my1.a$c r0 = (my1.C100022a.C100025c) r0
            java.lang.String r6 = "origsize"
            if (r0 == 0) goto L_0x0171
            int r8 = r0.f293046d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.put(r6, r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "remuxsize"
            r5.put(r2, r1)
            int r1 = r0.f293044b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "hasexpre"
            r5.put(r2, r1)
            int r1 = r0.f293043a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "hasword"
            r5.put(r2, r1)
            int r0 = r0.f293045c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "hasmusic"
            r5.put(r1, r0)
            goto L_0x0178
        L_0x0171:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r5.put(r6, r0)
        L_0x0178:
            ly1.j$c r8 = new ly1.j$c
            r0 = r8
            r1 = r18
            r2 = r5
            r4 = r19
            r5 = r24
            r6 = r23
            r7 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7)
            ji3.C9457a.m9137a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ly1.C99745j.zx0(java.lang.String, int, java.util.LinkedList, java.lang.String, int, sw1.o$a):void");
    }
}
