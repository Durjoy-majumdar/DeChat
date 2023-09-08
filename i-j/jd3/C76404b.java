package jd3;

import android.util.Pair;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92796u;
import com.tencent.p014mm.pluginsdk.model.app.C72684e;
import com.tencent.p014mm.pluginsdk.model.app.C72689q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.HashMap;
import kj2.C117407d;
import p711uo.C102059b;
import p763ym.C53543s;
import qg2.C77335p;
import qg2.p$$d;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: jd3.b */
public final class C76404b implements p$$d {

    /* renamed from: a */
    public static final C76404b f223715a;

    /* renamed from: b */
    public static final HashMap<String, C13604l<C72963f4, String>> f223716b = new HashMap<>();

    /* renamed from: c */
    public static final C76405a f223717c = new C76405a();

    /* renamed from: jd3.b$a */
    public static final class C76405a implements CdnLogic.DownloadCallback {
        public void onC2CDownloadCompleted(String str, CdnLogic.C2CDownloadResult c2CDownloadResult) {
            String str2 = str;
            CdnLogic.C2CDownloadResult c2CDownloadResult2 = c2CDownloadResult;
            StringBuilder sb = new StringBuilder();
            sb.append("onC2CDownloadCompleted: ");
            sb.append(str2);
            sb.append(", ");
            sb.append(c2CDownloadResult2 != null ? Integer.valueOf(c2CDownloadResult2.errorCode) : null);
            Log.m105924i("MicroMsg.FileLanDownloadMgr", sb.toString());
            long currentTimeMillis = System.currentTimeMillis();
            if (c2CDownloadResult2 != null) {
                if (c2CDownloadResult2.errorCode == 0) {
                    C13604l lVar = C76404b.f223716b.get(str2);
                    if (lVar != null) {
                        Log.m105925i("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted msgId:%s, msgSvrId:%s", Long.valueOf(((C72963f4) lVar.f38555d).getMsgId()), Long.valueOf(((C72963f4) lVar.f38555d).mo108774y2()));
                        if (((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).mo100150Yt(((C72963f4) lVar.f38555d).getMsgId()) == null) {
                            Pair<Boolean, String> f0 = C72689q.m85028f0((C72963f4) lVar.f38555d, true);
                            Log.m105924i("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted info is null, initPair:" + ((Boolean) f0.first) + ", " + ((String) f0.second));
                        }
                        C77335p.m93215l1((C72963f4) lVar.f38555d, (String) lVar.f38556e);
                    } else {
                        Log.m105920e("MicroMsg.FileLanDownloadMgr", "onC2CDownloadCompleted pair is null");
                    }
                    C117407d.INSTANCE.idkeyStat(1680, 14, 1, false);
                } else {
                    C117407d.INSTANCE.idkeyStat(1680, 15, 1, false);
                }
                C13604l lVar2 = (C13604l) C24564k0.m30739c(C76404b.f223716b).remove(str2);
            }
            Log.m105924i("MicroMsg.FileLanDownloadMgr", "cdnCallback downloadTaskMap:" + C76404b.f223716b.size() + ", internal:" + (System.currentTimeMillis() - currentTimeMillis));
        }

        public void onDownloadProgressChanged(String str, long j, long j2, boolean z) {
            Log.m105924i("MicroMsg.FileLanDownloadMgr", "onDownloadProgressChanged: " + str + ", " + j + ", " + j2 + ", " + z);
        }
    }

    static {
        C76404b bVar = new C76404b();
        f223715a = bVar;
        C77335p.f225461B = bVar;
    }

    /* renamed from: a */
    public void mo106627a(C72963f4 f4Var) {
        C13598b0 b0Var;
        if (f4Var != null) {
            String b = f223715a.mo106628b(f4Var);
            Log.m105924i("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile " + b);
            C87412m.m108594g(b, "mediaid");
            Log.m105924i("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile " + b);
            ((C92796u) ((C102059b) C86312j.m106911c(C102059b.class)).V30()).mo127051t(b);
            HashMap<String, C13604l<C72963f4, String>> hashMap = f223716b;
            C13604l lVar = hashMap.get(b);
            if (lVar != null) {
                C86013q1.m106447h((String) lVar.f38556e);
                C117407d.INSTANCE.idkeyStat(1680, 16, 1, false);
            }
            hashMap.remove(b);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.FileLanDownloadMgr", "cancelLanDownloadFile msginfo is null");
        }
    }

