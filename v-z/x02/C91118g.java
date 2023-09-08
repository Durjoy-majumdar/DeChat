package x02;

import a70.C112760b;
import b12.C79643a;
import bp3.C28361q;
import com.tencent.p014mm.autogen.events.HotPatchApplyEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: x02.g */
public class C91118g extends IStaticListener<HotPatchApplyEvent> {

    /* renamed from: e */
    public static final String f261312e = (C112760b.m154225d() + "_temp.hp");

    /* renamed from: f */
    public static final C28361q<C91118g> f261313f = new g$$b();

    /* renamed from: d */
    public C79643a f261314d = null;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r11.f78833d.f78835b) == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
        /*
            r10 = this;
            com.tencent.mm.autogen.events.HotPatchApplyEvent r11 = (com.tencent.p014mm.autogen.events.HotPatchApplyEvent) r11
            b12.a r0 = r10.f261314d
            java.lang.String r1 = "Tinker.HotPatchApplyService"
            r2 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r11 = "hp_apply processing busy, ignore new event"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r11)
            goto L_0x00a0
        L_0x0010:
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r0 = r11.f78833d
            int r3 = r0.f78839f
            r4 = 1
            if (r4 != r3) goto L_0x0027
            com.tencent.mm.modelmulti.a r11 = new com.tencent.mm.modelmulti.a
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            x02.i r1 = new x02.i
            r1.<init>(r10)
            r11.<init>(r0, r1, r2)
            goto L_0x00a0
        L_0x0027:
            java.lang.String r0 = r0.f78838e
            if (r0 == 0) goto L_0x0030
            r10.mo125180d(r0)
            goto L_0x00a0
        L_0x0030:
            x02.C38431f.m41873d(r4)
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r0 = r11.f78833d
            java.lang.String r0 = r0.f78836c
            if (r0 == 0) goto L_0x0048
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ Error -> 0x0047 }
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r3 = r11.f78833d     // Catch:{ Error -> 0x0047 }
            java.lang.String r5 = new java.lang.String     // Catch:{ Error -> 0x0047 }
            r5.<init>(r0)     // Catch:{ Error -> 0x0047 }
            r3.f78836c = r5     // Catch:{ Error -> 0x0047 }
            goto L_0x0048
        L_0x0047:
        L_0x0048:
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r0 = r11.f78833d
            java.lang.String r0 = r0.f78836c
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0081
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r0 = r11.f78833d
            java.lang.String r0 = r0.f78837d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0081
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r3 = r11.f78833d
            java.lang.String r5 = r3.f78836c
            r0[r2] = r5
            java.lang.String r3 = r3.f78837d
            r0[r4] = r3
            java.lang.String r3 = "hp_apply request url=%s, signature=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r0)
            x02.j r0 = new x02.j
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r11 = r11.f78833d
            java.lang.String r6 = r11.f78836c
            java.lang.String r7 = f261312e
            java.lang.String r8 = r11.f78837d
            r9 = 1
            r4 = r0
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r10.f261314d = r0
            goto L_0x0095
        L_0x0081:
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r0 = r11.f78833d
            java.lang.String r0 = r0.f78834a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00a0
            com.tencent.mm.autogen.events.HotPatchApplyEvent$a r11 = r11.f78833d
            java.lang.String r11 = r11.f78835b
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x00a0
        L_0x0095:
            zt3.t r11 = zt3.C119157j.f356862d
            b12.a r0 = r10.f261314d
            zt3.j r11 = (zt3.C119157j) r11
            java.lang.String r1 = "hp_apply_download"
            r11.mo183876g(r0, r1)
        L_0x00a0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x02.C91118g.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cf, code lost:
        cy3.C58003b.m67160a(r1, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d2, code lost:
        throw r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo125180d(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r1[r2] = r11
            java.lang.String r3 = "Tinker.HotPatchApplyService"
            java.lang.String r4 = "hp_apply from file %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r3, r4, r1)
            java.lang.String r1 = "file"
            gy3.C87412m.m108594g(r11, r1)
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = new java.io.File
            r4.<init>(r11)
            r3.<init>(r4)
            r1.<init>(r3)
            long r3 = r1.readLong()     // Catch:{ all -> 0x00cc }
            r5 = 0
            cy3.C58003b.m67160a(r1, r5)
            r5 = 96093072812398(0x57656978696e, double:4.74762860799273E-310)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0034
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            if (r1 == 0) goto L_0x00b5
            java.lang.Class<m13.b> r1 = m13.C88689b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            m13.b r1 = (m13.C88689b) r1
            r1.mo122763ta()
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "/data/local/tmp/testtpc.apk"
            r1.<init>(r3)
            boolean r1 = r1.exists()
            if (r1 == 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r3 = b12.C79645d.m96733i(r1)
        L_0x0058:
            r6 = r3
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            com.tencent.mm.vfs.VFSStrategy$$b r3 = com.tencent.p014mm.vfs.VFSStrategy.f348871a
            java.lang.String r3 = "TPCFile"
            com.tencent.mm.vfs.m1 r3 = a70.C112760b.m154236i0(r3)
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r11)
            java.lang.String r5 = r4.getPath()
            if (r5 == 0) goto L_0x0087
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r2, r2)
            java.lang.String r5 = r4.getPath()
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x0087
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r2 = r4.path(r2)
            android.net.Uri r4 = r2.build()
        L_0x0087:
            java.lang.String r2 = r4.getPath()
            java.lang.String r4 = "/"
            int r4 = r2.lastIndexOf(r4)
            if (r4 >= 0) goto L_0x0094
            goto L_0x0099
        L_0x0094:
            int r4 = r4 + r0
            java.lang.String r2 = r2.substring(r4)
        L_0x0099:
            r1.<init>((com.tencent.p014mm.vfs.C86009m1) r3, (java.lang.String) r2)
            java.lang.String r8 = r1.mo119971i()
            x02.g$$a r9 = new x02.g$$a
            r9.<init>(r1)
            zt3.t r0 = zt3.C119157j.f356862d
            x02.h r1 = new x02.h
            r4 = r1
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183884o(r1)
            goto L_0x00c2
        L_0x00b5:
            boolean r0 = a12.C79455h.f232995a
            if (r0 == 0) goto L_0x00c3
            com.tencent.tinker.entry.ApplicationLike r0 = com.tencent.p014mm.app.C80589e.f235760a
            android.app.Application r0 = r0.getApplication()
            iv3.C87825c.m109282a(r0, r11)
        L_0x00c2:
            return
        L_0x00c3:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r0 = "upgrade patch but tinker is not installed"
            r11.<init>(r0)
            throw r11
        L_0x00cc:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            cy3.C58003b.m67160a(r1, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x02.C91118g.mo125180d(java.lang.String):void");
    }
}
