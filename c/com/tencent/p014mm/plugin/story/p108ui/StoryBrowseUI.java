package com.tencent.p014mm.plugin.story.p108ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import aw0.C103928o;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gw2.C98256a;
import gw2.C98257b;
import gw2.C98258c;
import gw2.C98259d;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import jw2.C99066b;
import jw2.C99068c;
import jw2.C99069d;
import kotlin.Metadata;
import nj3.C88989a;
import p625nu.C100196e;
import sx3.C64197v;
import xv2.C102775d;
import xv2.C102778f;
import xv2.C102784n;
import xv2.C79005m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/StoryBrowseUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lxv2/f;", "<init>", "()V", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.story.ui.StoryBrowseUI */
public final class StoryBrowseUI extends MMActivity implements C102778f {

    /* renamed from: h */
    public static final /* synthetic */ int f281780h = 0;

    /* renamed from: d */
    public int f281781d;

    /* renamed from: e */
    public int f281782e;

    /* renamed from: f */
    public StoryGalleryView f281783f;

    /* renamed from: g */
    public ImageView f281784g;

    /* renamed from: com.tencent.mm.plugin.story.ui.StoryBrowseUI$a */
    public static final class C96348a implements StoryGalleryView.C71277m {

        /* renamed from: a */
        public final /* synthetic */ StoryBrowseUI f281785a;

        /* renamed from: com.tencent.mm.plugin.story.ui.StoryBrowseUI$a$a */
        public static final class C96349a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryBrowseUI f281786d;

            /* renamed from: com.tencent.mm.plugin.story.ui.StoryBrowseUI$a$a$a */
            public static final class C96350a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ StoryBrowseUI f281787d;

                public C96350a(StoryBrowseUI storyBrowseUI) {
                    this.f281787d = storyBrowseUI;
                }

                public final void run() {
                    StoryBrowseUI storyBrowseUI = this.f281787d;
                    int i = StoryBrowseUI.f281780h;
                    storyBrowseUI.mo134206H7(-1);
                    this.f281787d.overridePendingTransition(0, 0);
                }
            }

            public C96349a(StoryBrowseUI storyBrowseUI) {
                this.f281786d = storyBrowseUI;
            }

