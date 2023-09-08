package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderFeedDetailUI;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayerListener;
import er1.C58784w3;
import gy3.C87412m;
import java.util.Set;
import jq3.C60905o;
import kf1.C9640c;
import kf1.C9707f;
import kotlin.Metadata;
import o40.C61926c;
import rs1.C13194da;
import rs1.C13539y3;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63648v;
import rs1.C63654v2;
import sx3.C110826x0;
import vf1.C14784k;
import vf1.C14788l;
import ye1.C15976o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lkf1/f;", "V", "Lkf1/c;", "P", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI */
public abstract class FinderBaseFeedUI<V extends C9707f, P extends C9640c> extends MMFinderFeedDetailUI {

    /* renamed from: o */
    public C15976o f14258o;

    /* renamed from: N7 */
    public abstract P mo2955N7();

    /* renamed from: O7 */
    public abstract V mo2956O7();

    /* renamed from: P7 */
    public void mo2957P7() {
    }

    /* renamed from: Q7 */
    public abstract void mo2958Q7();

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13539y3.class, C63513a1.class, C13194da.class, C63648v.class, C63545b1.class, C56711j.class, C63654v2.class);
    }

    public boolean isHideStatusBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        FinderVideoLayout finderVideoLayout;
        super.onActivityResult(i, i2, intent);
        mo2955N7().mo2579r5().mo79925c(i, i2, intent);
        if (-1 == i2 && i == 101) {
            RecyclerView recyclerView = mo2956O7().getRecyclerView();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                RecyclerView.C16631z I0 = recyclerView.mo17023I0(((LinearLayoutManager) layoutManager).mo16957C());
                C60905o oVar = I0 instanceof C60905o ? (C60905o) I0 : null;
                if (oVar != null && (finderVideoLayout = (FinderVideoLayout) oVar.mo85812D(C0966R.C0970id.d7a)) != null) {
                    long longExtra = intent != null ? intent.getLongExtra("KEY_CACHE_OBJECT_ID", -1) : -1;
                    long longExtra2 = intent != null ? intent.getLongExtra("KEY_VIDEO_START_PLAY_TIME_MS", -1) : -1;
                    Log.m105924i("FinderBaseFeedUI", "[onActivityResult] feedId=" + C61926c.m72691p(longExtra) + " seekTime=" + longExtra2);
                    if (longExtra2 != -1) {
                        FinderVideoLayout.m65079J(finderVideoLayout, longExtra2, 0, 0.0f, false, (ITPPlayerListener.IOnSeekCompleteListener) null, 30, (Object) null);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (((rs1.C63575n3) r0).mo88421d3(false) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackPressed() {
        /*
            r3 = this;
            kf1.c r0 = r3.mo2955N7()
            boolean r0 = r0.mo10276S0()
            r1 = 0
            if (r0 != 0) goto L_0x0024
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r0 = r0.mo62444c(r3)
            java.lang.Class<rs1.n3> r2 = rs1.C63575n3.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(this).get…allNormalUIC::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            rs1.n3 r0 = (rs1.C63575n3) r0
            boolean r0 = r0.mo88421d3(r1)
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            if (r1 != 0) goto L_0x002a
            r3.finish()
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.p052ui.FinderBaseFeedUI.onBackPressed():void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        LayoutInflater b = C85868k2.m106137b(getContext());
        View bodyView = getBodyView();
        C87412m.m108592e(bodyView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) bodyView;
        View inflate = b.inflate(C0966R.C0971layout.f359694ac3, viewGroup, false);
        viewGroup.addView(inflate);
        this.f14258o = C15976o.m14888a(inflate);
        int f = C75044y4.m89994f(this);
        C15976o oVar = this.f14258o;
        if (oVar != null) {
            oVar.f42961e.setPadding(0, f, 0, 0);
            C15976o oVar2 = this.f14258o;
            if (oVar2 != null) {
                oVar2.f42957a.setOnClickListener(new C14784k(this));
                if (C85875k4.m106208w()) {
                    C15976o oVar3 = this.f14258o;
                    if (oVar3 != null) {
                        oVar3.f42964h.setVisibility(0);
                        C15976o oVar4 = this.f14258o;
                        if (oVar4 != null) {
                            oVar4.f42963g.setVisibility(0);
                        } else {
                            C87412m.m108603p("finderFullActionBarLayoutBinding");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("finderFullActionBarLayoutBinding");
                        throw null;
                    }
                } else {
                    C15976o oVar5 = this.f14258o;
                    if (oVar5 != null) {
                        oVar5.f42964h.setVisibility(8);
                        C15976o oVar6 = this.f14258o;
                        if (oVar6 != null) {
                            oVar6.f42963g.setVisibility(8);
                        } else {
                            C87412m.m108603p("finderFullActionBarLayoutBinding");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("finderFullActionBarLayoutBinding");
                        throw null;
                    }
                }
                C15976o oVar7 = this.f14258o;
                if (oVar7 != null) {
                    oVar7.f42964h.setOnClickListener(new C14788l(this));
                    CharSequence mMTitle = getMMTitle();
                    if (mMTitle == null || mMTitle.length() == 0) {
                        C15976o oVar8 = this.f14258o;
                        if (oVar8 != null) {
                            oVar8.f42959c.setVisibility(8);
                        } else {
                            C87412m.m108603p("finderFullActionBarLayoutBinding");
                            throw null;
                        }
                    } else {
                        C15976o oVar9 = this.f14258o;
                        if (oVar9 != null) {
                            oVar9.f42959c.setVisibility(0);
                            C15976o oVar10 = this.f14258o;
                            if (oVar10 != null) {
                                oVar10.f42959c.setText(getMMTitle());
                            } else {
                                C87412m.m108603p("finderFullActionBarLayoutBinding");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("finderFullActionBarLayoutBinding");
                            throw null;
                        }
                    }
                    C58784w3.f168295a.mo83945l(getWindow(), false);
                    setNavigationbarColor(getResources().getColor(C0966R.color.f3131gg));
                    C15976o oVar11 = this.f14258o;
                    if (oVar11 != null) {
                        oVar11.f42961e.setVisibility(0);
                        View findViewById = findViewById(C0966R.C0970id.ivb);
                        if (findViewById != null) {
                            findViewById.setLayoutParams(new CoordinatorLayout.C103717e(-1, -1));
                            findViewById.setBackgroundResource(C0966R.color.f3493v5);
                        }
                        mo2958Q7();
                        mo2955N7().mo2487N0(mo2956O7());
                        mo2957P7();
                        return;
                    }
                    C87412m.m108603p("finderFullActionBarLayoutBinding");
                    throw null;
                }
                C87412m.m108603p("finderFullActionBarLayoutBinding");
                throw null;
            }
            C87412m.m108603p("finderFullActionBarLayoutBinding");
            throw null;
        }
        C87412m.m108603p("finderFullActionBarLayoutBinding");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        mo2955N7().onDetach();
    }

    public void onPause() {
        super.onPause();
        mo2955N7().mo10277T0();
    }

    public void onResume() {
        super.onResume();
        mo2955N7().mo10278W0();
    }
}
