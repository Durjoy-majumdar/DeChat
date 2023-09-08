package bt1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.video.LocalVideoCropInfoParcelable;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.view.PhotoView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qo1.C63289e;
import rx3.C13604l;
import sx3.C64197v;
import te3.C51538uf1;
import te3.C64477jr2;
import te3.C64591nr3;
import te3.C64636pq2;
import te3.C64689rq2;
import te3.zr4;
import uq1.C65433e;
import uq1.C65449m;

/* renamed from: bt1.i */
public class C54569i extends C54556b {

    /* renamed from: e */
    public View f153007e;

    /* renamed from: f */
    public PhotoView f153008f;

    /* renamed from: g */
    public TextView f153009g;

    /* renamed from: h */
    public ImageView f153010h;

    /* renamed from: i */
    public View f153011i;

    /* renamed from: j */
    public View f153012j;

    /* renamed from: k */
    public ArrayList<String> f153013k;

    /* renamed from: l */
    public ArrayList<Integer> f153014l;

    /* renamed from: m */
    public ArrayList<String> f153015m = new ArrayList<>();

    /* renamed from: n */
    public ArrayList<C64477jr2> f153016n = new ArrayList<>();

    /* renamed from: bt1.i$a */
    public static final class C54570a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54569i f153017d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<String> f153018e;

        public C54570a(C54569i iVar, ArrayList<String> arrayList) {
            this.f153017d = iVar;
            this.f153018e = arrayList;
        }