            public final void run() {
                new MMHandler().post(new C96350a(this.f281786d));
            }
        }

        public C96348a(StoryBrowseUI storyBrowseUI) {
            this.f281785a = storyBrowseUI;
        }

        /* renamed from: a */
        public void mo98130a(float f) {
            ImageView imageView = this.f281785a.f281784g;
            if (imageView != null) {
                imageView.setAlpha(f);
            }
        }

        /* renamed from: b */
        public void mo98131b() {
            ViewPropertyAnimator animate;
            ViewPropertyAnimator alpha;
            ViewPropertyAnimator duration;
            StoryBrowseUI storyBrowseUI = this.f281785a;
            StoryGalleryView storyGalleryView = storyBrowseUI.f281783f;
            if (storyGalleryView != null) {
                storyGalleryView.setEnabled(false);
                long height = (long) (((((float) storyGalleryView.getHeight()) - storyGalleryView.getTranslationY()) / ((float) storyGalleryView.getHeight())) * ((float) 300));
                if (height < 0) {
                    height = 0;
                }
                ImageView imageView = storyBrowseUI.f281784g;
                if (!(imageView == null || (animate = imageView.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(height)) == null)) {
                    duration.start();
                }
                storyGalleryView.animate().translationY((float) storyGalleryView.getHeight()).setDuration(height).withEndAction(new C96349a(storyBrowseUI)).start();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.StoryBrowseUI$b */
    public static final class C96351b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryBrowseUI f281788d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<ArrayList<String>> f281789e;

        /* renamed from: f */
        public final /* synthetic */ String f281790f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<Object> f281791g;

        public C96351b(StoryBrowseUI storyBrowseUI, C8479f0<ArrayList<String>> f0Var, String str, C8479f0<Object> f0Var2) {
            this.f281788d = storyBrowseUI;
            this.f281789e = f0Var;
            this.f281790f = str;
            this.f281791g = f0Var2;
        }

        public final void run() {
            T t;
            Class cls = C102775d.class;
            StoryBrowseUI storyBrowseUI = this.f281788d;
            StoryGalleryView storyGalleryView = storyBrowseUI.f281783f;
            if (storyGalleryView != null) {
                storyGalleryView.mo98076p(false, true);
                storyGalleryView.setCurrentHItem(storyBrowseUI.f281782e);
            }
            C8479f0<ArrayList<String>> f0Var = this.f281789e;
            if (f0Var.f27484d == null) {
                f0Var.f27484d = new ArrayList();
            }
            C99069d dVar = C99069d.f290418a;
            long j = C99069d.f290421d.f266265e;
            if (j == 4 || j == 6) {
                ((C102775d) C86312j.m106911c(cls)).kx0((List) this.f281789e.f27484d, C99069d.f290421d.f266265e);
            } else if (j == 5) {
                ((C102775d) C86312j.m106911c(cls)).kx0(C64197v.m75534c(this.f281790f), C99069d.f290421d.f266265e);
            } else if ((j == 12 || j == 13) && (t = this.f281791g.f27484d) != null && (t instanceof C98256a)) {
                ((C98256a) this.f281791g.f27484d).getClass();
                ((C102775d) C86312j.m106911c(cls)).kx0((List<String>) null, C99069d.f290421d.f266265e);
            }
        }
    }

    /* renamed from: B1 */
    public void mo96576B1() {
        mo134206H7(-1);
    }

    /* renamed from: H7 */
    public final void mo134206H7(int i) {
        C99069d dVar = C99069d.f290418a;
        C99069d.f290421d.f266264d = (long) NetStatusUtil.getIOSNetType((Context) getContext());
        C99069d.f290421d.f266271k = System.currentTimeMillis();
        dVar.mo138414c();
        C99068c cVar = C99068c.f290406a;
        if (C99068c.f290410e > 0) {
            cVar.mo138410a();
        }
        setResult(i);
        finish();
    }

    /* renamed from: I4 */
    public void mo96578I4() {
        mo134206H7(-1);
    }

    /* renamed from: V1 */
    public void mo96586V1() {
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return -1;
    }

    public void onBackPressed() {
        StoryGalleryView storyGalleryView = this.f281783f;
        boolean z = true;
        if (storyGalleryView == null || !storyGalleryView.mo98064d()) {
            z = false;
        }
        if (!z) {
            mo134206H7(-1);
        }
    }

    public void onCreate(Bundle bundle) {
        RelativeLayout relativeLayout;
        C79005m.C79006a aVar = C79005m.C79006a.MultiUserGallery;
        Log.m105924i("MicroMsg.StoryBrowseUI", "StoryBrowseUI create " + this);
        supportRequestWindowFeature(1);
        customfixStatusbar(true);
        super.onCreate(bundle);
        C99068c.f290410e = Util.nowMilliSecond();
        C99066b bVar = C99066b.f290392a;
        C99066b.f290396e = Util.nowMilliSecond();
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ((C100196e) C86312j.m106911c(C100196e.class)).il0(true);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        relativeLayout2.setBackgroundColor(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundColor(-16777216);
        this.f281784g = imageView;
        this.f281782e = getIntent().getIntExtra("h_position", 0);
        this.f281781d = getIntent().getIntExtra("v_position", 0);
        T stringExtra = getIntent().getStringExtra("username");
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = getIntent().getStringArrayListExtra("user_list");
        T stringArrayListExtra = getIntent().getStringArrayListExtra("user_date_list");
        boolean booleanExtra = getIntent().getBooleanExtra("delete_when_first_empty", false);
        long longExtra = getIntent().getLongExtra("data_seed_key", 0);
        C99069d dVar = C99069d.f290418a;
        String str = C99069d.f290421d.f266280t;
        boolean booleanExtra2 = getIntent().getBooleanExtra("gallery_story_need_action", false);
        Log.m105924i("MicroMsg.StoryBrowseUI", "vPosition " + this.f281781d);
        dVar.mo138417g();
        C99069d.f290421d.f266264d = (long) NetStatusUtil.getIOSNetType((Context) getContext());
        StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
        storyPreviewReportStruct.f266272l = 0;
        storyPreviewReportStruct.f266274n = 0;
        C8479f0 f0Var2 = new C8479f0();
        if (C102784n.C102785a.f303484b == null) {
            C102784n.C102785a.f303484b = new C102784n.C102785a();
        }
        T t = (C102784n) ((HashMap) C102784n.C102785a.f303484b.f303485a).remove(Long.valueOf(longExtra));
        f0Var2.f27484d = t;
        if (t != null && (t instanceof C102784n)) {
            C87412m.m108594g(t, "dataSeed");
            if (!(t instanceof C98257b) && !(t instanceof C98256a)) {
                if (t instanceof C98258c) {
                    C98258c cVar = (C98258c) t;
                    aVar = Util.isEqual(StoryCore.f281736t.mo134187e(), (String) null) ? C79005m.C79006a.FavSelfStoryGallery : C79005m.C79006a.FavOtherStoryGallery;
                } else {
                    boolean z = t instanceof C98259d;
                }
            }
            if (f0Var2.f27484d instanceof C98258c) {
                int i = this.f281781d;
                ((C98258c) f0Var2.f27484d).getClass();
                this.f281783f = new StoryGalleryView(this, aVar, i, booleanExtra2, (ArrayList<Long>) null);
            } else {
                this.f281783f = new StoryGalleryView(this, aVar, this.f281781d, booleanExtra2, (ArrayList) null, 16, (C8480h) null);
            }
            relativeLayout = relativeLayout2;
        } else if (Util.isNullOrNil((String) stringExtra) || !Util.isEqual((String) stringExtra, StoryCore.f281736t.mo134187e())) {
            relativeLayout = relativeLayout2;
            if (!Util.isNullOrNil((String) stringExtra) && !Util.isEqual((String) stringExtra, StoryCore.f281736t.mo134187e())) {
                this.f281783f = new StoryGalleryView(this, C79005m.C79006a.SingleGallery, 0, false, (ArrayList) null, 28, (C8480h) null);
                f0Var2.f27484d = stringExtra;
            } else if (f0Var.f27484d != null) {
                this.f281783f = new StoryGalleryView(this, aVar, 0, false, (ArrayList) null, 28, (C8480h) null);
                f0Var2.f27484d = new ArrayList((Collection) f0Var.f27484d);
            }
        } else if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            relativeLayout = relativeLayout2;
            this.f281783f = new StoryGalleryView(this, C79005m.C79006a.SelfGallery, 0, false, (ArrayList) null, 28, (C8480h) null);
            f0Var2.f27484d = stringExtra;
        } else {
            relativeLayout = relativeLayout2;
            StoryGalleryView storyGalleryView = r0;
            StoryGalleryView storyGalleryView2 = new StoryGalleryView(this, C79005m.C79006a.HistoryGallery, 0, false, (ArrayList) null, 28, (C8480h) null);
            this.f281783f = storyGalleryView;
            f0Var2.f27484d = stringArrayListExtra;
        }
        StoryGalleryView storyGalleryView3 = this.f281783f;
        if (storyGalleryView3 != null) {
            storyGalleryView3.mo98062b();
        }
        StoryGalleryView storyGalleryView4 = this.f281783f;
        if (storyGalleryView4 != null) {
            storyGalleryView4.setDeleteWhenFirstEmpty(booleanExtra);
        }
        StoryGalleryView storyGalleryView5 = this.f281783f;
        if (storyGalleryView5 != null) {
            storyGalleryView5.setSessionId(str);
        }
        StoryGalleryView storyGalleryView6 = this.f281783f;
        if (storyGalleryView6 != null) {
            storyGalleryView6.setDataSeed(f0Var2.f27484d);
        }
        StoryGalleryView storyGalleryView7 = this.f281783f;
        if (storyGalleryView7 != null) {
            storyGalleryView7.setStoryBrowseUIListener(this);
        }
        StoryGalleryView storyGalleryView8 = this.f281783f;
        if (storyGalleryView8 != null) {
            storyGalleryView8.setCurrentVItem(this.f281781d);
        }
        StoryGalleryView storyGalleryView9 = this.f281783f;
        if (storyGalleryView9 != null) {
            storyGalleryView9.setCanDragScale(true);
        }
        StoryGalleryView storyGalleryView10 = this.f281783f;
        if (storyGalleryView10 != null) {
            storyGalleryView10.setGalleryScaleListener(new C96348a(this));
        }
        RelativeLayout relativeLayout3 = relativeLayout;
        relativeLayout3.addView(this.f281784g, new RelativeLayout.LayoutParams(-1, -1));
        StoryGalleryView storyGalleryView11 = this.f281783f;
        if (storyGalleryView11 != null) {
            relativeLayout3.addView(storyGalleryView11, new RelativeLayout.LayoutParams(-1, -1));
        }
        setContentView((View) relativeLayout3);
        StoryGalleryView storyGalleryView12 = this.f281783f;
        if (storyGalleryView12 != null) {
            storyGalleryView12.post(new C96351b(this, f0Var, stringExtra, f0Var2));
        }
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.StoryBrowseUI", "onDestroy " + this);
        super.onDestroy();
        StoryGalleryView storyGalleryView = this.f281783f;
        if (storyGalleryView != null) {
            storyGalleryView.mo98066f();
        }
        C99068c cVar = C99068c.f290406a;
        if (C99068c.f290410e > 0) {
            cVar.mo138410a();
        }
    }

    public void onPause() {
        Log.m105924i("MicroMsg.StoryBrowseUI", "onPause " + this);
        super.onPause();
        StoryGalleryView storyGalleryView = this.f281783f;
        if (storyGalleryView != null) {
            storyGalleryView.mo98069i();
        }
        C103928o.m138642b();
    }

    public void onResume() {
        Log.m105924i("MicroMsg.StoryBrowseUI", "onResume " + this);
        super.onResume();
        StoryGalleryView storyGalleryView = this.f281783f;
        if (storyGalleryView != null) {
            storyGalleryView.mo98072l();
        }
        StoryGalleryView storyGalleryView2 = this.f281783f;
        if (storyGalleryView2 != null) {
            storyGalleryView2.mo98071k();
        }
        C103928o.m138641a(true, true, true);
    }
}
