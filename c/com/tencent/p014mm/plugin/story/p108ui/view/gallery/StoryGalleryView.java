package com.tencent.p014mm.plugin.story.p108ui.view.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StoryCheckedFavFromGalleryEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPageExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import com.tencent.p014mm.plugin.story.api.AbsStoryGallery;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.plugin.story.p108ui.layout.AvatarLayoutManager;
import com.tencent.p014mm.plugin.story.p108ui.layout.GalleryLayoutManager;
import com.tencent.p014mm.plugin.story.p108ui.view.CommentsContainer;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryCommentView;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgListView;
import com.tencent.p014mm.plugin.story.p108ui.view.StoryMsgView;
import com.tencent.p014mm.plugin.story.p108ui.view.gallery.GalleryRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86013q1;
import cw2.C30930i;
import cw2.C97382b;
import cw2.C97383c;
import cw2.C97384g;
import di3.C86312j;
import eb0.C45628s0;
import en3.C75628g;
import ew2.C97758b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import go3.C76003c;
import gw2.C98261f;
import gw2.C98266k;
import gw2.C98268m;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import iw2.C98858n;
import iw2.C98862q;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import jw2.C99066b;
import jw2.C99068c;
import jw2.C99069d;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import kw2.C99268i;
import kw2.C99269j;
import lw2.C76729b;
import lw2.C76732d;
import lw2.C76734e;
import lw2.C99698j;
import lw2.C99703l;
import nj3.C76879j;
import nj3.C76912y0;
import nw2.C76965a;
import o40.C61926c;
import ow2.C100591g;
import ow2.C100595h;
import ow2.C100604w;
import ow2.C47401o;
import ow2.C47402t;
import ow2.C62184j;
import ow2.C77044c;
import ow2.C77046e;
import ow2.C77047f;
import ow2.C77048i;
import p565ir.C60606n;
import p663qo.C101213l;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C64197v;
import xv2.C102778f;
import xv2.C79005m;
import zv2.C103105a;
import zv2.C103109c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002DEJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR'\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R.\u00105\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00109\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\u0016\u0010:\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010'R\u0014\u0010<\u001a\u00020;8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010?\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010'\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R\"\u0010B\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bA\u0010'\u001a\u0004\bB\u0010)\"\u0004\bC\u0010+¨\u0006F"}, mo182094d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView;", "Lcom/tencent/mm/plugin/story/api/AbsStoryGallery;", "", "dataSeed", "Lrx3/b0;", "setDataInternal", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$m;", "listener", "setGalleryScaleListener", "setDataSeed", "Lxv2/f;", "setStoryBrowseUIListener", "", "position", "setCurrentVItem", "setCurrentHItem", "", "canScale", "setCanDragScale", "Lxv2/m$a;", "d", "Lxv2/m$a;", "getGalleryType", "()Lxv2/m$a;", "galleryType", "e", "I", "getExpectPos", "()I", "expectPos", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "getCheckedFavList", "()Ljava/util/ArrayList;", "checkedFavList", "g", "Z", "getDeleteWhenFirstEmpty", "()Z", "setDeleteWhenFirstEmpty", "(Z)V", "deleteWhenFirstEmpty", "", "value", "h", "Ljava/lang/String;", "getChatRoom", "()Ljava/lang/String;", "setChatRoom", "(Ljava/lang/String;)V", "chatRoom", "i", "getSessionId", "setSessionId", "sessionId", "mIsActive", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView;", "holderView", "Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView;", "p0", "isNeedReset", "setNeedReset", "x0", "isFirstPost", "setFirstPost", "l", "m", "plugin-story_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView */
public final class StoryGalleryView extends AbsStoryGallery {

    /* renamed from: Q0 */
    public static final /* synthetic */ int f282056Q0 = 0;

    /* renamed from: A */
    public C98862q f282057A;

    /* renamed from: B */
    public boolean f282058B;

    /* renamed from: C */
    public C102778f f282059C;

    /* renamed from: D */
    public boolean f282060D;

    /* renamed from: E */
    public boolean f282061E;

    /* renamed from: F */
    public View f282062F;

    /* renamed from: G */
    public boolean f282063G;

    /* renamed from: H */
    public boolean f282064H;

    /* renamed from: I */
    public C71277m f282065I;

    /* renamed from: J */
    public C75628g f282066J;

    /* renamed from: K */
    public final C32224a<Boolean> f282067K;

    /* renamed from: L */
    public final GalleryVerticalControlView f282068L;

    /* renamed from: M */
    public C77044c f282069M;

    /* renamed from: N */
    public C89779i0 f282070N;

    /* renamed from: P */
    public StoryVideoViewMgr f282071P;

    /* renamed from: Q */
    public final C100591g f282072Q;

    /* renamed from: R */
    public boolean f282073R;

    /* renamed from: S */
    public final C32227p<Boolean, Long, C13598b0> f282074S;

    /* renamed from: T */
    public final C96431p f282075T;

    /* renamed from: U */
    public int f282076U;

    /* renamed from: V */
    public boolean f282077V;

    /* renamed from: W */
    public C98268m f282078W;

    /* renamed from: d */
    public final C79005m.C79006a f282079d;

    /* renamed from: e */
    public final int f282080e;

    /* renamed from: f */
    public final ArrayList<Long> f282081f;

    /* renamed from: g */
    public boolean f282082g;

    /* renamed from: h */
    public String f282083h;
    /* access modifiers changed from: private */
    public final GalleryHolderView holderView;

    /* renamed from: i */
    public String f282084i;

    /* renamed from: j */
    public final TextView f282085j;
    /* access modifiers changed from: private */
    public boolean mIsActive;

    /* renamed from: n */
    public StoryGalleryItemView f282086n;

    /* renamed from: o */
    public FrameLayout f282087o;

    /* renamed from: p */
    public RecyclerView f282088p;

    /* renamed from: p0 */
    public boolean f282089p0;

    /* renamed from: q */
    public GalleryHorizontalControlView f282090q;

    /* renamed from: r */
    public C99703l f282091r;

    /* renamed from: s */
    public final C54259z f282092s;

    /* renamed from: t */
    public final C62184j f282093t;

    /* renamed from: u */
    public int f282094u;

    /* renamed from: v */
    public int f282095v;

    /* renamed from: w */
    public float f282096w;

    /* renamed from: x */
    public final GalleryRecyclerView.C96412c f282097x;

    /* renamed from: x0 */
    public boolean f282098x0;

    /* renamed from: y */
    public final GalleryRecyclerView f282099y;

    /* renamed from: y0 */
    public Runnable f282100y0;