    /* renamed from: b */
    public final String mo106628b(C72963f4 f4Var) {
        return "lan_" + f4Var.mo108768t() + '_' + f4Var.getMsgId();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106629c(com.tencent.p014mm.storage.C72963f4 r19, com.tencent.p014mm.message.C68070l.C68072b r20) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "msgInfo"
            gy3.C87412m.m108594g(r0, r2)
            long r2 = eb0.C31543z5.m39451a()
            long r4 = r19.getCreateTime()
            long r2 = r2 - r4
            com.tencent.mm.pluginsdk.model.file.FileSmartServerMgr r4 = com.tencent.p014mm.pluginsdk.model.file.FileSmartServerMgr.f211575a
            long r5 = r4.mo100181e()
            r7 = 1
            r8 = 0
            java.lang.String r9 = "MicroMsg.FileLanDownloadMgr"
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 < 0) goto L_0x0033
            java.lang.Object[] r0 = new java.lang.Object[r7]
            long r1 = r4.mo100181e()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r8] = r1
            java.lang.String r1 = "startToLanDownloadFile exceed limit time, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r1, r0)
            return
        L_0x0033:
            if (r1 != 0) goto L_0x003b
            java.lang.String r0 = "appmsgContent is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return
        L_0x003b:
            int r2 = r1.f195582i
            r3 = 74
            java.lang.String r5 = ""
            if (r2 != r3) goto L_0x0085
            java.lang.String r2 = r1.f195645x2
            boolean r2 = sf0.C77702q0.m93719b(r2)
            if (r2 == 0) goto L_0x0051
            java.lang.String r0 = "fileLanInfo is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            return
        L_0x0051:
            java.lang.String r2 = r1.f195645x2
            java.lang.String r3 = "appmsgContent.fileLanInfo"
            gy3.C87412m.m108593f(r2, r3)
            z04.k r3 = new z04.k
            java.lang.String r6 = ";"
            r3.<init>((java.lang.String) r6)
            java.util.List r2 = r3.mo90760e(r2, r8)
            java.lang.String[] r3 = new java.lang.String[r8]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            gy3.C87412m.m108592e(r2, r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r3 = r2.length
            r6 = 2
            if (r3 != r6) goto L_0x00aa
            r5 = r2[r8]
            r2 = r2[r7]
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r8] = r5
            r3[r7] = r2
            java.lang.String r6 = "startToLanDownloadFile cgi:%s aesKey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r6, r3)
            goto L_0x00ab
        L_0x0085:
            java.lang.Class<com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation> r2 = com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation r2 = (com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation) r2
            xh3.b r2 = r2.vx0()
            long r6 = r19.mo108774y2()
            xh3.a r2 = r2.mo61737jo(r6)
            if (r2 == 0) goto L_0x00aa
            java.lang.String r5 = r2.field_cgi
            java.lang.String r3 = "fileMsgInfo.field_cgi"
            gy3.C87412m.m108593f(r5, r3)
            java.lang.String r2 = r2.field_aeskey
            java.lang.String r3 = "fileMsgInfo.field_aeskey"
            gy3.C87412m.m108593f(r2, r3)
            goto L_0x00ab
        L_0x00aa:
            r2 = r5
        L_0x00ab:
            java.lang.String r3 = r18.mo106628b(r19)
            java.util.HashMap<java.lang.String, rx3.l<com.tencent.mm.storage.f4, java.lang.String>> r6 = f223716b
            boolean r7 = r6.containsKey(r3)
            if (r7 == 0) goto L_0x00d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "downloadImp "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " has exist"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
            goto L_0x0199
        L_0x00d2:
            boolean r7 = sf0.C77702q0.m93719b(r5)
            if (r7 == 0) goto L_0x00da
            goto L_0x0199
        L_0x00da:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = a70.C112760b.m154247s()
            java.lang.String r10 = r1.f195570f
            java.lang.String r1 = r1.f195602n
            java.lang.String r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r8, r10, r1)
            r7.append(r1)
            java.lang.String r1 = "_lan_tmp"
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r7 == 0) goto L_0x0100
            com.tencent.p014mm.vfs.C86013q1.m106447h(r1)
        L_0x0100:
            rx3.l r7 = new rx3.l
            r7.<init>(r0, r1)
            r6.put(r3, r7)
            java.lang.Class<uo.b> r0 = p711uo.C102059b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            uo.b r0 = (p711uo.C102059b) r0
            uo.c r0 = r0.V30()
            long r6 = r4.mo100181e()
            int r4 = (int) r6
            r6 = 600(0x258, float:8.41E-43)
            jd3.b$a r7 = f223717c
            com.tencent.mm.modelcdntran.u r0 = (com.tencent.p014mm.modelcdntran.C92796u) r0
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "startLanDownload: mediaid:"
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "MicroMsg.CdnTransportEngine"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest r0 = new com.tencent.mars.cdn.CdnLogic$C2CDownloadRequest
            r0.<init>()
            r0.fileKey = r3
            r0.url = r5
            r0.aeskey = r2
            r0.setSavePath(r1)
            r0.queueTimeoutSeconds = r4
            r0.transforTimeoutSeconds = r6
            r1 = -2
            r0.bizid = r1
            int r0 = com.tencent.mars.cdn.CdnLogic.startHttpMultiSocketDownloadTask(r0, r7)
            kj2.d r10 = kj2.C117407d.INSTANCE
            r11 = 1680(0x690, double:8.3E-321)
            if (r0 != 0) goto L_0x015b
            r6 = 11
            goto L_0x015d
        L_0x015b:
            r6 = 12
        L_0x015d:
            r13 = r6
            r15 = 1
            r17 = 0
            r10.idkeyStat(r11, r13, r15, r17)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "fetch: start mediaId:"
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = " cgi:"
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = " aesKey:"
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = " tmpFile "
            r1.append(r2)
            r1.append(r3)
            r2 = 32
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jd3.C76404b.mo106629c(com.tencent.mm.storage.f4, com.tencent.mm.message.l$b):void");
    }
}
