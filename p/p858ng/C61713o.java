package p858ng;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import bl3.C39818r;
import com.tencent.p014mm.album.p836ui.gallery.uic.AlbumGalleryUIC;
import com.tencent.p014mm.view.recyclerview.InterceptRecyclerView;
import gj3.C59471d;
import gj3.C59474h;
import gy3.C87412m;
import hj3.C20955b;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p816jl.C60878a;
import rx3.C36570n;

/* renamed from: ng.o */
public final class C61713o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AlbumGalleryUIC f175416d;

    /* renamed from: ng.o$a */
    public static final class C61714a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AlbumGalleryUIC f175417d;

        /* renamed from: ng.o$a$a */
        public static final class C61715a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ AlbumGalleryUIC f175418d;

            /* renamed from: ng.o$a$a$a */
            public static final class C61716a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ AlbumGalleryUIC f175419d;

                public C61716a(AlbumGalleryUIC albumGalleryUIC) {
                    this.f175419d = albumGalleryUIC;
                }

                public final void run() {
                    ((C60878a) ((C36570n) this.f175419d.f154638j).getValue()).mo85779n();
                    C39818r rVar = C39818r.f106831a;
                    Context context = this.f175419d.mo76192j3().mo90692e().getContext();
                    C87412m.m108593f(context, "uiBinding.recyclerView.context");
                    ((C59474h) rVar.mo62443b(context).mo75002a(C59474h.class)).f169946d.mo84574b((C59471d) null, C20955b.f59396a);
                    this.f175419d.f154637i = true;
                }
            }

            public C61715a(AlbumGalleryUIC albumGalleryUIC) {
                this.f175418d = albumGalleryUIC;
            }

            public final void run() {
                InterceptRecyclerView e = this.f175418d.mo76192j3().mo90692e();
                int intValue = ((Number) ((C36570n) this.f175418d.f154636h).getValue()).intValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(intValue));
                C117292a.m165358d(e, aVar.mo10232b(), "com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$observeState$1$4$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                e.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(e, "com/tencent/mm/album/ui/gallery/uic/AlbumGalleryUIC$observeState$1$4$1$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                this.f175418d.mo76192j3().mo90692e().post(new C61716a(this.f175418d));
            }
        }

        public C61714a(AlbumGalleryUIC albumGalleryUIC) {
            this.f175417d = albumGalleryUIC;
        }

        public final void run() {
            this.f175417d.mo76192j3().mo90692e().post(new C61715a(this.f175417d));
        }
    }

    public C61713o(AlbumGalleryUIC albumGalleryUIC) {
        this.f175416d = albumGalleryUIC;
    }

    public final void run() {
        this.f175416d.mo76192j3().mo90692e().post(new C61714a(this.f175416d));
        this.f175416d.f154644s.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }
}
