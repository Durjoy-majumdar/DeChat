package com.tencent.p014mm.plugin.sns.model;

import android.text.TextUtils;
import bo2.C92277a;
import co2.C92448q;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pointers.PBool;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ds2.C97540j;
import f40.C86709a0;
import fs2.C32163a;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98394e0;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98411p;
import hd0.C98429r0;
import hd0.C98438x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jq2.C98993j;
import l03.C99279f;
import l03.C99285j;
import l03.C99290o;
import lq2.C99585d;
import p1081gi.C98127h;
import rq2.C101425k;
import te3.C101804kv2;
import te3.C64491kg3;
import te3.ir4;
import vr2.C102236a0;
import vr2.C102260r;
import xb0.C38471b;

/* renamed from: com.tencent.mm.plugin.sns.model.f2 */
public class C94869f2 implements C98411p.C98414c {

    /* renamed from: a */
    public volatile C94952t2 f274914a;

    /* renamed from: b */
    public LinkedList<C94952t2> f274915b;

    /* renamed from: c */
    public Map<String, C94952t2> f274916c;

    /* renamed from: d */
    public LinkedList<SnsInfo> f274917d;

    /* renamed from: e */
    public LinkedList<C98411p> f274918e;

    /* renamed from: f */
    public int f274919f;

    /* renamed from: g */
    public int f274920g;

    /* renamed from: h */
    public boolean f274921h;

    /* renamed from: i */
    public boolean f274922i;

