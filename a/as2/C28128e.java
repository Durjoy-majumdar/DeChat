package as2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.List;
import p823sg.C90193h;

/* renamed from: as2.e */
public class C28128e {

    /* renamed from: I */
    public static C28128e f77536I = null;

    /* renamed from: J */
    public static String f77537J = "";

    /* renamed from: A */
    public String f77538A = "";

    /* renamed from: B */
    public String f77539B = "";

    /* renamed from: C */
    public String f77540C = "";

    /* renamed from: D */
    public int f77541D = -1;

    /* renamed from: E */
    public String f77542E = "";

    /* renamed from: F */
    public List<List<Integer>> f77543F = new LinkedList();

    /* renamed from: G */
    public LinkedList<C28127d> f77544G;

    /* renamed from: H */
    public StringBuffer f77545H;

    /* renamed from: a */
    public long f77546a = 0;

    /* renamed from: b */
    public long f77547b = 0;

    /* renamed from: c */
    public String f77548c = "";

    /* renamed from: d */
    public int f77549d = 0;

    /* renamed from: e */
    public int f77550e = 0;

    /* renamed from: f */
    public String f77551f = "";

    /* renamed from: g */
    public long f77552g = 0;

    /* renamed from: h */
    public long f77553h = 0;

    /* renamed from: i */
    public String f77554i = "";

    /* renamed from: j */
    public long f77555j = 0;

    /* renamed from: k */
    public long f77556k = 0;

    /* renamed from: l */
    public String f77557l = "";

    /* renamed from: m */
    public String f77558m = "";

    /* renamed from: n */
    public String f77559n = "";

    /* renamed from: o */
    public String f77560o = "";

    /* renamed from: p */
    public String f77561p = "";

    /* renamed from: q */
    public String f77562q = "";

    /* renamed from: r */
    public String f77563r = "";

    /* renamed from: s */
    public String f77564s = "";

    /* renamed from: t */
    public String f77565t = "";

    /* renamed from: u */
    public String f77566u = "";

    /* renamed from: v */
    public String f77567v = "";

    /* renamed from: w */
    public String f77568w = "";

    /* renamed from: x */
    public String f77569x = "";

    /* renamed from: y */
    public String f77570y = "";

    /* renamed from: z */
    public String f77571z = "";

    public C28128e() {
        new LinkedList();
        this.f77544G = new LinkedList<>();
        this.f77545H = new StringBuffer();
    }

