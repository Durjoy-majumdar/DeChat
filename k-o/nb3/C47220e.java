package nb3;

import com.tencent.p014mm.plugin.wepkg.utils.C44536d;
import tx1.C37298d;

/* renamed from: nb3.e */
public class C47220e implements C37298d {

    /* renamed from: nb3.e$a */
    public class C47221a implements Runnable {
        public C47221a(C47220e eVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00b8  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d8  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0147  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                sw1.m r0 = sw1.C48477m.C13789a.m13091a()
                r1 = 0
                if (r0 == 0) goto L_0x0010
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r0 = r0.ju0(r2)
                goto L_0x0011
            L_0x0010:
                r0 = 0
            L_0x0011:
                long r2 = eb0.C75592q0.m90781k()
                r4 = 8388608(0x800000, double:4.144523E-317)
                long r2 = r2 & r4
                r4 = 0
                r6 = 1
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r7 == 0) goto L_0x0022
                r2 = 1
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
                r4[r1] = r5
                r5 = r2 ^ 1
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r4[r6] = r5
                java.lang.String r5 = "WePkgGlobalConfigUpdateListener"
                java.lang.String r7 = "shouldShowGame %s, openGameEntry %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r7, r4)
                if (r0 == 0) goto L_0x016f
                if (r2 != 0) goto L_0x016f
                com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45371e()
                r2 = 0
                if (r0 == 0) goto L_0x007a
                com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
                py1.p5 r0 = r0.WepkgControl
                if (r0 == 0) goto L_0x007d
                java.util.LinkedList<py1.d4> r0 = r0.f127931e
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
                if (r4 != 0) goto L_0x007d
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x005d:
                boolean r5 = r0.hasNext()
                if (r5 == 0) goto L_0x007e
                java.lang.Object r5 = r0.next()
                py1.d4 r5 = (py1.C47566d4) r5
                if (r5 == 0) goto L_0x005d
                java.lang.String r7 = r5.f127642d
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 == 0) goto L_0x0074
                goto L_0x005d
            L_0x0074:
                java.lang.String r5 = r5.f127642d
                r4.add(r5)
                goto L_0x005d
            L_0x007a:
                com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()
            L_0x007d:
                r4 = r2
            L_0x007e:
                com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45371e()
                if (r0 == 0) goto L_0x00b8
                com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
                py1.p5 r0 = r0.WepkgControl
                if (r0 == 0) goto L_0x00bb
                java.util.LinkedList<py1.d4> r0 = r0.f127932f
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
                if (r5 != 0) goto L_0x00bb
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x009b:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x00bc
                java.lang.Object r7 = r0.next()
                py1.d4 r7 = (py1.C47566d4) r7
                if (r7 == 0) goto L_0x009b
                java.lang.String r8 = r7.f127642d
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 == 0) goto L_0x00b2
                goto L_0x009b
            L_0x00b2:
                java.lang.String r7 = r7.f127642d
                r5.add(r7)
                goto L_0x009b
            L_0x00b8:
                com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()
            L_0x00bb:
                r5 = r2
            L_0x00bc:
                if (r4 != 0) goto L_0x00c3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
            L_0x00c3:
                java.lang.Object[] r0 = new java.lang.Object[r6]
                int r7 = r4.size()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r0[r1] = r7
                java.lang.String r7 = "MicroMsg.Wepkg.WepkgVersionUpdater"
                java.lang.String r8 = "pkgIdsForAll size:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r0)
                if (r5 != 0) goto L_0x00dd
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L_0x00dd:
                java.lang.Object[] r0 = new java.lang.Object[r6]
                int r8 = r5.size()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r1] = r8
                java.lang.String r8 = "pkgIdsIfExists size:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r0)
                lb3.f r0 = lb3.C46844f.m52139Ow()
                boolean r8 = r0.f126002d
                if (r8 != 0) goto L_0x00f7
                goto L_0x0145
            L_0x00f7:
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r8 = "pkgId"
                r2[r1] = r8
                java.lang.String r8 = "WepkgVersion"
                r2[r6] = r8
                java.lang.String r8 = "nextCheckTime"
                r2[r3] = r8
                java.lang.String r8 = "select %s from %s where %s < ?"
                java.lang.String r2 = java.lang.String.format(r8, r2)
                java.lang.String[] r8 = new java.lang.String[r6]
                java.lang.Object r9 = com.tencent.p014mm.plugin.wepkg.utils.C44536d.f120770a
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                java.lang.String r9 = java.lang.String.valueOf(r9)
                r8[r1] = r9
                android.database.Cursor r0 = r0.rawQuery(r2, r8)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                if (r0 == 0) goto L_0x0145
                boolean r8 = r0.moveToFirst()
                if (r8 == 0) goto L_0x0142
            L_0x012b:
                java.lang.String r8 = r0.getString(r1)
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r9 != 0) goto L_0x0138
                r2.add(r8)
            L_0x0138:
                boolean r8 = r0.moveToNext()
                if (r8 != 0) goto L_0x012b
                r0.close()
                goto L_0x0145
            L_0x0142:
                r0.close()
            L_0x0145:
                if (r2 != 0) goto L_0x014c
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L_0x014c:
                java.lang.Object[] r0 = new java.lang.Object[r6]
                int r8 = r2.size()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r1] = r8
                java.lang.String r1 = "localPkgIdList size:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r0)
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r0.addAll(r2)
                r0.retainAll(r5)
                r0.addAll(r4)
                r1 = -1
                com.tencent.p014mm.plugin.wepkg.version.WepkgVersionUpdater.m48922b(r0, r3, r1, r6)
            L_0x016f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nb3.C47220e.C47221a.run():void");
        }
    }

    /* renamed from: C3 */
    public void mo61029C3() {
        C44536d.m48918d().postToWorker(new C47221a(this));
    }
}
