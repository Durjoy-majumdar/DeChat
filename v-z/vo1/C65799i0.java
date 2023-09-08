package vo1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8480h;
import gy3.C87412m;
import o40.C61926c;
import p823sg.C90193h;
import pl1.C62367r0;
import te3.C64359f71;
import te3.C64689rq2;
import te3.C64733to;
import up1.C27696y;
import y50.C15936n0;
import z04.C112551y;

/* renamed from: vo1.i0 */
public final class C65799i0 {

    /* renamed from: a */
    public static final C65799i0 f189246a = new C65799i0();

    /* renamed from: a */
    public final C62367r0 mo89846a(String str, String str2) {
        C87412m.m108594g(str, "replayUrl");
        C64689rq2 rq22 = new C64689rq2();
        boolean z = false;
        if (BuildInfo.DEBUG) {
            str = C112551y.m153814n(str, C113600ck.f339986i, "http", false);
        }
        rq22.f185266d = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            str2 = C90193h.m112876d(rq22.f185266d);
        }
        rq22.f185275p = str2;
        return new C62367r0(rq22, C27696y.V0_VIDEO, "xV0", 0, 0, (String) null, 56, (C8480h) null);
    }

    /* renamed from: b */
    public final String mo89847b(int i) {
        return i >= 3600 ? C15936n0.C15937a.m14866a(C15936n0.f42815a, i, XVFSFile.PATH_SEPARATOR, true, false, false, 24, (Object) null) : C15936n0.C15937a.m14866a(C15936n0.f42815a, i, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        if ((r1 == null || r1.length() == 0) != false) goto L_0x0053;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89848c(al1.C54127h r13, int r14) {
        /*
            r12 = this;
            java.lang.String r0 = "liveData"
            gy3.C87412m.m108594g(r13, r0)
            vp1.e r0 = vp1.C65834e.f189316a
            com.tencent.mm.live.api.LiveConfig r1 = r13.f151977d
            long r1 = r1.f157075s
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.mo89871e(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0017
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFinderObject()
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "#replay_data#finderObject from cache:"
            r2.append(r3)
            sk1.a r3 = sk1.C63947a.f181274a
            r10 = -1
            java.lang.String r4 = r3.mo88735u(r0, r10)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r11 = "recoverFromLiveConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            if (r0 == 0) goto L_0x0053
            te3.c21 r5 = r0.liveInfo
            if (r5 == 0) goto L_0x0045
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r6 = "recoverFromLiveConfig"
            r4 = r3
            java.lang.String r1 = sk1.C63947a.m75194h(r4, r5, r6, r7, r8, r9)
        L_0x0045:
            if (r1 == 0) goto L_0x0050
            int r1 = r1.length()
            if (r1 != 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 0
            goto L_0x0051
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 == 0) goto L_0x0071
        L_0x0053:
            al1.h$a r0 = al1.C54127h.f151976n
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.mo74922b(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#replay_data#finderObject from static data:"
            r1.append(r2)
            java.lang.String r2 = r3.mo88735u(r0, r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
        L_0x0071:
            r3.mo88734t(r13, r0, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65799i0.mo89848c(al1.h, int):void");
    }

    /* renamed from: d */
    public final String mo89849d(C64359f71 f712, C64733to toVar) {
        String str;
        C87412m.m108594g(toVar, "cdnInfo");
        if (f712 == null || f712.f183088g == 0) {
            str = C90193h.m112876d(toVar.f185622e);
        } else {
            str = C61926c.m72691p(f712.f183088g) + '_' + toVar.f185627j + '_' + toVar.f185624g;
        }
        return "finder_live_" + str;
    }
}
