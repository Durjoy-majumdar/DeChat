package com.tencent.p014mm.plugin.emojicapture.p841ui.capture;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import b71.C92189a;
import b71.C92191c;
import b71.C92195g;
import b71.C92200j;
import b71.C92205k;
import b71.C92207m;
import b71.C92208n;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.layout.StickerLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import f71.C97830a;
import f71.C97836b;
import fy3.C32226l;
import fy3.C32227p;
import g71.C75892i;
import g71.C98086g;
import g71.C98087h;
import g71.C98088j;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import jp3.C9486a;
import jp3.C9487b;
import k20.C60958c;
import k20.C9556a;
import k71.C60981c;
import k71.C9564b;
import kotlin.Metadata;
import rh3.C101380d;
import rh3.C101383g;
import rx3.C13598b0;
import sh3.C101624e;
import sh3.C101630j;
import te3.C101814mn2;
import th3.C101893b;
import th3.C101895c;
import u60.C65220d;
import u60.C65231j;
import u60.C65234n;
import vh3.C102193e;
import vh3.C102196g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\t\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0016R:\u0010\u0013\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView;", "Landroid/widget/RelativeLayout;", "", "", "show", "Lrx3/b0;", "setShow", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "Lkotlin/Function2;", "Lrh3/g;", "Lte3/mn2;", "i", "Lfy3/p;", "getSelectionCallback", "()Lfy3/p;", "setSelectionCallback", "(Lfy3/p;)V", "selectionCallback", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "j", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "reporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView */
public final class EditorStickerView extends RelativeLayout {

    /* renamed from: d */
    public final String f269267d;

    /* renamed from: e */
    public final StickerSelectFrame f269268e;

    /* renamed from: f */
    public final RecyclerView f269269f;

    /* renamed from: g */
    public final C97836b f269270g;

    /* renamed from: h */
    public int f269271h;

    /* renamed from: i */
    public C32227p<? super C101383g, ? super C101814mn2, C13598b0> f269272i;

    /* renamed from: j */
    public EmojiCaptureReporter f269273j;

    /* renamed from: n */
    public final C92200j f269274n;

    /* renamed from: o */
    public final C92208n f269275o;

    /* renamed from: p */
    public final C92189a f269276p;

    /* renamed from: q */
    public MoreStickerView f269277q;

    /* renamed from: r */
    public C104428a f269278r;

    /* renamed from: s */
    public C101814mn2 f269279s;

    /* renamed from: t */
    public String f269280t;

    /* renamed from: u */
    public C101814mn2 f269281u;

    /* renamed from: v */
    public final C93320e f269282v;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$d */
    public static final class C68874d extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ EditorStickerView f197887d;

