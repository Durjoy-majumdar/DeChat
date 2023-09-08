package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioSearchView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.audio.EditorAudioSelectFinderVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import fh2.C107541d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gh2.C98116a;
import gy3.C87412m;
import gy3.C87413o;
import hi2.C8534c;
import ih2.C60287a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jh2.C108745d;
import jh2.C108747e;
import jh2.C60856b;
import jp3.C46566c;
import jp3.C9486a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import p151er.C58676k;
import p385u2.C111105a;
import p396x6.C23023u;
import p816jl.C60878a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C110975wt2;
import te3.C49044cs2;
import te3.C64839xt2;
import th2.C110992d;
import xh2.C112151a;
import yh2.C112459e;
import yh2.C112460f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001]B!\u0012\u0006\u0010V\u001a\u00020U\u0012\b\u0010X\u001a\u0004\u0018\u00010W\u0012\u0006\u0010Y\u001a\u00020\u000f¢\u0006\u0004\bZ\u0010[B\u001b\b\u0016\u0012\u0006\u0010V\u001a\u00020U\u0012\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bZ\u0010\\J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0003J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0015j\b\u0012\u0004\u0012\u00020\f`\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001e\u0010\u001b\u001a\u00020\b2\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0019H\u0016J\u0006\u0010\u001d\u001a\u00020\u001cR#\u0010$\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010'\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R#\u0010*\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8BX\u0002¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R#\u0010/\u001a\n \u001f*\u0004\u0018\u00010+0+8BX\u0002¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010.R#\u00104\u001a\n \u001f*\u0004\u0018\u000100008BX\u0002¢\u0006\f\n\u0004\b1\u0010!\u001a\u0004\b2\u00103R#\u00109\u001a\n \u001f*\u0004\u0018\u000105058BX\u0002¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u00108R#\u0010<\u001a\n \u001f*\u0004\u0018\u00010+0+8BX\u0002¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010.R\"\u0010C\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010>\u001a\u0004\bE\u0010@\"\u0004\bF\u0010BR\"\u0010K\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u0010@\"\u0004\bJ\u0010BR$\u0010\u001a\u001a\u0004\u0018\u00010L8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0011\u0010T\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bS\u0010@¨\u0006^"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "", "", "Lte3/cs2;", "getLyricsItemInfos", "", "show", "Lrx3/b0;", "setShowAudioPanel", "enable", "setPlayMusicWhenSearchFinish", "Lcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;", "audioList", "setLocalAudioList", "", "resId", "setBackground", "Lx6/u;", "player", "setMusicPlayer", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getAllAudioCacheInfo", "setShow", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "", "getMusicRequestId", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "t", "Lrx3/g;", "getMuteMusicText", "()Landroid/widget/TextView;", "muteMusicText", "u", "getMuteOriginText", "muteOriginText", "v", "getLyricsText", "lyricsText", "Landroid/view/View;", "z", "getSelectFinderVideoBtn", "()Landroid/view/View;", "selectFinderVideoBtn", "Landroid/widget/ImageView;", "A", "getFavFinderVideoRedDot", "()Landroid/widget/ImageView;", "favFinderVideoRedDot", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView;", "B", "getSelectFinderVideoPanel", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/audio/EditorAudioSelectFinderVideoView;", "selectFinderVideoPanel", "G", "getCenterCloseGroup", "centerCloseGroup", "N", "Z", "getMuteOriginDefault", "()Z", "setMuteOriginDefault", "(Z)V", "muteOriginDefault", "P", "getMuteOrigin", "setMuteOrigin", "muteOrigin", "Q", "getWithMusic", "setWithMusic", "withMusic", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$i;", "V", "Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$i;", "getCallback", "()Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$i;", "setCallback", "(Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$i;)V", "getShouldShowSelectFinderVideoRedDot", "shouldShowSelectFinderVideoRedDot", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "i", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView */
public final class EditorAudioView extends InsectRelativeLayout {

    /* renamed from: y0 */
    public static final /* synthetic */ int f315516y0 = 0;

    /* renamed from: A */
    public final C13601g f315517A;

    /* renamed from: B */
    public final C13601g f315518B;

    /* renamed from: C */
    public int f315519C;

    /* renamed from: D */
    public int f315520D;

    /* renamed from: E */
    public int f315521E;

    /* renamed from: F */
    public final C8534c f315522F;

    /* renamed from: G */
    public final C13601g f315523G;

    /* renamed from: H */
    public final C112151a f315524H;

    /* renamed from: I */
    public int f315525I;

    /* renamed from: J */
    public C60856b f315526J;

    /* renamed from: K */
    public boolean f315527K;

    /* renamed from: L */
    public boolean f315528L;

    /* renamed from: M */
    public LinkedList<AudioCacheInfo> f315529M;

    /* renamed from: N */
    public boolean f315530N;

    /* renamed from: P */
    public boolean f315531P;

    /* renamed from: Q */
    public boolean f315532Q;

    /* renamed from: R */
    public boolean f315533R;

    /* renamed from: S */
    public boolean f315534S;

    /* renamed from: T */
    public boolean f315535T;

    /* renamed from: U */
    public boolean f315536U;

    /* renamed from: V */
    public C106012i f315537V;

    /* renamed from: W */
    public C32226l<? super Boolean, C13598b0> f315538W;

    /* renamed from: i */
    public final View f315539i;

    /* renamed from: j */
    public final RecyclerView f315540j;

    /* renamed from: n */
    public final ImageView f315541n;

    /* renamed from: o */
    public final ImageView f315542o;

    /* renamed from: p */
    public final ImageView f315543p;

    /* renamed from: p0 */
    public C46566c<C9486a> f315544p0;

    /* renamed from: q */
    public final View f315545q;

    /* renamed from: r */
    public final View f315546r;

    /* renamed from: s */
    public final View f315547s;

    /* renamed from: t */
    public final C13601g f315548t;

    /* renamed from: u */
    public final C13601g f315549u;

    /* renamed from: v */
    public final C13601g f315550v;

    /* renamed from: w */
    public final View f315551w;

    /* renamed from: x */
    public final EditorAudioSearchView f315552x;

    /* renamed from: x0 */
    public boolean f315553x0;

    /* renamed from: y */
    public final ViewGroup f315554y;

    /* renamed from: z */
    public final C13601g f315555z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$l */
    public static final class C42804l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f115892d;

        /* renamed from: e */
        public final /* synthetic */ int f115893e;

        public C42804l(View view, int i) {
            this.f115892d = view;
            this.f115893e = i;
        }

        public final void run() {
            View view = this.f115892d;
            view.setPadding(view.getPaddingLeft(), this.f115892d.getPaddingTop(), this.f115892d.getPaddingRight(), this.f115893e);
            this.f115892d.requestLayout();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$u */
    public static final class C42805u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f115894d;

        public C42805u(EditorAudioView editorAudioView) {
            this.f115894d = editorAudioView;
        }

        public final void run() {
            View view = this.f115894d.f315539i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$setShowAudioPanel$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$setShowAudioPanel$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$a */
    public static final class C106004a extends C87413o implements C32227p<Integer, AudioCacheInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315556d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106004a(EditorAudioView editorAudioView) {
            super(2);
            this.f315556d = editorAudioView;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            AudioCacheInfo audioCacheInfo = (AudioCacheInfo) obj2;
            C87412m.m108594g(audioCacheInfo, "info");
            if (intValue != this.f315556d.f315524H.getItemCount()) {
                EditorAudioView editorAudioView = this.f315556d;
                if (intValue != editorAudioView.f315525I) {
                    RecyclerView.LayoutManager layoutManager = editorAudioView.f315540j.getLayoutManager();
                    C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    int z = linearLayoutManager.mo17004z();
                    int D = linearLayoutManager.mo16958D();
                    if (audioCacheInfo.f163820o == 2) {
                        RecyclerView recyclerView = this.f315556d.f315540j;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(intValue));
                        RecyclerView recyclerView2 = recyclerView;
                        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        this.f315556d.mo151399r(intValue, false);
                    } else {
                        if (z <= intValue && intValue <= D) {
                            this.f315556d.mo151399r(intValue, false);
                        } else {
                            RecyclerView recyclerView3 = this.f315556d.f315540j;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(Integer.valueOf(intValue));
                            RecyclerView recyclerView4 = recyclerView3;
                            C117292a.m165358d(recyclerView4, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            recyclerView3.mo17149t1(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(recyclerView4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$2", "invoke", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        }
                    }
                }
            }
            EditorAudioView editorAudioView2 = this.f315556d;
            if (intValue == editorAudioView2.f315525I) {
                editorAudioView2.mo151413y();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$b */
    public static final class C106005b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315557d;

        /* renamed from: e */
        public final /* synthetic */ Context f315558e;

        public C106005b(EditorAudioView editorAudioView, Context context) {
            this.f315557d = editorAudioView;
            this.f315558e = context;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorAudioView editorAudioView = this.f315557d;
            editorAudioView.setMuteOrigin(!editorAudioView.getMuteOrigin());
            C106012i callback = this.f315557d.getCallback();
            if (callback != null) {
                callback.mo151425d(this.f315557d.getMuteOrigin());
            }
            if (this.f315557d.getMuteOrigin()) {
                this.f315557d.f315541n.setImageDrawable(C74933u4.m89768e(this.f315558e, C0966R.raw.ui_rescoures_checkbox_unselected, -1));
                EditorAudioView editorAudioView2 = this.f315557d;
                editorAudioView2.mo151410t(editorAudioView2.f315545q, C0966R.C0970id.f5652ky, C0966R.string.f7513id);
            } else {
                EditorAudioView editorAudioView3 = this.f315557d;
                editorAudioView3.f315541n.setImageDrawable(C74933u4.m89768e(this.f315558e, editorAudioView3.f315520D, editorAudioView3.f315521E));
                EditorAudioView editorAudioView4 = this.f315557d;
                editorAudioView4.mo151410t(editorAudioView4.f315545q, C0966R.C0970id.f5652ky, C0966R.string.f7514ie);
            }
            EditorAudioView editorAudioView5 = this.f315557d;
            editorAudioView5.f315545q.setTag(C0966R.C0970id.d59, Boolean.valueOf(!editorAudioView5.getMuteOrigin()));
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$c */
    public static final class C106006c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315559d;

        public C106006c(EditorAudioView editorAudioView) {
            this.f315559d = editorAudioView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f315559d.mo151413y();
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$d */
    public static final class C106007d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315560d;

        public C106007d(EditorAudioView editorAudioView) {
            this.f315560d = editorAudioView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorAudioView editorAudioView = this.f315560d;
            editorAudioView.mo151412x(!editorAudioView.f315533R);
            C110992d.f332425a.mo162670d(20);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$e */
    public static final class C106008e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315561d;

        public C106008e(EditorAudioView editorAudioView) {
            this.f315561d = editorAudioView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f315561d.setShow(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$f */
    public static final class C106009f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315562d;

        public C106009f(EditorAudioView editorAudioView) {
            this.f315562d = editorAudioView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f315562d.setShow(false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$g */
    public static final class C106010g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315563d;

        public C106010g(EditorAudioView editorAudioView) {
            this.f315563d = editorAudioView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f315563d.f315524H.mo163964O4((Integer) null);
            this.f315563d.mo151411w(true);
            this.f315563d.setShowAudioPanel(false);
            C106012i callback = this.f315563d.getCallback();
            if (callback != null) {
                AudioCacheInfo audioCacheInfo = new AudioCacheInfo();
                audioCacheInfo.f163820o = 2;
                callback.mo151424c(audioCacheInfo);
            }
            C108745d.C108746a aVar = C108745d.f325632h;
            C108745d dVar = C108745d.f325633i;
            if (dVar != null) {
                C110975wt2 wt22 = new C110975wt2();
                wt22.f332322e = 14;
                wt22.f332324g = (int) Util.nowSecond();
                dVar.f325641g.add(wt22);
                Log.m105924i("MicroMsg.AudioReporter", "record enter search " + C108747e.m147548a(wt22));
            }
            C110992d dVar2 = C110992d.f332425a;
            C110992d.f332428d.f310309v = 1;
            C110992d.f332431g.f310327q = 1;
            dVar2.mo162670d(17);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$h */
    public static final class C106011h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315564d;

        public C106011h(EditorAudioView editorAudioView) {
            this.f315564d = editorAudioView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EditorAudioView editorAudioView = this.f315564d;
            editorAudioView.f315553x0 = editorAudioView.mo151396n();
            C8534c cVar = this.f315564d.f315522F;
            if (cVar.f27590b) {
                ((MultiProcessMMKV) ((C36570n) cVar.f27589a).getValue()).encode("enter_select_finder_video_panel", true);
            }
            this.f315564d.getFavFinderVideoRedDot().setVisibility(8);
            this.f315564d.f315524H.mo163964O4((Integer) null);
            EditorAudioView.m142567f(this.f315564d, true);
            this.f315564d.setShowAudioPanel(false);
            C106012i callback = this.f315564d.getCallback();
            if (callback != null) {
                AudioCacheInfo audioCacheInfo = new AudioCacheInfo();
                audioCacheInfo.f163820o = 2;
                callback.mo151424c(audioCacheInfo);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$i */
    public interface C106012i {
        /* renamed from: a */
        void mo151422a();

        /* renamed from: b */
        void mo151423b(AudioCacheInfo audioCacheInfo);

        /* renamed from: c */
        void mo151424c(AudioCacheInfo audioCacheInfo);

        /* renamed from: d */
        void mo151425d(boolean z);

        /* renamed from: e */
        void mo151426e();

        /* renamed from: f */
        void mo151427f(boolean z, List<? extends C49044cs2> list);
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$j */
    public static final class C106013j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106013j(EditorAudioView editorAudioView) {
            super(0);
            this.f315565d = editorAudioView;
        }

        public Object invoke() {
            return this.f315565d.findViewById(C0966R.C0970id.ayj);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$k */
    public static final class C106014k extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106014k(EditorAudioView editorAudioView) {
            super(0);
            this.f315566d = editorAudioView;
        }

        public Object invoke() {
            return (ImageView) this.f315566d.findViewById(C0966R.C0970id.k6_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$m */
    public static final class C106015m extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106015m(EditorAudioView editorAudioView) {
            super(0);
            this.f315567d = editorAudioView;
        }

        public Object invoke() {
            return (TextView) this.f315567d.findViewById(C0966R.C0970id.k54);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$n */
    public static final class C106016n extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106016n(EditorAudioView editorAudioView) {
            super(0);
            this.f315568d = editorAudioView;
        }

        public Object invoke() {
            return (TextView) this.f315568d.findViewById(C0966R.C0970id.k57);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$o */
    public static final class C106017o extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106017o(EditorAudioView editorAudioView) {
            super(0);
            this.f315569d = editorAudioView;
        }

        public Object invoke() {
            return (TextView) this.f315569d.findViewById(C0966R.C0970id.k5_);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$p */
    public static final class C106018p implements C60878a.C46560a {

        /* renamed from: a */
        public final /* synthetic */ EditorAudioView f315570a;

        public C106018p(EditorAudioView editorAudioView) {
            this.f315570a = editorAudioView;
        }

        public void onPageSelected(int i) {
            int i2 = EditorAudioView.f315516y0;
            Log.m105924i("MicroMsg.EditorAudioView", "onPageSelected >> " + i);
            this.f315570a.mo151399r(i, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$q */
    public static final class C106019q extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106019q(EditorAudioView editorAudioView) {
            super(0);
            this.f315571d = editorAudioView;
        }

        public Object invoke() {
            return this.f315571d.findViewById(C0966R.C0970id.k6e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$r */
    public static final class C106020r extends C87413o implements C32224a<EditorAudioSelectFinderVideoView> {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106020r(EditorAudioView editorAudioView) {
            super(0);
            this.f315572d = editorAudioView;
        }

        public Object invoke() {
            return (EditorAudioSelectFinderVideoView) this.f315572d.findViewById(C0966R.C0970id.k6f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$s */
    public static final class C106021s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315573d;

        public C106021s(EditorAudioView editorAudioView) {
            this.f315573d = editorAudioView;
        }

        public final void run() {
            C60856b bVar;
            EditorAudioView editorAudioView = this.f315573d;
            if (!editorAudioView.f315527K && (bVar = editorAudioView.f315526J) != null) {
                bVar.f173389m.obtainMessage(bVar.f173378b).sendToTarget();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$t */
    public static final class C106022t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorAudioView f315574d;

        public C106022t(EditorAudioView editorAudioView) {
            this.f315574d = editorAudioView;
        }

        public final void run() {
            this.f315574d.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorAudioView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315548t = C36568h.m40985a(new C106016n(this));
        this.f315549u = C36568h.m40985a(new C106017o(this));
        this.f315550v = C36568h.m40985a(new C106015m(this));
        this.f315555z = C36568h.m40985a(new C106019q(this));
        this.f315517A = C36568h.m40985a(new C106014k(this));
        this.f315518B = C36568h.m40985a(new C106020r(this));
        this.f315519C = C111105a.m151500b(context, C0966R.color.f356996ai0);
        this.f315520D = C0966R.raw.popvideo_post_selected_origin;
        this.f315522F = new C8534c();
        this.f315523G = C36568h.m40985a(new C106013j(this));
        this.f315529M = new LinkedList<>();
        this.f315535T = true;
        this.f315536U = true;
        this.f315544p0 = new C46566c<>();
        C106018p pVar = new C106018p(this);
        View.inflate(context, C0966R.C0971layout.c65, this);
        View findViewById = findViewById(C0966R.C0970id.k36);
        C87412m.m108593f(findViewById, "findViewById(R.id.story_audio_panel)");
        this.f315539i = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.k6r);
        C87412m.m108593f(findViewById2, "findViewById(R.id.story_esitor_search_btn)");
        this.f315551w = findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.k5a);
        C87412m.m108593f(findViewById3, "findViewById(R.id.story_editor_audio_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        this.f315540j = recyclerView;
        View findViewById4 = findViewById(C0966R.C0970id.k5m);
        C87412m.m108593f(findViewById4, "findViewById(R.id.story_editor_audio_search_panel)");
        EditorAudioSearchView editorAudioSearchView = (EditorAudioSearchView) findViewById4;
        this.f315552x = editorAudioSearchView;
        View findViewById5 = findViewById(C0966R.C0970id.k7p);
        C87412m.m108593f(findViewById5, "findViewById(R.id.story_item_audio_search_icon)");
        View findViewById6 = findViewById(C0966R.C0970id.f359308k60);
        C87412m.m108593f(findViewById6, "findViewById(R.id.story_editor_audio_status_panel)");
        this.f315554y = (ViewGroup) findViewById6;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        C112151a aVar = new C112151a();
        this.f315524H = aVar;
        C60878a aVar2 = new C60878a();
        aVar2.f173447m = pVar;
        aVar2.mo75025b(recyclerView);
        recyclerView.setAdapter(aVar);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, context.getResources().getDrawable(C0966R.raw.icons_filled_search));
        stateListDrawable.addState(new int[0], C74933u4.m89768e(context, C0966R.raw.icons_filled_search, C76577a.m92153d(context, C0966R.color.f356996ai0)));
        ((ImageView) findViewById5).setImageDrawable(stateListDrawable);
        aVar.f335831o = new C106004a(this);
        View findViewById7 = findViewById(C0966R.C0970id.k59);
        C87412m.m108593f(findViewById7, "findViewById(R.id.story_…r_audio_mute_origin_icon)");
        ImageView imageView = (ImageView) findViewById7;
        this.f315541n = imageView;
        View findViewById8 = findViewById(C0966R.C0970id.k58);
        C87412m.m108593f(findViewById8, "findViewById<View>(R.id.…editor_audio_mute_origin)");
        this.f315545q = findViewById8;
        Boolean bool = Boolean.TRUE;
        findViewById8.setTag(C0966R.C0970id.d59, bool);
        imageView.setImageDrawable(C74933u4.m89768e(context, this.f315520D, this.f315521E));
        mo151410t(findViewById8, C0966R.C0970id.f5652ky, C0966R.string.f7514ie);
        findViewById8.setOnClickListener(new C106005b(this, context));
        View findViewById9 = findViewById(C0966R.C0970id.f359307k53);
        C87412m.m108593f(findViewById9, "findViewById(R.id.story_editor_audio_lyrics_icon)");
        ImageView imageView2 = (ImageView) findViewById9;
        this.f315543p = imageView2;
        View findViewById10 = findViewById(C0966R.C0970id.f359306k52);
        C87412m.m108593f(findViewById10, "findViewById<View>(R.id.story_editor_audio_lyrics)");
        this.f315547s = findViewById10;
        View findViewById11 = findViewById(C0966R.C0970id.k56);
        C87412m.m108593f(findViewById11, "findViewById(R.id.story_…or_audio_mute_music_icon)");
        ImageView imageView3 = (ImageView) findViewById11;
        this.f315542o = imageView3;
        View findViewById12 = findViewById(C0966R.C0970id.k55);
        C87412m.m108593f(findViewById12, "findViewById<View>(R.id.…_editor_audio_mute_music)");
        this.f315546r = findViewById12;
        findViewById12.setTag(C0966R.C0970id.d59, bool);
        imageView3.setImageDrawable(C74933u4.m89768e(context, this.f315520D, this.f315521E));
        mo151410t(findViewById12, C0966R.C0970id.f5651kx, C0966R.string.f7514ie);
        findViewById12.setOnClickListener(new C106006c(this));
        findViewById10.setTag(C0966R.C0970id.d59, Boolean.FALSE);
        imageView2.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.ui_rescoures_checkbox_unselected, -1));
        mo151410t(findViewById10, C0966R.C0970id.f5650kw, C0966R.string.f7513id);
        findViewById10.setOnClickListener(new C106007d(this));
        getCenterCloseGroup().setOnClickListener(new C106008e(this));
        setOnClickListener(new C106009f(this));
        findViewById2.setOnClickListener(new C106010g(this));
        findViewById.setTranslationY(getResources().getDimension(C0966R.dimen.apd));
        editorAudioSearchView.setCallback(new C112459e(this));
        getSelectFinderVideoBtn().setOnClickListener(new C106011h(this));
        getSelectFinderVideoPanel().setCallback(new C112460f(this));
    }

    /* renamed from: f */
    public static final void m142567f(EditorAudioView editorAudioView, boolean z) {
        if (z) {
            editorAudioView.f315536U = false;
            editorAudioView.getSelectFinderVideoPanel().setShow(true);
            return;
        }
        editorAudioView.getSelectFinderVideoPanel().setShow(false);
    }

    private final View getCenterCloseGroup() {
        return (View) ((C36570n) this.f315523G).getValue();
    }

    /* access modifiers changed from: private */
    public final ImageView getFavFinderVideoRedDot() {
        return (ImageView) ((C36570n) this.f315517A).getValue();
    }

    private final List<C49044cs2> getLyricsItemInfos() {
        ArrayList<AudioCacheInfo.C57170c> arrayList;
        AudioCacheInfo F4 = this.f315524H.mo163962F4(this.f315525I);
        ArrayList arrayList2 = new ArrayList();
        if (!(F4 == null || (arrayList = F4.f163815g) == null)) {
            for (AudioCacheInfo.C57170c cVar : arrayList) {
                C49044cs2 cs22 = new C49044cs2();
                cs22.f131928d = cVar.f163832a;
                cs22.f131929e = (long) cVar.f163833b;
                arrayList2.add(cs22);
            }
        }
        return arrayList2;
    }

    private final TextView getLyricsText() {
        return (TextView) ((C36570n) this.f315550v).getValue();
    }

    private final TextView getMuteMusicText() {
        return (TextView) ((C36570n) this.f315548t).getValue();
    }

    private final TextView getMuteOriginText() {
        return (TextView) ((C36570n) this.f315549u).getValue();
    }

    private final View getSelectFinderVideoBtn() {
        return (View) ((C36570n) this.f315555z).getValue();
    }

    private final EditorAudioSelectFinderVideoView getSelectFinderVideoPanel() {
        return (EditorAudioSelectFinderVideoView) ((C36570n) this.f315518B).getValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01e8: MOVE  (r5v12 java.lang.Integer) = (r26v0 java.lang.Integer)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* renamed from: q */
    public static void m142568q(com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.String r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, java.lang.Integer r34, java.lang.Integer r35, boolean r36, int r37, java.lang.Object r38) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r37
            r6 = r5 & 16
            r7 = 0
            if (r6 == 0) goto L_0x0013
            r6 = r7
            goto L_0x0015
        L_0x0013:
            r6 = r27
        L_0x0015:
            r8 = r5 & 32
            if (r8 == 0) goto L_0x001b
            r8 = r7
            goto L_0x001d
        L_0x001b:
            r8 = r28
        L_0x001d:
            r9 = r5 & 64
            if (r9 == 0) goto L_0x0023
            r9 = r7
            goto L_0x0025
        L_0x0023:
            r9 = r29
        L_0x0025:
            r10 = r5 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x002b
            r10 = r7
            goto L_0x002d
        L_0x002b:
            r10 = r30
        L_0x002d:
            r11 = r5 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0033
            r11 = r7
            goto L_0x0035
        L_0x0033:
            r11 = r31
        L_0x0035:
            r12 = r5 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x003b
            r12 = r7
            goto L_0x003d
        L_0x003b:
            r12 = r32
        L_0x003d:
            r13 = r5 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0043
            r13 = r7
            goto L_0x0045
        L_0x0043:
            r13 = r33
        L_0x0045:
            r14 = r5 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x004b
            r14 = r7
            goto L_0x004d
        L_0x004b:
            r14 = r34
        L_0x004d:
            r15 = r5 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r7 = r35
        L_0x0054:
            r5 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x005a
            r5 = 0
            goto L_0x005c
        L_0x005a:
            r5 = r36
        L_0x005c:
            android.view.View r15 = r22.getCenterCloseGroup()
            if (r5 == 0) goto L_0x0064
            r5 = 0
            goto L_0x0065
        L_0x0064:
            r5 = 4
        L_0x0065:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo10233c(r5)
            java.lang.Object[] r5 = r4.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView"
            java.lang.String r17 = "resetStyle"
            java.lang.String r18 = "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r27 = r15
            r28 = r5
            r29 = r16
            r30 = r17
            r31 = r18
            r32 = r19
            r33 = r20
            r34 = r21
            j20.C117292a.m165358d(r27, r28, r29, r30, r31, r32, r33, r34)
            r5 = 0
            java.lang.Object r4 = r4.mo10231a(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r15.setVisibility(r4)
            java.lang.String r4 = "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView"
            java.lang.String r5 = "resetStyle"
            java.lang.String r16 = "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r28 = r4
            r29 = r5
            r30 = r16
            r31 = r17
            r32 = r18
            r33 = r19
            j20.C117292a.m165359e(r27, r28, r29, r30, r31, r32, r33)
            if (r6 == 0) goto L_0x00f4
            int r4 = r6.intValue()
            if (r4 == 0) goto L_0x00f4
            android.content.Context r4 = r22.getContext()
            int r5 = r6.intValue()
            int r4 = p385u2.C111105a.m151500b(r4, r5)
            r0.f315519C = r4
            android.widget.TextView r4 = r22.getMuteMusicText()
            int r5 = r0.f315519C
            r4.setTextColor(r5)
            android.widget.TextView r4 = r22.getMuteOriginText()
            int r5 = r0.f315519C
            r4.setTextColor(r5)
            android.widget.TextView r4 = r22.getLyricsText()
            int r5 = r0.f315519C
            r4.setTextColor(r5)
        L_0x00f4:
            if (r9 == 0) goto L_0x010a
            int r4 = r9.intValue()
            if (r4 == 0) goto L_0x010a
            android.content.Context r4 = r22.getContext()
            int r5 = r9.intValue()
            int r4 = p385u2.C111105a.m151500b(r4, r5)
            r0.f315521E = r4
        L_0x010a:
            if (r8 == 0) goto L_0x0118
            int r4 = r8.intValue()
            if (r4 == 0) goto L_0x0118
            int r4 = r8.intValue()
            r0.f315520D = r4
        L_0x0118:
            xh2.a r4 = r0.f315524H
            r27 = r4
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r27.mo163963G4(r28, r29, r30, r31, r32)
            if (r7 == 0) goto L_0x0142
            int r4 = r7.intValue()
            if (r4 == 0) goto L_0x0142
            android.view.View r4 = r0.f315551w
            android.content.Context r5 = r22.getContext()
            int r6 = r7.intValue()
            android.graphics.drawable.Drawable r5 = kg3.C76577a.m92158i(r5, r6)
            r4.setBackground(r5)
        L_0x0142:
            boolean r4 = r0.f315531P
            r5 = 2131820869(0x7f110145, float:1.9274465E38)
            if (r4 != 0) goto L_0x0162
            android.widget.ImageView r4 = r0.f315541n
            android.content.Context r6 = r22.getContext()
            int r7 = r0.f315520D
            int r8 = r0.f315521E
            android.graphics.drawable.Drawable r6 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r6, r7, r8)
            r4.setImageDrawable(r6)
            android.view.View r4 = r0.f315545q
            r6 = 2131296744(0x7f0901e8, float:1.8211413E38)
            r0.mo151410t(r4, r6, r5)
        L_0x0162:
            boolean r4 = r0.f315532Q
            if (r4 == 0) goto L_0x017f
            android.widget.ImageView r4 = r0.f315542o
            android.content.Context r6 = r22.getContext()
            int r7 = r0.f315520D
            int r8 = r0.f315521E
            android.graphics.drawable.Drawable r6 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r6, r7, r8)
            r4.setImageDrawable(r6)
            android.view.View r4 = r0.f315546r
            r6 = 2131296743(0x7f0901e7, float:1.8211411E38)
            r0.mo151410t(r4, r6, r5)
        L_0x017f:
            boolean r4 = r0.f315533R
            if (r4 == 0) goto L_0x019c
            android.widget.ImageView r4 = r0.f315543p
            android.content.Context r6 = r22.getContext()
            int r7 = r0.f315520D
            int r8 = r0.f315521E
            android.graphics.drawable.Drawable r6 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r6, r7, r8)
            r4.setImageDrawable(r6)
            android.view.View r4 = r0.f315547s
            r6 = 2131296742(0x7f0901e6, float:1.821141E38)
            r0.mo151410t(r4, r6, r5)
        L_0x019c:
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView r4 = r0.f315552x
            xh2.a r5 = r4.f315503u
            if (r5 == 0) goto L_0x01b5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r27 = r5
            r28 = r6
            r29 = r11
            r30 = r7
            r31 = r8
            r32 = r9
            r27.mo163963G4(r28, r29, r30, r31, r32)
        L_0x01b5:
            android.widget.Button r5 = r4.f315497o
            if (r5 == 0) goto L_0x01e4
            if (r1 == 0) goto L_0x01c8
            int r6 = r23.intValue()
            if (r6 == 0) goto L_0x01c8
            int r6 = r23.intValue()
            r5.setBackgroundResource(r6)
        L_0x01c8:
            if (r2 == 0) goto L_0x01df
            int r6 = r24.intValue()
            if (r6 == 0) goto L_0x01df
            android.content.Context r6 = r5.getContext()
            int r7 = r24.intValue()
            int r6 = p385u2.C111105a.m151500b(r6, r7)
            r5.setTextColor(r6)
        L_0x01df:
            if (r3 == 0) goto L_0x01e4
            r5.setText(r3)
        L_0x01e4:
            android.widget.EditText r5 = r4.f315496n
            if (r5 == 0) goto L_0x022a
            r5 = r26
            if (r5 == 0) goto L_0x022a
            int r6 = r26.intValue()
            if (r6 == 0) goto L_0x022a
            java.lang.Class<android.widget.TextView> r6 = android.widget.TextView.class
            java.lang.String r7 = "mCursorDrawableRes"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch:{ Exception -> 0x020a }
            java.lang.String r7 = "TextView::class.java.get…eld(\"mCursorDrawableRes\")"
            gy3.C87412m.m108593f(r6, r7)     // Catch:{ Exception -> 0x020a }
            r7 = 1
            r6.setAccessible(r7)     // Catch:{ Exception -> 0x020a }
            android.widget.EditText r7 = r4.f315496n     // Catch:{ Exception -> 0x020a }
            r6.set(r7, r5)     // Catch:{ Exception -> 0x020a }
            goto L_0x022a
        L_0x020a:
            java.lang.String r6 = r4.f315489d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "fail to reset editView cursor style: "
            r7.append(r8)
            android.widget.EditText r4 = r4.f315496n
            r7.append(r4)
            java.lang.String r4 = ", "
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r4)
        L_0x022a:
            com.tencent.mm.plugin.recordvideo.ui.editor.audio.EditorAudioSelectFinderVideoView r0 = r22.getSelectFinderVideoPanel()
            r0.mo151520f(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView.m142568q(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, int, java.lang.Object):void");
    }

    /* access modifiers changed from: private */
    public final void setShowAudioPanel(boolean z) {
        if (z) {
            View view = this.f315539i;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "setShowAudioPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "setShowAudioPanel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f315539i.animate().cancel();
            this.f315539i.animate().translationY(0.0f).start();
            return;
        }
        this.f315539i.animate().cancel();
        this.f315539i.animate().translationY((float) this.f315539i.getHeight()).withEndAction(new C42805u(this)).start();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: jh2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: jh2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: jh2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: jh2.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m142569v(com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView r13, java.lang.String r14, java.util.ArrayList r15, long r16, long r18, boolean r20, fh2.C107541d r21, boolean r22, int r23, java.lang.Object r24) {
        /*
            r0 = r13
            r3 = r14
            r1 = r23 & 2
            if (r1 == 0) goto L_0x000c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r15
        L_0x000d:
            r2 = r23 & 16
            r9 = 0
            if (r2 == 0) goto L_0x0014
            r2 = 0
            goto L_0x0016
        L_0x0014:
            r2 = r20
        L_0x0016:
            r4 = r23 & 32
            if (r4 == 0) goto L_0x0021
            fh2.d r4 = new fh2.d
            r4.<init>()
            r10 = r4
            goto L_0x0023
        L_0x0021:
            r10 = r21
        L_0x0023:
            r4 = r23 & 64
            if (r4 == 0) goto L_0x0029
            r11 = 0
            goto L_0x002b
        L_0x0029:
            r11 = r22
        L_0x002b:
            r13.getClass()
            java.lang.String r4 = "videoPath"
            gy3.C87412m.m108594g(r14, r4)
            java.lang.String r4 = "imageList"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "config"
            gy3.C87412m.m108594g(r10, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "setup  "
            r4.append(r5)
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.EditorAudioView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r2 == 0) goto L_0x0059
            r10.f321751d = r9
        L_0x0059:
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioSearchView r2 = r0.f315552x
            fh2.l r4 = r10.f321753f
            int r4 = r4.ordinal()
            r2.setScene(r4)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            if (r2 != 0) goto L_0x007e
            jh2.i r12 = new jh2.i
            jp3.c<jp3.a> r2 = r0.f315544p0
            fh2.l r1 = r10.f321753f
            int r8 = r1.ordinal()
            r1 = r12
            r3 = r14
            r4 = r16
            r6 = r18
            r1.<init>(r2, r3, r4, r6, r8)
            goto L_0x008b
        L_0x007e:
            jh2.h r12 = new jh2.h
            jp3.c<jp3.a> r2 = r0.f315544p0
            fh2.l r3 = r10.f321753f
            int r3 = r3.ordinal()
            r12.<init>(r2, r1, r3)
        L_0x008b:
            r0.f315526J = r12
            if (r11 == 0) goto L_0x0092
            r1 = 0
            r0.f315526J = r1
        L_0x0092:
            jh2.b r1 = r0.f315526J
            if (r1 != 0) goto L_0x0097
            goto L_0x009e
        L_0x0097:
            yh2.h r2 = new yh2.h
            r2.<init>(r13)
            r1.f173390n = r2
        L_0x009e:
            jh2.b r1 = r0.f315526J
            r2 = 1
            if (r1 != 0) goto L_0x00a4
            goto L_0x00b9
        L_0x00a4:
            boolean r3 = r10.f321748a
            if (r3 == 0) goto L_0x00b6
            gh2.a r3 = gh2.C98116a.f287596b
            java.lang.Object r3 = r3.mo138761d()
            gh2.a$a r3 = (gh2.C98116a.C98117a) r3
            boolean r3 = r3.f287604h
            if (r3 == 0) goto L_0x00b6
            r3 = 1
            goto L_0x00b7
        L_0x00b6:
            r3 = 0
        L_0x00b7:
            r1.f173386j = r3
        L_0x00b9:
            jh2.b r1 = r0.f315526J
            if (r1 == 0) goto L_0x00c6
            jh2.b$a r1 = r1.f173389m
            android.os.Message r1 = r1.obtainMessage(r9)
            r1.sendToTarget()
        L_0x00c6:
            r13.mo151392j(r10)
            r13.mo151391i(r10)
            boolean r1 = r0.f315527K
            if (r1 != 0) goto L_0x0122
            xh2.a r1 = r0.f315524H
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.mo163964O4(r4)
            java.util.LinkedList<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> r1 = r0.f315529M
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0100
            r13.mo151381A(r9)
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo
            r1.<init>()
            r2 = 4
            r1.f163820o = r2
            java.util.List r1 = sx3.C26236u.m33719b(r1)
            xh2.a r2 = r0.f315524H
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo163964O4(r3)
            xh2.a r2 = r0.f315524H
            r2.mo163965g5(r1)
            goto L_0x0122
        L_0x0100:
            r13.mo151381A(r2)
            xh2.a r1 = r0.f315524H
            java.util.LinkedList<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> r2 = r0.f315529M
            r1.mo163965g5(r2)
            xh2.a r1 = r0.f315524H
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1.mo163964O4(r2)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$i r1 = r0.f315537V
            if (r1 == 0) goto L_0x0122
            java.util.LinkedList<com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo> r2 = r0.f315529M
            java.lang.Object r2 = r2.getFirst()
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r2 = (com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo) r2
            r1.mo151424c(r2)
        L_0x0122:
            r13.mo151414z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorAudioView.m142569v(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView, java.lang.String, java.util.ArrayList, long, long, boolean, fh2.d, boolean, int, java.lang.Object):void");
    }

    /* renamed from: A */
    public final void mo151381A(boolean z) {
        if (!z) {
            this.f315542o.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.ui_rescoures_checkbox_unselected, -1));
            mo151410t(this.f315546r, C0966R.C0970id.f5651kx, C0966R.string.f7513id);
        } else {
            this.f315542o.setImageDrawable(C74933u4.m89768e(getContext(), this.f315520D, this.f315521E));
            mo151410t(this.f315546r, C0966R.C0970id.f5651kx, C0966R.string.f7514ie);
        }
        this.f315532Q = z;
    }

    /* renamed from: a */
    public boolean mo70458a(int i) {
        View view = this.f315539i;
        if (view.getPaddingBottom() == i) {
            return true;
        }
        view.post(new C42804l(view, i));
        return true;
    }

    /* renamed from: g */
    public final void mo151382g(List<? extends C64839xt2> list) {
        C87412m.m108594g(list, "audioList");
        ArrayList arrayList = new ArrayList(this.f315529M);
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                AudioCacheInfo a = AudioCacheInfo.f163811A.mo80747a((C64839xt2) next, 1);
                a.f163821p = 3;
                a.f163828w = i;
                a.f163829x = getMusicRequestId();
                arrayList.add(a);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        this.f315524H.mo163965g5(arrayList);
        if (this.f315536U && arrayList.size() > 0) {
            RecyclerView recyclerView = this.f315540j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioList", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "addAudioList", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
            mo151399r(0, false);
        }
    }

    public final ArrayList<AudioCacheInfo> getAllAudioCacheInfo() {
        return this.f315524H.f335823d;
    }

    public final C106012i getCallback() {
        return this.f315537V;
    }

    public final long getMusicRequestId() {
        C60856b bVar = this.f315526J;
        if (bVar != null) {
            return bVar.f173382f;
        }
        return -1;
    }

    public final boolean getMuteOrigin() {
        return this.f315531P;
    }

    public final boolean getMuteOriginDefault() {
        return this.f315530N;
    }

    public final boolean getShouldShowSelectFinderVideoRedDot() {
        C8534c cVar = this.f315522F;
        cVar.getClass();
        C13604l<Integer, Integer> yw = ((C58676k) C86312j.m106911c(C58676k.class)).mo83553yw();
        int intValue = ((Number) yw.f38555d).intValue();
        int intValue2 = ((Number) yw.f38556e).intValue();
        if (!cVar.f27590b || ((MultiProcessMMKV) ((C36570n) cVar.f27589a).getValue()).decodeBool("enter_select_finder_video_panel", false) || ((MultiProcessMMKV) ((C36570n) cVar.f27589a).getValue()).decodeInt("enter_editor_audio_panel_count", 0) >= 3) {
            return false;
        }
        return intValue > 0 || intValue2 > 0;
    }

    public final boolean getWithMusic() {
        return this.f315532Q;
    }

    /* renamed from: h */
    public final void mo151390h() {
        boolean z;
        EditorAudioSearchView editorAudioSearchView = this.f315552x;
        boolean z2 = true;
        if (editorAudioSearchView.getVisibility() == 0) {
            EditText editText = editorAudioSearchView.f315496n;
            if (Util.isNullOrNil((CharSequence) editText != null ? editText.getText() : null)) {
                editorAudioSearchView.mo151357b();
            } else {
                editorAudioSearchView.mo151361f();
                C108745d.C108746a aVar = C108745d.f325632h;
                C108745d.f325634j.f310340e = 1;
                aVar.mo159769a();
                editorAudioSearchView.mo151362g();
                EditorAudioSearchView.C105997a aVar2 = editorAudioSearchView.f315484C;
                if (aVar2 != null) {
                    aVar2.mo151376d();
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            EditorAudioSelectFinderVideoView selectFinderVideoPanel = getSelectFinderVideoPanel();
            if (selectFinderVideoPanel.getVisibility() == 0) {
                EditorAudioSelectFinderVideoView.C106054a aVar3 = selectFinderVideoPanel.f315697p;
                if (aVar3 != null) {
                    aVar3.mo151527c();
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                setShow(false);
            }
        }
    }

    /* renamed from: i */
    public final void mo151391i(C107541d dVar) {
        boolean z = dVar.f321750c;
        this.f315530N = z;
        this.f315531P = z;
        if (dVar.f321751d) {
            View view = this.f315545q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkMuteOrigin", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkMuteOrigin", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f315531P) {
                this.f315541n.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.ui_rescoures_checkbox_unselected, -1));
                mo151410t(this.f315545q, C0966R.C0970id.f5652ky, C0966R.string.f7513id);
                return;
            }
            this.f315541n.setImageDrawable(C74933u4.m89768e(getContext(), this.f315520D, this.f315521E));
            mo151410t(this.f315545q, C0966R.C0970id.f5652ky, C0966R.string.f7514ie);
            return;
        }
        View view3 = this.f315545q;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkMuteOrigin", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkMuteOrigin", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: j */
    public final void mo151392j(C107541d dVar) {
        boolean z = dVar.f321749b && ((C98116a.C98117a) C98116a.f287596b.mo138761d()).f287602f;
        this.f315528L = z;
        if (z) {
            View view = this.f315547s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkShowLyrics", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkShowLyrics", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f315547s;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkShowLyrics", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "checkShowLyrics", "(Lcom/tencent/mm/plugin/recordvideo/config/EditorConfig;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: k */
    public final void mo151393k() {
        Log.m105924i("MicroMsg.EditorAudioView", "destroy");
        this.f315534S = true;
        this.f315544p0.dead();
        this.f315552x.mo151362g();
        getSelectFinderVideoPanel().mo151519e();
        C60856b bVar = this.f315526J;
        if (bVar != null) {
            bVar.f173385i = true;
        }
        if (bVar != null) {
            bVar.f173390n = null;
        }
    }

    /* renamed from: l */
    public final void mo151394l(boolean z) {
        this.f315522F.f27590b = z;
        View selectFinderVideoBtn = getSelectFinderVideoBtn();
        int i = 8;
        int i2 = z ? 0 : 8;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        View view = selectFinderVideoBtn;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "enableSelectFinderVideo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        selectFinderVideoBtn.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "enableSelectFinderVideo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ImageView favFinderVideoRedDot = getFavFinderVideoRedDot();
        if (getShouldShowSelectFinderVideoRedDot()) {
            i = 0;
        }
        favFinderVideoRedDot.setVisibility(i);
    }

    /* renamed from: m */
    public boolean mo151395m() {
        if (getVisibility() == 0) {
            return true;
        }
        if (this.f315552x.getVisibility() == 0) {
            return true;
        }
        return getSelectFinderVideoPanel().getVisibility() == 0;
    }

    /* renamed from: n */
    public final boolean mo151396n() {
        return getFavFinderVideoRedDot().getVisibility() == 0;
    }

    /* renamed from: o */
    public final boolean mo151397o() {
        return getSelectFinderVideoPanel().getVisibility() == 0;
    }

    /* renamed from: p */
    public final void mo151398p() {
        Log.m105924i("MicroMsg.EditorAudioView", "reset");
        this.f315544p0.dead();
        this.f315544p0 = new C46566c<>();
        boolean z = this.f315530N;
        this.f315531P = z;
        if (z) {
            this.f315541n.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.ui_rescoures_checkbox_unselected, -1));
            mo151410t(this.f315545q, C0966R.C0970id.f5652ky, C0966R.string.f7513id);
        } else {
            this.f315541n.setImageDrawable(C74933u4.m89768e(getContext(), this.f315520D, this.f315521E));
            mo151410t(this.f315545q, C0966R.C0970id.f5652ky, C0966R.string.f7514ie);
        }
        this.f315532Q = false;
        this.f315533R = false;
        this.f315542o.setImageDrawable(C74933u4.m89768e(getContext(), this.f315520D, this.f315521E));
        mo151410t(this.f315546r, C0966R.C0970id.f5651kx, C0966R.string.f7514ie);
        this.f315543p.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.ui_rescoures_checkbox_unselected, -1));
        mo151410t(this.f315547s, C0966R.C0970id.f5650kw, C0966R.string.f7513id);
        View view = this.f315545q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f315546r;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f315528L) {
            View view5 = this.f315547s;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view6 = this.f315547s;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f315552x.mo151362g();
        C60856b bVar = this.f315526J;
        if (bVar != null) {
            bVar.f173385i = true;
        }
        this.f315527K = false;
        this.f315529M.clear();
        this.f315536U = true;
    }

    /* renamed from: r */
    public final void mo151399r(int i, boolean z) {
        if (z || this.f315524H.f335824e != i) {
            this.f315525I = i;
            AudioCacheInfo F4 = this.f315524H.mo163962F4(i);
            int i2 = 4;
            boolean z2 = true;
            if (!(F4 != null && F4.f163820o == 4)) {
                if (F4 != null && F4.f163820o == 2) {
                    this.f315524H.mo163964O4((Integer) null);
                    C106012i iVar = this.f315537V;
                    if (iVar != null) {
                        iVar.mo151424c(F4);
                    }
                    mo151411w(true);
                    setShowAudioPanel(false);
                    return;
                }
                this.f315524H.mo163964O4(Integer.valueOf(i));
                C106012i iVar2 = this.f315537V;
                if (iVar2 != null) {
                    iVar2.mo151424c(F4);
                }
                mo151381A(true);
                if (F4 == null || !F4.f163823r) {
                    z2 = false;
                }
                if (this.f315528L) {
                    View view = this.f315547s;
                    if (z2) {
                        i2 = 0;
                    }
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i2));
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "selectItem", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView", "selectItem", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (this.f315533R) {
                    List<C49044cs2> lyricsItemInfos = getLyricsItemInfos();
                    C106012i iVar3 = this.f315537V;
                    if (iVar3 != null) {
                        iVar3.mo151427f(z2, lyricsItemInfos);
                    }
                }
            }
        }
    }

    public final void setBackground(int i) {
        this.f315539i.setBackgroundResource(i);
    }

    public final void setCallback(C106012i iVar) {
        this.f315537V = iVar;
    }

    public final void setLocalAudioList(List<AudioCacheInfo> list) {
        C87412m.m108594g(list, "audioList");
        this.f315529M.clear();
        this.f315529M.addAll(list);
    }

    public final void setMusicPlayer(C23023u uVar) {
        C87412m.m108594g(uVar, "player");
    }

    public final void setMuteOrigin(boolean z) {
        this.f315531P = z;
    }

    public final void setMuteOriginDefault(boolean z) {
        this.f315530N = z;
    }

    public void setOnVisibleChangeCallback(C32226l<? super Boolean, C13598b0> lVar) {
        this.f315538W = lVar;
    }

    public final void setPlayMusicWhenSearchFinish(boolean z) {
        this.f315535T = z;
    }

    public void setShow(boolean z) {
        if (z) {
            C8534c cVar = this.f315522F;
            if (cVar.f27590b) {
                ((MultiProcessMMKV) ((C36570n) cVar.f27589a).getValue()).encode("enter_editor_audio_panel_count", ((MultiProcessMMKV) ((C36570n) cVar.f27589a).getValue()).decodeInt("enter_editor_audio_panel_count", 0) + 1);
            }
            setVisibility(0);
            C32226l<? super Boolean, C13598b0> lVar = this.f315538W;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            this.f315539i.animate().cancel();
            this.f315539i.animate().translationY(0.0f).start();
            int i = C60287a.f171906a;
            MMHandler workerHandler = C86709a0.m107525e().getWorkerHandler();
            C87412m.m108593f(workerHandler, "getPizzaWorkerThread().workerHandler");
            workerHandler.post(new C106021s(this));
            return;
        }
        C32226l<? super Boolean, C13598b0> lVar2 = this.f315538W;
        if (lVar2 != null) {
            lVar2.invoke(Boolean.FALSE);
        }
        this.f315539i.animate().cancel();
        this.f315539i.animate().translationY((float) this.f315539i.getHeight()).withEndAction(new C106022t(this)).start();
    }

    public final void setWithMusic(boolean z) {
        this.f315532Q = z;
    }

    /* renamed from: t */
    public final void mo151410t(View view, int i, int i2) {
        C87412m.m108594g(view, "view");
        view.setTag(i, C76577a.m92166q(getContext(), i2));
    }

    /* renamed from: w */
    public final void mo151411w(boolean z) {
        if (z) {
            this.f315536U = false;
            this.f315552x.setShow(true);
            return;
        }
        this.f315552x.setShow(false);
    }

    /* renamed from: x */
    public final void mo151412x(boolean z) {
        this.f315533R = z;
        List<C49044cs2> lyricsItemInfos = getLyricsItemInfos();
        if (z) {
            this.f315543p.setImageDrawable(C74933u4.m89768e(getContext(), this.f315520D, this.f315521E));
            mo151410t(this.f315547s, C0966R.C0970id.f5650kw, C0966R.string.f7514ie);
            C106012i iVar = this.f315537V;
            if (iVar != null) {
                iVar.mo151427f(true, lyricsItemInfos);
            }
            mo151381A(true);
            mo151399r(this.f315525I, false);
        } else {
            this.f315543p.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.ui_rescoures_checkbox_unselected, -1));
            mo151410t(this.f315547s, C0966R.C0970id.f5650kw, C0966R.string.f7513id);
            C106012i iVar2 = this.f315537V;
            if (iVar2 != null) {
                iVar2.mo151427f(false, lyricsItemInfos);
            }
        }
        this.f315547s.setTag(C0966R.C0970id.d59, Boolean.valueOf(z));
    }

    /* renamed from: y */
    public final void mo151413y() {
        mo151381A(!this.f315532Q);
        if (!this.f315532Q) {
            C106012i iVar = this.f315537V;
            if (iVar != null) {
                iVar.mo151424c((AudioCacheInfo) null);
            }
            this.f315524H.mo163964O4((Integer) null);
            this.f315552x.setSelection((Integer) null);
            C108745d.C108746a aVar = C108745d.f325632h;
            C108745d dVar = C108745d.f325633i;
            if (dVar != null) {
                dVar.f325639e = false;
                C110975wt2 wt22 = new C110975wt2();
                wt22.f332321d = dVar.f325636b;
                wt22.f332322e = 8;
                wt22.f332324g = (int) Util.nowSecond();
                dVar.f325641g.add(wt22);
                Log.m105924i("MicroMsg.AudioReporter", "record no bgm " + C108747e.m147548a(wt22));
            }
            this.f315533R = false;
            this.f315543p.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.ui_rescoures_checkbox_unselected, -1));
            mo151410t(this.f315547s, C0966R.C0970id.f5650kw, C0966R.string.f7513id);
        } else {
            int i = this.f315525I;
            if (i != -1) {
                mo151399r(i, false);
            } else {
                EditorAudioSearchView editorAudioSearchView = this.f315552x;
                editorAudioSearchView.mo151365h(editorAudioSearchView.f315506x);
            }
        }
        this.f315546r.setTag(C0966R.C0970id.d59, Boolean.valueOf(this.f315532Q));
    }

    /* renamed from: z */
    public final void mo151414z() {
        int childCount = this.f315554y.getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = this.f315554y.getChildAt(childCount);
                if (childCount != 0 && childAt.getVisibility() == 0 && (childAt instanceof LinearLayout)) {
                    ((LinearLayout) childAt).setGravity(8388613);
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorAudioView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
