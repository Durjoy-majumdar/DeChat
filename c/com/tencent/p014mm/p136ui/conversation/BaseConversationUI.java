package com.tencent.p014mm.p136ui.conversation;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import ck3.C67397f;
import ck3.C67398g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74753e;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.HomeUI;
import com.tencent.p014mm.p136ui.IChattingUIProxy;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.p136ui.base.OnLayoutChangedLinearLayout;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.ChattingUIProxy;
import com.tencent.p014mm.p136ui.tools.C74863w0;
import com.tencent.p014mm.p136ui.tools.TestTimeForChatting;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import f40.C86709a0;
import go3.C76019y;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C88990b;
import p206nj.C11171e;
import p605mj.C34575a;
import p680ru.C77570i;
import yi3.C79122c;

/* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI */
public class BaseConversationUI extends MMFragmentActivity {
    private static final String LAST_RESTORE_TALKER = "last_restore_talker";
    public static final String TAG = "MicroMsg.BaseConversationUI";
    private byte _hellAccFlag_;
    /* access modifiers changed from: private */
    public OnLayoutChangedLinearLayout chattingFragmentView;
    /* access modifiers changed from: private */
    public ChattingUIFragment chattingFragmet;
    private int chattingID = -1;
    /* access modifiers changed from: private */
    public IChattingUIProxy chattingUIProxy;
    /* access modifiers changed from: private */
    public TestTimeForChatting chattingView;
    /* access modifiers changed from: private */
    public long chattinguiResumeTime = 0;
    public BaseConversationFmUI conversationFm;
    /* access modifiers changed from: private */
    public boolean isAnimating;
    /* access modifiers changed from: private */
    public String lastRestoreTalker;
    private C74623l launcherUIStatus = C74623l.ACTIVITY_CREATE;
    private ActionBar mActionBar;
    private C74753e mActionBarHelper;
    public boolean mChattingClosed = true;
    private Animation mChattingInAnim;
    private Animation mChattingOutAnim;
    /* access modifiers changed from: private */
    public boolean mNeedChattingAnim = false;
    private Bitmap mPrepareBitmap;
    /* access modifiers changed from: private */
    public OnLayoutChangedLinearLayout.C73214a onChattingLayoutChangedListener = new C74615g();
    /* access modifiers changed from: private */
    public long onDrawStart = 0;
    public Bundle pendingBundle;
    public String pendingUser;
    private C74624m selectImageJob = new C74624m((C74611c) null);
    public Runnable startChattingRunnable = new C74620j();
    private CharSequence title;

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$a */
    public class C74609a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f219288d;

        public C74609a(String str) {
            this.f219288d = str;
        }

