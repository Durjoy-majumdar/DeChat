package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.UIStatusChangedEvent;
import com.tencent.p014mm.memory.C92716o;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.IXWebBroadcastListener;
import hd0.C98398h0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import p331dj.C97481g;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController */
public abstract class AdlandingSightPlayController {

    /* renamed from: F */
    public static Map<String, Integer> f54248F = new ConcurrentHashMap();

    /* renamed from: A */
    public int f54249A;

    /* renamed from: B */
    public boolean f54250B = false;

    /* renamed from: C */
    public ChattingUIStatusListener f54251C;

    /* renamed from: D */
    public C19259d f54252D;

    /* renamed from: E */
    public C19260e f54253E;

    /* renamed from: a */
    public int f54254a = 0;

    /* renamed from: b */
    public int f54255b;

    /* renamed from: c */
    public String f54256c = "";

    /* renamed from: d */
    public String f54257d = "";

    /* renamed from: e */
    public int f54258e = -1;

    /* renamed from: f */
    public int f54259f = 41;

    /* renamed from: g */
    public Bitmap f54260g;

    /* renamed from: h */
    public WeakReference<View> f54261h;

    /* renamed from: i */
    public WeakReference<TextView> f54262i;

    /* renamed from: j */
    public MMHandler f54263j;

    /* renamed from: k */
    public long f54264k;

    /* renamed from: l */
    public WeakReference<View> f54265l;

    /* renamed from: m */
    public Animation f54266m;

    /* renamed from: n */
    public Animation f54267n;

    /* renamed from: o */
    public volatile C19262g f54268o;

    /* renamed from: p */
    public volatile C19252a f54269p;

    /* renamed from: q */
    public volatile C19263h f54270q;

    /* renamed from: r */
    public volatile C19257b f54271r;

    /* renamed from: s */
    public C19266j f54272s;

    /* renamed from: t */
    public C19265i f54273t;

    /* renamed from: u */
    public C19258c f54274u;

    /* renamed from: v */
    public boolean f54275v = true;

    /* renamed from: w */
    public boolean f54276w = false;

    /* renamed from: x */
    public boolean f54277x = true;

    /* renamed from: y */
    public double f54278y = -1.0d;

    /* renamed from: z */
    public double f54279z = -1.0d;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener */
    public static class ChattingUIStatusListener extends IListener<UIStatusChangedEvent> {

        /* renamed from: d */
        public int f54280d = 0;

        /* renamed from: e */
        public int f54281e = 0;

        /* renamed from: f */
        public int f54282f = 0;

        /* renamed from: g */
        public WeakReference<AdlandingSightPlayController> f54283g;

        public ChattingUIStatusListener(AdlandingSightPlayController adlandingSightPlayController) {
            super(C40008f.f107254d);
            this.f54283g = new WeakReference<>(adlandingSightPlayController);
            this.__eventId = 2023294236;
        }

