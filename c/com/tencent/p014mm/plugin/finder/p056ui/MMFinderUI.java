package com.tencent.p014mm.plugin.finder.p056ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C39623j;
import bl3.C0324s;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.MMFinderUIScreenShotEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.SwipeBackLayout;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.plugin.finder.detector.api.detect.PageEventDetectorManager$registerLifeCycle$1;
import di3.C86312j;
import dp1.C58391n;
import eb0.C31543z5;
import er1.C58791y;
import f40.C86709a0;
import fe1.C32026j;
import fy3.C32224a;
import gs3.C59698c;
import gy3.C24560g0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import ht1.C8762d5;
import ht1.C8807v3;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import je1.C46554z4;
import kotlin.Metadata;
import l31.C61212e;
import nj3.C88990b;
import o40.C61926c;
import p640ox.C77049b;
import rs1.C13371q;
import rx3.C13598b0;
import te3.C48978cb0;
import tf0.C64916p1;
import up1.C37521f;
import wc1.C15126w;
import wc1.C15127x;
import wc1.C15128y;
import wc1.C15129z;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "a", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI */
public abstract class MMFinderUI extends BaseMvvmActivity {

    /* renamed from: n */
    public static final /* synthetic */ int f161151n = 0;

    /* renamed from: d */
    public boolean f161152d;

    /* renamed from: e */
    public Runnable f161153e;

    /* renamed from: f */
    public boolean f161154f;

    /* renamed from: g */
    public boolean f161155g;

    /* renamed from: h */
    public C56369a f161156h;

    /* renamed from: i */
    public boolean f161157i;

    /* renamed from: j */
    public final C56374e f161158j = new C56374e(this);

    /* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI$a */
    public interface C56369a {
        /* renamed from: a */
        void mo79125a(String str);
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI$b */
    public static final class C56370b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MMFinderUI f161159d;

        public C56370b(MMFinderUI mMFinderUI) {
            this.f161159d = mMFinderUI;
        }

