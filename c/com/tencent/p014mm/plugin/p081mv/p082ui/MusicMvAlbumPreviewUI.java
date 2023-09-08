package com.tencent.p014mm.plugin.p081mv.p082ui;

import android.os.Bundle;
import android.view.View;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvAlbumPreviewRecyclerUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvAlbumPreviewSelectedUIC;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import sb2.C63738a;
import sx3.C110826x0;
import sx3.C48501y0;
import te3.C64525lh3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvAlbumPreviewUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI */
public final class MusicMvAlbumPreviewUI extends MMSecDataActivity {

    /* renamed from: d */
    public static C64525lh3 f163015d;

    /* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI$a */
    public static final class C56898a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MusicMvAlbumPreviewUI f163016d;

        public C56898a(MusicMvAlbumPreviewUI musicMvAlbumPreviewUI) {
            this.f163016d = musicMvAlbumPreviewUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/MusicMvAlbumPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((MusicMvAlbumPreviewSelectedUIC) C39818r.f106831a.mo62444c(this.f163016d).mo75002a(MusicMvAlbumPreviewSelectedUIC.class)).mo80445e3(0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/MusicMvAlbumPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.biq;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C63738a.class, MusicMvAlbumPreviewRecyclerUIC.class, MusicMvAlbumPreviewSelectedUIC.class));
    }

    public void onBackPressed() {
        ((MusicMvAlbumPreviewSelectedUIC) C39818r.f106831a.mo62444c(this).mo75002a(MusicMvAlbumPreviewSelectedUIC.class)).mo80445e3(0);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.f3496v_));
        hideTitleView();
        setNavigationbarColor(getResources().getColor(C0966R.color.f3496v_));
        findViewById(C0966R.C0970id.f357484a32).setOnClickListener(new C56898a(this));
    }

    public void onPause() {
        Log.printDebugStack("MicroMsg.GlobalMusicMvFloatBallUtil", "alvinluo Mv onPause hideAllFloatBall: %s, resumeFloatBall: %b", Boolean.FALSE, Boolean.valueOf(true & true));
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSwipeBack() {
        ((MusicMvAlbumPreviewSelectedUIC) C39818r.f106831a.mo62444c(this).mo75002a(MusicMvAlbumPreviewSelectedUIC.class)).mo80445e3(0);
        super.onSwipeBack();
    }
}
