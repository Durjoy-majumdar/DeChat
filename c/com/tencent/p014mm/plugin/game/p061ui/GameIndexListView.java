package com.tencent.p014mm.plugin.game.p061ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.plugin.game.model.C42043c;
import com.tencent.p014mm.plugin.game.model.C42056f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import py1.C47552b4;
import py1.C47589h;
import py1.C47626m1;
import py1.C47639o0;
import py1.C47661r1;
import py1.C47693w0;
import py1.C47700x1;
import ry1.C48119g0;
import uy1.C52644e;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.game.ui.GameIndexListView */
public class GameIndexListView extends LoadMoreRecyclerView implements C111847h {

    /* renamed from: Q1 */
    public static int f113943Q1 = 0;

    /* renamed from: R1 */
    public static boolean f113944R1 = true;

    /* renamed from: S1 */
    public static int f113945S1;

    /* renamed from: T1 */
    public static int f113946T1;

    /* renamed from: U1 */
    public static boolean f113947U1;

    /* renamed from: F1 */
    public Context f113948F1;

    /* renamed from: G1 */
    public C42199c f113949G1;

    /* renamed from: H1 */
    public C47700x1 f113950H1;

    /* renamed from: I1 */
    public boolean f113951I1 = true;

    /* renamed from: J1 */
    public Scroller f113952J1;

    /* renamed from: K1 */
    public ImageView f113953K1;

    /* renamed from: L1 */
    public ImageView f113954L1;

    /* renamed from: M1 */
    public View f113955M1;

    /* renamed from: N1 */
    public float f113956N1;

    /* renamed from: O1 */
    public int f113957O1;

    /* renamed from: P1 */
    public boolean f113958P1;

    /* renamed from: com.tencent.mm.plugin.game.ui.GameIndexListView$b */
    public class C4567b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final Drawable f19312d;

        /* renamed from: e */
        public int f19313e;

