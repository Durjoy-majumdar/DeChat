package fe1;

import android.content.ContentValues;
import android.database.Cursor;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60187m5;
import java.io.IOException;
import java.util.Map;
import o40.C61926c;
import p629ny.C76979h;
import p749xh.C66257b3;
import p749xh.C66261f3;
import pe3.C47465a;
import pe3.C89349b;
import te3.C48915bw0;
import te3.C49182dr0;
import te3.C49512g4;
import te3.C49595gq0;
import te3.C49849ii0;
import te3.C49988jg1;
import te3.C50075k34;
import te3.C51103rg0;
import z04.C112550d0;

/* renamed from: fe1.q */
public final class C58969q extends C66257b3 implements C60187m5, Cloneable {

    /* renamed from: A2 */
    public static final int f168681A2 = -914110772;

    /* renamed from: B2 */
    public static final int f168682B2 = 981051588;

    /* renamed from: C2 */
    public static final int f168683C2 = -525049583;

    /* renamed from: D2 */
    public static final int f168684D2 = -2069988553;

    /* renamed from: E2 */
    public static final int f168685E2 = 1009690709;

    /* renamed from: F2 */
    public static final int f168686F2 = 1043196382;

    /* renamed from: G2 */
    public static final int f168687G2 = -1669771759;

    /* renamed from: H2 */
    public static final int f168688H2 = -896505829;

    /* renamed from: I2 */
    public static final int f168689I2 = -1220540395;

    /* renamed from: J2 */
    public static final int f168690J2 = 1683851177;

    /* renamed from: K2 */
    public static final int f168691K2 = 952905519;

    /* renamed from: L2 */
    public static final int f168692L2 = -295787145;

    /* renamed from: M2 */
    public static final int f168693M2 = 100947691;

    /* renamed from: N2 */
    public static final int f168694N2 = 339324311;

    /* renamed from: O2 */
    public static final int f168695O2 = -192250423;

    /* renamed from: P2 */
    public static final int f168696P2 = -888513882;

    /* renamed from: Q2 */
    public static final int f168697Q2 = 108705909;

    /* renamed from: R2 */
    public static final int f168698R2 = -351778248;

    /* renamed from: S2 */
    public static final int f168699S2 = 1219723417;

    /* renamed from: T2 */
    public static final int f168700T2 = -779346762;

    /* renamed from: U2 */
    public static final int f168701U2 = -1010010610;

    /* renamed from: V2 */
    public static final int f168702V2 = 733727930;

    /* renamed from: W2 */
    public static final Class<? extends C47465a>[] f168703W2;

    /* renamed from: X2 */
    public static final Map<String, Class<?>> f168704X2;

    /* renamed from: a2 */
    public static final IAutoDBItem.MAutoDBInfo f168705a2 = C66257b3.initAutoDBInfo(C58969q.class);

    /* renamed from: b2 */
    public static final int f168706b2 = 2;

    /* renamed from: c2 */
    public static final int f168707c2 = 1;

    /* renamed from: d2 */
    public static final int f168708d2 = -265713450;

    /* renamed from: e2 */
    public static final int f168709e2 = 70690926;

    /* renamed from: f2 */
    public static final int f168710f2 = -428646058;

    /* renamed from: g2 */
    public static final int f168711g2 = 351608024;

    /* renamed from: h2 */
    public static final int f168712h2 = -882710593;

    /* renamed from: i2 */
    public static final int f168713i2 = 1073584312;

    /* renamed from: j2 */
    public static final int f168714j2 = 1595250522;

    /* renamed from: k2 */
    public static final int f168715k2 = -826755845;

    /* renamed from: l2 */
    public static final int f168716l2 = -2027044322;

    /* renamed from: m2 */
    public static final int f168717m2 = -351789940;

    /* renamed from: n2 */
    public static final int f168718n2 = 293230747;

    /* renamed from: o2 */
    public static final int f168719o2 = 1431937654;

    /* renamed from: p2 */
    public static final int f168720p2 = -1306498449;

    /* renamed from: q2 */
    public static final int f168721q2 = 2137566429;

    /* renamed from: r2 */
    public static final int f168722r2 = 2137657887;

