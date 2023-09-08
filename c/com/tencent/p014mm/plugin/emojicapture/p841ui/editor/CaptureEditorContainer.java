package com.tencent.p014mm.plugin.emojicapture.p841ui.editor;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b71.C92190b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.api.SmileyPanel;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiVideoPlayTextureView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EditorChangeTextView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.EditorItemContainer;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import e71.C97607d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h71.C98316a;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import o40.C61926c;
import p248ug.C78158s0;
import p248ug.C78160t0;
import rx3.C13598b0;
import s62.C110768l;
import y61.C102813c;
import y61.C102814d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$B\u001b\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b#\u0010%J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016R$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006&"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer;", "Landroid/widget/RelativeLayout;", "Ly61/d;", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "reporter", "Lrx3/b0;", "setReporter", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView;", "getVideoPlayView", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "getItemContainer", "", "visibility", "setVisibility", "Ly61/c;", "e", "Ly61/c;", "getPresenter", "()Ly61/c;", "setPresenter", "(Ly61/c;)V", "presenter", "", "D", "J", "getStartTick", "()J", "setStartTick", "(J)V", "startTick", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer */
public final class CaptureEditorContainer extends RelativeLayout implements C102814d {

    /* renamed from: A */
    public final Drawable f269319A;

    /* renamed from: B */
    public final Drawable f269320B;

    /* renamed from: C */
    public final Drawable f269321C;

    /* renamed from: D */
    public long f269322D;

    /* renamed from: E */
    public C32224a<C13598b0> f269323E;

    /* renamed from: F */
    public final C93339j f269324F;

    /* renamed from: d */
    public final String f269325d;

    /* renamed from: e */
    public C102813c f269326e;

    /* renamed from: f */
    public EmojiCaptureReporter f269327f;

    /* renamed from: g */
    public final ViewGroup f269328g;

    /* renamed from: h */
    public EmojiVideoPlayTextureView f269329h;

    /* renamed from: i */
    public EditorItemContainer f269330i;

    /* renamed from: j */
    public EditorChangeTextView f269331j;

    /* renamed from: n */
    public View f269332n;

    /* renamed from: o */
    public View f269333o;

    /* renamed from: p */
    public View f269334p;

    /* renamed from: q */
    public View f269335q;

    /* renamed from: r */
    public final ImageView f269336r;

    /* renamed from: s */
    public final ImageView f269337s;

    /* renamed from: t */
    public final ImageView f269338t;

    /* renamed from: u */
    public ImageView f269339u;

    /* renamed from: v */
    public ImageView f269340v;

    /* renamed from: w */
    public final ChatFooterPanel f269341w;

    /* renamed from: x */
    public final Drawable f269342x;

    /* renamed from: y */
    public final Drawable f269343y;

    /* renamed from: z */
    public final Drawable f269344z;

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$a */
    public static final class C93330a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269345d;

