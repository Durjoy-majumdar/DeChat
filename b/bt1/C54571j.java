package bt1;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: bt1.j */
public final class C54571j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54569i f153019d;

    /* renamed from: e */
    public final /* synthetic */ String f153020e;

    /* renamed from: f */
    public final /* synthetic */ boolean f153021f;

    /* renamed from: g */
    public final /* synthetic */ Bitmap f153022g;

    /* renamed from: h */
    public final /* synthetic */ Bitmap f153023h;

    /* renamed from: bt1.j$a */
    public static final class C54572a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54569i f153024d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f153025e;

        public C54572a(C54569i iVar, Bitmap bitmap) {
            this.f153024d = iVar;
            this.f153025e = bitmap;
        }

        public final void run() {
            this.f153024d.mo75466k().setImageBitmap(this.f153025e);
        }
    }

    /* renamed from: bt1.j$b */
    public static final class C54573b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C54569i f153026d;

        public C54573b(C54569i iVar) {
            this.f153026d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget$showVideoThumb$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f153026d.mo75467l();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/widget/post/PostMixMediaWidget$showVideoThumb$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C54571j(C54569i iVar, String str, boolean z, Bitmap bitmap, Bitmap bitmap2) {
        this.f153019d = iVar;
        this.f153020e = str;
        this.f153021f = z;
        this.f153022g = bitmap;
        this.f153023h = bitmap2;
    }

    public final void run() {
        this.f153019d.f153015m.add(this.f153020e);
        Log.m105924i("Finder.PostMixMediaWidget", "add thumb file");
        if (this.f153021f) {
            C58784w3 w3Var = C58784w3.f168295a;
            int width = this.f153022g.getWidth();
            int height = this.f153022g.getHeight();
            w3Var.getClass();
            float f = (((float) height) * 1.0f) / ((float) width);
            Integer valueOf = Integer.valueOf(ImageView.ScaleType.FIT_XY.ordinal());
            int i = C58784w3.f168297c;
            Integer valueOf2 = Integer.valueOf(i);
            Integer valueOf3 = Integer.valueOf((int) (((float) i) * f));
            this.f153019d.mo75466k().getLayoutParams().width = valueOf2.intValue();
            this.f153019d.mo75466k().getLayoutParams().height = valueOf3.intValue();
            this.f153019d.mo75466k().setScaleType(ImageView.ScaleType.values()[valueOf.intValue()]);
            this.f153019d.mo75466k().requestLayout();
            this.f153019d.mo75466k().post(new C54572a(this.f153019d, this.f153023h));
            this.f153019d.mo75466k().setOnClickListener(new C54573b(this.f153019d));
        }
    }
}
