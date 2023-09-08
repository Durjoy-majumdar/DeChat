package ft1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32224a;
import gy3.C87412m;
import o40.C11348f;
import o40.C61923a;

/* renamed from: ft1.a */
public final class C59319a implements C11348f {

    /* renamed from: b */
    public static final C59319a f169618b = new C59319a();

    /* renamed from: a */
    public final /* synthetic */ C61923a f169619a = new C61923a(new Long[]{1535L, 1536L}, 20889, "FinderAssertCat", new C59320a());

    /* renamed from: ft1.a$a */
    public static final class C59320a implements C61923a.C61924a {
        /* JADX WARNING: Removed duplicated region for block: B:62:0x010f A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo84419a(java.lang.String r2) {
            /*
                r1 = this;
                java.lang.String r0 = "key"
                gy3.C87412m.m108594g(r2, r0)
                int r0 = r2.hashCode()
                switch(r0) {
                    case -2026511365: goto L_0x0103;
                    case -1992170110: goto L_0x00f7;
                    case -1731756960: goto L_0x00eb;
                    case -1714598175: goto L_0x00e0;
                    case -1710086618: goto L_0x00d5;
                    case -895369361: goto L_0x00c9;
                    case -867484337: goto L_0x00bd;
                    case -775292920: goto L_0x00b2;
                    case -485086917: goto L_0x00a5;
                    case -56891478: goto L_0x0098;
                    case 3622727: goto L_0x008a;
                    case 95743278: goto L_0x007d;
                    case 207305279: goto L_0x006f;
                    case 253205425: goto L_0x0061;
                    case 408071997: goto L_0x0053;
                    case 1057368614: goto L_0x0045;
                    case 1217497518: goto L_0x0037;
                    case 1417050858: goto L_0x0029;
                    case 1864591139: goto L_0x001c;
                    case 2001682692: goto L_0x000e;
                    default: goto L_0x000c;
                }
            L_0x000c:
                goto L_0x010f
            L_0x000e:
                java.lang.String r0 = "ecBagAnimRemoveViewError"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0018
                goto L_0x010f
            L_0x0018:
                r2 = 19
                goto L_0x0110
            L_0x001c:
                java.lang.String r0 = "layoutIdError"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0026
                goto L_0x010f
            L_0x0026:
                r2 = 3
                goto L_0x0110
            L_0x0029:
                java.lang.String r0 = "finderlivefloatpermission_notshow"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0033
                goto L_0x010f
            L_0x0033:
                r2 = 18
                goto L_0x0110
            L_0x0037:
                java.lang.String r0 = "liveVisitorUIParamsInvalidFinish"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0041
                goto L_0x010f
            L_0x0041:
                r2 = 20
                goto L_0x0110
            L_0x0045:
                java.lang.String r0 = "liveInitContentViewError"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x004f
                goto L_0x010f
            L_0x004f:
                r2 = 13
                goto L_0x0110
            L_0x0053:
                java.lang.String r0 = "liveInvalidBadgeInfoColor"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x005d
                goto L_0x010f
            L_0x005d:
                r2 = 8
                goto L_0x0110
            L_0x0061:
                java.lang.String r0 = "finderolympicsdatanull"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x006b
                goto L_0x010f
            L_0x006b:
                r2 = 16
                goto L_0x0110
            L_0x006f:
                java.lang.String r0 = "finderStreamReturnInvalidFeed"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0079
                goto L_0x010f
            L_0x0079:
                r2 = 15
                goto L_0x0110
            L_0x007d:
                java.lang.String r0 = "optimizeMP4VFS_fail"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0087
                goto L_0x010f
            L_0x0087:
                r2 = 7
                goto L_0x0110
            L_0x008a:
                java.lang.String r0 = "liveCheckCommentMsgErr"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0094
                goto L_0x010f
            L_0x0094:
                r2 = 10
                goto L_0x0110
            L_0x0098:
                java.lang.String r0 = "liveHeartBeatLocalErr"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00a2
                goto L_0x010f
            L_0x00a2:
                r2 = 5
                goto L_0x0110
            L_0x00a5:
                java.lang.String r0 = "liveVisitorUIParamsInvalid"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00af
                goto L_0x010f
            L_0x00af:
                r2 = 6
                goto L_0x0110
            L_0x00b2:
                java.lang.String r0 = "opt_moov_fail"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00bb
                goto L_0x010f
            L_0x00bb:
                r2 = 1
                goto L_0x0110
            L_0x00bd:
                java.lang.String r0 = "bulletAnimSliceTooMuchTime"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00c6
                goto L_0x010f
            L_0x00c6:
                r2 = 21
                goto L_0x0110
            L_0x00c9:
                java.lang.String r0 = "cgiReportError"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00d2
                goto L_0x010f
            L_0x00d2:
                r2 = 11
                goto L_0x0110
            L_0x00d5:
                java.lang.String r0 = "liveHeartBeatSvrErr"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00de
                goto L_0x010f
            L_0x00de:
                r2 = 4
                goto L_0x0110
            L_0x00e0:
                java.lang.String r0 = "NetSceneFinderFollow_fromCommentScene_0"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00e9
                goto L_0x010f
            L_0x00e9:
                r2 = 2
                goto L_0x0110
            L_0x00eb:
                java.lang.String r0 = "cgiReportNormal"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x00f4
                goto L_0x010f
            L_0x00f4:
                r2 = 12
                goto L_0x0110
            L_0x00f7:
                java.lang.String r0 = "liveInvalidBadgeTag"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x0100
                goto L_0x010f
            L_0x0100:
                r2 = 9
                goto L_0x0110
            L_0x0103:
                java.lang.String r0 = "finderlivefloatpermission_timeout"
                boolean r2 = r2.equals(r0)
                if (r2 != 0) goto L_0x010c
                goto L_0x010f
            L_0x010c:
                r2 = 17
                goto L_0x0110
            L_0x010f:
                r2 = 0
            L_0x0110:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ft1.C59319a.C59320a.mo84419a(java.lang.String):int");
        }

        public int getVersion() {
            return 4;
        }
    }

    /* renamed from: a */
    public void mo11369a(String str, boolean z, C11348f.C11352b bVar, boolean z2, boolean z3, C32224a<String> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LEVEL);
        C87412m.m108594g(aVar, StateEvent.Name.MESSAGE);
        this.f169619a.mo11369a(str, z, bVar, z2, z3, aVar);
    }

    /* renamed from: b */
    public void mo11370b(String str, boolean z, C11348f.C11352b bVar, boolean z2, boolean z3, C32224a<String> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LEVEL);
        C87412m.m108594g(aVar, StateEvent.Name.MESSAGE);
        this.f169619a.mo11370b(str, z, bVar, z2, z3, aVar);
    }
}
