package com.tencent.p014mm.plugin.p081mv.p082ui.view;

import a14.C53973z1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.search.FTSEditTextView;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.gallery.model.C56791j;
import com.tencent.p014mm.plugin.gallery.model.C93964k;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.FTSSearchNoActionBarView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvTabFragment;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import db2.C58252a;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C59826g;
import hw1.C60218q;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import mb2.C61461c;
import o40.C61926c;
import p143ds.C58433i;
import p192l4.C10462b;
import p447aw.C103918d;
import p749xh.C102658n6;
import p90.C100687b;
import q90.C101069i;
import qo3.C89779i0;
import rx3.C13598b0;
import sb2.C63844s;
import sx3.C64197v;
import te3.C64470jh3;
import te3.C64493kh3;
import ub2.C65279e;
import ub2.C65283f;
import ub2.C65301o;
import ub2.C65303p;
import ub2.C65311s;
import ub2.C65312t;
import ub2.C65315v;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u000e\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/ui/search/FTSEditTextView$l;", "Lcom/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$a;", "Lcom/tencent/mm/plugin/gallery/model/k$c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "b", "c", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView */
public final class MusicMVCardChooseView extends RelativeLayout implements FTSEditTextView.C45051l, FTSSearchNoActionBarView.C57073a, C93964k.C93967c {

    /* renamed from: X0 */
    public static int f163455X0 = 0;

    /* renamed from: Y0 */
    public static int f163456Y0 = 2000;

    /* renamed from: A */
    public int f163457A;

    /* renamed from: B */
    public MMActivity f163458B;

    /* renamed from: C */
    public boolean f163459C;

    /* renamed from: D */
    public boolean f163460D;

    /* renamed from: E */
    public final C65303p f163461E;

    /* renamed from: F */
    public C58252a f163462F;

    /* renamed from: G */
    public C57080a f163463G;

    /* renamed from: H */
    public final ArrayList<String> f163464H;

    /* renamed from: I */
    public C102658n6 f163465I;

    /* renamed from: J */
    public final C65312t f163466J;

    /* renamed from: K */
    public final String f163467K;

    /* renamed from: L */
    public final C65279e f163468L;

    /* renamed from: M */
    public final C65283f f163469M;

    /* renamed from: N */
    public final C61461c.C61464c f163470N;

    /* renamed from: P */
    public boolean f163471P;

    /* renamed from: Q */
    public int f163472Q;

    /* renamed from: Q0 */
    public volatile C57081b f163473Q0;

    /* renamed from: R */
    public int f163474R;

    /* renamed from: R0 */
    public int f163475R0;

    /* renamed from: S */
    public int f163476S;

    /* renamed from: S0 */
    public int f163477S0;

    /* renamed from: T */
    public int f163478T;

    /* renamed from: T0 */
    public int f163479T0;

    /* renamed from: U */
    public C60218q.C60219a f163480U;

    /* renamed from: U0 */
    public boolean f163481U0;

    /* renamed from: V */
    public boolean f163482V;

    /* renamed from: V0 */
    public C53973z1 f163483V0;

    /* renamed from: W */
    public final int f163484W;

    /* renamed from: W0 */
    public final C32224a<C13598b0> f163485W0;

    /* renamed from: d */
    public TabLayout f163486d;

    /* renamed from: e */
    public RecyclerView f163487e;

    /* renamed from: f */
    public C61461c f163488f;

    /* renamed from: g */
    public WeImageView f163489g;

    /* renamed from: h */
    public RelativeLayout f163490h;

    /* renamed from: i */
    public RelativeLayout f163491i;

    /* renamed from: j */
    public WeImageView f163492j;

    /* renamed from: n */
    public LinearLayout f163493n;

    /* renamed from: o */
    public FTSSearchNoActionBarView f163494o;

    /* renamed from: p */
    public MusicMvTabSearchFragment f163495p;

    /* renamed from: p0 */
    public int f163496p0;

    /* renamed from: q */
    public TextView f163497q;

    /* renamed from: r */
    public LinearLayout f163498r;

    /* renamed from: s */
    public LinearLayout f163499s;

    /* renamed from: t */
    public LinearLayout f163500t;

    /* renamed from: u */
    public LinearLayout f163501u;

    /* renamed from: v */
    public LinearLayout f163502v;

    /* renamed from: w */
    public MusicMvTabMachineFragment f163503w;

    /* renamed from: x */
    public MusicMvTabMyPostFragment f163504x;

    /* renamed from: x0 */
    public ProgressDialog f163505x0;

    /* renamed from: y */
    public MusicMvTabMyFavFragment f163506y;

    /* renamed from: y0 */
    public volatile long f163507y0;

    /* renamed from: z */
    public MusicMvTabMyLikeFragment f163508z;

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$a */
    public interface C57080a {
        /* renamed from: G4 */
        void mo80360G4(GalleryItem$MediaItem galleryItem$MediaItem, C59826g gVar);

        /* renamed from: M1 */
        void mo80364M1(MusicMvTabFragment.C57119e eVar, C59826g gVar);

        /* renamed from: Z6 */
        void mo80368Z6(LinkedList<GalleryItem$MediaItem> linkedList);

        /* renamed from: b6 */
        boolean mo80369b6(boolean z, GalleryItem$MediaItem galleryItem$MediaItem, int i);

        /* renamed from: p6 */
        void mo80370p6(int i);

        /* renamed from: s4 */
        void mo80371s4();

        /* renamed from: v0 */
        boolean mo80372v0(boolean z, MusicMvTabFragment.C57119e eVar, int i);
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$b */
    public enum C57081b {
        CREATE,
        SKIP
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$c */
    public final class C57082c implements Runnable {

        /* renamed from: d */
        public WeakReference<C61461c> f163512d;

        /* renamed from: e */
        public WeakReference<ProgressDialog> f163513e;

        /* renamed from: f */
        public WeakReference<RecyclerView> f163514f;

        /* renamed from: g */
        public LinkedList<GalleryItem$MediaItem> f163515g;

        /* renamed from: h */
        public boolean f163516h;

        public C57082c() {
        }