    /* renamed from: s2 */
    public static final int f168723s2 = -1306589907;

    /* renamed from: t2 */
    public static final int f168724t2 = -295931082;

    /* renamed from: u2 */
    public static final int f168725u2 = -1163811001;

    /* renamed from: v2 */
    public static final int f168726v2 = -110338125;

    /* renamed from: w2 */
    public static final int f168727w2 = 1484490136;

    /* renamed from: x2 */
    public static final int f168728x2 = 870321150;

    /* renamed from: y2 */
    public static final int f168729y2 = -886171617;

    /* renamed from: z2 */
    public static final int f168730z2 = -858047904;

    /* renamed from: T1 */
    public boolean f168731T1 = true;

    /* renamed from: U1 */
    public int f168732U1 = this.field_follow_Flag;

    /* renamed from: V1 */
    public String f168733V1 = this.field_avatarUrl;

    /* renamed from: W1 */
    public boolean f168734W1;

    /* renamed from: X1 */
    public int f168735X1;

    /* renamed from: Y1 */
    public String f168736Y1 = "";

    /* renamed from: Z1 */
    public String f168737Z1 = "";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Class<? extends pe3.a>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<te3.dr0> r0 = te3.C49182dr0.class
            java.lang.Class<com.tencent.mm.protocal.protobuf.FinderAuthInfo> r1 = com.tencent.p014mm.protocal.protobuf.FinderAuthInfo.class
            java.lang.Class<te3.ii0> r2 = te3.C49849ii0.class
            java.lang.Class<te3.jg1> r3 = te3.C49988jg1.class
            java.lang.Class<te3.k34> r4 = te3.C50075k34.class
            java.lang.Class<te3.g4> r5 = te3.C49512g4.class
            java.lang.Class<te3.gq0> r6 = te3.C49595gq0.class
            java.lang.Class<te3.rg0> r7 = te3.C51103rg0.class
            java.lang.Class<fe1.q> r8 = fe1.C58969q.class
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r8 = p749xh.C66257b3.initAutoDBInfo(r8)
            f168705a2 = r8
            r8 = 2
            f168706b2 = r8
            r9 = 1
            f168707c2 = r9
            r10 = -265713450(0xfffffffff02988d6, float:-2.0987356E29)
            f168708d2 = r10
            r10 = 70690926(0x436a86e, float:2.1471336E-36)
            f168709e2 = r10
            r10 = -428646058(0xffffffffe6736156, float:-2.8733265E23)
            f168710f2 = r10
            r10 = 351608024(0x14f51cd8, float:2.4750055E-26)
            f168711g2 = r10
            r10 = -882710593(0xffffffffcb62e7bf, float:-1.4870463E7)
            f168712h2 = r10
            r10 = 1073584312(0x3ffd98b8, float:1.9812231)
            f168713i2 = r10
            r10 = 1595250522(0x5f15975a, float:1.0779183E19)
            f168714j2 = r10
            r10 = -826755845(0xffffffffceb8b4fb, float:-1.54943424E9)
            f168715k2 = r10
            r10 = -2027044322(0xffffffff872dc21e, float:-1.3072119E-34)
            f168716l2 = r10
            r10 = -351789940(0xffffffffeb081c8c, float:-1.6454872E26)
            f168717m2 = r10
            r10 = 293230747(0x117a589b, float:1.9748826E-28)
            f168718n2 = r10
            r10 = 1431937654(0x5559a276, float:1.49557367E13)
            f168719o2 = r10
            r10 = -1306498449(0xffffffffb2206a6f, float:-9.337426E-9)
            f168720p2 = r10
            r10 = 2137566429(0x7f68acdd, float:3.0927845E38)
            f168721q2 = r10
            r10 = 2137657887(0x7f6a121f, float:3.1113344E38)
            f168722r2 = r10
            r10 = -1306589907(0xffffffffb21f052d, float:-9.256195E-9)
            f168723s2 = r10
            r10 = -295931082(0xffffffffee5c7336, float:-1.7056496E28)
            f168724t2 = r10
            r10 = -1163811001(0xffffffffbaa1a747, float:-0.0012333178)
            f168725u2 = r10
            r10 = -110338125(0xfffffffff96c5fb3, float:-7.670769E34)
            f168726v2 = r10
            r10 = 1484490136(0x587b8598, float:1.1062048E15)
            f168727w2 = r10
            r10 = 870321150(0x33e00bfe, float:1.0432994E-7)
            f168728x2 = r10
            r10 = -886171617(0xffffffffcb2e181f, float:-1.1409439E7)
            f168729y2 = r10
            r10 = -858047904(0xffffffffccdb3a60, float:-1.14938624E8)
            f168730z2 = r10
            r10 = -914110772(0xffffffffc983c6cc, float:-1079513.5)
            f168681A2 = r10
            r10 = 981051588(0x3a79a8c4, float:9.523744E-4)
            f168682B2 = r10
            r10 = -525049583(0xffffffffe0b46111, float:-1.0398151E20)
            f168683C2 = r10
            r10 = -2069988553(0xffffffff849e7b37, float:-3.7258776E-36)
            f168684D2 = r10
            r10 = 1009690709(0x3c2ea855, float:0.010660251)
            f168685E2 = r10
            r10 = 1043196382(0x3e2de9de, float:0.16983745)
            f168686F2 = r10
            r10 = -1669771759(0xffffffff9c794e11, float:-8.2488087E-22)
            f168687G2 = r10
            r10 = -896505829(0xffffffffca90681b, float:-4731917.5)
            f168688H2 = r10
            r10 = -1220540395(0xffffffffb7400815, float:-1.14459735E-5)
            f168689I2 = r10
            r10 = 1683851177(0x645d87a9, float:1.6346023E22)
            f168690J2 = r10
            r10 = 952905519(0x38cc2f2f, float:9.736267E-5)
            f168691K2 = r10
            r10 = -295787145(0xffffffffee5ea577, float:-1.7226427E28)
            f168692L2 = r10
            r10 = 100947691(0x60456eb, float:2.4890298E-35)
            f168693M2 = r10
            r10 = 339324311(0x1439ad97, float:9.374348E-27)
            f168694N2 = r10
            r10 = -192250423(0xfffffffff48a7dc9, float:-8.777932E31)
            f168695O2 = r10
            r10 = -888513882(0xffffffffcb0a5aa6, float:-9067174.0)
            f168696P2 = r10
            r10 = 108705909(0x67ab875, float:4.7155292E-35)
            f168697Q2 = r10
            r10 = -351778248(0xffffffffeb084a38, float:-1.647644E26)
            f168698R2 = r10
            r10 = 1219723417(0x48b38099, float:367620.78)
            f168699S2 = r10
            r10 = -779346762(0xffffffffd18c1cb6, float:-7.5222139E10)
            f168700T2 = r10
            r10 = -1010010610(0xffffffffc3cc760e, float:-408.9223)
            f168701U2 = r10
            r10 = 733727930(0x2bbbccba, float:1.3343972E-12)
            f168702V2 = r10
            r10 = 9
            java.lang.Class[] r11 = new java.lang.Class[r10]
            r12 = 0
            r11[r12] = r6
            r11[r9] = r7
            r11[r8] = r5
            r13 = 3
            r11[r13] = r4
            java.lang.Class<te3.bw0> r14 = te3.C48915bw0.class
            r15 = 4
            r11[r15] = r14
            r14 = 5
            r11[r14] = r3
            r16 = 6
            r11[r16] = r2
            r17 = 7
            r11[r17] = r1
            r18 = 8
            r11[r18] = r0
            f168703W2 = r11
            rx3.l[] r10 = new rx3.C13604l[r10]
            rx3.l r11 = new rx3.l
            java.lang.String r14 = "authInfo"
            r11.<init>(r14, r1)
            r10[r12] = r11
            rx3.l r1 = new rx3.l
            java.lang.String r11 = "extInfo"
            r1.<init>(r11, r2)
            r10[r9] = r1
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "originalInfo"
            r1.<init>(r2, r3)
            r10[r8] = r1
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "badgeInfoList"
            r1.<init>(r2, r7)
            r10[r13] = r1
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "settlementInfo"
            r1.<init>(r2, r4)
            r10[r15] = r1
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "agencyCollaborateInfo"
            r1.<init>(r2, r5)
            r2 = 5
            r10[r2] = r1
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "bindInfoList"
            r1.<init>(r2, r7)
            r10[r16] = r1
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "guestInfo"
            r1.<init>(r2, r6)
            r10[r17] = r1
            rx3.l r1 = new rx3.l
            java.lang.String r2 = "jumpInfoList"
            r1.<init>(r2, r0)
            r10[r18] = r1
            java.util.Map r0 = sx3.C90364q0.m113147f(r10)
            f168704X2 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fe1.C58969q.<clinit>():void");
    }

    public C58969q(String str) {
        C87412m.m108594g(str, "username");
        this.field_username = str;
    }

    /* renamed from: s2 */
    public static /* synthetic */ C72996z1 m68863s2(C58969q qVar, C72996z1 z1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z1Var = new C72996z1();
        }
        qVar.mo84194r2(z1Var);
        return z1Var;
    }

    /* renamed from: Y0 */
    public long mo84167Y0() {
        return this.field_rewardTotalAmountInWecoin;
    }

    /* renamed from: a0 */
    public long mo84168a0() {
        return this.systemRowid;
    }

    public Object clone() {
        return super.clone();
    }

    public void convertFrom(Cursor cursor) {
        try {
            super.convertFrom(cursor);
        } catch (Exception e) {
            Log.m105920e("LocalFinderContact", "convertFrom e: " + e);
            if (mo84191o2(e.getMessage())) {
                String[] columnNames = cursor != null ? cursor.getColumnNames() : null;
                if (columnNames != null) {
                    int length = columnNames.length;
                    boolean z = false;
                    for (int i = 0; i < length; i++) {
                        String str = columnNames[i];
                        int hashCode = str.hashCode();
                        if (f168708d2 == hashCode) {
                            this.field_username = cursor.getString(i);
                            this.f168736Y1 += "field_username=" + this.field_username + ' ';
                        } else if (f168709e2 == hashCode) {
                            this.field_nickname = cursor.getString(i);
                            this.f168736Y1 += "field_nickname=" + this.field_nickname + ' ';
                        } else if (f168710f2 == hashCode) {
                            this.field_avatarUrl = cursor.getString(i);
                            this.f168736Y1 += "field_avatarUrl=" + this.field_avatarUrl + ' ';
                        } else if (f168711g2 == hashCode) {
                            this.field_version = mo84189m2(cursor, i, str, ProviderConstants.API_COLNAME_FEATURE_VERSION);
                            this.f168736Y1 += "field_version=" + this.field_version + ' ';
                        } else if (f168712h2 == hashCode) {
                            this.field_firstPageMD5 = cursor.getString(i);
                            this.f168736Y1 += "field_firstPageMD5=" + this.field_firstPageMD5 + ' ';
                        } else if (f168713i2 == hashCode) {
                            this.field_signature = cursor.getString(i);
                            this.f168736Y1 += "field_signature=" + this.field_signature + ' ';
                        } else if (f168714j2 == hashCode) {
                            this.field_follow_Flag = cursor.getInt(i);
                            this.f168736Y1 += "field_follow_Flag=" + this.field_follow_Flag + ' ';
                        } else if (f168715k2 == hashCode) {
                            this.field_pyInitial = cursor.getString(i);
                            this.f168736Y1 += "field_pyInitial=" + this.field_pyInitial + ' ';
                        } else if (f168716l2 == hashCode) {
                            this.field_followTime = cursor.getInt(i);
                            this.f168736Y1 += "field_followTime=" + this.field_followTime + ' ';
                        } else if (f168717m2 == hashCode) {
                            this.field_coverImg = cursor.getString(i);
                            this.f168736Y1 += "field_coverImg=" + this.field_coverImg + ' ';
                        } else if (f168718n2 == hashCode) {
                            this.field_spamStatus = cursor.getInt(i);
                            this.f168736Y1 += "field_spamStatus=" + this.field_spamStatus + ' ';
                        } else if (f168719o2 == hashCode) {
                            try {
                                byte[] blob = cursor.getBlob(i);
                                if (blob != null && blob.length > 0) {
                                    C47465a parseFrom = new FinderAuthInfo().parseFrom(blob);
                                    C87412m.m108592e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAuthInfo");
                                    this.field_authInfo = (FinderAuthInfo) parseFrom;
                                }
                            } catch (IOException e2) {
                                Log.m105920e("LocalFinderContact", e2.getMessage());
                            }
                        } else if (f168720p2 == hashCode) {
                            try {
                                byte[] blob2 = cursor.getBlob(i);
                                if (blob2 != null && blob2.length > 0) {
                                    C47465a parseFrom2 = new C49849ii0().parseFrom(blob2);
                                    C87412m.m108592e(parseFrom2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderContactExtraInfo");
                                    this.field_extInfo = (C49849ii0) parseFrom2;
                                }
                            } catch (IOException e3) {
                                Log.m105920e("LocalFinderContact", e3.getMessage());
                            }
                        } else if (f168721q2 == hashCode) {
                            this.field_originalFlag = cursor.getInt(i);
                            this.f168736Y1 += "field_originalFlag=" + this.field_originalFlag + ' ';
                        } else if (f168698R2 == hashCode) {
                            this.field_coverUrl = cursor.getString(i);
                            this.f168736Y1 += "field_coverUrl=" + this.field_coverUrl + ' ';
                        } else if (f168699S2 == hashCode) {
                            this.field_coverEntranceFlag = cursor.getInt(i);
                            this.f168736Y1 += "field_coverEntranceFlag=" + this.field_coverEntranceFlag + ' ';
                        } else if (f168722r2 == hashCode) {
                            try {
                                byte[] blob3 = cursor.getBlob(i);
                                if (blob3 != null && blob3.length > 0) {
                                    C47465a parseFrom3 = new C49988jg1().parseFrom(blob3);
                                    C87412m.m108592e(parseFrom3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOriginalInfo");
                                    this.field_originalInfo = (C49988jg1) parseFrom3;
                                }
                            } catch (IOException e4) {
                                Log.m105920e("LocalFinderContact", e4.getMessage());
                            }
                        } else if (f168723s2 == hashCode) {
                            this.field_extFlag = cursor.getInt(i);
                            this.f168736Y1 += "field_extFlag=" + this.field_extFlag + ' ';
                        } else if (f168724t2 == hashCode) {
                            this.field_updateTime = mo84189m2(cursor, i, str, C66261f3.COL_UPDATETIME);
                            this.f168736Y1 += "field_updateTime=" + this.field_updateTime + ' ';
                        } else if (f168725u2 == hashCode) {
                            this.field_retryCount = cursor.getInt(i);
                            this.f168736Y1 += "field_retryCount=" + this.field_retryCount + ' ';
                        } else if (f168726v2 == hashCode) {
                            this.field_originalEntranceFlag = cursor.getInt(i);
                            this.f168736Y1 += "field_originalEntranceFlag=" + this.field_originalEntranceFlag + ' ';
                        } else if (f168727w2 == hashCode) {
                            this.field_liveCoverImg = cursor.getString(i);
                            this.f168736Y1 += "field_liveCoverImg=" + this.field_liveCoverImg + ' ';
                        } else if (f168728x2 == hashCode) {
                            this.field_liveStatus = cursor.getInt(i);
                            this.f168736Y1 += "field_liveStatus=" + this.field_liveStatus + ' ';
                        } else if (f168729y2 == hashCode) {
                            this.field_liveAnchorStatusFlag = mo84189m2(cursor, i, str, "liveAnchorStatusFlag");
                            this.f168736Y1 += "field_liveAnchorStatusFlag=" + this.field_liveAnchorStatusFlag + ' ';
                        } else if (f168730z2 == hashCode) {
                            this.field_friendFollowCount = cursor.getInt(i);
                            this.f168736Y1 += "field_friendFollowCount=" + this.field_friendFollowCount + ' ';
                        } else if (f168681A2 == hashCode) {
                            this.field_liveSwitchFlag = mo84189m2(cursor, i, str, "liveSwitchFlag");
                            this.f168736Y1 += "field_liveSwitchFlag=" + this.field_liveSwitchFlag + ' ';
                        } else if (f168682B2 == hashCode) {
                            this.field_liveAlias = cursor.getString(i);
                            this.f168736Y1 += "field_liveAlias=" + this.field_liveAlias + ' ';
                        } else if (f168683C2 == hashCode) {
                            this.field_rewardTotalAmountInWecoin = mo84189m2(cursor, i, str, "rewardTotalAmountInWecoin");
                            this.f168736Y1 += "field_rewardTotalAmountInWecoin=" + this.field_rewardTotalAmountInWecoin + ' ';
                        } else if (f168684D2 == hashCode) {
                            this.field_personalMsgUpdateTime = mo84189m2(cursor, i, str, "personalMsgUpdateTime");
                            this.f168736Y1 += "field_personalMsgUpdateTime=" + this.field_personalMsgUpdateTime + ' ';
                        } else if (f168685E2 == hashCode) {
                            this.field_v5username = cursor.getString(i);
                            this.f168736Y1 += "field_v5username=" + this.field_v5username + ' ';
                        } else if (f168686F2 == hashCode) {
                            this.field_vestNickname = cursor.getString(i);
                            this.f168736Y1 += "field_vestNickname=" + this.field_vestNickname + ' ';
                        } else if (f168687G2 == hashCode) {
                            this.field_feedCount = cursor.getInt(i);
                            this.f168736Y1 += "field_feedCount=" + this.field_feedCount + ' ';
                        } else if (f168688H2 == hashCode) {
                            this.field_source = cursor.getInt(i);
                            this.f168736Y1 += "field_source=" + this.field_source + ' ';
                        } else if (f168689I2 == hashCode) {
                            this.field_liveMicSetting = mo84189m2(cursor, i, str, "liveMicSetting");
                            this.f168736Y1 += "field_liveMicSetting=" + this.field_liveMicSetting + ' ';
                        } else if (f168690J2 == hashCode) {
                            this.field_liveMicSettingSwitch = mo84189m2(cursor, i, str, "liveMicSettingSwitch");
                            this.f168736Y1 += "field_liveMicSettingSwitch=" + this.field_liveMicSettingSwitch + ' ';
                        } else if (f168691K2 == hashCode) {
                            try {
                                byte[] blob4 = cursor.getBlob(i);
                                if (blob4 != null && blob4.length > 0) {
                                    C47465a parseFrom4 = new C48915bw0().parseFrom(blob4);
                                    C87412m.m108592e(parseFrom4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveBadgeInfoList");
                                    this.field_badgeInfoList = (C48915bw0) parseFrom4;
                                }
                            } catch (IOException e5) {
                                Log.m105920e("LocalFinderContact", e5.getMessage());
                            }
                        } else if (f168692L2 == hashCode) {
                            try {
                                byte[] blob5 = cursor.getBlob(i);
                                if (blob5 != null && blob5.length > 0) {
                                    C47465a parseFrom5 = new C50075k34().parseFrom(blob5);
                                    C87412m.m108592e(parseFrom5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SettleToAgencyRelateInfo");
                                    this.field_settlementInfo = (C50075k34) parseFrom5;
                                }
                            } catch (IOException e6) {
                                Log.m105920e("LocalFinderContact", e6.getMessage());
                            }
                        } else if (f168693M2 == hashCode) {
                            try {
                                byte[] blob6 = cursor.getBlob(i);
                                if (blob6 != null && blob6.length > 0) {
                                    C47465a parseFrom6 = new C49512g4().parseFrom(blob6);
                                    C87412m.m108592e(parseFrom6, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AgencyCollaborateInfo");
                                    this.field_agencyCollaborateInfo = (C49512g4) parseFrom6;
                                }
                            } catch (IOException e7) {
                                Log.m105920e("LocalFinderContact", e7.getMessage());
                            }
                        } else if (f168694N2 == hashCode) {
                            this.field_user_mode = cursor.getInt(i);
                            this.f168736Y1 += "field_user_mode=" + this.field_feedCount + ' ';
                        } else if (f168695O2 == hashCode) {
                            try {
                                byte[] blob7 = cursor.getBlob(i);
                                if (blob7 != null && blob7.length > 0) {
                                    C47465a parseFrom7 = new C51103rg0().parseFrom(blob7);
                                    C87412m.m108592e(parseFrom7, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderBindInfoList");
                                    this.field_bindInfoList = (C51103rg0) parseFrom7;
                                }
                            } catch (IOException e8) {
                                Log.m105920e("LocalFinderContact", e8.getMessage());
                            }
                        } else if (f168696P2 == hashCode) {
                            try {
                                byte[] blob8 = cursor.getBlob(i);
                                if (blob8 != null && blob8.length > 0) {
                                    C47465a parseFrom8 = new C49595gq0().parseFrom(blob8);
                                    C87412m.m108592e(parseFrom8, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGuestInfo");
                                    this.field_guestInfo = (C49595gq0) parseFrom8;
                                }
                            } catch (IOException e9) {
                                Log.m105920e("LocalFinderContact", e9.getMessage());
                            }
                        } else if (f168702V2 == hashCode) {
                            try {
                                byte[] blob9 = cursor.getBlob(i);
                                if (blob9 != null && blob9.length > 0) {
                                    C47465a parseFrom9 = new C49182dr0().parseFrom(blob9);
                                    C87412m.m108592e(parseFrom9, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpInfoList");
                                    this.field_jumpInfoList = (C49182dr0) parseFrom9;
                                }
                            } catch (IOException e15) {
                                Log.m105920e("LocalFinderContact", e15.getMessage());
                            }
                        } else if (f168700T2 == hashCode) {
                            this.field_rawNickname = cursor.getString(i);
                            this.f168736Y1 += "field_rawNickname=" + this.field_rawNickname + ' ';
                        } else if (f168701U2 == hashCode) {
                            this.field_rawAvatarUrl = cursor.getString(i);
                            this.f168736Y1 += "field_rawAvatarUrl=" + this.field_rawAvatarUrl + ' ';
                        } else if (f168697Q2 == hashCode) {
                            this.systemRowid = mo84189m2(cursor, i, str, "rowid");
                            this.f168736Y1 += "systemRowid=" + this.systemRowid + ' ';
                        }
                    }
                    if (this.f168737Z1.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        C61926c.m72656A((String) null, new C58968o(this, e, length));
                    }
                }
            }
        }
    }

    public ContentValues convertTo() {
        ContentValues convertTo = super.convertTo();
        if (convertTo.size() > 0) {
            C61926c.m72656A((String) null, new C8016p(convertTo));
        }
        return convertTo;
    }

    /* renamed from: d2 */
    public long mo84170d2() {
        return this.field_personalMsgUpdateTime;
    }

    /* renamed from: f */
    public String mo84171f() {
        return mo84196w1();
    }

    /* renamed from: g0 */
    public String mo84172g0() {
        String str = this.field_rawAvatarUrl;
        if (str == null || str.length() == 0) {
            return getAvatarUrl();
        }
        String str2 = this.field_rawAvatarUrl;
        C87412m.m108593f(str2, "field_rawAvatarUrl");
        return str2;
    }

    public String getAvatarUrl() {
        String str = this.field_avatarUrl;
        return str == null ? "" : str;
    }

    public String getCity() {
        C49849ii0 ii02 = this.field_extInfo;
        String str = ii02 != null ? ii02.f135355f : null;
        return str == null ? "" : str;
    }

    public String getCountry() {
        C49849ii0 ii02 = this.field_extInfo;
        if (ii02 == null) {
            ii02 = new C49849ii0();
        }
        String str = ii02.f135353d;
        return str == null ? "" : str;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f168705a2;
    }

    public int getFeedCount() {
        return this.field_feedCount;
    }

    public int getFollowFlag() {
        return this.field_follow_Flag;
    }

    public String getNickname() {
        String str = this.field_nickname;
        return str == null ? "" : str;
    }

    public String getProvince() {
        C49849ii0 ii02 = this.field_extInfo;
        String str = ii02 != null ? ii02.f135354e : null;
        return str == null ? "" : str;
    }

    public int getRetryCount() {
        return this.field_retryCount;
    }

    public int getSex() {
        C49849ii0 ii02 = this.field_extInfo;
        if (ii02 != null) {
            return ii02.f135356g;
        }
        return 0;
    }

    public String getSignature() {
        String str = this.field_signature;
        return str == null ? "" : str;
    }

    public long getUpdateTime() {
        return this.field_updateTime;
    }

    public String getUsername() {
        String str = this.field_username;
        return str == null ? "" : str;
    }

    public boolean isValid() {
        return this.f168731T1;
    }

    /* renamed from: k2 */
    public int mo84186k2() {
        return this.field_friendFollowCount;
    }

    /* renamed from: l2 */
    public final C58969q mo84187l2() {
        try {
            Object clone = super.clone();
            C87412m.m108592e(clone, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.api.LocalFinderContact");
            return (C58969q) clone;
        } catch (Exception e) {
            Log.m105920e("LocalFinderContact", "clone Contact error. e: " + e);
            return null;
        }
    }

    /* renamed from: m */
    public long mo84188m() {
        return this.field_interactionCount;
    }

    /* renamed from: m2 */
    public final long mo84189m2(Cursor cursor, int i, String str, String str2) {
        byte[] blob;
        boolean z;
        try {
            return cursor.getLong(i);
        } catch (Exception e) {
            if (!mo84191o2(e.getMessage()) || (blob = cursor.getBlob(i)) == null) {
                return 0;
            }
            if (!(!(blob.length == 0))) {
                return 0;
            }
            String str3 = null;
            C47465a aVar = null;
            for (Class<? extends C47465a> newInstance : f168703W2) {
                try {
                    aVar = ((C47465a) newInstance.newInstance()).parseFrom(blob);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f168737Z1);
                    sb.append("index=");
                    sb.append(i);
                    sb.append(" cursorColName=");
                    sb.append(str);
                    sb.append(" matchColName=");
                    sb.append(str2);
                    sb.append(" className=");
                    if (aVar != null) {
                        str3 = aVar.getClass().getName();
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(" byteToString=");
                    sb.append(new C89349b(blob, 0, blob.length));
                    sb.append(" \n");
                    this.f168737Z1 = sb.toString();
                    return 0;
                }
            }
            return 0;
        }
    }

    /* renamed from: n2 */
    public final boolean mo84190n2() {
        return this.field_spamStatus == 1;
    }

    /* renamed from: o2 */
    public final boolean mo84191o2(String str) {
        return !(str == null || str.length() == 0) && C112550d0.m153803w(str, "Unable to convert BLOB to long", false, 2, (Object) null);
    }

    /* renamed from: p2 */
    public final String mo84192p2() {
        return "username:" + this.field_username + " nick:" + this.field_nickname + " signature:" + this.field_signature + " version:" + this.field_version + " follow_flag:" + this.field_follow_Flag + " head:" + this.field_avatarUrl + " converImg:" + this.field_coverImg + " spam:" + this.field_spamStatus + ", originalFlag:" + this.field_originalFlag + ", liveAnchorFlag:" + this.field_liveAnchorStatusFlag + ", liveSwitchFlag:" + this.field_liveSwitchFlag;
    }

    /* renamed from: q2 */
    public final String mo84193q2() {
        return "username:" + this.field_username + " nick:" + this.field_nickname + " signature:" + this.field_signature + " version:" + this.field_version + " follow_flag:" + this.field_follow_Flag + "  converImg:" + this.field_coverImg + " spam:" + this.field_spamStatus;
    }

    /* renamed from: r2 */
    public final C72996z1 mo84194r2(C72996z1 z1Var) {
        C87412m.m108594g(z1Var, "contact");
        z1Var.mo62878U2(mo84196w1());
        z1Var.f214114V1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), mo84196w1());
        z1Var.setUsername(getUsername());
        z1Var.mo62902g4(this.field_signature);
        z1Var.f108320R1 = this.systemRowid;
        z1Var.mo62863L3((int) (this.field_updateTime / ((long) 1000)));
        z1Var.mo62865M3(getCity());
        z1Var.mo62900f4(getSex());
        z1Var.mo62892b4(getProvince());
        return z1Var;
    }

    public String toString() {
        return mo84192p2();
    }

    /* renamed from: w1 */
    public String mo84196w1() {
        String str = this.field_rawNickname;
        if (str == null || str.length() == 0) {
            return getNickname();
        }
        String str2 = this.field_rawNickname;
        C87412m.m108593f(str2, "field_rawNickname");
        return str2;
    }

    public C58969q() {
    }
}
