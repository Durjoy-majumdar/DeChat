package ow1;

import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$AlbumItem;
import com.tencent.p014mm.plugin.gallery.model.PrivateAlbumItem;
import com.tencent.p014mm.plugin.gallery.p473ui.ImageFolderMgrView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: ow1.l */
public class C100573l implements C93964k.C93965a {

    /* renamed from: d */
    public final /* synthetic */ ImageFolderMgrView f294671d;

    /* renamed from: ow1.l$a */
    public class C100574a implements Runnable {
        public C100574a() {
        }

        public void run() {
            ImageFolderMgrView imageFolderMgrView = C100573l.this.f294671d;
            imageFolderMgrView.f271357h.mo140031a(imageFolderMgrView.f271362p, imageFolderMgrView.f271361o);
            ImageFolderMgrView imageFolderMgrView2 = C100573l.this.f294671d;
            imageFolderMgrView2.f271362p = null;
            imageFolderMgrView2.f271361o.clear();
            C100573l.this.f294671d.f271357h.notifyDataSetChanged();
        }
    }

    public C100573l(ImageFolderMgrView imageFolderMgrView) {
        this.f294671d = imageFolderMgrView;
    }

    /* renamed from: z7 */
    public void mo86519z7(LinkedList<GalleryItem$AlbumItem> linkedList) {
        Object[] objArr = new Object[1];
        objArr[0] = linkedList != null ? Integer.valueOf(linkedList.size()) : "res is null.";
        Log.m105925i("MicroMsg.ImageFolderMgrView", "onGetPrivateAlbum, %s.", objArr);
        C93958f.m118750j().f271192b.remove(this.f294671d.f271360n);
        if (linkedList != null && linkedList.size() > 0) {
            Iterator<GalleryItem$AlbumItem> it = linkedList.iterator();
            while (it.hasNext()) {
                GalleryItem$AlbumItem next = it.next();
                if (next instanceof PrivateAlbumItem) {
                    PrivateAlbumItem privateAlbumItem = (PrivateAlbumItem) next;
                    C93974o.C93977c cVar = privateAlbumItem.f271105p.f271215h;
                    if (cVar == null ? false : cVar.f271219d) {
                        this.f294671d.f271362p = privateAlbumItem;
                    } else {
                        this.f294671d.f271361o.add(privateAlbumItem);
                    }
                }
            }
            Log.m105925i("MicroMsg.ImageFolderMgrView", "filter res: %s.", Integer.valueOf(this.f294671d.f271361o.size()));
            if (!this.f294671d.isInLayout()) {
                ImageFolderMgrView imageFolderMgrView = this.f294671d;
                if (imageFolderMgrView.f271362p != null || imageFolderMgrView.f271361o.size() > 0) {
                    C93958f.m118753m().mo128895c(new C100574a());
                }
            }
        }
    }
}
