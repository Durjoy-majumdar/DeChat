package com.tencent.p014mm.plugin.vlog.p117ui;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import ai2.C92007a;
import ai2.C92018l;
import ai2.C92023q;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Size;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostPagePreviewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.MultiMediaEditResultStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$ImageMediaItem;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorInputView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BasePluginLayout;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.plugin.vlog.model.C106195f0;
import com.tencent.p014mm.plugin.vlog.model.C106204p;
import com.tencent.p014mm.plugin.vlog.model.C106205q0;
import com.tencent.p014mm.plugin.vlog.model.C106206s;
import com.tencent.p014mm.plugin.vlog.model.C30517h0;
import com.tencent.p014mm.plugin.vlog.model.C57463v;
import com.tencent.p014mm.plugin.vlog.model.C57465w;
import com.tencent.p014mm.plugin.vlog.model.C96536f;
import com.tencent.p014mm.plugin.vlog.model.C96543i;
import com.tencent.p014mm.plugin.vlog.model.C96551o;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.model.FinderVideoShell;
import com.tencent.p014mm.plugin.vlog.p117ui.plugin.timeedit.TimeEditorItemContainer;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.MultiEditCropLayout;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.MultiEditCropOperationLayout;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.PhotoMaskView;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.VLogThumbView;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import com.tencent.xweb.IXWebBroadcastListener;
import d23.C106976a;
import e23.C97592a;
import ei2.C31606c;
import ei2.C97651f;
import f14.C58901s;
import f23.C97814a;
import f23.C97822c;
import fy3.C32224a;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C59917q;
import hi2.C98453h;
import hi2.C98463n;
import hi2.C98464o;
import i23.C8847a;
import i23.C98592b;
import ih2.C60287a;
import j20.C117292a;
import j23.C108531a;
import j23.C108536c;
import j23.C98898e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import l23.C109154a;
import l23.C109165b0;
import l23.C109168c0;
import l23.C109171d0;
import l23.C109184f0;
import l23.C109190g0;
import l23.C109201i0;
import l23.C109202j;
import l23.C109213j0;
import l23.C109217n0;
import l23.C109219q0;
import l23.C109232t0;
import l23.C109235u0;
import l23.C109245y0;
import l23.C61196g;
import l23.C61205o0;
import l23.C99306m0;
import l23.C99318r0;
import l23.C99324x;
import l23.C99325y;
import l23.C99327z;
import lh2.C109344g0;
import lh2.C109348i;
import lh2.C109359m;
import lh2.C99426e;
import lh2.C99447k;
import lw1.C99685b;
import m23.C109475c;
import o23.C109923a;
import o40.C61926c;
import org.json.JSONObject;
import p23.C110130b;
import p813fl.C97942y;
import p813fl.C97944z;
import q23.C110351a;
import qh2.C101198e;
import r23.C110496a;
import rr3.C110625c0;
import rr3.C110629f;
import rr3.C110644t;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C13605o;
import sp3.C110801c;
import sp3.C110803f;
import sx3.C64197v;
import te3.C49712hj1;
import te3.C64869yy;
import te3.C64899zy;
import th2.C110991c;
import th2.C110992d;
import uh2.C111175f;
import uh2.C111176g;
import uh2.C111177h;
import wg2.C102440a;
import wx3.C15601d;
import xx3.C15911a;
import y23.C112386e;
import y23.C112389i;
import yx3.C91590f;
import yx3.C91594j;
import zg2.C103020m;
import zp3.C112660e0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0004@\u0004X.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BasePluginLayout;", "Lqh2/e;", "Ll23/j$b;", "Ld23/a$c;", "template", "Lrx3/b0;", "setupTemplateVideoPlugins", "", "selectFirst", "setupImageEditPlugins", "Ll23/j;", "K", "Ll23/j;", "getMultiPreviewPlugin", "()Ll23/j;", "setMultiPreviewPlugin", "(Ll23/j;)V", "multiPreviewPlugin", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "h1", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "getCurrentStyle", "()Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;", "setCurrentStyle", "(Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout$h;)V", "currentStyle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout */
public class MultiVideoFullScreenPluginLayout extends BasePluginLayout implements C101198e, C109202j.C99300b {

    /* renamed from: o1 */
    public static final /* synthetic */ int f316537o1 = 0;

    /* renamed from: A */
    public final C109359m f316538A;

    /* renamed from: B */
    public final C61205o0 f316539B;

    /* renamed from: C */
    public final C109923a f316540C;

    /* renamed from: D */
    public String f316541D = "";

    /* renamed from: E */
    public boolean f316542E = true;

    /* renamed from: F */
    public RecordConfigProvider f316543F;

    /* renamed from: G */
    public C98324b f316544G;

    /* renamed from: H */
    public C106195f0 f316545H = new C106195f0();

    /* renamed from: I */
    public boolean f316546I;

    /* renamed from: J */
    public boolean f316547J;

    /* renamed from: K */
    public C109202j f316548K;

    /* renamed from: L */
    public C61196g f316549L;

    /* renamed from: M */
    public C109168c0 f316550M;

    /* renamed from: N */
    public C109232t0 f316551N;

    /* renamed from: P */
    public final C109235u0 f316552P;

    /* renamed from: Q */
    public final C109154a f316553Q;

    /* renamed from: Q0 */
    public final C99306m0 f316554Q0;

    /* renamed from: R */
    public final C110130b f316555R;

    /* renamed from: R0 */
    public final C109201i0 f316556R0;

    /* renamed from: S */
    public C59917q f316557S = new C59917q();

    /* renamed from: S0 */
    public final C109245y0 f316558S0;

    /* renamed from: T */
    public C99324x f316559T;

    /* renamed from: T0 */
    public final C109190g0 f316560T0;

    /* renamed from: U */
    public C99327z f316561U;

    /* renamed from: U0 */
    public final C109171d0 f316562U0;

    /* renamed from: V */
    public final C109165b0 f316563V;

    /* renamed from: V0 */
    public View f316564V0;

    /* renamed from: W */
    public final C109219q0 f316565W;

    /* renamed from: W0 */
    public final View f316566W0;

    /* renamed from: X0 */
    public final View f316567X0;

    /* renamed from: Y0 */
    public final PhotoMaskView f316568Y0;

    /* renamed from: Z0 */
    public boolean f316569Z0;

    /* renamed from: a1 */
    public final ViewStub f316570a1;

    /* renamed from: b1 */
    public boolean f316571b1;

    /* renamed from: c1 */
    public boolean f316572c1;

    /* renamed from: d1 */
    public boolean f316573d1;

    /* renamed from: e1 */
    public String f316574e1 = "";

    /* renamed from: f1 */
    public String f316575f1 = "";

    /* renamed from: g1 */
    public ArrayList<GalleryItem$MediaItem> f316576g1 = new ArrayList<>();

    /* renamed from: h */
    public View f316577h;

    /* renamed from: h1 */
    public WxCropOperationLayout.C94436h f316578h1 = WxCropOperationLayout.C94436h.RECT_ADJUST;

    /* renamed from: i */
    public C102440a f316579i;

    /* renamed from: i1 */
    public C110991c f316580i1 = new C110991c();

    /* renamed from: j */
    public long f316581j = 60000;

    /* renamed from: j1 */
    public boolean f316582j1;

    /* renamed from: k1 */
    public C108536c f316583k1 = C108536c.GLOBAL_EDIT;

    /* renamed from: l1 */
    public final int f316584l1 = Color.parseColor("#232323");

    /* renamed from: m1 */
    public boolean f316585m1;

    /* renamed from: n */
    public int f316586n = 1080;

    /* renamed from: n1 */
    public long f316587n1;

    /* renamed from: o */
    public int f316588o = 1080;

    /* renamed from: p */
    public int f316589p = 90;

    /* renamed from: p0 */
    public final C110496a f316590p0;

    /* renamed from: q */
    public String f316591q = "";

    /* renamed from: r */
    public final C110351a f316592r;

    /* renamed from: s */
    public final C109184f0 f316593s;

    /* renamed from: t */
    public C99426e f316594t;

    /* renamed from: u */
    public C109348i f316595u;

    /* renamed from: v */
    public C99318r0 f316596v;

    /* renamed from: w */
    public C108531a f316597w;

    /* renamed from: x */
    public C109475c f316598x;

    /* renamed from: x0 */
    public final C109213j0 f316599x0;

    /* renamed from: y */
    public C99325y f316600y;

    /* renamed from: y0 */
    public final C109217n0 f316601y0;