        public boolean callback(IEvent iEvent) {
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
            UIStatusChangedEvent uIStatusChangedEvent = (UIStatusChangedEvent) iEvent;
            SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
            if (this.f54283g.get() == null) {
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
            } else {
                Map<String, Integer> map = AdlandingSightPlayController.f54248F;
                SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                int i = this.f54283g.get().f54249A;
                SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                Log.m105919d("MicroMsg.SightPlayController", "#0x%x on chatting status callback, type %d, selfPos %d, visiblePos[%d, %d], headerCount %d recording %B", Integer.valueOf(this.f54283g.get().hashCode()), Integer.valueOf(uIStatusChangedEvent.f193971d.f193972a), Integer.valueOf(i), Integer.valueOf(uIStatusChangedEvent.f193971d.f193973b), Integer.valueOf(uIStatusChangedEvent.f193971d.f193974c), Integer.valueOf(uIStatusChangedEvent.f193971d.f193975d), Boolean.valueOf(AdlandingSightPlayController.m20436o(this.f54283g.get())));
                int i2 = uIStatusChangedEvent.f193971d.f193972a;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 3) {
                            this.f54283g.get().mo24734t();
                        } else if (i2 == 5) {
                            SnsMethodCalculate.markStartTimeMs("updatePosStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                            UIStatusChangedEvent.C67803a aVar = uIStatusChangedEvent.f193971d;
                            this.f54280d = aVar.f193975d;
                            this.f54281e = aVar.f193973b;
                            this.f54282f = aVar.f193974c;
                            SnsMethodCalculate.markEndTimeMs("updatePosStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                            if (!mo24741e() || AdlandingSightPlayController.m20436o(this.f54283g.get())) {
                                this.f54283g.get().mo24734t();
                            } else {
                                if (!"ERROR#PATH".equals(AdlandingSightPlayController.m20425d(this.f54283g.get())) && !AdlandingSightPlayController.m20432k(this.f54283g.get()).equals(AdlandingSightPlayController.m20425d(this.f54283g.get()))) {
                                    Log.m105919d("MicroMsg.SightPlayController", "match diff path, change %s to %s", AdlandingSightPlayController.m20432k(this.f54283g.get()), AdlandingSightPlayController.m20425d(this.f54283g.get()));
                                    String d = AdlandingSightPlayController.m20425d(this.f54283g.get()) == null ? "" : AdlandingSightPlayController.m20425d(this.f54283g.get());
                                    this.f54283g.get().mo24734t();
                                    SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                                    this.f54283g.get().f54256c = d;
                                    SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                                    SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                                    this.f54283g.get().f54257d = "ERROR#PATH";
                                    SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                                }
                                this.f54283g.get().mo24732B();
                            }
                        } else if (i2 == 6) {
                            SnsMethodCalculate.markStartTimeMs("access$3902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                            this.f54283g.get().f54250B = true;
                            SnsMethodCalculate.markEndTimeMs("access$3902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                        } else if (i2 == 7 && AdlandingSightPlayController.m20436o(this.f54283g.get())) {
                            SnsMethodCalculate.markStartTimeMs("access$3902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                            this.f54283g.get().f54250B = false;
                            SnsMethodCalculate.markEndTimeMs("access$3902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                        }
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                    }
                    this.f54283g.get().mo24733C(false);
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                }
                SnsMethodCalculate.markStartTimeMs("updatePosStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                UIStatusChangedEvent.C67803a aVar2 = uIStatusChangedEvent.f193971d;
                this.f54280d = aVar2.f193975d;
                this.f54281e = aVar2.f193973b;
                this.f54282f = aVar2.f193974c;
                SnsMethodCalculate.markEndTimeMs("updatePosStatus", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                if (mo24741e() && !AdlandingSightPlayController.m20436o(this.f54283g.get())) {
                    this.f54283g.get().mo24732B();
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
            return false;
        }

        /* renamed from: e */
        public boolean mo24741e() {
            SnsMethodCalculate.markStartTimeMs("isShowPos", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
            if (this.f54283g.get() == null) {
                SnsMethodCalculate.markEndTimeMs("isShowPos", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                return false;
            }
            Map<String, Integer> map = AdlandingSightPlayController.f54248F;
            SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            int i = this.f54283g.get().f54249A;
            SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            int i2 = i + this.f54280d;
            if (i2 < this.f54281e || i2 > this.f54282f) {
                SnsMethodCalculate.markEndTimeMs("isShowPos", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
                return false;
            }
            SnsMethodCalculate.markEndTimeMs("isShowPos", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ChattingUIStatusListener");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a */
    public class C19252a implements Runnable {

        /* renamed from: d */
        public volatile boolean f54284d = false;

        /* renamed from: e */
        public C19257b f54285e;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$a */
        public class C19253a implements Runnable {
            public C19253a() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$1");
                View b = AdlandingSightPlayController.m20430i(AdlandingSightPlayController.this).mo24750b();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(b, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdlandingSightPlayController$DecodeJob$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(b, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdlandingSightPlayController$DecodeJob$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$1");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$b */
        public class C19254b implements Runnable {
            public C19254b() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$3");
                AdlandingSightPlayController.this.mo24740z((Bitmap) null);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$3");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$c */
        public class C19255c implements Runnable {
            public C19255c() {
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$4");
                if (AdlandingSightPlayController.m20437p(AdlandingSightPlayController.this) != null) {
                    ((AdlandingVideoSightView.C19270a) AdlandingSightPlayController.m20437p(AdlandingSightPlayController.this)).mo24814a(AdlandingSightPlayController.this, 0);
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$4");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$d */
        public class C19256d implements Runnable {
            public C19256d() {
            }

            public void run() {
                View b;
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$5");
                if (!(AdlandingSightPlayController.m20430i(AdlandingSightPlayController.this) == null || (b = AdlandingSightPlayController.m20430i(AdlandingSightPlayController.this).mo24750b()) == null)) {
                    AdlandingSightPlayController adlandingSightPlayController = AdlandingSightPlayController.this;
                    SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    Animation animation = adlandingSightPlayController.f54267n;
                    SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    if (!(animation != null || AdlandingSightPlayController.m20430i(AdlandingSightPlayController.this).mo24751c() == -1 || AdlandingSightPlayController.m20427f(AdlandingSightPlayController.this).get() == null)) {
                        AdlandingSightPlayController adlandingSightPlayController2 = AdlandingSightPlayController.this;
                        Animation loadAnimation = AnimationUtils.loadAnimation(((View) AdlandingSightPlayController.m20427f(adlandingSightPlayController2).get()).getContext(), AdlandingSightPlayController.m20430i(AdlandingSightPlayController.this).mo24751c());
                        SnsMethodCalculate.markStartTimeMs("access$3702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                        adlandingSightPlayController2.f54267n = loadAnimation;
                        SnsMethodCalculate.markEndTimeMs("access$3702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    }
                    AdlandingSightPlayController adlandingSightPlayController3 = AdlandingSightPlayController.this;
                    SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    Animation animation2 = adlandingSightPlayController3.f54267n;
                    SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    if (animation2 != null) {
                        AdlandingSightPlayController adlandingSightPlayController4 = AdlandingSightPlayController.this;
                        SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                        Animation animation3 = adlandingSightPlayController4.f54267n;
                        SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                        b.startAnimation(animation3);
                    }
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(b, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdlandingSightPlayController$DecodeJob$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    b.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(b, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/AdlandingSightPlayController$DecodeJob$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob$5");
            }
        }

        public C19252a(C115736b bVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0145  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0147  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x01b9  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x028e  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x02c4  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x03a8  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x03ba  */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x03f7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r27 = this;
                r0 = r27
                java.lang.String r1 = "run"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DecodeJob"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$f r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20430i(r3)
                if (r3 == 0) goto L_0x003c
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$f r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20430i(r3)
                android.view.View r3 = r3.mo24750b()
                if (r3 == 0) goto L_0x003c
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$f r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20430i(r3)
                android.view.View r3 = r3.mo24750b()
                int r3 = r3.getVisibility()
                if (r3 != 0) goto L_0x003c
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r3)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$a r4 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$a
                r4.<init>()
                r3.post(r4)
            L_0x003c:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r3)
                java.lang.String r4 = "MicroMsg.SightPlayController"
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                if (r3 >= 0) goto L_0x0073
                java.lang.Object[] r3 = new java.lang.Object[r5]
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r5 = r5.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r7] = r5
                int r5 = r27.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r8] = r5
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20432k(r5)
                r3[r6] = r5
                java.lang.String r5 = "#0x%x-#0x%x error video id, path %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return
            L_0x0073:
                boolean r3 = r0.f54284d
                if (r3 == 0) goto L_0x0098
                java.lang.Object[] r3 = new java.lang.Object[r6]
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r5 = r5.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r7] = r5
                int r5 = r27.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3[r8] = r5
                java.lang.String r5 = "#0x%x-#0x%x match stop decode cmd at beg"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r3)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return
            L_0x0098:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20423b(r3)
                r11 = 0
                int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r3 != 0) goto L_0x00c6
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r3)
                if (r3 == 0) goto L_0x00bd
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r3)
                r3.f54298e = r8
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r3)
                r3.run()
            L_0x00bd:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r9 = java.lang.System.currentTimeMillis()
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20424c(r3, r9)
            L_0x00c6:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r9 = "access$2700"
                java.lang.String r10 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                double r13 = r3.f54279z
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                r3 = 0
                r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                int r16 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
                if (r16 == 0) goto L_0x0135
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r13.getClass()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                double r13 = r13.f54279z
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r15 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r15 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r15)
                int r13 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.seekStream(r13, r15)
                if (r13 <= 0) goto L_0x0135
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r13)
                if (r13 != 0) goto L_0x010f
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r14 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h
                r14.<init>(r3)
                java.lang.String r15 = "access$2902"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r10)
                r13.f54270q = r14
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
            L_0x010f:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r13)
                r14 = 4
                r13.f54298e = r14
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r13)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r14 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                double r14 = r14.f54279z
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                r13.f54299f = r14
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r9)
                r9.run()
                r9 = 1
                goto L_0x0136
            L_0x0135:
                r9 = 0
            L_0x0136:
                long r13 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r15 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r17 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20423b(r15)
                long r13 = r13 - r17
                float r13 = (float) r13
                if (r9 == 0) goto L_0x0147
                r9 = 0
                goto L_0x0150
            L_0x0147:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r9 = r9.f54259f
                float r9 = (float) r9
                float r13 = r13 / r9
                r9 = 1056964608(0x3f000000, float:0.5)
                float r9 = r9 + r13
            L_0x0150:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r13.getClass()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20433l(r13)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r14 = java.lang.System.currentTimeMillis()
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20424c(r13, r14)
                r13 = 1073741824(0x40000000, float:2.0)
                int r13 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
                if (r13 < 0) goto L_0x0179
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r14 = "access$3208"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r10)
                int r15 = r13.f54254a
                int r15 = r15 + r8
                r13.f54254a = r15
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)
                goto L_0x0194
            L_0x0179:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r14 = "access$3200"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r10)
                int r15 = r13.f54254a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)
                int r15 = r15 - r8
                int r14 = java.lang.Math.max(r7, r15)
                java.lang.String r15 = "access$3202"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r10)
                r13.f54254a = r14
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
            L_0x0194:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r14 = "access$500"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r10)
                r13.mo24738x()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r10)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20439r(r13)
                r17 = 4652007308841189376(0x408f400000000000, double:1000.0)
                java.lang.String r14 = "voice time is"
                r19 = 0
                java.lang.String r15 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob"
                java.lang.String r7 = "getSoundPlayerPosition"
                java.lang.String r12 = "access$3300"
                if (r8 != r13) goto L_0x02c4
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20428g(r13)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r13 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r13)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r11 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20428g(r11)
                int r9 = (int) r9
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r11 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r8 = "access$2600"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
                r11.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r8 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
                boolean r8 = r8.f54277x
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
                int r8 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.drawSurfaceFrame(r13, r3, r9, r3, r8)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$e r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20434m(r9)
                if (r9 == 0) goto L_0x0211
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r9)
                double r9 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getVideoPlayTime(r9)
                int r11 = (int) r9
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r12 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r13 = r4
                double r3 = r12.f54278y
                int r3 = (int) r3
                if (r11 == r3) goto L_0x020c
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$e r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20434m(r12)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r11 = (long) r11
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$b r3 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.C19271b) r3
                r3.mo24815a(r4, r11)
            L_0x020c:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r3.f54278y = r9
                goto L_0x0212
            L_0x0211:
                r13 = r4
            L_0x0212:
                if (r8 != 0) goto L_0x021a
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20429h(r3, r5)
                goto L_0x0285
            L_0x021a:
                r3 = 1
                if (r3 != r8) goto L_0x0230
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20429h(r3, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r4 = 0
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20424c(r3, r4)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20435n(r3)
                r3 = 1
                goto L_0x0286
            L_0x0230:
                r3 = -7
                if (r3 != r8) goto L_0x023a
                java.lang.String r3 = "surface is null, continue"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r3)
                goto L_0x0285
            L_0x023a:
                r3 = 3
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r4 = r4.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                int r4 = r27.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 1
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
                r6 = 2
                r3[r6] = r4
                java.lang.String r4 = "#0x%x-#0x%x draw surface match error:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r4, r3)
                r0.f54284d = r5
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r3 = r0.f54285e
                if (r3 == 0) goto L_0x0269
                r3.f54291d = r5
            L_0x0269:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r4 = 0
                r3.mo24735u(r4)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r3)
                if (r3 == 0) goto L_0x0285
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r3)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$a r3 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.C19270a) r3
                r5 = -1
                r3.mo24814a(r4, r5)
            L_0x0285:
                r3 = 0
            L_0x0286:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r4)
                if (r4 == 0) goto L_0x02c0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r14)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r5)
                r5.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r15)
                android.media.MediaPlayer r5 = r5.f54297d
                if (r5 != 0) goto L_0x02ac
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r15)
                r5 = r19
                goto L_0x02b4
            L_0x02ac:
                int r5 = r5.getCurrentPosition()
                double r5 = (double) r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r15)
            L_0x02b4:
                double r5 = r5 / r17
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r4)
            L_0x02c0:
                r4 = r3
                r3 = r15
                goto L_0x034a
            L_0x02c4:
                r13 = r4
                r3 = r15
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r21 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r4)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r8 = "access$3600"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
                android.graphics.Bitmap r4 = r4.f54260g
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
                int r8 = (int) r9
                r24 = 0
                r25 = 0
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r9 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
                boolean r9 = r9.f54277x
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
                r22 = r4
                r23 = r8
                r26 = r9
                int r8 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.drawFrame(r21, r22, r23, r24, r25, r26)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$e r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20434m(r4)
                if (r4 == 0) goto L_0x031f
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r4)
                double r9 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getVideoPlayTime(r4)
                int r4 = (int) r9
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r11 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                double r5 = r11.f54278y
                int r5 = (int) r5
                if (r4 == r5) goto L_0x0317
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$e r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20434m(r11)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r6 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r11 = (long) r4
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$b r5 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.C19271b) r5
                r5.mo24815a(r6, r11)
            L_0x0317:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r4.f54278y = r9
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20433l(r4)
                goto L_0x0329
            L_0x031f:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20433l(r4)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20433l(r4)
            L_0x0329:
                if (r8 != 0) goto L_0x0333
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20429h(r4, r5)
                goto L_0x03a4
            L_0x0333:
                r4 = 1
                r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                if (r4 != r8) goto L_0x034c
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20429h(r4, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r5 = 0
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20424c(r4, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20435n(r4)
                r4 = 1
            L_0x034a:
                r5 = 1
                goto L_0x03a6
            L_0x034c:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20429h(r4, r5)
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r5 = r5.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 0
                r4[r6] = r5
                int r5 = r27.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 1
                r4[r6] = r5
                java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
                r9 = 2
                r4[r9] = r5
                java.lang.String r5 = "#0x%x-#0x%x draw bitmap match error:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r5, r4)
                r0.f54284d = r6
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r4 = r0.f54285e
                if (r4 == 0) goto L_0x0380
                r4.f54291d = r6
            L_0x0380:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r4)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$b r5 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$b
                r5.<init>()
                r4.post(r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r4)
                if (r4 == 0) goto L_0x03a4
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r4)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$a r4 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.C19270a) r4
                r6 = -1
                r4.mo24814a(r5, r6)
            L_0x03a4:
                r4 = 0
                goto L_0x034a
            L_0x03a6:
                if (r5 != r8) goto L_0x03b6
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$c r6 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$c
                r6.<init>()
                r5.post(r6)
            L_0x03b6:
                boolean r5 = r0.f54284d
                if (r5 == 0) goto L_0x03f7
                r5 = 2
                java.lang.Object[] r3 = new java.lang.Object[r5]
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r4 = r4.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                int r4 = r27.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r6 = 1
                r3[r6] = r4
                java.lang.String r4 = "#0x%x-#0x%x match stop decode cmd at end"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r13, r4, r3)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r3)
                if (r3 == 0) goto L_0x03f3
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r3)
                r3.f54298e = r5
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r3)
                r3.run()
            L_0x03f3:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return
            L_0x03f7:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20439r(r5)
                r6 = 1
                if (r6 != r5) goto L_0x0434
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r4 = r4.f54259f
                long r4 = (long) r4
                long r8 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r6 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r10 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20423b(r6)
                long r8 = r8 - r10
                long r4 = r4 - r8
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r6 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                long r8 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20423b(r6)
                r10 = 0
                int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r6 != 0) goto L_0x0428
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r4 = r4.f54259f
                int r4 = r4 * 5
                long r4 = (long) r4
                hd0.C98398h0.m127699fO(r0, r4)
                goto L_0x0478
            L_0x0428:
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 <= 0) goto L_0x0430
                hd0.C98398h0.m127699fO(r0, r4)
                goto L_0x0478
            L_0x0430:
                hd0.C98398h0.m127699fO(r0, r10)
                goto L_0x0478
            L_0x0434:
                if (r4 == 0) goto L_0x0468
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$f r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20430i(r4)
                if (r4 == 0) goto L_0x0468
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$f r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20430i(r4)
                int r4 = r4.mo24749a()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$d r6 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a$d
                r6.<init>()
                r5.post(r6)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r5 = r0.f54285e
                r5.getClass()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r6 = r0.f54285e
                long r8 = (long) r4
                r5.postDelayed(r6, r8)
                goto L_0x0478
            L_0x0468:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r4 = r0.f54285e
                r4.getClass()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r4)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r5 = r0.f54285e
                r4.post(r5)
            L_0x0478:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r4)
                if (r4 == 0) goto L_0x04b2
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r14)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20431j(r5)
                r5.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
                android.media.MediaPlayer r5 = r5.f54297d
                if (r5 != 0) goto L_0x049c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
                goto L_0x04a6
            L_0x049c:
                int r5 = r5.getCurrentPosition()
                double r5 = (double) r5
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
                r19 = r5
            L_0x04a6:
                double r5 = r19 / r17
                r4.append(r5)
                java.lang.String r3 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r13, r3)
            L_0x04b2:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.C19252a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b */
    public class C19257b implements Runnable {

        /* renamed from: d */
        public volatile boolean f54291d = false;

        /* renamed from: e */
        public C19252a f54292e;

        public C19257b() {
            Log.m105924i("MicroMsg.SightPlayController", "make sure drawJob alive");
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DrawJob");
            if (this.f54291d) {
                Log.m105921e("MicroMsg.SightPlayController", "#0x%x-#0x%x match stop draw", Integer.valueOf(AdlandingSightPlayController.this.hashCode()), Integer.valueOf(hashCode()));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DrawJob");
                return;
            }
            AdlandingSightPlayController adlandingSightPlayController = AdlandingSightPlayController.this;
            Map<String, Integer> map = AdlandingSightPlayController.f54248F;
            SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            Bitmap bitmap = adlandingSightPlayController.f54260g;
            SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            adlandingSightPlayController.mo24740z(bitmap);
            if (AdlandingSightPlayController.m20423b(AdlandingSightPlayController.this) == 0) {
                C98398h0.m127699fO(this.f54292e, 0);
            } else {
                long currentTimeMillis = ((long) AdlandingSightPlayController.this.f54259f) - (System.currentTimeMillis() - AdlandingSightPlayController.m20423b(AdlandingSightPlayController.this));
                if (currentTimeMillis > 0) {
                    C98398h0.m127699fO(this.f54292e, currentTimeMillis);
                } else {
                    C98398h0.m127699fO(this.f54292e, 0);
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$DrawJob");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$c */
    public class C19258c implements Runnable {
        public C19258c(C115736b bVar) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$LoopAnimationJob");
            if (AdlandingSightPlayController.m20427f(AdlandingSightPlayController.this).get() == null) {
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$LoopAnimationJob");
                return;
            }
            AdlandingSightPlayController adlandingSightPlayController = AdlandingSightPlayController.this;
            SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            Animation animation = adlandingSightPlayController.f54266m;
            SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            ((View) AdlandingSightPlayController.m20427f(AdlandingSightPlayController.this).get()).startAnimation(animation);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$LoopAnimationJob");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d */
    public interface C19259d {
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$e */
    public interface C19260e {
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$f */
    public interface C19261f {
        /* renamed from: a */
        int mo24749a();

        /* renamed from: b */
        View mo24750b();

        /* renamed from: c */
        int mo24751c();
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$g */
    public class C19262g implements Runnable {

        /* renamed from: d */
        public volatile boolean f54295d = false;

        public C19262g(C115736b bVar) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x01ed  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r2 = "run"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$OpenFileJob"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r4 = "access$500"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                r0.mo24738x()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20432k(r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r6 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r6 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20439r(r6)
                r7 = 1
                r8 = 0
                if (r7 != r6) goto L_0x002b
                r6 = 0
                goto L_0x002c
            L_0x002b:
                r6 = 1
            L_0x002c:
                int r4 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.openFileVFS(r4, r6, r7, r8)
                java.lang.String r6 = "access$602"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                r0.f54258e = r4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r0)
                java.lang.String r4 = "MicroMsg.SightPlayController"
                r9 = 4
                r10 = 3
                r11 = -1
                r12 = 2
                r13 = 0
                if (r0 >= 0) goto L_0x0098
                java.lang.Object[] r0 = new java.lang.Object[r9]
                int r5 = r17.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0[r8] = r5
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r5 = r5.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0[r7] = r5
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r5)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0[r12] = r5
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20432k(r5)
                r0[r10] = r5
                java.lang.String r5 = "#0x%x-#0x%x error video id %d, path %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r5, r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r0.mo24735u(r13)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r0)
                if (r0 == 0) goto L_0x0094
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$a r0 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.C19270a) r0
                r0.mo24814a(r4, r11)
            L_0x0094:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return
            L_0x0098:
                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
                r9 = 344065(0x54001, float:4.82138E-40)
                java.lang.Boolean r11 = java.lang.Boolean.FALSE
                java.lang.Object r0 = r0.getCfg(r9, r11)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x00f2
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r9 = "access$800"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$i r0 = r0.f54273t
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
                if (r0 != 0) goto L_0x00cc
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$i r11 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$i
                r11.<init>(r13)
                java.lang.String r12 = "access$802"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r5)
                r0.f54273t = r11
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r5)
            L_0x00cc:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r11 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$i r11 = r11.f54273t
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
                r0.removeCallbacks(r11)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20422a(r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r11 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$i r11 = r11.f54273t
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
                r0.post(r11)
            L_0x00f2:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r0)
                int r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getVideoWidth(r0)
                int r9 = java.lang.Math.max(r7, r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r0)
                int r0 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getVideoHeight(r0)
                int r11 = java.lang.Math.max(r7, r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20439r(r0)
                if (r0 != 0) goto L_0x0233
                int r0 = r9 * r11
                r12 = 1048576(0x100000, float:1.469368E-39)
                if (r0 >= r12) goto L_0x021a
                if (r9 <= 0) goto L_0x021a
                if (r11 > 0) goto L_0x0124
                r0 = 2
                r5 = 0
                goto L_0x021c
            L_0x0124:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r12 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r13 = "access$1100"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r5)
                r12.getClass()
                java.lang.String r14 = "checkBmp"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r5)
                java.lang.Object[] r10 = new java.lang.Object[r10]
                int r15 = r12.hashCode()
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r10[r8] = r15
                java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
                r10[r7] = r15
                java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
                r16 = 2
                r10[r16] = r15
                java.lang.String r15 = "#0x%x check bmp, video width %d, height %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r15, r10)
                android.graphics.Bitmap r10 = r12.f54260g
                java.lang.String r15 = "getVideoPath"
                if (r10 != 0) goto L_0x0178
                com.tencent.mm.memory.o r0 = com.tencent.p014mm.memory.C92716o.f266827d
                com.tencent.mm.memory.o$b r10 = new com.tencent.mm.memory.o$b
                r10.<init>(r9, r11)
                android.graphics.Bitmap r0 = r0.mo126927l(r10)
                r12.f54260g = r0
                java.lang.Object[] r0 = new java.lang.Object[r7]
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r5)
                java.lang.String r10 = r12.f54256c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r5)
                r0[r8] = r10
                java.lang.String r8 = "checkBmp, create new one, videoPath: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r8, r0)
                goto L_0x0213
            L_0x0178:
                int r8 = r10.getWidth()
                if (r8 != r9) goto L_0x0186
                android.graphics.Bitmap r8 = r12.f54260g
                int r8 = r8.getHeight()
                if (r8 == r11) goto L_0x0213
            L_0x0186:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "reset bmp, old value "
                r8.append(r10)
                android.graphics.Bitmap r10 = r12.f54260g
                int r10 = r10.getWidth()
                r8.append(r10)
                java.lang.String r10 = "*"
                r8.append(r10)
                android.graphics.Bitmap r10 = r12.f54260g
                int r10 = r10.getHeight()
                r8.append(r10)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r8)
                r8 = 19
                boolean r8 = p206nj.C11171e.m11046c(r8)
                if (r8 == 0) goto L_0x01ea
                android.graphics.Bitmap r8 = r12.f54260g
                int r8 = r8.getAllocationByteCount()
                int r0 = r0 * 4
                if (r8 < r0) goto L_0x01ea
                java.lang.String r0 = "reset bmp, try directly reconfigure"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)     // Catch:{ Exception -> 0x01d0 }
                android.graphics.Bitmap r0 = r12.f54260g     // Catch:{ Exception -> 0x01d0 }
                android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x01d0 }
                r0.reconfigure(r9, r11, r8)     // Catch:{ Exception -> 0x01d0 }
                r0 = 1
                goto L_0x01eb
            L_0x01d0:
                r0 = move-exception
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r10 = "reconfigure failed: %s"
                r8.append(r10)
                java.lang.String r0 = r0.getMessage()
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            L_0x01ea:
                r0 = 0
            L_0x01eb:
                if (r0 != 0) goto L_0x0201
                com.tencent.mm.memory.o r0 = com.tencent.p014mm.memory.C92716o.f266827d
                android.graphics.Bitmap r8 = r12.f54260g
                r0.mo126928m(r8)
                com.tencent.mm.memory.o r0 = com.tencent.p014mm.memory.C92716o.f266827d
                com.tencent.mm.memory.o$b r8 = new com.tencent.mm.memory.o$b
                r8.<init>(r9, r11)
                android.graphics.Bitmap r0 = r0.mo126927l(r8)
                r12.f54260g = r0
            L_0x0201:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r5)
                java.lang.String r8 = r12.f54256c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r5)
                r10 = 0
                r0[r10] = r8
                java.lang.String r8 = "checkBmp, the origin bmp size not match, create new one, videoPath: %s"
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r8, r0)
            L_0x0213:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r5)
                goto L_0x0233
            L_0x021a:
                r5 = 0
                r0 = 2
            L_0x021c:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
                r0[r5] = r6
                java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
                r0[r7] = r5
                java.lang.String r5 = "get error info videoWidth %d height  %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return
            L_0x0233:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r0.getClass()
                java.lang.String r8 = "checkRate"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                int r10 = r0.f54258e
                double r12 = com.tencent.p014mm.plugin.sight.base.SightVideoJNI.getVideoRate(r10)
                int r10 = (int) r12
                int r10 = java.lang.Math.max(r7, r10)
                r12 = 1000(0x3e8, float:1.401E-42)
                int r12 = r12 / r10
                r0.f54259f = r12
                r12 = 3
                java.lang.Object[] r12 = new java.lang.Object[r12]
                int r13 = r0.hashCode()
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r14 = 0
                r12[r14] = r13
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r12[r7] = r10
                int r0 = r0.f54259f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r10 = 2
                r12[r10] = r0
                java.lang.String r0 = "#0x%x update video rate to %d fps, delay %d ms"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r12)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                float r0 = (float) r9
                float r8 = (float) r11
                float r10 = r0 / r8
                r12 = 1084227584(0x40a00000, float:5.0)
                int r10 = java.lang.Float.compare(r10, r12)
                r13 = 0
                if (r10 > 0) goto L_0x0344
                float r8 = r8 / r0
                int r0 = java.lang.Float.compare(r8, r12)
                if (r0 <= 0) goto L_0x0289
                goto L_0x0344
            L_0x0289:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                r0.mo24731A(r9, r11)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20439r(r0)
                java.lang.String r6 = "access$1802"
                java.lang.String r8 = "access$1702"
                if (r7 != r0) goto L_0x02c2
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a r9 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a
                r10 = 0
                r9.<init>(r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                r0.f54269p = r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                r0.f54271r = r10
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                boolean r0 = r1.f54295d
                if (r0 != 0) goto L_0x0314
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20426e(r0)
                hd0.C98398h0.m127699fO(r0, r13)
                goto L_0x0314
            L_0x02c2:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a r9 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a
                r10 = 0
                r9.<init>(r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                r0.f54269p = r9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r8 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b
                r8.<init>()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                r0.f54271r = r8
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20426e(r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r6 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r8 = "access$1800"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r6 = r6.f54271r
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                r0.f54285e = r6
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$b r0 = r0.f54271r
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20426e(r5)
                r0.f54292e = r5
                boolean r0 = r1.f54295d
                if (r0 != 0) goto L_0x0314
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$a r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20426e(r0)
                hd0.C98398h0.m127699fO(r0, r13)
            L_0x0314:
                boolean r0 = r1.f54295d
                if (r0 == 0) goto L_0x0340
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r5 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r5 = r5.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 0
                r0[r6] = r5
                int r5 = r17.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0[r7] = r5
                boolean r5 = r1.f54295d
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r6 = 2
                r0[r6] = r5
                java.lang.String r5 = "#0x%x-#0x%x open file end, match stop %B"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r0)
            L_0x0340:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return
            L_0x0344:
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                r9 = 0
                r0[r9] = r8
                java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
                r0[r7] = r8
                java.lang.String r8 = "ERROR Video size %d, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r8, r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20432k(r0)
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 != 0) goto L_0x037f
                java.lang.String r0 = "access$1200"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
                java.util.Map<java.lang.String, java.lang.Integer> r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.f54248F
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20432k(r0)
                r8 = 2
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
                r4.put(r0, r8)
            L_0x037f:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20424c(r0, r13)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                int r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20438q(r0)
                java.lang.String r8 = "access$1400"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r5)
                java.lang.String r9 = "freeVideo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c r10 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.c
                r10.<init>(r0, r4)
                hd0.C98398h0.m127699fO(r10, r13)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r5)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
                r4 = -1
                r0.f54258e = r4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r4 = "access$302"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                java.lang.String r6 = ""
                r0.f54256c = r6
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r4 = "access$1502"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                java.lang.String r6 = "ERROR#PATH"
                r0.f54257d = r6
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                java.lang.String r4 = "access$1602"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
                r0.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
                r1.f54295d = r7
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r0)
                if (r0 == 0) goto L_0x03ee
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$d r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.m20437p(r0)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.this
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView$a r0 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingVideoSightView.C19270a) r0
                r5 = -1
                r0.mo24814a(r4, r5)
            L_0x03ee:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController.C19262g.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h */
    public class C19263h implements Runnable {

        /* renamed from: d */
        public MediaPlayer f54297d;

        /* renamed from: e */
        public int f54298e;

        /* renamed from: f */
        public double f54299f = -1.0d;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$h$a */
        public class C19264a implements MediaPlayer.OnErrorListener {
            public C19264a() {
            }

            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob$1");
                Log.m105921e("MicroMsg.SightPlayController", "on error: play %s ERROR!! %d %d", AdlandingSightPlayController.m20432k(AdlandingSightPlayController.this), Integer.valueOf(i), Integer.valueOf(i2));
                AdlandingSightPlayController.this.mo24734t();
                if (AdlandingSightPlayController.m20437p(AdlandingSightPlayController.this) != null) {
                    ((AdlandingVideoSightView.C19270a) AdlandingSightPlayController.m20437p(AdlandingSightPlayController.this)).mo24814a(AdlandingSightPlayController.this, -1);
                }
                SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob$1");
                return true;
            }
        }

        public C19263h(C115736b bVar) {
        }

        /* renamed from: a */
        public final void mo24753a() {
            SnsMethodCalculate.markStartTimeMs("stopPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            Log.m105924i("MicroMsg.SightPlayController", "stopPlayer");
            try {
                MediaPlayer mediaPlayer = this.f54297d;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    this.f54297d.release();
                    this.f54297d = null;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SightPlayController", e, "stop play sound error: %s", e.getMessage());
                this.f54297d = null;
            }
            SnsMethodCalculate.markEndTimeMs("stopPlayer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
        }

        public void run() {
            String str;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            Object[] objArr = new Object[1];
            int i = this.f54298e;
            SnsMethodCalculate.markStartTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
            if (i == 0) {
                SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
                str = "stop";
            } else if (i == 1) {
                SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
                str = IXWebBroadcastListener.STAGE_START;
            } else if (i == 2) {
                SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
                str = "pause";
            } else if (i == 3) {
                SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
                str = "resume";
            } else if (i != 4) {
                SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
                str = "unknown";
            } else {
                SnsMethodCalculate.markEndTimeMs("operationToString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
                str = "seek";
            }
            objArr[0] = str;
            Log.m105925i("MicroMsg.SightPlayController", "do play sound, operation %s", objArr);
            int i2 = this.f54298e;
            if (i2 == 0) {
                mo24753a();
            } else if (i2 == 1) {
                mo24753a();
                if (!Util.isNullOrNil(AdlandingSightPlayController.m20432k(AdlandingSightPlayController.this))) {
                    try {
                        C97481g gVar = new C97481g();
                        this.f54297d = gVar;
                        gVar.setDisplay((SurfaceHolder) null);
                        this.f54297d.reset();
                        this.f54297d.setDataSource(AdlandingSightPlayController.m20432k(AdlandingSightPlayController.this));
                        this.f54297d.setAudioStreamType(3);
                        this.f54297d.setOnErrorListener(new C19264a());
                        this.f54297d.prepare();
                        this.f54297d.start();
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.SightPlayController", e, "play sound error: %s", e.getMessage());
                        Log.m105921e("MicroMsg.SightPlayController", "on Exception: play %s ERROR!!", AdlandingSightPlayController.m20432k(AdlandingSightPlayController.this));
                        AdlandingSightPlayController.this.mo24734t();
                        if (AdlandingSightPlayController.m20437p(AdlandingSightPlayController.this) != null) {
                            ((AdlandingVideoSightView.C19270a) AdlandingSightPlayController.m20437p(AdlandingSightPlayController.this)).mo24814a(AdlandingSightPlayController.this, -1);
                        }
                    }
                }
            } else if (i2 == 2) {
                try {
                    MediaPlayer mediaPlayer = this.f54297d;
                    if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                        this.f54297d.pause();
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.SightPlayController", e2, "pause sound error: %s", e2.getMessage());
                    mo24753a();
                }
            } else if (i2 == 3) {
                try {
                    MediaPlayer mediaPlayer2 = this.f54297d;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.start();
                    }
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.SightPlayController", e3, "pause sound error: %s", e3.getMessage());
                    mo24753a();
                }
            } else if (i2 == 4) {
                try {
                    Log.m105925i("MicroMsg.SightPlayController", "soundplayer seek %f", Double.valueOf(this.f54299f));
                    this.f54297d.seekTo((int) (this.f54299f * 1000.0d));
                } catch (Exception e4) {
                    Log.printErrStackTrace("MicroMsg.SightPlayController", e4, "seek sound error: %s", e4.getMessage());
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$PlaySoundJob");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$i */
    public class C19265i implements Runnable {
        public C19265i(C115736b bVar) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ShowInfoJob");
            if (AdlandingSightPlayController.m20438q(AdlandingSightPlayController.this) >= 0) {
                AdlandingSightPlayController adlandingSightPlayController = AdlandingSightPlayController.this;
                SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                WeakReference<TextView> weakReference = adlandingSightPlayController.f54262i;
                SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                if (weakReference != null) {
                    AdlandingSightPlayController adlandingSightPlayController2 = AdlandingSightPlayController.this;
                    SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    WeakReference<TextView> weakReference2 = adlandingSightPlayController2.f54262i;
                    SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    if (weakReference2.get() != null) {
                        String videoInfo = SightVideoJNI.getVideoInfo(AdlandingSightPlayController.m20438q(AdlandingSightPlayController.this));
                        AdlandingSightPlayController adlandingSightPlayController3 = AdlandingSightPlayController.this;
                        SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                        WeakReference<TextView> weakReference3 = adlandingSightPlayController3.f54262i;
                        SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                        weakReference3.get().setText(videoInfo);
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ShowInfoJob");
                        return;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$ShowInfoJob");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$j */
    public class C19266j implements Runnable {

        /* renamed from: d */
        public WeakReference<Bitmap> f54303d = new WeakReference<>((Object) null);

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$j$a */
        public class C19267a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f54305d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f54306e;

            public C19267a(C19266j jVar, View view, Bitmap bitmap) {
                this.f54305d = view;
                this.f54306e = bitmap;
            }

            public void run() {
                SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$SurfaceThumbJob$1");
                this.f54305d.setBackgroundDrawable(new BitmapDrawable(this.f54306e));
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$SurfaceThumbJob$1");
            }
        }

        public C19266j(C115736b bVar) {
        }

        public void run() {
            View view;
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$SurfaceThumbJob");
            try {
                AdlandingSightPlayController.m20428g(AdlandingSightPlayController.this);
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(AdlandingSightPlayController.this.hashCode());
                objArr[1] = Integer.valueOf(hashCode());
                AdlandingSightPlayController.m20428g(AdlandingSightPlayController.this);
                Boolean bool = Boolean.TRUE;
                objArr[2] = bool;
                AdlandingSightPlayController adlandingSightPlayController = AdlandingSightPlayController.this;
                SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                WeakReference<View> weakReference = adlandingSightPlayController.f54261h;
                SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                objArr[3] = Boolean.valueOf(weakReference == null);
                objArr[4] = Boolean.valueOf(this.f54303d.get() == null);
                AdlandingSightPlayController adlandingSightPlayController2 = AdlandingSightPlayController.this;
                SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                adlandingSightPlayController2.getClass();
                SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                objArr[5] = bool;
                Log.m105929w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", objArr);
                AdlandingSightPlayController adlandingSightPlayController3 = AdlandingSightPlayController.this;
                SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                adlandingSightPlayController3.getClass();
                SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                Bitmap bitmap = this.f54303d.get();
                AdlandingSightPlayController adlandingSightPlayController4 = AdlandingSightPlayController.this;
                SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                WeakReference<View> weakReference2 = adlandingSightPlayController4.f54261h;
                SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                if (weakReference2 != null) {
                    AdlandingSightPlayController adlandingSightPlayController5 = AdlandingSightPlayController.this;
                    SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    WeakReference<View> weakReference3 = adlandingSightPlayController5.f54261h;
                    SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    view = weakReference3.get();
                } else {
                    view = null;
                }
                if (!(view == null || bitmap == null)) {
                    if (!bitmap.isRecycled()) {
                        view.post(new C19267a(this, view, bitmap));
                        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$SurfaceThumbJob");
                        return;
                    }
                }
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(view == null);
                objArr2[1] = Boolean.valueOf(bitmap == null);
                Log.m105921e("MicroMsg.SightPlayController", "bgView:%B, thumb:%B", objArr2);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$SurfaceThumbJob");
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SightPlayController", e, "", new Object[0]);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController$SurfaceThumbJob");
            }
        }
    }

    static {
        new HashMap();
    }

    public AdlandingSightPlayController(int i, View view) {
        this.f54255b = i;
        this.f54263j = new MMHandler(Looper.getMainLooper());
        this.f54265l = new WeakReference<>(view);
        Log.m105925i("MicroMsg.SightPlayController", "new SightPlayController, drawType %d", Integer.valueOf(i));
    }

    /* renamed from: a */
    public static /* synthetic */ MMHandler m20422a(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        MMHandler mMHandler = adlandingSightPlayController.f54263j;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return mMHandler;
    }

    /* renamed from: b */
    public static /* synthetic */ long m20423b(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        long j = adlandingSightPlayController.f54264k;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return j;
    }

    /* renamed from: c */
    public static /* synthetic */ long m20424c(AdlandingSightPlayController adlandingSightPlayController, long j) {
        SnsMethodCalculate.markStartTimeMs("access$1302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54264k = j;
        SnsMethodCalculate.markEndTimeMs("access$1302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return j;
    }

    /* renamed from: d */
    public static /* synthetic */ String m20425d(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        String str = adlandingSightPlayController.f54257d;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return str;
    }

    /* renamed from: e */
    public static /* synthetic */ C19252a m20426e(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        C19252a aVar = adlandingSightPlayController.f54269p;
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return aVar;
    }

    /* renamed from: f */
    public static /* synthetic */ WeakReference m20427f(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        WeakReference<View> weakReference = adlandingSightPlayController.f54265l;
        SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return weakReference;
    }

    /* renamed from: g */
    public static /* synthetic */ Surface m20428g(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return null;
    }

    /* renamed from: h */
    public static /* synthetic */ double m20429h(AdlandingSightPlayController adlandingSightPlayController, double d) {
        SnsMethodCalculate.markStartTimeMs("access$2702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.f54279z = d;
        SnsMethodCalculate.markEndTimeMs("access$2702", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return d;
    }

    /* renamed from: i */
    public static /* synthetic */ C19261f m20430i(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return null;
    }

    /* renamed from: j */
    public static /* synthetic */ C19263h m20431j(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        C19263h hVar = adlandingSightPlayController.f54270q;
        SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return hVar;
    }

    /* renamed from: k */
    public static /* synthetic */ String m20432k(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        String str = adlandingSightPlayController.f54256c;
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return str;
    }

    /* renamed from: l */
    public static /* synthetic */ boolean m20433l(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return false;
    }

    /* renamed from: m */
    public static /* synthetic */ C19260e m20434m(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        C19260e eVar = adlandingSightPlayController.f54253E;
        SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return eVar;
    }

    /* renamed from: n */
    public static void m20435n(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        adlandingSightPlayController.getClass();
        SnsMethodCalculate.markStartTimeMs("showLoopAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        if (adlandingSightPlayController.f54265l == null || -1 == adlandingSightPlayController.mo24736v()) {
            SnsMethodCalculate.markEndTimeMs("showLoopAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        } else {
            if (adlandingSightPlayController.f54266m == null && adlandingSightPlayController.f54265l.get() != null) {
                adlandingSightPlayController.f54266m = AnimationUtils.loadAnimation(adlandingSightPlayController.f54265l.get().getContext(), adlandingSightPlayController.mo24736v());
            }
            if (adlandingSightPlayController.f54274u == null) {
                adlandingSightPlayController.f54274u = new C19258c((C115736b) null);
            }
            adlandingSightPlayController.f54263j.post(adlandingSightPlayController.f54274u);
            SnsMethodCalculate.markEndTimeMs("showLoopAnim", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        }
        SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m20436o(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$3900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        boolean z = adlandingSightPlayController.f54250B;
        SnsMethodCalculate.markEndTimeMs("access$3900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return z;
    }

    /* renamed from: p */
    public static /* synthetic */ C19259d m20437p(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        C19259d dVar = adlandingSightPlayController.f54252D;
        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return dVar;
    }

    /* renamed from: q */
    public static /* synthetic */ int m20438q(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        int i = adlandingSightPlayController.f54258e;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return i;
    }

    /* renamed from: r */
    public static /* synthetic */ int m20439r(AdlandingSightPlayController adlandingSightPlayController) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        int i = adlandingSightPlayController.f54255b;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return i;
    }

    /* renamed from: s */
    public static boolean m20440s(String str) {
        SnsMethodCalculate.markStartTimeMs("checkSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("checkSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            return false;
        }
        Integer num = (Integer) ((ConcurrentHashMap) f54248F).get(str);
        if (num == null || 2 != num.intValue()) {
            SnsMethodCalculate.markEndTimeMs("checkSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("checkSight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return false;
    }

    /* renamed from: A */
    public abstract void mo24731A(int i, int i2);

    /* renamed from: B */
    public void mo24732B() {
        SnsMethodCalculate.markStartTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        Log.m105925i("MicroMsg.SightPlayController", "#0x%x restart, canPlay %B, videoPath %s, videoId %d", Integer.valueOf(hashCode()), Boolean.valueOf(this.f54275v), this.f54256c, Integer.valueOf(this.f54258e));
        if (!this.f54275v) {
            mo24734t();
            SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        } else if (mo24739y()) {
            Log.m105929w("MicroMsg.SightPlayController", "#0x%x is runing, do nothing when restart request asked, videoPath %s", Integer.valueOf(hashCode()), this.f54256c);
            SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        } else {
            mo24733C(this.f54258e < 0);
            this.f54264k = 0;
            mo24738x();
            if (this.f54258e < 0) {
                Log.m105929w("MicroMsg.SightPlayController", "#0x%x restart match error video id, try reopen video, videoPath %s", Integer.valueOf(hashCode()), this.f54256c);
                if (Util.isNullOrNil(this.f54256c)) {
                    SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    return;
                } else if (!m20440s(this.f54256c)) {
                    Log.m105928w("MicroMsg.SightPlayController", "Check Sight Fail!!! return");
                    mo24734t();
                    SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
                    return;
                } else {
                    this.f54268o = new C19262g((C115736b) null);
                    C98398h0.m127699fO(this.f54268o, 0);
                }
            } else if (1 == this.f54255b) {
                this.f54269p = new C19252a((C115736b) null);
                this.f54271r = null;
                C98398h0.m127699fO(this.f54269p, 0);
            } else {
                this.f54269p = new C19252a((C115736b) null);
                this.f54271r = new C19257b();
                this.f54269p.f54285e = this.f54271r;
                this.f54271r.f54292e = this.f54269p;
                C98398h0.m127699fO(this.f54269p, 0);
            }
            SnsMethodCalculate.markEndTimeMs("restart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        }
    }

    /* renamed from: C */
    public void mo24733C(boolean z) {
        SnsMethodCalculate.markStartTimeMs("stopAllJobs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        if (this.f54268o != null) {
            C98398h0.m127698aL(this.f54268o);
            this.f54268o.f54295d = true;
        }
        if (this.f54271r != null) {
            this.f54263j.removeCallbacks(this.f54271r);
            this.f54271r.f54291d = true;
        }
        if (this.f54269p != null) {
            C98398h0.m127698aL(this.f54269p);
            this.f54269p.f54284d = true;
        }
        if (this.f54270q != null) {
            this.f54270q.f54298e = z ? 0 : 2;
            C98398h0.m127699fO(this.f54270q, 0);
        }
        SnsMethodCalculate.markEndTimeMs("stopAllJobs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
    }

    /* renamed from: t */
    public void mo24734t() {
        SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        Log.m105925i("MicroMsg.SightPlayController", "#0x%x do clear, remove render job, video id %d, runing %B", Integer.valueOf(hashCode()), Integer.valueOf(this.f54258e), Boolean.valueOf(mo24739y()));
        mo24733C(true);
        this.f54264k = 0;
        int i = this.f54258e;
        SnsMethodCalculate.markStartTimeMs("freeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        C98398h0.m127699fO(new C106153c(this, i), 0);
        SnsMethodCalculate.markEndTimeMs("freeVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        this.f54258e = -1;
        this.f54256c = "";
        this.f54257d = "ERROR#PATH";
        this.f54278y = 0.0d;
        C92716o.f266827d.mo126928m(this.f54260g);
        this.f54260g = null;
        SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
    }

    /* renamed from: u */
    public void mo24735u(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("drawSurfaceThumb", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        boolean z = true;
        Object[] objArr = new Object[1];
        if (bitmap != null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        Log.m105927v("MicroMsg.SightPlayController", "draw surface thumb, thumb is null ? %B", objArr);
        C98398h0.m127698aL(this.f54272s);
        if (this.f54272s == null) {
            this.f54272s = new C19266j((C115736b) null);
        }
        this.f54272s.f54303d = new WeakReference<>(bitmap);
        C98398h0.m127699fO(this.f54272s, 0);
        SnsMethodCalculate.markEndTimeMs("drawSurfaceThumb", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
    }

    /* renamed from: v */
    public int mo24736v() {
        SnsMethodCalculate.markStartTimeMs("getLoopAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        SnsMethodCalculate.markEndTimeMs("getLoopAnimation", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return -1;
    }

    /* renamed from: w */
    public IListener mo24737w() {
        SnsMethodCalculate.markStartTimeMs("getUIStatusListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        if (this.f54251C == null) {
            this.f54251C = new ChattingUIStatusListener(this);
        }
        ChattingUIStatusListener chattingUIStatusListener = this.f54251C;
        SnsMethodCalculate.markEndTimeMs("getUIStatusListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return chattingUIStatusListener;
    }

    /* renamed from: x */
    public final boolean mo24738x() {
        SnsMethodCalculate.markStartTimeMs("isBadFPS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        if (this.f54276w) {
            SnsMethodCalculate.markEndTimeMs("isBadFPS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            return false;
        }
        if (this.f54254a >= 3) {
            Log.m105926v("MicroMsg.SightPlayController", "match not check bad fps, but now is bad fps");
            this.f54254a = 0;
        }
        SnsMethodCalculate.markEndTimeMs("isBadFPS", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return false;
    }

    /* renamed from: y */
    public boolean mo24739y() {
        SnsMethodCalculate.markStartTimeMs("isRuning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        boolean z = false;
        if (1 == this.f54255b) {
            if (this.f54269p != null && !this.f54269p.f54284d) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isRuning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
            return z;
        }
        if (this.f54271r != null && !this.f54271r.f54291d && this.f54269p != null && !this.f54269p.f54284d) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isRuning", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdlandingSightPlayController");
        return z;
    }

    /* renamed from: z */
    public abstract void mo24740z(Bitmap bitmap);
}
