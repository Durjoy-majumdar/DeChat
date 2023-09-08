package com.tencent.p014mm.plugin.p081mv.p082ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cb2.C54712i;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MvCreateActionStruct;
import com.tencent.p014mm.plugin.p081mv.model.MvCreateReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import my3.C61594j;
import my3.C61595o;
import rb2.C63380a;
import sx3.C36904l0;
import sx3.C36907w;
import sx3.C64186f0;
import u23.C65003a;
import u23.C65004e;
import vb2.C65564b;
import vb2.C65566c;
import vb2.C65567d;
import vb2.C65577g;
import vb2.C65581j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003>?@B\u001d\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=R\"\u0010\n\u001a\u00020\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00038\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0005\u001a\u0004\b\u0018\u0010\u0007R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00105\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b4\u0010'R\u0014\u00107\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0007¨\u0006A"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/MvTracksEditView;", "Landroid/widget/FrameLayout;", "Lvb2/d$c;", "", "h", "I", "getSelectedIndex", "()I", "setSelectedIndex", "(I)V", "selectedIndex", "i", "getDraggingIndex", "setDraggingIndex", "draggingIndex", "Lrb2/a;", "n", "Lrb2/a;", "getThumbLoader", "()Lrb2/a;", "setThumbLoader", "(Lrb2/a;)V", "thumbLoader", "o", "getSpaceSize", "spaceSize", "Lcom/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$e;", "A", "Lcom/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$e;", "getCallback", "()Lcom/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$e;", "setCallback", "(Lcom/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$e;)V", "callback", "", "value", "E", "J", "getVideoProgress", "()J", "setVideoProgress", "(J)V", "videoProgress", "", "Lu23/a;", "getTracks", "()Ljava/util/List;", "tracks", "", "getWidthPerMills", "()F", "widthPerMills", "getFillingDuration", "fillingDuration", "getFillingWidth", "fillingWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "e", "f", "g", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView */
public final class MvTracksEditView extends FrameLayout implements C65567d.C65570c {

    /* renamed from: F */
    public static final /* synthetic */ int f163696F = 0;

    /* renamed from: A */
    public C57140e f163697A;

    /* renamed from: B */
    public long f163698B;

    /* renamed from: C */
    public long f163699C;

    /* renamed from: D */
    public int f163700D;

    /* renamed from: E */
    public long f163701E;

    /* renamed from: d */
    public final RecyclerView f163702d;

    /* renamed from: e */
    public final AppCompatImageView f163703e;

    /* renamed from: f */
    public int f163704f;

    /* renamed from: g */
    public final C65567d f163705g;

    /* renamed from: h */
    public int f163706h = -1;

    /* renamed from: i */
    public int f163707i = -1;

    /* renamed from: j */
    public List<? extends C65003a> f163708j = C64186f0.f181907d;

    /* renamed from: n */
    public C63380a f163709n;

    /* renamed from: o */
    public final int f163710o;

    /* renamed from: p */
    public float f163711p;

    /* renamed from: q */
    public float f163712q;

    /* renamed from: r */
    public float f163713r;

    /* renamed from: s */
    public boolean f163714s;

    /* renamed from: t */
    public final C65564b f163715t;

    /* renamed from: u */
    public final C65566c f163716u;

    /* renamed from: v */
    public final LinearLayoutManager f163717v;

    /* renamed from: w */
    public final C65577g f163718w;

    /* renamed from: x */
    public long f163719x;

    /* renamed from: y */
    public long f163720y;

    /* renamed from: z */
    public int f163721z;

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$a */
    public static final class C57135a implements C65567d.C65568a {

        /* renamed from: a */
        public final /* synthetic */ MvTracksEditView f163722a;

        /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$a$a */
        public static final class C57136a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MvTracksEditView f163723d;

            /* renamed from: e */
            public final /* synthetic */ int f163724e;

            /* renamed from: f */
            public final /* synthetic */ long f163725f;

            /* renamed from: g */
            public final /* synthetic */ long f163726g;

            public C57136a(MvTracksEditView mvTracksEditView, int i, long j, long j2) {
                this.f163723d = mvTracksEditView;
                this.f163724e = i;
                this.f163725f = j;
                this.f163726g = j2;
            }

            public final void run() {
                this.f163723d.mo80658d(this.f163724e, this.f163725f, this.f163726g, true);
            }
        }

        public C57135a(MvTracksEditView mvTracksEditView) {
            this.f163722a = mvTracksEditView;
        }

        /* renamed from: a */
        public void mo80675a(int i, long j) {
            Log.m105924i("MicroMsg.MvTracksEditView", "onTrackEndChanged: index=" + i + ", time=" + j);
            C57140e callback = this.f163722a.getCallback();
            if (callback != null) {
                callback.mo80681a(i, j);
            }
        }

        /* renamed from: b */
        public void mo80676b(int i, long j, long j2) {
            Log.m105924i("MicroMsg.MvTracksEditView", "onSlidingStarted: index=" + i + ", startTime=" + j + ", endTime=" + j2);
            C57140e callback = this.f163722a.getCallback();
            if (callback != null) {
                callback.mo80682b(i, j, j2);
            }
        }