        public void run() {
            Class cls = C77570i.class;
            if (BaseConversationUI.this.chattingFragmet != null) {
                ((C77570i) C86312j.m106911c(cls)).mo107725zI(4, "ChattingUI" + this.f219288d, BaseConversationUI.this.chattingFragmet.hashCode());
                ((C77570i) C86312j.m106911c(cls)).Ge0("ChattingUI" + this.f219288d, BaseConversationUI.this.chattinguiResumeTime, Util.nowSecond());
                ((C77570i) C86312j.m106911c(cls)).mo107725zI(3, BaseConversationUI.this.getLocalClassName(), BaseConversationUI.this.hashCode());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$b */
    public class C74610b implements View.OnClickListener {
        public C74610b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/BaseConversationUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (BaseConversationUI.this.isAnimating) {
                C117292a.m165361g(this, "com/tencent/mm/ui/conversation/BaseConversationUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            MMHandlerThread.removeRunnable(BaseConversationUI.this.startChattingRunnable);
            BaseConversationUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/BaseConversationUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$c */
    public class C74611c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f219291d;

        /* renamed from: e */
        public final /* synthetic */ boolean f219292e;

        public C74611c(String str, boolean z) {
            this.f219291d = str;
            this.f219292e = z;
        }

        public void run() {
            ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(3, this.f219291d, this.f219292e ? BaseConversationUI.this.chattingFragmet.hashCode() : BaseConversationUI.this.hashCode());
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$d */
    public class C74612d implements C67397f {
        public C74612d() {
        }

        public boolean queueIdle() {
            long currentTimeMillis = System.currentTimeMillis();
            if (BaseConversationUI.this.chattingView == null) {
                BaseConversationFmUI baseConversationFmUI = BaseConversationUI.this.conversationFm;
                BaseConversationUI.this.prepareChattingFragment(new Intent().putExtra("Chat_User", (baseConversationFmUI == null || Util.isNullOrNil(baseConversationFmUI.getUserName())) ? C75592q0.m90789s() : BaseConversationUI.this.conversationFm.getUserName()), true);
                BaseConversationUI.this.chattingView.setVisibility(8);
                BaseConversationUI.this.resumeMainFragment();
            }
            Log.m105919d(BaseConversationUI.TAG, "prepare chattingUI logic use %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$e */
    public class C74613e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f219295d;

        /* renamed from: e */
        public final /* synthetic */ boolean f219296e;

        public C74613e(String str, boolean z) {
            this.f219295d = str;
            this.f219296e = z;
        }

        public void run() {
            Class cls = C77570i.class;
            int hashCode = BaseConversationUI.this.chattingFragmet != null ? BaseConversationUI.this.chattingFragmet.hashCode() : 0;
            C77570i iVar = (C77570i) C86312j.m106911c(cls);
            String str = this.f219295d;
            if (!this.f219296e) {
                hashCode = BaseConversationUI.this.hashCode();
            }
            iVar.mo107725zI(4, str, hashCode);
            if (this.f219296e) {
                ((C77570i) C86312j.m106911c(cls)).Ge0("ChattingUI" + BaseConversationUI.this.getIdentityString(), BaseConversationUI.this.chattinguiResumeTime, Util.nowSecond());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$f */
    public class C74614f implements Runnable {
        public C74614f() {
        }

        public void run() {
            C86709a0.m107525e().setLowPriority();
            MMHandlerThread.setCurrentPriority(0);
            BaseConversationUI.this.onSwipe(1.0f);
            if (!(BaseConversationUI.this.chattingView == null || BaseConversationUI.this.chattingFragmet == null)) {
                BaseConversationUI.this.chattingView.mo104056a();
            }
            BaseConversationUI.this.chattingUIProxy.onEnterEnd();
            BaseConversationUI.this.tryResetChattingSwipeStatus();
        }

        public String toString() {
            return super.toString() + "|chattingView_onAnimationEnd";
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$g */
    public class C74615g implements OnLayoutChangedLinearLayout.C73214a {

        /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$g$a */
        public class C74616a implements TestTimeForChatting.C74844b {
            public C74616a() {
            }

            /* renamed from: a */
            public void mo101521a() {
                Log.m105924i(BaseConversationUI.TAG, "[onDrawed]");
                long unused = BaseConversationUI.this.onDrawStart = System.currentTimeMillis();
                if (BaseConversationUI.this.chattingFragmet == null) {
                    Log.m105920e(BaseConversationUI.TAG, "chattingFragmet is null!");
                    return;
                }
                BaseConversationUI.this.startChattingViewAnimation();
                BaseConversationUI.this.chattingView.setOndispatchDraw((TestTimeForChatting.C74844b) null);
            }
        }

        public C74615g() {
        }

        /* renamed from: a */
        public void mo101517a() {
            BaseConversationUI.this.initChattingInAnimation();
            if (BaseConversationUI.this.mNeedChattingAnim) {
                BaseConversationUI.this.chattingView.setOndispatchDraw(new C74616a());
                boolean unused = BaseConversationUI.this.mNeedChattingAnim = false;
            } else {
                BaseConversationUI.this.doJobOnChattingAnimStart();
                BaseConversationUI.this.doJobOnChattingAnimEnd();
            }
            BaseConversationUI.this.chattingFragmentView.f214982d = null;
            Log.m105924i(BaseConversationUI.TAG, "klem CHATTING ONLAYOUT ");
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$h */
    public class C74617h implements Animation.AnimationListener {
        public C74617h() {
        }

        public void onAnimationEnd(Animation animation) {
            boolean unused = BaseConversationUI.this.isAnimating = false;
            Log.m105924i(BaseConversationUI.TAG, "klem animationEnd");
            BaseConversationUI.this.doJobOnChattingAnimEnd();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            Log.m105925i(BaseConversationUI.TAG, "klem onAnimationStart onDrawed->onAnimationStart:%sms", Long.valueOf(System.currentTimeMillis() - BaseConversationUI.this.onDrawStart));
            boolean unused = BaseConversationUI.this.isAnimating = true;
            BaseConversationUI.this.doJobOnChattingAnimStart();
            BaseConversationUI.this.onSettle(false, 0);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$i */
    public class C74618i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f219302d;

        /* renamed from: e */
        public final /* synthetic */ int[] f219303e;

        /* renamed from: f */
        public final /* synthetic */ HomeUI.FitSystemWindowLayoutView f219304f;

        /* renamed from: g */
        public final /* synthetic */ ViewGroup f219305g;

        /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$i$a */
        public class C74619a implements View.OnApplyWindowInsetsListener {
            public C74619a() {
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (windowInsets == null) {
                    return windowInsets;
                }
                Log.m105925i(BaseConversationUI.TAG, "OnApplyWindowInsetsListener %s", windowInsets);
                windowInsets.consumeSystemWindowInsets();
                C74618i iVar = C74618i.this;
                BaseConversationUI.this.updateRootViewSystemWindowsInsets(iVar.f219304f, windowInsets.getSystemWindowInsetTop(), new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom()), C74618i.this.f219305g);
                return windowInsets;
            }
        }

        public C74618i(View view, int[] iArr, HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, ViewGroup viewGroup) {
            this.f219302d = view;
            this.f219303e = iArr;
            this.f219304f = fitSystemWindowLayoutView;
            this.f219305g = viewGroup;
        }

        public void run() {
            this.f219302d.getLocationInWindow(this.f219303e);
            int i = this.f219303e[1];
            if (i > 0) {
                BaseConversationUI.this.updateRootViewSystemWindowsInsets(this.f219304f, i, new Rect(0, i, 0, 0), this.f219305g);
            } else if (C11171e.m11046c(20)) {
                this.f219304f.setOnApplyWindowInsetsListener(new C74619a());
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$j */
    public class C74620j extends C67398g {

        /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$j$a */
        public class C74621a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f219309d;

            public C74621a(String str) {
                this.f219309d = str;
            }

            public void run() {
                Class cls = C77570i.class;
                if (BaseConversationUI.this.chattingFragmet != null) {
                    ((C77570i) C86312j.m106911c(cls)).mo107725zI(4, BaseConversationUI.this.getLocalClassName(), BaseConversationUI.this.hashCode());
                    ((C77570i) C86312j.m106911c(cls)).mo107725zI(3, "ChattingUI" + this.f219309d, BaseConversationUI.this.chattingFragmet.hashCode());
                }
            }
        }

        public C74620j() {
        }

        /* renamed from: a */
        public void mo91597a() {
            if (!BaseConversationUI.this.mChattingClosed) {
                Log.m105920e(BaseConversationUI.TAG, "start chatting but last chatting does't be close!");
                BaseConversationUI.this.closeChatting(false);
            }
            if (!BaseConversationUI.this.isFinishing() && !BaseConversationUI.this.isPaused()) {
                BaseConversationUI baseConversationUI = BaseConversationUI.this;
                if (baseConversationUI.mChattingClosed) {
                    baseConversationUI.mChattingClosed = false;
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(baseConversationUI.chattingView == null ? false : BaseConversationUI.this.chattingView.isShown());
                    Log.m105925i(BaseConversationUI.TAG, "ashutest::startChatting, ishow:%b", objArr);
                    Intent putExtra = new Intent().putExtra("Chat_User", BaseConversationUI.this.pendingUser);
                    Bundle bundle = BaseConversationUI.this.pendingBundle;
                    if (bundle != null) {
                        putExtra.putExtras(bundle);
                    }
                    putExtra.putExtra("img_gallery_enter_from_chatting_ui", true);
                    BaseConversationUI.this.prepareChattingFragment(putExtra, false);
                    BaseConversationUI.this.chattingFragmentView.setOnChattingLayoutChangedListener(BaseConversationUI.this.onChattingLayoutChangedListener);
                    BaseConversationUI.this.chattingView.setTranslationX(((float) (BaseConversationUI.this.getWindow().getDecorView().getWidth() == 0 ? BaseConversationUI.this.getResources().getDisplayMetrics().widthPixels : BaseConversationUI.this.getWindow().getDecorView().getWidth())) - 0.1f);
                    BaseConversationUI.this.chattingView.setVisibility(0);
                    BaseConversationUI.this.pauseMainFragment();
                    if (BaseConversationUI.this.chattingFragmet.isSupportNavigationSwipeBack()) {
                        C76019y.m91316d(BaseConversationUI.this);
                    }
                    ThreadPool.post(new C74621a(BaseConversationUI.this.chattingFragmet.getIdentityString()), "directReport_startChattingRunnable");
                    long unused = BaseConversationUI.this.chattinguiResumeTime = Util.nowSecond();
                    return;
                }
            }
            Log.m105929w(BaseConversationUI.TAG, "[startChattingRunnable] pass! isPause:%s mChattingClosed:%s", Boolean.valueOf(BaseConversationUI.this.isPaused()), Boolean.valueOf(BaseConversationUI.this.mChattingClosed));
        }

        public String toString() {
            return super.toString() + "|startChattingRunnable";
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$k */
    public class C74622k implements Animation.AnimationListener {
        public C74622k() {
        }

        public void onAnimationEnd(Animation animation) {
            C86709a0.m107525e().setLowPriority();
            MMHandlerThread.setCurrentPriority(0);
            BaseConversationUI.this.tryResetChattingSwipeStatus();
            Log.m105924i(BaseConversationUI.TAG, "klem pop out onAnimationEnd");
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            C86709a0.m107525e().setLowestPriority();
            MMHandlerThread.setCurrentPriority(-8);
            Log.m105924i(BaseConversationUI.TAG, "klem pop out onAnimationStart");
            BaseConversationUI.this.onSettle(true, 0);
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$l */
    public enum C74623l {
        ACTIVITY_CREATE,
        ACTIVITY_RESUME,
        ACTIVITY_PAUSE
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$m */
    public class C74624m implements Runnable {

        /* renamed from: d */
        public int f219316d = 0;

        /* renamed from: e */
        public int f219317e;

        /* renamed from: f */
        public int f219318f;

        /* renamed from: g */
        public Intent f219319g;

        /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$m$a */
        public class C74625a implements Runnable {
            public C74625a() {
            }

            public void run() {
                boolean z = true;
                Object[] objArr = new Object[1];
                if (BaseConversationUI.this.chattingFragmet != null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105919d(BaseConversationUI.TAG, "on select image ActivityResult. after creat chattingUI, chatting fragment is null? %B", objArr);
                if (BaseConversationUI.this.chattingFragmet != null) {
                    Log.m105918d(BaseConversationUI.TAG, "on select image ActivityResult. do post activity result");
                    ChattingUIFragment access$000 = BaseConversationUI.this.chattingFragmet;
                    C74624m mVar = C74624m.this;
                    access$000.onActivityResult(mVar.f219317e & 65535, mVar.f219318f, mVar.f219319g);
                }
            }

            public String toString() {
                return super.toString() + "|PostSelectImageJob_onActivityResult";
            }
        }

        public C74624m(C74611c cVar) {
        }

        public void run() {
            if (C97625j3.m125811a()) {
                Log.m105925i(BaseConversationUI.TAG, "on post select image job, acc has ready, retry count %d", Integer.valueOf(this.f219316d));
                BaseConversationUI baseConversationUI = BaseConversationUI.this;
                baseConversationUI.startChatting(baseConversationUI.lastRestoreTalker);
                MMHandlerThread.postToMainThread(new C74625a());
                return;
            }
            int i = this.f219316d;
            if (i >= 3) {
                Log.m105928w(BaseConversationUI.TAG, "on post select image job, match max retry count");
                return;
            }
            Log.m105929w(BaseConversationUI.TAG, "on post select image job, acc not ready, cur retry count %d", Integer.valueOf(i));
            this.f219316d++;
            MMHandlerThread.postToMainThreadDelayed(this, 300);
        }

        public String toString() {
            return super.toString() + "|PostSelectImageJob";
        }
    }

    private boolean acceptRequestCode(int i) {
        int i2 = i & 65535;
        Log.m105929w(TAG, "check request code %d", Integer.valueOf(i2));
        return i2 == 217 || i2 == 218;
    }

    private void createChattingView() {
        if (this.chattingView == null) {
            if (!this.chattingFragmet.isSupportCustomActionBar()) {
                TestTimeForChatting testTimeForChatting = (TestTimeForChatting) findViewById(C0966R.C0970id.b3p);
                this.chattingView = testTimeForChatting;
                this.chattingID = testTimeForChatting.getId();
                return;
            }
            int[] iArr = new int[2];
            View j = getSupportActionBar().mo91099j();
            if (j != null) {
                j.getLocationInWindow(iArr);
            }
            TestTimeForChatting testTimeForChatting2 = new TestTimeForChatting(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            testTimeForChatting2.setId(C0966R.C0970id.b4i);
            this.chattingID = testTimeForChatting2.getId();
            testTimeForChatting2.setOrientation(1);
            testTimeForChatting2.setLayoutParams(layoutParams);
            HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView = new HomeUI.FitSystemWindowLayoutView(this);
            fitSystemWindowLayoutView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            View findRootContainer = findRootContainer();
            if (findRootContainer == null) {
                findRootContainer = ((ViewGroup) getWindow().getDecorView()).getChildAt(0);
            }
            ViewGroup viewGroup = findRootContainer instanceof SwipeBackLayout ? (ViewGroup) ((ViewGroup) findRootContainer).getChildAt(0) : (ViewGroup) findRootContainer;
            ImageView imageView = new ImageView(this);
            imageView.setId(C0966R.C0970id.i1m);
            imageView.setLayoutParams(layoutParams);
            imageView.setVisibility(8);
            ((ViewGroup) getWindow().getDecorView()).removeView(findRootContainer);
            findRootContainer.setId(C0966R.C0970id.f358506fj1);
            fitSystemWindowLayoutView.addView(findRootContainer);
            fitSystemWindowLayoutView.addView(imageView);
            fitSystemWindowLayoutView.addView(testTimeForChatting2);
            ((ViewGroup) getWindow().getDecorView()).addView(fitSystemWindowLayoutView);
            getWindow().getDecorView().requestFitSystemWindows();
            int i = iArr[1];
            if (i > 0) {
                updateRootViewSystemWindowsInsets(fitSystemWindowLayoutView, i, new Rect(0, i, 0, 0), viewGroup);
            } else {
                View j2 = getSupportActionBar().mo91099j();
                if (j2 != null) {
                    j2.post(new C74618i(j2, iArr, fitSystemWindowLayoutView, viewGroup));
                } else {
                    return;
                }
            }
            this.chattingView = (TestTimeForChatting) findViewById(this.chattingID);
            Log.m105925i(TAG, "ashu::prepareChattingFragment init chattingView, top %s", Integer.valueOf(iArr[1]));
        } else if (this.chattingFragmet.isSupportCustomActionBar()) {
            int[] iArr2 = new int[2];
            this.chattingView.getLocationInWindow(iArr2);
            if (iArr2[1] == 0) {
                ViewGroup viewGroup2 = (ViewGroup) getWindow().getDecorView();
                int i2 = 0;
                while (true) {
                    if (i2 >= viewGroup2.getChildCount()) {
                        break;
                    }
                    View childAt = ((ViewGroup) getWindow().getDecorView()).getChildAt(i2);
                    if (childAt instanceof HomeUI.FitSystemWindowLayoutView) {
                        if (getSupportActionBar().mo91099j() != null) {
                            getSupportActionBar().mo91099j().getLocationInWindow(iArr2);
                        }
                        HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView2 = (HomeUI.FitSystemWindowLayoutView) childAt;
                        fitSystemWindowLayoutView2.fitSystemWindows(new Rect(0, fitSystemWindowLayoutView2.getCacheInsetsTop(), 0, 0));
                        Log.m105925i(TAG, "rootLayout2 fitSystemWindows, top %s", Integer.valueOf(iArr2[1]));
                        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(C0966R.C0970id.f358506fj1);
                        ImageView imageView2 = (ImageView) fitSystemWindowLayoutView2.findViewById(C0966R.C0970id.i1m);
                        imageView2.setTag(viewGroup3);
                        ViewGroup.LayoutParams layoutParams2 = viewGroup3.getLayoutParams();
                        if (layoutParams2 == null || (layoutParams2 instanceof FrameLayout.LayoutParams)) {
                            imageView2.setLayoutParams(layoutParams2);
                        } else {
                            Log.m105928w(TAG, "FIX LayoutParams");
                            imageView2.setLayoutParams(new FrameLayout.LayoutParams(layoutParams2));
                        }
                        Bitmap magicDrawingCache = getMagicDrawingCache(viewGroup3);
                        if (magicDrawingCache != null) {
                            imageView2.setImageBitmap(magicDrawingCache);
                            viewGroup3.setVisibility(8);
                            imageView2.setVisibility(0);
                            Log.m105924i(TAG, "[prepareChattingFragment] prepareView VISIBLE");
                        } else {
                            imageView2.setImageBitmap((Bitmap) null);
                        }
                    } else {
                        Log.m105921e(TAG, "on position %d, rootLayout not found!", Integer.valueOf(i2));
                        i2++;
                    }
                }
            }
            Log.m105925i(TAG, "ashu::prepareChattingFragment has chattingView, top %s", Integer.valueOf(iArr2[1]));
        }
    }

    /* access modifiers changed from: private */
    public void doJobOnChattingAnimEnd() {
        MMHandlerThread.postToMainThreadDelayed(new C74614f(), 60);
    }

    /* access modifiers changed from: private */
    public void doJobOnChattingAnimStart() {
        this.chattingView.setTranslationX(0.0f);
        this.chattingView.mo104057b();
    }

    private ViewGroup findRootContainer() {
        ViewGroup viewGroup;
        View j = this.mActionBar.mo91099j();
        ViewGroup viewGroup2 = null;
        if (j == null) {
            return null;
        }
        ViewParent parent = j.getParent();
        ViewGroup viewGroup3 = (ViewGroup) getWindow().getDecorView();
        while (true) {
            ViewGroup viewGroup4 = viewGroup2;
            viewGroup2 = parent;
            viewGroup = viewGroup4;
            if (viewGroup2 != viewGroup3 && viewGroup2 != null) {
                parent = viewGroup2.getParent();
            }
        }
        return viewGroup;
    }

    /* access modifiers changed from: private */
    public String getIdentityString() {
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        return chattingUIFragment != null ? chattingUIFragment.getIdentityString() : "";
    }

    private void initActionBar() {
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment == null || !chattingUIFragment.f215220f.f193283g) {
            Log.m105928w(TAG, "[initActionBar] isChattingForeground False!");
            View actionBarCustomView = getActionBarCustomView();
            this.mActionBarHelper = new C74753e(actionBarCustomView);
            this.mActionBar.mo91091I(new ColorDrawable(getResources().getColor(17170445)));
            this.mActionBar.mo91088F(false);
            this.mActionBar.mo91084B(false);
            this.mActionBar.mo91087E(false);
            this.mActionBar.mo91086D(true);
            this.mActionBar.mo91114y(actionBarCustomView);
            updateTitle(this.title);
            C74753e eVar = this.mActionBarHelper;
            eVar.f219799a.setOnClickListener(new C74610b());
            if (this.mActionBar.mo91099j() != null) {
                ImageView imageView = (ImageView) this.mActionBar.mo91099j().findViewById(C0966R.C0970id.f6148yn);
                ((TextView) this.mActionBar.mo91099j().findViewById(C0966R.C0970id.ko4)).setTextColor(getResources().getColor(C0966R.color.f3139gn));
                return;
            }
            return;
        }
        Log.m105928w(TAG, "[initActionBar] isChattingForeground True!");
    }

    /* access modifiers changed from: private */
    public void initChattingInAnimation() {
        if (this.mChattingInAnim == null) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this, MMFragmentActivity$$c.f318644a);
            this.mChattingInAnim = loadAnimation;
            loadAnimation.setAnimationListener(new C74617h());
        }
    }

    /* access modifiers changed from: private */
    public void prepareChattingFragment(Intent intent, boolean z) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.chattingFragmet == null) {
            ChattingUIFragment chattingUIFragment = getChattingUIFragment();
            this.chattingFragmet = chattingUIFragment;
            this.chattingUIProxy = new ChattingUIProxy(this, chattingUIFragment);
            z2 = true;
        } else {
            z2 = false;
        }
        createChattingView();
        if (intent != null) {
            this.chattingFragmet.getArguments().putAll(IntentUtil.getExtras(intent));
        }
        if (z2) {
            this.chattingUIProxy.onInit(this.chattingID, z);
            this.chattingFragmentView = (OnLayoutChangedLinearLayout) this.chattingFragmet.getView().findViewById(C0966R.C0970id.f357668b43);
        } else {
            this.chattingUIProxy.onEnterBegin();
        }
        if (this.chattingFragmet.isSupportNavigationSwipeBack()) {
            this.chattingFragmet.getSwipeBackLayout().setNeedRequestActivityTranslucent(false);
        }
        Log.m105925i(TAG, "ashu::prepareChattingFragment use %dms, needInit %B, Intent %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(z2), intent);
    }

    private void resetViewTranX(View view, ImageView imageView, float f) {
        if (Float.compare(1.0f, f) <= 0) {
            C74863w0.m89622c(view, 0.0f, 0.0f);
            C74863w0.m89622c(imageView, 0.0f, 0.0f);
        } else if (imageView == null || imageView.getDrawable() == null) {
            C74863w0.m89622c(view, ((float) (view.getWidth() / 4)) * (1.0f - f) * -1.0f, 0.0f);
        } else {
            C74863w0.m89622c(imageView, ((float) (imageView.getWidth() / 4)) * (1.0f - f) * -1.0f, 0.0f);
        }
    }

    /* access modifiers changed from: private */
    public void tryResetChattingSwipeStatus() {
        if (C88990b.m111196e() && C34575a.m40396a()) {
            boolean z = true;
            Object[] objArr = new Object[1];
            if (this.chattingFragmet != null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105925i(TAG, "ashutest: tryResetChattingSwipeStatus, chattingFragment NULL ? %B", objArr);
            ChattingUIFragment chattingUIFragment = this.chattingFragmet;
            if (chattingUIFragment != null && chattingUIFragment.getSwipeBackLayout() != null) {
                this.chattingFragmet.getSwipeBackLayout().f56498v = false;
            }
        }
    }

    /* access modifiers changed from: private */
    public void updateRootViewSystemWindowsInsets(HomeUI.FitSystemWindowLayoutView fitSystemWindowLayoutView, int i, Rect rect, ViewGroup viewGroup) {
        int bottom = getWindow().getDecorView().getBottom();
        int bottom2 = getSupportActionBar().mo91099j() != null ? getSupportActionBar().mo91099j().getBottom() : 0;
        BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        Log.m105925i(TAG, "ashu::fitSystemWindows 2. decorBottom:%d, statusBarHeight:%d, actionBarHeight:%d, paddingForNavBar:%d", Integer.valueOf(bottom), Integer.valueOf(i), Integer.valueOf(bottom2), Integer.valueOf((baseConversationFmUI == null || baseConversationFmUI.getView() == null) ? 0 : bottom - ((i + bottom2) + this.conversationFm.getView().getBottom())));
        fitSystemWindowLayoutView.setActionBarContainer(viewGroup);
        fitSystemWindowLayoutView.fitSystemWindows(rect);
    }

    public void closeChatting(boolean z) {
        ImageView imageView;
        Object[] objArr = new Object[1];
        TestTimeForChatting testTimeForChatting = this.chattingView;
        objArr[0] = Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        Log.m105925i(TAG, "try closeChatting, ishow:%b", objArr);
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment != null && chattingUIFragment.isSupportNavigationSwipeBack()) {
            C76019y.m91315c(this);
        }
        TestTimeForChatting testTimeForChatting2 = this.chattingView;
        if (testTimeForChatting2 != null && testTimeForChatting2.getVisibility() != 8 && this.chattingFragmet != null) {
            Log.m105925i(TAG, "[closeChatting] needAnim:%s", Boolean.valueOf(z));
            this.chattingView.setVisibility(8);
            this.mChattingClosed = true;
            if (z && this.mChattingOutAnim == null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(this, MMFragmentActivity$$c.f318647d);
                this.mChattingOutAnim = loadAnimation;
                loadAnimation.setAnimationListener(new C74622k());
            }
            if (this.chattingFragmet.isSupportCustomActionBar() && (imageView = (ImageView) getWindow().getDecorView().findViewById(C0966R.C0970id.i1m)) != null && imageView.getVisibility() == 0) {
                imageView.setVisibility(8);
                Log.m105924i(TAG, "[closeChatting] prepareView GONE");
                if (imageView.getTag() != null) {
                    View view = (View) imageView.getTag();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/BaseConversationUI", "closeChatting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/BaseConversationUI", "closeChatting", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (z) {
                this.chattingUIProxy.onExitBegin();
                this.chattingUIProxy.onExitEnd();
                this.chattingView.startAnimation(this.mChattingOutAnim);
            } else {
                this.chattingUIProxy.onExitBegin();
                this.chattingUIProxy.onExitEnd();
                this.chattingView.setVisibility(8);
                onSwipe(1.0f);
                tryResetChattingSwipeStatus();
            }
            if (!this.chattingFragmet.isSupportCustomActionBar()) {
                initActionBar();
            }
            supportInvalidateOptionsMenu();
            resumeMainFragment();
            ThreadPool.post(new C74609a(getIdentityString()), "directReport_closeChatting");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Log.m105919d(TAG, "chatting ui dispatch key event %s", keyEvent);
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            MMHandlerThread.removeRunnable(this.startChattingRunnable);
        }
        if (this.isAnimating) {
            return true;
        }
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment == null || !chattingUIFragment.onKeyDown(keyEvent.getKeyCode(), keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public View getActionBarCustomView() {
        return C85868k2.m106137b(this).inflate(C0966R.C0971layout.f6301b3, (ViewGroup) null);
    }

    public ChattingUIFragment getChattingUIFragment() {
        return new ChattingUIFragment();
    }

    public Bitmap getMagicDrawingCache(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0) {
            width = view.getMeasuredWidth();
        }
        if (height <= 0) {
            height = view.getMeasuredHeight();
        }
        if (width <= 0 || height <= 0 || this.chattingFragmet.getView() == null) {
            Log.m105921e(TAG, "viewWidth:%s viewHeight:%s", Integer.valueOf(width), Integer.valueOf(height));
            return null;
        }
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment != null) {
            Log.m105925i(TAG, "getBottom:%s keyboardState:%s", Integer.valueOf(chattingUIFragment.getView().getBottom()), Integer.valueOf(this.chattingFragmet.keyboardState()));
        }
        ChattingUIFragment chattingUIFragment2 = this.chattingFragmet;
        if (chattingUIFragment2 == null || chattingUIFragment2.getView().getBottom() <= 0 || (this.chattingFragmet.keyboardState() != 1 && this.chattingFragmet.getView().getBottom() >= (getResources().getDisplayMetrics().heightPixels * 2) / 3)) {
            ChattingUIFragment chattingUIFragment3 = this.chattingFragmet;
            if (chattingUIFragment3 == null || chattingUIFragment3.keyboardState() != 1) {
                Bitmap bitmap = this.mPrepareBitmap;
                if (bitmap == null || bitmap.isRecycled() || this.mPrepareBitmap.getWidth() != width || this.mPrepareBitmap.getHeight() != height) {
                    Bitmap bitmap2 = this.mPrepareBitmap;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        Log.m105925i(TAG, "bitmap recycle %s", this.mPrepareBitmap.toString());
                        this.mPrepareBitmap.recycle();
                    }
                    try {
                        this.mPrepareBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
                    } catch (OutOfMemoryError e) {
                        Log.m105921e(TAG, "[getMagicDrawingCache] e:%s", e);
                        return null;
                    }
                } else {
                    this.mPrepareBitmap.eraseColor(0);
                }
                Canvas canvas = new Canvas(this.mPrepareBitmap);
                Paint paint = new Paint();
                paint.setColor(-1);
                canvas.drawRect(0.0f, (float) ((int) getResources().getDimension(C0966R.dimen.f357083au0)), (float) width, (float) (height - ((int) getResources().getDimension(C0966R.dimen.f3683bc))), paint);
                view.draw(canvas);
                Log.m105925i(TAG, "[getMagicDrawingCache] cost%sms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                return this.mPrepareBitmap;
            }
            Log.m105921e(TAG, "hardKeyboardHidden:%s", Integer.valueOf(this.chattingFragmet.keyboardState()));
            return null;
        }
        Log.m105921e(TAG, "hardKeyboardHidden:%s", Integer.valueOf(this.chattingFragmet.keyboardState()));
        return null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ChattingUIFragment chattingUIFragment;
        super.onActivityResult(i, i2, intent);
        BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.onActivityResult(i, i2, intent);
        }
        if (i2 == -1) {
            if ((i == 2001 || i == 226 || i == 229) && (chattingUIFragment = this.chattingFragmet) != null) {
                chattingUIFragment.onActivityResult(i, i2, intent);
            }
            if (acceptRequestCode(i) && this.chattingFragmet == null) {
                Log.m105924i(TAG, "on select image ActivityResult. the chattingUI maybe kill in the background.");
                MMHandlerThread.removeRunnable(this.selectImageJob);
                C74624m mVar = this.selectImageJob;
                mVar.f219316d = 0;
                mVar.f219317e = i;
                mVar.f219318f = i2;
                mVar.f219319g = intent;
                MMHandlerThread.postToMainThread(mVar);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        getWindow().setFormat(-2);
        super.onCreate(bundle);
        if (!C30847a.m39239a()) {
            getWindow().setCallback(new C79122c(getWindow().getCallback(), this));
        }
        this.mActionBar = getSupportActionBar();
        initNavigationSwipeBack();
    }

    public void onDestroy() {
        super.onDestroy();
        Bitmap bitmap = this.mPrepareBitmap;
        if (bitmap != null && !bitmap.isRecycled()) {
            Log.m105925i(TAG, "bitmap recycle %s", this.mPrepareBitmap.toString());
            this.mPrepareBitmap.recycle();
        }
        this.chattingFragmet = null;
        this.chattingFragmentView = null;
        this.chattingView = null;
        this.conversationFm = null;
        this.mActionBarHelper = null;
        this.mChattingInAnim = null;
        this.mChattingOutAnim = null;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.m105924i(TAG, "onNewIntent");
        setIntent(intent);
    }

    public void onPause() {
        String str;
        Log.m105924i(TAG, "on pause");
        super.onPause();
        if (!isFinishing()) {
            C76019y.m91316d(this);
        }
        this.launcherUIStatus = C74623l.ACTIVITY_PAUSE;
        TestTimeForChatting testTimeForChatting = this.chattingView;
        boolean z = testTimeForChatting != null && testTimeForChatting.isShown();
        if (z) {
            str = "ChattingUI" + getIdentityString();
        } else {
            str = getLocalClassName();
        }
        ThreadPool.post(new C74613e(str, z), "directReport_onPause");
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment != null && chattingUIFragment.isSupportNavigationSwipeBack()) {
            this.chattingFragmet.getSwipeBackLayout().setEnableGesture(false);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        String string = bundle.getString(LAST_RESTORE_TALKER);
        this.lastRestoreTalker = string;
        Log.m105919d(TAG, "onRestoreInstantceState:%s", string);
    }

    public void onResume() {
        String str;
        super.onResume();
        C76019y.m91315c(this);
        onSwipe(1.0f);
        this.launcherUIStatus = C74623l.ACTIVITY_RESUME;
        TestTimeForChatting testTimeForChatting = this.chattingView;
        boolean z = testTimeForChatting != null && testTimeForChatting.isShown();
        if (z) {
            str = "ChattingUI" + getIdentityString();
        } else {
            str = getLocalClassName();
        }
        ThreadPool.post(new C74611c(str, z), "directReport_onResume");
        if (!z) {
            this.chattinguiResumeTime = Util.nowSecond();
        }
        if (C88990b.m111196e() && C34575a.m40396a()) {
            ChattingUIFragment chattingUIFragment = this.chattingFragmet;
            if (chattingUIFragment != null && chattingUIFragment.isSupportNavigationSwipeBack()) {
                this.chattingFragmet.getSwipeBackLayout().setEnableGesture(true);
            }
            Looper.myQueue().addIdleHandler(new C74612d());
        }
        initActionBar();
        this.mActionBar.mo91094L();
    }

    public void onSaveInstanceState(Bundle bundle) {
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment != null && !Util.isNullOrNil(chattingUIFragment.f215220f.mo91577r())) {
            Log.m105919d(TAG, "onSaveInstanceState:%s", this.chattingFragmet.f215220f.mo91577r());
            bundle.putString(LAST_RESTORE_TALKER, this.chattingFragmet.f215220f.mo91577r());
        }
    }

    public void onSettle(boolean z, int i) {
        Log.m105927v(TAG, "ashutest: on settle %B, speed %d, resumeStatus %s", Boolean.valueOf(z), Integer.valueOf(i), this.launcherUIStatus);
        if (C88990b.m111196e() && C34575a.m40396a()) {
            View findViewById = findViewById(C0966R.C0970id.f358506fj1);
            if (findViewById == null) {
                Log.m105920e(TAG, "[onSettle] null == container");
                return;
            }
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.i1m);
            if (!(imageView == null || imageView.getVisibility() != 8 || imageView.getDrawable() == null)) {
                imageView.setVisibility(0);
                Log.m105924i(TAG, "[onSettle] prepareView VISIBLE");
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/conversation/BaseConversationUI", "onSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/conversation/BaseConversationUI", "onSettle", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        ViewGroup viewGroup;
        float f2 = f;
        Log.m105927v(TAG, "ashutest::on swipe %f, duration %d, status %s", Float.valueOf(f), 260L, this.launcherUIStatus);
        if (C88990b.m111196e() && C34575a.m40396a()) {
            ChattingUIFragment chattingUIFragment = this.chattingFragmet;
            if (chattingUIFragment == null) {
                Log.m105920e(TAG, "chattingFragmet is null!");
                return;
            }
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i == 0 && !this.mChattingClosed) {
                ImageView imageView = (ImageView) getWindow().getDecorView().findViewById(C0966R.C0970id.i1m);
                if (!(imageView == null || (viewGroup = (ViewGroup) imageView.getTag()) == null)) {
                    Log.m105924i(TAG, "[onSwipe] prepareView GONE");
                    viewGroup.setVisibility(0);
                    imageView.setVisibility(8);
                    imageView.setImageDrawable((Drawable) null);
                }
                Animation animation = this.mChattingInAnim;
                if (animation != null) {
                    animation.cancel();
                }
            } else if (f2 == 1.0f && !this.mChattingClosed && chattingUIFragment.isSupportNavigationSwipeBack()) {
                getWindow().setBackgroundDrawableResource(C0966R.color.a_h);
                ImageView imageView2 = (ImageView) getWindow().getDecorView().findViewById(C0966R.C0970id.i1m);
                if (!(imageView2 == null || imageView2.getVisibility() != 0 || imageView2.getTag() == null)) {
                    View view = (View) imageView2.getTag();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    Log.m105924i(TAG, "[onSwipe] prepareView GONE");
                    imageView2.setVisibility(8);
                }
            }
            if (C74623l.ACTIVITY_RESUME == this.launcherUIStatus || Float.compare(1.0f, f2) <= 0) {
                View findViewById = findViewById(C0966R.C0970id.f358506fj1);
                ImageView imageView3 = (ImageView) findViewById(C0966R.C0970id.i1m);
                if (!(imageView3 == null || imageView3.getVisibility() != 8 || imageView3.getDrawable() == null || this.mChattingClosed || f2 == 1.0f || i == 0)) {
                    imageView3.setVisibility(0);
                    Log.m105924i(TAG, "[onSwipe] !1 && !0 prepareView VISIBLE");
                    if (findViewById != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view3 = findViewById;
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/ui/conversation/BaseConversationUI", "onSwipe", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                resetViewTranX(findViewById, imageView3, f2);
                return;
            }
            Log.m105925i(TAG, "[onSwipe] return! consumedSuperCall:%s", Float.valueOf(f));
        }
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        ActionMode g;
        ChattingUIFragment chattingUIFragment = this.chattingFragmet;
        if (chattingUIFragment == null || chattingUIFragment.mo102029X() == null || !this.chattingFragmet.isSupportCustomActionBar() || C11171e.m11045b(22) || (g = this.chattingFragmet.mo102029X().f348690u0.mo164184g(callback)) == null) {
            return null;
        }
        return g;
    }

    public void pauseMainFragment() {
        BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.onPause();
            if (!this.conversationFm.isSupportNavigationSwipeBack()) {
                this.conversationFm.showOptionMenu(false);
            }
        }
    }

    public void resumeMainFragment() {
        BaseConversationFmUI baseConversationFmUI = this.conversationFm;
        if (baseConversationFmUI != null) {
            baseConversationFmUI.onResume();
            if (!this.conversationFm.isSupportNavigationSwipeBack()) {
                this.conversationFm.showOptionMenu(true);
            }
        }
    }

    public void setCustomTitle(CharSequence charSequence) {
        this.title = charSequence;
        if (this.mActionBarHelper != null) {
            updateTitle(charSequence);
        }
    }

    public void setTitle(String str) {
        this.title = str;
        if (this.mActionBarHelper != null) {
            updateTitle(str);
        }
    }

    public void startChatting(String str) {
        startChatting(str, (Bundle) null, false);
    }

    public void startChattingViewAnimation() {
        Log.m105924i(TAG, "alvinluo startChattingViewAnimation");
        initChattingInAnimation();
        if (this.chattingFragmet.getSwipeBackLayout() != null) {
            this.chattingFragmet.getSwipeBackLayout().startAnimation(this.mChattingInAnim);
        } else {
            this.chattingFragmet.getView().startAnimation(this.mChattingInAnim);
        }
    }

    public void updateTitle(String str) {
        C74753e eVar = this.mActionBarHelper;
        if (eVar != null) {
            eVar.mo103920c(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str));
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.BaseConversationUI$BaseConversationFmUI */
    public static class BaseConversationFmUI extends MMFragment {
        private C74623l fmStatus = C74623l.ACTIVITY_CREATE;

        /* renamed from: ui */
        public BaseConversationUI f219287ui;

        public void finish() {
            thisActivity().finish();
        }

        public int getLayoutId() {
            return 0;
        }

        public String getUserName() {
            return null;
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.fmStatus = C74623l.ACTIVITY_CREATE;
            this.f219287ui = (BaseConversationUI) thisActivity();
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }

        public void onDestroy() {
            if (this.fmStatus != C74623l.ACTIVITY_PAUSE) {
                Log.m105928w(BaseConversationUI.TAG, "fmStatus != ActivityStatus.ACTIVITY_PAUSE when fm onDestroy");
                onPause();
            }
            super.onDestroy();
        }

        public void onPause() {
            super.onPause();
            this.fmStatus = C74623l.ACTIVITY_PAUSE;
        }

        public void onResume() {
            super.onResume();
            this.fmStatus = C74623l.ACTIVITY_RESUME;
        }

        public void setMMTitle(String str) {
            BaseConversationUI baseConversationUI = this.f219287ui;
            if (baseConversationUI != null) {
                baseConversationUI.setTitle(str);
            }
        }

        public void setMMTitle(CharSequence charSequence) {
            BaseConversationUI baseConversationUI = this.f219287ui;
            if (baseConversationUI != null) {
                baseConversationUI.setCustomTitle(charSequence);
            }
        }
    }

    public void startChatting(String str, Bundle bundle, boolean z) {
        startChatting(str, bundle, z, true);
    }

    private void updateTitle(CharSequence charSequence) {
        C74753e eVar = this.mActionBarHelper;
        if (eVar != null) {
            eVar.mo103920c(charSequence);
        }
    }

    public void startChatting(String str, Bundle bundle, boolean z, boolean z2) {
        Object[] objArr = new Object[2];
        TestTimeForChatting testTimeForChatting = this.chattingView;
        objArr[0] = Boolean.valueOf(testTimeForChatting == null ? false : testTimeForChatting.isShown());
        objArr[1] = Boolean.valueOf(z2);
        Log.m105925i(TAG, "try startChatting, ishow:%b, post: %b", objArr);
        this.pendingBundle = bundle;
        this.pendingUser = str;
        this.mNeedChattingAnim = z;
        if (z2) {
            C86709a0.m107525e().setLowestPriority();
            MMHandlerThread.setCurrentPriority(-8);
            MMHandlerThread.removeRunnable(this.startChattingRunnable);
            MMHandlerThread.postToMainThread(this.startChattingRunnable);
            return;
        }
        this.startChattingRunnable.run();
    }
}
