package com.tencent.p014mm.plugin.gallery.p473ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C16665p;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import hd0.C98429r0;
import j20.C117292a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ow1.C100562c0;
import p851es.C58800a;
import qw1.C101316l;

/* renamed from: com.tencent.mm.plugin.gallery.ui.m */
public class C94070m extends RecyclerView.C16613e<C94075c> implements View.OnClickListener {

    /* renamed from: d */
    public C94061h f271608d;

    /* renamed from: e */
    public Context f271609e;

    /* renamed from: f */
    public int f271610f;

    /* renamed from: g */
    public ArrayList<String> f271611g;

    /* renamed from: h */
    public ArrayList<String> f271612h = new ArrayList<>();

    /* renamed from: i */
    public C94076d f271613i;

    /* renamed from: j */
    public boolean f271614j;

    /* renamed from: n */
    public int f271615n;

    /* renamed from: o */
    public boolean f271616o;

    /* renamed from: p */
    public int f271617p = -1;

    /* renamed from: q */
    public int f271618q = -1;

    /* renamed from: r */
    public int f271619r;

    /* renamed from: s */
    public int f271620s;

    /* renamed from: t */
    public Drawable f271621t;

    /* renamed from: u */
    public SimpleDateFormat f271622u = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());

    /* renamed from: v */
    public boolean f271623v;

    /* renamed from: w */
    public C16665p f271624w = new C16665p(new C94071a());

    /* renamed from: com.tencent.mm.plugin.gallery.ui.m$a */
    public class C94071a extends C16665p.C16673d {

        /* renamed from: d */
        public int f271625d = -1;

        /* renamed from: com.tencent.mm.plugin.gallery.ui.m$a$a */
        public class C94072a implements Animation.AnimationListener {

            /* renamed from: a */
            public final /* synthetic */ int f271627a;

            /* renamed from: b */
            public final /* synthetic */ RecyclerView.C16631z f271628b;

            public C94072a(int i, RecyclerView.C16631z zVar) {
                this.f271627a = i;
                this.f271628b = zVar;
            }

            public void onAnimationEnd(Animation animation) {
                if (this.f271627a == 2) {
                    C94070m mVar = C94070m.this;
                    int j = this.f271628b.mo17363j();
                    mVar.f271618q = j;
                    mVar.f271617p = j;
                    C94071a aVar = C94071a.this;
                    int i = C94070m.this.f271620s;
                    aVar.f271625d = i;
                    Log.m105925i("MicroMsg.PreviewSelectedImageAdapter", "lastVisiblePos:%s", Integer.valueOf(i));
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        /* renamed from: com.tencent.mm.plugin.gallery.ui.m$a$b */
        public class C94073b implements Animation.AnimationListener {
            public C94073b() {
            }

            public void onAnimationEnd(Animation animation) {
                int i;
                int i2;
                C94070m mVar = C94070m.this;
                C101316l.m132916o(mVar.f271612h, mVar.f271617p, mVar.f271618q);
                C94071a aVar = C94071a.this;
                C94070m mVar2 = C94070m.this;
                C94076d dVar = mVar2.f271613i;
                if (dVar != null) {
                    int i3 = aVar.f271625d;
                    int i4 = mVar2.f271617p;
                    if (i3 > i4 && i3 <= (i2 = mVar2.f271618q)) {
                        ((ImagePreviewUI.C94014h) dVar).mo129015b(i4, i2, i3 - 1);
                    } else if (i3 < i4 && i3 >= (i = mVar2.f271618q)) {
                        ((ImagePreviewUI.C94014h) dVar).mo129015b(i4, i, i3 + 1);
                    } else if (i4 == i3) {
                        int i5 = mVar2.f271618q;
                        ((ImagePreviewUI.C94014h) dVar).mo129015b(i4, i5, i5);
                    } else {
                        ((ImagePreviewUI.C94014h) dVar).mo129015b(i4, mVar2.f271618q, i3);
                    }
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }

        public C94071a() {
        }

        /* renamed from: a */
        public void mo17547a(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            if (zVar != null) {
                super.mo17547a(recyclerView, zVar);
                Animation loadAnimation = AnimationUtils.loadAnimation(C94070m.this.f271609e, C0966R.C0968anim.f2436cz);
                loadAnimation.setAnimationListener(new C94073b());
                ((C94075c) zVar).f271639H.startAnimation(loadAnimation);
            }
        }

        /* renamed from: b */
        public float mo17548b(RecyclerView.C16631z zVar) {
            return 0.295858f;
        }

        /* renamed from: c */
        public int mo17549c(RecyclerView recyclerView, RecyclerView.C16631z zVar) {
            return C16665p.C16673d.m16132g(51, 0);
        }

        /* renamed from: e */
        public boolean mo17551e() {
            return false;
        }

        /* renamed from: f */
        public boolean mo17552f() {
            return true;
        }

        /* renamed from: h */
        public void mo17553h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16631z zVar, float f, float f2, int i, boolean z) {
            super.mo17553h(canvas, recyclerView, zVar, f / 1.3f, f2 / 1.3f, i, z);
        }

        /* renamed from: i */
        public boolean mo17554i(RecyclerView recyclerView, RecyclerView.C16631z zVar, RecyclerView.C16631z zVar2) {
            int j = zVar.mo17363j();
            int j2 = zVar2.mo17363j();
            C94070m.this.notifyItemMoved(j, j2);
            C94076d dVar = C94070m.this.f271613i;
            if (dVar != null) {
                ImagePreviewUI.C94014h hVar = (ImagePreviewUI.C94014h) dVar;
                hVar.getClass();
                Log.m105925i("MicroMsg.ImagePreviewUIChangelcai", "[onItemMove]fromPos:%s, toPos:%s, mPosition:%s", Integer.valueOf(j), Integer.valueOf(j2), ImagePreviewUI.this.f271418n);
            }
            C94070m.this.f271618q = j2;
            return false;
        }

        /* renamed from: j */
        public void mo17555j(RecyclerView.C16631z zVar, int i) {
            if (zVar != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(C94070m.this.f271609e, C0966R.C0968anim.f2437d0);
                loadAnimation.setAnimationListener(new C94072a(i, zVar));
                ((C94075c) zVar).f271639H.startAnimation(loadAnimation);
            }
        }

        /* renamed from: k */
        public void mo17556k(RecyclerView.C16631z zVar, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.m$b */
    public class C94074b implements C58800a {

        /* renamed from: a */
        public final /* synthetic */ C94075c f271631a;

        public C94074b(C94070m mVar, C94075c cVar) {
            this.f271631a = cVar;
        }

        /* renamed from: a */
        public void mo80484a() {
            Log.m105925i("MicroMsg.PreviewSelectedImageAdapter", "%s %s", Integer.valueOf(this.f271631a.f271632A.getWidth()), Integer.valueOf(this.f271631a.f271632A.getHeight()));
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.m$c */
    public static class C94075c extends RecyclerView.C16631z {

        /* renamed from: A */
        public ImageView f271632A;

        /* renamed from: B */
        public RelativeLayout f271633B;

        /* renamed from: C */
        public TextView f271634C;

        /* renamed from: D */
        public ImageView f271635D;

        /* renamed from: E */
        public ImageView f271636E;

        /* renamed from: F */
        public ImageView f271637F;

        /* renamed from: G */
        public ImageView f271638G;

        /* renamed from: H */
        public View f271639H;

        /* renamed from: I */
        public int f271640I;

        /* renamed from: J */
        public ImageView f271641J;

        /* renamed from: K */
        public TextView f271642K;

        /* renamed from: z */
        public ImageView f271643z;

        public C94075c(View view) {
            super(view);
            this.f271639H = view;
            this.f271636E = (ImageView) view.findViewById(C0966R.C0970id.epg);
            this.f271637F = (ImageView) view.findViewById(C0966R.C0970id.cb4);
            this.f271638G = (ImageView) view.findViewById(C0966R.C0970id.cku);
            this.f271643z = (ImageView) view.findViewById(C0966R.C0970id.gqk);
            this.f271632A = (ImageView) view.findViewById(C0966R.C0970id.gqq);
            this.f271633B = (RelativeLayout) view.findViewById(C0966R.C0970id.l6d);
            this.f271634C = (TextView) view.findViewById(C0966R.C0970id.l6f);
            ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.gqe);
            this.f271635D = imageView;
            imageView.setBackgroundResource(C0966R.color.f3552xi);
            this.f271635D.setVisibility(8);
            this.f271641J = (ImageView) view.findViewById(C0966R.C0970id.c78);
            this.f271642K = (TextView) view.findViewById(C0966R.C0970id.f357872ly3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.m$d */
    public interface C94076d {
    }

    public C94070m(Context context, ArrayList<String> arrayList, int i, boolean z, int i2, boolean z2) {
        this.f271609e = context;
        this.f271611g = arrayList;
        this.f271612h.addAll(arrayList);
        this.f271610f = i;
        this.f271614j = z;
        this.f271615n = i2;
        if (C93958f.m118750j().f271196f == 15) {
            this.f271621t = context.getResources().getDrawable(C0966R.C0969drawable.a7u);
        } else {
            this.f271621t = context.getResources().getDrawable(C0966R.C0969drawable.f4902qt);
        }
        this.f271623v = z2;
    }

    /* renamed from: F4 */
    public GalleryItem$MediaItem mo129077F4(int i, C94075c cVar) {
        GalleryItem$MediaItem next;
        GalleryItem$MediaItem galleryItem$MediaItem;
        if (i < 0 || i >= this.f271612h.size()) {
            Log.m105929w("MicroMsg.PreviewSelectedImageAdapter", "error position %d, imagePaths size %d", Integer.valueOf(i), Integer.valueOf(this.f271612h.size()));
            return null;
        }
        String str = this.f271612h.get(i);
        if (this.f271614j) {
            if (this.f271608d.f271577i == null) {
                return null;
            }
            GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(0, 0, str, str, "");
            int indexOf = this.f271608d.f271577i.indexOf(c);
            if (indexOf >= 0) {
                cVar.f271640I = indexOf;
                galleryItem$MediaItem = this.f271608d.f271577i.get(indexOf);
            } else {
                Iterator<GalleryItem$MediaItem> it = C93958f.m118752l().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (next.equals(c)) {
                        Log.m105925i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", next.f162747d);
                        return next;
                    }
                }
                return null;
            }
        } else if (C93958f.m118751k() == null) {
            return GalleryItem$MediaItem.m65488c(1, 0, str, str, "");
        } else {
            GalleryItem$MediaItem c2 = GalleryItem$MediaItem.m65488c(0, 0, str, str, "");
            int indexOf2 = C93958f.m118751k().indexOf(c2);
            if (indexOf2 >= 0) {
                galleryItem$MediaItem = C93958f.m118751k().get(indexOf2);
            } else {
                Iterator<GalleryItem$MediaItem> it4 = C93958f.m118752l().iterator();
                while (it4.hasNext()) {
                    next = it4.next();
                    if (next.equals(c2)) {
                        Log.m105925i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", next.f162747d);
                        return next;
                    }
                }
                return null;
            }
        }
        return galleryItem$MediaItem;
    }

    /* renamed from: G4 */
    public void onBindViewHolder(C94075c cVar, int i) {
        String str;
        int i2;
        C94075c cVar2 = cVar;
        int i3 = i;
        GalleryItem$MediaItem F4 = mo129077F4(i3, cVar2);
        if (F4 == null) {
            Log.m105920e("MicroMsg.PreviewSelectedImageAdapter", "get item failed");
            return;
        }
        ViewGroup.LayoutParams layoutParams = cVar2.f271639H.getLayoutParams();
        int i4 = this.f271610f;
        layoutParams.width = i4;
        layoutParams.height = i4;
        mo129079O4(cVar2.f271643z, F4.f162747d, i3);
        cVar2.f271639H.setOnClickListener(this);
        if (2 == F4.getType()) {
            str = this.f271609e.getResources().getString(C0966R.string.f6i) + (i3 + 1);
        } else {
            str = this.f271609e.getResources().getString(C0966R.string.f6e) + (i3 + 1);
        }
        cVar2.f271639H.setContentDescription(str + ", " + this.f271622u.format(new Date(F4.f162752i)));
        if (this.f271614j) {
            cVar2.f271639H.setTag(Integer.valueOf(cVar2.f271640I));
        } else {
            cVar2.f271639H.setTag(F4.f162747d);
        }
        String e = F4.mo80159e();
        String str2 = F4.f162747d;
        if (F4.getType() == 2) {
            cVar2.f271633B.setVisibility(0);
            int round = Math.round(((float) ((long) ((GalleryItem$VideoMediaItem) F4).f162766w)) / 1000.0f);
            cVar2.f271634C.setText(String.format(Locale.CHINA, "%d:%02d", new Object[]{Integer.valueOf(round / 60), Integer.valueOf(round % 60)}));
            if (!C98429r0.m127830u() || !this.f271616o || this.f271615n != 3 || C86013q1.m106451l(str2) <= C101316l.m132908g()) {
                cVar2.f271641J.setVisibility(8);
                cVar2.f271642K.setVisibility(8);
            } else {
                cVar2.f271641J.setVisibility(0);
                cVar2.f271642K.setVisibility(0);
                cVar2.f271642K.setText(this.f271609e.getString(C0966R.string.lut, new Object[]{C101316l.m132906e(C101316l.m132908g())}));
            }
        } else {
            cVar2.f271633B.setVisibility(8);
        }
        if (F4.getType() == 1) {
            if (!C98429r0.m127830u() || !this.f271616o || this.f271615n != 3 || C86013q1.m106451l(str2) <= 26214400) {
                cVar2.f271641J.setVisibility(8);
                cVar2.f271642K.setVisibility(8);
            } else {
                cVar2.f271641J.setVisibility(0);
                cVar2.f271642K.setVisibility(0);
                cVar2.f271642K.setText(this.f271609e.getString(C0966R.string.lus, new Object[]{C101316l.m132906e(26214400)}));
            }
        }
        if (!Util.isNullOrNil(e) || !Util.isNullOrNil(str2)) {
            C100562c0.m131591b(cVar2.f271632A, F4.getType(), e, str2, F4.f162751h, -1, new C94074b(this, cVar2), F4.f162752i);
            if ((C93958f.m118750j().f271196f == 3 || C93958f.m118750j().f271196f == 11) && F4.f162755o.equalsIgnoreCase("image/gif")) {
                i2 = 0;
                cVar2.f271636E.setVisibility(0);
            } else {
                i2 = 0;
                cVar2.f271636E.setVisibility(8);
            }
            if (!F4.f162755o.equalsIgnoreCase("edit") || this.f271623v) {
                cVar2.f271637F.setVisibility(8);
            } else {
                cVar2.f271637F.setVisibility(i2);
            }
            cVar2.f271638G.setVisibility(8);
            return;
        }
        Log.m105920e("MicroMsg.PreviewSelectedImageAdapter", "null or nil filepath: " + i3);
    }

    /* renamed from: O4 */
    public final void mo129079O4(ImageView imageView, String str, int i) {
        boolean z;
        if (this.f271611g.contains(str)) {
            imageView.setBackground((Drawable) null);
            imageView.setImageDrawable(this.f271621t);
            z = false;
        } else {
            imageView.setBackgroundColor(-1090519041);
            imageView.setImageDrawable((Drawable) null);
            z = true;
        }
        imageView.setVisibility(0);
        if (!Util.isNullOrNil(this.f271608d.mo129062j(this.f271619r)) && this.f271608d.mo129062j(this.f271619r).equals(str)) {
            imageView.setVisibility(0);
            if (z && i == this.f271620s) {
                imageView.setImageDrawable(this.f271621t);
            }
        } else if (!Util.isNullOrNil(this.f271608d.mo129062j(this.f271619r)) && !this.f271608d.mo129062j(this.f271619r).equals(str)) {
            int i2 = this.f271620s;
            if (i != i2 && !z) {
                imageView.setVisibility(8);
            } else if (i == i2 && !z) {
                imageView.setImageDrawable(this.f271621t);
            }
        }
    }

    public int getItemCount() {
        return this.f271612h.size();
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/PreviewSelectedImageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C94076d dVar = this.f271613i;
        if (dVar != null) {
            if (this.f271614j) {
                ((ImagePreviewUI.C94014h) dVar).mo129014a(view, ((Integer) view.getTag()).intValue());
            } else {
                ((ImagePreviewUI.C94014h) dVar).mo129014a(view, this.f271612h.indexOf(view.getTag()));
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/PreviewSelectedImageAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C94075c(LayoutInflater.from(this.f271609e).inflate(C0966R.C0971layout.bnn, viewGroup, false));
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
        C94075c cVar = (C94075c) zVar;
        if (list.isEmpty()) {
            onBindViewHolder(cVar, i);
            return;
        }
        GalleryItem$MediaItem F4 = mo129077F4(i, cVar);
        if (F4 != null) {
            mo129079O4(cVar.f271643z, F4.f162747d, i);
        }
    }
}
