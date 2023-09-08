package bt1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.feature.sight.api.ISightJNIService;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.ViewAnimHelper;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kq1.C61136e;
import l31.C61212e;
import p232rw.C63679m;
import p599lr.C61381b;
import p707tz.C65000f;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C110823p;
import sx3.C64197v;
import sx3.C90364q0;
import te3.C48889bp1;
import te3.C51538uf1;
import te3.C64477jr2;
import te3.C64591nr3;
import te3.C64636pq2;
import te3.C64689rq2;
import te3.C64825xb1;
import te3.C64839xt2;
import te3.C64899zy;
import te3.hi4;
import te3.zr4;
import uq1.C65449m;

/* renamed from: bt1.t */
public class C54585t extends C54556b {

    /* renamed from: A */
    public long f153045A;

    /* renamed from: B */
    public final C54559c f153046B = new C54559c();

    /* renamed from: C */
    public C64477jr2 f153047C;

    /* renamed from: D */
    public String f153048D = "";

    /* renamed from: e */
    public View f153049e;

    /* renamed from: f */
    public ImageView f153050f;

    /* renamed from: g */
    public ImageView f153051g;

    /* renamed from: h */
    public View f153052h;

    /* renamed from: i */
    public View f153053i;

    /* renamed from: j */
    public View f153054j;

    /* renamed from: k */
    public View f153055k;

    /* renamed from: l */
    public View f153056l;

    /* renamed from: m */
    public ArrayList<String> f153057m;

    /* renamed from: n */
    public ArrayList<String> f153058n = new ArrayList<>();

    /* renamed from: o */
    public ArrayList<C64477jr2> f153059o = new ArrayList<>();

    /* renamed from: p */
    public C64899zy f153060p;

    /* renamed from: q */
    public C64839xt2 f153061q;

    /* renamed from: r */
    public String f153062r = "";

    /* renamed from: s */
    public String f153063s = "";

    /* renamed from: t */
    public int f153064t;

    /* renamed from: u */
    public boolean f153065u;

    /* renamed from: v */
    public String f153066v = "";

    /* renamed from: w */
    public Rect f153067w;

    /* renamed from: x */
    public int f153068x = -1;

    /* renamed from: y */
    public C64591nr3 f153069y;

    /* renamed from: z */
    public final LinkedList<Integer> f153070z = new LinkedList<>();

    /* renamed from: bt1.t$a */
    public static final class C54586a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54585t f153071d;