        public C93330a(CaptureEditorContainer captureEditorContainer) {
            this.f269345d = captureEditorContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EmojiCaptureReporter emojiCaptureReporter = this.f269345d.f269327f;
            if (emojiCaptureReporter != null) {
                long j = emojiCaptureReporter.f269128d;
                if (emojiCaptureReporter != null) {
                    EmojiCaptureReporter.m117776b(10, j, 0, 0, 0, 0, 0, 0, 0, emojiCaptureReporter.f269127G);
                    CaptureEditorContainer captureEditorContainer = this.f269345d;
                    View view2 = captureEditorContainer.f269333o;
                    C102813c presenter = captureEditorContainer.getPresenter();
                    view2.setSelected(presenter != null ? presenter.mo136700e() : false);
                    CaptureEditorContainer captureEditorContainer2 = this.f269345d;
                    captureEditorContainer2.f269336r.setImageDrawable(captureEditorContainer2.f269333o.isSelected() ? this.f269345d.f269342x : this.f269345d.f269343y);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("reporter");
                throw null;
            }
            C87412m.m108603p("reporter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$b */
    public static final class C93331b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269346d;

        public C93331b(CaptureEditorContainer captureEditorContainer) {
            this.f269346d = captureEditorContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EmojiCaptureReporter emojiCaptureReporter = this.f269346d.f269327f;
            if (emojiCaptureReporter != null) {
                long j = emojiCaptureReporter.f269128d;
                if (emojiCaptureReporter != null) {
                    EmojiCaptureReporter.m117776b(11, j, 0, 0, 0, 0, 0, 0, 0, emojiCaptureReporter.f269127G);
                    CaptureEditorContainer captureEditorContainer = this.f269346d;
                    View view2 = captureEditorContainer.f269334p;
                    C102813c presenter = captureEditorContainer.getPresenter();
                    view2.setSelected(presenter != null ? presenter.mo136701f() : false);
                    CaptureEditorContainer captureEditorContainer2 = this.f269346d;
                    captureEditorContainer2.f269337s.setImageDrawable(captureEditorContainer2.f269334p.isSelected() ? this.f269346d.f269344z : this.f269346d.f269319A);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("reporter");
                throw null;
            }
            C87412m.m108603p("reporter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$c */
    public static final class C93332c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269347d;

        public C93332c(CaptureEditorContainer captureEditorContainer) {
            this.f269347d = captureEditorContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EmojiCaptureReporter emojiCaptureReporter = this.f269347d.f269327f;
            if (emojiCaptureReporter != null) {
                long j = emojiCaptureReporter.f269128d;
                if (emojiCaptureReporter != null) {
                    EmojiCaptureReporter.m117776b(12, j, 0, 0, 0, 0, 0, 0, 0, emojiCaptureReporter.f269127G);
                    CaptureEditorContainer captureEditorContainer = this.f269347d;
                    captureEditorContainer.mo128093b(!captureEditorContainer.mo128098f());
                    C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                C87412m.m108603p("reporter");
                throw null;
            }
            C87412m.m108603p("reporter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$d */
    public static final class C93333d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269348d;

        public C93333d(CaptureEditorContainer captureEditorContainer) {
            this.f269348d = captureEditorContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102813c presenter = this.f269348d.getPresenter();
            if (presenter != null) {
                presenter.mo136696a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$e */
    public static final class C93334e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269349d;

        public C93334e(CaptureEditorContainer captureEditorContainer) {
            this.f269349d = captureEditorContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EmojiCaptureReporter emojiCaptureReporter = this.f269349d.f269327f;
            if (emojiCaptureReporter != null) {
                long currentTimeMillis = System.currentTimeMillis();
                EmojiCaptureReporter emojiCaptureReporter2 = this.f269349d.f269327f;
                if (emojiCaptureReporter2 != null) {
                    emojiCaptureReporter.f269136o = currentTimeMillis - emojiCaptureReporter2.f269131g;
                    if (emojiCaptureReporter2 != null) {
                        C115669n.INSTANCE.mo160131h(15982, 17, Long.valueOf(emojiCaptureReporter2.f269128d), 0, 0, Long.valueOf(emojiCaptureReporter2.f269136o), 0, 0, 0, 0, Integer.valueOf(emojiCaptureReporter2.f269127G), emojiCaptureReporter2.f269121A, Integer.valueOf(emojiCaptureReporter2.f269122B), 0, Integer.valueOf(emojiCaptureReporter2.f269123C), emojiCaptureReporter2.f269124D, Integer.valueOf(emojiCaptureReporter2.f269125E), Integer.valueOf(emojiCaptureReporter2.f269126F));
                        EmojiCaptureReporter.m117777c(3, 1);
                        C102813c presenter = this.f269349d.getPresenter();
                        if (presenter != null) {
                            presenter.mo136699d();
                        }
                        C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    C87412m.m108603p("reporter");
                    throw null;
                }
                C87412m.m108603p("reporter");
                throw null;
            }
            C87412m.m108603p("reporter");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$f */
    public static final class C93335f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269350d;

        public C93335f(CaptureEditorContainer captureEditorContainer) {
            this.f269350d = captureEditorContainer;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f269350d.mo128098f()) {
                this.f269350d.mo128093b(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$g */
    public static final class C93336g implements EditorChangeTextView.C105217h {

        /* renamed from: a */
        public final /* synthetic */ CaptureEditorContainer f269351a;

        public C93336g(CaptureEditorContainer captureEditorContainer) {
            this.f269351a = captureEditorContainer;
        }

        /* renamed from: a */
        public void mo128116a(CharSequence charSequence, int i) {
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj != null && obj.length() > 50) {
                obj = obj.substring(0, 50);
                C87412m.m108593f(obj, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            C102813c presenter = this.f269351a.getPresenter();
            if (presenter != null) {
                presenter.mo136697b(obj, i, true);
            }
            this.f269351a.f269331j.setShow(false);
        }

        public void onCancel() {
            C102813c presenter = this.f269351a.getPresenter();
            if (presenter != null) {
                presenter.mo136697b((String) null, 0, false);
            }
            this.f269351a.f269331j.setShow(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$h */
    public static final class C93337h implements EditorItemContainer.C93342b {

        /* renamed from: a */
        public final /* synthetic */ CaptureEditorContainer f269352a;

        public C93337h(CaptureEditorContainer captureEditorContainer) {
            this.f269352a = captureEditorContainer;
        }

        /* renamed from: a */
        public void mo128118a(boolean z) {
            if (z) {
                View view = this.f269352a.f269332n;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            View view3 = this.f269352a.f269332n;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "onStateChange", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$i */
    public static final class C93338i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269353d;

        public C93338i(CaptureEditorContainer captureEditorContainer) {
            this.f269353d = captureEditorContainer;
        }

        public final void run() {
            this.f269353d.f269341w.setVisibility(8);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$j */
    public static final class C93339j implements C96875r0.C96876a {

        /* renamed from: d */
        public final /* synthetic */ CaptureEditorContainer f269354d;

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer$j$a */
        public static final class C93340a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ CaptureEditorContainer f269355d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C93340a(CaptureEditorContainer captureEditorContainer) {
                super(0);
                this.f269355d = captureEditorContainer;
            }

            public Object invoke() {
                C61926c.m72668M(new C93347a(this.f269355d));
                C32224a<C13598b0> aVar = this.f269355d.f269323E;
                if (aVar != null) {
                    aVar.invoke();
                }
                EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269355d.f269329h;
                if (emojiVideoPlayTextureView != null) {
                    emojiVideoPlayTextureView.setOnDrawCallback((C32224a<C13598b0>) null);
                }
                return C13598b0.f38549a;
            }
        }

        public C93339j(CaptureEditorContainer captureEditorContainer) {
            this.f269354d = captureEditorContainer;
        }

        /* renamed from: M0 */
        public int mo76207M0(int i, int i2) {
            return 0;
        }

        public void onCompletion() {
            String str = this.f269354d.f269325d;
            Log.m105924i(str, "onCompletion cost " + Util.ticksToNow(this.f269354d.getStartTick()) + LocaleUtil.MALAY);
            this.f269354d.setStartTick(Util.currentTicks());
            EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269354d.f269329h;
            if (emojiVideoPlayTextureView != null) {
                emojiVideoPlayTextureView.f269196s = true;
                C110768l lVar = emojiVideoPlayTextureView.f269192o;
                if (lVar != null) {
                    lVar.mo162314i((int) 0.0d, true);
                }
            }
        }

        public void onError(int i, int i2) {
        }

        public void onPrepared() {
            CaptureEditorContainer captureEditorContainer = this.f269354d;
            EmojiVideoPlayTextureView emojiVideoPlayTextureView = captureEditorContainer.f269329h;
            if (emojiVideoPlayTextureView != null) {
                emojiVideoPlayTextureView.setOnDrawCallback(new C93340a(captureEditorContainer));
            }
            this.f269354d.setStartTick(Util.currentTicks());
            EmojiVideoPlayTextureView emojiVideoPlayTextureView2 = this.f269354d.f269329h;
            if (emojiVideoPlayTextureView2 != null) {
                emojiVideoPlayTextureView2.start();
            }
        }

        /* renamed from: p3 */
        public void mo76226p3(int i, int i2) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CaptureEditorContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f269325d = "MicroMsg.CaptureEditorContainer";
        new Matrix();
        View.inflate(context, C0966R.C0971layout.a1l, this);
        View findViewById = findViewById(C0966R.C0970id.cex);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_…e_video_play_view_layout)");
        this.f269328g = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cck);
        C87412m.m108593f(findViewById2, "findViewById(R.id.editor_item_container)");
        this.f269330i = (EditorItemContainer) findViewById2;
        View findViewById3 = findViewById(C0966R.C0970id.azh);
        C87412m.m108593f(findViewById3, "findViewById(R.id.change_text_root)");
        this.f269331j = (EditorChangeTextView) findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.cd5);
        C87412m.m108593f(findViewById4, "findViewById(R.id.editor_type_root)");
        this.f269332n = findViewById4;
        View findViewById5 = findViewById(C0966R.C0970id.cct);
        C87412m.m108593f(findViewById5, "findViewById(R.id.editor_remove_background)");
        this.f269333o = findViewById5;
        View findViewById6 = findViewById(C0966R.C0970id.ccw);
        C87412m.m108593f(findViewById6, "findViewById(R.id.editor_speed_up)");
        this.f269334p = findViewById6;
        View findViewById7 = findViewById(C0966R.C0970id.cbs);
        C87412m.m108593f(findViewById7, "findViewById(R.id.editor_add_emoji)");
        this.f269335q = findViewById7;
        View findViewById8 = findViewById(C0966R.C0970id.ccu);
        C87412m.m108593f(findViewById8, "findViewById(R.id.editor_remove_background_icon)");
        ImageView imageView = (ImageView) findViewById8;
        this.f269336r = imageView;
        View findViewById9 = findViewById(C0966R.C0970id.ccx);
        C87412m.m108593f(findViewById9, "findViewById(R.id.editor_speed_up_icon)");
        ImageView imageView2 = (ImageView) findViewById9;
        this.f269337s = imageView2;
        View findViewById10 = findViewById(C0966R.C0970id.cbt);
        C87412m.m108593f(findViewById10, "findViewById(R.id.editor_add_emoji_icon)");
        ImageView imageView3 = (ImageView) findViewById10;
        this.f269338t = imageView3;
        View findViewById11 = findViewById(C0966R.C0970id.kpw);
        C87412m.m108593f(findViewById11, "findViewById(R.id.to_capture)");
        this.f269339u = (ImageView) findViewById11;
        View findViewById12 = findViewById(C0966R.C0970id.gu9);
        C87412m.m108593f(findViewById12, "findViewById(R.id.mix_video)");
        this.f269340v = (ImageView) findViewById12;
        Drawable e = C74933u4.m89768e(context, C0966R.raw.icons_filled_remove_bg, C97607d.m125783c(this));
        C87412m.m108593f(e, "getColorDrawable(context…ve_bg, getIconSelColor())");
        this.f269342x = e;
        Drawable e2 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_remove_bg, C97607d.m125782b(this));
        C87412m.m108593f(e2, "getColorDrawable(context…ve_bg, getIconNorColor())");
        this.f269343y = e2;
        Drawable e3 = C74933u4.m89768e(context, C0966R.raw.icons_filled_play_quickly, C97607d.m125783c(this));
        C87412m.m108593f(e3, "getColorDrawable(context…ickly, getIconSelColor())");
        this.f269344z = e3;
        Drawable e4 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_play_quickly, C97607d.m125782b(this));
        C87412m.m108593f(e4, "getColorDrawable(context…ickly, getIconNorColor())");
        this.f269319A = e4;
        Drawable e5 = C74933u4.m89768e(context, C0966R.raw.icons_filled_add_emoji, C97607d.m125783c(this));
        C87412m.m108593f(e5, "getColorDrawable(context…emoji, getIconSelColor())");
        this.f269320B = e5;
        Drawable e6 = C74933u4.m89768e(context, C0966R.raw.icons_outlined_add_emoji, C97607d.m125782b(this));
        C87412m.m108593f(e6, "getColorDrawable(context…emoji, getIconNorColor())");
        this.f269321C = e6;
        imageView.setImageDrawable(e2);
        imageView2.setImageDrawable(e4);
        imageView3.setImageDrawable(e6);
        this.f269339u.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_outlined_previous, C97607d.m125782b(this)));
        this.f269340v.setImageDrawable(C74933u4.m89768e(context, C0966R.raw.icons_filled_done, C97607d.m125783c(this)));
        this.f269333o.setOnClickListener(new C93330a(this));
        this.f269334p.setOnClickListener(new C93331b(this));
        this.f269335q.setOnClickListener(new C93332c(this));
        findViewById(C0966R.C0970id.ced).setOnClickListener(new C93333d(this));
        findViewById(C0966R.C0970id.cec).setOnClickListener(new C93334e(this));
        setOnClickListener(new C93335f(this));
        this.f269331j.setCallback(new C93336g(this));
        this.f269330i.setStateChangeListener(new C93337h(this));
        SmileyPanel b = C78160t0.m94371b(context);
        C87412m.m108593f(b, "getSmileyPanel(context)");
        this.f269341w = b;
        Log.m105924i("MicroMsg.CaptureEditorContainer", "initSmileyPanel " + b);
        int i2 = ChatFooterPanel.f211589f;
        b.setEntranceScene(4);
        b.setShowSmiley(false);
        b.setShowClose(true);
        b.setVisibility(8);
        b.mo100197i();
        C78158s0 d = C78160t0.m94373d();
        d.f229009a = new C98316a(this);
        b.setCallback(d);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C78160t0.m94370a(getContext()));
        layoutParams.addRule(12);
        addView(b, layoutParams);
        b.setTranslationY((float) layoutParams.height);
        this.f269324F = new C93339j(this);
    }

    /* renamed from: a */
    public void mo128092a() {
        EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269329h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.setAlpha(1.0f);
        }
        EmojiCaptureReporter emojiCaptureReporter = this.f269327f;
        if (emojiCaptureReporter != null) {
            emojiCaptureReporter.f269131g = System.currentTimeMillis();
        } else {
            C87412m.m108603p("reporter");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo128093b(boolean z) {
        float f = (float) this.f269341w.getLayoutParams().height;
        if (z) {
            this.f269335q.setSelected(true);
            this.f269341w.setVisibility(0);
            this.f269341w.animate().translationY(0.0f).start();
        } else {
            this.f269335q.setSelected(false);
            this.f269341w.animate().translationY(f).withEndAction(new C93338i(this)).start();
        }
        this.f269338t.setImageDrawable(this.f269335q.isSelected() ? this.f269320B : this.f269321C);
    }

    /* renamed from: c */
    public boolean mo128094c() {
        return this.f269331j.getVisibility() == 0;
    }

    /* renamed from: d */
    public void mo128095d(C92190b bVar, String str, boolean z, boolean z2, C32224a<C13598b0> aVar) {
        C87412m.m108594g(bVar, "captureInfo");
        C87412m.m108594g(str, "videoPath");
        Context context = getContext();
        C87412m.m108593f(context, "context");
        EmojiVideoPlayTextureView emojiVideoPlayTextureView = new EmojiVideoPlayTextureView(context);
        this.f269329h = emojiVideoPlayTextureView;
        this.f269328g.addView(emojiVideoPlayTextureView);
        EmojiVideoPlayTextureView emojiVideoPlayTextureView2 = this.f269329h;
        if (emojiVideoPlayTextureView2 != null) {
            emojiVideoPlayTextureView2.setRemoveBgEnable(z);
        }
        EmojiVideoPlayTextureView emojiVideoPlayTextureView3 = this.f269329h;
        if (emojiVideoPlayTextureView3 != null) {
            emojiVideoPlayTextureView3.setRemoveBackground(z2);
        }
        EmojiVideoPlayTextureView emojiVideoPlayTextureView4 = this.f269329h;
        if (emojiVideoPlayTextureView4 != null) {
            emojiVideoPlayTextureView4.setVideoCallback(this.f269324F);
        }
        EmojiVideoPlayTextureView emojiVideoPlayTextureView5 = this.f269329h;
        if (emojiVideoPlayTextureView5 != null) {
            emojiVideoPlayTextureView5.setVideoPath(str);
        }
        EmojiVideoPlayTextureView emojiVideoPlayTextureView6 = this.f269329h;
        if (emojiVideoPlayTextureView6 != null) {
            emojiVideoPlayTextureView6.setAlpha(0.0f);
        }
        if (!z) {
            this.f269333o.setEnabled(false);
            this.f269333o.setSelected(false);
            this.f269336r.setImageDrawable(this.f269343y);
            View view = this.f269333o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(Float.valueOf(0.3f));
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            this.f269333o.setEnabled(true);
            View view3 = this.f269333o;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(Float.valueOf(1.0f));
            View view4 = view3;
            C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((Float) aVar3.mo10231a(0)).floatValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer", "setup", "(Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiCaptureInfo;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f269333o.setSelected(z2);
            this.f269336r.setImageDrawable(this.f269333o.isSelected() ? this.f269342x : this.f269343y);
        }
        this.f269323E = aVar;
    }

    public void destroy() {
        String str = this.f269325d;
        Log.m105924i(str, "destroy " + this.f269341w);
        this.f269341w.mo100189b();
    }

    /* renamed from: e */
    public void mo128097e(boolean z, CharSequence charSequence, int i) {
        if (z) {
            this.f269331j.setVisibility(0);
            this.f269331j.mo149523f(charSequence, i);
            return;
        }
        this.f269331j.mo149522e();
    }

    /* renamed from: f */
    public boolean mo128098f() {
        return this.f269341w.getVisibility() == 0;
    }

    public EditorItemContainer getItemContainer() {
        return this.f269330i;
    }

    public final C102813c getPresenter() {
        return this.f269326e;
    }

    public final long getStartTick() {
        return this.f269322D;
    }

    public EmojiVideoPlayTextureView getVideoPlayView() {
        return this.f269329h;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (windowInsets != null) {
            findViewById(C0966R.C0970id.cey).setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
        }
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        C87412m.m108593f(onApplyWindowInsets, "super.onApplyWindowInsets(insets)");
        return onApplyWindowInsets;
    }

    /* renamed from: q */
    public boolean mo128104q() {
        return getVisibility() == 0;
    }

    public void reset() {
        this.f269333o.setSelected(false);
        this.f269334p.setSelected(false);
        this.f269336r.setImageDrawable(this.f269343y);
        this.f269337s.setImageDrawable(this.f269319A);
        EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269329h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.stop();
        }
        this.f269328g.removeView(this.f269329h);
        this.f269329h = null;
    }

    public final void setPresenter(C102813c cVar) {
        this.f269326e = cVar;
    }

    public final void setReporter(EmojiCaptureReporter emojiCaptureReporter) {
        C87412m.m108594g(emojiCaptureReporter, "reporter");
        this.f269327f = emojiCaptureReporter;
        this.f269331j.setReporter(emojiCaptureReporter);
    }

    public final void setStartTick(long j) {
        this.f269322D = j;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f269329h;
        if (emojiVideoPlayTextureView != null) {
            emojiVideoPlayTextureView.setVisibility(i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CaptureEditorContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
