package bt1;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8479f0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo1.C63289e;
import sx3.C110818d0;
import sx3.C64197v;
import te3.zr4;
import uq1.C65433e;

/* renamed from: bt1.h */
public final class C54566h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54564g f152997d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList<String> f152998e;

    /* renamed from: bt1.h$a */
    public static final class C54567a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54564g f152999d;

        /* renamed from: e */
        public final /* synthetic */ String f153000e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<String> f153001f;

        /* renamed from: g */
        public final /* synthetic */ Bitmap f153002g;

        /* renamed from: h */
        public final /* synthetic */ int f153003h;

        /* renamed from: i */
        public final /* synthetic */ boolean f153004i;

        /* renamed from: j */
        public final /* synthetic */ C8479f0<Bitmap> f153005j;

        /* renamed from: bt1.h$a$a */
        public static final class C54568a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C54564g f153006d;

            public C54568a(C54564g gVar) {
                this.f153006d = gVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refreshByIntent$4$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((PostMainUIC) C39818r.f106831a.mo62443b(this.f153006d.f152933a).mo75002a(PostMainUIC.class)).mo78427i3();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostImageWidget$refreshByIntent$4$1$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C54567a(C54564g gVar, String str, C8479f0<String> f0Var, Bitmap bitmap, int i, boolean z, C8479f0<Bitmap> f0Var2) {
            this.f152999d = gVar;
            this.f153000e = str;
            this.f153001f = f0Var;
            this.f153002g = bitmap;
            this.f153003h = i;
            this.f153004i = z;
            this.f153005j = f0Var2;
        }

        public final void run() {
            this.f152999d.f152991j.add(this.f153000e);
            T t = this.f153001f.f27484d;
            if (!(t == null || this.f153002g == null)) {
                ArrayList<String> arrayList = this.f152999d.f152994m;
                C87412m.m108591d(t);
                arrayList.add(t);
            }
            Log.m105924i("Finder.PostImageWidget", "add thumb file, index:" + this.f153003h);
            if (this.f153004i) {
                C54564g gVar = this.f152999d;
                T t2 = this.f153005j.f27484d;
                C87412m.m108593f(t2, "thumb");
                gVar.mo75445i((Bitmap) t2);
                C54564g gVar2 = this.f152999d;
                ImageView imageView = gVar2.f152987f;
                if (imageView != null) {
                    imageView.setOnClickListener(new C54568a(gVar2));
                } else {
                    C87412m.m108603p("thumbIv");
                    throw null;
                }
            }
        }
    }

    public C54566h(C54564g gVar, ArrayList<String> arrayList) {
        this.f152997d = gVar;
        this.f152998e = arrayList;
    }

    public final void run() {
        String str;
        ArrayList<String> arrayList = this.f152997d.f152989h;
        C87412m.m108591d(arrayList);
        ArrayList<String> arrayList2 = this.f152998e;
        C54564g gVar = this.f152997d;
        int i = 0;
        for (T next : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                String str2 = (String) next;
                boolean z = i == 0;
                String a = (arrayList2 == null || arrayList2.size() <= i || Util.isNullOrNil(arrayList2.get(i))) ? C63289e.C63290a.m74586a(C65433e.f188292a, str2, (zr4) null, 2, (Object) null) : arrayList2.get(i);
                C8479f0 f0Var = new C8479f0();
                ArrayList<String> arrayList3 = gVar.f152993l;
                if (!(arrayList3 == null || (str = (String) C110818d0.m150917O(arrayList3, i)) == null)) {
                    f0Var.f27484d = C63289e.C63290a.m74586a(C65433e.f188292a, str, (zr4) null, 2, (Object) null);
                }
                if (!Util.isNullOrNil(a)) {
                    C8479f0 f0Var2 = new C8479f0();
                    f0Var2.f27484d = BitmapUtil.decodeFile(a);
                    Bitmap decodeFile = BitmapUtil.decodeFile((String) f0Var.f27484d);
                    if (((Bitmap) f0Var2.f27484d) != null) {
                        MMHandlerThread.postToMainThread(new C54567a(gVar, a, f0Var, decodeFile, i, z, f0Var2));
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
