package com.tencent.p014mm.plugin.product.p087ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.C103853a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import p755xs.C102720b;

/* renamed from: com.tencent.mm.plugin.product.ui.j */
public class C94307j extends C103853a {

    /* renamed from: d */
    public Context f272470d;

    /* renamed from: e */
    public List<String> f272471e;

    /* renamed from: f */
    public ArrayList<C94309b> f272472f;

    /* renamed from: g */
    public C94308a f272473g = null;

    /* renamed from: com.tencent.mm.plugin.product.ui.j$a */
    public interface C94308a {
    }

    /* renamed from: com.tencent.mm.plugin.product.ui.j$b */
    public class C94309b implements C102720b.C78973a {

        /* renamed from: d */
        public ImageView f272474d = null;

        /* renamed from: e */
        public String f272475e;

        /* renamed from: f */
        public final /* synthetic */ C94307j f272476f;

        /* renamed from: com.tencent.mm.plugin.product.ui.j$b$a */
        public class C94310a implements View.OnClickListener {
            public C94310a(C94307j jVar) {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/product/ui/MallProductImageAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i("MicroMsg.MallProductImageAdapter", "henryyr user: clicked the ImageView");
                C94309b bVar = C94309b.this;
                C94308a aVar = bVar.f272476f.f272473g;
                if (aVar != null) {
                    String str = bVar.f272475e;
                    MallGalleryUI mallGalleryUI = MallGalleryUI.this;
                    boolean z = !mallGalleryUI.f272464i;
                    mallGalleryUI.f272464i = z;
                    if (z) {
                        mallGalleryUI.showTitleView();
                    } else {
                        mallGalleryUI.hideTitleView();
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/product/ui/MallProductImageAdapter$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.product.ui.j$b$b */
        public class C94311b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f272478d;

            public C94311b(Bitmap bitmap) {
                this.f272478d = bitmap;
            }

            public void run() {
                C94309b.this.f272474d.setImageBitmap(this.f272478d);
            }
        }

        public C94309b(C94307j jVar, String str) {
            Class cls = C102720b.class;
            this.f272476f = jVar;
            this.f272475e = str;
            this.f272474d = (ImageView) ((LayoutInflater) jVar.f272470d.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f359931bo3, (ViewGroup) null);
            this.f272474d.setImageBitmap(((C102720b) C86312j.m106911c(cls)).mo142104N6(new C70106c(str)));
            this.f272474d.setOnClickListener(new C94310a(jVar));
            ((C102720b) C86312j.m106911c(cls)).Lu0(this);
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", bitmap = ");
            sb.append(bitmap == null);
            Log.m105918d("MicroMsg.MallProductImageAdapter", sb.toString());
            String str2 = this.f272475e;
            if (str2 != null && str.equals(str2)) {
                this.f272474d.post(new C94311b(bitmap));
            }
        }
    }

    public C94307j(Context context) {
        this.f272470d = context;
        this.f272471e = null;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Log.m105918d("MicroMsg.MallProductImageAdapter", "destroy item");
        ArrayList<C94309b> arrayList = this.f272472f;
        if (arrayList != null) {
            viewGroup.removeView(arrayList.get(i).f272474d);
        }
    }

    public int getCount() {
        List<String> list = this.f272471e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f272472f == null) {
            return super.instantiateItem(viewGroup, i);
        }
        Log.m105918d("MicroMsg.MallProductImageAdapter", "data valid");
        viewGroup.addView(this.f272472f.get(i).f272474d, 0);
        return this.f272472f.get(i).f272474d;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
