package p904j1;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1701i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82872p6;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.C1650c;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1821q0;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams;
import com.tencent.xweb.util.WXWebReporter;
import fm0.C86962m1;
import kk0.C88191m;
import tl0.C90509a;
import vl0.C90830d;

/* renamed from: j1.a */
public final class C108522a {

    /* renamed from: a */
    public static final long f324849a = C108527f.m147075a(4);

    /* renamed from: b */
    public static final long f324850b = C108527f.m147075a(19);

    /* renamed from: c */
    public static final long f324851c = C108527f.m147075a(20);

    /* renamed from: d */
    public static final long f324852d = C108527f.m147075a(21);

    /* renamed from: e */
    public static final long f324853e = C108527f.m147075a(22);

    /* renamed from: f */
    public static final long f324854f = C108527f.m147075a(23);

    /* renamed from: g */
    public static final long f324855g = C108527f.m147075a(61);

    /* renamed from: h */
    public static final long f324856h = C108527f.m147075a(66);

    /* renamed from: i */
    public static final long f324857i = C108527f.m147075a(111);

    /* renamed from: j */
    public static final long f324858j = C108527f.m147075a(160);

    /* renamed from: k */
    public static final /* synthetic */ int f324859k = 0;

    static {
        C108527f.m147075a(0);
        C108527f.m147075a(1);
        C108527f.m147075a(2);
        C108527f.m147075a(3);
        C108527f.m147075a(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION);
        C108527f.m147075a(260);
        C108527f.m147075a(261);
        C108527f.m147075a(262);
        C108527f.m147075a(TPReportParams.LIVE_STEP_PLAY);
        C108527f.m147075a(280);
        C108527f.m147075a(281);
        C108527f.m147075a(282);
        C108527f.m147075a(C82872p6.CTRL_INDEX);
        C108527f.m147075a(5);
        C108527f.m147075a(6);
        C108527f.m147075a(268);
        C108527f.m147075a(269);
        C108527f.m147075a(270);
        C108527f.m147075a(C90509a.C90511b.CTRL_INDEX);
        C108527f.m147075a(24);
        C108527f.m147075a(25);
        C108527f.m147075a(26);
        C108527f.m147075a(27);
        C108527f.m147075a(28);
        C108527f.m147075a(7);
        C108527f.m147075a(8);
        C108527f.m147075a(9);
        C108527f.m147075a(10);
        C108527f.m147075a(11);
        C108527f.m147075a(12);
        C108527f.m147075a(13);
        C108527f.m147075a(14);
        C108527f.m147075a(15);
        C108527f.m147075a(16);
        C108527f.m147075a(81);
        C108527f.m147075a(69);
        C108527f.m147075a(17);
        C108527f.m147075a(70);
        C108527f.m147075a(18);
        C108527f.m147075a(29);
        C108527f.m147075a(30);
        C108527f.m147075a(31);
        C108527f.m147075a(32);
        C108527f.m147075a(33);
        C108527f.m147075a(34);
        C108527f.m147075a(35);
        C108527f.m147075a(36);
        C108527f.m147075a(37);
        C108527f.m147075a(38);
        C108527f.m147075a(39);
        C108527f.m147075a(40);
        C108527f.m147075a(41);
        C108527f.m147075a(42);
        C108527f.m147075a(43);
        C108527f.m147075a(44);
        C108527f.m147075a(45);
        C108527f.m147075a(46);
        C108527f.m147075a(47);
        C108527f.m147075a(48);
        C108527f.m147075a(49);
        C108527f.m147075a(50);
        C108527f.m147075a(51);
        C108527f.m147075a(52);
        C108527f.m147075a(53);
        C108527f.m147075a(54);
        C108527f.m147075a(55);
        C108527f.m147075a(56);
        C108527f.m147075a(57);
        C108527f.m147075a(58);
        C108527f.m147075a(59);
        C108527f.m147075a(60);
        C108527f.m147075a(62);
        C108527f.m147075a(63);
        C108527f.m147075a(64);
        C108527f.m147075a(65);
        C108527f.m147075a(67);
        C108527f.m147075a(112);
        C108527f.m147075a(113);
        C108527f.m147075a(114);
        C108527f.m147075a(115);
        C108527f.m147075a(116);
        C108527f.m147075a(117);
        C108527f.m147075a(118);
        C108527f.m147075a(119);
        C108527f.m147075a(120);
        C108527f.m147075a(121);
        C108527f.m147075a(122);
        C108527f.m147075a(123);
        C108527f.m147075a(124);
        C108527f.m147075a(C1650c.CTRL_INDEX);
        C108527f.m147075a(278);
        C108527f.m147075a(279);
        C108527f.m147075a(68);
        C108527f.m147075a(71);
        C108527f.m147075a(72);
        C108527f.m147075a(76);
        C108527f.m147075a(73);
        C108527f.m147075a(74);
        C108527f.m147075a(75);
        C108527f.m147075a(77);
        C108527f.m147075a(78);
        C108527f.m147075a(79);
        C108527f.m147075a(80);
        C108527f.m147075a(82);
        C108527f.m147075a(83);
        C108527f.m147075a(84);
        C108527f.m147075a(92);
        C108527f.m147075a(93);
        C108527f.m147075a(94);
        C108527f.m147075a(95);
        C108527f.m147075a(96);
        C108527f.m147075a(97);
        C108527f.m147075a(98);
        C108527f.m147075a(99);
        C108527f.m147075a(100);
        C108527f.m147075a(101);
        C108527f.m147075a(102);
        C108527f.m147075a(103);
        C108527f.m147075a(104);
        C108527f.m147075a(105);
        C108527f.m147075a(106);
        C108527f.m147075a(107);
        C108527f.m147075a(108);
        C108527f.m147075a(109);
        C108527f.m147075a(110);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD);
        C108527f.m147075a(190);
        C108527f.m147075a(191);
        C108527f.m147075a(192);
        C108527f.m147075a(193);
        C108527f.m147075a(194);
        C108527f.m147075a(195);
        C108527f.m147075a(196);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_LOCAL_TO_OVERSEA);
        C108527f.m147075a(198);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE);
        C108527f.m147075a(200);
        C108527f.m147075a(201);
        C108527f.m147075a(202);
        C108527f.m147075a(203);
        C108527f.m147075a(125);
        C108527f.m147075a(131);
        C108527f.m147075a(132);
        C108527f.m147075a(133);
        C108527f.m147075a(134);
        C108527f.m147075a(135);
        C108527f.m147075a(136);
        C108527f.m147075a(137);
        C108527f.m147075a(138);
        C108527f.m147075a(139);
        C108527f.m147075a(140);
        C108527f.m147075a(141);
        C108527f.m147075a(TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS);
        C108527f.m147075a(TPOptionalID.f349338xc9bdf6cd);
        C108527f.m147075a(144);
        C108527f.m147075a(145);
        C108527f.m147075a(146);
        C108527f.m147075a(147);
        C108527f.m147075a(148);
        C108527f.m147075a(149);
        C108527f.m147075a(150);
        C108527f.m147075a(151);
        C108527f.m147075a(152);
        C108527f.m147075a(153);
        C108527f.m147075a(154);
        C108527f.m147075a(155);
        C108527f.m147075a(156);
        C108527f.m147075a(157);
        C108527f.m147075a(158);
        C108527f.m147075a(159);
        C108527f.m147075a(161);
        C108527f.m147075a(162);
        C108527f.m147075a(163);
        C108527f.m147075a(126);
        C108527f.m147075a(127);
        C108527f.m147075a(85);
        C108527f.m147075a(86);
        C108527f.m147075a(130);
        C108527f.m147075a(87);
        C108527f.m147075a(88);
        C108527f.m147075a(89);
        C108527f.m147075a(90);
        C108527f.m147075a(128);
        C108527f.m147075a(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS);
        C108527f.m147075a(129);
        C108527f.m147075a(226);
        C108527f.m147075a(272);
        C108527f.m147075a(C90830d.CTRL_INDEX);
        C108527f.m147075a(274);
        C108527f.m147075a(275);
        C108527f.m147075a(91);
        C108527f.m147075a(164);
        C108527f.m147075a(165);
        C108527f.m147075a(166);
        C108527f.m147075a(167);
        C108527f.m147075a(168);
        C108527f.m147075a(169);
        C108527f.m147075a(170);
        C108527f.m147075a(171);
        C108527f.m147075a(172);
        C108527f.m147075a(C88191m.CTRL_INDEX);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_X5WEBVIEW_ONSHOWCUSTOMVIEW_SPECIAL_NATIVE_VIDEO);
        C108527f.m147075a(WXWebReporter.WXWEB_GET_MMKV_FROM_CALLBACK_FAILED);
        C108527f.m147075a(WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL);
        C108527f.m147075a(WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED);
        C108527f.m147075a(WXWebReporter.WXWEB_GET_REFLECT_MMKV_INVOKE_FAILED);
        C108527f.m147075a(180);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_FAILED);
        C108527f.m147075a(204);
        C108527f.m147075a(205);
        C108527f.m147075a(206);
        C108527f.m147075a(207);
        C108527f.m147075a(208);
        C108527f.m147075a(209);
        C108527f.m147075a(210);
        C108527f.m147075a(211);
        C108527f.m147075a(212);
        C108527f.m147075a(213);
        C108527f.m147075a(JsApiCheckIsSupportFaceDetect.CTRL_INDEX);
        C108527f.m147075a(215);
        C108527f.m147075a(216);
        C108527f.m147075a(217);
        C108527f.m147075a(218);
        C108527f.m147075a(219);
        C108527f.m147075a(220);
        C108527f.m147075a(221);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_FROM_WEB);
        C108527f.m147075a(WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL);
        C108527f.m147075a(JsApiCheckIsSupportSoterAuthentication.CTRL_INDEX);
        C108527f.m147075a(225);
        C108527f.m147075a(229);
        C108527f.m147075a(230);
        C108527f.m147075a(231);
        C108527f.m147075a(232);
        C108527f.m147075a(233);
        C108527f.m147075a(234);
        C108527f.m147075a(235);
        C108527f.m147075a(236);
        C108527f.m147075a(237);
        C108527f.m147075a(WXWebReporter.WXXWEB_PRE_DOWN_ARM32_SUC);
        C108527f.m147075a(WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC);
        C108527f.m147075a(240);
        C108527f.m147075a(241);
        C108527f.m147075a(242);
        C108527f.m147075a(243);
        C108527f.m147075a(244);
        C108527f.m147075a(WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES);
        C108527f.m147075a(WXWebReporter.KEY_NEW_FAILED_CANT_FIX);
        C108527f.m147075a(247);
        C108527f.m147075a(WXWebReporter.KEY_TRY_FIX_DEX_FAILED);
        C108527f.m147075a(249);
        C108527f.m147075a(250);
        C108527f.m147075a(251);
        C108527f.m147075a(252);
        C108527f.m147075a(253);
        C108527f.m147075a(254);
        C108527f.m147075a(255);
        C108527f.m147075a(256);
        C108527f.m147075a(257);
        C108527f.m147075a(258);
        C108527f.m147075a(CdnLogic.kGroupNoticeCDNAppType);
        C108527f.m147075a(265);
        C108527f.m147075a(266);
        C108527f.m147075a(267);
        C108527f.m147075a(C86962m1.CTRL_INDEX);
        C108527f.m147075a(C1821q0.CTRL_INDEX);
        C108527f.m147075a(C1701i2.CTRL_INDEX);
        C108527f.m147075a(287);
        C108527f.m147075a(288);
    }

    /* renamed from: a */
    public static final boolean m147064a(long j, long j2) {
        return j == j2;
    }
}
