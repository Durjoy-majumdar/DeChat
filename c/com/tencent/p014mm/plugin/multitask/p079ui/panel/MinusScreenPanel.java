package com.tencent.p014mm.plugin.multitask.p079ui.panel;

import aa2.C103343n;
import aa2.C112765c;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import ba2.C0261e;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.multitask.C105923s;
import com.tencent.p014mm.plugin.multitask.C56888q;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import ky2.C10432i;
import ky2.C10439o;
import l92.C109296d;
import m92.C61444a;
import o40.C61926c;
import p92.C117994a;
import p92.C117997g;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C110959d13;
import z92.C119089b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel */
public final class MinusScreenPanel extends C119089b implements IStorageObserver<MultiTaskInfo>, C112765c.C112766a {

    /* renamed from: o */
    public final MinusScreenPanel$multiTaskEventListener$1 f346649o;

    /* renamed from: p */
    public C10439o f346650p;

    /* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$a */
    public static final class C115592a implements C109296d {

        /* renamed from: a */
        public final /* synthetic */ MinusScreenPanel f346651a;

        /* renamed from: b */
        public final /* synthetic */ MultiTaskInfo f346652b;

        /* renamed from: c */
        public final /* synthetic */ C110959d13 f346653c;

        /* renamed from: d */
        public final /* synthetic */ View f346654d;

        /* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$a$a */
        public static final class C115593a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MinusScreenPanel f346655d;

            /* renamed from: e */
            public final /* synthetic */ MultiTaskInfo f346656e;

            /* renamed from: f */
            public final /* synthetic */ C110959d13 f346657f;

            /* renamed from: g */
            public final /* synthetic */ View f346658g;

            public C115593a(MinusScreenPanel minusScreenPanel, MultiTaskInfo multiTaskInfo, C110959d13 d132, View view) {
                this.f346655d = minusScreenPanel;
                this.f346656e = multiTaskInfo;
                this.f346657f = d132;
                this.f346658g = view;
            }

