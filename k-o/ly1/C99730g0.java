package ly1;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.widget.ThreeDotsLoadingView;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import j20.C117292a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import lb0.C88394b;
import ly1.C99723d;
import org.json.JSONArray;
import vw1.C102299l;
import w10.C15032a;

/* renamed from: ly1.g0 */
public class C99730g0 extends FrameLayout {

    /* renamed from: d */
    public C99723d f292290d;

    /* renamed from: e */
    public View f292291e;

    /* renamed from: f */
    public View f292292f;

    /* renamed from: g */
    public C99765p f292293g;

    /* renamed from: h */
    public C88668z f292294h;

    /* renamed from: i */
    public ThreeDotsLoadingView f292295i;

    /* renamed from: j */
    public int f292296j;

    /* renamed from: n */
    public long f292297n;

    /* renamed from: o */
    public boolean f292298o = true;

    /* renamed from: p */
    public int f292299p;

    /* renamed from: ly1.g0$b */
    public class C10664b implements Runnable {
        public C10664b() {
        }

        public void run() {
            C99730g0 g0Var = C99730g0.this;
            View inflate = LayoutInflater.from(g0Var.getContext()).inflate(C0966R.C0971layout.awb, g0Var, false);
            C104428a aVar = new C104428a(g0Var.getContext(), 0);
            aVar.setContentView(inflate);
            String str = C88394b.f255384g;
            C88394b bVar = C88394b.C88418q.f255427a;
            bVar.mo122786b((ImageView) inflate.findViewById(C0966R.C0970id.f358338ei0), HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmc) + "/wechatgame/product/cdn/null/photo_3x_a59269f6.png", (Drawable) null, (C88394b.C88408j) null);
            ((Button) inflate.findViewById(C0966R.C0970id.f358339ei1)).setOnClickListener(new C10663f0(g0Var, aVar));
            aVar.show();
            g0Var.mo139083b(503, 1, (Map) null);
        }
    }

    /* renamed from: ly1.g0$a */
    public class C99731a implements C99723d.C99725b {

        /* renamed from: ly1.g0$a$a */
        public class C99732a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f292301d;

            /* renamed from: e */
            public final /* synthetic */ boolean f292302e;

            /* renamed from: ly1.g0$a$a$a */
            public class C99733a implements Runnable {
                public C99733a() {
                }

                public void run() {
                    C99730g0.this.f292294h.mo118896b();
                }
            }

            public C99732a(LinkedList linkedList, boolean z) {
                this.f292301d = linkedList;
                this.f292302e = z;
            }

            public void run() {
                if (!((Activity) C99730g0.this.getContext()).isFinishing() && !((Activity) C99730g0.this.getContext()).isDestroyed()) {
                    C99730g0.this.postDelayed(new C99733a(), 100);
                    C99730g0.this.mo139084c(this.f292301d, this.f292302e, false);
                }
            }
        }

        public C99731a() {
        }

        /* renamed from: a */
        public void mo129209a(LinkedList<C102299l> linkedList, boolean z) {
            C99730g0.this.post(new C99732a(linkedList, z));
        }
    }

    public C99730g0(Context context, int i) {
        super(context);
        this.f292296j = i;
        mo139083b(0, 1, (Map) null);
    }

    /* access modifiers changed from: private */
    public void getDataFromNet() {
        this.f292290d.mo139078d(new C99731a());
    }

    /* renamed from: b */
    public final void mo139083b(int i, int i2, Map map) {
        if (map == null) {
            map = new HashMap();
        }
        C40314g.m43484c(MMApplicationContext.getContext(), 87, 8766, i, i2, this.f292299p, C15032a.m14200a(6, map));
    }

    /* renamed from: c */
    public final void mo139084c(LinkedList<C102299l> linkedList, boolean z, boolean z2) {
        View view = this.f292292f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        Log.m105925i("MicroMsg.GameTabGalleryView", "setData, data is null : %b", Boolean.valueOf(Util.isNullOrNil((List) linkedList)));
        if (!Util.isNullOrNil((List) linkedList)) {
            View view2 = this.f292291e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "hideEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (MultiProcessMMKV.getMMKV(C99723d.m130164b("game_haowan_mmkv_key")).getBoolean("game_tab_gallery_first_enter", true)) {
                MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(C99723d.m130164b("game_haowan_mmkv_key"));
                mmkv.putBoolean("game_tab_gallery_first_enter", false);
                mmkv.apply();
                MMHandlerThread.postToMainThreadDelayed(new C10664b(), 500);
            }
        } else {
            View view4 = this.f292291e;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo139083b(502, 1, (Map) null);
        }
        this.f292293g.mo139126x1(linkedList, z, z2);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f292290d.mo139076a();
    }

    public void setLocalAlbumInfos(JSONArray jSONArray) {
        C99723d dVar = new C99723d();
        this.f292290d = dVar;
        C99723d.f292267p = dVar;
        dVar.mo139081h(jSONArray);
        C99765p pVar = new C99765p(getContext(), 8766, this.f292299p);
        this.f292293g = pVar;
        pVar.setBackgroundColor(-1);
        this.f292293g.mo17043c(new C99720a0(this));
        this.f292293g.setOnItemClickListener(new C99721b0(this));
        C88668z zVar = new C88668z(getContext());
        this.f292294h = zVar;
        zVar.setPullDownEnabled(true);
        this.f292294h.setNeedStay(true);
        this.f292294h.setOnPullDownListener(new C88665d0(this));
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.aua, this, false);
        this.f292295i = (ThreeDotsLoadingView) inflate.findViewById(C0966R.C0970id.ena);
        this.f292294h.mo118900f(inflate, this.f292293g);
        addView(this.f292294h, -1, -1);
        View inflate2 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.au8, this, false);
        this.f292291e = inflate2;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = inflate2;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(this.f292291e, -1, -1);
        View inflate3 = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.au_, this, false);
        this.f292292f = inflate3;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        View view2 = inflate3;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "createLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(this.f292292f, -1, -1);
        LinkedList<C102299l> c = this.f292290d.mo139077c();
        if (Util.isNullOrNil((List) c)) {
            View view3 = this.f292292f;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/game/media/GameTabGalleryView", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((ThreeDotsLoadingView) this.f292292f.findViewById(C0966R.C0970id.em6)).mo119903e();
        } else {
            mo139084c(c, false, true);
            postDelayed(new C88666e0(this), 0);
        }
        getDataFromNet();
    }
}
