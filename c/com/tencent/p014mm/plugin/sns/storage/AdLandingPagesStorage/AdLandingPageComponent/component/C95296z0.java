package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.C103853a;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.C96328z2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AutoPlayViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.ViewPagerControlView;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kg3.C76577a;
import org.json.JSONObject;
import qs2.C101255a0;
import qs2.C101268h0;
import qs2.C101280m0;
import qs2.C101284p0;
import qs2.C101287r;
import qs2.C101292t;
import qs2.C101294u;
import qs2.C101297w;
import qs2.C89837n0;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z0 */
public class C95296z0 extends C95250a {

    /* renamed from: s */
    public AutoPlayViewPager f276591s;

    /* renamed from: t */
    public C95298b f276592t;

    /* renamed from: u */
    public ViewPagerControlView f276593u;

    /* renamed from: v */
    public int f276594v = 1;

    /* renamed from: w */
    public int f276595w = 0;

    /* renamed from: x */
    public C101280m0 f276596x;

    /* renamed from: y */
    public boolean f276597y = false;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z0$a */
    public class C95297a implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C95298b f276598d;

        public C95297a(C95298b bVar) {
            this.f276598d = bVar;
        }

        public void onPageScrollStateChanged(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$1");
            SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$1");
        }

        public void onPageScrolled(int i, float f, int i2) {
            SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$1");
            ViewPagerControlView viewPagerControlView = C95296z0.this.f276593u;
            viewPagerControlView.getClass();
            SnsMethodCalculate.markStartTimeMs("setPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            int i3 = viewPagerControlView.f281600e;
            if (i > i3) {
                SnsMethodCalculate.markEndTimeMs("setPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            } else {
                if (i < 1) {
                    viewPagerControlView.f281614v = 1;
                } else if (i == i3) {
                    viewPagerControlView.f281614v = 2;
                } else {
                    viewPagerControlView.f281614v = 0;
                }
                viewPagerControlView.f281612t = i;
                viewPagerControlView.f281613u = f;
                viewPagerControlView.invalidate();
                SnsMethodCalculate.markEndTimeMs("setPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
            }
            SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$1");
        }

        public void onPageSelected(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$1");
            Log.m105925i("MicroMsg.Sns.AdLandingPageGroupListComponent", "onPageSelected %d", Integer.valueOf(i));
            C95296z0 z0Var = C95296z0.this;
            SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            z0Var.f276595w = i;
            SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            C95296z0 z0Var2 = C95296z0.this;
            z0Var2.getClass();
            SnsMethodCalculate.markStartTimeMs("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            boolean z = z0Var2.f276585j;
            SnsMethodCalculate.markEndTimeMs("getViewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBaseComponent");
            if (z) {
                this.f276598d.mo131862d(i);
                this.f276598d.mo131861c(i);
            }
            SnsMethodCalculate.markEndTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z0$b */
    public static class C95298b extends C103853a {

        /* renamed from: d */
        public Context f276600d;

        /* renamed from: e */
        public LayoutInflater f276601e;

        /* renamed from: f */
        public C101280m0 f276602f;

        /* renamed from: g */
        public int f276603g;

        /* renamed from: h */
        public int f276604h;

        /* renamed from: i */
        public int f276605i = 600;

        /* renamed from: j */
        public int f276606j = 700;

        /* renamed from: n */
        public int f276607n = 250;

        /* renamed from: o */
        public HashMap<Integer, View> f276608o = new HashMap<>();

        /* renamed from: p */
        public HashMap<Integer, C95299a> f276609p = new HashMap<>();

        /* renamed from: q */
        public Set<String> f276610q = new HashSet();

        /* renamed from: r */
        public ViewPager f276611r;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z0$b$a */
        public class C95299a {

            /* renamed from: a */
            public LinkedList<C95295z> f276612a = new LinkedList<>();

            public C95299a(C95298b bVar) {
            }
        }

        public C95298b(Context context, LayoutInflater layoutInflater, C101280m0 m0Var, int i, ViewPager viewPager) {
            this.f276600d = context;
            this.f276601e = layoutInflater;
            this.f276602f = m0Var;
            this.f276603g = i;
            this.f276604h = C95198o2.m121130b(context)[0];
            this.f276611r = viewPager;
        }

        /* renamed from: a */
        public static /* synthetic */ int m121396a(C95298b bVar) {
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            int i = bVar.f276606j;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return i;
        }

        /* renamed from: b */
        public static void m121397b(C95298b bVar, ImageView imageView) {
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("startRightSecondAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            AnimationSet animationSet = new AnimationSet(true);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, -5.0f, 0.0f, 0.0f);
            translateAnimation.setDuration((long) bVar.f276606j);
            translateAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
            animationSet.addAnimation(translateAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 0.3f);
            alphaAnimation.setDuration((long) bVar.f276606j);
            alphaAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
            animationSet.addAnimation(alphaAnimation);
            animationSet.setAnimationListener(new C95047a1(bVar, imageView));
            imageView.startAnimation(animationSet);
            SnsMethodCalculate.markEndTimeMs("startRightSecondAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }

        /* renamed from: c */
        public void mo131861c(int i) {
            SnsMethodCalculate.markStartTimeMs("didToPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            for (Integer next : this.f276609p.keySet()) {
                C95299a aVar = this.f276609p.get(next);
                if (!(aVar == null || aVar.f276612a.size() == 0)) {
                    int i2 = 0;
                    if (next.intValue() == i) {
                        while (i2 < aVar.f276612a.size()) {
                            C95295z zVar = aVar.f276612a.get(i2);
                            if (zVar.mo131640s()) {
                                zVar.mo124360B();
                                zVar.mo130145A();
                                ((HashSet) this.f276610q).add(zVar.mo131857r());
                            } else {
                                if (((HashSet) this.f276610q).contains(zVar.mo131857r())) {
                                    zVar.mo124361D();
                                    ((HashSet) this.f276610q).remove(zVar.mo131857r());
                                }
                            }
                            i2++;
                        }
                    } else {
                        while (i2 < aVar.f276612a.size()) {
                            C95295z zVar2 = aVar.f276612a.get(i2);
                            if (((HashSet) this.f276610q).contains(zVar2.mo131857r())) {
                                zVar2.mo124361D();
                                ((HashSet) this.f276610q).remove(zVar2.mo131857r());
                            }
                            i2++;
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("didToPage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }

        /* renamed from: d */
        public void mo131862d(int i) {
            SnsMethodCalculate.markStartTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            View view = this.f276608o.get(Integer.valueOf(i));
            if (view == null) {
                SnsMethodCalculate.markEndTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                return;
            }
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.jqj);
            if (imageView != null && imageView.getVisibility() == 0) {
                SnsMethodCalculate.markStartTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                imageView.setAlpha(0.0f);
                imageView.setTag("1");
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.8f);
                alphaAnimation.setDuration((long) this.f276605i);
                alphaAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
                alphaAnimation.setAnimationListener(new C95068b1(this, imageView));
                imageView.startAnimation(alphaAnimation);
                SnsMethodCalculate.markEndTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            }
            SnsMethodCalculate.markEndTimeMs("startRightIconAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            SnsMethodCalculate.markStartTimeMs("destroyItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            viewGroup.removeView((View) obj);
            this.f276608o.remove(Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("destroyItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }

        public void finishUpdate(ViewGroup viewGroup) {
            SnsMethodCalculate.markStartTimeMs("finishUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            super.finishUpdate(viewGroup);
            int currentItem = this.f276611r.getCurrentItem();
            if (currentItem == 0) {
                currentItem = getCount() - 2;
            } else if (currentItem >= getCount() - 1) {
                currentItem = 1;
            }
            this.f276611r.setCurrentItem(currentItem, false);
            SnsMethodCalculate.markEndTimeMs("finishUpdate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }

        public int getCount() {
            SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            int size = this.f276602f.f296664z.size();
            SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return size;
        }

        public int getItemPosition(Object obj) {
            SnsMethodCalculate.markStartTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            for (Integer intValue : this.f276608o.keySet()) {
                int intValue2 = intValue.intValue();
                if (this.f276608o.get(Integer.valueOf(intValue2)) == obj) {
                    SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                    return intValue2;
                }
            }
            SnsMethodCalculate.markEndTimeMs("getItemPosition", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return -2;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            int i2;
            ViewGroup viewGroup2 = viewGroup;
            int i3 = i;
            SnsMethodCalculate.markStartTimeMs("instantiateItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            int i4 = 1;
            Log.m105919d("MicroMsg.Sns.AdLandingPageGroupListComponent", "instantiateItem %d", Integer.valueOf(i));
            if (this.f276608o.containsKey(Integer.valueOf(i))) {
                View view = this.f276608o.get(Integer.valueOf(i));
                SnsMethodCalculate.markEndTimeMs("instantiateItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                return view;
            }
            Log.m105919d("MicroMsg.Sns.AdLandingPageGroupListComponent", "inflate Item %d", Integer.valueOf(i));
            View inflate = this.f276601e.inflate(C0966R.C0971layout.c1l, viewGroup2, false);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.jqh);
            linearLayout.setBackgroundColor(this.f276603g);
            C95299a aVar = this.f276609p.get(Integer.valueOf(i));
            LinkedList<C101255a0> linkedList = this.f276602f.f296664z.get(i3).f296728z;
            if (aVar == null || aVar.f276612a.size() == 0) {
                SnsMethodCalculate.markStartTimeMs("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                C95299a aVar2 = new C95299a(this);
                if (linkedList == null) {
                    SnsMethodCalculate.markEndTimeMs("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                } else {
                    int i5 = 0;
                    while (i5 < linkedList.size()) {
                        C101255a0 a0Var = linkedList.get(i5);
                        Object[] objArr = new Object[i4];
                        objArr[0] = a0Var.f296495a;
                        Log.m105925i("MicroMsg.Sns.AdLandingPageGroupListComponent", "gen component %s", objArr);
                        aVar2.f276612a.add(C96328z2.m123559a(this.f276600d, a0Var, linearLayout, this.f276603g));
                        i5++;
                        i4 = 1;
                    }
                    SnsMethodCalculate.markEndTimeMs("generateComponentsBy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
                }
                if (i3 > 0 && i3 < getCount() - 1) {
                    this.f276609p.put(Integer.valueOf(i), aVar2);
                }
                aVar = aVar2;
            }
            Iterator<C95295z> it = aVar.f276612a.iterator();
            while (it.hasNext()) {
                View p = it.next().mo131855p();
                if (p.getParent() != null && (p.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) p.getParent()).removeView(p);
                }
                linearLayout.addView(p);
            }
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.jqj);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.jqi);
            int i6 = this.f276603g;
            if (i6 - -16777216 <= -1 - i6) {
                imageView.setImageDrawable(C76577a.m92158i(this.f276600d, C0966R.C0969drawable.c9y));
            } else {
                imageView.setImageDrawable(C76577a.m92158i(this.f276600d, C0966R.C0969drawable.c9z));
            }
            C101280m0 m0Var = this.f276602f;
            if (m0Var.f296661A == 1) {
                imageView.setVisibility(8);
                textView.setVisibility(8);
            } else {
                if (i3 == m0Var.f296664z.size() - 1) {
                    imageView.setVisibility(8);
                } else {
                    imageView.setVisibility(0);
                }
                int count = getCount() - 2;
                if (i3 == 0) {
                    imageView.setVisibility(8);
                    i2 = count;
                } else if (i3 >= getCount() - 1) {
                    imageView.setVisibility(0);
                    i2 = 1;
                } else {
                    if (i3 == count) {
                        imageView.setVisibility(8);
                    }
                    i2 = i3;
                }
                textView.setText(i2 + "/" + count);
            }
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(this.f276604h, linearLayout.getMeasuredHeight()));
            inflate.setBackgroundColor(this.f276603g);
            viewGroup2.addView(inflate);
            viewGroup2.setBackgroundColor(this.f276603g);
            this.f276608o.put(Integer.valueOf(i), inflate);
            SnsMethodCalculate.markEndTimeMs("instantiateItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return inflate;
        }

        public boolean isViewFromObject(View view, Object obj) {
            SnsMethodCalculate.markStartTimeMs("isViewFromObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            boolean z = view == ((View) obj);
            SnsMethodCalculate.markEndTimeMs("isViewFromObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            return z;
        }

        public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            SnsMethodCalculate.markStartTimeMs("setPrimaryItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            super.setPrimaryItem((View) viewGroup, i, obj);
            SnsMethodCalculate.markEndTimeMs("setPrimaryItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }
    }

    static {
        new WeakHashMap();
    }

    public C95296z0(Context context, C101280m0 m0Var, ViewGroup viewGroup) {
        super(context, m0Var, viewGroup);
        this.f276593u = new ViewPagerControlView(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public void mo130145A() {
        SnsMethodCalculate.markStartTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.mo130145A();
        AutoPlayViewPager autoPlayViewPager = this.f276591s;
        if (autoPlayViewPager != null) {
            autoPlayViewPager.startAutoPlay();
        }
        SnsMethodCalculate.markEndTimeMs("viewAppeared", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f276592t.mo131862d(this.f276595w);
        this.f276592t.mo131861c(this.f276595w);
        super.mo124360B();
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    /* renamed from: D */
    public void mo124361D() {
        SnsMethodCalculate.markStartTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f276592t.mo131861c(-1);
        super.mo124361D();
        AutoPlayViewPager autoPlayViewPager = this.f276591s;
        if (autoPlayViewPager != null) {
            autoPlayViewPager.pauseAutoPlay();
        }
        SnsMethodCalculate.markEndTimeMs("viewWillDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    /* renamed from: E */
    public List<C95295z> mo130196E() {
        SnsMethodCalculate.markStartTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        ArrayList arrayList = new ArrayList();
        C95298b bVar = (C95298b) this.f276591s.getAdapter();
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        ArrayList arrayList2 = new ArrayList();
        for (C95298b.C95299a aVar : bVar.f276609p.values()) {
            arrayList2.addAll(aVar.f276612a);
        }
        SnsMethodCalculate.markEndTimeMs("getAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        arrayList.addAll(arrayList2);
        SnsMethodCalculate.markEndTimeMs("getChildrenComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return arrayList;
    }

    /* renamed from: G */
    public void mo130197G() {
        SnsMethodCalculate.markStartTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        this.f276592t.mo131861c(this.f276595w);
        SnsMethodCalculate.markEndTimeMs("updateChildExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    /* renamed from: H */
    public final C101280m0 mo131859H() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        C101280m0 m0Var = (C101280m0) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return m0Var;
    }

    /* renamed from: I */
    public final C101280m0 mo131860I(C101280m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        C101280m0 m0Var2 = new C101280m0();
        this.f276596x = m0Var2;
        if (m0Var == null) {
            SnsMethodCalculate.markEndTimeMs("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            return m0Var2;
        }
        m0Var2.f296495a = m0Var.f296495a;
        m0Var2.f296496b = m0Var.f296496b;
        m0Var2.f296497c = m0Var.f296497c;
        m0Var2.f296498d = m0Var.f296498d;
        m0Var2.f296499e = m0Var.f296499e;
        m0Var2.f296500f = m0Var.f296500f;
        m0Var2.f296501g = m0Var.f296501g;
        m0Var2.f296502h = m0Var.f296502h;
        m0Var2.f296503i = m0Var.f296503i;
        m0Var2.f296504j = m0Var.f296504j;
        m0Var2.f296505k = m0Var.f296505k;
        m0Var2.f296506l = m0Var.f296506l;
        m0Var2.f296507m = m0Var.f296507m;
        m0Var2.f296508n = m0Var.f296508n;
        m0Var2.f296509o = m0Var.f296509o;
        m0Var2.f296510p = m0Var.f296510p;
        m0Var2.f296511q = m0Var.f296511q;
        m0Var2.f296512r = m0Var.f296512r;
        m0Var2.f296661A = m0Var.f296661A;
        m0Var2.f296662B = m0Var.f296662B;
        m0Var2.f296663C = m0Var.f296663C;
        m0Var2.f296664z.add(m0Var.f296664z.getLast());
        this.f276596x.f296664z.addAll(m0Var.f296664z);
        this.f276596x.f296664z.add(m0Var.f296664z.getFirst());
        C101280m0 m0Var3 = this.f276596x;
        SnsMethodCalculate.markEndTimeMs("initGalleryListInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return m0Var3;
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        View view = this.f276586n;
        this.f276591s = (AutoPlayViewPager) view.findViewById(C0966R.C0970id.jqm);
        this.f276593u = (ViewPagerControlView) view.findViewById(C0966R.C0970id.jq7);
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    /* renamed from: g */
    public void mo67240g() {
        C95298b bVar;
        float f;
        float f2;
        int i;
        float f3;
        int i2;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        int i3 = (this.f276588p - ((int) mo131859H().f296499e)) - ((int) mo131859H().f296500f);
        int i4 = this.f276589q;
        LayoutInflater layoutInflater = (LayoutInflater) this.f276579d.getSystemService("layout_inflater");
        mo131860I(mo131859H());
        if (this.f276591s.getAdapter() == null) {
            bVar = new C95298b(this.f276579d, layoutInflater, this.f276596x, this.f276581f, this.f276591s);
            this.f276591s.setOnPageChangeListener(new C95297a(bVar));
            this.f276591s.setAdapter(bVar);
        } else {
            bVar = (C95298b) this.f276591s.getAdapter();
            C101280m0 I = mo131860I(mo131859H());
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
            bVar.f276602f = I;
            SnsMethodCalculate.markEndTimeMs("updateDataSet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent$TurnPagerAdapter");
        }
        C95298b bVar2 = bVar;
        this.f276597y = mo131859H().f296663C;
        ViewPagerControlView viewPagerControlView = this.f276593u;
        int size = this.f276596x.f296664z.size();
        boolean z = this.f276597y;
        viewPagerControlView.getClass();
        SnsMethodCalculate.markStartTimeMs("bindPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        int i5 = size - 2;
        viewPagerControlView.f281600e = i5;
        viewPagerControlView.f281602g = ((((float) viewPagerControlView.f281601f) - (((float) ((i5 - 1) * 2)) * viewPagerControlView.f281604i)) - viewPagerControlView.f281603h) / 2.0f;
        viewPagerControlView.f281598A = z;
        SnsMethodCalculate.markEndTimeMs("bindPage", "com.tencent.mm.plugin.sns.ui.widget.ad.ViewPagerControlView");
        this.f276591s.bindViewPagerControlView(this.f276593u, this.f276597y);
        if (mo131859H().f296662B) {
            this.f276591s.setLayoutParams(new RelativeLayout.LayoutParams(i3, i4));
        } else if (mo131859H().f296664z.size() > 0) {
            int i6 = 0;
            new LinearLayout(this.f276579d).setOrientation(1);
            Iterator<C101255a0> it = mo131859H().f296664z.get(0).f296728z.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                C101255a0 next = it.next();
                float f4 = next.f296497c;
                int i8 = (int) (((float) i7) + f4);
                float f5 = 0.0f;
                if (next instanceof C101268h0) {
                    C101268h0 h0Var = (C101268h0) next;
                    View inflate = layoutInflater.inflate(C0966R.C0971layout.c1k, (ViewGroup) null);
                    inflate.setBackgroundColor(this.f276581f);
                    try {
                        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.jq6);
                        textView.setText(h0Var.f296609z);
                        float f6 = h0Var.f296599A;
                        if (f6 > 0.0f) {
                            textView.setTextSize(i6, f6);
                        }
                        float f7 = h0Var.f296607I;
                        if (f7 > 0.0f) {
                            textView.setLineSpacing(0.0f, f7 + 1.0f);
                        }
                        if (h0Var.f296602D) {
                            textView.getPaint().setFakeBoldText(true);
                        }
                        textView.measure(View.MeasureSpec.makeMeasureSpec((int) ((((float) i3) - h0Var.f296499e) - h0Var.f296500f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, i6));
                        i8 = i8 + textView.getPaddingTop() + textView.getMeasuredHeight();
                        i = textView.getPaddingBottom();
                    } catch (Exception e) {
                        Log.m105920e("MicroMsg.Sns.AdLandingPageGroupListComponent", "txtComp measure exp=" + e.toString());
                    }
                } else {
                    if (next instanceof C101287r) {
                        Button button = (Button) layoutInflater.inflate(C0966R.C0971layout.f359989c12, (ViewGroup) null).findViewById(C0966R.C0970id.jq_);
                        button.setText(((C101287r) next).f296714z);
                        button.measure(View.MeasureSpec.makeMeasureSpec(i6, i6), View.MeasureSpec.makeMeasureSpec(i6, i6));
                        int paddingTop = i8 + button.getPaddingTop();
                        float f8 = next.f296502h;
                        if (f8 <= 0.0f || ((int) f8) == Integer.MAX_VALUE) {
                            float f9 = next.f296508n;
                            i2 = (f9 <= 0.0f || ((int) f9) == Integer.MAX_VALUE) ? button.getMeasuredHeight() + paddingTop : (int) (((float) paddingTop) + f9);
                        } else {
                            i2 = (int) (((float) paddingTop) + f8);
                        }
                        i8 = i2 + button.getPaddingBottom();
                    } else {
                        boolean z2 = next instanceof C101294u;
                        if (z2) {
                            float f15 = next.f296498d;
                            if (z2) {
                                C101294u uVar = (C101294u) next;
                                f5 = uVar.f296508n;
                                f3 = uVar.f296507m;
                            } else {
                                f3 = 0.0f;
                            }
                            i8 = (int) (((float) ((int) (((float) ((((int) f5) == 0 || ((int) f3) == 0) ? i8 + i4 : (int) (((float) i8) + ((((float) i3) * f5) / f3)))) + f4))) + f15);
                        } else {
                            if (!(next instanceof C101292t)) {
                                if (next instanceof C101297w) {
                                    C101297w wVar = (C101297w) next;
                                    if (wVar.f296759F != 1) {
                                        float f16 = wVar.f296507m;
                                        if (((int) f16) > 0) {
                                            i = (((int) wVar.f296508n) * i3) / ((int) f16);
                                        } else {
                                            f = (float) i8;
                                            f2 = wVar.f296508n;
                                        }
                                    }
                                } else if (next instanceof C101284p0) {
                                    C101284p0 p0Var = (C101284p0) next;
                                    if (p0Var.f296674B == 1) {
                                        float f17 = p0Var.f296507m;
                                        if (((int) f17) > 0) {
                                            i = (((int) p0Var.f296508n) * i3) / ((int) f17);
                                        } else {
                                            f = (float) i8;
                                            f2 = p0Var.f296508n;
                                        }
                                    }
                                } else if (!(next instanceof C89837n0)) {
                                }
                                i8 = (int) (f + f2);
                            }
                            i8 += i4;
                        }
                    }
                    i7 = (int) (((float) i8) + next.f296498d);
                    i6 = 0;
                }
                i8 += i;
                i7 = (int) (((float) i8) + next.f296498d);
                i6 = 0;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i3, i7);
            layoutParams.leftMargin = (int) mo131859H().f296499e;
            layoutParams.rightMargin = (int) mo131859H().f296500f;
            this.f276591s.setLayoutParams(layoutParams);
        }
        this.f276592t = bVar2;
        bVar2.notifyDataSetChanged();
        SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return C0966R.C0971layout.c1m;
    }

    /* renamed from: t */
    public void mo130247t() {
        SnsMethodCalculate.markStartTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.mo130247t();
        this.f276591s.setCurrentItem(this.f276594v, false);
        SnsMethodCalculate.markEndTimeMs("restoreToOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }

    /* renamed from: v */
    public boolean mo118822v(JSONObject jSONObject) {
        SnsMethodCalculate.markStartTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        if (!super.mo118822v(jSONObject)) {
            SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("setComponentKVReportData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        return true;
    }

    /* renamed from: w */
    public void mo131858w(Map<String, Object> map) {
        SnsMethodCalculate.markStartTimeMs("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
        super.mo131858w(map);
        try {
            if (map.containsKey("startIndex")) {
                this.f276594v = ((Integer) map.get("startIndex")).intValue() + 1;
            }
            AutoPlayViewPager autoPlayViewPager = this.f276591s;
            if (autoPlayViewPager != null) {
                autoPlayViewPager.setCurrentItem(this.f276594v, false);
            } else {
                Log.m105920e("MicroMsg.Sns.AdLandingPageGroupListComponent", "when setOriginState, but viewPager is null");
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.Sns.AdLandingPageGroupListComponent", e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("setOriginState", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGroupListComponent");
    }
}
