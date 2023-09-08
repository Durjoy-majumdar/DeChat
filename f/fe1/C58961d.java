package fe1;

import bd1.C54446b;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49512g4;
import te3.C50075k34;
import te3.C50266li0;
import te3.C51103rg0;
import te3.C51887ww2;
import te3.C64284cg;
import tf0.C64916p1;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: fe1.d */
public final class C58961d {

    /* renamed from: a */
    public static final C58963b f168673a = new C58963b();

    /* renamed from: b */
    public static final String f168674b = "Finder.FinderContactLogic";

    /* renamed from: c */
    public static final C13601g<C58959b> f168675c = C36568h.m40985a(C58962a.f168676d);

    /* renamed from: fe1.d$a */
    public static final class C58962a extends C87413o implements C32224a<C58959b> {

        /* renamed from: d */
        public static final C58962a f168676d = new C58962a();

        public C58962a() {
            super(0);
        }

        public Object invoke() {
            return ((C64916p1) C86312j.m106911c(C64916p1.class)).Zj0();
        }
    }

    /* renamed from: fe1.d$b */
    public static final class C58963b {

        /* renamed from: fe1.d$b$a */
        public static final class C8011a extends C87413o implements C32226l<C58969q, C58969q> {

            /* renamed from: d */
            public final /* synthetic */ int f26701d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C8011a(int i) {
                super(1);
                this.f26701d = i;
            }

            public Object invoke(Object obj) {
                C58969q qVar = (C58969q) obj;
                C87412m.m108594g(qVar, "contact");
                qVar.field_follow_Flag = this.f26701d;
                return qVar;
            }
        }

