package ig3;

import com.tencent.p014mm.autogen.mmdata.rpt.IntelligentMsgActionLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: ig3.d */
public final class C60282d {

    /* renamed from: a */
    public static final C60282d f171857a = new C60282d();

    /* renamed from: b */
    public static String f171858b = "";

    /* renamed from: c */
    public static String f171859c = "";

    /* renamed from: d */
    public static int f171860d = 0;

    /* renamed from: e */
    public static String f171861e = "";

    /* renamed from: f */
    public static String f171862f = "";

    /* renamed from: g */
    public static String f171863g = "";

    /* renamed from: h */
    public static int f171864h = 0;

    /* renamed from: i */
    public static int f171865i = 0;

    /* renamed from: j */
    public static String f171866j = "";

    /* renamed from: k */
    public static int f171867k = 0;

    /* renamed from: l */
    public static int f171868l = 0;

    /* renamed from: m */
    public static int f171869m = 0;

    /* renamed from: n */
    public static long f171870n = 0;

    /* renamed from: o */
    public static int f171871o = 2;

    /* renamed from: p */
    public static int f171872p;

    /* renamed from: q */
    public static int f171873q;

    /* renamed from: r */
    public static int f171874r;

    /* renamed from: s */
    public static long f171875s;

    /* renamed from: t */
    public static boolean f171876t;

    /* renamed from: u */
    public static boolean f171877u;

    /* renamed from: a */
    public final void mo85264a() {
        Log.m105924i("MicroMsg.ImageQueryReporter", "clear search >> " + f171862f);
        f171862f = "";
        f171868l = 0;
        f171863g = "";
        f171867k = 0;
        f171875s = 0;
        f171869m = 0;
        f171866j = "";
    }

    /* renamed from: b */
    public final void mo85265b(int i) {
        IntelligentMsgActionLogStruct intelligentMsgActionLogStruct = new IntelligentMsgActionLogStruct();
        intelligentMsgActionLogStruct.f156328s = intelligentMsgActionLogStruct.mo86045b("Username", f171858b, true);
        intelligentMsgActionLogStruct.f156313d = intelligentMsgActionLogStruct.mo86045b("sessionid", f171859c, true);
        intelligentMsgActionLogStruct.f156315f = (long) i;
        if (i == 1) {
            intelligentMsgActionLogStruct.f156316g = (long) f171860d;
            intelligentMsgActionLogStruct.f156319j = intelligentMsgActionLogStruct.mo86045b("ExpoQuery", f171861e, true);
            intelligentMsgActionLogStruct.f156329t = (long) f171864h;
        } else if (i == 2) {
            intelligentMsgActionLogStruct.f156332w = (long) f171874r;
        } else if (i == 4) {
            intelligentMsgActionLogStruct.mo76269s(f171863g);
            intelligentMsgActionLogStruct.f156327r = (long) f171865i;
            intelligentMsgActionLogStruct.f156331v = (long) f171873q;
            intelligentMsgActionLogStruct.f156321l = 3;
            f171867k = 3;
            mo85266c(52);
        }
        Log.m105924i("MicroMsg.ImageQueryReporter", "externalReport >> action: " + intelligentMsgActionLogStruct.f156315f);
        intelligentMsgActionLogStruct.mo86054n();
    }

    /* renamed from: c */
    public final void mo85266c(int i) {
        IntelligentMsgActionLogStruct intelligentMsgActionLogStruct = new IntelligentMsgActionLogStruct();
        intelligentMsgActionLogStruct.f156328s = intelligentMsgActionLogStruct.mo86045b("Username", f171858b, true);
        intelligentMsgActionLogStruct.f156313d = intelligentMsgActionLogStruct.mo86045b("sessionid", f171859c, true);
        if (!(f171862f.length() == 0) || i == 51) {
            intelligentMsgActionLogStruct.f156314e = intelligentMsgActionLogStruct.mo86045b("searchsessionid", f171862f, true);
            intelligentMsgActionLogStruct.f156327r = (long) f171865i;
            intelligentMsgActionLogStruct.f156331v = (long) f171873q;
            intelligentMsgActionLogStruct.f156315f = (long) i;
            if (i != 5) {
                switch (i) {
                    case 51:
                        if (!f171876t) {
                            f171876t = true;
                            break;
                        } else {
                            return;
                        }
                    case 52:
                        intelligentMsgActionLogStruct.mo76269s(f171863g);
                        intelligentMsgActionLogStruct.f156317h = intelligentMsgActionLogStruct.mo86045b("PrintQuery", f171866j, true);
                        intelligentMsgActionLogStruct.f156321l = (long) f171867k;
                        break;
                    case 53:
                        intelligentMsgActionLogStruct.mo76269s(f171863g);
                        break;
                    case 54:
                        intelligentMsgActionLogStruct.mo76269s(f171863g);
                        intelligentMsgActionLogStruct.f156325p = (long) f171871o;
                        break;
                    case 55:
                        intelligentMsgActionLogStruct.mo76269s(f171863g);
                        intelligentMsgActionLogStruct.f156323n = (long) f171869m;
                        break;
                    case 56:
                        if (((long) f171868l) != 0) {
                            intelligentMsgActionLogStruct.mo76269s(f171863g);
                            intelligentMsgActionLogStruct.f156322m = (long) f171868l;
                            intelligentMsgActionLogStruct.f156323n = (long) f171869m;
                            intelligentMsgActionLogStruct.f156326q = System.currentTimeMillis() - f171875s;
                            mo85264a();
                            break;
                        } else {
                            return;
                        }
                    case 57:
                        if (((long) f171868l) <= 0) {
                            intelligentMsgActionLogStruct.mo76269s(f171863g);
                            intelligentMsgActionLogStruct.f156322m = (long) f171868l;
                            intelligentMsgActionLogStruct.f156326q = System.currentTimeMillis() - f171875s;
                            mo85264a();
                            break;
                        } else {
                            return;
                        }
                }
            } else {
                intelligentMsgActionLogStruct.f156324o = f171870n;
                intelligentMsgActionLogStruct.f156325p = (long) f171871o;
                intelligentMsgActionLogStruct.mo76269s(f171863g);
                intelligentMsgActionLogStruct.f156330u = (long) f171872p;
            }
            Log.m105924i("MicroMsg.ImageQueryReporter", "internalReport >> action: " + intelligentMsgActionLogStruct.f156315f);
            intelligentMsgActionLogStruct.mo86054n();
            return;
        }
        Log.m105924i("MicroMsg.ImageQueryReporter", "action: " + i + ", searchSessionId is empty, no report");
    }

    /* renamed from: d */
    public final void mo85267d(int i) {
        Log.m105924i("MicroMsg.ImageQueryReporter", "setSearchPeopleImageCnt >> " + i + ' ' + f171862f);
        if (!(f171862f.length() == 0)) {
            f171869m = i;
        }
    }

    /* renamed from: e */
    public final void mo85268e(String str) {
        C87412m.m108594g(str, "queryText");
        f171863g = C112551y.m153814n(str, ",", " ", false);
    }

    /* renamed from: f */
    public final void mo85269f() {
        long currentTimeMillis = System.currentTimeMillis();
        f171875s = currentTimeMillis;
        f171869m = 0;
        f171868l = 0;
        f171877u = false;
        f171862f = String.valueOf(currentTimeMillis);
        f171867k = 0;
    }
}
