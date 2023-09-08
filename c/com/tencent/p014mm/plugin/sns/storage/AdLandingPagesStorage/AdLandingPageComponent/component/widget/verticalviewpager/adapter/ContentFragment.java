package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.hellhoundlib.fragments.HellAndroidXFragment;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.floatpage.FloatJumpCompHelper;
import com.tencent.p014mm.plugin.sns.p106ui.C95804h3;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdLandingPageFloatView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.OverScrollLinearout;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatBarCompWrapper;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95251e;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.C95280b;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.pinus.ChildProcessServiceWrapper;
import fm0.C86937f0;
import j20.C117292a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p1208q3.C118144a;
import ps2.C100880k;
import ps2.C100882l;
import ps2.C100891r;
import qs2.C101255a0;
import qs2.C101263e0;
import qs2.C101293t0;
import qs2.C101296v;
import wo2.C102466d;
import ws2.C102491a;
import ws2.C102493b;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment */
public class ContentFragment extends HellAndroidXFragment {

    /* renamed from: P */
    public static final /* synthetic */ int f276480P = 0;

    /* renamed from: A */
    public C95272f f276481A;

    /* renamed from: B */
    public C100882l f276482B;

    /* renamed from: C */
    public C95273g f276483C;

    /* renamed from: D */
    public C102491a f276484D;

    /* renamed from: E */
    public Map<String, Object> f276485E;

    /* renamed from: F */
    public boolean f276486F;

    /* renamed from: G */
    public int f276487G;

    /* renamed from: H */
    public boolean f276488H = false;

    /* renamed from: I */
    public boolean f276489I = false;

    /* renamed from: J */
    public BroadcastReceiver f276490J = new C95270d();

    /* renamed from: K */
    public View.OnClickListener f276491K = new C95271e();

    /* renamed from: L */
    public View.OnClickListener f276492L = new C95267a();

    /* renamed from: M */
    public boolean f276493M = false;

    /* renamed from: N */
    public OverScrollLinearout.C96308a f276494N = new C95268b();

    /* renamed from: d */
    public final Map<String, Bitmap> f276495d = new WeakHashMap();

    /* renamed from: e */
    public int f276496e;

    /* renamed from: f */
    public C95251e f276497f;

    /* renamed from: g */
    public int f276498g = 1000;

    /* renamed from: h */
    public boolean f276499h;

    /* renamed from: i */
    public C101293t0 f276500i;

    /* renamed from: j */
    public boolean f276501j;

    /* renamed from: n */
    public boolean f276502n;

    /* renamed from: o */
    public int f276503o;

    /* renamed from: p */
    public boolean f276504p;

    /* renamed from: q */
    public LinearLayoutManager f276505q;

    /* renamed from: r */
    public int f276506r;

    /* renamed from: s */
    public int f276507s;

    /* renamed from: t */
    public boolean f276508t = false;

    /* renamed from: u */
    public ValueAnimator f276509u;

    /* renamed from: v */
    public int f276510v;

    /* renamed from: w */
    public int f276511w;

    /* renamed from: x */
    public MMHandler f276512x;

    /* renamed from: y */
    public boolean f276513y;