        /* renamed from: h */
        public static boolean m68836h(C58963b bVar, String str, String str2, boolean z, boolean z2, int i, Object obj) {
            C64284cg b;
            String str3 = null;
            if ((i & 2) != 0) {
                str2 = null;
            }
            boolean z3 = false;
            if ((i & 4) != 0) {
                z = false;
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            C58969q b2 = bVar.mo84155b(str);
            boolean z4 = (str == null || b2 == null || b2.field_follow_Flag != C58969q.f168707c2) ? false : true;
            if (z) {
                return z4;
            }
            if (str2 != null) {
                str3 = str2;
            } else if (!(b2 == null || (b = C58960c.m68830b(b2, z2)) == null)) {
                str3 = b.f182468d;
            }
            if (str3 == null) {
                return z4;
            }
            if (C45628s0.m50738C(str3) && C45628s0.m50740E(str3)) {
                z3 = true;
            }
            return z3;
        }

        /* renamed from: m */
        public static boolean m68837m(C58963b bVar, FinderContact finderContact, boolean z, int i, Object obj) {
            String str;
            String str2;
            if ((i & 2) != 0) {
                z = true;
            }
            bVar.getClass();
            if (finderContact != null) {
                String str3 = finderContact.username;
                if (str3 == null || str3.length() == 0) {
                    String str4 = C58961d.f168674b;
                    Log.m105920e(str4, "error FinderContact username is null " + Util.getStack());
                } else {
                    String str5 = finderContact.username;
                    String str6 = "";
                    if (str5 == null) {
                        str5 = str6;
                    }
                    C58969q b = bVar.mo84155b(str5);
                    if (b == null) {
                        b = new C58969q();
                    }
                    C64284cg a = C58960c.m68829a(finderContact, false);
                    String str7 = finderContact.username;
                    if (str7 == null) {
                        str7 = str6;
                    }
                    b.field_username = str7;
                    if ((a == null || (str = a.f182470f) == null) && (str = finderContact.headUrl) == null) {
                        str = str6;
                    }
                    b.field_avatarUrl = str;
                    if (!((a == null || (str2 = a.f182469e) == null) && (str2 = finderContact.nickname) == null)) {
                        str6 = str2;
                    }
                    b.field_nickname = str6;
                    FinderAuthInfo finderAuthInfo = b.field_authInfo;
                    C13598b0 b0Var = null;
                    if (finderAuthInfo != null) {
                        FinderAuthInfo finderAuthInfo2 = finderContact.authInfo;
                        if (finderAuthInfo2 != null) {
                            finderAuthInfo.appName = finderAuthInfo2.appName;
                            finderAuthInfo.authProfession = finderAuthInfo2.authProfession;
                            finderAuthInfo.authIconType = finderAuthInfo2.authIconType;
                            finderAuthInfo.detailLink = finderAuthInfo2.detailLink;
                            finderAuthInfo.realName = finderAuthInfo2.realName;
                            finderAuthInfo.authIconUrl = finderAuthInfo2.authIconUrl;
                        }
                        b0Var = C13598b0.f38549a;
                    }
                    if (b0Var == null) {
                        b.field_authInfo = finderContact.authInfo;
                    }
                    b.field_extInfo = finderContact.extInfo;
                    C51103rg0 rg02 = new C51103rg0();
                    rg02.f140887d = finderContact.bind_info;
                    b.field_bindInfoList = rg02;
                    String str8 = C58961d.f168674b;
                    Log.m105925i(str8, "replaceMinContact result %s onlyMemory " + z + ", " + Util.getStack(), b.mo84193q2());
                    bVar.mo84165n(b);
                    if (z) {
                        return true;
                    }
                    bVar.mo84164l(b);
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final C58959b mo84154a() {
            return (C58959b) ((C36570n) C58961d.f168675c).getValue();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
            if (gy3.C87412m.m108589b(r5, r0.mo90662O5()) == false) goto L_0x004b;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final fe1.C58969q mo84155b(java.lang.String r5) {
            /*
                r4 = this;
                if (r5 != 0) goto L_0x0004
                r5 = 0
                return r5
            L_0x0004:
                zc1.b r0 = zc1.C66785b.f191882e
                java.lang.String r1 = r0.mo90662O5()
                boolean r1 = gy3.C87412m.m108589b(r5, r1)
                if (r1 == 0) goto L_0x0015
                fe1.q r5 = r4.mo84158e()
                return r5
            L_0x0015:
                java.lang.String r1 = eb0.C75592q0.m90782l()
                boolean r1 = gy3.C87412m.m108589b(r5, r1)
                if (r1 == 0) goto L_0x0024
                fe1.q r5 = r4.mo84159f()
                return r5
            L_0x0024:
                fe1.b r1 = r4.mo84154a()
                fe1.q r1 = r1.mo84153a(r5)
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x004a
                java.lang.String r1 = r1.field_username
                if (r1 == 0) goto L_0x003d
                int r1 = r1.length()
                if (r1 != 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r1 = 0
                goto L_0x003e
            L_0x003d:
                r1 = 1
            L_0x003e:
                if (r1 != 0) goto L_0x004a
                java.lang.String r0 = r0.mo90662O5()
                boolean r0 = gy3.C87412m.m108589b(r5, r0)
                if (r0 == 0) goto L_0x004b
            L_0x004a:
                r2 = 0
            L_0x004b:
                if (r2 == 0) goto L_0x0056
                fe1.b r0 = r4.mo84154a()
                fe1.q r5 = r0.mo84153a(r5)
                return r5
            L_0x0056:
                fe1.q r0 = r4.mo84156c(r5)
                if (r0 == 0) goto L_0x005f
                r4.mo84165n(r0)
            L_0x005f:
                fe1.b r0 = r4.mo84154a()
                fe1.q r5 = r0.mo84153a(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: fe1.C58961d.C58963b.mo84155b(java.lang.String):fe1.q");
        }

        /* renamed from: c */
        public final C58969q mo84156c(String str) {
            C58969q W5 = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76681W5(str);
            String str2 = C58961d.f168674b;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = W5 != null ? W5.mo84192p2() : null;
            Log.m105925i(str2, "get contact %s %s", objArr);
            return W5;
        }

        /* renamed from: d */
        public final boolean mo84157d(String str) {
            boolean z;
            C87412m.m108594g(str, "entrance");
            boolean u = C61926c.m72696u((int) mo84158e().field_liveSwitchFlag, 32);
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_finder_live_task_sub_switch, "");
            C87412m.m108593f(Y60, "configStr");
            if (!(Y60.length() == 0)) {
                try {
                    z = new JSONObject(Y60).optBoolean(str);
                } catch (Exception unused) {
                }
                return u && z;
            }
            z = true;
            if (u) {
                return false;
            }
        }

        /* renamed from: e */
        public final C58969q mo84158e() {
            String str;
            String str2;
            String str3;
            C50075k34 k342;
            C49512g4 g4Var;
            C50266li0 li02;
            C51887ww2 ww22;
            C50266li0 li03;
            C51887ww2 ww23;
            C50266li0 li04;
            C50266li0 li05;
            String str4;
            C58959b a = mo84154a();
            C66785b bVar = C66785b.f191882e;
            C58969q a2 = a.mo84153a(bVar.mo90662O5());
            if (a2 == null) {
                a2 = new C58969q();
                a2.field_username = bVar.mo90662O5();
            }
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C58969q.f168705a2;
            a2.field_follow_Flag = C58969q.f168707c2;
            int i = 0;
            FinderAuthInfo finderAuthInfo = null;
            C54446b c = C66783a.C66784a.m78800c(bVar, false, 1, (Object) null);
            String str5 = "";
            if (c == null || (str = c.field_nickname) == null) {
                str = str5;
            }
            a2.field_nickname = str;
            if (c == null || (str2 = c.field_avatarUrl) == null) {
                str2 = str5;
            }
            a2.field_avatarUrl = str2;
            if (c == null || (str3 = c.field_signature) == null) {
                str3 = str5;
            }
            a2.field_signature = str3;
            a2.field_originalFlag = c != null ? c.field_originalFlag : 0;
            a2.field_originalEntranceFlag = c != null ? c.field_originalEntranceFlag : 0;
            if (c != null) {
                i = c.field_extFlag;
            }
            a2.field_extFlag = i;
            if (c != null) {
                finderAuthInfo = c.field_authInfo;
            }
            a2.field_authInfo = finderAuthInfo;
            if (!(c == null || (str4 = c.field_liveCoverImgUrl) == null)) {
                str5 = str4;
            }
            a2.field_liveCoverImg = str5;
            long j = 0;
            a2.field_liveAnchorStatusFlag = (c == null || (li05 = c.field_liveInfo) == null) ? 0 : li05.f137430d;
            a2.field_liveSwitchFlag = (c == null || (li04 = c.field_liveInfo) == null) ? 0 : (long) li04.f137431e;
            a2.field_liveMicSetting = (c == null || (li03 = c.field_liveInfo) == null || (ww23 = li03.f137433g) == null) ? 0 : ww23.f144323d;
            if (!(c == null || (li02 = c.field_liveInfo) == null || (ww22 = li02.f137433g) == null)) {
                j = ww22.f144324e;
            }
            a2.field_liveMicSettingSwitch = j;
            if (c == null || (k342 = c.mo75251m2().f132506t) == null) {
                k342 = new C50075k34();
            }
            a2.field_settlementInfo = k342;
            if (c == null || (g4Var = c.mo75251m2().f132508v) == null) {
                g4Var = new C49512g4();
            }
            a2.field_agencyCollaborateInfo = g4Var;
            return a2;
        }

        /* renamed from: f */
        public final C58969q mo84159f() {
            C58959b a = mo84154a();
            String l = C75592q0.m90782l();
            C87412m.m108593f(l, "getMyFinderAliasUsername()");
            C58969q a2 = a.mo84153a(l);
            if (a2 == null) {
                a2 = new C58969q();
                a2.field_username = C75592q0.m90782l();
            }
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_NICKNAME_STRING_SYNC, "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            a2.field_nickname = (String) f;
            Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MY_FINDER_ALIAS_AVATAR_URL_STRING_SYNC, "");
            C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.String");
            a2.field_avatarUrl = (String) f2;
            return a2;
        }

        /* renamed from: g */
        public final boolean mo84160g(String str) {
            Log.m105919d(C58961d.f168674b, "isContact  %s exists ?", str);
            if (str == null || Util.isNullOrNil(str)) {
                return false;
            }
            return (mo84154a().mo84153a(str) == null && mo84156c(str) == null) ? false : true;
        }

        /* renamed from: i */
        public final void mo84161i(String str, int i) {
            C87412m.m108594g(str, "finderUserName");
            String str2 = C58961d.f168674b;
            StringBuilder sb = new StringBuilder();
            sb.append("operationSetFollow ");
            sb.append(str);
            sb.append(' ');
            sb.append(i);
            sb.append(" and cacheItem ");
            C58969q a = mo84154a().mo84153a(str);
            sb.append(a != null ? a.mo84192p2() : null);
            Log.m105924i(str2, sb.toString());
            C8011a aVar = new C8011a(i);
            C58969q b = mo84155b(str);
            if (b == null) {
                b = new C58969q();
                b.field_username = str;
            }
            C58969q qVar = (C58969q) aVar.invoke(b);
            mo84165n(qVar);
            mo84164l(qVar);
        }

        /* renamed from: j */
        public final boolean mo84162j(FinderContact finderContact) {
            C87412m.m108594g(finderContact, "contact");
            String str = finderContact.username;
            if (str == null || str.length() == 0) {
                String str2 = C58961d.f168674b;
                Log.m105920e(str2, "error FinderContact username is null " + Util.getStack());
                return false;
            }
            String str3 = finderContact.username;
            if (str3 == null) {
                str3 = "";
            }
            C58969q e = C58960c.m68833e(finderContact, mo84155b(str3), true);
            Log.m105925i(C58961d.f168674b, "replaceContact contact %s result %s", e.getUsername(), e.mo84192p2());
            mo84165n(e);
            mo84164l(e);
            return true;
        }

        /* renamed from: k */
        public final boolean mo84163k(C58969q qVar) {
            C87412m.m108594g(qVar, "contact");
            mo84165n(qVar);
            return mo84164l(qVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x008b, code lost:
            if (r2 > 0) goto L_0x010c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x010a, code lost:
            if (r2 > 0) goto L_0x010c;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo84164l(fe1.C58969q r22) {
            /*
                r21 = this;
                r0 = r22
                java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                tf0.p1 r1 = (tf0.C64916p1) r1
                up1.i r1 = r1.mo76697gW()
                r1.getClass()
                java.lang.String r2 = "ct"
                gy3.C87412m.m108594g(r0, r2)
                long r2 = eb0.C31543z5.m39453c()
                r0.field_updateTime = r2
                java.lang.String r2 = r22.getUsername()
                fe1.q r2 = r1.mo89509jo(r2)
                java.lang.String r3 = "Finder.FinderContactStorage"
                java.lang.String r4 = "currentThread().name"
                java.lang.String r5 = "FinderContact"
                r6 = 0
                java.lang.String r7 = ""
                r8 = 1
                r9 = 32
                if (r2 != 0) goto L_0x008f
                android.content.ContentValues r2 = r22.convertTo()
                long r10 = android.os.SystemClock.uptimeMillis()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r1.f188263d
                long r12 = r12.insert(r5, r7, r2)
                int r2 = (int) r12
                java.lang.Thread r12 = java.lang.Thread.currentThread()
                java.lang.String r12 = r12.getName()
                gy3.C87412m.m108593f(r12, r4)
                r14 = 44
                r15 = 59
                r16 = 0
                r17 = 4
                r18 = 0
                java.lang.String r13 = "insertContact"
                java.lang.String r15 = z04.C112551y.m153815o(r13, r14, r15, r16, r17, r18)
                long r13 = android.os.SystemClock.uptimeMillis()
                long r16 = r13 - r10
                ue1.e r4 = new ue1.e
                r19 = 0
                java.lang.String r14 = "FinderContactStorage.insertContact"
                r13 = r4
                r18 = r12
                r13.<init>(r14, r15, r16, r18, r19)
                r4.mo89421a()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r10 = "insert contact "
                r4.append(r10)
                r4.append(r0)
                r4.append(r9)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                if (r2 <= 0) goto L_0x010d
                goto L_0x010c
            L_0x008f:
                android.content.ContentValues r2 = r22.convertTo()
                java.lang.String r10 = "rowid"
                r2.remove(r10)
                long r10 = android.os.SystemClock.uptimeMillis()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r12 = r1.f188263d
                java.lang.String[] r13 = new java.lang.String[r8]
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r7)
                java.lang.String r15 = r0.field_username
                r14.append(r15)
                java.lang.String r14 = r14.toString()
                r13[r6] = r14
                java.lang.String r14 = "username=?"
                int r2 = r12.update(r5, r2, r14, r13)
                java.lang.Thread r12 = java.lang.Thread.currentThread()
                java.lang.String r12 = r12.getName()
                gy3.C87412m.m108593f(r12, r4)
                r14 = 44
                r15 = 59
                r16 = 0
                r17 = 4
                r18 = 0
                java.lang.String r13 = "updateContact"
                java.lang.String r15 = z04.C112551y.m153815o(r13, r14, r15, r16, r17, r18)
                long r13 = android.os.SystemClock.uptimeMillis()
                long r16 = r13 - r10
                ue1.e r4 = new ue1.e
                r19 = 0
                java.lang.String r14 = "FinderContactStorage.updateContact"
                r13 = r4
                r18 = r12
                r13.<init>(r14, r15, r16, r18, r19)
                r4.mo89421a()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r10 = "updateContact "
                r4.append(r10)
                java.lang.String r10 = r22.mo84193q2()
                r4.append(r10)
                r4.append(r9)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                if (r2 <= 0) goto L_0x010d
            L_0x010c:
                r6 = 1
            L_0x010d:
                if (r6 == 0) goto L_0x0117
                r2 = 4
                java.lang.String r3 = r22.getUsername()
                r1.doNotify(r5, r2, r3)
            L_0x0117:
                java.lang.String r1 = fe1.C58961d.f168674b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "replaceContact success="
                r2.append(r3)
                r2.append(r6)
                r2.append(r9)
                java.lang.String r3 = r22.getUsername()
                r2.append(r3)
                r2.append(r9)
                java.lang.String r3 = r22.mo84192p2()
                r2.append(r3)
                r2.append(r9)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
                if (r6 == 0) goto L_0x015d
                java.lang.Class<f62.k0> r1 = f62.C75700k0.class
                k40.a r1 = f40.C86709a0.m107533q(r1)
                f62.k0 r1 = (f62.C75700k0) r1
                com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
                r2 = 0
                com.tencent.mm.storage.z1 r0 = fe1.C58969q.m68863s2(r0, r2, r8, r2)
                r1.mo69726u3(r0, r8)
            L_0x015d:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fe1.C58961d.C58963b.mo84164l(fe1.q):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
            if (r4.intValue() != r7) goto L_0x0057;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo84165n(fe1.C58969q r10) {
            /*
                r9 = this;
                java.lang.String r0 = r10.getUsername()
                fe1.b r1 = r9.mo84154a()
                r1.getClass()
                java.lang.String r2 = r10.getUsername()
                fe1.q r2 = r1.mo84153a(r2)
                r3 = 0
                if (r2 != 0) goto L_0x0018
                r2 = 1
                goto L_0x0019
            L_0x0018:
                r2 = 0
            L_0x0019:
                java.util.Map<java.lang.String, fe1.q> r4 = r1.f168671a
                java.lang.Object r4 = r4.get(r0)
                fe1.q r4 = (fe1.C58969q) r4
                r5 = 0
                if (r4 == 0) goto L_0x002b
                int r4 = r4.f168732U1
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                goto L_0x002c
            L_0x002b:
                r4 = r5
            L_0x002c:
                java.util.Map<java.lang.String, fe1.q> r6 = r1.f168671a
                java.lang.Object r6 = r6.get(r0)
                fe1.q r6 = (fe1.C58969q) r6
                if (r6 == 0) goto L_0x0039
                java.lang.String r6 = r6.f168733V1
                goto L_0x003a
            L_0x0039:
                r6 = r5
            L_0x003a:
                java.util.Map<java.lang.String, fe1.q> r7 = r1.f168671a
                java.lang.Object r7 = r7.get(r0)
                fe1.q r7 = (fe1.C58969q) r7
                if (r7 == 0) goto L_0x004a
                boolean r5 = r7.f168734W1
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            L_0x004a:
                if (r2 != 0) goto L_0x0057
                int r7 = r10.field_follow_Flag
                if (r4 != 0) goto L_0x0051
                goto L_0x0057
            L_0x0051:
                int r8 = r4.intValue()
                if (r8 == r7) goto L_0x0098
            L_0x0057:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "contact is change new contact "
                r7.append(r8)
                java.lang.String r8 = r10.mo84192p2()
                r7.append(r8)
                java.lang.String r8 = " oldFlag :"
                r7.append(r8)
                r7.append(r4)
                java.lang.String r8 = " isFirstUpdate "
                r7.append(r8)
                r7.append(r2)
                r2 = 32
                r7.append(r2)
                boolean r2 = r1.f168672b
                if (r2 == 0) goto L_0x008a
                com.tencent.mm.sdk.platformtools.MMStack r2 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
                java.lang.String r2 = r2.toString()
                goto L_0x008c
            L_0x008a:
                java.lang.String r2 = ""
            L_0x008c:
                r7.append(r2)
                java.lang.String r2 = r7.toString()
                java.lang.String r7 = "Finder.Contact"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            L_0x0098:
                java.util.Map<java.lang.String, fe1.q> r2 = r1.f168671a
                java.lang.String r7 = "cacheItems"
                gy3.C87412m.m108593f(r2, r7)
                r2.put(r0, r10)
                java.util.Map<java.lang.String, fe1.q> r2 = r1.f168671a
                java.lang.Object r2 = r2.get(r0)
                fe1.q r2 = (fe1.C58969q) r2
                if (r2 != 0) goto L_0x00ad
                goto L_0x00b1
            L_0x00ad:
                int r7 = r10.field_follow_Flag
                r2.f168732U1 = r7
            L_0x00b1:
                java.util.Map<java.lang.String, fe1.q> r2 = r1.f168671a
                java.lang.Object r2 = r2.get(r0)
                fe1.q r2 = (fe1.C58969q) r2
                if (r2 != 0) goto L_0x00bc
                goto L_0x00c0
            L_0x00bc:
                java.lang.String r7 = r10.field_avatarUrl
                r2.f168733V1 = r7
            L_0x00c0:
                java.util.Map<java.lang.String, fe1.q> r1 = r1.f168671a
                java.lang.Object r1 = r1.get(r0)
                fe1.q r1 = (fe1.C58969q) r1
                if (r1 != 0) goto L_0x00cb
                goto L_0x00cd
            L_0x00cb:
                r1.f168734W1 = r3
            L_0x00cd:
                int r1 = r10.field_follow_Flag
                if (r4 != 0) goto L_0x00d2
                goto L_0x00e0
            L_0x00d2:
                int r2 = r4.intValue()
                if (r2 != r1) goto L_0x00e0
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                boolean r1 = gy3.C87412m.m108589b(r5, r1)
                if (r1 != 0) goto L_0x00f4
            L_0x00e0:
                com.tencent.mm.autogen.events.FeedContactChangeEvent r1 = new com.tencent.mm.autogen.events.FeedContactChangeEvent
                r1.<init>()
                com.tencent.mm.autogen.events.FeedContactChangeEvent$a r2 = r1.f154748d
                java.lang.String r3 = r10.getUsername()
                r2.f154749a = r3
                com.tencent.mm.autogen.events.FeedContactChangeEvent$a r2 = r1.f154748d
                r2.f154750b = r10
                r1.publish()
            L_0x00f4:
                java.lang.String r1 = r10.f168733V1
                boolean r1 = gy3.C87412m.m108589b(r6, r1)
                if (r1 != 0) goto L_0x0110
                com.tencent.mm.autogen.events.FeedContactChangeEvent r1 = new com.tencent.mm.autogen.events.FeedContactChangeEvent
                r1.<init>()
                com.tencent.mm.autogen.events.FeedContactChangeEvent$a r2 = r1.f154748d
                java.lang.String r3 = r10.getUsername()
                r2.f154749a = r3
                com.tencent.mm.autogen.events.FeedContactChangeEvent$a r2 = r1.f154748d
                r2.f154750b = r10
                r1.publish()
            L_0x0110:
                java.lang.Class<f62.k0> r10 = f62.C75700k0.class
                k40.a r10 = f40.C86709a0.m107533q(r10)
                f62.k0 r10 = (f62.C75700k0) r10
                com.tencent.mm.storage.u3 r10 = r10.mo96097Ni()
                r10.mo69653F1(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fe1.C58961d.C58963b.mo84165n(fe1.q):void");
        }

        /* renamed from: o */
        public final boolean mo84166o(C58969q qVar) {
            C87412m.m108594g(qVar, "contact");
            String str = C58961d.f168674b;
            Log.m105924i(str, "update contact " + qVar.getUsername() + ' ' + qVar.mo84192p2() + ' ' + "");
            if (!mo84160g(qVar.getUsername())) {
                return false;
            }
            mo84165n(qVar);
            if (mo84156c(qVar.getUsername()) == null) {
                return true;
            }
            C58961d.f168673a.mo84164l(qVar);
            return true;
        }
    }
}
