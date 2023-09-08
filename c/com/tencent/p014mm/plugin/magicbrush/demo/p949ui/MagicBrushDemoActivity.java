package com.tencent.p014mm.plugin.magicbrush.demo.p949ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86195z;
import gy3.C87412m;
import kotlin.Metadata;
import l42.C88381b;
import l42.C88382c;
import o42.C89116a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/demo/ui/MagicBrushDemoActivity;", "Lcom/tencent/mm/ui/MMActivity;", "Landroid/view/View;", "view", "Lrx3/b0;", "onClick", "<init>", "()V", "mb-samples_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.demo.ui.MagicBrushDemoActivity */
public final class MagicBrushDemoActivity extends MMActivity {

    /* renamed from: d */
    public final String f248399d = "MagicBrushDemoActivity";

    /* renamed from: e */
    public C88381b f248400e;

    /* renamed from: f */
    public FrameLayout f248401f;

    /* renamed from: com.tencent.mm.plugin.magicbrush.demo.ui.MagicBrushDemoActivity$a */
    public static final class C85255a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ MagicBrushDemoActivity f248402d;

        public C85255a(MagicBrushDemoActivity magicBrushDemoActivity) {
            this.f248402d = magicBrushDemoActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f248402d.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo118411H7(C88381b bVar) {
        if (this.f248400e != null) {
            Log.m105918d(this.f248399d, "demoLogic has isInitialized!");
            C88381b bVar2 = this.f248400e;
            if (bVar2 != null) {
                ViewGroup viewGroup = bVar2.f255371c;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    C86195z<C88381b> zVar = bVar2.f255370b;
                    if (zVar != null) {
                        zVar.destroy();
                    } else {
                        C87412m.m108603p("magicBrush");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("containerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("magicBrushDemoLogic");
                throw null;
            }
        }
        this.f248400e = bVar;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d0_;
    }

    public final void onClick(View view) {
        C87412m.m108594g(view, "view");
        int id = view.getId();
        if (id == C0966R.C0970id.dsp) {
            mo118411H7(new C88381b());
            C88381b bVar = this.f248400e;
            if (bVar != null) {
                FrameLayout frameLayout = this.f248401f;
                if (frameLayout != null) {
                    bVar.f255371c = frameLayout;
                    C88381b bVar2 = this.f248400e;
                    if (bVar2 != null) {
                        bVar2.mo122784g0(this);
                    } else {
                        C87412m.m108603p("magicBrushDemoLogic");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("containerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("magicBrushDemoLogic");
                throw null;
            }
        } else if (id == C0966R.C0970id.nga) {
            mo118411H7(new C88382c());
            C88381b bVar3 = this.f248400e;
            if (bVar3 != null) {
                FrameLayout frameLayout2 = this.f248401f;
                if (frameLayout2 != null) {
                    bVar3.f255371c = frameLayout2;
                    C89116a aVar = C89116a.f256769a;
                    if (this.f248400e != null) {
                        aVar.getClass();
                        Log.m105924i(C89116a.f256770b, "MagicBrushDemoPublicService start");
                        C88381b bVar4 = this.f248400e;
                        if (bVar4 != null) {
                            bVar4.mo122784g0(this);
                        } else {
                            C87412m.m108603p("magicBrushDemoLogic");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("magicBrushDemoLogic");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("containerView");
                    throw null;
                }
            } else {
                C87412m.m108603p("magicBrushDemoLogic");
                throw null;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("MagicBrush2.0 Demo");
        setBackBtn(new C85255a(this));
        ((FrameLayout) findViewById(C0966R.C0970id.ndh)).setBackgroundColor(-1);
        View findViewById = findViewById(C0966R.C0970id.ndi);
        C87412m.m108593f(findViewById, "findViewById(R.id.democontainer)");
        this.f248401f = (FrameLayout) findViewById;
    }

    public void onDestroy() {
        super.onDestroy();
        C88381b bVar = this.f248400e;
        if (bVar != null) {
            bVar.mo122783f0();
        } else {
            C87412m.m108603p("magicBrushDemoLogic");
            throw null;
        }
    }
}
