package com.tencent.p014mm.plugin.topstory.p113ui.home;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.plugin.topstory.p113ui.home.TopStoryHomeUIComponentImpl;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.n */
public class C19352n implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ TabLayout f54572d;

    /* renamed from: e */
    public final /* synthetic */ TopStoryHomeUIComponentImpl f54573e;

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.n$a */
    public class C19353a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f54574d;

        public C19353a(int i) {
            this.f54574d = i;
        }

        public void run() {
            int i = this.f54574d;
            TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = C19352n.this.f54573e;
            int i2 = topStoryHomeUIComponentImpl.f54492A;
            if (i == i2) {
                ((TopStoryHomeUIComponentImpl.C19340m) ((ArrayList) topStoryHomeUIComponentImpl.f54525z).get(i2)).f54556c.setVisibility(8);
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onPageScrollStateChanged hide fakeIv " + C19352n.this.f54573e.f54492A);
            }
        }
    }

    public C19352n(TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl, TabLayout tabLayout) {
        this.f54573e = topStoryHomeUIComponentImpl;
        this.f54572d = tabLayout;
    }

    public void onPageScrollStateChanged(int i) {
        Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onPageScrollStateChanged:" + i);
        if (i == 0) {
            TopStoryHomeUIComponentImpl topStoryHomeUIComponentImpl = this.f54573e;
            if (topStoryHomeUIComponentImpl.f54499H) {
                topStoryHomeUIComponentImpl.f54523x.postDelayed(new C19353a(topStoryHomeUIComponentImpl.f54492A), 100);
                return;
            }
            topStoryHomeUIComponentImpl.f54499H = true;
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        Log.m105924i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "onPageSelected:" + i);
        this.f54573e.mo24894a(i, true);
        if (!this.f54572d.mo146907k(i).mo76120a()) {
            this.f54572d.mo146907k(i).mo76121b();
        }
    }
}
