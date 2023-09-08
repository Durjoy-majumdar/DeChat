package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WCTopicSearchTipActionStruct;
import com.tencent.p014mm.p136ui.C85864g1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher;
import com.tencent.p014mm.plugin.appbrand.shortlink.WxaShortLinkLaunchErrorCode;
import com.tencent.p014mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import de3.C45331f0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import nj3.C88989a;
import nj3.C88990b;
import or0.C47395f;
import or0.C47397k;
import or0.C47399m;
import p224ra.C12964b;
import p224ra.C89909e;
import pr0.C12002c;
import pr0.C35624a;
import pr0.C47519b;
import qo3.C89779i0;
import te3.C51876wu;
import te3.C52020xu;
import z04.C112551y;
import zp0.C16377l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI */
public class AppBrandCheckWxaShortLinkUI extends MMActivity {

    /* renamed from: g */
    public static final /* synthetic */ int f108873g = 0;

    /* renamed from: d */
    public C89779i0 f108874d;

    /* renamed from: e */
    public Runnable f108875e;

    /* renamed from: f */
    public AtomicBoolean f108876f = new AtomicBoolean(false);

    /* renamed from: H7 */
    public void mo63377H7(int i, WxaShortLinkInfo wxaShortLinkInfo) {
        C87412m.m108594g(wxaShortLinkInfo, "shortLinkInfo");
        WCTopicSearchTipActionStruct wCTopicSearchTipActionStruct = new WCTopicSearchTipActionStruct();
        wCTopicSearchTipActionStruct.f108020g = i;
        wCTopicSearchTipActionStruct.f108022i = wCTopicSearchTipActionStruct.mo86045b("appid", wxaShortLinkInfo.f108862d, true);
        wCTopicSearchTipActionStruct.f108019f = wCTopicSearchTipActionStruct.mo86045b(StateEvent.Name.MESSAGE, getIntent().getStringExtra(StateEvent.Name.MESSAGE), true);
        wCTopicSearchTipActionStruct.f108017d = wCTopicSearchTipActionStruct.mo86045b("requestid", getIntent().getStringExtra("requestId"), true);
        try {
            wCTopicSearchTipActionStruct.f108018e = Integer.parseInt(getIntent().getStringExtra("scene_for_report"));
        } catch (Exception unused) {
        }
        wCTopicSearchTipActionStruct.f108021h = 1;
        wCTopicSearchTipActionStruct.mo86054n();
        Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "reportForDialogWxaTag toShowString = " + wCTopicSearchTipActionStruct.mo1006q());
    }

    /* renamed from: I7 */
    public final C35624a mo63378I7(C45331f0.C45333b bVar) {
        C87412m.m108594g(bVar, "<this>");
        switch (bVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return C35624a.BusinessTypeWxaBase;
            case 4:
                return C35624a.BusinessTypeVideoAct;
            default:
                if (!BuildInfo.IS_FLAVOR_RED) {
                    return C35624a.BusinessTypeNone;
                }
                throw new Error(bVar.name() + " can not convert into CgiCheckWxaShortLink.TYPE");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6315bh;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("url") : null;
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) : null;
        Intent intent3 = getIntent();
        Boolean valueOf = intent3 != null ? Boolean.valueOf(intent3.getBooleanExtra("need_check", true)) : null;
        Intent intent4 = getIntent();
        int intExtra = intent4 != null ? intent4.getIntExtra("chatType", -1) : -1;
        Intent intent5 = getIntent();
        String stringExtra3 = intent5 != null ? intent5.getStringExtra("senderUsername") : null;
        if (!(stringExtra == null || C112551y.m153811k(stringExtra))) {
            if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "start check short link");
                WeakReference weakReference = new WeakReference(this);
                C45331f0.C45333b valueOf2 = C45331f0.C45333b.valueOf(stringExtra2);
                Boolean bool = Boolean.TRUE;
                if (C87412m.m108589b(valueOf, bool)) {
                    C40544a0 a0Var = new C40544a0(this, weakReference);
                    this.f108875e = a0Var;
                    MMHandlerThread.postToMainThreadDelayed(a0Var, 10000);
                    C89779i0 i0Var = this.f108874d;
                    if (i0Var != null) {
                        i0Var.dismiss();
                    }
                    C89779i0 e = C89779i0.m112248e(getContext(), getString(C0966R.string.a4d), true, 3, (DialogInterface.OnCancelListener) null);
                    this.f108874d = e;
                    e.setCancelable(false);
                    C40556w wVar = new C40556w(valueOf2, intExtra, stringExtra3, this, weakReference);
                    C40558x xVar = new C40558x(weakReference);
                    C87412m.m108594g(stringExtra, "link");
                    C47395f fVar = new C47395f(this, xVar, wVar, stringExtra, true);
                    C47399m mVar = C47399m.f127176a;
                    WxaShortLinkInfo wxaShortLinkInfo = C47399m.f127177b.get(stringExtra);
                    if (wxaShortLinkInfo != null) {
                        Log.m105924i("MicroMsg.AbsWxaShortLinkLauncher", "use cache for link:" + stringExtra);
                        fVar.invoke(bool, wxaShortLinkInfo);
                        return;
                    } else if (AbsWxaShortLinkLauncher.f108855a.matcher(stringExtra).matches()) {
                        C35624a f = wVar.mo63409f();
                        C51876wu wuVar = new C51876wu();
                        wuVar.f144290e = f.ordinal();
                        wuVar.f144289d = stringExtra;
                        C12964b a = C89909e.m112436a(C16377l.class);
                        C87412m.m108591d(a);
                        ((C16377l) a).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/wxaapp_checkshortlink", "", wuVar, C52020xu.class).mo123061d(new C47519b(fVar)).mo123065b(new C12002c(fVar));
                        return;
                    } else {
                        xVar.invoke(WxaShortLinkLaunchErrorCode.ILLEGAL_LINK);
                        return;
                    }
                } else {
                    C40560y yVar = new C40560y((WxaShortLinkInfo) getIntent().getParcelableExtra("shortLinkInfo"), stringExtra, this, stringExtra3, intExtra, valueOf2);
                    C40563z zVar = new C40563z(weakReference);
                    C87412m.m108594g(stringExtra, "link");
                    C47397k kVar = new C47397k(this, zVar, yVar, stringExtra, true);
                    C47399m mVar2 = C47399m.f127176a;
                    WxaShortLinkInfo wxaShortLinkInfo2 = C47399m.f127177b.get(stringExtra);
                    if (wxaShortLinkInfo2 != null) {
                        Log.m105924i("MicroMsg.AbsWxaShortLinkLauncher", "use cache for link:" + stringExtra);
                        kVar.invoke(bool, wxaShortLinkInfo2);
                        return;
                    }
                    return;
                }
            }
        }
        setResult(-1, new Intent());
        finish();
        Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "url empty or invalid scene, finish");
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.AppBrandCheckWxaShortLinkUI", "onDestroy");
        Runnable runnable = this.f108875e;
        if (runnable != null) {
            MMHandlerThread.removeRunnable(runnable);
        }
        C89779i0 i0Var = this.f108874d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        C85864g1.m106129d(getWindow());
        C85864g1.m106127b(getWindow(), false);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        C88990b.m111194c(this, (C88990b.C61771c) null);
    }
}