        public void run() {
            RecyclerView recyclerView;
            GalleryItem$MediaItem next;
            int indexOf;
            Class cls = C60218q.class;
            Object[] objArr = new Object[1];
            LinkedList<GalleryItem$MediaItem> linkedList = this.f163515g;
            objArr[0] = linkedList == null ? -1 : Integer.valueOf(linkedList.size());
            Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "on NotifyMediaItemsChanged, size %d", objArr);
            int i = MusicMVCardChooseView.f163455X0;
            LinkedList<GalleryItem$MediaItem> linkedList2 = this.f163515g;
            if (linkedList2 == null) {
                Log.m105920e("MicroMsg.Mv.MusicMVCardChooseView", "[filterEditMediaItem] mMediaItems is null!");
            } else {
                HashSet<GalleryItem$MediaItem> cf = ((C56791j) C86312j.m106911c(C56791j.class)).mo80180cf();
                if (cf == null || cf.isEmpty()) {
                    Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", "editedMediaSet is invalid.");
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    Log.m105925i("MicroMsg.Mv.MusicMVCardChooseView", "[filterEditMediaItem] size:%s", Integer.valueOf(linkedList2.size()));
                    Iterator<GalleryItem$MediaItem> it = cf.iterator();
                    while (it.hasNext() && -1 != (indexOf = linkedList2.indexOf(next))) {
                        GalleryItem$MediaItem galleryItem$MediaItem = linkedList2.get(indexOf);
                        C87412m.m108593f(galleryItem$MediaItem, "mMediaItems[i]");
                        GalleryItem$MediaItem galleryItem$MediaItem2 = galleryItem$MediaItem;
                        if (C87412m.m108589b((next = it.next()).f162755o, "edit") && !C87412m.m108589b(galleryItem$MediaItem2.f162755o, "edit")) {
                            Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "item:%s, editItem:%s", galleryItem$MediaItem2, next);
                            linkedList2.set(indexOf, next);
                        }
                    }
                    Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "[filterEditMediaItem] cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }
            WeakReference<C61461c> weakReference = this.f163512d;
            if (weakReference == null) {
                Log.m105928w("MicroMsg.Mv.MusicMVCardChooseView", "null == adapterRef");
                return;
            }
            C61461c cVar = weakReference.get();
            if (cVar == null) {
                Log.m105928w("MicroMsg.Mv.MusicMVCardChooseView", "null == adapter");
                return;
            }
            WeakReference<RecyclerView> weakReference2 = this.f163514f;
            if (weakReference2 != null && (recyclerView = weakReference2.get()) != null) {
                Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "isSwitchAlbum: %s.", Boolean.valueOf(this.f163516h));
                if (this.f163513e != null) {
                    LinkedList<GalleryItem$MediaItem> linkedList3 = this.f163515g;
                    if (linkedList3 != null) {
                        ((C60218q) C86312j.m106911c(cls)).Ls0(linkedList3);
                        if (this.f163516h) {
                            this.f163516h = false;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            RecyclerView recyclerView2 = recyclerView;
                            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$NotifyMediaItemsChanged", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                            cVar.f174777e.clear();
                            cVar.f174777e.addAll(linkedList3);
                            cVar.notifyDataSetChanged();
                            C60218q qVar = (C60218q) C86312j.m106911c(cls);
                            C60218q.C60219a aVar2 = C60218q.C60219a.IDLE;
                            int i2 = 32;
                            if (linkedList3.size() <= 32) {
                                i2 = linkedList3.size();
                            }
                            qVar.Wv0(aVar2, 0, i2, cVar.mo86437G4());
                        } else {
                            int itemCount = cVar.getItemCount() - cVar.f174781i.size();
                            int size = linkedList3.size();
                            if (itemCount < size) {
                                cVar.f174777e.addAll(linkedList3.subList(itemCount, size));
                                cVar.notifyItemRangeInserted(cVar.f174781i.size() + itemCount, cVar.getItemCount());
                            }
                        }
                    }
                    WeakReference<ProgressDialog> weakReference3 = this.f163513e;
                    ProgressDialog progressDialog = weakReference3 != null ? weakReference3.get() : null;
                    if (progressDialog != null && progressDialog.isShowing()) {
                        progressDialog.dismiss();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        int i3 = MusicMVCardChooseView.f163455X0;
                        Log.m105925i("MicroMsg.Mv.MusicMVCardChooseView", "[NotifyMediaItemsChanged] cost:%s", Long.valueOf(currentTimeMillis2 - 0));
                    }
                    ((C65315v) MusicMVCardChooseView.this.f163485W0).invoke();
                }
            }
        }