        public final void run() {
            MMFinderUI mMFinderUI = this.f161159d;
            int i = MMFinderUI.f161151n;
            if (!mMFinderUI.f161155g) {
                mMFinderUI.f161155g = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI$c */
    public static final class C56371c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MMFinderUI f161160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56371c(MMFinderUI mMFinderUI) {
            super(0);
            this.f161160d = mMFinderUI;
        }

        public Object invoke() {
            C58391n nVar = C58391n.f167292a;
            View decorView = this.f161160d.getWindow().getDecorView();
            C87412m.m108593f(decorView, "this.window.decorView");
            nVar.mo83231g(decorView, this.f161160d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI$d */
    public static final class C56372d implements SwipeBackLayout.C19846b {

        /* renamed from: a */
        public final /* synthetic */ MMFinderUI f161161a;

        /* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI$d$a */
        public static final class C56373a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ SwipeBackLayout f161162d;

            /* renamed from: e */
            public final /* synthetic */ MMFinderUI f161163e;

            public C56373a(SwipeBackLayout swipeBackLayout, MMFinderUI mMFinderUI) {
                this.f161162d = swipeBackLayout;
                this.f161163e = mMFinderUI;
            }

            public final void run() {
                this.f161162d.setNeedRequestActivityTranslucent(true);
                this.f161162d.mo26381c(false);
                C88990b.m111193b(this.f161163e);
            }
        }

        public C56372d(MMFinderUI mMFinderUI) {
            this.f161161a = mMFinderUI;
        }

        /* renamed from: a */
        public void mo26396a(int i) {
            this.f161161a.mo4039L7(i);
        }

        /* renamed from: b */
        public void mo26397b() {
            SwipeBackLayout swipeBackLayout = this.f161161a.getSwipeBackLayout();
            if (swipeBackLayout != null) {
                swipeBackLayout.post(new C56373a(swipeBackLayout, this.f161161a));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.MMFinderUI$e */
    public static final class C56374e implements ScreenShotUtil.ScreenShotCallback {

        /* renamed from: d */
        public final /* synthetic */ MMFinderUI f161164d;

        public C56374e(MMFinderUI mMFinderUI) {
            this.f161164d = mMFinderUI;
        }

        public void onScreenShot(String str, long j) {
            try {
                List<C48978cb0> D3 = ((C60172g4) C39818r.f106831a.mo62444c(this.f161164d).mo62447c(C60172g4.class)).mo12838D3();
                if ((D3.isEmpty() ^ true ? D3 : null) != null) {
                    C86709a0.m107524d().mo123460f(new C46554z4(0, D3));
                } else {
                    int i = MMFinderUI.f161151n;
                    Log.m105924i("Finder.MMFinderUI", "[onScreenShot] extStats is empty");
                }
            } catch (Throwable th) {
                int i2 = MMFinderUI.f161151n;
                Log.printErrStackTrace("Finder.MMFinderUI", th, "onScreenShot", new Object[0]);
            }
            MMFinderUIScreenShotEvent mMFinderUIScreenShotEvent = new MMFinderUIScreenShotEvent();
            MMFinderUIScreenShotEvent.C55144a aVar = mMFinderUIScreenShotEvent.f154834d;
            if (str == null) {
                str = "";
            }
            aVar.f154835a = str;
            aVar.f154836b = j;
            mMFinderUIScreenShotEvent.publish();
        }
    }

    /* renamed from: H7 */
    public final void mo79123H7() {
        Serializable serializableExtra;
        Class cls = C61212e.class;
        ((C61212e) C86312j.m106911c(cls)).mo86131CH(this);
        if (getIntent() != null && (serializableExtra = getIntent().getSerializableExtra("key_yreportsdk_reddot_info")) != null && (serializableExtra instanceof HashMap)) {
            HashMap hashMap = (HashMap) serializableExtra;
            ((C61212e) C86312j.m106911c(cls)).Yt0(this, hashMap);
            Log.m105926v("Finder.MMFinderUI", "bind y report sdk " + hashMap.size());
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 0;
    }

    /* renamed from: J7 */
    public String mo2994J7() {
        return getClass().getSimpleName();
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 0;
    }

    /* renamed from: L7 */
    public void mo4039L7(int i) {
    }

    /* renamed from: M7 */
    public final void mo79124M7(boolean z) {
        Log.m105924i("Finder.MMFinderUI", "[LiveOrientation] needChangeOrientation set " + z);
        this.f161152d = z;
    }

    public boolean convertActivityFromTranslucent() {
        C13371q qVar = (C13371q) C39818r.f106831a.mo62444c(this).mo62449e(C13371q.class);
        boolean z = false;
        if (qVar != null && qVar.mo12784c3()) {
            z = true;
        }
        return !z;
    }

    public boolean enableActivityAnimation() {
        C13371q qVar = (C13371q) C39818r.f106831a.mo62444c(this).mo62449e(C13371q.class);
        boolean z = false;
        if (qVar != null && qVar.mo12784c3()) {
            z = true;
        }
        return !z;
    }

    public void finish() {
        super.finish();
        Log.m105924i("Finder.MMFinderUI", "finish " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + isPaused());
        if (!isPaused()) {
            this.f161153e = new C56370b(this);
        }
        this.f161154f = true;
    }

    public int getLayoutId() {
        return 0;
    }

    public void onCreate(Bundle bundle) {
        SwipeBackLayout swipeBackLayout;
        C58391n nVar = C58391n.f167292a;
        String J7 = mo2994J7();
        int hashCode = hashCode();
        nVar.getClass();
        C87412m.m108594g(J7, "tag");
        C58391n.C58392a c = nVar.mo83227c(hashCode, true);
        if (c != null) {
            c.f167295a = J7;
            c.f167296b = C58391n.f167294c;
            c.f167297c = C31543z5.m39453c();
        }
        super.onCreate(bundle);
        Log.m105924i("Finder.MMFinderUI", "onCreate " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + '}');
        C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
        if (p1Var != null) {
            p1Var.mo76671Mk(this);
        }
        C61926c.m72666K(0, new C56371c(this));
        C56369a aVar = this.f161156h;
        if (aVar != null) {
            aVar.mo79125a("onCreate");
        }
        C39623j lifecycle = getLifecycle();
        C59698c cVar = C59698c.f170541a;
        C87412m.m108594g(lifecycle, "lifecycle");
        lifecycle.addObserver(new PageEventDetectorManager$registerLifeCycle$1(this, lifecycle));
        if (isSupportNavigationSwipeBack() && (swipeBackLayout = getSwipeBackLayout()) != null) {
            swipeBackLayout.setDragListener(new C56372d(this));
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        C13371q qVar = (C13371q) C39818r.f106831a.mo62444c(this).mo62449e(C13371q.class);
        boolean z = true;
        if (qVar == null || !qVar.mo12784c3()) {
            z = false;
        }
        if (!z) {
            return;
        }
        if (C85875k4.m106211z()) {
            setTheme(C0966R.style.f8629pa);
        } else {
            setTheme(C0966R.style.f8630pb);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C56369a aVar = this.f161156h;
        if (aVar != null) {
            aVar.mo79125a("onDestroy");
        }
        Log.m105924i("Finder.MMFinderUI", "onDestroy " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f161154f);
        if (!this.f161154f && !this.f161155g) {
            this.f161155g = true;
        }
        C58391n.f167292a.mo83228d(hashCode(), this);
        C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
        if (p1Var != null) {
            p1Var.G50(this);
        }
        this.f161156h = null;
    }

    public void onNewIntent(Intent intent) {
        C56369a aVar = this.f161156h;
        if (aVar != null) {
            aVar.mo79125a("onNewIntent");
        }
        Log.m105924i("Finder.MMFinderUI", "onNewIntent " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f161154f);
        super.onNewIntent(intent);
    }

    public void onPause() {
        C32026j z2;
        super.onPause();
        C58791y.f168321a.getClass();
        Log.m105924i("Finder.FinderContextManager", "remove top activity:" + this);
        C58791y.f168322b = null;
        WeakReference<Activity> weakReference = C58791y.f168323c;
        if (C87412m.m108589b(this, weakReference != null ? weakReference.get() : null)) {
            String localClassName = getLocalClassName();
            C87412m.m108593f(localClassName, "activity.localClassName");
            if (!C112550d0.m153801u(localClassName, "FinderFinderSysMsgUI", false)) {
                C58791y.f168323c = null;
            }
        }
        C56369a aVar = this.f161156h;
        if (aVar != null) {
            aVar.mo79125a("onPause");
        }
        C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
        if (!(p1Var == null || (z2 = p1Var.mo9108z2()) == null)) {
            z2.mo58459c(this);
        }
        Log.m105924i("Finder.MMFinderUI", "onPause " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f161153e);
        if (this.f161157i) {
            C37521f.f99374d.getClass();
            if (C37521f.f99394f2.mo60266n().intValue() == 1) {
                Log.m105924i("Finder.MMFinderUI", "REPORT_WHEN_SCREEN_SHOT remove");
                ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
            }
        }
        Runnable runnable = this.f161153e;
        if (runnable != null) {
            runnable.run();
        }
        this.f161153e = null;
        if (isFinishing()) {
            C58391n.f167292a.mo83228d(hashCode(), this);
            return;
        }
        C58391n nVar = C58391n.f167292a;
        int hashCode = hashCode();
        C58391n.C58392a c = nVar.mo83227c(hashCode, false);
        if (c != null && c.f167299e == 0 && c.f167300f == 0) {
            Log.m105924i("FinderEnterCostReporter", "notifyOnPause: abandon useless data " + c);
            C58391n.f167293b.remove(Integer.valueOf(hashCode));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r0.f167298d == 0) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r14 = this;
            dp1.n r0 = dp1.C58391n.f167292a
            int r1 = r14.hashCode()
            r2 = 0
            dp1.n$a r0 = r0.mo83227c(r1, r2)
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L_0x001d
            long r4 = r0.f167298d
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            if (r4 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r1
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            long r4 = eb0.C31543z5.m39453c()
            r0.f167298d = r4
        L_0x0027:
            com.tencent.mm.plugin.finder.ui.MMFinderUI$a r0 = r14.f161156h
            if (r0 == 0) goto L_0x0030
            java.lang.String r1 = "onResume"
            r0.mo79125a(r1)
        L_0x0030:
            super.onResume()
            er1.y r0 = er1.C58791y.f168321a
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update top activity: "
            r0.append(r1)
            java.lang.Class r1 = r14.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderContextManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r14)
            er1.C58791y.f168322b = r0
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.p1 r0 = (tf0.C64916p1) r0
            if (r0 == 0) goto L_0x0071
            fe1.j r0 = r0.mo9108z2()
            if (r0 == 0) goto L_0x0071
            r0.mo58457a(r14)
        L_0x0071:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onResume "
            r0.append(r1)
            java.lang.Class r1 = r14.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r4 = r14.hashCode()
            r0.append(r4)
            r0.append(r1)
            int r1 = r14.getTaskId()
            r0.append(r1)
            java.lang.String r1 = " enable_screen_shot: "
            r0.append(r1)
            boolean r1 = r14.f161157i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.MMFinderUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            re1.a r4 = up1.C37521f.f99298U1
            java.lang.Object r4 = r4.mo60266n()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0104
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.tencent.testcrash"
            java.lang.Class r5 = java.lang.Class.forName(r5)
            r4.<init>(r14, r5)
            k20.a r5 = new k20.a
            r5.<init>()
            r5.mo10233c(r4)
            java.lang.Object[] r7 = r5.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/ui/MMFinderUI"
            java.lang.String r9 = "onResume"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            r6 = r14
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r4 = r5.mo10231a(r2)
            android.content.Intent r4 = (android.content.Intent) r4
            r14.startActivity(r4)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/ui/MMFinderUI"
            java.lang.String r7 = "onResume"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r5 = r14
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
        L_0x0104:
            boolean r4 = r14.f161157i
            if (r4 == 0) goto L_0x0123
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99394f2
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x0123
            java.lang.String r0 = "REPORT_WHEN_SCREEN_SHOT register"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.finder.ui.MMFinderUI$e r0 = r14.f161158j
            com.tencent.p014mm.sdk.platformtools.ScreenShotUtil.setScreenShotCallback(r14, r0)
        L_0x0123:
            android.content.Intent r0 = r14.getIntent()
            java.lang.String r1 = "key_mmfinder_is_resume"
            r0.putExtra(r1, r2)
            java.lang.Class<l31.e> r0 = l31.C61212e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            l31.e r0 = (l31.C61212e) r0
            java.lang.Class<h81.i> r1 = h81.C59774i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.i r1 = (h81.C59774i) r1
            int r1 = r1.mo84748Ps()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "special_enter_source"
            r0.y50(r14, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI.onResume():void");
    }

    public void onStart() {
        getIntent().putExtra("key_mmfinder_is_resume", 1);
        Log.m105924i("Finder.MMFinderUI", "onStart " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f161154f);
        ((C64916p1) C86312j.m106911c(C64916p1.class)).kr0(this);
        C56369a aVar = this.f161156h;
        if (aVar != null) {
            aVar.mo79125a("onStart");
        }
        super.onStart();
    }

    public void onStop() {
        C56369a aVar = this.f161156h;
        if (aVar != null) {
            aVar.mo79125a("onStop");
        }
        Log.m105924i("Finder.MMFinderUI", "onStop " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f161154f);
        super.onStop();
        ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76661GH(this);
    }

    public void onSwipeBack() {
        C13371q qVar = (C13371q) C39818r.f106831a.mo62444c(this).mo62449e(C13371q.class);
        if (qVar != null) {
            qVar.f37886f = true;
        }
        super.onSwipeBack();
    }

    public void setMMOrientation() {
        if (!this.f161152d) {
            super.setMMOrientation();
        }
    }

    public void setRequestedOrientation(int i) {
        Log.m105924i("Finder.MMFinderUI", "setRequestedOrientation: requestedOrientation = " + i + ", needChangeOrientation = " + this.f161152d + ", this=" + mo2994J7());
        if (!this.f161152d) {
            super.setRequestedOrientation(1);
        } else {
            super.setRequestedOrientation(i);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C60172g4.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8807v3.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C8762d5.class)));
        hashSet.add(((C77049b) C86312j.m106911c(C77049b.class)).mo72355fL());
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C15128y.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C15127x.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C15126w.class)));
        hashSet.add(C0324s.m265a(C24560g0.m30725a(C15129z.class)));
        hashSet.add(C13371q.class);
    }
}
