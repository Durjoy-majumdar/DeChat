package pm1;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60898l;
import jq3.C60905o;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: pm1.p */
public final class C62399p implements C60898l.C60900d<C60905o> {

    /* renamed from: a */
    public final RecyclerView f177352a;

    /* renamed from: b */
    public final boolean f177353b;

    /* renamed from: c */
    public final C32226l<Integer, C13598b0> f177354c;

    /* renamed from: d */
    public final C32226l<Integer, C13598b0> f177355d;

    /* renamed from: e */
    public int f177356e = -1;

    /* renamed from: f */
    public int f177357f;

    /* renamed from: g */
    public boolean f177358g;

    /* renamed from: h */
    public boolean f177359h;

    /* renamed from: i */
    public boolean f177360i;

    /* renamed from: j */
    public MotionEvent f177361j;

    /* renamed from: k */
    public final C13601g f177362k = C36568h.m40985a(new C62400a(this));

    /* renamed from: pm1.p$a */
    public static final class C62400a extends C87413o implements C32224a<StaggeredGridLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ C62399p f177363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62400a(C62399p pVar) {
            super(0);
            this.f177363d = pVar;
        }

        public Object invoke() {
            RecyclerView.LayoutManager layoutManager = this.f177363d.f177352a.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager");
            return (StaggeredGridLayoutManager) layoutManager;
        }
    }

    public C62399p(RecyclerView recyclerView, boolean z, C32226l<? super Integer, C13598b0> lVar, C32226l<? super Integer, C13598b0> lVar2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(lVar, "invokeOnTouchMoveCallback");
        C87412m.m108594g(lVar2, "invokeAutoPlayCallback");
        this.f177352a = recyclerView;
        this.f177353b = z;
        this.f177354c = lVar;
        this.f177355d = lVar2;
    }

    /* renamed from: a */
    public boolean mo85806a(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar, MotionEvent motionEvent) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        C87412m.m108594g(motionEvent, "event");
        Log.m105924i("NearbyLiveItemOnTouchEventAdapter", "ACTION pos:" + i + " (" + motionEvent.getAction() + ", " + motionEvent.getX() + ", " + motionEvent.getY() + ')');
        this.f177356e = i;
        int action = motionEvent.getAction();
        if (action == 0) {
            Log.m105924i("NearbyLiveItemOnTouchEventAdapter", "ACTION_DOWN pos:" + i + " (" + motionEvent.getX() + ", " + motionEvent.getY() + ')');
            this.f177358g = false;
            this.f177357f = 0;
        } else if (action == 1 || action == 3) {
            Log.m105924i("NearbyLiveItemOnTouchEventAdapter", "ACTION_UP pos:" + i + " (" + motionEvent.getX() + ", " + motionEvent.getY() + ')');
        }
        return false;
    }
}
