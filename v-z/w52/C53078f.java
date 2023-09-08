package w52;

import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.Downloads;
import eb0.C97625j3;
import java.util.LinkedList;
import java.util.Map;
import p823sg.C90193h;

/* renamed from: w52.f */
public class C53078f {

    /* renamed from: a */
    public LinkedList<C53079g> f148143a;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo73767a() {
        /*
            r10 = this;
            java.util.LinkedList<w52.g> r0 = r10.f148143a
            r1 = 1
            java.lang.String r2 = "MicroMsg.MassSendService"
            r3 = 0
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = r10.mo73768b()
            r4 = -1
            byte[] r4 = com.tencent.p014mm.vfs.C86013q1.m106433O(r0, r3, r4)
            if (r4 != 0) goto L_0x0014
            goto L_0x0031
        L_0x0014:
            w52.h r5 = new w52.h     // Catch:{ Exception -> 0x0024 }
            r5.<init>()     // Catch:{ Exception -> 0x0024 }
            pe3.a r4 = r5.parseFrom(r4)     // Catch:{ Exception -> 0x0024 }
            w52.h r4 = (w52.C53080h) r4     // Catch:{ Exception -> 0x0024 }
            java.util.LinkedList<w52.g> r4 = r4.f148147e     // Catch:{ Exception -> 0x0024 }
            r10.f148143a = r4     // Catch:{ Exception -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            goto L_0x0031
        L_0x0028:
            java.util.LinkedList<w52.g> r0 = r10.f148143a
            if (r0 != 0) goto L_0x0033
            java.lang.String r0 = "info list is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r0)
        L_0x0031:
            r0 = 0
            goto L_0x0065
        L_0x0033:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r0 = r0.toString()
            r4[r3] = r0
            java.lang.String r0 = "info list[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.util.LinkedList<w52.g> r0 = r10.f148143a
            java.util.Iterator r0 = r0.iterator()
        L_0x004a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0031
            java.lang.Object r6 = r0.next()
            w52.g r6 = (w52.C53079g) r6
            int r7 = r6.f148144d
            long r7 = (long) r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x004a
            int r6 = r6.f148145e
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x004a
            r0 = 1
        L_0x0065:
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = 102408(0x19008, float:1.43504E-40)
            java.lang.Object r4 = r4.mo119684e(r6, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            int r7 = eb0.C75592q0.m90785o()
            r8 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 & r8
            if (r7 != 0) goto L_0x0087
            r7 = 1
            goto L_0x0088
        L_0x0087:
            r7 = 0
        L_0x0088:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            r1[r3] = r8
            java.lang.String r8 = "hadSetTop is %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r8, r1)
            if (r7 == 0) goto L_0x0188
            if (r4 != 0) goto L_0x0188
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "set top conversation"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            java.lang.String r1 = "masssendapp"
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r1)
            r4 = 2000(0x7d0, double:9.88E-321)
            r2 = 2131824196(0x7f110e44, float:1.9281213E38)
            if (r0 != 0) goto L_0x00fc
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            com.tencent.mm.storage.h2 r0 = r0.mo69771j(r1)
            if (r0 == 0) goto L_0x00c9
            goto L_0x015b
        L_0x00c9:
            com.tencent.mm.storage.h2 r0 = new com.tencent.mm.storage.h2
            r0.<init>()
            r0.setUsername(r1)
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getString(r2)
            r0.mo108792M2(r1)
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r1 = r1 + r4
            r0.mo108793N2(r1)
            r0.mo108803Y2(r3)
            r0.mo108812g3(r3)
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r1 = r1.mo105908w()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            r1.mo69751W(r0)
            goto L_0x015b
        L_0x00fc:
            w52.e r0 = w52.C38023l.wx0()
            zh3.f r0 = r0.f229995d
            r7 = 0
            r8 = 2
            java.lang.String r9 = "select * from massendinfo ORDER BY createtime DESC  limit 1"
            android.database.Cursor r0 = r0.rawQuery(r9, r7, r8)
            if (r0 != 0) goto L_0x010d
            goto L_0x011e
        L_0x010d:
            boolean r8 = r0.moveToFirst()
            if (r8 == 0) goto L_0x011b
            w52.d r7 = new w52.d
            r7.<init>()
            r7.mo108462a(r0)
        L_0x011b:
            r0.close()
        L_0x011e:
            if (r7 != 0) goto L_0x012d
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0135
        L_0x012d:
            w52.e r0 = w52.C38023l.wx0()
            java.lang.String r0 = r0.mo108478qq(r7)
        L_0x0135:
            com.tencent.mm.storage.h2 r2 = new com.tencent.mm.storage.h2
            r2.<init>()
            r2.setUsername(r1)
            r2.mo108792M2(r0)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r7 = r7 + r4
            r2.mo108793N2(r7)
            r2.mo108803Y2(r3)
            r2.mo108812g3(r3)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r0 = r0.mo105908w()
            com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
            r0.mo69773k0(r2, r1)
        L_0x015b:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 10425(0x28b9, float:1.4609E-41)
            java.lang.String r2 = ""
            r0.kvStat(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r1 = 102409(0x19009, float:1.43506E-40)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo119676J(r1, r2)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.mo119676J(r6, r1)
            return
        L_0x0188:
            if (r0 != 0) goto L_0x0195
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            r0.mo119676J(r6, r5)
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w52.C53078f.mo73767a():void");
    }

    /* renamed from: b */
    public final String mo73768b() {
        if (!C97625j3.m125811a()) {
            return "";
        }
        String format = String.format("%s/masssend_%s.ini", new Object[]{C97625j3.m125812b().mo105901p(), LocaleUtil.getApplicationLanguage()});
        Log.m105919d("MicroMsg.MassSendService", "config file path is %s", format);
        return format;
    }

    /* renamed from: c */
    public void mo73769c(String str) {
        Map<String, String> parseXml;
        if (!Util.isNullOrNil(str) && (parseXml = XmlParser.parseXml(str, "Festivals", (String) null)) != null) {
            C53080h hVar = new C53080h();
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                sb.append(".Festivals.Festival");
                sb.append(i == 0 ? "" : String.valueOf(i));
                String sb4 = sb.toString();
                if (!parseXml.containsKey(sb4)) {
                    break;
                }
                C53079g gVar = new C53079g();
                gVar.f148144d = Util.getSeconds(parseXml.get(sb4 + ".StartTime"), 0);
                gVar.f148145e = Util.getSeconds(parseXml.get(sb4 + ".EndTime"), 0) + Downloads.MAX_RETYR_AFTER;
                hVar.f148147e.add(gVar);
                i++;
            }
            hVar.f148146d = hVar.f148147e.size();
            this.f148143a = hVar.f148147e;
            try {
                byte[] byteArray = hVar.toByteArray();
                String b = mo73768b();
                if (Util.isNullOrNil(b)) {
                    Log.m105928w("MicroMsg.MassSendService", "mass send config file path is null, return");
                    return;
                }
                Uri n = C116299g2.m163858n(b);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                    C97625j3.m125812b().mo105906u().mo119676J(102408, Boolean.FALSE);
                } else if (!C86013q1.m106456q(C116299g2.m163865u(n)).equals(C90193h.m112878f(byteArray))) {
                    C97625j3.m125812b().mo105906u().mo119676J(102408, Boolean.FALSE);
                }
                Log.m105919d("MicroMsg.MassSendService", "save to config file : %s", hVar.toString());
                C86013q1.m106438T(b, byteArray, 0, byteArray.length);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.MassSendService", e, "", new Object[0]);
            }
        }
    }
}
