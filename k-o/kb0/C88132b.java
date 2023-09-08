package kb0;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80995a;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import h81.C32735h;
import kr0.C76629w0;
import kr0.C88262c1;
import kr0.C88273g1;
import kr0.C88274h0;
import org.json.JSONException;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: kb0.b */
public final class C88132b {

    /* renamed from: kb0.b$a */
    public class C88133a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxaAttributes f254900d;

        /* renamed from: e */
        public final /* synthetic */ C68070l.C68072b f254901e;

        public C88133a(WxaAttributes wxaAttributes, C68070l.C68072b bVar) {
            this.f254900d = wxaAttributes;
            this.f254901e = bVar;
        }

        public void run() {
            C88273g1 g1Var = C88273g1.CHATTING_APPMSG;
            Class cls = C88274h0.class;
            if (AppForegroundDelegate.INSTANCE.f343454n) {
                WxaAttributes wxaAttributes = this.f254900d;
                if (wxaAttributes != null) {
                    try {
                        if (wxaAttributes.mo113940m2().mo113970a()) {
                            ((C88274h0) C86312j.m106911c(cls)).mo113303QK(g1Var);
                        } else if (this.f254900d.mo113940m2().mo113971b()) {
                            ((C88274h0) C86312j.m106911c(cls)).mo113305TH(g1Var);
                        } else {
                            ((C88274h0) C86312j.m106911c(cls)).mo113299AC(g1Var);
                        }
                    } catch (Exception unused) {
                    }
                } else if (C68070l.C68071a.m80416b(this.f254901e.f195597l2)) {
                    ((C88274h0) C86312j.m106911c(cls)).mo113305TH(g1Var);
                } else {
                    ((C88274h0) C86312j.m106911c(cls)).mo113299AC(g1Var);
                    ((C88274h0) C86312j.m106911c(cls)).mo113303QK(g1Var);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m109730a(StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent, C68070l.C68072b bVar) {
        String str;
        if (startAppBrandUIFromOuterEvent != null && bVar != null) {
            C80995a aVar = (C80995a) bVar.mo93555w(C80995a.class);
            if (aVar != null && !Util.isNullOrNil(aVar.f237910s)) {
                startAppBrandUIFromOuterEvent.f9522d.f9551z = aVar.f237910s;
            }
            if (aVar != null) {
                boolean z = aVar.f237912u;
                StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                try {
                    new JSONObject();
                    str = new JSONObject().put("isPrivateMessage", z).toString();
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.WeAppPrivateMessageNativeExtraData", e, "", new Object[0]);
                    str = "{}";
                }
                aVar2.f9524A = str;
            }
        }
    }

    /* renamed from: b */
    public static void m109731b(StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent, C68070l.C68072b bVar) {
        StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
        aVar.f9533h = bVar.f195577g2;
        aVar.f9526a = bVar.f195573f2;
        aVar.f9527b = bVar.f195569e2;
        int i = bVar.f195653z2;
        aVar.f9528c = i;
        aVar.f9537l = bVar.f195585i2;
        aVar.f9534i = bVar.f195467A2;
        aVar.f9540o.f237922h = bVar.f195617q2;
        aVar.f9538m = i != 0;
    }

    /* renamed from: c */
    public static void m109732c(String str, WxaAttributes wxaAttributes, C68070l.C68072b bVar) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ((C88262c1) C86312j.m106911c(C88262c1.class)).mo113583VU(str);
            } catch (Exception unused) {
            }
        }
        ((C119157j) C119157j.f356862d).mo183870a(new C88133a(wxaAttributes, bVar));
    }

