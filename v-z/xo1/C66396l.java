package xo1;

import ak1.C0047e0;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import bp1.C54519d;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.xweb.file.XVFSFile;
import d60.C58124b;
import di3.C86312j;
import gh1.C59453p;
import gh1.C8313a;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l60.C99344b;
import org.json.JSONObject;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import sx3.C64186f0;
import te3.C64338e71;
import te3.C64662qp2;
import up1.C27696y;
import y50.C15936n0;

/* renamed from: xo1.l */
public final class C66396l extends C8313a implements View.OnTouchListener {

    /* renamed from: j */
    public C59453p f191131j;

    /* renamed from: n */
    public ViewGroup f191132n;

    /* renamed from: o */
    public RecyclerView f191133o;

    /* renamed from: p */
    public View f191134p;

    /* renamed from: q */
    public float f191135q;

    /* renamed from: r */
    public long f191136r;

    /* renamed from: xo1.l$a */
    public final class C66397a extends RecyclerView.C16613e<C66398a> {

        /* renamed from: xo1.l$a$a */
        public final class C66398a extends RecyclerView.C16631z {

            /* renamed from: A */
            public final View f191138A;

            /* renamed from: B */
            public final TextView f191139B;

            /* renamed from: C */
            public final ImageView f191140C;

            /* renamed from: D */
            public final TextView f191141D;

            /* renamed from: E */
            public final /* synthetic */ C66397a f191142E;

            /* renamed from: z */
            public final View f191143z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66398a(C66397a aVar, View view) {
                super(view);
                C87412m.m108594g(view, "itemView");
                this.f191142E = aVar;
                this.f191143z = view;
                this.f191138A = view.findViewById(C0966R.C0970id.f359374ob1);
                this.f191139B = (TextView) view.findViewById(C0966R.C0970id.o9z);
                this.f191140C = (ImageView) view.findViewById(C0966R.C0970id.o84);
                this.f191141D = (TextView) view.findViewById(C0966R.C0970id.f358320o83);
            }
        }

        public C66397a() {
        }

        /* renamed from: F4 */
        public final List<C64662qp2> mo90496F4() {
            LinkedList<C64662qp2> linkedList;
            C64338e71 e712 = ((C55001u) C66396l.this.business(C55001u.class)).f154420q.f182388Z;
            if (e712 == null || (linkedList = e712.f182935n) == null) {
                return C64186f0.f181907d;
            }
            C66396l lVar = C66396l.this;
            ArrayList arrayList = new ArrayList();
            for (T next : linkedList) {
                if (((C64662qp2) next).f185060d <= ((C54519d) lVar.business(C54519d.class)).mo75375i3()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public int getItemCount() {
            return mo90496F4().size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C66398a aVar = (C66398a) zVar;
            C87412m.m108594g(aVar, "holder");
            C64662qp2 qp22 = mo90496F4().get(i);
            C87412m.m108594g(qp22, "fragment");
            TextView textView = aVar.f191139B;
            int i2 = qp22.f185060d;
            textView.setText(i2 >= 3600 ? C15936n0.C15937a.m14866a(C15936n0.f42815a, i2, XVFSFile.PATH_SEPARATOR, true, false, false, 24, (Object) null) : C15936n0.C15937a.m14866a(C15936n0.f42815a, i2, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null));
            aVar.f191141D.setText(qp22.f185061e);
            aVar.f191140C.setOnClickListener(new C66393i(C66396l.this, qp22));
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(qp22.f185062f, C27696y.THUMB_IMAGE));
            C66395k kVar = new C66395k(aVar);
            a.getClass();
            a.f291320d = kVar;
            a.mo85951a();
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.f360073d90, viewGroup, false);
            C87412m.m108593f(inflate, "itemView");
            return new C66398a(this, inflate);
        }
    }

    /* renamed from: xo1.l$b */
    public static final class C66399b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C66396l f191144a;

        public C66399b(C66396l lVar) {
            this.f191144a = lVar;
        }

