package com.tencent.p014mm.plugin.topstory.p113ui.home;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import di3.C86312j;
import h81.C32735h;
import hc0.C20937c;
import hi3.C87515a;
import nj3.C88990b;
import t03.C22426h;

/* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI */
public class TopStoryHomeAffinityUI extends TopStoryHomeUI {

    /* renamed from: e */
    public MMHandler f347453e = new MMHandler(Looper.getMainLooper());

    /* renamed from: f */
    public final Runnable f347454f = new C115817a();

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI$b */
    public class C106189b implements SwipeBackLayout.C19846b {

        /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI$b$a */
        public class C106190a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SwipeBackLayout f316392d;

            public C106190a(SwipeBackLayout swipeBackLayout) {
                this.f316392d = swipeBackLayout;
            }

            public void run() {
                this.f316392d.setNeedRequestActivityTranslucent(true);
                this.f316392d.mo26381c(false);
                C88990b.m111193b(TopStoryHomeAffinityUI.this.getContext());
            }
        }

        public C106189b() {
        }

        /* renamed from: a */
        public void mo26396a(int i) {
            if (i == 1) {
                C88990b.m111194c(TopStoryHomeAffinityUI.this.getContext(), (C88990b.C61771c) null);
                TopStoryHomeAffinityUI.this.getSwipeBackLayout().mo26381c(true);
            }
        }

        /* renamed from: b */
        public void mo26397b() {
            SwipeBackLayout swipeBackLayout = TopStoryHomeAffinityUI.this.getSwipeBackLayout();
            swipeBackLayout.post(new C106190a(swipeBackLayout));
        }
    }

    /* renamed from: com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI$a */
    public class C115817a implements Runnable {
        public C115817a() {
        }

        public void run() {
            if (!TopStoryHomeAffinityUI.this.isFinishing()) {
                Log.m105924i("MicroMsg.TopStory.TopStoryHomeAffinityUI", "kill self in background");
                TopStoryHomeAffinityUI.this.finish();
            }
        }
    }

    public void finish() {
        super.finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTaskDescription(new ActivityManager.TaskDescription(getContext().getString(C0966R.string.k5h), C87515a.m108831a(getContext().getResources(), C0966R.raw.top_story_icon, 3.0f), 0));
        if (isSupportNavigationSwipeBack()) {
            getSwipeBackLayout().setDragListener(new C106189b());
        }
    }

    public void onCreateBeforeSetContentView() {
        if (Build.VERSION.SDK_INT >= 31) {
            setTheme(C0966R.style.a7s);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f347453e.removeCallbacks(this.f347454f);
    }

    public void onStart() {
        super.onStart();
        this.f347453e.removeCallbacks(this.f347454f);
    }

    public void onStop() {
        super.onStop();
        this.f347453e.removeCallbacks(this.f347454f);
        MMHandler mMHandler = this.f347453e;
        Runnable runnable = this.f347454f;
        C20937c cVar = C22426h.f63540a;
        mMHandler.postDelayed(runnable, ((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_topstory_selfkill_delay_multitask, ApkDownloadManager.INTERVAL));
    }

    public void onSwipeBack() {
        super.onSwipeBack();
    }
}
