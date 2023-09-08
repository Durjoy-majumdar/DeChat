package ef1;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import di3.C86312j;
import gy3.C87412m;
import p501dz.C58466h;

/* renamed from: ef1.f */
public abstract class C58556f extends C7638e<RecyclerView.C0130p> {

    /* renamed from: b */
    public final String f167608b = "Finder.FinderFeedFlowEventSubscriber";

    /* renamed from: c */
    public final int f167609c;

    /* renamed from: d */
    public Rect f167610d;

    /* renamed from: e */
    public int f167611e;

    /* renamed from: f */
    public int f167612f;

    /* renamed from: g */
    public final int f167613g;

    /* renamed from: h */
    public final boolean f167614h;

    /* renamed from: i */
    public int f167615i;

    /* renamed from: j */
    public int f167616j;

    /* renamed from: k */
    public int f167617k;

    /* renamed from: l */
    public int[] f167618l;

    /* renamed from: m */
    public int f167619m;

    /* renamed from: n */
    public RecyclerView f167620n;

    /* renamed from: o */
    public final long f167621o;

    /* renamed from: p */
    public final RecyclerView.C16615g f167622p;

    /* renamed from: q */
    public final Runnable f167623q;

    /* renamed from: r */
    public final MMHandler f167624r;

    /* renamed from: ef1.f$a */
    public static final class C58557a extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C58556f f167625a;

        public C58557a(C58556f fVar) {
            this.f167625a = fVar;
        }

        /* renamed from: b */
        public void mo2556b() {
            Log.m105918d(this.f167625a.f167608b, "onChanged");
            this.f167625a.f167624r.removeMessages(0);
            C58556f fVar = this.f167625a;
            fVar.f167624r.sendEmptyMessageDelayed(0, fVar.f167621o);
        }

        /* renamed from: c */
        public void mo2557c(int i, int i2) {
            String str = this.f167625a.f167608b;
            Log.m105918d(str, "onItemRangeChanged " + i + ' ' + i2);
            this.f167625a.f167624r.removeMessages(0);
            C58556f fVar = this.f167625a;
            fVar.f167624r.sendEmptyMessageDelayed(1, fVar.f167621o);
        }

        /* renamed from: e */
        public void mo2559e(int i, int i2) {
            String str = this.f167625a.f167608b;
            Log.m105918d(str, "onItemRangeInserted " + i + ' ' + i2);
            this.f167625a.f167624r.removeMessages(0);
            C58556f fVar = this.f167625a;
            fVar.f167624r.sendEmptyMessageDelayed(0, fVar.f167621o);
        }

