package dn2;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C7250m;
import eb0.C45628s0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import pc0.C100765f;
import rx3.C13598b0;
import wd3.C65953v0;

/* renamed from: dn2.b */
public final class C7383b implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ String f25519a;

    /* renamed from: b */
    public final /* synthetic */ C7373a f25520b;

    /* renamed from: dn2.b$a */
    public static final class C7384a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7373a f25521d;

        /* renamed from: e */
        public final /* synthetic */ String f25522e;

        /* renamed from: f */
        public final /* synthetic */ String f25523f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7384a(C7373a aVar, String str, String str2) {
            super(1);
            this.f25521d = aVar;
            this.f25522e = str;
            this.f25523f = str2;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, LocaleUtil.ITALIAN);
            MMActivity mMActivity = this.f25521d.f25505a;
            String str2 = this.f25522e;
            String str3 = this.f25523f;
            C87412m.m108593f(str3, MimeTypes.BASE_TYPE_TEXT);
            C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(str2, "toUsers");
            if (!TextUtils.isEmpty(str3)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                aVar.f9497a = str2;
                aVar.f9498b = str3;
                aVar.f9499c = C45628s0.m50810y(str2);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            C7250m.m7431a().mo136256TG(mMActivity, str2, str, 0, "", "", (C100765f) null);
            C75026b.m89951a(mMActivity, mMActivity.getString(C0966R.string.fjh));
            return C13598b0.f38549a;
        }
    }

    public C7383b(String str, C7373a aVar) {
        this.f25519a = str;
        this.f25520b = aVar;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        String str2;
        if (z && (str2 = this.f25519a) != null) {
            C7373a aVar = this.f25520b;
            aVar.f25506b.mo6181d(new C7384a(aVar, str2, str));
        }
    }
}
