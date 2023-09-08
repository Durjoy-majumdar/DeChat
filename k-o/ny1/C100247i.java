package ny1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.plugin.game.commlib.view.CycleProgressView;
import com.tencent.p014mm.plugin.webview.model.C6048m1;
import com.tencent.p014mm.plugin.webview.model.C96649l1;
import com.tencent.p014mm.plugin.webview.model.C96650m;
import com.tencent.p014mm.plugin.webview.model.C96651n;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.p014mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.p014mm.plugin.webview.modeltools.C6080m;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import j20.C117292a;
import java.util.concurrent.CopyOnWriteArraySet;
import junit.framework.Assert;
import k20.C60958c;
import k20.C9556a;
import my1.C100022a;
import uy1.C52642c;
import vw1.C102299l;

/* renamed from: ny1.i */
public class C100247i {

    /* renamed from: k */
    public static final String f293697k = (C41872f.m45392b(C41872f.C41873a.ONE_WEEK) + "haowan/");

    /* renamed from: a */
    public Context f293698a;

    /* renamed from: b */
    public View f293699b;

    /* renamed from: c */
    public CycleProgressView f293700c;

    /* renamed from: d */
    public String f293701d;

    /* renamed from: e */
    public C102299l f293702e;

    /* renamed from: f */
    public C100252d f293703f;

    /* renamed from: g */
    public long f293704g;

    /* renamed from: h */
    public boolean f293705h = false;

    /* renamed from: i */
    public C96651n f293706i = new C100249b();

    /* renamed from: j */
    public C96650m f293707j = new C100250c();

    /* renamed from: ny1.i$a */
    public class C100248a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C102299l f293708d;

        public C100248a(C102299l lVar) {
            this.f293708d = lVar;
        }

        public void run() {
            String str;
            String str2 = C100247i.f293697k + "thumb_" + System.currentTimeMillis() + ".jpg";
            C100247i iVar = C100247i.this;
            String str3 = this.f293708d.f301300i;
            iVar.getClass();
            WebViewJSSDKVideoItem c = C100022a.m130689c(str3);
            if (c == null) {
                c = null;
            } else {
                WebViewJSSDKFileItem b = C6048m1.f22342b.mo7010b(C100022a.m130688b(str2, str3));
                if (b != null) {
                    c.f283023f = b.f283024g;
                }
            }
            if (c != null && (str = c.f283022e) != null) {
                iVar.f293701d = str;
                C96649l1 Cx0 = C6080m.Cx0();
                C96651n nVar = iVar.f293706i;
                CopyOnWriteArraySet<C96651n> copyOnWriteArraySet = Cx0.f283039d;
                if (!(copyOnWriteArraySet == null || nVar == null || copyOnWriteArraySet.contains(nVar))) {
                    Cx0.f283039d.add(nVar);
                }
                C6080m.Cx0().mo134802b(iVar.f293707j);
                MMHandlerThread.postToMainThread(new C100254j(iVar, c));
            }
        }
    }

    /* renamed from: ny1.i$b */
    public class C100249b implements C96651n {
        public C100249b() {
        }

        /* renamed from: a */
        public void mo6964a(boolean z, int i, String str, String str2, String str3, String str4) {
            String str5 = str;
            String str6 = str3;
            if (C100247i.this.f293701d.equals(str5)) {
                View view = C100247i.this.f293699b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper$5", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper$5", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                Log.m105925i("MicroMsg.Haowan.VideoShareWrapper", "success : %b, errCode: %d, localId : %s, mediaId : %s, mediaUrl : %s, costTime: %d", Boolean.valueOf(z), Integer.valueOf(i), str5, str2, str6, Long.valueOf(System.currentTimeMillis() - C100247i.this.f293704g));
                C100247i iVar = C100247i.this;
                C100252d dVar = iVar.f293703f;
                if (dVar != null) {
                    dVar.mo139530a(new C100253e(iVar, iVar.f293702e, str6, str4));
                }
            }
        }
    }

    /* renamed from: ny1.i$c */
    public class C100250c implements C96650m {

        /* renamed from: ny1.i$c$a */
        public class C100251a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f293712d;

            public C100251a(int i) {
                this.f293712d = i;
            }

            public void run() {
                C100247i.this.f293700c.setProgress(this.f293712d);
            }
        }

        public C100250c() {
        }

        /* renamed from: R */
        public void mo68082R(boolean z, int i, int i2, String str, String str2) {
            if (C100247i.this.f293701d.equals(str)) {
                Log.m105919d("MicroMsg.Haowan.VideoShareWrapper", "localId:%s, upload video percent:%d", str, Integer.valueOf(i2));
                MMHandlerThread.postToMainThread(new C100251a(i2));
            }
        }
    }

    /* renamed from: ny1.i$d */
    public interface C100252d {
        /* renamed from: a */
        void mo139530a(C100253e eVar);
    }

    public C100247i(Context context, View view) {
        this.f293698a = context;
        this.f293699b = view;
        this.f293700c = (CycleProgressView) view.findViewById(C0966R.C0970id.byp);
    }

    /* renamed from: a */
    public final void mo139531a(C102299l lVar, C100252d dVar) {
        if (lVar != null) {
            this.f293705h = false;
            this.f293702e = lVar;
            this.f293703f = dVar;
            if (lVar.f301295d) {
                View view = this.f293699b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "prepareShare", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;Lcom/tencent/mm/plugin/game/media/preview/VideoShareWrapper$PrepareCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "prepareShare", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;Lcom/tencent/mm/plugin/game/media/preview/VideoShareWrapper$PrepareCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C52642c.m58994l().postToWorker(new C100248a(lVar));
            } else if (dVar != null) {
                dVar.mo139530a(new C100253e(this, lVar));
            }
        }
    }

    /* renamed from: b */
    public void mo139532b() {
        this.f293705h = true;
        View view = this.f293699b;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "stopShare", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "stopShare", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean e = C6080m.Cx0().mo134805e(this.f293701d);
        C6080m.Cx0().mo134808h(this.f293706i);
        C96649l1 Cx0 = C6080m.Cx0();
        C96650m mVar = this.f293707j;
        CopyOnWriteArraySet<C96650m> copyOnWriteArraySet = Cx0.f283040e;
        if (!(copyOnWriteArraySet == null || mVar == null)) {
            copyOnWriteArraySet.remove(mVar);
        }
        Log.m105925i("MicroMsg.Haowan.VideoShareWrapper", "cancel share task ret:%b, localId:%s", Boolean.valueOf(e), this.f293701d);
    }

    /* renamed from: ny1.i$e */
    public class C100253e {

        /* renamed from: a */
        public String f293714a;

        /* renamed from: b */
        public String f293715b;

        /* renamed from: c */
        public String f293716c;

        /* renamed from: d */
        public String f293717d = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.flk) + "/cgi-bin/h5/static/appcenter/index.html?v_d=eY1maoA1&no_cache=1");

        public C100253e(C100247i iVar, C102299l lVar) {
            Assert.assertTrue("need net video", lVar.f301295d);
            this.f293714a = lVar.f301308t;
            this.f293715b = lVar.f301301j;
            this.f293716c = lVar.f301299h;
        }

        public C100253e(C100247i iVar, C102299l lVar, String str, String str2) {
            Assert.assertTrue("need local video", !lVar.f301295d);
            this.f293714a = lVar.f301308t;
            this.f293715b = lVar.f301301j;
            this.f293716c = str2;
        }
    }
}