        /* renamed from: f */
        public void mo17312f(int i, int i2, int i3) {
            String str = this.f167625a.f167608b;
            Log.m105918d(str, "onItemRangeMoved " + i + ' ' + i2 + ' ' + i3);
            this.f167625a.f167624r.removeMessages(0);
            C58556f fVar = this.f167625a;
            fVar.f167624r.sendEmptyMessageDelayed(0, fVar.f167621o);
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            String str = this.f167625a.f167608b;
            Log.m105918d(str, "onItemRangeRemoved " + i + ' ' + i2);
            this.f167625a.f167624r.removeMessages(0);
            C58556f fVar = this.f167625a;
            fVar.f167624r.sendEmptyMessageDelayed(0, fVar.f167621o);
        }
    }

    /* renamed from: ef1.f$b */
    public static final class C58558b extends MMHandler {

        /* renamed from: a */
        public final /* synthetic */ C58556f f167626a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58558b(C58556f fVar, Looper looper) {
            super(looper);
            this.f167626a = fVar;
        }

        public void handleMessage(Message message) {
            RecyclerView recyclerView;
            if (message != null) {
                C58556f fVar = this.f167626a;
                int i = message.what;
                if (i == 0) {
                    RecyclerView recyclerView2 = fVar.f167620n;
                    if (recyclerView2 != null) {
                        fVar.mo83457f(recyclerView2, 5);
                    }
                } else if (i == 1 && (recyclerView = fVar.f167620n) != null) {
                    fVar.mo83457f(recyclerView, 9);
                }
            }
        }
    }

    /* renamed from: ef1.f$c */
    public static final class C58559c implements RecyclerView.C16621m {

        /* renamed from: d */
        public boolean f167627d = true;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView f167628e;

        /* renamed from: f */
        public final /* synthetic */ C58556f f167629f;

        /* renamed from: ef1.f$c$a */
        public static final class C58560a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C58556f f167630d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView f167631e;

            public C58560a(C58556f fVar, RecyclerView recyclerView) {
                this.f167630d = fVar;
                this.f167631e = recyclerView;
            }

            public final void run() {
                C58556f fVar = this.f167630d;
                fVar.getClass();
                new C58563g(fVar).onScrollStateChanged(this.f167631e, 4);
            }
        }

        public C58559c(RecyclerView recyclerView, C58556f fVar) {
            this.f167628e = recyclerView;
            this.f167629f = fVar;
        }

        /* renamed from: E0 */
        public void mo17332E0(View view) {
            C87412m.m108594g(view, "view");
        }

        /* renamed from: z2 */
        public void mo17333z2(View view) {
            C87412m.m108594g(view, "view");
            if (this.f167627d) {
                this.f167627d = false;
                RecyclerView recyclerView = this.f167628e;
                recyclerView.post(new C58560a(this.f167629f, recyclerView));
            }
        }
    }

    /* renamed from: ef1.f$d */
    public static final class C58561d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58556f f167632d;

        /* renamed from: e */
        public final /* synthetic */ C7637b f167633e;

        public C58561d(C58556f fVar, C7637b bVar) {
            this.f167632d = fVar;
            this.f167633e = bVar;
        }

        public final void run() {
            this.f167632d.mo8766a(this.f167633e);
        }
    }

    /* renamed from: ef1.f$e */
    public static final class C58562e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C58556f f167634d;

        public C58562e(C58556f fVar) {
            this.f167634d = fVar;
        }

        public final void run() {
            C58556f fVar = this.f167634d;
            RecyclerView recyclerView = fVar.f167620n;
            if (recyclerView != null) {
                fVar.mo83457f(recyclerView, 7);
                fVar.mo83457f(recyclerView, 5);
            }
        }
    }

    public C58556f(C58553c cVar) {
        super(cVar);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(MMApplicationContext.getContext());
        C87412m.m108593f(viewConfiguration, "get(MMApplicationContext.getContext())");
        this.f167609c = MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels;
        this.f167610d = new Rect();
        this.f167611e = Integer.MAX_VALUE;
        this.f167612f = Integer.MAX_VALUE;
        this.f167613g = viewConfiguration.getScaledTouchSlop();
        this.f167614h = ((C58466h) C86312j.m106911c(C58466h.class)).mo31873pJ();
        this.f167618l = new int[5];
        this.f167621o = 500;
        this.f167622p = new C58557a(this);
        this.f167623q = new C58562e(this);
        this.f167624r = new C58558b(this, Looper.getMainLooper());
    }

    /* renamed from: b */
    public abstract C7637b mo8587b(RecyclerView recyclerView, int i);

    /* renamed from: c */
    public void mo83455c(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f167620n = recyclerView;
        recyclerView.mo17043c(new C58563g(this));
        recyclerView.mo17088i0(new C58559c(recyclerView, this));
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if (adapter != null && (adapter instanceof WxRecyclerAdapter)) {
            adapter.registerAdapterDataObserver(this.f167622p);
        }
    }

    /* renamed from: d */
    public void mo8584d() {
        MMHandlerThread.removeRunnable(this.f167623q);
        this.f167624r.removeMessages(0);
        RecyclerView recyclerView = this.f167620n;
        if (recyclerView != null) {
            mo83457f(recyclerView, 10);
        }
        String str = this.f167608b;
        Log.m105924i(str, "onInvisible " + this.f167611e + ' ' + this.f167612f);
    }

    /* renamed from: e */
    public void mo83456e() {
        String str = this.f167608b;
        Log.m105924i(str, "onVisible " + this.f167611e + ' ' + this.f167612f);
        this.f167611e = Integer.MAX_VALUE;
        this.f167612f = Integer.MAX_VALUE;
        MMHandlerThread.postToMainThreadDelayed(this.f167623q, 200);
        RecyclerView recyclerView = this.f167620n;
        if (recyclerView != null) {
            mo83457f(recyclerView, 7);
        }
    }

    /* renamed from: f */
    public void mo83457f(RecyclerView recyclerView, int i) {
        C7637b bVar;
        C87412m.m108594g(recyclerView, "recyclerView");
        String str = this.f167608b;
        if (C87412m.m108589b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            long uptimeMillis = SystemClock.uptimeMillis();
            bVar = mo8587b(recyclerView, i);
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= 50) {
                Log.m105928w(str, "[checkUICost] " + ("what are you doing? guy! This operation is so slow in ui thread.[" + uptimeMillis2 + "ms]"));
            }
        } else {
            bVar = mo8587b(recyclerView, i);
        }
        recyclerView.post(new C58561d(this, bVar));
    }
}
