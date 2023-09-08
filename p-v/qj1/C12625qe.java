package qj1;

import ak1.C0073g0;
import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import cl1.C54991o;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.FinderMarqueeTextView;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import ok1.C62042e;
import org.json.JSONObject;
import org.libpag.PAGView;
import p192l4.C10462b;
import rx3.C13598b0;
import te3.C49712hj1;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: qj1.qe */
public final class C12625qe extends C62660c {

    /* renamed from: p */
    public final ViewGroup f36185p;

    /* renamed from: q */
    public final C58124b f36186q;

    /* renamed from: r */
    public final boolean f36187r;

    /* renamed from: qj1.qe$a */
    public static final class C12626a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C12625qe f36188d;

        public C12626a(C12625qe qeVar) {
            this.f36188d = qeVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveSingSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FinderLiveService.f159376d.getClass();
            if (FinderLiveService.f159380h) {
                C58124b.C7172a.m7372a(this.f36188d.f36186q, C58124b.C58125b.FINDER_LIVE_ANCHOR_MUSIC_SING_SONG_LIST_SHOW, (Bundle) null, 2, (Object) null);
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C0073g0 g0Var = C0073g0.LIVING_SING_SONG;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "2");
                C13598b0 b0Var = C13598b0.f38549a;
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
            } else {
                C58124b.C7172a.m7372a(this.f36188d.f36186q, C58124b.C58125b.FINDER_LIVE_VISITOR_MUSIC_SING_SONG_LIST_SHOW, (Bundle) null, 2, (Object) null);
                C7335d c2 = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
                C54067f0.C54076o0 o0Var = C54067f0.C54076o0.LIVING_SING_SONG;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", "2");
                C13598b0 b0Var2 = C13598b0.f38549a;
                C54116w.Ex0((C54116w) c2, o0Var, jSONObject2.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveSingSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: qj1.qe$b */
    public static final class C12627b extends C23555k.C23562d {
        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            FinderLiveService.f159376d.getClass();
            if (FinderLiveService.f159380h) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C0073g0 g0Var = C0073g0.LIVING_SING_SONG;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "1");
                C13598b0 b0Var = C13598b0.f38549a;
                C8777j5.C8778a.m8605f((C8777j5) c, g0Var, jSONObject.toString(), (String) null, 4, (Object) null);
                return;
            }
            C7335d c2 = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c2, "getService(HellLiveVisitorReoprter::class.java)");
            C54067f0.C54076o0 o0Var = C54067f0.C54076o0.LIVING_SING_SONG;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "1");
            C13598b0 b0Var2 = C13598b0.f38549a;
            C54116w.Ex0((C54116w) c2, o0Var, jSONObject2.toString(), 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
        }
    }

    /* renamed from: qj1.qe$c */
    public /* synthetic */ class C12628c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36189a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[7] = 1;
            f36189a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12625qe(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "rootView");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f36185p = viewGroup;
        this.f36186q = bVar;
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup;
        int i = C0966R.C0970id.mvt;
        if (((WeImageView) C10462b.m10395a(viewGroup, C0966R.C0970id.mvt)) != null) {
            i = C0966R.C0970id.mvu;
            if (((FrameLayout) C10462b.m10395a(viewGroup, C0966R.C0970id.mvu)) != null) {
                i = C0966R.C0970id.f359213mw3;
                if (((PAGView) C10462b.m10395a(viewGroup, C0966R.C0970id.f359213mw3)) != null) {
                    i = C0966R.C0970id.mw4;
                    if (((FinderMarqueeTextView) C10462b.m10395a(viewGroup, C0966R.C0970id.mw4)) != null) {
                        this.f36187r = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76821Vb();
                        mo10792g(8);
                        viewGroup.setOnClickListener(new C12626a(this));
                        C23564m.m28138h(viewGroup, new C12627b());
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C12628c.f36189a[bVar.ordinal()] == 1) {
            Class cls = C54994o1.class;
            FinderLiveService.f159376d.getClass();
            if (!FinderLiveService.f159380h) {
                ((C54994o1) mo87696x0(cls)).f154402i.observe(this, new C12663se(this));
            } else if (C62042e.f176370a.mo86994C()) {
                ((C54994o1) mo87696x0(cls)).f154402i.observe(this, new C12649re(this));
            }
            ((C54994o1) mo87696x0(cls)).f154400g.observe(this, new C12675te(this));
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        mo10792g(8);
    }
}
