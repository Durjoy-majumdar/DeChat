package com.tencent.p014mm.emoji.panel;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.panel.layout.SmileyLayoutManager;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import p1082hl.C98470b;
import p207nl.C11216n;
import p813fl.C97906h;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/emoji/panel/SmileyPanelView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$a;", "C", "Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$a;", "getTextOperationListener", "()Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$a;", "setTextOperationListener", "(Lcom/tencent/mm/pluginsdk/ui/ChatFooterPanel$a;)V", "textOperationListener", "Lfl/h;", "D", "Lfl/h;", "getConfig", "()Lfl/h;", "setConfig", "(Lfl/h;)V", "config", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojisdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.emoji.panel.SmileyPanelView */
public final class SmileyPanelView extends ConstraintLayout {

    /* renamed from: A */
    public final C32224a<C13598b0> f266668A;

    /* renamed from: B */
    public final C98470b f266669B;

    /* renamed from: C */
    public ChatFooterPanel.C72719a f266670C;

    /* renamed from: D */
    public C97906h f266671D;

    /* renamed from: v */
    public final RecyclerView f266672v;

    /* renamed from: w */
    public final ImageView f266673w;

    /* renamed from: x */
    public final View f266674x;

    /* renamed from: y */
    public final Button f266675y;

    /* renamed from: z */
    public final Rect f266676z;

    /* renamed from: com.tencent.mm.emoji.panel.SmileyPanelView$a */
    public static final class C92659a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SmileyPanelView f266677d;

        public C92659a(SmileyPanelView smileyPanelView) {
            this.f266677d = smileyPanelView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/SmileyPanelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChatFooterPanel.C72719a textOperationListener = this.f266677d.getTextOperationListener();
            if (textOperationListener != null) {
                textOperationListener.mo64628c();
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/SmileyPanelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.emoji.panel.SmileyPanelView$b */
    public static final class C92660b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SmileyPanelView f266678d;

        public C92660b(SmileyPanelView smileyPanelView) {
            this.f266678d = smileyPanelView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emoji/panel/SmileyPanelView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ChatFooterPanel.C72719a textOperationListener = this.f266678d.getTextOperationListener();
            if (textOperationListener != null) {
                textOperationListener.mo64626a();
            }
            C117292a.m165361g(this, "com/tencent/mm/emoji/panel/SmileyPanelView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.emoji.panel.SmileyPanelView$c */
    public static final class C92661c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SmileyPanelView f266679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92661c(SmileyPanelView smileyPanelView) {
            super(0);
            this.f266679d = smileyPanelView;
        }

        public Object invoke() {
            C97906h config = this.f266679d.getConfig();
            if (config != null) {
                SmileyPanelView smileyPanelView = this.f266679d;
                if (config.f287219p) {
                    smileyPanelView.f266675y.setVisibility(0);
                    smileyPanelView.f266675y.setEnabled(config.f287220q);
                } else {
                    smileyPanelView.f266675y.setVisibility(8);
                }
                smileyPanelView.f266674x.setEnabled(config.f287220q);
                if (config.f287220q) {
                    ImageView imageView = smileyPanelView.f266673w;
                    C11216n.m11073a(imageView, C0966R.raw.icons_outlined_emoji_del, imageView.getContext().getResources().getColor(C0966R.color.FG_0));
                } else {
                    C11216n.m11073a(smileyPanelView.f266673w, C0966R.raw.icons_outlined_emoji_del, -3355444);
                }
                if (!config.f287220q) {
                    C98470b bVar = smileyPanelView.f266669B;
                    MTimerHandler mTimerHandler = bVar.f288813d;
                    if (mTimerHandler != null) {
                        mTimerHandler.stopTimer();
                    }
                    bVar.f288813d = null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.emoji.panel.SmileyPanelView$d */
    public static final class C92662d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SmileyPanelView f266680d;

        public C92662d(SmileyPanelView smileyPanelView) {
            this.f266680d = smileyPanelView;
        }

        public final void run() {
            this.f266680d.f266676z.setEmpty();
            SmileyPanelView smileyPanelView = this.f266680d;
            smileyPanelView.f266676z.union(smileyPanelView.f266673w.getLeft(), this.f266680d.f266673w.getTop(), this.f266680d.f266673w.getRight(), this.f266680d.f266673w.getBottom());
            SmileyPanelView smileyPanelView2 = this.f266680d;
            smileyPanelView2.f266676z.union(smileyPanelView2.f266675y.getLeft(), this.f266680d.f266675y.getTop(), this.f266680d.f266675y.getRight(), this.f266680d.f266675y.getBottom());
            SmileyPanelView smileyPanelView3 = this.f266680d;
            smileyPanelView3.f266676z.offset(-smileyPanelView3.f266672v.getLeft(), -this.f266680d.f266672v.getTop());
            RecyclerView.LayoutManager layoutManager = this.f266680d.f266672v.getLayoutManager();
            SmileyLayoutManager smileyLayoutManager = layoutManager instanceof SmileyLayoutManager ? (SmileyLayoutManager) layoutManager : null;
            if (smileyLayoutManager != null) {
                Rect rect = this.f266680d.f266676z;
                C87412m.m108594g(rect, "rect");
                smileyLayoutManager.f157034D.set(rect);
                smileyLayoutManager.mo76367k0();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmileyPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f266676z = new Rect();
        C98470b bVar = new C98470b();
        this.f266669B = bVar;
        View.inflate(context, C0966R.C0971layout.a26, this);
        View findViewById = findViewById(C0966R.C0970id.cgh);
        C87412m.m108593f(findViewById, "findViewById(R.id.emoji_panel_group_recycler)");
        this.f266672v = (RecyclerView) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.cgf);
        C87412m.m108593f(findViewById2, "findViewById(R.id.emoji_panel_delete)");
        ImageView imageView = (ImageView) findViewById2;
        this.f266673w = imageView;
        View findViewById3 = findViewById(C0966R.C0970id.cgg);
        C87412m.m108593f(findViewById3, "findViewById(R.id.emoji_panel_delete_bg)");
        this.f266674x = findViewById3;
        View findViewById4 = findViewById(C0966R.C0970id.cgp);
        C87412m.m108593f(findViewById4, "findViewById(R.id.emoji_panel_send)");
        Button button = (Button) findViewById4;
        this.f266675y = button;
        imageView.setOnClickListener(new C92659a(this));
        button.setOnClickListener(new C92660b(this));
        imageView.setOnTouchListener(bVar);
        this.f266668A = new C92661c(this);
    }

    public final C97906h getConfig() {
        return this.f266671D;
    }

    public final ChatFooterPanel.C72719a getTextOperationListener() {
        return this.f266670C;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new C92662d(this));
    }

    public final void setConfig(C97906h hVar) {
        this.f266671D = hVar;
    }

    public final void setTextOperationListener(ChatFooterPanel.C72719a aVar) {
        this.f266670C = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SmileyPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