    /* renamed from: com.tencent.mm.plugin.sns.model.f2$a */
    public class C94870a implements Comparator<C98411p> {
        public C94870a(C94869f2 f2Var) {
        }

        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$1");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$1");
            int i = -((int) (((C98411p) obj).f288605m - ((C98411p) obj2).f288605m));
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$1");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$1");
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.f2$b */
    public class C94871b implements Comparator<C98411p> {
        public C94871b(C94869f2 f2Var) {
        }

        public int compare(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
            SnsMethodCalculate.markStartTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
            int i = -((int) (((C98411p) obj).f288605m - ((C98411p) obj2).f288605m));
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
            SnsMethodCalculate.markEndTimeMs("compare", "com.tencent.mm.plugin.sns.model.SnsVideoService$2");
            return i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.f2$c */
    public class C94872c implements Runnable {
        public C94872c() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
            synchronized (C94869f2.m120304b(C94869f2.this)) {
                while (C94869f2.m120304b(C94869f2.this).size() > 0) {
                    try {
                        ((C98411p) C94869f2.m120304b(C94869f2.this).poll()).mo137738e();
                    } catch (Throwable th) {
                        while (true) {
                            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
                            throw th;
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$3");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.f2$d */
    public class C94873d implements Runnable {
        public C94873d() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.tencent.mm.plugin.sns.storage.SnsInfo} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0225, code lost:
            if (r0 != false) goto L_0x0235;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0227, code lost:
            if (r16 == false) goto L_0x0235;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x022d, code lost:
            if (rq2.C101425k.m133097a(r2) != false) goto L_0x0235;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x022f, code lost:
            com.tencent.p014mm.plugin.sns.model.C94869f2.m120313k(r1.f274924d, r10, r2, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0235, code lost:
            r0 = new hd0.C98411p(r15, r14.getLocalid());
            r2 = r1.f274924d;
            r0.f288606n = r2.f274922i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0248, code lost:
            if (r0.mo137735b(r2) >= 0) goto L_0x0262;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x024a, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105929w("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD curr preload task do scene error. hash:[%d ]", java.lang.Integer.valueOf(r1.f274924d.hashCode()));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0262, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] start to preload , pPreloadPercent:%d  [success to preload]", r0.f288595c, java.lang.Integer.valueOf(r8.value));
            r0.f288605m = java.lang.System.currentTimeMillis();
            r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r1.f274924d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0286, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r1.f274924d).add(0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0291, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:?, code lost:
            r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r1.f274924d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0298, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
            r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r1.f274924d).iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a7, code lost:
            if (r0.hasNext() == false) goto L_0x02e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a9, code lost:
            r3 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r0.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02af, code lost:
            if (r3 == null) goto L_0x02e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x02bd, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r3.getLocalid(), r14.getLocalid()) == false) goto L_0x02e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bf, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD find sns info[%s], remove now. hash:[%d ]", r14.getLocalid(), java.lang.Integer.valueOf(r1.f274924d.hashCode()));
            r0.remove();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e4, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e5, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ed, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ee, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f8, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f9, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0303, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0304, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0305, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.SnsVideoService", r0, "", new java.lang.Object[0]);
            r0 = r1.f274924d;
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            r0.mo131038x();
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0326, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0327, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0328, code lost:
            r21 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
            monitor-exit(r21);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x032b, code lost:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0333, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0334, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
            r4 = r1.f274924d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
            if (r4.f274921h != false) goto L_0x00a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
            if (r4.f274922i == false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
            if (fs2.C32163a.m39640a() != false) goto L_0x009f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD isInChatting:%b, x-config enable preload:%b . [fail to preload]", java.lang.Boolean.valueOf(r1.f274924d.f274921h), java.lang.Boolean.valueOf(fs2.C32163a.m39640a()));
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bf, code lost:
            r5 = new com.tencent.p014mm.pointers.PBool();
            r8 = new com.tencent.p014mm.pointers.PInt();
            r9 = new com.tencent.p014mm.pointers.PString();
            r10 = "";
            r11 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r1.f274924d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d6, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r12 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r1.f274924d).iterator();
            r14 = null;
            r15 = null;
            r16 = false;
            r17 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
            if (r12.hasNext() == false) goto L_0x01ea;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ed, code lost:
            r14 = r12.next();
            r10 = r14.getLocalid();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
            if (r14.isAd() != false) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fe, code lost:
            if (r4 == false) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0100, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD: the sns info is not ad and preload is disable!");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
            r14 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
            r16 = lq2.C99585d.m130000e(r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x010d, code lost:
            if (r0 != false) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x010f, code lost:
            if (r16 != false) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
            if (r3 == false) goto L_0x011c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0113, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload: current snsInfo is not slideFullCard ad and isUpperLimit is true!");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
            r13 = r1.f274924d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0120, code lost:
            if (r13.f274922i == false) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0122, code lost:
            r6 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120309g(r13, r14, r5, r8, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
            r6 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120310h(r13, r14, r5, r8, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x012f, code lost:
            if (r14.isAd() == false) goto L_0x01a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
            r13 = r14.getAdInfo();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0135, code lost:
            if (r13 != null) goto L_0x0139;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0137, code lost:
            r13 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
            r13 = r13.getAdPreloadConfig();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x013d, code lost:
            if (r13 == null) goto L_0x017d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x013f, code lost:
            r2 = r13.f264107a;
            r13 = r13.f264108b;
            r19 = r3;
            r3 = new java.lang.StringBuilder();
            r20 = r4;
            r3.append("adVideoPreload timeline online, snsId=");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0153, code lost:
            r4 = r10;
            r21 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            r3.append(vr2.C102236a0.m134765q0(r14.field_snsId));
            r3.append(", cfg.forbidPreload=");
            r3.append(r2);
            r3.append(", cfg.ratio=");
            r3.append(r13);
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SnsVideoService", r3.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0176, code lost:
            if (r2 == false) goto L_0x01ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0178, code lost:
            r5.value = true;
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
            r19 = r3;
            r20 = r4;
            r4 = r10;
            r21 = r11;
            com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.SnsVideoService", "adVideoPreload timeline online, snsId=" + vr2.C102236a0.m134765q0(r14.field_snsId) + ", adPreloadConfig=null");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a6, code lost:
            r19 = r3;
            r20 = r4;
            r4 = r10;
            r21 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01af, code lost:
            if (r5.value == false) goto L_0x01b4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b1, code lost:
            r12.remove();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b4, code lost:
            if (r6 == false) goto L_0x01dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b6, code lost:
            if (r0 != false) goto L_0x01cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b8, code lost:
            if (r16 == false) goto L_0x01cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01ba, code lost:
            r17 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120311i(r1.f274924d, r14, r8, r9.value);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c6, code lost:
            if (rq2.C101425k.m133097a(r17) != false) goto L_0x01c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
            r12.remove();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cd, code lost:
            r15 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120312j(r1.f274924d, r14, r8, r9.value);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d5, code lost:
            if (r15 == null) goto L_0x01d9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d7, code lost:
            r10 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d9, code lost:
            r12.remove();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x01dd, code lost:
            r14 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x01de, code lost:
            r10 = r4;
            r3 = r19;
            r4 = r20;
            r11 = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ea, code lost:
            r21 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ec, code lost:
            r2 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ee, code lost:
            monitor-exit(r21);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ef, code lost:
            if (r14 != null) goto L_0x0201;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f1, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD current preload list null");
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0200, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0201, code lost:
            if (r0 == false) goto L_0x0205;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0203, code lost:
            r16 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0205, code lost:
            if (r15 != null) goto L_0x0225;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0207, code lost:
            if (r16 == false) goto L_0x0225;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x020d, code lost:
            if (rq2.C101425k.m133097a(r2) == false) goto L_0x0225;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x020f, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] null task . [fail to preload]", r10);
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0224, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                com.tencent.mm.plugin.sns.model.t2 r0 = r0.f274914a
                if (r0 == 0) goto L_0x0019
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x0019:
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                java.util.LinkedList r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120305c(r0)
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x002e
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x002e:
                boolean r0 = jq2.C98993j.m128902d()
                r2 = 0
                if (r0 != 0) goto L_0x003c
                com.tencent.mm.plugin.sns.model.f2 r3 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                boolean r3 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120307e(r3)
                goto L_0x003d
            L_0x003c:
                r3 = 0
            L_0x003d:
                com.tencent.mm.plugin.sns.model.f2 r4 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                java.util.LinkedList r4 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r4)
                monitor-enter(r4)
                com.tencent.mm.plugin.sns.model.f2 r5 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x0336 }
                java.util.LinkedList r5 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r5)     // Catch:{ all -> 0x0336 }
                int r5 = r5.size()     // Catch:{ all -> 0x0336 }
                com.tencent.mm.plugin.sns.model.f2 r6 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x0336 }
                java.lang.String r7 = "access$300"
                java.lang.String r8 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)     // Catch:{ all -> 0x0336 }
                int r6 = r6.f274919f     // Catch:{ all -> 0x0336 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)     // Catch:{ all -> 0x0336 }
                r7 = 1
                if (r5 < r6) goto L_0x008b
                java.lang.String r5 = "SlideFullCard.MicroMsg.SnsVideoService"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0336 }
                r6.<init>()     // Catch:{ all -> 0x0336 }
                java.lang.String r8 = "tryPreload: currentPreloadList isUpperLimit, isSlideFullCardAd is "
                r6.append(r8)     // Catch:{ all -> 0x0336 }
                r6.append(r3)     // Catch:{ all -> 0x0336 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0336 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x0336 }
                if (r3 != 0) goto L_0x0089
                java.lang.String r0 = "MicroMsg.SnsVideoService"
                java.lang.String r2 = "SNS_PRELOAD_LOAD working with max count ,try later again . [fail to preload]"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ all -> 0x0336 }
                monitor-exit(r4)     // Catch:{ all -> 0x0336 }
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x0089:
                r3 = 1
                goto L_0x008c
            L_0x008b:
                r3 = 0
            L_0x008c:
                monitor-exit(r4)     // Catch:{ all -> 0x0336 }
                com.tencent.mm.plugin.sns.model.f2 r4 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                boolean r5 = r4.f274921h
                r6 = 2
                if (r5 != 0) goto L_0x00a1
                boolean r4 = r4.f274922i
                if (r4 == 0) goto L_0x009f
                boolean r4 = fs2.C32163a.m39640a()
                if (r4 != 0) goto L_0x009f
                goto L_0x00a1
            L_0x009f:
                r4 = 0
                goto L_0x00bf
            L_0x00a1:
                java.lang.String r4 = "MicroMsg.SnsVideoService"
                java.lang.String r5 = "SNS_PRELOAD_LOAD isInChatting:%b, x-config enable preload:%b . [fail to preload]"
                java.lang.Object[] r8 = new java.lang.Object[r6]
                com.tencent.mm.plugin.sns.model.f2 r9 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                boolean r9 = r9.f274921h
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                r8[r2] = r9
                boolean r9 = fs2.C32163a.m39640a()
                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
                r8[r7] = r9
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r8)
                r4 = 1
            L_0x00bf:
                com.tencent.mm.pointers.PBool r5 = new com.tencent.mm.pointers.PBool
                r5.<init>()
                com.tencent.mm.pointers.PInt r8 = new com.tencent.mm.pointers.PInt
                r8.<init>()
                com.tencent.mm.pointers.PString r9 = new com.tencent.mm.pointers.PString
                r9.<init>()
                java.lang.String r10 = ""
                com.tencent.mm.plugin.sns.model.f2 r11 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                java.util.LinkedList r11 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r11)
                monitor-enter(r11)
                com.tencent.mm.plugin.sns.model.f2 r12 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x0327 }
                java.util.LinkedList r12 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r12)     // Catch:{ all -> 0x0327 }
                java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0327 }
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
            L_0x00e7:
                boolean r18 = r12.hasNext()     // Catch:{ all -> 0x0327 }
                if (r18 == 0) goto L_0x01ea
                java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0327 }
                r14 = r10
                com.tencent.mm.plugin.sns.storage.SnsInfo r14 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r14     // Catch:{ all -> 0x0327 }
                java.lang.String r10 = r14.getLocalid()     // Catch:{ all -> 0x0327 }
                boolean r18 = r14.isAd()     // Catch:{ all -> 0x0327 }
                if (r18 != 0) goto L_0x0109
                if (r4 == 0) goto L_0x0109
                java.lang.String r14 = "MicroMsg.SnsVideoService"
                java.lang.String r13 = "SNS_PRELOAD_LOAD: the sns info is not ad and preload is disable!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)     // Catch:{ all -> 0x0327 }
            L_0x0107:
                r14 = 0
                goto L_0x00e7
            L_0x0109:
                boolean r16 = lq2.C99585d.m130000e(r14)     // Catch:{ all -> 0x0327 }
                if (r0 != 0) goto L_0x011c
                if (r16 != 0) goto L_0x011c
                if (r3 == 0) goto L_0x011c
                java.lang.String r13 = "SlideFullCard.MicroMsg.SnsVideoService"
                java.lang.String r14 = "tryPreload: current snsInfo is not slideFullCard ad and isUpperLimit is true!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)     // Catch:{ all -> 0x0327 }
                goto L_0x0107
            L_0x011c:
                com.tencent.mm.plugin.sns.model.f2 r13 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x0327 }
                boolean r6 = r13.f274922i     // Catch:{ all -> 0x0327 }
                if (r6 == 0) goto L_0x0127
                boolean r6 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120309g(r13, r14, r5, r8, r9)     // Catch:{ all -> 0x0327 }
                goto L_0x012b
            L_0x0127:
                boolean r6 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120310h(r13, r14, r5, r8, r9)     // Catch:{ all -> 0x0327 }
            L_0x012b:
                boolean r13 = r14.isAd()     // Catch:{ all -> 0x0327 }
                if (r13 == 0) goto L_0x01a6
                com.tencent.mm.plugin.sns.storage.ADInfo r13 = r14.getAdInfo()     // Catch:{ all -> 0x0327 }
                if (r13 != 0) goto L_0x0139
                r13 = 0
                goto L_0x013d
            L_0x0139:
                bo2.a r13 = r13.getAdPreloadConfig()     // Catch:{ all -> 0x0327 }
            L_0x013d:
                if (r13 == 0) goto L_0x017d
                boolean r2 = r13.f264107a     // Catch:{ all -> 0x0327 }
                int r13 = r13.f264108b     // Catch:{ all -> 0x0327 }
                java.lang.String r7 = "MicroMsg.SnsVideoService"
                r19 = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0327 }
                r3.<init>()     // Catch:{ all -> 0x0327 }
                r20 = r4
                java.lang.String r4 = "adVideoPreload timeline online, snsId="
                r3.append(r4)     // Catch:{ all -> 0x0327 }
                r4 = r10
                r21 = r11
                long r10 = r14.field_snsId     // Catch:{ all -> 0x0334 }
                java.lang.String r10 = vr2.C102236a0.m134765q0(r10)     // Catch:{ all -> 0x0334 }
                r3.append(r10)     // Catch:{ all -> 0x0334 }
                java.lang.String r10 = ", cfg.forbidPreload="
                r3.append(r10)     // Catch:{ all -> 0x0334 }
                r3.append(r2)     // Catch:{ all -> 0x0334 }
                java.lang.String r10 = ", cfg.ratio="
                r3.append(r10)     // Catch:{ all -> 0x0334 }
                r3.append(r13)     // Catch:{ all -> 0x0334 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0334 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)     // Catch:{ all -> 0x0334 }
                if (r2 == 0) goto L_0x01ad
                r2 = 1
                r5.value = r2     // Catch:{ all -> 0x0334 }
                r6 = 0
                goto L_0x01ad
            L_0x017d:
                r19 = r3
                r20 = r4
                r4 = r10
                r21 = r11
                java.lang.String r2 = "MicroMsg.SnsVideoService"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0334 }
                r3.<init>()     // Catch:{ all -> 0x0334 }
                java.lang.String r7 = "adVideoPreload timeline online, snsId="
                r3.append(r7)     // Catch:{ all -> 0x0334 }
                long r10 = r14.field_snsId     // Catch:{ all -> 0x0334 }
                java.lang.String r7 = vr2.C102236a0.m134765q0(r10)     // Catch:{ all -> 0x0334 }
                r3.append(r7)     // Catch:{ all -> 0x0334 }
                java.lang.String r7 = ", adPreloadConfig=null"
                r3.append(r7)     // Catch:{ all -> 0x0334 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0334 }
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r3)     // Catch:{ all -> 0x0334 }
                goto L_0x01ad
            L_0x01a6:
                r19 = r3
                r20 = r4
                r4 = r10
                r21 = r11
            L_0x01ad:
                boolean r2 = r5.value     // Catch:{ all -> 0x0334 }
                if (r2 == 0) goto L_0x01b4
                r12.remove()     // Catch:{ all -> 0x0334 }
            L_0x01b4:
                if (r6 == 0) goto L_0x01dd
                if (r0 != 0) goto L_0x01cd
                if (r16 == 0) goto L_0x01cd
                com.tencent.mm.plugin.sns.model.f2 r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x0334 }
                java.lang.String r3 = r9.value     // Catch:{ all -> 0x0334 }
                java.util.List r17 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120311i(r2, r14, r8, r3)     // Catch:{ all -> 0x0334 }
                boolean r2 = rq2.C101425k.m133097a(r17)     // Catch:{ all -> 0x0334 }
                if (r2 != 0) goto L_0x01c9
                goto L_0x01d7
            L_0x01c9:
                r12.remove()     // Catch:{ all -> 0x0334 }
                goto L_0x01de
            L_0x01cd:
                com.tencent.mm.plugin.sns.model.f2 r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x0334 }
                java.lang.String r3 = r9.value     // Catch:{ all -> 0x0334 }
                gi.h r15 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120312j(r2, r14, r8, r3)     // Catch:{ all -> 0x0334 }
                if (r15 == 0) goto L_0x01d9
            L_0x01d7:
                r10 = r4
                goto L_0x01ec
            L_0x01d9:
                r12.remove()     // Catch:{ all -> 0x0334 }
                goto L_0x01de
            L_0x01dd:
                r14 = 0
            L_0x01de:
                r10 = r4
                r3 = r19
                r4 = r20
                r11 = r21
                r2 = 0
                r6 = 2
                r7 = 1
                goto L_0x00e7
            L_0x01ea:
                r21 = r11
            L_0x01ec:
                r2 = r17
                monitor-exit(r21)     // Catch:{ all -> 0x0334 }
                if (r14 != 0) goto L_0x0201
                java.lang.String r0 = "MicroMsg.SnsVideoService"
                java.lang.String r2 = "SNS_PRELOAD_LOAD current preload list null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x0201:
                if (r0 == 0) goto L_0x0205
                r16 = 0
            L_0x0205:
                if (r15 != 0) goto L_0x0225
                if (r16 == 0) goto L_0x0225
                boolean r3 = rq2.C101425k.m133097a(r2)
                if (r3 == 0) goto L_0x0225
                java.lang.String r0 = "MicroMsg.SnsVideoService"
                java.lang.String r2 = "SNS_PRELOAD_LOAD sns:[%s] null task . [fail to preload]"
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r4 = 0
                r3[r4] = r10
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r3)
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x0225:
                if (r0 != 0) goto L_0x0235
                if (r16 == 0) goto L_0x0235
                boolean r0 = rq2.C101425k.m133097a(r2)     // Catch:{ Exception -> 0x0304 }
                if (r0 != 0) goto L_0x0235
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ Exception -> 0x0304 }
                com.tencent.p014mm.plugin.sns.model.C94869f2.m120313k(r0, r10, r2, r8)     // Catch:{ Exception -> 0x0304 }
                goto L_0x0292
            L_0x0235:
                hd0.p r0 = new hd0.p     // Catch:{ Exception -> 0x0304 }
                java.lang.String r2 = r14.getLocalid()     // Catch:{ Exception -> 0x0304 }
                r0.<init>(r15, r2)     // Catch:{ Exception -> 0x0304 }
                com.tencent.mm.plugin.sns.model.f2 r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ Exception -> 0x0304 }
                boolean r3 = r2.f274922i     // Catch:{ Exception -> 0x0304 }
                r0.f288606n = r3     // Catch:{ Exception -> 0x0304 }
                int r2 = r0.mo137735b(r2)     // Catch:{ Exception -> 0x0304 }
                if (r2 >= 0) goto L_0x0262
                java.lang.String r0 = "MicroMsg.SnsVideoService"
                java.lang.String r2 = "SNS_PRELOAD_LOAD curr preload task do scene error. hash:[%d ]"
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0304 }
                com.tencent.mm.plugin.sns.model.f2 r3 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ Exception -> 0x0304 }
                int r3 = r3.hashCode()     // Catch:{ Exception -> 0x0304 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0304 }
                r5 = 0
                r4[r5] = r3     // Catch:{ Exception -> 0x0304 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r2, r4)     // Catch:{ Exception -> 0x0304 }
                goto L_0x0292
            L_0x0262:
                java.lang.String r2 = "MicroMsg.SnsVideoService"
                java.lang.String r3 = "SNS_PRELOAD_LOAD sns:[%s] start to preload , pPreloadPercent:%d  [success to preload]"
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0304 }
                java.lang.String r4 = r0.f288595c     // Catch:{ Exception -> 0x0304 }
                r6 = 0
                r5[r6] = r4     // Catch:{ Exception -> 0x0304 }
                int r4 = r8.value     // Catch:{ Exception -> 0x0304 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0304 }
                r6 = 1
                r5[r6] = r4     // Catch:{ Exception -> 0x0304 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)     // Catch:{ Exception -> 0x0304 }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0304 }
                r0.f288605m = r2     // Catch:{ Exception -> 0x0304 }
                com.tencent.mm.plugin.sns.model.f2 r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ Exception -> 0x0304 }
                java.util.LinkedList r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r2)     // Catch:{ Exception -> 0x0304 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x0304 }
                com.tencent.mm.plugin.sns.model.f2 r3 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x02f9 }
                java.util.LinkedList r3 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r3)     // Catch:{ all -> 0x02f9 }
                r4 = 0
                r3.add(r4, r0)     // Catch:{ all -> 0x02f9 }
                monitor-exit(r2)     // Catch:{ all -> 0x02f9 }
            L_0x0292:
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ Exception -> 0x0304 }
                java.util.LinkedList r2 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r0)     // Catch:{ Exception -> 0x0304 }
                monitor-enter(r2)     // Catch:{ Exception -> 0x0304 }
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x02ee }
                java.util.LinkedList r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120308f(r0)     // Catch:{ all -> 0x02ee }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x02ee }
            L_0x02a3:
                boolean r3 = r0.hasNext()     // Catch:{ all -> 0x02ee }
                if (r3 == 0) goto L_0x02e4
                java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x02ee }
                com.tencent.mm.plugin.sns.storage.SnsInfo r3 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r3     // Catch:{ all -> 0x02ee }
                if (r3 == 0) goto L_0x02e1
                java.lang.String r3 = r3.getLocalid()     // Catch:{ all -> 0x02ee }
                java.lang.String r4 = r14.getLocalid()     // Catch:{ all -> 0x02ee }
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x02ee }
                if (r3 == 0) goto L_0x02e1
                java.lang.String r3 = "MicroMsg.SnsVideoService"
                java.lang.String r4 = "SNS_PRELOAD_LOAD find sns info[%s], remove now. hash:[%d ]"
                r5 = 2
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x02ee }
                java.lang.String r7 = r14.getLocalid()     // Catch:{ all -> 0x02ee }
                r8 = 0
                r6[r8] = r7     // Catch:{ all -> 0x02ee }
                com.tencent.mm.plugin.sns.model.f2 r7 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x02ee }
                int r7 = r7.hashCode()     // Catch:{ all -> 0x02ee }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x02ee }
                r8 = 1
                r6[r8] = r7     // Catch:{ all -> 0x02ee }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r6)     // Catch:{ all -> 0x02ee }
                r0.remove()     // Catch:{ all -> 0x02ee }
                goto L_0x02a3
            L_0x02e1:
                r5 = 2
                r8 = 1
                goto L_0x02a3
            L_0x02e4:
                monitor-exit(r2)     // Catch:{ all -> 0x02ee }
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x02ee:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x02ee }
                java.lang.String r2 = "run"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ Exception -> 0x0304 }
                throw r0     // Catch:{ Exception -> 0x0304 }
            L_0x02f9:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x02f9 }
                java.lang.String r2 = "run"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)     // Catch:{ Exception -> 0x0304 }
                throw r0     // Catch:{ Exception -> 0x0304 }
            L_0x0304:
                r0 = move-exception
                java.lang.String r2 = "MicroMsg.SnsVideoService"
                java.lang.String r3 = ""
                r4 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                java.lang.String r2 = "access$1000"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                r0.mo131038x()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x0327:
                r0 = move-exception
                r21 = r11
            L_0x032a:
                monitor-exit(r21)     // Catch:{ all -> 0x0334 }
                java.lang.String r2 = "run"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r0
            L_0x0334:
                r0 = move-exception
                goto L_0x032a
            L_0x0336:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0336 }
                java.lang.String r2 = "run"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsVideoService$4"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94869f2.C94873d.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.f2$e */
    public class C94874e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C98411p f274925d;

        public C94874e(C98411p pVar) {
            this.f274925d = pVar;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:27|28|29|30|31) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00fe */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r35 = this;
                r1 = r35
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$5"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
                r2 = 1
                fs2.C32163a.m39641b(r2)
                hd0.x r0 = hd0.C98398h0.yx0()
                r3 = 0
                r0.mo137774e(r3)
                hd0.p r0 = r1.f274925d
                r4 = 0
                r0.f288609q = r4
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                java.util.LinkedList r5 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r0)
                monitor-enter(r5)
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this     // Catch:{ all -> 0x02d2 }
                java.util.LinkedList r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.m120304b(r0)     // Catch:{ all -> 0x02d2 }
                hd0.p r6 = r1.f274925d     // Catch:{ all -> 0x02d2 }
                r0.remove(r6)     // Catch:{ all -> 0x02d2 }
                monitor-exit(r5)     // Catch:{ all -> 0x02d2 }
                com.tencent.mm.plugin.sns.model.f2 r5 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                java.lang.String r6 = "access$1100"
                java.lang.String r7 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                r5.getClass()
                java.lang.String r8 = "SlideFullCard.MicroMsg.SnsVideoService"
                java.lang.String r9 = "deleteExpiredFile"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r7)
                long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
                java.lang.String r0 = "getSnsPreloadVideoExpiredTime"
                java.lang.String r12 = "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r12)
                java.lang.Class<h81.h> r13 = h81.C32735h.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                h81.h r13 = (h81.C32735h) r13
                h81.h$c r14 = h81.C32735h.C32737c.clicfg_sns_preload_video_expired_time
                r15 = 3
                int r13 = r13.mo58779Qe(r14, r15)
                fs2.C32163a.f85506l = r13
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r12)
                long r16 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                long r12 = (long) r13
                r18 = 86400(0x15180, double:4.26873E-319)
                long r12 = r12 * r18
                long r12 = r16 - r12
                r14 = 4
                java.lang.Object[] r0 = new java.lang.Object[r14]
                int r16 = r5.hashCode()
                java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
                r0[r3] = r16
                java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
                r0[r2] = r16
                r4 = 130(0x82, float:1.82E-43)
                java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
                r14 = 2
                r0[r14] = r17
                java.lang.Long r17 = java.lang.Long.valueOf(r12)
                r0[r15] = r17
                java.lang.String r15 = "MicroMsg.SnsVideoService"
                java.lang.String r3 = "%d start to delete expired file limit[%d] status[%d] expiredTime[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r3, r0)
                hd0.o0 r0 = hd0.C98398h0.Bx0()
                java.util.List r3 = r0.mo137724j(r4, r2, r12)
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L_0x00aa
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r7)
                r1 = r6
                r14 = r7
                goto L_0x02bf
            L_0x00aa:
                boolean r4 = jq2.C98993j.m128902d()
                java.util.Iterator r12 = r3.iterator()
                r13 = 0
            L_0x00b3:
                boolean r0 = r12.hasNext()
                if (r0 == 0) goto L_0x0277
                java.lang.Object r0 = r12.next()
                hd0.n0 r0 = (hd0.C98408n0) r0
                if (r0 != 0) goto L_0x00ca
                r23 = r6
                r14 = r7
                r26 = r8
                r22 = r12
                goto L_0x026a
            L_0x00ca:
                java.lang.String r2 = r0.mo137700d()     // Catch:{ all -> 0x024e }
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, java.lang.String> r21 = com.tencent.p014mm.plugin.sns.model.C94867e2.f274913a     // Catch:{ all -> 0x024e }
                java.lang.String r14 = "fileNameToSnsLocalId"
                r22 = r12
                java.lang.String r12 = "com.tencent.mm.plugin.sns.model.SnsVideoLogic"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)     // Catch:{ all -> 0x024a }
                boolean r23 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ all -> 0x024a }
                java.lang.String r24 = ""
                if (r23 == 0) goto L_0x00e7
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)     // Catch:{ all -> 0x024a }
                r23 = r6
                goto L_0x00f5
            L_0x00e7:
                java.lang.String r1 = "SNS_"
                int r1 = r2.indexOf(r1)     // Catch:{ all -> 0x024a }
                r23 = r6
                r6 = -1
                if (r1 > r6) goto L_0x00f8
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)     // Catch:{ all -> 0x0245 }
            L_0x00f5:
                r1 = r24
                goto L_0x0102
            L_0x00f8:
                int r1 = r1 + 4
                java.lang.String r24 = r2.substring(r1)     // Catch:{ Exception -> 0x00fe }
            L_0x00fe:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)     // Catch:{ all -> 0x0245 }
                goto L_0x00f5
            L_0x0102:
                java.lang.String r2 = r0.f288544L     // Catch:{ all -> 0x0245 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0245 }
                r6.<init>()     // Catch:{ all -> 0x0245 }
                r6.append(r2)     // Catch:{ all -> 0x0245 }
                java.lang.String r12 = "_"
                r6.append(r12)     // Catch:{ all -> 0x0245 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0245 }
                java.lang.String r6 = vr2.C102260r.m134869i(r1, r6)     // Catch:{ all -> 0x0245 }
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0245 }
                r12.<init>()     // Catch:{ all -> 0x0245 }
                java.lang.String r14 = "deleteExpiredFile, snsLocalId is "
                r12.append(r14)     // Catch:{ all -> 0x0245 }
                r12.append(r1)     // Catch:{ all -> 0x0245 }
                java.lang.String r1 = ", mediaId is "
                r12.append(r1)     // Catch:{ all -> 0x0245 }
                r12.append(r2)     // Catch:{ all -> 0x0245 }
                java.lang.String r1 = ", realSnsLocalId is "
                r12.append(r1)     // Catch:{ all -> 0x0245 }
                r12.append(r6)     // Catch:{ all -> 0x0245 }
                java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x0245 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)     // Catch:{ all -> 0x0245 }
                os2.e0 r1 = com.tencent.p014mm.plugin.sns.model.C94866e1.Yx0()     // Catch:{ all -> 0x0245 }
                com.tencent.mm.plugin.sns.storage.SnsInfo r1 = r1.mo139798DN(r6)     // Catch:{ all -> 0x0245 }
                if (r1 == 0) goto L_0x01ac
                boolean r6 = lq2.C99585d.m130000e(r1)     // Catch:{ all -> 0x0245 }
                if (r6 == 0) goto L_0x01ac
                com.tencent.mm.plugin.sns.storage.ADXml r6 = r1.getAdXml()     // Catch:{ all -> 0x0245 }
                co2.r r6 = r6.adSliderFullCardInfo     // Catch:{ all -> 0x0245 }
                if (r6 == 0) goto L_0x01ac
                if (r4 != 0) goto L_0x01aa
                com.tencent.mm.plugin.sns.storage.ADXml r1 = r1.getAdXml()     // Catch:{ all -> 0x0245 }
                co2.r r1 = r1.adSliderFullCardInfo     // Catch:{ all -> 0x0245 }
                java.util.List<co2.q> r1 = r1.f264582a     // Catch:{ all -> 0x0245 }
                boolean r6 = rq2.C101425k.m133097a(r1)     // Catch:{ all -> 0x0245 }
                if (r6 == 0) goto L_0x016c
                java.lang.String r0 = "deleteExpiredFile, adSlideFullCardItemInfoList is null or empty, continue"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x0245 }
                goto L_0x0241
            L_0x016c:
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0245 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0245 }
            L_0x0172:
                boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0245 }
                if (r6 == 0) goto L_0x01aa
                java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0245 }
                co2.q r6 = (co2.C92448q) r6     // Catch:{ all -> 0x0245 }
                r12 = 2
                java.lang.String[] r14 = new java.lang.String[r12]     // Catch:{ all -> 0x0245 }
                r12 = 0
                r14[r12] = r2     // Catch:{ all -> 0x0245 }
                te3.kv2 r12 = r6.f264577e     // Catch:{ all -> 0x0245 }
                java.lang.String r12 = r12.f298689d     // Catch:{ all -> 0x0245 }
                r20 = 1
                r14[r20] = r12     // Catch:{ all -> 0x0245 }
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r14)     // Catch:{ all -> 0x0245 }
                if (r12 != 0) goto L_0x0172
                te3.kv2 r12 = r6.f264577e     // Catch:{ all -> 0x0245 }
                java.lang.String r12 = r12.f298689d     // Catch:{ all -> 0x0245 }
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r12)     // Catch:{ all -> 0x0245 }
                if (r12 == 0) goto L_0x0172
                te3.kv2 r1 = r6.f264577e     // Catch:{ all -> 0x0245 }
                java.lang.String r6 = "deleteExpiredFile, already find a adSlideFullCardItemInfo media, mediaId is %s, break"
                r12 = 1
                java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ all -> 0x0245 }
                r12 = 0
                r14[r12] = r2     // Catch:{ all -> 0x0245 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r6, r14)     // Catch:{ all -> 0x0245 }
                goto L_0x01d5
            L_0x01aa:
                r1 = 0
                goto L_0x01d5
            L_0x01ac:
                if (r1 == 0) goto L_0x0241
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ all -> 0x0245 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ all -> 0x0245 }
                if (r2 == 0) goto L_0x0241
                com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r1.getTimeLine()     // Catch:{ all -> 0x0245 }
                te3.j00 r2 = r2.ContentObj     // Catch:{ all -> 0x0245 }
                java.util.LinkedList<te3.kv2> r2 = r2.f298427h     // Catch:{ all -> 0x0245 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)     // Catch:{ all -> 0x0245 }
                if (r2 == 0) goto L_0x01c6
                goto L_0x0241
            L_0x01c6:
                com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r1.getTimeLine()     // Catch:{ all -> 0x0245 }
                te3.j00 r1 = r1.ContentObj     // Catch:{ all -> 0x0245 }
                java.util.LinkedList<te3.kv2> r1 = r1.f298427h     // Catch:{ all -> 0x0245 }
                r2 = 0
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0245 }
                te3.kv2 r1 = (te3.C101804kv2) r1     // Catch:{ all -> 0x0245 }
            L_0x01d5:
                java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120295n(r1)     // Catch:{ all -> 0x0245 }
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ all -> 0x0245 }
                if (r2 != 0) goto L_0x0232
                com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x0245 }
                r2.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0245 }
                boolean r6 = r2.mo119967g()     // Catch:{ all -> 0x0245 }
                if (r6 == 0) goto L_0x0232
                long r24 = r2.mo119980r()     // Catch:{ all -> 0x0245 }
                java.lang.String r6 = "%s file[%d %d] lastmodifytime[%d] path[%s]"
                r12 = 5
                java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0245 }
                java.lang.String r14 = r0.mo137700d()     // Catch:{ all -> 0x0245 }
                r19 = 0
                r12[r19] = r14     // Catch:{ all -> 0x0245 }
                java.lang.Long r14 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0245 }
                r20 = 1
                r12[r20] = r14     // Catch:{ all -> 0x0245 }
                int r14 = r0.f288539G     // Catch:{ all -> 0x0245 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0245 }
                r21 = 2
                r12[r21] = r14     // Catch:{ all -> 0x0245 }
                r14 = r7
                r26 = r8
                long r7 = r0.f288564k     // Catch:{ all -> 0x023f }
                java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x023f }
                r8 = 3
                r12[r8] = r7     // Catch:{ all -> 0x023f }
                r7 = 4
                r12[r7] = r1     // Catch:{ all -> 0x023f }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r6, r12)     // Catch:{ all -> 0x023f }
                r6 = 0
                int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
                if (r1 <= 0) goto L_0x0235
                int r1 = r0.f288539G     // Catch:{ all -> 0x023f }
                long r6 = (long) r1     // Catch:{ all -> 0x023f }
                int r1 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
                if (r1 > 0) goto L_0x0235
                r2.mo119966f()     // Catch:{ all -> 0x023f }
                int r13 = r13 + 1
                goto L_0x0235
            L_0x0232:
                r14 = r7
                r26 = r8
            L_0x0235:
                r1 = 0
                r0.f288539G = r1     // Catch:{ all -> 0x023f }
                r1 = 1
                r0.f288548P = r1     // Catch:{ all -> 0x023f }
                hd0.C98429r0.m127808N(r0)     // Catch:{ all -> 0x023f }
                goto L_0x026a
            L_0x023f:
                r0 = move-exception
                goto L_0x0256
            L_0x0241:
                r14 = r7
                r26 = r8
                goto L_0x026a
            L_0x0245:
                r0 = move-exception
            L_0x0246:
                r14 = r7
                r26 = r8
                goto L_0x0256
            L_0x024a:
                r0 = move-exception
                r23 = r6
                goto L_0x0246
            L_0x024e:
                r0 = move-exception
                r23 = r6
                r14 = r7
                r26 = r8
                r22 = r12
            L_0x0256:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "deleteExpiredFile, exp is "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            L_0x026a:
                r1 = r35
                r7 = r14
                r12 = r22
                r6 = r23
                r8 = r26
                r2 = 1
                r14 = 2
                goto L_0x00b3
            L_0x0277:
                r23 = r6
                r14 = r7
                com.tencent.mm.plugin.report.service.n r27 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r28 = 354(0x162, double:1.75E-321)
                r30 = 145(0x91, double:7.16E-322)
                long r0 = (long) r13
                r34 = 0
                r32 = r0
                r27.idkeyStat(r28, r30, r32, r34)
                r1 = 4
                java.lang.Object[] r0 = new java.lang.Object[r1]
                int r1 = r5.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 0
                r0[r2] = r1
                java.util.LinkedList r3 = (java.util.LinkedList) r3
                int r1 = r3.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                r2 = 2
                r0[r2] = r1
                long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 3
                r0[r2] = r1
                java.lang.String r1 = "%d delete expire file size %d delete count %d costTime[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r1, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r14)
                r1 = r23
            L_0x02bf:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r14)
                r1 = r35
                com.tencent.mm.plugin.sns.model.f2 r0 = com.tencent.p014mm.plugin.sns.model.C94869f2.this
                r0.mo131035u()
                java.lang.String r0 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.model.SnsVideoService$5"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
                return
            L_0x02d2:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x02d2 }
                java.lang.String r2 = "run"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsVideoService$5"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94869f2.C94874e.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.f2$f */
    public class C94875f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f274927d;

        /* renamed from: e */
        public final /* synthetic */ Object[] f274928e;

        public C94875f(String str, Object[] objArr) {
            this.f274927d = str;
            this.f274928e = objArr;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$6");
            C98398h0.xx0().mo126983g(this.f274927d, this.f274928e);
            if (C94869f2.this.f274914a != null && Util.isEqual(C94869f2.this.f274914a.f275255b, this.f274927d)) {
                C94869f2 f2Var = C94869f2.this;
                f2Var.getClass();
                SnsMethodCalculate.markStartTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                C86709a0.m107528h();
                C86709a0.m107525e().postToWorker(new C94881h2(f2Var));
                SnsMethodCalculate.markEndTimeMs("downloadVideoFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            }
            C94869f2 f2Var2 = C94869f2.this;
            SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            Map<String, C94952t2> map = f2Var2.f274916c;
            SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            LinkedList c = C94869f2.m120305c(C94869f2.this);
            c.remove((C94952t2) ((ConcurrentHashMap) map).get(this.f274927d));
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.f2$g */
    public class C94876g implements Runnable {
        public C94876g() {
        }

        public void run() {
            String str;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
            if (C94869f2.m120305c(C94869f2.this).isEmpty()) {
                Log.m105924i("MicroMsg.SnsVideoService", "download queue is null, do nothing");
                C94869f2.m120306d(C94869f2.this);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
                return;
            }
            C94952t2 t2Var = (C94952t2) C94869f2.m120305c(C94869f2.this).poll();
            if (t2Var == null) {
                Log.m105929w("MicroMsg.SnsVideoService", "try start download video task is null. queue size %d", Integer.valueOf(C94869f2.m120305c(C94869f2.this).size()));
                C94869f2.m120306d(C94869f2.this);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
                return;
            }
            boolean z = C94869f2.this.f274914a != null && t2Var.f275255b.equals(C94869f2.this.f274914a.f275255b);
            C94869f2 f2Var = C94869f2.this;
            SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            f2Var.getClass();
            SnsMethodCalculate.markStartTimeMs("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            synchronized (f2Var.f274918e) {
                try {
                    Iterator<C98411p> it = f2Var.f274918e.iterator();
                    while (it.hasNext()) {
                        C98411p next = it.next();
                        Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_PAUSE pause preload sns:[%s]", next.f288595c);
                        next.mo137738e();
                    }
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("pausePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            C94869f2 f2Var2 = C94869f2.this;
            SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            f2Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            String f = C94867e2.m120287f(t2Var.f275259f, t2Var.f275257d);
            if (!Util.isNullOrNil(f)) {
                String str2 = t2Var.f275259f;
                Log.m105925i("MicroMsg.SnsVideoService", "this sns:[%s] video[%s] already download finish, do nothing. [%s, %s]", str2, t2Var.f275255b, str2, f);
                SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                str = "access$1500";
            } else {
                boolean v = C86013q1.m106461v(C94867e2.m120293l(t2Var.f275257d.f298689d));
                String n = C94867e2.m120295n(t2Var.f275257d);
                Log.m105925i("MicroMsg.SnsVideoService", "createPreloadTask snsLocalId:%s media id:%s file:%s", t2Var.f275259f, t2Var.f275257d.f298689d, n);
                String str3 = t2Var.f275259f;
                C101804kv2 kv22 = t2Var.f275257d;
                C98408n0 e = C94867e2.m120286e(str3, kv22.f298689d, kv22.f298687U);
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_video_db_error_repair, true);
                if (e != null && wf && !TextUtils.isEmpty(e.f288544L) && !e.f288544L.equals(t2Var.f275257d.f298689d)) {
                    Log.m105921e("MicroMsg.SnsVideoService", "NOTICE2 bad media id,delete video info. current:%s db:%s", e.f288544L, t2Var.f275257d.f298689d);
                    C98429r0.m127815f(C94867e2.m120284c(t2Var.f275259f));
                    e = null;
                }
                if (e == null) {
                    String str4 = t2Var.f275259f;
                    C101804kv2 kv23 = t2Var.f275257d;
                    C94867e2.m120300s(str4, kv23.f298689d, t2Var.f275260g, kv23.f298687U, n);
                } else {
                    C94867e2.m120303v(e, t2Var.f275257d.f298689d, t2Var.f275260g);
                }
                Log.m105925i("MicroMsg.SnsVideoService", "prepare stream download sns video %s mkDir %b", n, Boolean.valueOf(v));
                String str5 = t2Var.f275257d.f298689d;
                C96983o3 b = C96983o3.m124650b();
                b.f284145b = t2Var.f275258e;
                SnsMethodCalculate.markStartTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markEndTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                String str6 = t2Var.f275257d.f298692g;
                SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markStartTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markEndTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                C98394e0.vx0();
                C92755e0 xx02 = C98398h0.xx0();
                String d = C94867e2.m120285d(t2Var.f275259f, t2Var.f275257d.f298687U);
                int i = t2Var.f275256c;
                C101804kv2 kv24 = t2Var.f275257d;
                String str7 = "access$1500";
                boolean z2 = z;
                C94869f2 f2Var3 = f2Var2;
                C98127h k = xx02.mo126987k(b, str6, n, d, i, kv24.f298681N, kv24.f298689d, kv24.f298671D, kv24.f298672E, kv24.f298687U);
                if (k == null) {
                    SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    String str8 = t2Var.f275254a;
                    k.f287691W = str8;
                    k.f287693X = str8;
                    try {
                        String str9 = t2Var.f275259f;
                        SnsObject f2 = C94897n1.m120368f(C94866e1.Yx0().mo139798DN(C102260r.m134869i(str9, t2Var.f275257d.f298689d + "_")));
                        k.f287682R0 = f2.f283891Id + "";
                        k.f287692W0 = f2.PreDownloadInfo.f183931d;
                    } catch (Exception unused) {
                    }
                    C101804kv2 kv25 = t2Var.f275257d;
                    k.f287703e1 = kv25.f298689d;
                    C94869f2 f2Var4 = f2Var3;
                    k.f287667n = f2Var4.mo131032r(kv25);
                    String str10 = t2Var.f275257d.f298687U;
                    k.f287699a1 = str10;
                    k.f287698Z0 = 0;
                    Log.m105925i("MicroMsg.SnsVideoService", "download video flag:%s", str10);
                    f2Var4.f274914a = t2Var;
                    f2Var4.f274914a.f275255b = k.field_mediaId;
                    Log.m105925i("MicroMsg.SnsVideoService", "start stream download sns video cdnMediaId %s delay %b", f2Var4.f274914a.f275255b, Boolean.valueOf(z2));
                    C98398h0.xx0().mo126981e(k, z2);
                    SnsMethodCalculate.markEndTimeMs("downloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                }
                str = str7;
            }
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.SnsVideoService");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$8");
        }
    }

    public C94869f2() {
        this.f274915b = null;
        this.f274916c = null;
        this.f274917d = null;
        this.f274918e = new LinkedList<>();
        this.f274919f = 3;
        this.f274920g = 6;
        this.f274921h = false;
        this.f274922i = false;
        this.f274914a = null;
        this.f274915b = new LinkedList<>();
        this.f274916c = new ConcurrentHashMap();
        this.f274917d = new LinkedList<>();
    }

    /* renamed from: b */
    public static /* synthetic */ LinkedList m120304b(C94869f2 f2Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        LinkedList<C98411p> linkedList = f2Var.f274918e;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    /* renamed from: c */
    public static /* synthetic */ LinkedList m120305c(C94869f2 f2Var) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        LinkedList<C94952t2> linkedList = f2Var.f274915b;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    /* renamed from: d */
    public static void m120306d(C94869f2 f2Var) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        f2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (f2Var.f274918e) {
            try {
                boolean d = C98993j.m128902d();
                Iterator<C98411p> it = f2Var.f274918e.iterator();
                while (it.hasNext()) {
                    C98411p next = it.next();
                    if (next.f288608p != 1) {
                        SnsInfo DN = C94866e1.Yx0().mo139798DN(next.f288595c);
                        if (DN != null) {
                            String f = C94867e2.m120287f(DN.getLocalid(), DN.getTimeLine().ContentObj.f298427h.get(0));
                            if (!Util.isNullOrNil(f)) {
                                Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_RESUME sns:[%s] , video[%s] already download finish, do nothing.", DN.getLocalid(), f);
                                it.remove();
                            } else {
                                Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_RESUME resume preload sns:[%s]", next.f288595c);
                                if (next.mo137735b(f2Var) < 0) {
                                    Log.m105929w("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD curr preload task do scene error. hash:[%d ]", Integer.valueOf(f2Var.hashCode()));
                                    it.remove();
                                }
                            }
                        }
                    } else if (!d) {
                        C101804kv2 q = f2Var.mo131031q(next);
                        if (q == null) {
                            it.remove();
                            Log.m105920e("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload, findSlideFullCardMediaObj is null");
                        } else {
                            String str = next.f288595c;
                            String f2 = C94867e2.m120287f(str, q);
                            if (!Util.isNullOrNil(f2)) {
                                Log.m105925i("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload sns fakeLocalId: [%s], video [%s] already download finish, do nothing.", str, f2);
                                it.remove();
                            } else {
                                Object[] objArr = new Object[3];
                                objArr[0] = str;
                                objArr[1] = next.f288596d;
                                C98127h hVar = next.f288599g;
                                objArr[2] = hVar != null ? hVar.f287703e1 : "";
                                Log.m105925i("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload resume preload sns fakeLocalId: [%s], cdnMediaId: [%s], mediaId: [%s]", objArr);
                                if (next.mo137735b(f2Var) < 0) {
                                    Log.m105929w("SlideFullCard.MicroMsg.SnsVideoService", "resumePreload current preload task do scene error. hash: [%d]", Integer.valueOf(f2Var.hashCode()));
                                    it.remove();
                                }
                            }
                        }
                    }
                }
                for (int size = f2Var.f274918e.size(); size < f2Var.f274919f; size++) {
                    f2Var.mo131038x();
                }
            } finally {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("resumePreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPreloadListHasSlideCardAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m120307e(com.tencent.p014mm.plugin.sns.model.C94869f2 r3) {
        /*
            java.lang.String r0 = "access$200"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r3.getClass()
            java.lang.String r0 = "checkPreloadListHasSlideCardAd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.LinkedList<com.tencent.mm.plugin.sns.storage.SnsInfo> r0 = r3.f274917d
            monitor-enter(r0)
            java.util.LinkedList<com.tencent.mm.plugin.sns.storage.SnsInfo> r1 = r3.f274917d     // Catch:{ all -> 0x005f }
            boolean r1 = rq2.C101425k.m133097a(r1)     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "checkPreloadListHasSlideCardAd"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
            goto L_0x0057
        L_0x0026:
            java.util.LinkedList<com.tencent.mm.plugin.sns.storage.SnsInfo> r3 = r3.f274917d     // Catch:{ all -> 0x005f }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x005f }
        L_0x002c:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x005f }
            com.tencent.mm.plugin.sns.storage.SnsInfo r1 = (com.tencent.p014mm.plugin.sns.storage.SnsInfo) r1     // Catch:{ all -> 0x005f }
            boolean r1 = lq2.C99585d.m130000e(r1)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x002c
            java.lang.String r3 = "SlideFullCard.MicroMsg.SnsVideoService"
            java.lang.String r1 = "checkPreloadListHasSlideCardAd: preloadList has slideFullCardAd"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)     // Catch:{ all -> 0x005f }
            r2 = 1
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "checkPreloadListHasSlideCardAd"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
            goto L_0x0057
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r3 = "checkPreloadListHasSlideCardAd"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
        L_0x0057:
            java.lang.String r3 = "access$200"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r0)
            return r2
        L_0x005f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "checkPreloadListHasSlideCardAd"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94869f2.m120307e(com.tencent.mm.plugin.sns.model.f2):boolean");
    }

    /* renamed from: f */
    public static /* synthetic */ LinkedList m120308f(C94869f2 f2Var) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        LinkedList<SnsInfo> linkedList = f2Var.f274917d;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return linkedList;
    }

    /* renamed from: g */
    public static boolean m120309g(C94869f2 f2Var, SnsInfo snsInfo, PBool pBool, PInt pInt, PString pString) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        f2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z = true;
        if (snsInfo == null) {
            pBool.value = true;
            SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        } else {
            if (snsInfo.isAd()) {
                pBool.value = false;
                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (C98398h0.yx0().mo137773d(false)) {
                pBool.value = true;
                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else {
                SnsObject f = C94897n1.m120368f(snsInfo);
                if (f.PreDownloadInfo == null) {
                    Log.m105924i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                    pBool.value = true;
                    SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    SnsMethodCalculate.markStartTimeMs("getTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    int i = C32163a.f85501g;
                    SnsMethodCalculate.markEndTimeMs("getTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    if (i <= 0) {
                        Log.m105925i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", Integer.valueOf(f2Var.hashCode()));
                        pBool.value = true;
                        SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    } else {
                        pString.value = f.f283891Id + "";
                        pInt.value = i;
                        if (!C32163a.m39640a()) {
                            Log.m105924i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD enableTimelinePreload [false]");
                            pBool.value = true;
                            SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        } else {
                            pBool.value = false;
                            SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreloadInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return z;
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z;
    }

    /* renamed from: h */
    public static boolean m120310h(C94869f2 f2Var, SnsInfo snsInfo, PBool pBool, PInt pInt, PString pString) {
        int i;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        f2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        boolean z = true;
        if (snsInfo == null) {
            pBool.value = true;
            SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        } else {
            if (snsInfo.isAd()) {
                pBool.value = false;
                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (Util.secondsToNow((long) snsInfo.getCreateTime()) >= 86400) {
                pBool.value = true;
                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else if (C98398h0.yx0().mo137773d(false)) {
                pBool.value = true;
                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            } else {
                SnsObject f = C94897n1.m120368f(snsInfo);
                if (f.PreDownloadInfo == null) {
                    Log.m105924i("MicroMsg.SnsVideoService", "sns obj is null or sns obj PreDownloadInfo is null");
                    pBool.value = true;
                    SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    Log.m105925i("MicroMsg.SnsVideoService", "%d check sns video[%s] preload [%d %d %s]", Integer.valueOf(f2Var.hashCode()), snsInfo.getLocalid(), Integer.valueOf(f.PreDownloadInfo.f183931d), Integer.valueOf(f.PreDownloadInfo.f183932e), f.PreDownloadInfo.f183933f);
                    if (f.PreDownloadInfo.f183931d <= 0) {
                        Log.m105925i("MicroMsg.SnsVideoService", "%d can not preload because percent <= 0", Integer.valueOf(f2Var.hashCode()));
                        pBool.value = true;
                        SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    } else {
                        pString.value = f.f283891Id + "";
                        C64491kg3 kg32 = f.PreDownloadInfo;
                        pInt.value = kg32.f183931d;
                        if (C38471b.m41885a(kg32.f183933f)) {
                            pBool.value = false;
                            SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        } else {
                            if (NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
                                i = f.PreDownloadInfo.f183932e & 1;
                            } else if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                                i = f.PreDownloadInfo.f183932e & 2;
                            } else if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
                                i = f.PreDownloadInfo.f183932e & 4;
                            } else {
                                pBool.value = false;
                                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            }
                            if (i > 0) {
                                pBool.value = false;
                                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            } else {
                                pBool.value = false;
                                SnsMethodCalculate.markEndTimeMs("checkSnsVideoPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            }
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return z;
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: bo2.a} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v41 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m120311i(com.tencent.p014mm.plugin.sns.model.C94869f2 r37, com.tencent.p014mm.plugin.sns.storage.SnsInfo r38, com.tencent.p014mm.pointers.PInt r39, java.lang.String r40) {
        /*
            r0 = r37
            r1 = r38
            r2 = r39
            java.lang.String r3 = "access$700"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsVideoService"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r37.getClass()
            java.lang.String r5 = "createSlideFullCardPreloadTask"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            r6 = 0
            java.lang.String r7 = "SlideFullCard.MicroMsg.SnsVideoService"
            if (r1 == 0) goto L_0x035f
            com.tencent.mm.plugin.sns.storage.ADXml r8 = r38.getAdXml()
            co2.r r8 = r8.adSliderFullCardInfo
            if (r8 != 0) goto L_0x0024
            goto L_0x035f
        L_0x0024:
            com.tencent.mm.plugin.sns.storage.ADXml r8 = r38.getAdXml()
            co2.r r8 = r8.adSliderFullCardInfo
            java.util.List<co2.q> r8 = r8.f264582a
            boolean r9 = rq2.C101425k.m133097a(r8)
            if (r9 == 0) goto L_0x003f
            java.lang.String r0 = "createSlideFullCardPreloadTask, adSlideFullCardItemInfoList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            r30 = r3
            r8 = r4
            goto L_0x036b
        L_0x003f:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r11 = r38.getLocalid()
            r12 = 100
            r2.value = r12
            long r12 = r1.field_snsId
            java.lang.String r12 = vr2.C102236a0.m134765q0(r12)
            com.tencent.mm.plugin.sns.storage.ADInfo r13 = r38.getAdInfo()
            if (r13 != 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            bo2.a r6 = r13.getAdPreloadConfig()
        L_0x0062:
            java.lang.String r13 = ", snsId is "
            if (r6 == 0) goto L_0x0089
            int r6 = r6.f264108b
            if (r6 <= 0) goto L_0x0089
            r2.value = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r14 = "createSlideFullCardPreloadTask, use config ratio: "
            r6.append(r14)
            int r14 = r2.value
            r6.append(r14)
            r6.append(r13)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            goto L_0x00a5
        L_0x0089:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r14 = "createSlideFullCardPreloadTask, use default ratio: "
            r6.append(r14)
            int r14 = r2.value
            r6.append(r14)
            r6.append(r13)
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
        L_0x00a5:
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r6 = r8.iterator()
        L_0x00ab:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0355
            java.lang.Object r8 = r6.next()
            co2.q r8 = (co2.C92448q) r8
            if (r8 == 0) goto L_0x0332
            boolean r13 = r8.mo126435a()
            if (r13 != 0) goto L_0x00c1
            goto L_0x0332
        L_0x00c1:
            te3.kv2 r8 = r8.f264577e
            java.lang.String r13 = r8.f298689d
            boolean r13 = r10.contains(r13)
            if (r13 == 0) goto L_0x00e2
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "createSlideFullCardPreloadTask, mediaIdList contains mediaId "
            r13.append(r14)
            java.lang.String r8 = r8.f298689d
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            goto L_0x00ab
        L_0x00e2:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = r8.f298689d
            r13.append(r14)
            java.lang.String r14 = "_"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = vr2.C102260r.m134862c(r11, r13)
            java.lang.String r14 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120287f(r13, r8)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r1 = "createSlideFullCardPreloadTask, localId is "
            r15.append(r1)
            r15.append(r11)
            java.lang.String r1 = ", fakeLocalId is "
            r15.append(r1)
            r15.append(r13)
            java.lang.String r1 = ", finishPath is "
            r15.append(r1)
            r15.append(r14)
            java.lang.String r1 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r1 != 0) goto L_0x0165
            java.lang.String r1 = "createSlideFullCardPreloadTask, current video is already download finish, do nothing"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            java.lang.String r1 = r8.f298680M
            long r20 = com.tencent.p014mm.vfs.C86013q1.m106451l(r14)
            boolean r13 = r0.f274922i
            if (r13 == 0) goto L_0x0139
            r19 = 4
            goto L_0x013b
        L_0x0139:
            r19 = 3
        L_0x013b:
            hd0.x r17 = hd0.C98398h0.yx0()
            java.lang.String r22 = r38.getUserName()
            r24 = 0
            java.lang.String r8 = r8.f298692g
            java.lang.String r23 = ""
            java.lang.String r25 = ""
            r18 = r1
            r26 = r8
            r27 = r40
            r17.mo137775f(r18, r19, r20, r22, r23, r24, r25, r26, r27)
            com.tencent.mm.plugin.report.service.n r26 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r27 = 354(0x162, double:1.75E-321)
            r29 = 147(0x93, double:7.26E-322)
            r31 = 1
            r33 = 0
            r26.idkeyStat(r27, r29, r31, r33)
            r1 = r38
            goto L_0x00ab
        L_0x0165:
            java.lang.String r1 = r8.f298689d
            java.lang.String r1 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120293l(r1)
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106461v(r1)
            java.lang.String r15 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120295n(r8)
            r29 = r6
            r6 = 7
            r30 = r3
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r6 = 0
            r3[r6] = r11
            r6 = 1
            r3[r6] = r13
            java.lang.String r6 = r8.f298689d
            r19 = 2
            r3[r19] = r6
            float r6 = r8.f298684R
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r17 = 3
            r3[r17] = r6
            int r6 = r2.value
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r16 = 4
            r3[r16] = r6
            r6 = 5
            r3[r6] = r12
            r20 = 6
            r3[r20] = r15
            java.lang.String r6 = "createSlideFullCardPreloadTask, realLocalId: [%s], fakeLocalId: [%s], media id: [%s], duration: [%f], preloadPercent [%d], snsId: [%s], file: [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r3)
            java.lang.String r3 = r8.f298689d
            java.lang.String r6 = r8.f298687U
            hd0.n0 r3 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120291j(r13, r3, r6)
            if (r3 == 0) goto L_0x0252
            r33 = r12
            r6 = 1
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r6 = r3.toString()
            r22 = 0
            r12[r22] = r6
            java.lang.String r6 = "createSlideFullCardPreloadTask, video info: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r6, r12)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r6 != 0) goto L_0x0237
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            if (r6 == 0) goto L_0x0237
            int r6 = r3.f288559f
            if (r6 <= 0) goto L_0x0202
            int r12 = r3.f288539G
            r34 = r4
            r35 = r5
            double r4 = (double) r12
            r22 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r22
            r12 = r9
            r36 = r10
            double r9 = (double) r6
            double r4 = r4 / r9
            double r4 = java.lang.Math.ceil(r4)
            int r6 = r2.value
            double r9 = (double) r6
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 < 0) goto L_0x0209
            r4 = 4
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r4 = 0
            r1[r4] = r11
            r5 = 1
            r1[r5] = r13
            r1[r19] = r14
            r6 = 3
            r1[r6] = r15
            java.lang.String r3 = "createSlideFullCardPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] already preload finish, do nothing."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r1)
            goto L_0x02db
        L_0x0202:
            r34 = r4
            r35 = r5
            r12 = r9
            r36 = r10
        L_0x0209:
            r4 = 0
            r5 = 1
            r6 = 3
            r9 = 7
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r4] = r11
            r9[r5] = r13
            r9[r19] = r14
            r9[r6] = r15
            int r4 = r3.f288539G
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 4
            r9[r5] = r4
            int r4 = r3.f288559f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 5
            r9[r5] = r4
            int r4 = r2.value
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9[r20] = r4
            java.lang.String r4 = "createSlideFullCardPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] has not preload finish, preloadSize is %d, totalLength is %d, preloadPercent value is %d."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r9)
            goto L_0x025b
        L_0x0237:
            r34 = r4
            r35 = r5
            r12 = r9
            r36 = r10
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r11
            r5 = 1
            r4[r5] = r13
            r4[r19] = r14
            r5 = 3
            r4[r5] = r15
            java.lang.String r5 = "createSlideFullCardPreloadTask, sns: [%s], fakeLocalId: [%s], videoFinishFilePath [%s], filePath [%s] is null or file maybe delete."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r4)
            goto L_0x025b
        L_0x0252:
            r34 = r4
            r35 = r5
            r36 = r10
            r33 = r12
            r12 = r9
        L_0x025b:
            r4 = 30
            if (r3 != 0) goto L_0x0269
            java.lang.String r3 = r8.f298689d
            java.lang.String r5 = r8.f298687U
            com.tencent.p014mm.plugin.sns.model.C94867e2.m120300s(r13, r3, r4, r5, r15)
            r3 = 3
            r6 = 1
            goto L_0x0270
        L_0x0269:
            java.lang.String r5 = r8.f298689d
            com.tencent.p014mm.plugin.sns.model.C94867e2.m120303v(r3, r5, r4)
            r3 = 3
            r6 = 0
        L_0x0270:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r13
            r4 = 1
            r3[r4] = r15
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3[r19] = r1
            java.lang.String r1 = "createSlideFullCardPreloadTask fakeLocalId: [%s] preload stream download sns video %s mkDir %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r3)
            com.tencent.mm.storage.o3 r1 = com.tencent.p014mm.storage.C96983o3.m124650b()
            int r3 = r38.getCreateTime()
            r1.f284145b = r3
            java.lang.String r3 = "setSight"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.download.DownloadItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r3 = r8.f298692g
            java.lang.String r5 = "setUrl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            java.lang.String r5 = "setThumb"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            hd0.C98394e0.vx0()
            com.tencent.mm.modelcdntran.e0 r17 = hd0.C98398h0.xx0()
            java.lang.String r4 = r8.f298687U
            java.lang.String r21 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120285d(r13, r4)
            r22 = 2
            boolean r4 = r8.f298681N
            java.lang.String r5 = r8.f298689d
            int r9 = r8.f298671D
            long r13 = r8.f298672E
            java.lang.String r10 = r8.f298687U
            r18 = r1
            r19 = r3
            r20 = r15
            r23 = r4
            r24 = r5
            r25 = r9
            r26 = r13
            r28 = r10
            gi.h r1 = r17.mo126987k(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)
            if (r1 != 0) goto L_0x02ec
        L_0x02db:
            r1 = r38
            r9 = r12
            r6 = r29
            r3 = r30
            r12 = r33
            r4 = r34
            r5 = r35
            r10 = r36
            goto L_0x00ab
        L_0x02ec:
            if (r6 == 0) goto L_0x02f7
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 1697(0x6a1, float:2.378E-42)
            r5 = 35
            r3.mo175911u(r4, r5)
        L_0x02f7:
            java.lang.String r3 = r8.f298680M
            r1.f287690V0 = r3
            int r3 = r2.value
            r1.field_preloadRatio = r3
            r3 = r40
            r1.f287682R0 = r3
            java.lang.String r4 = r8.f298689d
            r1.f287703e1 = r4
            java.lang.String r4 = r38.getUserName()
            r1.f287691W = r4
            r1.f287693X = r4
            java.lang.String r4 = r0.mo131032r(r8)
            r1.f287667n = r4
            java.lang.String r4 = r8.f298687U
            r1.f287699a1 = r4
            r5 = 0
            r1.f287698Z0 = r5
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r5] = r4
            java.lang.String r4 = "download video flag: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r6)
            r4 = r12
            r4.add(r1)
            java.lang.String r1 = r8.f298689d
            r5 = r36
            r5.add(r1)
            goto L_0x0345
        L_0x0332:
            r30 = r3
            r34 = r4
            r35 = r5
            r29 = r6
            r4 = r9
            r5 = r10
            r33 = r12
            r3 = r40
            java.lang.String r1 = "createSlideFullCardPreloadTask, adSlideFullCardItemInfo is null or is not sight"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
        L_0x0345:
            r1 = r38
            r9 = r4
            r10 = r5
            r6 = r29
            r3 = r30
            r12 = r33
            r4 = r34
            r5 = r35
            goto L_0x00ab
        L_0x0355:
            r30 = r3
            r8 = r4
            r1 = r5
            r4 = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            r6 = r4
            goto L_0x036b
        L_0x035f:
            r30 = r3
            r8 = r4
            r1 = r5
            java.lang.String r0 = "createSlideFullCardPreloadTask, snsInfo or adSliderFullCardInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
        L_0x036b:
            r0 = r30
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94869f2.m120311i(com.tencent.mm.plugin.sns.model.f2, com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.pointers.PInt, java.lang.String):java.util.List");
    }

    /* renamed from: j */
    public static C98127h m120312j(C94869f2 f2Var, SnsInfo snsInfo, PInt pInt, String str) {
        C98127h hVar;
        String str2;
        String str3;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        C94869f2 f2Var2 = f2Var;
        SnsInfo snsInfo2 = snsInfo;
        PInt pInt2 = pInt;
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        f2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("createPreloadTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (snsInfo2 == null || snsInfo.getTimeLine().ContentObj == null || Util.isNullOrNil((List) snsInfo.getTimeLine().ContentObj.f298427h)) {
            str3 = "access$800";
            SnsMethodCalculate.markEndTimeMs("createPreloadTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        } else {
            C101804kv2 kv22 = snsInfo.getTimeLine().ContentObj.f298427h.get(0);
            if (!snsInfo.isAd()) {
                Log.m105925i("MicroMsg.SnsVideoService", "createPreloadTask updateMediaDownloadFlag id:%s media:%s", snsInfo.getLocalid(), kv22.f298689d);
                C97540j.f286244a.mo136810b(snsInfo2, kv22, true);
                C99279f fVar = C99279f.f291124a;
                String str4 = kv22.f298689d;
                fVar.getClass();
                C87412m.m108594g(str4, "mediaId");
                fVar.mo138692e(new C99285j(1, str4, true));
                String str5 = kv22.f298689d;
                C87412m.m108594g(str5, "mediaId");
                fVar.mo138692e(new C99290o(1, str5));
            }
            String localid = snsInfo.getLocalid();
            String f = C94867e2.m120287f(localid, kv22);
            if (!Util.isNullOrNil(f)) {
                Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] , video[%s] already download finish, do nothing.", snsInfo.getLocalid(), f);
                C98398h0.yx0().mo137775f(kv22.f298680M, f2Var2.f274922i ? 4 : 3, C86013q1.m106451l(f), snsInfo.getUserName(), "", 0, "", kv22.f298692g, str);
                C115669n.INSTANCE.idkeyStat(354, 147, 1, false);
                SnsMethodCalculate.markEndTimeMs("createPreloadTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                str3 = "access$800";
            } else {
                boolean v = C86013q1.m106461v(C94867e2.m120293l(kv22.f298689d));
                String n = C94867e2.m120295n(kv22);
                C98408n0 j = C94867e2.m120291j(localid, kv22.f298689d, kv22.f298687U);
                Log.m105925i("MicroMsg.SnsVideoService", "createPreloadTask snsLocalId:%s media id:%s file:%s", localid, kv22.f298689d, n);
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_video_db_error_repair, true);
                if (j != null && wf && !TextUtils.isEmpty(j.f288544L) && !j.f288544L.equals(kv22.f298689d)) {
                    Log.m105921e("MicroMsg.SnsVideoService", "NOTICE1 bad media id,delete video info. current:%s db:%s", j.f288544L, kv22.f298689d);
                    C98429r0.m127815f(C94867e2.m120284c(localid));
                    j = null;
                }
                if (snsInfo.isAd()) {
                    str3 = "access$800";
                    i = 100;
                } else {
                    int i5 = pInt2.value;
                    SnsMethodCalculate.markStartTimeMs("checkTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    str3 = "access$800";
                    float f2 = kv22.f298684R;
                    if (f2 > 0.0f) {
                        float f3 = (((float) i5) * f2) / 100.0f;
                        i4 = i5;
                        float f4 = C32163a.f85503i;
                        if (f3 < f4) {
                            i = (int) ((Math.min(f4, f2) * 100.0f) / kv22.f298684R);
                            SnsMethodCalculate.markEndTimeMs("checkTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                        } else {
                            float f5 = C32163a.f85504j;
                            if (f3 > f5) {
                                i = (int) ((f5 * 100.0f) / f2);
                                SnsMethodCalculate.markEndTimeMs("checkTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                            }
                        }
                    } else {
                        i4 = i5;
                    }
                    SnsMethodCalculate.markEndTimeMs("checkTimelinePreloadPercent", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
                    i = i4;
                }
                pInt2.value = i;
                String str6 = localid;
                String q0 = C102236a0.m134765q0(snsInfo2.field_snsId);
                if (snsInfo.isAd()) {
                    ADInfo adInfo = snsInfo.getAdInfo();
                    C92277a adPreloadConfig = adInfo == null ? null : adInfo.getAdPreloadConfig();
                    if (adPreloadConfig == null || (i3 = adPreloadConfig.f264108b) <= 0) {
                        Log.m105924i("MicroMsg.SnsVideoService", "adVideoPreload timeline online, use default ratio:" + pInt2.value + ", snsId=" + q0);
                    } else {
                        pInt2.value = i3;
                        Log.m105924i("MicroMsg.SnsVideoService", "adVideoPreload timeline online, use config ratio:" + pInt2.value + ", snsId=" + q0);
                    }
                }
                Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s]  duration:%f checkTimelinePreloadPercent [%d] snsId:[%s].", snsInfo.getLocalid(), Float.valueOf(kv22.f298684R), Integer.valueOf(pInt2.value), q0);
                if (j != null) {
                    Log.m105925i("MicroMsg.SnsVideoService", "video info : %s", j.toString());
                    int i6 = j.f288559f;
                    if (i6 > 0 && (j.f288539G * 100) / i6 >= pInt2.value) {
                        Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] , video[%s] already preload finish, do nothing.", snsInfo.getLocalid(), f);
                        SnsMethodCalculate.markEndTimeMs("createPreloadTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    }
                }
                if (j == null) {
                    C94867e2.m120300s(str6, kv22.f298689d, 30, kv22.f298687U, n);
                    i2 = 3;
                    z = true;
                } else {
                    C94867e2.m120303v(j, kv22.f298689d, 30);
                    i2 = 3;
                    z = false;
                }
                Object[] objArr = new Object[i2];
                objArr[0] = snsInfo.getLocalid();
                objArr[1] = n;
                objArr[2] = Boolean.valueOf(v);
                Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] preload stream download sns video %s mkDir %b", objArr);
                C96983o3 b = C96983o3.m124650b();
                b.f284145b = snsInfo.getCreateTime();
                SnsMethodCalculate.markStartTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markEndTimeMs("setSight", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                String str7 = kv22.f298692g;
                SnsMethodCalculate.markStartTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markEndTimeMs("setUrl", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markStartTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                SnsMethodCalculate.markEndTimeMs("setThumb", "com.tencent.mm.plugin.sns.model.download.DownloadItem");
                C98394e0.vx0();
                C98127h k = C98398h0.xx0().mo126987k(b, str7, n, C94867e2.m120285d(str6, kv22.f298687U), 2, kv22.f298681N, kv22.f298689d, kv22.f298671D, kv22.f298672E, kv22.f298687U);
                if (k == null) {
                    SnsMethodCalculate.markEndTimeMs("createPreloadTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                } else {
                    if (snsInfo.isAd() && z) {
                        C115669n.INSTANCE.mo175911u(1697, 35);
                    }
                    k.f287690V0 = kv22.f298680M;
                    k.field_preloadRatio = pInt2.value;
                    k.f287682R0 = str;
                    k.f287703e1 = kv22.f298689d;
                    String userName = snsInfo.getUserName();
                    k.f287691W = userName;
                    k.f287693X = userName;
                    k.f287667n = f2Var.mo131032r(kv22);
                    String str8 = kv22.f298687U;
                    k.f287699a1 = str8;
                    k.f287698Z0 = 0;
                    Log.m105925i("MicroMsg.SnsVideoService", "download video flag:%s", str8);
                    SnsMethodCalculate.markEndTimeMs("createPreloadTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    hVar = k;
                    str2 = str3;
                    SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    return hVar;
                }
            }
        }
        str2 = str3;
        hVar = null;
        SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return hVar;
    }

    /* renamed from: k */
    public static void m120313k(C94869f2 f2Var, String str, List list, PInt pInt) {
        C94869f2 f2Var2 = f2Var;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        f2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("doPreloadSlideFullCardAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        char c = 0;
        int i = 0;
        while (i < list.size()) {
            C98127h hVar = (C98127h) list.get(i);
            if (hVar != null) {
                String c2 = C102260r.m134862c(str2, hVar.f287703e1 + "_");
                C98411p pVar = new C98411p(hVar, c2);
                pVar.f288606n = f2Var2.f274922i;
                pVar.f288608p = 1;
                if (pVar.mo137735b(f2Var2) < 0) {
                    Object[] objArr = new Object[5];
                    objArr[c] = Integer.valueOf(f2Var.hashCode());
                    objArr[1] = str2;
                    objArr[2] = c2;
                    C98127h hVar2 = pVar.f288599g;
                    objArr[3] = hVar2 != null ? hVar2.f287703e1 : "";
                    objArr[4] = pVar.f288596d;
                    Log.m105929w("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload, curr preload task do scene error. hash: [%d], localId: [%s], fakeLocalId: [%s], mediaId: [%s], cdnMediaId: [%s]", objArr);
                } else {
                    Object[] objArr2 = new Object[6];
                    objArr2[c] = pVar.f288595c;
                    objArr2[1] = Integer.valueOf(pInt.value);
                    objArr2[2] = str2;
                    objArr2[3] = c2;
                    C98127h hVar3 = pVar.f288599g;
                    objArr2[4] = hVar3 != null ? hVar3.f287703e1 : "";
                    objArr2[5] = pVar.f288596d;
                    Log.m105925i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload, sns:[%s] start to preload, pPreloadPercent: %d, localId: [%s], fakeLocalId: [%s], mediaId: [%s], cdnMediaId: [%s] [success to preload]", objArr2);
                    pVar.f288605m = System.currentTimeMillis();
                    synchronized (f2Var2.f274918e) {
                        try {
                            f2Var2.f274918e.add(i, pVar);
                        } catch (Throwable th) {
                            SnsMethodCalculate.markEndTimeMs("doPreloadSlideFullCardAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                            throw th;
                        }
                    }
                    i++;
                    c = 0;
                }
            }
            PInt pInt2 = pInt;
            i++;
            c = 0;
        }
        SnsMethodCalculate.markEndTimeMs("doPreloadSlideFullCardAd", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: a */
    public void mo131025a(C98411p pVar, boolean z, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (pVar == null) {
            Log.m105921e("MicroMsg.SnsVideoService", "%d on preload finish but scene is null?", Integer.valueOf(hashCode()));
            SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return;
        }
        C98411p pVar2 = null;
        synchronized (this.f274918e) {
            try {
                Iterator<C98411p> it = this.f274918e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (pVar == it.next()) {
                            pVar2 = pVar;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    throw th;
                }
            }
        }
        if (pVar2 == null) {
            Log.m105929w("MicroMsg.SnsVideoService", "%d on preload finish, but scene callback not same object.", Integer.valueOf(hashCode()));
            SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return;
        }
        String str = pVar.f288599g.f287699a1;
        Log.m105925i("MicroMsg.SnsVideoService", "onPreloadFinish snsLocalId:%s media id:%s videoFlag:%s", pVar.f288595c, pVar.f288596d, str);
        C98408n0 h = C94867e2.m120289h(pVar.f288595c, str);
        if (h != null) {
            h.f288559f = i2;
            C98429r0.m127808N(h);
        }
        Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_DONE  preload video[%s] finish success[%b] range[%d, %d]  hash:[%d]", pVar.mo137736c(), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(hashCode()));
        C86709a0.m107525e().postToWorker(new C94874e(pVar2));
        SnsMethodCalculate.markEndTimeMs("onPreloadFinish", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: l */
    public boolean mo131026l(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (snsInfo == null) {
            Log.m105924i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD null snsInfo . [fail in queue]");
            SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("getTimelineMaxParallelInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int i = C32163a.f85496b;
        SnsMethodCalculate.markEndTimeMs("getTimelineMaxParallelInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        this.f274919f = i;
        SnsMethodCalculate.markStartTimeMs("getTimelineMaxPreloadInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        int i2 = C32163a.f85495a;
        SnsMethodCalculate.markEndTimeMs("getTimelineMaxPreloadInQueue", "com.tencent.mm.plugin.sns.model.preload.SnsPreloadSwitch");
        this.f274920g = i2;
        synchronized (this.f274917d) {
            try {
                if (this.f274917d.size() < this.f274920g || snsInfo.isAd()) {
                    this.f274917d.add(snsInfo);
                    Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD hash(%d) sns:[%s] add preload video  [success in queue]", Integer.valueOf(hashCode()), snsInfo.getLocalid());
                    SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    return true;
                }
                Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD sns:[%s] full stack .[fail in queue], and the sns info is not ad.", snsInfo.getLocalid());
                SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                return false;
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("addPreloadVideo", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    throw th;
                }
            }
        }
    }

    /* renamed from: m */
    public void mo131027m(SnsInfo snsInfo, boolean z) {
        String str;
        String str2;
        C98411p poll;
        SnsMethodCalculate.markStartTimeMs("addPreloadVideoInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (snsInfo == null) {
            Log.m105924i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD null snsInfo . [fail in queue]");
            SnsMethodCalculate.markEndTimeMs("addPreloadVideoInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return;
        }
        if (z) {
            synchronized (this.f274918e) {
                try {
                    boolean e = C99585d.m130000e(snsInfo);
                    boolean d = C98993j.m128902d();
                    String localid = snsInfo.getLocalid();
                    Iterator<C98411p> it = this.f274918e.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        C98411p next = it.next();
                        if (e) {
                            if (!d) {
                                String str3 = next.f288595c;
                                C98127h hVar = next.f288599g;
                                String str4 = hVar != null ? hVar.f287703e1 : "";
                                String i2 = C102260r.m134869i(str3, str4 + "_");
                                if (!Util.isNullOrNil(localid, i2) && Util.isEqual(localid, i2)) {
                                    i++;
                                    next.f288605m = System.currentTimeMillis();
                                    Collections.sort(this.f274918e, new C94870a(this));
                                    Log.m105925i("SlideFullCard.MicroMsg.SnsVideoService", "addPreloadVideoInTimeLine, sns fakeLocalId [%s] and localId [%s] is downloading. [already in queue]", str3, localid);
                                }
                            }
                        } else if (next.f288595c.equals(snsInfo.getLocalid())) {
                            next.f288605m = System.currentTimeMillis();
                            Collections.sort(this.f274918e, new C94871b(this));
                            Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD sns:[%s] is downloading. [already in queue]", snsInfo.getLocalid());
                            return;
                        }
                    }
                    if (e && !d && i > 0) {
                        Log.m105924i("SlideFullCard.MicroMsg.SnsVideoService", "addPreloadVideoInTimeLine, slideFullCardAd hit currentPreloadList. and hitPreloadListCount is " + i);
                        SnsMethodCalculate.markEndTimeMs("addPreloadVideoInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                        return;
                    } else if (this.f274918e.size() >= this.f274919f && (poll = this.f274918e.poll()) != null) {
                        poll.mo137738e();
                        Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_ADD sns:[%s] cancel preload.", snsInfo.getLocalid());
                    }
                } finally {
                    str = "addPreloadVideoInTimeLine";
                    str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
        }
        if (mo131026l(snsInfo) && z) {
            mo131038x();
        }
        SnsMethodCalculate.markEndTimeMs("addPreloadVideoInTimeLine", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: n */
    public boolean mo131028n(C101804kv2 kv22, int i, String str, boolean z, boolean z2, int i2, String str2) {
        SnsMethodCalculate.markStartTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (kv22.f298693h == 2) {
            Log.m105928w("MicroMsg.SnsVideoService", "add video task, but url is weixin, do nothing");
            SnsMethodCalculate.markEndTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_timeline_jump_downloading_task, true);
        C94952t2 t2Var = this.f274914a;
        if (!wf || t2Var == null || TextUtils.isEmpty(t2Var.f275255b) || TextUtils.isEmpty(t2Var.f275259f) || !t2Var.f275259f.equals(str) || !t2Var.f275255b.equals(str2)) {
            C94952t2 t2Var2 = new C94952t2();
            t2Var2.f275255b = C94867e2.m120283b(i, kv22);
            t2Var2.f275257d = kv22;
            t2Var2.f275258e = i;
            t2Var2.f275259f = str;
            t2Var2.f275256c = z ? 1 : 0;
            t2Var2.f275260g = i2;
            SnsMethodCalculate.markStartTimeMs("offerQueue", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            C86709a0.m107528h();
            C86709a0.m107525e().postToWorker(new C94878g2(this, t2Var2, z2));
            SnsMethodCalculate.markEndTimeMs("offerQueue", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            if (z2) {
                mo131039y();
            }
            SnsMethodCalculate.markEndTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return true;
        }
        Log.m105921e("MicroMsg.SnsVideoService", "[%s]task is downloading now.", str2);
        SnsMethodCalculate.markEndTimeMs("addSnsVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return true;
    }

    /* renamed from: o */
    public void mo131029o() {
        String str;
        String str2;
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        this.f274914a = null;
        synchronized (this.f274918e) {
            try {
                this.f274918e.clear();
            } finally {
                while (true) {
                    str = "clear";
                    str2 = "com.tencent.mm.plugin.sns.model.SnsVideoService";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
        }
        ((ConcurrentHashMap) this.f274916c).clear();
        this.f274915b.clear();
        synchronized (this.f274917d) {
            try {
                this.f274917d.clear();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: p */
    public void mo131030p() {
        SnsMethodCalculate.markStartTimeMs("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        synchronized (this.f274917d) {
            try {
                this.f274917d.clear();
            } catch (Throwable th) {
                while (true) {
                    SnsMethodCalculate.markEndTimeMs("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    throw th;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("clearPreloadList", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: q */
    public final C101804kv2 mo131031q(C98411p pVar) {
        SnsMethodCalculate.markStartTimeMs("findSlideFullCardMediaObj", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        C101804kv2 kv22 = null;
        if (pVar == null) {
            Log.m105920e("SlideFullCard.MicroMsg.SnsVideoService", "findSlideFullCardMediaObj, current is null");
            SnsMethodCalculate.markEndTimeMs("findSlideFullCardMediaObj", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        String str = pVar.f288595c;
        C98127h hVar = pVar.f288599g;
        String str2 = hVar != null ? hVar.f287703e1 : "";
        String i = C102260r.m134869i(str, str2 + "_");
        Log.m105924i("SlideFullCard.MicroMsg.SnsVideoService", "findSlideFullCardMediaObj, localId is " + i + ", current resume preload fakeLocalId is " + str + ", current resume preload mediaId is " + str2 + ", cdnMediaId is " + pVar.f288596d);
        SnsInfo DN = C94866e1.Yx0().mo139798DN(i);
        if (DN == null || DN.getAdXml().adSliderFullCardInfo == null) {
            Log.m105920e("SlideFullCard.MicroMsg.SnsVideoService", "findSlideFullCardMediaObj, snsInfo or adSliderFullCardInfo is null");
            SnsMethodCalculate.markEndTimeMs("findSlideFullCardMediaObj", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        List<C92448q> list = DN.getAdXml().adSliderFullCardInfo.f264582a;
        if (C101425k.m133097a(list)) {
            Log.m105920e("SlideFullCard.MicroMsg.SnsVideoService", "findSlideFullCardMediaObj, adSlideFullCardItemInfoList is null or empty");
            SnsMethodCalculate.markEndTimeMs("findSlideFullCardMediaObj", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return null;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C92448q qVar = (C92448q) it.next();
            if (!Util.isNullOrNil(str2, qVar.f264577e.f298689d) && Util.isEqual(str2, qVar.f264577e.f298689d)) {
                kv22 = qVar.f264577e;
                break;
            }
        }
        SnsMethodCalculate.markEndTimeMs("findSlideFullCardMediaObj", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return kv22;
    }

    /* renamed from: r */
    public final String mo131032r(C101804kv2 kv22) {
        SnsMethodCalculate.markStartTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (kv22 == null) {
            Log.m105924i("MicroMsg.SnsVideoService", "mediaObj is null");
            SnsMethodCalculate.markEndTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return "";
        }
        Iterator<ir4> it = kv22.f298686T.iterator();
        while (it.hasNext()) {
            ir4 next = it.next();
            Log.m105925i("MicroMsg.SnsVideoService", "rule type:%s value:%s", next.f135630d, next.f135631e);
        }
        if (kv22.f298686T.size() > 0) {
            ir4 ir4 = kv22.f298686T.get(0);
            Log.m105925i("MicroMsg.SnsVideoService", "select rule type:%s value:%s", ir4.f135630d, ir4.f135631e);
            String str = ir4.f135631e;
            SnsMethodCalculate.markEndTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return str;
        }
        SnsMethodCalculate.markEndTimeMs("getValidVideoRule", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return "";
    }

    /* renamed from: s */
    public boolean mo131033s(C101804kv2 kv22, int i, String str) {
        SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        C94952t2 t2Var = this.f274914a;
        if (t2Var == null || TextUtils.isEmpty(t2Var.f275259f) || !t2Var.f275259f.equals(str)) {
            String b = C94867e2.m120283b(i, kv22);
            if (TextUtils.isEmpty(b)) {
                SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                return false;
            }
            boolean containsKey = ((ConcurrentHashMap) this.f274916c).containsKey(b);
            SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return containsKey;
        }
        SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return true;
    }

    /* renamed from: t */
    public void mo131034t(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setIsTimelinePage", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        this.f274922i = z;
        Log.m105925i("MicroMsg.SnsVideoService", "set isInSnsTimeline:%b", Boolean.valueOf(z));
        if ((this.f274922i && !C32163a.m39640a()) || this.f274921h) {
            mo131036v();
        }
        C98438x yx02 = C98398h0.yx0();
        boolean z2 = this.f274922i;
        yx02.f288724f = z2;
        if (z2) {
            yx02.mo137776g();
        }
        SnsMethodCalculate.markEndTimeMs("setIsTimelinePage", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: u */
    public void mo131035u() {
        SnsMethodCalculate.markStartTimeMs("startPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        mo131038x();
        SnsMethodCalculate.markEndTimeMs("startPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: v */
    public void mo131036v() {
        SnsMethodCalculate.markStartTimeMs("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        Log.m105919d("MicroMsg.SnsVideoService", "%d stop preload %s", Integer.valueOf(hashCode()), Util.getStack());
        C86709a0.m107525e().postToWorker(new C94872c());
        SnsMethodCalculate.markEndTimeMs("stopPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: w */
    public boolean mo131037w(String str, Object[] objArr) {
        SnsMethodCalculate.markStartTimeMs("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
            return false;
        }
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C94875f(str, objArr));
        SnsMethodCalculate.markEndTimeMs("stopVideoTask", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        return true;
    }

    /* renamed from: x */
    public final synchronized void mo131038x() {
        SnsMethodCalculate.markStartTimeMs("tryPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        Log.m105925i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD preload size:%d  queue size:%d", Integer.valueOf(this.f274918e.size()), Integer.valueOf(this.f274917d.size()));
        C86709a0.m107525e().postToWorker(new C94873d());
        SnsMethodCalculate.markEndTimeMs("tryPreload", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }

    /* renamed from: y */
    public void mo131039y() {
        SnsMethodCalculate.markStartTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.SnsVideoService");
        C86709a0.m107528h();
        C86709a0.m107525e().postToWorker(new C94876g());
        SnsMethodCalculate.markEndTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.SnsVideoService");
    }
}