        public String toString() {
            return super.toString() + "|NotifyMediaItemsChanged";
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$d */
    public static final class C57083d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MusicMVCardChooseView f163518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57083d(MusicMVCardChooseView musicMVCardChooseView) {
            super(0);
            this.f163518d = musicMVCardChooseView;
        }

        public Object invoke() {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "afterModeChanged, onModeChanged:false, showVKB");
            MusicMVCardChooseView musicMVCardChooseView = this.f163518d;
            int i = MusicMVCardChooseView.f163455X0;
            musicMVCardChooseView.mo80524o();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$e */
    public static final class C57084e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f163519d;

        /* renamed from: e */
        public final /* synthetic */ MusicMVCardChooseView f163520e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57084e(C32224a<C13598b0> aVar, MusicMVCardChooseView musicMVCardChooseView) {
            super(0);
            this.f163519d = aVar;
            this.f163520e = musicMVCardChooseView;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f163519d;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f163520e.f163460D = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$f */
    public static final class C57085f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f163521d;

        /* renamed from: e */
        public final /* synthetic */ MusicMVCardChooseView f163522e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57085f(C32224a<C13598b0> aVar, MusicMVCardChooseView musicMVCardChooseView) {
            super(0);
            this.f163521d = aVar;
            this.f163522e = musicMVCardChooseView;
        }

        public Object invoke() {
            C32224a<C13598b0> aVar = this.f163521d;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f163522e.f163460D = false;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$g */
    public static final class C57086g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f163523d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Float, C13598b0> f163524e;

        /* renamed from: f */
        public final /* synthetic */ int f163525f;

        /* renamed from: g */
        public final /* synthetic */ int f163526g;

        public C57086g(View view, C32226l<? super Float, C13598b0> lVar, int i, int i2) {
            this.f163523d = view;
            this.f163524e = lVar;
            this.f163525f = i;
            this.f163526g = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            View view = this.f163523d;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = intValue;
            view.setLayoutParams(layoutParams);
            C32226l<Float, C13598b0> lVar = this.f163524e;
            if (lVar != null) {
                int i = this.f163525f;
                lVar.invoke(Float.valueOf(((float) (intValue - i)) / ((float) (this.f163526g - i))));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView$h */
    public static final class C57087h extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f163527d;

        public C57087h(C32224a<C13598b0> aVar) {
            this.f163527d = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "heightAnim onAnimationCancel");
        }

        public void onAnimationEnd(Animator animator) {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "heightAnim onAnimationEnd");
            C32224a<C13598b0> aVar = this.f163527d;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public void onAnimationPause(Animator animator) {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "heightAnim onAnimationPause");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMVCardChooseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m65777a(MusicMVCardChooseView musicMVCardChooseView, int i) {
        MusicMvTabMyLikeFragment musicMvTabMyLikeFragment;
        MusicMvTabMachineFragment musicMvTabMachineFragment = musicMVCardChooseView.f163503w;
        if (musicMvTabMachineFragment != null) {
            musicMvTabMachineFragment.setVisibility(8);
        }
        MusicMvTabMyPostFragment musicMvTabMyPostFragment = musicMVCardChooseView.f163504x;
        if (musicMvTabMyPostFragment != null) {
            musicMvTabMyPostFragment.setVisibility(8);
        }
        MusicMvTabMyFavFragment musicMvTabMyFavFragment = musicMVCardChooseView.f163506y;
        if (musicMvTabMyFavFragment != null) {
            musicMvTabMyFavFragment.setVisibility(8);
        }
        MusicMvTabMyLikeFragment musicMvTabMyLikeFragment2 = musicMVCardChooseView.f163508z;
        if (musicMvTabMyLikeFragment2 != null) {
            musicMvTabMyLikeFragment2.setVisibility(8);
        }
        if (i == 0) {
            MusicMvTabMachineFragment musicMvTabMachineFragment2 = musicMVCardChooseView.f163503w;
            if (musicMvTabMachineFragment2 != null) {
                musicMvTabMachineFragment2.setVisibility(0);
            }
        } else if (i == 1) {
            MusicMvTabMyPostFragment musicMvTabMyPostFragment2 = musicMVCardChooseView.f163504x;
            if (musicMvTabMyPostFragment2 != null) {
                musicMvTabMyPostFragment2.setVisibility(0);
            }
        } else if (i == 2) {
            MusicMvTabMyFavFragment musicMvTabMyFavFragment2 = musicMVCardChooseView.f163506y;
            if (musicMvTabMyFavFragment2 != null) {
                musicMvTabMyFavFragment2.setVisibility(0);
            }
        } else if (i == 3 && (musicMvTabMyLikeFragment = musicMVCardChooseView.f163508z) != null) {
            musicMvTabMyLikeFragment.setVisibility(0);
        }
    }

    /* renamed from: b */
    public static final void m65778b(MusicMVCardChooseView musicMVCardChooseView, int i) {
        TextView textView;
        TextView textView2 = musicMVCardChooseView.f163462F.f166793c;
        if (textView2 != null) {
            textView2.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        }
        TextView textView3 = musicMVCardChooseView.f163462F.f166795e;
        if (textView3 != null) {
            textView3.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        }
        TextView textView4 = musicMVCardChooseView.f163462F.f166792b;
        if (textView4 != null) {
            textView4.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        }
        TextView textView5 = musicMVCardChooseView.f163462F.f166794d;
        if (textView5 != null) {
            textView5.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        }
        if (i == 0) {
            TextView textView6 = musicMVCardChooseView.f163462F.f166793c;
            if (textView6 != null) {
                textView6.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            }
        } else if (i == 1) {
            TextView textView7 = musicMVCardChooseView.f163462F.f166795e;
            if (textView7 != null) {
                textView7.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            }
        } else if (i == 2) {
            TextView textView8 = musicMVCardChooseView.f163462F.f166792b;
            if (textView8 != null) {
                textView8.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
            }
        } else if (i == 3 && (textView = musicMVCardChooseView.f163462F.f166794d) != null) {
            textView.setTextColor(musicMVCardChooseView.getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_9));
        }
    }

    /* renamed from: j */
    public static /* synthetic */ void m65779j(MusicMVCardChooseView musicMVCardChooseView, boolean z, C32226l lVar, C32224a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        musicMVCardChooseView.mo80519i(z, lVar, aVar);
    }

    /* renamed from: r */
    public static /* synthetic */ void m65780r(MusicMVCardChooseView musicMVCardChooseView, int i, int i2, boolean z, C32226l lVar, C32224a aVar, int i3, Object obj) {
        musicMVCardChooseView.mo80526q(i, i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? null : lVar, (i3 & 16) != 0 ? null : aVar);
    }

    /* renamed from: B3 */
    public void mo80207B3(LinkedList<GalleryItem$MediaItem> linkedList, long j, boolean z) {
        if (j != this.f163507y0) {
            Log.m105929w("MicroMsg.Mv.MusicMVCardChooseView", "%s %s, not my query, ignore.", Long.valueOf(j), Long.valueOf(this.f163507y0));
            Log.m105928w("MicroMsg.Mv.MusicMVCardChooseView", "If you saw too mush this log, maybe user had too many photos. This can be optimized.");
        } else if (linkedList == null) {
            Log.m105920e("MicroMsg.Mv.MusicMVCardChooseView", "onQueryMediaFinished, null == mediaItems");
        } else {
            Object[] objArr = new Object[3];
            objArr[0] = Boolean.valueOf(z);
            C61461c cVar = this.f163488f;
            objArr[1] = cVar != null ? Integer.valueOf(cVar.mo86437G4()) : null;
            objArr[2] = Integer.valueOf(linkedList.size());
            Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "onQueryMediaFinished: %s %s %s.", objArr);
            C61461c cVar2 = this.f163488f;
            if (cVar2 != null) {
                if (z || cVar2.mo86437G4() > linkedList.size()) {
                    mo80517g(linkedList);
                } else {
                    List<GalleryItem$MediaItem> subList = linkedList.subList(cVar2.mo86437G4(), linkedList.size());
                    C87412m.m108593f(subList, "mediaItems.subList(it.mediaCount, mediaItems.size)");
                    mo80517g(subList);
                }
                C57080a aVar = this.f163463G;
                if (aVar != null) {
                    aVar.mo80368Z6(new LinkedList(linkedList));
                }
                LinkedList<GalleryItem$MediaItem> linkedList2 = new LinkedList<>(linkedList);
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(this.f163488f == null);
                objArr2[1] = Util.getStack().toString();
                Log.m105925i("MicroMsg.Mv.MusicMVCardChooseView", "[onQueryMediaFinished] adapter is null?:%s %s", objArr2);
                if (this.f163488f != null) {
                    C57082c cVar3 = new C57082c();
                    cVar3.f163512d = new WeakReference<>(this.f163488f);
                    cVar3.f163513e = new WeakReference<>(this.f163505x0);
                    cVar3.f163514f = new WeakReference<>(this.f163487e);
                    cVar3.f163515g = linkedList2;
                    cVar3.f163516h = z;
                    if (C57081b.CREATE == this.f163473Q0) {
                        this.f163473Q0 = C57081b.SKIP;
                    }
                    ((C56791j) C86312j.m106911c(C56791j.class)).mo80185ok(cVar3);
                }
            }
        }
    }

    /* renamed from: D */
    public void mo3000D(boolean z) {
        if (z) {
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "onEditTextFocusChange, hasFocus:" + z + ", showSearchResultPanel");
            mo80523n();
            if (mo80518h()) {
                mo80524o();
                return;
            }
            m65779j(this, false, (C32226l) null, new C57083d(this), 2, (Object) null);
        }
    }

    /* renamed from: b3 */
    public void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, FTSEditTextView.C45052m mVar) {
        String str3;
        if (str == null || (str3 = C112550d0.m153799i0(str).toString()) == null) {
            str3 = "";
        }
        Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", str3);
    }

