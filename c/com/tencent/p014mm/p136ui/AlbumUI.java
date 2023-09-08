package com.tencent.p014mm.p136ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C112911a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.CustomViewPager;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86737h0;
import h81.C32735h;
import java.util.HashMap;
import jr2.C99015i;
import jw2.C99069d;
import l31.C61212e;
import mt2.C47101a;
import o31.C11345b;
import o31.C76986a;
import oa1.C117731d;
import os2.C100398c0;
import os2.C100399d0;
import p626nv.C109759g;
import p773yy.C79168k;
import qy2.C77448f0;
import te3.tg4;
import xv2.C102775d;

@C86737h0
/* renamed from: com.tencent.mm.ui.AlbumUI */
public class AlbumUI extends MMSecDataActivity {

    /* renamed from: h */
    public static final /* synthetic */ int f121104h = 0;

    /* renamed from: d */
    public DoubleTabView f121105d = null;

    /* renamed from: e */
    public HashMap<Integer, MMFragment> f121106e = new HashMap<>();

    /* renamed from: f */
    public boolean f121107f = false;

    /* renamed from: g */
    public boolean f121108g = false;
    /* access modifiers changed from: private */
    public CustomViewPager mViewPager = null;

    /* renamed from: com.tencent.mm.ui.AlbumUI$a */
    public class C44674a extends C112911a0 {
        public C44674a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public int getCount() {
            return AlbumUI.this.f121107f ? 1 : 2;
        }

        public Fragment getItem(int i) {
            AlbumUI albumUI = AlbumUI.this;
            int i2 = AlbumUI.f121104h;
            albumUI.getClass();
            Log.m105919d("MicroMsg.AlbumUI", "get tab %d", Integer.valueOf(i));
            MMFragment mMFragment = null;
            if (i < 0) {
                return null;
            }
            if (albumUI.f121106e.containsKey(Integer.valueOf(i))) {
                return albumUI.f121106e.get(Integer.valueOf(i));
            }
            Class cls = C102775d.class;
            Bundle bundle = new Bundle();
            if (albumUI.f121107f) {
                mMFragment = ((C102775d) C86312j.m106911c(cls)).Eg0().mo108964P5(albumUI, bundle);
            } else if (i == 0) {
                mMFragment = ((C99015i) C86312j.m106911c(C99015i.class)).mo61934P5(albumUI, bundle);
            } else if (i == 1) {
                mMFragment = C77448f0.m93394f() ? ((C79168k) C86312j.m106911c(C79168k.class)).mo74117O9(albumUI, bundle) : ((C102775d) C86312j.m106911c(cls)).Eg0().mo108964P5(albumUI, bundle);
            }
            Log.m105927v("MicroMsg.AlbumUI", "createFragment index:%d", Integer.valueOf(i));
            if (mMFragment != null) {
                mMFragment.setParent(albumUI);
            }
            albumUI.f121106e.put(Integer.valueOf(i), mMFragment);
            return mMFragment;
        }
    }

    /* renamed from: com.tencent.mm.ui.AlbumUI$b */
    public static class C44675b implements C115619a {

        /* renamed from: d */
        public DoubleTabView f121110d;

        public C44675b(DoubleTabView doubleTabView, String str) {
            this.f121110d = doubleTabView;
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f121110d;
        }

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            if (z) {
                DoubleTabView doubleTabView = this.f121110d;
                doubleTabView.f121145s = true;
                MMTabView mMTabView = doubleTabView.f121140n;
                if (mMTabView != null) {
                    mMTabView.f121184e.setVisibility(0);
                }
            } else {
                DoubleTabView doubleTabView2 = this.f121110d;
                doubleTabView2.f121145s = false;
                MMTabView mMTabView2 = doubleTabView2.f121140n;
                if (mMTabView2 != null) {
                    mMTabView2.f121184e.setVisibility(4);
                }
            }
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            return false;
        }

        public String getPath() {
            return "textstate_history";
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            return false;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return false;
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
        }
    }

    public void dealContentView(View view) {
        int i;
        Resources resources;
        super.dealContentView(view);
        this.f121107f = getIntent().getBooleanExtra("story_only", false);
        this.f121108g = getIntent().getBooleanExtra("story_dot", false);
        if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_sns_reset_userpage_md5", "1", false, true), 1) > 0) {
            Log.m105924i("MicroMsg.AlbumUI", "AlbumUI resetMd5");
            C100399d0 Xx0 = C94866e1.Xx0();
            Xx0.getClass();
            SnsMethodCalculate.markStartTimeMs("resetAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
            C100398c0 Yt = Xx0.mo139782Yt(C75592q0.m90789s());
            Yt.field_albumMd5 = "";
            Xx0.mo139790nP(Yt);
            SnsMethodCalculate.markEndTimeMs("resetAlbumMd5", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        }
        DoubleTabView doubleTabView = (DoubleTabView) findViewById(C0966R.C0970id.f5769o5);
        this.f121105d = doubleTabView;
        if (this.f121107f) {
            doubleTabView.setVisibility(8);
        } else {
            doubleTabView.setFirstTabString(getResources().getString(C0966R.string.f7542j6));
            boolean f = C77448f0.m93394f();
            if (f) {
                resources = getResources();
                i = C0966R.string.f7543j7;
            } else {
                resources = getResources();
                i = C0966R.string.f7544j8;
            }
            this.f121105d.setSecondTabString(resources.getString(i));
            if (f) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175770k(new C44675b(this.f121105d, "textstate_history"));
            }
            if (f) {
                addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C45025f(this));
                showOptionMenu(false);
            }
            this.f121105d.setOnTabClickListener(new C45026g(this));
        }
        CustomViewPager customViewPager = (CustomViewPager) findViewById(C0966R.C0970id.f5774o_);
        this.mViewPager = customViewPager;
        customViewPager.setOnPageChangeListener(new C45027h(this));
        this.mViewPager.setAdapter(new C44674a(getSupportFragmentManager()));
        if (!this.f121107f && getIntent().getBooleanExtra("status_default", false)) {
            this.f121105d.setTo(1);
            this.mViewPager.setCurrentItem(1);
        }
        C99069d dVar = C99069d.f290418a;
        C99069d.f290419b.f266262d = 3;
        dVar.mo138413b();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bbs;
    }

    public void onCreate(Bundle bundle) {
        C85875k4.m106195m0(this);
        fixStatusbar(true);
        super.onCreate(bundle);
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", true);
        setRequestedOrientation(1);
        SnsMethodCalculate.markStartTimeMs("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        C47101a.f126572a = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_group_dynamic_label_enable, true);
        Log.m105924i("MicroMsg.SnsLabelRangeConfig", "updateNewLabelRangeControl enableNewGroupUI:" + C47101a.f126572a);
        SnsMethodCalculate.markEndTimeMs("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.SnsUserUI).mo86179qs(this, C76986a.Album);
    }

    public void onDestroy() {
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", false);
        super.onDestroy();
    }
}
