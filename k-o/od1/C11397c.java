package od1;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import ht1.C60200t1;
import l60.C99342a;
import l60.C99344b;
import lu3.C34379c;
import o40.C61926c;
import od1.C11405h;
import pe3.C47465a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C11991t;
import r60.C101350i;
import t60.C64207e;
import x60.C102564a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: od1.c */
public class C11397c<T extends C47465a> extends C11407i<T> {

    /* renamed from: g */
    public ImageView f33541g;

    /* renamed from: h */
    public ImageView f33542h;

    /* renamed from: i */
    public ViewGroup f33543i;

    /* renamed from: j */
    public int f33544j;

    /* renamed from: n */
    public boolean f33545n;

    /* renamed from: o */
    public C34379c<?> f33546o;

    /* renamed from: p */
    public boolean f33547p;

    /* renamed from: od1.c$a */
    public static final class C11398a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImageView f33548d;

        /* renamed from: e */
        public final /* synthetic */ C11397c<T> f33549e;

        public C11398a(ImageView imageView, C11397c<T> cVar) {
            this.f33548d = imageView;
            this.f33549e = cVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams = this.f33548d.getLayoutParams();
            layoutParams.height = this.f33549e.mo313m3(this.f33548d.getWidth());
            this.f33548d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: od1.c$b */
    public static final class C11399b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C11397c<T> f33550d;

        /* renamed from: e */
        public final /* synthetic */ boolean f33551e;

        public C11399b(C11397c<T> cVar, boolean z) {
            this.f33550d = cVar;
            this.f33551e = z;
        }

        public final void run() {
            FrameLayout frameLayout = this.f33550d.f33565e;
            if (frameLayout != null) {
                int width = frameLayout.getWidth();
                C11397c<T> cVar = this.f33550d;
                View findViewById = cVar.getActivity().findViewById(C0966R.C0970id.f5505gz);
                int height = findViewById != null ? findViewById.getHeight() : 0;
                if (height == 0) {
                    height = cVar.mo313m3(width);
                }
                ImageView imageView = cVar.f33542h;
                ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = height;
                ImageView imageView2 = cVar.f33542h;
                if (imageView2 != null) {
                    imageView2.setLayoutParams(layoutParams);
                }
            }
            this.f33550d.mo312l3(this.f33551e);
        }
    }

    /* renamed from: od1.c$c */
    public static final class C11400c<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ String f33552a;

        /* renamed from: b */
        public final /* synthetic */ C11397c<T> f33553b;

        /* renamed from: c */
        public final /* synthetic */ ImageView f33554c;

        public C11400c(String str, C11397c<T> cVar, ImageView imageView) {
            this.f33552a = str;
            this.f33553b = cVar;
            this.f33554c = imageView;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                String str = this.f33552a;
                C61926c.m72668M(new C11402e(this.f33553b, this.f33554c));
                Log.m105924i("Finder.FinderTopicCoverUIC", "[handleActivityProfileCover] [" + bitmap.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + bitmap.getHeight() + "] allocationByteCount=" + Util.getSizeKB((long) bitmap.getAllocationByteCount()) + " coverUrl=" + str);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11397c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c2 */
    public void mo513c2() {
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(true);
        ViewGroup viewGroup = this.f33543i;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ImageView imageView = this.f33542h;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f33541g;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        C34379c<?> cVar = this.f33546o;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    /* renamed from: e3 */
    public void mo514e3() {
        super.mo514e3();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type android.app.Activity");
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f33544j = displayMetrics.widthPixels;
    }

    /* renamed from: f3 */
    public void mo314f3() {
        super.mo314f3();
        this.f33541g = (ImageView) getActivity().findViewById(C0966R.C0970id.f5499gt);
        this.f33542h = (ImageView) getActivity().findViewById(C0966R.C0970id.f5502gw);
        this.f33543i = (ViewGroup) getActivity().findViewById(C0966R.C0970id.f5501gv);
        mo11406k3();
        int i = (int) (((float) this.f33544j) * 1.3333334f);
        ImageView imageView = this.f33542h;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = i;
        ImageView imageView2 = this.f33542h;
        if (imageView2 != null) {
            imageView2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: i3 */
    public void mo515i3(T t) {
        if (!this.f33545n) {
            super.mo515i3(t);
            if (C11405h.C11406a.m11253a(this)) {
                mo11408o3(getCoverImgUrl());
            } else {
                mo11407n3(false);
            }
            this.f33545n = true;
        }
    }

    /* renamed from: k3 */
    public void mo11406k3() {
        ImageView imageView = this.f33541g;
        if (imageView != null) {
            imageView.post(new C11398a(imageView, this));
        }
    }

    /* renamed from: l3 */
    public void mo312l3(boolean z) {
        ViewGroup viewGroup;
        Log.m105924i("Finder.FinderTopicCoverUIC", "adjustView : ignoreCover " + z);
        if (C11405h.C11406a.m11253a(this) && (viewGroup = this.f33543i) != null) {
            viewGroup.setVisibility(0);
        }
        if (!z && C11405h.C11406a.m11253a(this)) {
            mo11408o3(getCoverImgUrl());
        }
        this.f33547p = true;
    }

    /* renamed from: m3 */
    public int mo313m3(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    /* renamed from: n3 */
    public final void mo11407n3(boolean z) {
        if (!this.f33547p) {
            FrameLayout frameLayout = this.f33565e;
            if (frameLayout != null) {
                frameLayout.post(new C11399b(this, z));
                return;
            }
            return;
        }
        mo312l3(z);
    }

    /* renamed from: o3 */
    public final void mo11408o3(String str) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        ImageView imageView = this.f33541g;
        if (imageView != null) {
            C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85955a(new C11991t(str));
            a.mo138758f(((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.PROFILE_COVER));
            a.f291320d = new C11400c(str, this, imageView);
            ((C99342a) a).mo85954d(imageView);
        }
        Log.m105924i("Finder.FinderTopicCoverUIC", "forceCampaignVisible: ");
        C34379c<?> cVar = this.f33546o;
        if (cVar != null) {
            cVar.cancel(false);
        }
        C119179t tVar = C119157j.f356862d;
        C11401d dVar = new C11401d(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        this.f33546o = jVar.mo183892w(dVar, 2000, false);
    }

    public void setNormalStyle() {
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((MMActivity) activity).getController().mo177049H0(C85875k4.m106211z());
        ViewGroup viewGroup = this.f33543i;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }
}
