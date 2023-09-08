package com.tencent.p014mm.plugin.p081mv.p082ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvSongInfoUIC;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Set;
import kotlin.Metadata;
import kq1.C10399s;
import la2.C99364n;
import nj3.C88989a;
import p529fv.C59326j;
import sb2.C13642k;
import sb2.C63741b;
import sb2.C63743c;
import sb2.C63756e;
import sb2.C63801l;
import sb2.C63807m;
import sb2.C63816o;
import sb2.C63849t0;
import sx3.C110826x0;
import sx3.C48501y0;
import va2.C102164a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMainUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(32)
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMainUI */
public final class MusicMvMainUI extends BaseMusicMvUI {

    /* renamed from: h */
    public static final /* synthetic */ int f163017h = 0;

    /* renamed from: e */
    public final String f163018e = "MicroMsg.Mv.MusicMvMainUI";

    /* renamed from: f */
    public final MusicMvMainUI$musicPlayEventListener$1 f163019f;

    /* renamed from: g */
    public final IListener<?> f163020g;

    public MusicMvMainUI() {
        C40008f fVar = C40008f.f107254d;
        this.f163019f = new MusicMvMainUI$musicPlayEventListener$1(this, fVar);
        this.f163020g = new MusicMvMainUI$musicCheckErrorListener$1(this, fVar);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bj6;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        Set<Class<? extends UIComponent>> importUIComponents = super.importUIComponents();
        if (importUIComponents == null) {
            return null;
        }
        return C48501y0.m53872g(importUIComponents, C110826x0.m151017e(C63756e.class, C63849t0.class, MusicMvSongInfoUIC.class, C63807m.class, C63741b.class, MusicMvMainUIC.class, C10399s.class, C13642k.class, C63816o.class, C63743c.class, C63801l.class));
    }

    public void onCreate(Bundle bundle) {
        Class cls = C59326j.class;
        super.onCreate(bundle);
        if (!(C99364n.f291354g != null)) {
            finish();
            Log.m105920e(this.f163018e, "MusicPlayerManager is not init!");
            return;
        }
        C102164a.f300830b = "2.0";
        ((C59326j) C86312j.m106911c(cls)).mo84429HI(getIntent().getExtras());
        if (getIntent().getStringExtra("key_mv_thumb_path") == null) {
            ((C59326j) C86312j.m106911c(cls)).mo84431a8(getIntent().getStringExtra("key_mv_album_cover_url"));
        }
        hideTitleView();
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(1280);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.ahf));
        hideActionbarLine();
    }

    public void onCreateBeforeSetContentView() {
        setBounceEnabled(false);
        super.onCreateBeforeSetContentView();
    }

    public void onDestroy() {
        super.onDestroy();
        C102164a.f300830b = "1.0";
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105924i(this.f163018e, "onNewIntent");
    }

    public void onPause() {
        super.onPause();
        this.f163019f.dead();
        this.f163020g.dead();
    }

    public void onResume() {
        super.onResume();
        this.f163019f.alive();
        this.f163020g.alive();
    }
}
