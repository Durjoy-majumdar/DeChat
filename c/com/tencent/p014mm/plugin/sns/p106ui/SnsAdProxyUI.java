package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import ke3.C88144b;
import lo2.C99542h0;
import nj3.C76879j;
import p248ug.C52574z;
import sf0.C48374j0;
import te3.C77967mx3;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsAdProxyUI */
public class SnsAdProxyUI extends MMFragmentActivity {

    /* renamed from: e */
    public static final /* synthetic */ int f277698e = 0;

    /* renamed from: d */
    public boolean f277699d = false;

    public Resources getResources() {
        SnsMethodCalculate.markStartTimeMs("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        if (getAssets() == null || MMApplicationContext.getResources() == null) {
            Resources resources = super.getResources();
            SnsMethodCalculate.markEndTimeMs("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return resources;
        }
        Resources resources2 = MMApplicationContext.getResources();
        SnsMethodCalculate.markEndTimeMs("getResources", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        return resources2;
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            Log.m105920e("MicroMsg.SnsAdBlankUI", "intent null!");
            finish();
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return;
        }
        int intExtra = intent.getIntExtra("action_type", -1);
        Log.m105924i("MicroMsg.SnsAdBlankUI", "action=" + intExtra);
        if (intExtra < 0) {
            finish();
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            return;
        }
        SnsMethodCalculate.markStartTimeMs("delAction", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        Log.m105924i("MicroMsg.SnsAdBlankUI", "delAction， action=" + intExtra);
        if (intExtra == 1) {
            DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
            DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
            aVar.f264650b = this;
            aVar.f264649a = intent.getStringExtra("qrcodeStr");
            dealQBarStrEvent.f264648d.f264651c = intent.getIntExtra("qrcodeType", 0);
            dealQBarStrEvent.f264648d.f264652d = intent.getIntExtra("qrcodeVer", 0);
            dealQBarStrEvent.f264648d.f264657i = 30;
            dealQBarStrEvent.publish();
            this.f277699d = true;
            MMHandlerThread.postToMainThreadDelayed(new C96169q3(this), 2000);
        } else if (intExtra == 2) {
            String stringExtra = intent.getStringExtra("username");
            String stringExtra2 = intent.getStringExtra("url");
            String stringExtra3 = intent.getStringExtra("sceneNote");
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9526a = stringExtra;
            aVar2.f9527b = stringExtra2;
            aVar2.f9529d = 1084;
            aVar2.f9530e = stringExtra3;
            aVar2.f9531f = this;
            startAppBrandUIFromOuterEvent.publish();
            finish();
        } else if (intExtra == 3) {
            Class cls = C52574z.class;
            SnsMethodCalculate.markStartTimeMs("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            byte[] byteArrayExtra = intent.getByteArrayExtra("searchContactResponseByte");
            String nullAsNil = Util.nullAsNil(intent.getStringExtra("searchWord"));
            try {
                C77967mx3 mx32 = new C77967mx3();
                mx32.parseFrom(byteArrayExtra);
                Log.m105924i("MicroMsg.SnsAdBlankUI", "doOpenProfile, query=" + nullAsNil + ", count=" + mx32.f227845D);
                if (mx32.f227845D > 0) {
                    if (mx32.f227846E.isEmpty()) {
                        C76879j.m92744o(this, C0966R.string.igp, 0, true, (DialogInterface.OnClickListener) null);
                        SnsMethodCalculate.markEndTimeMs("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
                        finish();
                    } else {
                        Intent intent2 = new Intent();
                        ((C52574z) C86312j.m106911c(cls)).mo73535ek(intent2, mx32.f227846E.getFirst(), WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS);
                        C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                } else if (Util.nullAsNil(C48374j0.m53718g(mx32.f227857d)).length() > 0) {
                    Intent intent3 = new Intent();
                    ((C52574z) C86312j.m106911c(cls)).mo73528B0(intent3, mx32, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS);
                    intent3.putExtra("Contact_Scene", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS);
                    intent3.putExtra("add_more_friend_search_scene", 2);
                    C88144b.m109791i(this, Scopes.PROFILE, ".ui.ContactInfoUI", intent3, (Bundle) null);
                }
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.SnsAdBlankUI", "parse GetWXUserNameResp exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("doOpenProfile", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            finish();
        } else if (intExtra == 4) {
            SnsMethodCalculate.markStartTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            try {
                C99542h0.m129909g(this, Util.nullAsNil(intent.getStringExtra("finderUsername")), Util.nullAsNil(intent.getStringExtra("uxInfo")), Util.nullAsNil(intent.getStringExtra("snsIdStr")), intent.getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0));
            } catch (Throwable th4) {
                Log.m105920e("MicroMsg.SnsAdBlankUI", "doJumpToFinderProfileUI, exp=" + th4.toString());
            }
            SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
            finish();
        } else {
            finish();
        }
        SnsMethodCalculate.markEndTimeMs("delAction", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
        super.onStop();
        if (this.f277699d && !isFinishing()) {
            Log.m105924i("MicroMsg.SnsAdBlankUI", "finish, onStop");
            this.f277699d = false;
            finish();
            overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
        }
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdProxyUI");
    }
}