            public final void run() {
                C117997g f = this.f346655d.mo183763f(this.f346656e);
                if (f != null) {
                    MinusScreenPanel minusScreenPanel = this.f346655d;
                    MultiTaskInfo multiTaskInfo = this.f346656e;
                    C110959d13 d132 = this.f346657f;
                    View view = this.f346658g;
                    ((MultiTaskUIC) C39818r.f106831a.mo62444c(minusScreenPanel.f356639d).mo75002a(MultiTaskUIC.class)).mo175708d3(multiTaskInfo);
                    d132.f331953o = System.currentTimeMillis();
                    C117994a.C117995a.m166409a(f, view, multiTaskInfo, d132, (Object) null, 8, (Object) null);
                    Log.m105925i("MicroMsg.MultiTask.MinusScreenPanel", "onAnimationCancel,onGridItemClick, id:%s", multiTaskInfo.field_id);
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$a$b */
        public static final class C115594b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MinusScreenPanel f346659d;

            /* renamed from: e */
            public final /* synthetic */ MultiTaskInfo f346660e;

            /* renamed from: f */
            public final /* synthetic */ C110959d13 f346661f;

            /* renamed from: g */
            public final /* synthetic */ View f346662g;

            public C115594b(MinusScreenPanel minusScreenPanel, MultiTaskInfo multiTaskInfo, C110959d13 d132, View view) {
                this.f346659d = minusScreenPanel;
                this.f346660e = multiTaskInfo;
                this.f346661f = d132;
                this.f346662g = view;
            }

            public final void run() {
                C117997g f = this.f346659d.mo183763f(this.f346660e);
                if (f != null) {
                    MinusScreenPanel minusScreenPanel = this.f346659d;
                    MultiTaskInfo multiTaskInfo = this.f346660e;
                    C110959d13 d132 = this.f346661f;
                    View view = this.f346662g;
                    ((MultiTaskUIC) C39818r.f106831a.mo62444c(minusScreenPanel.f356639d).mo75002a(MultiTaskUIC.class)).mo175708d3(multiTaskInfo);
                    d132.f331953o = System.currentTimeMillis();
                    C117994a.C117995a.m166409a(f, view, multiTaskInfo, d132, (Object) null, 8, (Object) null);
                    Log.m105925i("MicroMsg.MultiTask.MinusScreenPanel", "onAnimationEnd, onGridItemClick, id:%s", multiTaskInfo.field_id);
                }
            }
        }

        public C115592a(MinusScreenPanel minusScreenPanel, MultiTaskInfo multiTaskInfo, C110959d13 d132, View view) {
            this.f346651a = minusScreenPanel;
            this.f346652b = multiTaskInfo;
            this.f346653c = d132;
            this.f346654d = view;
        }

        /* renamed from: a */
        public void mo90716a(Bitmap bitmap, boolean z, int i) {
        }

        /* renamed from: b */
        public void mo90717b(int i) {
            ((C119157j) C119157j.f356862d).mo183895z(new C115593a(this.f346651a, this.f346652b, this.f346653c, this.f346654d));
        }

        /* renamed from: c */
        public void mo90718c(Bitmap bitmap, int i) {
            ((C119157j) C119157j.f356862d).mo183895z(new C115594b(this.f346651a, this.f346652b, this.f346653c, this.f346654d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$b */
    public static final class C115595b implements C10439o {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f346663d;

        /* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MinusScreenPanel$b$a */
        public static final class C115596a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ AppCompatActivity f346664d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C115596a(AppCompatActivity appCompatActivity) {
                super(0);
                this.f346664d = appCompatActivity;
            }

            public Object invoke() {
                ((MultiTaskUIC) C39818r.f106831a.mo62444c(this.f346664d).mo75002a(MultiTaskUIC.class)).mo175709e3(true);
                return C13598b0.f38549a;
            }
        }

        public C115595b(AppCompatActivity appCompatActivity) {
            this.f346663d = appCompatActivity;
        }

        public final void onDataChanged() {
            C61926c.m72668M(new C115596a(this.f346663d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinusScreenPanel(AppCompatActivity appCompatActivity, Bundle bundle) {
        super(appCompatActivity, bundle);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f346649o = new MinusScreenPanel$multiTaskEventListener$1(this, appCompatActivity, C40008f.f107254d);
        this.f346650p = new C115595b(appCompatActivity);
    }

    /* renamed from: a */
    public void mo164525a(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "taskInfo");
        C117997g f = mo183763f(multiTaskInfo);
        if (f != null) {
            f.mo62155j3(multiTaskInfo, i);
        }
    }

    /* renamed from: b */
    public void mo164526b(View view, View view2, int i, MultiTaskInfo multiTaskInfo, boolean z) {
        C13604l lVar;
        int i2;
        View view3 = view2;
        MultiTaskInfo multiTaskInfo2 = multiTaskInfo;
        boolean z2 = z;
        Class cls = MultiTaskUIC.class;
        C87412m.m108594g(multiTaskInfo2, "taskInfo");
        C39818r rVar = C39818r.f106831a;
        if (((MultiTaskUIC) rVar.mo62444c(this.f356639d).mo75002a(cls)).mo175707c3(multiTaskInfo2.field_type)) {
            ((C10432i) C86312j.m106911c(C10432i.class)).mo10755m4(this.f356639d);
            Log.m105924i("MicroMsg.MultiTask.MinusScreenPanel", "onGridItemClick, is TeenMode!");
            return;
        }
        C110959d13 d132 = new C110959d13();
        d132.f331947f = z2;
        C0261e eVar = C0261e.f806a;
        View findViewById = view3 != null ? view3.findViewById(C0966R.C0970id.h3h) : null;
        if (findViewById == null) {
            lVar = new C13604l("", 0);
        } else {
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            findViewById.getLocalVisibleRect(rect);
            int i3 = iArr[0];
            int i4 = iArr[1];
            int width = findViewById.getWidth();
            int height = findViewById.getHeight() + i4;
            int height2 = height - rect.height();
            if (rect.top == 0) {
                int height3 = rect.height() + i4;
                if (height > height3) {
                    height = height3;
                    i2 = 4;
                } else {
                    height = height3;
                    i2 = 2;
                }
            } else {
                i4 = height2;
                i2 = 1;
            }
            int i5 = rect.left;
            Rect rect2 = new Rect(i3 + i5, i4, i3 + width + i5, height);
            String format = String.format("%d,%d,%d,%d", Arrays.copyOf(new Object[]{Integer.valueOf(rect2.left), Integer.valueOf(rect2.top), Integer.valueOf(rect2.right), Integer.valueOf(rect2.bottom)}, 4));
            C87412m.m108593f(format, "format(format, *args)");
            lVar = new C13604l(format, Integer.valueOf(i2));
        }
        d132.f331946e = (String) lVar.f38555d;
        d132.f331950i = (((Number) lVar.f38556e).intValue() & 1) == 1;
        d132.f331951j = (((Number) lVar.f38556e).intValue() & 4) == 1;
        C56888q qVar = C56888q.f162957a;
        String str = multiTaskInfo2.field_id;
        C87412m.m108593f(str, "taskInfo.field_id");
        d132.f331945d = qVar.mo80311b(str);
        d132.f331948g = qVar.mo80311b("Home");
        d132.f331949h = eVar.mo301a(view);
        d132.f331952n = i;
        if (z2) {
            C117997g e = mo183762e(1048576, "MultiTaskForSnapshotMinusScreen");
            if (e != null) {
                ((C103343n) e).mo36001L1(view3, multiTaskInfo2, d132, new C115592a(this, multiTaskInfo2, d132, view3));
                return;
            }
            return;
        }
        C117997g f = mo183763f(multiTaskInfo2);
        if (f != null) {
            d132.f331953o = System.currentTimeMillis();
            C117994a.C117995a.m166409a(f, view2, multiTaskInfo, d132, (Object) null, 8, (Object) null);
            ((MultiTaskUIC) rVar.mo62444c(this.f356639d).mo75002a(cls)).mo175708d3(multiTaskInfo2);
            Log.m105925i("MicroMsg.MultiTask.MinusScreenPanel", "needEnterAnim false, onGridItemClick, id:%s", multiTaskInfo2.field_id);
        }
    }

    /* renamed from: c */
    public void mo164527c(MultiTaskInfo multiTaskInfo, int i) {
        C87412m.m108594g(multiTaskInfo, "taskInfo");
        C117997g f = mo183763f(multiTaskInfo);
        if (f != null) {
            f.mo62144e3(multiTaskInfo, i);
        }
        String str = multiTaskInfo.field_id;
        C87412m.m108593f(str, "taskInfo.field_id");
        mo183767j(str);
        Log.m105925i("MicroMsg.MultiTask.MinusScreenPanel", "onGridItemDelete, id:%s", multiTaskInfo.field_id);
    }

    public void onChanged(Object obj) {
        StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
        C87412m.m108594g(storageObserverEvent, "event");
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f356645j);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C117997g) it.next()).mo125822c3(storageObserverEvent);
        }
    }

    public void onDestroy() {
        Log.m105924i(this.f356641f, "onDestroy");
        C61444a vx02 = ((C105923s) C86312j.m106911c(C105923s.class)).vx0();
        if (vx02 != null) {
            vx02.removeObserver(this);
        }
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10756rY(this.f346650p);
        this.f346649o.dead();
        C117997g d = mo183761d(0, "MultiTaskForMinusScreen");
        if (d != null) {
            ((C112765c) d).onDestroy();
        }
    }
}