    /* renamed from: z */
    public String f276514z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$a */
    public class C95267a implements View.OnClickListener {
        public C95267a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$10");
            try {
                RecyclerView T = ContentFragment.this.mo131809T();
                if (T == null) {
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$10");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                FragmentActivity activity = ContentFragment.this.getActivity();
                if (activity instanceof SnsAdNativeLandingPagesUI) {
                    SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) activity;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) T.getLayoutManager();
                    if (linearLayoutManager == null) {
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$10");
                        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    int E = linearLayoutManager.mo16959E();
                    int itemCount = linearLayoutManager.getItemCount();
                    if (E >= 0) {
                        if (itemCount > 0) {
                            if (E != itemCount - 1) {
                                Log.m105924i("ContentFragment.VideoPlay", "By recyclerView, can scrollVertically");
                                T.mo17122s1(0, ContentFragment.m121306N(ContentFragment.this), (Interpolator) null);
                            } else {
                                Log.m105924i("ContentFragment.VideoPlay", "By recyclerView, can not scrollVertically");
                                if (snsAdNativeLandingPagesUI.mo132545q8()) {
                                    Log.m105924i("ContentFragment.VideoPlay", "By viewPager, jumpNextPage");
                                    snsAdNativeLandingPagesUI.mo132498G8();
                                }
                            }
                            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$10");
                            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                            return;
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$10");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$10");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } catch (Throwable th) {
                Log.m105920e("ContentFragment.VideoPlay", th.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$b */
    public class C95268b implements OverScrollLinearout.C96308a {
        public C95268b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$c */
    public class C95269c implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ String f276517a;

        public C95269c(String str) {
            this.f276517a = str;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$2");
            Log.m105925i("ContentFragment", "download img fail %s", this.f276517a);
            ContentFragment contentFragment = ContentFragment.this;
            int i = ContentFragment.f276480P;
            SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            contentFragment.mo131813Y();
            SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$2");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$2");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$2");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$2");
            ContentFragment contentFragment = ContentFragment.this;
            String str2 = this.f276517a;
            int i = ContentFragment.f276480P;
            SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            contentFragment.getClass();
            SnsMethodCalculate.markStartTimeMs("setPageBg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            if (contentFragment.f276512x == null) {
                contentFragment.f276512x = new MMHandler("ContentFragment");
            }
            contentFragment.f276512x.postToWorker(new C102493b(contentFragment, str, "adId", str2));
            SnsMethodCalculate.markEndTimeMs("setPageBg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$d */
    public class C95270d extends BroadcastReceiver {
        public C95270d() {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$8");
            String action = intent.getAction();
            Log.m105924i("ContentFragmentSphereImageView", "onReceive, action=" + action + ", isSphereCom=" + ContentFragment.this.f276488H + ", isFullScreen=" + ContentFragment.this.f276489I);
            if ("com.tencent.mm.adlanding.sphereimage.next_page_view_show".equals(action)) {
                FragmentActivity activity = ContentFragment.this.getActivity();
                if (activity instanceof SnsAdNativeLandingPagesUI) {
                    boolean q8 = ((SnsAdNativeLandingPagesUI) activity).mo132545q8();
                    Log.m105924i("ContentFragmentSphereImageView", "hasNextPage=" + q8);
                    if (q8) {
                        View view = ContentFragment.m121305M(ContentFragment.this).f276525e;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$8", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$8", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(500);
                        ContentFragment.m121305M(ContentFragment.this).f276525e.startAnimation(alphaAnimation);
                    }
                }
            } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_none".equals(action)) {
                if (ContentFragment.m121305M(ContentFragment.this).f276525e.getVisibility() == 0) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ContentFragment.m121305M(ContentFragment.this).f276525e, "alpha", new float[]{0.5f, 1.0f});
                    ofFloat.setDuration(300);
                    ofFloat.start();
                }
            } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half".equals(action)) {
                if (ContentFragment.m121305M(ContentFragment.this).f276525e.getVisibility() == 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ContentFragment.m121305M(ContentFragment.this).f276525e, "alpha", new float[]{1.0f, 0.5f});
                    ofFloat2.setDuration(300);
                    ofFloat2.start();
                }
            } else if ("com.tencent.mm.adlanding.sphereimage.next_page_view_hide".equals(action) && ContentFragment.m121305M(ContentFragment.this).f276525e.getVisibility() == 0) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(250);
                alphaAnimation2.setFillAfter(true);
                ContentFragment.m121305M(ContentFragment.this).f276525e.startAnimation(alphaAnimation2);
            }
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$8");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$e */
    public class C95271e implements View.OnClickListener {
        public C95271e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$9");
            FragmentActivity activity = ContentFragment.this.getActivity();
            if (activity instanceof SnsAdNativeLandingPagesUI) {
                Log.m105924i("ContentFragmentSphereImageView", "jumpNextPage");
                ((SnsAdNativeLandingPagesUI) activity).mo132498G8();
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$9");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/adapter/ContentFragment$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$f */
    public interface C95272f extends Serializable {
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$g */
    public static class C95273g {

        /* renamed from: a */
        public View f276521a;

        /* renamed from: b */
        public ImageView f276522b = null;

        /* renamed from: c */
        public OverScrollLinearout f276523c = null;

        /* renamed from: d */
        public ImageView f276524d = null;

        /* renamed from: e */
        public View f276525e = null;

        /* renamed from: f */
        public boolean f276526f = false;

        /* renamed from: g */
        public RecyclerView f276527g;

        /* renamed from: h */
        public LinearLayout f276528h;

        public C95273g(C95274a aVar) {
        }

        /* renamed from: a */
        public static /* synthetic */ LinearLayout m121322a(C95273g gVar) {
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$ViewHolder");
            LinearLayout linearLayout = gVar.f276528h;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$ViewHolder");
            return linearLayout;
        }
    }

    /* renamed from: K */
    public static /* synthetic */ int m121303K(ContentFragment contentFragment) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        int i = contentFragment.f276506r;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return i;
    }

    /* renamed from: L */
    public static /* synthetic */ C102491a m121304L(ContentFragment contentFragment) {
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        C102491a aVar = contentFragment.f276484D;
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return aVar;
    }

    /* renamed from: M */
    public static /* synthetic */ C95273g m121305M(ContentFragment contentFragment) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        C95273g gVar = contentFragment.f276483C;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return gVar;
    }

    /* renamed from: N */
    public static /* synthetic */ int m121306N(ContentFragment contentFragment) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        int i = contentFragment.f276507s;
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return i;
    }

    /* renamed from: O */
    public final boolean mo131804O() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        boolean z2 = false;
        if (!this.f276504p) {
            SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        } else if (this.f276510v != 0) {
            SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        } else if (this.f276511w != 0) {
            SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return false;
        } else {
            SnsMethodCalculate.markStartTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            boolean z3 = this.f276488H;
            SnsMethodCalculate.markEndTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            if (z3) {
                SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                return false;
            }
            SnsAdNativeLandingPagesUI U = mo131810U();
            if (U != null) {
                SnsMethodCalculate.markStartTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                AdLandingFloatBarCompWrapper adLandingFloatBarCompWrapper = U.f277610r1;
                if (adLandingFloatBarCompWrapper != null) {
                    z = adLandingFloatBarCompWrapper.mo131508Q();
                    SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                } else {
                    SnsMethodCalculate.markEndTimeMs("isFloatBarShowing", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                    z = false;
                }
                if (z || U.mo132496D8()) {
                    SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    return false;
                }
            }
            int C = this.f276505q.mo16957C();
            if (C == this.f276505q.mo16959E() && C == -1) {
                SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                return false;
            }
            boolean z4 = true;
            if (this.f276501j) {
                if (this.f276505q.mo16959E() != this.f276484D.getItemCount() - 1) {
                    z2 = true;
                }
                z4 = z2;
            }
            SnsMethodCalculate.markEndTimeMs("canShowDirection", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return z4;
        }
    }

    /* renamed from: P */
    public void mo131805P(C100882l lVar) {
        LinkedList<C101255a0> linkedList;
        SnsMethodCalculate.markStartTimeMs("checkSphereImageComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        this.f276488H = false;
        this.f276489I = false;
        if (lVar != null && (linkedList = lVar.f295429d) != null) {
            Iterator<C101255a0> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C101255a0 next = it.next();
                if (next instanceof C101296v) {
                    C101296v vVar = (C101296v) next;
                    vVar.getClass();
                    if (vVar.f296507m == 0.0f || vVar.f296508n == 0.0f) {
                        this.f276489I = true;
                    }
                    this.f276488H = true;
                }
            }
        }
        Log.m105924i("ContentFragmentSphereImageView", "checkSphereImageComp, isSphereImageViewCompPage=" + this.f276488H + ", isFullScreen=" + this.f276489I);
        SnsMethodCalculate.markEndTimeMs("checkSphereImageComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    /* renamed from: Q */
    public int mo131806Q() {
        SnsMethodCalculate.markStartTimeMs("floatJumpBtnMaxOffset", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        FragmentActivity activity = getActivity();
        int i = -1;
        if (activity instanceof SnsAdNativeLandingPagesUI) {
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) activity;
            snsAdNativeLandingPagesUI.getClass();
            SnsMethodCalculate.markStartTimeMs("bonusMaxFloatJumpOffset", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            FloatJumpCompHelper floatJumpCompHelper = snsAdNativeLandingPagesUI.f277501A2;
            if (floatJumpCompHelper != null) {
                SnsMethodCalculate.markStartTimeMs("getMaxJumpOffset", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                int i2 = floatJumpCompHelper.f274149h;
                SnsMethodCalculate.markEndTimeMs("getMaxJumpOffset", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                SnsMethodCalculate.markEndTimeMs("bonusMaxFloatJumpOffset", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                i = i2;
            } else {
                SnsMethodCalculate.markEndTimeMs("bonusMaxFloatJumpOffset", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            }
            SnsMethodCalculate.markEndTimeMs("floatJumpBtnMaxOffset", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("floatJumpBtnMaxOffset", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return -1;
    }

    /* renamed from: R */
    public Collection<C95295z> mo131807R() {
        Collection<C95295z> collection;
        SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        C102491a aVar = this.f276484D;
        if (aVar == null) {
            collection = Collections.EMPTY_LIST;
        } else {
            SnsMethodCalculate.markStartTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            LinkedHashMap<String, C95295z> linkedHashMap = aVar.f301784g;
            collection = linkedHashMap == null ? Collections.EMPTY_LIST : linkedHashMap.values();
            SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("getAllComp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return collection;
    }

    /* renamed from: S */
    public C101263e0 mo131808S() {
        SnsMethodCalculate.markStartTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        SnsAdNativeLandingPagesUI U = mo131810U();
        if (U != null) {
            SnsMethodCalculate.markStartTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C101263e0 e0Var = U.f277572e;
            SnsMethodCalculate.markEndTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            SnsMethodCalculate.markEndTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return e0Var;
        }
        SnsMethodCalculate.markEndTimeMs("getFloatBarInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return null;
    }

    /* renamed from: T */
    public RecyclerView mo131809T() {
        SnsMethodCalculate.markStartTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        C95273g gVar = this.f276483C;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f276527g;
            SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return recyclerView;
        }
        SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return null;
    }

    /* renamed from: U */
    public SnsAdNativeLandingPagesUI mo131810U() {
        SnsMethodCalculate.markStartTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        FragmentActivity activity = getActivity();
        if (activity instanceof SnsAdNativeLandingPagesUI) {
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (SnsAdNativeLandingPagesUI) activity;
            SnsMethodCalculate.markEndTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return snsAdNativeLandingPagesUI;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAdNativeLandingPagesUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return null;
    }

    /* renamed from: V */
    public final void mo131811V() {
        SnsMethodCalculate.markStartTimeMs(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (this.f276483C == null) {
            SnsMethodCalculate.markEndTimeMs(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            return;
        }
        SnsMethodCalculate.markStartTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        mo131813Y();
        SnsMethodCalculate.markEndTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        String str = this.f276482B.f295426a;
        if (str == null || str.length() <= 0) {
            SnsMethodCalculate.markStartTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
            mo131813Y();
            SnsMethodCalculate.markEndTimeMs(C86937f0.NAME, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        } else {
            C100882l lVar = this.f276482B;
            String str2 = lVar.f295426a;
            Log.m105925i("ContentFragment", "bg need blur %b, url %s", Boolean.valueOf(lVar.f295428c), str2);
            if (((WeakHashMap) this.f276495d).containsKey(str2)) {
                Log.m105924i("ContentFragment", "bg has cache bitmap");
                mo131812X((Bitmap) ((WeakHashMap) this.f276495d).get(str2));
            } else {
                C100891r.m132207b("adId", str2, false, 1000000001, 0, new C95269c(str2));
            }
        }
        if (this.f276484D != null) {
            String str3 = this.f276482B.f295426a;
            if (str3 == null || str3.length() <= 0) {
                C102491a aVar = this.f276484D;
                int i = this.f276496e;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
                aVar.f301783f = i;
                SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            } else {
                C102491a aVar2 = this.f276484D;
                aVar2.getClass();
                SnsMethodCalculate.markStartTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
                aVar2.f301783f = 0;
                SnsMethodCalculate.markEndTimeMs("setBgColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            }
            C102491a aVar3 = this.f276484D;
            C100882l lVar2 = this.f276482B;
            aVar3.getClass();
            SnsMethodCalculate.markStartTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            if (aVar3.f301781d != lVar2) {
                aVar3.f301781d = lVar2;
                aVar3.notifyDataSetChanged();
            }
            SnsMethodCalculate.markEndTimeMs("setPageInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        }
        SnsMethodCalculate.markEndTimeMs(ChildProcessServiceWrapper.PROCESS_TYPE_RENDER, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    /* renamed from: X */
    public final void mo131812X(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("setBgBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (bitmap != null) {
            this.f276483C.f276521a.setBackgroundColor(0);
            this.f276483C.f276522b.setBackgroundColor(0);
            this.f276483C.f276523c.setBackgroundColor(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f276483C.f276522b.getLayoutParams();
            int i = layoutParams.height;
            int i2 = this.f276507s;
            if (i < i2) {
                i = i2;
            }
            layoutParams.height = i;
            this.f276483C.f276522b.setLayoutParams(layoutParams);
            this.f276483C.f276522b.setImageBitmap(bitmap);
        } else {
            mo131813Y();
        }
        SnsMethodCalculate.markEndTimeMs("setBgBitmap", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    /* renamed from: Y */
    public final void mo131813Y() {
        SnsMethodCalculate.markStartTimeMs("setPageBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        String str = this.f276482B.f295427b;
        if (str != null && str.length() > 0) {
            Log.m105925i("ContentFragment", "setting bg color %s", this.f276482B.f295427b);
            try {
                this.f276496e = Color.parseColor(this.f276482B.f295427b);
            } catch (Exception unused) {
                Log.m105920e("ContentFragment", "the color is error : " + this.f276482B.f295427b);
            }
            this.f276483C.f276521a.setBackgroundColor(this.f276496e);
            this.f276483C.f276522b.setBackgroundColor(this.f276496e);
            this.f276483C.f276523c.setBackgroundColor(this.f276496e);
        }
        SnsMethodCalculate.markEndTimeMs("setPageBackgroundColor", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    /* renamed from: Z */
    public void mo131814Z() {
        SnsMethodCalculate.markStartTimeMs("startDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        try {
            if (mo131804O() && !this.f276508t) {
                C95273g gVar = this.f276483C;
                if (!gVar.f276526f) {
                    gVar.f276524d.setVisibility(0);
                    this.f276483C.f276524d.setTranslationY((float) (-C76577a.m92151b(getContext(), 20)));
                    this.f276509u.setRepeatMode(2);
                    this.f276509u.setRepeatCount(-1);
                    this.f276509u.start();
                    SnsMethodCalculate.markEndTimeMs("startDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
                    return;
                }
            }
            SnsMethodCalculate.markEndTimeMs("startDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        } catch (Exception e) {
            Log.m105920e("ContentFragment", "startDownAnimation, exp=" + e.toString());
        }
    }

    /* renamed from: a0 */
    public void mo131815a0() {
        SnsMethodCalculate.markStartTimeMs("stopDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        try {
            this.f276483C.f276524d.setVisibility(4);
            this.f276483C.f276524d.setTranslationY((float) (-C76577a.m92151b(getContext(), 20)));
            this.f276509u.setRepeatMode(2);
            this.f276509u.setRepeatCount(0);
            this.f276509u.end();
        } catch (Exception e) {
            Log.m105920e("ContentFragment", "stopDownAnimation, exp=" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("stopDownAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onCreate(bundle);
        Map<String, Object> map = this.f276485E;
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        int[] b = C95198o2.m121130b(getContext());
        this.f276506r = b[0];
        this.f276507s = b[1];
        if (this.f276482B == null) {
            C100882l lVar = (C100882l) map.get("pageInfo");
            this.f276482B = lVar;
            mo131805P(lVar);
        }
        this.f276500i = (C101293t0) map.get("pageDownIconInfo");
        this.f276502n = Util.nullAsFalse((Boolean) map.get("is_first_show_page"));
        this.f276501j = Util.nullAsFalse((Boolean) map.get("is_last_shown_page"));
        Util.nullAsFalse((Boolean) map.get("needEnterAnimation"));
        this.f276504p = Util.nullAsFalse((Boolean) map.get("needDirectionAnimation"));
        this.f276503o = Util.nullAsInt(map.get("groupListCompShowIndex"), 0);
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreateView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f6345c_, viewGroup, false);
        C95273g gVar = new C95273g((C95274a) null);
        this.f276483C = gVar;
        gVar.f276521a = inflate;
        gVar.f276522b = (ImageView) inflate.findViewById(C0966R.C0970id.jq8);
        this.f276483C.f276523c = (OverScrollLinearout) inflate.findViewById(C0966R.C0970id.jqt);
        if (this.f276501j) {
            this.f276483C.f276523c.setOnScrollActionListener(this.f276494N);
        }
        this.f276483C.f276524d = (ImageView) inflate.findViewById(C0966R.C0970id.jup);
        this.f276483C.f276525e = inflate.findViewById(C0966R.C0970id.juq);
        this.f276483C.f276525e.setOnClickListener(this.f276491K);
        this.f276483C.f276524d.setOnClickListener(this.f276492L);
        this.f276483C.f276527g = (RecyclerView) inflate.findViewById(C0966R.C0970id.f357792bs3);
        C95273g gVar2 = this.f276483C;
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$ViewHolder");
        gVar2.f276528h = (LinearLayout) inflate.findViewById(C0966R.C0970id.cru);
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment$ViewHolder");
        RecyclerView recyclerView = this.f276483C.f276527g;
        SnsMethodCalculate.markStartTimeMs("initRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        recyclerView.setOverScrollMode(0);
        int nullAsInt = Util.nullAsInt(this.f276485E.get("pageCount"), 0);
        Log.m105918d("ContentFragment", "initRecyclerView, pageCount=" + nullAsInt);
        if (nullAsInt > 1) {
            recyclerView.setOnTouchListener(new C95280b((DummyViewPager) this.f276485E.get("viewPager")));
        } else {
            recyclerView.setOnTouchListener((View.OnTouchListener) null);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        this.f276505q = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        C102491a aVar = new C102491a(this.f276482B, this.f276496e, getActivity(), this.f276505q);
        this.f276484D = aVar;
        if (this.f276502n) {
            int i = this.f276503o;
            SnsMethodCalculate.markStartTimeMs("setGroupListCompShowIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
            aVar.f301786i = i;
            SnsMethodCalculate.markEndTimeMs("setGroupListCompShowIndex", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentAdapter");
        }
        recyclerView.setAdapter(this.f276484D);
        recyclerView.setDescendantFocusability(131072);
        this.f276497f = new C95251e(recyclerView);
        recyclerView.mo17043c(new C95274a(this));
        SnsMethodCalculate.markEndTimeMs("initRecyclerView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        inflate.setTag(this.f276483C);
        mo131811V();
        SnsMethodCalculate.markStartTimeMs("initDownArrowAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f276509u = ofFloat;
        ofFloat.setDuration((long) this.f276498g);
        this.f276509u.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f276509u.addUpdateListener(new C95275b(this));
        this.f276509u.addListener(new C95276c(this));
        this.f276509u.setRepeatCount(-1);
        this.f276509u.setRepeatMode(2);
        C101293t0 t0Var = this.f276500i;
        if (t0Var != null && !t0Var.equals(this.f276483C.f276524d.getTag())) {
            this.f276483C.f276524d.setTag(this.f276500i);
            this.f276483C.f276524d.setVisibility(8);
            C100891r.m132208c(this.f276500i.f296735a, false, 1000000001, 0, new C95277d(this));
        }
        SnsMethodCalculate.markEndTimeMs("initDownArrowAnimator", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        C95272f fVar = this.f276481A;
        if (fVar != null) {
            SnsAdNativeLandingPagesUI.C95441x xVar = (SnsAdNativeLandingPagesUI.C95441x) fVar;
            SnsMethodCalculate.markStartTimeMs("afterOnCreateView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3");
            Log.m105918d("MicroMsg.SnsAdNativeLandingPagesUI.launch", "firstPage afterOnCreateView");
            SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = SnsAdNativeLandingPagesUI.this;
            List<C101255a0> list = SnsAdNativeLandingPagesUI.f277498D2;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            C102466d.C102468b bVar = snsAdNativeLandingPagesUI.f277532P1;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            bVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onContentFragmentCreateView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            if (bVar.f301741g == 0) {
                bVar.f301741g = System.currentTimeMillis();
            }
            SnsMethodCalculate.markEndTimeMs("onContentFragmentCreateView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$TimeStaticBuilder");
            RecyclerView T = mo131809T();
            if (T != null) {
                T.getViewTreeObserver().addOnPreDrawListener(new C95804h3(xVar, this, T));
            }
            SnsMethodCalculate.markEndTimeMs("afterOnCreateView", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3");
        }
        SnsMethodCalculate.markEndTimeMs("onCreateView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        return inflate;
    }

    public void onDestroy() {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onDestroy();
        C95251e eVar = this.f276497f;
        if (eVar != null) {
            eVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            eVar.f276444d.onDestroy();
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
        }
        mo131815a0();
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public void onPause() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onPause();
        Log.m105924i("ContentFragment", this + " onPause " + getUserVisibleHint());
        this.f276499h = false;
        this.f276497f.mo131784c(false);
        if (this.f276497f != null && getUserVisibleHint()) {
            this.f276497f.mo131783b();
        }
        SnsMethodCalculate.markStartTimeMs("unRegisterSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        SnsMethodCalculate.markStartTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        boolean z = this.f276488H;
        SnsMethodCalculate.markEndTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (z) {
            try {
                Log.m105918d("ContentFragmentSphereImageView", "unRegisterSphereImageCompEventReceiver, hash=" + hashCode());
                C118144a.m166672a(getContext()).mo182945d(this.f276490J);
            } catch (Exception e) {
                Log.m105920e("ContentFragmentSphereImageView", "unRegisterSphereImageCompEventReceiver, exp:" + e.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("unRegisterSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public void onResume() {
        View view;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.onResume();
        Log.m105924i("ContentFragment", this + " onResume " + getUserVisibleHint());
        this.f276499h = true;
        C95273g gVar = this.f276483C;
        if (!(gVar == null || (view = gVar.f276521a) == null)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            while (viewGroup != null && viewGroup.getId() != C0966R.C0970id.iwc) {
                viewGroup = (ViewGroup) viewGroup.getParent();
            }
            if (viewGroup instanceof FrameLayout) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (viewGroup.getChildAt(i) instanceof SnsAdLandingPageFloatView) {
                        this.f276499h = false;
                    }
                }
            }
        }
        if (this.f276513y && !Util.isNullOrNil(this.f276514z)) {
            this.f276499h = false;
            if (this.f276497f != null && getUserVisibleHint()) {
                C95251e eVar = this.f276497f;
                C100882l lVar = this.f276482B;
                String str = this.f276514z;
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("notifyFullScreenCompAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                LinearLayoutManager linearLayoutManager = eVar.f276443c;
                if (linearLayoutManager != null) {
                    int C = linearLayoutManager.mo16957C();
                    int E = eVar.f276443c.mo16959E();
                    Log.m105919d("RecyclerViewExposureMgr", "appear [%d, %d]", Integer.valueOf(C), Integer.valueOf(E));
                    if (C == E && C == -1) {
                        Log.m105924i("RecyclerViewExposureMgr", "no exposuring child");
                        SnsMethodCalculate.markEndTimeMs("notifyFullScreenCompAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                    } else {
                        SnsMethodCalculate.markStartTimeMs("startFullScreenCompExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                        while (true) {
                            if (C > E) {
                                break;
                            } else if (lVar.f295429d.get(C).f296495a.equals(str)) {
                                C95251e.C95253b bVar = (C95251e.C95253b) ((HashMap) eVar.f276442b).get(Integer.valueOf(C));
                                if (bVar == null) {
                                    bVar = new C95251e.C95253b(eVar, (C95251e.C95252a) null);
                                    ((HashMap) eVar.f276442b).put(Integer.valueOf(C), bVar);
                                }
                                if (eVar.f276444d.mo131789N(C) && !bVar.f276446a) {
                                    eVar.f276444d.mo131790f0(C, eVar);
                                    bVar.mo131787a();
                                }
                            } else {
                                C++;
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("startFullScreenCompExposure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("notifyFullScreenCompAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.RecyclerViewExposureMgr");
            }
        }
        this.f276497f.mo131784c(this.f276499h);
        if (this.f276497f != null && getUserVisibleHint()) {
            this.f276497f.mo131782a();
        }
        SnsMethodCalculate.markStartTimeMs("registerSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        SnsMethodCalculate.markStartTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        boolean z = this.f276488H;
        SnsMethodCalculate.markEndTimeMs("isShowSphereImageCompNextPageBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        if (z) {
            try {
                Log.m105918d("ContentFragmentSphereImageView", "registerSphereImageCompEventReceiver, hash=" + hashCode());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_show");
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_none");
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_alpha_half");
                intentFilter.addAction("com.tencent.mm.adlanding.sphereimage.next_page_view_hide");
                C118144a.m166672a(getContext()).mo182943b(this.f276490J, intentFilter);
            } catch (Exception e) {
                Log.m105920e("ContentFragmentSphereImageView", "registerSphereImageCompEventReceiver, exp:" + e.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("registerSphereImageCompEventReceiver", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }

    public void setUserVisibleHint(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setUserVisibleHint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
        super.setUserVisibleHint(z);
        if (z) {
            C95251e eVar = this.f276497f;
            if (eVar != null) {
                eVar.mo131782a();
            }
        } else {
            C95251e eVar2 = this.f276497f;
            if (eVar2 != null) {
                eVar2.mo131783b();
            }
        }
        SnsMethodCalculate.markEndTimeMs("setUserVisibleHint", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment");
    }
}
