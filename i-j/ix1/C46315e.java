package ix1;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import ax1.C39642e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import q90.C101070j;
import yw1.C53601h;
import zt3.C119157j;

/* renamed from: ix1.e */
public final class C46315e implements C39642e {

    /* renamed from: a */
    public final /* synthetic */ C46318f f124781a;

    /* renamed from: b */
    public final /* synthetic */ View f124782b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f124783c;

    /* renamed from: ix1.e$a */
    public static final class C46316a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f124784d;

        /* renamed from: e */
        public final /* synthetic */ boolean f124785e;

        /* renamed from: f */
        public final /* synthetic */ String f124786f;

        /* renamed from: g */
        public final /* synthetic */ C46318f f124787g;

        /* renamed from: h */
        public final /* synthetic */ ImageView f124788h;

        public C46316a(View view, boolean z, String str, C46318f fVar, ImageView imageView) {
            this.f124784d = view;
            this.f124785e = z;
            this.f124786f = str;
            this.f124787g = fVar;
            this.f124788h = imageView;
        }

        public final void run() {
            String str;
            View view = this.f124784d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1$onFinish$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1$onFinish$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!this.f124785e || (str = this.f124786f) == null) {
                this.f124788h.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.f124788h.setImageResource(C0966R.raw.image_download_fail_icon);
                return;
            }
            C46318f fVar = this.f124787g;
            ImageView imageView = this.f124788h;
            int i = C46318f.f124790k1;
            fVar.mo71719Q(imageView, str);
        }
    }

    public C46315e(C46318f fVar, View view, ImageView imageView) {
        this.f124781a = fVar;
        this.f124782b = view;
        this.f124783c = imageView;
    }

    /* renamed from: a */
    public void mo62209a(boolean z, int i, String str, String str2) {
        Log.m105924i("MicroMsg.GameChatItemImgVH", "success:" + z + ", errCode:" + i + ", filePath:" + str2);
        this.f124781a.f124794j1 = false;
        C101070j<String, Bitmap> jVar = C53601h.f150629a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            View view = this.f124782b;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/game/chatroom/piece/GameChatItemImgVH$setBitmapToView$1", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!z || str2 == null) {
                this.f124783c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.f124783c.setImageResource(C0966R.raw.image_download_fail_icon);
                return;
            }
            this.f124781a.mo71719Q(this.f124783c, str2);
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C46316a(this.f124782b, z, str2, this.f124781a, this.f124783c));
    }

    /* renamed from: b */
    public void mo62210b(int i, String str) {
        Log.m105924i("MicroMsg.GameChatItemImgVH", "percent:" + i);
    }
}
