package g91;

import com.tencent.p014mm.plugin.appbrand.jsapi.C83135z1;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1828u;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.tmassistantsdk.common.TMAssistantDownloadSDKErrorCode;
import com.tencent.xweb.util.WXWebReporter;
import ko0.C88245b;
import ko0.C88246c;
import ro0.C90067a;
import ro0.C90068b;
import te3.C118419a63;
import te3.C118445n03;
import te3.C118454oq1;
import te3.C118457pq1;
import te3.C118482z53;
import te3.C22490bg2;
import te3.fh4;
import te3.ta4;

/* renamed from: g91.d */
public class C20814d {
    /* renamed from: a */
    public static C20811a m22813a(C22490bg2 bg22) {
        if (bg22 == null) {
            return null;
        }
        C20811a aVar = new C20811a();
        int i = bg22.f63710d;
        if (!(i == 300 || i == 301)) {
            if (i == 600) {
                aVar.f58811a = i;
            } else if (i == 800) {
                aVar.f58812b = bg22.f63724u;
                aVar.f58811a = 800;
            } else if (i != 801) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        break;
                    case 5:
                        C118457pq1 pq12 = new C118457pq1();
                        fh4 fh4 = new fh4();
                        pq12.f354239d = fh4;
                        fh4 fh42 = bg22.f63712f;
                        if (fh42 != null) {
                            fh4.f354001d = fh42.f354001d;
                            fh4.f354002e = fh42.f354002e;
                            fh4.f354003f = fh42.f354003f;
                        }
                        pq12.f354240e = bg22.f63716j;
                        pq12.f354241f = bg22.f63713g;
                        pq12.f354242g = bg22.f63714h;
                        pq12.f354245j = bg22.f63725v;
                        pq12.f354243h = bg22.f63721r;
                        pq12.f354244i = bg22.f63723t;
                        aVar.f58811a = 5;
                        aVar.f58812b = pq12;
                        break;
                    case 6:
                        C118454oq1 oq12 = new C118454oq1();
                        fh4 fh43 = new fh4();
                        oq12.f354210d = fh43;
                        fh4 fh44 = bg22.f63712f;
                        if (fh44 != null) {
                            fh43.f354001d = fh44.f354001d;
                            fh43.f354002e = fh44.f354002e;
                            fh43.f354003f = fh44.f354003f;
                        }
                        oq12.f354211e = bg22.f63714h;
                        oq12.f354213g = bg22.f63725v;
                        oq12.f354212f = bg22.f63723t;
                        aVar.f58811a = 6;
                        aVar.f58812b = oq12;
                        break;
                    default:
                        switch (i) {
                            case 100:
                                ta4 ta4 = new ta4();
                                fh4 fh45 = new fh4();
                                ta4.f64613d = fh45;
                                fh4 fh46 = bg22.f63711e;
                                if (fh46 != null) {
                                    fh45.f354001d = fh46.f354001d;
                                    fh45.f354002e = fh46.f354002e;
                                    fh45.f354003f = fh46.f354003f;
                                }
                                fh4 fh47 = new fh4();
                                ta4.f64614e = fh47;
                                fh4 fh48 = bg22.f63712f;
                                if (fh48 != null) {
                                    fh47.f354001d = fh48.f354001d;
                                    fh47.f354002e = fh48.f354002e;
                                    fh47.f354003f = fh48.f354003f;
                                }
                                ta4.f64615f = bg22.f63713g;
                                ta4.f64616g = bg22.f63714h;
                                ta4.f64617h = bg22.f63715i;
                                ta4.f64618i = bg22.f63716j;
                                ta4.f64619j = bg22.f63717n;
                                ta4.f64620n = bg22.f63718o;
                                ta4.f64621o = bg22.f63723t;
                                aVar.f58811a = 100;
                                aVar.f58812b = ta4;
                                break;
                            case 101:
                                fh4 fh49 = new fh4();
                                fh4 fh410 = bg22.f63712f;
                                if (fh410 != null) {
                                    fh49.f354001d = fh410.f354001d;
                                    fh49.f354002e = fh410.f354002e;
                                    fh49.f354003f = fh410.f354003f;
                                }
                                aVar.f58811a = 101;
                                aVar.f58812b = fh49;
                                break;
                            case 102:
                                C118445n03 n032 = new C118445n03();
                                fh4 fh411 = new fh4();
                                n032.f354143d = fh411;
                                fh4 fh412 = bg22.f63712f;
                                if (fh412 != null) {
                                    fh411.f354001d = fh412.f354001d;
                                    fh411.f354002e = fh412.f354002e;
                                    fh411.f354003f = fh412.f354003f;
                                }
                                n032.f354144e = bg22.f63720q;
                                aVar.f58811a = 102;
                                aVar.f58812b = n032;
                                break;
                            default:
                                switch (i) {
                                    case 200:
                                        C118482z53 z532 = new C118482z53();
                                        fh4 fh413 = new fh4();
                                        z532.f354614d = fh413;
                                        fh4 fh414 = bg22.f63712f;
                                        if (fh414 != null) {
                                            fh413.f354001d = fh414.f354001d;
                                            fh413.f354002e = fh414.f354002e;
                                            fh413.f354003f = fh414.f354003f;
                                        }
                                        z532.f354615e = bg22.f63715i;
                                        aVar.f58811a = 200;
                                        aVar.f58812b = z532;
                                        break;
                                    case 201:
                                        C118482z53 z533 = new C118482z53();
                                        fh4 fh415 = new fh4();
                                        z533.f354614d = fh415;
                                        fh4 fh416 = bg22.f63712f;
                                        if (fh416 != null) {
                                            fh415.f354001d = fh416.f354001d;
                                            fh415.f354002e = fh416.f354002e;
                                            fh415.f354003f = fh416.f354003f;
                                        }
                                        z533.f354615e = bg22.f63715i;
                                        aVar.f58811a = 201;
                                        aVar.f58812b = z533;
                                        break;
                                    case 202:
                                        fh4 fh417 = new fh4();
                                        fh4 fh418 = bg22.f63712f;
                                        if (fh418 != null) {
                                            fh417.f354001d = fh418.f354001d;
                                            fh417.f354002e = fh418.f354002e;
                                            fh417.f354003f = fh418.f354003f;
                                        }
                                        aVar.f58811a = 202;
                                        aVar.f58812b = fh417;
                                        break;
                                    case 203:
                                        C118419a63 a632 = new C118419a63();
                                        fh4 fh419 = new fh4();
                                        a632.f353901d = fh419;
                                        fh4 fh420 = bg22.f63712f;
                                        if (fh420 != null) {
                                            fh419.f354001d = fh420.f354001d;
                                            fh419.f354002e = fh420.f354002e;
                                            fh419.f354003f = fh420.f354003f;
                                        }
                                        a632.f353902e = bg22.f63713g;
                                        a632.f353903f = bg22.f63719p;
                                        a632.f353904g = bg22.f63714h;
                                        aVar.f58811a = 203;
                                        aVar.f58812b = a632;
                                        break;
                                    case 204:
                                        fh4 fh421 = new fh4();
                                        fh4 fh422 = bg22.f63712f;
                                        if (fh422 != null) {
                                            fh421.f354001d = fh422.f354001d;
                                            fh421.f354002e = fh422.f354002e;
                                            fh421.f354003f = fh422.f354003f;
                                        }
                                        aVar.f58811a = 204;
                                        aVar.f58812b = fh421;
                                        break;
                                    case 205:
                                        C118419a63 a633 = new C118419a63();
                                        fh4 fh423 = new fh4();
                                        a633.f353901d = fh423;
                                        fh4 fh424 = bg22.f63712f;
                                        if (fh424 != null) {
                                            fh423.f354001d = fh424.f354001d;
                                            fh423.f354002e = fh424.f354002e;
                                            fh423.f354003f = fh424.f354003f;
                                        }
                                        a633.f353902e = bg22.f63713g;
                                        a633.f353903f = bg22.f63719p;
                                        a633.f353904g = bg22.f63714h;
                                        aVar.f58811a = 205;
                                        aVar.f58812b = a633;
                                        break;
                                    case 206:
                                        fh4 fh425 = new fh4();
                                        fh4 fh426 = bg22.f63712f;
                                        if (fh426 != null) {
                                            fh425.f354001d = fh426.f354001d;
                                            fh425.f354002e = fh426.f354002e;
                                            fh425.f354003f = fh426.f354003f;
                                        }
                                        aVar.f58811a = 206;
                                        aVar.f58812b = fh425;
                                        break;
                                    case 207:
                                        fh4 fh427 = new fh4();
                                        fh4 fh428 = bg22.f63712f;
                                        if (fh428 != null) {
                                            fh427.f354001d = fh428.f354001d;
                                            fh427.f354002e = fh428.f354002e;
                                            fh427.f354003f = fh428.f354003f;
                                        }
                                        aVar.f58811a = 207;
                                        aVar.f58812b = fh427;
                                        break;
                                    case 208:
                                        aVar.f58812b = Long.valueOf(bg22.f63723t);
                                        aVar.f58811a = 208;
                                        break;
                                    case 209:
                                        aVar.f58811a = 209;
                                        break;
                                    case 210:
                                        aVar.f58812b = Integer.valueOf(bg22.f63715i);
                                        aVar.f58811a = 210;
                                        break;
                                    case 211:
                                        aVar.f58812b = Long.valueOf(bg22.f63723t);
                                        aVar.f58811a = 211;
                                        break;
                                    case 212:
                                        aVar.f58812b = Long.valueOf(bg22.f63723t);
                                        aVar.f58811a = 212;
                                        break;
                                    case 213:
                                        aVar.f58811a = 213;
                                        break;
                                    case JsApiCheckIsSupportFaceDetect.CTRL_INDEX:
                                        aVar.f58811a = JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
                                        break;
                                    case 215:
                                        aVar.f58811a = 215;
                                        break;
                                    case 216:
                                        aVar.f58811a = 216;
                                        break;
                                    case 217:
                                        aVar.f58812b = Long.valueOf(bg22.f63723t);
                                        aVar.f58811a = 217;
                                        break;
                                    case 218:
                                        aVar.f58812b = Long.valueOf(bg22.f63723t);
                                        aVar.f58811a = 218;
                                        break;
                                    case 219:
                                        aVar.f58812b = Long.valueOf(bg22.f63723t);
                                        aVar.f58811a = 219;
                                        break;
                                    case 220:
                                        aVar.f58812b = Long.valueOf(bg22.f63723t);
                                        aVar.f58811a = 220;
                                        break;
                                    case 221:
                                        aVar.f58811a = 221;
                                        break;
                                    case WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS:
                                        aVar.f58811a = WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS;
                                        aVar.f58812b = bg22.f63716j;
                                        break;
                                    default:
                                        switch (i) {
                                            case 400:
                                            case 401:
                                            case 402:
                                            case 403:
                                                aVar.f58812b = Integer.valueOf(bg22.f63715i);
                                                aVar.f58811a = bg22.f63710d;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 500:
                                                        aVar.f58812b = bg22.f63722s;
                                                        aVar.f58811a = 500;
                                                        break;
                                                    case 501:
                                                        aVar.f58812b = bg22.f63717n;
                                                        aVar.f58811a = 501;
                                                        break;
                                                    case 502:
                                                        aVar.f58812b = bg22.f63722s;
                                                        aVar.f58811a = 502;
                                                        break;
                                                    case 503:
                                                        aVar.f58812b = bg22.f63717n;
                                                        aVar.f58811a = 503;
                                                        break;
                                                    case 504:
                                                        aVar.f58812b = bg22.f63717n;
                                                        aVar.f58811a = 504;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 700:
                                                                aVar.f58811a = 700;
                                                                break;
                                                            case 701:
                                                                aVar.f58811a = 701;
                                                                break;
                                                            case 702:
                                                                aVar.f58811a = 702;
                                                                break;
                                                            case 703:
                                                                aVar.f58811a = 703;
                                                                break;
                                                            case 704:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 704;
                                                                break;
                                                            case 705:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 705;
                                                                break;
                                                            case 706:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 706;
                                                                break;
                                                            case 707:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 707;
                                                                break;
                                                            case 708:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 708;
                                                                break;
                                                            case 709:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 709;
                                                                break;
                                                            case 710:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 710;
                                                                break;
                                                            case 711:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 711;
                                                                break;
                                                            case 712:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 712;
                                                                break;
                                                            case 713:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 713;
                                                                break;
                                                            case C1828u.CTRL_INDEX:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = C1828u.CTRL_INDEX;
                                                                break;
                                                            case 715:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 715;
                                                                break;
                                                            case 716:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 716;
                                                                break;
                                                            case 717:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 717;
                                                                break;
                                                            case 718:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 718;
                                                                break;
                                                            case 719:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 719;
                                                                break;
                                                            case TAVExporter.VIDEO_EXPORT_WIDTH /*720*/:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = TAVExporter.VIDEO_EXPORT_WIDTH;
                                                                break;
                                                            case 721:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 721;
                                                                break;
                                                            case 722:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 722;
                                                                break;
                                                            case 723:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 723;
                                                                break;
                                                            case 724:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 724;
                                                                break;
                                                            case 725:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 725;
                                                                break;
                                                            case 726:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 726;
                                                                break;
                                                            case 727:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 727;
                                                                break;
                                                            case 728:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 728;
                                                                break;
                                                            case 729:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 729;
                                                                break;
                                                            case TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_SPACE_NOT_ENOUGH;
                                                                break;
                                                            case 731:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 731;
                                                                break;
                                                            case TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = TMAssistantDownloadSDKErrorCode.DownloadSDKErrorCode_CLIENT_PROTOCOL_EXCEPTION;
                                                                break;
                                                            case 733:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 733;
                                                                break;
                                                            case C90067a.CTRL_INDEX /*734*/:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = C90067a.CTRL_INDEX;
                                                                break;
                                                            case C90068b.CTRL_INDEX /*735*/:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = C90068b.CTRL_INDEX;
                                                                break;
                                                            case C88245b.CTRL_INDEX /*736*/:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = C88245b.CTRL_INDEX;
                                                                break;
                                                            case C88246c.CTRL_INDEX /*737*/:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = C88246c.CTRL_INDEX;
                                                                break;
                                                            case 738:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 738;
                                                                break;
                                                            case 739:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 739;
                                                                break;
                                                            case 740:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 740;
                                                                break;
                                                            case 741:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 741;
                                                                break;
                                                            case 742:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 742;
                                                                break;
                                                            case 743:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 743;
                                                                break;
                                                            case 744:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 744;
                                                                break;
                                                            case 745:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 745;
                                                                break;
                                                            case 746:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = 746;
                                                                break;
                                                            case C83135z1.CTRL_INDEX /*747*/:
                                                                aVar.f58812b = bg22.f63717n;
                                                                aVar.f58811a = C83135z1.CTRL_INDEX;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                aVar.f58812b = bg22.f63726w;
                aVar.f58811a = C1862l.CTRL_INDEX;
            }
            return aVar;
        }
        aVar.f58812b = Long.valueOf(bg22.f63723t);
        aVar.f58811a = bg22.f63710d;
        return aVar;
    }
}
