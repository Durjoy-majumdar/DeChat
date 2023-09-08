package yj3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C44706b;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.base.OnLayoutChangedLinearLayout;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUIProxy;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.p136ui.tools.TestTimeForChatting;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import go3.C76004e;
import go3.C76019y;
import j20.C117292a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import k20.C60958c;
import k20.C9556a;
import nj3.C88990b;
import p605mj.C34575a;
import p739wi.C78597c;
import wc3.C78538u;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: yj3.a */
public class C79123a implements C78597c, C76019y.C76020a {

    /* renamed from: A */
    public OnLayoutChangedLinearLayout.C73214a f232348A = new C79126c();

    /* renamed from: B */
    public Bitmap f232349B;

    /* renamed from: d */
    public MMActivity f232350d;

    /* renamed from: e */
    public ActionBar f232351e;

    /* renamed from: f */
    public ChattingUIFragment f232352f;

    /* renamed from: g */
    public final ChattingUIProxy f232353g;

    /* renamed from: h */
    public Animation f232354h;

    /* renamed from: i */
    public TestTimeForChatting f232355i;

    /* renamed from: j */
    public int f232356j;

    /* renamed from: n */
    public boolean f232357n = false;

    /* renamed from: o */
    public boolean f232358o;

    /* renamed from: p */
    public boolean f232359p;

    /* renamed from: q */
    public String f232360q;

    /* renamed from: r */
    public String f232361r;

    /* renamed from: s */
    public Bundle f232362s;

    /* renamed from: t */
    public C79129d f232363t = C79129d.ACTIVITY_CREATE;

    /* renamed from: u */
    public MMHandler f232364u = new MMHandler(Looper.getMainLooper());

    /* renamed from: v */
    public HashSet<C78597c.C78598b> f232365v = new HashSet<>();

    /* renamed from: w */
    public C78597c.C78599c f232366w;

    /* renamed from: x */
    public int f232367x = -1;

    /* renamed from: y */
    public boolean f232368y = false;

    /* renamed from: z */
    public Runnable f232369z = new C79125b();

    /* renamed from: yj3.a$a */
    public class C79124a implements MessageQueue.IdleHandler {
        public C79124a() {
        }

        public boolean queueIdle() {
            MMActivity mMActivity = C79123a.this.f232350d;
            if (mMActivity != null && !mMActivity.isDestroyed() && !C79123a.this.f232350d.isFinishing()) {
                C79123a.m95710a(C79123a.this, true);
            }
            return false;
        }
    }

    /* renamed from: yj3.a$b */
    public class C79125b implements Runnable {
        public C79125b() {
        }

        public void run() {
            C79129d dVar = C79129d.ACTIVITY_PAUSE;
            C79123a aVar = C79123a.this;
            aVar.f232367x = aVar.f232350d.getController().f348115o0;
            if (!C79123a.this.f232357n) {
                Log.m105920e("ChattingCompat", "start chatting but last chatting does't be close!");
                C79123a.this.mo109065b();
            }
            if (!C79123a.this.f232350d.isFinishing()) {
                C79123a aVar2 = C79123a.this;
                if (!(aVar2.f232363t == dVar) && aVar2.f232357n) {
                    aVar2.f232357n = false;
                    Iterator<C78597c.C78598b> it = aVar2.f232365v.iterator();
                    while (it.hasNext()) {
                        it.next().mo72925h3();
                    }
                    Intent putExtra = new Intent().putExtra("Chat_User", C79123a.this.f232360q);
                    putExtra.putExtra("Chat_Self", C79123a.this.f232361r);
                    Bundle bundle = C79123a.this.f232362s;
                    if (bundle != null) {
                        putExtra.putExtras(bundle);
                    }
                    putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
                    C79123a.this.f232352f.getArguments().putAll(IntentUtil.getExtras(putExtra));
                    C79123a.m95710a(C79123a.this, false);
                    View view = C79123a.this.f232352f.getView();
                    (view != null ? (OnLayoutChangedLinearLayout) view.findViewById(C0966R.C0970id.f357668b43) : null).setOnChattingLayoutChangedListener(C79123a.this.f232348A);
                    C79123a.this.f232355i.setTranslationX(((float) (C79123a.this.mo109068e().getDecorView().getWidth() == 0 ? C79123a.this.f232350d.getResources().getDisplayMetrics().widthPixels : C79123a.this.mo109068e().getDecorView().getWidth())) - 0.1f);
                    C79123a.this.f232355i.setVisibility(0);
                    C76019y.m91316d(C79123a.this);
                    return;
                }
            }
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(C79123a.this.f232363t == dVar);
            objArr[1] = Boolean.valueOf(C79123a.this.f232357n);
            Log.m105929w("ChattingCompat", "[startChattingRunnable] pass! isPause:%s mChattingClosed:%s", objArr);
            C79123a.this.f232359p = true;
        }
    }