        public void onAnimationEnd(Animation animation) {
            C59453p pVar = this.f191144a.f191131j;
            if (pVar != null) {
                pVar.mo84560c(8);
            }
            C66396l lVar = this.f191144a;
            lVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
            ((C54991o) lVar.business(C54991o.class)).f154286Z = false;
            lVar.mo9313k3(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: xo1.l$c */
    public static final class C66400c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66396l f191145d;

        public C66400c(C66396l lVar) {
            this.f191145d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f191145d.mo90493m3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xo1.l$d */
    public static final class C66401d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C66396l f191146d;

        public C66401d(C66396l lVar) {
            this.f191146d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f191146d.mo90493m3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66396l(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo90493m3() {
        ViewGroup viewGroup = this.f191132n;
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, viewGroup != null ? (float) viewGroup.getHeight() : 0.0f);
        translateAnimation.setDuration(200);
        translateAnimation.setFillAfter(false);
        translateAnimation.setAnimationListener(new C66399b(this));
        ViewGroup viewGroup2 = this.f191132n;
        if (viewGroup2 != null) {
            viewGroup2.startAnimation(translateAnimation);
        }
    }

    /* renamed from: n3 */
    public final void mo90494n3() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
        ((C54991o) business(C54991o.class)).f154286Z = true;
        mo9313k3(C58124b.C58125b.FINDER_LIVE_CLEAR_SCREEN, bundle);
        C59453p pVar = this.f191131j;
        if (pVar != null) {
            pVar.mo84560c(0);
        }
        ViewGroup viewGroup = this.f191132n;
        if (viewGroup != null) {
            viewGroup.measure(0, 0);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) viewGroup.getMeasuredHeight(), 0.0f);
            translateAnimation.setDuration(200);
            translateAnimation.setFillAfter(true);
            viewGroup.startAnimation(translateAnimation);
        }
        C64338e71 e712 = ((C55001u) business(C55001u.class)).f154420q.f182388Z;
        Iterable<C64662qp2> iterable = e712 != null ? e712.f182935n : null;
        if (iterable == null) {
            iterable = C64186f0.f181907d;
        }
        JSONObject b = C0047e0.m34b(C0047e0.f58a, (JSONObject) null, 1, (Object) null);
        b.put("wonderful_list_type", 1);
        for (C64662qp2 qp22 : iterable) {
            String jSONObject = b.toString();
            C87412m.m108593f(jSONObject, "params.toString()");
            ((C8777j5) C86312j.m106911c(C8777j5.class)).hg0("watch_live_wonderful_list_exp", jSONObject);
        }
    }

    public void onLiveActivate() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r0 != 3) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r10)
            r0.add(r11)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r9
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "v"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r11, r0)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0084
            r3 = 0
            if (r0 == r2) goto L_0x0064
            r4 = 2
            if (r0 == r4) goto L_0x003b
            r11 = 3
            if (r0 == r11) goto L_0x0064
            goto L_0x009f
        L_0x003b:
            android.view.ViewGroup r10 = r9.f191132n
            if (r10 == 0) goto L_0x0046
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L_0x0046
            r3 = 1
        L_0x0046:
            if (r3 != 0) goto L_0x009f
            float r10 = r9.f191135q
            float r11 = r11.getY()
            float r10 = r10 - r11
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r11)
            int r11 = r11.getScaledTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x009f
            r9.mo90494n3()
            goto L_0x009f
        L_0x0064:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r9.f191136r
            long r4 = r4 - r6
            int r11 = android.view.ViewConfiguration.getTapTimeout()
            long r6 = (long) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x0077
            r9.mo90493m3()
        L_0x0077:
            boolean r11 = r10 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x007e
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x007e:
            if (r1 == 0) goto L_0x009f
            r1.requestDisallowInterceptTouchEvent(r3)
            goto L_0x009f
        L_0x0084:
            r11.getX()
            float r11 = r11.getY()
            r9.f191135q = r11
            long r3 = java.lang.System.currentTimeMillis()
            r9.f191136r = r3
            boolean r11 = r10 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x009a
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L_0x009a:
            if (r1 == 0) goto L_0x009f
            r1.requestDisallowInterceptTouchEvent(r2)
        L_0x009f:
            r3 = 1
            java.lang.String r5 = "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r9
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xo1.C66396l.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        super.onViewMount(viewGroup);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.o7h);
        C87412m.m108593f(viewGroup2, "rootView");
        this.f191131j = new C59453p(viewGroup2, this);
        viewGroup2.setOnClickListener(new C66400c(this));
        this.f191134p = viewGroup2.findViewById(C0966R.C0970id.o8l);
        this.f191133o = (RecyclerView) viewGroup2.findViewById(C0966R.C0970id.obe);
        this.f191132n = (ViewGroup) viewGroup2.findViewById(C0966R.C0970id.obf);
        View view = this.f191134p;
        if (view != null) {
            view.setOnClickListener(new C66401d(this));
        }
        RecyclerView recyclerView = this.f191133o;
        if (recyclerView != null) {
            recyclerView.setAdapter(new C66397a());
            recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup2.getContext(), 0, false));
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        C59453p pVar = this.f191131j;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
        this.f191132n = null;
        this.f191133o = null;
        this.f191134p = null;
    }
}
