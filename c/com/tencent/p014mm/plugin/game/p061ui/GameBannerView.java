package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.core.FocusMeteringAction;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.p136ui.base.MMDotView;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import ry1.C77593e0;
import uy1.C52642c;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameBannerView */
public class GameBannerView extends LinearLayout implements ViewPager.OnPageChangeListener, View.OnClickListener, C111847h {

    /* renamed from: d */
    public Context f113624d;

    /* renamed from: e */
    public ViewPager f113625e;

    /* renamed from: f */
    public C42155c f113626f;

    /* renamed from: g */
    public MMDotView f113627g;

    /* renamed from: h */
    public int f113628h = 0;

    /* renamed from: i */
    public LinkedList<C42154b> f113629i;

    /* renamed from: j */
    public MTimerHandler f113630j = new MTimerHandler(new C42153a(), true);

    /* renamed from: n */
    public float f113631n = 0.0f;

    /* renamed from: o */
    public float f113632o = 0.0f;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameBannerView$a */
    public class C42153a implements MTimerHandler.CallBack {
        public C42153a() {
        }

        public boolean onTimerExpired() {
            GameBannerView gameBannerView = GameBannerView.this;
            if (gameBannerView.f113625e == null || gameBannerView.f113629i.size() <= 1) {
                GameBannerView.this.f113630j.stopTimer();
                return false;
            }
            ViewPager viewPager = GameBannerView.this.f113625e;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameBannerView$b */
    public static class C42154b {

        /* renamed from: a */
        public C44561j f113634a;

        /* renamed from: b */
        public String f113635b;

        /* renamed from: c */
        public String f113636c;
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameBannerView$c */
    public final class C42155c extends C103853a {
        public C42155c(C42153a aVar) {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
            Log.m105925i("MicroMsg.GameBannerView", "destroyItem : new positon = %d, now position = %d", Integer.valueOf(i % GameBannerView.this.f113629i.size()), Integer.valueOf(i));
        }

        public int getCount() {
            return GameBannerView.this.f113629i.size() <= 1 ? GameBannerView.this.f113629i.size() : GameBannerView.this.f113629i.size() * 1000 * 2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            int size = i % GameBannerView.this.f113629i.size();
            View inflate = View.inflate(GameBannerView.this.f113624d, C0966R.C0971layout.auc, (ViewGroup) null);
            inflate.setTag(GameBannerView.this.f113629i.get(size));
            inflate.setOnClickListener(GameBannerView.this);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.ehy);
            String str = GameBannerView.this.f113629i.get(size).f113635b;
            Drawable drawable = imageView.getDrawable();
            if (drawable == null || !(drawable instanceof C77593e0)) {
                imageView.setImageDrawable(new C77593e0(str, (C77593e0.C77594a) null));
            } else {
                ((C77593e0) drawable).mo107778a(str);
            }
            try {
                viewGroup.addView(inflate, 0);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.GameBannerView", "add view failed, " + e.getMessage());
            }
            Log.m105925i("MicroMsg.GameBannerView", "instantiateItem : new positon = %d, now position = %d", Integer.valueOf(size), Integer.valueOf(i));
            return inflate;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public GameBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113624d = context;
        View.inflate(context, C0966R.C0971layout.aub, this);
        this.f113629i = new LinkedList<>();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof C42154b)) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C42154b bVar = (C42154b) view.getTag();
        C44561j jVar = bVar.f113634a;
        if (!Util.isNullOrNil(bVar.f113636c)) {
            C40314g.m43484c(this.f113624d, 11, 1101, 1, C52642c.m59002t(this.f113624d, bVar.f113636c, (String) null), this.f113628h, (String) null);
        } else {
            Log.m105924i("MicroMsg.GameBannerView", "null or nil url");
            Bundle bundle = new Bundle();
            bundle.putCharSequence("game_app_id", jVar.field_appId);
            bundle.putInt("game_report_from_scene", 5);
            C40314g.m43484c(this.f113624d, 11, 1101, 1, C52642c.m58996n(this.f113624d, jVar.field_appId, (String) null, bundle, 0), this.f113628h, (String) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/ui/GameBannerView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f113627g = (MMDotView) findViewById(C0966R.C0970id.ehw);
        ViewPager viewPager = (ViewPager) findViewById(C0966R.C0970id.ehx);
        this.f113625e = viewPager;
        viewPager.setOnPageChangeListener(this);
        this.f113626f = new C42155c((C42153a) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 != 3) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            float r1 = r7.getRawX()
            float r2 = r7.getRawY()
            r3 = 3
            r4 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 == r4) goto L_0x0034
            r5 = 2
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0034
            goto L_0x0048
        L_0x0018:
            float r0 = r6.f113631n
            float r1 = r1 - r0
            int r0 = (int) r1
            float r1 = r6.f113632o
            float r2 = r2 - r1
            int r1 = (int) r2
            int r0 = java.lang.Math.abs(r0)
            int r1 = java.lang.Math.abs(r1)
            if (r0 <= r1) goto L_0x0048
            android.view.ViewParent r0 = r6.getParent()
            if (r0 == 0) goto L_0x0048
            r0.requestDisallowInterceptTouchEvent(r4)
            goto L_0x0048
        L_0x0034:
            r0 = 0
            android.view.ViewParent r1 = r6.getParent()
            if (r1 == 0) goto L_0x003e
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x003e:
            r0 = 0
            r6.f113631n = r0
            r6.f113632o = r0
            goto L_0x0048
        L_0x0044:
            r6.f113631n = r1
            r6.f113632o = r2
        L_0x0048:
            int r0 = r7.getAction()
            if (r0 == 0) goto L_0x005b
            if (r0 == r4) goto L_0x0053
            if (r0 == r3) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f113630j
            r1 = 5000(0x1388, double:2.4703E-320)
            r0.startTimer(r1)
            goto L_0x0060
        L_0x005b:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f113630j
            r0.stopTimer()
        L_0x0060:
            boolean r7 = super.onInterceptTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameBannerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        int size = i % this.f113629i.size();
        Log.m105925i("MicroMsg.GameBannerView", "now selected page %d, now exactly positon : %d", Integer.valueOf(i), Integer.valueOf(size));
        if (this.f113629i.get(size).f113634a != null && C86709a0.m107522a()) {
            C40314g.m43484c(this.f113624d, 11, 1101, size + 1, 1, this.f113628h, (String) null);
        }
    }

    public void setBannerList(LinkedList<C42154b> linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            Log.m105920e("MicroMsg.GameBannerView", "Empty banner list");
            setVisibility(8);
            return;
        }
        Log.m105925i("MicroMsg.GameBannerView", "bannerList size", Integer.valueOf(linkedList.size()));
        this.f113630j.stopTimer();
        this.f113629i.clear();
        this.f113629i.addAll(linkedList);
        this.f113625e.setAdapter(this.f113626f);
        this.f113625e.setCurrentItem(linkedList.size() * 1000, false);
        if (this.f113629i.size() > 1) {
            this.f113630j.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
        this.f113627g.setVisibility(8);
        setVisibility(0);
    }

    public void setSourceScene(int i) {
        this.f113628h = i;
    }
}
