package com.tencent.p014mm.plugin.webview.luggage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.ball.p1099ui.C105076l;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hn3.C108252a;
import nj3.C88990b;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;
import p828wa.C53106j;
import uv0.C111237j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.i */
public class C43594i implements C111237j {

    /* renamed from: a */
    public C43658n f117837a;

    /* renamed from: b */
    public Intent f117838b;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.i$a */
    public class C43595a implements C88990b.C61771c {

        /* renamed from: a */
        public final /* synthetic */ C111237j.C52622b f117839a;

        public C43595a(C43594i iVar, C111237j.C52622b bVar) {
            this.f117839a = bVar;
        }

        public void onComplete(boolean z) {
            ((C105076l) this.f117839a).mo149224a(z);
        }
    }

    public C43594i(C43658n nVar) {
        Intent intent = new Intent();
        this.f117838b = intent;
        this.f117837a = nVar;
        intent.putExtras(nVar.f148261n);
    }

    /* renamed from: a */
    public int mo35652a() {
        return mo67887h() ? -1 : 0;
    }

    /* renamed from: b */
    public ViewGroup mo23512b() {
        return mo67887h() ? (ViewGroup) getActivity().getWindow().getDecorView() : (ViewGroup) this.f117837a.f148258h.getParent();
    }

    /* renamed from: c */
    public boolean mo35779c() {
        return true;
    }

    /* renamed from: d */
    public void mo23513d(boolean z) {
        if (!C53106j.this.mo73791f(false)) {
            Activity activity = (Activity) this.f117837a.f148196d;
            if (z) {
                activity.getIntent().putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2461dn);
                activity.getIntent().putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
            } else {
                activity.getIntent().putExtra("MMActivity.OverrideExitAnimation", 0);
                activity.getIntent().putExtra("MMActivity.OverrideEnterAnimation", 0);
            }
            activity.finish();
        }
    }

    /* renamed from: e */
    public void mo23514e(C111237j.C52621a aVar) {
    }

    /* renamed from: f */
    public void mo23515f(C111237j.C52622b bVar) {
        if (mo67887h()) {
            C88990b.m111194c(getActivity(), new C43595a(this, bVar));
        } else {
            ((C105076l) bVar).mo149224a(true);
        }
    }

    /* renamed from: g */
    public boolean mo23516g() {
        return this.f117837a.f148258h != null;
    }

    public Activity getActivity() {
        return (Activity) this.f117837a.f148196d;
    }

    public Bitmap getBitmap() {
        return C108252a.m146585c(getContentView());
    }

    public View getContentView() {
        if (!mo67887h()) {
            return ((SwipeBackLayout) this.f117837a.f148258h).getTargetView();
        }
        if (((MMActivity) getActivity()).getSwipeBackLayout() != null) {
            return ((MMActivity) getActivity()).getSwipeBackLayout().getTargetContentView();
        }
        return null;
    }

    public Intent getIntent() {
        if (!Util.isNullOrNil(this.f117837a.mo67942u())) {
            this.f117838b.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f117837a.mo67942u());
        }
        return this.f117838b;
    }

    public View getMaskView() {
        return getContentView();
    }

    /* renamed from: h */
    public final boolean mo67887h() {
        Log.m105924i("MicroMsg.LuggageFloatBallPageAdapter", "useActivityEnv: " + C53106j.this.f148204d.size());
        return C53106j.this.f148204d.size() <= 1;
    }
}