        public C68874d(EditorStickerView editorStickerView) {
            this.f197887d = editorStickerView;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            if (i == 0) {
                EditorStickerView.m117836a(this.f197887d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            super.onScrolled(recyclerView, i, i2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$4", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$a */
    public static final class C93315a implements C60981c.C60982a {

        /* renamed from: a */
        public final /* synthetic */ EditorStickerView f269283a;

        public C93315a(EditorStickerView editorStickerView) {
            this.f269283a = editorStickerView;
        }

        public void onPageSelected(int i) {
            String str = this.f269283a.f269267d;
            Log.m105924i(str, "onPageSelected: " + i);
            EditorStickerView.m117837b(this.f269283a, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$b */
    public static final class C93316b extends C87413o implements C32227p<Integer, C101380d, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ EditorStickerView f269284d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C93316b(EditorStickerView editorStickerView) {
            super(2);
            this.f269284d = editorStickerView;
        }

        public Object invoke(Object obj, Object obj2) {
            Window window;
            Window window2;
            int intValue = ((Number) obj).intValue();
            C101380d dVar = (C101380d) obj2;
            C87412m.m108594g(dVar, "info");
            if (intValue >= 0 && intValue < this.f269284d.f269270g.getItemCount()) {
                if (C87412m.m108589b(dVar.f296960a, C92200j.f263889r)) {
                    EditorStickerView editorStickerView = this.f269284d;
                    EmojiCaptureReporter emojiCaptureReporter = editorStickerView.f269273j;
                    if (emojiCaptureReporter != null) {
                        emojiCaptureReporter.mo127935e(25);
                    }
                    if (editorStickerView.f269278r == null) {
                        editorStickerView.f269274n.mo126165b();
                        editorStickerView.f269278r = new C104428a(editorStickerView.getContext(), 0);
                        Context context = editorStickerView.getContext();
                        C87412m.m108593f(context, "context");
                        MoreStickerView moreStickerView = new MoreStickerView(context, (AttributeSet) null);
                        editorStickerView.f269277q = moreStickerView;
                        moreStickerView.setReporter(editorStickerView.f269273j);
                        MoreStickerView moreStickerView2 = editorStickerView.f269277q;
                        if (moreStickerView2 != null) {
                            moreStickerView2.setBackgroundResource(C0966R.C0969drawable.emoji_capture_sticker_panel_bg);
                        }
                        float dimension = editorStickerView.getResources().getDimension(C0966R.dimen.a3d) + editorStickerView.getResources().getDimension(C0966R.dimen.ajp) + editorStickerView.getResources().getDimension(C0966R.dimen.a3f);
                        ViewParent parent = editorStickerView.getParent();
                        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, ((ViewGroup) parent).getHeight() - ((int) dimension));
                        C104428a aVar = editorStickerView.f269278r;
                        if (aVar != null) {
                            MoreStickerView moreStickerView3 = editorStickerView.f269277q;
                            C87412m.m108591d(moreStickerView3);
                            aVar.setContentView(moreStickerView3, marginLayoutParams);
                        }
                        C104428a aVar2 = editorStickerView.f269278r;
                        if (!(aVar2 == null || (window2 = aVar2.getWindow()) == null)) {
                            window2.clearFlags(2);
                        }
                        C104428a aVar3 = editorStickerView.f269278r;
                        if (!(aVar3 == null || (window = aVar3.getWindow()) == null)) {
                            window.addFlags(1024);
                        }
                        C104428a aVar4 = editorStickerView.f269278r;
                        if (aVar4 != null) {
                            aVar4.setOnDismissListener(new C98086g(editorStickerView));
                        }
                        C92189a aVar5 = editorStickerView.f269276p;
                        MoreStickerView moreStickerView4 = editorStickerView.f269277q;
                        C92191c dataCallback = moreStickerView4 != null ? moreStickerView4.getDataCallback() : null;
                        aVar5.f263859a = dataCallback;
                        if (dataCallback != null) {
                            dataCallback.mo126157c(aVar5.f263860b);
                        }
                        if (dataCallback != null) {
                            dataCallback.mo126159e(0, aVar5.f263860b.size());
                        }
                        MoreStickerView moreStickerView5 = editorStickerView.f269277q;
                        if (moreStickerView5 != null) {
                            moreStickerView5.setSelectionCallback(new C98087h(editorStickerView));
                        }
                        MoreStickerView moreStickerView6 = editorStickerView.f269277q;
                        if (moreStickerView6 != null) {
                            moreStickerView6.setCloseCallback(new C75892i(editorStickerView));
                        }
                        MoreStickerView moreStickerView7 = editorStickerView.f269277q;
                        if (moreStickerView7 != null) {
                            moreStickerView7.setLoadMoreCallback(new C98088j(editorStickerView));
                        }
                    }
                    C104428a aVar6 = editorStickerView.f269278r;
                    if (aVar6 != null) {
                        aVar6.show();
                    }
                    MoreStickerView moreStickerView8 = editorStickerView.f269277q;
                    if (moreStickerView8 != null) {
                        moreStickerView8.mo128082r();
                    }
                    MoreStickerView moreStickerView9 = editorStickerView.f269277q;
                    if (moreStickerView9 != null) {
                        if (!C87412m.m108589b(moreStickerView9.f269293B, editorStickerView.f269280t)) {
                            C97830a aVar7 = moreStickerView9.f269303y;
                            int i = aVar7.f286976e;
                            if (i != -1) {
                                aVar7.notifyItemChanged(i);
                                aVar7.f286976e = -1;
                                aVar7.notifyItemChanged(-1);
                            }
                            C32226l<? super C101380d, C13598b0> lVar = moreStickerView9.f269297F;
                            if (lVar != null) {
                                lVar.invoke(null);
                            }
                        }
                    }
                } else {
                    RecyclerView recyclerView = this.f269284d.f269269f;
                    C9556a aVar8 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar8.mo10233c(Integer.valueOf(intValue));
                    RecyclerView recyclerView2 = recyclerView;
                    C117292a.m165358d(recyclerView2, aVar8.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$2", "invoke", "(ILcom/tencent/mm/sticker/LensItem;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.mo17149t1(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$2", "invoke", "(ILcom/tencent/mm/sticker/LensItem;)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$c */
    public static final class C93317c implements C92207m {

        /* renamed from: a */
        public final /* synthetic */ EditorStickerView f269285a;

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$c$a */
        public static final class C93318a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ EditorStickerView f269286d;

            /* renamed from: e */
            public final /* synthetic */ int f269287e;

            /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$c$a$a */
            public static final class C93319a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ EditorStickerView f269288d;

                public C93319a(EditorStickerView editorStickerView) {
                    this.f269288d = editorStickerView;
                }

                public final void run() {
                    EditorStickerView.m117836a(this.f269288d);
                }
            }

            public C93318a(EditorStickerView editorStickerView, int i) {
                this.f269286d = editorStickerView;
                this.f269287e = i;
            }

            public final void run() {
                RecyclerView recyclerView = this.f269286d.f269269f;
                int i = this.f269287e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$3$updateSelection$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView$3$updateSelection$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                EditorStickerView.m117837b(this.f269286d, this.f269287e);
                EditorStickerView editorStickerView = this.f269286d;
                editorStickerView.f269269f.post(new C93319a(editorStickerView));
            }
        }

        public C93317c(EditorStickerView editorStickerView) {
            this.f269285a = editorStickerView;
        }

        /* renamed from: a */
        public void mo126171a(int i) {
            String str = this.f269285a.f269267d;
            Log.m105924i(str, "updateSelection, " + i);
            EditorStickerView editorStickerView = this.f269285a;
            editorStickerView.f269269f.post(new C93318a(editorStickerView, i));
        }

        /* renamed from: c */
        public void mo126172c(List<C101380d> list) {
            C87412m.m108594g(list, "lensList");
            String str = this.f269285a.f269267d;
            Log.m105924i(str, "update: " + list.size());
            if (!list.isEmpty()) {
                this.f269285a.f269269f.setVisibility(0);
                this.f269285a.f269268e.setVisibility(0);
            } else {
                this.f269285a.f269269f.setVisibility(8);
                this.f269285a.f269268e.setVisibility(8);
                EditorStickerView editorStickerView = this.f269285a;
                editorStickerView.f269271h = -1;
                C32227p<C101383g, C101814mn2, C13598b0> selectionCallback = editorStickerView.getSelectionCallback();
                if (selectionCallback != null) {
                    selectionCallback.invoke(null, null);
                }
            }
            C97836b bVar = this.f269285a.f269270g;
            bVar.getClass();
            Log.m105924i("MicroMsg.StickerAdapter", "update: " + list.size());
            bVar.f286984d.clear();
            bVar.f286984d.addAll(list);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$e */
    public static final class C93320e implements C65231j<C101630j> {

        /* renamed from: a */
        public final /* synthetic */ EditorStickerView f269289a;

        public C93320e(EditorStickerView editorStickerView) {
            this.f269289a = editorStickerView;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C101630j jVar = (C101630j) dVar;
            C87412m.m108594g(jVar, "task");
            C87412m.m108594g(nVar, "status");
            if (C87412m.m108589b(jVar.f297495f.f284101e, this.f269289a.f269280t)) {
                String str = this.f269289a.f269267d;
                Log.m105924i(str, "onLoaderFin: " + nVar);
                this.f269289a.mo128067c(nVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView$f */
    public static final class C93321f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EditorStickerView f269290d;

        public C93321f(EditorStickerView editorStickerView) {
            this.f269290d = editorStickerView;
        }

        public final void run() {
            this.f269290d.setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorStickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269267d = "MicroMsg.EditorStickerView";
        this.f269271h = -1;
        C92189a aVar = new C92189a();
        this.f269276p = aVar;
        this.f269282v = new C93320e(this);
        View.inflate(context, C0966R.C0971layout.a1b, this);
        setLayerType(1, (Paint) null);
        View findViewById = findViewById(C0966R.C0970id.cev);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_…ure_sticker_select_frame)");
        StickerSelectFrame stickerSelectFrame = (StickerSelectFrame) findViewById;
        this.f269268e = stickerSelectFrame;
        stickerSelectFrame.setSelected(true);
        stickerSelectFrame.setVisibility(8);
        View findViewById2 = findViewById(C0966R.C0970id.ceu);
        C87412m.m108593f(findViewById2, "findViewById(R.id.emoji_capture_sticker_recycler)");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f269269f = recyclerView;
        recyclerView.setVisibility(8);
        recyclerView.setLayoutManager(new StickerLayoutManager(context, 0));
        C97836b bVar = new C97836b();
        this.f269270g = bVar;
        C60981c cVar = new C60981c();
        cVar.mo75025b(recyclerView);
        cVar.f173686i = new C93315a(this);
        recyclerView.setAdapter(bVar);
        recyclerView.setItemAnimator((RecyclerView.C16616j) null);
        recyclerView.setFocusable(false);
        bVar.f286985e = new C93316b(this);
        recyclerView.mo17085h0(new C9564b(context));
        C92208n nVar = new C92208n(new C93317c(this), bVar);
        this.f269275o = nVar;
        this.f269274n = new C92200j((MMActivity) context, new C92195g(nVar, aVar));
        recyclerView.mo17043c(new C68874d(this));
    }

    /* renamed from: a */
    public static final void m117836a(EditorStickerView editorStickerView) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        int childCount = editorStickerView.f269269f.getChildCount();
        boolean z = true;
        for (int i = 0; i < childCount; i++) {
            C101380d F4 = editorStickerView.f269270g.mo137167F4(editorStickerView.f269269f.mo17029N0(editorStickerView.f269269f.getChildAt(i)));
            if (F4 != null && !Util.isNullOrNil(F4.f296960a.f298862d)) {
                if (!z) {
                    sb.append("#");
                    sb4.append("#");
                }
                sb.append(F4.f296960a.f298862d);
                sb4.append(F4.f296960a.f298864f);
                z = false;
            }
        }
        EmojiCaptureReporter emojiCaptureReporter = editorStickerView.f269273j;
        if (emojiCaptureReporter != null) {
            emojiCaptureReporter.mo127933a(sb.toString(), sb4.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r2 = r0.f296960a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m117837b(com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView r5, int r6) {
        /*
            java.lang.String r0 = r5.f269267d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "selectItem: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            f71.b r0 = r5.f269270g
            rh3.d r0 = r0.mo137167F4(r6)
            f71.b r1 = r5.f269270g
            r1.getClass()
            r1 = 0
            if (r0 == 0) goto L_0x002c
            te3.mn2 r2 = r0.f296960a
            if (r2 == 0) goto L_0x002c
            java.lang.String r2 = r2.f298862d
            goto L_0x002d
        L_0x002c:
            r2 = r1
        L_0x002d:
            r5.f269280t = r2
            com.tencent.mm.plugin.emojicapture.ui.capture.StickerSelectFrame r3 = r5.f269268e
            r3.mo128089a(r2)
            if (r0 == 0) goto L_0x0052
            b71.j$a r2 = b71.C92200j.f263887p
            te3.mn2 r3 = r0.f296960a
            boolean r2 = r2.mo126169a(r3)
            if (r2 == 0) goto L_0x0052
            te3.mn2 r2 = r0.f296960a
            r5.f269279s = r2
            sh3.e r3 = sh3.C101624e.f297484a
            u60.n r2 = r3.mo141086c(r2)
            u60.n r3 = u60.C65234n.OK
            if (r2 != r3) goto L_0x005b
            r5.mo128067c(r2)
            goto L_0x005b
        L_0x0052:
            r5.f269279s = r1
            fy3.p<? super rh3.g, ? super te3.mn2, rx3.b0> r2 = r5.f269272i
            if (r2 == 0) goto L_0x005b
            r2.invoke(r1, r1)
        L_0x005b:
            int r2 = r5.f269271h
            if (r2 == r6) goto L_0x008b
            if (r0 == 0) goto L_0x0067
            te3.mn2 r2 = r0.f296960a
            if (r2 == 0) goto L_0x0067
            java.lang.String r1 = r2.f298862d
        L_0x0067:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x008b
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter r1 = r5.f269273j
            if (r1 == 0) goto L_0x008b
            gy3.C87412m.m108591d(r0)
            te3.mn2 r2 = r0.f296960a
            java.lang.String r3 = r2.f298862d
            java.lang.String r2 = r2.f298864f
            int r4 = r0.f296961b
            int r0 = r0.f296962c
            r1.f269121A = r3
            r1.f269124D = r2
            r1.f269122B = r4
            r1.f269123C = r0
            r0 = 23
            r1.mo127935e(r0)
        L_0x008b:
            r5.f269271h = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView.m117837b(com.tencent.mm.plugin.emojicapture.ui.capture.EditorStickerView, int):void");
    }

    /* renamed from: c */
    public final void mo128067c(C65234n nVar) {
        String str = this.f269267d;
        Log.m105924i(str, "notifyStatus: " + this.f269280t);
        String str2 = this.f269280t;
        if (str2 == null || nVar != C65234n.OK) {
            C32227p<? super C101383g, ? super C101814mn2, C13598b0> pVar = this.f269272i;
            if (pVar != null) {
                pVar.invoke(null, null);
                return;
            }
            return;
        }
        C101624e eVar = C101624e.f297484a;
        C87412m.m108591d(str2);
        String b = eVar.mo141085b(str2);
        C87412m.m108594g(b, "packDir");
        C101383g gVar = new C101383g();
        gVar.f296978c = b;
        gVar.mo140865b(b);
        if (gVar.mo140864a()) {
            if (Util.isNullOrNil(gVar.f296976a)) {
                String str3 = this.f269280t;
                C87412m.m108591d(str3);
                gVar.f296976a = str3;
            }
            C32227p<? super C101383g, ? super C101814mn2, C13598b0> pVar2 = this.f269272i;
            if (pVar2 != null) {
                pVar2.invoke(gVar, this.f269279s);
                return;
            }
            return;
        }
        Log.m105924i(this.f269267d, "onLoaderFin: sticker is not valid");
        C86013q1.m106445f(b);
    }

    public final EmojiCaptureReporter getReporter() {
        return this.f269273j;
    }

    public final C32227p<C101383g, C101814mn2, C13598b0> getSelectionCallback() {
        return this.f269272i;
    }

    public void setOnVisibleChangeCallback(C32226l<? super Boolean, C13598b0> lVar) {
    }

    public final void setReporter(EmojiCaptureReporter emojiCaptureReporter) {
        this.f269273j = emojiCaptureReporter;
    }

    public final void setSelectionCallback(C32227p<? super C101383g, ? super C101814mn2, C13598b0> pVar) {
        this.f269272i = pVar;
    }

    public void setShow(boolean z) {
        boolean z2 = true;
        if (z) {
            C92200j jVar = this.f269274n;
            if (!jVar.f263902i) {
                jVar.f263902i = true;
                jVar.f263905l.clear();
                jVar.mo126167d();
                jVar.mo126168e();
                jVar.mo126166c();
                jVar.mo126165b();
                C101893b bVar = C101893b.f300042a;
                C101893b.f300049h = new C92205k(jVar);
                Log.m105924i("MicroMsg.LensInfoUserCache", "checkHistory: " + C101893b.f300048g);
                if (C101893b.f300048g <= 0) {
                    LinkedList<C101814mn2> linkedList = C101893b.f300047f.f138692d;
                    C87412m.m108593f(linkedList, "historyList.lensInfoList");
                    for (C101814mn2 mn22 : linkedList) {
                        C101893b.f300048g++;
                        Log.m105924i("MicroMsg.LensInfoUserCache", "checkHistory: " + mn22.f298862d);
                        String str = mn22.f298862d;
                        C87412m.m108593f(str, "it.LensId");
                        C101895c cVar = new C101895c(mn22);
                        if (MMApplicationContext.isMainProcess()) {
                            new C102193e((C9487b<C9486a>) null, str, cVar);
                        } else {
                            new C102196g((C9487b<C9486a>) null, str, cVar);
                        }
                    }
                }
            }
            if (getVisibility() == 0) {
                if (getAlpha() != 1.0f) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            setVisibility(0);
            animate().cancel();
            animate().alpha(1.0f).start();
            MoreStickerView moreStickerView = this.f269277q;
            if (moreStickerView != null && !C87412m.m108589b(moreStickerView.f269293B, (Object) null)) {
                C97830a aVar = moreStickerView.f269303y;
                int i = aVar.f286976e;
                if (i != -1) {
                    aVar.notifyItemChanged(i);
                    aVar.f286976e = -1;
                    aVar.notifyItemChanged(-1);
                }
                C32226l<? super C101380d, C13598b0> lVar = moreStickerView.f269297F;
                if (lVar != null) {
                    lVar.invoke(null);
                }
            }
        } else if (getVisibility() == 0) {
            if (getAlpha() != 0.0f) {
                z2 = false;
            }
            if (!z2) {
                animate().cancel();
                animate().alpha(0.0f).withEndAction(new C93321f(this)).start();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EditorStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