        public C54586a(C54585t tVar) {
            this.f153071d = tVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((PostMainUIC) C39818r.f106831a.mo62443b(this.f153071d.f152933a).mo75002a(PostMainUIC.class)).mo78427i3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: bt1.t$b */
    public static final class C54587b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54585t f153072d;

        /* renamed from: e */
        public final /* synthetic */ LinkedList<C64689rq2> f153073e;

        public C54587b(C54585t tVar, LinkedList<C64689rq2> linkedList) {
            this.f153072d = tVar;
            this.f153073e = linkedList;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C54585t tVar = this.f153072d;
            LinkedList<C64689rq2> linkedList = this.f153073e;
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            tVar.mo75484p(linkedList);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget$refresh$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54585t(Context context) {
        super(context);
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: j */
    public static final C94554a m61347j(C54585t tVar, String str) {
        tVar.getClass();
        C94554a v0 = C58784w3.f168295a.mo83971v0(str);
        tVar.f153070z.add(Integer.valueOf(v0 != null ? v0.f273444b : 0));
        tVar.f153045A += v0 != null ? (long) v0.f273443a : 0;
        return v0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0223  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bt1.C54590w mo75451a() {
        /*
            r13 = this;
            bt1.e r0 = r13.mo75441e()
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r0.f152943A
            bl3.r r1 = bl3.C39818r.f106831a
            android.content.Context r2 = r13.f152933a
            bl3.r$a r2 = r1.mo62443b(r2)
            java.lang.Class<ao1.m1> r3 = ao1.C54270m1.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(context).…(SdkShareUIC::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            ao1.m1 r2 = (ao1.C54270m1) r2
            android.content.Context r3 = r13.f152933a
            bl3.r$a r1 = r1.mo62443b(r3)
            java.lang.Class<kq1.l> r3 = kq1.C61137l.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r3)
            kq1.l r1 = (kq1.C61137l) r1
            int r8 = r1.f174051e
            if (r0 == 0) goto L_0x004d
            bt1.e r1 = r13.mo75441e()
            java.util.LinkedList<te3.rq2> r1 = r1.f152958P
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
            if (r1 != 0) goto L_0x004d
            bt1.w r1 = new bt1.w
            r4 = 1
            int r5 = r0.getMediaType()
            r6 = 0
            java.lang.String r7 = r13.f153048D
            r9 = 0
            r10 = 0
            r11 = 96
            r12 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        L_0x004d:
            java.util.LinkedList<te3.rq2> r1 = r2.f152325p
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0075
            te3.pq2 r6 = new te3.pq2
            r6.<init>()
            java.util.LinkedList<te3.rq2> r0 = r6.f184875d
            java.util.LinkedList<te3.rq2> r1 = r2.f152325p
            r0.addAll(r1)
            r6.f184884p = r3
            bt1.w r0 = new bt1.w
            r4 = 1
            r5 = 4
            r9 = 0
            r10 = 0
            r11 = 96
            r12 = 0
            java.lang.String r7 = ""
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0075:
            te3.pq2 r6 = new te3.pq2
            r6.<init>()
            android.os.Bundle r1 = r13.f152934b
            r2 = 0
            if (r1 == 0) goto L_0x0086
            java.lang.String r4 = "ORIGIN_MUSIC_ID"
            java.lang.String r1 = r1.getString(r4)
            goto L_0x0087
        L_0x0086:
            r1 = r2
        L_0x0087:
            r6.f184877f = r1
            android.os.Bundle r1 = r13.f152934b
            if (r1 == 0) goto L_0x0094
            java.lang.String r4 = "ORIGIN_MUSIC_PATH"
            java.lang.String r1 = r1.getString(r4)
            goto L_0x0095
        L_0x0094:
            r1 = r2
        L_0x0095:
            r6.f184878g = r1
            android.os.Bundle r1 = r13.f152934b
            if (r1 == 0) goto L_0x00a2
            java.lang.String r4 = "ORIGIN_BGM_URL"
            java.lang.String r1 = r1.getString(r4)
            goto L_0x00a3
        L_0x00a2:
            r1 = r2
        L_0x00a3:
            r6.f184879h = r1
            android.os.Bundle r1 = r13.f152934b
            r4 = 0
            if (r1 == 0) goto L_0x00b1
            java.lang.String r5 = "MEDIA_IS_MUTE"
            boolean r1 = r1.getBoolean(r5, r4)
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            r6.f184880i = r1
            android.os.Bundle r1 = r13.f152934b
            if (r1 == 0) goto L_0x00bf
            java.lang.String r5 = "MUSIC_IS_MUTE"
            boolean r1 = r1.getBoolean(r5, r4)
            goto L_0x00c0
        L_0x00bf:
            r1 = 0
        L_0x00c0:
            r6.f184881j = r1
            android.os.Bundle r1 = r13.f152934b
            if (r1 == 0) goto L_0x00cd
            java.lang.String r5 = "SOUND_TRACK_TYPE"
            int r1 = r1.getInt(r5, r4)
            goto L_0x00ce
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            r6.f184882n = r1
            android.os.Bundle r1 = r13.f152934b
            if (r1 == 0) goto L_0x00db
            java.lang.String r5 = "MUSIC_FEED_ID"
            java.lang.String r1 = r1.getString(r5)
            goto L_0x00dc
        L_0x00db:
            r1 = r2
        L_0x00dc:
            r6.f184883o = r1
            te3.td1 r1 = r13.f152935c
            r6.f184876e = r1
            android.os.Bundle r1 = r13.f152934b
            if (r1 == 0) goto L_0x00ed
            java.lang.String r5 = "ORIGIN_FILE_PATH"
            java.lang.String r1 = r1.getString(r5)
            goto L_0x00ee
        L_0x00ed:
            r1 = r2
        L_0x00ee:
            r6.f184885q = r1
            te3.nr3 r1 = r13.f153069y
            if (r1 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r5 = r13.f153068x
            r1.f184546i = r5
        L_0x00f9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "getUploadData: "
            r1.append(r5)
            java.lang.String r5 = r6.f184877f
            r1.append(r5)
            java.lang.String r5 = ", "
            r1.append(r5)
            boolean r5 = r6.f184881j
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "Finder.PostVideoWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            te3.zy r1 = r13.f153060p
            if (r1 == 0) goto L_0x013b
            java.util.LinkedList<te3.rq2> r0 = r6.f184875d
            te3.rq2 r1 = r13.mo75482n(r1)
            r13.mo75479k(r1)
            r0.add(r1)
            bt1.w r0 = new bt1.w
            r4 = 1
            r5 = 4
            java.lang.String r7 = r13.f153048D
            r9 = 0
            r10 = 0
            r11 = 96
            r12 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x013b:
            java.util.ArrayList<java.lang.String> r1 = r13.f153057m
            if (r1 == 0) goto L_0x0148
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0146
            goto L_0x0148
        L_0x0146:
            r1 = 0
            goto L_0x0149
        L_0x0148:
            r1 = 1
        L_0x0149:
            if (r1 != 0) goto L_0x018c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "video list "
            r1.append(r7)
            java.util.ArrayList<java.lang.String> r7 = r13.f153057m
            gy3.C87412m.m108591d(r7)
            int r7 = r7.size()
            r1.append(r7)
            java.lang.String r7 = ", thumb list "
            r1.append(r7)
            java.util.ArrayList<java.lang.String> r7 = r13.f153058n
            int r7 = r7.size()
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            java.util.ArrayList<java.lang.String> r1 = r13.f153057m
            gy3.C87412m.m108591d(r1)
            int r1 = r1.size()
            java.util.ArrayList<java.lang.String> r5 = r13.f153058n
            int r5 = r5.size()
            if (r1 != r5) goto L_0x018a
            r1 = 1
            goto L_0x0193
        L_0x018a:
            r1 = 0
            goto L_0x0193
        L_0x018c:
            java.lang.String r1 = "video list null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            goto L_0x018a
        L_0x0193:
            if (r1 == 0) goto L_0x0223
            java.util.ArrayList<java.lang.String> r0 = r13.f153057m
            if (r0 == 0) goto L_0x01c0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x019e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01c0
            java.lang.Object r5 = r0.next()
            int r7 = r1 + 1
            if (r1 < 0) goto L_0x01bc
            java.lang.String r5 = (java.lang.String) r5
            java.util.LinkedList<te3.rq2> r9 = r6.f184875d
            te3.rq2 r1 = r13.mo75481m(r5, r1)
            r13.mo75479k(r1)
            r9.add(r1)
            r1 = r7
            goto L_0x019e
        L_0x01bc:
            sx3.C64197v.m75542k()
            throw r2
        L_0x01c0:
            bt1.w r0 = new bt1.w
            r1 = 1
            er1.w3 r2 = er1.C58784w3.f168295a
            r2.getClass()
            java.util.LinkedList<te3.rq2> r2 = r6.f184875d
            int r2 = r2.size()
            r5 = 4
            if (r2 != 0) goto L_0x01d2
            goto L_0x0216
        L_0x01d2:
            java.util.LinkedList<te3.rq2> r2 = r6.f184875d
            java.lang.Object r2 = r2.get(r4)
            te3.rq2 r2 = (te3.C64689rq2) r2
            int r2 = r2.f185268f
            er1.j4 r4 = er1.C58739j4.f168176a
            java.util.List r4 = r4.mo83721q()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L_0x01ee
        L_0x01ec:
            r5 = r2
            goto L_0x0216
        L_0x01ee:
            r4 = 8
            if (r2 != r5) goto L_0x01fd
            java.util.LinkedList<te3.rq2> r5 = r6.f184875d
            int r5 = r5.size()
            if (r5 <= r3) goto L_0x01fd
        L_0x01fa:
            r5 = 8
            goto L_0x0216
        L_0x01fd:
            java.util.LinkedList<te3.rq2> r3 = r6.f184875d
            if (r3 == 0) goto L_0x01ec
            java.util.Iterator r3 = r3.iterator()
        L_0x0205:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01ec
            java.lang.Object r5 = r3.next()
            te3.rq2 r5 = (te3.C64689rq2) r5
            int r5 = r5.f185268f
            if (r5 == r2) goto L_0x0205
            goto L_0x01fa
        L_0x0216:
            java.lang.String r7 = r13.f153048D
            r9 = 0
            r10 = 0
            r11 = 96
            r12 = 0
            r3 = r0
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0223:
            bt1.w r1 = new bt1.w
            r2 = 0
            if (r0 == 0) goto L_0x022e
            int r0 = r0.getMediaType()
            r5 = r0
            goto L_0x022f
        L_0x022e:
            r5 = 0
        L_0x022f:
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 104(0x68, float:1.46E-43)
            r12 = 0
            r3 = r1
            r4 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54585t.mo75451a():bt1.w");
    }

    /* renamed from: b */
    public View mo75452b() {
        Context context = this.f152933a;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        View inflate = ((Activity) context).getLayoutInflater().inflate(C0966R.C0971layout.anp, (ViewGroup) null);
        C87412m.m108593f(inflate, "context as Activity).lay…_post_video_widget, null)");
        this.f153049e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.f359485l50);
        C87412m.m108593f(findViewById, "rootView.findViewById(co…der.R.id.video_container)");
        this.f153052h = findViewById;
        View view = this.f153049e;
        if (view != null) {
            View findViewById2 = view.findViewById(C0966R.C0970id.kk9);
            C87412m.m108593f(findViewById2, "rootView.findViewById(co…n.finder.R.id.thumb_view)");
            this.f153050f = (ImageView) findViewById2;
            View view2 = this.f153049e;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(C0966R.C0970id.f357551nk2);
                C87412m.m108593f(findViewById3, "rootView.findViewById(co…in.finder.R.id.blur_view)");
                this.f153051g = (ImageView) findViewById3;
                View view3 = this.f153049e;
                if (view3 != null) {
                    this.f153053i = view3.findViewById(C0966R.C0970id.euy);
                    View view4 = this.f153049e;
                    if (view4 != null) {
                        this.f153054j = view4.findViewById(C0966R.C0970id.l4q);
                        View view5 = this.f153049e;
                        if (view5 != null) {
                            View findViewById4 = view5.findViewById(C0966R.C0970id.j9t);
                            C87412m.m108593f(findViewById4, "rootView.findViewById(co…lect_cover_btn_container)");
                            this.f153055k = findViewById4;
                            View findViewById5 = ((Activity) this.f152933a).findViewById(C0966R.C0970id.nf9);
                            C87412m.m108593f(findViewById5, "context.findViewById(com…er_post_low_bitrate_tips)");
                            this.f153056l = findViewById5;
                            Class cls = C61212e.class;
                            View view6 = this.f153055k;
                            if (view6 != null) {
                                View findViewById6 = view6.findViewById(C0966R.C0970id.j9t);
                                ((C61212e) C86312j.m106911c(cls)).o30(findViewById6, "choose_cover_button");
                                ((C61212e) C86312j.m106911c(cls)).mo86175pO(findViewById6, 40, 25496);
                                C61212e eVar = (C61212e) C86312j.m106911c(cls);
                                C13604l[] lVarArr = new C13604l[4];
                                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                                C13442s8 f = aVar.mo12873f(this.f152933a);
                                lVarArr[0] = new C13604l("behaviour_session_id", f != null ? f.f38099o : null);
                                C13442s8 f2 = aVar.mo12873f(this.f152933a);
                                lVarArr[1] = new C13604l("finder_context_id", f2 != null ? f2.f38098n : null);
                                C13442s8 f3 = aVar.mo12873f(this.f152933a);
                                lVarArr[2] = new C13604l("finder_tab_context_id", f3 != null ? f3.f38100p : null);
                                C13442s8 f4 = aVar.mo12873f(this.f152933a);
                                lVarArr[3] = new C13604l("comment_scene", f4 != null ? Integer.valueOf(f4.f38096i) : null);
                                eVar.mo86149PM(findViewById6, C90364q0.m113147f(lVarArr));
                                ((C61212e) C86312j.m106911c(cls)).E60(findViewById6, new C54584s(this));
                                this.f153065u = false;
                                View view7 = this.f153049e;
                                if (view7 != null) {
                                    return view7;
                                }
                                C87412m.m108603p("rootView");
                                throw null;
                            }
                            C87412m.m108603p("selectCoverView");
                            throw null;
                        }
                        C87412m.m108603p("rootView");
                        throw null;
                    }
                    C87412m.m108603p("rootView");
                    throw null;
                }
                C87412m.m108603p("rootView");
                throw null;
            }
            C87412m.m108603p("rootView");
            throw null;
        }
        C87412m.m108603p("rootView");
        throw null;
    }

    /* renamed from: c */
    public boolean mo75439c() {
        C64899zy zyVar = this.f153060p;
        if (zyVar != null) {
            C87412m.m108591d(zyVar);
            LinkedList<hi4> linkedList = zyVar.f186899d;
            C87412m.m108593f(linkedList, "compositionInfo!!.tracks");
            for (hi4 hi4 : linkedList) {
                if (!C86013q1.m106450k(hi4.f183504d)) {
                    Log.m105924i("Finder.PostVideoWidget", "[compositionInfo]video widget file:" + hi4.f183504d + " lost!");
                    return false;
                }
            }
            return true;
        }
        ArrayList<String> arrayList = this.f153057m;
        if (arrayList == null) {
            return true;
        }
        for (String str : arrayList) {
            if (!C86013q1.m106450k(str)) {
                Log.m105924i("Finder.PostVideoWidget", "[videoFileList]video widget file:" + str + " lost!");
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo75440d() {
        this.f153057m = null;
        this.f153058n.clear();
        this.f153059o.clear();
        this.f153060p = null;
        this.f153061q = null;
        this.f152935c = null;
        this.f153063s = "";
        this.f153062r = "";
        this.f153064t = 0;
        this.f153066v = "";
        this.f153067w = null;
        View view = this.f153056l;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "delMedia", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget", "delMedia", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("tipsView");
        throw null;
    }

    /* renamed from: f */
    public C13604l<Integer, Integer> mo75442f() {
        View view = this.f153052h;
        if (view != null) {
            Integer valueOf = Integer.valueOf(view.getWidth());
            View view2 = this.f153052h;
            if (view2 != null) {
                return new C13604l<>(valueOf, Integer.valueOf(view2.getHeight()));
            }
            C87412m.m108603p("container");
            throw null;
        }
        C87412m.m108603p("container");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0280, code lost:
        if ((r4.isEmpty()) != false) goto L_0x0282;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75444h() {
        /*
            r25 = this;
            r1 = r25
            java.lang.Class<kq1.l> r2 = kq1.C61137l.class
            super.mo75444h()
            android.view.View r0 = r1.f153056l
            r11 = 0
            if (r0 == 0) goto L_0x05c2
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r13 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r12.mo10233c(r3)
            java.lang.Object[] r4 = r12.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r6 = "refresh"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r10 = 0
            java.lang.Object r3 = r12.mo10231a(r10)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r5 = "refresh"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            bl3.r r0 = bl3.C39818r.f106831a
            android.content.Context r3 = r1.f152933a
            bl3.r$a r3 = r0.mo62443b(r3)
            java.lang.Class<ao1.m1> r4 = ao1.C54270m1.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(context).…(SdkShareUIC::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            ao1.m1 r3 = (ao1.C54270m1) r3
            bt1.e r4 = r25.mo75441e()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.f152943A
            r5 = 1
            if (r4 == 0) goto L_0x007c
            bt1.e r4 = r25.mo75441e()
            java.util.LinkedList<te3.rq2> r4 = r4.f152958P
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 != 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            java.util.LinkedList<te3.rq2> r6 = r3.f152325p
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "refresh existDraft:"
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = ", existRemote:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r8 = " draftWatermarkFlag:"
            r7.append(r8)
            bt1.e r8 = r25.mo75441e()
            int r8 = r8.f152944B
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Finder.PostVideoWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            java.lang.String r7 = "thumbIv"
            java.lang.String r9 = "selectCoverView"
            if (r4 != 0) goto L_0x04d5
            if (r6 == 0) goto L_0x00bb
            goto L_0x04d5
        L_0x00bb:
            android.os.Bundle r0 = r1.f152934b
            java.lang.String r4 = "safeParser"
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x013e
            java.lang.String r12 = "MEDIA_EXTRA_MUSIC"
            byte[] r0 = r0.getByteArray(r12)
            if (r0 == 0) goto L_0x013e
            te3.xt2 r12 = new te3.xt2
            r12.<init>()
            r12.parseFrom(r0)     // Catch:{ Exception -> 0x00d4 }
            goto L_0x00de
        L_0x00d4:
            r0 = move-exception
            r12 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r10] = r12
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r6, r0)
            r12 = r11
        L_0x00de:
            r1.f153061q = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = "post video with music: "
            r0.append(r12)
            te3.xt2 r12 = r1.f153061q
            if (r12 == 0) goto L_0x00f5
            int r12 = r12.f186384d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x00f6
        L_0x00f5:
            r12 = r11
        L_0x00f6:
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            te3.xt2 r0 = r1.f153061q
            if (r0 != 0) goto L_0x0106
            r12 = r11
            goto L_0x013c
        L_0x0106:
            te3.td1 r12 = new te3.td1
            r12.<init>()
            int r14 = r0.f186399v
            if (r14 != r5) goto L_0x0116
            long r14 = r0.f186400w
            java.lang.String r14 = java.lang.String.valueOf(r14)
            goto L_0x011c
        L_0x0116:
            int r14 = r0.f186384d
            java.lang.String r14 = java.lang.String.valueOf(r14)
        L_0x011c:
            r12.f185534d = r14
            int r14 = r0.f186399v
            r12.f185545r = r14
            java.lang.String r14 = r0.f186392o
            r12.f185535e = r14
            java.lang.String r14 = r0.f186389i
            r12.f185536f = r14
            java.util.LinkedList<java.lang.String> r14 = r0.f186390j
            if (r14 == 0) goto L_0x0135
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x0136
        L_0x0135:
            r14 = r11
        L_0x0136:
            r12.f185537g = r14
            java.lang.String r0 = r0.f186387g
            r12.f185539i = r0
        L_0x013c:
            r1.f152935c = r12
        L_0x013e:
            android.os.Bundle r0 = r1.f152934b
            if (r0 == 0) goto L_0x015f
            java.lang.String r12 = "ORIGIN_MUSIC_INFO"
            byte[] r0 = r0.getByteArray(r12)
            if (r0 == 0) goto L_0x015f
            te3.td1 r12 = new te3.td1
            r12.<init>()
            r12.parseFrom(r0)     // Catch:{ Exception -> 0x0153 }
            goto L_0x015d
        L_0x0153:
            r0 = move-exception
            r12 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r10] = r12
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r6, r0)
            r12 = r11
        L_0x015d:
            r1.f152935c = r12
        L_0x015f:
            android.os.Bundle r0 = r1.f152934b
            java.lang.String r4 = "VIDEO_FULL_COVER_URL"
            if (r0 == 0) goto L_0x016a
            java.lang.String r0 = r0.getString(r4)
            goto L_0x016b
        L_0x016a:
            r0 = r11
        L_0x016b:
            if (r0 != 0) goto L_0x016e
            r0 = r6
        L_0x016e:
            r1.f153063s = r0
            android.os.Bundle r0 = r1.f152934b
            java.lang.String r12 = "VIDEO_COVER_URL"
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r0.getString(r12)
            goto L_0x017c
        L_0x017b:
            r0 = r11
        L_0x017c:
            if (r0 != 0) goto L_0x017f
            r0 = r6
        L_0x017f:
            r1.f153062r = r0
            android.os.Bundle r0 = r1.f152934b
            java.lang.String r14 = "VIDEO_COVER_QUALITY"
            if (r0 == 0) goto L_0x018c
            int r0 = r0.getInt(r14, r10)
            goto L_0x018d
        L_0x018c:
            r0 = 0
        L_0x018d:
            r1.f153064t = r0
            android.os.Bundle r0 = r1.f152934b
            if (r0 == 0) goto L_0x01a2
            java.lang.String r15 = "HALF_RECT_LIST"
            java.util.ArrayList r0 = r0.getParcelableArrayList(r15)
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r10)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x01a3
        L_0x01a2:
            r0 = r11
        L_0x01a3:
            r1.f153067w = r0
            android.os.Bundle r0 = r1.f152934b
            r16 = r14
            r13 = -1
            if (r0 == 0) goto L_0x01b3
            java.lang.String r15 = "VIDEO_COVER_TIME_MS"
            long r13 = r0.getLong(r15, r13)
        L_0x01b3:
            int r0 = (int) r13
            r1.f153068x = r0
            java.util.LinkedList<java.lang.Integer> r0 = r1.f153070z
            r0.clear()
            java.lang.String r0 = r1.f153062r
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x01c7
            r1.f153062r = r6
            r1.f153064t = r10
        L_0x01c7:
            java.lang.String r0 = r1.f153063s
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x01d1
            r1.f153063s = r6
        L_0x01d1:
            android.os.Bundle r0 = r1.f152934b
            java.lang.String r13 = "video_composition"
            if (r0 == 0) goto L_0x01dd
            byte[] r0 = r0.getByteArray(r13)
            goto L_0x01de
        L_0x01dd:
            r0 = r11
        L_0x01de:
            java.lang.String r14 = "VIDEO_THUMB_LIST"
            java.lang.String r15 = "container"
            if (r0 == 0) goto L_0x031b
            java.lang.Class<tz.f> r0 = p707tz.C65000f.class
            android.os.Bundle r4 = r1.f152934b
            if (r4 == 0) goto L_0x0311
            byte[] r4 = r4.getByteArray(r13)
            if (r4 == 0) goto L_0x0311
            java.lang.String r12 = "initFakeVideoLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r12)     // Catch:{ IOException -> 0x0309 }
            android.view.View r12 = r1.f153052h     // Catch:{ IOException -> 0x0309 }
            if (r12 == 0) goto L_0x0305
            k20.a r13 = new k20.a     // Catch:{ IOException -> 0x0309 }
            r13.<init>()     // Catch:{ IOException -> 0x0309 }
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a     // Catch:{ IOException -> 0x0309 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x0309 }
            r13.mo10233c(r15)     // Catch:{ IOException -> 0x0309 }
            java.lang.Object[] r18 = r13.mo10232b()     // Catch:{ IOException -> 0x0309 }
            java.lang.String r19 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r20 = "initFakeVideoLogic"
            java.lang.String r21 = "()Z"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r12
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ IOException -> 0x0309 }
            java.lang.Object r13 = r13.mo10231a(r10)     // Catch:{ IOException -> 0x0309 }
            java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ IOException -> 0x0309 }
            int r13 = r13.intValue()     // Catch:{ IOException -> 0x0309 }
            r12.setVisibility(r13)     // Catch:{ IOException -> 0x0309 }
            java.lang.String r18 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r19 = "initFakeVideoLogic"
            java.lang.String r20 = "()Z"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r17 = r12
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x0309 }
            te3.zy r12 = new te3.zy     // Catch:{ IOException -> 0x0309 }
            r12.<init>()     // Catch:{ IOException -> 0x0309 }
            pe3.a r4 = r12.parseFrom(r4)     // Catch:{ IOException -> 0x0309 }
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CompositionInfo"
            gy3.C87412m.m108592e(r4, r12)     // Catch:{ IOException -> 0x0309 }
            te3.zy r4 = (te3.C64899zy) r4     // Catch:{ IOException -> 0x0309 }
            r1.f153060p = r4     // Catch:{ IOException -> 0x0309 }
            java.util.LinkedList<te3.hi4> r4 = r4.f186899d     // Catch:{ IOException -> 0x0309 }
            if (r4 == 0) goto L_0x0273
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0309 }
        L_0x0256:
            boolean r12 = r4.hasNext()     // Catch:{ IOException -> 0x0309 }
            if (r12 == 0) goto L_0x0273
            java.lang.Object r12 = r4.next()     // Catch:{ IOException -> 0x0309 }
            te3.hi4 r12 = (te3.hi4) r12     // Catch:{ IOException -> 0x0309 }
            di3.d r13 = di3.C86312j.m106911c(r0)     // Catch:{ IOException -> 0x0309 }
            tz.f r13 = (p707tz.C65000f) r13     // Catch:{ IOException -> 0x0309 }
            java.lang.String r12 = r12.f183504d     // Catch:{ IOException -> 0x0309 }
            java.lang.String r15 = "it.path"
            gy3.C87412m.m108593f(r12, r15)     // Catch:{ IOException -> 0x0309 }
            r13.su0(r12)     // Catch:{ IOException -> 0x0309 }
            goto L_0x0256
        L_0x0273:
            android.graphics.Rect r4 = r1.f153067w     // Catch:{ IOException -> 0x0309 }
            if (r4 == 0) goto L_0x0282
            boolean r4 = r4.isEmpty()     // Catch:{ IOException -> 0x0309 }
            if (r4 != r5) goto L_0x027f
            r4 = 1
            goto L_0x0280
        L_0x027f:
            r4 = 0
        L_0x0280:
            if (r4 == 0) goto L_0x02a7
        L_0x0282:
            android.graphics.Rect r4 = new android.graphics.Rect     // Catch:{ IOException -> 0x0309 }
            r4.<init>()     // Catch:{ IOException -> 0x0309 }
            r1.f153067w = r4     // Catch:{ IOException -> 0x0309 }
            te3.zy r4 = r1.f153060p     // Catch:{ IOException -> 0x0309 }
            if (r4 == 0) goto L_0x02a7
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ IOException -> 0x0309 }
            tz.f r0 = (p707tz.C65000f) r0     // Catch:{ IOException -> 0x0309 }
            te3.az r4 = r4.f186904i     // Catch:{ IOException -> 0x0309 }
            if (r4 == 0) goto L_0x029e
            te3.n93 r4 = r4.f297894A     // Catch:{ IOException -> 0x0309 }
            if (r4 == 0) goto L_0x029e
            te3.ep3 r4 = r4.f184446d     // Catch:{ IOException -> 0x0309 }
            goto L_0x029f
        L_0x029e:
            r4 = r11
        L_0x029f:
            android.graphics.Rect r12 = r1.f153067w     // Catch:{ IOException -> 0x0309 }
            gy3.C87412m.m108591d(r12)     // Catch:{ IOException -> 0x0309 }
            r0.mo89209x8(r4, r12)     // Catch:{ IOException -> 0x0309 }
        L_0x02a7:
            android.os.Bundle r0 = r1.f152934b     // Catch:{ IOException -> 0x0309 }
            if (r0 == 0) goto L_0x02b0
            java.util.ArrayList r0 = r0.getStringArrayList(r14)     // Catch:{ IOException -> 0x0309 }
            goto L_0x02b1
        L_0x02b0:
            r0 = r11
        L_0x02b1:
            gy3.f0 r4 = new gy3.f0     // Catch:{ IOException -> 0x0309 }
            r4.<init>()     // Catch:{ IOException -> 0x0309 }
            r4.f27484d = r6     // Catch:{ IOException -> 0x0309 }
            if (r0 == 0) goto L_0x02c3
            boolean r6 = r0.isEmpty()     // Catch:{ IOException -> 0x0309 }
            r6 = r6 ^ r5
            if (r6 != r5) goto L_0x02c3
            r6 = 1
            goto L_0x02c4
        L_0x02c3:
            r6 = 0
        L_0x02c4:
            if (r6 == 0) goto L_0x02d1
            java.lang.Object r0 = sx3.C110818d0.m150914L(r0)     // Catch:{ IOException -> 0x0309 }
            java.lang.String r6 = "mediaThumbList.first()"
            gy3.C87412m.m108593f(r0, r6)     // Catch:{ IOException -> 0x0309 }
            r4.f27484d = r0     // Catch:{ IOException -> 0x0309 }
        L_0x02d1:
            T r0 = r4.f27484d     // Catch:{ IOException -> 0x0309 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0309 }
            java.lang.String r0 = r1.f153062r     // Catch:{ IOException -> 0x0309 }
            com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ IOException -> 0x0309 }
            java.lang.String r0 = "PostVideoWidget_initFakeVideoLogic"
            bt1.l r6 = new bt1.l     // Catch:{ IOException -> 0x0309 }
            r6.<init>(r1, r4)     // Catch:{ IOException -> 0x0309 }
            o40.C61926c.m72657B(r0, r5, r6)     // Catch:{ IOException -> 0x0309 }
            android.widget.ImageView r0 = r1.f153050f     // Catch:{ IOException -> 0x0309 }
            if (r0 == 0) goto L_0x0301
            bt1.m r6 = new bt1.m     // Catch:{ IOException -> 0x0309 }
            r6.<init>(r1)     // Catch:{ IOException -> 0x0309 }
            r0.setOnClickListener(r6)     // Catch:{ IOException -> 0x0309 }
            android.view.View r0 = r1.f153055k     // Catch:{ IOException -> 0x0309 }
            if (r0 == 0) goto L_0x02fd
            bt1.n r6 = new bt1.n     // Catch:{ IOException -> 0x0309 }
            r6.<init>(r1, r4)     // Catch:{ IOException -> 0x0309 }
            r0.setOnClickListener(r6)     // Catch:{ IOException -> 0x0309 }
            goto L_0x0311
        L_0x02fd:
            gy3.C87412m.m108603p(r9)     // Catch:{ IOException -> 0x0309 }
            throw r11     // Catch:{ IOException -> 0x0309 }
        L_0x0301:
            gy3.C87412m.m108603p(r7)     // Catch:{ IOException -> 0x0309 }
            throw r11     // Catch:{ IOException -> 0x0309 }
        L_0x0305:
            gy3.C87412m.m108603p(r15)     // Catch:{ IOException -> 0x0309 }
            throw r11     // Catch:{ IOException -> 0x0309 }
        L_0x0309:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r10]
            java.lang.String r6 = "parse error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r6, r4)
        L_0x0311:
            bt1.u r0 = new bt1.u
            r0.<init>(r1)
            o40.C61926c.m72656A(r11, r0)
            goto L_0x0426
        L_0x031b:
            android.os.Bundle r0 = r1.f152934b
            if (r0 == 0) goto L_0x0327
            java.lang.String r7 = "video_file_list"
            java.util.ArrayList r0 = r0.getStringArrayList(r7)
            goto L_0x0328
        L_0x0327:
            r0 = r11
        L_0x0328:
            r1.f153057m = r0
            android.os.Bundle r0 = r1.f152934b
            if (r0 == 0) goto L_0x0333
            java.util.ArrayList r0 = r0.getStringArrayList(r14)
            goto L_0x0334
        L_0x0333:
            r0 = r11
        L_0x0334:
            android.os.Bundle r7 = r1.f152934b
            if (r7 == 0) goto L_0x033d
            java.lang.String r7 = r7.getString(r12)
            goto L_0x033e
        L_0x033d:
            r7 = r11
        L_0x033e:
            if (r7 != 0) goto L_0x0341
            r7 = r6
        L_0x0341:
            r1.f153062r = r7
            android.os.Bundle r7 = r1.f152934b
            if (r7 == 0) goto L_0x034c
            java.lang.String r4 = r7.getString(r4)
            goto L_0x034d
        L_0x034c:
            r4 = r11
        L_0x034d:
            if (r4 != 0) goto L_0x0350
            r4 = r6
        L_0x0350:
            r1.f153063s = r4
            android.os.Bundle r4 = r1.f152934b
            if (r4 == 0) goto L_0x035d
            r7 = r16
            int r4 = r4.getInt(r7, r10)
            goto L_0x035e
        L_0x035d:
            r4 = 0
        L_0x035e:
            r1.f153064t = r4
            android.os.Bundle r4 = r1.f152934b
            if (r4 == 0) goto L_0x03aa
            java.lang.String r7 = "video_before_cut_path"
            java.lang.String r7 = r4.getString(r7)
            if (r7 != 0) goto L_0x036e
            goto L_0x036f
        L_0x036e:
            r6 = r7
        L_0x036f:
            r1.f153048D = r6
            java.lang.String r6 = "VIDEO_CROP_LIST"
            java.util.ArrayList r4 = r4.getParcelableArrayList(r6)
            if (r4 == 0) goto L_0x03aa
            int r6 = r4.size()
            if (r6 <= 0) goto L_0x03aa
            java.util.ArrayList<te3.jr2> r6 = r1.f153059o
            r6.clear()
            java.util.Iterator r4 = r4.iterator()
        L_0x0388:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x03aa
            java.lang.Object r6 = r4.next()
            android.os.Parcelable r6 = (android.os.Parcelable) r6
            if (r6 == 0) goto L_0x03a4
            boolean r7 = r6 instanceof com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable
            if (r7 == 0) goto L_0x03a4
            java.util.ArrayList<te3.jr2> r7 = r1.f153059o
            com.tencent.mm.plugin.finder.video.LocalVideoCropInfoParcelable r6 = (com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable) r6
            te3.jr2 r6 = r6.f161940d
            r7.add(r6)
            goto L_0x0388
        L_0x03a4:
            java.util.ArrayList<te3.jr2> r6 = r1.f153059o
            r6.add(r11)
            goto L_0x0388
        L_0x03aa:
            java.util.ArrayList<java.lang.String> r4 = r1.f153057m
            if (r4 == 0) goto L_0x03b7
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x03b5
            goto L_0x03b7
        L_0x03b5:
            r4 = 0
            goto L_0x03b8
        L_0x03b7:
            r4 = 1
        L_0x03b8:
            if (r4 != 0) goto L_0x041e
            android.view.View r4 = r1.f153055k
            if (r4 == 0) goto L_0x041a
            bt1.o r6 = new bt1.o
            r6.<init>(r1)
            r4.setOnClickListener(r6)
            android.view.View r4 = r1.f153052h
            if (r4 == 0) goto L_0x0416
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r6.mo10233c(r7)
            java.lang.Object[] r18 = r6.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r20 = "initNormalVideoLogic"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r4
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r6 = r6.mo10231a(r10)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r19 = "initNormalVideoLogic"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            bt1.r r4 = new bt1.r
            r4.<init>(r1, r0)
            java.lang.String r0 = "Finder_Post_Create_Video_Thumb"
            o40.C61926c.m72661F(r0, r4)
            goto L_0x041e
        L_0x0416:
            gy3.C87412m.m108603p(r15)
            throw r11
        L_0x041a:
            gy3.C87412m.m108603p(r9)
            throw r11
        L_0x041e:
            bt1.v r0 = new bt1.v
            r0.<init>(r1)
            o40.C61926c.m72656A(r11, r0)
        L_0x0426:
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99318W3
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0440
            java.lang.String r0 = "[watermarkDet] post pre check disable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x04d1
        L_0x0440:
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99336Y3
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0455
            java.lang.String r0 = "[watermarkDet] post watermark check disable"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            goto L_0x04d1
        L_0x0455:
            te3.zy r0 = r1.f153060p
            if (r0 == 0) goto L_0x0483
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r6 = r1.f152933a
            bl3.r$a r4 = r4.mo62443b(r6)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r2)
            kq1.l r4 = (kq1.C61137l) r4
            r4.getClass()
            r4.f174052f = r5
            kq1.o r6 = new kq1.o
            r6.<init>(r4, r0, r11)
            r18 = 0
            r19 = 0
            r21 = 3
            r22 = 0
            r17 = r4
            r20 = r6
            bl3.C0317e.launch$default(r17, r18, r19, r20, r21, r22)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0484
        L_0x0483:
            r0 = r11
        L_0x0484:
            if (r0 != 0) goto L_0x04d1
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList<java.lang.String> r4 = r1.f153057m
            if (r4 == 0) goto L_0x04a3
            java.util.Iterator r4 = r4.iterator()
        L_0x0493:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04a3
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.add(r6)
            goto L_0x0493
        L_0x04a3:
            boolean r4 = r0.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x04d1
            bl3.r r4 = bl3.C39818r.f106831a
            android.content.Context r6 = r1.f152933a
            bl3.r$a r4 = r4.mo62443b(r6)
            androidx.lifecycle.i0 r2 = r4.mo75002a(r2)
            kq1.l r2 = (kq1.C61137l) r2
            r2.getClass()
            r2.f174052f = r5
            kq1.p r4 = new kq1.p
            r4.<init>(r2, r0, r11)
            r18 = 0
            r19 = 0
            r21 = 3
            r22 = 0
            r17 = r2
            r20 = r4
            bl3.C0317e.launch$default(r17, r18, r19, r20, r21, r22)
        L_0x04d1:
            r1.mo75480l(r11)
            goto L_0x0520
        L_0x04d5:
            android.content.Context r6 = r1.f152933a
            bl3.r$a r0 = r0.mo62443b(r6)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            kq1.l r0 = (kq1.C61137l) r0
            bt1.e r2 = r25.mo75441e()
            int r2 = r2.f152944B
            r0.f174051e = r2
            if (r4 == 0) goto L_0x04f2
            bt1.e r0 = r25.mo75441e()
            java.util.LinkedList<te3.rq2> r0 = r0.f152958P
            goto L_0x04f4
        L_0x04f2:
            java.util.LinkedList<te3.rq2> r0 = r3.f152325p
        L_0x04f4:
            if (r0 == 0) goto L_0x0508
            java.lang.Object r2 = sx3.C110818d0.m150916N(r0)
            te3.rq2 r2 = (te3.C64689rq2) r2
            if (r2 == 0) goto L_0x0508
            long r12 = r2.f185238E
            r1.f153045A = r12
            r1.mo75443g(r2)
            r1.mo75480l(r2)
        L_0x0508:
            android.widget.ImageView r2 = r1.f153050f
            if (r2 == 0) goto L_0x05be
            bt1.t$a r4 = new bt1.t$a
            r4.<init>(r1)
            r2.setOnClickListener(r4)
            android.view.View r2 = r1.f153055k
            if (r2 == 0) goto L_0x05ba
            bt1.t$b r4 = new bt1.t$b
            r4.<init>(r1, r0)
            r2.setOnClickListener(r4)
        L_0x0520:
            te3.dj1 r0 = r3.f152318f
            if (r0 != 0) goto L_0x0525
            goto L_0x0526
        L_0x0525:
            r5 = 0
        L_0x0526:
            if (r5 != 0) goto L_0x0572
            android.view.View r0 = r1.f153055k
            if (r0 == 0) goto L_0x056e
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r20 = "refresh"
            java.lang.String r21 = "()V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r0
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r19 = "refresh"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            goto L_0x05b5
        L_0x056e:
            gy3.C87412m.m108603p(r9)
            throw r11
        L_0x0572:
            android.view.View r0 = r1.f153055k
            if (r0 == 0) goto L_0x05b6
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r11.mo10233c(r2)
            java.lang.Object[] r3 = r11.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r5 = "refresh"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r2 = r0
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r11.mo10231a(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r4 = "refresh"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r2 = r0
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x05b5:
            return
        L_0x05b6:
            gy3.C87412m.m108603p(r9)
            throw r11
        L_0x05ba:
            gy3.C87412m.m108603p(r9)
            throw r11
        L_0x05be:
            gy3.C87412m.m108603p(r7)
            throw r11
        L_0x05c2:
            java.lang.String r0 = "tipsView"
            gy3.C87412m.m108603p(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54585t.mo75444h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
        if ((r3 == 0) != false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04f3  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75445i(android.graphics.Bitmap r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            java.lang.String r2 = "thumb"
            gy3.C87412m.m108594g(r1, r2)
            bt1.e r2 = r31.mo75441e()
            int r2 = r2.mo75457e()
            er1.w3 r3 = er1.C58784w3.f168295a
            int r4 = r32.getWidth()
            int r5 = r32.getHeight()
            r3.getClass()
            float r3 = (float) r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 * r5
            float r4 = (float) r4
            float r3 = r3 / r4
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_CROP
            int r6 = er1.C58784w3.f168297c
            r7 = 1068149419(0x3faaaaab, float:1.3333334)
            r8 = 1
            r9 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0043
            if (r2 == r8) goto L_0x0043
            if (r2 != 0) goto L_0x003f
            if (r3 != 0) goto L_0x003b
            r3 = 1
            goto L_0x003c
        L_0x003b:
            r3 = 0
        L_0x003c:
            if (r3 == 0) goto L_0x003f
            goto L_0x0043
        L_0x003f:
            float r3 = (float) r6
            float r3 = r3 * r5
            goto L_0x0046
        L_0x0043:
            float r3 = (float) r6
            float r3 = r3 * r7
        L_0x0046:
            int r4 = r4.ordinal()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r3 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            android.widget.ImageView r10 = r0.f153050f
            java.lang.String r11 = "thumbIv"
            if (r10 == 0) goto L_0x04f3
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            r13 = r6
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r10.width = r13
            android.widget.ImageView r10 = r0.f153050f
            if (r10 == 0) goto L_0x04ee
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            r13 = r3
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r10.height = r13
            android.widget.ImageView r10 = r0.f153050f
            if (r10 == 0) goto L_0x04e9
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            int r10 = r10.width
            android.widget.ImageView r10 = r0.f153050f
            if (r10 == 0) goto L_0x04e4
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            int r10 = r10.height
            android.view.View r10 = r0.f153049e
            java.lang.String r13 = "rootView"
            if (r10 == 0) goto L_0x04df
            android.view.ViewParent r10 = r10.getParent()
            boolean r14 = r10 instanceof android.widget.LinearLayout
            if (r14 == 0) goto L_0x00a1
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            goto L_0x00a2
        L_0x00a1:
            r10 = 0
        L_0x00a2:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r14 = r10.getLayoutParams()
            goto L_0x00aa
        L_0x00a9:
            r14 = 0
        L_0x00aa:
            boolean r15 = r14 instanceof android.widget.FrameLayout.LayoutParams
            if (r15 == 0) goto L_0x00b1
            android.widget.FrameLayout$LayoutParams r14 = (android.widget.FrameLayout.LayoutParams) r14
            goto L_0x00b2
        L_0x00b1:
            r14 = 0
        L_0x00b2:
            if (r10 == 0) goto L_0x00c4
            android.view.View r15 = r10.getRootView()
            if (r15 == 0) goto L_0x00c4
            r12 = 2131311150(0x7f093a2e, float:1.8240632E38)
            android.view.View r12 = r15.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            goto L_0x00c5
        L_0x00c4:
            r12 = 0
        L_0x00c5:
            if (r14 != 0) goto L_0x00c8
            goto L_0x00e6
        L_0x00c8:
            android.view.View r15 = r0.f153049e
            if (r15 == 0) goto L_0x04da
            android.content.res.Resources r13 = r15.getResources()
            if (r13 == 0) goto L_0x00df
            r15 = 2131165348(0x7f0700a4, float:1.794491E38)
            float r13 = r13.getDimension(r15)
            int r13 = (int) r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x00e0
        L_0x00df:
            r13 = 0
        L_0x00e0:
            int r13 = r13.intValue()
            r14.topMargin = r13
        L_0x00e6:
            if (r12 == 0) goto L_0x00fa
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r15 = 2131101252(0x7f060644, float:1.7814908E38)
            int r13 = r13.getColor(r15)
            r12.setTextColor(r13)
        L_0x00fa:
            if (r10 != 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            r10.setLayoutParams(r14)
        L_0x0100:
            android.widget.ImageView r10 = r0.f153050f
            if (r10 == 0) goto L_0x04d5
            android.widget.ImageView$ScaleType[] r12 = android.widget.ImageView.ScaleType.values()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r4 = r12[r4]
            r10.setScaleType(r4)
            android.widget.ImageView r4 = r0.f153050f
            if (r4 == 0) goto L_0x04d0
            r4.requestLayout()
            android.widget.ImageView r4 = r0.f153050f
            if (r4 == 0) goto L_0x04cb
            r4.setImageBitmap(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            r4 = r6
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            float r3 = r3 / r4
            int r4 = r32.getHeight()
            float r4 = (float) r4
            int r10 = r32.getWidth()
            float r10 = (float) r10
            float r4 = r4 / r10
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0141
            r4 = 1
            goto L_0x0142
        L_0x0141:
            r4 = 0
        L_0x0142:
            if (r4 == 0) goto L_0x014a
            if (r2 == 0) goto L_0x0148
            if (r2 != r8) goto L_0x014a
        L_0x0148:
            r2 = 1
            goto L_0x014b
        L_0x014a:
            r2 = 0
        L_0x014b:
            r4 = 2
            java.lang.String r10 = "blurIv"
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0289
            if (r2 == 0) goto L_0x0156
            goto L_0x0289
        L_0x0156:
            r2 = r6
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r3 = (float) r2
            float r3 = r3 * r7
            int r3 = (int) r3
            int r5 = r3 - r2
            int r5 = r5 / r4
            android.view.View r7 = r0.f153053i
            r11 = 4
            if (r7 != 0) goto L_0x016a
            goto L_0x01ad
        L_0x016a:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r12.mo10233c(r13)
            java.lang.Object[] r17 = r12.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r19 = "showThumb"
            java.lang.String r20 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r7
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r12 = r12.mo10231a(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r7.setVisibility(r12)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r18 = "showThumb"
            java.lang.String r19 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x01ad:
            android.view.View r7 = r0.f153054j
            if (r7 != 0) goto L_0x01b2
            goto L_0x01f5
        L_0x01b2:
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.mo10233c(r11)
            java.lang.Object[] r24 = r12.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r26 = "showThumb"
            java.lang.String r27 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r7
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r11 = r12.mo10231a(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r7.setVisibility(r11)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r25 = "showThumb"
            java.lang.String r26 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x01f5:
            android.view.View r7 = r0.f153053i
            if (r7 == 0) goto L_0x01fe
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            goto L_0x01ff
        L_0x01fe:
            r7 = 0
        L_0x01ff:
            if (r7 != 0) goto L_0x0202
            goto L_0x0204
        L_0x0202:
            r7.width = r2
        L_0x0204:
            android.view.View r7 = r0.f153053i
            if (r7 == 0) goto L_0x020d
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            goto L_0x020e
        L_0x020d:
            r7 = 0
        L_0x020e:
            if (r7 != 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r7.height = r5
        L_0x0213:
            android.view.View r7 = r0.f153053i
            if (r7 == 0) goto L_0x021a
            r7.requestLayout()
        L_0x021a:
            android.view.View r7 = r0.f153054j
            if (r7 == 0) goto L_0x0223
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            goto L_0x0224
        L_0x0223:
            r7 = 0
        L_0x0224:
            if (r7 != 0) goto L_0x0227
            goto L_0x0229
        L_0x0227:
            r7.width = r2
        L_0x0229:
            android.view.View r7 = r0.f153054j
            if (r7 == 0) goto L_0x0232
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            goto L_0x0233
        L_0x0232:
            r7 = 0
        L_0x0233:
            if (r7 != 0) goto L_0x0236
            goto L_0x0238
        L_0x0236:
            r7.height = r5
        L_0x0238:
            android.view.View r5 = r0.f153054j
            if (r5 == 0) goto L_0x023f
            r5.requestLayout()
        L_0x023f:
            android.widget.ImageView r5 = r0.f153051g
            if (r5 == 0) goto L_0x0284
            r5.setVisibility(r9)
            android.widget.ImageView r5 = r0.f153051g
            if (r5 == 0) goto L_0x027f
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            r5.width = r2
            android.widget.ImageView r5 = r0.f153051g
            if (r5 == 0) goto L_0x027a
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            r5.height = r3
            android.widget.ImageView r5 = r0.f153051g
            if (r5 == 0) goto L_0x0275
            r5.requestLayout()
            pl1.s r5 = pl1.C11989s.f34981a
            android.graphics.Bitmap r1 = r5.mo11860a(r1, r2, r3)
            android.widget.ImageView r2 = r0.f153051g
            if (r2 == 0) goto L_0x0270
            r2.setImageBitmap(r1)
            goto L_0x0322
        L_0x0270:
            gy3.C87412m.m108603p(r10)
            r1 = 0
            throw r1
        L_0x0275:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x027a:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x027f:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x0284:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x0289:
            android.view.View r1 = r0.f153053i
            r2 = 8
            if (r1 != 0) goto L_0x0290
            goto L_0x02d3
        L_0x0290:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r5)
            java.lang.Object[] r17 = r3.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r19 = "showThumb"
            java.lang.String r20 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r18 = "showThumb"
            java.lang.String r19 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x02d3:
            android.view.View r1 = r0.f153054j
            if (r1 != 0) goto L_0x02d8
            goto L_0x031b
        L_0x02d8:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3.mo10233c(r5)
            java.lang.Object[] r24 = r3.mo10232b()
            java.lang.String r25 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r26 = "showThumb"
            java.lang.String r27 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            r23 = r1
            j20.C117292a.m165358d(r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.Object r3 = r3.mo10231a(r9)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r24 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r25 = "showThumb"
            java.lang.String r26 = "(Landroid/graphics/Bitmap;)V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            j20.C117292a.m165359e(r23, r24, r25, r26, r27, r28, r29)
        L_0x031b:
            android.widget.ImageView r1 = r0.f153051g
            if (r1 == 0) goto L_0x04c6
            r1.setVisibility(r2)
        L_0x0322:
            android.view.View r1 = r0.f153055k
            java.lang.String r2 = "selectCoverView"
            if (r1 == 0) goto L_0x04c1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            java.lang.Number r6 = (java.lang.Number) r6
            int r3 = r6.intValue()
            r1.width = r3
            android.view.View r1 = r0.f153055k
            if (r1 == 0) goto L_0x04bc
            r1.requestLayout()
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            long r2 = r31.mo75483o()
            up1.f r5 = up1.C37521f.f99374d
            r5.getClass()
            k40.a r5 = f40.C86709a0.m107533q(r1)
            lc3.b r5 = (lc3.C10485b) r5
            pj.f r5 = r5.vh0()
            r6 = 5
            java.lang.String r7 = "FinderPostRecommendMinDuration"
            int r5 = r5.mo107404b(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "FinderPostRecommendMinDuration minDuration = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FinderConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            int r5 = r5 * 1000
            zc1.b r6 = zc1.C66785b.f191882e
            java.lang.String r10 = r6.mo90662O5()
            r11 = 0
            bd1.b r10 = zc1.C66783a.C66784a.m78798a(r6, r10, r9, r4, r11)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x0386
            te3.dr2 r10 = r10.mo75251m2()
            java.lang.String r10 = r10.f132490G
            if (r10 != 0) goto L_0x0387
        L_0x0386:
            r10 = r11
        L_0x0387:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "duration:"
            r12.append(r13)
            r12.append(r2)
            java.lang.String r13 = ", minDuration:"
            r12.append(r13)
            r12.append(r5)
            java.lang.String r13 = " lenTooShortTips:"
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "Finder.PostVideoWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            long r14 = (long) r5
            int r5 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r5 > 0) goto L_0x03b3
            goto L_0x03b4
        L_0x03b3:
            r10 = r11
        L_0x03b4:
            int r2 = r10.length()
            if (r2 != 0) goto L_0x03bc
            r2 = 1
            goto L_0x03bd
        L_0x03bc:
            r2 = 0
        L_0x03bd:
            if (r2 == 0) goto L_0x0449
            java.util.LinkedList<java.lang.Integer> r2 = r0.f153070z
            int r2 = r2.size()
            if (r2 != r8) goto L_0x0448
            java.util.LinkedList<java.lang.Integer> r2 = r0.f153070z
            java.lang.Object r2 = r2.getFirst()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r3 = r6.mo90662O5()
            r5 = 0
            bd1.b r3 = zc1.C66783a.C66784a.m78798a(r6, r3, r9, r4, r5)
            if (r3 == 0) goto L_0x03e2
            te3.dr2 r3 = r3.mo75251m2()
            java.lang.String r3 = r3.f132489F
            if (r3 != 0) goto L_0x03e3
        L_0x03e2:
            r3 = r11
        L_0x03e3:
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            r4 = 2000(0x7d0, float:2.803E-42)
            java.lang.String r5 = "FinderPostLowBitRate"
            int r1 = r1.mo107404b(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "FinderPostLowBitRate bitrate = "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            int r1 = r1 * 1000
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bitrate:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " lowBitrateTips:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ", minLowBitrate:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r4)
            if (r1 <= 0) goto L_0x0448
            java.lang.String r4 = "bitrate"
            gy3.C87412m.m108593f(r2, r4)
            int r2 = r2.intValue()
            if (r2 > r1) goto L_0x0448
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x0444
            r1 = 1
            goto L_0x0445
        L_0x0444:
            r1 = 0
        L_0x0445:
            if (r1 == 0) goto L_0x0448
            r11 = r3
        L_0x0448:
            r10 = r11
        L_0x0449:
            int r1 = r10.length()
            if (r1 <= 0) goto L_0x0450
            goto L_0x0451
        L_0x0450:
            r8 = 0
        L_0x0451:
            if (r8 == 0) goto L_0x04bb
            android.view.View r1 = r0.f153056l
            java.lang.String r8 = "tipsView"
            if (r1 == 0) goto L_0x04b6
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r19 = "showTips"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r1
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r9)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/widget/post/PostVideoWidget"
            java.lang.String r3 = "showTips"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            android.view.View r1 = r0.f153056l
            if (r1 == 0) goto L_0x04b1
            r2 = 2131304576(0x7f092080, float:1.8227299E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 != 0) goto L_0x04ad
            goto L_0x04bb
        L_0x04ad:
            r1.setText(r10)
            goto L_0x04bb
        L_0x04b1:
            gy3.C87412m.m108603p(r8)
            r1 = 0
            throw r1
        L_0x04b6:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x04bb:
            return
        L_0x04bc:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x04c1:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x04c6:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x04cb:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x04d0:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x04d5:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x04da:
            r1 = 0
            gy3.C87412m.m108603p(r13)
            throw r1
        L_0x04df:
            r1 = 0
            gy3.C87412m.m108603p(r13)
            throw r1
        L_0x04e4:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x04e9:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x04ee:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x04f3:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54585t.mo75445i(android.graphics.Bitmap):void");
    }

    /* renamed from: k */
    public final void mo75479k(C64689rq2 rq22) {
        C64825xb1 xb12 = new C64825xb1();
        xb12.f186283e = (float) this.f153064t;
        rq22.f185236C = xb12;
        rq22.f185256T0 = mo75441e().mo75457e();
        Log.m105924i("Finder.PostVideoWidget", "codec_info video_cover_score:" + this.f153064t);
    }

    /* renamed from: l */
    public final void mo75480l(C64689rq2 rq22) {
        String str;
        C13598b0 b0Var;
        hi4 hi4;
        String str2;
        Class cls = C61136e.class;
        if (rq22 != null) {
            ((C61136e) C39818r.f106831a.mo62443b(this.f152933a).mo75002a(cls)).f174047d = rq22.f185266d + rq22.f185286y;
        }
        C64899zy zyVar = this.f153060p;
        if (zyVar != null) {
            LinkedList<hi4> linkedList = zyVar.f186899d;
            if (linkedList == null || (hi4 = (hi4) C110818d0.m150916N(linkedList)) == null || (str2 = hi4.f183504d) == null) {
                b0Var = null;
            } else {
                ((C61136e) C39818r.f106831a.mo62443b(this.f152933a).mo75002a(cls)).f174048e = str2;
                b0Var = C13598b0.f38549a;
            }
            if (b0Var != null) {
                return;
            }
        }
        ArrayList<String> arrayList = this.f153057m;
        if (arrayList != null && (str = (String) C110818d0.m150916N(arrayList)) != null) {
            ((C61136e) C39818r.f106831a.mo62443b(this.f152933a).mo75002a(cls)).f174048e = str;
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
    }

    /* renamed from: m */
    public final C64689rq2 mo75481m(String str, int i) {
        C65449m mVar = C65449m.f188332a;
        String nullAsNil = Util.nullAsNil((String) C110818d0.m150917O(this.f153058n, i));
        C87412m.m108593f(nullAsNil, "nullAsNil(thumbFileList.getOrNull(index))");
        return mVar.mo89567f(str, nullAsNil, this.f153059o.size() > i ? this.f153059o.get(i) : null, this.f153062r, this.f153063s, this.f153069y);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.getStringArrayList("VIDEO_THUMB_LIST");
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64689rq2 mo75482n(te3.C64899zy r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.os.Bundle r2 = r0.f152934b
            if (r2 == 0) goto L_0x0017
            java.lang.String r3 = "VIDEO_THUMB_LIST"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            if (r2 == 0) goto L_0x0017
            java.lang.Object r2 = sx3.C110818d0.m150914L(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x001d
            r2 = r3
        L_0x001d:
            java.lang.String r4 = r0.f153066v
            java.lang.String r5 = r0.f153062r
            java.lang.String r6 = r0.f153063s
            android.graphics.Rect r7 = r0.f153067w
            te3.nr3 r8 = r0.f153069y
            java.lang.Class<tz.f> r9 = p707tz.C65000f.class
            java.lang.String r10 = "info"
            gy3.C87412m.m108594g(r1, r10)
            java.lang.String r10 = "thumbUrl"
            gy3.C87412m.m108594g(r4, r10)
            java.lang.String r10 = "coverUrl"
            gy3.C87412m.m108594g(r5, r10)
            java.lang.String r10 = "fullCoverUrl"
            gy3.C87412m.m108594g(r6, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "getFakeVideoMedia  info:"
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = "  thumbUrl:"
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "Finder.FinderPostUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            te3.rq2 r10 = new te3.rq2
            r10.<init>()
            r10.f185266d = r3
            r3 = 4
            r10.f185268f = r3
            r10.f185267e = r4
            r10.f185239F = r2
            r10.f185283w = r5
            r10.f185261W = r6
            java.util.LinkedList<te3.hi4> r3 = r1.f186899d
            r6 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            java.lang.Object r3 = r3.get(r6)
            te3.hi4 r3 = (te3.hi4) r3
            java.lang.String r3 = r3.f183504d
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r3)
            r10.f185275p = r3
            er1.w3 r3 = er1.C58784w3.f168295a
            java.lang.String r12 = r3.mo83984z1(r4)
            r10.f185285x0 = r12
            java.lang.String r3 = r3.mo83984z1(r5)
            r10.f185287y0 = r3
            r10.f185235B = r1
            r10.f185280t = r6
            te3.jr2 r3 = new te3.jr2
            r3.<init>()
            r10.f185281u = r3
            r10.f185258U0 = r8
            te3.az r3 = r1.f186904i
            te3.n93 r5 = r3.f297915z
            java.lang.String r8 = ".mp4"
            java.lang.String r12 = "vsg_half_output_"
            r14 = 2
            if (r5 == 0) goto L_0x01bc
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            di3.d r3 = di3.C86312j.m106911c(r9)
            tz.f r3 = (p707tz.C65000f) r3
            te3.az r5 = r1.f186904i
            te3.n93 r5 = r5.f297915z
            te3.ep3 r5 = r5.f184446d
            r3.mo89209x8(r5, r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            di3.d r5 = di3.C86312j.m106911c(r9)
            tz.f r5 = (p707tz.C65000f) r5
            te3.az r7 = r1.f186904i
            te3.n93 r7 = r7.f297894A
            te3.ep3 r7 = r7.f184446d
            r5.mo89209x8(r7, r3)
            int r5 = r2.width()
            float r5 = (float) r5
            r10.f185270h = r5
            int r5 = r2.height()
            float r5 = (float) r5
            r10.f185271i = r5
            int r5 = r2.height()
            int r7 = r3.height()
            if (r5 == r7) goto L_0x013a
            int r5 = r2.left
            int r7 = r3.left
            if (r5 >= r7) goto L_0x00f1
            r5 = r7
        L_0x00f1:
            int r7 = r2.top
            int r11 = r3.top
            if (r7 >= r11) goto L_0x00f8
            r7 = r11
        L_0x00f8:
            int r11 = r2.right
            int r15 = r3.right
            if (r11 <= r15) goto L_0x00ff
            r11 = r15
        L_0x00ff:
            int r15 = r2.bottom
            int r13 = r3.bottom
            if (r15 <= r13) goto L_0x0106
            r15 = r13
        L_0x0106:
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            int r6 = r2.left
            int r5 = r5 - r6
            r13.left = r5
            int r5 = r2.left
            int r11 = r11 - r5
            r13.right = r11
            int r5 = r2.top
            int r7 = r7 - r5
            r13.top = r7
            int r5 = r2.top
            int r15 = r15 - r5
            r13.bottom = r15
            te3.iq0 r5 = new te3.iq0
            r5.<init>()
            int r6 = r13.left
            float r6 = (float) r6
            r5.f183717d = r6
            int r6 = r13.top
            float r6 = (float) r6
            r5.f183718e = r6
            int r6 = r13.right
            float r6 = (float) r6
            r5.f183719f = r6
            int r6 = r13.bottom
            float r6 = (float) r6
            r5.f183720g = r6
            r10.f185248P = r5
        L_0x013a:
            int r5 = r2.left
            int r6 = r2.right
            int r5 = r5 + r6
            int r5 = r5 / r14
            int r6 = r3.left
            int r7 = r3.right
            int r6 = r6 + r7
            int r6 = r6 / r14
            int r5 = r5 - r6
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= r14) goto L_0x014e
            goto L_0x0161
        L_0x014e:
            int r5 = r2.top
            int r2 = r2.bottom
            int r5 = r5 + r2
            int r5 = r5 / r14
            int r2 = r3.top
            int r6 = r3.bottom
            int r2 = r2 + r6
            int r2 = r2 / r14
            int r5 = r5 - r2
            int r2 = java.lang.Math.abs(r5)
            if (r2 <= r14) goto L_0x0163
        L_0x0161:
            r6 = 0
            goto L_0x0164
        L_0x0163:
            r6 = 1
        L_0x0164:
            if (r6 != 0) goto L_0x02d3
            te3.cf2 r2 = new te3.cf2
            r2.<init>()
            r2.f182463d = r4
            int r4 = r3.width()
            float r4 = (float) r4
            r2.f182464e = r4
            int r3 = r3.height()
            float r3 = (float) r3
            r2.f182465f = r3
            te3.zy r3 = new te3.zy
            r3.<init>()
            byte[] r4 = r17.toByteArray()
            r3.parseFrom(r4)
            te3.az r4 = r3.f186904i
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            di3.d r6 = di3.C86312j.m106911c(r9)
            tz.f r6 = (p707tz.C65000f) r6
            java.lang.String r6 = r6.ca0()
            r5.append(r6)
            r5.append(r12)
            long r6 = java.lang.System.currentTimeMillis()
            r5.append(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r4.f297896d = r5
            te3.az r4 = r3.f186904i
            te3.az r1 = r1.f186904i
            te3.n93 r1 = r1.f297894A
            r4.f297894A = r1
            r2.f182466g = r3
            r10.f185253S = r2
            goto L_0x02d3
        L_0x01bc:
            int r5 = r3.f297901i
            float r5 = (float) r5
            r10.f185270h = r5
            int r5 = r3.f297902j
            float r5 = (float) r5
            r10.f185271i = r5
            r5 = 3
            if (r7 != 0) goto L_0x021c
            r10.f185267e = r2
            te3.ep3 r2 = r3.f297899g
            java.util.LinkedList<java.lang.Integer> r3 = r2.f183015d
            java.lang.Object r3 = r3.get(r14)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.util.LinkedList<java.lang.Integer> r4 = r2.f183015d
            r6 = 0
            java.lang.Object r4 = r4.get(r6)
            java.lang.String r6 = "cropRect.values[0]"
            gy3.C87412m.m108593f(r4, r6)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            int r3 = r3 - r4
            java.util.LinkedList<java.lang.Integer> r4 = r2.f183015d
            java.lang.Object r4 = r4.get(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.util.LinkedList<java.lang.Integer> r2 = r2.f183015d
            r5 = 1
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r5 = "cropRect.values[1]"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r4 = r4 - r2
            te3.az r1 = r1.f186904i
            int r2 = r1.f297901i
            int r2 = r2 * r4
            int r2 = r2 / r3
            int r3 = r2 % 2
            if (r3 == 0) goto L_0x0218
            int r2 = r2 + -1
        L_0x0218:
            r1.f297902j = r2
            goto L_0x02d3
        L_0x021c:
            te3.iq0 r2 = new te3.iq0
            r2.<init>()
            int r3 = r7.left
            float r3 = (float) r3
            r2.f183717d = r3
            int r3 = r7.top
            float r3 = (float) r3
            r2.f183718e = r3
            int r3 = r7.right
            float r3 = (float) r3
            r2.f183719f = r3
            int r3 = r7.bottom
            float r3 = (float) r3
            r2.f183720g = r3
            r10.f185248P = r2
            boolean r2 = r1.f186912t
            if (r2 == 0) goto L_0x02a9
            te3.cf2 r2 = new te3.cf2
            r2.<init>()
            r2.f182463d = r4
            int r3 = r7.width()
            float r3 = (float) r3
            r2.f182464e = r3
            int r3 = r7.height()
            float r3 = (float) r3
            r2.f182465f = r3
            te3.zy r3 = new te3.zy
            r3.<init>()
            byte[] r4 = r17.toByteArray()
            r3.parseFrom(r4)
            te3.az r4 = r3.f186904i
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            di3.d r7 = di3.C86312j.m106911c(r9)
            tz.f r7 = (p707tz.C65000f) r7
            java.lang.String r7 = r7.ca0()
            r6.append(r7)
            r6.append(r12)
            long r12 = java.lang.System.currentTimeMillis()
            r6.append(r12)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r4.f297896d = r6
            te3.az r4 = r3.f186904i
            float r6 = r2.f182464e
            float r7 = r4.f297900h
            float r6 = r6 * r7
            int r6 = (int) r6
            int r7 = r6 % 2
            if (r7 == 0) goto L_0x0292
            int r6 = r6 + -1
        L_0x0292:
            r4.f297901i = r6
            te3.az r4 = r3.f186904i
            float r6 = r2.f182465f
            float r7 = r4.f297900h
            float r6 = r6 * r7
            int r6 = (int) r6
            int r7 = r6 % 2
            if (r7 == 0) goto L_0x02a3
            int r6 = r6 + -1
        L_0x02a3:
            r4.f297902j = r6
            r2.f182466g = r3
            r10.f185253S = r2
        L_0x02a9:
            te3.az r2 = r1.f186904i
            te3.ep3 r2 = r2.f297899g
            java.util.LinkedList<java.lang.Integer> r3 = r2.f183015d
            r4 = 0
            r3.set(r4, r11)
            java.util.LinkedList<java.lang.Integer> r3 = r2.f183015d
            r4 = 1
            r3.set(r4, r11)
            java.util.LinkedList<java.lang.Integer> r3 = r2.f183015d
            te3.az r4 = r1.f186904i
            int r4 = r4.f297897e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.set(r14, r4)
            java.util.LinkedList<java.lang.Integer> r2 = r2.f183015d
            te3.az r1 = r1.f186904i
            int r1 = r1.f297898f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.set(r5, r1)
        L_0x02d3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54585t.mo75482n(te3.zy):te3.rq2");
    }

    /* renamed from: o */
    public final long mo75483o() {
        C64899zy zyVar = this.f153060p;
        long j = (zyVar != null ? zyVar.f186901f : 0) - (zyVar != null ? zyVar.f186900e : 0);
        if (j < 0) {
            j = 0;
        }
        return j == 0 ? this.f153045A : j;
    }

    public void onDestroy() {
        LinkedList<hi4> linkedList;
        C64899zy zyVar = this.f153060p;
        if (zyVar != null && (linkedList = zyVar.f186899d) != null) {
            for (hi4 hi4 : linkedList) {
                String str = hi4.f183504d;
                C87412m.m108593f(str, "it.path");
                ((C65000f) C86312j.m106911c(C65000f.class)).mo89200py(str);
            }
        }
    }

    /* renamed from: p */
    public final void mo75484p(LinkedList<C64689rq2> linkedList) {
        C64636pq2 pq22 = new C64636pq2();
        pq22.f184875d.addAll(linkedList);
        Bundle bundle = this.f152934b;
        boolean z = bundle != null ? bundle.getBoolean("post_long_video", false) : false;
        C58684b bVar = (C58684b) C86312j.m106911c(C58684b.class);
        Context context = this.f152933a;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        Intent intent = new Intent();
        intent.putExtra("cover_style", mo75441e().mo75457e());
        intent.putExtra("cover_time_ms", mo75441e().mo75458f());
        intent.putExtra("cover_crop_model", mo75441e().mo75456d());
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f152933a);
        intent.putExtra("key_context_id", f != null ? f.f38098n : null);
        if (!this.f153065u) {
            this.f153065u = true;
            intent.putExtra("cover_word_info_WRAP", mo75441e().mo75459g().toByteArray());
        }
        ImageView imageView = this.f153050f;
        if (imageView != null) {
            Context context2 = this.f152933a;
            C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ViewAnimHelper.ViewInfo b = ViewAnimHelper.m90033b(imageView, ((MMActivity) context2).getWindow().getDecorView());
            bVar.getClass();
            ((C61381b) C86312j.m106911c(C61381b.class)).Yp0().mo88197h(activity, intent, b, pq22, 1001, z);
            return;
        }
        C87412m.m108603p("thumbIv");
        throw null;
    }

    /* renamed from: q */
    public final void mo75485q() {
        String str;
        C64636pq2 pq22 = new C64636pq2();
        int i = 0;
        if (this.f153047C == null) {
            ArrayList<String> arrayList = this.f153057m;
            if (!(arrayList == null || (str = (String) C110818d0.m150914L(arrayList)) == null)) {
                C64477jr2 jr22 = new C64477jr2();
                C63679m.C63680a M1 = ((C63679m) C86312j.m106911c(C63679m.class)).mo88483M1(str);
                if (M1 != null) {
                    int i2 = M1.f180525a;
                    int i3 = M1.f180526b;
                    int mp4RotateVFS = ((ISightJNIService) C86312j.m106911c(ISightJNIService.class)).getMp4RotateVFS(str);
                    if (mp4RotateVFS == 90 || mp4RotateVFS == 270) {
                        i2 = M1.f180526b;
                        i3 = M1.f180525a;
                    }
                    C75044y4.m89990b(this.f152933a);
                    float f = (float) i2;
                    float f2 = (float) i3;
                    float f3 = f / f2;
                    if (f3 <= 1.7777778f && 0.5625f <= f3) {
                        zr4 zr4 = new zr4();
                        zr4.f186847d = 0;
                        zr4.f186848e = i3;
                        zr4.f186849f = i2;
                        zr4.f186850g = 0;
                        jr22.f183830d = zr4;
                        jr22.f183836j = zr4;
                        List f4 = C64197v.m75537f(Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f));
                        C48889bp1 bp12 = new C48889bp1();
                        bp12.f131245d.addAll(C110818d0.m150953y0(f4));
                        jr22.f183831e = bp12;
                    } else if (f3 > 1.7777778f) {
                        int i4 = (int) ((f2 * 16.0f) / 9.0f);
                        zr4 zr42 = new zr4();
                        int i5 = (i2 - i4) / 2;
                        zr42.f186847d = i5;
                        zr42.f186848e = i3;
                        zr42.f186849f = i2 - i5;
                        zr42.f186850g = 0;
                        jr22.f183830d = zr42;
                        jr22.f183836j = zr42;
                        Matrix matrix = new Matrix();
                        matrix.postTranslate(-((float) zr42.f186847d), 0.0f);
                        C48889bp1 bp13 = new C48889bp1();
                        float[] fArr = new float[9];
                        matrix.getValues(fArr);
                        bp13.f131245d.addAll(C110823p.m150998X(fArr));
                        jr22.f183831e = bp13;
                        i2 = i4;
                    } else {
                        int i6 = (int) ((f * 16.0f) / 9.0f);
                        zr4 zr43 = new zr4();
                        zr43.f186847d = 0;
                        int i7 = (i3 - i6) / 2;
                        zr43.f186850g = i7;
                        zr43.f186849f = i2;
                        zr43.f186848e = i3 - i7;
                        jr22.f183830d = zr43;
                        jr22.f183836j = zr43;
                        Matrix matrix2 = new Matrix();
                        matrix2.postTranslate(0.0f, -((float) zr43.f186850g));
                        C48889bp1 bp14 = new C48889bp1();
                        float[] fArr2 = new float[9];
                        matrix2.getValues(fArr2);
                        bp14.f131245d.addAll(C110823p.m150998X(fArr2));
                        jr22.f183831e = bp14;
                        i3 = i6;
                    }
                    jr22.f183832f = 0;
                    jr22.f183833g = (int) M1.f180528d;
                    jr22.f183834h = i2;
                    jr22.f183835i = i3;
                    jr22.f183837n = 0;
                    this.f153047C = jr22;
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        ArrayList<String> arrayList2 = this.f153057m;
        C87412m.m108591d(arrayList2);
        for (T next : arrayList2) {
            int i8 = i + 1;
            if (i >= 0) {
                pq22.f184875d.add(C65449m.m77108g(C65449m.f188332a, (String) next, "", this.f153047C, (String) null, (String) null, (C64591nr3) null, 56, (Object) null));
                i = i8;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        Intent intent = new Intent();
        C7335d c = C86312j.m106911c(C58684b.class);
        C87412m.m108593f(c, "getService(ActivityRouter::class.java)");
        Context context = this.f152933a;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        C58684b.Qx0((C58684b) c, (Activity) context, intent, pq22, (C51538uf1) null, true, true, 8, (Object) null);
    }
}
