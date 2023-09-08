package com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit;

import ai2.C103373k;
import ai2.C26815p;
import ai2.C92007a;
import ai2.C92008b;
import ai2.C92010c;
import ai2.C92011d;
import ai2.C92013g;
import ai2.C92015i;
import ai2.C92018l;
import ai2.C92023q;
import ai2.C92025s;
import ai2.C92026t;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ci2.C104380d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.item.EditorItemContainer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gi2.C107818f;
import gi2.C98129b;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import l23.C109202j;
import q23.C110361b;
import q23.C110364c;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13605o;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C36907w;
import yh2.C102864a;
import zg2.C103020m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\\\u001a\u00020[\u0012\b\u0010^\u001a\u0004\u0018\u00010]\u0012\u0006\u0010`\u001a\u00020_¢\u0006\u0004\ba\u0010bB\u001b\b\u0016\u0012\u0006\u0010\\\u001a\u00020[\u0012\b\u0010^\u001a\u0004\u0018\u00010]¢\u0006\u0004\ba\u0010cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\u001e\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\nJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010 \u001a\n \u0016*\u0004\u0018\u00010\u001c0\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR#\u0010%\u001a\n \u0016*\u0004\u0018\u00010!0!8BX\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R#\u0010(\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001b\u0010-\u001a\u00020)8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010,R0\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R2\u0010:\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u000106\u0012\u0004\u0012\u00020\u0013\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u00100\u001a\u0004\b8\u00102\"\u0004\b9\u00104R2\u0010>\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0013\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b;\u00100\u001a\u0004\b<\u00102\"\u0004\b=\u00104R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER0\u0010K\u001a\u0010\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u0013\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bH\u00100\u001a\u0004\bI\u00102\"\u0004\bJ\u00104R2\u0010O\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0013\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bM\u00102\"\u0004\bN\u00104R0\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0013\u0018\u00010.8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u00100\u001a\u0004\bQ\u00102\"\u0004\bR\u00104R\"\u0010Z\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010Y¨\u0006d"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditorItemContainer;", "Lcom/tencent/mm/ui/widget/InsectRelativeLayout;", "Ll23/j$c;", "", "getDialogTitle", "getDialogMenu", "Ljava/util/ArrayList;", "Lai2/a;", "Lkotlin/collections/ArrayList;", "getEditorDataList", "", "Lai2/i;", "getAllItemViews", "getAllEditorData", "Lrx3/o;", "", "getAllTTSData", "", "enable", "Lrx3/b0;", "setEnableTouch", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "p", "Lrx3/g;", "getItemLayout", "()Landroid/view/ViewGroup;", "itemLayout", "Landroid/widget/TextView;", "q", "getDeleteView", "()Landroid/widget/TextView;", "deleteView", "Landroid/widget/ImageView;", "r", "getDeleteViewIcon", "()Landroid/widget/ImageView;", "deleteViewIcon", "s", "getDeleteViewGroup", "deleteViewGroup", "Lq23/b;", "t", "getTimeEditIcon", "()Lq23/b;", "timeEditIcon", "Lkotlin/Function1;", "w", "Lfy3/l;", "getDeleteStateListener", "()Lfy3/l;", "setDeleteStateListener", "(Lfy3/l;)V", "deleteStateListener", "Landroid/view/View;", "x", "getItemChangeListener", "setItemChangeListener", "itemChangeListener", "y", "getTimeEditClickListener", "setTimeEditClickListener", "timeEditClickListener", "Landroid/view/View$OnClickListener;", "z", "Landroid/view/View$OnClickListener;", "getClickListener", "()Landroid/view/View$OnClickListener;", "setClickListener", "(Landroid/view/View$OnClickListener;)V", "clickListener", "Lyh2/a;", "A", "getShowCaptionDialogListener", "setShowCaptionDialogListener", "showCaptionDialogListener", "B", "getReadTextListener", "setReadTextListener", "readTextListener", "C", "getTimeEditMenuChangeListener", "setTimeEditMenuChangeListener", "timeEditMenuChangeListener", "D", "J", "getSegmentOffset", "()J", "setSegmentOffset", "(J)V", "segmentOffset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer */
public final class TimeEditorItemContainer extends InsectRelativeLayout implements C109202j.C109204c {

    /* renamed from: I */
    public static final /* synthetic */ int f316764I = 0;

    /* renamed from: A */
    public C32226l<? super C102864a, C13598b0> f316765A;

    /* renamed from: B */
    public C32226l<? super C92007a, C13598b0> f316766B;

    /* renamed from: C */
    public C32226l<? super Boolean, C13598b0> f316767C;

    /* renamed from: D */
    public long f316768D;

    /* renamed from: E */
    public boolean f316769E;

    /* renamed from: F */
    public Runnable f316770F;

    /* renamed from: G */
    public final C32227p<String, String, C77407n> f316771G;

    /* renamed from: H */
    public final C106256m f316772H;

    /* renamed from: i */
    public final C110364c f316773i;

    /* renamed from: j */
    public RecordConfigProvider f316774j;

    /* renamed from: n */
    public boolean f316775n;

    /* renamed from: o */
    public final Rect f316776o;

    /* renamed from: p */
    public final C13601g f316777p;

    /* renamed from: q */
    public final C13601g f316778q;

    /* renamed from: r */
    public final C13601g f316779r;

    /* renamed from: s */
    public final C13601g f316780s;

    /* renamed from: t */
    public final C13601g f316781t;

    /* renamed from: u */
    public View f316782u;

    /* renamed from: v */
    public View f316783v;

    /* renamed from: w */
    public C32226l<? super Boolean, C13598b0> f316784w;

    /* renamed from: x */
    public C32226l<? super View, C13598b0> f316785x;

    /* renamed from: y */
    public C32226l<? super C92007a, C13598b0> f316786y;

    /* renamed from: z */
    public View.OnClickListener f316787z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$a */
    public static final class C106244a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316788d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106244a(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316788d = timeEditorItemContainer;
        }

        public Object invoke() {
            TimeEditorItemContainer timeEditorItemContainer = this.f316788d;
            View view = timeEditorItemContainer.f316783v;
            if (view != null && (view instanceof C107818f)) {
                C32226l<C92007a, C13598b0> timeEditClickListener = timeEditorItemContainer.getTimeEditClickListener();
                if (timeEditClickListener != null) {
                    timeEditClickListener.invoke(((C107818f) view).getEditorData());
                }
                timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.f316770F);
                View view2 = timeEditorItemContainer.f316783v;
                if (view2 != null) {
                    timeEditorItemContainer.mo152269o(view2, false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$b */
    public static final class C106245b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316789d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106245b(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316789d = timeEditorItemContainer;
        }

        public Object invoke() {
            TimeEditorItemContainer timeEditorItemContainer = this.f316789d;
            timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.f316770F);
            this.f316789d.getClass();
            TimeEditorItemContainer timeEditorItemContainer2 = this.f316789d;
            ((C77407n) ((C106251h) timeEditorItemContainer2.f316771G).invoke(timeEditorItemContainer2.getDialogTitle(), this.f316789d.getDialogMenu())).mo107573q();
            this.f316789d.f316782u = null;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$c */
    public static final class C106246c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316790d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106246c(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316790d = timeEditorItemContainer;
        }

        public Object invoke() {
            View.OnClickListener clickListener = this.f316790d.getClickListener();
            if (clickListener != null) {
                clickListener.onClick(this.f316790d.f316783v);
            }
            TimeEditorItemContainer timeEditorItemContainer = this.f316790d;
            timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.f316770F);
            View view = this.f316790d.f316783v;
            if (view != null) {
                view.setActivated(false);
            }
            TimeEditorItemContainer timeEditorItemContainer2 = this.f316790d;
            timeEditorItemContainer2.f316783v = null;
            timeEditorItemContainer2.getTimeEditIcon().setVisibility(4);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$d */
    public static final class C106247d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106247d(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316791d = timeEditorItemContainer;
        }

        public Object invoke() {
            this.f316791d.getDeleteViewGroup().setVisibility(8);
            TimeEditorItemContainer timeEditorItemContainer = this.f316791d;
            timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.f316770F);
            this.f316791d.getTimeEditIcon().setVisibility(4);
            C32226l<C102864a, C13598b0> showCaptionDialogListener = this.f316791d.getShowCaptionDialogListener();
            if (showCaptionDialogListener != null) {
                View view = this.f316791d.f316783v;
                C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.CaptionItemView");
                showCaptionDialogListener.invoke((C102864a) view);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$e */
    public static final class C106248e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106248e(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316792d = timeEditorItemContainer;
        }

        public Object invoke() {
            C32226l<C92007a, C13598b0> readTextListener;
            this.f316792d.getDeleteViewGroup().setVisibility(8);
            TimeEditorItemContainer timeEditorItemContainer = this.f316792d;
            timeEditorItemContainer.removeCallbacks(timeEditorItemContainer.f316770F);
            this.f316792d.getTimeEditIcon().setVisibility(4);
            TimeEditorItemContainer timeEditorItemContainer2 = this.f316792d;
            View view = timeEditorItemContainer2.f316783v;
            C107818f fVar = view instanceof C107818f ? (C107818f) view : null;
            if (!(fVar == null || (readTextListener = timeEditorItemContainer2.getReadTextListener()) == null)) {
                readTextListener.invoke(fVar.getEditorData());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$f */
    public static final class C106249f extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106249f(TimeEditorItemContainer timeEditorItemContainer) {
            super(1);
            this.f316793d = timeEditorItemContainer;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            C32226l<View, C13598b0> itemChangeListener = this.f316793d.getItemChangeListener();
            if (itemChangeListener != null) {
                itemChangeListener.invoke(view);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$g */
    public static final class C106250g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316794d;

        public C106250g(TimeEditorItemContainer timeEditorItemContainer) {
            this.f316794d = timeEditorItemContainer;
        }

        public final void run() {
            TimeEditorItemContainer timeEditorItemContainer = this.f316794d;
            timeEditorItemContainer.mo152269o(timeEditorItemContainer.f316783v, false);
            C32226l<Boolean, C13598b0> timeEditMenuChangeListener = this.f316794d.getTimeEditMenuChangeListener();
            if (timeEditMenuChangeListener != null) {
                timeEditMenuChangeListener.invoke(Boolean.FALSE);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$h */
    public static final class C106251h extends C87413o implements C32227p<String, String, C77407n> {

        /* renamed from: d */
        public final /* synthetic */ Context f316795d;

        /* renamed from: e */
        public final /* synthetic */ TimeEditorItemContainer f316796e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106251h(Context context, TimeEditorItemContainer timeEditorItemContainer) {
            super(2);
            this.f316795d = context;
            this.f316796e = timeEditorItemContainer;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "menuString");
            C77407n nVar = new C77407n(this.f316795d, 1, true);
            nVar.mo107568m(str, 17, 0);
            nVar.f225771i = new C5692a(nVar, this.f316795d, str2);
            TimeEditorItemContainer timeEditorItemContainer = this.f316796e;
            nVar.f225782p = new C106259b(timeEditorItemContainer);
            nVar.f225761d = new C106260c(timeEditorItemContainer);
            return nVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$i */
    public static final class C106252i extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316797d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106252i(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316797d = timeEditorItemContainer;
        }

        public Object invoke() {
            return (TextView) this.f316797d.findViewById(C0966R.C0970id.ccc);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$j */
    public static final class C106253j extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316798d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106253j(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316798d = timeEditorItemContainer;
        }

        public Object invoke() {
            return (ViewGroup) this.f316798d.findViewById(C0966R.C0970id.ccd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$k */
    public static final class C106254k extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106254k(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316799d = timeEditorItemContainer;
        }

        public Object invoke() {
            return (ImageView) this.f316799d.findViewById(C0966R.C0970id.cce);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$l */
    public static final class C106255l extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ TimeEditorItemContainer f316800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106255l(TimeEditorItemContainer timeEditorItemContainer) {
            super(0);
            this.f316800d = timeEditorItemContainer;
        }

        public Object invoke() {
            return (ViewGroup) this.f316800d.findViewById(C0966R.C0970id.ccl);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$m */
    public static final class C106256m implements EditorItemContainer.C94437a {

        /* renamed from: a */
        public float f316801a;

        /* renamed from: b */
        public float f316802b;

        /* renamed from: c */
        public final int f316803c;

        /* renamed from: d */
        public boolean f316804d;

        /* renamed from: e */
        public final /* synthetic */ TimeEditorItemContainer f316805e;

        /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$m$a */
        public static final class C106257a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ TimeEditorItemContainer f316806d;

            public C106257a(TimeEditorItemContainer timeEditorItemContainer) {
                this.f316806d = timeEditorItemContainer;
            }

            public final void run() {
                C92018l lVar;
                this.f316806d.getItemLayout().removeView(this.f316806d.f316782u);
                View view = this.f316806d.f316783v;
                C26815p pVar = view instanceof C26815p ? (C26815p) view : null;
                if (pVar != null) {
                    C92023q qVar = pVar.f74566j;
                    if (!(qVar == null || (lVar = qVar.f263519r) == null)) {
                        lVar.mo125916a();
                    }
                    pVar.f74567n = false;
                }
                C32226l<View, C13598b0> itemChangeListener = this.f316806d.getItemChangeListener();
                if (itemChangeListener != null) {
                    itemChangeListener.invoke(this.f316806d.f316782u);
                }
                TimeEditorItemContainer timeEditorItemContainer = this.f316806d;
                timeEditorItemContainer.f316782u = null;
                timeEditorItemContainer.f316783v = null;
            }
        }

        public C106256m(Context context, TimeEditorItemContainer timeEditorItemContainer) {
            this.f316805e = timeEditorItemContainer;
            this.f316803c = ViewConfiguration.get(context).getScaledTouchSlop();
        }

        /* renamed from: a */
        public void mo129926a(View view, MotionEvent motionEvent) {
            C87412m.m108594g(view, "itemView");
            C87412m.m108594g(motionEvent, "event");
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            return;
                        }
                    } else if (Math.abs(motionEvent.getX() - this.f316801a) > ((float) this.f316803c) || Math.abs(motionEvent.getY() - this.f316802b) > ((float) this.f316803c)) {
                        this.f316804d = true;
                        TimeEditorItemContainer timeEditorItemContainer = this.f316805e;
                        int i = TimeEditorItemContainer.f316764I;
                        timeEditorItemContainer.getClass();
                        this.f316805e.getTimeEditIcon().setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                }
                TimeEditorItemContainer timeEditorItemContainer2 = this.f316805e;
                if (timeEditorItemContainer2.f316782u != null) {
                    timeEditorItemContainer2.post(new C106257a(timeEditorItemContainer2));
                } else if (timeEditorItemContainer2.f316783v != null) {
                    if (timeEditorItemContainer2.getTimeEditIcon().getVisibility() == 0) {
                        TimeEditorItemContainer timeEditorItemContainer3 = this.f316805e;
                        if (timeEditorItemContainer3.f316783v instanceof C92026t) {
                            C32224a<C13598b0> editContentListener = timeEditorItemContainer3.getTimeEditIcon().getEditContentListener();
                            if (editContentListener != null) {
                                editContentListener.invoke();
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f316804d) {
                        TimeEditorItemContainer timeEditorItemContainer4 = this.f316805e;
                        timeEditorItemContainer4.mo152269o(timeEditorItemContainer4.f316783v, false);
                        C32226l<Boolean, C13598b0> timeEditMenuChangeListener = this.f316805e.getTimeEditMenuChangeListener();
                        if (timeEditMenuChangeListener != null) {
                            timeEditMenuChangeListener.invoke(Boolean.FALSE);
                            return;
                        }
                        return;
                    }
                    TimeEditorItemContainer.m142987i(this.f316805e, view, true);
                }
            } else {
                this.f316801a = motionEvent.getX();
                this.f316802b = motionEvent.getY();
                this.f316804d = false;
                TimeEditorItemContainer timeEditorItemContainer5 = this.f316805e;
                timeEditorItemContainer5.removeCallbacks(timeEditorItemContainer5.f316770F);
                this.f316805e.mo152269o(view, true);
                C32226l<Boolean, C13598b0> timeEditMenuChangeListener2 = this.f316805e.getTimeEditMenuChangeListener();
                if (timeEditMenuChangeListener2 != null) {
                    timeEditMenuChangeListener2.invoke(Boolean.TRUE);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$n */
    public static final class C106258n extends C87413o implements C32224a<C110361b> {

        /* renamed from: d */
        public final /* synthetic */ Context f316807d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106258n(Context context) {
            super(0);
            this.f316807d = context;
        }

        public Object invoke() {
            return new C110361b(this.f316807d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeEditorItemContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f316773i = new C110364c();
        this.f316776o = new Rect();
        this.f316777p = C36568h.m40985a(new C106255l(this));
        this.f316778q = C36568h.m40985a(new C106252i(this));
        this.f316779r = C36568h.m40985a(new C106254k(this));
        this.f316780s = C36568h.m40985a(new C106253j(this));
        this.f316781t = C36568h.m40985a(new C106258n(context));
        this.f316769E = true;
        this.f316770F = new C106250g(this);
        this.f316771G = new C106251h(context, this);
        this.f316772H = new C106256m(context, this);
        View.inflate(context, C0966R.C0971layout.c68, this);
        C103020m mVar = C103020m.f303985a;
        C103020m.f303987c.set(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        addView(getTimeEditIcon(), new RelativeLayout.LayoutParams(-2, -2));
        getTimeEditIcon().setVisibility(4);
        getTimeEditIcon().setEditTimeListener(new C106244a(this));
        getTimeEditIcon().setDeleteListener(new C106245b(this));
        getTimeEditIcon().setEditContentListener(new C106246c(this));
        getTimeEditIcon().setEditCaptionListener(new C106247d(this));
        getTimeEditIcon().setReadTextListener(new C106248e(this));
    }

    private final TextView getDeleteView() {
        return (TextView) ((C36570n) this.f316778q).getValue();
    }

    /* access modifiers changed from: private */
    public final ViewGroup getDeleteViewGroup() {
        return (ViewGroup) ((C36570n) this.f316780s).getValue();
    }

    private final ImageView getDeleteViewIcon() {
        return (ImageView) ((C36570n) this.f316779r).getValue();
    }

    /* access modifiers changed from: private */
    public final String getDialogMenu() {
        View view = this.f316783v;
        if (view instanceof C92026t) {
            String string = getContext().getString(C0966R.string.c3q);
            C87412m.m108593f(string, "context.getString(R.stri….editor_item_delete_text)");
            return string;
        }
        if (view instanceof C92008b ? true : view instanceof C92013g) {
            String q = C76577a.m92166q(getContext(), C0966R.string.kbm);
            C87412m.m108593f(q, "getString(context, R.str….video_track_edit_delete)");
            return q;
        } else if (view instanceof C102864a) {
            String q2 = C76577a.m92166q(getContext(), C0966R.string.kbj);
            C87412m.m108593f(q2, "getString(context, R.str…deo_track_caption_delete)");
            return q2;
        } else {
            String q3 = C76577a.m92166q(getContext(), C0966R.string.kbm);
            C87412m.m108593f(q3, "getString(context, R.str….video_track_edit_delete)");
            return q3;
        }
    }

    /* access modifiers changed from: private */
    public final String getDialogTitle() {
        View view = this.f316783v;
        if (view instanceof C92026t) {
            String q = C76577a.m92166q(getContext(), C0966R.string.f361495kc1);
            C87412m.m108593f(q, "getString(context, R.str…_track_text_delete_title)");
            return q;
        }
        if (view instanceof C92008b ? true : view instanceof C92013g) {
            String q2 = C76577a.m92166q(getContext(), C0966R.string.kbo);
            C87412m.m108593f(q2, "getString(context, R.str…_track_edit_delete_title)");
            return q2;
        } else if (view instanceof C102864a) {
            String q3 = C76577a.m92166q(getContext(), C0966R.string.kbk);
            C87412m.m108593f(q3, "getString(context, R.str…ack_caption_delete_title)");
            return q3;
        } else {
            String q4 = C76577a.m92166q(getContext(), C0966R.string.kbo);
            C87412m.m108593f(q4, "getString(context, R.str…_track_edit_delete_title)");
            return q4;
        }
    }

    /* access modifiers changed from: private */
    public final ViewGroup getItemLayout() {
        return (ViewGroup) ((C36570n) this.f316777p).getValue();
    }

    /* access modifiers changed from: private */
    public final C110361b getTimeEditIcon() {
        return (C110361b) ((C36570n) this.f316781t).getValue();
    }

    /* renamed from: i */
    public static final void m142987i(TimeEditorItemContainer timeEditorItemContainer, View view, boolean z) {
        View view2 = view;
        timeEditorItemContainer.getClass();
        if (view2 instanceof C107818f) {
            C107818f fVar = (C107818f) view2;
            RectF drawRect = fVar.getDrawRect();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            Rect rect = C103020m.f303988d;
            int i = rect.top;
            float f = ((float) rect.bottom) - drawRect.bottom;
            float f2 = (float) i;
            float f3 = drawRect.top - f2;
            float f4 = (float) 2;
            float height = f2 + (drawRect.height() / f4) + ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df));
            float height2 = ((float) C103020m.f303988d.bottom) - (((drawRect.height() / f4) + ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df))) + ((float) timeEditorItemContainer.getTimeEditIcon().getMeasuredHeight()));
            int i2 = 8;
            if (!(view2 instanceof C102864a)) {
                if (view2 instanceof C26815p ? true : view2 instanceof C92026t) {
                    C110361b timeEditIcon = timeEditorItemContainer.getTimeEditIcon();
                    C92007a editorData = fVar.getEditorData();
                    boolean z2 = editorData != null ? editorData.f263406e : false;
                    timeEditIcon.f330114n.setVisibility(0);
                    timeEditIcon.f330112i.setVisibility(z2 ? 0 : 8);
                    timeEditIcon.f330115o.setVisibility(8);
                    if (timeEditIcon.f330117q) {
                        ViewGroup viewGroup = timeEditIcon.f330116p;
                        if (z2) {
                            i2 = 0;
                        }
                        viewGroup.setVisibility(i2);
                    }
                    if (f >= ((float) timeEditorItemContainer.getTimeEditIcon().getMeasuredHeight()) || f >= f3) {
                        timeEditorItemContainer.getTimeEditIcon().mo161865c();
                        timeEditorItemContainer.getTimeEditIcon().measure(makeMeasureSpec, makeMeasureSpec2);
                        C110361b timeEditIcon2 = timeEditorItemContainer.getTimeEditIcon();
                        float h = drawRect.bottom + ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df));
                        if (h >= height) {
                            height = h;
                        }
                        timeEditIcon2.setTranslationY(height);
                    } else {
                        timeEditorItemContainer.getTimeEditIcon().mo161863a();
                        timeEditorItemContainer.getTimeEditIcon().measure(makeMeasureSpec, makeMeasureSpec2);
                        C110361b timeEditIcon3 = timeEditorItemContainer.getTimeEditIcon();
                        float h2 = (drawRect.top - ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df))) - ((float) timeEditorItemContainer.getTimeEditIcon().getMeasuredHeight());
                        if (h2 <= height2) {
                            height2 = h2;
                        }
                        timeEditIcon3.setTranslationY(height2);
                    }
                    timeEditorItemContainer.getTimeEditIcon().setTranslationX(drawRect.centerX() - ((float) (timeEditorItemContainer.getTimeEditIcon().getMeasuredWidth() / 2)));
                    timeEditorItemContainer.mo152285v();
                } else {
                    C110361b timeEditIcon4 = timeEditorItemContainer.getTimeEditIcon();
                    C92007a editorData2 = fVar.getEditorData();
                    boolean z3 = editorData2 != null ? editorData2.f263406e : false;
                    timeEditIcon4.f330114n.setVisibility(8);
                    timeEditIcon4.f330115o.setVisibility(8);
                    timeEditIcon4.f330112i.setVisibility(z3 ? 0 : 8);
                    timeEditIcon4.f330116p.setVisibility(8);
                    if (f >= ((float) timeEditorItemContainer.getTimeEditIcon().getMeasuredHeight()) || f >= f3) {
                        timeEditorItemContainer.getTimeEditIcon().mo161865c();
                        timeEditorItemContainer.getTimeEditIcon().measure(makeMeasureSpec, makeMeasureSpec2);
                        C110361b timeEditIcon5 = timeEditorItemContainer.getTimeEditIcon();
                        float h3 = drawRect.bottom + ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df));
                        if (h3 >= height) {
                            height = h3;
                        }
                        timeEditIcon5.setTranslationY(height);
                    } else {
                        timeEditorItemContainer.getTimeEditIcon().mo161863a();
                        timeEditorItemContainer.getTimeEditIcon().measure(makeMeasureSpec, makeMeasureSpec2);
                        C110361b timeEditIcon6 = timeEditorItemContainer.getTimeEditIcon();
                        float h4 = (drawRect.top - ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df))) - ((float) timeEditorItemContainer.getTimeEditIcon().getMeasuredHeight());
                        if (h4 <= height2) {
                            height2 = h4;
                        }
                        timeEditIcon6.setTranslationY(height2);
                    }
                    timeEditorItemContainer.getTimeEditIcon().setTranslationX(drawRect.centerX() - ((float) (timeEditorItemContainer.getTimeEditIcon().getMeasuredWidth() / 2)));
                }
            } else if (!((C102864a) view2).getEnableEdit()) {
                timeEditorItemContainer.getTimeEditIcon().setVisibility(4);
                return;
            } else {
                C110361b timeEditIcon7 = timeEditorItemContainer.getTimeEditIcon();
                timeEditIcon7.f330114n.setVisibility(0);
                timeEditIcon7.f330115o.setVisibility(0);
                timeEditIcon7.f330112i.setVisibility(8);
                timeEditIcon7.f330116p.setVisibility(8);
                if (f3 >= ((float) timeEditorItemContainer.getTimeEditIcon().getMeasuredHeight()) || f3 >= f) {
                    timeEditorItemContainer.getTimeEditIcon().mo161863a();
                    timeEditorItemContainer.getTimeEditIcon().measure(makeMeasureSpec, makeMeasureSpec2);
                    C110361b timeEditIcon8 = timeEditorItemContainer.getTimeEditIcon();
                    float h5 = (drawRect.top - ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df))) - ((float) timeEditorItemContainer.getTimeEditIcon().getMeasuredHeight());
                    if (h5 <= height2) {
                        height2 = h5;
                    }
                    timeEditIcon8.setTranslationY(height2);
                } else {
                    timeEditorItemContainer.getTimeEditIcon().mo161865c();
                    timeEditorItemContainer.getTimeEditIcon().measure(makeMeasureSpec, makeMeasureSpec2);
                    C110361b timeEditIcon9 = timeEditorItemContainer.getTimeEditIcon();
                    float h6 = drawRect.bottom + ((float) C76577a.m92157h(timeEditorItemContainer.getContext(), C0966R.dimen.f3766df));
                    if (h6 >= height) {
                        height = h6;
                    }
                    timeEditIcon9.setTranslationY(height);
                }
                timeEditorItemContainer.getTimeEditIcon().setTranslationX((((float) timeEditorItemContainer.getContext().getResources().getDisplayMetrics().widthPixels) / 2.0f) - ((float) (timeEditorItemContainer.getTimeEditIcon().getMeasuredWidth() / 2)));
            }
            timeEditorItemContainer.getTimeEditIcon().setVisibility(0);
            C32226l<? super Boolean, C13598b0> lVar = timeEditorItemContainer.f316767C;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
            if (z) {
                timeEditorItemContainer.getTimeEditIcon().bringToFront();
            }
            timeEditorItemContainer.getTimeEditIcon().invalidate();
        }
    }

    /* renamed from: a */
    public boolean mo70458a(int i) {
        ViewGroup.LayoutParams layoutParams = getDeleteViewGroup().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i + C76577a.m92151b(getContext(), 32);
        getDeleteViewGroup().setLayoutParams(marginLayoutParams);
        return true;
    }

    /* renamed from: c */
    public void mo138712c(long j) {
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            C107818f fVar = childAt instanceof C107818f ? (C107818f) childAt : null;
            if (fVar != null) {
                if (fVar instanceof C102864a) {
                    fVar.mo53770a(j);
                } else {
                    fVar.mo53770a(this.f316768D + j);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo138713d(C109202j.C99301e eVar) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f316769E) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final List<C92007a> getAllEditorData() {
        C92007a editorData;
        ArrayList arrayList = new ArrayList();
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            if ((childAt instanceof C107818f) && (editorData = ((C107818f) childAt).getEditorData()) != null) {
                arrayList.add(editorData);
            }
        }
        return arrayList;
    }

    public final List<C92015i> getAllItemViews() {
        ArrayList arrayList = new ArrayList();
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            if (childAt instanceof C92015i) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public final List<C13605o<String, Long, Long>> getAllTTSData() {
        List<C92007a> allEditorData = getAllEditorData();
        ArrayList<C92007a> arrayList = new ArrayList<>();
        for (T next : allEditorData) {
            C92007a aVar = (C92007a) next;
            if ((aVar instanceof C103373k) && ((C103373k) aVar).mo125979a()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        for (C92007a aVar2 : arrayList) {
            long c = aVar2.f263404c.mo146049c();
            C103373k kVar = (C103373k) aVar2;
            long c2 = aVar2.f263404c.mo146049c() + kVar.mo125980b().f78429b;
            C104380d dVar = aVar2.f263403b;
            if (dVar != null) {
                c = dVar.mo146049c();
                c2 = dVar.mo146048b();
            }
            arrayList2.add(new C13605o(kVar.mo125980b().f78428a, Long.valueOf(c), Long.valueOf(c2)));
        }
        return arrayList2;
    }

    public final View.OnClickListener getClickListener() {
        return this.f316787z;
    }

    public final C32226l<Boolean, C13598b0> getDeleteStateListener() {
        return this.f316784w;
    }

    public final ArrayList<C92007a> getEditorDataList() {
        C92007a d;
        ArrayList<C92007a> arrayList = new ArrayList<>();
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            if ((childAt instanceof C92015i) && (d = ((C92015i) childAt).mo53771d()) != null) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    public final C32226l<View, C13598b0> getItemChangeListener() {
        return this.f316785x;
    }

    public final C32226l<C92007a, C13598b0> getReadTextListener() {
        return this.f316766B;
    }

    public final long getSegmentOffset() {
        return this.f316768D;
    }

    public final C32226l<C102864a, C13598b0> getShowCaptionDialogListener() {
        return this.f316765A;
    }

    public final C32226l<C92007a, C13598b0> getTimeEditClickListener() {
        return this.f316786y;
    }

    public final C32226l<Boolean, C13598b0> getTimeEditMenuChangeListener() {
        return this.f316767C;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: yh2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: yh2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: yh2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: ai2.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: ai2.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: yh2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: ai2.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: yh2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: yh2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: yh2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: yh2.a} */
    /* JADX WARNING: type inference failed for: r8v6, types: [ai2.h, ai2.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152264j(ai2.C92007a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r12, r0)
            android.graphics.PointF r0 = new android.graphics.PointF
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r11.f316774j
            if (r1 == 0) goto L_0x001c
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r1.f272927o
            if (r1 == 0) goto L_0x001c
            float r2 = r1.f266571d
            r0.x = r2
            float r1 = r1.f266572e
            r0.y = r1
        L_0x001c:
            q23.c r1 = r11.f316773i
            android.content.Context r2 = r11.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r2, r3)
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$m r3 = r11.f316772H
            android.graphics.Rect r4 = r11.f316776o
            r1.getClass()
            java.lang.String r5 = "itemStateResolve"
            gy3.C87412m.m108594g(r3, r5)
            java.lang.String r5 = "displayArea"
            gy3.C87412m.m108594g(r4, r5)
            int r5 = r4.bottom
            int r6 = r4.top
            int r5 = r5 + r6
            ai2.d r6 = r12.f263402a
            int r6 = r6.ordinal()
            r7 = 1056964608(0x3f000000, float:0.5)
            r8 = 0
            if (r6 == 0) goto L_0x0125
            r9 = 0
            r10 = 1
            if (r6 == r10) goto L_0x00fb
            r0 = 4
            if (r6 == r0) goto L_0x00e8
            r0 = 5
            if (r6 == r0) goto L_0x00a5
            r0 = 6
            if (r6 == r0) goto L_0x0069
            r0 = 7
            if (r6 == r0) goto L_0x005a
            goto L_0x0139
        L_0x005a:
            ai2.p r8 = new ai2.p
            r8.<init>(r2)
            r8.setStateResolve(r3)
            ai2.q r12 = (ai2.C92023q) r12
            r8.setEditItem(r12)
            goto L_0x0139
        L_0x0069:
            yh2.a r0 = r1.f330123b
            if (r0 == 0) goto L_0x0088
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0074
            goto L_0x0088
        L_0x0074:
            yh2.a r0 = r1.f330123b
            if (r0 == 0) goto L_0x007d
            ai2.c r12 = (ai2.C92010c) r12
            r0.mo142576l(r12)
        L_0x007d:
            yh2.a r12 = r1.f330123b
            if (r12 != 0) goto L_0x0083
            goto L_0x0164
        L_0x0083:
            r12.setVisibility(r9)
            goto L_0x0164
        L_0x0088:
            yh2.a r0 = new yh2.a
            r0.<init>(r2)
            r0.setStateResolve(r3)
            ai2.c r12 = (ai2.C92010c) r12
            r0.setCaptionItem(r12)
            r1.f330123b = r0
            int r12 = r5 / 2
            android.graphics.Rect r1 = zg2.C103020m.f303988d
            int r1 = r1.bottom
            r3 = 2131165284(0x7f070064, float:1.794478E38)
            int r2 = kg3.C76577a.m92157h(r2, r3)
            goto L_0x00e0
        L_0x00a5:
            yh2.a r0 = r1.f330122a
            if (r0 == 0) goto L_0x00c4
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x00b0
            goto L_0x00c4
        L_0x00b0:
            yh2.a r0 = r1.f330122a
            if (r0 == 0) goto L_0x00b9
            ai2.c r12 = (ai2.C92010c) r12
            r0.mo142576l(r12)
        L_0x00b9:
            yh2.a r12 = r1.f330122a
            if (r12 != 0) goto L_0x00bf
            goto L_0x0164
        L_0x00bf:
            r12.setVisibility(r9)
            goto L_0x0164
        L_0x00c4:
            yh2.a r0 = new yh2.a
            r0.<init>(r2)
            r0.setStateResolve(r3)
            ai2.c r12 = (ai2.C92010c) r12
            r0.setCaptionItem(r12)
            r1.f330122a = r0
            int r12 = r5 / 2
            android.graphics.Rect r1 = zg2.C103020m.f303989e
            int r1 = r1.bottom
            r3 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r2 = kg3.C76577a.m92157h(r2, r3)
        L_0x00e0:
            r8 = r0
            int r1 = r1 - r2
            int r12 = r12 - r1
            float r12 = (float) r12
            float r0 = (float) r5
            float r12 = r12 / r0
            float r7 = r7 - r12
            goto L_0x0139
        L_0x00e8:
            ai2.h r8 = new ai2.h
            r8.<init>(r2)
            r8.setStateResolve(r3)
            ai2.n r12 = (ai2.C92020n) r12
            r8.setLyricsItem(r12)
            java.util.ArrayList<te3.cs2> r12 = r12.f263463g
            r8.mo125955o(r12)
            goto L_0x0139
        L_0x00fb:
            ai2.g r8 = new ai2.g
            r8.<init>(r2)
            r8.setStateResolve(r3)
            float r1 = r0.x
            float r0 = r0.y
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 != 0) goto L_0x010e
            r3 = 1
            goto L_0x010f
        L_0x010e:
            r3 = 0
        L_0x010f:
            if (r3 != 0) goto L_0x011f
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0116
            r9 = 1
        L_0x0116:
            if (r9 != 0) goto L_0x011f
            fi2.b r2 = r8.f263449s
            android.graphics.Matrix r2 = r2.f321806g
            r2.setScale(r1, r0)
        L_0x011f:
            ai2.f r12 = (ai2.C92012f) r12
            r8.setEmojiItem(r12)
            goto L_0x0139
        L_0x0125:
            ai2.t r8 = new ai2.t
            r8.<init>(r2)
            float r1 = r0.x
            float r0 = r0.y
            r8.mo126003j(r1, r0)
            r8.setStateResolve(r3)
            ai2.s r12 = (ai2.C92025s) r12
            r8.setText(r12)
        L_0x0139:
            if (r8 == 0) goto L_0x0142
            android.graphics.Rect r12 = zg2.C103020m.f303987c
            int r0 = zg2.C103020m.f303990f
            r8.mo53782m(r12, r0)
        L_0x0142:
            if (r8 == 0) goto L_0x0149
            android.graphics.Rect r12 = zg2.C103020m.f303988d
            r8.setValidArea(r12)
        L_0x0149:
            if (r8 == 0) goto L_0x014e
            r8.mo53773f(r4, r7)
        L_0x014e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "setDefaultLocation heightPercent:"
            r12.append(r0)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "MicroMsg.TimeEditViewParser"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
        L_0x0164:
            if (r8 == 0) goto L_0x018d
            android.widget.RelativeLayout$LayoutParams r12 = new android.widget.RelativeLayout$LayoutParams
            r0 = -1
            r12.<init>(r0, r0)
            android.view.ViewGroup r0 = r11.getItemLayout()
            r0.addView(r8, r12)
            boolean r12 = r11.f316775n
            if (r12 == 0) goto L_0x0181
            boolean r12 = r8 instanceof com.tencent.p014mm.plugin.gif.MMAnimateView
            if (r12 == 0) goto L_0x0181
            r12 = r8
            com.tencent.mm.plugin.gif.MMAnimateView r12 = (com.tencent.p014mm.plugin.gif.MMAnimateView) r12
            r12.mo129237x()
        L_0x0181:
            java.lang.Runnable r12 = r11.f316770F
            r11.removeCallbacks(r12)
            java.lang.Runnable r12 = r11.f316770F
            r0 = 1500(0x5dc, double:7.41E-321)
            r11.postDelayed(r12, r0)
        L_0x018d:
            boolean r12 = r8 instanceof yh2.C102864a
            if (r12 == 0) goto L_0x019b
            yh2.a r8 = (yh2.C102864a) r8
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$f r12 = new com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer$f
            r12.<init>(r11)
            r8.setClearCaptionListener(r12)
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit.TimeEditorItemContainer.mo152264j(ai2.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r3 = (ai2.C92015i) r3;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<bi2.C92262a> mo152265k(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "objectId"
            gy3.C87412m.m108594g(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewGroup r1 = r6.getItemLayout()
            int r1 = r1.getChildCount()
            r2 = 0
        L_0x0013:
            if (r2 >= r1) goto L_0x0040
            android.view.ViewGroup r3 = r6.getItemLayout()
            android.view.View r3 = r3.getChildAt(r2)
            boolean r4 = r3 instanceof ai2.C92015i
            if (r4 == 0) goto L_0x003d
            ai2.i r3 = (ai2.C92015i) r3
            ai2.a r4 = r3.mo53771d()
            if (r4 == 0) goto L_0x003d
            java.lang.String r4 = r4.f263405d
            boolean r4 = gy3.C87412m.m108589b(r4, r7)
            if (r4 == 0) goto L_0x003d
            r4 = 0
            r5 = 1
            bi2.a r3 = ai2.C92015i.C92016a.m115609a(r3, r4, r5, r4)
            gy3.C87412m.m108591d(r3)
            r0.add(r3)
        L_0x003d:
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0040:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit.TimeEditorItemContainer.mo152265k(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: l */
    public final void mo152266l() {
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            if (childAt instanceof C92013g) {
                ((C92013g) childAt).pause();
            }
        }
    }

    /* renamed from: m */
    public final void mo152267m(C92011d dVar) {
        C87412m.m108594g(dVar, "type");
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            if (childAt instanceof C102864a) {
                C102864a aVar = (C102864a) childAt;
                aVar.getClass();
                C92010c cVar = aVar.f303637n;
                if ((cVar != null ? cVar.f263402a : null) == dVar) {
                    getItemLayout().removeView(getItemLayout().getChildAt(i));
                    return;
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo152268n(C98129b bVar) {
        C87412m.m108594g(bVar, "type");
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.view.IEditView");
            if (((C107818f) childAt).getType() == bVar) {
                getItemLayout().removeViewAt(i);
                return;
            }
        }
    }

    /* renamed from: o */
    public final void mo152269o(View view, boolean z) {
        if (!z) {
            this.f316783v = null;
            getTimeEditIcon().setVisibility(4);
        } else if (!C87412m.m108589b(view, this.f316783v)) {
            View view2 = this.f316783v;
            if (view2 != null) {
                view2.setActivated(false);
            }
            this.f316783v = view;
            if (view != null) {
                view.bringToFront();
            }
        }
        if (view != null) {
            view.setActivated(z);
        }
    }

    public void onFinish() {
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105924i("MicroMsg.TimeEditorItemContainer", "onSizeChanged, w:" + i + ", h:" + i2);
        this.f316776o.set(0, 0, i, i2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View view;
        C87412m.m108594g(motionEvent, "event");
        if (motionEvent.getActionMasked() == 0 && (view = this.f316783v) != null) {
            C87412m.m108591d(view);
            mo152269o(view, false);
            C32226l<? super Boolean, C13598b0> lVar = this.f316767C;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void mo152272p() {
        getItemLayout().removeAllViews();
        getTimeEditIcon().setVisibility(4);
    }

    /* renamed from: q */
    public final void mo152273q() {
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            if ((childAt instanceof C92013g) && !this.f316775n) {
                ((C92013g) childAt).resume();
            }
        }
    }

    /* renamed from: r */
    public final void mo152274r() {
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getItemLayout().getChildAt(i) instanceof C102864a) {
                View childAt = getItemLayout().getChildAt(i);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = childAt;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditorItemContainer", "showCaptionItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditorItemContainer", "showCaptionItemView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
        }
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.f316787z = onClickListener;
    }

    public final void setDeleteStateListener(C32226l<? super Boolean, C13598b0> lVar) {
        this.f316784w = lVar;
    }

    public final void setEnableTouch(boolean z) {
        this.f316769E = z;
    }

    public final void setItemChangeListener(C32226l<? super View, C13598b0> lVar) {
        this.f316785x = lVar;
    }

    public final void setReadTextListener(C32226l<? super C92007a, C13598b0> lVar) {
        this.f316766B = lVar;
    }

    public final void setSegmentOffset(long j) {
        this.f316768D = j;
    }

    public final void setShowCaptionDialogListener(C32226l<? super C102864a, C13598b0> lVar) {
        this.f316765A = lVar;
    }

    public final void setTimeEditClickListener(C32226l<? super C92007a, C13598b0> lVar) {
        this.f316786y = lVar;
    }

    public final void setTimeEditMenuChangeListener(C32226l<? super Boolean, C13598b0> lVar) {
        this.f316767C = lVar;
    }

    /* renamed from: t */
    public final void mo152284t(String str) {
        C87412m.m108594g(str, "objectId");
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getItemLayout().getChildAt(i) instanceof C107818f) {
                View childAt = getItemLayout().getChildAt(i);
                C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.view.IEditView");
                ((C107818f) childAt).mo53772e(str);
            }
        }
    }

    /* renamed from: v */
    public final void mo152285v() {
        View view = this.f316783v;
        C103373k kVar = null;
        C107818f fVar = view instanceof C107818f ? (C107818f) view : null;
        C92007a editorData = fVar != null ? fVar.getEditorData() : null;
        if (editorData instanceof C103373k) {
            kVar = (C103373k) editorData;
        }
        boolean a = kVar != null ? kVar.mo125979a() : false;
        C110361b timeEditIcon = getTimeEditIcon();
        timeEditIcon.getClass();
        int i = a ? 0 : 4;
        View findViewById = timeEditIcon.f330116p.findViewById(C0966R.C0970id.b_4);
        if (findViewById != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "doSetMenuChecked", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "doSetMenuChecked", "(Landroid/view/ViewGroup;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: w */
    public final void mo152286w(C92007a aVar) {
        C87412m.m108594g(aVar, "info");
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getItemLayout().getChildAt(i);
            C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.view.IEditView");
            if (C87412m.m108589b(((C107818f) childAt).getEditorData(), aVar)) {
                C110364c cVar = this.f316773i;
                View childAt2 = getItemLayout().getChildAt(i);
                C87412m.m108593f(childAt2, "itemLayout.getChildAt(i)");
                cVar.getClass();
                if (C110364c.C100975a.f295680a[aVar.f263402a.ordinal()] == 2) {
                    C92026t tVar = (C92026t) childAt2;
                    tVar.setText((C92025s) aVar);
                    tVar.setEnableNotify(true);
                    tVar.setVisibility(0);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: x */
    public final void mo152287x(Rect rect) {
        C87412m.m108594g(rect, "validRect");
        int childCount = getItemLayout().getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getItemLayout().getChildAt(i) instanceof C107818f) {
                View childAt = getItemLayout().getChildAt(i);
                C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.view.IEditView");
                ((C107818f) childAt).setValidArea(rect);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimeEditorItemContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