    /* renamed from: z */
    public final ArrayList<ArrayList<C98266k>> f282101z;

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$l */
    public static final class C43171l {
        public C43171l(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$o */
    public static final class C43172o extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f116787d;

        public C43172o(StoryGalleryView storyGalleryView) {
            this.f116787d = storyGalleryView;
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f116787d.f282062F;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$fadeOutMaskView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$fadeOutMaskView$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$m */
    public interface C71277m {
        /* renamed from: a */
        void mo98130a(float f);

        /* renamed from: b */
        void mo98131b();
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$a */
    public static final class C96419a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96419a(StoryGalleryView storyGalleryView) {
            super(0);
            this.f282102d = storyGalleryView;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            r1 = r1.getVideoItem();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r2 = this;
                zv2.c r0 = zv2.C103109c.f304232b
                boolean r0 = r0.mo108963a()
                if (r0 == 0) goto L_0x002f
                com.tencent.mm.plugin.story.model.StoryCore$h r0 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
                java.lang.String r0 = r0.mo134187e()
                com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r1 = r2.f282102d
                com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r1 = r1.f282086n
                if (r1 == 0) goto L_0x001d
                gw2.m r1 = r1.getVideoItem()
                if (r1 == 0) goto L_0x001d
                java.lang.String r1 = r1.f288091d
                goto L_0x001e
            L_0x001d:
                r1 = 0
            L_0x001e:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r1)
                if (r0 == 0) goto L_0x002f
                int r0 = com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView.f282056Q0
                java.lang.String r0 = "MicroMsg.StoryGalleryView"
                java.lang.String r1 = "toggleActiveState  skip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                goto L_0x003a
            L_0x002f:
                com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView r0 = r2.f282102d
                boolean r1 = r0.f282073R
                r1 = r1 ^ 1
                r0.f282073R = r1
                r0.mo134371B(r1)
            L_0x003a:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView.C96419a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$b */
    public static final class C96420b extends C87413o implements C32227p<Boolean, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282103d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96420b(StoryGalleryView storyGalleryView) {
            super(2);
            this.f282103d = storyGalleryView;
        }

        public Object invoke(Object obj, Object obj2) {
            List list;
            RecyclerView.C16613e adapter;
            List list2;
            RecyclerView.C16613e adapter2;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            long longValue = ((Number) obj2).longValue();
            StoryGalleryItemView storyGalleryItemView = this.f282103d.f282086n;
            if (storyGalleryItemView != null && C103109c.f304232b.mo108963a()) {
                StoryMsgView storyMsgView = storyGalleryItemView.f282049g;
                if (!booleanValue) {
                    storyMsgView.getClass();
                } else if (Util.isEqual(longValue, storyMsgView.f281985w) && !storyMsgView.f281978p.isEmpty()) {
                    if (storyMsgView.f281980r) {
                        StoryMsgListView storyMsgListView = storyMsgView.f281978p.get(1);
                        C98261f fVar = storyMsgView.f281979q;
                        if (fVar == null || (list2 = fVar.f288075h) == null) {
                            list2 = new ArrayList();
                        }
                        storyMsgListView.getClass();
                        if (storyMsgListView.f281955f == 1 && (adapter2 = storyMsgListView.f281953d.getAdapter()) != null) {
                            ((C99698j) adapter2).mo139065F4(storyMsgListView.mo134290a(list2));
                        }
                    } else {
                        StoryMsgListView storyMsgListView2 = storyMsgView.f281978p.get(0);
                        C98261f fVar2 = storyMsgView.f281979q;
                        if (fVar2 == null || (list = fVar2.f288075h) == null) {
                            list = new ArrayList();
                        }
                        storyMsgListView2.getClass();
                        if (storyMsgListView2.f281955f == 1 && (adapter = storyMsgListView2.f281953d.getAdapter()) != null) {
                            ((C99698j) adapter).mo139065F4(storyMsgListView2.mo134290a(list));
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$c */
    public static final class C96421c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C96421c f282104d = new C96421c();

        public C96421c() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$d */
    public static final class C96422d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282105d;

        public C96422d(StoryGalleryView storyGalleryView) {
            this.f282105d = storyGalleryView;
        }

        public final void onClick(View view) {
            C102778f fVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f282105d.f282101z.size() == 1 && this.f282105d.f282101z.get(0).isEmpty() && (fVar = this.f282105d.f282059C) != null) {
                fVar.mo96578I4();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$e */
    public static final class C96423e extends C87413o implements C32228q<Integer, RecyclerView, GalleryHorizontalControlView, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96423e(StoryGalleryView storyGalleryView) {
            super(3);
            this.f282106d = storyGalleryView;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            StoryGalleryView.m123651v(this.f282106d, ((Number) obj).intValue(), (RecyclerView) obj2, (GalleryHorizontalControlView) obj3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$f */
    public static final class C96424f extends C87413o implements C32227p<Integer, Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96424f(StoryGalleryView storyGalleryView) {
            super(2);
            this.f282107d = storyGalleryView;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            float floatValue = ((Number) obj2).floatValue();
            StoryGalleryView storyGalleryView = this.f282107d;
            storyGalleryView.f282096w = ((float) intValue) + floatValue;
            GalleryVerticalControlView galleryVerticalControlView = storyGalleryView.f282068L;
            int i = intValue + 1;
            float f = ((float) 1) - floatValue;
            int b = galleryVerticalControlView.f282032r == C79005m.C79006a.MultiUserGallery ? C76577a.m92151b(galleryVerticalControlView.getContext(), 52) : C76577a.m92151b(galleryVerticalControlView.getContext(), 32);
            AvatarLayoutManager avatarLayoutManager = galleryVerticalControlView.f282034t;
            if (avatarLayoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf((int) (((float) b) * f)));
                aVar.mo10233c(Integer.valueOf(i));
                AvatarLayoutManager avatarLayoutManager2 = avatarLayoutManager;
                C117292a.m165358d(avatarLayoutManager2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView", "setScrollOffset", "(IF)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                avatarLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(avatarLayoutManager2, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryVerticalControlView", "setScrollOffset", "(IF)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$g */
    public static final class C96425g extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282108d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96425g(StoryGalleryView storyGalleryView) {
            super(1);
            this.f282108d = storyGalleryView;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            C98862q qVar = this.f282108d.f282057A;
            if (qVar != null) {
                qVar.mo138204b(intValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$h */
    public static final class C96426h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96426h(StoryGalleryView storyGalleryView) {
            super(0);
            this.f282109d = storyGalleryView;
        }

        public Object invoke() {
            StoryGalleryView storyGalleryView = this.f282109d;
            if (storyGalleryView.f282065I != null) {
                C99069d.f290418a.mo138412a(12);
                C71277m mVar = this.f282109d.f282065I;
                if (mVar != null) {
                    mVar.mo98131b();
                }
            } else {
                C102778f fVar = storyGalleryView.f282059C;
                if (fVar != null) {
                    fVar.mo96578I4();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$i */
    public static final class C96427i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282110d;

        /* renamed from: e */
        public final /* synthetic */ Context f282111e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96427i(StoryGalleryView storyGalleryView, Context context) {
            super(0);
            this.f282110d = storyGalleryView;
            this.f282111e = context;
        }

        public Object invoke() {
            C77044c cVar;
            C77044c cVar2;
            C77044c cVar3;
            C77044c cVar4;
            StoryGalleryView storyGalleryView = this.f282110d;
            if (storyGalleryView.f282060D) {
                int size = storyGalleryView.f282101z.size();
                StoryGalleryView storyGalleryView2 = this.f282110d;
                int i = storyGalleryView2.f282094u;
                if (i >= 0 && i < size) {
                    int size2 = storyGalleryView2.f282101z.get(i).size();
                    StoryGalleryView storyGalleryView3 = this.f282110d;
                    int i2 = storyGalleryView3.f282095v;
                    if (i2 >= 0 && i2 < size2) {
                        Object obj = storyGalleryView3.f282101z.get(storyGalleryView3.f282094u).get(this.f282110d.f282095v);
                        C87412m.m108593f(obj, "galleryGroups[selectedRow][selectedColumn]");
                        C98266k kVar = (C98266k) obj;
                        C77044c cVar5 = this.f282110d.f282069M;
                        if (cVar5 != null) {
                            cVar5.dismiss();
                        }
                        this.f282110d.f282069M = new C77044c(this.f282111e);
                        C99268i Yt = StoryCore.f281736t.mo134191i().mo138667Yt(kVar.f288082e.f288088a);
                        Long l = null;
                        if (Yt != null) {
                            if (!(((Yt.field_localFlag & 4) != 0 ? Yt : null) == null || (cVar4 = this.f282110d.f282069M) == null)) {
                                cVar4.f225054B = true;
                            }
                        }
                        if (Yt != null) {
                            if (!(((Yt.field_storyID > 0 ? 1 : (Yt.field_storyID == 0 ? 0 : -1)) == 0 ? Yt : null) == null || (cVar3 = this.f282110d.f282069M) == null)) {
                                cVar3.f225058F = false;
                            }
                        }
                        if (Yt != null) {
                            if (!(((Yt.field_storyID > 0 ? 1 : (Yt.field_storyID == 0 ? 0 : -1)) == 0 || Yt.mo138658q2() ? Yt : null) == null || (cVar2 = this.f282110d.f282069M) == null)) {
                                cVar2.f225056D = false;
                            }
                        }
                        if (this.f282110d.getGalleryType() == C79005m.C79006a.FavSelfStoryGallery && (cVar = this.f282110d.f282069M) != null) {
                            cVar.f225053A = false;
                        }
                        C77044c cVar6 = this.f282110d.f282069M;
                        if (cVar6 != null) {
                            cVar6.f225055C = (Yt != null && C61926c.m72696u(Yt.field_itemStoryFlag, 4)) && !Yt.mo138658q2();
                        }
                        C77044c cVar7 = this.f282110d.f282069M;
                        if (cVar7 != null) {
                            cVar7.f225057E = Yt != null && Yt.mo138654m2();
                        }
                        StoryGalleryView storyGalleryView4 = this.f282110d;
                        C77044c cVar8 = storyGalleryView4.f282069M;
                        if ((cVar8 != null && cVar8.f225055C) && cVar8 != null) {
                            cVar8.f225058F = false;
                        }
                        if ((cVar8 != null && cVar8.f225057E) && cVar8 != null) {
                            cVar8.f225056D = false;
                        }
                        if (cVar8 != null) {
                            cVar8.f225068w = new C96452b(storyGalleryView4);
                        }
                        StoryGalleryView storyGalleryView5 = this.f282110d;
                        C77044c cVar9 = storyGalleryView5.f282069M;
                        if (cVar9 != null) {
                            cVar9.f225069x = new C96453c(storyGalleryView5, kVar);
                        }
                        StoryGalleryView storyGalleryView6 = this.f282110d;
                        C77044c cVar10 = storyGalleryView6.f282069M;
                        if (cVar10 != null) {
                            cVar10.f225070y = new C96454d(storyGalleryView6);
                        }
                        StoryGalleryView storyGalleryView7 = this.f282110d;
                        C77044c cVar11 = storyGalleryView7.f282069M;
                        if (cVar11 != null) {
                            cVar11.f225071z = new C96451a(storyGalleryView7);
                        }
                        C77044c cVar12 = this.f282110d.f282069M;
                        if (cVar12 != null) {
                            cVar12.show();
                        }
                        this.f282110d.f282064H = true;
                        C99069d dVar = C99069d.f290418a;
                        StoryPageExposeStruct storyPageExposeStruct = C99069d.f290419b;
                        storyPageExposeStruct.f266262d = 7;
                        if (Yt != null) {
                            l = Long.valueOf(Yt.field_storyID);
                        }
                        storyPageExposeStruct.f266263e = storyPageExposeStruct.mo86045b("StoryId", String.valueOf(l), true);
                        dVar.mo138413b();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$j */
    public static final class C96428j extends C87413o implements C32227p<CompoundButton, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282112d;

        /* renamed from: e */
        public final /* synthetic */ Context f282113e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96428j(StoryGalleryView storyGalleryView, Context context) {
            super(2);
            this.f282112d = storyGalleryView;
            this.f282113e = context;
        }

        public Object invoke(Object obj, Object obj2) {
            CompoundButton compoundButton = (CompoundButton) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C87412m.m108594g(compoundButton, "checkBox");
            int size = this.f282112d.f282101z.size();
            StoryGalleryView storyGalleryView = this.f282112d;
            int i = storyGalleryView.f282094u;
            boolean z = true;
            if (i >= 0 && i < size) {
                int size2 = storyGalleryView.f282101z.get(i).size();
                StoryGalleryView storyGalleryView2 = this.f282112d;
                int i2 = storyGalleryView2.f282095v;
                if (i2 < 0 || i2 >= size2) {
                    z = false;
                }
                if (z) {
                    Object obj3 = storyGalleryView2.f282101z.get(storyGalleryView2.f282094u).get(this.f282112d.f282095v);
                    C87412m.m108593f(obj3, "galleryGroups[selectedRow][selectedColumn]");
                    long j = ((C98266k) obj3).f288078a.field_storyID;
                    int i3 = StoryGalleryView.f282056Q0;
                    Log.m105924i("MicroMsg.StoryGalleryView", "onCheckedFav " + j + ' ' + booleanValue);
                    if (!booleanValue) {
                        this.f282112d.getCheckedFavList().remove(Long.valueOf(j));
                    } else if (this.f282112d.getCheckedFavList().size() >= 9) {
                        compoundButton.setChecked(false);
                        Context context = this.f282113e;
                        C76879j.m92748s(context, "", context.getResources().getString(C0966R.string.jqa));
                    } else if (!this.f282112d.getCheckedFavList().contains(Long.valueOf(j))) {
                        this.f282112d.getCheckedFavList().add(Long.valueOf(j));
                    }
                    StoryCheckedFavFromGalleryEvent storyCheckedFavFromGalleryEvent = new StoryCheckedFavFromGalleryEvent();
                    StoryCheckedFavFromGalleryEvent.C92602a aVar = storyCheckedFavFromGalleryEvent.f265227d;
                    aVar.f265228a = booleanValue;
                    aVar.f265229b = j;
                    storyCheckedFavFromGalleryEvent.publish();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$k */
    public static final class C96429k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C96429k f282114d = new C96429k();

        public C96429k() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$n */
    public static final class C96430n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282115d;

        public C96430n(StoryGalleryView storyGalleryView) {
            this.f282115d = storyGalleryView;
        }

        public final void run() {
            int i;
            StoryGalleryItemView storyGalleryItemView = this.f282115d.f282086n;
            if (storyGalleryItemView != null && storyGalleryItemView.getVideoItem() != null) {
                StoryGalleryView storyGalleryView = this.f282115d;
                C99269j i2 = StoryCore.f281736t.mo134191i();
                StoryGalleryItemView storyGalleryItemView2 = storyGalleryView.f282086n;
                C87412m.m108591d(storyGalleryItemView2);
                C98268m videoItem = storyGalleryItemView2.getVideoItem();
                C87412m.m108591d(videoItem);
                long j = videoItem.f288089b;
                C99269j.C10425a aVar = C99269j.f291079j;
                C99268i Yt = j >= 0 ? i2.mo138667Yt((int) j) : i2.mo138664Ow(j);
                if (Yt != null) {
                    Yt.field_readCount++;
                    ContentValues convertTo = Yt.convertTo();
                    i = i2.f291093h.update("MMStoryInfo", convertTo, "storyID=?", new String[]{"" + j});
                } else {
                    i = -1;
                }
                int i3 = StoryGalleryView.f282056Q0;
                StringBuilder sb = new StringBuilder();
                sb.append("storyId :");
                StoryGalleryItemView storyGalleryItemView3 = storyGalleryView.f282086n;
                C87412m.m108591d(storyGalleryItemView3);
                C98268m videoItem2 = storyGalleryItemView3.getVideoItem();
                C87412m.m108591d(videoItem2);
                sb.append(videoItem2.f288089b);
                sb.append(" read times + 1  ,result:");
                sb.append(i);
                Log.m105924i("MicroMsg.StoryGalleryView", sb.toString());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$p */
    public static final class C96431p implements C98858n {

        /* renamed from: a */
        public final /* synthetic */ StoryGalleryView f282116a;

        /* renamed from: b */
        public final /* synthetic */ Context f282117b;

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$p$a */
        public static final class C96432a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryGalleryView f282118d;

            /* renamed from: e */
            public final /* synthetic */ int f282119e;

            public C96432a(StoryGalleryView storyGalleryView, int i) {
                this.f282118d = storyGalleryView;
                this.f282119e = i;
            }

            public final void run() {
                this.f282118d.f282097x.notifyItemChanged(this.f282119e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$p$b */
        public static final class C96433b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryGalleryView f282120d;

            /* renamed from: e */
            public final /* synthetic */ int f282121e;

            public C96433b(StoryGalleryView storyGalleryView, int i) {
                this.f282120d = storyGalleryView;
                this.f282121e = i;
            }

            public final void run() {
                this.f282120d.f282097x.notifyItemChanged(this.f282121e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$p$c */
        public static final class C96434c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryGalleryView f282122d;

            /* renamed from: e */
            public final /* synthetic */ int f282123e;

            public C96434c(StoryGalleryView storyGalleryView, int i) {
                this.f282122d = storyGalleryView;
                this.f282123e = i;
            }

            public final void run() {
                this.f282122d.f282097x.notifyItemChanged(this.f282123e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$p$d */
        public static final class C96435d implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryGalleryView f282124d;

            /* renamed from: e */
            public final /* synthetic */ int f282125e;

            public C96435d(StoryGalleryView storyGalleryView, int i) {
                this.f282124d = storyGalleryView;
                this.f282125e = i;
            }

            public final void run() {
                this.f282124d.f282097x.notifyItemChanged(this.f282125e);
            }
        }

        /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$p$e */
        public static final class C96436e implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StoryGalleryView f282126d;

            public C96436e(StoryGalleryView storyGalleryView) {
                this.f282126d = storyGalleryView;
            }

            public final void run() {
                this.f282126d.mo98077q();
            }
        }

        public C96431p(StoryGalleryView storyGalleryView, Context context) {
            this.f282116a = storyGalleryView;
            this.f282117b = context;
        }

        /* renamed from: a */
        public void mo134393a(int i) {
            if (i <= 1) {
                C100591g gVar = this.f282116a.f282072Q;
                gVar.getClass();
                C61926c.m72668M(new C100595h(gVar));
            }
            this.f282116a.f282101z.clear();
            for (int i2 = 0; i2 < i; i2++) {
                this.f282116a.f282101z.add(new ArrayList());
            }
        }

        /* renamed from: b */
        public void mo134394b(boolean z, boolean z2) {
            if (z2) {
                GalleryVerticalControlView galleryVerticalControlView = this.f282116a.f282068L;
                if (z) {
                    galleryVerticalControlView.getClass();
                    C103105a.C103106a aVar = (C103105a.C103106a) C103105a.f304209b.mo138761d();
                }
                galleryVerticalControlView.f282023f.setVisibility(8);
            } else if (z) {
                Context context = this.f282117b;
                C76879j.m92748s(context, "", context.getResources().getString(C0966R.string.jqa));
            }
        }

        /* renamed from: c */
        public void mo134395c(boolean z) {
            this.f282116a.f282068L.mo134336a(z);
        }

        /* renamed from: d */
        public void mo134396d(int i, int i2, int i3) {
            StoryGalleryView storyGalleryView = this.f282116a;
            if (storyGalleryView.f282094u == i) {
                C99703l lVar = storyGalleryView.f282091r;
                if (lVar != null) {
                    lVar.notifyItemRangeChanged(i2, i3);
                    return;
                }
                return;
            }
            storyGalleryView.f282099y.post(new C96433b(storyGalleryView, i));
        }

        /* renamed from: e */
        public void mo134397e() {
            GalleryHorizontalControlView galleryHorizontalControlView;
            int size = this.f282116a.f282101z.size();
            StoryGalleryView storyGalleryView = this.f282116a;
            int i = storyGalleryView.f282094u;
            boolean z = false;
            if (i >= 0 && i < size) {
                z = true;
            }
            if (z && (galleryHorizontalControlView = storyGalleryView.f282090q) != null) {
                ArrayList<C98266k> arrayList = storyGalleryView.f282101z.get(i);
                C87412m.m108593f(arrayList, "galleryGroups[selectedRow]");
                galleryHorizontalControlView.mo6520a(arrayList);
            }
        }

        /* renamed from: f */
        public void mo134398f(int i, int i2, int i3) {
            StoryGalleryView storyGalleryView = this.f282116a;
            if (storyGalleryView.f282094u == i) {
                C99703l lVar = storyGalleryView.f282091r;
                if (lVar != null) {
                    lVar.notifyItemRangeInserted(i2, i3);
                    return;
                }
                return;
            }
            storyGalleryView.f282099y.post(new C96434c(storyGalleryView, i));
        }

        /* renamed from: g */
        public void mo134399g(int i, List<C98266k> list) {
            C99703l lVar;
            C87412m.m108594g(list, "items");
            int i2 = StoryGalleryView.f282056Q0;
            Log.printInfoStack("MicroMsg.StoryGalleryView", "updateGroup, groupIndex:" + i + ", items:" + list.size() + ", active:" + this.f282116a.mIsActive + ", galleryType:" + this.f282116a.getGalleryType(), new Object[0]);
            if (i < this.f282116a.f282101z.size()) {
                this.f282116a.f282101z.get(i).clear();
                this.f282116a.f282101z.get(i).addAll(list);
                StoryGalleryView storyGalleryView = this.f282116a;
                GalleryRecyclerView.C96412c cVar = storyGalleryView.f282097x;
                ArrayList<ArrayList<C98266k>> arrayList = storyGalleryView.f282101z;
                cVar.getClass();
                C87412m.m108594g(arrayList, "items");
                cVar.f282015d.clear();
                cVar.f282015d.addAll(arrayList);
                StoryGalleryView storyGalleryView2 = this.f282116a;
                if (storyGalleryView2.f282094u == i && (lVar = storyGalleryView2.f282091r) != null) {
                    lVar.f292220f.clear();
                    lVar.f292220f.addAll(list);
                }
                if (this.f282116a.f282101z.size() != 1 || !list.isEmpty()) {
                    StoryGalleryView storyGalleryView3 = this.f282116a;
                    storyGalleryView3.post(new C96436e(storyGalleryView3));
                    C102778f fVar = this.f282116a.f282059C;
                    if (fVar != null) {
                        fVar.mo96586V1();
                    }
                    this.f282116a.holderView.setVisibility(8);
                    if (!this.f282116a.mIsActive) {
                        View view = this.f282116a.f282062F;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Float.valueOf(1.0f));
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        View view3 = this.f282116a.f282062F;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        View view4 = view3;
                        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view4, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                } else {
                    C102778f fVar2 = this.f282116a.f282059C;
                    if (fVar2 != null) {
                        fVar2.mo96576B1();
                    }
                    View view5 = this.f282116a.f282062F;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "updateGroup", "(ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (this.f282116a.getGalleryType() == C79005m.C79006a.SelfTabGallery) {
                        this.f282116a.holderView.setVisibility(0);
                        C99069d dVar = C99069d.f290418a;
                        C99069d.f290419b.f266262d = 1;
                        dVar.mo138413b();
                    } else {
                        this.f282116a.holderView.setVisibility(8);
                    }
                }
                if (i == 0 && !this.f282116a.mIsActive && this.f282116a.getGalleryType() != C79005m.C79006a.HistoryGallery && this.f282116a.getGalleryType() != C79005m.C79006a.MultiUserGallery) {
                    this.f282116a.mo134389y(0, 0);
                } else if (i == 1) {
                    this.f282116a.getGalleryType();
                }
            }
        }

        /* renamed from: h */
        public void mo134400h(int i) {
            int i2 = StoryGalleryView.f282056Q0;
            Log.m105924i("MicroMsg.StoryGalleryView", "deleteGroup: exitCheck " + this.f282116a.getDeleteWhenFirstEmpty() + ' ' + i + ' ' + this.f282116a.f282094u);
            if (this.f282116a.getDeleteWhenFirstEmpty() && i == 0 && this.f282116a.f282094u <= 0) {
                C102778f fVar = this.f282116a.f282059C;
                if (fVar != null) {
                    fVar.mo96578I4();
                    return;
                }
                return;
            }
            if (i >= 0 && i < this.f282116a.f282101z.size()) {
                this.f282116a.f282101z.remove(i);
                StoryGalleryView storyGalleryView = this.f282116a;
                GalleryRecyclerView.C96412c cVar = storyGalleryView.f282097x;
                ArrayList<ArrayList<C98266k>> arrayList = storyGalleryView.f282101z;
                cVar.getClass();
                C87412m.m108594g(arrayList, "items");
                cVar.f282015d.clear();
                cVar.f282015d.addAll(arrayList);
                this.f282116a.f282097x.notifyItemRemoved(i);
                C76734e<?> eVar = this.f282116a.f282068L.f282033s;
                if (eVar != null && i >= 0 && i < eVar.f224492d.size() - 2) {
                    int i3 = i + 1;
                    eVar.f224492d.remove(i3);
                    eVar.notifyItemRemoved(i3);
                }
            }
            if (this.f282116a.f282101z.size() <= 1) {
                C100591g gVar = this.f282116a.f282072Q;
                gVar.getClass();
                C61926c.m72668M(new C100595h(gVar));
            }
            if (this.f282116a.f282101z.isEmpty()) {
                C102778f fVar2 = this.f282116a.f282059C;
                if (fVar2 != null) {
                    fVar2.mo96576B1();
                }
                View view = this.f282116a.f282062F;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C102778f fVar3 = this.f282116a.f282059C;
            if (fVar3 != null) {
                fVar3.mo96586V1();
            }
            if (!this.f282116a.mIsActive) {
                View view3 = this.f282116a.f282062F;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(Float.valueOf(1.0f));
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view5 = this.f282116a.f282062F;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$galleryGroupUpdateCallback$1", "deleteGroup", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        /* renamed from: i */
        public void mo134401i(boolean z) {
            C89779i0 i0Var = this.f282116a.f282070N;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            if (!z) {
                Context context = this.f282117b;
                C76912y0.makeText(context, (CharSequence) context.getResources().getString(C0966R.string.jpe), 0).show();
                return;
            }
            int i = C30930i.f83021a;
            C85801v1 i2 = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_STORY_ONE_DAY_POST_COUNT_INT_SYNC;
            Object f = i2.mo119685f(aVar, 0);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(Math.max(0, ((Integer) f).intValue() - 1)));
        }

        /* renamed from: j */
        public void mo134402j(int i, int i2, int i3) {
            StoryGalleryView storyGalleryView = this.f282116a;
            if (storyGalleryView.f282094u == i) {
                C99703l lVar = storyGalleryView.f282091r;
                if (lVar != null) {
                    lVar.notifyItemRangeRemoved(i2, i3);
                    return;
                }
                return;
            }
            storyGalleryView.f282099y.post(new C96435d(storyGalleryView, i));
        }

        /* renamed from: k */
        public void mo134403k(int i) {
            int i2 = StoryGalleryView.f282056Q0;
            Log.printInfoStack("MicroMsg.StoryGalleryView", "notifyGroup, groupIndex:" + i + ", selectedRow:" + this.f282116a.f282094u, new Object[0]);
            StoryGalleryView storyGalleryView = this.f282116a;
            if (storyGalleryView.f282094u == i) {
                C99703l lVar = storyGalleryView.f282091r;
                if (lVar != null) {
                    lVar.notifyDataSetChanged();
                    return;
                }
                return;
            }
            storyGalleryView.f282099y.post(new C96432a(storyGalleryView, i));
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$q */
    public static final class C96437q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StoryGalleryView f282127d;

        /* renamed from: e */
        public final /* synthetic */ int f282128e;

        public C96437q(StoryGalleryView storyGalleryView, int i) {
            this.f282127d = storyGalleryView;
            this.f282128e = i;
        }

        public final void run() {
            StoryGalleryView storyGalleryView = this.f282127d;
            int i = storyGalleryView.f282094u;
            if (i != -1 && i < storyGalleryView.f282101z.size()) {
                int i2 = this.f282128e;
                StoryGalleryView storyGalleryView2 = this.f282127d;
                if (i2 < storyGalleryView2.f282101z.get(storyGalleryView2.f282094u).size()) {
                    int i3 = StoryGalleryView.f282056Q0;
                    StringBuilder sb = new StringBuilder();
                    sb.append("setCurrentHItem=");
                    sb.append(this.f282127d.f282094u);
                    sb.append(" galleryGroups.size=");
                    sb.append(this.f282127d.f282101z.size());
                    sb.append(" galleryGroups[selectedRow].size=");
                    StoryGalleryView storyGalleryView3 = this.f282127d;
                    sb.append(storyGalleryView3.f282101z.get(storyGalleryView3.f282094u).size());
                    sb.append(" hRecyclerView=");
                    sb.append(this.f282127d.f282088p);
                    Log.m105918d("MicroMsg.StoryGalleryView", sb.toString());
                    RecyclerView recyclerView = this.f282127d.f282088p;
                    if (recyclerView != null) {
                        int i4 = this.f282128e;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i4));
                        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentHItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentHItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$r */
    public static final class C96438r implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f282129d;

        /* renamed from: e */
        public final /* synthetic */ StoryGalleryView f282130e;

        public C96438r(int i, StoryGalleryView storyGalleryView) {
            this.f282129d = i;
            this.f282130e = storyGalleryView;
        }

        public final void run() {
            int i = StoryGalleryView.f282056Q0;
            Log.m105918d("MicroMsg.StoryGalleryView", "setCurrentVItem " + this.f282129d + ", all:" + this.f282130e.f282101z.size());
            if (this.f282129d < this.f282130e.f282101z.size()) {
                GalleryRecyclerView galleryRecyclerView = this.f282130e.f282099y;
                int i2 = this.f282129d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i2));
                C117292a.m165358d(galleryRecyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentVItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                galleryRecyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(galleryRecyclerView, "com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$setCurrentVItem$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    static {
        new C43171l((C8480h) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryGalleryView(Context context, C79005m.C79006a aVar, int i, boolean z, ArrayList arrayList, int i2, C8480h hVar) {
        this(context, aVar, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? new ArrayList() : arrayList);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [iw2.q] */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r1v38, types: [iw2.g0] */
    /* JADX WARNING: type inference failed for: r1v39, types: [iw2.r] */
    /* JADX WARNING: type inference failed for: r1v40, types: [iw2.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setDataInternal(java.lang.Object r14) {
        /*
            r13 = this;
            xv2.m$a r0 = xv2.C79005m.C79006a.SelfTabGallery
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView$p r4 = r13.f282075T
            xv2.m$a r1 = r13.f282079d
            java.lang.String r3 = r13.f282083h
            java.lang.String r2 = "groupCallback"
            gy3.C87412m.m108594g(r4, r2)
            java.lang.String r2 = "galleryType"
            gy3.C87412m.m108594g(r1, r2)
            boolean r9 = r14 instanceof xv2.C102784n
            r10 = 1
            r11 = 0
            if (r9 == 0) goto L_0x0072
            r1 = r14
            xv2.n r1 = (xv2.C102784n) r1
            java.util.List r3 = gw2.C98260e.m126996a(r1)
            boolean r2 = r1 instanceof gw2.C98256a
            r8 = 0
            if (r2 == 0) goto L_0x0028
            r2 = r1
            gw2.a r2 = (gw2.C98256a) r2
            goto L_0x002f
        L_0x0028:
            boolean r2 = r1 instanceof gw2.C98258c
            if (r2 == 0) goto L_0x0031
            r2 = r1
            gw2.c r2 = (gw2.C98258c) r2
        L_0x002f:
            r5 = r8
            goto L_0x0037
        L_0x0031:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r5 = r2
        L_0x0037:
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r2 = jw2.C99069d.f290421d
            int r6 = r3.size()
            long r6 = (long) r6
            r2.f266281u = r6
            boolean r2 = r1 instanceof gw2.C98258c
            if (r2 != 0) goto L_0x0062
            boolean r1 = r1 instanceof gw2.C98259d
            if (r1 == 0) goto L_0x0055
            iw2.r r7 = new iw2.r
            r6 = 0
            r8 = 0
            r1 = r7
            r2 = r3
            r3 = r6
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0149
        L_0x0055:
            iw2.r r7 = new iw2.r
            r6 = 0
            r8 = 0
            r1 = r7
            r2 = r3
            r3 = r6
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0149
        L_0x0062:
            gw2.c r14 = (gw2.C98258c) r14
            r14.getClass()
            iw2.f r1 = new iw2.f
            r2 = 0
            r5 = 0
            r6 = 8
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            throw r8
        L_0x0072:
            r2 = 2
            xv2.m$a[] r2 = new xv2.C79005m.C79006a[r2]
            xv2.m$a r5 = xv2.C79005m.C79006a.SelfGallery
            r2[r11] = r5
            r2[r10] = r0
            java.util.List r2 = sx3.C64197v.m75537f(r2)
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x00a5
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L_0x01df
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r1 = jw2.C99069d.f290421d
            r2 = 1
            r1.f266281u = r2
            iw2.x r8 = new iw2.x
            r2 = r14
            java.lang.String r2 = (java.lang.String) r2
            r5 = 0
            r6 = 0
            r7 = 8
            r12 = 0
            r1 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r7 = r8
            goto L_0x0149
        L_0x00a5:
            xv2.m$a r2 = xv2.C79005m.C79006a.SingleGallery
            if (r1 != r2) goto L_0x00aa
            goto L_0x00ae
        L_0x00aa:
            xv2.m$a r2 = xv2.C79005m.C79006a.ProfileGallery
            if (r1 != r2) goto L_0x00b0
        L_0x00ae:
            r2 = 1
            goto L_0x00b1
        L_0x00b0:
            r2 = 0
        L_0x00b1:
            if (r2 == 0) goto L_0x00d6
            boolean r1 = r14 instanceof java.lang.String
            if (r1 == 0) goto L_0x01df
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r14)
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r1 = jw2.C99069d.f290421d
            int r5 = r2.size()
            long r5 = (long) r5
            r1.f266281u = r5
            iw2.r r12 = new iw2.r
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x00d3:
            r7 = r12
            goto L_0x0149
        L_0x00d6:
            xv2.m$a r2 = xv2.C79005m.C79006a.MultiUserGallery
            if (r1 != r2) goto L_0x0111
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r1 = r14 instanceof java.util.Collection
            if (r1 == 0) goto L_0x01df
            r1 = r14
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00ea:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r1.next()
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L_0x00ea
            r2.add(r5)
            goto L_0x00ea
        L_0x00fc:
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r1 = jw2.C99069d.f290421d
            int r5 = r2.size()
            long r5 = (long) r5
            r1.f266281u = r5
            iw2.r r12 = new iw2.r
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x00d3
        L_0x0111:
            xv2.m$a r2 = xv2.C79005m.C79006a.HistoryGallery
            if (r1 != r2) goto L_0x01df
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r1 = r14 instanceof java.util.Collection
            if (r1 == 0) goto L_0x01df
            r1 = r14
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0125:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0137
            java.lang.Object r2 = r1.next()
            boolean r5 = r2 instanceof java.lang.String
            if (r5 == 0) goto L_0x0125
            r3.add(r2)
            goto L_0x0125
        L_0x0137:
            iw2.g0 r7 = new iw2.g0
            com.tencent.mm.plugin.story.model.StoryCore$h r1 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            java.lang.String r2 = r1.mo134187e()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0149:
            r13.f282057A = r7
            int r1 = r13.f282080e
            r7.mo138205e(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "presenter "
            r1.append(r2)
            iw2.q r2 = r13.f282057A
            r1.append(r2)
            java.lang.String r2 = " galleryType "
            r1.append(r2)
            xv2.m$a r2 = r13.f282079d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.StoryGalleryView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            iw2.q r1 = r13.f282057A
            if (r1 == 0) goto L_0x017a
            r1.mo138193f()
        L_0x017a:
            xv2.m$a r1 = r13.f282079d
            int r1 = r1.ordinal()
            r2 = 4
            r3 = 8
            if (r1 == r2) goto L_0x0192
            r2 = 5
            if (r1 == r2) goto L_0x0192
            r2 = 7
            if (r1 == r2) goto L_0x0192
            if (r1 == r3) goto L_0x0192
            r2 = 9
            if (r1 == r2) goto L_0x0192
            r10 = 0
        L_0x0192:
            if (r10 == 0) goto L_0x01ae
            if (r9 == 0) goto L_0x01a2
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r1 = r13.f282068L
            xv2.n r14 = (xv2.C102784n) r14
            java.util.List r14 = gw2.C98260e.m126996a(r14)
            r1.setUserList(r14)
            goto L_0x01bf
        L_0x01a2:
            boolean r1 = r14 instanceof java.util.List
            if (r1 == 0) goto L_0x01bf
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r1 = r13.f282068L
            java.util.List r14 = (java.util.List) r14
            r1.setUserList(r14)
            goto L_0x01bf
        L_0x01ae:
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r14 = r13.f282068L
            android.widget.ImageView r1 = r14.f282022e
            r1.setVisibility(r11)
            android.widget.FrameLayout r1 = r14.f282026i
            r1.setVisibility(r3)
            android.widget.ImageView r14 = r14.f282029o
            r14.setVisibility(r3)
        L_0x01bf:
            xv2.m$a r14 = r13.f282079d
            if (r14 != r0) goto L_0x01de
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            boolean r14 = r14 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r14 == 0) goto L_0x01de
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView r14 = r13.holderView
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r0, r1)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            r14.setInitMargin(r0)
        L_0x01de:
            return
        L_0x01df:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot handler dataSeed "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView.setDataInternal(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07af, code lost:
        if ((r0 == null || r0.isEmpty()) == false) goto L_0x07b1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06ed  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x073f  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0749  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x074b  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x074e  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x07bb  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x07be  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x07c8  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07f1  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07f9  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0820  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0834  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0856  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m123650t(com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView r39, int r40, android.view.View r41) {
        /*
            r1 = r39
            r2 = r40
            r39.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "LogStory: onItemSelected "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r4 = ", active:"
            r0.append(r4)
            boolean r4 = r1.mIsActive
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.StoryGalleryView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r1.f282086n
            if (r0 == 0) goto L_0x002e
            r0.mo134355a()
        L_0x002e:
            r1.f282095v = r2
            iw2.q r0 = r1.f282057A
            if (r0 == 0) goto L_0x0039
            int r5 = r1.f282094u
            r0.mo138196i(r5, r2)
        L_0x0039:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r1.f282086n
            r5 = 0
            if (r0 == 0) goto L_0x005b
            zv2.c r6 = zv2.C103109c.f304232b
            boolean r6 = r6.mo108963a()
            if (r6 == 0) goto L_0x0051
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r6 = r0.f282049g
            r6.setOnMsgPanelStateCallback(r5)
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r0 = r0.f282049g
            r0.setOnPageSelectedCallback(r5)
            goto L_0x005b
        L_0x0051:
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r6 = r0.f282048f
            r6.setStateChangeCallback(r5)
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r0 = r0.f282048f
            r0.mo134252d()
        L_0x005b:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r1.f282086n
            if (r0 == 0) goto L_0x0068
            android.widget.ImageView r0 = r0.getThumbView()
            if (r0 == 0) goto L_0x0068
            r0.setImageDrawable(r5)
        L_0x0068:
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r0 = r1.f282101z
            int r6 = r1.f282094u
            java.lang.Object r0 = r0.get(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r6 = r1.f282095v
            r8 = 0
            if (r6 < 0) goto L_0x007f
            if (r6 >= r0) goto L_0x007f
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            if (r0 != 0) goto L_0x0084
            goto L_0x097d
        L_0x0084:
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r0 = r1.f282101z
            int r6 = r1.f282094u
            java.lang.Object r0 = r0.get(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r6 = r1.f282095v
            java.lang.Object r0 = r0.get(r6)
            gw2.k r0 = (gw2.C98266k) r0
            gw2.m r6 = r0.f288082e
            com.tencent.mm.plugin.story.model.StoryCore$h r0 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t
            kw2.j r9 = r0.mo134191i()
            int r10 = r6.f288088a
            kw2.i r9 = r9.mo138667Yt(r10)
            boolean r10 = r1.mIsActive
            if (r10 == 0) goto L_0x00bc
            ow2.w r10 = ow2.C100604w.f294753a
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r12 = r1.f282101z
            int r13 = r1.f282094u
            int r14 = r1.f282095v
            r15 = 0
            r16 = 8
            r17 = 0
            r11 = r10
            ow2.C100604w.m131614l(r11, r12, r13, r14, r15, r16, r17)
            r10.mo140062e(r6)
        L_0x00bc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r2)
            java.lang.String r3 = " selectedRow "
            r10.append(r3)
            int r3 = r1.f282094u
            r10.append(r3)
            java.lang.String r3 = " item: "
            r10.append(r3)
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r3 = r1.f282101z
            int r11 = r1.f282094u
            java.lang.Object r3 = r3.get(r11)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r11 = r1.f282095v
            java.lang.Object r3 = r3.get(r11)
            gw2.k r3 = (gw2.C98266k) r3
            gw2.m r3 = r3.f288082e
            r10.append(r3)
            java.lang.String r3 = " isMute "
            r10.append(r3)
            boolean r3 = r1.f282061E
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = r41
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r3 = (com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryItemView) r3
            r1.f282086n = r3
            if (r3 == 0) goto L_0x0109
            r3.mo134355a()
        L_0x0109:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r3 = r1.f282086n
            if (r3 == 0) goto L_0x0112
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r10 = r1.f282071P
            r3.setVideoViewMgr(r10)
        L_0x0112:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r3 = r1.f282086n
            if (r3 == 0) goto L_0x011b
            boolean r10 = r1.f282061E
            r3.setMute(r10)
        L_0x011b:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r3 = r1.f282086n
            if (r3 == 0) goto L_0x013b
            r3.f282051i = r6
            r6.mo137568b()
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r10 = r3.f282055p
            if (r10 == 0) goto L_0x012f
            android.view.ViewGroup r11 = r3.f282053n
            android.widget.FrameLayout$LayoutParams r12 = r3.f282054o
            r10.mo134424b(r11, r12)
        L_0x012f:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r10 = r3.f282055p
            if (r10 == 0) goto L_0x0136
            r10.mo134425c(r6, r8)
        L_0x0136:
            android.view.ViewGroup r3 = r3.f282053n
            r3.setVisibility(r8)
        L_0x013b:
            r1.f282078W = r6
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r3 = r1.f282086n
            java.lang.String r10 = ""
            if (r3 == 0) goto L_0x01a3
            gw2.m r11 = r3.f282051i
            if (r11 != 0) goto L_0x0148
            goto L_0x01a3
        L_0x0148:
            com.tencent.mm.storage.o3 r12 = new com.tencent.mm.storage.o3
            java.lang.String r13 = "storysight"
            r12.<init>(r13)
            int r13 = r11.f288090c
            r12.f284145b = r13
            boolean r13 = r11.mo137567a()
            if (r13 == 0) goto L_0x0170
            java.lang.String r0 = r3.f282046d
            java.lang.String r11 = "reBindBitmap FakeVideo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r11)
            k60.a r0 = k60.C99101e.f290571b
            l60.b r0 = r0.mo138474i(r10)
            android.widget.ImageView r3 = r3.f282047e
            l60.a r0 = (l60.C99342a) r0
            r0.mo85954d(r3)
            goto L_0x01a3
        L_0x0170:
            fw2.c r13 = new fw2.c
            te3.bc4 r14 = r11.f288093f
            java.lang.String r11 = r11.f288091d
            r13.<init>(r14, r11, r12)
            java.lang.String r11 = r3.f282046d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r14 = "reBindBitmap NormalVideo "
            r12.append(r14)
            java.lang.String r14 = r13.mo11841b()
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            k60.d r0 = r0.mo134195m()
            l60.b r0 = r0.mo85955a(r13)
            android.widget.ImageView r3 = r3.f282047e
            l60.a r0 = (l60.C99342a) r0
            r0.mo85954d(r3)
        L_0x01a3:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r1.f282086n
            if (r0 == 0) goto L_0x0608
            boolean r12 = r1.mIsActive
            if (r12 == 0) goto L_0x01e7
            jw2.c r12 = jw2.C99068c.f290406a
            java.lang.String r13 = r6.f288091d
            r6.mo137568b()
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r14 = r0.f282055p
            if (r14 == 0) goto L_0x01bd
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r14 = r14.f282150a
            if (r14 == 0) goto L_0x01bd
            r14.isPlaying()
        L_0x01bd:
            long r14 = r6.f288089b
            r12.mo138411b(r13, r8, r14)
            jw2.b r16 = jw2.C99066b.f290392a
            java.lang.String r12 = r6.f288091d
            r6.mo137568b()
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr r0 = r0.f282055p
            if (r0 == 0) goto L_0x01d4
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView r0 = r0.f282150a
            if (r0 == 0) goto L_0x01d4
            r0.isPlaying()
        L_0x01d4:
            r18 = 0
            long r13 = r6.f288089b
            int r0 = r1.f282094u
            int r15 = r1.f282095v
            r17 = r12
            r19 = r13
            r21 = r0
            r22 = r15
            r16.mo138408b(r17, r18, r19, r21, r22)
        L_0x01e7:
            jw2.c r0 = jw2.C99068c.f290406a
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r12 = r1.f282101z
            int r13 = r1.f282094u
            int r14 = r1.f282095v
            java.lang.String r15 = "group"
            gy3.C87412m.m108594g(r12, r15)
            long r16 = jw2.C99068c.f290410e
            java.lang.String r5 = ",selectedColumn:"
            java.lang.String r3 = " selectedRow:"
            java.lang.String r11 = ",last_selectedRow:"
            java.lang.String r8 = " last_selectedColumn:"
            r22 = 0
            int r25 = (r16 > r22 ? 1 : (r16 == r22 ? 0 : -1))
            if (r25 > 0) goto L_0x0208
            r17 = r6
            goto L_0x0368
        L_0x0208:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            r17 = r6
            int r6 = jw2.C99068c.f290412g
            r7.append(r6)
            r7.append(r11)
            int r6 = jw2.C99068c.f290411f
            r7.append(r6)
            r7.append(r3)
            r7.append(r13)
            r7.append(r5)
            r7.append(r14)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "MicroMsg.StoryBrowseIDKeyStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r6)
            int r6 = r12.size()
            if (r6 <= 0) goto L_0x0284
            java.lang.Object r6 = r12.get(r13)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0265
            int r6 = r14 + 1
            java.lang.Object r7 = r12.get(r13)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0265
            boolean r6 = jw2.C99068c.f290413h
            if (r6 != 0) goto L_0x0263
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 988(0x3dc, double:4.88E-321)
            r28 = 42
            r30 = 1
            r25.mo175913w(r26, r28, r30)
        L_0x0263:
            r6 = 1
            goto L_0x0266
        L_0x0265:
            r6 = 0
        L_0x0266:
            int r7 = r13 + 1
            int r12 = r12.size()
            if (r7 >= r12) goto L_0x027f
            boolean r7 = jw2.C99068c.f290413h
            if (r7 != 0) goto L_0x027d
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 988(0x3dc, double:4.88E-321)
            r28 = 43
            r30 = 1
            r25.mo175913w(r26, r28, r30)
        L_0x027d:
            r7 = 1
            goto L_0x0280
        L_0x027f:
            r7 = 0
        L_0x0280:
            r12 = 1
            jw2.C99068c.f290413h = r12
            goto L_0x0286
        L_0x0284:
            r6 = 0
            r7 = 0
        L_0x0286:
            int r12 = jw2.C99068c.f290412g
            r2 = -1
            if (r12 == r2) goto L_0x0364
            int r12 = jw2.C99068c.f290411f
            if (r12 != r2) goto L_0x0291
            goto L_0x0364
        L_0x0291:
            boolean r2 = jw2.C99068c.f290417l
            if (r2 == 0) goto L_0x02a3
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 988(0x3dc, double:4.88E-321)
            r28 = 40
            r30 = 1
            r25.mo175913w(r26, r28, r30)
            r2 = 0
            jw2.C99068c.f290417l = r2
        L_0x02a3:
            int r2 = jw2.C99068c.f290411f
            if (r13 == r2) goto L_0x0304
            if (r6 == 0) goto L_0x02b4
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 988(0x3dc, double:4.88E-321)
            r28 = 46
            r30 = 1
            r25.mo175913w(r26, r28, r30)
        L_0x02b4:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 47
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            int r6 = jw2.C99068c.f290411f
            int r6 = r13 - r6
            r7 = 1
            if (r6 != r7) goto L_0x02d5
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 90
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            goto L_0x0361
        L_0x02d5:
            r7 = 2
            if (r6 != r7) goto L_0x02e5
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 91
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            goto L_0x0361
        L_0x02e5:
            r7 = 3
            if (r6 != r7) goto L_0x02f5
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 92
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            goto L_0x0361
        L_0x02f5:
            r7 = 4
            if (r6 < r7) goto L_0x0361
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 93
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            goto L_0x0361
        L_0x0304:
            int r2 = jw2.C99068c.f290412g
            if (r14 == r2) goto L_0x0361
            if (r7 == 0) goto L_0x0315
            com.tencent.mm.plugin.report.service.n r25 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r26 = 988(0x3dc, double:4.88E-321)
            r28 = 44
            r30 = 1
            r25.mo175913w(r26, r28, r30)
        L_0x0315:
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 45
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            int r6 = jw2.C99068c.f290412g
            int r6 = r14 - r6
            r7 = 1
            if (r6 != r7) goto L_0x0335
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 94
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            goto L_0x0361
        L_0x0335:
            r7 = 2
            if (r6 != r7) goto L_0x0344
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 95
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            goto L_0x0361
        L_0x0344:
            r7 = 3
            if (r6 != r7) goto L_0x0353
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 96
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
            goto L_0x0361
        L_0x0353:
            r7 = 4
            if (r6 < r7) goto L_0x0361
            r33 = 988(0x3dc, double:4.88E-321)
            r35 = 97
            r37 = 1
            r32 = r2
            r32.mo175913w(r33, r35, r37)
        L_0x0361:
            r0.mo138410a()
        L_0x0364:
            jw2.C99068c.f290412g = r14
            jw2.C99068c.f290411f = r13
        L_0x0368:
            jw2.b r0 = jw2.C99066b.f290392a
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r2 = r1.f282101z
            int r6 = r1.f282094u
            int r7 = r1.f282095v
            gy3.C87412m.m108594g(r2, r15)
            boolean r12 = r0.mo138407a()
            if (r12 != 0) goto L_0x037b
            goto L_0x060a
        L_0x037b:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            int r8 = jw2.C99066b.f290398g
            r12.append(r8)
            r12.append(r11)
            int r8 = jw2.C99066b.f290397f
            r12.append(r8)
            r12.append(r3)
            r12.append(r6)
            r12.append(r5)
            r12.append(r7)
            java.lang.String r3 = r12.toString()
            java.lang.String r5 = "MicroMsg.StoryBrowseDetailIDKeyStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r3)
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x03f5
            java.lang.Object r3 = r2.get(r6)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x03d6
            int r3 = r7 + 1
            java.lang.Object r8 = r2.get(r6)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            if (r3 >= r8) goto L_0x03d6
            boolean r3 = jw2.C99066b.f290399h
            if (r3 != 0) goto L_0x03d4
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 101(0x65, double:5.0E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
        L_0x03d4:
            r3 = 1
            goto L_0x03d7
        L_0x03d6:
            r3 = 0
        L_0x03d7:
            int r8 = r6 + 1
            int r11 = r2.size()
            if (r8 >= r11) goto L_0x03f0
            boolean r8 = jw2.C99066b.f290399h
            if (r8 != 0) goto L_0x03ee
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 102(0x66, double:5.04E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
        L_0x03ee:
            r8 = 1
            goto L_0x03f1
        L_0x03f0:
            r8 = 0
        L_0x03f1:
            r11 = 1
            jw2.C99066b.f290399h = r11
            goto L_0x03f7
        L_0x03f5:
            r3 = 0
            r8 = 0
        L_0x03f7:
            int r11 = jw2.C99066b.f290398g
            r12 = -1
            if (r11 == r12) goto L_0x0603
            int r11 = jw2.C99066b.f290397f
            if (r11 != r12) goto L_0x0402
            goto L_0x0603
        L_0x0402:
            if (r6 == r11) goto L_0x048b
            if (r3 == 0) goto L_0x0411
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 105(0x69, double:5.2E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
        L_0x0411:
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 106(0x6a, double:5.24E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            int r3 = jw2.C99066b.f290397f
            int r3 = r6 - r3
            r8 = 1
            if (r3 != r8) goto L_0x042f
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 110(0x6e, double:5.43E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            goto L_0x045b
        L_0x042f:
            r8 = 2
            if (r3 != r8) goto L_0x043e
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 111(0x6f, double:5.5E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            goto L_0x045b
        L_0x043e:
            r8 = 3
            if (r3 != r8) goto L_0x044d
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 112(0x70, double:5.53E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            goto L_0x045b
        L_0x044d:
            r8 = 4
            if (r3 < r8) goto L_0x045b
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 113(0x71, double:5.6E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
        L_0x045b:
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x04e6
            r3 = 0
        L_0x0462:
            r8 = 3
            if (r3 >= r8) goto L_0x04e6
            int r8 = r6 + r3
            int r11 = r2.size()
            if (r8 >= r11) goto L_0x0488
            java.lang.Object r11 = r2.get(r8)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x0488
            java.lang.Object r8 = r2.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r11 = 0
            java.lang.Object r8 = r8.get(r11)
            gw2.k r8 = (gw2.C98266k) r8
            gw2.m r8 = r8.f288082e
        L_0x0488:
            int r3 = r3 + 1
            goto L_0x0462
        L_0x048b:
            int r3 = jw2.C99066b.f290398g
            if (r7 == r3) goto L_0x04e6
            if (r8 == 0) goto L_0x049c
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 103(0x67, double:5.1E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
        L_0x049c:
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 104(0x68, double:5.14E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            int r3 = jw2.C99066b.f290398g
            int r3 = r7 - r3
            r8 = 1
            if (r3 != r8) goto L_0x04ba
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 115(0x73, double:5.7E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            goto L_0x04e6
        L_0x04ba:
            r8 = 2
            if (r3 != r8) goto L_0x04c9
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 116(0x74, double:5.73E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            goto L_0x04e6
        L_0x04c9:
            r8 = 3
            if (r3 != r8) goto L_0x04d8
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 117(0x75, double:5.8E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
            goto L_0x04e6
        L_0x04d8:
            r8 = 4
            if (r3 < r8) goto L_0x04e6
            r26 = 998(0x3e6, double:4.93E-321)
            r28 = 118(0x76, double:5.83E-322)
            r30 = 1
            r25 = r0
            r25.mo138409c(r26, r28, r30)
        L_0x04e6:
            int r3 = jw2.C99066b.f290397f
            if (r3 < 0) goto L_0x0603
            int r8 = r2.size()
            if (r3 >= r8) goto L_0x0603
            int r3 = jw2.C99066b.f290398g
            if (r3 < 0) goto L_0x0603
            int r8 = jw2.C99066b.f290397f
            java.lang.Object r8 = r2.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r8 = r8.size()
            if (r3 >= r8) goto L_0x0603
            int r3 = jw2.C99066b.f290398g
            if (r3 != r7) goto L_0x050a
            int r3 = jw2.C99066b.f290397f
            if (r3 == r6) goto L_0x0603
        L_0x050a:
            int r3 = jw2.C99066b.f290397f
            java.lang.Object r2 = r2.get(r3)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = jw2.C99066b.f290398g
            java.lang.Object r2 = r2.get(r3)
            gw2.k r2 = (gw2.C98266k) r2
            gw2.m r2 = r2.f288082e
            long r2 = r2.f288089b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "checkStayTime storyId "
            r8.append(r11)
            r8.append(r2)
            java.lang.String r11 = " lastStoryId "
            r8.append(r11)
            long r11 = jw2.C99066b.f290393b
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r8)
            boolean r0 = r0.mo138407a()
            if (r0 != 0) goto L_0x0544
            goto L_0x0603
        L_0x0544:
            java.util.Map<java.lang.Long, jw2.b$a> r0 = jw2.C99066b.f290394c
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            boolean r8 = r0.containsKey(r8)
            if (r8 != 0) goto L_0x0552
            goto L_0x0603
        L_0x0552:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.get(r8)
            jw2.b$a r0 = (jw2.C99066b.C99067a) r0
            if (r0 == 0) goto L_0x0603
            long r11 = r0.f290400a
            int r8 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r8 <= 0) goto L_0x0566
            goto L_0x0603
        L_0x0566:
            long r11 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r22)
            r0.f290400a = r11
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "checkStayTime onStayTime "
            r8.append(r11)
            r8.append(r2)
            r2 = 32
            r8.append(r2)
            long r2 = r0.f290400a
            r8.append(r2)
            java.lang.String r2 = " hasHttp:"
            r8.append(r2)
            boolean r2 = r0.f290401b
            r8.append(r2)
            java.lang.String r2 = "  isWaiting:"
            r8.append(r2)
            boolean r2 = r0.f290404e
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            boolean r2 = r0.f290401b
            if (r2 == 0) goto L_0x05bc
            jw2.b r2 = jw2.C99066b.f290392a
            r11 = 998(0x3e6, double:4.93E-321)
            r25 = 21
            r27 = 1
            r23 = 998(0x3e6, double:4.93E-321)
            r22 = r2
            r22.mo138409c(r23, r25, r27)
            r25 = 20
            long r13 = r0.f290400a
            r23 = r11
            r27 = r13
            r22.mo138409c(r23, r25, r27)
        L_0x05bc:
            boolean r2 = r0.f290404e
            if (r2 == 0) goto L_0x05da
            jw2.b r2 = jw2.C99066b.f290392a
            r11 = 998(0x3e6, double:4.93E-321)
            r25 = 23
            r27 = 1
            r23 = 998(0x3e6, double:4.93E-321)
            r22 = r2
            r22.mo138409c(r23, r25, r27)
            r25 = 22
            long r13 = r0.f290400a
            r23 = r11
            r27 = r13
            r22.mo138409c(r23, r25, r27)
        L_0x05da:
            jw2.b r2 = jw2.C99066b.f290392a
            r11 = 998(0x3e6, double:4.93E-321)
            r30 = 25
            r32 = 1
            r28 = 998(0x3e6, double:4.93E-321)
            r27 = r2
            r27.mo138409c(r28, r30, r32)
            r30 = 24
            long r13 = r0.f290400a
            r28 = r11
            r32 = r13
            r27.mo138409c(r28, r30, r32)
            boolean r0 = r0.f290405f
            if (r0 == 0) goto L_0x0603
            r28 = 998(0x3e6, double:4.93E-321)
            r30 = 26
            r32 = 1
            r27 = r2
            r27.mo138409c(r28, r30, r32)
        L_0x0603:
            jw2.C99066b.f290398g = r7
            jw2.C99066b.f290397f = r6
            goto L_0x060a
        L_0x0608:
            r17 = r6
        L_0x060a:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r1.f282086n
            if (r0 == 0) goto L_0x065c
            ow2.q r2 = new ow2.q
            r2.<init>(r1)
            ow2.r r3 = new ow2.r
            r3.<init>(r1)
            ow2.s r5 = new ow2.s
            r5.<init>(r1)
            fy3.a<java.lang.Boolean> r6 = r1.f282067K
            java.lang.String r7 = r1.f282084i
            zv2.c r8 = zv2.C103109c.f304232b
            boolean r8 = r8.mo108963a()
            if (r8 == 0) goto L_0x0648
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r5 = r0.f282049g
            ow2.l r8 = new ow2.l
            r8.<init>(r2)
            r5.setOnMsgPanelStateCallback(r8)
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r2 = r0.f282049g
            ow2.m r5 = new ow2.m
            r5.<init>(r3)
            r2.setOnPageSelectedCallback(r5)
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r2 = r0.f282049g
            r2.setOutsideClickListener(r6)
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r0 = r0.f282049g
            r0.setSessionId(r7)
            goto L_0x065c
        L_0x0648:
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r2 = r0.f282048f
            ow2.n r3 = new ow2.n
            r3.<init>(r5)
            r2.setStateChangeCallback(r3)
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r2 = r0.f282048f
            r2.setOutsideClickListener(r6)
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r0 = r0.f282048f
            r0.setSessionId(r7)
        L_0x065c:
            boolean r0 = r1.mIsActive
            r2 = 8
            if (r0 == 0) goto L_0x0683
            boolean r0 = r1.f282073R
            if (r0 == 0) goto L_0x0683
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r1.f282086n
            if (r0 == 0) goto L_0x06a7
            zv2.c r3 = zv2.C103109c.f304232b
            boolean r3 = r3.mo108963a()
            if (r3 == 0) goto L_0x067d
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r3 = r0.f282049g
            r3.mo134307c()
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r0 = r0.f282049g
            r0.mo134308d()
            goto L_0x06a7
        L_0x067d:
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r0 = r0.f282048f
            r0.mo134253e()
            goto L_0x06a7
        L_0x0683:
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r1.f282086n
            if (r0 == 0) goto L_0x06a7
            zv2.c r3 = zv2.C103109c.f304232b
            boolean r3 = r3.mo108963a()
            if (r3 == 0) goto L_0x06a2
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r0 = r0.f282049g
            com.tencent.mm.plugin.story.ui.view.StoryActionView r3 = r0.f281976n
            r3.setVisibility(r2)
            android.view.View r3 = r0.f281974i
            int r3 = r3.getVisibility()
            if (r3 == r2) goto L_0x06a7
            r0.mo134305a()
            goto L_0x06a7
        L_0x06a2:
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r0 = r0.f282048f
            r0.mo134252d()
        L_0x06a7:
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryHorizontalControlView r0 = r1.f282090q
            if (r0 == 0) goto L_0x06b0
            int r3 = r1.f282095v
            r0.setSelection(r3)
        L_0x06b0:
            boolean r0 = r1.f282060D
            if (r0 == 0) goto L_0x0872
            xv2.m$a r0 = r1.f282079d
            xv2.m$a r3 = xv2.C79005m.C79006a.FavSelfStoryGallery
            if (r0 == r3) goto L_0x085b
            if (r9 != 0) goto L_0x06bd
            goto L_0x06ce
        L_0x06bd:
            int r0 = r9.field_itemStoryFlag
            r3 = 4
            boolean r0 = o40.C61926c.m72696u(r0, r3)
            if (r0 == 0) goto L_0x06ce
            boolean r0 = r9.mo138658q2()
            if (r0 != 0) goto L_0x06ce
            r3 = 1
            goto L_0x06cf
        L_0x06ce:
            r3 = 0
        L_0x06cf:
            if (r9 != 0) goto L_0x06d2
            goto L_0x06e7
        L_0x06d2:
            te3.pc4 r0 = r9.mo138657p2()
            int r0 = r0.f299139n
            if (r0 != 0) goto L_0x06dc
            r0 = 1
            goto L_0x06dd
        L_0x06dc:
            r0 = 0
        L_0x06dd:
            if (r0 != 0) goto L_0x06e7
            boolean r0 = r9.mo138658q2()
            if (r0 != 0) goto L_0x06e7
            r5 = 1
            goto L_0x06e8
        L_0x06e7:
            r5 = 0
        L_0x06e8:
            java.lang.String r6 = "safeParser"
            if (r9 == 0) goto L_0x073f
            te3.hc4 r7 = new te3.hc4
            r7.<init>()
            byte[] r0 = r9.field_attrBuf
            if (r0 != 0) goto L_0x06f7
            goto L_0x0706
        L_0x06f7:
            r7.parseFrom(r0)     // Catch:{ Exception -> 0x06fb }
            goto L_0x0706
        L_0x06fb:
            r0 = move-exception
            r8 = r0
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r11 = 0
            r0[r11] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r10, r0)
        L_0x0706:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList<te3.rv3> r8 = r7.f298351x
            if (r8 == 0) goto L_0x0718
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0716
            goto L_0x0718
        L_0x0716:
            r8 = 0
            goto L_0x0719
        L_0x0718:
            r8 = 1
        L_0x0719:
            if (r8 == 0) goto L_0x0721
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x0740
        L_0x0721:
            java.util.LinkedList<te3.rv3> r7 = r7.f298351x
            java.lang.String r8 = "storyObj.GroupUser"
            gy3.C87412m.m108593f(r7, r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x072d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0740
            java.lang.Object r8 = r7.next()
            te3.rv3 r8 = (te3.C51163rv3) r8
            java.lang.String r8 = r8.f141175d
            r0.add(r8)
            goto L_0x072d
        L_0x073f:
            r0 = 0
        L_0x0740:
            if (r0 == 0) goto L_0x074b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0749
            goto L_0x074b
        L_0x0749:
            r0 = 0
            goto L_0x074c
        L_0x074b:
            r0 = 1
        L_0x074c:
            if (r0 == 0) goto L_0x07b1
            if (r9 == 0) goto L_0x07a2
            te3.hc4 r7 = new te3.hc4
            r7.<init>()
            byte[] r0 = r9.field_attrBuf
            if (r0 != 0) goto L_0x075a
            goto L_0x0769
        L_0x075a:
            r7.parseFrom(r0)     // Catch:{ Exception -> 0x075e }
            goto L_0x0769
        L_0x075e:
            r0 = move-exception
            r8 = r0
            r11 = 1
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r11 = 0
            r0[r11] = r8
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r6, r10, r0)
        L_0x0769:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedList<te3.rv3> r6 = r7.f298349v
            if (r6 == 0) goto L_0x077b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0779
            goto L_0x077b
        L_0x0779:
            r6 = 0
            goto L_0x077c
        L_0x077b:
            r6 = 1
        L_0x077c:
            if (r6 == 0) goto L_0x0784
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L_0x07a3
        L_0x0784:
            java.util.LinkedList<te3.rv3> r6 = r7.f298349v
            java.lang.String r7 = "storyObj.BlackList"
            gy3.C87412m.m108593f(r6, r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x0790:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x07a3
            java.lang.Object r7 = r6.next()
            te3.rv3 r7 = (te3.C51163rv3) r7
            java.lang.String r7 = r7.f141175d
            r0.add(r7)
            goto L_0x0790
        L_0x07a2:
            r0 = 0
        L_0x07a3:
            if (r0 == 0) goto L_0x07ae
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x07ac
            goto L_0x07ae
        L_0x07ac:
            r0 = 0
            goto L_0x07af
        L_0x07ae:
            r0 = 1
        L_0x07af:
            if (r0 != 0) goto L_0x07c0
        L_0x07b1:
            if (r9 == 0) goto L_0x07bb
            boolean r0 = r9.mo138658q2()
            if (r0 != 0) goto L_0x07bb
            r0 = 1
            goto L_0x07bc
        L_0x07bb:
            r0 = 0
        L_0x07bc:
            if (r0 == 0) goto L_0x07c0
            r0 = 1
            goto L_0x07c1
        L_0x07c0:
            r0 = 0
        L_0x07c1:
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r6 = r1.f282068L
            r6.mo134336a(r3)
            if (r3 != 0) goto L_0x07e4
            if (r9 != 0) goto L_0x07cc
            r6 = 0
            goto L_0x07d0
        L_0x07cc:
            boolean r6 = r9.mo138654m2()
        L_0x07d0:
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r7 = r1.f282068L
            if (r6 == 0) goto L_0x07df
            r7.getClass()
            zv2.a r6 = zv2.C103105a.f304209b
            java.lang.Object r6 = r6.mo138761d()
            zv2.a$a r6 = (zv2.C103105a.C103106a) r6
        L_0x07df:
            android.widget.ImageView r6 = r7.f282023f
            r6.setVisibility(r2)
        L_0x07e4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "localId:"
            r6.append(r7)
            if (r9 == 0) goto L_0x07f9
            long r7 = r9.systemRowid
            int r8 = (int) r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            goto L_0x07fa
        L_0x07f9:
            r7 = 0
        L_0x07fa:
            r6.append(r7)
            java.lang.String r7 = " visibleForSelf:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " showNotNotifySns:"
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = " showRangeIcon:"
            r6.append(r3)
            r6.append(r0)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r3 = r1.f282068L
            if (r5 == 0) goto L_0x082b
            r3.getClass()
            zv2.a r4 = zv2.C103105a.f304209b
            java.lang.Object r4 = r4.mo138761d()
            zv2.a$a r4 = (zv2.C103105a.C103106a) r4
        L_0x082b:
            android.widget.ImageView r3 = r3.f282024g
            r3.setVisibility(r2)
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r3 = r1.f282068L
            if (r0 == 0) goto L_0x0856
            android.widget.ImageView r0 = r3.f282030p
            r4 = 0
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.f282030p
            android.content.Context r4 = r3.getContext()
            r5 = 2131756080(0x7f100430, float:1.9143057E38)
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131101615(0x7f0607af, float:1.7815645E38)
            int r3 = r3.getColor(r6)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r5, r3)
            r0.setImageDrawable(r3)
            goto L_0x085b
        L_0x0856:
            android.widget.ImageView r0 = r3.f282030p
            r0.setVisibility(r2)
        L_0x085b:
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r0 = r1.f282068L
            boolean r3 = r1.mIsActive
            if (r3 == 0) goto L_0x0867
            boolean r3 = r1.f282073R
            if (r3 == 0) goto L_0x0867
            r3 = 1
            goto L_0x0868
        L_0x0867:
            r3 = 0
        L_0x0868:
            if (r3 == 0) goto L_0x086f
            r3 = 0
            r0.setVisibility(r3)
            goto L_0x0872
        L_0x086f:
            r0.setVisibility(r2)
        L_0x0872:
            xv2.m$a r0 = r1.f282079d
            xv2.m$a r2 = xv2.C79005m.C79006a.FavSelfStoryGalleryMulti
            if (r0 != r2) goto L_0x08a4
            if (r9 == 0) goto L_0x08a4
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView r0 = r1.f282068L
            java.util.ArrayList<java.lang.Long> r2 = r1.f282081f
            long r3 = r9.field_storyID
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = r2.contains(r3)
            android.widget.CheckBox r3 = r0.f282031q
            r4 = 0
            r3.setOnCheckedChangeListener(r4)
            android.widget.CheckBox r3 = r0.f282031q
            r3.setChecked(r2)
            android.widget.CheckBox r2 = r0.f282031q
            fy3.p<? super android.widget.CompoundButton, ? super java.lang.Boolean, rx3.b0> r0 = r0.f282038x
            if (r0 == 0) goto L_0x089f
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$f r3 = new com.tencent.mm.plugin.story.ui.view.gallery.GalleryVerticalControlView$f
            r3.<init>(r0)
            goto L_0x08a0
        L_0x089f:
            r3 = r4
        L_0x08a0:
            r2.setOnCheckedChangeListener(r3)
            goto L_0x08a5
        L_0x08a4:
            r4 = 0
        L_0x08a5:
            int r0 = r1.f282076U
            r2 = r40
            if (r0 != r2) goto L_0x08ae
            r3 = 0
            r1.f282077V = r3
        L_0x08ae:
            if (r0 == r2) goto L_0x0979
            boolean r0 = r1.mIsActive
            if (r0 == 0) goto L_0x0979
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r0 = r1.f282101z
            int r3 = r1.f282094u
            java.lang.Object r0 = r0.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r2 = "galleryGroups[selectedRow][position]"
            gy3.C87412m.m108593f(r0, r2)
            gw2.k r0 = (gw2.C98266k) r0
            r39.mo134387w()
            jw2.d r2 = jw2.C99069d.f290418a
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r3 = jw2.C99069d.f290421d
            long r5 = r3.f266276p
            r7 = 1
            long r5 = r5 + r7
            r3.f266276p = r5
            r3 = r17
            java.lang.String r5 = r3.f288091d
            boolean r5 = eb0.C45628s0.m50740E(r5)
            if (r5 == 0) goto L_0x08e8
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r5 = jw2.C99069d.f290421d
            long r9 = r5.f266277q
            long r9 = r9 + r7
            r5.f266277q = r9
        L_0x08e8:
            long r5 = r0.f288081d
            java.lang.String r0 = java.lang.String.valueOf(r5)
            if (r0 != 0) goto L_0x08f2
        L_0x08f0:
            r0 = 1
            goto L_0x0901
        L_0x08f2:
            java.util.Set<java.lang.String> r5 = jw2.C99069d.f290424g
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L_0x08fb
            goto L_0x08f0
        L_0x08fb:
            java.util.Set<java.lang.String> r5 = jw2.C99069d.f290424g
            r5.add(r0)
            r0 = 0
        L_0x0901:
            if (r0 != 0) goto L_0x0919
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r0 = jw2.C99069d.f290421d
            long r5 = r0.f266274n
            long r5 = r5 + r7
            r0.f266274n = r5
            java.lang.String r0 = r3.f288091d
            boolean r0 = eb0.C45628s0.m50740E(r0)
            if (r0 == 0) goto L_0x0919
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r0 = jw2.C99069d.f290421d
            long r5 = r0.f266275o
            long r5 = r5 + r7
            r0.f266275o = r5
        L_0x0919:
            boolean r0 = r1.f282077V
            if (r0 != 0) goto L_0x0921
            r3 = 3
            r2.mo138412a(r3)
        L_0x0921:
            r3 = 0
            r1.f282077V = r3
            com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct r0 = jw2.C99069d.f290430m
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r3 = jw2.C99069d.f290421d
            long r5 = r3.f266270j
            r0.f266285f = r5
            com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct r0 = jw2.C99069d.f290430m
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r3 = jw2.C99069d.f290421d
            long r5 = r3.f266265e
            r0.f266283d = r5
            com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct r0 = jw2.C99069d.f290430m
            com.tencent.mm.autogen.mmdata.rpt.StoryPreviewReportStruct r3 = jw2.C99069d.f290421d
            long r5 = r3.f266266f
            r0.f266284e = r5
            com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct r0 = jw2.C99069d.f290430m
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r3 = r1.f282086n
            if (r3 == 0) goto L_0x094b
            gw2.m r3 = r3.getVideoItem()
            if (r3 == 0) goto L_0x094b
            java.lang.String r3 = r3.f288091d
            goto L_0x094c
        L_0x094b:
            r3 = r4
        L_0x094c:
            java.lang.String r5 = "StoryOwnerUserName"
            r6 = 1
            java.lang.String r3 = r0.mo86045b(r5, r3, r6)
            r0.f266286g = r3
            com.tencent.mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct r0 = jw2.C99069d.f290430m
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r3 = r1.f282086n
            if (r3 == 0) goto L_0x0968
            gw2.m r3 = r3.getVideoItem()
            if (r3 == 0) goto L_0x0968
            long r3 = r3.f288089b
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            goto L_0x0969
        L_0x0968:
            r5 = r4
        L_0x0969:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r4 = "StoryTid"
            r5 = 1
            java.lang.String r3 = r0.mo86045b(r4, r3, r5)
            r0.f266287h = r3
            r2.mo138416e()
        L_0x0979:
            int r0 = r1.f282095v
            r1.f282076U = r0
        L_0x097d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView.m123650t(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView, int, android.view.View):void");
    }

    /* renamed from: v */
    public static final void m123651v(StoryGalleryView storyGalleryView, int i, RecyclerView recyclerView, GalleryHorizontalControlView galleryHorizontalControlView) {
        GalleryHorizontalControlView galleryHorizontalControlView2;
        storyGalleryView.getClass();
        Log.m105924i("MicroMsg.StoryGalleryView", "LogStory: onRowSelected " + i + ", " + recyclerView);
        if (storyGalleryView.f282094u != i || !C87412m.m108589b(storyGalleryView.f282088p, recyclerView)) {
            storyGalleryView.f282077V = storyGalleryView.mIsActive;
            storyGalleryView.f282076U = -1;
            storyGalleryView.f282094u = i;
            RecyclerView recyclerView2 = storyGalleryView.f282088p;
            RecyclerView.C16613e eVar = null;
            GalleryLayoutManager galleryLayoutManager = (GalleryLayoutManager) (recyclerView2 != null ? recyclerView2.getLayoutManager() : null);
            if (galleryLayoutManager != null) {
                galleryLayoutManager.f54350y = null;
            }
            storyGalleryView.f282088p = recyclerView;
            storyGalleryView.f282090q = galleryHorizontalControlView;
            int size = storyGalleryView.f282101z.size();
            int i2 = storyGalleryView.f282094u;
            boolean z = true;
            if ((i2 >= 0 && i2 < size) && (galleryHorizontalControlView2 = storyGalleryView.f282090q) != null) {
                ArrayList<C98266k> arrayList = storyGalleryView.f282101z.get(i2);
                C87412m.m108593f(arrayList, "galleryGroups[selectedRow]");
                galleryHorizontalControlView2.mo6520a(arrayList);
            }
            RecyclerView recyclerView3 = storyGalleryView.f282088p;
            GalleryLayoutManager galleryLayoutManager2 = (GalleryLayoutManager) (recyclerView3 != null ? recyclerView3.getLayoutManager() : null);
            if (galleryLayoutManager2 != null) {
                galleryLayoutManager2.f54350y = new C47402t(storyGalleryView);
            }
            if (galleryLayoutManager2 != null) {
                galleryLayoutManager2.mo24825c0(true);
            }
            storyGalleryView.f282092s.mo75025b(recyclerView);
            RecyclerView recyclerView4 = storyGalleryView.f282088p;
            if (recyclerView4 != null) {
                eVar = recyclerView4.getAdapter();
            }
            storyGalleryView.f282091r = (C99703l) eVar;
            if (!storyGalleryView.f282101z.get(i).isEmpty()) {
                Object obj = storyGalleryView.f282101z.get(i).get(0);
                C87412m.m108593f(obj, "galleryGroups[row][0]");
                C98266k kVar = (C98266k) obj;
                C99069d dVar = C99069d.f290418a;
                String str = kVar.f288084g;
                if (str != null && !C99069d.f290423f.contains(str)) {
                    C99069d.f290423f.add(str);
                    z = false;
                }
                if (!z) {
                    C99069d.f290421d.f266272l++;
                    if (C45628s0.m50740E(kVar.f288084g)) {
                        C99069d.f290421d.f266273m++;
                    }
                }
            }
            C99069d.f290418a.mo138412a(4);
        }
    }

    /* renamed from: A */
    public final void mo134370A() {
        Log.m105924i("MicroMsg.StoryGalleryView", "reset " + Util.getStack() + " isFirstPost : " + this.f282098x0);
        if (this.f282098x0 && this.mIsActive) {
            mo98075o(false);
        }
        if (this.f282098x0) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORY_POST_FIRST_TO_AUTOPLAY_BOOLEAN_SYNC, Boolean.FALSE);
            this.f282098x0 = false;
        }
    }

    /* renamed from: B */
    public final void mo134371B(boolean z) {
        Log.m105924i("MicroMsg.StoryGalleryView", "toggleActiveState " + z);
        StoryGalleryItemView storyGalleryItemView = this.f282086n;
        if (storyGalleryItemView != null) {
            if (C103109c.f304232b.mo108963a()) {
                storyGalleryItemView.f282049g.f281976n.setVisibility(z ? 0 : 8);
            } else {
                StoryCommentView storyCommentView = storyGalleryItemView.f282048f;
                storyCommentView.getClass();
                Log.m105924i("MicroMsg.StoryCommentView", "toggleActiveState " + z);
                if (z) {
                    storyCommentView.mo134253e();
                } else {
                    storyCommentView.mo134252d();
                }
            }
        }
        GalleryVerticalControlView galleryVerticalControlView = this.f282068L;
        if (z) {
            galleryVerticalControlView.setVisibility(0);
        } else {
            galleryVerticalControlView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo98061a(PullDownListView pullDownListView) {
        C77046e eVar = new C77046e();
        eVar.f225075c = this;
        eVar.f225074b = pullDownListView;
        C75628g gVar = this.f282066J;
        gVar.getClass();
        gVar.f222182k.add(eVar);
    }

    /* renamed from: b */
    public void mo98062b() {
        if (C85875k4.m106207v()) {
            int i = C75044y4.m89990b(getContext()).y;
            ViewGroup.LayoutParams layoutParams = this.f282087o.getLayoutParams();
            layoutParams.width = (int) (((float) i) * 0.5625f);
            layoutParams.height = i;
            mo134388x(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f282087o.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
        }
        this.f282099y.getLayoutParams().width = this.f282087o.getLayoutParams().width;
        this.f282099y.getLayoutParams().height = this.f282087o.getLayoutParams().height;
        this.f282068L.getLayoutParams().width = this.f282087o.getLayoutParams().width;
        ViewGroup.LayoutParams layoutParams3 = this.f282068L.getLayoutParams();
        C87412m.m108593f(layoutParams3, "verticalControlView.layoutParams");
        mo134388x(layoutParams3);
    }

    /* renamed from: c */
    public void mo98063c() {
        C98862q qVar = this.f282057A;
        if (qVar != null) {
            qVar.mo138193f();
        }
        mo134370A();
    }

    public boolean canScrollHorizontally(int i) {
        return this.mIsActive;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo98064d() {
        /*
            r6 = this;
            jw2.d r0 = jw2.C99069d.f290418a
            r1 = 10
            r0.mo138412a(r1)
            com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryItemView r0 = r6.f282086n
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0064
            zv2.c r3 = zv2.C103109c.f304232b
            boolean r3 = r3.mo108963a()
            if (r3 == 0) goto L_0x004a
            com.tencent.mm.plugin.story.ui.view.StoryMsgView r0 = r0.f282049g
            android.view.View r3 = r0.f281974i
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0064
            com.tencent.mm.plugin.story.ui.view.StoryMsgInputView r3 = r0.f281962A
            int r3 = r3.getInputType()
            r4 = -1
            if (r3 == r4) goto L_0x002e
            com.tencent.mm.plugin.story.ui.view.StoryMsgInputView r0 = r0.f281962A
            r0.mo134274b()
            goto L_0x0062
        L_0x002e:
            com.tencent.mm.plugin.story.ui.view.StoryMsgInputView r3 = r0.f281962A
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0.f281980r
            if (r3 == 0) goto L_0x0042
            com.tencent.mm.plugin.story.ui.view.StoryMsgInputView r0 = r0.f281962A
            r3 = 8
            r0.setVisibility(r3)
            goto L_0x0062
        L_0x0042:
            r0.mo134305a()
            goto L_0x0062
        L_0x0046:
            r0.mo134305a()
            goto L_0x0062
        L_0x004a:
            com.tencent.mm.plugin.story.ui.view.StoryCommentView r0 = r0.f282048f
            int r3 = r0.f281902u
            r4 = 2
            if (r3 != r1) goto L_0x0055
            r0.mo134254f(r4)
            goto L_0x0062
        L_0x0055:
            r5 = 3
            if (r3 != r5) goto L_0x005c
            r0.mo134254f(r4)
            goto L_0x0062
        L_0x005c:
            r5 = 5
            if (r3 != r5) goto L_0x0064
            r0.mo134254f(r4)
        L_0x0062:
            r0 = 1
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onBackPressed commentView result:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.StoryGalleryView"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            if (r0 != 0) goto L_0x0092
            boolean r3 = r6.mIsActive
            if (r3 == 0) goto L_0x0092
            xv2.f r3 = r6.f282059C
            if (r3 == 0) goto L_0x0089
            r3.mo96578I4()
        L_0x0089:
            if (r0 != 0) goto L_0x0091
            boolean r0 = r6.mIsActive
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            r0 = r1
        L_0x0092:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onBackPressed result:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView.mo98064d():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r9, r0)
            boolean r0 = r8.mIsActive
            r1 = 0
            if (r0 == 0) goto L_0x00e6
            ow2.g r0 = r8.f282072Q
            boolean r2 = r0.f294732d
            if (r2 == 0) goto L_0x0027
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_GALLERY_FIRST_BOOLEAN_SYNC
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.mo119677K(r3, r4)
            ow2.h r2 = new ow2.h
            r2.<init>(r0)
            o40.C61926c.m72668M(r2)
        L_0x0027:
            int r0 = r9.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 == r3) goto L_0x0034
            if (r0 == r2) goto L_0x0034
            goto L_0x003b
        L_0x0034:
            r8.f282064H = r1
            goto L_0x003b
        L_0x0037:
            r8.f282063G = r1
            r8.f282064H = r1
        L_0x003b:
            en3.g r0 = r8.f282066J
            r0.mo105977b(r9)
            en3.g r0 = r8.f282066J
            int r0 = r0.f222179h
            boolean r4 = r8.f282064H
            if (r4 != 0) goto L_0x0099
            boolean r4 = r8.f282058B
            if (r4 != 0) goto L_0x0099
            int r4 = r8.f282094u
            if (r4 < 0) goto L_0x008d
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r5 = r8.f282101z
            int r5 = r5.size()
            if (r4 < r5) goto L_0x0059
            goto L_0x008d
        L_0x0059:
            float r4 = r8.f282096w
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
            r5 = 2
            goto L_0x0063
        L_0x0062:
            r5 = 0
        L_0x0063:
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r6 = r8.f282101z
            int r6 = r6.size()
            int r6 = r6 + -1
            float r6 = (float) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0072
            r5 = r5 | 1
        L_0x0072:
            int r4 = r8.f282095v
            if (r4 <= 0) goto L_0x0078
            r5 = r5 | 8
        L_0x0078:
            java.util.ArrayList<java.util.ArrayList<gw2.k>> r6 = r8.f282101z
            int r7 = r8.f282094u
            java.lang.Object r6 = r6.get(r7)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            int r6 = r6 + -1
            if (r4 >= r6) goto L_0x008e
            r5 = r5 | 4
            goto L_0x008e
        L_0x008d:
            r5 = 0
        L_0x008e:
            r4 = r5 & r0
            if (r4 != 0) goto L_0x0099
            en3.g r4 = r8.f282066J
            boolean r4 = r4.mo105976a(r9)
            goto L_0x00af
        L_0x0099:
            boolean r4 = r8.f282063G
            if (r4 != 0) goto L_0x00ae
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r9)
            r4.setAction(r2)
            en3.g r5 = r8.f282066J
            r5.mo105976a(r4)
            r4.recycle()
            r8.f282063G = r3
        L_0x00ae:
            r4 = 0
        L_0x00af:
            boolean r5 = r8.f282064H
            if (r5 != 0) goto L_0x00d2
            if (r4 == 0) goto L_0x00b6
            goto L_0x00d2
        L_0x00b6:
            boolean r2 = r8.f282058B
            if (r2 != 0) goto L_0x00cd
            com.tencent.mm.plugin.story.ui.view.gallery.GalleryRecyclerView r2 = r8.f282099y
            com.tencent.mm.plugin.story.ui.layout.GalleryLayoutManager r2 = r2.getLayoutManager()
            r4 = r0 & 4
            if (r4 != 0) goto L_0x00c8
            r0 = r0 & 8
            if (r0 == 0) goto L_0x00c9
        L_0x00c8:
            r1 = 1
        L_0x00c9:
            r0 = r1 ^ 1
            r2.f54346A = r0
        L_0x00cd:
            boolean r9 = super.dispatchTouchEvent(r9)
            return r9
        L_0x00d2:
            boolean r0 = r8.f282063G
            if (r0 != 0) goto L_0x00e5
            android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r9)
            r9.setAction(r2)
            super.dispatchTouchEvent(r9)
            r9.recycle()
            r8.f282063G = r3
        L_0x00e5:
            return r3
        L_0x00e6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.p108ui.view.gallery.StoryGalleryView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: e */
    public void mo98065e(int i) {
        Log.m105918d("MicroMsg.StoryGalleryView", "onClosing " + i);
        if (this.f282079d == C79005m.C79006a.SelfTabGallery && this.holderView.getVisibility() == 0) {
            GalleryHolderView galleryHolderView = this.holderView;
            galleryHolderView.getClass();
            float min = Math.min(1.0f, ((float) Math.abs(i)) / ((float) Math.abs(galleryHolderView.f21286i)));
            galleryHolderView.f21281d.setAlpha(((float) 1) - min);
            galleryHolderView.f21284g.setAlpha(min);
            galleryHolderView.f21281d.setVisibility(0);
        }
    }

    /* renamed from: f */
    public void mo98066f() {
        T t;
        Log.m105924i("MicroMsg.StoryGalleryView", "LogStory, onDestroy " + hashCode() + " galleryType:" + this.f282079d + " videoViewMgr " + this.f282071P);
        LinkedList<WeakReference<StoryGalleryView>> linkedList = C97384g.f285885a;
        Iterator<T> it = C97384g.f285885a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(this, ((WeakReference) t).get())) {
                break;
            }
        }
        WeakReference weakReference = (WeakReference) t;
        if (weakReference != null) {
            C97384g.f285885a.remove(weakReference);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GalleryMgr unregister ");
        sb.append(this);
        sb.append(' ');
        LinkedList<WeakReference<StoryGalleryView>> linkedList2 = C97384g.f285885a;
        sb.append(linkedList2.size());
        Log.m105924i("MicroMsg.GalleryMgr", sb.toString());
        if (linkedList2.size() <= 1) {
            C97383c cVar = new C97383c();
            C97384g.f285886b = cVar;
            C61926c.m72657B("cleanCacheFiles", true, new C97382b(cVar));
        }
        C98862q qVar = this.f282057A;
        if (qVar != null) {
            qVar.mo138192d();
        }
        StoryGalleryItemView storyGalleryItemView = this.f282086n;
        if (storyGalleryItemView != null && !C103109c.f304232b.mo108963a()) {
            StoryCommentView storyCommentView = storyGalleryItemView.f282048f;
            storyCommentView.f281888d.mo98098a();
            storyCommentView.f281880F.clear();
            storyCommentView.f281876B.clear();
            C76965a aVar = storyCommentView.f281905x;
            if (aVar != null) {
                aVar.dismiss();
            }
        }
        StoryVideoViewMgr storyVideoViewMgr = this.f282071P;
        if (storyVideoViewMgr != null) {
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "onUIDestroy " + storyVideoViewMgr.hashCode());
            storyVideoViewMgr.f282156g = false;
            storyVideoViewMgr.mo134426d((ViewGroup) null, true);
            storyVideoViewMgr.f282155f = null;
            storyVideoViewMgr.f282150a = null;
            if (storyVideoViewMgr.f282158i) {
                storyVideoViewMgr.f282157h.mo139414a();
                storyVideoViewMgr.f282158i = false;
            }
            storyVideoViewMgr.f282161l.dead();
        }
        C100604w.f294753a.getClass();
        Log.printInfoStack("MicroMsg.StoryVideoPreloadMgr", "cancelAllPreloadTask", new Object[0]);
        for (String next : C100604w.f294758f.keySet()) {
            Log.m105924i("MicroMsg.StoryVideoPreloadMgr", "cancelAllPreloadTask " + next);
            ((C101213l) C86312j.m106911c(C101213l.class)).Gm0(next);
        }
        C100604w.f294758f.clear();
        C100604w.f294759g.clear();
        C100604w.f294763k = new C100604w.C100605a(new ArrayList(), 0, 0, (C100604w.C100605a) null, false, 16, (C8480h) null);
        C100604w.f294761i.clear();
        C97758b bVar = C97758b.f286820d;
        C32227p<Boolean, Long, C13598b0> pVar = this.f282074S;
        C87412m.m108594g(pVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C97758b.f286831r.remove(pVar);
        C100604w.f294753a.getClass();
        int recentAverageSpeed = CdnLogic.getRecentAverageSpeed(2);
        Log.m105924i("MicroMsg.StoryGalleryView", "onDestroy speed " + recentAverageSpeed + ' ');
        C99066b bVar2 = C99066b.f290392a;
        long milliSecondsToNow = Util.milliSecondsToNow(C99066b.f290396e);
        Log.m105924i("MicroMsg.StoryBrowseDetailIDKeyStat", "cur speed " + recentAverageSpeed + " cur: " + milliSecondsToNow);
        if (milliSecondsToNow > FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION) {
            if (recentAverageSpeed < 10) {
                bVar2.mo138409c(998, 82, 1);
            } else if (recentAverageSpeed < 100) {
                bVar2.mo138409c(998, 83, 1);
            } else if (recentAverageSpeed < 200) {
                bVar2.mo138409c(998, 89, 1);
            } else if (recentAverageSpeed < 250) {
                bVar2.mo138409c(998, 84, 1);
            } else if (recentAverageSpeed < 450) {
                bVar2.mo138409c(998, 85, 1);
            } else if (recentAverageSpeed < 900) {
                bVar2.mo138409c(998, 86, 1);
            } else if (recentAverageSpeed < 1350) {
                bVar2.mo138409c(998, 87, 1);
            } else if (recentAverageSpeed < 1800) {
                bVar2.mo138409c(998, 88, 1);
            }
        }
        C100591g gVar = this.f282072Q;
        MMHandlerThread.removeRunnable(gVar.f294734f);
        gVar.f294729a.removeView(gVar.f294735g);
        gVar.f294730b.mo17098m1(gVar.f294733e);
    }

    /* renamed from: g */
    public void mo98067g(int i) {
        Log.m105918d("MicroMsg.StoryGalleryView", "onListInnerScroll " + i);
        if (this.f282079d == C79005m.C79006a.SelfTabGallery && this.holderView.getVisibility() == 0) {
            GalleryHolderView galleryHolderView = this.holderView;
            galleryHolderView.getClass();
            float min = ((float) 1) - Math.min(((float) Math.abs(i)) / ((float) C76577a.m92151b(galleryHolderView.getContext(), 16)), 1.0f);
            Log.m105918d("MicroMsg.GalleryHolderView", "onListInnerScroll " + i + ' ' + min);
            galleryHolderView.f21284g.setAlpha(min);
            galleryHolderView.f21287j = min;
        }
    }

    public final String getChatRoom() {
        return this.f282083h;
    }

    public final ArrayList<Long> getCheckedFavList() {
        return this.f282081f;
    }

    public final boolean getDeleteWhenFirstEmpty() {
        return this.f282082g;
    }

    public final int getExpectPos() {
        return this.f282080e;
    }

    public final C79005m.C79006a getGalleryType() {
        return this.f282079d;
    }

    public final String getSessionId() {
        return this.f282084i;
    }

    /* renamed from: h */
    public void mo98068h(int i) {
        Log.m105918d("MicroMsg.StoryGalleryView", "onOpening " + i);
        if (this.f282079d == C79005m.C79006a.SelfTabGallery && this.holderView.getVisibility() == 0) {
            GalleryHolderView galleryHolderView = this.holderView;
            galleryHolderView.getClass();
            float min = Math.min(((float) Math.abs(i)) / ((float) Math.abs(galleryHolderView.f21286i)), 1.0f);
            galleryHolderView.f21281d.setAlpha(min);
            galleryHolderView.f21284g.setAlpha(((float) 1) - min);
            galleryHolderView.f21281d.setVisibility(0);
        }
    }

    /* renamed from: i */
    public void mo98069i() {
        Log.m105924i("MicroMsg.StoryGalleryView", "LogStory: onPause " + hashCode() + " galleryType:" + this.f282079d + " videoViewMgr " + this.f282071P);
        C98862q qVar = this.f282057A;
        if (qVar != null) {
            qVar.mo138206j();
        }
        StoryVideoViewMgr storyVideoViewMgr = this.f282071P;
        if (storyVideoViewMgr != null) {
            Log.m105924i("MicroMsg.Gallery.StoryVideoViewMgr", "onUIPause " + storyVideoViewMgr.hashCode());
            storyVideoViewMgr.mo134426d((ViewGroup) null, true);
            if (storyVideoViewMgr.f282158i) {
                storyVideoViewMgr.f282157h.mo139414a();
                storyVideoViewMgr.f282158i = false;
            }
        }
        StoryGalleryItemView storyGalleryItemView = this.f282086n;
        if (storyGalleryItemView != null && !C103109c.f304232b.mo108963a()) {
            StoryCommentView storyCommentView = storyGalleryItemView.f282048f;
            storyCommentView.getClass();
            Log.m105924i("MicroMsg.StoryCommentView", "LogStory: pause");
            storyCommentView.f281888d.mo98098a();
        }
        C77044c cVar = this.f282069M;
        if (cVar != null) {
            cVar.dismiss();
        }
        C99069d.f290418a.mo138412a(11);
        C97758b bVar = C97758b.f286820d;
        C86013q1.m106437S(C97758b.f286822f, C97758b.f286825i.toByteArray());
        mo134370A();
    }

    /* renamed from: j */
    public void mo98070j() {
        if (this.f282101z.size() != 1 || !this.f282101z.get(0).isEmpty()) {
            Log.m105918d("MicroMsg.StoryGalleryView", "fadeInMaskView");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f282062F, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.addListener(new C47401o(this));
            ofFloat.start();
        } else {
            mo134390z();
        }
        if (this.f282079d == C79005m.C79006a.SelfTabGallery && this.holderView.getVisibility() == 0) {
            GalleryHolderView galleryHolderView = this.holderView;
            galleryHolderView.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            TextView textView = galleryHolderView.f21284g;
            float[] fArr = {textView.getAlpha(), galleryHolderView.f21287j};
            LinearLayout linearLayout = galleryHolderView.f21281d;
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(textView, "alpha", fArr), ObjectAnimator.ofFloat(linearLayout, "alpha", new float[]{linearLayout.getAlpha(), 0.0f})});
            animatorSet.setDuration(100);
            animatorSet.start();
        }
    }

    /* renamed from: k */
    public void mo98071k() {
        mo134390z();
        if (this.f282079d == C79005m.C79006a.SelfTabGallery && this.holderView.getVisibility() == 0) {
            GalleryHolderView galleryHolderView = this.holderView;
            galleryHolderView.getClass();
            AnimatorSet animatorSet = new AnimatorSet();
            TextView textView = galleryHolderView.f21284g;
            float[] fArr = {textView.getAlpha(), 0.0f};
            LinearLayout linearLayout = galleryHolderView.f21281d;
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(textView, "alpha", fArr), ObjectAnimator.ofFloat(linearLayout, "alpha", new float[]{linearLayout.getAlpha(), 1.0f})});
            animatorSet.setDuration(100);
            animatorSet.start();
        }
    }

    /* renamed from: l */
    public void mo98072l() {
        StoryGalleryItemView storyGalleryItemView;
        StoryVideoView storyVideoView;
        Log.m105924i("MicroMsg.StoryGalleryView", "LogStory: onResume " + hashCode() + ", galleryType:" + this.f282079d + " videoViewMgr " + this.f282071P);
        C98862q qVar = this.f282057A;
        if (qVar != null) {
            qVar.mo138207k();
        }
        C98268m mVar = this.f282078W;
        if (mVar != null) {
            mVar.mo137568b();
        }
        StoryVideoViewMgr storyVideoViewMgr = this.f282071P;
        if (!(storyVideoViewMgr == null || (storyVideoView = storyVideoViewMgr.f282150a) == null)) {
            storyVideoView.mo79617f();
        }
        StoryGalleryItemView storyGalleryItemView2 = this.f282086n;
        if (storyGalleryItemView2 != null && !C103109c.f304232b.mo108963a()) {
            StoryCommentView storyCommentView = storyGalleryItemView2.f282048f;
            storyCommentView.getClass();
            Log.m105924i("MicroMsg.StoryCommentView", "LogStory: resume");
            if (storyCommentView.f281893i.getVisibility() == 0 && storyCommentView.f281902u == 2) {
                CommentsContainer commentsContainer = storyCommentView.f281888d;
                if (commentsContainer.f206305i) {
                    commentsContainer.mo98100c();
                }
            }
        }
        Log.m105926v("MicroMsg.StoryBrowseIDKeyStat", "makeResumeTime onResumeTime " + C99068c.f290407b + " onPlayUser " + C99068c.f290408c);
        C99068c.f290407b = Util.nowMilliSecond();
        C99066b bVar = C99066b.f290392a;
        Log.m105926v("MicroMsg.StoryBrowseDetailIDKeyStat", "makeResumeTime onResumeTime " + C99066b.f290395d + " onPlayUser " + 0);
        C99066b.f290395d = Util.nowMilliSecond();
        if (this.mIsActive && (storyGalleryItemView = this.f282086n) != null) {
            storyGalleryItemView.mo134356b();
        }
    }

    /* renamed from: m */
    public void mo98073m() {
        Log.m105924i("MicroMsg.StoryGalleryView", "LogStory, onStart " + hashCode() + " galleryType:" + this.f282079d);
    }

    /* renamed from: n */
    public void mo98074n() {
        Log.m105924i("MicroMsg.StoryGalleryView", "LogStory, onStop:" + hashCode());
    }

    /* renamed from: o */
    public void mo98075o(boolean z) {
        C98862q qVar;
        Log.m105924i("MicroMsg.StoryGalleryView", "LogStory: onSwitchImageMode videoViewMgr " + this.f282071P);
        this.f282099y.setActive(false);
        this.mIsActive = false;
        if (this.f282089p0 && this.f282060D && (qVar = this.f282057A) != null) {
            qVar.mo138193f();
        }
        StoryGalleryItemView storyGalleryItemView = this.f282086n;
        if (storyGalleryItemView != null) {
            if (C103109c.f304232b.mo108963a()) {
                StoryMsgView storyMsgView = storyGalleryItemView.f282049g;
                storyMsgView.f281976n.setVisibility(8);
                if (storyMsgView.f281974i.getVisibility() != 8) {
                    storyMsgView.mo134305a();
                }
            } else {
                StoryCommentView storyCommentView = storyGalleryItemView.f282048f;
                storyCommentView.mo134254f(2);
                storyCommentView.f281883I = false;
                storyCommentView.mo134252d();
            }
        }
        StoryVideoViewMgr storyVideoViewMgr = this.f282071P;
        if (storyVideoViewMgr != null) {
            storyVideoViewMgr.mo134428f(true, z);
        }
        setEnabled(false);
        C98862q qVar2 = this.f282057A;
        if (qVar2 != null) {
            qVar2.mo138194g(0);
        }
        if (this.f282079d == C79005m.C79006a.SelfTabGallery && this.holderView.getVisibility() == 0) {
            GalleryHolderView galleryHolderView = this.holderView;
            galleryHolderView.f21281d.setVisibility(4);
            galleryHolderView.f21284g.setVisibility(0);
        }
        mo134371B(false);
    }

    /* renamed from: p */
    public void mo98076p(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        C98268m videoItem;
        C98268m videoItem2;
        C98268m videoItem3;
        C98268m videoItem4;
        C98268m videoItem5;
        int i;
        Class cls = C60606n.class;
        Log.printInfoStack("MicroMsg.StoryGalleryView", "LogStory: onSwitchVideoMode isMute:" + z + " videoViewMgr " + this.f282071P + " videoViewMgrFromPreLoad false", new Object[0]);
        this.f282073R = true;
        this.f282099y.setActive(true);
        this.mIsActive = true;
        this.f282061E = z;
        if (!z) {
            this.f282061E = ((C60606n) C86312j.m106911c(cls)).mo85002F() || ((C60606n) C86312j.m106911c(cls)).mo85017L5();
        }
        StoryGalleryItemView storyGalleryItemView = this.f282086n;
        if (storyGalleryItemView != null) {
            storyGalleryItemView.setMute(this.f282061E);
        }
        if (this.f282101z.size() > 0 && (i = this.f282094u) >= 0 && i < this.f282101z.size() && this.f282095v < this.f282101z.get(this.f282094u).size() && this.f282095v >= 0) {
            Log.m105924i("MicroMsg.StoryGalleryView", "help LogStory: onItemSelected " + this.mIsActive);
            C98268m mVar = ((C98266k) this.f282101z.get(this.f282094u).get(this.f282095v)).f288082e;
            C100604w wVar = C100604w.f294753a;
            C100604w.m131614l(wVar, this.f282101z, this.f282094u, this.f282095v, false, 8, (Object) null);
            wVar.mo140062e(mVar);
        }
        StoryGalleryItemView storyGalleryItemView2 = this.f282086n;
        if (storyGalleryItemView2 != null) {
            storyGalleryItemView2.mo134356b();
        }
        C98268m mVar2 = this.f282078W;
        if (mVar2 != null) {
            mVar2.mo137568b();
        }
        StoryVideoViewMgr storyVideoViewMgr = this.f282071P;
        if (storyVideoViewMgr != null) {
            storyVideoViewMgr.mo134427e();
        }
        setEnabled(true);
        C98862q qVar = this.f282057A;
        if (qVar != null) {
            qVar.mo138194g(1);
        }
        C79005m.C79006a aVar = this.f282079d;
        if (!(aVar == C79005m.C79006a.HistoryGallery || aVar == C79005m.C79006a.MultiUserGallery || aVar == C79005m.C79006a.FavSelfStoryGallery || aVar == C79005m.C79006a.FavOtherStoryGallery)) {
            mo134389y(0, 1);
        }
        C79005m.C79006a aVar2 = this.f282079d;
        C79005m.C79006a aVar3 = C79005m.C79006a.SelfTabGallery;
        if (aVar2 == aVar3 && this.holderView.getVisibility() == 0) {
            GalleryHolderView galleryHolderView = this.holderView;
            galleryHolderView.f21281d.setVisibility(0);
            galleryHolderView.f21284g.setVisibility(4);
            if (galleryHolderView.f21285h) {
                galleryHolderView.f21285h = false;
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_STORY_FIRST_PULL_DOWN_BOOLEAN_SYNC, Boolean.FALSE);
            }
            galleryHolderView.f21284g.setTextColor(galleryHolderView.getResources().getColor(C0966R.color.afg));
            galleryHolderView.f21284g.setText(galleryHolderView.getResources().getString(C0966R.string.jqq));
        }
        C79005m.C79006a aVar4 = this.f282079d;
        String str = null;
        C86709a0.m107535s().mo121142i().mo119677K(aVar4 == aVar3 ? C72994y1.C72995a.USERINFO_STORY_PULL_DOWN_MORE_TAB_FIRST_BOOLEAN_SYNC : aVar4 == C79005m.C79006a.ProfileGallery ? C72994y1.C72995a.USERINFO_STORY_PULL_DOWN_PROFILE_FIRST_BOOLEAN_SYNC : null, Boolean.TRUE);
        this.f282085j.setVisibility(8);
        if (z2) {
            C99069d dVar = C99069d.f290418a;
            dVar.mo138417g();
            StoryGalleryItemView storyGalleryItemView3 = this.f282086n;
            String str2 = (storyGalleryItemView3 == null || (videoItem5 = storyGalleryItemView3.getVideoItem()) == null) ? null : videoItem5.f288091d;
            if (str2 != null && !C99069d.f290423f.contains(str2)) {
                C99069d.f290423f.add(str2);
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                C99069d.f290421d.f266272l = 1;
                StoryGalleryItemView storyGalleryItemView4 = this.f282086n;
                if (C45628s0.m50740E((storyGalleryItemView4 == null || (videoItem4 = storyGalleryItemView4.getVideoItem()) == null) ? null : videoItem4.f288091d)) {
                    C99069d.f290421d.f266273m = 1;
                }
            }
            C99069d.f290421d.f266276p = 1;
            StoryGalleryItemView storyGalleryItemView5 = this.f282086n;
            if (C45628s0.m50740E((storyGalleryItemView5 == null || (videoItem3 = storyGalleryItemView5.getVideoItem()) == null) ? null : videoItem3.f288091d)) {
                C99069d.f290421d.f266277q = 1;
            }
            StoryGalleryItemView storyGalleryItemView6 = this.f282086n;
            String valueOf = String.valueOf((storyGalleryItemView6 == null || (videoItem2 = storyGalleryItemView6.getVideoItem()) == null) ? null : Long.valueOf(videoItem2.f288089b));
            if (C99069d.f290424g.contains(valueOf)) {
                z4 = true;
            } else {
                C99069d.f290424g.add(valueOf);
                z4 = false;
            }
            if (!z4) {
                C99069d.f290421d.f266274n = 1;
                StoryGalleryItemView storyGalleryItemView7 = this.f282086n;
                if (!(storyGalleryItemView7 == null || (videoItem = storyGalleryItemView7.getVideoItem()) == null)) {
                    str = videoItem.f288091d;
                }
                if (C45628s0.m50740E(str)) {
                    C99069d.f290421d.f266275o = 1;
                }
            }
            StoryPreviewReportStruct storyPreviewReportStruct = C99069d.f290421d;
            storyPreviewReportStruct.f266279s = 1;
            storyPreviewReportStruct.f266270j = System.currentTimeMillis();
            C99069d.f290420c = 1;
            if (this.f282101z.size() == 1 && this.f282101z.get(0).size() == 0) {
                C99069d.f290421d = new StoryPreviewReportStruct();
                dVar.mo138417g();
                return;
            }
            int size = this.f282101z.size();
            int i2 = this.f282094u;
            if (size <= i2 || i2 < 0 || this.f282095v < 0 || this.f282101z.get(i2).size() <= this.f282095v) {
                C99069d.f290421d = new StoryPreviewReportStruct();
                dVar.mo138417g();
                return;
            }
            StoryGalleryItemView storyGalleryItemView8 = this.f282086n;
            if (storyGalleryItemView8 != null && C103109c.f304232b.mo108963a()) {
                storyGalleryItemView8.f282049g.mo134307c();
            }
            mo134387w();
            mo134371B(true);
            C99069d.f290430m.f266285f = C99069d.f290421d.f266270j;
            C99069d.f290430m.f266283d = C99069d.f290421d.f266265e;
            C99069d.f290430m.f266284e = C99069d.f290421d.f266266f;
            StorySinglePreviewReportStruct storySinglePreviewReportStruct = C99069d.f290430m;
            storySinglePreviewReportStruct.f266286g = storySinglePreviewReportStruct.mo86045b("StoryOwnerUserName", ((C98266k) this.f282101z.get(this.f282094u).get(this.f282095v)).f288084g, true);
            StorySinglePreviewReportStruct storySinglePreviewReportStruct2 = C99069d.f290430m;
            storySinglePreviewReportStruct2.f266287h = storySinglePreviewReportStruct2.mo86045b("StoryTid", String.valueOf(((C98266k) this.f282101z.get(this.f282094u).get(this.f282095v)).f288081d), true);
            dVar.mo138416e();
        }
    }

    /* renamed from: q */
    public void mo98077q() {
        C72994y1.C72995a aVar = this.f282079d == C79005m.C79006a.ProfileGallery ? C72994y1.C72995a.USERINFO_STORY_PULL_DOWN_PROFILE_FIRST_BOOLEAN_SYNC : null;
        if (aVar != null && !C86709a0.m107535s().mo121142i().mo119686g(aVar, false)) {
            ViewGroup.LayoutParams layoutParams = this.f282085j.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            C75044y4.m89996h(getContext());
            marginLayoutParams.topMargin = -getTop();
            this.f282085j.setLayoutParams(marginLayoutParams);
            this.f282085j.setVisibility(0);
            TextView textView = this.f282085j;
            String string = getResources().getString(C0966R.string.jrd);
            C87412m.m108593f(string, "resources.getString(R.string.story_pull_hint)");
            int currentTextColor = this.f282085j.getCurrentTextColor();
            Context context = MMApplicationContext.getContext();
            Drawable e = C74933u4.m89768e(context, C0966R.raw.story_downward_arrow, currentTextColor);
            e.setBounds(0, 0, C76577a.m92151b(context, 14), C76577a.m92151b(context, 20));
            C76003c cVar = new C76003c(e, 1);
            SpannableString spannableString = new SpannableString('#' + string);
            spannableString.setSpan(cVar, 0, 1, 17);
            textView.setText(spannableString);
        }
    }

    public final void setCanDragScale(boolean z) {
    }

    public final void setChatRoom(String str) {
        this.f282083h = str;
        this.f282068L.setChatRoom(str);
    }

    public void setCurrentHItem(int i) {
        RecyclerView recyclerView = this.f282088p;
        if (recyclerView != null) {
            recyclerView.post(new C96437q(this, i));
        }
    }

    public void setCurrentVItem(int i) {
        GalleryRecyclerView galleryRecyclerView = this.f282099y;
        if (galleryRecyclerView != null) {
            galleryRecyclerView.post(new C96438r(i, this));
        }
    }

    public void setDataSeed(Object obj) {
        C79005m.C79006a aVar = this.f282079d;
        this.f282060D = aVar == C79005m.C79006a.SelfGallery || aVar == C79005m.C79006a.SelfTabGallery || aVar == C79005m.C79006a.HistoryGallery || aVar == C79005m.C79006a.FavSelfStoryGallery;
        setDataInternal(obj);
    }

    public final void setDeleteWhenFirstEmpty(boolean z) {
        this.f282082g = z;
    }

    public final void setFirstPost(boolean z) {
        this.f282098x0 = z;
    }

    public final void setGalleryScaleListener(C71277m mVar) {
        C87412m.m108594g(mVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f282065I = mVar;
        C79005m.C79006a aVar = this.f282079d;
        if (aVar == C79005m.C79006a.MultiUserGallery || aVar == C79005m.C79006a.HistoryGallery || aVar == C79005m.C79006a.FavSelfStoryGallery || aVar == C79005m.C79006a.FavOtherStoryGallery) {
            C77047f fVar = new C77047f();
            fVar.f225081a = this;
            C75628g gVar = this.f282066J;
            gVar.getClass();
            gVar.f222182k.add(fVar);
        }
        C77048i iVar = new C77048i(this, mVar);
        C75628g gVar2 = this.f282066J;
        gVar2.getClass();
        gVar2.f222182k.add(iVar);
    }

    public final void setNeedReset(boolean z) {
        this.f282089p0 = z;
    }

    public final void setSessionId(String str) {
        this.f282084i = str;
    }

    public void setStoryBrowseUIListener(C102778f fVar) {
        if (fVar != null) {
            this.f282059C = fVar;
        }
    }

    /* renamed from: w */
    public final void mo134387w() {
        StringBuilder sb = new StringBuilder();
        sb.append("addVideoReadNumber ");
        StoryGalleryItemView storyGalleryItemView = this.f282086n;
        C87412m.m108591d(storyGalleryItemView);
        C98268m videoItem = storyGalleryItemView.getVideoItem();
        C87412m.m108591d(videoItem);
        sb.append(videoItem.f288089b);
        sb.append("  time:");
        sb.append(System.currentTimeMillis());
        Log.m105918d("MicroMsg.StoryGalleryView", sb.toString());
        MMHandlerThread.removeRunnable(this.f282100y0);
        MMHandlerThread.postToMainThreadDelayed(this.f282100y0, 500);
    }

    /* renamed from: x */
    public final void mo134388x(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
        } else if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 1;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(14);
        }
    }

    /* renamed from: y */
    public final void mo134389y(int i, int i2) {
        if (this.f282101z.size() > i && this.f282101z.get(i).size() > i2) {
            Log.printInfoStack("MicroMsg.StoryGalleryView", "checkDoPreloadBeforeEnterGallery", new Object[0]);
            if (this.f282101z.get(i).size() > i2 && !Util.isNullOrNil(((C98266k) this.f282101z.get(i).get(i2)).f288082e.f288093f.f297961f)) {
                Log.m105924i("MicroMsg.StoryGalleryView", "checkDoPreloadBeforeEnterGallery, add [" + i + ',' + i2 + "] item");
                C100604w.m131613b(C100604w.f294753a, C64197v.m75534c(((C98266k) this.f282101z.get(i).get(i2)).f288082e), 0, 2, (Object) null);
            }
        }
    }

    /* renamed from: z */
    public final void mo134390z() {
        Log.m105918d("MicroMsg.StoryGalleryView", "fadeOutMaskView");
        C99069d dVar = C99069d.f290418a;
        C99069d.f290421d.f266270j = System.currentTimeMillis();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f282062F, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.addListener(new C43172o(this));
        ofFloat.start();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryGalleryView(Context context, C79005m.C79006a aVar, int i, boolean z, ArrayList<Long> arrayList) {
        super(context);
        T t;
        C97383c cVar;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "galleryType");
        C87412m.m108594g(arrayList, "checkedFavList");
        this.f282079d = aVar;
        this.f282080e = i;
        this.f282081f = arrayList;
        this.f282093t = new C62184j();
        this.f282094u = -1;
        this.f282095v = -1;
        this.f282101z = new ArrayList<>();
        this.f282073R = true;
        Log.m105924i("MicroMsg.StoryGalleryView", " StoryGalleryView " + aVar);
        this.f282071P = new StoryVideoViewMgr();
        this.f282092s = new C62184j();
        this.f282066J = new C75628g(context);
        View.inflate(context, C0966R.C0971layout.c6v, this);
        View findViewById = findViewById(C0966R.C0970id.k7f);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_gallery_recycler)");
        GalleryRecyclerView galleryRecyclerView = (GalleryRecyclerView) findViewById;
        this.f282099y = galleryRecyclerView;
        View findViewById2 = findViewById(C0966R.C0970id.k79);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_gallery_mask_view)");
        this.f282062F = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k75);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_gallery_holder_layout)");
        GalleryHolderView galleryHolderView = (GalleryHolderView) findViewById3;
        this.holderView = galleryHolderView;
        View findViewById4 = findViewById(C0966R.C0970id.k6x);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_gallery_control_layout)");
        GalleryVerticalControlView galleryVerticalControlView = (GalleryVerticalControlView) findViewById4;
        this.f282068L = galleryVerticalControlView;
        View findViewById5 = findViewById(C0966R.C0970id.k6w);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_gallery_container)");
        this.f282087o = (FrameLayout) findViewById5;
        ViewGroup.LayoutParams layoutParams = galleryVerticalControlView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int i2 = layoutParams2.topMargin;
        layoutParams2.setMargins(0, C85875k4.m106205t(context, false) ? i2 + C85875k4.m106198o(context) : i2, 0, 0);
        galleryVerticalControlView.setLayoutParams(layoutParams2);
        View findViewById6 = findViewById(C0966R.C0970id.k8s);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_pull_hint)");
        this.f282085j = (TextView) findViewById6;
        galleryVerticalControlView.setOnAllFav(C96421c.f282104d);
        galleryVerticalControlView.f282032r = aVar;
        switch (aVar.ordinal()) {
            case 2:
            case 3:
                galleryVerticalControlView.f282027j.setVisibility(8);
                break;
            case 4:
                galleryVerticalControlView.f282033s = new C76729b();
                Context context2 = galleryVerticalControlView.getContext();
                C87412m.m108593f(context2, "context");
                galleryVerticalControlView.f282034t = new AvatarLayoutManager(context2, 1);
                galleryVerticalControlView.f282027j.setVisibility(8);
                ViewGroup.LayoutParams layoutParams3 = galleryVerticalControlView.f282026i.getLayoutParams();
                C87412m.m108592e(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginStart(C76577a.m92151b(galleryVerticalControlView.getContext(), 64));
                layoutParams4.setMarginEnd(C76577a.m92151b(galleryVerticalControlView.getContext(), 20));
                layoutParams4.addRule(17, galleryVerticalControlView.f282022e.getId());
                layoutParams4.addRule(21);
                break;
            case 5:
                galleryVerticalControlView.f282033s = new C76732d();
                Context context3 = galleryVerticalControlView.getContext();
                C87412m.m108593f(context3, "context");
                galleryVerticalControlView.f282034t = new AvatarLayoutManager(context3, 1);
                galleryVerticalControlView.f282027j.bringToFront();
                ViewGroup.LayoutParams layoutParams5 = galleryVerticalControlView.f282026i.getLayoutParams();
                C87412m.m108592e(layoutParams5, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                layoutParams6.setMarginStart(0);
                layoutParams6.setMarginEnd(0);
                layoutParams6.removeRule(17);
                layoutParams6.removeRule(21);
                layoutParams6.addRule(13);
                ViewGroup.LayoutParams layoutParams7 = galleryVerticalControlView.f282025h.getLayoutParams();
                C87412m.m108592e(layoutParams7, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams7).height = C76577a.m92151b(galleryVerticalControlView.getContext(), 96);
                break;
            case 7:
                galleryVerticalControlView.f282026i.setVisibility(8);
                galleryVerticalControlView.f282027j.bringToFront();
                if (z) {
                    galleryVerticalControlView.f282029o.setVisibility(0);
                } else {
                    galleryVerticalControlView.f282029o.setVisibility(8);
                }
                ViewGroup.LayoutParams layoutParams8 = galleryVerticalControlView.f282029o.getLayoutParams();
                C87412m.m108592e(layoutParams8, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams9 = (RelativeLayout.LayoutParams) layoutParams8;
                layoutParams9.removeRule(21);
                layoutParams9.addRule(16, galleryVerticalControlView.f282027j.getId());
                layoutParams9.setMarginEnd(C76577a.m92151b(galleryVerticalControlView.getContext(), 4));
                break;
            case 8:
                galleryVerticalControlView.f282026i.setVisibility(8);
                galleryVerticalControlView.f282027j.setVisibility(8);
                if (!z) {
                    galleryVerticalControlView.f282029o.setVisibility(8);
                    break;
                } else {
                    galleryVerticalControlView.f282029o.setVisibility(0);
                    break;
                }
            case 9:
                galleryVerticalControlView.f282026i.setVisibility(8);
                galleryVerticalControlView.f282029o.setVisibility(8);
                galleryVerticalControlView.f282027j.setVisibility(8);
                galleryVerticalControlView.f282031q.setVisibility(0);
                break;
        }
        galleryVerticalControlView.f282025h.setLayoutManager(galleryVerticalControlView.f282034t);
        galleryVerticalControlView.f282025h.setAdapter(galleryVerticalControlView.f282033s);
        galleryVerticalControlView.f282025h.setFocusable(false);
        galleryHolderView.setOnClickListener(new C96422d(this));
        GalleryRecyclerView.C96412c cVar2 = new GalleryRecyclerView.C96412c();
        this.f282097x = cVar2;
        galleryRecyclerView.setAdapter(cVar2);
        galleryRecyclerView.setFocusable(false);
        galleryRecyclerView.setOnRowSelected(new C96423e(this));
        galleryRecyclerView.setOnScrollCallback(new C96424f(this));
        cVar2.f282016e = new C96425g(this);
        galleryVerticalControlView.setOnClose(new C96426h(this));
        galleryVerticalControlView.setOnMenu(new C96427i(this, context));
        mo134371B(false);
        galleryVerticalControlView.setOnCheckedFav(new C96428j(this, context));
        galleryVerticalControlView.setOnClickRangeIcon(C96429k.f282114d);
        this.f282067K = new C96419a(this);
        LinkedList<WeakReference<StoryGalleryView>> linkedList = C97384g.f285885a;
        Log.m105924i("MicroMsg.GalleryMgr", "GalleryMgr register " + this);
        Iterator<T> it = C97384g.f285885a.iterator();
        while (true) {
            if (it.hasNext()) {
                t = it.next();
                if (C87412m.m108589b(this, ((WeakReference) t).get())) {
                }
            } else {
                t = null;
            }
        }
        if (((WeakReference) t) == null) {
            C97384g.f285885a.add(new WeakReference(this));
        }
        if (C97384g.f285885a.size() > 0 && (cVar = C97384g.f285886b) != null) {
            Log.m105924i(cVar.f285881a, "cancel");
            cVar.f285884d = false;
        }
        this.f282072Q = new C100591g(this, this.f282099y, this.f282093t);
        C96420b bVar = new C96420b(this);
        this.f282074S = bVar;
        C97758b bVar2 = C97758b.f286820d;
        LinkedList<C32227p<Boolean, Long, C13598b0>> linkedList2 = C97758b.f286831r;
        if (!linkedList2.contains(bVar)) {
            linkedList2.add(bVar);
        }
        C99069d dVar = C99069d.f290418a;
        C99069d.f290421d.f266264d = (long) NetStatusUtil.getIOSNetType(context);
        this.f282075T = new C96431p(this, context);
        this.f282076U = -1;
        this.f282100y0 = new C96430n(this);
    }
}
