package com.tencent.p014mm.wallet_core.p137ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.autogen.mmdata.rpt.WalletAutoReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import h81.C32735h;
import java.util.Stack;
import java.util.UUID;

/* renamed from: com.tencent.mm.wallet_core.ui.r */
public class C75226r {

    /* renamed from: a */
    public static WalletAutoReportStruct f221341a = null;

    /* renamed from: b */
    public static String f221342b = "";

    /* renamed from: c */
    public static int f221343c = 0;

    /* renamed from: d */
    public static String f221344d = "";

    /* renamed from: e */
    public static Stack<String> f221345e;

    /* renamed from: a */
    public static String m90201a() {
        if (Util.isNullOrNil(f221342b)) {
            f221342b = UUID.randomUUID().toString();
        }
        return f221342b;
    }

    /* renamed from: b */
    public static CharSequence m90202b(View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                String charSequence = m90202b((ViewGroup) childAt).toString();
                if (!Util.isNullOrNil(charSequence)) {
                    return charSequence;
                }
            } else if (childAt instanceof TextView) {
                String charSequence2 = ((TextView) childAt).getText().toString();
                if (!Util.isNullOrNil(charSequence2)) {
                    return charSequence2;
                }
            } else if (childAt instanceof Button) {
                String charSequence3 = ((Button) childAt).getText().toString();
                if (!Util.isNullOrNil(charSequence3)) {
                    return charSequence3;
                }
            } else {
                continue;
            }
        }
        return "";
    }

    /* renamed from: c */
    public static void m90203c(View view) {
        if (view != null) {
            String charSequence = view instanceof Button ? ((Button) view).getText().toString() : view instanceof TextView ? ((TextView) view).getText().toString() : view instanceof ImageView ? "ImageView" : view instanceof ViewGroup ? ((String) m90202b(view)).toString() : "";
            if (!Util.isNullOrNil(charSequence)) {
                m90204d(3, 1, charSequence, "");
            }
        }
    }

    /* renamed from: d */
    public static void m90204d(int i, int i2, String str, String str2) {
        String str3;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_auto_report_config, false);
        Log.m105925i("MicroMsg.WalletAutoReportUtil", " isOpenAutoReport ：%s", Boolean.valueOf(wf));
        if (wf) {
            if (!str.equals("MallIndexUIv2") && !str.equals("cgi_1679") && !str.equals("cgi_4362") && !str.equals("cgi_1501") && !str.equals("WalletOfflineEntranceUI") && !str.equals("WalletOfflineCoinPurseUI") && !str.equals("cgi_1742") && !str.equals("cgi_1645") && !str.equals("cgi_568") && !str.equals("cgi_571") && !str.equals("cgi_385") && !str.equals("cgi_1725")) {
                if (!Util.isNullOrNil(str)) {
                    if (str.contains(",")) {
                        str = str.replaceAll(",", "+").trim();
                    }
                    if (str.contains("，")) {
                        str = str.replaceAll("，", "+").trim();
                    }
                }
                if (f221341a == null) {
                    f221341a = new WalletAutoReportStruct();
                }
                WalletAutoReportStruct walletAutoReportStruct = f221341a;
                walletAutoReportStruct.f194698d = (long) i;
                walletAutoReportStruct.f194699e = walletAutoReportStruct.mo86045b("SessionId", m90201a(), true);
                String str4 = f221344d;
                f221344d = str;
                walletAutoReportStruct.f194701g = walletAutoReportStruct.mo86045b("URL", str4 + "/" + str, true);
                walletAutoReportStruct.f194702h = walletAutoReportStruct.mo86045b("ReportTimeStamp", String.valueOf(System.currentTimeMillis()), true);
                walletAutoReportStruct.f194703i = (long) i2;
                walletAutoReportStruct.f194704j = walletAutoReportStruct.mo86045b("ExtInfo", str2, true);
                int i3 = f221343c + 1;
                f221343c = i3;
                walletAutoReportStruct.f194700f = (long) i3;
                walletAutoReportStruct.mo86054n();
                StringBuilder sb = new StringBuilder();
                sb.append("KindaNativeLog.type: ");
                String str5 = "UseCase";
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        str3 = "UIPage";
                        break;
                    case 3:
                        str3 = "View";
                        break;
                    case 4:
                        str3 = "Dialog";
                        break;
                    case 5:
                        str3 = "Cgi";
                        break;
                    case 6:
                        str3 = "SystemEvent";
                        break;
                    default:
                        Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow type：%s", Integer.valueOf(i));
                        break;
                }
                str3 = str5;
                sb.append(str3);
                sb.append("\n");
                sb.append("KindaNativeLog.sessionID: ");
                sb.append(f221342b);
                sb.append("\n");
                sb.append("KindaNativeLog.url: ");
                sb.append(str);
                sb.append("\n");
                sb.append("KindaNativeLog.action: ");
                switch (i) {
                    case 1:
                        if (i2 != 1) {
                            if (i2 == 2) {
                                str5 = "EndUseCase";
                                break;
                            } else {
                                if (i2 != 3) {
                                    Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", Integer.valueOf(i2));
                                }
                                str5 = "ClearedAllUseCase";
                                break;
                            }
                        } else {
                            str5 = "StartUseCase";
                            break;
                        }
                    case 2:
                        if (i2 == 1) {
                            str5 = "ShowUIPage";
                            break;
                        } else {
                            if (i2 != 2) {
                                Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", Integer.valueOf(i2));
                            }
                            str5 = "DimissUIPage";
                            break;
                        }
                    case 3:
                        if (i2 == 1) {
                            str5 = "ClicKView";
                            break;
                        } else {
                            if (i2 != 2) {
                                Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", Integer.valueOf(i2));
                            }
                            str5 = "ShowView";
                            break;
                        }
                    case 4:
                        if (i2 == 1) {
                            str5 = "ShowDialog";
                            break;
                        } else {
                            if (i2 != 2) {
                                Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", Integer.valueOf(i2));
                            }
                            str5 = "ClickDialogButton";
                            break;
                        }
                    case 5:
                        if (i2 == 1) {
                            str5 = "StartCgi";
                            break;
                        } else {
                            if (i2 != 2) {
                                Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", Integer.valueOf(i2));
                            }
                            str5 = "EndCgi";
                            break;
                        }
                    case 6:
                        str5 = "Terminate";
                        switch (i2) {
                            case 1:
                                str5 = "EnterBackground";
                                break;
                            case 2:
                                str5 = "EnterForeground";
                                break;
                            case 3:
                                str5 = "BecomeActive";
                                break;
                            case 4:
                                str5 = "ResignActive";
                                break;
                            case 5:
                                str5 = "MemoryWarning";
                                break;
                            case 6:
                                break;
                            case 7:
                                str5 = "NetworkChange";
                                break;
                            default:
                                Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", Integer.valueOf(i2));
                                break;
                        }
                    default:
                        Log.m105925i("MicroMsg.WalletAutoReportUtil", "unknow type：%s", Integer.valueOf(i));
                        break;
                }
                sb.append(str5);
                sb.append("\n");
                sb.append("KindaNativeLog.sequence: ");
                sb.append(f221343c);
                sb.append("\n");
                sb.append("KindaNativeLog.ext: ");
                sb.append(str2);
                sb.append("\n");
                Log.m105925i("MicroMsg.WalletAutoReportUtil", "KindaNativeLog reportString :%s", sb.toString());
            }
        }
    }

    /* renamed from: e */
    public static void m90205e(int i) {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_auto_report_cgi_config, false);
        Log.m105925i("MicroMsg.WalletAutoReportUtil", " isOpenCgiReport ：%s", Boolean.valueOf(wf));
        if (wf) {
            m90204d(5, 1, "cgi_" + i, "");
        }
    }
}
