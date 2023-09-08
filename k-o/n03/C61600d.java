package n03;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.thumbplayer.view.recycler.MMRecyclerVideoLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C31543z5;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j03.C60695a;
import j03.C60700d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import o40.C61926c;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: n03.d */
public final class C61600d implements C61598b {

    /* renamed from: a */
    public final AppCompatActivity f175180a;

    /* renamed from: b */
    public final int f175181b;

    /* renamed from: c */
    public final String f175182c = "TP.Recycler";

    /* renamed from: d */
    public final String f175183d = "MicroMsg.TP.MMVideoLayoutRecycler";

    /* renamed from: e */
    public final ConcurrentLinkedDeque<MMRecyclerVideoLayout> f175184e = new ConcurrentLinkedDeque<>();

    /* renamed from: f */
    public final ConcurrentHashMap<MMRecyclerVideoLayout, Long> f175185f = new ConcurrentHashMap<>();

    /* renamed from: n03.d$a */
    public static final class C61601a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61597a f175186d;

        /* renamed from: e */
        public final /* synthetic */ C61600d f175187e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61601a(C61597a aVar, C61600d dVar) {
            super(0);
            this.f175186d = aVar;
            this.f175187e = dVar;
        }

        public Object invoke() {
            C60700d player$plugin_thumbplayer_release = ((MMRecyclerVideoLayout) this.f175186d).getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release != null) {
                player$plugin_thumbplayer_release.f172879j = new C61599c(this.f175187e, this.f175186d);
            }
            C60700d player$plugin_thumbplayer_release2 = ((MMRecyclerVideoLayout) this.f175186d).getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release2 != null) {
                player$plugin_thumbplayer_release2.stop();
            }
            return C13598b0.f38549a;
        }
    }

    public C61600d(AppCompatActivity appCompatActivity, int i, int i2) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f175180a = appCompatActivity;
        this.f175181b = i;
    }

    /* renamed from: a */
    public void mo86535a(C61597a aVar) {
        C87412m.m108594g(aVar, "videoLayout");
        if (aVar instanceof MMRecyclerVideoLayout) {
            MMRecyclerVideoLayout mMRecyclerVideoLayout = (MMRecyclerVideoLayout) aVar;
            ViewParent parent = mMRecyclerVideoLayout.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView((View) aVar);
            }
            C60700d player$plugin_thumbplayer_release = mMRecyclerVideoLayout.getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release != null) {
                player$plugin_thumbplayer_release.mo85609g();
            }
            C60700d player$plugin_thumbplayer_release2 = mMRecyclerVideoLayout.getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release2 != null) {
                C60695a.C60696a.m70998a(player$plugin_thumbplayer_release2, false, 1, (Object) null);
            }
            C61926c.m72661F(this.f175182c, new C61601a(aVar, this));
        }
    }

    /* renamed from: b */
    public C61597a mo86536b() {
        String str;
        MMRecyclerVideoLayout mMRecyclerVideoLayout = (MMRecyclerVideoLayout) C110818d0.m150915M(this.f175184e);
        if (mMRecyclerVideoLayout != null) {
            this.f175184e.remove(mMRecyclerVideoLayout);
            str = "from idle queue";
        } else {
            mMRecyclerVideoLayout = new MMRecyclerVideoLayout(this.f175180a);
            str = "from create";
        }
        mMRecyclerVideoLayout.setId(this.f175181b);
        this.f175185f.put(mMRecyclerVideoLayout, Long.valueOf(C31543z5.m39453c()));
        String str2 = this.f175183d;
        Log.m105924i(str2, "getOrCreateVideoLayout " + str);
        return mMRecyclerVideoLayout;
    }

    public void destroy() {
        for (MMRecyclerVideoLayout player$plugin_thumbplayer_release : this.f175184e) {
            C60700d player$plugin_thumbplayer_release2 = player$plugin_thumbplayer_release.getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release2 != null) {
                player$plugin_thumbplayer_release2.recycle();
            }
        }
        for (Map.Entry<MMRecyclerVideoLayout, Long> key : this.f175185f.entrySet()) {
            C60700d player$plugin_thumbplayer_release3 = ((MMRecyclerVideoLayout) key.getKey()).getPlayer$plugin_thumbplayer_release();
            if (player$plugin_thumbplayer_release3 != null) {
                player$plugin_thumbplayer_release3.recycle();
            }
        }
        this.f175184e.clear();
        this.f175185f.clear();
    }
}