    /* renamed from: z */
    public final C99447k f316602z;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$a */
    public static final class C96562a extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f282628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96562a(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
            super(2);
            this.f282628d = multiVideoFullScreenPluginLayout;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            if (intValue != intValue2) {
                String str = this.f282628d.f316545H.f316425d.get(intValue);
                C87412m.m108593f(str, "multiMedia.pathList[from]");
                this.f282628d.f316545H.f316425d.remove(intValue);
                this.f282628d.f316545H.f316425d.add(intValue2, str);
                Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "user change image index from:" + intValue + " to:" + intValue2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$d */
    public static final class C96563d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f282629d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<C92007a> f282630e;

        /* renamed from: f */
        public final /* synthetic */ C96552p0 f282631f;

        /* renamed from: g */
        public final /* synthetic */ C96543i f282632g;

        /* renamed from: h */
        public final /* synthetic */ String f282633h;

        /* renamed from: i */
        public final /* synthetic */ Size f282634i;

        /* renamed from: j */
        public final /* synthetic */ Rect f282635j;

        /* renamed from: n */
        public final /* synthetic */ Rect f282636n;

        /* renamed from: o */
        public final /* synthetic */ C8479f0<float[]> f282637o;

        /* renamed from: p */
        public final /* synthetic */ boolean f282638p;

        /* renamed from: q */
        public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f282639q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96563d(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, ArrayList<C92007a> arrayList, C96552p0 p0Var, C96543i iVar, String str, Size size, Rect rect, Rect rect2, C8479f0<float[]> f0Var, boolean z, C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar) {
            super(0);
            this.f282629d = multiVideoFullScreenPluginLayout;
            this.f282630e = arrayList;
            this.f282631f = p0Var;
            this.f282632g = iVar;
            this.f282633h = str;
            this.f282634i = size;
            this.f282635j = rect;
            this.f282636n = rect2;
            this.f282637o = f0Var;
            this.f282638p = z;
            this.f282639q = qVar;
        }

        public Object invoke() {
            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f282629d;
            int i = MultiVideoFullScreenPluginLayout.f316537o1;
            multiVideoFullScreenPluginLayout.getClass();
            C61926c.m72657B("MultiVideoPluginLayout_report", true, new C98898e(multiVideoFullScreenPluginLayout, 1));
            C97814a aVar = C97814a.f286944a;
            aVar.mo137153d(this.f282630e);
            aVar.mo137152c(this.f282631f);
            if (this.f282629d.f316572c1) {
                aVar.mo137151b(116);
                C108531a aVar2 = this.f282629d.f316597w;
                if (aVar2 != null) {
                    AudioCacheInfo audioCacheInfo = aVar2.f324881p;
                    if (audioCacheInfo != null && audioCacheInfo.f163824s) {
                        aVar.mo137151b(117);
                    }
                } else {
                    C87412m.m108603p("addMusicPlugin");
                    throw null;
                }
            }
            C96543i iVar = this.f282632g;
            String str = this.f282633h;
            C87412m.m108593f(str, "outPath");
            RecordConfigProvider recordConfigProvider = this.f282629d.f316543F;
            C87412m.m108591d(recordConfigProvider);
            VideoTransPara videoTransPara = recordConfigProvider.f272926n;
            C87412m.m108593f(videoTransPara, "configProvider!!.videoParam");
            C57465w.C57466a.m66223a(iVar, str, videoTransPara, this.f282634i, this.f282635j, false, !this.f282629d.f316562U0.f326891z, 16, (Object) null);
            this.f282632g.mo134599c(this.f282636n, (float[]) this.f282637o.f27484d, this.f282630e);
            C96543i iVar2 = this.f282632g;
            C99327z zVar = this.f282629d.f316561U;
            if (zVar != null) {
                iVar2.mo134600d(zVar.f291256r.f264201a);
                MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout2 = this.f282629d;
                if (multiVideoFullScreenPluginLayout2.f316571b1) {
                    this.f282632g.mo134601e(multiVideoFullScreenPluginLayout2.f316554Q0.mo138709x());
                }
                C64899zy a = this.f282632g.mo81180a();
                MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout3 = this.f282629d;
                a.f186911s = multiVideoFullScreenPluginLayout3.f316575f1;
                C109202j multiPreviewPlugin = multiVideoFullScreenPluginLayout3.getMultiPreviewPlugin();
                a.f186912t = !C87412m.m108589b(multiPreviewPlugin.mo160444B(), multiPreviewPlugin.f326983z);
                if (this.f282638p) {
                    if (this.f282629d.f316562U0.f326891z) {
                        Rect rect = new Rect();
                        C96551o.m123876f(a.f186904i.f297899g, rect);
                        this.f282631f.mo81183b(rect);
                    }
                    C31606c e = C96551o.m123875e(a);
                    ((C97651f) e).start();
                    this.f282631f.mo134622s(e);
                    this.f282631f.mo134617n(a.f186904i.f297901i, new C30522b(e, this.f282639q, a));
                } else {
                    C96536f fVar = new C96536f();
                    fVar.f282497b = false;
                    RecordConfigProvider recordConfigProvider2 = this.f282629d.f316543F;
                    C87412m.m108591d(recordConfigProvider2);
                    VideoTransPara videoTransPara2 = recordConfigProvider2.f272926n;
                    C87412m.m108593f(videoTransPara2, "configProvider!!.videoParam");
                    fVar.mo81173a(true, videoTransPara2);
                    C57463v.C57464a.m66220b(fVar, a, false, new C30524d(this.f282639q), 2, (Object) null);
                }
                return C13598b0.f38549a;
            }
            C87412m.m108603p("editMagicPlugin");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$e */
    public static final class C96564e extends C87413o implements C32228q<Boolean, String, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f282640d;

        /* renamed from: e */
        public final /* synthetic */ int f282641e;

        /* renamed from: f */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f282642f;

        /* renamed from: g */
        public final /* synthetic */ C99685b.C99690d f282643g;

        /* renamed from: h */
        public final /* synthetic */ String[] f282644h;

        /* renamed from: i */
        public final /* synthetic */ ArrayList<String> f282645i;

        /* renamed from: j */
        public final /* synthetic */ ArrayList<Rect> f282646j;

        /* renamed from: n */
        public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f282647n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96564e(C8479f0<String> f0Var, int i, MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C99685b.C99690d dVar, String[] strArr, ArrayList<String> arrayList, ArrayList<Rect> arrayList2, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
            super(3);
            this.f282640d = f0Var;
            this.f282641e = i;
            this.f282642f = multiVideoFullScreenPluginLayout;
            this.f282643g = dVar;
            this.f282644h = strArr;
            this.f282645i = arrayList;
            this.f282646j = arrayList2;
            this.f282647n = captureVideoNormalModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x013a, code lost:
            if ((r4 != null && r4.f288182c) != false) goto L_0x013c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r9 = r23
                java.lang.String r9 = (java.lang.String) r9
                r2 = r24
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r10 = r2.booleanValue()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "photoEditItemContainer source:"
                r2.append(r3)
                gy3.f0<java.lang.String> r3 = r0.f282640d
                T r3 = r3.f27484d
                java.lang.String r3 = (java.lang.String) r3
                r2.append(r3)
                java.lang.String r3 = " ret:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r3 = " result:"
                r2.append(r3)
                r2.append(r9)
                java.lang.String r3 = " index:"
                r2.append(r3)
                int r3 = r0.f282641e
                r2.append(r3)
                r3 = 32
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "MicroMsg.MultiVideoFullScreenPluginLayout"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                r11 = 0
                r12 = 1
                if (r1 == 0) goto L_0x0227
                if (r9 == 0) goto L_0x0227
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r1 = r0.f282642f
                l23.j r1 = r1.getMultiPreviewPlugin()
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r2 = r0.f282642f
                com.tencent.mm.plugin.vlog.model.f0 r2 = r2.f316545H
                java.util.LinkedList<java.lang.String> r2 = r2.f316425d
                int r3 = r0.f282641e
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r13 = "multiMedia.pathList[index]"
                gy3.C87412m.m108593f(r2, r13)
                java.lang.String r2 = (java.lang.String) r2
                com.tencent.mm.plugin.vlog.model.p r1 = r1.mo160445C(r2)
                android.graphics.Rect r14 = new android.graphics.Rect
                r14.<init>()
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r2 = r0.f282642f
                l23.j r2 = r2.getMultiPreviewPlugin()
                android.graphics.RectF r2 = r2.f326972o
                r2.round(r14)
                android.graphics.Rect r15 = new android.graphics.Rect
                android.graphics.Rect r2 = r1.f316486d
                r15.<init>(r2)
                int r2 = r14.top
                r15.offset(r11, r2)
                lw1.b$d r2 = r0.f282643g
                r4 = 1
                android.graphics.Matrix r5 = new android.graphics.Matrix
                android.graphics.Matrix r3 = r1.f316483a
                r5.<init>(r3)
                android.graphics.Rect r6 = new android.graphics.Rect
                r6.<init>(r14)
                android.graphics.Rect r8 = new android.graphics.Rect
                android.graphics.Rect r3 = r1.f316485c
                r8.<init>(r3)
                r3 = r9
                r7 = r15
                ds.m$c r2 = r2.mo139054a(r3, r4, r5, r6, r7, r8)
                java.lang.String r3 = r2.f25774b
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative((java.lang.String) r3)
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r4 = r0.f282642f
                q23.a r5 = r4.f316592r
                com.tencent.mm.plugin.vlog.model.f0 r4 = r4.f316545H
                java.util.LinkedList<java.lang.String> r4 = r4.f316425d
                int r6 = r0.f282641e
                java.lang.Object r4 = r4.get(r6)
                gy3.C87412m.m108593f(r4, r13)
                java.lang.String r4 = (java.lang.String) r4
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r6 = r0.f282642f
                android.content.Context r6 = r6.getContext()
                int r6 = kg3.C76577a.m92145A(r6)
                android.graphics.Bitmap r4 = r5.mo161848F(r4, r6)
                if (r4 == 0) goto L_0x00ff
                android.graphics.RectF r5 = new android.graphics.RectF
                r5.<init>()
                int r6 = r15.width()
                int r7 = r15.height()
                int r6 = r6 * r7
                int r7 = r14.width()
                int r8 = r14.height()
                int r7 = r7 * r8
                if (r6 <= r7) goto L_0x00f6
                r5.set(r14)
                goto L_0x00fb
            L_0x00f6:
                android.graphics.Rect r1 = r1.f316486d
                r5.set(r1)
            L_0x00fb:
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.blendBitmap(r3, r4, r5)
            L_0x00ff:
                i33.b r1 = i33.C98595b.f289089a
                r16 = 0
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r5 = r0.f282642f
                int r5 = r5.f316589p
                java.lang.String r6 = "blendBitmap"
                gy3.C87412m.m108593f(r3, r6)
                java.lang.String r6 = r2.f25774b
                r15 = r1
                r18 = r5
                r19 = r3
                r20 = r6
                r15.mo137987e(r16, r18, r19, r20)
                java.lang.String r5 = r2.f25774b
                r1.mo137986d(r9, r5)
                java.lang.String[] r5 = r0.f282644h
                int r6 = r0.f282641e
                java.lang.String r7 = r2.f25774b
                java.lang.String r7 = com.tencent.p014mm.vfs.C86013q1.m106448i(r7, r11)
                r5[r6] = r7
                if (r10 != 0) goto L_0x013c
                if (r4 != 0) goto L_0x013c
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r4 = r0.f282642f
                h90.b r4 = r4.f316544G
                if (r4 == 0) goto L_0x0139
                boolean r4 = r4.f288182c
                if (r4 != r12) goto L_0x0139
                r4 = 1
                goto L_0x013a
            L_0x0139:
                r4 = 0
            L_0x013a:
                if (r4 == 0) goto L_0x0158
            L_0x013c:
                hi2.h r4 = hi2.C98453h.f288774a
                java.lang.String r4 = r2.f25774b
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto L_0x0158
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
                if (r5 == 0) goto L_0x0158
                zt3.t r5 = zt3.C119157j.f356862d
                hi2.j r6 = new hi2.j
                r6.<init>(r4)
                zt3.j r5 = (zt3.C119157j) r5
                r5.mo183875f(r6)
            L_0x0158:
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r4 = r0.f282642f
                l23.j r4 = r4.getMultiPreviewPlugin()
                r4.getClass()
                android.graphics.Rect r5 = new android.graphics.Rect
                r5.<init>()
                com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout r4 = r4.f326967g
                android.graphics.RectF r4 = r4.getVisibilityRect()
                r4.round(r5)
                int r4 = r14.left
                int r4 = -r4
                int r6 = r14.top
                int r6 = -r6
                r5.offset(r4, r6)
                int r4 = r3.getWidth()
                float r4 = (float) r4
                int r6 = r14.width()
                float r6 = (float) r6
                float r4 = r4 / r6
                int r6 = r3.getHeight()
                float r6 = (float) r6
                int r7 = r14.height()
                float r7 = (float) r7
                float r6 = r6 / r7
                android.graphics.Rect r7 = new android.graphics.Rect
                int r8 = r5.left
                float r8 = (float) r8
                float r8 = r8 * r4
                int r8 = (int) r8
                int r10 = r5.top
                float r10 = (float) r10
                float r10 = r10 * r6
                int r10 = (int) r10
                int r13 = r5.right
                float r13 = (float) r13
                float r13 = r13 * r4
                int r4 = (int) r13
                int r5 = r5.bottom
                float r5 = (float) r5
                float r5 = r5 * r6
                int r5 = (int) r5
                r7.<init>(r8, r10, r4, r5)
                int r4 = r7.left
                int r5 = r7.top
                int r18 = r7.width()
                int r19 = r7.height()
                r20 = 1
                r15 = r3
                r16 = r4
                r17 = r5
                android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.cropBitmap(r15, r16, r17, r18, r19, r20)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r2 = r2.f25774b
                r4.append(r2)
                java.lang.String r2 = "_half"
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                if (r3 == 0) goto L_0x0227
                r16 = 0
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r4 = r0.f282642f
                int r4 = r4.f316589p
                r15 = r1
                r18 = r4
                r19 = r3
                r20 = r2
                r15.mo137987e(r16, r18, r19, r20)
                r1.mo137986d(r9, r2)
                java.util.ArrayList<java.lang.String> r1 = r0.f282645i
                java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106448i(r2, r11)
                if (r2 != 0) goto L_0x01f4
                java.lang.String r2 = ""
            L_0x01f4:
                r1.add(r2)
                java.util.ArrayList<android.graphics.Rect> r1 = r0.f282646j
                r1.add(r7)
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r1 = r0.f282642f
                l23.d0 r1 = r1.f316562U0
                boolean r1 = r1.f326891z
                if (r1 == 0) goto L_0x0227
                java.lang.String[] r1 = r0.f282644h
                int r2 = r0.f282641e
                java.util.ArrayList<java.lang.String> r4 = r0.f282645i
                java.lang.Object r4 = r4.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                r1[r2] = r4
                java.util.ArrayList<android.graphics.Rect> r1 = r0.f282646j
                int r2 = r0.f282641e
                java.lang.Object r1 = r1.get(r2)
                android.graphics.Rect r1 = (android.graphics.Rect) r1
                int r2 = r3.getWidth()
                int r3 = r3.getHeight()
                r1.set(r11, r11, r2, r3)
            L_0x0227:
                int r1 = r0.f282641e
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r2 = r0.f282642f
                com.tencent.mm.plugin.vlog.model.f0 r2 = r2.f316545H
                java.util.LinkedList<java.lang.String> r2 = r2.f316425d
                int r2 = r2.size()
                int r2 = r2 - r12
                if (r1 < r2) goto L_0x028c
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r1 = r0.f282642f
                h90.b r1 = r1.f316544G
                if (r1 == 0) goto L_0x0241
                boolean r2 = r1.f288182c
                if (r2 != r12) goto L_0x0241
                r11 = 1
            L_0x0241:
                if (r11 == 0) goto L_0x024e
                hi2.h r2 = hi2.C98453h.f288774a
                if (r1 == 0) goto L_0x024a
                java.lang.String r1 = r1.f288189j
                goto L_0x024b
            L_0x024a:
                r1 = 0
            L_0x024b:
                r2.mo137810h(r1)
            L_0x024e:
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r1 = r0.f282647n
                java.lang.String[] r2 = r0.f282644h
                java.util.List r2 = sx3.C110823p.m151001a0(r2)
                java.util.List<java.lang.String> r1 = r1.f272899j
                r1.addAll(r2)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
                android.os.Bundle r1 = r1.f272892b
                java.util.ArrayList<java.lang.String> r2 = r0.f282645i
                java.lang.String r3 = "KEY_POST_HALF_IMAGE_LIST"
                r1.putStringArrayList(r3, r2)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
                android.os.Bundle r1 = r1.f272892b
                java.util.ArrayList<android.graphics.Rect> r2 = r0.f282646j
                java.lang.String r3 = "KEY_POST_HALF_RECT_LIST"
                r1.putParcelableArrayList(r3, r2)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
                android.os.Bundle r1 = r1.f272892b
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r2 = r0.f282642f
                java.lang.String r2 = r2.f316541D
                java.lang.String r3 = "KEY_POST_ORIGIN_FILE_PATH"
                r1.putString(r3, r2)
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r2 = r0.f282642f
                android.content.Context r2 = r2.getContext()
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r3 = r0.f282647n
                r1.mo129794a(r2, r3)
                goto L_0x02ac
            L_0x028c:
                com.tencent.mm.cache.ArtistCacheManager r1 = com.tencent.p014mm.cache.ArtistCacheManager.m140185a()
                gy3.f0<java.lang.String> r2 = r0.f282640d
                T r2 = r2.f27484d
                java.lang.String r2 = (java.lang.String) r2
                r1.mo148163f(r2)
                com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout r3 = r0.f282642f
                lw1.b$d r4 = r0.f282643g
                java.lang.String[] r5 = r0.f282644h
                java.util.ArrayList<java.lang.String> r6 = r0.f282645i
                java.util.ArrayList<android.graphics.Rect> r7 = r0.f282646j
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r8 = r0.f282647n
                int r1 = r0.f282641e
                int r9 = r1 + 1
                r3.mo152183o(r4, r5, r6, r7, r8, r9)
            L_0x02ac:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.C96564e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$k */
    public static final class C96565k extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f282648d;

        /* renamed from: e */
        public final /* synthetic */ C99685b.C99690d f282649e;

        /* renamed from: f */
        public final /* synthetic */ String[] f282650f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<String> f282651g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList<Rect> f282652h;

        /* renamed from: i */
        public final /* synthetic */ CaptureDataManager.CaptureVideoNormalModel f282653i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96565k(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C99685b.C99690d dVar, String[] strArr, ArrayList<String> arrayList, ArrayList<Rect> arrayList2, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
            super(2);
            this.f282648d = multiVideoFullScreenPluginLayout;
            this.f282649e = dVar;
            this.f282650f = strArr;
            this.f282651g = arrayList;
            this.f282652h = arrayList2;
            this.f282653i = captureVideoNormalModel;
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            if (((Boolean) obj).booleanValue()) {
                if (!(str == null || str.length() == 0)) {
                    Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "download music success, " + str);
                    C0001s1 s1Var = C0001s1.f0d;
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C96575e(this.f282648d, str, this.f282649e, this.f282650f, this.f282651g, this.f282652h, this.f282653i, (C15601d<? super C96575e>) null), 2, (Object) null);
                    return C13598b0.f38549a;
                }
            }
            Log.m105920e("MicroMsg.MultiVideoFullScreenPluginLayout", "download music failed");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$l */
    public static final class C96566l extends C87413o implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f282654d;

        /* renamed from: e */
        public final /* synthetic */ C32228q<Boolean, C64899zy, Bitmap, C13598b0> f282655e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96566l(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C32228q<? super Boolean, ? super C64899zy, ? super Bitmap, C13598b0> qVar) {
            super(2);
            this.f282654d = multiVideoFullScreenPluginLayout;
            this.f282655e = qVar;
        }

        public Object invoke(Object obj, Object obj2) {
            T t = (String) obj2;
            if (((Boolean) obj).booleanValue()) {
                if (!(t == null || t.length() == 0)) {
                    Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "download music success, " + t);
                    C8479f0 f0Var = new C8479f0();
                    f0Var.f27484d = t;
                    C0001s1 s1Var = C0001s1.f0d;
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C96576f(this.f282654d, f0Var, t, this.f282655e, (C15601d<? super C96576f>) null), 2, (Object) null);
                    return C13598b0.f38549a;
                }
            }
            Log.m105920e("MicroMsg.MultiVideoFullScreenPluginLayout", "download music failed");
            this.f282654d.f316539B.mo86128x();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$m */
    public static final class C96567m extends C87413o implements C32228q<Boolean, C64899zy, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f282656d;

        /* renamed from: e */
        public final /* synthetic */ String f282657e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96567m(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, String str) {
            super(3);
            this.f282656d = multiVideoFullScreenPluginLayout;
            this.f282657e = str;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C64899zy zyVar = (C64899zy) obj2;
            Bitmap bitmap = (Bitmap) obj3;
            this.f282656d.f316539B.mo86128x();
            this.f282656d.mo152176E();
            if (booleanValue) {
                boolean z = false;
                if (zyVar == null) {
                    SightVideoJNI.optimizeMP4VFS(this.f282657e);
                    String str = this.f282657e + "_thumb";
                    C98453h hVar = C98453h.f288774a;
                    String str2 = this.f282657e;
                    C87412m.m108593f(str2, "outPath");
                    C98453h.m127895t(hVar, str2, str, 0, 4, (Object) null);
                    C98464o oVar = C98464o.f288797a;
                    String str3 = this.f282657e;
                    C87412m.m108593f(str3, "outPath");
                    C98464o.C98465a a = oVar.mo137832a(str3);
                    Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "vlog video output path:" + this.f282657e + " info:" + a);
                    CaptureDataManager.f272890c.mo129794a(this.f282656d.getContext(), new CaptureDataManager.CaptureVideoNormalModel(Boolean.valueOf(booleanValue), this.f282657e, str, Long.valueOf((long) (a != null ? a.f288800c : 0)), Boolean.FALSE, C110992d.f332425a.mo162676j()));
                    C98324b bVar = this.f282656d.f316544G;
                    if (bVar != null && bVar.f288182c) {
                        z = true;
                    }
                    if (z) {
                        ((C119157j) C119157j.f356862d).mo183875f(new C98463n(bVar));
                    }
                    if (this.f282656d.f316582j1) {
                        hVar.mo137815m(this.f282657e);
                    }
                } else {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    RecordConfigProvider recordConfigProvider = this.f282656d.f316543F;
                    C87412m.m108591d(recordConfigProvider);
                    BitmapUtil.saveBitmapToImage(bitmap, 60, compressFormat, recordConfigProvider.f272902C, true);
                    Boolean bool = Boolean.TRUE;
                    RecordConfigProvider recordConfigProvider2 = this.f282656d.f316543F;
                    C87412m.m108591d(recordConfigProvider2);
                    CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel = new CaptureDataManager.CaptureVideoNormalModel(bool, "", recordConfigProvider2.f272902C, -1L, Boolean.FALSE, C110992d.f332425a.mo162676j());
                    C64869yy yyVar = zyVar.f186906n;
                    C98324b bVar2 = this.f282656d.f316544G;
                    if (bVar2 != null) {
                        z = bVar2.f288182c;
                    }
                    yyVar.f186612f = z;
                    CaptureDataManager.f272890c.f272892b.putByteArray("video_composition", zyVar.toByteArray());
                    CaptureDataManager.f272890c.mo129794a(this.f282656d.getContext(), captureVideoNormalModel);
                }
                CaptureDataManager.f272890c.mo129797d(true, C110992d.f332425a.mo162676j());
                this.f282656d.release();
            } else {
                Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", " export failed");
                MultiVideoFullScreenPluginLayout.m142916B(this.f282656d, false, false, 0, 7, (Object) null);
                C108531a aVar = this.f282656d.f316597w;
                if (aVar != null) {
                    aVar.onResume();
                    C61926c.m72668M(new C43274g(this.f282656d));
                } else {
                    C87412m.m108603p("addMusicPlugin");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$b */
    public static final class C106215b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106215b(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
            super(0);
            this.f316603d = multiVideoFullScreenPluginLayout;
        }

        public Object invoke() {
            this.f316603d.f316592r.mo161855M(false);
            C101198e.C62622a.m73576a(this.f316603d, C101198e.C101199b.EDIT_CLICK_VIEW, (Bundle) null, 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$c */
    public /* synthetic */ class C106216c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f316604a;

        static {
            int[] iArr = new int[C101198e.C101199b.values().length];
            iArr[33] = 1;
            iArr[34] = 2;
            iArr[32] = 3;
            iArr[48] = 4;
            iArr[63] = 5;
            iArr[49] = 6;
            iArr[104] = 7;
            iArr[38] = 8;
            iArr[36] = 9;
            iArr[37] = 10;
            iArr[102] = 11;
            iArr[42] = 12;
            iArr[53] = 13;
            iArr[57] = 14;
            iArr[58] = 15;
            iArr[35] = 16;
            iArr[103] = 17;
            iArr[70] = 18;
            iArr[59] = 19;
            iArr[60] = 20;
            iArr[29] = 21;
            iArr[64] = 22;
            iArr[66] = 23;
            iArr[61] = 24;
            iArr[62] = 25;
            iArr[137] = 26;
            iArr[50] = 27;
            iArr[45] = 28;
            iArr[47] = 29;
            iArr[46] = 30;
            iArr[93] = 31;
            iArr[19] = 32;
            iArr[74] = 33;
            iArr[75] = 34;
            iArr[76] = 35;
            iArr[77] = 36;
            iArr[78] = 37;
            iArr[100] = 38;
            iArr[101] = 39;
            iArr[114] = 40;
            iArr[99] = 41;
            iArr[94] = 42;
            iArr[95] = 43;
            iArr[105] = 44;
            iArr[106] = 45;
            iArr[96] = 46;
            iArr[97] = 47;
            iArr[98] = 48;
            iArr[109] = 49;
            iArr[110] = 50;
            iArr[108] = 51;
            iArr[113] = 52;
            iArr[111] = 53;
            iArr[112] = 54;
            iArr[115] = 55;
            iArr[116] = 56;
            iArr[117] = 57;
            iArr[118] = 58;
            iArr[120] = 59;
            iArr[121] = 60;
            iArr[119] = 61;
            iArr[107] = 62;
            iArr[127] = 63;
            iArr[126] = 64;
            iArr[125] = 65;
            iArr[128] = 66;
            iArr[72] = 67;
            iArr[73] = 68;
            iArr[122] = 69;
            iArr[123] = 70;
            iArr[124] = 71;
            iArr[129] = 72;
            iArr[130] = 73;
            iArr[131] = 74;
            iArr[132] = 75;
            iArr[134] = 76;
            iArr[133] = 77;
            iArr[135] = 78;
            iArr[136] = 79;
            iArr[52] = 80;
            int[] iArr2 = new int[C108536c.values().length];
            iArr2[2] = 1;
            f316604a = iArr2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$f */
    public static final class C106217f implements CropLayout.C106804b {

        /* renamed from: a */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316605a;

        public C106217f(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
            this.f316605a = multiVideoFullScreenPluginLayout;
        }

        public void onChange() {
            RectF rectF = this.f316605a.getMultiPreviewPlugin().f326972o;
            C103020m.f303988d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            C110351a aVar = this.f316605a.f316592r;
            Rect rect = C103020m.f303988d;
            aVar.getClass();
            C87412m.m108594g(rect, "validRect");
            aVar.f330093f.mo152287x(rect);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$g */
    public static final class C106218g implements C109202j.C99301e {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316606d;

        public C106218g(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
            this.f316606d = multiVideoFullScreenPluginLayout;
        }

        /* renamed from: k */
        public void mo138704k(long j, Object obj) {
            C108531a aVar = this.f316606d.f316597w;
            if (aVar != null) {
                aVar.mo159386F(j);
            } else {
                C87412m.m108603p("addMusicPlugin");
                throw null;
            }
        }

        public void pause() {
            C108531a aVar = this.f316606d.f316597w;
            if (aVar != null) {
                aVar.onPause();
            } else {
                C87412m.m108603p("addMusicPlugin");
                throw null;
            }
        }

        public void resume() {
            C108531a aVar = this.f316606d.f316597w;
            if (aVar == null) {
                C87412m.m108603p("addMusicPlugin");
                throw null;
            } else if (aVar.f324881p == null) {
            } else {
                if (aVar != null) {
                    aVar.mo159385E();
                } else {
                    C87412m.m108603p("addMusicPlugin");
                    throw null;
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$setupNormalVideoPlugins$1", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {2097}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$h */
    public static final class C106219h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f316607d;

        /* renamed from: e */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316608e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$setupNormalVideoPlugins$1$1", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$h$a */
        public static final class C106220a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ MultiVideoFullScreenPluginLayout f316609d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106220a(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C15601d<? super C106220a> dVar) {
                super(2, dVar);
                this.f316609d = multiVideoFullScreenPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C106220a(this.f316609d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C106220a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f316609d.setCurrentStyle(WxCropOperationLayout.C94436h.RECT_ADJUST);
                this.f316609d.getMultiPreviewPlugin().f326967g.setStyle(this.f316609d.getCurrentStyle());
                C109202j multiPreviewPlugin = this.f316609d.getMultiPreviewPlugin();
                C108531a aVar = this.f316609d.f316597w;
                if (aVar != null) {
                    multiPreviewPlugin.mo160450H(aVar.mo159392z());
                    MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f316609d;
                    C109232t0 t0Var = multiVideoFullScreenPluginLayout.f316551N;
                    int size = ((ArrayList) multiVideoFullScreenPluginLayout.f316545H.f316438t.mo134618o()).size() - 1;
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList.add(Boolean.FALSE);
                    }
                    t0Var.mo160475y(arrayList);
                    MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout2 = this.f316609d;
                    multiVideoFullScreenPluginLayout2.setBackgroundColor(multiVideoFullScreenPluginLayout2.f316584l1);
                    MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout3 = this.f316609d;
                    C108531a aVar2 = multiVideoFullScreenPluginLayout3.f316597w;
                    if (aVar2 != null) {
                        C98324b bVar = multiVideoFullScreenPluginLayout3.f316544G;
                        C87412m.m108591d(bVar);
                        MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout4 = this.f316609d;
                        C108531a.m147079H(aVar2, bVar, multiVideoFullScreenPluginLayout4.f316543F, false, multiVideoFullScreenPluginLayout4.f316546I, multiVideoFullScreenPluginLayout4.f316545H.f316429h, 4, (Object) null);
                        if (this.f316609d.f316545H.f316438t.f282570c.size() == 1) {
                            long j = this.f316609d.f316545H.f316438t.f282570c.get(0).f316501l.f331470h;
                            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout5 = this.f316609d;
                            if (j > multiVideoFullScreenPluginLayout5.f316581j) {
                                multiVideoFullScreenPluginLayout5.mo152184q();
                                this.f316609d.f316558S0.getClass();
                                C106976a aVar3 = C106976a.f320208a;
                                this.f316609d.f316545H.mo152116i(0);
                                MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout6 = this.f316609d;
                                multiVideoFullScreenPluginLayout6.f316552P.mo160476x().setEnableLengthEdit(!multiVideoFullScreenPluginLayout6.f316545H.mo152121r());
                                MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout7 = this.f316609d;
                                C109235u0 u0Var = multiVideoFullScreenPluginLayout7.f316552P;
                                C106205q0 q0Var = multiVideoFullScreenPluginLayout7.f316545H.f316442x;
                                C87412m.m108591d(q0Var);
                                C109235u0.m148334y(u0Var, q0Var, true, 0, 4, (Object) null);
                                C109202j multiPreviewPlugin2 = this.f316609d.getMultiPreviewPlugin();
                                C108531a aVar4 = this.f316609d.f316597w;
                                if (aVar4 != null) {
                                    multiPreviewPlugin2.mo160450H(aVar4.mo159392z());
                                    return C13598b0.f38549a;
                                }
                                C87412m.m108603p("addMusicPlugin");
                                throw null;
                            }
                        }
                        long m = this.f316609d.f316545H.f316438t.mo134616m();
                        MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout8 = this.f316609d;
                        if (m > multiVideoFullScreenPluginLayout8.f316581j) {
                            multiVideoFullScreenPluginLayout8.mo152184q();
                            this.f316609d.f316558S0.getClass();
                            C106976a aVar5 = C106976a.f320208a;
                            this.f316609d.f316545H.mo152116i(-1);
                            this.f316609d.f316551N.setVisibility(8);
                            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout9 = this.f316609d;
                            C106195f0 f0Var = multiVideoFullScreenPluginLayout9.f316545H;
                            C109154a aVar6 = multiVideoFullScreenPluginLayout9.f316553Q;
                            C96552p0 p0Var = f0Var.f316438t;
                            aVar6.mo160400y(p0Var);
                            f0Var.mo152110a(p0Var, false);
                            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout10 = this.f316609d;
                            multiVideoFullScreenPluginLayout10.f316553Q.mo160396B(multiVideoFullScreenPluginLayout10.f316545H.f316438t, multiVideoFullScreenPluginLayout10.f316581j);
                            C109202j multiPreviewPlugin3 = this.f316609d.getMultiPreviewPlugin();
                            C108531a aVar7 = this.f316609d.f316597w;
                            if (aVar7 != null) {
                                multiPreviewPlugin3.mo160450H(aVar7.mo159392z());
                                FinderVideoShell finderVideoShell = FinderVideoShell.f82198a;
                                Log.m105924i("MicroMsg.FinderVideoShell", "markShowCrop60s");
                                if (FinderVideoShell.f82204g <= 0) {
                                    FinderVideoShell.f82204g = Util.currentTicks();
                                }
                            } else {
                                C87412m.m108603p("addMusicPlugin");
                                throw null;
                            }
                        }
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("addMusicPlugin");
                    throw null;
                }
                C87412m.m108603p("addMusicPlugin");
                throw null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106219h(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C15601d<? super C106219h> dVar) {
            super(2, dVar);
            this.f316608e = multiVideoFullScreenPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C106219h(this.f316608e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106219h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f316607d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f316608e.f316545H.mo152111b();
                C30517h0.m39115d();
                C108531a aVar2 = this.f316608e.f316597w;
                if (aVar2 != null) {
                    aVar2.mo159384D();
                    MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f316608e;
                    multiVideoFullScreenPluginLayout.f316558S0.getClass();
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53915k2 k2Var = C58901s.f168555a;
                    C106220a aVar3 = new C106220a(multiVideoFullScreenPluginLayout, (C15601d<? super C106220a>) null);
                    this.f316607d = 1;
                    if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    C87412m.m108603p("addMusicPlugin");
                    throw null;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$setupTemplateVideoPlugins$1", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {2155}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$i */
    public static final class C106221i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f316610d;

        /* renamed from: e */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316611e;

        /* renamed from: f */
        public final /* synthetic */ C106976a.C31054c f316612f;

        /* renamed from: g */
        public final /* synthetic */ boolean f316613g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$setupTemplateVideoPlugins$1$1", mo125469f = "MultiVideoFullScreenPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$i$a */
        public static final class C106222a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ boolean f316614d;

            /* renamed from: e */
            public final /* synthetic */ MultiVideoFullScreenPluginLayout f316615e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106222a(boolean z, MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C15601d<? super C106222a> dVar) {
                super(2, dVar);
                this.f316614d = z;
                this.f316615e = multiVideoFullScreenPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C106222a(this.f316614d, this.f316615e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C106222a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                if (this.f316614d) {
                    C109202j.m148263J(this.f316615e.getMultiPreviewPlugin(), true, true, false, 0, 4, (Object) null);
                } else {
                    this.f316615e.getMultiPreviewPlugin().mo160450H(true);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106221i(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, C106976a.C31054c cVar, boolean z, C15601d<? super C106221i> dVar) {
            super(2, dVar);
            this.f316611e = multiVideoFullScreenPluginLayout;
            this.f316612f = cVar;
            this.f316613g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C106221i(this.f316611e, this.f316612f, this.f316613g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106221i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f316610d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                VideoCompositionPlayView videoCompositionPlayView = this.f316611e.getMultiPreviewPlugin().f326970j;
                if (videoCompositionPlayView != null) {
                    videoCompositionPlayView.pause();
                }
                this.f316611e.f316545H.mo152112c(this.f316612f);
                this.f316611e.f316545H.mo152116i(-1);
                C106976a.f320208a.mo157408l(this.f316612f, new long[0]);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C106222a aVar2 = new C106222a(this.f316613g, this.f316611e, (C15601d<? super C106222a>) null);
                this.f316610d = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
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

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$j */
    public static final class C106223j implements VLogThumbView.C106305f {

        /* renamed from: a */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316616a;

        public C106223j(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
            this.f316616a = multiVideoFullScreenPluginLayout;
        }

        /* renamed from: a */
        public void mo152194a() {
            C106195f0 f0Var = this.f316616a.f316545H;
            C96552p0 p0Var = new C96552p0((List<C106205q0>) f0Var.f316439u);
            f0Var.f316438t = p0Var;
            p0Var.mo81184c(f0Var.f316431j, f0Var.f316432n);
            this.f316616a.getMultiPreviewPlugin().mo160450H(false);
        }

        public void onMove(int i, int i2) {
            Collections.swap(this.f316616a.f316545H.f316439u, i, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$n */
    public static final class C106224n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316617d;

        /* renamed from: e */
        public final /* synthetic */ GalleryItem$MediaItem f316618e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106224n(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, GalleryItem$MediaItem galleryItem$MediaItem) {
            super(0);
            this.f316617d = multiVideoFullScreenPluginLayout;
            this.f316618e = galleryItem$MediaItem;
        }

        public Object invoke() {
            T t;
            C106204p pVar;
            Rect rect;
            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f316617d;
            String str = this.f316618e.f162747d;
            C87412m.m108593f(str, "originalPath");
            multiVideoFullScreenPluginLayout.f316541D = str;
            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout2 = this.f316617d;
            String str2 = multiVideoFullScreenPluginLayout2.f316541D;
            if (multiVideoFullScreenPluginLayout2.f316585m1 && C106976a.f320217j.containsKey(this.f316618e.f162747d)) {
                Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "update select image path to image enhancement result path: " + C106976a.f320217j.get(this.f316618e.f162747d));
                String str3 = C106976a.f320217j.get(this.f316618e.f162747d);
                if (str3 == null) {
                    str3 = this.f316618e.f162747d;
                    C87412m.m108593f(str3, "originalPath");
                }
                str2 = str3;
            }
            C112660e0 D = this.f316617d.f316593s.mo160425D(str2);
            this.f316617d.f316557S.mo84844a(IXWebBroadcastListener.STAGE_START, "get photo view");
            C110351a aVar = this.f316617d.f316592r;
            String str4 = this.f316618e.f162747d;
            C87412m.m108593f(str4, "originalPath");
            aVar.getClass();
            aVar.f330093f.mo152284t(str4);
            C109202j multiPreviewPlugin = this.f316617d.getMultiPreviewPlugin();
            String str5 = this.f316618e.f162747d;
            C87412m.m108593f(str5, "this.originalPath");
            multiPreviewPlugin.mo160449G(D, str5, true);
            C109171d0 d0Var = this.f316617d.f316562U0;
            String str6 = this.f316618e.f162747d;
            C87412m.m108593f(str6, "this.originalPath");
            d0Var.getClass();
            d0Var.f326889x = str6;
            LinkedList<C106205q0> linkedList = this.f316617d.f316545H.f316428g;
            GalleryItem$MediaItem galleryItem$MediaItem = this.f316618e;
            Iterator<T> it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (C87412m.m108589b(((C106205q0) t).f316490a, galleryItem$MediaItem.f162747d)) {
                    break;
                }
            }
            C106205q0 q0Var = (C106205q0) t;
            if (!(q0Var == null || (pVar = q0Var.f316498i) == null || (rect = pVar.f316486d) == null)) {
                MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout3 = this.f316617d;
                C110351a aVar2 = multiVideoFullScreenPluginLayout3.f316592r;
                aVar2.getClass();
                aVar2.f330093f.mo152287x(rect);
                multiVideoFullScreenPluginLayout3.f316568Y0.setVisibleRect(rect);
                C103020m.f303988d.set(rect);
            }
            Context context = this.f316617d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((ViewGroup) ((Activity) context).getWindow().getDecorView().findViewById(16908290)).setAlpha(1.0f);
            this.f316617d.f316539B.mo86128x();
            this.f316617d.mo152176E();
            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout4 = this.f316617d;
            multiVideoFullScreenPluginLayout4.setBackgroundColor(multiVideoFullScreenPluginLayout4.f316584l1);
            MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout5 = this.f316617d;
            multiVideoFullScreenPluginLayout5.setCurrentStyle(multiVideoFullScreenPluginLayout5.getMultiPreviewPlugin().f326967g.getStyle());
            this.f316617d.f316557S.mo84844a(IXWebBroadcastListener.STAGE_START, "load first image");
            this.f316617d.f316601y0.mo160469x(true);
            this.f316617d.f316562U0.mo160414E();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$o */
    public static final class C106225o implements C92018l {

        /* renamed from: a */
        public final /* synthetic */ long f316619a;

        /* renamed from: b */
        public final /* synthetic */ C92023q f316620b;

        /* renamed from: c */
        public final /* synthetic */ MultiVideoFullScreenPluginLayout f316621c;

        public C106225o(long j, C92023q qVar, MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
            this.f316619a = j;
            this.f316620b = qVar;
            this.f316621c = multiVideoFullScreenPluginLayout;
        }

        /* renamed from: a */
        public void mo125916a() {
            C106976a aVar = C106976a.f320208a;
            EffectManager effectManager = C106976a.f320215h;
            C87412m.m108591d(effectManager);
            effectManager.mo154934n(this.f316619a);
        }

        /* renamed from: b */
        public void mo125917b() {
            C106976a aVar = C106976a.f320208a;
            EffectManager effectManager = C106976a.f320215h;
            C87412m.m108591d(effectManager);
            effectManager.mo154925e(this.f316619a);
        }

        /* renamed from: c */
        public void mo125918c(float f, float f2, float f3, float f4) {
            C106976a aVar = C106976a.f320208a;
            EffectManager effectManager = C106976a.f320215h;
            C87412m.m108591d(effectManager);
            C110625c0 l = effectManager.mo154932l(this.f316620b.f263509h);
            C110644t tVar = l instanceof C110644t ? (C110644t) l : null;
            if (tVar != null) {
                tVar.mo162193e(new C110629f((int) f, (int) f2, f3, f4));
            }
            this.f316621c.getMultiPreviewPlugin().mo160443A();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiVideoFullScreenPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        C87412m.m108594g(context2, "context");
        C106223j jVar = new C106223j(this);
        Activity activity = (Activity) context2;
        if (((ViewGroup) activity.findViewById(C0966R.C0970id.iie)).getChildCount() == 0) {
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(16908290)).setAlpha(0.0f);
        }
        C111175f fVar = C111175f.f332956d;
        fVar.mo151272b();
        C111176g gVar = C111176g.f332958d;
        gVar.mo151272b();
        C111177h hVar = C111177h.f332960d;
        hVar.mo151272b();
        fVar.mo151283m();
        gVar.mo151283m();
        hVar.mo151283m();
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "init MultiVideoPluginLayout");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bh8, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…lugin_layout, this, true)");
        this.f316577h = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.h3u);
        C87412m.m108593f(findViewById, "rootLayout.findViewById(…_edit_bottom_func_layout)");
        ViewStub viewStub = (ViewStub) findViewById;
        View findViewById2 = this.f316577h.findViewById(C0966R.C0970id.h3t);
        C87412m.m108593f(findViewById2, "rootLayout.findViewById(…m_func_fullscreen_layout)");
        this.f316570a1 = (ViewStub) findViewById2;
        View findViewById3 = this.f316577h.findViewById(C0966R.C0970id.cch);
        C87412m.m108593f(findViewById3, "rootLayout.findViewById(R.id.editor_gradient_mask)");
        this.f316567X0 = findViewById3;
        C106976a.f320208a.mo157401e((EffectManager) null);
        View findViewById4 = findViewById(C0966R.C0970id.f358786h31);
        C87412m.m108593f(findViewById4, "findViewById(R.id.multi_crop_layout)");
        View findViewById5 = findViewById(C0966R.C0970id.bwp);
        C87412m.m108593f(findViewById5, "findViewById(R.id.crop_ope_layout)");
        setMultiPreviewPlugin(new C109202j((MultiEditCropLayout) findViewById4, (MultiEditCropOperationLayout) findViewById5, this));
        getMultiPreviewPlugin().f326979v = this.f316545H;
        View findViewById6 = findViewById(C0966R.C0970id.l5o);
        C87412m.m108593f(findViewById6, "findViewById(R.id.video_editor_item_container)");
        C110351a aVar = new C110351a((TimeEditorItemContainer) findViewById6, this);
        this.f316592r = aVar;
        getMultiPreviewPlugin().mo160452K(aVar.f330093f);
        View findViewById7 = findViewById(C0966R.C0970id.hvw);
        C87412m.m108593f(findViewById7, "findViewById(R.id.photo_editor_item_container)");
        C109184f0 f0Var = new C109184f0((FrameLayout) findViewById7, this);
        this.f316593s = f0Var;
        View findViewById8 = findViewById(C0966R.C0970id.azh);
        C87412m.m108593f(findViewById8, "findViewById(R.id.change_text_root)");
        C109359m mVar = new C109359m((EditorInputView) findViewById8, this);
        this.f316538A = mVar;
        mVar.f327377f.setEnableClickOutsideConfirm(false);
        View findViewById9 = findViewById(C0966R.C0970id.cc8);
        C87412m.m108593f(findViewById9, "findViewById(R.id.editor_close)");
        C99447k kVar = new C99447k((ImageView) findViewById9, this);
        this.f316602z = kVar;
        View findViewById10 = findViewById(C0966R.C0970id.edc);
        C87412m.m108593f(findViewById10, "findViewById(R.id.footer_preview)");
        C61196g gVar2 = new C61196g((RecyclerView) findViewById10, this);
        this.f316549L = gVar2;
        gVar2.f174219j = new C96562a(this);
        View findViewById11 = findViewById(C0966R.C0970id.i2c);
        C87412m.m108593f(findViewById11, "findViewById(R.id.preview_thumb)");
        C61205o0 o0Var = new C61205o0((ImageView) findViewById11, this);
        this.f316539B = o0Var;
        View findViewById12 = findViewById(C0966R.C0970id.cd4);
        C87412m.m108593f(findViewById12, "findViewById(R.id.editor_tts_panel)");
        C109923a aVar2 = new C109923a((ViewGroup) findViewById12, this);
        this.f316540C = aVar2;
        getMultiPreviewPlugin().mo160452K(aVar2);
        C109232t0 t0Var = new C109232t0(this, this);
        this.f316551N = t0Var;
        t0Var.f327035h.setSortCallback(jVar);
        getMultiPreviewPlugin().mo160452K(this.f316551N);
        C109154a aVar3 = new C109154a(this, this);
        this.f316553Q = aVar3;
        View findViewById13 = findViewById(C0966R.C0970id.f357902cd0);
        C87412m.m108593f(findViewById13, "findViewById(R.id.editor_track_edit_panel)");
        C109235u0 u0Var = new C109235u0((EditorPanelHolder) findViewById13, this);
        this.f316552P = u0Var;
        View findViewById14 = findViewById(C0966R.C0970id.ccz);
        C87412m.m108593f(findViewById14, "findViewById(R.id.editor_time_edit_panel)");
        C110130b bVar = new C110130b((EditorPanelHolder) findViewById14, this);
        this.f316555R = bVar;
        EditorPanelHolder editorPanelHolder = new EditorPanelHolder(context2);
        addView(editorPanelHolder, -1, -1);
        editorPanelHolder.setVisibility(8);
        C109219q0 q0Var = new C109219q0(editorPanelHolder, this);
        this.f316565W = q0Var;
        this.f316563V = new C109165b0(this, this);
        this.f316590p0 = new C110496a(this, this, true);
        C109213j0 j0Var = new C109213j0(this, this);
        this.f316599x0 = j0Var;
        C109190g0 g0Var = new C109190g0(this, this);
        this.f316560T0 = g0Var;
        g0Var.mo160431x(aVar);
        g0Var.mo160431x(aVar3);
        C109217n0 n0Var = new C109217n0(this, this);
        this.f316601y0 = n0Var;
        C109359m mVar2 = mVar;
        C99306m0 m0Var = new C99306m0(this, this);
        this.f316554Q0 = m0Var;
        C109201i0 i0Var = new C109201i0(this, this);
        this.f316556R0 = i0Var;
        C109190g0 g0Var2 = g0Var;
        C109245y0 y0Var = new C109245y0(this, this);
        this.f316558S0 = y0Var;
        C109245y0 y0Var2 = y0Var;
        C109171d0 d0Var = new C109171d0(this, this);
        this.f316562U0 = d0Var;
        C109201i0 i0Var2 = i0Var;
        getMultiPreviewPlugin().mo160452K(d0Var);
        Intent intent = activity.getIntent();
        C87412m.m108593f(intent, "context as Activity).intent");
        C112389i iVar = new C112389i(this, intent);
        iVar.mo164105x(new C112386e(this));
        getPluginList().add(iVar);
        getMultiPreviewPlugin().mo160452K(aVar3);
        getMultiPreviewPlugin().mo160452K(u0Var);
        getMultiPreviewPlugin().mo160452K(bVar);
        getMultiPreviewPlugin().f326967g.setOutsideTouckListener(new C106215b(this));
        View findViewById15 = findViewById(C0966R.C0970id.h3u);
        C87412m.m108593f(findViewById15, "findViewById(R.id.multi_…_edit_bottom_func_layout)");
        this.f316564V0 = findViewById15;
        View findViewById16 = findViewById(C0966R.C0970id.h3v);
        C87412m.m108593f(findViewById16, "findViewById(R.id.multi_video_edit_head)");
        this.f316566W0 = findViewById16;
        View findViewById17 = findViewById(C0966R.C0970id.f358924hw1);
        C87412m.m108593f(findViewById17, "findViewById(R.id.photo_mask_view)");
        this.f316568Y0 = (PhotoMaskView) findViewById17;
        getPluginList().add(aVar3);
        getPluginList().add(u0Var);
        getPluginList().add(bVar);
        getPluginList().add(aVar);
        getPluginList().add(f0Var);
        getPluginList().add(kVar);
        getPluginList().add(this.f316551N);
        getPluginList().add(getMultiPreviewPlugin());
        getPluginList().add(this.f316549L);
        getPluginList().add(this.f316557S);
        getPluginList().add(o0Var);
        getPluginList().add(q0Var);
        getPluginList().add(j0Var);
        getPluginList().add(aVar2);
        getPluginList().add(n0Var);
        getPluginList().add(m0Var);
        getPluginList().add(i0Var2);
        getPluginList().add(y0Var2);
        getPluginList().add(g0Var2);
        getPluginList().add(d0Var);
        int i = C60287a.f171907b;
        int i2 = C60287a.f171906a;
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = f / f2;
        float f4 = f / 2.18f;
        float f5 = (float) 2;
        float f6 = (f2 - f4) / f5;
        float f7 = (f - f) / f5;
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "initSafeArea, displaySize:[" + i2 + ", " + i + "], scale:" + f3 + ", safeAreaWidth:" + f4 + ", safeAreaFrameWidth:" + f6 + ", safeAreaHeight:" + f + ", safeAreaFrameHeight:" + f7);
        if (f3 <= 1.78f) {
            mVar2.mo160552y(f4, f6);
            aVar.mo161852J(f4, f6);
            return;
        }
        C109359m mVar3 = mVar2;
        if (f3 >= 2.18f) {
            mVar3.mo160551x(f4, f6);
            aVar.mo161851I(f, f7);
            return;
        }
        mVar3.mo160552y(f4, f6);
        mVar3.mo160551x(f4, f6);
        aVar.mo161852J(f4, f6);
        aVar.mo161851I(f, f7);
    }

    /* renamed from: B */
    public static void m142916B(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, boolean z, boolean z2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                j = -1;
            }
            if (!multiVideoFullScreenPluginLayout.f316545H.f316429h || multiVideoFullScreenPluginLayout.f316571b1) {
                if (z) {
                    multiVideoFullScreenPluginLayout.mo152189t(true, z2, j);
                } else {
                    if (j != -1) {
                        multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().mo160453L(j);
                    }
                    C109202j multiPreviewPlugin = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin();
                    VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f326970j;
                    if (videoCompositionPlayView != null) {
                        videoCompositionPlayView.mo154761h();
                    }
                    C106206s sVar = multiPreviewPlugin.f326964I;
                    sVar.f316503b = 0;
                    sVar.f316502a = 0;
                    multiPreviewPlugin.f326965J = 0;
                    C109202j.C99301e eVar = multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().f326959D;
                    if (eVar != null) {
                        eVar.resume();
                    }
                }
                multiVideoFullScreenPluginLayout.f316560T0.mo160429A();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeVideo");
    }

    private final void setupTemplateVideoPlugins(C106976a.C31054c cVar) {
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "setupTemplateVideoPlugins, template:" + cVar);
        this.f316556R0.setVisibility(4);
        this.f316554Q0.setVisibility(0);
        this.f316549L.setVisibility(8);
        this.f316563V.setVisibility(8);
        C108531a aVar = this.f316597w;
        if (aVar != null) {
            aVar.onPause();
            Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "showTemplateEditPlugins");
            C108531a aVar2 = this.f316597w;
            if (aVar2 != null) {
                aVar2.setVisibility(8);
                C99318r0 r0Var = this.f316596v;
                if (r0Var != null) {
                    r0Var.setVisibility(8);
                    this.f316551N.setVisibility(8);
                    C99324x xVar = this.f316559T;
                    if (xVar != null) {
                        xVar.setVisibility(8);
                        C99327z zVar = this.f316561U;
                        if (zVar != null) {
                            zVar.setVisibility(8);
                            this.f316549L.setVisibility(8);
                            C109168c0 c0Var = this.f316550M;
                            if (c0Var != null) {
                                c0Var.setVisibility(8);
                                this.f316593s.setVisibility(8);
                                C109475c cVar2 = this.f316598x;
                                if (cVar2 != null) {
                                    cVar2.setVisibility(8);
                                    C109348i iVar = this.f316595u;
                                    if (iVar != null) {
                                        iVar.setVisibility(8);
                                        C99426e eVar = this.f316594t;
                                        if (eVar != null) {
                                            eVar.setVisibility(8);
                                            this.f316558S0.getClass();
                                            C106976a aVar3 = C106976a.f320208a;
                                            this.f316592r.f330093f.setVisibility(4);
                                            this.f316592r.mo161856N(true);
                                            boolean z = this.f316571b1;
                                            this.f316571b1 = true;
                                            setBackgroundColor(this.f316584l1);
                                            MultiEditCropOperationLayout multiEditCropOperationLayout = getMultiPreviewPlugin().f326967g;
                                            WxCropOperationLayout.C94436h hVar = WxCropOperationLayout.C94436h.RECT_LINE_HARD;
                                            multiEditCropOperationLayout.setStyle(hVar);
                                            this.f316578h1 = hVar;
                                            VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f326970j;
                                            if (videoCompositionPlayView != null) {
                                                videoCompositionPlayView.setVisibility(0);
                                            }
                                            this.f316545H.f316436r = this.f316581j;
                                            RectF rectF = getMultiPreviewPlugin().f326972o;
                                            rectF.round(C103020m.f303988d);
                                            getMultiPreviewPlugin().mo160456O(rectF);
                                            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C106221i(this, cVar, z, (C15601d<? super C106221i>) null), 2, (Object) null);
                                            return;
                                        }
                                        C87412m.m108603p("addEmojiPlugin");
                                        throw null;
                                    }
                                    C87412m.m108603p("addTextPlugin");
                                    throw null;
                                }
                                C87412m.m108603p("captionPlugin");
                                throw null;
                            }
                            C87412m.m108603p("editPencilPlugin");
                            throw null;
                        }
                        C87412m.m108603p("editMagicPlugin");
                        throw null;
                    }
                    C87412m.m108603p("editCropPlugin");
                    throw null;
                }
                C87412m.m108603p("cropVideoPlugin");
                throw null;
            }
            C87412m.m108603p("addMusicPlugin");
            throw null;
        }
        C87412m.m108603p("addMusicPlugin");
        throw null;
    }

    /* renamed from: w */
    public static /* synthetic */ void m142917w(MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, boolean z, boolean z2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            if ((i & 4) != 0) {
                j = -1;
            }
            multiVideoFullScreenPluginLayout.mo152189t(z, z2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recreateVideo");
    }

    /* renamed from: A */
    public final void mo152173A() {
        C106205q0 q0Var = this.f316545H.f316442x;
        if (q0Var != null) {
            C109232t0 t0Var = this.f316551N;
            int i = this.f316563V.f326861i;
            C110801c cVar = q0Var.f316501l;
            t0Var.mo160474x(i, cVar.f331464b, cVar.f331465c);
            C109202j multiPreviewPlugin = getMultiPreviewPlugin();
            C110801c cVar2 = q0Var.f316501l;
            multiPreviewPlugin.mo160455N(cVar2.f331464b, cVar2.f331465c);
            getMultiPreviewPlugin().mo160453L(q0Var.f316501l.f331464b);
        }
    }

    /* renamed from: C */
    public final void mo152174C() {
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "setupNormalVideoPlugins");
        getMultiPreviewPlugin().mo160456O(this.f316545H.f316434p);
        this.f316556R0.setVisibility(0);
        this.f316554Q0.setVisibility(8);
        mo152177F();
        this.f316592r.f330093f.setVisibility(0);
        this.f316592r.mo161856N(true);
        this.f316551N.f327035h.f317010K = false;
        this.f316571b1 = false;
        this.f316545H.f316436r = this.f316581j;
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C106219h(this, (C15601d<? super C106219h>) null), 2, (Object) null);
    }

    /* renamed from: D */
    public final void mo152175D() {
        ArrayList<String> arrayList;
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "showImageEditPlugins");
        this.f316549L.setVisibility(0);
        C109168c0 c0Var = this.f316550M;
        if (c0Var != null) {
            c0Var.setVisibility(0);
            this.f316593s.setVisibility(0);
            C98324b bVar = this.f316544G;
            if (!(bVar == null || (arrayList = bVar.f288190k) == null)) {
                arrayList.add(this.f316576g1.get(0).f162747d);
            }
            C108531a aVar = this.f316597w;
            if (aVar != null) {
                aVar.setVisibility(8);
                C99318r0 r0Var = this.f316596v;
                if (r0Var != null) {
                    r0Var.setVisibility(8);
                    this.f316551N.setVisibility(8);
                    C99324x xVar = this.f316559T;
                    if (xVar != null) {
                        xVar.setVisibility(8);
                        C99327z zVar = this.f316561U;
                        if (zVar != null) {
                            zVar.setVisibility(8);
                            C109475c cVar = this.f316598x;
                            if (cVar != null) {
                                cVar.setVisibility(8);
                                C109348i iVar = this.f316595u;
                                if (iVar != null) {
                                    iVar.setVisibility(0);
                                    C99426e eVar = this.f316594t;
                                    if (eVar != null) {
                                        eVar.setVisibility(0);
                                        this.f316558S0.getClass();
                                        C106976a aVar2 = C106976a.f320208a;
                                        if (!C30517h0.m39113b() || this.f316547J) {
                                            C108531a aVar3 = this.f316597w;
                                            if (aVar3 != null) {
                                                aVar3.setVisibility(8);
                                            } else {
                                                C87412m.m108603p("addMusicPlugin");
                                                throw null;
                                            }
                                        } else {
                                            C108531a aVar4 = this.f316597w;
                                            if (aVar4 != null) {
                                                aVar4.setVisibility(0);
                                            } else {
                                                C87412m.m108603p("addMusicPlugin");
                                                throw null;
                                            }
                                        }
                                    } else {
                                        C87412m.m108603p("addEmojiPlugin");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("addTextPlugin");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("captionPlugin");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("editMagicPlugin");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("editCropPlugin");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("cropVideoPlugin");
                    throw null;
                }
            } else {
                C87412m.m108603p("addMusicPlugin");
                throw null;
            }
        } else {
            C87412m.m108603p("editPencilPlugin");
            throw null;
        }
    }

    /* renamed from: E */
    public final void mo152176E() {
        if (!this.f316573d1) {
            View view = this.f316567X0;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (this.f316545H.f316429h && !this.f316571b1) {
                this.f316549L.setVisibility(0);
            }
            if (!this.f316545H.f316429h) {
                this.f316551N.setVisibility(0);
            } else if (C30517h0.m39113b() && !this.f316547J) {
                C108531a aVar2 = this.f316597w;
                if (aVar2 != null) {
                    aVar2.setVisibility(0);
                } else {
                    C87412m.m108603p("addMusicPlugin");
                    throw null;
                }
            }
            if (C106216c.f316604a[this.f316583k1.ordinal()] == 1) {
                this.f316563V.setVisibility(0);
                this.f316551N.setVisibility(0);
                return;
            }
            getMultiPreviewPlugin().f326967g.setStyle(this.f316578h1);
            View view2 = this.f316566W0;
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f316564V0;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "showOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!this.f316571b1) {
                this.f316558S0.getClass();
                C106976a aVar5 = C106976a.f320208a;
            }
        }
    }

    /* renamed from: F */
    public final void mo152177F() {
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "showVideoEditPlugins");
        C108531a aVar = this.f316597w;
        if (aVar != null) {
            aVar.setVisibility(0);
            C99318r0 r0Var = this.f316596v;
            if (r0Var != null) {
                r0Var.setVisibility(0);
                this.f316551N.setVisibility(0);
                C99324x xVar = this.f316559T;
                if (xVar != null) {
                    xVar.setVisibility(0);
                    C99327z zVar = this.f316561U;
                    if (zVar != null) {
                        zVar.setVisibility(0);
                        this.f316549L.setVisibility(8);
                        C109168c0 c0Var = this.f316550M;
                        if (c0Var != null) {
                            c0Var.setVisibility(8);
                            this.f316593s.setVisibility(8);
                            C109475c cVar = this.f316598x;
                            if (cVar != null) {
                                cVar.setVisibility(0);
                                C109348i iVar = this.f316595u;
                                if (iVar != null) {
                                    iVar.setVisibility(0);
                                    C99426e eVar = this.f316594t;
                                    if (eVar != null) {
                                        eVar.setVisibility(0);
                                        this.f316558S0.getClass();
                                        C106976a aVar2 = C106976a.f320208a;
                                        return;
                                    }
                                    C87412m.m108603p("addEmojiPlugin");
                                    throw null;
                                }
                                C87412m.m108603p("addTextPlugin");
                                throw null;
                            }
                            C87412m.m108603p("captionPlugin");
                            throw null;
                        }
                        C87412m.m108603p("editPencilPlugin");
                        throw null;
                    }
                    C87412m.m108603p("editMagicPlugin");
                    throw null;
                }
                C87412m.m108603p("editCropPlugin");
                throw null;
            }
            C87412m.m108603p("cropVideoPlugin");
            throw null;
        }
        C87412m.m108603p("addMusicPlugin");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0075, code lost:
        r9 = r9.f288193n;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152178G() {
        /*
            r22 = this;
            r7 = r22
            com.tencent.mm.plugin.vlog.model.FinderVideoShell r0 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82198a
            java.lang.String r0 = "MicroMsg.FinderVideoShell"
            java.lang.String r1 = "markPressEditFinish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            long r0 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82206i
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0019
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82206i = r0
        L_0x0019:
            l23.o0 r0 = r7.f316539B
            r1 = 2131838435(0x7f1145e3, float:1.9310093E38)
            r4 = 0
            r0.mo86129y(r1, r4)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r0 = r7.f316543F
            gy3.C87412m.m108591d(r0)
            java.lang.String r10 = r0.f272901B
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            r5 = 2
            r0.f310230t = r5
            r22.mo152190x()
            i23.a r11 = i23.C8847a.f28097a
            r12 = 101(0x65, float:1.42E-43)
            r13 = 1
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r7.f316587n1
            long r14 = r0 - r5
            r16 = 1
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 112(0x70, float:1.57E-43)
            r21 = 0
            i23.C8847a.m8677a(r11, r12, r13, r14, r16, r17, r18, r19, r20, r21)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$m r0 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$m
            r0.<init>(r7, r10)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r1 = r1.f272892b
            java.lang.String r5 = "SOUND_TRACK_TYPE"
            r1.putInt(r5, r4)
            j23.a r1 = r7.f316597w
            java.lang.String r6 = "addMusicPlugin"
            r15 = 0
            if (r1 == 0) goto L_0x01e4
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r1.f324881p
            if (r1 == 0) goto L_0x00d5
            boolean r8 = r1.f163824s
            if (r8 == 0) goto L_0x00b9
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r8 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r8 = r8.f272892b
            h90.b r9 = r7.f316544G
            if (r9 == 0) goto L_0x0080
            android.os.Bundle r9 = r9.f288193n
            if (r9 == 0) goto L_0x0080
            java.lang.String r11 = "KEY_ORIGIN_MUSIC_ID"
            java.lang.String r9 = r9.getString(r11)
            goto L_0x0081
        L_0x0080:
            r9 = r15
        L_0x0081:
            java.lang.String r11 = "ORIGIN_MUSIC_ID"
            r8.putString(r11, r9)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r8 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r8 = r8.f272892b
            h90.b r9 = r7.f316544G
            if (r9 == 0) goto L_0x0099
            android.os.Bundle r9 = r9.f288193n
            if (r9 == 0) goto L_0x0099
            java.lang.String r11 = "KEY_ORIGIN_MUSIC_PATH"
            java.lang.String r9 = r9.getString(r11)
            goto L_0x009a
        L_0x0099:
            r9 = r15
        L_0x009a:
            java.lang.String r11 = "ORIGIN_MUSIC_PATH"
            r8.putString(r11, r9)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r8 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r8 = r8.f272892b
            h90.b r9 = r7.f316544G
            if (r9 == 0) goto L_0x00b2
            android.os.Bundle r9 = r9.f288193n
            if (r9 == 0) goto L_0x00b2
            java.lang.String r11 = "KEY_ORIGIN_MUSIC_INFO"
            byte[] r9 = r9.getByteArray(r11)
            goto L_0x00b3
        L_0x00b2:
            r9 = r15
        L_0x00b3:
            java.lang.String r11 = "ORIGIN_MUSIC_INFO"
            r8.putByteArray(r11, r9)
            goto L_0x00cc
        L_0x00b9:
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r1.f163830y
            if (r8 != 0) goto L_0x00cc
            te3.xt2 r8 = r1.f163812d
            byte[] r8 = r8.toByteArray()
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r9 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r9 = r9.f272892b
            java.lang.String r11 = "MEDIA_EXTRA_MUSIC"
            r9.putByteArray(r11, r8)
        L_0x00cc:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r8 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r8 = r8.f272892b
            int r1 = r1.f163821p
            r8.putInt(r5, r1)
        L_0x00d5:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r1 = r1.f272892b
            h90.b r5 = r7.f316544G
            if (r5 == 0) goto L_0x00e8
            android.os.Bundle r5 = r5.f288193n
            if (r5 == 0) goto L_0x00e8
            java.lang.String r8 = "KEY_ORIGIN_BGM_URL"
            java.lang.String r5 = r5.getString(r8)
            goto L_0x00e9
        L_0x00e8:
            r5 = r15
        L_0x00e9:
            java.lang.String r8 = "ORIGIN_BGM_URL"
            r1.putString(r8, r5)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r1 = r1.f272892b
            j23.a r5 = r7.f316597w
            if (r5 == 0) goto L_0x01e0
            boolean r5 = r5.mo159392z()
            r14 = 1
            if (r5 != 0) goto L_0x0104
            boolean r5 = r7.f316546I
            if (r5 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r5 = 0
            goto L_0x0105
        L_0x0104:
            r5 = 1
        L_0x0105:
            java.lang.String r8 = "MEDIA_IS_MUTE"
            r1.putBoolean(r8, r5)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r1 = r1.f272892b
            j23.a r5 = r7.f316597w
            if (r5 == 0) goto L_0x01dc
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r5 = r5.f324878j
            boolean r5 = r5.getWithMusic()
            r5 = r5 ^ r14
            java.lang.String r8 = "MUSIC_IS_MUTE"
            r1.putBoolean(r8, r5)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r7.f316545H
            boolean r1 = r1.f316429h
            if (r1 == 0) goto L_0x01be
            l23.n0 r1 = r7.f316601y0
            com.google.android.material.tabs.TabLayout r1 = r1.f327005h
            int r1 = r1.getSelectedTabPosition()
            if (r1 != r14) goto L_0x012f
            r4 = 1
        L_0x012f:
            if (r4 != 0) goto L_0x01be
            ds.m$a r0 = new ds.m$a
            r0.<init>()
            java.lang.String r1 = r7.f316591q
            r0.mo8636a(r1)
            int r1 = r7.f316588o
            r0.f25769d = r1
            int r1 = r7.f316586n
            r0.f25770e = r1
            r1 = 100
            r0.f25771f = r1
            lw1.b$d r4 = new lw1.b$d
            r4.<init>(r0)
            com.tencent.mm.plugin.vlog.model.f0 r0 = r7.f316545H
            java.util.LinkedList<java.lang.String> r0 = r0.f316425d
            int r0 = r0.size()
            java.lang.String[] r5 = new java.lang.String[r0]
            java.util.ArrayList r16 = new java.util.ArrayList
            r16.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel r18 = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Long r12 = java.lang.Long.valueOf(r2)
            th2.d r0 = th2.C110992d.f332425a
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r1 = r0.mo162676j()
            java.lang.String r11 = ""
            r8 = r18
            r9 = r13
            r2 = 1
            r14 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14)
            j23.a r1 = r7.f316597w
            if (r1 == 0) goto L_0x01ba
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r8 = r1.f324881p
            if (r8 == 0) goto L_0x0182
            com.tencent.mm.protocal.protobuf.FinderObject r15 = r8.f163830y
        L_0x0182:
            if (r15 == 0) goto L_0x019d
            jh2.m r9 = jh2.C60863m.f173404c
            gy3.C87412m.m108591d(r8)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$k r10 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$k
            r0 = r10
            r1 = r22
            r2 = r4
            r3 = r5
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.mo85769c(r8, r10)
            goto L_0x01d7
        L_0x019d:
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r0 = r0.mo162676j()
            r1.mo129797d(r2, r0)
            r0 = 1
            r7.mo152191y(r0)
            r6 = 0
            r0 = r22
            r1 = r4
            r2 = r5
            r3 = r16
            r4 = r17
            r5 = r18
            r0.mo152183o(r1, r2, r3, r4, r5, r6)
            goto L_0x01d7
        L_0x01ba:
            gy3.C87412m.m108603p(r6)
            throw r15
        L_0x01be:
            r22.mo152185r()
            j23.a r1 = r7.f316597w
            if (r1 == 0) goto L_0x01d8
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r1 = r1.f324881p
            if (r1 == 0) goto L_0x01d4
            jh2.m r2 = jh2.C60863m.f173404c
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$l r3 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$l
            r3.<init>(r7, r0)
            r2.mo85769c(r1, r3)
            goto L_0x01d7
        L_0x01d4:
            r7.mo152182n(r15, r0)
        L_0x01d7:
            return
        L_0x01d8:
            gy3.C87412m.m108603p(r6)
            throw r15
        L_0x01dc:
            gy3.C87412m.m108603p(r6)
            throw r15
        L_0x01e0:
            gy3.C87412m.m108603p(r6)
            throw r15
        L_0x01e4:
            gy3.C87412m.m108603p(r6)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.mo152178G():void");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (super.mo78564e()) {
            return true;
        }
        VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.stop();
        }
        C102440a aVar = this.f316579i;
        if (aVar != null) {
            C102440a.C102441a.m135179a(aVar, 0, (C98324b) null, 2, (Object) null);
        }
        this.f316580i1.f332424a.f310230t = 1;
        mo152190x();
        if (this.f316545H.f316429h) {
            if (!(this.f316601y0.f327005h.getSelectedTabPosition() == 1)) {
                mo152191y(0);
                C8847a.m8677a(C8847a.f28097a, 101, 1, System.currentTimeMillis() - this.f316587n1, 0, (JSONObject) null, (String) null, (C49712hj1) null, 112, (Object) null);
                CaptureDataManager.f272890c.mo129797d(false, C110992d.f332425a.mo162676j());
                return true;
            }
        }
        C61926c.m72657B("MultiVideoPluginLayout_report", true, new C98898e(this, 0));
        C8847a.m8677a(C8847a.f28097a, 101, 1, System.currentTimeMillis() - this.f316587n1, 0, (JSONObject) null, (String) null, (C49712hj1) null, 112, (Object) null);
        CaptureDataManager.f272890c.mo129797d(false, C110992d.f332425a.mo162676j());
        return true;
    }

    /* renamed from: f */
    public void mo129834f(C109344g0 g0Var) {
        C87412m.m108594g(g0Var, "plugin");
    }

    public final WxCropOperationLayout.C94436h getCurrentStyle() {
        return this.f316578h1;
    }

    public final C109202j getMultiPreviewPlugin() {
        C109202j jVar = this.f316548K;
        if (jVar != null) {
            return jVar;
        }
        C87412m.m108603p("multiPreviewPlugin");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0485  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo128671k(wg2.C102440a r23, com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = "navigator"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r3 = "configProvider"
            gy3.C87412m.m108594g(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "initLogic ,configProvider:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r0.f316579i = r1
            r0.f316543F = r2
            android.os.Bundle r1 = r2.f272912M
            if (r1 == 0) goto L_0x0037
            java.lang.Class<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r1.setClassLoader(r3)
        L_0x0037:
            boolean r1 = r0.f316569Z0
            java.lang.String r3 = "editFinishPlugin"
            java.lang.String r4 = "editCropPlugin"
            java.lang.String r5 = "cropVideoPlugin"
            java.lang.String r6 = "editPencilPlugin"
            java.lang.String r7 = "addEmojiPlugin"
            java.lang.String r8 = "captionPlugin"
            java.lang.String r9 = "addMusicPlugin"
            java.lang.String r10 = "addTextPlugin"
            r11 = 8
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0051
            goto L_0x02a5
        L_0x0051:
            r0.f316569Z0 = r13
            android.view.ViewStub r1 = r0.f316570a1
            r0.f316564V0 = r1
            r1.setVisibility(r12)
            l23.y r1 = new l23.y
            r14 = 2131301339(0x7f0913db, float:1.8220733E38)
            android.view.View r14 = r0.findViewById(r14)
            java.lang.String r15 = "findViewById(R.id.editor_mix_fullscreen)"
            gy3.C87412m.m108593f(r14, r15)
            r1.<init>(r14, r0)
            r0.f316600y = r1
            r1 = 2131301338(0x7f0913da, float:1.8220731E38)
            android.view.View r1 = r0.findViewById(r1)
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r15.mo10233c(r11)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout"
            java.lang.String r17 = "lazyInit"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r1
            r13 = r15
            r15 = r11
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r11 = r13.mo10231a(r12)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r1.setVisibility(r11)
            java.lang.String r15 = "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout"
            java.lang.String r16 = "lazyInit"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            r1 = 2131301269(0x7f091395, float:1.8220591E38)
            android.view.View r1 = r0.findViewById(r1)
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            java.lang.String r13 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r11, r13)
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            android.content.Context r13 = r22.getContext()
            r14 = 68
            int r13 = kg3.C76577a.m92151b(r13, r14)
            r11.bottomMargin = r13
            r1.setLayoutParams(r11)
            r1 = 2131310344(0x7f093708, float:1.8238997E38)
            android.view.View r1 = r0.findViewById(r1)
            r1.requestLayout()
            l23.d0 r1 = r0.f316562U0
            r11 = 1
            r1.mo160416z(r11)
            lh2.e r1 = new lh2.e
            r11 = 2131301297(0x7f0913b1, float:1.8220648E38)
            android.view.View r11 = r0.findViewById(r11)
            java.lang.String r13 = "findViewById(R.id.editor_add_emoji)"
            gy3.C87412m.m108593f(r11, r13)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r1.<init>(r0, r11, r0)
            r0.f316594t = r1
            com.tencent.p014mm.plugin.vlog.model.C30517h0.m39114c()
            j23.d r1 = new j23.d
            r1.<init>(r0)
            android.util.SparseArray<fl.y> r11 = p813fl.C97944z.f287281a
            e23.e r11 = new e23.e
            r11.<init>(r1)
            android.util.SparseArray<fl.y> r1 = p813fl.C97944z.f287281a
            r11.mo136858b()
            r13 = 108(0x6c, float:1.51E-43)
            r1.put(r13, r11)
            e23.b r1 = new e23.b
            r1.<init>()
            java.util.HashMap<java.lang.String, fl.x> r11 = p813fl.C97944z.f287282b
            r1.mo157592a()
            java.lang.String r13 = "pag_panel"
            r11.put(r13, r1)
            lh2.i r1 = new lh2.i
            lh2.m r11 = r0.f316538A
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView r11 = r11.f327377f
            r1.<init>(r0, r0, r11)
            r0.f316595u = r1
            l23.c0 r1 = new l23.c0
            r1.<init>(r0, r0)
            r0.f316550M = r1
            j23.a r1 = new j23.a
            r1.<init>(r0, r0)
            r0.f316597w = r1
            r11 = 2131235402(0x7f08124a, float:1.8086997E38)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r1 = r1.f324878j
            r1.setBackground(r11)
            l23.j r1 = r22.getMultiPreviewPlugin()
            j23.a r11 = r0.f316597w
            if (r11 == 0) goto L_0x0527
            r1.mo160452K(r11)
            l23.x r1 = new l23.x
            r1.<init>(r0, r0)
            r0.f316559T = r1
            l23.r0 r1 = new l23.r0
            r1.<init>(r0, r0)
            r0.f316596v = r1
            m23.c r1 = new m23.c
            r11 = 2131301295(0x7f0913af, float:1.8220644E38)
            android.view.View r11 = r0.findViewById(r11)
            java.lang.String r13 = "findViewById(R.id.editor_add_caption_group)"
            gy3.C87412m.m108593f(r11, r13)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r13 = 2131301312(0x7f0913c0, float:1.8220678E38)
            android.view.View r13 = r0.findViewById(r13)
            java.lang.String r14 = "findViewById(R.id.editor_caption_preview_panel)"
            gy3.C87412m.m108593f(r13, r14)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder r13 = (com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder) r13
            r14 = 2131301311(0x7f0913bf, float:1.8220676E38)
            android.view.View r14 = r0.findViewById(r14)
            java.lang.String r15 = "findViewById(R.id.editor_caption_edit_panel)"
            gy3.C87412m.m108593f(r14, r15)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder r14 = (com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder) r14
            r1.<init>(r11, r13, r14, r0)
            r0.f316598x = r1
            l23.j r1 = r22.getMultiPreviewPlugin()
            m23.c r11 = r0.f316598x
            if (r11 == 0) goto L_0x0522
            r1.mo160452K(r11)
            l23.z r1 = new l23.z
            com.tencent.mm.plugin.vlog.model.f0 r11 = r0.f316545H
            l23.j r13 = r22.getMultiPreviewPlugin()
            r1.<init>(r0, r0, r11, r13)
            r0.f316561U = r1
            java.util.ArrayList r1 = r22.getPluginList()
            lh2.e r11 = r0.f316594t
            if (r11 == 0) goto L_0x051d
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            lh2.i r11 = r0.f316595u
            if (r11 == 0) goto L_0x0518
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            l23.c0 r11 = r0.f316550M
            if (r11 == 0) goto L_0x0513
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            j23.a r11 = r0.f316597w
            if (r11 == 0) goto L_0x050e
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            m23.c r11 = r0.f316598x
            if (r11 == 0) goto L_0x0509
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            l23.r0 r11 = r0.f316596v
            if (r11 == 0) goto L_0x0504
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            l23.x r11 = r0.f316559T
            if (r11 == 0) goto L_0x04ff
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            l23.z r11 = r0.f316561U
            if (r11 == 0) goto L_0x04f8
            r1.add(r11)
            java.util.ArrayList r1 = r22.getPluginList()
            l23.y r11 = r0.f316600y
            if (r11 == 0) goto L_0x04f3
            r1.add(r11)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r0.f316543F
            if (r1 == 0) goto L_0x02a5
            android.os.Bundle r1 = r1.f272912M
            if (r1 == 0) goto L_0x02a5
            java.lang.String r11 = "KEY_SHOW_FINDER_ACTION_BAR_TITLE"
            boolean r1 = r1.getBoolean(r11, r12)
            if (r1 == 0) goto L_0x02a5
            lh2.k r1 = r0.f316602z
            r11 = 1
            r1.f291583g = r11
            android.widget.ImageView r11 = r1.f291582f
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            boolean r13 = r11 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r13 == 0) goto L_0x022a
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            goto L_0x022b
        L_0x022a:
            r11 = 0
        L_0x022b:
            if (r11 == 0) goto L_0x0267
            android.widget.ImageView r13 = r1.f291582f
            android.content.Context r13 = r13.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131165337(0x7f070099, float:1.7944888E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            r11.height = r13
            android.widget.ImageView r13 = r1.f291582f
            android.content.Context r13 = r13.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131165307(0x7f07007b, float:1.7944827E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            r11.width = r13
            android.widget.ImageView r13 = r1.f291582f
            android.content.Context r13 = r13.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131165324(0x7f07008c, float:1.7944862E38)
            int r13 = r13.getDimensionPixelOffset(r14)
            r11.setMarginStart(r13)
        L_0x0267:
            android.widget.ImageView r11 = r1.f291582f
            r11.requestLayout()
            android.widget.ImageView r11 = r1.f291582f
            android.content.Context r13 = r11.getContext()
            r14 = 2131755953(0x7f1003b1, float:1.91428E38)
            android.widget.ImageView r1 = r1.f291582f
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r15 = 2131099704(0x7f060038, float:1.7811769E38)
            int r1 = r1.getColor(r15)
            android.graphics.drawable.Drawable r1 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r13, r14, r1)
            r11.setImageDrawable(r1)
            r1 = 2131302769(0x7f091971, float:1.8223633E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x02a5
            android.text.TextPaint r11 = r1.getPaint()
            r13 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r11, r13)
            r1.setVisibility(r12)
        L_0x02a5:
            l23.j r1 = r22.getMultiPreviewPlugin()
            com.tencent.mm.modelcontrol.VideoTransPara r11 = r2.f272926n
            if (r11 == 0) goto L_0x02b0
            int r11 = r11.f267168f
            goto L_0x02b1
        L_0x02b0:
            r11 = -1
        L_0x02b1:
            r1.f326963H = r11
            hi2.h r1 = hi2.C98453h.f288774a
            r1.mo137806d(r2)
            q23.a r1 = r0.f316592r
            r1.getClass()
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r1 = r1.f330093f
            r1.getClass()
            r1.f316774j = r2
            l23.r0 r1 = r0.f316596v
            if (r1 == 0) goto L_0x04ee
            r5 = 8
            r1.setVisibility(r5)
            l23.y r1 = r0.f316600y
            if (r1 == 0) goto L_0x04e9
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r2.f272927o
            if (r3 == 0) goto L_0x02dc
            int r3 = r3.f266576i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x02dd
        L_0x02dc:
            r3 = 0
        L_0x02dd:
            com.tencent.mm.component.api.jumper.UICustomParam r5 = r2.f272927o
            if (r5 == 0) goto L_0x02e8
            int r5 = r5.f266577j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x02e9
        L_0x02e8:
            r5 = 0
        L_0x02e9:
            com.tencent.mm.component.api.jumper.UICustomParam r11 = r2.f272927o
            if (r11 == 0) goto L_0x02f0
            java.lang.String r12 = r11.f266579o
            goto L_0x02f1
        L_0x02f0:
            r12 = 0
        L_0x02f1:
            if (r11 == 0) goto L_0x02fa
            int r11 = r11.f266578n
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x02fb
        L_0x02fa:
            r11 = 0
        L_0x02fb:
            java.lang.String r13 = r1.f291243g
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r12)
            r15 = 32
            r14.append(r15)
            r14.append(r11)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            android.view.View r13 = r1.f291242f
            if (r3 == 0) goto L_0x0325
            int r14 = r3.intValue()
            if (r14 == 0) goto L_0x0325
            int r3 = r3.intValue()
            r13.setBackgroundResource(r3)
        L_0x0325:
            if (r11 == 0) goto L_0x0335
            int r3 = r11.intValue()
            if (r3 <= 0) goto L_0x0335
            android.view.View r1 = r1.f291242f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r3
        L_0x0335:
            if (r5 == 0) goto L_0x0353
            int r1 = r5.intValue()
            if (r1 == 0) goto L_0x0353
            boolean r1 = r13 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x0353
            r1 = r13
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r3 = r1.getContext()
            int r5 = r5.intValue()
            int r3 = p385u2.C111105a.m151500b(r3, r5)
            r1.setTextColor(r3)
        L_0x0353:
            if (r12 == 0) goto L_0x035e
            int r1 = r12.length()
            if (r1 != 0) goto L_0x035c
            goto L_0x035e
        L_0x035c:
            r1 = 0
            goto L_0x035f
        L_0x035e:
            r1 = 1
        L_0x035f:
            if (r1 != 0) goto L_0x036a
            boolean r1 = r13 instanceof android.widget.TextView
            if (r1 == 0) goto L_0x036a
            android.widget.TextView r13 = (android.widget.TextView) r13
            r13.setText(r12)
        L_0x036a:
            j23.a r1 = r0.f316597w
            if (r1 == 0) goto L_0x04e4
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r2.f272927o
            if (r3 == 0) goto L_0x0379
            int r3 = r3.f266576i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x037a
        L_0x0379:
            r3 = 0
        L_0x037a:
            com.tencent.mm.component.api.jumper.UICustomParam r5 = r2.f272927o
            if (r5 == 0) goto L_0x0385
            int r5 = r5.f266577j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x0386
        L_0x0385:
            r5 = 0
        L_0x0386:
            r11 = 2131756834(0x7f100722, float:1.9144587E38)
            r12 = 0
            r1.mo159383C(r3, r5, r12, r11)
            lh2.i r1 = r0.f316595u
            if (r1 == 0) goto L_0x04df
            com.tencent.mm.component.api.jumper.UICustomParam r3 = r2.f272927o
            if (r3 == 0) goto L_0x039c
            int r3 = r3.f266576i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x039d
        L_0x039c:
            r3 = 0
        L_0x039d:
            com.tencent.mm.component.api.jumper.UICustomParam r5 = r2.f272927o
            if (r5 == 0) goto L_0x03a8
            int r5 = r5.f266577j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L_0x03a9
        L_0x03a8:
            r5 = 0
        L_0x03a9:
            r1.mo160547y(r3, r5)
            lh2.i r1 = r0.f316595u
            if (r1 == 0) goto L_0x04da
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorInputView r1 = r1.f327359g
            r3 = 1
            r1.mo151438h(r3)
            android.content.Context r1 = r22.getContext()
            r3 = 2131099940(0x7f060124, float:1.7812247E38)
            int r1 = kg3.C76577a.m92153d(r1, r3)
            lh2.e r3 = r0.f316594t
            if (r3 == 0) goto L_0x04d5
            android.widget.ImageView r3 = r3.f291517f
            android.content.Context r5 = r3.getContext()
            r7 = 2131756168(0x7f100488, float:1.9143236E38)
            android.graphics.drawable.Drawable r5 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r5, r7, r1)
            r3.setImageDrawable(r5)
            lh2.i r3 = r0.f316595u
            if (r3 == 0) goto L_0x04d0
            android.widget.ImageView r5 = r3.f327360h
            android.view.ViewGroup r3 = r3.f327358f
            android.content.Context r3 = r3.getContext()
            r7 = 2131756173(0x7f10048d, float:1.9143246E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r7, r1)
            r5.setImageDrawable(r3)
            l23.x r3 = r0.f316559T
            if (r3 == 0) goto L_0x04cb
            android.widget.ImageView r4 = r3.f291241g
            android.view.ViewGroup r3 = r3.f291240f
            android.content.Context r3 = r3.getContext()
            r5 = 2131756153(0x7f100479, float:1.9143205E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r5, r1)
            r4.setImageDrawable(r3)
            j23.a r3 = r0.f316597w
            if (r3 == 0) goto L_0x04c6
            android.widget.ImageView r4 = r3.f324875g
            android.view.ViewGroup r3 = r3.f324874f
            android.content.Context r3 = r3.getContext()
            r5 = 2131756160(0x7f100480, float:1.914322E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r5, r1)
            r4.setImageDrawable(r3)
            m23.c r3 = r0.f316598x
            if (r3 == 0) goto L_0x04c1
            android.widget.ImageView r4 = r3.f327688n
            android.content.Context r3 = r3.f327686i
            r5 = 2131755975(0x7f1003c7, float:1.9142844E38)
            android.graphics.drawable.Drawable r3 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r3, r5, r1)
            r4.setImageDrawable(r3)
            l23.c0 r3 = r0.f316550M
            if (r3 == 0) goto L_0x04bc
            r3.f326867i = r1
            android.widget.ImageView r3 = r3.f326866h
            android.content.Context r4 = r3.getContext()
            r5 = 2131756017(0x7f1003f1, float:1.914293E38)
            android.graphics.drawable.Drawable r4 = com.tencent.p014mm.p136ui.C74933u4.m89768e(r4, r5, r1)
            r3.setImageDrawable(r4)
            lh2.k r3 = r0.f316602z
            r3.mo138883x(r1)
            l23.j r1 = r22.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$f r3 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$f
            r3.<init>(r0)
            r1.f326975r = r3
            java.util.ArrayList r1 = r22.getPluginList()
            java.util.Iterator r1 = r1.iterator()
        L_0x0457:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x048b
            java.lang.Object r3 = r1.next()
            lh2.g0 r3 = (lh2.C109344g0) r3
            com.tencent.mm.component.api.jumper.UICustomParam r4 = r2.f272927o
            if (r4 == 0) goto L_0x047e
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = r4.f266575h
            if (r4 == 0) goto L_0x047e
            java.lang.String r5 = r3.name()
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L_0x047e
            boolean r4 = r4.booleanValue()
            goto L_0x047f
        L_0x047e:
            r4 = 0
        L_0x047f:
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0485
            r4 = 0
            goto L_0x0487
        L_0x0485:
            r4 = 8
        L_0x0487:
            r3.setVisibility(r4)
            goto L_0x0457
        L_0x048b:
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$g r1 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$g
            r1.<init>(r0)
            l23.t0 r2 = r0.f316551N
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r2 = r2.f327035h
            r2.setAudioSeekable(r1)
            l23.j r2 = r22.getMultiPreviewPlugin()
            r2.f326959D = r1
            l23.u0 r2 = r0.f316552P
            l23.j r3 = r22.getMultiPreviewPlugin()
            l23.j$e r3 = r3.f326958C
            r2.f327057x = r3
            r2.f327058y = r1
            l23.a r1 = r0.f316553Q
            l23.j r2 = r22.getMultiPreviewPlugin()
            l23.j$e r2 = r2.f326958C
            r1.getClass()
            l23.t0 r1 = r0.f316551N
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r1 = r1.f327035h
            r2 = 0
            r1.f317010K = r2
            return
        L_0x04bc:
            gy3.C87412m.m108603p(r6)
            r1 = 0
            throw r1
        L_0x04c1:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x04c6:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x04cb:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x04d0:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x04d5:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x04da:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x04df:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x04e4:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x04e9:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x04ee:
            r1 = 0
            gy3.C87412m.m108603p(r5)
            throw r1
        L_0x04f3:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x04f8:
            r1 = 0
            java.lang.String r2 = "editMagicPlugin"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x04ff:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0504:
            r1 = 0
            gy3.C87412m.m108603p(r5)
            throw r1
        L_0x0509:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x050e:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        L_0x0513:
            r1 = 0
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x0518:
            r1 = 0
            gy3.C87412m.m108603p(r10)
            throw r1
        L_0x051d:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x0522:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x0527:
            r1 = 0
            gy3.C87412m.m108603p(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.mo128671k(wg2.a, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ef  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129855l(h90.C98324b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "loadCurrentPage time:"
            r2.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.append(r3)
            java.lang.String r3 = " model:"
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            super.mo129855l(r19)
            hi2.q r2 = r0.f316557S
            r2.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.util.HashMap<java.lang.String, java.lang.Long> r2 = r2.f171023d
            java.lang.String r5 = "start"
            r2.put(r5, r4)
            r0.f316544G = r1
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f316576g1
            r2.clear()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r0.f316543F
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0111
            android.os.Bundle r2 = r2.f272912M
            if (r2 == 0) goto L_0x0111
            java.lang.Class<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r6 = com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem.class
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r2.setClassLoader(r6)
            java.lang.String r6 = "media_list"
            java.util.ArrayList r6 = r2.getParcelableArrayList(r6)
            if (r6 == 0) goto L_0x0078
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "loadMediaList:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r7 = r0.f316576g1
            r7.addAll(r6)
        L_0x0078:
            java.lang.String r6 = "KEY_DISABLE_IMAGE_ADD_MUSIC"
            boolean r6 = r2.getBoolean(r6, r4)
            r0.f316547J = r6
            java.lang.String r6 = "KEY_DISABLE_VIDEO_ENHANCEMENT"
            r2.getBoolean(r6, r4)
            l23.y0 r2 = r0.f316558S0
            r2.getClass()
            d23.a r6 = d23.C106976a.f320208a
            android.widget.RelativeLayout r2 = r2.f327073i
            r6 = 8
            r2.setVisibility(r6)
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f316576g1
            boolean r6 = r2 instanceof java.util.Collection
            if (r6 == 0) goto L_0x00a0
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x00a0
            goto L_0x00bd
        L_0x00a0:
            java.util.Iterator r2 = r2.iterator()
        L_0x00a4:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00bd
            java.lang.Object r6 = r2.next()
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r6 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r6
            int r6 = r6.getType()
            if (r6 != r5) goto L_0x00b8
            r6 = 1
            goto L_0x00b9
        L_0x00b8:
            r6 = 0
        L_0x00b9:
            if (r6 != 0) goto L_0x00a4
            r2 = 0
            goto L_0x00be
        L_0x00bd:
            r2 = 1
        L_0x00be:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "loadMediaList isAllImage:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
            if (r2 == 0) goto L_0x00ef
            l23.g r2 = r0.f316549L
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r3 = r0.f316576g1
            r2.mo86112z(r3)
            r18.mo152175D()
            q23.a r2 = r0.f316592r
            r2.mo161844B(r4)
            q23.a r2 = r0.f316592r
            r2.mo161856N(r5)
            l23.i0 r2 = r0.f316556R0
            android.view.View r3 = r2.f326953g
            r2.f326955i = r3
            goto L_0x00fc
        L_0x00ef:
            r18.mo152177F()
            q23.a r2 = r0.f316592r
            r2.mo161856N(r5)
            l23.i0 r2 = r0.f316556R0
            r2.mo160442x()
        L_0x00fc:
            java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> r2 = r0.f316576g1
            java.lang.Object r2 = sx3.C110818d0.m150914L(r2)
            r7 = r2
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r7 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r7
            r18.mo152184q()
            l23.o0 r6 = r0.f316539B
            r8 = 0
            r9 = 1
            r10 = 2
            r11 = 0
            l23.C61205o0.m71752z(r6, r7, r8, r9, r10, r11)
        L_0x0111:
            a14.s1 r12 = a14.C0001s1.f0d
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            r14 = 0
            j23.f r15 = new j23.f
            r2 = 0
            r15.<init>(r0, r2)
            r16 = 2
            r17 = 0
            a14.C53895h.m60466d(r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0135
            l23.f0 r3 = r0.f316593s
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r6 = r0.f316543F
            gy3.C87412m.m108591d(r6)
            r3.getClass()
            r3.f326908h = r6
            r3.f326909i = r1
        L_0x0135:
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            th2.d r1 = th2.C110992d.f332425a
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.String r8 = "KEY_ENTER_EDIT_PAGE_TIME_MS_LONG"
            r1.mo162677k(r8, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            f40.e r3 = f40.C86709a0.m107523b()
            java.lang.String r3 = r3.mo121111i()
            r1.append(r3)
            r3 = 95
            r1.append(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.f316575f1 = r1
            th2.c r3 = r0.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r3 = r3.f332424a
            java.lang.String r6 = "EditId"
            java.lang.String r1 = r3.mo86045b(r6, r1, r5)
            r3.f310215e = r1
            l23.t0 r1 = r0.f316551N
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r1 = r1.f327035h
            r1.setScrollCount(r4)
            l23.j r1 = r18.getMultiPreviewPlugin()
            r1.f326980w = r4
            java.lang.Class<y23.i> r1 = y23.C112389i.class
            lh2.g0 r1 = r0.mo151221j(r1)
            y23.i r1 = (y23.C112389i) r1
            if (r1 == 0) goto L_0x01c8
            java.lang.String r3 = "21875"
            y23.h r4 = r1.mo164106y(r3)
            y23.e r4 = (y23.C112386e) r4
            if (r4 == 0) goto L_0x019f
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r0.f316543F
            java.lang.String r5 = x23.C112038b.m152775b(r5)
            T r4 = r4.f336503d
            com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct r4 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) r4
            if (r4 != 0) goto L_0x019c
            goto L_0x019f
        L_0x019c:
            r4.mo1040v(r5)
        L_0x019f:
            y23.h r4 = r1.mo164106y(r3)
            y23.e r4 = (y23.C112386e) r4
            if (r4 == 0) goto L_0x01b7
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r5 = r0.f316543F
            java.lang.String r5 = x23.C112038b.m152776c(r5)
            T r4 = r4.f336503d
            com.tencent.mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct r4 = (com.tencent.p014mm.autogen.mmdata.rpt.FinderShowInWXProfileStruct) r4
            if (r4 != 0) goto L_0x01b4
            goto L_0x01b7
        L_0x01b4:
            r4.mo1041w(r5)
        L_0x01b7:
            y23.h r1 = r1.mo164106y(r3)
            y23.e r1 = (y23.C112386e) r1
            if (r1 == 0) goto L_0x01c8
            java.lang.String r3 = r0.f316575f1
            java.lang.String r4 = "editId"
            gy3.C87412m.m108594g(r3, r4)
            r1.f336498f = r3
        L_0x01c8:
            long r3 = java.lang.System.currentTimeMillis()
            r0.f316587n1 = r3
            i23.a r5 = i23.C8847a.f28097a
            r6 = 101(0x65, float:1.42E-43)
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 124(0x7c, float:1.74E-43)
            r15 = 0
            i23.C8847a.m8677a(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)
            android.content.Context r1 = r18.getContext()
            boolean r3 = r1 instanceof android.app.Activity
            if (r3 == 0) goto L_0x01ea
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x01eb
        L_0x01ea:
            r1 = r2
        L_0x01eb:
            if (r1 == 0) goto L_0x0233
            android.content.Intent r3 = r1.getIntent()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r0.f316543F
            if (r4 == 0) goto L_0x0200
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r4 = r4.f272908I
            if (r4 == 0) goto L_0x0200
            long r4 = r4.f272944h
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0201
        L_0x0200:
            r4 = r2
        L_0x0201:
            java.lang.String r5 = "key_ref_feed_id"
            r3.putExtra(r5, r4)
            android.content.Intent r1 = r1.getIntent()
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f316543F
            if (r3 == 0) goto L_0x0218
            com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo r3 = r3.f272908I
            if (r3 == 0) goto L_0x0218
            int r2 = r3.f272943g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0218:
            java.lang.String r3 = "key_ref_comment_scene"
            r1.putExtra(r3, r2)
            java.lang.Class<ht1.e4> r1 = ht1.C60165e4.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.e4 r1 = (ht1.C60165e4) r1
            android.content.Context r2 = r18.getContext()
            java.lang.String r3 = "context"
            gy3.C87412m.m108593f(r2, r3)
            r3 = 67
            r1.mo85160V8(r2, r3)
        L_0x0233:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.mo129855l(h90.b):void");
    }

    /* renamed from: m */
    public final void mo152181m(MultiMediaEditResultStruct multiMediaEditResultStruct) {
        C108531a aVar = this.f316597w;
        if (aVar != null) {
            AudioCacheInfo audioCacheInfo = aVar.f324881p;
            if (audioCacheInfo != null) {
                multiMediaEditResultStruct.f265756u = (long) audioCacheInfo.f163821p;
                FinderObject finderObject = audioCacheInfo.f163830y;
                if (finderObject != null) {
                    multiMediaEditResultStruct.f265755t = multiMediaEditResultStruct.mo86045b("MusicFeedid", Util.getUnsignedLongString(finderObject.f164794id), true);
                } else {
                    multiMediaEditResultStruct.f265754s = (long) audioCacheInfo.f163813e;
                }
            }
        } else {
            C87412m.m108603p("addMusicPlugin");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010d, code lost:
        if (r4 != false) goto L_0x010f;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152182n(java.lang.String r17, fy3.C32228q<? super java.lang.Boolean, ? super te3.C64899zy, ? super android.graphics.Bitmap, rx3.C13598b0> r18) {
        /*
            r16 = this;
            r12 = r16
            r0 = r17
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r12.f316543F
            gy3.C87412m.m108591d(r1)
            java.lang.String r5 = r1.f272901B
            gy3.f0 r9 = new gy3.f0
            r9.<init>()
            q23.a r1 = r12.f316592r
            float[] r1 = r1.mo161850H()
            r9.f27484d = r1
            q23.a r1 = r12.f316592r
            java.util.ArrayList r2 = r1.mo161846D()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "exportVideo, editData:"
            r1.append(r3)
            int r3 = r2.size()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_VIDEO_REMUX_BACKGROUND_INT_SYNC
            r6 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r1.mo119685f(r4, r6)
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r6 = gy3.C87412m.m108589b(r1, r6)
            r13 = 1
            if (r6 == 0) goto L_0x005a
            r1 = 0
            r10 = 0
            goto L_0x0076
        L_0x005a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            boolean r1 = gy3.C87412m.m108589b(r1, r6)
            if (r1 == 0) goto L_0x0067
            r1 = 1
            r10 = 1
            goto L_0x0076
        L_0x0067:
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_finder_remux_background
            boolean r1 = r1.mo58784wf(r6, r13)
            r10 = r1
        L_0x0076:
            com.tencent.mm.plugin.vlog.model.f0 r1 = r12.f316545H
            r1.getClass()
            android.util.Size r6 = new android.util.Size
            int r7 = r1.f316431j
            int r1 = r1.f316432n
            r6.<init>(r7, r1)
            android.graphics.Rect r7 = new android.graphics.Rect
            l23.j r1 = r16.getMultiPreviewPlugin()
            android.graphics.Rect r1 = r1.mo160444B()
            r7.<init>(r1)
            l23.d0 r1 = r12.f316562U0
            boolean r1 = r1.f326891z
            if (r1 != 0) goto L_0x00a8
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r1 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r1 = r1.f272892b
            android.graphics.Rect[] r8 = new android.graphics.Rect[r13]
            r8[r4] = r7
            java.util.ArrayList r8 = sx3.C64197v.m75534c(r8)
            java.lang.String r11 = "KEY_POST_HALF_RECT_LIST"
            r1.putParcelableArrayList(r11, r8)
        L_0x00a8:
            com.tencent.mm.plugin.vlog.model.p0 r8 = new com.tencent.mm.plugin.vlog.model.p0
            com.tencent.mm.plugin.vlog.model.f0 r1 = r12.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.f316438t
            r8.<init>((com.tencent.p014mm.plugin.vlog.model.C96552p0) r1)
            com.tencent.mm.xeffect.effect.EffectManager r1 = d23.C106976a.f320215h
            r8.mo134623t(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r11 = "exportVideo musicPath:"
            r1.append(r11)
            r1.append(r0)
            java.lang.String r11 = ", remuxBackgroud:"
            r1.append(r11)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r0 == 0) goto L_0x00d7
            r8.mo134608e(r0, r13)
        L_0x00d7:
            j23.a r1 = r12.f316597w
            if (r1 == 0) goto L_0x0132
            boolean r1 = r1.mo159392z()
            r1 = r1 ^ r13
            r8.mo81185d(r1)
            l23.y0 r1 = r12.f316558S0
            r1.getClass()
            r8.f282576i = r4
            com.tencent.mm.plugin.vlog.model.i r11 = new com.tencent.mm.plugin.vlog.model.i
            r11.<init>(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 == 0) goto L_0x010f
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ r13
            if (r0 != 0) goto L_0x010f
            java.util.ArrayList<com.tencent.mm.plugin.vlog.model.q0> r0 = r8.f282570c
            int r0 = r0.size()
            if (r0 > r13) goto L_0x010f
            h90.b r0 = r12.f316544G
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.f288182c
            if (r0 != r13) goto L_0x010d
            r4 = 1
        L_0x010d:
            if (r4 == 0) goto L_0x0111
        L_0x010f:
            r12.f316582j1 = r13
        L_0x0111:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            l23.j r0 = r16.getMultiPreviewPlugin()
            android.graphics.RectF r0 = r0.f326972o
            r0.round(r14)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$d r15 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$d
            r0 = r15
            r1 = r16
            r3 = r8
            r4 = r11
            r8 = r14
            r11 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "MultiVideoPluginLayout_exportVideo"
            o40.C61926c.m72657B(r0, r13, r15)
            return
        L_0x0132:
            java.lang.String r0 = "addMusicPlugin"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.mo152182n(java.lang.String, fy3.q):void");
    }

    /* renamed from: o */
    public final void mo152183o(C99685b.C99690d dVar, String[] strArr, ArrayList<String> arrayList, ArrayList<Rect> arrayList2, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, int i) {
        C8479f0 f0Var = new C8479f0();
        T t = this.f316545H.f316425d.get(i);
        C87412m.m108593f(t, "multiMedia.pathList[index]");
        f0Var.f27484d = t;
        if (this.f316585m1) {
            C106976a aVar = C106976a.f320208a;
            if (C106976a.f320217j.containsKey(t)) {
                T t2 = (String) C106976a.f320217j.get(f0Var.f27484d);
                if (t2 == null) {
                    t2 = "";
                }
                if (C86013q1.m106450k(t2)) {
                    Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "generateCropImage enable enhancement, use enhancement result image path:" + t2);
                    f0Var.f27484d = t2;
                }
            }
        }
        this.f316593s.mo160422A((String) f0Var.f27484d, new C96564e(f0Var, i, this, dVar, strArr, arrayList, arrayList2, captureVideoNormalModel));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1024 && i2 == -1) {
            getMultiPreviewPlugin().mo160443A();
            C106195f0 f0Var = this.f316545H;
            if (f0Var.f316429h) {
                C106976a.f320208a.mo157404h(f0Var.f316425d);
                C61196g gVar = this.f316549L;
                gVar.mo86111y(gVar.mo86110x());
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "onDetach");
        C109202j multiPreviewPlugin = getMultiPreviewPlugin();
        VideoCompositionPlayView videoCompositionPlayView = multiPreviewPlugin.f326970j;
        if (videoCompositionPlayView != null) {
            videoCompositionPlayView.mo154756f();
            multiPreviewPlugin.f326970j = null;
        }
        View view = this.f316577h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C106976a.f320208a.mo157403g();
        this.f316558S0.f327077p.getClass();
        Log.m105924i("MicroMsg.CompositionLabelRetriever", "cancel get label");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x048b, code lost:
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x048d, code lost:
        r1 = r38;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r38, android.os.Bundle r39) {
        /*
            r37 = this;
            r8 = r37
            r9 = r38
            r10 = r39
            ai2.d r0 = ai2.C92011d.RECORD_CAPTION
            j23.c r11 = j23.C108536c.SINGLE_EDIT
            j23.c r1 = j23.C108536c.GLOBAL_EDIT
            gi2.b r2 = gi2.C98129b.EditItemTypeLyrics
            java.lang.String r3 = "status"
            gy3.C87412m.m108594g(r9, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "statusChange "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = "  param:"
            r3.append(r4)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            int r3 = r38.ordinal()
            r5 = 19
            java.lang.String r6 = ""
            if (r3 == r5) goto L_0x0ff6
            r5 = 29
            if (r3 == r5) goto L_0x0fef
            r5 = 42
            java.lang.String r7 = "PARAM_EDIT_TEXT_CONTENT"
            java.lang.String r13 = "addTextPlugin"
            java.lang.String r14 = "PARAM_EDIT_TEXT_FONT"
            java.lang.String r15 = "PARAM_EDIT_TEXT_COLOR_BG_INT"
            java.lang.String r12 = "PARAM_EDIT_TEXT_COLOR"
            r17 = r6
            if (r3 == r5) goto L_0x0fc7
            java.lang.String r6 = "PARAM_1_INT"
            r5 = 4
            r21 = r6
            r6 = 66
            if (r3 == r6) goto L_0x0f65
            r6 = 70
            if (r3 == r6) goto L_0x0f54
            r6 = 52
            java.lang.String r19 = "addMusicPlugin"
            r24 = r1
            r25 = r2
            if (r3 == r6) goto L_0x0eb8
            r6 = 53
            if (r3 == r6) goto L_0x0e4b
            switch(r3) {
                case 32: goto L_0x0152;
                case 33: goto L_0x0152;
                case 34: goto L_0x0152;
                case 35: goto L_0x013d;
                case 36: goto L_0x012c;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00bf;
                default: goto L_0x006d;
            }
        L_0x006d:
            switch(r3) {
                case 45: goto L_0x019e;
                case 46: goto L_0x019b;
                case 47: goto L_0x0198;
                case 48: goto L_0x018f;
                case 49: goto L_0x0180;
                case 50: goto L_0x0161;
                default: goto L_0x0070;
            }
        L_0x0070:
            java.lang.String r6 = "captionPlugin"
            java.lang.String r1 = "KEY_EXIT_CROP_PAGE_TIME_MS_LONG"
            java.lang.String r2 = "PARAM_1_BOOLEAN"
            java.lang.String r5 = "null cannot be cast to non-null type android.app.Activity"
            r29 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r3) {
                case 57: goto L_0x031e;
                case 58: goto L_0x02fa;
                case 59: goto L_0x02aa;
                case 60: goto L_0x0285;
                case 61: goto L_0x0270;
                case 62: goto L_0x0269;
                case 63: goto L_0x01f3;
                case 64: goto L_0x01a9;
                default: goto L_0x007f;
            }
        L_0x007f:
            switch(r3) {
                case 72: goto L_0x048b;
                case 73: goto L_0x048b;
                case 74: goto L_0x0358;
                case 75: goto L_0x034f;
                case 76: goto L_0x0346;
                case 77: goto L_0x032e;
                case 78: goto L_0x0325;
                default: goto L_0x0082;
            }
        L_0x0082:
            java.lang.String r1 = "EDIT_VLOG_TRAKC_CROP_END"
            java.lang.String r5 = "EDIT_VLOG_TRACK_CROP_START"
            java.lang.String r0 = "PARAM_1_LONG"
            r30 = 1000(0x3e8, double:4.94E-321)
            r32 = r4
            java.lang.String r4 = "PARAM_1_BYTEARRAY"
            r34 = r5
            r33 = r6
            java.lang.String r5 = "EDIT_TRANSITION_EFFECT_ID"
            java.lang.String r6 = "EDIT_TRACK_DURATION_SCALE"
            java.lang.String r9 = "EDIT_VLOG_TRACK_CROP_CONFIRM"
            r35 = r11
            java.lang.String r11 = "EDIT_VLOG_SELECT_TRACK"
            r36 = r9
            java.lang.String r9 = "EDIT_SELECT_TRANSITION_INDEX"
            switch(r3) {
                case 93: goto L_0x0e08;
                case 94: goto L_0x0d91;
                case 95: goto L_0x0cf1;
                case 96: goto L_0x0ca2;
                case 97: goto L_0x0c59;
                case 98: goto L_0x0c59;
                case 99: goto L_0x0bac;
                case 100: goto L_0x0b54;
                case 101: goto L_0x0ab5;
                case 102: goto L_0x0a64;
                case 103: goto L_0x0a25;
                case 104: goto L_0x09f2;
                case 105: goto L_0x09c7;
                case 106: goto L_0x0973;
                case 107: goto L_0x095e;
                case 108: goto L_0x092c;
                case 109: goto L_0x08ee;
                case 110: goto L_0x08c8;
                case 111: goto L_0x0882;
                case 112: goto L_0x0864;
                case 113: goto L_0x084e;
                case 114: goto L_0x07e0;
                case 115: goto L_0x07d4;
                case 116: goto L_0x07c8;
                case 117: goto L_0x0755;
                case 118: goto L_0x072c;
                case 119: goto L_0x06df;
                case 120: goto L_0x067b;
                case 121: goto L_0x0625;
                case 122: goto L_0x0528;
                case 123: goto L_0x04fb;
                case 124: goto L_0x0497;
                case 125: goto L_0x0491;
                case 126: goto L_0x0491;
                case 127: goto L_0x0491;
                case 128: goto L_0x0488;
                case 129: goto L_0x0475;
                case 130: goto L_0x041f;
                case 131: goto L_0x040b;
                case 132: goto L_0x03f1;
                case 133: goto L_0x03e4;
                case 134: goto L_0x03cb;
                case 135: goto L_0x03be;
                case 136: goto L_0x037f;
                case 137: goto L_0x036c;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unknown key "
            r0.append(r1)
            r1 = r38
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2 = r32
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x1021
        L_0x00bf:
            lh2.i r0 = r8.f316595u
            if (r0 == 0) goto L_0x00cc
            android.widget.ImageView r0 = r0.f327360h
            r0.performClick()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x00cc:
            gy3.C87412m.m108603p(r13)
            r1 = 0
            throw r1
        L_0x00d1:
            if (r10 == 0) goto L_0x0129
            q23.a r0 = r8.f316592r
            r0.getClass()
            java.lang.CharSequence r17 = r10.getCharSequence(r7)
            int r18 = r10.getInt(r12)
            int r19 = r10.getInt(r15)
            java.lang.String r20 = r10.getString(r14)
            ai2.s r1 = new ai2.s
            gy3.C87412m.m108591d(r20)
            r21 = 0
            r22 = 0
            r23 = 48
            r24 = 0
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r8.f316542E
            r1.mo125866h(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            q23.a r0 = r8.f316592r
            com.tencent.mm.plugin.vlog.model.f0 r2 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r2 = r2.mo152115h()
            java.lang.String r3 = r8.f316541D
            l23.j r4 = r37.getMultiPreviewPlugin()
            r4.mo160461y()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r4 = r4.f326970j
            gy3.C87412m.m108591d(r4)
            long r4 = r4.getPosition()
            r0.mo161860x(r1, r2, r3, r4)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
        L_0x0129:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x012c:
            lh2.e r0 = r8.f316594t
            if (r0 == 0) goto L_0x0136
            r0.mo138867z()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0136:
            java.lang.String r0 = "addEmojiPlugin"
            gy3.C87412m.m108603p(r0)
            r1 = 0
            throw r1
        L_0x013d:
            if (r10 == 0) goto L_0x014f
            java.lang.String r0 = "EDIT_CROP_VIDEO_CURRENT_TIME_INT"
            int r0 = r10.getInt(r0)
            l23.j r1 = r37.getMultiPreviewPlugin()
            long r2 = (long) r0
            r1.mo160453L(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x014f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0152:
            qh2.e$b r0 = qh2.C101198e.C101199b.EDIT_VIDEO_WITH_TEXT
            if (r9 != r0) goto L_0x0159
            r37.mo152185r()
        L_0x0159:
            r37.mo152184q()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x015e:
            r1 = r9
            goto L_0x1021
        L_0x0161:
            if (r10 == 0) goto L_0x017d
            java.lang.String r0 = "PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN"
            boolean r0 = r10.getBoolean(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r0.booleanValue()
            r2 = 1
            r3 = 1
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x017d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0180:
            r37.mo152176E()
            q23.a r0 = r8.f316592r
            ai2.a r1 = r0.f330094g
            if (r1 == 0) goto L_0x018c
            r0.mo161858P(r1)
        L_0x018c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x018f:
            r37.mo152185r()
            r37.mo152184q()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0198:
            r37.mo152185r()
        L_0x019b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x019e:
            r37.mo152184q()
            l23.t0 r0 = r8.f316551N
            r0.setVisibility(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x01a9:
            if (r10 == 0) goto L_0x01e4
            java.lang.String r0 = "PARAM_DELETE_VIEW_TYPE_INT"
            int r0 = r10.getInt(r0)
            r1 = 4
            if (r0 != r1) goto L_0x01c1
            j23.a r0 = r8.f316597w
            if (r0 == 0) goto L_0x01bc
            r0.mo159381A()
            goto L_0x01e2
        L_0x01bc:
            gy3.C87412m.m108603p(r19)
            r1 = 0
            throw r1
        L_0x01c1:
            r1 = 0
            r2 = 6
            if (r0 != r2) goto L_0x01d2
            m23.c r0 = r8.f316598x
            if (r0 == 0) goto L_0x01ce
            r2 = 0
            r0.mo160718z(r2)
            goto L_0x01e2
        L_0x01ce:
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x01d2:
            r2 = 7
            if (r0 != r2) goto L_0x01e2
            m23.c r0 = r8.f316598x
            if (r0 == 0) goto L_0x01de
            r2 = 1
            r0.mo160718z(r2)
            goto L_0x01e2
        L_0x01de:
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x01e2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x01e4:
            r2 = 1
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x01f3:
            if (r10 == 0) goto L_0x01ff
            java.lang.String r1 = "PARAM_VIDEO_NEED_CROP"
            boolean r1 = r10.getBoolean(r1)
            if (r1 != 0) goto L_0x01ff
            r1 = 1
            goto L_0x0200
        L_0x01ff:
            r1 = 0
        L_0x0200:
            if (r1 == 0) goto L_0x020f
            j23.a r1 = r8.f316597w
            if (r1 == 0) goto L_0x020a
            r1.mo159390x()
            goto L_0x020f
        L_0x020a:
            gy3.C87412m.m108603p(r19)
            r1 = 0
            throw r1
        L_0x020f:
            l23.o0 r1 = r8.f316539B
            r1.mo86128x()
            android.content.Context r1 = r37.getContext()
            gy3.C87412m.m108592e(r1, r5)
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.setAlpha(r0)
            l23.u0 r0 = r8.f316552P
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder r0 = r0.f327042f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x023d
            r6 = 1
            goto L_0x023e
        L_0x023d:
            r6 = 0
        L_0x023e:
            if (r6 != 0) goto L_0x0243
            r37.mo152176E()
        L_0x0243:
            l23.n0 r0 = r8.f316601y0
            r1 = 1
            r0.mo160469x(r1)
            l23.d0 r0 = r8.f316562U0
            r0.mo160414E()
            com.tencent.mm.plugin.vlog.model.FinderVideoShell r0 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82198a
            java.lang.String r0 = "MicroMsg.FinderVideoShell"
            java.lang.String r1 = "markFirstFrameShow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            long r0 = com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82205h
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0265
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            com.tencent.p014mm.plugin.vlog.model.FinderVideoShell.f82205h = r0
        L_0x0265:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0269:
            r37.mo152178G()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0270:
            l23.d0 r0 = r8.f316562U0
            boolean r0 = r0.mo160412C()
            if (r0 == 0) goto L_0x027e
            l23.d0 r0 = r8.f316562U0
            r0.mo160411B()
            goto L_0x0281
        L_0x027e:
            r37.mo152178G()
        L_0x0281:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0285:
            j23.a r0 = r8.f316597w
            if (r0 == 0) goto L_0x02a5
            r0.mo159390x()
            q23.a r0 = r8.f316592r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r2 = 1
            r0.setEnableTouch(r2)
            th2.d r0 = th2.C110992d.f332425a
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo162677k(r1, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x02a5:
            gy3.C87412m.m108603p(r19)
            r1 = 0
            throw r1
        L_0x02aa:
            h90.b r0 = r8.f316544G
            if (r0 == 0) goto L_0x02f6
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r2 = r8.f316543F
            if (r2 == 0) goto L_0x02b5
            int r2 = r2.f272935w
            goto L_0x02b7
        L_0x02b5:
            r2 = 10000(0x2710, float:1.4013E-41)
        L_0x02b7:
            int r3 = r0.mo137613c()
            int r0 = r0.mo137618g()
            int r3 = r3 - r0
            int r2 = r2 + 250
            if (r3 <= r2) goto L_0x02df
            android.content.Context r0 = r37.getContext()
            gy3.C87412m.m108592e(r0, r5)
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 3000(0xbb8, float:4.204E-42)
            r0.setResult(r1)
            android.content.Context r0 = r37.getContext()
            gy3.C87412m.m108592e(r0, r5)
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x02df:
            q23.a r0 = r8.f316592r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r2 = 1
            r0.setEnableTouch(r2)
            th2.d r0 = th2.C110992d.f332425a
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.mo162677k(r1, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02f6:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x02fa:
            if (r10 == 0) goto L_0x0302
            r1 = 0
            boolean r6 = r10.getBoolean(r2, r1)
            goto L_0x0303
        L_0x0302:
            r6 = 0
        L_0x0303:
            if (r6 != 0) goto L_0x030f
            if (r6 != 0) goto L_0x031a
            l23.g0 r0 = r8.f316560T0
            boolean r0 = r0.mo160432y()
            if (r0 == 0) goto L_0x031a
        L_0x030f:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
        L_0x031a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x031e:
            r37.mo152185r()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0325:
            l23.f0 r0 = r8.f316593s
            r0.mo160424C()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x032e:
            l23.f0 r0 = r8.f316593s
            r0.reset()
            if (r10 == 0) goto L_0x0342
            l23.f0 r0 = r8.f316593s
            java.lang.String r1 = "EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT"
            int r1 = r10.getInt(r1)
            r0.mo160427z(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0342:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0346:
            l23.f0 r0 = r8.f316593s
            r0.mo160426y()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x034f:
            l23.f0 r0 = r8.f316593s
            r0.mo160423B()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x0358:
            r1 = 0
            r8.f316573d1 = r1
            r37.mo152176E()
            l23.g r0 = r8.f316549L
            r0.setVisibility(r1)
            l23.f0 r0 = r8.f316593s
            r0.reset()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x015e
        L_0x036c:
            j23.a r0 = r8.f316597w
            if (r0 == 0) goto L_0x037a
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r0 = r0.f324878j
            r1 = 1
            r0.setShow(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x037a:
            gy3.C87412m.m108603p(r19)
            r1 = 0
            throw r1
        L_0x037f:
            if (r10 == 0) goto L_0x0387
            r1 = 0
            boolean r6 = r10.getBoolean(r2, r1)
            goto L_0x0388
        L_0x0387:
            r6 = 0
        L_0x0388:
            r8.f316585m1 = r6
            d23.a r0 = d23.C106976a.f320208a
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            r0.mo157406j(r1, r6)
            if (r6 == 0) goto L_0x039e
            l23.j r0 = r37.getMultiPreviewPlugin()
            r0.mo160457P()
        L_0x039e:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            boolean r0 = r0.mo152120q()
            if (r0 == 0) goto L_0x03b3
            boolean r0 = r8.f316571b1
            if (r0 != 0) goto L_0x03b3
            l23.g r0 = r8.f316549L
            int r1 = r0.mo86110x()
            r0.mo86111y(r1)
        L_0x03b3:
            l23.j r0 = r37.getMultiPreviewPlugin()
            r0.mo160443A()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x03be:
            l23.m0 r0 = r8.f316554Q0
            d23.a$c r0 = r0.mo138709x()
            r8.setupTemplateVideoPlugins(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x03cb:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            boolean r0 = r0.mo152120q()
            if (r0 == 0) goto L_0x03dd
            r1 = 0
            r8.setupImageEditPlugins(r1)
            q23.a r0 = r8.f316592r
            r0.mo161844B(r1)
            goto L_0x03e0
        L_0x03dd:
            r37.mo152174C()
        L_0x03e0:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x03e4:
            l23.m0 r0 = r8.f316554Q0
            d23.a$c r0 = r0.mo138709x()
            r8.setupTemplateVideoPlugins(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x03f1:
            q23.a r0 = r8.f316592r
            r0.mo161857O()
            q23.a r0 = r8.f316592r
            r1 = 0
            r0.mo161855M(r1)
            r2 = 1
            r3 = 1
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x040b:
            q23.a r0 = r8.f316592r
            r1 = 0
            r0.mo161855M(r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x041f:
            if (r10 == 0) goto L_0x048d
            long r4 = r10.getLong(r0)
            q23.a r0 = r8.f316592r
            ai2.a r0 = r0.mo161845C()
            boolean r1 = r0 instanceof ai2.C92023q
            if (r1 == 0) goto L_0x0433
            r6 = r0
            ai2.q r6 = (ai2.C92023q) r6
            goto L_0x0434
        L_0x0433:
            r6 = 0
        L_0x0434:
            if (r6 == 0) goto L_0x045e
            d23.a r0 = d23.C106976a.f320208a
            com.tencent.mm.xeffect.effect.EffectManager r0 = r0.mo157400d()
            gy3.C87412m.m108591d(r0)
            long r1 = r6.mo125985l()
            rr3.c0 r0 = r0.mo154932l(r1)
            if (r0 == 0) goto L_0x045e
            ci2.d r1 = r6.mo125862d()
            long r1 = r1.mo146049c()
            ci2.d r3 = r6.mo125862d()
            long r6 = r3.mo146048b()
            r0.mo162189b(r1, r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x045e:
            q23.a r0 = r8.f316592r
            r0.mo161857O()
            q23.a r0 = r8.f316592r
            r1 = 0
            r0.mo161855M(r1)
            r2 = 1
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0475:
            q23.a r0 = r8.f316592r
            ai2.a r0 = r0.mo161845C()
            if (r0 == 0) goto L_0x048d
            r37.mo152185r()
            o23.a r1 = r8.f316540C
            r1.mo161249z(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0488:
            r37.mo152176E()
        L_0x048b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x048d:
            r1 = r38
            goto L_0x1021
        L_0x0491:
            r37.mo152184q()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0497:
            if (r10 == 0) goto L_0x048d
            java.lang.String r0 = "EDIT_PAG_CHANGE_TEXT"
            java.lang.String r0 = r10.getString(r0)
            if (r0 != 0) goto L_0x04a4
            r6 = r17
            goto L_0x04a5
        L_0x04a4:
            r6 = r0
        L_0x04a5:
            q23.a r0 = r8.f316592r
            ai2.a r0 = r0.mo161845C()
            boolean r1 = r0 instanceof ai2.C92023q
            if (r1 == 0) goto L_0x04b3
            r1 = r0
            ai2.q r1 = (ai2.C92023q) r1
            goto L_0x04b4
        L_0x04b3:
            r1 = 0
        L_0x04b4:
            if (r1 == 0) goto L_0x04ed
            r1.mo125993t(r6)
            d23.a r0 = d23.C106976a.f320208a
            com.tencent.mm.xeffect.effect.EffectManager r0 = r0.mo157400d()
            gy3.C87412m.m108591d(r0)
            long r2 = r1.mo125985l()
            rr3.c0 r0 = r0.mo154932l(r2)
            boolean r2 = r0 instanceof rr3.C110646v
            if (r2 == 0) goto L_0x04d2
            r6 = r0
            rr3.v r6 = (rr3.C110646v) r6
            goto L_0x04d3
        L_0x04d2:
            r6 = 0
        L_0x04d3:
            if (r6 == 0) goto L_0x04ed
            rr3.g r0 = new rr3.g
            java.lang.String r12 = r1.mo125988o()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 30
            r18 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r6.mo162194f(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04ed:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x04fb:
            if (r10 == 0) goto L_0x048d
            r37.mo152185r()
            r37.mo152184q()
            java.lang.CharSequence r0 = r10.getCharSequence(r7)
            l23.j0 r1 = r8.f316599x0
            if (r0 == 0) goto L_0x0514
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0512
            goto L_0x0514
        L_0x0512:
            r6 = r0
            goto L_0x0516
        L_0x0514:
            r6 = r17
        L_0x0516:
            r1.getClass()
            com.tencent.mm.plugin.vlog.ui.widget.PagInputView r0 = r1.f327000f
            r0.setup(r6)
            com.tencent.mm.plugin.vlog.ui.widget.PagInputView r0 = r1.f327000f
            r1 = 1
            r0.setShow(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0528:
            if (r10 == 0) goto L_0x048d
            java.lang.String r0 = "EDIT_PAG_STICKER_PATH"
            java.lang.String r0 = r10.getString(r0)
            if (r0 == 0) goto L_0x0621
            d23.a r1 = d23.C106976a.f320208a
            com.tencent.mm.xeffect.effect.EffectManager r2 = r1.mo157400d()
            if (r2 == 0) goto L_0x054e
            rr3.i r3 = rr3.C110632i.PAGTextEffect
            android.content.Context r4 = r37.getContext()
            android.content.res.AssetManager r4 = r4.getAssets()
            java.lang.String r5 = "context.assets"
            gy3.C87412m.m108593f(r4, r5)
            rr3.c0 r2 = r2.mo154928h(r3, r4, r0)
            goto L_0x054f
        L_0x054e:
            r2 = 0
        L_0x054f:
            com.tencent.mm.xeffect.effect.EffectManager r1 = r1.mo157400d()
            if (r1 == 0) goto L_0x0558
            r1.mo154923c(r2)
        L_0x0558:
            if (r2 == 0) goto L_0x055f
            long r3 = r2.mo162188a()
            goto L_0x0561
        L_0x055f:
            r3 = 0
        L_0x0561:
            boolean r1 = r2 instanceof rr3.C110642r
            if (r1 == 0) goto L_0x0569
            r1 = r2
            rr3.r r1 = (rr3.C110642r) r1
            goto L_0x056a
        L_0x0569:
            r1 = 0
        L_0x056a:
            if (r1 == 0) goto L_0x0572
            android.util.Size r1 = r1.mo162192d()
            if (r1 != 0) goto L_0x0578
        L_0x0572:
            android.util.Size r1 = new android.util.Size
            r5 = 0
            r1.<init>(r5, r5)
        L_0x0578:
            android.content.Context r5 = r37.getContext()
            r6 = 2131824810(0x7f1110aa, float:1.9282458E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.getString(R.string.edit_pag_text_default)"
            gy3.C87412m.m108593f(r5, r6)
            boolean r6 = r2 instanceof rr3.C110646v
            if (r6 == 0) goto L_0x058f
            rr3.v r2 = (rr3.C110646v) r2
            goto L_0x0590
        L_0x058f:
            r2 = 0
        L_0x0590:
            if (r2 == 0) goto L_0x05ac
            rr3.g r6 = new rr3.g
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 30
            r33 = 0
            r26 = r6
            r27 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)
            r2.mo162194f(r6)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x05ac:
            ai2.q r2 = new ai2.q
            r6 = 2
            r7 = 0
            r2.<init>(r0, r7, r6, r7)
            r2.mo125990q(r3)
            r2.mo125993t(r5)
            boolean r0 = r8.f316542E
            r2.mo125866h(r0)
            int r0 = r1.getWidth()
            r2.mo125994u(r0)
            int r0 = r1.getHeight()
            r2.mo125991r(r0)
            android.graphics.RectF r0 = r2.mo125984k()
            l23.j r5 = r37.getMultiPreviewPlugin()
            android.graphics.RectF r5 = r5.mo160446D()
            r0.set(r5)
            android.content.Context r0 = r37.getContext()
            r5 = 160(0xa0, float:2.24E-43)
            int r0 = kg3.C76577a.m92151b(r0, r5)
            float r0 = (float) r0
            int r5 = r1.getWidth()
            float r5 = (float) r5
            float r5 = r0 / r5
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            float r0 = java.lang.Math.min(r5, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r0, r1)
            r2.mo125992s(r0)
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$o r0 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$o
            r0.<init>(r3, r2, r8)
            r2.mo125989p(r0)
            q23.a r0 = r8.f316592r
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r28 = r1.mo152115h()
            java.lang.String r1 = r8.f316541D
            r30 = 0
            r32 = 8
            r33 = 0
            r26 = r0
            r27 = r2
            r29 = r1
            q23.C110351a.m150172z(r26, r27, r28, r29, r30, r32, r33)
        L_0x0621:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0625:
            if (r10 == 0) goto L_0x048d
            int r0 = r10.getInt(r5)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            d23.a r2 = d23.C106976a.f320208a
            java.util.List r3 = r1.mo134619p()
            r2.mo157398b(r3, r0)
            int r0 = r10.getInt(r9)
            java.util.List r1 = r1.mo134619p()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r1.get(r0)
            com.tencent.mm.plugin.vlog.model.q0 r2 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r2
            r3 = 1
            int r0 = r0 + r3
            java.lang.Object r0 = r1.get(r0)
            com.tencent.mm.plugin.vlog.model.q0 r0 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r0
            long r1 = r2.mo152156g()
            sp3.c r0 = r0.mo152159j()
            sp3.h r0 = r0.mo162364b()
            long r3 = r0.mo162375a()
            r0 = 2
            long r5 = (long) r0
            long r3 = r3 / r5
            long r1 = r1 - r3
            long r1 = r1 - r30
            r3 = 0
            long r4 = java.lang.Math.max(r3, r1)
            r2 = 1
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x067b:
            if (r10 == 0) goto L_0x048d
            int r0 = r10.getInt(r9)
            int r1 = r10.getInt(r5)
            com.tencent.mm.plugin.vlog.model.f0 r2 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.mo152114g()
            java.util.List r3 = r2.mo134619p()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r3.get(r0)
            com.tencent.mm.plugin.vlog.model.q0 r4 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r4
            r5 = 1
            int r0 = r0 + r5
            java.lang.Object r0 = r3.get(r0)
            com.tencent.mm.plugin.vlog.model.q0 r0 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r0
            d23.a r3 = d23.C106976a.f320208a
            r3.mo157405i(r0, r1)
            long r3 = r4.mo152156g()
            sp3.c r0 = r0.mo152159j()
            sp3.h r0 = r0.mo162364b()
            long r0 = r0.mo162375a()
            r5 = 2
            long r5 = (long) r5
            long r0 = r0 / r5
            long r3 = r3 - r0
            long r0 = r3 - r30
            r5 = 0
            long r11 = java.lang.Math.max(r5, r0)
            long r0 = r2.getDurationMs()
            long r3 = r3 + r30
            long r13 = java.lang.Math.min(r0, r3)
            r2 = 1
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r37
            r4 = r11
            m142916B(r1, r2, r3, r4, r6, r7)
            l23.j r0 = r37.getMultiPreviewPlugin()
            r0.mo160455N(r11, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x06df:
            r37.mo152176E()
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r0 = r0.mo152114g()
            java.util.List r0 = r0.mo134619p()
            l23.t0 r1 = r8.f316551N
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r3 = 1
            int r2 = r2 - r3
            java.util.List r0 = sx3.C110818d0.m150948t0(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x0709:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0725
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.vlog.model.q0 r3 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r3
            sp3.c r3 = r3.f316501l
            sp3.h r3 = r3.f331477o
            boolean r3 = r3.mo162376b()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.add(r3)
            goto L_0x0709
        L_0x0725:
            r1.mo160475y(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x072c:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r0 = r0.mo152114g()
            l23.j r1 = r37.getMultiPreviewPlugin()
            long r2 = r0.mo134615l()
            long r4 = r0.mo134613j()
            r1.mo160455N(r2, r4)
            l23.j r0 = r37.getMultiPreviewPlugin()
            r23.a r1 = r8.f316590p0
            long r1 = r1.mo161966y()
            r0.mo160453L(r1)
            r37.mo152173A()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0755:
            if (r10 == 0) goto L_0x048d
            int r0 = r10.getInt(r9)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            java.util.List r2 = r1.mo134619p()
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r2.get(r0)
            com.tencent.mm.plugin.vlog.model.q0 r3 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r3
            int r4 = r0 + 1
            java.lang.Object r2 = r2.get(r4)
            com.tencent.mm.plugin.vlog.model.q0 r2 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r2
            long r3 = r3.mo152156g()
            sp3.c r5 = r2.mo152159j()
            sp3.h r5 = r5.mo162364b()
            long r5 = r5.mo162375a()
            r7 = 2
            long r11 = (long) r7
            long r5 = r5 / r11
            long r3 = r3 - r5
            long r5 = r3 - r30
            r11 = 0
            long r5 = java.lang.Math.max(r11, r5)
            long r11 = r1.getDurationMs()
            long r3 = r3 + r30
            long r3 = java.lang.Math.min(r11, r3)
            l23.j r1 = r37.getMultiPreviewPlugin()
            r1.mo160455N(r5, r3)
            l23.j r1 = r37.getMultiPreviewPlugin()
            r1.mo160453L(r5)
            r23.a r1 = r8.f316590p0
            r1.mo161963C(r5)
            r23.a r1 = r8.f316590p0
            int r2 = r2.mo152161l()
            r1.mo161961A()
            r23.b r3 = r1.mo161967z()
            r3.mo107635b(r0, r2)
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder r0 = r1.f330404h
            r1 = 1
            r0.setShow(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x07c8:
            l23.t0 r0 = r8.f316551N
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r0 = r0.f327035h
            r6 = 0
            r0.mo152397b(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x07d4:
            l23.t0 r0 = r8.f316551N
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r0 = r0.f327035h
            r1 = 1
            r0.mo152397b(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x07e0:
            r0 = r24
            r6 = 0
            r7 = 0
            r8.f316583k1 = r0
            r37.mo152176E()
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            boolean r0 = r0.mo152120q()
            if (r0 == 0) goto L_0x07f5
            boolean r0 = r8.f316571b1
            if (r0 == 0) goto L_0x084a
        L_0x07f5:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r0 = r0.mo152114g()
            l23.j r1 = r37.getMultiPreviewPlugin()
            long r2 = r0.mo134615l()
            long r4 = r0.mo134613j()
            r1.mo160455N(r2, r4)
            l23.g0 r0 = r8.f316560T0
            boolean r0 = r0.mo160432y()
            if (r0 == 0) goto L_0x0822
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = 7
            r9 = 0
            r1 = r37
            r11 = r7
            r13 = 0
            r6 = r0
            r7 = r9
            m142916B(r1, r2, r3, r4, r6, r7)
            goto L_0x0824
        L_0x0822:
            r11 = r7
            r13 = 0
        L_0x0824:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            r0.mo152124u(r11)
            l23.t0 r1 = r8.f316551N
            r2 = -1
            r3 = 0
            r5 = 0
            r1.mo160474x(r2, r3, r5)
            l23.b0 r0 = r8.f316563V
            r1 = -1
            r0.mo160406z(r1)
            l23.b0 r0 = r8.f316563V
            r2 = 8
            r0.setVisibility(r2)
            r23.a r0 = r8.f316590p0
            r0.mo161962B(r1)
            r23.a r0 = r8.f316590p0
            r0.setVisibility(r13)
        L_0x084a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x084e:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            q23.a r0 = r8.f316592r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r0.mo152274r()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0864:
            if (r10 == 0) goto L_0x048d
            r0 = r21
            int r0 = r10.getInt(r0)
            q23.a r1 = r8.f316592r
            r2 = 1
            if (r0 != r2) goto L_0x0874
            r0 = r29
            goto L_0x0876
        L_0x0874:
            ai2.d r0 = ai2.C92011d.CAPTION
        L_0x0876:
            r1.getClass()
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r1 = r1.f330093f
            r1.mo152267m(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0882:
            r11 = 0
            r13 = 0
            if (r10 == 0) goto L_0x048d
            byte[] r1 = r10.getByteArray(r4)
            if (r1 == 0) goto L_0x08ab
            int r1 = r10.getInt(r12, r13)
            int r2 = r10.getInt(r15, r13)
            java.lang.String r3 = r10.getString(r14)
            m23.c r5 = r8.f316598x
            if (r5 == 0) goto L_0x08a7
            byte[] r4 = r10.getByteArray(r4)
            gy3.C87412m.m108591d(r4)
            r5.mo160716H(r4, r1, r2, r3)
            goto L_0x08ab
        L_0x08a7:
            gy3.C87412m.m108603p(r33)
            throw r11
        L_0x08ab:
            r1 = -1
            long r1 = r10.getLong(r0, r1)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x08c4
            r2 = 0
            r3 = 0
            long r4 = r10.getLong(r0)
            r6 = 3
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
        L_0x08c4:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x08c8:
            r11 = 0
            if (r10 == 0) goto L_0x048d
            byte[] r0 = r10.getByteArray(r4)
            if (r0 == 0) goto L_0x08ea
            r37.mo152185r()
            r37.mo152184q()
            m23.c r0 = r8.f316598x
            if (r0 == 0) goto L_0x08e6
            byte[] r1 = r10.getByteArray(r4)
            gy3.C87412m.m108591d(r1)
            r0.mo160714F(r1)
            goto L_0x08ea
        L_0x08e6:
            gy3.C87412m.m108603p(r33)
            throw r11
        L_0x08ea:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x08ee:
            r2 = 0
            r11 = 0
            if (r10 == 0) goto L_0x048d
            byte[] r0 = r10.getByteArray(r4)
            if (r0 == 0) goto L_0x0928
            m23.c r0 = r8.f316598x
            if (r0 == 0) goto L_0x0924
            int r1 = r0.f327700z
            r3 = 1
            int r1 = r1 + r3
            r0.f327700z = r1
            r37.mo152185r()
            int r0 = r10.getInt(r12, r2)
            int r1 = r10.getInt(r15, r2)
            java.lang.String r2 = r10.getString(r14)
            lh2.i r3 = r8.f316595u
            if (r3 == 0) goto L_0x0920
            byte[] r4 = r10.getByteArray(r4)
            gy3.C87412m.m108591d(r4)
            r3.mo160548z(r4, r0, r1, r2)
            goto L_0x0928
        L_0x0920:
            gy3.C87412m.m108603p(r13)
            throw r11
        L_0x0924:
            gy3.C87412m.m108603p(r33)
            throw r11
        L_0x0928:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x092c:
            r0 = r21
            if (r10 == 0) goto L_0x048d
            int r0 = r10.getInt(r0)
            if (r0 != 0) goto L_0x0939
            ai2.d r0 = ai2.C92011d.CAPTION
            goto L_0x093b
        L_0x0939:
            r0 = r29
        L_0x093b:
            ai2.c r12 = new ai2.c
            byte[] r1 = r10.getByteArray(r4)
            gy3.C87412m.m108591d(r1)
            r12.<init>(r0, r1)
            q23.a r11 = r8.f316592r
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r13 = r0.mo152115h()
            java.lang.String r14 = r8.f316541D
            r15 = 0
            r17 = 8
            r18 = 0
            q23.C110351a.m150172z(r11, r12, r13, r14, r15, r17, r18)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x095e:
            if (r10 == 0) goto L_0x048d
            java.lang.String r0 = "EDIT_FILTER_SHOW"
            boolean r0 = r10.getBoolean(r0)
            if (r0 == 0) goto L_0x096c
            r37.mo152184q()
            goto L_0x096f
        L_0x096c:
            r37.mo152176E()
        L_0x096f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0973:
            if (r10 == 0) goto L_0x048d
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.getFloat(r6, r0)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            r1.mo152123t(r0)
            r37.mo152176E()
            l23.j r0 = r37.getMultiPreviewPlugin()
            r1 = 0
            r0.mo160454M(r1)
            l23.j r0 = r37.getMultiPreviewPlugin()
            r0.getClass()
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r0 = r0.mo152115h()
            if (r0 == 0) goto L_0x09a1
            long r0 = r0.mo152158i()
            r4 = r0
            goto L_0x09a3
        L_0x09a1:
            r4 = 0
        L_0x09a3:
            com.tencent.mm.plugin.vlog.model.f0 r11 = r8.f316545H
            r12 = 1
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 30
            r21 = 0
            com.tencent.p014mm.plugin.vlog.model.C106195f0.m142873l(r11, r12, r13, r15, r17, r18, r19, r20, r21)
            r2 = 1
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            r37.mo152173A()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x09c7:
            r11 = 0
            if (r10 == 0) goto L_0x048d
            l23.t0 r0 = r8.f316551N
            r1 = 4
            r0.setVisibility(r1)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r10.getFloat(r6, r0)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            r1.mo152123t(r0)
            l23.j r0 = r37.getMultiPreviewPlugin()
            j23.a r1 = r8.f316597w
            if (r1 == 0) goto L_0x09ee
            boolean r1 = r1.mo159392z()
            r0.mo160450H(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x09ee:
            gy3.C87412m.m108603p(r19)
            throw r11
        L_0x09f2:
            if (r10 == 0) goto L_0x048d
            java.lang.String r0 = "PARAM_EDIT_EMOJI_INFO"
            android.os.Parcelable r0 = r10.getParcelable(r0)
            r2 = r0
            com.tencent.mm.storage.emotion.EmojiInfo r2 = (com.tencent.p014mm.storage.emotion.EmojiInfo) r2
            if (r2 == 0) goto L_0x048d
            q23.a r11 = r8.f316592r
            ai2.f r12 = new ai2.f
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            boolean r0 = r8.f316542E
            r12.mo125866h(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r13 = r0.mo152115h()
            java.lang.String r14 = r8.f316541D
            r15 = 0
            r17 = 8
            r18 = 0
            q23.C110351a.m150172z(r11, r12, r13, r14, r15, r17, r18)
            goto L_0x048d
        L_0x0a25:
            if (r10 == 0) goto L_0x0a60
            java.lang.String r0 = "EDIT_CROP_VLOG_LENGTH_START_TIME_LONG"
            long r11 = r10.getLong(r0)
            java.lang.String r0 = "EDIT_CROP_VLOG_LENGTH_END_TIME_LONG"
            long r13 = r10.getLong(r0)
            java.lang.String r0 = "EDIT_CROP_VLOG_SEEKTIME_LONG"
            long r0 = r10.getLong(r0)
            java.lang.String r2 = "EDIT_CROP_VLOG_ON_UP_BOOLEAN"
            boolean r2 = r10.getBoolean(r2)
            if (r2 == 0) goto L_0x0a4d
            r2 = 1
            r3 = 1
            r4 = 0
            r6 = 4
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            goto L_0x0a57
        L_0x0a4d:
            r37.mo152185r()
            l23.j r2 = r37.getMultiPreviewPlugin()
            r2.mo160453L(r0)
        L_0x0a57:
            l23.j r0 = r37.getMultiPreviewPlugin()
            r0.mo160455N(r11, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a60:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0a64:
            l23.j r0 = r37.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            java.util.List r1 = r1.mo134619p()
            r23.a r2 = r8.f316590p0
            int r2 = r2.mo161965x()
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r2)
            com.tencent.mm.plugin.vlog.model.q0 r1 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r1
            if (r1 == 0) goto L_0x0a85
            long r1 = r1.mo152158i()
            goto L_0x0a87
        L_0x0a85:
            r1 = 0
        L_0x0a87:
            r0.mo160454M(r1)
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            r23.a r1 = r8.f316590p0
            int r1 = r1.mo161965x()
            r0.mo152116i(r1)
            l23.q0 r0 = r8.f316565W
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r1 = r1.mo152115h()
            gy3.C87412m.m108591d(r1)
            float r1 = r1.mo152157h()
            r0.mo160471y(r1)
            l23.q0 r0 = r8.f316565W
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder r0 = r0.mo160470x()
            r1 = 1
            r0.setShow(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0ab5:
            r2 = 0
            r11 = 0
            r37.mo152176E()
            q23.a r1 = r8.f316592r
            ai2.a r1 = r1.mo161845C()
            boolean r3 = r1 instanceof ai2.C92023q
            if (r3 == 0) goto L_0x0ac8
            r6 = r1
            ai2.q r6 = (ai2.C92023q) r6
            goto L_0x0ac9
        L_0x0ac8:
            r6 = r11
        L_0x0ac9:
            if (r6 == 0) goto L_0x0b3c
            d23.a r1 = d23.C106976a.f320208a
            com.tencent.mm.xeffect.effect.EffectManager r1 = r1.mo157400d()
            gy3.C87412m.m108591d(r1)
            long r3 = r6.mo125985l()
            rr3.c0 r1 = r1.mo154932l(r3)
            if (r1 == 0) goto L_0x0af3
            ci2.d r3 = r6.mo125862d()
            long r3 = r3.mo146049c()
            ci2.d r5 = r6.mo125862d()
            long r12 = r5.mo146048b()
            r1.mo162189b(r3, r12)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0af3:
            boolean r3 = r1 instanceof rr3.C110644t
            if (r3 == 0) goto L_0x0afb
            r3 = r1
            rr3.t r3 = (rr3.C110644t) r3
            goto L_0x0afc
        L_0x0afb:
            r3 = r11
        L_0x0afc:
            if (r3 == 0) goto L_0x0b1a
            rr3.f r4 = new rr3.f
            float r5 = r6.mo125982i()
            int r5 = (int) r5
            float r7 = r6.mo125983j()
            int r7 = (int) r7
            float r9 = r6.mo125987n()
            float r12 = r6.mo125986m()
            r4.<init>(r5, r7, r9, r12)
            r3.mo162193e(r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0b1a:
            boolean r3 = r1 instanceof rr3.C110646v
            if (r3 == 0) goto L_0x0b21
            rr3.v r1 = (rr3.C110646v) r1
            goto L_0x0b22
        L_0x0b21:
            r1 = r11
        L_0x0b22:
            if (r1 == 0) goto L_0x0b3c
            rr3.g r3 = new rr3.g
            java.lang.String r12 = r6.mo125988o()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 30
            r18 = 0
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r1.mo162194f(r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0b3c:
            q23.a r1 = r8.f316592r
            r1.mo161855M(r2)
            if (r10 == 0) goto L_0x048d
            long r4 = r10.getLong(r0)
            r2 = 1
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0b54:
            r37.mo152184q()
            p23.b r0 = r8.f316555R
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            boolean r1 = r1.mo152121r()
            r2 = 1
            r1 = r1 ^ r2
            com.tencent.mm.plugin.vlog.ui.plugin.timecrop.TimeCropViewGroup r0 = r0.mo161542x()
            r0.setEnableLengthEdit(r1)
            p23.b r0 = r8.f316555R
            q23.a r1 = r8.f316592r
            ai2.a r1 = r1.mo161845C()
            r0.mo161543y(r1)
            q23.a r0 = r8.f316592r
            ai2.a r0 = r0.mo161845C()
            if (r0 == 0) goto L_0x0b92
            ci2.d r0 = r0.mo125862d()
            if (r0 == 0) goto L_0x0b92
            l23.j r1 = r37.getMultiPreviewPlugin()
            long r2 = r0.mo146049c()
            long r4 = r0.mo146048b()
            r1.mo160455N(r2, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0b92:
            p23.b r0 = r8.f316555R
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            r0.mo161544z(r1)
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 7
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0bac:
            r3 = 0
            if (r10 == 0) goto L_0x048d
            r0 = -1
            int r0 = r10.getInt(r11, r0)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            java.util.List r1 = r1.mo134618o()
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r0)
            com.tencent.mm.plugin.vlog.model.q0 r1 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r1
            if (r1 == 0) goto L_0x048d
            l23.j r2 = r37.getMultiPreviewPlugin()
            long r4 = r1.mo152158i()
            r2.mo160454M(r4)
            l23.t0 r2 = r8.f316551N
            r4 = 4
            r2.setVisibility(r4)
            q23.a r2 = r8.f316592r
            long r4 = r1.mo152158i()
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r2 = r2.f330093f
            r2.setSegmentOffset(r4)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.tencent.mm.plugin.vlog.model.f0 r2 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.mo152114g()
            rx3.l r2 = r2.mo134612i()
            java.lang.Object r2 = r2.mo12992b()
            java.lang.Number r2 = (java.lang.Number) r2
            long r6 = r2.longValue()
            r11 = -1
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0c13
            long r4 = r1.mo152158i()
            long r6 = r6 - r4
            float r2 = (float) r6
            float r4 = r1.mo152157h()
            float r2 = r2 * r4
            long r4 = (long) r2
            long r1 = r1.mo152160k()
            long r4 = r4 + r1
        L_0x0c13:
            r14 = r4
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            r1.mo152116i(r0)
            l23.u0 r0 = r8.f316552P
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            boolean r1 = r1.mo152121r()
            r2 = 1
            r1 = r1 ^ r2
            com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView r0 = r0.mo160476x()
            r0.setEnableLengthEdit(r1)
            l23.u0 r11 = r8.f316552P
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r12 = r0.mo152115h()
            gy3.C87412m.m108591d(r12)
            r13 = 0
            r16 = 2
            r17 = 0
            l23.C109235u0.m148334y(r11, r12, r13, r14, r16, r17)
            l23.j r0 = r37.getMultiPreviewPlugin()
            j23.a r1 = r8.f316597w
            if (r1 == 0) goto L_0x0c55
            boolean r1 = r1.mo159392z()
            r0.mo160450H(r1)
            l23.g0 r0 = r8.f316560T0
            r0.mo160429A()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0c55:
            gy3.C87412m.m108603p(r19)
            throw r3
        L_0x0c59:
            if (r10 == 0) goto L_0x048d
            java.lang.String r0 = "EDIT_COMPOSITION_TRACK_INDEX"
            int r0 = r10.getInt(r0)
            java.lang.String r2 = "EDIT_COMPOSITION_LEFT"
            boolean r9 = r10.getBoolean(r2)
            r4 = r34
            long r4 = r10.getLong(r4)
            long r6 = r10.getLong(r1)
            com.tencent.mm.plugin.vlog.model.f0 r2 = r8.f316545H
            r3 = r0
            r2.mo152117j(r3, r4, r6)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            java.util.List r1 = r1.mo134619p()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r1.get(r0)
            com.tencent.mm.plugin.vlog.model.q0 r0 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r0
            r2 = 0
            r3 = 0
            if (r9 == 0) goto L_0x0c92
            long r0 = r0.mo152158i()
            goto L_0x0c96
        L_0x0c92:
            long r0 = r0.mo152156g()
        L_0x0c96:
            r4 = r0
            r6 = 2
            r7 = 0
            r1 = r37
            m142917w(r1, r2, r3, r4, r6, r7)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0ca2:
            r2 = 0
            r3 = 0
            if (r10 == 0) goto L_0x048d
            r37.mo152176E()
            r5 = r36
            boolean r0 = r10.getBoolean(r5)
            if (r0 == 0) goto L_0x0cc1
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            l23.a r1 = r8.f316553Q
            com.tencent.mm.plugin.vlog.model.p0 r4 = r0.mo152114g()
            r1.mo160395A(r4, r2)
            r1 = 1
            r0.mo152110a(r4, r1)
            goto L_0x0cd0
        L_0x0cc1:
            r1 = 1
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            l23.a r2 = r8.f316553Q
            com.tencent.mm.plugin.vlog.model.p0 r4 = r0.mo152114g()
            r2.mo160395A(r4, r1)
            r0.mo152110a(r4, r1)
        L_0x0cd0:
            l23.j r0 = r37.getMultiPreviewPlugin()
            j23.a r1 = r8.f316597w
            if (r1 == 0) goto L_0x0ced
            boolean r1 = r1.mo159392z()
            r0.mo160450H(r1)
            l23.g0 r0 = r8.f316560T0
            r0.mo160429A()
            l23.g0 r0 = r8.f316560T0
            r0.mo160430B()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0ced:
            gy3.C87412m.m108603p(r19)
            throw r3
        L_0x0cf1:
            r0 = r24
            r4 = r34
            r5 = r36
            r2 = 0
            r3 = 0
            r6 = 1
            r8.f316542E = r6
            if (r10 == 0) goto L_0x048d
            java.lang.String r6 = "EDIT_VLOG_TRACK_CROP_CHANGE"
            boolean r6 = r10.getBoolean(r6)
            if (r6 == 0) goto L_0x0d29
            long r4 = r10.getLong(r4)
            long r0 = r10.getLong(r1)
            com.tencent.mm.plugin.vlog.model.f0 r2 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.f316438t
            r2.mo81182a(r4, r0)
            l23.j r0 = r37.getMultiPreviewPlugin()
            j23.a r1 = r8.f316597w
            if (r1 == 0) goto L_0x0d25
            boolean r1 = r1.mo159392z()
            r0.mo160450H(r1)
            goto L_0x0d8d
        L_0x0d25:
            gy3.C87412m.m108603p(r19)
            throw r3
        L_0x0d29:
            r37.mo152176E()
            l23.j r3 = r37.getMultiPreviewPlugin()
            r6 = 0
            r3.mo160454M(r6)
            l23.j r3 = r37.getMultiPreviewPlugin()
            r3.getClass()
            boolean r12 = r10.getBoolean(r5)
            java.lang.String r3 = "EDIT_TRACK_DURATION_CUT_COUNT"
            int r17 = r10.getInt(r3)
            java.lang.String r3 = "EDIT_TRACK_DURATION_SCROLL_COUNT"
            int r18 = r10.getInt(r3)
            long r13 = r10.getLong(r4)
            long r15 = r10.getLong(r1)
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r1 = r1.mo152115h()
            if (r1 == 0) goto L_0x0d62
            long r3 = r1.mo152158i()
            r4 = r3
            goto L_0x0d64
        L_0x0d62:
            r4 = 0
        L_0x0d64:
            com.tencent.mm.plugin.vlog.model.f0 r11 = r8.f316545H
            j23.c r1 = r8.f316583k1
            if (r1 != r0) goto L_0x0d6d
            r19 = 1
            goto L_0x0d6f
        L_0x0d6d:
            r19 = 0
        L_0x0d6f:
            r11.mo152118k(r12, r13, r15, r17, r18, r19)
            q23.a r0 = r8.f316592r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r6 = 0
            r0.setSegmentOffset(r6)
            r2 = 1
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r37
            m142916B(r1, r2, r3, r4, r6, r7)
            j23.c r0 = r8.f316583k1
            r1 = r35
            if (r0 != r1) goto L_0x0d8d
            r37.mo152173A()
        L_0x0d8d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0d91:
            r1 = r35
            r2 = 0
            if (r10 == 0) goto L_0x048d
            r0 = -1
            int r0 = r10.getInt(r11, r0)
            if (r0 < 0) goto L_0x0e04
            r8.f316583k1 = r1
            com.tencent.mm.plugin.vlog.model.f0 r1 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.mo152114g()
            java.util.List r1 = r1.mo134618o()
            java.lang.Object r1 = sx3.C110818d0.m150917O(r1, r0)
            com.tencent.mm.plugin.vlog.model.q0 r1 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r1
            if (r1 == 0) goto L_0x0e04
            l23.b0 r3 = r8.f316563V
            int r3 = r3.mo160404x()
            if (r3 == r0) goto L_0x0e02
            r37.mo152184q()
            com.tencent.mm.plugin.vlog.model.f0 r3 = r8.f316545H
            r3.mo152124u(r1)
            com.tencent.mm.plugin.vlog.model.f0 r3 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r3 = r3.mo152114g()
            long r3 = r3.mo134615l()
            long r5 = r1.mo152158i()
            long r3 = java.lang.Math.max(r3, r5)
            com.tencent.mm.plugin.vlog.model.f0 r5 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r5 = r5.mo152114g()
            long r5 = r5.mo134613j()
            long r11 = r1.mo152156g()
            long r5 = java.lang.Math.min(r5, r11)
            l23.j r1 = r37.getMultiPreviewPlugin()
            r1.mo160455N(r3, r5)
            l23.j r1 = r37.getMultiPreviewPlugin()
            r1.mo160453L(r3)
            l23.b0 r1 = r8.f316563V
            r1.mo160406z(r0)
            l23.b0 r1 = r8.f316563V
            r1.setVisibility(r2)
            r23.a r1 = r8.f316590p0
            r1.mo161962B(r0)
        L_0x0e02:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0e04:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0e08:
            r3 = 0
            if (r10 == 0) goto L_0x0e47
            java.lang.String r0 = "PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE"
            android.os.Parcelable r0 = r10.getParcelable(r0)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r0 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r0
            if (r0 == 0) goto L_0x0e47
            hi2.q r1 = r8.f316557S
            java.lang.String r2 = "start"
            java.lang.String r4 = "select first image"
            r1.mo84844a(r2, r4)
            l23.c0 r1 = r8.f316550M
            if (r1 == 0) goto L_0x0e41
            r1.reset()
            l23.f0 r1 = r8.f316593s
            r1.reset()
            l23.f0 r1 = r8.f316593s
            com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$n r2 = new com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout$n
            r2.<init>(r8, r0)
            r1.getClass()
            android.widget.FrameLayout r0 = r1.f326906f
            l23.f0$c r1 = new l23.f0$c
            r1.<init>(r2)
            r0.post(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0e47
        L_0x0e41:
            java.lang.String r0 = "editPencilPlugin"
            gy3.C87412m.m108603p(r0)
            throw r3
        L_0x0e47:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x048d
        L_0x0e4b:
            r1 = r9
            r2 = 0
            r3 = 0
            r37.mo152184q()
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            java.util.List r0 = r0.mo152119n()
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            int r0 = r0.size()
            r4 = 1
            if (r0 != r4) goto L_0x0e7b
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            r0.mo152116i(r2)
            l23.u0 r11 = r8.f316552P
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.q0 r12 = r0.mo152115h()
            gy3.C87412m.m108591d(r12)
            r13 = 0
            r14 = 0
            r16 = 6
            r17 = 0
            l23.C109235u0.m148334y(r11, r12, r13, r14, r16, r17)
            goto L_0x0e9c
        L_0x0e7b:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            r4 = -1
            r0.mo152116i(r4)
            com.tencent.mm.plugin.vlog.model.f0 r0 = r8.f316545H
            l23.a r4 = r8.f316553Q
            com.tencent.mm.plugin.vlog.model.p0 r5 = r0.mo152114g()
            r4.mo160400y(r5)
            r0.mo152110a(r5, r2)
            l23.a r0 = r8.f316553Q
            com.tencent.mm.plugin.vlog.model.f0 r2 = r8.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.mo152114g()
            long r4 = r8.f316581j
            r0.mo160396B(r2, r4)
        L_0x0e9c:
            l23.j r0 = r37.getMultiPreviewPlugin()
            j23.a r2 = r8.f316597w
            if (r2 == 0) goto L_0x0eb4
            boolean r2 = r2.mo159392z()
            r0.mo160450H(r2)
            l23.g0 r0 = r8.f316560T0
            r0.mo160429A()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x1021
        L_0x0eb4:
            gy3.C87412m.m108603p(r19)
            throw r3
        L_0x0eb8:
            r1 = r9
            r2 = 0
            r3 = 0
            r6 = 0
            if (r10 == 0) goto L_0x0f50
            java.lang.String r0 = "EDIT_SELECT_MUSIC_LYRICS_BOOLEAN"
            boolean r4 = r10.getBoolean(r0)
            java.lang.String r0 = "EDIT_SELECT_MUSIC_LYRICS_LIST"
            android.os.Parcelable r0 = r10.getParcelable(r0)
            com.tencent.mm.plugin.recordvideo.model.audio.LyricsInfo r0 = (com.tencent.p014mm.plugin.recordvideo.model.audio.LyricsInfo) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r0 == 0) goto L_0x0f0c
            java.util.ArrayList r0 = r0.mo151175a()
            java.util.Iterator r9 = r0.iterator()
        L_0x0edc:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0f0a
            java.lang.Object r0 = r9.next()
            byte[] r0 = (byte[]) r0
            te3.cs2 r11 = new te3.cs2
            r11.<init>()
            if (r0 != 0) goto L_0x0ef2
        L_0x0eef:
            r13 = r17
            goto L_0x0f04
        L_0x0ef2:
            r11.parseFrom(r0)     // Catch:{ Exception -> 0x0ef6 }
            goto L_0x0eef
        L_0x0ef6:
            r0 = move-exception
            r12 = r0
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r2] = r12
            java.lang.String r12 = "safeParser"
            r13 = r17
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r12, r13, r0)
        L_0x0f04:
            r5.add(r11)
            r17 = r13
            goto L_0x0edc
        L_0x0f0a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0f0c:
            if (r4 == 0) goto L_0x0f42
            j23.a r0 = r8.f316597w
            if (r0 == 0) goto L_0x0f3e
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r0 = r0.mo159391y()
            ai2.n r12 = new ai2.n
            if (r0 == 0) goto L_0x0f20
            int r0 = r0.mo80741d()
            long r2 = (long) r0
            goto L_0x0f21
        L_0x0f20:
            r2 = r6
        L_0x0f21:
            r12.<init>((java.util.List<? extends te3.C49044cs2>) r5, (long) r2)
            q23.a r0 = r8.f316592r
            r0.getClass()
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r2 = r25
            r0.mo152268n(r2)
            q23.a r11 = r8.f316592r
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 12
            r18 = 0
            q23.C110351a.m150172z(r11, r12, r13, r14, r15, r17, r18)
            goto L_0x0f4e
        L_0x0f3e:
            gy3.C87412m.m108603p(r19)
            throw r3
        L_0x0f42:
            r2 = r25
            q23.a r0 = r8.f316592r
            r0.getClass()
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r0.mo152268n(r2)
        L_0x0f4e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0f50:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x1021
        L_0x0f54:
            r1 = r9
            r3 = 1
            r8.f316573d1 = r3
            r37.mo152184q()
            l23.g r0 = r8.f316549L
            r4 = 4
            r0.setVisibility(r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x1021
        L_0x0f65:
            r1 = r9
            r0 = r21
            r2 = 0
            r3 = 1
            r4 = 4
            if (r10 == 0) goto L_0x1021
            int r0 = r10.getInt(r0)
            if (r0 == r3) goto L_0x0fa9
            r5 = 2
            if (r0 == r5) goto L_0x0f92
            r5 = 3
            if (r0 == r5) goto L_0x0f87
            if (r0 == r4) goto L_0x0f7c
            goto L_0x0fc4
        L_0x0f7c:
            l23.d0 r0 = r8.f316562U0
            r0.mo160416z(r2)
            l23.d0 r0 = r8.f316562U0
            r0.mo160413D(r3)
            goto L_0x0fc4
        L_0x0f87:
            l23.d0 r0 = r8.f316562U0
            r0.mo160416z(r2)
            l23.d0 r0 = r8.f316562U0
            r0.mo160413D(r2)
            goto L_0x0fc4
        L_0x0f92:
            l23.i0 r0 = r8.f316556R0
            r2 = 4
            r0.setVisibility(r2)
            l23.y0 r0 = r8.f316558S0
            r0.setVisibility(r2)
            l23.j r0 = r37.getMultiPreviewPlugin()
            r0.mo160448F()
            r3 = 1
            r8.mo152192z(r3)
            goto L_0x0fc4
        L_0x0fa9:
            l23.i0 r0 = r8.f316556R0
            r0.setVisibility(r2)
            l23.y0 r0 = r8.f316558S0
            r0.setVisibility(r2)
            l23.j r0 = r37.getMultiPreviewPlugin()
            r0.mo160447E()
            l23.d0 r0 = r8.f316562U0
            r0.mo160416z(r3)
            l23.d0 r0 = r8.f316562U0
            r0.mo160413D(r2)
        L_0x0fc4:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x1021
        L_0x0fc7:
            r1 = r9
            r3 = 0
            if (r10 == 0) goto L_0x0fec
            r37.mo152185r()
            java.lang.CharSequence r0 = r10.getCharSequence(r7)
            int r2 = r10.getInt(r12)
            int r4 = r10.getInt(r15)
            java.lang.String r5 = r10.getString(r14)
            lh2.i r6 = r8.f316595u
            if (r6 == 0) goto L_0x0fe8
            r6.mo160546x(r0, r2, r4, r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0fec
        L_0x0fe8:
            gy3.C87412m.m108603p(r13)
            throw r3
        L_0x0fec:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x1021
        L_0x0fef:
            r1 = r9
            r37.mo78564e()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x1021
        L_0x0ff6:
            r13 = r6
            r1 = r9
            if (r10 == 0) goto L_0x1021
            java.lang.String r0 = "EDIT_FILTER_INDEX_INT"
            r2 = -1
            r10.getInt(r0, r2)
            r0 = 0
            java.lang.String r2 = "EDIT_FILTER_COLOR_WEIGHT_FLOAT"
            float r0 = r10.getFloat(r2, r0)
            java.lang.String r2 = "EDIT_FILTER_COLOR_PATH_STRING"
            java.lang.String r2 = r10.getString(r2)
            l23.j r3 = r37.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.model.p0 r3 = r3.mo160462z()
            if (r3 == 0) goto L_0x1021
            if (r2 != 0) goto L_0x101b
            r6 = r13
            goto L_0x101c
        L_0x101b:
            r6 = r2
        L_0x101c:
            r3.mo134624u(r6, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x1021:
            java.lang.Class<y23.i> r0 = y23.C112389i.class
            lh2.g0 r0 = r8.mo151221j(r0)
            y23.i r0 = (y23.C112389i) r0
            if (r0 == 0) goto L_0x1030
            r0.mo14585p(r1, r10)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x1030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }

    /* renamed from: q */
    public final void mo152184q() {
        this.f316601y0.setVisibility(8);
        this.f316558S0.getClass();
        C106976a aVar = C106976a.f320208a;
        View view = this.f316564V0;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(4);
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f316566W0;
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(4);
        View view3 = view2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/vlog/ui/MultiVideoFullScreenPluginLayout", "hideOperation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getMultiPreviewPlugin().f326967g.setStyle(WxCropOperationLayout.C94436h.RECT_HARD);
        this.f316549L.setVisibility(4);
        if (C106216c.f316604a[this.f316583k1.ordinal()] == 1) {
            this.f316563V.setVisibility(8);
            this.f316590p0.setVisibility(0);
        }
    }

    /* renamed from: r */
    public final void mo152185r() {
        if (!this.f316545H.f316429h || this.f316571b1) {
            VideoCompositionPlayView videoCompositionPlayView = getMultiPreviewPlugin().f326970j;
            if (videoCompositionPlayView != null) {
                videoCompositionPlayView.pause();
            }
            this.f316551N.f327035h.f317020d.mo17155w1();
            C109202j.C99301e eVar = getMultiPreviewPlugin().f326959D;
            if (eVar != null) {
                eVar.pause();
            }
            this.f316560T0.mo160433z();
        }
    }

    public void release() {
        super.release();
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "release");
        this.f316545H.dead();
        C106976a.f320208a.mo157410n();
        SparseArray<C97942y> sparseArray = C97944z.f287281a;
        List<String> list = C97592a.f286326a;
        C97944z.f287281a.remove(108);
        C110803f.f331490g.mo162371a();
    }

    public void reset() {
        super.reset();
        this.f316578h1 = WxCropOperationLayout.C94436h.RECT_ADJUST;
        setBackgroundColor(0);
        C106976a.f320208a.mo157403g();
    }

    public final void setCurrentStyle(WxCropOperationLayout.C94436h hVar) {
        C87412m.m108594g(hVar, "<set-?>");
        this.f316578h1 = hVar;
    }

    public final void setMultiPreviewPlugin(C109202j jVar) {
        C87412m.m108594g(jVar, "<set-?>");
        this.f316548K = jVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setupImageEditPlugins(boolean r12) {
        /*
            r11 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setupImageEditPlugins, selectFirst:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            l23.i0 r0 = r11.f316556R0
            r1 = 0
            r0.setVisibility(r1)
            l23.m0 r0 = r11.f316554Q0
            r2 = 8
            r0.setVisibility(r2)
            l23.j r0 = r11.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r0 = r0.f326970j
            if (r0 == 0) goto L_0x002e
            r0.stop()
        L_0x002e:
            l23.j r0 = r11.getMultiPreviewPlugin()
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r0 = r0.f326970j
            if (r0 != 0) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            r0.setVisibility(r2)
        L_0x003a:
            q23.a r0 = r11.f316592r
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            r0.setVisibility(r1)
            r11.f316571b1 = r1
            l23.j r0 = r11.getMultiPreviewPlugin()
            com.tencent.mm.plugin.vlog.ui.widget.MultiEditCropOperationLayout r0 = r0.f326967g
            com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout$h r2 = com.tencent.p014mm.plugin.recordvideo.p095ui.WxCropOperationLayout.C94436h.RECT_ADJUST
            r0.setStyle(r2)
            r11.f316578h1 = r2
            r11.mo152175D()
            boolean r0 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39113b()
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r11.f316547J
            if (r0 != 0) goto L_0x00b8
            j23.a r2 = r11.f316597w
            java.lang.String r0 = "addMusicPlugin"
            r10 = 0
            if (r2 == 0) goto L_0x00b4
            h90.b r3 = r11.f316544G
            gy3.C87412m.m108591d(r3)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r4 = r11.f316543F
            r5 = 0
            boolean r6 = r11.f316546I
            com.tencent.mm.plugin.vlog.model.f0 r7 = r11.f316545H
            boolean r7 = r7.f316429h
            r8 = 4
            r9 = 0
            j23.C108531a.m147079H(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r2)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_finder_edit_image_auto_add_music_panel
            int r3 = r3.mo58779Qe(r4, r1)
            r4 = 1
            if (r3 != r4) goto L_0x00a3
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_finder_edit_image_auto_add_music
            int r2 = r2.mo58779Qe(r3, r4)
            if (r2 != r4) goto L_0x009e
            boolean r2 = com.tencent.p014mm.plugin.vlog.model.C30517h0.m39113b()
            if (r2 == 0) goto L_0x009e
            r2 = 1
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            if (r2 == 0) goto L_0x00a3
            r2 = 1
            goto L_0x00a4
        L_0x00a3:
            r2 = 0
        L_0x00a4:
            if (r2 == 0) goto L_0x00b8
            j23.a r2 = r11.f316597w
            if (r2 == 0) goto L_0x00b0
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView r0 = r2.f324878j
            r0.setShow(r4)
            goto L_0x00b8
        L_0x00b0:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x00b4:
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x00b8:
            if (r12 == 0) goto L_0x00bb
            goto L_0x00c1
        L_0x00bb:
            l23.g r12 = r11.f316549L
            int r1 = r12.mo86110x()
        L_0x00c1:
            l23.g r12 = r11.f316549L
            r12.mo86111y(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.setupImageEditPlugins(boolean):void");
    }

    /* renamed from: t */
    public final void mo152189t(boolean z, boolean z2, long j) {
        C13604l<Long, Long> i = this.f316545H.f316438t.mo134612i();
        List<C13605o<String, Long, Long>> allTTSData = this.f316592r.f330093f.getAllTTSData();
        this.f316545H.mo152113f(this.f316545H.f316438t.mo134618o(), allTTSData);
        if (!(((Number) i.f38555d).longValue() == -1 || ((Number) i.f38556e).longValue() == -1)) {
            this.f316545H.f316438t.mo81182a(((Number) i.f38555d).longValue(), Math.min(((Number) i.f38556e).longValue(), this.f316545H.f316438t.getDurationMs()));
        }
        C109202j multiPreviewPlugin = getMultiPreviewPlugin();
        C108531a aVar = this.f316597w;
        if (aVar != null) {
            multiPreviewPlugin.mo160451I(aVar.mo159392z(), z, z2, j);
            if (z) {
                this.f316560T0.mo160429A();
            } else {
                this.f316560T0.mo160433z();
            }
        } else {
            C87412m.m108603p("addMusicPlugin");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01de  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo152190x() {
        /*
            r7 = this;
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            l23.t0 r1 = r7.f316551N
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r1 = r1.f327035h
            int r1 = r1.getScrollCount()
            long r1 = (long) r1
            r0.f310228r = r1
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            l23.j r1 = r7.getMultiPreviewPlugin()
            int r1 = r1.f326980w
            long r1 = (long) r1
            r0.f310227q = r1
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            com.tencent.mm.plugin.vlog.model.f0 r1 = r7.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r1 = r1.f316438t
            long r1 = r1.mo134616m()
            r3 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0032
            r1 = 1
            goto L_0x0034
        L_0x0032:
            r1 = 0
        L_0x0034:
            r0.f310229s = r1
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            q23.a r1 = r7.f316592r
            com.tencent.mm.plugin.vlog.model.f0 r2 = r7.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.f316438t
            java.util.List r2 = r2.mo134618o()
            com.tencent.mm.plugin.vlog.model.f0 r3 = r7.f316545H
            boolean r3 = r3.f316429h
            java.lang.String r1 = r1.mo161854L(r2, r3)
            java.lang.String r2 = "TextInfo"
            r3 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f310233w = r1
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            q23.a r1 = r7.f316592r
            com.tencent.mm.plugin.vlog.model.f0 r2 = r7.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.f316438t
            java.util.List r2 = r2.mo134618o()
            com.tencent.mm.plugin.vlog.model.f0 r4 = r7.f316545H
            boolean r4 = r4.f316429h
            java.lang.String r1 = r1.mo161853K(r2, r4)
            java.lang.String r2 = "EmojiInfo"
            java.lang.String r1 = r0.mo86045b(r2, r1, r3)
            r0.f310234x = r1
            com.tencent.mm.plugin.vlog.model.f0 r0 = r7.f316545H
            boolean r0 = r0.f316429h
            r1 = 0
            if (r0 != 0) goto L_0x00bd
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            m23.c r2 = r7.f316598x
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = r2.mo160712D()
            java.lang.String r4 = "CaptionInfo"
            java.lang.String r2 = r0.mo86045b(r4, r2, r3)
            r0.f310232v = r2
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            com.tencent.mm.plugin.vlog.model.f0 r2 = r7.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.f316438t
            java.lang.String r2 = r2.mo134621r()
            java.lang.String r4 = "TransitionInfo"
            java.lang.String r2 = r0.mo86045b(r4, r2, r3)
            r0.f310235y = r2
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            com.tencent.mm.plugin.vlog.model.f0 r2 = r7.f316545H
            com.tencent.mm.plugin.vlog.model.p0 r2 = r2.f316438t
            java.lang.String r2 = r2.mo134620q()
            java.lang.String r4 = "TrSpeedInfo"
            java.lang.String r2 = r0.mo86045b(r4, r2, r3)
            r0.f310236z = r2
            goto L_0x00bd
        L_0x00b7:
            java.lang.String r0 = "captionPlugin"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x00bd:
            th2.c r0 = r7.f316580i1
            com.tencent.mm.plugin.vlog.model.f0 r2 = r7.f316545H
            java.util.LinkedList<com.tencent.mm.plugin.vlog.model.q0> r2 = r2.f316428g
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x00d2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00e4
            java.lang.Object r5 = r2.next()
            com.tencent.mm.plugin.vlog.model.q0 r5 = (com.tencent.p014mm.plugin.vlog.model.C106205q0) r5
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo$EditItem r5 = r5.f316500k
            r4.add(r5)
            goto L_0x00d2
        L_0x00e4:
            com.tencent.mm.plugin.vlog.model.f0 r2 = r7.f316545H
            boolean r2 = r2.f316429h
            r0.mo162666b(r4, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "reportEdit19904, isVideoEnhancementEnable:"
            r0.append(r2)
            boolean r2 = r7.f316585m1
            r0.append(r2)
            java.lang.String r2 = ", VideoTrackLabel:"
            r0.append(r2)
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Integer, java.lang.Long>> r2 = d23.C106976a.f320219l
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.MultiVideoFullScreenPluginLayout"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            th2.c r0 = r7.f316580i1
            boolean r2 = r7.f316585m1
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Integer, java.lang.Long>> r4 = d23.C106976a.f320219l
            r0.mo162667c(r2, r4)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r0 = r7.f316543F
            if (r0 == 0) goto L_0x0127
            android.os.Bundle r0 = r0.f272912M
            if (r0 == 0) goto L_0x0127
            java.lang.String r2 = "key_beauty_config"
            android.os.Parcelable r0 = r0.getParcelable(r2)
            com.tencent.mm.plugin.xlabeffect.XEffectConfig r0 = (com.tencent.p014mm.plugin.xlabeffect.XEffectConfig) r0
            goto L_0x0128
        L_0x0127:
            r0 = r1
        L_0x0128:
            th2.c r2 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r2 = r2.f332424a
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = r0.f318439I
            goto L_0x0132
        L_0x0131:
            r0 = r1
        L_0x0132:
            java.lang.String r4 = "BeautyInfo"
            java.lang.String r0 = r2.mo86045b(r4, r0, r3)
            r2.f310212C = r0
            th2.c r0 = r7.f316580i1
            com.tencent.mm.autogen.mmdata.rpt.MultiMediaEditInfoStruct r0 = r0.f332424a
            r0.mo86054n()
            th2.c r0 = r7.f316580i1
            r0.mo162665a()
            com.tencent.mm.plugin.vlog.model.f0 r0 = r7.f316545H
            java.util.LinkedList<com.tencent.mm.plugin.vlog.model.q0> r0 = r0.f316428g
            int r0 = r0.size()
            r2 = 0
            if (r0 != r3) goto L_0x0152
            goto L_0x016c
        L_0x0152:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r7.f316545H
            boolean r4 = r0.f316430i
            if (r4 == 0) goto L_0x015a
            r0 = 2
            goto L_0x016f
        L_0x015a:
            boolean r4 = r0.f316429h
            if (r4 == 0) goto L_0x0166
            boolean r0 = r0.mo152121r()
            if (r0 == 0) goto L_0x0166
            r0 = 1
            goto L_0x016f
        L_0x0166:
            com.tencent.mm.plugin.vlog.model.f0 r0 = r7.f316545H
            boolean r0 = r0.f316429h
            if (r0 == 0) goto L_0x016e
        L_0x016c:
            r0 = 0
            goto L_0x016f
        L_0x016e:
            r0 = 3
        L_0x016f:
            th2.d r4 = th2.C110992d.f332425a
            q23.a r5 = r7.f316592r
            int r5 = r5.mo161847E()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "KEY_ADD_EMOJI_COUNT_INT"
            r4.mo162677k(r6, r5)
            q23.a r5 = r7.f316592r
            int r5 = r5.mo161849G()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "KEY_ADD_TEXT_COUNT_INT"
            r4.mo162677k(r6, r5)
            j23.a r5 = r7.f316597w
            java.lang.String r6 = "addMusicPlugin"
            if (r5 == 0) goto L_0x01de
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo r5 = r5.f324881p
            if (r5 != 0) goto L_0x019a
            goto L_0x019b
        L_0x019a:
            r2 = 1
        L_0x019b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "KEY_SELECT_MUSIC_INT"
            r4.mo162677k(r5, r2)
            j23.a r2 = r7.f316597w
            if (r2 == 0) goto L_0x01da
            boolean r1 = r2.mo159392z()
            r1 = r1 ^ r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "KEY_SELECT_ORIGIN_INT"
            r4.mo162677k(r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = "KEY_AFTER_EDIT_INT"
            r4.mo162677k(r2, r1)
            java.lang.String r1 = r7.f316574e1
            java.lang.String r2 = "KEY_MULTI_MEDIA_POST_ID_STRING"
            r4.mo162677k(r2, r1)
            java.lang.String r1 = r7.f316575f1
            java.lang.String r2 = "KEY_MULTI_MEDIA_EDIT_ID_STRING"
            r4.mo162677k(r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "KEY_VIDEO_SUB_TYPE_INT"
            r4.mo162677k(r1, r0)
            r4.mo162672f()
            return
        L_0x01da:
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x01de:
            gy3.C87412m.m108603p(r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.MultiVideoFullScreenPluginLayout.mo152190x():void");
    }

    /* renamed from: y */
    public final void mo152191y(long j) {
        Log.m105924i("MicroMsg.MultiVideoFullScreenPluginLayout", "reportEdit20741Image, isVideoEnhancementEnable:" + this.f316585m1);
        long j2 = 1;
        long j3 = this.f316572c1 ? 1 : 4;
        C97822c cVar = new C97822c();
        ArrayList<C92007a> D = this.f316592r.mo161846D();
        MultiMediaEditResultStruct multiMediaEditResultStruct = cVar.f286970a;
        multiMediaEditResultStruct.f265739d = multiMediaEditResultStruct.mo86045b("EditId", this.f316575f1, true);
        cVar.f286970a.f265749n = (long) NetStatusUtil.getIOSNetType(getContext());
        MultiMediaEditResultStruct multiMediaEditResultStruct2 = cVar.f286970a;
        multiMediaEditResultStruct2.f265753r = 2;
        multiMediaEditResultStruct2.f265742g = (long) this.f316545H.f316425d.size();
        cVar.f286970a.f265746k = j3;
        cVar.mo137156c(D);
        MultiMediaEditResultStruct multiMediaEditResultStruct3 = cVar.f286970a;
        multiMediaEditResultStruct3.f265745j = j;
        if (!this.f316585m1) {
            j2 = 0;
        }
        multiMediaEditResultStruct3.f265748m = j2;
        mo152181m(multiMediaEditResultStruct3);
        cVar.mo137154a();
    }

    /* renamed from: z */
    public final void mo152192z(boolean z) {
        long j;
        FinderPostPagePreviewStruct finderPostPagePreviewStruct = C98592b.f289085a;
        FinderPostPagePreviewStruct finderPostPagePreviewStruct2 = C98592b.f289085a;
        finderPostPagePreviewStruct2.f265588d = finderPostPagePreviewStruct2.mo86045b("PostId", this.f316574e1, true);
        finderPostPagePreviewStruct2.f265589e = finderPostPagePreviewStruct2.mo86045b("EditId", this.f316575f1, true);
        int i = 0;
        finderPostPagePreviewStruct2.f265590f = (long) 0;
        long j2 = 0;
        if (this.f316545H.f316429h) {
            ArrayList<GalleryItem$MediaItem> arrayList = this.f316576g1;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                for (GalleryItem$MediaItem galleryItem$MediaItem : arrayList) {
                    if ((galleryItem$MediaItem instanceof GalleryItem$ImageMediaItem) && (i = i + 1) < 0) {
                        C64197v.m75541j();
                        throw null;
                    }
                }
            }
            j = (long) i;
        } else {
            j = 0;
        }
        finderPostPagePreviewStruct2.f265591g = j;
        C106195f0 f0Var = this.f316545H;
        if (!f0Var.f316429h) {
            j2 = f0Var.f316438t.getDurationMs();
        }
        finderPostPagePreviewStruct2.f265592h = j2;
        finderPostPagePreviewStruct2.f265593i = z ? 2 : 1;
        finderPostPagePreviewStruct2.f265594j = 1;
        finderPostPagePreviewStruct2.mo86054n();
    }
}
