package g91;

import com.tencent.p014mm.plugin.appbrand.jsapi.C83135z1;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1828u;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import com.tencent.xweb.util.WXWebReporter;
import f91.C116850b;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import ko0.C88245b;
import ko0.C88246c;
import ro0.C90067a;
import ro0.C90068b;
import te3.C101777fg2;
import te3.C118419a63;
import te3.C118445n03;
import te3.C118454oq1;
import te3.C118457pq1;
import te3.C118482z53;
import te3.C22490bg2;
import te3.C22527qp1;
import te3.C51189s12;
import te3.C64285cg2;
import te3.fh4;
import te3.ta4;
import te3.xr4;

/* renamed from: g91.b */
public final class C20812b {

    /* renamed from: a */
    public final ReentrantLock f58813a;

    /* renamed from: b */
    public final Condition f58814b;

    /* renamed from: c */
    public final Condition f58815c;

    public C20812b() {
        C64285cg2 a = m22806a();
        if (a == null) {
            C64285cg2 cg22 = new C64285cg2();
            cg22.f182475e = 10;
            m22807b(cg22);
        } else if (a.f182475e <= 0) {
            a.f182475e = 10;
            m22807b(a);
        }
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.f58813a = reentrantLock;
        this.f58814b = reentrantLock.newCondition();
        this.f58815c = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public static C64285cg2 m22806a() {
        byte[] a = C116850b.m164831a("key_hellhound_msgQ");
        if (a != null && a.length > 0) {
            C64285cg2 cg22 = new C64285cg2();
            try {
                cg22.parseFrom(a);
                return cg22;
            } catch (IOException e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellMsgQDao", e, "HellMsgQDao, _read, crash: %s", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m22807b(C64285cg2 cg22) {
        if (cg22 != null) {
            try {
                C116850b.m164834d("key_hellhound_msgQ", cg22.toByteArray());
            } catch (IOException e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellMsgQDao", e, "HellMsgQDao, _write, crash: %s", e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public final void mo32505c(C20811a aVar) {
        C22490bg2 bg22;
        C64285cg2 a = m22806a();
        if (a == null) {
            a = new C64285cg2();
        }
        LinkedList<C22490bg2> linkedList = a.f182474d;
        if (aVar == null) {
            bg22 = null;
        } else {
            C22490bg2 bg23 = new C22490bg2();
            int i = aVar.f58811a;
            if (!(i == 300 || i == 301)) {
                if (i == 600) {
                    bg23.f63710d = i;
                } else if (i == 800) {
                    bg23.f63724u = (xr4) aVar.f58812b;
                    bg23.f63710d = 800;
                } else if (i != 801) {
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            break;
                        case 5:
                            C118457pq1 pq12 = (C118457pq1) aVar.f58812b;
                            fh4 fh4 = new fh4();
                            bg23.f63712f = fh4;
                            fh4 fh42 = pq12.f354239d;
                            if (fh42 != null) {
                                fh4.f354001d = fh42.f354001d;
                                fh4.f354002e = fh42.f354002e;
                                fh4.f354003f = fh42.f354003f;
                            }
                            bg23.f63716j = pq12.f354240e;
                            bg23.f63713g = pq12.f354241f;
                            bg23.f63714h = pq12.f354242g;
                            bg23.f63725v = pq12.f354245j;
                            bg23.f63721r = pq12.f354243h;
                            bg23.f63723t = pq12.f354244i;
                            bg23.f63710d = 5;
                            break;
                        case 6:
                            C118454oq1 oq12 = (C118454oq1) aVar.f58812b;
                            fh4 fh43 = new fh4();
                            bg23.f63712f = fh43;
                            fh4 fh44 = oq12.f354210d;
                            if (fh44 != null) {
                                fh43.f354001d = fh44.f354001d;
                                fh43.f354002e = fh44.f354002e;
                                fh43.f354003f = fh44.f354003f;
                            }
                            bg23.f63714h = oq12.f354211e;
                            bg23.f63725v = oq12.f354213g;
                            bg23.f63723t = oq12.f354212f;
                            bg23.f63710d = 6;
                            break;
                        default:
                            switch (i) {
                                case 100:
                                    ta4 ta4 = (ta4) aVar.f58812b;
                                    fh4 fh45 = new fh4();
                                    bg23.f63711e = fh45;
                                    fh4 fh46 = ta4.f64613d;
                                    if (fh46 != null) {
                                        fh45.f354001d = fh46.f354001d;
                                        fh45.f354002e = fh46.f354002e;
                                        fh45.f354003f = fh46.f354003f;
                                    }
                                    fh4 fh47 = new fh4();
                                    bg23.f63712f = fh47;
                                    fh4 fh48 = ta4.f64614e;
                                    if (fh48 != null) {
                                        fh47.f354001d = fh48.f354001d;
                                        fh47.f354002e = fh48.f354002e;
                                        fh47.f354003f = fh48.f354003f;
                                    }
                                    bg23.f63713g = ta4.f64615f;
                                    bg23.f63714h = ta4.f64616g;
                                    bg23.f63715i = ta4.f64617h;
                                    bg23.f63716j = ta4.f64618i;
                                    bg23.f63717n = ta4.f64619j;
                                    bg23.f63718o = ta4.f64620n;
                                    bg23.f63723t = ta4.f64621o;
                                    bg23.f63710d = 100;
                                    break;
                                case 101:
                                    fh4 fh49 = (fh4) aVar.f58812b;
                                    fh4 fh410 = new fh4();
                                    bg23.f63712f = fh410;
                                    fh410.f354001d = fh49.f354001d;
                                    fh410.f354002e = fh49.f354002e;
                                    fh410.f354003f = fh49.f354003f;
                                    bg23.f63710d = 101;
                                    break;
                                case 102:
                                    C118445n03 n032 = (C118445n03) aVar.f58812b;
                                    fh4 fh411 = new fh4();
                                    bg23.f63712f = fh411;
                                    fh4 fh412 = n032.f354143d;
                                    fh411.f354001d = fh412.f354001d;
                                    fh411.f354002e = fh412.f354002e;
                                    fh411.f354003f = fh412.f354003f;
                                    bg23.f63720q = n032.f354144e;
                                    bg23.f63710d = 102;
                                    break;
                                default:
                                    switch (i) {
                                        case 200:
                                            C118482z53 z532 = (C118482z53) aVar.f58812b;
                                            fh4 fh413 = new fh4();
                                            bg23.f63712f = fh413;
                                            fh4 fh414 = z532.f354614d;
                                            fh413.f354001d = fh414.f354001d;
                                            fh413.f354002e = fh414.f354002e;
                                            fh413.f354003f = fh414.f354003f;
                                            bg23.f63715i = z532.f354615e;
                                            bg23.f63710d = 200;
                                            break;
                                        case 201:
                                            C118482z53 z533 = (C118482z53) aVar.f58812b;
                                            fh4 fh415 = new fh4();
                                            bg23.f63712f = fh415;
                                            fh4 fh416 = z533.f354614d;
                                            fh415.f354001d = fh416.f354001d;
                                            fh415.f354002e = fh416.f354002e;
                                            fh415.f354003f = fh416.f354003f;
                                            bg23.f63715i = z533.f354615e;
                                            bg23.f63710d = 201;
                                            break;
                                        case 202:
                                            fh4 fh417 = (fh4) aVar.f58812b;
                                            fh4 fh418 = new fh4();
                                            bg23.f63712f = fh418;
                                            fh418.f354001d = fh417.f354001d;
                                            fh418.f354002e = fh417.f354002e;
                                            fh418.f354003f = fh417.f354003f;
                                            bg23.f63710d = 202;
                                            break;
                                        case 203:
                                            C118419a63 a632 = (C118419a63) aVar.f58812b;
                                            fh4 fh419 = new fh4();
                                            bg23.f63712f = fh419;
                                            fh4 fh420 = a632.f353901d;
                                            fh419.f354001d = fh420.f354001d;
                                            fh419.f354002e = fh420.f354002e;
                                            fh419.f354003f = fh420.f354003f;
                                            bg23.f63713g = a632.f353902e;
                                            bg23.f63719p = a632.f353903f;
                                            bg23.f63714h = a632.f353904g;
                                            bg23.f63710d = 203;
                                            break;
                                        case 204:
                                            fh4 fh421 = (fh4) aVar.f58812b;
                                            fh4 fh422 = new fh4();
                                            bg23.f63712f = fh422;
                                            fh422.f354001d = fh421.f354001d;
                                            fh422.f354002e = fh421.f354002e;
                                            fh422.f354003f = fh421.f354003f;
                                            bg23.f63710d = 204;
                                            break;
                                        case 205:
                                            C118419a63 a633 = (C118419a63) aVar.f58812b;
                                            fh4 fh423 = new fh4();
                                            bg23.f63712f = fh423;
                                            fh4 fh424 = a633.f353901d;
                                            fh423.f354001d = fh424.f354001d;
                                            fh423.f354002e = fh424.f354002e;
                                            fh423.f354003f = fh424.f354003f;
                                            bg23.f63713g = a633.f353902e;
                                            bg23.f63719p = a633.f353903f;
                                            bg23.f63714h = a633.f353904g;
                                            bg23.f63710d = 205;
                                            break;
                                        case 206:
                                            fh4 fh425 = (fh4) aVar.f58812b;
                                            fh4 fh426 = new fh4();
                                            bg23.f63712f = fh426;
                                            fh426.f354001d = fh425.f354001d;
                                            fh426.f354002e = fh425.f354002e;
                                            fh426.f354003f = fh425.f354003f;
                                            bg23.f63710d = 206;
                                            break;
                                        case 207:
                                            fh4 fh427 = (fh4) aVar.f58812b;
                                            fh4 fh428 = new fh4();
                                            bg23.f63712f = fh428;
                                            fh428.f354001d = fh427.f354001d;
                                            fh428.f354002e = fh427.f354002e;
                                            fh428.f354003f = fh427.f354003f;
                                            bg23.f63710d = 207;
                                            break;
                                        case 208:
                                            bg23.f63723t = ((Long) aVar.f58812b).longValue();
                                            bg23.f63710d = 208;
                                            break;
                                        case 209:
                                            bg23.f63710d = 209;
                                            break;
                                        case 210:
                                            bg23.f63715i = ((C22527qp1) aVar.f58812b).f64509d;
                                            bg23.f63710d = 210;
                                            break;
                                        case 211:
                                            bg23.f63723t = ((Long) aVar.f58812b).longValue();
                                            bg23.f63710d = 211;
                                            break;
                                        case 212:
                                            bg23.f63723t = ((Long) aVar.f58812b).longValue();
                                            bg23.f63710d = 212;
                                            break;
                                        case 213:
                                            bg23.f63710d = 213;
                                            break;
                                        case JsApiCheckIsSupportFaceDetect.CTRL_INDEX:
                                            bg23.f63710d = JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
                                            break;
                                        case 215:
                                            bg23.f63710d = 215;
                                            break;
                                        case 216:
                                            bg23.f63710d = 216;
                                            break;
                                        case 217:
                                            bg23.f63723t = ((Long) aVar.f58812b).longValue();
                                            bg23.f63710d = 217;
                                            break;
                                        case 218:
                                            bg23.f63723t = ((Long) aVar.f58812b).longValue();
                                            bg23.f63710d = 218;
                                            break;
                                        case 219:
                                            bg23.f63723t = ((Long) aVar.f58812b).longValue();
                                            bg23.f63710d = 219;
                                            break;
                                        case 220:
                                            bg23.f63723t = ((Long) aVar.f58812b).longValue();
                                            bg23.f63710d = 220;
                                            break;
                                        case 221:
                                            bg23.f63710d = 221;
                                            break;
                                        case WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS:
                                            bg23.f63716j = (String) aVar.f58812b;
                                            bg23.f63710d = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
                                            break;
                                        default:
                                            switch (i) {
                                                case 400:
                                                case 401:
                                                case 402:
                                                case 403:
                                                    bg23.f63715i = ((Integer) aVar.f58812b).intValue();
                                                    bg23.f63710d = aVar.f58811a;
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 500:
                                                            bg23.f63722s = (C101777fg2) aVar.f58812b;
                                                            bg23.f63710d = 500;
                                                            break;
                                                        case 501:
                                                            bg23.f63717n = (String) aVar.f58812b;
                                                            bg23.f63710d = 501;
                                                            break;
                                                        case 502:
                                                            bg23.f63722s = (C101777fg2) aVar.f58812b;
                                                            bg23.f63710d = 502;
                                                            break;
                                                        case 503:
                                                            bg23.f63717n = (String) aVar.f58812b;
                                                            bg23.f63710d = 503;
                                                            break;
                                                        case 504:
                                                            bg23.f63717n = (String) aVar.f58812b;
                                                            bg23.f63710d = 504;
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 700:
                                                                    bg23.f63710d = 700;
                                                                    break;
                                                                case 701:
                                                                    bg23.f63710d = 701;
                                                                    break;
                                                                case 702:
                                                                    bg23.f63710d = 702;
                                                                    break;
                                                                case 703:
                                                                    bg23.f63710d = 703;
                                                                    break;
                                                                case 704:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 704;
                                                                    break;
                                                                case 705:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 705;
                                                                    break;
                                                                case 706:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 706;
                                                                    break;
                                                                case 707:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 707;
                                                                    break;
                                                                case 708:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 708;
                                                                    break;
                                                                case 709:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 709;
                                                                    break;
                                                                case 710:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 710;
                                                                    break;
                                                                case 711:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 711;
                                                                    break;
                                                                case 712:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 712;
                                                                    break;
                                                                case 713:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 713;
                                                                    break;
                                                                case C1828u.CTRL_INDEX:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = C1828u.CTRL_INDEX;
                                                                    break;
                                                                case 715:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 715;
                                                                    break;
                                                                case 716:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 716;
                                                                    break;
                                                                case 717:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 717;
                                                                    break;
                                                                case 718:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 718;
                                                                    break;
                                                                case 719:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 719;
                                                                    break;
                                                                case TAVExporter.VIDEO_EXPORT_WIDTH /*720*/:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = TAVExporter.VIDEO_EXPORT_WIDTH;
                                                                    break;
                                                                case 721:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 721;
                                                                    break;
                                                                case 722:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 722;
                                                                    break;
                                                                case 723:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 723;
                                                                    break;
                                                                case 724:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 724;
                                                                    break;
                                                                case 725:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 725;
                                                                    break;
                                                                case 726:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 726;
                                                                    break;
                                                                case 727:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 727;
                                                                    break;
                                                                case 728:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 728;
                                                                    break;
                                                                case 729:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 729;
                                                                    break;
                                                                case TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH;
                                                                    break;
                                                                case 731:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 731;
                                                                    break;
                                                                case TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
                                                                    break;
                                                                case 733:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 733;
                                                                    break;
                                                                case C90067a.CTRL_INDEX /*734*/:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = C90067a.CTRL_INDEX;
                                                                    break;
                                                                case C90068b.CTRL_INDEX /*735*/:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = C90068b.CTRL_INDEX;
                                                                    break;
                                                                case C88245b.CTRL_INDEX /*736*/:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = C88245b.CTRL_INDEX;
                                                                    break;
                                                                case C88246c.CTRL_INDEX /*737*/:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = C88246c.CTRL_INDEX;
                                                                    break;
                                                                case 738:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 738;
                                                                    break;
                                                                case 739:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 739;
                                                                    break;
                                                                case 740:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 740;
                                                                    break;
                                                                case 741:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 741;
                                                                    break;
                                                                case 742:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 742;
                                                                    break;
                                                                case 743:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 743;
                                                                    break;
                                                                case 744:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 744;
                                                                    break;
                                                                case 745:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 745;
                                                                    break;
                                                                case 746:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = 746;
                                                                    break;
                                                                case C83135z1.CTRL_INDEX /*747*/:
                                                                    bg23.f63717n = (String) aVar.f58812b;
                                                                    bg23.f63710d = C83135z1.CTRL_INDEX;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    bg23.f63726w = (C51189s12) aVar.f58812b;
                    bg23.f63710d = C1862l.CTRL_INDEX;
                }
                bg22 = bg23;
            }
            bg23.f63723t = ((Long) aVar.f58812b).longValue();
            bg23.f63710d = aVar.f58811a;
            bg22 = bg23;
        }
        linkedList.offerLast(bg22);
        m22807b(a);
        this.f58814b.signal();
    }

    /* renamed from: d */
    public C20811a mo32506d() {
        ReentrantLock reentrantLock = this.f58813a;
        reentrantLock.lockInterruptibly();
        while (true) {
            try {
                C64285cg2 a = m22806a();
                if ((a == null ? 0 : a.f182474d.size()) != 0) {
                    break;
                }
                this.f58814b.await();
            } finally {
                reentrantLock.unlock();
            }
        }
        C64285cg2 a2 = m22806a();
        if (a2 == null) {
            a2 = new C64285cg2();
            m22807b(a2);
        }
        m22807b(a2);
        this.f58815c.signal();
        return C20814d.m22813a(a2.f182474d.pollFirst());
    }
}
