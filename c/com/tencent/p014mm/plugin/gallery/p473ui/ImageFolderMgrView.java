package com.tencent.p014mm.plugin.gallery.p473ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.plugin.gallery.model.PrivateAlbumItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;
import ow1.C100569h;
import ow1.C100571i;
import ow1.C100573l;
import ow1.C100575m;

/* renamed from: com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView */
public class ImageFolderMgrView extends LinearLayout implements C93964k.C93965a, AdapterView.OnItemClickListener {

    /* renamed from: d */
    public C94003b f271353d = null;

    /* renamed from: e */
    public FrameLayout f271354e;

    /* renamed from: f */
    public View f271355f;

    /* renamed from: g */
    public ListView f271356g;

    /* renamed from: h */
    public C100571i f271357h;

    /* renamed from: i */
    public boolean f271358i = false;

    /* renamed from: j */
    public boolean f271359j = false;

    /* renamed from: n */
    public C93964k.C93965a f271360n;

    /* renamed from: o */
    public LinkedList<PrivateAlbumItem> f271361o = new LinkedList<>();

    /* renamed from: p */
    public PrivateAlbumItem f271362p = null;

    /* renamed from: q */
    public C94005d f271363q;

    /* renamed from: r */
    public C94004c f271364r;

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView$a */
    public class C94002a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f271365d;

        public C94002a(LinkedList linkedList) {
            this.f271365d = linkedList;
        }

        public void run() {
            C100571i iVar = ImageFolderMgrView.this.f271357h;
            iVar.f294659e = this.f271365d;
            iVar.notifyDataSetChanged();
        }

        public String toString() {
            return super.toString() + "|onQueryAlbumFinished";
        }
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView$b */
    public interface C94003b {
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView$c */
    public interface C94004c {
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView$d */
    public interface C94005d {
    }

    /* renamed from: com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView$e */
    public static class C94006e implements Runnable {

        /* renamed from: d */
        public WeakReference<C100571i> f271367d;

        public C94006e(C94067j jVar) {
        }

        public void run() {
            C100571i iVar;
            WeakReference<C100571i> weakReference = this.f271367d;
            if (weakReference != null && (iVar = weakReference.get()) != null) {
                iVar.notifyDataSetChanged();
            }
        }
    }

    public ImageFolderMgrView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        this.f271354e = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        this.f271354e.setVisibility(8);
        addView(this.f271354e, layoutParams);
        View view = new View(getContext());
        this.f271355f = view;
        view.setBackgroundColor(-872415232);
        this.f271355f.setOnClickListener(new C94069l(this));
        this.f271354e.addView(this.f271355f, new FrameLayout.LayoutParams(-1, -1));
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(getContext());
        roundedCornerFrameLayout.mo153905b(0.0f, 0.0f, (float) C74942w4.m89784a(getContext(), 8), (float) C74942w4.m89784a(getContext(), 8));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(C0966R.dimen.aaf);
        layoutParams2.gravity = 48;
        this.f271354e.addView(roundedCornerFrameLayout, layoutParams2);
        ListView listView = new ListView(getContext());
        this.f271356g = listView;
        listView.setCacheColorHint(0);
        this.f271356g.setOnItemClickListener(this);
        roundedCornerFrameLayout.addView(this.f271356g, new RelativeLayout.LayoutParams(-1, -2));
        C100571i iVar = new C100571i(getContext());
        this.f271357h = iVar;
        this.f271356g.setAdapter(iVar);
        this.f271360n = new C100573l(this);
        getViewTreeObserver().addOnPreDrawListener(new C100575m(this));
    }

    /* renamed from: a */
    public final void mo128972a(boolean z) {
        boolean z2 = this.f271358i;
        if (z2 == z) {
            Log.m105919d("MicroMsg.ImageFolderMgrView", "want to expand, but same status, expanded %B", Boolean.valueOf(z2));
        } else if (this.f271359j) {
            Log.m105919d("MicroMsg.ImageFolderMgrView", "want to expand[%B], but now in animation", Boolean.valueOf(z));
        } else if (z2) {
            this.f271359j = true;
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation.setDuration(300);
            translateAnimation.setAnimationListener(new C94068k(this));
            this.f271356g.startAnimation(translateAnimation);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setDuration(300);
            this.f271355f.startAnimation(alphaAnimation);
        } else {
            this.f271359j = true;
            this.f271354e.setVisibility(0);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(300);
            this.f271355f.startAnimation(alphaAnimation2);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
            translateAnimation2.setDuration(300);
            translateAnimation2.setAnimationListener(new C94067j(this));
            this.f271356g.startAnimation(translateAnimation2);
        }
    }

    /* renamed from: b */
    public void mo128973b() {
        mo128972a(!this.f271358i);
        C100571i iVar = this.f271357h;
        LinkedList<GalleryItem$AlbumItem> linkedList = iVar.f294659e;
        if (linkedList != null && linkedList.size() != 0) {
            for (int i = 0; i < iVar.f294659e.size(); i++) {
                GalleryItem$AlbumItem galleryItem$AlbumItem = iVar.f294659e.get(i);
                if (galleryItem$AlbumItem != null && galleryItem$AlbumItem.f271104o) {
                    C93958f.m118753m().mo128896d(new C100569h(iVar, new AtomicReference(galleryItem$AlbumItem)));
                }
            }
        }
    }

    public String getSelectedAlbumName() {
        return this.f271357h.f294660f;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        GalleryItem$AlbumItem galleryItem$AlbumItem = this.f271357h.f294659e.get(i);
        if (galleryItem$AlbumItem == null) {
            Log.m105918d("MicroMsg.ImageFolderMgrView", "get folder failed:" + i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        mo128972a(false);
        C94003b bVar = this.f271353d;
        if (bVar != null) {
            AlbumPreviewUI.this.f271296k1 = galleryItem$AlbumItem;
        }
        C100571i iVar = this.f271357h;
        String str = galleryItem$AlbumItem.f271096d;
        iVar.getClass();
        iVar.f294660f = Util.nullAs(str, "");
        this.f271357h.notifyDataSetChanged();
        C117292a.m165361g(this, "com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void setFavItemCount(int i) {
        this.f271357h.getClass();
        C94006e eVar = new C94006e((C94067j) null);
        eVar.f271367d = new WeakReference<>(this.f271357h);
        C93958f.m118753m().mo128895c(eVar);
    }

    public void setFolderAlbumDialogDismiss(C94004c cVar) {
        this.f271364r = cVar;
    }

    public void setListener(C94003b bVar) {
        this.f271353d = bVar;
    }

    public void setOnFolderStateChanged(C94005d dVar) {
        this.f271363q = dVar;
    }

    /* renamed from: z7 */
    public void mo86519z7(LinkedList<GalleryItem$AlbumItem> linkedList) {
        Log.m105925i("MicroMsg.ImageFolderMgrView", "onQueryAlbumFinished, %s, size: %s.", this, Integer.valueOf(linkedList.size()));
        C93958f.m118750j().f271191a.remove(this);
        LinkedList linkedList2 = new LinkedList();
        Iterator<GalleryItem$AlbumItem> it = linkedList.iterator();
        while (it.hasNext()) {
            GalleryItem$AlbumItem next = it.next();
            if (C86013q1.m106450k(next.mo128861e())) {
                linkedList2.add(next);
            }
        }
        C93958f.m118753m().mo128895c(new C94002a(linkedList2));
    }
}
