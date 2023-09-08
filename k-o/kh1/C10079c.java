package kh1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView;
import com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gh1.C59440c;
import gh1.C8313a;
import gi1.C8324b;
import gy3.C87412m;
import hh1.C59894a;
import j20.C117292a;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: kh1.c */
public final class C10079c extends C8313a implements C59440c, C59894a {

    /* renamed from: j */
    public RelativeLayout f30852j;

    /* renamed from: n */
    public ShellView f30853n;

    /* renamed from: o */
    public boolean f30854o;

    /* renamed from: kh1.c$a */
    public static final class C10080a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C10079c f30855d;

        public C10080a(C10079c cVar) {
            this.f30855d = cVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/ShareCardController$onViewMount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f30855d.mo10512m3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/ShareCardController$onViewMount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10079c(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: J1 */
    public void mo9728J1(C8324b bVar) {
        C87412m.m108594g(bVar, "micInfoData");
        int size = bVar.f27279b.size();
        Log.m105924i("FinderLiveScreenShotShareCardController", "#onMicInfoChanged size=" + size);
        boolean z = true;
        if (size <= 1) {
            z = false;
        }
        this.f30854o = z;
    }

    /* renamed from: e */
    public boolean mo9121e() {
        RelativeLayout relativeLayout = this.f30852j;
        if (!(relativeLayout != null && relativeLayout.getVisibility() == 0)) {
            return false;
        }
        mo10512m3();
        return true;
    }

    /* renamed from: g2 */
    public void mo9729g2(boolean z) {
    }

    /* renamed from: m3 */
    public final void mo10512m3() {
        mo10513n3();
        RelativeLayout relativeLayout = this.f30852j;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* renamed from: n3 */
    public final void mo10513n3() {
        ShellView shellView = this.f30853n;
        if (shellView != null) {
            ScreenShotView screenShotView = shellView.f15055d;
            if (screenShotView != null) {
                screenShotView.f15024g.setImageBitmap((Bitmap) null);
                screenShotView.f15027j.setImageBitmap((Bitmap) null);
                screenShotView.f15028n.setImageBitmap((Bitmap) null);
                screenShotView.f15029o.setImageBitmap((Bitmap) null);
                screenShotView.f15030p.setImageBitmap((Bitmap) null);
                screenShotView.f15031q.setText("");
                screenShotView.f15032r.setText("");
                screenShotView.f15033s.setImageBitmap((Bitmap) null);
                ViewParent parent = shellView.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(shellView);
                }
                this.f30853n = null;
                return;
            }
            C87412m.m108603p("screenShotView");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onLiveActivate() {
    }

    public void onNewIntent(Intent intent) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C59440c.C8315a.m8366a(this, i, strArr, iArr);
    }

    public boolean onSwipeBack() {
        return false;
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        RelativeLayout relativeLayout = (RelativeLayout) mo9309f3(C0966R.C0970id.o7j, C0966R.C0970id.o7i);
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
            relativeLayout.setOnClickListener(new C10080a(this));
        } else {
            relativeLayout = null;
        }
        this.f30852j = relativeLayout;
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        mo10512m3();
    }

    public void resume() {
    }

    /* renamed from: v0 */
    public void mo9732v0(JSONObject jSONObject) {
    }

    /* renamed from: x0 */
    public void mo9131x0(boolean z, int i) {
    }
}
