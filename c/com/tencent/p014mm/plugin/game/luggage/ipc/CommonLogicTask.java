package com.tencent.p014mm.plugin.game.luggage.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.app.plugin.C40030e;
import com.tencent.p014mm.autogen.events.GameCommOperationEvent;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.C44030b;
import com.tencent.p014mm.plugin.webview.p128ui.tools.game.GameSettingParams;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import java.util.ArrayList;
import lc3.C10485b;
import p749xh.C66261f3;
import py1.C47671s4;
import wc3.C15134f0;
import wc3.C53145l0;

/* renamed from: com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask */
public class CommonLogicTask extends MainProcessTask {
    public static final Parcelable.Creator<CommonLogicTask> CREATOR = new C41906a();

    /* renamed from: f */
    public Bundle f112908f = new Bundle();

    /* renamed from: g */
    public int f112909g;

    /* renamed from: com.tencent.mm.plugin.game.luggage.ipc.CommonLogicTask$a */
    public class C41906a implements Parcelable.Creator<CommonLogicTask> {
        public Object createFromParcel(Parcel parcel) {
            return new CommonLogicTask(parcel);
        }

        public Object[] newArray(int i) {
            return new CommonLogicTask[i];
        }
    }

    public CommonLogicTask() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f112909g = parcel.readInt();
        this.f112908f = parcel.readBundle(getClass().getClassLoader());
    }

    /* renamed from: i */
    public void mo1552i() {
    }

    /* renamed from: j */
    public void mo1553j() {
        WebViewJSSDKFileItem b;
        int i;
        boolean z = true;
        switch (this.f112909g) {
            case 1:
                Bundle bundle = this.f112908f;
                if (bundle != null) {
                    boolean z2 = bundle.getBoolean("permission_allow", false);
                    String string = this.f112908f.getString("url");
                    if (!Util.isNullOrNil(string)) {
                        ((C40030e) C15134f0.C15135a.m14248a()).mo62719c(MMApplicationContext.getContext(), string, z2, (C53145l0) null);
                        break;
                    } else {
                        Log.m105920e("MicroMsg.ComonLogicTask", "ACTIVITY_JUMP_HANDLER, url is null");
                        return;
                    }
                }
                break;
            case 2:
                Bundle bundle2 = this.f112908f;
                if (bundle2 != null) {
                    int[] intArray = bundle2.getIntArray("getConfigStgKey");
                    if (intArray != null && intArray.length != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int e : intArray) {
                            C86709a0.m107528h();
                            arrayList.add(Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(e, (Object) null)));
                        }
                        this.f112908f.putStringArrayList("getConfigStgValue", arrayList);
                        break;
                    } else {
                        return;
                    }
                }
                break;
            case 3:
                Bundle bundle3 = this.f112908f;
                if (!(bundle3 == null || (b = C6080m.Ax0().mo7010b(bundle3.getString(C66261f3.COL_LOCALID))) == null)) {
                    this.f112908f.putParcelable("item", b);
                    break;
                }
            case 4:
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_open_webview_allow_download_file, 1) != 1) {
                    z = false;
                }
                if (this.f112908f == null) {
                    this.f112908f = new Bundle();
                }
                this.f112908f.putBoolean("allowDownloadFile", z);
                break;
            case 5:
                try {
                    i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("EnableWebviewScanQRCode"), 1);
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.ComonLogicTask", "getIntValFromDynamicConfig parseInt failed, val: EnableWebviewScanQRCode");
                    i = 1;
                }
                Bundle bundle4 = this.f112908f;
                if (i != 1) {
                    z = false;
                }
                bundle4.putBoolean("allow_webview_scan", z);
                break;
            case 6:
                this.f112908f.putBoolean("has_set_uin", C86709a0.m107522a());
                break;
            case 8:
                this.f112908f.putString(XWalkReaderBasePlugin.PARAM_KEY_FILE_PATH, C43702g2.m47532e(this.f112908f.getString(C66261f3.COL_LOCALID)));
                break;
            case 9:
                String string2 = this.f112908f.getString("game_hv_menu_appid");
                GameCommOperationEvent gameCommOperationEvent = new GameCommOperationEvent();
                GameCommOperationEvent.C1072a aVar = gameCommOperationEvent.f9268d;
                aVar.f9270a = 3;
                aVar.f9271b = string2;
                gameCommOperationEvent.publish();
                this.f112908f.putString("game_hv_menu_pbcache", gameCommOperationEvent.f9269e.f9273a);
                break;
            case 10:
                C47671s4 l = C41853c.m45378l();
                if (l != null) {
                    GameSettingParams gameSettingParams = new GameSettingParams();
                    gameSettingParams.f119219d = l.f128001d;
                    gameSettingParams.f119220e = l.f128002e;
                    gameSettingParams.f119221f = l.f128003f;
                    this.f112908f.putParcelable("game_setting_params", gameSettingParams);
                    break;
                }
                break;
            case 11:
                C44030b.m48316a(this.f112908f);
                break;
        }
        mo114394b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f112909g);
        parcel.writeBundle(this.f112908f);
    }

    public CommonLogicTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
