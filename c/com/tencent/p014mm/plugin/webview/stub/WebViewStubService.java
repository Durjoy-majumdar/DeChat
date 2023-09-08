package com.tencent.p014mm.plugin.webview.stub;

import android.app.Service;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import c00.C92330r;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.app.plugin.C40030e;
import com.tencent.p014mm.autogen.events.CancelRecogImageFileEvent;
import com.tencent.p014mm.autogen.events.DeleteFavoriteEvent;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.FTSEmojiDownloadedEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.events.GetJDUrlEvent;
import com.tencent.p014mm.autogen.events.OnEnterFinderFullscreenEvent;
import com.tencent.p014mm.autogen.events.OnExitFinderFullscreenEvent;
import com.tencent.p014mm.autogen.events.OnFinderFeedInfoUpdatedEvent;
import com.tencent.p014mm.autogen.events.ReaderAppOperationEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.events.SnsfillEventInfoEvent;
import com.tencent.p014mm.autogen.events.WebViewImagePreviewPositionChangedEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C1297x;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C96598h;
import com.tencent.p014mm.plugin.websearch.C96603l;
import com.tencent.p014mm.plugin.websearch.FTSWebViewLogic;
import com.tencent.p014mm.plugin.webview.emojistore.EmojiStoreWebViewLogic;
import com.tencent.p014mm.plugin.webview.model.C43695a0;
import com.tencent.p014mm.plugin.webview.model.C43702g2;
import com.tencent.p014mm.plugin.webview.model.C43720k;
import com.tencent.p014mm.plugin.webview.model.C43721l;
import com.tencent.p014mm.plugin.webview.model.C6032f2;
import com.tencent.p014mm.plugin.webview.model.C6038i2;
import com.tencent.p014mm.plugin.webview.model.C6045j1;
import com.tencent.p014mm.plugin.webview.model.C96649l1;
import com.tencent.p014mm.plugin.webview.model.C96650m;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKUpFileItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.C44209a;
import com.tencent.p014mm.plugin.webview.stub.C43784c;
import com.tencent.p014mm.plugin.webview.stub.C43787d;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C44625c2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import e00.C45514j0;
import e00.C45518r0;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C86493v0;
import ex0.C45696d;
import f40.C86709a0;
import f40.C86718e;
import f62.C75700k0;
import gy3.C87412m;
import ie3.C87716k;
import j20.C117292a;
import j83.C9286a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import jr2.C9509g;
import k20.C9556a;
import ke3.C88144b;
import kv1.C99260q;
import ky2.C10432i;
import ky2.C10439o;
import lc3.C10485b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import org.json.JSONObject;
import p008bq.C39832j1;
import p008bq.C54530k0;
import p008bq.C67309t0;
import p166hy.C46134x;
import p167hz.C46138l;
import p196ln.C76708i;
import p237sp.C13754y;
import p237sp.C48456t;
import p645pj.C47506e;
import p645pj.C77092c;
import p728vs.C52990d;
import p728vs.C52991e;
import p749xh.C53352w2;
import p763ym.C79138l;
import pb1.C100714h1;
import qe3.C89625d;
import qo3.C47883u;
import qo3.C77426q;
import rb0.C47984k;
import rb0.C48009v0;
import sw1.C101705t;
import sw1.C48471j;
import te3.C49500g14;
import te3.C49642h14;
import te3.C51593us3;
import u73.C101987v0;
import u73.C14128i;
import u73.C52464j0;
import u73.C78137s0;
import wc3.C15132d0;
import wc3.C15134f0;
import wc3.C53145l0;
import wc3.C90945m;

/* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService */
public class WebViewStubService extends Service implements C11385n {

    /* renamed from: B */
    public static final /* synthetic */ int f118264B = 0;

    /* renamed from: A */
    public final IListener<WebViewImagePreviewPositionChangedEvent> f118265A;

    /* renamed from: d */
    public final SparseArray<Bundle> f118266d = new SparseArray<>();

    /* renamed from: e */
    public C43791l.C43792a f118267e = new C43781a();

    /* renamed from: f */
    public Map<String, Integer> f118268f;

    /* renamed from: g */
    public IListener f118269g;

    /* renamed from: h */
    public IListener f118270h;

    /* renamed from: i */
    public List<WebViewStubCallbackWrapper> f118271i;

    /* renamed from: j */
    public int f118272j;

    /* renamed from: n */
    public MMHandler f118273n;

    /* renamed from: o */
    public C40952u f118274o;

    /* renamed from: p */
    public C96650m f118275p;

    /* renamed from: q */
    public C43720k f118276q;

    /* renamed from: r */
    public C43721l f118277r;

    /* renamed from: s */
    public C29060q f118278s;

    /* renamed from: t */
    public C10439o f118279t;

    /* renamed from: u */
    public C101705t f118280u;

    /* renamed from: v */
    public Set<Integer> f118281v;

    /* renamed from: w */
    public int f118282w;

    /* renamed from: x */
    public final IListener<OnFinderFeedInfoUpdatedEvent> f118283x;

    /* renamed from: y */
    public final IListener<OnExitFinderFullscreenEvent> f118284y;

    /* renamed from: z */
    public final IListener<OnEnterFinderFullscreenEvent> f118285z;

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$b */
    public class C43773b implements C43720k {
        public C43773b() {
        }