    /* renamed from: c */
    public final void mo80512c() {
        this.f163459C = false;
        TabLayout tabLayout = this.f163486d;
        if (tabLayout != null) {
            tabLayout.mo146919s(C76577a.m92153d(this.f163458B, C0966R.color.BW_100_Alpha_0_2), C76577a.m92153d(this.f163458B, C0966R.color.BW_100_Alpha_0_5));
        }
        TabLayout tabLayout2 = this.f163486d;
        if (tabLayout2 != null) {
            tabLayout2.setSelectedTabIndicatorColor(C76577a.m92153d(this.f163458B, C0966R.color.BW_100_Alpha_0_5));
        }
        WeImageView weImageView = this.f163492j;
        if (weImageView != null) {
            weImageView.mo104517q(-1, 0.5f);
        }
    }

    /* renamed from: d */
    public final void mo80513d() {
        this.f163459C = true;
        TabLayout tabLayout = this.f163486d;
        if (tabLayout != null) {
            tabLayout.mo146919s(C76577a.m92153d(this.f163458B, C0966R.color.BW_100_Alpha_0_5), C76577a.m92153d(this.f163458B, C0966R.color.BW_100_Alpha_0_9));
        }
        TabLayout tabLayout2 = this.f163486d;
        if (tabLayout2 != null) {
            tabLayout2.setSelectedTabIndicatorColor(C76577a.m92153d(this.f163458B, C0966R.color.BW_100_Alpha_0_9));
        }
        WeImageView weImageView = this.f163492j;
        if (weImageView != null) {
            weImageView.mo104517q(-1, 1.0f);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f163459C) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: e */
    public final C64493kh3 mo80515e(MusicMvTabFragment musicMvTabFragment) {
        C87412m.m108594g(musicMvTabFragment, "fragment");
        C64493kh3 kh32 = new C64493kh3();
        kh32.f183943e = String.valueOf(musicMvTabFragment.getType());
        int i = 0;
        for (T next : musicMvTabFragment.getAllDataList()) {
            int i2 = i + 1;
            if (i >= 0) {
                MusicMvTabFragment.C57117c cVar = (MusicMvTabFragment.C57117c) next;
                LinkedList<C64470jh3> linkedList = kh32.f183942d;
                C64470jh3 jh32 = new C64470jh3();
                FinderObject finderObject = cVar.f163646d.f163649b;
                jh32.f183796d = C61926c.m72691p(finderObject != null ? finderObject.f164794id : 0);
                jh32.f183798f = cVar.f163646d.f163649b;
                jh32.f183797e = 3;
                linkedList.add(jh32);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return kh32;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x013b, code lost:
        if (r14 != 3) goto L_0x0172;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x017c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64525lh3 mo80516f(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "clickItemId"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "clickListId"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fillPreviewItemObj clickItemId:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " clickListId:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.Mv.MusicMVCardChooseView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            te3.lh3 r3 = new te3.lh3
            r3.<init>()
            r3.f184108f = r2
            r3.f184109g = r1
            te3.kh3 r1 = new te3.kh3
            r1.<init>()
            java.lang.String r2 = "0"
            r1.f183943e = r2
            mb2.c r2 = r0.f163488f
            r5 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L_0x009c
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r2.f174777e
            if (r2 == 0) goto L_0x009c
            java.util.Iterator r2 = r2.iterator()
            r9 = 0
        L_0x0050:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x009c
            java.lang.Object r10 = r2.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x0097
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r10
            java.util.LinkedList<te3.jh3> r9 = r1.f183942d
            te3.jh3 r12 = new te3.jh3
            r12.<init>()
            long r13 = r10.f162751h
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "local_"
            r15.append(r6)
            r15.append(r13)
            java.lang.String r6 = r15.toString()
            r12.f183796d = r6
            pe3.b r6 = new pe3.b
            byte[] r13 = o40.C61926c.m72692q(r10)
            int r14 = r13.length
            r6.<init>(r13, r7, r14)
            r12.f183799g = r6
            boolean r6 = r10 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r6 == 0) goto L_0x0090
            r12.f183797e = r5
            goto L_0x0092
        L_0x0090:
            r12.f183797e = r8
        L_0x0092:
            r9.add(r12)
            r9 = r11
            goto L_0x0050
        L_0x0097:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x009c:
            java.util.LinkedList<te3.kh3> r2 = r3.f184106d
            r2.add(r1)
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment r1 = r0.f163503w
            if (r1 == 0) goto L_0x00ae
            java.util.LinkedList<te3.kh3> r2 = r3.f184106d
            te3.kh3 r1 = r0.mo80515e(r1)
            r2.add(r1)
        L_0x00ae:
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment r1 = r0.f163506y
            if (r1 == 0) goto L_0x00bb
            java.util.LinkedList<te3.kh3> r2 = r3.f184106d
            te3.kh3 r1 = r0.mo80515e(r1)
            r2.add(r1)
        L_0x00bb:
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment r1 = r0.f163504x
            if (r1 == 0) goto L_0x00c8
            java.util.LinkedList<te3.kh3> r2 = r3.f184106d
            te3.kh3 r1 = r0.mo80515e(r1)
            r2.add(r1)
        L_0x00c8:
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment r1 = r0.f163508z
            if (r1 == 0) goto L_0x00d5
            java.util.LinkedList<te3.kh3> r2 = r3.f184106d
            te3.kh3 r1 = r0.mo80515e(r1)
            r2.add(r1)
        L_0x00d5:
            com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment r1 = r0.f163495p
            if (r1 == 0) goto L_0x00e2
            java.util.LinkedList<te3.kh3> r2 = r3.f184106d
            te3.kh3 r1 = r0.mo80515e(r1)
            r2.add(r1)
        L_0x00e2:
            te3.kh3 r1 = new te3.kh3
            r1.<init>()
            java.lang.String r2 = "-1"
            r1.f183943e = r2
            bl3.r r6 = bl3.C39818r.f106831a
            android.content.Context r9 = r16.getContext()
            java.lang.String r10 = "context"
            gy3.C87412m.m108593f(r9, r10)
            bl3.r$a r6 = r6.mo62443b(r9)
            java.lang.Class<sb2.f0> r9 = sb2.C63759f0.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r9)
            sb2.f0 r6 = (sb2.C63759f0) r6
            com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList r6 = r6.f180772h
            java.util.ArrayList<T> r6 = r6.f272353o
            java.util.Iterator r6 = r6.iterator()
            r9 = 0
        L_0x010b:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x018d
            java.lang.Object r10 = r6.next()
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x0188
            ib2.a r10 = (ib2.C60265a) r10
            int r9 = r10.f171813e
            if (r9 != 0) goto L_0x0120
            goto L_0x0186
        L_0x0120:
            java.util.LinkedList<te3.kz3> r9 = r3.f184107e
            te3.kz3 r12 = new te3.kz3
            r12.<init>()
            int r13 = r10.f171815g
            java.lang.String r13 = java.lang.String.valueOf(r13)
            r12.f184007e = r13
            te3.jh3 r13 = new te3.jh3
            r13.<init>()
            int r14 = r10.f171813e
            if (r14 == r8) goto L_0x014f
            r15 = 3
            if (r14 == r5) goto L_0x013e
            if (r14 == r15) goto L_0x014f
            goto L_0x0172
        L_0x013e:
            java.lang.String r14 = r10.f171812d
            r13.f183796d = r14
            r13.f183797e = r15
            ib2.a$b r10 = r10.f171817i
            if (r10 == 0) goto L_0x014b
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.f171827b
            goto L_0x014c
        L_0x014b:
            r10 = 0
        L_0x014c:
            r13.f183798f = r10
            goto L_0x0172
        L_0x014f:
            java.lang.String r14 = r10.f171812d
            r13.f183796d = r14
            ib2.a$a r10 = r10.f171816h
            if (r10 == 0) goto L_0x0172
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r10 = r10.f171823d
            if (r10 == 0) goto L_0x0172
            pe3.b r14 = new pe3.b
            byte[] r15 = o40.C61926c.m72692q(r10)
            int r8 = r15.length
            r14.<init>(r15, r7, r8)
            r13.f183799g = r14
            boolean r8 = r10 instanceof com.tencent.p014mm.plugin.gallery.model.GalleryItem$VideoMediaItem
            if (r8 == 0) goto L_0x016f
            r13.f183797e = r5
            r8 = 1
            goto L_0x0172
        L_0x016f:
            r8 = 1
            r13.f183797e = r8
        L_0x0172:
            r12.f184006d = r13
            java.lang.String r10 = r12.f184007e
            boolean r10 = gy3.C87412m.m108589b(r10, r2)
            if (r10 == 0) goto L_0x0183
            java.util.LinkedList<te3.jh3> r10 = r1.f183942d
            te3.jh3 r13 = r12.f184006d
            r10.add(r13)
        L_0x0183:
            r9.add(r12)
        L_0x0186:
            r9 = r11
            goto L_0x010b
        L_0x0188:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x018d:
            java.util.LinkedList<te3.jh3> r2 = r1.f183942d
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x01d7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "add draft size "
            r2.append(r5)
            java.util.LinkedList<te3.jh3> r5 = r1.f183942d
            java.lang.String r6 = "selectDraftList.itemList"
            gy3.C87412m.m108593f(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x01b6:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01c8
            java.lang.Object r7 = r5.next()
            te3.jh3 r7 = (te3.C64470jh3) r7
            java.lang.String r7 = r7.f183796d
            r6.add(r7)
            goto L_0x01b6
        L_0x01c8:
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
            java.util.LinkedList<te3.kh3> r2 = r3.f184106d
            r2.add(r1)
        L_0x01d7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView.mo80516f(java.lang.String, java.lang.String):te3.lh3");
    }

    /* renamed from: g */
    public final void mo80517g(List<GalleryItem$MediaItem> list) {
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "filterNonExistMedia size: %s.", Integer.valueOf(list.size()));
        LinkedList linkedList = new LinkedList();
        for (GalleryItem$MediaItem next : list) {
            if (!C86013q1.m106450k(next.f162747d)) {
                Log.m105929w("MicroMsg.Mv.MusicMVCardChooseView", "filter non exist media: %s.", next.f162747d);
                linkedList.add(next);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            list.remove((GalleryItem$MediaItem) it.next());
        }
        Log.m105919d("MicroMsg.Mv.MusicMVCardChooseView", "filterNonExistMedia cost: %s.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: h */
    public final boolean mo80518h() {
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        return ((C63844s) rVar.mo62443b(context).mo75002a(C63844s.class)).mo88634d3();
    }

    /* renamed from: i */
    public final void mo80519i(boolean z, C32226l<? super Float, C13598b0> lVar, C32224a<C13598b0> aVar) {
        FTSEditTextView ftsEditText;
        FTSEditTextView ftsEditText2;
        boolean z2 = this.f163481U0;
        if (!z2 && z) {
            this.f163460D = true;
            Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", "onModeChanged, change2Min:true, hideSearchResultPanel");
            Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "hideSearchResultPanel");
            FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f163494o;
            if (!(fTSSearchNoActionBarView == null || (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) == null)) {
                ftsEditText2.mo70335c();
            }
            FTSSearchNoActionBarView fTSSearchNoActionBarView2 = this.f163494o;
            if (!(fTSSearchNoActionBarView2 == null || (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) == null)) {
                ftsEditText.mo70339g();
            }
            WeImageView weImageView = this.f163489g;
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
            TabLayout tabLayout = this.f163486d;
            if (tabLayout != null) {
                tabLayout.animate().translationX(0.0f).setDuration(300).start();
            }
            mo80526q(this.f163477S0, this.f163475R0, true, lVar, new C57084e(aVar, this));
        } else if (!z2 || z) {
            Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", "onModeChanged, else");
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            this.f163460D = true;
            Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", "onModeChanged, change2Min:false");
            int b = (this.f163457A / 2) - C76577a.m92151b(getContext(), 40);
            WeImageView weImageView2 = this.f163489g;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            TabLayout tabLayout2 = this.f163486d;
            if (tabLayout2 != null) {
                tabLayout2.animate().translationX(((float) (b - (tabLayout2.getWidth() / 2))) * 1.0f).setDuration(300).start();
            }
            mo80526q(this.f163475R0, this.f163477S0, true, lVar, new C57085f(aVar, this));
        }
        this.f163481U0 = z;
    }

    /* renamed from: k */
    public final void mo80520k() {
        Class cls = C56791j.class;
        Class cls2 = C60218q.class;
        ((C101069i) C100687b.m131710a(C100687b.f295006d)).mo140531a(1.0d);
        ((C58433i) C86312j.m106911c(C58433i.class)).mo83379dD(this.f163484W);
        Log.m105925i("MicroMsg.Mv.MusicMVCardChooseView", "start queryMediaInAlbums %s", this);
        ((C56791j) C86312j.m106911c(cls)).mo80176C5(this);
        this.f163507y0 = System.currentTimeMillis();
        ((C56791j) C86312j.m106911c(cls)).mo80184o1("", this.f163507y0);
        ((C60218q) C86312j.m106911c(cls2)).X60(((C60218q) C86312j.m106911c(cls2)).mh0());
        ((C60218q) C86312j.m106911c(cls2)).X60(((C60218q) C86312j.m106911c(cls2)).mo85209We());
    }

    /* renamed from: l */
    public final void mo80521l() {
        Class cls = C56791j.class;
        C103918d dVar = (C103918d) C86312j.m106911c(C103918d.class);
        MMActivity mMActivity = this.f163458B;
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        String string = mMActivity != null ? mMActivity.getString(C0966R.string.hif) : null;
        MMActivity mMActivity2 = this.f163458B;
        boolean Uu0 = dVar.Uu0(mMActivity, strArr, 145, string, mMActivity2 != null ? mMActivity2.getString(C0966R.string.mpe) : null);
        this.f163482V = Uu0;
        Log.m105925i("MicroMsg.Mv.MusicMVCardChooseView", "checkPermission checkMediaStorage[%b]", Boolean.valueOf(Uu0));
        this.f163473Q0 = C57081b.CREATE;
        Context context = getContext();
        Context context2 = getContext();
        this.f163505x0 = C89779i0.m112246c(context, context2 != null ? context2.getString(C0966R.string.a4d) : null, false, 0, (DialogInterface.OnCancelListener) null);
        ((C56791j) C86312j.m106911c(cls)).mo80178M2(this.f163484W);
        ((C56791j) C86312j.m106911c(cls)).mo80177I(this.f163496p0);
        Log.m105924i("MicroMsg.Mv.MusicMVCardChooseView", "query source: " + this.f163484W + ", queryType: " + this.f163496p0);
        if (this.f163482V) {
            Class cls2 = C60218q.class;
            ((C101069i) C100687b.m131710a(C100687b.f295006d)).mo140531a(1.0d);
            ((C58433i) C86312j.m106911c(C58433i.class)).mo83379dD(this.f163484W);
            Log.m105925i("MicroMsg.Mv.MusicMVCardChooseView", "start queryMediaInAlbums %s", this);
            ((C56791j) C86312j.m106911c(cls)).mo80176C5(this);
            this.f163507y0 = System.currentTimeMillis();
            ((C56791j) C86312j.m106911c(cls)).mo80184o1("", this.f163507y0);
            RecyclerView recyclerView = this.f163487e;
            if (recyclerView != null) {
                recyclerView.postDelayed(new C65311s(this), 300);
            }
            ((C60218q) C86312j.m106911c(cls2)).X60(((C60218q) C86312j.m106911c(cls2)).mh0());
            ((C60218q) C86312j.m106911c(cls2)).X60(((C60218q) C86312j.m106911c(cls2)).mo85209We());
        }
    }

    /* renamed from: m */
    public final void mo80522m() {
        RelativeLayout relativeLayout = this.f163490h;
        boolean z = true;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            LinearLayout linearLayout = this.f163493n;
            if (linearLayout == null || linearLayout.getVisibility() != 8) {
                z = false;
            }
            if (z) {
                WeImageView weImageView = this.f163492j;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                    return;
                }
                return;
            }
        }
        WeImageView weImageView2 = this.f163492j;
        if (weImageView2 != null) {
            weImageView2.setVisibility(4);
        }
    }

    /* renamed from: m7 */
    public void mo3004m7(int i, FTSSearchView.C6996f fVar) {
    }

    /* renamed from: n */
    public final void mo80523n() {
        FTSEditTextView ftsEditText;
        Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "showSearchResultPanel");
        FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f163494o;
        if (!(fTSSearchNoActionBarView == null || (ftsEditText = fTSSearchNoActionBarView.getFtsEditText()) == null)) {
            ftsEditText.mo70336d();
        }
        MusicMvTabSearchFragment musicMvTabSearchFragment = this.f163495p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.f163630d.clear();
            musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
        }
        LinearLayout linearLayout = this.f163493n;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        RelativeLayout relativeLayout = this.f163491i;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        mo80522m();
    }