        public C4567b(GameIndexListView gameIndexListView, Resources resources, int i) {
            this.f19312d = new ColorDrawable(resources.getColor(i));
            this.f19313e = resources.getDimensionPixelSize(C0966R.dimen.f3840gd);
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            rect.set(0, 0, 0, this.f19313e);
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount - 1; i++) {
                View childAt = recyclerView.getChildAt(i);
                View childAt2 = ((ViewGroup) childAt).getChildAt(0);
                if (!(childAt2 instanceof GameBestSellingItemView) && !(childAt2 instanceof GameBestSellingTitle) && !(childAt2 instanceof GameFeedModuleTitle)) {
                    int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    this.f19312d.setBounds(paddingLeft, bottom, width, this.f19313e + bottom);
                    this.f19312d.draw(canvas);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameIndexListView$a */
    public class C42198a implements l0$$e {
        public C42198a() {
        }

        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            LinkedList linkedList;
            C47589h hVar;
            C47589h hVar2;
            Log.m105925i("MicroMsg.GameIndexListView", "doCgi, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                GameIndexListView gameIndexListView = GameIndexListView.this;
                C47700x1 x1Var = (C47700x1) cVar.f127056b.f127083a;
                gameIndexListView.f113950H1 = x1Var;
                boolean z = gameIndexListView.f113951I1;
                if (x1Var == null || Util.isNullOrNil((List) x1Var.f128134d)) {
                    linkedList = null;
                } else {
                    linkedList = new LinkedList();
                    if (z && !Util.isNullOrNil(x1Var.f128137g)) {
                        C42043c cVar2 = new C42043c();
                        cVar2.f113279a = 2000;
                        cVar2.f113281c = x1Var.f128137g;
                        linkedList.add(cVar2);
                    }
                    Iterator<C47693w0> it = x1Var.f128134d.iterator();
                    while (it.hasNext()) {
                        C47693w0 next = it.next();
                        if (next.f128094d == 7) {
                            C47626m1 m1Var = next.f128105r;
                            if (m1Var != null && !Util.isNullOrNil((List) m1Var.f127865d)) {
                                if (!Util.isNullOrNil(next.f128105r.f127866e)) {
                                    C42043c cVar3 = new C42043c();
                                    cVar3.f113282d = next;
                                    cVar3.f113279a = 1000;
                                    linkedList.add(cVar3);
                                }
                                Iterator<C47639o0> it4 = next.f128105r.f127865d.iterator();
                                while (it4.hasNext()) {
                                    C42043c cVar4 = new C42043c();
                                    cVar4.f113282d = next;
                                    cVar4.f113279a = 1001;
                                    cVar4.f113283e = next.f128105r.f127865d.indexOf(it4.next());
                                    linkedList.add(cVar4);
                                }
                                C42043c cVar5 = new C42043c();
                                cVar5.f113282d = next;
                                cVar5.f113279a = 1002;
                                linkedList.add(cVar5);
                            }
                        } else {
                            C42043c cVar6 = new C42043c();
                            cVar6.f113279a = next.f128094d;
                            cVar6.f113280b = next.f128095e;
                            cVar6.f113282d = next;
                            linkedList.add(cVar6);
                        }
                    }
                }
                GameIndexListView gameIndexListView2 = GameIndexListView.this;
                gameIndexListView2.f113951I1 = false;
                C47700x1 x1Var2 = gameIndexListView2.f113950H1;
                if (x1Var2 != null && !Util.isNullOrNil((List) x1Var2.f128134d)) {
                    Iterator<C47693w0> it5 = x1Var2.f128134d.iterator();
                    while (it5.hasNext()) {
                        C47693w0 next2 = it5.next();
                        C47661r1 r1Var = next2.f128103p;
                        if (r1Var == null || (hVar2 = r1Var.f127970o) == null) {
                            C47626m1 m1Var2 = next2.f128105r;
                            if (m1Var2 == null || Util.isNullOrNil((List) m1Var2.f127865d)) {
                                C47552b4 b4Var = next2.f128104q;
                                if (!(b4Var == null || (hVar = b4Var.f127603i) == null)) {
                                    C52644e.m59021b(C42056f0.m45762a(hVar));
                                }
                            } else {
                                Iterator<C47639o0> it6 = next2.f128105r.f127865d.iterator();
                                while (it6.hasNext()) {
                                    C52644e.m59021b(C42056f0.m45762a(it6.next().f127896d));
                                }
                            }
                        } else {
                            C52644e.m59021b(C42056f0.m45762a(hVar2));
                        }
                    }
                }
                GameIndexListView gameIndexListView3 = GameIndexListView.this;
                if (!gameIndexListView3.f113950H1.f128136f) {
                    gameIndexListView3.mo63430I(false);
                }
                if (!Util.isNullOrNil((List) linkedList)) {
                    C42199c cVar7 = GameIndexListView.this.f113949G1;
                    cVar7.f113960d.addAll(linkedList);
                    cVar7.notifyDataSetChanged();
                }
            }
            return 0;
        }
    }

    /* renamed from: com.tencent.mm.plugin.game.ui.GameIndexListView$c */
    public class C42199c extends RecyclerView.C16613e<C42200a> {

        /* renamed from: d */
        public LinkedList<C42043c> f113960d = new LinkedList<>();

        /* renamed from: com.tencent.mm.plugin.game.ui.GameIndexListView$c$a */
        public class C42200a extends RecyclerView.C16631z {

            /* renamed from: z */
            public View f113962z;

            public C42200a(C42199c cVar, View view) {
                super(view);
                this.f113962z = ((ViewGroup) view).getChildAt(0);
            }
        }

        public C42199c() {
        }

        public int getItemCount() {
            return this.f113960d.size();
        }

        public int getItemViewType(int i) {
            return this.f113960d.get(i).f113279a;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C42200a aVar = (C42200a) zVar;
            Log.m105919d("MicroMsg.GameIndexListView", "onBindViewHolder， position = %d", Integer.valueOf(i));
            C42043c cVar = this.f113960d.get(i);
            if (cVar != null) {
                int i2 = cVar.f113279a;
                if (i2 != 2000) {
                    switch (i2) {
                        case 1:
                            ((GameFeedImageTextView) aVar.f113962z).setData(cVar);
                            return;
                        case 2:
                            ((GameFeedVideoView) aVar.f113962z).setVideoData(cVar);
                            return;
                        case 3:
                            ((GameFeedVideoView) aVar.f113962z).setLiveData(cVar);
                            return;
                        case 4:
                            ((GameFeedMatchView) aVar.f113962z).setData(cVar);
                            return;
                        case 5:
                            ((GameFeedGameTemplateView) aVar.f113962z).setData(cVar);
                            return;
                        case 6:
                            ((GameFeedNoGamePlayTemplate) aVar.f113962z).setData(cVar);
                            return;
                        default:
                            switch (i2) {
                                case 8:
                                    ((GameFeedAddTopicView) aVar.f113962z).setData(cVar);
                                    return;
                                case 9:
                                    ((GameFeedMoreGameEntranceView) aVar.f113962z).setData(cVar);
                                    return;
                                case 10:
                                    ((GameFeedQipaiView) aVar.f113962z).setData(cVar);
                                    return;
                                default:
                                    switch (i2) {
                                        case 1000:
                                            ((GameBestSellingTitle) aVar.f113962z).setText(cVar.f113282d.f128105r.f127866e);
                                            return;
                                        case 1001:
                                            ((GameBestSellingItemView) aVar.f113962z).setData(cVar);
                                            return;
                                        case 1002:
                                            ((GameBestSellingMore) aVar.f113962z).setData(cVar);
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
                } else {
                    ((GameFeedModuleTitle) aVar.f113962z).setData(cVar);
                }
            }
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Log.m105918d("MicroMsg.GameIndexListView", "onCreateViewHolder, viewType = " + i);
            if (i != 2000) {
                switch (i) {
                    case 1:
                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.f359808aw1, viewGroup, false);
                        break;
                    case 2:
                    case 3:
                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.aw_, viewGroup, false);
                        break;
                    case 4:
                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.f359810aw3, viewGroup, false);
                        break;
                    case 5:
                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.f359807aw0, viewGroup, false);
                        break;
                    case 6:
                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.aw6, viewGroup, false);
                        break;
                    default:
                        switch (i) {
                            case 8:
                                view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.avz, viewGroup, false);
                                break;
                            case 9:
                                view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.aw5, viewGroup, false);
                                break;
                            case 10:
                                view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.aw7, viewGroup, false);
                                break;
                            default:
                                switch (i) {
                                    case 1000:
                                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.auf, viewGroup, false);
                                        break;
                                    case 1001:
                                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.aud, viewGroup, false);
                                        break;
                                    case 1002:
                                        view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.aue, viewGroup, false);
                                        break;
                                    default:
                                        view = new FrameLayout(GameIndexListView.this.getContext());
                                        break;
                                }
                        }
                }
            } else {
                view = LayoutInflater.from(GameIndexListView.this.f113948F1).inflate(C0966R.C0971layout.aw4, viewGroup, false);
            }
            return new C42200a(this, view);
        }
    }

    public GameIndexListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113948F1 = context;
    }

    public static int getSourceScene() {
        return f113943Q1;
    }

    public static void setCanPulldown(boolean z) {
        f113947U1 = z;
    }

    public static void setDefaultPadding(int i) {
        f113945S1 = i;
    }

    public static void setInitPadding(int i) {
        f113946T1 = i;
        f113944R1 = true;
    }

    public static void setSourceScene(int i) {
        f113943Q1 = i;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66211C1() {
        /*
            r6 = this;
            ob0.c$b r0 = new ob0.c$b
            r0.<init>()
            py1.w1 r1 = new py1.w1
            r1.<init>()
            py1.x1 r2 = r6.f113950H1
            r3 = 0
            if (r2 == 0) goto L_0x0012
            pe3.b r2 = r2.f128135e
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r1.f128111d = r2
            r0.f127066a = r1
            py1.x1 r1 = new py1.x1
            r1.<init>()
            r0.f127067b = r1
            java.lang.String r1 = "/cgi-bin/mmgame-bin/getgameindex4feedslist"
            r0.f127068c = r1
            r1 = 2943(0xb7f, float:4.124E-42)
            r0.f127069d = r1
            r1 = 0
            r0.f127070e = r1
            r0.f127071f = r1
            ob0.c r0 = r0.mo72403a()
            com.tencent.mm.plugin.game.ui.GameIndexListView$a r2 = new com.tencent.mm.plugin.game.ui.GameIndexListView$a
            r2.<init>()
            android.content.Context r4 = r6.f113948F1
            boolean r5 = r4 instanceof jp3.C9487b
            if (r5 == 0) goto L_0x003d
            r3 = r4
            jp3.b r3 = (jp3.C9487b) r3
        L_0x003d:
            ob0.C89144l0.m111430f(r0, r2, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.p061ui.GameIndexListView.mo66211C1():void");
    }

    public void computeScroll() {
        if (this.f113955M1 != null && this.f113952J1.computeScrollOffset()) {
            int currY = this.f113952J1.getCurrY();
            Log.m105918d("MicroMsg.GameIndexListView", "computeScroll, currY = " + currY);
            this.f113955M1.setPadding(0, currY, 0, 0);
            int i = f113945S1;
            int i2 = (int) ((((float) (i - currY)) / ((float) i)) * 255.0f);
            this.f113954L1.setAlpha(255 - i2);
            this.f113953K1.setAlpha(i2);
            invalidate();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View view;
        if (!f113947U1 || this.f113955M1 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            this.f113958P1 = false;
            this.f113956N1 = motionEvent.getRawY();
        } else if (action == 2) {
            if (((LinearLayoutManager) getLayoutManager()).mo16957C() == 0 && (view = this.f113955M1) != null && view.getTop() == 0) {
                z = true;
            }
            if (z) {
                if (this.f113958P1) {
                    return true;
                }
                int rawY = (int) (motionEvent.getRawY() - this.f113956N1);
                if (this.f113955M1.getPaddingTop() <= f113945S1 + this.f113957O1) {
                    if (rawY > 0 && Math.abs(rawY) >= this.f113957O1) {
                        this.f113958P1 = true;
                        this.f113952J1.startScroll(0, this.f113955M1.getPaddingTop(), 0, -this.f113955M1.getPaddingTop(), 500);
                        this.f113953K1.setClickable(true);
                        invalidate();
                        motionEvent.setAction(3);
                        super.dispatchTouchEvent(motionEvent);
                        return true;
                    }
                } else if (this.f113955M1.getPaddingTop() >= (-this.f113957O1) && rawY < 0 && Math.abs(rawY) >= this.f113957O1) {
                    this.f113958P1 = true;
                    this.f113952J1.startScroll(0, 0, 0, f113945S1, 500);
                    invalidate();
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Log.m105918d("MicroMsg.GameIndexListView", "onFinishInflate");
        this.f113957O1 = ViewConfiguration.get(this.f113948F1).getScaledTouchSlop();
        this.f113952J1 = new Scroller(this.f113948F1);
        setLayoutManager(new LinearLayoutManager(getContext()));
        C42199c cVar = new C42199c();
        this.f113949G1 = cVar;
        setAdapter(cVar);
        mo17085h0(new C4567b(this, getResources(), C0966R.color.f3501vh));
        setLoadingView((int) C0966R.C0971layout.f359809aw2);
        setOnLoadingStateChangedListener(new C48119g0(this));
        mo63430I(true);
        mo66211C1();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105918d("MicroMsg.GameIndexListView", "onLayout, changed = " + z);
        super.onLayout(z, i, i2, i3, i4);
        if (f113944R1 || this.f113955M1 == null || this.f113954L1 == null || this.f113953K1 == null) {
            View childAt = getChildAt(0);
            this.f113955M1 = childAt;
            if (childAt != null) {
                childAt.setPadding(0, f113946T1, 0, 0);
                this.f113954L1 = (ImageView) this.f113955M1.findViewById(C0966R.C0970id.jna);
                this.f113953K1 = (ImageView) this.f113955M1.findViewById(C0966R.C0970id.a8y);
            }
            f113944R1 = false;
        }
    }
}