        /* renamed from: a */
        public void mo62556a(Bundle bundle) {
            try {
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(121000, bundle);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebViewStubService", e, "finderFeedInfUpdateEvent exception", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$c */
    public class C43774c implements C43721l {
        public C43774c() {
        }

        /* renamed from: a */
        public void mo18000a(int i, Bundle bundle) {
            try {
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(i == 1 ? 121002 : 121001, bundle);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WebViewStubService", e, "onExitFinderFullscreenEvent exception", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$d */
    public class C43775d extends C29060q.C29061a {

        /* renamed from: d */
        public final byte[] f118291d = new byte[0];

        public C43775d() {
        }

        public void onNetworkChange(int i) {
            synchronized (this.f118291d) {
                try {
                    String g = C44625c2.m49074g();
                    Bundle bundle = new Bundle();
                    bundle.putString("webview_network_type", g);
                    Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                    while (it.hasNext()) {
                        ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(90, bundle);
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebViewStubService", "notify network change failed :%s", e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$e */
    public class C43776e implements C10439o {
        public C43776e() {
        }

        public void onDataChanged() {
            Log.m105918d("MicroMsg.WebViewStubService", "TeenModeDataChanged");
            try {
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(256, new Bundle());
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewStubService", "notify network change failed :%s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$f */
    public class C43777f implements C101705t {
        public C43777f() {
        }

        /* renamed from: E4 */
        public void mo68080E4(String str, float f) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("game_haowan_publish_post_id", str);
                bundle.putFloat("game_haowan_publish_progress", f);
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(255, bundle);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewStubService", "notify network change failed :%s", e.getMessage());
            }
        }

        /* renamed from: k2 */
        public void mo68081k2(String str, int i) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("game_haowan_publish_post_id", str);
                bundle.putInt("game_haowan_publish_retcode", i);
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(254, bundle);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewStubService", "notify network change failed :%s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$g */
    public class C43778g implements C40952u {
        public C43778g() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
            try {
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
                    if (nh != null) {
                        long j4 = nh.field_totalSize;
                        if (j4 != 0) {
                            long j5 = nh.field_downloadedSize;
                            float f = (((float) j5) * 100.0f) / ((float) j4);
                            Bundle bundle = new Bundle();
                            bundle.putLong("download_manager_downloadid", j);
                            bundle.putInt("download_manager_progress", (int) ((((double) j5) / ((double) j4)) * 100.0d));
                            bundle.putFloat("download_manager_progress_float", f);
                            bundle.putString("download_manager_appid", nh.field_appId);
                            webViewStubCallbackWrapper.f118438d.callback(1007, bundle);
                        }
                    }
                    Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "loadDownloadProgress failed, downloadId = " + j);
                    return;
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskProgressChanged, ex = " + e.getMessage());
            }
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            Log.m105924i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, downloadId = " + j);
            try {
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    Bundle bundle = new Bundle();
                    bundle.putLong("download_manager_downloadid", j);
                    C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
                    bundle.putCharSequence("download_manager_appid", nh != null ? nh.field_appId : "");
                    webViewStubCallbackWrapper.f118438d.callback(1008, bundle);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e.getMessage());
            }
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
            Log.m105924i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = " + j);
            try {
                String a = C6045j1.f22331a.mo7003a(j);
                if (a != null) {
                    ((C46134x) C86312j.m106911c(C46134x.class)).v80(a);
                }
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    Bundle bundle = new Bundle();
                    bundle.putLong("download_manager_downloadid", j);
                    C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
                    bundle.putCharSequence("download_manager_appid", nh != null ? nh.field_appId : "");
                    webViewStubCallbackWrapper.f118438d.callback(1011, bundle);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e.getMessage());
            }
        }

        /* renamed from: S */
        public void mo1800S(long j) {
            Log.m105924i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskPaused, downloadId = " + j);
            try {
                String a = C6045j1.f22331a.mo7003a(j);
                if (a != null) {
                    ((C46134x) C86312j.m106911c(C46134x.class)).mo71591yQ(a);
                }
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    Bundle bundle = new Bundle();
                    bundle.putLong("download_manager_downloadid", j);
                    C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
                    bundle.putCharSequence("download_manager_appid", nh != null ? nh.field_appId : "");
                    webViewStubCallbackWrapper.f118438d.callback(1010, bundle);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e.getMessage());
            }
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            Log.m105924i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, downloadId = " + j);
            try {
                String a = C6045j1.f22331a.mo7003a(j);
                if (a != null) {
                    ((C46134x) C86312j.m106911c(C46134x.class)).mo71580Ac(a);
                }
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    Bundle bundle = new Bundle();
                    bundle.putLong("download_manager_downloadid", j);
                    C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
                    bundle.putCharSequence("download_manager_appid", nh != null ? nh.field_appId : "");
                    bundle.putInt("download_manager_errcode", i);
                    webViewStubCallbackWrapper.f118438d.callback(1003, bundle);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, ex = " + e.getMessage());
            }
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            Log.m105924i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = " + j);
            try {
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    Bundle bundle = new Bundle();
                    bundle.putLong("download_manager_downloadid", j);
                    C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
                    bundle.putCharSequence("download_manager_appid", nh != null ? nh.field_appId : "");
                    webViewStubCallbackWrapper.f118438d.callback(1012, bundle);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + e.getMessage());
            }
        }

        /* renamed from: q */
        public void mo1803q(long j, String str, boolean z) {
            Log.m105924i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, downloadId = " + j);
            try {
                C53352w2 nh = ((C48456t) C86312j.m106911c(C48456t.class)).mo72824nh(j);
                C6045j1 j1Var = C6045j1.f22331a;
                boolean z2 = nh.field_autoInstall;
                Class cls = C46134x.class;
                String a = j1Var.mo7003a(j);
                if (a != null) {
                    ((C46134x) C86312j.m106911c(cls)).Fg0(a);
                    if (z2) {
                        ((C46134x) C86312j.m106911c(cls)).rw0(a);
                    }
                }
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("download_manager_downloadid", j);
                    bundle.putCharSequence("download_manager_appid", nh.field_appId);
                    ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(1002, bundle);
                }
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, ex = " + e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$h */
    public class C43779h implements C96650m {
        public C43779h() {
        }

        /* renamed from: R */
        public void mo68082R(boolean z, int i, int i2, String str, String str2) {
            int i3 = i;
            int i4 = i2;
            String str3 = str;
            String str4 = str2;
            Log.m105925i("MicroMsg.WebViewStubService", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str3, str4);
            if (z) {
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("webview_jssdk_file_item_local_id", str3);
                    bundle.putInt("webview_jssdk_file_item_progreess", i4);
                    Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                    while (it.hasNext()) {
                        ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(2011, bundle);
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.WebViewStubService", "notify upload image failed :%s", e.getMessage());
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 4) {
                        Log.m105921e("MicroMsg.WebViewStubService", "unsupport media type : %d", Integer.valueOf(i));
                    } else if (z) {
                        try {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("webview_jssdk_file_item_local_id", str3);
                            bundle2.putInt("webview_jssdk_file_item_progreess", i4);
                            Iterator it4 = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                            while (it4.hasNext()) {
                                ((WebViewStubCallbackWrapper) it4.next()).f118438d.callback(2010, bundle2);
                            }
                        } catch (Exception e2) {
                            Log.m105921e("MicroMsg.WebViewStubService", "notify upload video failed :%s", e2.getMessage());
                        }
                    }
                } else if (z) {
                    try {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("webview_jssdk_file_item_local_id", str3);
                        bundle3.putInt("webview_jssdk_file_item_progreess", i4);
                        Iterator it5 = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                        while (it5.hasNext()) {
                            ((WebViewStubCallbackWrapper) it5.next()).f118438d.callback(2005, bundle3);
                        }
                    } catch (Exception e3) {
                        Log.m105921e("MicroMsg.WebViewStubService", "notify upload voice failed :%s", e3.getMessage());
                    }
                } else {
                    try {
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("webview_jssdk_file_item_server_id", str4);
                        bundle4.putInt("webview_jssdk_file_item_progreess", i4);
                        Iterator it6 = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                        while (it6.hasNext()) {
                            ((WebViewStubCallbackWrapper) it6.next()).f118438d.callback(2006, bundle4);
                        }
                    } catch (Exception e4) {
                        Log.m105921e("MicroMsg.WebViewStubService", "notify download voice failed :%s", e4.getMessage());
                    }
                }
            } else if (z) {
                try {
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("webview_jssdk_file_item_local_id", str3);
                    bundle5.putInt("webview_jssdk_file_item_progreess", i4);
                    Iterator it7 = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                    while (it7.hasNext()) {
                        ((WebViewStubCallbackWrapper) it7.next()).f118438d.callback(2003, bundle5);
                    }
                } catch (Exception e5) {
                    Log.m105921e("MicroMsg.WebViewStubService", "notify upload image failed :%s", e5.getMessage());
                }
            } else {
                try {
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("webview_jssdk_file_item_server_id", str4);
                    bundle6.putInt("webview_jssdk_file_item_progreess", i4);
                    Iterator it8 = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                    while (it8.hasNext()) {
                        ((WebViewStubCallbackWrapper) it8.next()).f118438d.callback(2004, bundle6);
                    }
                } catch (Exception e6) {
                    Log.m105921e("MicroMsg.WebViewStubService", "notify download image failed :%s", e6.getMessage());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$j */
    public static class C43780j extends C43787d.C43788a {

        /* renamed from: e */
        public int f118297e;

        /* renamed from: f */
        public int f118298f;

        /* renamed from: g */
        public int f118299g;

        /* renamed from: h */
        public String f118300h;

        /* renamed from: i */
        public Bundle f118301i;

        public int Dq0() {
            return this.f118298f;
        }

        public int Xe0() {
            return this.f118299g;
        }

        public Bundle getData() {
            return this.f118301i;
        }

        public String getErrMsg() {
            return this.f118300h;
        }

        public int getType() {
            return this.f118297e;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$a */
    public class C43781a extends C43791l.C43792a {
        public C43781a() {
        }

        /* renamed from: Bk */
        public void mo68088Bk(String str, String str2, int i) {
            C44040v3.m48330a(i).mo7224r6().putString(str, str2);
        }

        public boolean Bq0(String str) {
            C88144b.m109788f(str);
            return true;
        }

        public void C70(String str, boolean z, int i) {
            MsgHandler a = C44040v3.m48330a(i);
            a.getClass();
            if (!Util.isNullOrNil(str)) {
                Log.m105925i("MicroMsg.MsgHandler", "addInvokedJsApiFromMenu, functionName = %s, clear isBusy state", str);
                a.f22712u = false;
                a.f22703j.add(str);
                if (z) {
                    a.f22702i.add(str);
                }
            }
        }

        public boolean Cb0(String str, boolean z, Bundle bundle) {
            return ((C40030e) C15134f0.C15135a.m14248a()).mo62718b(WebViewStubService.this, str, z, (C53145l0) null, bundle);
        }

        public void Cl0(int i, String str, String str2, String str3, int i2, int i3, Bundle bundle) {
            if (str != null) {
                Intent intent = new Intent();
                intent.setClass(MMApplicationContext.getContext(), WebviewScanImageActivity.class);
                intent.setFlags(872415232);
                intent.putExtra("key_string_for_scan", str);
                intent.putExtra("key_string_for_url", str2);
                intent.putExtra("key_string_for_image_url", str3);
                intent.putExtra("key_codetype_for_scan", i2);
                intent.putExtra("key_codeversion_for_scan", i3);
                if (bundle != null) {
                    String string = bundle.getString("preUsername");
                    String string2 = bundle.getString("preChatName");
                    String string3 = bundle.getString("rawUrl");
                    String a = C86493v0.m107223a("WebviewQrCode");
                    int i4 = 1;
                    C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                    c.mo120962i("preUsername", string);
                    c.mo120962i("preChatName", string2);
                    c.mo120962i("url", str2);
                    if (!((C45696d) C86709a0.m107533q(C45696d.class)).B60(str2)) {
                        i4 = 6;
                    }
                    c.mo120962i("Contact_Sub_Scene", Integer.valueOf(i4));
                    c.mo120962i("Contact_Scene_Note", str2);
                    c.mo120962i("rawUrl", string3);
                    intent.putExtra("img_gallery_session_id", a);
                    String string4 = bundle.getString("pre_username");
                    if (string4 != null && C45628s0.m50738C(string4)) {
                        intent.putExtra("key_string_for_from_username", string4);
                    }
                }
                C6107m mVar = null;
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    if (webViewStubCallbackWrapper != null && webViewStubCallbackWrapper.f118439e == i) {
                        mVar = webViewStubCallbackWrapper.f118438d;
                    }
                }
                WebViewStubService$a$$a webViewStubService$a$$a = new WebViewStubService$a$$a(intent);
                if (mVar != null) {
                    C6600v.m6910e(intent.getExtras(), "webview", ".stub.WebviewScanImageActivity", mVar, webViewStubService$a$$a);
                } else {
                    webViewStubService$a$$a.run();
                }
            }
        }

        public String Dj0(String str) {
            C90945m.m114062l(MMApplicationContext.getContext(), str);
            return "";
        }

        /* renamed from: Fu */
        public boolean mo68094Fu() {
            return C86709a0.m107522a();
        }

        /* renamed from: Gm */
        public boolean mo68095Gm(String str) {
            boolean a = C86709a0.m107522a();
            Log.m105924i("MicroMsg.WebViewStubService", "isBizContact, accHasReady = " + a);
            if (!a) {
                return false;
            }
            return C45628s0.m50738C(str);
        }

        /* renamed from: Hz */
        public void mo68096Hz(String str, int i) {
            new Bundle().putInt("webview_binder_id", i);
            WebViewStubService.m47617a(WebViewStubService.this, 5, (Bundle) null, i);
        }

        public boolean Ie0(String str) {
            return C45628s0.m50740E(str);
        }

        /* renamed from: J8 */
        public String mo68098J8(String str, int i) {
            if (i == 1) {
                return C43702g2.m47532e(str);
            }
            if (i != 2) {
                return null;
            }
            return C43702g2.m47531d(str);
        }

        /* renamed from: Kn */
        public void mo68099Kn(String str, int[] iArr, int i, int i2) {
            WebViewStubService webViewStubService = WebViewStubService.this;
            if (webViewStubService.f118268f == null) {
                webViewStubService.f118268f = new HashMap();
                WebViewStubService.this.f118269g.alive();
                WebViewStubService.this.f118270h.alive();
            }
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
            c.mo120962i("key_basescanui_screen_position", Boolean.TRUE);
            c.mo120962i("key_basescanui_screen_x", Float.valueOf((float) i));
            c.mo120962i("key_basescanui_screen_y", Float.valueOf((float) i2));
            RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
            RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
            aVar.f107733b = str;
            aVar.f107732a = System.currentTimeMillis();
            RecogQBarOfImageFileEvent.C40158a aVar2 = recogQBarOfImageFileEvent.f107731d;
            aVar2.f107737f = 2;
            if (iArr != null && iArr.length > 0) {
                aVar2.f107735d = new HashSet();
                for (int valueOf : iArr) {
                    recogQBarOfImageFileEvent.f107731d.f107735d.add(Integer.valueOf(valueOf));
                }
            }
            recogQBarOfImageFileEvent.publish();
            WebViewStubService.this.f118268f.put(str, 1);
        }

        public void Md0(Bundle bundle, int i) {
            WebViewStubService.this.f118266d.put(i, bundle);
        }

        public boolean Ms0() {
            int i;
            try {
                i = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("EnableWebviewScanQRCode"), 1);
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.WebViewStubService", "getIntValFromDynamicConfig parseInt failed, val: EnableWebviewScanQRCode");
                i = 1;
            }
            return i == 1;
        }

        public void Np0(C6107m mVar, int i) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(mVar == null ? -1 : mVar.hashCode());
            objArr[1] = Integer.valueOf(i);
            Log.m105925i("MicroMsg.WebViewStubService", "addCallback, cb.hash = %d, id = %d", objArr);
            ((ArrayList) WebViewStubService.this.f118271i).add(new WebViewStubCallbackWrapper(mVar, i));
            C44040v3.m48330a(i);
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    if (!WebViewStubService.m47618b(WebViewStubService.this, webViewStubCallbackWrapper)) {
                        arrayList.add(webViewStubCallbackWrapper);
                        Log.m105921e("MicroMsg.WebViewStubService", "removeDeadCallBacker %d is dead, may be crash before, just remove it.", Integer.valueOf(webViewStubCallbackWrapper.f118439e));
                    } else {
                        Log.m105919d("MicroMsg.WebViewStubService", "removeDeadCallBacker %d is not dead.", Integer.valueOf(webViewStubCallbackWrapper.f118439e));
                    }
                }
                if (!Util.isNullOrNil((List) arrayList)) {
                    ((ArrayList) WebViewStubService.this.f118271i).remove(arrayList);
                }
            } catch (Exception e) {
                Log.m105925i("MicroMsg.WebViewStubService", "removeDeadCallBacker ex:%s", e.getMessage());
            }
        }

        /* renamed from: Oa */
        public String mo68103Oa() {
            GetJDUrlEvent getJDUrlEvent = new GetJDUrlEvent();
            getJDUrlEvent.publish();
            return getJDUrlEvent.f236214d.f236215a;
        }

        /* renamed from: Ow */
        public void mo68104Ow(int i) {
            Parcelable parcelable;
            MsgHandler a = C44040v3.m48330a(i);
            WebViewStubService webViewStubService = WebViewStubService.this;
            a.getClass();
            Log.m105918d("MicroMsg.MsgHandler", "onWebViewUIResume");
            a.f22711t = false;
            Iterator it = ((ArrayList) C6684b2.f24046a).iterator();
            while (it.hasNext()) {
                C6684b2.C6685a aVar = (C6684b2.C6685a) it.next();
                Log.m105924i("MicroMsg.MsgHandler", "onWebViewUIResume, resume plugin = " + aVar.getName());
                aVar.mo6911c(webViewStubService);
            }
            a.f22673B = false;
            Bundle bundle = a.f22704n;
            if (bundle != null && (parcelable = bundle.getParcelable("KSnsAdTag")) != null && (parcelable instanceof SnsAdClick)) {
                SnsAdClick snsAdClick = (SnsAdClick) parcelable;
                long j = snsAdClick.f267477o;
                if (j > 0) {
                    snsAdClick.f267478p += Util.ticksToNow(j);
                    snsAdClick.f267477o = 0;
                }
            }
        }

        public void Q20(int i, Bundle bundle) {
            EmojiStoreWebViewLogic xx02 = C6080m.xx0();
            xx02.getClass();
            HashMap hashMap = new HashMap();
            for (String next : bundle.keySet()) {
                hashMap.put(next, bundle.get(next));
            }
            if (i != 1) {
                Log.m105929w("MicroMsg.emoji.EmojiStoreWebViewLogic", "unknow action:%d", Integer.valueOf(i));
                return;
            }
            xx02.mo6906c(hashMap);
        }

        /* renamed from: RN */
        public boolean mo68106RN() {
            return C47984k.m53331e();
        }

        /* renamed from: RT */
        public int mo68107RT() {
            return C86709a0.m107523b().mo121110g();
        }

        /* renamed from: RV */
        public boolean mo68108RV(int i, Bundle bundle) {
            int i2 = i;
            Bundle bundle2 = bundle;
            Log.m105925i("MicroMsg.WebViewStubService", "doScene, type = %d", Integer.valueOf(i));
            if (i2 != 233) {
                if (i2 != 666) {
                    if (i2 != 673) {
                        if (i2 != 1295) {
                            if (i2 != 2836) {
                                Log.m105921e("MicroMsg.WebViewStubService", "doScene fail, invalid type = %d", Integer.valueOf(i));
                                return false;
                            } else if (!C86709a0.m107522a()) {
                                Log.m105928w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                                return false;
                            } else {
                                WebViewStubService webViewStubService = WebViewStubService.this;
                                int i3 = WebViewStubService.f118264B;
                                webViewStubService.getClass();
                                String string = bundle2.getString("service_click_tid");
                                long j = bundle2.getLong("service_click_stime", 0);
                                long j2 = bundle2.getLong("service_click_etime", 0);
                                Log.m105925i("MicroMsg.WebViewStubService", "doServiceClick tid = %s, stime = %d, etime = %d", string, Long.valueOf(j), Long.valueOf(j2));
                                if (string == null || string.length() == 0) {
                                    Log.m105920e("MicroMsg.WebViewStubService", "doServiceClick fail, tid is null");
                                    return false;
                                }
                                C47350c.C47352b bVar = new C47350c.C47352b();
                                bVar.f127066a = new C49500g14();
                                bVar.f127067b = new C49642h14();
                                bVar.f127068c = "/cgi-bin/mmoc-bin/ad/service_click";
                                bVar.f127069d = 2836;
                                C47350c a = bVar.mo72403a();
                                C49500g14 g142 = (C49500g14) a.f127055a.f127080a;
                                g142.f133789d = string;
                                g142.f133790e = j;
                                g142.f133791f = j2;
                                C89144l0.m111429e(a, new C43790h(webViewStubService), false);
                                return true;
                            }
                        } else if (!C86709a0.m107522a()) {
                            Log.m105928w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                            return false;
                        } else {
                            Class cls = C9509g.class;
                            if (bundle2 != null) {
                                String string2 = bundle2.getString("ad_report_data_str");
                                Log.m105919d("MicroMsg.WebViewReportUtil", "doReportCgi : %s", string2);
                                if (C86312j.m106911c(cls) != null) {
                                    ((C9509g) C86312j.m106911c(cls)).Bi0(13791, string2, (int) Util.nowSecond());
                                    return true;
                                }
                            }
                            return false;
                        }
                    } else if (!C86709a0.m107522a()) {
                        Log.m105928w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                        return false;
                    } else {
                        C43695a0 a0Var = new C43695a0(bundle2.getString("reading_mode_data_url"), bundle2.getString("reading_mode_data_useragent"), bundle2.getInt("reading_mode_data_width"), bundle2.getInt("reading_mode_data_height"));
                        a0Var.f118076f = Integer.valueOf(bundle2.getInt("webview_binder_id"));
                        return C86709a0.m107524d().mo123461g(a0Var, 0);
                    }
                } else if (!C86709a0.m107522a()) {
                    Log.m105928w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    return false;
                } else {
                    WebViewStubService webViewStubService2 = WebViewStubService.this;
                    int i4 = WebViewStubService.f118264B;
                    webViewStubService2.getClass();
                    C39832j1 pc = ((C54530k0) C86312j.m106911c(C54530k0.class)).mo75394pc(bundle2.getString("emoji_store_jump_url"));
                    pc.setTag(Integer.valueOf(bundle2.getInt("webview_binder_id")));
                    return C86709a0.m107524d().mo123461g((C117747y) pc, 0);
                }
            } else if (!C86709a0.m107522a()) {
                Log.m105928w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                return false;
            } else {
                Class cls2 = C52990d.class;
                String string3 = bundle2.getString("geta8key_data_req_url");
                if (!Util.isNullOrNil(bundle2.getString("k_share_url"))) {
                    C6038i2.m5917a(string3, bundle2.getString("k_share_url"));
                }
                C52991e N60 = !Util.isNullOrNil(string3) ? ((C52990d) C86312j.m106911c(cls2)).N60(string3, bundle2.getString("geta8key_data_username"), bundle2.getInt("geta8key_data_scene"), bundle2.getInt("geta8key_data_reason"), bundle2.getInt("geta8key_data_flag"), bundle2.getString("geta8key_data_net_type"), bundle2.getInt("geta8key_session_id", 0), bundle2.getString("geta8key_data_appid"), bundle2.getString("key_function_id"), bundle2.getInt("key_wallet_region", 0), bundle2.getByteArray("k_a8key_cookie")) : ((C52990d) C86312j.m106911c(cls2)).uk0(bundle2.getString("geta8key_data_appid"), bundle2.getString("geta8key_data_scope"), bundle2.getString("geta8key_data_state"), bundle2.getInt("geta8key_session_id", 0));
                N60.setTag(Integer.valueOf(bundle2.getInt("webview_binder_id")));
                int i5 = bundle2.getInt("geta8key_data_subscene", -1);
                if (i5 > 0) {
                    N60.mo63056J(i5);
                }
                String string4 = bundle2.getString("geta8key_outer_url");
                if (!Util.isNullOrNil(string4)) {
                    N60.mo63081q(string4);
                }
                return C86709a0.m107524d().mo123461g((C117747y) N60, 0);
            }
        }

        /* renamed from: Sk */
        public void mo68109Sk(int i, String str, String str2) {
            WebViewJSSDKUpFileItem webViewJSSDKUpFileItem = new WebViewJSSDKUpFileItem();
            webViewJSSDKUpFileItem.f283037w = i;
            webViewJSSDKUpFileItem.f283038x = str;
            webViewJSSDKUpFileItem.f283024g = str2;
            HashMap<String, List<String>> hashMap = C43702g2.f118107a;
            webViewJSSDKUpFileItem.f283022e = C6032f2.m5914a(str2);
            long nowMilliSecond = Util.nowMilliSecond();
            String str3 = webViewJSSDKUpFileItem.f283022e;
            webViewJSSDKUpFileItem.f283026i = C1297x.m1387b("jsupfile", nowMilliSecond, str3, str3);
            Log.m105919d("MicroMsg.WebViewJSSDKFileItem", "fileType=%d, origFilePath=%s, localId=%s", Integer.valueOf(i), str2, webViewJSSDKUpFileItem.f283022e);
            webViewJSSDKUpFileItem.f283035u = false;
            C6080m.Ax0().mo7009a(webViewJSSDKUpFileItem);
            C6080m.Cx0().mo134803c((String) null, webViewJSSDKUpFileItem.f283022e, 5, 0, 0, (C96651n) null);
        }

        /* renamed from: Sl */
        public boolean mo68110Sl() {
            return !C86709a0.m107523b().mo121115m() || C86718e.m107551r();
        }

        public void Th0(String str) {
            boolean a = C86709a0.m107522a();
            Log.m105924i("MicroMsg.WebViewStubService", "triggerGetContact, accHasReady = " + a);
            WebViewStubService$a$$f webViewStubService$a$$f = new WebViewStubService$a$$f(this, 1000, (Void) null, str);
            if (!a) {
                webViewStubService$a$$f.exec(WebViewStubService.this.f118273n);
            } else {
                webViewStubService$a$$f.exec((MMHandler) null);
            }
        }

        /* renamed from: U0 */
        public boolean mo68112U0(String str) {
            return ((C15132d0) C86312j.m106911c(C15132d0.class)).mo14081U0(str);
        }

        public void U30(int i) {
            Parcelable parcelable;
            MsgHandler a = C44040v3.m48330a(i);
            WebViewStubService webViewStubService = WebViewStubService.this;
            a.getClass();
            Log.m105918d("MicroMsg.MsgHandler", "onWebViewUIPause");
            a.f22711t = true;
            Iterator it = ((ArrayList) C6684b2.f24046a).iterator();
            while (it.hasNext()) {
                C6684b2.C6685a aVar = (C6684b2.C6685a) it.next();
                Log.m105924i("MicroMsg.MsgHandler", "onWebViewUIPause, pause plugin = " + aVar.getName());
                aVar.mo6909a(webViewStubService);
            }
            Bundle bundle = a.f22704n;
            if (bundle != null && (parcelable = bundle.getParcelable("KSnsAdTag")) != null && (parcelable instanceof SnsAdClick)) {
                ((SnsAdClick) parcelable).f267477o = Util.currentTicks();
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.tencent.mm.plugin.webview.modeltools.a0$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: ea3.n$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: boolean} */
        /* JADX WARNING: type inference failed for: r8v0 */
        /* JADX WARNING: type inference failed for: r8v1, types: [com.tencent.mm.plugin.webview.stub.m] */
        /* JADX WARNING: type inference failed for: r8v9 */
        /* JADX WARNING: type inference failed for: r8v10 */
        /* JADX WARNING: type inference failed for: r8v11 */
        /* JADX WARNING: type inference failed for: r8v12 */
        /* JADX WARNING: type inference failed for: r8v18 */
        /* JADX WARNING: type inference failed for: r8v20 */
        /* JADX WARNING: type inference failed for: r8v21 */
        /* JADX WARNING: type inference failed for: r8v22 */
        /* JADX WARNING: type inference failed for: r8v23 */
        /* JADX WARNING: Code restructure failed: missing block: B:312:0x03b8, code lost:
            r8 = r8;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x0563  */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x05ac  */
        /* renamed from: V5 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.os.Bundle mo68114V5(int r24, android.os.Bundle r25) {
            /*
                r23 = this;
                r1 = r23
                r0 = r24
                r2 = r25
                java.lang.String r3 = "reportAdH5Load"
                java.lang.Class<q62.b> r4 = q62.C101048b.class
                java.lang.Class<sp.y> r5 = p237sp.C13754y.class
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
                r7 = 50
                r8 = 0
                if (r0 == r7) goto L_0x08b7
                r7 = 51
                java.lang.String r9 = "MicroMsg.WebViewStubService"
                java.lang.String r10 = ""
                r11 = 0
                if (r0 == r7) goto L_0x08a3
                r7 = 75
                if (r0 == r7) goto L_0x0896
                r7 = 76
                if (r0 == r7) goto L_0x086c
                r7 = 91
                if (r0 == r7) goto L_0x0853
                r7 = 92
                r13 = 3
                if (r0 == r7) goto L_0x082b
                r7 = 250(0xfa, float:3.5E-43)
                if (r0 == r7) goto L_0x0812
                r7 = 251(0xfb, float:3.52E-43)
                if (r0 == r7) goto L_0x07ec
                java.lang.String r7 = "query download task, task id = %d, ret = %d"
                java.lang.String r12 = "download_id"
                r14 = 2
                r15 = 1
                switch(r0) {
                    case 14: goto L_0x015d;
                    case 15: goto L_0x0106;
                    case 16: goto L_0x00d1;
                    case 17: goto L_0x0063;
                    default: goto L_0x0043;
                }
            L_0x0043:
                r5 = -1
                java.lang.String r7 = "WebViewShare_wv_url"
                switch(r0) {
                    case 19: goto L_0x04ec;
                    case 23: goto L_0x04c3;
                    case 71: goto L_0x047f;
                    case 78: goto L_0x0473;
                    case 80: goto L_0x0445;
                    case 83: goto L_0x0438;
                    case 96: goto L_0x03fb;
                    case 129: goto L_0x03a7;
                    case 131: goto L_0x033c;
                    case 204: goto L_0x02be;
                    case 257: goto L_0x027d;
                    case 4006: goto L_0x0226;
                    case 10001: goto L_0x01f0;
                    case 120000: goto L_0x01bc;
                    default: goto L_0x0049;
                }
            L_0x0049:
                java.lang.String r3 = "MicroMsg.MsgHandler"
                java.lang.String r12 = "WebViewShare_BinderID"
                switch(r0) {
                    case 102: goto L_0x0713;
                    case 103: goto L_0x065c;
                    case 104: goto L_0x05d1;
                    case 105: goto L_0x04fc;
                    default: goto L_0x0050;
                }
            L_0x0050:
                switch(r0) {
                    case 108: goto L_0x07e3;
                    case 109: goto L_0x0787;
                    case 110: goto L_0x076e;
                    case 111: goto L_0x0733;
                    case 112: goto L_0x0728;
                    default: goto L_0x0053;
                }
            L_0x0053:
                java.lang.Object[] r2 = new java.lang.Object[r15]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
                r2[r11] = r0
                java.lang.String r0 = "unknown action = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r2)
                goto L_0x086b
            L_0x0063:
                long r2 = r2.getLong(r12)
                di3.d r0 = di3.C86312j.m106911c(r5)
                sp.y r0 = (p237sp.C13754y) r0
                sp.v r0 = r0.Ds0()
                com.tencent.mm.plugin.downloader.model.l r0 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r0
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r0 = r0.mo63966n(r2)
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r3 = "install_result"
                if (r0 != 0) goto L_0x0089
                java.lang.String r0 = "install download task fail, get download task info failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                r2.putBoolean(r3, r11)
                return r2
            L_0x0089:
                int r4 = r0.f12196f
                if (r4 == r13) goto L_0x00a7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "install download task fail, invalid status = "
                r4.append(r5)
                int r0 = r0.f12196f
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                r2.putBoolean(r3, r11)
                return r2
            L_0x00a7:
                java.lang.String r4 = r0.f12197g
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
                if (r4 == 0) goto L_0x00c2
                java.lang.Class<gw.f> r4 = p159gw.C45962f.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                gw.f r4 = (p159gw.C45962f) r4
                com.tencent.mm.plugin.webview.stub.WebViewStubService r5 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.lang.String r0 = r0.f12197g
                r4.go0(r5, r0, r8, r11)
                r2.putBoolean(r3, r15)
                return r2
            L_0x00c2:
                java.lang.Object[] r4 = new java.lang.Object[r15]
                java.lang.String r0 = r0.f12197g
                r4[r11] = r0
                java.lang.String r0 = "file not exists : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r4)
                r2.putBoolean(r3, r11)
                return r2
            L_0x00d1:
                r3 = 0
                long r2 = r2.getLong(r12, r3)
                di3.d r0 = di3.C86312j.m106911c(r5)
                sp.y r0 = (p237sp.C13754y) r0
                sp.v r0 = r0.Ds0()
                com.tencent.mm.plugin.downloader.model.l r0 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r0
                int r0 = r0.mo63970r(r2)
                java.lang.Object[] r4 = new java.lang.Object[r14]
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r4[r11] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r4[r15] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r4)
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                if (r0 <= 0) goto L_0x0100
                r11 = 1
            L_0x0100:
                java.lang.String r0 = "cancel_result"
                r2.putBoolean(r0, r11)
                return r2
            L_0x0106:
                r3 = 0
                long r2 = r2.getLong(r12, r3)
                di3.d r0 = di3.C86312j.m106911c(r5)
                sp.y r0 = (p237sp.C13754y) r0
                sp.v r0 = r0.Ds0()
                com.tencent.mm.plugin.downloader.model.l r0 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r0
                com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r0 = r0.mo63966n(r2)
                java.lang.Object[] r4 = new java.lang.Object[r14]
                if (r0 != 0) goto L_0x0122
                r5 = 1
                goto L_0x0123
            L_0x0122:
                r5 = 0
            L_0x0123:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r4[r11] = r5
                if (r0 != 0) goto L_0x012d
                r5 = 0
                goto L_0x012f
            L_0x012d:
                int r5 = r0.f12196f
            L_0x012f:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r15] = r5
                java.lang.String r5 = "query download task info, info == null ? %b task state = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r4)
                if (r0 == 0) goto L_0x0140
                int r0 = r0.f12196f
                goto L_0x0141
            L_0x0140:
                r0 = 0
            L_0x0141:
                java.lang.Object[] r4 = new java.lang.Object[r14]
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r4[r11] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
                r4[r15] = r2
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r4)
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r3 = "download_state"
                r2.putInt(r3, r0)
                return r2
            L_0x015d:
                if (r2 != 0) goto L_0x0160
                return r8
            L_0x0160:
                java.lang.String r0 = "task_url"
                java.lang.String r0 = r2.getString(r0)
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                java.lang.String r3 = "task_name"
                java.lang.String r2 = r2.getString(r3)
                java.lang.Object[] r3 = new java.lang.Object[r14]
                r3[r11] = r0
                r3[r15] = r2
                java.lang.String r4 = "add download task, taskurl = %s, taskname = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r3)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r3 == 0) goto L_0x0189
                java.lang.String r0 = "download url is null or nil"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                return r8
            L_0x0189:
                com.tencent.mm.plugin.downloader.model.n r3 = new com.tencent.mm.plugin.downloader.model.n
                r3.<init>(r8)
                r3.f110176a = r0
                r3.f110179d = r2
                r3.f110184i = r15
                r3.f110181f = r15
                di3.d r0 = di3.C86312j.m106911c(r5)
                sp.y r0 = (p237sp.C13754y) r0
                sp.v r0 = r0.Ds0()
                com.tencent.mm.plugin.downloader.model.l r0 = (com.tencent.p014mm.plugin.downloader.model.C40935l) r0
                long r2 = r0.mo63956b(r3)
                java.lang.Object[] r0 = new java.lang.Object[r15]
                java.lang.Long r4 = java.lang.Long.valueOf(r2)
                r0[r11] = r4
                java.lang.String r4 = "add download task, downloadId = %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r0)
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r0.putLong(r12, r2)
                return r0
            L_0x01bc:
                if (r2 != 0) goto L_0x01c4
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                goto L_0x01c5
            L_0x01c4:
                r0 = r2
            L_0x01c5:
                f40.o r2 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01db }
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()     // Catch:{ Exception -> 0x01db }
                r3 = 274528(0x43060, float:3.84696E-40)
                java.lang.Object r2 = r2.mo119684e(r3, r10)     // Catch:{ Exception -> 0x01db }
                boolean r3 = r2 instanceof java.lang.String     // Catch:{ Exception -> 0x01db }
                if (r3 == 0) goto L_0x01db
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01db }
                goto L_0x01dc
            L_0x01db:
                r2 = r10
            L_0x01dc:
                java.lang.String r3 = "default_browser_package_name"
                r0.putString(r3, r2)
                java.lang.String r2 = r0.getString(r7, r10)
                java.lang.String r2 = com.tencent.p014mm.plugin.webview.model.C6038i2.m5918b(r2)
                java.lang.String r3 = "k_share_url"
                r0.putString(r3, r2)
                return r0
            L_0x01f0:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "kwid_"
                r0.append(r2)
                f40.e r2 = f40.C86709a0.m107523b()
                int r2 = r2.mo121110g()
                r0.append(r2)
                java.lang.String r2 = "_"
                r0.append(r2)
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                kb0.C9575d.f29814a = r0
                java.lang.Object[] r2 = new java.lang.Object[r15]
                r2[r11] = r0
                java.lang.String r0 = "MicroMsg.AppBrandReporter"
                java.lang.String r3 = "refreshWeAppSearchKeywordId : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r0, r3, r2)
                goto L_0x086b
            L_0x0226:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                android.content.SharedPreferences r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getToolsProcesstPreference()
                java.lang.String r3 = "nfc_open_url"
                java.lang.String r2 = r2.getString(r3, r8)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "nfc url="
                r3.append(r4)
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r3 != 0) goto L_0x0265
                java.lang.String r3 = r2.trim()
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 == 0) goto L_0x0260
                goto L_0x0265
            L_0x0260:
                java.lang.String r3 = "debugConfig"
                r0.putString(r3, r2)
            L_0x0265:
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NFC_CPU_CARD_CONFIG_STRING
                java.lang.Object r2 = r2.mo119685f(r3, r8)
                java.lang.String r2 = java.lang.String.valueOf(r2)
                java.lang.String r3 = "config"
                r0.putString(r3, r2)
                return r0
            L_0x027d:
                if (r2 != 0) goto L_0x0282
                android.os.Bundle r0 = android.os.Bundle.EMPTY
                return r0
            L_0x0282:
                java.lang.String r0 = "bizType"
                int r0 = r2.getInt(r0)
                java.lang.String r3 = "bizKey"
                java.lang.String r2 = r2.getString(r3)
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                java.lang.Class<ky2.i> r3 = ky2.C10432i.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                ky2.i r3 = (ky2.C10432i) r3
                boolean r3 = r3.mo10738JD(r0, r2)
                android.os.Bundle r4 = new android.os.Bundle
                r4.<init>()
                java.lang.String r5 = "authorized"
                r4.putBoolean(r5, r3)
                java.lang.Object[] r5 = new java.lang.Object[r13]
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r5[r11] = r0
                r5[r15] = r2
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                r5[r14] = r0
                java.lang.String r0 = "hasAuthorization:bizType=%d, bizKey = %s, authorized = %b"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r5)
                return r4
            L_0x02be:
                if (r2 != 0) goto L_0x02c1
                return r8
            L_0x02c1:
                java.lang.Class<com.tencent.mm.plugin.webview.stub.WebViewStubService$a> r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a.class
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ Exception -> 0x032b }
                r2.setClassLoader(r0)     // Catch:{ Exception -> 0x032b }
                java.util.ArrayList r0 = r2.getStringArrayList(r3)     // Catch:{ Exception -> 0x032b }
                if (r0 == 0) goto L_0x086b
                java.util.ArrayList r0 = r2.getStringArrayList(r3)     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.autogen.events.ReportAdH5LoadEvent r3 = new com.tencent.mm.autogen.events.ReportAdH5LoadEvent     // Catch:{ Exception -> 0x032b }
                r3.<init>()     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.autogen.events.ReportAdH5LoadEvent$a r4 = r3.f107740d     // Catch:{ Exception -> 0x032b }
                java.lang.String r5 = "snsAdClick"
                android.os.Parcelable r5 = r2.getParcelable(r5)     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.modelsns.SnsAdClick r5 = (com.tencent.p014mm.modelsns.SnsAdClick) r5     // Catch:{ Exception -> 0x032b }
                r4.f107741a = r5     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.autogen.events.ReportAdH5LoadEvent$a r4 = r3.f107740d     // Catch:{ Exception -> 0x032b }
                java.lang.Object r5 = r0.get(r11)     // Catch:{ Exception -> 0x032b }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x032b }
                java.lang.String r7 = "UTF-8"
                java.lang.String r5 = p206nj.C117627q.m165909b(r5, r7)     // Catch:{ Exception -> 0x032b }
                r4.f107742b = r5     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.autogen.events.ReportAdH5LoadEvent$a r4 = r3.f107740d     // Catch:{ Exception -> 0x032b }
                java.lang.Object r5 = r0.get(r15)     // Catch:{ Exception -> 0x032b }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x032b }
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)     // Catch:{ Exception -> 0x032b }
                r4.f107744d = r5     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.autogen.events.ReportAdH5LoadEvent$a r4 = r3.f107740d     // Catch:{ Exception -> 0x032b }
                java.lang.Object r5 = r0.get(r14)     // Catch:{ Exception -> 0x032b }
                java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x032b }
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r5)     // Catch:{ Exception -> 0x032b }
                r4.f107745e = r7     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.autogen.events.ReportAdH5LoadEvent$a r4 = r3.f107740d     // Catch:{ Exception -> 0x032b }
                java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x032b }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x032b }
                r4.f107746f = r0     // Catch:{ Exception -> 0x032b }
                com.tencent.mm.autogen.events.ReportAdH5LoadEvent$a r0 = r3.f107740d     // Catch:{ Exception -> 0x032b }
                java.lang.String r4 = "errCode"
                int r2 = r2.getInt(r4, r11)     // Catch:{ Exception -> 0x032b }
                r0.f107743c = r2     // Catch:{ Exception -> 0x032b }
                r3.publish()     // Catch:{ Exception -> 0x032b }
                goto L_0x086b
            L_0x032b:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r15]
                java.lang.String r0 = r0.getMessage()
                r2[r11] = r0
                java.lang.String r0 = "report sns ad exception, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r2)
                goto L_0x086b
            L_0x033c:
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.String r3 = "logString"
                java.lang.String r2 = r2.getString(r3)
                r0.put(r3, r2)
                u73.m r2 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.m5948g9()
                com.tencent.mm.plugin.websearch.FTSWebViewLogic r2 = (com.tencent.p014mm.plugin.websearch.FTSWebViewLogic) r2
                r2.getClass()
                java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46982f(r0, r3)
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                java.lang.String r7 = "h5version="
                boolean r7 = r4.contains(r7)
                if (r7 != 0) goto L_0x0372
                int r7 = com.tencent.p014mm.plugin.websearch.C43471q.m46977a(r11)
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                java.lang.String r8 = "h5version"
                r5.put(r8, r7)
            L_0x0372:
                java.util.Set r7 = r5.keySet()
                int r7 = r7.size()
                if (r7 <= 0) goto L_0x039f
                int r7 = r4.length()
                if (r7 <= 0) goto L_0x039b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r4)
                java.lang.String r4 = "&"
                r7.append(r4)
                java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46987k(r5)
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                goto L_0x039f
            L_0x039b:
                java.lang.String r4 = com.tencent.p014mm.plugin.websearch.C43471q.m46987k(r5)
            L_0x039f:
                r0.put(r3, r4)
                r2.mo134665j(r0)
                goto L_0x086b
            L_0x03a7:
                java.lang.String r0 = "webview_instance_id"
                int r3 = r2.getInt(r0)
                com.tencent.mm.plugin.webview.stub.WebViewStubService r4 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r4 = r4.f118271i
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.util.Iterator r4 = r4.iterator()
            L_0x03b8:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x03cd
                java.lang.Object r5 = r4.next()
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper r5 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper) r5
                if (r5 == 0) goto L_0x03b8
                int r7 = r5.f118439e
                if (r7 != r3) goto L_0x03b8
                com.tencent.mm.plugin.webview.stub.m r8 = r5.f118438d
                goto L_0x03b8
            L_0x03cd:
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r3)
                com.tencent.mm.plugin.webview.stub.WebViewStubService r5 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                r4.mo7175R6(r5, r8)
                java.util.HashMap r4 = new java.util.HashMap
                r4.<init>()
                java.lang.String r5 = "scene"
                int r2 = r2.getInt(r5)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4.put(r5, r2)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r4.put(r0, r2)
                u73.m r0 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.m5948g9()
                com.tencent.mm.plugin.websearch.FTSWebViewLogic r0 = (com.tencent.p014mm.plugin.websearch.FTSWebViewLogic) r0
                r0.mo134660e(r4)
                goto L_0x086b
            L_0x03fb:
                if (r2 != 0) goto L_0x03fe
                return r8
            L_0x03fe:
                java.util.Set r0 = r25.keySet()
                if (r0 != 0) goto L_0x0405
                return r8
            L_0x0405:
                org.json.JSONObject r3 = new org.json.JSONObject
                r3.<init>()
                java.util.Iterator r0 = r0.iterator()     // Catch:{ JSONException -> 0x0437 }
            L_0x040e:
                boolean r4 = r0.hasNext()     // Catch:{ JSONException -> 0x0437 }
                if (r4 == 0) goto L_0x0422
                java.lang.Object r4 = r0.next()     // Catch:{ JSONException -> 0x0437 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x0437 }
                java.lang.Object r5 = r2.get(r4)     // Catch:{ JSONException -> 0x0437 }
                r3.put(r4, r5)     // Catch:{ JSONException -> 0x0437 }
                goto L_0x040e
            L_0x0422:
                com.tencent.mm.autogen.events.GameCommOperationEvent r0 = new com.tencent.mm.autogen.events.GameCommOperationEvent
                r0.<init>()
                com.tencent.mm.autogen.events.GameCommOperationEvent$a r2 = r0.f9268d
                r4 = 4
                r2.f9270a = r4
                java.lang.String r3 = r3.toString()
                r2.f9271b = r3
                r0.publish()
                goto L_0x086b
            L_0x0437:
                return r8
            L_0x0438:
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.lang.String r3 = "screen_orientation"
                int r2 = r2.getInt(r3, r5)
                r0.f118282w = r2
                goto L_0x086b
            L_0x0445:
                if (r2 != 0) goto L_0x0448
                return r8
            L_0x0448:
                java.lang.String r0 = "KAppId"
                java.lang.String r0 = r2.getString(r0)
                java.lang.String r3 = "shortcut_user_name"
                java.lang.String r3 = r2.getString(r3)
                java.lang.String r4 = "webviewui_binder_id"
                int r4 = r2.getInt(r4)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x0472
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r0 == 0) goto L_0x0469
                goto L_0x0472
            L_0x0469:
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                r3 = 10
                com.tencent.p014mm.plugin.webview.stub.WebViewStubService.m47617a(r0, r3, r2, r4)
                goto L_0x086b
            L_0x0472:
                return r8
            L_0x0473:
                boolean r0 = eb0.C75592q0.m90755C()
                java.lang.String r2 = "isOpenForFaceBook"
                r6.putBoolean(r2, r0)
                goto L_0x086b
            L_0x047f:
                if (r2 != 0) goto L_0x0482
                return r8
            L_0x0482:
                java.lang.String r0 = "enterprise_action"
                java.lang.String r0 = r2.getString(r0)
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r3 = "enterprise_has_connector"
                boolean r4 = r0.equals(r3)
                if (r4 == 0) goto L_0x04a8
                rb0.j r0 = rb0.C48009v0.Fx0()
                java.util.List r0 = r0.mo72754LL()
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x04a4
                r11 = 1
            L_0x04a4:
                r2.putBoolean(r3, r11)
                goto L_0x04c2
            L_0x04a8:
                java.lang.String r3 = "enterprise_connectors"
                boolean r0 = r0.equals(r3)
                if (r0 == 0) goto L_0x04c2
                rb0.j r0 = rb0.C48009v0.Fx0()
                java.util.List r0 = r0.mo72754LL()
                if (r0 == 0) goto L_0x04c2
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r0)
                r2.putStringArrayList(r3, r4)
            L_0x04c2:
                return r2
            L_0x04c3:
                boolean r0 = f40.C86709a0.m107522a()
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$h r2 = new com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$h
                r3 = 1000(0x3e8, double:4.94E-321)
                r2.<init>(r1, r3, r8)
                if (r0 != 0) goto L_0x04db
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f118273n
                java.lang.Object r0 = r2.exec(r0)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x04e1
            L_0x04db:
                java.lang.Object r0 = r2.exec(r8)
                java.lang.String r0 = (java.lang.String) r0
            L_0x04e1:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r3 = "config_info_username"
                r2.putString(r3, r0)
                return r2
            L_0x04ec:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                com.tencent.mm.plugin.webview.model.b2 r2 = com.tencent.p014mm.plugin.webview.model.C6026b2.f22273c
                boolean r2 = r2.f22275b
                java.lang.String r3 = "webview_video_proxy_init"
                r0.putBoolean(r3, r2)
                return r0
            L_0x04fc:
                if (r2 != 0) goto L_0x0504
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                return r0
            L_0x0504:
                int r0 = r2.getInt(r12)
                java.lang.String r4 = "WebViewShare_type"
                int r4 = r2.getInt(r4)
                android.os.Bundle r5 = new android.os.Bundle
                r5.<init>()
                java.lang.String r6 = r2.getString(r7, r10)
                java.lang.String r7 = "WebViewShare_commit_url"
                java.lang.String r2 = r2.getString(r7, r10)
                java.lang.String r7 = "WebViewShare_reslut"
                if (r4 != r15) goto L_0x0568
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r0)
                com.tencent.mm.plugin.webview.modeltools.a0 r4 = r0.f22676E
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r9 = r4.f22385a
                boolean r9 = r9.containsKey(r6)
                if (r9 == 0) goto L_0x0539
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r4 = r4.f22385a
                java.lang.Object r4 = r4.get(r6)
                if (r4 == 0) goto L_0x0539
                r4 = 1
                goto L_0x053a
            L_0x0539:
                r4 = 0
            L_0x053a:
                if (r4 != 0) goto L_0x0556
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r4 != 0) goto L_0x0561
                java.lang.Object[] r4 = new java.lang.Object[r15]
                r4[r11] = r2
                java.lang.String r6 = "getAppMsgData use commitUrl %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r4)
                com.tencent.mm.plugin.webview.modeltools.a0 r0 = r0.f22676E
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r0 = r0.f22385a
                java.lang.Object r0 = r0.get(r2)
                com.tencent.mm.plugin.webview.modeltools.a0$a r0 = (com.tencent.p014mm.plugin.webview.modeltools.C6076a0.C6077a) r0
                goto L_0x0560
            L_0x0556:
                com.tencent.mm.plugin.webview.modeltools.a0 r0 = r0.f22676E
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r0 = r0.f22385a
                java.lang.Object r0 = r0.get(r6)
                com.tencent.mm.plugin.webview.modeltools.a0$a r0 = (com.tencent.p014mm.plugin.webview.modeltools.C6076a0.C6077a) r0
            L_0x0560:
                r8 = r0
            L_0x0561:
                if (r8 == 0) goto L_0x0564
                r11 = 1
            L_0x0564:
                r5.putBoolean(r7, r11)
                goto L_0x05b0
            L_0x0568:
                if (r4 != r14) goto L_0x05b0
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r0)
                com.tencent.mm.plugin.webview.modeltools.a0 r4 = r0.f22676E
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r9 = r4.f22386b
                boolean r9 = r9.containsKey(r6)
                if (r9 == 0) goto L_0x0582
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r4 = r4.f22386b
                java.lang.Object r4 = r4.get(r6)
                if (r4 == 0) goto L_0x0582
                r4 = 1
                goto L_0x0583
            L_0x0582:
                r4 = 0
            L_0x0583:
                if (r4 != 0) goto L_0x059f
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r4 != 0) goto L_0x05aa
                java.lang.Object[] r4 = new java.lang.Object[r15]
                r4[r11] = r2
                java.lang.String r6 = "getTimeLineData use commitUrl %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r6, r4)
                com.tencent.mm.plugin.webview.modeltools.a0 r0 = r0.f22676E
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r0 = r0.f22386b
                java.lang.Object r0 = r0.get(r2)
                com.tencent.mm.plugin.webview.modeltools.a0$a r0 = (com.tencent.p014mm.plugin.webview.modeltools.C6076a0.C6077a) r0
                goto L_0x05a9
            L_0x059f:
                com.tencent.mm.plugin.webview.modeltools.a0 r0 = r0.f22676E
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.modeltools.a0$a> r0 = r0.f22386b
                java.lang.Object r0 = r0.get(r6)
                com.tencent.mm.plugin.webview.modeltools.a0$a r0 = (com.tencent.p014mm.plugin.webview.modeltools.C6076a0.C6077a) r0
            L_0x05a9:
                r8 = r0
            L_0x05aa:
                if (r8 == 0) goto L_0x05ad
                r11 = 1
            L_0x05ad:
                r5.putBoolean(r7, r11)
            L_0x05b0:
                if (r8 == 0) goto L_0x05d0
                java.lang.String r0 = r8.f22390b
                java.lang.String r2 = "link"
                r5.putString(r2, r0)
                java.lang.String r0 = r8.f22389a
                java.lang.String r2 = "title"
                r5.putString(r2, r0)
                java.lang.String r0 = r8.f22391c
                java.lang.String r2 = "desc"
                r5.putString(r2, r0)
                java.lang.String r0 = r8.f22392d
                java.lang.String r2 = "img_url"
                r5.putString(r2, r0)
            L_0x05d0:
                return r5
            L_0x05d1:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "query"
                java.lang.String r3 = r2.getString(r3)
                java.lang.String r4 = "searchId"
                java.lang.String r4 = r2.getString(r4)
                java.lang.String r5 = "extQueryInfo"
                java.lang.String r2 = r2.getString(r5)
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r6 == 0) goto L_0x05f1
                goto L_0x0655
            L_0x05f1:
                r6 = 17
                java.lang.Class<vr.e> r7 = p255vr.C65873e.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                vr.e r7 = (p255vr.C65873e) r7
                java.lang.String r20 = r7.ep0(r6)
                java.util.HashMap r6 = new java.util.HashMap
                r6.<init>()
                if (r4 == 0) goto L_0x0628
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "18:"
                r7.append(r8)
                r7.append(r4)
                java.lang.String r4 = ":"
                r7.append(r4)
                r7.append(r3)
                r7.append(r4)
                java.lang.String r8 = r7.toString()
                java.lang.String r4 = "parentSearchID"
                r6.put(r4, r8)
            L_0x0628:
                if (r8 == 0) goto L_0x0635
                eb0.v0 r4 = eb0.C86493v0.m107224d()
                eb0.v0$c r4 = r4.mo120947c(r8, r15)
                r4.mo120962i(r5, r2)
            L_0x0635:
                java.lang.String r2 = "clickType"
                java.lang.String r4 = "18"
                r6.put(r2, r4)
                java.lang.Class<u73.p> r2 = u73.C101982p.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                r16 = r2
                u73.p r16 = (u73.C101982p) r16
                android.content.Context r17 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r21 = 1
                r18 = 17
                r19 = r3
                r22 = r6
                r16.z30(r17, r18, r19, r20, r21, r22)
            L_0x0655:
                java.lang.String r2 = "open_result"
                r0.putBoolean(r2, r11)
                return r0
            L_0x065c:
                java.lang.String r0 = "key_action"
                int r0 = r2.getInt(r0, r5)
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                f40.e r4 = f40.C86709a0.m107523b()
                boolean r4 = r4.mo121114l()
                java.lang.String r5 = "MicroMsg.WebViewUIBagHelper"
                if (r4 != 0) goto L_0x067b
                java.lang.String r0 = "MM doBagLogic not ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
                goto L_0x0712
            L_0x067b:
                r4 = 9
                if (r4 == r0) goto L_0x068c
                java.lang.Object[] r4 = new java.lang.Object[r15]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                r4[r11] = r6
                java.lang.String r6 = "MM doBagLogic action:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)
            L_0x068c:
                java.lang.String r4 = "MicroMsg.WebViewBagMgr"
                r5 = 5
                if (r0 == r5) goto L_0x06f6
                r5 = 6
                if (r0 == r5) goto L_0x06f6
                r5 = 7
                if (r0 == r5) goto L_0x06bb
                r4 = 8
                if (r0 == r4) goto L_0x06a4
                l93.h r4 = new l93.h
                r4.<init>(r0, r2)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r4)
                goto L_0x0712
            L_0x06a4:
                com.tencent.mm.plugin.webview.ui.tools.bag.c r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96657c.INSTANCE
                r0.getClass()
                android.graphics.Point r2 = new android.graphics.Point
                com.tencent.mm.plugin.webview.ui.tools.bag.c$d r0 = r0.f283102h
                int r4 = r0.f283111e
                int r0 = r0.f283110d
                r2.<init>(r4, r0)
                java.lang.String r0 = "key_current_bag_pos"
                r3.putParcelable(r0, r2)
                goto L_0x0712
            L_0x06bb:
                java.lang.String r0 = "key_bag_id"
                java.lang.String r0 = r2.getString(r0)
                com.tencent.mm.plugin.webview.ui.tools.bag.c r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96657c.INSTANCE
                r2.getClass()
                java.lang.Object[] r5 = new java.lang.Object[r14]
                r5[r11] = r0
                com.tencent.mm.plugin.webview.ui.tools.bag.c$d r6 = r2.f283102h
                java.lang.String r6 = r6.f283107a
                r5[r15] = r6
                java.lang.String r6 = "hasBagOfThePage targetId:%s currentId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
                com.tencent.mm.plugin.webview.ui.tools.bag.c$d r4 = r2.f283102h
                java.lang.String r4 = r4.f283108b
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x06ef
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
                com.tencent.mm.plugin.webview.ui.tools.bag.c$d r2 = r2.f283102h
                java.lang.String r2 = r2.f283107a
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x06ef
                r11 = 1
            L_0x06ef:
                java.lang.String r0 = "key_has_bag"
                r3.putBoolean(r0, r11)
                goto L_0x0712
            L_0x06f6:
                com.tencent.mm.plugin.webview.ui.tools.bag.c r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.bag.C96657c.INSTANCE
                java.lang.String r5 = "key_in_webviewui_from_bag"
                boolean r2 = r2.getBoolean(r5, r11)
                r0.getClass()
                java.lang.Object[] r5 = new java.lang.Object[r15]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
                r5[r11] = r6
                java.lang.String r6 = "markInWebViewUIFromBag inWebViewUIFromBag:%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
                r0.f283100f = r2
            L_0x0712:
                return r3
            L_0x0713:
                if (r2 != 0) goto L_0x0716
                return r8
            L_0x0716:
                java.lang.String r0 = "enterprise_biz_username"
                java.lang.String r0 = r2.getString(r0)
                boolean r0 = rb0.C47984k.m53338l(r0)
                java.lang.String r2 = "is_enterprise_username"
                r6.putBoolean(r2, r0)
                goto L_0x086b
            L_0x0728:
                java.lang.String r0 = p156gj.C87203t.m108276l()
                java.lang.String r2 = "oaid"
                r6.putString(r2, r0)
                return r6
            L_0x0733:
                int r0 = r2.getInt(r12)
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r0)
                r0.getClass()
                java.lang.String r4 = "function"
                java.lang.String r4 = r2.getString(r4, r10)
                java.lang.Object[] r5 = new java.lang.Object[r15]
                r5[r11] = r4
                java.lang.String r6 = "onWebViewUITipsDialogCancel %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r6, r5)
                java.lang.String r3 = "profile"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x076d
                eb0.w2 r3 = eb0.C31519v2.m39436a()
                java.lang.String r4 = "username"
                java.lang.String r2 = r2.getString(r4, r10)
                r3.mo55989f(r2)
                t83.h1 r2 = r0.f22698e
                java.lang.String r3 = "profile:cancel"
                r0.mo7210k5(r2, r3, r8)
            L_0x076d:
                return r8
            L_0x076e:
                di3.d r0 = di3.C86312j.m106911c(r4)
                if (r0 == 0) goto L_0x0780
                di3.d r0 = di3.C86312j.m106911c(r4)
                q62.b r0 = (q62.C101048b) r0
                r2 = 16
                int r11 = r0.mo60590Os(r2)
            L_0x0780:
                java.lang.String r0 = "sim_card_type"
                r6.putInt(r0, r11)
                return r6
            L_0x0787:
                if (r2 != 0) goto L_0x078f
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                return r0
            L_0x078f:
                int r0 = r2.getInt(r12)
                java.lang.String r2 = r2.getString(r7, r10)
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r0)
                r0.getClass()
                java.lang.String r2 = com.tencent.p014mm.pluginsdk.p133ui.tools.C6686h2.m6989a(r2)
                ea3.n r3 = r0.f22677F
                java.util.HashMap<java.lang.String, ea3.n$a> r4 = r3.f25902a
                boolean r4 = r4.containsKey(r2)
                if (r4 == 0) goto L_0x07b5
                java.util.HashMap<java.lang.String, ea3.n$a> r3 = r3.f25902a
                java.lang.Object r3 = r3.get(r2)
                if (r3 == 0) goto L_0x07b5
                r11 = 1
            L_0x07b5:
                if (r11 != 0) goto L_0x07b8
                goto L_0x07c3
            L_0x07b8:
                ea3.n r0 = r0.f22677F
                java.util.HashMap<java.lang.String, ea3.n$a> r0 = r0.f25902a
                java.lang.Object r0 = r0.get(r2)
                r8 = r0
                ea3.n$a r8 = (ea3.C7619n.C7620a) r8
            L_0x07c3:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                if (r8 == 0) goto L_0x07e2
                int r2 = r8.f25903a
                java.lang.String r3 = "key_hao_kan_permission"
                r0.putInt(r3, r2)
                int r2 = r8.f25904b
                java.lang.String r3 = "key_hao_kan_recommand"
                r0.putInt(r3, r2)
                java.lang.String r2 = r8.f25905c
                java.lang.String r3 = "key_hao_kan_title"
                r0.putString(r3, r2)
            L_0x07e2:
                return r0
            L_0x07e3:
                com.tencent.mm.autogen.events.CloseImagePreviewEvent r0 = new com.tencent.mm.autogen.events.CloseImagePreviewEvent
                r0.<init>()
                r0.publish()
                return r8
            L_0x07ec:
                if (r2 != 0) goto L_0x07ef
                return r8
            L_0x07ef:
                java.lang.String r0 = "key_activity_browse_time"
                r3 = 0
                long r2 = r2.getLong(r0, r3)
                com.tencent.mm.modelstat.i r0 = com.tencent.p014mm.modelstat.C81030i.m98944a()
                java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.WebViewUI> r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI.class
                java.lang.String r4 = r4.getName()
                sg.g<java.lang.String, java.lang.Long> r5 = r0.f238010a
                if (r5 == 0) goto L_0x086b
                r0.f238011b = r4
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                q90.d r5 = (q90.C101062d) r5
                r5.put(r4, r0)
                goto L_0x086b
            L_0x0812:
                if (r2 != 0) goto L_0x0815
                return r8
            L_0x0815:
                java.lang.Class<ru.m> r0 = p680ru.C36492m.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x0821 }
                ru.m r0 = (p680ru.C36492m) r0     // Catch:{ Exception -> 0x0821 }
                r0.qp0(r2)     // Catch:{ Exception -> 0x0821 }
                goto L_0x086b
            L_0x0821:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r11]
                java.lang.String r3 = "webview call back mm error"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r3, r2)
                goto L_0x086b
            L_0x082b:
                if (r2 != 0) goto L_0x082e
                return r8
            L_0x082e:
                java.lang.String r0 = "game_hv_menu_appid"
                java.lang.String r0 = r2.getString(r0)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 == 0) goto L_0x083b
                return r8
            L_0x083b:
                com.tencent.mm.autogen.events.GameCommOperationEvent r2 = new com.tencent.mm.autogen.events.GameCommOperationEvent
                r2.<init>()
                com.tencent.mm.autogen.events.GameCommOperationEvent$a r3 = r2.f9268d
                r3.f9270a = r13
                r3.f9271b = r0
                r2.publish()
                com.tencent.mm.autogen.events.GameCommOperationEvent$b r0 = r2.f9269e
                java.lang.String r0 = r0.f9273a
                java.lang.String r2 = "game_hv_menu_pbcache"
                r6.putString(r2, r0)
                goto L_0x086b
            L_0x0853:
                if (r2 != 0) goto L_0x0856
                return r8
            L_0x0856:
                java.lang.String r0 = "game_sourceScene"
                int r0 = r2.getInt(r0)
                com.tencent.mm.autogen.events.GameCenterOperationEvent r2 = new com.tencent.mm.autogen.events.GameCenterOperationEvent
                r2.<init>()
                com.tencent.mm.autogen.events.GameCenterOperationEvent$a r3 = r2.f107543d
                r4 = 5
                r3.f107544a = r4
                r3.f107549f = r0
                r2.publish()
            L_0x086b:
                return r6
            L_0x086c:
                if (r2 != 0) goto L_0x0871
                android.os.Bundle r0 = android.os.Bundle.EMPTY
                return r0
            L_0x0871:
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r3 = "webview_binder_id"
                int r3 = r2.getInt(r3)
                java.lang.String r4 = "rawUrl"
                java.lang.String r2 = r2.getString(r4)
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r2)
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r3)
                java.lang.String r2 = r3.mo7209j6(r2)
                java.lang.String r3 = "appId"
                r0.putString(r3, r2)
                return r0
            L_0x0896:
                com.tencent.mm.plugin.webview.model.b2 r0 = com.tencent.p014mm.plugin.webview.model.C6026b2.f22273c
                boolean r2 = r0.f22275b
                if (r2 == 0) goto L_0x08a2
                r0.f22274a = r8
                com.tencent.p014mm.plugin.webview.model.C6026b2.f22273c = r8
                r0.f22275b = r11
            L_0x08a2:
                return r8
            L_0x08a3:
                zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ Exception -> 0x08b0 }
                com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$g r2 = new com.tencent.mm.plugin.webview.stub.WebViewStubService$a$$g     // Catch:{ Exception -> 0x08b0 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x08b0 }
                zt3.j r0 = (zt3.C119157j) r0     // Catch:{ Exception -> 0x08b0 }
                r0.mo183875f(r2)     // Catch:{ Exception -> 0x08b0 }
                goto L_0x08b6
            L_0x08b0:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r11]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r2)
            L_0x08b6:
                return r8
            L_0x08b7:
                if (r2 != 0) goto L_0x08ba
                return r8
            L_0x08ba:
                java.lang.String r0 = "data"
                java.lang.String r0 = r2.getString(r0)
                if (r0 != 0) goto L_0x08c3
                return r8
            L_0x08c3:
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                ug.c r0 = rb0.C47984k.m53328b(r0)
                int r0 = r0.field_type
                java.lang.String r3 = "key_biz_type"
                r2.putInt(r3, r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a.mo68114V5(int, android.os.Bundle):android.os.Bundle");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper} */
        /* JADX WARNING: type inference failed for: r11v3 */
        /* JADX WARNING: type inference failed for: r11v4, types: [com.tencent.mm.plugin.webview.stub.m] */
        /* JADX WARNING: type inference failed for: r11v18 */
        /* JADX WARNING: type inference failed for: r11v21 */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0079, code lost:
            r11 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x014f, code lost:
            r11 = r11;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0106  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean V50(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.os.Bundle r11, android.os.Bundle r12, int r13) {
            /*
                r7 = this;
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                int r1 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.f118264B
                r0.getClass()
                java.lang.String r0 = "MicroMsg.WebViewStubService"
                r1 = 0
                r2 = 1
                if (r9 != 0) goto L_0x0013
                java.lang.String r3 = "doInActivity fail, function null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
                goto L_0x0029
            L_0x0013:
                qe3.c$h r3 = qe3.C25549c.m33051b(r9)
                if (r3 != 0) goto L_0x0023
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r3[r1] = r9
                java.lang.String r4 = "doInActivity fail, func null, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r3)
                goto L_0x0029
            L_0x0023:
                boolean r3 = r3.f35271d
                if (r3 == 0) goto L_0x0029
                r3 = 1
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "handleMsg, function = "
                r4.append(r5)
                r4.append(r9)
                java.lang.String r5 = ", doInActivity = "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                com.tencent.mm.protocal.JsapiPermissionWrapper r4 = new com.tencent.mm.protocal.JsapiPermissionWrapper
                r4.<init>()
                r4.mo69440b(r11)
                java.lang.String r11 = "wcPrivacyPolicyResult"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x006c
                com.tencent.mm.plugin.webview.stub.WebViewStubService r11 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                android.util.SparseArray<android.os.Bundle> r11 = r11.f118266d
                java.lang.Object r11 = r11.get(r13)
                android.os.Bundle r11 = (android.os.Bundle) r11
                if (r11 == 0) goto L_0x006c
                java.lang.String r5 = "KInitialParam_Force_wcPrivacyPolicyResult_DoInService"
                boolean r11 = r11.getBoolean(r5, r1)
                if (r11 == 0) goto L_0x006c
                r3 = 0
            L_0x006c:
                r11 = 0
                if (r3 == 0) goto L_0x0106
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r3 = r0.f118271i
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x0079:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x008d
                java.lang.Object r5 = r3.next()
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper r5 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper) r5
                if (r5 == 0) goto L_0x0079
                int r6 = r5.f118439e
                if (r6 != r13) goto L_0x0079
                r11 = r5
                goto L_0x0079
            L_0x008d:
                if (r11 == 0) goto L_0x00fc
                com.tencent.mm.plugin.webview.stub.m r3 = r11.f118438d
                if (r3 != 0) goto L_0x0094
                goto L_0x00fc
            L_0x0094:
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r13)
                r3.mo7179T6(r2, r9)
                android.content.Intent r3 = new android.content.Intent
                java.lang.Class<com.tencent.mm.plugin.webview.stub.WebViewStubProxyUI> r5 = com.tencent.p014mm.plugin.webview.stub.WebViewStubProxyUI.class
                r3.<init>(r0, r5)
                r3.putExtras(r12)
                java.lang.String r5 = "proxyui_action_code_key"
                r3.putExtra(r5, r2)
                java.lang.String r5 = "proxyui_type_key"
                r3.putExtra(r5, r8)
                java.lang.String r8 = "proxyui_function_key"
                r3.putExtra(r8, r9)
                java.lang.String r8 = "proxyui_callback_key"
                r3.putExtra(r8, r10)
                java.lang.String r8 = "webview_stub_callbacker_key"
                r3.putExtra(r8, r11)
                java.lang.String r8 = "proxyui_perm_key"
                r3.putExtra(r8, r4)
                java.lang.String r8 = "webview_binder_id"
                r3.putExtra(r8, r13)
                int r8 = r0.f118282w
                java.lang.String r9 = "screen_orientation"
                r3.putExtra(r9, r8)
                java.lang.String r8 = "CurUIDarkMode"
                int r8 = r12.getInt(r8, r1)
                java.lang.String r9 = "proxyui_darkmode_key"
                r3.putExtra(r9, r8)
                r8 = 268435456(0x10000000, float:2.5243549E-29)
                r3.addFlags(r8)
                com.tencent.mm.plugin.webview.stub.f r8 = new com.tencent.mm.plugin.webview.stub.f
                r8.<init>(r0, r3)
                android.os.Bundle r9 = r3.getExtras()
                com.tencent.mm.plugin.webview.stub.m r10 = r11.f118438d
                java.lang.String r11 = "webview"
                java.lang.String r12 = ".stub.WebViewStubProxyUI"
                boolean r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.C6600v.m6910e(r9, r11, r12, r10, r8)
            L_0x00fc:
                if (r1 == 0) goto L_0x0105
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r13)
                r8.mo7152F6(r2)
            L_0x0105:
                return r2
            L_0x0106:
                t83.h1 r3 = new t83.h1
                r3.<init>()
                r3.f38989b = r8
                r3.f38996i = r9
                r3.f38990c = r10
                java.lang.String r8 = "compatParams"
                android.os.Bundle r8 = r12.getBundle(r8)
                java.util.Map r8 = t83.C13841a.m13131a(r8)
                r3.f38983a = r8
                java.lang.String r8 = "jsEngine"
                android.os.Bundle r8 = r12.getBundle(r8)
                r3.f38992e = r8
                java.lang.String r8 = "rawParams"
                java.lang.String r8 = r12.getString(r8)     // Catch:{ JSONException -> 0x013b }
                boolean r10 = android.text.TextUtils.isEmpty(r8)     // Catch:{ JSONException -> 0x013b }
                if (r10 != 0) goto L_0x0145
                org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013b }
                r10.<init>(r8)     // Catch:{ JSONException -> 0x013b }
                r3.f38991d = r10     // Catch:{ JSONException -> 0x013b }
                goto L_0x0145
            L_0x013b:
                r8 = move-exception
                java.lang.Object[] r10 = new java.lang.Object[r2]
                r10[r1] = r8
                java.lang.String r8 = "get rawParams, e = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r8, r10)
            L_0x0145:
                com.tencent.mm.plugin.webview.stub.WebViewStubService r8 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r8 = r8.f118271i
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x014f:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x0165
                java.lang.Object r10 = r8.next()
                com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper r10 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper) r10
                if (r10 == 0) goto L_0x014f
                int r12 = r10.f118439e
                if (r12 != r13) goto L_0x014f
                com.tencent.mm.plugin.webview.stub.m r10 = r10.f118438d
                r11 = r10
                goto L_0x014f
            L_0x0165:
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r13)
                r8.mo7179T6(r2, r9)
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r13)
                com.tencent.mm.plugin.webview.stub.WebViewStubService r9 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                r8.mo7177S6(r9, r11, r11)
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r8 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r13)
                boolean r8 = r8.mo7240z6(r3, r4)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "handleRet = "
                r9.append(r10)
                r9.append(r8)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a.V50(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, android.os.Bundle, int):boolean");
        }

        public int Wn0(int i, int i2) {
            return Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(i, (Object) null), i2);
        }

        /* renamed from: Wy */
        public int mo68117Wy() {
            return Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(12304, (Object) null));
        }

        public void Yu0(int i, int i2) {
            WebViewStubService.this.f118273n.post(new WebViewStubService$a$$d(this, i, i2));
        }

        /* renamed from: aG */
        public C43784c mo68119aG(Bundle bundle) {
            boolean z;
            C43782i iVar = new C43782i((C43781a) null);
            long j = bundle.getLong("msg_id", Long.MIN_VALUE);
            String string = bundle.getString("sns_local_id");
            int i = bundle.getInt("news_svr_id", 0);
            String string2 = bundle.getString("news_svr_tweetid");
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            if (Long.MIN_VALUE != j) {
                doFavoriteEvent.f264674d.f264682g = bundle.getInt("message_index", 0);
                z = ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135057PN(doFavoriteEvent, j);
            } else if (!Util.isNullOrNil(string)) {
                SnsfillEventInfoEvent snsfillEventInfoEvent = new SnsfillEventInfoEvent();
                SnsfillEventInfoEvent.C92600a aVar = snsfillEventInfoEvent.f265220d;
                aVar.f265224c = string;
                aVar.f265225d = doFavoriteEvent;
                aVar.f265222a = bundle.getString("rawUrl");
                snsfillEventInfoEvent.f265220d.f265223b = true;
                snsfillEventInfoEvent.publish();
                z = snsfillEventInfoEvent.f265221e.f265226a;
            } else if (i != 0) {
                ReaderAppOperationEvent readerAppOperationEvent = new ReaderAppOperationEvent();
                ReaderAppOperationEvent.C67767a aVar2 = readerAppOperationEvent.f193863d;
                aVar2.f193865a = 3;
                aVar2.f193866b = doFavoriteEvent;
                aVar2.f193867c = i;
                aVar2.f193868d = string2;
                readerAppOperationEvent.publish();
                z = readerAppOperationEvent.f193864e.f193870a;
            } else {
                iVar.f118303e = true;
                return iVar;
            }
            if (z) {
                String nullAsNil = Util.nullAsNil(bundle.getString("prePublishId"));
                String a = C86493v0.m107223a(nullAsNil);
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
                c.mo120962i("sendAppMsgScene", 2);
                c.mo120962i("preChatName", bundle.getString("preChatName"));
                c.mo120962i("preMsgIndex", Integer.valueOf(bundle.getInt("preMsgIndex")));
                c.mo120962i("prePublishId", nullAsNil);
                c.mo120962i("preUsername", bundle.getString("preUsername"));
                c.mo120962i("getA8KeyScene", bundle.getString("getA8KeyScene"));
                c.mo120962i("referUrl", bundle.getString("referUrl"));
                Bundle bundle2 = bundle.getBundle("jsapiargs");
                if (bundle2 != null) {
                    c.mo120962i("adExtStr", bundle2.getString("key_snsad_statextstr"));
                }
                doFavoriteEvent.f264674d.f264683h = a;
                doFavoriteEvent.publish();
            } else {
                DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
                if (aVar3.f264687l == 0) {
                    aVar3.f264687l = C0966R.string.co9;
                }
                doFavoriteEvent.publish();
            }
            iVar.f118304f = doFavoriteEvent.f264675e.f9046a;
            return iVar;
        }

        /* renamed from: aI */
        public int mo68120aI(String str) {
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 1, str);
            doFavoriteEvent.publish();
            return doFavoriteEvent.f264675e.f9046a;
        }

        public void b00(String str) {
            Map<String, Integer> map = WebViewStubService.this.f118268f;
            if (map == null || !map.containsKey(str)) {
                Log.m105921e("MicroMsg.WebViewStubService", "%s is not recognizing", str);
                return;
            }
            CancelRecogImageFileEvent cancelRecogImageFileEvent = new CancelRecogImageFileEvent();
            cancelRecogImageFileEvent.f107390d.f107392b = str;
            cancelRecogImageFileEvent.publish();
            WebViewStubService.this.f118268f.remove(str);
            C86013q1.m106447h(str);
        }

        /* renamed from: c */
        public final void mo68122c(Intent intent, Bundle bundle) {
            if (bundle != null) {
                intent.putExtra("serverMsgID", bundle.getString("serverMsgID"));
                intent.putExtra("geta8key_username", bundle.getString("geta8key_username"));
                intent.putExtra("KPublisherReqId", bundle.getString("KPublisherReqId"));
                intent.putExtra("sns_local_id", bundle.getString("sns_local_id"));
            }
        }

        /* renamed from: cU */
        public String mo68123cU(String str) {
            return C6038i2.m5918b(str);
        }

        /* renamed from: cg */
        public void mo68124cg(int i) {
            Log.m105925i("MicroMsg.WebViewStubService", "removeCallback, id = %d", Integer.valueOf(i));
            Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
            while (it.hasNext()) {
                WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                if (webViewStubCallbackWrapper.f118439e == i) {
                    it.remove();
                } else if (!WebViewStubService.m47618b(WebViewStubService.this, webViewStubCallbackWrapper)) {
                    it.remove();
                }
            }
            WebViewStubService.this.f118266d.remove(i);
        }

        /* renamed from: d6 */
        public void mo68125d6(String str, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("proxyui_phone", str);
            WebViewStubService.m47617a(WebViewStubService.this, 8, bundle, i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
            r0 = (r0 = rb0.C47984k.m53328b(r0)).mo73500r2(false);
         */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0405  */
        /* JADX WARNING: Removed duplicated region for block: B:150:0x041c  */
        /* JADX WARNING: Removed duplicated region for block: B:151:0x043b  */
        /* JADX WARNING: Removed duplicated region for block: B:154:0x0441  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0451  */
        /* JADX WARNING: Removed duplicated region for block: B:158:0x0462  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x0482  */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x04d4 A[LOOP:10: B:175:0x04ce->B:177:0x04d4, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:180:0x0513  */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x051a  */
        /* JADX WARNING: Removed duplicated region for block: B:186:0x0521  */
        /* renamed from: dA */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo68126dA(int r21, boolean r22) {
            /*
                r20 = this;
                r1 = r20
                com.tencent.mm.plugin.webview.stub.WebViewStubService r0 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r0 = r0.f118271i
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r0 = r0.size()
                r2 = 2
                if (r0 != 0) goto L_0x0033
                com.tencent.mm.autogen.events.ExtTranslateVoiceEvent r0 = new com.tencent.mm.autogen.events.ExtTranslateVoiceEvent
                r0.<init>()
                com.tencent.mm.autogen.events.ExtTranslateVoiceEvent$a r3 = r0.f193561d
                r3.f193565c = r2
                r0.publish()
                com.tencent.mm.autogen.events.ExtPlayerEvent r0 = new com.tencent.mm.autogen.events.ExtPlayerEvent
                r0.<init>()
                com.tencent.mm.autogen.events.ExtPlayerEvent$a r3 = r0.f264779d
                r3.f264781a = r2
                r0.publish()
                com.tencent.mm.autogen.events.ExtSimpleRecordEvent r0 = new com.tencent.mm.autogen.events.ExtSimpleRecordEvent
                r0.<init>()
                com.tencent.mm.autogen.events.ExtSimpleRecordEvent$a r3 = r0.f264788d
                r3.f264790a = r2
                r0.publish()
            L_0x0033:
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler r3 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3.m48330a(r21)
                com.tencent.mm.plugin.webview.stub.WebViewStubService r10 = com.tencent.p014mm.plugin.webview.stub.WebViewStubService.this
                r3.getClass()
                java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler> r4 = com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler.class
                r5 = 1
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r22)
                r7 = 0
                r0[r7] = r6
                java.lang.String r11 = "MicroMsg.MsgHandler"
                java.lang.String r6 = "onWebViewUIDestroy floating=%b"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r0)
                r3.f22711t = r5
                boolean r0 = r3.mo7145B6()
                if (r0 == 0) goto L_0x006d
                com.tencent.mm.plugin.webview.model.m1 r0 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Ax0()
                java.lang.String r6 = r3.f22694X
                com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem r0 = r0.mo7010b(r6)
                if (r0 != 0) goto L_0x0065
                goto L_0x006d
            L_0x0065:
                com.tencent.mm.plugin.webview.ui.tools.jsapi.t2 r6 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.t2
                r6.<init>(r3, r0)
                com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r6)
            L_0x006d:
                int r0 = r3.mo7230u6()
                java.lang.String r6 = "Remove ble devices, srcUserName(%s), deviceId(%s)"
                r8 = 8
                java.lang.String r9 = "Publish ExDeviceConnectDeviceEvent"
                java.lang.String r12 = "ExDeviceConnectDeviceEvent publish failed"
                java.lang.String r13 = ""
                if (r0 == r8) goto L_0x0084
                int r0 = r3.mo7230u6()
                r14 = -1
                if (r0 != r14) goto L_0x008c
            L_0x0084:
                int r0 = r3.mo7232v6()
                r14 = 27
                if (r0 != r14) goto L_0x01b0
            L_0x008c:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22709r
                if (r0 == 0) goto L_0x0096
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x00a2
            L_0x0096:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22708q
                if (r0 == 0) goto L_0x01a9
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x00a2
                goto L_0x01a9
            L_0x00a2:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22709r
                if (r0 == 0) goto L_0x00fd
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x00fd
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22709r
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r8 = r0.iterator()
            L_0x00b6:
                boolean r0 = r8.hasNext()
                if (r0 == 0) goto L_0x00f8
                java.lang.Object r0 = r8.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r14 = r0.getKey()
                java.lang.String r14 = (java.lang.String) r14
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object[] r15 = new java.lang.Object[r2]
                r15[r7] = r14
                r15[r5] = r0
                java.lang.String r2 = "Remove wifi devices, srcUserName(%s), deviceId(%s)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r15)
                com.tencent.mm.autogen.events.ExDeviceConnectLanDeviceEvent r2 = new com.tencent.mm.autogen.events.ExDeviceConnectLanDeviceEvent     // Catch:{ Exception -> 0x00ed }
                r2.<init>()     // Catch:{ Exception -> 0x00ed }
                com.tencent.mm.autogen.events.ExDeviceConnectLanDeviceEvent$a r15 = r2.f9072d     // Catch:{ Exception -> 0x00ed }
                r15.f9076c = r7     // Catch:{ Exception -> 0x00ed }
                r15.f9075b = r14     // Catch:{ Exception -> 0x00ed }
                r15.f9074a = r0     // Catch:{ Exception -> 0x00ed }
                r2.publish()     // Catch:{ Exception -> 0x00ed }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)     // Catch:{ Exception -> 0x00ed }
                goto L_0x00f6
            L_0x00ed:
                r0 = move-exception
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
                java.lang.Object[] r2 = new java.lang.Object[r7]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r2)
            L_0x00f6:
                r2 = 2
                goto L_0x00b6
            L_0x00f8:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22709r
                r0.clear()
            L_0x00fd:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22708q
                if (r0 == 0) goto L_0x022d
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x022d
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22708q
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r2 = r0.iterator()
                java.lang.String r0 = r3.mo7212l6()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r8 != 0) goto L_0x0139
                ug.c r0 = rb0.C47984k.m53328b(r0)
                if (r0 == 0) goto L_0x0139
                ug.c$b r0 = r0.mo73500r2(r7)
                if (r0 == 0) goto L_0x0139
                ug.c$b$b r8 = r0.mo73512e()
                if (r8 == 0) goto L_0x0139
                ug.c$b$b r0 = r0.mo73512e()
                boolean r0 = r0.mo73527a()
                if (r0 == 0) goto L_0x0139
                r8 = 1
                goto L_0x013a
            L_0x0139:
                r8 = 0
            L_0x013a:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.Boolean r14 = java.lang.Boolean.valueOf(r8)
                r0[r7] = r14
                java.lang.String r14 = "Is in hard biz(%b)"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r14, r0)
                if (r2 == 0) goto L_0x01a2
            L_0x0149:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L_0x01a2
                java.lang.Object r0 = r2.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r14 = r0.getKey()
                java.lang.String r14 = (java.lang.String) r14
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r15 = 2
                java.lang.Object[] r1 = new java.lang.Object[r15]
                r1[r7] = r14
                r1[r5] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r1)
                if (r8 == 0) goto L_0x0184
                com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent r1 = new com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent
                r1.<init>()
                com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent$a r15 = r1.f107440d
                r15.f107442a = r14
                r15.f107443b = r0
                r1.publish()
                com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent$b r1 = r1.f107441e
                boolean r1 = r1.f107444a
                if (r1 == 0) goto L_0x0184
            L_0x0181:
                r1 = r20
                goto L_0x0149
            L_0x0184:
                com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent r1 = new com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent     // Catch:{ Exception -> 0x0198 }
                r1.<init>()     // Catch:{ Exception -> 0x0198 }
                com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent$a r15 = r1.f9066d     // Catch:{ Exception -> 0x0198 }
                r15.f9070c = r7     // Catch:{ Exception -> 0x0198 }
                r15.f9068a = r14     // Catch:{ Exception -> 0x0198 }
                r15.f9069b = r0     // Catch:{ Exception -> 0x0198 }
                r1.publish()     // Catch:{ Exception -> 0x0198 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)     // Catch:{ Exception -> 0x0198 }
                goto L_0x0181
            L_0x0198:
                r0 = move-exception
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
                java.lang.Object[] r1 = new java.lang.Object[r7]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r1)
                goto L_0x0181
            L_0x01a2:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22708q
                r0.clear()
                goto L_0x022d
            L_0x01a9:
                java.lang.String r0 = "No exdevice connection, just return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                goto L_0x022d
            L_0x01b0:
                int r0 = r3.mo7230u6()
                if (r0 != r8) goto L_0x022d
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22708q
                if (r0 == 0) goto L_0x0228
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x01c1
                goto L_0x0228
            L_0x01c1:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22708q
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r1 = r0.iterator()
                if (r1 == 0) goto L_0x0222
            L_0x01cd:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x0222
                java.lang.Object r0 = r1.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r2 = r0.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r0 = r0.getValue()
                java.lang.String r0 = (java.lang.String) r0
                r8 = 2
                java.lang.Object[] r14 = new java.lang.Object[r8]
                r14[r7] = r2
                r14[r5] = r0
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r14)
                com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent r8 = new com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent
                r8.<init>()
                com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent$a r14 = r8.f107440d
                r14.f107442a = r2
                r14.f107443b = r0
                r8.publish()
                com.tencent.mm.autogen.events.ExDeviceConnectStrategyActionEvent$b r8 = r8.f107441e
                boolean r8 = r8.f107444a
                if (r8 == 0) goto L_0x0204
                goto L_0x01cd
            L_0x0204:
                com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent r8 = new com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent     // Catch:{ Exception -> 0x0218 }
                r8.<init>()     // Catch:{ Exception -> 0x0218 }
                com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent$a r14 = r8.f9066d     // Catch:{ Exception -> 0x0218 }
                r14.f9070c = r7     // Catch:{ Exception -> 0x0218 }
                r14.f9068a = r2     // Catch:{ Exception -> 0x0218 }
                r14.f9069b = r0     // Catch:{ Exception -> 0x0218 }
                r8.publish()     // Catch:{ Exception -> 0x0218 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r9)     // Catch:{ Exception -> 0x0218 }
                goto L_0x01cd
            L_0x0218:
                r0 = move-exception
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r11, r12)
                java.lang.Object[] r2 = new java.lang.Object[r7]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r13, r2)
                goto L_0x01cd
            L_0x0222:
                java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.f22708q
                r0.clear()
                goto L_0x022d
            L_0x0228:
                java.lang.String r0 = "Not hard biz, or no ble device connection, just return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            L_0x022d:
                java.lang.String r0 = r3.f22710s
                if (r0 == 0) goto L_0x023a
                eb0.w2 r0 = eb0.C31519v2.m39436a()
                java.lang.String r1 = r3.f22710s
                r0.mo55989f(r1)
            L_0x023a:
                com.tencent.mm.plugin.webview.model.r r0 = com.tencent.p014mm.plugin.webview.model.C6054r.C6056b.f22352a
                java.util.List<te3.sl2> r1 = r0.f22349d
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                java.lang.String r2 = "MicroMsg.WebView.JsLogHelper"
                if (r1 == 0) goto L_0x024d
                java.lang.String r0 = "not kv stat cached, no need to doReport, skip"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
                goto L_0x0258
            L_0x024d:
                boolean r1 = f40.C86709a0.m107522a()
                if (r1 != 0) goto L_0x025c
                java.lang.String r0 = "doReport(), acc not ready, skip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            L_0x0258:
                r21 = r13
                goto L_0x0401
            L_0x025c:
                java.lang.Class<lc3.b> r1 = lc3.C10485b.class
                k40.a r6 = f40.C86709a0.m107533q(r1)
                lc3.b r6 = (lc3.C10485b) r6
                pj.f r6 = r6.vh0()
                r8 = 20480(0x5000, float:2.8699E-41)
                java.lang.String r9 = "MMUxAdLog2GSendSize"
                int r6 = r6.mo107404b(r9, r8)
                r0.f22346a = r6
                k40.a r6 = f40.C86709a0.m107533q(r1)
                lc3.b r6 = (lc3.C10485b) r6
                pj.f r6 = r6.vh0()
                r8 = 30720(0x7800, float:4.3048E-41)
                java.lang.String r9 = "MMUxAdLog3GSendSize"
                int r6 = r6.mo107404b(r9, r8)
                r0.f22347b = r6
                k40.a r1 = f40.C86709a0.m107533q(r1)
                lc3.b r1 = (lc3.C10485b) r1
                pj.f r1 = r1.vh0()
                r6 = 51200(0xc800, float:7.1746E-41)
                java.lang.String r8 = "MMUxAdLogWifiSendSize"
                int r1 = r1.mo107404b(r8, r6)
                r0.f22348c = r1
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                int r6 = r0.f22346a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r1[r7] = r6
                int r6 = r0.f22347b
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r1[r5] = r6
                int r6 = r0.f22348c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r8 = 2
                r1[r8] = r6
                java.lang.String r6 = "readDynamicSendSize, 2g(%d), 3g(%d), wifi(%d)"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r6, r1)
                java.util.List<te3.sl2> r1 = r0.f22349d
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                if (r6 == 0) goto L_0x02d0
                java.lang.String r1 = "no need to split, existings is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
                r21 = r13
                r1 = 0
                goto L_0x03c4
            L_0x02d0:
                java.lang.String r6 = "begin split >>>>>>>>>>>>>>>>>>>>>>>>>>>>"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)
                java.lang.String r6 = "before split, given list:"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.setLength(r7)
                java.lang.String r8 = "{ "
                r6.append(r8)
                java.util.Iterator r9 = r1.iterator()
            L_0x02ec:
                boolean r14 = r9.hasNext()
                java.lang.String r15 = ", "
                if (r14 == 0) goto L_0x0303
                java.lang.Object r14 = r9.next()
                te3.sl2 r14 = (te3.C51263sl2) r14
                int r14 = r14.f141588d
                r6.append(r14)
                r6.append(r15)
                goto L_0x02ec
            L_0x0303:
                java.lang.String r9 = " }"
                r6.append(r9)
                java.lang.String r14 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r14)
                r21 = r13
                long r12 = r0.f22351f
                long r12 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r12)
                r16 = 100
                int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
                if (r14 >= 0) goto L_0x0322
                int r12 = r0.f22350e
                if (r12 <= 0) goto L_0x0322
                goto L_0x0364
            L_0x0322:
                long r12 = android.os.SystemClock.elapsedRealtime()
                r0.f22351f = r12
                android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isWifi((android.content.Context) r12)
                if (r12 == 0) goto L_0x0337
                int r12 = r0.f22348c
                r0.f22350e = r12
                goto L_0x0364
            L_0x0337:
                android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is3G(r12)
                if (r12 != 0) goto L_0x0360
                android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is4G(r12)
                if (r12 == 0) goto L_0x034c
                goto L_0x0360
            L_0x034c:
                android.content.Context r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r12 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r12)
                if (r12 == 0) goto L_0x035b
                int r12 = r0.f22346a
                r0.f22350e = r12
                goto L_0x0364
            L_0x035b:
                int r12 = r0.f22346a
                r0.f22350e = r12
                goto L_0x0364
            L_0x0360:
                int r12 = r0.f22347b
                r0.f22350e = r12
            L_0x0364:
                java.util.LinkedList r13 = new java.util.LinkedList
                r13.<init>()
                r13.addAll(r1)
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r14 = 0
            L_0x0372:
                r16 = 0
            L_0x0374:
                int r17 = r13.size()
                if (r17 > 0) goto L_0x053d
                java.lang.String r12 = "split result: "
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r12)
                java.util.Iterator r12 = r1.iterator()
            L_0x0384:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x03bf
                java.lang.Object r13 = r12.next()
                java.util.List r13 = (java.util.List) r13
                r6.setLength(r7)
                r6.append(r8)
                java.util.Iterator r13 = r13.iterator()
            L_0x039a:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x03af
                java.lang.Object r14 = r13.next()
                te3.sl2 r14 = (te3.C51263sl2) r14
                int r14 = r14.f141588d
                r6.append(r14)
                r6.append(r15)
                goto L_0x039a
            L_0x03af:
                r6.append(r9)
                java.lang.String r13 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r13)
                java.lang.String r13 = "---------------------------"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r13)
                goto L_0x0384
            L_0x03bf:
                java.lang.String r6 = "end split <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r6)
            L_0x03c4:
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                if (r6 == 0) goto L_0x03d1
                java.lang.String r0 = "split result empty, skip"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
                goto L_0x0401
            L_0x03d1:
                java.util.Iterator r1 = r1.iterator()
            L_0x03d5:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x03fa
                java.lang.Object r6 = r1.next()
                java.util.List r6 = (java.util.List) r6
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
                if (r7 != 0) goto L_0x03d5
                java.lang.String r7 = "trigger do scene"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r7)
                com.tencent.mm.plugin.webview.model.g0 r7 = new com.tencent.mm.plugin.webview.model.g0
                r7.<init>(r6)
                ob0.b0 r6 = f40.C86709a0.m107524d()
                r6.mo123460f(r7)
                goto L_0x03d5
            L_0x03fa:
                java.util.List<te3.sl2> r0 = r0.f22349d
                java.util.LinkedList r0 = (java.util.LinkedList) r0
                r0.clear()
            L_0x0401:
                android.os.Bundle r0 = r3.f22704n
                if (r0 == 0) goto L_0x040c
                java.lang.ClassLoader r1 = r4.getClassLoader()
                r0.setClassLoader(r1)
            L_0x040c:
                android.os.Bundle r0 = r3.f22704n
                if (r0 == 0) goto L_0x043b
                java.lang.String r1 = "KSnsAdTag"
                android.os.Parcelable r0 = r0.getParcelable(r1)
                if (r0 == 0) goto L_0x043b
                boolean r1 = r0 instanceof com.tencent.p014mm.modelsns.SnsAdClick
                if (r1 == 0) goto L_0x043b
                com.tencent.mm.modelsns.SnsAdClick r0 = (com.tencent.p014mm.modelsns.SnsAdClick) r0
                com.tencent.mm.autogen.events.ReportSnsEvent r1 = new com.tencent.mm.autogen.events.ReportSnsEvent
                r1.<init>()
                com.tencent.mm.autogen.events.ReportSnsEvent$a r2 = r1.f265064d
                r2.f265066b = r5
                r2.f265065a = r0
                android.os.Bundle r0 = r3.f22704n
                java.lang.String r2 = "KAnsUxInfo"
                r5 = r21
                java.lang.String r0 = r0.getString(r2, r5)
                com.tencent.mm.autogen.events.ReportSnsEvent$a r2 = r1.f265064d
                r2.f265067c = r0
                r1.publish()
                goto L_0x043d
            L_0x043b:
                r5 = r21
            L_0x043d:
                android.os.Bundle r0 = r3.f22704n
                if (r0 == 0) goto L_0x0451
                java.lang.ClassLoader r1 = r4.getClassLoader()
                r0.setClassLoader(r1)
                android.os.Bundle r0 = r3.f22704n
                java.lang.String r1 = "KoriginUrl"
                java.lang.String r13 = r0.getString(r1)
                goto L_0x0452
            L_0x0451:
                r13 = r5
            L_0x0452:
                com.tencent.mm.autogen.events.WebViewUIDestroyEvent r0 = new com.tencent.mm.autogen.events.WebViewUIDestroyEvent
                r0.<init>()
                com.tencent.mm.autogen.events.WebViewUIDestroyEvent$a r1 = r0.f194105d
                r1.f194106a = r13
                r0.publish()
                android.os.Bundle r0 = r3.f22704n
                if (r0 == 0) goto L_0x0470
                int r1 = ad0.C91998s.f263358l
                java.lang.String r1 = "intent_key_StatisticsOplog"
                byte[] r0 = r0.getByteArray(r1)
                if (r0 != 0) goto L_0x046d
                goto L_0x0470
            L_0x046d:
                ad0.C91998s.m115548b(r0)
            L_0x0470:
                java.util.Map<java.lang.String, com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$p0> r0 = r3.f22693W
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x047c:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x04bf
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r2 == 0) goto L_0x048f
                goto L_0x047c
            L_0x048f:
                com.tencent.mm.plugin.webview.model.l1 r2 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Cx0()
                r2.mo134805e(r1)
                java.util.Map<java.lang.String, com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$p0> r2 = r3.f22693W
                java.util.HashMap r2 = (java.util.HashMap) r2
                java.lang.Object r1 = r2.get(r1)
                com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$p0 r1 = (com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.MsgHandler$$p0) r1
                if (r1 != 0) goto L_0x04a3
                goto L_0x047c
            L_0x04a3:
                com.tencent.mm.plugin.webview.model.n r2 = r1.f22835b
                if (r2 == 0) goto L_0x04b0
                com.tencent.mm.plugin.webview.model.l1 r2 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Cx0()
                com.tencent.mm.plugin.webview.model.n r4 = r1.f22835b
                r2.mo134808h(r4)
            L_0x04b0:
                t83.h1 r5 = r1.f22834a
                if (r5 == 0) goto L_0x047c
                r7 = 0
                r8 = 0
                r9 = 1
                java.lang.String r6 = "uploadVideo:cancel"
                r4 = r3
                r4.mo7211l5(r5, r6, r7, r8, r9)
                goto L_0x047c
            L_0x04bf:
                java.util.Map<java.lang.String, com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$p0> r0 = r3.f22693W
                java.util.HashMap r0 = (java.util.HashMap) r0
                r0.clear()
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.b2$a> r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2.f24046a
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x04ce:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x04f7
                java.lang.Object r1 = r0.next()
                com.tencent.mm.pluginsdk.ui.tools.b2$a r1 = (com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2.C6685a) r1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "onWebViewUIDestroy, stop plugin = "
                r2.append(r4)
                java.lang.String r4 = r1.getName()
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
                r1.mo6910b(r10)
                goto L_0x04ce
            L_0x04f7:
                java.lang.String r0 = "MicroMsg.WebViewPluginCenter"
                java.lang.String r1 = "clear"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
                java.util.List<com.tencent.mm.pluginsdk.ui.tools.b2$a> r0 = com.tencent.p014mm.pluginsdk.p133ui.tools.C6684b2.f24046a
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.clear()
                com.tencent.mm.sdk.event.IListener r0 = r3.f22692V
                r0.dead()
                com.tencent.mm.sdk.event.IListener r0 = r3.f22718y0
                r0.dead()
                com.tencent.mm.sdk.event.IListener r0 = r3.f22695Y
                if (r0 == 0) goto L_0x0516
                r0.dead()
            L_0x0516:
                com.tencent.mm.sdk.event.IListener r0 = r3.f22683L
                if (r0 == 0) goto L_0x051d
                r0.dead()
            L_0x051d:
                com.tencent.mm.sdk.event.IListener r0 = r3.f22716x0
                if (r0 == 0) goto L_0x0524
                r0.dead()
            L_0x0524:
                r0 = 0
                r3.f22691U = r0
                java.util.Map<java.lang.Integer, com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$q0> r0 = r3.f22696Z
                java.util.HashMap r0 = (java.util.HashMap) r0
                r0.clear()
                com.tencent.mm.plugin.webview.ui.tools.jsapi.c r0 = r3.f22719z
                r0.getClass()
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r2 = 1093(0x445, float:1.532E-42)
                r1.mo123470p(r2, r0)
                return
            L_0x053d:
                r17 = r21
                r18 = 0
                if (r16 > 0) goto L_0x055e
                java.util.LinkedList r14 = new java.util.LinkedList
                r14.<init>()
                java.lang.Object r19 = r13.remove()
                r5 = r19
                te3.sl2 r5 = (te3.C51263sl2) r5
                pe3.b r7 = r5.f141589e
                byte[] r7 = r7.f257327a
                int r7 = r7.length
                int r16 = r16 + r7
                r14.add(r5)
                r1.add(r14)
                goto L_0x0583
            L_0x055e:
                java.lang.Object r5 = r13.peek()
                te3.sl2 r5 = (te3.C51263sl2) r5
                pe3.b r5 = r5.f141589e
                byte[] r5 = r5.f257327a
                int r5 = r5.length
                int r5 = r5 + r16
                if (r5 < r12) goto L_0x0573
                r21 = r17
                r5 = 1
                r7 = 0
                goto L_0x0372
            L_0x0573:
                java.lang.Object r5 = r13.remove()
                te3.sl2 r5 = (te3.C51263sl2) r5
                pe3.b r7 = r5.f141589e
                byte[] r7 = r7.f257327a
                int r7 = r7.length
                int r16 = r16 + r7
                r14.add(r5)
            L_0x0583:
                r21 = r17
                r5 = 1
                r7 = 0
                goto L_0x0374
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a.mo68126dA(int, boolean):void");
        }

        /* renamed from: dE */
        public boolean mo68127dE(Bundle bundle) {
            DeleteFavoriteEvent deleteFavoriteEvent = new DeleteFavoriteEvent();
            deleteFavoriteEvent.f264667d.f264669a = bundle.getLong("fav_local_id", -1);
            deleteFavoriteEvent.f264667d.f264670b = 12;
            deleteFavoriteEvent.publish();
            Log.m105925i("MicroMsg.WebViewStubService", "do del fav web url, local id %d, result %B", Long.valueOf(deleteFavoriteEvent.f264667d.f264669a), Boolean.valueOf(deleteFavoriteEvent.f264668e.f264671a));
            return deleteFavoriteEvent.f264668e.f264671a;
        }

        /* renamed from: e */
        public final void mo68128e(Intent intent, int i) {
            ActivityStarterIpcDelegate activityStarterIpcDelegate;
            try {
                Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                C6107m mVar = null;
                while (it.hasNext()) {
                    WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                    if (webViewStubCallbackWrapper != null && webViewStubCallbackWrapper.f118439e == i) {
                        mVar = webViewStubCallbackWrapper.f118438d;
                    }
                }
                Bundle V5 = mVar.mo7031V5(302, Bundle.EMPTY);
                V5.setClassLoader(ActivityStarterIpcDelegate.class.getClassLoader());
                activityStarterIpcDelegate = (ActivityStarterIpcDelegate) V5.getParcelable("delegate");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WebViewStubService", "startMsgRetransmitUI, try get startActivityIpcDelegate e=%s", e);
                activityStarterIpcDelegate = null;
            }
            if (activityStarterIpcDelegate != null) {
                intent.setClassName(WebViewStubService.this, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                ActivityStarterIpcDelegate activityStarterIpcDelegate2 = activityStarterIpcDelegate;
                C117292a.m165358d(activityStarterIpcDelegate2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "startMsgRetransmitUI", "(Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activityStarterIpcDelegate.mo880b((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activityStarterIpcDelegate2, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "startMsgRetransmitUI", "(Landroid/content/Intent;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            ((C67654r1) C9286a.f29044a).mo93184q(intent, WebViewStubService.this);
        }

        /* renamed from: eO */
        public void mo68129eO(int i, List<String> list) {
            C115669n.INSTANCE.mo160137l(i, list);
        }

        public void favEditTag() {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            favoriteOperationEvent.f264833d.f264835a = 35;
            favoriteOperationEvent.publish();
        }

        public String getDisplayName(String str) {
            return ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str).mo62909j3();
        }

        public String getLanguage() {
            return LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
        }

        public boolean gg0(String str) {
            return C45628s0.m50812z(str);
        }

        /* renamed from: gv */
        public Bundle mo68134gv(int i, Bundle bundle) {
            FTSWebViewLogic fTSWebViewLogic = (FTSWebViewLogic) C6080m.m5948g9();
            fTSWebViewLogic.getClass();
            Bundle bundle2 = new Bundle();
            if (i == 2) {
                String string = bundle.getString("key");
                bundle2.putString("result", C78137s0.m94340d(string).toString());
                if ("educationTab".equals(string)) {
                    JSONObject d = C78137s0.m94340d("discoverSearchGuide");
                    if (d.optJSONArray("items").length() > 0) {
                        bundle2.putString("result_1", d.toString());
                    }
                }
            } else if (i == 4) {
                HashMap hashMap = (HashMap) C101987v0.m134267a(bundle.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), bundle.getBoolean("isHomePage"), bundle.getInt("type"));
                bundle2.putString("type", (String) hashMap.get("type"));
                bundle2.putString("isMostSearchBiz", (String) hashMap.get("isMostSearchBiz"));
                bundle2.putString("isLocalSug", (String) hashMap.get("isLocalSug"));
                bundle2.putString("isSug", (String) hashMap.get("isSug"));
                bundle2.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, (String) hashMap.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
            } else if (i == 6) {
                bundle2.putString("result", C78137s0.m94341e(bundle.getString("key")));
            } else if (i == 7) {
                bundle2.putString("data", fTSWebViewLogic.mo134657b(20, 0, true));
            } else if (i == 8) {
                try {
                    HashMap hashMap2 = (HashMap) ((C96598h) ((C96603l) C86312j.m106911c(C96603l.class)).mo134690lS()).mo134677c(bundle.getString("reqId"));
                    bundle2.putInt("requestType", Util.safeParseInt((String) hashMap2.get("requestType")));
                    bundle2.putString("data", (String) hashMap2.get("data"));
                } catch (Exception unused) {
                }
            }
            return bundle2;
        }

        /* renamed from: ha */
        public void mo68135ha() {
            if ((C75592q0.m90785o() & 32768) == 0) {
                Intent intent = new Intent();
                intent.setFlags(268435456);
                intent.addFlags(67108864);
                intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                intent.putExtra("sns_timeline_NeedFirstLoadint", true);
                WebViewStubService webViewStubService = WebViewStubService.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WebViewStubService webViewStubService2 = webViewStubService;
                C117292a.m165358d(webViewStubService2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                webViewStubService.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(webViewStubService2, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }

        public boolean isSDCardAvailable() {
            return C86709a0.m107535s().mo121147n();
        }

        /* renamed from: jN */
        public void mo68137jN() {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("sns_userName", (String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
            intent.addFlags(67108864);
            intent.putExtra("sns_adapter_type", 1);
            C86709a0.m107535s().mo121142i().mo119676J(68389, Integer.valueOf(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(68389, (Object) null), 0) + 1));
            intent.setClassName(MMApplicationContext.getContext(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUserPagerUI");
            WebViewStubService webViewStubService = WebViewStubService.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WebViewStubService webViewStubService2 = webViewStubService;
            C117292a.m165358d(webViewStubService2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            webViewStubService.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(webViewStubService2, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSnsUserUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        /* renamed from: jo */
        public boolean mo68138jo(long j, String str) {
            Class cls = C79138l.class;
            Log.m105924i("MicroMsg.WebViewStubService", "hasBindNetworkDevice, msgid:" + j);
            int i = (j > Long.MIN_VALUE ? 1 : (j == Long.MIN_VALUE ? 0 : -1));
            if (i == 0 && str == null) {
                return false;
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            if (i != 0) {
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = j;
            }
            if (str != null) {
                exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = str;
            }
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                return true;
            }
            if (C86709a0.m107522a() && i != 0) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
                if (b002.getType() == 49) {
                    boolean U5 = C72996z1.m85820U5(b002.mo108768t());
                    String content = b002.getContent();
                    int t2 = b002.mo108769t2();
                    if (U5 && content != null && t2 == 0) {
                        content = C75604z3.m90849u(content);
                    }
                    int i2 = C68070l.C68072b.m80422u(content, (String) null).f195582i;
                    if (i2 == 3) {
                        return ((C79138l) C86312j.m106911c(cls)).Bl0(MMApplicationContext.getContext(), 16);
                    }
                    if (i2 == 4) {
                        return ((C79138l) C86312j.m106911c(cls)).Bl0(MMApplicationContext.getContext(), 8);
                    }
                }
            }
            return false;
        }

        /* renamed from: jx */
        public Map mo68139jx() {
            C47506e c = ((C10485b) C86709a0.m107533q(C10485b.class)).g50().mo72510c(1);
            if (c == null) {
                return null;
            }
            return c.f127475b;
        }

        public void kk0(Intent intent) {
            Intent intent2 = new Intent(WebViewStubService.this, WebViewStubProxyUI.class);
            intent2.putExtra("proxyui_action_code_key", 9);
            intent2.putExtra("proxyui_next_intent_key", intent);
            intent2.setFlags(268435456);
            WebViewStubService webViewStubService = WebViewStubService.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            WebViewStubService webViewStubService2 = webViewStubService;
            C117292a.m165358d(webViewStubService2, aVar.mo10232b(), "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSimpleLoginUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            webViewStubService.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(webViewStubService2, "com/tencent/mm/plugin/webview/stub/WebViewStubService$1", "gotoSimpleLoginUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        public String mf0(String str) {
            boolean a = C86709a0.m107522a();
            Log.m105924i("MicroMsg.WebViewStubService", "getDynamicConfigValue, accHasReady = " + a);
            return !a ? (String) new WebViewStubService$a$$e(this, 1000, (String) null, str).exec(WebViewStubService.this.f118273n) : ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str);
        }

        /* renamed from: mr */
        public String mo68142mr(String str) {
            String oX = ((C76708i) C86312j.m106911c(C76708i.class)).mo106845oX(str, false);
            if (!C86013q1.m106450k(oX)) {
                C9286a.m8929a(new WebViewStubService$a$$c(this, str));
            }
            return oX;
        }

        /* renamed from: nO */
        public void mo68143nO(String str, boolean z) {
            ((C40030e) C15134f0.C15135a.m14248a()).mo62719c(WebViewStubService.this, str, z, (C53145l0) null);
        }

        /* renamed from: nP */
        public String mo68144nP(String str) {
            return ((C15132d0) C86312j.m106911c(C15132d0.class)).mo14082XP(WebViewStubService.this, str);
        }

        @Deprecated
        /* renamed from: pG */
        public void mo68145pG(int i, Bundle bundle, int i2) {
            Log.m105925i("MicroMsg.WebViewStubService", "edw, invoke, actionCode = %d, binderID = %d", Integer.valueOf(i), Integer.valueOf(i2));
            WebViewStubService.this.f118273n.post(new WebViewStubService$a$$b(this, i, bundle, i2));
        }

        /* renamed from: pa */
        public String mo68146pa(String str) {
            C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(str, false);
            if (GW == null) {
                return null;
            }
            return GW.field_packageName;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x00a7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<java.lang.String> tf0() {
            /*
                r15 = this;
                boolean r0 = f40.C86709a0.m107522a()
                if (r0 == 0) goto L_0x000e
                com.tencent.p014mm.plugin.webview.modeltools.C6080m.wx0()
                com.tencent.mm.plugin.webview.modeltools.b0 r0 = com.tencent.p014mm.plugin.webview.modeltools.C6080m.Dx0()
                goto L_0x000f
            L_0x000e:
                r0 = 0
            L_0x000f:
                if (r0 != 0) goto L_0x0017
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                return r0
            L_0x0017:
                java.util.ArrayList r1 = new java.util.ArrayList
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "webview hijack deleteExpiredItem now = "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "MicroMsg.WebViewStorage"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "delete from WebViewHostsFilter where expireTime < "
                r4.append(r6)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                java.lang.String r3 = "WebViewHostsFilter"
                boolean r2 = r0.execSQL(r3, r2)
                r3 = 1
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r4 = 0
                r3[r4] = r2
                java.lang.String r2 = "delete expired items request  : [%b]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r3)
                com.tencent.mm.sdk.storage.ISQLiteDatabase r6 = r0.f22404d
                java.lang.String r7 = r0.getTableName()
                java.lang.String r0 = "host"
                java.lang.String[] r8 = new java.lang.String[]{r0}
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 2
                android.database.Cursor r0 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>()
                if (r0 == 0) goto L_0x00a5
                boolean r3 = r0.moveToFirst()
                if (r3 == 0) goto L_0x00a5
            L_0x007d:
                java.lang.String r3 = r0.getString(r4)
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r6 != 0) goto L_0x009f
                r2.add(r3)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "webview hijack gethost = "
                r6.append(r7)
                r6.append(r3)
                java.lang.String r3 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r3)
            L_0x009f:
                boolean r3 = r0.moveToNext()
                if (r3 != 0) goto L_0x007d
            L_0x00a5:
                if (r0 == 0) goto L_0x00aa
                r0.close()
            L_0x00aa:
                r1.<init>(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.WebViewStubService.C43781a.tf0():java.util.List");
        }

        /* renamed from: uU */
        public List<String> mo68148uU() {
            List<String> bO = C48009v0.Fx0().mo72763bO(128);
            LinkedList linkedList = new LinkedList();
            for (String next : bO) {
                if (!C47984k.m53338l(next)) {
                    linkedList.add(next);
                }
            }
            return linkedList;
        }

        /* renamed from: vj */
        public Bundle mo68149vj(int i, Bundle bundle) {
            FTSWebViewLogic fTSWebViewLogic = (FTSWebViewLogic) C6080m.m5948g9();
            fTSWebViewLogic.getClass();
            if (i == 1) {
                int i2 = bundle.getInt("webview_id");
                fTSWebViewLogic.f282759d.remove(Integer.valueOf(i2));
                C14128i iVar = fTSWebViewLogic.f282766n;
                if (!(!iVar.f39533a) || Util.isNullOrNil(iVar.f39534b)) {
                    Log.m105927v("MicroMsg.WebSearch.FTSLogObj", "can not report %s", iVar.f39534b);
                } else {
                    Log.m105927v("MicroMsg.WebSearch.FTSLogObj", "report isReported:%b query:%s hasResult:%b isClick:%b searchType:%d", Boolean.valueOf(iVar.f39533a), iVar.f39534b, Boolean.valueOf(iVar.f39535c), Boolean.valueOf(iVar.f39536d), Integer.valueOf(iVar.f39537e));
                    ((C92330r) C86312j.m106911c(C92330r.class)).ib0(iVar.f39538f, 1, iVar.f39534b, iVar.f39536d, iVar.f39535c, iVar.f39537e);
                    iVar.f39533a = true;
                }
                Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "activity destroy %d", Integer.valueOf(i2));
            } else if (i == 5) {
                ((C99260q) C86312j.m106911c(C99260q.class)).mo128759x2(bundle.getString("history"));
            } else if (i == 6) {
                ((C46138l) C86312j.m106911c(C46138l.class)).mo32566VQ(bundle.getString("reportString"));
            } else if (i == 7) {
                FTSEmojiDownloadedEvent fTSEmojiDownloadedEvent = new FTSEmojiDownloadedEvent();
                FTSEmojiDownloadedEvent.C1032a aVar = fTSEmojiDownloadedEvent.f9141d;
                aVar.f9143a = 3;
                aVar.f9149g = bundle.getString("md5");
                fTSEmojiDownloadedEvent.f9141d.f9144b = bundle.getString("designerId");
                fTSEmojiDownloadedEvent.f9141d.f9147e = bundle.getString("aeskey");
                fTSEmojiDownloadedEvent.f9141d.f9148f = bundle.getString("encryptUrl");
                fTSEmojiDownloadedEvent.f9141d.f9150h = bundle.getString("productId");
                fTSEmojiDownloadedEvent.f9141d.f9146d = bundle.getString("name");
                fTSEmojiDownloadedEvent.f9141d.f9145c = bundle.getString("thumbUrl");
                fTSEmojiDownloadedEvent.publish();
                Log.m105925i("MicroMsg.WebSearch.FTSWebViewLogic", "GENERATE_EMOJI_PATH %s", fTSEmojiDownloadedEvent.f9142e.f9151a);
                Bundle bundle2 = new Bundle();
                bundle2.putString("emojiPath", fTSEmojiDownloadedEvent.f9142e.f9151a);
                return bundle2;
            } else if (i == 8) {
                C51593us3 us32 = new C51593us3();
                us32.f143104t = bundle.getString("reportString");
                C86709a0.m107524d().mo123460f(new C52464j0(us32));
            }
            return null;
        }

        public String xa0() {
            return (String) C86709a0.m107535s().mo121142i().mo119684e(-1535680990, (Object) null);
        }

        /* renamed from: xs */
        public int mo68151xs() {
            return C87716k.f253994a;
        }

        /* renamed from: ys */
        public boolean mo68152ys(int i) {
            MsgHandler a = C44040v3.m48330a(i);
            boolean z = a.f22712u;
            boolean z2 = C89625d.f257845k;
            if (z) {
                Log.m105929w("MicroMsg.WebViewStubService", "isBusy(%d), doingFunction = %s", Integer.valueOf(i), a.f22713v);
            } else if (z2 && a.f22714w) {
                Log.m105925i("MicroMsg.WebViewStubService", "isBusy(%d), awaiting proxyUI", Integer.valueOf(i));
                return true;
            }
            return z;
        }

        /* renamed from: zr */
        public void mo68153zr(String str, int i, Bundle bundle) {
            Class cls = C67309t0.class;
            boolean z = false;
            if (ImgUtil.isGif(str)) {
                IEmojiInfo Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(C86013q1.m106456q(str));
                if (Vs == null || !Vs.mo62633C1()) {
                    Vs = ((C67309t0) C86312j.m106911c(cls)).mo91189Vs(((C67309t0) C86312j.m106911c(cls)).mo91190WE(MMApplicationContext.getContext(), str));
                }
                int l = Vs == null ? 0 : (int) C86013q1.m106451l(Vs.mo62640K1());
                if (Vs != null) {
                    str = Vs.mo62640K1();
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                if ((BitmapUtil.decodeFile(str, options) != null && options.outHeight > C77092c.m93041c()) || options.outWidth > C77092c.m93041c()) {
                    z = true;
                }
                if (l > C77092c.m93039a() || z) {
                    C77426q qVar = new C77426q(MMApplicationContext.getContext());
                    qVar.mo107595g(WebViewStubService.this.getString(C0966R.string.f8198u2));
                    qVar.mo107589a(true);
                    qVar.mo107600l((C47883u) null);
                    qVar.mo107603o();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("Retr_File_Name", Vs == null ? "" : Vs.getMd5());
                intent.putExtra("Retr_Msg_Type", 5);
                intent.putExtra("Retr_MsgImgScene", 1);
                mo68122c(intent, bundle);
                intent.addFlags(268435456);
                mo68128e(intent, i);
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("Retr_File_Name", str);
            intent2.putExtra("Retr_Compress_Type", 0);
            intent2.putExtra("Retr_Msg_Type", 0);
            mo68122c(intent2, bundle);
            intent2.addFlags(268435456);
            mo68128e(intent2, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.stub.WebViewStubService$i */
    public static class C43782i extends C43784c.C43785a {

        /* renamed from: e */
        public boolean f118303e;

        /* renamed from: f */
        public int f118304f;

        public C43782i(C43781a aVar) {
        }

        /* renamed from: eQ */
        public boolean mo68154eQ() {
            return this.f118303e;
        }

        public int getRet() {
            return this.f118304f;
        }
    }

    public WebViewStubService() {
        C40008f fVar = C40008f.f107254d;
        this.f118269g = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
            {
                this.__eventId = 812146647;
            }

            public boolean callback(IEvent iEvent) {
                Map<String, Integer> map;
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                if ((recogQBarOfImageFileResultEvent instanceof RecogQBarOfImageFileResultEvent) && ((map = WebViewStubService.this.f118268f) == null || map.containsKey(recogQBarOfImageFileResultEvent.f265015d.f265016a))) {
                    Map<String, Integer> map2 = WebViewStubService.this.f118268f;
                    if (map2 != null) {
                        map2.remove(recogQBarOfImageFileResultEvent.f265015d.f265016a);
                    }
                    C86013q1.m106447h(recogQBarOfImageFileResultEvent.f265015d.f265016a);
                    C96874n1 n1Var = C96874n1.f283849a;
                    String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                    int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                    int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
                    Log.m105918d("MicroMsg.WebViewStubService", "result: " + d);
                    try {
                        Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                        while (it.hasNext()) {
                            WebViewStubCallbackWrapper webViewStubCallbackWrapper = (WebViewStubCallbackWrapper) it.next();
                            Log.m105919d("MicroMsg.WebViewStubService", "setRecogResultForQBarImg: %d", Integer.valueOf(webViewStubCallbackWrapper.f118439e));
                            if (WebViewStubService.m47618b(WebViewStubService.this, webViewStubCallbackWrapper)) {
                                webViewStubCallbackWrapper.f118438d.mo7030US(recogQBarOfImageFileResultEvent.f265015d.f265016a, d, b, c);
                            }
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.WebViewStubService", e, "", new Object[0]);
                    }
                }
                return false;
            }
        };
        this.f118270h = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
            {
                this.__eventId = 1700407223;
            }

            public boolean callback(IEvent iEvent) {
                RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
                Map<String, Integer> map = WebViewStubService.this.f118268f;
                if (map == null || map.containsKey(recogQBarOfImageFileFailedEvent.f107738d.f107739a)) {
                    Map<String, Integer> map2 = WebViewStubService.this.f118268f;
                    if (map2 != null) {
                        map2.remove(recogQBarOfImageFileFailedEvent.f107738d.f107739a);
                    }
                    Log.m105929w("MicroMsg.WebViewStubService", "delete qb recog fail: %s", recogQBarOfImageFileFailedEvent.f107738d.f107739a);
                    C86013q1.m106447h(recogQBarOfImageFileFailedEvent.f107738d.f107739a);
                }
                return false;
            }
        };
        this.f118271i = new ArrayList();
        this.f118272j = 0;
        this.f118281v = new HashSet();
        this.f118282w = -1;
        this.f118283x = new IListener<OnFinderFeedInfoUpdatedEvent>(this, fVar) {
            {
                this.__eventId = 1121981664;
            }

            public boolean callback(IEvent iEvent) {
                OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent = (OnFinderFeedInfoUpdatedEvent) iEvent;
                Log.m105927v("MicroMsg.WebViewStubService", "onFinderFeedInfoUpdatedEvent localFeedId: %s", onFinderFeedInfoUpdatedEvent.f107671d.f107672a);
                C44209a aVar = (C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0();
                aVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("localFeedId", onFinderFeedInfoUpdatedEvent.f107671d.f107672a);
                bundle.putBoolean("isLike", onFinderFeedInfoUpdatedEvent.f107671d.f107673b);
                bundle.putBoolean("isFav", onFinderFeedInfoUpdatedEvent.f107671d.f107675d);
                bundle.putInt("likeCount", onFinderFeedInfoUpdatedEvent.f107671d.f107674c);
                bundle.putInt("favCount", onFinderFeedInfoUpdatedEvent.f107671d.f107676e);
                aVar.mo68872c(bundle);
                return false;
            }
        };
        this.f118284y = new IListener<OnExitFinderFullscreenEvent>(this, fVar) {
            {
                this.__eventId = 1342273228;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105924i("MicroMsg.WebViewStubService", "onExitFinderFullscreenEvent");
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68874e(2, (OnExitFinderFullscreenEvent) iEvent);
                return false;
            }
        };
        this.f118285z = new IListener<OnEnterFinderFullscreenEvent>(this, fVar) {
            {
                this.__eventId = -97019376;
            }

            public boolean callback(IEvent iEvent) {
                Log.m105924i("MicroMsg.WebViewStubService", "onEnterFinderFullscreenEvent");
                ((C44209a) ((C45518r0) C86312j.m106911c(C45518r0.class)).gi0()).mo68874e(1, (OnEnterFinderFullscreenEvent) iEvent);
                return false;
            }
        };
        this.f118265A = new IListener<WebViewImagePreviewPositionChangedEvent>(fVar) {
            {
                this.__eventId = 193090981;
            }

            public boolean callback(IEvent iEvent) {
                WebViewImagePreviewPositionChangedEvent webViewImagePreviewPositionChangedEvent = (WebViewImagePreviewPositionChangedEvent) iEvent;
                Log.m105925i("MicroMsg.WebViewStubService", "onImagePreviewPositionChanged pos: %s, webViewId: %s", Integer.valueOf(webViewImagePreviewPositionChangedEvent.f107834d.f107836b), Integer.valueOf(webViewImagePreviewPositionChangedEvent.f107834d.f107835a));
                try {
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_webview_id", webViewImagePreviewPositionChangedEvent.f107834d.f107835a);
                    bundle.putInt("key_image_pos", webViewImagePreviewPositionChangedEvent.f107834d.f107836b);
                    Iterator it = ((ArrayList) WebViewStubService.this.f118271i).iterator();
                    while (it.hasNext()) {
                        ((WebViewStubCallbackWrapper) it.next()).f118438d.callback(121003, bundle);
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WebViewStubService", e, "onImagePreviewPositionChanged exception", new Object[0]);
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public static void m47617a(WebViewStubService webViewStubService, int i, Bundle bundle, int i2) {
        Iterator it = ((ArrayList) webViewStubService.f118271i).iterator();
        WebViewStubCallbackWrapper webViewStubCallbackWrapper = null;
        while (it.hasNext()) {
            WebViewStubCallbackWrapper webViewStubCallbackWrapper2 = (WebViewStubCallbackWrapper) it.next();
            if (webViewStubCallbackWrapper2 != null && webViewStubCallbackWrapper2.f118439e == i2) {
                webViewStubCallbackWrapper = webViewStubCallbackWrapper2;
            }
        }
        if (webViewStubCallbackWrapper != null && webViewStubCallbackWrapper.f118438d != null) {
            Intent intent = new Intent(webViewStubService, WebViewStubProxyUI.class);
            intent.putExtras(bundle);
            intent.putExtra("proxyui_action_code_key", i);
            intent.putExtra("webview_stub_callbacker_key", webViewStubCallbackWrapper);
            intent.putExtra("webview_binder_id", i2);
            intent.putExtra("screen_orientation", webViewStubService.f118282w);
            intent.addFlags(268435456);
            C6600v.m6910e(intent.getExtras(), "webview", ".stub.WebViewStubProxyUI", webViewStubCallbackWrapper.f118438d, new C6103g(webViewStubService, intent));
        }
    }

    /* renamed from: b */
    public static boolean m47618b(WebViewStubService webViewStubService, WebViewStubCallbackWrapper webViewStubCallbackWrapper) {
        webViewStubService.getClass();
        if (webViewStubCallbackWrapper == null) {
            return false;
        }
        IBinder asBinder = webViewStubCallbackWrapper.f118438d.asBinder();
        return asBinder.isBinderAlive() && asBinder.pingBinder();
    }

    public IBinder onBind(Intent intent) {
        Log.m105924i("MicroMsg.WebViewStubService", "WebViewStubService onBind");
        return this.f118267e;
    }

    public void onCreate() {
        Class cls = C45518r0.class;
        super.onCreate();
        Log.m105924i("MicroMsg.WebViewStubService", "WebViewStubService onCreate");
        this.f118273n = new MMHandler();
        this.f118274o = new C43778g();
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63955a(this.f118274o);
        this.f118275p = new C43779h();
        this.f118283x.alive();
        this.f118276q = new C43773b();
        this.f118284y.alive();
        this.f118285z.alive();
        this.f118277r = new C43774c();
        ((C44209a) ((C45518r0) C86312j.m106911c(cls)).gi0()).mo68870a(this.f118276q);
        ((C44209a) ((C45518r0) C86312j.m106911c(cls)).gi0()).mo68871b(this.f118277r);
        this.f118265A.alive();
        this.f118278s = new C43775d();
        C86709a0.m107529k().mo121126a(this.f118278s);
        this.f118279t = new C43776e();
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10739MV(this.f118279t);
        if (C86709a0.m107522a() && C6080m.Cx0() != null) {
            C6080m.Cx0().mo134802b(this.f118275p);
        }
        C43777f fVar = new C43777f();
        this.f118280u = fVar;
        C48471j.f129677a.add(fVar);
    }

    public void onDestroy() {
        Class cls = C45518r0.class;
        Log.m105924i("MicroMsg.WebViewStubService", "WebViewStubService onDestroy");
        super.onDestroy();
        ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63969q(this.f118274o);
        if (C86709a0.m107522a()) {
            C96649l1 Cx0 = C6080m.Cx0();
            C96650m mVar = this.f118275p;
            CopyOnWriteArraySet<C96650m> copyOnWriteArraySet = Cx0.f283040e;
            if (!(copyOnWriteArraySet == null || mVar == null)) {
                copyOnWriteArraySet.remove(mVar);
            }
        }
        C86709a0.m107529k().mo121129d(this.f118278s);
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10756rY(this.f118279t);
        C45514j0 gi02 = ((C45518r0) C86312j.m106911c(cls)).gi0();
        C43720k kVar = this.f118276q;
        ((C44209a) gi02).getClass();
        C87412m.m108594g(kVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ArrayList<C43720k> arrayList = C44209a.f119775b;
        synchronized (arrayList) {
            arrayList.remove(kVar);
        }
        C45514j0 gi03 = ((C45518r0) C86312j.m106911c(cls)).gi0();
        C43721l lVar = this.f118277r;
        ((C44209a) gi03).getClass();
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ArrayList<C43721l> arrayList2 = C44209a.f119776c;
        synchronized (arrayList2) {
            arrayList2.remove(lVar);
        }
        this.f118283x.dead();
        this.f118284y.dead();
        this.f118285z.dead();
        this.f118265A.dead();
        this.f118278s = null;
        this.f118274o = null;
        this.f118279t = null;
        ((ArrayList) this.f118271i).clear();
        C101705t tVar = this.f118280u;
        if (tVar != null) {
            C48471j.f129677a.remove(tVar);
        } else {
            LinkedList<C101705t> linkedList = C48471j.f129677a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02e9 A[Catch:{ Exception -> 0x0342 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02f4 A[Catch:{ Exception -> 0x0342 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0303 A[Catch:{ Exception -> 0x0342 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r22, int r23, java.lang.String r24, ob0.C117747y r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            int r5 = r25.getType()
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r9 = 0
            r7[r9] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r23)
            r10 = 1
            r7[r10] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r22)
            r11 = 2
            r7[r11] = r8
            r8 = 3
            r7[r8] = r3
            java.lang.String r12 = "MicroMsg.WebViewStubService"
            java.lang.String r13 = "onSceneEnd :[%d], errCode = %d, errType = %d, errMsg = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r7)
            r7 = 106(0x6a, float:1.49E-43)
            java.lang.String r13 = "scene_end_listener_hash_code"
            if (r5 != r7) goto L_0x013c
            ob0.b0 r6 = f40.C86709a0.m107524d()
            r6.mo123470p(r7, r1)
            if (r0 != 0) goto L_0x011f
            if (r2 == 0) goto L_0x0043
            goto L_0x011f
        L_0x0043:
            iu.c r4 = (p567iu.C46287c) r4
            te3.mx3 r4 = r4.mo70811l0()
            te3.rv3 r6 = r4.f227857d
            java.lang.String r6 = sf0.C48374j0.m53718g(r6)
            java.lang.Class<ln.g> r7 = p196ln.C76706g.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ln.g r7 = (p196ln.C76706g) r7
            ln.k r7 = r7.mo106826RE()
            te3.qv3 r8 = r4.f227862i
            byte[] r8 = sf0.C48374j0.m53715d(r8)
            com.tencent.mm.modelavatar.AvatarStorage r7 = (com.tencent.p014mm.modelavatar.AvatarStorage) r7
            r7.mo93572u(r6, r8)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.Class<ug.z> r8 = p248ug.C52574z.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ug.z r8 = (p248ug.C52574z) r8
            r9 = 30
            r8.mo73528B0(r7, r4, r9)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x04b8
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            com.tencent.mm.storage.u3 r8 = r8.mo96097Ni()
            com.tencent.mm.storage.z1 r8 = r8.get(r6)
            if (r8 == 0) goto L_0x009f
            boolean r8 = r8.mo62927s3()
            if (r8 != 0) goto L_0x009f
            java.lang.String r8 = "Contact_IsLBSFriend"
            r7.putExtra(r8, r10)
        L_0x009f:
            int r4 = r4.f227867q
            r4 = r4 & 8
            if (r4 <= 0) goto L_0x00c0
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r8 = 10298(0x283a, float:1.443E-41)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r11 = ","
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r4.kvStat(r8, r9)
        L_0x00c0:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r4)
            wc3.z r4 = j83.C9286a.f29044a
            com.tencent.mm.app.r1 r4 = (com.tencent.p014mm.app.C67654r1) r4
            r4.mo93174g(r7, r1)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r7 = "search_contact_result_user"
            r4.putString(r7, r6)
            java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r6 = r1.f118271i     // Catch:{ Exception -> 0x0104 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ Exception -> 0x0104 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0104 }
        L_0x00de:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x0104 }
            if (r7 == 0) goto L_0x04b8
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x0104 }
            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper r7 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper) r7     // Catch:{ Exception -> 0x0104 }
            com.tencent.mm.plugin.webview.stub.WebViewStubService$j r8 = new com.tencent.mm.plugin.webview.stub.WebViewStubService$j     // Catch:{ Exception -> 0x0104 }
            r8.<init>()     // Catch:{ Exception -> 0x0104 }
            r8.f118297e = r5     // Catch:{ Exception -> 0x0104 }
            r8.f118298f = r0     // Catch:{ Exception -> 0x0104 }
            r8.f118299g = r2     // Catch:{ Exception -> 0x0104 }
            r8.f118300h = r3     // Catch:{ Exception -> 0x0104 }
            r8.f118301i = r4     // Catch:{ Exception -> 0x0104 }
            int r9 = r7.f118439e     // Catch:{ Exception -> 0x0104 }
            r4.putInt(r13, r9)     // Catch:{ Exception -> 0x0104 }
            com.tencent.mm.plugin.webview.stub.m r7 = r7.f118438d     // Catch:{ Exception -> 0x0104 }
            r7.fq0(r8)     // Catch:{ Exception -> 0x0104 }
            goto L_0x00de
        L_0x0104:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onSceneEnd searchcontact fail, ex = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            goto L_0x04b8
        L_0x011f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onSceneEnd, sendcard errType = "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ", errCode = "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            return
        L_0x013c:
            r7 = 233(0xe9, float:3.27E-43)
            java.lang.String r14 = "onSceneEnd geta8key fail, ex = "
            if (r5 != r7) goto L_0x035d
            boolean r7 = r4 instanceof p728vs.C52991e
            if (r7 == 0) goto L_0x035d
            vs.e r4 = (p728vs.C52991e) r4
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            byte[] r15 = r4.mo63068c0()
            if (r15 == 0) goto L_0x0156
            int r6 = r15.length
            if (r6 > 0) goto L_0x015b
        L_0x0156:
            java.lang.String r6 = "getA8Key controlBytes is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r6)
        L_0x015b:
            if (r15 != 0) goto L_0x015e
            r15 = 0
        L_0x015e:
            java.lang.String r6 = "geta8key_result_jsapi_perm_control_bytes"
            r7.putByteArray(r6, r15)
            te3.bt1 r6 = r4.mo63060Q()
            if (r6 != 0) goto L_0x016b
            r6 = 0
            goto L_0x016d
        L_0x016b:
            int r6 = r6.f131299d
        L_0x016d:
            java.lang.String r15 = "geta8key_result_general_ctrl_b1"
            r7.putInt(r15, r6)
            int r6 = r4.mo63084z0()
            java.lang.String r15 = "geta8key_result_reason"
            r7.putInt(r15, r6)
            java.lang.String r6 = r4.mo63065Y()
            java.lang.String r15 = "geta8key_result_req_url"
            r7.putString(r15, r6)
            java.lang.String r6 = r4.mo63062R()
            java.lang.String r15 = "geta8key_result_full_url"
            r7.putString(r15, r6)
            java.lang.String r6 = r4.getTitle()
            java.lang.String r15 = "geta8key_result_title"
            r7.putString(r15, r6)
            int r6 = r4.mo63058K()
            java.lang.String r15 = "geta8key_result_action_code"
            r7.putInt(r15, r6)
            java.lang.String r6 = r4.getContent()
            java.lang.String r15 = "geta8key_result_content"
            r7.putString(r15, r6)
            java.lang.String r6 = r4.getHeadImg()
            java.lang.String r15 = "geta8key_result_head_img"
            r7.putString(r15, r6)
            java.lang.String r6 = r4.getWording()
            java.lang.String r15 = "geta8key_result_wording"
            r7.putString(r15, r6)
            r6 = r12
            long r11 = r4.mo63057J0()
            java.lang.String r15 = "geta8key_result_deep_link_bit_set"
            r7.putLong(r15, r11)
            java.lang.String r11 = r4.getUsername()
            java.lang.String r12 = "geta8key_data_username"
            r7.putString(r12, r11)
            byte[] r11 = r4.mo63063U()
            java.lang.String r12 = "geta8key_result_cookie"
            r7.putByteArray(r12, r11)
            java.lang.String r11 = r4.mo63066Z()
            java.lang.String r12 = "geta8key_result_menu_wording"
            r7.putString(r12, r11)
            byte[] r11 = r4.mo63059L0()
            java.lang.String r12 = "geta8key_result_verify_prefetch"
            r7.putByteArray(r12, r11)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            byte[] r12 = r4.mo63063U()
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r12)
            r11[r9] = r12
            java.lang.String r12 = "getA8KeyCookie:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r12, r11)
            java.util.List r11 = r4.getHttpHeader()
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r11)
            if (r12 != 0) goto L_0x0284
            java.util.Iterator r12 = r11.iterator()
        L_0x0207:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x022f
            java.lang.Object r15 = r12.next()
            te3.bh2 r15 = (te3.C48857bh2) r15
            if (r15 == 0) goto L_0x0228
            java.lang.String r10 = r15.f131120d
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0228
            java.lang.String r10 = r15.f131121e
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x0226
            goto L_0x0228
        L_0x0226:
            r10 = 1
            goto L_0x0207
        L_0x0228:
            java.lang.String r10 = "http header has null value"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r10)
            r10 = 1
            goto L_0x0230
        L_0x022f:
            r10 = 0
        L_0x0230:
            if (r10 != 0) goto L_0x0284
            int r10 = r11.size()
            java.lang.String[] r10 = new java.lang.String[r10]
            int r12 = r11.size()
            java.lang.String[] r12 = new java.lang.String[r12]
            r15 = 0
        L_0x023f:
            int r9 = r11.size()
            if (r15 >= r9) goto L_0x0277
            java.lang.Object r9 = r11.get(r15)
            te3.bh2 r9 = (te3.C48857bh2) r9
            r16 = r11
            java.lang.String r11 = r9.f131120d
            java.lang.String r9 = r9.f131121e
            r19 = r14
            java.lang.Object[] r14 = new java.lang.Object[r8]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r15)
            r18 = 0
            r14[r18] = r20
            r17 = 1
            r14[r17] = r11
            r20 = 2
            r14[r20] = r9
            r20 = r15
            java.lang.String r15 = "http header index = %d, key = %s, value = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r15, r14)
            r10[r20] = r11
            r12[r20] = r9
            int r15 = r20 + 1
            r11 = r16
            r14 = r19
            goto L_0x023f
        L_0x0277:
            r19 = r14
            java.lang.String r9 = "geta8key_result_http_header_key_list"
            r7.putStringArray(r9, r10)
            java.lang.String r9 = "geta8key_result_http_header_value_list"
            r7.putStringArray(r9, r12)
            goto L_0x0286
        L_0x0284:
            r19 = r14
        L_0x0286:
            java.util.ArrayList r9 = r4.mo63083v()
            java.lang.String r10 = "geta8key_result_scope_list"
            r7.putSerializable(r10, r9)
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = r4.mo63064U0()
            r12 = 0
            r10[r12] = r11
            java.lang.String r11 = r4.mo63062R()
            r12 = 1
            r10[r12] = r11
            java.lang.String r11 = r4.mo63065Y()
            r12 = 2
            r10[r12] = r11
            if (r9 == 0) goto L_0x02ab
            r9 = 1
            goto L_0x02ac
        L_0x02ab:
            r9 = 0
        L_0x02ac:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10[r8] = r9
            java.lang.String r8 = "geta8key onscened: share url:[%s], full url:[%s], req url:[%s], has scopeList:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r8, r10)
            java.lang.String r8 = r4.mo63064U0()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x02cd
            java.lang.String r8 = r4.mo63062R()
            java.lang.String r9 = r4.mo63064U0()
            com.tencent.p014mm.plugin.webview.model.C6038i2.m5917a(r8, r9)
            goto L_0x02e3
        L_0x02cd:
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r8 = r4.mo63062R()
            r10 = 0
            r9[r10] = r8
            java.lang.String r8 = r4.mo63065Y()
            r10 = 1
            r9[r10] = r8
            java.lang.String r8 = "null shareUrl, full url:[%s], req url:[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r8, r9)
        L_0x02e3:
            java.lang.Object r8 = r4.getTag()     // Catch:{ Exception -> 0x0342 }
            if (r8 == 0) goto L_0x02f4
            java.lang.Object r4 = r4.getTag()     // Catch:{ Exception -> 0x0342 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0342 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0342 }
            goto L_0x02f5
        L_0x02f4:
            r4 = 0
        L_0x02f5:
            java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r8 = r1.f118271i     // Catch:{ Exception -> 0x0342 }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ Exception -> 0x0342 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x0342 }
        L_0x02fd:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x0342 }
            if (r9 == 0) goto L_0x04b8
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x0342 }
            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper r9 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper) r9     // Catch:{ Exception -> 0x0342 }
            if (r4 == 0) goto L_0x0328
            int r10 = r9.f118439e     // Catch:{ Exception -> 0x0342 }
            if (r4 == r10) goto L_0x0328
            java.lang.String r10 = "geta8key hashcode not equal, this one = %d, that = %d"
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0342 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0342 }
            r14 = 0
            r12[r14] = r11     // Catch:{ Exception -> 0x0342 }
            int r9 = r9.f118439e     // Catch:{ Exception -> 0x0342 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0342 }
            r11 = 1
            r12[r11] = r9     // Catch:{ Exception -> 0x0342 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r10, r12)     // Catch:{ Exception -> 0x0342 }
            goto L_0x02fd
        L_0x0328:
            com.tencent.mm.plugin.webview.stub.WebViewStubService$j r10 = new com.tencent.mm.plugin.webview.stub.WebViewStubService$j     // Catch:{ Exception -> 0x0342 }
            r10.<init>()     // Catch:{ Exception -> 0x0342 }
            r10.f118297e = r5     // Catch:{ Exception -> 0x0342 }
            r10.f118298f = r0     // Catch:{ Exception -> 0x0342 }
            r10.f118299g = r2     // Catch:{ Exception -> 0x0342 }
            r10.f118300h = r3     // Catch:{ Exception -> 0x0342 }
            r10.f118301i = r7     // Catch:{ Exception -> 0x0342 }
            int r11 = r9.f118439e     // Catch:{ Exception -> 0x0342 }
            r7.putInt(r13, r11)     // Catch:{ Exception -> 0x0342 }
            com.tencent.mm.plugin.webview.stub.m r9 = r9.f118438d     // Catch:{ Exception -> 0x0342 }
            r9.fq0(r10)     // Catch:{ Exception -> 0x0342 }
            goto L_0x02fd
        L_0x0342:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r7 = r19
            r2.append(r7)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x04b8
        L_0x035d:
            r6 = r12
            r7 = r14
            r8 = 673(0x2a1, float:9.43E-43)
            if (r5 != r8) goto L_0x03f0
            com.tencent.mm.plugin.webview.model.a0 r4 = (com.tencent.p014mm.plugin.webview.model.C43695a0) r4
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            ob0.c r9 = r4.f118074d
            if (r9 != 0) goto L_0x0370
            r9 = 0
            goto L_0x0378
        L_0x0370:
            ob0.c$d r9 = r9.f127056b
            pe3.a r9 = r9.f127083a
            te3.c72 r9 = (te3.C48966c72) r9
            java.lang.String r9 = r9.f131558d
        L_0x0378:
            java.lang.String r10 = "reading_mode_result_url"
            r8.putString(r10, r9)
            java.lang.Object r4 = r4.f118076f     // Catch:{ Exception -> 0x03d7 }
            if (r4 == 0) goto L_0x0388
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x03d7 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x03d7 }
            goto L_0x0389
        L_0x0388:
            r4 = 0
        L_0x0389:
            java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r9 = r1.f118271i     // Catch:{ Exception -> 0x03d7 }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ Exception -> 0x03d7 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x03d7 }
        L_0x0391:
            boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x03d7 }
            if (r10 == 0) goto L_0x04b8
            java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x03d7 }
            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper r10 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper) r10     // Catch:{ Exception -> 0x03d7 }
            if (r4 == 0) goto L_0x03bd
            int r11 = r10.f118439e     // Catch:{ Exception -> 0x03d7 }
            if (r4 == r11) goto L_0x03bd
            java.lang.String r11 = " get readingmodeinfo, hashcode not equal, this one = %d, that = %d"
            r12 = 2
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x03d7 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x03d7 }
            r16 = 0
            r14[r16] = r12     // Catch:{ Exception -> 0x03d7 }
            int r10 = r10.f118439e     // Catch:{ Exception -> 0x03d7 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x03d7 }
            r12 = 1
            r14[r12] = r10     // Catch:{ Exception -> 0x03d7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r11, r14)     // Catch:{ Exception -> 0x03d7 }
            goto L_0x0391
        L_0x03bd:
            com.tencent.mm.plugin.webview.stub.WebViewStubService$j r11 = new com.tencent.mm.plugin.webview.stub.WebViewStubService$j     // Catch:{ Exception -> 0x03d7 }
            r11.<init>()     // Catch:{ Exception -> 0x03d7 }
            r11.f118297e = r5     // Catch:{ Exception -> 0x03d7 }
            r11.f118298f = r0     // Catch:{ Exception -> 0x03d7 }
            r11.f118299g = r2     // Catch:{ Exception -> 0x03d7 }
            r11.f118300h = r3     // Catch:{ Exception -> 0x03d7 }
            r11.f118301i = r8     // Catch:{ Exception -> 0x03d7 }
            int r12 = r10.f118439e     // Catch:{ Exception -> 0x03d7 }
            r8.putInt(r13, r12)     // Catch:{ Exception -> 0x03d7 }
            com.tencent.mm.plugin.webview.stub.m r10 = r10.f118438d     // Catch:{ Exception -> 0x03d7 }
            r10.fq0(r11)     // Catch:{ Exception -> 0x03d7 }
            goto L_0x0391
        L_0x03d7:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            goto L_0x04b8
        L_0x03f0:
            r7 = 666(0x29a, float:9.33E-43)
            if (r5 != r7) goto L_0x04b8
            bq.j1 r4 = (p008bq.C39832j1) r4
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            te3.el2 r8 = r4.mo62461B()
            java.lang.String r8 = r8.f132996d
            java.lang.String r9 = "emoji_stroe_product_id"
            r7.putString(r9, r8)
            if (r0 != 0) goto L_0x043d
            if (r2 != 0) goto L_0x043d
            java.lang.String r8 = r7.getString(r9)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r9 = 0
            r10[r9] = r8
            java.lang.String r9 = "[cpan] onsceneend url:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r9, r10)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r9 != 0) goto L_0x043d
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            java.lang.String r10 = "extra_id"
            r9.putExtra(r10, r8)
            java.lang.String r8 = "preceding_scence"
            r10 = 12
            r9.putExtra(r8, r10)
            java.lang.String r8 = "download_entrance_scene"
            r9.putExtra(r8, r10)
            java.lang.String r8 = "emoji"
            java.lang.String r10 = ".ui.EmojiStoreDetailUI"
            r11 = 0
            ke3.C88144b.m109791i(r1, r8, r10, r9, r11)
        L_0x043d:
            java.lang.Object r8 = r4.getTag()     // Catch:{ Exception -> 0x049f }
            if (r8 == 0) goto L_0x044e
            java.lang.Object r4 = r4.getTag()     // Catch:{ Exception -> 0x049f }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x049f }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x049f }
            goto L_0x044f
        L_0x044e:
            r4 = 0
        L_0x044f:
            java.util.List<com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper> r8 = r1.f118271i     // Catch:{ Exception -> 0x049f }
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ Exception -> 0x049f }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x049f }
        L_0x0457:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x049f }
            if (r9 == 0) goto L_0x04b8
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x049f }
            com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper r9 = (com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewStubCallbackWrapper) r9     // Catch:{ Exception -> 0x049f }
            if (r4 == 0) goto L_0x0482
            int r10 = r9.f118439e     // Catch:{ Exception -> 0x049f }
            if (r4 == r10) goto L_0x0482
            java.lang.String r10 = "jumpEmojiDetail, hashcode not equal, this one = %d, that = %d"
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x049f }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x049f }
            r15 = 0
            r12[r15] = r14     // Catch:{ Exception -> 0x049f }
            int r9 = r9.f118439e     // Catch:{ Exception -> 0x049f }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x049f }
            r14 = 1
            r12[r14] = r9     // Catch:{ Exception -> 0x049f }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r10, r12)     // Catch:{ Exception -> 0x049f }
            goto L_0x0457
        L_0x0482:
            r11 = 2
            r14 = 1
            r15 = 0
            com.tencent.mm.plugin.webview.stub.WebViewStubService$j r10 = new com.tencent.mm.plugin.webview.stub.WebViewStubService$j     // Catch:{ Exception -> 0x049f }
            r10.<init>()     // Catch:{ Exception -> 0x049f }
            r10.f118297e = r5     // Catch:{ Exception -> 0x049f }
            r10.f118298f = r0     // Catch:{ Exception -> 0x049f }
            r10.f118299g = r2     // Catch:{ Exception -> 0x049f }
            r10.f118300h = r3     // Catch:{ Exception -> 0x049f }
            r10.f118301i = r7     // Catch:{ Exception -> 0x049f }
            int r12 = r9.f118439e     // Catch:{ Exception -> 0x049f }
            r7.putInt(r13, r12)     // Catch:{ Exception -> 0x049f }
            com.tencent.mm.plugin.webview.stub.m r9 = r9.f118438d     // Catch:{ Exception -> 0x049f }
            r9.fq0(r10)     // Catch:{ Exception -> 0x049f }
            goto L_0x0457
        L_0x049f:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onSceneEnd MMFunc_JumpEmotionDetail fail, ex = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x04b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.stub.WebViewStubService.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }

    public boolean onUnbind(Intent intent) {
        Log.m105924i("MicroMsg.WebViewStubService", "WebViewStubService onUnbind");
        SparseArray<MsgHandler> sparseArray = C44040v3.f119319a;
        Log.m105924i("MicroMsg.MsgHandlerHolder", "detach");
        synchronized (C44040v3.class) {
            int i = 0;
            while (true) {
                SparseArray<MsgHandler> sparseArray2 = C44040v3.f119319a;
                if (i < sparseArray2.size()) {
                    MsgHandler valueAt = sparseArray2.valueAt(i);
                    sparseArray2.keyAt(i);
                    i++;
                } else {
                    sparseArray2.clear();
                }
            }
            while (true) {
            }
        }
        if (C44040v3.f119320b != null) {
            C44040v3.f119320b = null;
        }
        ((HashMap) C6038i2.f22316a).clear();
        return super.onUnbind(intent);
    }
}