    /* renamed from: d */
    public static boolean m109733d(C68070l.C68072b bVar, WxaAttributes wxaAttributes) {
        boolean z;
        boolean b;
        Class cls = C80995a.class;
        if (wxaAttributes == null) {
            C80995a aVar = (C80995a) bVar.mo93555w(cls);
            z = aVar != null ? C33860c.m40173b(aVar.f237906o, 16) : false;
            Log.m105925i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuyFlag flag from AppContentAppBrandPiece showRelievedBuyFlag:%b", Boolean.valueOf(z));
        } else {
            C80995a aVar2 = (C80995a) bVar.mo93555w(cls);
            if (wxaAttributes.mo113942o2() == null || bVar.f195467A2 <= wxaAttributes.mo113942o2().f239452d || aVar2 == null) {
                b = C33860c.m40173b(wxaAttributes.mo113940m2() != null ? wxaAttributes.mo113940m2().f239500p : 0, 16);
            } else {
                boolean b2 = C33860c.m40173b(aVar2.f237906o, 16);
                Log.m105925i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", Integer.valueOf(bVar.f195467A2), Integer.valueOf(wxaAttributes.mo113942o2().f239452d));
                b = b2;
            }
            Log.m105925i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[wantShowRelievedBuyFlag] use attrs:%b", Boolean.valueOf(z));
        }
        if (z && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.relievedbuy, 0) == 1) {
            C80995a aVar3 = (C80995a) bVar.mo93555w(cls);
            if (aVar3 != null ? aVar3.f237907p : false) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m109734e(String str, String str2, int i, String str3, C68070l.C68072b bVar, Bundle bundle) {
        String str4;
        int i2 = i;
        String str5 = str3;
        C68070l.C68072b bVar2 = bVar;
        Bundle bundle2 = bundle;
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        m109731b(startAppBrandUIFromOuterEvent, bVar2);
        m109730a(startAppBrandUIFromOuterEvent, bVar2);
        startAppBrandUIFromOuterEvent.f9522d.f9529d = i2;
        WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(bVar2.f195573f2);
        boolean d = m109733d(bVar2, N2);
        boolean e = m109735e(bVar2, N2);
        if (i2 == 1074) {
            String format = String.format("%s:%s:%s:%s:%s", new Object[]{str, bVar2.f195570f, bVar2.f195569e2, Integer.valueOf(d), Integer.valueOf(e)});
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9530e = format;
            aVar.f9525B = str5;
            Log.m105919d("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "sceneNote = %s", format);
        } else if (i2 == 1157) {
            if (str2 == null) {
                str4 = "";
            } else {
                str4 = str2;
            }
            String format2 = String.format("%s:%s:%s:%s:%s:%s", new Object[]{str, bVar2.f195570f, str4, bVar2.f195569e2, Integer.valueOf(d), Integer.valueOf(e)});
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9530e = format2;
            aVar2.f9525B = str5;
            Log.m105919d("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "sceneNote = %s", format2);
        } else if (i2 == 1073) {
            StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
            aVar3.f9530e = (d ? 1 : 0) + XVFSFile.PATH_SEPARATOR + (e ? 1 : 0);
        }
        StartAppBrandUIFromOuterEvent.C1142a aVar4 = startAppBrandUIFromOuterEvent.f9522d;
        aVar4.f9545t = bundle2;
        aVar4.f9541p = bundle2.getInt("chat_type", -1);
        startAppBrandUIFromOuterEvent.f9522d.f9542q = bundle2.getString("chatroom_username", "");
        startAppBrandUIFromOuterEvent.publish();
    }

    /* renamed from: f */
    public static void m109736f(String str, String str2, boolean z, C68070l.C68072b bVar, Bundle bundle) {
        String str3;
        String str4;
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        m109731b(startAppBrandUIFromOuterEvent, bVar);
        m109730a(startAppBrandUIFromOuterEvent, bVar);
        int i = bundle.getInt("chat_type", -1);
        if (C72996z1.m85846q5(str)) {
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9529d = TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY;
            aVar.f9530e = bVar.f195589j2 + XVFSFile.PATH_SEPARATOR + str;
        } else {
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = z ? 1008 : 1007;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (z) {
                str3 = XVFSFile.PATH_SEPARATOR + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(bVar.f195589j2);
            sb.append(XVFSFile.PATH_SEPARATOR);
            sb.append(i);
            aVar2.f9530e = sb.toString();
            int i2 = bundle.getInt("stat_scene", 0);
            if (i2 == 2 || i2 == 1) {
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(bVar.f195573f2);
                boolean d = m109733d(bVar, N2);
                boolean e = m109735e(bVar, N2);
                StringBuilder sb4 = new StringBuilder();
                StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
                sb4.append(aVar3.f9530e);
                sb4.append(XVFSFile.PATH_SEPARATOR);
                sb4.append(d ? 1 : 0);
                if (z) {
                    str4 = "";
                } else {
                    str4 = XVFSFile.PATH_SEPARATOR + str2;
                }
                sb4.append(str4);
                sb4.append(XVFSFile.PATH_SEPARATOR);
                sb4.append(e ? 1 : 0);
                aVar3.f9530e = sb4.toString();
            }
        }
        StartAppBrandUIFromOuterEvent.C1142a aVar4 = startAppBrandUIFromOuterEvent.f9522d;
        aVar4.f9545t = bundle;
        aVar4.f9541p = i;
        aVar4.f9542q = bundle.getString("chatroom_username", "");
        startAppBrandUIFromOuterEvent.publish();
    }

    /* renamed from: g */
    public static void m109737g(String str, String str2, boolean z, C68070l.C68072b bVar, Bundle bundle) {
        int i = 2;
        if (TextUtils.isEmpty(bVar.f195593k2)) {
            Log.m105921e("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "visitFromPageWithShareTicketAppMessage shareKey isEmpty, transform to normal visit, talkerUsername[%s] msgUsername[%s] groupChat[%b]", str, str2, Boolean.valueOf(z));
            m109736f(str, str2, z, bVar, bundle);
            return;
        }
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        m109731b(startAppBrandUIFromOuterEvent, bVar);
        m109730a(startAppBrandUIFromOuterEvent, bVar);
        int i2 = bundle.getInt("chat_type", -1);
        if (C72996z1.m85846q5(str)) {
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            aVar.f9529d = TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY;
            aVar.f9530e = bVar.f195589j2 + XVFSFile.PATH_SEPARATOR + str;
        } else {
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1044;
            aVar2.f9530e = bVar.f195589j2 + XVFSFile.PATH_SEPARATOR + i2 + XVFSFile.PATH_SEPARATOR + str;
            int i3 = bundle.getInt("stat_scene", 0);
            if (i3 == 2 || i3 == 1) {
                WxaAttributes N2 = ((C76629w0) C86312j.m106911c(C76629w0.class)).mo106879N2(bVar.f195573f2);
                boolean d = m109733d(bVar, N2);
                boolean e = m109735e(bVar, N2);
                StringBuilder sb = new StringBuilder();
                StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
                sb.append(aVar3.f9530e);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(d ? 1 : 0);
                sb.append(XVFSFile.PATH_SEPARATOR);
                sb.append(e ? 1 : 0);
                aVar3.f9530e = sb.toString();
            }
        }
        StartAppBrandUIFromOuterEvent.C1142a aVar4 = startAppBrandUIFromOuterEvent.f9522d;
        if (!z) {
            i = 1;
        }
        aVar4.f9543r = i;
        if (z) {
            str2 = str;
        }
        aVar4.f9544s = str2;
        LaunchParamsOptional launchParamsOptional = aVar4.f9540o;
        launchParamsOptional.f237919e = bVar.f195593k2;
        launchParamsOptional.f237918d = str;
        aVar4.f9541p = i2;
        aVar4.f9542q = bundle.getString("chatroom_username", "");
        startAppBrandUIFromOuterEvent.f9522d.f9545t = bundle;
        startAppBrandUIFromOuterEvent.publish();
    }

    /* renamed from: e */
    public static boolean m109735e(C68070l.C68072b bVar, WxaAttributes wxaAttributes) {
        boolean z;
        boolean b;
        C80995a aVar = (C80995a) bVar.mo93555w(C80995a.class);
        if (wxaAttributes == null) {
            z = aVar != null ? C33860c.m40173b(aVar.f237908q, 1) : false;
            Log.m105925i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", Boolean.valueOf(z));
        } else {
            if (wxaAttributes.mo113942o2() == null || bVar.f195467A2 <= wxaAttributes.mo113942o2().f239452d || aVar == null) {
                b = C33860c.m40173b(wxaAttributes.mo113940m2() != null ? wxaAttributes.mo113940m2().f239501q : 0, 1);
            } else {
                boolean b2 = C33860c.m40173b(aVar.f237908q, 1);
                Log.m105925i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", Integer.valueOf(bVar.f195467A2), Integer.valueOf(wxaAttributes.mo113942o2().f239452d));
                b = b2;
            }
            Log.m105925i("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "[isShowFlagshipTag] use attrs:%b", Boolean.valueOf(z));
        }
        if (!z || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.wxapp_flagship_store, 0) != 1) {
            return false;
        }
        return true;
    }
}
