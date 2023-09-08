package av2;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import av2.C92126r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.messenger.foundation.PluginMessengerFoundation;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import eb0.C45628s0;
import gy3.C87412m;
import od3.C62001a;
import pc0.C100765f;
import te3.C101804kv2;
import te3.C64291co3;
import vr2.C102236a0;
import wd3.C65953v0;

/* renamed from: av2.s */
public final class C92137s implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ C92126r f263743a;

    /* renamed from: b */
    public final /* synthetic */ String f263744b;

    /* renamed from: c */
    public final /* synthetic */ boolean f263745c;

    /* renamed from: d */
    public final /* synthetic */ C101804kv2 f263746d;

    /* renamed from: e */
    public final /* synthetic */ SnsInfo f263747e;

    /* renamed from: f */
    public final /* synthetic */ boolean f263748f;

    public C92137s(C92126r rVar, String str, boolean z, C101804kv2 kv22, SnsInfo snsInfo, boolean z2) {
        this.f263743a = rVar;
        this.f263744b = str;
        this.f263745c = z;
        this.f263746d = kv22;
        this.f263747e = snsInfo;
        this.f263748f = z2;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1$1");
        C64291co3 f = this.f263743a.mo126103f();
        if (f != null) {
            String str3 = this.f263744b;
            f.f182539d = 3;
            if (z) {
                f.f182549q = str3;
            }
            f.f182547o = (int) (SystemClock.elapsedRealtime() - f.f182550r);
        }
        C62001a.f176265a.mo86878a(this.f263743a.mo126100c());
        if (!z || Util.isNullOrNil(this.f263744b)) {
            SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1$1");
            return;
        }
        if (this.f263745c) {
            C92126r rVar = this.f263743a;
            Activity c = rVar.mo126100c();
            String str4 = this.f263744b;
            C87412m.m108591d(str4);
            C101804kv2 kv22 = this.f263746d;
            String str5 = this.f263747e.getTimeLine().snsExcerptUrl;
            C87412m.m108593f(str5, "snsInfo.timeLine.snsExcerptUrl");
            String localid = this.f263747e.getLocalid();
            C87412m.m108593f(localid, "snsInfo.getLocalid()");
            SnsMethodCalculate.markStartTimeMs("access$shareExceprt", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            rVar.getClass();
            SnsMethodCalculate.markStartTimeMs("shareExceprt", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            if (!TextUtils.isEmpty(str)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                aVar.f9497a = str4;
                aVar.f9498b = str2;
                aVar.f9499c = C45628s0.m50810y(str4);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            String str6 = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d) + C102236a0.m134717L(kv22);
            C97425j a = C7250m.m7431a();
            C100765f fVar = new C100765f();
            fVar.f295215c = localid;
            a.mo136253Fd(c, str4, str6, 1, str5, "", "", fVar);
            Activity activity = c;
            C75026b.m89951a(activity, activity.getString(C0966R.string.fjh));
            SnsMethodCalculate.markEndTimeMs("shareExceprt", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            SnsMethodCalculate.markEndTimeMs("access$shareExceprt", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        } else if (this.f263748f) {
            C92126r rVar2 = this.f263743a;
            Activity c2 = rVar2.mo126100c();
            String str7 = this.f263744b;
            C87412m.m108591d(str7);
            C101804kv2 kv23 = this.f263746d;
            String localid2 = this.f263747e.getLocalid();
            C87412m.m108593f(localid2, "snsInfo.getLocalid()");
            rVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("shareSendImg", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            C87412m.m108594g(c2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108594g(kv23, "media");
            if (!TextUtils.isEmpty(str)) {
                SendMsgEvent sendMsgEvent2 = new SendMsgEvent();
                SendMsgEvent.C1132a aVar2 = sendMsgEvent2.f9496d;
                aVar2.f9497a = str7;
                aVar2.f9498b = str2;
                aVar2.f9499c = C45628s0.m50810y(str7);
                sendMsgEvent2.f9496d.f9500d = 0;
                sendMsgEvent2.publish();
            }
            String str8 = C94938q1.m120518e(C94866e1.m120262YO(), kv23.f298689d) + C102236a0.m134717L(kv23);
            C97425j a2 = C7250m.m7431a();
            C100765f fVar2 = new C100765f();
            fVar2.f295215c = localid2;
            Activity activity2 = c2;
            a2.mo136256TG(c2, str7, str8, 0, "", "", fVar2);
            C75026b.m89951a(activity2, activity2.getString(C0966R.string.fjh));
            SnsMethodCalculate.markEndTimeMs("shareSendImg", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        } else {
            C92126r.C92127a aVar3 = C92126r.f263717g;
            Activity c3 = this.f263743a.mo126100c();
            String str9 = this.f263744b;
            C87412m.m108591d(str9);
            C101804kv2 kv24 = this.f263746d;
            String localid3 = this.f263747e.getLocalid();
            C87412m.m108593f(localid3, "snsInfo.getLocalid()");
            aVar3.mo126113b(c3, str9, str, kv24, localid3);
        }
        ((PluginMessengerFoundation) C86312j.m106911c(PluginMessengerFoundation.class)).mo96076P7().mo90704g(this.f263744b);
        SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$addQuickShare$1$1");
    }
}
