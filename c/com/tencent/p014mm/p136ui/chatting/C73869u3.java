package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import p158gt.C98201k;

/* renamed from: com.tencent.mm.ui.chatting.u3 */
public class C73869u3 {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r5 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0().mo100154qq(r5.f195606o);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m87558a(com.tencent.p014mm.storage.C72963f4 r4, com.tencent.p014mm.message.C68070l.C68072b r5) {
        /*
            if (r5 == 0) goto L_0x0027
            java.lang.String r0 = r5.f195606o
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0027
            com.tencent.mm.pluginsdk.model.app.e r0 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
            java.lang.String r5 = r5.f195606o
            com.tencent.mm.pluginsdk.model.app.d r5 = r0.mo100154qq(r5)
            if (r5 == 0) goto L_0x0027
            boolean r0 = r5.mo100146l2()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r5.field_fileFullPath
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r5 = r5.field_fileFullPath
            goto L_0x0029
        L_0x0027:
            java.lang.String r5 = ""
        L_0x0029:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            r1 = 0
            java.lang.String r2 = "MicroMsg.HistoryExportUtil"
            r3 = 1
            if (r0 != 0) goto L_0x003d
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r5
            java.lang.String r0 = "get hd appmsg image path ok, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r4)
            return r5
        L_0x003d:
            if (r4 == 0) goto L_0x0055
            java.lang.Class<gt.k> r5 = p158gt.C98201k.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            gt.k r5 = (p158gt.C98201k) r5
            gt.m r5 = r5.mo137277xi()
            java.lang.String r4 = r4.mo108765s2()
            com.tencent.mm.modelimage.m r5 = (com.tencent.p014mm.modelimage.C92839m) r5
            java.lang.String r5 = r5.v10(r4, r3)
        L_0x0055:
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r1] = r5
            java.lang.String r0 = "try get thumb appmsg image path finish, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73869u3.m87558a(com.tencent.mm.storage.f4, com.tencent.mm.message.l$b):java.lang.String");
    }

    /* renamed from: b */
    public static String m87559b(C92836k kVar) {
        String str;
        Class cls = C98201k.class;
        if (kVar != null) {
            if (kVar.mo127145p() && (str = kVar.f267378e) != null && C86013q1.m106450k(str)) {
                return str;
            }
            String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(kVar.f267378e, (String) null, (String) null, true);
            if (TY != null && C86013q1.m106450k(TY)) {
                return TY;
            }
            String TY2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(kVar.f267380g, (String) null, (String) null, true);
            if (TY2 == null || !C86013q1.m106450k(TY2)) {
                return null;
            }
            return TY2;
        }
        return null;
    }
}
