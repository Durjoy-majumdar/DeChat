package kh1;

import a14.C53934p0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fe1.C58961d;
import fe1.C58969q;
import gh1.C8313a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import nk1.C11207i;
import org.json.JSONObject;
import qo3.C89779i0;
import wx3.C15601d;
import wx3.C66212f;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: kh1.f */
public final class C10086f extends C8313a {

    /* renamed from: j */
    public RelativeLayout f30866j;

    /* renamed from: n */
    public Bitmap f30867n;

    /* renamed from: o */
    public Bitmap f30868o;

    /* renamed from: p */
    public Bitmap f30869p;

    /* renamed from: q */
    public C89779i0 f30870q;

    /* renamed from: r */
    public C53973z1 f30871r;

    /* renamed from: s */
    public C53973z1 f30872s;

    /* renamed from: kh1.f$a */
    public static final class C10087a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10086f f30873d;

        public C10087a(C10086f fVar) {
            this.f30873d = fVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/ShareEntranceController$onViewMount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C10086f fVar = this.f30873d;
            fVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 2);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…, 2)\n        }.toString()");
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCREEN_SHOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            C53973z1 z1Var = fVar.f30871r;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            RelativeLayout relativeLayout = fVar.f30866j;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            C58969q b = C58961d.f168673a.mo84155b(((C54991o) fVar.business(C54991o.class)).f154345o);
            String nickname = b != null ? b.getNickname() : null;
            Log.m105924i("FinderLiveScreenShotShareEntranceController", "#onEntranceClick live_id=" + ((C55001u) fVar.business(C55001u.class)).f154420q.f182392d + " nickname=" + nickname);
            fVar.f30872s = C11207i.m11066b(fVar, (C66212f) null, (C53934p0) null, new C10082e(fVar, nickname, (C15601d<? super C10082e>) null), 3, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/ShareEntranceController$onViewMount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kh1.f$b */
    public static final class C10088b extends C23555k.C23562d {
        /* renamed from: b */
        public void mo53b(View view, long j, long j2, boolean z) {
            C87412m.m108594g(view, "view");
            if (z) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", 1);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…             }.toString()");
                C7335d c = C86312j.m106911c(C54116w.class);
                C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCREEN_SHOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10086f(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo10516m3(boolean z, DialogInterface.OnCancelListener onCancelListener) {
        Context context;
        Log.m105924i("FinderLiveScreenShotShareEntranceController", "#showOrDismissLoading show=" + z);
        if (z) {
            C89779i0 i0Var = this.f30870q;
            boolean z2 = true;
            if (i0Var == null) {
                RelativeLayout relativeLayout = this.f30866j;
                if (relativeLayout != null && (context = relativeLayout.getContext()) != null) {
                    this.f30870q = C89779i0.m112248e(context, context.getString(C0966R.string.ett), true, 2, onCancelListener);
                    return;
                }
                return;
            }
            if (i0Var == null || i0Var.isShowing()) {
                z2 = false;
            }
            if (z2) {
                C89779i0 i0Var2 = this.f30870q;
                if (i0Var2 != null) {
                    i0Var2.setOnCancelListener(onCancelListener);
                }
                C89779i0 i0Var3 = this.f30870q;
                if (i0Var3 != null) {
                    i0Var3.show();
                    return;
                }
                return;
            }
            return;
        }
        C89779i0 i0Var4 = this.f30870q;
        if (i0Var4 != null) {
            i0Var4.dismiss();
        }
    }

    public void onLiveActivate() {
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        RelativeLayout relativeLayout = (RelativeLayout) mo9309f3(C0966R.C0970id.o7l, C0966R.C0970id.o7k);
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new C10087a(this));
        }
        if (relativeLayout != null) {
            C23564m.m28138h(relativeLayout, new C10088b());
        }
        this.f30866j = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        this.f30867n = null;
        this.f30868o = null;
        C53973z1 z1Var = this.f30871r;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        RelativeLayout relativeLayout = this.f30866j;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }
}