    /* renamed from: yj3.a$c */
    public class C79126c implements OnLayoutChangedLinearLayout.C73214a {

        /* renamed from: a */
        public long f232372a = 0;

        /* renamed from: yj3.a$c$a */
        public class C79127a implements Animation.AnimationListener {
            public C79127a() {
            }

            public void onAnimationEnd(Animation animation) {
                C79123a.this.f232358o = false;
                Log.m105924i("ChattingCompat", "klem animationEnd");
                C79123a aVar = C79123a.this;
                aVar.getClass();
                C119179t tVar = C119157j.f356862d;
                C79130b bVar = new C79130b(aVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(bVar, 60, false);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                Log.m105925i("ChattingCompat", "klem onAnimationStart onDrawed->onAnimationStart:%sms", Long.valueOf(System.currentTimeMillis() - C79126c.this.f232372a));
                C79123a aVar = C79123a.this;
                aVar.f232358o = true;
                aVar.f232355i.setTranslationX(0.0f);
                aVar.f232355i.mo104057b();
                C79123a.this.onSettle(false, 0);
            }
        }

        /* renamed from: yj3.a$c$b */
        public class C79128b implements TestTimeForChatting.C74844b {
            public C79128b() {
            }

            /* renamed from: a */
            public void mo101521a() {
                Log.m105924i("ChattingCompat", "[onDrawed]");
                C79126c.this.f232372a = System.currentTimeMillis();
                ChattingUIFragment chattingUIFragment = C79123a.this.f232352f;
                if (chattingUIFragment == null) {
                    Log.m105920e("ChattingCompat", "chattingFragmet is null!");
                    return;
                }
                if (chattingUIFragment.getSwipeBackLayout() != null) {
                    C79123a.this.f232352f.getSwipeBackLayout().startAnimation(C79123a.this.f232354h);
                } else {
                    C79123a.this.f232352f.getView().startAnimation(C79123a.this.f232354h);
                }
                C79123a.this.f232355i.setOndispatchDraw((TestTimeForChatting.C74844b) null);
            }
        }

        public C79126c() {
        }

        /* renamed from: a */
        public void mo101517a() {
            C79123a aVar = C79123a.this;
            if (aVar.f232354h == null) {
                aVar.f232354h = AnimationUtils.loadAnimation(aVar.f232350d, MMFragmentActivity$$c.f318644a);
                C79123a.this.f232354h.setAnimationListener(new C79127a());
            }
            C79123a.this.f232355i.setOndispatchDraw(new C79128b());
            View view = C79123a.this.f232352f.getView();
            OnLayoutChangedLinearLayout onLayoutChangedLinearLayout = view != null ? (OnLayoutChangedLinearLayout) view.findViewById(C0966R.C0970id.f357668b43) : null;
            Objects.requireNonNull(onLayoutChangedLinearLayout);
            onLayoutChangedLinearLayout.f214982d = null;
            Log.m105924i("ChattingCompat", "klem CHATTING ONLAYOUT ");
        }
    }

    /* renamed from: yj3.a$d */
    public enum C79129d {
        ACTIVITY_CREATE,
        ACTIVITY_RESUME,
        ACTIVITY_PAUSE
    }

    public C79123a(MMActivity mMActivity) {
        this.f232350d = mMActivity;
        ChattingUIFragment chattingUIFragment = new ChattingUIFragment();
        this.f232352f = chattingUIFragment;
        this.f232353g = new ChattingUIProxy(mMActivity, chattingUIFragment);
    }

