package ub2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMachineFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyFavFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyLikeFragment;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabMyPostFragment;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import d14.C58057l;
import fy3.C32227p;
import ib2.C60265a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.ResultKt;
import mb2.C61461c;
import rx3.C13598b0;
import sb2.C63759f0;
import sx3.C64197v;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$updateMediaItemCheckedStatus$1$1", mo125469f = "MusicMVCardChooseView.kt", mo125470l = {1327}, mo125471m = "invokeSuspend")
/* renamed from: ub2.u */
public final class C65313u extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f187984d;

    /* renamed from: e */
    public final /* synthetic */ C63759f0 f187985e;

    /* renamed from: f */
    public final /* synthetic */ MusicMVCardChooseView f187986f;

    /* renamed from: ub2.u$a */
    public static final class C65314a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ MusicMVCardChooseView f187987d;

        public C65314a(MusicMVCardChooseView musicMVCardChooseView) {
            this.f187987d = musicMVCardChooseView;
        }

        public Object emit(Object obj, C15601d dVar) {
            FinderObject finderObject;
            HashSet<C60265a> hashSet = (HashSet) obj;
            Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", "collect selectedItemFlow " + hashSet.size());
            ArrayList arrayList = new ArrayList();
            for (C60265a aVar : hashSet) {
                int i = aVar.f171813e;
                if (i != 1) {
                    if (i == 2) {
                        C60265a.C60267b bVar = aVar.f171817i;
                        if (!(bVar == null || (finderObject = bVar.f171827b) == null)) {
                            arrayList.add(new Long(finderObject.f164794id));
                        }
                    } else if (i != 3) {
                    }
                }
                C60265a.C60266a aVar2 = aVar.f171816h;
                if (aVar2 != null) {
                    arrayList.add(new Long(aVar2.f171820a));
                }
            }
            MusicMVCardChooseView musicMVCardChooseView = this.f187987d;
            C61461c cVar = musicMVCardChooseView.f163488f;
            if (cVar != null) {
                Iterator<GalleryItem$MediaItem> it = cVar.f174777e.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    GalleryItem$MediaItem next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        GalleryItem$MediaItem galleryItem$MediaItem = next;
                        boolean z = galleryItem$MediaItem.f162759s;
                        if (arrayList.contains(Long.valueOf(galleryItem$MediaItem.f162751h))) {
                            if (!z) {
                                galleryItem$MediaItem.f162759s = true;
                                cVar.notifyItemChanged(i2 + cVar.f174781i.size());
                            }
                        } else if (z) {
                            galleryItem$MediaItem.f162759s = false;
                            cVar.notifyItemChanged(i2 + cVar.f174781i.size());
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            MusicMvTabMachineFragment musicMvTabMachineFragment = musicMVCardChooseView.f163503w;
            if (musicMvTabMachineFragment != null) {
                musicMvTabMachineFragment.mo80600b(arrayList);
            }
            MusicMvTabMyPostFragment musicMvTabMyPostFragment = musicMVCardChooseView.f163504x;
            if (musicMvTabMyPostFragment != null) {
                musicMvTabMyPostFragment.mo80600b(arrayList);
            }
            MusicMvTabMyFavFragment musicMvTabMyFavFragment = musicMVCardChooseView.f163506y;
            if (musicMvTabMyFavFragment != null) {
                musicMvTabMyFavFragment.mo80600b(arrayList);
            }
            MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = musicMVCardChooseView.f163508z;
            if (musicMvTabMyLikeFragment != null) {
                musicMvTabMyLikeFragment.mo80600b(arrayList);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65313u(C63759f0 f0Var, MusicMVCardChooseView musicMVCardChooseView, C15601d<? super C65313u> dVar) {
        super(2, dVar);
        this.f187985e = f0Var;
        this.f187986f = musicMVCardChooseView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65313u(this.f187985e, this.f187986f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65313u) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f187984d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45252f<HashSet<C60265a>> fVar = this.f187985e.f180772h.f163011y;
            C65314a aVar2 = new C65314a(this.f187986f);
            this.f187984d = 1;
            if (((C58057l) fVar).mo31880a(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
