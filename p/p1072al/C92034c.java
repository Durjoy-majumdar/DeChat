package p1072al;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import o40.C61926c;
import p1089xk.C102688b;
import p260wk.C102457e;
import p453bl.C92273c;
import rx3.C13598b0;

/* renamed from: al.c */
public final class C92034c extends C92045h<ImageView> {

    /* renamed from: d */
    public final Drawable f263552d;

    /* renamed from: al.c$a */
    public static final class C92035a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C92034c f263553d;

        /* renamed from: e */
        public final /* synthetic */ boolean f263554e;

        /* renamed from: f */
        public final /* synthetic */ Bitmap f263555f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92035a(C92034c cVar, boolean z, Bitmap bitmap) {
            super(0);
            this.f263553d = cVar;
            this.f263554e = z;
            this.f263555f = bitmap;
        }

        public Object invoke() {
            Bitmap bitmap;
            WeakReference<V> weakReference = this.f263553d.f263569c;
            ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
            if (!(!this.f263554e || (bitmap = this.f263555f) == null || imageView == null)) {
                imageView.setImageBitmap(bitmap);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92034c(EmojiInfo emojiInfo, ImageView imageView, Drawable drawable) {
        super(emojiInfo, imageView);
        C87412m.m108594g(emojiInfo, "emojiInfo");
        C87412m.m108594g(imageView, "view");
        this.f263552d = drawable;
    }

    /* renamed from: b */
    public C92273c mo126011b() {
        C102457e eVar = C102457e.f301712a;
        IEmojiInfo iEmojiInfo = this.f263567a;
        C87412m.m108592e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
        return eVar.mo142069a((EmojiInfo) iEmojiInfo);
    }

    /* renamed from: c */
    public void mo126009c(boolean z) {
        WeakReference<V> weakReference = this.f263569c;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            view.setTag(C0966R.C0970id.cfz, (Object) null);
        }
        Bitmap a = C102688b.f303300a.mo142498a(this.f263567a.getMd5());
        Log.m105918d("MicroMsg.EmojiCoverRequest", "onLoad: " + this.f263567a.getMd5() + ", " + a);
        C61926c.m72668M(new C92035a(this, z, a));
    }

    /* renamed from: f */
    public void mo126010f(boolean z) {
        ImageView imageView;
        Bitmap a = C102688b.f303300a.mo142498a(this.f263567a.getMd5());
        Log.m105918d("MicroMsg.EmojiCoverRequest", "start: " + this.f263567a.getMd5() + ", " + a);
        if (a != null) {
            mo126009c(true);
            return;
        }
        WeakReference<V> weakReference = this.f263569c;
        if (!(weakReference == null || (imageView = (ImageView) weakReference.get()) == null)) {
            imageView.setImageDrawable(this.f263552d);
        }
        C92043g.m115671e(this, false, 1, (Object) null);
    }
}
