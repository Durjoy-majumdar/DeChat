package p751xm;

import di3.C86301e;
import ei3.C86522b;
import p763ym.C39070r;

@C86522b
/* renamed from: xm.q */
public class C118887q extends C86301e implements C39070r {
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee  */
    /* renamed from: Es */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61911Es(android.content.Context r13, p763ym.C39070r.C39071a r14) {
        /*
            r12 = this;
            com.tencent.mm.pluginsdk.model.app.b1 r0 = new com.tencent.mm.pluginsdk.model.app.b1
            r0.<init>(r13, r14)
            android.content.SharedPreferences r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            java.lang.String r14 = ""
            java.lang.String r1 = "key_app_ids_registion_while_not_login"
            r2 = 0
            r3 = 1
            r4 = 0
            if (r13 == 0) goto L_0x004d
            java.lang.String r13 = r13.getString(r1, r14)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r5 == 0) goto L_0x0024
            java.lang.String r13 = "MicroMsg.AppUtil"
            java.lang.String r5 = "no saved appids while not login"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            goto L_0x004d
        L_0x0024:
            java.lang.String r5 = "\\|"
            java.lang.String[] r13 = r13.split(r5)
            if (r13 == 0) goto L_0x004d
            int r5 = r13.length
            if (r5 <= 0) goto L_0x004d
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            int r6 = r13.length
            r7 = 0
            r8 = 1
        L_0x0037:
            if (r7 >= r6) goto L_0x004e
            r9 = r13[r7]
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r10 != 0) goto L_0x0046
            r5.add(r9)
            int r8 = r8 + 1
        L_0x0046:
            r9 = 5
            if (r8 <= r9) goto L_0x004a
            goto L_0x004e
        L_0x004a:
            int r7 = r7 + 1
            goto L_0x0037
        L_0x004d:
            r5 = r4
        L_0x004e:
            if (r5 == 0) goto L_0x0079
            boolean r13 = r5.isEmpty()
            if (r13 != 0) goto L_0x0079
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.Iterator r13 = r5.iterator()
        L_0x005f:
            boolean r5 = r13.hasNext()
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r13.next()
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.pluginsdk.model.app.j r6 = com.tencent.p014mm.pluginsdk.model.app.C44565l.m48989i(r5, r2, r2)
            if (r6 == 0) goto L_0x0075
            int r6 = r6.field_status
            if (r6 != 0) goto L_0x005f
        L_0x0075:
            r4.add(r5)
            goto L_0x005f
        L_0x0079:
            java.lang.String r13 = "MicroMsg.LoadAppInfoAfterLogin"
            r5 = -1
            if (r4 == 0) goto L_0x00ee
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L_0x0085
            goto L_0x00ee
        L_0x0085:
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r1 = r4.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r14[r2] = r1
            java.lang.String r1 = "now do batch get appinfos, appid liSst size is :%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r1, r14)
            com.tencent.mm.pluginsdk.model.app.f r14 = ld2.C46848g.yx0()
            r1 = 7
            r14.getClass()
            com.tencent.mm.pluginsdk.model.app.g r2 = new com.tencent.mm.pluginsdk.model.app.g
            r2.<init>(r14, r1, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
            com.tencent.mm.pluginsdk.model.app.o r14 = ld2.C46848g.Ax0()
            r14.mo69366b(r4)
            android.content.Context r14 = r0.f347637e
            if (r14 == 0) goto L_0x00d9
            android.app.Activity r14 = (android.app.Activity) r14
            boolean r14 = r14.isFinishing()
            if (r14 != 0) goto L_0x00d9
            android.content.Context r6 = r0.f347637e
            r13 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r7 = r6.getString(r13)
            android.content.Context r13 = r0.f347637e
            r14 = 2131821739(0x7f1104ab, float:1.927623E38)
            java.lang.String r8 = r13.getString(r14)
            r9 = 1
            r10 = 1
            com.tencent.mm.pluginsdk.model.app.a1 r11 = new com.tencent.mm.pluginsdk.model.app.a1
            r11.<init>(r0)
            qo3.i0 r13 = nj3.C76879j.m92723Q(r6, r7, r8, r9, r10, r11)
            r0.f347638f = r13
            goto L_0x0113
        L_0x00d9:
            ym.r$a r14 = r0.f347636d
            if (r14 == 0) goto L_0x00e8
            com.tencent.mm.plugin.account.ui.SimpleLoginUI$j$a r14 = (com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.C115079j.C115080a) r14
            com.tencent.mm.plugin.account.ui.SimpleLoginUI$j r14 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.C115079j.this
            com.tencent.mm.plugin.account.ui.SimpleLoginUI r14 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.this
            int r0 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.f345053v
            r14.mo7681K7(r5)
        L_0x00e8:
            java.lang.String r14 = "dz[loadAppInfo:catch the null window for progress bar"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r14)
            goto L_0x0113
        L_0x00ee:
            java.lang.String r2 = "no saved appids, just callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r2)
            android.content.SharedPreferences r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            if (r13 == 0) goto L_0x0104
            android.content.SharedPreferences$Editor r13 = r13.edit()
            android.content.SharedPreferences$Editor r13 = r13.putString(r1, r14)
            r13.commit()
        L_0x0104:
            ym.r$a r13 = r0.f347636d
            if (r13 == 0) goto L_0x0113
            com.tencent.mm.plugin.account.ui.SimpleLoginUI$j$a r13 = (com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.C115079j.C115080a) r13
            com.tencent.mm.plugin.account.ui.SimpleLoginUI$j r13 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.C115079j.this
            com.tencent.mm.plugin.account.ui.SimpleLoginUI r13 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.this
            int r14 = com.tencent.p014mm.plugin.account.p024ui.SimpleLoginUI.f345053v
            r13.mo7681K7(r5)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p751xm.C118887q.mo61911Es(android.content.Context, ym.r$a):void");
    }
}
