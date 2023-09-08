package vv1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0125s;
import bl3.C54492n;
import com.eclipsesource.mmv8.Platform;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.p014mm.sdk.statecenter.IStateAction;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import e83.C45556b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import kg3.C76577a;
import kv1.C99251g;
import kv1.C99252h;
import rx3.C13598b0;
import uv1.C65479a;
import uv1.C65480b;
import yb2.C66605h;

/* renamed from: vv1.d */
public final class C65894d extends C66605h<C65479a> {

    /* renamed from: vv1.d$a */
    public static final class C65895a extends C87413o implements C32226l<C65479a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65894d f189454d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65895a(C65894d dVar) {
            super(1);
            this.f189454d = dVar;
        }

        public Object invoke(Object obj) {
            C65479a aVar = (C65479a) obj;
            C87412m.m108594g(aVar, "state");
            C65894d dVar = this.f189454d;
            IStateAction action = aVar.getAction();
            if (action != null && (action instanceof C65480b)) {
                C65480b bVar = (C65480b) action;
                dVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "10000");
                String currentLanguage = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
                C87412m.m108593f(currentLanguage, "getCurrentLanguage(MMApp…tionContext.getContext())");
                hashMap.put(IXWebPreferences.XWEB_LANGUAGE, currentLanguage);
                hashMap.put("platform", Platform.ANDROID);
                hashMap.put(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(C43471q.m46983g(9).mo71078p0()));
                hashMap.put(DownloadInfo.NETTYPE, C43471q.m46979c());
                String str = BuildInfo.CLIENT_VERSION;
                C87412m.m108593f(str, "CLIENT_VERSION");
                hashMap.put("wechatVersion", str);
                hashMap.put("nativeHeight", "0");
                float p = C76577a.m92165p(MMApplicationContext.getContext());
                boolean z = true;
                if (!(p == 1.0f)) {
                    if (!(p == 0.8f)) {
                        if (!(p == 1.1f)) {
                            if (!(p == 1.12f)) {
                                if (!(p == 1.125f)) {
                                    if (!(p == 1.4f)) {
                                        if (!(p == 1.55f)) {
                                            if (p != 1.65f) {
                                                z = false;
                                            }
                                            if (!z) {
                                                p = 1.0f;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                hashMap.put("fontRatio", String.valueOf(p));
                hashMap.put("sessionId", String.valueOf(C99252h.f291030c));
                C99252h.f291031d = C99251g.m129286g(3);
                hashMap.put("entranceExptValue", "2");
                hashMap.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "103");
                hashMap.put("sessionId", "" + C99252h.f291031d);
                hashMap.put("subSessionId", "" + C99252h.f291030c);
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("file://");
                C45556b g = C43471q.m46983g(9);
                stringBuffer.append(g.mo71077o());
                stringBuffer.append("/");
                stringBuffer.append(g.mo71058f());
                stringBuffer.append("?");
                stringBuffer.append(C43471q.m46987k(hashMap));
                Log.m105924i(C54492n.TAG, "getHotSearchUrl， rawurl, urlBuffer.toString() = " + stringBuffer);
                String stringBuffer2 = stringBuffer.toString();
                C87412m.m108593f(stringBuffer2, "urlBuffer.toString()");
                aVar.f188433d = stringBuffer2;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65894d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: g3 */
    public BaseState mo85303g3() {
        C65479a aVar = new C65479a();
        C87412m.m108593f(C99252h.m129298c(C99252h.f291030c), "getUnsignedSessionId()");
        return aVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.process((C0125s) getActivity(), new C65895a(this));
        }
    }

    public void onCreateAfter(Bundle bundle) {
        UIStateCenter e3 = mo14599e3();
        if (e3 != null) {
            e3.dispatch(new C65480b());
        }
    }
}