    /* renamed from: a */
    public static C28128e m38100a() {
        SnsMethodCalculate.markStartTimeMs("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        C86709a0.m107528h();
        if (!C86709a0.m107523b().mo121114l()) {
            C28128e eVar = new C28128e();
            SnsMethodCalculate.markEndTimeMs("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
            return eVar;
        }
        String str = null;
        if (Util.isNullOrNil((String) null)) {
            str = "";
        }
        String f = C90193h.m112878f(str.getBytes());
        if (f77536I == null || !f.equals(f77537J)) {
            Log.m105924i("MicroMsg.NewYearSnsCtrlV2", "create newYearSnsCtrl");
            f77536I = new C28128e();
            try {
                boolean isNullOrNil = Util.isNullOrNil("");
                f77536I.mo55807b(URLDecoder.decode("", "UTF-8"), false);
                f77537J = f;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.NewYearSnsCtrlV2", "createctrl error " + e.getMessage());
            }
        }
        C28128e eVar2 = f77536I;
        SnsMethodCalculate.markEndTimeMs("createNewYearSnsCtrlV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        return eVar2;
    }

    /* renamed from: c */
    public static boolean m38101c() {
        SnsMethodCalculate.markStartTimeMs("isOpenLuckyV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        C86709a0.m107528h();
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLLUCKYOPEN_BOOLEAN_SYNC, Boolean.TRUE)).booleanValue();
        SnsMethodCalculate.markEndTimeMs("isOpenLuckyV2", "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2");
        return booleanValue;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00e2, code lost:
        if (r6 >= r13) goto L_0x00e9;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55807b(java.lang.String r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "feedMsg"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r0.f77545H = r4
            java.util.LinkedList<as2.d> r4 = r0.f77544G
            r4.clear()
            java.lang.String r4 = "sysmsg"
            r5 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r4, r5)
            java.lang.String r5 = "MicroMsg.NewYearSnsCtrlV2"
            r6 = 0
            r7 = 1
            if (r4 != 0) goto L_0x0039
            if (r19 == 0) goto L_0x002c
            r4 = 60
            as2.C28125b.m38099a(r4)
        L_0x002c:
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r6] = r1
            java.lang.String r1 = "errr for paser %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0039:
            java.lang.String r1 = ".sysmsg.NewYearSNSCtrl2016.Entrance.BeginTime"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r1)
            r0.f77546a = r8
            java.lang.StringBuffer r1 = r0.f77545H
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "BeginTime:"
            r8.append(r9)
            long r9 = r0.f77546a
            r8.append(r9)
            java.lang.String r9 = ";"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r1.append(r8)
            java.lang.String r1 = ".sysmsg.NewYearSNSCtrl2016.Entrance.EndTime"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r1)
            r0.f77547b = r10
            java.lang.StringBuffer r1 = r0.f77545H
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "EndTime:"
            r8.append(r10)
            long r10 = r0.f77547b
            r8.append(r10)
            java.lang.String r10 = ";\n"
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r1.append(r8)
            java.lang.String r1 = ".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMin"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f77549d = r1
            java.lang.String r1 = ".sysmsg.NewYearSNSCtrl2016.Entrance.SvrDownReqLimitLevelMax"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f77550e = r1
            java.lang.StringBuffer r1 = r0.f77545H
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "SvrDownReqLimitLevelMin:"
            r8.append(r11)
            int r11 = r0.f77549d
            r8.append(r11)
            java.lang.String r11 = " SvrDownReqLimitLevelMax: "
            r8.append(r11)
            int r11 = r0.f77550e
            r8.append(r11)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r1.append(r8)
            r11 = 0
            if (r19 == 0) goto L_0x00e9
            long r13 = r0.f77546a
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 == 0) goto L_0x00e4
            long r6 = r0.f77547b
            int r15 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x00e4
            int r15 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00e9
        L_0x00e4:
            r6 = 62
            as2.C28125b.m38099a(r6)
        L_0x00e9:
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseBeginTime"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r6)
            r0.f77555j = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.BrowseEndTime"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r6)
            r0.f77556k = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenTitle"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ""
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77557l = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenDescription"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77558m = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenQueryTips"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77559n = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenAcceptButtonText"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77560o = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenRejectButtonText"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77561p = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenTips"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77562q = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenSuccTips"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77564s = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetOpenFailTips"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77565t = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseTips"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77563r = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseSuccTips"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77566u = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.ActionSheetCloseFailTips"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77567v = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedID"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77540C = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.MaxPostFeedCount"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            r0.f77541D = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.FullScreenID"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77542E = r6
            int r6 = r0.f77541D
            if (r6 > 0) goto L_0x01e9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r13 = "svr MaxPostFeedCount error "
            r6.append(r13)
            int r13 = r0.f77541D
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            r1 = 1
            r0.f77541D = r1
        L_0x01e9:
            java.lang.StringBuffer r6 = r0.f77545H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "FullScreenID:"
            r13.append(r14)
            java.lang.String r14 = r0.f77542E
            r13.append(r14)
            java.lang.String r14 = " BrowseBeginTime:"
            r13.append(r14)
            long r14 = r0.f77555j
            r13.append(r14)
            java.lang.String r14 = " BrowseEndTime:"
            r13.append(r14)
            long r14 = r0.f77556k
            r13.append(r14)
            java.lang.String r14 = " FullScreenTitle:"
            r13.append(r14)
            java.lang.String r14 = r0.f77557l
            r13.append(r14)
            java.lang.String r14 = " FullScreenDescription:"
            r13.append(r14)
            java.lang.String r14 = r0.f77558m
            r13.append(r14)
            java.lang.String r14 = " FullScreenQueryTips:"
            r13.append(r14)
            java.lang.String r14 = r0.f77559n
            r13.append(r14)
            java.lang.String r14 = " FullScreenAcceptButtonText: "
            r13.append(r14)
            java.lang.String r14 = r0.f77560o
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r6.append(r13)
            java.lang.StringBuffer r6 = r0.f77545H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "FullScreenRejectButtonText:"
            r13.append(r14)
            java.lang.String r14 = r0.f77561p
            r13.append(r14)
            java.lang.String r14 = " ActionSheetOpenTips:"
            r13.append(r14)
            java.lang.String r14 = r0.f77562q
            r13.append(r14)
            java.lang.String r14 = " ActionSheetOpenSuccTips:"
            r13.append(r14)
            java.lang.String r14 = r0.f77564s
            r13.append(r14)
            java.lang.String r14 = " ActionSheetOpenFailTips:"
            r13.append(r14)
            java.lang.String r14 = r0.f77565t
            r13.append(r14)
            java.lang.String r14 = " ActionSheetCloseTips:"
            r13.append(r14)
            java.lang.String r14 = r0.f77563r
            r13.append(r14)
            java.lang.String r14 = " ActionSheetCloseSuccTips: "
            r13.append(r14)
            java.lang.String r14 = r0.f77566u
            r13.append(r14)
            java.lang.String r14 = " ActionSheetCloseFailTips: "
            r13.append(r14)
            java.lang.String r14 = r0.f77567v
            r13.append(r14)
            java.lang.String r14 = "MaxPostFeedID: "
            r13.append(r14)
            java.lang.String r14 = r0.f77540C
            r13.append(r14)
            java.lang.String r14 = " MaxPostFeedCount:"
            r13.append(r14)
            int r14 = r0.f77541D
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r6.append(r13)
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForHasUsed"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77568w = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForObtainUsedRight"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77569x = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.AlertTipForClosedBrowseSwitch"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77570y = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.AlertButtonText"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77571z = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTip"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77538A = r6
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.Entrance.GoldenCameraTipID"
            java.lang.Object r6 = r4.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r7)
            r0.f77539B = r6
            java.lang.StringBuffer r6 = r0.f77545H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "AlertTipForHasUsed:"
            r13.append(r14)
            java.lang.String r14 = r0.f77568w
            r13.append(r14)
            java.lang.String r14 = " AlertTipForObtainUsedRight:"
            r13.append(r14)
            java.lang.String r14 = r0.f77569x
            r13.append(r14)
            java.lang.String r14 = " AlertTipForClosedBrowseSwitch:"
            r13.append(r14)
            java.lang.String r14 = r0.f77570y
            r13.append(r14)
            java.lang.String r14 = " AlertButtonText:"
            r13.append(r14)
            java.lang.String r14 = r0.f77571z
            r13.append(r14)
            java.lang.String r14 = " GoldenCameraTip:"
            r13.append(r14)
            java.lang.String r14 = r0.f77538A
            r13.append(r14)
            java.lang.String r14 = " GoldenCameraTipID:"
            r13.append(r14)
            java.lang.String r14 = r0.f77539B
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r6.append(r13)
            r6 = 0
        L_0x0344:
            r13 = 2
            java.lang.Object[] r14 = new java.lang.Object[r13]
            if (r6 != 0) goto L_0x034b
            r15 = r7
            goto L_0x035a
        L_0x034b:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            r15.append(r7)
            java.lang.String r15 = r15.toString()
        L_0x035a:
            r8 = 0
            r14[r8] = r15
            java.lang.String r15 = "RedPointID"
            r1 = 1
            r14[r1] = r15
            java.lang.String r15 = ".sysmsg.NewYearSNSCtrl2016.Entrance.RedPoints%s.%s"
            java.lang.String r14 = java.lang.String.format(r15, r14)
            java.lang.Object r14 = r4.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r7)
            r0.f77551f = r14
            java.lang.StringBuffer r14 = r0.f77545H
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "RedPointID:"
            r1.append(r8)
            java.lang.String r8 = r0.f77551f
            r1.append(r8)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r14.append(r1)
            java.lang.String r1 = r0.f77551f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x04f5
            java.lang.String r1 = ".sysmsg.NewYearSNSCtrl2016.Entrance.PostTips"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r7)
            r0.f77554i = r1
            java.lang.StringBuffer r1 = r0.f77545H
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "PostTips:"
            r6.append(r8)
            java.lang.String r8 = r0.f77554i
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
            java.lang.String r1 = ".sysmsg.NewYearSNSCtrl2016.Entrance.EntranceTips"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r7)
            r0.f77548c = r1
            java.lang.StringBuffer r1 = r0.f77545H
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "EntranceTips:"
            r6.append(r8)
            java.lang.String r8 = r0.f77548c
            r6.append(r8)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
            java.util.List<java.util.List<java.lang.Integer>> r1 = r0.f77543F
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.clear()
            r8 = 0
        L_0x03f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = ".sysmsg.NewYearSNSCtrl2016.AmountLevel"
            r1.append(r6)
            r1.append(r8)
            java.lang.String r11 = ".Count"
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            java.lang.StringBuffer r1 = r0.f77545H
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "count: "
            r12.append(r14)
            r12.append(r8)
            java.lang.String r14 = " | "
            r12.append(r14)
            r12.append(r11)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            r1.append(r12)
            if (r11 != 0) goto L_0x0452
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "dumpinfo "
            r1.append(r4)
            java.lang.StringBuffer r4 = r0.f77545H
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0452:
            if (r19 == 0) goto L_0x047e
            if (r8 != 0) goto L_0x045c
            r1 = 63
            as2.C28125b.m38099a(r1)
            goto L_0x047e
        L_0x045c:
            r1 = 1
            if (r8 != r1) goto L_0x0465
            r12 = 64
            as2.C28125b.m38099a(r12)
            goto L_0x047e
        L_0x0465:
            if (r8 != r13) goto L_0x046d
            r12 = 65
            as2.C28125b.m38099a(r12)
            goto L_0x047e
        L_0x046d:
            r12 = 3
            if (r8 != r12) goto L_0x0476
            r12 = 66
            as2.C28125b.m38099a(r12)
            goto L_0x047e
        L_0x0476:
            r12 = 4
            if (r8 != r12) goto L_0x047e
            r12 = 105(0x69, float:1.47E-43)
            as2.C28125b.m38099a(r12)
        L_0x047e:
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            r14 = 0
        L_0x0484:
            if (r14 >= r11) goto L_0x04e7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            r15.append(r8)
            java.lang.String r1 = ".Amount"
            r15.append(r1)
            if (r14 != 0) goto L_0x049a
            r1 = r7
            goto L_0x049e
        L_0x049a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
        L_0x049e:
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r12.add(r15)
            java.lang.StringBuffer r15 = r0.f77545H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r16 = r2
            java.lang.String r2 = "AmountLevel : "
            r13.append(r2)
            r13.append(r8)
            java.lang.String r2 = " index "
            r13.append(r2)
            r13.append(r14)
            java.lang.String r2 = " val: "
            r13.append(r2)
            r13.append(r1)
            r13.append(r9)
            java.lang.String r1 = r13.toString()
            r15.append(r1)
            int r14 = r14 + 1
            r2 = r16
            r13 = 2
            goto L_0x0484
        L_0x04e7:
            r16 = r2
            java.util.List<java.util.List<java.lang.Integer>> r1 = r0.f77543F
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r1.add(r12)
            int r8 = r8 + 1
            r13 = 2
            goto L_0x03f1
        L_0x04f5:
            r16 = r2
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            if (r6 != 0) goto L_0x04fe
            r1 = r7
            goto L_0x050d
        L_0x04fe:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
        L_0x050d:
            r8 = 0
            r2[r8] = r1
            java.lang.String r1 = "BeginTime"
            r13 = 1
            r2[r13] = r1
            java.lang.String r2 = java.lang.String.format(r15, r2)
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r2)
            r0.f77552g = r13
            java.lang.StringBuffer r2 = r0.f77545H
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "RedPointID_BeginTime:"
            r13.append(r14)
            long r11 = r0.f77552g
            r13.append(r11)
            r13.append(r9)
            java.lang.String r11 = r13.toString()
            r2.append(r11)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r6 != 0) goto L_0x0547
            r11 = r7
            goto L_0x0556
        L_0x0547:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r7)
            java.lang.String r11 = r11.toString()
        L_0x0556:
            r8 = 0
            r2[r8] = r11
            java.lang.String r11 = "EndTime"
            r1 = 1
            r2[r1] = r11
            java.lang.String r2 = java.lang.String.format(r15, r2)
            java.lang.Object r2 = r4.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r2)
            r0.f77553h = r11
            java.lang.StringBuffer r2 = r0.f77545H
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "RedPointID_EndTime:"
            r11.append(r12)
            long r12 = r0.f77553h
            r11.append(r12)
            r11.append(r10)
            java.lang.String r11 = r11.toString()
            r2.append(r11)
            if (r19 == 0) goto L_0x05a3
            long r11 = r0.f77552g
            r13 = 0
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x059d
            long r1 = r0.f77553h
            int r15 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x059d
            int r15 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x05a5
        L_0x059d:
            r1 = 61
            as2.C28125b.m38099a(r1)
            goto L_0x05a5
        L_0x05a3:
            r13 = 0
        L_0x05a5:
            as2.d r1 = new as2.d
            r1.<init>()
            java.util.LinkedList<as2.d> r2 = r0.f77544G
            r2.add(r1)
            int r6 = r6 + 1
            r11 = r13
            r2 = r16
            goto L_0x0344
        */
        throw new UnsupportedOperationException("Method not decompiled: as2.C28128e.mo55807b(java.lang.String, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bb  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55808d() {
        /*
            r12 = this;
            com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEWYEAR_2016_HONGBAO_SNS_CTRLMARKPOST_STRING_SYNC
            java.lang.String r1 = "minusPostCountV2"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.lucky.model.NewYearSnsCtrlV2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.String r3 = "getRedDotList"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.lucky.model.RedDotUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            ms2.k r5 = new ms2.k
            r5.<init>()
            f40.C86709a0.m107528h()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r7 = 0
            java.lang.Object r6 = r6.mo119685f(r0, r7)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "MicroMsg.RedDotUtil"
            java.lang.String r8 = "ISO-8859-1"
            if (r6 != 0) goto L_0x0038
            java.lang.String r6 = "load: redDotList data empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x007e
        L_0x0038:
            ms2.k r9 = new ms2.k     // Catch:{ Exception -> 0x0056 }
            r9.<init>()     // Catch:{ Exception -> 0x0056 }
            java.nio.charset.Charset r10 = java.nio.charset.Charset.forName(r8)     // Catch:{ Exception -> 0x0056 }
            byte[] r6 = r6.getBytes(r10)     // Catch:{ Exception -> 0x0056 }
            pe3.a r6 = r9.parseFrom(r6)     // Catch:{ Exception -> 0x0056 }
            ms2.k r6 = (ms2.C47099k) r6     // Catch:{ Exception -> 0x0056 }
            if (r6 != 0) goto L_0x0072
            ms2.k r5 = new ms2.k     // Catch:{ Exception -> 0x0054 }
            r5.<init>()     // Catch:{ Exception -> 0x0054 }
            r6 = r5
            goto L_0x0072
        L_0x0054:
            r5 = move-exception
            goto L_0x005a
        L_0x0056:
            r6 = move-exception
            r11 = r6
            r6 = r5
            r5 = r11
        L_0x005a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getRedDotList "
            r9.append(r10)
            java.lang.String r5 = r5.getMessage()
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r5)
        L_0x0072:
            if (r6 != 0) goto L_0x007a
            ms2.k r5 = new ms2.k
            r5.<init>()
            goto L_0x007b
        L_0x007a:
            r5 = r6
        L_0x007b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x007e:
            ms2.i r3 = r5.f126569e
            r4 = 0
            if (r3 == 0) goto L_0x008b
            java.lang.String r3 = r3.f126564d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 == 0) goto L_0x0098
        L_0x008b:
            ms2.i r3 = new ms2.i
            r3.<init>()
            r5.f126569e = r3
            java.lang.String r6 = r12.f77540C
            r3.f126564d = r6
            r3.f126565e = r4
        L_0x0098:
            ms2.i r3 = r5.f126569e
            java.lang.String r3 = r3.f126564d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x00bb
            ms2.i r3 = r5.f126569e
            java.lang.String r3 = r3.f126564d
            java.lang.String r6 = r12.f77540C
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x00bb
            ms2.i r3 = r5.f126569e
            int r6 = r3.f126565e
            int r6 = r6 + -1
            r3.f126565e = r6
            if (r6 >= 0) goto L_0x00c8
            r3.f126565e = r4
            goto L_0x00c8
        L_0x00bb:
            ms2.i r3 = new ms2.i
            r3.<init>()
            r5.f126569e = r3
            java.lang.String r6 = r12.f77540C
            r3.f126564d = r6
            r3.f126565e = r4
        L_0x00c8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "minusPostCountV2 "
            r3.append(r4)
            ms2.i r4 = r5.f126569e
            int r4 = r4.f126565e
            r3.append(r4)
            java.lang.String r4 = " postId: "
            r3.append(r4)
            java.lang.String r4 = r12.f77540C
            r3.append(r4)
            java.lang.String r4 = " "
            r3.append(r4)
            com.tencent.mm.sdk.platformtools.MMStack r4 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.NewYearSnsCtrlV2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            f40.C86709a0.m107528h()     // Catch:{ IOException -> 0x0119 }
            f40.o r3 = f40.C86709a0.m107535s()     // Catch:{ IOException -> 0x0119 }
            com.tencent.mm.storage.v1 r3 = r3.mo121142i()     // Catch:{ IOException -> 0x0119 }
            java.lang.String r6 = new java.lang.String     // Catch:{ IOException -> 0x0119 }
            byte[] r5 = r5.toByteArray()     // Catch:{ IOException -> 0x0119 }
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r8)     // Catch:{ IOException -> 0x0119 }
            r6.<init>(r5, r7)     // Catch:{ IOException -> 0x0119 }
            r3.mo119677K(r0, r6)     // Catch:{ IOException -> 0x0119 }
            goto L_0x0133
        L_0x0119:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "minusPostCountV2 save exception:"
            r3.append(r5)
            java.lang.String r0 = r0.getLocalizedMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)
        L_0x0133:
            com.tencent.mm.autogen.events.SnsCameraUpdateEvent r0 = new com.tencent.mm.autogen.events.SnsCameraUpdateEvent
            r0.<init>()
            r0.publish()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: as2.C28128e.mo55808d():void");
    }
}