    /* renamed from: a */
    public static void m95710a(C79123a aVar, boolean z) {
        ViewParent viewParent;
        TestTimeForChatting testTimeForChatting = aVar.f232355i;
        ViewParent viewParent2 = null;
        if (testTimeForChatting == null) {
            aVar.f232355i = new TestTimeForChatting(aVar.f232350d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            aVar.f232355i.setId(C0966R.C0970id.b4i);
            aVar.f232356j = aVar.f232355i.getId();
            aVar.f232355i.setOrientation(1);
            int c = C75044y4.m89991c(aVar.f232350d);
            Log.m105925i("ChattingCompat", "[prepareChattingView] bottomMargin=%s", Integer.valueOf(c));
            layoutParams.bottomMargin = c;
            aVar.f232355i.setLayoutParams(layoutParams);
            HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = new HomeUI.FitSystemWindowLayoutView(aVar.f232350d);
            fitSystemWindowLayoutView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            ViewParent parent = aVar.f232351e.mo91099j().getParent();
            ViewGroup viewGroup = (ViewGroup) aVar.mo109068e().getDecorView();
            while (true) {
                ViewParent viewParent3 = parent;
                viewParent = viewParent2;
                viewParent2 = viewParent3;
                if (viewParent2 == viewGroup || viewParent2 == null) {
                    View view = (ViewGroup) viewParent;
                } else {
                    parent = viewParent2.getParent();
                }
            }
            View view2 = (ViewGroup) viewParent;
            if (view2 == null) {
                view2 = ((ViewGroup) aVar.mo109068e().getDecorView()).getChildAt(0);
            }
            ImageView imageView = new ImageView(aVar.f232350d);
            imageView.setId(C0966R.C0970id.i1m);
            imageView.setLayoutParams(layoutParams);
            imageView.setVisibility(8);
            ((ViewGroup) aVar.mo109068e().getDecorView()).removeView(view2);
            view2.setId(C0966R.C0970id.f358506fj1);
            new FrameLayout.LayoutParams(-1, -1);
            fitSystemWindowLayoutView.addView(view2);
            fitSystemWindowLayoutView.addView(imageView);
            fitSystemWindowLayoutView.addView(aVar.f232355i);
            ((ViewGroup) aVar.mo109068e().getDecorView()).addView(fitSystemWindowLayoutView);
            int[] iArr = new int[2];
            aVar.f232351e.mo91099j().getLocationInWindow(iArr);
            ViewGroup viewGroup2 = view2 instanceof SwipeBackLayout ? (ViewGroup) ((ViewGroup) view2).getChildAt(0) : (ViewGroup) view2;
            TestTimeForChatting testTimeForChatting2 = aVar.f232355i;
            if (testTimeForChatting2 != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) testTimeForChatting2.getLayoutParams();
                int c2 = C75044y4.m89991c(aVar.f232350d);
                if (layoutParams2.bottomMargin != c2) {
                    layoutParams2.bottomMargin = c2;
                    aVar.f232355i.setLayoutParams(layoutParams2);
                }
                Log.m105925i("ChattingCompat", "[fixSystemWindow] bottomMargin=%s", Integer.valueOf(c2));
            }
            aVar.mo109068e().getDecorView().requestFitSystemWindows();
            int i = iArr[1];
            if (i > 0) {
                Rect rect = new Rect(0, i, 0, 0);
                fitSystemWindowLayoutView.setActionBarContainer(viewGroup2);
                fitSystemWindowLayoutView.fitSystemWindows(rect);
            } else {
                aVar.f232351e.mo91099j().post(new C79132d(aVar, iArr, fitSystemWindowLayoutView, viewGroup2));
            }
        } else {
            int[] iArr2 = new int[2];
            testTimeForChatting.getLocationInWindow(iArr2);
            if (iArr2[1] == 0) {
                ViewGroup viewGroup3 = (ViewGroup) aVar.mo109068e().getDecorView();
                int i2 = 0;
                while (true) {
                    if (i2 >= viewGroup3.getChildCount()) {
                        break;
                    }
                    View childAt = ((ViewGroup) aVar.mo109068e().getDecorView()).getChildAt(i2);
                    if (childAt instanceof HomeUI.FitSystemWindowLayoutView) {
                        aVar.f232351e.mo91099j().getLocationInWindow(iArr2);
                        HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView2 = (HomeUI.FitSystemWindowLayoutView) childAt;
                        fitSystemWindowLayoutView2.fitSystemWindows(new Rect(0, fitSystemWindowLayoutView2.getCacheInsetsTop(), 0, 0));
                        Log.m105925i("ChattingCompat", "rootLayout2 fitSystemWindows, top %s", Integer.valueOf(iArr2[1]));
                        ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(C0966R.C0970id.f358506fj1);
                        ImageView imageView2 = (ImageView) fitSystemWindowLayoutView2.findViewById(C0966R.C0970id.i1m);
                        imageView2.setTag(viewGroup4);
                        ViewGroup.LayoutParams layoutParams3 = viewGroup4.getLayoutParams();
                        if (layoutParams3 == null || (layoutParams3 instanceof FrameLayout.LayoutParams)) {
                            imageView2.setLayoutParams(layoutParams3);
                        } else {
                            Log.m105928w("ChattingCompat", "FIX LayoutParams");
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(layoutParams3));
                        }
                        Bitmap d = aVar.mo109067d(viewGroup4);
                        if (d != null) {
                            imageView2.setImageBitmap(d);
                            viewGroup4.setVisibility(8);
                            imageView2.setVisibility(0);
                            Log.m105924i("ChattingCompat", "[prepareChattingFragment] prepareView VISIBLE");
                        } else {
                            imageView2.setImageBitmap((Bitmap) null);
                        }
                    } else {
                        Log.m105921e("ChattingCompat", "on position %d, rootLayout not found!", Integer.valueOf(i2));
                        i2++;
                    }
                }
            }
            Log.m105925i("ChattingCompat", "ashu::prepareChattingFragment has chattingView, top %s", Integer.valueOf(iArr2[1]));
        }
        ChattingUIProxy chattingUIProxy = aVar.f232353g;
        if (!chattingUIProxy.f215339c) {
            chattingUIProxy.onInit(aVar.f232356j, z);
        } else {
            chattingUIProxy.onEnterBegin();
        }
        if (aVar.f232352f.isSupportNavigationSwipeBack()) {
            aVar.f232352f.getSwipeBackLayout().setNeedRequestActivityTranslucent(false);
        }
        if (z) {
            aVar.f232355i.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo109065b() {
        boolean z = true;
        this.f232357n = true;
        Object[] objArr = new Object[1];
        TestTimeForChatting testTimeForChatting = this.f232355i;
        if (testTimeForChatting == null || !testTimeForChatting.isShown()) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105925i("ChattingCompat", "try closeChatting, isShown:%b", objArr);
        ChattingUIFragment chattingUIFragment = this.f232352f;
        if (chattingUIFragment != null && chattingUIFragment.isSupportNavigationSwipeBack()) {
            C76019y.m91315c(this);
        }
        TestTimeForChatting testTimeForChatting2 = this.f232355i;
        if (testTimeForChatting2 != null && testTimeForChatting2.getVisibility() != 8 && this.f232352f != null) {
            Iterator<C78597c.C78598b> it = this.f232365v.iterator();
            while (it.hasNext()) {
                if (!it.next().mo72924J5()) {
                    it.remove();
                }
            }
            this.f232355i.setVisibility(8);
            ImageView imageView = (ImageView) mo109068e().getDecorView().findViewById(C0966R.C0970id.i1m);
            if (imageView != null && imageView.getVisibility() == 0) {
                imageView.setVisibility(8);
                Log.m105924i("ChattingCompat", "[closeChatting] prepareView GONE");
                if (imageView.getTag() != null) {
                    View view = (View) imageView.getTag();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "closeChatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "closeChatting", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f232353g.onExitBegin();
            this.f232353g.onExitEnd();
            this.f232355i.setVisibility(8);
            onSwipe(1.0f);
            mo109075l();
            this.f232350d.getController().mo177105z0(this.f232367x);
        }
    }

    /* renamed from: c */
    public boolean mo109066c(KeyEvent keyEvent) {
        Log.m105919d("ChattingCompat", "chatting ui dispatch key event %s", keyEvent);
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            this.f232364u.removeCallbacks(this.f232369z);
        }
        if (this.f232358o) {
            return true;
        }
        ChattingUIFragment chattingUIFragment = this.f232352f;
        return chattingUIFragment != null && chattingUIFragment.onKeyDown(keyEvent.getKeyCode(), keyEvent);
    }

    /* renamed from: d */
    public final Bitmap mo109067d(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0) {
            width = view.getMeasuredWidth();
        }
        if (height <= 0) {
            height = view.getMeasuredHeight();
        }
        if (width <= 0 || height <= 0 || this.f232352f.getView() == null) {
            Log.m105921e("ChattingCompat", "viewWidth:%s viewHeight:%s", Integer.valueOf(width), Integer.valueOf(height));
            return null;
        }
        Log.m105925i("ChattingCompat", "getBottom:%s keyboardState:%s", Integer.valueOf(this.f232352f.getView().getBottom()), Integer.valueOf(this.f232352f.keyboardState()));
        if (this.f232352f.getView().getBottom() > 0 && (this.f232352f.keyboardState() == 1 || this.f232352f.getView().getBottom() < (this.f232350d.getResources().getDisplayMetrics().heightPixels * 2) / 3)) {
            Log.m105921e("ChattingCompat", "hardKeyboardHidden:%s", Integer.valueOf(this.f232352f.keyboardState()));
            return null;
        } else if (this.f232352f.keyboardState() == 1) {
            Log.m105921e("ChattingCompat", "hardKeyboardHidden:%s", Integer.valueOf(this.f232352f.keyboardState()));
            return null;
        } else {
            Bitmap bitmap = this.f232349B;
            if (bitmap == null || bitmap.isRecycled() || this.f232349B.getWidth() != width || this.f232349B.getHeight() != height) {
                Bitmap bitmap2 = this.f232349B;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Log.m105925i("ChattingCompat", "bitmap recycle %s", this.f232349B.toString());
                    this.f232349B.recycle();
                }
                try {
                    this.f232349B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
                } catch (OutOfMemoryError e) {
                    Log.m105921e("ChattingCompat", "[getMagicDrawingCache] e:%s", e);
                    return null;
                }
            } else {
                this.f232349B.eraseColor(0);
            }
            Canvas canvas = new Canvas(this.f232349B);
            Paint paint = new Paint();
            paint.setColor(-1);
            canvas.drawRect(0.0f, (float) ((int) this.f232350d.getResources().getDimension(C0966R.dimen.f357083au0)), (float) width, (float) (height - ((int) this.f232350d.getResources().getDimension(C0966R.dimen.f3683bc))), paint);
            view.draw(canvas);
            Log.m105925i("ChattingCompat", "[getMagicDrawingCache] cost%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return this.f232349B;
        }
    }

    /* renamed from: e */
    public final Window mo109068e() {
        return this.f232350d.getWindow();
    }

    /* renamed from: f */
    public boolean mo109069f(int i, int i2, Intent intent) {
        ChattingUIFragment chattingUIFragment;
        if ((i != 2001 && i != 30763 && i != 226 && i != 30762 && i != 1111) || (chattingUIFragment = this.f232352f) == null) {
            return false;
        }
        chattingUIFragment.onActivityResult(i, i2, intent);
        return true;
    }

    public boolean forceRemoveNoMatchOnPath() {
        return false;
    }

    /* renamed from: g */
    public void mo109070g() {
        mo109068e().setBackgroundDrawableResource(C0966R.color.f2975b6);
        this.f232351e = C76004e.m91288N(this.f232350d.getSupportActionBar());
        this.f232350d.initNavigationSwipeBack();
        if (this.f232368y) {
            Looper.myQueue().addIdleHandler(new C79124a());
        }
        ChattingUIFragment chattingUIFragment = this.f232352f;
        if (chattingUIFragment == null || !chattingUIFragment.f215220f.f193283g) {
            Log.m105928w("ChattingCompat", "[initActionBar] isChattingForeground False!");
            View inflate = C85868k2.m106137b(this.f232350d).inflate(C0966R.C0971layout.f6300b2, (ViewGroup) null);
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            inflate.setLayoutParams(layoutParams);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.ko4);
            ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f359396kp1);
            ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.ko6);
            WeImageView weImageView = (WeImageView) inflate.findViewById(C0966R.C0970id.ko5);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0966R.C0970id.k9p);
            WeImageView weImageView2 = (WeImageView) inflate.findViewById(C0966R.C0970id.k9o);
            ImageView imageView2 = (ImageView) inflate.findViewById(C0966R.C0970id.mjj);
            ImageView imageView3 = (ImageView) inflate.findViewById(C0966R.C0970id.h7k);
            ImageView imageView4 = (ImageView) inflate.findViewById(C0966R.C0970id.huv);
            ImageView imageView5 = (ImageView) inflate.findViewById(C0966R.C0970id.f358986i90);
            View findViewById = inflate.findViewById(C0966R.C0970id.f5470g0);
            WeImageView weImageView3 = (WeImageView) inflate.findViewById(C0966R.C0970id.f6148yn);
            ImageView imageView6 = (ImageView) inflate.findViewById(C0966R.C0970id.ikn);
            ImageView imageView7 = (ImageView) inflate.findViewById(C0966R.C0970id.l2l);
            C44706b.m49451b(textView, C0966R.dimen.f3619c);
            C44706b.m49451b((TextView) inflate.findViewById(C0966R.C0970id.k9n), C0966R.dimen.f3881hq);
            C44706b.m49451b((TextView) inflate.findViewById(C0966R.C0970id.ko8), C0966R.dimen.f3684bd);
            C44706b.m49451b((TextView) inflate.findViewById(C0966R.C0970id.dbf), C0966R.dimen.f3619c);
            this.f232351e.mo91091I(new ColorDrawable(this.f232350d.getResources().getColor(17170445)));
            this.f232351e.mo91088F(false);
            this.f232351e.mo91084B(false);
            this.f232351e.mo91087E(false);
            this.f232351e.mo91086D(true);
            this.f232351e.mo91114y(inflate);
            this.f232350d.getController().f348066G = textView;
            findViewById.setOnClickListener(new C79131c(this));
        } else {
            Log.m105928w("ChattingCompat", "[initActionBar] isChattingForeground True!");
        }
        this.f232351e.mo91094L();
        C78538u.m94868d(this.f232350d);
    }

    /* renamed from: h */
    public void mo109071h() {
        mo109068e().setFormat(-2);
        this.f232350d.supportRequestWindowFeature(109);
        this.f232350d.customfixStatusbar(true);
    }

    /* renamed from: i */
    public void mo109072i() {
        Bitmap bitmap = this.f232349B;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i("ChattingCompat", "bitmap recycle %s", this.f232349B.toString());
            this.f232349B.recycle();
        }
        this.f232359p = false;
        this.f232365v.clear();
        this.f232364u.removeCallbacksAndMessages((Object) null);
        this.f232350d = null;
        this.f232352f = null;
        this.f232355i = null;
        this.f232354h = null;
    }

    /* renamed from: j */
    public void mo109073j() {
        this.f232363t = C79129d.ACTIVITY_RESUME;
        onSwipe(1.0f);
        ChattingUIFragment chattingUIFragment = this.f232352f;
        if (!(chattingUIFragment != null && chattingUIFragment.f215220f.f193283g) && this.f232359p) {
            String str = this.f232360q;
            Bundle bundle = this.f232362s;
            this.f232360q = str;
            this.f232362s = bundle;
            this.f232359p = false;
            this.f232364u.removeCallbacks(this.f232369z);
            this.f232364u.post(this.f232369z);
        }
    }

    /* renamed from: k */
    public void mo109074k(String str, String str2, Bundle bundle, C78597c.C78598b bVar) {
        if (bVar != null) {
            this.f232365v.add(bVar);
        }
        this.f232360q = str;
        this.f232361r = str2;
        this.f232362s = bundle;
        this.f232359p = false;
        this.f232364u.removeCallbacks(this.f232369z);
        this.f232364u.post(this.f232369z);
    }

    /* renamed from: l */
    public final void mo109075l() {
        if (C88990b.m111196e() && C34575a.m40396a()) {
            boolean z = true;
            Object[] objArr = new Object[1];
            if (this.f232352f != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105925i("ChattingCompat", "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            ChattingUIFragment chattingUIFragment = this.f232352f;
            if (chattingUIFragment != null) {
                chattingUIFragment.getSwipeBackLayout().f56498v = false;
            }
        }
    }

    public void onSettle(boolean z, int i) {
        Log.m105927v("ChattingCompat", "ashutest: on settle %B, speed %d, resumeStatus %s", Boolean.valueOf(z), Integer.valueOf(i), this.f232363t);
        if (C88990b.m111196e() && C34575a.m40396a()) {
            View findViewById = this.f232350d.findViewById(C0966R.C0970id.f358506fj1);
            if (findViewById == null) {
                Log.m105920e("ChattingCompat", "[onSettle] null == container");
                return;
            }
            ImageView imageView = (ImageView) this.f232350d.findViewById(C0966R.C0970id.i1m);
            if (!(imageView == null || imageView.getVisibility() != 8 || imageView.getDrawable() == null)) {
                imageView.setVisibility(0);
                Log.m105924i("ChattingCompat", "[onSettle] prepareView VISIBLE");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (imageView == null || imageView.getVisibility() != 0) {
                if (z) {
                    C74863w0.m89620a(findViewById, i > 0 ? 130 : 230, 0.0f, 0.0f, (C74863w0.C74865b) null);
                } else {
                    C74863w0.m89620a(findViewById, i > 0 ? 130 : 230, (float) ((findViewById.getWidth() * -1) / 4), 0.0f, (C74863w0.C74865b) null);
                }
            } else if (z) {
                C74863w0.m89620a(imageView, i > 0 ? 130 : 230, 0.0f, 0.0f, (C74863w0.C74865b) null);
            } else {
                C74863w0.m89620a(imageView, i > 0 ? 130 : 230, (float) ((imageView.getWidth() * -1) / 4), 0.0f, (C74863w0.C74865b) null);
            }
        }
    }

    public void onSwipe(float f) {
        ChattingUIFragment chattingUIFragment;
        ViewGroup viewGroup;
        float f2 = f;
        Log.m105927v("ChattingCompat", "ashutest::on swipe %f, duration %d, status %s", Float.valueOf(f), 320L, this.f232363t);
        if (C88990b.m111196e() && C34575a.m40396a() && (chattingUIFragment = this.f232352f) != null) {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0 && !this.f232357n) {
                ImageView imageView = (ImageView) mo109068e().getDecorView().findViewById(C0966R.C0970id.i1m);
                if (!(imageView == null || (viewGroup = (ViewGroup) imageView.getTag()) == null)) {
                    Bitmap d = mo109067d(viewGroup);
                    if (d != null) {
                        Log.m105924i("ChattingCompat", "[onSwipe] prepareView VISIBLE");
                        imageView.setVisibility(0);
                        imageView.setImageBitmap(d);
                        viewGroup.setVisibility(8);
                    } else {
                        Log.m105924i("ChattingCompat", "[onSwipe] prepareView GONE");
                        viewGroup.setVisibility(0);
                        imageView.setVisibility(8);
                        imageView.setImageDrawable((Drawable) null);
                    }
                }
                Animation animation = this.f232354h;
                if (animation != null) {
                    animation.cancel();
                }
            } else if (f2 == 1.0f && !this.f232357n && chattingUIFragment.isSupportNavigationSwipeBack()) {
                mo109068e().setBackgroundDrawableResource(C0966R.color.a_h);
                ImageView imageView2 = (ImageView) mo109068e().getDecorView().findViewById(C0966R.C0970id.i1m);
                if (!(imageView2 == null || imageView2.getVisibility() != 0 || imageView2.getTag() == null)) {
                    View view = (View) imageView2.getTag();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Log.m105924i("ChattingCompat", "[onSwipe] prepareView GONE");
                    imageView2.setVisibility(8);
                }
            }
            if (C79129d.ACTIVITY_RESUME == this.f232363t || Float.compare(1.0f, f2) <= 0) {
                View findViewById = this.f232350d.findViewById(C0966R.C0970id.f358506fj1);
                ImageView imageView3 = (ImageView) this.f232350d.findViewById(C0966R.C0970id.i1m);
                if (!(imageView3 == null || imageView3.getVisibility() != 8 || imageView3.getDrawable() == null || this.f232357n || f2 == 1.0f || i == 0)) {
                    imageView3.setVisibility(0);
                    Log.m105924i("ChattingCompat", "[onSwipe] !1 && !0 prepareView VISIBLE");
                    if (findViewById != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view3 = findViewById;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/compat/ChattingCompat", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                if (Float.compare(1.0f, f2) <= 0) {
                    C74863w0.m89622c(findViewById, 0.0f, 0.0f);
                    C74863w0.m89622c(imageView3, 0.0f, 0.0f);
                } else if (imageView3 == null || imageView3.getDrawable() == null) {
                    C74863w0.m89622c(findViewById, ((float) (findViewById.getWidth() / 4)) * (1.0f - f2) * -1.0f, 0.0f);
                } else {
                    C74863w0.m89622c(imageView3, ((float) (imageView3.getWidth() / 4)) * (1.0f - f2) * -1.0f, 0.0f);
                }
            } else {
                Log.m105925i("ChattingCompat", "[onSwipe] return! consumedSuperCall:%s", Float.valueOf(f));
            }
        }
    }
}
