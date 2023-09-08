package ot1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FinderCommentErrorEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60200t1;
import ke3.C88144b;
import kj2.C117407d;
import lc3.C10485b;
import nj3.C76912y0;
import qo3.C47883u;
import qo3.C77426q;
import te3.C48779ay0;

/* renamed from: ot1.a */
public final class C11767a {

    /* renamed from: a */
    public static final C11767a f34453a = new C11767a();

    /* renamed from: ot1.a$a */
    public static final class C11768a implements C47883u {

        /* renamed from: a */
        public static final C11768a f34454a = new C11768a();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            C87412m.m108594g(str, "s");
        }
    }

    /* renamed from: ot1.a$b */
    public static final class C11769b implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ String f34455a;

        /* renamed from: b */
        public final /* synthetic */ Context f34456b;

        public C11769b(String str, Context context) {
            this.f34455a = str;
            this.f34456b = context;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z) {
                String str2 = this.f34455a;
                C87412m.m108593f(str2, "linkUrl");
                if (str2.length() > 0) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", this.f34455a);
                    C88144b.m109791i(this.f34456b, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }
    }

    /* renamed from: ot1.a$c */
    public static final class C11770c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ String f34457a;

        /* renamed from: b */
        public final /* synthetic */ int f34458b;

        /* renamed from: c */
        public final /* synthetic */ Context f34459c;

        public C11770c(String str, int i, Context context) {
            this.f34457a = str;
            this.f34458b = i;
            this.f34459c = context;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z) {
                String str2 = this.f34457a;
                C87412m.m108593f(str2, "linkUrl");
                if ((str2.length() > 0) && this.f34458b == 1) {
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", this.f34457a);
                    C88144b.m109791i(this.f34459c, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11659a(String str) {
        C87412m.m108594g(str, "business");
        if (mo11660b(str) == 0) {
            return false;
        }
        mo11666h(mo11661c(str));
        C117407d.INSTANCE.idkeyStat(1264, 3, 1, false);
        Log.m105924i("Finder.FinderSpamLogic", "function spam " + str);
        return true;
    }

    /* renamed from: b */
    public final int mo11660b(String str) {
        C87412m.m108594g(str, "business");
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderSpamObject");
        Log.m105924i("Finder.FinderSpamLogic", "getFunctionSpamAction " + c);
        if (Util.isNullOrNil(c)) {
            return 0;
        }
        try {
            return new C104289g(c).optJSONObject(str).optInt("action", 0);
        } catch (Exception unused) {
            Log.m105924i("Finder.FinderSpamLogic", "getFunctionSpamAction spamValue " + c);
            return 0;
        }
    }

    /* renamed from: c */
    public final String mo11661c(String str) {
        C87412m.m108594g(str, "business");
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("FinderSpamObject");
        if (Util.isNullOrNil(c)) {
            return "";
        }
        try {
            String optString = new C104289g(c).optJSONObject(str).optString("tip", "");
            C87412m.m108593f(optString, "obj.optJSONObject(business).optString(\"tip\", \"\")");
            return optString;
        } catch (Exception unused) {
            Log.m105924i("Finder.FinderSpamLogic", "getFunctionSpamTip spamValue " + c);
            return "";
        }
    }

    /* renamed from: d */
    public final void mo11662d(int i, int i2, String str) {
        if (i == 4 && i2 == -4010) {
            if (str != null) {
                f34453a.mo11666h(str);
            }
            C117407d.INSTANCE.idkeyStat(1264, 4, 1, false);
        }
    }

    /* renamed from: e */
    public final void mo11663e(int i, int i2, String str) {
        if (i == 4 && i2 == -4013 && str != null) {
            f34453a.mo11666h(str);
            FinderCommentErrorEvent finderCommentErrorEvent = new FinderCommentErrorEvent();
            FinderCommentErrorEvent.C1043a aVar = finderCommentErrorEvent.f9188d;
            aVar.f9189a = i2;
            aVar.f9190b = str;
            finderCommentErrorEvent.publish();
        }
    }

    /* renamed from: f */
    public final void mo11664f(int i, int i2, String str) {
        if (i != 4) {
            return;
        }
        if (i2 == -5800) {
            String string = MMApplicationContext.getContext().getString(C0966R.string.f360492d70);
            C87412m.m108593f(string, "getContext().getString(R…g.finder_draft_max_count)");
            mo11666h(string);
        } else if (i2 == -4019) {
            if (str != null) {
                f34453a.mo11666h(str);
            }
            C117407d.INSTANCE.idkeyStat(1264, 6, 1, false);
        } else if (i2 == -4017) {
            if (str != null) {
                f34453a.mo11666h(str);
            }
            C117407d.INSTANCE.idkeyStat(1264, 2, 1, false);
        } else if (i2 == -5002) {
            if (str != null) {
                f34453a.mo11668j(str);
            }
            C117407d.INSTANCE.idkeyStat(1264, 1, 1, false);
        } else if (i2 == -5001) {
            if (str != null) {
                f34453a.mo11667i(str);
            }
            C117407d.INSTANCE.idkeyStat(1264, 1, 1, false);
        } else if (i2 == -4007) {
            if (str != null) {
                f34453a.mo11666h(str);
            }
            C117407d.INSTANCE.idkeyStat(1264, 1, 1, false);
        } else if (i2 == -4006) {
            if (str != null) {
                f34453a.mo11666h(str);
            }
            C117407d.INSTANCE.idkeyStat(1264, 0, 1, false);
        }
    }

    /* renamed from: g */
    public final boolean mo11665g(int i, int i2, C48779ay0 ay02) {
        if (i != 4) {
            return false;
        }
        if (i2 != -200046) {
            switch (i2) {
                case MMLISTEN_ERR_INVALID_BROADCAST_VALUE:
                case -200011:
                case MMLISTEN_ERR_INVALID_FEEDBUF_VALUE:
                case -200009:
                case MMLISTEN_ERR_INVALID_PARAM_VALUE:
                    break;
                default:
                    return false;
            }
        }
        if (ay02 == null) {
            return false;
        }
        int i3 = ay02.f130840d;
        String str = "";
        if (i3 == 1) {
            C11767a aVar = f34453a;
            String str2 = ay02.f130841e;
            if (str2 != null) {
                str = str2;
            }
            aVar.mo11666h(str);
        } else if (i3 != 3) {
            return false;
        } else {
            Context context = MMApplicationContext.getContext();
            String str3 = ay02.f130841e;
            if (str3 != null) {
                str = str3;
            }
            C76912y0.m92773l(context, str);
        }
        return true;
    }

    /* renamed from: h */
    public final void mo11666h(String str) {
        C87412m.m108594g(str, "errMsg");
        C77426q qVar = new C77426q(((C60200t1) C86312j.m106911c(C60200t1.class)).mo76771JP());
        qVar.mo107595g(str);
        qVar.mo107601m(C0966R.string.lkg);
        qVar.mo107589a(true);
        qVar.mo107600l(C11768a.f34454a);
        qVar.mo107603o();
    }

    /* renamed from: i */
    public final void mo11667i(String str) {
        Context JP = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76771JP();
        try {
            Log.m105924i("Finder.FinderSpamLogic", "[showSpamDialogWithH5] json = " + str);
            C104289g gVar = new C104289g(str);
            String optString = gVar.optString("msg");
            String optString2 = gVar.optString("cancel");
            String optString3 = gVar.optString("confirm");
            String optString4 = gVar.optString("confirm_link");
            C77426q qVar = new C77426q(JP);
            qVar.mo107595g(optString);
            qVar.mo107589a(true);
            qVar.mo107598j(optString2);
            qVar.mo107602n(optString3);
            qVar.mo107590b(new C11769b(optString4, JP));
            qVar.mo107603o();
        } catch (Exception e) {
            Log.m105924i("Finder.FinderSpamLogic", "[showSpamDialogWithH5] catch exception:" + e.getMessage());
        }
    }

    /* renamed from: j */
    public final void mo11668j(String str) {
        Context JP = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76771JP();
        try {
            Log.m105924i("Finder.FinderSpamLogic", "[showSpamDialogWithJumpErrMsg] json = " + str);
            C104289g gVar = new C104289g(str);
            if (gVar.getInt("show_type") != 1) {
                int i = gVar.getInt("link_type");
                String optString = gVar.getJSONObject("link_h5").optString("link");
                C104289g k = gVar.getJSONObject("toast_config");
                String optString2 = k.optString("msg");
                String optString3 = k.optString("cancel");
                String optString4 = k.optString("confirm");
                C77426q qVar = new C77426q(JP);
                qVar.mo107595g(optString2);
                qVar.mo107589a(true);
                qVar.mo107598j(optString3);
                qVar.mo107602n(optString4);
                qVar.mo107590b(new C11770c(optString, i, JP));
                qVar.mo107603o();
            }
        } catch (Exception e) {
            Log.m105924i("Finder.FinderSpamLogic", "[showSpamDialogWithJumpErrMsg] catch exception:" + e.getMessage());
        }
    }
}