        /* renamed from: c */
        public void mo80677c(int i, long j) {
            Log.m105924i("MicroMsg.MvTracksEditView", "onTrackStartChanged: index=" + i + ", time=" + j);
            C57140e callback = this.f163722a.getCallback();
            if (callback != null) {
                callback.mo80683c(i, j);
            }
        }

        /* renamed from: d */
        public void mo80678d(int i) {
            long d = this.f163722a.getTracks().get(i).mo88221d();
            if (d < 2000) {
                Log.m105928w("MicroMsg.MvTracksEditView", "video's duration is too short: index=" + i + ", duration=" + d);
                return;
            }
            MvTracksEditView mvTracksEditView = this.f163722a;
            C65003a aVar = mvTracksEditView.getTracks().get(i);
            Log.m105924i("MicroMsg.MvTracksEditView", "startSelecting: " + i + ", start=" + aVar.f187124d + ", end=" + aVar.f187125e);
            if (mvTracksEditView.getSelectedIndex() != -1) {
                C65567d dVar = mvTracksEditView.f163705g;
                int selectedIndex = mvTracksEditView.getSelectedIndex();
                dVar.getClass();
                dVar.notifyItemChanged(selectedIndex + 1);
            }
            mvTracksEditView.setSelectedIndex(i);
            C65567d dVar2 = mvTracksEditView.f163705g;
            dVar2.getClass();
            dVar2.notifyItemChanged(i + 1);
            mvTracksEditView.f163718w.f188695r = false;
            mvTracksEditView.f163703e.setVisibility(4);
            mvTracksEditView.f163702d.mo17035V0();
            C57140e eVar = mvTracksEditView.f163697A;
            if (eVar != null) {
                eVar.mo80687g(i, aVar.f187124d, aVar.f187125e);
            }
        }

