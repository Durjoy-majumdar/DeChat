package up1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import bd1.C39758f;
import bd1.C39759i;
import bl1.C28332g;
import bl1.C39780h;
import bl3.C39818r;
import com.google.android.gms.stats.netstats.NetstatsParserPatterns;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTestNumFormat;
import com.tencent.p014mm.plugin.finder.p056ui.FinderLiveNormalOccupyUI5;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.xweb.WCWebUpdater;
import com.tenpay.android.wechat.PayuSecureEncrypt;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import er1.C58741j5;
import er1.C7838m4;
import er1.C7845n4;
import f40.C86709a0;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ht1.C46112m3;
import ht1.C60200t1;
import ht1.C60216z4;
import ht1.C8795q1;
import ht1.C8808v4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import k20.C9556a;
import ke3.C88144b;
import l23.C34168k;
import lc3.C10485b;
import my3.C109647f;
import my3.C34692n;
import nj3.C76912y0;
import o40.C11348f;
import o40.C61926c;
import ob0.C89137b0;
import org.json.JSONArray;
import org.json.JSONObject;
import p156gj.C87203t;
import p565ir.C60606n;
import p682rz.C36594q;
import p707tz.C64999e;
import pe1.C35464c;
import pe1.C35469d;
import pe1.C35470e;
import pl1.C11990s0;
import qe1.C35840b;
import qo3.C77426q;
import re1.C36316a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import se1.C36665a;
import sf0.C90188n0;
import sx3.C26236u;
import sx3.C64197v;
import te1.C37016a;
import te3.C49873in1;
import te3.C50687oi1;
import te3.C51284sq2;
import te3.ly4;
import tf0.C13887q1;
import tf0.C64916p1;
import vq1.C14950a;
import wm0.C91036c;
import z04.C112550d0;
import z04.C112551y;
import zc1.C66785b;
import zo3.C16376b;

/* renamed from: up1.f */
public final class C37521f implements C35470e {

    /* renamed from: A */
    public static final int f99120A = 3;

    /* renamed from: A1 */
    public static final C35464c<Integer> f99121A1;

    /* renamed from: A2 */
    public static final C35464c<Integer> f99122A2;

    /* renamed from: A3 */
    public static final C35464c<Integer> f99123A3;

    /* renamed from: A4 */
    public static final C35464c<Integer> f99124A4;

    /* renamed from: A5 */
    public static final C35464c<Integer> f99125A5;

    /* renamed from: A6 */
    public static final C35464c<Integer> f99126A6;

    /* renamed from: A7 */
    public static final C35464c<Integer> f99127A7;

    /* renamed from: A8 */
    public static final C35464c<Integer> f99128A8;

    /* renamed from: B */
    public static int f99129B = 300000;

    /* renamed from: B1 */
    public static final C35464c<Integer> f99130B1;

    /* renamed from: B2 */
    public static final C35464c<Integer> f99131B2;

    /* renamed from: B3 */
    public static final C35464c<Long> f99132B3;

    /* renamed from: B4 */
    public static final C35464c<Integer> f99133B4;

    /* renamed from: B5 */
    public static final C35464c<Integer> f99134B5;

    /* renamed from: B6 */
    public static final C35464c<Integer> f99135B6;

    /* renamed from: B7 */
    public static final C35464c<Integer> f99136B7;

    /* renamed from: B8 */
    public static final C35464c<Integer> f99137B8;

    /* renamed from: C */
    public static final int f99138C = 45;

    /* renamed from: C1 */
    public static final C35464c<Integer> f99139C1;

    /* renamed from: C2 */
    public static final C35464c<Integer> f99140C2;

    /* renamed from: C3 */
    public static final C35464c<Integer> f99141C3;

    /* renamed from: C4 */
    public static final C35464c<Integer> f99142C4;

    /* renamed from: C5 */
    public static final C35464c<Integer> f99143C5;

    /* renamed from: C6 */
    public static final C35464c<Integer> f99144C6;

    /* renamed from: C7 */
    public static final C35464c<Integer> f99145C7;

    /* renamed from: C8 */
    public static final C35464c<Integer> f99146C8;

    /* renamed from: D */
    public static final int f99147D = 45;

    /* renamed from: D1 */
    public static final C35464c<Integer> f99148D1;

    /* renamed from: D2 */
    public static final C35464c<Integer> f99149D2;

    /* renamed from: D3 */
    public static final C35464c<Integer> f99150D3;

    /* renamed from: D4 */
    public static final C35464c<Integer> f99151D4;

    /* renamed from: D5 */
    public static final C35464c<Integer> f99152D5;

    /* renamed from: D6 */
    public static final C35464c<Integer> f99153D6;

    /* renamed from: D7 */
    public static final C35464c<Integer> f99154D7;

    /* renamed from: D8 */
    public static final C35464c<Integer> f99155D8;

    /* renamed from: E */
    public static long f99156E = -1;

    /* renamed from: E1 */
    public static final C35464c<Integer> f99157E1;

    /* renamed from: E2 */
    public static final C35464c<Integer> f99158E2;

    /* renamed from: E3 */
    public static final C35464c<Integer> f99159E3;

    /* renamed from: E4 */
    public static final C35464c<Integer> f99160E4;

    /* renamed from: E5 */
    public static final C35464c<Integer> f99161E5;

    /* renamed from: E6 */
    public static final C35464c<Integer> f99162E6;

    /* renamed from: E7 */
    public static final C35464c<Integer> f99163E7;

    /* renamed from: E8 */
    public static final C35464c<Float> f99164E8;

    /* renamed from: F */
    public static final long f99165F;

    /* renamed from: F1 */
    public static final C35464c<Integer> f99166F1;

    /* renamed from: F2 */
    public static final C35464c<Integer> f99167F2;

    /* renamed from: F3 */
    public static final C35464c<Integer> f99168F3;

    /* renamed from: F4 */
    public static final C35464c<Integer> f99169F4;

    /* renamed from: F5 */
    public static final C35464c<Integer> f99170F5;

    /* renamed from: F6 */
    public static final C35464c<Integer> f99171F6;

    /* renamed from: F7 */
    public static final C35464c<Integer> f99172F7;

    /* renamed from: F8 */
    public static final C35464c<Integer> f99173F8;

    /* renamed from: G */
    public static final C35464c<Integer> f99174G;

    /* renamed from: G1 */
    public static final C35464c<Integer> f99175G1;

    /* renamed from: G2 */
    public static final C35464c<Integer> f99176G2;

    /* renamed from: G3 */
    public static final C35464c<Integer> f99177G3;

    /* renamed from: G4 */
    public static final C36316a f99178G4 = new C36316a(false, "是否展示粉丝数", "FINDER_SHOW_FANS_COUNT");

    /* renamed from: G5 */
    public static final C35464c<Integer> f99179G5;

    /* renamed from: G6 */
    public static final C35464c<Integer> f99180G6;

    /* renamed from: G7 */
    public static final C35464c<Integer> f99181G7;

    /* renamed from: G8 */
    public static final C35464c<Integer> f99182G8;

    /* renamed from: H */
    public static final C13601g f99183H = C36568h.m40985a(C14305k2.f39852d);

    /* renamed from: H1 */
    public static final C35464c<Integer> f99184H1;

    /* renamed from: H2 */
    public static final C35464c<Integer> f99185H2;

    /* renamed from: H3 */
    public static final C35464c<Integer> f99186H3;

    /* renamed from: H4 */
    public static final C35464c<Integer> f99187H4;

    /* renamed from: H5 */
    public static final C35464c<Integer> f99188H5;

    /* renamed from: H6 */
    public static final C35464c<Integer> f99189H6;

    /* renamed from: H7 */
    public static final C35464c<Integer> f99190H7;

    /* renamed from: H8 */
    public static final C35464c<Integer> f99191H8;

    /* renamed from: I */
    public static final C13601g f99192I = C36568h.m40985a(C37535n2.f99591d);

    /* renamed from: I1 */
    public static final C35464c<Integer> f99193I1;

    /* renamed from: I2 */
    public static final C35464c<Integer> f99194I2;

    /* renamed from: I3 */
    public static final C35464c<Integer> f99195I3;

    /* renamed from: I4 */
    public static final C35464c<Integer> f99196I4;

    /* renamed from: I5 */
    public static final C35464c<Integer> f99197I5;

    /* renamed from: I6 */
    public static final C35464c<Integer> f99198I6;

    /* renamed from: I7 */
    public static C35469d f99199I7 = new C35469d("重置视频号收藏提示", C14291g0.f39838d);

    /* renamed from: I8 */
    public static final C35464c<Integer> f99200I8;

    /* renamed from: J */
    public static final C13601g f99201J = C36568h.m40985a(C37538o2.f99594d);

    /* renamed from: J1 */
    public static final C35464c<Integer> f99202J1;

    /* renamed from: J2 */
    public static final C35464c<Integer> f99203J2;

    /* renamed from: J3 */
    public static final C35464c<Integer> f99204J3;

    /* renamed from: J4 */
    public static final C35464c<Integer> f99205J4;

    /* renamed from: J5 */
    public static C35464c<Integer> f99206J5;

    /* renamed from: J6 */
    public static final C35464c<Long> f99207J6;

    /* renamed from: J7 */
    public static final C35464c<Integer> f99208J7;

    /* renamed from: J8 */
    public static final C35464c<String> f99209J8;

    /* renamed from: K */
    public static final C13601g f99210K = C36568h.m40985a(C14320r1.f39867d);

    /* renamed from: K1 */
    public static final C35464c<Integer> f99211K1;

    /* renamed from: K2 */
    public static final C35464c<Integer> f99212K2;

    /* renamed from: K3 */
    public static final C35464c<Integer> f99213K3;

    /* renamed from: K4 */
    public static final C35464c<Integer> f99214K4;

    /* renamed from: K5 */
    public static C35464c<Integer> f99215K5;

    /* renamed from: K6 */
    public static final C35464c<Integer> f99216K6;

    /* renamed from: K7 */
    public static final C35464c<Integer> f99217K7;

    /* renamed from: K8 */
    public static final C36316a f99218K8 = new C36316a(false, "通用跳转小程序是否体验版", "FINDER_JUMP_MINI_VERSION");

    /* renamed from: L */
    public static final C13601g f99219L = C36568h.m40985a(C14317q1.f39864d);

    /* renamed from: L1 */
    public static final C35464c<Integer> f99220L1;

    /* renamed from: L2 */
    public static final C35464c<Integer> f99221L2;

    /* renamed from: L3 */
    public static final C35464c<Integer> f99222L3;

    /* renamed from: L4 */
    public static final C35464c<Integer> f99223L4;

    /* renamed from: L5 */
    public static C35464c<Integer> f99224L5;

    /* renamed from: L6 */
    public static final C35464c<Integer> f99225L6;

    /* renamed from: L7 */
    public static final C35464c<Integer> f99226L7;

    /* renamed from: L8 */
    public static final C35464c<Integer> f99227L8;

    /* renamed from: M */
    public static final C35464c<Integer> f99228M;

    /* renamed from: M1 */
    public static final C35464c<Integer> f99229M1;

    /* renamed from: M2 */
    public static final C35464c<Integer> f99230M2;

    /* renamed from: M3 */
    public static final C35464c<Float> f99231M3;

    /* renamed from: M4 */
    public static final C36316a f99232M4 = new C36316a(false, "红包封面小程序是否用体验版", "FINDER_RED_PACKET_IS_Trial_Version");

    /* renamed from: M5 */
    public static C35464c<Integer> f99233M5;

    /* renamed from: M6 */
    public static final C35464c<Integer> f99234M6;

    /* renamed from: M7 */
    public static final C35464c<Integer> f99235M7;

    /* renamed from: M8 */
    public static final C35464c<Integer> f99236M8;

    /* renamed from: N */
    public static int f99237N = 1;

    /* renamed from: N1 */
    public static final C35464c<Integer> f99238N1;

    /* renamed from: N2 */
    public static final C35464c<Integer> f99239N2;

    /* renamed from: N3 */
    public static final C35464c<Integer> f99240N3;

    /* renamed from: N4 */
    public static final C35464c<Integer> f99241N4;

    /* renamed from: N5 */
    public static final C35464c<Integer> f99242N5;

    /* renamed from: N6 */
    public static final C35464c<Integer> f99243N6;

    /* renamed from: N7 */
    public static final C35464c<Integer> f99244N7;

    /* renamed from: O1 */
    public static final C35464c<Integer> f99245O1;

    /* renamed from: O2 */
    public static final C35464c<Integer> f99246O2;

    /* renamed from: O3 */
    public static final C35464c<Integer> f99247O3;

    /* renamed from: O4 */
    public static final C35464c<Integer> f99248O4;

    /* renamed from: O5 */
    public static C35464c<Integer> f99249O5;

    /* renamed from: O6 */
    public static final C35464c<Integer> f99250O6;

    /* renamed from: O7 */
    public static final C35464c<String> f99251O7;

    /* renamed from: P */
    public static int f99252P = 5;

    /* renamed from: P1 */
    public static C36316a f99253P1 = new C36316a(false, "发表feed/评论点赞固定失败", (String) null, 4, (C8480h) null);

    /* renamed from: P2 */
    public static final C35464c<Integer> f99254P2;

    /* renamed from: P3 */
    public static final C35464c<Integer> f99255P3;

    /* renamed from: P4 */
    public static final C35464c<Integer> f99256P4;

    /* renamed from: P5 */
    public static final C35464c<Integer> f99257P5;

    /* renamed from: P6 */
    public static final C35464c<Integer> f99258P6;

    /* renamed from: P7 */
    public static final C35464c<String> f99259P7;

    /* renamed from: Q */
    public static int f99260Q = 2;

    /* renamed from: Q0 */
    public static final C35464c<Integer> f99261Q0;

    /* renamed from: Q1 */
    public static final C35464c<Integer> f99262Q1;

    /* renamed from: Q2 */
    public static final C35464c<Integer> f99263Q2;

    /* renamed from: Q3 */
    public static final C35464c<Integer> f99264Q3;

    /* renamed from: Q4 */
    public static final C35464c<Integer> f99265Q4;

    /* renamed from: Q5 */
    public static final C35464c<Integer> f99266Q5;

    /* renamed from: Q6 */
    public static final C35464c<Integer> f99267Q6;

    /* renamed from: Q7 */
    public static final C35464c<String> f99268Q7;

    /* renamed from: R */
    public static final C35464c<Integer> f99269R;

    /* renamed from: R0 */
    public static final C35464c<Integer> f99270R0;

    /* renamed from: R1 */
    public static final C35464c<Integer> f99271R1;

    /* renamed from: R2 */
    public static final C35464c<Integer> f99272R2;

    /* renamed from: R3 */
    public static final C35464c<Integer> f99273R3;

    /* renamed from: R4 */
    public static final C35464c<Integer> f99274R4;

    /* renamed from: R5 */
    public static final C35464c<Integer> f99275R5;

    /* renamed from: R6 */
    public static final C35464c<Integer> f99276R6;

    /* renamed from: R7 */
    public static final C35464c<Integer> f99277R7;

    /* renamed from: S */
    public static final C35464c<Integer> f99278S;

    /* renamed from: S0 */
    public static final C35464c<Integer> f99279S0;

    /* renamed from: S1 */
    public static final C35464c<Integer> f99280S1;

    /* renamed from: S2 */
    public static final C35464c<Integer> f99281S2;

    /* renamed from: S3 */
    public static final C35464c<Integer> f99282S3;

    /* renamed from: S4 */
    public static final C35464c<Integer> f99283S4;

    /* renamed from: S5 */
    public static final C35464c<Integer> f99284S5;

    /* renamed from: S6 */
    public static final C35464c<Integer> f99285S6;

    /* renamed from: S7 */
    public static final C35464c<Integer> f99286S7;

    /* renamed from: T */
    public static final long f99287T = 2000;

    /* renamed from: T0 */
    public static final C35464c<Integer> f99288T0;

    /* renamed from: T1 */
    public static final C35464c<Integer> f99289T1;

    /* renamed from: T2 */
    public static final C35464c<Integer> f99290T2;

    /* renamed from: T3 */
    public static final C35464c<Integer> f99291T3;

    /* renamed from: T4 */
    public static final C35464c<Integer> f99292T4;

    /* renamed from: T5 */
    public static final C35464c<Integer> f99293T5;

    /* renamed from: T6 */
    public static final C35464c<Integer> f99294T6;

    /* renamed from: T7 */
    public static final C35464c<Integer> f99295T7;

    /* renamed from: U */
    public static final int f99296U = 300000;

    /* renamed from: U0 */
    public static final C35464c<Integer> f99297U0;

    /* renamed from: U1 */
    public static C36316a f99298U1 = new C36316a(false, "进入视频号Crash", (String) null, 4, (C8480h) null);

    /* renamed from: U2 */
    public static final C35464c<Integer> f99299U2;

    /* renamed from: U3 */
    public static final C35464c<Integer> f99300U3;

    /* renamed from: U4 */
    public static final C36316a f99301U4 = new C36316a(false, "强制海外用户", "FINDER_HARDCODE_OVER_SEA");

    /* renamed from: U5 */
    public static final C35464c<Integer> f99302U5;

    /* renamed from: U6 */
    public static final C36316a f99303U6 = new C36316a(false, "私信列表假插互动信息", "FINDER_PRIVATE_MSG_FAKE_INTERATIVE_SHOW_OFF");

    /* renamed from: U7 */
    public static final C35464c<Integer> f99304U7;

    /* renamed from: V */
    public static final int f99305V = 5000;

    /* renamed from: V0 */
    public static final C35464c<Integer> f99306V0;

    /* renamed from: V1 */
    public static final C36316a f99307V1 = new C36316a(false, "输出视频号DEBUG日志", "USERINFO_FINDER_DEBUG_LOG_BOOLEAN_SYNC");

    /* renamed from: V2 */
    public static final C35464c<Integer> f99308V2;

    /* renamed from: V3 */
    public static final C35464c<Integer> f99309V3;

    /* renamed from: V4 */
    public static final C35464c<Integer> f99310V4;

    /* renamed from: V5 */
    public static final C35464c<Integer> f99311V5;

    /* renamed from: V6 */
    public static final C36316a f99312V6 = new C36316a(false, "互动信息可以出现在私信非打招呼列表", "FINDER_PRIVATE_MSG_INTERATIVE_SHOW_OFF_LIMIT");

    /* renamed from: V7 */
    public static final C35464c<Integer> f99313V7;

    /* renamed from: W */
    public static final C35464c<Integer> f99314W;

    /* renamed from: W0 */
    public static final C35464c<Integer> f99315W0;

    /* renamed from: W1 */
    public static final C36316a f99316W1 = new C36316a(false, "资源清理调试模式", (String) null, 4, (C8480h) null);

    /* renamed from: W2 */
    public static final C35464c<Integer> f99317W2;

    /* renamed from: W3 */
    public static final C35464c<Integer> f99318W3;

    /* renamed from: W4 */
    public static final C35464c<Integer> f99319W4;

    /* renamed from: W5 */
    public static final C35464c<Integer> f99320W5;

    /* renamed from: W6 */
    public static final C35464c<Integer> f99321W6;

    /* renamed from: W7 */
    public static final C35464c<Integer> f99322W7;

