package bt1;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.view.ImageIndicatorView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58784w3;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import p823sg.C48380r;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import te3.C64689rq2;
import te3.C64726td1;
import te3.C64839xt2;
import zt3.C119157j;

/* renamed from: bt1.g */
public final class C54564g extends C54556b {

    /* renamed from: e */
    public View f152986e;

    /* renamed from: f */
    public ImageView f152987f;

    /* renamed from: g */
    public View f152988g;

    /* renamed from: h */
    public ArrayList<String> f152989h;

    /* renamed from: i */
    public ArrayList<Integer> f152990i;

    /* renamed from: j */
    public ArrayList<String> f152991j = new ArrayList<>();

    /* renamed from: k */
    public C64839xt2 f152992k;

    /* renamed from: l */
    public ArrayList<String> f152993l;

    /* renamed from: m */
    public ArrayList<String> f152994m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<Rect> f152995n;

    /* renamed from: bt1.g$a */
    public static final class C54565a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54564g f152996d;

        public C54565a(C54564g gVar) {
            this.f152996d = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((PostMainUIC) C39818r.f106831a.mo62443b(this.f152996d.f152933a).mo75002a(PostMainUIC.class)).mo78427i3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refresh$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54564g(Context context, int i, int i2, C8480h hVar) {
        super(context);
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.graphics.Rect} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0078, code lost:
        if (r2.size() == r0.f152991j.size()) goto L_0x0083;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bt1.C54590w mo75451a() {
        /*
            r26 = this;
            r0 = r26
            bt1.e r1 = r26.mo75441e()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.f152943A
            if (r1 == 0) goto L_0x002a
            bt1.e r2 = r26.mo75441e()
            java.util.LinkedList<te3.rq2> r2 = r2.f152958P
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r2)
            if (r2 != 0) goto L_0x002a
            bt1.w r2 = new bt1.w
            r4 = 1
            int r5 = r1.getMediaType()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 120(0x78, float:1.68E-43)
            r12 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L_0x002a:
            java.util.ArrayList<java.lang.String> r2 = r0.f152989h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0039
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r2 = 0
            goto L_0x003a
        L_0x0039:
            r2 = 1
        L_0x003a:
            java.lang.String r5 = "Finder.PostImageWidget"
            if (r2 != 0) goto L_0x007d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "img list "
            r2.append(r6)
            java.util.ArrayList<java.lang.String> r6 = r0.f152989h
            gy3.C87412m.m108591d(r6)
            int r6 = r6.size()
            r2.append(r6)
            java.lang.String r6 = ", thumb list "
            r2.append(r6)
            java.util.ArrayList<java.lang.String> r6 = r0.f152991j
            int r6 = r6.size()
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            java.util.ArrayList<java.lang.String> r2 = r0.f152989h
            gy3.C87412m.m108591d(r2)
            int r2 = r2.size()
            java.util.ArrayList<java.lang.String> r6 = r0.f152991j
            int r6 = r6.size()
            if (r2 != r6) goto L_0x007b
            goto L_0x0083
        L_0x007b:
            r3 = 0
            goto L_0x0083
        L_0x007d:
            java.lang.String r2 = "img list null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x007b
        L_0x0083:
            if (r3 == 0) goto L_0x01ce
            te3.pq2 r9 = new te3.pq2
            r9.<init>()
            java.util.ArrayList<java.lang.String> r1 = r0.f152989h
            gy3.C87412m.m108591d(r1)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x0094:
            boolean r3 = r1.hasNext()
            r6 = 0
            if (r3 == 0) goto L_0x014e
            java.lang.Object r3 = r1.next()
            int r7 = r2 + 1
            if (r2 < 0) goto L_0x014a
            java.lang.String r3 = (java.lang.String) r3
            java.util.LinkedList<te3.rq2> r8 = r9.f184875d
            uq1.m r10 = uq1.C65449m.f188332a
            java.util.ArrayList<java.lang.String> r11 = r0.f152991j
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r12 = "thumbFileList[index]"
            gy3.C87412m.m108593f(r11, r12)
            java.lang.String r11 = (java.lang.String) r11
            te3.rq2 r3 = r10.mo89566e(r3, r11)
            te3.xb1 r10 = new te3.xb1
            r10.<init>()
            java.util.ArrayList<java.lang.Integer> r11 = r0.f152990i
            if (r11 == 0) goto L_0x00e7
            java.lang.Object r11 = sx3.C110818d0.m150917O(r11, r2)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L_0x00e7
            int r11 = r11.intValue()
            float r12 = (float) r11
            r10.f186286h = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "codec_info hdimg_score:"
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r11)
        L_0x00e7:
            r3.f185236C = r10
            java.util.ArrayList<java.lang.String> r10 = r0.f152993l
            if (r10 == 0) goto L_0x00f4
            java.lang.Object r10 = sx3.C110818d0.m150917O(r10, r2)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x00f5
        L_0x00f4:
            r10 = r6
        L_0x00f5:
            java.util.ArrayList<java.lang.String> r11 = r0.f152994m
            java.lang.Object r11 = sx3.C110818d0.m150917O(r11, r2)
            java.lang.String r11 = (java.lang.String) r11
            java.util.ArrayList<android.graphics.Rect> r12 = r0.f152995n
            if (r12 == 0) goto L_0x0108
            java.lang.Object r2 = sx3.C110818d0.m150917O(r12, r2)
            r6 = r2
            android.graphics.Rect r6 = (android.graphics.Rect) r6
        L_0x0108:
            if (r10 == 0) goto L_0x0144
            if (r11 == 0) goto L_0x0144
            if (r6 == 0) goto L_0x0144
            te3.cf2 r2 = new te3.cf2
            r2.<init>()
            r2.f182467h = r10
            er1.j4 r12 = er1.C58739j4.f168176a
            android.graphics.Point r10 = r12.mo83725x(r10)
            int r12 = r10.x
            float r12 = (float) r12
            r2.f182464e = r12
            int r10 = r10.y
            float r10 = (float) r10
            r2.f182465f = r10
            r2.f182463d = r11
            r3.f185253S = r2
            te3.iq0 r2 = new te3.iq0
            r2.<init>()
            int r10 = r6.left
            float r10 = (float) r10
            r2.f183717d = r10
            int r10 = r6.top
            float r10 = (float) r10
            r2.f183718e = r10
            int r10 = r6.right
            float r10 = (float) r10
            r2.f183719f = r10
            int r6 = r6.bottom
            float r6 = (float) r6
            r2.f183720g = r6
            r3.f185248P = r2
        L_0x0144:
            r8.add(r3)
            r2 = r7
            goto L_0x0094
        L_0x014a:
            sx3.C64197v.m75542k()
            throw r6
        L_0x014e:
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x0159
            java.lang.String r2 = "ORIGIN_MUSIC_ID"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x015a
        L_0x0159:
            r1 = r6
        L_0x015a:
            r9.f184877f = r1
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x0167
            java.lang.String r2 = "ORIGIN_MUSIC_PATH"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0168
        L_0x0167:
            r1 = r6
        L_0x0168:
            r9.f184878g = r1
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x0175
            java.lang.String r2 = "ORIGIN_BGM_URL"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0176
        L_0x0175:
            r1 = r6
        L_0x0176:
            r9.f184879h = r1
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x0183
            java.lang.String r2 = "MEDIA_IS_MUTE"
            boolean r1 = r1.getBoolean(r2, r4)
            goto L_0x0184
        L_0x0183:
            r1 = 0
        L_0x0184:
            r9.f184880i = r1
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x0191
            java.lang.String r2 = "MUSIC_IS_MUTE"
            boolean r1 = r1.getBoolean(r2, r4)
            goto L_0x0192
        L_0x0191:
            r1 = 0
        L_0x0192:
            r9.f184881j = r1
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x019e
            java.lang.String r2 = "SOUND_TRACK_TYPE"
            int r4 = r1.getInt(r2, r4)
        L_0x019e:
            r9.f184882n = r4
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x01ab
            java.lang.String r2 = "MUSIC_FEED_ID"
            java.lang.String r1 = r1.getString(r2)
            goto L_0x01ac
        L_0x01ab:
            r1 = r6
        L_0x01ac:
            r9.f184883o = r1
            te3.td1 r1 = r0.f152935c
            r9.f184876e = r1
            android.os.Bundle r1 = r0.f152934b
            if (r1 == 0) goto L_0x01bc
            java.lang.String r2 = "ORIGIN_FILE_PATH"
            java.lang.String r6 = r1.getString(r2)
        L_0x01bc:
            r9.f184885q = r6
            bt1.w r1 = new bt1.w
            r7 = 1
            r8 = 2
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 120(0x78, float:1.68E-43)
            r15 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r1
        L_0x01ce:
            bt1.w r2 = new bt1.w
            r17 = 0
            if (r1 == 0) goto L_0x01db
            int r4 = r1.getMediaType()
            r18 = r4
            goto L_0x01dd
        L_0x01db:
            r18 = 0
        L_0x01dd:
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 120(0x78, float:1.68E-43)
            r25 = 0
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54564g.mo75451a():bt1.w");
    }

    /* renamed from: b */
    public View mo75452b() {
        Context context = this.f152933a;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        View inflate = ((Activity) context).getLayoutInflater().inflate(C0966R.C0971layout.anj, (ViewGroup) null);
        C87412m.m108593f(inflate, "context as Activity).lay…_post_image_widget, null)");
        this.f152986e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.kk9);
        C87412m.m108593f(findViewById, "rootView.findViewById(co…n.finder.R.id.thumb_view)");
        this.f152987f = (ImageView) findViewById;
        View view = this.f152986e;
        if (view != null) {
            View findViewById2 = view.findViewById(C0966R.C0970id.ipu);
            C87412m.m108593f(findViewById2, "rootView.findViewById(co…n.finder.R.id.reprint_iv)");
            this.f152988g = findViewById2;
            View view2 = this.f152986e;
            if (view2 != null) {
                return view2;
            }
            C87412m.m108603p("rootView");
            throw null;
        }
        C87412m.m108603p("rootView");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo75439c() {
        /*
            r3 = this;
            java.util.ArrayList<java.lang.String> r0 = r3.f152989h
            if (r0 == 0) goto L_0x003d
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0020
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 != 0) goto L_0x0008
        L_0x0020:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "image widget file:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = " lost!"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.PostVideoWidget"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 0
            return r0
        L_0x003d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54564g.mo75439c():boolean");
    }

    /* renamed from: d */
    public void mo75440d() {
        this.f152989h = null;
        this.f152990i = null;
        this.f152991j.clear();
        this.f152992k = null;
        this.f152935c = null;
        this.f152993l = null;
        this.f152994m.clear();
        this.f152995n = null;
    }

    /* renamed from: f */
    public C13604l<Integer, Integer> mo75442f() {
        View view = this.f152986e;
        if (view != null) {
            Integer valueOf = Integer.valueOf(view.getWidth());
            View view2 = this.f152986e;
            if (view2 != null) {
                return new C13604l<>(valueOf, Integer.valueOf(view2.getHeight()));
            }
            C87412m.m108603p("rootView");
            throw null;
        }
        C87412m.m108603p("rootView");
        throw null;
    }

    /* renamed from: h */
    public void mo75444h() {
        byte[] byteArray;
        byte[] byteArray2;
        C64726td1 td12;
        C64689rq2 rq22;
        super.mo75444h();
        C13598b0 b0Var = null;
        if (mo75441e().f152943A == null || Util.isNullOrNil((List) mo75441e().f152958P)) {
            Bundle bundle = this.f152934b;
            this.f152989h = bundle != null ? bundle.getStringArrayList("image_file_list") : null;
            Bundle bundle2 = this.f152934b;
            this.f152990i = bundle2 != null ? bundle2.getIntegerArrayList("image_quality_list") : null;
            Bundle bundle3 = this.f152934b;
            boolean z = false;
            if (!(bundle3 == null || (byteArray2 = bundle3.getByteArray("MEDIA_EXTRA_MUSIC")) == null)) {
                C64839xt2 xt22 = new C64839xt2();
                try {
                    xt22.parseFrom(byteArray2);
                } catch (Exception e) {
                    Log.printDebugStack("safeParser", "", e);
                    xt22 = null;
                }
                this.f152992k = xt22;
                StringBuilder sb = new StringBuilder();
                sb.append("post image with music: ");
                C64839xt2 xt23 = this.f152992k;
                sb.append(xt23 != null ? Integer.valueOf(xt23.f186384d) : null);
                Log.m105924i("Finder.PostImageWidget", sb.toString());
                C64839xt2 xt24 = this.f152992k;
                if (xt24 == null) {
                    td12 = null;
                } else {
                    td12 = new C64726td1();
                    td12.f185534d = xt24.f186399v == 1 ? String.valueOf(xt24.f186400w) : String.valueOf(xt24.f186384d);
                    td12.f185545r = xt24.f186399v;
                    td12.f185535e = xt24.f186392o;
                    td12.f185536f = xt24.f186389i;
                    LinkedList<String> linkedList = xt24.f186390j;
                    td12.f185537g = linkedList != null ? (String) C110818d0.m150916N(linkedList) : null;
                    td12.f185539i = xt24.f186387g;
                }
                this.f152935c = td12;
            }
            Bundle bundle4 = this.f152934b;
            if (!(bundle4 == null || (byteArray = bundle4.getByteArray("ORIGIN_MUSIC_INFO")) == null)) {
                C64726td1 td13 = new C64726td1();
                try {
                    td13.parseFrom(byteArray);
                } catch (Exception e2) {
                    Log.printDebugStack("safeParser", "", e2);
                    td13 = null;
                }
                this.f152935c = td13;
            }
            Bundle bundle5 = this.f152934b;
            this.f152993l = bundle5 != null ? bundle5.getStringArrayList("half_image_file_list") : null;
            Bundle bundle6 = this.f152934b;
            this.f152995n = bundle6 != null ? bundle6.getParcelableArrayList("HALF_RECT_LIST") : null;
            if (this.f152935c == null) {
                Bundle bundle7 = this.f152934b;
                String string = bundle7 != null ? bundle7.getString("ORIGIN_BGM_URL") : null;
                Bundle bundle8 = this.f152934b;
                String string2 = bundle8 != null ? bundle8.getString("ORIGIN_MUSIC_PATH") : null;
                if (string == null || string.length() == 0) {
                    string = C48380r.m53726a(string2, true);
                }
                if (!(string == null || string.length() == 0)) {
                    C64726td1 td14 = new C64726td1();
                    td14.f185539i = string;
                    this.f152935c = td14;
                }
            }
            ArrayList<String> arrayList = this.f152989h;
            if (arrayList != null) {
                String str = (String) C110818d0.m150916N(arrayList);
            }
            Bundle bundle9 = this.f152934b;
            ArrayList<String> stringArrayList = bundle9 != null ? bundle9.getStringArrayList("image_thumb_list") : null;
            ArrayList<String> arrayList2 = this.f152989h;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ((C119157j) C119157j.f356862d).mo183876g(new C54566h(this, stringArrayList), "Finder_Post_Create_Image_Thumb");
            }
            View view = this.f152986e;
            if (view != null) {
                ImageIndicatorView imageIndicatorView = (ImageIndicatorView) view.findViewById(C0966R.C0970id.f4i);
                if (imageIndicatorView != null) {
                    imageIndicatorView.setVisibility(0);
                }
                ArrayList<String> arrayList3 = this.f152989h;
                if (arrayList3 != null) {
                    if (arrayList3.size() > 0) {
                        z = true;
                    }
                    if (!z) {
                        arrayList3 = null;
                    }
                    if (!(arrayList3 == null || imageIndicatorView == null)) {
                        imageIndicatorView.f21258e = arrayList3.size();
                        b0Var = C13598b0.f38549a;
                    }
                }
                if (b0Var == null && imageIndicatorView != null) {
                    imageIndicatorView.setVisibility(8);
                    return;
                }
                return;
            }
            C87412m.m108603p("rootView");
            throw null;
        }
        LinkedList<C64689rq2> linkedList2 = mo75441e().f152958P;
        if (!(linkedList2 == null || (rq22 = (C64689rq2) C110818d0.m150916N(linkedList2)) == null)) {
            mo75443g(rq22);
        }
        ImageView imageView = this.f152987f;
        if (imageView != null) {
            imageView.setOnClickListener(new C54565a(this));
        } else {
            C87412m.m108603p("thumbIv");
            throw null;
        }
    }

    /* renamed from: i */
    public void mo75445i(Bitmap bitmap) {
        View rootView;
        Bitmap bitmap2 = bitmap;
        C87412m.m108594g(bitmap2, "thumb");
        C58784w3 w3Var = C58784w3.f168295a;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        w3Var.getClass();
        float f = (float) height;
        float f2 = 1.0f;
        float f3 = (f * 1.0f) / ((float) width);
        if (f3 > 1.3333334f) {
            f2 = 1.3333334f;
        } else if (f3 >= 1.0f) {
            f2 = f3;
        }
        Integer valueOf = Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal());
        int i = C58784w3.f168297c;
        Integer valueOf2 = Integer.valueOf(i);
        Integer valueOf3 = Integer.valueOf((int) (((float) i) * f2));
        int intValue = valueOf2.intValue();
        int intValue2 = valueOf3.intValue();
        ImageView imageView = this.f152987f;
        if (imageView != null) {
            imageView.getLayoutParams().width = intValue;
            ImageView imageView2 = this.f152987f;
            if (imageView2 != null) {
                imageView2.getLayoutParams().height = intValue2;
                View view = this.f152986e;
                if (view != null) {
                    ((LinearLayout) view.findViewById(C0966R.C0970id.ayn)).getLayoutParams().width = intValue;
                    View view2 = this.f152986e;
                    if (view2 != null) {
                        ((ImageIndicatorView) view2.findViewById(C0966R.C0970id.f4i)).getLayoutParams().width = intValue;
                        View view3 = this.f152986e;
                        if (view3 != null) {
                            ViewParent parent = view3.getParent();
                            LinearLayout linearLayout = parent instanceof LinearLayout ? (LinearLayout) parent : null;
                            TextView textView = (linearLayout == null || (rootView = linearLayout.getRootView()) == null) ? null : (TextView) rootView.findViewById(C0966R.C0970id.i0e);
                            ViewGroup.LayoutParams layoutParams = linearLayout != null ? linearLayout.getLayoutParams() : null;
                            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
                            if (textView != null) {
                                textView.setTextColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.a7f));
                            }
                            if (layoutParams2 != null) {
                                View view4 = this.f152986e;
                                if (view4 != null) {
                                    Resources resources = view4.getResources();
                                    layoutParams2.topMargin = (resources != null ? Integer.valueOf((int) resources.getDimension(C0966R.dimen.f3750d1)) : null).intValue();
                                } else {
                                    C87412m.m108603p("rootView");
                                    throw null;
                                }
                            }
                            View view5 = this.f152986e;
                            if (view5 != null) {
                                View findViewById = view5.findViewById(C0966R.C0970id.euy);
                                if (findViewById != null) {
                                    C9556a aVar = new C9556a();
                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                    aVar.mo10233c(8);
                                    View view6 = findViewById;
                                    C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/plugin/finder/widget/post/PostImageWidget", "showThumb", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                    C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/widget/post/PostImageWidget", "showThumb", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                }
                                if (linearLayout != null) {
                                    linearLayout.setLayoutParams(layoutParams2);
                                }
                                ImageView imageView3 = this.f152987f;
                                if (imageView3 != null) {
                                    imageView3.setScaleType(ImageView.ScaleType.values()[valueOf.intValue()]);
                                    ImageView imageView4 = this.f152987f;
                                    if (imageView4 != null) {
                                        imageView4.requestLayout();
                                        ImageView imageView5 = this.f152987f;
                                        if (imageView5 != null) {
                                            imageView5.setImageBitmap(bitmap2);
                                            ImageView imageView6 = this.f152987f;
                                            if (imageView6 != null) {
                                                imageView6.setVisibility(0);
                                            } else {
                                                C87412m.m108603p("thumbIv");
                                                throw null;
                                            }
                                        } else {
                                            C87412m.m108603p("thumbIv");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("thumbIv");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("thumbIv");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("rootView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("rootView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("rootView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("rootView");
                    throw null;
                }
            } else {
                C87412m.m108603p("thumbIv");
                throw null;
            }
        } else {
            C87412m.m108603p("thumbIv");
            throw null;
        }
    }

    public void onDestroy() {
    }
}
