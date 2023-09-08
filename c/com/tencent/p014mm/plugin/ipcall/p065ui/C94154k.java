package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.widget.ImageView;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.lang.ref.WeakReference;
import p196ln.C10579k;
import p196ln.C76706g;
import p196ln.C76708i;
import t12.C13818a;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.k */
public class C94154k {

    /* renamed from: a */
    public QueueWorkerThread f271907a = new QueueWorkerThread(5, "IPCallAddressAvatarLoader", 1, Looper.getMainLooper());

    /* renamed from: b */
    public LruCache<String, WeakReference<Bitmap>> f271908b = new LruCache<>(50);

    /* renamed from: c */
    public MMHandler f271909c = new MMHandler(Looper.getMainLooper());

    /* renamed from: d */
    public Context f271910d;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.k$a */
    public class C94155a implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public boolean f271911d = false;

        /* renamed from: e */
        public final /* synthetic */ String f271912e;

        /* renamed from: f */
        public final /* synthetic */ String f271913f;

        /* renamed from: g */
        public final /* synthetic */ ImageView f271914g;

        /* renamed from: h */
        public final /* synthetic */ String f271915h;

        public C94155a(String str, String str2, ImageView imageView, String str3) {
            this.f271912e = str;
            this.f271913f = str2;
            this.f271914g = imageView;
            this.f271915h = str3;
        }

        public boolean doInBackground() {
            Bitmap e = C13818a.m13109e(C94154k.this.f271910d, this.f271912e, false);
            if (e != null) {
                C94154k.this.f271908b.put(this.f271913f, new WeakReference(e));
                this.f271911d = true;
                C94154k.m119007a(C94154k.this, this.f271914g, this.f271913f, e);
            }
            return true;
        }

        public boolean onPostExecute() {
            if (this.f271911d) {
                return true;
            }
            C94154k kVar = C94154k.this;
            String str = this.f271912e;
            String str2 = this.f271915h;
            ImageView imageView = this.f271914g;
            kVar.getClass();
            kVar.f271907a.add(new C94158l(kVar, str2, imageView, C94154k.m119008b(str, str2)));
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.k$b */
    public class C94156b implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public final /* synthetic */ String f271917d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f271918e;

        /* renamed from: f */
        public final /* synthetic */ String f271919f;

        public C94156b(String str, ImageView imageView, String str2) {
            this.f271917d = str;
            this.f271918e = imageView;
            this.f271919f = str2;
        }

        public boolean doInBackground() {
            C94154k.m119007a(C94154k.this, this.f271918e, this.f271919f, C13818a.m13109e(C94154k.this.f271910d, this.f271917d, false));
            return true;
        }

        public boolean onPostExecute() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.k$c */
    public class C94157c implements QueueWorkerThread.ThreadObject {

        /* renamed from: d */
        public final /* synthetic */ String f271921d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f271922e;

        /* renamed from: f */
        public final /* synthetic */ String f271923f;

        public C94157c(String str, ImageView imageView, String str2) {
            this.f271921d = str;
            this.f271922e = imageView;
            this.f271923f = str2;
        }

        public boolean doInBackground() {
            Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(this.f271921d);
            if (N50 == null) {
                C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
                String str = this.f271921d;
                N50 = AvatarStorage.m80444f(((AvatarStorage) RE).mo93559h(str, false), str, false);
            }
            C94154k.m119007a(C94154k.this, this.f271922e, this.f271923f, N50);
            return true;
        }

        public boolean onPostExecute() {
            return false;
        }
    }

    public C94154k(Context context) {
        this.f271910d = context;
    }

    /* renamed from: a */
    public static void m119007a(C94154k kVar, ImageView imageView, String str, Bitmap bitmap) {
        if (bitmap != null) {
            kVar.f271908b.put(str, new WeakReference(bitmap));
            kVar.f271909c.post(new C4693m(kVar, imageView, str, bitmap));
            return;
        }
        kVar.getClass();
    }

    /* renamed from: b */
    public static String m119008b(String str, String str2) {
        return str + "@" + str2 + "@contactId@username";
    }

    /* renamed from: c */
    public void mo129344c(String str, ImageView imageView) {
        if (!Util.isNullOrNil(str) && imageView != null) {
            String str2 = str + "@contactId";
            imageView.setTag(str2);
            if (!mo129346e(str + "@contactId", imageView)) {
                this.f271907a.add(new C94156b(str, imageView, str2));
            }
        }
    }

    /* renamed from: d */
    public void mo129345d(String str, String str2, ImageView imageView) {
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && imageView != null) {
            String b = m119008b(str, str2);
            imageView.setTag(b);
            if (!mo129346e(m119008b(str, str2), imageView)) {
                this.f271907a.add(new C94155a(str, b, imageView, str2));
            }
        }
    }

    /* renamed from: e */
    public final boolean mo129346e(String str, ImageView imageView) {
        Bitmap bitmap;
        WeakReference weakReference = this.f271908b.get(str);
        if (weakReference == null || (bitmap = (Bitmap) weakReference.get()) == null || imageView.getTag() == null || !imageView.getTag().toString().equals(str)) {
            return false;
        }
        if (bitmap.isRecycled()) {
            return true;
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    /* renamed from: f */
    public void mo129347f(String str, ImageView imageView) {
        if (!Util.isNullOrNil(str) && imageView != null) {
            String str2 = str + "@username";
            imageView.setTag(str2);
            if (!mo129346e(str + "@username", imageView)) {
                this.f271907a.add(new C94157c(str, imageView, str2));
            }
        }
    }
}