        /* renamed from: e */
        public void mo80679e(int i, long j, long j2) {
            Log.m105924i("MicroMsg.MvTracksEditView", "onSlidingStopped: index=" + i + ", startTime=" + j + ", endTime=" + j2);
            MvTracksEditView mvTracksEditView = this.f163722a;
            mvTracksEditView.post(new C57136a(mvTracksEditView, i, j, j2));
            C57140e callback = this.f163722a.getCallback();
            if (callback != null) {
                callback.mo80685e(i, j, j2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$b */
    public static final class C57137b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ MvTracksEditView f163727d;

        public C57137b(MvTracksEditView mvTracksEditView) {
            this.f163727d = mvTracksEditView;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            int N0 = recyclerView.mo17029N0(view);
            this.f163727d.f163705g.getClass();
            int i = N0 - 1;
            if (i >= 0 && i < this.f163727d.getTracks().size()) {
                if (i < this.f163727d.getTracks().size() - 1 || this.f163727d.getFillingWidth() > 0) {
                    rect.set(0, 0, this.f163727d.getSpaceSize(), 0);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$c */
    public static final class C57138c extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ MvTracksEditView f163728d;

        public C57138c(MvTracksEditView mvTracksEditView) {
            this.f163728d = mvTracksEditView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            Log.m105924i("MicroMsg.MvTracksEditView", "onScrollStateChanged: newState=" + i);
            if (i == 0) {
                MvTracksEditView mvTracksEditView = this.f163728d;
                int i2 = MvTracksEditView.f163696F;
                boolean z = true;
                if (!mvTracksEditView.f163714s) {
                    if (!(mvTracksEditView.getDraggingIndex() != -1)) {
                        if (!(mvTracksEditView.getSelectedIndex() != -1)) {
                            z = false;
                        }
                    }
                }
                if (!z) {
                    MvTracksEditView mvTracksEditView2 = this.f163728d;
                    mvTracksEditView2.setVideoProgress(mvTracksEditView2.f163698B);
                    Log.m105918d("MicroMsg.MvTracksEditView", "scrolling stopped, progress=" + this.f163728d.getVideoProgress());
                    C57140e callback = this.f163728d.getCallback();
                    if (callback != null) {
                        callback.mo80684d(this.f163728d.getVideoProgress());
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            MvTracksEditView mvTracksEditView = this.f163728d;
            int i3 = MvTracksEditView.f163696F;
            mvTracksEditView.mo80655a();
            MvTracksEditView mvTracksEditView2 = this.f163728d;
            mvTracksEditView2.f163716u.f188660n = mvTracksEditView2.f163698B;
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$d */
    public static final class C57139d implements RecyclerView.C16622o {

        /* renamed from: d */
        public float f163729d;

        /* renamed from: e */
        public float f163730e;

        /* renamed from: f */
        public long f163731f;

        /* renamed from: g */
        public final /* synthetic */ MvTracksEditView f163732g;

        /* renamed from: h */
        public final /* synthetic */ C65581j f163733h;

        public C57139d(MvTracksEditView mvTracksEditView, C65581j jVar) {
            this.f163732g = mvTracksEditView;
            this.f163733h = jVar;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$5", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(motionEvent, "event");
            if (this.f163732g.f163714s) {
                this.f163733h.mo89657b(motionEvent);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$5", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo6022e(androidx.recyclerview.widget.RecyclerView r11, android.view.MotionEvent r12) {
            /*
                r10 = this;
                java.lang.String r0 = "recyclerView"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.String r0 = "event"
                gy3.C87412m.m108594g(r12, r0)
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r10.f163732g
                float r1 = r12.getX()
                r0.f163711p = r1
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r10.f163732g
                float r1 = r12.getY()
                r0.f163712q = r1
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r10.f163732g
                float r1 = r12.getRawY()
                r0.f163713r = r1
                int r0 = r12.getAction()
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x00c5
                if (r0 == r2) goto L_0x0032
                r11 = 3
                if (r0 == r11) goto L_0x0032
                goto L_0x00d8
            L_0x0032:
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r10.f163731f
                long r5 = r3 - r5
                r11 = 200(0xc8, float:2.8E-43)
                long r7 = (long) r11
                int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r11 >= 0) goto L_0x00d8
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r11 = r10.f163732g
                float r11 = r11.f163711p
                float r0 = r10.f163729d
                float r11 = r11 - r0
                float r11 = java.lang.Math.abs(r11)
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r10.f163732g
                int r5 = r0.f163721z
                float r5 = (float) r5
                int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r11 >= 0) goto L_0x00d8
                float r11 = r0.f163712q
                float r0 = r10.f163730e
                float r11 = r11 - r0
                float r11 = java.lang.Math.abs(r11)
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r10.f163732g
                int r5 = r0.f163721z
                float r5 = (float) r5
                int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r11 >= 0) goto L_0x00d8
                vb2.g r11 = r0.f163718w
                float r0 = r0.f163711p
                boolean r5 = r11.f188695r
                r6 = 0
                if (r5 == 0) goto L_0x00ae
                java.util.LinkedHashMap<java.lang.String, hb2.a> r5 = hb2.C8503a.f27530f
                boolean r5 = r5.isEmpty()
                r5 = r5 ^ r2
                if (r5 != 0) goto L_0x007a
                goto L_0x00ae
            L_0x007a:
                int r5 = r11.f188685e
                r7 = 0
            L_0x007d:
                if (r7 >= r5) goto L_0x00ae
                java.util.List<vb2.g$a> r8 = r11.f188687g
                java.util.ArrayList r8 = (java.util.ArrayList) r8
                java.lang.Object r8 = r8.get(r7)
                vb2.g$a r8 = (vb2.C65577g.C65578a) r8
                float r9 = r8.f188698b
                float r8 = r8.f188699c
                int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r8 > 0) goto L_0x0097
                int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r8 > 0) goto L_0x0097
                r8 = 1
                goto L_0x0098
            L_0x0097:
                r8 = 0
            L_0x0098:
                if (r8 == 0) goto L_0x00ab
                java.util.List<vb2.g$a> r11 = r11.f188687g
                java.util.ArrayList r11 = (java.util.ArrayList) r11
                java.lang.Object r11 = r11.get(r7)
                vb2.g$a r11 = (vb2.C65577g.C65578a) r11
                int r11 = r11.f188697a
                java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
                goto L_0x00ae
            L_0x00ab:
                int r7 = r7 + 1
                goto L_0x007d
            L_0x00ae:
                if (r6 == 0) goto L_0x00c1
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r11 = r10.f163732g
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$e r11 = r11.getCallback()
                if (r11 == 0) goto L_0x00bf
                int r0 = r6.intValue()
                r11.mo80686f(r0)
            L_0x00bf:
                r11 = 1
                goto L_0x00c2
            L_0x00c1:
                r11 = 0
            L_0x00c2:
                r10.f163731f = r3
                goto L_0x00d9
            L_0x00c5:
                r11.mo17155w1()
                long r3 = java.lang.System.currentTimeMillis()
                r10.f163731f = r3
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r11 = r10.f163732g
                float r0 = r11.f163711p
                r10.f163729d = r0
                float r11 = r11.f163712q
                r10.f163730e = r11
            L_0x00d8:
                r11 = 0
            L_0x00d9:
                if (r11 != 0) goto L_0x0100
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r10.f163732g
                int r0 = r0.getSelectedIndex()
                r3 = -1
                if (r0 == r3) goto L_0x00e6
                r0 = 1
                goto L_0x00e7
            L_0x00e6:
                r0 = 0
            L_0x00e7:
                if (r0 != 0) goto L_0x0100
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r10.f163732g
                int r0 = r0.getDraggingIndex()
                if (r0 == r3) goto L_0x00f2
                r1 = 1
            L_0x00f2:
                if (r1 != 0) goto L_0x0100
                vb2.j r0 = r10.f163733h
                r0.mo89657b(r12)
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r12 = r10.f163732g
                boolean r12 = r12.f163714s
                if (r12 == 0) goto L_0x0100
                return r2
            L_0x0100:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView.C57139d.mo6022e(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$e */
    public interface C57140e {
        /* renamed from: a */
        void mo80681a(int i, long j);

        /* renamed from: b */
        void mo80682b(int i, long j, long j2);

        /* renamed from: c */
        void mo80683c(int i, long j);

        /* renamed from: d */
        void mo80684d(long j);

        /* renamed from: e */
        void mo80685e(int i, long j, long j2);

        /* renamed from: f */
        void mo80686f(int i);

        /* renamed from: g */
        void mo80687g(int i, long j, long j2);

        /* renamed from: h */
        void mo80688h();

        /* renamed from: i */
        boolean mo80689i(float f, C57141f fVar, int i);

        /* renamed from: j */
        void mo80690j(int i);

        void onMove(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$f */
    public enum C57141f {
        MOVE,
        END
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$g */
    public final class C57142g extends C16665p.C16673d {

        /* renamed from: d */
        public int f163737d;

        /* renamed from: e */
        public int f163738e = -1;

        /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$g$a */
        public static final class C57143a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ MvTracksEditView f163740d;

            public C57143a(MvTracksEditView mvTracksEditView) {
                this.f163740d = mvTracksEditView;
            }

            public final void run() {
                this.f163740d.f163702d.mo17035V0();
                Log.m105924i("MicroMsg.MvTracksEditView", "stopDragging: " + this.f163740d.getDraggingIndex());
                C65567d dVar = this.f163740d.f163705g;
                dVar.notifyItemRangeChanged(0, dVar.getItemCount());
            }
        }

        public C57142g() {
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            if ((MvTracksEditView.this.getSelectedIndex() != -1) || recyclerView.getScrollState() != 0 || !(zVar instanceof C65567d.C65572e)) {
                return 0;
            }
            return C16665p.C16673d.m16132g(15, 0);
        }

        /* renamed from: h */
        public void mo17553h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16631z zVar, float f, float f2, int i, boolean z) {
            Canvas canvas2 = canvas;
            C87412m.m108594g(canvas, "c");
            RecyclerView recyclerView2 = recyclerView;
            C87412m.m108594g(recyclerView, "recyclerView");
            RecyclerView.C16631z zVar2 = zVar;
            C87412m.m108594g(zVar, "viewHolder");
            if (i == 2) {
                C57140e callback = MvTracksEditView.this.getCallback();
                if (callback != null) {
                    MvTracksEditView mvTracksEditView = MvTracksEditView.this;
                    callback.mo80689i(mvTracksEditView.f163713r + f2, C57141f.MOVE, mvTracksEditView.getDraggingIndex());
                }
                super.mo17553h(canvas, recyclerView, zVar, f - ((float) this.f163737d), f2, i, z);
                return;
            }
            super.mo17553h(canvas, recyclerView, zVar, f, f2, i, z);
        }

        /* renamed from: i */
        public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
            C87412m.m108594g(recyclerView, "recyclerView");
            C87412m.m108594g(zVar, "viewHolder");
            C87412m.m108594g(zVar2, "target");
            if (!(zVar instanceof C65567d.C65572e) || !(zVar2 instanceof C65567d.C65572e)) {
                return false;
            }
            C65567d.C65572e eVar = (C65567d.C65572e) zVar;
            int y = eVar.mo89649y();
            C65567d.C65572e eVar2 = (C65567d.C65572e) zVar2;
            int y2 = eVar2.mo89649y();
            this.f163738e = eVar2.mo89649y();
            Log.m105924i("MicroMsg.MvTracksEditView", "move " + y + " => " + y2);
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (adapter == null) {
                return true;
            }
            adapter.notifyItemMoved(eVar.mo17363j(), eVar2.mo17363j());
            return true;
        }

        /* renamed from: j */
        public void mo17555j(RecyclerView.C16631z zVar, int i) {
            Integer num;
            Integer num2;
            RecyclerView.C16631z zVar2 = zVar;
            int i2 = i;
            Log.m105918d("MicroMsg.MvTracksEditView", "onSelectedChanged, viewHolder:" + zVar2 + ", actionState:" + i2);
            boolean z = true;
            if (zVar2 != null) {
                if (zVar2 instanceof C65567d.C65572e) {
                    MvTracksEditView mvTracksEditView = MvTracksEditView.this;
                    int i3 = ((int) mvTracksEditView.f163711p) - (mvTracksEditView.f163704f / 2);
                    C65567d.C65572e eVar = (C65567d.C65572e) zVar2;
                    int left = eVar.f44854d.getLeft();
                    MvTracksEditView mvTracksEditView2 = MvTracksEditView.this;
                    this.f163737d = (left - ((int) mvTracksEditView2.f163711p)) + (mvTracksEditView2.f163704f / 2);
                    LinearLayoutManager linearLayoutManager = mvTracksEditView2.f163717v;
                    int j = eVar.mo17363j();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i3));
                    aVar.mo10233c(Integer.valueOf(j));
                    LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
                    C9556a aVar2 = aVar;
                    C117292a.m165358d(linearLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$DraggingCallback", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager2, "com/tencent/mm/plugin/mv/ui/widget/MvTracksEditView$DraggingCallback", "onSelectedChanged", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    MvTracksEditView.this.f163703e.setVisibility(4);
                    MvTracksEditView mvTracksEditView3 = MvTracksEditView.this;
                    mvTracksEditView3.f163718w.f188695r = false;
                    mvTracksEditView3.f163702d.mo17035V0();
                    Log.m105924i("MicroMsg.MvTracksEditView", "startDragging: " + eVar.mo89649y());
                    C65567d dVar = MvTracksEditView.this.f163705g;
                    dVar.notifyItemRangeChanged(0, dVar.getItemCount());
                    MvTracksEditView.this.setDraggingIndex(eVar.mo89649y());
                    MvTracksEditView.this.f163700D = eVar.mo89649y();
                    MvTracksEditView mvTracksEditView4 = MvTracksEditView.this;
                    mvTracksEditView4.f163702d.mo17093j1(mvTracksEditView4.f163716u);
                    C57140e callback = MvTracksEditView.this.getCallback();
                    if (callback != null) {
                        callback.mo80690j(eVar.mo89649y());
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            } else if (i2 == 0) {
                this.f163737d = 0;
                MvTracksEditView mvTracksEditView5 = MvTracksEditView.this;
                mvTracksEditView5.f163718w.f188695r = true;
                mvTracksEditView5.f163703e.setVisibility(0);
                C57140e callback2 = MvTracksEditView.this.getCallback();
                if (callback2 == null || !callback2.mo80689i(0.0f, C57141f.END, MvTracksEditView.this.f163700D)) {
                    z = false;
                }
                if (z) {
                    MvTracksEditView mvTracksEditView6 = MvTracksEditView.this;
                    mvTracksEditView6.f163702d.mo17085h0(mvTracksEditView6.f163716u);
                    List<? extends C65003a> list = MvTracksEditView.this.f163708j;
                    C87412m.m108592e(list, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.vlog.ui.thumb.BaseTrackThumbInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.vlog.ui.thumb.BaseTrackThumbInfo> }");
                    ((ArrayList) list).remove(MvTracksEditView.this.f163700D);
                    MvTracksEditView mvTracksEditView7 = MvTracksEditView.this;
                    mvTracksEditView7.mo80656b();
                    mvTracksEditView7.f163715t.mo89648a(mvTracksEditView7.f163720y);
                    mvTracksEditView7.mo80659e();
                    mvTracksEditView7.f163703e.setVisibility(0);
                    mvTracksEditView7.f163702d.mo17035V0();
                    mvTracksEditView7.f163705g.notifyDataSetChanged();
                    MvTracksEditView.this.setDraggingIndex(-1);
                    MvTracksEditView.this.f163700D = -1;
                    this.f163738e = -1;
                    return;
                }
                MvTracksEditView mvTracksEditView8 = MvTracksEditView.this;
                int i4 = mvTracksEditView8.f163700D;
                int i5 = this.f163738e;
                mvTracksEditView8.getClass();
                if (i4 != -1 && i5 != -1 && i4 != i5) {
                    List<? extends C65003a> list2 = mvTracksEditView8.f163708j;
                    C87412m.m108592e(list2, "null cannot be cast to non-null type java.util.ArrayList<com.tencent.mm.plugin.vlog.ui.thumb.BaseTrackThumbInfo>{ kotlin.collections.TypeAliasesKt.ArrayList<com.tencent.mm.plugin.vlog.ui.thumb.BaseTrackThumbInfo> }");
                    ArrayList arrayList = (ArrayList) list2;
                    Object remove = arrayList.remove(i4);
                    C87412m.m108593f(remove, "it.removeAt(fromPosition)");
                    arrayList.add(i5, (C65003a) remove);
                    if (i4 > i5) {
                        num2 = Integer.valueOf(i5);
                        num = Integer.valueOf(i4);
                    } else {
                        num2 = Integer.valueOf(i4);
                        num = Integer.valueOf(i5);
                    }
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    if (intValue <= intValue2) {
                        while (true) {
                            ((C65003a) arrayList.get(intValue)).f187129i = intValue;
                            if (intValue == intValue2) {
                                break;
                            }
                            intValue++;
                        }
                    }
                }
                MvTracksEditView mvTracksEditView9 = MvTracksEditView.this;
                mvTracksEditView9.post(new C57143a(mvTracksEditView9));
                MvTracksEditView.this.setDraggingIndex(-1);
                C57140e callback3 = MvTracksEditView.this.getCallback();
                if (callback3 != null) {
                    callback3.onMove(MvTracksEditView.this.f163700D, this.f163738e);
                }
                MvTracksEditView mvTracksEditView10 = MvTracksEditView.this;
                mvTracksEditView10.f163700D = -1;
                this.f163738e = -1;
                mvTracksEditView10.f163702d.mo17085h0(mvTracksEditView10.f163716u);
                C57140e callback4 = MvTracksEditView.this.getCallback();
                if (callback4 != null) {
                    callback4.mo80688h();
                }
                MvTracksEditView.this.mo80656b();
                MvCreateActionStruct c = MvCreateReportHelper.f163005a.mo80352c();
                c.f156552k = 18;
                c.f156543G = 0;
                c.mo86054n();
            }
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "viewHolder");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView$h */
    public static final class C57144h implements C65581j.C65582a {

        /* renamed from: a */
        public final /* synthetic */ MvTracksEditView f163741a;

        public C57144h(MvTracksEditView mvTracksEditView) {
            this.f163741a = mvTracksEditView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0091  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo80693a(vb2.C65581j r10) {
            /*
                r9 = this;
                java.lang.String r0 = "detector"
                gy3.C87412m.m108594g(r10, r0)
                com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView r0 = r9.f163741a
                boolean r1 = r10.mo89656a()
                r2 = 1
                r3 = 1065353216(0x3f800000, float:1.0)
                r4 = 0
                if (r1 == 0) goto L_0x004a
                boolean r1 = r10.f188717n
                if (r1 == 0) goto L_0x001d
                float r5 = r10.f188707d
                float r6 = r10.f188708e
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 < 0) goto L_0x0027
            L_0x001d:
                if (r1 != 0) goto L_0x0029
                float r1 = r10.f188707d
                float r5 = r10.f188708e
                int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0029
            L_0x0027:
                r1 = 1
                goto L_0x002a
            L_0x0029:
                r1 = 0
            L_0x002a:
                float r5 = r10.f188707d
                float r6 = r10.f188708e
                float r5 = r5 / r6
                float r5 = r3 - r5
                float r5 = java.lang.Math.abs(r5)
                r6 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 * r6
                float r6 = r10.f188708e
                int r10 = r10.f188711h
                float r10 = (float) r10
                int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r10 > 0) goto L_0x0043
                goto L_0x0056
            L_0x0043:
                if (r1 == 0) goto L_0x0047
                float r5 = r5 + r3
                goto L_0x0058
            L_0x0047:
                float r5 = r3 - r5
                goto L_0x0058
            L_0x004a:
                float r1 = r10.f188708e
                r5 = 0
                int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                if (r5 <= 0) goto L_0x0056
                float r10 = r10.f188707d
                float r5 = r10 / r1
                goto L_0x0058
            L_0x0056:
                r5 = 1065353216(0x3f800000, float:1.0)
            L_0x0058:
                vb2.b r10 = r0.f163715t
                float r1 = r10.f188652c
                float r1 = r1 * r5
                r10.f188652c = r1
                long r5 = r10.f188651b
                float r5 = (float) r5
                float r5 = r5 * r1
                int r1 = vb2.C65564b.f188648e
                float r1 = (float) r1
                int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r6 >= 0) goto L_0x0091
                int r5 = r10.f188650a
                int r5 = r5 + r2
                r10.f188650a = r5
                java.util.List<java.lang.Long> r6 = vb2.C65564b.f188647d
                int r7 = r6.size()
                if (r5 < r7) goto L_0x00b3
                int r5 = r6.size()
                int r5 = r5 + -1
                r10.f188650a = r5
                float r1 = r1 * r3
                java.lang.Object r3 = r6.get(r5)
                java.lang.Number r3 = (java.lang.Number) r3
                float r3 = r3.floatValue()
                float r1 = r1 / r3
                r10.f188652c = r1
                goto L_0x00b3
            L_0x0091:
                int r1 = vb2.C65564b.f188649f
                float r1 = (float) r1
                int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r5 <= 0) goto L_0x00b3
                int r5 = r10.f188650a
                int r5 = r5 + -1
                r10.f188650a = r5
                if (r5 >= 0) goto L_0x00b3
                r10.f188650a = r4
                float r1 = r1 * r3
                java.util.List<java.lang.Long> r3 = vb2.C65564b.f188647d
                java.lang.Object r3 = r3.get(r4)
                java.lang.Number r3 = (java.lang.Number) r3
                float r3 = r3.floatValue()
                float r1 = r1 / r3
                r10.f188652c = r1
            L_0x00b3:
                java.util.List<java.lang.Long> r1 = vb2.C65564b.f188647d
                int r1 = r10.f188650a
                java.util.List<java.lang.Long> r3 = vb2.C65564b.f188647d
                java.lang.Object r1 = r3.get(r1)
                java.lang.Number r1 = (java.lang.Number) r1
                long r5 = r1.longValue()
                r10.f188651b = r5
                r0.mo80659e()
                r0.mo80655a()
                long r5 = r0.f163699C
                long r7 = r0.f163698B
                long r5 = r5 - r7
                float r10 = (float) r5
                float r1 = r0.getWidthPerMills()
                float r10 = r10 * r1
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "scale Scroll "
                r1.append(r3)
                long r5 = r0.f163699C
                r1.append(r5)
                java.lang.String r3 = ", "
                r1.append(r3)
                long r5 = r0.f163698B
                r1.append(r5)
                r1.append(r3)
                r1.append(r10)
                java.lang.String r1 = r1.toString()
                java.lang.String r3 = "MicroMsg.MvTracksEditView"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
                androidx.recyclerview.widget.RecyclerView r1 = r0.f163702d
                int r10 = (int) r10
                r1.scrollBy(r10, r4)
                vb2.c r10 = r0.f163716u
                long r3 = r0.f163698B
                r10.f188660n = r3
                vb2.d r10 = r0.f163705g
                r10.notifyDataSetChanged()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView.C57144h.mo80693a(vb2.j):boolean");
        }

        /* renamed from: b */
        public boolean mo80694b(C65581j jVar) {
            C87412m.m108594g(jVar, "detector");
            MvTracksEditView mvTracksEditView = this.f163741a;
            mvTracksEditView.f163714s = true;
            mvTracksEditView.mo80655a();
            MvTracksEditView mvTracksEditView2 = this.f163741a;
            mvTracksEditView2.f163699C = mvTracksEditView2.f163698B;
            return true;
        }

        /* renamed from: c */
        public void mo80695c(C65581j jVar) {
            C87412m.m108594g(jVar, "detector");
            this.f163741a.f163714s = false;
            MvCreateActionStruct c = MvCreateReportHelper.f163005a.mo80352c();
            c.f156552k = 17;
            c.f156543G = 0;
            c.mo86054n();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MvTracksEditView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f163710o = C76577a.m92151b(context, 4);
        C65564b bVar = new C65564b();
        this.f163715t = bVar;
        C65566c cVar = new C65566c(context);
        this.f163716u = cVar;
        C65577g gVar = new C65577g(context);
        this.f163718w = gVar;
        C16665p pVar = new C16665p(new C57142g());
        this.f163721z = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f163700D = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C54712i.f153348a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…yleable.MvTracksEditView)");
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        float f = (float) 48;
        this.f163704f = obtainStyledAttributes.getDimensionPixelSize(2, (int) (getResources().getDisplayMetrics().density * f));
        obtainStyledAttributes.getDimensionPixelSize(1, (int) (getResources().getDisplayMetrics().density * f));
        obtainStyledAttributes.recycle();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3736cp) + ((int) cVar.f188656g);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        this.f163703e = appCompatImageView;
        appCompatImageView.setImageDrawable(drawable);
        appCompatImageView.setVisibility(4);
        appCompatImageView.setElevation((float) getResources().getDimensionPixelSize(C0966R.dimen.f3703bv));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 1);
        layoutParams.topMargin = dimensionPixelSize;
        addView(appCompatImageView, layoutParams);
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        this.f163702d = recyclerView;
        C65567d dVar = new C65567d(new C57135a(this), this);
        this.f163705g = dVar;
        recyclerView.setAdapter(dVar);
        recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        recyclerView.setPadding(0, dimensionPixelSize, 0, 0);
        addView(recyclerView, new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C0966R.dimen.f3755d6) + dimensionPixelSize, 16));
        cVar.f188662p = bVar;
        recyclerView.mo17085h0(cVar);
        pVar.mo17527j(recyclerView);
        recyclerView.mo17085h0(new C57137b(this));
        recyclerView.mo17085h0(gVar);
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        setClipToPadding(false);
        setClipChildren(false);
        C65581j jVar = new C65581j(context, new C57144h(this));
        recyclerView.mo17043c(new C57138c(this));
        recyclerView.mo17092j0(new C57139d(this, jVar));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        this.f163717v = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    /* renamed from: a */
    public final long mo80655a() {
        long j;
        double width;
        float widthPerMills;
        long j2 = 0;
        if (this.f163702d.getChildCount() == 0) {
            return 0;
        }
        View view = null;
        int childCount = this.f163702d.getChildCount();
        boolean z = false;
        int i = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            view = this.f163702d.getChildAt(i2);
            i = this.f163702d.mo17029N0(view);
            if (i != -1) {
                break;
            }
        }
        if (view == null || i == -1) {
            Log.m105924i("MicroMsg.MvTracksEditView", "computeProgress: not find view position");
            return this.f163698B;
        }
        int itemViewType = this.f163717v.getItemViewType(view);
        float widthPerMills2 = ((float) (-view.getLeft())) / getWidthPerMills();
        if (itemViewType != 1) {
            if (itemViewType == 2) {
                this.f163705g.getClass();
                int i3 = i - 1;
                if (i3 >= 0 && i3 < getTracks().size()) {
                    z = true;
                }
                if (z) {
                    j = getTracks().get(i3).f187130j;
                    width = ((double) getWidth()) / 2.0d;
                    widthPerMills = getWidthPerMills();
                } else {
                    Log.m105924i("MicroMsg.MvTracksEditView", "not find view " + i + ' ' + i3);
                    return this.f163698B;
                }
            } else if (itemViewType == 4) {
                j = this.f163720y;
                width = ((double) getWidth()) / 2.0d;
                widthPerMills = getWidthPerMills();
            }
            j2 = j + ((long) (width / ((double) widthPerMills)));
        }
        long j3 = (long) (((float) j2) + widthPerMills2);
        this.f163698B = j3;
        return j3;
    }

    /* renamed from: b */
    public final void mo80656b() {
        long j;
        long j2 = 0;
        for (C65003a aVar : this.f163708j) {
            aVar.f187130j = j2;
            long j3 = aVar.f187125e;
            long j4 = aVar.f187124d;
            long j5 = this.f163719x;
            if ((j3 - j4) + j2 < j5) {
                j = j3 - j4;
            } else {
                j = C61595o.m72298f(j5 - j2, 0, j3 - j4);
                aVar.f187125e = aVar.f187124d + j;
            }
            j2 += j;
        }
        this.f163720y = j2;
        this.f163718w.f188696s = j2 < this.f163719x;
        Log.m105924i("MicroMsg.MvTracksEditView", "computeTracksDuration: " + this.f163720y + ", timeHelper:" + this.f163715t.f188651b + ", " + this.f163715t.f188652c);
    }

    /* renamed from: c */
    public final void mo80657c(int i, boolean z) {
        Log.m105924i("MicroMsg.MvTracksEditView", "setTransitionStatus: index=" + i + ", enabled=" + z);
        if (z && !this.f163718w.f188694q.contains(Integer.valueOf(i))) {
            this.f163718w.f188694q.add(Integer.valueOf(i));
        } else if (!z) {
            this.f163718w.f188694q.remove(Integer.valueOf(i));
        }
    }

    /* renamed from: d */
    public final void mo80658d(int i, long j, long j2, boolean z) {
        Log.m105924i("MicroMsg.MvTracksEditView", "updateTrack: index=" + i + ", startTime=" + j + ", endTime=" + j2);
        C65003a aVar = getTracks().get(i);
        aVar.f187124d = j;
        aVar.f187125e = j2;
        mo80656b();
        this.f163702d.mo17035V0();
        if (z) {
            C65567d dVar = this.f163705g;
            dVar.getClass();
            dVar.notifyItemChanged(i + 1);
        }
    }

    /* renamed from: e */
    public final void mo80659e() {
        for (C65003a aVar : this.f163708j) {
            float b = aVar.mo88219b() * (((float) aVar.f187121a) / getWidthPerMills());
            aVar.f187126f = ((float) aVar.mo88221d()) / b;
            int b2 = C60641c.m70921b((float) Math.ceil((double) ((((float) aVar.mo88221d()) / aVar.mo88219b()) / (((float) aVar.f187121a) / getWidthPerMills()))));
            aVar.f187127g.clear();
            LinkedList<C65004e> linkedList = aVar.f187127g;
            C61594j i = C61595o.m72301i(0, b2);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(i, 10));
            Iterator it = i.iterator();
            while (it.hasNext()) {
                int a = ((C36904l0) it).mo59695a();
                C65004e eVar = new C65004e();
                eVar.f187134a = (long) (((float) a) * b);
                arrayList.add(eVar);
            }
            linkedList.addAll(arrayList);
        }
    }

    public final C57140e getCallback() {
        return this.f163697A;
    }

    public int getDraggingIndex() {
        return this.f163707i;
    }

    public final long getFillingDuration() {
        return Math.max(this.f163719x - this.f163720y, 0);
    }

    public int getFillingWidth() {
        return Math.max((int) (((float) getFillingDuration()) * getWidthPerMills()), 0);
    }

    public int getSelectedIndex() {
        return this.f163706h;
    }

    public int getSpaceSize() {
        return this.f163710o;
    }

    public C63380a getThumbLoader() {
        return this.f163709n;
    }

    public List<C65003a> getTracks() {
        return this.f163708j;
    }

    public final long getVideoProgress() {
        return this.f163701E;
    }

    public float getWidthPerMills() {
        return this.f163715t.f188652c;
    }

    public final void setCallback(C57140e eVar) {
        this.f163697A = eVar;
    }

    public void setDraggingIndex(int i) {
        this.f163707i = i;
    }

    public void setSelectedIndex(int i) {
        this.f163706h = i;
    }

    public void setThumbLoader(C63380a aVar) {
        this.f163709n = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setVideoProgress(long r7) {
        /*
            r6 = this;
            r6.f163701E = r7
            androidx.recyclerview.widget.RecyclerView r0 = r6.f163702d
            int r0 = r0.getScrollState()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0044
            boolean r0 = r6.f163714s
            if (r0 != 0) goto L_0x002a
            int r0 = r6.getDraggingIndex()
            if (r0 == r1) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 != 0) goto L_0x002a
            int r0 = r6.getSelectedIndex()
            if (r0 == r1) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 != 0) goto L_0x0044
            long r4 = r6.mo80655a()
            long r4 = r7 - r4
            float r0 = (float) r4
            float r4 = r6.getWidthPerMills()
            float r0 = r0 * r4
            androidx.recyclerview.widget.RecyclerView r4 = r6.f163702d
            int r0 = (int) r0
            r4.scrollBy(r0, r3)
            vb2.c r0 = r6.f163716u
            r0.f188660n = r7
        L_0x0044:
            int r7 = r6.getSelectedIndex()
            if (r7 == r1) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r2 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x005d
            vb2.d r7 = r6.f163705g
            fy3.l<? super java.lang.Long, rx3.b0> r7 = r7.f188665f
            if (r7 == 0) goto L_0x005d
            long r0 = r6.f163701E
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            r7.invoke(r8)
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvTracksEditView.setVideoProgress(long):void");
    }
}
