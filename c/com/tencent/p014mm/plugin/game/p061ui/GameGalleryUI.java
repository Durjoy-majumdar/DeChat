package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMDotView;
import com.tencent.p014mm.plugin.game.commlib.util.C41864d;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import j20.C117292a;
import java.util.ArrayList;
import jc0.C21210b;
import nj3.C88989a;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.game.ui.GameGalleryUI */
public class GameGalleryUI extends MMActivity implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public ViewPager f113932d;

    /* renamed from: e */
    public MMDotView f113933e;

    /* renamed from: f */
    public String f113934f = "";

    /* renamed from: g */
    public int f113935g = -1;

    /* renamed from: h */
    public int f113936h = 0;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameGalleryUI$a */
    public static class C42194a extends C103853a {

        /* renamed from: d */
        public Context f113937d;

        /* renamed from: e */
        public String[] f113938e = new String[0];

        /* renamed from: f */
        public View[] f113939f;

        /* renamed from: com.tencent.mm.plugin.game.ui.GameGalleryUI$a$a */
        public class C42195a implements C21070h {

            /* renamed from: a */
            public final /* synthetic */ ProgressBar f113940a;

            /* renamed from: com.tencent.mm.plugin.game.ui.GameGalleryUI$a$a$a */
            public class C42196a implements Runnable {
                public C42196a() {
                }

                public void run() {
                    C42195a.this.f113940a.setVisibility(8);
                }
            }

            public C42195a(C42194a aVar, ProgressBar progressBar) {
                this.f113940a = progressBar;
            }

            /* renamed from: a */
            public void mo6676a(String str, View view) {
            }

            /* renamed from: b */
            public void mo6677b(String str, View view, C21210b bVar) {
                MMHandlerThread.postToMainThread(new C42196a());
            }

            /* renamed from: c */
            public Bitmap mo6678c(String str, View view, C21210b bVar) {
                return null;
            }
        }

        /* renamed from: com.tencent.mm.plugin.game.ui.GameGalleryUI$a$b */
        public class C42197b implements View.OnClickListener {
            public C42197b() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameGalleryUI$ImageAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((MMActivity) C42194a.this.f113937d).finish();
                C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameGalleryUI$ImageAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C42194a(Context context, String[] strArr) {
            this.f113937d = context;
            if (strArr != null) {
                this.f113938e = strArr;
            }
            this.f113939f = new View[this.f113938e.length];
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return this.f113938e.length;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view = this.f113939f[i];
            if (view == null) {
                view = View.inflate(this.f113937d, C0966R.C0971layout.cvy, (ViewGroup) null);
                this.f113939f[i] = view;
                ProgressBar progressBar = (ProgressBar) view.findViewById(C0966R.C0970id.ekn);
                progressBar.setVisibility(0);
                C20828a b = C20828a.m22825b();
                String str = this.f113938e[i];
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59347c = true;
                b.mo32520i(str, (ImageView) view.findViewById(C0966R.C0970id.ekl), bVar.mo32666a(), new C42195a(this, progressBar));
            }
            viewGroup.addView(view);
            view.setOnClickListener(new C42197b());
            return view;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.awa;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        this.f113932d = (ViewPager) findViewById(C0966R.C0970id.eki);
        this.f113933e = (MMDotView) findViewById(C0966R.C0970id.ekm);
        String[] stringArrayExtra = getIntent().getStringArrayExtra("URLS");
        if (stringArrayExtra == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("CURRENT", 0);
        if (intExtra < 0 || intExtra >= stringArrayExtra.length) {
            intExtra = 0;
        }
        this.f113934f = getIntent().getStringExtra("REPORT_APPID");
        this.f113935g = getIntent().getIntExtra("REPORT_SCENE", -1);
        this.f113936h = getIntent().getIntExtra("SOURCE_SCENE", 0);
        this.f113932d.setAdapter(new C42194a(this, stringArrayExtra));
        this.f113932d.setOnPageChangeListener(this);
        this.f113932d.setCurrentItem(intExtra, false);
        this.f113933e.setInvertedStyle(true);
        this.f113933e.setDotCount(stringArrayExtra.length);
        this.f113933e.setSelectedDot(intExtra);
        C41864d.m45384a(this);
        if (intExtra == 0) {
            C40314g.m43487f(this, this.f113935g, TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, 1, 12, this.f113934f, this.f113936h, (String) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C41864d.m45388e(this);
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f113933e.setSelectedDot(i);
        C40314g.m43487f(this, this.f113935g, TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, i + 1, 12, this.f113934f, this.f113936h, (String) null);
    }
}