        public final void run() {
            String h;
            Bitmap decodeFile;
            C54569i iVar = this.f153017d;
            ArrayList<String> arrayList = this.f153018e;
            ArrayList<String> arrayList2 = iVar.f153013k;
            C87412m.m108591d(arrayList2);
            int i = 0;
            for (T next : arrayList2) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) next;
                    boolean z = i == 0;
                    C87412m.m108594g(str, "file");
                    ArrayList<Integer> arrayList3 = iVar.f153014l;
                    C87412m.m108591d(arrayList3);
                    Integer num = arrayList3.get(i);
                    if (num != null && num.intValue() == 2) {
                        if (arrayList == null || arrayList.size() <= i || Util.isNullOrNil(arrayList.get(i))) {
                            h = C63289e.C63290a.m74586a(C65433e.f188292a, str, (zr4) null, 2, (Object) null);
                        } else {
                            String str2 = arrayList.get(i);
                            C87412m.m108593f(str2, "{\n                    me…[index]\n                }");
                            h = str2;
                        }
                    } else if (arrayList == null || arrayList.size() <= i || Util.isNullOrNil(arrayList.get(i)) || !C86013q1.m106450k(arrayList.get(i))) {
                        if (iVar.f153016n.size() > i && iVar.f153016n.get(i) != null) {
                            C64477jr2 jr22 = iVar.f153016n.get(i);
                            C87412m.m108591d(jr22);
                            if (jr22.f183836j != null) {
                                C65433e eVar = C65433e.f188292a;
                                C64477jr2 jr23 = iVar.f153016n.get(i);
                                C87412m.m108591d(jr23);
                                zr4 zr4 = jr23.f183836j;
                                C87412m.m108591d(zr4);
                                h = eVar.mo89558i(str, zr4);
                            }
                        }
                        Log.m105928w("Finder.PostMixMediaWidget", "no thumb & no thumbRect");
                        h = C65433e.f188292a.mo89557h(str);
                    } else {
                        String str3 = arrayList.get(i);
                        C87412m.m108593f(str3, "{\n                mediaT…List[index]\n            }");
                        h = str3;
                    }
                    String str4 = h;
                    C87412m.m108594g(str4, "thumbFile");
                    Log.m105924i("Finder.PostMixMediaWidget", "showVideoThumb, thumbFile:" + str4 + ", showThumb:" + z);
                    if (!Util.isNullOrNil(str4) && (decodeFile = BitmapUtil.decodeFile(str4)) != null) {
                        MMHandlerThread.postToMainThread(new C54571j(iVar, str4, z, decodeFile, decodeFile));
                    }
                    if (z) {
                        ImageView imageView = iVar.f153010h;
                        if (imageView != null) {
                            imageView.setVisibility(8);
                        } else {
                            C87412m.m108603p("videoPlayIcon");
                            throw null;
                        }
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54569i(Context context) {
        super(context);
        C87412m.m108594g(context, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        if (r1.size() == r0.f153015m.size()) goto L_0x005b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bt1.C54590w mo75451a() {
        /*
            r24 = this;
            r0 = r24
            java.util.ArrayList<java.lang.String> r1 = r0.f153013k
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0011
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r1 = 0
            goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            java.lang.String r4 = "Finder.PostMixMediaWidget"
            if (r1 != 0) goto L_0x0055
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "media list "
            r1.append(r5)
            java.util.ArrayList<java.lang.String> r5 = r0.f153013k
            gy3.C87412m.m108591d(r5)
            int r5 = r5.size()
            r1.append(r5)
            java.lang.String r5 = ", thumb list "
            r1.append(r5)
            java.util.ArrayList<java.lang.String> r5 = r0.f153015m
            int r5 = r5.size()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            java.util.ArrayList<java.lang.String> r1 = r0.f153013k
            gy3.C87412m.m108591d(r1)
            int r1 = r1.size()
            java.util.ArrayList<java.lang.String> r4 = r0.f153015m
            int r4 = r4.size()
            if (r1 != r4) goto L_0x0053
            goto L_0x005b
        L_0x0053:
            r2 = 0
            goto L_0x005b
        L_0x0055:
            java.lang.String r1 = "media list null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x0053
        L_0x005b:
            if (r2 == 0) goto L_0x009c
            te3.pq2 r7 = new te3.pq2
            r7.<init>()
            java.util.ArrayList<java.lang.String> r1 = r0.f153013k
            gy3.C87412m.m108591d(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r1.next()
            int r4 = r3 + 1
            if (r3 < 0) goto L_0x0086
            java.lang.String r2 = (java.lang.String) r2
            java.util.LinkedList<te3.rq2> r5 = r7.f184875d
            te3.rq2 r2 = r0.mo75465j(r3, r2)
            r5.add(r2)
            r3 = r4
            goto L_0x006b
        L_0x0086:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x008b:
            bt1.w r1 = new bt1.w
            r5 = 1
            r6 = 8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 120(0x78, float:1.68E-43)
            r13 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        L_0x009c:
            bt1.w r1 = new bt1.w
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 120(0x78, float:1.68E-43)
            r23 = 0
            r14 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54569i.mo75451a():bt1.w");
    }

    /* renamed from: b */
    public View mo75452b() {
        Context context = this.f152933a;
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        View inflate = ((Activity) context).getLayoutInflater().inflate(C0966R.C0971layout.anl, (ViewGroup) null);
        C87412m.m108593f(inflate, "context as Activity).lay…_post_media_widget, null)");
        this.f153007e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.kk9);
        C87412m.m108593f(findViewById, "rootView.findViewById(co…n.finder.R.id.thumb_view)");
        this.f153008f = (PhotoView) findViewById;
        View view = this.f153007e;
        if (view != null) {
            View findViewById2 = view.findViewById(C0966R.C0970id.gqh);
            C87412m.m108593f(findViewById2, "rootView.findViewById(co…finder.R.id.media_number)");
            this.f153009g = (TextView) findViewById2;
            View view2 = this.f153007e;
            if (view2 != null) {
                View findViewById3 = view2.findViewById(C0966R.C0970id.l6o);
                C87412m.m108593f(findViewById3, "rootView.findViewById(co…der.R.id.video_play_icon)");
                this.f153010h = (ImageView) findViewById3;
                View view3 = this.f153007e;
                if (view3 != null) {
                    View findViewById4 = view3.findViewById(C0966R.C0970id.f358788h33);
                    C87412m.m108593f(findViewById4, "rootView.findViewById(co…n.finder.R.id.multi_icon)");
                    this.f153011i = findViewById4;
                    View view4 = this.f153007e;
                    if (view4 != null) {
                        View findViewById5 = view4.findViewById(C0966R.C0970id.ipu);
                        C87412m.m108593f(findViewById5, "rootView.findViewById(co…n.finder.R.id.reprint_iv)");
                        this.f153012j = findViewById5;
                        View view5 = this.f153007e;
                        if (view5 != null) {
                            return view5;
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

    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo75439c() {
        /*
            r3 = this;
            java.util.ArrayList<java.lang.String> r0 = r3.f153013k
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
            java.lang.String r2 = "[PostMixMediaWidget] widget file:"
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
        throw new UnsupportedOperationException("Method not decompiled: bt1.C54569i.mo75439c():boolean");
    }

    /* renamed from: f */
    public C13604l<Integer, Integer> mo75442f() {
        View view = this.f153007e;
        if (view != null) {
            Integer valueOf = Integer.valueOf(view.getWidth());
            View view2 = this.f153007e;
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
        super.mo75444h();
        Bundle bundle = this.f152934b;
        this.f153013k = bundle != null ? bundle.getStringArrayList("MEDIA_FILE_LIST") : null;
        Bundle bundle2 = this.f152934b;
        this.f153014l = bundle2 != null ? bundle2.getIntegerArrayList("MEDIA_TYPE_LIST") : null;
        Bundle bundle3 = this.f152934b;
        ArrayList<String> stringArrayList = bundle3 != null ? bundle3.getStringArrayList("MEDIA_THUMB_LIST") : null;
        Bundle bundle4 = this.f152934b;
        C87412m.m108591d(bundle4);
        ArrayList<Parcelable> parcelableArrayList = bundle4.getParcelableArrayList("VIDEO_CROP_LIST");
        if (parcelableArrayList != null) {
            for (Parcelable parcelable : parcelableArrayList) {
                if (parcelable == null || !(parcelable instanceof LocalVideoCropInfoParcelable)) {
                    this.f153016n.add((Object) null);
                } else {
                    this.f153016n.add(((LocalVideoCropInfoParcelable) parcelable).f161940d);
                }
            }
        }
        ArrayList<String> arrayList = this.f153013k;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList<String> arrayList2 = this.f153013k;
            C87412m.m108591d(arrayList2);
            if (arrayList2.size() > 1) {
                TextView textView = this.f153009g;
                if (textView != null) {
                    textView.setVisibility(8);
                    TextView textView2 = this.f153009g;
                    if (textView2 != null) {
                        Context context = this.f152933a;
                        ArrayList<String> arrayList3 = this.f153013k;
                        C87412m.m108591d(arrayList3);
                        textView2.setText(context.getString(C0966R.string.dct, new Object[]{Integer.valueOf(arrayList3.size())}));
                        View view = this.f153011i;
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget", "refresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else {
                            C87412m.m108603p("multiIcon");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mediaCountView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mediaCountView");
                    throw null;
                }
            } else {
                TextView textView3 = this.f153009g;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                } else {
                    C87412m.m108603p("mediaCountView");
                    throw null;
                }
            }
            ThreadPool.post(new C54570a(this, stringArrayList), "Finder_Post_Create_Media_Thumb");
        }
    }

    /* renamed from: j */
    public final C64689rq2 mo75465j(int i, String str) {
        C87412m.m108594g(str, "file");
        ArrayList<Integer> arrayList = this.f153014l;
        C64477jr2 jr22 = null;
        Integer num = arrayList != null ? arrayList.get(i) : null;
        if (num != null && 2 == num.intValue()) {
            C65449m mVar = C65449m.f188332a;
            String str2 = this.f153015m.get(i);
            C87412m.m108593f(str2, "thumbFileList[index]");
            return mVar.mo89566e(str, str2);
        }
        C65449m mVar2 = C65449m.f188332a;
        String nullAsNil = Util.nullAsNil(this.f153015m.get(i));
        C87412m.m108593f(nullAsNil, "nullAsNil(thumbFileList[index])");
        if (this.f153016n.size() > i) {
            jr22 = this.f153016n.get(i);
        }
        return C65449m.m77108g(mVar2, str, nullAsNil, jr22, (String) null, (String) null, (C64591nr3) null, 56, (Object) null);
    }

    /* renamed from: k */
    public final PhotoView mo75466k() {
        PhotoView photoView = this.f153008f;
        if (photoView != null) {
            return photoView;
        }
        C87412m.m108603p("thumbIv");
        throw null;
    }

    /* renamed from: l */
    public void mo75467l() {
        C64636pq2 pq22 = new C64636pq2();
        ArrayList<String> arrayList = this.f153013k;
        C87412m.m108591d(arrayList);
        int i = 0;
        for (T next : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                pq22.f184875d.add(mo75465j(i, (String) next));
                i = i2;
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
        C58684b.Qx0((C58684b) c, (Activity) context, intent, pq22, (C51538uf1) null, false, false, 48, (Object) null);
    }

    public void onDestroy() {
    }
}