    /* renamed from: X */
    public static final int f99323X = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_average_download_bitrate, 127);

    /* renamed from: X0 */
    public static final C35464c<Integer> f99324X0;

    /* renamed from: X1 */
    public static final C35464c<Integer> f99325X1;

    /* renamed from: X2 */
    public static final C35464c<Integer> f99326X2;

    /* renamed from: X3 */
    public static final C35464c<Integer> f99327X3;

    /* renamed from: X4 */
    public static final C35464c<Integer> f99328X4;

    /* renamed from: X5 */
    public static final C35464c<Integer> f99329X5;

    /* renamed from: X6 */
    public static final C35464c<Integer> f99330X6;

    /* renamed from: X7 */
    public static final C35464c<Integer> f99331X7;

    /* renamed from: Y */
    public static final int f99332Y = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_mp4_parse_for_finder, 0);

    /* renamed from: Y0 */
    public static final C35464c<Integer> f99333Y0;

    /* renamed from: Y1 */
    public static final C35464c<Integer> f99334Y1;

    /* renamed from: Y2 */
    public static final C35464c<Integer> f99335Y2;

    /* renamed from: Y3 */
    public static final C35464c<Integer> f99336Y3;

    /* renamed from: Y4 */
    public static final C35464c<Integer> f99337Y4;

    /* renamed from: Y5 */
    public static final C35464c<Integer> f99338Y5;

    /* renamed from: Y6 */
    public static final C35464c<Integer> f99339Y6;

    /* renamed from: Y7 */
    public static final C35464c<Integer> f99340Y7;

    /* renamed from: Z */
    public static final C109647f<Double> f99341Z = C34692n.m40450b(C34168k.f92165a.mo59471a() ? 0.75d : 0.8571428571428571d, 1.7777777777777777d);

    /* renamed from: Z0 */
    public static final C35464c<Integer> f99342Z0;

    /* renamed from: Z1 */
    public static final C35464c<Long> f99343Z1;

    /* renamed from: Z2 */
    public static final C35464c<Integer> f99344Z2;

    /* renamed from: Z3 */
    public static final C35464c<Integer> f99345Z3;

    /* renamed from: Z4 */
    public static final C35464c<Integer> f99346Z4;

    /* renamed from: Z5 */
    public static final C35464c<Integer> f99347Z5;

    /* renamed from: Z6 */
    public static final C35464c<Integer> f99348Z6;

    /* renamed from: Z7 */
    public static final C35464c<Integer> f99349Z7;

    /* renamed from: a1 */
    public static final C36316a f99350a1 = new C36316a(false, "流神器", "USERINFO_FINDER_PRELOAD_VIEW_BOOLEAN_SYNC");

    /* renamed from: a2 */
    public static final C35464c<Integer> f99351a2;

    /* renamed from: a3 */
    public static final C35464c<Integer> f99352a3;

    /* renamed from: a4 */
    public static final C35464c<Integer> f99353a4;

    /* renamed from: a5 */
    public static final C35464c<Integer> f99354a5;

    /* renamed from: a6 */
    public static final C35464c<Integer> f99355a6;

    /* renamed from: a7 */
    public static final C35464c<Integer> f99356a7;

    /* renamed from: a8 */
    public static final C35464c<Integer> f99357a8;

    /* renamed from: b1 */
    public static final C35464c<Integer> f99358b1;

    /* renamed from: b2 */
    public static List<C13604l<Integer, String>> f99359b2 = C64197v.m75537f(new C13604l(4, "liked"), new C13604l(7, "liked"), new C13604l(11, "liked"), new C13604l(12, "liked特别长的红点信息特别长的红点信息特别长的红点信息"), new C13604l(13, "liked特别长的红点信息特别长的红点信息特别长的红点信息"), new C13604l(14, "liked特别长的红点信息特别长的红点信息特别长的红点信息"), new C13604l(4, ""), new C13604l(7, ""), new C13604l(-1, ""));

    /* renamed from: b3 */
    public static final C35464c<Integer> f99360b3;

    /* renamed from: b4 */
    public static final C35464c<String> f99361b4;

    /* renamed from: b5 */
    public static final C35464c<Integer> f99362b5;

    /* renamed from: b6 */
    public static final C35464c<Integer> f99363b6;

    /* renamed from: b7 */
    public static final C35464c<Integer> f99364b7;

    /* renamed from: b8 */
    public static final C35464c<Integer> f99365b8;

    /* renamed from: c1 */
    public static final C35464c<Integer> f99366c1;

    /* renamed from: c2 */
    public static final C35464c<Integer> f99367c2;

    /* renamed from: c3 */
    public static final C35464c<Integer> f99368c3;

    /* renamed from: c4 */
    public static final C35464c<String> f99369c4;

    /* renamed from: c5 */
    public static final C35464c<Integer> f99370c5;

    /* renamed from: c6 */
    public static final C35464c<Integer> f99371c6;

    /* renamed from: c7 */
    public static final C35464c<Integer> f99372c7;

    /* renamed from: c8 */
    public static final C35464c<Integer> f99373c8;

    /* renamed from: d */
    public static final C37521f f99374d = new C37521f();

    /* renamed from: d1 */
    public static final C35464c<Integer> f99375d1;

    /* renamed from: d2 */
    public static final C35464c<Integer> f99376d2;

    /* renamed from: d3 */
    public static final C35464c<Integer> f99377d3;

    /* renamed from: d4 */
    public static final C35464c<Integer> f99378d4;

    /* renamed from: d5 */
    public static final C35464c<Integer> f99379d5;

    /* renamed from: d6 */
    public static final C35464c<Integer> f99380d6;

    /* renamed from: d7 */
    public static final C35464c<Integer> f99381d7;

    /* renamed from: d8 */
    public static final C35464c<Integer> f99382d8;

    /* renamed from: e */
    public static final int f99383e = 1048576;

    /* renamed from: e1 */
    public static final C35464c<Integer> f99384e1;

    /* renamed from: e2 */
    public static final C35464c<Integer> f99385e2;

    /* renamed from: e3 */
    public static final C35464c<Integer> f99386e3;

    /* renamed from: e4 */
    public static final C35464c<Integer> f99387e4;

    /* renamed from: e5 */
    public static final C35464c<Integer> f99388e5;

    /* renamed from: e6 */
    public static final C35464c<Integer> f99389e6;

    /* renamed from: e7 */
    public static final C35464c<Integer> f99390e7;

    /* renamed from: e8 */
    public static final C35464c<Integer> f99391e8;

    /* renamed from: f */
    public static final float f99392f = 0.38f;

    /* renamed from: f1 */
    public static final C35464c<Integer> f99393f1;

    /* renamed from: f2 */
    public static final C35464c<Integer> f99394f2;

    /* renamed from: f3 */
    public static final C35464c<Integer> f99395f3;

    /* renamed from: f4 */
    public static final C35464c<Integer> f99396f4;

    /* renamed from: f5 */
    public static final C35464c<Integer> f99397f5;

    /* renamed from: f6 */
    public static final C35464c<Integer> f99398f6;

    /* renamed from: f7 */
    public static final C35464c<Integer> f99399f7;

    /* renamed from: f8 */
    public static final C35464c<Integer> f99400f8;

    /* renamed from: g */
    public static int f99401g = 5;

    /* renamed from: g1 */
    public static final C35464c<Integer> f99402g1;

    /* renamed from: g2 */
    public static final C35464c<Integer> f99403g2;

    /* renamed from: g3 */
    public static final C35464c<Integer> f99404g3;

    /* renamed from: g4 */
    public static final C35464c<Integer> f99405g4;

    /* renamed from: g5 */
    public static final C36316a f99406g5 = new C36316a(false, "是否每次从profile私信都选择身份", "FINDER_MSG_CHOOSE_ID_EVERY_TIME");

    /* renamed from: g6 */
    public static final C35464c<Integer> f99407g6;

    /* renamed from: g7 */
    public static final C35464c<Integer> f99408g7;

    /* renamed from: g8 */
    public static final C36316a f99409g8 = new C36316a(false, "getLiveMsg不变更cookie(模拟错误case)", "FINDER_LIVE_FEED_REPORT_HARDCODE_ERRCODE");

    /* renamed from: h */
    public static int f99410h = 5;

    /* renamed from: h1 */
    public static final C35464c<Integer> f99411h1;

    /* renamed from: h2 */
    public static final C35464c<Integer> f99412h2;

    /* renamed from: h3 */
    public static final C35464c<Integer> f99413h3;

    /* renamed from: h4 */
    public static final C35464c<Integer> f99414h4;

    /* renamed from: h5 */
    public static final C35464c<Integer> f99415h5;

    /* renamed from: h6 */
    public static final C35464c<Integer> f99416h6;

    /* renamed from: h7 */
    public static final C35464c<Integer> f99417h7;

    /* renamed from: h8 */
    public static final C35464c<Integer> f99418h8;

    /* renamed from: i */
    public static final int f99419i = 40;

    /* renamed from: i1 */
    public static final C35464c<Integer> f99420i1;

    /* renamed from: i2 */
    public static final C35464c<Integer> f99421i2;

    /* renamed from: i3 */
    public static final C35464c<Integer> f99422i3;

    /* renamed from: i4 */
    public static final C35464c<Integer> f99423i4;

    /* renamed from: i5 */
    public static final C35464c<Integer> f99424i5;

    /* renamed from: i6 */
    public static final C35464c<Integer> f99425i6;

    /* renamed from: i7 */
    public static final C35464c<Integer> f99426i7;

    /* renamed from: i8 */
    public static final C35464c<Integer> f99427i8;

    /* renamed from: j */
    public static final C35464c<Integer> f99428j;

    /* renamed from: j1 */
    public static final C35464c<Integer> f99429j1;

    /* renamed from: j2 */
    public static C35464c<Integer> f99430j2;

    /* renamed from: j3 */
    public static final C35464c<Integer> f99431j3;

    /* renamed from: j4 */
    public static final C35464c<Integer> f99432j4;

    /* renamed from: j5 */
    public static final C35464c<Integer> f99433j5;

    /* renamed from: j6 */
    public static final C35464c<Integer> f99434j6;

    /* renamed from: j7 */
    public static final C35464c<Integer> f99435j7;

    /* renamed from: j8 */
    public static final C35464c<Integer> f99436j8;

    /* renamed from: k1 */
    public static final C35464c<Integer> f99437k1;

    /* renamed from: k2 */
    public static final C35464c<Integer> f99438k2;

    /* renamed from: k3 */
    public static final C35464c<Integer> f99439k3;

    /* renamed from: k4 */
    public static final C35464c<Integer> f99440k4;

    /* renamed from: k5 */
    public static final C36316a f99441k5 = new C36316a(false, "profile认证详情小程序是否打开体验版", "FINDER_AUTH_MINI_APP_TYPE");

    /* renamed from: k6 */
    public static final C35464c<Integer> f99442k6;

    /* renamed from: k7 */
    public static final C35464c<Integer> f99443k7;

    /* renamed from: k8 */
    public static final C35464c<Integer> f99444k8;

    /* renamed from: l1 */
    public static final C35464c<Integer> f99445l1;

    /* renamed from: l2 */
    public static final C35464c<Integer> f99446l2;

    /* renamed from: l3 */
    public static final C35464c<Integer> f99447l3;

    /* renamed from: l4 */
    public static final C35464c<Integer> f99448l4;

    /* renamed from: l5 */
    public static final C36316a f99449l5 = new C36316a(false, "是否可重复走'老版本session转换逻辑'", "FINDER_IGNORE_HAS_TRANS_OLD_SESSION");

    /* renamed from: l6 */
    public static final C35464c<Integer> f99450l6;

    /* renamed from: l7 */
    public static final C35464c<Integer> f99451l7;

    /* renamed from: l8 */
    public static final C35464c<Boolean> f99452l8;

    /* renamed from: m1 */
    public static final C35464c<Integer> f99453m1;

    /* renamed from: m2 */
    public static final C35464c<Integer> f99454m2;

    /* renamed from: m3 */
    public static final C35464c<Integer> f99455m3;

    /* renamed from: m4 */
    public static final C35464c<Integer> f99456m4;

    /* renamed from: m5 */
    public static C35464c<Integer> f99457m5;

    /* renamed from: m6 */
    public static final C35464c<Integer> f99458m6;

    /* renamed from: m7 */
    public static final C35464c<Integer> f99459m7;

    /* renamed from: m8 */
    public static final C36316a f99460m8 = new C36316a(false, "一键防护", "FINDER_ONE_KEY_PROTECT");

    /* renamed from: n */
    public static final C35464c<Integer> f99461n;

    /* renamed from: n1 */
    public static final C35464c<Integer> f99462n1;

    /* renamed from: n2 */
    public static final C35464c<Integer> f99463n2;

    /* renamed from: n3 */
    public static final C35464c<Integer> f99464n3;

    /* renamed from: n4 */
    public static final C35464c<Integer> f99465n4;

    /* renamed from: n5 */
    public static final C35464c<Integer> f99466n5;

    /* renamed from: n6 */
    public static final C35464c<Float> f99467n6;

    /* renamed from: n7 */
    public static final C35464c<Integer> f99468n7;

    /* renamed from: n8 */
    public static final C35464c<Integer> f99469n8;

    /* renamed from: o */
    public static final C35464c<Integer> f99470o;

    /* renamed from: o1 */
    public static final C35464c<Integer> f99471o1;

    /* renamed from: o2 */
    public static final C35464c<Integer> f99472o2;

    /* renamed from: o3 */
    public static final C35464c<Integer> f99473o3;

    /* renamed from: o4 */
    public static final C35464c<Integer> f99474o4;

    /* renamed from: o5 */
    public static final C35464c<Integer> f99475o5;

    /* renamed from: o6 */
    public static final C35464c<Integer> f99476o6;

    /* renamed from: o7 */
    public static final C35464c<Integer> f99477o7;

    /* renamed from: o8 */
    public static final C35464c<Integer> f99478o8;

    /* renamed from: p */
    public static C35464c<Long> f99479p;

    /* renamed from: p0 */
    public static final C35464c<Integer> f99480p0;

    /* renamed from: p1 */
    public static final C35464c<Integer> f99481p1;

    /* renamed from: p2 */
    public static final C35464c<Integer> f99482p2;

    /* renamed from: p3 */
    public static final C35464c<Integer> f99483p3;

    /* renamed from: p4 */
    public static final C35464c<Integer> f99484p4;

    /* renamed from: p5 */
    public static final C35464c<Integer> f99485p5;

    /* renamed from: p6 */
    public static final C35464c<Integer> f99486p6;

    /* renamed from: p7 */
    public static final C36665a f99487p7 = new C36665a(0, "转发按钮功能的新手教育开关", (C32227p) null, 4, (C8480h) null);

    /* renamed from: p8 */
    public static final C35464c<Integer> f99488p8;

    /* renamed from: q */
    public static final int f99489q = 300;

    /* renamed from: q1 */
    public static final C35464c<Integer> f99490q1;

    /* renamed from: q2 */
    public static final C35464c<Integer> f99491q2;

    /* renamed from: q3 */
    public static final C35464c<Integer> f99492q3;

    /* renamed from: q4 */
    public static final C35464c<Integer> f99493q4;

    /* renamed from: q5 */
    public static final C35464c<Integer> f99494q5;

    /* renamed from: q6 */
    public static final C35464c<Integer> f99495q6;

    /* renamed from: q7 */
    public static final C35464c<Integer> f99496q7;

    /* renamed from: q8 */
    public static final C35464c<Integer> f99497q8;

    /* renamed from: r */
    public static final C35464c<Integer> f99498r;

    /* renamed from: r1 */
    public static final C35464c<Integer> f99499r1;

    /* renamed from: r2 */
    public static final C35464c<Integer> f99500r2;

    /* renamed from: r3 */
    public static final C35464c<Integer> f99501r3;

    /* renamed from: r4 */
    public static final C35464c<Integer> f99502r4;

    /* renamed from: r5 */
    public static final C35464c<Integer> f99503r5;

    /* renamed from: r6 */
    public static final C35464c<Integer> f99504r6;

    /* renamed from: r7 */
    public static final C35464c<Integer> f99505r7;

    /* renamed from: r8 */
    public static final C35464c<Integer> f99506r8;

    /* renamed from: s */
    public static final C35464c<Integer> f99507s;

    /* renamed from: s1 */
    public static final C35464c<Integer> f99508s1;

    /* renamed from: s2 */
    public static final C35464c<Integer> f99509s2;

    /* renamed from: s3 */
    public static final C35464c<Integer> f99510s3;

    /* renamed from: s4 */
    public static final C35464c<Integer> f99511s4;

    /* renamed from: s5 */
    public static final C35464c<Integer> f99512s5;

    /* renamed from: s6 */
    public static final C35464c<Integer> f99513s6;

    /* renamed from: s7 */
    public static final C35464c<Integer> f99514s7;

    /* renamed from: s8 */
    public static final C35464c<Integer> f99515s8;

    /* renamed from: t */
    public static final int f99516t = 143360;

    /* renamed from: t1 */
    public static final C35464c<Integer> f99517t1;

    /* renamed from: t2 */
    public static final C35464c<Integer> f99518t2;

    /* renamed from: t3 */
    public static final C35464c<Integer> f99519t3;

    /* renamed from: t4 */
    public static final C35464c<Integer> f99520t4;

    /* renamed from: t5 */
    public static final C36316a f99521t5 = new C36316a(false, "担保认证人用假数据", "FINDER_AUTH_GUARANTOR_FAKE_DATE");

    /* renamed from: t6 */
    public static final C35464c<Integer> f99522t6;

    /* renamed from: t7 */
    public static final C35464c<Integer> f99523t7;

    /* renamed from: t8 */
    public static final C35464c<Integer> f99524t8;

    /* renamed from: u */
    public static int f99525u = 1080;

    /* renamed from: u1 */
    public static final C35464c<Integer> f99526u1;

    /* renamed from: u2 */
    public static final C35464c<Integer> f99527u2;

    /* renamed from: u3 */
    public static final C35464c<Integer> f99528u3;

    /* renamed from: u4 */
    public static final C35464c<Integer> f99529u4;

    /* renamed from: u5 */
    public static final C36316a f99530u5 = new C36316a(false, "微信profile页视频号认证使用假数据", "FINDER_WX_PROFILE_AUTH_FAKE_DATE");

    /* renamed from: u6 */
    public static final C35464c<Integer> f99531u6;

    /* renamed from: u7 */
    public static final C35464c<Integer> f99532u7;

    /* renamed from: u8 */
    public static final C35464c<Integer> f99533u8;

    /* renamed from: v */
    public static int f99534v = 1080;

    /* renamed from: v1 */
    public static final C35464c<Integer> f99535v1;

    /* renamed from: v2 */
    public static final C35464c<Integer> f99536v2;

    /* renamed from: v3 */
    public static final C35464c<Integer> f99537v3;

    /* renamed from: v4 */
    public static final C35464c<Integer> f99538v4;

    /* renamed from: v5 */
    public static final C35464c<Integer> f99539v5;

    /* renamed from: v6 */
    public static final C35464c<Integer> f99540v6;

    /* renamed from: v7 */
    public static final C35464c<Integer> f99541v7;

    /* renamed from: v8 */
    public static final C35464c<Integer> f99542v8;

    /* renamed from: w */
    public static final C35464c<Integer> f99543w;

    /* renamed from: w1 */
    public static final C35464c<Integer> f99544w1;

    /* renamed from: w2 */
    public static final C35464c<Integer> f99545w2;

    /* renamed from: w3 */
    public static final C35464c<Integer> f99546w3;

    /* renamed from: w4 */
    public static final C35464c<Boolean> f99547w4;

    /* renamed from: w5 */
    public static final C36316a f99548w5 = new C36316a(false, "直播间进入广告前，删掉uxinfo", "FINDER_LIVE_DEL_OUTHER_UXINFO_WHEN_ENDER_AS");

    /* renamed from: w6 */
    public static final C35464c<Long> f99549w6;

    /* renamed from: w7 */
    public static final C35464c<Integer> f99550w7;

    /* renamed from: w8 */
    public static final C35464c<Integer> f99551w8;

    /* renamed from: x */
    public static final C35464c<Integer> f99552x;

    /* renamed from: x0 */
    public static final C35464c<Integer> f99553x0;

    /* renamed from: x1 */
    public static final C35464c<Integer> f99554x1;

    /* renamed from: x2 */
    public static final C35464c<Integer> f99555x2;

    /* renamed from: x3 */
    public static final C35464c<Integer> f99556x3;

    /* renamed from: x4 */
    public static final C35464c<Boolean> f99557x4;

    /* renamed from: x5 */
    public static final C35464c<Integer> f99558x5;

    /* renamed from: x6 */
    public static final C35464c<Integer> f99559x6;

    /* renamed from: x7 */
    public static final C35464c<Integer> f99560x7;

    /* renamed from: x8 */
    public static final C35464c<Integer> f99561x8;

    /* renamed from: y */
    public static final C35464c<Integer> f99562y;

    /* renamed from: y0 */
    public static final C35464c<Integer> f99563y0;

    /* renamed from: y1 */
    public static final C35469d f99564y1 = new C35469d("春晚通用弹窗提醒重置", C14278b2.f39825d);

    /* renamed from: y2 */
    public static final C35464c<Integer> f99565y2;

    /* renamed from: y3 */
    public static final C35464c<Long> f99566y3;

    /* renamed from: y4 */
    public static final C35464c<Boolean> f99567y4;

    /* renamed from: y5 */
    public static final C35464c<Integer> f99568y5;

    /* renamed from: y6 */
    public static final C35464c<Integer> f99569y6;

    /* renamed from: y7 */
    public static final C35464c<Integer> f99570y7;

    /* renamed from: y8 */
    public static final C35464c<Integer> f99571y8;

    /* renamed from: z */
    public static final C35464c<Integer> f99572z;

    /* renamed from: z1 */
    public static final C35464c<Integer> f99573z1;

    /* renamed from: z2 */
    public static final C35464c<Integer> f99574z2;

    /* renamed from: z3 */
    public static final C35464c<Integer> f99575z3;

    /* renamed from: z4 */
    public static final C35464c<Integer> f99576z4;

    /* renamed from: z5 */
    public static final C35464c<Integer> f99577z5;

    /* renamed from: z6 */
    public static final C35464c<Integer> f99578z6;

    /* renamed from: z7 */
    public static final C35464c<Integer> f99579z7;

    /* renamed from: z8 */
    public static final C35464c<Integer> f99580z8;

    /* renamed from: up1.f$a1 */
    public static final class C14275a1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14275a1 f39822d = new C14275a1();

        public C14275a1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USREINFO_FINDER_TEENS_GUIDE_TIPS_LASTIME_LONG_SYNC, 1L);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$b0 */
    public static final class C14276b0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14276b0 f39823d = new C14276b0();

        public C14276b0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_CLICK_DESC_TIPS_CNT_INT_SYNC, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$b1 */
    public static final class C14277b1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14277b1 f39824d = new C14277b1();

        public C14277b1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C66785b bVar = C66785b.f191882e;
            C39758f fVar = new C39758f();
            if (fVar.mo62397b().f140473q == null) {
                fVar.mo62397b().f140473q = new C49873in1();
            }
            C49873in1 in12 = fVar.mo62397b().f140473q;
            if (in12 != null) {
                in12.f135519e = 10;
            }
            C49873in1 in13 = fVar.mo62397b().f140473q;
            if (in13 != null) {
                in13.f135520f = 7;
            }
            bVar.mo90665S0(fVar, C39759i.FINDER_CONFIG);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$b2 */
    public static final class C14278b2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14278b2 f39825d = new C14278b2();

        public C14278b2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13308GZ();
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$c */
    public static final class C14279c extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14279c f39826d = new C14279c();

        public C14279c() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_ENTER_MULTI_TAB_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$c0 */
    public static final class C14280c0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14280c0 f39827d = new C14280c0();

        public C14280c0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, Boolean.FALSE);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$c1 */
    public static final class C14281c1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14281c1 f39828d = new C14281c1();

        public C14281c1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SET_TEXT_STATUS_TIPS_INT, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC, 0L);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$c2 */
    public static final class C14282c2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14282c2 f39829d = new C14282c2();

        public C14282c2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11864C1();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$d */
    public static final class C14283d extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14283d f39830d = new C14283d();

        public C14283d() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SIMILAR_TIPS_SHOWN_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$d0 */
    public static final class C14284d0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14284d0 f39831d = new C14284d0();

        public C14284d0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FULL_LIKE_FEED_GUIDE_INT, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$d1 */
    public static final class C14285d1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14285d1 f39832d = new C14285d1();

        public C14285d1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SHOW_SELF_FEED_LIKE_TIPS_TIMES_INT, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$e0 */
    public static final class C14286e0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14286e0 f39833d = new C14286e0();

        public C14286e0() {
            super(1);
        }

        public Object invoke(Object obj) {
            int size;
            Activity activity = (Activity) obj;
            Context context = MMApplicationContext.getContext();
            StringBuilder sb = new StringBuilder();
            sb.append("当前funcMsg的callback数量:");
            C89137b0 d = C86709a0.m107524d();
            synchronized (d.f256813h) {
                size = ((Set) ((HashMap) d.f256813h).get(825)).size();
            }
            sb.append(size);
            C76912y0.makeText(context, (CharSequence) sb.toString(), 1).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$e1 */
    public static final class C14287e1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14287e1 f39834d = new C14287e1();

        public C14287e1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_STAR_RECOMMEND_TIPS_SHOW_COUNT_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$f */
    public static final class C14288f extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14288f f39835d = new C14288f();

        public C14288f() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_REDDOT_DELETE_DUP_VERSION_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$f0 */
    public static final class C14289f0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14289f0 f39836d = new C14289f0();

        public C14289f0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            MultiProcessMMKV.getDefault().putBoolean("MMKVFinderLiveAllowanceGiftCardViewCallbackAnchor", false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$g */
    public static final class C14290g extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14290g f39837d = new C14290g();

        public C14290g() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SWITCH_SCENE_TIP_INT_SYNC, 3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$g0 */
    public static final class C14291g0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14291g0 f39838d = new C14291g0();

        public C14291g0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FAV_TIPS_BOOLEAN_SYNC, Boolean.TRUE);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_COMMENT_CHANGE_SCENE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$g1 */
    public static final class C14292g1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14292g1 f39839d = new C14292g1();

        public C14292g1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "已重置", 0).show();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_STAR_GUIDE_TIPS_COUNT_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_STAR_GUIDE_DIALOG_SHOW_COUNT_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_STAR_GUIDE_TIPS_LAST_SHOW_TIME_LONG_SYNC, 0L);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$h */
    public static final class C14293h extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14293h f39840d = new C14293h();

        public C14293h() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SWITCH_SCENE_TIP_INT_SYNC, 4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$h0 */
    public static final class C14294h0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14294h0 f39841d = new C14294h0();

        public C14294h0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            ((C60606n) C86312j.m106911c(C60606n.class)).pj0(context, "{\n    \"extInfo\": {\n        \"tag\": {\n            \"id\": 3, \n            \"name\": \"日常生活\", \n            \"showPrimaryTag\":0,\n            \"needPoi\":0,\n            \"subtag\": {\n                \"id\": 300001, \n                \"name\": \"日常聊天\",\n                \"showPrimaryTag\":0,\n                \"needPoi\":0\n            }\n        }\n    }\n}");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$h2 */
    public static final class C14295h2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14295h2 f39842d = new C14295h2();

        public C14295h2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WXPROFILE_ENTRY_EDU2_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$i1 */
    public static final class C14296i1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14296i1 f39843d = new C14296i1();

        public C14296i1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Intent intent = new Intent();
            intent.addFlags(268435456);
            int i = FinderLiveNormalOccupyUI5.f52501G;
            intent.setClass(MMApplicationContext.getContext(), FinderLiveNormalOccupyUI5.class);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfig$FINDER_TEST_PAGLOADER$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/storage/FinderConfig$FINDER_TEST_PAGLOADER$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$i2 */
    public static final class C14297i2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14297i2 f39844d = new C14297i2();

        public C14297i2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C72996z1.f214112X1 = 0;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$j */
    public static final class C14298j extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14298j f39845d = new C14298j();

        public C14298j() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_TEST_FAKE_LOADING_TOAST_BOOLEAN;
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.valueOf(!i.mo119686g(aVar, false)));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$j0 */
    public static final class C14299j0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14299j0 f39846d = new C14299j0();

        public C14299j0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Intent intent = new Intent();
            intent.addFlags(268435456);
            int i = FinderTestNumFormat.f14837x;
            intent.putExtra("SCENE_TEST_PAGE", 2);
            intent.setClass(MMApplicationContext.getContext(), FinderTestNumFormat.class);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfig$FINDER_LIVE_COMMENT_CONFIG_PAGE$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/storage/FinderConfig$FINDER_LIVE_COMMENT_CONFIG_PAGE$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$j1 */
    public static final class C14300j1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14300j1 f39847d = new C14300j1();

        public C14300j1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C58739j4.f168176a.getClass();
            Class cls = C64916p1.class;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_OLD_SESSION_HAS_TRANS_V2_BOOLEAN_SYNC;
            boolean g = i.mo119686g(aVar, false);
            C37521f.f99374d.getClass();
            boolean booleanValue = ((Boolean) C37521f.f99449l5.mo60266n()).booleanValue();
            String str = C58739j4.f168177b;
            Log.m105924i(str, "[checkOldSessionInfo] hasTrans:" + g + " , ignoreHasTrans:" + booleanValue);
            if (!g || booleanValue) {
                Log.m105924i(str, "[checkOldSessionInfo] begin");
                long uptimeMillis = SystemClock.uptimeMillis();
                C8477a0 a0Var = new C8477a0();
                a0Var.f27482d = ((C64916p1) C86312j.m106911c(cls)).mo76667Js();
                C8477a0 a0Var2 = new C8477a0();
                a0Var2.f27482d = ((C64916p1) C86312j.m106911c(cls)).m40();
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                Log.m105924i(str, "[checkOldSessionInfo] end,duration = " + uptimeMillis2);
                C59319a aVar2 = C59319a.f169618b;
                C11348f.C11349a.m11177a(aVar2, "transOldFinderMsgSessionInfo", uptimeMillis2 > 10000, (C11348f.C11352b) null, false, false, new C7838m4(uptimeMillis2), 28, (Object) null);
                C11348f.C11349a.m11178b(aVar2, "transOldFinderMsgSessionInfo-result", a0Var.f27482d && a0Var2.f27482d, (C11348f.C11352b) null, false, false, new C7845n4(a0Var, a0Var2), 28, (Object) null);
                if (a0Var.f27482d && a0Var2.f27482d) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Boolean.TRUE);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$j2 */
    public static final class C14301j2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14301j2 f39848d = new C14301j2();

        public C14301j2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().mo83763J5(MMApplicationContext.getContext(), new JSONObject("{\"feedId\":\"flink/SzFfAgtgekIEAQAAAAAAQ5ErEA-4ygAAAAstQy6ubaLX4KHWvLEZgBPT4dNy3HdyQY-LE2htOuTan5wuvbRkvrYnujlFw7Ccz0aDOwk\",\"nonceId\":\"6140686172389244399\",\"finderUserName\":\"v2_060000231003b20faec8c7e28d1ecad2c900ea34b077192ae8bad1b4f00e998bfc98c5f05d66@finder\",\"expReportLink\":\"http://ad.wx.com:12638/cgi-bin/exposure?viewid=AQNGRakpAuaxCtEX94wJ9PoKD0R7yrN5m6Q3Tr%2BdToYbHL4b2cKBmH6igA9w%2BbM9F9ra2ldWMM1vSR2miLnbolDYd9PbR%2BpibjlAbIfAnRu3TD%2Ba%2FJIl3LsP3C%2FqPG2eOyjvmlKtnhr8mQMbmqMj7uQqPc5s8e8%2BOa1V9MxTHtl9t5%2B%2Bx%2F0%2FeGFuXqSNoM7i4wjUUpNfBL2xJOP9AsSFbs0pagRepxrnQQ71Klo4dfm4hv0jJyrluTxaYkeo%2BashIWsVHdYFZvNZsBwdNagkiYST74VJUVe4o%2FsTXqonxU68%2BzTn1xESH0g1s4nvJm4AcOlIPGXuvHl4mNbLdth84CBKJ2kQwufyzCa7KWSm1t8f3G0OInY%2B5LRjAfQ%2FiYhV%2FsicjnLeE7kH0wloCP9eFZ3vDQh31T7l9yl4Gday3JAjzSOD1PxZ5Oe4t7XSlPhEKWkT1WeJf7ZZgqPBX%2BNd9c4EK855dKMtIFkEK2awWQlvJDbLBOpWvWFRY4x87lNRJIDyeYdMWsyQYtbjkgu6jI%2FEBwC4KiEtYjENOxxwF5vLqSiODTb93qJA6ywmaXxKJdx29NLEqKkzC9pPTkVbiIQe0DdTecl8Vjqd7zWcqn1YT5RSE0hk5T0Xil1MsUptO5tJJYoNHrfDsLvnO5sJkEFdXeoF5SdZm2eg08u%2BdAmN0UTnZLnJVcCZPeEIGlXajzKijebobfdDuiZDoJR4nALMMxxt74QrXPtguvmQP2pyxRWHg5l9trgQML7tD6V7jeTkD3Cyx8UCwUdLxgE4KyoC0aTrUegFhaLXNV5Fa2rKfCS1QjB1bJgE%2Bin3wkdwAMRDT83wUNthwQqVwZrFba8Ob2zdwZzXrU7InUInoeYtwv8mX1rKYTyMyhvlG20eF1zN6iXb%2B2bPnuE68SoDq7Fl1%2FbYXaEphD2D0mTmMu42Hz46GcFiJZY%2FDEOAHMYNobdRJfmAt6tZFjz61CdBBoHTQSnE2gpoEbYrTMJPrTSN7Ik3sa0QjMFGiVK%2BiEMlNlcwHf7f34uVie7K6zCx%2F5KZotDZt9xBzDfMp3hAXCAmqnQzwwzHPUlOzMKEvTc3k9oC5rMcIWqz%2FlZ6VZO%2Bd4elaGbGWywU6YNyA%2BjdgL8FOxnVnzdaaiVa1i0pI5s7qQ6bgsrI5bUE%2B1b3YluxXhteOWnOsnlKOcW5Sd%2BLYWPDHqq9U71fOZcQdSOWU3jw8RIEDP4HGFeHERWLZpkU1Oe%2FhYdlXUWjG5LpeToKZyP5GlXnlFdskhHqnzDVdRFFry737nEh3AeM%2F9seIoVIbiiLxUrOOeFiQyO%2FEvZer5V8Bs0cV5IQ9wEsND95VFMN%2FH0On0Q1ItgQ5wMikfDbyrD4XnaIYIWeDM77HZ%2BedRaeJldhenUsm3v3EPTUShIvcDL8euEXVyADA2y7JDyXICbSbJpNC7oKsDLrpHnGNztPoe4PtfxqLzR8sGZrwMnbNIfH%2BfrCs5bWJRl%2BOhzuPmpvp68luEw2N1vKes2dpOlE0ah7l%2BWMJdBGZaw3ieGj3u2Vjsx6Z91hLG7D4NkRUkgahKoPI4e7bgsODQetG%2BTkmD7y19vJVAnlfP8gEmYJiRQTUu4a2o0SCSqbUc4CAdaWgSHdAk76w2NJgUqj13sg3TBWGsvAU1%2B8wyBSXxLq417DVxs8L4lyK1YN2R3fjMGQFdSglo9fv%2BBztv%2FOEdk79nFJc5Snh7aL29ODNvJG6oq13CqAq3JgZyuzesJQF4w8KMakfVnoHZJkdq0Wyulqcs1tOc84zSLCdXMdB%2B0jRZqgl4QoclgiBdCk7v9tajJzVt%2B9%2BS7NgsijGMDRdIOT85j011sPS%2BzNC4KvEbbnrPiESnNL9ZT4vlR2qHR8NgCwuPZbRwmLekkoqvPoDoyA5EO%2B2wJ%2FIy5Xh%2FuZRJHu54andI9%2F6h5XsgWkDgjWtDKhZakYXcUs2K%2BCeweAqO%2FaQ%2FPsZk2%2FcwFO8%2FBXnBK14mayDyiYBrbyxGDj4gh4%2FLRMCHbubdqJsEOBedB0dIdpFU%2FttJKhoYv8GiL5oU1XKODyBHYb2pJ654OZmHHp0DJlh418x5fNVEopFIlNqgZxfyIu1FOFmssjIMHnaCcA7xZKdgDAGdY9pOxeaXyVhw7IRqLTQaiDMddSDln%2F4B0y5dtELOzb8bHnJIaJTM2PzvUSCkHZHJpY0rIbPQiDCP9PJdTrvbbkIHYjWENmqB3p%2FBBsiWVUOmyfYiC7zeCQMP3Mv0V4uY9Nh3VIrMS7jjZGl8ruS3offUZKs%2BPrlVDZdbwSy6JTI%2BjrUWtN%2BGqNhnIk9RfwVyOPKOrtVVgX%2FWRx%2F5tYxlEXV2XS1jzYPXQO9KJbhYuAROqwHr7I65puIRzeOHz6XphMLd1UbuqIrGDNzw%2F0aGCsh1KOlXzJ\",\"clkReportLink\":\"http://ad.wx.com:12638/cgi-bin/click?viewid=AQNGRakpAuaxCtEX94wJ9PoKD0R7yrN5m6Q3Tr%2BdToYbHL4b2cKBmH6igA9w%2BbM9F9ra2ldWMM1vSR2miLnbolDYd9PbR%2BpibjlAbIfAnRu3TD%2Ba%2FJIl3LsP3C%2FqPG2eOyjvmlKtnhr8mQMbmqMj7uQqPc5s8e8%2BOa1V9MxTHtl9t5%2B%2Bx%2F0%2FeGFuXqSNoM7i4wjUUpNfBL2xJOP9AsSFbs0pagRepxrnQQ71Klo4dfm4hv0jJyrluTxaYkeo%2BashIWsVHdYFZvNZsBwdNagkiYST74VJUVe4o%2FsTXqonxU68%2BzTn1xESH0g1s4nvJm4AcOlIPGXuvHl4mNbLdth84CBKJ2kQwufyzCa7KWSm1t8f3G0OInY%2B5LRjAfQ%2FiYhV%2FsicjnLeE7kH0wloCP9eFZ3vDQh31T7l9yl4Gday3JAjzSOD1PxZ5Oe4t7XSlPhEKWkT1WeJf7ZZgqPBX%2BNd9c4EK855dKMtIFkEK2awWQlvJDbLBOpWvWFRY4x87lNRJIDyeYdMWsyQYtbjkgu6jI%2FEBwC4KiEtYjENOxxwF5vLqSiODTb93qJA6ywmaXxKJdx29NLEqKkzC9pPTkVbiIQe0DdTecl8Vjqd7zWcqn1YT5RSE0hk5T0Xil1MsUptO5tJJYoNHrfDsLvnO5sJkEFdXeoF5SdZm2eg08u%2BdAmN0UTnZLnJVcCZPeEIGlXajzKijebobfdDuiZDoJR4nALMMxxt74QrXPtguvmQP2pyxRWHg5l9trgQML7tD6V7jeTkD3Cyx8UCwUdLxgE4KyoC0aTrUegFhaLXNV5Fa2rKfCS1QjB1bJgE%2Bin3wkdwAMRDT83wUNthwQqVwZrFba8Ob2zdwZzXrU7InUInoeYtwv8mX1rKYTyMyhvlG20eF1zN6iXb%2B2bPnuE68SoDq7Fl1%2FbYXaEphD2D0mTmMu42Hz46GcFiJZY%2FDEOAHMYNobdRJfmAt6tZFjz61CdBBoHTQSnE2gpoEbYrTMJPrTSN7Ik3sa0QjMFGiVK%2BiEMlNlcwHf7f34uVie7K6zCx%2F5KZotDZt9xBzDfMp3hAXCAmqnQzwwzHPUlOzMKEvTc3k9oC5rMcIWqz%2FlZ6VZO%2Bd4elaGbGWywU6YNyA%2BjdgL8FOxnVnzdaaiVa1i0pI5s7qQ6bgsrI5bUE%2B1b3YluxXhteOWnOsnlKOcW5Sd%2BLYWPDHqq9U71fOZcQdSOWU3jw8RIEDP4HGFeHERWLZpkU1Oe%2FhYdlXUWjG5LpeToKZyP5GlXnlFdskhHqnzDVdRFFry737nEh3AeM%2F9seIoVIbiiLxUrOOeFiQyO%2FEvZer5V8Bs0cV5IQ9wEsND95VFMN%2FH0On0Q1ItgQ5wMikfDbyrD4XnaIYIWeDM77HZ%2BedRaeJldhenUsm3v3EPTUShIvcDL8euEXVyADA2y7JDyXICbSbJpNC7oKsDLrpHnGNztPoe4PtfxqLzR8sGZrwMnbNIfH%2BfrCs5bWJRl%2BOhzuPmpvp68luEw2N1vKes2dpOlE0ah7l%2BWMJdBGZaw3ieGj3u2Vjsx6Z91hLG7D4NkRUkgahKoPI4e7bgsODQetG%2BTkmD7y19vJVAnlfP8gEmYJiRQTUu4a2o0SCSqbUc4CAdaWgSHdAk76w2NJgUqj13sg3TBWGsvAU1%2B8wyBSXxLq417DVxs8L4lyK1YN2R3fjMGQFdSglo9fv%2BBztv%2FOEdk79nFJc5Snh7aL29ODNvJG6oq13CqAq3JgZyuzesJQF4w8KMakfVnoHZJkdq0Wyulqcs1tOc84zSLCdXMdB%2B0jRZqgl4QoclgiBdCk7v9tajJzVt%2B9%2BS7NgsijGMDRdIOT85j011sPS%2BzNC4KvEbbnrPiESnNL9ZT4vlR2qHR8NgCwuPZbRwmLekkoqvPoDoyA5EO%2B2wJ%2FIy5Xh%2FuZRJHu54andI9%2F6h5XsgWkDgjWtDKhZakYXcUs2K%2BCeweAqO%2FaQ%2FPsZk2%2FcwFO8%2FBXnBK14mayDyiYBrbyxGDj4gh4%2FLRMCHbubdqJsEOBedB0dIdpFU%2FttJKhoYv8GiL5oU1XKODyBHYb2pJ654OZmHHp0DJlh418x5fNVEopFIlNqgZxfyIu1FOFmssjIMHnaCcA7xZKdgDAGdY9pOxeaXyVhw7IRqLTQaiDMddSDln%2F4B0y5dtELOzb8bHnJIaJTM2PzvUSCkHZHJpY0rIbPQiDCP9PJdTrvbbkIHYjWENmqB3p%2FBBsiWVUOmyfYiC7zeCQMP3Mv0V4uY9Nh3VIrMS7jjZGl8ruS3offUZKs%2BPrlVDZdbwSy6JTI%2BjrUWtN%2BGqNhnIk9RfwVyOPKOrtVVgX%2FWRx%2F5tYxlEXV2XS1jzYPXQO9KJbhYuAROqwHr7I65puIRzeOHz6XphMLd1UbuqIrGDNzw%2F0aGCsh1KOlXzJ\",\"reportInfo\":{\"advert_group_id\":\"wx0sxn7mrnx5nw7g00\",\"trace_id\":\"wx0sxn7mrnx5nw7g00\",\"pos_id\":\"1030436212907001\",\"pos_type\":6,\"sdk_version\":\"2.14.4\",\"ad_w\":414,\"ad_h\":896,\"aid\":3073495755,\"weapp_gh_id\":\"\",\"pt\":1,\"screen_cnt\":1,\"from_h5\":0,\"from_game\":1,\"wegame_start_ts\":1615451373493,\"wegame_enter_ts\":1615451373803,\"wegame_user_duration\":7475,\"wxa_report_detail\":{\"page_x\":0,\"page_y\":0,\"screen_x\":0,\"screen_y\":0,\"ad_number\":2,\"ad_unit_number\":2,\"ad_index\":2,\"page_enter_time\":1615451373803,\"phone_screen_width\":414,\"phone_screen_height\":896},\"weapp_extra_data\":{\"weixin_version\":\"7.0.4\",\"os_version\":\"iOS 10.0.1\",\"machine_brand\":\"devtools\",\"machine_type\":\"iPhone XS Max\",\"network_type\":\"wifi\",\"start_ts\":1615451373493,\"enter_ts\":1615451373803,\"user_duration\":7475,\"imp_time\":1615451373781,\"exp_time\":0,\"clk_time\":0}},\"clickPosMap\":{\"follow\":2008,\"like\":2009,\"comment\":2010,\"headimage\":2011,\"nickname\":2012,\"forward\":2013},\"feedbackUrl\":\"https://mp.weixin.qq.com/promotion/res/htmledition/mobile/html/feedback.html?aid=3073495755&traceid=wx0sxn7mrnx5nw7g00&source=1003&material_id=%5B%5D&machine_type=iPhone XS Max&publisher_appid=wx0f2bb205952d1079#wechat_redirect\"}\n"), (C60216z4.C8821a<Object>) null, (C60216z4.C8821a<Integer>) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$k */
    public static final class C14302k extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C14302k f39849d = new C14302k();

        public C14302k() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SLIDE_MORE_GUIDE_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$k0 */
    public static final class C14303k0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14303k0 f39850d = new C14303k0();

        public C14303k0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13308GZ();
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$k1 */
    public static final class C14304k1 extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C14304k1 f39851d = new C14304k1();

        public C14304k1() {
            super(1);
        }

        public Object invoke(Object obj) {
            if (((Number) obj).intValue() == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_FIRST_HOT_TAB_PRELOAD_INT_SYNC, 0);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$k2 */
    public static final class C14305k2 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C14305k2 f39852d = new C14305k2();

        public C14305k2() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            for (C32735h.C32737c Y60 : C64197v.m75537f(C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_0, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_1, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_2, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_3, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_4, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_5, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_6, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_7, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_8, C32735h.C32737c.clicfg_finder_ftpp_codec_reuse_model_list_9)) {
                String Y602 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(Y60, "{mode:1,whitelist:[],apilevel:[],company:[],blacklist:[]}");
                if (!TextUtils.isEmpty(Y602)) {
                    try {
                        JSONObject jSONObject = new JSONObject(Y602);
                        if (jSONObject.getInt("mode") == 1) {
                            JSONArray jSONArray = jSONObject.getJSONArray("whitelist");
                            int length = jSONArray.length();
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                String string = jSONArray.getString(i);
                                Log.m105918d("FinderConfig", "checkEnableCodecReuse modelName:" + string);
                                if (C112551y.m153809i(C87203t.m108275k(), string, true)) {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                            if (z) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (Throwable th) {
                        Log.printErrStackTrace("FinderConfig", th, "", new Object[0]);
                    }
                }
            }
            C115669n.INSTANCE.mo175913w(1505, 9, z ? 1 : 0);
            Log.m105924i("FinderConfig", "checkEnableCodecReuse enableCodecReuse:" + z + " duration:" + (System.currentTimeMillis() - currentTimeMillis));
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: up1.f$l */
    public static final class C14306l extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C14306l f39853d = new C14306l();

        public C14306l() {
            super(1);
        }

        public Object invoke(Object obj) {
            ((Number) obj).intValue();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_SETTING_SHOW_BOOLEAN, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$l0 */
    public static final class C14307l0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14307l0 f39854d = new C14307l0();

        public C14307l0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            qVar.mo107606r("直播评论动画速度");
            qVar.mo107595g("输入数字越大越慢，非法输入无效");
            qVar.mo107594f(Boolean.TRUE);
            qVar.f225837a.f225714b.f225647d = "输入整数，当前数值：" + C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LIVE_MSG_SPEED_INT_SYNC, 0);
            qVar.mo107590b(C14347h.f39895a);
            qVar.mo107603o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$l1 */
    public static final class C14308l1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14308l1 f39855d = new C14308l1();

        public C14308l1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_MIX_CELL_TIPS_SHOWN_BOOLEAN, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$m */
    public static final class C14309m extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C14309m f39856d = new C14309m();

        public C14309m() {
            super(1);
        }

        public Object invoke(Object obj) {
            MultiProcessMMKV.getDefault().putBoolean("clicfg_matrix_settings_entrance", ((Number) obj).intValue() > 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$m0 */
    public static final class C14310m0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14310m0 f39857d = new C14310m0();

        public C14310m0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Intent intent = new Intent();
            intent.addFlags(268435456);
            int i = FinderTestNumFormat.f14837x;
            intent.putExtra("SCENE_TEST_PAGE", 1);
            intent.setClass(MMApplicationContext.getContext(), FinderTestNumFormat.class);
            Context context = MMApplicationContext.getContext();
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/storage/FinderConfig$FINDER_LIVE_NUMBER_RULE_TEST_PAGE$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/finder/storage/FinderConfig$FINDER_LIVE_NUMBER_RULE_TEST_PAGE$1", "invoke", "(Landroid/app/Activity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$m1 */
    public static final class C14311m1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14311m1 f39858d = new C14311m1();

        public C14311m1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C32444a.f86121a.mo58623d(0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$n0 */
    public static final class C14312n0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14312n0 f39859d = new C14312n0();

        public C14312n0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_QUOTA_CONSUME_SHOW_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_QUOTA_CONSUME_FACE_VERIFY_TIME_LONG_SYNC, 0L);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$n1 */
    public static final class C14313n1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14313n1 f39860d = new C14313n1();

        public C14313n1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", "autoOpenFinderLive");
            jSONObject2.put("finderUserName", "v2_060000231003b20faec8c4e18818c3d1cb04eb33b077ae835e04464cdde50c6c0af16e7d9204@finder");
            jSONObject2.put("commentScene", 9);
            jSONObject.put("extInfo", jSONObject2);
            C7335d c = C86312j.m106911c(C60200t1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            C87412m.m108592e(activity, "null cannot be cast to non-null type android.content.Context");
            C60200t1.C60201a.m70364b((C60200t1) c, activity, jSONObject.toString(), (C60216z4.C8821a) null, 4, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$o */
    public static final class C14314o extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14314o f39861d = new C14314o();

        public C14314o() {
            super(1);
        }

        public Object invoke(Object obj) {
            Context context = (Activity) obj;
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmfindersupport-bin/newreadtemplate?t=page/outer_page/switch_recommendation");
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$p */
    public static final class C14315p extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14315p f39862d = new C14315p();

        public C14315p() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Fs0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$q */
    public static final class C14316q extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14316q f39863d = new C14316q();

        public C14316q() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) "已重置", 0).show();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_CLICK_COUNT_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_V2_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_LONG_CLICK_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_DIALOG_SHOW_COUNT_ANIMATE_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_GUIDE_LAST_SHOW_TIME_LONG_SYNC, 0L);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$q1 */
    public static final class C14317q1 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14317q1 f39864d = new C14317q1();

        public C14317q1() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_record_video_max_duration_android, 60));
        }
    }

    /* renamed from: up1.f$r */
    public static final class C14318r extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14318r f39865d = new C14318r();

        public C14318r() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_REDDOT_MULTI_USERNAME_UPDATE_BOOLEAN_SYNC, Boolean.FALSE);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$r0 */
    public static final class C14319r0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14319r0 f39866d = new C14319r0();

        public C14319r0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_MULTI_TASK_GUIDE_WITH_NAVI_BOOLEAN_SYNC;
            Boolean bool = Boolean.FALSE;
            i.mo119677K(aVar, bool);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_MULTI_TASK_GUIDE_WITHOUT_NAVI_BOOLEAN_SYNC, bool);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$r1 */
    public static final class C14320r1 extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C14320r1 f39867d = new C14320r1();

        public C14320r1() {
            super(0);
        }

        public Object invoke() {
            return 5;
        }
    }

    /* renamed from: up1.f$s */
    public static final class C14321s extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14321s f39868d = new C14321s();

        public C14321s() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_TODAY_REMIND_COUNT_LONG_SYNC, 0L);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$s1 */
    public static final class C14322s1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14322s1 f39869d = new C14322s1();

        public C14322s1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C13887q1) C86312j.m106911c(C13887q1.class)).mo13327RX();
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$t */
    public static final class C14323t extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14323t f39870d = new C14323t();

        public C14323t() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SURVEY_INFO_STRING_SYNC, "{}");
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除用户问卷出现次数", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$t0 */
    public static final class C14324t0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14324t0 f39871d = new C14324t0();

        public C14324t0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C66785b bVar = C66785b.f191882e;
            C39758f fVar = new C39758f();
            C51284sq2 d = fVar.mo62398d();
            int i = fVar.mo62398d().f141692x;
            Pattern pattern = C61926c.f176038a;
            d.f141692x = i & -9;
            bVar.mo90665S0(fVar, C39759i.FINDER_CONFIG);
            ((C8795q1) C86312j.m106911c(C8795q1.class)).mo9627ME(Boolean.TRUE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$t1 */
    public static final class C14325t1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14325t1 f39872d = new C14325t1();

        public C14325t1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C37521f.f99374d.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_ORIGIN_ACCOUNT_POST_TIPSCOUNT_INT_SYNC, 1);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_ORIGINAL_REDDOT_FLAG2_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$u */
    public static final class C14326u extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14326u f39873d = new C14326u();

        public C14326u() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_COMMENT_CHANGE_SCENE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$u1 */
    public static final class C14327u1 extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public static final C14327u1 f39874d = new C14327u1();

        public C14327u1() {
            super(1);
        }

        public Object invoke(Object obj) {
            if (((Number) obj).intValue() == 1) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_ORIGINAL_POST_ANNOUNCE_CHECK_LONG_SYNC, 0L);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$v */
    public static final class C14328v extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14328v f39875d = new C14328v();

        public C14328v() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C77426q qVar = new C77426q(MMApplicationContext.getContext());
            qVar.mo107606r("输入json");
            qVar.mo107594f(Boolean.TRUE);
            qVar.mo107590b(C14341g.f39888a);
            qVar.mo107603o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$v0 */
    public static final class C14329v0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14329v0 f39876d = new C14329v0();

        public C14329v0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$v1 */
    public static final class C14330v1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14330v1 f39877d = new C14330v1();

        public C14330v1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_POST_ACTIVITY_READ_LICENSE_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$w0 */
    public static final class C14331w0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14331w0 f39878d = new C14331w0();

        public C14331w0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_SHOW_FINDER_RECENT_LIKE_INT_SYNC, 1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$w1 */
    public static final class C14332w1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14332w1 f39879d = new C14332w1();

        public C14332w1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOWN_GET_POST_QUALITY_TIPS_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$x */
    public static final class C14333x extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14333x f39880d = new C14333x();

        public C14333x() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FEED_GROUP_LIKE_GUIDE_INT, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$x0 */
    public static final class C14334x0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14334x0 f39881d = new C14334x0();

        public C14334x0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_CLOSE_REDPACK_TIPS_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$x1 */
    public static final class C14335x1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14335x1 f39882d = new C14335x1();

        public C14335x1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SHOW_MULTI_TASK_TIPS_TIMES_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$y */
    public static final class C14336y extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14336y f39883d = new C14336y();

        public C14336y() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FEED_SHOW_HORIZONTAL_HINT_LIMIT_INT_SYNC, 0);
            if (activity != null) {
                C76912y0.makeText((Context) activity, (CharSequence) "已清除，可重新测试", 0).show();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$y0 */
    public static final class C14337y0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14337y0 f39884d = new C14337y0();

        public C14337y0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_HAS_ENTER_REDPACK_MINI_APP_BOOLEAN_SYNC, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$y1 */
    public static final class C14338y1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14338y1 f39885d = new C14338y1();

        public C14338y1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_TIPS_COUNT_INT_SYNC, 3);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_PRIVATE_LIKE_TIPS_COUNT2_INT_SYNC, 3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$z0 */
    public static final class C14339z0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14339z0 f39886d = new C14339z0();

        public C14339z0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USREINFO_FINDER_SLIDE_LEFT_TIPS_COUNT_INT_SYNC, 0);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$z1 */
    public static final class C14340z1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C14340z1 f39887d = new C14340z1();

        public C14340z1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0L);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC, 0L);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, 0L);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$a0 */
    public static final class C37522a0 extends C36665a {

        /* renamed from: s */
        public int f99581s = -1;

        public C37522a0() {
            super(0, "关注tab瀑布流形态", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        }

        /* renamed from: n */
        public Object mo60266n() {
            if (((C8808v4) C86312j.m106911c(C8808v4.class)).mo9635e()) {
                return 0;
            }
            C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
            Integer valueOf = oi12 != null ? Integer.valueOf(oi12.f139198f) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                return 0;
            }
            if (valueOf != null && valueOf.intValue() == 2) {
                return 1;
            }
            boolean xo = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76897xo(3);
            boolean q902 = ((C64916p1) C86312j.m106911c(C64916p1.class)).q90();
            if (this.f99581s == -1 || (xo && !q902)) {
                this.f99581s = ((Number) super.mo60266n()).intValue();
            }
            return Integer.valueOf(this.f99581s);
        }
    }

    /* renamed from: up1.f$a2 */
    public static final class C37523a2 extends C87413o implements C32227p<Integer, Context, C13598b0> {

        /* renamed from: d */
        public static final C37523a2 f99582d = new C37523a2();

        public C37523a2() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            Context context = (Context) obj2;
            C90188n0.f258927U = ((Number) obj).intValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$d2 */
    public static final class C37524d2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37524d2 f99583d = new C37524d2();

        public C37524d2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60606n) C86312j.m106911c(C60606n.class)).mo84988BG("1", "wx95a3a4d7c627e07d", "{\"liveEntryScene\":1,\"appid\":\"wx95a3a4d7c627e07d\"}", false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$e */
    public static final class C37525e extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37525e f99584d = new C37525e();

        public C37525e() {
            super(1);
        }

        public Object invoke(Object obj) {
            Class cls = C32735h.class;
            Activity activity = (Activity) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("clicfg_ultron_finder_search_only_contact_android: ");
            C37521f fVar = C37521f.f99374d;
            fVar.getClass();
            boolean z = false;
            sb.append(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_finder_search_only_contact_android, 1) == 1);
            sb.append("\nclicfg_ultron_finder_show_reddot_number_attab_android:");
            if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_finder_show_reddot_number_attab_android, 1) == 1) {
                z = true;
            }
            sb.append(z);
            sb.append("\nclicfg_ultron_record_video_max_duration_android:");
            sb.append(fVar.mo61162P().f267170h);
            sb.append("\nclicfg_ultron_record_video_min_duration_android:");
            sb.append(fVar.mo61162P().f267171i);
            sb.append("\nclicfg_ultron_album_video_max_duration_android:");
            sb.append(fVar.mo61161O().f267170h);
            sb.append("\nclicfg_ultron_album_video_min_duration_android:");
            sb.append(fVar.mo61161O().f267171i);
            sb.append("\nclicfg_ultron_album_video_max_select_duration_android:");
            sb.append(((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_video_max_select_duration_android, 300));
            String sb4 = sb.toString();
            C37521f.f99445l1.mo60266n().intValue();
            C37521f.f99462n1.mo60266n().intValue();
            fVar.mo61186l();
            fVar.mo61193s();
            fVar.mo61190p();
            fVar.mo61192r();
            fVar.mo61196v();
            fVar.mo61195u();
            fVar.mo61191q();
            fVar.mo61194t();
            ClipboardHelper.setText(sb4);
            C76912y0.makeText(MMApplicationContext.getContext(), (CharSequence) sb4, 1).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$e2 */
    public static final class C37526e2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37526e2 f99585d = new C37526e2();

        public C37526e2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85043Xf("wx95a3a4d7c627e07d", "{\"routeScene\":3,\"liveEntryScene\":1,\"appid\":\"wx95a3a4d7c627e07d\"}", true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$f1 */
    public static final class C37527f1 extends C36665a {
        public C37527f1() {
            super(1, "星标推荐提示开关", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        }

        /* renamed from: n */
        public Object mo60266n() {
            C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
            boolean z = true;
            if (oi12 == null || oi12.f139196d != 1) {
                z = false;
            }
            if (z) {
                return 0;
            }
            return (Integer) super.mo60266n();
        }
    }

    /* renamed from: up1.f$f2 */
    public static final class C37528f2 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37528f2 f99586d = new C37528f2();

        public C37528f2() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60606n) C86312j.m106911c(C60606n.class)).mo85043Xf("wx95a3a4d7c627e07d", "{\"extraAntiInfo\":\"GameLiveAuthTicketAcn6imUCGKcMSLo0R76o8g==\",\"ticket\":\"GameLiveAuthTicketAcn6imUCGKcMSLo0R76o8g==\",\"routeScene\":3,\"liveEntryScene\":2,\"appid\":\"wx95a3a4d7c627e07d\",\"platformId\":1,\"gameUserId\":\"1658214812086\"}", true);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$g2 */
    public static final class C37529g2 extends C87413o implements C32227p<Integer, Context, C13598b0> {

        /* renamed from: d */
        public static final C37529g2 f99587d = new C37529g2();

        public C37529g2() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            Context context = (Context) obj2;
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LOCAL_UITOOL_ENABLE_INT_SYNC;
            try {
                Class<?> cls = Class.forName("com.tencent.mm.uitool.UITool");
                Object obj3 = cls.getDeclaredField("INSTANCE").get(cls);
                if (intValue == 1) {
                    cls.getDeclaredMethod("setEnabled", new Class[0]).invoke(obj3, new Object[0]);
                    Log.printInfoStack("MicroMsg.UIToolCommon", "enable UIToolCommon", new Object[0]);
                    C16376b.f43775a = true;
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 1);
                } else {
                    cls.getDeclaredMethod("setDisabled", new Class[0]).invoke(obj3, new Object[0]);
                    C16376b.f43775a = false;
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("FinderConfig", e, "fail to enable uitool", new Object[0]);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$h1 */
    public static final class C37530h1 extends C36665a {
        public C37530h1() {
            super(1, "是否支持分享到状态", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        }

        /* renamed from: n */
        public Object mo60266n() {
            return 1;
        }
    }

    /* renamed from: up1.f$i */
    public static final class C37531i extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37531i f99588d = new C37531i();

        public C37531i() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C14950a.f40991a = 1000;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$l2 */
    public static final class C37532l2 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C37532l2 f99589d = new C37532l2();

        public C37532l2() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C37521f.m41373a(C37521f.f99374d)[0]);
        }
    }

    /* renamed from: up1.f$m2 */
    public static final class C37533m2 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C37533m2 f99590d = new C37533m2();

        public C37533m2() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C37521f.m41373a(C37521f.f99374d)[1]);
        }
    }

    /* renamed from: up1.f$n */
    public static final class C37534n extends C36665a {
        public C37534n() {
            super(1, "关心白底", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        }

        /* renamed from: n */
        public Object mo60266n() {
            if (C85875k4.m106211z()) {
                return 0;
            }
            return (Integer) super.mo60266n();
        }
    }

    /* renamed from: up1.f$n2 */
    public static final class C37535n2 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C37535n2 f99591d = new C37535n2();

        public C37535n2() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C37521f.m41374b(C37521f.f99374d, C64197v.m75537f(C32735h.C32737c.clicfg_finder_hdr10_model_list_0, C32735h.C32737c.clicfg_finder_hdr10_model_list_1, C32735h.C32737c.clicfg_finder_hdr10_model_list_2), "isEnableHDR10"));
        }
    }

    /* renamed from: up1.f$o0 */
    public static final class C37536o0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37536o0 f99592d = new C37536o0();

        public C37536o0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77233J5(3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$o1 */
    public static final class C37537o1 extends C36665a {

        /* renamed from: s */
        public int f99593s = -1;

        public C37537o1(int i) {
            super(i, "视频url过期时长（秒）", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        }

        /* renamed from: n */
        public Object mo60266n() {
            if (this.f99593s == -1) {
                this.f99593s = ((Number) super.mo60266n()).intValue();
                Log.m105924i("Finder.FinderFakeConfig", "KEEP_URL_VALID_TIME=" + this.f99593s);
            }
            return Integer.valueOf(this.f99593s);
        }
    }

    /* renamed from: up1.f$o2 */
    public static final class C37538o2 extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C37538o2 f99594d = new C37538o2();

        public C37538o2() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C37521f.m41374b(C37521f.f99374d, C64197v.m75537f(C32735h.C32737c.clicfg_finder_hdr_dolby_model_list_0, C32735h.C32737c.clicfg_finder_hdr_dolby_model_list_1, C32735h.C32737c.clicfg_finder_hdr_dolby_model_list_2), "isEnableHDRDolby"));
        }
    }

    /* renamed from: up1.f$p0 */
    public static final class C37539p0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37539p0 f99595d = new C37539p0();

        public C37539p0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77233J5(1);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$p1 */
    public static final class C37540p1 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37540p1 f99596d = new C37540p1();

        public C37540p1() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86013q1.m106446g(C28332g.f77954b, true);
            C39780h.f106745c.clear();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$q0 */
    public static final class C37541q0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37541q0 f99597d = new C37541q0();

        public C37541q0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77233J5(4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$s0 */
    public static final class C37542s0 extends C36665a {
        public C37542s0() {
            super(0, "新版feed视觉（不维护了）", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        }

        /* renamed from: n */
        public Object mo60266n() {
            return 0;
        }
    }

    /* renamed from: up1.f$w */
    public static final class C37543w extends C36665a {

        /* renamed from: s */
        public int f99598s = -1;

        public C37543w() {
            super(0, "无预加载进入显示上次未读feed", (C32227p<? super Integer, ? super Context, C13598b0>) null);
        }

        /* renamed from: n */
        public Object mo60266n() {
            if (this.f99598s == -1) {
                this.f99598s = ((Number) super.mo60266n()).intValue();
                Log.m105924i("Finder.FinderFakeConfig", "FINDER_ENTER_SHOW_CACHE_UNREAD_FEED=" + this.f99598s);
            }
            return Integer.valueOf(this.f99598s);
        }
    }

    /* renamed from: up1.f$z */
    public static final class C37544z extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37544z f99599d = new C37544z();

        public C37544z() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C58741j5 j5Var = C58741j5.f168184a;
            j5Var.mo83727a();
            j5Var.mo83728b();
            ((C60200t1) C86312j.m106911c(C60200t1.class)).wk0();
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_CLEAN_OLD_FINDER_MEDIA_BOOLEAN;
            Boolean bool = Boolean.TRUE;
            i.mo119677K(aVar, bool);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, bool);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$a */
    public static final class C37545a extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37545a f99600d = new C37545a();

        public C37545a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC, "");
            C66785b bVar = C66785b.f191882e;
            C39758f fVar = new C39758f();
            fVar.mo62397b().f140463d = null;
            bVar.mo90665S0(fVar, C39759i.FINDER_CONFIG);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FIRST_CREATE_USER_BOOLEAN, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$b */
    public static final class C37546b extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37546b f99601d = new C37546b();

        public C37546b() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SYNC_KEYBUF2_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_USERNAME_STRING_SYNC, "");
            C66785b bVar = C66785b.f191882e;
            String O5 = bVar.mo90662O5();
            C39759i iVar = C39759i.FINDER_CONFIG;
            bVar.mo90660L2(O5, iVar);
            C39758f fVar = new C39758f();
            fVar.mo62397b().f140463d = null;
            bVar.mo90665S0(fVar, iVar);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MY_FINDER_LOCAL_COVER_IMG_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FIRST_CREATE_USER_BOOLEAN, Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$u0 */
    public static final class C37547u0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37547u0 f99602d = new C37547u0();

        public C37547u0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            C66785b bVar = C66785b.f191882e;
            C39758f fVar = new C39758f();
            fVar.mo62397b().f140469j = new ly4();
            bVar.mo90665S0(fVar, C39759i.FINDER_CONFIG);
            ((C46112m3) C86312j.m106911c(C46112m3.class)).s00(Boolean.TRUE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: up1.f$i0 */
    public static final class C37548i0 extends C87413o implements C32226l<Activity, C13598b0> {

        /* renamed from: d */
        public static final C37548i0 f99603d = new C37548i0();

        public C37548i0() {
            super(1);
        }

        public Object invoke(Object obj) {
            Activity activity = (Activity) obj;
            Object systemService = MMApplicationContext.getContext().getSystemService("wifi");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiInfo wifiInfo = (WifiInfo) C117292a.m165363i((WifiManager) systemService, "com/tencent/mm/plugin/finder/storage/FinderConfig$FINDER_HOOK_SERVICE$1", "invoke", "(Landroid/app/Activity;)V", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            return C13598b0.f38549a;
        }
    }

    static {
        C36665a aVar = new C36665a(0, "是否支持设置为彩铃", (C32227p) null, 4, (C8480h) null);
        aVar.mo60270f(C32735h.C32737c.clicfg_finder_support_share_ringtone);
        aVar.mo60268b("FINDER_SUPPORT_SHARE_RINGTONE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar2 = new C36665a(0, "微信私信红点透传开关", (C32227p) null, 4, (C8480h) null);
        aVar2.mo60270f(C32735h.C32737c.clicfg_finder_wx_message_red_dot_pass_switch);
        aVar2.mo60268b("WX_MESSAGE_RED_DOT_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99428j = aVar2;
        C36665a aVar3 = new C36665a(0, "通用选择器HardCode", (C32227p) null, 4, (C8480h) null);
        aVar3.mo60268b("FINDER_GALLERY_TEST", new ArrayList(C64197v.m75537f(0, 1, 2, 3)), C64197v.m75537f("默认(0)", "列表为空", "刷新失败", "刷新失败重试OK"));
        f99461n = aVar3;
        new C35469d("Contact更新最短间隔改为0", C14297i2.f39844d);
        new C35469d("验证帐号不一致", C37524d2.f99583d);
        new C35469d("验证游戏跳开播页没有帐号", C37526e2.f99585d);
        new C35469d("非微信登录的游戏一键开播", C37528f2.f99586d);
        new C35469d("测试游戏中心h5调直播", C14313n1.f39860d);
        C36665a aVar4 = new C36665a(0, "测试游戏中心h5调直播调试设置", (C32227p) null, 4, (C8480h) null);
        aVar4.mo60268b("GAME_CENTER_JSAPI_DEBUG_CONFIG", new ArrayList(C64197v.m75537f(0, 1, 2)), C64197v.m75537f("默认(0)", "mock主播没开播", "mock直播已结束"));
        f99470o = aVar4;
        C36665a aVar5 = new C36665a(0, "原创发表announce确认弹窗状态清理", (C32227p) null, 4, (C8480h) null);
        aVar5.mo60268b("POST_ORIGIN_CONFIRM_ANNOUNCE_FLAG", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("默认(0)", "清理存储"));
        C14327u1 u1Var = C14327u1.f39874d;
        C87412m.m108594g(u1Var, "clickListener");
        aVar5.f94895n = u1Var;
        C37016a aVar6 = new C37016a(0, "长视频文件上限");
        long j = (long) 1048576;
        aVar6.mo60268b("debugLongVideoMaxSize", new ArrayList(C64197v.m75537f(0L, Long.valueOf(20 * j), Long.valueOf(j * 800))), C64197v.m75537f("默认(0)", "20MB", "800MB"));
        f99479p = aVar6;
        C36665a aVar7 = new C36665a(1280, "视频号通用图片最大高度", (C32227p) null, 4, (C8480h) null);
        aVar7.mo60268b("COMMON_IMAGE_MAX_HEIGHT", C26236u.m33719b(1280), C26236u.m33719b("1280"));
        aVar7.mo60270f(C32735h.C32737c.clicfg_finder_common_image_max_height);
        f99498r = aVar7;
        C36665a aVar8 = new C36665a(1080, "视频号通用图片最大宽度", (C32227p) null, 4, (C8480h) null);
        aVar8.mo60268b("COMMON_IMAGE_MAX_WIDTH", C26236u.m33719b(1080), C26236u.m33719b("1080"));
        aVar8.mo60270f(C32735h.C32737c.clicfg_finder_common_image_max_width);
        f99507s = aVar8;
        C36665a aVar9 = new C36665a(0, "不再接收私信入口", (C32227p) null, 4, (C8480h) null);
        aVar9.mo60269d("FinderPrivateRefuseAllMsgSwitch");
        aVar9.mo60268b("REFUSE_ALL_PRIVATE_MSG_SWITCH", new ArrayList(C64197v.m75537f(0, 1, 0)), C64197v.m75537f("默认(0)", "打开入口(1)", "关闭入口(0)"));
        f99543w = aVar9;
        C36665a aVar10 = new C36665a(0, "打招呼限制提醒", (C32227p) null, 4, (C8480h) null);
        aVar10.mo60269d("FinderPersonalMsgMaxGreetCount");
        aVar10.mo60268b("FinderPersonalMsgMaxGreetCount", new ArrayList(C64197v.m75537f(0, 1, 0)), C64197v.m75537f("默认(0)", "打开提示(1)", "关闭提示(0)"));
        f99552x = aVar10;
        C36665a aVar11 = new C36665a(0, "发表/草稿模拟失败", (C32227p) null, 4, (C8480h) null);
        aVar11.mo60268b("FINDER_POST_FAILED_IN_STAGE", new ArrayList(C64197v.m75537f(0, 1, 2, 3, 4, 5)), C64197v.m75537f("关闭(0)", "裁剪失败", "上传失败", "cgi失败", "上传时文件不存在", "重编码时文件不存在"));
        f99562y = aVar11;
        C36665a aVar12 = new C36665a(1, "启动云草稿", (C32227p) null, 4, (C8480h) null);
        aVar12.mo60268b("CLOUD_DRAFT", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "启动"));
        f99572z = aVar12;
        long j2 = (long) 1024;
        f99165F = ((Environment.getExternalStorageDirectory().getFreeSpace() / j2) / j2) / j2;
        C36665a aVar13 = new C36665a(1, "视频号目录新策略", (C32227p) null, 4, (C8480h) null);
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_finder_posting_folder_strategy;
        aVar13.mo60270f(cVar);
        aVar13.mo60268b("FINDER_POSTING_STRATEGY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "启用"));
        C36665a aVar14 = new C36665a(15, "小程序广告浏览倒计时", (C32227p) null, 4, (C8480h) null);
        aVar14.mo60270f(C32735h.C32737c.clicfg_finder_wxa_ad_count_down_time_sec);
        f99174G = aVar14;
        new C35469d("小程序广告demo", C14301j2.f39848d);
        ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_share_detail_entrance_switch_android, 1);
        ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_finder_search_only_contact_android, 1);
        ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_finder_show_reddot_number_attab_android, 1);
        C32735h.C32737c.clicfg_ultron_record_video_max_duration_android.toString();
        C36568h.m40985a(C37532l2.f99589d);
        C36568h.m40985a(C37533m2.f99590d);
        C36665a aVar15 = new C36665a(5, "Feed关注动画启动阈值s", (C32227p) null, 4, (C8480h) null);
        C32735h.C32737c cVar2 = cVar;
        aVar15.mo60268b("SHOW_FOLLOW_ANIM_OFFSET", C64197v.m75537f(5, 10, 30), C64197v.m75537f("5s", "10s", "30s"));
        aVar15.mo60270f(C32735h.C32737c.clicfg_finder_feed_show_follow_anim_offset);
        f99228M = aVar15;
        C36665a aVar16 = new C36665a(300000, "3tab流自动刷新缓存时间", (C32227p) null, 4, (C8480h) null);
        aVar16.mo60270f(C32735h.C32737c.clicfg_finder_timeline_refresh_expired);
        Integer valueOf = Integer.valueOf(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
        aVar16.mo60268b("AUTO_REEFRESH_CACHE_INTERVAL", C64197v.m75537f(300000, 10000, 30000, valueOf), C64197v.m75537f("默认(5min)", "10s", "30s", "1min"));
        aVar16.mo60273m("常用");
        f99269R = aVar16;
        C36665a aVar17 = new C36665a(10000, "直播和附近预拉取超时时间", (C32227p) null, 4, (C8480h) null);
        aVar17.mo60270f(C32735h.C32737c.clicfg_finder_nearby_waiting_preload_timeout_ms);
        aVar17.mo60268b("NEARBY_WAITING_PRELOAD_TIMEOUT_MS", C64197v.m75537f(5000, 10000, 30000, valueOf), C64197v.m75537f("默认(10s)", "5s", "10s", "30s", "1min"));
        f99278S = aVar17;
        C36665a aVar18 = new C36665a(1, "FinderHomeAndroid12Snapshot", (C32227p) null, 4, (C8480h) null);
        aVar18.mo60270f(C32735h.C32737c.clicfg_finder_home_android12_snapshot);
        aVar18.mo60268b("FINDER_ANDROID_12_SNAPSHOT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99314W = aVar18;
        C36665a aVar19 = new C36665a(1, "二级评论是否展开", (C32227p) null, 4, (C8480h) null);
        aVar19.mo60269d("FinderCommentAutoExpandSubcommentList");
        aVar19.mo60268b("COMMENT_EXPAND_CONFIG", C64197v.m75537f(1, 0), C64197v.m75537f("是", "否"));
        f99480p0 = aVar19;
        C36665a aVar20 = new C36665a(1, "直播间订单入口", (C32227p) null, 4, (C8480h) null);
        aVar20.mo60270f(C32735h.C32737c.clicfg_finder_order_entrance);
        aVar20.mo60268b("ORDER_ENTRANCE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99553x0 = aVar20;
        C36665a aVar21 = new C36665a(1, "个人页订单入口", (C32227p) null, 4, (C8480h) null);
        aVar21.mo60268b("ORDER_ENTRANCE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99563y0 = aVar21;
        C36665a aVar22 = new C36665a(1, "手势退出视频号页面", (C32227p) null, 4, (C8480h) null);
        aVar22.mo60268b("OPEN_GESTURE_EXIT_FINDER", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99261Q0 = aVar22;
        C36665a aVar23 = new C36665a(1, "实名点赞", (C32227p) null, 4, (C8480h) null);
        aVar23.mo60270f(C32735h.C32737c.clicfg_finder_real_name_like);
        aVar23.mo60268b("REAL_NAME_LIKE_CONFIG", C64197v.m75537f(1, 2), C64197v.m75537f("实名点赞", "非实名点赞"));
        f99270R0 = aVar23;
        C36665a aVar24 = new C36665a(1, "实名点赞头像", (C32227p) null, 4, (C8480h) null);
        aVar24.mo60270f(C32735h.C32737c.clicfg_finder_real_name_like_avatar_control);
        aVar24.mo60268b("REAL_NAME_LIKE_AVATAR_RADIUS_CONTROL", C64197v.m75537f(0, 1), C64197v.m75537f("圆头像", "方头像"));
        f99279S0 = aVar24;
        C36665a aVar25 = new C36665a(0, "评论全屏方案", (C32227p) null, 4, (C8480h) null);
        C32735h.C32737c cVar3 = C32735h.C32737c.clicfg_finder_comment_fullscreen;
        aVar25.mo60270f(cVar3);
        aVar25.mo60268b("COMMENT_STYLE_CONFIG", C64197v.m75537f(1, 0), C64197v.m75537f("全屏", "半屏"));
        f99288T0 = aVar25;
        C36665a aVar26 = new C36665a(-1, "圈外分享模式(仅预览)", (C32227p) null, 4, (C8480h) null);
        aVar26.mo60270f(cVar3);
        aVar26.mo60268b("USERINFO_FINDER_FORWARD_DEBUG_TYPE_INT", C64197v.m75537f(-1, 1, 2), C64197v.m75537f("默认", "允许nickname", "过滤nickname"));
        f99297U0 = aVar26;
        C36665a aVar27 = new C36665a(1, "附近tab使用瀑布流/卡片流开关", (C32227p) null, 4, (C8480h) null);
        aVar27.mo60270f(C32735h.C32737c.clicfg_finder_lbs_stream_cgi);
        aVar27.mo60268b("LBS_UI_CONFIG", C64197v.m75537f(1, 2), C64197v.m75537f("瀑布流", "卡片流"));
        f99306V0 = aVar27;
        new C36665a(20, "关注/点赞折叠超过x条后折叠", (C32227p) null, 4, (C8480h) null).mo60268b("FOLLOW_LIKE_FOLD_MORE_THAN_X", C64197v.m75537f(20, 3), C64197v.m75537f("20", "3"));
        C37522a0 a0Var = new C37522a0();
        a0Var.mo60268b("FINDER_FOLLOW_TWO_FLOW_FEED", C64197v.m75537f(0, 1, 2), C64197v.m75537f("关闭", "关注双列流", "关心双列流"));
        a0Var.mo60270f(C32735h.C32737c.clicfg_finder_follow_two_flow_feed);
        f99315W0 = a0Var;
        C36665a aVar28 = new C36665a(0, "关注双流进单流样式", (C32227p) null, 4, (C8480h) null);
        String str = "5s";
        aVar28.mo60268b("FINDER_FOLLOW_TIMELINE_TYPE", C64197v.m75537f(0, 1, 2, 3, 4), C64197v.m75537f("推荐流", "相同流", "关心流沉浸流", "关注流沉浸流", "关注/关心流沉浸流"));
        aVar28.mo60270f(C32735h.C32737c.clicfg_finder_follow_timeline_type);
        f99324X0 = aVar28;
        C36665a aVar29 = new C36665a(0, "Feed安全检查cgi轮询间隔", (C32227p) null, 4, (C8480h) null);
        aVar29.mo60268b("FINDER_FEED_SAFE_CHECK_INTERVAL_SEC", C64197v.m75537f(0, 10, 20, 30), C64197v.m75537f("用后台", PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", PayuSecureEncrypt.ENCRYPT_VERSION_HASH));
        f99333Y0 = aVar29;
        C36665a aVar30 = new C36665a(0, "横屏播放器预加载缓存有效期s", (C32227p) null, 4, (C8480h) null);
        aVar30.mo60268b("FINDER_BIZ_PRELOAD_CACHE_VALID_INTERVAL", C64197v.m75537f(0, 10, 30), C64197v.m75537f("用后台", "10s", "30s"));
        f99342Z0 = aVar30;
        new C35469d("debug_id切换", C14314o.f39861d).mo60273m("常用");
        C36665a aVar31 = new C36665a(0, "选游戏页-测试hardcode", (C32227p) null, 4, (C8480h) null);
        aVar31.mo60268b("Finder_Game_Select_Hardcode", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("不hardcode", "游戏对局中无法开启直播", "暂无法开启游戏直播", "游戏未安装"));
        f99358b1 = aVar31;
        new C35469d("重置游戏直播协议勾选", C14311m1.f39858d);
        C36665a aVar32 = new C36665a(10, "刚刚看过客户端保护最大请求数", (C32227p) null, 4, (C8480h) null);
        aVar32.mo60270f(C32735h.C32737c.clicfg_finder_just_watch_request_count);
        f99366c1 = aVar32;
        C36665a aVar33 = new C36665a(1, "秒剪做同款", (C32227p) null, 4, (C8480h) null);
        aVar33.mo60270f(C32735h.C32737c.clicfg_finder_miaojian_samestyle);
        aVar33.mo60268b("SAME_STYLE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99375d1 = aVar33;
        C36665a aVar34 = new C36665a(0, "原创标签", (C32227p) null, 4, (C8480h) null);
        aVar34.mo60268b("ORIGIN_STYLE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开测试"));
        f99384e1 = aVar34;
        C36665a aVar35 = new C36665a(0, "秒剪做同款-mock后台配置", (C32227p) null, 4, (C8480h) null);
        aVar35.mo60268b("SAME_STYLE_SVR_DEBUG", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99393f1 = aVar35;
        C36665a aVar36 = new C36665a(1, "发表选相册时检测视频是否秒剪生成", (C32227p) null, 4, (C8480h) null);
        aVar36.mo60270f(C32735h.C32737c.clicfg_finder_post_check_miaojian);
        f99402g1 = aVar36;
        C36665a aVar37 = new C36665a(1, "是否开启手势切Tab", (C32227p) null, 4, (C8480h) null);
        aVar37.mo60270f(C32735h.C32737c.clicfg_finder_gesture_view_pager_home_ui);
        aVar37.mo60268b("FINDER_OPEN_GESTURE_HOME_UI", C64197v.m75537f(0, 1), C64197v.m75537f("关闭(0)", "打开(1)"));
        f99411h1 = aVar37;
        C36665a aVar38 = new C36665a(1, "切换单Tab", (C32227p) null, 4, (C8480h) null);
        aVar38.mo60270f(C32735h.C32737c.clicfg_finder_more_tab_enable);
        aVar38.mo60268b("FINDER_TAB_STYLE_CONFIG", C64197v.m75537f(1, 2), C64197v.m75537f("切换多tab", "切换单tab"));
        f99420i1 = aVar38;
        new C35469d("重置最后退出TL时间为0", C14340z1.f39887d);
        C36665a aVar39 = new C36665a(0, "UI工具", C37529g2.f99587d);
        aVar39.mo60268b("DEBUG_UITOOL_ENTRY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar39.mo60273m("常用");
        f99429j1 = aVar39;
        C36665a aVar40 = new C36665a(1, "预加载过滤已读剩下feed数则丢弃", (C32227p) null, 4, (C8480h) null);
        aVar40.mo60269d("FinderPrefetchFilterMinFeedCount");
        aVar40.mo60268b("FINDER_PREFETCH_FILTER_MIN_FEED_COUNT", C64197v.m75537f(1, 3, 6), C64197v.m75537f("1", "3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN));
        f99437k1 = aVar40;
        C36665a aVar41 = new C36665a(200, "评论字数限制", (C32227p) null, 4, (C8480h) null);
        aVar41.mo60269d("FinderCommentTextLimit");
        aVar41.mo60268b("COMMENT_TEXT_LIMIT_CONFIG", C26236u.m33719b(10), C26236u.m33719b("评论字数限制10"));
        f99445l1 = aVar41;
        C36665a aVar42 = new C36665a(10, "评论行数限制", (C32227p) null, 4, (C8480h) null);
        aVar42.mo60269d("FinderCommentLineWrapLimit");
        aVar42.mo60268b("COMMENT_TEXT_LINE_LIMIT", C26236u.m33719b(2), C26236u.m33719b("评论行数限制2"));
        f99453m1 = aVar42;
        C36665a aVar43 = new C36665a(1000, "Media字数限制15", (C32227p) null, 4, (C8480h) null);
        aVar43.mo60269d("FinderMediaPublishTextLimit");
        aVar43.mo60268b("MEDIA_TEXT_LIMIT_CONFIG", C26236u.m33719b(15), C26236u.m33719b("Media字数限制15"));
        f99462n1 = aVar43;
        C36665a aVar44 = new C36665a(20, "发表短标题字数限制", (C32227p) null, 4, (C8480h) null);
        aVar44.mo60269d("FinderMediaShortTextLimit");
        aVar44.mo60268b("FINDER_POST_SHORT_TITLE_LIMIT", C26236u.m33719b(10), C26236u.m33719b("字数限制10"));
        f99471o1 = aVar44;
        C36665a aVar45 = new C36665a(20, "发表描述超过多少个字触发短标题", (C32227p) null, 4, (C8480h) null);
        aVar45.mo60269d("FinderShowShortTextViewLimitCount");
        aVar45.mo60268b("FINDER_POST_SHOW_SHORT_TITLE_LIMIT", C26236u.m33719b(10), C26236u.m33719b("字数限制10"));
        f99481p1 = aVar45;
        C36665a aVar46 = new C36665a(0, "发表短标题开关", (C32227p) null, 4, (C8480h) null);
        aVar46.mo60270f(C32735h.C32737c.clicfg_finder_check_post_short_title_switch);
        aVar46.mo60268b("FINDER_POST_SHORT_TITLE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99490q1 = aVar46;
        C36665a aVar47 = new C36665a(0, "发表带商品支持修改商品文案", (C32227p) null, 4, (C8480h) null);
        aVar47.mo60270f(C32735h.C32737c.clicfg_finder_post_goods_title_modify_enable);
        aVar47.mo60268b("FINDER_POST_GOODS_TITLE_MODIFY_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99499r1 = aVar47;
        C36665a aVar48 = new C36665a(1, "发表CDN上传Type不对尝试兜底", (C32227p) null, 4, (C8480h) null);
        aVar48.mo60270f(C32735h.C32737c.clicfg_finder_post_upload_cdn_error_type_fix);
        aVar48.mo60268b("FINDER_POST_UPLOAD_CDN_ERROR_TYPE_FIX", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99508s1 = aVar48;
        C36665a aVar49 = new C36665a(1, "发表支持带公众号链接", (C32227p) null, 4, (C8480h) null);
        aVar49.mo60268b("FINDER_POST_SUPP_BIZ_LINKE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar49.mo60269d("FinderPostWithMpUrlSwitch");
        f99517t1 = aVar49;
        C36665a aVar50 = new C36665a(0, "发表推荐具体地点开关", (C32227p) null, 4, (C8480h) null);
        aVar50.mo60270f(C32735h.C32737c.clicfg_finder_post_recommend_specific_lbs);
        aVar50.mo60268b("FINDER_POST_RECOMMEND_SPECIFIC_LBS", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99526u1 = aVar50;
        C36665a aVar51 = new C36665a(0, "Feed描述区POI置灰不可点开关", (C32227p) null, 4, (C8480h) null);
        aVar51.mo60270f(C32735h.C32737c.clicfg_finder_finder_feed_poi_gray_disable);
        aVar51.mo60268b("FINDER_FEED_POI_GRAY_DISABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99535v1 = aVar51;
        C36665a aVar52 = new C36665a(0, "设置页小程序中引用该视频功能显示开关", (C32227p) null, 4, (C8480h) null);
        aVar52.mo60268b("FINDER_SETTING_MINI_APP_REFERENCE_ENTRY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar52.mo60269d("IsShowFinderMiniAppReferenceEntry");
        f99544w1 = aVar52;
        C36665a aVar53 = new C36665a(800, "纯文本字数限制15", (C32227p) null, 4, (C8480h) null);
        aVar53.mo60269d("FinderPureTextPublishTextLimit");
        aVar53.mo60268b("PURE_TEXT_LIMIT_CONFIG", C26236u.m33719b(20), C26236u.m33719b("纯文本字数限制15"));
        C36665a aVar54 = new C36665a(3, "最大话题数改为3个", (C32227p) null, 4, (C8480h) null);
        aVar54.mo60269d("FinderMaxTopicCount");
        aVar54.mo60268b("MAX_TOPIC_CONFIG", C26236u.m33719b(3), C26236u.m33719b("最大话题数改为3个"));
        f99554x1 = aVar54;
        new C35469d("假菊花Toast", C14298j.f39845d);
        new C35469d("直播限制消费弹窗提醒重置", C14312n0.f39859d);
        new C35469d("直播通用弹窗提醒重置", C14303k0.f39850d);
        new C35469d("里程碑中奖弹窗重置", C14322s1.f39869d);
        C36665a aVar55 = new C36665a(1, "礼物面板是否真实送礼", (C32227p) null, 4, (C8480h) null);
        aVar55.mo60268b("FINDER_LIVE_SEND_GIFT_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99573z1 = aVar55;
        C36665a aVar56 = new C36665a(0, "视频号入口权限", (C32227p) null, 4, (C8480h) null);
        aVar56.mo60268b("DEBUG_FINDER_ENTRANCE_PERMISSION", new ArrayList(C64197v.m75537f(0, 1, -1)), C64197v.m75537f("无效", "打开", "关闭"));
        aVar56.mo60270f(C32735h.C32737c.clicfg_finder_entry_debug);
        f99121A1 = aVar56;
        C36665a aVar57 = new C36665a(0, "发表跳转第三方app", (C32227p) null, 4, (C8480h) null);
        aVar57.mo60268b("SHARE_SDK_TEST3", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("默认", "秒剪测试"));
        f99130B1 = aVar57;
        C36665a aVar58 = new C36665a(0, "sdk分享特殊情况", (C32227p) null, 4, (C8480h) null);
        aVar58.mo60268b("SHARE_POST_DEBUG", new ArrayList(C64197v.m75537f(0, 1, 2, 3, 4)), C64197v.m75537f("默认", "无视频号浏览权限", "无视频号发表帐号权限", "发现页关闭了视频号", "青少年模式"));
        f99139C1 = aVar58;
        C36665a aVar59 = new C36665a(0, "我-视频入口控制", (C32227p) null, 4, (C8480h) null);
        aVar59.mo60268b("ME_FINDER_ENTRY_DEBUG", new ArrayList(C64197v.m75537f(0, 1, 2, 3)), C64197v.m75537f("默认", "青少年模式", "无视频号入口权限", "命中安全打击/封禁"));
        f99148D1 = aVar59;
        C36665a aVar60 = new C36665a(0, "A-我-视频入口开关", (C32227p) null, 4, (C8480h) null);
        aVar60.mo60270f(C32735h.C32737c.clicfg_finder_me_finder_switch);
        aVar60.mo60268b("ME_FINDER_ENTRY_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99157E1 = aVar60;
        C36665a aVar61 = new C36665a(1, "B-profile设置展示视频号，是否影响我-视频号", (C32227p) null, 4, (C8480h) null);
        aVar61.mo60270f(C32735h.C32737c.clicfg_finder_setting_to_me_finder_switch);
        aVar61.mo60268b("SETTING_TO_ME_FINDER_ENTRY_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("不影响", "影响"));
        f99166F1 = aVar61;
        C36665a aVar62 = new C36665a(1, "C-设置页出“展示我的视频号”开关", (C32227p) null, 4, (C8480h) null);
        aVar62.mo60270f(C32735h.C32737c.clicfg_finder_setting_finder_wxprofile_switch);
        aVar62.mo60268b("FINDER_SETTING_WXPROFILE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99175G1 = aVar62;
        C36665a aVar63 = new C36665a(1, "D-创建帐号-默认使用微信昵称", (C32227p) null, 4, (C8480h) null);
        aVar63.mo60270f(C32735h.C32737c.clicfg_finder_create_wxname_switch);
        aVar63.mo60268b("FINDER_CREATE_WXNAME_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99184H1 = aVar63;
        C36665a aVar64 = new C36665a(0, "打开我tab的视频号入口", (C32227p) null, 4, (C8480h) null);
        aVar64.mo60269d("FinderMineTabProfileEntranceDisplayType");
        aVar64.mo60268b("ME_FINDER_ENTRY_FINAL_SWITCH", C64197v.m75537f(0, 1, 2), C64197v.m75537f("现网", "全开", "全关"));
        f99193I1 = aVar64;
        C36665a aVar65 = new C36665a(15, "话题最大长度改为10", (C32227p) null, 4, (C8480h) null);
        aVar65.mo60269d("FinderTopicTextLimit");
        aVar65.mo60268b("MAX_TOPIC_LENGTH_CONFIG", C26236u.m33719b(10), C26236u.m33719b("话题最大长度改为10"));
        f99202J1 = aVar65;
        C36665a aVar66 = new C36665a(0, "话题推荐开关", (C32227p) null, 4, (C8480h) null);
        aVar66.mo60269d("FinderSuggestTagViewShow");
        aVar66.mo60268b("TOPIC_RECOMMEND_CONFIG", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        C36665a aVar67 = new C36665a(1, "打开切换身份评论", (C32227p) null, 4, (C8480h) null);
        aVar67.mo60270f(C32735h.C32737c.clicfg_finder_can_switch_scene);
        aVar67.mo60268b("CAN_SWITCH_SCENE", C26236u.m33719b(1), C26236u.m33719b("打开"));
        f99211K1 = aVar67;
        C36665a aVar68 = new C36665a(0, "发现页没红点，是否默认跳热门", (C32227p) null, 4, (C8480h) null);
        aVar68.mo60270f(C32735h.C32737c.clicfg_finder_is_jump_hot_without_entrance_reddot);
        aVar68.mo60268b("IS_HARD_JUMP_HOT_WITHOUT_ENTRANCE_REDDOT", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99220L1 = aVar68;
        new C35469d("重置切换身份提示", C14293h.f39840d);
        C36665a aVar69 = new C36665a(1000, "最大at数改为3个", (C32227p) null, 4, (C8480h) null);
        aVar69.mo60269d("FinderMaxMentionSbCount");
        aVar69.mo60268b("MAX_AT_COUNT_CONFIG", C26236u.m33719b(3), C26236u.m33719b("最大at数改为3个"));
        f99229M1 = aVar69;
        new C35469d("清除本地包厢数据", C37540p1.f99596d).mo60273m("包厢本地配置");
        C36665a aVar70 = new C36665a(1000, "包厢消息上限", (C32227p) null, 4, (C8480h) null);
        aVar70.mo60268b("LIVE_BOX_MAX_MSG", C64197v.m75537f(10, 50, 1000), C64197v.m75537f(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "50", "1000"));
        aVar70.mo60273m("包厢本地配置");
        f99238N1 = aVar70;
        C36665a aVar71 = new C36665a(1, "直播包厢开关", (C32227p) null, 4, (C8480h) null);
        aVar71.mo60270f(C32735h.C32737c.clicfg_finder_enable_live_box);
        aVar71.mo60268b("LIVE_BOX_ENABLE_SWITCH_1", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        aVar71.mo60273m("包厢本地配置");
        f99245O1 = aVar71;
        new C35469d("评论点赞重试间隔改为1s", C37531i.f99588d);
        new C35469d("测试视频号bitmap缓存", C14282c2.f39829d);
        new C35469d("清除keybuf/账号数据", C37546b.f99601d);
        new C35469d("清空keybuf", C37545a.f99600d);
        C36665a aVar72 = new C36665a(80, "RecyclerView滑动速度", (C32227p) null, 4, (C8480h) null);
        aVar72.mo60268b("RECYCLERVIEW_SPEED", C64197v.m75537f(80, 50, 60, 70, 80, 90, 100, 130), C64197v.m75537f("默认(0.8)", "0.5倍", "0.6倍", "0.7倍", "0.8倍", "0.9倍", "1倍", "1.3倍"));
        f99262Q1 = aVar72;
        C36665a aVar73 = new C36665a(100, "直播广场RecyclerView滑动速度", (C32227p) null, 4, (C8480h) null);
        aVar73.mo60268b("NEARBY_RECYCLERVIEW_SPEED", C64197v.m75537f(100, 50, 60, 70, 80, 90, 100, 130), C64197v.m75537f("默认(1)", "0.5倍", "0.6倍", "0.7倍", "0.8倍", "0.9倍", "1倍", "1.3倍"));
        f99271R1 = aVar73;
        C36665a aVar74 = new C36665a(300, "loadmore假菊花时长", (C32227p) null, 4, (C8480h) null);
        aVar74.mo60269d("FinderFakeLoadingDurationMS");
        aVar74.mo60268b("TIMELINE_LOADING_EXPIRED_TIME", C64197v.m75537f(100, 200, 400, 500, 600, 700, 800, 1000, 3000), C64197v.m75537f("100", "200", "400", "500", "600", "700", "800", "1000", "3000"));
        C36665a aVar75 = new C36665a(1, "红点是否限频", (C32227p) null, 4, (C8480h) null);
        aVar75.mo60268b("USERINFO_FINDER_TEST_RED_DOT_FACTOR_INT_SYNC", C64197v.m75537f(1, 1000000000), C64197v.m75537f("默认", "无限制"));
        aVar75.mo60273m("常用");
        aVar75.mo60267a(".com.tencent.mm.debug.finder.reddot.notimelimit");
        f99280S1 = aVar75;
        String str2 = "否";
        new C36665a(-1, "后台合成", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_VIDEO_REMUX_BACKGROUND_INT_SYNC", C64197v.m75537f(-1, 0, 1), C64197v.m75537f("X实验配置", str2, "是"));
        new C36665a((BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) ? 1 : 0, "特效", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_EDITOR_MAGIC_INT_SYNC", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        new C36665a(0, "允许3:4视频比例", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_VIDEO_RATIO_3_4_INT_SYNC", C64197v.m75537f(0, 1, 2), C64197v.m75537f("默认", "开", "关"));
        C36665a aVar76 = new C36665a(-1, "只看某个feed", (C32227p) null, 4, (C8480h) null);
        String str3 = "3";
        aVar76.mo60268b("USERINFO_FINDER_CARE_FEED_TYPE_INT", C64197v.m75537f(-1, 2, 4, 8), C64197v.m75537f(NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, "FINDER_FEED_PHOTO", "FINDER_FEED_VIDEO", "FINDER_FEED_MIX_MEDIA"));
        f99289T1 = aVar76;
        new C35469d("复制finder配置到剪贴板", C37525e.f99584d);
        C36665a aVar77 = new C36665a(-1, "个人中心用户状态", (C32227p) null, 4, (C8480h) null);
        aVar77.mo60268b("FINDER_SELF_STATE", new ArrayList(C64197v.m75537f(1, 2, 3, 4, 5, 6, 7, -1)), new ArrayList(C64197v.m75537f("无发表资格", "有发表资格但未创建账号", "账号处于正常状态", "账号被封禁", "账号审核中", "账号被禁言", "全网禁言", "reset")));
        f99325X1 = aVar77;
        new C35469d("重置首次获得发表权限标志", C14332w1.f39879d);
        new C35469d("重置创建活动协议勾选", C14330v1.f39877d);
        new C35469d("重置添加到浮窗提示次数", C14335x1.f39882d);
        new C36316a(true, "自动触发正例反馈", (String) null, 4, (C8480h) null);
        new C35469d("清理New红点配置", C14279c.f39826d);
        new C35469d("清理更多相似动态状态", C14283d.f39830d);
        C36665a aVar78 = new C36665a(0, "打开评论抽屉是否调整feed位置", (C32227p) null, 4, (C8480h) null);
        aVar78.mo60268b("IS_ADJUST_FEED_WHEN_OPEN_DRAWER", C64197v.m75537f(0, 1), C64197v.m75537f("默认模式(关闭)", "自动调整模式"));
        f99334Y1 = aVar78;
        C37016a aVar79 = new C37016a(0, "refresh假菊花时长");
        aVar79.mo60270f(C32735h.C32737c.clicfg_finder_fake_preload_tab_refresh_time);
        aVar79.mo60268b("TIMELINE_REFRESH_EXPIRED_TIME", new ArrayList(C64197v.m75537f(500L, 100L, 200L, 400L, 500L, 600L, 700L, 800L, 1000L, 3000L)), C64197v.m75537f("默认(500)", "100", "200", "400", "500", "600", "700", "800", "1000", "3000"));
        f99343Z1 = aVar79;
        C37016a aVar80 = new C37016a(1200000, "预加载debug轮询时长");
        aVar80.mo60270f(C32735h.C32737c.clicfg_finder_check_preload_tab_refresh_time);
        String str4 = str;
        aVar80.mo60268b("PRELOAD_DURATION", new ArrayList(C64197v.m75537f(1200000L, Long.valueOf(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION), 10000L, 60000L)), C64197v.m75537f("默认(20min)", str4, "10s", "1min"));
        new C36665a(0, "视频模板", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_EDITOR_VIDEO_TEMPLATE_INT_SYNC", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        new C36665a(1, "点赞事件UI", (C32227p) null, 4, (C8480h) null).mo60268b("TIMELINE_LIKE_EVENT_CONFIG", C64197v.m75537f(1, 2), C64197v.m75537f("卡片模式", "m+n模式"));
        C36665a aVar81 = new C36665a(-1, "FIDNER_RED_DOT_STYLE", (C32227p) null, 4, (C8480h) null);
        aVar81.mo60268b("FIDNER_RED_DOT_STYLE", C64197v.m75537f(0, 1, 2, 3, 4, 5, 7, 6, -1), C64197v.m75537f("4(ICON)+liked", "7(SQUARE_ICON)+liked", "11(ICON_WITH_RED_DOT)+liked", "12(SQUARE_ICON_WITH_RED_DOT)+liked", "liked+13(RIGHT_ICON_WITH_RED_DOT)", "liked+14(RIGHT_SQUARE_ICON_WITH_RED_DOT)", "4(ICON)", "7(SQUARE_ICON)", "default"));
        f99351a2 = aVar81;
        C36665a aVar82 = new C36665a(1, "MARK_READ_OPEN", (C32227p) null, 4, (C8480h) null);
        aVar82.mo60269d("FinderMarkReadOpenControl");
        String str5 = str4;
        aVar82.mo60268b("FinderMarkReadOpenControl", new ArrayList(C64197v.m75537f(0, 1, 0)), C64197v.m75537f("默认(1)", "打开入口(1)", "关闭入口(0)"));
        f99367c2 = aVar82;
        C36665a aVar83 = new C36665a(1, "是否打开私信入口", (C32227p) null, 4, (C8480h) null);
        aVar83.mo60270f(C32735h.C32737c.clicfg_finder_msg_entrance_enable);
        aVar83.mo60268b("ENABLE_FINDER_MESSAGE", C64197v.m75537f(0, 1, 0), C64197v.m75537f("默认", "打开", "关闭"));
        f99376d2 = aVar83;
        C36665a aVar84 = new C36665a(1, "是否开启打开视频号新动画", (C32227p) null, 4, (C8480h) null);
        aVar84.mo60268b("ENABLE_FINDER_OPEN_NEW_ANIM", C64197v.m75537f(0, 1, 0), C64197v.m75537f("默认", "打开", "关闭"));
        f99385e2 = aVar84;
        C36665a aVar85 = new C36665a(1, "截屏上报", (C32227p) null, 4, (C8480h) null);
        aVar85.mo60270f(C32735h.C32737c.clicfg_finder_android_report_when_screen_shot);
        aVar85.mo60268b("FINDER_REPORT_WHEN_SCREEN_SHOT", new ArrayList(C64197v.m75537f(1, 0)), C64197v.m75537f("打开", "关闭"));
        f99394f2 = aVar85;
        C36665a aVar86 = new C36665a(0, "是否在朋友tab制造个假跳转热门数据", (C32227p) null, 4, (C8480h) null);
        aVar86.mo60268b("FAKE_CARD_JUMP_HOT_TAB_DATA", new ArrayList(C64197v.m75537f(1, 0)), C64197v.m75537f("打开", "关闭"));
        f99403g2 = aVar86;
        C36665a aVar87 = new C36665a(0, "加载图片渐现", (C32227p) null, 4, (C8480h) null);
        aVar87.mo60268b("LOAD_IMAGE_ANIM", new ArrayList(C64197v.m75537f(1, 0)), C64197v.m75537f("打开", "关闭"));
        f99412h2 = aVar87;
        C36665a aVar88 = new C36665a(800, "切换ViewPage速度", (C32227p) null, 4, (C8480h) null);
        aVar88.mo60268b("SWITC_VIEW_PAGE_TIME", new ArrayList(C64197v.m75537f(0, 200, 400, 600, 700, 800, 1000, 1200, 1500)), C64197v.m75537f("默认", "200", "400", "600", "700", "800", "1000", "1200", "1500"));
        f99421i2 = aVar88;
        new C36316a(false, "是否在作者视角动态展示假数据", (String) null, 4, (C8480h) null);
        new C35469d("重置私密feed点赞提示次数", C14290g.f39837d);
        C36665a aVar89 = new C36665a(0, "支持匿名赞", (C32227p) null, 4, (C8480h) null);
        aVar89.mo60270f(C32735h.C32737c.clicfg_finder_self_private_like_enable);
        aVar89.mo60268b("USERINFO_SELF_PRIVATE_LIKE_INT_SYNC", new ArrayList(C64197v.m75537f(0, 1, 0)), C64197v.m75537f("默认", "支持", "不支持"));
        f99430j2 = aVar89;
        new C35469d("重置私密feed点赞和匿名赞提示次数", C14338y1.f39885d);
        C36665a aVar90 = new C36665a(1, "视频质量分上报", (C32227p) null, 4, (C8480h) null);
        aVar90.mo60270f(C32735h.C32737c.clicfg_finder_report_quality_info);
        aVar90.mo60268b("REPORT_QUALITY_INFO", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99438k2 = aVar90;
        C36665a aVar91 = new C36665a(0, "发表支持4:3", (C32227p) null, 4, (C8480h) null);
        aVar91.mo60270f(C32735h.C32737c.clicfg_finder_video_3_4_ratio_enable);
        aVar91.mo60268b("USERINFO_FINDER_VIDEO_RATIO_3_4_INT_SYNC", new ArrayList(C64197v.m75537f(0, 1, 0)), C64197v.m75537f("默认", "支持", "不支持"));
        C36665a aVar92 = new C36665a(0, "TL导航栏icon样式", (C32227p) null, 4, (C8480h) null);
        aVar92.mo60268b("POST_ENTRANCE_OUTSIDE_ENABLE", new ArrayList(C64197v.m75537f(0, 1, 2, 3)), C64197v.m75537f("[A]默认", "[B]发表右上角+热门加附近", "[C]搜索右上角+热门加附近", "[D]热门加附近"));
        f99446l2 = aVar92;
        C37537o1 o1Var = new C37537o1(259200);
        o1Var.mo60271i(3901, "timeline_tab_cache_time_value");
        o1Var.mo60268b("KEEP_URL_VALID_TIME", C64197v.m75537f(259200, 60), C64197v.m75537f("默认3天", "1分钟"));
        f99454m2 = o1Var;
        new C36665a(0, "切换朋友圈跳视频号入口类型", C37523a2.f99582d).mo60268b("SNS_TO_FINDER_SWITCH", C64197v.m75537f(0, 1, 2), C64197v.m75537f("默认", "跳转方式1", "跳转方式2"));
        C36665a aVar93 = new C36665a(0, "发表上传block", (C32227p) null, 4, (C8480h) null);
        aVar93.mo60268b("DEBUG_POST_UPLOAD_BLOCK", new ArrayList(C64197v.m75537f(0, 20)), C64197v.m75537f("不block", "block 20秒"));
        f99463n2 = aVar93;
        C36665a aVar94 = new C36665a(30, "18054限制曝光数上报", (C32227p) null, 4, (C8480h) null);
        aVar94.mo60270f(C32735h.C32737c.clicfg_finder_18054_exposed_count_limit);
        aVar94.mo60268b("DEBUG_POST_UPLOAD_BLOCK", new ArrayList(C64197v.m75537f(30, 3)), C64197v.m75537f("默认30", str3));
        f99472o2 = aVar94;
        new C35469d("红点数据库插入数据标记位", C14288f.f39835d);
        new C36665a(0, "收藏出相似流", (C32227p) null, 4, (C8480h) null).mo60268b("DEBUG_FAV_SIMILAR", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("使用后台配置", "支持"));
        new C36665a(-1, "follow_r_p_o_interval", (C32227p) null, 4, (C8480h) null).mo60268b("follow_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        new C36665a(-1, "friend_r_p_o_interval", (C32227p) null, 4, (C8480h) null).mo60268b("friend_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        new C36665a(-1, "hot_r_p_o_interval", (C32227p) null, 4, (C8480h) null).mo60268b("hot_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        new C36665a(-1, "nearby_r_p_o_interval", (C32227p) null, 4, (C8480h) null).mo60268b("nearby_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        C36665a aVar95 = new C36665a(-1, "follow_n_r_p_o_interval", (C32227p) null, 4, (C8480h) null);
        aVar95.mo60268b("follow_no_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99482p2 = aVar95;
        C36665a aVar96 = new C36665a(-1, "friend_n_r_p_o_interval", (C32227p) null, 4, (C8480h) null);
        aVar96.mo60268b("friend_no_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99491q2 = aVar96;
        C36665a aVar97 = new C36665a(-1, "hot_n_r_p_o_interval", (C32227p) null, 4, (C8480h) null);
        aVar97.mo60268b("hot_no_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99500r2 = aVar97;
        C36665a aVar98 = new C36665a(-1, "nearby_n_r_p_o_interval", (C32227p) null, 4, (C8480h) null);
        aVar98.mo60268b("nearby_no_reddot_prefetch_outter_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99509s2 = aVar98;
        C36665a aVar99 = new C36665a(-1, "follow_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar99.mo60268b("follow_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99518t2 = aVar99;
        C36665a aVar100 = new C36665a(-1, "friend_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar100.mo60268b("friend_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99527u2 = aVar100;
        C36665a aVar101 = new C36665a(-1, "hot_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar101.mo60268b("hot_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99536v2 = aVar101;
        C36665a aVar102 = new C36665a(-1, "nearby_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar102.mo60268b("nearby_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99545w2 = aVar102;
        C36665a aVar103 = new C36665a(-1, "follow_n_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar103.mo60268b("follow_no_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99555x2 = aVar103;
        C36665a aVar104 = new C36665a(-1, "friend_n_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar104.mo60268b("friend_no_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99565y2 = aVar104;
        C36665a aVar105 = new C36665a(-1, "hot_n_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar105.mo60268b("hot_no_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99574z2 = aVar105;
        C36665a aVar106 = new C36665a(-1, "nearby_n_r_p_i_interval", (C32227p) null, 4, (C8480h) null);
        aVar106.mo60268b("nearby_no_reddot_prefetch_inner_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99122A2 = aVar106;
        C36665a aVar107 = new C36665a(-1, "tab_inner_hot_prefetch_switch", (C32227p) null, 4, (C8480h) null);
        aVar107.mo60268b("tab_inner_hot_prefetch_switch", new ArrayList(C64197v.m75537f(-1, 1, 0)), C64197v.m75537f("默认", "true", "false"));
        f99131B2 = aVar107;
        C36665a aVar108 = new C36665a(-1, "new_follow_r_p_interval", (C32227p) null, 4, (C8480h) null);
        aVar108.mo60268b("new_follow_reddot_prefetch_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99140C2 = aVar108;
        C36665a aVar109 = new C36665a(-1, "new_friend_r_p_interval", (C32227p) null, 4, (C8480h) null);
        aVar109.mo60268b("new_friend_reddot_prefetch_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99149D2 = aVar109;
        C36665a aVar110 = new C36665a(-1, "new_hot_r_p_interval", (C32227p) null, 4, (C8480h) null);
        aVar110.mo60268b("new_hot_reddot_prefetch_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99158E2 = aVar110;
        C36665a aVar111 = new C36665a(-1, "new_nearby_r_p_interval", (C32227p) null, 4, (C8480h) null);
        aVar111.mo60268b("new_nearby_reddot_prefetch_interval", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99167F2 = aVar111;
        C36665a aVar112 = new C36665a(-1, "follow_outter_vaild", (C32227p) null, 4, (C8480h) null);
        aVar112.mo60268b("follow_outter_prefetch_valid_time", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99176G2 = aVar112;
        C36665a aVar113 = new C36665a(-1, "friend_outter_vaild", (C32227p) null, 4, (C8480h) null);
        aVar113.mo60268b("friend_outter_prefetch_valid_time", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99185H2 = aVar113;
        C36665a aVar114 = new C36665a(-1, "hot_outter_vaild", (C32227p) null, 4, (C8480h) null);
        aVar114.mo60268b("hot_outter_prefetch_valid_time", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99194I2 = aVar114;
        C36665a aVar115 = new C36665a(-1, "nearby_outter_vaild", (C32227p) null, 4, (C8480h) null);
        aVar115.mo60268b("nearby_outter_prefetch_valid_time", new ArrayList(C64197v.m75537f(-1, 0, 10000, 10000, 30000, valueOf)), C64197v.m75537f("默认", "0s", "10s", "20s", "30s", "1min"));
        f99203J2 = aVar115;
        C36665a aVar116 = new C36665a(0, "红点预加载忽略标志位直接触发", (C32227p) null, 4, (C8480h) null);
        aVar116.mo60268b("IGNORE_RED_DOT_PRELOAD_FLAG", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99212K2 = aVar116;
        C36665a aVar117 = new C36665a(1, "是否本地调整点赞头像顺序", (C32227p) null, 4, (C8480h) null);
        aVar117.mo60270f(C32735h.C32737c.clicfg_adjust_avatar_order_like);
        aVar117.mo60268b("ADJUST_AVATAR_ORDER_LIKE", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99221L2 = aVar117;
        C36665a aVar118 = new C36665a(1, "引导用户点赞自己的视频", (C32227p) null, 4, (C8480h) null);
        aVar118.mo60270f(C32735h.C32737c.clicfg_finder_self_like_edu);
        aVar118.mo60268b("DEBUG_SELF_LIKE_EDU", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "支持"));
        f99230M2 = aVar118;
        C36665a aVar119 = new C36665a(0, "引导用户点赞后评论", (C32227p) null, 4, (C8480h) null);
        C32735h.C32737c cVar4 = C32735h.C32737c.clicfg_finder_like_comment_edu;
        aVar119.mo60270f(cVar4);
        aVar119.mo60268b("DEBUG_SELF_LIKE_EDU", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "支持"));
        f99239N2 = aVar119;
        C36665a aVar120 = new C36665a(0, "火赞动态下发方案", (C32227p) null, 4, (C8480h) null);
        aVar120.mo60268b("FIRE_DYNAMIC_CONFIG", C64197v.m75537f(0, 1, 2), C64197v.m75537f("正常", "不使用云端富文本配置", "不使用云端配置"));
        f99246O2 = aVar120;
        new C35469d("重置profile展示微信资料页提示", C14295h2.f39842d);
        new C36665a(1, "专栏布局样式大小", (C32227p) null, 4, (C8480h) null).mo60268b("STREAM_CARD_LAYOUT", new ArrayList(C64197v.m75537f(0, 1, 2)), C64197v.m75537f("不支持", "大大大 ", " 小小小 "));
        C36665a aVar121 = new C36665a(0, "feed播放一段时间后，出评论输入框", (C32227p) null, 4, (C8480h) null);
        aVar121.mo60270f(C32735h.C32737c.clicfg_finder_feed_show_comment_auto);
        aVar121.mo60268b("FEED_COMMENT_EDU", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99254P2 = aVar121;
        C36665a aVar122 = new C36665a(0, "原创帐号开关", (C32227p) null, 4, (C8480h) null);
        aVar122.mo60268b("ORIGIN_ACCOUNT_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99263Q2 = aVar122;
        new C35469d("原创帐号发表提示和红点重置", C14325t1.f39872d);
        C36665a aVar123 = new C36665a(0, "朋友的外显评论是否显示头像", (C32227p) null, 4, (C8480h) null);
        aVar123.mo60270f(C32735h.C32737c.clicfg_finder_friend_comment_show_header);
        aVar123.mo60268b("DEBUG_SELF_LIKE_EDU", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99272R2 = aVar123;
        C36665a aVar124 = new C36665a(0, "强制所有feed都为新闻类", (C32227p) null, 4, (C8480h) null);
        aVar124.mo60268b("FEED_ALL_FORCE_NEWS", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99281S2 = aVar124;
        C36665a aVar125 = new C36665a(10, "首次打开热门预加载请求随机数", (C32227p) null, 4, (C8480h) null);
        aVar125.mo60270f(C32735h.C32737c.clicfg_finder_first_hot_tab_preload_random);
        aVar125.mo60268b("FIRST_HOT_TAB_PRELOAD_RANDOM", new ArrayList(C64197v.m75537f(-1, 0, 2, 5, 10)), C64197v.m75537f("重置first", "关闭", "50%", "20%", "10%"));
        C14304k1 k1Var = C14304k1.f39851d;
        C87412m.m108594g(k1Var, "clickListener");
        aVar125.f94895n = k1Var;
        f99290T2 = aVar125;
        C36665a aVar126 = new C36665a(0, "3天2天总开关", (C32227p) null, 4, (C8480h) null);
        aVar126.mo60270f(C32735h.C32737c.clicfg_finder_3_day_2_day_enable);
        aVar126.mo60268b("THREE_DAY_TWO_DAY_ENABLE", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99299U2 = aVar126;
        C36665a aVar127 = new C36665a(259200000, "3天超时阈值", (C32227p) null, 4, (C8480h) null);
        aVar127.mo60270f(C32735h.C32737c.clicfg_finder_3_day_threshold);
        aVar127.mo60268b("THREE_DAY_THRESHOLD", new ArrayList(C64197v.m75537f(259200000, 30000, 180000)), C64197v.m75537f("3天", "30 秒", "3 分钟"));
        f99308V2 = aVar127;
        C36665a aVar128 = new C36665a(172800000, "2天不出阈值", (C32227p) null, 4, (C8480h) null);
        aVar128.mo60270f(C32735h.C32737c.clicfg_finder_2_day_threshold);
        aVar128.mo60268b("TWO_DAY_THRESHOLD", new ArrayList(C64197v.m75537f(172800000, 20000, 120000)), C64197v.m75537f("2天", "20 秒", "2 分钟"));
        aVar128.mo60270f(cVar4);
        aVar128.mo60268b("DEBUG_SELF_LIKE_EDU", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "支持"));
        f99317W2 = aVar128;
        C36665a aVar129 = new C36665a(0, "展示热门搜索标签", (C32227p) null, 4, (C8480h) null);
        aVar129.mo60270f(C32735h.C32737c.clicfg_finder_timeline_hot_word_enable);
        aVar129.mo60268b("展示热门搜索标签", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("不展示", "展示"));
        f99326X2 = aVar129;
        C36665a aVar130 = new C36665a(1, "展示快速分享视频号样式", (C32227p) null, 4, (C8480h) null);
        aVar130.mo60270f(C32735h.C32737c.clicfg_finder_quick_share);
        aVar130.mo60268b("展示快速分享视频号样式", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("不展示", "展示"));
        C36665a aVar131 = new C36665a(1, "展示快速分享直播样式", (C32227p) null, 4, (C8480h) null);
        aVar131.mo60270f(C32735h.C32737c.clicfg_finder_live_quick_share);
        aVar131.mo60268b("展示快速分享直播样式", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("不展示", "展示"));
        C36665a aVar132 = new C36665a(0, "Profile封面测试开关", (C32227p) null, 4, (C8480h) null);
        aVar132.mo60268b("Profile封面测试开关", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭测试", "打开测试"));
        f99335Y2 = aVar132;
        C36665a aVar133 = new C36665a(0, "发现页红点自动测试", (C32227p) null, 4, (C8480h) null);
        aVar133.mo60268b("发现页红点自动测试", new ArrayList(C64197v.m75537f(0, 1, 2, 3, 4, 5, 6, 7, 8)), C64197v.m75537f("关闭测试", "测试短文本", "测试长文本", "测试无文本", "测试无IconUrl", "朋友推荐多Icon测试-1个Icon", "朋友推荐多Icon测试-2个Icon", "朋友推荐多Icon测试-3个Icon", "朋友推荐多Icon测试-4个Icon"));
        f99344Z2 = aVar133;
        C36665a aVar134 = new C36665a(0, "发现页红点mock附加信息", (C32227p) null, 4, (C8480h) null);
        aVar134.mo60268b("发现页红点mock附加信息", new ArrayList(C64197v.m75537f(0, 1, 2, 3, 4)), C64197v.m75537f("不附加", "附加副标题", "附加副标题 + 副标题icon", "附加副标题 + NewText", "附加副标题 + 副标题icon + NewText"));
        f99352a3 = aVar134;
        C36665a aVar135 = new C36665a(0, "发现页红点是否只支持中文", (C32227p) null, 4, (C8480h) null);
        String str6 = str2;
        aVar135.mo60268b("是否只支持中文", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f(str6, "只支持中文"));
        f99360b3 = aVar135;
        C36665a aVar136 = new C36665a(0, "Profile展示QQ音乐tab", (C32227p) null, 4, (C8480h) null);
        aVar136.mo60270f(C32735h.C32737c.clicfg_finder_qq_music_tab);
        aVar136.mo60268b("Profile展示QQ音乐tab", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("不展示", "展示"));
        f99368c3 = aVar136;
        C36665a aVar137 = new C36665a(1, "Profile请求MvTab", (C32227p) null, 4, (C8480h) null);
        aVar137.mo60270f(C32735h.C32737c.finder_query_mv_tab_enable);
        aVar137.mo60268b("Profile请求MvTab", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("不请求", "请求"));
        f99377d3 = aVar137;
        C36665a aVar138 = new C36665a(1, "Profile移除MvTab出提示气泡次数", (C32227p) null, 4, (C8480h) null);
        aVar138.mo60270f(C32735h.C32737c.finder_move_mv_tab_tips_times);
        aVar138.mo60268b("次数", new ArrayList(C64197v.m75537f(1, 5, 10)), C64197v.m75537f("1次", "5次", "10次"));
        f99386e3 = aVar138;
        new C36665a(1, "视频号暂停新样式是否开启", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_PAUSE_CHANGE_ENABLE_SWITCH", new ArrayList(C64197v.m75537f(1, 0)), C64197v.m75537f("打开", "关闭"));
        C36665a aVar139 = new C36665a(1, "视频号投屏功能开关", (C32227p) null, 4, (C8480h) null);
        aVar139.mo60268b("FINDER_DLNA_PROJECTION_SCREEN_SWITCH", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关", "开"));
        aVar139.mo60270f(C32735h.C32737c.clicfg_finder_projection_screen);
        f99395f3 = aVar139;
        C36665a aVar140 = new C36665a(1, "朋友圈直播一键清除", (C32227p) null, 4, (C8480h) null);
        aVar140.mo60270f(C32735h.C32737c.clicfg_finder_sns_clear_btn_ui);
        aVar140.mo60268b("FINDER_SNS_CLEAR_BTN", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        new C35469d("红点账号升级标记位清理", C14318r.f39865d);
        C36665a aVar141 = new C36665a(0, "音乐跟拍入口", (C32227p) null, 4, (C8480h) null);
        aVar141.mo60270f(C32735h.C32737c.clicfg_finder_follow_pat_entrance);
        aVar141.mo60268b("FINDER_FOLLOW_PAT_ENTRANCE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        C36665a aVar142 = new C36665a(0, "消息红点透传开关", (C32227p) null, 4, (C8480h) null);
        aVar142.mo60270f(C32735h.C32737c.clicfg_finder_show_mention_switch_entry);
        String str7 = "默认";
        aVar142.mo60268b("FINDER_SHOW_MENTION_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f(str7, "打开消息设置开关；"));
        f99404g3 = aVar142;
        C36665a aVar143 = new C36665a(0, "私信消息透穿小人头数字红点", (C32227p) null, 4, (C8480h) null);
        aVar143.mo60270f(C32735h.C32737c.clicfg_finder_private_pc_count_style_switch);
        aVar143.mo60268b("FINDER_PRIVATE_MESSAGE_TL_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f(str7, "私信消息透穿小人头数字红点"));
        f99413h3 = aVar143;
        C36665a aVar144 = new C36665a(0, "发现页消息红点开关", (C32227p) null, 4, (C8480h) null);
        aVar144.mo60270f(C32735h.C32737c.clicfg_finder_show_entrance_mention_switch);
        aVar144.mo60268b("FINDER_ENTRANCE_MESSAGE_RED_DOT", C64197v.m75537f(0, 1), C64197v.m75537f("不展示消息数字红点", "展示消息数字红点"));
        f99422i3 = aVar144;
        C36665a aVar145 = new C36665a(1, "视频号私信主动透传小人头开关", (C32227p) null, 4, (C8480h) null);
        aVar145.mo60270f(C32735h.C32737c.clicfg_finder_show_mention_receiver_private_msg_switch);
        aVar145.mo60268b("FINDER_PRIVATE_MESSAGE_SHOW_WAY", C64197v.m75537f(0, 1), C64197v.m75537f("被动", "主动"));
        f99431j3 = aVar145;
        C36665a aVar146 = new C36665a(1, "是否支持分享专辑", (C32227p) null, 4, (C8480h) null);
        aVar146.mo60270f(C32735h.C32737c.clicfg_finder_share_album_enable);
        aVar146.mo60268b("IS_ENABLE_SHARE_ALBUM", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99439k3 = aVar146;
        C36665a aVar147 = new C36665a(1, "是否支持分享专辑预加载", (C32227p) null, 4, (C8480h) null);
        aVar147.mo60270f(C32735h.C32737c.clicfg_finder_share_album_preload_enable);
        aVar147.mo60268b("IS_ENABLE_SHARE_ALBUM_PRELOAD", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99447l3 = aVar147;
        new C36665a(0, "展示智能滤镜场景", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SCENE_INT_SYNC", C64197v.m75537f(0, 1, 2), C64197v.m75537f(str7, "开", "关"));
        new C36665a(0, "展示智能滤镜人脸关键点", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_FACE_LANDMARKS_INT_SYNC", C64197v.m75537f(0, 1, 2), C64197v.m75537f(str7, "开", "关"));
        C36665a aVar148 = new C36665a(1, "长视频发表入口", (C32227p) null, 4, (C8480h) null);
        aVar148.mo60270f(C32735h.C32737c.clicfg_finder_long_video_post_entrance);
        aVar148.mo60268b("MEGA_VIDEO_POST_ENTRANCE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99455m3 = aVar148;
        C36665a aVar149 = new C36665a(0, "去掉长短视频选择弹窗", (C32227p) null, 4, (C8480h) null);
        aVar149.mo60268b("DISABLE_MEGA_VIDEO_SELECT_DIALOG", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        aVar149.mo60270f(C32735h.C32737c.clicfg_finder_disable_mega_video_select_dialog);
        f99464n3 = aVar149;
        new C36665a(0, "开启hevc编码", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_HEVC_ENCODE_OPTION_INT_SYNC", C64197v.m75537f(0, 1, 2), C64197v.m75537f("关", "vcode", "系统硬编"));
        C37016a aVar150 = new C37016a(0, "长视频第一阶段预加载size");
        aVar150.mo60270f(C32735h.C32737c.clicfg_finder_long_video_first_preload);
        aVar150.mo60268b("MEGA_VIDEO_PRELOAD_FIRST_SIZE", C64197v.m75537f(2097152L, 2048L), C64197v.m75537f("2M", "200K"));
        C37016a aVar151 = new C37016a(0, "长视频第二阶段预加载size");
        aVar151.mo60270f(C32735h.C32737c.clicfg_finder_long_video_second_preload);
        aVar151.mo60268b("MEGA_VIDEO_PRELOAD_SECOND_SIZE", C64197v.m75537f(2097152L, 2048L), C64197v.m75537f("2M", "200K"));
        C36665a aVar152 = new C36665a(0, "聊天视频号卡片进入长视频横屏播放器", (C32227p) null, 4, (C8480h) null);
        aVar152.mo60268b("FINDER_CHAT_CARD_ENTER_LONG_VIDEO_SHARE_UI", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99473o3 = aVar152;
        C36665a aVar153 = new C36665a(1, "发现页进入优化开关-测试用", (C32227p) null, 4, (C8480h) null);
        aVar153.mo60268b("FINDER_ENTER_OP_EXPT_TEST", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        aVar153.mo60270f(C32735h.C32737c.clicfg_finder_enter_op_expt);
        f99483p3 = aVar153;
        C36665a aVar154 = new C36665a(0, "公众号横卡片进入长视频横屏播放器", (C32227p) null, 4, (C8480h) null);
        aVar154.mo60270f(C32735h.C32737c.clicfg_finder_biz_enter_long_video_share);
        aVar154.mo60268b("FINDER_BIZ_ENTER_LONG_VIDEO_SHARE_UI", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99492q3 = aVar154;
        C36665a aVar155 = new C36665a(0, "横屏播放器大卡样式", (C32227p) null, 4, (C8480h) null);
        aVar155.mo60270f(C32735h.C32737c.clicfg_finder_biz_new_style_ui_big_card);
        aVar155.mo60268b("FINDER_BIZ_NEW_STYLE_UI_BIG_CARD", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99501r3 = aVar155;
        C36665a aVar156 = new C36665a(0, "横屏播放器新形态", (C32227p) null, 4, (C8480h) null);
        aVar156.mo60270f(C32735h.C32737c.clicfg_finder_biz_horizontal_video_new_form);
        aVar156.mo60268b("FINDER_BIZ_HORIZONTAL_VIDEO_NEW_FORM", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99510s3 = aVar156;
        C36665a aVar157 = new C36665a(0, "横屏播放器半屏feed流形态", (C32227p) null, 4, (C8480h) null);
        aVar157.mo60270f(C32735h.C32737c.clicfg_finder_biz_horizontal_video_half_screen);
        aVar157.mo60268b("FINDER_BIZ_HORIZONTAL_VIDEO_HALF_SCREEN", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99519t3 = aVar157;
        C36665a aVar158 = new C36665a(0, "横屏播放器切换视频后相关列表刷新", (C32227p) null, 4, (C8480h) null);
        aVar158.mo60270f(C32735h.C32737c.clicfg_finder_new_style_ui_click_refresh_list);
        aVar158.mo60268b("FINDER_NEW_STYLE_UI_CLICK_REFRESH_LSIT", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99528u3 = aVar158;
        C36665a aVar159 = new C36665a(1, "无spec时，视频码率默认选择", (C32227p) null, 4, (C8480h) null);
        aVar159.mo60270f(C32735h.C32737c.clicfg_finder_video_without_spec_default_bitrate);
        aVar159.mo60268b("WITHOUT_SPEC_DEFAULT_BIT_RATE", C64197v.m75537f(0, 1), C64197v.m75537f("xVO", "xV2/xV1"));
        f99537v3 = aVar159;
        C36665a aVar160 = new C36665a(1, "分享流跳转视频号默认Tab", (C32227p) null, 4, (C8480h) null);
        aVar160.mo60270f(C32735h.C32737c.clicfg_finder_share_jump_home_default_tab);
        aVar160.mo60268b("debugShareJumpHomeDefaultTab", C64197v.m75537f(0, 1, 2), C64197v.m75537f("关注", "朋友", "推荐"));
        f99546w3 = aVar160;
        C36665a aVar161 = new C36665a(1, "分享完播后弹出下拉引导", (C32227p) null, 4, (C8480h) null);
        aVar161.mo60270f(C32735h.C32737c.clicfg_finder_share_popup_pull_tips_enable);
        aVar161.mo60268b("debugSharePopupPullTipsLayout", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99556x3 = aVar161;
        C37016a aVar162 = new C37016a(10000, "分享完播下拉引导展示时长");
        aVar162.mo60268b("FINDER_SHARE_POPUP_PULL_TIPS_DURATION", C64197v.m75537f(3000L, 10000L), C64197v.m75537f("3秒", "10秒"));
        aVar162.mo60270f(C32735h.C32737c.clicfg_finder_share_popup_pull_tips_duration);
        f99566y3 = aVar162;
        C36665a aVar163 = new C36665a(0, "分享完播下拉引导是否显示描述", (C32227p) null, 4, (C8480h) null);
        aVar163.mo60268b("FINDER_SHARE_POPUP_PULL_TIPS_SHOW_DESC", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        aVar163.mo60270f(C32735h.C32737c.clicfg_finder_share_popup_pull_tips_show_desc);
        f99575z3 = aVar163;
        C36665a aVar164 = new C36665a(0, "分享完播向上滑动出下拉引导", (C32227p) null, 4, (C8480h) null);
        aVar164.mo60270f(C32735h.C32737c.clicfg_finder_share_scroll_tips_enable);
        aVar164.mo60268b("FINDER_SHARE_SCROLL_TIPS_LAYOUT", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99123A3 = aVar164;
        C37016a aVar165 = new C37016a(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, "分享完播向上滑动出下拉引导展示时长");
        aVar165.mo60268b("FINDER_SHARE_SCROLL_TIPS_DURATION", C64197v.m75537f(3000L, Long.valueOf(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION)), C64197v.m75537f("3秒", "5秒"));
        aVar165.mo60270f(C32735h.C32737c.clicfg_finder_share_scroll_tips_duration);
        f99132B3 = aVar165;
        C36665a aVar166 = new C36665a(0, "分享完播弹出视频号入口", (C32227p) null, 4, (C8480h) null);
        aVar166.mo60270f(C32735h.C32737c.clicfg_finder_share_popup_entrance_enable);
        aVar166.mo60268b("debugSharePopupEntrance", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99141C3 = aVar166;
        C36665a aVar167 = new C36665a(0, "分享完播出引导侧边栏开关", (C32227p) null, 4, (C8480h) null);
        aVar167.mo60268b("FINDER_SHARE_SIDE_GUIDE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar167.mo60270f(C32735h.C32737c.clicfg_finder_share_side_guide);
        f99150D3 = aVar167;
        C36665a aVar168 = new C36665a(0, "分享完播出引导下一个卡片开关", (C32227p) null, 4, (C8480h) null);
        aVar168.mo60268b("FINDER_SHARE_GUIDE_NEXT_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar168.mo60270f(C32735h.C32737c.clicfg_finder_share_guide_next);
        f99159E3 = aVar168;
        C36665a aVar169 = new C36665a(0, "分享到朋友圈文字同步到视频号评论", (C32227p) null, 4, (C8480h) null);
        aVar169.mo60268b("FINDER_FEED_SHARE_SNS_DESC_TO_COMMENT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar169.mo60270f(C32735h.C32737c.clicfg_finder_feed_share_sns_desc_to_comment);
        f99168F3 = aVar169;
        C36665a aVar170 = new C36665a(0, "创作者中心红点mock数据", (C32227p) null, 4, (C8480h) null);
        aVar170.mo60268b("FINDER_PERSONAL_CREATOR_CENTER", C64197v.m75537f(1, 0), C64197v.m75537f("打开mock", "关闭mock"));
        f99177G3 = aVar170;
        new C36665a(0, "推荐 TL snap 滑动体验", (C32227p) null, 4, (C8480h) null).mo60268b("TIMELINE_SNAP", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        C36665a aVar171 = new C36665a(0, "全局 TL snap 滑动体验", (C32227p) null, 4, (C8480h) null);
        aVar171.mo60270f(C32735h.C32737c.clicfg_finder_enable_global_snap);
        aVar171.mo60268b("TIMELINE_SNAP_GLOBAL", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        new C36665a(600, "snap 敏感度", (C32227p) null, 4, (C8480h) null).mo60268b("TIMELINE_SNAP_THRESHOLD", C64197v.m75537f(1, 300, 600, 1200, 2400, 4800, 6000), C64197v.m75537f("1", "300", "600", "1200", "2400", "4800", "6000"));
        C36665a aVar172 = new C36665a(1, "优化找最合适规格播放开关", (C32227p) null, 4, (C8480h) null);
        aVar172.mo60270f(C32735h.C32737c.clicfg_finder_opt_find_best_video_enable);
        aVar172.mo60268b("OPT_FIND_BEST_VIDEO_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99186H3 = aVar172;
        C36665a aVar173 = new C36665a(1, "修复reinit selector", (C32227p) null, 4, (C8480h) null);
        aVar173.mo60270f(C32735h.C32737c.clicfg_finder_fix_reinit_selector_enable);
        aVar173.mo60268b("FIX_REINIT_SELECTOR_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99195I3 = aVar173;
        C36665a aVar174 = new C36665a(1, "尝试转h265", (C32227p) null, 4, (C8480h) null);
        aVar174.mo60270f(C32735h.C32737c.clicfg_finder_tran_to_h265_if_enable);
        aVar174.mo60268b("TRT_TO_TRAN_265_IF_CAN", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99204J3 = aVar174;
        C36665a aVar175 = new C36665a(1, "是否支持解码器复用", (C32227p) null, 4, (C8480h) null);
        aVar175.mo60270f(C32735h.C32737c.clicfg_finder_ftpp_codec_reuse);
        aVar175.mo60268b("ENABLE_MEDIA_CODEC_REUSE", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99213K3 = aVar175;
        C36665a aVar176 = new C36665a(0, "是否支持视频号播放器画质增强", (C32227p) null, 4, (C8480h) null);
        aVar176.mo60270f(C32735h.C32737c.clicfg_channel_sharpen_value_xlab_android);
        aVar176.mo60268b("ENABLE_RENDERER_SHARPEN", new ArrayList(C64197v.m75537f(-2, -1, 0, 1, 2, 3, 4, 5, 6)), C64197v.m75537f("关闭", "关闭", "关闭", "打开-弱档", "打开-弱档", "打开-中档", "打开-中档", "打开-强档", "打开-强档"));
        f99222L3 = aVar176;
        C35840b bVar = new C35840b(1.0f, "视频号播放器画质增强机型对应强度");
        bVar.mo60270f(C32735h.C32737c.clicfg_channel_sharpen_deviceratio);
        bVar.mo60268b("RENDERER_SHARPEN_DEVICERATIO", new ArrayList(C64197v.m75537f(Float.valueOf(0.0f), Float.valueOf(0.5f), Float.valueOf(1.0f))), C64197v.m75537f("0.0", "0.5", "1.0"));
        f99231M3 = bVar;
        C36665a aVar177 = new C36665a(60, "视频号播放器画质增强GPU阈值", (C32227p) null, 4, (C8480h) null);
        aVar177.mo60270f(C32735h.C32737c.clicfg_channel_sharpen_gpu_score_android);
        aVar177.mo60268b("GPUSCORE_RENDERER_SHARPEN", new ArrayList(C64197v.m75537f(60, 1000)), C64197v.m75537f("60", "1000"));
        f99240N3 = aVar177;
        C36665a aVar178 = new C36665a(0, "是否打开266解码", (C32227p) null, 4, (C8480h) null);
        aVar178.mo60268b("ENABLE_DECODE_H266", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99247O3 = aVar178;
        C36665a aVar179 = new C36665a(60, "视频号H266解码GPU阈值", (C32227p) null, 4, (C8480h) null);
        aVar179.mo60268b("GPUSCORE_DECODE_H266", new ArrayList(C64197v.m75537f(0, 30, 50, 70, 100)), C64197v.m75537f("0", PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "50", "70", "100"));
        f99255P3 = aVar179;
        C36665a aVar180 = new C36665a(1000, "视频号H266解码1080p限制", (C32227p) null, 4, (C8480h) null);
        aVar180.mo60270f(C32735h.C32737c.clicfg_finder_video_h266_1080p_gpuscore);
        aVar180.mo60268b("DECODE_H266_1080PSUPPORT", new ArrayList(C64197v.m75537f(0, 70, 80, 90, 1000)), C64197v.m75537f("0", "70", "80", "90", "1000"));
        f99264Q3 = aVar180;
        C36665a aVar181 = new C36665a(71, "视频号H266解码720p限制", (C32227p) null, 4, (C8480h) null);
        aVar181.mo60270f(C32735h.C32737c.clicfg_finder_video_h266_720p_gpuscore);
        aVar181.mo60268b("DECODE_H266_720PSUPPORT", new ArrayList(C64197v.m75537f(0, 60, 70, 80, 1000)), C64197v.m75537f("0", "60", "70", "80", "1000"));
        f99273R3 = aVar181;
        C36665a aVar182 = new C36665a(0, "是否基于视频文件规格筛选", (C32227p) null, 4, (C8480h) null);
        aVar182.mo60270f(C32735h.C32737c.clicfg_channel_sharpen_android_fileformat_limit);
        aVar182.mo60268b("ENABLE_FILEFORMAT_LIMIT", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99282S3 = aVar182;
        C36665a aVar183 = new C36665a(1, "是否打开视频预加载", (C32227p) null, 4, (C8480h) null);
        aVar183.mo60268b("ENABLE_VIDEO_PRELOAD", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99291T3 = aVar183;
        C36665a aVar184 = new C36665a(0, "分享流进沉浸feed体验", (C32227p) null, 4, (C8480h) null);
        aVar184.mo60268b("ENABLE_VIDEO_PRELOAD", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99300U3 = aVar184;
        C36665a aVar185 = new C36665a(0, "是否打开帐号详情入口", (C32227p) null, 4, (C8480h) null);
        aVar185.mo60270f(C32735h.C32737c.clicfg_finder_show_account_detail);
        aVar185.mo60268b("IF_SHOW_ACCOUTN_DETAIL", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        C36665a aVar186 = new C36665a(0, "发表强制触发软编压缩", (C32227p) null, 4, (C8480h) null);
        aVar186.mo60268b("FINDER_POST_FORCE_ZIP", C64197v.m75537f(0, 1), C64197v.m75537f(str7, "开"));
        f99309V3 = aVar186;
        C36665a aVar187 = new C36665a(1, "发表安全预检测", (C32227p) null, 4, (C8480h) null);
        aVar187.mo60270f(C32735h.C32737c.clicfg_finder_post_pre_check_enable);
        aVar187.mo60268b("FINDER_POST_PRE_CHECK_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        f99318W3 = aVar187;
        C36665a aVar188 = new C36665a(0, "帐号首次发表需要微信支付实名授权", (C32227p) null, 4, (C8480h) null);
        aVar188.mo60270f(C32735h.C32737c.clicfg_finder_post_real_name_auth_enable);
        aVar188.mo60268b("FINDER_POST_REAL_NAME_AUTH_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        f99327X3 = aVar188;
        C36665a aVar189 = new C36665a(0, "发表水印检测", (C32227p) null, 4, (C8480h) null);
        aVar189.mo60270f(C32735h.C32737c.clicfg_finder_post_watermark_check_enable);
        aVar189.mo60268b("FINDER_POST_WATERMARK_CHECK_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        f99336Y3 = aVar189;
        C36665a aVar190 = new C36665a(1, "简介修改安全预检测", (C32227p) null, 4, (C8480h) null);
        aVar190.mo60270f(C32735h.C32737c.clicfg_finder_signature_pre_check_enable);
        aVar190.mo60268b("FINDER_SIGNATURE_PRE_CHECK_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        f99345Z3 = aVar190;
        new C36665a(0, "是否允许软编回退", (C32227p) null, 4, (C8480h) null).mo60268b("USERINFO_FINDER_ENABLE_SOFT_ENCODE_FALLBACK_INT_SYNC", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar191 = new C36665a(0, "Profile页是否展示领取红包封面", (C32227p) null, 4, (C8480h) null);
        aVar191.mo60269d("FinderProfileForbidenDisplayRedPacketLink");
        aVar191.mo60268b("FINDER_PROFILE_FORBIDDEN_LUCK_MONEY_COVER", C64197v.m75537f(0, 1), C64197v.m75537f("展示", "不展示"));
        f99353a4 = aVar191;
        String str8 = "";
        C35464c<String> cVar5 = new C35464c<>(str8, "视频号业务finderSync时需要同步给后台的pathKey");
        cVar5.mo60269d("FinderRedDotSyncPathList");
        f99361b4 = cVar5;
        C35464c<String> cVar6 = new C35464c<>(str8, "直播业务finderSync时需要同步给后台的pathKey");
        cVar6.mo60269d("LiveRedDotSyncPathList");
        f99369c4 = cVar6;
        new C35464c(0, "允许【摇一摇】数字红点透到发现页底部").mo60269d("EnableShakeUnreadCountToTab");
        new C35464c(0, "允许【看一看】数字红点透到发现页底部tab，默认关").mo60269d("EnableStoriesUnreadCountToTab");
        new C35464c(0, "允许【视频号】数字红点透到发现页底部tab，默认关").mo60269d("EnableFinderUnreadCountToTab");
        C36665a aVar192 = new C36665a(1, "是否支持横屏后长按倍速播放", (C32227p) null, 4, (C8480h) null);
        aVar192.mo60268b("FINDER_ENABLE_LONG_PRESS_SPEED_PLAY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        aVar192.mo60270f(C32735h.C32737c.clicfg_finder_enable_long_press_speed_play);
        f99378d4 = aVar192;
        C36665a aVar193 = new C36665a(0, "竖屏视频长按倍速播放", (C32227p) null, 4, (C8480h) null);
        aVar193.mo60268b("FINDER_PORTRAIT_VIDEO_LONG_PRESS_SPEED_PLAY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        aVar193.mo60270f(C32735h.C32737c.clicfg_finder_portrait_video_long_press_speed_play);
        f99387e4 = aVar193;
        C36665a aVar194 = new C36665a(1, "是否支持横屏预览", (C32227p) null, 4, (C8480h) null);
        aVar194.mo60270f(C32735h.C32737c.clicfg_finder_horizontal_previewing_enable);
        aVar194.mo60268b("FINDER_ENABLE_HORIZONTAL_PREVIEWING", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar195 = new C36665a(0, "开启完播跟赞", (C32227p) null, 4, (C8480h) null);
        aVar195.mo60270f(C32735h.C32737c.clicfg_finder_follow_like_recommend_enable);
        aVar195.mo60268b("FINDER_ENABLE_FOLLOW_LIKE_RECOMMEND", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99396f4 = aVar195;
        C36665a aVar196 = new C36665a(0, "开启全局全屏体验", (C32227p) null, 4, (C8480h) null);
        aVar196.mo60270f(C32735h.C32737c.clicfg_finder_global_full_screen_enjoy_enable);
        aVar196.mo60268b("FINDER_GLOBAL_FULLSCREEN_ENJOY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar197 = new C36665a(1, "开启推荐流全屏体验", (C32227p) null, 4, (C8480h) null);
        aVar197.mo60270f(C32735h.C32737c.clicfg_finder_hot_full_screen_enjoy_enable);
        aVar197.mo60268b("FINDER_HOT_FULLSCREEN_ENJOY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar198 = new C36665a(1, "开启关注流全屏体验", (C32227p) null, 4, (C8480h) null);
        aVar198.mo60270f(C32735h.C32737c.clicfg_finder_follow_full_screen_enjoy_enable);
        aVar198.mo60268b("FINDER_FOLLOW_FULLSCREEN_ENJOY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar199 = new C36665a(1, "开启朋友流全屏体验", (C32227p) null, 4, (C8480h) null);
        aVar199.mo60270f(C32735h.C32737c.clicfg_finder_friend_full_screen_enjoy_enable);
        aVar199.mo60268b("FINDER_FRIEND_FULLSCREEN_ENJOY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar200 = new C36665a(1, "开启其他场景全屏体验", (C32227p) null, 4, (C8480h) null);
        aVar200.mo60270f(C32735h.C32737c.clicfg_finder_other_full_screen_enjoy_enable);
        aVar200.mo60268b("FINDER_OTHER_FULLSCREEN_ENJOY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar201 = new C36665a(1, "开启分享流全屏体验", (C32227p) null, 4, (C8480h) null);
        aVar201.mo60270f(C32735h.C32737c.clicfg_finder_share_full_screen_enjoy_enable);
        aVar201.mo60268b("FINDER_SHARE_FULLSCREEN_ENJOY", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        C36665a aVar202 = new C36665a(0, "编辑页关闭半屏预览", (C32227p) null, 4, (C8480h) null);
        aVar202.mo60270f(C32735h.C32737c.clicfg_finder_post_disable_half_screen);
        aVar202.mo60268b("FINDER_POST_DISABLE_HALF_SCREEN", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99405g4 = aVar202;
        C36665a aVar203 = new C36665a(0, "编辑页允许铺满全屏", (C32227p) null, 4, (C8480h) null);
        aVar203.mo60270f(C32735h.C32737c.clicfg_finder_edit_allow_filling_full_screen);
        aVar203.mo60268b("FINDER_EDIT_ALLOW_FILLING_FULL_SCREEN", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99414h4 = aVar203;
        C36665a aVar204 = new C36665a(0, "分享流完播自动下滚", (C32227p) null, 4, (C8480h) null);
        aVar204.mo60270f(C32735h.C32737c.clicfg_finder_share_auto_scroll_next_feed);
        aVar204.mo60268b("FINDER_SHARE_AUTO_SCROLL_NEXT_FEED_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        f99423i4 = aVar204;
        C36665a aVar205 = new C36665a(1, "Timeline完播自动下滑", (C32227p) null, 4, (C8480h) null);
        aVar205.mo60268b("FINDER_AUTO_SCROLL_NEXT_FEED_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        aVar205.mo60270f(C32735h.C32737c.clicfg_finder_global_auto_scroll_next_feed);
        f99432j4 = aVar205;
        C35840b bVar2 = new C35840b(1.773f, "全屏视频撑满比例（高/宽）");
        bVar2.mo60270f(C32735h.C32737c.clicfg_finder_full_screen_inside_radio);
        bVar2.mo60268b("FINDER_FULLSCREEN_INSIDE_RADIO", C64197v.m75537f(Float.valueOf(1.773f), Float.valueOf(1.333f), Float.valueOf(2.0f)), C64197v.m75537f("16:9", "4:3", "2:1"));
        C36665a aVar206 = new C36665a(1, "是否过滤TAB内的热门红点", (C32227p) null, 4, (C8480h) null);
        aVar206.mo60268b("FINDER_FILTER_HOT_REDDOT_IN_HOT_TAB", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        aVar206.mo60270f(C32735h.C32737c.clicfg_enable_filter_hot_reddot_in_hot_tab);
        f99440k4 = aVar206;
        C36665a aVar207 = new C36665a(1, "是否过滤TAB内的朋友红点", (C32227p) null, 4, (C8480h) null);
        aVar207.mo60268b("FINDER_FILTER_FRIEND_REDDOT_IN_FRIEND_TAB", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        aVar207.mo60270f(C32735h.C32737c.clicfg_enable_filter_friend_reddot_in_friend_tab);
        f99448l4 = aVar207;
        C36665a aVar208 = new C36665a(1, "是否过滤TAB内的关注红点", (C32227p) null, 4, (C8480h) null);
        aVar208.mo60268b("FINDER_FILTER_FOLLOW_REDDOT_IN_FOLLOW_TAB", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        aVar208.mo60270f(C32735h.C32737c.clicfg_enable_filter_follow_reddot_in_follow_tab);
        f99456m4 = aVar208;
        C36665a aVar209 = new C36665a(0, "创作者服务中心URL", (C32227p) null, 4, (C8480h) null);
        aVar209.mo60268b("FINDER_POSTER_SERVICE_URL", C64197v.m75537f(0, 1, 2), C64197v.m75537f("使用后台下发url", "TEST", "REAL"));
        f99465n4 = aVar209;
        C36665a aVar210 = new C36665a(0, "发表原创入口开关", (C32227p) null, 4, (C8480h) null);
        aVar210.mo60268b("FINDER_POST_ORIGIN_SWITCH", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f(str7, "有入口无权限", "有入口有权限", "关闭入口"));
        f99474o4 = aVar210;
        new C36665a(0, "发表原创开关", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_POST_ORIGIN_ENTRANCE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f(str7, "打开入口"));
        C36665a aVar211 = new C36665a(0, "加入广告分成计划", (C32227p) null, 4, (C8480h) null);
        aVar211.mo60268b("FINDER_ADS_SHARE_PLAN_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99484p4 = aVar211;
        C36665a aVar212 = new C36665a(3, "活动分享使用的业务分享type", (C32227p) null, 4, (C8480h) null);
        aVar212.mo60268b("FINDER_ACTIVITY_SHARE_BUSINESS_TYPE", C64197v.m75537f(3, 100000001), C64197v.m75537f("默认值", "100000001"));
        f99493q4 = aVar212;
        C36665a aVar213 = new C36665a(0, "热门搜索推荐", (C32227p) null, 4, (C8480h) null);
        aVar213.mo60270f(C32735h.C32737c.clicfg_finder_search_hot);
        aVar213.mo60268b("FINDER_SEARCH_HOT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99502r4 = aVar213;
        new C35469d("清除全屏引导标志", C14280c0.f39827d);
        new C35469d("清除描述点击引导标志", C14276b0.f39823d);
        new C35469d("清除发表后引导点赞标志", C14285d1.f39832d);
        new C35469d("清除私密赞标志", C14333x.f39880d);
        new C35469d("清除横屏提示标志", C14336y.f39883d);
        new C35469d("清除全屏点赞引导标志", C14284d0.f39831d);
        new C35469d("清除转发引导标志", C14281c1.f39828d);
        C36665a aVar214 = new C36665a(1, "根据data version更新feed", (C32227p) null, 4, (C8480h) null);
        aVar214.mo60268b("FINDER_FEED_UPDATE_BY_VERSION_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99511s4 = aVar214;
        new C36665a(0, "全屏左滑引导无限次数", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_FULL_LEFT_SLIDE_GUIDE_CONFIG", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar215 = new C36665a(0, "app push 滑动引导", (C32227p) null, 4, (C8480h) null);
        aVar215.mo60270f(C32735h.C32737c.clicfg_finder_app_push_guide_style);
        aVar215.mo60268b("FINDER_APP_PUSH_SLIDE_GUIDE_CONFIG", C64197v.m75537f(0, 1, 1000005, 2000090), C64197v.m75537f("关闭", "进入马上出现", "进入后播放x秒出现", "进入后完播x%出现"));
        C36665a aVar216 = new C36665a(0, "清除视频号app push 引导标识", (C32227p) null, 4, (C8480h) null);
        C14302k kVar = C14302k.f39849d;
        C87412m.m108594g(kVar, "clickListener");
        aVar216.f94895n = kVar;
        aVar216.mo60268b("FINDER_APP_PUSH_GUIDE_SETTING", C26236u.m33719b(0), C26236u.m33719b("清除"));
        new C35469d("最近赞过开关-打开", C14331w0.f39878d);
        new C35469d("最近赞过开关-关闭", C14329v0.f39876d);
        C36665a aVar217 = new C36665a(1, "是否允许分享商品", (C32227p) null, 4, (C8480h) null);
        aVar217.mo60270f(C32735h.C32737c.clicfg_finder_product_share);
        aVar217.mo60268b("FINDER_PRODUCT_SHARE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar218 = new C36665a(1, "进入Finder点击时提前加载", (C32227p) null, 4, (C8480h) null);
        aVar218.mo60270f(C32735h.C32737c.clicfg_finder_enter_prefetch_cgi_final);
        aVar218.mo60268b("FINDER_FINDER_ENTER_LOAD_SWITCH", C64197v.m75537f(0, 1, 2), C64197v.m75537f(str7, "打开", "关闭"));
        f99520t4 = aVar218;
        C36665a aVar219 = new C36665a(1, "视频号朋友赞列表大头像", (C32227p) null, 4, (C8480h) null);
        aVar219.mo60270f(C32735h.C32737c.clicfg_finder_friend_like_big_avatar);
        aVar219.mo60268b("FINDER_FRIEND_LIKE_BIG_AVATAR", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99529u4 = aVar219;
        C36665a aVar220 = new C36665a(0, "发表可以选商品", (C32227p) null, 4, (C8480h) null);
        aVar220.mo60268b("FinderPostProductEntrance", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99538v4 = aVar220;
        new C35469d("重置红包入口关闭标志", C14334x0.f39881d);
        new C35469d("重置是否进入过红包小程序标志", C14337y0.f39884d);
        C36316a aVar221 = new C36316a(true, "朋友圈poi点击是否跳转新详情页", (String) null, 4, (C8480h) null);
        aVar221.mo60270f(C32735h.C32737c.clicfg_finder_poi_redirect_to_new_page_v2);
        f99547w4 = aVar221;
        C36316a aVar222 = new C36316a(true, "视频号feed中的poi点击是否跳转poi详情页", (String) null, 4, (C8480h) null);
        aVar222.mo60270f(C32735h.C32737c.clicfg_finder_feed_poi_click_to_poi_page);
        f99557x4 = aVar222;
        C36316a aVar223 = new C36316a(true, "poi详情页单流页是同步流", (String) null, 4, (C8480h) null);
        aVar223.mo60270f(C32735h.C32737c.clicfg_finder_poi_single_flow_is_sync);
        f99567y4 = aVar223;
        C36665a aVar224 = new C36665a(0, "视频号poi详情页是否跳转地图页", (C32227p) null, 4, (C8480h) null);
        aVar224.mo60270f(C32735h.C32737c.clicfg_finder_poi_redirect_to_map);
        aVar224.mo60268b("FINDER_POI_REDIRECT_TO_MAP", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99576z4 = aVar224;
        C36665a aVar225 = new C36665a(1, "是否开启视频preparing", (C32227p) null, 4, (C8480h) null);
        aVar225.mo60270f(C32735h.C32737c.clicfg_finder_enable_tp_video_prepare);
        aVar225.mo60268b("FINDER_VIDEO_TP_PREPARE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99124A4 = aVar225;
        new C36665a(0, "视频显示居中策略", (C32227p) null, 4, (C8480h) null).mo60268b("MEDIA_CENTER_ADJUST_SELECT", new ArrayList(C64197v.m75537f(0, 1, 2)), C64197v.m75537f("现网", "靠顶", "靠底"));
        new C36665a(0, "使用 Flutter UI", (C32227p) null, 4, (C8480h) null).mo60268b("DEBUG_FLUTTER_UI", new ArrayList(C64197v.m75537f(1, 0)), C64197v.m75537f("打开", "关闭"));
        C36665a aVar226 = new C36665a(0, "内存趋势跟踪-总开关", (C32227p) null, 4, (C8480h) null);
        aVar226.mo60270f(C32735h.C32737c.clicfg_trends_memory_enable);
        String str9 = str6;
        aVar226.mo60268b("TRENDS_MEMORY_ENABLE", C64197v.m75537f(1, 0), C64197v.m75537f("是", str9));
        f99133B4 = aVar226;
        C36665a aVar227 = new C36665a(0, "内存趋势跟踪-链路最大长度", (C32227p) null, 4, (C8480h) null);
        aVar227.mo60270f(C32735h.C32737c.clicfg_trends_memory_trace_limit);
        aVar227.mo60268b("TRENDS_MEMORY_TRACE_LIMIT", C64197v.m75537f(0, 5, 10, 20, 30, 40, 50), C64197v.m75537f("0", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "40", "50"));
        f99142C4 = aVar227;
        C36665a aVar228 = new C36665a(0, "内存趋势跟踪-单个事件跟踪最大数量", (C32227p) null, 4, (C8480h) null);
        aVar228.mo60270f(C32735h.C32737c.clicfg_trends_memory_properties_limit);
        aVar228.mo60268b("TRENDS_MEMORY_PROPERTIES_LIMIT", C64197v.m75537f(0, 5, 10, 20, 30, 40, 50), C64197v.m75537f("0", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "40", "50"));
        f99151D4 = aVar228;
        C36665a aVar229 = new C36665a(10, "长视频添加进历史准入时间偏移", (C32227p) null, 4, (C8480h) null);
        aVar229.mo60270f(C32735h.C32737c.clicfg_finder_mega_video_add_to_history_offset);
        f99160E4 = aVar229;
        C36665a aVar230 = new C36665a(10, "长视频从历史删除准出时间偏移", (C32227p) null, 4, (C8480h) null);
        aVar230.mo60270f(C32735h.C32737c.clicfg_finder_mega_video_delete_from_history_offset);
        f99169F4 = aVar230;
        C36665a aVar231 = new C36665a(180, "活动结束时间支持用户选择最近x天", (C32227p) null, 4, (C8480h) null);
        aVar231.mo60270f(C32735h.C32737c.clicfg_finder_activity_end_time_max_day);
        f99187H4 = aVar231;
        C36665a aVar232 = new C36665a(1, "视频号私信红点个人中心展现样式", (C32227p) null, 4, (C8480h) null);
        aVar232.mo60270f(C32735h.C32737c.clicfg_finder_private_message_red_dot_style);
        aVar232.mo60268b("FINDER_PRIVATE_MESSAGE_RED_DOT_STYLE", C64197v.m75537f(1, 2), C64197v.m75537f("普通红点", "数字红点"));
        f99196I4 = aVar232;
        C36665a aVar233 = new C36665a(0, "视频号外部收到timeline tab红点丢弃策略", (C32227p) null, 4, (C8480h) null);
        aVar233.mo60270f(C32735h.C32737c.clicfg_finder_tab_red_dot_drop_outer);
        aVar233.mo60268b("FINDER_TAB_DROP_TAB_RED_DOT_OUTER", C64197v.m75537f(0, 1, 2, 4, 8, 16, 32), C64197v.m75537f("不丢弃", "关注红点丢弃朋友", "关注红点丢弃推荐", "朋友红点丢弃关注", "朋友红点丢弃推荐", "推荐红点丢弃关注", "推荐红点丢弃朋友"));
        f99205J4 = aVar233;
        C36665a aVar234 = new C36665a(0, "视频号内部收到timeline tab红点丢弃策略", (C32227p) null, 4, (C8480h) null);
        aVar234.mo60270f(C32735h.C32737c.clicfg_finder_tab_red_dot_drop_inner);
        aVar234.mo60268b("FINDER_TAB_DROP_TAB_RED_DOT_OUTER", C64197v.m75537f(0, 1, 2, 4, 8, 16, 32), C64197v.m75537f("不丢弃", "关注红点丢弃朋友", "关注红点丢弃推荐", "朋友红点丢弃关注", "朋友红点丢弃推荐", "推荐红点丢弃关注", "推荐红点丢弃朋友"));
        f99214K4 = aVar234;
        C36665a aVar235 = new C36665a(0, "新闻feed赞类型是否忽略云端下发wordConfig", (C32227p) null, 4, (C8480h) null);
        aVar235.mo60270f(C32735h.C32737c.clicfg_finder_timeline_like_hot_fire_style);
        aVar235.mo60268b("FINDER_HOT_LIKE_IGNORE_WORD_CONFIG", C64197v.m75537f(1, 2), C64197v.m75537f("不忽略", "忽略"));
        f99223L4 = aVar235;
        C36665a aVar236 = new C36665a(1, "是否加载互选广告", (C32227p) null, 4, (C8480h) null);
        aVar236.mo60270f(C32735h.C32737c.clicfg_finder_mutual_ad_preload);
        aVar236.mo60268b("FINDER_MUTUAL_AD_PRELOAD", C64197v.m75537f(1, 2), C64197v.m75537f("不加载", "加载"));
        C36665a aVar237 = new C36665a(1, "是否打开附近双流预加载", (C32227p) null, 4, (C8480h) null);
        aVar237.mo60270f(C32735h.C32737c.clicfg_finder_nearby_feed_stream_preload);
        aVar237.mo60268b("FINDER_NEARBY_FEED_STREAM_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f(str9, "是"));
        f99241N4 = aVar237;
        C36665a aVar238 = new C36665a(7, "附近双流预加载阈值", (C32227p) null, 4, (C8480h) null);
        aVar238.mo60270f(C32735h.C32737c.clicfg_finder_nearby_feed_stream_preload_threshold_count);
        String str10 = str3;
        aVar238.mo60268b("FINDER_NEARBY_FEED_STREAM_PRELOAD_THRESHLOD_COUNT", C64197v.m75537f(3, 5, 7, 9), C64197v.m75537f(str10, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "7", "9"));
        f99248O4 = aVar238;
        C36665a aVar239 = new C36665a(3, "横屏播放器底部预加载阈值", (C32227p) null, 4, (C8480h) null);
        aVar239.mo60270f(C32735h.C32737c.clicfg_finder_new_style_ui_preload_threshold_count);
        aVar239.mo60268b("FINDER_NEW_STYLE_UI_PRELOAD_THRESHOLD_COUNT", C64197v.m75537f(3, 5, 7, 9), C64197v.m75537f(str10, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "7", "9"));
        f99256P4 = aVar239;
        C36665a aVar240 = new C36665a(2, "横屏播放器底部预加载阈值-大卡样式", (C32227p) null, 4, (C8480h) null);
        aVar240.mo60270f(C32735h.C32737c.clicfg_finder_new_style_ui_big_card_preload_threshold_count);
        aVar240.mo60268b("FINDER_NEW_STYLE_UI_BIG_CARD_PRELOAD_THRESHOLD_COUNT", C64197v.m75537f(2, 3, 5, 7, 9), C64197v.m75537f("2", str10, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "7", "9"));
        f99265Q4 = aVar240;
        C36665a aVar241 = new C36665a(1, "是否打开所有双流预加载", (C32227p) null, 4, (C8480h) null);
        aVar241.mo60268b("FINDER_NEARBY_FEED_STREAM_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f(str9, "是"));
        f99274R4 = aVar241;
        C36665a aVar242 = new C36665a(1, "长视频视频浮窗开关", (C32227p) null, 4, (C8480h) null);
        aVar242.mo60268b("FINDER_MEGA_VIDEO_FLOAT_VIDEO", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar242.mo60270f(C32735h.C32737c.clicfg_finder_mega_video_float_video);
        C36665a aVar243 = new C36665a(0, "是否显示离开微信最小化", (C32227p) null, 4, (C8480h) null);
        aVar243.mo60268b(str8, C64197v.m75537f(0, 1), C64197v.m75537f("不显示", "显示"));
        aVar243.mo60270f(C32735h.C32737c.clicfg_finder_live_player_desktop_setting);
        f99283S4 = aVar243;
        C36665a aVar244 = new C36665a(1, "是否开启聊天页丝滑动画", (C32227p) null, 4, (C8480h) null);
        aVar244.mo60268b(str8, C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar244.mo60270f(C32735h.C32737c.clicfg_finder_live_chat_fluent_switch);
        f99292T4 = aVar244;
        new C35469d("重置海外提示半屏", C37547u0.f99602d);
        C37542s0 s0Var = new C37542s0();
        s0Var.mo60268b("FINDER_NEW_FEED_UI", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        s0Var.mo60270f(C32735h.C32737c.clicfg_finder_new_feed_ui_enable);
        f99310V4 = s0Var;
        C36665a aVar245 = new C36665a(1, "直播和附近-红点触发预加载", (C32227p) null, 4, (C8480h) null);
        aVar245.mo60268b("FINDER_NEARBY_REDDOT_START_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar245.mo60270f(C32735h.C32737c.clicfg_finder_nearby_reddot_start_preload);
        f99319W4 = aVar245;
        C36665a aVar246 = new C36665a(1, "直播和附近-根据指定条件触发预加载", (C32227p) null, 4, (C8480h) null);
        aVar246.mo60268b("FINDER_NEARBY_INVOKE_START_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar246.mo60270f(C32735h.C32737c.clicfg_finder_nearby_invoke_start_preload);
        C36665a aVar247 = new C36665a(1, "直播和附近-预加载直播广场tab列表", (C32227p) null, 4, (C8480h) null);
        aVar247.mo60268b("FINDER_NEARBY_SQUARE_TABS_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "开启"));
        aVar247.mo60270f(C32735h.C32737c.clicfg_finder_nearby_square_tabs_preload);
        f99328X4 = aVar247;
        C37530h1 h1Var = new C37530h1();
        h1Var.mo60270f(C32735h.C32737c.clicfg_finder_support_share_text_status);
        h1Var.mo60268b("FINDER_SUPPORT_SHARE_TEXT_STATUS", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99337Y4 = h1Var;
        C36665a aVar248 = new C36665a(0, "视频号展示转发到企业微信入口", (C32227p) null, 4, (C8480h) null);
        aVar248.mo60270f(C32735h.C32737c.clicfg_finder_share_feed_wework_enable);
        aVar248.mo60268b("IS_ENABLE_SHARE_WEWORK", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        f99346Z4 = aVar248;
        C36665a aVar249 = new C36665a(1, "推荐页滑动就绪提前判定", (C32227p) null, 4, (C8480h) null);
        aVar249.mo60270f(C32735h.C32737c.clicfg_finder_scroll_ready_forward);
        aVar249.mo60268b("FINDER_SCROLL_READY_FORWARD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99354a5 = aVar249;
        C36665a aVar250 = new C36665a(30, "长视频弹幕字数限制", (C32227p) null, 4, (C8480h) null);
        aVar250.mo60268b("MEGA_VIDEO_BULLET_TEXT_LIMIT", C64197v.m75537f(15, 30), C64197v.m75537f("长视频弹幕字数限制15", "长视频弹幕字数限制30"));
        aVar250.mo60270f(C32735h.C32737c.clicfg_mega_video_bullet_text_limit);
        C36665a aVar251 = new C36665a(15, "finder弹幕字数限制", (C32227p) null, 4, (C8480h) null);
        aVar251.mo60268b("FINDER_VIDEO_BULLET_TEXT_LIMIT", C64197v.m75537f(15, 30), C64197v.m75537f("finder弹幕字数限制15", "finder弹幕字数限制30"));
        aVar251.mo60270f(C32735h.C32737c.clicfg_finder_video_bullet_text_limit);
        f99362b5 = aVar251;
        C36665a aVar252 = new C36665a(1, "弹幕描边颜色", (C32227p) null, 4, (C8480h) null);
        aVar252.mo60268b("FINDER_BULLET_TEXT_STROKE_COLOR", C64197v.m75537f(0, 1), C64197v.m75537f("alpha0.6", "alpha0.3"));
        aVar252.mo60270f(C32735h.C32737c.clicfg_finder_video_bullet_text_stroke_color);
        f99370c5 = aVar252;
        C36665a aVar253 = new C36665a(17, "弹幕字体size", (C32227p) null, 4, (C8480h) null);
        aVar253.mo60268b("FINDER_BULLET_TEXT_SIZE", C64197v.m75537f(16, 17, 18, 19), C64197v.m75537f("16", "17", "18", "19"));
        aVar253.mo60270f(C32735h.C32737c.clicfg_finder_video_bullet_text_size);
        f99379d5 = aVar253;
        C36665a aVar254 = new C36665a(3, "弹幕行数", (C32227p) null, 4, (C8480h) null);
        aVar254.mo60268b("FINDER_BULLET_ROW_COUNT", C64197v.m75537f(1, 2, 3), C64197v.m75537f("1", "2", str10));
        aVar254.mo60270f(C32735h.C32737c.clicfg_finder_video_bullet_row_count);
        f99388e5 = aVar254;
        C36665a aVar255 = new C36665a(1, "是否允许查询收入并显示红点", (C32227p) null, 4, (C8480h) null);
        aVar255.mo60270f(C32735h.C32737c.clicfg_finder_check_reward_insert_reddot);
        aVar255.mo60268b("FINDER_CHECK_REWARD_INSERT_REDDOT", C64197v.m75537f(0, 1), C64197v.m75537f("不允许", "允许"));
        f99397f5 = aVar255;
        C36665a aVar256 = new C36665a(0, "profile页商店tab开关", (C32227p) null, 4, (C8480h) null);
        aVar256.mo60269d("FinderProfileProductWindowSwitch");
        aVar256.mo60268b("FINDER_PROFILE_SHOP_TAB_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99415h5 = aVar256;
        C36665a aVar257 = new C36665a(1, "profile的tab优先级排序开关", (C32227p) null, 4, (C8480h) null);
        aVar257.mo60270f(C32735h.C32737c.clicfg_finder_profile_tab_sort_switch);
        aVar257.mo60268b("FINDER_PROFILE_TAB_SORT_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99424i5 = aVar257;
        C36665a aVar258 = new C36665a(10000, "发现页预渲染Buffer大小", (C32227p) null, 4, (C8480h) null);
        aVar258.mo60270f(C32735h.C32737c.clicfg_find_page_pre_render_min_buffer);
        String str11 = str5;
        aVar258.mo60268b("FIND_PAGE_PRE_RENDER_MIN_BUF", C64197v.m75537f(3000, 5000, 15000), C64197v.m75537f("3s", str11, "15s"));
        f99433j5 = aVar258;
        new C35469d("转换老版本的conv和session", C14300j1.f39847d);
        new C35469d("重置海外用户询问保存手机半屏", C14324t0.f39871d);
        C36665a aVar259 = new C36665a(0, "海外用户可以创建用户", (C32227p) null, 4, (C8480h) null);
        aVar259.mo60270f(C32735h.C32737c.clicfg_finder_foreign_can_create_account);
        aVar259.mo60268b("FINDER_OVER_SEA_CAN_CREATE_ACCOUNT", C64197v.m75537f(0, 1), C64197v.m75537f("不允许", "允许"));
        f99457m5 = aVar259;
        C36665a aVar260 = new C36665a(0, "是否绕开创建帐号/发表所有预检查", (C32227p) null, 4, (C8480h) null);
        aVar260.mo60270f(C32735h.C32737c.clicfg_finder_post_create_account_precheck_ignore);
        aVar260.mo60268b("FINDER_POST_CREATE_ACCOUNT_PRECHECK_IGNORE", C64197v.m75537f(0, 1), C64197v.m75537f(str9, "是"));
        f99466n5 = aVar260;
        C36665a aVar261 = new C36665a(0, "用户手机绑定状态开关", (C32227p) null, 4, (C8480h) null);
        aVar261.mo60268b("FINDER_BIND_PHONE_STATUS", C64197v.m75537f(0, 1, 2), C64197v.m75537f("真实判断", "hardcode已绑定", "hardcode未绑定"));
        f99475o5 = aVar261;
        C36665a aVar262 = new C36665a(0, "用户实名状态开关", (C32227p) null, 4, (C8480h) null);
        aVar262.mo60268b("FINDER_REAL_NAME_STATUS", C64197v.m75537f(0, 1, 2), C64197v.m75537f("真实判断", "hardcode已实名", "hardcode未实名"));
        f99485p5 = aVar262;
        C36665a aVar263 = new C36665a(0, "左滑引导推荐tab", (C32227p) null, 4, (C8480h) null);
        aVar263.mo60270f(C32735h.C32737c.clicfg_finder_friend_guide_jump_hot);
        aVar263.mo60268b("FINDER_FRIEND_GUIDE_JUMP_HOT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99494q5 = aVar263;
        C36665a aVar264 = new C36665a(0, "朋友tab强引流推荐", (C32227p) null, 4, (C8480h) null);
        aVar264.mo60268b("FINDER_FRIEND_GUIDE_JUMP_HOT_NEW", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99503r5 = aVar264;
        C36665a aVar265 = new C36665a(0, "视频号feed分享认证icon", (C32227p) null, 4, (C8480h) null);
        aVar265.mo60268b("FINDER_SHARE_AUTH_ICON_TEST", C64197v.m75537f(0, 1, 2), C64197v.m75537f("真实名称", "较短的nickname", "较长的nickname"));
        f99512s5 = aVar265;
        C36665a aVar266 = new C36665a(1, "直播feed展示新版连麦信息开关", (C32227p) null, 4, (C8480h) null);
        aVar266.mo60270f(C32735h.C32737c.clicfg_finder_live_feed_new_decorate_enable);
        f99539v5 = aVar266;
        new C36316a(false, "直播任务开播入口用大图url", "FINDER_LIVE_TASK_HARDCODE_BIG_IMG");
        C36665a aVar267 = new C36665a(0, "微信profile是否显示视频号认证", (C32227p) null, 4, (C8480h) null);
        aVar267.mo60269d("FinderWXProfileAuthInfoSwitch");
        aVar267.mo60268b("WX_PROFILE_SHOW_FINDER_AUTH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99558x5 = aVar267;
        new C35469d("带特定标签跳去开播页", C14294h0.f39841d);
        C36665a aVar268 = new C36665a(10, "MarkRead已读上报feed数量阈值", (C32227p) null, 4, (C8480h) null);
        aVar268.mo60270f(C32735h.C32737c.clicfg_finder_mark_read_feed_count_threshold);
        f99568y5 = aVar268;
        C36665a aVar269 = new C36665a(0, "LIVE堆栈", (C32227p) null, 4, (C8480h) null);
        aVar269.mo60268b("FINDER_LIVE_TRACKER_DEBUG", C64197v.m75537f(0, 1), C64197v.m75537f("off", "on"));
        f99577z5 = aVar269;
        C36665a aVar270 = new C36665a(3, "引导最多展示次数", (C32227p) null, 4, (C8480h) null);
        aVar270.mo60270f(C32735h.C32737c.clicfg_finder_live_square_guide_show_cnt_max);
        aVar270.mo60268b("FINDER_LIVE_SQUARE_GUIDE_SHOW_CNT_MAX", C64197v.m75537f(3, 5, 10), C64197v.m75537f(str10, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT));
        f99125A5 = aVar270;
        C36665a aVar271 = new C36665a(3000, "引导延迟时间MS", (C32227p) null, 4, (C8480h) null);
        aVar271.mo60270f(C32735h.C32737c.clicfg_finder_live_square_guide_show_waiting_ms);
        aVar271.mo60268b("FINDER_LIVE_SQUARE_GUIDE_SHOW_WAITING_MS", C64197v.m75537f(1000, 3000, 5000), C64197v.m75537f("1000", "3000", "5000"));
        f99134B5 = aVar271;
        C36665a aVar272 = new C36665a(0, "热门loading时不展示本地缓存占位", (C32227p) null, 4, (C8480h) null);
        aVar272.mo60270f(C32735h.C32737c.clicfg_finder_hot_show_no_cache_when_loading);
        aVar272.mo60268b("FINDER_HOT_SHOW_NO_CACHE_WHEN_LOADING", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99143C5 = aVar272;
        C36665a aVar273 = new C36665a(0, "热门有预拉取的时不展示本地缓存占位", (C32227p) null, 4, (C8480h) null);
        aVar273.mo60270f(C32735h.C32737c.clicfg_finder_hot_show_no_cache_when_preload_exist);
        aVar273.mo60268b("FINDER_HOT_SHOW_NO_CACHE_WHEN_PRELOAD_EXIST", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99152D5 = aVar273;
        C36665a aVar274 = new C36665a(0, "关注loading时不展示本地缓存占位", (C32227p) null, 4, (C8480h) null);
        aVar274.mo60270f(C32735h.C32737c.clicfg_finder_follow_show_no_cache_when_loading);
        aVar274.mo60268b("FINDER_FOLLOW_SHOW_NO_CACHE_WHEN_LOADING", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99161E5 = aVar274;
        C36665a aVar275 = new C36665a(0, "关注有预拉取的时不展示本地缓存占位", (C32227p) null, 4, (C8480h) null);
        aVar275.mo60270f(C32735h.C32737c.clicfg_finder_follow_show_no_cache_when_preload_exist);
        aVar275.mo60268b("FINDER_FOLLOW_SHOW_NO_CACHE_WHEN_PRELOAD_EXIST", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99170F5 = aVar275;
        C36665a aVar276 = new C36665a(0, "朋友loading时不展示本地缓存占位", (C32227p) null, 4, (C8480h) null);
        aVar276.mo60270f(C32735h.C32737c.clicfg_finder_friend_show_no_cache_when_loading);
        aVar276.mo60268b("FINDER_FRIEND_SHOW_NO_CACHE_WHEN_LOADING", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99179G5 = aVar276;
        C36665a aVar277 = new C36665a(0, "朋友有预拉取的时不展示本地缓存占位", (C32227p) null, 4, (C8480h) null);
        aVar277.mo60270f(C32735h.C32737c.clicfg_finder_friend_show_no_cache_when_preload_exist);
        aVar277.mo60268b("FINDER_FRIEND_SHOW_NO_CACHE_WHEN_PRELOAD_EXIST", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99188H5 = aVar277;
        C36665a aVar278 = new C36665a(0, "视频号视频设为朋友圈封面开关", (C32227p) null, 4, (C8480h) null);
        aVar278.mo60270f(C32735h.C32737c.clicfg_finder_set_as_sns_cover);
        aVar278.mo60268b("FINDER_SET_AS_SNS_COVER", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99197I5 = aVar278;
        new C35469d("左滑推荐次数重置", C14339z0.f39886d);
        new C35469d("青少年弹框开关极限配置", C14277b1.f39824d);
        new C35469d("青少年弹框时间重置", C14275a1.f39822d);
        C36665a aVar279 = new C36665a(0, "视频全局续播头部阈值s", (C32227p) null, 4, (C8480h) null);
        String str12 = "10s";
        aVar279.mo60268b("FINDER_AUTO_SEEK_HEAD_THRESHOLD", C64197v.m75537f(0, 10, 15), C64197v.m75537f("0s", str12, "15s"));
        aVar279.mo60270f(C32735h.C32737c.clicfg_finder_auto_seek_head_threshold);
        f99206J5 = aVar279;
        C36665a aVar280 = new C36665a(0, "视频全局续播尾部阈值s", (C32227p) null, 4, (C8480h) null);
        aVar280.mo60268b("FINDER_AUTO_SEEK_TAIL_THRESHOLD", C64197v.m75537f(0, 10, 15), C64197v.m75537f("0s", str12, "15s"));
        aVar280.mo60270f(C32735h.C32737c.clicfg_finder_auto_seek_tail_threshold);
        f99215K5 = aVar280;
        C36665a aVar281 = new C36665a(1, "视频全局续播回滚时间s", (C32227p) null, 4, (C8480h) null);
        aVar281.mo60268b("FINDER_AUTO_SEEK_ROLLBACK_TIME", C64197v.m75537f(0, 3, 5), C64197v.m75537f("0s", "3s", str11));
        aVar281.mo60270f(C32735h.C32737c.clicfg_finder_auto_seek_rollback_time);
        f99224L5 = aVar281;
        C36665a aVar282 = new C36665a(86400, "视频本地续播距离上次播放间隔s", (C32227p) null, 4, (C8480h) null);
        aVar282.mo60268b("FINDER_AUTO_SEEK_LOCAL_INTERVAL", C64197v.m75537f(0, 86400, 60, 10), C64197v.m75537f("不判断", "24小时", "1分钟", str12));
        aVar282.mo60270f(C32735h.C32737c.clicfg_finder_auto_seek_local_interval);
        f99233M5 = aVar282;
        C36665a aVar283 = new C36665a(1, "全局续播开关", (C32227p) null, 4, (C8480h) null);
        aVar283.mo60268b("Finder_AUTO_SEEK_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关", "开"));
        aVar283.mo60270f(C32735h.C32737c.clicfg_finder_auto_seek_switch);
        f99242N5 = aVar283;
        C36665a aVar284 = new C36665a(10, "视频全局续播距离当前播放时间阈值s", (C32227p) null, 4, (C8480h) null);
        aVar284.mo60268b("FINDER_AUTO_SEEK_INTERVAL_THRESHOLD", C64197v.m75537f(0, 10), C64197v.m75537f("0s", str12));
        aVar284.mo60270f(C32735h.C32737c.clicfg_finder_auto_seek_interval_threshold);
        f99249O5 = aVar284;
        C36665a aVar285 = new C36665a(1800, "清理视频号多任务activity阈值s", (C32227p) null, 4, (C8480h) null);
        aVar285.mo60268b("FINDER_CLEAN_MULTI_TASK_THRESHOLD", C64197v.m75537f(0, 10, 1800), C64197v.m75537f("关", str12, "30min"));
        aVar285.mo60270f(C32735h.C32737c.clicfg_finder_clean_multi_task_threshold);
        f99257P5 = aVar285;
        C36665a aVar286 = new C36665a(1, "微信消息配置", (C32227p) null, 4, (C8480h) null);
        aVar286.mo60268b("FINDER_WX_MESSAGE_CONFIG", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("不拆分tab", "拆分tab"));
        f99266Q5 = aVar286;
        C36665a aVar287 = new C36665a(0, "强化流测试View是否开启", (C32227p) null, 4, (C8480h) null);
        aVar287.mo60268b("FINDER_HOT_ENHANCE_ENABLE_TEST", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99275R5 = aVar287;
        C36665a aVar288 = new C36665a(1, "强化流是否开启", (C32227p) null, 4, (C8480h) null);
        aVar288.mo60270f(C32735h.C32737c.clicfg_finder_hot_enhance_enable);
        aVar288.mo60268b("FINDER_HOT_ENHANCE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99284S5 = aVar288;
        new C35469d("视频号直播数据规范测试页面", C14310m0.f39857d);
        new C36316a(false, "主播底部工具栏占位测试按钮是否显示", (String) null, 4, (C8480h) null).mo60268b("FINDER_LIVE_ANCHOR_DUMMY_ENTRANCE_WIDGET_VISIBLE", new ArrayList(C64197v.m75537f(Boolean.FALSE, Boolean.TRUE)), C64197v.m75537f("隐藏", "显示"));
        new C35469d("重置多任务显示引导", C14319r0.f39866d);
        new C35469d("重置礼物掉落用户教育", C14289f0.f39836d);
        C36665a aVar289 = new C36665a(1, "发现tab上支持红点", (C32227p) null, 4, (C8480h) null);
        aVar289.mo60270f(C32735h.C32737c.clicfg_finder_red_dot_on_friends_tab);
        aVar289.mo60268b("FINDER_RED_DOT_ON_FINDER_TAB", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99293T5 = aVar289;
        C36665a aVar290 = new C36665a(0, "清除视频号app push开关展示", (C32227p) null, 4, (C8480h) null);
        C14306l lVar = C14306l.f39853d;
        C87412m.m108594g(lVar, "clickListener");
        aVar290.f94895n = lVar;
        aVar290.mo60268b("FINDER_APP_PUSH_SETTING", C26236u.m33719b(0), C26236u.m33719b("清除"));
        C36665a aVar291 = new C36665a(CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, "视频号app push 延迟时间", (C32227p) null, 4, (C8480h) null);
        aVar291.mo60270f(C32735h.C32737c.clicfg_finder_app_push_delay_show_ms);
        aVar291.mo60268b("FINDER_APP_PUSH_DELAY_SETTING", C64197v.m75537f(5000, 10000, valueOf), C64197v.m75537f(str11, str12, "60s"));
        f99302U5 = aVar291;
        new C36316a(false, "直播间评论速度是否模拟现网", "FINDER_LIVE_MSG_IF_USE_SERVER_CONFIG");
        new C35469d("直播评论动画速度", C14307l0.f39854d);
        C36665a aVar292 = new C36665a(1, "视频号首页行为上报开关", (C32227p) null, 4, (C8480h) null);
        aVar292.mo60268b("FINDER_HOME_ACTION_REPORT_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar292.mo60270f(C32735h.C32737c.clicfg_finder_home_action_report);
        f99311V5 = aVar292;
        C36665a aVar293 = new C36665a(1, "视频号多任务开关", (C32227p) null, 4, (C8480h) null);
        aVar293.mo60268b("FINDER_MULTI_TASK_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar293.mo60270f(C32735h.C32737c.clicfg_finder_multi_task_new_switch);
        f99320W5 = aVar293;
        C36665a aVar294 = new C36665a(1, "所有路径进入视频号主页时兜底消除入口红点(默认关)", (C32227p) null, 4, (C8480h) null);
        aVar294.mo60268b("FINDER_HOME_CLEAR_ENTRANCE_RED_DOT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar294.mo60270f(C32735h.C32737c.clicfg_finder_home_clear_entrance_red_dot);
        f99329X5 = aVar294;
        C36665a aVar295 = new C36665a(1, "进入刷新时占位视频自动播放", (C32227p) null, 4, (C8480h) null);
        aVar295.mo60268b("FINDER_ENTER_REFRESH_PLAY_PLACEHOLDER_VIDEO", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar295.mo60270f(C32735h.C32737c.clicfg_finder_enter_refresh_play_placeholder_video);
        f99338Y5 = aVar295;
        C36665a aVar296 = new C36665a(1, "发现页进入时如果有预加载直接显示不loading", (C32227p) null, 4, (C8480h) null);
        aVar296.mo60268b("FINDER_HOME_SHOW_PRELOAD_RESULT_DIRECTLY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar296.mo60270f(C32735h.C32737c.clicfg_finder_home_show_preload_result_directly);
        f99347Z5 = aVar296;
        C36665a aVar297 = new C36665a(1, "(新)切tab时如果有预加载直接显示", (C32227p) null, 4, (C8480h) null);
        aVar297.mo60268b("FINDER_HOME_SHOW_PRELOAD_RESULT_WHEN_SWITCH_TAB_NEW", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar297.mo60270f(C32735h.C32737c.clicfg_finder_home_show_preload_when_switch_tab_new);
        f99355a6 = aVar297;
        C36665a aVar298 = new C36665a(0, "(旧)发现页预加载feed后提前初始化播放器", (C32227p) null, 4, (C8480h) null);
        aVar298.mo60268b("FINDER_HOME_PRELOAD_VIDEO_VIEW", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar298.mo60270f(C32735h.C32737c.clicfg_finder_home_preload_video_view);
        f99363b6 = aVar298;
        C36665a aVar299 = new C36665a(1, "(新)发现页预加载feed后提前初始化播放器", (C32227p) null, 4, (C8480h) null);
        aVar299.mo60268b("FINDER_HOME_PRELOAD_VIDEO_VIEW_2", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar299.mo60270f(C32735h.C32737c.clicfg_finder_home_preload_video_view_2);
        f99371c6 = aVar299;
        C36665a aVar300 = new C36665a(0, "(旧)发现页初始化播放器时attchSurface", (C32227p) null, 4, (C8480h) null);
        aVar300.mo60268b("FINDER_HOME_PRELOAD_VIDEO_VIEW_ATTACH_SURFACE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar300.mo60270f(C32735h.C32737c.clicfg_finder_home_preload_video_view_attach_surface);
        f99380d6 = aVar300;
        C36665a aVar301 = new C36665a(1, "(新)发现页初始化播放器时attchSurface", (C32227p) null, 4, (C8480h) null);
        aVar301.mo60268b("FINDER_HOME_PRELOAD_VIDEO_VIEW_ATTACH_SURFACE_2", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar301.mo60270f(C32735h.C32737c.clicfg_finder_home_preload_video_view_attach_surface_2);
        f99389e6 = aVar301;
        C36665a aVar302 = new C36665a(1, "视频号主页初始化逻辑优化new", (C32227p) null, 4, (C8480h) null);
        aVar302.mo60268b("FINDER_HOME_INIT_LOGIC_OP_NEW", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar302.mo60270f(C32735h.C32737c.clicfg_finder_home_init_logic_op_new);
        f99398f6 = aVar302;
        C36665a aVar303 = new C36665a(1, "退出视频号时主动触发一次预加载", (C32227p) null, 4, (C8480h) null);
        aVar303.mo60268b("FINDER_EXIT_PRELOAD_FEED", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar303.mo60270f(C32735h.C32737c.clicfg_finder_exit_preload_feed);
        f99407g6 = aVar303;
        C37543w wVar = new C37543w();
        wVar.mo60268b("FINDER_ENTER_SHOW_CACHE_UNREAD_FEED", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        wVar.mo60270f(C32735h.C32737c.clicfg_finder_enter_without_preload_show_unread_feed);
        f99416h6 = wVar;
        C36665a aVar304 = new C36665a(1, "3tab将上次退出时的feed替换为第一个feed", (C32227p) null, 4, (C8480h) null);
        aVar304.mo60268b("FINDER_HOME_LAST_EXIT_FEED_REPLACE_FIRST_FEED", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar304.mo60270f(C32735h.C32737c.clicfg_finder_home_last_exit_feed_replace_first_feed);
        f99425i6 = aVar304;
        C36665a aVar305 = new C36665a(0, "青少年防沉迷调试环境", (C32227p) null, 4, (C8480h) null);
        aVar305.mo60268b("FINDER_MULTI_TASK_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99434j6 = aVar305;
        C36665a aVar306 = new C36665a(0, "设置直播trtc SDK后台环境", (C32227p) null, 4, (C8480h) null);
        aVar306.mo60268b("FINDER_LIVE_TRTC_ENV", C64197v.m75537f(0, 1, 2), C64197v.m75537f("正式环境", "测试环境", "体验环境"));
        f99442k6 = aVar306;
        new C36665a(1, "视频号3tab被动浮窗暂停显示", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_PASSIVE_VIDEO_PIP_PAUSE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar307 = new C36665a(1, "视频号3tab被动浮窗开关", (C32227p) null, 4, (C8480h) null);
        aVar307.mo60270f(C32735h.C32737c.clicfg_finder_passive_pip_switch);
        aVar307.mo60268b("FINDER_PASSIVE_VIDEO_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99450l6 = aVar307;
        C36665a aVar308 = new C36665a(10, "通用跳转器预加载延迟时间(秒)", (C32227p) null, 4, (C8480h) null);
        aVar308.mo60270f(C32735h.C32737c.clicfg_finder_comm_jumper_preload_delay_sec);
        aVar308.mo60268b("FINDER_COMM_JUMPER_PRELOAD_DELAY_SETTING", C64197v.m75537f(0, 5, 10), C64197v.m75537f("0s", str11, str12));
        C36665a aVar309 = new C36665a(1, "通用跳转器预加载开关", (C32227p) null, 4, (C8480h) null);
        aVar309.mo60270f(C32735h.C32737c.clicfg_finder_comm_jumper_preload_switch_new);
        aVar309.mo60268b("FINDER_COMM_JUMPER_PRELOAD_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99458m6 = aVar309;
        C35840b bVar3 = new C35840b(1.0f, "视频号弹幕滑动时长倍数");
        bVar3.mo60270f(C32735h.C32737c.clicfg_finder_bullet_duration_scale);
        String str13 = str8;
        bVar3.mo60268b("FINDER_BULLET_DURATION_SCALE", C64197v.m75537f(Float.valueOf(1.0f), Float.valueOf(0.5f), Float.valueOf(1.2f), Float.valueOf(1.5f), Float.valueOf(2.0f)), C64197v.m75537f(str7, "0.5倍", "1.2倍", "1.5倍", "2.0倍"));
        f99467n6 = bVar3;
        C36665a aVar310 = new C36665a(0, "长视频弹幕全局开关", (C32227p) null, 4, (C8480h) null);
        aVar310.mo60268b("FINDER_BULLET_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        aVar310.mo60270f(C32735h.C32737c.clicfg_finder_bullet_switch);
        f99476o6 = aVar310;
        C36665a aVar311 = new C36665a(1, "朋友圈发表后同时发表视频号", (C32227p) null, 4, (C8480h) null);
        aVar311.mo60268b("FINDER_SNS_POST_ENTRANCE_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        aVar311.mo60270f(C32735h.C32737c.clicfg_finder_sns_post_entrance_switch);
        f99486p6 = aVar311;
        C36665a aVar312 = new C36665a(0, "朋友圈图片发表后允许发表视频号", (C32227p) null, 4, (C8480h) null);
        aVar312.mo60268b("FINDER_SNS_POST_FINDER_PHOTO_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        aVar312.mo60270f(C32735h.C32737c.clicfg_finder_sns_post_finder_photo_switch);
        f99495q6 = aVar312;
        C36665a aVar313 = new C36665a(1, "视频号个人中心聚合入口开关", (C32227p) null, 4, (C8480h) null);
        aVar313.mo60270f(C32735h.C32737c.clicfg_finder_mix_self_cell_switch);
        aVar313.mo60268b("FINDER_MIX_SELF_CELL_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99504r6 = aVar313;
        C36665a aVar314 = new C36665a(0, "朋友圈图片转视频发表视频号", (C32227p) null, 4, (C8480h) null);
        aVar314.mo60268b("FINDER_SNS_POST_FINDER_PHOTO_TO_VIDEO_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        aVar314.mo60270f(C32735h.C32737c.clicfg_finder_sns_post_finder_photo_to_video_switch);
        f99513s6 = aVar314;
        C36665a aVar315 = new C36665a(0, "朋友圈图片转视频默认选择不使用模板", (C32227p) null, 4, (C8480h) null);
        aVar315.mo60268b("FINDER_SNS_POST_FINDER_PHOTO_TO_VIDEO_SELECT_NO_TEMPLATE_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        aVar315.mo60270f(C32735h.C32737c.clicfg_finder_sns_post_finder_photo_to_video_no_template_switch);
        f99522t6 = aVar315;
        C36665a aVar316 = new C36665a(1, "无账号支持朋友圈发表后同时发表视频号", (C32227p) null, 4, (C8480h) null);
        aVar316.mo60268b("FINDER_NO_ACCOUNT_SNS_POST_ENTRANCE_SWITCH", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        aVar316.mo60270f(C32735h.C32737c.clicfg_finder_no_account_sns_post_entrance_switch);
        f99531u6 = aVar316;
        C36665a aVar317 = new C36665a(0, "本地忽略后台配置-朋友圈发表后同时发表视频号", (C32227p) null, 4, (C8480h) null);
        aVar317.mo60268b("FINDER_SNS_POST_ENTRANCE_IGNORE_SERVER", C64197v.m75537f(1, 0), C64197v.m75537f("开", "关"));
        f99540v6 = aVar317;
        String str14 = "开";
        C37016a aVar318 = new C37016a(6000, "朋友圈同时发表视频号视频时长限制");
        aVar318.mo60270f(C32735h.C32737c.clicfg_finder_sns_post_entrance_duration_limit_ms);
        f99549w6 = aVar318;
        C36665a aVar319 = new C36665a(1, "视频号私密赞开关", (C32227p) null, 4, (C8480h) null);
        aVar319.mo60270f(C32735h.C32737c.clicfg_finder_private_like_switch);
        aVar319.mo60268b("FINDER_PRIVATE_LIKE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99559x6 = aVar319;
        new C35469d("测试打开视频号账号创建页jsapi", C14328v.f39875d);
        C36665a aVar320 = new C36665a(1, "直播广场点击预加载列表", (C32227p) null, 4, (C8480h) null);
        aVar320.mo60270f(C32735h.C32737c.clicfg_finder_square_live_click_preload);
        aVar320.mo60268b("FINDER_LIVE_SQUARE_CLICK_PRELOAD", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99569y6 = aVar320;
        C36665a aVar321 = new C36665a(1, "是否直播间丝滑切换", (C32227p) null, 4, (C8480h) null);
        aVar321.mo60268b("ENABLE_VIDEO_PRELOAD", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        aVar321.mo60270f(C32735h.C32737c.clicfg_finder_live_fluent_switch);
        f99578z6 = aVar321;
        C36665a aVar322 = new C36665a(0, "主播是否开启粉丝团抽奖", (C32227p) null, 4, (C8480h) null);
        aVar322.mo60268b("ENABLE_FINDER_LIVE_LOTTERY_FAN", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        aVar322.mo60270f(C32735h.C32737c.clicfg_finder_live_lottery_fan_switch);
        f99126A6 = aVar322;
        C36665a aVar323 = new C36665a(1, "是否直播间丝滑退房", (C32227p) null, 4, (C8480h) null);
        aVar323.mo60268b("ENABLE_FINDER_LIVE_FLUENT_EXIT_SWITCH", new ArrayList(C64197v.m75537f(0, 1)), C64197v.m75537f("关闭", "打开"));
        aVar323.mo60270f(C32735h.C32737c.clicfg_finder_live_fluent_exit_switch);
        f99135B6 = aVar323;
        C36665a aVar324 = new C36665a(0, "直播feed推荐刷新间隔设置,单位s", (C32227p) null, 4, (C8480h) null);
        aVar324.mo60268b("FINDER_LIVE_RECOMM_REFRESH_INTERVAL", C64197v.m75537f(0, 10, 20, 30, 60), C64197v.m75537f(str7, PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", PayuSecureEncrypt.ENCRYPT_VERSION_HASH, "60"));
        f99144C6 = aVar324;
        C36665a aVar325 = new C36665a(0, "清理 finder sync key buffer", (C32227p) null, 4, (C8480h) null);
        aVar325.mo60270f(C32735h.C32737c.clicfg_finder_clean_finder_sync_key_buf);
        aVar325.mo60268b("CLEAN_FINDER_SYNC_KEY_BUF", C64197v.m75537f(0, 1, 2, 3, 4, 5, 6, 7, 8), C64197v.m75537f("0", "1", "2", "3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN, "7", "8"));
        f99153D6 = aVar325;
        C36665a aVar326 = new C36665a(0, "设计师表情发布是否开启", (C32227p) null, 4, (C8480h) null);
        aVar326.mo60268b("FINDER_EMOJI_POST_ENABLE_TEST", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99162E6 = aVar326;
        C36665a aVar327 = new C36665a(0, "评论区@人开关", (C32227p) null, 4, (C8480h) null);
        aVar327.mo60270f(C32735h.C32737c.clicfg_finder_comment_at_friend_switch);
        aVar327.mo60268b("FINDER_COMMENT_MENTION_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99171F6 = aVar327;
        C36665a aVar328 = new C36665a(0, "青少年不可访问下禁止分享流播放", (C32227p) null, 4, (C8480h) null);
        aVar328.mo60268b("FINDER_BAN_SHARE_FEED_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar328.mo60270f(C32735h.C32737c.clicfg_finder_ban_share_feed_switch);
        f99180G6 = aVar328;
        C36665a aVar329 = new C36665a(1, "青少年模式下分享流需临时授权", (C32227p) null, 4, (C8480h) null);
        aVar329.mo60268b("FINDER_SHARE_FEED_GUARD_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar329.mo60270f(C32735h.C32737c.clicfg_finder_share_feed_guard_switch);
        f99189H6 = aVar329;
        new C36665a(3, "视频号出问卷播放时间", (C32227p) null, 4, (C8480h) null).mo60270f(C32735h.C32737c.clicfg_finder_quiz_show_video_play_duration_android);
        C36665a aVar330 = new C36665a(3, "视频号用户问卷推荐tab出现位置", (C32227p) null, 4, (C8480h) null);
        aVar330.mo60270f(C32735h.C32737c.clicfg_finder_quiz_recommend_pos_android);
        f99198I6 = aVar330;
        C36665a aVar331 = new C36665a(0, "视频号用户问卷一周出现最大次数", (C32227p) null, 4, (C8480h) null);
        aVar331.mo60270f(C32735h.C32737c.clicfg_finder_quiz_show_count_weekly_android);
        aVar331.mo60268b("FINDER_SURVEY_SHOW_COUNT_WEEKLY", C64197v.m75537f(0, 3, 4, 5, Integer.MAX_VALUE), C64197v.m75537f("0", str10, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "无限"));
        C37016a aVar332 = new C37016a(60000, "视频静默播放时长限制");
        aVar332.mo60270f(C32735h.C32737c.clicfg_finder_silent_play_limit_duration);
        aVar332.mo60268b("FINDER_SILENT_PLAY_LIMIT_TIME", C64197v.m75537f(0L, 15000L, 60000L, 600000L), C64197v.m75537f("无限制", "15s", "1min", "10min"));
        f99207J6 = aVar332;
        C36665a aVar333 = new C36665a(10, "视频静默播放次数限制", (C32227p) null, 4, (C8480h) null);
        aVar333.mo60270f(C32735h.C32737c.clicfg_finder_silent_play_limit_count);
        aVar333.mo60268b("FINDER_SILENT_PLAY_LIMIT_COUNT", C64197v.m75537f(0, 2, 6, 10), C64197v.m75537f("无限制", "2次", "6次", "10次"));
        f99216K6 = aVar333;
        new C35469d("清除视频号用户问卷出现次数", C14323t.f39870d);
        new C35469d("mock跳转专题页红点-推荐tab", C37541q0.f99597d);
        new C35469d("mock跳转专题页红点-关注tab", C37536o0.f99592d);
        new C35469d("mock跳转专题页红点-朋友tab", C37539p0.f99595d);
        C36665a aVar334 = new C36665a(1, "左滑进入profile页开关", (C32227p) null, 4, (C8480h) null);
        aVar334.mo60270f(C32735h.C32737c.clicfg_finder_enable_swipe_profile_android);
        aVar334.mo60268b("FINDER_ENABLE_SWIPE_PROFILE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar335 = new C36665a(1, "Timeline左滑进入profile页开关", (C32227p) null, 4, (C8480h) null);
        aVar335.mo60270f(C32735h.C32737c.clicfg_finder_enable_timeline_swipe_profile_android);
        aVar335.mo60268b("FINDER_ENABLE_TIMELINE_SWIPE_PROFILE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar336 = new C36665a(1, "分享流左滑进入profile页开关", (C32227p) null, 4, (C8480h) null);
        aVar336.mo60270f(C32735h.C32737c.clicfg_finder_enable_share_swipe_profile_android);
        aVar336.mo60268b("FINDER_ENABLE_SHARE_SWIPE_PROFILE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar337 = new C36665a(1, "搜索流左滑进入profile页开关", (C32227p) null, 4, (C8480h) null);
        aVar337.mo60270f(C32735h.C32737c.clicfg_finder_enable_search_swipe_profile_android);
        aVar337.mo60268b("FINDER_ENABLE_SEARCH_SWIPE_PROFILE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar338 = new C36665a(1, "星标、赞过流左滑进入profile页开关", (C32227p) null, 4, (C8480h) null);
        aVar338.mo60270f(C32735h.C32737c.clicfg_finder_enable_like_fav_swipe_profile_android);
        aVar338.mo60268b("FINDER_ENABLE_LIKE_FAV_SWIPE_PROFILE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar339 = new C36665a(1, "消息流左滑进入profile页开关", (C32227p) null, 4, (C8480h) null);
        aVar339.mo60270f(C32735h.C32737c.clicfg_finder_enable_msg_swipe_profile_android);
        aVar339.mo60268b("FINDER_ENABLE_MSG_SWIPE_PROFILE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar340 = new C36665a(1, "3tab流刷新保留当前及往上的历史feed", (C32227p) null, 4, (C8480h) null);
        aVar340.mo60270f(C32735h.C32737c.clicfg_finder_refresh_leave_upper_history_feed);
        aVar340.mo60268b("FINDER_REFRESH_LEAVE_UPPER_HISTORY_FEED", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99225L6 = aVar340;
        C36665a aVar341 = new C36665a(10000, "退后台回收非热区播放器时间间隔", (C32227p) null, 4, (C8480h) null);
        aVar341.mo60270f(C32735h.C32737c.clicfg_finder_trim_unfocus_video_view_background_interval_ms);
        aVar341.mo60268b("FINDER_TRIM_UNFOCUS_VIDEO_VIEW_BACKGROUND_INTERVAL_MS", C64197v.m75537f(-1, 0, valueOf, 180000), C64197v.m75537f("不回收", "立即回收", "退后台1分钟", "退后台3分钟"));
        f99234M6 = aVar341;
        C36665a aVar342 = new C36665a(30000, "退后台回收所有播放器时间间隔", (C32227p) null, 4, (C8480h) null);
        aVar342.mo60270f(C32735h.C32737c.clicfg_finder_trim_all_video_view_background_interval_ms);
        aVar342.mo60268b("FINDER_TRIM_ALL_VIDEO_VIEW_BACKGROUND_INTERVAL_MS", C64197v.m75537f(-1, 0, valueOf, 180000), C64197v.m75537f("不回收", "立即回收", "退后台1分钟", "退后台3分钟"));
        f99243N6 = aVar342;
        C36665a aVar343 = new C36665a(0, "长按头像插入强化流", (C32227p) null, 4, (C8480h) null);
        aVar343.mo60268b("FINDER_HOT_ENHANCE_LONG_CLICK_AVATAR_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99250O6 = aVar343;
        C36665a aVar344 = new C36665a(-1, "直播feed推荐理由假插数量", (C32227p) null, 4, (C8480h) null);
        aVar344.mo60268b("FINDER_FEED_FAKE_RECOMMEND_TIPS_COUNT", C64197v.m75537f(-1, 1, 2, 3, 0), C64197v.m75537f("SVR", "1", "2", str10, "0"));
        f99258P6 = aVar344;
        C36665a aVar345 = new C36665a(1, "视频号选择器样式", (C32227p) null, 4, (C8480h) null);
        aVar345.mo60268b("FINDER_GALLERY_STYLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar345.mo60270f(C32735h.C32737c.clicfg_finder_gallery_style);
        f99267Q6 = aVar345;
        C36665a aVar346 = new C36665a(2, "视频渲染View类型", (C32227p) null, 4, (C8480h) null);
        aVar346.mo60270f(C32735h.C32737c.clicfg_finder_render_view_type);
        aVar346.mo60268b("FINDER_RENDER_VIEW_TYPE", C64197v.m75537f(0, 1, 2), C64197v.m75537f("TextureView", "SurfaceView", "自动"));
        f99276R6 = aVar346;
        C36665a aVar347 = new C36665a(0, "忽略HDR相关检查", (C32227p) null, 4, (C8480h) null);
        aVar347.mo60270f(C32735h.C32737c.clicfg_finder_enable_hdr_ignore_support);
        aVar347.mo60268b("FINDER_ENABLE_HDR_IGNORE_SUPPORT", C64197v.m75537f(0, 1), C64197v.m75537f("不忽略", "忽略"));
        f99285S6 = aVar347;
        C36665a aVar348 = new C36665a(10, "直播feed进入按钮变色时间长度", (C32227p) null, 4, (C8480h) null);
        aVar348.mo60268b("FINDER_LIVE_FEED_BTN_DURATION", C64197v.m75537f(10, 20, 30), C64197v.m75537f(PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", PayuSecureEncrypt.ENCRYPT_VERSION_HASH));
        C32735h.C32737c cVar7 = C32735h.C32737c.clicfg_finder_live_feed_muti_recommend_btn_duration;
        aVar348.mo60270f(cVar7);
        f99294T6 = aVar348;
        C36665a aVar349 = new C36665a(5000, "统计网络情况时间间隔MS", (C32227p) null, 4, (C8480h) null);
        aVar349.mo60270f(C32735h.C32737c.clicfg_finder_network_statistic_interval_ms);
        aVar349.mo60268b("NETWORK_STATISTIC_INTERVAL_MS", C64197v.m75537f(-1, 5000, 10000), C64197v.m75537f("不统计", str11, str12));
        f99321W6 = aVar349;
        C36665a aVar350 = new C36665a(1, "启用自动控制预加载起停", (C32227p) null, 4, (C8480h) null);
        aVar350.mo60270f(C32735h.C32737c.clicfg_finder_enable_adjust_preload);
        aVar350.mo60268b("FINDER_ENABLE_ADJUST_PRELOAD", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99330X6 = aVar350;
        new C35469d("获取当前funcMsg callback的数量", C14286e0.f39833d);
        C36665a aVar351 = new C36665a(0, "分享进视频号主入口", (C32227p) null, 4, (C8480h) null);
        aVar351.mo60268b("FINDER_SHARE_TO_TIMELINE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar351.mo60270f(C32735h.C32737c.clicfg_finder_share_to_timeline);
        f99339Y6 = aVar351;
        C36665a aVar352 = new C36665a(1, "分享进视频号主入口预加载", (C32227p) null, 4, (C8480h) null);
        aVar352.mo60268b("FINDER_SHARE_TO_TIMELINE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar352.mo60270f(C32735h.C32737c.clicfg_finder_share_to_timeline_preload);
        f99348Z6 = aVar352;
        C36665a aVar353 = new C36665a(1, "朋友tab回推荐出多少次折叠", (C32227p) null, 4, (C8480h) null);
        aVar353.mo60268b("FINDER_LIVE_FEED_BTN_DURATION", C64197v.m75537f(1, 2, 3, 1000), C64197v.m75537f("1", "2", str10, "每次"));
        aVar353.mo60270f(cVar7);
        C36665a aVar354 = new C36665a(-1, "直播推广组件开关", (C32227p) null, 4, (C8480h) null);
        aVar354.mo60268b("FINDER_LIVE_PROMOTE_ENABLE", C64197v.m75537f(-1, 0, 1), C64197v.m75537f("SVR", "关闭", "打开"));
        f99356a7 = aVar354;
        C36665a aVar355 = new C36665a(1, "启用主动拉取预加载信息", (C32227p) null, 4, (C8480h) null);
        aVar355.mo60270f(C32735h.C32737c.clicfg_finder_enable_fetch_preload_info);
        aVar355.mo60268b("FINDER_ENABLE_FETCH_PRELOAD_INFO", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99364b7 = aVar355;
        C36665a aVar356 = new C36665a(1, "启用设置播放器缓冲区大小", (C32227p) null, 4, (C8480h) null);
        aVar356.mo60270f(C32735h.C32737c.clicfg_finder_set_buffer_size);
        aVar356.mo60268b("FINDER_ENABLE_SET_BUFFER_SIZE", C64197v.m75537f(1, 0), C64197v.m75537f("打开", "关闭"));
        f99372c7 = aVar356;
        new C35469d("hook", C37548i0.f99603d);
        C36665a aVar357 = new C36665a(0, "个人主页音乐Tab是否显示收藏按钮", (C32227p) null, 4, (C8480h) null);
        aVar357.mo60268b("FINDER_PROFILE_MUSIC_TAB_SHOW_FAV", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar357.mo60270f(C32735h.C32737c.clicfg_finder_profile_music_tab_show_fav);
        f99381d7 = aVar357;
        C36665a aVar358 = new C36665a(0, "音乐专题是否允许 feedid 发表", (C32227p) null, 4, (C8480h) null);
        aVar358.mo60268b("FINDER_MUSIC_TOPIC_FEED_POST_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar358.mo60270f(C32735h.C32737c.clicfg_finder_music_topic_feedid_post_enable);
        f99390e7 = aVar358;
        C36665a aVar359 = new C36665a(1, "半屏profile开关", (C32227p) null, 4, (C8480h) null);
        aVar359.mo60268b("FINDER_HALF_SCREEN_PROFILE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99399f7 = aVar359;
        C36665a aVar360 = new C36665a(0, "描述区短评实验开关", (C32227p) null, 4, (C8480h) null);
        aVar360.mo60268b("FINDER_DESC_BUZZWORD_FLAG", C64197v.m75537f(0, 1, 2), C64197v.m75537f("未命中，未打开", "已命中，未打开", "打开"));
        f99408g7 = aVar360;
        C36665a aVar361 = new C36665a(0, "描述区铃声实验开关", (C32227p) null, 4, (C8480h) null);
        aVar361.mo60268b("FINDER_DESC_RINGTONE_FLAG", C64197v.m75537f(0, 1, 2), C64197v.m75537f("未命中，未打开", "已命中，未打开", "打开"));
        f99417h7 = aVar361;
        C36665a aVar362 = new C36665a(0, "描述区热评实验开关", (C32227p) null, 4, (C8480h) null);
        aVar362.mo60268b("FINDER_DESC_HOTCOMMENT_FLAG", C64197v.m75537f(0, 1, 2), C64197v.m75537f("未命中，未打开", "已命中，未打开", "打开"));
        f99426i7 = aVar362;
        C36665a aVar363 = new C36665a(0, "绕过描述区出铃声限制", (C32227p) null, 4, (C8480h) null);
        aVar363.mo60268b("FINDER_JUMP_RING_TONE_LIMIT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99435j7 = aVar363;
        C36665a aVar364 = new C36665a(1, "全屏profile三列流", (C32227p) null, 4, (C8480h) null);
        aVar364.mo60268b("FINDER_PROFILE_THREE_COL_GRID_LAYOUT", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar364.mo60270f(C32735h.C32737c.clicfg_finder_profile_three_col_grid_layout);
        f99443k7 = aVar364;
        C36665a aVar365 = new C36665a(0, "订阅号进视频号主入口", (C32227p) null, 4, (C8480h) null);
        aVar365.mo60268b("FINDER_BIZ_TO_TIMELINE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar365.mo60270f(C32735h.C32737c.clicfg_finder_biz_to_timeline);
        f99451l7 = aVar365;
        C36665a aVar366 = new C36665a(0, "视频号Feed通用跳转器广告新样式", (C32227p) null, 4, (C8480h) null);
        aVar366.mo60270f(C32735h.C32737c.clicfg_finder_feed_jumper_ad_new_ui);
        aVar366.mo60268b("FINDER_FEED_JUMPER_AD_NEW_UI", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99459m7 = aVar366;
        C36665a aVar367 = new C36665a(3, "通用跳转器-广告原生页预热", (C32227p) null, 4, (C8480h) null);
        aVar367.mo60268b("FINDER_AD_NATIVE_PRELOAD", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("关闭", "预热资源", "预热进程", "预热资源+进程"));
        aVar367.mo60270f(C32735h.C32737c.clicfg_finder_ad_native_preload);
        f99468n7 = aVar367;
        C36665a aVar368 = new C36665a(0, "拇指赞列表开关", (C32227p) null, 4, (C8480h) null);
        aVar368.mo60270f(C32735h.C32737c.clicfg_finder_finger_like_switch);
        aVar368.mo60268b("FINDER_FINGER_LIKE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99477o7 = aVar368;
        new C35469d("视频号直播评论速度参数配置", C14299j0.f39846d);
        C36665a aVar369 = new C36665a(0, "发表时不透传GPS信息", (C32227p) null, 4, (C8480h) null);
        aVar369.mo60269d("FinderForbidPostMediaGPSInfo");
        aVar369.mo60268b("FINDER_FORBID_POST_MEDIA_GPS_INFO", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99496q7 = aVar369;
        C36665a aVar370 = new C36665a(0, "NPS问卷延迟展示时间", (C32227p) null, 4, (C8480h) null);
        aVar370.mo60268b("FINDER_NPS_SURVEY_DELAY_APPEAR_TIME", C64197v.m75537f(5, 0), C64197v.m75537f("5秒", "跟随问卷"));
        f99505r7 = aVar370;
        C36665a aVar371 = new C36665a(0, "NPS问卷定时隐藏时间", (C32227p) null, 4, (C8480h) null);
        aVar371.mo60268b("FINDER_NPS_SURVEY_AUTO_DISAPPEAR_TIME", C64197v.m75537f(10, 0), C64197v.m75537f("10秒", "跟随问卷"));
        f99514s7 = aVar371;
        C36665a aVar372 = new C36665a(0, "视频号profile是否展示朋友关注推荐入口", (C32227p) null, 4, (C8480h) null);
        aVar372.mo60268b("FINDER_SHOW_FRIEND_FOLLOW_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar372.mo60270f(C32735h.C32737c.clicfg_finder_profile_friend_follow_enable);
        C36665a aVar373 = new C36665a(0, "预加载前台轮询", (C32227p) null, 4, (C8480h) null);
        aVar373.mo60268b("FINDER_PRELOAD_FRONT_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开(30秒)"));
        f99523t7 = aVar373;
        C36665a aVar374 = new C36665a(0, "是否开启星标/点赞搜索", (C32227p) null, 4, (C8480h) null);
        aVar374.mo60268b("FINDER_INTERACTION_SEARCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar374.mo60270f(C32735h.C32737c.clicfg_finder_interaction_search_switch_android);
        f99532u7 = aVar374;
        new C35469d("重置星标引导次数及展示时间", C14292g1.f39839d);
        new C35469d("清除铃声次数记录", C14321s.f39868d);
        new C35469d("清除FinderStream预加载缓存", C14315p.f39862d);
        C36665a aVar375 = new C36665a(0, "星标/私密赞引导时间限制", (C32227p) null, 4, (C8480h) null);
        aVar375.mo60268b("FINDER_STAR_TIPS_TIME_LIMIT", C64197v.m75537f(0, 1), C64197v.m75537f("24小时", "5分钟"));
        f99541v7 = aVar375;
        C36665a aVar376 = new C36665a(1, "星标引导展示开关", (C32227p) null, 4, (C8480h) null);
        aVar376.mo60268b("FINDER_STAR_TIPS_SHOW_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar376.mo60270f(C32735h.C32737c.clicfg_finder_star_tips_show_switch);
        f99550w7 = aVar376;
        C36665a aVar377 = new C36665a(0, "朋友星标过动画开关", (C32227p) null, 4, (C8480h) null);
        aVar377.mo60268b("FINDER_STAR_COUNT_ANIM_SHOW_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar377.mo60270f(C32735h.C32737c.clicfg_finder_star_count_anim_show_switch);
        f99560x7 = aVar377;
        new C36665a(1000, "朋友星标过动画速率", (C32227p) null, 4, (C8480h) null).mo60268b("FINDER_STAR_COUNT_ANIM_DURATION", C64197v.m75537f(500, 600, 700, 800, 900, 1000), C64197v.m75537f("500ms", "600ms", "700ms", "800ms", "900ms", "1000ms"));
        C36665a aVar378 = new C36665a(1, "profile关注按钮颜色", (C32227p) null, 4, (C8480h) null);
        aVar378.mo60268b("FINDER_PROFILE_FOLLOW_GREEN_COLOR", C64197v.m75537f(0, 1), C64197v.m75537f("白色", "绿色"));
        f99570y7 = aVar378;
        C36665a aVar379 = new C36665a(1, "上移动画-是否视频上移", (C32227p) null, 4, (C8480h) null);
        aVar379.mo60268b("FINDER_ANIMATE_VIDEO_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar379.mo60270f(C32735h.C32737c.clicfg_finder_animate_video_enable);
        f99579z7 = aVar379;
        C36665a aVar380 = new C36665a(1, "上移动画-竖视频是否上移", (C32227p) null, 4, (C8480h) null);
        aVar380.mo60268b("FINDER_ANIMATE_PORTRAIT_VIDEO_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar380.mo60270f(C32735h.C32737c.clicfg_finder_animate_portrait_video_enable);
        f99127A7 = aVar380;
        C36665a aVar381 = new C36665a(1, "profile新样式封面开关", (C32227p) null, 4, (C8480h) null);
        aVar381.mo60268b("FINDER_PROFILE_COVER_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99136B7 = aVar381;
        C36665a aVar382 = new C36665a(1, "上移动画-是否使用算法结果", (C32227p) null, 4, (C8480h) null);
        aVar382.mo60268b("FINDER_ANIMATE_USE_ALT_RESULT_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar382.mo60270f(C32735h.C32737c.clicfg_finder_animate_use_alt_result_enable);
        f99145C7 = aVar382;
        C36665a aVar383 = new C36665a(0, "上移动画-打开辅助线", (C32227p) null, 4, (C8480h) null);
        aVar383.mo60268b("FINDER_ANIMATE_USE_LINE_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99154D7 = aVar383;
        C36665a aVar384 = new C36665a(1, "话题新页面(支持多Tab)", (C32227p) null, 4, (C8480h) null);
        aVar384.mo60268b("FINDER_NEW_TOPIC_UI", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar384.mo60270f(C32735h.C32737c.clicfg_finder_new_topic_ui);
        f99163E7 = aVar384;
        C36665a aVar385 = new C36665a(1, "poi新页面(支持多Tab)", (C32227p) null, 4, (C8480h) null);
        aVar385.mo60268b("FINDER_NEW_POI_UI", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar385.mo60270f(C32735h.C32737c.clicfg_finder_new_poi_ui);
        f99172F7 = aVar385;
        C36665a aVar386 = new C36665a(1, "展示IP属地开关", (C32227p) null, 4, (C8480h) null);
        aVar386.mo60268b("FINDER_IP_REGION_SHOW_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar386.mo60270f(C32735h.C32737c.clicfg_finder_ip_region_show_switch);
        f99181G7 = aVar386;
        C36665a aVar387 = new C36665a(1, "视频号全局收藏开关", (C32227p) null, 4, (C8480h) null);
        aVar387.mo60270f(C32735h.C32737c.clicfg_finder_global_fav_switch);
        aVar387.mo60268b("FINDER_GLOBAL_FAV_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99190H7 = aVar387;
        new C35469d("重置私密赞展示状态", C14316q.f39863d);
        C36665a aVar388 = new C36665a(1, "视频号私密赞和星标绑定", (C32227p) null, 4, (C8480h) null);
        aVar388.mo60270f(C32735h.C32737c.clicfg_finder_private_like_bind_star_switch_android);
        aVar388.mo60268b("FINDER_PRIVATE_LIKE_BIND_STAR", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99208J7 = aVar388;
        C36665a aVar389 = new C36665a(0, "视频号私密赞引导", (C32227p) null, 4, (C8480h) null);
        aVar389.mo60270f(C32735h.C32737c.clicfg_finder_private_like_guide_switch_android);
        aVar389.mo60268b("FINDER_PRIVATE_LIKE_GUIDE_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关", str14));
        f99217K7 = aVar389;
        C36665a aVar390 = new C36665a(0, "视频号私密赞引导V2", (C32227p) null, 4, (C8480h) null);
        aVar390.mo60270f(C32735h.C32737c.clicfg_finder_private_like_guide_switch_android_v2);
        aVar390.mo60268b("FINDER_PRIVATE_LIKE_GUIDE_SWITCH_V2", C64197v.m75537f(0, 1), C64197v.m75537f("关", str14));
        C36665a aVar391 = new C36665a(1, "视频号长按私密赞引导", (C32227p) null, 4, (C8480h) null);
        aVar391.mo60270f(C32735h.C32737c.clicfg_finder_private_like_guide_switch_android_long_click);
        aVar391.mo60268b("FINDER_PRIVATE_LIKE_GUIDE_SWITCH_LONG_CLICK", C64197v.m75537f(0, 1), C64197v.m75537f("关", str14));
        f99226L7 = aVar391;
        C36665a aVar392 = new C36665a(0, "视频号私密赞引导动画", (C32227p) null, 4, (C8480h) null);
        aVar392.mo60270f(C32735h.C32737c.clicfg_finder_private_like_guide_switch_android_animate);
        aVar392.mo60268b("FINDER_PRIVATE_LIKE_GUIDE_SWITCH_ANIMATE", C64197v.m75537f(0, 1), C64197v.m75537f("关", str14));
        f99235M7 = aVar392;
        C36665a aVar393 = new C36665a(0, "视频号点赞icon样式", (C32227p) null, 4, (C8480h) null);
        aVar393.mo60270f(C32735h.C32737c.clicfg_finder_like_icon_new_style_android);
        aVar393.mo60268b("FINDER_LIKE_ICON_NEW_STYLE", C64197v.m75537f(0, 1), C64197v.m75537f("旧版样式", "新版样式"));
        f99244N7 = aVar393;
        String str15 = str13;
        C35464c<String> cVar8 = new C35464c<>(str15, "视频号目录清理配置(重启)");
        cVar8.mo60268b("FINDER_VFS_STORAGE_CONFIG", C64197v.m75537f(str15, "{\"targetSize\":52428800,\"expireTimes\":300000,\"thresholds\":52428800,\"isCache\":true,\"interval\":0}"), C64197v.m75537f("VFSStorageConfig代码配置", "清理到50M，5分钟过期"));
        cVar8.mo60270f(C32735h.C32737c.clicfg_finder_vfs_storage_config);
        f99251O7 = cVar8;
        C35464c<String> cVar9 = new C35464c<>(str15, "视频号直播目录清理配置(重启)");
        cVar9.mo60268b("FINDER_LIVE_VFS_STORAGE_CONFIG", C64197v.m75537f(str15, "{\"targetSize\":52428800,\"expireTimes\":300000,\"thresholds\":52428800,\"isCache\":true,\"interval\":0}"), C64197v.m75537f("VFSStorageConfig代码配置", "清理到50M，5分钟过期"));
        cVar9.mo60270f(C32735h.C32737c.clicfg_finder_live_vfs_storage_config);
        f99259P7 = cVar9;
        C35464c<String> cVar10 = new C35464c<>(str15, "视频号直播回放目录清理配置(重启)");
        cVar10.mo60268b("FINDER_LIVE_REPLAY_VFS_STORAGE_CONFIG", C64197v.m75537f(str15, "{\"targetSize\":52428800,\"expireTimes\":300000,\"thresholds\":52428800,\"isCache\":true,\"interval\":0}"), C64197v.m75537f("VFSStorageConfig代码配置", "清理到50M，5分钟过期"));
        cVar10.mo60270f(C32735h.C32737c.clicfg_finder_live_replay_vfs_storage_config);
        f99268Q7 = cVar10;
        new C35469d("视频号资源目录彻底清理", C37544z.f99599d);
        C36665a aVar394 = new C36665a(-1, "异步CreateView+BindView", (C32227p) null, 4, (C8480h) null);
        aVar394.mo60270f(C32735h.C32737c.clicfg_finder_async_bind_view_enable);
        aVar394.mo60268b("FINDER_ASYNC_BIND_VIEW_ENABLE", C64197v.m75537f(0, 1, 2, -1), C64197v.m75537f("关闭", "打开", "Debug模式", "只留异步CreateView"));
        C14309m mVar = C14309m.f39856d;
        C87412m.m108594g(mVar, "clickListener");
        aVar394.f94895n = mVar;
        aVar394.mo60273m("滑动流畅优化");
        f99277R7 = aVar394;
        C36665a aVar395 = new C36665a(0, "异步操控TP播放器", (C32227p) null, 4, (C8480h) null);
        aVar395.mo60270f(C32735h.C32737c.clicfg_finder_async_op_tp_enable);
        aVar395.mo60268b("FINDER_ASYNC_OP_TP_ENABLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        aVar395.mo60273m("滑动流畅优化");
        f99286S7 = aVar395;
        C36665a aVar396 = new C36665a(0, "主播连麦布局变更", (C32227p) null, 4, (C8480h) null);
        aVar396.mo60270f(C32735h.C32737c.clicfg_finder_live_mic_layout_change);
        aVar396.mo60268b("FINDER_LIVE_MIC_LAYOUT_CHANGE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99295T7 = aVar396;
        C36665a aVar397 = new C36665a(1, "主播多人连麦挖洞", (C32227p) null, 4, (C8480h) null);
        aVar397.mo60270f(C32735h.C32737c.clicfg_finder_live_mic_hole_switch);
        aVar397.mo60268b("FINDER_LIVE_MIC_ENABLE_HOLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99304U7 = aVar397;
        C36665a aVar398 = new C36665a(1, "关注/关心双列item改白色", (C32227p) null, 4, (C8480h) null);
        aVar398.mo60270f(C32735h.C32737c.clicfg_finder_follow_two_flow_style);
        aVar398.mo60268b("FINDER_FOLLOW_TWO_FLOW_STYLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "白底描述加粗"));
        f99313V7 = aVar398;
        C37534n nVar = new C37534n();
        nVar.mo60270f(C32735h.C32737c.clicfg_finder_care_flow_white_background);
        nVar.mo60268b("FINDER_CARE_TWO_FLOW_BG_WHITE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99322W7 = nVar;
        C36665a aVar399 = new C36665a(3, "关心双列描述行数限制", (C32227p) null, 4, (C8480h) null);
        aVar399.mo60270f(C32735h.C32737c.clicfg_finder_care_two_flow_desc_max_lines);
        aVar399.mo60268b("FINDER_CARE_TWO_FLOW_DESC_MAX_LINES", C64197v.m75537f(1, 2, 3), C64197v.m75537f("1", "2", str10));
        f99331X7 = aVar399;
        C36665a aVar400 = new C36665a(2, "关心双列描述字体", (C32227p) null, 4, (C8480h) null);
        aVar400.mo60270f(C32735h.C32737c.clicfg_finder_care_two_flow_desc_bold);
        aVar400.mo60268b("FINDER_CARE_TWO_FLOW_DESC_BOLD", C64197v.m75537f(1, 2), C64197v.m75537f("normal", "bold"));
        f99340Y7 = aVar400;
        C36665a aVar401 = new C36665a(3, "关心双列作者信息", (C32227p) null, 4, (C8480h) null);
        aVar401.mo60270f(C32735h.C32737c.clicfg_finder_care_two_flow_author_style);
        String str16 = "展示";
        String str17 = "不展示";
        aVar401.mo60268b("FINDER_CARE_TWO_FLOW_AUTHOR_STYLE", C64197v.m75537f(1, 2, 3), C64197v.m75537f(str16, str17, "仅关注的作者展示"));
        f99349Z7 = aVar401;
        C36665a aVar402 = new C36665a(1, "关心双列tag信息", (C32227p) null, 4, (C8480h) null);
        aVar402.mo60270f(C32735h.C32737c.clicfg_finder_care_two_flow_tag_style);
        aVar402.mo60268b("FINDER_CARE_TWO_FLOW_TAG_STYLE", C64197v.m75537f(1, 2, 3), C64197v.m75537f(str16, str17, "仅未关注的作者展示"));
        f99357a8 = aVar402;
        C36665a aVar403 = new C36665a(0, "关心流标签弱化", (C32227p) null, 4, (C8480h) null);
        aVar403.mo60270f(C32735h.C32737c.clicfg_finder_follow_tag_change_color);
        aVar403.mo60268b("FinderFollowTagChangeColor", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99365b8 = aVar403;
        C36665a aVar404 = new C36665a(0, "关心/关注流自动播放", (C32227p) null, 4, (C8480h) null);
        aVar404.mo60270f(C32735h.C32737c.clicfg_finder_two_flow_auto_play_video);
        aVar404.mo60268b("FinderTwoFlowAutoPlayVideo", C64197v.m75537f(0, 1, 2, 3), C64197v.m75537f("都关闭", "只关心打开", "只关注打开", "都打开"));
        f99373c8 = aVar404;
        C36665a aVar405 = new C36665a(0, "打开双流自动播放基线", (C32227p) null, 4, (C8480h) null);
        aVar405.mo60268b("FinderTwoFlowAutoPlayBaseLine", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99382d8 = aVar405;
        C36665a aVar406 = new C36665a(0, "关心/关注流有封面不自动播放", (C32227p) null, 4, (C8480h) null);
        aVar406.mo60270f(C32735h.C32737c.clicfg_finder_two_flow_abort_play_of_cover);
        aVar406.mo60268b("FinderTwoFlowAbortPlayOfCover", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99391e8 = aVar406;
        C36665a aVar407 = new C36665a(0, "主播连麦画面聚焦", (C32227p) null, 4, (C8480h) null);
        aVar407.mo60270f(C32735h.C32737c.clicfg_finder_live_mic_focus_switch);
        aVar407.mo60268b("FINDER_LIVE_MIC_FORCE_SWITCHE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        C36665a aVar408 = new C36665a(1, "视频号目录自己的清理策略", (C32227p) null, 4, (C8480h) null);
        aVar408.mo60270f(cVar2);
        aVar408.mo60268b("FINDER_POSTING_STRATEGY", C64197v.m75537f(0, 1), C64197v.m75537f("启用", "关闭"));
        f99400f8 = aVar408;
        C36665a aVar409 = new C36665a(1, "流神器指定版本", (C32227p) null, 4, (C8480h) null);
        aVar409.mo60268b("FINDER_ENABLE_DEBUG_VIEW_V2", C64197v.m75537f(0, 1), C64197v.m75537f("第一版", "第二版"));
        f99418h8 = aVar409;
        new C36316a(false, "直播feed模拟直播已结束", "FINDER_LIVE_FEED_REPORT_HARDCODE_LIVE_CLOSE");
        C36665a aVar410 = new C36665a(1, "视频号屏蔽Feed中的公众号链接", (C32227p) null, 4, (C8480h) null);
        aVar410.mo60270f(C32735h.C32737c.clicfg_finder_disable_feed_mp_link);
        aVar410.mo60268b("FINDER_DISABLE_FEED_MP_LINK", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99427i8 = aVar410;
        C36665a aVar411 = new C36665a(1, "分享流拉到数据后整体更新", (C32227p) null, 4, (C8480h) null);
        aVar411.mo60270f(C32735h.C32737c.clicfg_finder_share_update_strategy);
        aVar411.mo60268b("FINDER_SHARE_REPLACE_STRATEGY", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99436j8 = aVar411;
        C36665a aVar412 = new C36665a(1, "finderBaseReq带上AdBaseRequest", (C32227p) null, 4, (C8480h) null);
        aVar412.mo60270f(C32735h.C32737c.clicfg_finder_fill_ad_base_req);
        aVar412.mo60268b("FINDER_FILL_AD_BASE_REQUEST", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99444k8 = aVar412;
        C36316a aVar413 = new C36316a(true, "推荐理由新样式", "FINDER_NEW_RECOMMEND_REASION_SHAPE");
        aVar413.mo60270f(C32735h.C32737c.clicfg_finder_new_recommend_reasion_shape_enable);
        f99452l8 = aVar413;
        C36665a aVar414 = new C36665a(1, "视频号评论身份主动切换开关", (C32227p) null, 4, (C8480h) null);
        aVar414.mo60270f(C32735h.C32737c.clicfg_finder_comment_change_scene_switch);
        aVar414.mo60268b("FINDER_COMMENT_CHANGE_SCENE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99469n8 = aVar414;
        new C35469d("重置视频号评论身份主动切换行为", C14326u.f39873d);
        C36665a aVar415 = new C36665a(1, "视频号聊天气泡分享样式调整开关", (C32227p) null, 4, (C8480h) null);
        aVar415.mo60270f(C32735h.C32737c.clicfg_finder_share_chatting_style);
        aVar415.mo60268b("FinderShareChattingStyle", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99478o8 = aVar415;
        C36665a aVar416 = new C36665a(1, "视频号合作机构显示开关", (C32227p) null, 4, (C8480h) null);
        aVar416.mo60270f(C32735h.C32737c.clicfg_finder_mcn_show_switch);
        aVar416.mo60268b("FinderMcnShowSwitch", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99488p8 = aVar416;
        C36665a aVar417 = new C36665a(1, "视频号分享卡片宽度对齐朋友圈", (C32227p) null, 4, (C8480h) null);
        aVar417.mo60268b("FinderShareChattingNewSize", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99497q8 = aVar417;
        C36665a aVar418 = new C36665a(0, "视频号h5搜索预加载相关流", (C32227p) null, 4, (C8480h) null);
        aVar418.mo60270f(C32735h.C32737c.clicfg_finder_search_h5_preload_switch);
        aVar418.mo60268b("FinderH5SearchRelPreload", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99506r8 = aVar418;
        C36665a aVar419 = new C36665a(0, "feed长按简易菜单", (C32227p) null, 4, (C8480h) null);
        aVar419.mo60270f(C32735h.C32737c.clicfg_finder_long_click_menu_new_style);
        aVar419.mo60268b("FINDER_LONG_CLICK_MENU_NEW_STYLE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99515s8 = aVar419;
        C36665a aVar420 = new C36665a(400, "feed长按出菜单时间(ms)", (C32227p) null, 4, (C8480h) null);
        aVar420.mo60270f(C32735h.C32737c.clicfg_finder_long_click_menu_time);
        aVar420.mo60268b("FINDER_TIMELINE_LONG_PRESS_TIMEOUT", C64197v.m75537f(400, 450, 500, Integer.valueOf(C82341m.CTRL_INDEX), 600, Integer.valueOf(C91036c.CTRL_INDEX), 700, 750, 800), C64197v.m75537f("400(默认)", "450", "500", "550", "600", "650", "700", "750", "800"));
        f99524t8 = aVar420;
        C37527f1 f1Var = new C37527f1();
        f1Var.mo60270f(C32735h.C32737c.clicfg_finder_star_recommend_tips_switch);
        f1Var.mo60268b("FINDER_STAR_RECOMMEND_TIPS_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99533u8 = f1Var;
        new C35469d("重置星标推荐提示", C14287e1.f39834d);
        C36665a aVar421 = new C36665a(0, "拇指赞后反馈开关", (C32227p) null, 4, (C8480h) null);
        aVar421.mo60270f(C32735h.C32737c.clicfg_finder_star_recommend_switch);
        aVar421.mo60268b("FINDER_STAR_RECOMMEND_SWITCH", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99542v8 = aVar421;
        C36665a aVar422 = new C36665a(1, "通用跳转器跳过observer覆盖", (C32227p) null, 4, (C8480h) null);
        aVar422.mo60270f(C32735h.C32737c.clicfg_finder_jumpinfo_observer_skip_overwrite);
        aVar422.mo60268b("FINDER_JUMPINFO_OBSERVER_SKIP_OVERWRITE", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99551w8 = aVar422;
        C36665a aVar423 = new C36665a(600000, "getAllDeviceInfo调用时间间隔", (C32227p) null, 4, (C8480h) null);
        aVar423.mo60270f(C32735h.C32737c.clicfg_finder_get_all_device_info_call_interval);
        aVar423.mo60268b("FinderGetDeviceInfoIntervalMs", C64197v.m75537f(600000, 30000, 0), C64197v.m75537f("10分钟", "30秒", "不限制"));
        f99561x8 = aVar423;
        C36665a aVar424 = new C36665a(600000, "getUserAgent调用时间间隔", (C32227p) null, 4, (C8480h) null);
        aVar424.mo60270f(C32735h.C32737c.clicfg_finder_get_user_agent_call_interval);
        aVar424.mo60268b("FinderGetUserAgentIntervalMs", C64197v.m75537f(600000, 30000, 0), C64197v.m75537f("10分钟", "30秒", "不限制"));
        f99571y8 = aVar424;
        C36665a aVar425 = new C36665a(1, "视频号发表半屏创建开关", (C32227p) null, 4, (C8480h) null);
        aVar425.mo60270f(C32735h.C32737c.clicfg_finder_post_half_create_switch);
        aVar425.mo60268b("FinderMcnShowSwitch", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99580z8 = aVar425;
        C36665a aVar426 = new C36665a(1, "使用observerWrapper新逻辑", (C32227p) null, 4, (C8480h) null);
        aVar426.mo60270f(C32735h.C32737c.clicfg_finder_jumper_use_observer_wrapper);
        aVar426.mo60268b("FinderJumperUseObserverWrapper", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99128A8 = aVar426;
        C36665a aVar427 = new C36665a(1, "通用跳转器merge时读取临时值", (C32227p) null, 4, (C8480h) null);
        aVar427.mo60270f(C32735h.C32737c.clicfg_finder_jumper_read_temp_value);
        aVar427.mo60268b("FinderNewJumperLiveData", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99137B8 = aVar427;
        new C35469d("重置mixcell提示", C14308l1.f39855d);
        C35840b bVar4 = new C35840b(0.25f, "视频号滑动帧率采样控制");
        bVar4.mo60270f(C32735h.C32737c.clicfg_finder_scroll_fps_enable);
        bVar4.mo60268b("FinderScrollFps", C64197v.m75537f(Float.valueOf(0.0f), Float.valueOf(1.0f)), C64197v.m75537f("关闭", "打开"));
        C36665a aVar428 = new C36665a(1, "视频号-播放器-消息线程-复用", (C32227p) null, 4, (C8480h) null);
        aVar428.mo60270f(C32735h.C32737c.clicfg_finder_tp_work_thread_resuse_switch);
        aVar428.mo60268b("FinderTPWorkThreadReuseSwitch", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99146C8 = aVar428;
        C36665a aVar429 = new C36665a(1, "通用跳转器预加载计时策略", (C32227p) null, 4, (C8480h) null);
        aVar429.mo60270f(C32735h.C32737c.clicfg_finder_jumper_preload_strategy);
        aVar429.mo60268b("FinderJumperPreloadStrategy", C64197v.m75537f(0, 1), C64197v.m75537f("组件曝光时", "视频曝光时"));
        f99155D8 = aVar429;
        C35840b bVar5 = new C35840b(0.0f, "关注双流曝光上报最低比例");
        bVar5.mo60270f(C32735h.C32737c.clicfg_finder_follow_mark_read_percent);
        bVar5.mo60268b("FinderFollowFlowMarkReadPercent", C64197v.m75537f(Float.valueOf(0.5f), Float.valueOf(0.3f), Float.valueOf(0.0f)), C64197v.m75537f("50%", "30%", "0%"));
        f99164E8 = bVar5;
        C36665a aVar430 = new C36665a(1, "个人中心订单入口缓存开关", (C32227p) null, 4, (C8480h) null);
        aVar430.mo60270f(C32735h.C32737c.clicfg_finder_self_live_order_entrace_cache_switch);
        aVar430.mo60268b("FinderSelfLiveOrderEntranceCacheSwitch", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99173F8 = aVar430;
        C36665a aVar431 = new C36665a(1, "广告H5参数拼接保证在hashtag之前", (C32227p) null, 4, (C8480h) null);
        aVar431.mo60270f(C32735h.C32737c.clicfg_finder_ad_url_param_append_before_hashtag);
        aVar431.mo60268b("AdUrlParamAppendBeforeHashtag", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99182G8 = aVar431;
        C36665a aVar432 = new C36665a(1, "是否打开hdr-hlg", (C32227p) null, 4, (C8480h) null);
        aVar432.mo60270f(C32735h.C32737c.clicfg_finder_hdr_hlg);
        aVar432.mo60268b("是否打开hdr-hlg", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99191H8 = aVar432;
        C36665a aVar433 = new C36665a(1, "是否使用FLAG_KEEP_SCREEN_ON", (C32227p) null, 4, (C8480h) null);
        aVar433.mo60270f(C32735h.C32737c.clicfg_finder_flag_screen_on);
        aVar433.mo60268b("是是否使用FLAG_KEEP_SCREEN_ON", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99200I8 = aVar433;
        C35464c<String> cVar11 = new C35464c<>(str15, "展示精简标题的场景");
        cVar11.mo60268b("showCardDescCommentSceneConfig", C64197v.m75537f("null", "1/17/18/20/25/38/39/156/171"), C64197v.m75537f(str15, "1/17/18/20/25/38/39/156/171"));
        cVar11.mo60270f(C32735h.C32737c.clicfg_finder_show_card_desc_config);
        f99209J8 = cVar11;
        new C35469d("PagLoader测试", C14296i1.f39843d);
        new C36316a(false, "PAGLoader不用缓存", "PAG_LOADER_NO_CACHE");
        C36665a aVar434 = new C36665a(0, "请求是否开启debug-flag", (C32227p) null, 4, (C8480h) null);
        aVar434.mo60268b("请求是否开启DebugFlag", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99227L8 = aVar434;
        C36665a aVar435 = new C36665a(0, "是否本地mock评论区广告", (C32227p) null, 4, (C8480h) null);
        aVar435.mo60268b("是否mock评论区广告", C64197v.m75537f(0, 1), C64197v.m75537f("关闭", "打开"));
        f99236M8 = aVar435;
    }

    /* renamed from: a */
    public static final boolean[] m41373a(C37521f fVar) {
        fVar.getClass();
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_finder_meida_gesture_preview, "{isEnableImage:false,isEnableVideo:false,hard-close:[]}");
        if (!TextUtils.isEmpty(Y60)) {
            try {
                Log.m105924i("FinderConfig", "[checkEnableGesturePreviewMedia] JSON=" + Y60);
                JSONObject jSONObject = new JSONObject(Y60);
                JSONArray jSONArray = jSONObject.getJSONArray("hard-close");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String string = jSONObject2.getString("device-brand");
                    String string2 = jSONObject2.getString("device-model");
                    int i2 = jSONObject2.getInt("below-sdk-version");
                    boolean z = jSONObject2.getBoolean("isEnableImage");
                    boolean z2 = jSONObject2.getBoolean("isEnableVideo");
                    String str = Build.BRAND + ' ' + C87203t.m108275k();
                    StringBuilder sb = new StringBuilder();
                    sb.append("[checkEnableGesturePreviewMedia] name=");
                    sb.append(string);
                    sb.append(" model=");
                    sb.append(string2);
                    sb.append(" version=");
                    sb.append(i2);
                    sb.append(" isEnableImage=");
                    sb.append(z);
                    sb.append(" isEnableVideo=");
                    sb.append(z2);
                    sb.append(" | this device=");
                    sb.append(str);
                    sb.append(" version=");
                    int i3 = Build.VERSION.SDK_INT;
                    sb.append(i3);
                    Log.m105924i("FinderConfig", sb.toString());
                    if (i2 >= i3) {
                        C87412m.m108593f(string, "name");
                        if (C112550d0.m153801u(str, string, true)) {
                            C87412m.m108593f(string2, "model");
                            if (C112550d0.m153801u(str, string2, true)) {
                                return new boolean[]{z, z2};
                            }
                        } else {
                            continue;
                        }
                    }
                }
                boolean z3 = jSONObject.getBoolean("isEnableImage");
                boolean z4 = jSONObject.getBoolean("isEnableVideo");
                boolean[] zArr = {z3, z4};
                Log.m105924i("FinderConfig", "[checkEnableGesturePreviewMedia] isEnableImage=" + z3 + " isEnableVideo=" + z4);
                return zArr;
            } catch (Exception e) {
                Log.printErrStackTrace("FinderConfig", e, "", new Object[0]);
            }
        } else {
            Log.m105924i("FinderConfig", "[checkEnableGesturePreviewMedia] json is Empty! just pass!");
            return new boolean[]{true, true};
        }
    }

    /* renamed from: b */
    public static final boolean m41374b(C37521f fVar, List list, String str) {
        fVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60((C32735h.C32737c) it.next(), "{mode:1,whitelist:[],apilevel:[],company:[],blacklist:[]}");
            if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                Log.m105924i("FinderConfig", "checkEnableHDR: json:" + Y60);
            }
            if (!TextUtils.isEmpty(Y60)) {
                try {
                    JSONObject jSONObject = new JSONObject(Y60);
                    if (jSONObject.getInt("mode") == 1) {
                        JSONArray jSONArray = jSONObject.getJSONArray("whitelist");
                        int length = jSONArray.length();
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            String string = jSONArray.getString(i);
                            if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG) {
                                Log.m105924i("FinderConfig", "checkEnableHDR modelName:" + string + " buildMod:" + C87203t.m108275k());
                            }
                            if (C112551y.m153809i(C87203t.m108275k(), string, true)) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    Log.printErrStackTrace("FinderConfig", th, "", new Object[0]);
                }
            }
        }
        Log.m105924i("FinderConfig", "checkEnableHDR " + str + " enableHdr:" + z + " duration:" + (System.currentTimeMillis() - currentTimeMillis));
        return z;
    }

    /* renamed from: A */
    public final long mo61147A() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_finder_long_video_max_size, ((long) f99383e) * 450);
    }

    /* renamed from: B */
    public final long mo61148B() {
        if (f99479p.mo60266n().longValue() > 0 && (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED)) {
            return f99479p.mo60266n().longValue();
        }
        return mo61147A() + ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_finder_long_video_max_size_buffer, ((long) f99383e) * 100);
    }

    /* renamed from: C */
    public final C35464c<Integer> mo61149C() {
        return f99367c2;
    }

    /* renamed from: D */
    public final int mo61150D() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderCommentNickNameMaxLength", 6);
    }

    /* renamed from: E */
    public final int mo61151E() {
        return ((Number) ((C36570n) f99219L).getValue()).intValue();
    }

    /* renamed from: F */
    public final int mo61152F() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderCoverCompressPicLevel", 50);
    }

    /* renamed from: G */
    public final boolean mo61153G() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_finder_remux_use_adaparams, 1) == 1;
    }

    /* renamed from: H */
    public final int mo61154H() {
        if (f99211K1.mo60266n().intValue() != 1) {
            return 2;
        }
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_LAST_COMMENT_SCENE_INT_SYNC, f99260Q);
        return j <= 0 ? f99260Q : j;
    }

    /* renamed from: I */
    public final boolean mo61155I() {
        return f99438k2.mo60266n().intValue() == 1;
    }

    /* renamed from: J */
    public final int mo61156J() {
        return C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_SWITCH_SCENE_TIP_INT_SYNC, 4);
    }

    /* renamed from: K */
    public final boolean mo61157K() {
        return (f99237N != 0 || Log.getLogLevel() > 1) && ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderPoiJumpTopicSwitch", 0) == 1;
    }

    /* renamed from: L */
    public final boolean mo61158L() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_topic_switch, 1) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r8 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        if (r8 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        if (r8 != null) goto L_0x008c;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo61159M(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "defaultStr"
            gy3.C87412m.m108594g(r9, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r1 = ""
            r2 = 4
            r3 = 3
            r4 = 1
            if (r0 == 0) goto L_0x004d
            if (r8 == r4) goto L_0x003c
            if (r8 == r3) goto L_0x002a
            if (r8 == r2) goto L_0x0018
            r9 = r1
            goto L_0x004d
        L_0x0018:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131829962(0x7f1124ca, float:1.9292908E38)
            java.lang.String r9 = r9.getString(r0)
            java.lang.String r0 = "{\n                    MM…achine)\n                }"
            gy3.C87412m.m108593f(r9, r0)
            goto L_0x004d
        L_0x002a:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131829957(0x7f1124c5, float:1.9292898E38)
            java.lang.String r9 = r9.getString(r0)
            java.lang.String r0 = "{\n                    MM…follow)\n                }"
            gy3.C87412m.m108593f(r9, r0)
            goto L_0x004d
        L_0x003c:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131829959(0x7f1124c7, float:1.9292902E38)
            java.lang.String r9 = r9.getString(r0)
            java.lang.String r0 = "{\n                    MM…friend)\n                }"
            gy3.C87412m.m108593f(r9, r0)
        L_0x004d:
            r0 = 0
            r5 = 0
            java.lang.String r6 = "FinderAccountAccess.acco…Info.finder_init.tabInfos"
            if (r8 == r4) goto L_0x00c4
            if (r8 == r3) goto L_0x0091
            if (r8 == r2) goto L_0x0059
            goto L_0x00f7
        L_0x0059:
            zc1.b r8 = zc1.C66785b.f191882e
            bd1.e r8 = r8.mo90673n0()
            te3.qq2 r8 = r8.mo62397b()
            java.util.LinkedList<te3.cn1> r8 = r8.f140466g
            gy3.C87412m.m108593f(r8, r6)
            java.util.Iterator r8 = r8.iterator()
        L_0x006c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r1 = r8.next()
            r3 = r1
            te3.cn1 r3 = (te3.C49027cn1) r3
            int r3 = r3.f131837d
            if (r3 != r2) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x006c
            r5 = r1
        L_0x0083:
            te3.cn1 r5 = (te3.C49027cn1) r5
            if (r5 == 0) goto L_0x008f
            java.lang.String r8 = r5.f131838e
            if (r8 != 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r1 = r8
            goto L_0x00f7
        L_0x008f:
            r1 = r9
            goto L_0x00f7
        L_0x0091:
            zc1.b r8 = zc1.C66785b.f191882e
            bd1.e r8 = r8.mo90673n0()
            te3.qq2 r8 = r8.mo62397b()
            java.util.LinkedList<te3.cn1> r8 = r8.f140466g
            gy3.C87412m.m108593f(r8, r6)
            java.util.Iterator r8 = r8.iterator()
        L_0x00a4:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r1 = r8.next()
            r2 = r1
            te3.cn1 r2 = (te3.C49027cn1) r2
            int r2 = r2.f131837d
            if (r2 != r3) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            if (r2 == 0) goto L_0x00a4
            r5 = r1
        L_0x00bb:
            te3.cn1 r5 = (te3.C49027cn1) r5
            if (r5 == 0) goto L_0x008f
            java.lang.String r8 = r5.f131838e
            if (r8 != 0) goto L_0x008c
            goto L_0x008f
        L_0x00c4:
            zc1.b r8 = zc1.C66785b.f191882e
            bd1.e r8 = r8.mo90673n0()
            te3.qq2 r8 = r8.mo62397b()
            java.util.LinkedList<te3.cn1> r8 = r8.f140466g
            gy3.C87412m.m108593f(r8, r6)
            java.util.Iterator r8 = r8.iterator()
        L_0x00d7:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r8.next()
            r2 = r1
            te3.cn1 r2 = (te3.C49027cn1) r2
            int r2 = r2.f131837d
            if (r2 != r4) goto L_0x00ea
            r2 = 1
            goto L_0x00eb
        L_0x00ea:
            r2 = 0
        L_0x00eb:
            if (r2 == 0) goto L_0x00d7
            r5 = r1
        L_0x00ee:
            te3.cn1 r5 = (te3.C49027cn1) r5
            if (r5 == 0) goto L_0x008f
            java.lang.String r8 = r5.f131838e
            if (r8 != 0) goto L_0x008c
            goto L_0x008f
        L_0x00f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C37521f.mo61159M(int, java.lang.String):java.lang.String");
    }

    /* renamed from: N */
    public final int mo61160N() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ultron_album_video_max_select_duration_android, 300);
    }

    /* renamed from: O */
    public final VideoTransPara mo61161O() {
        Class cls = C36594q.class;
        Class cls2 = C64999e.class;
        if (((C64999e) C86312j.m106911c(cls2)).mo89162fm()) {
            VideoTransPara Ny = ((C64999e) C86312j.m106911c(cls2)).mo89158Ny();
            if (Ny != null) {
                return Ny;
            }
            VideoTransPara c6 = ((C36594q) C86312j.m106911c(cls)).mo60737c6();
            C87412m.m108593f(c6, "getService(IVideoControl…ava).finderAlbumVideoPara");
            return c6;
        }
        VideoTransPara c64 = ((C36594q) C86312j.m106911c(cls)).mo60737c6();
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_video_max_bitrate, 0);
        if (Qe > 0) {
            c64.f267169g = Qe;
        }
        C87412m.m108593f(c64, "params");
        return c64;
    }

    /* renamed from: P */
    public final VideoTransPara mo61162P() {
        Class cls = C36594q.class;
        Class cls2 = C64999e.class;
        if (((C64999e) C86312j.m106911c(cls2)).mo89162fm()) {
            VideoTransPara Ny = ((C64999e) C86312j.m106911c(cls2)).mo89158Ny();
            if (Ny != null) {
                return Ny;
            }
            VideoTransPara Gu0 = ((C36594q) C86312j.m106911c(cls)).Gu0();
            C87412m.m108593f(Gu0, "getService(IVideoControl…va).finderRecordVideoPara");
            return Gu0;
        }
        VideoTransPara Gu02 = ((C36594q) C86312j.m106911c(cls)).Gu0();
        C87412m.m108593f(Gu02, "getService(IVideoControl…va).finderRecordVideoPara");
        return Gu02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00fb A[Catch:{ all -> 0x0148 }] */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final rx3.C13604l<java.lang.Integer, java.lang.Boolean> mo61163Q() {
        /*
            r16 = this;
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            java.lang.String r1 = "getDefault()"
            java.lang.String r2 = ""
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            java.lang.String r4 = "FinderConfig"
            di3.d r5 = di3.C86312j.m106911c(r3)
            h81.h r5 = (h81.C32735h) r5
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_finder_video_count
            r7 = 4
            int r5 = r5.mo58779Qe(r6, r7)
            r6 = 0
            java.lang.String r7 = p156gj.C87203t.m108275k()     // Catch:{ all -> 0x014a }
            java.lang.String r8 = "getModel()"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ all -> 0x014a }
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ all -> 0x014a }
            gy3.C87412m.m108593f(r8, r1)     // Catch:{ all -> 0x014a }
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch:{ all -> 0x014a }
            gy3.C87412m.m108593f(r7, r0)     // Catch:{ all -> 0x014a }
            java.lang.String r8 = android.os.Build.BRAND     // Catch:{ all -> 0x014a }
            java.lang.String r9 = "BRAND"
            gy3.C87412m.m108593f(r8, r9)     // Catch:{ all -> 0x014a }
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ all -> 0x014a }
            gy3.C87412m.m108593f(r9, r1)     // Catch:{ all -> 0x014a }
            java.lang.String r1 = r8.toLowerCase(r9)     // Catch:{ all -> 0x014a }
            gy3.C87412m.m108593f(r1, r0)     // Catch:{ all -> 0x014a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x014a }
            r0.<init>()     // Catch:{ all -> 0x014a }
            java.lang.String r8 = "API#"
            r0.append(r8)     // Catch:{ all -> 0x014a }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x014a }
            r0.append(r8)     // Catch:{ all -> 0x014a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x014a }
            java.lang.String r8 = p156gj.C87201q.m108258b()     // Catch:{ all -> 0x014a }
            di3.d r9 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x014a }
            h81.h r9 = (h81.C32735h) r9     // Catch:{ all -> 0x014a }
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_finder_video_wait_for_release     // Catch:{ all -> 0x014a }
            java.lang.String r9 = r9.Y60(r10, r2)     // Catch:{ all -> 0x014a }
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ all -> 0x014a }
            java.lang.String r11 = ", expt="
            java.lang.String r12 = " apiLevel="
            java.lang.String r13 = " model="
            r14 = 1
            if (r10 != 0) goto L_0x00b5
            java.lang.String r10 = "waitForRelease"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ all -> 0x014a }
            boolean r10 = z04.C112550d0.m153801u(r9, r7, r6)     // Catch:{ all -> 0x014a }
            if (r10 != 0) goto L_0x008d
            boolean r10 = z04.C112550d0.m153801u(r9, r1, r6)     // Catch:{ all -> 0x014a }
            if (r10 != 0) goto L_0x008d
            boolean r10 = z04.C112550d0.m153801u(r9, r0, r6)     // Catch:{ all -> 0x014a }
            if (r10 == 0) goto L_0x00b5
        L_0x008d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x014a }
            r10.<init>()     // Catch:{ all -> 0x014a }
            java.lang.String r15 = "[getVideoViewConfig#waitForRelease] brand="
            r10.append(r15)     // Catch:{ all -> 0x014a }
            r10.append(r1)     // Catch:{ all -> 0x014a }
            r10.append(r13)     // Catch:{ all -> 0x014a }
            r10.append(r7)     // Catch:{ all -> 0x014a }
            r10.append(r12)     // Catch:{ all -> 0x014a }
            r10.append(r0)     // Catch:{ all -> 0x014a }
            r10.append(r11)     // Catch:{ all -> 0x014a }
            r10.append(r9)     // Catch:{ all -> 0x014a }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x014a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)     // Catch:{ all -> 0x014a }
            r9 = 1
            goto L_0x00b6
        L_0x00b5:
            r9 = 0
        L_0x00b6:
            di3.d r3 = di3.C86312j.m106911c(r3)     // Catch:{ all -> 0x0148 }
            h81.h r3 = (h81.C32735h) r3     // Catch:{ all -> 0x0148 }
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_finder_video_single_count     // Catch:{ all -> 0x0148 }
            java.lang.String r3 = r3.Y60(r10, r2)     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = "SM7325;SM6375"
            boolean r15 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0148 }
            if (r15 == 0) goto L_0x00ce
            boolean r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64     // Catch:{ all -> 0x0148 }
            if (r15 == 0) goto L_0x00d6
        L_0x00ce:
            if (r8 == 0) goto L_0x00f5
            boolean r10 = z04.C112550d0.m153801u(r10, r8, r14)     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x00f5
        L_0x00d6:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r10.<init>()     // Catch:{ all -> 0x0148 }
            java.lang.String r15 = "[getVideoViewConfig#videoSingleCount] isArm64:"
            r10.append(r15)     // Catch:{ all -> 0x0148 }
            boolean r15 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_ARM64     // Catch:{ all -> 0x0148 }
            r10.append(r15)     // Catch:{ all -> 0x0148 }
            java.lang.String r15 = " hardware:"
            r10.append(r15)     // Catch:{ all -> 0x0148 }
            r10.append(r8)     // Catch:{ all -> 0x0148 }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)     // Catch:{ all -> 0x0148 }
            r5 = 1
        L_0x00f5:
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)     // Catch:{ all -> 0x0148 }
            if (r8 != 0) goto L_0x013a
            java.lang.String r8 = "videoSingleCount"
            gy3.C87412m.m108593f(r3, r8)     // Catch:{ all -> 0x0148 }
            boolean r8 = z04.C112550d0.m153801u(r3, r7, r6)     // Catch:{ all -> 0x0148 }
            if (r8 != 0) goto L_0x0113
            boolean r8 = z04.C112550d0.m153801u(r3, r1, r6)     // Catch:{ all -> 0x0148 }
            if (r8 != 0) goto L_0x0113
            boolean r8 = z04.C112550d0.m153801u(r3, r0, r6)     // Catch:{ all -> 0x0148 }
            if (r8 == 0) goto L_0x013a
        L_0x0113:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            r8.<init>()     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = "[getVideoViewConfig#videoSingleCount] brand="
            r8.append(r10)     // Catch:{ all -> 0x0148 }
            r8.append(r1)     // Catch:{ all -> 0x0148 }
            r8.append(r13)     // Catch:{ all -> 0x0148 }
            r8.append(r7)     // Catch:{ all -> 0x0148 }
            r8.append(r12)     // Catch:{ all -> 0x0148 }
            r8.append(r0)     // Catch:{ all -> 0x0148 }
            r8.append(r11)     // Catch:{ all -> 0x0148 }
            r8.append(r3)     // Catch:{ all -> 0x0148 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0148 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ all -> 0x0148 }
            r5 = 1
        L_0x013a:
            rx3.l r0 = new rx3.l     // Catch:{ all -> 0x0148 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0148 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0148 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0148 }
            return r0
        L_0x0148:
            r0 = move-exception
            goto L_0x014c
        L_0x014a:
            r0 = move-exception
            r9 = 0
        L_0x014c:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r2, r1)
            rx3.l r0 = new rx3.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: up1.C37521f.mo61163Q():rx3.l");
    }

    /* renamed from: R */
    public final long mo61164R() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_finder_video_max_size, ((long) f99383e) * 28);
    }

    /* renamed from: S */
    public final int mo61165S() {
        return f99120A;
    }

    /* renamed from: T */
    public final boolean mo61166T() {
        boolean z = false;
        boolean z2 = f99363b6.mo60266n().intValue() == 1;
        boolean z3 = f99371c6.mo60266n().intValue() == 1;
        if (z2 || z3) {
            z = true;
        }
        Log.m105924i("FinderConfig", "isEnablePreloadVideo: result=" + z + ", oldSwitchOpen=" + z2 + ", newSwitchOpen=" + z3);
        return z;
    }

    /* renamed from: T0 */
    public C35464c<Integer> mo57066T0() {
        return f99325X1;
    }

    /* renamed from: U */
    public final boolean mo61167U() {
        boolean z = false;
        boolean z2 = f99380d6.mo60266n().intValue() == 1;
        boolean z3 = f99389e6.mo60266n().intValue() == 1;
        if (z2 || z3) {
            z = true;
        }
        Log.m105924i("FinderConfig", "isEnablePreloadVideoAttachSurface: result=" + z + ", oldSwitchOpen=" + z2 + ", newSwitchOpen=" + z3);
        return z;
    }

    /* renamed from: V */
    public final boolean mo61168V() {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_preload_video_for_preload_refresh_enable, 1) != 1) {
            z = false;
        }
        Log.m105924i("FinderConfig", "[GET] isEnablePreloadVideoForPreloadStream=" + z);
        return z;
    }

    /* renamed from: W */
    public final boolean mo61169W() {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_store_last_tab_type_enable, 1) != 1) {
            z = false;
        }
        Log.m105924i("FinderConfig", "[GET] isEnableStoreLastTabType=" + z);
        return z;
    }

    /* renamed from: X */
    public final boolean mo61170X() {
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_enter_get_gps, 1) != 1) {
            z = false;
        }
        Log.m105924i("FinderConfig", "[GET] isGetGps=" + z);
        return z;
    }

    /* renamed from: Y */
    public final boolean mo61171Y() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_multi_video_download_enable, 1) == 1;
    }

    /* renamed from: Z */
    public final boolean mo61172Z() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_image_preload_enable, 1) == 1;
    }

    /* renamed from: a0 */
    public final boolean mo61173a0() {
        boolean z = false;
        boolean z2 = f99291T3.mo60266n().intValue() == 1;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_video_preload_enable, 1) == 1) {
            z = true;
        }
        boolean z3 = BuildInfo.DEBUG;
        return (z3 || z3) ? z2 : z;
    }

    /* renamed from: b0 */
    public final boolean mo61174b0() {
        return f99415h5.mo60266n().intValue() == 1;
    }

    /* renamed from: c */
    public final boolean mo61175c() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderMaxMentionSbCount", 1000) > 0;
    }

    /* renamed from: c0 */
    public final void mo61176c0(int i) {
        Log.m105924i("FinderConfig", "set REPLY_SCENE value:" + i);
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LAST_COMMENT_SCENE_INT_SYNC, Integer.valueOf(i));
    }

    /* renamed from: d */
    public final String mo61177d() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderHeadIconFormat");
        if (c == null) {
            c = "";
        }
        Log.m105926v("FinderConfig", "AVATAR_URL_FORMAT_JSON FinderAvatarUrlFormat: dynamic config json = " + c);
        return Util.isNullOrNil(c) ? "{\"small\":\"64\",\"medium\":\"132\",\"origin\":\"0\"}" : c;
    }

    /* renamed from: d0 */
    public final void mo61178d0(int i) {
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_SWITCH_SCENE_TIP_INT_SYNC, Integer.valueOf(i));
    }

    /* renamed from: e */
    public final int mo61179e() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_big_file_length, f99383e * 28);
    }

    /* renamed from: f */
    public final boolean mo61180f() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderCommentShowBlacklist", 0) == 1;
    }

    /* renamed from: g */
    public final int mo61181g() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_cdn_upload_control, 0);
    }

    /* renamed from: h */
    public final boolean mo61182h() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderEnableFriendCommentJumpToProfile", 0) == 1;
    }

    /* renamed from: i */
    public final int mo61183i() {
        return (f99252P == 5 || Log.getLogLevel() > 1) ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_preload_comment_remain_count, f99252P) : f99252P;
    }

    /* renamed from: j */
    public final int mo61184j() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderProfileBgImgCompressResolution");
        if (c == null || c.length() == 0) {
            return 1080;
        }
        Log.m105924i("FinderConfig", "FinderHeadCompressResolution=" + c);
        C87412m.m108593f(c, "info");
        return Util.safeParseInt((String) C112550d0.m153785U(C112550d0.m153799i0(c).toString(), new String[]{"*"}, false, 0, 6, (Object) null).get(1));
    }

    /* renamed from: k */
    public final int mo61185k() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderProfileBgImgCompressResolution");
        if (c == null || c.length() == 0) {
            return 1080;
        }
        C87412m.m108593f(c, "info");
        return Util.safeParseInt((String) C112550d0.m153785U(C112550d0.m153799i0(c).toString(), new String[]{"*"}, false, 0, 6, (Object) null).get(0));
    }

    /* renamed from: l */
    public final long mo61186l() {
        return (f99156E <= 0 || Log.getLogLevel() > 1) ? ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_dump_interval, 86400) * ((long) 1000) : f99156E;
    }

    /* renamed from: m */
    public final C35464c<Integer> mo61187m() {
        return f99181G7;
    }

    /* renamed from: n */
    public final boolean mo61188n() {
        return f99320W5.mo60266n().intValue() == 1 && !C85875k4.m106210y();
    }

    /* renamed from: o */
    public final String mo61189o() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderPostOriginRuleUrl");
        if (c == null) {
            c = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/GzdzwPjCFZDCZkmI";
        }
        Log.m105924i("FinderConfig", "FINDER_POST_ORIGIN_RULE_URL info = " + c);
        return c;
    }

    /* renamed from: p */
    public final long mo61190p() {
        return (long) (((float) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_avatar, 100) * ((long) f99383e))) * mo61197w());
    }

    /* renamed from: q */
    public final long mo61191q() {
        return (long) (((float) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_capture, 500) * ((long) f99383e))) * mo61197w());
    }

    /* renamed from: r */
    public final long mo61192r() {
        return (long) (((float) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_cropimg, 500) * ((long) f99383e))) * mo61197w());
    }

    /* renamed from: s */
    public final long mo61193s() {
        return (long) (((float) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_image, 1024) * ((long) f99383e))) * mo61197w());
    }

    /* renamed from: t */
    public final long mo61194t() {
        return (long) (((float) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_posttmp, 100) * ((long) f99383e))) * mo61197w());
    }

    /* renamed from: u */
    public final long mo61195u() {
        return (long) (((float) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_tmp, 500) * ((long) f99383e))) * mo61197w());
    }

    /* renamed from: v */
    public final long mo61196v() {
        return (long) (((float) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_ultron_finder_folder_size_video, 1024) * ((long) f99383e))) * mo61197w());
    }

    /* renamed from: w */
    public final float mo61197w() {
        StringBuilder sb = new StringBuilder();
        sb.append("FOLDER_SIZE_LEVEL, PhoneRemainSpace, ");
        long j = f99165F;
        sb.append(j);
        Log.m105924i("FinderConfig", sb.toString());
        if (j < 10) {
            return 0.5f;
        }
        return j < 20 ? 1.0f : 2.0f;
    }

    /* renamed from: x */
    public final int mo61198x() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderFeedCompressResolution");
        if (c == null || c.length() == 0) {
            return 1280;
        }
        C87412m.m108593f(c, "info");
        return Util.safeParseInt((String) C112550d0.m153785U(C112550d0.m153799i0(c).toString(), new String[]{"*"}, false, 0, 6, (Object) null).get(1));
    }

    /* renamed from: y */
    public final int mo61199y() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderFeedCompressResolution");
        if (c == null || c.length() == 0) {
            return 1080;
        }
        Log.m105918d("FinderConfig", "FinderFeedCompressResolution=" + c);
        C87412m.m108593f(c, "info");
        return Util.safeParseInt((String) C112550d0.m153785U(C112550d0.m153799i0(c).toString(), new String[]{"*"}, false, 0, 6, (Object) null).get(0));
    }

    /* renamed from: z */
    public final boolean mo61200z() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_is_user_vlog_mode, 1) == 1 || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG;
    }
}
