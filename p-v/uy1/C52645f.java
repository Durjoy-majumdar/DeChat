package uy1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.game.commlib.util.C41872f;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import java.lang.ref.WeakReference;
import jc0.C21210b;
import kg3.C76577a;
import o90.C100301b;
import p196ln.C76708i;
import p763ym.C53543s;
import p763ym.C79138l;
import p823sg.C101611g;
import p823sg.C90193h;
import q90.C101062d;

/* renamed from: uy1.f */
public class C52645f {

    /* renamed from: e */
    public static final String f146996e = (C41872f.m45392b(C41872f.C41873a.ONE_MONTH) + "image/");

    /* renamed from: f */
    public static C52645f f146997f;

    /* renamed from: a */
    public ColorDrawable f146998a = new ColorDrawable(Color.parseColor("#EFEFF4"));

    /* renamed from: b */
    public Bitmap f146999b;

    /* renamed from: c */
    public C101611g<String, Bitmap> f147000c;

    /* renamed from: d */
    public C101611g<String, Bitmap> f147001d;

    /* renamed from: uy1.f$a */
    public class C52646a implements MStorage.IOnStorageChange {
        public C52646a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            if (((C101062d) C52645f.this.f147000c).check(str)) {
                ((C100301b) C52645f.this.f147000c).mo139557c(str, ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(str, 1, C76577a.m92156g((Context) null)));
            }
        }
    }

    /* renamed from: uy1.f$b */
    public class C52647b implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ C52652e f147003a;

        /* renamed from: b */
        public final /* synthetic */ C52650d f147004b;

        /* renamed from: c */
        public final /* synthetic */ ImageView f147005c;

        /* renamed from: uy1.f$b$a */
        public class C52648a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f147007d;

            public C52648a(Bitmap bitmap) {
                this.f147007d = bitmap;
            }

            public void run() {
                ImageView imageView = C52647b.this.f147005c;
                if (imageView != null) {
                    imageView.setImageBitmap(this.f147007d);
                }
            }
        }

        public C52647b(C52652e eVar, C52650d dVar, ImageView imageView) {
            this.f147003a = eVar;
            this.f147004b = dVar;
            this.f147005c = imageView;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            Log.m105918d("MicroMsg.GameImageUtil", "onImageLoadStart, url: " + str);
            C52652e eVar = this.f147003a;
            if (eVar != null) {
                eVar.mo65433b(str, view);
            }
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Bitmap bitmap;
            Log.m105918d("MicroMsg.GameImageUtil", "onImageLoadFinish, url: " + str);
            if (bVar != null && (bitmap = bVar.f59988d) != null) {
                if (this.f147004b.f147016d) {
                    C52645f.this.getClass();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        int width = bitmap.getHeight() > bitmap.getWidth() ? bitmap.getWidth() : bitmap.getHeight();
                        bitmap = BitmapUtil.getCenterCropBitmap(bitmap, width, width, false);
                    }
                }
                this.f147004b.getClass();
                if (this.f147004b.f147019g > 0.0f) {
                    bitmap = BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * this.f147004b.f147019g);
                }
                if (this.f147004b.f147013a) {
                    ((C100301b) C52645f.this.f147001d).mo139557c(str, bitmap);
                }
                MMHandlerThread.postToMainThread(new C52648a(bitmap));
                C52652e eVar = this.f147003a;
                if (eVar != null) {
                    eVar.mo65432a(view, bitmap);
                }
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    /* renamed from: uy1.f$c */
    public class C52649c implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public final /* synthetic */ String f147009d;

        /* renamed from: e */
        public final /* synthetic */ float f147010e;

        /* renamed from: f */
        public final /* synthetic */ WeakReference f147011f;

        public C52649c(String str, float f, WeakReference weakReference) {
            this.f147009d = str;
            this.f147010e = f;
            this.f147011f = weakReference;
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Bitmap ub;
            if (this.f147009d.equals(str) && (ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(this.f147009d, 1, this.f147010e)) != null) {
                WeakReference weakReference = this.f147011f;
                if (!(weakReference == null || weakReference.get() == null)) {
                    ((ImageView) this.f147011f.get()).setImageBitmap(ub);
                }
                ((C100301b) C52645f.this.f147000c).put(this.f147009d, ub);
                ((C53543s) C86312j.m106911c(C53543s.class)).Gk0().remove(this);
            }
        }
    }

    /* renamed from: uy1.f$d */
    public static class C52650d {

        /* renamed from: a */
        public final boolean f147013a;

        /* renamed from: b */
        public final boolean f147014b;

        /* renamed from: c */
        public final boolean f147015c;

        /* renamed from: d */
        public final boolean f147016d;

        /* renamed from: e */
        public final boolean f147017e;

        /* renamed from: f */
        public final int f147018f;

        /* renamed from: g */
        public final float f147019g;

        /* renamed from: uy1.f$d$a */
        public static class C52651a {

            /* renamed from: a */
            public boolean f147020a = true;

            /* renamed from: b */
            public boolean f147021b = true;

            /* renamed from: c */
            public boolean f147022c = false;

            /* renamed from: d */
            public boolean f147023d = false;

            /* renamed from: e */
            public boolean f147024e = true;

            /* renamed from: f */
            public int f147025f = 0;

            /* renamed from: g */
            public float f147026g = 0.0f;

            /* renamed from: a */
            public C52650d mo73598a() {
                return new C52650d(this, (C52646a) null);
            }
        }

        public C52650d(C52651a aVar, C52646a aVar2) {
            this.f147013a = aVar.f147020a;
            this.f147014b = aVar.f147021b;
            this.f147015c = aVar.f147022c;
            this.f147016d = aVar.f147023d;
            this.f147017e = aVar.f147024e;
            this.f147018f = aVar.f147025f;
            this.f147019g = aVar.f147026g;
        }
    }

    /* renamed from: uy1.f$e */
    public interface C52652e {
        /* renamed from: a */
        void mo65432a(View view, Bitmap bitmap);

        /* renamed from: b */
        void mo65433b(String str, View view);
    }

    public C52645f() {
        Class<C52645f> cls = C52645f.class;
        this.f147000c = new C100301b(6, cls);
        this.f147001d = new C100301b(15, cls);
        try {
            Bitmap decodeStream = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
            this.f146999b = decodeStream;
            if (decodeStream != null && !decodeStream.isRecycled()) {
                Bitmap bitmap = this.f146999b;
                BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.5f);
            }
        } catch (Exception e) {
            Log.m105924i("MicroMsg.GameImageUtil", e.getMessage());
        }
        ((C53543s) C86312j.m106911c(C53543s.class)).Gk0().add(new C52646a());
    }

    /* renamed from: a */
    public static C52645f m59023a() {
        if (f146997f == null) {
            synchronized (C52645f.class) {
                if (f146997f == null) {
                    f146997f = new C52645f();
                }
            }
        }
        return f146997f;
    }

    /* renamed from: b */
    public void mo73592b(ImageView imageView, String str, float f) {
        Bitmap bitmap;
        if (imageView != null && !Util.isNullOrNil(str)) {
            if (!((C101062d) this.f147000c).check(str) || (bitmap = (Bitmap) ((C100301b) this.f147000c).mo139556b(str)) == null || bitmap.isRecycled()) {
                Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(str, 1, f);
                if (ub == null || ub.isRecycled()) {
                    ((C53543s) C86312j.m106911c(C53543s.class)).Gk0().add(new C52649c(str, f, new WeakReference(imageView)));
                    return;
                }
                imageView.setImageBitmap(ub);
                ((C100301b) this.f147000c).put(str, ub);
                return;
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: c */
    public Bitmap mo73593c(ImageView imageView, String str) {
        Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(str);
        if (N50 == null || N50.isRecycled()) {
            Bitmap bitmap = this.f146999b;
            if (bitmap == null || bitmap.isRecycled()) {
                try {
                    this.f146999b = BackwardSupportUtil.BitmapFactory.decodeStream(MMApplicationContext.getContext().getAssets().open("avatar/default_nor_avatar.png"), C76577a.m92156g((Context) null));
                } catch (Exception unused) {
                }
            }
            Bitmap bitmap2 = this.f146999b;
            if (!(bitmap2 == null || bitmap2.isRecycled() || imageView == null)) {
                imageView.setImageBitmap(this.f146999b);
            }
            return this.f146999b;
        }
        if (imageView != null) {
            imageView.setImageBitmap(N50);
        }
        return N50;
    }

    /* renamed from: d */
    public final void mo73594d(ImageView imageView, String str, C52650d dVar, C52652e eVar) {
        C20937c.C20939b bVar = new C20937c.C20939b();
        dVar.getClass();
        bVar.f59345a = true;
        String str2 = f146996e;
        C86009m1 m1Var = new C86009m1(str2);
        if (!m1Var.mo119967g()) {
            if (!m1Var.mo119974l().mo119967g()) {
                C86009m1 l = m1Var.mo119974l();
                C86009m1 m1Var2 = new C86009m1(l.mo119971i() + System.currentTimeMillis());
                if (m1Var2.mo119987x()) {
                    m1Var2.mo119988y(l);
                } else {
                    Log.m105921e("MicroMsg.GameImageUtil", "mkdir error, %s", l.mo119971i());
                }
            }
            if (!m1Var.mo119987x() || !m1Var.mo119977o()) {
                Log.m105921e("MicroMsg.GameImageUtil", "mkdir error. %s", str2);
            }
        }
        bVar.f59346b = dVar.f147014b;
        bVar.f59350f = str2 + C90193h.m112878f(str.getBytes());
        bVar.f59364t = dVar.f147015c;
        bVar.f59363s = false;
        if (imageView != null && dVar.f147017e) {
            int i = dVar.f147018f;
            if (i == 0) {
                imageView.setImageDrawable(this.f146998a);
            } else {
                imageView.setImageResource(i);
            }
        }
        C20828a.m22825b().mo32520i(str, (ImageView) null, bVar.mo32666a(), new C52647b(eVar, dVar, imageView));
    }

    /* renamed from: e */
    public void mo73595e(ImageView imageView, String str, C52650d dVar, C52652e eVar) {
        Bitmap bitmap;
        if (!Util.isNullOrNil(str)) {
            if (dVar == null) {
                dVar = new C52650d.C52651a().mo73598a();
            }
            boolean z = false;
            if (dVar.f147013a && ((C101062d) this.f147001d).check(str) && (bitmap = (Bitmap) ((C100301b) this.f147001d).mo139556b(str)) != null && !bitmap.isRecycled()) {
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                if (eVar != null) {
                    eVar.mo65432a(imageView, bitmap);
                }
                z = true;
            }
            if (!z) {
                mo73594d(imageView, str, dVar, eVar);
            }
        }
    }

    /* renamed from: f */
    public void mo73596f(ImageView imageView, String str, int i, int i2, int i3) {
        C52653g gVar = new C52653g(this, imageView, i2, i, i3);
        Log.m105918d("MicroMsg.GameImageUtil", "getBitmapWithWH, start");
        Bitmap bitmap = (Bitmap) ((C100301b) this.f147001d).mo139556b(str);
        if (bitmap == null || bitmap.isRecycled()) {
            mo73594d((ImageView) null, str, new C52650d.C52651a().mo73598a(), new C52655h(this, gVar, i, i2, 0, str));
        } else {
            gVar.mo65432a((View) null, bitmap);
        }
    }
}