    /* renamed from: o */
    public final void mo80524o() {
        FTSEditTextView ftsEditText;
        FTSEditTextView ftsEditText2;
        FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f163494o;
        if (!(fTSSearchNoActionBarView == null || (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) == null)) {
            ftsEditText2.mo70355k();
        }
        FTSSearchNoActionBarView fTSSearchNoActionBarView2 = this.f163494o;
        if (fTSSearchNoActionBarView2 != null && (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) != null) {
            ftsEditText.mo70360p();
        }
    }

    public void onClickBackBtn(View view) {
        FTSEditTextView ftsEditText;
        FTSEditTextView ftsEditText2;
        FTSEditTextView ftsEditText3;
        Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "onClickBackBtn, hideSearchResultPanel");
        Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "hideSearchResultPanel");
        FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f163494o;
        if (!(fTSSearchNoActionBarView == null || (ftsEditText3 = fTSSearchNoActionBarView.getFtsEditText()) == null)) {
            ftsEditText3.mo70336d();
        }
        FTSSearchNoActionBarView fTSSearchNoActionBarView2 = this.f163494o;
        if (!(fTSSearchNoActionBarView2 == null || (ftsEditText2 = fTSSearchNoActionBarView2.getFtsEditText()) == null)) {
            ftsEditText2.mo70335c();
        }
        FTSSearchNoActionBarView fTSSearchNoActionBarView3 = this.f163494o;
        if (!(fTSSearchNoActionBarView3 == null || (ftsEditText = fTSSearchNoActionBarView3.getFtsEditText()) == null)) {
            ftsEditText.mo70339g();
        }
        MusicMvTabSearchFragment musicMvTabSearchFragment = this.f163495p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.f163630d.clear();
            musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
        }
        LinearLayout linearLayout = this.f163493n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.f163491i;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        mo80522m();
    }

    public void onClickClearTextBtn(View view) {
        MusicMvTabSearchFragment musicMvTabSearchFragment = this.f163495p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.f163630d.clear();
            musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
        }
    }

    /* renamed from: p */
    public final void mo80525p(boolean z, int i) {
        if (!z) {
            f163455X0 = i;
        } else {
            f163456Y0 = i;
        }
        C61461c cVar = this.f163488f;
        if (cVar != null) {
            cVar.f174778f = i;
            cVar.notifyDataSetChanged();
        }
        MusicMvTabMachineFragment musicMvTabMachineFragment = this.f163503w;
        if (musicMvTabMachineFragment != null) {
            musicMvTabMachineFragment.setVideoDuration(i);
        }
        MusicMvTabMyPostFragment musicMvTabMyPostFragment = this.f163504x;
        if (musicMvTabMyPostFragment != null) {
            musicMvTabMyPostFragment.setVideoDuration(i);
        }
        MusicMvTabMyFavFragment musicMvTabMyFavFragment = this.f163506y;
        if (musicMvTabMyFavFragment != null) {
            musicMvTabMyFavFragment.setVideoDuration(i);
        }
        MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = this.f163508z;
        if (musicMvTabMyLikeFragment != null) {
            musicMvTabMyLikeFragment.setVideoDuration(i);
        }
        MusicMvTabSearchFragment musicMvTabSearchFragment = this.f163495p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.setVideoDuration(i);
        }
    }

    /* renamed from: q */
    public final void mo80526q(int i, int i2, boolean z, C32226l<? super Float, C13598b0> lVar, C32224a<C13598b0> aVar) {
        View findViewById = findViewById(C0966R.C0970id.c6j);
        if (findViewById == null) {
            return;
        }
        if (!z) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
            if (lVar != null) {
                lVar.invoke(Float.valueOf(1.0f));
            }
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.addUpdateListener(new C57086g(findViewById, lVar, i, i2));
        ofInt.addListener(new C57087h(aVar));
        ofInt.setDuration(300);
        ofInt.start();
        Log.m105918d("MicroMsg.Mv.MusicMVCardChooseView", "heightAnim start");
    }

    /* renamed from: y */
    public boolean mo3009y() {
        String str;
        FTSEditTextView ftsEditText;
        FTSEditTextView ftsEditText2;
        String totalQuery;
        FTSSearchNoActionBarView fTSSearchNoActionBarView = this.f163494o;
        if (fTSSearchNoActionBarView == null || (ftsEditText2 = fTSSearchNoActionBarView.getFtsEditText()) == null || (totalQuery = ftsEditText2.getTotalQuery()) == null || (str = C112550d0.m153799i0(totalQuery).toString()) == null) {
            str = "";
        }
        if (Util.isNullOrNil(str)) {
            return true;
        }
        MusicMvTabSearchFragment musicMvTabSearchFragment = this.f163495p;
        if (musicMvTabSearchFragment != null) {
            musicMvTabSearchFragment.setResultView(8);
        }
        TextView textView = this.f163497q;
        if (textView != null) {
            textView.setVisibility(8);
        }
        LinearLayout linearLayout = this.f163498r;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        MusicMvTabSearchFragment musicMvTabSearchFragment2 = this.f163495p;
        if (musicMvTabSearchFragment2 != null) {
            musicMvTabSearchFragment2.getRlLayout().setHasBottomMore(true);
            TextView loadingTv = musicMvTabSearchFragment2.getLoadingTv();
            if (loadingTv != null) {
                loadingTv.setVisibility(8);
            }
            View loadMoreFooter = musicMvTabSearchFragment2.getRlLayout().getLoadMoreFooter();
            if (loadMoreFooter != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTabSearchFragment", "initSearch", "(Lcom/tencent/mm/autogen/table/BaseMusic;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/mv/ui/view/MusicMvTabSearchFragment", "initSearch", "(Lcom/tencent/mm/autogen/table/BaseMusic;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View loadMoreFooter2 = musicMvTabSearchFragment2.getRlLayout().getLoadMoreFooter();
            TextView textView2 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            musicMvTabSearchFragment2.f163659y = UUID.randomUUID().toString();
            musicMvTabSearchFragment2.f163658x = null;
            musicMvTabSearchFragment2.f163657w = 0;
            musicMvTabSearchFragment2.getDataList().clear();
            musicMvTabSearchFragment2.mo80601c((C102658n6) null, str);
        }
        FTSSearchNoActionBarView fTSSearchNoActionBarView2 = this.f163494o;
        if (!(fTSSearchNoActionBarView2 == null || (ftsEditText = fTSSearchNoActionBarView2.getFtsEditText()) == null)) {
            ftsEditText.mo70339g();
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMVCardChooseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f163459C = true;
        this.f163461E = new C65303p(this);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bir, this, false);
        addView(inflate);
        int i2 = C0966R.C0970id.f5688lw;
        RecyclerView recyclerView = (RecyclerView) C10462b.m10395a(inflate, C0966R.C0970id.f5688lw);
        if (recyclerView != null) {
            i2 = C0966R.C0970id.bec;
            WeImageView weImageView = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.bec);
            if (weImageView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) inflate;
                i2 = C0966R.C0970id.d7g;
                LinearLayout linearLayout = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.d7g);
                if (linearLayout != null) {
                    i2 = C0966R.C0970id.d7m;
                    RelativeLayout relativeLayout2 = (RelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.d7m);
                    if (relativeLayout2 != null) {
                        i2 = C0966R.C0970id.e2x;
                        RelativeLayout relativeLayout3 = (RelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.e2x);
                        if (relativeLayout3 != null) {
                            i2 = C0966R.C0970id.f358393ev3;
                            RelativeLayout relativeLayout4 = (RelativeLayout) C10462b.m10395a(inflate, C0966R.C0970id.f358393ev3);
                            if (relativeLayout4 != null) {
                                i2 = C0966R.C0970id.g3e;
                                LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.g3e);
                                if (linearLayout2 != null) {
                                    i2 = C0966R.C0970id.h9r;
                                    LinearLayout linearLayout3 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.h9r);
                                    if (linearLayout3 != null) {
                                        i2 = C0966R.C0970id.h9l;
                                        TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.h9l);
                                        if (textView != null) {
                                            i2 = C0966R.C0970id.h9v;
                                            LinearLayout linearLayout4 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.h9v);
                                            if (linearLayout4 != null) {
                                                i2 = C0966R.C0970id.h9m;
                                                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.h9m);
                                                if (textView2 != null) {
                                                    i2 = C0966R.C0970id.h9w;
                                                    LinearLayout linearLayout5 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.h9w);
                                                    if (linearLayout5 != null) {
                                                        i2 = C0966R.C0970id.h9n;
                                                        TextView textView3 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.h9n);
                                                        if (textView3 != null) {
                                                            i2 = C0966R.C0970id.h9x;
                                                            LinearLayout linearLayout6 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.h9x);
                                                            if (linearLayout6 != null) {
                                                                i2 = C0966R.C0970id.h9o;
                                                                TextView textView4 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.h9o);
                                                                if (textView4 != null) {
                                                                    i2 = C0966R.C0970id.hgr;
                                                                    TextView textView5 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.hgr);
                                                                    if (textView5 != null) {
                                                                        i2 = C0966R.C0970id.hqv;
                                                                        MusicMvTabMachineFragment musicMvTabMachineFragment = (MusicMvTabMachineFragment) C10462b.m10395a(inflate, C0966R.C0970id.hqv);
                                                                        if (musicMvTabMachineFragment != null) {
                                                                            i2 = C0966R.C0970id.hqw;
                                                                            MusicMvTabMyFavFragment musicMvTabMyFavFragment = (MusicMvTabMyFavFragment) C10462b.m10395a(inflate, C0966R.C0970id.hqw);
                                                                            if (musicMvTabMyFavFragment != null) {
                                                                                i2 = C0966R.C0970id.hqx;
                                                                                MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = (MusicMvTabMyLikeFragment) C10462b.m10395a(inflate, C0966R.C0970id.hqx);
                                                                                if (musicMvTabMyLikeFragment != null) {
                                                                                    i2 = C0966R.C0970id.hqy;
                                                                                    MusicMvTabMyPostFragment musicMvTabMyPostFragment = (MusicMvTabMyPostFragment) C10462b.m10395a(inflate, C0966R.C0970id.hqy);
                                                                                    if (musicMvTabMyPostFragment != null) {
                                                                                        i2 = C0966R.C0970id.hqz;
                                                                                        MusicMvTabSearchFragment musicMvTabSearchFragment = (MusicMvTabSearchFragment) C10462b.m10395a(inflate, C0966R.C0970id.hqz);
                                                                                        if (musicMvTabSearchFragment != null) {
                                                                                            i2 = C0966R.C0970id.j4r;
                                                                                            WeImageView weImageView2 = (WeImageView) C10462b.m10395a(inflate, C0966R.C0970id.j4r);
                                                                                            if (weImageView2 != null) {
                                                                                                i2 = C0966R.C0970id.j6n;
                                                                                                LinearLayout linearLayout7 = (LinearLayout) C10462b.m10395a(inflate, C0966R.C0970id.j6n);
                                                                                                if (linearLayout7 != null) {
                                                                                                    i2 = C0966R.C0970id.j75;
                                                                                                    FTSSearchNoActionBarView fTSSearchNoActionBarView = (FTSSearchNoActionBarView) C10462b.m10395a(inflate, C0966R.C0970id.j75);
                                                                                                    if (fTSSearchNoActionBarView != null) {
                                                                                                        i2 = C0966R.C0970id.kpg;
                                                                                                        TabLayout tabLayout = (TabLayout) C10462b.m10395a(inflate, C0966R.C0970id.kpg);
                                                                                                        if (tabLayout != null) {
                                                                                                            this.f163462F = new C58252a(relativeLayout, recyclerView, weImageView, relativeLayout, linearLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout2, linearLayout3, textView, linearLayout4, textView2, linearLayout5, textView3, linearLayout6, textView4, textView5, musicMvTabMachineFragment, musicMvTabMyFavFragment, musicMvTabMyLikeFragment, musicMvTabMyPostFragment, musicMvTabSearchFragment, weImageView2, linearLayout7, fTSSearchNoActionBarView, tabLayout);
                                                                                                            this.f163464H = C64197v.m75534c(getContext().getString(C0966R.string.f361073h23), getContext().getString(C0966R.string.f361074h24));
                                                                                                            this.f163466J = new C65312t(this);
                                                                                                            this.f163467K = "#*$";
                                                                                                            this.f163468L = new C65279e(this);
                                                                                                            this.f163469M = new C65283f(this);
                                                                                                            this.f163470N = new C65301o(this);
                                                                                                            this.f163474R = -1;
                                                                                                            this.f163476S = -1;
                                                                                                            this.f163480U = C60218q.C60219a.IDLE;
                                                                                                            this.f163484W = 27;
                                                                                                            this.f163496p0 = 3;
                                                                                                            this.f163507y0 = -1;
                                                                                                            this.f163481U0 = true;
                                                                                                            this.f163485W0 = new C65315v(this);
                                                                                                            return;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
