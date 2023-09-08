package ow1;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.plugin.gallery.model.C93969m;
import com.tencent.p014mm.plugin.gallery.p473ui.C94061h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import o90.C100301b;
import p166hy.C8830s0;
import p823sg.C101611g;

/* renamed from: ow1.n */
public class C100577n {

    /* renamed from: a */
    public QueueWorkerThread f294675a = new QueueWorkerThread(1, "album-image-gallery-lazy-loader");

    /* renamed from: b */
    public SparseArray<WeakReference<MultiTouchImageView>> f294676b = new SparseArray<>();

    /* renamed from: c */
    public HashMap<String, Integer> f294677c = new HashMap<>();

    /* renamed from: d */
    public SparseArray<String> f294678d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<Bitmap> f294679e = new SparseArray<>();

    /* renamed from: f */
    public int f294680f = 0;

    /* renamed from: g */
    public C101611g<String, Bitmap> f294681g = new C100301b(5, new C100578a(), C100577n.class);

    /* renamed from: h */
    public SparseIntArray f294682h = new SparseIntArray();

    /* renamed from: i */
    public LinkedList<String> f294683i = new LinkedList<>();

    /* renamed from: j */
    public C94061h f294684j;

    /* renamed from: k */
    public boolean f294685k = false;

    /* renamed from: ow1.n$a */
    public class C100578a implements C101611g.C101612b<String, Bitmap> {
        public C100578a() {
        }

        public void preRemoveCallback(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            Bitmap bitmap = (Bitmap) obj2;
            Bitmap bitmap2 = (Bitmap) obj3;
            if (bitmap != null && !bitmap.isRecycled() && C100577n.this.f294682h.indexOfKey(bitmap.hashCode()) < 0) {
                Log.m105925i("ImageAdapter", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
            }
        }
    }

    /* renamed from: ow1.n$b */
    public class C100579b implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public Bitmap f294687d = null;

        /* renamed from: e */
        public final /* synthetic */ String f294688e;

        /* renamed from: f */
        public final /* synthetic */ int f294689f;

        public C100579b(String str, int i) {
            this.f294688e = str;
            this.f294689f = i;
        }

        public boolean doInBackground() {
            if (C100577n.this.f294684j == null || TextUtils.isEmpty(this.f294688e)) {
                return false;
            }
            if (this.f294689f == 2) {
                this.f294687d = C93969m.m118774d(-1, 2, "", this.f294688e, -1);
            }
            if (this.f294687d == null) {
                C94061h hVar = C100577n.this.f294684j;
                if (hVar == null) {
                    return false;
                }
                try {
                    String str = this.f294688e;
                    hVar.getClass();
                    long currentTicks = Util.currentTicks();
                    Bitmap U90 = ((C8830s0) C86312j.m106911c(C8830s0.class)).U90(str);
                    Log.m105927v("MicroMsg.ImageAdapter", "test decode: %d filePath:%s", Long.valueOf(Util.ticksToNow(currentTicks)), str);
                    this.f294687d = U90;
                } catch (Throwable th) {
                    Log.m105920e("ImageGalleryLazyLoader", "doInBackground loadImage error : " + th.getMessage());
                    return false;
                }
            }
            return true;
        }

        public boolean onPostExecute() {
            C100577n nVar = C100577n.this;
            nVar.f294685k = false;
            if (nVar.f294677c.containsKey(this.f294688e)) {
                int intValue = C100577n.this.f294677c.get(this.f294688e).intValue();
                C100577n nVar2 = C100577n.this;
                if (!(nVar2.f294680f == 0)) {
                    nVar2.f294679e.put(intValue, this.f294687d);
                } else {
                    nVar2.mo140041a(intValue, this.f294687d);
                }
            }
            ((C100301b) C100577n.this.f294681g).mo139557c(this.f294688e, this.f294687d);
            this.f294687d = null;
            C100577n.this.mo140044d(this.f294689f);
            return false;
        }
    }

    public C100577n(C94061h hVar) {
        this.f294684j = hVar;
    }

    /* renamed from: a */
    public final void mo140041a(int i, Bitmap bitmap) {
        C94061h.C94065d dVar;
        if (this.f294676b.get(i) != null) {
            MultiTouchImageView multiTouchImageView = (MultiTouchImageView) this.f294676b.get(i).get();
            String str = this.f294678d.get(i);
            if (!(bitmap == null || multiTouchImageView == null)) {
                int hashCode = bitmap.hashCode();
                int indexOfValue = this.f294682h.indexOfValue(i);
                if (indexOfValue >= 0) {
                    this.f294682h.removeAt(indexOfValue);
                }
                this.f294682h.put(hashCode, i);
            }
            C94061h hVar = this.f294684j;
            hVar.getClass();
            Log.m105925i("MicroMsg.ImageAdapter", "onImageGalleryLoaded, bigImgPath: %s, bitmap: %s.", str, bitmap);
            hVar.f271579n.remove(str);
            if (!(multiTouchImageView == null || (dVar = (C94061h.C94065d) multiTouchImageView.getTag()) == null)) {
                Log.m105925i("MicroMsg.ImageAdapter", "onImageGalleryLoaded, viewHolder.isImg: %s.", Boolean.valueOf(dVar.f271594a));
                if (bitmap != null) {
                    hVar.mo129066n(dVar, bitmap);
                }
            }
            mo140043c(i);
        }
    }

    /* renamed from: b */
    public void mo140042b(MultiTouchImageView multiTouchImageView, String str, int i) {
        if (!this.f294683i.contains(str)) {
            int hashCode = multiTouchImageView.hashCode();
            mo140043c(hashCode);
            this.f294677c.put(str, Integer.valueOf(hashCode));
            this.f294678d.put(hashCode, str);
            this.f294676b.put(hashCode, new WeakReference(multiTouchImageView));
            this.f294683i.add(str);
            mo140044d(i);
        }
    }

    /* renamed from: c */
    public final void mo140043c(int i) {
        if (this.f294678d.get(i) != null) {
            this.f294676b.remove(i);
            this.f294678d.remove(i);
            this.f294677c.remove(this.f294678d.get(i));
            this.f294679e.remove(i);
        }
    }

    /* renamed from: d */
    public final void mo140044d(int i) {
        if (!this.f294685k && this.f294683i.size() != 0) {
            String removeLast = this.f294683i.removeLast();
            if (this.f294677c.containsKey(removeLast)) {
                this.f294685k = true;
                this.f294675a.add(new C100579b(removeLast, i));
            }
        }
    }
}
